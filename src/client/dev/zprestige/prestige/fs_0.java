/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.dV;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 * Renamed from dev.zprestige.prestige.fs
 */
public class fs_0
extends dV {
    private static final Object[] k = new Object[37];
    private static final String[] l = new String[37];

    static {
        fs_0.f();
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fs" + " : " + string + " : " + methodType.toString(), exception);
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
            int n = fs_0.m(l, l2);
            object = k[n];
            try {
                if (!(object instanceof String)) break block2;
                fs_0.k[n] = clazz = Class.forName(fs_0.l[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fs_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fs_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fs_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fs_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = k;
        k[0] = "r/\u0010>INl'\nq.O}<\u0007+\bI";
        objectArray[1] = "e,oR_?n#~\u001d>1e(zG";
        objectArray[2] = "7Sx\tTa!S}SGv6\u0018~UKb'_iB\u0000p\u001b";
        objectArray[3] = "4?gSs\u0002A\u001fl\\bM<\u0007\u007f[k\u0004T";
        objectArray[4] = " m>j0\u00146m;0#\u0003!&86/\u00170a/!d\u0007(a-*>J\u0014z-7>\r#m";
        objectArray[5] = "\u0003Cp\u001a/m\u0015Cu@<z\u0002\bvF0n\u0013OaQ{~-";
        objectArray[6] = "m\u001d\u0010\u0013\u007f\u0001m\u001d\u0007Os\u000ewV\u0007Qs\u001bp'W\f\"";
        objectArray[7] = "w=b8\u000b^w=ud\u0007Qmvuz\u0007Dj\u0007\"%Q";
        objectArray[8] = Void.TYPE;
        fs_0.l[8] = "java/lang/Void";
        objectArray[9] = "%,R9KQ3,WcXF$gTeTR5 Cr\u001fE\u0017";
        objectArray[10] = Boolean.TYPE;
        fs_0.l[10] = "java/lang/Boolean";
        objectArray[11] = "@h(\u0004\u001e\u0004Kg9Ky\u0006^l9\u0000B";
        objectArray[12] = Integer.TYPE;
        fs_0.l[12] = "java/lang/Integer";
        objectArray[13] = "p\u0011s49sn\u0019i{[oi\u0004";
        objectArray[14] = "tZ6\u0019D\u0002\u0001z=\u0016UM`t6\u001dQ\u0017\u0014";
        objectArray[15] = "%i!y!\u00103i$#2\u0007$\"'%>\u00135e02u\u0004\r";
        objectArray[16] = "_Jt^&J*j\u007fQ7\u0005KdtZ3_?";
        objectArray[17] = "S^uRv\u0014E^p\be\u0003R\u0015s\u000ei\u0017CRd\u0019\"\u0002D";
        objectArray[18] = "J\"<nspA--!\u0010}T \"J%\u007fE3>f2r";
        objectArray[19] = "lBh\r\ng\u0019bc\u0002\u001b(xlh\t\u001fr\f";
        objectArray[20] = ";W\u001dS\u0016/-W\u0018\t\u00058:\u001c\u001b\u000f\t,+[\f\u0018B;\u0014";
        objectArray[21] = "}x=\u00168\u001a(,zt`\u000fa4\u0001M9Z!2s\u001eo[{H";
        objectArray[22] = "\u0002k2\u0017]W\ns<W7^;,+P\\E\\k-\tE4";
        objectArray[23] = "a`rwTi>0'z1|Zg*\u007fR/79$7V";
        objectArray[24] = "]Dra\u0018\u001c\fAt;%\u0018\f^)lI*X\u001fq4%@\n^5eF\u0004\u001a@ \u000b\u001b@[F\"hZ\u0013[XI";
        objectArray[25] = "R\u001c?\u0015l[\f\u0012-P\u0007\flJuLj\u0014\u0013ErY\u007fe";
        objectArray[26] = "\u000e9AC\u0011\u001bQi\u0014Nt\u001d5:B\u0016\u0019\u0013J5E\u0003\f";
        objectArray[27] = "\\;)j ,\f\u007fhrC/\u0005c(m\u0004?l74ixi\u0014}%ezQ\\;)j ,\f\u007fhrC";
        objectArray[28] = "G\u001aC=x3\u0019\u0014\u000b9G7|KG%,n\u0010\u001c\b8z^";
        objectArray[29] = " zU.\tSu.\u0012LWB7\f\u0004<K+sq\r!FT|v\u001847";
        objectArray[30] = "\u0010m\u001f\bE&Nc\rM.r.h\u000bQP)Q{\u001cX\u0016\u0018Ga\u0015UV#Wb\u0002J.";
        objectArray[31] = "?WP\u00000'aYBE[p\u0001RDY%(~ASPc\u0019?\u0003\u001bY0z~P\u001bG[";
        objectArray[32] = "3.i3\\Qdatel\\~~h1\u0010Zx\u0013~hP_<k+<\u0017=";
        objectArray[33] = "8?YQ\u001f\\j~CU}ISdWS\rDl4\u0016I\u0016 8~\\Y\u0019\u001fh?FB}";
        objectArray[34] = "p\u001a\u0013\u0015\u0005@.\u0014\u0001Pn\u0015N\u001f\u0007L\u0010O1\f\u0010EV~pNXL\u0005\u001d1\u001dXRn";
        objectArray[35] = "\u0018{\u0002m\u00060FuJi94#*\u0006uRmO}Ih\u0004]\u001d&\u0001jR>\\u\u0001t9";
        Object[] objectArray2 = objectArray;
        objectArray[36] = "+\u0007q\u001dq{;P1\u0000\u000bkF\u0002rJ;x4Q$Ka\u0002x\u0006w\u0016`a9Uw\b\u000b";
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'O' || c == 'm' || c == '\u00cb' || c == '\u00a5') {
                field = fs_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'O' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'm' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00cb' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fs_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'B' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'z' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = fs_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public void d(Object[] objectArray) {
        block7: {
            long l = (Long)objectArray[0];
            long l2 = l;
            long l3 = l2 ^ 0x148CA4297AAAL;
            long l4 = l2 ^ 0x30CC86F6E376L;
            CallSite callSite = fs_0.b("z", (long)3243667157516174550L, (long)l);
            fs_0.b("\u00a5", (boolean)true, (long)3242831917301033457L, (long)l);
            fs_0.b("B", (Object)b, null, (long)3242674648582192115L, (long)l);
            CallSite callSite2 = callSite;
            CallSite callSite3 = fs_0.b("B", (Object)fs_0.b("B", (Object)fs_0.b("\u00cb", (long)3243594402626166073L, (long)l), (long)3242956237269273296L, (long)l), (long)3246648036404564811L, (long)l);
            while (fs_0.b("B", (Object)callSite3, (long)3242919864021897006L, (long)l) != false) {
                dV dV2;
                block8: {
                    dV dV3;
                    block9: {
                        dV3 = (dV)((Object)fs_0.b("B", (Object)callSite3, (long)3243487510059962021L, (long)l));
                        try {
                            try {
                                try {
                                    if (callSite2 != null) break block7;
                                    dV2 = dV3;
                                    if (callSite2 != null) break block8;
                                }
                                catch (MatchException matchException) {
                                    throw fs_0.b("z", (Object)matchException, (long)3246598698141104477L, (long)l);
                                }
                                if (fs_0.b("B", (Object)dV2, (long)3242605688208536477L, (long)l) == false) break block9;
                            }
                            catch (MatchException matchException) {
                                throw fs_0.b("z", (Object)matchException, (long)3246598698141104477L, (long)l);
                            }
                            Object[] objectArray2 = new Object[1];
                            objectArray2[0] = l3;
                            fs_0.b("B", (Object)dV3, (Object)objectArray2, (long)3243019404309864228L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw fs_0.b("z", (Object)matchException, (long)3246598698141104477L, (long)l);
                        }
                    }
                    Object[] objectArray3 = new Object[1];
                    objectArray3[0] = l4;
                    fs_0.b("B", (Object)dV3, (Object)objectArray3, (long)3246786484526083729L, (long)l);
                    dV2 = dV3;
                }
                fs_0.b("B", (Object)fs_0.b("B", (Object)dV2, (Object)new Object[0], (long)3243126205728198327L, (long)l), (Object)fs_0.b("z", (int)-1, (long)3242732881762327291L, (long)l), (long)3246941560233539514L, (long)l);
                if (callSite2 == null) continue;
            }
            fs_0.b("B", (Object)fs_0.b("\u00cb", (long)3243594402626166073L, (long)l), new ArrayList(), (long)3246733660249331849L, (long)l);
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (fs_0.l[n3] != null) {
            return n3;
        }
        Object object = k[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 56;
            case 1 -> 2;
            case 2 -> 50;
            case 3 -> 27;
            case 4 -> 15;
            case 5 -> 24;
            case 6 -> 55;
            case 7 -> 40;
            case 8 -> 37;
            case 9 -> 19;
            case 10 -> 10;
            case 11 -> 47;
            case 12 -> 38;
            case 13 -> 0;
            case 14 -> 42;
            case 15 -> 59;
            case 16 -> 51;
            case 17 -> 8;
            case 18 -> 18;
            case 19 -> 43;
            case 20 -> 57;
            case 21 -> 5;
            case 22 -> 61;
            case 23 -> 6;
            case 24 -> 3;
            case 25 -> 23;
            case 26 -> 49;
            case 27 -> 60;
            case 28 -> 46;
            case 29 -> 44;
            case 30 -> 26;
            case 31 -> 14;
            case 32 -> 54;
            case 33 -> 30;
            case 34 -> 31;
            case 35 -> 35;
            case 36 -> 52;
            case 37 -> 21;
            case 38 -> 33;
            case 39 -> 22;
            case 40 -> 9;
            case 41 -> 13;
            case 42 -> 41;
            case 43 -> 20;
            case 44 -> 7;
            case 45 -> 45;
            case 46 -> 62;
            case 47 -> 12;
            case 48 -> 29;
            case 49 -> 16;
            case 50 -> 58;
            case 51 -> 1;
            case 52 -> 53;
            case 53 -> 4;
            case 54 -> 32;
            case 55 -> 28;
            case 56 -> 48;
            case 57 -> 11;
            case 58 -> 34;
            case 59 -> 63;
            case 60 -> 39;
            case 61 -> 25;
            case 62 -> 17;
            default -> 36;
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
        fs_0.l[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = fs_0.m(l, l2);
        Object object = k[n];
        if (object instanceof String) {
            String string = fs_0.l[n];
            int n2 = string.indexOf(8);
            Class clazz = fs_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fs_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fs_0.g(clazz3, string2, clazz2)) != null) {
                    fs_0.k[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fs_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fs_0.k[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fs_0.n(121326832178831L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = fs_0.m(l, l2);
        Object object = k[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = fs_0.l[n];
                int n3 = string2.indexOf(8);
                clazz3 = fs_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fs_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fs_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        fs_0.k[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fs_0.n(121326832178831L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fs_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fs_0.k[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fs_0.n(121326832178831L, 0L);
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
            return MethodHandles.lookup().findStatic(fs_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


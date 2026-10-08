/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1511
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aK;
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
import net.minecraft.class_1511;

public class eD
extends dV {
    private static final long k = hc.a(7209037370114055963L, 8728924628862883385L, MethodHandles.lookup().lookupClass()).a(232729504420484L);
    private static final Object[] l = new Object[27];
    private static final String[] m = new String[27];

    static {
        eD.f();
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/eD" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = eD.m(l, l2);
            object = eD.l[n];
            try {
                if (!(object instanceof String)) break block2;
                eD.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = eD.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = eD.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = eD.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = eD.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = l;
        l[0] = "\u0011K\r %\u001b\u0007K\bz6\f\u0010\u0000\u000b|:\u0018\u0001G\u001ckq\u000e1";
        objectArray[1] = "QZX}\u000e_ZUI2mROXFYXP^KZuO]";
        objectArray[2] = "k\rTn>;}\rQ4-,jFR2!8{\u0001E%j*G";
        objectArray[3] = "J^0~GF?~;qV\tBf(v_@*";
        objectArray[4] = "VA'aW\u000e@A\";D\u0019W\n!=H\rFM6*\u0003\u001fy";
        objectArray[5] = ",g 0shYG+?b'8I 4f}L";
        objectArray[6] = "\u0006qoT\u001fZ\u0006qx\b\u0013U\u001c:x\u0016\u0013@\u001bK*HK\u0004";
        objectArray[7] = "\u0003k=\\\u001c\u0005\u0003k*\u0000\u0010\n\u0019 *\u001e\u0010\u001f\u001eQzCA";
        objectArray[8] = "Tqyv\u0006%Tqn*\n*N:n4\n?IK:l]";
        objectArray[9] = ")\u000eM\u0016]\u0010)\u000eZJQ\u001f3EZTQ\n44\b\n\tNc\bUYC\n\u0018^\f\n\t";
        objectArray[10] = Void.TYPE;
        eD.m[10] = "java/lang/Void";
        objectArray[11] = "):.$D\u001f):9xH\u00103q9fH\u00054\u0000k8\u0010B";
        objectArray[12] = "\u001b\u000f|FB'\u001b\u000fk\u001aN(\u0001Dk\u0004N=\u00065>P\u0017~";
        objectArray[13] = "C\u0010u*\u001dvC\u0010bv\u0011yY[bh\u0011l^*06I,";
        objectArray[14] = "Fg\u0007*o=Xo\u001de\u0012-X";
        objectArray[15] = "3@lhdS8O}'\u0005]3Dy}";
        objectArray[16] = "~\u0018,s]c~F6\u001fV\u0000mF6!Unm\u0001j\u001fM=yE:qMz%{";
        objectArray[17] = "\u0014\u001fGdoVAN\\5\u0006\r.\u001dKei\bNYX*kg";
        objectArray[18] = "G0_\rL\u0002\b1[\u001dt^\u0014pC\u001a\u0018lG5\u001aGt\u000b\u0003gYC\u000e\u0004\u001c=[}E\u0001\u0016n\u001a\u0010\u001f@Cp#";
        objectArray[19] = "\u0015VQO\u001f$\u0015\nGQ`..S\u0012\u0004\u001d(H\u000e\u0015D\u000eG\u0012\u0003VT\u00026A\u0003\u0014@`";
        objectArray[20] = "1s\u000f=dMu`\u0011f\tAms\u0011j^\u00163$I\u00067\u0013pnM?x\u0012t~";
        objectArray[21] = "\u0005H\u0002\u0011\u0011B[G^\u0000(\u0016ZE\u000b\u0005\u007fB\u0005\u0019^Y(F[E\u0017P\u0012\u0018T\u0019\u0006";
        objectArray[22] = "rMZ.wN!M\u0018:\u0015Z#]G yhu\u0018\u0018{(?pAJ?,\u0005.N\u0016.\u0015\u0000*PY'\u007fMp\u001dAG";
        objectArray[23] = "):a6XY9{=7\"U.\u000570I\u000f*t7hBR@lb5\u001dH+|#i\u001c2";
        objectArray[24] = "i%alu?49d|In7-kb\u001e=gy6\u000eyz=:1tveg8";
        objectArray[25] = "\u001ce'\"l.Oee6\u000e:Mu:,b\b\u001b7`s?_\u001fm+5n5R7f-\u000e";
        Object[] objectArray2 = objectArray;
        objectArray[26] = ")L\u0005S\u007fLzLGG\u001dXx\\\u0018]qj(\u001eE\u0002\u001d\u0003uM\u0000\u0003']z\u0011\u0011:\"Yd^\u0018Po\u0003)Fx";
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = eD.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '$' || c == '\u00d8' || c == '\u00e3' || c == '\u00a2') {
                field = eD.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '$' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d8' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = eD.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'X' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'e' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
    public void a(aK aK2) {
        block6: {
            CallSite callSite;
            long l;
            block7: {
                CallSite callSite2;
                block8: {
                    l = k ^ 0x490595211D75L;
                    callSite2 = eD.b("X", (Object)aK2, (Object)new Object[0], (long)-7153475093738368322L, (long)l);
                    CallSite callSite3 = eD.b("e", (long)-7153550575121786035L, (long)l);
                    try {
                        try {
                            try {
                                if (!(callSite2 instanceof class_1511)) break block6;
                                callSite = eD.b("$", (Object)b, (long)-7153947471071109868L, (long)l);
                                if (callSite3 != null) break block7;
                            }
                            catch (MatchException matchException) {
                                throw eD.b("e", (Object)matchException, (long)-7153669639287164780L, (long)l);
                            }
                            if (eD.b("X", (Object)callSite, (Object)eD.b("\u00e3", (long)-7153086329777982044L, (long)l), (long)-7153512265605673117L, (long)l) == null) break block8;
                        }
                        catch (MatchException matchException) {
                            throw eD.b("e", (Object)matchException, (long)-7153669639287164780L, (long)l);
                        }
                        return;
                    }
                    catch (MatchException matchException) {
                        throw eD.b("e", (Object)matchException, (long)-7153669639287164780L, (long)l);
                    }
                }
                eD.b("X", (Object)callSite2, (Object)eD.b("\u00e3", (long)-7153860385080872303L, (long)l), (long)-7152921378055417990L, (long)l);
                eD.b("X", (Object)callSite2, (Object)eD.b("\u00e3", (long)-7153860385080872303L, (long)l), (long)-7153795310098433825L, (long)l);
                callSite = callSite2;
            }
            eD.b("X", (Object)callSite, (long)-7153018114555847968L, (long)l);
        }
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return eD.b("e", (Object)((Object)q_0.Crystal), (long)-2448299948334825904L, (long)l);
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
        Object object = eD.l[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 56;
            case 1 -> 53;
            case 2 -> 2;
            case 3 -> 30;
            case 4 -> 20;
            case 5 -> 33;
            case 6 -> 3;
            case 7 -> 40;
            case 8 -> 49;
            case 9 -> 46;
            case 10 -> 47;
            case 11 -> 0;
            case 12 -> 26;
            case 13 -> 25;
            case 14 -> 17;
            case 15 -> 51;
            case 16 -> 28;
            case 17 -> 6;
            case 18 -> 38;
            case 19 -> 5;
            case 20 -> 44;
            case 21 -> 21;
            case 22 -> 11;
            case 23 -> 63;
            case 24 -> 1;
            case 25 -> 12;
            case 26 -> 45;
            case 27 -> 24;
            case 28 -> 62;
            case 29 -> 14;
            case 30 -> 60;
            case 31 -> 4;
            case 32 -> 41;
            case 33 -> 43;
            case 34 -> 7;
            case 35 -> 15;
            case 36 -> 39;
            case 37 -> 55;
            case 38 -> 16;
            case 39 -> 34;
            case 40 -> 32;
            case 41 -> 58;
            case 42 -> 29;
            case 43 -> 18;
            case 44 -> 48;
            case 45 -> 36;
            case 46 -> 50;
            case 47 -> 31;
            case 48 -> 61;
            case 49 -> 10;
            case 50 -> 37;
            case 51 -> 19;
            case 52 -> 27;
            case 53 -> 54;
            case 54 -> 52;
            case 55 -> 23;
            case 56 -> 59;
            case 57 -> 13;
            case 58 -> 8;
            case 59 -> 42;
            case 60 -> 9;
            case 61 -> 57;
            case 62 -> 22;
            default -> 35;
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
        eD.m[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = eD.m(l, l2);
        Object object = eD.l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = eD.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = eD.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = eD.g(clazz3, string2, clazz2)) != null) {
                    eD.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = eD.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        eD.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = eD.n(1120932609912917L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = eD.m(l, l2);
        Object object = eD.l[n];
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
                clazz3 = eD.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = eD.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = eD.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        eD.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = eD.n(1120932609912917L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = eD.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        eD.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = eD.n(1120932609912917L, 0L);
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
            return MethodHandles.lookup().findStatic(eD.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


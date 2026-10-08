/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_243
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.b0;
import dev.zprestige.prestige.b1;
import dev.zprestige.prestige.cz_0;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraft.class_243;

public class b2
extends b1 {
    private static final long a = hc.a(-3195692642352587794L, -5846721918730229781L, MethodHandles.lookup().lookupClass()).a(205982284939809L);
    private static final Object[] e = new Object[27];
    private static final String[] f = new String[27];

    static {
        b2.b();
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (f[n3] != null) {
            return n3;
        }
        Object object = e[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 4;
            case 1 -> 8;
            case 2 -> 57;
            case 3 -> 11;
            case 4 -> 63;
            case 5 -> 56;
            case 6 -> 28;
            case 7 -> 0;
            case 8 -> 49;
            case 9 -> 5;
            case 10 -> 44;
            case 11 -> 55;
            case 12 -> 36;
            case 13 -> 38;
            case 14 -> 59;
            case 15 -> 17;
            case 16 -> 61;
            case 17 -> 12;
            case 18 -> 46;
            case 19 -> 3;
            case 20 -> 24;
            case 21 -> 62;
            case 22 -> 21;
            case 23 -> 45;
            case 24 -> 22;
            case 25 -> 60;
            case 26 -> 23;
            case 27 -> 40;
            case 28 -> 37;
            case 29 -> 16;
            case 30 -> 14;
            case 31 -> 52;
            case 32 -> 27;
            case 33 -> 53;
            case 34 -> 20;
            case 35 -> 30;
            case 36 -> 10;
            case 37 -> 26;
            case 38 -> 31;
            case 39 -> 1;
            case 40 -> 29;
            case 41 -> 50;
            case 42 -> 51;
            case 43 -> 54;
            case 44 -> 42;
            case 45 -> 48;
            case 46 -> 19;
            case 47 -> 35;
            case 48 -> 39;
            case 49 -> 34;
            case 50 -> 25;
            case 51 -> 58;
            case 52 -> 32;
            case 53 -> 33;
            case 54 -> 9;
            case 55 -> 6;
            case 56 -> 2;
            case 57 -> 43;
            case 58 -> 18;
            case 59 -> 47;
            case 60 -> 13;
            case 61 -> 7;
            case 62 -> 41;
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
        b2.f[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = e;
        e[0] = "u}$c\rUu}3?\u0001Zo63!\u0001OhGf~X";
        objectArray[1] = "\u000e(\u0000E@!\u000e(\u0017\u0019L.\u0014c\u0017\u0007L;\u0013\u0012FX\u001ep";
        objectArray[2] = "U!F|2kU!Q >dOjQ>>qH\u001b\u0000dg2";
        objectArray[3] = "\u0007  N\n!\u0011 %\u0014\u00196\u0006k&\u0012\u0015\"\u0017,1\u0005^0+";
        objectArray[4] = "%\u000eeo\u0003qP.n`\u0012>-6}g\u001bwE";
        objectArray[5] = "AY\u001e+|\u000bAY\twp\u0004[\u0012\tip\u0011\\cY4!";
        objectArray[6] = "\nR\bgxb\nR\u001f;tm\u0010\u0019\u001f%tx\u0017hN}&";
        objectArray[7] = Double.TYPE;
        b2.f[7] = "java/lang/Double";
        objectArray[8] = ")fq/\n5?ftu\u0019\"(-ws\u001569j`d^'\u007f";
        objectArray[9] = "{oO\fJ?\u000eOD\u0003[poAO\b_*\u001b";
        objectArray[10] = Void.TYPE;
        b2.f[10] = "java/lang/Void";
        objectArray[11] = "O H?x2D/Yp\u001b?Q\"V\u001b.=@1J790";
        objectArray[12] = "\"\u00177R\u0005Y4\u00172\b\u0016N#\\1\u000e\u001aZ2\u001b&\u0019QKw";
        objectArray[13] = "b{fl\u0000z\u0017[mc\u00115vUfh\u0015o\u0002";
        objectArray[14] = Boolean.TYPE;
        b2.f[14] = "java/lang/Boolean";
        objectArray[15] = "`)c:\u001a k&ru{.`-v/";
        objectArray[16] = "d\r\u0001AEe7\u0019NA9n5\b_DU\\aL\u0006\u001297!J]_Wd5\u0005]#\u0005rf\u0016CMVf)\u0016?";
        objectArray[17] = "aH+uQJ2G3\u0005Z[$Z/ih\u0006c\u0000p\u0005G_ H.o[Ra:q}]]<\n\";\u0001\\X";
        objectArray[18] = "d!QpKG5`FzrC^'DhJ\u00103dGj\u0015)";
        objectArray[19] = "q+V\\;=w(T\u0013\u0006oL\u007f\u0002\u0000z`/,\u0013\u001d:\u0005s*\u001a\u001c7|w>R\t\u0006";
        objectArray[20] = "H\"\u007fd(>N!}+\u0015lux01gy\u0010y< -\u0006J5()jcK99c\u0015";
        objectArray[21] = "5\u0004u\fz;|@%\u0014\u001ajo\u0016+\tM=0Kpe#vm\u000b!\u0019pyu";
        objectArray[22] = "K+PGO[\u0018?\u001fG3[\u0016?\nId\fLoV%\u000fKI2\u000b]AZ\r;";
        objectArray[23] = "m3.\u0005VS>'a\u0005*S0't\u000b}\u0004jw*g\u0016Co*u\u001fXR+#";
        objectArray[24] = "\u000b0o,}\u0004X$ ,\u0001\u0004V$5\"VS\fthN=\u0014\t)46s\u0005M ";
        objectArray[25] = "\nI\u001eI\fpPT\u001bLs`:\u0007\bM\u000flYT\u0019PO\tS\t\u0011LMi\u0000\u0006\u001b\u0013s";
        Object[] objectArray2 = objectArray;
        objectArray[26] = "_Xz\u000b\u0012RCU;y\u0011U[Qe\u0015#\u0004\u0016\u000f9Ft\u0004Y\u000fb\u001c\fJHKkyHF\u0019Qg\u0001\u0006W]X\u0002E\n\u0006GTz\u000b\u001bBN1z\u0010\fJA[f\u001dM8";
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/b2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = b2.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'm' || c == 'j' || c == 'I' || c == 'L') {
                field = b2.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'm' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'j' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'I' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = b2.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'H' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'B' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private void b(Object[] objectArray) {
        b0 b02 = (b0)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        b02.c = b2.b("H", (Object)b02.c, (Object)b02.d, (long)9129976673921261758L, (long)l);
        b02.d = new class_243((double)(b2.b("m", (Object)b02.d, (long)9130463853390569445L, (long)l) / (double)0.999998f), (double)(b2.b("m", (Object)b02.d, (long)9130548574119261786L, (long)l) - 1.5E-6), (double)(b2.b("m", (Object)b02.d, (long)9130387740269171692L, (long)l) / (double)0.999998f));
    }

    private static MatchException b(MatchException matchException) {
        return matchException;
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
        int n = b2.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = f[n];
                int n3 = string2.indexOf(8);
                clazz3 = b2.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = b2.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = b2.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        b2.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = b2.f(1074594488183404L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = b2.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        b2.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = b2.f(1074594488183404L, 0L);
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
            int n = b2.e(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                b2.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = b2.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = b2.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = b2.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = b2.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @Override
    public void a(Object[] objectArray) {
        b2 b22;
        long l;
        long l2;
        b0 b02;
        block16: {
            block17: {
                CallSite callSite;
                long l3;
                block15: {
                    block14: {
                        b02 = (b0)objectArray[0];
                        boolean bl = (Boolean)objectArray[1];
                        l2 = (Long)objectArray[2];
                        long l4 = l2;
                        l3 = l4 ^ 0x68096BC3F1C0L;
                        l = l4 ^ 0x7D3DDC8CA42L;
                        callSite = b2.b("B", (long)9029418090854610801L, (long)l2);
                        try {
                            try {
                                if (callSite != null) break block14;
                                if (bl) break block15;
                            }
                            catch (MatchException matchException) {
                                throw b2.b("B", (Object)matchException, (long)9029537475649104985L, (long)l2);
                            }
                            Object[] objectArray2 = new Object[2];
                            objectArray2[1] = l;
                            objectArray2[0] = b02;
                            b2.b("H", (Object)this, (Object)objectArray2, (long)9029337096177727321L, (long)l2);
                        }
                        catch (MatchException matchException) {
                            throw b2.b("B", (Object)matchException, (long)9029537475649104985L, (long)l2);
                        }
                    }
                    return;
                }
                CallSite callSite2 = b2.b("H", (Object)b2.b("m", (Object)cz_0.b, (long)9029500030936472195L, (long)l2), (Object)b2.b("B", (double)b2.b("m", (Object)b02.c, (long)9029624503945239583L, (long)l2), (double)b2.b("m", (Object)b02.c, (long)9028730267512206752L, (long)l2), (double)(b2.b("m", (Object)b02.c, (long)9029682740724846614L, (long)l2) + b2.b("m", (Object)b02.d, (long)9029682740724846614L, (long)l2)), (long)9028818494541146922L, (long)l2), (long)9029201786889247388L, (long)l2);
                try {
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = l3;
                    objectArray3[0] = callSite2;
                    if (b2.b("H", (Object)this, (Object)objectArray3, (long)9028659109259312839L, (long)l2) == false) {
                        b02.d = new class_243((double)b2.b("m", (Object)b02.d, (long)9029624503945239583L, (long)l2), (double)b2.b("m", (Object)b02.d, (long)9028730267512206752L, (long)l2), (double)(b2.b("m", (Object)b02.d, (long)9029682740724846614L, (long)l2) * -0.8));
                    }
                }
                catch (MatchException matchException) {
                    throw b2.b("B", (Object)matchException, (long)9029537475649104985L, (long)l2);
                }
                CallSite callSite3 = b2.b("H", (Object)b2.b("m", (Object)cz_0.b, (long)9029500030936472195L, (long)l2), (Object)b2.b("B", (double)b2.b("m", (Object)b02.c, (long)9029624503945239583L, (long)l2), (double)(b2.b("m", (Object)b02.c, (long)9028730267512206752L, (long)l2) + b2.b("m", (Object)b02.d, (long)9028730267512206752L, (long)l2)), (double)b2.b("m", (Object)b02.c, (long)9029682740724846614L, (long)l2), (long)9028818494541146922L, (long)l2), (long)9029201786889247388L, (long)l2);
                try {
                    Object[] objectArray4 = new Object[2];
                    objectArray4[1] = l3;
                    objectArray4[0] = callSite3;
                    if (b2.b("H", (Object)this, (Object)objectArray4, (long)9028659109259312839L, (long)l2) == false) {
                        b02.d = new class_243((double)(b2.b("m", (Object)b02.d, (long)9029624503945239583L, (long)l2) * (double)0.999f), (double)(b2.b("m", (Object)b02.d, (long)9028730267512206752L, (long)l2) * -0.6), (double)(b2.b("m", (Object)b02.d, (long)9029682740724846614L, (long)l2) * (double)0.999f));
                    }
                }
                catch (MatchException matchException) {
                    throw b2.b("B", (Object)matchException, (long)9029537475649104985L, (long)l2);
                }
                CallSite callSite4 = b2.b("H", (Object)b2.b("m", (Object)cz_0.b, (long)9029500030936472195L, (long)l2), (Object)b2.b("B", (double)(b2.b("m", (Object)b02.c, (long)9029624503945239583L, (long)l2) + b2.b("m", (Object)b02.d, (long)9029624503945239583L, (long)l2)), (double)b2.b("m", (Object)b02.c, (long)9028730267512206752L, (long)l2), (double)b2.b("m", (Object)b02.c, (long)9029682740724846614L, (long)l2), (long)9028818494541146922L, (long)l2), (long)9029201786889247388L, (long)l2);
                try {
                    try {
                        b22 = this;
                        if (callSite != null) break block16;
                        Object[] objectArray5 = new Object[2];
                        objectArray5[1] = l3;
                        objectArray5[0] = callSite4;
                        if (b2.b("H", (Object)b22, (Object)objectArray5, (long)9028659109259312839L, (long)l2) != false) break block17;
                    }
                    catch (MatchException matchException) {
                        throw b2.b("B", (Object)matchException, (long)9029537475649104985L, (long)l2);
                    }
                    b02.d = new class_243((double)(b2.b("m", (Object)b02.d, (long)9029624503945239583L, (long)l2) * -0.8), (double)b2.b("m", (Object)b02.d, (long)9028730267512206752L, (long)l2), (double)b2.b("m", (Object)b02.d, (long)9029682740724846614L, (long)l2));
                }
                catch (MatchException matchException) {
                    throw b2.b("B", (Object)matchException, (long)9029537475649104985L, (long)l2);
                }
            }
            b22 = this;
        }
        Object[] objectArray6 = new Object[2];
        objectArray6[1] = l;
        objectArray6[0] = b02;
        b2.b("H", (Object)b22, (Object)objectArray6, (long)9029337096177727321L, (long)l2);
    }

    private static Field g(long l, long l2) {
        int n = b2.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = b2.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = b2.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = b2.c(clazz3, string2, clazz2)) != null) {
                    b2.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = b2.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        b2.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = b2.f(1074594488183404L, 0L);
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
            return MethodHandles.lookup().findStatic(b2.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


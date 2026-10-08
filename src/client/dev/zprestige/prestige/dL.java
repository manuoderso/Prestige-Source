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
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class dL
extends dK {
    private boolean a;
    private static final long f = hc.a(6049885270185901264L, -3008968333359876334L, MethodHandles.lookup().lookupClass()).a(216894817384333L);
    private static final long[] h;
    private static final Integer[] i;
    private static final Map j;
    private static final Object[] m;
    private static final String[] n;

    public dL(String string, int n) {
        super(string, n);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        m = new Object[25];
        n = new String[25];
        dL.c();
        j = new HashMap(13);
        long l = f ^ 0x16BD523F907EL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n = 0;
        String string = "~\u008bH:Ji#\u0090po\u00b5\u009b\u008b\u008d\u0090\u00b7";
        int n2 = "~\u008bH:Ji#\u0090po\u00b5\u009b\u008b\u008d\u0090\u00b7".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        h = lArray;
        i = new Integer[2];
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (dL.n[n3] != null) {
            return n3;
        }
        Object object = m[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 6;
            case 1 -> 27;
            case 2 -> 25;
            case 3 -> 29;
            case 4 -> 61;
            case 5 -> 13;
            case 6 -> 22;
            case 7 -> 30;
            case 8 -> 17;
            case 9 -> 49;
            case 10 -> 45;
            case 11 -> 4;
            case 12 -> 51;
            case 13 -> 58;
            case 14 -> 31;
            case 15 -> 38;
            case 16 -> 46;
            case 17 -> 44;
            case 18 -> 40;
            case 19 -> 57;
            case 20 -> 8;
            case 21 -> 62;
            case 22 -> 50;
            case 23 -> 33;
            case 24 -> 16;
            case 25 -> 42;
            case 26 -> 48;
            case 27 -> 18;
            case 28 -> 21;
            case 29 -> 9;
            case 30 -> 41;
            case 31 -> 59;
            case 32 -> 19;
            case 33 -> 10;
            case 34 -> 23;
            case 35 -> 0;
            case 36 -> 11;
            case 37 -> 3;
            case 38 -> 63;
            case 39 -> 37;
            case 40 -> 56;
            case 41 -> 39;
            case 42 -> 5;
            case 43 -> 32;
            case 44 -> 12;
            case 45 -> 60;
            case 46 -> 7;
            case 47 -> 36;
            case 48 -> 47;
            case 49 -> 14;
            case 50 -> 1;
            case 51 -> 54;
            case 52 -> 26;
            case 53 -> 35;
            case 54 -> 28;
            case 55 -> 15;
            case 56 -> 43;
            case 57 -> 55;
            case 58 -> 52;
            case 59 -> 20;
            case 60 -> 34;
            case 61 -> 53;
            case 62 -> 2;
            default -> 24;
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
        dL.n[n3] = new String(cArray);
        return n3;
    }

    @cP
    public boolean b() {
        return this.a;
    }

    private static MatchException b(MatchException matchException) {
        return matchException;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = dL.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'M' || c == '\u00e0' || c == '\u00ec' || c == '\u00e1') {
                field = dL.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'M' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e0' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ec' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = dL.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f6' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dL" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void c() {
        Object[] objectArray = m;
        m[0] = "{\rl\u0011QH~\u0018g\u0011ZSr\b%xqyC";
        objectArray[1] = Long.TYPE;
        dL.n[1] = "java/lang/Long";
        objectArray[2] = Integer.TYPE;
        dL.n[2] = "java/lang/Integer";
        objectArray[3] = "=o8BC'=o/\u001eO('$/\u0000O= U\u007f]\u001e";
        objectArray[4] = "{\u0000z-@\\{\u0000mqLSaKmoLFf:?3\u0019\u0004";
        objectArray[5] = "/>/'\u001bG9>*}\bP.u){\u0004D?2>lOV\u0003";
        objectArray[6] = "b+E\u0002_(\u0017\u000bN\rNgj\u0013]\nG.\u0002";
        objectArray[7] = "]|\f[\u0012&Vs\u001d\u0014u$Cx\u001d_N";
        objectArray[8] = "jN*$\u0003 |N/~\u00107k\u0005,x\u001c#zB;oW4E";
        objectArray[9] = "u5>*(\u0005~:/eI\u000bu1+?";
        objectArray[10] = "h\u000fbV0\u0005~\u000fg\f#\u0012iDd\n/\u0006x\u0003s\u001dd\u0011@";
        objectArray[11] = "\u007f>(\u0019V(t19V5%a<6=\u0000'p/*\u0011\u0017*";
        objectArray[12] = "\u0018@SvtMm`Xye\u0002\fnSraXx";
        objectArray[13] = "\u000b*\u0010]\t\r\u0000%\u0001\u0012t\u0015\u0013\"\b[";
        objectArray[14] = "aL\u001b\u007fdXtC\u001eF0_bM6+#~kO\u0002+\u0015FpN\u001e _\u00024UI>.Js_CFfAcW\u0006)-\u000b<\\y\u007f%TiM\u00164o\u000bb2";
        objectArray[15] = "\u0011wz\u0003sz\u0011\u007f}Q\u0010.Fm%T|\u001c\u0011+{\u0003+K\u0010*/\u000fy+Si(Y\u0010";
        objectArray[16] = "v-\u001ct\u0012\u001c.g\u0000+~\u0019J*\u000eeD\t;.P+Fs";
        objectArray[17] = "\u0012&cg\u0018Q\u0007)f^LV\u0011'N3_q\u0012)\u0001g\u001bUO p/\\_EX8$LW\u00007sn\u0013\\\u007fa{1FM\u0010*1nM2";
        objectArray[18] = "\u001eq\u0003B\\#]2\u0004\u00145&H6\t\u0019Y\u0014\u0019vXF5z\u001d-Y\u0006D2Z'S~";
        objectArray[19] = "--~s\"\u001a-%y!ANz7!$-|.v|zA\u0011qtq p\u0011ys#C";
        objectArray[20] = "<U\";\u007fwh\u0014$:\u0010y\u0002Pd0/.n\u0002#am\u0010";
        objectArray[21] = "\u0007'`\u000f\u00112\u0001ql](>8/k\u001fUoXz,Z\u0011W\u0007'`\u000f\u00112\u0001ql](";
        objectArray[22] = "/\b*\u0012$5)^&@\u001d:\u0010\u0000e\u0002,\"`\u0001(GdP \r\"Io !@g\u0001\u001d";
        objectArray[23] = "(|\u007fH\u00184.*s\u001a!*z8AOZ:m%u^@6qD<O\u001d>h~iAH`\u0017{5PKhr}c\\\u0019Q";
        Object[] objectArray2 = objectArray;
        objectArray[24] = "TV\u0005*W4\u0003\u0010\u001clk2\u000eT&8\u000f.\u0005(A+\u00046\u0017G\na[=h";
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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

    public boolean c(Object[] objectArray) {
        Object object;
        block16: {
            Object object2;
            block14: {
                CallSite callSite;
                long l;
                block15: {
                    block17: {
                        l = (Long)objectArray[0];
                        l = f ^ l;
                        callSite = dL.c("\u00d2", (long)5650745558641853685L, (long)l);
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                object = dL.c("\u00f6", (Object)((Integer)((Object)dL.c("\u00f6", (Object)this, (long)5650447811879698547L, (long)l))), (long)5650136008375656055L, (long)l);
                                                object2 = -1;
                                                if (callSite != null) break block14;
                                                if (object == object2) break block15;
                                            }
                                            catch (MatchException matchException) {
                                                throw dL.c("\u00d2", (Object)matchException, (long)5650581379652489232L, (long)l);
                                            }
                                            object = dL.c("\u00f6", (Object)((Integer)((Object)dL.c("\u00f6", (Object)this, (long)5650447811879698547L, (long)l))), (long)5650136008375656055L, (long)l);
                                            object2 = dL.a("b", (int)18356, (long)(0x4306FE7AED433640L ^ l));
                                            if (callSite != null) break block14;
                                        }
                                        catch (MatchException matchException) {
                                            throw dL.c("\u00d2", (Object)matchException, (long)5650581379652489232L, (long)l);
                                        }
                                        if (object <= object2) break block15;
                                    }
                                    catch (MatchException matchException) {
                                        throw dL.c("\u00d2", (Object)matchException, (long)5650581379652489232L, (long)l);
                                    }
                                    object = dL.c("\u00d2", (long)dL.c("\u00f6", (Object)dL.c("\u00f6", (Object)dL.c("\u00d2", (long)5650760971269532491L, (long)l), (long)5651060772672869424L, (long)l), (long)5650827390857407930L, (long)l), (int)(dL.a("b", (int)26179, (long)(0x4FCCEA35096997B6L ^ l)) - dL.c("\u00f6", (Object)((Integer)((Object)dL.c("\u00f6", (Object)this, (long)5650447811879698547L, (long)l))), (long)5650136008375656055L, (long)l)), (long)5651120683148394321L, (long)l);
                                    if (callSite != null) break block16;
                                }
                                catch (MatchException matchException) {
                                    throw dL.c("\u00d2", (Object)matchException, (long)5650581379652489232L, (long)l);
                                }
                                if (object != 1) break block17;
                            }
                            catch (MatchException matchException) {
                                throw dL.c("\u00d2", (Object)matchException, (long)5650581379652489232L, (long)l);
                            }
                            object = 1;
                            break block16;
                        }
                        catch (MatchException matchException) {
                            throw dL.c("\u00d2", (Object)matchException, (long)5650581379652489232L, (long)l);
                        }
                    }
                    object = 0;
                    break block16;
                }
                try {
                    object = dL.c("\u00d2", (long)dL.c("\u00f6", (Object)dL.c("\u00f6", (Object)dL.c("\u00d2", (long)5650760971269532491L, (long)l), (long)5651060772672869424L, (long)l), (long)5650827390857407930L, (long)l), (int)dL.c("\u00f6", (Object)((Integer)((Object)dL.c("\u00f6", (Object)this, (long)5650447811879698547L, (long)l))), (long)5650136008375656055L, (long)l), (long)5650678047527812378L, (long)l);
                    if (callSite != null) break block16;
                    object2 = 1;
                }
                catch (MatchException matchException) {
                    throw dL.c("\u00d2", (Object)matchException, (long)5650581379652489232L, (long)l);
                }
            }
            object = object == object2 ? (Object)1 : (Object)0;
        }
        return (boolean)object;
    }

    private static Method h(long l, long l2) {
        int n = dL.e(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = dL.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = dL.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = dL.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = dL.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        dL.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = dL.f(691892827523058L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = dL.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        dL.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = dL.f(691892827523058L, 0L);
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
            int n = dL.e(l, l2);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                dL.m[n] = clazz = Class.forName(dL.n[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = dL.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = dL.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = dL.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = dL.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dL" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @cP
    public void a(boolean bl) {
        this.a = bl;
    }

    @Override
    public dL a(Object[] objectArray) {
        Predicate predicate = (Predicate)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = f ^ l) ^ 0x257574507DC1L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = predicate;
        super.a(objectArray2);
        return this;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = dL.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    @Override
    public dK a(Object[] objectArray) {
        Predicate predicate = (Predicate)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l ^ 0x7F60C69E7CA3L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = predicate;
        return dL.c("\u00f6", (Object)this, (Object)objectArray2, (long)-9175113479249401695L, (long)l);
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3F9B;
        if (i[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = h[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])j.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    j.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/dL", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            dL.i[n2] = n3;
        }
        return i[n2];
    }

    private static Field g(long l, long l2) {
        int n = dL.e(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            String string = dL.n[n];
            int n2 = string.indexOf(8);
            Class clazz = dL.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = dL.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = dL.c(clazz3, string2, clazz2)) != null) {
                    dL.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = dL.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        dL.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = dL.f(691892827523058L, 0L);
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
        long l = f ^ 0x49044D6474F6L;
        return dL.c("\u00f6", (Object)this, (Object)string, (long)8471782611306158492L, (long)l);
    }

    @Override
    @cP
    public dL setDescription(String string) {
        super.setDescription(string);
        return this;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dL.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(dL.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


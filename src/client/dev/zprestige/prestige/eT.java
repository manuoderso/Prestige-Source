/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_124
 *  net.minecraft.class_1657
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bn_0;
import dev.zprestige.prestige.dV;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_124;
import net.minecraft.class_1657;

public class eT
extends dV {
    private static final long k = hc.a(-3861559739631316500L, 7232359492847729929L, MethodHandles.lookup().lookupClass()).a(121547321226483L);
    private static final String[] l;
    private static final String[] m;
    private static final Map n;
    private static final Object[] o;
    private static final String[] p;

    /*
     * Enabled aggressive block sorting
     */
    static {
        o = new Object[35];
        p = new String[35];
        eT.f();
        n = new HashMap(13);
        long l = k ^ 0x5E003CF24CE1L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[2];
        int n = 0;
        String string = "i#\u00c7\u00f4_\u00f0_\u001dO\u00a3\u009a8\u00bd\u00dbk\u00d1\u0010\u00d0\f\u00ab^A\u00a3\u00b4\u00e2z\u00e0\u00a3\u000bH\u00f0,\u00cd";
        int n2 = "i#\u00c7\u00f4_\u00f0_\u001dO\u00a3\u009a8\u00bd\u00dbk\u00d1\u0010\u00d0\f\u00ab^A\u00a3\u00b4\u00e2z\u00e0\u00a3\u000bH\u00f0,\u00cd".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = eT.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                eT.l = stringArray;
                m = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xF97;
        if (m[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])eT.n.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    eT.n.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/eT", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = eT.l[n2].getBytes("ISO-8859-1");
            eT.m[n2] = eT.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return m[n2];
    }

    private static String b(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = eT.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private float b(Object[] objectArray) {
        class_1657 class_16572 = (class_1657)objectArray[0];
        long l = (Long)objectArray[1];
        l = k ^ l;
        return (float)(eT.c("\u00e0", (Object)class_16572, (long)-8236910613311743214L, (long)l) + eT.c("\u00e0", (Object)class_16572, (long)-8232758407479832958L, (long)l));
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/eT" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/eT" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = eT.m(l, l2);
            object = o[n];
            try {
                if (!(object instanceof String)) break block2;
                eT.o[n] = clazz = Class.forName(p[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = eT.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = eT.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = eT.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = eT.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = o;
        o[0] = "\u000ey\t\u000f\u0017,\u0018y\fU\u0004;\u000f2\u000fS\b/\u001eu\u0018DC=\"";
        objectArray[1] = ":;\u0015{8wO\u001b\u001et)82\u0003\rs qZ";
        objectArray[2] = "|ofm\u0007\f|oq1\u000b\u0003f$q/\u000b\u0016aU#q^";
        objectArray[3] = "\u0019\u0018AQ8\u0015\u000f\u0018D\u000b+\u0002\u0018SG\r'\u0016\t\u0014P\u001al\u0000)";
        objectArray[4] = "\fxt}\\\u0011\u0007we2?\u001c\u0012zjY\n\u001e\u0003ivu\u001d\u0013";
        objectArray[5] = "\u000b~W\u001b]^\u001d~RANI\n5QGB]\u001brFP\tL\u0001";
        objectArray[6] = "4\u0005\u001fS3\bA%\u0014\\\"G +\u001fW&\u001dT";
        objectArray[7] = Void.TYPE;
        eT.p[7] = "java/lang/Void";
        objectArray[8] = "\u000buaWo\u0014~UjX~[\u001f[aSz\u0001k";
        objectArray[9] = "\fYq%\u0016Myyz*\u0007\u0002\u0018wq!\u0003Xl";
        objectArray[10] = Float.TYPE;
        eT.p[10] = "java/lang/Float";
        objectArray[11] = "L(y=hV9\br2y\u0019X\u0006y9}C,";
        objectArray[12] = "%{m\u0015\u0019c.t|Zzn;r";
        objectArray[13] = Double.TYPE;
        eT.p[13] = "java/lang/Double";
        objectArray[14] = "sB\u007f\u001b\"\bxMnT_\u0010kJg\u001d";
        objectArray[15] = "z[A\u0003w\u0001qTPL\u0016\u000fz_T\u0016";
        objectArray[16] = "IRSgM\u0015<rXh\\Z]|ScX\u0000)";
        objectArray[17] = "j-O\u0018\u0001\u0006j-XD\r\tpfXZ\r\u001cw\u0017\n\u0000YX";
        objectArray[18] = ",\u001d\u0001\u001cnI,\u0019\u0005\u0005\u000fH\u0010L\u0005\u0011n_!\u001dC\u001e6\"-J]MvYo_^L\u000f";
        objectArray[19] = "vGcwA\\gW\u0001{}Ag\u000ez+@\u0007#X\u0001";
        objectArray[20] = "{\u0019-~w\u000e%\u001d=}G\u001b#\n((\u0010LzYuD~\u000b#]|? \u000f3^";
        objectArray[21] = "rTlxV]\"J&-,\bH\u0001u{\u0014[7\u0004snFasSq.\u0016\u001evUd|,";
        objectArray[22] = "bXw\bP\bsH\u0015\u0007l\u00007Nt\u0013]QqA,nQ\u0006o\u0012l\u0015\u0013\u0013l\u0013\u0015";
        objectArray[23] = "[\u0006oe?n\u0005\u0002\u007ff\u000f{\u0003\u0015j3X,ZF3_6k\u0003B>$ho\u0013A";
        objectArray[24] = "a1^\u0016q-1/\u0014C\u000b{[5\u0010\u001cjljdV\u00132\u0011d2R\u0003l`'=\\C\u000b";
        objectArray[25] = "\u0000(\u000b\n\bJP6A_r\u001f:,E\u0000\u0013\u000b\u000b}\u0003\u000fKv\u00038\u001a^B\r]<\n]r";
        objectArray[26] = "i9J{08)mFv\u000b?4=E\u0011:: 5Yzoe:d! e-0$Ju:7a\\";
        objectArray[27] = ":oqz\u0003V2?j)eA:`|z\"QSm\u007fi\b\u0003+ckf\u0007?:oqz\u0003V2?j)e";
        objectArray[28] = "s\u0010\"E..-\u00142F\u001e;+\u0003'\u0013IlrS\u007f\u007f'++Ts\u0004y/;W";
        objectArray[29] = "GOPrQ{\u0014K]rapA\u000fOk\rB\u0012K\u00113a*A\u000fTk\u0010iN\u0001\u0014\f";
        objectArray[30] = "['C;\u0017'\u0005#S8'2\u00034FmpeZg\u001a\u0001\u001e\"\u0003c\u0012z@&\u0013`";
        objectArray[31] = "WyK\u0000\\\u000fW}O\u0019=\rk(O\r\\\u0019Zy\t\u0002\u0004d\u0000~\u000e\u0017\r\nSz\u0003\u0017=";
        objectArray[32] = "\u0010dF\u000f%+N`V\f\u0015>HwCYBi\u0011%\u00185,.H \u0017Nr*X#";
        objectArray[33] = "A\u0011'\f1\u0000\u001f\u00157\u000f\u0001\u0015\u0019\u0002\"ZVB@P~68\u0005\u0019UvMf\u0001\tV";
        Object[] objectArray2 = objectArray;
        objectArray[34] = "vb\u000f\u0003V\r%f\u0002\u0003f\u0006p\"\u0010\u001a\n4#fKGf\\p\"\u000b\u001a\u0017\u001f\u007f,K}";
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = eT.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'l' || c == '\u00fc' || c == 'y' || c == 'S') {
                field = eT.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'l' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fc' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'y' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = eT.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e0' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'N' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
    public void a(bn_0 bn_02) {
        long l;
        long l2 = l = k ^ 0x58464E4D8ECBL;
        long l3 = l2 ^ 0x44C0A1301836L;
        long l4 = l2 ^ 0x779736480373L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l4;
        objectArray[0] = eT.c("\u00e0", (Object)bn_02, (Object)new Object[0], (long)737152003059023775L, (long)l);
        float f = (float)eT.c("N", (double)((double)eT.c("\u00e0", (Object)this, (Object)objectArray, (long)737236090698106514L, (long)l)), (long)737391330976581859L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = Float.valueOf(f);
        CallSite callSite = eT.c("N", (Object)eT.c("y", (long)735603513127573682L, (long)l), (long)737443367717588968L, (long)l);
        float f10 = f;
        CallSite callSite2 = eT.c("N", (Object)eT.c("\u00e0", (Object)this, (Object)objectArray2, (long)737258909805825712L, (long)l), (long)737443367717588968L, (long)l);
        String string = (String)((Object)eT.b("t", (int)23567, (long)(0x11C572FF9313D9A5L ^ l))) + (String)((Object)callSite2) + f10 + (String)((Object)callSite) + (String)((Object)eT.b("t", (int)23459, (long)(0x23AB8BBC2E445E08L ^ l)));
        eT.c("\u00e0", (Object)bn_02, (Object)new Object[]{string}, (long)736830898365189777L, (long)l);
        eT.c("\u00e0", (Object)bn_02, (Object)new Object[0], (long)736539692677306915L, (long)l);
    }

    private class_124 a(Object[] objectArray) {
        float f;
        long l;
        block19: {
            float f10;
            block20: {
                CallSite callSite;
                block17: {
                    block18: {
                        block15: {
                            block16: {
                                f10 = ((Float)objectArray[0]).floatValue();
                                l = (Long)objectArray[1];
                                l = k ^ l;
                                callSite = eT.c("N", (long)-7567772952900647143L, (long)l);
                                try {
                                    try {
                                        float f11 = f10 - 5.0f;
                                        f = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                                        if (callSite != null) break block15;
                                        if (f > 0) break block16;
                                    }
                                    catch (MatchException matchException) {
                                        throw eT.c("N", (Object)matchException, (long)-7568169043894220423L, (long)l);
                                    }
                                    return eT.c("y", (long)-7568286014781673636L, (long)l);
                                }
                                catch (MatchException matchException) {
                                    throw eT.c("N", (Object)matchException, (long)-7568169043894220423L, (long)l);
                                }
                            }
                            float f12 = f10 - 10.0f;
                            f = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                        }
                        try {
                            try {
                                if (callSite != null) break block17;
                                if (f > 0) break block18;
                            }
                            catch (MatchException matchException) {
                                throw eT.c("N", (Object)matchException, (long)-7568169043894220423L, (long)l);
                            }
                            return eT.c("y", (long)-7568020428120209362L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw eT.c("N", (Object)matchException, (long)-7568169043894220423L, (long)l);
                        }
                    }
                    float f13 = f10 - 15.0f;
                    f = f13 == 0.0f ? 0 : (f13 < 0.0f ? -1 : 1);
                }
                try {
                    try {
                        if (callSite != null) break block19;
                        if (f > 0) break block20;
                    }
                    catch (MatchException matchException) {
                        throw eT.c("N", (Object)matchException, (long)-7568169043894220423L, (long)l);
                    }
                    return eT.c("y", (long)-7567676740340841197L, (long)l);
                }
                catch (MatchException matchException) {
                    throw eT.c("N", (Object)matchException, (long)-7568169043894220423L, (long)l);
                }
            }
            float f14 = f10 - 20.0f;
            f = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
        }
        try {
            if (f <= 0) {
                return eT.c("y", (long)-7567578083243343575L, (long)l);
            }
        }
        catch (MatchException matchException) {
            throw eT.c("N", (Object)matchException, (long)-7568169043894220423L, (long)l);
        }
        return eT.c("y", (long)-7569076200899294195L, (long)l);
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (p[n3] != null) {
            return n3;
        }
        Object object = o[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 51;
            case 1 -> 42;
            case 2 -> 13;
            case 3 -> 12;
            case 4 -> 53;
            case 5 -> 36;
            case 6 -> 45;
            case 7 -> 57;
            case 8 -> 24;
            case 9 -> 33;
            case 10 -> 17;
            case 11 -> 18;
            case 12 -> 22;
            case 13 -> 3;
            case 14 -> 23;
            case 15 -> 19;
            case 16 -> 6;
            case 17 -> 15;
            case 18 -> 9;
            case 19 -> 39;
            case 20 -> 58;
            case 21 -> 32;
            case 22 -> 16;
            case 23 -> 14;
            case 24 -> 28;
            case 25 -> 44;
            case 26 -> 27;
            case 27 -> 49;
            case 28 -> 29;
            case 29 -> 35;
            case 30 -> 59;
            case 31 -> 7;
            case 32 -> 40;
            case 33 -> 37;
            case 34 -> 56;
            case 35 -> 48;
            case 36 -> 0;
            case 37 -> 26;
            case 38 -> 50;
            case 39 -> 43;
            case 40 -> 1;
            case 41 -> 47;
            case 42 -> 11;
            case 43 -> 20;
            case 44 -> 63;
            case 45 -> 60;
            case 46 -> 52;
            case 47 -> 2;
            case 48 -> 46;
            case 49 -> 21;
            case 50 -> 31;
            case 51 -> 5;
            case 52 -> 10;
            case 53 -> 55;
            case 54 -> 62;
            case 55 -> 38;
            case 56 -> 54;
            case 57 -> 34;
            case 58 -> 25;
            case 59 -> 30;
            case 60 -> 61;
            case 61 -> 41;
            case 62 -> 4;
            default -> 8;
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
        eT.p[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = eT.m(l, l2);
        Object object = o[n];
        if (object instanceof String) {
            String string = p[n];
            int n2 = string.indexOf(8);
            Class clazz = eT.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = eT.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = eT.g(clazz3, string2, clazz2)) != null) {
                    eT.o[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = eT.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        eT.o[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = eT.n(1105514022845323L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = eT.m(l, l2);
        Object object = o[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = p[n];
                int n3 = string2.indexOf(8);
                clazz3 = eT.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = eT.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = eT.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        eT.o[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = eT.n(1105514022845323L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = eT.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        eT.o[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = eT.n(1105514022845323L, 0L);
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
            return MethodHandles.lookup().findStatic(eT.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(eT.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


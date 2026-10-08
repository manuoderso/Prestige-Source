/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aK;
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
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1657;

public class fH
extends dV {
    private static final long k = hc.a(1534842611056639288L, -4919911482928505500L, MethodHandles.lookup().lookupClass()).a(81870827296836L);
    private static final long l;
    private static final Object[] m;
    private static final String[] n;

    /*
     * Enabled aggressive block sorting
     */
    static {
        m = new Object[39];
        n = new String[39];
        fH.f();
        long l = k ^ 0x28AD362C3317L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 3798455407346191986L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                fH.l = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fH" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fH.m(l, l2);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                fH.m[n] = clazz = Class.forName(fH.n[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fH.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fH.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fH.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fH.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = m;
        m[0] = "\u0011qEY!j\u0007q@\u00032}\u0010:C\u0005>i\u0001}T\u0012u{=";
        objectArray[1] = "@\u0005Fvd05%Myu\u007fH=^~|6 ";
        objectArray[2] = "\u0006\u0006\u0002b*s\u0010\u0006\u000789d\u0007M\u0004>5p\u0016\n\u0013)~b)";
        objectArray[3] = " UJ\u001f\u0001CUuA\u0010\u0010\f4{J\u001b\u0014V@";
        objectArray[4] = "B\u000fd9\u007fTB\u000fses[XDs{sN_5!%+\n";
        objectArray[5] = "Z\u001cH[1PZ\u001c_\u0007=_@W_\u0019=JG&\u000fDl";
        objectArray[6] = "\u0005\u0001y\u0000\u0007m\u0005\u0001n\\\u000bb\u001fJnB\u000bw\u0018;:\u001a\\";
        objectArray[7] = "PqT^)]%Q_Q8\u0012D_TZ<H0";
        objectArray[8] = Void.TYPE;
        fH.n[8] = "java/lang/Void";
        objectArray[9] = "ECt^\u0011\u0005NLe\u0011v\u0007[GeZM";
        objectArray[10] = Integer.TYPE;
        fH.n[10] = "java/lang/Integer";
        objectArray[11] = "M\u0015[\u0018\u0001\u0006M\u0015LD\r\tW^LZ\r\u001cP/\u001e\u0001UV";
        objectArray[12] = "$ >t7O$ )(;@>k)6;U9\u001a{mc\u0014";
        objectArray[13] = "f\\\u0000[A_p\\\u0005\u0001RHg\u0017\u0006\u0007^\\vP\u0011\u0010\u0015IJ";
        objectArray[14] = "n7E\u001auTe8TU\u0016Yp5[>#[a&G\u00124V";
        objectArray[15] = "pvO]nNpvX\u0001bAj=X\u001fbTmL\nE5\u0016";
        objectArray[16] = "MP0^\u0006\u0017[P5\u0004\u0015\u0000L\u001b6\u0002\u0019\u0014]\\!\u0015R\u0004[";
        objectArray[17] = "g\u0014&\u0007`5\u00124-\bqzs:&\u0003u \u0007";
        objectArray[18] = "OA< S\u0011:a7/B^[o<$F\u0004/";
        objectArray[19] = Boolean.TYPE;
        fH.n[19] = "java/lang/Boolean";
        objectArray[20] = "K|> \u0000pK|)|\f\u007fQ7)b\fjVF{6]+";
        objectArray[21] = "\u000bp\n\u0016B]\u001dp\u000fLQJ\n;\fJ]^\u001b|\u001b]\u0016N\u0000";
        objectArray[22] = "@XifM\u000e5xbi\\ATvibX\u001b ";
        objectArray[23] = "uw\u0015~\u0005b~x\u00041dlus\u0000k";
        objectArray[24] = "\u001ek)3G\u0017\u001bh'\u0003\u001dq\u001e?ejL\u0003Bg(lw";
        objectArray[25] = "V\u0011A\u0000\u001ed\u001dBK\u0018wklF\u001e\u0010\u0012k\u0003X\u0012I\u0010\u0002W\u0015MK\u0014m\u0013YU\u001fw";
        objectArray[26] = "KSOg2}\u001cK\u001fm@i\u0011Z\u001b:\u0017>O\rCV|j\f\u000f\u000f7~`\u0019I";
        objectArray[27] = "L,r0=\u0011I/|\u0000dw\u001bsled\u0018\u0005\u007f5g\rJ\u000f,j?rJ\u0015;6\u0000";
        objectArray[28] = "\u0003Q#*\u0011:DR|*,$TNf,k4=\u0015#+N1TO\u007f%KZ\u0003Q#*\u0011:DR|*,";
        objectArray[29] = "'RX==\u0011t\u0003\u0015/X\u000fz\u001eD04=(S\u001cfXZv\u0012A;>\u0011h\u001fGW";
        objectArray[30] = "T&\u001bi^Y\u0013%DicX\f!}k\u0007D\u0007]\u001c:\t[\u00014Ff\u0007^j";
        objectArray[31] = "+\"_Ms[\u007f'B\u001eC\u000f\u001au\u0002^*_b$\u0003^(fs$@Mz\u001e\"%@OC";
        objectArray[32] = "5PJtqy&\u0012Xa\n/[\u0004\u0019ho/4\u001a\u00151mFf\u0010Fn59f\nQ2\n";
        objectArray[33] = "u\u001aK4\nxw\u0010^rz|$\u000bWk\u0016NwO\u000b3z)y\u000b]i\u0001z(FO\f";
        objectArray[34] = "\u0014\u0010Oxf\u001f\u001d\u0003\u0014$\fD\u0010\u0013\u0016r`v@SM%\f\u001eE\u0005\u0014~eD\u0019\u000b\u0011\u0015<\u0011\u0001\u0005\u0013no@L\u0017v";
        objectArray[35] = "0-j\u007f_E2'\u007f9/Aa<v Cs7y+{\u001f$e?/*E\u001al,tv/";
        objectArray[36] = ")\nx\u0006z9.Vk\u0006\u0014(CT5^q+,J9\u0007sB~@jX+=~Z}\u0004\u0014";
        objectArray[37] = "\u0011\u001cek\u001c \u0016@vkr2{B(3\u00172\u0014\\$j\u0015[\u0017Kr-\u000f<\u0019F )r";
        Object[] objectArray2 = objectArray;
        objectArray[38] = "E\r\u0006\u001e\u0004^\u0013KB\u0013m\u0000I^\u001d\u001d:^\u0012\u0003Iq]\u000fXV\u0015\u0017\u0016\u0011UP";
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = fH.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e3' || c == 'u' || c == '\u00c4' || c == 'P') {
                field = fH.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e3' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'u' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c4' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fH.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ed' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'F' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        block17: {
            CallSite callSite;
            CallSite callSite2;
            long l;
            long l2;
            long l3;
            block15: {
                CallSite callSite3;
                block16: {
                    long l4 = l3 = k ^ 0x9FAD0C30CC1L;
                    l2 = l4 ^ 0x3F373B22DDFL;
                    l = l4 ^ 0x473CDD525562L;
                    callSite3 = fH.b("\u00ed", (Object)aK2, (Object)new Object[0], (long)-727825267163731160L, (long)l3);
                    callSite2 = fH.b("F", (long)-727786081760823711L, (long)l3);
                    try {
                        callSite = callSite3;
                        if (callSite2 != null) break block15;
                        if (callSite != null) break block16;
                    }
                    catch (MatchException matchException) {
                        throw fH.b("F", (Object)matchException, (long)-727443145023143572L, (long)l3);
                    }
                    return;
                }
                callSite = callSite3;
            }
            try {
                if (!(callSite instanceof class_1657)) {
                    return;
                }
            }
            catch (MatchException matchException) {
                throw fH.b("F", (Object)matchException, (long)-727443145023143572L, (long)l3);
            }
            if (fH.b("\u00ed", (Object)fH.b("\u00ed", (Object)fH.b("\u00e3", (Object)b, (long)-727657973755965858L, (long)l3), (long)-727285487524705412L, (long)l3), (long)-727593116700702230L, (long)l3) == fH.b("\u00c4", (long)-726770562417030560L, (long)l3)) {
                CallSite callSite4;
                block20: {
                    CallSite callSite5;
                    block21: {
                        callSite5 = null;
                        int n = 0;
                        while (true) {
                            block19: {
                                Object object;
                                block18: {
                                    try {
                                        try {
                                            try {
                                                if (n > (int)fH.l) break;
                                                if (callSite2 != null) break block17;
                                            }
                                            catch (MatchException matchException) {
                                                throw fH.b("F", (Object)matchException, (long)-727443145023143572L, (long)l3);
                                            }
                                            Object[] objectArray = new Object[2];
                                            objectArray[1] = l2;
                                            objectArray[0] = fH.b("\u00ed", (Object)fH.b("\u00ed", (Object)fH.b("\u00e3", (Object)b, (long)-727657973755965858L, (long)l3), (long)-727126021585314379L, (long)l3), (int)n, (long)-727050228111951197L, (long)l3);
                                            object = fH.b("F", (Object)objectArray, (long)-727024542529559270L, (long)l3);
                                            if (callSite2 != null) break block18;
                                        }
                                        catch (MatchException matchException) {
                                            throw fH.b("F", (Object)matchException, (long)-727443145023143572L, (long)l3);
                                        }
                                        if (object == false) break block19;
                                    }
                                    catch (MatchException matchException) {
                                        throw fH.b("F", (Object)matchException, (long)-727443145023143572L, (long)l3);
                                    }
                                    object = n;
                                }
                                callSite5 = fH.b("F", (int)object, (long)-727504814153620550L, (long)l3);
                                break;
                            }
                            ++n;
                        }
                        try {
                            callSite4 = callSite5;
                            if (callSite2 != null) break block20;
                            if (callSite4 != null) break block21;
                        }
                        catch (MatchException matchException) {
                            throw fH.b("F", (Object)matchException, (long)-727443145023143572L, (long)l3);
                        }
                        return;
                    }
                    fH.b("\u00ed", (Object)aK2, (Object)new Object[0], (long)-727723805408926595L, (long)l3);
                    callSite4 = callSite5;
                }
                Object[] objectArray = new Object[4];
                objectArray[3] = l;
                objectArray[2] = true;
                objectArray[1] = () -> fH.lambda$onAttackEntity$0(aK2);
                objectArray[0] = (int)fH.b("\u00ed", callSite4, (long)-727376028086388608L, (long)l3);
                fH.b("F", (Object)objectArray, (long)-726947786142339777L, (long)l3);
            }
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (fH.n[n3] != null) {
            return n3;
        }
        Object object = m[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 1;
            case 1 -> 57;
            case 2 -> 58;
            case 3 -> 43;
            case 4 -> 38;
            case 5 -> 8;
            case 6 -> 22;
            case 7 -> 54;
            case 8 -> 61;
            case 9 -> 46;
            case 10 -> 21;
            case 11 -> 42;
            case 12 -> 0;
            case 13 -> 35;
            case 14 -> 52;
            case 15 -> 20;
            case 16 -> 27;
            case 17 -> 4;
            case 18 -> 62;
            case 19 -> 32;
            case 20 -> 7;
            case 21 -> 28;
            case 22 -> 25;
            case 23 -> 11;
            case 24 -> 39;
            case 25 -> 40;
            case 26 -> 29;
            case 27 -> 23;
            case 28 -> 19;
            case 29 -> 16;
            case 30 -> 45;
            case 31 -> 9;
            case 32 -> 37;
            case 33 -> 18;
            case 34 -> 26;
            case 35 -> 53;
            case 36 -> 6;
            case 37 -> 3;
            case 38 -> 49;
            case 39 -> 48;
            case 40 -> 47;
            case 41 -> 60;
            case 42 -> 31;
            case 43 -> 10;
            case 44 -> 24;
            case 45 -> 33;
            case 46 -> 55;
            case 47 -> 44;
            case 48 -> 50;
            case 49 -> 51;
            case 50 -> 56;
            case 51 -> 41;
            case 52 -> 2;
            case 53 -> 34;
            case 54 -> 12;
            case 55 -> 63;
            case 56 -> 17;
            case 57 -> 36;
            case 58 -> 59;
            case 59 -> 30;
            case 60 -> 15;
            case 61 -> 13;
            case 62 -> 14;
            default -> 5;
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
        fH.n[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = fH.m(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            String string = fH.n[n];
            int n2 = string.indexOf(8);
            Class clazz = fH.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fH.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fH.g(clazz3, string2, clazz2)) != null) {
                    fH.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fH.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fH.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fH.n(1677177180068891L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = fH.m(l, l2);
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
                String string2 = fH.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = fH.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fH.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fH.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        fH.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fH.n(1677177180068891L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fH.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fH.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fH.n(1677177180068891L, 0L);
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

    private static void lambda$onAttackEntity$0(aK aK2) {
        long l = k ^ 0x478B5A21FC7FL;
        long l2 = l ^ 0x25282D663878L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = fH.b("\u00ed", (Object)aK2, (Object)new Object[0], (long)385181699937672086L, (long)l);
        fH.b("F", (Object)objectArray, (long)384527442685336866L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fH.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bl_0;
import dev.zprestige.prestige.cT;
import dev.zprestige.prestige.cz_0;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.x_0;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class cR
implements cz_0 {
    private final ArrayList a;
    private static long c;
    private static float d;
    private static final long e;
    private static final Object[] f;
    private static final String[] g;

    public cR(long l) {
        long l2 = (l = e ^ l) ^ 0x5D8B7F82A11EL;
        this.a = new ArrayList();
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = this;
        cR.a("\u00d2", (Object)cR.a("\u00f2", (long)7502519383363241425L, (long)l), (Object)objectArray, (long)7502598710181649463L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = hc.a(-54911233732265899L, 3629719937354039595L, MethodHandles.lookup().lookupClass()).a(39942100784018L);
        long l = e ^ 0x722E0D39813BL;
        f = new Object[40];
        g = new String[40];
        cR.a();
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -3073967418852099055L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                long l3 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                c = l3;
                d = 0.0f;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (g[n3] != null) {
            return n3;
        }
        Object object = f[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 16;
            case 1 -> 47;
            case 2 -> 36;
            case 3 -> 6;
            case 4 -> 18;
            case 5 -> 51;
            case 6 -> 28;
            case 7 -> 46;
            case 8 -> 21;
            case 9 -> 61;
            case 10 -> 14;
            case 11 -> 35;
            case 12 -> 59;
            case 13 -> 45;
            case 14 -> 24;
            case 15 -> 58;
            case 16 -> 15;
            case 17 -> 3;
            case 18 -> 30;
            case 19 -> 9;
            case 20 -> 39;
            case 21 -> 32;
            case 22 -> 34;
            case 23 -> 17;
            case 24 -> 54;
            case 25 -> 56;
            case 26 -> 13;
            case 27 -> 31;
            case 28 -> 20;
            case 29 -> 4;
            case 30 -> 55;
            case 31 -> 0;
            case 32 -> 42;
            case 33 -> 50;
            case 34 -> 26;
            case 35 -> 44;
            case 36 -> 2;
            case 37 -> 52;
            case 38 -> 22;
            case 39 -> 43;
            case 40 -> 19;
            case 41 -> 38;
            case 42 -> 12;
            case 43 -> 29;
            case 44 -> 41;
            case 45 -> 57;
            case 46 -> 63;
            case 47 -> 27;
            case 48 -> 40;
            case 49 -> 48;
            case 50 -> 5;
            case 51 -> 37;
            case 52 -> 23;
            case 53 -> 49;
            case 54 -> 10;
            case 55 -> 62;
            case 56 -> 53;
            case 57 -> 7;
            case 58 -> 1;
            case 59 -> 11;
            case 60 -> 60;
            case 61 -> 25;
            case 62 -> 8;
            default -> 33;
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
        cR.g[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'T' || c == '\u00ef' || c == '\u00f2' || c == '\u00d3') {
                field = cR.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'T' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ef' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = cR.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c9' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = cR.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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
        int n = cR.e(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = g[n];
                int n3 = string2.indexOf(8);
                clazz3 = cR.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = cR.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = cR.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        cR.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = cR.f(225373764466264L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = cR.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        cR.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = cR.f(225373764466264L, 0L);
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
            int n = cR.e(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                cR.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = cR.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = cR.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = cR.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = cR.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cR" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @bP
    public void a(bl_0 bl_02) {
        CallSite callSite;
        CallSite callSite2;
        long l;
        long l2;
        block9: {
            block10: {
                l2 = e ^ 0x295A5C0B0F19L;
                l = l2 ^ 0x68A4A550D41AL;
                d = (float)(cR.a("\u00c9", (long)2079497378020990711L, (long)l2) - c) * 0.005f;
                c = (long)cR.a("\u00c9", (long)2079497378020990711L, (long)l2);
                callSite2 = cR.a("\u00c9", (long)2077609263736721429L, (long)l2);
                try {
                    callSite = cR.a("\u00d2", (Object)this.a, (long)2079361248027760806L, (long)l2);
                    if (callSite2 != null) break block9;
                    if (callSite == false) break block10;
                }
                catch (MatchException matchException) {
                    throw cR.a("\u00c9", (Object)matchException, (long)2079285478421453911L, (long)l2);
                }
                return;
            }
            callSite = cR.a("\u00d2", (Object)cR.a("\u00d2", (Object)b, (long)2078042284357230200L, (long)l2), (long)2077560083501560940L, (long)l2);
        }
        float f = (float)callSite;
        float f10 = 2.0f / f;
        CallSite callSite3 = cR.a("\u00d2", (Object)new Matrix4f(), (float)f10, (float)f10, (float)1.0f, (long)2077819819324552770L, (long)l2);
        float f11 = (float)cR.a("\u00d2", (Object)cR.a("\u00d2", (Object)b, (long)2078042284357230200L, (long)l2), (long)2079166678011116221L, (long)l2) / 2.0f;
        float f12 = (float)cR.a("\u00d2", (Object)cR.a("\u00d2", (Object)b, (long)2078042284357230200L, (long)l2), (long)2079187300335489377L, (long)l2) / 2.0f;
        float f13 = 150.0f;
        float f14 = 30.0f;
        float f15 = f11 - f13 - 10.0f;
        float f16 = f12 - 50.0f;
        CallSite callSite4 = cR.a("\u00d2", (Object)this.a, (long)2079426117931376369L, (long)l2);
        while (cR.a("\u00d2", (Object)callSite4, (long)2077443424249456558L, (long)l2) != false) {
            boolean bl;
            cT cT2;
            block13: {
                block14: {
                    block11: {
                        float f17;
                        block12: {
                            cT2 = (cT)((Object)cR.a("\u00d2", (Object)callSite4, (long)2078112268579248136L, (long)l2));
                            try {
                                try {
                                    bl = cT2.h;
                                    if (callSite2 != null) break block11;
                                    if (!bl) break block12;
                                }
                                catch (MatchException matchException) {
                                    throw cR.a("\u00c9", (Object)matchException, (long)2079285478421453911L, (long)l2);
                                }
                                cR.a("\u00d2", (Object)callSite4, (long)2077359162624303465L, (long)l2);
                                if (callSite2 == null) continue;
                            }
                            catch (MatchException matchException) {
                                throw cR.a("\u00c9", (Object)matchException, (long)2079285478421453911L, (long)l2);
                            }
                        }
                        bl = ((f17 = f16 - f12 / 4.0f) == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1)) != 0;
                    }
                    try {
                        if (callSite2 != null) break block13;
                        if (bl <= false) break block14;
                    }
                    catch (MatchException matchException) {
                        throw cR.a("\u00c9", (Object)matchException, (long)2079285478421453911L, (long)l2);
                    }
                    bl = true;
                    break block13;
                }
                bl = false;
            }
            boolean bl2 = bl;
            Object[] objectArray = new Object[9];
            objectArray[8] = l;
            objectArray[7] = bl2;
            objectArray[6] = Float.valueOf(f14);
            objectArray[5] = Float.valueOf(f13);
            objectArray[4] = Float.valueOf(f16);
            objectArray[3] = Float.valueOf(f15);
            objectArray[2] = bl_02.b;
            objectArray[1] = bl_02.a;
            objectArray[0] = callSite3;
            f16 -= cR.a("\u00d2", (Object)cT2, (Object)objectArray, (long)2077304006015725155L, (long)l2);
            if (callSite2 == null) continue;
        }
    }

    public void a(Object[] objectArray) {
        block11: {
            CallSite callSite;
            String string = (String)objectArray[0];
            String string2 = (String)objectArray[1];
            long l = (Long)objectArray[2];
            x_0 x_02 = (x_0)((Object)objectArray[3]);
            long l2 = (Long)objectArray[4];
            long l3 = (l2 = e ^ l2) ^ 0x72762BC25028L;
            CallSite callSite2 = cR.a("\u00d2", new ArrayList(this.a), (long)4426454801434689351L, (long)l2);
            CallSite callSite3 = cR.a("\u00c9", (long)4423467940707873187L, (long)l2);
            while (cR.a("\u00d2", (Object)callSite2, (long)4423372595054904856L, (long)l2) != false) {
                block13: {
                    block14: {
                        CallSite callSite4;
                        cT cT2;
                        cT cT3;
                        block12: {
                            cT3 = (cT)((Object)cR.a("\u00d2", (Object)callSite2, (long)4422682309935905214L, (long)l2));
                            try {
                                try {
                                    try {
                                        try {
                                            callSite = cR.a("\u00d2", cT3.a, (Object)string, (long)4426000021461252784L, (long)l2);
                                            if (callSite3 != null) break block11;
                                            if (callSite3 != null) break block12;
                                        }
                                        catch (MatchException matchException) {
                                            throw cR.a("\u00c9", (Object)matchException, (long)4426313965967932897L, (long)l2);
                                        }
                                        if (callSite == false) break block13;
                                    }
                                    catch (MatchException matchException) {
                                        throw cR.a("\u00c9", (Object)matchException, (long)4426313965967932897L, (long)l2);
                                    }
                                    cT2 = cT3;
                                    if (callSite3 != null) break block14;
                                }
                                catch (MatchException matchException) {
                                    throw cR.a("\u00c9", (Object)matchException, (long)4426313965967932897L, (long)l2);
                                }
                                callSite4 = cR.a("\u00d2", cT2.b, (Object)string2, (long)4426000021461252784L, (long)l2);
                            }
                            catch (MatchException matchException) {
                                throw cR.a("\u00c9", (Object)matchException, (long)4426313965967932897L, (long)l2);
                            }
                        }
                        try {
                            if (callSite4 == false) break block13;
                            cT3.g = 1;
                            cT2 = cT3;
                        }
                        catch (MatchException matchException) {
                            throw cR.a("\u00c9", (Object)matchException, (long)4426313965967932897L, (long)l2);
                        }
                    }
                    cT2.f = 0;
                }
                if (callSite3 == null) continue;
            }
            callSite = cR.a("\u00d2", (Object)this.a, (Object)new cT(string, string2, l, x_02, l3), (long)4425912986770113692L, (long)l2);
        }
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "UZhH0\u0002UZ\u007f\u0014<\rO\u0011\u007f\n<\u0018H`/Wm";
        objectArray[1] = "[\u001cv\u000eM\u0003[\u001caRA\fAWaLA\u0019F&3\u0010\u0014[";
        objectArray[2] = "QTW\u0015\u0013LO\\MZtM^G@\u0000RK";
        objectArray[3] = "\u0010\u0018Bji_\u001b\u0017S%\bQ\u0010\u001cW\u007f";
        objectArray[4] = "4WU-\u001e~\"WPw\ri5\u001cSq\u0001}$[DfJo\u0018";
        objectArray[5] = "IYFuy\u0002<yMzhMAa^}a\u0004)";
        objectArray[6] = "z\u000f{\u0019y3x\u00112zr(g\u0014d\u0003u";
        objectArray[7] = Float.TYPE;
        cR.g[7] = "java/lang/Float";
        objectArray[8] = "\u0018A\u001dm(\u0000\u000eA\u00187;\u0017\u0019\n\u001b17\u0003\bM\f&|\u0013(";
        objectArray[9] = "\u001d\u001f7\u0006y)h?<\thf\t17\u0002l<}";
        objectArray[10] = Void.TYPE;
        cR.g[10] = "java/lang/Void";
        objectArray[11] = Boolean.TYPE;
        cR.g[11] = "java/lang/Boolean";
        objectArray[12] = Integer.TYPE;
        cR.g[12] = "java/lang/Integer";
        objectArray[13] = "3w\u001bgh\"%w\u001e={52<\u001d;w!#{\n,<1\u0005";
        objectArray[14] = "/LM@<!$C\\\u000f_,1NSdj. ]OH}#";
        objectArray[15] = "\u001eE\u000b=mx\u0000M\u0011r\u0002\u007f\u0006E\u0004\u0010*~\u0000";
        objectArray[16] = "qsN*n>z|_e\u0013+hf]&";
        objectArray[17] = Long.TYPE;
        cR.g[17] = "java/lang/Long";
        objectArray[18] = "C'U\u001b\"FH(DT_^[/M\u001d";
        objectArray[19] = "yRO\"ZboRJxIux\u0019I~Eai^^i\u000eqq^\\bT<ME\\\u007fT{zR";
        objectArray[20] = "P}sx\u0003FF}v\"\u0010QQ6u$\u001cE@qb3WT{";
        objectArray[21] = "\u0017&yl/:b\u0006rc>u\u0003\byh:/w";
        objectArray[22] = "c)yBn\u0019p4q$nLs&uH\\\u001b5x\"\u001f\u000b^f9l\u001bp\u0010t&\u0012";
        objectArray[23] = "\\#-9\u001b*\u0019+$>z*\b);U@s\u001b+.m\u00162\\eG";
        objectArray[24] = "\u0017\u001bM\u000e\u000efA\u0002\u001c\u0002bu-X\u001eV\\cA\u0015B\u0015\u0018\u001f";
        objectArray[25] = "=B\fD3)`Y\u0016\u0000_'QD\u001d\f\"5=H\u001aL/";
        objectArray[26] = "QYbr;v]^\"\u007fCs<Z)w.$\u0006P\u007fm1\u001a\u0003\fci/b\u0003Pm~C";
        objectArray[27] = " \u001cc\u0000G\u0002d\u001cj\u001d-\u0012w\u0016j\u001d-Um\u0011?\t\u0014\u000bgG|p\u0011\u0018rNwIO\u0012$\r\u000eL\\\u0007-\u00067\u0012VQn\u007f2\u0013@\u0019v\u0014v\u0013I\u0004\u001c";
        objectArray[28] = "h\u0015j|Y\u00019\u0016!8\"\u0014U\u001c`9OCo\u00166#P}i\u00035p[D7\tc3\"";
        objectArray[29] = "\u001c\u0013ja,jY\u001bcfMvH\fgs \f\u001aQqk!t\u001a\r\u007f|M";
        objectArray[30] = "P1}s0\u000e\u00159ttQ\b\u00000Qr!\u0014i{~.i\u0011\u001bz.u`h";
        objectArray[31] = "F%\u000e<pF\b7\u0011B*PE,\u0016.\u0018\u0001\u0005}LB\u007fE\u0000v\u0015-~P^sq";
        objectArray[32] = "r]P\u0006[\bxTPXa\rC\u0004U\u0007\u001e\u0007/Q\u0005\u001a\u0013d*Q\u000b\u001a\u0002\b\u007f\u0001\u0016\u0017a";
        objectArray[33] = "\u0016 `nL\b\u001ad93q\u000f\u0004\u0013;&\r\u001f\u007fn7oI\u0017\rog4@n";
        objectArray[34] = "FY\f]p\rJ\u001dU\u0000M\nSJH\u00041\fU'\u000b\u0017'\u0007NAN\u001f.\u0000/";
        objectArray[35] = "\u0016RQ\u0005\u001d.FXI\u001dt\u007f\u0001\u0013N\t\u0012h \bQ\t1u\u0018\rU\u001ft\u007f\u0011\nZ\u001dDwB\u0017^d";
        objectArray[36] = "u.k\u007f\u0014U'*t{{\\g+rr\u00001$ied\u0012\tr(\"*{\u0001wg#o\t\u0000'<*\u0016";
        objectArray[37] = "L'xFf7@c!\u001b[8I5FLd/W0~\u001a%h\u0019Yv\u001fji\\+wO1`%";
        objectArray[38] = "Nz8'\u00171\u0000h'YM'Ms 5\u007fv\r#vY\u00182\b)#6\u0019'V,G";
        Object[] objectArray2 = objectArray;
        objectArray[39] = "\u007f\u001b\u0016yQ\u000e1\t\t\u0007\u000b\u0018|\u0012\u000ek9I=JW\u0007^\r9H\rh_\u0018gMi";
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    public boolean a(Object[] objectArray) {
        Object object;
        block2: {
            block3: {
                long l = (Long)objectArray[0];
                l = e ^ l;
                CallSite callSite = cR.a("\u00c9", (long)-4050041130895324405L, (long)l);
                try {
                    object = cR.a("\u00d2", (Object)this.a, (long)-4051801935936912456L, (long)l);
                    if (callSite != null) break block2;
                    if (object != false) break block3;
                }
                catch (MatchException matchException) {
                    throw cR.a("\u00c9", (Object)matchException, (long)-4051725968645716151L, (long)l);
                }
                object = 1;
                break block2;
            }
            object = 0;
        }
        return (boolean)object;
    }

    private static Field g(long l, long l2) {
        int n = cR.e(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = cR.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = cR.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = cR.c(clazz3, string2, clazz2)) != null) {
                    cR.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = cR.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        cR.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = cR.f(225373764466264L, 0L);
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
            return MethodHandles.lookup().findStatic(cR.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


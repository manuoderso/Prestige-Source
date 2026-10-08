/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2824
 *  net.minecraft.class_2868
 *  net.minecraft.class_2885
 *  net.minecraft.class_2886
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.a9;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bh_0;
import dev.zprestige.prestige.cz_0;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraft.class_2824;
import net.minecraft.class_2868;
import net.minecraft.class_2885;
import net.minecraft.class_2886;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.cq
 */
public class cq_0
implements cz_0 {
    private int a;
    private boolean c;
    private static final long d = hc.a(-8340597618444264887L, 3084157190247114730L, MethodHandles.lookup().lookupClass()).a(175042339549016L);
    private static final Object[] e = new Object[36];
    private static final String[] f = new String[36];

    public cq_0(long l) {
        long l2 = (l = d ^ l) ^ 0x508B3B0D16AEL;
        this.a = -1;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = this;
        cq_0.a("L", (Object)cq_0.a("p", (long)-2328804608201496003L, (long)l), (Object)objectArray, (long)-2328758798868701541L, (long)l);
    }

    static {
        cq_0.a();
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
            case 0 -> 17;
            case 1 -> 48;
            case 2 -> 30;
            case 3 -> 26;
            case 4 -> 28;
            case 5 -> 9;
            case 6 -> 15;
            case 7 -> 12;
            case 8 -> 49;
            case 9 -> 8;
            case 10 -> 19;
            case 11 -> 43;
            case 12 -> 37;
            case 13 -> 52;
            case 14 -> 46;
            case 15 -> 18;
            case 16 -> 11;
            case 17 -> 57;
            case 18 -> 56;
            case 19 -> 33;
            case 20 -> 0;
            case 21 -> 3;
            case 22 -> 59;
            case 23 -> 14;
            case 24 -> 27;
            case 25 -> 41;
            case 26 -> 7;
            case 27 -> 38;
            case 28 -> 4;
            case 29 -> 51;
            case 30 -> 62;
            case 31 -> 53;
            case 32 -> 60;
            case 33 -> 29;
            case 34 -> 61;
            case 35 -> 55;
            case 36 -> 58;
            case 37 -> 6;
            case 38 -> 34;
            case 39 -> 42;
            case 40 -> 31;
            case 41 -> 25;
            case 42 -> 22;
            case 43 -> 36;
            case 44 -> 2;
            case 45 -> 24;
            case 46 -> 1;
            case 47 -> 39;
            case 48 -> 54;
            case 49 -> 32;
            case 50 -> 35;
            case 51 -> 21;
            case 52 -> 23;
            case 53 -> 44;
            case 54 -> 10;
            case 55 -> 40;
            case 56 -> 5;
            case 57 -> 47;
            case 58 -> 50;
            case 59 -> 63;
            case 60 -> 16;
            case 61 -> 13;
            case 62 -> 45;
            default -> 20;
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
        cq_0.f[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e6' || c == '\u00d1' || c == 'p' || c == 'V') {
                field = cq_0.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e6' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d1' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'p' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = cq_0.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'L' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'D' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public void b(Object[] objectArray) {
        block4: {
            cq_0 cq_02;
            long l;
            long l2;
            long l3;
            block5: {
                l3 = (Long)objectArray[0];
                long l4 = l3 = d ^ l3;
                l2 = l4 ^ 0x3583AFB31040L;
                l = l4 ^ 0x7F79616652EAL;
                CallSite callSite = cq_0.a("D", (long)3839361929349287995L, (long)l3);
                try {
                    try {
                        cq_02 = this;
                        if (callSite != null) break block4;
                        if (cq_02.a != -1) break block5;
                    }
                    catch (MatchException matchException) {
                        throw cq_0.a("D", (Object)matchException, (long)3838840652331186664L, (long)l3);
                    }
                    return;
                }
                catch (MatchException matchException) {
                    throw cq_0.a("D", (Object)matchException, (long)3838840652331186664L, (long)l3);
                }
            }
            this.c = 1;
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l;
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l2;
            objectArray3[0] = new class_2868((int)cq_0.a("D", (Object)objectArray2, (long)3839693607382662078L, (long)l3));
            cq_0.a("D", (Object)objectArray3, (long)3838776726902923397L, (long)l3);
            this.c = 0;
            cq_02 = this;
        }
        cq_02.a = -1;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = cq_0.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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

    private static Method h(long l, long l2) {
        int n = cq_0.e(l, l2);
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
                clazz3 = cq_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = cq_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = cq_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        cq_0.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = cq_0.f(1677695486588449L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = cq_0.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        cq_0.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = cq_0.f(1677695486588449L, 0L);
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
            int n = cq_0.e(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                cq_0.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = cq_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = cq_0.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = cq_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = cq_0.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public void a(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = d ^ l) ^ 0x502FEB602697L;
        this.a = n;
        this.c = 1;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = new class_2868(n);
        cq_0.a("D", (Object)objectArray2, (long)257117171078321746L, (long)l);
        this.c = 0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @bP
    public void a(bh_0 var1_1) {
        block30: {
            block35: {
                block34: {
                    block33: {
                        block31: {
                            block32: {
                                block29: {
                                    v0 = var2_2 = cq_0.d ^ 105842915434681L;
                                    var4_3 = v0 ^ 79982487273910L;
                                    var6_4 = v0 ^ 111138606175735L;
                                    var8_5 = cq_0.a("D", (long)-2769961588570637060L, (long)var2_2);
                                    try {
                                        try {
                                            v1 /* !! */  = this.a;
                                            if (var8_5 != null) break block29;
                                            if (v1 /* !! */  == -1) break block30;
                                        }
                                        catch (MatchException v2) {
                                            throw cq_0.a("D", (Object)v2, (long)-2773807310013229777L, (long)var2_2);
                                        }
                                        v1 /* !! */  = cq_0.a("L", (Object)var1_1, (Object)new Object[0], (long)-2773718445658845935L, (long)var2_2) instanceof class_2868;
                                    }
                                    catch (MatchException v3) {
                                        throw cq_0.a("D", (Object)v3, (long)-2773807310013229777L, (long)var2_2);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                if (var8_5 != null) break block31;
                                                if (v1 /* !! */  == 0) break block32;
                                            }
                                            catch (MatchException v4) {
                                                throw cq_0.a("D", (Object)v4, (long)-2773807310013229777L, (long)var2_2);
                                            }
                                            v1 /* !! */  = (int)this.c;
                                            if (var8_5 != null) break block31;
                                        }
                                        catch (MatchException v5) {
                                            throw cq_0.a("D", (Object)v5, (long)-2773807310013229777L, (long)var2_2);
                                        }
                                        if (v1 /* !! */  != 0) break block32;
                                    }
                                    catch (MatchException v6) {
                                        throw cq_0.a("D", (Object)v6, (long)-2773807310013229777L, (long)var2_2);
                                    }
                                    cq_0.a("L", (Object)var1_1, (Object)new Object[0], (long)-2770101993524671032L, (long)var2_2);
                                    return;
                                }
                                catch (MatchException v7) {
                                    throw cq_0.a("D", (Object)v7, (long)-2773807310013229777L, (long)var2_2);
                                }
                            }
                            v1 /* !! */  = cq_0.a("L", (Object)var1_1, (Object)new Object[0], (long)-2773718445658845935L, (long)var2_2) instanceof class_2886;
                        }
                        try {
                            try {
                                if (var8_5 != null) break block33;
                                if (v1 /* !! */  == 0) {
                                }
                                ** GOTO lbl88
                            }
                            catch (MatchException v8) {
                                throw cq_0.a("D", (Object)v8, (long)-2773807310013229777L, (long)var2_2);
                            }
                            v1 /* !! */  = cq_0.a("L", (Object)var1_1, (Object)new Object[0], (long)-2773718445658845935L, (long)var2_2) instanceof class_2885;
                        }
                        catch (MatchException v9) {
                            throw cq_0.a("D", (Object)v9, (long)-2773807310013229777L, (long)var2_2);
                        }
                    }
                    try {
                        try {
                            if (var8_5 != null) break block34;
                            if (v1 /* !! */  == 0) {
                            }
                            ** GOTO lbl88
                        }
                        catch (MatchException v10) {
                            throw cq_0.a("D", (Object)v10, (long)-2773807310013229777L, (long)var2_2);
                        }
                        v1 /* !! */  = cq_0.a("L", (Object)var1_1, (Object)new Object[0], (long)-2773718445658845935L, (long)var2_2) instanceof class_2824;
                    }
                    catch (MatchException v11) {
                        throw cq_0.a("D", (Object)v11, (long)-2773807310013229777L, (long)var2_2);
                    }
                }
                try {
                    try {
                        if (var8_5 != null) break block35;
                        if (v1 /* !! */  == 0) break block30;
                    }
                    catch (MatchException v12) {
                        throw cq_0.a("D", (Object)v12, (long)-2773807310013229777L, (long)var2_2);
                    }
                    v13 = new Object[2];
                    v13[1] = var4_3;
                    v13[0] = cq_0.a("L", (Object)cq_0.a("\u00e6", (Object)cq_0.b, (long)-2769720939410764697L, (long)var2_2), (long)-2770244375311087893L, (long)var2_2);
                    v1 /* !! */  = (int)cq_0.a("D", (Object)v13, (long)-2773743819967333089L, (long)var2_2);
                }
                catch (MatchException v14) {
                    throw cq_0.a("D", (Object)v14, (long)-2773807310013229777L, (long)var2_2);
                }
            }
            try {
                if (v1 /* !! */  == 0) break block30;
lbl88:
                // 3 sources

                v15 = new Object[1];
                v15[0] = var6_4;
                cq_0.a("L", (Object)this, (Object)v15, (long)-2770025457355524689L, (long)var2_2);
            }
            catch (MatchException v16) {
                throw cq_0.a("D", (Object)v16, (long)-2773807310013229777L, (long)var2_2);
            }
        }
    }

    @bP
    public void a(a9 a92) {
        block5: {
            cq_0 cq_02;
            long l;
            long l2;
            block4: {
                l2 = d ^ 0x314127D548A1L;
                l = l2 ^ 0x341627917DEFL;
                CallSite callSite = cq_0.a("D", (long)-1038273648232753948L, (long)l2);
                try {
                    try {
                        cq_02 = this;
                        if (callSite != null) break block4;
                        if (cq_02.a == -1) break block5;
                    }
                    catch (MatchException matchException) {
                        throw cq_0.a("D", (Object)matchException, (long)-1037756522149266121L, (long)l2);
                    }
                    cq_02 = this;
                }
                catch (MatchException matchException) {
                    throw cq_0.a("D", (Object)matchException, (long)-1037756522149266121L, (long)l2);
                }
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l;
            cq_0.a("L", (Object)cq_02, (Object)objectArray, (long)-1038443070267466313L, (long)l2);
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cq" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    public int a(Object[] objectArray) {
        return this.a;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "\u001c\u001b`TNJ\n\u001be\u000e]]\u001dPf\bQI\f\u0017q\u001f\u001a[0";
        objectArray[1] = "`u9Ky0\u0015U2Dh\u007fhM!Ca6\u0000";
        objectArray[2] = "\u000fcwr.\u0003\u0019cr(=\u0014\u000e(q.1\u0000\u001fof9z\u0010\u0019";
        objectArray[3] = "!C|f\u0016YTcwi\u0007\u00165m|b\u0003LA";
        objectArray[4] = Integer.TYPE;
        cq_0.f[4] = "java/lang/Integer";
        objectArray[5] = "=P4|}N+P1&nY<\u001b2 bM-\\%7)]j";
        objectArray[6] = "s%\u0019{\u001e\u001b\u0006\u0005\u0012t\u000fTg\u000b\u0019\u007f\u000b\u000e\u0013";
        objectArray[7] = Void.TYPE;
        cq_0.f[7] = "java/lang/Void";
        objectArray[8] = "aQ\u001a/9\\wQ\u001fu*K`\u001a\u001cs&_q]\u000bdmOt";
        objectArray[9] = "+\u001a\u0018/\u000bX \u0015\t`hU5\u0018\u0006\u000b]W$\u000b\u001a'JZ";
        objectArray[10] = "\u0019hZ\u001b5\u0017lHQ\u0014$X\rFZ\u001f \u0002y";
        objectArray[11] = "+M\t0y=+M\u001elu21\u0006\u001eru'6wN/$";
        objectArray[12] = "ei\u0000V2@ei\u0017\n>O\u007f\"\u0017\u0014>ZxSCLi";
        objectArray[13] = "\u001a\u0006`N\\5o&kAMz\u000e(`JI z";
        objectArray[14] = "(_G9#!>_Bc06)\u0014Ae<\"8SVrw3$";
        objectArray[15] = "\u001b\u0016tyOon6\u007fv^ \u000f8t}Zz{";
        objectArray[16] = "q\u0012\u001aPd\rq\u0012\r\fh\u0002kY\r\u0012h\u0017l(\\K0R";
        objectArray[17] = "2Ebb\u0014~2Eu>\u0018q(\u000eu \u0018d/\u007f'{@.";
        objectArray[18] = "#5\u000ft'$V\u0015\u0004{6k7\u001b\u000fp21C";
        objectArray[19] = Boolean.TYPE;
        cq_0.f[19] = "java/lang/Boolean";
        objectArray[20] = "B,\u0017\t/#T,\u0012S<4Cg\u0011U0 R \u0006B{0J \u0004I!}v;\u0004T!:A,";
        objectArray[21] = "^\u0000M\u0018\u001e<H\u0000HB\r+_KKD\u0001?N\f\\SJ.u";
        objectArray[22] = "\u0017{\bM\nUb[\u0003B\u001b\u001a\u0003U\bI\u001f@w";
        objectArray[23] = "D@9gqxOO((\u0010vDD,r";
        objectArray[24] = ";\u0005J0tul\u0015B^{L>\u0011\u0010cv}v\u001aE4\u0011";
        objectArray[25] = "x\\E|BjkO@r88\u0015]\u0000\u007fZ3iNDbV";
        objectArray[26] = "\u0015:u\\\n`\u0006~hPkux)jP[~\u0003% ]\u000e\u001cE}.U\u0004v\byo^k";
        objectArray[27] = "+[\tG8*n\u001aOS\u0003(uNS@T\u007f+\u0019\u000b,3$x\u001f\u000e\u001c;+%N";
        objectArray[28] = "5N+J<\t=Av\u001b\u0005\\hP'\u0011in;\u0014{I\u0005R4\u00135GyKwN7v";
        objectArray[29] = "\u0004h).sDV&4b\u0015\u0011=v\"p%\u001aFzh}px\u0007j(tu\u0000\\\u007f0x\u0015";
        objectArray[30] = "\u001b.D%d\u0013L>LKh*I*A{cQE`L.\u0001\u0017\u001dnD$kZ\u0019/OK";
        objectArray[31] = "LV_UwzOW\u0019IF~qH]@vv\nD\u0017M#\u0014L\u001c\u0019E)~\u0001\u0018XNF";
        objectArray[32] = "s\u001c=D\u001awrP6\u0007*#H\u000f\"X\u001a(3\u0003hUOJu[f]E 8_'V*";
        objectArray[33] = "`ow&X\bcn1:i\u000f]!m1X\u001b%rlb\ffc|bl\u0014\u001e0}18i";
        objectArray[34] = ":B\u0011Dahh\f\f\b\u0007=\u0003\\\u001a\u001a76xPP\u0017bToIX\u001f|4hV\u0007\u001f\u0007";
        Object[] objectArray2 = objectArray;
        objectArray[35] = "\u001fL \u0017\u001aZ\u000f\u001a*\u0017t\nv\u001b8\u001bD\u0001\r\u0017r\u0016\u0011c\u001cH&\u001b\u0016\bLL'\u001at";
    }

    private static Field g(long l, long l2) {
        int n = cq_0.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = cq_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = cq_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = cq_0.c(clazz3, string2, clazz2)) != null) {
                    cq_0.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = cq_0.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        cq_0.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = cq_0.f(1677695486588449L, 0L);
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
            return MethodHandles.lookup().findStatic(cq_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


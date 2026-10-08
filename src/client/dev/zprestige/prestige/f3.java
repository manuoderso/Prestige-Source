/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1511
 *  net.minecraft.class_1657
 *  net.minecraft.class_2338
 *  net.minecraft.class_310
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.A;
import dev.zprestige.prestige.f4;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.EnumSet;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_1657;
import net.minecraft.class_2338;
import net.minecraft.class_310;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class f3 {
    private static final class_310 a;
    private static final int b;
    private static final double c = 5.0;
    public static final f4 d;
    private static final long e;
    private static final Object[] f;
    private static final String[] g;

    private f3() {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = hc.a(-1488813897043726476L, -8157238687723036608L, MethodHandles.lookup().lookupClass()).a(107691147417508L);
        long l = e ^ 0x7A94637C79ADL;
        f = new Object[82];
        g = new String[82];
        f3.a();
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -4104456027667863946L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                long l3 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                b = (int)l3;
                a = f3.a("b", (long)-2476911760955036296L, (long)l);
                d = new f4(null, 0.0f, 0.0f);
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = f3.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = f3.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = f3.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = f3.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = f3.a(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                f3.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static f4 b(Object[] objectArray) {
        class_1657 class_16572 = (class_1657)objectArray[0];
        EnumSet enumSet = (EnumSet)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = (l = e ^ l) ^ 0x1ADD47B3C3FCL;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l2;
        objectArray2[2] = Float.valueOf(1.0f);
        objectArray2[1] = enumSet;
        objectArray2[0] = class_16572;
        return f3.a("b", (Object)objectArray2, (long)-6638024483745066554L, (long)l);
    }

    private static Field c(long l, long l2) {
        int n = f3.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = f3.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = f3.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = f3.a(clazz3, string2, clazz2)) != null) {
                    f3.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = f3.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        f3.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = f3.b(1646562830749883L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static f4 c(Object[] objectArray) {
        float f;
        float f10;
        long l;
        float f11;
        A a;
        f4 f42;
        block7: {
            float f12;
            block8: {
                f42 = (f4)objectArray[0];
                a = (A)((Object)objectArray[1]);
                f11 = ((Float)objectArray[2]).floatValue();
                f12 = ((Float)objectArray[3]).floatValue();
                l = (Long)objectArray[4];
                l = e ^ l;
                CallSite callSite = f3.a("b", (long)-4364499792199870314L, (long)l);
                try {
                    try {
                        f10 = f11;
                        f = 0.0f;
                        if (callSite != null) break block7;
                        if (!(f10 <= f)) break block8;
                    }
                    catch (MatchException matchException) {
                        throw f3.a("b", (Object)matchException, (long)-4365760751134254257L, (long)l);
                    }
                    return f42;
                }
                catch (MatchException matchException) {
                    throw f3.a("b", (Object)matchException, (long)-4365760751134254257L, (long)l);
                }
            }
            f10 = f11 * a.confidence;
            f = f12;
        }
        float f13 = f10 * f;
        try {
            if (f13 <= f42.c) {
                return f42;
            }
        }
        catch (MatchException matchException) {
            throw f3.a("b", (Object)matchException, (long)-4365760751134254257L, (long)l);
        }
        return new f4(a, f11, f13);
    }

    private static Method d(long l, long l2) {
        int n = f3.a(l, l2);
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
                clazz3 = f3.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = f3.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = f3.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        f3.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = f3.b(1646562830749883L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = f3.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        f3.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = f3.b(1646562830749883L, 0L);
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/f3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method a(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = f3.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'L' || c == '\u00b5' || c == '\u00fe' || c == '\u00fd') {
                field = f3.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'L' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00b5' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00fe' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = f3.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e3' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'b' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static float a(Object[] objectArray) {
        CallSite callSite;
        double d;
        Object object;
        long l;
        class_1657 class_16572;
        block14: {
            CallSite callSite2;
            block13: {
                class_16572 = (class_1657)objectArray[0];
                l = (Long)objectArray[1];
                long l2 = (l = e ^ l) ^ 0x2781514C0256L;
                callSite2 = f3.a("b", (long)3125832243030913177L, (long)l);
                try {
                    try {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l2;
                        objectArray2[0] = f3.a("\u00e3", (Object)class_16572, (long)3127448265187094444L, (long)l);
                        object = f3.a("b", (Object)objectArray2, (long)3126708324539483734L, (long)l);
                        if (callSite2 != null) break block13;
                        if (object == false) return 0.0f;
                    }
                    catch (MatchException matchException) {
                        throw f3.a("b", (Object)matchException, (long)3127383767207129920L, (long)l);
                    }
                    reference cfr_temp_0 = f3.a("L", (Object)class_16572, (long)3133267970162742783L, (long)l) - 1.5;
                    object = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                }
                catch (MatchException matchException) {
                    throw f3.a("b", (Object)matchException, (long)3127383767207129920L, (long)l);
                }
            }
            try {
                try {
                    try {
                        if (callSite2 != null) break block14;
                        if (object <= 0) return 0.0f;
                    }
                    catch (MatchException matchException) {
                        throw f3.a("b", (Object)matchException, (long)3127383767207129920L, (long)l);
                    }
                    d = (double)f3.a("\u00e3", (Object)class_16572, (long)3127005875814650663L, (long)l);
                    callSite = f3.a("\u00e3", (Object)f3.a("L", (Object)a, (long)3125954706033299180L, (long)l), (long)3125775341563460712L, (long)l);
                    if (callSite2 != null) return (float)(d + callSite);
                }
                catch (MatchException matchException) {
                    throw f3.a("b", (Object)matchException, (long)3127383767207129920L, (long)l);
                }
                double d10 = d - callSite;
                object = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
            }
            catch (MatchException matchException) {
                throw f3.a("b", (Object)matchException, (long)3127383767207129920L, (long)l);
            }
        }
        try {
            if (object <= 0) {
                return 0.0f;
            }
        }
        catch (MatchException matchException) {
            throw f3.a("b", (Object)matchException, (long)3127383767207129920L, (long)l);
        }
        d = 6.0;
        callSite = f3.a("L", (Object)class_16572, (long)3133267970162742783L, (long)l) * 5.0;
        return (float)(d + callSite);
    }

    private static boolean a(Object[] objectArray) {
        Object object;
        block2: {
            block3: {
                class_1657 class_16572 = (class_1657)objectArray[0];
                class_2338 class_23382 = (class_2338)objectArray[1];
                long l = (Long)objectArray[2];
                l = e ^ l;
                CallSite callSite = f3.a("b", (long)7810375953849628572L, (long)l);
                try {
                    reference cfr_temp_0 = f3.a("\u00e3", (Object)class_16572, (double)((double)f3.a("\u00e3", (Object)class_23382, (long)7817433565186835937L, (long)l) + 0.5), (double)((double)f3.a("\u00e3", (Object)class_23382, (long)7817326941409996799L, (long)l) + 0.5), (double)((double)f3.a("\u00e3", (Object)class_23382, (long)7818103857362163978L, (long)l) + 0.5), (long)7817484435076580056L, (long)l) - 25.0;
                    object = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                    if (callSite != null) break block2;
                    if (object >= 0) break block3;
                }
                catch (MatchException matchException) {
                    throw f3.a("b", (Object)matchException, (long)7810256220346938437L, (long)l);
                }
                object = 1;
                break block2;
            }
            object = 0;
        }
        return (boolean)object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static f4 a(Object[] objectArray) {
        Object object;
        Object object2;
        long l;
        long l2;
        long l3;
        float f;
        class_1657 class_16572;
        block38: {
            EnumSet enumSet;
            block37: {
                float f10;
                CallSite callSite;
                CallSite callSite2;
                long l4;
                long l5;
                block35: {
                    block36: {
                        long l6;
                        block32: {
                            block33: {
                                block31: {
                                    class_310 class_3102;
                                    block30: {
                                        class_16572 = (class_1657)objectArray[0];
                                        enumSet = (EnumSet)objectArray[1];
                                        f = ((Float)objectArray[2]).floatValue();
                                        l3 = (Long)objectArray[3];
                                        long l7 = l3 = e ^ l3;
                                        l2 = l7 ^ 0x1F0307D5A376L;
                                        l5 = l7 ^ 0x4EF26A782915L;
                                        l4 = l7 ^ 0xC08979E7652L;
                                        l = l7 ^ 0x1E4E392D4B79L;
                                        l6 = l7 ^ 0x29BFFC39D4A5L;
                                        callSite2 = f3.a("b", (long)-4316360763561926687L, (long)l3);
                                        try {
                                            try {
                                                class_3102 = a;
                                                if (callSite2 != null) break block30;
                                                if (f3.a("L", (Object)class_3102, (long)-4316273486139514476L, (long)l3) == null) return d;
                                            }
                                            catch (MatchException matchException) {
                                                throw f3.a("b", (Object)matchException, (long)-4314824564907385800L, (long)l3);
                                            }
                                            class_3102 = a;
                                        }
                                        catch (MatchException matchException) {
                                            throw f3.a("b", (Object)matchException, (long)-4314824564907385800L, (long)l3);
                                        }
                                    }
                                    try {
                                        try {
                                            if (f3.a("L", (Object)class_3102, (long)-4314904433682560620L, (long)l3) == null) return d;
                                            if (class_16572 != null) break block31;
                                            return d;
                                        }
                                        catch (MatchException matchException) {
                                            throw f3.a("b", (Object)matchException, (long)-4314824564907385800L, (long)l3);
                                        }
                                    }
                                    catch (MatchException matchException) {
                                        throw f3.a("b", (Object)matchException, (long)-4314824564907385800L, (long)l3);
                                    }
                                }
                                object2 = d;
                                try {
                                    object = f3.a("\u00e3", (Object)enumSet, (Object)((Object)A.CRYSTAL), (long)-4315117204395907131L, (long)l3);
                                    if (callSite2 != null) break block32;
                                    if (object == false) break block33;
                                }
                                catch (MatchException matchException) {
                                    throw f3.a("b", (Object)matchException, (long)-4314824564907385800L, (long)l3);
                                }
                                callSite = f3.a("\u00e3", (Object)f3.a("\u00e3", (Object)f3.a("L", (Object)a, (long)-4314904433682560620L, (long)l3), (long)-4322924702440215316L, (long)l3), (long)-4316305598172270147L, (long)l3);
                                while (f3.a("\u00e3", (Object)callSite, (long)-4314715090187219297L, (long)l3) != false) {
                                    class_1297 class_12972;
                                    block34: {
                                        class_12972 = (class_1297)f3.a("\u00e3", (Object)callSite, (long)-4322721218329374497L, (long)l3);
                                        try {
                                            try {
                                                object = class_12972 instanceof class_1511;
                                                if (callSite2 != null) break block32;
                                                if (object != false) break block34;
                                            }
                                            catch (MatchException matchException) {
                                                throw f3.a("b", (Object)matchException, (long)-4314824564907385800L, (long)l3);
                                            }
                                            if (callSite2 == null) continue;
                                        }
                                        catch (MatchException matchException) {
                                            throw f3.a("b", (Object)matchException, (long)-4314824564907385800L, (long)l3);
                                        }
                                    }
                                    Object[] objectArray2 = new Object[3];
                                    objectArray2[2] = l4;
                                    objectArray2[1] = f3.a("\u00e3", (Object)f3.a("\u00e3", (Object)class_12972, (long)-4323251260652971682L, (long)l3), (long)-4315415860865139441L, (long)l3);
                                    objectArray2[0] = f3.a("L", (Object)a, (long)-4316273486139514476L, (long)l3);
                                    float f11 = (float)f3.a("\u00e3", (Object)f3.a("\u00fe", (long)-4315553932230882006L, (long)l3), (Object)objectArray2, (long)-4322853223289826112L, (long)l3);
                                    Object[] objectArray3 = new Object[5];
                                    objectArray3[4] = l2;
                                    objectArray3[3] = Float.valueOf(f);
                                    objectArray3[2] = Float.valueOf(f11);
                                    objectArray3[1] = A.CRYSTAL;
                                    objectArray3[0] = object2;
                                    object2 = f3.a("b", (Object)objectArray3, (long)-4315332682742743887L, (long)l3);
                                    if (callSite2 == null) continue;
                                }
                            }
                            object = f3.a("\u00e3", (Object)enumSet, (Object)((Object)A.ANCHOR), (long)-4315117204395907131L, (long)l3);
                        }
                        try {
                            if (callSite2 != null) break block35;
                            if (object == false) break block36;
                        }
                        catch (MatchException matchException) {
                            throw f3.a("b", (Object)matchException, (long)-4314824564907385800L, (long)l3);
                        }
                        Object[] objectArray4 = new Object[3];
                        objectArray4[2] = l5;
                        objectArray4[1] = arg_0 -> f3.lambda$evaluate$0(class_16572, arg_0);
                        objectArray4[0] = 5;
                        callSite = f3.a("b", (Object)objectArray4, (long)-4322573726658342387L, (long)l3);
                        CallSite callSite3 = f3.a("\u00e3", (Object)callSite, (long)-4323134343161441228L, (long)l3);
                        while (f3.a("\u00e3", (Object)callSite3, (long)-4314715090187219297L, (long)l3) != false) {
                            class_2338 class_23382 = (class_2338)f3.a("\u00e3", (Object)callSite3, (long)-4322721218329374497L, (long)l3);
                            Object[] objectArray5 = new Object[3];
                            objectArray5[2] = l6;
                            objectArray5[1] = f3.a("\u00e3", (Object)class_23382, (long)-4315415860865139441L, (long)l3);
                            objectArray5[0] = f3.a("L", (Object)a, (long)-4316273486139514476L, (long)l3);
                            f10 = (float)f3.a("\u00e3", (Object)f3.a("\u00fe", (long)-4315553932230882006L, (long)l3), (Object)objectArray5, (long)-4314557240556814184L, (long)l3);
                            Object[] objectArray6 = new Object[5];
                            objectArray6[4] = l2;
                            objectArray6[3] = Float.valueOf(f);
                            objectArray6[2] = Float.valueOf(f10);
                            objectArray6[1] = A.ANCHOR;
                            objectArray6[0] = object2;
                            object2 = f3.a("b", (Object)objectArray6, (long)-4315332682742743887L, (long)l3);
                            try {
                                if (callSite2 == null) {
                                    if (callSite2 == null) continue;
                                    break;
                                }
                                break block37;
                            }
                            catch (MatchException matchException) {
                                throw f3.a("b", (Object)matchException, (long)-4314824564907385800L, (long)l3);
                            }
                        }
                    }
                    object = f3.a("\u00e3", (Object)enumSet, (Object)((Object)A.OBSIDIAN), (long)-4315117204395907131L, (long)l3);
                }
                try {
                    try {
                        try {
                            if (callSite2 != null) break block38;
                            if (object == false) break block37;
                        }
                        catch (MatchException matchException) {
                            throw f3.a("b", (Object)matchException, (long)-4314824564907385800L, (long)l3);
                        }
                        object = f3.a("\u00e3", (Object)f3.a("L", (Object)a, (long)-4316273486139514476L, (long)l3), (long)-4323043216004863586L, (long)l3);
                        if (callSite2 != null) break block38;
                    }
                    catch (MatchException matchException) {
                        throw f3.a("b", (Object)matchException, (long)-4314824564907385800L, (long)l3);
                    }
                    if (object != false) break block37;
                }
                catch (MatchException matchException) {
                    throw f3.a("b", (Object)matchException, (long)-4314824564907385800L, (long)l3);
                }
                Object[] objectArray7 = new Object[3];
                objectArray7[2] = l5;
                objectArray7[1] = arg_0 -> f3.lambda$evaluate$1(class_16572, arg_0);
                objectArray7[0] = 5;
                callSite = f3.a("b", (Object)objectArray7, (long)-4322573726658342387L, (long)l3);
                CallSite callSite4 = f3.a("\u00e3", (Object)callSite, (long)-4323134343161441228L, (long)l3);
                while (f3.a("\u00e3", (Object)callSite4, (long)-4314715090187219297L, (long)l3) != false) {
                    class_2338 class_23383 = (class_2338)f3.a("\u00e3", (Object)callSite4, (long)-4322721218329374497L, (long)l3);
                    Object[] objectArray8 = new Object[3];
                    objectArray8[2] = l4;
                    objectArray8[1] = f3.a("\u00e3", (Object)f3.a("\u00e3", (Object)class_23383, (long)-4315267162010429697L, (long)l3), (long)-4315415860865139441L, (long)l3);
                    objectArray8[0] = f3.a("L", (Object)a, (long)-4316273486139514476L, (long)l3);
                    f10 = (float)f3.a("\u00e3", (Object)f3.a("\u00fe", (long)-4315553932230882006L, (long)l3), (Object)objectArray8, (long)-4322853223289826112L, (long)l3);
                    Object[] objectArray9 = new Object[5];
                    objectArray9[4] = l2;
                    objectArray9[3] = Float.valueOf(f);
                    objectArray9[2] = Float.valueOf(f10);
                    objectArray9[1] = A.OBSIDIAN;
                    objectArray9[0] = object2;
                    object2 = f3.a("b", (Object)objectArray9, (long)-4315332682742743887L, (long)l3);
                    try {
                        if (callSite2 != null) return object2;
                        if (callSite2 == null) continue;
                        break;
                    }
                    catch (MatchException matchException) {
                        throw f3.a("b", (Object)matchException, (long)-4314824564907385800L, (long)l3);
                    }
                }
            }
            object = f3.a("\u00e3", (Object)enumSet, (Object)((Object)A.MACE), (long)-4315117204395907131L, (long)l3);
        }
        if (object == false) return object2;
        Object[] objectArray10 = new Object[2];
        objectArray10[1] = l;
        objectArray10[0] = class_16572;
        CallSite callSite = f3.a("b", (Object)objectArray10, (long)-4314649032191323046L, (long)l3);
        if (!(callSite > 0.0f)) return object2;
        Object[] objectArray11 = new Object[5];
        objectArray11[4] = l2;
        objectArray11[3] = Float.valueOf(f);
        objectArray11[2] = Float.valueOf((float)callSite);
        objectArray11[1] = A.MACE;
        objectArray11[0] = object2;
        return f3.a("b", (Object)objectArray11, (long)-4315332682742743887L, (long)l3);
    }

    private static int a(long l, long l2) {
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
            case 0 -> 8;
            case 1 -> 51;
            case 2 -> 60;
            case 3 -> 36;
            case 4 -> 58;
            case 5 -> 56;
            case 6 -> 31;
            case 7 -> 2;
            case 8 -> 30;
            case 9 -> 32;
            case 10 -> 22;
            case 11 -> 63;
            case 12 -> 23;
            case 13 -> 41;
            case 14 -> 21;
            case 15 -> 48;
            case 16 -> 28;
            case 17 -> 24;
            case 18 -> 37;
            case 19 -> 35;
            case 20 -> 57;
            case 21 -> 53;
            case 22 -> 47;
            case 23 -> 40;
            case 24 -> 25;
            case 25 -> 10;
            case 26 -> 33;
            case 27 -> 55;
            case 28 -> 12;
            case 29 -> 54;
            case 30 -> 34;
            case 31 -> 5;
            case 32 -> 44;
            case 33 -> 27;
            case 34 -> 42;
            case 35 -> 46;
            case 36 -> 18;
            case 37 -> 50;
            case 38 -> 61;
            case 39 -> 11;
            case 40 -> 38;
            case 41 -> 9;
            case 42 -> 52;
            case 43 -> 16;
            case 44 -> 19;
            case 45 -> 3;
            case 46 -> 6;
            case 47 -> 14;
            case 48 -> 29;
            case 49 -> 1;
            case 50 -> 39;
            case 51 -> 15;
            case 52 -> 26;
            case 53 -> 59;
            case 54 -> 17;
            case 55 -> 0;
            case 56 -> 13;
            case 57 -> 62;
            case 58 -> 4;
            case 59 -> 49;
            case 60 -> 43;
            case 61 -> 7;
            case 62 -> 20;
            default -> 45;
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
        f3.g[n3] = new String(cArray);
        return n3;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "\u0005=4g\u000bb\u0005=#;\u0007m\u001fv#%\u0007x\u0018\u0007w}P";
        objectArray[1] = Double.TYPE;
        f3.g[1] = "java/lang/Double";
        objectArray[2] = "R,X{R\u0016R,O'^\u0019HgO9^\fO\u0016\u001af\u0007";
        objectArray[3] = "/\\\u0003\f\rW/\\\u0014P\u0001X5\u0017\u0014N\u0001M2fE\u0011S\u0006";
        objectArray[4] = "Tf\u0002zVOTf\u0015&Z@N-\u00158ZUI\\Db\u0003\u0016";
        objectArray[5] = " \u00182\u0015;\u00066\u00187O(\u0011!S4I$\u00050\u0014#^o\u0017\f";
        objectArray[6] = "\u001dXu#JFhx~,[\t\u0015`m+R@}";
        objectArray[7] = "b Cv\u0011=b T*\u001d2xkT4\u001d'\u007f\u001a\u0005jHb";
        objectArray[8] = "pkM<Z@pkZ`VOj Z~VZmQ\u000b \u0003\u0011";
        objectArray[9] = "9U./\u0013\u000f9U9s\u001f\u0000#\u001e9m\u001f\u0015$oi0N";
        objectArray[10] = "a+_DMaw+Z\u001e^v``Y\u0018Rbq'N\u000f\u0019w6";
        objectArray[11] = "#pBF\u0010\u001f(\u007fS\ts\u0012=r\\bF\u0010,a@NQ\u001d";
        objectArray[12] = Integer.TYPE;
        f3.g[12] = "java/lang/Integer";
        objectArray[13] = "s=F'0Q\u0006\u001dM(!\u001eg\u0013F#%D\u0013";
        objectArray[14] = Boolean.TYPE;
        f3.g[14] = "java/lang/Boolean";
        objectArray[15] = "\u0017ri?bObRb0s\u0000\u0003\\i;wZw";
        objectArray[16] = "\u001d\u0002<\u0003(Q\u000b\u00029Y;F\u001cI:_7R\r\u000e-H|GM";
        objectArray[17] = "\u001da\u0018clk\u001da\u000f?`d\u0007*\u000f!`q\u0000[]{45";
        objectArray[18] = "\n>V\u000b\u0014\u0007\n>AW\u0018\b\u0010uAI\u0018\u001d\u0017\u0004\u0013\u0012@W";
        objectArray[19] = "\f\u000e\u001dtp>\u001a\u000e\u0018.c)\rE\u001b(o=\u001c\u0002\f?$-\u001a";
        objectArray[20] = "X\\9_Y\u0010-|2PH_Lr9[L\u00058";
        objectArray[21] = "Zws(y\u0002Qxbg\u001e\u001aUdd+;\u000b";
        objectArray[22] = "9U\b\u001d{H']\u0012R\u001cI6F\u001f\b:O";
        objectArray[23] = "JrB\u0010>FA}S__HJvW\u0005";
        objectArray[24] = "]NG\u0013+\u0012KNBI8\u0005\\\u0005AO4\u0011MBVX\u007f\u0003V";
        objectArray[25] = "\u0019^TS\u001f\u0017l~_\\\u000eX\rpTW\n\u0002y";
        objectArray[26] = "GU<yjcY]&6\b\u007f^@";
        objectArray[27] = "\u0010\u001d\u0010y\u0005+e=\u001bv\u0014d\u00043\u0010}\u0010>p";
        objectArray[28] = Float.TYPE;
        f3.g[28] = "java/lang/Float";
        objectArray[29] = "\"t\u0013c\u0002f\"t\u0004?\u000ei8?\u0004!\u000e|?NV\u007fV8";
        objectArray[30] = "\u0003/_\u007f}{\u0015/Z%nl\u0002dY#bx\u0013#N4)j&";
        objectArray[31] = "K7_Eo\">\u0017TJ~m_\u0019_Az7+";
        objectArray[32] = "]y\u0012\u001dj-Ky\u0017Gy:\\2\u0014Au.Mu\u0003V>>Uu\u0001]dsin\u0001@d4^y";
        objectArray[33] = "*\rRe\u0007\u001e_-Yj\u0016Q>#Ra\u0012\u000bJ";
        objectArray[34] = "1\u0003^G\u0001H1\u0003I\u001b\rG+HI\u0005\rR,9\u0018]_";
        objectArray[35] = "38R#=h-0HlVs,4w'g";
        objectArray[36] = " X\u000el\u0016\u000eUx\u0005c\u0007A4v\u000eh\u0003\u001b@";
        objectArray[37] = "`gg\u0019zE`gpEvJz,p[v_}]!\u0000!\u0015";
        objectArray[38] = "\u007fq\u0017o+6t~\u0006 F5x`\u0000|d8yu";
        objectArray[39] = "b\u0000\u0006R^fb\u0000\u0011\u000eRixK\u0011\u0010R|\u007f:@K\u0007>";
        objectArray[40] = "K\u000fk\u0007e\u0003K\u000f|[i\fQD|Ei\u0019V5-\u001e=R";
        objectArray[41] = "uH.8xw~G?w\u001fukL?<$";
        objectArray[42] = "UHW\u0002b+\u000fFP<e9BL[PWn\u0005\u0017\u0005\f\u0000&XV\u0002\\;>_H<";
        objectArray[43] = "\b;mXK\u0000Mti\u0012p\t_8f\u0004\u001c;\u000b}8^LlKxy\u001a\u001b\tR'j\rp\u0015Tyx\u001d@\\J>7c";
        objectArray[44] = "&\u0017\u0018#5{5\u000e\f~Ex7\u001c\u0010q9~1q\u0004e\u007fd;M\u000fr!bK";
        objectArray[45] = ",vxg@Sv!'4#\u0005\u0010ps)\u001a^(%~a\u001ao";
        objectArray[46] = "e}\u001a\u0014.%8?\u0005\u001bJ/8b\u001b\u0011\u001dxa6EAJ\u007feh\u0018\u0003(8g4A";
        objectArray[47] = "-!\u0015VJ[i\"BJ&\u000fr M\\qX,w\u00150M\u0005xsKO\u0017\u000b\u007f";
        objectArray[48] = "Bp\u0017Z\u001fT\u0006s@Fs\u0000\u001dqOP$WB,\u0014<J\u001e\u001fpJDN\u0014Dm";
        objectArray[49] = "\u001e A;!\nZ#\u0016'MUM0\u001d:!g\u0019q@dM\u000eLp\u001b1wJO'\u0007]";
        objectArray[50] = ";ETw\u0003]*FCd~^=\u0001^m\u0012lnE\u00025~P3FYt\u0007A1D\u0003\n";
        objectArray[51] = "gp\u0015q\u0006\b2#\u0007ew\u0018X}P`\u000e\u000e#2\u000bp\u0011qhw\u0015f\b\n',\u0005yw";
        objectArray[52] = "]\u0010\"\u0002\u0005U\bC0\u0016tEbU1\u0016\u000fG\u0019V6\nE,\u0000N?V\u000bB\u0018Pl\u0017t";
        objectArray[53] = "\b\u0017R%\b\\\u0003\u0000\f#x\u0000\u000f\u0011.5\b\u001cf\u0003\u0001e\u0011\u001c\u001e[P5\u0015`";
        objectArray[54] = "t%kz$\u0018)gtu@\u0012):j\u007f\u0017Fsn3)@Bt0im\"\u0005vl0";
        objectArray[55] = "`H\u0019c\u001f\u0015:\u0002\u001f8p\u0012\u0004\nN~\u000b\u001a\u007f\tIbAqv\u0014X:\u0010Jn\u0013F\u0004";
        objectArray[56] = "u.?\u001f\u0010m'&,\u000f(m\u00190?\u001bSab38\u0007\u0019\np!n\bTr(p>\f(";
        objectArray[57] = "T:\u001alnhMdWlUe1`R/2dU:\u0018)i";
        objectArray[58] = "\rd&\u0016\u001fiX74\u0002n{2!5\u0002\u0015{I\"2\u001e_\u0010Xbe\u0013\u0012m\\#)\u001cn";
        objectArray[59] = "OJ\u0004_\u0002\u0004\u0004^C_?\u000f\u0018N\u001c\u0006S=I\fA\\\u000fj\u0013U\f\\^\r\u0019SB\u0007?";
        objectArray[60] = "g\nPIHtv\tGZ5waNZSYE6\t\u0001\r\u0005\u0012~T@\nU)fS^4";
        objectArray[61] = "%g3\u0015YRnst\u0015dYrc+L\bk&'s\u001bX<%g3\u0015YRnst\u0015d";
        objectArray[62] = "\u001fgN\u0015\"QJ4\\\u0001SA \"]\u0001(C[!Z\u001db(Ja\r\u0010/UN A\u001fS";
        objectArray[63] = "\\\u0019.T_>^WhV>%\\\u0000lC_(@f\u007f\u0015X)Z\u001d~R\u0004<;\u000fy\u0017W2CW(GSN";
        objectArray[64] = "* \u0012@\u001bOa4U@&D}$\n\u0019Jv)`P@\u001e! 8\u001b\u001bAM+8\u0004\u0004&";
        objectArray[65] = "Z#\u0003Op$\u0000i\u0005\u0014\u001f)>aTRd+EbSN.@L\u007fB\u0016\u007f{Tx\\(";
        objectArray[66] = ">Z'\r^y:P|\u0010?djV$\u0006SV7\u0011~Y?;\u007fRz\\Qpk\u0015za\u0005~l\u0011\u007f\r@1h[D";
        objectArray[67] = "$qvBQy/f(D!#'|0?Nz,k-DO=p~L";
        objectArray[68] = "PL$\u0015u\u0015\r\u000e;\u001a\u0011\u001f\rS%\u0010FHT\u0003}D\u0011OPY&\u0002s\bR\u0005\u007f";
        objectArray[69] = "\u00120B;\u0012~\u00185\u0015'*t}3A8Qv\u00060F$\u001b\u001d\u001c!\u0013?He\u001f-\u0011 *";
        objectArray[70] = "~RO\u0000&P5\u000eA\u0000CZe\u0003I\r\u0014\u000e?W\u001d^CO=S\u0013_;]b\u0007N";
        objectArray[71] = "hQhO\tzyR\u007f\\trb\u0004f^#\";P=2\u0006zyWb\t\u001e}g";
        objectArray[72] = "s\u0014\u001a&Xib\u0017\r5%juP\u0010<IX%\u0012Lj%}~VN;\u001eeyHp)Cu&LK1Dk\u0018^\u0016!\u001bo#F\u0011?%}~VN;\u001eeyHp";
        objectArray[73] = "S,\u001f3)1\u00188X3\u0014:\u0004(\u0007jx\bPl]3/_Y4\u0016hs3R4\tw\u0014";
        objectArray[74] = "!\u0016rA*\u000f8\u0005>MV_<\u0010QK2C7l?B'[=\u00004B8DZ";
        objectArray[75] = "8Qh\u0019axd]3\u0015\u0005r6M2\u001di@a\roC8\u0017aI*D8y*]mD\u0005";
        objectArray[76] = "+REj.\u0002q\\BT)\u0010<VI8\u001bG|\u0006\u0014dL\u0014)\u000bG(4Lx[CT";
        objectArray[77] = "KO\u0004_m}HC\u0006@\u000fdVH@KsbP%T_5xZ\u0019_Hk~*";
        objectArray[78] = "f\u0012\u0007~!\u0005b\u0018\\c@\u00182\u001e\u0004u,*fR]+z}2\u0004\u0016)0\u001f!\u001d\u0002t@";
        objectArray[79] = "[/:{Mg\u0010;}{pl\f+\"\"\u001c^Xox{L\tQ73 \u0017eZ7,?p";
        objectArray[80] = "W0\u001fT\u007fG\u0012\u007f\u001b\u001eDN\u00003\u0014\b(|WqNWx+Ss\u0013\b:I\u0014qOQD";
        Object[] objectArray2 = objectArray;
        objectArray[81] = "Ev$h)c\u0010%6|Xsz37|#q\u000100`i\u001a\u0013\"fo$bKs6kX";
    }

    private static boolean lambda$evaluate$0(class_1657 class_16572, class_2338 class_23382) {
        int n;
        block10: {
            block8: {
                CallSite callSite;
                CallSite callSite2;
                long l;
                block9: {
                    l = e ^ 0x1849BA90DC33L;
                    long l2 = l ^ 0x6EE03A72B05CL;
                    callSite2 = f3.a("b", (long)8663074374788490177L, (long)l);
                    try {
                        try {
                            try {
                                Object[] objectArray = new Object[3];
                                objectArray[2] = l2;
                                objectArray[1] = class_23382;
                                objectArray[0] = class_16572;
                                if (f3.a("b", (Object)objectArray, (long)8657691190588128505L, (long)l) == false) break block8;
                                callSite = f3.a("\u00e3", (Object)f3.a("L", (Object)a, (long)8664426199837865396L, (long)l), (Object)class_23382, (long)8656634364532067465L, (long)l);
                                if (callSite2 != null) break block9;
                            }
                            catch (MatchException matchException) {
                                throw f3.a("b", (Object)matchException, (long)8664627804898025496L, (long)l);
                            }
                            if (f3.a("\u00e3", (Object)callSite, (long)8657670236752350833L, (long)l) != f3.a("\u00fe", (long)8664802042303354164L, (long)l)) break block8;
                        }
                        catch (MatchException matchException) {
                            throw f3.a("b", (Object)matchException, (long)8664627804898025496L, (long)l);
                        }
                        callSite = f3.a("\u00e3", (Object)f3.a("L", (Object)a, (long)8664426199837865396L, (long)l), (Object)class_23382, (long)8656634364532067465L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw f3.a("b", (Object)matchException, (long)8664627804898025496L, (long)l);
                    }
                }
                try {
                    n = f3.a("\u00e3", (Object)((Integer)((Object)f3.a("\u00e3", (Object)callSite, (Object)f3.a("\u00fe", (long)8656935371499373530L, (long)l), (long)8662928341600747082L, (long)l))), (long)8656084489957309522L, (long)l);
                    if (callSite2 != null) break block10;
                    if (n == false) break block8;
                }
                catch (MatchException matchException) {
                    throw f3.a("b", (Object)matchException, (long)8664627804898025496L, (long)l);
                }
                n = 1;
                break block10;
            }
            n = false;
        }
        return n != 0;
    }

    private static boolean lambda$evaluate$1(class_1657 class_16572, class_2338 class_23382) {
        int n;
        block15: {
            block13: {
                CallSite callSite;
                CallSite callSite2;
                long l;
                block14: {
                    Object object;
                    CallSite callSite3;
                    block12: {
                        l = e ^ 0x5A097042FE47L;
                        long l2 = l ^ 0x2CA0F0A09228L;
                        callSite3 = f3.a("b", (long)6506908157449372085L, (long)l);
                        try {
                            try {
                                double d = (double)f3.a("\u00e3", (Object)class_23382, (long)6509267842942917078L, (long)l) - f3.a("\u00e3", (Object)f3.a("L", (Object)a, (long)6507031435287609280L, (long)l), (long)6506854562016382276L, (long)l);
                                object = d == 0.0 ? 0 : (d < 0.0 ? -1 : 1);
                                if (callSite3 != null) break block12;
                                if (object >= 0) break block13;
                            }
                            catch (MatchException matchException) {
                                throw f3.a("b", (Object)matchException, (long)6506209785572573804L, (long)l);
                            }
                            Object[] objectArray = new Object[3];
                            objectArray[2] = l2;
                            objectArray[1] = class_23382;
                            objectArray[0] = class_16572;
                            object = f3.a("b", (Object)objectArray, (long)6508279825014890125L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw f3.a("b", (Object)matchException, (long)6506209785572573804L, (long)l);
                        }
                    }
                    try {
                        try {
                            try {
                                if (object == false) break block13;
                                callSite2 = f3.a("\u00e3", (Object)f3.a("\u00e3", (Object)f3.a("L", (Object)a, (long)6506148917665486784L, (long)l), (Object)class_23382, (long)6509611683463147261L, (long)l), (long)6508400154193341445L, (long)l);
                                callSite = f3.a("\u00fe", (long)6509773184516246215L, (long)l);
                                if (callSite3 != null) break block14;
                            }
                            catch (MatchException matchException) {
                                throw f3.a("b", (Object)matchException, (long)6506209785572573804L, (long)l);
                            }
                            if (callSite2 != callSite) break block13;
                        }
                        catch (MatchException matchException) {
                            throw f3.a("b", (Object)matchException, (long)6506209785572573804L, (long)l);
                        }
                        callSite2 = f3.a("\u00e3", (Object)f3.a("\u00e3", (Object)f3.a("L", (Object)a, (long)6506148917665486784L, (long)l), (Object)f3.a("\u00e3", (Object)class_23382, (long)6505746385774332075L, (long)l), (long)6509611683463147261L, (long)l), (long)6508400154193341445L, (long)l);
                        callSite = f3.a("\u00fe", (long)6507129100386246971L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw f3.a("b", (Object)matchException, (long)6506209785572573804L, (long)l);
                    }
                }
                try {
                    if (callSite2 != callSite) break block13;
                    n = 1;
                    break block15;
                }
                catch (MatchException matchException) {
                    throw f3.a("b", (Object)matchException, (long)6506209785572573804L, (long)l);
                }
            }
            n = 0;
        }
        return n != 0;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(f3.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


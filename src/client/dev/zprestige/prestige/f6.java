/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  net.minecraft.class_1657
 *  net.minecraft.class_2663
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.a5;
import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bg_0;
import dev.zprestige.prestige.cz_0;
import dev.zprestige.prestige.hc;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashSet;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1657;
import net.minecraft.class_2663;

public class f6
implements cz_0 {
    private final Object2IntMap a;
    private final HashSet c;
    private static final long d = hc.a(6282604407237766811L, -4603876212157132401L, MethodHandles.lookup().lookupClass()).a(242994114486615L);
    private static final long e;
    private static final Object[] f;
    private static final String[] g;

    public f6(long l) {
        long l2 = (l = d ^ l) ^ 0x2DAC8A8BA0D6L;
        this.a = new Object2IntOpenHashMap();
        this.c = new HashSet();
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = this;
        f6.a("\u00fc", (Object)f6.a("q", (long)7626749680302814462L, (long)l), (Object)objectArray, (long)7627597207967317522L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        f = new Object[54];
        g = new String[54];
        f6.a();
        long l = d ^ 0x340697893FBCL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 8322858482924969480L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                e = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
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
            case 0 -> 7;
            case 1 -> 45;
            case 2 -> 60;
            case 3 -> 61;
            case 4 -> 36;
            case 5 -> 58;
            case 6 -> 57;
            case 7 -> 15;
            case 8 -> 28;
            case 9 -> 63;
            case 10 -> 62;
            case 11 -> 0;
            case 12 -> 38;
            case 13 -> 49;
            case 14 -> 12;
            case 15 -> 1;
            case 16 -> 34;
            case 17 -> 17;
            case 18 -> 2;
            case 19 -> 55;
            case 20 -> 6;
            case 21 -> 44;
            case 22 -> 50;
            case 23 -> 42;
            case 24 -> 39;
            case 25 -> 26;
            case 26 -> 54;
            case 27 -> 18;
            case 28 -> 30;
            case 29 -> 4;
            case 30 -> 59;
            case 31 -> 47;
            case 32 -> 9;
            case 33 -> 52;
            case 34 -> 43;
            case 35 -> 29;
            case 36 -> 27;
            case 37 -> 20;
            case 38 -> 35;
            case 39 -> 40;
            case 40 -> 21;
            case 41 -> 25;
            case 42 -> 19;
            case 43 -> 37;
            case 44 -> 53;
            case 45 -> 33;
            case 46 -> 41;
            case 47 -> 16;
            case 48 -> 10;
            case 49 -> 8;
            case 50 -> 5;
            case 51 -> 3;
            case 52 -> 51;
            case 53 -> 22;
            case 54 -> 46;
            case 55 -> 31;
            case 56 -> 48;
            case 57 -> 32;
            case 58 -> 14;
            case 59 -> 11;
            case 60 -> 56;
            case 61 -> 23;
            case 62 -> 24;
            default -> 13;
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
        f6.g[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f8' || c == 'r' || c == 'q' || c == '\u00aa') {
                field = f6.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f8' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'r' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'q' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = f6.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00fc' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00fd' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = f6.b(lookup, mutableCallSite, string, methodType, l, l2);
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
        int n = f6.e(l, l2);
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
                clazz3 = f6.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = f6.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = f6.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        f6.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = f6.f(221055551112726L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = f6.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        f6.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = f6.f(221055551112726L, 0L);
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
            int n = f6.e(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                f6.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = f6.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = f6.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = f6.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = f6.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @bP
    public void a(a5 a52) {
        long l = d ^ 0x2CD7F5308EB4L;
        f6.a("\u00fc", (Object)this.a, (long)6180587645705821064L, (long)l);
    }

    @bP
    public void a(bG bG2) {
        block28: {
            CallSite callSite;
            CallSite callSite2;
            long l;
            block25: {
                f6 f62;
                block23: {
                    block24: {
                        l = d ^ 0x7ADA4CFF822DL;
                        callSite2 = f6.a("\u00fd", (long)6435840956525763674L, (long)l);
                        try {
                            try {
                                f62 = this;
                                if (callSite2 != null) break block23;
                                if (f6.a("\u00fc", (Object)f62.a, (long)6438560457447786559L, (long)l) == false) break block24;
                            }
                            catch (MatchException matchException) {
                                throw f6.a("\u00fd", (Object)matchException, (long)6439310805965368417L, (long)l);
                            }
                            return;
                        }
                        catch (MatchException matchException) {
                            throw f6.a("\u00fd", (Object)matchException, (long)6439310805965368417L, (long)l);
                        }
                    }
                    f62 = this;
                }
                f6.a("\u00fc", (Object)f62.c, (long)6435783672378012545L, (long)l);
                CallSite callSite3 = f6.a("\u00fc", (Object)f6.a("\u00fc", (Object)f6.a("\u00f8", (Object)b, (long)6440079471567508511L, (long)l), (long)6439895383149935827L, (long)l), (long)6438881017140506273L, (long)l);
                while (f6.a("\u00fc", (Object)callSite3, (long)6439766429913896513L, (long)l) != false) {
                    block26: {
                        class_1657 class_16572 = (class_1657)f6.a("\u00fc", (Object)callSite3, (long)6439513896876529235L, (long)l);
                        CallSite callSite4 = f6.a("\u00fc", (Object)class_16572, (long)6439104500213438356L, (long)l);
                        try {
                            CallSite callSite5;
                            block27: {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        f6.a("\u00fc", (Object)this.c, (Object)callSite4, (long)6439833113929012571L, (long)l);
                                                        callSite = f6.a("\u00f8", (Object)class_16572, (long)6439263809392606059L, (long)l);
                                                        if (callSite2 != null) break block25;
                                                        if (callSite2 != null) break block26;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw f6.a("\u00fd", (Object)matchException, (long)6439310805965368417L, (long)l);
                                                    }
                                                    if (callSite > 0) break block27;
                                                }
                                                catch (MatchException matchException) {
                                                    throw f6.a("\u00fd", (Object)matchException, (long)6439310805965368417L, (long)l);
                                                }
                                                reference cfr_temp_0 = f6.a("\u00fc", (Object)class_16572, (long)6439393566580856753L, (long)l) - 0.0f;
                                                callSite5 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                                if (callSite2 != null) break block26;
                                            }
                                            catch (MatchException matchException) {
                                                throw f6.a("\u00fd", (Object)matchException, (long)6439310805965368417L, (long)l);
                                            }
                                            if (callSite5 <= 0) break block27;
                                        }
                                        catch (MatchException matchException) {
                                            throw f6.a("\u00fd", (Object)matchException, (long)6439310805965368417L, (long)l);
                                        }
                                        callSite5 = f6.a("\u00fc", (Object)class_16572, (long)6439991355671469705L, (long)l);
                                        if (callSite2 != null) break block26;
                                    }
                                    catch (MatchException matchException) {
                                        throw f6.a("\u00fd", (Object)matchException, (long)6439310805965368417L, (long)l);
                                    }
                                    if (callSite5 == false) break block26;
                                }
                                catch (MatchException matchException) {
                                    throw f6.a("\u00fd", (Object)matchException, (long)6439310805965368417L, (long)l);
                                }
                            }
                            callSite5 = f6.a("\u00fc", (Object)this.a, (Object)callSite4, (long)6440023508922585055L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw f6.a("\u00fd", (Object)matchException, (long)6439310805965368417L, (long)l);
                        }
                    }
                    if (callSite2 == null) continue;
                }
                callSite = f6.a("\u00fc", (Object)this.a, (long)6438560457447786559L, (long)l);
            }
            try {
                try {
                    if (callSite2 != null || callSite != false) break block28;
                }
                catch (MatchException matchException) {
                    throw f6.a("\u00fd", (Object)matchException, (long)6439310805965368417L, (long)l);
                }
                callSite = f6.a("\u00fc", (Object)f6.a("\u00fc", (Object)this.a, (long)6439016723494380388L, (long)l), (Object)this.c, (long)6438863673248529008L, (long)l);
            }
            catch (MatchException matchException) {
                throw f6.a("\u00fd", (Object)matchException, (long)6439310805965368417L, (long)l);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @bP
    public void a(bg_0 bg_02) {
        block13: {
            void var7_8;
            CallSite callSite;
            CallSite callSite2;
            long l;
            block15: {
                class_2663 class_26632;
                CallSite callSite3;
                block14: {
                    CallSite callSite4;
                    block12: {
                        l = d ^ 0x29DC43BCF851L;
                        callSite2 = f6.a("\u00fc", (Object)bg_02, (Object)new Object[0], (long)2533082784211592217L, (long)l);
                        callSite3 = f6.a("\u00fd", (long)2534647282962507302L, (long)l);
                        try {
                            try {
                                callSite4 = callSite2;
                                if (callSite3 != null) break block12;
                                if (!(callSite4 instanceof class_2663)) break block13;
                            }
                            catch (MatchException matchException) {
                                throw f6.a("\u00fd", (Object)matchException, (long)2531396866086868509L, (long)l);
                            }
                            callSite4 = callSite2;
                        }
                        catch (MatchException matchException) {
                            throw f6.a("\u00fd", (Object)matchException, (long)2531396866086868509L, (long)l);
                        }
                    }
                    class_2663 class_26633 = (class_2663)callSite4;
                    try {
                        try {
                            class_26632 = class_26633;
                            if (callSite3 != null) break block14;
                            if (f6.a("\u00fc", (Object)class_26632, (long)2531124219956487894L, (long)l) != (int)e) break block13;
                        }
                        catch (MatchException matchException) {
                            throw f6.a("\u00fd", (Object)matchException, (long)2531396866086868509L, (long)l);
                        }
                        class_26632 = class_26633;
                    }
                    catch (MatchException matchException) {
                        throw f6.a("\u00fd", (Object)matchException, (long)2531396866086868509L, (long)l);
                    }
                }
                CallSite callSite5 = f6.a("\u00fc", (Object)class_26632, (Object)f6.a("\u00f8", (Object)b, (long)2532027044470091363L, (long)l), (long)2531647805400482338L, (long)l);
                try {
                    try {
                        callSite = callSite5;
                        if (callSite3 != null) break block15;
                        if (!(callSite instanceof class_1657)) break block13;
                    }
                    catch (MatchException matchException) {
                        throw f6.a("\u00fd", (Object)matchException, (long)2531396866086868509L, (long)l);
                    }
                    callSite = callSite5;
                }
                catch (MatchException matchException) {
                    throw f6.a("\u00fd", (Object)matchException, (long)2531396866086868509L, (long)l);
                }
            }
            callSite2 = (class_1657)callSite;
            CallSite callSite5 = f6.a("\u00fc", (Object)this.a, (Object)f6.a("\u00fc", (Object)callSite2, (long)2531049839925669352L, (long)l), (int)0, (long)2531665618875445599L, (long)l);
            f6.a("\u00fc", (Object)this.a, (Object)f6.a("\u00fc", (Object)callSite2, (long)2531049839925669352L, (long)l), (int)(++var7_8), (long)2532822376670613624L, (long)l);
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/f6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    public int a(Object[] objectArray) {
        class_1657 class_16572 = (class_1657)objectArray[0];
        long l = (Long)objectArray[1];
        l = d ^ l;
        return (int)f6.a("\u00fc", (Object)this.a, (Object)f6.a("\u00fc", (Object)class_16572, (long)-8066993536869687612L, (long)l), (int)0, (long)-8066483482966801805L, (long)l);
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "\u0005\u001f\u001c%*\u000b\u001b\u0017\u0006jL\u001f\u001c\u00169!p";
        objectArray[1] = Void.TYPE;
        f6.g[1] = "java/lang/Void";
        objectArray[2] = "Ucp;\u0011FKkjtvGZpg.PA";
        objectArray[3] = "v\"q\u0000)}}-`OHsv&d\u0015";
        objectArray[4] = "\bCqcc]\u001eCt9pJ\t\bw?|^\u0018O`(7L$";
        objectArray[5] = "pB s}>\u0005b+|lqxz8{e8\u0010";
        objectArray[6] = "X\u000bYZz6X\u000bN\u0006v9B@N\u0018v,E1\u001bG/";
        objectArray[7] = "Bsi\u0005M\u0005\\{sJ/\u0019[f";
        objectArray[8] = "e.\u000bR\u0012\u0006e.\u001c\u000e\u001e\t\u007fe\u001c\u0010\u001e\u001cx\u0014NJJX";
        objectArray[9] = Boolean.TYPE;
        f6.g[9] = "java/lang/Boolean";
        objectArray[10] = "~ \u001bVhlz=\u001bGul92TPrpc=Y\rig}1VWu+X6_Feq%\u001d[WKdg";
        objectArray[11] = Integer.TYPE;
        f6.g[11] = "java/lang/Integer";
        objectArray[12] = ",\u000e\f\fLF,\u000e\u001bP@I6E\u001bN@\\14K\u0013\u0011";
        objectArray[13] = "`[\u001d\u000e\u0018y~S\u0007AcYC~";
        objectArray[14] = "\u000b\u001bP\u001f\u0002\t\u000f\u0006P\u000e\u001f\tL\t\u001f\u0019\u0018\u0015\u0016\u0006\u0012D\u0003\u0002\b\n\u001d\u001e\u001fN-\r\u0014\u000f\u000f\u00141\n\n";
        objectArray[15] = "\u0019:-\u0018<l\u000727WQv\u001f7>\u001afp\u001c5";
        objectArray[16] = "OBf ]bYBczNuN\t`|Ba_Nwk\tt\u001d";
        objectArray[17] = "$wJ`\u001eN/x[/}C:uTDHA+fHh_L";
        objectArray[18] = Float.TYPE;
        f6.g[18] = "java/lang/Float";
        objectArray[19] = "\u0004-p+\u001c\u0005\u0004-gw\u0010\n\u001efgi\u0010\u001f\u0019\u001763G_";
        objectArray[20] = Byte.TYPE;
        f6.g[20] = "java/lang/Byte";
        objectArray[21] = "kPA&JzkPVzFuq\u001bVdF`vj\u00041\u0014$";
        objectArray[22] = "|\u0006\u0002\rI`|\u0006\u0015QEofM\u0015OEza<G\u0011\u001d>";
        objectArray[23] = "h\u0013.-\u000e\u0005~\u0013+w\u001d\u0012iX(q\u0011\u0006x\u001f?fZ\u0017k";
        objectArray[24] = "vgnF\u0015u\u0003GeI\u0004:bInB\u0000`\u0016";
        objectArray[25] = "8\u0012X\u000b\u001d\b8\u0012OW\u0011\u0007\"YOI\u0011\u0012%(\u001e\u0010IW";
        objectArray[26] = "\b^\u0002M\\d\u001e^\u0007\u0017Os\t\u0015\u0004\u0011Cg\u0018R\u0013\u0006\bw\u0000R\u0011\rR:<I\u0011\u0010R}\u000b^";
        objectArray[27] = "\u001e\b\r%IB\b\b\b\u007fZU\u001fC\u000byVA\u000e\u0004\u001cn\u001dP5";
        objectArray[28] = "4%]\t\u0005;A\u0005V\u0006\u0014t \u000b]\r\u0010.T";
        objectArray[29] = "#\rHa)j\"V\t\\yws[L\\+yrQNc(\u007fp\r6";
        objectArray[30] = "\u000fL\u0014!\u0019\u0007UEW+a\u000e4ON-\u001f\u0016E\u0015G}\u0011d";
        objectArray[31] = "Y\u000b\u0012\b~\u001b\u0006\u0018WI\u0002\u001c8\u0000\u0015Hn\u0015G^EH2";
        objectArray[32] = "gr:S^\u001bc\"9G4\u00186n\"FX*b\"~\u001c\n}fy.D\u000f\u001e$)x\u001a4";
        objectArray[33] = "D+'-c9Hl|3\u00037\u0014/|3o\u0005Cb!l?RG/r;nc\u001d-ci\u0003";
        objectArray[34] = "\u0005i\"\u0004i4[`?\u0012\n/We*\u0011g\u0014\\|MU4>Da+\tc%[\u0000r\u0012m'\u0003x4\u0001cd:";
        objectArray[35] = "PyC\u0015e6\u000bc\u000fQ\u001a&\u0001mWAMq^0\f-&(\u0018rYK\"x\u001bf";
        objectArray[36] = "{\u0010v?~\f%\u0019k)\u001d\u0002)\u0005^.Q\u0000*\u0010d0am~Gr*|\u000b\"\u0010i5\u001dR9\u001ekme\u0014*\u0010(T\"\u0010#\u000b ,d\u0003-H\u0019";
        objectArray[37] = "/IhRJC1\u0015v\u00018\u001a.RiYT(z\u00175\u0000\t\u007f.RtZ]B3\u0010lR8\u0011#\u00170YX\u0019~Cm>";
        objectArray[38] = "7R\u000e <spR\\e\u0001igS$0qu\u000e\u0016\u001e3nd?L\u001c\"<\t";
        objectArray[39] = "c@q\u0019K\u001db\u001b0$\u0019\b2\u007f5\u001a\u001b\u001a?\u0019iM\u0000\u0005^AsJ\u001f\to\u001bq[Md";
        objectArray[40] = "/hE\u0004TL.l\u0001\u0019kNE8T\rPL%5L\u001c\u0010'.:QZ\u0000G#\"@\u001ak";
        objectArray[41] = "fY\u000b\u001f\u0019Yj\u001eP\u0001yW6]P\u0001\u0015ee\u0019\u000b\\yY:K^\u0004\b@4\u001fUf";
        objectArray[42] = "\u0015WB:@)RW\u0010\u007f}5A]RGGmGSO!\u001b:\\L.";
        objectArray[43] = "08i\u0011\u0014enhiMwsRg4\u0002M 6d)\u0017M\u001ako;\u001e\u000f%hi9Bw";
        objectArray[44] = "\u007f_k_5ua\u0003u\fG,~DjT+\u001e*\u00016\f\u007fI~\u0001sW\"6,H1\u000eG";
        objectArray[45] = "\u0014fm\f\u000eo\u0018!6\u0012naDb6\u0012\u0002S\u0014 hJn5Id7\u0013\u000b}L'/u";
        objectArray[46] = "`l|\u0007\u001ar>ea\u0011yx;hz\u0016y*5ip\u0014F)3k,l";
        objectArray[47] = "$\u0010l\u0019~m(W7\u0007\u001ehx\u00053\fI8#Ql`!{~\u001an\u0018ghpY";
        objectArray[48] = "6ioe\u0004g3.o`idY6seS7=5npS\r90)|\u0016m6.w!i";
        objectArray[49] = "\f<_\u0001$Y\f2\u0012\u001bJQP?G\u0010,bY'.\u00182BD%@\u001d0RBC\u0010\r$DPrJ\u000f5\u0016=";
        objectArray[50] = "I\r\u001ea\b)\u000b]H?3+\b\u000b\bmO-\u000efK~_7I\u001c\f~\rrt";
        objectArray[51] = "\u000eo\u000e%\fOPf\u00133oM\\w:#\u0013.\u0000y\u0010>\u0001\\\u0000w]$o";
        objectArray[52] = ")4\u0010\u0012+Dw=\r\u0004H]k!\u007fCvNh<\u0019\u001f!Uw]@\u0004/W/%\u0006\u0017!\u0014\u0016b\u0002\u001e:\u001cn$\u0011\u0010y%";
        Object[] objectArray2 = objectArray;
        objectArray[53] = "COnI\u001b_\u001dFs_x_\u0007kdZ\u0004O|\u0018}L\u0017SMB\u007f]E>";
    }

    private static Field g(long l, long l2) {
        int n = f6.e(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = f6.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = f6.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = f6.c(clazz3, string2, clazz2)) != null) {
                    f6.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = f6.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        f6.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = f6.f(221055551112726L, 0L);
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
            return MethodHandles.lookup().findStatic(f6.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


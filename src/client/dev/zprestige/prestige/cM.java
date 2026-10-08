/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_304
 *  net.minecraft.class_312
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.N;
import dev.zprestige.prestige.Q;
import dev.zprestige.prestige.a9;
import dev.zprestige.prestige.aL;
import dev.zprestige.prestige.aO;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bl_0;
import dev.zprestige.prestige.cz_0;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_304;
import net.minecraft.class_312;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class cM
implements cz_0 {
    private final HashMap a;
    private boolean c;
    private boolean d;
    public static int e;
    public static int f;
    private static final long g;
    private static final long h;
    private static final Object[] i;
    private static final String[] j;

    public cM(long l) {
        long l2 = (l = g ^ l) ^ 0x12B7ADF97841L;
        this.a = new HashMap();
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = this;
        cM.a("\u00db", (Object)cM.a("$", (long)-5670083324148558672L, (long)l), (Object)objectArray, (long)-5671409800687123685L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        g = hc.a(-7233505577017121698L, 3207560454910647671L, MethodHandles.lookup().lookupClass()).a(165380706364692L);
        i = new Object[60];
        j = new String[60];
        cM.a();
        long l = g ^ 0x15D873CA4BFL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -9207183865808265975L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                h = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                e = 0;
                f = 1;
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
        if (j[n3] != null) {
            return n3;
        }
        Object object = i[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 45;
            case 1 -> 42;
            case 2 -> 31;
            case 3 -> 32;
            case 4 -> 36;
            case 5 -> 60;
            case 6 -> 55;
            case 7 -> 4;
            case 8 -> 56;
            case 9 -> 40;
            case 10 -> 10;
            case 11 -> 6;
            case 12 -> 26;
            case 13 -> 53;
            case 14 -> 63;
            case 15 -> 12;
            case 16 -> 33;
            case 17 -> 41;
            case 18 -> 14;
            case 19 -> 35;
            case 20 -> 17;
            case 21 -> 28;
            case 22 -> 50;
            case 23 -> 20;
            case 24 -> 58;
            case 25 -> 13;
            case 26 -> 43;
            case 27 -> 19;
            case 28 -> 37;
            case 29 -> 8;
            case 30 -> 61;
            case 31 -> 9;
            case 32 -> 44;
            case 33 -> 27;
            case 34 -> 39;
            case 35 -> 16;
            case 36 -> 59;
            case 37 -> 30;
            case 38 -> 3;
            case 39 -> 7;
            case 40 -> 49;
            case 41 -> 62;
            case 42 -> 38;
            case 43 -> 57;
            case 44 -> 11;
            case 45 -> 54;
            case 46 -> 25;
            case 47 -> 23;
            case 48 -> 34;
            case 49 -> 2;
            case 50 -> 46;
            case 51 -> 48;
            case 52 -> 15;
            case 53 -> 22;
            case 54 -> 29;
            case 55 -> 47;
            case 56 -> 24;
            case 57 -> 0;
            case 58 -> 52;
            case 59 -> 1;
            case 60 -> 5;
            case 61 -> 18;
            case 62 -> 21;
            default -> 51;
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
        cM.j[n3] = new String(cArray);
        return n3;
    }

    private boolean b(Object[] objectArray) {
        Object object;
        block20: {
            int n;
            block16: {
                CallSite callSite;
                long l;
                int n2;
                block17: {
                    Object object2;
                    block18: {
                        block19: {
                            block14: {
                                block15: {
                                    n2 = (Integer)objectArray[0];
                                    l = (Long)objectArray[1];
                                    l = g ^ l;
                                    callSite = cM.a("\u00f4", (long)-1538785949949969385L, (long)l);
                                    try {
                                        try {
                                            object = n2;
                                            if (callSite != null) break block14;
                                            if (object >= 0) break block15;
                                        }
                                        catch (MatchException matchException) {
                                            throw cM.a("\u00f4", (Object)matchException, (long)-1539169775434273053L, (long)l);
                                        }
                                        return true;
                                    }
                                    catch (MatchException matchException) {
                                        throw cM.a("\u00f4", (Object)matchException, (long)-1539169775434273053L, (long)l);
                                    }
                                }
                                object = n2;
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            n = (int)h;
                                            if (callSite != null) break block16;
                                            if (object > n) break block17;
                                        }
                                        catch (MatchException matchException) {
                                            throw cM.a("\u00f4", (Object)matchException, (long)-1539169775434273053L, (long)l);
                                        }
                                        object2 = cM.a("\u00f4", (long)cM.a("\u00db", (Object)cM.a("\u00db", (Object)b, (long)-1538737917787505366L, (long)l), (long)-1538682141014940253L, (long)l), (int)n2, (long)-1537253241877506699L, (long)l);
                                        if (callSite != null) break block18;
                                    }
                                    catch (MatchException matchException) {
                                        throw cM.a("\u00f4", (Object)matchException, (long)-1539169775434273053L, (long)l);
                                    }
                                    if (object2 == 1) break block19;
                                }
                                catch (MatchException matchException) {
                                    throw cM.a("\u00f4", (Object)matchException, (long)-1539169775434273053L, (long)l);
                                }
                                object2 = 1;
                                break block18;
                            }
                            catch (MatchException matchException) {
                                throw cM.a("\u00f4", (Object)matchException, (long)-1539169775434273053L, (long)l);
                            }
                        }
                        object2 = 0;
                    }
                    return (boolean)object2;
                }
                try {
                    object = cM.a("\u00f4", (long)cM.a("\u00db", (Object)cM.a("\u00db", (Object)b, (long)-1538737917787505366L, (long)l), (long)-1538682141014940253L, (long)l), (int)n2, (long)-1539723152474211302L, (long)l);
                    if (callSite != null) break block20;
                    n = 1;
                }
                catch (MatchException matchException) {
                    throw cM.a("\u00f4", (Object)matchException, (long)-1539169775434273053L, (long)l);
                }
            }
            object = object != n ? 1 : 0;
        }
        return (boolean)object;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c4' || c == 'C' || c == '$' || c == '\u00e2') {
                field = cM.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c4' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'C' ? lookup.findSetter(clazz, string2, clazz2) : (c == '$' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = cM.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00db' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = cM.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private void b(Object[] objectArray) {
        int n;
        Object object;
        long l;
        block13: {
            int n2;
            block14: {
                CallSite callSite;
                block11: {
                    block12: {
                        n2 = (Integer)objectArray[0];
                        l = (Long)objectArray[1];
                        long l2 = l = g ^ l;
                        long l3 = l2 ^ 0x76B1022BF83CL;
                        long l4 = l2 ^ 0x6209B3BE5E6CL;
                        callSite = cM.a("\u00f4", (long)6596742830774095166L, (long)l);
                        try {
                            try {
                                Object[] objectArray2 = new Object[2];
                                objectArray2[1] = l3;
                                objectArray2[0] = n2;
                                object = cM.a("\u00db", (Object)this, (Object)objectArray2, (long)6597219762393428490L, (long)l);
                                if (callSite != null) break block11;
                                if (object == false) break block12;
                            }
                            catch (MatchException matchException) {
                                throw cM.a("\u00f4", (Object)matchException, (long)6596280102072573898L, (long)l);
                            }
                            Object[] objectArray3 = new Object[5];
                            objectArray3[4] = l4;
                            objectArray3[3] = 0;
                            objectArray3[2] = 0;
                            objectArray3[1] = n2;
                            objectArray3[0] = (long)cM.a("\u00db", (Object)cM.a("\u00db", (Object)b, (long)6596712389723442179L, (long)l), (long)6596916166406083722L, (long)l);
                            cM.a("\u00db", (Object)new Q((class_312)cM.a("\u00c4", (Object)b, (long)6595872167372254459L, (long)l)), (Object)objectArray3, (long)6595737080215002238L, (long)l);
                            cM.a("\u00db", (Object)this.a, (Object)cM.a("\u00f4", (int)n2, (long)6597132784831166454L, (long)l), (long)6596204631112660601L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw cM.a("\u00f4", (Object)matchException, (long)6596280102072573898L, (long)l);
                        }
                    }
                    object = n2;
                }
                try {
                    try {
                        n = e;
                        if (callSite != null) break block13;
                        if (object != n) break block14;
                    }
                    catch (MatchException matchException) {
                        throw cM.a("\u00f4", (Object)matchException, (long)6596280102072573898L, (long)l);
                    }
                    this.c = 0;
                }
                catch (MatchException matchException) {
                    throw cM.a("\u00f4", (Object)matchException, (long)6596280102072573898L, (long)l);
                }
            }
            object = n2;
            n = f;
        }
        try {
            if (object == n) {
                this.d = 0;
            }
        }
        catch (MatchException matchException) {
            throw cM.a("\u00f4", (Object)matchException, (long)6596280102072573898L, (long)l);
        }
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

    /*
     * Unable to fully structure code
     */
    private void c(Object[] var1_1) {
        block13: {
            block14: {
                block12: {
                    var2_2 = (Integer)var1_1[0];
                    var3_3 = (Long)var1_1[1];
                    v0 = var3_3 = cM.g ^ var3_3;
                    var5_4 = v0 ^ 89669795328449L;
                    var7_5 = v0 ^ 50375637167234L;
                    var9_6 = cM.a("\u00f4", (long)-3516733211994777216L, (long)var3_3);
                    try {
                        try {
                            v1 = new Object[2];
                            v1[1] = var7_5;
                            v1[0] = var2_2;
                            v2 = cM.a("\u00db", (Object)this, (Object)v1, (long)-3517220004859009356L, (long)var3_3);
                            if (var9_6 != null) break block12;
                            if (v2 == false) break block13;
                        }
                        catch (MatchException v3) {
                            throw cM.a("\u00f4", (Object)v3, (long)-3515927384129942668L, (long)var3_3);
                        }
                        v2 = cM.a("\u00db", (Object)((Integer)cM.a("\u00db", (Object)this.a, (Object)cM.a("\u00f4", (int)var2_2, (long)-3516218182082796728L, (long)var3_3), (long)-3516412579378134049L, (long)var3_3)), (long)-3516077385321666562L, (long)var3_3);
                    }
                    catch (MatchException v4) {
                        throw cM.a("\u00f4", (Object)v4, (long)-3515927384129942668L, (long)var3_3);
                    }
                }
                var10_7 = v2;
                try {
                    try {
                        if (var9_6 != null) break block14;
                        if (var10_7 > 0) {
                        }
                        ** GOTO lbl43
                    }
                    catch (MatchException v5) {
                        throw cM.a("\u00f4", (Object)v5, (long)-3515927384129942668L, (long)var3_3);
                    }
                    cM.a("\u00db", (Object)this.a, (Object)cM.a("\u00f4", (int)var2_2, (long)-3516218182082796728L, (long)var3_3), (Object)cM.a("\u00f4", (int)(var10_7 - 1), (long)-3516218182082796728L, (long)var3_3), (long)-3515493683493889850L, (long)var3_3);
                }
                catch (MatchException v6) {
                    throw cM.a("\u00f4", (Object)v6, (long)-3515927384129942668L, (long)var3_3);
                }
            }
            try {
                if (var9_6 == null) break block13;
lbl43:
                // 2 sources

                v7 = new Object[2];
                v7[1] = var5_4;
                v7[0] = var2_2;
                cM.a("\u00db", (Object)this, (Object)v7, (long)-3516988703154904069L, (long)var3_3);
            }
            catch (MatchException v8) {
                throw cM.a("\u00f4", (Object)v8, (long)-3515927384129942668L, (long)var3_3);
            }
        }
    }

    private static Method h(long l, long l2) {
        int n = cM.e(l, l2);
        Object object = i[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = j[n];
                int n3 = string2.indexOf(8);
                clazz3 = cM.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = cM.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = cM.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        cM.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = cM.f(1304505102655839L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = cM.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        cM.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = cM.f(1304505102655839L, 0L);
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
            int n = cM.e(l, l2);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                cM.i[n] = clazz = Class.forName(j[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = cM.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = cM.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = cM.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = cM.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
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
            throw new RuntimeException("dev/zprestige/prestige/cM" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void a(Object[] objectArray) {
        block24: {
            long l;
            long l2;
            int n;
            block29: {
                Object object;
                block30: {
                    int n2;
                    block31: {
                        block32: {
                            Object object2;
                            CallSite callSite;
                            block25: {
                                block26: {
                                    int n3;
                                    block27: {
                                        block28: {
                                            block23: {
                                                n = (Integer)objectArray[0];
                                                l2 = (Long)objectArray[1];
                                                long l3 = l2 = g ^ l2;
                                                long l4 = l3 ^ 0x6ECD7D45B4ABL;
                                                l = l3 ^ 0x7A75CCD012FBL;
                                                callSite = cM.a("\u00f4", (long)1665011190579544489L, (long)l2);
                                                try {
                                                    if (cM.a("\u00c4", (Object)b, (long)1664885081435897063L, (long)l2) != null) {
                                                        return;
                                                    }
                                                }
                                                catch (MatchException matchException) {
                                                    throw cM.a("\u00f4", (Object)matchException, (long)1665674017495651165L, (long)l2);
                                                }
                                                try {
                                                    try {
                                                        Object[] objectArray2 = new Object[2];
                                                        objectArray2[1] = l4;
                                                        objectArray2[0] = n;
                                                        object2 = cM.a("\u00db", (Object)this, (Object)objectArray2, (long)1664379232115752605L, (long)l2);
                                                        if (callSite != null) break block23;
                                                        if (object2 != false) break block24;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw cM.a("\u00f4", (Object)matchException, (long)1665674017495651165L, (long)l2);
                                                    }
                                                    object2 = this.d;
                                                }
                                                catch (MatchException matchException) {
                                                    throw cM.a("\u00f4", (Object)matchException, (long)1665674017495651165L, (long)l2);
                                                }
                                            }
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (callSite != null) break block25;
                                                            if (object2 != false) break block26;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw cM.a("\u00f4", (Object)matchException, (long)1665674017495651165L, (long)l2);
                                                        }
                                                        cM cM2 = this;
                                                        n3 = n;
                                                        if (callSite != null) break block27;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw cM.a("\u00f4", (Object)matchException, (long)1665674017495651165L, (long)l2);
                                                    }
                                                    if (n3 != f) break block28;
                                                }
                                                catch (MatchException matchException) {
                                                    throw cM.a("\u00f4", (Object)matchException, (long)1665674017495651165L, (long)l2);
                                                }
                                                n3 = 1;
                                                break block27;
                                            }
                                            catch (MatchException matchException) {
                                                throw cM.a("\u00f4", (Object)matchException, (long)1665674017495651165L, (long)l2);
                                            }
                                        }
                                        n3 = 0;
                                    }
                                    cM2.d = n3;
                                }
                                try {
                                    object = this;
                                    if (callSite != null) break block29;
                                    object2 = ((cM)object).c;
                                }
                                catch (MatchException matchException) {
                                    throw cM.a("\u00f4", (Object)matchException, (long)1665674017495651165L, (long)l2);
                                }
                            }
                            try {
                                try {
                                    try {
                                        if (object2 != false) break block30;
                                        cM cM3 = this;
                                        n2 = n;
                                        if (callSite != null) break block31;
                                    }
                                    catch (MatchException matchException) {
                                        throw cM.a("\u00f4", (Object)matchException, (long)1665674017495651165L, (long)l2);
                                    }
                                    if (n2 != e) break block32;
                                }
                                catch (MatchException matchException) {
                                    throw cM.a("\u00f4", (Object)matchException, (long)1665674017495651165L, (long)l2);
                                }
                                n2 = 1;
                                break block31;
                            }
                            catch (MatchException matchException) {
                                throw cM.a("\u00f4", (Object)matchException, (long)1665674017495651165L, (long)l2);
                            }
                        }
                        n2 = 0;
                    }
                    cM3.c = n2;
                }
                object = cM.a("\u00db", (Object)this.a, (Object)cM.a("\u00f4", (int)n, (long)1664820226654452577L, (long)l2), (Object)cM.a("\u00f4", (int)1, (long)1664820226654452577L, (long)l2), (long)1664116625145531838L, (long)l2);
            }
            Object[] objectArray3 = new Object[5];
            objectArray3[4] = l;
            objectArray3[3] = 0;
            objectArray3[2] = 1;
            objectArray3[1] = n;
            objectArray3[0] = (long)cM.a("\u00db", (Object)cM.a("\u00db", (Object)b, (long)1664962471087833236L, (long)l2), (long)1665184183930378269L, (long)l2);
            cM.a("\u00db", (Object)new Q((class_312)cM.a("\u00c4", (Object)b, (long)1665811476632674412L, (long)l2)), (Object)objectArray3, (long)1666291806145876201L, (long)l2);
        }
    }

    @bP
    public void a(aO aO2) {
        block13: {
            int n;
            block16: {
                cM cM2;
                CallSite callSite;
                long l;
                block14: {
                    CallSite callSite2;
                    long l2;
                    block15: {
                        Object object;
                        long l3;
                        block12: {
                            long l4 = l = g ^ 0x4B92C4F3EC61L;
                            l2 = l4 ^ 0x35C2A41EEAA6L;
                            l3 = l4 ^ 0x3D6C249C06CCL;
                            long l5 = l4 ^ 0x3CDB8838490AL;
                            callSite2 = cM.a("\u00f4", (long)5266420818439577508L, (long)l);
                            try {
                                try {
                                    object = this.c;
                                    if (callSite2 != null) break block12;
                                    if (object == 0) break block13;
                                }
                                catch (MatchException matchException) {
                                    throw cM.a("\u00f4", (Object)matchException, (long)5264974863415004496L, (long)l);
                                }
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l5;
                                object = cM.a("\u00db", (Object)cM.a("\u00db", (Object)new N((class_304)cM.a("\u00c4", (Object)cM.a("\u00c4", (Object)b, (long)5266079845691293181L, (long)l), (long)5265597164108972049L, (long)l)), (Object)objectArray, (long)5266346788726400235L, (long)l), (long)5264905563847586678L, (long)l);
                            }
                            catch (MatchException matchException) {
                                throw cM.a("\u00f4", (Object)matchException, (long)5264974863415004496L, (long)l);
                            }
                        }
                        int n2 = object;
                        try {
                            try {
                                Object[] objectArray = new Object[2];
                                objectArray[1] = l3;
                                objectArray[0] = n2;
                                callSite = cM.a("\u00db", (Object)this, (Object)objectArray, (long)5265867602317602087L, (long)l);
                                if (callSite2 != null) break block14;
                                if (callSite != false) break block15;
                            }
                            catch (MatchException matchException) {
                                throw cM.a("\u00f4", (Object)matchException, (long)5264974863415004496L, (long)l);
                            }
                            this.c = 0;
                            return;
                        }
                        catch (MatchException matchException) {
                            throw cM.a("\u00f4", (Object)matchException, (long)5264974863415004496L, (long)l);
                        }
                    }
                    try {
                        cM.a("\u00db", (Object)aO2, (Object)new Object[0], (long)5266802165452854523L, (long)l);
                        cM2 = this;
                        n = e;
                        if (callSite2 != null) break block16;
                        Object[] objectArray = new Object[2];
                        objectArray[1] = l2;
                        objectArray[0] = n;
                        callSite = cM.a("\u00db", (Object)cM2, (Object)objectArray, (long)5265916431770362000L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw cM.a("\u00f4", (Object)matchException, (long)5264974863415004496L, (long)l);
                    }
                }
                try {
                    if (callSite != false) break block13;
                    cM2 = this;
                    n = 0;
                }
                catch (MatchException matchException) {
                    throw cM.a("\u00f4", (Object)matchException, (long)5264974863415004496L, (long)l);
                }
            }
            cM2.c = n;
        }
    }

    @bP
    public void a(aL aL2) {
        block13: {
            int n;
            block16: {
                cM cM2;
                CallSite callSite;
                long l;
                block14: {
                    CallSite callSite2;
                    long l2;
                    block15: {
                        Object object;
                        long l3;
                        block12: {
                            long l4 = l = g ^ 0x31071CDD94DAL;
                            l2 = l4 ^ 0x4F577C30921DL;
                            l3 = l4 ^ 0x47F9FCB27E77L;
                            long l5 = l4 ^ 0x464E501631B1L;
                            callSite2 = cM.a("\u00f4", (long)3579639604614948639L, (long)l);
                            try {
                                try {
                                    object = this.c;
                                    if (callSite2 != null) break block12;
                                    if (object == 0) break block13;
                                }
                                catch (MatchException matchException) {
                                    throw cM.a("\u00f4", (Object)matchException, (long)3579104049776571883L, (long)l);
                                }
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l5;
                                object = cM.a("\u00db", (Object)cM.a("\u00db", (Object)new N((class_304)cM.a("\u00c4", (Object)cM.a("\u00c4", (Object)b, (long)3580261845122647366L, (long)l), (long)3578200257863579818L, (long)l)), (Object)objectArray, (long)3579983563533065296L, (long)l), (long)3579175480721574861L, (long)l);
                            }
                            catch (MatchException matchException) {
                                throw cM.a("\u00f4", (Object)matchException, (long)3579104049776571883L, (long)l);
                            }
                        }
                        int n2 = object;
                        try {
                            try {
                                Object[] objectArray = new Object[2];
                                objectArray[1] = l3;
                                objectArray[0] = n2;
                                callSite = cM.a("\u00db", (Object)this, (Object)objectArray, (long)3580190432917624220L, (long)l);
                                if (callSite2 != null) break block14;
                                if (callSite != false) break block15;
                            }
                            catch (MatchException matchException) {
                                throw cM.a("\u00f4", (Object)matchException, (long)3579104049776571883L, (long)l);
                            }
                            this.c = 0;
                            return;
                        }
                        catch (MatchException matchException) {
                            throw cM.a("\u00f4", (Object)matchException, (long)3579104049776571883L, (long)l);
                        }
                    }
                    try {
                        cM.a("\u00db", (Object)aL2, (Object)new Object[0], (long)3579247073683123264L, (long)l);
                        cM2 = this;
                        n = e;
                        if (callSite2 != null) break block16;
                        Object[] objectArray = new Object[2];
                        objectArray[1] = l2;
                        objectArray[0] = n;
                        callSite = cM.a("\u00db", (Object)cM2, (Object)objectArray, (long)3580134714280695851L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw cM.a("\u00f4", (Object)matchException, (long)3579104049776571883L, (long)l);
                    }
                }
                try {
                    if (callSite != false) break block13;
                    cM2 = this;
                    n = 0;
                }
                catch (MatchException matchException) {
                    throw cM.a("\u00f4", (Object)matchException, (long)3579104049776571883L, (long)l);
                }
            }
            cM2.c = n;
        }
    }

    @bP
    public void a(a9 a92) {
        block13: {
            int n;
            block16: {
                cM cM2;
                CallSite callSite;
                long l;
                block14: {
                    CallSite callSite2;
                    long l2;
                    block15: {
                        Object object;
                        long l3;
                        block12: {
                            long l4 = l = g ^ 0x74C466B6B684L;
                            l2 = l4 ^ 0xA94065BB043L;
                            l3 = l4 ^ 0x23A86D95C29L;
                            long l5 = l4 ^ 0x38D2A7D13EFL;
                            callSite2 = cM.a("\u00f4", (long)1437539445146731841L, (long)l);
                            try {
                                try {
                                    object = this.d;
                                    if (callSite2 != null) break block12;
                                    if (object == 0) break block13;
                                }
                                catch (MatchException matchException) {
                                    throw cM.a("\u00f4", (Object)matchException, (long)1438282056213927861L, (long)l);
                                }
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l5;
                                object = cM.a("\u00db", (Object)cM.a("\u00db", (Object)new N((class_304)cM.a("\u00c4", (Object)cM.a("\u00c4", (Object)b, (long)1437177071649466136L, (long)l), (long)1438534502104530320L, (long)l)), (Object)objectArray, (long)1436909785118883342L, (long)l), (long)1438210556549507475L, (long)l);
                            }
                            catch (MatchException matchException) {
                                throw cM.a("\u00f4", (Object)matchException, (long)1438282056213927861L, (long)l);
                            }
                        }
                        int n2 = object;
                        try {
                            try {
                                Object[] objectArray = new Object[2];
                                objectArray[1] = l3;
                                objectArray[0] = n2;
                                callSite = cM.a("\u00db", (Object)this, (Object)objectArray, (long)1436967112058189762L, (long)l);
                                if (callSite2 != null) break block14;
                                if (callSite != false) break block15;
                            }
                            catch (MatchException matchException) {
                                throw cM.a("\u00f4", (Object)matchException, (long)1438282056213927861L, (long)l);
                            }
                            this.d = 0;
                            return;
                        }
                        catch (MatchException matchException) {
                            throw cM.a("\u00f4", (Object)matchException, (long)1438282056213927861L, (long)l);
                        }
                    }
                    try {
                        cM.a("\u00db", (Object)a92, (Object)new Object[0], (long)1437299177189412382L, (long)l);
                        cM2 = this;
                        n = f;
                        if (callSite2 != null) break block16;
                        Object[] objectArray = new Object[2];
                        objectArray[1] = l2;
                        objectArray[0] = n;
                        callSite = cM.a("\u00db", (Object)cM2, (Object)objectArray, (long)1437057637128993397L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw cM.a("\u00f4", (Object)matchException, (long)1438282056213927861L, (long)l);
                    }
                }
                try {
                    if (callSite != false) break block13;
                    cM2 = this;
                    n = 0;
                }
                catch (MatchException matchException) {
                    throw cM.a("\u00f4", (Object)matchException, (long)1438282056213927861L, (long)l);
                }
            }
            cM2.d = n;
        }
    }

    @bP
    public void a(bl_0 bl_02) {
        block4: {
            long l;
            long l2;
            block5: {
                long l3 = l2 = g ^ 0x10B93EB38BB3L;
                long l4 = l3 ^ 0x12B443E7D037L;
                l = l3 ^ 0x49D5BC394489L;
                CallSite callSite = cM.a("\u00f4", (long)3369905278615058550L, (long)l2);
                try {
                    try {
                        if (callSite != null) break block4;
                        if (cM.a("\u00db", (Object)b, (long)3370650547492495793L, (long)l2) != false) break block5;
                    }
                    catch (MatchException matchException) {
                        throw cM.a("\u00f4", (Object)matchException, (long)3369441931853965954L, (long)l2);
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = l4;
                    objectArray[0] = e;
                    cM.a("\u00db", (Object)this, (Object)objectArray, (long)3370775344839131661L, (long)l2);
                    Object[] objectArray2 = new Object[2];
                    objectArray2[1] = l4;
                    objectArray2[0] = f;
                    cM.a("\u00db", (Object)this, (Object)objectArray2, (long)3370775344839131661L, (long)l2);
                    this.c = 0;
                    this.d = 0;
                    return;
                }
                catch (MatchException matchException) {
                    throw cM.a("\u00f4", (Object)matchException, (long)3369441931853965954L, (long)l2);
                }
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = l;
            objectArray[0] = e;
            cM.a("\u00db", (Object)this, (Object)objectArray, (long)3369157153174888294L, (long)l2);
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l;
            objectArray3[0] = f;
            cM.a("\u00db", (Object)this, (Object)objectArray3, (long)3369157153174888294L, (long)l2);
        }
    }

    private static void a() {
        Object[] objectArray = i;
        i[0] = "_rq\u0002b$IrtXq3^9w^}'O~`I6\u001a";
        objectArray[1] = "H\u0010v[X1=0}TI~\\>v_M$(";
        objectArray[2] = ".\u000f2&HA.\u000f%zDN4D%dD[35u>\u0012\u001dd\t*iV[\u001fYv>";
        objectArray[3] = "!6=iAL7683R[ };5^O1:,\"\u0015]\r";
        objectArray[4] = "7\u0019y,'LB9r#6\u0003?!a$?JW";
        objectArray[5] = ";?+8.\u0012N\u001f 7?]/\u0011+<;\u0007[";
        objectArray[6] = Void.TYPE;
        cM.j[6] = "java/lang/Void";
        objectArray[7] = "Nf\u001a>_7Nf\rbS8T-\r|S-S\\]!\u0007";
        objectArray[8] = "/\"Kfq8/\"\\:}75i\\$}\"2\u0018\fx(";
        objectArray[9] = "VT<{2n@T9!!yW\u001f:'-mFX-0f}\u007f";
        objectArray[10] = "c3)^]\u001c\u0016\u0013\"QLSw\u001d)ZH\t\u0003";
        objectArray[11] = Boolean.TYPE;
        cM.j[11] = "java/lang/Boolean";
        objectArray[12] = "H\u0003M\"f|C\f\\m\u0005qV\u0001S\u00060sG\u0012O*'~";
        objectArray[13] = "j\u0015A`IX\u001f5JoX\u0017~;Ad\\M\n";
        objectArray[14] = "d\u000f?`\\_d\u000f(<PP~D(\"PEy5x\u007f\u0001";
        objectArray[15] = Integer.TYPE;
        cM.j[15] = "java/lang/Integer";
        objectArray[16] = "P*!fM3%\n*i\\|D\u0004!bX&0";
        objectArray[17] = "8\"(5S[&*2z5O!+\u00135\r";
        objectArray[18] = "w:\u001f1?B|5\u000e~^Lw>\n$";
        objectArray[19] = " \u001b\u0017_tU+\u0014\u0006\u0010\u0013W>\u001f\u0006[(";
        objectArray[20] = "\u0003\u007f3\u001c\bE\u0015\u007f6F\u001bR\u000245@\u0017F\u0013s\"W\\V\u000bs \\\u0006\u001b7h A\u0006\\\u0000\u007f";
        objectArray[21] = "\u00076\u0013\u0004P;\u00116\u0016^C,\u0006}\u0015XO8\u0017:\u0002O\u0004),";
        objectArray[22] = "\u0018y\u00134\"CmY\u0018;3\f\fW\u001307Vx";
        objectArray[23] = "ZgOw5\u0005/GDx$JNIOs \u0010:";
        objectArray[24] = "\u0010\u0007.\u0001/?\u0010\u00079]#0\nL9C#%\r=k\u001fvg";
        objectArray[25] = "?) G3\u001e))%\u001d \t>b&\u001b,\u001d/%1\fg?";
        objectArray[26] = "#\u0004\u0011iYbV$\u001afH-7*\u0011mLwC";
        objectArray[27] = Long.TYPE;
        cM.j[27] = "java/lang/Long";
        objectArray[28] = "Ap\fB]\u007fAp\u001b\u001eQp[;\u001b\u0000Qe\\JK]\u0002";
        objectArray[29] = "!{CJRU$nHJYN(~\n#rd\u0019";
        objectArray[30] = "pJI\\\nypJ^\u0000\u0006vj\u0001^\u001e\u0006cmp\tAP";
        objectArray[31] = "VS3*\u0014/VPx;o'QS<\u001b\u00024pZ>/\u0002\u0002HA?3\tHW\f?h\u000e4PBr1o!T\u0004z%\u000e,H@;T\u0006)\f\u000425\u000b5HEC";
        objectArray[32] = "\u0001\u000eDn\n1\u0014TQmx%\u0005\u0019Vv\u0014\u0017R_\b!C@\u0007\u0017M(\n#U\u0004T+x";
        objectArray[33] = "Kmv\u0011$/OnfN\u0019|q5x\u001ee-Lct\u001di\u0016";
        objectArray[34] = "\r\u007f.Rk\u000e\u0007luO\u0005[`~7\nuJ\u0001\"'\\=";
        objectArray[35] = "Q\t6Xv\u0017\u0003\u001a/[\u0004\u0011S\u0007-\u0006h#\u0002G|Y\u0004\u0016\u000f\u0007q\u0000x\u0011AJ(a";
        objectArray[36] = "\u0012_f\u0016\u0014z\u0016\\vI)*(\\$LGrO\u0000![SC\u0014\u0002dCS$VCaJ)";
        objectArray[37] = "5~$P\u0000P#{(Xf]3=\u0014Y\u001b_&-\u007fI\u001eHeA\u007fO\u000bJ2*oJ\u001c\t^";
        objectArray[38] = "6\"D\u0007G346\u001d\u001a7/3*\t\u0018p?Z'\u0015L\u000e ;*\t\bOQ6\"D\u0007G346\u001d\u001a7";
        objectArray[39] = "(\u001c\u001fL/\u000b=F\nO]\u0014 \u001a\t_\nC~JP3>\u0006~\bT\u000f`A'\u0018";
        objectArray[40] = "\u001b*\u0017G\u0006^J7C\u0019<\u000e%&\u0015JRVBz\u0010]Fg\u0015.\u0013\u001dU\u001cE(\u0017\u001c<";
        objectArray[41] = "Po#\u001d\u0006\u0014\u0001rwC<Gnc!\u0010R\u001c\t?$\u0007F-^k'GUV\u000em#F<";
        objectArray[42] = "0\u00050|\u0018%%_%\u007fj:8\u0003&o=mg_z\u0003W6a^zz\u0015:&\u001e";
        objectArray[43] = ".:xdg\u0005;`mg\u0015\u0011*-j|y#~l4*\u0015D.j7rn\u0014(n6\u001b";
        objectArray[44] = "DW~?\u0018\u0004RRr7~\u001eR\u0014N6\u0003\u000bW\u0004%&\u0006\u001c\u0014h% \u0013\u001eC\u00035%\u0004]/\u000330\u0006\nD\u00136'Ef";
        objectArray[45] = "AR\u0001tb\t\u0010OU*XZ\u007f^\u0003y6\u0001\u0018\u0002\u0006n\"0C\u0000Cv\"W\u0001AF\u007fX";
        objectArray[46] = "+\u0013\u0003jC\n ]W\tA2-\u001fRg\u0019Uq\u001aEs(\u000b0MVlGL5]\u0006\t";
        objectArray[47] = "\u0016oi|G*\u0000jet!#\u001a6%w@.\u0006\u00134o!#\u0000=!rJ3\u0005*b\u001e\u0011!Fm0eA'BlY";
        objectArray[48] = "k\u0017o\u0005G\u001c}\u0012c\r!\u0004mP;\u000eJ\u0013\u0000C\"\nY\u0012kS'\u001d\u001a~kU2\u001fM\u0015{P%\\!\u0015}E'\u000bJ\u0005xRdg";
        objectArray[49] = "$uh'\" xe>oY(Ifj=7p.:o*#Au8*2#&7y/;Y";
        objectArray[50] = "#$0#gq#'{2\u001cy$$?\u0012qj\u0003'1]~'<v!!yiq/@4}/y;!9ak8J)<%/1+$ an@";
        objectArray[51] = "r\u0011(\f\u001a!\"\u0019l\u0004e9\u0012\u0000m\u0004\u000bau\\h\u0013\u001fP.^-\u000b\u001f7l\u001f(\u0002e";
        objectArray[52] = "m\u000b$E\u0018\nxQ1Fj\u0015e\r2V=B;Zg:\b\u001b>\u0002-K\n\u0000b\\";
        objectArray[53] = "8]\u0018^W\u0015zQ_\u001eo\u0002dRD\u00028U5\u000f\u001enR\u001d{VYS\t\u0010fG";
        objectArray[54] = "7f\fP~\"f{X\u000eDp\tj\u000e]**n6\u000bJ>\u001b54NR>|wuK[D";
        objectArray[55] = "0\u001dQ-\u001cJr\u0011\u0016m$]l\u0012\rqs\n<GU\u001d\u0019Bs\u0016\u0010 BOn\u0007";
        objectArray[56] = "O\u0018\u0005njoM\f\\s\u001alE\bku~pNt\\}#4R\u0015Qagu#";
        objectArray[57] = "2\u0001E.&\u0000$\u0004I&@\u00184[\u00122-b2C\u00184,\t\"F\u000fw@\t$S\r +\u0019!DNL";
        objectArray[58] = "[\u001bP>Or\n\u0006\u0004`u\"eF\u0012#\u000bw\u0007\r\u0001<\u0004KU\u000b\u0015'I)\u001e\u0018\n(u";
        Object[] objectArray2 = objectArray;
        objectArray[59] = "em\t\u0017\u0002\u0004\"h\u0019Gg\u000e1m\u0006\u001e\u000b<e-ZEg\u0002=(_\b\u0006\u000f!l\u001ey";
    }

    public boolean a(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        l = g ^ l;
        return (boolean)cM.a("\u00db", (Object)this.a, (Object)cM.a("\u00f4", (int)n, (long)490546071509445301L, (long)l), (long)489967979595574569L, (long)l);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Field g(long l, long l2) {
        int n = cM.e(l, l2);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = cM.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = cM.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = cM.c(clazz3, string2, clazz2)) != null) {
                    cM.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = cM.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        cM.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = cM.f(1304505102655839L, 0L);
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
            return MethodHandles.lookup().findStatic(cM.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


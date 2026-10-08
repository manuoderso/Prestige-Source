/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector4f
 */
package dev.zprestige.prestige;

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
import org.joml.Vector4f;

/*
 * Renamed from dev.zprestige.prestige.dw
 */
class dw_0 {
    final float a;
    final float b;
    final float c;
    final float d;
    private static final long e = hc.a(263092732515027031L, 2791021111507913663L, MethodHandles.lookup().lookupClass()).a(12283739579794L);
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;
    private static final Object[] i;
    private static final String[] j;

    dw_0(Vector4f vector4f, long l) {
        long l2 = (l = e ^ l) ^ 0xBA35289F85DL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = Float.valueOf((float)dw_0.b("W", (Object)vector4f, (long)-3785723456886485227L, (long)l));
        this.a = (float)dw_0.b("\u00e4", (Object)objectArray, (long)-3785306826554559333L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = Float.valueOf((float)dw_0.b("W", (Object)vector4f, (long)-3785594515242560794L, (long)l));
        this.b = (float)dw_0.b("\u00e4", (Object)objectArray2, (long)-3785306826554559333L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l2;
        objectArray3[0] = Float.valueOf((float)dw_0.b("W", (Object)vector4f, (long)-3787103265339069171L, (long)l));
        this.c = (float)dw_0.b("\u00e4", (Object)objectArray3, (long)-3785306826554559333L, (long)l);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l2;
        objectArray4[0] = Float.valueOf((float)dw_0.b("W", (Object)vector4f, (long)-3787202816692292472L, (long)l));
        this.d = (float)dw_0.b("\u00e4", (Object)objectArray4, (long)-3785306826554559333L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        i = new Object[20];
        j = new String[20];
        dw_0.a();
        h = new HashMap(13);
        long l = e ^ 0x53437792D487L;
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
        String string = ".Nm>_\u008e>gp\u00e3\u00e6`\u00b6\u0082\u00b4\u00f8";
        int n2 = ".Nm>_\u008e>gp\u00e3\u00e6`\u00b6\u0082\u00b4\u00f8".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        f = lArray;
        g = new Integer[2];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        Object object2;
        block26: {
            CallSite callSite;
            long l;
            block28: {
                dw_0 dw_02;
                block27: {
                    block25: {
                        Object object3;
                        block23: {
                            block24: {
                                l = e ^ 0x7AB25D9D6BD0L;
                                callSite = dw_0.b("\u00e4", (long)-6558298040996077184L, (long)l);
                                try {
                                    try {
                                        object3 = this;
                                        if (callSite != null) break block23;
                                        if (object3 != object) break block24;
                                        return true;
                                    }
                                    catch (MatchException matchException) {
                                        throw dw_0.b("\u00e4", (Object)matchException, (long)-6558561038961855476L, (long)l);
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw dw_0.b("\u00e4", (Object)matchException, (long)-6558561038961855476L, (long)l);
                                }
                            }
                            object3 = object;
                        }
                        try {
                            int n = object3 instanceof dw_0;
                            if (callSite != null) return n != 0;
                            if (n == 0) return 0 != 0;
                        }
                        catch (MatchException matchException) {
                            throw dw_0.b("\u00e4", (Object)matchException, (long)-6558561038961855476L, (long)l);
                        }
                        dw_02 = (dw_0)object;
                        try {
                            if (callSite != null) {
                                return 0 != 0;
                            }
                        }
                        catch (MatchException matchException) {
                            throw dw_0.b("\u00e4", (Object)matchException, (long)-6558561038961855476L, (long)l);
                        }
                        try {
                            try {
                                object2 = dw_0.b("\u00e4", (float)dw_02.a, (float)this.a, (long)-6558224463774602020L, (long)l);
                                if (callSite != null) break block25;
                                if (object2 != false) break block26;
                            }
                            catch (MatchException matchException) {
                                throw dw_0.b("\u00e4", (Object)matchException, (long)-6558561038961855476L, (long)l);
                            }
                            object2 = dw_0.b("\u00e4", (float)dw_02.b, (float)this.b, (long)-6558224463774602020L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw dw_0.b("\u00e4", (Object)matchException, (long)-6558561038961855476L, (long)l);
                        }
                    }
                    try {
                        try {
                            if (callSite != null) break block27;
                            if (object2 != false) break block26;
                        }
                        catch (MatchException matchException) {
                            throw dw_0.b("\u00e4", (Object)matchException, (long)-6558561038961855476L, (long)l);
                        }
                        object2 = dw_0.b("\u00e4", (float)dw_02.c, (float)this.c, (long)-6558224463774602020L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw dw_0.b("\u00e4", (Object)matchException, (long)-6558561038961855476L, (long)l);
                    }
                }
                try {
                    try {
                        if (callSite != null) break block28;
                        if (object2 != false) break block26;
                    }
                    catch (MatchException matchException) {
                        throw dw_0.b("\u00e4", (Object)matchException, (long)-6558561038961855476L, (long)l);
                    }
                    object2 = dw_0.b("\u00e4", (float)dw_02.d, (float)this.d, (long)-6558224463774602020L, (long)l);
                }
                catch (MatchException matchException) {
                    throw dw_0.b("\u00e4", (Object)matchException, (long)-6558561038961855476L, (long)l);
                }
            }
            try {
                if (callSite != null) return (boolean)object2;
                if (object2 != false) break block26;
            }
            catch (MatchException matchException) {
                throw dw_0.b("\u00e4", (Object)matchException, (long)-6558561038961855476L, (long)l);
            }
            object2 = 1;
            return (boolean)object2;
        }
        object2 = 0;
        return (boolean)object2;
    }

    public int hashCode() {
        long l = e ^ 0x264E4414E833L;
        CallSite callSite = dw_0.b("\u00e4", (float)this.a, (long)2817206700897887447L, (long)l);
        reference var3_5 = dw_0.a("u", (int)13045, (long)(0x22DC3351738CF507L ^ l)) * callSite + dw_0.b("\u00e4", (float)this.b, (long)2817206700897887447L, (long)l);
        var3_5 = dw_0.a("u", (int)29915, (long)(0x365C595A03C53328L ^ l)) * var3_5 + dw_0.b("\u00e4", (float)this.c, (long)2817206700897887447L, (long)l);
        var3_5 = dw_0.a("u", (int)29915, (long)(0x365C595A03C53328L ^ l)) * var3_5 + dw_0.b("\u00e4", (float)this.d, (long)2817206700897887447L, (long)l);
        return (int)var3_5;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = dw_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = dw_0.b(classArray[i], string, clazz2);
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
            int n = dw_0.a(l, l2);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                dw_0.i[n] = clazz = Class.forName(j[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = dw_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = dw_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dw" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(long l, long l2) {
        int n = dw_0.a(l, l2);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = dw_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = dw_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = dw_0.a(clazz3, string2, clazz2)) != null) {
                    dw_0.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = dw_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        dw_0.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = dw_0.b(750942523280351L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = dw_0.a(l, l2);
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
                clazz3 = dw_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = dw_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = dw_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        dw_0.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = dw_0.b(750942523280351L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = dw_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        dw_0.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = dw_0.b(750942523280351L, 0L);
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

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x60EE;
        if (g[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = f[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])h.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/dw", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            dw_0.g[n2] = n3;
        }
        return g[n2];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'W' || c == '\u00a5' || c == '\u00ec' || c == '\u00c1') {
                field = dw_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'W' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00a5' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ec' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = dw_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'G' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = dw_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int a(long l, long l2) {
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
            case 0 -> 13;
            case 1 -> 53;
            case 2 -> 3;
            case 3 -> 59;
            case 4 -> 22;
            case 5 -> 8;
            case 6 -> 12;
            case 7 -> 48;
            case 8 -> 62;
            case 9 -> 50;
            case 10 -> 34;
            case 11 -> 47;
            case 12 -> 7;
            case 13 -> 15;
            case 14 -> 39;
            case 15 -> 9;
            case 16 -> 32;
            case 17 -> 41;
            case 18 -> 52;
            case 19 -> 51;
            case 20 -> 6;
            case 21 -> 54;
            case 22 -> 63;
            case 23 -> 38;
            case 24 -> 33;
            case 25 -> 56;
            case 26 -> 11;
            case 27 -> 36;
            case 28 -> 24;
            case 29 -> 5;
            case 30 -> 0;
            case 31 -> 40;
            case 32 -> 23;
            case 33 -> 25;
            case 34 -> 18;
            case 35 -> 16;
            case 36 -> 42;
            case 37 -> 43;
            case 38 -> 60;
            case 39 -> 28;
            case 40 -> 1;
            case 41 -> 4;
            case 42 -> 27;
            case 43 -> 10;
            case 44 -> 20;
            case 45 -> 35;
            case 46 -> 61;
            case 47 -> 17;
            case 48 -> 21;
            case 49 -> 31;
            case 50 -> 30;
            case 51 -> 45;
            case 52 -> 46;
            case 53 -> 2;
            case 54 -> 19;
            case 55 -> 55;
            case 56 -> 29;
            case 57 -> 26;
            case 58 -> 37;
            case 59 -> 14;
            case 60 -> 58;
            case 61 -> 49;
            case 62 -> 57;
            default -> 44;
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
        dw_0.j[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = i;
        i[0] = "]>,]S9V1=\u0012;9X>.";
        objectArray[1] = Float.TYPE;
        dw_0.j[1] = "java/lang/Float";
        objectArray[2] = Integer.TYPE;
        dw_0.j[2] = "java/lang/Integer";
        objectArray[3] = "\u007fq]{z\b}o\u0014\u0003u\u0004dlHav";
        objectArray[4] = "l\u0015H\f`:z\u0015MVs-m^NP\u007f9|\u0019YG4-j";
        objectArray[5] = "9kB3\u0002\u0003LKI<\u0013L-EB7\u0017\u0016Y";
        objectArray[6] = ")/\u000f\u0014Y\u0012?/\nNJ\u0005(d\tHF\u00119#\u001e_\r\u0003\u0005";
        objectArray[7] = "GrZDH\u001a2RQKYUOJBLP\u001c'";
        objectArray[8] = ">\u0011L\u0002?e(\u0011IX,r?ZJ^ f.\u001d]Ikq-";
        objectArray[9] = "Y%\u0010q\u007f\u0010R*\u0001>\u001c\u001dG'\u000eU)\u001fV4\u0012y>\u0012";
        objectArray[10] = ".j!)R(%e0f3&.n4<";
        objectArray[11] = "'\u0006\u0002H:\"%\u0004\u0004\u001aY!\u001dD\u0000Z>,e\u0005\n^ Ha\u0017BNa' D\u0007#";
        objectArray[12] = "'\n\u0018}<v%\u0001\t~R-\u001b\u0007@{0%eP\u0001*bG";
        objectArray[13] = "M1Xn1J\u0007nQaAYwv^(,\u0011\u00187\rm";
        objectArray[14] = "\u001cZ\f|gU@\u0001\u0004\u0011lMIA\u0001kj*PV\u0011|?E\u0011\u0005T\u0011{EUTP~:\u0016\u00109QvaNCD\t*`K,";
        objectArray[15] = ";o\u0002E]nq0\u000bJ-|\u0001(\u0004\u0003@5niWF";
        objectArray[16] = "u\u000fwE\u000f\u001e?P~J\u007f\u0002OHq\u0003\u0012E \t\"F";
        objectArray[17] = "`2H3Mw6l\u0018hu.]hCf\u0015}d&O$\u000bGc4\u00116O~-8S(u";
        objectArray[18] = "6\u00193\u0000@\u000f|F:\u000f0\u001e\f^5F]Tc\u001ff\u0003";
        Object[] objectArray2 = objectArray;
        objectArray[19] = "\u0004!\u0015\u0003\u0000[Xz\u001dn\u000e@S+\r2\u0007eR>;\u000f\u001c_4>\u001e\u0017\r\u001c[\u007fMR`\u001dS$\u0015\u0001\u001dE\u000f%\u0010n";
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dw" + " : " + string + " : " + methodType.toString(), exception);
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

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = dw_0.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dw_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(dw_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


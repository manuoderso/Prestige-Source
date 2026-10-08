/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bl_0;
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

/*
 * Renamed from dev.zprestige.prestige.dx
 */
public class dx_0 {
    private long a;
    private long b;
    private static final long c = hc.a(-7804340297644719247L, 9136747206141953861L, MethodHandles.lookup().lookupClass()).a(58387377447142L);
    private static final long[] d;
    private static final Long[] e;
    private static final Map f;
    private static final Object[] g;
    private static final String[] h;

    public dx_0(long l) {
        long l2 = (l = c ^ l) ^ 0x67848D9D6406L;
        this.a = (long)dx_0.a("u", (int)2992, (long)(0x466B2B4AD2852D1CL ^ l));
        this.b = (long)dx_0.a("u", (int)2992, (long)(0x466B2B4AD2852D1CL ^ l));
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = this;
        dx_0.b("\u00ed", (Object)dx_0.b("\u00e2", (long)-5979971321740052006L, (long)l), (Object)objectArray, (long)-5979866188964568750L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        g = new Object[16];
        h = new String[16];
        dx_0.a();
        f = new HashMap(13);
        long l = c ^ 0x7C01D41A13C9L;
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
        String string = "\u000e\u00d7\u00c2\u00c7\u00d5\u00f4`\u00f7^&JLn\u001b\u00b0\u000f";
        int n2 = "\u000e\u00d7\u00c2\u00c7\u00d5\u00f4`\u00f7^&JLn\u001b\u00b0\u000f".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        d = lArray;
        e = new Long[2];
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = dx_0.a(l, l2);
            object = g[n];
            try {
                if (!(object instanceof String)) break block2;
                dx_0.g[n] = clazz = Class.forName(h[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = dx_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = dx_0.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
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
            throw new RuntimeException("dev/zprestige/prestige/dx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = dx_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = dx_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = dx_0.a(l, l2);
        Object object = g[n];
        if (object instanceof String) {
            String string = h[n];
            int n2 = string.indexOf(8);
            Class clazz = dx_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = dx_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = dx_0.a(clazz3, string2, clazz2)) != null) {
                    dx_0.g[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = dx_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        dx_0.g[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = dx_0.b(763867506300109L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = dx_0.a(l, l2);
        Object object = g[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = h[n];
                int n3 = string2.indexOf(8);
                clazz3 = dx_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = dx_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = dx_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        dx_0.g[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = dx_0.b(763867506300109L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = dx_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        dx_0.g[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = dx_0.b(763867506300109L, 0L);
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

    private static long a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = dx_0.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
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

    public float a(Object[] objectArray) {
        return (float)this.b * 0.005f;
    }

    @bP
    public void a(bl_0 bl_02) {
        block5: {
            long l;
            block4: {
                l = c ^ 0xBD7C41CDA92L;
                this.b = (long)(dx_0.b("d", (long)-8053015198988219358L, (long)l) - this.a);
                CallSite callSite = dx_0.b("d", (long)-8053246213199124608L, (long)l);
                try {
                    dx_0 dx_02;
                    try {
                        this.a = (long)dx_0.b("d", (long)-8053015198988219358L, (long)l);
                        dx_02 = this;
                        if (callSite != null) break block4;
                        if (!((float)dx_02.b > 30.0f)) break block5;
                    }
                    catch (MatchException matchException) {
                        throw dx_0.b("d", (Object)matchException, (long)-8053106360380570282L, (long)l);
                    }
                    dx_02 = this;
                }
                catch (MatchException matchException) {
                    throw dx_0.b("d", (Object)matchException, (long)-8053106360380570282L, (long)l);
                }
            }
            dx_02.b = (long)dx_0.a("u", (int)8862, (long)(0x51355015B201B90DL ^ l));
        }
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ee' || c == 'I' || c == '\u00e2' || c == '\u00ff') {
                field = dx_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ee' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'I' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = dx_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ed' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'd' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = dx_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (h[n3] != null) {
            return n3;
        }
        Object object = g[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 57;
            case 1 -> 53;
            case 2 -> 54;
            case 3 -> 30;
            case 4 -> 50;
            case 5 -> 43;
            case 6 -> 0;
            case 7 -> 21;
            case 8 -> 49;
            case 9 -> 23;
            case 10 -> 44;
            case 11 -> 20;
            case 12 -> 33;
            case 13 -> 47;
            case 14 -> 31;
            case 15 -> 6;
            case 16 -> 42;
            case 17 -> 10;
            case 18 -> 3;
            case 19 -> 12;
            case 20 -> 2;
            case 21 -> 52;
            case 22 -> 5;
            case 23 -> 58;
            case 24 -> 19;
            case 25 -> 55;
            case 26 -> 34;
            case 27 -> 56;
            case 28 -> 37;
            case 29 -> 24;
            case 30 -> 7;
            case 31 -> 59;
            case 32 -> 32;
            case 33 -> 48;
            case 34 -> 38;
            case 35 -> 36;
            case 36 -> 15;
            case 37 -> 4;
            case 38 -> 9;
            case 39 -> 35;
            case 40 -> 29;
            case 41 -> 60;
            case 42 -> 16;
            case 43 -> 18;
            case 44 -> 62;
            case 45 -> 39;
            case 46 -> 28;
            case 47 -> 51;
            case 48 -> 26;
            case 49 -> 45;
            case 50 -> 11;
            case 51 -> 17;
            case 52 -> 46;
            case 53 -> 41;
            case 54 -> 63;
            case 55 -> 13;
            case 56 -> 14;
            case 57 -> 8;
            case 58 -> 1;
            case 59 -> 61;
            case 60 -> 27;
            case 61 -> 25;
            case 62 -> 22;
            default -> 40;
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
        dx_0.h[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = g;
        g[0] = "\u0018qcKa\u001a\u000eqf\u0011r\r\u0019:e\u0017~\u0019\b}r\u00005\t\u0010}p\u000boD,fp\u0016o\u0003\u001bq";
        objectArray[1] = "\u0013r\u0010\r.\u007f\u0005r\u0015W=h\u00129\u0016Q1|\u0003~\u0001Fzm8";
        objectArray[2] = "\u0000 p\n1.u\u0000{\u0005 a\u0014\u000ep\u000e$;`";
        objectArray[3] = Void.TYPE;
        dx_0.h[3] = "java/lang/Void";
        objectArray[4] = "\u000b\u0004ajb@\u001d\u0004d0qW\nOg6}C\u001b\bp!6Q'";
        objectArray[5] = "~bBE6}\u000bBIJ'2vZZM.{\u001e";
        objectArray[6] = "@|\u0017Wk)Ks\u0006\u0018\u0016<Yi\u0004[";
        objectArray[7] = Long.TYPE;
        dx_0.h[7] = "java/lang/Long";
        objectArray[8] = "5? y\u00131#?%#\u0000&4t&%\f2%312G%)";
        objectArray[9] = "!\b+y]s*\u0007:6>~?\n5]\u000b|.\u0019)q\u001cq";
        objectArray[10] = "Zt\u00053,JQ{\u0014|MDZp\u0010&";
        objectArray[11] = "u\b\rS+|5HJ1~E3\u0018\u0014Osx1\u0015\u001e";
        objectArray[12] = "N\u000be\u0019}yL\u0006ogsD\u000f\u000eo\u0018k+\u000f_m\u0015\u001a~V\u001dg\u0001h&\u000b\u0012zg";
        objectArray[13] = "Sl62+,\u0013<8uB{hj*a>-Shvyy\u0011";
        objectArray[14] = "\u0011MFEz\u001fUW\\P\u001d\u001aPTLY{\rqOSYX\u0010IJWO\u001dL\u001d\u001eW]|MA\u0013X4";
        Object[] objectArray2 = objectArray;
        objectArray[15] = "\"|Gul -,\u0018(\u0007,\u001cr\u0003?}xf5@seE\"0\u000e4:?esB,\u0007";
    }

    private static long a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xBAD;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])f.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    f.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/dx", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            dx_0.e[n2] = l4;
        }
        return e[n2];
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dx_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(dx_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector4f
 *  org.joml.Vector4fc
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bW;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.z_0;
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
import org.joml.Vector4fc;

class dI {
    final bW a;
    final Vector4f b;
    final z_0 c;
    final boolean d;
    private static final long e = hc.a(-2329727465083726983L, 8731073162900764412L, MethodHandles.lookup().lookupClass()).a(48946835076307L);
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;
    private static final Object[] i;
    private static final String[] j;

    dI(bW bW2, Vector4f vector4f, z_0 z_02, boolean bl) {
        this.a = bW2;
        this.b = new Vector4f((Vector4fc)vector4f);
        this.c = z_02;
        this.d = bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        i = new Object[17];
        j = new String[17];
        dI.a();
        h = new HashMap(13);
        long l = e ^ 0x5631A508D409L;
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
        String string = "\u00ed\u00cb\u00b0+\u0019\u00a8\u00bd\u00fcz+\u00f0\u00f4\u000f\u00f3\u0017\u00ea";
        int n2 = "\u00ed\u00cb\u00b0+\u0019\u00a8\u00bd\u00fcz+\u00f0\u00f4\u000f\u00f3\u0017\u00ea".length();
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

    public boolean equals(Object object) {
        Object object2;
        block30: {
            block27: {
                CallSite callSite;
                long l;
                block29: {
                    dI dI2;
                    dI dI3;
                    block28: {
                        block26: {
                            Object object3;
                            block24: {
                                block25: {
                                    block22: {
                                        block23: {
                                            l = e ^ 0x2B0366E18504L;
                                            callSite = dI.b("Y", (long)390077257986902458L, (long)l);
                                            try {
                                                try {
                                                    object3 = this;
                                                    if (callSite != null) break block22;
                                                    if (object3 != object) break block23;
                                                }
                                                catch (MatchException matchException) {
                                                    throw dI.b("Y", (Object)matchException, (long)389578437163002119L, (long)l);
                                                }
                                                return true;
                                            }
                                            catch (MatchException matchException) {
                                                throw dI.b("Y", (Object)matchException, (long)389578437163002119L, (long)l);
                                            }
                                        }
                                        object3 = object;
                                    }
                                    try {
                                        try {
                                            if (callSite != null) break block24;
                                            if (object3 instanceof dI) break block25;
                                        }
                                        catch (MatchException matchException) {
                                            throw dI.b("Y", (Object)matchException, (long)389578437163002119L, (long)l);
                                        }
                                        return false;
                                    }
                                    catch (MatchException matchException) {
                                        throw dI.b("Y", (Object)matchException, (long)389578437163002119L, (long)l);
                                    }
                                }
                                object3 = object;
                            }
                            dI3 = (dI)object3;
                            try {
                                try {
                                    dI2 = this;
                                    if (callSite != null) break block26;
                                    if (dI2.d != dI3.d) break block27;
                                }
                                catch (MatchException matchException) {
                                    throw dI.b("Y", (Object)matchException, (long)389578437163002119L, (long)l);
                                }
                                dI2 = this;
                            }
                            catch (MatchException matchException) {
                                throw dI.b("Y", (Object)matchException, (long)389578437163002119L, (long)l);
                            }
                        }
                        try {
                            try {
                                if (callSite != null) break block28;
                                if (dI2.c != dI3.c) break block27;
                            }
                            catch (MatchException matchException) {
                                throw dI.b("Y", (Object)matchException, (long)389578437163002119L, (long)l);
                            }
                            dI2 = this;
                        }
                        catch (MatchException matchException) {
                            throw dI.b("Y", (Object)matchException, (long)389578437163002119L, (long)l);
                        }
                    }
                    try {
                        try {
                            object2 = dI.b("\u00c4", (Object)dI2.a, (Object)dI3.a, (long)389993763200388719L, (long)l);
                            if (callSite != null) break block29;
                            if (object2 == false) break block27;
                        }
                        catch (MatchException matchException) {
                            throw dI.b("Y", (Object)matchException, (long)389578437163002119L, (long)l);
                        }
                        object2 = dI.b("\u00c4", (Object)this.b, (Object)dI3.b, (long)389829816455731150L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw dI.b("Y", (Object)matchException, (long)389578437163002119L, (long)l);
                    }
                }
                try {
                    if (callSite != null) break block30;
                    if (object2 == false) break block27;
                }
                catch (MatchException matchException) {
                    throw dI.b("Y", (Object)matchException, (long)389578437163002119L, (long)l);
                }
                object2 = 1;
                break block30;
            }
            object2 = false;
        }
        return (boolean)object2;
    }

    public int hashCode() {
        long l = e ^ 0x1DF6B6377FD9L;
        Object object = this.a.hashCode();
        object = dI.a("q", (int)14425, (long)(0x776DBCCFCA6907F5L ^ l)) * object + dI.b("\u00c4", (Object)this.b, (long)-21938835524004385L, (long)l);
        object = dI.a("q", (int)32306, (long)(0x2D0DA6B3D099419FL ^ l)) * object + dI.b("\u00c4", (Object)((Object)this.c), (long)-21020053408109734L, (long)l);
        object = dI.a("q", (int)32306, (long)(0x2D0DA6B3D099419FL ^ l)) * object + dI.b("Y", (boolean)this.d, (long)-20956049799357456L, (long)l);
        return object;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = dI.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = dI.b(classArray[i], string, clazz2);
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
            int n = dI.a(l, l2);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                dI.i[n] = clazz = Class.forName(j[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = dI.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = dI.b(classArray2[i], string, clazz2, n, classArray);
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
            throw new RuntimeException("dev/zprestige/prestige/dI" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(long l, long l2) {
        int n = dI.a(l, l2);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = dI.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = dI.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = dI.a(clazz3, string2, clazz2)) != null) {
                    dI.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = dI.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        dI.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = dI.b(37438590269089L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = dI.a(l, l2);
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
                clazz3 = dI.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = dI.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = dI.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        dI.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = dI.b(37438590269089L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = dI.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        dI.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = dI.b(37438590269089L, 0L);
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x401B;
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
                throw new RuntimeException("dev/zprestige/prestige/dI", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            dI.g[n2] = n3;
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
            if (c == '\u00ce' || c == '\u00d8' || c == 'W' || c == '\u00c7') {
                field = dI.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ce' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d8' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'W' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = dI.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'Y' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = dI.a(lookup, mutableCallSite, string, methodType, l, l2);
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
            case 0 -> 49;
            case 1 -> 54;
            case 2 -> 8;
            case 3 -> 7;
            case 4 -> 12;
            case 5 -> 46;
            case 6 -> 38;
            case 7 -> 44;
            case 8 -> 51;
            case 9 -> 26;
            case 10 -> 36;
            case 11 -> 57;
            case 12 -> 19;
            case 13 -> 55;
            case 14 -> 28;
            case 15 -> 39;
            case 16 -> 63;
            case 17 -> 14;
            case 18 -> 35;
            case 19 -> 53;
            case 20 -> 1;
            case 21 -> 15;
            case 22 -> 22;
            case 23 -> 42;
            case 24 -> 23;
            case 25 -> 6;
            case 26 -> 16;
            case 27 -> 61;
            case 28 -> 34;
            case 29 -> 29;
            case 30 -> 58;
            case 31 -> 40;
            case 32 -> 37;
            case 33 -> 3;
            case 34 -> 18;
            case 35 -> 5;
            case 36 -> 32;
            case 37 -> 60;
            case 38 -> 20;
            case 39 -> 56;
            case 40 -> 41;
            case 41 -> 31;
            case 42 -> 10;
            case 43 -> 13;
            case 44 -> 25;
            case 45 -> 0;
            case 46 -> 62;
            case 47 -> 50;
            case 48 -> 9;
            case 49 -> 21;
            case 50 -> 59;
            case 51 -> 43;
            case 52 -> 45;
            case 53 -> 2;
            case 54 -> 4;
            case 55 -> 52;
            case 56 -> 30;
            case 57 -> 17;
            case 58 -> 48;
            case 59 -> 11;
            case 60 -> 27;
            case 61 -> 24;
            case 62 -> 47;
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
        dI.j[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = i;
        i[0] = "d{m*\u0014\u0002ot|eu\fd\u007fx?";
        objectArray[1] = Boolean.TYPE;
        dI.j[1] = "java/lang/Boolean";
        objectArray[2] = "\u000b\u000fB\u007fm0\u001d\u000fG%~'\nDD#r3\u001b\u0003S49!'";
        objectArray[3] = "\u001bBB\u0017\bJnbI\u0018\u0019\u0005\u0013zZ\u001f\u0010L{";
        objectArray[4] = "_\u0013GS\u0001\u0006I\u0013B\t\u0012\u0011^XA\u000f\u001e\u0005O\u001fV\u0018U\u0012r";
        objectArray[5] = "$\u0018~\u000e\u00064/\u0017oAe9:\u001a`*P;+\t|\u0006G6";
        objectArray[6] = "qL\u0019 -3sRPX\"?jQ\f:!";
        objectArray[7] = "}6\bmrik6\r7a~|}\u000e1mjm:\u0019&&c";
        objectArray[8] = Integer.TYPE;
        dI.j[8] = "java/lang/Integer";
        objectArray[9] = "ci\\B\u0006,hfM\rj/fdOBF";
        objectArray[10] = "\u0016_\u001e}\u0018k\u0016\r]D\b*\u0007\u0007\u0000?e?K\u0014]9]?\u0019Wd:\u000eo\u0000\u0014\u001fu\u0001jz";
        objectArray[11] = "E\u001ag[\u0002\u0005\u0017\u0000lUpR|Bl\u0001\u0011^\u0013\nmP\u00018";
        objectArray[12] = "\u001aN:\\Y<QZ>\u001e63!\u00188\u001fO!^N7K\\Z\u001aGcYM%LH7J6";
        objectArray[13] = "D1\rE\u0015_EcME|_\u0010&\u001ca\u001bS\u0014]AX\u001aF\u00044D[\u001aAy";
        objectArray[14] = "ix}\r[P5z;W N>ydyGB:\u0002zY\u001cT-y5V\u0019.jpbK]GosbL ";
        objectArray[15] = "7tP+\u0004\u00025w\b/y\u0014ri\\4\u0002yg%Oi\u0004Agw\fP\u0007\u00127nO+H\u001d2\u0014";
        Object[] objectArray2 = objectArray;
        objectArray[16] = "\u001al]e=.\u0018o\u0005a@5OwXU'9K\f\u0005l&,[e\u0000o&+&";
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dI" + " : " + string + " : " + methodType.toString(), exception);
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
        int n2 = dI.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dI.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(dI.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


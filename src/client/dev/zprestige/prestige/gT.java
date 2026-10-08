/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.dy_0;
import dev.zprestige.prestige.fW;
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

public record gT(boolean b1, boolean b2) implements fW
{
    private static final long b;
    private static final long[] c;
    private static final Integer[] d;
    private static final Map e;
    private static final Object[] f;
    private static final String[] g;

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                gT.b = hc.a(3674795289907048816L, 157740213669738331L, MethodHandles.lookup().lookupClass()).a(71442291639787L);
                gT.f = new Object[14];
                gT.g = new String[14];
                gT.b();
                gT.e = new HashMap<K, V>(13);
                var0 = gT.b ^ 48436557527157L;
                var2_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var8_3 = new long[5];
                var5_4 = 0;
                var6_5 = "\u0082\u00fd\u00d5?\u00d6B\u008c\u0095\u00beK\u00f7\u00e4\u00cd\u001a\u008a\u00f4\u0012\u00e4\u00d2U\u00a4:i\u0006";
                var7_6 = "\u0082\u00fd\u00d5?\u00d6B\u008c\u0095\u00beK\u00f7\u00e4\u00cd\u001a\u008a\u00f4\u0012\u00e4\u00d2U\u00a4:i\u0006".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl41:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = ">\u00f3T\u0083\u00a2\u00a9\u00d1\u008e\n\u00b7E@\u00a6\u008e\u00de\u0084";
                    var7_6 = ">\u00f3T\u0083\u00a2\u00a9\u00d1\u008e\n\u00b7E@\u00a6\u008e\u00de\u0084".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl60:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block9;
                    break;
                }
            }
            var10_9 = v5;
            var12_10 = var2_1.doFinal(new byte[]{(byte)(var10_9 >>> 56), (byte)(var10_9 >>> 48), (byte)(var10_9 >>> 40), (byte)(var10_9 >>> 32), (byte)(var10_9 >>> 24), (byte)(var10_9 >>> 16), (byte)(var10_9 >>> 8), (byte)var10_9});
            v7 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl73:
                // 1 sources

                ** continue;
            }
        }
        gT.c = var8_3;
        gT.d = new Integer[5];
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/gT" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void b() {
        Object[] objectArray = f;
        f[0] = "O\u0016K`IzY\u0016N:ZmN]M<Vy_\u001aZ+\u001dkc";
        objectArray[1] = ".\n6y+L[*=v:\u0003&2.q3JN";
        objectArray[2] = "O\u0005\nvQuJ\u0010\u0001vRrE\u0019\n4\u0013ElF\\";
        objectArray[3] = Integer.TYPE;
        gT.g[3] = "java/lang/Integer";
        objectArray[4] = Void.TYPE;
        gT.g[4] = "java/lang/Void";
        objectArray[5] = "-5j\u001d~+( a\u001d},')j_<\u001b\u000ev9";
        objectArray[6] = "@+d)\u0002DV+as\u0011SA`bu\u001dGP'ubVSp";
        objectArray[7] = "I_x~?\nBPi1\\\u0007W]fZi\u0005FNzv~\b";
        objectArray[8] = "=\u0017}\u0013\u007f?6\u0018l\\\u001e1=\u0013h\u0006";
        objectArray[9] = "\fU']\b\u0011Y\u0012oG6\u0012QeyD\\\u0019X(%\u001cLCNN~\u0017J\u00035\u0013 MG\rDA`\u0017Y}";
        objectArray[10] = "G`0\u001brx\u001et,f`\u0018\u0003p/\nz\"\u0018u7f";
        objectArray[11] = "\u001a \u000ew2sOgFm\fpG\u0011W|euG06==e\u001d&Pf6c]]\r8lnS,_x6p#";
        objectArray[12] = "Ot\u001aojgO>Mo\u00038\u0010L\u0014~e;:{\u0016xX:\fo\nz\u007f:t<Ai=,\u0012gJo}WN7\n-x1\u0015<\fm\u0003mE|Nhe6Nz\u000e\u00139f\u000e8\u000bubm\bxp(<7\u0005v\u0001z|m\u001b\u0006";
        Object[] objectArray2 = objectArray;
        objectArray[13] = "\u0003TZp\u001c\u0007^KF+~\u0000?\b\u0012~\u001f\u000fS\u0004I2\u0001i\u0002\r\u0014!\u0018\u0005\u000eVX?~";
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = gT.a(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                gT.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = gT.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = gT.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = gT.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = gT.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = gT.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = gT.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = gT.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = gT.a(clazz3, string2, clazz2)) != null) {
                    gT.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = gT.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        gT.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = gT.b(576879759984529L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = gT.a(l, l2);
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
                clazz3 = gT.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = gT.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = gT.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        gT.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = gT.b(576879759984529L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = gT.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        gT.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = gT.b(576879759984529L, 0L);
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

    @Override
    public void a(dy_0 dy_02) {
        block8: {
            Object object;
            long l;
            block6: {
                l = b ^ 0x7F8B4B8945D8L;
                CallSite callSite = gT.b("\u00e9", (long)-8381222306548132252L, (long)l);
                try {
                    block7: {
                        try {
                            try {
                                object = this.b1;
                                if (callSite != null) break block6;
                                if (object == 0) break block7;
                            }
                            catch (MatchException matchException) {
                                throw gT.b("\u00e9", (Object)matchException, (long)-8381747015638367407L, (long)l);
                            }
                            gT.b("\u00e9", (int)gT.a("k", (int)13967, (long)(0x75C1043D5277B7C0L ^ l)), (long)-8381478387503566894L, (long)l);
                            gT.b("\u00e9", (int)gT.a("k", (int)13328, (long)(0x1D1A4C64AC85B55AL ^ l)), (int)gT.a("k", (int)9834, (long)(0x2B6B724872EAA726L ^ l)), (int)1, (int)gT.a("k", (int)23178, (long)(0x62253598D27A5BC7L ^ l)), (long)-8381652130810871222L, (long)l);
                            if (callSite == null) break block8;
                        }
                        catch (MatchException matchException) {
                            throw gT.b("\u00e9", (Object)matchException, (long)-8381747015638367407L, (long)l);
                        }
                    }
                    object = gT.a("k", (int)12549, (long)(0xB6A17C723C8304BL ^ l));
                }
                catch (MatchException matchException) {
                    throw gT.b("\u00e9", (Object)matchException, (long)-8381747015638367407L, (long)l);
                }
            }
            gT.b("\u00e9", (int)object, (long)-8381298571567621009L, (long)l);
        }
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'H' || c == '\u00ba' || c == '\u00d9' || c == '\u00d3') {
                field = gT.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'H' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ba' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d9' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = gT.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e9' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = gT.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/gT" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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
            case 0 -> 46;
            case 1 -> 17;
            case 2 -> 11;
            case 3 -> 62;
            case 4 -> 51;
            case 5 -> 39;
            case 6 -> 21;
            case 7 -> 48;
            case 8 -> 34;
            case 9 -> 20;
            case 10 -> 26;
            case 11 -> 35;
            case 12 -> 9;
            case 13 -> 6;
            case 14 -> 8;
            case 15 -> 14;
            case 16 -> 49;
            case 17 -> 12;
            case 18 -> 24;
            case 19 -> 50;
            case 20 -> 60;
            case 21 -> 27;
            case 22 -> 10;
            case 23 -> 59;
            case 24 -> 23;
            case 25 -> 44;
            case 26 -> 19;
            case 27 -> 53;
            case 28 -> 1;
            case 29 -> 40;
            case 30 -> 25;
            case 31 -> 3;
            case 32 -> 18;
            case 33 -> 47;
            case 34 -> 29;
            case 35 -> 36;
            case 36 -> 32;
            case 37 -> 52;
            case 38 -> 63;
            case 39 -> 61;
            case 40 -> 28;
            case 41 -> 55;
            case 42 -> 13;
            case 43 -> 37;
            case 44 -> 57;
            case 45 -> 15;
            case 46 -> 56;
            case 47 -> 0;
            case 48 -> 2;
            case 49 -> 5;
            case 50 -> 42;
            case 51 -> 38;
            case 52 -> 31;
            case 53 -> 4;
            case 54 -> 41;
            case 55 -> 7;
            case 56 -> 45;
            case 57 -> 16;
            case 58 -> 33;
            case 59 -> 30;
            case 60 -> 22;
            case 61 -> 54;
            case 62 -> 58;
            default -> 43;
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
        gT.g[n3] = new String(cArray);
        return n3;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xAE3;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])e.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    e.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/gT", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            gT.d[n2] = n3;
        }
        return d[n2];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @Override
    public void a() {
        block11: {
            Object object;
            long l;
            block12: {
                CallSite callSite;
                block10: {
                    l = b ^ 0x1D12FD0F3C4CL;
                    callSite = gT.b("\u00e9", (long)-992049559807447056L, (long)l);
                    try {
                        try {
                            object = this.b2;
                            if (callSite != null) break block10;
                            if (object == this.b1) break block11;
                        }
                        catch (MatchException matchException) {
                            throw gT.b("\u00e9", (Object)matchException, (long)-992357730739471675L, (long)l);
                        }
                        object = this.b2;
                    }
                    catch (MatchException matchException) {
                        throw gT.b("\u00e9", (Object)matchException, (long)-992357730739471675L, (long)l);
                    }
                }
                try {
                    block13: {
                        try {
                            try {
                                if (callSite != null) break block12;
                                if (object == 0) break block13;
                            }
                            catch (MatchException matchException) {
                                throw gT.b("\u00e9", (Object)matchException, (long)-992357730739471675L, (long)l);
                            }
                            gT.b("\u00e9", (int)gT.a("k", (int)12549, (long)(0xB6A755E954E49DFL ^ l)), (long)-992090123649018298L, (long)l);
                            if (callSite == null) break block11;
                        }
                        catch (MatchException matchException) {
                            throw gT.b("\u00e9", (Object)matchException, (long)-992357730739471675L, (long)l);
                        }
                    }
                    object = gT.a("k", (int)12549, (long)(0xB6A755E954E49DFL ^ l));
                }
                catch (MatchException matchException) {
                    throw gT.b("\u00e9", (Object)matchException, (long)-992357730739471675L, (long)l);
                }
            }
            gT.b("\u00e9", (int)object, (long)-991979651033242117L, (long)l);
        }
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = gT.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(gT.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(gT.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


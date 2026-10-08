/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_243
 *  net.minecraft.class_3726
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bR;
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
import net.minecraft.class_1297;
import net.minecraft.class_243;
import net.minecraft.class_3726;
import net.minecraft.class_3959;

public class Y {
    private static final bR a;
    private static final bR b;
    private static final bR c;
    private static final bR d;
    private static final bR e;
    private final class_3959 f;
    private static final long g;
    private static final Object[] h;
    private static final String[] i;

    public Y(class_3959 class_39592) {
        this.f = class_39592;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                Y.g = hc.a(5261791953522435809L, -7048710023625895329L, MethodHandles.lookup().lookupClass()).a(136881078431119L);
                var9 = Y.g ^ 19767041053844L;
                var11_1 = var9 ^ 37182518057368L;
                Y.h = new Object[22];
                Y.i = new String[22];
                Y.a();
                var1_2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var2_3 = 1; var2_3 < 8; ++var2_3) {
                    v2 = v2;
                    v2[var2_3] = (byte)(var9 << var2_3 * 8 >>> 56);
                }
                var1_2.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var0_4 = new String[5];
                var6_5 = 0;
                var5_6 = "\u00c5$\u0016\u00f1\u00f0#\u00b6\u00dd\u0004\u0097)/g\u00d9\n\u00f3\bI\u0002@\u00b7\u00e2\\\u0015\u00aa\u0010\u00fcc\u00b4\u0088\u00ea\u00ed\u00ec>7\u00ed\u0005\u0004\u00bf2\u00f4\u00c7";
                var7_7 = "\u00c5$\u0016\u00f1\u00f0#\u00b6\u00dd\u0004\u0097)/g\u00d9\n\u00f3\bI\u0002@\u00b7\u00e2\\\u0015\u00aa\u0010\u00fcc\u00b4\u0088\u00ea\u00ed\u00ec>7\u00ed\u0005\u0004\u00bf2\u00f4\u00c7".length();
                var4_8 = 16;
                var3_9 = -1;
lbl33:
                // 2 sources

                while (true) {
                    v3 = ++var3_9;
                    v4 = var5_6.substring(v3, v3 + var4_8);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl38:
                // 1 sources

                while (true) {
                    var0_4[var6_5++] = Y.a(var8_10).intern();
                    if ((var3_9 += var4_8) < var7_7) {
                        var4_8 = var5_6.charAt(var3_9);
                        ** continue;
                    }
                    var5_6 = "\u00a1\u00f0\u00da\u000b\u0014\u0019\u00e5+\b\u000f\u00ce-\u001a^\u00f2\u0080]";
                    var7_7 = "\u00a1\u00f0\u00da\u000b\u0014\u0019\u00e5+\b\u000f\u00ce-\u001a^\u00f2\u0080]".length();
                    var4_8 = 8;
                    var3_9 = -1;
lbl47:
                    // 2 sources

                    while (true) {
                        v6 = ++var3_9;
                        v4 = var5_6.substring(v6, v6 + var4_8);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl52:
                // 1 sources

                while (true) {
                    var0_4[var6_5++] = Y.a(var8_10).intern();
                    if ((var3_9 += var4_8) < var7_7) {
                        var4_8 = var5_6.charAt(var3_9);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var8_10 = var1_2.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl64:
                // 1 sources

                ** continue;
            }
        }
        v7 = new Object[4];
        v7[3] = var11_1;
        v7[2] = class_243.class;
        v7[1] = var0_4[1];
        v7[0] = class_3959.class;
        Y.a = Y.a("j", (Object)v7, (long)-1816564739341155725L, (long)var9);
        v8 = new Object[4];
        v8[3] = var11_1;
        v8[2] = class_243.class;
        v8[1] = var0_4[3];
        v8[0] = class_3959.class;
        Y.b = Y.a("j", (Object)v8, (long)-1816564739341155725L, (long)var9);
        v9 = new Object[4];
        v9[3] = var11_1;
        v9[2] = class_3959.class_3960.class;
        v9[1] = var0_4[2];
        v9[0] = class_3959.class;
        Y.c = Y.a("j", (Object)v9, (long)-1816564739341155725L, (long)var9);
        v10 = new Object[4];
        v10[3] = var11_1;
        v10[2] = class_3959.class_242.class;
        v10[1] = var0_4[4];
        v10[0] = class_3959.class;
        Y.d = Y.a("j", (Object)v10, (long)-1816564739341155725L, (long)var9);
        v11 = new Object[4];
        v11[3] = var11_1;
        v11[2] = class_3726.class;
        v11[1] = var0_4[0];
        v11[0] = class_3959.class;
        Y.e = Y.a("j", (Object)v11, (long)-1816564739341155725L, (long)var9);
    }

    public void e(Object[] objectArray) {
        class_3726 class_37262 = (class_3726)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = g ^ l) ^ 0x285B5370E668L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = class_37262;
        objectArray2[0] = this.f;
        Y.a("u", (Object)e, (Object)objectArray2, (long)5831399386608241678L, (long)l);
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = Y.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = Y.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = Y.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = Y.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = Y.a(l, l2);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                Y.h[n] = clazz = Class.forName(i[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public void b(Object[] objectArray) {
        class_243 class_2432 = (class_243)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = g ^ l) ^ 0x64CA04BFFF50L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = class_2432;
        objectArray2[0] = this.f;
        Y.a("u", (Object)b, (Object)objectArray2, (long)5320165448664749366L, (long)l);
    }

    private static Field c(long l, long l2) {
        int n = Y.a(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = Y.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = Y.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = Y.a(clazz3, string2, clazz2)) != null) {
                    Y.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = Y.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        Y.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = Y.b(934463513324175L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public void c(Object[] objectArray) {
        class_3959.class_3960 class_39602 = (class_3959.class_3960)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = g ^ l) ^ 0x730E87F93D30L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = class_39602;
        objectArray2[0] = this.f;
        Y.a("u", (Object)c, (Object)objectArray2, (long)-8379772233245075626L, (long)l);
    }

    public void f(Object[] objectArray) {
        class_243 class_2432 = (class_243)objectArray[0];
        class_243 class_2433 = (class_243)objectArray[1];
        class_3959.class_3960 class_39602 = (class_3959.class_3960)objectArray[2];
        class_3959.class_242 class_2422 = (class_3959.class_242)objectArray[3];
        class_1297 class_12972 = (class_1297)objectArray[4];
        long l = (Long)objectArray[5];
        long l2 = l = g ^ l;
        long l3 = l2 ^ 0x160758A6F322L;
        long l4 = l2 ^ 0xAB6AA78B232L;
        long l5 = l2 ^ 0x5C833CEE2529L;
        long l6 = l2 ^ 0x51E37EF1696AL;
        long l7 = l2 ^ 0x4627FDB7AB0AL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = class_2432;
        Y.a("u", (Object)this, (Object)objectArray2, (long)-3421948297685666488L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l7;
        objectArray3[0] = class_2433;
        Y.a("u", (Object)this, (Object)objectArray3, (long)-3421078723521768379L, (long)l);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l6;
        objectArray4[0] = class_39602;
        Y.a("u", (Object)this, (Object)objectArray4, (long)-3421287628131207358L, (long)l);
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l5;
        objectArray5[0] = class_2422;
        Y.a("u", (Object)this, (Object)objectArray5, (long)-3421164925092211109L, (long)l);
        Object[] objectArray6 = new Object[2];
        objectArray6[1] = l4;
        objectArray6[0] = Y.a("j", (Object)class_12972, (long)-3421978187941991680L, (long)l);
        Y.a("u", (Object)this, (Object)objectArray6, (long)-3421199816711250997L, (long)l);
    }

    private static Method d(long l, long l2) {
        int n = Y.a(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = i[n];
                int n3 = string2.indexOf(8);
                clazz3 = Y.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = Y.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = Y.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        Y.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = Y.b(934463513324175L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = Y.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        Y.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = Y.b(934463513324175L, 0L);
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

    public void d(Object[] objectArray) {
        class_3959.class_242 class_2422 = (class_3959.class_242)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = g ^ l) ^ 0x7E6EC5E67173L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = class_2422;
        objectArray2[0] = this.f;
        Y.a("u", (Object)d, (Object)objectArray2, (long)-4038008211647653099L, (long)l);
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'k' || c == '\u00d1' || c == '\u00ec' || c == 'G') {
                field = Y.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'k' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d1' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ec' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = Y.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'u' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'j' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = Y.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/Y" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void a(Object[] objectArray) {
        class_243 class_2432 = (class_243)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = g ^ l) ^ 0x34EAA1AEA778L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = class_2432;
        objectArray2[0] = this.f;
        Y.a("u", (Object)a, (Object)objectArray2, (long)1296287278417136926L, (long)l);
    }

    private static String a(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (i[n3] != null) {
            return n3;
        }
        Object object = h[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 36;
            case 1 -> 4;
            case 2 -> 12;
            case 3 -> 14;
            case 4 -> 17;
            case 5 -> 13;
            case 6 -> 58;
            case 7 -> 57;
            case 8 -> 10;
            case 9 -> 31;
            case 10 -> 56;
            case 11 -> 37;
            case 12 -> 61;
            case 13 -> 6;
            case 14 -> 30;
            case 15 -> 54;
            case 16 -> 63;
            case 17 -> 21;
            case 18 -> 19;
            case 19 -> 9;
            case 20 -> 52;
            case 21 -> 7;
            case 22 -> 55;
            case 23 -> 34;
            case 24 -> 39;
            case 25 -> 2;
            case 26 -> 53;
            case 27 -> 43;
            case 28 -> 44;
            case 29 -> 20;
            case 30 -> 11;
            case 31 -> 25;
            case 32 -> 1;
            case 33 -> 24;
            case 34 -> 8;
            case 35 -> 27;
            case 36 -> 3;
            case 37 -> 28;
            case 38 -> 26;
            case 39 -> 45;
            case 40 -> 16;
            case 41 -> 42;
            case 42 -> 23;
            case 43 -> 48;
            case 44 -> 46;
            case 45 -> 22;
            case 46 -> 15;
            case 47 -> 41;
            case 48 -> 5;
            case 49 -> 32;
            case 50 -> 40;
            case 51 -> 51;
            case 52 -> 59;
            case 53 -> 47;
            case 54 -> 35;
            case 55 -> 0;
            case 56 -> 49;
            case 57 -> 33;
            case 58 -> 18;
            case 59 -> 29;
            case 60 -> 60;
            case 61 -> 38;
            case 62 -> 62;
            default -> 50;
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
        Y.i[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = h;
        h[0] = "\u0016\u0011`:wW\u0000\u0011e`d@\u0017ZffhT\u0006\u001dqq#E ";
        objectArray[1] = ")!5BUp\\\u0001>MD?=\u000f5F@eI";
        objectArray[2] = Void.TYPE;
        Y.i[2] = "java/lang/Void";
        objectArray[3] = "_\u0004-VvKI\u0004(\fe\\^O+\niHO\b<\u001d\"Xm";
        objectArray[4] = "||%HHh\t\\.GY'hR%L]}\u001c";
        objectArray[5] = "[qB\u0000iSMqGZzDZ:D\\vPK}SK=z";
        objectArray[6] = "l`O@Q?\u0019@DO@pxNODD*\f";
        objectArray[7] = "\fW,#\u001eGyw',\u000f\b\u0018y,'\u000bRl";
        objectArray[8] = "%vb\\AtPViSP;1XbXTaE";
        objectArray[9] = "{/}z\u0018z{/j&\u0014uadj8\u0014`f\u0015:cG%";
        objectArray[10] = "\u0005Wz\u001dn0\u0005WmAb?\u001f\u001cm_b*\u0018m?\u0001:n";
        objectArray[11] = "b\u0017\u000b\u001cKo\u00177\u0000\u0013Z v9\u000b\u0018^z\u0002";
        objectArray[12] = "zjE9Fi\u000fJN6W&nDE=S|\u001a";
        objectArray[13] = "bfL<\u000f7ii]sn9bbY)";
        objectArray[14] = "z=+!du(;}w\u0016}Alw?mi1!w/&\u0014x-t'\u007fl$3}|\u0016";
        objectArray[15] = "\rc\u0014^);L<\u001aKN=^.\u0015]\"\u000f\nlL\u000bsX\f=\u001aZ\u007f*Z0\u0016\u0005Nf\u00023\u0011]-']=\u0004:";
        objectArray[16] = "|tX\u001f\rB.r\u000eI\u007fNG%\u0004\u0001\u0004^7h\u0004\u0011O#~d\u0007\u0019\u0016[\"z\u000eB\u007f";
        objectArray[17] = "\r\u0006A\u0014AF_\u0000\u0017B3L6W\u001d\nHZF\u001a\u001d\u001a\u0003'\u000f\u0016\u001e\u0012Z_S\b\u0017I3";
        objectArray[18] = "W\u0002O[!\u007f\u0005\u0004\u0019\rStlS\u0013E(c\u001c\u001e\u0013Uc\u001eU\u0012\u0010]:f\t\f\u0019\u0006S";
        objectArray[19] = "u;\rZ\u0017S'=[\fe^NjQD\u001eO>'QTU2w+R\\\fJ+5[\u0007e";
        objectArray[20] = "H0v'fsE~4YsJI\":\"`:\u0004\"*i\u001ds\b!\"0e/\u0016(yY";
        Object[] objectArray2 = objectArray;
        objectArray[21] = "YF]Hc\u0004\u0000\u001b\u0005V\u0002\u001ccI\r^y\b\u0013\u0004\rN2uR\u0006^RyL_H\u001c,";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Y.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


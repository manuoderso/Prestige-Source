/*
 * Decompiled with CFR 0.152.
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
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Renamed from dev.zprestige.prestige.p
 */
final class p_0
extends Enum {
    public static final p_0 PREP;
    public static final p_0 PEARL;
    public static final p_0 WIND;
    public static final p_0 RESTORE;
    private static final p_0[] a;
    private static final long b;
    private static final Object[] c;
    private static final String[] d;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private p_0() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                p_0.b = hc.a(814076349416681221L, 6433678596292617570L, MethodHandles.lookup().lookupClass()).a(210289465925044L);
                var9 = p_0.b ^ 120704498877434L;
                p_0.c = new Object[9];
                p_0.d = new String[9];
                p_0.a();
                var1_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var2_2 = 1; var2_2 < 8; ++var2_2) {
                    v2 = v2;
                    v2[var2_2] = (byte)(var9 << var2_2 * 8 >>> 56);
                }
                var1_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var0_3 = new String[4];
                var6_4 = 0;
                var5_5 = "2\u0018@c\u0092\u001a9\u0080\b\u0089\u00b8E\u0092}\u00b2P\u0088";
                var7_6 = "2\u0018@c\u0092\u001a9\u0080\b\u0089\u00b8E\u0092}\u00b2P\u0088".length();
                var4_7 = 8;
                var3_8 = -1;
lbl31:
                // 2 sources

                while (true) {
                    v3 = ++var3_8;
                    v4 = var5_5.substring(v3, v3 + var4_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl36:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = p_0.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "No\u00ce\u00c3\u0098\u009b\u00c8+\b<\u00a4L\u0003;\u0002L\u00c4";
                    var7_6 = "No\u00ce\u00c3\u0098\u009b\u00c8+\b<\u00a4L\u0003;\u0002L\u00c4".length();
                    var4_7 = 8;
                    var3_8 = -1;
lbl45:
                    // 2 sources

                    while (true) {
                        v6 = ++var3_8;
                        v4 = var5_5.substring(v6, v6 + var4_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl50:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = p_0.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var8_9 = var1_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl62:
                // 1 sources

                ** continue;
            }
        }
        p_0.PREP = new p_0(var0_3[0], 0);
        p_0.PEARL = new p_0(var0_3[2], 1);
        p_0.WIND = new p_0(var0_3[3], 2);
        p_0.RESTORE = new p_0(var0_3[1], 3);
        p_0.a = p_0.a("\u00cd", (Object)new Object[0], (long)-6670900908836228829L, (long)var9);
    }

    public static p_0[] values() {
        return (p_0[])a.clone();
    }

    public static p_0 valueOf(String string, long l) {
        l = b ^ l;
        return (p_0)((Object)p_0.a("\u00cd", p_0.class, (Object)string, (long)-5969929187346345895L, (long)l));
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = p_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = p_0.b(classArray[i], string, clazz2);
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
            int n = p_0.a(l, l2);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                p_0.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = p_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = p_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = p_0.a(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = p_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = p_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = p_0.a(clazz3, string2, clazz2)) != null) {
                    p_0.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = p_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        p_0.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = p_0.b(471694222889994L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = p_0.a(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = d[n];
                int n3 = string2.indexOf(8);
                clazz3 = p_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = p_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = p_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        p_0.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = p_0.b(471694222889994L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = p_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        p_0.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = p_0.b(471694222889994L, 0L);
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d6' || c == '\u00fd' || c == '\u00e9' || c == '$') {
                field = p_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d6' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fd' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e9' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = p_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'r' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00cd' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = p_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/p" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static p_0[] a(Object[] objectArray) {
        return new p_0[]{PREP, PEARL, WIND, RESTORE};
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
        if (d[n3] != null) {
            return n3;
        }
        Object object = c[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 53;
            case 1 -> 42;
            case 2 -> 23;
            case 3 -> 35;
            case 4 -> 17;
            case 5 -> 30;
            case 6 -> 63;
            case 7 -> 4;
            case 8 -> 33;
            case 9 -> 34;
            case 10 -> 15;
            case 11 -> 44;
            case 12 -> 40;
            case 13 -> 48;
            case 14 -> 43;
            case 15 -> 10;
            case 16 -> 11;
            case 17 -> 8;
            case 18 -> 45;
            case 19 -> 6;
            case 20 -> 58;
            case 21 -> 50;
            case 22 -> 57;
            case 23 -> 31;
            case 24 -> 24;
            case 25 -> 55;
            case 26 -> 59;
            case 27 -> 18;
            case 28 -> 7;
            case 29 -> 51;
            case 30 -> 9;
            case 31 -> 5;
            case 32 -> 46;
            case 33 -> 38;
            case 34 -> 20;
            case 35 -> 12;
            case 36 -> 29;
            case 37 -> 19;
            case 38 -> 36;
            case 39 -> 49;
            case 40 -> 56;
            case 41 -> 22;
            case 42 -> 27;
            case 43 -> 1;
            case 44 -> 54;
            case 45 -> 62;
            case 46 -> 41;
            case 47 -> 47;
            case 48 -> 16;
            case 49 -> 26;
            case 50 -> 60;
            case 51 -> 61;
            case 52 -> 0;
            case 53 -> 2;
            case 54 -> 37;
            case 55 -> 3;
            case 56 -> 25;
            case 57 -> 21;
            case 58 -> 32;
            case 59 -> 39;
            case 60 -> 13;
            case 61 -> 14;
            case 62 -> 28;
            default -> 52;
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
        p_0.d[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = c;
        c[0] = "\u0010*|\t8\u0010\u001b%mFS\u0012\u000f&";
        objectArray[1] = "{Q\u0006\u0011j\u001ep^\u0017^\u0007\u001epC\u0003";
        objectArray[2] = "C\u0014g911H\u001bvvL)[\u001c\u007f?";
        objectArray[3] = "\t_Wg0C\u001f_R=#T\b\u0014Q;/@\u0019SF,dC";
        objectArray[4] = "x|9\u001b\u001e\u0013\r\\2\u0014\u000f\\lR9\u001f\u000b\u0006\u0018";
        objectArray[5] = "|N-\u001cx\u000b]r;\u001c}QNe,W~WBq=\u0010i@\trr";
        objectArray[6] = "um\u0005\u0002\te~b\u0014Mhkui\u0010\u0017";
        objectArray[7] = "3r\u0015V 1:-Pk%61a\u0007,5_lvQ\u0002?b6-\r\u0001[f%fZR7=nd\u0014k=1*!\u0011\u00054no\u001c";
        Object[] objectArray2 = objectArray;
        objectArray[8] = "GV6%`JM\u0007e \u000bM}\u0002tzw\u001eEReus$FFurk\u001cE\\uu\u000b";
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
            return MethodHandles.lookup().findStatic(p_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


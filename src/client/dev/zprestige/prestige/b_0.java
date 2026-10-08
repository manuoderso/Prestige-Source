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
 * Renamed from dev.zprestige.prestige.b
 */
final class b_0
extends Enum {
    public static final b_0 IDLE;
    public static final b_0 PLACE;
    public static final b_0 WAIT;
    public static final b_0 SCOOP;
    public static final b_0 BACK;
    private static final b_0[] a;
    private static final long b;
    private static final Object[] c;
    private static final String[] d;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b_0() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                b_0.b = hc.a(6339350962235059510L, 8498805275150270159L, MethodHandles.lookup().lookupClass()).a(269854313429901L);
                var9 = b_0.b ^ 64162826830988L;
                b_0.c = new Object[9];
                b_0.d = new String[9];
                b_0.a();
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
                var0_3 = new String[5];
                var6_4 = 0;
                var5_5 = "\u00f1\u0001V5F\u001aC\u0015\b8\u0099\u0006\u00b5/\u00cc\u00f2\u00b1\b\u00af\u001a#~}:?\u0014";
                var7_6 = "\u00f1\u0001V5F\u001aC\u0015\b8\u0099\u0006\u00b5/\u00cc\u00f2\u00b1\b\u00af\u001a#~}:?\u0014".length();
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
                    var0_3[var6_4++] = b_0.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u00b4\u0093\u00c8\u009e\u00a5\u00832v\b\u00e1\n\u00e6\u0005w^\u0002X";
                    var7_6 = "\u00b4\u0093\u00c8\u009e\u00a5\u00832v\b\u00e1\n\u00e6\u0005w^\u0002X".length();
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
                    var0_3[var6_4++] = b_0.a(var8_9).intern();
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
        b_0.IDLE = new b_0(var0_3[4], 0);
        b_0.PLACE = new b_0(var0_3[0], 1);
        b_0.WAIT = new b_0(var0_3[3], 2);
        b_0.SCOOP = new b_0(var0_3[2], 3);
        b_0.BACK = new b_0(var0_3[1], 4);
        b_0.a = b_0.a("\u00fc", (Object)new Object[0], (long)-3945572306806935035L, (long)var9);
    }

    public static b_0[] values() {
        return (b_0[])a.clone();
    }

    public static b_0 valueOf(String string, long l) {
        l = b ^ l;
        return (b_0)((Object)b_0.a("\u00fc", b_0.class, (Object)string, (long)235316912231299216L, (long)l));
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = b_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = b_0.b(classArray[i], string, clazz2);
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
            int n = b_0.a(l, l2);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                b_0.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = b_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = b_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = b_0.a(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = b_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = b_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = b_0.a(clazz3, string2, clazz2)) != null) {
                    b_0.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = b_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        b_0.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = b_0.b(455215320966984L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = b_0.a(l, l2);
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
                clazz3 = b_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = b_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = b_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        b_0.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = b_0.b(455215320966984L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = b_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        b_0.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = b_0.b(455215320966984L, 0L);
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
            if (c == '\u00ef' || c == '\u00db' || c == '\u00f8' || c == 'B') {
                field = b_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ef' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00db' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = b_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'S' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00fc' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = b_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/b" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static b_0[] a(Object[] objectArray) {
        return new b_0[]{IDLE, PLACE, WAIT, SCOOP, BACK};
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
            case 0 -> 43;
            case 1 -> 41;
            case 2 -> 20;
            case 3 -> 35;
            case 4 -> 39;
            case 5 -> 36;
            case 6 -> 58;
            case 7 -> 32;
            case 8 -> 53;
            case 9 -> 47;
            case 10 -> 1;
            case 11 -> 4;
            case 12 -> 6;
            case 13 -> 19;
            case 14 -> 2;
            case 15 -> 17;
            case 16 -> 11;
            case 17 -> 26;
            case 18 -> 10;
            case 19 -> 7;
            case 20 -> 33;
            case 21 -> 57;
            case 22 -> 51;
            case 23 -> 8;
            case 24 -> 30;
            case 25 -> 61;
            case 26 -> 59;
            case 27 -> 5;
            case 28 -> 28;
            case 29 -> 56;
            case 30 -> 34;
            case 31 -> 52;
            case 32 -> 27;
            case 33 -> 25;
            case 34 -> 21;
            case 35 -> 15;
            case 36 -> 60;
            case 37 -> 55;
            case 38 -> 45;
            case 39 -> 18;
            case 40 -> 24;
            case 41 -> 14;
            case 42 -> 3;
            case 43 -> 44;
            case 44 -> 29;
            case 45 -> 50;
            case 46 -> 13;
            case 47 -> 54;
            case 48 -> 0;
            case 49 -> 38;
            case 50 -> 49;
            case 51 -> 46;
            case 52 -> 62;
            case 53 -> 23;
            case 54 -> 31;
            case 55 -> 42;
            case 56 -> 63;
            case 57 -> 40;
            case 58 -> 12;
            case 59 -> 9;
            case 60 -> 22;
            case 61 -> 37;
            case 62 -> 16;
            default -> 48;
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
        b_0.d[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = c;
        c[0] = "$!XtR\u00192!].A\u000e%j^(M\u001a4-I?\u0006\u000b";
        objectArray[1] = "\u0004yAb5:qYJm$u\u0010WAf /d";
        objectArray[2] = "$\u007fo\u000eA\u0014\u0005Cy\u000eDN\u0016TnEGH\u001a@\u007f\u0002P_QQ0";
        objectArray[3] = "GlE +CLcTo@AX`";
        objectArray[4] = "\"Bbq\u000e!)Ms>c!)Pg";
        objectArray[5] = "L5wnh\u0016G:f!\u0015\u000eT=oh";
        objectArray[6] = "DN|\u0011\u0012ZOAm^sTDJi\u0004";
        objectArray[7] = "wo\u001cK#g{1\u0018!$\u0001,=\u0013\u0018s|/a\u000e_M;,|\u001f\u0019?>ubN!";
        Object[] objectArray2 = objectArray;
        objectArray[8] = "?~A\u001a@<4/R^y&lw@K>6\u0005(\u0000\\\u000b1~bQ\u001f\u0014X9.\u0002\u0018\bgc}]_ybho\u0001\u001f\u001di9|E&";
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
            return MethodHandles.lookup().findStatic(b_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.de_0;
import dev.zprestige.prestige.df_0;
import dev.zprestige.prestige.dg_0;
import dev.zprestige.prestige.dh_0;
import dev.zprestige.prestige.di_0;
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
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.o
 */
public final class o_0
extends Enum {
    public static final o_0 NONE;
    public static final o_0 NORMAL;
    public static final o_0 CHAMS;
    public static final o_0 AURA;
    public static final o_0 RAINBOW;
    private final de_0 a;
    private static final o_0[] b;
    private static final long c;
    private static final Object[] d;
    private static final String[] e;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private o_0() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.a = var3_2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                o_0.c = hc.a(9139310274121214260L, -4137156750468945001L, MethodHandles.lookup().lookupClass()).a(139343310812193L);
                v0 = var9 = o_0.c ^ 134515275331968L;
                var11_1 = v0 ^ 51720055191496L;
                var13_2 = v0 ^ 29600253070114L;
                var15_3 = v0 ^ 2087398881080L;
                var17_4 = v0 ^ 74010005649317L;
                o_0.d = new Object[9];
                o_0.e = new String[9];
                o_0.a();
                var1_5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v1 = SecretKeyFactory.getInstance("DES");
                v2 = new byte[8];
                v3 = v2;
                v2[0] = (byte)(var9 >>> 56);
                for (var2_6 = 1; var2_6 < 8; ++var2_6) {
                    v3 = v3;
                    v3[var2_6] = (byte)(var9 << var2_6 * 8 >>> 56);
                }
                var1_5.init(2, (Key)v1.generateSecret(new DESKeySpec(v3)), new IvParameterSpec(new byte[8]));
                var0_7 = new String[5];
                var6_8 = 0;
                var5_9 = "\u00af\u00c7u\u009c_\u00f9\u00d8\u00db\b\u0092\u0085\u00a8\u007f\u00a8\fd\u00e2\b$\u00b9G\u00dan\u00e9\u00c6Z";
                var7_10 = "\u00af\u00c7u\u009c_\u00f9\u00d8\u00db\b\u0092\u0085\u00a8\u007f\u00a8\fd\u00e2\b$\u00b9G\u00dan\u00e9\u00c6Z".length();
                var4_11 = 8;
                var3_12 = -1;
lbl36:
                // 2 sources

                while (true) {
                    v4 = ++var3_12;
                    v5 = var5_9.substring(v4, v4 + var4_11);
                    v6 = -1;
                    break block10;
                    break;
                }
lbl41:
                // 1 sources

                while (true) {
                    var0_7[var6_8++] = o_0.a(var8_13).intern();
                    if ((var3_12 += var4_11) < var7_10) {
                        var4_11 = var5_9.charAt(var3_12);
                        ** continue;
                    }
                    var5_9 = "\u00b9`\u00b8m\u0082\u00a9\u00d5!\b\u00a2_TI\u00a1[\u00bc\t";
                    var7_10 = "\u00b9`\u00b8m\u0082\u00a9\u00d5!\b\u00a2_TI\u00a1[\u00bc\t".length();
                    var4_11 = 8;
                    var3_12 = -1;
lbl50:
                    // 2 sources

                    while (true) {
                        v7 = ++var3_12;
                        v5 = var5_9.substring(v7, v7 + var4_11);
                        v6 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl55:
                // 1 sources

                while (true) {
                    var0_7[var6_8++] = o_0.a(var8_13).intern();
                    if ((var3_12 += var4_11) < var7_10) {
                        var4_11 = var5_9.charAt(var3_12);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var8_13 = var1_5.doFinal(v5.getBytes("ISO-8859-1"));
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl67:
                // 1 sources

                ** continue;
            }
        }
        o_0.NONE = new o_0(var0_7[4], 0, null);
        o_0.NORMAL = new o_0(var0_7[0], 1, (de_0)new dh_0(var15_3));
        o_0.CHAMS = new o_0(var0_7[3], 2, (de_0)new dg_0(var11_1));
        o_0.AURA = new o_0(var0_7[2], 3, (de_0)new df_0(var17_4));
        o_0.RAINBOW = new o_0(var0_7[1], 4, (de_0)new di_0(var13_2));
        o_0.b = o_0.a("\u00f9", (Object)new Object[0], (long)8746081210455756432L, (long)var9);
    }

    public static o_0[] values() {
        return (o_0[])b.clone();
    }

    public static o_0 valueOf(String string, long l) {
        l = c ^ l;
        return (o_0)((Object)o_0.a("\u00f9", o_0.class, (Object)string, (long)-2428859034409521967L, (long)l));
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = o_0.a(l, l2);
            object = d[n];
            try {
                if (!(object instanceof String)) break block2;
                o_0.d[n] = clazz = Class.forName(e[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = o_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = o_0.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = o_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = o_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = o_0.a(l, l2);
        Object object = d[n];
        if (object instanceof String) {
            String string = e[n];
            int n2 = string.indexOf(8);
            Class clazz = o_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = o_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = o_0.a(clazz3, string2, clazz2)) != null) {
                    o_0.d[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = o_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        o_0.d[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = o_0.b(462144623407146L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = o_0.a(l, l2);
        Object object = d[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = e[n];
                int n3 = string2.indexOf(8);
                clazz3 = o_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = o_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = o_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        o_0.d[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = o_0.b(462144623407146L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = o_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        o_0.d[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = o_0.b(462144623407146L, 0L);
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

    public de_0 a(Object[] objectArray) {
        return this.a;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/o" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'g' || c == 'o' || c == 'a' || c == '\u00d4') {
                field = o_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'g' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'o' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'a' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = o_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00fb' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f9' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = o_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (e[n3] != null) {
            return n3;
        }
        Object object = d[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 5;
            case 1 -> 13;
            case 2 -> 55;
            case 3 -> 26;
            case 4 -> 2;
            case 5 -> 43;
            case 6 -> 59;
            case 7 -> 19;
            case 8 -> 24;
            case 9 -> 58;
            case 10 -> 62;
            case 11 -> 54;
            case 12 -> 25;
            case 13 -> 9;
            case 14 -> 44;
            case 15 -> 30;
            case 16 -> 47;
            case 17 -> 6;
            case 18 -> 56;
            case 19 -> 33;
            case 20 -> 22;
            case 21 -> 7;
            case 22 -> 60;
            case 23 -> 48;
            case 24 -> 46;
            case 25 -> 8;
            case 26 -> 14;
            case 27 -> 51;
            case 28 -> 23;
            case 29 -> 38;
            case 30 -> 27;
            case 31 -> 12;
            case 32 -> 39;
            case 33 -> 63;
            case 34 -> 49;
            case 35 -> 4;
            case 36 -> 16;
            case 37 -> 11;
            case 38 -> 10;
            case 39 -> 21;
            case 40 -> 36;
            case 41 -> 3;
            case 42 -> 1;
            case 43 -> 18;
            case 44 -> 35;
            case 45 -> 20;
            case 46 -> 32;
            case 47 -> 52;
            case 48 -> 50;
            case 49 -> 42;
            case 50 -> 41;
            case 51 -> 15;
            case 52 -> 53;
            case 53 -> 31;
            case 54 -> 61;
            case 55 -> 17;
            case 56 -> 29;
            case 57 -> 40;
            case 58 -> 34;
            case 59 -> 37;
            case 60 -> 57;
            case 61 -> 45;
            case 62 -> 0;
            default -> 28;
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
        o_0.e[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = d;
        d[0] = "\f.\u00154\u0010>\u0007!\u0004{{<\u0013\"";
        objectArray[1] = "\u0017\\?_o\u0011\u001cS.\u0010\u0002\u0011\u001cN:";
        objectArray[2] = "\b\n\u0003\u0013{,\u0003\u0005\u0012\\\u00064\u0010\u0002\u001b\u0015";
        objectArray[3] = "/YNg##9YK=04.\u0012H;< ?U_,w<";
        objectArray[4] = "1jNE\u000eBDJEJ\u001f\r%DNA\u001bWQ";
        objectArray[5] = "=`NC.t\u001c\\XC+.\u000fKO\b((\u0003_^O??HC\u0011";
        objectArray[6] = "mr\u001b\u0011sKf}\n^\u0012Emv\u000e\u0004";
        objectArray[7] = "\u0002B\u007fX&@H\bsd6\u0014\\Nl#&}\u0001\rf\u001e\"\r\u0004\f<\u000fHG\u0001Qc\u00069\u0005RWndr\fF\u000foY8FJ3";
        Object[] objectArray2 = objectArray;
        objectArray[8] = "jO\u0004\u000b8o2\u0015W\u000f^8PEW\u0011!n,\u0002ZInQk\u0011L\u001c=l2\u0014\u0006\b^";
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static o_0[] a(Object[] objectArray) {
        return new o_0[]{NONE, NORMAL, CHAMS, AURA, RAINBOW};
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(o_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


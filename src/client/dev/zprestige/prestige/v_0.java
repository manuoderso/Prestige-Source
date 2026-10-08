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
 * Renamed from dev.zprestige.prestige.v
 */
public final class v_0
extends Enum {
    public static final v_0 TopLeft;
    public static final v_0 TopRight;
    public static final v_0 BottomLeft;
    public static final v_0 BottomRight;
    private static final v_0[] a;
    private static final long b;
    private static final Object[] c;
    private static final String[] d;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private v_0() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                v_0.b = hc.a(8264989294331688939L, -1968837291658127511L, MethodHandles.lookup().lookupClass()).a(18429099068458L);
                var9 = v_0.b ^ 61836348688803L;
                v_0.c = new Object[9];
                v_0.d = new String[9];
                v_0.a();
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
                var5_5 = "\u00e7\u00b4\u00c9\u00a2\u00b4\u00ee\u001b\u0010\u009e\u00fe\u00c5\u00ff #r(\u0010.\u0006c.\u00b1\u00f3\u00d0`\u0084\u0013+\u00f2\u0018\u00a5\u00e3\u0080";
                var7_6 = "\u00e7\u00b4\u00c9\u00a2\u00b4\u00ee\u001b\u0010\u009e\u00fe\u00c5\u00ff #r(\u0010.\u0006c.\u00b1\u00f3\u00d0`\u0084\u0013+\u00f2\u0018\u00a5\u00e3\u0080".length();
                var4_7 = 16;
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
                    var0_3[var6_4++] = v_0.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u0012Tm~71\u00a9|\u0010\u0011\u0011\u00d9\u00b1\u00d4\u00fc&N\u00be/\u00e1\u00c3\u00c0\u00f7Jb";
                    var7_6 = "\u0012Tm~71\u00a9|\u0010\u0011\u0011\u00d9\u00b1\u00d4\u00fc&N\u00be/\u00e1\u00c3\u00c0\u00f7Jb".length();
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
                    var0_3[var6_4++] = v_0.a(var8_9).intern();
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
        v_0.TopLeft = new v_0(var0_3[2], 0);
        v_0.TopRight = new v_0(var0_3[3], 1);
        v_0.BottomLeft = new v_0(var0_3[0], 2);
        v_0.BottomRight = new v_0(var0_3[1], 3);
        v_0.a = v_0.a("\u00df", (Object)new Object[0], (long)6804969638533468911L, (long)var9);
    }

    public static v_0[] values() {
        return (v_0[])a.clone();
    }

    public static v_0 valueOf(String string, long l) {
        l = b ^ l;
        return (v_0)((Object)v_0.a("\u00df", v_0.class, (Object)string, (long)-4429097247337746486L, (long)l));
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = v_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = v_0.b(classArray[i], string, clazz2);
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
            int n = v_0.a(l, l2);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                v_0.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = v_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = v_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = v_0.a(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = v_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = v_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = v_0.a(clazz3, string2, clazz2)) != null) {
                    v_0.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = v_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        v_0.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = v_0.b(471186616525788L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = v_0.a(l, l2);
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
                clazz3 = v_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = v_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = v_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        v_0.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = v_0.b(471186616525788L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = v_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        v_0.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = v_0.b(471186616525788L, 0L);
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
            if (c == 'R' || c == 'z' || c == 'T' || c == '\u00db') {
                field = v_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'R' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'z' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'T' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = v_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'Z' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00df' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = v_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/v" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static v_0[] a(Object[] objectArray) {
        return new v_0[]{TopLeft, TopRight, BottomLeft, BottomRight};
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
            case 0 -> 9;
            case 1 -> 51;
            case 2 -> 23;
            case 3 -> 15;
            case 4 -> 24;
            case 5 -> 13;
            case 6 -> 39;
            case 7 -> 33;
            case 8 -> 52;
            case 9 -> 25;
            case 10 -> 48;
            case 11 -> 35;
            case 12 -> 1;
            case 13 -> 43;
            case 14 -> 17;
            case 15 -> 2;
            case 16 -> 32;
            case 17 -> 11;
            case 18 -> 57;
            case 19 -> 62;
            case 20 -> 61;
            case 21 -> 18;
            case 22 -> 55;
            case 23 -> 41;
            case 24 -> 59;
            case 25 -> 16;
            case 26 -> 37;
            case 27 -> 63;
            case 28 -> 30;
            case 29 -> 45;
            case 30 -> 44;
            case 31 -> 28;
            case 32 -> 34;
            case 33 -> 14;
            case 34 -> 19;
            case 35 -> 53;
            case 36 -> 6;
            case 37 -> 26;
            case 38 -> 21;
            case 39 -> 31;
            case 40 -> 58;
            case 41 -> 5;
            case 42 -> 42;
            case 43 -> 7;
            case 44 -> 50;
            case 45 -> 46;
            case 46 -> 3;
            case 47 -> 20;
            case 48 -> 27;
            case 49 -> 8;
            case 50 -> 36;
            case 51 -> 38;
            case 52 -> 56;
            case 53 -> 0;
            case 54 -> 4;
            case 55 -> 49;
            case 56 -> 22;
            case 57 -> 29;
            case 58 -> 47;
            case 59 -> 12;
            case 60 -> 54;
            case 61 -> 60;
            case 62 -> 40;
            default -> 10;
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
        v_0.d[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = c;
        c[0] = "!\u0016k\r\u0007_7\u0016nW\u0014H ]mQ\u0018\\1\u001azFSY";
        objectArray[1] = "{; \u0007>\b\u000e\u001b+\b/Go\u0015 \u0003+\u001d\u001b";
        objectArray[2] = "\u0016JKIJ=7v]IOg$aJ\u0002La(u[E[vcp\u0014";
        objectArray[3] = "[3y5}BP<hz\u0016@D?";
        objectArray[4] = "w}\u001bB<C|r\n\rQC|o\u001e";
        objectArray[5] = "rLwqp`yCf>\rxjDow";
        objectArray[6] = "`B\u0006rn9kM\u0017=\u000f7`F\u0013g";
        objectArray[7] = "\n\u0018\u00142vQ[\u001fX6FAY\u0011\u0019%\u0001Q0NYx E\b\u0007\u000e:y?\u000b\u0010\u000b!:VH\u0019\n5F\u0005]\u0005\u001ex(TZI\u001aH";
        Object[] objectArray2 = objectArray;
        objectArray[8] = "\n(\u0017\u0016RZ\u00145Hv\u0007bQ'NH\u001c\u001e\t+\u0014\u0016n[\u0017qJG^\u001e\u0013*\u0015v";
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
            return MethodHandles.lookup().findStatic(v_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


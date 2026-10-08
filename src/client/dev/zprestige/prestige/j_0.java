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
 * Renamed from dev.zprestige.prestige.j
 */
final class j_0
extends Enum {
    public static final j_0 NONE;
    public static final j_0 HOTBAR_SWAPPED;
    public static final j_0 INVENTORY_QUEUED;
    public static final j_0 PLACE_SENT;
    private static final j_0[] a;
    private static final long b;
    private static final Object[] c;
    private static final String[] d;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private j_0() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                j_0.b = hc.a(1376416100402247720L, 8490553170693444762L, MethodHandles.lookup().lookupClass()).a(229302038843309L);
                var9 = j_0.b ^ 59175748538793L;
                j_0.c = new Object[9];
                j_0.d = new String[9];
                j_0.a();
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
                var5_5 = "b\u00dd'J1\u009b\u00b6U\u00ab\u00b5\u00fa)D\u00bd\u00ef\t\u0018g\u00952%\u0087\u00fa\u00d7b=\u009d\u0087E\u00f0\u00e4\u008d\u0098\u00b6\u00c0s@N\u001d\u00a3<";
                var7_6 = "b\u00dd'J1\u009b\u00b6U\u00ab\u00b5\u00fa)D\u00bd\u00ef\t\u0018g\u00952%\u0087\u00fa\u00d7b=\u009d\u0087E\u00f0\u00e4\u008d\u0098\u00b6\u00c0s@N\u001d\u00a3<".length();
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
                    var0_3[var6_4++] = j_0.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\f\u0099\u00ca\u00b5\u00eeH\u009e%\u00b5d\u00b3\u00adI\u00ce\u00e7\u00cb\b\u00acILY^\u000fg\u00d9";
                    var7_6 = "\f\u0099\u00ca\u00b5\u00eeH\u009e%\u00b5d\u00b3\u00adI\u00ce\u00e7\u00cb\b\u00acILY^\u000fg\u00d9".length();
                    var4_7 = 16;
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
                    var0_3[var6_4++] = j_0.a(var8_9).intern();
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
        j_0.NONE = new j_0(var0_3[3], 0);
        j_0.HOTBAR_SWAPPED = new j_0(var0_3[2], 1);
        j_0.INVENTORY_QUEUED = new j_0(var0_3[1], 2);
        j_0.PLACE_SENT = new j_0(var0_3[0], 3);
        j_0.a = j_0.a("e", (Object)new Object[0], (long)-5461074107138040765L, (long)var9);
    }

    public static j_0[] values() {
        return (j_0[])a.clone();
    }

    public static j_0 valueOf(String string, long l) {
        l = b ^ l;
        return (j_0)((Object)j_0.a("e", j_0.class, (Object)string, (long)-7713843669994657046L, (long)l));
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = j_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = j_0.b(classArray[i], string, clazz2);
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
            int n = j_0.a(l, l2);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                j_0.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = j_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = j_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = j_0.a(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = j_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = j_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = j_0.a(clazz3, string2, clazz2)) != null) {
                    j_0.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = j_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        j_0.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = j_0.b(444046121934189L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = j_0.a(l, l2);
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
                clazz3 = j_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = j_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = j_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        j_0.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = j_0.b(444046121934189L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = j_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        j_0.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = j_0.b(444046121934189L, 0L);
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
            if (c == 's' || c == '\u00cd' || c == 'm' || c == 'h') {
                field = j_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 's' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00cd' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'm' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = j_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00b5' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'e' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = j_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/j" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static j_0[] a(Object[] objectArray) {
        return new j_0[]{NONE, HOTBAR_SWAPPED, INVENTORY_QUEUED, PLACE_SENT};
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
            case 0 -> 47;
            case 1 -> 56;
            case 2 -> 18;
            case 3 -> 20;
            case 4 -> 61;
            case 5 -> 29;
            case 6 -> 3;
            case 7 -> 16;
            case 8 -> 62;
            case 9 -> 12;
            case 10 -> 41;
            case 11 -> 11;
            case 12 -> 4;
            case 13 -> 26;
            case 14 -> 38;
            case 15 -> 24;
            case 16 -> 31;
            case 17 -> 15;
            case 18 -> 50;
            case 19 -> 13;
            case 20 -> 37;
            case 21 -> 30;
            case 22 -> 10;
            case 23 -> 33;
            case 24 -> 49;
            case 25 -> 63;
            case 26 -> 6;
            case 27 -> 19;
            case 28 -> 35;
            case 29 -> 60;
            case 30 -> 53;
            case 31 -> 1;
            case 32 -> 43;
            case 33 -> 32;
            case 34 -> 40;
            case 35 -> 7;
            case 36 -> 39;
            case 37 -> 9;
            case 38 -> 55;
            case 39 -> 54;
            case 40 -> 52;
            case 41 -> 14;
            case 42 -> 5;
            case 43 -> 51;
            case 44 -> 48;
            case 45 -> 17;
            case 46 -> 42;
            case 47 -> 44;
            case 48 -> 36;
            case 49 -> 28;
            case 50 -> 57;
            case 51 -> 22;
            case 52 -> 34;
            case 53 -> 25;
            case 54 -> 21;
            case 55 -> 59;
            case 56 -> 58;
            case 57 -> 46;
            case 58 -> 0;
            case 59 -> 23;
            case 60 -> 8;
            case 61 -> 27;
            case 62 -> 2;
            default -> 45;
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
        j_0.d[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = c;
        c[0] = "p\u000b\r2\u0014'f\u000b\bh\u00070q@\u000bn\u000b$`\u0007\u001cy@=";
        objectArray[1] = "!\tK\u001d\u0005\"T)@\u0012\u0014m5'K\u0019\u00107A";
        objectArray[2] = "\u007f5Y=|:^\tO=y`M\u001eXvzfA\nI1mq\n\u0013\u0006";
        objectArray[3] = "kf#v\u0012.`i29y,tj";
        objectArray[4] = "\t\u001d]?\u0018\f\u0002\u0012Lpu\f\u0002\u000fX";
        objectArray[5] = "2\u0012d\u000bzn9\u001duD\u0007v*\u001a|\r";
        objectArray[6] = ">pE*=*5\u007fTe\\$>tP?";
        objectArray[7] = "\u0006&\u001eC\ruL0GZmtU%\u0004\\*d<zEW\u000fdNy\tJ\u0010\n\u0007#\bTQ;\r9\u001e\rm0[&\u000bQ\u0012zM\u007f\u00121";
        Object[] objectArray2 = objectArray;
        objectArray[8] = "Nq$H(\u0003\u0011p!.!oH+rWq\b\u001a%|AHUKqkPu\u0000\b ~.";
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
            return MethodHandles.lookup().findStatic(j_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


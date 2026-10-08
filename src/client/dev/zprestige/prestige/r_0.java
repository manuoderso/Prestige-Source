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
 * Renamed from dev.zprestige.prestige.r
 */
public final class r_0
extends Enum {
    public static final r_0 IMMEDIATE;
    public static final r_0 QUEUED;
    public static final r_0 REJECTED;
    private static final r_0[] a;
    private static final long b;
    private static final Object[] c;
    private static final String[] d;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private r_0() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        b = hc.a(5549418044827763774L, -7155423336714775021L, MethodHandles.lookup().lookupClass()).a(141430126245159L);
        long l = b ^ 0x49FDE56CCEA8L;
        c = new Object[9];
        d = new String[9];
        r_0.a();
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[3];
        int n = 0;
        String string = "\u008f:@\u00f1\u00b3\u0090.PO\u00e9\u0001e\u00e6\u0012[U\u0010\u00f2\u00ad\u0019\u0005\u009eZ9\u00f6M#\u00a2\u009d\u00b2\u00d3Z\u00e0\b\u00a6<h\fwPF\u00bf";
        int n2 = "\u008f:@\u00f1\u00b3\u0090.PO\u00e9\u0001e\u00e6\u0012[U\u0010\u00f2\u00ad\u0019\u0005\u009eZ9\u00f6M#\u00a2\u009d\u00b2\u00d3Z\u00e0\b\u00a6<h\fwPF\u00bf".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = r_0.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                IMMEDIATE = new r_0(stringArray[0], 0);
                QUEUED = new r_0(stringArray[2], 1);
                REJECTED = new r_0(stringArray[1], 2);
                a = r_0.a("T", (Object)new Object[0], (long)2132503130266126483L, (long)l);
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    public static r_0[] values() {
        return (r_0[])a.clone();
    }

    public static r_0 valueOf(String string, long l) {
        l = b ^ l;
        return (r_0)((Object)r_0.a("T", r_0.class, (Object)string, (long)-2555080282365500318L, (long)l));
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = r_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = r_0.b(classArray[i], string, clazz2);
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
            int n = r_0.a(l, l2);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                r_0.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = r_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = r_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = r_0.a(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = r_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = r_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = r_0.a(clazz3, string2, clazz2)) != null) {
                    r_0.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = r_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        r_0.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = r_0.b(422662016468952L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = r_0.a(l, l2);
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
                clazz3 = r_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = r_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = r_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        r_0.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = r_0.b(422662016468952L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = r_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        r_0.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = r_0.b(422662016468952L, 0L);
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
            if (c == '\u00aa' || c == '\u00db' || c == 'c' || c == '\u00d3') {
                field = r_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00aa' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00db' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'c' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = r_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'H' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'T' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = r_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/r" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static r_0[] a(Object[] objectArray) {
        return new r_0[]{IMMEDIATE, QUEUED, REJECTED};
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
            case 0 -> 19;
            case 1 -> 33;
            case 2 -> 10;
            case 3 -> 34;
            case 4 -> 53;
            case 5 -> 24;
            case 6 -> 26;
            case 7 -> 36;
            case 8 -> 43;
            case 9 -> 4;
            case 10 -> 9;
            case 11 -> 59;
            case 12 -> 40;
            case 13 -> 31;
            case 14 -> 44;
            case 15 -> 29;
            case 16 -> 1;
            case 17 -> 46;
            case 18 -> 23;
            case 19 -> 50;
            case 20 -> 58;
            case 21 -> 45;
            case 22 -> 60;
            case 23 -> 62;
            case 24 -> 28;
            case 25 -> 49;
            case 26 -> 25;
            case 27 -> 13;
            case 28 -> 8;
            case 29 -> 63;
            case 30 -> 16;
            case 31 -> 12;
            case 32 -> 5;
            case 33 -> 2;
            case 34 -> 37;
            case 35 -> 30;
            case 36 -> 57;
            case 37 -> 18;
            case 38 -> 17;
            case 39 -> 38;
            case 40 -> 35;
            case 41 -> 22;
            case 42 -> 52;
            case 43 -> 55;
            case 44 -> 15;
            case 45 -> 32;
            case 46 -> 48;
            case 47 -> 42;
            case 48 -> 0;
            case 49 -> 21;
            case 50 -> 20;
            case 51 -> 47;
            case 52 -> 54;
            case 53 -> 14;
            case 54 -> 41;
            case 55 -> 56;
            case 56 -> 27;
            case 57 -> 6;
            case 58 -> 3;
            case 59 -> 11;
            case 60 -> 7;
            case 61 -> 39;
            case 62 -> 51;
            default -> 61;
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
        r_0.d[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = c;
        c[0] = "T\u0014\tB\bR_\u001b\u0018\rcPK\u0018";
        objectArray[1] = "8\u00193MQ:3\u0016\"\u0002<:3\u000b6";
        objectArray[2] = "8\u001b#O=E3\u00142\u0000@] \u0013;I";
        objectArray[3] = "US1T-(CS4\u000e>?T\u00187\b2+E_ \u001fy*";
        objectArray[4] = "c\"n\b\\5\u0016\u0002e\u0007Mzw\fn\fI \u0003";
        objectArray[5] = "0\u001dsF\u001b\u0001\u0011!eF\u001e[\u00026r\r\u001d]\u000e\"cJ\nJE#,";
        objectArray[6] = "bd#\u0002$?ik2ME1b`6\u0017";
        objectArray[7] = "%\u001d~X,%\u007f\\0a /*[c&0F?F6\u0010;7t\u0018wag'!F5\n7/+C\u000e\ne6wTmP$xN";
        Object[] objectArray2 = objectArray;
        objectArray[8] = "\u0005H\u000f<:TRNB'\u0000\u0006?\u001cV7{\u001e\u000eBBdjo\u0004[V40\u0000GWV?\u0000";
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
            return MethodHandles.lookup().findStatic(r_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


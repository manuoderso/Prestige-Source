/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2960
 *  net.minecraft.class_3262
 *  net.minecraft.class_3262$class_7664
 *  net.minecraft.class_3264
 *  net.minecraft.class_3298
 *  net.minecraft.class_7367
 *  net.minecraft.class_7677
 *  net.minecraft.class_9224
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.client.Prestige;
import dev.zprestige.prestige.hc;
import java.io.IOException;
import java.io.InputStream;
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
import java.util.Optional;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2960;
import net.minecraft.class_3262;
import net.minecraft.class_3264;
import net.minecraft.class_3298;
import net.minecraft.class_7367;
import net.minecraft.class_7677;
import net.minecraft.class_9224;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.da
 */
public class da_0
implements class_3262 {
    private static final long a = hc.a(-217942846706441426L, 70966333967752342L, MethodHandles.lookup().lookupClass()).a(162733519808959L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final Object[] e;
    private static final String[] f;

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = new Object[9];
        f = new String[9];
        da_0.a();
        d = new HashMap(13);
        long l = a ^ 0xF3C47DD22CL;
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
        String[] stringArray = new String[2];
        int n = 0;
        String string = ")<\u00ael\u00cb\u00df\u00c0\u008d\t\u00a6h\u00d38\u00b5U\u00ff6_\u00a2\u0006\u00d9\u0083\u00acgk\\\u0093\u00d3$y\u00ea\u001eZ\u00f2\u008ew\u001b\u0003&\u00f9 c0u:\u00a8(\u0098\u0011\u0001\u0018\u0003\u00d13\u00c2%.\u00d9\u00c1^K\u00c3s\u0080\u0085a\u00f4Q9\u00f9c\u00bfj";
        int n2 = ")<\u00ael\u00cb\u00df\u00c0\u008d\t\u00a6h\u00d38\u00b5U\u00ff6_\u00a2\u0006\u00d9\u0083\u00acgk\\\u0093\u00d3$y\u00ea\u001eZ\u00f2\u008ew\u001b\u0003&\u00f9 c0u:\u00a8(\u0098\u0011\u0001\u0018\u0003\u00d13\u00c2%.\u00d9\u00c1^K\u00c3s\u0080\u0085a\u00f4Q9\u00f9c\u00bfj".length();
        int n3 = 40;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = da_0.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = da_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = da_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = da_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = da_0.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static class_3298 b(Object[] objectArray) {
        String string = (String)objectArray[0];
        return new class_3298((class_3262)new da_0(), () -> da_0.lambda$getResource$1(string));
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = da_0.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                da_0.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/da" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(long l, long l2) {
        int n = da_0.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = da_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = da_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = da_0.a(clazz3, string2, clazz2)) != null) {
                    da_0.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = da_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        da_0.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = da_0.b(369813015637660L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = da_0.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = f[n];
                int n3 = string2.indexOf(8);
                clazz3 = da_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = da_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = da_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        da_0.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = da_0.b(369813015637660L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = da_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        da_0.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = da_0.b(369813015637660L, 0L);
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = da_0.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7E72;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])d.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    d.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/da", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            da_0.c[n2] = da_0.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "\u001bZ\u0001\u0015\u0015t\u0010U\u0010Zxt\u0010H\u0004";
        objectArray[1] = "4[G\fR\u0014?TVC?\u0014?IB!\u0013\u0019:_C";
        objectArray[2] = "[\u0019\"!)\u000b[\u00195}%\u0004AR5c%\u0011F#d6rR";
        objectArray[3] = "=2l\u000e&(6=}A[0%:t\b";
        objectArray[4] = "O'#k!=Jh\u001cd\u007f!Q\u0015!xj5H";
        objectArray[5] = ";\"D\u001e\n\u000f0-UQk\u0001;&Q\u000b";
        objectArray[6] = "(+J4f'-6\b+\u00181|;l=c9l=]=Q%J;L=q;\u0011}\u00065hnu{[<|^*\u007fLita{+M?\u0018";
        objectArray[7] = "oq\u00002\u0013j)s\u0005IB{*T^ Vm\u0012xS%@lV&V5Ih/#KwV\u0016";
        Object[] objectArray2 = objectArray;
        objectArray[8] = "_Pw]sS\u001f@|O\u000bR\u000bNfZg`_\b6\u000617\\\u0002cM;SZ_jY\u000b";
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (f[n3] != null) {
            return n3;
        }
        Object object = e[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 3;
            case 1 -> 49;
            case 2 -> 27;
            case 3 -> 2;
            case 4 -> 37;
            case 5 -> 60;
            case 6 -> 14;
            case 7 -> 40;
            case 8 -> 53;
            case 9 -> 46;
            case 10 -> 44;
            case 11 -> 10;
            case 12 -> 54;
            case 13 -> 34;
            case 14 -> 6;
            case 15 -> 59;
            case 16 -> 18;
            case 17 -> 33;
            case 18 -> 35;
            case 19 -> 26;
            case 20 -> 57;
            case 21 -> 15;
            case 22 -> 43;
            case 23 -> 7;
            case 24 -> 11;
            case 25 -> 17;
            case 26 -> 56;
            case 27 -> 31;
            case 28 -> 16;
            case 29 -> 24;
            case 30 -> 13;
            case 31 -> 28;
            case 32 -> 29;
            case 33 -> 9;
            case 34 -> 42;
            case 35 -> 61;
            case 36 -> 19;
            case 37 -> 0;
            case 38 -> 52;
            case 39 -> 25;
            case 40 -> 8;
            case 41 -> 20;
            case 42 -> 48;
            case 43 -> 50;
            case 44 -> 1;
            case 45 -> 22;
            case 46 -> 58;
            case 47 -> 12;
            case 48 -> 63;
            case 49 -> 47;
            case 50 -> 39;
            case 51 -> 5;
            case 52 -> 62;
            case 53 -> 41;
            case 54 -> 30;
            case 55 -> 23;
            case 56 -> 38;
            case 57 -> 36;
            case 58 -> 4;
            case 59 -> 32;
            case 60 -> 51;
            case 61 -> 21;
            case 62 -> 45;
            default -> 55;
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
        da_0.f[n3] = new String(cArray);
        return n3;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/da" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = da_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'J' || c == 'j' || c == '\u00f1' || c == 'R') {
                field = da_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'J' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'j' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f1' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = da_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f9' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'B' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static class_7367 a(Object[] objectArray) {
        String string = (String)objectArray[0];
        return () -> da_0.lambda$getSupplier$2(string);
    }

    public static class_3298 a(Object[] objectArray) {
        class_2960 class_29602 = (class_2960)objectArray[0];
        return new class_3298((class_3262)new da_0(), () -> da_0.lambda$getResource$0(class_29602));
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

    public void close() {
    }

    private static InputStream lambda$getSupplier$2(String string) throws IOException {
        long l = a ^ 0x7F0424AD7EA4L;
        return da_0.b("\u00f9", (Object)da_0.b("\u00f9", Prestige.class, (long)-8116136621608674306L, (long)l), (Object)string, (long)-8116117889235571370L, (long)l);
    }

    private static InputStream lambda$getResource$1(String string) throws IOException {
        long l = a ^ 0x2F4052A665E2L;
        return da_0.b("\u00f9", (Object)da_0.b("\u00f9", Prestige.class, (long)-7774372966867746632L, (long)l), (Object)string, (long)-7774460337366977008L, (long)l);
    }

    private static InputStream lambda$getResource$0(class_2960 class_29602) throws IOException {
        long l = a ^ 0x6C45639AB423L;
        return da_0.b("\u00f9", (Object)da_0.b("\u00f9", Prestige.class, (long)5033515849945583993L, (long)l), (Object)((String)((Object)da_0.a("f", (int)17789, (long)(0xE991EDDE654FED4L ^ l))) + (String)((Object)da_0.b("\u00f9", (Object)class_29602, (long)5033136956996929177L, (long)l))), (long)5033567009323640785L, (long)l);
    }

    public Set method_14406(class_3264 class_32642) {
        return null;
    }

    public class_9224 method_56926() {
        return null;
    }

    public Optional method_56929() {
        return super.method_56929();
    }

    public class_7367 method_14410(String[] stringArray) {
        return null;
    }

    public String method_14409() {
        long l = a ^ 0x6DC203819A34L;
        return da_0.a("f", (int)16037, (long)(0x65D3E3B1BC20AB1AL ^ l));
    }

    public Object method_14407(class_7677 class_76772) throws IOException {
        return null;
    }

    public class_7367 method_14405(class_3264 class_32642, class_2960 class_29602) {
        return null;
    }

    public void method_14408(class_3264 class_32642, String string, String string2, class_3262.class_7664 class_76642) {
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(da_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(da_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


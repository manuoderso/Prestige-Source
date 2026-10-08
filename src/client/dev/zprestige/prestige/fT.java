/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.dp_0;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.ref.Cleaner;
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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class fT
implements AutoCloseable {
    private final int a;
    private final Cleaner.Cleanable b;
    private final int c;
    private final int d;
    private static final long e = hc.a(-5195849539265067831L, -2433563161922745490L, MethodHandles.lookup().lookupClass()).a(23959560547720L);
    private static final String[] f;
    private static final String[] g;
    private static final Map h;
    private static final long i;
    private static final Object[] j;
    private static final String[] k;

    public fT(int n, long l) {
        l = e ^ l;
        this.a = n;
        this.b = fT.b("H", (Object)dp_0.a, (Object)this, () -> fT.lambda$new$1(n), (long)3292523440737321808L, (long)l);
        this.c = (int)fT.b("\u00f0", (int)fT.b("H", (Object)this, (Object)new Object[0], (long)3294015150218568020L, (long)l), (Object)fT.a("j", (int)2176, (long)(0x219ADDBF33490C54L ^ l)), (long)3292613334232107430L, (long)l);
        this.d = (int)fT.b("\u00f0", (int)fT.b("H", (Object)this, (Object)new Object[0], (long)3294015150218568020L, (long)l), (Object)fT.a("j", (int)10847, (long)(0x560D68E47A6A2E8AL ^ l)), (long)3292613334232107430L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        j = new Object[24];
        k = new String[24];
        fT.a();
        h = new HashMap(13);
        long l = e ^ 0x7EC448D6D37BL;
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
        String string = "\u00e0k \u00d0{5;\u00f2\u00fe\u00a8\u0010\u00b3a\u0088Q\u00e8\u0010\u0006\u00f8nd_\u0096\u00e8<\u00b3\u00c3\u00dc-T\u0010\u00b2\u00d2";
        int n2 = "\u00e0k \u00d0{5;\u00f2\u00fe\u00a8\u0010\u00b3a\u0088Q\u00e8\u0010\u0006\u00f8nd_\u0096\u00e8<\u00b3\u00c3\u00dc-T\u0010\u00b2\u00d2".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = fT.a(byArray3).intern();
            if ((n4 += n3) >= n2) break;
            n3 = string.charAt(n4);
        }
        f = stringArray;
        g = new String[2];
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        int n6 = 1;
        while (true) {
            if (n6 >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l2 = -7982550953068891217L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                i = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                return;
            }
            byArray5 = byArray5;
            byArray5[n6] = (byte)(l << n6 * 8 >>> 56);
            ++n6;
        }
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fT.a(l, l2);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                fT.j[n] = clazz = Class.forName(k[n]);
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
            throw new RuntimeException("dev/zprestige/prestige/fT" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fT.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fT.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = fT.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fT.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public int b(Object[] objectArray) {
        return this.c;
    }

    public int c(Object[] objectArray) {
        return this.d;
    }

    private static Field c(long l, long l2) {
        int n = fT.a(l, l2);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = fT.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fT.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fT.a(clazz3, string2, clazz2)) != null) {
                    fT.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fT.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fT.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fT.b(866672349864218L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = fT.a(l, l2);
        Object object = j[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = k[n];
                int n3 = string2.indexOf(8);
                clazz3 = fT.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fT.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fT.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        fT.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fT.b(866672349864218L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fT.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fT.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fT.b(866672349864218L, 0L);
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

    public int d(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        l = e ^ l;
        return (int)fT.b("\u00f0", (int)this.a, (Object)string, (long)-5786921228742489177L, (long)l);
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fT" + " : " + string + " : " + methodType.toString(), exception);
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = fT.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public int a(Object[] objectArray) {
        return this.a;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e4' || c == 'K' || c == 'B' || c == 'D') {
                field = fT.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e4' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'K' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'B' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fT.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'H' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f0' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (k[n3] != null) {
            return n3;
        }
        Object object = j[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 47;
            case 1 -> 62;
            case 2 -> 27;
            case 3 -> 16;
            case 4 -> 17;
            case 5 -> 2;
            case 6 -> 57;
            case 7 -> 15;
            case 8 -> 12;
            case 9 -> 14;
            case 10 -> 58;
            case 11 -> 19;
            case 12 -> 24;
            case 13 -> 53;
            case 14 -> 59;
            case 15 -> 48;
            case 16 -> 50;
            case 17 -> 52;
            case 18 -> 42;
            case 19 -> 20;
            case 20 -> 8;
            case 21 -> 23;
            case 22 -> 25;
            case 23 -> 3;
            case 24 -> 10;
            case 25 -> 36;
            case 26 -> 49;
            case 27 -> 51;
            case 28 -> 11;
            case 29 -> 37;
            case 30 -> 45;
            case 31 -> 60;
            case 32 -> 21;
            case 33 -> 46;
            case 34 -> 39;
            case 35 -> 35;
            case 36 -> 38;
            case 37 -> 22;
            case 38 -> 4;
            case 39 -> 13;
            case 40 -> 34;
            case 41 -> 29;
            case 42 -> 44;
            case 43 -> 43;
            case 44 -> 41;
            case 45 -> 1;
            case 46 -> 61;
            case 47 -> 7;
            case 48 -> 9;
            case 49 -> 63;
            case 50 -> 31;
            case 51 -> 28;
            case 52 -> 33;
            case 53 -> 0;
            case 54 -> 18;
            case 55 -> 56;
            case 56 -> 26;
            case 57 -> 6;
            case 58 -> 32;
            case 59 -> 54;
            case 60 -> 5;
            case 61 -> 30;
            case 62 -> 40;
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
        fT.k[n3] = new String(cArray);
        return n3;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = fT.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2960;
        if (g[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])h.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    h.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/fT", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = f[n2].getBytes("ISO-8859-1");
            fT.g[n2] = fT.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
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

    public void a(Object[] objectArray) {
        String string = (String)objectArray[0];
        int n = (Integer)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = (l = e ^ l) ^ 0x45CE599753A1L;
        CallSite callSite = fT.b("\u00f0", (int)((int)i), (long)-8387147039659441451L, (long)l);
        fT.b("\u00f0", (int)this.a, (long)-8386879645766236047L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = string;
        fT.b("\u00f0", (int)fT.b("H", (Object)this, (Object)objectArray2, (long)-8387042262162131050L, (long)l), (int)n, (long)-8386946175961029439L, (long)l);
        fT.b("\u00f0", (int)callSite, (long)-8386879645766236047L, (long)l);
    }

    private static void a() {
        Object[] objectArray = j;
        j[0] = " -\u0015\u001ckJ6-\u0010Fx]!f\u0013@tI0!\u0004W?^4";
        objectArray[1] = "91OL_TL\u0011DCN\u001b-\u001fOHJAY";
        objectArray[2] = Void.TYPE;
        fT.k[2] = "java/lang/Void";
        objectArray[3] = "DbB,u\u001dOmSc)\u0014H-w!>\u0010@fFi\u0018\u001dKbZ,9\u001dK";
        objectArray[4] = "g`<+4[bu7+7\\m|<ivkD k";
        objectArray[5] = Integer.TYPE;
        fT.k[5] = "java/lang/Integer";
        objectArray[6] = "\u001f\u0014tk{y\u001a\u0001\u007fkx~\u0015\bt)9I<W\"";
        objectArray[7] = "YY'##\u0004OY\"y0\u0013X\u0012!\u007f<\u0007IU6hw\u0012i";
        objectArray[8] = "\u001fO\tt\u0018wjo\u0002{\t8\u000ba\tp\rb\u007f";
        objectArray[9] = "t\u0007.x2\u0002\u007f\b?7_\u0006\u007f\u0014\u000b|m\u001b{\b;|";
        objectArray[10] = "fi]O\u0016&\u0013IV@\u0007irG]K\u00033\u0006";
        objectArray[11] = " E\"Q\u000fN+J3\u001eSG,\n\u0017\\DC$A&";
        objectArray[12] = "o]|PntdRm\u001f\u000fzoYiE";
        objectArray[13] = "t\r\u001eZ\f\u0010\u007f\u0002\u000f\u0015p\tp\u0002\tYN\u0019";
        objectArray[14] = "mu\rr\u0015]iv\u001f%z[P W\u007fDL/x\n*\u00152ko\u001a0\u0016J3&]%z";
        objectArray[15] = "<\u0001r8x.0\u000ebToVb\u000f?j\u007f):Rj;\u0001o:Tu*jfe_oT";
        objectArray[16] = "L25v\u00184\u00159&hv4\u0013\u0010%s\u001b'\u001a\u00042p\u0019!\u001e9H,\u0006'\t00tO`\u001c\\qp\u001c \t7x/\u0017:w";
        objectArray[17] = "{H6.mQ\"H50R\u0010&\u001fm,.\u00071p<5m\b0Le65\u0013KA5g)\u00152\u001531hjq\u00143=b\u0012u\u001al5R";
        objectArray[18] = "E\u0011GzC\u0017\u001c\u001aTd-\u0017\u001a0Wgp\u001e\u001f\u0011]aH<\u0019\u0014SgL\u001f\u0018\u007f\u0001kQ\u0006\u0012\u0007Y\"\u0016\u0013~AP\"R\u001cCGA*PxE\u000fFeA\u0000\u001dF\u0001p-";
        objectArray[19] = "\u0014G\u0004>\u001f\u0006CU\u0013,pVLg\u000791_TE\u0005(\n9\u0013X\u0016;\u001cAK\u0011Q.p\u0002XT\u0014)\bZ\u0011\u0013\u0001E";
        objectArray[20] = "\u00117b\u000b.>\u00154p\\A=,b8\u0006\u007f/S:eS.Q\u0017-uI-)Od2\\A";
        objectArray[21] = "`Rt\u0010\u000fRd\\+\u0018?A>[\"\u001c?\u0013=\\0\u0004T\u001abW*z";
        objectArray[22] = "\u0007}p!TT^vc?:TXNk!T\\Fv4!:\u0000Los,BX\u0005(f@\u0001K@ma8Y\u0002\u0007x\ry]QGmfp\u0002Z]\u0013";
        Object[] objectArray2 = objectArray;
        objectArray[23] = ")\nC,7^p\u0001P2Y^v9E \u0001Ku\u000bD$<1)\u0014B35Iq]\u0005&Y\bu\u000eE32\u0001*\u0005_M";
    }

    @Override
    public void close() {
        long l = e ^ 0x3E8E0CDF2D91L;
        fT.b("H", (Object)this.b, (long)6493963632866979534L, (long)l);
    }

    private static void lambda$new$0(int n) {
        long l = e ^ 0x17BA2F682E00L;
        fT.b("\u00f0", (int)n, (long)6453470154612449000L, (long)l);
    }

    private static void lambda$new$1(int n) {
        long l = e ^ 0x79495954FB70L;
        long l2 = l ^ 0x2A8FD20C02BEL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = () -> fT.lambda$new$0(n);
        fT.b("\u00f0", (Object)objectArray, (long)-8288653004004823826L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fT.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(fT.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


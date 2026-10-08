/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2824
 *  net.minecraft.class_2824$class_5906
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
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2824;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class T {
    private final class_2824 a;
    private static final long b = hc.a(2808656905179172500L, 2562506389168118593L, MethodHandles.lookup().lookupClass()).a(170974057389890L);
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final Object[] f;
    private static final String[] g;

    public T(class_2824 class_28242) {
        this.a = class_28242;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        f = new Object[12];
        g = new String[12];
        T.a();
        e = new HashMap(13);
        long l = b ^ 0x3570F77824BCL;
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
        String string = "\u00f8z\u0005\u008f\u0002\u00c9\u00fb\u0086]\u008e\u001cF]\u00ef\u008e\u00fd\u00ff\"\u00cb\u0098\u00bc\u00edo\u00c6\u0005\u00e1x\u00f3\u00ca\u00fa\u0088R\u0010Pr^\u0014R\u0092\u0013\u00a69\u00fb\u0094\u0013\u00a0\u00b2\u0083N";
        int n2 = "\u00f8z\u0005\u008f\u0002\u00c9\u00fb\u0086]\u008e\u001cF]\u00ef\u008e\u00fd\u00ff\"\u00cb\u0098\u00bc\u00edo\u00c6\u0005\u00e1x\u00f3\u00ca\u00fa\u0088R\u0010Pr^\u0014R\u0092\u0013\u00a69\u00fb\u0094\u0013\u00a0\u00b2\u0083N".length();
        int n3 = 32;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = T.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                c = stringArray;
                d = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = T.a(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                T.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = T.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = T.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/T" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = T.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = T.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = T.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = T.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = T.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = T.a(clazz3, string2, clazz2)) != null) {
                    T.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = T.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        T.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = T.b(144501213482494L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = T.a(l, l2);
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
                clazz3 = T.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = T.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = T.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        T.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = T.b(144501213482494L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = T.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        T.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = T.b(144501213482494L, 0L);
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
        String string2 = T.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
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

    public class_2824.class_5906 a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x47AAFE4D386FL;
        long l4 = l2 ^ 0x322235B6D599L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = class_2824.class_5906.class;
        objectArray2[2] = class_2824.class;
        objectArray2[1] = T.a("i", (int)19265, (long)(0x12FE26D1D3B6674DL ^ l));
        objectArray2[0] = this.a;
        CallSite callSite = T.b("X", (Object)objectArray2, (long)7871869655126675820L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        return (class_2824.class_5906)T.b("Q", (Object)callSite, (Object)objectArray3, (long)7871744886943410761L, (long)l);
    }

    public int a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x3B09ACD70887L;
        long l4 = l2 ^ 0x4E81672CE571L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = T.b("N", (long)6761775405071123992L, (long)l);
        objectArray2[2] = class_2824.class;
        objectArray2[1] = T.a("i", (int)8279, (long)(0x7CC5A23A60A63CB2L ^ l));
        objectArray2[0] = this.a;
        CallSite callSite = T.b("X", (Object)objectArray2, (long)6761595316897227140L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        return (int)T.b("Q", (Object)((Integer)((Object)T.b("Q", (Object)callSite, (Object)objectArray3, (long)6761718230870940321L, (long)l))), (long)6761850304443548921L, (long)l);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d5' || c == '\u00c5' || c == 'N' || c == 'S') {
                field = T.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d5' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c5' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'N' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = T.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'Q' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'X' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = T.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/T" + " : " + string + " : " + methodType.toString(), exception);
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
            case 0 -> 17;
            case 1 -> 11;
            case 2 -> 1;
            case 3 -> 57;
            case 4 -> 39;
            case 5 -> 47;
            case 6 -> 60;
            case 7 -> 52;
            case 8 -> 35;
            case 9 -> 36;
            case 10 -> 31;
            case 11 -> 30;
            case 12 -> 28;
            case 13 -> 7;
            case 14 -> 24;
            case 15 -> 51;
            case 16 -> 42;
            case 17 -> 46;
            case 18 -> 32;
            case 19 -> 9;
            case 20 -> 15;
            case 21 -> 29;
            case 22 -> 56;
            case 23 -> 54;
            case 24 -> 58;
            case 25 -> 63;
            case 26 -> 41;
            case 27 -> 14;
            case 28 -> 38;
            case 29 -> 4;
            case 30 -> 37;
            case 31 -> 16;
            case 32 -> 5;
            case 33 -> 18;
            case 34 -> 26;
            case 35 -> 48;
            case 36 -> 6;
            case 37 -> 44;
            case 38 -> 12;
            case 39 -> 2;
            case 40 -> 27;
            case 41 -> 55;
            case 42 -> 49;
            case 43 -> 10;
            case 44 -> 45;
            case 45 -> 33;
            case 46 -> 21;
            case 47 -> 0;
            case 48 -> 3;
            case 49 -> 13;
            case 50 -> 25;
            case 51 -> 19;
            case 52 -> 22;
            case 53 -> 53;
            case 54 -> 34;
            case 55 -> 23;
            case 56 -> 40;
            case 57 -> 50;
            case 58 -> 59;
            case 59 -> 8;
            case 60 -> 61;
            case 61 -> 62;
            case 62 -> 43;
            default -> 20;
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
        T.g[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "m\u007f\u0018T\u0004K{\u007f\u001d\u000e\u0017\\l4\u001e\b\u001bH}s\t\u001fPYX";
        objectArray[1] = ":oR\u0018d\u0005OOY\u0017uJ.AR\u001cq\u0010Z";
        objectArray[2] = "\u0002^\u0000\u001b8\u0015\tQ\u0011TY\u001b\u0002Z\u0015\u000e";
        objectArray[3] = "\u001a\u000e\"0oL\f\u000e'j|[\u001bE$lpO\n\u00023{;_(";
        objectArray[4] = "+\u001dIEfA^=BJw\u000e?3IAsTK";
        objectArray[5] = "uNS\u001d%x~ABRBzkJB\u0019y";
        objectArray[6] = Integer.TYPE;
        T.g[6] = "java/lang/Integer";
        objectArray[7] = "=i;>\tT6f*qdT6{>";
        objectArray[8] = "\u001d9\u0017i\u0005'L1\u0011\u0000\u0017UFbK=\u000eh\u000f`\u001e<~l\u0013c\u0000p\u00001\u001d6\u0000\u0000";
        objectArray[9] = " \u0018/2<^yM~oPR\u001a\u001d!9mH'T#ll8zCyj+J+K\u007f\u0003";
        objectArray[10] = "%3B}vdg9Hv\u001f{x)}m{gsU\u001fopc/i\u0019jmy\u001e";
        Object[] objectArray2 = objectArray;
        objectArray[11] = "6\b#[N2t\u0002)P'\u0010\\6\u000f\"\u001a'r\u0010x\u0012G+v\u0001";
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4131;
        if (d[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])e.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    e.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/T", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            T.d[n2] = T.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(T.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(T.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


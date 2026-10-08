/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_11910
 *  net.minecraft.class_312
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
import net.minecraft.class_11910;
import net.minecraft.class_312;

public class Q {
    private final class_312 a;
    private static final long b = hc.a(3122035035337482427L, 7456368852289811340L, MethodHandles.lookup().lookupClass()).a(138771343931899L);
    private static final String c;
    private static final Object[] d;
    private static final String[] e;

    public Q(class_312 class_3122) {
        this.a = class_3122;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new Object[18];
        e = new String[18];
        Q.a();
        long l = b ^ 0x83B79A30FB4L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("l\u00f0\u000b\u00fb\u00d0^\u00d2\u00d5UY\u009d\u00b3qeA\u00a2".getBytes("ISO-8859-1"));
                c = Q.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = Q.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = Q.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = Q.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = Q.b(classArray[i], string, clazz2);
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
            int n = Q.a(l, l2);
            object = d[n];
            try {
                if (!(object instanceof String)) break block2;
                Q.d[n] = clazz = Class.forName(e[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field c(long l, long l2) {
        int n = Q.a(l, l2);
        Object object = d[n];
        if (object instanceof String) {
            String string = e[n];
            int n2 = string.indexOf(8);
            Class clazz = Q.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = Q.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = Q.a(clazz3, string2, clazz2)) != null) {
                    Q.d[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = Q.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        Q.d[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = Q.b(350035042189542L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = Q.a(l, l2);
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
                clazz3 = Q.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = Q.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = Q.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        Q.d[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = Q.b(350035042189542L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = Q.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        Q.d[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = Q.b(350035042189542L, 0L);
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

    public void a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        int n = (Integer)objectArray[1];
        int n2 = (Integer)objectArray[2];
        int n3 = (Integer)objectArray[3];
        long l2 = (Long)objectArray[4];
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x434846D7487BL;
        long l5 = l3 ^ 0xB26C349A9AEL;
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = l5;
        objectArray2[4] = new Class[]{Q.a("R", (long)-8939245138124093229L, (long)l2), class_11910.class, Q.a("R", (long)-8939356261394816438L, (long)l2)};
        objectArray2[3] = Q.a("R", (long)-8937407361641984318L, (long)l2);
        objectArray2[2] = class_312.class;
        objectArray2[1] = c;
        objectArray2[0] = this.a;
        CallSite callSite = Q.a("\u00f2", (Object)objectArray2, (long)-8937819308084624739L, (long)l2);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l4;
        objectArray3[0] = new Object[]{Q.a("\u00f2", (long)l, (long)-8937812700545861953L, (long)l2), new class_11910(n, n3), Q.a("\u00f2", (int)n2, (long)-8937696011531043489L, (long)l2)};
        Q.a("W", (Object)callSite, (Object)objectArray3, (long)-8937899481241873124L, (long)l2);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/Q" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'h' || c == 'S' || c == 'R' || c == 'F') {
                field = Q.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'h' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'S' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'R' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = Q.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'W' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = Q.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void a() {
        Object[] objectArray = d;
        d[0] = "\u0010\n%\u0002q\u0012\u001b\u00054M\t\u0011\u0013\u000f";
        objectArray[1] = "e.\u0005LeWn!\u0014\u0003\bWn<\u0000";
        objectArray[2] = "7{\u001a/p\u0001!{\u001fuc\u001660\u001cso\u0002'w\u000bd$\u0012\u001b";
        objectArray[3] = "=<0C?iH\u001c;L.&)\u00120G*|]";
        objectArray[4] = "Dp\u0003)J%O\u007f\u0012f++Dt\u0016<";
        objectArray[5] = "\u001aN6=\fo\fN3g\u001fx\u001b\u00050a\u0013l\nB'vX|)";
        objectArray[6] = "lhEjR.\u0019HNeCaxFEnG;\f";
        objectArray[7] = "e\u0014MO\u007f\u0019n\u001b\\\u0000\u001d\u001aa\u0012";
        objectArray[8] = Long.TYPE;
        Q.e[8] = "java/lang/Long";
        objectArray[9] = "Z^\u000e\u0017szQQ\u001fX\u0014xDZ\u001f\u0013/";
        objectArray[10] = Integer.TYPE;
        Q.e[10] = "java/lang/Integer";
        objectArray[11] = "=0UClM9iSs\n\"\u000e\u001b6J?\u0002$5R\u001d:\u0019)";
        objectArray[12] = "7P\u0011\u0007F\u0011\u007fZO\u0014\"\u0007\u000e\nZDH\r4O\u001f\u001a\u0012n5Y\u001a\u0001\\\u000bnZCE\"";
        objectArray[13] = "U\u00018_\u0014\u0006\u000eJ#\u0006t\u0003i\u0004;\u0003\u001e\tSA~]DjP^p@\u0010\u0015\u0018T.St";
        objectArray[14] = "BFpz\t(AH(}1o\u0017Pklv\u007f~\tlo\u000b+\u0019Q,s\u000e\u0011BFpz\t(AH(}1";
        objectArray[15] = "pP\u0017Q!71[\u0011SPs'P\u0010\\\u0017cN\u000b\u0006M;q$R\\A>\rpP\u0017Q!71[\u0011SP";
        objectArray[16] = "3F{[d+rM}Y\u0015M\\zL;,x|Pb_{}g]";
        Object[] objectArray2 = objectArray;
        objectArray[17] = "^\u007f;tD5]qcs|P3U\u0010\u000fEe\u0013\u007f>k\u0012`\br";
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
            case 0 -> 13;
            case 1 -> 3;
            case 2 -> 45;
            case 3 -> 21;
            case 4 -> 0;
            case 5 -> 59;
            case 6 -> 9;
            case 7 -> 22;
            case 8 -> 20;
            case 9 -> 25;
            case 10 -> 7;
            case 11 -> 58;
            case 12 -> 38;
            case 13 -> 15;
            case 14 -> 48;
            case 15 -> 29;
            case 16 -> 27;
            case 17 -> 26;
            case 18 -> 6;
            case 19 -> 51;
            case 20 -> 54;
            case 21 -> 46;
            case 22 -> 43;
            case 23 -> 34;
            case 24 -> 17;
            case 25 -> 53;
            case 26 -> 44;
            case 27 -> 28;
            case 28 -> 33;
            case 29 -> 63;
            case 30 -> 1;
            case 31 -> 52;
            case 32 -> 32;
            case 33 -> 36;
            case 34 -> 4;
            case 35 -> 41;
            case 36 -> 55;
            case 37 -> 14;
            case 38 -> 47;
            case 39 -> 39;
            case 40 -> 42;
            case 41 -> 11;
            case 42 -> 31;
            case 43 -> 10;
            case 44 -> 23;
            case 45 -> 49;
            case 46 -> 56;
            case 47 -> 30;
            case 48 -> 8;
            case 49 -> 60;
            case 50 -> 24;
            case 51 -> 16;
            case 52 -> 61;
            case 53 -> 50;
            case 54 -> 37;
            case 55 -> 19;
            case 56 -> 35;
            case 57 -> 12;
            case 58 -> 57;
            case 59 -> 40;
            case 60 -> 62;
            case 61 -> 18;
            case 62 -> 5;
            default -> 2;
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
        Q.e[n3] = new String(cArray);
        return n3;
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Q.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


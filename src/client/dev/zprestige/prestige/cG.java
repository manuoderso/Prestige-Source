/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.cF;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.m_0;
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

class cG {
    static final boolean a;
    static final int[] b;
    private static final Object[] c;
    private static final String[] d;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n;
        long l = hc.a(6859221233619350292L, 5215767622333457133L, MethodHandles.lookup().lookupClass()).a(255066416970661L) ^ 0x59EEB4EB2009L;
        c = new Object[12];
        d = new String[12];
        cG.a();
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long l2 = 567645315680775739L;
        byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
        long l3 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
        b = new int[((CallSite)cG.a("d", (long)4784170047414687845L, (long)l)).length];
        try {
            cG.b[cG.a("H", (Object)((Object)m_0.TRIANGLES), (long)4784086119844992945L, (long)l)] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            cG.b[cG.a("H", (Object)((Object)m_0.QUADS), (long)4784086119844992945L, (long)l)] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            cG.b[cG.a("H", (Object)((Object)m_0.TRIANGLES_FAN), (long)4784086119844992945L, (long)l)] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            cG.b[cG.a("H", (Object)((Object)m_0.DEBUG_LINE_STRIP), (long)4784086119844992945L, (long)l)] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            cG.b[cG.a("H", (Object)((Object)m_0.QUAD_STRIP), (long)4784086119844992945L, (long)l)] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            cG.b[cG.a("H", (Object)((Object)m_0.LINES), (long)4784086119844992945L, (long)l)] = (int)l3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            n = cG.a("H", cF.class, (long)4783968402928954000L, (long)l) == false ? 1 : 0;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            throw cG.a("d", (Object)noSuchFieldError, (long)4784157972142945564L, (long)l);
        }
        a = n;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = cG.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = cG.b(classArray[i], string, clazz2);
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
            int n = cG.a(l, l2);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                cG.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = cG.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = cG.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = cG.a(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = cG.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = cG.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = cG.a(clazz3, string2, clazz2)) != null) {
                    cG.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = cG.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        cG.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = cG.b(513020888839530L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = cG.a(l, l2);
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
                clazz3 = cG.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = cG.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = cG.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        cG.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = cG.b(513020888839530L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = cG.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        cG.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = cG.b(513020888839530L, 0L);
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

    private static NoSuchFieldError a(NoSuchFieldError noSuchFieldError) {
        return noSuchFieldError;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'D' || c == '\u00d8' || c == 'S' || c == '\u00c6') {
                field = cG.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'D' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d8' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'S' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = cG.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'H' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'd' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = cG.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cG" + " : " + string + " : " + methodType.toString(), exception);
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

    private static void a() {
        Object[] objectArray = c;
        c[0] = ".\u0017y&2B8\u0017||!U/\\\u007fz-A>\u001bhmf_";
        objectArray[1] = "P-[A\u0004-q\u0011MA\u0001wb\u0006Z\n\u0002qn\u0012KM\u0015f%\f\u0004";
        objectArray[2] = Integer.TYPE;
        cG.d[2] = "java/lang/Integer";
        objectArray[3] = "\u0014H\u001b&N\u0005\u001fG\ni#\u0005\u001fZ\u001e";
        objectArray[4] = Boolean.TYPE;
        cG.d[4] = "java/lang/Boolean";
        objectArray[5] = "{A\u00048=&mA\u0001b.1z\n\u0002d\"%kM\u0015si5X";
        objectArray[6] = "\u0014}r\u0019\u0007{\u001frcVgx-ig\u0010o~\u001bp`=[e\u0011n";
        objectArray[7] = "V8>&z8]7/i\u001b6V<+3";
        objectArray[8] = "=\u0004\u0005gD<%\bQWO>6\u0004\\>LDc\u001d[(M\":\u0001Ck(";
        objectArray[9] = "d$]\u0002M$ ;_S )3>D\u0017M)\u0017>^\u0000Z9?\"C6\\,\"8^m\u001a9#~Z\u000e\u0018;'>%";
        objectArray[10] = "W\u001au)e O\u0016!\u0019w1T\u0006'b\ta\nC5`{$W\u00183\u0019";
        Object[] objectArray2 = objectArray;
        objectArray[11] = ";\u0018\u0007E\u0014Na\u000f\u0019Ef\u001b\u0000Z\u0018\u0016X\faX\u001eP\u0019r<\u001d_\u0014\u0018\u0013>\u001b\u0019Uf";
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
            case 0 -> 26;
            case 1 -> 11;
            case 2 -> 15;
            case 3 -> 17;
            case 4 -> 50;
            case 5 -> 21;
            case 6 -> 55;
            case 7 -> 13;
            case 8 -> 35;
            case 9 -> 33;
            case 10 -> 45;
            case 11 -> 34;
            case 12 -> 60;
            case 13 -> 40;
            case 14 -> 52;
            case 15 -> 18;
            case 16 -> 16;
            case 17 -> 47;
            case 18 -> 61;
            case 19 -> 32;
            case 20 -> 48;
            case 21 -> 28;
            case 22 -> 27;
            case 23 -> 43;
            case 24 -> 39;
            case 25 -> 38;
            case 26 -> 41;
            case 27 -> 7;
            case 28 -> 56;
            case 29 -> 57;
            case 30 -> 20;
            case 31 -> 2;
            case 32 -> 36;
            case 33 -> 23;
            case 34 -> 62;
            case 35 -> 5;
            case 36 -> 59;
            case 37 -> 3;
            case 38 -> 44;
            case 39 -> 31;
            case 40 -> 54;
            case 41 -> 58;
            case 42 -> 14;
            case 43 -> 46;
            case 44 -> 51;
            case 45 -> 4;
            case 46 -> 53;
            case 47 -> 42;
            case 48 -> 29;
            case 49 -> 0;
            case 50 -> 24;
            case 51 -> 30;
            case 52 -> 22;
            case 53 -> 63;
            case 54 -> 10;
            case 55 -> 12;
            case 56 -> 19;
            case 57 -> 6;
            case 58 -> 25;
            case 59 -> 37;
            case 60 -> 9;
            case 61 -> 1;
            case 62 -> 8;
            default -> 49;
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
        cG.d[n3] = new String(cArray);
        return n3;
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
            return MethodHandles.lookup().findStatic(cG.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


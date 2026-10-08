/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
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
import net.minecraft.class_310;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class P {
    private final class_310 a;
    private static final long b = hc.a(376468134827346157L, -1214186049870357561L, MethodHandles.lookup().lookupClass()).a(250891365094211L);
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final Object[] f;
    private static final String[] g;

    public P(class_310 class_3102) {
        this.a = class_3102;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        f = new Object[16];
        g = new String[16];
        P.a();
        e = new HashMap(13);
        long l = b ^ 0x613AB0A3F858L;
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
        String string = "\u00bf\u0094\u00d2\u00869\u0093\u00a4\u0086\b\u0091\u00df\u0089Wm\u009c\u00c5l\u00af)2\u008b\u00ab\u00ee\u00d5 Nd\u00fc\u00e3\u009fS\u0096\u00d3\u00fdI\u00c3r\u00db\u00c9\u00bd\u0000\u009dP\u00c2\u0097\u0091\u00ac\u00b4\u00e4Y\u00ff\u00aa\u0005!\u00b4\u0098\u00a4";
        int n2 = "\u00bf\u0094\u00d2\u00869\u0093\u00a4\u0086\b\u0091\u00df\u0089Wm\u009c\u00c5l\u00af)2\u008b\u00ab\u00ee\u00d5 Nd\u00fc\u00e3\u009fS\u0096\u00d3\u00fdI\u00c3r\u00db\u00c9\u00bd\u0000\u009dP\u00c2\u0097\u0091\u00ac\u00b4\u00e4Y\u00ff\u00aa\u0005!\u00b4\u0098\u00a4".length();
        int n3 = 24;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = P.a(byArray3).intern();
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
            int n = P.a(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                P.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = P.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = P.b(classArray[i], string, clazz2);
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
            throw new RuntimeException("dev/zprestige/prestige/P" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = P.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = P.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = P.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = P.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = P.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = P.a(clazz3, string2, clazz2)) != null) {
                    P.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = P.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        P.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = P.b(663208662925612L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = P.a(l, l2);
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
                clazz3 = P.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = P.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = P.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        P.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = P.b(663208662925612L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = P.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        P.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = P.b(663208662925612L, 0L);
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
        String string2 = P.a(n, l);
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

    public void a(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x21873421FABFL;
        long l4 = l2 ^ 0x16D9D9C62EBBL;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = P.b("J", (long)-7629688928155591271L, (long)l);
        objectArray2[2] = class_310.class;
        objectArray2[1] = P.a("u", (int)16870, (long)(0x746F1AAE3F1983CDL ^ l));
        objectArray2[0] = this.a;
        CallSite callSite = P.b("O", (Object)objectArray2, (long)-7629843525535116971L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = P.b("O", (int)n, (long)-7629879820384642192L, (long)l);
        P.b("C", (Object)callSite, (Object)objectArray3, (long)-7630080323045127951L, (long)l);
    }

    public int a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x2DFF18002CD3L;
        long l4 = l2 ^ 0x5877D3FBC125L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = P.b("J", (long)8756027891977024007L, (long)l);
        objectArray2[2] = class_310.class;
        objectArray2[1] = P.a("u", (int)29923, (long)(0x431C4D199C7D957L ^ l));
        objectArray2[0] = this.a;
        CallSite callSite = P.b("O", (Object)objectArray2, (long)8755867470685257419L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        return (int)P.b("C", (Object)((Integer)((Object)P.b("C", (Object)callSite, (Object)objectArray3, (long)8755738345743124848L, (long)l))), (long)8756055827786510088L, (long)l);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'z' || c == '\u00f1' || c == 'J' || c == 'R') {
                field = P.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'z' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f1' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'J' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = P.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'C' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'O' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = P.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/P" + " : " + string + " : " + methodType.toString(), exception);
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
            case 0 -> 61;
            case 1 -> 24;
            case 2 -> 14;
            case 3 -> 53;
            case 4 -> 18;
            case 5 -> 36;
            case 6 -> 2;
            case 7 -> 25;
            case 8 -> 12;
            case 9 -> 47;
            case 10 -> 56;
            case 11 -> 38;
            case 12 -> 11;
            case 13 -> 22;
            case 14 -> 35;
            case 15 -> 40;
            case 16 -> 45;
            case 17 -> 48;
            case 18 -> 52;
            case 19 -> 28;
            case 20 -> 60;
            case 21 -> 26;
            case 22 -> 27;
            case 23 -> 9;
            case 24 -> 7;
            case 25 -> 55;
            case 26 -> 30;
            case 27 -> 57;
            case 28 -> 29;
            case 29 -> 32;
            case 30 -> 19;
            case 31 -> 0;
            case 32 -> 63;
            case 33 -> 44;
            case 34 -> 3;
            case 35 -> 50;
            case 36 -> 33;
            case 37 -> 46;
            case 38 -> 10;
            case 39 -> 23;
            case 40 -> 31;
            case 41 -> 43;
            case 42 -> 62;
            case 43 -> 51;
            case 44 -> 13;
            case 45 -> 49;
            case 46 -> 6;
            case 47 -> 4;
            case 48 -> 5;
            case 49 -> 41;
            case 50 -> 54;
            case 51 -> 59;
            case 52 -> 20;
            case 53 -> 8;
            case 54 -> 37;
            case 55 -> 39;
            case 56 -> 17;
            case 57 -> 1;
            case 58 -> 34;
            case 59 -> 21;
            case 60 -> 58;
            case 61 -> 15;
            case 62 -> 16;
            default -> 42;
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
        P.g[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "uLE!w-~CTn\u0010/kHT%+";
        objectArray[1] = Integer.TYPE;
        P.g[1] = "java/lang/Integer";
        objectArray[2] = "Jc\f\f@\u0005Al\u001dC-\u0005Aq\t";
        objectArray[3] = " PiM^)6Pl\u0017M>!\u001bo\u0011A*0\\x\u0006\n;\u0015";
        objectArray[4] = "\u0002Y\u00058@qwy\u000e7Q>\u0016w\u0005<Udb";
        objectArray[5] = Void.TYPE;
        P.g[5] = "java/lang/Void";
        objectArray[6] = "3r/T 5%r*\u000e3\"29)\b?6#~>\u001ft&\u0001";
        objectArray[7] = "\u0003\fB:1\u0018v,I5 W\u0017\"B>$\rc";
        objectArray[8] = "{Q6na_\u000eq=ap\u0010o\u007f6jtJ\u001b";
        objectArray[9] = " 8=\u0014I}+7,[(s <(\u0001";
        objectArray[10] = "B{[Om$\b+V\u0005\u0014/xyW\u0010i?\u00159R\b~FC<X\u0006r&\u001d\"M\u0018\u0014";
        objectArray[11] = "#\u001f\u001a?F,iO\u0017u?'\u0019\u001d\u0016`B7t]\u0013xUN'BN:B7u\u001d\n|?";
        objectArray[12] = "$3$CZC%t1/\u0014Wyr1h\u0004>dp7\u0010Q]\"7m/S\u0002eclRREp\u000f";
        objectArray[13] = "\r\u001b+b3qVA'|Ru1\u00176`/f\\W3x8\u001f\u000b\u0015:?+}AE7uR";
        objectArray[14] = "\u001dr\u0019R.\u0004\u001c5\f>\u007f\u001fX\u0010\bZc\u0014$7\u001eU!BGqY\u000f\u001e";
        Object[] objectArray2 = objectArray;
        objectArray[15] = "0c\u0001'0\r1$\u0014K\\!Q\u0012yr}\u0015m.\u001b3xJg";
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5434;
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
                throw new RuntimeException("dev/zprestige/prestige/P", exception);
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
            P.d[n2] = P.a(((Cipher)objectArray[0]).doFinal(byArray2));
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
            return MethodHandles.lookup().findStatic(P.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(P.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


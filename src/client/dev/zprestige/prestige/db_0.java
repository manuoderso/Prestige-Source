/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.hc;
import java.io.InputStream;
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
 * Renamed from dev.zprestige.prestige.db
 */
public class db_0 {
    private final String a;
    private static final long b = hc.a(8555634799523047774L, -1876915427186382076L, MethodHandles.lookup().lookupClass()).a(253652340714035L);
    private static final String c;
    private static final Object[] d;
    private static final String[] e;

    private db_0(String string) {
        this.a = string;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new Object[22];
        e = new String[22];
        db_0.a();
        long l = b ^ 0x5283FC8B4379L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("x>\u00c5m\u00d8r\u00e5\u001dXZ\u00f6\u0097\u0017AZ\u00e2\u0084\u00eeG\u00e3*\u00ee\u00faE".getBytes("ISO-8859-1"));
                c = db_0.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    public boolean equals(Object object) {
        Object object2;
        long l;
        block10: {
            block11: {
                CallSite callSite;
                block8: {
                    block9: {
                        l = b ^ 0x3011A97EAE8EL;
                        callSite = db_0.a("\u00e1", (long)1520478233427233962L, (long)l);
                        try {
                            try {
                                object2 = this;
                                if (callSite != null) break block8;
                                if (object2 != object) break block9;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw db_0.a("\u00e1", (Object)illegalArgumentException, (long)1521826422369394451L, (long)l);
                            }
                            return true;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw db_0.a("\u00e1", (Object)illegalArgumentException, (long)1521826422369394451L, (long)l);
                        }
                    }
                    object2 = object;
                }
                try {
                    try {
                        if (callSite != null) break block10;
                        if (object2 instanceof db_0) break block11;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw db_0.a("\u00e1", (Object)illegalArgumentException, (long)1521826422369394451L, (long)l);
                    }
                    return false;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw db_0.a("\u00e1", (Object)illegalArgumentException, (long)1521826422369394451L, (long)l);
                }
            }
            object2 = object;
        }
        db_0 db_02 = (db_0)object2;
        return (boolean)db_0.a("A", this.a, (Object)db_02.a, (long)1522027958479817924L, (long)l);
    }

    public String toString() {
        return this.a;
    }

    public int hashCode() {
        long l = b ^ 0x6B41C2F84C91L;
        return (int)db_0.a("\u00e1", (Object)new Object[]{this.a}, (long)-648126871286636196L, (long)l);
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = db_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = db_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = db_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = db_0.b(classArray[i], string, clazz2);
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
            int n = db_0.a(l, l2);
            object = d[n];
            try {
                if (!(object instanceof String)) break block2;
                db_0.d[n] = clazz = Class.forName(e[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field c(long l, long l2) {
        int n = db_0.a(l, l2);
        Object object = d[n];
        if (object instanceof String) {
            String string = e[n];
            int n2 = string.indexOf(8);
            Class clazz = db_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = db_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = db_0.a(clazz3, string2, clazz2)) != null) {
                    db_0.d[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = db_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        db_0.d[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = db_0.b(595382750666758L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = db_0.a(l, l2);
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
                clazz3 = db_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = db_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = db_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        db_0.d[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = db_0.b(595382750666758L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = db_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        db_0.d[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = db_0.b(595382750666758L, 0L);
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = db_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'J' || c == '\u00fa' || c == '\u00c5' || c == 'L') {
                field = db_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'J' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fa' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = db_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'A' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/db" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public String a(Object[] objectArray) {
        return this.a;
    }

    public InputStream a(Object[] objectArray) {
        CallSite callSite;
        block4: {
            CallSite callSite2;
            block5: {
                long l = (Long)objectArray[0];
                l = b ^ l;
                callSite2 = db_0.a("A", (Object)db_0.a("A", db_0.class, (long)8763024036834522532L, (long)l), (Object)this.a, (long)8762831946755166826L, (long)l);
                CallSite callSite3 = db_0.a("\u00e1", (long)8762780863712567336L, (long)l);
                try {
                    try {
                        callSite = callSite2;
                        if (callSite3 != null) break block4;
                        if (callSite != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw db_0.a("\u00e1", (Object)illegalArgumentException, (long)8763135367343305617L, (long)l);
                    }
                    throw new IllegalArgumentException(c + (String)((Object)db_0.a("\u00e1", (Object)this, (long)8762944564768977223L, (long)l)));
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw db_0.a("\u00e1", (Object)illegalArgumentException, (long)8763135367343305617L, (long)l);
                }
            }
            callSite = callSite2;
        }
        return callSite;
    }

    public static db_0 a(Object[] objectArray) {
        Object object;
        block4: {
            String string;
            block5: {
                string = (String)objectArray[0];
                long l = (Long)objectArray[1];
                l = b ^ l;
                CallSite callSite = db_0.a("\u00e1", (long)5952063315168561962L, (long)l);
                try {
                    try {
                        object = string;
                        if (callSite != null) break block4;
                        if (db_0.a("A", (Object)object, (Object)"/", (long)5953544041183915338L, (long)l) == false) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw db_0.a("\u00e1", (Object)illegalArgumentException, (long)5953395834426284179L, (long)l);
                    }
                    object = db_0.a("A", string, (int)1, (long)5951846702683497393L, (long)l);
                    break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw db_0.a("\u00e1", (Object)illegalArgumentException, (long)5953395834426284179L, (long)l);
                }
            }
            object = string;
        }
        String string = object;
        return new db_0(string);
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = d;
        d[0] = "\u001am<\u0012t5\u0004e&]\u0015\"\u001ai)\u0007)";
        objectArray[1] = "LYT^qT9y_Q`\u001bXwTZdA,";
        objectArray[2] = Integer.TYPE;
        db_0.e[2] = "java/lang/Integer";
        objectArray[3] = "!8gN\r@78b\u0014\u001eW sa\u0012\u0012C14v\u0005YQ\r";
        objectArray[4] = "CUt\r\u0002M6u\u007f\u0002\u0013\u0002Kml\u0005\u001aK#";
        objectArray[5] = "$g\u0001iO|2g\u00043\\k%,\u00075P\u007f4k\u0010\"\u001bh\"";
        objectArray[6] = "\fSz>\u0007J\u0007\\kq`J\nWk>Eg\u0014Uy2LH\u0012wt<LV\u0012[c1";
        objectArray[7] = "O%d=n\u000bD*ur\u0013\u0013W-|;";
        objectArray[8] = "L\r7\u0007\u0019\u0011G\u0002&Hx\u001fL\t\"\u0012";
        objectArray[9] = Boolean.TYPE;
        db_0.e[9] = "java/lang/Boolean";
        objectArray[10] = "\rk>T\u000eD\u0006d/\u001bcD\u0006y;";
        objectArray[11] = "VF\fs:{]I\u001d<W{]T\t^{vXB\b";
        objectArray[12] = ".uLE\u0014?+:sJJ#0GNV_7)";
        objectArray[13] = "\u0015!<zK\u001eXc?g\"\u0000UvzwX\u001aNs\u00011\u001a\u000bObft]\u0010\u0019\u001c<6\u001f\nAyqt\u001c\u0017(";
        objectArray[14] = " 3\u0006\u0007icx\u007f[\u0016\u0005h\u001a5\\\u001af9x?\u0000\u0007w\u0002";
        objectArray[15] = "61[E*C\u007f|\u001e\u001c\u0016^k|9\u0012mV{z\b\u0012_J]|\u0019\u0012\u007fT\u0006=^BgXcp\u001cAz16d\u0001\u001bq\fkoR\u001b\u0016";
        objectArray[16] = "IOD.\u0018*\u0004\rG3q1\u001d\u0016\u000426!tO\u0007f\u0017uI\u001cE`\u0018OIOD.\u0018*\u0004\rG3q";
        objectArray[17] = "\u0004d\u001fOo\u0017\u001dgJ5jN\u0016~ MgM\u0001}\u001b\u000e7Ym$\u0018EmY\na_^;'";
        objectArray[18] = "+`z\u001fr\u000bpm{\u000e\u001f\\y}\r\u0014vHoE!\u0019s^n\u0001vA'\t(s?\fbP\u0014";
        objectArray[19] = "\u0012)\u001e&\u001b\t\u0011p\nyg\u0005)v\b&\u0003T\u0017u\u0010|\u0000l\u0015,Q}_R\u00164\u000b~g";
        objectArray[20] = "\u000f[!\u000e\u001fDB\u0019\"\u0013vLK\u001bu\u001b\r!\u000f\u0018%\u0019L\u001c\\Z#\u0016v\u001f\\[f@\u0010X\u000b\u0004`\u007f";
        Object[] objectArray2 = objectArray;
        objectArray[21] = "\b\u0004{$:AEFx9S_IP<)({TE&Un\u0019\bH/0#[\u000bUFk=\u0019O\u0006 ,jFI9";
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
            case 0 -> 45;
            case 1 -> 34;
            case 2 -> 61;
            case 3 -> 52;
            case 4 -> 26;
            case 5 -> 30;
            case 6 -> 3;
            case 7 -> 9;
            case 8 -> 33;
            case 9 -> 53;
            case 10 -> 46;
            case 11 -> 23;
            case 12 -> 47;
            case 13 -> 11;
            case 14 -> 8;
            case 15 -> 24;
            case 16 -> 14;
            case 17 -> 2;
            case 18 -> 25;
            case 19 -> 42;
            case 20 -> 22;
            case 21 -> 63;
            case 22 -> 18;
            case 23 -> 12;
            case 24 -> 4;
            case 25 -> 36;
            case 26 -> 49;
            case 27 -> 56;
            case 28 -> 43;
            case 29 -> 51;
            case 30 -> 31;
            case 31 -> 44;
            case 32 -> 13;
            case 33 -> 1;
            case 34 -> 40;
            case 35 -> 39;
            case 36 -> 60;
            case 37 -> 54;
            case 38 -> 6;
            case 39 -> 35;
            case 40 -> 38;
            case 41 -> 7;
            case 42 -> 55;
            case 43 -> 58;
            case 44 -> 41;
            case 45 -> 59;
            case 46 -> 20;
            case 47 -> 0;
            case 48 -> 19;
            case 49 -> 28;
            case 50 -> 10;
            case 51 -> 17;
            case 52 -> 57;
            case 53 -> 27;
            case 54 -> 62;
            case 55 -> 15;
            case 56 -> 29;
            case 57 -> 16;
            case 58 -> 48;
            case 59 -> 37;
            case 60 -> 32;
            case 61 -> 50;
            case 62 -> 5;
            default -> 21;
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
        db_0.e[n3] = new String(cArray);
        return n3;
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
            return MethodHandles.lookup().findStatic(db_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


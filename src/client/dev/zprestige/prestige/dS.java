/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.cP;
import dev.zprestige.prestige.dK;
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
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class dS
extends dK {
    private final String[] a;
    private final boolean[] b;
    private final Map c;
    private static final long f = hc.a(-1254954408320667990L, 1098954933261275942L, MethodHandles.lookup().lookupClass()).a(36005739899226L);
    private static final String[] h;
    private static final String[] i;
    private static final Map j;
    private static final Object[] m;
    private static final String[] n;

    public dS(String string, String[] stringArray, boolean[] blArray) {
        long l = f ^ 0x39AAD1B7D714L;
        CallSite callSite = dS.c("\u00c0", (long)-2759033187335830699L, (long)l);
        super(string, "");
        this.a = stringArray;
        CallSite callSite2 = callSite;
        this.b = blArray;
        this.c = new HashMap(stringArray.length * 2);
        for (int i = 0; i < stringArray.length; ++i) {
            dS.c("P", (Object)this.c, (Object)stringArray[i], (Object)dS.c("\u00c0", (int)i, (long)-2759505695916356495L, (long)l), (long)-2759325602498791376L, (long)l);
            if (callSite2 == null) continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        m = new Object[18];
        n = new String[18];
        dS.c();
        j = new HashMap(13);
        long l = f ^ 0x1FF55B3AB2F0L;
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
        String string = "\u00e8\u00d1\u0087\u00e8D\u0089\u009b<=p\u00ab\u0010\u00a5P\u009c\u0097ZdE\u00e1%K\u009bl\u00eac\u00fb\u00eao\u0002\u00c6F\u001b\u0082\u008f,,\u00ee\u00ef\u001b(}\u00c2}\u00db\u00f3\u00bf\u00f5\u00bb\u008a68\u0094\u0089K#\u00be\u0086|5\u00e7\u00dfI`\u00ad4 \u00b7\u00a3 U\u0099\u0090\u00ca\u007f\u00b7#U\u00f1% ";
        int n2 = "\u00e8\u00d1\u0087\u00e8D\u0089\u009b<=p\u00ab\u0010\u00a5P\u009c\u0097ZdE\u00e1%K\u009bl\u00eac\u00fb\u00eao\u0002\u00c6F\u001b\u0082\u008f,,\u00ee\u00ef\u001b(}\u00c2}\u00db\u00f3\u00bf\u00f5\u00bb\u008a68\u0094\u0089K#\u00be\u0086|5\u00e7\u00dfI`\u00ad4 \u00b7\u00a3 U\u0099\u0090\u00ca\u007f\u00b7#U\u00f1% ".length();
        int n3 = 40;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = dS.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                h = stringArray;
                i = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (dS.n[n3] != null) {
            return n3;
        }
        Object object = m[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 33;
            case 1 -> 1;
            case 2 -> 27;
            case 3 -> 28;
            case 4 -> 21;
            case 5 -> 17;
            case 6 -> 5;
            case 7 -> 14;
            case 8 -> 40;
            case 9 -> 24;
            case 10 -> 63;
            case 11 -> 18;
            case 12 -> 2;
            case 13 -> 59;
            case 14 -> 51;
            case 15 -> 29;
            case 16 -> 35;
            case 17 -> 44;
            case 18 -> 42;
            case 19 -> 9;
            case 20 -> 54;
            case 21 -> 36;
            case 22 -> 39;
            case 23 -> 30;
            case 24 -> 60;
            case 25 -> 11;
            case 26 -> 47;
            case 27 -> 8;
            case 28 -> 61;
            case 29 -> 46;
            case 30 -> 58;
            case 31 -> 23;
            case 32 -> 0;
            case 33 -> 56;
            case 34 -> 7;
            case 35 -> 25;
            case 36 -> 48;
            case 37 -> 20;
            case 38 -> 41;
            case 39 -> 53;
            case 40 -> 12;
            case 41 -> 32;
            case 42 -> 34;
            case 43 -> 16;
            case 44 -> 10;
            case 45 -> 52;
            case 46 -> 22;
            case 47 -> 15;
            case 48 -> 3;
            case 49 -> 13;
            case 50 -> 43;
            case 51 -> 49;
            case 52 -> 37;
            case 53 -> 57;
            case 54 -> 62;
            case 55 -> 45;
            case 56 -> 19;
            case 57 -> 4;
            case 58 -> 50;
            case 59 -> 38;
            case 60 -> 26;
            case 61 -> 31;
            case 62 -> 6;
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
        dS.n[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'V' || c == '\u00ff' || c == '\u00f9' || c == 'Y') {
                field = dS.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'V' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ff' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f9' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = dS.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'P' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c0' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = dS.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dS" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static void c() {
        Object[] objectArray = m;
        m[0] = "\u007f#r<Msi#wf^d~ht`Rpo/cw\u0019gH";
        objectArray[1] = "ol`*}bdcqe\u001abihq*?Owjc&6`qHn(6~qdy%";
        objectArray[2] = "s)9&Tyx&(i3{m-(\"\b";
        objectArray[3] = Integer.TYPE;
        dS.n[3] = "java/lang/Integer";
        objectArray[4] = "n\u0017(r\u0000gp\u001f2=cst";
        objectArray[5] = "<eW\u000fq07jF@\u0010><aB\u001a";
        objectArray[6] = "P\u0010ueZ-F\u0010p?I:Q[s9E.@\u001cd.\u000e<|";
        objectArray[7] = "\u0016B[}\u007f\u0015cbPrnZ\u001ezCug\u0013v";
        objectArray[8] = "5I|$AA@iw+P\u000e!g| TTU";
        objectArray[9] = "&\u000fV\u001e/e-\u0000GQR}>\u0007N\u0018";
        objectArray[10] = "5\u0005oifT7Qhp\u0004[\tU-ctUnT.f~1";
        objectArray[11] = "\u000fzf\"4!Pl\"Mf\u001e\u0002j&p0y\u0006((5\u000f.T.6v0qBjY";
        objectArray[12] = "MQWltB\u0018\u000bS9\u0011B\u001e\fPdVRwR\u001dn{^\u0012\u001a]tj<MQWltB\u0018\u000bS9\u0011";
        objectArray[13] = "\u001d]nU#2BK*:q\rQM3Hzi]F#:dvOD3^h}_6";
        objectArray[14] = "}ZIQA\u0007}\u0019TS\"\u001e:Y4\u0001G\u00047\u0014TKEW7%\u000f_@\u0016vEE]\u0013\u0016G\u001eQXRW'TS\u000bRf";
        objectArray[15] = "\fhmN\bcY2i\u001bm|P-IB\t`[Q-\u001b\nwT4e[\u0010f6";
        objectArray[16] = "7hAbUg7+\\`6i`k<2Sd}&\\xQ7}\u0017\u0007lTv<wMn\u0007v\r";
        Object[] objectArray2 = objectArray;
        objectArray[17] = "\r'vu^BR12\u001a\u001e\u0010A\u0000$a\u000e\u0007\\45{\u0002\u001b=r/~\b\u0004Qqqv]}\r'vu^BR12\u001a";
    }

    private static Method c(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static Method h(long l, long l2) {
        int n = dS.e(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = dS.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = dS.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = dS.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = dS.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        dS.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = dS.f(368305615271013L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = dS.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        dS.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = dS.f(368305615271013L, 0L);
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

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = dS.e(l, l2);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                dS.m[n] = clazz = Class.forName(dS.n[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = dS.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = dS.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = dS.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = dS.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = dS.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    @cP
    public String[] a() {
        return this.a;
    }

    @cP
    public void a(String string, boolean bl) {
        block4: {
            block5: {
                long l = f ^ 0x5373CA5FB9BBL;
                Integer n = (Integer)((Object)dS.c("P", (Object)this.c, (Object)string, (long)-5252297958877753209L, (long)l));
                CallSite callSite = dS.c("\u00c0", (long)-5252715358158197254L, (long)l);
                try {
                    try {
                        if (callSite != null) break block4;
                        if (n != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw dS.c("\u00c0", (Object)illegalArgumentException, (long)-5252475930373674965L, (long)l);
                    }
                    throw new IllegalArgumentException((String)((Object)dS.a("i", (int)22570, (long)(0x7068CB60829793FL ^ l))) + string);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw dS.c("\u00c0", (Object)illegalArgumentException, (long)-5252475930373674965L, (long)l);
                }
            }
            this.b[dS.c("P", (Object)n, (long)-5252383337445441704L, (long)l)] = bl;
        }
    }

    public boolean a(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        l = f ^ l;
        Integer n = (Integer)((Object)dS.c("P", (Object)this.c, (Object)string, (long)-8769231801531227690L, (long)l));
        try {
            if (n == null) {
                throw new IllegalArgumentException((String)((Object)dS.a("i", (int)6548, (long)(0x241B81139A3189D1L ^ l))) + string);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw dS.c("\u00c0", (Object)illegalArgumentException, (long)-8770184067851183750L, (long)l);
        }
        return this.b[dS.c("P", (Object)n, (long)-8770001782855496183L, (long)l)];
    }

    @Override
    public dK a(Object[] objectArray) {
        Predicate predicate = (Predicate)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l ^ 0x9274128F2BAL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = predicate;
        return dS.c("P", (Object)this, (Object)objectArray2, (long)-9174699507823128546L, (long)l);
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x160D;
        if (i[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])j.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    j.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/dS", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = h[n2].getBytes("ISO-8859-1");
            dS.i[n2] = dS.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return i[n2];
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

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    @cP
    public boolean[] a() {
        return this.b;
    }

    @Override
    public dS a(Object[] objectArray) {
        Predicate predicate = (Predicate)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = f ^ l) ^ 0x58321146FC19L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = predicate;
        super.a(objectArray2);
        return this;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dS" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field g(long l, long l2) {
        int n = dS.e(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            String string = dS.n[n];
            int n2 = string.indexOf(8);
            Class clazz = dS.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = dS.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = dS.c(clazz3, string2, clazz2)) != null) {
                    dS.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = dS.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        dS.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = dS.f(368305615271013L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    @cP
    public dK setDescription(String string) {
        long l = f ^ 0x4204AFC47B37L;
        return dS.c("P", (Object)this, (Object)string, (long)8471356179220951047L, (long)l);
    }

    @Override
    @cP
    public dS setDescription(String string) {
        super.setDescription(string);
        return this;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dS.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(dS.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


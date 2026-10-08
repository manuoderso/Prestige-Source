/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 *  net.minecraft.class_490
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.dL;
import dev.zprestige.prestige.dP;
import dev.zprestige.prestige.dR;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.f5;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.q_0;
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
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_310;
import net.minecraft.class_490;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.ey
 */
public class ey_0
extends dV {
    private dR a;
    private dL f;
    private dP c;
    private dP d;
    private f5 e;
    private static final long k = hc.a(3982518082043385866L, -8898630882669707402L, MethodHandles.lookup().lookupClass()).a(34921555161778L);
    private static final String[] l;
    private static final String[] m;
    private static final Map n;
    private static final long[] o;
    private static final Integer[] p;
    private static final Map q;
    private static final Object[] r;
    private static final String[] s;

    public ey_0() {
        long l = k ^ 0x494B65B8337L;
        long l2 = l ^ 0x5B0B56EB1ED4L;
        this.e = new f5(l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        r = new Object[52];
        s = new String[52];
        ey_0.f();
        n = new HashMap(13);
        long l = k ^ 0x1C016C818E3CL;
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
        String string = "\u00c4\u008c\u00e7k\u0003\u00a4\u00aa\u00d7\u00ae\u00de\u000e\u00b3i\u000f7P\u0010:s\u0086}s\u00a9S\u009f\u000b\u00d00\u00ba\u00ef]\u00f6\u0006";
        int n2 = "\u00c4\u008c\u00e7k\u0003\u00a4\u00aa\u00d7\u00ae\u00de\u000e\u00b3i\u000f7P\u0010:s\u0086}s\u00a9S\u009f\u000b\u00d00\u00ba\u00ef]\u00f6\u0006".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = ey_0.b(byArray3).intern();
            if ((n4 += n3) >= n2) break;
            n3 = string.charAt(n4);
        }
        ey_0.l = stringArray;
        m = new String[2];
        q = new HashMap(13);
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray5 = byArray5;
            byArray5[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n6 = 0;
        String string2 = " \u00a8\t~J;\u00eeK\u00b5Pg\u009f\u00d9x\u00e8\u0010";
        int n7 = " \u00a8\t~J;\u00eeK\u00b5Pg\u009f\u00d9x\u00e8\u0010".length();
        int n8 = 0;
        do {
            byte[] byArray6 = string2.substring(n8, n8 += 8).getBytes("ISO-8859-1");
            int n9 = n6++;
            long l2 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
            byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n9] = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
        } while (n8 < n7);
        o = lArray;
        p = new Integer[2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ey_0.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6414;
        if (m[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])ey_0.n.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    ey_0.n.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/ey", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = ey_0.l[n2].getBytes("ISO-8859-1");
            ey_0.m[n2] = ey_0.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return m[n2];
    }

    private static String b(byte[] byArray) {
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

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ey" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ey" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ey_0.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4B98;
        if (p[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = o[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])q.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    q.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/ey", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ey_0.p[n2] = n3;
        }
        return p[n2];
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ey_0.m(l, l2);
            object = r[n];
            try {
                if (!(object instanceof String)) break block2;
                ey_0.r[n] = clazz = Class.forName(s[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = ey_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ey_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ey_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ey_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = r;
        r[0] = "0^=\u00034K&^8Y'\\1\u0015;_+H R,H`Z\u001c";
        objectArray[1] = "noa\u001eS\u000b\u001bOj\u0011BDfWy\u0016K\r\u000e";
        objectArray[2] = "X\u0018YrGyN\u0018\\(TnYS_.XzH\u0014H9\u0013lE";
        objectArray[3] = "Km-J\u0013:>M&E\u0002u_C-N\u0006/+";
        objectArray[4] = Boolean.TYPE;
        ey_0.s[4] = "java/lang/Boolean";
        objectArray[5] = ")|,8\u001aD)|;d\u0016K37;z\u0016^4Fk'G";
        objectArray[6] = "\\(I\u0001$4\\(^](;Fc^C(.A\u0012\n\u001b\u007f";
        objectArray[7] = "\u001fF96CL\tF<lP[\u001e\r?j\\O\u000fJ(}\u0017ZN";
        objectArray[8] = "CN\u00118\u0000T6n\u001a7\u0011\u001bW`\u0011<\u0015A#";
        objectArray[9] = "y,\u0010x-Dy,\u0007$!Kcg\u0007:!^d\u0016Rex";
        objectArray[10] = ":\r#\r\u0002d,\r&W\u0011s;F%Q\u001dg*\u00012FVw,";
        objectArray[11] = ">9Ky\"JK\u0019@v3\u0005*\u0017K}7_^";
        objectArray[12] = "l\u0006}`J$g\tl/-&r\u0002ld\u0016";
        objectArray[13] = Integer.TYPE;
        ey_0.s[13] = "java/lang/Integer";
        objectArray[14] = "\\{\u0019[1~\\{\u000e\u0007=qF0\u000e\u0019=dAA\\Be.";
        objectArray[15] = "KR\fdG9KR\u001b8K6Q\u0019\u001b&K#VhI|\u001ca";
        objectArray[16] = "t#]^\u007fzb#X\u0004lmuh[\u0002`yd/L\u0015+n[";
        objectArray[17] = "\u007f^A#y'tQPl\u0018)\u007fZT6";
        objectArray[18] = "'lLe\u0016\u0011,c]*u\u001c9nRA@\u001e(}NmW\u0013";
        objectArray[19] = "\"\u0003BsGyW#I|V66-BwRlB";
        objectArray[20] = Void.TYPE;
        ey_0.s[20] = "java/lang/Void";
        objectArray[21] = "\u000fEugL8ze~h]w\u001bkucY-o";
        objectArray[22] = "t[5:\u0006\u000bt[\"f\n\u0004n\u0010\"x\n\u0011iap$_S";
        objectArray[23] = "\u0006\u0016\n\"9$\u0003\u0003\u0001\"2?\u000f\u0013CK\u0019\u0015>";
        objectArray[24] = Long.TYPE;
        ey_0.s[24] = "java/lang/Long";
        objectArray[25] = "|x\u0002^^\u0016|x\u0015\u0002R\u0019f3\u0015\u001cR\faBBC\u0004";
        objectArray[26] = "\u0011Is\u001c\u001f2\u001aFbSb*\tAk\u001a";
        objectArray[27] = "28~r^A,0d=#Q,";
        objectArray[28] = "Rz[Z\u001aERzL\u0006\u0016JH1L\u0018\u0016_O@\u001eCN\u001e";
        objectArray[29] = "cD?w\u007f\u000ecD(+s\u0001y\u000f(5s\u0014~~za\"U";
        objectArray[30] = "n\"~\"*Y68%aA\u00048:\">-6o||iza;+x$x\u001cj9$aA";
        objectArray[31] = "\u007fG'0g\u0005qJ!Rn~'\u0004u<zEgQ3o\u0004";
        objectArray[32] = "]\u001c u`\u001a\u0007\u0002/b\u0000Nd\u001cz+rL\u001f\u0017pyn\"_B:+?N\u000e\u001f&v\u0000";
        objectArray[33] = "\u0017xFJu\u0000\b-]\u000b\u0010\u000f\u001c|[~}\u001c;\u007fU1\u007f\u0012\b)^\u000b(\u0002@|$\u0000|P\u001du[^/\u001e\u001a\u0012\u0015] \u0005\u001fmK\u000en\u0002x";
        objectArray[34] = "\u0013P\u0002&VFKJYe=\u0010IYZ1jG\u0017\u000e\u0002]\u0001\u0006\u0019\u000bGbC\u0000G\u000f";
        objectArray[35] = "yF\u001ei \u0010(TB,\u0019\bzWDsu:+\u0017\u0015,\u0019\u0002e[\u001fn#Uu\u0013J\u0014";
        objectArray[36] = "H,\u0005S!\u0016\fz\u000e\u0002P\u001fu-D\\\"\u0018\u000e&N\u000e>vNs\u0004\\o\u001a\u001f.\u0018\u0001P";
        objectArray[37] = "\\W}\u0012\u001c`\u0004M&Qw6\u0006^%\u0005 aY\u0003~iI?\u001dM0\u0006\t8X\t";
        objectArray[38] = "f<\n%\njh0\u0014'{<YoV*\t<\"d\\x\u0015Rb1\u0016*D>3l\nw{";
        objectArray[39] = "\u001a,p~A\r\u0003'5:(\u001a\u001e:l\"D(Lw4t(\u001d\u0013\u007fj#N\u0010\u000b?bE";
        objectArray[40] = "H\u00181;1,\u0018\u000fqyA5\u001e\u0019\u0013+%)\u0015e|.q1\u001f\u001a\"}?6x";
        objectArray[41] = "S\u000eiM'?J\u0005,\tN(W\u0018u\u0011\"\u001a\u0005U+NNv\n\u0014%I\"'W\bxv";
        objectArray[42] = "}V5Y\u0005\\'_5\u001ai]\u007fY0N>\u0003&\ne\"\u000bS'R2D\u0006KgZ";
        objectArray[43] = "nnf!ba6t=b\t74g>6^`j7gZi 9f9bv4o0";
        objectArray[44] = "%\u001f\u0005G\u00062sA\u0001J\u007f7!\u0004^C\u0013\u0005qD\u0005\u0014\u007fc H[C\u0000=s\u0006\\$\u001680CWV\u000f3u\u0007>";
        objectArray[45] = "SQ$yCU\u0011Wz}:\u000f\u0002Uu!V=T\u0010(z\nj\u0006N.%C\nP\u0010*(:";
        objectArray[46] = "5f\u0014u`cap\u0003{\u0000;_tUzx;9|\u0001\"fR";
        objectArray[47] = "\u0014F8gD9NX7p$h-C7y\u0019>\u0013G7pJ\u0001FM\"4\u001b?BM+g$";
        objectArray[48] = "nr;=WLsp,h%Ta\t-oCKfo%;\u001bU\u000fh=)LApu?>\u00193";
        objectArray[49] = "X:9X3|\u001cl2\tBue;xW0r\u001e0r\u0005,\u001c\bh&\fxyT*)\u0002B";
        objectArray[50] = " Ux}\u0001%%X.p`-8B\u007fe\u001b@*\u0004py\t&\"P(g`{qO&>\f*,S{\u0001";
        Object[] objectArray2 = objectArray;
        objectArray[51] = "v6\t|QM,(\u0006k1\u001cO6S\"C\u001b4=Yp_u~4SwV\n g\u001dp1";
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ey" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ey_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'g' || c == '\u00d1' || c == 'd' || c == 'T') {
                field = ey_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'g' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d1' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'd' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ey_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f3' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'h' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean d(Object[] objectArray) {
        Object object;
        block15: {
            int n;
            block14: {
                CallSite callSite;
                CallSite callSite2;
                long l;
                block12: {
                    l = (Long)objectArray[0];
                    l = k ^ l;
                    callSite2 = ey_0.d("h", (long)253589029675584772L, (long)l);
                    try {
                        try {
                            callSite = ey_0.d("\u00f3", (String)((Object)ey_0.d("\u00f3", (Object)this.a, (long)254638545693696026L, (long)l)), (Object)ey_0.b("k", (int)23919, (long)(0x39DDF9B9FF693AF9L ^ l)), (long)256577360760783585L, (long)l);
                            if (callSite2 != null) break block12;
                            if (callSite != false) {
                                return ey_0.d("g", (Object)b, (long)254989929911896027L, (long)l) instanceof class_490;
                            }
                        }
                        catch (MatchException matchException) {
                            throw ey_0.d("h", (Object)matchException, (long)254701146319773590L, (long)l);
                        }
                    }
                    catch (MatchException matchException) {
                        throw ey_0.d("h", (Object)matchException, (long)254701146319773590L, (long)l);
                    }
                    callSite = ey_0.d("\u00f3", (Object)((Integer)((Object)ey_0.d("\u00f3", (Object)this.f, (long)254638545693696026L, (long)l))), (long)254788033239299967L, (long)l);
                }
                CallSite callSite3 = callSite;
                try {
                    try {
                        try {
                            object = callSite3;
                            n = -1;
                            if (callSite2 != null) break block14;
                            if (object == n) break block15;
                        }
                        catch (MatchException matchException) {
                            throw ey_0.d("h", (Object)matchException, (long)254701146319773590L, (long)l);
                        }
                        object = ey_0.d("h", (long)ey_0.d("\u00f3", (Object)ey_0.d("\u00f3", (Object)b, (long)253468616046165407L, (long)l), (long)255518938088625917L, (long)l), (int)callSite3, (long)255373669953852927L, (long)l);
                        if (callSite2 != null) return (boolean)object;
                    }
                    catch (MatchException matchException) {
                        throw ey_0.d("h", (Object)matchException, (long)254701146319773590L, (long)l);
                    }
                    n = 1;
                }
                catch (MatchException matchException) {
                    throw ey_0.d("h", (Object)matchException, (long)254701146319773590L, (long)l);
                }
            }
            if (object == n) {
                object = 1;
                return (boolean)object;
            }
        }
        object = 0;
        return (boolean)object;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    /*
     * WARNING - void declaration
     */
    private int a(Object[] objectArray) {
        Object object;
        block9: {
            void var5_4;
            long l = (Long)objectArray[0];
            l = k ^ l;
            CallSite callSite = ey_0.c("j", (int)17736, (long)(0x2FAFDDFB4A26B133L ^ l));
            CallSite callSite2 = ey_0.d("h", (long)4604041024825848164L, (long)l);
            while (var5_4 < ey_0.c("j", (int)3682, (long)(0x65536311D14CFA18L ^ l))) {
                block11: {
                    CallSite callSite3;
                    block8: {
                        CallSite callSite4;
                        block10: {
                            callSite4 = ey_0.d("\u00f3", (Object)ey_0.d("\u00f3", (Object)ey_0.d("g", (Object)b, (long)4605958607152702233L, (long)l), (long)4605067011915226261L, (long)l), (int)var5_4, (long)4604950104007671680L, (long)l);
                            try {
                                try {
                                    callSite3 = callSite4;
                                    if (callSite2 != null) break block8;
                                    object = ey_0.d("\u00f3", (Object)callSite3, (long)4605337093440130561L, (long)l);
                                    if (callSite2 != null) break block9;
                                }
                                catch (MatchException matchException) {
                                    throw ey_0.d("h", (Object)matchException, (long)4605170715961353206L, (long)l);
                                }
                                if (object == 0) break block10;
                                break block11;
                            }
                            catch (MatchException matchException) {
                                throw ey_0.d("h", (Object)matchException, (long)4605170715961353206L, (long)l);
                            }
                        }
                        callSite3 = callSite4;
                    }
                    try {
                        if (ey_0.d("\u00f3", (Object)callSite3, (long)4605761236965172083L, (long)l) == ey_0.d("d", (long)4605416164298618253L, (long)l)) {
                            return (int)var5_4;
                        }
                    }
                    catch (MatchException matchException) {
                        throw ey_0.d("h", (Object)matchException, (long)4605170715961353206L, (long)l);
                    }
                }
                ++var5_4;
                if (callSite2 == null) continue;
            }
            object = -1;
        }
        return object;
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return ey_0.d("h", (Object)((Object)q_0.Cart), (long)-2446569055285804982L, (long)l);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @bP
    public void a(bG bG2) {
        Object object;
        CallSite callSite;
        long l;
        long l2;
        long l3;
        block22: {
            CallSite callSite2;
            reference var15_9;
            block23: {
                CallSite callSite3;
                CallSite callSite4;
                block20: {
                    long l4;
                    block21: {
                        reference v6;
                        block18: {
                            block19: {
                                block16: {
                                    long l5;
                                    block17: {
                                        class_310 class_3102;
                                        long l6;
                                        block15: {
                                            long l7 = l3 = k ^ 0x2CA703DB3C3CL;
                                            l4 = l7 ^ 0x137021F003DFL;
                                            l2 = l7 ^ 0x31C228F745DFL;
                                            l6 = l7 ^ 0x669671B07D4EL;
                                            l5 = l7 ^ 0x287A195E3FBFL;
                                            l = l7 ^ 0x1D875226A85DL;
                                            callSite4 = ey_0.d("h", (long)6504761286374823109L, (long)l3);
                                            try {
                                                try {
                                                    class_3102 = b;
                                                    if (callSite4 != null) break block15;
                                                    if (ey_0.d("g", (Object)class_3102, (long)6506291840440403640L, (long)l3) == null) return;
                                                }
                                                catch (MatchException matchException) {
                                                    throw ey_0.d("h", (Object)matchException, (long)6505873367943087703L, (long)l3);
                                                }
                                                class_3102 = b;
                                            }
                                            catch (MatchException matchException) {
                                                throw ey_0.d("h", (Object)matchException, (long)6505873367943087703L, (long)l3);
                                            }
                                        }
                                        try {
                                            if (ey_0.d("g", (Object)class_3102, (long)6506355989905542070L, (long)l3) == null) {
                                                return;
                                            }
                                        }
                                        catch (MatchException matchException) {
                                            throw ey_0.d("h", (Object)matchException, (long)6505873367943087703L, (long)l3);
                                        }
                                        try {
                                            Object[] objectArray = new Object[2];
                                            objectArray[1] = l6;
                                            objectArray[0] = Float.valueOf((float)ey_0.d("\u00f3", (Object)((Integer)((Object)ey_0.d("\u00f3", (Object)this.d, (long)6505951470173272539L, (long)l3))), (long)6505537974209736382L, (long)l3));
                                            v6 = ey_0.d("\u00f3", (Object)this.e, (Object)objectArray, (long)6506374231923894981L, (long)l3);
                                            if (callSite4 != null) break block16;
                                            if (v6 != false) break block17;
                                            return;
                                        }
                                        catch (MatchException matchException) {
                                            throw ey_0.d("h", (Object)matchException, (long)6505873367943087703L, (long)l3);
                                        }
                                    }
                                    Object[] objectArray = new Object[1];
                                    objectArray[0] = l5;
                                    v6 = ey_0.d("\u00f3", (Object)this, (Object)objectArray, (long)6506096189794877722L, (long)l3);
                                }
                                try {
                                    if (callSite4 != null) break block18;
                                    if (v6 != false) break block19;
                                    return;
                                }
                                catch (MatchException matchException) {
                                    throw ey_0.d("h", (Object)matchException, (long)6505873367943087703L, (long)l3);
                                }
                            }
                            v6 = ey_0.d("\u00f3", (Object)((Integer)((Object)ey_0.d("\u00f3", (Object)this.c, (long)6505951470173272539L, (long)l3))), (long)6505537974209736382L, (long)l3) - 1;
                        }
                        var15_9 = v6;
                        CallSite callSite5 = ey_0.d("\u00f3", (Object)ey_0.d("\u00f3", (Object)ey_0.d("g", (Object)b, (long)6506291840440403640L, (long)l3), (long)6505774062010628404L, (long)l3), (int)var15_9, (long)6505813319079828001L, (long)l3);
                        try {
                            callSite3 = ey_0.d("\u00f3", (Object)callSite5, (long)6505496569530919840L, (long)l3);
                            if (callSite4 != null) break block20;
                            if (callSite3 != false) break block21;
                            return;
                        }
                        catch (MatchException matchException) {
                            throw ey_0.d("h", (Object)matchException, (long)6505873367943087703L, (long)l3);
                        }
                    }
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l4;
                    callSite3 = ey_0.d("\u00f3", (Object)this, (Object)objectArray, (long)6507299517208329935L, (long)l3);
                }
                callSite2 = callSite3;
                try {
                    callSite = callSite2;
                    object = -1;
                    if (callSite4 != null) break block22;
                    if (callSite != object) break block23;
                    return;
                }
                catch (MatchException matchException) {
                    throw ey_0.d("h", (Object)matchException, (long)6505873367943087703L, (long)l3);
                }
            }
            callSite = callSite2;
            object = var15_9;
        }
        Object[] objectArray = new Object[3];
        objectArray[2] = l;
        objectArray[1] = object;
        objectArray[0] = (int)callSite;
        ey_0.d("h", (Object)objectArray, (long)6506514356222231387L, (long)l3);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        ey_0.d("\u00f3", (Object)this.e, (Object)objectArray2, (long)6507152422610890743L, (long)l3);
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (s[n3] != null) {
            return n3;
        }
        Object object = r[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 23;
            case 1 -> 27;
            case 2 -> 37;
            case 3 -> 31;
            case 4 -> 58;
            case 5 -> 15;
            case 6 -> 44;
            case 7 -> 49;
            case 8 -> 39;
            case 9 -> 42;
            case 10 -> 46;
            case 11 -> 9;
            case 12 -> 59;
            case 13 -> 32;
            case 14 -> 0;
            case 15 -> 6;
            case 16 -> 20;
            case 17 -> 53;
            case 18 -> 35;
            case 19 -> 29;
            case 20 -> 5;
            case 21 -> 61;
            case 22 -> 3;
            case 23 -> 36;
            case 24 -> 18;
            case 25 -> 43;
            case 26 -> 33;
            case 27 -> 14;
            case 28 -> 56;
            case 29 -> 52;
            case 30 -> 34;
            case 31 -> 2;
            case 32 -> 57;
            case 33 -> 51;
            case 34 -> 62;
            case 35 -> 26;
            case 36 -> 38;
            case 37 -> 45;
            case 38 -> 4;
            case 39 -> 54;
            case 40 -> 1;
            case 41 -> 40;
            case 42 -> 19;
            case 43 -> 63;
            case 44 -> 22;
            case 45 -> 8;
            case 46 -> 13;
            case 47 -> 41;
            case 48 -> 24;
            case 49 -> 21;
            case 50 -> 60;
            case 51 -> 25;
            case 52 -> 50;
            case 53 -> 10;
            case 54 -> 11;
            case 55 -> 28;
            case 56 -> 7;
            case 57 -> 12;
            case 58 -> 17;
            case 59 -> 55;
            case 60 -> 48;
            case 61 -> 16;
            case 62 -> 47;
            default -> 30;
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
        ey_0.s[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = ey_0.m(l, l2);
        Object object = r[n];
        if (object instanceof String) {
            String string = s[n];
            int n2 = string.indexOf(8);
            Class clazz = ey_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ey_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ey_0.g(clazz3, string2, clazz2)) != null) {
                    ey_0.r[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ey_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ey_0.r[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ey_0.n(1229040249322991L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = ey_0.m(l, l2);
        Object object = r[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = s[n];
                int n3 = string2.indexOf(8);
                clazz3 = ey_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ey_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ey_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        ey_0.r[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ey_0.n(1229040249322991L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ey_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ey_0.r[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ey_0.n(1229040249322991L, 0L);
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

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method g(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private boolean lambda$new$0(Integer n) {
        long l = k ^ 0x2927396B76D0L;
        return (boolean)ey_0.d("\u00f3", (String)((Object)ey_0.d("\u00f3", (Object)this.a, (long)1199591256429949751L, (long)l)), (Object)ey_0.b("k", (int)8942, (long)(0x719ED63764C95654L ^ l)), (long)1198782461699936716L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ey_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ey_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_2() {
        try {
            return MethodHandles.lookup().findStatic(ey_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


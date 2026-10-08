/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1511
 *  net.minecraft.class_1657
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aK;
import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.cz_0;
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
import net.minecraft.class_1511;
import net.minecraft.class_1657;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class f0
implements cz_0 {
    private class_1657 a;
    private long c;
    private static final long d = hc.a(1291763812036986987L, -2882192367588517984L, MethodHandles.lookup().lookupClass()).a(100643700463893L);
    private static final long[] e;
    private static final Long[] f;
    private static final Map g;
    private static final Object[] h;
    private static final String[] i;

    public f0(long l) {
        long l2 = (l = d ^ l) ^ 0x7A666E166B0CL;
        this.a = null;
        this.c = (long)f0.a("j", (int)18478, (long)(0x3F1687FBD9EABE2EL ^ l));
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = this;
        f0.b("F", (Object)f0.b("z", (long)-6769557516865437234L, (long)l), (Object)objectArray, (long)-6769475024151096926L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        h = new Object[46];
        i = new String[46];
        f0.a();
        g = new HashMap(13);
        long l = d ^ 0xE129EDB417EL;
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
        long[] lArray = new long[2];
        int n = 0;
        String string = "M\u00ad\u00d8\u0084\u00e9\u0080R\u00d7jJ\u007f`\u00ac\u00e6\u00d2e";
        int n2 = "M\u00ad\u00d8\u0084\u00e9\u0080R\u00d7jJ\u007f`\u00ac\u00e6\u00d2e".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        e = lArray;
        f = new Long[2];
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (i[n3] != null) {
            return n3;
        }
        Object object = h[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 23;
            case 1 -> 28;
            case 2 -> 21;
            case 3 -> 4;
            case 4 -> 0;
            case 5 -> 38;
            case 6 -> 1;
            case 7 -> 30;
            case 8 -> 8;
            case 9 -> 47;
            case 10 -> 44;
            case 11 -> 29;
            case 12 -> 10;
            case 13 -> 54;
            case 14 -> 14;
            case 15 -> 46;
            case 16 -> 48;
            case 17 -> 40;
            case 18 -> 49;
            case 19 -> 61;
            case 20 -> 36;
            case 21 -> 12;
            case 22 -> 52;
            case 23 -> 32;
            case 24 -> 57;
            case 25 -> 17;
            case 26 -> 20;
            case 27 -> 27;
            case 28 -> 45;
            case 29 -> 22;
            case 30 -> 41;
            case 31 -> 15;
            case 32 -> 33;
            case 33 -> 43;
            case 34 -> 35;
            case 35 -> 60;
            case 36 -> 26;
            case 37 -> 5;
            case 38 -> 53;
            case 39 -> 3;
            case 40 -> 9;
            case 41 -> 50;
            case 42 -> 42;
            case 43 -> 55;
            case 44 -> 25;
            case 45 -> 19;
            case 46 -> 59;
            case 47 -> 51;
            case 48 -> 2;
            case 49 -> 56;
            case 50 -> 62;
            case 51 -> 24;
            case 52 -> 37;
            case 53 -> 11;
            case 54 -> 7;
            case 55 -> 16;
            case 56 -> 39;
            case 57 -> 18;
            case 58 -> 31;
            case 59 -> 34;
            case 60 -> 13;
            case 61 -> 63;
            case 62 -> 6;
            default -> 58;
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
        f0.i[n3] = new String(cArray);
        return n3;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/f0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 't' || c == 'O' || c == 'z' || c == '\u00e3') {
                field = f0.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 't' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'O' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'z' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = f0.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'F' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'k' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = f0.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method h(long l, long l2) {
        int n = f0.e(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = i[n];
                int n3 = string2.indexOf(8);
                clazz3 = f0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = f0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = f0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        f0.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = f0.f(1582422433821290L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = f0.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        f0.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = f0.f(1582422433821290L, 0L);
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
            int n = f0.e(l, l2);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                f0.h[n] = clazz = Class.forName(i[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = f0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = f0.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = f0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = f0.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @bP
    public void a(bG bG2) {
        block14: {
            block16: {
                long l = d ^ 0x68DE7FA5C6C5L;
                CallSite callSite = f0.b("k", (long)-8579616005686320553L, (long)l);
                try {
                    f0 f02;
                    block15: {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                if (this.a == null) break block14;
                                                if (f0.b("t", (Object)b, (long)-8583585286678547319L, (long)l) == null) break block15;
                                            }
                                            catch (MatchException matchException) {
                                                throw f0.b("k", (Object)matchException, (long)-8582914792300300391L, (long)l);
                                            }
                                            f02 = this;
                                            if (callSite != null) break block16;
                                        }
                                        catch (MatchException matchException) {
                                            throw f0.b("k", (Object)matchException, (long)-8582914792300300391L, (long)l);
                                        }
                                        if (f0.b("F", (Object)f02.a, (long)-8583356846717837336L, (long)l) == false) break block15;
                                    }
                                    catch (MatchException matchException) {
                                        throw f0.b("k", (Object)matchException, (long)-8582914792300300391L, (long)l);
                                    }
                                    f02 = this;
                                    if (callSite != null) break block16;
                                }
                                catch (MatchException matchException) {
                                    throw f0.b("k", (Object)matchException, (long)-8582914792300300391L, (long)l);
                                }
                                if (f0.b("F", (Object)f02.a, (Object)f0.b("t", (Object)b, (long)-8583837754927075761L, (long)l), (long)-8583091755697233652L, (long)l) > 15.0f) break block15;
                            }
                            catch (MatchException matchException) {
                                throw f0.b("k", (Object)matchException, (long)-8582914792300300391L, (long)l);
                            }
                            if (f0.b("k", (long)-8582971596666134197L, (long)l) - this.c <= f0.a("j", (int)25494, (long)(0x1A3D596A374E3F75L ^ l))) break block14;
                        }
                        catch (MatchException matchException) {
                            throw f0.b("k", (Object)matchException, (long)-8582914792300300391L, (long)l);
                        }
                    }
                    f02 = this;
                }
                catch (MatchException matchException) {
                    throw f0.b("k", (Object)matchException, (long)-8582914792300300391L, (long)l);
                }
            }
            f02.a = null;
        }
    }

    private static void a() {
        Object[] objectArray = h;
        h[0] = ">}\u0001y\u0012/(}\u0004#\u00018?6\u0007%\r,.q\u00102F>\u0012";
        objectArray[1] = "ViOQr-#ID^cb^QWYj+6";
        objectArray[2] = "\\\u0011`TlF\\\u0011w\b`IFZw\u0016`\\A+%L4\u0018";
        objectArray[3] = "&\fE3Ud&\fRoYk<GRqY~;6\u0003(\u000e<";
        objectArray[4] = "aWkg\u000fqwWn=\u001cf`\u001cm;\u0010rq[z,[bi[x'\u0001/U@x:\u0001hbW";
        objectArray[5] = "a\u001f\u000e&\u0010Lw\u001f\u000b|\u0003[`T\bz\u000fOq\u0013\u001fmDZS";
        objectArray[6] = "\tKX\fH/\u0002DIC57\u0011C@\n";
        objectArray[7] = "-\\\tC\t;X|\u0002L\u0018t9r\tG\u001c.M";
        objectArray[8] = Boolean.TYPE;
        f0.i[8] = "java/lang/Boolean";
        objectArray[9] = "?WmZ\u000264X|\u0015\u007f#&B~V";
        objectArray[10] = Long.TYPE;
        f0.i[10] = "java/lang/Long";
        objectArray[11] = "\u0003R\u0003\b\f1\u0015R\u0006R\u001f&\u0002\u0019\u0005T\u00132\u0013^\u0012CX'W";
        objectArray[12] = "O0e\r[jD?tB8gQ2{)\re@!g\u0005\u001ah";
        objectArray[13] = "JvDQC0\\vA\u000bP'K=B\r\\3ZzU\u001a\u0017\"a";
        objectArray[14] = "q\\\u000b ,f\u0004|\u0000/=)er\u000b$9s\u0011";
        objectArray[15] = Void.TYPE;
        f0.i[15] = "java/lang/Void";
        objectArray[16] = "|\u0014a\u0011\u0014Z|\u0014vM\u0018Uf_vS\u0018@a.&\u000eI";
        objectArray[17] = "g\u00101\u0002<<g\u0010&^03}[&@0&z*r\u0018g";
        objectArray[18] = "<aF1\u000eZ<aQm\u0002U&*Qs\u0002@![\u0004,[";
        objectArray[19] = "\u0010NXX,C\u0010NO\u0004 L\n\u0005O\u001a Y\rt\u001dDx\u001d";
        objectArray[20] = Float.TYPE;
        f0.i[20] = "java/lang/Float";
        objectArray[21] = "\u0010=;\u001clV\u000e5!S\u000bW\u001f.,\t-Q";
        objectArray[22] = "\t\"\u0003SO\u000b\u0002-\u0012\u001c.\u0005\t&\u0016F";
        objectArray[23] = ".\" kjC8\"%1yT/i&7u@>.1 >R\u0001";
        objectArray[24] = "\u0005\u0019N4O[p9E;^\u0014\u00117N0ZNe";
        objectArray[25] = "KbHl\u0013+UjR#q7Rw";
        objectArray[26] = "S2\u00171DF&\u0012\u001c>U\tG\u001c\u00175QS3";
        objectArray[27] = "ma\u0017\f7Lba\u0015WYPmh\u000557Up&\u0005JdMi\"y";
        objectArray[28] = "\u001136 ]J\u0012$eNU)V 7\"D\u0015\u00157dN";
        objectArray[29] = "}$\n\u001966*b\u001e\u0007\u00062) \u0005\u0011j\u0000y`ZI\u0006m.:\u000f\u0017wl;?Uv";
        objectArray[30] = "t8\u0013Ag;'7RB\u0018oNwJ\u0006`5??MP`";
        objectArray[31] = "\u000em~xxxFj(xH`?j*e7lC0$a+\tVjrm,kRr;pH";
        objectArray[32] = "7?*dY{`.,`'o<?*hp8bhr\u0004M\u007f#8#\u007fJm$?";
        objectArray[33] = "\u001d%$q9W\u001bz5qF\u000er$-$9\u0002\u000e~# %g\u001e%|''\\Bx$\u007fF";
        objectArray[34] = "$7d>6R3o\":V\r\"/yf:?vc%<hh/=ag2\f47i{V";
        objectArray[35] = "\u0018  :\u001d&O1&>c2\u0013  64eL}{Z\b8\u000fr$`\u001f`Iv";
        objectArray[36] = "BCF\u0000\u0007\u0017\u0011L\u0007\u0003xFx\u0006\u0006\u001fCICD\u0015\u0001\u0017";
        objectArray[37] = "\b0K\u0016\u0018*\t%NLy4_&v\u0000\u0003:T5-@\u0014\"\r1KC\u0006dYZ";
        objectArray[38] = "D\u0018=$ h\u0006\u000b#p@:\u007f\u00061z?6\u0003\\?~#SB\u00151c?b\u001e_f\u007f@";
        objectArray[39] = ",c-b\u0014\u0017{%9|$\u0013xg\"jH!(+z0$Kgr>r\u0015\u0017-%\"\r";
        objectArray[40] = "8n\u000e\toZ7n\fR\u0001@<l&]q\\U*\u0012Y}_dvX\u000ea ";
        objectArray[41] = "\u000f3>K\u0002\r\u001496Wf\b\u00130<D\u001a\u000e\u0015]+T\bP\u0001'$T\n\u000bo";
        objectArray[42] = "8\u0017M\u0012\u0002\"oQY\f2&l\u0013B\u001a^\u0014<P\u0019L2/aWD\u001c\ts<\u000f\u001c}_\u007f8\u0003]AXzp\u0011\"";
        objectArray[43] = "\u0013_u7\u001b\u001fFY01d\u001f#W\">\u001b\u0013_\r,:\u0007vJWz6\u0000\u0014NO3+d";
        objectArray[44] = "u]<1#b6A/}Cx6_*m%o\u0017D5m\u0006r/A1{C,\"Lab3j$F0\u0000";
        Object[] objectArray2 = objectArray;
        objectArray[45] = "i-\u0002p\u0005\u0004<+Gvz\u0004YtLg@\u0007c4@|\u0005mi4G&\u0010W)8\\cz";
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @bP
    public void a(aK var1_1) {
        block17: {
            block16: {
                v0 = var2_2 = f0.d ^ 56973510088213L;
                var4_3 = v0 ^ 118362839815422L;
                var6_4 = v0 ^ 78079183534514L;
                var9_5 = f0.b("F", (Object)var1_1, (Object)new Object[0], (long)-2868742559407933754L, (long)var2_2);
                var8_6 = f0.b("k", (long)-2864483167941758329L, (long)var2_2);
                try {
                    v1 = var9_5 instanceof class_1657;
                    if (var8_6 != null) break block16;
                    if (v1) {
                    }
                    ** GOTO lbl23
                }
                catch (MatchException v2) {
                    throw f0.b("k", (Object)v2, (long)-2867940329333463223L, (long)var2_2);
                }
                var10_7 = (class_1657)var9_5;
                try {
                    v3 = new Object[2];
                    v3[1] = var4_3;
                    v3[0] = var10_7;
                    f0.b("F", (Object)this, (Object)v3, (long)-2868064511244039666L, (long)var2_2);
                    if (var8_6 == null) break block17;
lbl23:
                    // 2 sources

                    v1 = var9_5 instanceof class_1511;
                }
                catch (MatchException v4) {
                    throw f0.b("k", (Object)v4, (long)-2867940329333463223L, (long)var2_2);
                }
            }
            if (v1) {
                var11_8 = f0.b("F", (Object)f0.b("F", (Object)f0.b("t", (Object)f0.b, (long)-2868615221684984743L, (long)var2_2), (long)-2868549404288707292L, (long)var2_2), (long)-2868193477299841610L, (long)var2_2);
                while (f0.b("F", (Object)var11_8, (long)-2868100277758720913L, (long)var2_2) != false) {
                    block19: {
                        block20: {
                            block18: {
                                var12_9 = (class_1657)f0.b("F", (Object)var11_8, (long)-2864657829021686691L, (long)var2_2);
                                try {
                                    v5 = var12_9;
                                    if (var8_6 != null) break block18;
                                    if (v5 == null) continue;
                                }
                                catch (MatchException v6) {
                                    throw f0.b("k", (Object)v6, (long)-2867940329333463223L, (long)var2_2);
                                }
                                v5 = var12_9;
                            }
                            if (v5 == f0.b("t", (Object)f0.b, (long)-2868707178488955233L, (long)var2_2)) continue;
                            try {
                                try {
                                    v7 = new Object[2];
                                    v7[1] = var6_4;
                                    v7[0] = f0.b("F", (Object)f0.b("F", (Object)var12_9, (long)-2864516195434218592L, (long)var2_2), (long)-2868456503037358796L, (long)var2_2);
                                    v8 = f0.b("F", (Object)f0.b("z", (long)-2868394464313350377L, (long)var2_2), (Object)v7, (long)-2868299203593131699L, (long)var2_2);
                                    if (var8_6 != null) break block19;
                                    if (v8 == false) break block20;
                                }
                                catch (MatchException v9) {
                                    throw f0.b("k", (Object)v9, (long)-2867940329333463223L, (long)var2_2);
                                }
                                if (var8_6 == null) continue;
                            }
                            catch (MatchException v10) {
                                throw f0.b("k", (Object)v10, (long)-2867940329333463223L, (long)var2_2);
                            }
                        }
                        v8 = (cfr_temp_0 = f0.b("F", (Object)var12_9, (Object)var9_5, (long)-2867983126529543716L, (long)var2_2) - 5.0f) == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                    }
                    try {
                        if (v8 <= 0) {
                            v11 = new Object[2];
                            v11[1] = var4_3;
                            v11[0] = var12_9;
                            f0.b("F", (Object)this, (Object)v11, (long)-2868064511244039666L, (long)var2_2);
                        }
                    }
                    catch (MatchException v12) {
                        throw f0.b("k", (Object)v12, (long)-2867940329333463223L, (long)var2_2);
                    }
                    if (var8_6 == null) continue;
                }
            }
        }
    }

    private static long a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = f0.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/f0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x540A;
        if (f[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])g.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/f0", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            f0.f[n2] = l4;
        }
        return f[n2];
    }

    public void a(Object[] objectArray) {
        block4: {
            long l;
            class_1657 class_16572;
            block5: {
                class_16572 = (class_1657)objectArray[0];
                l = (Long)objectArray[1];
                long l2 = (l = d ^ l) ^ 0x4EEECA296361L;
                CallSite callSite = f0.b("k", (long)210620599346145364L, (long)l);
                try {
                    try {
                        if (callSite != null) break block4;
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l2;
                        objectArray2[0] = f0.b("F", (Object)f0.b("F", (Object)class_16572, (long)210605265502658931L, (long)l), (long)207794434406504423L, (long)l);
                        if (f0.b("F", (Object)f0.b("z", (long)207837948936273348L, (long)l), (Object)objectArray2, (long)207949533837882270L, (long)l) == false) break block5;
                    }
                    catch (MatchException matchException) {
                        throw f0.b("k", (Object)matchException, (long)207181641118465434L, (long)l);
                    }
                    return;
                }
                catch (MatchException matchException) {
                    throw f0.b("k", (Object)matchException, (long)207181641118465434L, (long)l);
                }
            }
            this.a = class_16572;
            this.c = (long)f0.b("k", (long)207299912505043784L, (long)l);
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    public class_1657 a(Object[] objectArray) {
        return this.a;
    }

    private static Field g(long l, long l2) {
        int n = f0.e(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = f0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = f0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = f0.c(clazz3, string2, clazz2)) != null) {
                    f0.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = f0.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        f0.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = f0.f(1582422433821290L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(f0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(f0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


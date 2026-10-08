/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_243
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 */
package dev.zprestige.prestige;

import com.mojang.authlib.GameProfile;
import dev.zprestige.prestige.cz_0;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_3959;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class c8
implements cz_0 {
    private static final long a = hc.a(-3187951686264687421L, 4540501363517620033L, MethodHandles.lookup().lookupClass()).a(187608950918289L);
    private static final Object[] c = new Object[40];
    private static final String[] d = new String[40];

    static {
        c8.a();
    }

    private static int e(long l, long l2) {
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
            case 0 -> 22;
            case 1 -> 20;
            case 2 -> 2;
            case 3 -> 8;
            case 4 -> 53;
            case 5 -> 27;
            case 6 -> 54;
            case 7 -> 37;
            case 8 -> 0;
            case 9 -> 61;
            case 10 -> 62;
            case 11 -> 59;
            case 12 -> 4;
            case 13 -> 55;
            case 14 -> 31;
            case 15 -> 21;
            case 16 -> 48;
            case 17 -> 10;
            case 18 -> 3;
            case 19 -> 15;
            case 20 -> 34;
            case 21 -> 9;
            case 22 -> 28;
            case 23 -> 32;
            case 24 -> 51;
            case 25 -> 42;
            case 26 -> 39;
            case 27 -> 29;
            case 28 -> 56;
            case 29 -> 46;
            case 30 -> 43;
            case 31 -> 44;
            case 32 -> 36;
            case 33 -> 60;
            case 34 -> 18;
            case 35 -> 45;
            case 36 -> 30;
            case 37 -> 35;
            case 38 -> 23;
            case 39 -> 47;
            case 40 -> 26;
            case 41 -> 7;
            case 42 -> 5;
            case 43 -> 38;
            case 44 -> 12;
            case 45 -> 50;
            case 46 -> 13;
            case 47 -> 6;
            case 48 -> 33;
            case 49 -> 11;
            case 50 -> 41;
            case 51 -> 49;
            case 52 -> 25;
            case 53 -> 17;
            case 54 -> 14;
            case 55 -> 40;
            case 56 -> 57;
            case 57 -> 63;
            case 58 -> 24;
            case 59 -> 1;
            case 60 -> 52;
            case 61 -> 58;
            case 62 -> 19;
            default -> 16;
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
        c8.d[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'n' || c == '\u00e8' || c == 'w' || c == '\u00dd') {
                field = c8.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'n' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e8' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'w' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = c8.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00dc' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00a5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static boolean b(Object[] objectArray) {
        class_1657 class_16572 = (class_1657)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        return (boolean)c8.a("\u00dc", (Object)class_16572, (long)3917234018112314470L, (long)l);
    }

    public static class_243 b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x2D70C6110C04L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = c8.a("n", (Object)b, (long)-2202960135086569445L, (long)l);
        return c8.a("\u00a5", (Object)objectArray2, (long)-2206649691896095936L, (long)l);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = c8.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static class_243 c(Object[] objectArray) {
        class_1297 class_12972 = (class_1297)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        return new class_243((double)c8.a("n", (Object)class_12972, (long)2298568192951353341L, (long)l), (double)c8.a("n", (Object)class_12972, (long)2299979971568926317L, (long)l), (double)c8.a("n", (Object)class_12972, (long)2298156675963116437L, (long)l));
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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
        int n = c8.e(l, l2);
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
                clazz3 = c8.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = c8.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = c8.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        c8.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = c8.f(1368241697185335L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = c8.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        c8.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = c8.f(1368241697185335L, 0L);
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
            int n = c8.e(l, l2);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                c8.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = c8.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = c8.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = c8.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = c8.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/c8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static String a(Object[] objectArray) {
        GameProfile gameProfile = (GameProfile)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        return c8.a("\u00dc", (Object)gameProfile, (long)-4462319362863087618L, (long)l);
    }

    public static boolean a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x6EDF09055B08L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = c8.a("n", (Object)b, (long)4774244059549477687L, (long)l);
        return (boolean)c8.a("\u00a5", (Object)objectArray2, (long)4777413423428097777L, (long)l);
    }

    public static class_243 a(Object[] objectArray) {
        class_1297 class_12972 = (class_1297)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        return c8.a("\u00dc", (Object)class_12972, (long)-4432076359030660682L, (long)l);
    }

    public static double a(Object[] objectArray) {
        class_1657 class_16572 = (class_1657)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x23C296AB9479L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = class_16572;
        CallSite callSite = c8.a("\u00a5", (Object)objectArray2, (long)8727247624454030141L, (long)l);
        CallSite callSite2 = c8.a("\u00dc", (Object)callSite, (double)0.0, (double)-256.0, (double)0.0, (long)8726965698426216305L, (long)l);
        CallSite callSite3 = c8.a("\u00dc", (Object)c8.a("n", (Object)b, (long)8724344297718917818L, (long)l), (Object)new class_3959((class_243)callSite, (class_243)callSite2, (class_3959.class_3960)c8.a("w", (long)8724049992550577919L, (long)l), (class_3959.class_242)c8.a("w", (long)8724562424141426470L, (long)l), (class_1297)class_16572), (long)8723589445186600651L, (long)l);
        try {
            if (c8.a("\u00dc", (Object)callSite3, (long)8727079871513765103L, (long)l) == c8.a("w", (long)8724500653324064928L, (long)l)) {
                return (double)(c8.a("\u00dc", (Object)class_16572, (long)8727289195163508396L, (long)l) - c8.a("n", (Object)c8.a("\u00dc", (Object)callSite3, (long)8727047249141867551L, (long)l), (long)8726851527410133478L, (long)l));
            }
        }
        catch (MatchException matchException) {
            throw c8.a("\u00a5", (Object)matchException, (long)8724411778631284437L, (long)l);
        }
        return 256.0;
    }

    private static void a() {
        Object[] objectArray = c;
        c[0] = "i<\u0012\u0015\n|`2\u0011\\Ir\u007f'\u0017W\u000eq$\u0014\u001eV\u0002Cx<\u0019R\u000bv";
        objectArray[1] = "\"S0pc\u001b)\\!?\u001e\u0003:[(v";
        objectArray[2] = "cR\u0014oT\u0018cR\u00033X\u0017y\u0019\u0003-X\u0002~hSp\t";
        objectArray[3] = "\u007f>:R.\u000b\u007f>-\u000e\"\u0004eu-\u0010\"\u0011b\u0004yHu";
        objectArray[4] = "r}\u0001-\u0013\u0006d}\u0004w\u0000\u0011s6\u0007q\f\u0005bq\u0010fG\u0015.";
        objectArray[5] = "1\u000fl!\u0017VD/g.\u0006\u0019%!l%\u0002CQ";
        objectArray[6] = "\u0012\u001b7\u000b\u007fY\u0012\u001b WsV\bP IsC\u000f!q\u0011!";
        objectArray[7] = ">x?\u00157j>x(I;e$3(W;p#Bz\tc4";
        objectArray[8] = Double.TYPE;
        c8.d[8] = "java/lang/Double";
        objectArray[9] = "fK-O\u0003\u0012fK:\u0013\u000f\u001d|\u0000:\r\u000f\b{qhW[L";
        objectArray[10] = Boolean.TYPE;
        c8.d[10] = "java/lang/Boolean";
        objectArray[11] = "\u0004W.\u0015XSqw%\u001aI\u001c\u0010y.\u0011MFd";
        objectArray[12] = "Ri+zCmRi<&ObH\"<8OwOSig\u0016";
        objectArray[13] = "3P\u000b\u0005R\u00163P\u001cY^\u0019)\u001b\u001cG^\f.jL\u0012\nF";
        objectArray[14] = "i\u0004\u001dOYdi\u0004\n\u0013UksO\n\rU~t>ZX\u00028";
        objectArray[15] = "al\u0002~\u001a\u0000jc\u00131y\r\u007fn\u001cZL\u000fn}\u0000v[\u0002";
        objectArray[16] = "\"Hw\u0006\u000eC\"H`Z\u0002L8\u0003`D\u0002Y?r1\u001bZ\u000e/Ab[\u0010u~\u00193";
        objectArray[17] = "(`5b\u001cD(`\">\u0010K2+\" \u0010^5ZruD\u0014bf--\u0002^\u00197u~";
        objectArray[18] = "$\u0016.2\nt$\u00169n\u0006{>]9p\u0006n9,i%R$n\u00106}\u0014n\u0015@c*W";
        objectArray[19] = "\u000f\u0000lF:c\u0004\u000f}\t[m\u000f\u0004yS";
        objectArray[20] = "G>-\u0015Ll\u0011>oN0p\u001blvAg B8.-\u000e GxuI@~\u0001~";
        objectArray[21] = "a*b{\u0004\u0004+m/oi]<*rr\u0005ohi-)S8`=jqPA0-tgiQaki,\u000eX+f#\u0015";
        objectArray[22] = "c!PrXe80\u000f:<3;!Tgkdev\f\u000b\u0006>e,\u000etS4#6";
        objectArray[23] = "y\u000fv\u0002Hh)\u0006yQ+c*\u001fy\bGQyZ#_+86\u0011#\u0006Dg;\u001bfo";
        objectArray[24] = "sN$\u0016\u007f+(_{^\u001b}+N \u0003L*t\u0013{o+o:M)Sa(wY";
        objectArray[25] = "La$_s\\H0l\u0003\u0014\\wc&[k\r\u00071-_s5\u001ez3A,ELq7Y\u0014";
        objectArray[26] = "ySf&\u0003Lh\u0017*#>Nr\u0001<wi\u0019(Wb\u001bT\u001f-QewE[aT";
        objectArray[27] = "b\u0003esd!rUoq\u0003thSsfT#2\u0002'\nh'{Gp1xqqE";
        objectArray[28] = "TN)G\u000fGTG4\u0007bS^S/Q5\u0004\u0000\u0003v\fbVO\\1P\u0018VFAq";
        objectArray[29] = "K+i/SU\u001d++t/B\u001bh6pCpI/o'\u001e'J\u007fikBW\u0004k7)/";
        objectArray[30] = ">\u0001\u001c\u0002\u0005%h\u0001^Yy9bSGV.j2\u0000\u0012:Gi>GD^\t7xA";
        objectArray[31] = "}p:\u000e\bj+aoh\f3ubSQ\u0003<v2l\u0001Q(!\u000f";
        objectArray[32] = "P_\u0013)Y\u0002\u0006_Qr%\u001e\f\rH}rNU[\u0012\u0011\u001bNP\u0019KuU\u0010\u0016\u001f";
        objectArray[33] = "\u00051:G)\u001b\u0001`r\u001bN\u001b>e2\u0017$\u000fQ#:Z0r\u00021wZ#\u0002L%)\u0018N";
        objectArray[34] = "2\u00172GZ}b\u001e=\u00149va\u0007=MUD6@f\u0013\t\u00132E`S^w|\u001b&U9";
        objectArray[35] = "(\n\u0013\tnl,[[U\to\u0013^\u001bYcx|\u0018\u0013\u0014w\u0005-\u0010\u0013R`jr\u001d\u0019\u0017\t";
        objectArray[36] = "sp1H\u00196=do\nt(.vjX#\u007ft&74JxrbiP\u0004&4d";
        objectArray[37] = "\u000f\u0001U]{NA\u0015\u000b\u001f\u0016[^\u0016\nFzi\nRQ\u0018\u0016\u0000\rW\u0013FrNS\u0011\u0015!(\u0000\u000e\u0013\rEf^H\u0015j\u001f(\u0003J\r\u000eQvELjVJ)B^\u001a\u0018^w\u00003";
        objectArray[38] = "g\nk\u0002%\u000bn@fH\u001c\tcF6\u001ep;7\u0005iI l2Qi\u0005q\u001c|E7G\u001c";
        Object[] objectArray2 = objectArray;
        objectArray[39] = "G\u0017Y\u0007;&N]TM\u0002$C[\u0004\u001bn\u0016\u0017\u0018[L9AD\u0018ZA?-U\\\u0016D\u0002";
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Field g(long l, long l2) {
        int n = c8.e(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = c8.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = c8.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = c8.c(clazz3, string2, clazz2)) != null) {
                    c8.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = c8.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        c8.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = c8.f(1368241697185335L, 0L);
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
            return MethodHandles.lookup().findStatic(c8.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


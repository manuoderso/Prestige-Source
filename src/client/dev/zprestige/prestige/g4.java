/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1299
 *  net.minecraft.class_1309
 *  net.minecraft.class_1665
 *  net.minecraft.class_1799
 *  net.minecraft.class_1937
 *  net.minecraft.class_243
 *  net.minecraft.class_3965
 *  net.minecraft.class_3966
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
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1309;
import net.minecraft.class_1665;
import net.minecraft.class_1799;
import net.minecraft.class_1937;
import net.minecraft.class_243;
import net.minecraft.class_3965;
import net.minecraft.class_3966;

final class g4
extends class_1665 {
    public boolean a;
    private static final long b = hc.a(-4997883381052347620L, -2010918592361394661L, MethodHandles.lookup().lookupClass()).a(197061907525696L);
    private static final Object[] c = new Object[49];
    private static final String[] d = new String[49];

    public g4(class_1937 class_19372, class_1309 class_13092, class_1799 class_17992, long l) {
        l = b ^ l;
        super((class_1299)g4.a("L", (long)4693965083015244292L, (long)l), class_13092, class_19372, class_17992, class_17992);
    }

    static {
        g4.a();
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = g4.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = g4.b(classArray[i], string, clazz2);
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
            int n = g4.a(l, l2);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                g4.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = g4.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = g4.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = g4.a(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = g4.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = g4.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = g4.a(clazz3, string2, clazz2)) != null) {
                    g4.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = g4.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        g4.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = g4.b(1142888884030464L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = g4.a(l, l2);
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
                clazz3 = g4.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = g4.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = g4.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        g4.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = g4.b(1142888884030464L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = g4.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        g4.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = g4.b(1142888884030464L, 0L);
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/g4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = g4.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'C' || c == '\u00de' || c == 'L' || c == 'Y') {
                field = g4.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'C' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00de' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'L' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = g4.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'J' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'r' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
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
            case 0 -> 22;
            case 1 -> 61;
            case 2 -> 59;
            case 3 -> 26;
            case 4 -> 50;
            case 5 -> 4;
            case 6 -> 32;
            case 7 -> 31;
            case 8 -> 29;
            case 9 -> 63;
            case 10 -> 40;
            case 11 -> 11;
            case 12 -> 10;
            case 13 -> 57;
            case 14 -> 46;
            case 15 -> 49;
            case 16 -> 23;
            case 17 -> 62;
            case 18 -> 9;
            case 19 -> 53;
            case 20 -> 15;
            case 21 -> 55;
            case 22 -> 16;
            case 23 -> 30;
            case 24 -> 60;
            case 25 -> 44;
            case 26 -> 35;
            case 27 -> 5;
            case 28 -> 14;
            case 29 -> 28;
            case 30 -> 33;
            case 31 -> 21;
            case 32 -> 54;
            case 33 -> 56;
            case 34 -> 39;
            case 35 -> 20;
            case 36 -> 1;
            case 37 -> 12;
            case 38 -> 24;
            case 39 -> 0;
            case 40 -> 47;
            case 41 -> 3;
            case 42 -> 25;
            case 43 -> 51;
            case 44 -> 45;
            case 45 -> 52;
            case 46 -> 2;
            case 47 -> 42;
            case 48 -> 37;
            case 49 -> 13;
            case 50 -> 19;
            case 51 -> 27;
            case 52 -> 58;
            case 53 -> 17;
            case 54 -> 34;
            case 55 -> 43;
            case 56 -> 38;
            case 57 -> 6;
            case 58 -> 7;
            case 59 -> 41;
            case 60 -> 18;
            case 61 -> 48;
            case 62 -> 36;
            default -> 8;
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
        g4.d[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = c;
        c[0] = "FM'TGVPM\"\u000eTAG\u0006!\bXUVA6\u001f\u0013A\u0016";
        objectArray[1] = "7ai'-77a~{!8-*~e!-*[,;yi";
        objectArray[2] = Boolean.TYPE;
        g4.d[2] = "java/lang/Boolean";
        objectArray[3] = "UIm[\u001fcUIz\u0007\u0013lO\u0002z\u0019\u0013yHs+AA";
        objectArray[4] = Double.TYPE;
        g4.d[4] = "java/lang/Double";
        objectArray[5] = Float.TYPE;
        g4.d[5] = "java/lang/Float";
        objectArray[6] = Void.TYPE;
        g4.d[6] = "java/lang/Void";
        objectArray[7] = "'n^$\u0013V'nIx\u001fY=%If\u001fL:T\u0019?M\r";
        objectArray[8] = "^4\u001cy\u0015)H4\u0019#\u0006>_\u007f\u001a%\n*N8\r2A8r";
        objectArray[9] = "!z@\r\u0012\u0006TZK\u0002\u0003I)BX\u0005\n\u0000A";
        objectArray[10] = "jwB@I\"jwU\u001cE-p<U\u0002E8wM\u0004]\u001dog~W\u001dW\u00146&\u0006";
        objectArray[11] = "\u001f\u0005\u001a8T9\u0014\n\u000bw74\u0001\u0007\u0004\u001c\u00026\u0010\u0014\u00180\u0015;";
        objectArray[12] = "`\\_\"@Q`\\H~L^z\u0017H`LK}f\u0019?\u0014";
        objectArray[13] = "L\u007f\u0005@\f,L\u007f\u0012\u001c\u0000#V4\u0012\u0002\u00006QE@XVp";
        objectArray[14] = "\u0018\u0000u\u0012\"L\u0006\bo]jL\u001c\u0002w\u001acW\\1q\u0016hP\u0011\u0000w\u0016";
        objectArray[15] = "&O'} \u0006&O0!,\t<\u00040?,\u001c;ubatV";
        objectArray[16] = ">\u007f#RP\n5p2\u001d1\u0004>{6G";
        objectArray[17] = "ysB?N|z{_>!r.?AhM@z{\u001b6!,x$Fj\u0011f#:\u0018\u000f\u001b' sNd\u0018/=r!";
        objectArray[18] = "E%J/h\"\u0007{\u0014~TqxxRy%z\t8\u0015ne\u001b";
        objectArray[19] = "X\u0006YCZ}\u0016\u0012\u001aD3q\u0007\u0019DBd&]O\u001b.\rm\u001f\u0019ILCy\\\u001e";
        objectArray[20] = "p;GA\u0011q `\u0016{D 0jL\u0017vww1\u0012K!vwmL\u001e\u0011<,s\u0012{";
        objectArray[21] = ".}&\u0003DE~&w9\u0011\u0014n,-U#@\"|r\u0001tB)+-\\D\br5s9OBu+/\t\u0005\u0019kuJ\u0002O\u001eu)zH\u0014\u0000+Lv\u0006\u0005\u0006l= \u0006\u0005\u0005\u0012";
        objectArray[22] = "+Pc\u001cw\u0014{\u000b2&\"Ek\u0001hJ\u0010\u0011'^>\u0017G\u0012'\u0002?I,\u0011/\u001f>&{\u0017f\u001eqW-\u0017f\u001d\u000f";
        objectArray[23] = "]be9G\u0004\r94\u0003\u0019Y\f7eTI\u0000Yo\t?J\u0003\u0011(9<OR\u0003";
        objectArray[24] = "X\u0001\\!jy\bZ\r\u001b?(\u0018PWw\r\u007fZ\u0001\u000e!Zy[AOe+/[AL\u001b";
        objectArray[25] = "\nNYo|yDOL7\u0015yV^F4yK\u0007\u0013\u0017b*\u001c\u0002I\u00179x%\u000bDLh\u0015-CZ\u00195*u^\u0019TS%aQ\\Z<g}WO&";
        objectArray[26] = "cy)2]R=3+\u007f/X3>)$Cjg\u007fr\u007f\u001e=ey.$J\r/\"0z/\u0006e%.&\u001fL>;pC\u0014\u00069%,s^]'{I";
        objectArray[27] = "l\t![KAo\u0001<Z$D7T&\u0007s\u0013m\u0004{k\u001f\u00111^'[UJ/\u0000";
        objectArray[28] = "v5k\u0016\r\u001e&n:,XO6d`@j\u0019t8:\u0010=\u001ew?wW\r\u001drne,";
        objectArray[29] = "r\u001ej\u000f\u0013!q\u0016w\u000e|/%RiX\u0010\u001ds\u00113\u0001CJs\u0015nX\u0019z9Np\u0006|";
        objectArray[30] = "8aF\u001c\u007f6h:\u0017&*gx0MJ\u00181:l\u0017\u0018O69kZ]\u007f5<:H&s5u/TW%5u,*";
        objectArray[31] = "#qe\u007fY.s*4E\u0000\u0012 :8$P(n;kyi-eqh|Scd\"5E";
        objectArray[32] = "nY gg(>\u0002q]2y.\b+1\u0000+nX|]gi8\u001602%u>\u0005Lahe-\u0016=7he.h";
        objectArray[33] = "^TDw_\u0010]\\Yv0\u0015\u0005\tC+gB_Y\u001fG\u000b@\u0003\u0003BwA\u001b\u001d]";
        objectArray[34] = "Y\u007f7\u0012I,\t$f(\u001c}\u0019.<D.)Uqj\u0018y*U-kG\u0012)]0j(";
        objectArray[35] = "\u0000R\u000eZ\u0012,P\t_`G}@\u0003\u0005\fu*\u0002R_P\")WR\b\r\u001b Z\tY`\u001bt_\n\u0013^R*Z\u0013b";
        objectArray[36] = "\u0006yt3^'V\"%\t\u000bvF(\u007fe9&\u0005y)\tW\u007fY!i7\u001e!\\8\u0018";
        objectArray[37] = "8@K;7@h\u001b\u001a\u0001b\u0011x\u0011@mPG:M\u001a<\u0007@9JWz7C<\u001bE\u0001";
        objectArray[38] = "7o/IN^g4~s\u001b\u000fw>$\u001f)X0eyJ~Y09$\u0016N\u0013k'zs";
        objectArray[39] = "e6uOrB5m$u'\u0013%g~\u0019\u0015Ci>%uyE>`|E3\u001e >\u0019Ny\u0019>b)\u0004\"\u0007`\u0007\"N%\u0019<7h\u0015;GY;&\u0004=\u0000(m&\u0004>~";
        objectArray[40] = "HiLi\u000f \u00182\u001dSZq\b8G?h!Kd\u0018S\u0006x\u00171QmO&\u0012( ";
        objectArray[41] = "]~@\u007fE\u001d\r%\u0011E\u001b@\f+@\u0012H\u0010Qu,yH\u001a\u00114\u001czMK\u0003";
        objectArray[42] = "\u007feg\r\u0005f|mz\fjh()dZ\u0006Z|m>\fj7u64R\u00014}+5=";
        objectArray[43] = "$E\u0010q\u0019gt\u001eAKL6d\u0014\u001b'~e!HDz)g'\u0005\u00035X1'\u0005\u0000K";
        objectArray[44] = "b5\t_q5 )\u000fL\r??4\u0003Fa\rkw\\\u00116Zl:\u001aLd8\".YK\r";
        objectArray[45] = "i i{FIj{j\"\"\u0019a*q.uI9}/BK\u0010|~q|HK\u007f'";
        objectArray[46] = "\u0019*_YC]\u001a\"BX,XBwX\u0005{\u000f\u0018'\u0006i\u0017\rD}YY]VZ#";
        objectArray[47] = "-r\u001f=(^})N\u0007}\u000fm#\u0014kOY/\u007fN8\u0018^,x\u0003|(]))\u0011\u0007$]`<\rvr]`?s";
        Object[] objectArray2 = objectArray;
        objectArray[48] = "\u0019GqS\u0011{I\u001c iD*Y\u0016z\u0005v}\u001eM$V!|\u001e\u0011z\f\u00116E\u000f$i";
    }

    public void method_5773() {
        g4 g42;
        reference var10_7;
        reference var8_6;
        reference var6_5;
        long l;
        block10: {
            block11: {
                float f;
                CallSite callSite;
                block8: {
                    block9: {
                        l = b ^ 0x49FD753CB50L;
                        CallSite callSite2 = g4.a("r", (Object)((Object)this), arg_0 -> g4.lambda$tick$0(this, arg_0), (long)-7099067438014402385L, (long)l);
                        callSite = g4.a("r", (long)-7099365547062797891L, (long)l);
                        try {
                            try {
                                if (callSite != null) break block8;
                                if (g4.a("J", (Object)callSite2, (long)-7100387991201850965L, (long)l) == g4.a("L", (long)-7099444482389626170L, (long)l)) break block9;
                            }
                            catch (MatchException matchException) {
                                throw g4.a("r", (Object)matchException, (long)-7099187307701579607L, (long)l);
                            }
                            g4.a("J", (Object)((Object)this), (Object)callSite2, (long)-7100658903787839815L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw g4.a("r", (Object)matchException, (long)-7099187307701579607L, (long)l);
                        }
                    }
                    g4.a("J", (Object)((Object)this), (long)-7100014990785511804L, (long)l);
                }
                CallSite callSite3 = g4.a("J", (Object)((Object)this), (long)-7100552705591193278L, (long)l);
                var6_5 = g4.a("J", (Object)((Object)this), (long)-7101812561685107087L, (long)l) + g4.a("C", (Object)callSite3, (long)-7100238457872009588L, (long)l);
                var8_6 = g4.a("J", (Object)((Object)this), (long)-7099811377287826032L, (long)l) + g4.a("C", (Object)callSite3, (long)-7098922039360211280L, (long)l);
                var10_7 = g4.a("J", (Object)((Object)this), (long)-7100799270548628738L, (long)l) + g4.a("C", (Object)callSite3, (long)-7100711919949860375L, (long)l);
                try {
                    g4.a("J", (Object)((Object)this), (long)-7098956525054681981L, (long)l);
                    f = g4.a("J", (Object)((Object)this), (long)-7100919529209440452L, (long)l) != false ? 0.8f : 0.99f;
                }
                catch (MatchException matchException) {
                    throw g4.a("r", (Object)matchException, (long)-7099187307701579607L, (long)l);
                }
                float f10 = f;
                try {
                    g4.a("J", (Object)((Object)this), (Object)g4.a("J", (Object)callSite3, (double)f10, (long)-7099586920579431863L, (long)l), (long)-7099686120556646191L, (long)l);
                    g42 = this;
                    if (callSite != null) break block10;
                    if (g4.a("J", (Object)((Object)g42), (long)-7100109200452599579L, (long)l) != false) break block11;
                }
                catch (MatchException matchException) {
                    throw g4.a("r", (Object)matchException, (long)-7099187307701579607L, (long)l);
                }
                CallSite callSite4 = g4.a("J", (Object)((Object)this), (long)-7100552705591193278L, (long)l);
                g4.a("J", (Object)((Object)this), (double)g4.a("C", (Object)callSite4, (long)-7100238457872009588L, (long)l), (double)(g4.a("C", (Object)callSite4, (long)-7098922039360211280L, (long)l) - 0.03), (double)g4.a("C", (Object)callSite4, (long)-7100711919949860375L, (long)l), (long)-7099873163105353392L, (long)l);
            }
            g42 = this;
        }
        g4.a("J", (Object)((Object)g42), (double)var6_5, (double)var8_6, (double)var10_7, (long)-7100906490799869972L, (long)l);
    }

    protected void method_7454(class_3966 class_39662) {
        this.a = 1;
    }

    protected class_1799 method_57314() {
        return null;
    }

    protected class_1799 method_7445() {
        return null;
    }

    protected void method_24920(class_3965 class_39652) {
        this.a = 1;
    }

    public void method_7485(double d, double d10, double d11, float f, float f10) {
        long l = b ^ 0x58929AB31C3FL;
        CallSite callSite = g4.a("J", (Object)g4.a("J", (Object)new class_243(d, d10, d11), (long)5339204520594421781L, (long)l), (double)f, (long)5338576741163750694L, (long)l);
        g4.a("J", (Object)((Object)this), (Object)callSite, (long)5338882236472354750L, (long)l);
        g4.a("J", (Object)((Object)this), (float)((float)(g4.a("r", (double)g4.a("C", (Object)callSite, (long)5339508498698363363L, (long)l), (double)g4.a("C", (Object)callSite, (long)5339694846571538054L, (long)l), (long)5338067773948125296L, (long)l) * 57.2957763671875)), (long)5338355744744273828L, (long)l);
        g4.a("J", (Object)((Object)this), (float)((float)(g4.a("r", (double)g4.a("C", (Object)callSite, (long)5338115797877187039L, (long)l), (double)g4.a("J", (Object)callSite, (long)5338303921050196604L, (long)l), (long)5338067773948125296L, (long)l) * 57.2957763671875)), (long)5339572894831264227L, (long)l);
        g4.a("\u00de", (Object)((Object)this), (float)g4.a("J", (Object)((Object)this), (long)5338241299058698791L, (long)l), (long)5339111351673395189L, (long)l);
        g4.a("\u00de", (Object)((Object)this), (float)g4.a("J", (Object)((Object)this), (long)5339959557973722735L, (long)l), (long)5338973319015910447L, (long)l);
    }

    private static boolean lambda$tick$0(g4 g42, class_1297 class_12972) {
        long l = b ^ 0x36446190C24FL;
        return (boolean)g4.a("J", (Object)((Object)g42), (Object)class_12972, (long)-7752189288229472559L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(g4.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


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

final class g3
extends class_1665 {
    public boolean a;
    private static final long b = hc.a(-2147227930560893005L, 9042713215132600935L, MethodHandles.lookup().lookupClass()).a(220089866874965L);
    private static final Object[] c = new Object[54];
    private static final String[] d = new String[54];

    public g3(class_1937 class_19372, class_1309 class_13092, class_1799 class_17992, long l) {
        l = b ^ l;
        super((class_1299)g3.a("x", (long)160146893310327664L, (long)l), class_13092, class_19372, class_17992, class_17992);
    }

    static {
        g3.a();
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = g3.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = g3.b(classArray[i], string, clazz2);
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
            int n = g3.a(l, l2);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                g3.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = g3.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = g3.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = g3.a(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = g3.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = g3.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = g3.a(clazz3, string2, clazz2)) != null) {
                    g3.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = g3.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        g3.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = g3.b(1278835489404021L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = g3.a(l, l2);
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
                clazz3 = g3.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = g3.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = g3.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        g3.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = g3.b(1278835489404021L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = g3.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        g3.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = g3.b(1278835489404021L, 0L);
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
            throw new RuntimeException("dev/zprestige/prestige/g3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = g3.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'o' || c == '\u00de' || c == 'x' || c == 's') {
                field = g3.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'o' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00de' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'x' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = g3.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'X' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
            case 0 -> 0;
            case 1 -> 58;
            case 2 -> 31;
            case 3 -> 9;
            case 4 -> 48;
            case 5 -> 2;
            case 6 -> 16;
            case 7 -> 61;
            case 8 -> 1;
            case 9 -> 35;
            case 10 -> 54;
            case 11 -> 33;
            case 12 -> 36;
            case 13 -> 20;
            case 14 -> 34;
            case 15 -> 51;
            case 16 -> 19;
            case 17 -> 12;
            case 18 -> 6;
            case 19 -> 52;
            case 20 -> 46;
            case 21 -> 40;
            case 22 -> 5;
            case 23 -> 29;
            case 24 -> 47;
            case 25 -> 32;
            case 26 -> 25;
            case 27 -> 55;
            case 28 -> 8;
            case 29 -> 30;
            case 30 -> 14;
            case 31 -> 53;
            case 32 -> 62;
            case 33 -> 42;
            case 34 -> 10;
            case 35 -> 60;
            case 36 -> 23;
            case 37 -> 39;
            case 38 -> 38;
            case 39 -> 11;
            case 40 -> 26;
            case 41 -> 7;
            case 42 -> 18;
            case 43 -> 4;
            case 44 -> 63;
            case 45 -> 28;
            case 46 -> 13;
            case 47 -> 45;
            case 48 -> 59;
            case 49 -> 27;
            case 50 -> 21;
            case 51 -> 17;
            case 52 -> 43;
            case 53 -> 56;
            case 54 -> 3;
            case 55 -> 44;
            case 56 -> 57;
            case 57 -> 49;
            case 58 -> 24;
            case 59 -> 50;
            case 60 -> 15;
            case 61 -> 37;
            case 62 -> 22;
            default -> 41;
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
        g3.d[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = c;
        c[0] = "uI5\nz\tuI\"Vv\u0006o\u0002\"Hv\u0013hsr\u001d!V";
        objectArray[1] = "ETb\n?\u0003ETuV3\f_\u001fuH3\u0019Xn$\u0010a";
        objectArray[2] = "~X\u001c\u0013.MhX\u0019I=Z\u007f\u0013\u001aO1NnT\rXzZ)";
        objectArray[3] = Void.TYPE;
        g3.d[3] = "java/lang/Void";
        objectArray[4] = "\u0019)<Rin\u0019)+\u000eea\u0003b+\u0010et\u0004\u0013yN=0";
        objectArray[5] = Boolean.TYPE;
        g3.d[5] = "java/lang/Boolean";
        objectArray[6] = Double.TYPE;
        g3.d[6] = "java/lang/Double";
        objectArray[7] = "U=U\u001et\u0018^2DQ\u0017\u0015K?K:\"\u0017Z,W\u00165\u001a";
        objectArray[8] = "V\u00194\u000b&<@\u00191Q5+WR2W9?F\u0015%@r-z";
        objectArray[9] = "\u007fd^1Tk\nDU>E$w\\F9Lm\u001f";
        objectArray[10] = "&.8S'a&./\u000f+n<e/\u0011+{;\u0014~Ns,+'-\u000e9Wz\u007f|";
        objectArray[11] = "wgW[!!wg@\u0007-.m,@\u0019-;j]\u0011Fu";
        objectArray[12] = ";z\u0002uP\u0007;z\u0015)\\\b!1\u00157\\\u001d&@Gm\n[";
        objectArray[13] = "w* r}ri\":=5rs(\"z<i3\u001b$v7n~*\"v";
        objectArray[14] = Float.TYPE;
        g3.d[14] = "java/lang/Float";
        objectArray[15] = "q1\u001b/\"\u000eq1\fs.\u0001kz\fm.\u0014l\u000b\\4|U";
        objectArray[16] = "U\u001bd\u000b`dU\u001bsWlkOPsIl~H!!\u001744";
        objectArray[17] = ";f\u0007cD\u001c;f\u0010?H\u0013!-\u0010!H\u0006&\\@t\u001f@";
        objectArray[18] = "3\u0016X^p\u00078\u0019I\u0011\u0011\t3\u0012MK";
        objectArray[19] = "\u001d\u0016(Pr\"FGe\u0007B)JPu^.\u001b\u001e\u001c*\bsLVReF>vBHo9x4U\u001dk\u0003! DV\u0015";
        objectArray[20] = "\u001d\u0019k),v\t\u0003aV5!\u0010\u0007|:\u0007uT]\"Vl,\u0007Zy-<'Q\u001e\u001b'.<\u0013\u001b!346l";
        objectArray[21] = "\u001d.4\u000b|0F\u007fy\\L;Jhi\u0005 \t\u001e$9Zt^\u001btb_.%K\u007f4\u001bLbG\u007f4\u000072L)pbp>L)k\u0019 5\u001am\tX4,\u0016j3\u0001 =]\u0014";
        objectArray[22] = " P^\fQB{\u0001\u0013[aE\u001aV\u001c^\rG'\u000f\u0004\u0007Z,&\u0015X\t\n\u0011\u007f\r\u0001^a";
        objectArray[23] = "wXMga\u00112_U#\u0011\u0011J\u0001Z4n\u0007.\u0006B-|{";
        objectArray[24] = "z4mT]\u007f\u007fd=R#($c4Et\u007f~5k)\u001c|xs.\u0010\u0019,(u";
        objectArray[25] = "mwF~e\u000f6&\u000b)U\u000f6 \u001f{\u0002_ouG\u0017<\\%-\u001b('\u0004n=";
        objectArray[26] = "\u0010\u001a4BJKKKy\u0015z@G\\iL\u0016r\u0010\u001b2\u0012J%\u0016@b\u0016\u0018^FK4Rz";
        objectArray[27] = "_{T@\u001d|\u0004*\u0019\u0017-w\b=\tNAE^\u007fU\u0014\u0011\u0012\f|\u001bIM-\u0017$PY-";
        objectArray[28] = "\u0012qdF\u0010\u0016I )\u0011 \u001dE79HL/\u0013ue\u0012\u001exAv+O@GZ.`_ BP9hQ\u001a\u001bD(#/";
        objectArray[29] = "*\r=K0\u0005%\u0018?\u0003\u000bPw\u001a1\u0015gb&W`C45 \u00171\rhX#\u001f>\u0014\u000b\u0004 \ri\u000f:Sk\u0004nr4Iu[n\u0000pRd\u0000Q";
        objectArray[30] = "xMzS\u0014y|Y8M%n|W\"XI\\(\u0016y\u0003\u0014\u000b-K)\u0002Gp}@\u007fF%7q@\u007f]^gz\u0016;?\u0019kz\u0016 DI`,RB";
        objectArray[31] = "\u000bu(\u0000T&\u001fo\"\u007fF}\u0017o4(\u0011'G2XCHwGi#\u0013C!\u0003";
        objectArray[32] = "v2];\f*b(WD\u0015}{,J('+8v\u0013{p,g'\u0010&\u000b|lqTD";
        objectArray[33] = "=!_)l5%=Ca\u0002h:\"BvnZna\u001d!>\r& Rn~72:X\u0011";
        objectArray[34] = "\u0003Y\u0016A\u001c\u0018X\b[\u0016,\u0013T\u001fKO@!\u0003]\u001a\u0016\u0016v\u0003\u001bY\u0019RLZ\u000fHR,";
        objectArray[35] = "C\u0017u\u0004Ws\u0018F8Sgx\u0014Q(\n\u000bJD\u001dqQg!\u0019Fu\u000f\u001cq\u0012\u00101m[}\u0012\u0010*\u0016\u000bvDTHQ\u0007vDO3\u0001\f \u0000-r\u0015\u0015,\u0007\u0017+\u0001\u0004gy";
        objectArray[36] = "\u00149h\\OaOh%\u000b\u007fjC\u007f5R\u0013X\u00148n\u000fF\u000f\u0012c>\b\u001dtBhhL\u007f";
        objectArray[37] = "t+4VY\u000b/zy\u0001i\u0000#miX\u00052u/5\u0002Te',{_\tZ<t0Oi";
        objectArray[38] = "\u001f\u0013\u001d\u0011,4DBPF\u001c?HU@\u001fp\r\u001f\u0017\u0011E,Z\u001fX@\u0007\u007f7\u001cPO\u001e\u001ca[JR@$cCE\u001fx";
        objectArray[39] = "\u000e8\u001a |3UiWwL8Y~G. \n\t=\u0016xLfJaUqtdRn\u0018I";
        objectArray[40] = "O^fqP-\u0014\u000f+&`&\u0018\u0018;\u007f\f\u0014LTd)PC\u0004\u001a+g\u001cy\u0010\u0000!\u0018";
        objectArray[41] = "BNL\u000bA2\u0019\u001f\u0001\\q2\u0019\u0019\u0015\u000e&aIDKb\u0018a\n\u0014\u0011]\u00039A\u0004";
        objectArray[42] = "r(@\u001b\bd)y\rL8o%n\u001d\u0015T]u-AJ816q\u000fJ\u00003.~Br";
        objectArray[43] = "$k\r51y0q\u0007J#\"8q\u0011\u001dtxh-}v-(hw\u0006&&~,";
        objectArray[44] = "V6\r\u001dQCL4\u0000|\bPI+\u0004\u0010:\u0004\ntS@mLK;\u001c\u0000WXQ1c";
        objectArray[45] = "\u000b@=Wf\u000bP\u0011p\u0000V\u0000\\\u0006`Y:2\u000eF0\u000eVZM\u0015=\u0001$\u001eV\u0004f>l\u001dCK~\u00045\tR\u0000\u0000";
        objectArray[46] = "(h(c>\u0018<r\"\u001c'O%v?p\u0015\u001ba,i\u001c3\\)i$&'F#\u0016";
        objectArray[47] = "m\u0015!\u0019u\u00136DlNE\u0018:S|\u0017)*l\u0011 Mz}>\u0012n\u0010%B%J%\u0000EG/]-\u000e\u007f\u001e;Lfp";
        objectArray[48] = "k\"dW#g0s)\u0000\u0013l<d9Y\u007f^k#b\u0007,\tmx2\u0003qr=sdG\u0013";
        objectArray[49] = "\u001cR\nxn\u0004G\u0003G/^\u000fK\u0014Wv2=\u0018Q\u000b)oj\u001c\u0010E  PE\u0004Tk^";
        objectArray[50] = "\u00015{U)\\E.j\u000e\u0016KS5t\u000fzy\u0007v+X-.\u0001s)\u0015h\u0017\u0004#y\u0013\u0016";
        objectArray[51] = "4\u0003@5}-=_P'A}?\nH2\u0016-g]\u0016^+w2\f\u0010`\"+\"\u001e";
        objectArray[52] = "UWN<~#AMDClxIMR\u0014;\"\u0019\u0013>\u007fbr\u0019KE/i$]";
        Object[] objectArray2 = objectArray;
        objectArray[53] = "X\u0002Y#d\u0002\u0003S\u0014tT\t\u000fD\u0004-8;Y\u0003Yuhl\u0013F\u00145(V\u0007\\\u001eJn\u0014\u0010\t\u001ap7\u0000\u0001Bd";
    }

    public void method_5773() {
        g3 g32;
        reference var10_7;
        reference var8_6;
        reference var6_5;
        long l;
        block16: {
            block17: {
                float f;
                g3 g33;
                CallSite callSite;
                block14: {
                    block15: {
                        block12: {
                            block13: {
                                l = b ^ 0x188B406A61BFL;
                                CallSite callSite2 = g3.a("\u00f4", (Object)((Object)this), arg_0 -> g3.lambda$tick$0(this, arg_0), (long)1996296319613995880L, (long)l);
                                callSite = g3.a("\u00f4", (long)1997060359900236987L, (long)l);
                                try {
                                    try {
                                        if (callSite != null) break block12;
                                        if (g3.a("X", (Object)callSite2, (long)1999495981272973582L, (long)l) == g3.a("x", (long)1996539971597596237L, (long)l)) break block13;
                                    }
                                    catch (MatchException matchException) {
                                        throw g3.a("\u00f4", (Object)matchException, (long)1996987491526697501L, (long)l);
                                    }
                                    g3.a("X", (Object)((Object)this), (Object)callSite2, (long)1997459016266193062L, (long)l);
                                    return;
                                }
                                catch (MatchException matchException) {
                                    throw g3.a("\u00f4", (Object)matchException, (long)1996987491526697501L, (long)l);
                                }
                            }
                            g3.a("X", (Object)((Object)this), (long)1999455832858058405L, (long)l);
                        }
                        try {
                            try {
                                g33 = this;
                                if (callSite != null) break block14;
                                if (!g33.a) break block15;
                            }
                            catch (MatchException matchException) {
                                throw g3.a("\u00f4", (Object)matchException, (long)1996987491526697501L, (long)l);
                            }
                            return;
                        }
                        catch (MatchException matchException) {
                            throw g3.a("\u00f4", (Object)matchException, (long)1996987491526697501L, (long)l);
                        }
                    }
                    g33 = this;
                }
                CallSite callSite3 = g3.a("X", (Object)((Object)g33), (long)1997660470221823839L, (long)l);
                var6_5 = g3.a("X", (Object)((Object)this), (long)1999360417407374640L, (long)l) + g3.a("o", (Object)callSite3, (long)1999047490644364672L, (long)l);
                var8_6 = g3.a("X", (Object)((Object)this), (long)1996647804760153338L, (long)l) + g3.a("o", (Object)callSite3, (long)1996481802867178995L, (long)l);
                var10_7 = g3.a("X", (Object)((Object)this), (long)1997948823134947332L, (long)l) + g3.a("o", (Object)callSite3, (long)1997845037101936323L, (long)l);
                try {
                    g3.a("X", (Object)((Object)this), (long)1998341055982748472L, (long)l);
                    f = g3.a("X", (Object)((Object)this), (long)1998186342226376537L, (long)l) != false ? 0.8f : 0.99f;
                }
                catch (MatchException matchException) {
                    throw g3.a("\u00f4", (Object)matchException, (long)1996987491526697501L, (long)l);
                }
                float f10 = f;
                try {
                    g3.a("X", (Object)((Object)this), (Object)g3.a("X", (Object)callSite3, (double)f10, (long)1996830532924518375L, (long)l), (long)1997336806444902764L, (long)l);
                    g32 = this;
                    if (callSite != null) break block16;
                    if (g3.a("X", (Object)((Object)g32), (long)1997776956518612397L, (long)l) != false) break block17;
                }
                catch (MatchException matchException) {
                    throw g3.a("\u00f4", (Object)matchException, (long)1996987491526697501L, (long)l);
                }
                CallSite callSite4 = g3.a("X", (Object)((Object)this), (long)1997660470221823839L, (long)l);
                g3.a("X", (Object)((Object)this), (double)g3.a("o", (Object)callSite4, (long)1999047490644364672L, (long)l), (double)(g3.a("o", (Object)callSite4, (long)1996481802867178995L, (long)l) - 0.03), (double)g3.a("o", (Object)callSite4, (long)1997845037101936323L, (long)l), (long)1996892892333023927L, (long)l);
            }
            g32 = this;
        }
        g3.a("X", (Object)((Object)g32), (double)var6_5, (double)var8_6, (double)var10_7, (long)1998454793001832163L, (long)l);
    }

    protected void method_7454(class_3966 class_39662) {
        long l = b ^ 0x1AB6B074E3A4L;
        this.a = 1;
        g3.a("X", (Object)((Object)this), (Object)g3.a("X", (Object)class_39662, (long)-7376009242810635745L, (long)l), (long)-7375401204131147471L, (long)l);
    }

    protected class_1799 method_57314() {
        return null;
    }

    protected class_1799 method_7445() {
        return null;
    }

    protected void method_24920(class_3965 class_39652) {
        long l = b ^ 0x71403EE165A4L;
        this.a = 1;
        g3.a("X", (Object)((Object)this), (Object)g3.a("X", (Object)class_39652, (long)2278860757416793019L, (long)l), (long)2280268750489114417L, (long)l);
    }

    public void method_7485(double d, double d10, double d11, float f, float f10) {
        long l = b ^ 0x30D15E939CC5L;
        CallSite callSite = g3.a("X", (Object)g3.a("X", (Object)new class_243(d, d10, d11), (long)-1818680238100836744L, (long)l), (double)f, (long)-1816073731678186851L, (long)l);
        g3.a("X", (Object)((Object)this), (Object)callSite, (long)-1815549453599255530L, (long)l);
        g3.a("X", (Object)((Object)this), (float)((float)(g3.a("\u00f4", (double)g3.a("o", (Object)callSite, (long)-1818289574887575302L, (long)l), (double)g3.a("o", (Object)callSite, (long)-1818349085816187975L, (long)l), (long)-1815323813067881898L, (long)l) * 57.2957763671875)), (long)-1815469994230002838L, (long)l);
        g3.a("X", (Object)((Object)this), (float)((float)(g3.a("\u00f4", (double)g3.a("o", (Object)callSite, (long)-1815296149170159479L, (long)l), (double)g3.a("X", (Object)callSite, (long)-1819148641046518168L, (long)l), (long)-1815323813067881898L, (long)l) * 57.2957763671875)), (long)-1818616482319260185L, (long)l);
        g3.a("\u00de", (Object)((Object)this), (float)g3.a("X", (Object)((Object)this), (long)-1814959411726497382L, (long)l), (long)-1818536570458269296L, (long)l);
        g3.a("\u00de", (Object)((Object)this), (float)g3.a("X", (Object)((Object)this), (long)-1819377091598493245L, (long)l), (long)-1815151478723075234L, (long)l);
    }

    private static boolean lambda$tick$0(g3 g32, class_1297 class_12972) {
        long l = b ^ 0x600131D7E5CAL;
        return (boolean)g3.a("X", (Object)((Object)g32), (Object)class_12972, (long)-6931109795633688422L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(g3.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


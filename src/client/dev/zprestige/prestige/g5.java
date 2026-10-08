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
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
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
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_3966;

final class g5
extends class_1665 {
    public boolean a = 0;
    public boolean b = 0;
    private static final long c = hc.a(-4704059676205955323L, -976157622994243293L, MethodHandles.lookup().lookupClass()).a(194059560330122L);
    private static final Object[] d = new Object[89];
    private static final String[] e = new String[89];

    public g5(class_1299 class_12992, class_1309 class_13092, class_1937 class_19372, class_1799 class_17992) {
        super(class_12992, class_13092, class_19372, class_17992, class_17992);
    }

    static {
        g5.a();
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = g5.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = g5.b(classArray[i], string, clazz2);
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
            int n = g5.a(l, l2);
            object = d[n];
            try {
                if (!(object instanceof String)) break block2;
                g5.d[n] = clazz = Class.forName(e[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = g5.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = g5.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = g5.a(l, l2);
        Object object = d[n];
        if (object instanceof String) {
            String string = e[n];
            int n2 = string.indexOf(8);
            Class clazz = g5.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = g5.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = g5.a(clazz3, string2, clazz2)) != null) {
                    g5.d[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = g5.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        g5.d[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = g5.b(1769556300494782L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = g5.a(l, l2);
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
                clazz3 = g5.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = g5.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = g5.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        g5.d[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = g5.b(1769556300494782L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = g5.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        g5.d[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = g5.b(1769556300494782L, 0L);
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
            throw new RuntimeException("dev/zprestige/prestige/g5" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'u' || c == '\u00fc' || c == 'm' || c == '\u00e1') {
                field = g5.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'u' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fc' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'm' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = g5.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e8' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = g5.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
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
            case 0 -> 31;
            case 1 -> 4;
            case 2 -> 55;
            case 3 -> 29;
            case 4 -> 43;
            case 5 -> 41;
            case 6 -> 13;
            case 7 -> 8;
            case 8 -> 39;
            case 9 -> 40;
            case 10 -> 5;
            case 11 -> 62;
            case 12 -> 11;
            case 13 -> 20;
            case 14 -> 47;
            case 15 -> 36;
            case 16 -> 42;
            case 17 -> 12;
            case 18 -> 9;
            case 19 -> 18;
            case 20 -> 15;
            case 21 -> 61;
            case 22 -> 2;
            case 23 -> 52;
            case 24 -> 33;
            case 25 -> 17;
            case 26 -> 16;
            case 27 -> 6;
            case 28 -> 59;
            case 29 -> 34;
            case 30 -> 7;
            case 31 -> 28;
            case 32 -> 58;
            case 33 -> 26;
            case 34 -> 56;
            case 35 -> 48;
            case 36 -> 10;
            case 37 -> 3;
            case 38 -> 57;
            case 39 -> 27;
            case 40 -> 51;
            case 41 -> 37;
            case 42 -> 30;
            case 43 -> 32;
            case 44 -> 44;
            case 45 -> 38;
            case 46 -> 22;
            case 47 -> 50;
            case 48 -> 53;
            case 49 -> 60;
            case 50 -> 63;
            case 51 -> 45;
            case 52 -> 23;
            case 53 -> 49;
            case 54 -> 35;
            case 55 -> 1;
            case 56 -> 14;
            case 57 -> 24;
            case 58 -> 25;
            case 59 -> 21;
            case 60 -> 46;
            case 61 -> 19;
            case 62 -> 54;
            default -> 0;
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
        g5.e[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = d;
        d[0] = "w[,\u007fQ\u0016w[;#]\u0019m\u0010;=]\fjaje\u000f";
        objectArray[1] = Double.TYPE;
        g5.e[1] = "java/lang/Double";
        objectArray[2] = "GQ\u0011X^YQQ\u0014\u0002MNF\u001a\u0017\u0004AZW]\u0000\u0013\nN\u0016";
        objectArray[3] = Float.TYPE;
        g5.e[3] = "java/lang/Float";
        objectArray[4] = Void.TYPE;
        g5.e[4] = "java/lang/Void";
        objectArray[5] = "P\u00037\f?\u0010P\u0003 P3\u001fJH N3\nM9p\u0017aK";
        objectArray[6] = "\u001f\u0001`\u0016g\\\u001f\u0001wJkS\u0005JwTkF\u0002;&\n>\u0003";
        objectArray[7] = "\u001aKo0r\u0013\u001aKxl~\u001c\u0000\u0000xr~\t\u0007q),+B";
        objectArray[8] = "\u001e|t\u0005$2\u0000tnJC3\u0011oc\u0010e5";
        objectArray[9] = Boolean.TYPE;
        g5.e[9] = "java/lang/Boolean";
        objectArray[10] = "d&\u000e4qtd&\u0019h}{~m\u0019v}ny\u001cH)$";
        objectArray[11] = "XOq@\u001d:XOf\u001c\u00115B\u0004f\u0002\u0011 Eu6WEj\u0012Ii\u000f\u0003 i\u0019<X@";
        objectArray[12] = "x\u0012Z\u000bB{x\u0012MWNtbYMINae(\u001f\u001c\u001c%";
        objectArray[13] = "\u00156@7Do\u00156WkH`\u000f}WuHu\b\f\u0006*\u001a>";
        objectArray[14] = Integer.TYPE;
        g5.e[14] = "java/lang/Integer";
        objectArray[15] = "\u0002\u0001?v5U\t\u000e.9VX\u001c\u0003!RcZ\r\u0010=~tW";
        objectArray[16] = "\u0001\u000b\u0013\u0006`\u0005\u0001\u000b\u0004Zl\n\u001b@\u0004Dl\u001f\u001c1U\u001e8";
        objectArray[17] = "q'~G\b\u000fo/d\bj\u0013h2";
        objectArray[18] = "6\u0018\u0007<-\u00006\u0018\u0010`!\u000f,S\u0010~!\u001a+\"A$xY";
        objectArray[19] = "\u001b\u001f0=\u0010\n\u001b\u001f'a\u001c\u0005\u0001T'\u007f\u001c\u0010\u0006%u*OQ";
        objectArray[20] = "^|2zBLH|7 Q[_74&]ONp#1\u0016]r";
        objectArray[21] = "I\u0013\u000e@^#<3\u0005OOlA+\u0016HF%)";
        objectArray[22] = "\u0012\u0003]\u0015w~\u0012\u0003JI{q\bHJW{d\u000f9\u001b\b#3\u001f\nHHiHNR\u0019";
        objectArray[23] = "~c.\u0006\\d~c9ZPkd(9DP~cYi\u0011\u00044";
        objectArray[24] = "\u000e\u0011$\u0010\u0001u\u000e\u00113L\rz\u0014Z3R\ro\u0013+c\u0007Z)";
        objectArray[25] = "I\u0004\u001a%HYB\u000b\u000bj)WI\u0000\u000f0";
        objectArray[26] = "i\u00048xJ\u000fi\u0004/$F\u0000sO/:F\u0015t>~e\u001e";
        objectArray[27] = "\u0016O\r;k\u001f\u0016O\u001agg\u0010\f\u0004\u001ayg\u0005\u000buJ,3O\\I\u0015tu\u0005'\u0018M'";
        objectArray[28] = "O}\\nO_O}K2CPU6K,CERG\u001by\u0014\u0000";
        objectArray[29] = "aT||\u0014PwTy&\u0007G`\u001fz \u000bSqXm7@C=";
        objectArray[30] = "k=\"\u000f>]\u001e\u001d)\u0000/\u0012\u007f\u0013\"\u000b+H\u000b";
        objectArray[31] = "&\u0012ay\u000b\u0014s\u0017:kp@r\u000b<s\u001cr%Lg-@%&I2p\u0011F|\u000f\"{p";
        objectArray[32] = "m:\u0018FR:(+\u000e\u0001?h0-\u0018\u0013h<npCN?: +\u0007D\\;/$\u0018";
        objectArray[33] = "t\u00041@gG!\u0001jR\u001c\u0013 \u001dlJp!tQ<\u0015$vt_bI}\u0015.\u0019rB\u001cOs\u000fhL\u007f\u00155\u001fc-%H#\u0005mN\u007f\u000e3\u000e\f\u0016w\u001a*Y|\u0013mH(a";
        objectArray[34] = ";f hCHnc{z8\u001co\u007f}bT.;3\"4\ty;s'k\u0001Hbss\u0005\u0003\u0012nd%u\u0006\b<f\u001d";
        objectArray[35] = "@18BQQ\u00154cP*\u000e\u00189aC}^Al9/\u0010]E:zISYH5";
        objectArray[36] = ";/]{\u001f\u0016b/\t\u0015CJ~?\u0000yq\u001e:fV\u0015\u001fW81^$FWl_^e\u001cI;n\u0007eH'";
        objectArray[37] = "m=,7tr1%1wD.9=\u001aa42Px!r6u+\u007f8j!N";
        objectArray[38] = "^\u0014\u001fMTX\u0006O\u001a\rnR\fW\u001a\u001b\u0002`X\u0013BBn\u000e\u0011\u0011\u0014E_W\u0011EzB\u0013I\u0013\u0010\u0001E\nQ\u0004+";
        objectArray[39] = "/\u0017_q3*}\f^+\u0002)q\b\\zU~/X\u0005&\u0002xb\u0002_'o*y\u0003\u0005";
        objectArray[40] = "T5\u000bb2\u0010\u00010PpID\u0000,Vh%vWn\u00071q!Wm\na6G\u0014i\u0007nI\u001bPlXp/XTaW\u000fs\u001cQ>Ii0\u0018\\16";
        objectArray[41] = "p1\u000eT\u0014l%4UFo8$(S^\u0003\nvo\n\tT]y>BH\u0013--?]]o";
        objectArray[42] = "&4\u0019q\u001f\u0000~o\u001c1%\ntw\u001c'I8(:B@\u0014Q|vA*\u0018U`g|\u007f\u001a\n(1\u0013'A\u000fh\u000b";
        objectArray[43] = "~E\u0000n*C'ET\u0000}\u0013*QVW*Iz\f:9-\u001c#TYck\f(";
        objectArray[44] = "\u00118bR;0D=9@@dE!?X,V\u0015be\u0006@?U#-\u0004;8L;:?";
        objectArray[45] = "UA=%w<\u0000Df7\fh\u0001X`/`ZV\u0018=q1\r]\u001ae51gQ\u001ey$\f";
        objectArray[46] = "D:MS\u000fQ\u0011?\u0016At\u0005\u0010#\u0010Y\u00187FaL\u0003J`GbLP\u000b\u0006\u0004fA_t[\u00163\u0017\u0006\u0004^\fa\u0015>";
        objectArray[47] = ".\u001d\u001f1c\u0016{\u0018D#\u0018Iv\u0015F0O\u0018*G\u001e\\)Uv\u001aPfiXw\t";
        objectArray[48] = "\u000f\u0016&\u001f\u001bkZ\u0013}\r`?[\u000f{\u0015\f\r\tO L``\u000bOu\r\u0006#\u000fBzr";
        objectArray[49] = "W,\t#gQ\u0002)R1\u001c\tn Q\u007f#\n\u0017'V.y`\u0007,\u0005qv\u0019\u0000+T+\u001c";
        objectArray[50] = "=\u001eojjE%E>r\u001bG:\u0002bvwunF3)\u001bI=\u0005z-%\u0018j\u000f~\u0011";
        objectArray[51] = "Ig\u00175;w\u001cbL'@#\u001d~J?,\u0011M=\u001bi@x\r|Xc;\u007f\u0014dOX";
        objectArray[52] = "i\u001f}^\n\u0018<\u001a&LqL=\u0006 T\u001d~mJy\u000fq\u0010n\u0014$R\u0012J(\u0004/3H\u0017>\u001e!P\u0012Q.\u0015@\nOG4\u001b#P\tW?z{X\u001dNh\n~BOLP";
        objectArray[53] = "d\u001ah\u0010\u000e:1\u001f3\u0002ue<\u00121\u0011\"6lOo}O6a\u0011*\u001b\f2l\u001e";
        objectArray[54] = "\u000b6RkDER6\u0006\u0005\u0018\u0019N&\u000fi*M\n|Y\u0005D\u0004\b(Q4\u001d\u0004\\F";
        objectArray[55] = "3\tB]d2f\f\u0019O\u001ffg\u0010\u001fWsT0PO\n/\u00034\u0011\u0001B$x3\b\u0019U\u001f";
        objectArray[56] = "v\r\u0004C(\tdK\u0017RV\u000ep\t\u001aV:<'K@\u000bnkq\r@\\(Q,\u0011\bUVZ#\u0010\u0007\f<V'\f\u00161<\u000bp\u000e\u000bV$P!\u0016z";
        objectArray[57] = "o 6i{P}f%x\u0005Wi$(|ie>fr\"82:%6i>I=<.~\u0005";
        objectArray[58] = "=5\u000bqi}h0Pc\u0012)i,V{~\u001b?n\n!-L>m\nrm*}i\u0007}\u0012wo<Q$brunS\u001c";
        objectArray[59] = "\u0003:C\u007f7\u0003Z:\u0017\u0011k_F*\u001e}Y\u000b\u0002p@\u00117\fT.\u0018rmJD%y(~\bTsHq~\\:";
        objectArray[60] = "X?!.\u0007\u0000\r:z<|T\f&|$\u0010f\\d }|\n\n6{{\f\u000f\u0010dyC";
        objectArray[61] = "nE\tG]-;D\u0017\u001cg'\u0003\u0015RV\u001b1q\u001cR@\u001eM";
        objectArray[62] = ":fq,q\u0003ngn9\r\u0016gp`:a$:7:e\rB4i}`gN0ul]f\u000bt~~?tMgo\u0000";
        objectArray[63] = "G\u001d\b]@\u0015\u0017\u0012\u0014H#\u0015H\r\u0010\\tB\u0012[O0M\u0006U\r\u0017^\u001d\tI\u0018";
        objectArray[64] = "} \u0013\u0004R\u0016)!\f\u0011.\u0003 6\u0002\u0012B1tu]I\u0014f\"$\bM\u0011\u0005<+\u0005\u0004.\t67\u0000\u0014\u0014\u0005w2\u0006u";
        objectArray[65] = "%5V0\u0015]p0\r\"n\u0002}=\u000f19S!oU]_\u001e}2\u0019g\u001f\u0013|!";
        objectArray[66] = "[\n#Y$RCQrAUP\\\u0016.E9b\bSw\u001aU\u000bL\u0014<\u0019.\fU\f+\"";
        objectArray[67] = "\u0017FELX#SX\u0010\n<{AF\u001dPPI\u0015\u0007F\u000b\r\u001e\u0015\u0004\u0013S]}OB\u0003X<'\u0012T\u0019V_}TD\u00127\u0005 B^\u001cT_fRU}";
        objectArray[68] = "N-2I\u0002\u001b\u001b(i[yO\u001a4oC\u0015}Lv3\u0019E*Mu3J\u0006L\u000eq>Ey";
        objectArray[69] = "P0.[F\"Bv=J8%V40NT\u0017\u0001w`\u0014\u0002@\u00079;R\u0003#\u000664M8~F6\"\u0012Cy_.5)";
        objectArray[70] = "\u001b}Y5f2B}\r[:n^m\u00047\b8\u001d7]d_:\u001cc\u0007:<`Zs\f[";
        objectArray[71] = "\u0017\u007f\u001f\u000e}\u001cBzD\u001c\u0006HCfB\u0004jz\u0014&\u0012X>-\u0010g\\\u0011=V\u0017~D\u0006\u0006\u0016EvE[v\u0013_$Gc";
        objectArray[72] = "`M-G\"&<U0\u0007\u0012|0F!|rtl\b-\u0003k!0S]";
        objectArray[73] = ">[`)\u000fzk^;;t%fS9(#u;\u0005`ztuz@/\u007f\u000frcX8";
        objectArray[74] = "\u001eil2pCKl7 \u000b\u0017Jp18g%\u00180ao\u000b\u0013\u0019~2aj\u0013\u00194>_0\u0019Kki/5\u0003\u0019iQ";
        objectArray[75] = "I\fZ#i6\u0010\f\u000eM>f\u001d\u0018\f\u001ai<MD`tni\u0014\u001d\u0003.(y\u001f";
        objectArray[76] = "KD\bs\u0007h\u001eASa|<\u001f]Uy\u0010\u000eK\u0011\n/LYKQ\u000fpEh\u0012Q[\u001e";
        objectArray[77] = "\"IRtOVwL\tf4\u0002vP\u000f~X0 \u0012S$\tg!\u0011SwK\u0001b\u0015^x4";
        objectArray[78] = "G\u000bn#cn\u0012\u000e51\u0018:\u0013\u00123)t\bDUht!_GP=*y<\u001d\u0016-!\u0018";
        objectArray[79] = "t)rq\u0016\u001fw>gdk\u001aw.hs<M-\u007f<\u001f\t\u001eh-qt\n\t}8";
        objectArray[80] = "RRLxo\u0013\u0007W\u0017j\u0014G\u0006K\u0011rxuV\bM-\u0014\u001c\u0016I\u0003.o\u001b\u000fQ\u0014\u0015";
        objectArray[81] = "\"~Yd\nw\"~\u0013h4s.<K`XAz\u007f\u00147\b\u0016z0\u0011i\r'#0E\u0007";
        objectArray[82] = "g0=I%\u000325f[^W3)`C2e`l<\u001co2e>lCfB`$>A^";
        objectArray[83] = "\u001aY\r-\fXO\\V?w\fN@P'\u001b>\u001c\u0000\u000b|wPS\u0006^yF\tSR0y\u0007SM\u0005\u0001 \u0007\u0007#^L+\u0016\u0016\u0013A\u000e'\ni";
        objectArray[84] = "7k/\u000fPz,bhColTolJS;kqp\u000fW\u0005m|)\\V44|}2";
        objectArray[85] = "\u0003B\u0016X3\u0015R\u0015\u001c\\\u000fJ\u0014E\u0017IsL\u0012(P[\u007f\u0010X\u0014\fCbPh";
        objectArray[86] = "\u0004~C4?V\u0004~\t8\u0001R\b<Q0m`\\\u007f\u000eg:7\u000b=M:bY[2Q/\u0001";
        objectArray[87] = "LI%e^y\u0015Iq\u000b\t)\u0018]s\\^sH\u0003\u001f2Y&\u0011X|h\u001f6\u001a";
        Object[] objectArray2 = objectArray;
        objectArray[88] = "\u0005vh&.\tPs34U]Qo5,9o\u0006(nrj8\u0005-;/4[_k+$U";
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void method_5773() {
        block70: {
            block68: {
                block69: {
                    block67: {
                        block64: {
                            block66: {
                                block65: {
                                    block62: {
                                        block60: {
                                            block61: {
                                                block58: {
                                                    block59: {
                                                        block56: {
                                                            block57: {
                                                                block53: {
                                                                    block54: {
                                                                        block51: {
                                                                            block52: {
                                                                                var1_1 = g5.c ^ 114738939097144L;
                                                                                var3_2 = var1_1 ^ 3893031000797L;
                                                                                var6_3 = g5.a("\u00e8", (Object)this, (long)4008790720125389671L, (long)var1_1);
                                                                                var5_4 = g5.a("\u00c2", (long)4016778443973282815L, (long)var1_1);
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                v0 = this;
                                                                                                if (var5_4 != null) break block51;
                                                                                                if (g5.a("u", (Object)v0, (long)4015453420853651161L, (long)var1_1) != 0.0f) break block52;
                                                                                            }
                                                                                            catch (MatchException v1) {
                                                                                                throw g5.a("\u00c2", (Object)v1, (long)4016487098025993798L, (long)var1_1);
                                                                                            }
                                                                                            v0 = this;
                                                                                            if (var5_4 != null) break block51;
                                                                                        }
                                                                                        catch (MatchException v2) {
                                                                                            throw g5.a("\u00c2", (Object)v2, (long)4016487098025993798L, (long)var1_1);
                                                                                        }
                                                                                        if (g5.a("u", (Object)v0, (long)4016182969305903269L, (long)var1_1) != 0.0f) break block52;
                                                                                    }
                                                                                    catch (MatchException v3) {
                                                                                        throw g5.a("\u00c2", (Object)v3, (long)4016487098025993798L, (long)var1_1);
                                                                                    }
                                                                                    g5.a("\u00e8", (Object)this, (float)((float)(g5.a("\u00c2", (double)g5.a("u", (Object)var6_3, (long)4009588397537437632L, (long)var1_1), (double)g5.a("u", (Object)var6_3, (long)4009315529512629517L, (long)var1_1), (long)4008726992576303519L, (long)var1_1) * 57.2957763671875)), (long)4015700784657628210L, (long)var1_1);
                                                                                    g5.a("\u00e8", (Object)this, (float)((float)(g5.a("\u00c2", (double)g5.a("u", (Object)var6_3, (long)4016021464313339649L, (long)var1_1), (double)g5.a("\u00e8", (Object)var6_3, (long)4008345446170981132L, (long)var1_1), (long)4008726992576303519L, (long)var1_1) * 57.2957763671875)), (long)4017109954493242956L, (long)var1_1);
                                                                                    g5.a("\u00fc", (Object)this, (float)g5.a("\u00e8", (Object)this, (long)4008272820544012272L, (long)var1_1), (long)4016182969305903269L, (long)var1_1);
                                                                                    g5.a("\u00fc", (Object)this, (float)g5.a("\u00e8", (Object)this, (long)4008866888967426353L, (long)var1_1), (long)4015453420853651161L, (long)var1_1);
                                                                                }
                                                                                catch (MatchException v4) {
                                                                                    throw g5.a("\u00c2", (Object)v4, (long)4016487098025993798L, (long)var1_1);
                                                                                }
                                                                            }
                                                                            v0 = this;
                                                                        }
                                                                        var7_5 = g5.a("\u00e8", (Object)v0, (long)4015620675711958311L, (long)var1_1);
                                                                        var8_6 = g5.a("\u00e8", (Object)this, (long)4015889186814502561L, (long)var1_1);
                                                                        var9_7 = g5.a("\u00e8", (Object)var8_6, (Object)var7_5, (long)4016818530372330129L, (long)var1_1);
                                                                        try {
                                                                            v5 = g5.a("\u00e8", (Object)var9_7, (long)4017041973997694989L, (long)var1_1);
                                                                            if (var5_4 != null) break block53;
                                                                            if (v5 != false) break block54;
                                                                        }
                                                                        catch (MatchException v6) {
                                                                            throw g5.a("\u00c2", (Object)v6, (long)4016487098025993798L, (long)var1_1);
                                                                        }
                                                                        var10_8 = g5.a("\u00e8", (Object)var9_7, (Object)var8_6, (Object)var7_5, (long)4016933633270314678L, (long)var1_1);
                                                                        try {
                                                                            v5 = g5.a("\u00e8", (Object)var10_8, (long)4008653236390196947L, (long)var1_1);
                                                                            if (var5_4 != null) break block53;
                                                                            if (v5 != false) break block54;
                                                                        }
                                                                        catch (MatchException v7) {
                                                                            throw g5.a("\u00c2", (Object)v7, (long)4016487098025993798L, (long)var1_1);
                                                                        }
                                                                        var11_10 = g5.a("\u00e8", (Object)g5.a("\u00e8", (Object)var10_8, (long)4016535977901009918L, (long)var1_1), (long)4009468407014928252L, (long)var1_1);
                                                                        while (g5.a("\u00e8", (Object)var11_10, (long)4015069861875257593L, (long)var1_1) != false) {
                                                                            block55: {
                                                                                var12_11 /* !! */  = (class_238)g5.a("\u00e8", (Object)var11_10, (long)4009058385752236183L, (long)var1_1);
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            if (var5_4 != null) break block55;
                                                                                            v8 = new Object[2];
                                                                                            v8[1] = var3_2;
                                                                                            v8[0] = this;
                                                                                            v5 = g5.a("\u00e8", (Object)g5.a("\u00e8", (Object)var12_11 /* !! */ , (Object)var7_5, (long)4015991170541875163L, (long)var1_1), (Object)g5.a("\u00c2", (Object)v8, (long)4009389538658908405L, (long)var1_1), (long)4015163622500186088L, (long)var1_1);
                                                                                            if (var5_4 != null) break block53;
                                                                                        }
                                                                                        catch (MatchException v9) {
                                                                                            throw g5.a("\u00c2", (Object)v9, (long)4016487098025993798L, (long)var1_1);
                                                                                        }
                                                                                        if (v5 != false) {
                                                                                        }
                                                                                        ** GOTO lbl81
                                                                                    }
                                                                                    catch (MatchException v10) {
                                                                                        throw g5.a("\u00c2", (Object)v10, (long)4016487098025993798L, (long)var1_1);
                                                                                    }
                                                                                    g5.a("\u00e8", (Object)this, (boolean)true, (long)4008428747206453730L, (long)var1_1);
                                                                                }
                                                                                catch (MatchException v11) {
                                                                                    throw g5.a("\u00c2", (Object)v11, (long)4016487098025993798L, (long)var1_1);
                                                                                }
                                                                            }
                                                                            try {
                                                                                if (var5_4 == null) break;
lbl81:
                                                                                // 2 sources

                                                                                if (var5_4 == null) continue;
                                                                                break;
                                                                            }
                                                                            catch (MatchException v12) {
                                                                                throw g5.a("\u00c2", (Object)v12, (long)4016487098025993798L, (long)var1_1);
                                                                            }
                                                                        }
                                                                    }
                                                                    v5 = g5.a("u", (Object)this, (long)4015777737168082769L, (long)var1_1);
                                                                }
                                                                try {
                                                                    try {
                                                                        if (var5_4 != null) break block56;
                                                                        if (v5 <= 0) break block57;
                                                                    }
                                                                    catch (MatchException v13) {
                                                                        throw g5.a("\u00c2", (Object)v13, (long)4016487098025993798L, (long)var1_1);
                                                                    }
                                                                    v14 = this;
                                                                    g5.a("\u00fc", (Object)v14, (int)(g5.a("u", (Object)v14, (long)4015777737168082769L, (long)var1_1) - 1), (long)4015777737168082769L, (long)var1_1);
                                                                }
                                                                catch (MatchException v15) {
                                                                    throw g5.a("\u00c2", (Object)v15, (long)4016487098025993798L, (long)var1_1);
                                                                }
                                                            }
                                                            try {
                                                                v16 = this;
                                                                if (var5_4 != null) break block58;
                                                                v5 = g5.a("\u00e8", (Object)v16, (long)4015522253252116892L, (long)var1_1);
                                                            }
                                                            catch (MatchException v17) {
                                                                throw g5.a("\u00c2", (Object)v17, (long)4016487098025993798L, (long)var1_1);
                                                            }
                                                        }
                                                        try {
                                                            try {
                                                                if (v5 != false) break block59;
                                                                v18 = g5.a("\u00e8", (Object)var9_7, (Object)g5.a("m", (long)4015303204281313827L, (long)var1_1), (long)4008327073088067307L, (long)var1_1);
                                                                if (var5_4 != null) break block60;
                                                            }
                                                            catch (MatchException v19) {
                                                                throw g5.a("\u00c2", (Object)v19, (long)4016487098025993798L, (long)var1_1);
                                                            }
                                                            if (v18 == false) break block61;
                                                        }
                                                        catch (MatchException v20) {
                                                            throw g5.a("\u00c2", (Object)v20, (long)4016487098025993798L, (long)var1_1);
                                                        }
                                                    }
                                                    v16 = this;
                                                }
                                                g5.a("\u00e8", (Object)v16, (long)4016677187530717648L, (long)var1_1);
                                            }
                                            try {
                                                v21 = this;
                                                if (var5_4 != null) break block62;
                                                v18 = g5.a("\u00e8", (Object)v21, (long)4016321150537068437L, (long)var1_1);
                                            }
                                            catch (MatchException v22) {
                                                throw g5.a("\u00c2", (Object)v22, (long)4016487098025993798L, (long)var1_1);
                                            }
                                        }
                                        try {
                                            block63: {
                                                try {
                                                    if (v18 == false) break block63;
                                                    this.b = 0;
                                                    if (var5_4 == null) break block64;
                                                }
                                                catch (MatchException v23) {
                                                    throw g5.a("\u00c2", (Object)v23, (long)4016487098025993798L, (long)var1_1);
                                                }
                                            }
                                            g5.a("\u00fc", (Object)this, (int)0, (long)4008581040389704901L, (long)var1_1);
                                            v21 = this;
                                        }
                                        catch (MatchException v24) {
                                            throw g5.a("\u00c2", (Object)v24, (long)4016487098025993798L, (long)var1_1);
                                        }
                                    }
                                    v25 = new Object[2];
                                    v25[1] = var3_2;
                                    v25[0] = v21;
                                    var10_8 = g5.a("\u00c2", (Object)v25, (long)4009389538658908405L, (long)var1_1);
                                    var11_10 = g5.a("\u00e8", (Object)var10_8, (Object)var6_3, (long)4014997021174492294L, (long)var1_1);
                                    var12_11 /* !! */  = g5.a("\u00e8", (Object)var8_6, (Object)new class_3959((class_243)var10_8, (class_243)var11_10, (class_3959.class_3960)g5.a("m", (long)4015173299120485118L, (long)var1_1), (class_3959.class_242)g5.a("m", (long)4008990492029652158L, (long)var1_1), (class_1297)this), (long)4008547116064596675L, (long)var1_1);
                                    try {
                                        try {
                                            v26 /* !! */  = var12_11 /* !! */ ;
                                            if (var5_4 != null) break block65;
                                            if (g5.a("\u00e8", (Object)v26 /* !! */ , (long)4009476957087430756L, (long)var1_1) == g5.a("m", (long)4016871904404105399L, (long)var1_1)) break block66;
                                        }
                                        catch (MatchException v27) {
                                            throw g5.a("\u00c2", (Object)v27, (long)4016487098025993798L, (long)var1_1);
                                        }
                                        v26 /* !! */  = var12_11 /* !! */ ;
                                    }
                                    catch (MatchException v28) {
                                        throw g5.a("\u00c2", (Object)v28, (long)4016487098025993798L, (long)var1_1);
                                    }
                                }
                                var11_10 = g5.a("\u00e8", (Object)v26 /* !! */ , (long)4009699681412535957L, (long)var1_1);
                            }
                            var13_13 = g5.a("\u00e8", (Object)this, (Object)var10_8, (Object)var11_10, (long)4009836303128437054L, (long)var1_1);
                            try {
                                try {
                                    if (var5_4 != null) break block67;
                                    if (var13_13 == null) break block64;
                                }
                                catch (MatchException v29) {
                                    throw g5.a("\u00c2", (Object)v29, (long)4016487098025993798L, (long)var1_1);
                                }
                                g5.a("\u00e8", (Object)this, (Object)var13_13, (long)4009224293067962532L, (long)var1_1);
                                g5.a("\u00fc", (Object)this, (boolean)true, (long)4009131229986797780L, (long)var1_1);
                            }
                            catch (MatchException v30) {
                                throw g5.a("\u00c2", (Object)v30, (long)4016487098025993798L, (long)var1_1);
                            }
                        }
                        var6_3 = g5.a("\u00e8", (Object)this, (long)4008790720125389671L, (long)var1_1);
                    }
                    var10_9 = g5.a("u", (Object)var6_3, (long)4009588397537437632L, (long)var1_1);
                    var12_12 = g5.a("u", (Object)var6_3, (long)4016021464313339649L, (long)var1_1);
                    var14_14 = g5.a("u", (Object)var6_3, (long)4009315529512629517L, (long)var1_1);
                    var16_15 = g5.a("\u00e8", (Object)this, (long)4010219060479997160L, (long)var1_1) + var10_9;
                    var18_16 = g5.a("\u00e8", (Object)this, (long)4014650944252672609L, (long)var1_1) + var12_12;
                    var20_17 = g5.a("\u00e8", (Object)this, (long)4008911001323574968L, (long)var1_1) + var14_14;
                    var22_18 = g5.a("\u00e8", (Object)var6_3, (long)4008345446170981132L, (long)var1_1);
                    g5.a("\u00e8", (Object)this, (float)((float)(g5.a("\u00c2", (double)var10_9, (double)var14_14, (long)4008726992576303519L, (long)var1_1) * 57.2957763671875)), (long)4015700784657628210L, (long)var1_1);
                    g5.a("\u00e8", (Object)this, (float)((float)(g5.a("\u00c2", (double)var12_12, (double)var22_18, (long)4008726992576303519L, (long)var1_1) * 57.2957763671875)), (long)4017109954493242956L, (long)var1_1);
                    g5.a("\u00e8", (Object)this, (float)g5.a("\u00c2", (float)g5.a("u", (Object)this, (long)4015453420853651161L, (long)var1_1), (float)g5.a("\u00e8", (Object)this, (long)4008866888967426353L, (long)var1_1), (long)4015814348293594380L, (long)var1_1), (long)4017109954493242956L, (long)var1_1);
                    g5.a("\u00e8", (Object)this, (float)g5.a("\u00c2", (float)g5.a("u", (Object)this, (long)4016182969305903269L, (long)var1_1), (float)g5.a("\u00e8", (Object)this, (long)4008272820544012272L, (long)var1_1), (long)4015814348293594380L, (long)var1_1), (long)4015700784657628210L, (long)var1_1);
                    var24_19 /* !! */  = 0.99f;
                    var25_20 = 0.05f;
                    try {
                        v31 = g5.a("\u00e8", (Object)this, (long)4016620204704318016L, (long)var1_1);
                        if (var5_4 != null) break block68;
                        if (v31 == false) break block69;
                    }
                    catch (MatchException v32) {
                        throw g5.a("\u00c2", (Object)v32, (long)4016487098025993798L, (long)var1_1);
                    }
                    var24_19 /* !! */  = (float)g5.a("\u00e8", (Object)this, (long)4016372472348179504L, (long)var1_1);
                }
                try {
                    g5.a("\u00e8", (Object)this, (Object)g5.a("\u00e8", (Object)var6_3, (double)var24_19 /* !! */ , (long)4017185641122016346L, (long)var1_1), (long)4015427982275784261L, (long)var1_1);
                    v33 = this;
                    if (var5_4 != null) break block70;
                    v31 = g5.a("\u00e8", (Object)v33, (long)4009666107030678390L, (long)var1_1);
                }
                catch (MatchException v34) {
                    throw g5.a("\u00c2", (Object)v34, (long)4016487098025993798L, (long)var1_1);
                }
            }
            if (v31 == false) {
                var26_21 = g5.a("\u00e8", (Object)this, (long)4008790720125389671L, (long)var1_1);
                g5.a("\u00e8", (Object)this, (double)g5.a("u", (Object)var26_21, (long)4009588397537437632L, (long)var1_1), (double)(g5.a("u", (Object)var26_21, (long)4016021464313339649L, (long)var1_1) - 0.05000000074505806), (double)g5.a("u", (Object)var26_21, (long)4009315529512629517L, (long)var1_1), (long)4015333721442837951L, (long)var1_1);
            }
            g5.a("\u00e8", (Object)this, (double)var16_15, (double)var18_16, (double)var20_17, (long)4016099323933865373L, (long)var1_1);
            v33 = this;
        }
        g5.a("\u00e8", (Object)v33, (long)4009794009446445122L, (long)var1_1);
    }

    protected void method_7454(class_3966 class_39662) {
        this.b = 0;
        this.a = 1;
    }

    protected class_1799 method_57314() {
        return null;
    }

    protected class_1799 method_7445() {
        return null;
    }

    protected void method_24920(class_3965 class_39652) {
        this.b = 0;
    }

    public void method_7485(double d, double d10, double d11, float f, float f10) {
        long l = c ^ 0x797AB7B71934L;
        CallSite callSite = g5.a("\u00e8", (Object)g5.a("\u00e8", (Object)new class_243(d, d10, d11), (long)-2400251243667844321L, (long)l), (double)f, (long)-2399301298028329642L, (long)l);
        g5.a("\u00e8", (Object)((Object)this), (Object)callSite, (long)-2398805232848615607L, (long)l);
        g5.a("\u00e8", (Object)((Object)this), (float)((float)(g5.a("\u00c2", (double)g5.a("u", (Object)callSite, (long)-2402395216595333428L, (long)l), (double)g5.a("u", (Object)callSite, (long)-2400451469379806207L, (long)l), (long)-2401040006383388525L, (long)l) * 57.2957763671875)), (long)-2398532155588897474L, (long)l);
        g5.a("\u00e8", (Object)((Object)this), (float)((float)(g5.a("\u00c2", (double)g5.a("u", (Object)callSite, (long)-2398211750609652211L, (long)l), (double)g5.a("\u00e8", (Object)callSite, (long)-2401384169326208512L, (long)l), (long)-2401040006383388525L, (long)l) * 57.2957763671875)), (long)-2399375060176292032L, (long)l);
        g5.a("\u00fc", (Object)((Object)this), (float)g5.a("\u00e8", (Object)((Object)this), (long)-2401491979392051460L, (long)l), (long)-2400339428826392151L, (long)l);
        g5.a("\u00fc", (Object)((Object)this), (float)g5.a("\u00e8", (Object)((Object)this), (long)-2400900109656557507L, (long)l), (long)-2398781718483431467L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(g5.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


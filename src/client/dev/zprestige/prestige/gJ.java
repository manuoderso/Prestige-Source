/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.hc;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public record gJ(int bz) {
    private static final Map a;
    private static final long b;
    private static final Object[] c;
    private static final String[] d;

    static {
        b = hc.a(9044625937805726149L, -3353409769685717328L, MethodHandles.lookup().lookupClass()).a(38353154285064L);
        c = new Object[36];
        d = new String[36];
        gJ.a();
        a = new HashMap();
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = gJ.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = gJ.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = gJ.a(l, l2);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                gJ.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public gJ b(String string, boolean bl, float[] fArray) {
        long l = b ^ 0x70685784242DL;
        gJ.a("\u00ea", (int)gJ.a("\u00a3", (Object)this, (Object)string, (long)-6841349387022136864L, (long)l), (boolean)bl, (Object)fArray, (long)-6844970137013510017L, (long)l);
        return this;
    }

    public gJ b(String string, float f, float f10, float f11, float f12) {
        long l = b ^ 0x7010BB159E22L;
        gJ.a("\u00ea", (int)gJ.a("\u00a3", (Object)this, (Object)string, (long)1946017393035981807L, (long)l), (float)f, (float)f10, (float)f11, (float)f12, (long)1949924956035621185L, (long)l);
        return this;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = gJ.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = gJ.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public gJ c(String string, boolean bl, float[] fArray) {
        long l = b ^ 0x758CF51BE4F7L;
        gJ.a("\u00ea", (int)gJ.a("\u00a3", (Object)this, (Object)string, (long)7049436468584532282L, (long)l), (boolean)bl, (Object)fArray, (long)7049397663570268570L, (long)l);
        return this;
    }

    private static Field c(long l, long l2) {
        int n = gJ.a(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = gJ.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = gJ.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = gJ.a(clazz3, string2, clazz2)) != null) {
                    gJ.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = gJ.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        gJ.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = gJ.b(896277040366464L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = gJ.a(l, l2);
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
                clazz3 = gJ.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = gJ.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = gJ.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        gJ.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = gJ.b(896277040366464L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = gJ.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        gJ.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = gJ.b(896277040366464L, 0L);
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

    private static void a() {
        Object[] objectArray = c;
        c[0] = "[Lb)\u001cW^Yi)\u001fPQPbk^gx\f5";
        objectArray[1] = Integer.TYPE;
        gJ.d[1] = "java/lang/Integer";
        objectArray[2] = Float.TYPE;
        gJ.d[2] = "java/lang/Float";
        objectArray[3] = Void.TYPE;
        gJ.d[3] = "java/lang/Void";
        objectArray[4] = "\u0006\u0002=C>.\u0010\u00028\u0019-9\u0007I;\u001f!-\u0016\u000e,\bj9(";
        objectArray[5] = "!}q,4o*r`cIw9ui*";
        objectArray[6] = Boolean.TYPE;
        gJ.d[6] = "java/lang/Boolean";
        objectArray[7] = "So";
        objectArray[8] = "D3C\"^\u001eO<Rm9\u001cZ7R&\u0002";
        objectArray[9] = "Y\u0013\u0002L\u0012_R\u001c\u0013\u0003\u007f[R\u0000'HMFV\u001c\u0017H";
        objectArray[10] = "Dk";
        objectArray[11] = "UB)Mp,KJ3\u0002\u00138O";
        objectArray[12] = "\"\u000e\u00014D\u000f)\u0001\u0010{%\u0001\"\n\u0014!";
        objectArray[13] = ".npHh\n0fj\u0007 \n*lr@)\u0011jIsG%\u000b-`h";
        objectArray[14] = "\fU\u0019EyE\u0011@Ag8H\tF";
        objectArray[15] = "j\\";
        objectArray[16] = "2@`\u001c \u0006\u007f\ru\u001a\u0011\u0017nMC]|\u0015e1tCx\u001dsAh\u001f`x";
        objectArray[17] = "7$>;\u000f~|r?a?/`(<vC)F#\raD)a1D;C<m?'mVt?MujS<j/(;F5\u0007}8sU6d+-;\u0007D";
        objectArray[18] = "kw<V\u0011\u0011&:)P \u00007z\n\u0000Lo\"b9\bP\u001f>>!m";
        objectArray[19] = "|\u000e0~=\rq]n\u001a9R@Uot1Lx\u000fo\u001a.RtV~j2\u000el3v~?SmCj\"'6eWg\u007f&Fy\u000b\u007f\u001a.RtV~j2\u000el3v~?SmCj\"'6'_o'kKa\f|!V";
        objectArray[20] = "Npz+M:C#$OIer+%!A{J\b-3\\`_q*1&yK$!?Ve\u0017<DsK;E}.!FdKM.w[<\u001f?>3Jj/w(.\u001b<R1{=\u001d\u0001";
        objectArray[21] = "\u001c\u0018sd.Y\u0011K-\u0000*\u0006 C,n\"\u0018\u0018\u001e,\u0000=\u0006\u0014@=p!Z\f%5d,\u0007\rU)84b\u0005A$e5\u0012\u0019\u001d<\u0000=\u0006\u0014@=p!Z\f%wl$_@X1?7Y}";
        objectArray[22] = "-\u000bu|C} X+\u0018G\"\u0011P*vO<)\u000f%\u0018P\"%S;hL~=6rw\u0017$tG4\u007f\u0011+L\f'y\u0015{1Jtj\u0013F";
        objectArray[23] = "\u000f\"V3m!I;Kp\r [>DfJ02\"]bh.B>\u0001z\rcJ5\u0001kr%S(B\u000b";
        objectArray[24] = "8ZZ7/T~CGtOJc^kf+Vh\"Mk&NuRQ7>+";
        objectArray[25] = "rdK\u001a[^\u007f7\u0015~_\u0001N?\u0014\u0010W\u001fv`\u0014~H\u0001z<\u0005\u000eT]bY\r\u001aY\u0000c)\u0011FAe)5\u0014C\r\u0018of\u0007E0";
        objectArray[26] = "^?/\"1\u0015SlqF5Jbdp(=TZ>\u007fF\"JVga6>\u0016N\u0002()eL\u0007sn!cC?;~y8\u0016N}v\u007f7.\u0006m.$b_@e(+Z\u0017P=s~+QX;|F`B^?,;&\u0011M9\u0011";
        objectArray[27] = "tg*K\u0017U9*?M&D(j\f\u0014[FEn\"\u0019C[5r~\u0001&";
        objectArray[28] = "]e\u0016F`AP6H\"d\u001ea>ILl\u0000YcF\"s\u001eU=XRoBMX\u0011M4\u0018\u0004)WE2\u0017<aG\u001diBM'O\u001bfz\u00057\u0017@3\u000bC?\u0011O\u000b@P9\u0015\u001fv\u0006\u0003*\u0013\"";
        objectArray[29] = "\u0014>\f\"zh\u0019mRF~7(eS(v)\u00109\\Fi7\u001cfB6uk\u0004\u0003\u000b).1MrM!(>u:]ysk\u0004|U\u007f|SOoS{,.\t<@}\u0011";
        objectArray[30] = "@\u0005\u0001V0TMV_24\u000bnUCo=\u000eO_EW\u001f\bJQCS<\t!@[[>\u001fQ\\\u0007C[QL\u0002[\b*PS[V2#\u000bH]OB?WP8";
        objectArray[31] = "S\u0019\u0015\u00025~^JKf1!oBJ\b9?WaB\u001a$$B\u001fE\u0018^=VMN\u0016.!\nU+Z3\u007fX\u0014A\b> V$A^#x\u0002VQ\u001a2.2\u001eG\u0007cxOX\u0014\u0014eE";
        objectArray[32] = "G:q?XYJi/[\\\u0006{a.5T\u0018C=.[K\u0006Ob?+WZW\u00077?Z\u0007Vw+cBb^c&>C\u0012B?>[\t\u000eG:r&O]T<O";
        objectArray[33] = "kiUv&\u0018f:\u000b\u0012\"GW2\n|*Yo\u0011\u0002n7Bzn\u0005lM[n=\u000eb=G2%k. \u0019`d\u0001|-FnT\u0001*0\u001e:&\u0011n!H\nn\u0007sp\u001ew(T`v#";
        objectArray[34] = "oK!O_IjO\u007f\\!_TK{\u001bCX6\u0016{GG6,\u0013.EQF0O6 ";
        Object[] objectArray2 = objectArray;
        objectArray[35] = "M\u0018.8LX\u0000U;>}I\u0011\u0015\u000bg\u0005F\u0015i:g\u0014C\f\u0019&;\f&";
    }

    public static gJ a(int n) {
        return new gJ(n);
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
            case 0 -> 56;
            case 1 -> 5;
            case 2 -> 22;
            case 3 -> 54;
            case 4 -> 46;
            case 5 -> 15;
            case 6 -> 36;
            case 7 -> 33;
            case 8 -> 63;
            case 9 -> 50;
            case 10 -> 37;
            case 11 -> 29;
            case 12 -> 62;
            case 13 -> 3;
            case 14 -> 51;
            case 15 -> 14;
            case 16 -> 8;
            case 17 -> 45;
            case 18 -> 38;
            case 19 -> 23;
            case 20 -> 19;
            case 21 -> 6;
            case 22 -> 1;
            case 23 -> 42;
            case 24 -> 61;
            case 25 -> 16;
            case 26 -> 30;
            case 27 -> 11;
            case 28 -> 27;
            case 29 -> 48;
            case 30 -> 52;
            case 31 -> 25;
            case 32 -> 60;
            case 33 -> 58;
            case 34 -> 55;
            case 35 -> 34;
            case 36 -> 26;
            case 37 -> 9;
            case 38 -> 17;
            case 39 -> 4;
            case 40 -> 7;
            case 41 -> 49;
            case 42 -> 10;
            case 43 -> 40;
            case 44 -> 2;
            case 45 -> 28;
            case 46 -> 0;
            case 47 -> 43;
            case 48 -> 53;
            case 49 -> 35;
            case 50 -> 39;
            case 51 -> 44;
            case 52 -> 47;
            case 53 -> 31;
            case 54 -> 59;
            case 55 -> 12;
            case 56 -> 32;
            case 57 -> 41;
            case 58 -> 13;
            case 59 -> 57;
            case 60 -> 20;
            case 61 -> 24;
            case 62 -> 21;
            default -> 18;
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
        gJ.d[n3] = new String(cArray);
        return n3;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/gJ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'Z' || c == '\u00d6' || c == 'F' || c == '\u00db') {
                field = gJ.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'Z' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d6' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'F' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = gJ.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00a3' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ea' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = gJ.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public gJ a(String string, Color color) {
        long l = b ^ 0x5632E54D2FB6L;
        gJ.a("\u00ea", (int)gJ.a("\u00a3", (Object)this, (Object)string, (long)-6154869690129939845L, (long)l), (float)((float)gJ.a("\u00a3", (Object)color, (long)-6153695041345759042L, (long)l) / 255.0f), (float)((float)gJ.a("\u00a3", (Object)color, (long)-6153841228029516312L, (long)l) / 255.0f), (float)((float)gJ.a("\u00a3", (Object)color, (long)-6153053128642765245L, (long)l) / 255.0f), (float)((float)gJ.a("\u00a3", (Object)color, (long)-6154760039360617272L, (long)l) / 255.0f), (long)-6153148231393701675L, (long)l);
        return this;
    }

    public gJ a(String string, boolean bl, float[] fArray) {
        long l = b ^ 0x68F972DB5F06L;
        gJ.a("\u00ea", (int)gJ.a("\u00a3", (Object)this, (Object)string, (long)-2727566827672898869L, (long)l), (boolean)bl, (Object)fArray, (long)-2726895875358873582L, (long)l);
        return this;
    }

    public gJ a(String string, int n, int n2, int n3, int n4) {
        long l = b ^ 0x8EC113DB024L;
        gJ.a("\u00ea", (int)gJ.a("\u00a3", (Object)this, (Object)string, (long)3821265244794920425L, (long)l), (int)n, (int)n2, (int)n3, (int)n4, (long)3822344473313672444L, (long)l);
        return this;
    }

    public gJ a(String string, float f, float f10, float f11) {
        long l = b ^ 0x2B0F11A205EEL;
        gJ.a("\u00ea", (int)gJ.a("\u00a3", (Object)this, (Object)string, (long)-9165388614638262237L, (long)l), (float)f, (float)f10, (float)f11, (long)-9168650959112315936L, (long)l);
        return this;
    }

    public gJ a(String string, float f, float f10) {
        long l = b ^ 0x102C575C70CL;
        gJ.a("\u00ea", (int)gJ.a("\u00a3", (Object)this, (Object)string, (long)4769265346215701185L, (long)l), (float)f, (float)f10, (long)4764813904998669139L, (long)l);
        return this;
    }

    public gJ a(String string, float f) {
        long l = b ^ 0x3EC015D5AE8L;
        gJ.a("\u00ea", (int)gJ.a("\u00a3", (Object)this, (Object)string, (long)-2320524244314949851L, (long)l), (float)f, (long)-2321943874132262487L, (long)l);
        return this;
    }

    public gJ a(String string, float f, float f10, float f11, float f12) {
        long l = b ^ 0x7C056012F505L;
        gJ.a("\u00ea", (int)gJ.a("\u00a3", (Object)this, (Object)string, (long)8081331951977584840L, (long)l), (float)f, (float)f10, (float)f11, (float)f12, (long)8081861810659740262L, (long)l);
        return this;
    }

    public gJ a(String string, int n, int n2, int n3) {
        long l = b ^ 0x4BD21845DB45L;
        gJ.a("\u00ea", (int)gJ.a("\u00a3", (Object)this, (Object)string, (long)6802299386798044808L, (long)l), (int)n, (int)n2, (int)n3, (long)6803636534320083483L, (long)l);
        return this;
    }

    private int a(String string) {
        long l = b ^ 0x51F8FB449AFDL;
        return (int)gJ.a("\u00a3", (Object)((Integer)((Object)gJ.a("\u00a3", (Object)((Map)((Object)gJ.a("\u00a3", (Object)a, (Object)gJ.a("\u00ea", (int)this.bz, (long)2293457590715780515L, (long)l), gJ::lambda$getLocation$0, (long)2293023283165687584L, (long)l))), (Object)string, this::lambda$getLocation$1, (long)2293023283165687584L, (long)l))), (long)2292336730437070230L, (long)l);
    }

    public gJ a(String string, int n) {
        long l = b ^ 0x21C57AB4E818L;
        gJ.a("\u00ea", (int)gJ.a("\u00a3", (Object)this, (Object)string, (long)7871154531781133781L, (long)l), (int)n, (long)7869209637219627584L, (long)l);
        return this;
    }

    public gJ a(String string, int n, int n2) {
        long l = b ^ 0x1B8B01DCC102L;
        gJ.a("\u00ea", (int)gJ.a("\u00a3", (Object)this, (Object)string, (long)4909432777581882575L, (long)l), (int)n, (int)n2, (long)4909338834894105511L, (long)l);
        return this;
    }

    private Integer lambda$getLocation$1(String string) {
        long l = b ^ 0x6D4C434172ACL;
        return gJ.a("\u00ea", (int)gJ.a("\u00ea", (int)this.bz, (Object)string, (long)-612314749155626343L, (long)l), (long)-611711972571060750L, (long)l);
    }

    private static Map lambda$getLocation$0(Integer n) {
        return new HashMap();
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(gJ.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


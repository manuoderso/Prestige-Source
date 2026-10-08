/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.cP;
import dev.zprestige.prestige.cz_0;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.e_;
import dev.zprestige.prestige.hc;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class cJ
implements cz_0 {
    private final e_ a;
    private List c;
    private final ConcurrentLinkedQueue d;
    private final ConcurrentLinkedQueue e;
    public static boolean f;
    private static final long g;
    private static final Object[] h;
    private static final String[] i;

    public cJ(long l) {
        long l2 = (l = g ^ l) ^ 0x1CE200B6073BL;
        this.a = new e_();
        this.c = new ArrayList();
        this.d = new ConcurrentLinkedQueue();
        this.e = new ConcurrentLinkedQueue();
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = this;
        cJ.a("f", (Object)cJ.a("\u00a5", (long)-3586091380282493103L, (long)l), (Object)objectArray, (long)-3586461612652313926L, (long)l);
    }

    static {
        g = hc.a(3122907886063884537L, 8073645064456258999L, MethodHandles.lookup().lookupClass()).a(42052905545982L);
        h = new Object[42];
        i = new String[42];
        cJ.b();
        f = 1;
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
            case 0 -> 53;
            case 1 -> 34;
            case 2 -> 43;
            case 3 -> 12;
            case 4 -> 36;
            case 5 -> 4;
            case 6 -> 16;
            case 7 -> 40;
            case 8 -> 3;
            case 9 -> 26;
            case 10 -> 46;
            case 11 -> 27;
            case 12 -> 58;
            case 13 -> 21;
            case 14 -> 17;
            case 15 -> 51;
            case 16 -> 41;
            case 17 -> 57;
            case 18 -> 42;
            case 19 -> 5;
            case 20 -> 25;
            case 21 -> 31;
            case 22 -> 11;
            case 23 -> 61;
            case 24 -> 0;
            case 25 -> 13;
            case 26 -> 62;
            case 27 -> 47;
            case 28 -> 29;
            case 29 -> 8;
            case 30 -> 7;
            case 31 -> 15;
            case 32 -> 37;
            case 33 -> 44;
            case 34 -> 1;
            case 35 -> 45;
            case 36 -> 63;
            case 37 -> 14;
            case 38 -> 35;
            case 39 -> 2;
            case 40 -> 38;
            case 41 -> 52;
            case 42 -> 39;
            case 43 -> 28;
            case 44 -> 6;
            case 45 -> 59;
            case 46 -> 50;
            case 47 -> 10;
            case 48 -> 60;
            case 49 -> 48;
            case 50 -> 55;
            case 51 -> 54;
            case 52 -> 22;
            case 53 -> 30;
            case 54 -> 32;
            case 55 -> 18;
            case 56 -> 56;
            case 57 -> 20;
            case 58 -> 23;
            case 59 -> 9;
            case 60 -> 33;
            case 61 -> 49;
            case 62 -> 24;
            default -> 19;
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
        cJ.i[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = h;
        h[0] = " g|~qA6gy$bV!,z\"nB0km5%R\u000e";
        objectArray[1] = "MU0* KFZ!eCFSW.\u000evDBD2\"aI";
        objectArray[2] = "\u0016P\u0003b6+\u0000P\u00068%<\u0017\u001b\u0005>)(\u0006\\\u0012)b::";
        objectArray[3] = "\f\u000fs\u0000d!y/x\u000fun\u00047k\b|'l";
        objectArray[4] = "Qk/v%EOc59h_Ui,eyUU~wTd^X\u007f+en^OF0y`U_[,r~U";
        objectArray[5] = "56!M\u0016{>90\u0002wu524X";
        objectArray[6] = Boolean.TYPE;
        cJ.i[6] = "java/lang/Boolean";
        objectArray[7] = "JR4dX@JR#8TOP\u0019#&TZWhs{\u0005";
        objectArray[8] = "\u001en\\5\"?\u001enKi.0\u0004%Kw.%\u0003T\u001f/y";
        objectArray[9] = "'.\bRd+'.\u001f\u000eh$=e\u001f\u0010h1:\u0014JO1";
        objectArray[10] = "0\u0010\u001cL\t\u0004&\u0010\u0019\u0016\u001a\u00131[\u001a\u0010\u0016\u0007 \u001c\r\u0007]\u0010\u0002";
        objectArray[11] = "d\u001dk\u0011\"\u000f\u0011=`\u001e3@p3k\u00157\u001a\u0004";
        objectArray[12] = Void.TYPE;
        cJ.i[12] = "java/lang/Void";
        objectArray[13] = "\u0002]v\u001c}1w}}\u0013l~\u0016sv\u0018h$b";
        objectArray[14] = "#\u001f>x\"\u001f(\u0010/7E\u001d=\u001b/|~";
        objectArray[15] = Integer.TYPE;
        cJ.i[15] = "java/lang/Integer";
        objectArray[16] = "\u0002d!p\u000b\n\u0014d$*\u0018\u001d\u0003/',\u0014\t\u0012h0;_\u001f9";
        objectArray[17] = "vU]f\u001d?\u0003uVi\fpb{]b\b*\u0016";
        objectArray[18] = "y\u001ep,q#o\u001euvb4xUvpn i\u0012ag%7Q";
        objectArray[19] = "+\u0011{}!/=\u0011~'28*Z}!>,;\u001dj6u;\u0004";
        objectArray[20] = "|\u0006&S\u0018Kj\u0006#\t\u000b\\}M \u000f\u0007Hl\n7\u0018LXt\n5\u0013\u0016\u0015H\u00115\u000e\u0016R\u007f\u0006";
        objectArray[21] = "\u007f%EKgli%@\u0011t{~nC\u0017xoo)T\u00003~T";
        objectArray[22] = "\u001ax\\|%?oXWs4p\u000eV\\x0*z";
        objectArray[23] = "]\u0012IWt\u0015(2BXeZI<ISa\u0000=";
        objectArray[24] = ",\u007f\u0015\u0002]\u000f:\u007f\u0010XN\u0018-4\u0013^B\f<s\u0004I\t\u001b\u0006";
        objectArray[25] = "|GE?\u0017%vH\u0016E\u0007An\bU;\u0010~l\u000bJE\u0013|oKWz\u0011\u007fp5";
        objectArray[26] = "N_DQL\"GN^G|5w\u0019Q\u0007G#\u0017[P\u0006\u001d_";
        objectArray[27] = "#m\u001evV3~>\u0011?h8Na\u00198\u000b5 hK9\u0002";
        objectArray[28] = "@Zp:\u0011\nI\bq3v\r.\r\u007f8\u001a]HX56Nd\u001e\u0012\u007f)\u0010\u0004\u0010\u001bm7v";
        objectArray[29] = "~N:\u0006q\\)\u0000y\u000b\u0014L#R#\u0000C\u001b}\u0005{l)R,\u000f{](Bs\u0002";
        objectArray[30] = "\\\u001f|BT<\u000bQ?O1,\u0001\u0003eDf{^^>(\u000f%^TeJJ3Q\u0015";
        objectArray[31] = ".R\u00178\u0007xmUJlzw\u0011T\u001ba\u0003~l\rN-D\u001e";
        objectArray[32] = "S:\u0018a\u001fT\u0012g\b=nJ\u0013\u001a\u001f!\u0012ZhkJe\u0017K\u00152\u001f)P+";
        objectArray[33] = "(P@]i#tZ\u0005_\u0016dpFCKQt\u0019K[\u0016ia`\u0013RJu\u001a(P@]i#tZ\u0005_\u0016";
        objectArray[34] = "!7M2\\\u000e`j]n-\t}>K\n\u0016\u0016t1K:S\u0011k=/";
        objectArray[35] = "\u0015\u000bf\u0016\u000bsTVvJzk@\biTz7I\boJJrN\u0017c.F<\u0012\u001fdS\u001fi^X\u0004";
        objectArray[36] = "y\u001aD{\u0001#m\u0014\u0005ma$\u0013\u0019\u000b}\rvuLAsYOx\u000f\u0013nQ\u007f}\u000e\u001dla";
        objectArray[37] = "Tv^R=g@x\u001fD]a>u\u0011T12X [Ze\u000bQkZO#2Ad\u001f[]";
        objectArray[38] = "\np\u0010\u0016JiIwMB7c5$]\u0012[6Sq\u0017\u001c\u000f\u000f\u0005;]\u0003Qo\u000b2O\u001d7";
        objectArray[39] = "SEp\u0000\u001d\u0002\u0012\u0018`\\l\u0016\u000fNnQ\r\u001b\u0013()_\u0002\u0016\f\u0018lX\u001d\u001ah\u0014\"\u0004\u0015\u001d\u0015MwHR}";
        objectArray[40] = "\u0016B@ ^FUE\u001dt#M)\u0016\r$O\u0019OCG*\u001b \u0019\t\r5E@\u0017\u0000\u001f+#";
        Object[] objectArray2 = objectArray;
        objectArray[41] = "7]Se\u0012X7\u0016\u0000kk\u000b[W\rg\u0000\u0006k\u0012\nx\fbk\u001d\u001by\r\u0002e\u0014\tgk";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'C' || c == 'u' || c == '\u00a5' || c == '\u00d4') {
                field = cJ.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'C' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'u' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00a5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = cJ.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'f' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'Z' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public void b(Object[] objectArray) {
        block4: {
            dV dV2 = (dV)objectArray[0];
            long l = (Long)objectArray[1];
            l = g ^ l;
            CallSite callSite = cJ.a("Z", (long)8050947923688210232L, (long)l);
            try {
                CallSite callSite2;
                try {
                    callSite2 = cJ.a("f", (Object)this.e, (Object)dV2, (long)8049573366244055362L, (long)l);
                    if (callSite != null || callSite2 != false) break block4;
                }
                catch (MatchException matchException) {
                    throw cJ.a("Z", (Object)matchException, (long)8050859267630104122L, (long)l);
                }
                callSite2 = cJ.a("f", (Object)this.e, (Object)dV2, (long)8049298045891115648L, (long)l);
            }
            catch (MatchException matchException) {
                throw cJ.a("Z", (Object)matchException, (long)8050859267630104122L, (long)l);
            }
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = cJ.b(lookup, mutableCallSite, string, methodType, l, l2);
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
        int n = cJ.e(l, l2);
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
                clazz3 = cJ.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = cJ.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = cJ.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        cJ.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = cJ.f(373589376329904L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = cJ.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        cJ.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = cJ.f(373589376329904L, 0L);
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
            int n = cJ.e(l, l2);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                cJ.h[n] = clazz = Class.forName(i[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = cJ.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = cJ.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = cJ.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = cJ.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public e_ a(Object[] objectArray) {
        return this.a;
    }

    @cP
    public void a(Color color) {
        long l = g ^ 0x1718AC938298L;
        cJ.a("f", (Object)cJ.a("f", (Object)this.a, (Object)new Object[0], (long)8940843357578707761L, (long)l), (Object)color, (long)8941700885872625778L, (long)l);
    }

    @cP
    public void a(List list) {
        this.c = list;
    }

    @cP
    public List a() {
        return this.c;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cJ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    /*
     * Unable to fully structure code
     */
    @bP
    public void a(bG var1_1) {
        block26: {
            block25: {
                v0 = var2_2 = cJ.g ^ 103692744652814L;
                var4_3 = v0 ^ 59542368627597L;
                var6_4 = v0 ^ 120551760802286L;
                var8_5 = cJ.a("Z", (long)472252759595603471L, (long)var2_2);
                try {
                    try {
                        v1 = cJ.b;
                        if (var8_5 != null) break block25;
                        if (cJ.a("C", (Object)v1, (long)472005104666618989L, (long)var2_2) != null) {
                        }
                        ** GOTO lbl22
                    }
                    catch (MatchException v2) {
                        throw cJ.a("Z", (Object)v2, (long)472056367398426381L, (long)var2_2);
                    }
                    v1 = cJ.b;
                }
                catch (MatchException v3) {
                    throw cJ.a("Z", (Object)v3, (long)472056367398426381L, (long)var2_2);
                }
            }
            try {
                if (cJ.a("C", (Object)v1, (long)471796415337924769L, (long)var2_2) != null) break block26;
lbl22:
                // 2 sources

                return;
            }
            catch (MatchException v4) {
                throw cJ.a("Z", (Object)v4, (long)472056367398426381L, (long)var2_2);
            }
        }
        while (cJ.a("f", (Object)this.d, (long)469304635692204750L, (long)var2_2) == false) {
            block28: {
                block29: {
                    block27: {
                        var9_6 = (dV)cJ.a("f", (Object)this.d, (long)469473265658340894L, (long)var2_2);
                        try {
                            try {
                                v5 = var9_6;
                                if (var8_5 == null) {
                                    if (var8_5 != null) break block27;
                                }
                                ** GOTO lbl63
                            }
                            catch (MatchException v6) {
                                throw cJ.a("Z", (Object)v6, (long)472056367398426381L, (long)var2_2);
                            }
                            if (v5 == null) break block28;
                        }
                        catch (MatchException v7) {
                            throw cJ.a("Z", (Object)v7, (long)472056367398426381L, (long)var2_2);
                        }
                        v8 = var9_6;
                    }
                    try {
                        try {
                            if (var8_5 != null) break block29;
                            if (cJ.a("f", (Object)v8, (long)471902340741878233L, (long)var2_2) == false) break block28;
                        }
                        catch (MatchException v9) {
                            throw cJ.a("Z", (Object)v9, (long)472056367398426381L, (long)var2_2);
                        }
                        v8 = var9_6;
                    }
                    catch (MatchException v10) {
                        throw cJ.a("Z", (Object)v10, (long)472056367398426381L, (long)var2_2);
                    }
                }
                v11 = new Object[1];
                v11[0] = var4_3;
                cJ.a("f", (Object)v8, (Object)v11, (long)469176886272113101L, (long)var2_2);
            }
            if (var8_5 == null) continue;
        }
        while (cJ.a("f", (Object)this.e, (long)469304635692204750L, (long)var2_2) == false) {
            block31: {
                block32: {
                    block30: {
                        v5 = var9_6 = (dV)cJ.a("f", (Object)this.e, (long)469473265658340894L, (long)var2_2);
lbl63:
                        // 2 sources

                        try {
                            if (var8_5 != null) break block30;
                            if (v5 == null) break block31;
                        }
                        catch (MatchException v12) {
                            throw cJ.a("Z", (Object)v12, (long)472056367398426381L, (long)var2_2);
                        }
                        v5 = var9_6;
                    }
                    try {
                        try {
                            if (var8_5 != null) break block32;
                            if (cJ.a("f", (Object)v5, (long)471902340741878233L, (long)var2_2) != false) break block31;
                        }
                        catch (MatchException v13) {
                            throw cJ.a("Z", (Object)v13, (long)472056367398426381L, (long)var2_2);
                        }
                        v5 = var9_6;
                    }
                    catch (MatchException v14) {
                        throw cJ.a("Z", (Object)v14, (long)472056367398426381L, (long)var2_2);
                    }
                }
                v15 = new Object[1];
                v15[0] = var6_4;
                cJ.a("f", (Object)v5, (Object)v15, (long)468770068504126920L, (long)var2_2);
            }
            if (var8_5 == null) continue;
        }
    }

    @cP
    public void a(int n) {
        long l = g ^ 0x7EE1C0865A33L;
        cJ.a("f", (Object)cJ.a("f", (Object)this.a, (Object)new Object[0], (long)-6575450056646449833L, (long)l), (Object)cJ.a("Z", (int)n, (long)-6575776514520681183L, (long)l), (long)-6576341301234626343L, (long)l);
    }

    public void a(Object[] objectArray) {
        block4: {
            dV dV2 = (dV)objectArray[0];
            long l = (Long)objectArray[1];
            l = g ^ l;
            CallSite callSite = cJ.a("Z", (long)-7402874775516329535L, (long)l);
            try {
                CallSite callSite2;
                try {
                    callSite2 = cJ.a("f", (Object)this.d, (Object)dV2, (long)-7400304026739216453L, (long)l);
                    if (callSite != null || callSite2 != false) break block4;
                }
                catch (MatchException matchException) {
                    throw cJ.a("Z", (Object)matchException, (long)-7402959842052405053L, (long)l);
                }
                callSite2 = cJ.a("f", (Object)this.d, (Object)dV2, (long)-7400017773404287879L, (long)l);
            }
            catch (MatchException matchException) {
                throw cJ.a("Z", (Object)matchException, (long)-7402959842052405053L, (long)l);
            }
        }
    }

    private static Field g(long l, long l2) {
        int n = cJ.e(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = cJ.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = cJ.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = cJ.c(clazz3, string2, clazz2)) != null) {
                    cJ.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = cJ.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        cJ.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = cJ.f(373589376329904L, 0L);
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
            return MethodHandles.lookup().findStatic(cJ.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


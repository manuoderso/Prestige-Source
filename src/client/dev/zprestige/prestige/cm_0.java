/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.a6;
import dev.zprestige.prestige.aq_0;
import dev.zprestige.prestige.bC;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.dr_0;
import dev.zprestige.prestige.gK;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 * Renamed from dev.zprestige.prestige.cm
 */
public class cm_0 {
    private boolean a;
    private static final long b = hc.a(5982605562861208561L, -5330811072882077077L, MethodHandles.lookup().lookupClass()).a(215668357120955L);
    private static final Object[] c = new Object[40];
    private static final String[] d = new String[40];

    public cm_0(long l) {
        long l2 = (l = b ^ l) ^ 0x42C90B72E9DEL;
        this.a = 0;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = this;
        cm_0.a("\u00d6", (Object)cm_0.a("h", (long)2368498559496579061L, (long)l), (Object)objectArray, (long)2368582526761358249L, (long)l);
        cm_0.a("\u00d6", (Object)dr_0.a, this::lambda$new$0, (long)2364811460644429969L, (long)l);
    }

    static {
        cm_0.a();
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = cm_0.a(l, l2);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                cm_0.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = cm_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = cm_0.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = cm_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = cm_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = cm_0.a(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = cm_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = cm_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = cm_0.a(clazz3, string2, clazz2)) != null) {
                    cm_0.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = cm_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        cm_0.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = cm_0.b(630978322601862L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = cm_0.a(l, l2);
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
                clazz3 = cm_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = cm_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = cm_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        cm_0.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = cm_0.b(630978322601862L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = cm_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        cm_0.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = cm_0.b(630978322601862L, 0L);
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00b5' || c == 'W' || c == 'h' || c == '\u00ed') {
                field = cm_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00b5' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'W' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'h' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = cm_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d6' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'D' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
            throw new RuntimeException("dev/zprestige/prestige/cm" + " : " + string + " : " + methodType.toString(), exception);
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = cm_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @bP
    public void a(a6 a62) {
        long l = b ^ 0x1DA0ACE07F70L;
        long l2 = l ^ 0x29714FB73CEDL;
        CallSite callSite = cm_0.a("D", (long)3272455850671489287L, (long)l);
        cm_0.a("D", (long)3272564022854046919L, (long)l);
        CallSite callSite2 = callSite;
        CallSite callSite3 = cm_0.a("\u00d6", (Object)cm_0.a("\u00d6", (Object)cm_0.a("h", (long)3272891075135815879L, (long)l), (long)3270761950566516079L, (long)l), (long)3271062071501558239L, (long)l);
        while (cm_0.a("\u00d6", (Object)callSite3, (long)3270989004765117962L, (long)l) != false) {
            dV dV2;
            CallSite callSite4;
            block22: {
                dV dV3;
                block21: {
                    CallSite callSite5;
                    block20: {
                        block18: {
                            block19: {
                                dV3 = (dV)((Object)cm_0.a("\u00d6", (Object)callSite3, (long)3272374765820657924L, (long)l));
                                callSite4 = cm_0.a("\u00d6", (Object)dV3, (long)3272942142767592561L, (long)l);
                                try {
                                    try {
                                        try {
                                            try {
                                                callSite5 = callSite4;
                                                if (callSite2 != null) break block18;
                                                if (callSite5 == false) break block19;
                                            }
                                            catch (MatchException matchException) {
                                                throw cm_0.a("D", (Object)matchException, (long)3272715131099770747L, (long)l);
                                            }
                                            callSite5 = cm_0.a("\u00d6", (Object)dV3, (Object)new Object[0], (long)3271264846626594040L, (long)l);
                                            if (callSite2 != null) break block18;
                                        }
                                        catch (MatchException matchException) {
                                            throw cm_0.a("D", (Object)matchException, (long)3272715131099770747L, (long)l);
                                        }
                                        if (callSite5 != false) break block19;
                                    }
                                    catch (MatchException matchException) {
                                        throw cm_0.a("D", (Object)matchException, (long)3272715131099770747L, (long)l);
                                    }
                                    Object[] objectArray = new Object[1];
                                    objectArray[0] = l2;
                                    cm_0.a("\u00d6", (Object)dV3, (Object)objectArray, (long)3271171515300952929L, (long)l);
                                }
                                catch (MatchException matchException) {
                                    throw cm_0.a("D", (Object)matchException, (long)3272715131099770747L, (long)l);
                                }
                            }
                            callSite5 = callSite4;
                        }
                        try {
                            try {
                                try {
                                    if (callSite2 != null) break block20;
                                    if (callSite5 != false) break block21;
                                }
                                catch (MatchException matchException) {
                                    throw cm_0.a("D", (Object)matchException, (long)3272715131099770747L, (long)l);
                                }
                                dV2 = dV3;
                                if (callSite2 != null) break block22;
                            }
                            catch (MatchException matchException) {
                                throw cm_0.a("D", (Object)matchException, (long)3272715131099770747L, (long)l);
                            }
                            callSite5 = cm_0.a("\u00d6", (Object)dV2, (Object)new Object[0], (long)3271264846626594040L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw cm_0.a("D", (Object)matchException, (long)3272715131099770747L, (long)l);
                        }
                    }
                    try {
                        if (callSite5 != false) {
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l2;
                            cm_0.a("\u00d6", (Object)dV3, (Object)objectArray, (long)3271171515300952929L, (long)l);
                        }
                    }
                    catch (MatchException matchException) {
                        throw cm_0.a("D", (Object)matchException, (long)3272715131099770747L, (long)l);
                    }
                }
                dV2 = dV3;
            }
            cm_0.a("\u00d6", (Object)dV2, (Object)new Object[]{(boolean)callSite4}, (long)3272348590077752653L, (long)l);
            if (callSite2 == null) continue;
        }
    }

    @bP
    public void a(bC bC2) {
        long l = b ^ 0x4A9DFFC7F770L;
        try {
            if (this.a) {
                cm_0.a("\u00d6", (Object)bC2, (Object)new Object[0], (long)-6527078881638479805L, (long)l);
            }
        }
        catch (MatchException matchException) {
            throw cm_0.a("D", (Object)matchException, (long)-6527032872403409029L, (long)l);
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = c;
        c[0] = "\\\u001d'-czJ\u001d\"wpm]V!q|yL\u00116f7iT\u00114mm$h\n4pmc_\u001d";
        objectArray[1] = "6(r309 (wi#.7cto/:&$cxd.j";
        objectArray[2] = "\u0006dq\u0016\nQsDz\u0019\u001b\u001e\u0012Jq\u0012\u001fDf";
        objectArray[3] = Boolean.TYPE;
        cm_0.d[3] = "java/lang/Boolean";
        objectArray[4] = "\u001ei!1Pt\bi$kCc\u001f\"'mOw\u000ee0z\u0004`,";
        objectArray[5] = "obn\u0015\u0001/\u001aBe\u001a\u0010`{Ln\u0011\u0014:\u000f";
        objectArray[6] = Void.TYPE;
        cm_0.d[6] = "java/lang/Void";
        objectArray[7] = "~Mr\u0014@C`Eh['Bq^e\u0001\u0001D";
        objectArray[8] = "B?Uj2\u001fI0D%S\u0011B;@\u007f";
        objectArray[9] = "[wZ<\u0006#Mw_f\u00154Z<\\`\u0019 K{KwR2w";
        objectArray[10] = "3,>\"9,F\f5-(c;\u0014&*!*S";
        objectArray[11] = "=}\u0018v\u001a/+}\u001d,\t8<6\u001e*\u0005,-q\t=N\u00118l\u0007.\u0005";
        objectArray[12] = "_Ztb~[IZq8mL^\u0011r>aXOVe)*HV";
        objectArray[13] = "i>!6n\u0012b10y\r\u001fw<?\u00128\u001df/#>/\u0010";
        objectArray[14] = "\t\u007f/\u001a5[\u001f\u007f*@&L\b4)F*X\u0019s>QaH'";
        objectArray[15] = "muiqI|s}s>+`t`";
        objectArray[16] = "dl)Vj\u001e\u0011L\"Y{QpB)R\u007f\u000b\u0004";
        objectArray[17] = "\u000eiS\u0005d\u0001{IX\nuN\u001aGS\u0001q\u0014n";
        objectArray[18] = "g~w\u001fV_\u0012^|\u0010G\u0010sPw\u001bCJ\u0007";
        objectArray[19] = "1S\u0005o\u000b\u0006'S\u00005\u0018\u00110\u0018\u00033\u0014\u0005!_\u0014$_\u0014\u001a";
        objectArray[20] = "G\u0001P\u0013*\u000e2![\u001c;AS/P\u0017?\u001b'";
        objectArray[21] = "A\u0018D[|~M\u000fY\u0016w|\u0001\u001bQ\u0017hvLSQ\u0005s1J\u000bU\u001bn1j\u000bU\u001bn";
        objectArray[22] = "ug\\;\u0019h/+\u001b%&vN4\u0005z\u001dl, X4\u001b\u0017r?X%Msv0\u001a4&";
        objectArray[23] = "s}m9<\u0016#\u007fhmX\u000e#dp]fW(jb!'\u0004>u\f";
        objectArray[24] = "Su\\\u0012V\f\u0011kX\b/Xm4J\tV@\u00007S\bW2";
        objectArray[25] = "\u0000!Fu\u0014kYqNwiq0#Br\bzT'M0\u0019\u0011";
        objectArray[26] = "y$A.8\u001bhgO\u001fn#\u007f6\u000f~vY#%\u0017y";
        objectArray[27] = "\u0019mqR@7E~iU2$uoo\r\t6\u0017{2C\u000fMId2RY)MkpC2";
        objectArray[28] = "Nn\u0011Fl\u0017\u000e4F\\V\u0010~4H\u0007.DC9Z\u000fnyOg\u001aOkDBu\u0012\u000fV";
        objectArray[29] = "-\u0003ZTSAo\u001d^N*\u0016\u0013\u0010G\b\u0011\u0004q\u0004\u001aF\u0017\u007f/\u001b\u001aWA\u001b+\u0014XF*";
        objectArray[30] = "l\u00153By-}V=s)\u00157\u0018cN!gl\u000bdO";
        objectArray[31] = "{>C!\u001ca!r\u0004?#w@:\u001enB|8>\u0015nG\u001e";
        objectArray[32] = ".[\u001e?P\u0015uH\u0019>4\u000e\u001fB\u0002}P['\u0011\u001ds\u000bg";
        objectArray[33] = "7Z\u0001\u000e_i&\u0019\u000f?\u0007Qd\u001f\u000bU\u001d(=^\rX";
        objectArray[34] = "\b\f\u0019R-\u0014QM\u001f_S\u00071YC\u0006h\u0016SM\u001eHnm\u000bP\u0013Y1\u0015\u000f[\u0013\\S";
        objectArray[35] = "`z3\u001cL\u00160x6H(\b4h\u0014\u0015X\u0014])6HI\n%-=HLh";
        objectArray[36] = "?I]/~4lVStBm*XX\">k,5\u001f\"#h2KO &<V";
        objectArray[37] = ")+{`oJ-3g~VU)?}b*B>P\"&0Q*,cu&NDlz$7D huf&/";
        objectArray[38] = "?E\u000ep*\te\tIn\u0015\u001c\u0004\u0016W1.\rf\u0002\n\u007f(v8\u001d\nn~\u0012<\u0012H\u007f\u0015";
        Object[] objectArray2 = objectArray;
        objectArray[39] = "\\.c\u0005ds\u0006b$\u001b[gg}:D`w\u0005ig\nf\f]tj\u001b9tY\u007fj\u001e[";
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
            case 0 -> 5;
            case 1 -> 53;
            case 2 -> 40;
            case 3 -> 38;
            case 4 -> 49;
            case 5 -> 55;
            case 6 -> 50;
            case 7 -> 20;
            case 8 -> 32;
            case 9 -> 26;
            case 10 -> 28;
            case 11 -> 47;
            case 12 -> 54;
            case 13 -> 46;
            case 14 -> 10;
            case 15 -> 19;
            case 16 -> 59;
            case 17 -> 9;
            case 18 -> 3;
            case 19 -> 22;
            case 20 -> 13;
            case 21 -> 41;
            case 22 -> 34;
            case 23 -> 63;
            case 24 -> 12;
            case 25 -> 39;
            case 26 -> 30;
            case 27 -> 25;
            case 28 -> 18;
            case 29 -> 56;
            case 30 -> 62;
            case 31 -> 17;
            case 32 -> 15;
            case 33 -> 37;
            case 34 -> 31;
            case 35 -> 58;
            case 36 -> 21;
            case 37 -> 57;
            case 38 -> 42;
            case 39 -> 4;
            case 40 -> 1;
            case 41 -> 0;
            case 42 -> 24;
            case 43 -> 14;
            case 44 -> 36;
            case 45 -> 27;
            case 46 -> 35;
            case 47 -> 2;
            case 48 -> 44;
            case 49 -> 8;
            case 50 -> 51;
            case 51 -> 60;
            case 52 -> 48;
            case 53 -> 16;
            case 54 -> 7;
            case 55 -> 45;
            case 56 -> 11;
            case 57 -> 52;
            case 58 -> 6;
            case 59 -> 33;
            case 60 -> 29;
            case 61 -> 61;
            case 62 -> 23;
            default -> 43;
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
        cm_0.d[n3] = new String(cArray);
        return n3;
    }

    private void lambda$new$0(aq_0 aq_02, gK gK2) {
        long l = b ^ 0x50BC18C3CE5BL;
        long l2 = l ^ 0x2C45BD1FA4EFL;
        Object[] objectArray = new Object[3];
        objectArray[2] = l2;
        objectArray[1] = gK2;
        objectArray[0] = aq_02;
        this.a = cm_0.a("\u00d6", (Object)cm_0.a("h", (long)-7183461505877679444L, (long)l), (Object)objectArray, (long)-7183275326495411806L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(cm_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


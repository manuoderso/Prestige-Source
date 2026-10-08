/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bl_0;
import dev.zprestige.prestige.dO;
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
import java.util.Set;
import net.minecraft.class_310;

/*
 * Renamed from dev.zprestige.prestige.fq
 */
public class fq_0
extends dV {
    private dO a;
    private dO c;
    private f5 d;
    private float e;
    private static final long k = hc.a(-2232270689403172475L, -7246478262305165526L, MethodHandles.lookup().lookupClass()).a(134972319140623L);
    private static final Object[] l = new Object[41];
    private static final String[] m = new String[41];

    public fq_0() {
        long l = k ^ 0x180EFB3435L;
        long l2 = l ^ 0x1D2E567979B3L;
        this.d = new f5(l2);
        this.e = 200.0f;
    }

    static {
        fq_0.f();
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fq" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fq_0.m(l, l2);
            object = fq_0.l[n];
            try {
                if (!(object instanceof String)) break block2;
                fq_0.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fq_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fq_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fq_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fq_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = l;
        l[0] = "#Ph\u0018)\b5PmB:\u001f\"\u001bnD6\u000b3\\yS}\u001c)";
        objectArray[1] = "^Dwo\fc+d|`\u001d,Jjwk\u0019v>";
        objectArray[2] = Float.TYPE;
        fq_0.m[2] = "java/lang/Float";
        objectArray[3] = "f6\u0017Q\u0015:p6\u0012\u000b\u0006-g}\u0011\r\n9v:\u0006\u001aA.I";
        objectArray[4] = "(Orxv\b#@c7\u0017\u0006(Kgm";
        objectArray[5] = "I`\u000bL\u0016_Bo\u001a\u0003~_L`\t";
        objectArray[6] = "\r\u0017<)`\n\u0006\u0018-f\u0003\u0007\u0013\u001e";
        objectArray[7] = "\u0003tL\u001ap_\u0015tI@cH\u0002?JFo\\\u0013x]Q$I\u0016";
        objectArray[8] = "{hqdC\u000b\u000eHzkRDoFq`V\u001e\u001b";
        objectArray[9] = Void.TYPE;
        fq_0.m[9] = "java/lang/Void";
        objectArray[10] = "\u000evH,G9\u0018vMvT.\u000f=NpX:\u001ezYg\u0013(\"";
        objectArray[11] = "L%[kR\u00049\u0005PdCKD\u001dCcJ\u0002,";
        objectArray[12] = "Vyj\u00174sVy}K8|L2}U8iKC-\bi";
        objectArray[13] = "\u000f\u007fg\b]*\u000f\u007fpTQ%\u00154pJQ0\u0012E$\u0012\u0006";
        objectArray[14] = "\f\u0012ap\u0014=\u001a\u0012d*\u0007*\rYg,\u000b>\u001c\u001ep;@+]";
        objectArray[15] = "DRL\u0018FW1rG\u0017W\u0018P|L\u001cSB$";
        objectArray[16] = Boolean.TYPE;
        fq_0.m[16] = "java/lang/Boolean";
        objectArray[17] = "=c_{P;+cZ!C,<(Y'O8-oN0\u0004*,";
        objectArray[18] = "\u000e\u0016ls,i{6g|=&\u001a8lw9|n";
        objectArray[19] = "\u001ccGJ\u00056\u001ccP\u0016\t9\u0006(P\b\t,\u0001Y\u0007W_";
        objectArray[20] = "8!\u007fx$\u00063.n7G\u000b&#a\\r\t70}pe\u0004";
        objectArray[21] = "\u001bzmv\u00165\rzh,\u0005\"\u001a1k*\t6\u000bv|=B&\u0013v~6\u0018k/m~+\u0018,\u0018z";
        objectArray[22] = "\f\u0014Y8l@y4R7}\u000f\u0018:Y<yUl";
        objectArray[23] = "yOxp[\u0014\fos\u007fJ[maxtN\u0001\u0019";
        objectArray[24] = "%AF(BS;I\\g?C;";
        objectArray[25] = "\u0000xlqYIG+3v%A?~&0\u0018N\u000f%1%I+";
        objectArray[26] = "X\u001f&\u0000\u007ft\u000fB5\u001b\u0013x\t\u00170\u0010D/W@h|\"r\u0017Ch\u0013yk\nG";
        objectArray[27] = "_Y&IKT\u0004\u001e<\u00002\u0005nH7\u001c\u000fV\u0012Y0\u001aRl\u0004C%\rX\u000b\u0003\u001a?\u00152";
        objectArray[28] = "b \u000f\u0005p<b>LVL:\t#\u0013\u0005qiu2\u0014\u0003,S76\u0006\t\"mj+A\u0016L";
        objectArray[29] = "UTu,\u0018U\f\\&1cViIp!^\u000e\u0015Xw'\u00034W\\e-\r\n\nA\"2c";
        objectArray[30] = ")TF\u0019#7~\tU\u0002O;x\\P\t\u0018l&\f\te#4|NZ]*-\"\r";
        objectArray[31] = "0E2\u000e\\[~\u0012n6[:`\u001b9\u000b\bFq\u001c?V2\u0003v\u0019$_\\\u000bu\u0017k6";
        objectArray[32] = "n:\u000b\feU72X\u0011\u001e]R$\u001f\u0007$\t<%\u001d\u0011f4>7\nW#Z?5\u001c\u0015\u001e";
        objectArray[33] = "d+Ak\u001c\u0019?2\\o \u001383^5L!kv\u0007o \u001c13C8G\u001bh)[R";
        objectArray[34] = "Er\u0010)\u0013bP~Fj\u007fx(z\u0016e\u0013&Gz\b&@";
        objectArray[35] = "\u001e\u0018s@\u0007v^\r6Ugv$Jd\u0001\f.\u0019\nu\u0007Z\u001f";
        objectArray[36] = "\u0006>K\fb3\u0019\u007fN\u000f[3\u0007F\u000e\u001fe?X{N\u000ecii}ZN0eT=KHfT\u0006>K\fb3\u0019\u007fN\u000f[";
        objectArray[37] = "hG\u0001t_`0\u0007\u001dioo0\u001c\u0016v1h0\u0006\u0012\nVx8\n\u0016d^{6E\u007f";
        objectArray[38] = "2{st\u0014wi<i=m&\u0003jb!Pu\u007f{e'\rO=\u007fw-\u0003q`b02m";
        objectArray[39] = "9M\u0016{a<9SU(]:RN\n{`i._\r}=S8E\u0018j74?\u001c\u0002r]";
        Object[] objectArray2 = objectArray;
        objectArray[40] = "vp8yB\u000f(k :rP#b\\?\u000bY;{27\bWt\u0012e\u007f\u001eD#|m|\u0010\u000bJ+%j\u0003\\$#&dL5";
    }

    @Override
    public void d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x32669ABAFF6EL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        fq_0.b("\u00df", (Object)this, (Object)objectArray2, (long)3242913126636283630L, (long)l);
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = fq_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c9' || c == '\u00ef' || c == 'G' || c == 'F') {
                field = fq_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c9' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ef' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'G' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fq_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00df' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'v' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @bP
    public void a(bl_0 bl_02) {
        f5 f52;
        long l;
        long l2;
        block23: {
            CallSite callSite;
            long l3;
            long l4;
            block21: {
                CallSite callSite2;
                long l5;
                block22: {
                    block18: {
                        block20: {
                            CallSite callSite3;
                            long l6;
                            block19: {
                                class_310 class_3102;
                                block17: {
                                    long l7 = l2 = k ^ 0x5D92918E6F60L;
                                    l4 = l7 ^ 0x604AC308E85FL;
                                    l3 = l7 ^ 0x19088B350B13L;
                                    l = l7 ^ 0x25E0290C6E6L;
                                    l5 = l7 ^ 0x550A5BD7FE77L;
                                    l6 = l7 ^ 0x7D4297DBAEADL;
                                    callSite2 = fq_0.b("v", (long)-2775015705019401157L, (long)l2);
                                    try {
                                        try {
                                            class_3102 = b;
                                            if (callSite2 != null) break block17;
                                            if (fq_0.b("\u00c9", (Object)class_3102, (long)-2775099408027231641L, (long)l2) != null) break block18;
                                        }
                                        catch (MatchException matchException) {
                                            throw fq_0.b("v", (Object)matchException, (long)-2777754071528048228L, (long)l2);
                                        }
                                        class_3102 = b;
                                    }
                                    catch (MatchException matchException) {
                                        throw fq_0.b("v", (Object)matchException, (long)-2777754071528048228L, (long)l2);
                                    }
                                }
                                try {
                                    try {
                                        callSite3 = fq_0.b("\u00c9", (Object)class_3102, (long)-2774842237530082655L, (long)l2);
                                        if (callSite2 != null) break block19;
                                        if (callSite3 == null) break block18;
                                    }
                                    catch (MatchException matchException) {
                                        throw fq_0.b("v", (Object)matchException, (long)-2777754071528048228L, (long)l2);
                                    }
                                    callSite3 = fq_0.b("\u00c9", (Object)b, (long)-2774842237530082655L, (long)l2);
                                }
                                catch (MatchException matchException) {
                                    throw fq_0.b("v", (Object)matchException, (long)-2777754071528048228L, (long)l2);
                                }
                            }
                            try {
                                try {
                                    callSite = fq_0.b("\u00df", (Object)callSite3, (long)-2777863987664470306L, (long)l2);
                                    if (callSite2 != null) break block20;
                                    if (callSite != false) break block18;
                                }
                                catch (MatchException matchException) {
                                    throw fq_0.b("v", (Object)matchException, (long)-2777754071528048228L, (long)l2);
                                }
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l6;
                                callSite = fq_0.b("\u00df", (Object)fq_0.b("G", (long)-2777663000735950246L, (long)l2), (Object)objectArray, (long)-2777963676368015607L, (long)l2);
                            }
                            catch (MatchException matchException) {
                                throw fq_0.b("v", (Object)matchException, (long)-2777754071528048228L, (long)l2);
                            }
                        }
                        try {
                            if (callSite2 != null) break block21;
                            if (callSite == false) break block22;
                        }
                        catch (MatchException matchException) {
                            throw fq_0.b("v", (Object)matchException, (long)-2777754071528048228L, (long)l2);
                        }
                    }
                    return;
                }
                try {
                    f52 = this.d;
                    if (callSite2 != null) break block23;
                    Object[] objectArray = new Object[2];
                    objectArray[1] = l5;
                    objectArray[0] = Float.valueOf(this.e);
                    callSite = fq_0.b("\u00df", (Object)f52, (Object)objectArray, (long)-2774890916045032071L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw fq_0.b("v", (Object)matchException, (long)-2777754071528048228L, (long)l2);
                }
            }
            if (callSite == false) {
                return;
            }
            Object[] objectArray = new Object[3];
            objectArray[2] = l4;
            objectArray[1] = Float.valueOf(0.0f);
            objectArray[0] = 1;
            fq_0.b("\u00df", (Object)fq_0.b("G", (long)-2777663000735950246L, (long)l2), (Object)objectArray, (long)-2775224692769524841L, (long)l2);
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l3;
            fq_0.b("\u00df", (Object)this, (Object)objectArray2, (long)-2775326637987425645L, (long)l2);
            f52 = this.d;
        }
        Object[] objectArray = new Object[1];
        objectArray[0] = l;
        fq_0.b("\u00df", (Object)f52, (Object)objectArray, (long)-2777895485525844842L, (long)l2);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return fq_0.b("v", (Object)((Object)q_0.Sword), (Object)((Object)q_0.UHC), (long)-2447374395451116064L, (long)l);
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n3] != null) {
            return n3;
        }
        Object object = fq_0.l[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 35;
            case 1 -> 52;
            case 2 -> 58;
            case 3 -> 9;
            case 4 -> 11;
            case 5 -> 19;
            case 6 -> 0;
            case 7 -> 6;
            case 8 -> 12;
            case 9 -> 16;
            case 10 -> 32;
            case 11 -> 50;
            case 12 -> 4;
            case 13 -> 49;
            case 14 -> 43;
            case 15 -> 17;
            case 16 -> 41;
            case 17 -> 22;
            case 18 -> 59;
            case 19 -> 13;
            case 20 -> 2;
            case 21 -> 36;
            case 22 -> 44;
            case 23 -> 39;
            case 24 -> 45;
            case 25 -> 21;
            case 26 -> 61;
            case 27 -> 40;
            case 28 -> 25;
            case 29 -> 14;
            case 30 -> 48;
            case 31 -> 29;
            case 32 -> 54;
            case 33 -> 3;
            case 34 -> 63;
            case 35 -> 55;
            case 36 -> 60;
            case 37 -> 15;
            case 38 -> 27;
            case 39 -> 56;
            case 40 -> 18;
            case 41 -> 62;
            case 42 -> 7;
            case 43 -> 57;
            case 44 -> 20;
            case 45 -> 34;
            case 46 -> 38;
            case 47 -> 47;
            case 48 -> 31;
            case 49 -> 26;
            case 50 -> 1;
            case 51 -> 30;
            case 52 -> 28;
            case 53 -> 5;
            case 54 -> 51;
            case 55 -> 24;
            case 56 -> 33;
            case 57 -> 23;
            case 58 -> 10;
            case 59 -> 8;
            case 60 -> 42;
            case 61 -> 46;
            case 62 -> 53;
            default -> 37;
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
        fq_0.m[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = fq_0.m(l, l2);
        Object object = fq_0.l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = fq_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fq_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fq_0.g(clazz3, string2, clazz2)) != null) {
                    fq_0.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fq_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fq_0.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fq_0.n(350314488837365L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = fq_0.m(l, l2);
        Object object = fq_0.l[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = m[n];
                int n3 = string2.indexOf(8);
                clazz3 = fq_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fq_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fq_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        fq_0.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fq_0.n(350314488837365L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fq_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fq_0.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fq_0.n(350314488837365L, 0L);
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

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private void j(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = k ^ l) ^ 0x5E4058753D3EL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = Float.valueOf((float)fq_0.b("\u00df", (Object)((Float)((Object)fq_0.b("\u00df", (Object)this.c, (long)7240581109631887538L, (long)l))), (long)7240117610632896990L, (long)l));
        objectArray2[0] = Float.valueOf((float)fq_0.b("v", (float)fq_0.b("\u00df", (Object)((Float)((Object)fq_0.b("\u00df", (Object)this.a, (long)7240581109631887538L, (long)l))), (long)7240117610632896990L, (long)l), (float)1.0f, (long)7239925665531486526L, (long)l));
        this.e = 1000.0f / fq_0.b("v", (Object)objectArray2, (long)7238605323689283603L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fq_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


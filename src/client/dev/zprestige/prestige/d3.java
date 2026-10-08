/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_3965
 *  net.minecraft.class_3966
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.a9;
import dev.zprestige.prestige.aL;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_3965;
import net.minecraft.class_3966;

public class d3
extends dV {
    private dM d;
    private dM a;
    private dM c;
    private dM e;
    private dM f;
    private static final long k = hc.a(7500229596975094250L, -3407459631630640598L, MethodHandles.lookup().lookupClass()).a(231660642202294L);
    private static final Object[] l = new Object[72];
    private static final String[] m = new String[72];

    static {
        d3.f();
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/d3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = d3.m(l, l2);
            object = d3.l[n];
            try {
                if (!(object instanceof String)) break block2;
                d3.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = d3.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = d3.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = d3.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = d3.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = l;
        l[0] = "b\u001cVOzeb\u001cA\u0013vjxWA\rv\u007f\u007f&\u0011X!:";
        objectArray[1] = "I\u0006\u001d_YcI\u0006\n\u0003UlSM\n\u001dUyT<XC\r=";
        objectArray[2] = "*\u0013_>\u0019\u0019<\u0013Zd\n\u000e+XYb\u0006\u001a:\u001fNuM\b\u0006";
        objectArray[3] = "\u0002n\b@+gwN\u0003O:(\nV\u0010H3ab";
        objectArray[4] = ">GCs f>GT/,i$\fT1,|#}\u0004l}";
        objectArray[5] = "\u0013>,KN\u0003\u0013>;\u0017B\f\tu;\tB\u0019\u000e\u0004jV\u001a";
        objectArray[6] = "M\n2F^QM\n%\u001aR^WA%\u0004RKP0q\\\u0005";
        objectArray[7] = "P\u001dW\u000e^\u0013%=\\\u0001O\\D3W\nK\u00060";
        objectArray[8] = Void.TYPE;
        d3.m[8] = "java/lang/Void";
        objectArray[9] = "sLb\n]wsLuVQxi\u0007uHQmnv'\u0012\u0005)";
        objectArray[10] = Boolean.TYPE;
        d3.m[10] = "java/lang/Boolean";
        objectArray[11] = "ou,\u0017'Tdz=XKWjx?\u0017g";
        objectArray[12] = "C\u000be2&\"C\u000brn*-Y@rp*8^1 +rr";
        objectArray[13] = "81+',H.1.}?_9z-{3K(=:lx\\\u0017";
        objectArray[14] = "\u0019FUz|\u0013\u0012ID5\u001d\u001d\u0019B@o";
        objectArray[15] = "*fg`M.<fb:^9+-a<R-:jv+\u0019=<";
        objectArray[16] = "\u0019~~SD!l^u\\Un\rP~WQ4y";
        objectArray[17] = "\rpV]s\u0011\rpA\u0001\u007f\u001e\u0017;A\u001f\u007f\u000b\u0010J\u0013D'J";
        objectArray[18] = "\u00125;Zp|\u00045>\u0000ck\u0013~=\u0006o\u007f\u00029*\u0011$hE";
        objectArray[19] = "l\u001eYxtGg\u0011H7\u0017Jr\u001cG\\\"Hc\u000f[p5E";
        objectArray[20] = "\u000f{oA\u0013\b\u000f{x\u001d\u001f\u0007\u00150x\u0003\u001f\u0012\u0012A*WNS";
        objectArray[21] = ":\u0015\u007f400O5t;!\u007f.;\u007f0%%Z";
        objectArray[22] = "+l`~B#+lw\"N,1'w<N96V&b\u001b|";
        objectArray[23] = "&N#\u0013\u0003\u001c&N4O\u000f\u0013<\u00054Q\u000f\u0006;te\u000fZM";
        objectArray[24] = "H\u0007\u000f4\u000bS^\u0007\nn\u0018DIL\th\u0014PX\u000b\u001e\u007f_BC";
        objectArray[25] = "y\u0004*NwI\f$!Af\u0006m**Jb\\\u0019";
        objectArray[26] = "L^U2aV9~^=p\u0019XpU6tC,";
        objectArray[27] = Integer.TYPE;
        d3.m[27] = "java/lang/Integer";
        objectArray[28] = "d\u000b\u00193/(\u0011+\u0012<>gp%\u00197:=\u0004";
        objectArray[29] = "5t$\u001e\u0015+@T/\u0011\u0004d!Z$\u001a\u0000>U";
        objectArray[30] = "\"!\u001dCqk\"!\n\u001f}d8j\n\u0001}q?\u001bZT*7";
        objectArray[31] = "\u0005\u001cPs+r\u0005\u001cG/'}\u001fWG1'h\u0018&\u0016nu#";
        objectArray[32] = ".{7\u0011,k8{2K?|/01M3h>w&Zxxr";
        objectArray[33] = "\u0018\u0003\u001dxQum#\u0016w@:\f-\u001d|D`x";
        objectArray[34] = "<\u007fl2X\u0014I_g=I[(Ql6M\u0001\\";
        objectArray[35] = "\u001e\u001f(v8\u0011k?#y)^\n1(r-\u0004~";
        objectArray[36] = "\r\u001b\thyeZ\u0005\u0001?Bb\\\u001f\u0005c.P\f\\\\9B9CS\u000b?,6M\u001e\u0018\u0004";
        objectArray[37] = "iH\u000e&\u0001#/WK+j(P\u001d\u001f \u0014::CK`\u0018B";
        objectArray[38] = "+\u0002x\u0005\nit\u0014c\u001de}q\u0002f\u00172*/Q?{^tw\u001di\u0003Xvs\u0005";
        objectArray[39] = "y`\u0017X\u0013|&v\f@|h#`\tJ+?}7Q&@~.aVD\u0017`&6";
        objectArray[40] = "|\u000e\u001d\n\u001f\u0010:\u0011X\u0007t\u0018E\u0006\u001e\u0016\u0012I>\u0018\u001b\u001b\rq{\\]\u000f\t\n>]\u000bOt";
        objectArray[41] = "aGS\u0005<\u000b7\bZ\r\f\u0001\nQF\u000bjPqOC\u0006uh4D\u000e\u00057\u0006;JC\u0016\f";
        objectArray[42] = "(hA\u0017\u0018\u000f%xA\u0013z\u000f$g]E-Q\u007f:\u0000)\u0010\u001d(sRM\u0018\u001bzr";
        objectArray[43] = "\u0004JP\u0007e9\tZP\u0003\u00079\bELUPmS\u0014\u0012\u0000\u0007=\u0015EQRc5\u0013\u0017P";
        objectArray[44] = "V_Pk[[RUHz L\u0005GNcL~V\u0002\u00179 \u0017\u001a\u000b@?N\u0018\u0014FS\u0004";
        objectArray[45] = "t\u0016y%8dy\u0006y!Zdx\u0019ew\r:#D>\u001b0vt\rj\u007f8p&\f";
        objectArray[46] = "W\u001cr\f)\u0018MX,NIN7GnP/\u001fLYk]0'UK{Q0J]J*\\I";
        objectArray[47] = "Uh|\u007f-\u000eXx|{O\u000eYg`-\u0018P\u000615A%\u001cUso%-\u001a\u0007r";
        objectArray[48] = "3\u0017\u0001/x\bg\u001f\u000f)\u0011\u0001n\u0012\u000b7}3<_Uh\u0011Zq^\u0005k\u007fU\u007f\u0013\u0016P";
        objectArray[49] = "bd`mml2vfb\u00113m`;hFg74b>\u00112f3gdc3|46";
        objectArray[50] = "\u0017]\u0000\u000fl\u000b@C\bXW\fFY\f\u0004;>\u0015\u001dP\\WYRO\u0013\n;\rZA\u0015c";
        objectArray[51] = "kn\u0005\rqZagHR\u0014[\u0002l\f\tr\u0004yr\t\u0004m<<yD\u0007/R3w\t\u0014\u0014";
        objectArray[52] = "si\u001f[v|wc\u0007J\rk q\u0001SaYs5Z\f\r>4g\u001e]aj<i\u00184";
        objectArray[53] = "\u0005157\u0001lS~<?1fn,idWc^y<7\u000b\u000f\u0002qe?]?W$6c1";
        objectArray[54] = ".-\u001ekNo#=\u001eo,o\"\"\u00029{1yr[UF}.6\r1N{|7";
        objectArray[55] = "w\u000fQ`Viz\u001fQd4i{\u0000M2c7 ]\u0019^^{w\u0014B:V}%\u0015";
        objectArray[56] = "9]BYK)|E\u0001 \u0017%~X\\L%q=\u0007\u000b\u001ar0f\u0005\\C\u0017-{V;";
        objectArray[57] = "Jk\n\u0011b\u001fG{\n\u0015\u0000\u001fFd\u0016CWA\u001c1K/j\rJp\u0019Kb\u000b\u0018q";
        objectArray[58] = "r&\u001fVh\u0013\"4\u0019Y\u0014L}\"DSC\u001b$s\u001c\u0004\u0014Mvq\u0018_fLlvI";
        objectArray[59] = "\u0001l\u001c,i\u0013\u001b(Bn\tAa7\u0000po\u0014\u001a)\u0005}p,_\"H~2BP,\u0005m\t";
        objectArray[60] = "\u007f\u000f_t er\u001f_pBes\u0000C&\u0015;)\\\u0016J(w\u007f\u0014L. q-\u0015";
        objectArray[61] = "Pq\u0011\u0006$\u000f\u001exC\tT\u001b\u0007/I\u0004=\u0017>!I\u00149q^:\u001d\u0007o\u001fQ4P\u0014T";
        objectArray[62] = "\u0015G#5:5\u001fNnj_9|E*19k\u0007[/<&SBPb?d=M^/,_";
        objectArray[63] = "VozM\bB\u0001qr\u001a3E\u0007kvF_wT/)\u00103\u0010\u0013}iH_D\u001bso!";
        objectArray[64] = "[Cm\u001dd\u0012QJ B\u0001\u00102Ad\u0019gLI_a\u0014xt\fT,\u0017:\u001a\u0003Za\u0004\u0001";
        objectArray[65] = "O[oLGhD\u000fi\u0012|;~Y{Q\u0006i\u0010K#C\u0006R";
        objectArray[66] = "\tf\r%V\u0007\u0013\"Sg6Ri=\u0011yP\u0000\u0012#\u0014tO8W(Yw\rVX&\u0014d6";
        objectArray[67] = "ddWGjrnm\u001a\u0018\u000f}\rf^Ci,vx[Nv\u00143s\u0016M4z<}[^\u000f";
        objectArray[68] = "L!z\u001b.\u0017Vix_\u0011\u0013B,yE}!\u0016o&\u001d.vK)~\u0019sIK:v\u001f\u0011";
        objectArray[69] = "`\u0004@\u0004nX~\u0006_\n\u0005Q\u0005\fDZc\u0000~\u0012AW|8;\u0019\fT>V4\u0017AG\u0005";
        objectArray[70] = "s\u000f|2\u001cM'\u0007r4uD.\nv*\u0019vxO+rI!)\n{4\u001eE!\f)5u\u001f1Fxv\u001b\u0010?\u000bkM";
        Object[] objectArray2 = objectArray;
        objectArray[71] = "?UyRF\u00002EyV$\u00003Ze\u0000s^b\u000f8lN\u0012?Nj\bF\u0014mO";
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'D' || c == 'b' || c == 'x' || c == '\u00a5') {
                field = d3.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'D' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'b' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'x' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = d3.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'i' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'M' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = d3.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @bP
    public void a(aL aL2) {
        CallSite callSite;
        long l;
        block29: {
            CallSite callSite2;
            CallSite callSite3;
            block28: {
                block27: {
                    CallSite callSite4;
                    long l2;
                    block26: {
                        CallSite callSite5;
                        block25: {
                            l = k ^ 0x5CCFBD2EC38EL;
                            l2 = l ^ 0x2570649A643L;
                            callSite3 = d3.b("D", (Object)b, (long)9112405262124970038L, (long)l);
                            callSite2 = d3.b("M", (long)9112225958553421735L, (long)l);
                            try {
                                try {
                                    callSite5 = callSite3;
                                    if (callSite2 != null) break block25;
                                    if (!(callSite5 instanceof class_3966)) return;
                                }
                                catch (MatchException matchException) {
                                    throw d3.b("M", (Object)matchException, (long)9111092321640747989L, (long)l);
                                }
                                callSite5 = callSite3;
                            }
                            catch (MatchException matchException) {
                                throw d3.b("M", (Object)matchException, (long)9111092321640747989L, (long)l);
                            }
                        }
                        class_3966 class_39662 = (class_3966)callSite5;
                        try {
                            if (callSite2 != null) {
                                return;
                            }
                        }
                        catch (MatchException matchException) {
                            throw d3.b("M", (Object)matchException, (long)9111092321640747989L, (long)l);
                        }
                        CallSite callSite6 = d3.b("i", (Object)class_39662, (long)9111441276972427278L, (long)l);
                        try {
                            try {
                                callSite4 = callSite6;
                                if (callSite2 != null) break block26;
                                if (!(callSite4 instanceof class_1657)) return;
                            }
                            catch (MatchException matchException) {
                                throw d3.b("M", (Object)matchException, (long)9111092321640747989L, (long)l);
                            }
                            callSite4 = callSite6;
                        }
                        catch (MatchException matchException) {
                            throw d3.b("M", (Object)matchException, (long)9111092321640747989L, (long)l);
                        }
                    }
                    callSite3 = (class_1657)callSite4;
                    try {
                        try {
                            callSite = d3.b("i", (Object)((Boolean)((Object)d3.b("i", (Object)this.f, (long)9109672093563269246L, (long)l))), (long)9111642901578857565L, (long)l);
                            if (callSite2 != null) break block27;
                            if (callSite == false) return;
                        }
                        catch (MatchException matchException) {
                            throw d3.b("M", (Object)matchException, (long)9111092321640747989L, (long)l);
                        }
                        Object[] objectArray = new Object[2];
                        objectArray[1] = l2;
                        objectArray[0] = d3.b("i", (Object)d3.b("D", (Object)b, (long)9112365410027537135L, (long)l), (long)9110996922611110301L, (long)l);
                        callSite = d3.b("M", (Object)objectArray, (long)9109853011297314490L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw d3.b("M", (Object)matchException, (long)9111092321640747989L, (long)l);
                    }
                }
                try {
                    try {
                        if (callSite2 != null) break block28;
                        if (callSite == false) return;
                    }
                    catch (MatchException matchException) {
                        throw d3.b("M", (Object)matchException, (long)9111092321640747989L, (long)l);
                    }
                    callSite = d3.b("i", (Object)callSite3, (long)9112854818515757008L, (long)l);
                }
                catch (MatchException matchException) {
                    throw d3.b("M", (Object)matchException, (long)9111092321640747989L, (long)l);
                }
            }
            try {
                try {
                    if (callSite2 != null) break block29;
                    if (callSite == false) return;
                }
                catch (MatchException matchException) {
                    throw d3.b("M", (Object)matchException, (long)9111092321640747989L, (long)l);
                }
                callSite = d3.b("i", (Object)d3.b("i", (Object)callSite3, (long)9111140844658596921L, (long)l), (Object)d3.b("x", (long)9111293871674316224L, (long)l), (long)9110181939214803738L, (long)l);
            }
            catch (MatchException matchException) {
                throw d3.b("M", (Object)matchException, (long)9111092321640747989L, (long)l);
            }
        }
        try {
            if (callSite == false) return;
            d3.b("i", (Object)aL2, (Object)new Object[0], (long)9112600535040241378L, (long)l);
            return;
        }
        catch (MatchException matchException) {
            throw d3.b("M", (Object)matchException, (long)9111092321640747989L, (long)l);
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private boolean a(Object[] objectArray) {
        Object object;
        block42: {
            block44: {
                block43: {
                    CallSite callSite;
                    long l;
                    class_1799 class_17992;
                    block40: {
                        block41: {
                            Object object2;
                            block38: {
                                block39: {
                                    long l2;
                                    long l3;
                                    block36: {
                                        long l4;
                                        block37: {
                                            class_17992 = (class_1799)objectArray[0];
                                            l = (Long)objectArray[1];
                                            long l5 = l = k ^ l;
                                            l4 = l5 ^ 0x3172398D1678L;
                                            l3 = l5 ^ 0x2352627EDA2AL;
                                            l2 = l5 ^ 0x3C2B793DE77BL;
                                            callSite = d3.b("M", (long)-3580904732791720036L, (long)l);
                                            try {
                                                try {
                                                    object2 = d3.b("i", (Object)class_17992, (long)-3581671899951066048L, (long)l);
                                                    if (callSite != null) break block36;
                                                    if (object2 == false) break block37;
                                                }
                                                catch (MatchException matchException) {
                                                    throw d3.b("M", (Object)matchException, (long)-3582005385111067666L, (long)l);
                                                }
                                                return false;
                                            }
                                            catch (MatchException matchException) {
                                                throw d3.b("M", (Object)matchException, (long)-3582005385111067666L, (long)l);
                                            }
                                        }
                                        Object[] objectArray2 = new Object[2];
                                        objectArray2[1] = l4;
                                        objectArray2[0] = class_17992;
                                        object2 = d3.b("M", (Object)objectArray2, (long)-3578250465178904959L, (long)l);
                                    }
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (callSite != null) break block38;
                                                        if (object2 != false) break block39;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw d3.b("M", (Object)matchException, (long)-3582005385111067666L, (long)l);
                                                    }
                                                    Object[] objectArray3 = new Object[2];
                                                    objectArray3[1] = l3;
                                                    objectArray3[0] = class_17992;
                                                    object2 = d3.b("M", (Object)objectArray3, (long)-3582366732417447095L, (long)l);
                                                    if (callSite != null) break block38;
                                                }
                                                catch (MatchException matchException) {
                                                    throw d3.b("M", (Object)matchException, (long)-3582005385111067666L, (long)l);
                                                }
                                                if (object2 != false) break block39;
                                            }
                                            catch (MatchException matchException) {
                                                throw d3.b("M", (Object)matchException, (long)-3582005385111067666L, (long)l);
                                            }
                                            Object[] objectArray4 = new Object[2];
                                            objectArray4[1] = l2;
                                            objectArray4[0] = class_17992;
                                            object = d3.b("M", (Object)objectArray4, (long)-3581623653195213813L, (long)l);
                                            if (callSite != null) break block40;
                                        }
                                        catch (MatchException matchException) {
                                            throw d3.b("M", (Object)matchException, (long)-3582005385111067666L, (long)l);
                                        }
                                        if (object == false) break block41;
                                    }
                                    catch (MatchException matchException) {
                                        throw d3.b("M", (Object)matchException, (long)-3582005385111067666L, (long)l);
                                    }
                                }
                                object2 = 1;
                            }
                            return (boolean)object2;
                        }
                        object = d3.b("i", (Object)class_17992, (Object)d3.b("x", (long)-3582270590322189849L, (long)l), (long)-3578412194316463327L, (long)l);
                    }
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (callSite != null) break block42;
                                                                if (object != false) break block43;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw d3.b("M", (Object)matchException, (long)-3582005385111067666L, (long)l);
                                                            }
                                                            object = d3.b("i", (Object)class_17992, (Object)d3.b("x", (long)-3580992685845559347L, (long)l), (long)-3578412194316463327L, (long)l);
                                                            if (callSite != null) break block42;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw d3.b("M", (Object)matchException, (long)-3582005385111067666L, (long)l);
                                                        }
                                                        if (object != false) break block43;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw d3.b("M", (Object)matchException, (long)-3582005385111067666L, (long)l);
                                                    }
                                                    object = d3.b("i", (Object)class_17992, (Object)d3.b("x", (long)-3580997151580633823L, (long)l), (long)-3578412194316463327L, (long)l);
                                                    if (callSite != null) break block42;
                                                }
                                                catch (MatchException matchException) {
                                                    throw d3.b("M", (Object)matchException, (long)-3582005385111067666L, (long)l);
                                                }
                                                if (object != false) break block43;
                                            }
                                            catch (MatchException matchException) {
                                                throw d3.b("M", (Object)matchException, (long)-3582005385111067666L, (long)l);
                                            }
                                            object = d3.b("i", (Object)class_17992, (Object)d3.b("x", (long)-3581865706990557215L, (long)l), (long)-3578412194316463327L, (long)l);
                                            if (callSite != null) break block42;
                                        }
                                        catch (MatchException matchException) {
                                            throw d3.b("M", (Object)matchException, (long)-3582005385111067666L, (long)l);
                                        }
                                        if (object != false) break block43;
                                    }
                                    catch (MatchException matchException) {
                                        throw d3.b("M", (Object)matchException, (long)-3582005385111067666L, (long)l);
                                    }
                                    object = d3.b("i", (Object)class_17992, (Object)d3.b("x", (long)-3581442747701480349L, (long)l), (long)-3578412194316463327L, (long)l);
                                    if (callSite != null) break block42;
                                }
                                catch (MatchException matchException) {
                                    throw d3.b("M", (Object)matchException, (long)-3582005385111067666L, (long)l);
                                }
                                if (object != false) break block43;
                            }
                            catch (MatchException matchException) {
                                throw d3.b("M", (Object)matchException, (long)-3582005385111067666L, (long)l);
                            }
                            object = d3.b("i", (Object)class_17992, (Object)d3.b("x", (long)-3578489996993325912L, (long)l), (long)-3578412194316463327L, (long)l);
                            if (callSite != null) break block42;
                        }
                        catch (MatchException matchException) {
                            throw d3.b("M", (Object)matchException, (long)-3582005385111067666L, (long)l);
                        }
                        if (object == false) break block44;
                    }
                    catch (MatchException matchException) {
                        throw d3.b("M", (Object)matchException, (long)-3582005385111067666L, (long)l);
                    }
                }
                object = 1;
                break block42;
            }
            object = 0;
        }
        return (boolean)object;
    }

    /*
     * Unable to fully structure code
     */
    @bP
    public void a(a9 var1_1) {
        block100: {
            block103: {
                block101: {
                    block99: {
                        block96: {
                            block97: {
                                block98: {
                                    block95: {
                                        block93: {
                                            block94: {
                                                block91: {
                                                    block92: {
                                                        block90: {
                                                            block89: {
                                                                block88: {
                                                                    block85: {
                                                                        block87: {
                                                                            block86: {
                                                                                block84: {
                                                                                    v0 = var2_2 = d3.k ^ 121601170900801L;
                                                                                    var4_3 = v0 ^ 34496862212425L;
                                                                                    var6_4 = v0 ^ 11298475059580L;
                                                                                    var8_5 = v0 ^ 45542963894242L;
                                                                                    var10_6 = v0 ^ 25308210501358L;
                                                                                    var12_7 = v0 ^ 140442864646381L;
                                                                                    var14_8 = v0 ^ 48147794446598L;
                                                                                    var16_9 = d3.b("M", (long)4231716157853123432L, (long)var2_2);
                                                                                    try {
                                                                                        try {
                                                                                            v1 = d3.b("i", (Object)((Boolean)d3.b("i", (Object)this.e, (long)4225287768488998065L, (long)var2_2)), (long)4232324434614515858L, (long)var2_2);
                                                                                            if (var16_9 != null) break block84;
                                                                                            if (v1 == false) break block85;
                                                                                        }
                                                                                        catch (MatchException v2) {
                                                                                            throw d3.b("M", (Object)v2, (long)4232865120014423834L, (long)var2_2);
                                                                                        }
                                                                                        v3 = new Object[2];
                                                                                        v3[1] = var12_7;
                                                                                        v3[0] = d3.b("x", (long)4231275826011292193L, (long)var2_2);
                                                                                        v1 = d3.b("M", (Object)v3, (long)4225352739769097864L, (long)var2_2);
                                                                                    }
                                                                                    catch (MatchException v4) {
                                                                                        throw d3.b("M", (Object)v4, (long)4232865120014423834L, (long)var2_2);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        if (var16_9 != null) break block86;
                                                                                        if (v1 == false) break block85;
                                                                                    }
                                                                                    catch (MatchException v5) {
                                                                                        throw d3.b("M", (Object)v5, (long)4232865120014423834L, (long)var2_2);
                                                                                    }
                                                                                    v6 = new Object[1];
                                                                                    v6[0] = var8_5;
                                                                                    v1 = d3.b("M", (Object)v6, (long)4224957918219728370L, (long)var2_2);
                                                                                }
                                                                                catch (MatchException v7) {
                                                                                    throw d3.b("M", (Object)v7, (long)4232865120014423834L, (long)var2_2);
                                                                                }
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        if (var16_9 != null) break block87;
                                                                                        if (v1 != false) break block85;
                                                                                    }
                                                                                    catch (MatchException v8) {
                                                                                        throw d3.b("M", (Object)v8, (long)4232865120014423834L, (long)var2_2);
                                                                                    }
                                                                                    v9 = d3.b;
                                                                                    if (var16_9 != null) break block88;
                                                                                }
                                                                                catch (MatchException v10) {
                                                                                    throw d3.b("M", (Object)v10, (long)4232865120014423834L, (long)var2_2);
                                                                                }
                                                                                v1 = d3.b("i", (Object)d3.b("i", (Object)d3.b("D", (Object)v9, (long)4231855708259862048L, (long)var2_2), (long)4232450176684385305L, (long)var2_2), (Object)d3.b("x", (long)4232377664462540861L, (long)var2_2), (long)4225199312279545813L, (long)var2_2);
                                                                            }
                                                                            catch (MatchException v11) {
                                                                                throw d3.b("M", (Object)v11, (long)4232865120014423834L, (long)var2_2);
                                                                            }
                                                                        }
                                                                        try {
                                                                            if (v1 == false) {
                                                                                d3.b("i", (Object)var1_1, (Object)new Object[0], (long)4231492146813594157L, (long)var2_2);
                                                                                return;
                                                                            }
                                                                        }
                                                                        catch (MatchException v12) {
                                                                            throw d3.b("M", (Object)v12, (long)4232865120014423834L, (long)var2_2);
                                                                        }
                                                                    }
                                                                    v9 = d3.b;
                                                                }
                                                                var18_10 = d3.b("D", (Object)v9, (long)4231965390020654329L, (long)var2_2);
                                                                try {
                                                                    try {
                                                                        v13 = var18_10;
                                                                        if (var16_9 != null) break block89;
                                                                        if (v13 instanceof class_3965) {
                                                                        }
                                                                        ** GOTO lbl88
                                                                    }
                                                                    catch (MatchException v14) {
                                                                        throw d3.b("M", (Object)v14, (long)4232865120014423834L, (long)var2_2);
                                                                    }
                                                                    v13 = var18_10;
                                                                }
                                                                catch (MatchException v15) {
                                                                    throw d3.b("M", (Object)v15, (long)4232865120014423834L, (long)var2_2);
                                                                }
                                                            }
                                                            var17_12 = (class_3965)v13;
                                                            try {
                                                                if (var16_9 == null) break block90;
lbl88:
                                                                // 2 sources

                                                                return;
                                                            }
                                                            catch (MatchException v16) {
                                                                throw d3.b("M", (Object)v16, (long)4232865120014423834L, (long)var2_2);
                                                            }
                                                        }
                                                        try {
                                                            v17 = d3.b("i", (Object)var17_12, (long)4225034893723013637L, (long)var2_2);
                                                            if (var16_9 != null) break block91;
                                                            if (v17 != null) break block92;
                                                        }
                                                        catch (MatchException v18) {
                                                            throw d3.b("M", (Object)v18, (long)4232865120014423834L, (long)var2_2);
                                                        }
                                                        return;
                                                    }
                                                    v17 = d3.b("i", (Object)var17_12, (long)4225034893723013637L, (long)var2_2);
                                                }
                                                v19 = new Object[3];
                                                v19[2] = var10_6;
                                                v19[1] = d3.b("x", (long)4233130056782239923L, (long)var2_2);
                                                v19[0] = v17;
                                                var18_11 = d3.b("M", (Object)v19, (long)4225488253876266371L, (long)var2_2);
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            v20 = var18_11;
                                                                            if (var16_9 != null) break block93;
                                                                            if (v20 == false) break block94;
                                                                        }
                                                                        catch (MatchException v21) {
                                                                            throw d3.b("M", (Object)v21, (long)4232865120014423834L, (long)var2_2);
                                                                        }
                                                                        v20 = d3.b("i", (Object)((Boolean)d3.b("i", (Object)this.d, (long)4225287768488998065L, (long)var2_2)), (long)4232324434614515858L, (long)var2_2);
                                                                        if (var16_9 != null) break block93;
                                                                    }
                                                                    catch (MatchException v22) {
                                                                        throw d3.b("M", (Object)v22, (long)4232865120014423834L, (long)var2_2);
                                                                    }
                                                                    if (v20 == false) break block94;
                                                                }
                                                                catch (MatchException v23) {
                                                                    throw d3.b("M", (Object)v23, (long)4232865120014423834L, (long)var2_2);
                                                                }
                                                                v20 = d3.b("i", (Object)d3.b("D", (Object)d3.b, (long)4231855708259862048L, (long)var2_2), (long)4231772666694552839L, (long)var2_2);
                                                                if (var16_9 != null) break block93;
                                                            }
                                                            catch (MatchException v24) {
                                                                throw d3.b("M", (Object)v24, (long)4232865120014423834L, (long)var2_2);
                                                            }
                                                            if (v20 != false) break block94;
                                                        }
                                                        catch (MatchException v25) {
                                                            throw d3.b("M", (Object)v25, (long)4232865120014423834L, (long)var2_2);
                                                        }
                                                        v26 = new Object[2];
                                                        v26[1] = var12_7;
                                                        v26[0] = d3.b("x", (long)4225123277785161820L, (long)var2_2);
                                                        v20 = d3.b("M", (Object)v26, (long)4225352739769097864L, (long)var2_2);
                                                        if (var16_9 != null) break block93;
                                                    }
                                                    catch (MatchException v27) {
                                                        throw d3.b("M", (Object)v27, (long)4232865120014423834L, (long)var2_2);
                                                    }
                                                    if (v20 == false) break block94;
                                                }
                                                catch (MatchException v28) {
                                                    throw d3.b("M", (Object)v28, (long)4232865120014423834L, (long)var2_2);
                                                }
                                                v29 = new Object[2];
                                                v29[1] = var6_4;
                                                v29[0] = d3.b("i", (Object)var17_12, (long)4225034893723013637L, (long)var2_2);
                                                var19_13 = d3.b("M", (Object)v29, (long)4231354414848646922L, (long)var2_2);
                                                try {
                                                    try {
                                                        v30 = var19_13;
                                                        if (var16_9 != null) break block95;
                                                        if (v30 == false) break block94;
                                                    }
                                                    catch (MatchException v31) {
                                                        throw d3.b("M", (Object)v31, (long)4232865120014423834L, (long)var2_2);
                                                    }
                                                    d3.b("i", (Object)var1_1, (Object)new Object[0], (long)4231492146813594157L, (long)var2_2);
                                                }
                                                catch (MatchException v32) {
                                                    throw d3.b("M", (Object)v32, (long)4232865120014423834L, (long)var2_2);
                                                }
                                            }
                                            v33 = new Object[3];
                                            v33[2] = var10_6;
                                            v33[1] = d3.b("x", (long)4232782380015152773L, (long)var2_2);
                                            v33[0] = d3.b("i", (Object)var17_12, (long)4225034893723013637L, (long)var2_2);
                                            v20 = d3.b("M", (Object)v33, (long)4225488253876266371L, (long)var2_2);
                                        }
                                        v30 = var19_13 = v20;
                                    }
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (var16_9 != null) break block96;
                                                                    if (v30 == false) break block97;
                                                                }
                                                                catch (MatchException v34) {
                                                                    throw d3.b("M", (Object)v34, (long)4232865120014423834L, (long)var2_2);
                                                                }
                                                                v30 = d3.b("i", (Object)((Boolean)d3.b("i", (Object)this.a, (long)4225287768488998065L, (long)var2_2)), (long)4232324434614515858L, (long)var2_2);
                                                                if (var16_9 != null) break block96;
                                                            }
                                                            catch (MatchException v35) {
                                                                throw d3.b("M", (Object)v35, (long)4232865120014423834L, (long)var2_2);
                                                            }
                                                            if (v30 == false) break block97;
                                                        }
                                                        catch (MatchException v36) {
                                                            throw d3.b("M", (Object)v36, (long)4232865120014423834L, (long)var2_2);
                                                        }
                                                        v30 = d3.b("i", (Object)d3.b("D", (Object)d3.b, (long)4231855708259862048L, (long)var2_2), (long)4231772666694552839L, (long)var2_2);
                                                        if (var16_9 != null) break block96;
                                                    }
                                                    catch (MatchException v37) {
                                                        throw d3.b("M", (Object)v37, (long)4232865120014423834L, (long)var2_2);
                                                    }
                                                    if (v30 != false) break block97;
                                                }
                                                catch (MatchException v38) {
                                                    throw d3.b("M", (Object)v38, (long)4232865120014423834L, (long)var2_2);
                                                }
                                                v39 = new Object[2];
                                                v39[1] = var14_8;
                                                v39[0] = d3.b("i", (Object)d3.b("D", (Object)d3.b, (long)4231855708259862048L, (long)var2_2), (long)4233367406537332050L, (long)var2_2);
                                                v30 = d3.b("i", (Object)this, (Object)v39, (long)4231436231572646607L, (long)var2_2);
                                                if (var16_9 != null) break block98;
                                            }
                                            catch (MatchException v40) {
                                                throw d3.b("M", (Object)v40, (long)4232865120014423834L, (long)var2_2);
                                            }
                                            if (v30 == false) {
                                            }
                                            ** GOTO lbl241
                                        }
                                        catch (MatchException v41) {
                                            throw d3.b("M", (Object)v41, (long)4232865120014423834L, (long)var2_2);
                                        }
                                        v42 = new Object[2];
                                        v42[1] = var14_8;
                                        v42[0] = d3.b("i", (Object)d3.b("D", (Object)d3.b, (long)4231855708259862048L, (long)var2_2), (long)4232450176684385305L, (long)var2_2);
                                        v30 = d3.b("i", (Object)this, (Object)v42, (long)4231436231572646607L, (long)var2_2);
                                    }
                                    catch (MatchException v43) {
                                        throw d3.b("M", (Object)v43, (long)4232865120014423834L, (long)var2_2);
                                    }
                                }
                                try {
                                    try {
                                        if (var16_9 != null) break block96;
                                        if (v30 == false) break block97;
                                    }
                                    catch (MatchException v44) {
                                        throw d3.b("M", (Object)v44, (long)4232865120014423834L, (long)var2_2);
                                    }
lbl241:
                                    // 2 sources

                                    d3.b("i", (Object)var1_1, (Object)new Object[0], (long)4231492146813594157L, (long)var2_2);
                                }
                                catch (MatchException v45) {
                                    throw d3.b("M", (Object)v45, (long)4232865120014423834L, (long)var2_2);
                                }
                            }
                            v46 = new Object[2];
                            v46[1] = var12_7;
                            v46[0] = d3.b("x", (long)4225123277785161820L, (long)var2_2);
                            v30 = d3.b("M", (Object)v46, (long)4225352739769097864L, (long)var2_2);
                        }
                        var20_14 = v30;
                        try {
                            v47 = var20_14;
                            if (var16_9 != null) break block99;
                            if (v47 == false) break block100;
                        }
                        catch (MatchException v48) {
                            throw d3.b("M", (Object)v48, (long)4232865120014423834L, (long)var2_2);
                        }
                        v47 = var18_11;
                    }
                    try {
                        block102: {
                            try {
                                try {
                                    try {
                                        if (var16_9 != null) break block101;
                                        if (v47 == false) break block102;
                                    }
                                    catch (MatchException v49) {
                                        throw d3.b("M", (Object)v49, (long)4232865120014423834L, (long)var2_2);
                                    }
                                    v47 = d3.b("i", (Object)d3.b("D", (Object)d3.b, (long)4231855708259862048L, (long)var2_2), (long)4231772666694552839L, (long)var2_2);
                                    if (var16_9 != null) break block101;
                                }
                                catch (MatchException v50) {
                                    throw d3.b("M", (Object)v50, (long)4232865120014423834L, (long)var2_2);
                                }
                                if (v47 == false) break block100;
                            }
                            catch (MatchException v51) {
                                throw d3.b("M", (Object)v51, (long)4232865120014423834L, (long)var2_2);
                            }
                        }
                        v47 = d3.b("i", (Object)((Boolean)d3.b("i", (Object)this.c, (long)4225287768488998065L, (long)var2_2)), (long)4232324434614515858L, (long)var2_2);
                    }
                    catch (MatchException v52) {
                        throw d3.b("M", (Object)v52, (long)4232865120014423834L, (long)var2_2);
                    }
                }
                try {
                    try {
                        if (var16_9 != null) break block103;
                        if (v47 == false) break block100;
                    }
                    catch (MatchException v53) {
                        throw d3.b("M", (Object)v53, (long)4232865120014423834L, (long)var2_2);
                    }
                    v54 = new Object[2];
                    v54[1] = var4_3;
                    v54[0] = d3.b("i", (Object)var17_12, (long)4225034893723013637L, (long)var2_2);
                    v47 = d3.b("M", (Object)v54, (long)4232696753270552724L, (long)var2_2);
                }
                catch (MatchException v55) {
                    throw d3.b("M", (Object)v55, (long)4232865120014423834L, (long)var2_2);
                }
            }
            try {
                if (v47 != false) {
                    d3.b("i", (Object)var1_1, (Object)new Object[0], (long)4231492146813594157L, (long)var2_2);
                }
            }
            catch (MatchException v56) {
                throw d3.b("M", (Object)v56, (long)4232865120014423834L, (long)var2_2);
            }
        }
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n3] != null) {
            return n3;
        }
        Object object = d3.l[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 37;
            case 1 -> 44;
            case 2 -> 30;
            case 3 -> 36;
            case 4 -> 56;
            case 5 -> 48;
            case 6 -> 29;
            case 7 -> 27;
            case 8 -> 50;
            case 9 -> 35;
            case 10 -> 11;
            case 11 -> 20;
            case 12 -> 63;
            case 13 -> 54;
            case 14 -> 16;
            case 15 -> 21;
            case 16 -> 13;
            case 17 -> 41;
            case 18 -> 32;
            case 19 -> 25;
            case 20 -> 28;
            case 21 -> 17;
            case 22 -> 4;
            case 23 -> 43;
            case 24 -> 45;
            case 25 -> 18;
            case 26 -> 8;
            case 27 -> 34;
            case 28 -> 39;
            case 29 -> 6;
            case 30 -> 40;
            case 31 -> 58;
            case 32 -> 49;
            case 33 -> 33;
            case 34 -> 60;
            case 35 -> 10;
            case 36 -> 52;
            case 37 -> 55;
            case 38 -> 12;
            case 39 -> 19;
            case 40 -> 15;
            case 41 -> 51;
            case 42 -> 61;
            case 43 -> 31;
            case 44 -> 47;
            case 45 -> 0;
            case 46 -> 46;
            case 47 -> 1;
            case 48 -> 24;
            case 49 -> 42;
            case 50 -> 3;
            case 51 -> 14;
            case 52 -> 38;
            case 53 -> 5;
            case 54 -> 26;
            case 55 -> 22;
            case 56 -> 9;
            case 57 -> 53;
            case 58 -> 2;
            case 59 -> 23;
            case 60 -> 57;
            case 61 -> 62;
            case 62 -> 7;
            default -> 59;
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
        d3.m[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = d3.m(l, l2);
        Object object = d3.l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = d3.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = d3.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = d3.g(clazz3, string2, clazz2)) != null) {
                    d3.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = d3.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        d3.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = d3.n(1046298935880063L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = d3.m(l, l2);
        Object object = d3.l[n];
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
                clazz3 = d3.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = d3.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = d3.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        d3.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = d3.n(1046298935880063L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = d3.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        d3.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = d3.n(1046298935880063L, 0L);
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(d3.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


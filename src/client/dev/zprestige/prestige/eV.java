/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_310
 *  net.minecraft.class_3966
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aK;
import dev.zprestige.prestige.aS;
import dev.zprestige.prestige.bD;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bu_0;
import dev.zprestige.prestige.dC;
import dev.zprestige.prestige.dF;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.f5;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.y_0;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraft.class_1657;
import net.minecraft.class_310;
import net.minecraft.class_3966;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class eV
extends dV
implements dF {
    private dM d;
    private dM a;
    private dM c;
    private f5 e;
    private boolean i;
    private boolean f;
    private class_1657 g;
    private static final long k = hc.a(-2892172218579825258L, 3429203304698651306L, MethodHandles.lookup().lookupClass()).a(13748405977288L);
    private static final Object[] l = new Object[80];
    private static final String[] m = new String[80];

    public eV() {
        long l = k ^ 0x783167516CBDL;
        long l2 = l ^ 0x4656A4FE564EL;
        this.e = new f5(l2);
        this.i = 0;
        this.f = 0;
        this.g = null;
    }

    static {
        eV.f();
    }

    @Override
    public void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x7FAB131DDD11L;
        this.i = 0;
        this.g = null;
        this.f = 0;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = this;
        eV.b("u", (Object)eV.b("\u00d8", (long)3995842234618686002L, (long)l), (Object)objectArray2, (long)3993404243809591760L, (long)l);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/eV" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = eV.m(l, l2);
            object = eV.l[n];
            try {
                if (!(object instanceof String)) break block2;
                eV.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = eV.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = eV.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = eV.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = eV.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = l;
        l[0] = "\u0007F`<N<\u0011Fef]+\u0006\rf`Q?\u0017Jqw\u001a-+";
        objectArray[1] = "T\n;C!g!*0L0(\\2#K9a4";
        objectArray[2] = "M\u000f?3r\u0001M\u000f(o~\u000eWD(q~\u001bP5x,/";
        objectArray[3] = "\\Z\u0005T@Z\\Z\u0012\bLUF\u0011\u0012\u0016L@A`FN\u001b";
        objectArray[4] = "B,Q:\u0001SI#@umPG!B:A";
        objectArray[5] = Boolean.TYPE;
        eV.m[5] = "java/lang/Boolean";
        objectArray[6] = "\u001b\u0018g=\nw\u001b\u0018pa\u0006x\u0001Sp\u007f\u0006m\u0006\"\"$^'";
        objectArray[7] = "\\4X\u0000K\f\\4O\\G\u0003F\u007fOBG\u0016A\u000e\u001d\u0018\u0013R";
        objectArray[8] = Integer.TYPE;
        eV.m[8] = "java/lang/Integer";
        objectArray[9] = "bV[Ut|tV^\u000fgkc\u001d]\tk\u007frZJ\u001e hM";
        objectArray[10] = "\u0003vKP\bn\byZ\u001fi`\u0003r^E";
        objectArray[11] = "A\u0019kc\u0000SW\u0019n9\u0013D@Rm?\u001fPQ\u0015z(TFs";
        objectArray[12] = "-9\u0007`&\\&6\u0016/EQ3;\u0019DpS\"(\u0005hg^";
        objectArray[13] = "T$o\n\u0015 B$jP\u00067UoiV\n#D(~AA3B";
        objectArray[14] = "m\u001eMJLt\u0018>FE];y0MNYa\r";
        objectArray[15] = "j\u0011$&>X|\u0011!|-OkZ\"z![z\u001d5mjK6";
        objectArray[16] = "+\u000bzYx1^+qVi~?%z]m$K";
        objectArray[17] = Double.TYPE;
        eV.m[17] = "java/lang/Double";
        objectArray[18] = "PG@f0}FGE<#jQ\fF:/~@KQ-dnXKS&>#dPS;>dSG";
        objectArray[19] = "}D'vB\u0001kD\",Q\u0016|\u000f!*]\u0002mH6=\u0016\u0015]";
        objectArray[20] = "B\u0000k\u0013LN7 `\u001c]\u0001V.k\u0017Y[\"";
        objectArray[21] = Void.TYPE;
        eV.m[21] = "java/lang/Void";
        objectArray[22] = "\u007fYdi\u0015l\u007fYs5\u0019ce\u0012s+\u0019vbc!uA2";
        objectArray[23] = Float.TYPE;
        eV.m[23] = "java/lang/Float";
        objectArray[24] = "xBQ09+\rbZ?(dllQ4,>\u0018";
        objectArray[25] = "mg\u0001O#z{g\u0004\u00150ml,\u0007\u0013<y}k\u0010\u0004wl<";
        objectArray[26] = "B%yr\u0010\u001b7\u0005r}\u0001TV\u000byv\u0005\u000e\"";
        objectArray[27] = "r/\u0006@Be\u0007\u000f\rOS*f\u0001\u0006DWp\u0012";
        objectArray[28] = "e/;)SNs/>s@Ydd=uLMu#*b\u0007]n";
        objectArray[29] = ":\u0006\u0007\tO,O&\f\u0006^c.(\u0007\rZ9Z";
        objectArray[30] = "@m12\"2Vm4h1%A&7n=1Pa yv$\u0015";
        objectArray[31] = "^@!7>8+`*8/wJn!3+->";
        objectArray[32] = "[V\u0001&RRMV\u0004|AEZ\u001d\u0007zMQKZ\u0010m\u0006Fx";
        objectArray[33] = "@|Dr>\\5\\O}/\u0013TRDv+I ";
        objectArray[34] = "O~0hBNY~52QYN564]M_r!#\u0016Zh";
        objectArray[35] = "\u0012wRPsf\u0012wE\f\u007fi\b<E\u0012\u007f|\u000fM\u0014J-";
        objectArray[36] = "O^SG\u000ebO^D\u001b\u0002mU\u0015D\u0005\u0002xRd\u0014PU=";
        objectArray[37] = "\bQ(\rC{\bQ?QOt\u0012\u001a?OOa\u0015kn\u0010\u0017";
        objectArray[38] = "6W,\"\u0016\u0017Cw'-\u0007X\"y,&\u0003\u0002V";
        objectArray[39] = "bx(*Z\u0019bx?vV\u0016x3?hV\u0003\u007fBn7\u000eToq=wD/>)l";
        objectArray[40] = "\u001ff\u0010oiN\u001ff\u00073eA\u0005-\u0007-eT\u0002\\Pr3";
        objectArray[41] = "d;&[U*\u0011\u001b-TDep\u0015&_@?\u0004";
        objectArray[42] = "\u001et\u0007'j8\bt\u0002}y/\u001f?\u0001{u;\u000ex\u0016l>*>";
        objectArray[43] = ")sU\fJK\\S^\u0003[\u0004=]U\b_^I";
        objectArray[44] = "\u001e1$\u0013\u001bWk\u0011/\u001c\n\u0018\n\u001f$\u0017\u000eB~";
        objectArray[45] = "qqp\u0015\u0001\u0018gquO\u0012\u000fp:vI\u001e\u001ba}a^U\u0011";
        objectArray[46] = "lA\u0019Z\r\u000f\u0019a\u0012U\u001c@xo\u0019^\u0018\u001a\f";
        objectArray[47] = "d\u0000oq\u0005\u001c?\u0001;p5\u001f3\u0004clY-cG8:5\u00145\u0003;i\f\u0006=E2\u000b[\n.\u001336H\u0004`\u0013\u0003";
        objectArray[48] = "(\u0007j\r4h}\u0001y}7\u0001(\\(\u001bfg!\u001eq\u001c]";
        objectArray[49] = "O\n+a<\u0005\nGv(Z\u0000\u0017\u0015u}\rWIB-\u0011`\u0016\u001a\u0002!w;\u0017N\u0003";
        objectArray[50] = "H]Tv\u001fp\r\u0010\t?yu\u0010B\nj.\"N\u0011S\u0006\u0001i\u0013O\u0004e\u0006*\u0001\u0013";
        objectArray[51] = "{j(esK.l;\u0015p\"=bdtu\u001d-d6e\u001a\u001ey>l.wXsoe\u0015";
        objectArray[52] = "5\u0013XV\u000eN$\u000bI\u00147\u001eU\tA\u001bV\u0018j\u0019GIGwiM\u001d\u0013\f\u001a/GL\u001a7";
        objectArray[53] = "yY'd\u000f\u0015,_4\u0014\u000f|?Qku\tC/W9df\u0011$\n`(\u0019\u001f1Y`\u0014";
        objectArray[54] = "\u0015\u0004\bA5LN\u0005\\@\u0005OB\u0000\u0004\\i}\u0011DY\u0004\u0005DD\u0007\\Y<VLAU;9\u0011\u0010D_V\u007f\u001bAMd";
        objectArray[55] = "+\u0003\t\u000fdRnNTF\u0002Ws\u001cW\u0013U\u0000-L\u000e\u007fxC#\t\u0003\u0015<\u0006o\u001b";
        objectArray[56] = "\u001dmXd\u0005:\u00188X5o;M(Y2\u0003\t\u001dd\u0001hob\u001bk\u0001n\u0002$\u0011:\bU";
        objectArray[57] = "Z)t\u007f\u000eNGtfj\u007f\u00196;o!\u001e\u0018\t+is\u000fw[ 4*C\bU5g*\u007f";
        objectArray[58] = "j`\u0019\u000f\u007f\u00121aM\u000eO\u0011=d\u0015\u0012##n IJOH2g\u0005M*\u0014huNu";
        objectArray[59] = "{\u0006.tH9 \u0007zux:,\u0002\"i\u0014\b\u007fG{3xczAz5\u0015%p\u0010s\u000e";
        objectArray[60] = "u\r\u0010\t:<4H\u0010EV;\t\n\u0002\b7>6\u001a\u0004Z&Qd\u0011Y\u0003j.j\u0004\n\u0003V";
        objectArray[61] = ";#6nlI>v6?\u0006Hkf78jz=!j`?-az8`~\u0012a}n.\u0006";
        objectArray[62] = "\bL}#4S\u0019Tla\r\u0003hVdnl\u0005WFb<}j\u0005M?e1\u0015\u000bXle\r";
        objectArray[63] = "fu|\u001eaB#8!W\u0007L2{&\tk~f:x_\u0007\u0015d8~UjSniwn";
        objectArray[64] = "\u00170@I,^_;\u0010KSP\u0002#\u001cK?bV`C\u001ci5\u00014\u0007\u00141\f\u0013<A\u001dS";
        objectArray[65] = "Vd\u0014A0k\u001ds\u000eUT=Ml\u000e]\u0003j\u0017:S1.6Rq\u000e\te!He";
        objectArray[66] = "u\u000eX!%3hSJ4Tg\u0019\u001cC\u007f5e&\fE-$\nt\u0007\u0018thuz\u0012KtT";
        objectArray[67] = "\u0015\"w\u0004'\nA%g@A\u000eI{z\u0012(\u0002puz\u0002,d\u0012'!Gz\tT-pNA";
        objectArray[68] = "R>62lZ\b~}y\u0005E9\"+{kS\u0000?vi~";
        objectArray[69] = "VG\u0013^R:\u0011[E\u00152:iA\u0019TS<VQ\u001f\u0006BSU\u0005E\\\t>\u0013\u000f\u0014U2";
        objectArray[70] = "\f$\u0014A:.\u0015c\u001e\u0018[*n&\fK:,Q6\n\u0019+C\u0003=W@g<\r(\u0004@[";
        objectArray[71] = "|\u0019\u000e\u000f hyL\u000e^Jb M\u000bR\u001d2{\u001bR>wr-J\u001eX73pN";
        objectArray[72] = "V9m\u0010\u000edJ+m@|456wK\u001d2\n&q\u0019\f]\bpuJ\u00169\r%u\u001b|";
        objectArray[73] = "d\u000f\u001aO(s(\u0019\u0006LNwZT\u0012\u001a!z6\r\u0018U\"\u001e";
        objectArray[74] = "-)bGo6j54\f\u000f6\u0012`h\u001ds<r9;Lj_\"3k\u0001l?{`:\u0018\u000f";
        objectArray[75] = "\nr\t>t\u0016\u000fs\u000eqJNo2V0+HP\"Pb:'\t=Sx1_\u0012s\n`J";
        objectArray[76] = "s\u00004\u000eJXtC&R ^f\u000e6\tLl2Mi^\u001b;q\u0017(\u001eD\u0003:\u00002\n ";
        objectArray[77] = "AMp\u0017(a\u000e\u0010r\u0010JepUu]+cOEs\u000f:\fL\u0011)Uqa\n\u001bx\\J";
        objectArray[78] = "i5ew\u007fZ<3v\u0007\u007f3/=)fy\f?;{w\u0016M3,i?&J4;z\u0007";
        Object[] objectArray2 = objectArray;
        objectArray[79] = "\u0012h%T}\u0010\u0016buZ\u0017\u0019{y|Zv\u001fDiz\bgp\u0010mc\u0014s\u000fEfx\u0011\u0017";
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f1' || c == 'x' || c == '\u00d8' || c == 'L') {
                field = eV.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f1' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'x' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = eV.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'u' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = eV.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public void d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x52D6E774439DL;
        this.i = 0;
        this.g = null;
        this.f = 0;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = this;
        eV.b("u", (Object)eV.b("\u00d8", (long)3249152328639000657L, (long)l), (Object)objectArray2, (long)3249006224376278957L, (long)l);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @bP
    public void a(bu_0 bu_02) {
        eV eV2;
        long l;
        long l2;
        block44: {
            class_1657 class_16572;
            block46: {
                CallSite callSite;
                CallSite callSite2;
                long l3;
                block43: {
                    CallSite callSite3;
                    block41: {
                        block42: {
                            block39: {
                                block40: {
                                    block38: {
                                        class_310 class_3102;
                                        block36: {
                                            block37: {
                                                block35: {
                                                    long l4 = l2 = k ^ 0x50309F276280L;
                                                    l3 = l4 ^ 0x26DBAAF22D49L;
                                                    l = l4 ^ 0x2CAD9714BC73L;
                                                    callSite2 = eV.b("\u00d5", (long)-6637645931232635569L, (long)l2);
                                                    try {
                                                        try {
                                                            class_3102 = b;
                                                            if (callSite2 != null) break block35;
                                                            if (eV.b("\u00f1", (Object)class_3102, (long)-6637307579420279153L, (long)l2) != null) return;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw eV.b("\u00d5", (Object)matchException, (long)-6630156125984574562L, (long)l2);
                                                        }
                                                        class_3102 = b;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw eV.b("\u00d5", (Object)matchException, (long)-6630156125984574562L, (long)l2);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        if (callSite2 != null) break block36;
                                                        if (eV.b("u", (Object)class_3102, (long)-6637855032604806097L, (long)l2) != false) break block37;
                                                        return;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw eV.b("\u00d5", (Object)matchException, (long)-6630156125984574562L, (long)l2);
                                                    }
                                                }
                                                catch (MatchException matchException) {
                                                    throw eV.b("\u00d5", (Object)matchException, (long)-6630156125984574562L, (long)l2);
                                                }
                                            }
                                            class_3102 = b;
                                        }
                                        try {
                                            try {
                                                callSite3 = eV.b("\u00f1", (Object)class_3102, (long)-6637526877382640708L, (long)l2);
                                                if (callSite2 != null) break block38;
                                                if (callSite3 == null) return;
                                            }
                                            catch (MatchException matchException) {
                                                throw eV.b("\u00d5", (Object)matchException, (long)-6630156125984574562L, (long)l2);
                                            }
                                            callSite3 = eV.b("\u00f1", (Object)b, (long)-6637526877382640708L, (long)l2);
                                        }
                                        catch (MatchException matchException) {
                                            throw eV.b("\u00d5", (Object)matchException, (long)-6630156125984574562L, (long)l2);
                                        }
                                    }
                                    try {
                                        try {
                                            if (callSite2 != null) break block39;
                                            if (eV.b("u", (Object)callSite3, (long)-6630067327791592523L, (long)l2) == eV.b("\u00d8", (long)-6629792276235787037L, (long)l2)) break block40;
                                            return;
                                        }
                                        catch (MatchException matchException) {
                                            throw eV.b("\u00d5", (Object)matchException, (long)-6630156125984574562L, (long)l2);
                                        }
                                    }
                                    catch (MatchException matchException) {
                                        throw eV.b("\u00d5", (Object)matchException, (long)-6630156125984574562L, (long)l2);
                                    }
                                }
                                callSite3 = eV.b("\u00f1", (Object)b, (long)-6637526877382640708L, (long)l2);
                            }
                            try {
                                try {
                                    if (callSite2 != null) break block41;
                                    if (callSite3 instanceof class_3966) break block42;
                                    return;
                                }
                                catch (MatchException matchException) {
                                    throw eV.b("\u00d5", (Object)matchException, (long)-6630156125984574562L, (long)l2);
                                }
                            }
                            catch (MatchException matchException) {
                                throw eV.b("\u00d5", (Object)matchException, (long)-6630156125984574562L, (long)l2);
                            }
                        }
                        callSite3 = eV.b("\u00f1", (Object)b, (long)-6637526877382640708L, (long)l2);
                    }
                    CallSite callSite4 = eV.b("u", (Object)((class_3966)callSite3), (long)-6629772988003373291L, (long)l2);
                    try {
                        try {
                            callSite = callSite4;
                            if (callSite2 != null) break block43;
                            if (!(callSite instanceof class_1657)) return;
                        }
                        catch (MatchException matchException) {
                            throw eV.b("\u00d5", (Object)matchException, (long)-6630156125984574562L, (long)l2);
                        }
                        callSite = callSite4;
                    }
                    catch (MatchException matchException) {
                        throw eV.b("\u00d5", (Object)matchException, (long)-6630156125984574562L, (long)l2);
                    }
                }
                class_1657 class_16573 = (class_1657)callSite;
                try {
                    if (callSite2 != null) {
                        return;
                    }
                }
                catch (MatchException matchException) {
                    throw eV.b("\u00d5", (Object)matchException, (long)-6630156125984574562L, (long)l2);
                }
                try {
                    eV eV3;
                    block45: {
                        try {
                            try {
                                try {
                                    eV2 = this;
                                    if (callSite2 != null) break block44;
                                    if (eV2.i) break block45;
                                }
                                catch (MatchException matchException) {
                                    throw eV.b("\u00d5", (Object)matchException, (long)-6630156125984574562L, (long)l2);
                                }
                                eV3 = this;
                                class_16572 = class_16573;
                                if (callSite2 != null) break block46;
                            }
                            catch (MatchException matchException) {
                                throw eV.b("\u00d5", (Object)matchException, (long)-6630156125984574562L, (long)l2);
                            }
                            Object[] objectArray = new Object[2];
                            objectArray[1] = l3;
                            objectArray[0] = class_16572;
                            if (eV.b("u", (Object)eV3, (Object)objectArray, (long)-6629520147177473010L, (long)l2) == false) return;
                        }
                        catch (MatchException matchException) {
                            throw eV.b("\u00d5", (Object)matchException, (long)-6630156125984574562L, (long)l2);
                        }
                    }
                    this.i = 1;
                    eV3 = this;
                    class_16572 = class_16573;
                }
                catch (MatchException matchException) {
                    throw eV.b("\u00d5", (Object)matchException, (long)-6630156125984574562L, (long)l2);
                }
            }
            eV3.g = class_16572;
            eV2 = this;
        }
        Object[] objectArray = new Object[1];
        objectArray[0] = l;
        eV.b("u", (Object)eV2.e, (Object)objectArray, (long)-6637779917514706287L, (long)l2);
        eV.b("u", (Object)bu_02, (Object)new Object[0], (long)-6637423100407534858L, (long)l2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public dC a(Object[] var1_1) {
        block52: {
            block51: {
                block49: {
                    block50: {
                        block47: {
                            block48: {
                                block45: {
                                    block46: {
                                        block44: {
                                            block43: {
                                                block42: {
                                                    block41: {
                                                        block39: {
                                                            block40: {
                                                                var2_2 = (Long)var1_1[0];
                                                                v0 = var2_2;
                                                                var4_3 = v0 ^ 36160164621105L;
                                                                var6_4 = v0 ^ 91260814807711L;
                                                                var8_5 = v0 ^ 18621355024670L;
                                                                var10_6 = v0 ^ 85547089512629L;
                                                                var12_7 = v0 ^ 81856115773718L;
                                                                var14_8 = v0 ^ 71343916077473L;
                                                                var16_9 = eV.b("\u00d5", (long)-1173911158869092072L, (long)var2_2);
                                                                try {
                                                                    try {
                                                                        v1 /* !! */  = this.i;
                                                                        if (var16_9 != null) break block39;
                                                                        if (v1 /* !! */ ) break block40;
                                                                    }
                                                                    catch (MatchException v2) {
                                                                        throw eV.b("\u00d5", (Object)v2, (long)-1176633479543291959L, (long)var2_2);
                                                                    }
                                                                    return null;
                                                                }
                                                                catch (MatchException v3) {
                                                                    throw eV.b("\u00d5", (Object)v3, (long)-1176633479543291959L, (long)var2_2);
                                                                }
                                                            }
                                                            try {
                                                                v4 /* !! */  = eV.b("\u00f1", (Object)eV.b, (long)-1173962470841935685L, (long)var2_2);
                                                                if (var16_9 != null) break block41;
                                                                v1 /* !! */  = eV.b("u", (Object)v4 /* !! */ , (long)-1173286805171136671L, (long)var2_2);
                                                            }
                                                            catch (MatchException v5) {
                                                                throw eV.b("\u00d5", (Object)v5, (long)-1176633479543291959L, (long)var2_2);
                                                            }
                                                        }
                                                        try {
                                                            if (v1 /* !! */ ) {
                                                                return null;
                                                            }
                                                        }
                                                        catch (MatchException v6) {
                                                            throw eV.b("\u00d5", (Object)v6, (long)-1176633479543291959L, (long)var2_2);
                                                        }
                                                        v4 /* !! */  = this.g;
                                                    }
                                                    try {
                                                        try {
                                                            if (var16_9 != null) break block42;
                                                            if (v4 /* !! */  == null) break block43;
                                                        }
                                                        catch (MatchException v7) {
                                                            throw eV.b("\u00d5", (Object)v7, (long)-1176633479543291959L, (long)var2_2);
                                                        }
                                                        v4 /* !! */  = this.g;
                                                    }
                                                    catch (MatchException v8) {
                                                        throw eV.b("\u00d5", (Object)v8, (long)-1176633479543291959L, (long)var2_2);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        if (var16_9 != null) break block44;
                                                        if (eV.b("u", (Object)v4 /* !! */ , (long)-1173344886848509881L, (long)var2_2) == false) break block43;
                                                    }
                                                    catch (MatchException v9) {
                                                        throw eV.b("\u00d5", (Object)v9, (long)-1176633479543291959L, (long)var2_2);
                                                    }
                                                    v4 /* !! */  = this.g;
                                                    break block44;
                                                }
                                                catch (MatchException v10) {
                                                    throw eV.b("\u00d5", (Object)v10, (long)-1176633479543291959L, (long)var2_2);
                                                }
                                            }
                                            v11 = new Object[1];
                                            v11[0] = var14_8;
                                            v4 /* !! */  = eV.b("\u00d5", (Object)v11, (long)-1176743594231435683L, (long)var2_2);
                                        }
                                        var17_10 /* !! */  = v4 /* !! */ ;
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (var16_9 != null) break block45;
                                                        if (var17_10 /* !! */  != null) {
                                                        }
                                                        ** GOTO lbl103
                                                    }
                                                    catch (MatchException v12) {
                                                        throw eV.b("\u00d5", (Object)v12, (long)-1176633479543291959L, (long)var2_2);
                                                    }
                                                    cfr_temp_0 = eV.b("u", (Object)eV.b("\u00f1", (Object)eV.b, (long)-1173962470841935685L, (long)var2_2), (Object)var17_10 /* !! */ , (long)-1174665753512503013L, (long)var2_2) - 3.0f;
                                                    v13 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                                    if (var16_9 != null) break block46;
                                                }
                                                catch (MatchException v14) {
                                                    throw eV.b("\u00d5", (Object)v14, (long)-1176633479543291959L, (long)var2_2);
                                                }
                                                if (v13 <= 0) {
                                                }
                                                ** GOTO lbl103
                                            }
                                            catch (MatchException v15) {
                                                throw eV.b("\u00d5", (Object)v15, (long)-1176633479543291959L, (long)var2_2);
                                            }
                                            v13 = eV.b("u", (Object)eV.b("\u00f1", (Object)eV.b, (long)-1173962470841935685L, (long)var2_2), (Object)var17_10 /* !! */ , (long)-1174056679532463482L, (long)var2_2);
                                        }
                                        catch (MatchException v16) {
                                            throw eV.b("\u00d5", (Object)v16, (long)-1176633479543291959L, (long)var2_2);
                                        }
                                    }
                                    try {
                                        try {
                                            if (var16_9 != null) break block47;
                                            if (v13 != false) break block48;
                                        }
                                        catch (MatchException v17) {
                                            throw eV.b("\u00d5", (Object)v17, (long)-1176633479543291959L, (long)var2_2);
                                        }
lbl103:
                                        // 3 sources

                                        this.i = 0;
                                        this.g = null;
                                    }
                                    catch (MatchException v18) {
                                        throw eV.b("\u00d5", (Object)v18, (long)-1176633479543291959L, (long)var2_2);
                                    }
                                }
                                return null;
                            }
                            v19 = new Object[2];
                            v19[1] = var8_5;
                            v19[0] = var17_10 /* !! */ ;
                            v13 = eV.b("u", (Object)this, (Object)v19, (long)-1177690507157786535L, (long)var2_2);
                        }
                        try {
                            try {
                                if (var16_9 != null) break block49;
                                if (v13 == false) break block50;
                            }
                            catch (MatchException v20) {
                                throw eV.b("\u00d5", (Object)v20, (long)-1176633479543291959L, (long)var2_2);
                            }
                            return null;
                        }
                        catch (MatchException v21) {
                            throw eV.b("\u00d5", (Object)v21, (long)-1176633479543291959L, (long)var2_2);
                        }
                    }
                    try {
                        v22 = this;
                        if (var16_9 != null) break block51;
                        v23 = new Object[2];
                        v23[1] = var10_6;
                        v23[0] = Float.valueOf(1000.0f);
                        v13 = eV.b("u", (Object)v22.e, (Object)v23, (long)-1174233807554572996L, (long)var2_2);
                    }
                    catch (MatchException v24) {
                        throw eV.b("\u00d5", (Object)v24, (long)-1176633479543291959L, (long)var2_2);
                    }
                }
                try {
                    if (v13 == false) break block52;
                    this.i = 0;
                    v22 = this;
                }
                catch (MatchException v25) {
                    throw eV.b("\u00d5", (Object)v25, (long)-1176633479543291959L, (long)var2_2);
                }
            }
            v22.g = null;
            return null;
        }
        v26 = new Object[2];
        v26[1] = var12_7;
        v26[0] = eV.b("u", (Object)var17_10 /* !! */ , (long)-1173686873170610319L, (long)var2_2);
        var18_11 = eV.b("\u00d5", (Object)v26, (long)-1176697771320278669L, (long)var2_2);
        this.i = 0;
        this.g = null;
        v27 = new Object[1];
        v27[0] = var4_3;
        eV.b("u", (Object)new aS(), (Object)v27, (long)-1173886301883008644L, (long)var2_2);
        this.f = 1;
        v28 = new Object[2];
        v28[1] = var6_4;
        v28[0] = var17_10 /* !! */ ;
        eV.b("\u00d5", (Object)v28, (long)-1177479697311868451L, (long)var2_2);
        this.f = 0;
        return var18_11;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @bP
    public void a(aK aK2) {
        eV eV2;
        long l;
        long l2;
        block44: {
            class_1657 class_16572;
            block46: {
                CallSite callSite;
                CallSite callSite2;
                long l3;
                block43: {
                    CallSite callSite3;
                    block41: {
                        block42: {
                            block39: {
                                block40: {
                                    block38: {
                                        class_310 class_3102;
                                        block36: {
                                            block37: {
                                                block35: {
                                                    long l4 = l2 = k ^ 0x5679A4A08F6CL;
                                                    l3 = l4 ^ 0x20929175C0A5L;
                                                    l = l4 ^ 0x2AE4AC93519FL;
                                                    callSite2 = eV.b("\u00d5", (long)5624536855321524387L, (long)l2);
                                                    try {
                                                        try {
                                                            class_3102 = b;
                                                            if (callSite2 != null) break block35;
                                                            if (eV.b("\u00f1", (Object)class_3102, (long)5624870199890187107L, (long)l2) != null) return;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw eV.b("\u00d5", (Object)matchException, (long)5625262465538907762L, (long)l2);
                                                        }
                                                        class_3102 = b;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw eV.b("\u00d5", (Object)matchException, (long)5625262465538907762L, (long)l2);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        if (callSite2 != null) break block36;
                                                        if (eV.b("u", (Object)class_3102, (long)5624323366271506883L, (long)l2) != false) break block37;
                                                        return;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw eV.b("\u00d5", (Object)matchException, (long)5625262465538907762L, (long)l2);
                                                    }
                                                }
                                                catch (MatchException matchException) {
                                                    throw eV.b("\u00d5", (Object)matchException, (long)5625262465538907762L, (long)l2);
                                                }
                                            }
                                            class_3102 = b;
                                        }
                                        try {
                                            try {
                                                callSite3 = eV.b("\u00f1", (Object)class_3102, (long)5624646504199755344L, (long)l2);
                                                if (callSite2 != null) break block38;
                                                if (callSite3 == null) return;
                                            }
                                            catch (MatchException matchException) {
                                                throw eV.b("\u00d5", (Object)matchException, (long)5625262465538907762L, (long)l2);
                                            }
                                            callSite3 = eV.b("\u00f1", (Object)b, (long)5624646504199755344L, (long)l2);
                                        }
                                        catch (MatchException matchException) {
                                            throw eV.b("\u00d5", (Object)matchException, (long)5625262465538907762L, (long)l2);
                                        }
                                    }
                                    try {
                                        try {
                                            if (callSite2 != null) break block39;
                                            if (eV.b("u", (Object)callSite3, (long)5625350723069339225L, (long)l2) == eV.b("\u00d8", (long)5625621849629100303L, (long)l2)) break block40;
                                            return;
                                        }
                                        catch (MatchException matchException) {
                                            throw eV.b("\u00d5", (Object)matchException, (long)5625262465538907762L, (long)l2);
                                        }
                                    }
                                    catch (MatchException matchException) {
                                        throw eV.b("\u00d5", (Object)matchException, (long)5625262465538907762L, (long)l2);
                                    }
                                }
                                callSite3 = eV.b("\u00f1", (Object)b, (long)5624646504199755344L, (long)l2);
                            }
                            try {
                                try {
                                    if (callSite2 != null) break block41;
                                    if (callSite3 instanceof class_3966) break block42;
                                    return;
                                }
                                catch (MatchException matchException) {
                                    throw eV.b("\u00d5", (Object)matchException, (long)5625262465538907762L, (long)l2);
                                }
                            }
                            catch (MatchException matchException) {
                                throw eV.b("\u00d5", (Object)matchException, (long)5625262465538907762L, (long)l2);
                            }
                        }
                        callSite3 = eV.b("\u00f1", (Object)b, (long)5624646504199755344L, (long)l2);
                    }
                    CallSite callSite4 = eV.b("u", (Object)((class_3966)callSite3), (long)5625654399630295801L, (long)l2);
                    try {
                        try {
                            callSite = callSite4;
                            if (callSite2 != null) break block43;
                            if (!(callSite instanceof class_1657)) return;
                        }
                        catch (MatchException matchException) {
                            throw eV.b("\u00d5", (Object)matchException, (long)5625262465538907762L, (long)l2);
                        }
                        callSite = callSite4;
                    }
                    catch (MatchException matchException) {
                        throw eV.b("\u00d5", (Object)matchException, (long)5625262465538907762L, (long)l2);
                    }
                }
                class_1657 class_16573 = (class_1657)callSite;
                try {
                    if (callSite2 != null) {
                        return;
                    }
                }
                catch (MatchException matchException) {
                    throw eV.b("\u00d5", (Object)matchException, (long)5625262465538907762L, (long)l2);
                }
                try {
                    eV eV3;
                    block45: {
                        try {
                            try {
                                try {
                                    eV2 = this;
                                    if (callSite2 != null) break block44;
                                    if (eV2.i) break block45;
                                }
                                catch (MatchException matchException) {
                                    throw eV.b("\u00d5", (Object)matchException, (long)5625262465538907762L, (long)l2);
                                }
                                eV3 = this;
                                class_16572 = class_16573;
                                if (callSite2 != null) break block46;
                            }
                            catch (MatchException matchException) {
                                throw eV.b("\u00d5", (Object)matchException, (long)5625262465538907762L, (long)l2);
                            }
                            Object[] objectArray = new Object[2];
                            objectArray[1] = l3;
                            objectArray[0] = class_16572;
                            if (eV.b("u", (Object)eV3, (Object)objectArray, (long)5625893978956567010L, (long)l2) == false) return;
                        }
                        catch (MatchException matchException) {
                            throw eV.b("\u00d5", (Object)matchException, (long)5625262465538907762L, (long)l2);
                        }
                    }
                    this.i = 1;
                    eV3 = this;
                    class_16572 = class_16573;
                }
                catch (MatchException matchException) {
                    throw eV.b("\u00d5", (Object)matchException, (long)5625262465538907762L, (long)l2);
                }
            }
            eV3.g = class_16572;
            eV2 = this;
        }
        Object[] objectArray = new Object[1];
        objectArray[0] = l;
        eV.b("u", (Object)eV2.e, (Object)objectArray, (long)5624389126118154109L, (long)l2);
        eV.b("u", (Object)aK2, (Object)new Object[0], (long)5624754670967408410L, (long)l2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @bP
    public void a(bD bD2) {
        class_1657 class_16572;
        long l;
        long l2;
        block43: {
            CallSite callSite;
            CallSite callSite2;
            long l3;
            block42: {
                CallSite callSite3;
                block40: {
                    block41: {
                        block38: {
                            block39: {
                                block37: {
                                    class_310 class_3102;
                                    block36: {
                                        long l4 = l2 = k ^ 0x38DF0CC1C516L;
                                        l3 = l4 ^ 0x4E3439148ADFL;
                                        l = l4 ^ 0x444204F21BE5L;
                                        callSite2 = eV.b("\u00d5", (long)320935207516074713L, (long)l2);
                                        try {
                                            try {
                                                class_3102 = b;
                                                if (callSite2 != null) break block36;
                                                if (eV.b("\u00f1", (Object)class_3102, (long)321412553475610905L, (long)l2) != null) return;
                                            }
                                            catch (MatchException matchException) {
                                                throw eV.b("\u00d5", (Object)matchException, (long)318239133244429320L, (long)l2);
                                            }
                                            class_3102 = b;
                                        }
                                        catch (MatchException matchException) {
                                            throw eV.b("\u00d5", (Object)matchException, (long)318239133244429320L, (long)l2);
                                        }
                                    }
                                    try {
                                        if (eV.b("u", (Object)class_3102, (long)321992993083724729L, (long)l2) == false) {
                                            return;
                                        }
                                    }
                                    catch (MatchException matchException) {
                                        throw eV.b("\u00d5", (Object)matchException, (long)318239133244429320L, (long)l2);
                                    }
                                    try {
                                        if (eV.b("u", (Object)bD2, (Object)new Object[0], (long)318499964235963445L, (long)l2) != y_0.PRE) {
                                            return;
                                        }
                                    }
                                    catch (MatchException matchException) {
                                        throw eV.b("\u00d5", (Object)matchException, (long)318239133244429320L, (long)l2);
                                    }
                                    try {
                                        if (this.f) {
                                            eV.b("u", (Object)bD2, (Object)new Object[]{true}, (long)321730345204220027L, (long)l2);
                                            return;
                                        }
                                    }
                                    catch (MatchException matchException) {
                                        throw eV.b("\u00d5", (Object)matchException, (long)318239133244429320L, (long)l2);
                                    }
                                    try {
                                        try {
                                            callSite3 = eV.b("\u00f1", (Object)b, (long)321071239292083242L, (long)l2);
                                            if (callSite2 != null) break block37;
                                            if (callSite3 == null) return;
                                        }
                                        catch (MatchException matchException) {
                                            throw eV.b("\u00d5", (Object)matchException, (long)318239133244429320L, (long)l2);
                                        }
                                        callSite3 = eV.b("\u00f1", (Object)b, (long)321071239292083242L, (long)l2);
                                    }
                                    catch (MatchException matchException) {
                                        throw eV.b("\u00d5", (Object)matchException, (long)318239133244429320L, (long)l2);
                                    }
                                }
                                try {
                                    try {
                                        if (callSite2 != null) break block38;
                                        if (eV.b("u", (Object)callSite3, (long)318396624582323235L, (long)l2) == eV.b("\u00d8", (long)317600404515898229L, (long)l2)) break block39;
                                        return;
                                    }
                                    catch (MatchException matchException) {
                                        throw eV.b("\u00d5", (Object)matchException, (long)318239133244429320L, (long)l2);
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw eV.b("\u00d5", (Object)matchException, (long)318239133244429320L, (long)l2);
                                }
                            }
                            callSite3 = eV.b("\u00f1", (Object)b, (long)321071239292083242L, (long)l2);
                        }
                        try {
                            try {
                                if (callSite2 != null) break block40;
                                if (callSite3 instanceof class_3966) break block41;
                                return;
                            }
                            catch (MatchException matchException) {
                                throw eV.b("\u00d5", (Object)matchException, (long)318239133244429320L, (long)l2);
                            }
                        }
                        catch (MatchException matchException) {
                            throw eV.b("\u00d5", (Object)matchException, (long)318239133244429320L, (long)l2);
                        }
                    }
                    callSite3 = eV.b("\u00f1", (Object)b, (long)321071239292083242L, (long)l2);
                }
                CallSite callSite4 = eV.b("u", (Object)((class_3966)callSite3), (long)317565863915063427L, (long)l2);
                try {
                    try {
                        callSite = callSite4;
                        if (callSite2 != null) break block42;
                        if (!(callSite instanceof class_1657)) return;
                    }
                    catch (MatchException matchException) {
                        throw eV.b("\u00d5", (Object)matchException, (long)318239133244429320L, (long)l2);
                    }
                    callSite = callSite4;
                }
                catch (MatchException matchException) {
                    throw eV.b("\u00d5", (Object)matchException, (long)318239133244429320L, (long)l2);
                }
            }
            class_1657 class_16573 = (class_1657)callSite;
            try {
                if (callSite2 != null) {
                    return;
                }
            }
            catch (MatchException matchException) {
                throw eV.b("\u00d5", (Object)matchException, (long)318239133244429320L, (long)l2);
            }
            try {
                eV eV2;
                try {
                    eV2 = this;
                    class_16572 = class_16573;
                    if (callSite2 != null) break block43;
                    Object[] objectArray = new Object[2];
                    objectArray[1] = l3;
                    objectArray[0] = class_16572;
                    if (eV.b("u", (Object)eV2, (Object)objectArray, (long)317889026253544344L, (long)l2) == false) return;
                }
                catch (MatchException matchException) {
                    throw eV.b("\u00d5", (Object)matchException, (long)318239133244429320L, (long)l2);
                }
                this.i = 1;
                eV2 = this;
                class_16572 = class_16573;
            }
            catch (MatchException matchException) {
                throw eV.b("\u00d5", (Object)matchException, (long)318239133244429320L, (long)l2);
            }
        }
        eV2.g = class_16572;
        Object[] objectArray = new Object[1];
        objectArray[0] = l;
        eV.b("u", (Object)this.e, (Object)objectArray, (long)321926811794986247L, (long)l2);
        eV.b("u", (Object)bD2, (Object)new Object[0], (long)321244538978569568L, (long)l2);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private boolean a(Object[] objectArray) {
        reference v4;
        block34: {
            block33: {
                CallSite callSite;
                long l;
                block32: {
                    long l2;
                    class_1657 class_16572;
                    block30: {
                        block31: {
                            block28: {
                                block29: {
                                    Object object;
                                    long l3;
                                    block26: {
                                        block27: {
                                            class_16572 = (class_1657)objectArray[0];
                                            l = (Long)objectArray[1];
                                            long l4 = l = k ^ l;
                                            l3 = l4 ^ 0x2CB3EEF97F6L;
                                            l2 = l4 ^ 0x13D2F62319C9L;
                                            callSite = eV.b("\u00d5", (long)5748096590494972264L, (long)l);
                                            try {
                                                try {
                                                    object = class_16572;
                                                    if (callSite != null) break block26;
                                                    if (object != null) break block27;
                                                }
                                                catch (MatchException matchException) {
                                                    throw eV.b("\u00d5", (Object)matchException, (long)5754469425173946297L, (long)l);
                                                }
                                                return false;
                                            }
                                            catch (MatchException matchException) {
                                                throw eV.b("\u00d5", (Object)matchException, (long)5754469425173946297L, (long)l);
                                            }
                                        }
                                        object = eV.b("u", (Object)this.d, (long)5754232795634870487L, (long)l);
                                    }
                                    try {
                                        try {
                                            try {
                                                try {
                                                    v4 = eV.b("u", (Object)((Boolean)object), (long)5753837676783599054L, (long)l);
                                                    if (callSite != null) break block28;
                                                    if (v4 == false) break block29;
                                                }
                                                catch (MatchException matchException) {
                                                    throw eV.b("\u00d5", (Object)matchException, (long)5754469425173946297L, (long)l);
                                                }
                                                Object[] objectArray2 = new Object[2];
                                                objectArray2[1] = l3;
                                                objectArray2[0] = eV.b("u", (Object)eV.b("\u00f1", (Object)b, (long)5748007353965885643L, (long)l), (long)5748777719393220588L, (long)l);
                                                v4 = eV.b("\u00d5", (Object)objectArray2, (long)5753940989744621531L, (long)l);
                                                if (callSite != null) break block28;
                                            }
                                            catch (MatchException matchException) {
                                                throw eV.b("\u00d5", (Object)matchException, (long)5754469425173946297L, (long)l);
                                            }
                                            if (v4 != false) break block29;
                                        }
                                        catch (MatchException matchException) {
                                            throw eV.b("\u00d5", (Object)matchException, (long)5754469425173946297L, (long)l);
                                        }
                                        return false;
                                    }
                                    catch (MatchException matchException) {
                                        throw eV.b("\u00d5", (Object)matchException, (long)5754469425173946297L, (long)l);
                                    }
                                }
                                v4 = eV.b("u", (Object)((Boolean)((Object)eV.b("u", (Object)this.c, (long)5754232795634870487L, (long)l))), (long)5753837676783599054L, (long)l);
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            if (callSite != null) break block30;
                                            if (v4 == false) break block31;
                                        }
                                        catch (MatchException matchException) {
                                            throw eV.b("\u00d5", (Object)matchException, (long)5754469425173946297L, (long)l);
                                        }
                                        v4 = eV.b("\u00f1", (Object)class_16572, (long)5753533348929053776L, (long)l);
                                        if (callSite != null) break block30;
                                    }
                                    catch (MatchException matchException) {
                                        throw eV.b("\u00d5", (Object)matchException, (long)5754469425173946297L, (long)l);
                                    }
                                    if (v4 == false) break block31;
                                }
                                catch (MatchException matchException) {
                                    throw eV.b("\u00d5", (Object)matchException, (long)5754469425173946297L, (long)l);
                                }
                                return true;
                            }
                            catch (MatchException matchException) {
                                throw eV.b("\u00d5", (Object)matchException, (long)5754469425173946297L, (long)l);
                            }
                        }
                        v4 = eV.b("u", (Object)((Boolean)((Object)eV.b("u", (Object)this.a, (long)5754232795634870487L, (long)l))), (long)5753837676783599054L, (long)l);
                    }
                    try {
                        try {
                            if (callSite != null) break block32;
                            if (v4 == false) break block33;
                        }
                        catch (MatchException matchException) {
                            throw eV.b("\u00d5", (Object)matchException, (long)5754469425173946297L, (long)l);
                        }
                        Object[] objectArray3 = new Object[2];
                        objectArray3[1] = l2;
                        objectArray3[0] = class_16572;
                        reference v4 = eV.b("\u00d5", (Object)objectArray3, (long)5754060942492166241L, (long)l) - (double)0.3f;
                        v4 = v4 == 0 ? 0 : (v4 > 0 ? 1 : -1);
                    }
                    catch (MatchException matchException) {
                        throw eV.b("\u00d5", (Object)matchException, (long)5754469425173946297L, (long)l);
                    }
                }
                try {
                    if (callSite != null) break block34;
                    if (v4 <= 0) break block33;
                }
                catch (MatchException matchException) {
                    throw eV.b("\u00d5", (Object)matchException, (long)5754469425173946297L, (long)l);
                }
                v4 = (reference)1;
                break block34;
            }
            v4 = (reference)0;
        }
        return (boolean)v4;
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n3] != null) {
            return n3;
        }
        Object object = eV.l[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 12;
            case 1 -> 6;
            case 2 -> 43;
            case 3 -> 53;
            case 4 -> 15;
            case 5 -> 42;
            case 6 -> 61;
            case 7 -> 16;
            case 8 -> 24;
            case 9 -> 0;
            case 10 -> 62;
            case 11 -> 49;
            case 12 -> 45;
            case 13 -> 52;
            case 14 -> 37;
            case 15 -> 40;
            case 16 -> 33;
            case 17 -> 50;
            case 18 -> 54;
            case 19 -> 5;
            case 20 -> 8;
            case 21 -> 51;
            case 22 -> 36;
            case 23 -> 13;
            case 24 -> 38;
            case 25 -> 20;
            case 26 -> 7;
            case 27 -> 14;
            case 28 -> 28;
            case 29 -> 35;
            case 30 -> 30;
            case 31 -> 34;
            case 32 -> 31;
            case 33 -> 59;
            case 34 -> 56;
            case 35 -> 25;
            case 36 -> 57;
            case 37 -> 23;
            case 38 -> 18;
            case 39 -> 3;
            case 40 -> 47;
            case 41 -> 29;
            case 42 -> 58;
            case 43 -> 22;
            case 44 -> 44;
            case 45 -> 41;
            case 46 -> 46;
            case 47 -> 63;
            case 48 -> 60;
            case 49 -> 26;
            case 50 -> 27;
            case 51 -> 19;
            case 52 -> 4;
            case 53 -> 55;
            case 54 -> 10;
            case 55 -> 21;
            case 56 -> 32;
            case 57 -> 17;
            case 58 -> 1;
            case 59 -> 11;
            case 60 -> 48;
            case 61 -> 2;
            case 62 -> 9;
            default -> 39;
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
        eV.m[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = eV.m(l, l2);
        Object object = eV.l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = eV.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = eV.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = eV.g(clazz3, string2, clazz2)) != null) {
                    eV.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = eV.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        eV.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = eV.n(739715466144433L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = eV.m(l, l2);
        Object object = eV.l[n];
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
                clazz3 = eV.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = eV.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = eV.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        eV.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = eV.n(739715466144433L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = eV.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        eV.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = eV.n(739715466144433L, 0L);
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
            return MethodHandles.lookup().findStatic(eV.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


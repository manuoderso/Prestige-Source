/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_8956
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.dC;
import dev.zprestige.prestige.dF;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.ei_0;
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
import net.minecraft.class_1297;
import net.minecraft.class_8956;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class fP
extends dV
implements dF {
    private dO a;
    private dM d;
    private dO c;
    private dM e;
    private f5 f;
    private static final long k = hc.a(7581037384610898027L, 3566637571704634017L, MethodHandles.lookup().lookupClass()).a(134102446443167L);
    private static final Object[] l = new Object[89];
    private static final String[] m = new String[89];

    public fP() {
        long l = k ^ 0x29FF9C996B5EL;
        long l2 = l ^ 0x7BF90A92BC9FL;
        this.f = new f5(l2);
    }

    static {
        fP.f();
    }

    @Override
    public void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x7FAB131DDD11L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = this;
        fP.b("\u00d6", (Object)fP.b("\u00e8", (long)3996071384949065847L, (long)l), (Object)objectArray2, (long)3993474601777366688L, (long)l);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fP" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fP.m(l, l2);
            object = fP.l[n];
            try {
                if (!(object instanceof String)) break block2;
                fP.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fP.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fP.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fP.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fP.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = l;
        l[0] = "6==\u0013B 6=*ON/,v*QN:+\u0007~\t\u0019";
        objectArray[1] = "Rusg\rgRud;\u0001hH>d%\u0001}OO5}S";
        objectArray[2] = "+~\u001eI\u0017++~\t\u0015\u001b$15\t\u000b\u001b16DXTB";
        objectArray[3] = Double.TYPE;
        fP.m[3] = "java/lang/Double";
        objectArray[4] = "aISB\u0005vaID\u001e\ty{\u0002D\u0000\tl|s\u0014]X";
        objectArray[5] = "9\u0016zB7{9\u0016m\u001e;t#]m\u0000;a$,=Yi ";
        objectArray[6] = "\u0012\u0000\u0007\u0005\u001e0\u0019\u000f\u0016J}=\f\t";
        objectArray[7] = "4\f_Vh.4\fH\nd!.GH\u0014d4)6\u001aJ<p";
        objectArray[8] = "p\n0|(\tf\n5&;\u001eqA6 7\n`\u0006!7|\u001ax\u0006#<&WD\u001d#!&\u0010s\n";
        objectArray[9] = "\u0014&\\>G\u001d\u0002&YdT\n\u0015mZbX\u001e\u0004*Mu\u0013\t4";
        objectArray[10] = "/\u0003;nt.Z#0aea;-;ja;O";
        objectArray[11] = Void.TYPE;
        fP.m[11] = "java/lang/Void";
        objectArray[12] = "X_F\r\u00010FW\\B| F";
        objectArray[13] = "UT~`&\u007f^[o/GqUPku";
        objectArray[14] = ";\t>\r;+0\u0006/B\\34\u001a)\u000ey\"";
        objectArray[15] = "o=[i@zq5A&'{`.L|\u0001}";
        objectArray[16] = "\u0003+\u001e\u001f<C\u0015+\u001bE/T\u0002`\u0018C#@\u0013'\u000fThU7";
        objectArray[17] = "\u000e\u001f\u0014qFV\u0005\u0010\u0005>%[\u0010\u001d\nU\u0010Y\u0001\u000e\u0016y\u0007T";
        objectArray[18] = "MIu2DK[IphW\\L\u0002sn[H]Edy\u0010Za";
        objectArray[19] = "\u0018\u007f*t46m_!{%y\u0010G2|,0x";
        objectArray[20] = "B!<\u001f\u0005\bB!+C\t\u0007Xj+]\t\u0012_\u001bp\b]W";
        objectArray[21] = "JEYZ`5JEN\u0006l:P\u000eN\u0018l/W\u007f\u001bG5";
        objectArray[22] = Boolean.TYPE;
        fP.m[22] = "java/lang/Boolean";
        objectArray[23] = "\u0001M\u0011,fvtm\u001a#w9\u0015c\u0011(sca";
        objectArray[24] = "\u0003Q]t\u0005\u0002\u0015QX.\u0016\u0015\u0002\u001a[(\u001a\u0001\u0013]L?Q\u0016 ";
        objectArray[25] = "o~y\u0006P$\u001a^r\tAk{Py\u0002E1\u000f";
        objectArray[26] = "Yd)rbrOd,(qeX//.}qIh896f~";
        objectArray[27] = "mI.P'i{I+\n4~l\u0002(\f8j}E?\u001bs\u007f<";
        objectArray[28] = "\u0017\u007f\u0018~8\u0014b_\u0013q)[\u0003Q\u0018z-\u0001w";
        objectArray[29] = "e\u001cgO\u0017.\u0010<l@\u0006aq2gK\u0002;\u0005";
        objectArray[30] = "2_g\u001cCc9PvS/`7Rt\u001c\u0003";
        objectArray[31] = "\u000b\u0010(|\u0012F~0#s\u0003\t\u001f>(x\u0007Sk";
        objectArray[32] = Float.TYPE;
        fP.m[32] = "java/lang/Float";
        objectArray[33] = "xX \u0019[=nX%CH*y\u0013&ED>hT1R\u000f.s";
        objectArray[34] = " 4PAt\u0000U\u0014[NeO4\u001aPEa\u0015@";
        objectArray[35] = "\u000e1Yb\u0014L\u00181\\8\u0007[\u000fz_>\u000bO\u001e=H)@X!";
        objectArray[36] = "Hg@\u001c\u0011zChQSyzMgB";
        objectArray[37] = "\u0016e\u0014ZWocE\u001fUF \u0002K\u0014^Bzv";
        objectArray[38] = "c\n[6\u000eJ\u0016*P9\u001f\u0005w$[2\u001b_\u0003";
        objectArray[39] = "\u0013\f\u0016-\u001d\u001af,\u001d\"\fU\u0007\"\u0016)\b\u000fs";
        objectArray[40] = "i|T]Mc\u001c\\_R\\,}RTYXv\t";
        objectArray[41] = "Asv\u001eM\u007f4S}\u0011\\0U]v\u001aXj!";
        objectArray[42] = "@m4SUWPz6To\u0004/f7P\u0013\u0011Wq7[^hN\"?__\rI~+_o";
        objectArray[43] = "\u0001\bmazg\n\u001e)oA?\u0014\u000e*6=9\u0012c9=/fX\u000151<?h";
        objectArray[44] = "\u000e}\u000b@/%\u0006r\u0000zu&\u001bm\u0006\u0016Gp\\0^C\u0010r\u000el\u0019\u0016m$\u0005gXz";
        objectArray[45] = "D_M\u0011\u001cU\fR\u0013\u0019%U\u001cMJ\u0010r\u0002F\u001a\u0013|\u001f\u0005\u0018AV\u0003\u001dP\u0019^";
        objectArray[46] = "\u001e.a!W|Dl\u007f*-+tz~(G2\u000e\u007f=-\u001dB\u001en`\"]8\u001b-ex-";
        objectArray[47] = "\u0015l.Ul^\u000eh.H\u001dN~~5FtU\u0014\"/D&$";
        objectArray[48] = "\u0012\u0017#\u0019\u0004?Z\u001a}\u0011=4F\u0014 \u0013Q\u0006\u0012PxI=hB\t8\u0018@>I\u0002yt";
        objectArray[49] = "\u0013\u001bs\u001dmfUT1S\\aH\u0006)\u000f\u000b6\u0016Qqc5\u007fCQr\r=pH";
        objectArray[50] = "Wn{&6\u0018^p\u007f'\f\u0019Vl|&`+\u0001,-{5|\u0006!`=o\u0011Gue\u007f\f";
        objectArray[51] = "\u0005\u0010;S{@M\u001de[B@]\u0002<R\u0015\u0017\u0007Ub>x\u0010Y\u000e AzEX\u0011";
        objectArray[52] = "7\u001du\u0003\r%7\u001b!Ru7U_=]\t'-H=VD^;O!B\u001f7*\u001b|[u";
        objectArray[53] = "![@\u0018W\u0002g\u0014\u0002Vf\u0005zF\u001a\n1R%\u001bAf\u000b\u0013qP\u0019\n\u001a\td@";
        objectArray[54] = "NW7]m\u0000FX<g7\u0003[G:\u000b\u0005P\u001f\u001abgo_[[>\n.\u000b^\u0019]\t9\u000bZM4\u0018mVC'";
        objectArray[55] = "\"s;4.%x%.h@0\u001ce=g< dr=lqY}!5hp<z}!h@";
        objectArray[56] = "vfN\u0012\u000f1>k\u0010\u001a61.tI\u0013aft#\u0015\u007f\fa*xU\u0000\u000e4+g";
        objectArray[57] = "\u000e\u0002te^s\u0002\u000eg<nq\u000e\u001b\\0\u001emg\u000eq8\u0013{\u000e\u001f%e\n\u0011";
        objectArray[58] = "57pE=Ioae\u0019S[\u000b!v\u0016/Ls6v\u001db54=4\u000fjS7er\u0014S";
        objectArray[59] = "O\u001f\u0011RNPG\u0010\u001ah\u0014SZ\u000f\u001c\u0004&\u0000\u001fVFh\u001fUC\u0012\u0011\u0001\u000e\u0001\u001e\u000b{";
        objectArray[60] = "6\u0019T?p2~\u0014\n7I2n\u000bS>\u001ee4\\\u000eRsbj\u0007O-q7k\u0018";
        objectArray[61] = "k$tc?4=/\u007f\"S'3 qw\u0004pip,\u001biw7,mdk\"63";
        objectArray[62] = "|XKs\u001dX|^\u001f\"eJ\u001e\u001a\u0003-\u0019Zf\r\u0003&T#!\u0006A4\\E\"^\u0007/e";
        objectArray[63] = "SCHa.R[LC[tQFSE7F\u0007\u0004\u000f\u001fg\u0011YFK\u001f0)GE\rF[";
        objectArray[64] = "F4xb!q\u001cbm>Oax\"~13t\u00005~:~\r\u00162b.%d\u0007f?7O";
        objectArray[65] = "\u000e$\u0011iE%Tf\u000fb?rda\tbCb\u001cv\ti\u000e\u001b^$\u0015aGd\\q\u0014~?";
        objectArray[66] = "\n><\u0000k\u0015\u00062/Y[\u0011\u000e,.8j\u0013\u001d'(SbM\u0004fR";
        objectArray[67] = "\u00126L\u001f:s\u0011~V[HjCrOB$X\u00173\u0014\u0018p\u000f\u00140JD0p\u0016eK[H5\u0010kN]77EjQ%r1KoWZpdJp/\u001fvjOvP\u001d#kP\u000e";
        objectArray[68] = "xn7\u0011G\u0018.e<P+\u000b j2\u0005|\\z:ni\u0011[$f.\u0016\u0013\u000e%y";
        objectArray[69] = "#,\u0018x|zyz\r$\u0012k\u001d:\u001e+n\u007fe-\u001e #\u0006\"&\\2+`!~\u001a)\u0012";
        objectArray[70] = "KJV\u0014!\u0002\u0010\u001aW\rCYH\u0012I\u0010*Uq\u001cI\u0000.3A\u001eH\u0000)ZPJ\u0015\u0019C";
        objectArray[71] = "s{E\u007f\u001bavl\r5pcN?PqAj2e\u0006d\u001d";
        objectArray[72] = "oHLZ?Vh\u0014XZ\u000fZ\u000e\fDUsJv\u001bD^>3k\u000bE\nd\u000bu\b\u0003S\u000f";
        objectArray[73] = "ds5\u001f$e:1q\rMl!44cw)=/0\u001cu|<0HYsr967[&s&N";
        objectArray[74] = ";\u00196\u001a-HzM3XN@kT*\u0001\"r;\u0018pWN\u001cyK'_ Tt\u0015/f";
        objectArray[75] = "\u0004\u0006{N\u000bG\r\u0018\u007fO1F\u0005\u0004|N]tUH&\u00181\u001a\u0017\u001bq\u0010_R\u001aEy)";
        objectArray[76] = "G\u001a\f,\u0018\u000bN\u0004\b-\"\nF\u0018\u000b,N8\u0016TSv\"\u0001@\u0001\u0016!K\u0010\u0014\\\u000fK";
        objectArray[77] = ",yB^\u001c!dt\u001cV%!tkE_rv.<\u001a3\u001fqpgYL\u001d$qx";
        objectArray[78] = "\u0011QyE\u000eh\u0019^r\u007fTk\u0004At\u0013f;F\u001d\"\u007f\u000b8\u001d@k\u0000\tm\u001c_\u0013E\u000fc\u0019YlGZb\u0006!)ATg\u0000^+\u0014Uxx\u001b-\u001aP~\u0007\u0019x\u001bO\u0006";
        objectArray[79] = "9,O6&_89C=YK\\%\u00071%[$2\u0007:h\"c9E(`D`a\u00033Y";
        objectArray[80] = "S\u0017\rK4k[\u0018\u0006qnhF\u0007\u0000\u001d\\?\u0006W]A\u000bkQ\u0002\u001a\u001bbz\u0005_\u0003q";
        objectArray[81] = "zy\u001bu\u0006\u0005pgZ/x\u0011\u001d1C2\u0003\u0002v9\u001d+Bx";
        objectArray[82] = "nJ;CB\u001e&GeK{\u001e6X<B,Il\u000fd.AN2T QC\u001b3K";
        objectArray[83] = "cD{sVckOy|*9=)s|T%)B{\"MdS\u0019/!A\"n\u0011$#N^";
        objectArray[84] = "|\u001e616\u0013j\u001ed\"\r\u0006`G6=S\u0001`]2Ah\u0014|\u001d4yv\u0017:D_";
        objectArray[85] = ">`\t~ma9<\u001d~]m_$\u0001q!}'3\u0001zl\u000414\u001dn7m `@w]";
        objectArray[86] = "\u0017h\u000f\\w\u0011\u0006r\u001aL\u0010\u0018\u0017l\u0005@|*C \\\u001e*}\u0013{X\u0019+D\u0018m\u001c\u0017\u0010";
        objectArray[87] = "/\u0014N\u000bv\u001by\u001fEJ\u001a\bw\u0010K\u001fM_-@\u0015s Xs\u001cW\f\"\rr\u0003";
        Object[] objectArray2 = objectArray;
        objectArray[88] = "\n\t\u001bP^7PK\u0005[$``L\u0003[Xp\u0018[\u0003P\u0015\t]\u0006\u0006EGd\u001cR\u0003\u0007$";
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f4' || c == 'h' || c == '\u00e8' || c == 'n') {
                field = fP.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f4' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'h' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fP.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d6' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00b5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @Override
    public void d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x52D6E774439DL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = this;
        fP.b("\u00d6", (Object)fP.b("\u00e8", (long)3249274854526161428L, (long)l), (Object)objectArray2, (long)3249134084890085690L, (long)l);
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = fP.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private class_1297 a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = k ^ l;
        class_8956 class_89562 = null;
        Object object = Double.MAX_VALUE;
        CallSite callSite = fP.b("\u00b5", (long)-5487429102206947428L, (long)l);
        CallSite callSite2 = fP.b("\u00d6", (Object)fP.b("\u00d6", (Object)fP.b("\u00f4", (Object)b, (long)-5485945548590756575L, (long)l), (long)-5492451117567433633L, (long)l), (long)-5487156817341786057L, (long)l);
        while (fP.b("\u00d6", (Object)callSite2, (long)-5486224980564080261L, (long)l) != false) {
            block28: {
                reference v10;
                block27: {
                    reference v8;
                    reference var12_10;
                    class_8956 class_89563;
                    block26: {
                        class_8956 class_89564;
                        block25: {
                            Object object2;
                            block23: {
                                class_1297 class_12972;
                                block22: {
                                    class_1297 class_12973 = (class_1297)fP.b("\u00d6", (Object)callSite2, (long)-5493277763996055440L, (long)l);
                                    try {
                                        class_12972 = class_12973;
                                        if (callSite != null) break block22;
                                        if (!(class_12972 instanceof class_8956)) continue;
                                    }
                                    catch (MatchException matchException) {
                                        throw fP.b("\u00b5", (Object)matchException, (long)-5487402779778133066L, (long)l);
                                    }
                                    class_12972 = class_12973;
                                }
                                class_89563 = (class_8956)class_12972;
                                try {
                                    try {
                                        object2 = class_89563;
                                        if (callSite != null) break block23;
                                        if (fP.b("\u00d6", (Object)object2, (long)-5494280160505637970L, (long)l) == false) {
                                            continue;
                                        }
                                    }
                                    catch (MatchException matchException) {
                                        throw fP.b("\u00b5", (Object)matchException, (long)-5487402779778133066L, (long)l);
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw fP.b("\u00b5", (Object)matchException, (long)-5487402779778133066L, (long)l);
                                }
                                try {
                                    class_89564 = class_89563;
                                    if (callSite != null) break block25;
                                    object2 = fP.b("\u00d6", (Object)class_89564, (long)-5485395074013927477L, (long)l);
                                }
                                catch (MatchException matchException) {
                                    throw fP.b("\u00b5", (Object)matchException, (long)-5487402779778133066L, (long)l);
                                }
                            }
                            try {
                                if (object2 == fP.b("\u00f4", (Object)b, (long)-5485601892394061719L, (long)l)) {
                                    continue;
                                }
                            }
                            catch (MatchException matchException) {
                                throw fP.b("\u00b5", (Object)matchException, (long)-5487402779778133066L, (long)l);
                            }
                            class_89564 = class_89563;
                        }
                        CallSite callSite3 = fP.b("\u00d6", (Object)fP.b("\u00d6", (Object)class_89564, (long)-5493930185150779907L, (long)l), (long)-5485530695511384879L, (long)l);
                        var12_10 = fP.b("\u00d6", (Object)fP.b("\u00f4", (Object)b, (long)-5485601892394061719L, (long)l), (double)fP.b("\u00f4", (Object)callSite3, (long)-5492550828370718608L, (long)l), (double)fP.b("\u00f4", (Object)callSite3, (long)-5486504909170625119L, (long)l), (double)fP.b("\u00f4", (Object)callSite3, (long)-5493750467577915834L, (long)l), (long)-5494123122145272479L, (long)l);
                        try {
                            reference v8 = fP.b("\u00b5", (double)var12_10, (long)-5494062776053579412L, (long)l) - 5.0;
                            v8 = v8 == 0 ? 0 : (v8 > 0 ? 1 : -1);
                            if (callSite != null) break block26;
                            if (v8 > 0) {
                                continue;
                            }
                        }
                        catch (MatchException matchException) {
                            throw fP.b("\u00b5", (Object)matchException, (long)-5487402779778133066L, (long)l);
                        }
                        try {
                            v10 = var12_10;
                            if (callSite != null) break block27;
                            reference v8 = v10 - object;
                            v8 = v8 == 0 ? 0 : (v8 < 0 ? -1 : 1);
                        }
                        catch (MatchException matchException) {
                            throw fP.b("\u00b5", (Object)matchException, (long)-5487402779778133066L, (long)l);
                        }
                    }
                    if (v8 >= 0) break block28;
                    class_89562 = class_89563;
                    v10 = var12_10;
                }
                object = v10;
            }
            if (callSite == null) continue;
        }
        return class_89562;
    }

    private double a(Object[] objectArray) {
        class_1297 class_12972 = (class_1297)objectArray[0];
        long l = (Long)objectArray[1];
        l = k ^ l;
        CallSite callSite = fP.b("\u00d6", (Object)fP.b("\u00f4", (Object)b, (long)6096466887056742189L, (long)l), (long)6096838254797174375L, (long)l);
        CallSite callSite2 = fP.b("\u00d6", (Object)class_12972, (long)6090502084194591174L, (long)l);
        CallSite callSite3 = fP.b("\u00b5", (double)fP.b("\u00f4", (Object)callSite, (long)6089623635192543028L, (long)l), (double)fP.b("\u00f4", (Object)callSite2, (long)6090034398117905375L, (long)l), (double)fP.b("\u00f4", (Object)callSite2, (long)6096041626530129896L, (long)l), (long)6091018226884863039L, (long)l);
        CallSite callSite4 = fP.b("\u00b5", (double)fP.b("\u00f4", (Object)callSite, (long)6095691001234739941L, (long)l), (double)fP.b("\u00f4", (Object)callSite2, (long)6096647238619013456L, (long)l), (double)fP.b("\u00f4", (Object)callSite2, (long)6096778275357386618L, (long)l), (long)6091018226884863039L, (long)l);
        CallSite callSite5 = fP.b("\u00b5", (double)fP.b("\u00f4", (Object)callSite, (long)6090693531758178562L, (long)l), (double)fP.b("\u00f4", (Object)callSite2, (long)6095713722355196822L, (long)l), (double)fP.b("\u00f4", (Object)callSite2, (long)6089946706466701752L, (long)l), (long)6091018226884863039L, (long)l);
        reference var13_9 = fP.b("\u00f4", (Object)callSite, (long)6089623635192543028L, (long)l) - callSite3;
        reference var15_10 = fP.b("\u00f4", (Object)callSite, (long)6095691001234739941L, (long)l) - callSite4;
        reference var17_11 = fP.b("\u00f4", (Object)callSite, (long)6090693531758178562L, (long)l) - callSite5;
        return (double)fP.b("\u00b5", (double)(var13_9 * var13_9 + var15_10 * var15_10 + var17_11 * var17_11), (long)6090293253770815016L, (long)l);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public dC a(Object[] objectArray) {
        CallSite callSite;
        reference v19;
        CallSite callSite2;
        CallSite callSite3;
        long l;
        long l2;
        long l3;
        block78: {
            CallSite callSite4;
            block79: {
                block76: {
                    Object object;
                    block77: {
                        block74: {
                            long l4;
                            block75: {
                                block72: {
                                    block73: {
                                        block71: {
                                            block69: {
                                                reference cfr_temp_0;
                                                block70: {
                                                    CallSite callSite5;
                                                    long l5;
                                                    long l6;
                                                    block67: {
                                                        block68: {
                                                            Object object2;
                                                            long l7;
                                                            block65: {
                                                                block66: {
                                                                    block63: {
                                                                        long l8;
                                                                        block64: {
                                                                            block61: {
                                                                                block62: {
                                                                                    block59: {
                                                                                        block60: {
                                                                                            block57: {
                                                                                                block58: {
                                                                                                    l3 = (Long)objectArray[0];
                                                                                                    long l9 = l3;
                                                                                                    l7 = l9 ^ 0x6EE000927036L;
                                                                                                    l6 = l9 ^ 0x6CCF45119AEL;
                                                                                                    l4 = l9 ^ 0x5491C3C49772L;
                                                                                                    l2 = l9 ^ 0x53005072D29FL;
                                                                                                    l = l9 ^ 0x1A99A2A6F024L;
                                                                                                    l8 = l9 ^ 0x4DCDFBE1C8B5L;
                                                                                                    l5 = l9 ^ 0x5C9A0C609185L;
                                                                                                    callSite4 = fP.b("\u00b5", (long)-1174710246018567178L, (long)l3);
                                                                                                    try {
                                                                                                        try {
                                                                                                            object2 = fP.b("\u00d6", (Object)fP.b("\u00f4", (Object)b, (long)-1174013247712826365L, (long)l3), (long)-1173278195493853450L, (long)l3);
                                                                                                            if (callSite4 != null) break block57;
                                                                                                            if (object2 == false) break block58;
                                                                                                            return null;
                                                                                                        }
                                                                                                        catch (MatchException matchException) {
                                                                                                            throw fP.b("\u00b5", (Object)matchException, (long)-1174595963733930020L, (long)l3);
                                                                                                        }
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw fP.b("\u00b5", (Object)matchException, (long)-1174595963733930020L, (long)l3);
                                                                                                    }
                                                                                                }
                                                                                                object2 = fP.b("\u00d6", (Object)((Boolean)((Object)fP.b("\u00d6", (Object)this.e, (long)-1176272972785026413L, (long)l3))), (long)-1177412460270134033L, (long)l3);
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (callSite4 != null) break block59;
                                                                                                            if (object2 == false) break block60;
                                                                                                        }
                                                                                                        catch (MatchException matchException) {
                                                                                                            throw fP.b("\u00b5", (Object)matchException, (long)-1174595963733930020L, (long)l3);
                                                                                                        }
                                                                                                        object2 = fP.b("\u00d6", (Object)fP.b("\u00f4", (Object)b, (long)-1174013247712826365L, (long)l3), (long)-1176181347247899894L, (long)l3);
                                                                                                        if (callSite4 != null) break block59;
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw fP.b("\u00b5", (Object)matchException, (long)-1174595963733930020L, (long)l3);
                                                                                                    }
                                                                                                    if (object2 == false) break block60;
                                                                                                    return null;
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw fP.b("\u00b5", (Object)matchException, (long)-1174595963733930020L, (long)l3);
                                                                                                }
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw fP.b("\u00b5", (Object)matchException, (long)-1174595963733930020L, (long)l3);
                                                                                            }
                                                                                        }
                                                                                        object2 = ei_0.R;
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            if (callSite4 != null) break block61;
                                                                                            if (object2 == false) break block62;
                                                                                            return null;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw fP.b("\u00b5", (Object)matchException, (long)-1174595963733930020L, (long)l3);
                                                                                        }
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw fP.b("\u00b5", (Object)matchException, (long)-1174595963733930020L, (long)l3);
                                                                                    }
                                                                                }
                                                                                object2 = fP.b("\u00d6", (Object)fP.b("\u00e8", (long)-1177535264380301141L, (long)l3), (Object)new Object[0], (long)-1177326894578723320L, (long)l3);
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    if (callSite4 != null) break block63;
                                                                                    if (object2 == false) break block64;
                                                                                    return null;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw fP.b("\u00b5", (Object)matchException, (long)-1174595963733930020L, (long)l3);
                                                                                }
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw fP.b("\u00b5", (Object)matchException, (long)-1174595963733930020L, (long)l3);
                                                                            }
                                                                        }
                                                                        Object[] objectArray2 = new Object[2];
                                                                        objectArray2[1] = l8;
                                                                        objectArray2[0] = Float.valueOf(100.0f);
                                                                        object2 = fP.b("\u00d6", (Object)this.f, (Object)objectArray2, (long)-1174221519513518906L, (long)l3);
                                                                    }
                                                                    try {
                                                                        if (callSite4 != null) break block65;
                                                                        if (object2 != false) break block66;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw fP.b("\u00b5", (Object)matchException, (long)-1174595963733930020L, (long)l3);
                                                                    }
                                                                    object2 = 1;
                                                                    break block65;
                                                                }
                                                                object2 = 0;
                                                            }
                                                            object = object2;
                                                            Object[] objectArray3 = new Object[1];
                                                            objectArray3[0] = l7;
                                                            callSite3 = fP.b("\u00d6", (Object)this, (Object)objectArray3, (long)-1175612446425818503L, (long)l3);
                                                            try {
                                                                try {
                                                                    callSite5 = callSite3;
                                                                    if (callSite4 != null) break block67;
                                                                    if (callSite5 != null) break block68;
                                                                    return null;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw fP.b("\u00b5", (Object)matchException, (long)-1174595963733930020L, (long)l3);
                                                                }
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw fP.b("\u00b5", (Object)matchException, (long)-1174595963733930020L, (long)l3);
                                                            }
                                                        }
                                                        callSite5 = callSite3;
                                                    }
                                                    CallSite callSite6 = fP.b("\u00d6", (Object)fP.b("\u00d6", (Object)callSite5, (long)-1176602653913097496L, (long)l3), (long)-1173942062105001797L, (long)l3);
                                                    Object[] objectArray4 = new Object[2];
                                                    objectArray4[1] = l5;
                                                    objectArray4[0] = callSite6;
                                                    callSite2 = fP.b("\u00d6", (Object)fP.b("\u00e8", (long)-1177535264380301141L, (long)l3), (Object)objectArray4, (long)-1174166023420175670L, (long)l3);
                                                    try {
                                                        try {
                                                            try {
                                                                v19 = fP.b("\u00d6", (Object)((Boolean)((Object)fP.b("\u00d6", (Object)this.d, (long)-1176272972785026413L, (long)l3))), (long)-1177412460270134033L, (long)l3);
                                                                if (callSite4 != null) break block69;
                                                                if (v19 == false) break block70;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw fP.b("\u00b5", (Object)matchException, (long)-1174595963733930020L, (long)l3);
                                                            }
                                                            v19 = fP.b("\u00d6", (Object)callSite2, (Object)new Object[0], (long)-1176526765751228813L, (long)l3);
                                                            if (callSite4 != null) break block69;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw fP.b("\u00b5", (Object)matchException, (long)-1174595963733930020L, (long)l3);
                                                        }
                                                        if (v19 != false) break block70;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw fP.b("\u00b5", (Object)matchException, (long)-1174595963733930020L, (long)l3);
                                                    }
                                                    Object[] objectArray5 = new Object[3];
                                                    objectArray5[2] = l6;
                                                    objectArray5[1] = callSite6;
                                                    objectArray5[0] = callSite2;
                                                    callSite2 = fP.b("\u00b5", (Object)objectArray5, (long)-1174342664411451835L, (long)l3);
                                                }
                                                v19 = (cfr_temp_0 = fP.b("\u00d6", (Object)callSite2, (Object)new Object[0], (long)-1176711313032043660L, (long)l3) - fP.b("\u00d6", (Object)fP.b("\u00f4", (Object)b, (long)-1174013247712826365L, (long)l3), (long)-1173594184651071485L, (long)l3) - fP.b("\u00d6", (Object)((Float)((Object)fP.b("\u00d6", (Object)this.c, (long)-1176272972785026413L, (long)l3))), (long)-1176438472640437302L, (long)l3) * 2.0f) == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                            }
                                            try {
                                                try {
                                                    if (callSite4 != null) break block71;
                                                    if (v19 > 0) return null;
                                                }
                                                catch (MatchException matchException) {
                                                    throw fP.b("\u00b5", (Object)matchException, (long)-1174595963733930020L, (long)l3);
                                                }
                                                reference v19 = fP.b("\u00d6", (Object)callSite2, (Object)new Object[0], (long)-1176711313032043660L, (long)l3) - fP.b("\u00d6", (Object)fP.b("\u00f4", (Object)b, (long)-1174013247712826365L, (long)l3), (long)-1173594184651071485L, (long)l3) - -fP.b("\u00d6", (Object)((Float)((Object)fP.b("\u00d6", (Object)this.c, (long)-1176272972785026413L, (long)l3))), (long)-1176438472640437302L, (long)l3) * 2.0f;
                                                v19 = v19 == 0 ? 0 : (v19 < 0 ? -1 : 1);
                                            }
                                            catch (MatchException matchException) {
                                                throw fP.b("\u00b5", (Object)matchException, (long)-1174595963733930020L, (long)l3);
                                            }
                                        }
                                        try {
                                            try {
                                                if (callSite4 != null) break block72;
                                                if (v19 >= 0) break block73;
                                                return null;
                                            }
                                            catch (MatchException matchException) {
                                                throw fP.b("\u00b5", (Object)matchException, (long)-1174595963733930020L, (long)l3);
                                            }
                                        }
                                        catch (MatchException matchException) {
                                            throw fP.b("\u00b5", (Object)matchException, (long)-1174595963733930020L, (long)l3);
                                        }
                                    }
                                    v19 = fP.b("\u00d6", (Object)fP.b("\u00f4", (Object)b, (long)-1174013247712826365L, (long)l3), (Object)callSite3, (long)-1174087383100991676L, (long)l3);
                                }
                                try {
                                    try {
                                        if (callSite4 != null) break block74;
                                        if (v19 != false) break block75;
                                        return null;
                                    }
                                    catch (MatchException matchException) {
                                        throw fP.b("\u00b5", (Object)matchException, (long)-1174595963733930020L, (long)l3);
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw fP.b("\u00b5", (Object)matchException, (long)-1174595963733930020L, (long)l3);
                                }
                            }
                            Object[] objectArray6 = new Object[2];
                            objectArray6[1] = l4;
                            objectArray6[0] = callSite3;
                            reference v19 = fP.b("\u00d6", (Object)this, (Object)objectArray6, (long)-1177351675059588179L, (long)l3) - (double)fP.b("\u00d6", (Object)((Float)((Object)fP.b("\u00d6", (Object)this.a, (long)-1176272972785026413L, (long)l3))), (long)-1176438472640437302L, (long)l3);
                            v19 = v19 == 0 ? 0 : (v19 > 0 ? 1 : -1);
                        }
                        try {
                            try {
                                if (callSite4 != null) break block76;
                                if (v19 <= 0) break block77;
                                return null;
                            }
                            catch (MatchException matchException) {
                                throw fP.b("\u00b5", (Object)matchException, (long)-1174595963733930020L, (long)l3);
                            }
                        }
                        catch (MatchException matchException) {
                            throw fP.b("\u00b5", (Object)matchException, (long)-1174595963733930020L, (long)l3);
                        }
                    }
                    v19 = object;
                }
                try {
                    try {
                        if (callSite4 != null) break block78;
                        if (v19 == false) break block79;
                        return null;
                    }
                    catch (MatchException matchException) {
                        throw fP.b("\u00b5", (Object)matchException, (long)-1174595963733930020L, (long)l3);
                    }
                }
                catch (MatchException matchException) {
                    throw fP.b("\u00b5", (Object)matchException, (long)-1174595963733930020L, (long)l3);
                }
            }
            try {
                callSite = callSite2;
                if (callSite4 != null) return callSite;
                v19 = fP.b("\u00d6", (Object)callSite, (Object)new Object[0], (long)-1176526765751228813L, (long)l3);
            }
            catch (MatchException matchException) {
                throw fP.b("\u00b5", (Object)matchException, (long)-1174595963733930020L, (long)l3);
            }
        }
        try {
            if (v19 != false) {
                return callSite2;
            }
        }
        catch (MatchException matchException) {
            throw fP.b("\u00b5", (Object)matchException, (long)-1174595963733930020L, (long)l3);
        }
        Object[] objectArray7 = new Object[2];
        objectArray7[1] = l2;
        objectArray7[0] = callSite3;
        fP.b("\u00b5", (Object)objectArray7, (long)-1176960553333784575L, (long)l3);
        Object[] objectArray8 = new Object[1];
        objectArray8[0] = l;
        fP.b("\u00d6", (Object)this.f, (Object)objectArray8, (long)-1173497649804465282L, (long)l3);
        callSite = callSite2;
        return callSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return fP.b("\u00b5", (Object)((Object)q_0.Mace), (long)-2444070979210317550L, (long)l);
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n3] != null) {
            return n3;
        }
        Object object = fP.l[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 22;
            case 1 -> 44;
            case 2 -> 48;
            case 3 -> 45;
            case 4 -> 38;
            case 5 -> 10;
            case 6 -> 0;
            case 7 -> 41;
            case 8 -> 40;
            case 9 -> 39;
            case 10 -> 57;
            case 11 -> 63;
            case 12 -> 4;
            case 13 -> 18;
            case 14 -> 59;
            case 15 -> 19;
            case 16 -> 46;
            case 17 -> 58;
            case 18 -> 54;
            case 19 -> 32;
            case 20 -> 29;
            case 21 -> 2;
            case 22 -> 24;
            case 23 -> 51;
            case 24 -> 49;
            case 25 -> 15;
            case 26 -> 21;
            case 27 -> 62;
            case 28 -> 5;
            case 29 -> 47;
            case 30 -> 1;
            case 31 -> 17;
            case 32 -> 23;
            case 33 -> 12;
            case 34 -> 55;
            case 35 -> 8;
            case 36 -> 36;
            case 37 -> 50;
            case 38 -> 13;
            case 39 -> 11;
            case 40 -> 20;
            case 41 -> 30;
            case 42 -> 28;
            case 43 -> 56;
            case 44 -> 27;
            case 45 -> 26;
            case 46 -> 9;
            case 47 -> 31;
            case 48 -> 6;
            case 49 -> 3;
            case 50 -> 34;
            case 51 -> 43;
            case 52 -> 37;
            case 53 -> 14;
            case 54 -> 35;
            case 55 -> 61;
            case 56 -> 25;
            case 57 -> 7;
            case 58 -> 16;
            case 59 -> 53;
            case 60 -> 42;
            case 61 -> 60;
            case 62 -> 33;
            default -> 52;
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
        fP.m[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = fP.m(l, l2);
        Object object = fP.l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = fP.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fP.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fP.g(clazz3, string2, clazz2)) != null) {
                    fP.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fP.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fP.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fP.n(975774809856962L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = fP.m(l, l2);
        Object object = fP.l[n];
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
                clazz3 = fP.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fP.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fP.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        fP.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fP.n(975774809856962L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fP.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fP.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fP.n(975774809856962L, 0L);
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
            return MethodHandles.lookup().findStatic(fP.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


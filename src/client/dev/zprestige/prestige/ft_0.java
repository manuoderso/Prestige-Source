/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_3966
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dP;
import dev.zprestige.prestige.dV;
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
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3966;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.ft
 */
public class ft_0
extends dV {
    private dO a;
    private dO c;
    private dO d;
    private dM e;
    private dM f;
    private dM g;
    private dP h;
    private dM i;
    private dM j;
    private int k;
    private static boolean l;
    private static final long m;
    private static final Object[] n;
    private static final String[] o;

    public ft_0() {
        long l = m ^ 0x3B88A9345815L;
        long l2 = l ^ 0xB00ABC54E82L;
        this.k = -1;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = this::lambda$new$0;
        ft_0.b("\u00f1", (Object)this.i, (Object)objectArray, (long)-2433870492992523732L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = this::lambda$new$1;
        ft_0.b("\u00f1", (Object)this.j, (Object)objectArray2, (long)-2433870492992523732L, (long)l);
    }

    static {
        m = hc.a(6525823529030903787L, 6978766549562141776L, MethodHandles.lookup().lookupClass()).a(15939126315518L);
        n = new Object[88];
        o = new String[88];
        ft_0.f();
    }

    @Override
    public void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x77453CB1BF38L;
        ft_0.l = 0;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        ft_0.b("\u00f1", (Object)this, (Object)objectArray2, (long)3993173297628125422L, (long)l);
    }

    private class_1657 b(Object[] objectArray) {
        class_1657 class_16572;
        block20: {
            float f = ((Float)objectArray[0]).floatValue();
            long l = (Long)objectArray[1];
            long l2 = l = m ^ l;
            long l3 = l2 ^ 0xD5A36DC3782L;
            long l4 = l2 ^ 0x2ACB321A6BB8L;
            class_1657 class_16573 = null;
            Object object = Double.MAX_VALUE;
            CallSite callSite = ft_0.b("\u00f1", (Object)ft_0.b("\u00f1", (Object)ft_0.b("\u00cc", (Object)b, (long)6198550084609532071L, (long)l), (long)6198418372026346080L, (long)l), (long)6205144307570637609L, (long)l);
            CallSite callSite2 = ft_0.b("u", (long)6198183212229377399L, (long)l);
            while (ft_0.b("\u00f1", (Object)callSite, (long)6198890104525679694L, (long)l) != false) {
                block26: {
                    reference v11;
                    class_1657 class_16574;
                    block25: {
                        reference v9;
                        reference var16_12;
                        block24: {
                            CallSite callSite3;
                            block23: {
                                block22: {
                                    block21: {
                                        class_16574 = (class_1657)ft_0.b("\u00f1", (Object)callSite, (long)6203981353488252365L, (long)l);
                                        try {
                                            try {
                                                class_16572 = class_16574;
                                                if (callSite2 != null) break block20;
                                                callSite3 = ft_0.b("\u00f1", (Object)class_16572, (long)6198831327357033327L, (long)l);
                                                if (callSite2 != null) break block21;
                                            }
                                            catch (MatchException matchException) {
                                                throw ft_0.b("u", (Object)matchException, (long)6204673738413112091L, (long)l);
                                            }
                                            if (callSite3 == false) continue;
                                        }
                                        catch (MatchException matchException) {
                                            throw ft_0.b("u", (Object)matchException, (long)6204673738413112091L, (long)l);
                                        }
                                        callSite3 = ft_0.b("\u00f1", (Object)class_16574, (Object)ft_0.b("\u00cc", (Object)b, (long)6198319817905910583L, (long)l), (long)6204160994537138162L, (long)l);
                                    }
                                    try {
                                        if (callSite2 != null) break block22;
                                        if (callSite3 != false) {
                                            continue;
                                        }
                                    }
                                    catch (MatchException matchException) {
                                        throw ft_0.b("u", (Object)matchException, (long)6204673738413112091L, (long)l);
                                    }
                                    Object[] objectArray2 = new Object[2];
                                    objectArray2[1] = l3;
                                    objectArray2[0] = ft_0.b("\u00f1", (Object)ft_0.b("\u00f1", (Object)class_16574, (long)6204116860970934325L, (long)l), (long)6198660898352352610L, (long)l);
                                    callSite3 = ft_0.b("\u00f1", (Object)ft_0.b("A", (long)6198611668984304488L, (long)l), (Object)objectArray2, (long)6204365093711614088L, (long)l);
                                }
                                try {
                                    if (callSite2 != null) break block23;
                                    if (callSite3 != false) {
                                        continue;
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw ft_0.b("u", (Object)matchException, (long)6204673738413112091L, (long)l);
                                }
                                Object[] objectArray3 = new Object[2];
                                objectArray3[1] = l4;
                                objectArray3[0] = class_16574;
                                callSite3 = ft_0.b("u", (Object)objectArray3, (long)6204308269574258032L, (long)l);
                            }
                            if (callSite3 == false) continue;
                            class_243 class_2432 = new class_243((double)ft_0.b("\u00f1", (Object)class_16574, (long)6204041210664240965L, (long)l), (double)ft_0.b("\u00f1", (Object)ft_0.b("\u00cc", (Object)b, (long)6198319817905910583L, (long)l), (long)6198050986966146950L, (long)l), (double)ft_0.b("\u00f1", (Object)class_16574, (long)6204885375292123731L, (long)l));
                            var16_12 = ft_0.b("\u00f1", (Object)ft_0.b("\u00cc", (Object)b, (long)6198319817905910583L, (long)l), (Object)class_2432, (long)6203811285007576901L, (long)l);
                            try {
                                reference v9 = var16_12 - (double)(f * f);
                                v9 = v9 == 0 ? 0 : (v9 > 0 ? 1 : -1);
                                if (callSite2 != null) break block24;
                                if (v9 > 0) {
                                    continue;
                                }
                            }
                            catch (MatchException matchException) {
                                throw ft_0.b("u", (Object)matchException, (long)6204673738413112091L, (long)l);
                            }
                            try {
                                v11 = var16_12;
                                if (callSite2 != null) break block25;
                                reference v9 = v11 - object;
                                v9 = v9 == 0 ? 0 : (v9 < 0 ? -1 : 1);
                            }
                            catch (MatchException matchException) {
                                throw ft_0.b("u", (Object)matchException, (long)6204673738413112091L, (long)l);
                            }
                        }
                        if (v9 >= 0) break block26;
                        v11 = var16_12;
                    }
                    object = v11;
                    class_16573 = class_16574;
                }
                if (callSite2 == null) continue;
            }
            class_16572 = class_16573;
        }
        return class_16572;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ft" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ft_0.m(l, l2);
            object = ft_0.n[n];
            try {
                if (!(object instanceof String)) break block2;
                ft_0.n[n] = clazz = Class.forName(o[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = ft_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ft_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ft_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ft_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = n;
        n[0] = "\u0012\u0010\u0007,yi\u0004\u0010\u0002vj~\u0013[\u0001pfj\u0002\u001c\u0016g-\u007f\u0002";
        objectArray[1] = "xq\u001c\r@E\rQ\u0017\u0002Q\nl_\u001c\tUP\u0018";
        objectArray[2] = Void.TYPE;
        ft_0.o[2] = "java/lang/Void";
        objectArray[3] = "\b\bG\u001a2\u0000\u001e\bB@!\u0017\tCAF-\u0003\u0018\u0004VQf\u0014!";
        objectArray[4] = "\u0016Q\u0019eO\u0004cq\u0012j^K\u0002\u007f\u0019aZ\u0011v";
        objectArray[5] = "(--t2\\>-(.!K)f+(-_8!<?fM\u0004";
        objectArray[6] = "XGW%Sb-g\\*B-P\u007fO-Kd8";
        objectArray[7] = "yTK!\u0017Qr[Zn{R|YX!W";
        objectArray[8] = Boolean.TYPE;
        ft_0.o[8] = "java/lang/Boolean";
        objectArray[9] = "!hiGo+*gx\b\f&?jwc9$.ykO.)";
        objectArray[10] = "'<\u0000pl#1<\u0005*\u007f4&w\u0006,s 70\u0011;87\b";
        objectArray[11] = "ZX)0%?QW8\u007fD1Z\\<%";
        objectArray[12] = "[u3P%([u$\f)'A>$\u0012)2FOtG~w";
        objectArray[13] = "/\u0012njn(/\u0012y6b'5Yy(b22(+v:v";
        objectArray[14] = "E\u001d|I\u0017[E\u001dk\u0015\u001bT_Vk\u000b\u001bAX'9QO\u0005";
        objectArray[15] = "Jn@UsTJnW\t\u007f[P%W\u0017\u007fNWT\u0006N(\f";
        objectArray[16] = "u7\bi\u0003\u0015u7\u001f5\u000f\u001ao|\u001f+\u000f\u000fh\rOv^";
        objectArray[17] = "\u0013\u001eN3o*\u0013\u001eYoc%\tUYqc0\u000e$\b.;";
        objectArray[18] = "_FVCl,*f]L}cKhVGy9?";
        objectArray[19] = "D\u0005]6]7R\u0005XlN EN[jB4T\tL}\t!\u0011";
        objectArray[20] = "!qio_jTQb`N%5_ikJ\u007fA";
        objectArray[21] = "IR\u000fp\u000e\u0006_R\n*\u001d\u0011H\u0019\t,\u0011\u0005Y^\u001e;Z\u0015A^\u001c0\u0000X}E\u001c-\u0000\u001fJR";
        objectArray[22] = "i[h_\u0014C\u007f[m\u0005\u0007Th\u0010n\u0003\u000b@yWy\u0014@U[";
        objectArray[23] = "\u001ari\u0015\u0016\u001b\u0011}xZk\u0003\u0002zq\u0013";
        objectArray[24] = "l^K\u00074\u0011\u0019~@\b%^xpK\u0003!\u0004\f";
        objectArray[25] = ",\u001dgeWk'\u0012v*?k)\u001de";
        objectArray[26] = Float.TYPE;
        ft_0.o[26] = "java/lang/Float";
        objectArray[27] = "\u0004\u0015?}K9q54rZv\u0010;?y^,d";
        objectArray[28] = "\u00023?jrm\u00023(6~b\u0018x((~w\u001f\t|p)";
        objectArray[29] = ".G\u0011B/\u001a.G\u0006\u001e#\u00154\f\u0006\u0000#\u00003}S_z";
        objectArray[30] = "H\\C\u00172*^\\FM!=I\u0017EK-)XPR\\f9^";
        objectArray[31] = "C1#S396\u0011(\\\"vW\u001f#W&,#";
        objectArray[32] = "\nh\u000f\u0013\u000fM\u0001g\u001e\\hO\u0014l\u001e\u0017S";
        objectArray[33] = Integer.TYPE;
        ft_0.o[33] = "java/lang/Integer";
        objectArray[34] = "+p\tU/6+p\u001e\t#91;\u001e\u0017#,6JIHu";
        objectArray[35] = "yM3\\Tu\fm8SE:mc3XA`\u0019";
        objectArray[36] = "?T\u000bQ6Q)T\u000e\u000b%F>\u001f\r\r)R/X\u001a\u001abB4";
        objectArray[37] = "y\u000bKp\ft\f+@\u007f\u001d;m%Kt\u0019a\u0019";
        objectArray[38] = "& \u00078N2& \u0010dB=<k\u0010zB(;\u001aB!\u001ab";
        objectArray[39] = "\nw08jj\u007fW;7{%\u001eY0<\u007f\u007fj";
        objectArray[40] = "\u001a3\u0000t9 o\u0013\u000b{(o\u000e\u001d\u0000p,5z";
        objectArray[41] = Double.TYPE;
        ft_0.o[41] = "java/lang/Double";
        objectArray[42] = "\u001dC\u0004\u000eHp\u001dC\u0013RD\u007f\u0007\b\u0013LDj\u0000yB\u0014\u0016";
        objectArray[43] = "o;\u0005(Y q3\u001fg>!`(\u0012=\u0018'";
        objectArray[44] = "7/J`Pa)'P/2}.:";
        objectArray[45] = "\u0001ci\ra>\u001fksB\u001c.\u001f";
        objectArray[46] = "\u0016\u0001<k=-\fVg\u0005(L\u0007\u0011\"8$>LR5fA%\u0017\u0013$<x|\u0002Td\u0005";
        objectArray[47] = "i:g\u001f\u001c\u001779 \u0005d\ng~?\u0006\b809dXToql\"\u001bT\u0014w`6\u0001d";
        objectArray[48] = "B*?B\t]\u001c)xXq@Lng[\u001dr\u001c-<\rq\u0014Y(>U\u0016_N\"e<\u0010\u0014Mhf\u0002\b\u0018\\#\u0007";
        objectArray[49] = "^\u0015?E\u0017'Y\u0013pT*)eV1\u000fZ?\u0004\u0006?\rQC";
        objectArray[50] = "o!=\u000ef]dap\u000e\u0007\u000fdpe\u001fPX:#<sl\\5~<\u0018k\u001fnm";
        objectArray[51] = "\u00047&y~8\u000fwky\u001fj\u000ff~hH=Q1&\u0004|<Vub|\"?\u0011o";
        objectArray[52] = "Y!;\u0018I\u001e\u0005/{\u00155@W:+\u000fYr\u0003vwU\u000b%G6\"\n\u000eUH(7Q5";
        objectArray[53] = "9\u007fgo|\u0012#(<\u0001js(oy<e\u0001c,nb\u0000\u001a8m\u007f89C-*?\u0001";
        objectArray[54] = "8|%98'3<h9Yu3-}(\u000e\"lp&D:|\"0e\u007ffrb=";
        objectArray[55] = "6:i\u001eVJexiWk^Xo}\b\fZiexV\u0005";
        objectArray[56] = "$ZW\u0012~(,^\u0011\u0005\u00147 H3\u001en9+[h\rt%(J\u0014\u001fy$|4";
        objectArray[57] = "^eS 9qU%\u001e X#U4\u000b1\u000ft\u000bdR]?vL&\u0015:>3H(";
        objectArray[58] = "\u0002IUxOz[\\\u00128v&\u0006_He\u001a\u0014V\u0013\u0010?v}W\u001fF<\n}[OW\u0002";
        objectArray[59] = "4\nWE\u0012A$\u0007HKoQ \u001b\u007fD\u001fMI^\u0005\u0015\u0001\u000f5^\tE\u00101";
        objectArray[60] = "]\u0016  C>\u0003\u0015g:;#SRx9W\u0011\u0000\u0017!c;x\u0002\u0012v`Gx\u000eBg^";
        objectArray[61] = "c\u0002Wd\u0014A=\u0001\u0010~l\\mF\u000f}\u0000n>\u0002S%l@eAQaQ\u0002<PP\u001a";
        objectArray[62] = "\u007fAylE4e\u0016\"\u0002[UnQg?\\'%\u0012pa9leTr?Uju\u001fa\u0002";
        objectArray[63] = "\u0000\u0001\u0019fv@\u0000FOc\u0017NdB_v*L\u0016\t\u001cat)Z\u0004\u001cd)UZ\bLu\u0017";
        objectArray[64] = "4\u0017\u0011\u001fEw?W\\\u001f$.3WM\u0005H\u001cg\u0016\u0013S$ub\u0017C\\XunGRb";
        objectArray[65] = "H/N\rNi\u0016,\t\u00176tFk\u0016\u0014ZF\u0016(NL6mSs\u0014\u001cDqD,KsM\u007fVmF\bKsBwv";
        objectArray[66] = "\u0003WO\u001fLq\u000b\u000bXG\"h^IQ\u001aNZ\n\n\u000eM\u0018\r\u0002M\u000bDKjIZ\u0001\u001f\"";
        objectArray[67] = "\u0017\u0004\u0012QIR\u0007\t\r_4D\u0007\u001e\u0000=\u0004\u001d\u000b^\fXK\u0018\u001bW|";
        objectArray[68] = "K\u001c){\u0010}\u0012\tn;)!O\n4fE\u0013\u0018Mo8\u0016DY\u0018){\u0019?_\u0014=a)";
        objectArray[69] = "\u0012\u001asy{*K\u000f49Bv\u0016\fnd.DFL1<Bz\u0015O~i2r\u0011\ti\u0003";
        objectArray[70] = "\u0017,\u0014/aVN9SoX\u0002\u0007;\u00001#oNy\be(\n\u0001|\u0018lXQBz\u0007k$QN*\u0016U";
        objectArray[71] = "Kibw0\u0003K.4rQ\u0001/*$gl\u000f]agp2jJ6<{ \u0004Oj?+Q";
        objectArray[72] = "!F&5uR1\r3?L\u0004MG3 q\u000b?\fp7/ns\u0001p2r\u0012s\r #L";
        objectArray[73] = "NB\u0014\u0005;rDGJ\fP* V\u000f\u001em&R\u001dL\t3C\u001e\u0010L\fn?\u001e\u001c\u001c\u001dP";
        objectArray[74] = "S2\"d4JVn!4EEP(\u001bm!Y[T#9\"NO?/:tU6";
        objectArray[75] = "dm\u0005_\u0018_a>\nKq\u0004>3\u000fW\u0018\b\u0007=\u000fG\u001cnghWTO\u0012gd\u0007Eq";
        objectArray[76] = "\r\u0005C\u0014#\n\rB\u0015\u0011B\niF\u0005\u0004\u007f\u0006\u001b\rF\u0013!cPM\u0000\u0011\u007f\u000fV]K\u0002B";
        objectArray[77] = "z*\u001a\u0019[\u0001`}AwN`/5\u0015\u0013E\u0019m.\u0015N'^a(\u001c\u0015^\u001cz(Aw";
        objectArray[78] = ",z@\f\u0019c0)\u0011KyzTbSJDv&)\u0010]\u001a\u0013miV_D\u007fky\u001dLy";
        objectArray[79] = "nip/\u0017kn.&*vk\n*6?Kgxau(\u0015\u0002lm.)\u000fi`nx2v";
        objectArray[80] = "S\"WTFk\n7\u0010\u0014\u007f7W4JI\u0013\u0005\u0000s\u0011\u0014FRA&WTO)G*CN\u007f";
        objectArray[81] = "wq\u0003y\"\u0005)pJ ^\u001eM6\rac\u0012?}Nv=wwq\u0003y\"\u0005)pJ ^";
        objectArray[82] = "=?3^%2?a3\u0019W;\u0002l`Gg\"g#eWnR";
        objectArray[83] = "#\u001c@A8]}\u001f\u0007[@@-X\u0018X,rz\u0018H\u0005p%~\u0018DQ~Y~\u0014\u0014@@";
        objectArray[84] = "|i\u001c\u0012\u0013\u001fsw\tI(\u000e}t\u000f\u0019T\b{\u0019\b\u001aF\u0003|i\u0018\u0017Y\r\u0001";
        objectArray[85] = "\u0011\u0010\u000bwO\u0019\u0015\u0001X-\u007fN\u0015\rZj!I\u0015\u0017^\u0016\u001e\u0011\u001d\u0010R(\u0006\u001d\f[3";
        objectArray[86] = "n>\"\u0005'\\ma>\u0017\u0019\u000b~\u000fiXx\\`j&]hU\u0010qh\u001c{R r7\u0000il";
        Object[] objectArray2 = objectArray;
        objectArray[87] = "\u001d\u0010`mj)C\u0013'w\u0012?\u001fE<\u007fEoF\u0011g\u0013i?\u0003Rhho3\u0017H";
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ft_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static boolean d(Object[] objectArray) {
        return l;
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00cc' || c == '\u00e9' || c == 'A' || c == 'w') {
                field = ft_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00cc' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e9' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'A' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ft_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'u' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        this.k = -1;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    @bP
    public void a(bG bG2) {
        CallSite callSite;
        CallSite callSite2;
        CallSite callSite3;
        long l;
        long l2;
        block70: {
            block71: {
                Object object;
                long l3;
                block76: {
                    CallSite callSite4;
                    block77: {
                        CallSite callSite5;
                        long l4;
                        block74: {
                            block75: {
                                CallSite callSite6;
                                long l5;
                                block72: {
                                    block73: {
                                        block68: {
                                            long l6;
                                            block69: {
                                                long l7;
                                                block67: {
                                                    block66: {
                                                        CallSite callSite7;
                                                        block65: {
                                                            reference v8;
                                                            long l8;
                                                            block63: {
                                                                block64: {
                                                                    block61: {
                                                                        block62: {
                                                                            block59: {
                                                                                block60: {
                                                                                    block56: {
                                                                                        class_310 class_3102;
                                                                                        block58: {
                                                                                            block57: {
                                                                                                block55: {
                                                                                                    long l9 = l2 = m ^ 0x66D314570B11L;
                                                                                                    l5 = l9 ^ 0x216C18A1EF1L;
                                                                                                    l = l9 ^ 0x843860AB00FL;
                                                                                                    l3 = l9 ^ 0x36CB6C36575EL;
                                                                                                    l7 = l9 ^ 0x442C362A0574L;
                                                                                                    l8 = l9 ^ 0x1BDD5C523B52L;
                                                                                                    l4 = l9 ^ 0x6EE73824EA8DL;
                                                                                                    l6 = l9 ^ 0x6DB0128CA415L;
                                                                                                    ft_0.l = 0;
                                                                                                    callSite3 = ft_0.b("u", (long)-8276118854097541546L, (long)l2);
                                                                                                    try {
                                                                                                        try {
                                                                                                            class_3102 = b;
                                                                                                            if (callSite3 != null) break block55;
                                                                                                            if (ft_0.b("\u00cc", (Object)class_3102, (long)-8275975634335209450L, (long)l2) == null) break block56;
                                                                                                        }
                                                                                                        catch (MatchException matchException) {
                                                                                                            throw ft_0.b("u", (Object)matchException, (long)-8270188987706236870L, (long)l2);
                                                                                                        }
                                                                                                        class_3102 = b;
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw ft_0.b("u", (Object)matchException, (long)-8270188987706236870L, (long)l2);
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    try {
                                                                                                        if (callSite3 != null) break block57;
                                                                                                        if (ft_0.b("\u00cc", (Object)class_3102, (long)-8276310448861824122L, (long)l2) == null) break block56;
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw ft_0.b("u", (Object)matchException, (long)-8270188987706236870L, (long)l2);
                                                                                                    }
                                                                                                    class_3102 = b;
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw ft_0.b("u", (Object)matchException, (long)-8270188987706236870L, (long)l2);
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    if (callSite3 != null) break block58;
                                                                                                    if (ft_0.b("\u00cc", (Object)class_3102, (long)-8275518734208666792L, (long)l2) != null) break block56;
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw ft_0.b("u", (Object)matchException, (long)-8270188987706236870L, (long)l2);
                                                                                                }
                                                                                                class_3102 = b;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw ft_0.b("u", (Object)matchException, (long)-8270188987706236870L, (long)l2);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            v8 = ft_0.b("\u00f1", (Object)class_3102, (long)-8270567988198238366L, (long)l2);
                                                                                            if (callSite3 != null) break block59;
                                                                                            if (v8 != false) break block60;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw ft_0.b("u", (Object)matchException, (long)-8270188987706236870L, (long)l2);
                                                                                        }
                                                                                    }
                                                                                    return;
                                                                                }
                                                                                v8 = ft_0.b("\u00f1", (Object)ft_0.b("\u00cc", (Object)b, (long)-8275975634335209450L, (long)l2), (long)-8275917113117306625L, (long)l2);
                                                                            }
                                                                            try {
                                                                                if (callSite3 != null) break block61;
                                                                                if (v8 == false) break block62;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw ft_0.b("u", (Object)matchException, (long)-8270188987706236870L, (long)l2);
                                                                            }
                                                                            return;
                                                                        }
                                                                        v8 = ft_0.b("\u00f1", (Object)((Boolean)((Object)ft_0.b("\u00f1", (Object)this.g, (long)-8269285668121200433L, (long)l2))), (long)-8269801207253154730L, (long)l2);
                                                                    }
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (callSite3 != null) break block63;
                                                                                    if (v8 == false) break block64;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw ft_0.b("u", (Object)matchException, (long)-8270188987706236870L, (long)l2);
                                                                                }
                                                                                v8 = ft_0.b("\u00f1", (Object)ft_0.b("\u00cc", (Object)b, (long)-8275975634335209450L, (long)l2), (long)-8269177765888414821L, (long)l2);
                                                                                if (callSite3 != null) break block63;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw ft_0.b("u", (Object)matchException, (long)-8270188987706236870L, (long)l2);
                                                                            }
                                                                            if (v8 == false) break block64;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw ft_0.b("u", (Object)matchException, (long)-8270188987706236870L, (long)l2);
                                                                        }
                                                                        Object[] objectArray = new Object[1];
                                                                        objectArray[0] = l7;
                                                                        ft_0.b("\u00f1", (Object)this, (Object)objectArray, (long)-8275739677967211870L, (long)l2);
                                                                        return;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw ft_0.b("u", (Object)matchException, (long)-8270188987706236870L, (long)l2);
                                                                    }
                                                                }
                                                                try {
                                                                    callSite7 = ft_0.b("\u00cc", (Object)b, (long)-8275975634335209450L, (long)l2);
                                                                    if (callSite3 != null) break block65;
                                                                    reference v8 = ft_0.b("\u00cc", (Object)callSite7, (long)-8269480643020268170L, (long)l2) - (double)ft_0.b("\u00f1", (Object)((Float)((Object)ft_0.b("\u00f1", (Object)this.d, (long)-8269285668121200433L, (long)l2))), (long)-8269627160158479238L, (long)l2);
                                                                    v8 = v8 == 0 ? 0 : (v8 < 0 ? -1 : 1);
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw ft_0.b("u", (Object)matchException, (long)-8270188987706236870L, (long)l2);
                                                                }
                                                            }
                                                            try {
                                                                if (v8 < 0) {
                                                                    Object[] objectArray = new Object[1];
                                                                    objectArray[0] = l7;
                                                                    ft_0.b("\u00f1", (Object)this, (Object)objectArray, (long)-8275739677967211870L, (long)l2);
                                                                    return;
                                                                }
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw ft_0.b("u", (Object)matchException, (long)-8270188987706236870L, (long)l2);
                                                            }
                                                            Object[] objectArray = new Object[1];
                                                            objectArray[0] = l8;
                                                            callSite7 = ft_0.b("\u00f1", (Object)this, (Object)objectArray, (long)-8276880549782413188L, (long)l2);
                                                        }
                                                        callSite2 = callSite7;
                                                        try {
                                                            try {
                                                                if (callSite3 != null) break block66;
                                                                if (callSite2 != null) break block67;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw ft_0.b("u", (Object)matchException, (long)-8270188987706236870L, (long)l2);
                                                            }
                                                            Object[] objectArray = new Object[1];
                                                            objectArray[0] = l7;
                                                            ft_0.b("\u00f1", (Object)this, (Object)objectArray, (long)-8275739677967211870L, (long)l2);
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw ft_0.b("u", (Object)matchException, (long)-8270188987706236870L, (long)l2);
                                                        }
                                                    }
                                                    return;
                                                }
                                                try {
                                                    try {
                                                        reference cfr_temp_1 = ft_0.b("\u00f1", (Object)ft_0.b("\u00cc", (Object)b, (long)-8275975634335209450L, (long)l2), (Object)callSite2, (long)-8276194089651073890L, (long)l2) - ft_0.b("\u00f1", (Object)((Float)((Object)ft_0.b("\u00f1", (Object)this.c, (long)-8269285668121200433L, (long)l2))), (long)-8269627160158479238L, (long)l2);
                                                        callSite = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 > 0 ? 1 : -1);
                                                        if (callSite3 != null) break block68;
                                                        if (callSite <= 0) break block69;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw ft_0.b("u", (Object)matchException, (long)-8270188987706236870L, (long)l2);
                                                    }
                                                    Object[] objectArray = new Object[1];
                                                    objectArray[0] = l7;
                                                    ft_0.b("\u00f1", (Object)this, (Object)objectArray, (long)-8275739677967211870L, (long)l2);
                                                    return;
                                                }
                                                catch (MatchException matchException) {
                                                    throw ft_0.b("u", (Object)matchException, (long)-8270188987706236870L, (long)l2);
                                                }
                                            }
                                            Object[] objectArray = new Object[2];
                                            objectArray[1] = l6;
                                            objectArray[0] = ft_0.b("\u00f1", (Object)ft_0.b("\u00cc", (Object)b, (long)-8275975634335209450L, (long)l2), (long)-8275789155872829830L, (long)l2);
                                            callSite = ft_0.b("u", (Object)objectArray, (long)-8275680024401504354L, (long)l2);
                                        }
                                        try {
                                            try {
                                                try {
                                                    if (callSite3 != null) break block70;
                                                    if (callSite != false) break block71;
                                                }
                                                catch (MatchException matchException) {
                                                    throw ft_0.b("u", (Object)matchException, (long)-8270188987706236870L, (long)l2);
                                                }
                                                callSite6 = ft_0.b("\u00f1", (Object)((Boolean)((Object)ft_0.b("\u00f1", (Object)this.f, (long)-8269285668121200433L, (long)l2))), (long)-8269801207253154730L, (long)l2);
                                                if (callSite3 != null) break block72;
                                            }
                                            catch (MatchException matchException) {
                                                throw ft_0.b("u", (Object)matchException, (long)-8270188987706236870L, (long)l2);
                                            }
                                            if (callSite6 == false) break block73;
                                        }
                                        catch (MatchException matchException) {
                                            throw ft_0.b("u", (Object)matchException, (long)-8270188987706236870L, (long)l2);
                                        }
                                        return;
                                    }
                                    callSite6 = ft_0.b("\u00f1", (Object)((Boolean)((Object)ft_0.b("\u00f1", (Object)this.i, (long)-8269285668121200433L, (long)l2))), (long)-8269801207253154730L, (long)l2);
                                }
                                if (callSite6 == false) {
                                    return;
                                }
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l5;
                                callSite4 = ft_0.b("u", (Object)objectArray, (long)-8270617519517287842L, (long)l2);
                                try {
                                    callSite5 = callSite4;
                                    if (callSite3 != null) break block74;
                                    if (callSite5 != null) break block75;
                                }
                                catch (MatchException matchException) {
                                    throw ft_0.b("u", (Object)matchException, (long)-8270188987706236870L, (long)l2);
                                }
                                return;
                            }
                            callSite5 = ft_0.b("\u00f1", (Object)this.j, (long)-8269285668121200433L, (long)l2);
                        }
                        try {
                            try {
                                try {
                                    try {
                                        object = ft_0.b("\u00f1", (Object)((Boolean)((Object)callSite5)), (long)-8269801207253154730L, (long)l2);
                                        if (callSite3 != null) break block76;
                                        if (object == false) break block77;
                                    }
                                    catch (MatchException matchException) {
                                        throw ft_0.b("u", (Object)matchException, (long)-8270188987706236870L, (long)l2);
                                    }
                                    object = this.k;
                                    if (callSite3 != null) break block76;
                                }
                                catch (MatchException matchException) {
                                    throw ft_0.b("u", (Object)matchException, (long)-8270188987706236870L, (long)l2);
                                }
                                if (object != -1) break block77;
                            }
                            catch (MatchException matchException) {
                                throw ft_0.b("u", (Object)matchException, (long)-8270188987706236870L, (long)l2);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l4;
                            this.k = (int)ft_0.b("u", (Object)objectArray, (long)-8270017664437185568L, (long)l2);
                        }
                        catch (MatchException matchException) {
                            throw ft_0.b("u", (Object)matchException, (long)-8270188987706236870L, (long)l2);
                        }
                    }
                    object = ft_0.b("\u00f1", (Object)callSite4, (long)-8269841779725835756L, (long)l2);
                }
                Object[] objectArray = new Object[2];
                objectArray[1] = l3;
                objectArray[0] = (int)object;
                ft_0.b("u", (Object)objectArray, (long)-8270275673532395764L, (long)l2);
            }
            ft_0.l = 1;
            callSite = ft_0.b("\u00f1", (Object)((Integer)((Object)ft_0.b("\u00f1", (Object)this.h, (long)-8269285668121200433L, (long)l2))), (long)-8269841779725835756L, (long)l2);
        }
        Object object = callSite;
        for (int i = 0; i < object; ++i) {
            Object[] objectArray = new Object[2];
            objectArray[1] = l;
            objectArray[0] = callSite2;
            ft_0.b("u", (Object)objectArray, (long)-8270100630504075386L, (long)l2);
            if (callSite3 == null) continue;
        }
    }

    private class_1657 a(Object[] objectArray) {
        ft_0 ft_02;
        Object object;
        long l;
        long l2;
        block19: {
            Object object2;
            block17: {
                CallSite callSite;
                block18: {
                    l2 = (Long)objectArray[0];
                    long l3 = l2 = m ^ l2;
                    long l4 = l3 ^ 0x6B97D0FD51C9L;
                    long l5 = l3 ^ 0x4C06D43B0DF3L;
                    l = l3 ^ 0x14D7AB70E073L;
                    CallSite callSite2 = ft_0.b("\u00cc", (Object)b, (long)3481251916959294275L, (long)l2);
                    callSite = ft_0.b("u", (long)3481062640495221564L, (long)l2);
                    try {
                        object2 = callSite2 instanceof class_3966;
                        if (callSite != null) break block17;
                        if (!object2) break block18;
                    }
                    catch (MatchException matchException) {
                        throw ft_0.b("u", (Object)matchException, (long)3481294786092047696L, (long)l2);
                    }
                    object = (class_3966)callSite2;
                    callSite2 = ft_0.b("\u00f1", (Object)object, (long)3482407841732964059L, (long)l2);
                    try {
                        object2 = callSite2 instanceof class_1657;
                        if (callSite != null) break block17;
                        if (!object2) break block18;
                    }
                    catch (MatchException matchException) {
                        throw ft_0.b("u", (Object)matchException, (long)3481294786092047696L, (long)l2);
                    }
                    class_1657 class_16572 = (class_1657)callSite2;
                    try {
                        try {
                            try {
                                try {
                                    Object[] objectArray2 = new Object[2];
                                    objectArray2[1] = l5;
                                    objectArray2[0] = class_16572;
                                    object2 = ft_0.b("u", (Object)objectArray2, (long)3481642817617173307L, (long)l2);
                                    if (callSite != null) break block17;
                                    if (!object2) break block18;
                                }
                                catch (MatchException matchException) {
                                    throw ft_0.b("u", (Object)matchException, (long)3481294786092047696L, (long)l2);
                                }
                                Object[] objectArray3 = new Object[2];
                                objectArray3[1] = l4;
                                objectArray3[0] = ft_0.b("\u00f1", (Object)ft_0.b("\u00f1", (Object)class_16572, (long)3481869272891672190L, (long)l2), (long)3480569973246798633L, (long)l2);
                                object2 = ft_0.b("\u00f1", (Object)ft_0.b("A", (long)3480863276983121187L, (long)l2), (Object)objectArray3, (long)3481621040703141571L, (long)l2);
                                if (callSite != null) break block17;
                            }
                            catch (MatchException matchException) {
                                throw ft_0.b("u", (Object)matchException, (long)3481294786092047696L, (long)l2);
                            }
                            if (object2) break block18;
                        }
                        catch (MatchException matchException) {
                            throw ft_0.b("u", (Object)matchException, (long)3481294786092047696L, (long)l2);
                        }
                        return class_16572;
                    }
                    catch (MatchException matchException) {
                        throw ft_0.b("u", (Object)matchException, (long)3481294786092047696L, (long)l2);
                    }
                }
                try {
                    ft_02 = this;
                    if (callSite != null) break block19;
                    object2 = ft_0.b("\u00f1", (Object)((Boolean)((Object)ft_0.b("\u00f1", (Object)ft_02.e, (long)3483518610518541733L, (long)l2))), (long)3481751286558751036L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw ft_0.b("u", (Object)matchException, (long)3481294786092047696L, (long)l2);
                }
            }
            try {
                if (object2) {
                    return null;
                }
            }
            catch (MatchException matchException) {
                throw ft_0.b("u", (Object)matchException, (long)3481294786092047696L, (long)l2);
            }
            ft_02 = this;
        }
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l;
        objectArray4[0] = Float.valueOf((float)ft_0.b("\u00f1", (Object)((Float)((Object)ft_0.b("\u00f1", (Object)this.a, (long)3483518610518541733L, (long)l2))), (long)3482980357976318224L, (long)l2));
        object = ft_0.b("\u00f1", (Object)ft_02, (Object)objectArray4, (long)3480734488371499255L, (long)l2);
        return object;
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return ft_0.b("u", (Object)((Object)q_0.Mace), (long)-2443880575451213963L, (long)l);
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (o[n3] != null) {
            return n3;
        }
        Object object = ft_0.n[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 58;
            case 1 -> 11;
            case 2 -> 26;
            case 3 -> 54;
            case 4 -> 3;
            case 5 -> 9;
            case 6 -> 10;
            case 7 -> 8;
            case 8 -> 15;
            case 9 -> 48;
            case 10 -> 49;
            case 11 -> 59;
            case 12 -> 40;
            case 13 -> 1;
            case 14 -> 18;
            case 15 -> 60;
            case 16 -> 55;
            case 17 -> 52;
            case 18 -> 38;
            case 19 -> 53;
            case 20 -> 16;
            case 21 -> 42;
            case 22 -> 30;
            case 23 -> 31;
            case 24 -> 62;
            case 25 -> 44;
            case 26 -> 34;
            case 27 -> 2;
            case 28 -> 57;
            case 29 -> 43;
            case 30 -> 4;
            case 31 -> 50;
            case 32 -> 19;
            case 33 -> 61;
            case 34 -> 17;
            case 35 -> 12;
            case 36 -> 36;
            case 37 -> 32;
            case 38 -> 23;
            case 39 -> 56;
            case 40 -> 14;
            case 41 -> 20;
            case 42 -> 33;
            case 43 -> 0;
            case 44 -> 7;
            case 45 -> 28;
            case 46 -> 24;
            case 47 -> 46;
            case 48 -> 51;
            case 49 -> 37;
            case 50 -> 21;
            case 51 -> 47;
            case 52 -> 29;
            case 53 -> 25;
            case 54 -> 41;
            case 55 -> 45;
            case 56 -> 27;
            case 57 -> 35;
            case 58 -> 63;
            case 59 -> 5;
            case 60 -> 6;
            case 61 -> 22;
            case 62 -> 13;
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
        ft_0.o[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = ft_0.m(l, l2);
        Object object = ft_0.n[n];
        if (object instanceof String) {
            String string = o[n];
            int n2 = string.indexOf(8);
            Class clazz = ft_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ft_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ft_0.g(clazz3, string2, clazz2)) != null) {
                    ft_0.n[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ft_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ft_0.n[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ft_0.n(833657425744105L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = ft_0.m(l, l2);
        Object object = ft_0.n[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = o[n];
                int n3 = string2.indexOf(8);
                clazz3 = ft_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ft_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ft_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        ft_0.n[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ft_0.n(833657425744105L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ft_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ft_0.n[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ft_0.n(833657425744105L, 0L);
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

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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

    private void j(Object[] objectArray) {
        block5: {
            int n;
            long l;
            long l2;
            block4: {
                l2 = (Long)objectArray[0];
                l = (l2 = m ^ l2) ^ 0xFD174DD412L;
                CallSite callSite = ft_0.b("u", (long)1038475496517657882L, (long)l2);
                try {
                    try {
                        n = this.k;
                        if (callSite != null) break block4;
                        if (n == -1) break block5;
                    }
                    catch (MatchException matchException) {
                        throw ft_0.b("u", (Object)matchException, (long)1042113653175198582L, (long)l2);
                    }
                    n = this.k;
                }
                catch (MatchException matchException) {
                    throw ft_0.b("u", (Object)matchException, (long)1042113653175198582L, (long)l2);
                }
            }
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l;
            objectArray2[0] = n;
            ft_0.b("u", (Object)objectArray2, (long)1042057892267002944L, (long)l2);
            this.k = -1;
        }
    }

    private boolean lambda$new$0(Boolean bl) {
        Object object;
        block2: {
            block3: {
                long l = m ^ 0x4955F8492BD5L;
                CallSite callSite = ft_0.b("u", (long)-5917309592743426414L, (long)l);
                try {
                    object = ft_0.b("\u00f1", (Object)((Boolean)((Object)ft_0.b("\u00f1", (Object)this.f, (long)-5910490752760801269L, (long)l))), (long)-5908744594328492910L, (long)l);
                    if (callSite != null) break block2;
                    if (object != false) break block3;
                }
                catch (MatchException matchException) {
                    throw ft_0.b("u", (Object)matchException, (long)-5909200551078133506L, (long)l);
                }
                object = 1;
                break block2;
            }
            object = 0;
        }
        return (boolean)object;
    }

    private boolean lambda$new$1(Boolean bl) {
        Object object;
        block8: {
            block7: {
                CallSite callSite;
                long l;
                block6: {
                    l = m ^ 0x1AA0345E5B6EL;
                    callSite = ft_0.b("u", (long)-2496632796088158679L, (long)l);
                    try {
                        try {
                            object = ft_0.b("\u00f1", (Object)((Boolean)((Object)ft_0.b("\u00f1", (Object)this.f, (long)-2503187700704515920L, (long)l))), (long)-2502664467635170263L, (long)l);
                            if (callSite != null) break block6;
                            if (object != false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw ft_0.b("u", (Object)matchException, (long)-2502560354074791867L, (long)l);
                        }
                        object = ft_0.b("\u00f1", (Object)((Boolean)((Object)ft_0.b("\u00f1", (Object)this.i, (long)-2503187700704515920L, (long)l))), (long)-2502664467635170263L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw ft_0.b("u", (Object)matchException, (long)-2502560354074791867L, (long)l);
                    }
                }
                try {
                    if (callSite != null) break block8;
                    if (object == false) break block7;
                }
                catch (MatchException matchException) {
                    throw ft_0.b("u", (Object)matchException, (long)-2502560354074791867L, (long)l);
                }
                object = 1;
                break block8;
            }
            object = 0;
        }
        return (boolean)object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ft_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


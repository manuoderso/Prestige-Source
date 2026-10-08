/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_243
 *  net.minecraft.class_2848
 *  net.minecraft.class_2848$class_2849
 *  net.minecraft.class_310
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.a9;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.dC;
import dev.zprestige.prestige.dF;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.dn_0;
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
import java.security.Key;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import net.minecraft.class_2848;
import net.minecraft.class_310;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class eH
extends dV
implements dF {
    private boolean i;
    private int a;
    private f5 c;
    private f5 d;
    private boolean e;
    private static final long k = hc.a(3457178277158083135L, 797838230649971002L, MethodHandles.lookup().lookupClass()).a(271022317283978L);
    private static final long l;
    private static final Object[] m;
    private static final String[] n;

    public eH() {
        long l = k ^ 0x27D8D695CE6DL;
        long l2 = l ^ 0x5DFA5EAD9D92L;
        this.a = 0;
        this.c = new f5(l2);
        this.d = new f5(l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        m = new Object[112];
        n = new String[112];
        eH.f();
        long l = k ^ 0x5A34DC5C387EL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -725303256657975608L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                eH.l = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    @Override
    public void e(Object[] objectArray) {
        block5: {
            class_310 class_3102;
            long l;
            block4: {
                l = (Long)objectArray[0];
                long l2 = l ^ 0x7FAB131DDD11L;
                CallSite callSite = eH.b("q", (long)3996393399226117042L, (long)l);
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = l2;
                objectArray2[0] = this;
                eH.b("\u00ee", (Object)eH.b("k", (long)3998536254296377175L, (long)l), (Object)objectArray2, (long)3995072615325335673L, (long)l);
                CallSite callSite2 = callSite;
                try {
                    try {
                        class_3102 = b;
                        if (callSite2 != null) break block4;
                        if (eH.b("q", (Object)eH.b("\u00ee", (Object)class_3102, (long)3992590046346878149L, (long)l), (int)eH.b("\u00ee", (Object)eH.b("\u00ee", (Object)eH.b("m", (Object)eH.b("m", (Object)b, (long)3994786334902042793L, (long)l), (long)3993249279863686725L, (long)l), (long)3996472987801095030L, (long)l), (long)3996888921328651575L, (long)l), (long)3993049354314827499L, (long)l) != false) break block5;
                    }
                    catch (MatchException matchException) {
                        throw eH.b("q", (Object)matchException, (long)3999024509499637324L, (long)l);
                    }
                    class_3102 = b;
                }
                catch (MatchException matchException) {
                    throw eH.b("q", (Object)matchException, (long)3999024509499637324L, (long)l);
                }
            }
            eH.b("\u00ee", (Object)eH.b("m", (Object)eH.b("m", (Object)class_3102, (long)3994786334902042793L, (long)l), (long)3993249279863686725L, (long)l), (boolean)false, (long)3998713614990013191L, (long)l);
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/eH" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = eH.m(l, l2);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                eH.m[n] = clazz = Class.forName(eH.n[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = eH.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = eH.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = eH.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = eH.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = m;
        m[0] = "eqMH$%n~\\\u0007E+euX]";
        objectArray[1] = Boolean.TYPE;
        eH.n[1] = "java/lang/Boolean";
        objectArray[2] = "Cc?dUKUc:>F\\B(98JHSo./\u0001Zo";
        objectArray[3] = "c[\u0014A\u0015D\u0016{\u001fN\u0004\u000bkc\fI\rB\u0003";
        objectArray[4] = "8\n:\u001a\u0002~8\n-F\u000eq\"A-X\u000ed%0}\u0005_";
        objectArray[5] = "\u000b\u0012azK<\u000b\u0012v&G3\u0011Yv8G&\u0016(\"`\u0010";
        objectArray[6] = "Uib7n%Uiukb*O\"uub?HS'!3~";
        objectArray[7] = "p=\u00076\u0004Tp=\u0010j\b[jv\u0010t\bNm\u0007B/P\u000f";
        objectArray[8] = "\u0003\u000bXd{U\u0003\u000bO8wZ\u0019@O&wO\u001e1\u001d}/\u0005";
        objectArray[9] = "o&]W\u0011\u0004o&J\u000b\u001d\u000bumJ\u0015\u001d\u001er\u001c\u0018OJ\\";
        objectArray[10] = Integer.TYPE;
        eH.n[10] = "java/lang/Integer";
        objectArray[11] = "sL25\u001cneL7o\u000fyr\u00074i\u0003mc@#~H{_";
        objectArray[12] = "\u00033%QN)\b<4\u001e-$\u001d1;u\u0018&\f\"'Y\u000f+";
        objectArray[13] = "p,\u0014I\u0001df,\u0011\u0013\u0012sqg\u0012\u0015\u001eg` \u0005\u0002UpB";
        objectArray[14] = "&\u000eX|`HS.Ssq\u00072 Xxu]F";
        objectArray[15] = Void.TYPE;
        eH.n[15] = "java/lang/Void";
        objectArray[16] = "\u000e%DJWo\u0018%A\u0010Dx\u000fnB\u0016Hl\u001e)U\u0001\u0003|\u0018";
        objectArray[17] = "6\u0012\u001cv:OC2\u0017y+\u0000\"<\u001cr/ZV";
        objectArray[18] = "Hf\u001d\u0004\u0001IVn\u0007K|YV";
        objectArray[19] = "|\u0013`\r\u0018b|\u0013wQ\u0014mfXwO\u0014xa)%\u0013A:";
        objectArray[20] = "V\u000e\u007f+NnV\u000ehwBaLEhiBtK485\u0017";
        objectArray[21] = "}XmW\u0004F}Xz\u000b\bIg\u0013z\u0015\b\\`b*O^\u001a7^u\u0018\u001a\\L\u000e)O";
        objectArray[22] = "dt\f\u001cn~dt\u001b@bq~?\u001b^bdyNK\u00044\"";
        objectArray[23] = "jb0\u0001\u0016{|b5[\u0005lk)6]\txzn!JBhbn#A\u0018%^u#\\\u0018bib";
        objectArray[24] = "3|\bXfY%|\r\u0002uN27\u000e\u0004yZ#p\u0019\u00132M\u0013";
        objectArray[25] = "sL-}lMsL:!`Bi\u0007:?`Wnvjb4";
        objectArray[26] = "Jh\u007f\u001b\u0011\u0013?Ht\u0014\u0000\\^F\u007f\u001f\u0004\u0006*";
        objectArray[27] = ".\u007fzPFh8\u007f\u007f\nU\u007f/4|\fYk>sk\u001b\u0012~\u007f";
        objectArray[28] = "\u0005\u0005hu)@p%cz8\u000f\u0011+hq<Ue";
        objectArray[29] = "b\u001f0}\u000e\u0017t\u001f5'\u001d\u0000cT6!\u0011\u0014r\u0013!6Z\u0004i";
        objectArray[30] = ">ZL'^;KzG(Ot*tL#K.^";
        objectArray[31] = "F)hhB\u00023\tcgSMR\u0007hlW\u0017&";
        objectArray[32] = "\u000b@x;My\u000b@ogAv\u0011\u000boyAc\u0016z8&\u0017";
        objectArray[33] = "S\u000eIL2gM\u0006S\u0003NsW\u000bP@";
        objectArray[34] = Float.TYPE;
        eH.n[34] = "java/lang/Float";
        objectArray[35] = "%b|hjC%bk4fL?)k*fY8X>u3";
        objectArray[36] = "r\u0016R\u0005\u007fKr\u0016EYsDh]EGsQo,\u0014\u001e+\u0014";
        objectArray[37] = "TX,cy\u0015TX;?u\u001aN\u0013;!u\u000fIbi\u007f\"D";
        objectArray[38] = "J\u0000%\u0011P\u0011A\u000f4^3\u001cT\t";
        objectArray[39] = Double.TYPE;
        eH.n[39] = "java/lang/Double";
        objectArray[40] = "G3ApjW2\u0013J\u007f{\u0018S\u001dAt\u007fB'";
        objectArray[41] = "g9i\u0015I\u001c\u0012\u0019b\u001aXSs\u0017i\u0011\\\t\u0007";
        objectArray[42] = "dkgQ6S\u0011Kl^'\u001cpEgU#F\u0004";
        objectArray[43] = "UqUf(: Q^i9uA_Ub=/5";
        objectArray[44] = "Cw\u0011\u001aCRHx\u0000U$P]s\u0000\u001e\u001f";
        objectArray[45] = "=\u0015w\u0002rz=\u0015`^~u'^`@~` /1\u0018,";
        objectArray[46] = "#S/#SX#S8\u007f_W9\u00188a_B>ij>\u000e\u0005";
        objectArray[47] = "1*}\bZ\"D\nv\u0007Km%\u0004}\fO7Q";
        objectArray[48] = "!bx?Z\u0014!bocV\u001b;)o}V\u000e<X>)\u0003Ekd`pD\u000e\u001054%\u000e";
        objectArray[49] = "fQWthm\u0013q\\{y\"r\u007fWp}x\u0006";
        objectArray[50] = "F\u001d<j\u0017\u0005P\u001d90\u0004\u0012GV:6\b\u0006V\u0011-!C\u0016\u001a";
        objectArray[51] = "8\u0011\u0019\u001dbQM1\u0012\u0012s\u001e,?\u0019\u0019wDX";
        objectArray[52] = "\u0019=\u0005fh&l\u001d\u000eiyi\r\u0013\u0005b}3y";
        objectArray[53] = "\u0019\nJ;82l*A4)}\r$J?-'y";
        objectArray[54] = "5}`\"z~q?s5Jfc?q &T4y/wq\u0003b\"l 1zl1\u007f&J";
        objectArray[55] = "odk\u001ekG+&x\t[T57~\u0017\f\u0003k`&{g\u000651x\n)\\.>";
        objectArray[56] = "^+Df\bLA$\u0015`gH<#\u0017!\u0003K\u0007z\u0016;\u0016\u0019<hVa\\AW*]lg";
        objectArray[57] = "]\b\n \u000e\u0017\u0002\u000f_-w\u001c>UY<\u0013\u001c\u0005\fX&\u0006N>\u0005\u00190F\u0018\u0002]Q1\u0005v";
        objectArray[58] = "\u0000\u0012B5y$\f\u0007\u0003=\u001b#]\u0006X0Lw\u0006S\u0006l\u001bp\u0005Z\u0006:tsE[\u0004";
        objectArray[59] = "*S\u0007%)\"uTR(P(I\u000eT94)rWU#!{IE\u0015yk#\"\u0007\u001etP";
        objectArray[60] = "|\u0012ZlD2u\u0015E}\"8\u007f\fGuN\n+M\u0016\"\u001d]~\u0011ZuY$p\u0002Is\"cb\f_(\u001b!`\u0014[\u0012P$/KGy\u0012/\"p";
        objectArray[61] = "bT2va]&\u0016!aQN8\u0007'\u007f\u0006\u0019fW~\u00134A9\f)i DcV";
        objectArray[62] = "N06#\u0017\u0016Ccnt+\u0013\u007f5g4O\u0010Dlf.ZB\u007fe'8\u001a\u0014C=o9Yz";
        objectArray[63] = "7$j$J^:4c)#\u000f6(w)tXf}(EO\u001f*\u007f\u007f|]\u0007;<";
        objectArray[64] = "\u0017?7bXj\u0016ce}7l}8bgSlFac}F>}h\"k\u0006hA0jjE\u0006";
        objectArray[65] = "4$\u0014\u0015&'k/\t\u001eH!\u000bgK\u000e,'0>J\u00149u\u000b`\u0003\u000f0w2\"\u0001\u00174M";
        objectArray[66] = "B\t\u001dZj\u0017\u0006K\u000eMZ\u000f\u0014K\fX6=@\nR\u000eZ\u0018\u0000\nW_1Z\u000b\u0007l";
        objectArray[67] = "pS*r.$|FkzL#-G0w\u001bq}\u0012e+Lpu\u001bn}#s5\u001al";
        objectArray[68] = "#+\u001eNL\u0006mq\u0005A.\u0012rk\u001fBB !.F\u0015.\b'.\u001aGS\u001acvO%\u0013\u0015{u\u0010DK\u0007b}\u007f";
        objectArray[69] = " 0[a449hN6H53*G`$\u0007gn\u001d6H.8*A{,7`?\u0016\u0007";
        objectArray[70] = "\u001f\u0010Z'n8\u001eL\b8\u00010u\u0017\u000f\"e>NN\u000e8plu\\Nb:4\u001e\u001eEo\u0001";
        objectArray[71] = "\u001b:^\u0012[t\u001c:\u001e\n0wH%\u0006\u0015\\E\u0018e]B0,U%\u001eH\tnW=\u001ar\rpA;\t\u0013UbX3f";
        objectArray[72] = "\u000f\u000fHI\u0015IAUSFw]^OIE\u001bo\t\u000f\u0019\u0018G8AJ\u0014\u0019\u0017S\u0003A\u0019\"";
        objectArray[73] = "h,XI]Mk$FJ6\np3)T\u0007\u0011r*W^J\u0000*US\u001fV\u0012n+YRGJ\u0011";
        objectArray[74] = "e\u000f$)\b,+U?&j84O%%\u0006\nb\ry\u007fU]>\u000f?>W4<\u0003>rj4!Bt,VliC7B";
        objectArray[75] = "PnR:y\u0013PnIhDGPkO7(u\u0004+\u0013lD\u001cMkWj}^OsSP";
        objectArray[76] = "]@\u0017\u0019\u0014\u007f\u0018JF\u0001v~d\n\u0010\u0012Hu\u0014\\\u0016F\u0017\u0014";
        objectArray[77] = "\t\u000bBO5]\u001b\u0013S\fY\u0001\b\t_\u001253\\I\u0005DY\t\u001c\bUHh\t\u001c\u0013\u0007u";
        objectArray[78] = "ZzI$?J\u0002hP,PN\ndM!<|X)\u0015wP\u0016^)\u0017 ?\u0015\u001e(\u0015F";
        objectArray[79] = "wT|m\u00180v\u0000h9eh|\u001eeH\u0001ix\u0012\u0019aYtmSpcUu!n";
        objectArray[80] = "?XzElC:P%FT\u001c5Hu[8.e\u000e*\fky WoSk\u0004cW(LT\u0010 E$RhHhDg<";
        objectArray[81] = "{0O5[\u0014n!T0:\u0006\u0014w\u0012+^\u0002/.\u00131KP\u0014'R'\u000b\u0006(\u007f\u001a&Hh";
        objectArray[82] = "\u000f\u001b'FcL\u000b\u0015g\u0013\u0011[\u0016\u0004\u007fOF\bGQ+#iGK\fiZmI\u000bY";
        objectArray[83] = "g+s\u0003`\u0004)qh\f\u0002\u00106kr\u000fn\"`./T2uet*\bi\u0013btj\u0010\u0002";
        objectArray[84] = "w@THm;tHJK\u0006liB%U7gmF[_zv59_\u001efdqGUSw<\u000e";
        objectArray[85] = "\u0006K!QhXB\t2FXK\\\u00184X\u000f\u001c\u0003Dh48DD\u00149\u000b5TM\u0019";
        objectArray[86] = "\u001c0ULp*\u0003?\u0004J\u001f.~8\u0006\u000b{-Ea\u0007\u0011n\u007f~hF\u0007.)B0\u000e\u0006mG";
        objectArray[87] = "8\f\u0010\u0004SBvV\u000b\u000b1ViL\u0011\b]d?\u000eMR\r3c\f\u000b\u0013\fZa\u0000\n_1";
        objectArray[88] = "\u0010P$.\bX\u0013X:-c\u0001\bOU._\u001e\u0015\u0014<,S\u001fY)2u\u0019\u0018T@0y\u0018TiNi3\u001fY\u0000Le2Sd";
        objectArray[89] = "\u001d\u0016t\fF5\u001cJ&\u0013)0w\u0011!\tM3LH \u0013XawU\u007f\u0019C+\u001aUw\u0019GY";
        objectArray[90] = "'\u0015\u001e8i\u001e9\u0018OZ:\u0016>@A!W\u000b\u007f\u0012Gd&\u0015rC%(.RxINj%_C";
        objectArray[91] = "2r\u0007!X\u00121z\u0019\"3R,Q\u001f*RG-pv<\u0002N(t\b6O_p\u000b\fwSM4u\u0006:B\u0015K";
        objectArray[92] = "yQW\u00047}`\tBSKwfZO\u000e\u001c <\n\u0013b1(gTT\u001c;ev\f";
        objectArray[93] = "lj\u001a&iS\"0\u0001)\u000bL1;\u001f!\\\u0019ajGMlN?/CwiF`,";
        objectArray[94] = "j.Nl|f\u007f?Ui\u001dw\u0005i\u0013ryp>0\u0012hl\"\u00059S~,t9a\u001b\u007fo\u001a";
        objectArray[95] = "\u0003&\\d\u001f\u0000\u0003.\\`m\f\u0018<og\t\u0010\u0013@\u000f~\u0011\u0015DyM|\t\u0011~";
        objectArray[96] = "/X;\u007f\u001d a\u0002 p\u007f4~\u0018:s\u0013\u0006(Zf)BQtX hB8vT!$\u007f";
        objectArray[97] = "@]\u007f \u0004s\u000e\u0007d/fg\u0011\u001d~,\nUEQ!zV\u0002\u0002\u0007b-\u001af\u001b_wzf";
        objectArray[98] = "\n6\u0006vxi\u001ee\u0016n@uef\u0004l#s\u0019s\u0015w&";
        objectArray[99] = "suwAr\u0003r)%^\u001d\u0006\u0019r\"Dy\u0005\"+#^lW\u0019\"bH,\u0001%z*Ioo";
        objectArray[100] = "0g\u0006)YJ\"#^|;Y.2[ l\tv`\u0003LD\u000fv:]1VK.o";
        objectArray[101] = "9BbR\u001bL5W#ZyKdVxW.\u0015=\u0006,;D\u001c4\u0001zTG\\5\u0003";
        objectArray[102] = "W\u0003@1Q2[\u0016\u0001935\n\u0017Z4dk[A\u0005X\u000ebZ@X7\r\"[B";
        objectArray[103] = "j`b<\u001a9|lj''7{bv7p` >\"a')u\u007fufG?ywn";
        objectArray[104] = "l,>RacmplM\u000ef\u0006+kWje=rjM\u007f7\u0006,#Vv5?n!Nr\u000f";
        objectArray[105] = "SxXD\td\fsEOggl2D]\u001a5\u0015i\u0002G\u0000\u000e\\y@_\\w\u0007?ZEg";
        objectArray[106] = "Va8\u001f,LGo6\u001b]BS\u0003=^fG\u0003r#S7%Va8\u001f,LGo6\u001b]";
        objectArray[107] = "\u001f\u0015&9\nC\u0006M3nvI\u0000\u001e>3!\u001eZN`_\f\u0016\u0001\u0010%!\u0006[\u0010H";
        objectArray[108] = "GA_D\u001e\"\nRS]`*6\t\u0004I\u0004)\rP\u0005S\u0011{6BE\t[#]\u0000N\u0004`";
        objectArray[109] = "U=0y.\u0015G%!:BIT?-$.{\u0003xqs{,K:px\"G\t1}C+THr#\u007fs\u001cI1M";
        objectArray[110] = "`0;q(*-#7hV\"\u0011x`|2!*!af's\u0011;ia54o1$pmK";
        Object[] objectArray2 = objectArray;
        objectArray[111] = "YFc'\u0014WZN}$\u007f\u000eIO\u0012'C\u0011\\\u0002{%O\u0010\u0010?u|\u0005\u0017\u001dVwp\u0004[ X.:\u0003VIZ\";Ok";
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'm' || c == 'S' || c == 'k' || c == 'j') {
                field = eH.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'm' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'S' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'k' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = eH.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ee' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'q' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        eH.b("\u00ee", (Object)eH.b("k", (long)3251313103832440116L, (long)l), (Object)objectArray2, (long)3247605876953261589L, (long)l);
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = eH.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private int d(Object[] objectArray) {
        Object object;
        block8: {
            long l = (Long)objectArray[0];
            l = k ^ l;
            int n = 0;
            CallSite callSite = eH.b("q", (long)-509455839322610646L, (long)l);
            while (n <= (int)eH.l) {
                block7: {
                    block9: {
                        CallSite callSite2 = eH.b("\u00ee", (Object)eH.b("\u00ee", (Object)eH.b("m", (Object)b, (long)-508644640910143693L, (long)l), (long)-510640341500808587L, (long)l), (int)n, (long)-509773357311323066L, (long)l);
                        try {
                            try {
                                try {
                                    if (callSite != null) break block7;
                                    object = eH.b("\u00ee", (Object)eH.b("\u00ee", (Object)callSite2, (long)-509260785920108971L, (long)l), (Object)eH.b("k", (long)-509476240326409717L, (long)l), (long)-510147792725884924L, (long)l);
                                    if (callSite != null) break block8;
                                }
                                catch (MatchException matchException) {
                                    throw eH.b("q", (Object)matchException, (long)-511328325361880620L, (long)l);
                                }
                                if (object == 0) break block9;
                            }
                            catch (MatchException matchException) {
                                throw eH.b("q", (Object)matchException, (long)-511328325361880620L, (long)l);
                            }
                            return n;
                        }
                        catch (MatchException matchException) {
                            throw eH.b("q", (Object)matchException, (long)-511328325361880620L, (long)l);
                        }
                    }
                    ++n;
                }
                if (callSite == null) continue;
            }
            object = -1;
        }
        return object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @bP
    public void a(a9 var1_1) {
        block13: {
            block12: {
                block10: {
                    block11: {
                        v0 = var2_2 = eH.k ^ 64771774568690L;
                        var4_3 = v0 ^ 69871300749116L;
                        var6_4 = v0 ^ 119537951978190L;
                        var8_5 = eH.b("q", (long)-1115914019683013561L, (long)var2_2);
                        try {
                            v1 /* !! */  = this.i;
                            if (var8_5 != null) break block10;
                            if (!v1 /* !! */ ) break block11;
                        }
                        catch (MatchException v2) {
                            throw eH.b("q", (Object)v2, (long)-1114056957851682375L, (long)var2_2);
                        }
                        return;
                    }
                    v3 = new Object[2];
                    v3[1] = var6_4;
                    v3[0] = eH.b("k", (long)-1108184291870583443L, (long)var2_2);
                    v1 /* !! */  = eH.b("q", (Object)v3, (long)-1116374251916877724L, (long)var2_2);
                }
                try {
                    try {
                        if (var8_5 != null) break block12;
                        if (!v1 /* !! */ ) {
                        }
                        ** GOTO lbl40
                    }
                    catch (MatchException v4) {
                        throw eH.b("q", (Object)v4, (long)-1114056957851682375L, (long)var2_2);
                    }
                    v5 = new Object[2];
                    v5[1] = var6_4;
                    v5[0] = eH.b("k", (long)-1114327318289193998L, (long)var2_2);
                    v1 /* !! */  = eH.b("q", (Object)v5, (long)-1116374251916877724L, (long)var2_2);
                }
                catch (MatchException v6) {
                    throw eH.b("q", (Object)v6, (long)-1114056957851682375L, (long)var2_2);
                }
            }
            try {
                if (!v1 /* !! */ ) break block13;
lbl40:
                // 2 sources

                v7 = new Object[1];
                v7[0] = var4_3;
                eH.b("\u00ee", (Object)this, (Object)v7, (long)-1107930199731229414L, (long)var2_2);
            }
            catch (MatchException v8) {
                throw eH.b("q", (Object)v8, (long)-1114056957851682375L, (long)var2_2);
            }
        }
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return eH.b("q", (Object)((Object)q_0.Mace), (long)-2442442580636846802L, (long)l);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public dC a(Object[] objectArray) {
        CallSite callSite;
        float f;
        long l;
        long l2;
        long l3;
        block66: {
            CallSite callSite2;
            long l4;
            block67: {
                CallSite callSite3;
                CallSite callSite4;
                long l5;
                long l6;
                block62: {
                    long l7;
                    block63: {
                        f5 f52;
                        block65: {
                            CallSite callSite5;
                            long l8;
                            block64: {
                                block60: {
                                    long l9;
                                    block61: {
                                        CallSite callSite6;
                                        block55: {
                                            block56: {
                                                CallSite callSite7;
                                                long l10;
                                                block59: {
                                                    CallSite callSite8;
                                                    long l11;
                                                    block57: {
                                                        long l12;
                                                        long l13;
                                                        block54: {
                                                            Object object;
                                                            block53: {
                                                                block51: {
                                                                    block52: {
                                                                        class_310 class_3102;
                                                                        block50: {
                                                                            l3 = (Long)objectArray[0];
                                                                            long l14 = l3;
                                                                            l2 = l14 ^ 0x7F652AA44F3BL;
                                                                            l = l14 ^ 0x1A99A2A6F024L;
                                                                            l11 = l14 ^ 0x750660A45EAFL;
                                                                            l8 = l14 ^ 0x688BB86AFDB7L;
                                                                            l10 = l14 ^ 0x6D88BA4E35CEL;
                                                                            l13 = l14 ^ 0x5D885352C89BL;
                                                                            l9 = l14 ^ 0x22C1899482E8L;
                                                                            l7 = l14 ^ 0x4DCDFBE1C8B5L;
                                                                            l6 = l14 ^ 0x3E3D964BF26L;
                                                                            l4 = l14 ^ 0x35A4EE5C881DL;
                                                                            l12 = l14 ^ 0x741122B52DE7L;
                                                                            l5 = l14 ^ 0x2AB34C88B9B9L;
                                                                            callSite4 = eH.b("q", (long)-1177019820064541842L, (long)l3);
                                                                            try {
                                                                                try {
                                                                                    class_3102 = b;
                                                                                    if (callSite4 != null) break block50;
                                                                                    if (eH.b("m", (Object)class_3102, (long)-1173701358405839237L, (long)l3) != null) return null;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw eH.b("q", (Object)matchException, (long)-1179085825486510448L, (long)l3);
                                                                                }
                                                                                class_3102 = b;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw eH.b("q", (Object)matchException, (long)-1179085825486510448L, (long)l3);
                                                                            }
                                                                        }
                                                                        try {
                                                                            try {
                                                                                object = eH.b("\u00ee", (Object)class_3102, (long)-1177133199178031667L, (long)l3);
                                                                                if (callSite4 != null) break block51;
                                                                                if (object != false) break block52;
                                                                                return null;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw eH.b("q", (Object)matchException, (long)-1179085825486510448L, (long)l3);
                                                                            }
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw eH.b("q", (Object)matchException, (long)-1179085825486510448L, (long)l3);
                                                                        }
                                                                    }
                                                                    this.i = 0;
                                                                    object = this.a;
                                                                }
                                                                try {
                                                                    try {
                                                                        if (callSite4 != null) break block53;
                                                                        if (object == -1) break block54;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw eH.b("q", (Object)matchException, (long)-1179085825486510448L, (long)l3);
                                                                    }
                                                                    object = this.a;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw eH.b("q", (Object)matchException, (long)-1179085825486510448L, (long)l3);
                                                                }
                                                            }
                                                            Object[] objectArray2 = new Object[2];
                                                            objectArray2[1] = l10;
                                                            objectArray2[0] = (int)object;
                                                            eH.b("q", (Object)objectArray2, (long)-1179514169204247375L, (long)l3);
                                                            this.a = -1;
                                                            return null;
                                                        }
                                                        try {
                                                            block58: {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                callSite6 = eH.b("m", (Object)b, (long)-1174172537140209545L, (long)l3);
                                                                                if (callSite4 != null) break block55;
                                                                                if (eH.b("\u00ee", (Object)eH.b("\u00ee", (Object)callSite6, (Object)eH.b("k", (long)-1179826590770662786L, (long)l3), (long)-1177591796229523536L, (long)l3), (long)-1176899465841606383L, (long)l3) == eH.b("k", (long)-1179724193999021381L, (long)l3)) break block56;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw eH.b("q", (Object)matchException, (long)-1179085825486510448L, (long)l3);
                                                                            }
                                                                            callSite8 = eH.b("k", (long)-1179724193999021381L, (long)l3);
                                                                            if (callSite4 != null) break block57;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw eH.b("q", (Object)matchException, (long)-1179085825486510448L, (long)l3);
                                                                        }
                                                                        Object[] objectArray3 = new Object[2];
                                                                        objectArray3[1] = l12;
                                                                        objectArray3[0] = callSite8;
                                                                        if (eH.b("q", (Object)objectArray3, (long)-1177463560213282995L, (long)l3) == false) break block58;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw eH.b("q", (Object)matchException, (long)-1179085825486510448L, (long)l3);
                                                                    }
                                                                    this.i = 1;
                                                                    Object[] objectArray4 = new Object[2];
                                                                    objectArray4[1] = l13;
                                                                    objectArray4[0] = eH.b("k", (long)-1176006349892082940L, (long)l3);
                                                                    eH.b("q", (Object)objectArray4, (long)-1173278757821539737L, (long)l3);
                                                                    if (callSite4 == null) return null;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw eH.b("q", (Object)matchException, (long)-1179085825486510448L, (long)l3);
                                                                }
                                                            }
                                                            callSite8 = eH.b("k", (long)-1179724193999021381L, (long)l3);
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw eH.b("q", (Object)matchException, (long)-1179085825486510448L, (long)l3);
                                                        }
                                                    }
                                                    Object[] objectArray5 = new Object[2];
                                                    objectArray5[1] = l11;
                                                    objectArray5[0] = callSite8;
                                                    CallSite callSite9 = eH.b("q", (Object)objectArray5, (long)-1175651186758905911L, (long)l3);
                                                    try {
                                                        callSite7 = callSite9;
                                                        if (callSite4 != null) break block59;
                                                        if (callSite7 == null) return null;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw eH.b("q", (Object)matchException, (long)-1179085825486510448L, (long)l3);
                                                    }
                                                    callSite7 = callSite9;
                                                }
                                                Object[] objectArray6 = new Object[2];
                                                objectArray6[1] = l10;
                                                objectArray6[0] = (int)eH.b("\u00ee", (Object)callSite7, (long)-1175831306999982643L, (long)l3);
                                                eH.b("q", (Object)objectArray6, (long)-1179514169204247375L, (long)l3);
                                                return null;
                                            }
                                            callSite6 = eH.b("m", (Object)b, (long)-1174172537140209545L, (long)l3);
                                        }
                                        try {
                                            try {
                                                callSite3 = eH.b("\u00ee", (Object)callSite6, (long)-1176744109934805395L, (long)l3);
                                                if (callSite4 != null) break block60;
                                                if (callSite3 == false) break block61;
                                            }
                                            catch (MatchException matchException) {
                                                throw eH.b("q", (Object)matchException, (long)-1179085825486510448L, (long)l3);
                                            }
                                            eH.b("\u00ee", (Object)eH.b("m", (Object)eH.b("m", (Object)b, (long)-1176498146658215819L, (long)l3), (long)-1173549189838152039L, (long)l3), (boolean)true, (long)-1179343928141501477L, (long)l3);
                                            return null;
                                        }
                                        catch (MatchException matchException) {
                                            throw eH.b("q", (Object)matchException, (long)-1179085825486510448L, (long)l3);
                                        }
                                    }
                                    eH.b("\u00ee", (Object)eH.b("m", (Object)eH.b("m", (Object)b, (long)-1176498146658215819L, (long)l3), (long)-1173549189838152039L, (long)l3), (boolean)false, (long)-1179343928141501477L, (long)l3);
                                    Object[] objectArray7 = new Object[1];
                                    objectArray7[0] = l9;
                                    callSite3 = eH.b("q", (Object)objectArray7, (long)-1179304735672981175L, (long)l3);
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (callSite4 != null) break block62;
                                                    if (callSite3 != false) break block63;
                                                }
                                                catch (MatchException matchException) {
                                                    throw eH.b("q", (Object)matchException, (long)-1179085825486510448L, (long)l3);
                                                }
                                                callSite5 = eH.b("\u00ee", (Object)eH.b("m", (Object)b, (long)-1174172537140209545L, (long)l3), (long)-1176744109934805395L, (long)l3);
                                                if (callSite4 != null) break block64;
                                            }
                                            catch (MatchException matchException) {
                                                throw eH.b("q", (Object)matchException, (long)-1179085825486510448L, (long)l3);
                                            }
                                            if (callSite5 != false) return null;
                                        }
                                        catch (MatchException matchException) {
                                            throw eH.b("q", (Object)matchException, (long)-1179085825486510448L, (long)l3);
                                        }
                                        f52 = this.c;
                                        if (callSite4 != null) break block65;
                                    }
                                    catch (MatchException matchException) {
                                        throw eH.b("q", (Object)matchException, (long)-1179085825486510448L, (long)l3);
                                    }
                                    Object[] objectArray8 = new Object[2];
                                    objectArray8[1] = l7;
                                    objectArray8[0] = Float.valueOf(400.0f);
                                    callSite5 = eH.b("\u00ee", (Object)f52, (Object)objectArray8, (long)-1173383621744775943L, (long)l3);
                                }
                                catch (MatchException matchException) {
                                    throw eH.b("q", (Object)matchException, (long)-1179085825486510448L, (long)l3);
                                }
                            }
                            try {
                                if (callSite5 == false) return null;
                                Object[] objectArray9 = new Object[1];
                                objectArray9[0] = l8;
                                eH.b("q", (Object)objectArray9, (long)-1173463873141770870L, (long)l3);
                                eH.b("\u00ee", (Object)eH.b("m", (Object)eH.b("m", (Object)b, (long)-1174172537140209545L, (long)l3), (long)-1175998526616569620L, (long)l3), (Object)new class_2848((class_1297)eH.b("m", (Object)b, (long)-1174172537140209545L, (long)l3), (class_2848.class_2849)eH.b("k", (long)-1179747078597737138L, (long)l3)), (long)-1176190269279641652L, (long)l3);
                                eH.b("\u00ee", (Object)eH.b("m", (Object)eH.b("m", (Object)b, (long)-1176498146658215819L, (long)l3), (long)-1173549189838152039L, (long)l3), (boolean)true, (long)-1179343928141501477L, (long)l3);
                                f52 = this.c;
                            }
                            catch (MatchException matchException) {
                                throw eH.b("q", (Object)matchException, (long)-1179085825486510448L, (long)l3);
                            }
                        }
                        Object[] objectArray10 = new Object[1];
                        objectArray10[0] = l;
                        eH.b("\u00ee", (Object)f52, (Object)objectArray10, (long)-1176318896601226263L, (long)l3);
                        return null;
                    }
                    Object[] objectArray11 = new Object[2];
                    objectArray11[1] = l7;
                    objectArray11[0] = Float.valueOf(400.0f);
                    callSite3 = eH.b("\u00ee", (Object)this.d, (Object)objectArray11, (long)-1173383621744775943L, (long)l3);
                }
                try {
                    if (callSite3 == false) {
                        return null;
                    }
                }
                catch (MatchException matchException) {
                    throw eH.b("q", (Object)matchException, (long)-1179085825486510448L, (long)l3);
                }
                CallSite callSite10 = eH.b("\u00ee", (Object)eH.b("m", (Object)b, (long)-1174172537140209545L, (long)l3), (long)-1179649316805449964L, (long)l3);
                CallSite callSite11 = eH.b("\u00ee", (Object)eH.b("m", (Object)b, (long)-1174172537140209545L, (long)l3), (long)-1176387778727372458L, (long)l3);
                CallSite callSite12 = eH.b("q", (double)((double)callSite11), (long)-1175512946732283901L, (long)l3);
                CallSite callSite13 = eH.b("\u00ee", (Object)new class_243((double)(-eH.b("q", (double)callSite12, (long)-1176783609429910247L, (long)l3)), 0.0, (double)eH.b("q", (double)callSite12, (long)-1176425257201894383L, (long)l3)), (long)-1177682696719051468L, (long)l3);
                float f10 = (float)(eH.b("m", (Object)callSite10, (long)-1178944496628930043L, (long)l3) * eH.b("m", (Object)callSite13, (long)-1178944496628930043L, (long)l3) + eH.b("m", (Object)callSite10, (long)-1175930103889784333L, (long)l3) * eH.b("m", (Object)callSite13, (long)-1175930103889784333L, (long)l3));
                float f11 = 0.4f;
                float f12 = 1.2f;
                CallSite callSite14 = eH.b("q", (float)0.0f, (float)eH.b("q", (float)1.0f, (float)f10, (long)-1175637101272043846L, (long)l3), (long)-1179216033026622547L, (long)l3);
                float f13 = f12 - (f12 - f11) * callSite14;
                try {
                    Object[] objectArray12 = new Object[2];
                    objectArray12[1] = l5;
                    objectArray12[0] = eH.b("m", (Object)b, (long)-1174172537140209545L, (long)l3);
                    if (eH.b("q", (Object)objectArray12, (long)-1179147612589302159L, (long)l3) > (double)f13) {
                        return null;
                    }
                }
                catch (MatchException matchException) {
                    throw eH.b("q", (Object)matchException, (long)-1179085825486510448L, (long)l3);
                }
                f = 87.0f + eH.b("\u00ee", (Object)dn_0.a, (long)-1176923097778318424L, (long)l3) * 3.0f;
                Object[] objectArray13 = new Object[1];
                objectArray13[0] = l6;
                callSite2 = eH.b("\u00ee", (Object)this, (Object)objectArray13, (long)-1177402911719500477L, (long)l3);
                try {
                    try {
                        callSite = callSite2;
                        if (callSite4 != null) break block66;
                        if (callSite != -1) break block67;
                        return null;
                    }
                    catch (MatchException matchException) {
                        throw eH.b("q", (Object)matchException, (long)-1179085825486510448L, (long)l3);
                    }
                }
                catch (MatchException matchException) {
                    throw eH.b("q", (Object)matchException, (long)-1179085825486510448L, (long)l3);
                }
            }
            Object[] objectArray14 = new Object[1];
            objectArray14[0] = l4;
            this.a = (int)eH.b("q", (Object)objectArray14, (long)-1179016040066782796L, (long)l3);
            callSite = callSite2;
        }
        Object[] objectArray15 = new Object[4];
        objectArray15[3] = l2;
        objectArray15[2] = false;
        objectArray15[1] = () -> eH.lambda$calculate$0(f);
        objectArray15[0] = (int)callSite;
        eH.b("q", (Object)objectArray15, (long)-1177274787392858755L, (long)l3);
        Object[] objectArray16 = new Object[1];
        objectArray16[0] = l;
        eH.b("\u00ee", (Object)this.d, (Object)objectArray16, (long)-1176318896601226263L, (long)l3);
        return new dC((float)eH.b("\u00ee", (Object)eH.b("m", (Object)b, (long)-1174172537140209545L, (long)l3), (long)-1176387778727372458L, (long)l3), f);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (eH.n[n3] != null) {
            return n3;
        }
        Object object = m[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 23;
            case 1 -> 6;
            case 2 -> 37;
            case 3 -> 57;
            case 4 -> 36;
            case 5 -> 10;
            case 6 -> 4;
            case 7 -> 12;
            case 8 -> 58;
            case 9 -> 8;
            case 10 -> 2;
            case 11 -> 59;
            case 12 -> 25;
            case 13 -> 54;
            case 14 -> 51;
            case 15 -> 9;
            case 16 -> 41;
            case 17 -> 35;
            case 18 -> 53;
            case 19 -> 43;
            case 20 -> 45;
            case 21 -> 27;
            case 22 -> 50;
            case 23 -> 48;
            case 24 -> 26;
            case 25 -> 16;
            case 26 -> 61;
            case 27 -> 62;
            case 28 -> 31;
            case 29 -> 39;
            case 30 -> 30;
            case 31 -> 60;
            case 32 -> 24;
            case 33 -> 46;
            case 34 -> 47;
            case 35 -> 42;
            case 36 -> 7;
            case 37 -> 14;
            case 38 -> 63;
            case 39 -> 5;
            case 40 -> 21;
            case 41 -> 56;
            case 42 -> 32;
            case 43 -> 1;
            case 44 -> 0;
            case 45 -> 18;
            case 46 -> 44;
            case 47 -> 22;
            case 48 -> 13;
            case 49 -> 17;
            case 50 -> 33;
            case 51 -> 28;
            case 52 -> 3;
            case 53 -> 15;
            case 54 -> 49;
            case 55 -> 34;
            case 56 -> 19;
            case 57 -> 29;
            case 58 -> 40;
            case 59 -> 52;
            case 60 -> 20;
            case 61 -> 11;
            case 62 -> 55;
            default -> 38;
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
        eH.n[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = eH.m(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            String string = eH.n[n];
            int n2 = string.indexOf(8);
            Class clazz = eH.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = eH.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = eH.g(clazz3, string2, clazz2)) != null) {
                    eH.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = eH.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        eH.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = eH.n(59564455616639L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = eH.m(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = eH.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = eH.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = eH.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = eH.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        eH.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = eH.n(59564455616639L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = eH.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        eH.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = eH.n(59564455616639L, 0L);
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

    private static void lambda$calculate$0(float f) {
        long l = k ^ 0x30A583874CB6L;
        long l2 = l ^ 0x4F6C31D7C3F6L;
        CallSite callSite = eH.b("\u00ee", (Object)eH.b("m", (Object)b, (long)-1956371312725716198L, (long)l), (long)-1960089488317799516L, (long)l);
        eH.b("\u00ee", (Object)eH.b("m", (Object)b, (long)-1956371312725716198L, (long)l), (float)f, (long)-1961600917091639490L, (long)l);
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = eH.b("k", (long)-1963307131003131799L, (long)l);
        eH.b("q", (Object)objectArray, (long)-1956040206267444982L, (long)l);
        eH.b("\u00ee", (Object)eH.b("m", (Object)b, (long)-1956371312725716198L, (long)l), (float)callSite, (long)-1961600917091639490L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(eH.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


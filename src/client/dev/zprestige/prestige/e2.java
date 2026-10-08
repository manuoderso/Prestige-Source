/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1542
 *  net.minecraft.class_310
 *  net.minecraft.class_408
 *  net.minecraft.class_4604
 *  org.joml.Matrix4f
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bJ;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bo_0;
import dev.zprestige.prestige.cs_0;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dN;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dP;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.hc;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1297;
import net.minecraft.class_1542;
import net.minecraft.class_310;
import net.minecraft.class_408;
import net.minecraft.class_4604;
import org.joml.Matrix4f;

public class e2
extends dV {
    private dO a;
    private dP c;
    private dO d;
    private dM e;
    private dN f;
    private class_4604 g;
    private Map h;
    private static final long k = hc.a(-6889287403326587784L, 6219519792319338852L, MethodHandles.lookup().lookupClass()).a(261322604867672L);
    private static final String l;
    private static final Object[] m;
    private static final String[] n;

    public e2() {
        long l = k ^ 0x73D098AB2317L;
        long l2 = l ^ 0x7E5046C6FC53L;
        this.h = new LinkedHashMap();
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = this::lambda$new$0;
        e2.b("L", (Object)this.f, (Object)objectArray, (long)856543287723683599L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        m = new Object[106];
        n = new String[106];
        e2.f();
        long l = k ^ 0x527610B08807L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u0012\u0097>\u00a5\u00c4\u00bbxL".getBytes("ISO-8859-1"));
                e2.l = e2.b(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/e2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static String b(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = e2.m(l, l2);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                e2.m[n] = clazz = Class.forName(e2.n[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = e2.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = e2.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = e2.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = e2.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = m;
        m[0] = "1\u0014h\u0012\u0006C1\u0014\u007fN\nL+_\u007fP\nY,.-\u000bR\u0013";
        objectArray[1] = "\u0003vsa9v\u0003vd=5y\u0019=d#5l\u001eL5zb.";
        objectArray[2] = "\u0011zzV+D\u001auk\u0019L\\\u001eimUiM";
        objectArray[3] = "Gs.\u0007~YY{4H\u0019XH`9\u0012?^";
        objectArray[4] = "IRJq\u001ezB][>\u007ftIV_d";
        objectArray[5] = "tS\u0001\u0013MfbS\u0004I^qu\u0018\u0007ORed_\u0010X\u0019wX";
        objectArray[6] = "sF9()\u0001\u0006f2'8N{~! 1\u0007\u0013";
        objectArray[7] = "2wr\u0019pa2weE|n(<e[|{/M7\u0002):";
        objectArray[8] = "4+\u000f\u0002pZ4+\u0018^|U.`\u0018@|@)\u0011J\u001e$\u0004";
        objectArray[9] = Double.TYPE;
        e2.n[9] = "java/lang/Double";
        objectArray[10] = "\u007f]!Y!n\u007f]6\u0005-ae\u00166\u001b-tbgfF|";
        objectArray[11] = "kFXIZ\u001fkFO\u0015V\u0010q\rO\u000bV\u0005v|\u001bS\u0001";
        objectArray[12] = "!dU\u0017y\u001d!dBKu\u0012;/BUu\u0007<^\u0017\n,";
        objectArray[13] = "!{8<\tJ*t)stR9s :";
        objectArray[14] = "\u0003m\u0016\u0002}U\u001de\fM\u001eA\u0019";
        objectArray[15] = Boolean.TYPE;
        e2.n[15] = "java/lang/Boolean";
        objectArray[16] = "\u0003cVGHE\u001dkL\b*Y\u001av";
        objectArray[17] = "XR\u001aq\u0000gFZ\u0000>m}_C\rbOf]A";
        objectArray[18] = Void.TYPE;
        e2.n[18] = "java/lang/Void";
        objectArray[19] = "B0Fb z\\8\\-CnXuumz}Q";
        objectArray[20] = "\u0007%^ g8\u0011%[zt/\u0006nX|x;\u0017)Ok3,(";
        objectArray[21] = "\r9\u0003z\u0005o\u00066\u00125mo\b9\u0001";
        objectArray[22] = Float.TYPE;
        e2.n[22] = "java/lang/Float";
        objectArray[23] = "9s\u000e3\u001ey/s\u000bi\rn88\bo\u0001z)\u007f\u001fxJlo";
        objectArray[24] = "FiulGWMfd#$ZXkkH\u0011XIxwd\u0006U";
        objectArray[25] = Integer.TYPE;
        e2.n[25] = "java/lang/Integer";
        objectArray[26] = "0\u0016L\u001e^\u001c;\u0019]Q2\u001f5\u001b_\u001e\u001e";
        objectArray[27] = "\\\u0011F\u0019A\rJ\u0011CCR\u001a]Z@E^\u000eL\u001dWR\u0015\u001fr";
        objectArray[28] = "^4\u001c>\u0018!+\u0014\u00171\tnJ\u001a\u001c:\r4>";
        objectArray[29] = "Q\u0018& ZbQ\u00181|VmKS1bVxL\"f8\u0007?";
        objectArray[30] = "\u000fJ*\u0003d\u0007\u0011B0L\u0019\u0017\u0011";
        objectArray[31] = "\u0006T\u0007O7@\u0010T\u0002\u0015$W\u0007\u001f\u0001\u0013(C\u0016X\u0016\u0004cS\u000eX\u0014\u000f9\u001e2C\u0014\u00129Y\u0005T";
        objectArray[32] = "*\u0016C(:\b<\u0016Fr)\u001f+]Et%\u000b:\u001aRcn\u001b\r";
        objectArray[33] = "N/qS%>N/f\u000f)1Tdf\u0011)$S\u00157I{";
        objectArray[34] = "nO}\u001c8axOxF+vo\u0004{@'b~ClWlrK";
        objectArray[35] = "\u0016N9\u007f`mcn2pq\"\u0002`9{uxv";
        objectArray[36] = "BM{(\u0014\u00187mp'\u0005WVc{,\u0001\r\"";
        objectArray[37] = "T\u0005dgF@T\u0005s;JONNs%JZI?\"z\u0013";
        objectArray[38] = "l[rj\u001eTnE;\t\u0015Oq@mp\u0012";
        objectArray[39] = "EYP\nW70y[\u0005FxQwP\u000eB\"%";
        objectArray[40] = "bxJ\u000eZftxOTIqc3LREert[E\u000erD";
        objectArray[41] = "^!\u0007Ypm+\u0001\fVa\"J\u000f\u0007]ex>";
        objectArray[42] = "w=UW\"g\u0002\u001d^X3(c\u0013US7r\u0017";
        objectArray[43] = "&0xE\u0015#;% gT.##";
        objectArray[44] = "\f;Bp o\u00074S?Gm\u0012?St|";
        objectArray[45] = "'nX\u000e6!RNS\u0001'n3@X\n#4G";
        objectArray[46] = "\u0015K!gq(\u0003K$=b?\u0014\u0000';n+\u0005G0,%<\u001a";
        objectArray[47] = "7-\u0012iP^B\r\u0019fA\u0011#\u0003\u0012mEKW";
        objectArray[48] = "\u007f(\u0005`\u001cXi(\u0000:\u000fO~c\u0003<\u0003[o$\u0014+HL\u007f";
        objectArray[49] = "\u0011\u0004>},;d$5r=t\u0005*>y9.q";
        objectArray[50] = "j\ni\u0001-\u0002\u001f*b\u000e<M~$i\u00058\u0017\n";
        objectArray[51] = "Zfg!\u0011\u0007Lfb{\u0002\u0010[-a}\u000e\u0004JjvjE\u0013p";
        objectArray[52] = "`>+cO%\u0015\u001e l^jt\u0010+gZ0\u0000";
        objectArray[53] = "?DqWK_?Df\u000bGP%\u000ff\u0015GE\"~1J\u0011";
        objectArray[54] = "d\u0001)[QJ5Gx\\=L4G YQ~d\u000b}\u000e=\u0014<F}E\fW(V.>\u0003T5G*\u0005\u0001I3E@";
        objectArray[55] = "\u0001\u001bX \u0000!S\u0002Adq+_\u0014\\v&|\u0001C\u0004\u001aA,U\u0014X+\u0017:R\u0012";
        objectArray[56] = "\u0014\u0010h\tf!GTa[\u0018;\u0000P\u000bP#|\u0006\\zZi(\u0010,0P'8\r]:\u001as.}\u00170Tc3\f\u001dz\u0000uC";
        objectArray[57] = "\fLZa_5^UC%.?RC^7yh\f\u0013\u0007[\u0017iHR\u0003&LoN_K";
        objectArray[58] = "S'M0-?R)B=O2\u00007{,?.i%S9>/\u00113V?tR";
        objectArray[59] = "f!\u0010KR\u001fph\u001d\\6D\u00025\u0019U\rTb6\u001e\u001cS";
        objectArray[60] = "\r?~M@\u001b\u000b<cR;\u0007\n0{]lPP`&1\u0005\u0014\u0007!u\n\u0007\t\u0001#";
        objectArray[61] = "\rH^B=\t\u0016\u0010\\\u001e_\u0011k\u0017\u001eFaT\u000bLHN3\tkB\u001cN-\u0000\u001bAC\u001a o";
        objectArray[62] = "\u0018\u0007!4\u001e9\u001e\u0004<+e.\u0013\u0019 /\t\u001cG]{qeu\u0003\t<\"^w\u001e\u000f>H[6\u0012\u0019*sY+\u0014\u001b@v\u0018'\u0002\u000f{t\u0005!\u0000e&*\u00047\u0005\u0017 )\u0019(~";
        objectArray[63] = "A\u0015JvU\u007f\u0014\rKt8*K\u0013\b!B,,\u0018\u0000#G<U\u0011@&\u0004AB\u0006\u001b7E8KF\u001et8!JL\u001crD0\u0011\u0006\u0017H";
        objectArray[64] = "\u001ditm\fT\u001b/)/}\u0005\u001b6tr\u0014\t\"8tb\u0010o\u0015?hn\u0000\u0017\u0003:n$}";
        objectArray[65] = "e\tCs*[a\bX\u007fN\r\u001aS\u0010zp]z\bFr\"\u0000\u001a\u0006\u0012r<\tj\u0005M&1f";
        objectArray[66] = "]\u0007YO\u0018\u0001[\u001fH\u0015u\r1M\u000bM\u000e\u0014@GA\u0019\u0018d";
        objectArray[67] = "%y]UN\u0004t?\fR\"\u0002u?TWN0&r\u0004\u000b\"\\s;Z\n\u0019\u001f#24";
        objectArray[68] = "~hH\fbb=8Ab=49cW\u000e\u000fft=\fbae>=\u000e\u001d)h<n0";
        objectArray[69] = "F[1r\bJNW8pb\u0015\u0003J$f\u001e\u0013\u0005'dd\u0012\u0005\u001dJej\u001d\b\u007f";
        objectArray[70] = "zAo#\u0002\u0000,Wh%bT'Td)\u000efw\u0017?\u007fb\f/U95SO;EjN\fA!Wy7\u0005\u0001$\u0014\u0004";
        objectArray[71] = "\u0005\ni\u001c\u001c\u0003\u0000U`\nb\u0010>V7\n\t\u001a\u0005V8S\u0010z";
        objectArray[72] = ")T\u001e!+\u001feG\u001erI\u0017[\u0001L{wE;Z\u001as%\u0018[J\u0018uw\u001c:\u0006\u000bu$~";
        objectArray[73] = "17}7\u0011\u0001c.ds`\u000bo8ya7\\0e\"\rP\u0006`,!w\u001d\n11";
        objectArray[74] = "^\u000b9-8\u007f\u0016\u0006;~\u0006o\nK\u0019o|a\u0001XB\"8>_T (lb\u00157";
        objectArray[75] = "9\u0018\u001f\u0017@?zH\u0016y\u001fi~\u0013\u0000\u0015-;3M_y\u0013jz\u0002\u001a\u0001\u0005o|Hg";
        objectArray[76] = "\ranjP=\na/h+>\u0015<)mW8\u0013Qio[.\u000b<haT#i";
        objectArray[77] = ">\u0010tU|0mT}\u0007\u0002?1PmF\u0002il\u0013lGsc&Gz79ihWgF3#<A\u0017[c#8H/Hl80,";
        objectArray[78] = "l6D\u001fbJo1\rA\u0019C\tf\u000e@'\u0011i=XHuL\t9P\\yHo\"\b^%*";
        objectArray[79] = "g1k\u001aR)6w:\u001d>/7wb\u0018R\u001dc4<O\u0004J4{i\u0000C3=;lC>";
        objectArray[80] = "Vb\u0011o2MSa\u00107\tG7\"M47\u0015Wy\u001b<eH7x\u0016o9KU{L!p.";
        objectArray[81] = "$C{Qc@%Mt\\\u0001KsXw :\u0016!S{Q0\\uE\u000b";
        objectArray[82] = ">\u0012\u007f,f\u0001=H1e\u0003\u00060\r {o4gJx-8c$H;#d\u0013#\u001byb\u0003\n3\t1a{\u001c6\u000f{\u001c";
        objectArray[83] = "\u000e\u0006\tz8G\u0005^\u000bzW[\u001c\u000fSkWN\u0007\rH{.GG\b\u000b\u00069P\u001c\u0019J\u007f0\u0010\u0019Z7h'K\b\u001bNagNKfNfi\\\u0018\u0001E>k\\w";
        objectArray[84] = "@nZjesFmGu\u001eoGa_zI8\u001d1\u0003\u0016 |JpQ-\"aLr";
        objectArray[85] = "\u0019W\u0018\u0014\u001f\u001eH\u0011I\u0013s\u0018I\u0011\u0011\u0016\u001f*\u001fTMAJ}M\u0003\t\u0000\u000e\u0005[\u0006\u000fJs";
        objectArray[86] = "G\u001a0Y2\u0019\u0014^9\u000bL\u0016HZ)J\u0017\u0016R&7\u000bq\u0015UD0\u000b0\u0017.";
        objectArray[87] = ".\u000e{^J5:Ng\u0018{4A\t1\u0004Ec!Rg\f\u0017>AYg\u0018\n%9Ob\u001e@X";
        objectArray[88] = ":y\u007f\u0004l\u001ck?.\u0003\u0000\u001aj?v\u0006l(:s,P\u0000\u0006>8)\u0006p\u0001mzha";
        objectArray[89] = "\u0016\u001e]\u001eHB\u0011\u0018\u0004A+\u0010lYZ\u0019\u0015A\f\u0002\f\u0011G\u001cl\u0006\u0000\u001cW\u0001\u001e\u0000\u0003\u0001Hz";
        objectArray[90] = "H&\u0005oOKS~\u00073-F.yEk\u0013\u0016N\"\u0013cAK..\rdRPW'Ma\u0011-";
        objectArray[91] = "}V0Tn2gYg\u0005\u001e\u001dAi\\&\u001e>\u007f\u0018?\u001bn$pOn";
        objectArray[92] = "SO0\u0005G-T\u0017e@-2^\u000ep?G;V\u001ae\u0000Lw\u0003\u0013\fS\u0017%K\u001b|PHqFt";
        objectArray[93] = "\rMPuM~\u001eBK}))\fP\u007fsM;\f,\u001a!\u0016=\u0011]\u0010kB+a";
        objectArray[94] = ")A\u0015zDA1U\t<6^2X/-RB9$\u0011\"\fSnX\u0000yFXT";
        objectArray[95] = "4\u0005\u0006:\u0012p3]S\u007fx}2R:;C+%NK1\t\u007f3>Sn\u0000e#FEk\u0006/^";
        objectArray[96] = "]T\u0001-;dF\f\u0003qYk;\u000bA)g9[P\u0017!5d;\\\t&&\u007fBUI#e\u0002";
        objectArray[97] = "\u0002\u001b\f<mrJ\u000b\u001c<T\"rBOejt\u0012\u0019\u0019m8)r\u0017Mm& \u0002\u0014\u00129+O";
        objectArray[98] = "\u00154\u0001])Y\u0012lT\u0018C\\\u0003bG\u000e?Z\u0005\u000f\u0007\f3L\u001db\u0006\u0002<A\u007f";
        objectArray[99] = "3\u0014J>;j \u001bQ6_=2\tx<.RdN\u0004*/#n\u0004P<_";
        objectArray[100] = "fp\u0015B4&3h\u0014@YvotF\u0000\u0007qonB|7h`lR\u0005>(e//";
        objectArray[101] = ";Q>\u001c,4/\u0011\"Z\u001d0T\u000fvR >0P,Y\"Y4U<\u001fz=k\u000f7\u001d\u001d";
        objectArray[102] = "E0+>_.\b<z#c1\u0018/% \u000f\u0003Lc|~YTL/*:\tjD##8c";
        objectArray[103] = "K<3H\u0016<\bl:&Ij\f7,J{8Akt&LaJ;qZ]:\u00000K";
        objectArray[104] = "hz@\u00075sny]\u0018NoouE\u0017\u001985%\u001b{p|bdK@radf";
        Object[] objectArray2 = objectArray;
        objectArray[105] = "y\u0006\"\u000e]R~\u0000{Q>\u0003\u0003A%\t\u0000Qc\u001as\u0001R\f\u0003\u001e\u007f\fB\u0011q\u0018|\u0011]j";
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f2' || c == 'a' || c == '\u00ce' || c == 'C') {
                field = e2.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f2' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'a' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ce' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = e2.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'L' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private boolean d(Object[] objectArray) {
        int n;
        block8: {
            block9: {
                block7: {
                    CallSite callSite;
                    CallSite callSite2;
                    long l;
                    block6: {
                        l = (Long)objectArray[0];
                        l = k ^ l;
                        callSite2 = e2.b("\u00d5", (long)-9073397114328712710L, (long)l);
                        try {
                            try {
                                callSite = e2.b("\u00f2", (Object)b, (long)-9076049085713361830L, (long)l);
                                if (callSite2 != null) break block6;
                                if (callSite == null) break block7;
                            }
                            catch (MatchException matchException) {
                                throw e2.b("\u00d5", (Object)matchException, (long)-9071252076288242210L, (long)l);
                            }
                            callSite = e2.b("\u00f2", (Object)b, (long)-9076049085713361830L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw e2.b("\u00d5", (Object)matchException, (long)-9071252076288242210L, (long)l);
                        }
                    }
                    try {
                        n = callSite instanceof class_408;
                        if (callSite2 != null) break block8;
                        if (n == 0) break block9;
                    }
                    catch (MatchException matchException) {
                        throw e2.b("\u00d5", (Object)matchException, (long)-9071252076288242210L, (long)l);
                    }
                }
                n = 1;
                break block8;
            }
            n = 0;
        }
        return n != 0;
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = e2.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @bP
    public void a(bJ bJ2) {
        long l = k ^ 0x5C4D448E37FAL;
        this.g = e2.b("L", (Object)bJ2, (Object)new Object[0], (long)2236054145845084993L, (long)l);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @bP
    public void a(bo_0 bo_02) {
        Color color;
        class_310 class_3102;
        CallSite callSite;
        long l;
        long l2;
        long l3;
        long l4;
        long l5;
        long l6;
        long l7;
        long l8;
        long l9;
        long l10;
        block36: {
            long l11 = l10 = k ^ 0x57C7E6D65569L;
            l9 = l11 ^ 0x39CF3709A156L;
            l8 = l11 ^ 0x170DD95A2CEDL;
            l7 = l11 ^ 0x1CDF28AF649CL;
            l6 = l11 ^ 0x3647E00C88CEL;
            l5 = l11 ^ 0x7532212D0594L;
            l4 = l11 ^ 0x7071DD84FB56L;
            l3 = l11 ^ 0x40BCABCBD76CL;
            l2 = l11 ^ 0x709D6BF2C879L;
            l = l11 ^ 0x1668FF648B6FL;
            callSite = e2.b("\u00d5", (long)9051937588071695984L, (long)l10);
            try {
                try {
                    class_3102 = b;
                    if (callSite != null) break block36;
                    if (e2.b("\u00f2", (Object)class_3102, (long)9051504044527695508L, (long)l10) == null) return;
                }
                catch (MatchException matchException) {
                    throw e2.b("\u00d5", (Object)matchException, (long)9049508939333661268L, (long)l10);
                }
                class_3102 = b;
            }
            catch (MatchException matchException) {
                throw e2.b("\u00d5", (Object)matchException, (long)9049508939333661268L, (long)l10);
            }
        }
        try {
            if (e2.b("\u00f2", (Object)class_3102, (long)9044026878764810973L, (long)l10) == null) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw e2.b("\u00d5", (Object)matchException, (long)9049508939333661268L, (long)l10);
        }
        try {
            Object[] objectArray = new Object[1];
            objectArray[0] = l3;
            if (e2.b("L", (Object)this, (Object)objectArray, (long)9050778533289305216L, (long)l10) == false) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw e2.b("\u00d5", (Object)matchException, (long)9049508939333661268L, (long)l10);
        }
        float f = 10.0f;
        CallSite callSite2 = e2.b("L", (Object)((Integer)((Object)e2.b("L", (Object)this.c, (long)9052131767196020741L, (long)l10))), (long)9050181321807627903L, (long)l10);
        CallSite callSite3 = e2.b("L", (Object)((Boolean)((Object)e2.b("L", (Object)this.e, (long)9052131767196020741L, (long)l10))), (long)9051966414322188152L, (long)l10);
        try {
            color = callSite3 != false ? (Color)((Object)e2.b("L", (Object)this.f, (long)9052131767196020741L, (long)l10)) : null;
        }
        catch (MatchException matchException) {
            throw e2.b("\u00d5", (Object)matchException, (long)9049508939333661268L, (long)l10);
        }
        Color color2 = color;
        Object[] objectArray = new Object[1];
        objectArray[0] = l6;
        CallSite callSite4 = e2.b("L", (Object)e2.b("\u00ce", (long)9043772887962049079L, (long)l10), (Object)objectArray, (long)9051271484935599913L, (long)l10);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        CallSite callSite5 = e2.b("L", (Object)callSite4, (Object)objectArray2, (long)9050407167451013680L, (long)l10);
        int n = 0;
        CallSite callSite6 = e2.b("L", (Object)e2.b("L", (Object)this.h, (long)9050688635703792258L, (long)l10), (long)9051135333282598170L, (long)l10);
        while (e2.b("L", (Object)callSite6, (long)9043680014836811148L, (long)l10) != false) {
            CallSite callSite7;
            float f10;
            float f11;
            CallSite callSite8;
            cs_0 cs_02;
            block44: {
                float f12;
                float f13;
                float f14;
                reference var45_35;
                float f15;
                block43: {
                    CallSite callSite9;
                    Object object;
                    CallSite callSite10;
                    block41: {
                        block42: {
                            CallSite callSite11;
                            CallSite callSite12;
                            block40: {
                                reference v19;
                                block39: {
                                    class_1542 class_15422;
                                    block38: {
                                        class_4604 class_46042;
                                        block37: {
                                            Map.Entry entry = (Map.Entry)((Object)e2.b("L", (Object)callSite6, (long)9050908574673215705L, (long)l10));
                                            try {
                                                if (n >= callSite2) {
                                                    return;
                                                }
                                            }
                                            catch (MatchException matchException) {
                                                throw e2.b("\u00d5", (Object)matchException, (long)9049508939333661268L, (long)l10);
                                            }
                                            class_15422 = (class_1542)e2.b("L", (Object)entry, (long)9049979126064318819L, (long)l10);
                                            cs_02 = (cs_0)((Object)e2.b("L", (Object)entry, (long)9050066521676158192L, (long)l10));
                                            try {
                                                if (e2.b("L", (Object)class_15422, (long)9050679956974991233L, (long)l10) != false) {
                                                    continue;
                                                }
                                            }
                                            catch (MatchException matchException) {
                                                throw e2.b("\u00d5", (Object)matchException, (long)9049508939333661268L, (long)l10);
                                            }
                                            try {
                                                try {
                                                    class_46042 = this.g;
                                                    if (callSite != null) break block37;
                                                    if (class_46042 == null) break block38;
                                                }
                                                catch (MatchException matchException) {
                                                    throw e2.b("\u00d5", (Object)matchException, (long)9049508939333661268L, (long)l10);
                                                }
                                                class_46042 = this.g;
                                            }
                                            catch (MatchException matchException) {
                                                throw e2.b("\u00d5", (Object)matchException, (long)9049508939333661268L, (long)l10);
                                            }
                                        }
                                        try {
                                            if (e2.b("L", (Object)class_46042, (Object)e2.b("L", (Object)class_15422, (long)9050277732506087816L, (long)l10), (long)9050995732837181339L, (long)l10) == false) {
                                                continue;
                                            }
                                        }
                                        catch (MatchException matchException) {
                                            throw e2.b("\u00d5", (Object)matchException, (long)9049508939333661268L, (long)l10);
                                        }
                                    }
                                    callSite12 = e2.b("L", (Object)e2.b("\u00f2", (Object)b, (long)9044026878764810973L, (long)l10), (Object)class_15422, (long)9051858785943846336L, (long)l10);
                                    Object[] objectArray3 = new Object[2];
                                    objectArray3[1] = l4;
                                    objectArray3[0] = class_15422;
                                    CallSite callSite13 = e2.b("\u00d5", (Object)objectArray3, (long)9050348427087501228L, (long)l10);
                                    Object[] objectArray4 = new Object[2];
                                    objectArray4[1] = l5;
                                    objectArray4[0] = e2.b("L", (Object)callSite13, (double)0.0, (double)((double)e2.b("L", (Object)class_15422, (long)9051342259271026446L, (long)l10) + 0.4 * (double)(1.0f + callSite12 / 12.0f)), (double)0.0, (long)9043428479091241312L, (long)l10);
                                    callSite10 = e2.b("\u00d5", (Object)objectArray4, (long)9049266158448351481L, (long)l10);
                                    try {
                                        reference v19 = e2.b("\u00f2", (Object)callSite10, (long)9050586001280308297L, (long)l10) - 0.0;
                                        v19 = v19 == 0 ? 0 : (v19 < 0 ? -1 : 1);
                                        if (callSite != null) break block39;
                                        if (v19 < 0) continue;
                                    }
                                    catch (MatchException matchException) {
                                        throw e2.b("\u00d5", (Object)matchException, (long)9049508939333661268L, (long)l10);
                                    }
                                    try {
                                        callSite11 = callSite10;
                                        if (callSite != null) break block40;
                                        reference v19 = e2.b("\u00f2", (Object)callSite11, (long)9050586001280308297L, (long)l10) - 1.0;
                                        v19 = v19 == 0 ? 0 : (v19 > 0 ? 1 : -1);
                                    }
                                    catch (MatchException matchException) {
                                        throw e2.b("\u00d5", (Object)matchException, (long)9049508939333661268L, (long)l10);
                                    }
                                }
                                if (v19 >= 0) continue;
                                ++n;
                                callSite11 = e2.b("L", (Object)this.a, (long)9052131767196020741L, (long)l10);
                            }
                            object = e2.b("L", (Object)((Float)((Object)callSite11)), (long)9049485051876800581L, (long)l10) - callSite12 / 500.0f;
                            try {
                                callSite9 = object;
                                if (callSite != null) break block41;
                                if (!(callSite9 < 0.15f)) break block42;
                            }
                            catch (MatchException matchException) {
                                throw e2.b("\u00d5", (Object)matchException, (long)9049508939333661268L, (long)l10);
                            }
                            object = 0.15f;
                        }
                        Object[] objectArray5 = new Object[2];
                        objectArray5[1] = l7;
                        objectArray5[0] = cs_02.a;
                        callSite9 = e2.b("L", (Object)callSite4, (Object)objectArray5, (long)9049735667806704409L, (long)l10);
                    }
                    callSite8 = callSite9;
                    float f16 = 5.0f;
                    float f17 = 2.0f;
                    f15 = 4.0f;
                    f11 = (float)e2.b("\u00f2", (Object)callSite10, (long)9049155328825804091L, (long)l10) / object;
                    f10 = (float)e2.b("\u00f2", (Object)callSite10, (long)9043246182468937709L, (long)l10) / object;
                    callSite7 = e2.b("L", (Object)new Matrix4f(), (float)object, (float)object, (float)object, (long)9051082450019745996L, (long)l10);
                    var45_35 = callSite8 + 2.0f * f16;
                    f14 = f + 2.0f * f17;
                    f13 = f11 - var45_35 / 2.0f;
                    f12 = f10 - f17;
                    try {
                        try {
                            if (callSite != null) break block43;
                            if (callSite3 == false) break block44;
                        }
                        catch (MatchException matchException) {
                            throw e2.b("\u00d5", (Object)matchException, (long)9049508939333661268L, (long)l10);
                        }
                        Object[] objectArray6 = new Object[10];
                        objectArray6[9] = l8;
                        objectArray6[8] = Float.valueOf(f15);
                        objectArray6[7] = 5;
                        objectArray6[6] = Float.valueOf(f14);
                        objectArray6[5] = Float.valueOf((float)var45_35);
                        objectArray6[4] = Float.valueOf(f12);
                        objectArray6[3] = Float.valueOf(f13);
                        objectArray6[2] = callSite7;
                        objectArray6[1] = bo_02.b;
                        objectArray6[0] = bo_02.a;
                        e2.b("\u00d5", (Object)objectArray6, (long)9049818740936833653L, (long)l10);
                    }
                    catch (MatchException matchException) {
                        throw e2.b("\u00d5", (Object)matchException, (long)9049508939333661268L, (long)l10);
                    }
                }
                Object[] objectArray7 = new Object[10];
                objectArray7[9] = l9;
                objectArray7[8] = Float.valueOf(f15);
                objectArray7[7] = color2;
                objectArray7[6] = Float.valueOf(f14);
                objectArray7[5] = Float.valueOf((float)var45_35);
                objectArray7[4] = Float.valueOf(f12);
                objectArray7[3] = Float.valueOf(f13);
                objectArray7[2] = callSite7;
                objectArray7[1] = bo_02.b;
                objectArray7[0] = bo_02.a;
                e2.b("\u00d5", (Object)objectArray7, (long)9052053387229940635L, (long)l10);
            }
            float f18 = f11 - callSite8 / 2.0f;
            float f19 = f10 + (f - callSite5) / 2.0f;
            Object[] objectArray8 = new Object[6];
            objectArray8[5] = l;
            objectArray8[4] = e2.b("\u00ce", (long)9050513913047065833L, (long)l10);
            objectArray8[3] = Float.valueOf(f19);
            objectArray8[2] = Float.valueOf(f18);
            objectArray8[1] = cs_02.a;
            objectArray8[0] = callSite7;
            e2.b("L", (Object)callSite4, (Object)objectArray8, (long)9043352174858782836L, (long)l10);
            if (callSite == null) continue;
        }
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @bP
    public void a(bG bG2) {
        Map.Entry entry;
        Object object;
        CallSite callSite;
        CallSite callSite2;
        long l;
        block29: {
            CallSite callSite3;
            block26: {
                class_310 class_3102;
                block25: {
                    l = k ^ 0x12EF31BA5F3EL;
                    callSite2 = e2.b("\u00d5", (long)8631628545999309863L, (long)l);
                    try {
                        try {
                            class_3102 = b;
                            if (callSite2 != null) break block25;
                            if (e2.b("\u00f2", (Object)class_3102, (long)8631751013922618563L, (long)l) == null) return;
                        }
                        catch (MatchException matchException) {
                            throw e2.b("\u00d5", (Object)matchException, (long)8629201759192512515L, (long)l);
                        }
                        class_3102 = b;
                    }
                    catch (MatchException matchException) {
                        throw e2.b("\u00d5", (Object)matchException, (long)8629201759192512515L, (long)l);
                    }
                }
                try {
                    callSite3 = e2.b("\u00f2", (Object)class_3102, (long)8634970243345713290L, (long)l);
                    if (callSite2 != null) break block26;
                    if (callSite3 == null) {
                        return;
                    }
                }
                catch (MatchException matchException) {
                    throw e2.b("\u00d5", (Object)matchException, (long)8629201759192512515L, (long)l);
                }
                callSite3 = e2.b("L", (Object)this.d, (long)8631400238278736466L, (long)l);
            }
            reference var5_4 = e2.b("L", (Object)((Float)((Object)callSite3)), (long)8629318675624555026L, (long)l) * e2.b("L", (Object)((Float)((Object)e2.b("L", (Object)this.d, (long)8631400238278736466L, (long)l))), (long)8629318675624555026L, (long)l);
            ArrayList arrayList = new ArrayList();
            callSite = e2.b("L", (Object)e2.b("L", (Object)e2.b("\u00f2", (Object)b, (long)8631751013922618563L, (long)l), (long)8629432001577759522L, (long)l), (long)8631450594566893689L, (long)l);
            while (e2.b("L", (Object)callSite, (long)8635333590550958043L, (long)l) != false) {
                CallSite callSite4;
                CallSite callSite5;
                CallSite callSite6;
                class_1542 class_15422;
                block32: {
                    class_1542 class_15423;
                    block30: {
                        class_1297 class_12972;
                        block27: {
                            class_1297 class_12973 = (class_1297)e2.b("L", (Object)callSite, (long)8632288113844234894L, (long)l);
                            try {
                                block28: {
                                    try {
                                        class_12972 = class_12973;
                                        if (callSite2 != null) break block27;
                                        object = class_12972 instanceof class_1542;
                                        if (callSite2 == null) break block28;
                                        if (!object) return;
                                        entry = (Map.Entry)((Object)e2.b("L", (Object)callSite, (long)8632288113844234894L, (long)l));
                                        e2.b("L", (Object)this.h, (Object)((class_1542)e2.b("L", (Object)entry, (long)8629100536994431796L, (long)l)), (Object)((cs_0)((Object)e2.b("L", (Object)entry, (long)8633135114895072935L, (long)l))), (long)8635183629498875668L, (long)l);
                                        if (callSite2 == null) break block29;
                                        return;
                                    }
                                    catch (MatchException matchException) {
                                        throw e2.b("\u00d5", (Object)matchException, (long)8629201759192512515L, (long)l);
                                    }
                                }
                                if (!object) continue;
                            }
                            catch (MatchException matchException) {
                                throw e2.b("\u00d5", (Object)matchException, (long)8629201759192512515L, (long)l);
                            }
                            class_12972 = class_12973;
                        }
                        class_15422 = (class_1542)class_12972;
                        try {
                            try {
                                class_15423 = class_15422;
                                if (callSite2 != null) break block30;
                                if (e2.b("L", (Object)class_15423, (Object)e2.b("\u00f2", (Object)b, (long)8634970243345713290L, (long)l), (long)8635024653494079587L, (long)l) > (double)var5_4) {
                                    continue;
                                }
                            }
                            catch (MatchException matchException) {
                                throw e2.b("\u00d5", (Object)matchException, (long)8629201759192512515L, (long)l);
                            }
                        }
                        catch (MatchException matchException) {
                            throw e2.b("\u00d5", (Object)matchException, (long)8629201759192512515L, (long)l);
                        }
                        class_15423 = class_15422;
                    }
                    callSite6 = e2.b("L", (Object)class_15423, (long)8631310167469334572L, (long)l);
                    try {
                        callSite5 = callSite6;
                        if (callSite2 != null) break block32;
                        if (callSite5 == null) continue;
                    }
                    catch (MatchException matchException) {
                        throw e2.b("\u00d5", (Object)matchException, (long)8629201759192512515L, (long)l);
                    }
                    callSite5 = callSite6;
                }
                try {
                    if (e2.b("L", (Object)callSite5, (long)8631916763551217094L, (long)l) != false) {
                        continue;
                    }
                }
                catch (MatchException matchException) {
                    throw e2.b("\u00d5", (Object)matchException, (long)8629201759192512515L, (long)l);
                }
                cs_0 cs_02 = new cs_0();
                cs_02.b = callSite6;
                CallSite callSite7 = e2.b("L", (Object)e2.b("L", (Object)callSite6, (long)8631522520097333002L, (long)l), (long)8631956510557367401L, (long)l);
                try {
                    cs_0 cs_03 = cs_02;
                    callSite4 = e2.b("L", (Object)callSite6, (long)8629330784217552105L, (long)l) > 1 ? (String)((Object)callSite7) + e2.l + (int)e2.b("L", (Object)callSite6, (long)8629330784217552105L, (long)l) : callSite7;
                }
                catch (MatchException matchException) {
                    throw e2.b("\u00d5", (Object)matchException, (long)8629201759192512515L, (long)l);
                }
                cs_03.a = callSite4;
                e2.b("L", arrayList, (Object)e2.b("\u00d5", (Object)class_15422, (Object)cs_02, (long)8632035601657091405L, (long)l), (long)8633301417951261152L, (long)l);
                if (callSite2 == null) continue;
            }
            e2.b("L", arrayList, e2::lambda$onTick$1, (long)8633228967259690630L, (long)l);
            this.h = new LinkedHashMap();
            callSite = e2.b("L", arrayList, (long)8629164530858167353L, (long)l);
        }
        do {
            object = e2.b("L", (Object)callSite, (long)8635333590550958043L, (long)l);
            if (!object) return;
            entry = (Map.Entry)((Object)e2.b("L", (Object)callSite, (long)8632288113844234894L, (long)l));
            e2.b("L", (Object)this.h, (Object)((class_1542)e2.b("L", (Object)entry, (long)8629100536994431796L, (long)l)), (Object)((cs_0)((Object)e2.b("L", (Object)entry, (long)8633135114895072935L, (long)l))), (long)8635183629498875668L, (long)l);
        } while (callSite2 == null);
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (e2.n[n3] != null) {
            return n3;
        }
        Object object = m[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 24;
            case 1 -> 11;
            case 2 -> 52;
            case 3 -> 58;
            case 4 -> 61;
            case 5 -> 29;
            case 6 -> 54;
            case 7 -> 8;
            case 8 -> 62;
            case 9 -> 1;
            case 10 -> 12;
            case 11 -> 21;
            case 12 -> 55;
            case 13 -> 19;
            case 14 -> 43;
            case 15 -> 16;
            case 16 -> 45;
            case 17 -> 20;
            case 18 -> 53;
            case 19 -> 25;
            case 20 -> 46;
            case 21 -> 59;
            case 22 -> 15;
            case 23 -> 51;
            case 24 -> 37;
            case 25 -> 10;
            case 26 -> 39;
            case 27 -> 38;
            case 28 -> 6;
            case 29 -> 48;
            case 30 -> 3;
            case 31 -> 49;
            case 32 -> 44;
            case 33 -> 57;
            case 34 -> 31;
            case 35 -> 50;
            case 36 -> 9;
            case 37 -> 30;
            case 38 -> 33;
            case 39 -> 22;
            case 40 -> 32;
            case 41 -> 4;
            case 42 -> 47;
            case 43 -> 41;
            case 44 -> 7;
            case 45 -> 26;
            case 46 -> 0;
            case 47 -> 14;
            case 48 -> 35;
            case 49 -> 13;
            case 50 -> 18;
            case 51 -> 60;
            case 52 -> 27;
            case 53 -> 28;
            case 54 -> 17;
            case 55 -> 56;
            case 56 -> 5;
            case 57 -> 63;
            case 58 -> 23;
            case 59 -> 36;
            case 60 -> 2;
            case 61 -> 40;
            case 62 -> 34;
            default -> 42;
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
        e2.n[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = e2.m(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            String string = e2.n[n];
            int n2 = string.indexOf(8);
            Class clazz = e2.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = e2.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = e2.g(clazz3, string2, clazz2)) != null) {
                    e2.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = e2.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        e2.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = e2.n(313754751736862L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = e2.m(l, l2);
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
                String string2 = e2.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = e2.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = e2.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = e2.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        e2.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = e2.n(313754751736862L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = e2.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        e2.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = e2.n(313754751736862L, 0L);
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

    private boolean lambda$new$0(Color color) {
        long l = k ^ 0x69AA2270C2DEL;
        return (boolean)e2.b("L", (Object)((Boolean)((Object)e2.b("L", (Object)this.e, (long)-1573832645868394574L, (long)l))), (long)-1573949712689125169L, (long)l);
    }

    private static int lambda$onTick$1(Map.Entry entry, Map.Entry entry2) {
        long l = k ^ 0x5778DD3D1DEBL;
        return (int)e2.b("\u00d5", (float)e2.b("L", (Object)e2.b("\u00f2", (Object)b, (long)3819288021563853407L, (long)l), (Object)((class_1297)e2.b("L", (Object)entry2, (long)3825241290328031713L, (long)l)), (long)3827119757031978306L, (long)l), (float)e2.b("L", (Object)e2.b("\u00f2", (Object)b, (long)3819288021563853407L, (long)l), (Object)((class_1297)e2.b("L", (Object)entry, (long)3825241290328031713L, (long)l)), (long)3827119757031978306L, (long)l), (long)3819845218680554117L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(e2.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


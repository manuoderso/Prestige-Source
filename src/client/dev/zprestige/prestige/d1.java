/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2338
 *  net.minecraft.class_2626
 *  net.minecraft.class_3965
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.a5;
import dev.zprestige.prestige.a9;
import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bg_0;
import dev.zprestige.prestige.d0;
import dev.zprestige.prestige.dC;
import dev.zprestige.prestige.dF;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dQ;
import dev.zprestige.prestige.dR;
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
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2338;
import net.minecraft.class_2626;
import net.minecraft.class_3965;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class d1
extends dV
implements dF {
    private dR a;
    private dQ c;
    private dR d;
    private dM e;
    private dM f;
    private dO g;
    public ArrayList h;
    private f5 i;
    private int j;
    public static boolean k;
    private int l;
    private static final long m;
    private static final String[] n;
    private static final String[] o;
    private static final Map p;
    private static final Object[] q;
    private static final String[] r;

    public d1() {
        long l;
        long l2 = l = m ^ 0x132A5CA77A8BL;
        long l3 = l2 ^ 0x67976C691465L;
        long l4 = l2 ^ 0x6FA17F5C03BCL;
        long l5 = l2 ^ 0x32ECC58D7F57L;
        this.h = new ArrayList();
        this.i = new f5(l3);
        this.j = -1;
        this.l = 0;
        Object[] objectArray = new Object[2];
        objectArray[1] = l4;
        objectArray[0] = this::lambda$new$1;
        d1.c("\u00f8", (Object)this.g, (Object)objectArray, (long)-1160213409198345627L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l5;
        objectArray2[0] = this::lambda$new$0;
        d1.c("\u00f8", (Object)this.e, (Object)objectArray2, (long)-1165497004506503346L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                d1.m = hc.a(-2923351630380158903L, -2351157221002514731L, MethodHandles.lookup().lookupClass()).a(247812375885505L);
                d1.q = new Object[181];
                d1.r = new String[181];
                d1.f();
                d1.p = new HashMap<K, V>(13);
                var0 = d1.m ^ 1317146237786L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[6];
                var7_4 = 0;
                var6_5 = "SN\u00db0S\u00c7lu{.@\u007f\u0003#5kZ\u00f5\u00db\u0004\u00c9\u00a2\u00ee& 4)\bz\u001a\u00d0Q\u0010\u00ce\u00f0\u00c0\u008cQS^,x\u00e2\u009b\u000f\u009c\u00c4\u009c\u009d\u0010v\u00a7\\9\u00d7\u009c\u00cb\n\u000f\b\u00d3\u0003\t~\u00b78\u0010\u00b4\u0095\u009e\u00a5\u0085\u00c30\u0090\u00bb\u0003\u008d\u0019\u00e7Q\u00b0\u0094";
                var8_6 = "SN\u00db0S\u00c7lu{.@\u007f\u0003#5kZ\u00f5\u00db\u0004\u00c9\u00a2\u00ee& 4)\bz\u001a\u00d0Q\u0010\u00ce\u00f0\u00c0\u008cQS^,x\u00e2\u009b\u000f\u009c\u00c4\u009c\u009d\u0010v\u00a7\\9\u00d7\u009c\u00cb\n\u000f\b\u00d3\u0003\t~\u00b78\u0010\u00b4\u0095\u009e\u00a5\u0085\u00c30\u0090\u00bb\u0003\u008d\u0019\u00e7Q\u00b0\u0094".length();
                var5_7 = 32;
                var4_8 = -1;
lbl32:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl37:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = d1.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "'EC\u00d0\u00aa\f\u0085\u008c\u00f5R\f\u001di5\u00b6\u0088.\fwl\u0003\u00fe\u00c1\u00ca\u0010\u00f7\u00b3P;3QE*\u0004\u0083\u00b4\u00dc\u0080`e\u00b2";
                    var8_6 = "'EC\u00d0\u00aa\f\u0085\u008c\u00f5R\f\u001di5\u00b6\u0088.\fwl\u0003\u00fe\u00c1\u00ca\u0010\u00f7\u00b3P;3QE*\u0004\u0083\u00b4\u00dc\u0080`e\u00b2".length();
                    var5_7 = 24;
                    var4_8 = -1;
lbl46:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl51:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = d1.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl63:
                // 1 sources

                ** continue;
            }
        }
        d1.n = var9_3;
        d1.o = new String[6];
    }

    @Override
    public void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x7FAB131DDD11L;
        d1.c("\u00f8", (Object)this.h, (long)3982688272634548431L, (long)l);
        this.j = -1;
        k = 0;
        this.l = 0;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = this;
        d1.c("\u00f8", (Object)d1.c("\u00ed", (long)3984667992275369518L, (long)l), (Object)objectArray2, (long)3981357371107442854L, (long)l);
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x33DB;
        if (o[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])p.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    p.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/d1", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d1.n[n2].getBytes("ISO-8859-1");
            d1.o[n2] = d1.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return o[n2];
    }

    @Override
    public boolean b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return (boolean)d1.c("\u00f8", (Object)d1.b("z", (int)23420, (long)(0x36E5DC2EC2697EEBL ^ l)), (Object)d1.c("\u00f8", (Object)this.a, (long)1615889420679255489L, (long)l), (long)1616132474688668081L, (long)l);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/d1" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = d1.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/d1" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = d1.m(l, l2);
            object = q[n];
            try {
                if (!(object instanceof String)) break block2;
                d1.q[n] = clazz = Class.forName(r[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = d1.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = d1.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = d1.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = d1.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = q;
        q[0] = "5W{Y+:#W~\u00038-4\u001c}\u000549%[j\u0012\u007f+\u0019";
        objectArray[1] = "qsH-\u0005&\u0004SC\"\u0014iyKP%\u001d \u0011";
        objectArray[2] = "\u0017\u007f9V3\u0014\u0017\u007f.\n?\u001b\r4.\u0014?\u000e\nE~In";
        objectArray[3] = "\f'\u0016F})\f'\u0001\u001aq&\u0016l\u0001\u0004q3\u0011\u001dP[)";
        objectArray[4] = "\u0013\u001fPV\u0017S\u0013\u001fG\n\u001b\\\tTG\u0014\u001bI\u000e%\u0013LL";
        objectArray[5] = "\u0000)G\u000e@v\u0016)BTSa\u0001bAR_u\u0010%VE\u0014g\u000b";
        objectArray[6] = "M{mS:e8[f\\+*YUmW/p-";
        objectArray[7] = Boolean.TYPE;
        d1.r[7] = "java/lang/Boolean";
        objectArray[8] = "9E\u000f\u0010\r\u0014Le\u0004\u001f\u001c[-k\u000f\u0014\u0018\u0001Y";
        objectArray[9] = "%\u0004W-\u001c!P$\\\"\rn1*W)\t4E";
        objectArray[10] = Integer.TYPE;
        d1.r[10] = "java/lang/Integer";
        objectArray[11] = "$W\u0004K3U2W\u0001\u0011 B%\u001c\u0002\u0017,V4[\u0015\u0000gAq";
        objectArray[12] = "j}q|Gc\u001f]zsV,~SqxRv\n";
        objectArray[13] = Void.TYPE;
        d1.r[13] = "java/lang/Void";
        objectArray[14] = "b=no}cb=y3qlxvy-qy\u007f\u0007.r'";
        objectArray[15] = "/\b@>f^$\u0007Qq\u0005S1\n^\u001a0Q \u0019B6'\\";
        objectArray[16] = "XD<KclXD+\u0017ocB\u000f+\tovE~zW:3";
        objectArray[17] = "dgM\u001a\u0015wdgZF\u0019x~,ZX\u0019my]\u000b\u0006L&";
        objectArray[18] = "\u0004|Y\u0016h)q\\R\u0019yf\u0010RY\u0012}<d";
        objectArray[19] = "6\u0004q\nhe \u0004tP{r7OwVwf&\b`A<s ";
        objectArray[20] = "j\u001a#^]\b\u001f:(QLG~4#ZH\u001d\n";
        objectArray[21] = "\u000fP\u0007\u0015e\u0016\u0019P\u0002Ov\u0001\u000e\u001b\u0001Iz\u0015\u001f\\\u0016^1\u0002/";
        objectArray[22] = "u?z\u0005.]\u0000\u001fq\n?\u0012a\u0011z\u0001;H\u0015";
        objectArray[23] = "lr\u001c\u00040Pzr\u0019^#Gm9\u001aX/S|~\rOdF=";
        objectArray[24] = "R/EZV*'\u000fNUGeF\u0001E^C?2";
        objectArray[25] = "\u001fc\u001d\u00147w\u0014l\f[[t\u001an\u000e\u0014w";
        objectArray[26] = "\u00028DFr%\u00148A\u001ca2\u0003sB\u001am&\u00124U\r&6\u0014";
        objectArray[27] = "~iEf\u0017\t\u000bINi\u0006FjGEb\u0002\u001c\u001e";
        objectArray[28] = "3\u0019Z\u0014wH%\u0019_Nd_2R\\HhK#\u0015K_#[;\u0015ITy\u0016\u0007\u000eIIyQ0\u0019";
        objectArray[29] = "/\rz0kh9\r\u007fjx\u007f.F|ltk?\u0001k{?{~";
        objectArray[30] = "wD\u001e!RS\u0002d\u0015.C\u001ccj\u001e%GF\u0017";
        objectArray[31] = "\"0\u0014]%eW\u0010\u001fR4*6\u001e\u0014Y0pB";
        objectArray[32] = "1F\u0012:C 'F\u0017`P70\r\u0014f\\#!J\u0003q\u00174\u001e";
        objectArray[33] = "d\u001d\u001d C,o\u0012\fo\"\"d\u0019\b5";
        objectArray[34] = "m\u0018\bA\u007fQ\u00188\u0003Nn\u001ey6\bEjD\r";
        objectArray[35] = "\u001fJ.MC\u0001jj%BRN\u000bd.IV\u0014\u007f";
        objectArray[36] = ":8x'>\u001d:8o{2\u0012 soe2\u0007'\u0002>:`L";
        objectArray[37] = "\u0017)f\n\n0\u0017)qV\u0006?\rbqH\u0006*\n\u0013!\u001dQl";
        objectArray[38] = "U1.Vlq \u0011%Y}>A\u001f.Ryd5";
        objectArray[39] = "2EF)DjGeM&U%&kF-Q\u007fR";
        objectArray[40] = "_\u000f!*\u0007\t_\u000f6v\u000b\u0006ED6h\u000b\u0013B5g2XV";
        objectArray[41] = "ara/\u0004`arvs\bo{9vm\bz|H'7Q9";
        objectArray[42] = "\u0012\u0019_X\u001c\u0016\u0004\u0019Z\u0002\u000f\u0001\u0013RY\u0004\u0003\u0015\u0002\u0015N\u0013H\u0004\u0011";
        objectArray[43] = "Pn\bg9J%N\u0003h(\u0005D@\bc,_0";
        objectArray[44] = "a\f&K\"za\f1\u0017.u{G1\t.`|6`Pv%";
        objectArray[45] = "=2\r-d\u0017#:\u0017b\u000b\u0010%2\u0002\u0000#\u0011#";
        objectArray[46] = "rR:b\u00077y]+-z/jZ\"d";
        objectArray[47] = "mm\u000e~>\b{m\u000b$-\u001fl&\b\"!\u000b}a\u001f5j\u001cF";
        objectArray[48] = "\u001akX\u001eI\u0007oKS\u0011XH\u000eEX\u001a\\\u0012z";
        objectArray[49] = "V\u0007uG\u000b @\u0007p\u001d\u00187WLs\u001b\u0014#F\u000bd\f_4\u007f";
        objectArray[50] = "\u001e\u000f${9Ak//t(\u000e\n!$\u007f,T~";
        objectArray[51] = "%Bk7e0Pb`8t\u007f1lk3p%E";
        objectArray[52] = "v <\ny8` 9Pj/wk:Vf;f,-A-,U";
        objectArray[53] = "\u001bKg0y\u007fnkl?h0\u000feg4lj{";
        objectArray[54] = "\u001e>j0Ez\b>ojVm\u001fullZy\u000e2{{\u0011n9";
        objectArray[55] = "<x6B#M<x!\u001e/B&3!\u0000/W!BpX}";
        objectArray[56] = "\u00057lW<@p\u0017gX-\u000f\u0011\u0019lS)Ue";
        objectArray[57] = "Y\u001e-oFYO\u001e(5UNXU+3YZI\u0012<$\u0012J\n";
        objectArray[58] = "k#\u00132G&\u001e\u0003\u0018=Vi\u007f\r\u00136R3\u000b";
        objectArray[59] = "\u0012\rS\f\u0005\t\u0004\rVV\u0016\u001e\u0013FUP\u001a\n\u0002\u0001BGQ\u001d'";
        objectArray[60] = "HO\u007f;\nB=ot4\u001b\r\\a\u007f?\u001fW(";
        objectArray[61] = "8p*Urv&x0\u001a\u0015w7c=@3q";
        objectArray[62] = "%nPE4jPN[J%%1@PA!\u007fE";
        objectArray[63] = Float.TYPE;
        d1.r[63] = "java/lang/Float";
        objectArray[64] = "+9\u000fLP\u0015^\u0019\u0004CAZ?\u0017\u000fHE\u0000K";
        objectArray[65] = "`\b_%p\u000b\u0015(T*aDt&_!e\u001e\u0000";
        objectArray[66] = "Lxq\u0012?YRpk]]EUm";
        objectArray[67] = "x\u000b\u00002\u00118\r+\u000b=\u0000wl%\u00006\u0004-\u0018";
        objectArray[68] = "\u0012]\u00180,\u0019g}\u0013?=V\u0006s\u001849\fr";
        objectArray[69] = " \u001c\u0001\u0007\f\u0007+\u0013\u0010Ho\n>\u0015";
        objectArray[70] = Double.TYPE;
        d1.r[70] = "java/lang/Double";
        objectArray[71] = "U?H;#\u0010 \u001fC42_A\u0011H?6\u00055";
        objectArray[72] = "\u001d$\u001d\u001b=\u0019\u0016+\fTU\u0019\u0018$\u001f";
        objectArray[73] = "nEvB\u0015n\u001be}M\u0004!zkvF\u0000{\u000e";
        objectArray[74] = ";^j47$0Q{{P&%Z{0k";
        objectArray[75] = "nvtpx]xvq*kJo=r,g^~ze;,Ne";
        objectArray[76] = "~\u001e2)\u0004O\u000b>9&\u0015\u0000j02-\u0011Z\u001e";
        objectArray[77] = "rTd.?9\u0007to!.vfzd**,\u0012";
        objectArray[78] = "o\u000bM\n\u001e)\u001a+F\u0005\u000ff{%M\u000e\u000b<\u000f";
        objectArray[79] = "/+2\u0010dNZ\u000b9\u001fu\u0001;\u00052\u0014q[O";
        objectArray[80] = "pPq@\u0004n\u0005pzO\u0015!d~qD\u0011{\u0010";
        objectArray[81] = "Q@>\u0005L\u0006Q@)Y@\tK\u000b)G@\u001cLz{\u0013\u0011]";
        objectArray[82] = "v\rT\u0001A v\rC]M/lFCCM:k7\u0011\u0018\u0015{";
        objectArray[83] = "Ng[FTh;GPIE'ZI[BA}.";
        objectArray[84] = "q6p|'u\u0004\u0016{s6:e\u0018px2`\u0011";
        objectArray[85] = "W,P&KaI$Ji6qI";
        objectArray[86] = "$bV8.cQB]7?,0LV<;vD";
        objectArray[87] = "\u007f|\r\u0016\u0016bi|\bL\u0005u~7\u000bJ\taop\u001c]Bs|";
        objectArray[88] = "Cq\u0012zy\u00196Q\u0019uhVW_\u0012~l\f#";
        objectArray[89] = "{#\u0012I\u00016{#\u0005\u0015\r9ah\u0005\u000b\r,f\u0019TTYo";
        objectArray[90] = "9\u0000w CsL |/R<-.w$VfY";
        objectArray[91] = "n#\u0007:C@\u001b\u0003\f5R\u000fz\r\u0007>VU\u000e";
        objectArray[92] = "K\u001a?\u00113']\u001a:K 0JQ9M,$[\u0016.Zg3y";
        objectArray[93] = "\u001dV2QT#hv9^El\tx2UA6}";
        objectArray[94] = "\u0007FIT\u0006#]DR\u0001JSR~\u0013\u0013\u00021E\u0017\u0012\u001d@-@~\u0013VIc\u0002\u0005L\u001d\u0007,S~";
        objectArray[95] = "qZ.8?\u0015*Rk>Z\u0017)N5m\r@w\u0019m\u0001`\bw]6m'\u001d6R";
        objectArray[96] = "\u0005~V\u0017P\u0015U}M\u0012\"\u0016>5CA@\u0002W4M\u0003\\\u0007>1\u0005\u001eC\u0013Lr\u000e\u0006Ay";
        objectArray[97] = "#Y#7\u001c\u001c+^cKI{u@))[\u0012tNk5^{}Rb'R\u00017C~/ ";
        objectArray[98] = "=I\nUJ^7W\u000e\u0006v\u0003\\\u0015\u001cQ\u0014\u00195\u0014\u0012\u0013\b\u001c\\\u0011Z\u000e\u0017\b.RQ\u0016\u0015b";
        objectArray[99] = "i\u0017]DCQ9\u0014FA1TR\\H\u0012SF;]FPOCRZ\u000bBWM#\u0015\f\u0010M=";
        objectArray[100] = "C-_5\b\"\u0018%\u001a3m \u001b9D`:wEi\u001d\f\u0004sFh\\i\u001c?\u0001k";
        objectArray[101] = "\u001cO1h\u007fUNI}?2$Or5-8F^\u001b4#zZ[r=?sHW\bw.o@%";
        objectArray[102] = "&b@:\u0012\u007f}pI5-q\u0019s\u001cdP(r`\b{P\u0018p~\u0019x\u001dscj\u0006x-";
        objectArray[103] = "%N9Rr\u001f#\u001blHa/|\u0019&d`_`p`\u0018hNv\u0002#\u0013pL\u001c";
        objectArray[104] = "(\u0011$3dFs\u000f,9x9xj$% [j\u0003%+bGoj,7kUc\u0010f&w]\u0011";
        objectArray[105] = "\u0002\u0006%\u0015<\r\u000b\u0006s\u0004A\u0011\t\t-\u0007\u0016ES]tQA\u0014XX5\u0014#C\u0019\u001c1";
        objectArray[106] = "v8xKAn1-9D&g!5'RJUrp~\b&?v,&_T|}4$5";
        objectArray[107] = "o+\u0015L]U49\u001cCbPPjQI\u0000I9k_\u000b\u001cLPbC\u0002\u000e@*(R\u001e\u00062";
        objectArray[108] = "7@,^\u0018oeW~\r\"9[\u0016>\u000f@.2\u00170M\\+[\u0012xPC?)QsHAU";
        objectArray[109] = "L\u0016~~`\u001e\u0017\u001e;x\u0005\u0017\u0018\u0013a i%LR?v\u0005OO\n`-w\fD\u0012bG";
        objectArray[110] = "V,\u001cYMAQ.\u000e\u000bpNC4\u0017S\u001c|\u0017pO\u0004L+V,\u001cYMAQ.\u000e\u000bp";
        objectArray[111] = "\r\u001a\n&\u0011\u0015W\u0018\u0011s]e]\"Pa\u0015\u0007OKQoW\u001bJ\"S ^\u0005WF\u000fb\u0013\b4";
        objectArray[112] = "d#Y\u000eca4 B\u000b\u0011d_hLXsv6iB\u001aos_h\u0001\u0018)o/j[\u0019jl_";
        objectArray[113] = ")V\u0004>\u007fB&\u000e\u0006+\u0007\u0012F\u000bF~e\u0003/\nH<y\u0006F\u000f\u0000!f\u00124L\u000b9dx";
        objectArray[114] = "9\u0011\u0015 e\u0012i\u0012\u000e%\u0017\u0013\u0002Z\u0000vu\u0005k[\u000e4i\u0000\u0002^F)v\u0014p\u001dM1t~";
        objectArray[115] = ")\raMt@jW>Iz0yj:N<Rk\u0003;@~Nnj>\bcQz\u0018}\u0003{S\u0010";
        objectArray[116] = "B~\u000b\u0002\u0001W\u0012}\u0010\u0007sRy5\u001eT\u0011@\u00104\u0010\u0016\rEygRR\u000fD\u001b0\u0013\u0016\u000b;";
        objectArray[117] = "W%!\u0018a{\bnoW0\u0000\u0004\u001ciTgb\u0015uhZ%~\u0010\u001ci\u0017$i\u0005f9Nbn\u0002\u001c";
        objectArray[118] = "is\u0007qDJ`sQ`9Vb|\u000fcn\u0001;)P19S3-\u0017p[\u0004ri\u0013";
        objectArray[119] = "7\u0007\u0018)S'0\u0005\n{n(\"\u001f\u0013#\u0002\u001av[Kz_Mp\\\u0019\"\u001e<?[K8nrp\t\u00154\u001f=w[\u000fDQr%\u0005\u00035\u001euw\u001fs<\n&\"^\u0019;\b4pc";
        objectArray[120] = "\u001dK'UgG@R#UVK\u001aI-\u0003?G#G-\u0013;!@\u0014,\u000f<S\u0003\u001f4\rV";
        objectArray[121] = "\u0017.B=m\u000f\u0005t\u0003>\u0014\u001fg*\u000e}v\r\u000e+\u0000?j\bgcOwn\u000f\u001eq\u00156mv";
        objectArray[122] = "tNKb,1qT\u001e5I'\u0017\u0012\be+6~\u0013\u0006'73\u0017\u0016N:('eUE\"*M";
        objectArray[123] = "m\u000bV\u000eMgh\u0011\u0003Y(r\u000eW\u0015\tJ`gV\u001bKVe\u000eSSVIq|\u0010XNK\u001b";
        objectArray[124] = "\u0015H,X\u0007Q\u0017Z>X\u00026WZ;De\u000fGGx\u0005\u001cS^\u001f=\u0002e\u000fGGx\u0005\u001cS^\u001f=\u0002e";
        objectArray[125] = "p\u0010\b\u0004A\b`\f\u0006\u0002;Wg\u0010\f\bWe3UWW\u000b2q\u001e\u0007\fESr\u0014\u0011\u000e;";
        objectArray[126] = "@{\u00143{\nBi\u00063~m\u0010z\u0002S R\u0000y\u0012)p\u000bF~\u0015S R\u0000y\u0012)p\u000bF~\u0015S";
        objectArray[127] = "i(iaa:2:`n^>Vi-d<&?h#& #Va?/2/,+.3:]";
        objectArray[128] = "%\u0013w8\u0011[/\rsk-\u0003DOa<O\u001c-No~S\u0019DK'cL\r6\b,{Ng";
        objectArray[129] = "Od\u001e\u00133z\bmP\u0000HxUn\t\u000bH\"_r\f\u00032hNn\u0004q";
        objectArray[130] = "E,,u3&I% oY6 !.i%<\u0011},7c_";
        objectArray[131] = "\u001d\u0014UDH\u0005Z\u001d\u001bW3\u0016\u000e\u0016LX^l\u0005MLZP]YO\u0012\u001c3QY\u0016JLA\u0012R\u000eH&";
        objectArray[132] = "00\tx3#`3\u0012}A%\u000b{\u001c.#4bz\u0012l?1\u000b\u007fZq %y<Qi\"O";
        objectArray[133] = "\rp\rT\u0010`R;C\u001bA\u001b]IE\u0018\u0016yO D\u0016TeJIA^Iz^;\u0002UQx4";
        objectArray[134] = "\u0007t*j\u0019(\u00033.~vs\u0012q)r\u001aAF2v*I\u0016\u0007i\"xK|\u0000k0*v";
        objectArray[135] = "+6+\u0013tUdggG\u001b\u0004-vr\u001e`i25|\u0006xXn7\"@\u001bTnnz\u0010i\u0017evxz";
        objectArray[136] = "\"d\u0000]^Byv\tRa@\u001d%DX\u0003^t$J\u001a\u001f[\u001d-V\u0013\rWggG\u000f\u0005%";
        objectArray[137] = "_\u0001EhOi\u0018\b\u000b{4iM\n;l\ng]\u0005\n0\b9\u001bf\u00060QaK\u0014E;Ic!";
        objectArray[138] = "v\"i\u0001jgu(\u007f\u0003\u0014c`,b\u0005xQ7n8Z(\u0006f`>\u001ekd1!z\u001a\u0014";
        objectArray[139] = "4\f\u001e-\u0006+3\b\u001aw\u000e@h\u0019\u001b,\u0004,ZM_u]|\rKX&\u00050|\u0004_t\u001f@";
        objectArray[140] = "SW6b\u001e\b\u0014Bwmy\u0001\u0004Zi{\u00153R\u001d4#@dP\u001cgaF\u000f\u0015Mb{Gd";
        objectArray[141] = "Wa2r!Z_fr\u000ew=\u0001h;4c\u0003Efz\u007f\u001d";
        objectArray[142] = "\u0005\u001cu\u0016y\f^\u00140\u0010\u001c\u000e]\bnCKY\u0003[7/&]M\u0005iKz\u001f\u0000\b";
        objectArray[143] = "1\u0005U`\u0015Sa\u0006NegS\nN@6\u0005DcONt\u0019A\nJ\u0006i\u0006Ux\t\rq\u0004?";
        objectArray[144] = "N\u001a7i\u0015XI\u0018%;(_O\u00035`S2P@;xK\u0003\fBe>(\u000f\f\u001b=nZL\u0007\u0003?\u0004";
        objectArray[145] = "p\u0018\u0013.\u0017ky\u0018E?jw{\u0017\u001b<= \"C@ijr*F\u0003/\b%k\u0002\u0007";
        objectArray[146] = "\u000bPnYi\u0013\u0017EhB\f\u001bf\u0013o\u0005n\t\u000f\u0012aGr\ff\u0013*N<N\u001dLa\u0000s\u001ff";
        objectArray[147] = "/t|\u00166\bha=\u0019Q\nth'\u0004\u0006Z-<yhn[\u007fc3\u0019!\\-y";
        objectArray[148] = "(\u001c*\u0006S9s\u000e#\tl:\u0017]n\u0003\u000e%~\\`A\u0012 \u0017U|H\u0000,m\u001fmT\b^";
        objectArray[149] = "\u00005)\u00137`Dl&\u00142\u001fS\t.To}B`/Z-aG\t.\u0012;b\u0006bkC>x\u0007\t";
        objectArray[150] = "\u0006Hv8Td\u001a]p#1kk\u000bwdS~\u0002\ny&O{k\u0003e/]w\u0011It3U\u0005";
        objectArray[151] = "\u0015H\u0017DTYZ\u0019[\u0010;\u0005\u0003\u000eGf\\\t\u0007u\u0018\u0012Q\u0003\u001a\u0004W\u0015\u0003\u0019j";
        objectArray[152] = "&?\u0004\u0015~`!;\u0000Ov\u000bz*\u0001\u0014|gH~EM';\u001fxB\u001e}{n7ELg\u000b";
        objectArray[153] = "-6\u0015Cho\"n\u0017V\u0010<BkW\u0003r.+jYAn+BcEH|'8)TTtU";
        objectArray[154] = "dT4\u001802#Au\u0017W;3Yk\u0001;\te\u001b7[k^g\u001ar\u000f<$7C4\b;^";
        objectArray[155] = "}2yYxza'\u007fB\u001dw\u0010qx\u0005\u007f`ypvGce\u0010u>Z|qb65B~\u001b";
        objectArray[156] = "k&\u00041\u001f\u001d1zW-Fo<$\u00061J8b\u007f[e&V6t\u00055\u001bQ3=\u0012(";
        objectArray[157] = "\u000fH%z*w\u0005V!)\u0016\"n\u00143~t0\u0007\u0015=<h5n\u0014!!})\u000eS&-zun";
        objectArray[158] = "\b-\fu\u0018<\u000exYo\u000b\fW~\u0018ygj\u000ft\u0014fV6\r*R\u0005";
        objectArray[159] = "*?L`\u0010\u00076*J{u\u000bG|M<\u0017\u001d.}C~\u000b\u0018Gt_w\u0019\u0014=>Nk\u0011f";
        objectArray[160] = "q\u001e7,5\u0006v\u001a3v=m-\u000b2-7\u0001\u001f_vtnPHYq'6\u001d9\u0016vu,m";
        objectArray[161] = "\u00111S\u0001d)Km\u0000\u001d=[F3Q\u00011\f\u0012i\u0005Yd[\u00116\r\u000b=f\u00163D\u001c ";
        objectArray[162] = "RDk8H&\u0015Q*7//\u0005I4!C\u001dS\u000bh{\u0012JQ\n-/D0\u0001Sk(CJ";
        objectArray[163] = ">*z\u000bA.y-v\f\u001dNf\"c>J*z)\u001f_\u001c$a4n\u0010\u001bv{D";
        objectArray[164] = "/t\u000b\t\u001bL%j\u000fZ'\u0019N(\u001d\rE\u000b')\u0013OY\u000eN \u000fFK\u00024j\u001eZCp";
        objectArray[165] = "\u0014a:F%'Hw\u007fF_\u007fv}>\u00009}\u0017a+\u0006\"";
        objectArray[166] = "PPP7R\u0001\u000f\u001b\u001ex\u0003z\u0000i\u0018{T\u0018\u0012\u0000\u0019u\u0016\u0004\u0017i\u00188\u0017\u0013\u0002\u0013HaQ\u0014\u0005i";
        objectArray[167] = "\u0017\u0015\b$B\u0002\u0007\t\u0006\"8]\u0000\u0015\f(ToTPWw\t8\u0015\r\u0007\"\u0005R\u0012\u000f\u0015p8";
        objectArray[168] = "\u0017N<l:H\u0012\u001bgq6uG!=ic\u0017UH<g!\u000bP!9/<\u0014DSz$$\u0016.";
        objectArray[169] = "H,}oWBEyyc.\u00104ze:L\u0002]{kxP\u00074>k>\u0014\u0017N!p}Jy";
        objectArray[170] = "\u0010\u001c\u0013\u000fXHUM\u0016\u0015Y#LK\u0001\u0012\u0000O~\u001fEH]#\u0010\u001c\u0013\u000fXHUM\u0016\u0015Y#\u0010M\u0019KZZLTA\u000e]#";
        objectArray[171] = "M#nF\u007f\u000fG=j\u0015CZ,\u007fxB!HE~v\u0000=M,y;\u0012%C]6<@?3";
        objectArray[172] = "Xg~m.\u0010R?g&_\u001d)cg-=\u000f@bio!\n)+&r%\u0005M!~knt";
        objectArray[173] = "uiU\u0000_nw3TC\\\u001e-$BBTb+\"/\u0001\u0003z<'\u001f\u0007V/&4/";
        objectArray[174] = "\u0007c(DH-W`3A:(<(=\u0012X:U)3PD?<i%CW|Vn'Q\u0005A";
        objectArray[175] = "\u0006\u000e\u007f3\u0010Q\u0002\f4l\b`Q\u0006j`\u0012>V\u0006pdnY\u0000\u001bdb\u0014\tY]cen";
        objectArray[176] = "\u0000_Nr{\u0013KK\u0007dk-^Wum5JEZD17\u0014\u00039Lm0TI\u0007\u0007yyBY9";
        objectArray[177] = "^:\u0013\u0017H\u000bB/\u0015\f-\u00003y\u0012KO\u0011Zx\u001c\tS\u00143q\u0000\u0000A\u0018I;\u0011\u001cIj";
        objectArray[178] = "\nu4'Ba\u000e203-:\u001fp7?A\bK3hh\u0015_Kt.9H4Lp*c@_";
        objectArray[179] = "9\u0019o\r\u0014\"3\u0007k^(tXEy\tJe1DwKV`XEkVC|8\u0002lZD X";
        Object[] objectArray2 = objectArray;
        objectArray[180] = "\u0012Z({\u001b\u0001H\u0006{gBsEX*{N$\u001b\t\u007f&\"JO\b)\u007f\u001fMJA>b";
    }

    /*
     * Exception decompiling
     */
    private void l(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 19[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    public void d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x52D6E774439DL;
        this.j = -1;
        k = 0;
        this.l = 0;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = this;
        d1.c("\u00f8", (Object)d1.c("\u00ed", (long)3255884750214865997L, (long)l), (Object)objectArray2, (long)3252086106766599939L, (long)l);
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = d1.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f5' || c == '\u00c7' || c == '\u00ed' || c == 'B') {
                field = d1.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f5' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c7' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ed' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = d1.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f8' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00eb' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
    public void a(bg_0 bg_02) {
        block12: {
            CallSite callSite;
            class_2626 class_26262;
            long l;
            block13: {
                CallSite callSite2;
                CallSite callSite3;
                block11: {
                    l = m ^ 0x63474ED7C9E2L;
                    CallSite callSite4 = d1.c("\u00f8", (Object)bg_02, (Object)new Object[0], (long)6682033528760060388L, (long)l);
                    callSite3 = d1.c("\u00eb", (long)6679535177946796975L, (long)l);
                    try {
                        try {
                            callSite2 = callSite4;
                            if (callSite3 != null) break block11;
                            if (!(callSite2 instanceof class_2626)) break block12;
                        }
                        catch (MatchException matchException) {
                            throw d1.c("\u00eb", (Object)matchException, (long)6667764938682647948L, (long)l);
                        }
                        callSite2 = callSite4;
                    }
                    catch (MatchException matchException) {
                        throw d1.c("\u00eb", (Object)matchException, (long)6667764938682647948L, (long)l);
                    }
                }
                class_26262 = (class_2626)callSite2;
                try {
                    try {
                        callSite = d1.c("\u00f8", (Object)class_26262, (long)6669378860668420060L, (long)l);
                        if (callSite3 != null) break block13;
                        if (callSite == null) break block12;
                    }
                    catch (MatchException matchException) {
                        throw d1.c("\u00eb", (Object)matchException, (long)6667764938682647948L, (long)l);
                    }
                    callSite = d1.c("\u00f8", (Object)class_26262, (long)6669378860668420060L, (long)l);
                }
                catch (MatchException matchException) {
                    throw d1.c("\u00eb", (Object)matchException, (long)6667764938682647948L, (long)l);
                }
            }
            try {
                if (d1.c("\u00f8", (Object)callSite, (long)6679847338409374802L, (long)l) != d1.c("\u00ed", (long)6668537525902045851L, (long)l)) {
                    d1.c("\u00f8", (Object)this.h, (Object)d1.c("\u00f8", (Object)class_26262, (long)6681301409134326977L, (long)l), (long)6679384334793436929L, (long)l);
                }
            }
            catch (MatchException matchException) {
                throw d1.c("\u00eb", (Object)matchException, (long)6667764938682647948L, (long)l);
            }
        }
    }

    @bP
    public void a(a9 a92) {
        long l = m ^ 0x73900F6E20C4L;
        long l2 = l ^ 0x1B47B4C4D2BEL;
        try {
            Object[] objectArray = new Object[1];
            objectArray[0] = l2;
            if (d1.c("\u00eb", (Object)objectArray, (long)-5355915973922886058L, (long)l) != false) {
                d1.c("\u00f8", (Object)a92, (Object)new Object[0], (long)-5354922478511560268L, (long)l);
            }
        }
        catch (MatchException matchException) {
            throw d1.c("\u00eb", (Object)matchException, (long)-5355140368482292566L, (long)l);
        }
    }

    @bP
    public void a(a5 a52) {
        long l = m ^ 0x2E0DF9B40A1L;
        d1.c("\u00f8", (Object)this.h, (long)-3030324459321691528L, (long)l);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public dC a(Object[] objectArray) {
        CallSite callSite;
        void var35_23;
        class_2338 class_23382;
        long l;
        long l2;
        long l3;
        long l4;
        block112: {
            CallSite callSite2;
            CallSite callSite3;
            long l5;
            long l6;
            block111: {
                void v49;
                CallSite callSite4;
                long l7;
                block110: {
                    CallSite callSite5;
                    block101: {
                        block108: {
                            block109: {
                                long l8;
                                long l9;
                                long l10;
                                long l11;
                                long l12;
                                block97: {
                                    CallSite callSite6;
                                    block98: {
                                        CallSite callSite7;
                                        long l13;
                                        long l14;
                                        long l15;
                                        block96: {
                                            Object object;
                                            block94: {
                                                block95: {
                                                    block92: {
                                                        block93: {
                                                            block90: {
                                                                block91: {
                                                                    block88: {
                                                                        long l16;
                                                                        block89: {
                                                                            block86: {
                                                                                block87: {
                                                                                    l4 = (Long)objectArray[0];
                                                                                    long l17 = l4;
                                                                                    l12 = l17 ^ 0x4D6B5F93A658L;
                                                                                    l3 = l17 ^ 0x1A99A2A6F024L;
                                                                                    l15 = l17 ^ 0x2BC50C43F188L;
                                                                                    l14 = l17 ^ 0x1CAEC35E43E4L;
                                                                                    l2 = l17 ^ 0x7C6037A2A158L;
                                                                                    l = l17 ^ 0x4A420820CD38L;
                                                                                    l7 = l17 ^ 0x6A372CEC5E83L;
                                                                                    l11 = l17 ^ 0x6CCF45119AEL;
                                                                                    l10 = l17 ^ 0xB6A87586E7L;
                                                                                    l13 = l17 ^ 0x2155FA009A7L;
                                                                                    l9 = l17 ^ 0x449CCBE402BEL;
                                                                                    l16 = l17 ^ 0x1E12C5EE8DD4L;
                                                                                    l6 = l17 ^ 0x67CB372F24A5L;
                                                                                    l5 = l17 ^ 0x7C64BD1022D1L;
                                                                                    l8 = l17 ^ 0x5C9A0C609185L;
                                                                                    callSite3 = d1.c("\u00eb", (long)-1181572287130951545L, (long)l4);
                                                                                    try {
                                                                                        try {
                                                                                            object = d1.c("\u00f8", (Object)((Boolean)((Object)d1.c("\u00f8", (Object)this.f, (long)-1181643519271244748L, (long)l4))), (long)-1177862867104377862L, (long)l4);
                                                                                            if (callSite3 != null) break block86;
                                                                                            if (object != false) break block87;
                                                                                            return null;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw d1.c("\u00eb", (Object)matchException, (long)-1179688585010841948L, (long)l4);
                                                                                        }
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw d1.c("\u00eb", (Object)matchException, (long)-1179688585010841948L, (long)l4);
                                                                                    }
                                                                                }
                                                                                object = d1.c("\u00f8", (Object)d1.c("\u00f5", (Object)b, (long)-1175799181037399646L, (long)l4), (long)-1178821266056765817L, (long)l4);
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    if (callSite3 != null) break block88;
                                                                                    if (object == false) break block89;
                                                                                    return null;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw d1.c("\u00eb", (Object)matchException, (long)-1179688585010841948L, (long)l4);
                                                                                }
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw d1.c("\u00eb", (Object)matchException, (long)-1179688585010841948L, (long)l4);
                                                                            }
                                                                        }
                                                                        Object[] objectArray2 = new Object[2];
                                                                        objectArray2[1] = l16;
                                                                        objectArray2[0] = this.c;
                                                                        object = d1.c("\u00f8", (Object)this.i, (Object)objectArray2, (long)-1178465474416211818L, (long)l4);
                                                                    }
                                                                    try {
                                                                        try {
                                                                            if (callSite3 != null) break block90;
                                                                            if (object != false) break block91;
                                                                            return null;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw d1.c("\u00eb", (Object)matchException, (long)-1179688585010841948L, (long)l4);
                                                                        }
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw d1.c("\u00eb", (Object)matchException, (long)-1179688585010841948L, (long)l4);
                                                                    }
                                                                }
                                                                object = d1.c("\u00f8", (Object)d1.c("\u00ed", (long)-1184435398725409038L, (long)l4), (Object)new Object[0], (long)-1180020496982953980L, (long)l4);
                                                            }
                                                            try {
                                                                try {
                                                                    if (callSite3 != null) break block92;
                                                                    if (object == false) break block93;
                                                                    return null;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw d1.c("\u00eb", (Object)matchException, (long)-1179688585010841948L, (long)l4);
                                                                }
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw d1.c("\u00eb", (Object)matchException, (long)-1179688585010841948L, (long)l4);
                                                            }
                                                        }
                                                        object = d1.c("\u00eb", (Object)new Object[0], (long)-1179303866988022306L, (long)l4);
                                                    }
                                                    try {
                                                        try {
                                                            if (callSite3 != null) break block94;
                                                            if (object == false) break block95;
                                                            return null;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw d1.c("\u00eb", (Object)matchException, (long)-1179688585010841948L, (long)l4);
                                                        }
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw d1.c("\u00eb", (Object)matchException, (long)-1179688585010841948L, (long)l4);
                                                    }
                                                }
                                                object = d0.C;
                                            }
                                            try {
                                                if (object != false) {
                                                    return null;
                                                }
                                            }
                                            catch (MatchException matchException) {
                                                throw d1.c("\u00eb", (Object)matchException, (long)-1179688585010841948L, (long)l4);
                                            }
                                            CallSite callSite8 = d1.c("\u00f5", (Object)b, (long)-1181357337700336828L, (long)l4);
                                            try {
                                                try {
                                                    callSite7 = callSite8;
                                                    if (callSite3 != null) break block96;
                                                    if (!(callSite7 instanceof class_3965)) break block97;
                                                }
                                                catch (MatchException matchException) {
                                                    throw d1.c("\u00eb", (Object)matchException, (long)-1179688585010841948L, (long)l4);
                                                }
                                                callSite7 = callSite8;
                                            }
                                            catch (MatchException matchException) {
                                                throw d1.c("\u00eb", (Object)matchException, (long)-1179688585010841948L, (long)l4);
                                            }
                                        }
                                        class_3965 class_39652 = (class_3965)callSite7;
                                        try {
                                            block99: {
                                                try {
                                                    try {
                                                        try {
                                                            Object[] objectArray3 = new Object[2];
                                                            objectArray3[1] = l13;
                                                            objectArray3[0] = class_39652;
                                                            callSite6 = d1.c("\u00eb", (Object)objectArray3, (long)-1181439877999974939L, (long)l4);
                                                            if (callSite3 != null) break block98;
                                                            if (callSite6 == false) break block99;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw d1.c("\u00eb", (Object)matchException, (long)-1179688585010841948L, (long)l4);
                                                        }
                                                        Object[] objectArray4 = new Object[2];
                                                        objectArray4[1] = l15;
                                                        objectArray4[0] = class_39652;
                                                        Object[] objectArray5 = new Object[2];
                                                        objectArray5[1] = l10;
                                                        objectArray5[0] = d1.c("\u00eb", (Object)objectArray4, (long)-1183627670271256005L, (long)l4);
                                                        callSite6 = d1.c("\u00eb", (Object)objectArray5, (long)-1179558432112430916L, (long)l4);
                                                        if (callSite3 != null) break block98;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw d1.c("\u00eb", (Object)matchException, (long)-1179688585010841948L, (long)l4);
                                                    }
                                                    if (callSite6 == false) return null;
                                                }
                                                catch (MatchException matchException) {
                                                    throw d1.c("\u00eb", (Object)matchException, (long)-1179688585010841948L, (long)l4);
                                                }
                                            }
                                            Object[] objectArray6 = new Object[3];
                                            objectArray6[2] = l14;
                                            objectArray6[1] = d1.c("\u00ed", (long)-1179054604803685965L, (long)l4);
                                            objectArray6[0] = d1.c("\u00f8", (Object)class_39652, (long)-1181954207357700502L, (long)l4);
                                            callSite6 = d1.c("\u00eb", (Object)objectArray6, (long)-1182073531590283720L, (long)l4);
                                        }
                                        catch (MatchException matchException) {
                                            throw d1.c("\u00eb", (Object)matchException, (long)-1179688585010841948L, (long)l4);
                                        }
                                    }
                                    try {
                                        if (callSite6 != false) {
                                            return null;
                                        }
                                    }
                                    catch (MatchException matchException) {
                                        throw d1.c("\u00eb", (Object)matchException, (long)-1179688585010841948L, (long)l4);
                                    }
                                }
                                Object var35_22 = null;
                                Object object = Double.MAX_VALUE;
                                Object[] objectArray7 = new Object[3];
                                objectArray7[2] = l9;
                                objectArray7[1] = d1::lambda$calculate$2;
                                objectArray7[0] = 5;
                                callSite4 = d1.c("\u00f8", (Object)d1.c("\u00eb", (Object)objectArray7, (long)-1178450620686606286L, (long)l4), (long)-1183843531963431540L, (long)l4);
                                while (d1.c("\u00f8", (Object)callSite4, (long)-1179764965092933891L, (long)l4) != false) {
                                    block107: {
                                        CallSite callSite9;
                                        CallSite callSite10;
                                        block106: {
                                            reference var43_30;
                                            reference var42_29;
                                            block105: {
                                                CallSite callSite11;
                                                block104: {
                                                    CallSite callSite12;
                                                    block103: {
                                                        CallSite callSite13;
                                                        CallSite callSite14;
                                                        block102: {
                                                            CallSite callSite15;
                                                            block100: {
                                                                class_23382 = (class_2338)d1.c("\u00f8", (Object)callSite4, (long)-1180259525015619205L, (long)l4);
                                                                try {
                                                                    try {
                                                                        callSite15 = d1.c("\u00f8", (Object)class_23382, (long)-1179148163793031278L, (long)l4);
                                                                        if (callSite3 != null) break block100;
                                                                        Object[] objectArray8 = new Object[2];
                                                                        objectArray8[1] = l10;
                                                                        objectArray8[0] = callSite15;
                                                                        callSite5 = d1.c("\u00eb", (Object)objectArray8, (long)-1179558432112430916L, (long)l4);
                                                                        if (callSite3 != null) break block101;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw d1.c("\u00eb", (Object)matchException, (long)-1179688585010841948L, (long)l4);
                                                                    }
                                                                    if (callSite5 != false) {
                                                                        continue;
                                                                    }
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw d1.c("\u00eb", (Object)matchException, (long)-1179688585010841948L, (long)l4);
                                                                }
                                                                callSite15 = class_23382;
                                                            }
                                                            Object[] objectArray9 = new Object[2];
                                                            objectArray9[1] = l12;
                                                            objectArray9[0] = callSite15;
                                                            callSite14 = d1.c("\u00eb", (Object)objectArray9, (long)-1181036599317779715L, (long)l4);
                                                            try {
                                                                callSite13 = callSite14;
                                                                if (callSite3 != null) break block102;
                                                                if (callSite13 == null) {
                                                                    continue;
                                                                }
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw d1.c("\u00eb", (Object)matchException, (long)-1179688585010841948L, (long)l4);
                                                            }
                                                            callSite13 = d1.c("\u00f8", (Object)d1.c("\u00f5", (Object)b, (long)-1175799181037399646L, (long)l4), (long)-1181561486630752697L, (long)l4);
                                                        }
                                                        try {
                                                            if (d1.c("\u00f8", (Object)callSite13, (Object)callSite14, (long)-1183336761230411311L, (long)l4) > 4.4) {
                                                                continue;
                                                            }
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw d1.c("\u00eb", (Object)matchException, (long)-1179688585010841948L, (long)l4);
                                                        }
                                                        Object[] objectArray10 = new Object[2];
                                                        objectArray10[1] = l8;
                                                        objectArray10[0] = callSite14;
                                                        callSite10 = d1.c("\u00f8", (Object)d1.c("\u00ed", (long)-1184435398725409038L, (long)l4), (Object)objectArray10, (long)-1180507564580523113L, (long)l4);
                                                        Object[] objectArray11 = new Object[3];
                                                        objectArray11[2] = l11;
                                                        objectArray11[1] = callSite14;
                                                        objectArray11[0] = callSite10;
                                                        callSite10 = d1.c("\u00eb", (Object)objectArray11, (long)-1175776046576726840L, (long)l4);
                                                        var42_29 = d1.c("\u00f8", (Object)callSite10, (Object)new Object[0], (long)-1184232247764359912L, (long)l4) - d1.c("\u00f8", (Object)d1.c("\u00f5", (Object)b, (long)-1175799181037399646L, (long)l4), (long)-1180000623905871555L, (long)l4);
                                                        var43_30 = d1.c("\u00f8", (Object)callSite10, (Object)new Object[0], (long)-1178748312303884802L, (long)l4) - d1.c("\u00f8", (Object)d1.c("\u00f5", (Object)b, (long)-1175799181037399646L, (long)l4), (long)-1183924272152837682L, (long)l4);
                                                        try {
                                                            if (d1.c("\u00eb", (float)var42_29, (long)-1178004698090141670L, (long)l4) > d1.c("\u00f8", (Object)((Float)((Object)d1.c("\u00f8", (Object)this.g, (long)-1181643519271244748L, (long)l4))), (long)-1183719246786603190L, (long)l4)) {
                                                                continue;
                                                            }
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw d1.c("\u00eb", (Object)matchException, (long)-1179688585010841948L, (long)l4);
                                                        }
                                                        Object[] objectArray12 = new Object[2];
                                                        objectArray12[1] = l7;
                                                        objectArray12[0] = callSite10;
                                                        CallSite callSite16 = d1.c("\u00eb", (Object)objectArray12, (long)-1179202826359648845L, (long)l4);
                                                        try {
                                                            callSite12 = callSite16;
                                                            if (callSite3 != null) break block103;
                                                            if (!(callSite12 instanceof class_3965)) continue;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw d1.c("\u00eb", (Object)matchException, (long)-1179688585010841948L, (long)l4);
                                                        }
                                                        callSite12 = callSite16;
                                                    }
                                                    class_3965 class_39653 = (class_3965)callSite12;
                                                    try {
                                                        try {
                                                            callSite11 = d1.c("\u00f8", (Object)d1.c("\u00f8", (Object)class_39653, (long)-1181954207357700502L, (long)l4), (Object)class_23382, (long)-1180668464118938931L, (long)l4);
                                                            if (callSite3 != null) break block104;
                                                            if (callSite11 != false) break block105;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw d1.c("\u00eb", (Object)matchException, (long)-1179688585010841948L, (long)l4);
                                                        }
                                                        callSite11 = d1.c("\u00f8", (Object)d1.c("\u00f8", (Object)d1.c("\u00f8", (Object)class_39653, (long)-1181954207357700502L, (long)l4), (long)-1179148163793031278L, (long)l4), (Object)class_23382, (long)-1180668464118938931L, (long)l4);
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw d1.c("\u00eb", (Object)matchException, (long)-1179688585010841948L, (long)l4);
                                                    }
                                                }
                                                if (callSite11 == false) continue;
                                            }
                                            CallSite callSite17 = d1.c("\u00eb", (double)((double)(var42_29 * var42_29 + var43_30 * var43_30)), (long)-1178133869425820607L, (long)l4);
                                            try {
                                                try {
                                                    callSite9 = callSite17;
                                                    if (callSite3 != null) break block106;
                                                    if (!(callSite9 < object)) break block107;
                                                }
                                                catch (MatchException matchException) {
                                                    throw d1.c("\u00eb", (Object)matchException, (long)-1179688585010841948L, (long)l4);
                                                }
                                                callSite9 = callSite17;
                                            }
                                            catch (MatchException matchException) {
                                                throw d1.c("\u00eb", (Object)matchException, (long)-1179688585010841948L, (long)l4);
                                            }
                                        }
                                        object = callSite9;
                                        CallSite callSite18 = callSite10;
                                    }
                                    if (callSite3 == null) continue;
                                }
                                try {
                                    try {
                                        v49 = var35_23;
                                        if (callSite3 != null) break block108;
                                        if (v49 != null) break block109;
                                        return null;
                                    }
                                    catch (MatchException matchException) {
                                        throw d1.c("\u00eb", (Object)matchException, (long)-1179688585010841948L, (long)l4);
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw d1.c("\u00eb", (Object)matchException, (long)-1179688585010841948L, (long)l4);
                                }
                            }
                            v49 = var35_23;
                        }
                        try {
                            if (callSite3 != null) break block110;
                            callSite5 = d1.c("\u00f8", (Object)v49, (Object)new Object[0], (long)-1182140100297869797L, (long)l4);
                        }
                        catch (MatchException matchException) {
                            throw d1.c("\u00eb", (Object)matchException, (long)-1179688585010841948L, (long)l4);
                        }
                    }
                    try {
                        if (callSite5 != false) {
                            return var35_23;
                        }
                    }
                    catch (MatchException matchException) {
                        throw d1.c("\u00eb", (Object)matchException, (long)-1179688585010841948L, (long)l4);
                    }
                    v49 = var35_23;
                }
                Object[] objectArray13 = new Object[2];
                objectArray13[1] = l7;
                objectArray13[0] = v49;
                callSite4 = d1.c("\u00eb", (Object)objectArray13, (long)-1179202826359648845L, (long)l4);
                try {
                    try {
                        callSite2 = callSite4;
                        if (callSite3 != null) break block111;
                        if (!(callSite2 instanceof class_3965)) return var35_23;
                    }
                    catch (MatchException matchException) {
                        throw d1.c("\u00eb", (Object)matchException, (long)-1179688585010841948L, (long)l4);
                    }
                    callSite2 = callSite4;
                }
                catch (MatchException matchException) {
                    throw d1.c("\u00eb", (Object)matchException, (long)-1179688585010841948L, (long)l4);
                }
            }
            class_23382 = (class_3965)callSite2;
            try {
                if (callSite3 != null) {
                    return var35_23;
                }
            }
            catch (MatchException matchException) {
                throw d1.c("\u00eb", (Object)matchException, (long)-1179688585010841948L, (long)l4);
            }
            try {
                try {
                    Object[] objectArray14 = new Object[2];
                    objectArray14[1] = l6;
                    objectArray14[0] = d1.c("\u00f8", (Object)class_23382, (long)-1181954207357700502L, (long)l4);
                    callSite = d1.c("\u00eb", (Object)objectArray14, (long)-1177797416698891374L, (long)l4);
                    if (callSite3 != null) break block112;
                    if (callSite != false) return var35_23;
                }
                catch (MatchException matchException) {
                    throw d1.c("\u00eb", (Object)matchException, (long)-1179688585010841948L, (long)l4);
                }
                Object[] objectArray15 = new Object[2];
                objectArray15[1] = l5;
                objectArray15[0] = d1.c("\u00f8", (Object)class_23382, (long)-1181954207357700502L, (long)l4);
                callSite = d1.c("\u00eb", (Object)objectArray15, (long)-1177716250783329593L, (long)l4);
            }
            catch (MatchException matchException) {
                throw d1.c("\u00eb", (Object)matchException, (long)-1179688585010841948L, (long)l4);
            }
        }
        try {
            if (callSite != false) {
                return var35_23;
            }
        }
        catch (MatchException matchException) {
            throw d1.c("\u00eb", (Object)matchException, (long)-1179688585010841948L, (long)l4);
        }
        Object[] objectArray16 = new Object[2];
        objectArray16[1] = l;
        objectArray16[0] = class_23382;
        d1.c("\u00f8", (Object)this, (Object)objectArray16, (long)-1178082464535062316L, (long)l4);
        Object[] objectArray17 = new Object[1];
        objectArray17[0] = l3;
        d1.c("\u00f8", (Object)this.i, (Object)objectArray17, (long)-1180175555783526577L, (long)l4);
        Object[] objectArray18 = new Object[1];
        objectArray18[0] = l2;
        d1.c("\u00f8", (Object)this.c, (Object)objectArray18, (long)-1179876130558522542L, (long)l4);
        return var35_23;
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return d1.c("\u00eb", (Object)((Object)q_0.Crystal), (long)-2437505645592739617L, (long)l);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @bP
    public void a(bG var1_1) {
        block121: {
            block122: {
                block119: {
                    block120: {
                        block118: {
                            block117: {
                                block116: {
                                    block115: {
                                        block114: {
                                            block113: {
                                                block111: {
                                                    block112: {
                                                        block110: {
                                                            block109: {
                                                                block108: {
                                                                    block107: {
                                                                        block105: {
                                                                            block106: {
                                                                                block99: {
                                                                                    block100: {
                                                                                        block97: {
                                                                                            block98: {
                                                                                                block95: {
                                                                                                    block96: {
                                                                                                        block93: {
                                                                                                            block94: {
                                                                                                                block92: {
                                                                                                                    block91: {
                                                                                                                        block89: {
                                                                                                                            block90: {
                                                                                                                                block87: {
                                                                                                                                    block88: {
                                                                                                                                        block85: {
                                                                                                                                            block86: {
                                                                                                                                                block84: {
                                                                                                                                                    block83: {
                                                                                                                                                        block82: {
                                                                                                                                                            block81: {
                                                                                                                                                                v0 = var2_2 = d1.m ^ 109416702420525L;
                                                                                                                                                                var4_3 = v0 ^ 87872852974080L;
                                                                                                                                                                var6_4 = v0 ^ 24250073058674L;
                                                                                                                                                                var8_5 = v0 ^ 84973947868480L;
                                                                                                                                                                var10_6 = v0 ^ 6986724990114L;
                                                                                                                                                                var12_7 = v0 ^ 86522962780305L;
                                                                                                                                                                var14_8 = v0 ^ 89400074883379L;
                                                                                                                                                                var16_9 = v0 ^ 38300036655401L;
                                                                                                                                                                var18_10 = v0 ^ 44628492777538L;
                                                                                                                                                                var20_11 = v0 ^ 56321706196534L;
                                                                                                                                                                var22_12 = v0 ^ 110607656922479L;
                                                                                                                                                                var24_13 = v0 ^ 92303494749955L;
                                                                                                                                                                var26_14 = v0 ^ 29022114989574L;
                                                                                                                                                                var28_15 = d1.c("\u00eb", (long)-5513117198886405024L, (long)var2_2);
                                                                                                                                                                try {
                                                                                                                                                                    try {
                                                                                                                                                                        v1 = d1.c("\u00f5", (Object)d1.b, (long)-5527614929747030715L, (long)var2_2);
                                                                                                                                                                        if (var28_15 != null) break block81;
                                                                                                                                                                        if (v1 == null) break block82;
                                                                                                                                                                    }
                                                                                                                                                                    catch (MatchException v2) {
                                                                                                                                                                        throw d1.c("\u00eb", (Object)v2, (long)-5528265133618222525L, (long)var2_2);
                                                                                                                                                                    }
                                                                                                                                                                    v1 = d1.c("\u00f5", (Object)d1.b, (long)-5527614929747030715L, (long)var2_2);
                                                                                                                                                                }
                                                                                                                                                                catch (MatchException v3) {
                                                                                                                                                                    throw d1.c("\u00eb", (Object)v3, (long)-5528265133618222525L, (long)var2_2);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            try {
                                                                                                                                                                try {
                                                                                                                                                                    v4 = d1.c("\u00f5", (Object)v1, (long)-5513823299625930040L, (long)var2_2);
                                                                                                                                                                    if (var28_15 != null) break block83;
                                                                                                                                                                    if (v4 > this.l) break block82;
                                                                                                                                                                }
                                                                                                                                                                catch (MatchException v5) {
                                                                                                                                                                    throw d1.c("\u00eb", (Object)v5, (long)-5528265133618222525L, (long)var2_2);
                                                                                                                                                                }
                                                                                                                                                                v4 = 1;
                                                                                                                                                                break block83;
                                                                                                                                                            }
                                                                                                                                                            catch (MatchException v6) {
                                                                                                                                                                throw d1.c("\u00eb", (Object)v6, (long)-5528265133618222525L, (long)var2_2);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        v4 = false;
                                                                                                                                                    }
                                                                                                                                                    try {
                                                                                                                                                        try {
                                                                                                                                                            d1.k = v4;
                                                                                                                                                            v7 = d1.b;
                                                                                                                                                            if (var28_15 != null) break block84;
                                                                                                                                                            if (d1.c("\u00f5", (Object)v7, (long)-5528393833281862381L, (long)var2_2) != null) break block85;
                                                                                                                                                        }
                                                                                                                                                        catch (MatchException v8) {
                                                                                                                                                            throw d1.c("\u00eb", (Object)v8, (long)-5528265133618222525L, (long)var2_2);
                                                                                                                                                        }
                                                                                                                                                        v7 = d1.b;
                                                                                                                                                    }
                                                                                                                                                    catch (MatchException v9) {
                                                                                                                                                        throw d1.c("\u00eb", (Object)v9, (long)-5528265133618222525L, (long)var2_2);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                try {
                                                                                                                                                    try {
                                                                                                                                                        v10 /* !! */  = d1.c("\u00f8", (Object)v7, (long)-5528918410884716036L, (long)var2_2);
                                                                                                                                                        if (var28_15 != null) break block86;
                                                                                                                                                        if (v10 /* !! */  == false) break block85;
                                                                                                                                                    }
                                                                                                                                                    catch (MatchException v11) {
                                                                                                                                                        throw d1.c("\u00eb", (Object)v11, (long)-5528265133618222525L, (long)var2_2);
                                                                                                                                                    }
                                                                                                                                                    v10 /* !! */  = d1.c("\u00f8", (Object)d1.c("\u00f5", (Object)d1.b, (long)-5527614929747030715L, (long)var2_2), (long)-5529097561046465952L, (long)var2_2);
                                                                                                                                                }
                                                                                                                                                catch (MatchException v12) {
                                                                                                                                                    throw d1.c("\u00eb", (Object)v12, (long)-5528265133618222525L, (long)var2_2);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            try {
                                                                                                                                                if (var28_15 != null) break block87;
                                                                                                                                                if (v10 /* !! */  == false) break block88;
                                                                                                                                            }
                                                                                                                                            catch (MatchException v13) {
                                                                                                                                                throw d1.c("\u00eb", (Object)v13, (long)-5528265133618222525L, (long)var2_2);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    v10 /* !! */  = d1.c("\u00f8", (Object)d1.c("\u00ed", (long)-5514863238945654251L, (long)var2_2), (Object)new Object[0], (long)-5514386430631285533L, (long)var2_2);
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    if (var28_15 != null) break block89;
                                                                                                                                    if (v10 /* !! */  == false) break block90;
                                                                                                                                }
                                                                                                                                catch (MatchException v14) {
                                                                                                                                    throw d1.c("\u00eb", (Object)v14, (long)-5528265133618222525L, (long)var2_2);
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            v10 /* !! */  = (CallSite)ei_0.R;
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            if (var28_15 != null) break block91;
                                                                                                                            if (v10 /* !! */  != false) break block92;
                                                                                                                        }
                                                                                                                        catch (MatchException v15) {
                                                                                                                            throw d1.c("\u00eb", (Object)v15, (long)-5528265133618222525L, (long)var2_2);
                                                                                                                        }
                                                                                                                        v10 /* !! */  = (CallSite)d0.C;
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        if (var28_15 != null) break block93;
                                                                                                                        if (v10 /* !! */  == false) break block94;
                                                                                                                    }
                                                                                                                    catch (MatchException v16) {
                                                                                                                        throw d1.c("\u00eb", (Object)v16, (long)-5528265133618222525L, (long)var2_2);
                                                                                                                    }
                                                                                                                }
                                                                                                                return;
                                                                                                            }
                                                                                                            v10 /* !! */  = d1.c("\u00eb", (Object)new Object[0], (long)-5529001713577137863L, (long)var2_2);
                                                                                                        }
                                                                                                        try {
                                                                                                            if (var28_15 != null) break block95;
                                                                                                            if (v10 /* !! */  == false) break block96;
                                                                                                        }
                                                                                                        catch (MatchException v17) {
                                                                                                            throw d1.c("\u00eb", (Object)v17, (long)-5528265133618222525L, (long)var2_2);
                                                                                                        }
                                                                                                        return;
                                                                                                    }
                                                                                                    v18 = new Object[2];
                                                                                                    v18[1] = var14_8;
                                                                                                    v18[0] = this.c;
                                                                                                    v10 /* !! */  = d1.c("\u00f8", (Object)this.i, (Object)v18, (long)-5529733453542173583L, (long)var2_2);
                                                                                                }
                                                                                                try {
                                                                                                    if (var28_15 != null) break block97;
                                                                                                    if (v10 /* !! */  != false) break block98;
                                                                                                }
                                                                                                catch (MatchException v19) {
                                                                                                    throw d1.c("\u00eb", (Object)v19, (long)-5528265133618222525L, (long)var2_2);
                                                                                                }
                                                                                                return;
                                                                                            }
                                                                                            v10 /* !! */  = (CallSite)this.j;
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                if (var28_15 != null) break block99;
                                                                                                if (v10 /* !! */  == -1) break block100;
                                                                                            }
                                                                                            catch (MatchException v20) {
                                                                                                throw d1.c("\u00eb", (Object)v20, (long)-5528265133618222525L, (long)var2_2);
                                                                                            }
                                                                                            this.l = (int)(d1.c("\u00f5", (Object)d1.c("\u00f5", (Object)d1.b, (long)-5527614929747030715L, (long)var2_2), (long)-5513823299625930040L, (long)var2_2) + 2);
                                                                                            d1.k = true;
                                                                                            v21 = new Object[2];
                                                                                            v21[1] = var16_9;
                                                                                            v21[0] = this.j;
                                                                                            d1.c("\u00eb", (Object)v21, (long)-5514927856769634340L, (long)var2_2);
                                                                                            this.j = -1;
                                                                                            v22 = new Object[1];
                                                                                            v22[0] = var26_14;
                                                                                            d1.c("\u00f8", (Object)this, (Object)v22, (long)-5529015085254949276L, (long)var2_2);
                                                                                            return;
                                                                                        }
                                                                                        catch (MatchException v23) {
                                                                                            throw d1.c("\u00eb", (Object)v23, (long)-5528265133618222525L, (long)var2_2);
                                                                                        }
                                                                                    }
                                                                                    v10 /* !! */  = d1.c("\u00f8", (Object)((Boolean)d1.c("\u00f8", (Object)this.f, (long)-5512764217172971309L, (long)var2_2)), (long)-5530371228079714531L, (long)var2_2);
                                                                                }
                                                                                if (v10 /* !! */  != false) {
                                                                                    block102: {
                                                                                        block103: {
                                                                                            block101: {
                                                                                                var30_16 = d1.c("\u00f5", (Object)d1.b, (long)-5513049572738619485L, (long)var2_2);
                                                                                                try {
                                                                                                    try {
                                                                                                        v24 = var30_16;
                                                                                                        if (var28_15 != null) break block101;
                                                                                                        if (!(v24 instanceof class_3965)) break block102;
                                                                                                    }
                                                                                                    catch (MatchException v25) {
                                                                                                        throw d1.c("\u00eb", (Object)v25, (long)-5528265133618222525L, (long)var2_2);
                                                                                                    }
                                                                                                    v24 = var30_16;
                                                                                                }
                                                                                                catch (MatchException v26) {
                                                                                                    throw d1.c("\u00eb", (Object)v26, (long)-5528265133618222525L, (long)var2_2);
                                                                                                }
                                                                                            }
                                                                                            var29_18 = (class_3965)v24;
                                                                                            try {
                                                                                                block104: {
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                v27 = new Object[2];
                                                                                                                v27[1] = var8_5;
                                                                                                                v27[0] = var29_18;
                                                                                                                v28 /* !! */  = d1.c("\u00eb", (Object)v27, (long)-5513001960505149182L, (long)var2_2);
                                                                                                                if (var28_15 != null) break block103;
                                                                                                                if (!v28 /* !! */ ) break block104;
                                                                                                            }
                                                                                                            catch (MatchException v29) {
                                                                                                                throw d1.c("\u00eb", (Object)v29, (long)-5528265133618222525L, (long)var2_2);
                                                                                                            }
                                                                                                            v30 = new Object[2];
                                                                                                            v30[1] = var22_12;
                                                                                                            v30[0] = var29_18;
                                                                                                            v31 = new Object[2];
                                                                                                            v31[1] = var4_3;
                                                                                                            v31[0] = d1.c("\u00eb", (Object)v30, (long)-5515317749301983524L, (long)var2_2);
                                                                                                            v28 /* !! */  = d1.c("\u00eb", (Object)v31, (long)-5528711122321576869L, (long)var2_2);
                                                                                                            if (var28_15 != null) break block105;
                                                                                                        }
                                                                                                        catch (MatchException v32) {
                                                                                                            throw d1.c("\u00eb", (Object)v32, (long)-5528265133618222525L, (long)var2_2);
                                                                                                        }
                                                                                                        if (!v28 /* !! */ ) break block106;
                                                                                                    }
                                                                                                    catch (MatchException v33) {
                                                                                                        throw d1.c("\u00eb", (Object)v33, (long)-5528265133618222525L, (long)var2_2);
                                                                                                    }
                                                                                                }
                                                                                                v34 = new Object[3];
                                                                                                v34[2] = var24_13;
                                                                                                v34[1] = d1.c("\u00ed", (long)-5529180880822002348L, (long)var2_2);
                                                                                                v34[0] = d1.c("\u00f8", (Object)var29_18, (long)-5512522814391833971L, (long)var2_2);
                                                                                                v28 /* !! */  = d1.c("\u00eb", (Object)v34, (long)-5512650863917583649L, (long)var2_2);
                                                                                            }
                                                                                            catch (MatchException v35) {
                                                                                                throw d1.c("\u00eb", (Object)v35, (long)-5528265133618222525L, (long)var2_2);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            if (var28_15 != null) break block105;
                                                                                            if (v28 /* !! */ ) break block106;
                                                                                        }
                                                                                        catch (MatchException v36) {
                                                                                            throw d1.c("\u00eb", (Object)v36, (long)-5528265133618222525L, (long)var2_2);
                                                                                        }
                                                                                    }
                                                                                    return;
                                                                                }
                                                                            }
                                                                            var30_16 = d1.c("\u00f5", (Object)d1.b, (long)-5513049572738619485L, (long)var2_2);
                                                                            try {
                                                                                if (var28_15 != null) break block107;
                                                                                v28 /* !! */  = var30_16 instanceof class_3965;
                                                                            }
                                                                            catch (MatchException v37) {
                                                                                throw d1.c("\u00eb", (Object)v37, (long)-5528265133618222525L, (long)var2_2);
                                                                            }
                                                                        }
                                                                        if (!v28 /* !! */ ) ** GOTO lbl239
                                                                        var29_18 = (class_3965)var30_16;
                                                                        try {
                                                                            if (var28_15 == null) break block108;
lbl239:
                                                                            // 2 sources

                                                                            v38 = new Object[1];
                                                                            v38[0] = var26_14;
                                                                            d1.c("\u00f8", (Object)this, (Object)v38, (long)-5529015085254949276L, (long)var2_2);
                                                                        }
                                                                        catch (MatchException v39) {
                                                                            throw d1.c("\u00eb", (Object)v39, (long)-5528265133618222525L, (long)var2_2);
                                                                        }
                                                                    }
                                                                    return;
                                                                }
                                                                try {
                                                                    try {
                                                                        v40 = new Object[2];
                                                                        v40[1] = var18_10;
                                                                        v40[0] = d1.c("\u00f8", (Object)var29_18, (long)-5512522814391833971L, (long)var2_2);
                                                                        v41 /* !! */  = d1.c("\u00eb", (Object)v40, (long)-5530191503498907787L, (long)var2_2);
                                                                        if (var28_15 != null) break block109;
                                                                        if (v41 /* !! */  != false) break block110;
                                                                    }
                                                                    catch (MatchException v42) {
                                                                        throw d1.c("\u00eb", (Object)v42, (long)-5528265133618222525L, (long)var2_2);
                                                                    }
                                                                    v43 = new Object[2];
                                                                    v43[1] = var20_11;
                                                                    v43[0] = d1.c("\u00f8", (Object)var29_18, (long)-5512522814391833971L, (long)var2_2);
                                                                    v41 /* !! */  = d1.c("\u00eb", (Object)v43, (long)-5530237743495344608L, (long)var2_2);
                                                                }
                                                                catch (MatchException v44) {
                                                                    throw d1.c("\u00eb", (Object)v44, (long)-5528265133618222525L, (long)var2_2);
                                                                }
                                                            }
                                                            try {
                                                                if (var28_15 != null) break block111;
                                                                if (v41 /* !! */  == false) break block112;
                                                            }
                                                            catch (MatchException v45) {
                                                                throw d1.c("\u00eb", (Object)v45, (long)-5528265133618222525L, (long)var2_2);
                                                            }
                                                        }
                                                        return;
                                                    }
                                                    v46 = new Object[3];
                                                    v46[2] = var24_13;
                                                    v46[1] = d1.c("\u00ed", (long)-5529180880822002348L, (long)var2_2);
                                                    v46[0] = d1.c("\u00f8", (Object)var29_18, (long)-5512522814391833971L, (long)var2_2);
                                                    v41 /* !! */  = d1.c("\u00eb", (Object)v46, (long)-5512650863917583649L, (long)var2_2);
                                                }
                                                try {
                                                    try {
                                                        if (var28_15 != null) break block113;
                                                        if (v41 /* !! */  == false) break block114;
                                                    }
                                                    catch (MatchException v47) {
                                                        throw d1.c("\u00eb", (Object)v47, (long)-5528265133618222525L, (long)var2_2);
                                                    }
                                                    v48 = new Object[2];
                                                    v48[1] = var12_7;
                                                    v48[0] = d1.c("\u00f8", (Object)var29_18, (long)-5512522814391833971L, (long)var2_2);
                                                    v41 /* !! */  = d1.c("\u00eb", (Object)v48, (long)-5528494651911464561L, (long)var2_2);
                                                }
                                                catch (MatchException v49) {
                                                    throw d1.c("\u00eb", (Object)v49, (long)-5528265133618222525L, (long)var2_2);
                                                }
                                            }
                                            try {
                                                if (var28_15 != null) break block115;
                                                if (v41 /* !! */  != false) break block114;
                                            }
                                            catch (MatchException v50) {
                                                throw d1.c("\u00eb", (Object)v50, (long)-5528265133618222525L, (long)var2_2);
                                            }
                                            v41 /* !! */  = (CallSite)true;
                                            break block115;
                                        }
                                        v41 /* !! */  = (CallSite)false;
                                    }
                                    var30_17 /* !! */  = v41 /* !! */ ;
                                    try {
                                        try {
                                            v51 = new Object[3];
                                            v51[2] = var24_13;
                                            v51[1] = d1.c("\u00ed", (long)-5529180880822002348L, (long)var2_2);
                                            v51[0] = d1.c("\u00f8", (Object)var29_18, (long)-5512522814391833971L, (long)var2_2);
                                            v52 /* !! */  = d1.c("\u00eb", (Object)v51, (long)-5512650863917583649L, (long)var2_2);
                                            if (var28_15 != null) break block116;
                                            if (v52 /* !! */  == false) break block117;
                                        }
                                        catch (MatchException v53) {
                                            throw d1.c("\u00eb", (Object)v53, (long)-5528265133618222525L, (long)var2_2);
                                        }
                                        v54 = new Object[2];
                                        v54[1] = var12_7;
                                        v54[0] = d1.c("\u00f8", (Object)var29_18, (long)-5512522814391833971L, (long)var2_2);
                                        v52 /* !! */  = d1.c("\u00eb", (Object)v54, (long)-5528494651911464561L, (long)var2_2);
                                    }
                                    catch (MatchException v55) {
                                        throw d1.c("\u00eb", (Object)v55, (long)-5528265133618222525L, (long)var2_2);
                                    }
                                }
                                try {
                                    if (var28_15 != null) break block118;
                                    if (v52 /* !! */  <= 0) break block117;
                                }
                                catch (MatchException v56) {
                                    throw d1.c("\u00eb", (Object)v56, (long)-5528265133618222525L, (long)var2_2);
                                }
                                v52 /* !! */  = (CallSite)true;
                                break block118;
                            }
                            v52 /* !! */  = (CallSite)false;
                        }
                        var31_19 /* !! */  = v52 /* !! */ ;
                        try {
                            try {
                                v57 /* !! */  = var31_19 /* !! */ ;
                                if (var28_15 != null) break block119;
                                if (v57 /* !! */  == false) break block120;
                            }
                            catch (MatchException v58) {
                                throw d1.c("\u00eb", (Object)v58, (long)-5528265133618222525L, (long)var2_2);
                            }
                            this.l = (int)(d1.c("\u00f5", (Object)d1.c("\u00f5", (Object)d1.b, (long)-5527614929747030715L, (long)var2_2), (long)-5513823299625930040L, (long)var2_2) + 2);
                            d1.k = true;
                            v59 = new Object[2];
                            v59[1] = var6_4;
                            v59[0] = var29_18;
                            d1.c("\u00f8", (Object)this, (Object)v59, (long)-5513763706548892626L, (long)var2_2);
                            return;
                        }
                        catch (MatchException v60) {
                            throw d1.c("\u00eb", (Object)v60, (long)-5528265133618222525L, (long)var2_2);
                        }
                    }
                    v61 = new Object[2];
                    v61[1] = var8_5;
                    v61[0] = var29_18;
                    v57 /* !! */  = d1.c("\u00eb", (Object)v61, (long)-5513001960505149182L, (long)var2_2);
                }
                try {
                    try {
                        try {
                            try {
                                if (var28_15 != null) break block121;
                                if (v57 /* !! */  != false) break block122;
                            }
                            catch (MatchException v62) {
                                throw d1.c("\u00eb", (Object)v62, (long)-5528265133618222525L, (long)var2_2);
                            }
                            v57 /* !! */  = var30_17 /* !! */ ;
                            if (var28_15 != null) break block121;
                        }
                        catch (MatchException v63) {
                            throw d1.c("\u00eb", (Object)v63, (long)-5528265133618222525L, (long)var2_2);
                        }
                        if (v57 /* !! */  != false) break block122;
                    }
                    catch (MatchException v64) {
                        throw d1.c("\u00eb", (Object)v64, (long)-5528265133618222525L, (long)var2_2);
                    }
                    v65 = new Object[1];
                    v65[0] = var26_14;
                    d1.c("\u00f8", (Object)this, (Object)v65, (long)-5529015085254949276L, (long)var2_2);
                    return;
                }
                catch (MatchException v66) {
                    throw d1.c("\u00eb", (Object)v66, (long)-5528265133618222525L, (long)var2_2);
                }
            }
            this.l = (int)(d1.c("\u00f5", (Object)d1.c("\u00f5", (Object)d1.b, (long)-5527614929747030715L, (long)var2_2), (long)-5513823299625930040L, (long)var2_2) + 2);
            v57 /* !! */  = (CallSite)true;
        }
        d1.k = v57 /* !! */ ;
        v67 = new Object[3];
        v67[2] = var10_6;
        v67[1] = (boolean)var30_17 /* !! */ ;
        v67[0] = var29_18;
        d1.c("\u00f8", (Object)this, (Object)v67, (long)-5513527416508693396L, (long)var2_2);
    }

    /*
     * Exception decompiling
     */
    private void m(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 27[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (r[n3] != null) {
            return n3;
        }
        Object object = q[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 6;
            case 1 -> 5;
            case 2 -> 10;
            case 3 -> 18;
            case 4 -> 20;
            case 5 -> 60;
            case 6 -> 48;
            case 7 -> 33;
            case 8 -> 58;
            case 9 -> 27;
            case 10 -> 3;
            case 11 -> 26;
            case 12 -> 7;
            case 13 -> 55;
            case 14 -> 43;
            case 15 -> 35;
            case 16 -> 1;
            case 17 -> 59;
            case 18 -> 51;
            case 19 -> 49;
            case 20 -> 45;
            case 21 -> 40;
            case 22 -> 4;
            case 23 -> 38;
            case 24 -> 25;
            case 25 -> 19;
            case 26 -> 31;
            case 27 -> 16;
            case 28 -> 63;
            case 29 -> 17;
            case 30 -> 9;
            case 31 -> 15;
            case 32 -> 22;
            case 33 -> 46;
            case 34 -> 12;
            case 35 -> 47;
            case 36 -> 36;
            case 37 -> 53;
            case 38 -> 14;
            case 39 -> 8;
            case 40 -> 50;
            case 41 -> 57;
            case 42 -> 13;
            case 43 -> 62;
            case 44 -> 52;
            case 45 -> 21;
            case 46 -> 54;
            case 47 -> 61;
            case 48 -> 32;
            case 49 -> 23;
            case 50 -> 30;
            case 51 -> 56;
            case 52 -> 24;
            case 53 -> 28;
            case 54 -> 11;
            case 55 -> 2;
            case 56 -> 37;
            case 57 -> 41;
            case 58 -> 39;
            case 59 -> 29;
            case 60 -> 44;
            case 61 -> 42;
            case 62 -> 34;
            default -> 0;
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
        d1.r[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = d1.m(l, l2);
        Object object = q[n];
        if (object instanceof String) {
            String string = r[n];
            int n2 = string.indexOf(8);
            Class clazz = d1.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = d1.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = d1.g(clazz3, string2, clazz2)) != null) {
                    d1.q[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = d1.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        d1.q[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = d1.n(2354750753982950L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = d1.m(l, l2);
        Object object = q[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = r[n];
                int n3 = string2.indexOf(8);
                clazz3 = d1.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = d1.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = d1.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        d1.q[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = d1.n(2354750753982950L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = d1.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        d1.q[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = d1.n(2354750753982950L, 0L);
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

    private void k(Object[] objectArray) {
        Object object;
        long l;
        long l2;
        class_3965 class_39652;
        block28: {
            Object object2;
            block27: {
                CallSite callSite;
                block25: {
                    long l3;
                    block26: {
                        Object object3;
                        long l4;
                        block24: {
                            block23: {
                                block22: {
                                    Object object4;
                                    long l5;
                                    long l6;
                                    block21: {
                                        block20: {
                                            block19: {
                                                class_39652 = (class_3965)objectArray[0];
                                                l2 = (Long)objectArray[1];
                                                long l7 = l2 = m ^ l2;
                                                l4 = l7 ^ 0x7045200D89DEL;
                                                l3 = l7 ^ 0x2B03810A51ECL;
                                                l = l7 ^ 0x6011B1B2D80EL;
                                                l6 = l7 ^ 0x28FA3A86243DL;
                                                l5 = l7 ^ 0x35B81DF41BAFL;
                                                callSite = d1.c("\u00eb", (long)-5201341644641175348L, (long)l2);
                                                try {
                                                    try {
                                                        Object[] objectArray2 = new Object[3];
                                                        objectArray2[2] = l5;
                                                        objectArray2[1] = d1.c("\u00ed", (long)-5194901054901642760L, (long)l2);
                                                        objectArray2[0] = d1.c("\u00f8", (Object)class_39652, (long)-5200544863862378975L, (long)l2);
                                                        object4 = d1.c("\u00eb", (Object)objectArray2, (long)-5200734580780222861L, (long)l2);
                                                        if (callSite != null) break block19;
                                                        if (object4 == false) break block20;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw d1.c("\u00eb", (Object)matchException, (long)-5193830774768259345L, (long)l2);
                                                    }
                                                    Object[] objectArray3 = new Object[2];
                                                    objectArray3[1] = l6;
                                                    objectArray3[0] = d1.c("\u00f8", (Object)class_39652, (long)-5200544863862378975L, (long)l2);
                                                    object4 = d1.c("\u00eb", (Object)objectArray3, (long)-5194144414278378205L, (long)l2);
                                                }
                                                catch (MatchException matchException) {
                                                    throw d1.c("\u00eb", (Object)matchException, (long)-5193830774768259345L, (long)l2);
                                                }
                                            }
                                            try {
                                                if (callSite != null) break block21;
                                                if (object4 != false) break block20;
                                            }
                                            catch (MatchException matchException) {
                                                throw d1.c("\u00eb", (Object)matchException, (long)-5193830774768259345L, (long)l2);
                                            }
                                            object4 = 1;
                                            break block21;
                                        }
                                        object4 = 0;
                                    }
                                    object = object4;
                                    try {
                                        try {
                                            Object[] objectArray4 = new Object[3];
                                            objectArray4[2] = l5;
                                            objectArray4[1] = d1.c("\u00ed", (long)-5194901054901642760L, (long)l2);
                                            objectArray4[0] = d1.c("\u00f8", (Object)class_39652, (long)-5200544863862378975L, (long)l2);
                                            object3 = d1.c("\u00eb", (Object)objectArray4, (long)-5200734580780222861L, (long)l2);
                                            if (callSite != null) break block22;
                                            if (object3 == false) break block23;
                                        }
                                        catch (MatchException matchException) {
                                            throw d1.c("\u00eb", (Object)matchException, (long)-5193830774768259345L, (long)l2);
                                        }
                                        Object[] objectArray5 = new Object[2];
                                        objectArray5[1] = l6;
                                        objectArray5[0] = d1.c("\u00f8", (Object)class_39652, (long)-5200544863862378975L, (long)l2);
                                        object3 = d1.c("\u00eb", (Object)objectArray5, (long)-5194144414278378205L, (long)l2);
                                    }
                                    catch (MatchException matchException) {
                                        throw d1.c("\u00eb", (Object)matchException, (long)-5193830774768259345L, (long)l2);
                                    }
                                }
                                try {
                                    if (callSite != null) break block24;
                                    if (object3 <= 0) break block23;
                                }
                                catch (MatchException matchException) {
                                    throw d1.c("\u00eb", (Object)matchException, (long)-5193830774768259345L, (long)l2);
                                }
                                object3 = 1;
                                break block24;
                            }
                            object3 = 0;
                        }
                        Object object5 = object3;
                        try {
                            try {
                                object2 = object5;
                                if (callSite != null) break block25;
                                if (object2 == false) break block26;
                            }
                            catch (MatchException matchException) {
                                throw d1.c("\u00eb", (Object)matchException, (long)-5193830774768259345L, (long)l2);
                            }
                            Object[] objectArray6 = new Object[2];
                            objectArray6[1] = l4;
                            objectArray6[0] = class_39652;
                            d1.c("\u00f8", (Object)this, (Object)objectArray6, (long)-5199604419699259262L, (long)l2);
                            return;
                        }
                        catch (MatchException matchException) {
                            throw d1.c("\u00eb", (Object)matchException, (long)-5193830774768259345L, (long)l2);
                        }
                    }
                    Object[] objectArray7 = new Object[2];
                    objectArray7[1] = l3;
                    objectArray7[0] = class_39652;
                    object2 = d1.c("\u00eb", (Object)objectArray7, (long)-5201226947148972626L, (long)l2);
                }
                try {
                    if (callSite != null) break block27;
                    if (object2 != false) break block28;
                }
                catch (MatchException matchException) {
                    throw d1.c("\u00eb", (Object)matchException, (long)-5193830774768259345L, (long)l2);
                }
                object2 = object;
            }
            if (object2 == false) {
                return;
            }
        }
        Object[] objectArray8 = new Object[3];
        objectArray8[2] = l;
        objectArray8[1] = (boolean)object;
        objectArray8[0] = class_39652;
        d1.c("\u00f8", (Object)this, (Object)objectArray8, (long)-5201549483414961984L, (long)l2);
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
        block5: {
            d1 d12;
            long l;
            long l2;
            block4: {
                l2 = (Long)objectArray[0];
                l = (l2 = m ^ l2) ^ 0x1149299AB787L;
                CallSite callSite = d1.c("\u00eb", (long)-2303591003760152811L, (long)l2);
                try {
                    try {
                        d12 = this;
                        if (callSite != null) break block4;
                        if (d1.c("\u00f8", (String)((Object)d1.c("\u00f8", (Object)d12.a, (long)-2302532281274997850L, (long)l2)), (Object)d1.b("z", (int)1655, (long)(0x1C63307B29925583L ^ l2)), (long)-2302836775735298090L, (long)l2) == false) break block5;
                    }
                    catch (MatchException matchException) {
                        throw d1.c("\u00eb", (Object)matchException, (long)-2291539362374846154L, (long)l2);
                    }
                    d12 = this;
                }
                catch (MatchException matchException) {
                    throw d1.c("\u00eb", (Object)matchException, (long)-2291539362374846154L, (long)l2);
                }
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l;
            d1.c("\u00f8", (Object)d12, (Object)objectArray2, (long)-2291957854698064288L, (long)l2);
        }
    }

    private boolean lambda$new$0(Boolean bl) {
        long l = m ^ 0x829CA391856L;
        return (boolean)d1.c("\u00f8", (String)((Object)d1.c("\u00f8", (Object)this.d, (long)-8284985534791774552L, (long)l)), (Object)d1.b("z", (int)4892, (long)(0x2AE3220C32DBADE3L ^ l)), (long)-8285289894900655400L, (long)l);
    }

    private boolean lambda$new$1(Float f) {
        long l = m ^ 0x4FF59A8455E5L;
        return (boolean)d1.c("\u00f8", (Object)((Boolean)((Object)d1.c("\u00f8", (Object)this.f, (long)-4560292297664511205L, (long)l))), (long)-4573404471208510251L, (long)l);
    }

    private static boolean lambda$calculate$2(class_2338 class_23382) {
        long l = m ^ 0x75F30364FCC6L;
        long l2 = l ^ 0x4DD8F21C824FL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = class_23382;
        return (boolean)d1.c("\u00eb", (Object)objectArray, (long)7613766003187796015L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(d1.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(d1.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


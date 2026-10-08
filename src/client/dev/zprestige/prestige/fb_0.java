/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bc_0;
import dev.zprestige.prestige.bl_0;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dR;
import dev.zprestige.prestige.dT;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.dn_0;
import dev.zprestige.prestige.f5;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.fb
 */
public class fb_0
extends dV {
    private dR a;
    private dT c;
    private dM d;
    private dO e;
    private f5 f;
    private String h;
    private static final long k;
    private static final String[] l;
    private static final String[] m;
    private static final Map n;
    private static final Object[] o;
    private static final String[] p;

    public fb_0() {
        long l;
        long l2 = l = k ^ 0x658F61094C4AL;
        long l3 = l2 ^ 0x4147021256EFL;
        long l4 = l2 ^ 0x497111274136L;
        long l5 = l2 ^ 0x3E0C696033C1L;
        long l6 = l2 ^ 0x143CABF63DDDL;
        this.f = new f5(l3);
        this.h = "";
        Object[] objectArray = new Object[2];
        objectArray[1] = l4;
        objectArray[0] = this::lambda$new$2;
        fb_0.c("\u00ea", (Object)this.e, (Object)objectArray, (long)-5945659564825846088L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l6;
        objectArray2[0] = this::lambda$new$1;
        fb_0.c("\u00ea", (Object)this.d, (Object)objectArray2, (long)-5945411411248831018L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l5;
        objectArray3[0] = this::lambda$new$0;
        fb_0.c("\u00ea", (Object)this.c, (Object)objectArray3, (long)-5945187393321691701L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                fb_0.k = hc.a(7820244498871017351L, -3903717558947031449L, MethodHandles.lookup().lookupClass()).a(253568973454465L);
                fb_0.o = new Object[68];
                fb_0.p = new String[68];
                fb_0.f();
                fb_0.n = new HashMap<K, V>(13);
                var0 = fb_0.k ^ 115966212369286L;
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
                var9_3 = new String[5];
                var7_4 = 0;
                var6_5 = "\u0004\u001b\u001b\u00c2\u00df-T\u00f9\u0080\u0088\u00ce\u00a2=\u0085#\u0082\u0010/\t\u00c3\u00f6\u0013\u00df.\u00df\u0084\u007f\u0087\u00db\u0013\u00adm\u00e1@\u00bd\u00f1\u00c7\u0088d\u008c@\u0015\u00b3\u00f2\u008a\u008fN[\u00bdb\u008f\u0012\u00b1\u00ddh\u00b9\u0096\u0011\u00efRp\u00e1\u00e4\u00c9\u00d5\u00af\u00db<A\u009d\u001d\u00c44Ct!>\u00bbp\u0091w\u00bd\u001f\u001d\u00c3e\u00dct\u0091T\u008f\u0018zmM\u00f5&\u009f";
                var8_6 = "\u0004\u001b\u001b\u00c2\u00df-T\u00f9\u0080\u0088\u00ce\u00a2=\u0085#\u0082\u0010/\t\u00c3\u00f6\u0013\u00df.\u00df\u0084\u007f\u0087\u00db\u0013\u00adm\u00e1@\u00bd\u00f1\u00c7\u0088d\u008c@\u0015\u00b3\u00f2\u008a\u008fN[\u00bdb\u008f\u0012\u00b1\u00ddh\u00b9\u0096\u0011\u00efRp\u00e1\u00e4\u00c9\u00d5\u00af\u00db<A\u009d\u001d\u00c44Ct!>\u00bbp\u0091w\u00bd\u001f\u001d\u00c3e\u00dct\u0091T\u008f\u0018zmM\u00f5&\u009f".length();
                var5_7 = 16;
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
                    var9_3[var7_4++] = fb_0.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u000e\u00e1\n\u0096\u001c\u0083`\u00f3\u00fc\u007f\u00a9\u00b4\u00f7\u00dc\u00e4\n\u0010F.no0\u00cd07\u00c9=\u008fCe\u00e9\u00d1|";
                    var8_6 = "\u000e\u00e1\n\u0096\u001c\u0083`\u00f3\u00fc\u007f\u00a9\u00b4\u00f7\u00dc\u00e4\n\u0010F.no0\u00cd07\u00c9=\u008fCe\u00e9\u00d1|".length();
                    var5_7 = 16;
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
                    var9_3[var7_4++] = fb_0.b(var10_9).intern();
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
        fb_0.l = var9_3;
        fb_0.m = new String[5];
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x293E;
        if (m[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])fb_0.n.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    fb_0.n.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/fb", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = fb_0.l[n2].getBytes("ISO-8859-1");
            fb_0.m[n2] = fb_0.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return m[n2];
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

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = fb_0.b(n, l);
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
            throw new RuntimeException("dev/zprestige/prestige/fb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fb_0.m(l, l2);
            object = o[n];
            try {
                if (!(object instanceof String)) break block2;
                fb_0.o[n] = clazz = Class.forName(p[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fb_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fb_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fb_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fb_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = o;
        o[0] = "{E0\u001dJAmE5GYVz\u000e6AUBkI!V\u001eUT";
        objectArray[1] = "_D\u0006\u0014\u0003.TK\u0017[b _@\u0013\u0001";
        objectArray[2] = "\u001d\u0010!Dl\u000f\u0016\u001f0\u000b\u0011\u0017\u0005\u00189B";
        objectArray[3] = Boolean.TYPE;
        fb_0.p[3] = "java/lang/Boolean";
        objectArray[4] = "G\u0016]\u0015\u0002\u000bQ\u0016XO\u0011\u001cF][I\u001d\bW\u001aL^V\u001ak";
        objectArray[5] = " X\u007f\u001f\u0002\u0014Uxt\u0010\u0013[(`g\u0017\u001a\u0012@";
        objectArray[6] = "i}\u000ed\u0015.\u007f}\u000b>\u00069h6\b8\n-yq\u001f/A8o";
        objectArray[7] = "&J\fu}V-E\u001d:\u001e[8H\u0012Q+Y)[\u000e}<T";
        objectArray[8] = "VIq,\u0010\u000b#iz#\u0001DBgq(\u0005\u001e6";
        objectArray[9] = Void.TYPE;
        fb_0.p[9] = "java/lang/Void";
        objectArray[10] = "/lj\u0014kv/l}Hgy5'}Vgl2V-\b6";
        objectArray[11] = "K\b\u001ahSS]\b\u001f2@DJC\u001c4LP[\u0004\u000b#\u0007AL";
        objectArray[12] = "A\u0017\"\u0001h,47)\u000eycU9\"\u0005}9!";
        objectArray[13] = "\u001e;(b\f\u0011\u001549-a\u0015\u0015(\rfS\b\u00114=f";
        objectArray[14] = "0*mZ\u0013WE\nfU\u0002\u0018$\u0004m^\u0006BP";
        objectArray[15] = "5\u0019\u0017JR\u00185\u0019\u0000\u0016^\u0017/R\u0000\b^\u0002(#PU\u000f";
        objectArray[16] = "X+FuCJ-\u000bMzR\u0005L\u0005FqV_8";
        objectArray[17] = "!Gk\u0015S27GnO@% \fmIL11Kz^\u0007&\n";
        objectArray[18] = "\\\u001d?R.?)=4]?pH3?V;*<";
        objectArray[19] = "7_2/\fJ!_7u\u001f]6\u00144s\u0013I'S#dX^\u001e";
        objectArray[20] = "\u00077,\t\u000eJr\u0017'\u0006\u001f\u0005\u0013\u0019,\r\u001b_g";
        objectArray[21] = "?!s, e)!vv3r>jup?f/-bgtq\u000f";
        objectArray[22] = "Lr\bHO\u001c9R\u0003G^SX\\\bLZ\t,";
        objectArray[23] = "z|\n9Y{\u000f\\\u00016H4nR\n=Ln\u001a";
        objectArray[24] = "g\u0001;h39q\u0001>2 .fJ=4,:w\r*#g/6";
        objectArray[25] = "*5W\u0004,\r_\u0015\\\u000b=B>\u001bW\u00009\u0018J";
        objectArray[26] = "FS@~g|M\\Q1\u000b\u007fC^S~'";
        objectArray[27] = "g|G@g\u000flsV\u000f\u000f\u000fb|E";
        objectArray[28] = Float.TYPE;
        fb_0.p[28] = "java/lang/Float";
        objectArray[29] = "UO\b1\b' o\u0003>\u0019hAa\b5\u001d25";
        objectArray[30] = Integer.TYPE;
        fb_0.p[30] = "java/lang/Integer";
        objectArray[31] = "{pE}?8{pR!37a;R?3\"fJ\u0006gd";
        objectArray[32] = "EK3pbGND\"?\u001f_]C+v\u000e^FF!t>";
        objectArray[33] = Character.TYPE;
        fb_0.p[33] = "java/lang/Character";
        objectArray[34] = "Db)V,\u0006Db>\n \t^)>\u0014 \u001cYXoMw^";
        objectArray[35] = "~-WO?o`%M\u0000C{z(NC";
        objectArray[36] = "k(\u0015_\u001dn`'\u0004\u0010pj`;\u0002]Ggs";
        objectArray[37] = "\u0013$Qv\u0015%\u0016+\u0006ve-(r\u0001!\u00149H,@y\fG";
        objectArray[38] = "4A\"4fN1H{0\u0006@<Lz=Q\u0017b\u001b\"QbRfCg/tV \u0019";
        objectArray[39] = ";1w*0%)2n%O'T+l--)?/($%Nn\"-$\u007f ?\"xqO";
        objectArray[40] = "\u0012j\u0010,\u0002$\u0017eG,r/)c\u0002\u007f\u0010!BgFv\u0018F\u0017{\u0015z\u0003<\u0010y\u0005mr";
        objectArray[41] = "(%\u001eHmsvr\rUSy\"b;L)w)q`\t7qts\u0000N9v*\u001e";
        objectArray[42] = "\u001fN08Z-X@7f7&AL+jV+]*f;Z \u0018I>fY+&\u0010=:]}HA=o\bM";
        objectArray[43] = "OBR\u0005dRCJ\u0005\u0017\n^ET@9n_AX<\u0015o\u0004\u0012AP\fh\\Y$";
        objectArray[44] = "\u00117:\u0012@\u000e\nlz\u00000S\u0012\u001a'\u0013P[\u0003>?\n[2\r<rQ]J\u0002+?S0\b\u0003j)[^Y\u0003?|k";
        objectArray[45] = "\u0013_G|}yTQ@\"\u0010eM`\\=q\u007fE;\u0019#w\"G[^-p|*";
        objectArray[46] = "e'zc\u001bI<&fcc[Z;a0\u0001W1?%9\t0d#v5\u0012Jc!f\"c";
        objectArray[47] = "\ta(\u000fA-\u0012:h\u001d1m\u0016X)\u000e\\k:l*\u001b1wA?l\rN/K8/vW!K8*\t\u000f+L{Q";
        objectArray[48] = "as?5\",6*z2Yx\u000f,});vd(9 3\u0011as?5\",6*z2Y";
        objectArray[49] = "c51Ob]q6(@\u001d_\f/*H\u007fQg+nAw627=MlL55-Z\u001d";
        objectArray[50] = "%\nn/a_)\u00029=\u000fS/\u001c|\u001ciIB\bol5X:\u0007x!75&\u00031gbM)\u0014|e\u000f";
        objectArray[51] = " X)rS@6\\o(*[)XrwFiy\u0018-.*Y\u007fZj.O\u0007(Iw\u0010";
        objectArray[52] = "\u0006\u0012g>*^@S6=AU:V;q8ZFT41~<\u0007\u0007i6'@\u0005\b)pA";
        objectArray[53] = "\t\u007fY\u0015%EO>\b\u0016NK5e\u0011\u0007,@^aU\u000e$'\fb\u000e_#GKl\t\u0001N";
        objectArray[54] = "^\u000bux\u0017\u007f\u0019\u0005r&z{\n\t}?\u001a\u001f\u0003\u0000#y\u0017g\f\u0017n{z";
        objectArray[55] = "QME\u00133\u0011L\u001bT\u0018H\u001cL_V\u0013$uR\u0017\u0001H3\n\n\u001d\u0006\u000bH\u0010^Y]\u000e,\r\bHVu";
        objectArray[56] = "\"oP\u001d`Hd6\u0016\u0016\u0000]p-\n\u001flo$oUF\u0000\u0001y6Q\u0015`Fw1\u000fx";
        objectArray[57] = "\u0010)G70;I([7H(/5\\d*%D1\u0018m\"B\u00162C<%\"Q<DbH";
        objectArray[58] = "iW[^\u0015;d\u0005FQh\"\u0002\u000bDQ\n,i\u000f\u0000X\u0002KiW[^\u0015;d\u0005FQh";
        objectArray[59] = "e#D(0%n}\u001cj\t\u007fc A\u007f`sZ.Aod\u0015>-\u001cx9{o-I-\t";
        objectArray[60] = "Z\u0012pG]9\u0003\u0013lG%*e\u000ek\u0014G'\u000e\n/\u001dO@[\u0016|\u0011T:\\\u0014l\u0006%";
        objectArray[61] = "q\u0018\u000fFd2t\u0011VB\u00047u\u0004SDh\u0005!E\u000f\u0013\u0004m&BVCt+\u007f\u0004]#";
        objectArray[62] = "?\u0002e*U\u000f\"Tt!.\u0017=3g6O\r5h\"(IP7\be&N\u000eZ";
        objectArray[63] = "pC\u0010\u0001\u000e`}\t[\u001e~h\u001c[\u001a\u001a\u001cfw_^\u0013\u0014\u0001pC\u0010\u0001\u000e`}\t[\u001e~";
        objectArray[64] = ",V!L\u0016\u000e$['2Guz\r=K\u0016\u0005:\u0004~_.";
        objectArray[65] = "\u001a}\"HHXD.z\u0005!G\u001cvwI\u007f@\u001cls5CLD+{YZK\u001c`\u001e";
        objectArray[66] = "V@1<\u001aJ\u0011N6bwG\u0016Y?c\f*V\u0014/~OZ\u0016\u001dljw\u0010\u0005\u001d<7\u0019A\u0005Hi\u0007";
        Object[] objectArray2 = objectArray;
        objectArray[67] = "\u00004z\u001f:\u0017G:}AW\u001cY9gm+w]?,\u001e:\u000fR(a\u001cW\u0011\tj _(I\u0003mc$";
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = fb_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00fb' || c == '\u00e7' || c == '\u00d8' || c == 'f') {
                field = fb_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00fb' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e7' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fb_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ea' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        long l2 = l ^ 0x7C3EEE9392F7L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        this.h = fb_0.c("\u00ea", (Object)this, (Object)objectArray2, (long)3245756922622083907L, (long)l);
    }

    private String d(Object[] objectArray) {
        CallSite callSite;
        block15: {
            CallSite callSite2;
            long l;
            block14: {
                Object object;
                block13: {
                    l = (Long)objectArray[0];
                    l = k ^ l;
                    callSite2 = fb_0.c("\u00d1", (long)6827577343011542320L, (long)l);
                    try {
                        try {
                            object = (String)((Object)fb_0.c("\u00ea", (Object)this.a, (long)6834541237198270065L, (long)l));
                            if (callSite2 != null) break block13;
                            if (fb_0.c("\u00ea", (Object)object, (Object)fb_0.b("z", (int)4015, (long)(0x519BDEBCA0AC7859L ^ l)), (long)6834685440190644757L, (long)l) == false) break block14;
                        }
                        catch (MatchException matchException) {
                            throw fb_0.c("\u00d1", (Object)matchException, (long)6828594662123158141L, (long)l);
                        }
                        object = fb_0.c("\u00ea", (String)((Object)fb_0.c("\u00ea", (Object)this.c, (long)6834541237198270065L, (long)l)), (long)6828110764322311021L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw fb_0.c("\u00d1", (Object)matchException, (long)6828594662123158141L, (long)l);
                    }
                }
                return object;
            }
            StringBuilder stringBuilder = new StringBuilder();
            CallSite callSite3 = fb_0.b("z", (int)12089, (long)(0x7973223879ED58CCL ^ l));
            int n = 0;
            while (n < fb_0.c("\u00ea", (Object)fb_0.c("\u00ea", (Object)fb_0.c("\u00ea", (Object)fb_0.c("\u00fb", (Object)b, (long)6827609875464961681L, (long)l), (long)6829106925531773718L, (long)l), (long)6828441241640129811L, (long)l), (long)6828734898670668928L, (long)l)) {
                block16: {
                    CallSite callSite4;
                    block17: {
                        CallSite callSite5;
                        block18: {
                            callSite = callSite3;
                            if (callSite2 != null) break block15;
                            callSite4 = fb_0.c("\u00ea", (Object)callSite, (int)fb_0.c("\u00ea", (Object)dn_0.a, (int)fb_0.c("\u00ea", (Object)callSite3, (long)6828734898670668928L, (long)l), (long)6829027914566355373L, (long)l), (long)6834742348987915630L, (long)l);
                            try {
                                try {
                                    try {
                                        try {
                                            if (callSite2 != null) break block16;
                                            if (fb_0.c("\u00d1", (int)callSite4, (long)6828080476627481001L, (long)l) == false) break block17;
                                        }
                                        catch (MatchException matchException) {
                                            throw fb_0.c("\u00d1", (Object)matchException, (long)6828594662123158141L, (long)l);
                                        }
                                        reference cfr_temp_0 = fb_0.c("\u00ea", (Object)dn_0.a, (long)6828567641732046204L, (long)l) - 0.5f;
                                        callSite5 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                        if (callSite2 != null) break block18;
                                    }
                                    catch (MatchException matchException) {
                                        throw fb_0.c("\u00d1", (Object)matchException, (long)6828594662123158141L, (long)l);
                                    }
                                    if (callSite5 <= 0) break block17;
                                }
                                catch (MatchException matchException) {
                                    throw fb_0.c("\u00d1", (Object)matchException, (long)6828594662123158141L, (long)l);
                                }
                                callSite5 = fb_0.c("\u00d1", (char)callSite4, (long)6828268710984347144L, (long)l);
                            }
                            catch (MatchException matchException) {
                                throw fb_0.c("\u00d1", (Object)matchException, (long)6828594662123158141L, (long)l);
                            }
                        }
                        callSite4 = callSite5;
                    }
                    fb_0.c("\u00ea", (Object)stringBuilder, (char)callSite4, (long)6828861765022790364L, (long)l);
                    ++n;
                }
                if (callSite2 == null) continue;
            }
            callSite = fb_0.c("\u00ea", (Object)stringBuilder, (long)6829316469471720797L, (long)l);
        }
        return callSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    @Override
    public String a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return fb_0.c("\u00ea", (String)((Object)fb_0.c("\u00ea", (Object)this.a, (long)-810842173975526377L, (long)l)), (long)-818468974473944821L, (long)l);
    }

    @bP
    public void a(bl_0 bl_02) {
        block15: {
            long l;
            long l2;
            block14: {
                fb_0 fb_02;
                CallSite callSite;
                block12: {
                    CallSite callSite2;
                    block13: {
                        long l3 = l2 = k ^ 0x167CEF4720F5L;
                        long l4 = l3 ^ 0x704E47C0DE50L;
                        l = l3 ^ 0x2540BA4C7E3CL;
                        long l5 = l3 ^ 0x271A1E87E6C1L;
                        callSite2 = fb_0.c("\u00d1", (long)-4484324044435961292L, (long)l2);
                        try {
                            try {
                                try {
                                    try {
                                        callSite = fb_0.c("\u00ea", (Object)((Boolean)((Object)fb_0.c("\u00ea", (Object)this.d, (long)-4477354927267139211L, (long)l2))), (long)-4484519858452032373L, (long)l2);
                                        if (callSite2 != null) break block12;
                                        if (callSite == false) break block13;
                                    }
                                    catch (MatchException matchException) {
                                        throw fb_0.c("\u00d1", (Object)matchException, (long)-4485553569282841223L, (long)l2);
                                    }
                                    Object[] objectArray = new Object[2];
                                    objectArray[1] = l5;
                                    objectArray[0] = Float.valueOf((float)fb_0.c("\u00ea", (Object)((Float)((Object)fb_0.c("\u00ea", (Object)this.e, (long)-4477354927267139211L, (long)l2))), (long)-4477307863999007984L, (long)l2));
                                    callSite = fb_0.c("\u00ea", (Object)this.f, (Object)objectArray, (long)-4484215064235152107L, (long)l2);
                                    if (callSite2 != null) break block12;
                                }
                                catch (MatchException matchException) {
                                    throw fb_0.c("\u00d1", (Object)matchException, (long)-4485553569282841223L, (long)l2);
                                }
                                if (callSite == false) break block13;
                            }
                            catch (MatchException matchException) {
                                throw fb_0.c("\u00d1", (Object)matchException, (long)-4485553569282841223L, (long)l2);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l;
                            this.h = fb_0.c("\u00ea", (Object)this, (Object)objectArray, (long)-4485471123844599928L, (long)l2);
                            Object[] objectArray2 = new Object[1];
                            objectArray2[0] = l4;
                            fb_0.c("\u00ea", (Object)this.f, (Object)objectArray2, (long)-4485185704949765833L, (long)l2);
                        }
                        catch (MatchException matchException) {
                            throw fb_0.c("\u00d1", (Object)matchException, (long)-4485553569282841223L, (long)l2);
                        }
                    }
                    try {
                        fb_02 = this;
                        if (callSite2 != null) break block14;
                        callSite = fb_0.c("\u00ea", (String)((Object)fb_0.c("\u00ea", (Object)fb_02.a, (long)-4477354927267139211L, (long)l2)), (Object)fb_0.b("z", (int)4015, (long)(0x519BC8DD9FBFE75DL ^ l2)), (long)-4477219787762918127L, (long)l2);
                    }
                    catch (MatchException matchException) {
                        throw fb_0.c("\u00d1", (Object)matchException, (long)-4485553569282841223L, (long)l2);
                    }
                }
                if (callSite == false) break block15;
                fb_02 = this;
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l;
            fb_02.h = fb_0.c("\u00ea", (Object)this, (Object)objectArray, (long)-4485471123844599928L, (long)l2);
        }
    }

    @bP
    public void a(bc_0 bc_02) {
        block5: {
            bc_0 bc_03;
            long l;
            block4: {
                l = k ^ 0x2AF6E0C51B20L;
                CallSite callSite = fb_0.c("\u00ea", (Object)fb_0.c("\u00ea", (Object)b, (long)-425773890339689624L, (long)l), (long)-426122713771238671L, (long)l);
                CallSite callSite2 = fb_0.c("\u00d1", (long)-427481872694185503L, (long)l);
                try {
                    try {
                        bc_03 = bc_02;
                        if (callSite2 != null) break block4;
                        if (fb_0.c("\u00ea", (Object)fb_0.c("\u00ea", (Object)bc_03, (Object)new Object[0], (long)-426061894589496161L, (long)l), (Object)callSite, (long)-427134928894505878L, (long)l) == false) break block5;
                    }
                    catch (MatchException matchException) {
                        throw fb_0.c("\u00d1", (Object)matchException, (long)-426399124587602260L, (long)l);
                    }
                    fb_0.c("\u00ea", (Object)bc_02, (Object)new Object[]{fb_0.c("\u00ea", (Object)fb_0.c("\u00ea", (Object)b, (long)-425773890339689624L, (long)l), (long)-426122713771238671L, (long)l)}, (long)-425853269402366945L, (long)l);
                    fb_0.c("\u00ea", (Object)bc_02, (Object)new Object[]{this.h}, (long)-426854428367587715L, (long)l);
                    bc_03 = bc_02;
                }
                catch (MatchException matchException) {
                    throw fb_0.c("\u00d1", (Object)matchException, (long)-426399124587602260L, (long)l);
                }
            }
            fb_0.c("\u00ea", (Object)bc_03, (Object)new Object[0], (long)-427266487545713253L, (long)l);
        }
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (p[n3] != null) {
            return n3;
        }
        Object object = o[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 57;
            case 1 -> 38;
            case 2 -> 63;
            case 3 -> 35;
            case 4 -> 53;
            case 5 -> 48;
            case 6 -> 59;
            case 7 -> 10;
            case 8 -> 1;
            case 9 -> 32;
            case 10 -> 31;
            case 11 -> 44;
            case 12 -> 33;
            case 13 -> 54;
            case 14 -> 0;
            case 15 -> 30;
            case 16 -> 22;
            case 17 -> 56;
            case 18 -> 61;
            case 19 -> 60;
            case 20 -> 43;
            case 21 -> 3;
            case 22 -> 26;
            case 23 -> 42;
            case 24 -> 19;
            case 25 -> 20;
            case 26 -> 62;
            case 27 -> 34;
            case 28 -> 36;
            case 29 -> 12;
            case 30 -> 17;
            case 31 -> 46;
            case 32 -> 37;
            case 33 -> 15;
            case 34 -> 8;
            case 35 -> 16;
            case 36 -> 7;
            case 37 -> 4;
            case 38 -> 45;
            case 39 -> 58;
            case 40 -> 52;
            case 41 -> 39;
            case 42 -> 49;
            case 43 -> 23;
            case 44 -> 47;
            case 45 -> 13;
            case 46 -> 50;
            case 47 -> 29;
            case 48 -> 5;
            case 49 -> 25;
            case 50 -> 2;
            case 51 -> 24;
            case 52 -> 40;
            case 53 -> 51;
            case 54 -> 21;
            case 55 -> 55;
            case 56 -> 28;
            case 57 -> 11;
            case 58 -> 6;
            case 59 -> 41;
            case 60 -> 27;
            case 61 -> 14;
            case 62 -> 18;
            default -> 9;
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
        fb_0.p[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = fb_0.m(l, l2);
        Object object = o[n];
        if (object instanceof String) {
            String string = p[n];
            int n2 = string.indexOf(8);
            Class clazz = fb_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fb_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fb_0.g(clazz3, string2, clazz2)) != null) {
                    fb_0.o[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fb_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fb_0.o[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fb_0.n(126222957177062L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = fb_0.m(l, l2);
        Object object = o[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = p[n];
                int n3 = string2.indexOf(8);
                clazz3 = fb_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fb_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fb_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        fb_0.o[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fb_0.n(126222957177062L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fb_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fb_0.o[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fb_0.n(126222957177062L, 0L);
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

    private boolean lambda$new$0(String string) {
        long l = k ^ 0x7D792948A16DL;
        return (boolean)fb_0.c("\u00ea", (String)((Object)fb_0.c("\u00ea", (Object)this.a, (long)4631202829462810861L, (long)l)), (Object)fb_0.b("z", (int)16691, (long)(0x3BE38DF7B3AA85CL ^ l)), (long)4631340161614290057L, (long)l);
    }

    private boolean lambda$new$2(Float f) {
        Object object;
        block8: {
            block7: {
                CallSite callSite;
                long l;
                block6: {
                    l = k ^ 0x2DD6BFA5D12L;
                    callSite = fb_0.c("\u00d1", (long)-4889941986320336941L, (long)l);
                    try {
                        try {
                            object = fb_0.c("\u00ea", (Object)((Boolean)((Object)fb_0.c("\u00ea", (Object)this.d, (long)-4883544890075984750L, (long)l))), (long)-4889541044691703444L, (long)l);
                            if (callSite != null) break block6;
                            if (object == false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw fb_0.c("\u00d1", (Object)matchException, (long)-4888929615548753762L, (long)l);
                        }
                        object = fb_0.c("\u00ea", (String)((Object)fb_0.c("\u00ea", (Object)this.a, (long)-4883544890075984750L, (long)l)), (Object)fb_0.b("z", (int)30110, (long)(0x7F73F4FB0BEBE089L ^ l)), (long)-4883400688170180362L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw fb_0.c("\u00d1", (Object)matchException, (long)-4888929615548753762L, (long)l);
                    }
                }
                try {
                    if (callSite != null) break block8;
                    if (object == false) break block7;
                }
                catch (MatchException matchException) {
                    throw fb_0.c("\u00d1", (Object)matchException, (long)-4888929615548753762L, (long)l);
                }
                object = 1;
                break block8;
            }
            object = 0;
        }
        return (boolean)object;
    }

    private boolean lambda$new$1(Boolean bl) {
        long l = k ^ 0x1AE0E1FE405EL;
        return (boolean)fb_0.c("\u00ea", (String)((Object)fb_0.c("\u00ea", (Object)this.a, (long)-6812202452035776034L, (long)l)), (Object)fb_0.b("z", (int)30033, (long)(0x7CF6E43FF3357D09L ^ l)), (long)-6812058585070830150L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fb_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(fb_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


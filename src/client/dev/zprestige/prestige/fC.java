/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_640
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bb_0;
import dev.zprestige.prestige.bc_0;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dR;
import dev.zprestige.prestige.dT;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.dn_0;
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
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1657;
import net.minecraft.class_640;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class fC
extends dV {
    private dM d;
    private dT a;
    private dR c;
    private dM e;
    private Map f = new LinkedHashMap();
    private AtomicInteger g = new AtomicInteger(0);
    private static final long k = hc.a(-4109365555286257490L, 1416692399883589562L, MethodHandles.lookup().lookupClass()).a(36193092615770L);
    private static final String[] l;
    private static final String[] m;
    private static final Map n;
    private static final Object[] o;
    private static final String[] p;

    /*
     * Enabled aggressive block sorting
     */
    static {
        o = new Object[99];
        p = new String[99];
        fC.f();
        n = new HashMap(13);
        long l = k ^ 0x4CAED171C0E3L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[3];
        int n = 0;
        String string = "\u00de\u0011\u0006\u00fa\u00d5\u008b\u0015]9\u00d0\u0014\u00d5+\u0001\u0096J\u0010\u00aa\u00b6\u00f4\u009c\u00ac\u00e1\u00b6D\u00e7\u00be\u00e9\u0098\u00d4\u00d9sy@\u0013n\u0085\u0015\r4\u00bc\u00c6\u00a6B\u00e4\u00e8\u00dbQ\u00a3\u00ed\u00f1\u00b1\u0007\u00ec#N\u0085\u00c6E\u0019\u0016PS\u001d\u008a\u00be\u001a\u00d4ve\u0002\u00a6,pl|0&bxo\u00c8#Fh\u0084\u00da\u0080w\u001d\u00ac\u001b\u00075\u00f0\u00a5\u0088\u00b7";
        int n2 = "\u00de\u0011\u0006\u00fa\u00d5\u008b\u0015]9\u00d0\u0014\u00d5+\u0001\u0096J\u0010\u00aa\u00b6\u00f4\u009c\u00ac\u00e1\u00b6D\u00e7\u00be\u00e9\u0098\u00d4\u00d9sy@\u0013n\u0085\u0015\r4\u00bc\u00c6\u00a6B\u00e4\u00e8\u00dbQ\u00a3\u00ed\u00f1\u00b1\u0007\u00ec#N\u0085\u00c6E\u0019\u0016PS\u001d\u008a\u00be\u001a\u00d4ve\u0002\u00a6,pl|0&bxo\u00c8#Fh\u0084\u00da\u0080w\u001d\u00ac\u001b\u00075\u00f0\u00a5\u0088\u00b7".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = fC.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                fC.l = stringArray;
                m = new String[3];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    @Override
    public void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        fC.c("C", (Object)this.f, (long)3993157904896308860L, (long)l);
        fC.c("C", (Object)this.g, (int)0, (long)3996497758473652894L, (long)l);
    }

    private String b(Object[] objectArray) {
        Object object;
        long l;
        String string;
        block4: {
            long l2;
            block5: {
                string = (String)objectArray[0];
                l = (Long)objectArray[1];
                l2 = (l = k ^ l) ^ 0x5E41D521EB6BL;
                String string2 = (String)((Object)fC.c("C", (Object)this.f, (Object)string, (long)-5695780424090589782L, (long)l));
                CallSite callSite = fC.c("\u00dd", (long)-5699040912660505586L, (long)l);
                try {
                    try {
                        object = string2;
                        if (callSite != null) break block4;
                        if (object == null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw fC.c("\u00dd", (Object)matchException, (long)-5697154473778531156L, (long)l);
                    }
                    return string2;
                }
                catch (MatchException matchException) {
                    throw fC.c("\u00dd", (Object)matchException, (long)-5697154473778531156L, (long)l);
                }
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l2;
            object = fC.c("C", (Object)this, (Object)objectArray2, (long)-5697705315372991979L, (long)l);
        }
        String string3 = object;
        fC.c("C", (Object)this.f, (Object)string, (Object)string3, (long)-5695839179695302551L, (long)l);
        return string3;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5088;
        if (m[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])fC.n.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    fC.n.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/fC", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = fC.l[n2].getBytes("ISO-8859-1");
            fC.m[n2] = fC.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return m[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = fC.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fC" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fC" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fC.m(l, l2);
            object = o[n];
            try {
                if (!(object instanceof String)) break block2;
                fC.o[n] = clazz = Class.forName(p[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fC.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fC.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fC.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fC.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = o;
        o[0] = "\u0015\u007fz\r_N\u000bw`B8O\u001alm\u0018\u001eI";
        objectArray[1] = "A6J\b/dJ9[GNjA2_\u001d";
        objectArray[2] = ",)=6b5:)8lq\"-b;j}6<%,}6$\u0000";
        objectArray[3] = "AX\")\bV4x)&\u0019\u0019I`:!\u0010P!";
        objectArray[4] = ",\u0011O`e^:\u0011J:vI-ZI<z]<\u001d^+1H\u000b";
        objectArray[5] = "u=v!\u001bQ\u0000\u001d}.\n\u001ea\u0013v%\u000eD\u0015";
        objectArray[6] = "Ql\u0003 o3Zc\u0012o\u0012+Id\u001b&";
        objectArray[7] = "\u0004%\u007f\"[\u0004\u0004%h~W\u000b\u001enh`W\u001e\u0019\u001f::\u0003Z";
        objectArray[8] = "cP-\u001e%mcP:B)by\u001b:\\)w~jk\u0005~5";
        objectArray[9] = Integer.TYPE;
        fC.p[9] = "java/lang/Integer";
        objectArray[10] = "o$)+T,d+8d7!q&7\u000f\u0002#`5+#\u0015.";
        objectArray[11] = "?\u0018\u0010!7\\?\u0018\u0007};S%S\u0007c;F\"\"R<b";
        objectArray[12] = "\u001a\fEnML\u0004\u0004_!/P\u0003\u0019";
        objectArray[13] = "Z\u0013T)\u000bjZ\u0013Cu\u0007e@XCk\u0007pG)\u00136V";
        objectArray[14] = "Oz0\u00052\u007fOz'Y>pU1'G>eR@r\u001fo";
        objectArray[15] = " ?t\u0012]c)1w[\u001em6$qPYnm\u0017xQU\\1?\u007fU\\i";
        objectArray[16] = Boolean.TYPE;
        fC.p[16] = "java/lang/Boolean";
        objectArray[17] = "\nXY/\u001e\f\nXNs\u0012\u0003\u0010\u0013Nm\u0012\u0016\u0017b\u001b2G";
        objectArray[18] = "`\u001fy\u001b9d\u0015?r\u0014(+t1y\u001f,q\u0000";
        objectArray[19] = ")\u001a%i\u0011\u00027\u0012?&|\u0018/\u00176kK\u001e,\u0015";
        objectArray[20] = "w1|\u0013>*a1yI-=vzzO!)g=mXj9+";
        objectArray[21] = "\u000e5\u0005*(\u007f{\u0015\u000e%90\u001a\u001b\u0005.=jn";
        objectArray[22] = "\u00138(xDlf\u0018#wU#\u0007\u0016(|Qys";
        objectArray[23] = Void.TYPE;
        fC.p[23] = "java/lang/Void";
        objectArray[24] = "\u00030T\u0005\u0018^\u001d8NJ{J\u0019";
        objectArray[25] = "7\u000e7_\u0018^)\u0006-\u0010eN)";
        objectArray[26] = "63+Y\nl 3.\u0003\u0019{7x-\u0005\u0015o&?:\u0012^~1";
        objectArray[27] = "\\\u001dU>\"r)=^13=H3U:7g<";
        objectArray[28] = "X f\\/\u001bF(|\u0013L\u000fBeUSu\u001cK";
        objectArray[29] = "8\u00111yni3\u001e 6\u0003m3\u0002\u0014}1p7\u001e$}";
        objectArray[30] = "@0y19~5\u0010r>(1T\u001ey5,k ";
        objectArray[31] = ",ti\u007fN\u0017YTbp_X8Zi{[\u0002L";
        objectArray[32] = "eyy])&{qc\u0012d<a{zNu6al!]s<bql\u0012F'`uf_N={}hYu";
        objectArray[33] = "\u0011f\u0000~\u0014M\u0011f\u0017\"\u0018B\u000b-\u0017<\u0018W\f\\CdO";
        objectArray[34] = "Gz\u0005q6DQz\u0000+%SF1\u0003-)GWv\u0014:bWOv\u001618\u001asm\u0016,8]Dz";
        objectArray[35] = ".;\u007feT;8;z?G,/py9K8>7n.\u0000-\u001c";
        objectArray[36] = "\u00166KAiEc\u0016@Nx\n\u0002\u0018KE|Pv";
        objectArray[37] = "F(wPAiM'f\u001f-jC%dP\u0001";
        objectArray[38] = "[Fb<\u0014`MFgf\u0007wZ\rd`\u000bcKJsw@tt";
        objectArray[39] = "hpY}'@c\u007fH2ZXpxA{KYk}Ky{";
        objectArray[40] = Character.TYPE;
        fC.p[40] = "java/lang/Character";
        objectArray[41] = "z8M&8\u0005d0WiD\u0011~=T*";
        objectArray[42] = "EhSpq/0HX\u007f``QFStd:%";
        objectArray[43] = "*8Ccy\u0018*8T?u\u00170sT!u\u00027\u0002\u0002\u007f!A";
        objectArray[44] = "w\f1x<\u001fa\f4\"/\bvG7$#\u001cg\u0000 3h\rq";
        objectArray[45] = "n]\u0012-LL\u001b}\u0019\"]\u0003zs\u0012)YY\u000e";
        objectArray[46] = "v\u0013]?1U\u00033V0 \u001ab=];$@\u0016";
        objectArray[47] = "p\u0014^L4<p\u0014I\u001083j_I\u000e8&m.\u001bP`b";
        objectArray[48] = ";\u0001(\u0006\u0011'zZ?\u0012x,\u0000Nz^\u001e\"f\rzYGF<Xs\u0013\b&e\u0000'\u0004x";
        objectArray[49] = "\u001d\u001c03$\u0019SQ19BHML22\u0015\u001f\u0013\u001bj^$\u0017\u0012\u001fn/3\u001fF\u0010";
        objectArray[50] = "_JoO\u0011\u0016U\u0011+Fx\u001ae\r*\u001d\u001e\u0017\u0003N*\u001aGs\nCn\u001d\u0011J\u0004\u0012t\\x";
        objectArray[51] = ">R\"\u000ePr3L4\u0013,zXV:\u0005\u001cm @`\u001aG";
        objectArray[52] = "|^\tqE7&U\b'\u007fh\u007fU\rp\u001ad\u007fB>{\u0013FtBw#\u0006w&U\f!\u00023#>";
        objectArray[53] = "eLq:#?qXv>F}wO\u001ca{dr\\|\"&cz3%e'}eSf8 u\n\n!9>jjI|>6\u0005";
        objectArray[54] = "e}v>\u0018,qiq:}yg~\u001be@wrm{&\u001dpz\u0002\"a\u001cneba<\u001bf\n";
        objectArray[55] = "*|9BbTs$mU\u0012_qsu[sRm\u0015jQ\u007fR-mb]xI\u0016\u007fjM}N{lvM,4";
        objectArray[56] = "0=/!tOj(9\u001eqZ(\u0015=nm390/qk^*,/ \u0011";
        objectArray[57] = "hfh7x\u0012)=\u007f#\u0011\u001aS):ow\u00175j:h.s95|=k\u001e*)|l\u0011";
        objectArray[58] = "$\u0006N\u0015DS5\u0019JG<\f2\t\u000f;Z\u0016_G\n\u0004\u0003\u0001$E\u000e@\u0006ja\u0000\rEW\u0011c\u0004I@<";
        objectArray[59] = "\u0017\u0018n[\u000e\u0003N@:L~\u0002P<;S\u0002\u0012+\u001b=T\u0011\u0019F\b!T@c";
        objectArray[60] = "\u007f#groxs!a)\u0012f/ebs~T\u007f%=+\u0012>%ck-,l;p{\u0014";
        objectArray[61] = "\u000f\"S\u00104\u001c\b \f\u0004\u000b\u0013\rcQ\rgz\u000e+R\u0004s\b\u0011v\u0004\r\u000b\u0000LtGTm\u0007N+Sk";
        objectArray[62] = "m!R\u0012o+y5U\u0016\nzf3V\n\n~3#\u0002\u00193pb9Cp";
        objectArray[63] = "JmE78/\u0018sV'\u0001t\u001av_9mFK1\u0003a9\u0011Kc\u000f.qq\u0012;[9\u0001lJ2^f9lGkN^";
        objectArray[64] = "G-nH>\u007fQwq\u0013Fn 0%E cFs%By\u0007J,c\u0017<jY0cFF";
        objectArray[65] = "f;9\u000f$roh9[Z xl6\u00063,Ab6\u00167Juh-\u0004 'ft-UZ";
        objectArray[66] = "\u0000_6^v\u000bY@$\u0000\rXaEe\\kV\u0007\u0006e[22\u000e\u000b!\\d\u000b\u0000Z;\u001d\r";
        objectArray[67] = "c`^N/K%o\u0004LT]\u001a&YJ,[ze\u0004M$4";
        objectArray[68] = "\u00142.\n\u000fHMjz\u001d\u007fVA?c\u00178F(b#\u001b\u0007GH!~\u001c\u000f(\u00142.\n\u000fHMjz\u001d\u007f";
        objectArray[69] = "z7z'I7#o.09:?##3BW\u007fc+/V7<>,'9=%!%-T.9!tW";
        objectArray[70] = "\u001agV\u001e|&C?\u0002\t\f-Fg\u001c'pF\u0018w\u0018Qg=\u001as\\T\f=\u0016`\t\u0016~\"K6\u0000n";
        objectArray[71] = "d\u00076\u0000J$n\\r\t#+^\u0005z\u0001^# Z5\u0003GA";
        objectArray[72] = "E@\u0018\u0000QnQT\u001f\u00044/KM\u0018b\n-T\u0000\u001e\u0019\b)\u0010\u0005u";
        objectArray[73] = "/~iPjdtlnBPs}r4Z<A)>h\u0000n\u0016 jj\u0007l&wveAP";
        objectArray[74] = "QTm\u0006QH\u001f\u0019l\f7\u0019\u0001\u0004o\u0007`N^Y4k\b\u0007]\u00041\u0019S\u0015Z\u0016";
        objectArray[75] = "t2mILu(,*O.{(3qLBI\u007f~/\u0015.w++k\u001aAl==-+";
        objectArray[76] = "\u001asH+\u001bbHm[;\"3Jhi>X=A{2~KlWdR'\u00138@\u0014";
        objectArray[77] = "-eTAD@wnU\u0017~\u0005%y*\u0013\u0007\u0000wnQ\u0011\u0003Dr\u0005E\u001c\u0003C!<KM\u0019\u0002H";
        objectArray[78] = "E\u007fgj\u0015\u007f\u001cv 8zwYta:\u0006q_\u0019x=\u0005)@e\"(\u0013\u0016";
        objectArray[79] = "WIYRmG\u0019\u0004XX\u000b\u001d\u000b\b_Xg/_I\u0001\u0005\u000b\u0013\\\u000b@Xn\u0007\u000bKO?";
        objectArray[80] = "9p1\u0006ZI`(e\u0011*UbB}\fKOj\u0019=\u001f\u001aYuydGNN\u0005";
        objectArray[81] = "\u0016\u0001Ur\u00188\u0007\u0018Paw*k\u0007\u0006!\u0011$\rD\u0006&H@\u0004IB!\u001ey\n\u0018X`w";
        objectArray[82] = "^]Bnt\u0005\u001f\u0006Uz\u001d\be\u0012\u00106{\u0000\u0003Q\u00101\"dY\u0004\u0019{m\u0004\u0000\\Ml\u001d";
        objectArray[83] = ":FtwuScYf)\u000e\u0001[\\'uh\u000e=\u001f'r1j4\u0012cugS:Cy4\u000e";
        objectArray[84] = "PYFA>W\t\u0001\u0012VNM\u0001H\u0012X%ZlS\u0015\\(\f\u0014[\u0019[37\u000fS\u001bWuO\u0007_\u001cLN\u000b\u0005\u0000\u0006A.R]T\u00111";
        objectArray[85] = "F(\u000f-i=\u0014<QyS\"V<M!/$PQT&,|O-\u000e3:C";
        objectArray[86] = "^\\1\u0014 _J\u000bq\u001bG_X\u001a.\f+m\u000fV~SGVL^+Q9\u0004X\u0000\u007fk";
        objectArray[87] = "F1\u001a+ppR%\u001d/\u0015+R\u0003\u00121i;)$\u00146z0D7\b6+J";
        objectArray[88] = "gS\u0001\u0019\u001d\u007f=F\u0017&\u001entA~\u001fEb|R\u001e\\\u0018et=";
        objectArray[89] = "J8(sHI\u0013`|d8M\u001b7w\u007fX)H(f<SRJ,\"98";
        objectArray[90] = "aVrf,s \rerE{ZXk{\"qc\u0017|g5\u0012d\u0014ad&++\u0003}sE";
        objectArray[91] = "3Zk\u0013{\u0011'Nl\u0017\u001eF:Y|\u0000EF %f\u0017b\u00123L?\u001e%@\\";
        objectArray[92] = "'\u0012\u0001~\u0013q~\r\u0013 h\"F\bR|\u000e, KR{WHz\u001e[1\u0018(#F\u000f&h";
        objectArray[93] = "\u0006x\\\u0003\u0018p\tbZUh|\tum\u0004\fn\t\t\nP\tk\u000biI\r\u000ecd";
        objectArray[94] = "\u0016O\t\bI<\u0007V\f\u001b&-kIZ[@ \r\nZ\\\u0019D\u001b\r\u0011\u0004C>\tQZ\u0018&";
        objectArray[95] = "\u001ctZv\t{KhU05*P}\u001e%I,V\u0010\u0007\"JtIl]7\\K";
        objectArray[96] = "\u0002&=\u0013\u000e\u001f\r<;E~\u0013\r+\u0011\u0010\u000f|Yj3\u0005\u0011\u001c\u001a74\r~";
        objectArray[97] = "\u0006lbLR\u0017\u0011d6Cj\u0003\r!<\u0015\u00061]acMj[\u0007'5KT\t\u00194%r";
        Object[] objectArray2 = objectArray;
        objectArray[98] = "ObgsZGH\"$-aN\" cu\u0007CDccr^'\u001e6j8\u0011GGn>/a";
    }

    private String d(Object[] objectArray) {
        Object object;
        block3: {
            CallSite callSite;
            long l;
            block4: {
                l = (Long)objectArray[0];
                l = k ^ l;
                callSite = fC.c("C", (String)((Object)fC.c("C", (Object)this.a, (long)5273367618373303412L, (long)l)), (long)5272053587242984934L, (long)l);
                CallSite callSite2 = fC.c("\u00dd", (long)5273656669660325321L, (long)l);
                try {
                    object = (String)((Object)fC.c("C", (Object)this.c, (long)5273367618373303412L, (long)l));
                    if (callSite2 != null) break block3;
                    if (fC.c("C", (Object)object, (Object)fC.b("x", (int)27528, (long)(0x35FCF53DD71EF23EL ^ l)), (long)5273520421492816684L, (long)l) == false) break block4;
                }
                catch (MatchException matchException) {
                    throw fC.c("\u00dd", (Object)matchException, (long)5271637636596747627L, (long)l);
                }
                StringBuilder stringBuilder = new StringBuilder();
                CallSite callSite3 = fC.b("x", (int)7662, (long)(0x4FEB16F31C87045AL ^ l));
                for (int i = 0; i < 4; ++i) {
                    fC.c("C", (Object)stringBuilder, (char)fC.c("C", (Object)callSite3, (int)fC.c("C", (Object)dn_0.a, (int)fC.c("C", (Object)callSite3, (long)5271565718047904156L, (long)l), (long)5273924659110591913L, (long)l), (long)5273626359818666340L, (long)l), (long)5274099012776315725L, (long)l);
                    if (callSite2 == null) continue;
                }
                return (String)((Object)callSite) + (String)((Object)fC.c("\u00dd", (Object)stringBuilder, (long)5273437246089806212L, (long)l));
            }
            object = (String)((Object)callSite) + (int)fC.c("C", (Object)this.g, (long)5274593796484291344L, (long)l);
        }
        return object;
    }

    @Override
    public void d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        fC.c("C", (Object)this.f, (long)3245354213202013215L, (long)l);
        fC.c("C", (Object)this.g, (int)0, (long)3248557725187936509L, (long)l);
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = fC.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00cd' || c == '\u00cf' || c == '\u00f6' || c == '\u00c8') {
                field = fC.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00cd' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00cf' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f6' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fC.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'C' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00dd' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(Object[] objectArray) {
        Object object;
        block32: {
            CallSite callSite;
            long l;
            long l2;
            String string;
            block29: {
                CallSite callSite2;
                block31: {
                    block30: {
                        block27: {
                            block28: {
                                String string2;
                                block26: {
                                    string = (String)objectArray[0];
                                    l2 = (Long)objectArray[1];
                                    l = (l2 = k ^ l2) ^ 0x186504838666L;
                                    callSite = fC.c("\u00dd", (long)-1729946466321003749L, (long)l2);
                                    try {
                                        string2 = string;
                                        if (callSite != null) break block26;
                                        if (string2 == null) return true;
                                    }
                                    catch (MatchException matchException) {
                                        throw fC.c("\u00dd", (Object)matchException, (long)-1730883545449471047L, (long)l2);
                                    }
                                    string2 = string;
                                }
                                try {
                                    try {
                                        object = fC.c("C", string2, (long)-1737603177817776024L, (long)l2);
                                        if (callSite != null) break block27;
                                        if (object == false) break block28;
                                        return true;
                                    }
                                    catch (MatchException matchException) {
                                        throw fC.c("\u00dd", (Object)matchException, (long)-1730883545449471047L, (long)l2);
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw fC.c("\u00dd", (Object)matchException, (long)-1730883545449471047L, (long)l2);
                                }
                            }
                            object = fC.c("C", (Object)((Boolean)((Object)fC.c("C", (Object)this.e, (long)-1730235483248160090L, (long)l2))), (long)-1730408040116954363L, (long)l2);
                        }
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                if (callSite != null) break block29;
                                                if (object != false) break block30;
                                            }
                                            catch (MatchException matchException) {
                                                throw fC.c("\u00dd", (Object)matchException, (long)-1730883545449471047L, (long)l2);
                                            }
                                            callSite2 = fC.c("\u00cd", (Object)b, (long)-1738292005021900999L, (long)l2);
                                            if (callSite != null) break block31;
                                        }
                                        catch (MatchException matchException) {
                                            throw fC.c("\u00dd", (Object)matchException, (long)-1730883545449471047L, (long)l2);
                                        }
                                        if (callSite2 == null) break block30;
                                    }
                                    catch (MatchException matchException) {
                                        throw fC.c("\u00dd", (Object)matchException, (long)-1730883545449471047L, (long)l2);
                                    }
                                    object = fC.c("C", string, (Object)fC.c("C", (Object)fC.c("C", (Object)fC.c("\u00cd", (Object)b, (long)-1738292005021900999L, (long)l2), (long)-1732677995179285512L, (long)l2), (long)-1729639809687005472L, (long)l2), (long)-1730091493401602562L, (long)l2);
                                    if (callSite != null) break block29;
                                }
                                catch (MatchException matchException) {
                                    throw fC.c("\u00dd", (Object)matchException, (long)-1730883545449471047L, (long)l2);
                                }
                                if (object == false) break block30;
                                return true;
                            }
                            catch (MatchException matchException) {
                                throw fC.c("\u00dd", (Object)matchException, (long)-1730883545449471047L, (long)l2);
                            }
                        }
                        catch (MatchException matchException) {
                            throw fC.c("\u00dd", (Object)matchException, (long)-1730883545449471047L, (long)l2);
                        }
                    }
                    callSite2 = fC.c("C", (Object)this.d, (long)-1730235483248160090L, (long)l2);
                }
                object = fC.c("C", (Object)((Boolean)((Object)callSite2)), (long)-1730408040116954363L, (long)l2);
            }
            try {
                try {
                    try {
                        try {
                            if (callSite != null) return (boolean)object;
                            if (object == false) break block32;
                        }
                        catch (MatchException matchException) {
                            throw fC.c("\u00dd", (Object)matchException, (long)-1730883545449471047L, (long)l2);
                        }
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l;
                        objectArray2[0] = string;
                        object = fC.c("C", (Object)fC.c("\u00f6", (long)-1738154842199473108L, (long)l2), (Object)objectArray2, (long)-1730459763456465622L, (long)l2);
                        if (callSite != null) return (boolean)object;
                    }
                    catch (MatchException matchException) {
                        throw fC.c("\u00dd", (Object)matchException, (long)-1730883545449471047L, (long)l2);
                    }
                    if (object == false) break block32;
                    return true;
                }
                catch (MatchException matchException) {
                    throw fC.c("\u00dd", (Object)matchException, (long)-1730883545449471047L, (long)l2);
                }
            }
            catch (MatchException matchException) {
                throw fC.c("\u00dd", (Object)matchException, (long)-1730883545449471047L, (long)l2);
            }
        }
        object = 0;
        return (boolean)object;
    }

    @Override
    public String a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return (int)fC.c("C", (Object)this.f, (long)-811421512971089612L, (long)l) + (String)((Object)fC.b("x", (int)23932, (long)(0x50A19AEF4A1B795AL ^ l)));
    }

    @bP
    public void a(bc_0 bc_02) {
        CallSite callSite;
        CallSite callSite2;
        CallSite callSite3;
        long l;
        block23: {
            CallSite callSite4;
            block26: {
                block21: {
                    CallSite callSite5;
                    block22: {
                        CallSite callSite6;
                        block20: {
                            l = k ^ 0x192A521C9FB2L;
                            callSite3 = fC.c("C", (Object)bc_02, (Object)new Object[0], (long)-8283977991888322202L, (long)l);
                            callSite4 = fC.c("\u00dd", (long)-8282245071689817623L, (long)l);
                            try {
                                callSite6 = callSite3;
                                if (callSite4 != null) break block20;
                                if (callSite6 == null) break block21;
                            }
                            catch (MatchException matchException) {
                                throw fC.c("\u00dd", (Object)matchException, (long)-8284132156949264053L, (long)l);
                            }
                            callSite6 = callSite3;
                        }
                        try {
                            try {
                                callSite5 = fC.c("C", (Object)callSite6, (long)-8281917153392162150L, (long)l);
                                if (callSite4 != null) break block22;
                                if (callSite5 != false) break block21;
                            }
                            catch (MatchException matchException) {
                                throw fC.c("\u00dd", (Object)matchException, (long)-8284132156949264053L, (long)l);
                            }
                            callSite5 = fC.c("C", (Object)this.f, (long)-8283316580531903000L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw fC.c("\u00dd", (Object)matchException, (long)-8284132156949264053L, (long)l);
                        }
                    }
                    if (callSite5 == false) break block26;
                }
                return;
            }
            callSite2 = callSite3;
            CallSite callSite7 = fC.c("C", (Object)fC.c("C", (Object)this.f, (long)-8284215594774007985L, (long)l), (long)-8282740522618535082L, (long)l);
            while (fC.c("C", (Object)callSite7, (long)-8281981300258689031L, (long)l) != false) {
                String string;
                CallSite callSite8;
                Map.Entry entry;
                block25: {
                    CallSite callSite9;
                    String string2;
                    block24: {
                        entry = (Map.Entry)((Object)fC.c("C", (Object)callSite7, (long)-8284251778056861512L, (long)l));
                        string2 = (String)((Object)fC.c("C", (Object)entry, (long)-8284844599039377402L, (long)l));
                        try {
                            try {
                                callSite = fC.c("C", string2, (long)-8281917153392162150L, (long)l);
                                if (callSite4 != null) break block23;
                                if (callSite4 != null) break block24;
                            }
                            catch (MatchException matchException) {
                                throw fC.c("\u00dd", (Object)matchException, (long)-8284132156949264053L, (long)l);
                            }
                            if (callSite != false) continue;
                        }
                        catch (MatchException matchException) {
                            throw fC.c("\u00dd", (Object)matchException, (long)-8284132156949264053L, (long)l);
                        }
                        try {
                            callSite8 = callSite2;
                            string = string2;
                            if (callSite4 != null) break block25;
                            callSite9 = fC.c("C", (Object)callSite8, (Object)string, (long)-8281090746507799615L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw fC.c("\u00dd", (Object)matchException, (long)-8284132156949264053L, (long)l);
                        }
                    }
                    if (callSite9 == false) continue;
                    callSite8 = callSite2;
                    string = string2;
                }
                callSite2 = fC.c("C", (Object)callSite8, (Object)string, (Object)((CharSequence)((Object)fC.c("C", (Object)entry, (long)-8284048280488709843L, (long)l))), (long)-8283437348065052547L, (long)l);
                if (callSite4 == null) continue;
            }
            callSite = fC.c("C", (Object)callSite2, (Object)callSite3, (long)-8282390384385769716L, (long)l);
        }
        try {
            if (callSite == false) {
                fC.c("C", (Object)bc_02, (Object)new Object[]{callSite3}, (long)-8282403186132123567L, (long)l);
                fC.c("C", (Object)bc_02, (Object)new Object[]{callSite2}, (long)-8283638930970010084L, (long)l);
                fC.c("C", (Object)bc_02, (Object)new Object[0], (long)-8281283219737747538L, (long)l);
            }
        }
        catch (MatchException matchException) {
            throw fC.c("\u00dd", (Object)matchException, (long)-8284132156949264053L, (long)l);
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    /*
     * Unable to fully structure code
     */
    @bP
    public void a(bG var1_1) {
        block33: {
            block32: {
                block28: {
                    block29: {
                        v0 = var2_2 = fC.k ^ 116972037746627L;
                        var4_3 = v0 ^ 116792688418618L;
                        var6_4 = v0 ^ 110630585092143L;
                        var8_5 = v0 ^ 13569329516655L;
                        var10_6 = fC.c("\u00dd", (long)4431259140780478872L, (long)var2_2);
                        try {
                            v1 = fC.c("\u00cd", (Object)fC.b, (long)4430840593939859525L, (long)var2_2);
                            if (var10_6 != null) break block28;
                            if (v1 != null) break block29;
                        }
                        catch (MatchException v2) {
                            throw fC.c("\u00dd", (Object)v2, (long)4429759695833053498L, (long)var2_2);
                        }
                        return;
                    }
                    v1 = fC.c("\u00cd", (Object)fC.b, (long)4430840593939859525L, (long)var2_2);
                }
                var11_7 = fC.c("C", (Object)fC.c("C", (Object)v1, (long)4430776680656276186L, (long)var2_2), (long)4429536120433844906L, (long)var2_2);
                while (fC.c("C", (Object)var11_7, (long)4422832440406024072L, (long)var2_2) != false) {
                    block31: {
                        block30: {
                            var12_8 = (class_1657)fC.c("C", (Object)var11_7, (long)4429606543597205705L, (long)var2_2);
                            var13_9 = fC.c("C", (Object)fC.c("C", (Object)var12_8, (long)4422564377662575013L, (long)var2_2), (long)4430439974280203363L, (long)var2_2);
                            try {
                                try {
                                    v3 = new Object[2];
                                    v3[1] = var6_4;
                                    v3[0] = var13_9;
                                    v4 = fC.c("C", (Object)this, (Object)v3, (long)4422923742786743403L, (long)var2_2);
                                    if (var10_6 == null) {
                                        if (var10_6 != null) break block30;
                                    }
                                    ** GOTO lbl76
                                }
                                catch (MatchException v5) {
                                    throw fC.c("\u00dd", (Object)v5, (long)4429759695833053498L, (long)var2_2);
                                }
                                if (v4 != false) continue;
                            }
                            catch (MatchException v6) {
                                throw fC.c("\u00dd", (Object)v6, (long)4429759695833053498L, (long)var2_2);
                            }
                            try {
                                v7 = var13_9;
                                if (var10_6 != null) break block31;
                                v8 = fC.c("C", (Object)v7, (long)4429687629894264269L, (long)var2_2);
                            }
                            catch (MatchException v9) {
                                throw fC.c("\u00dd", (Object)v9, (long)4429759695833053498L, (long)var2_2);
                            }
                        }
                        try {
                            if (v8 < 3) {
                                continue;
                            }
                        }
                        catch (MatchException v10) {
                            throw fC.c("\u00dd", (Object)v10, (long)4429759695833053498L, (long)var2_2);
                        }
                        v11 = new Object[2];
                        v11[1] = var4_3;
                        v11[0] = var13_9;
                        v7 = fC.c("C", (Object)this, (Object)v11, (long)4423421142280552761L, (long)var2_2);
                    }
                    if (var10_6 == null) continue;
                }
                try {
                    try {
                        v12 = fC.c("C", (Object)fC.b, (long)4430690133150693785L, (long)var2_2);
                        if (var10_6 != null) break block32;
                        if (v12 == null) break block33;
                    }
                    catch (MatchException v13) {
                        throw fC.c("\u00dd", (Object)v13, (long)4429759695833053498L, (long)var2_2);
                    }
                    v12 = fC.c("C", (Object)fC.b, (long)4430690133150693785L, (long)var2_2);
                }
                catch (MatchException v14) {
                    throw fC.c("\u00dd", (Object)v14, (long)4429759695833053498L, (long)var2_2);
                }
            }
            var11_7 = fC.c("C", (Object)fC.c("C", (Object)v12, (long)4429995923250774066L, (long)var2_2), (long)4429949136080405644L, (long)var2_2);
            while (true) {
                block36: {
                    block35: {
                        block34: {
                            v4 = fC.c("C", (Object)var11_7, (long)4422832440406024072L, (long)var2_2);
lbl76:
                            // 2 sources

                            if (v4 == false) break;
                            var12_8 = (class_640)fC.c("C", (Object)var11_7, (long)4429606543597205705L, (long)var2_2);
                            try {
                                v15 = var12_8;
                                if (var10_6 != null) break block34;
                                if (v15 == null) continue;
                            }
                            catch (MatchException v16) {
                                throw fC.c("\u00dd", (Object)v16, (long)4429759695833053498L, (long)var2_2);
                            }
                            v15 = var12_8;
                        }
                        try {
                            v17 = fC.c("C", (Object)v15, (long)4430976115407673131L, (long)var2_2);
                            if (var10_6 != null) break block35;
                            if (v17 == null) {
                                continue;
                            }
                        }
                        catch (MatchException v18) {
                            throw fC.c("\u00dd", (Object)v18, (long)4429759695833053498L, (long)var2_2);
                        }
                        v17 = fC.c("C", (Object)var12_8, (long)4430976115407673131L, (long)var2_2);
                    }
                    v19 = new Object[2];
                    v19[1] = var8_5;
                    v19[0] = v17;
                    var13_9 = fC.c("\u00dd", (Object)v19, (long)4429190811450913418L, (long)var2_2);
                    if (var13_9 == null) continue;
                    try {
                        try {
                            v20 = this;
                            v21 = var13_9;
                            if (var10_6 != null) break block36;
                            v22 = new Object[2];
                            v22[1] = var6_4;
                            v22[0] = v21;
                            if (fC.c("C", (Object)v20, (Object)v22, (long)4422923742786743403L, (long)var2_2) != false) {
                                continue;
                            }
                        }
                        catch (MatchException v23) {
                            throw fC.c("\u00dd", (Object)v23, (long)4429759695833053498L, (long)var2_2);
                        }
                    }
                    catch (MatchException v24) {
                        throw fC.c("\u00dd", (Object)v24, (long)4429759695833053498L, (long)var2_2);
                    }
                    v20 = this;
                    v21 = var13_9;
                }
                v25 = new Object[2];
                v25[1] = var4_3;
                v25[0] = v21;
                fC.c("C", (Object)v20, (Object)v25, (long)4423421142280552761L, (long)var2_2);
                if (var10_6 != null) break;
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @bP
    public void a(bb_0 bb_02) {
        CallSite callSite;
        fC fC2;
        long l;
        long l2;
        block12: {
            CallSite callSite2;
            block13: {
                CallSite callSite3;
                CallSite callSite4;
                long l3;
                block11: {
                    long l4 = l2 = k ^ 0x5C4CF10A6598L;
                    l = l4 ^ 0x5C16B77CD561L;
                    l3 = l4 ^ 0x52B06D718274L;
                    callSite2 = fC.c("C", (Object)bb_02, (Object)new Object[0], (long)8584852315172389182L, (long)l2);
                    callSite4 = fC.c("\u00dd", (long)8585488835585252291L, (long)l2);
                    try {
                        try {
                            callSite3 = callSite2;
                            if (callSite4 != null) break block11;
                            if (!(callSite3 instanceof class_1657)) return;
                        }
                        catch (MatchException matchException) {
                            throw fC.c("\u00dd", (Object)matchException, (long)8584596288760247137L, (long)l2);
                        }
                        callSite3 = callSite2;
                    }
                    catch (MatchException matchException) {
                        throw fC.c("\u00dd", (Object)matchException, (long)8584596288760247137L, (long)l2);
                    }
                }
                class_1657 class_16572 = (class_1657)callSite3;
                try {
                    if (callSite4 != null) {
                        return;
                    }
                }
                catch (MatchException matchException) {
                    throw fC.c("\u00dd", (Object)matchException, (long)8584596288760247137L, (long)l2);
                }
                callSite2 = fC.c("C", (Object)fC.c("C", (Object)class_16572, (long)8591510127655754750L, (long)l2), (long)8585870250428450360L, (long)l2);
                try {
                    try {
                        fC2 = this;
                        callSite = callSite2;
                        if (callSite4 != null) break block12;
                        Object[] objectArray = new Object[2];
                        objectArray[1] = l3;
                        objectArray[0] = callSite;
                        if (fC.c("C", (Object)fC2, (Object)objectArray, (long)8591275564553840176L, (long)l2) == false) break block13;
                        return;
                    }
                    catch (MatchException matchException) {
                        throw fC.c("\u00dd", (Object)matchException, (long)8584596288760247137L, (long)l2);
                    }
                }
                catch (MatchException matchException) {
                    throw fC.c("\u00dd", (Object)matchException, (long)8584596288760247137L, (long)l2);
                }
            }
            fC2 = this;
            callSite = callSite2;
        }
        Object[] objectArray = new Object[2];
        objectArray[1] = l;
        objectArray[0] = callSite;
        CallSite callSite5 = fC.c("C", (Object)fC2, (Object)objectArray, (long)8590634130106846050L, (long)l2);
        fC.c("C", (Object)bb_02, (Object)new Object[]{fC.c("\u00dd", (Object)callSite5, (long)8591700162303290365L, (long)l2)}, (long)8583979133529536127L, (long)l2);
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
            case 0 -> 44;
            case 1 -> 11;
            case 2 -> 31;
            case 3 -> 30;
            case 4 -> 27;
            case 5 -> 63;
            case 6 -> 56;
            case 7 -> 47;
            case 8 -> 55;
            case 9 -> 45;
            case 10 -> 8;
            case 11 -> 36;
            case 12 -> 58;
            case 13 -> 15;
            case 14 -> 26;
            case 15 -> 33;
            case 16 -> 49;
            case 17 -> 38;
            case 18 -> 23;
            case 19 -> 5;
            case 20 -> 3;
            case 21 -> 39;
            case 22 -> 24;
            case 23 -> 13;
            case 24 -> 4;
            case 25 -> 1;
            case 26 -> 37;
            case 27 -> 9;
            case 28 -> 10;
            case 29 -> 51;
            case 30 -> 20;
            case 31 -> 34;
            case 32 -> 21;
            case 33 -> 53;
            case 34 -> 61;
            case 35 -> 43;
            case 36 -> 16;
            case 37 -> 12;
            case 38 -> 19;
            case 39 -> 22;
            case 40 -> 41;
            case 41 -> 59;
            case 42 -> 54;
            case 43 -> 0;
            case 44 -> 60;
            case 45 -> 42;
            case 46 -> 18;
            case 47 -> 62;
            case 48 -> 52;
            case 49 -> 25;
            case 50 -> 28;
            case 51 -> 50;
            case 52 -> 2;
            case 53 -> 40;
            case 54 -> 35;
            case 55 -> 57;
            case 56 -> 48;
            case 57 -> 32;
            case 58 -> 29;
            case 59 -> 17;
            case 60 -> 46;
            case 61 -> 6;
            case 62 -> 14;
            default -> 7;
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
        fC.p[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = fC.m(l, l2);
        Object object = o[n];
        if (object instanceof String) {
            String string = p[n];
            int n2 = string.indexOf(8);
            Class clazz = fC.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fC.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fC.g(clazz3, string2, clazz2)) != null) {
                    fC.o[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fC.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fC.o[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fC.n(117131478012717L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = fC.m(l, l2);
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
                clazz3 = fC.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fC.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fC.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        fC.o[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fC.n(117131478012717L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fC.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fC.o[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fC.n(117131478012717L, 0L);
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
            return MethodHandles.lookup().findStatic(fC.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(fC.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


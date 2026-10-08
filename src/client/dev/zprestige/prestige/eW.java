/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aK;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.dC;
import dev.zprestige.prestige.dF;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dR;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.q_0;
import dev.zprestige.prestige.t_0;
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
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1297;
import net.minecraft.class_1657;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class eW
extends dV
implements dF {
    private dM d;
    private dM a;
    private dO c;
    private dO e;
    private dR f;
    private t_0 g = t_0.IDLE;
    private class_1297 h;
    private float i;
    private boolean j;
    private static final long k = hc.a(-4668898929867961500L, 3796228785748930147L, MethodHandles.lookup().lookupClass()).a(124379050227558L);
    private static final String[] l;
    private static final String[] m;
    private static final Map n;
    private static final Object[] o;
    private static final String[] p;

    /*
     * Enabled aggressive block sorting
     */
    static {
        o = new Object[78];
        p = new String[78];
        eW.f();
        n = new HashMap(13);
        long l = k ^ 0x4E880A000591L;
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
        String[] stringArray = new String[2];
        int n = 0;
        String string = "\u00a0\u00c0\u00f0\u000f\u00e1n\u00bdL&\u00fag\u00ca2=g\u00e3\u00104\u0015\u001etQ\u0017_0\u00da\u00fa\u00d6\u0093\u00152\u0081\u0092";
        int n2 = "\u00a0\u00c0\u00f0\u000f\u00e1n\u00bdL&\u00fag\u00ca2=g\u00e3\u00104\u0015\u001etQ\u0017_0\u00da\u00fa\u00d6\u0093\u00152\u0081\u0092".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = eW.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                eW.l = stringArray;
                m = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    @Override
    public void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x7FAB131DDD11L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = this;
        eW.c("W", (Object)eW.c("\u00dd", (long)3996338565250034730L, (long)l), (Object)objectArray2, (long)3992469023321977777L, (long)l);
        this.g = t_0.IDLE;
        this.h = null;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x62EF;
        if (m[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])eW.n.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    eW.n.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/eW", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = eW.l[n2].getBytes("ISO-8859-1");
            eW.m[n2] = eW.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return m[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = eW.b(n, l);
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
            throw new RuntimeException("dev/zprestige/prestige/eW" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/eW" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = eW.m(l, l2);
            object = o[n];
            try {
                if (!(object instanceof String)) break block2;
                eW.o[n] = clazz = Class.forName(p[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = eW.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = eW.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = eW.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = eW.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = o;
        o[0] = "<\u0004A1&\u00187\u000bP~E\u0015\"\r";
        objectArray[1] = Double.TYPE;
        eW.p[1] = "java/lang/Double";
        objectArray[2] = "\u000eI_,J\u0006\u0018IZvY\u0011\u000f\u0002YpU\u0005\u001eENg\u001e\u0017\"";
        objectArray[3] = ">`m=}BK@f2l\r6Xu5eD^";
        objectArray[4] = "\u0015\"W\u001a[:\u0015\"@FW5\u000fi@XW \b\u0018\u0012\u0002\u0003d";
        objectArray[5] = "JSJJA~JS]\u0016MqP\u0018]\bMdWi\fQ\u001a&";
        objectArray[6] = "U++34.C+.i'9T`-o+-E':x`?z";
        objectArray[7] = "~=DO.\u0004\u000b\u001dO@?Kj\u0013DK;\u0011\u001e";
        objectArray[8] = "'7^`L?'7I<@0=|I\"@%:\r\u001b|\u0018a";
        objectArray[9] = "R\rs-_=R\rdqS2HFdoS'O707\u0004";
        objectArray[10] = Boolean.TYPE;
        eW.p[10] = "java/lang/Boolean";
        objectArray[11] = "d1y|=\u0016d1n 1\u0019~zn>1\fy\u000b>c`";
        objectArray[12] = "\u000b\u0010mL\tV~0fC\u0018\u0019\u001f>mH\u001cCk";
        objectArray[13] = Void.TYPE;
        eW.p[13] = "java/lang/Void";
        objectArray[14] = "V\u0010=BO\u001eV\u0010*\u001eC\u0011L[*\u0000C\u0004K*\u007f_\u001a";
        objectArray[15] = "1\u001bfdWj'\u001bc>D}0P`8Hi!\u0017w/\u0003y9\u0017u$Y4\u0005\fu9Ys2\u001b";
        objectArray[16] = "\fZ\fT3M\u001aZ\t\u000e Z\r\u0011\n\b,N\u001cV\u001d\u001fg[>";
        objectArray[17] = "G89%\u001a\u0016L7(jg\u000e_0!#";
        objectArray[18] = "Kki/)\n>Kb 8E_Ei+<\u001f+";
        objectArray[19] = "6)#z}Z )& nM7b%&bY&%21)O\u0005";
        objectArray[20] = "\\~\u000bI9;Wq\u001a\u0006Z6B|\u0015mo4So\tAx9";
        objectArray[21] = "7h\u0018p)5<g\t?E62e\u000bpi";
        objectArray[22] = "-s te>-s7(i17876i$0I`i?";
        objectArray[23] = "/10\u0011\u0016/915K\u00058.z6M\t,?=!ZB>\"";
        objectArray[24] = ",d>_+[YD5P:\u00148J>[>NL";
        objectArray[25] = "5C=x\u000f\u007f#C8\"\u001ch4\b;$\u0010|%O,3[k\u001a";
        objectArray[26] = "\u000fs\u0001\nq\f\u0004|\u0010E\u0010\u0002\u000fw\u0014\u001f";
        objectArray[27] = "fCmU\u000b3mL|\u001ac3cCo";
        objectArray[28] = Float.TYPE;
        eW.p[28] = "java/lang/Float";
        objectArray[29] = "4G-1{Q\"G(khF5\f+mdR$K<z/E\u0014";
        objectArray[30] = "jhU@\u0007i\u001fH^O\u0016&~FUD\u0012|\n";
        objectArray[31] = "\u0010\u0011U\"\u0017se1^-\u0006<\u0004?U&\u0002fp";
        objectArray[32] = "n\u0005)Ki^p\r3\u0004\u0014Np";
        objectArray[33] = "\u0002\u0019\u0005qG\u001f\u0014\u0019\u0000+T\b\u0003R\u0003-X\u001c\u0012\u0015\u0014:\u0013\u000b%";
        objectArray[34] = "Uk\u0002-4% K\t\"%jAE\u0002)!05";
        objectArray[35] = "Yo\u000e\u0016%oYo\u0019J)`C$\u0019T)uDUH\f{";
        objectArray[36] = "\u0016@\u0011c4\u0011c`\u001al%^\u0002n\u0011g!\u0004v";
        objectArray[37] = "\u000e1`y\u001fG\u000e1w%\u0013H\u0014zw;\u0013]\u0013\u000b'bA\u001c";
        objectArray[38] = "/\u0003\u001a\u001e<Z9\u0003\u001fD/M.H\u001cB#Y?\u000f\u000bUhI$";
        objectArray[39] = "X\nt)\u0017[-*\u007f&\u0006\u0014L$t-\u0002N8";
        objectArray[40] = "\\\u001dQ]\u001boJ\u001dT\u0007\bx]VW\u0001\u0004lL\u0011@\u0016O{\u007f";
        objectArray[41] = "1u\u001aC8DDU\u0011L)\u000b%[\u001aG-QQ";
        objectArray[42] = "mZB-9\u0002>\u001e\u0006-RUWZ\bk4Rk\r\\k7?";
        objectArray[43] = "\u0004'|#\t:A|lf{?87ea\u001dhS2n%DV\u0005);!\n7As{\"{";
        objectArray[44] = "\u0000\u0011@L\\\u0011\\\u000f\f\u0018'\u001fS\u0015\u0011\u0010K-\u0003WKK'ERS\u0010\u0006^\u0017^\b\u0014w";
        objectArray[45] = "D\u0017DJWR\nLIL/\\\u0015FJEx\u000bK\u0011\u0012)\u0011JE\u0010UBMT\tD";
        objectArray[46] = "<\u001dz\u007fqgoY>\u007f\u001a3\u0006\\e?|dmYn{%Z7\u001a>i 6?\u0019ma\u001a";
        objectArray[47] = "g9DB\u0015})bIDms6hJM:$i5\u0011!\u0004$;lPA\bf-}";
        objectArray[48] = "#\u007f\u0013f\u0015\u001b-aR//\u0018Jq\b/^I3j\rhE";
        objectArray[49] = "\u001eKxY+CK\u0010/\b[BO\r\u001a\u001f!LD\u001eA\t+SA\u001f&_dOMq";
        objectArray[50] = "ZgN\u0002N\rDkM\u0013s\u00036kD\u0013\u0003RVe\b\u0003\u0015j[7\b\u001eK\nU{\u0018\bs";
        objectArray[51] = "^}rv4~\u0010&\u007fpLp\u000f,|y\u001b'Q|%\u0015\"aU((y0p\u0002+";
        objectArray[52] = "pm\u0014.xg~i\u0000bCp\u0013w\bo% xr\u0003+|\u001e\"1S9yr*2\u00001C";
        objectArray[53] = "vx&_q\u0000>53\u0010\u0001\u0002b56Gm06tm\u001e:gm,;]bYw'$X\u0001\u0005j$+C?\u001fa;. c\u0002b45\u001ey\t}1VBd\nr*hXo\u0015wI";
        objectArray[54] = "\u0012e&`k'\u001c{g)Q*{n6;>q\u001dj:nl";
        objectArray[55] = "N\u000f@\u0019\u0007;\u0012\u0011\fM|5\u001d\u000b\u0011E\u0010\u0007NNH\u001f|o\u001cM\u0010S\u0005=\u0010\u0016\u0014\"";
        objectArray[56] = "BA\u0003nWm\f\u001a\u000eh/h\u001f\u0001\tjCZK@W</2\u001eG\b|V`\u0012\u001c\f\r";
        objectArray[57] = "E\u007fMBj\r\u0019a\u0001\u0016\u0011\u0003\u0016{\u001c\u001e}1@9@D-f\u0019b\u0011\u0004rX\u0003i\u000e\u0001\u0011";
        objectArray[58] = "&\u0010UK.f,DQ-w?&uNH\u007f##KTC`&@\u0017I@o=~\rB_j^\"\u0010APq`8\u001b^U\u0012";
        objectArray[59] = "O\u0010oQ\u001c\u0002EDk7ZSO\u0019qR \u0003\u0019\u0005w]\u001cPXJ,7";
        objectArray[60] = "mdC)+61&ZpG7;!G)+\u0005ka\u0018qGnld\u001d>);73LN";
        objectArray[61] = "T\tm\u0007\tQZ\ryK2E7\u0013qFT\u0016\\\u0016z\u0002\r(\u0006U*\u0010\bD\u000eVy\u00182";
        objectArray[62] = "~\u001d\\'\u0005H!I\u0006i{E\u0018_Yd\u001d\u0011sZR D/zAP%\u0018\u0011`JO {";
        objectArray[63] = "t$99\bKo!~\"6[\u001e>%tP\fu;.0\t2!){)GKs% -6";
        objectArray[64] = "\u0016QJ&T!R\u000b\n%%%FH\u0010=I\u0017\u0010\u000fMe\u001c@L^\u00020[zK\tI6%";
        objectArray[65] = "sO~u\u007f\u000b/Q2!\u0004\u0005 K/)h7v\tss9`/R\"3g^5Y=6\u0004";
        objectArray[66] = "\u0010\\D]c\rA[TA]\u0007\u0019\u0000\\N4\u000b \u000e\\^0mA\u000b\u0002B,\u0014\u0013\u0007YF]";
        objectArray[67] = "L(\u0016<EtB6Wu\u007f\u007f%/\ru\u0002#\\!\taN";
        objectArray[68] = "\tyT\u0012ceV-\u000e\\\u001dko;QQ{<\u0004>Z\u0015\"\u0002\r%X\u0010~<\u0017.G\u0015\u001d";
        objectArray[69] = "&\u0007tK+Gb]4HZCv\u001e.P6q&Rv\nZ\u0019wX/F#K{\u0003+7";
        objectArray[70] = "$I>ev\u00140DnbF\u0003]B0& T6G;byjl\u0004kp|\u0006d\u00078xF";
        objectArray[71] = "fXlJe\u0011bT9\u0018_\u001e\tIb\u00199IbLi]`w6^<D.\u000edRg@_";
        objectArray[72] = "\u0017\u000e,=\u0006\"\u0017Gc2d3w\u0016f1\u001fk\u0017\u001a0/\u000bZ";
        objectArray[73] = "w]7?\n2nRi,i\"\f\u00172a\u000fug\u00129%VKjU7\"\u0017,5\u0001mli";
        objectArray[74] = "\u0019WR\f\b}\u0004\u000bH\u00007(\u001f\\@\u0019i/\u001fFDeU#\u0016FJ[O(\tC)";
        objectArray[75] = "WVl|'@YOax\u001d\u001a\\6p<|\u0006\u0003V|jb\u00122SqzfG\u000f]hwb}";
        objectArray[76] = "j\rw#\u0001x<Bk/ory\u0000`$\u0014\u001faFh;^\u007fm\u0010v/o lGh1\u0016r`\u001cl@";
        Object[] objectArray2 = objectArray;
        objectArray[77] = "2\u0002\\b3\u001c8VX\u0004jM$gGabY7Y]j}\\T\u0005@irGj\u001fKvw$6\u0002Hyl\u001a,\tW|\u000f";
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d9' || c == '\u00aa' || c == '\u00dd' || c == 'D') {
                field = eW.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d9' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00aa' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00dd' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = eW.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'W' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'k' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = eW.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public void d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x52D6E774439DL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = this;
        eW.c("W", (Object)eW.c("\u00dd", (long)3248928505160152649L, (long)l), (Object)objectArray2, (long)3245131797330801444L, (long)l);
        this.g = t_0.IDLE;
        this.h = null;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return eW.c("k", (Object)((Object)q_0.Crystal), (long)-2444613762990699129L, (long)l);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @bP
    public void a(aK var1_1) {
        block89: {
            block90: {
                block88: {
                    block87: {
                        block85: {
                            block86: {
                                block83: {
                                    block84: {
                                        block81: {
                                            block82: {
                                                block80: {
                                                    block79: {
                                                        block78: {
                                                            block77: {
                                                                block75: {
                                                                    block76: {
                                                                        block91: {
                                                                            block73: {
                                                                                block74: {
                                                                                    block72: {
                                                                                        block70: {
                                                                                            block71: {
                                                                                                block69: {
                                                                                                    v0 = var2_2 = eW.k ^ 71721082974070L;
                                                                                                    var4_3 = v0 ^ 94357226235470L;
                                                                                                    var6_4 = v0 ^ 125590624842747L;
                                                                                                    var8_5 = eW.c("k", (long)-4049020978631479026L, (long)var2_2);
                                                                                                    try {
                                                                                                        if (this.j) {
                                                                                                            return;
                                                                                                        }
                                                                                                    }
                                                                                                    catch (MatchException v1) {
                                                                                                        throw eW.c("k", (Object)v1, (long)-4050735967249152982L, (long)var2_2);
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            v2 = eW.b;
                                                                                                            if (var8_5 != null) break block69;
                                                                                                            if (eW.c("\u00d9", (Object)v2, (long)-4049001882627134680L, (long)var2_2) != null) {
                                                                                                            }
                                                                                                            ** GOTO lbl33
                                                                                                        }
                                                                                                        catch (MatchException v3) {
                                                                                                            throw eW.c("k", (Object)v3, (long)-4050735967249152982L, (long)var2_2);
                                                                                                        }
                                                                                                        v2 = eW.b;
                                                                                                    }
                                                                                                    catch (MatchException v4) {
                                                                                                        throw eW.c("k", (Object)v4, (long)-4050735967249152982L, (long)var2_2);
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    try {
                                                                                                        if (var8_5 != null) break block70;
                                                                                                        if (eW.c("\u00d9", (Object)v2, (long)-4048823639974284324L, (long)var2_2) != null) break block71;
                                                                                                    }
                                                                                                    catch (MatchException v5) {
                                                                                                        throw eW.c("k", (Object)v5, (long)-4050735967249152982L, (long)var2_2);
                                                                                                    }
lbl33:
                                                                                                    // 2 sources

                                                                                                    return;
                                                                                                }
                                                                                                catch (MatchException v6) {
                                                                                                    throw eW.c("k", (Object)v6, (long)-4050735967249152982L, (long)var2_2);
                                                                                                }
                                                                                            }
                                                                                            v2 = eW.b;
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                if (var8_5 != null) break block72;
                                                                                                if (eW.c("\u00d9", (Object)v2, (long)-4050794759583761911L, (long)var2_2) != null) break block73;
                                                                                            }
                                                                                            catch (MatchException v7) {
                                                                                                throw eW.c("k", (Object)v7, (long)-4050735967249152982L, (long)var2_2);
                                                                                            }
                                                                                            v2 = eW.b;
                                                                                        }
                                                                                        catch (MatchException v8) {
                                                                                            throw eW.c("k", (Object)v8, (long)-4050735967249152982L, (long)var2_2);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            v9 = eW.c("W", (Object)v2, (long)-4050353861004979135L, (long)var2_2);
                                                                                            if (var8_5 != null) break block74;
                                                                                            if (v9 == false) break block73;
                                                                                        }
                                                                                        catch (MatchException v10) {
                                                                                            throw eW.c("k", (Object)v10, (long)-4050735967249152982L, (long)var2_2);
                                                                                        }
                                                                                        v9 = eW.c("W", (Object)eW.c("\u00d9", (Object)eW.b, (long)-4049001882627134680L, (long)var2_2), (long)-4050553413413108951L, (long)var2_2);
                                                                                    }
                                                                                    catch (MatchException v11) {
                                                                                        throw eW.c("k", (Object)v11, (long)-4050735967249152982L, (long)var2_2);
                                                                                    }
                                                                                }
                                                                                if (v9 == false) break block91;
                                                                            }
                                                                            return;
                                                                        }
                                                                        try {
                                                                            try {
                                                                                v12 /* !! */  = this.g;
                                                                                if (var8_5 != null) break block75;
                                                                                if (v12 /* !! */  == t_0.IDLE) break block76;
                                                                            }
                                                                            catch (MatchException v13) {
                                                                                throw eW.c("k", (Object)v13, (long)-4050735967249152982L, (long)var2_2);
                                                                            }
                                                                            return;
                                                                        }
                                                                        catch (MatchException v14) {
                                                                            throw eW.c("k", (Object)v14, (long)-4050735967249152982L, (long)var2_2);
                                                                        }
                                                                    }
                                                                    v12 /* !! */  = eW.c("W", (Object)this.a, (long)-4046937773643954897L, (long)var2_2);
                                                                }
                                                                try {
                                                                    try {
                                                                        try {
                                                                            v15 = eW.c("W", (Object)((Boolean)v12 /* !! */ ), (long)-4047342392102568893L, (long)var2_2);
                                                                            if (var8_5 != null) break block77;
                                                                            if (v15 == false) break block78;
                                                                        }
                                                                        catch (MatchException v16) {
                                                                            throw eW.c("k", (Object)v16, (long)-4050735967249152982L, (long)var2_2);
                                                                        }
                                                                        v17 = eW.c("\u00d9", (Object)eW.b, (long)-4049001882627134680L, (long)var2_2);
                                                                        if (var8_5 != null) break block79;
                                                                    }
                                                                    catch (MatchException v18) {
                                                                        throw eW.c("k", (Object)v18, (long)-4050735967249152982L, (long)var2_2);
                                                                    }
                                                                    v15 = eW.c("W", (Object)v17, (long)-4048896658207674409L, (long)var2_2);
                                                                }
                                                                catch (MatchException v19) {
                                                                    throw eW.c("k", (Object)v19, (long)-4050735967249152982L, (long)var2_2);
                                                                }
                                                            }
                                                            if (v15 == false) {
                                                                return;
                                                            }
                                                        }
                                                        v17 = eW.c("W", (Object)var1_1, (Object)new Object[0], (long)-4049139494831013699L, (long)var2_2);
                                                    }
                                                    var9_6 = v17;
                                                    try {
                                                        v20 = var9_6;
                                                        if (var8_5 != null) break block80;
                                                        if (v20 != null) {
                                                        }
                                                        ** GOTO lbl124
                                                    }
                                                    catch (MatchException v21) {
                                                        throw eW.c("k", (Object)v21, (long)-4050735967249152982L, (long)var2_2);
                                                    }
                                                    v20 = var9_6;
                                                }
                                                try {
                                                    try {
                                                        if (var8_5 != null) break block81;
                                                        if (v20 != eW.c("\u00d9", (Object)eW.b, (long)-4049001882627134680L, (long)var2_2)) break block82;
                                                    }
                                                    catch (MatchException v22) {
                                                        throw eW.c("k", (Object)v22, (long)-4050735967249152982L, (long)var2_2);
                                                    }
lbl124:
                                                    // 2 sources

                                                    return;
                                                }
                                                catch (MatchException v23) {
                                                    throw eW.c("k", (Object)v23, (long)-4050735967249152982L, (long)var2_2);
                                                }
                                            }
                                            v20 = eW.c("W", (Object)this.d, (long)-4046937773643954897L, (long)var2_2);
                                        }
                                        try {
                                            try {
                                                try {
                                                    v24 /* !! */  = eW.c("W", (Object)((Boolean)v20), (long)-4047342392102568893L, (long)var2_2);
                                                    if (var8_5 != null) break block83;
                                                    if (v24 /* !! */  == false) break block84;
                                                }
                                                catch (MatchException v25) {
                                                    throw eW.c("k", (Object)v25, (long)-4050735967249152982L, (long)var2_2);
                                                }
                                                v24 /* !! */  = (CallSite)(var9_6 instanceof class_1657);
                                                if (var8_5 != null) break block83;
                                            }
                                            catch (MatchException v26) {
                                                throw eW.c("k", (Object)v26, (long)-4050735967249152982L, (long)var2_2);
                                            }
                                            if (v24 /* !! */  != false) break block84;
                                        }
                                        catch (MatchException v27) {
                                            throw eW.c("k", (Object)v27, (long)-4050735967249152982L, (long)var2_2);
                                        }
                                        return;
                                    }
                                    v24 /* !! */  = (CallSite)(var9_6 instanceof class_1657);
                                }
                                try {
                                    if (var8_5 != null) break block85;
                                    if (v24 /* !! */  == false) break block86;
                                }
                                catch (MatchException v28) {
                                    throw eW.c("k", (Object)v28, (long)-4050735967249152982L, (long)var2_2);
                                }
                                var10_7 = (class_1657)var9_6;
                                try {
                                    v29 = new Object[2];
                                    v29[1] = var4_3;
                                    v29[0] = eW.c("W", (Object)eW.c("W", (Object)var10_7, (long)-4050058853180705484L, (long)var2_2), (long)-4050923889647112861L, (long)var2_2);
                                    v24 /* !! */  = eW.c("W", (Object)eW.c("\u00dd", (long)-4050907751161254805L, (long)var2_2), (Object)v29, (long)-4049942608996059867L, (long)var2_2);
                                    if (var8_5 != null) break block85;
                                    if (v24 /* !! */  == false) break block86;
                                }
                                catch (MatchException v30) {
                                    throw eW.c("k", (Object)v30, (long)-4050735967249152982L, (long)var2_2);
                                }
                                return;
                            }
                            try {
                                v31 = eW.c("\u00dd", (long)-4050479565235403596L, (long)var2_2);
                                if (var8_5 != null) break block87;
                                v32 = new Object[2];
                                v32[1] = var6_4;
                                v32[0] = var9_6;
                                v24 /* !! */  = eW.c("W", (Object)v31, (Object)v32, (long)-4047148558724091051L, (long)var2_2);
                            }
                            catch (MatchException v33) {
                                throw eW.c("k", (Object)v33, (long)-4050735967249152982L, (long)var2_2);
                            }
                        }
                        if (v24 /* !! */  == false) {
                            return;
                        }
                        v31 = eW.c("W", (Object)this.f, (long)-4046937773643954897L, (long)var2_2);
                    }
                    var11_9 = (String)v31;
                    try {
                        v34 = eW.c("W", var11_9, (Object)eW.b("l", (int)13956, (long)(6266994809618273198L ^ var2_2)), (long)-4046644786435619844L, (long)var2_2);
                        if (var8_5 != null) break block88;
                        if (v34 != false) {
                        }
                        ** GOTO lbl200
                    }
                    catch (MatchException v35) {
                        throw eW.c("k", (Object)v35, (long)-4050735967249152982L, (long)var2_2);
                    }
                    var10_8 = -1.0f;
                    try {
                        if (var8_5 == null) break block89;
lbl200:
                        // 2 sources

                        v34 = eW.c("W", var11_9, (Object)eW.b("l", (int)6594, (long)(6329324745778642153L ^ var2_2)), (long)-4046644786435619844L, (long)var2_2);
                    }
                    catch (MatchException v36) {
                        throw eW.c("k", (Object)v36, (long)-4050735967249152982L, (long)var2_2);
                    }
                }
                try {
                    if (var8_5 != null) break block90;
                    if (v34 != false) {
                    }
                    ** GOTO lbl215
                }
                catch (MatchException v37) {
                    throw eW.c("k", (Object)v37, (long)-4050735967249152982L, (long)var2_2);
                }
                var10_8 = 1.0f;
                try {
                    if (var8_5 == null) break block89;
lbl215:
                    // 2 sources

                    v34 = (cfr_temp_0 = eW.c("k", (long)-4050237891639910529L, (long)var2_2) - 0.5) == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                }
                catch (MatchException v38) {
                    throw eW.c("k", (Object)v38, (long)-4050735967249152982L, (long)var2_2);
                }
            }
            try {
                v39 = v34 < 0 ? -1.0f : 1.0f;
            }
            catch (MatchException v40) {
                throw eW.c("k", (Object)v40, (long)-4050735967249152982L, (long)var2_2);
            }
            var10_8 = v39;
        }
        var12_10 = eW.c("k", (float)eW.c("W", (Object)((Float)eW.c("W", (Object)this.c, (long)-4046937773643954897L, (long)var2_2)), (long)-4046825052278915641L, (long)var2_2), (float)eW.c("W", (Object)((Float)eW.c("W", (Object)this.e, (long)-4046937773643954897L, (long)var2_2)), (long)-4046825052278915641L, (long)var2_2), (long)-4050160924150326852L, (long)var2_2);
        var13_11 = eW.c("k", (float)eW.c("W", (Object)((Float)eW.c("W", (Object)this.c, (long)-4046937773643954897L, (long)var2_2)), (long)-4046825052278915641L, (long)var2_2), (float)eW.c("W", (Object)((Float)eW.c("W", (Object)this.e, (long)-4046937773643954897L, (long)var2_2)), (long)-4046825052278915641L, (long)var2_2), (long)-4046718143842233836L, (long)var2_2);
        var14_12 = var12_10 + (float)(eW.c("k", (long)-4050237891639910529L, (long)var2_2) * (double)(var13_11 - var12_10));
        this.i = (float)(eW.c("W", (Object)eW.c("\u00d9", (Object)eW.b, (long)-4049001882627134680L, (long)var2_2), (long)-4050387139615792167L, (long)var2_2) + var10_8 * var14_12);
        this.h = var9_6;
        this.g = t_0.FLICK;
        eW.c("W", (Object)var1_1, (Object)new Object[0], (long)-4048786556159143893L, (long)var2_2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public dC a(Object[] objectArray) {
        class_1297 class_12972;
        class_1297 class_12973;
        long l;
        long l2;
        long l3;
        block17: {
            block18: {
                CallSite callSite;
                block16: {
                    eW eW2;
                    block15: {
                        t_0 t_02;
                        t_0 t_03;
                        block13: {
                            block14: {
                                l3 = (Long)objectArray[0];
                                long l4 = l3;
                                l2 = l4 ^ 0x53005072D29FL;
                                l = l4 ^ 0x4A729CB41116L;
                                callSite = eW.c("k", (long)-1174331069531039373L, (long)l3);
                                try {
                                    try {
                                        t_03 = this.g;
                                        t_02 = t_0.IDLE;
                                        if (callSite != null) break block13;
                                        if (t_03 != t_02) break block14;
                                        return null;
                                    }
                                    catch (MatchException matchException) {
                                        throw eW.c("k", (Object)matchException, (long)-1173775000276931497L, (long)l3);
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw eW.c("k", (Object)matchException, (long)-1173775000276931497L, (long)l3);
                                }
                            }
                            try {
                                eW2 = this;
                                if (callSite != null) break block15;
                                t_03 = eW2.g;
                                t_02 = t_0.FLICK;
                            }
                            catch (MatchException matchException) {
                                throw eW.c("k", (Object)matchException, (long)-1173775000276931497L, (long)l3);
                            }
                        }
                        if (t_03 == t_02) {
                            float f = this.i + (float)(eW.c("k", (long)-1173285718721759486L, (long)l3) * 3.0 - 1.5);
                            CallSite callSite2 = eW.c("k", (float)(eW.c("W", (Object)eW.c("\u00d9", (Object)b, (long)-1174873254986644651L, (long)l3), (long)-1177381347811039799L, (long)l3) + (float)(eW.c("k", (long)-1173285718721759486L, (long)l3) * 2.0 - 1.0)), (float)-89.9f, (float)89.9f, (long)-1174282859130460338L, (long)l3);
                            this.g = t_0.ATTACK;
                            return new dC(f, (float)callSite2);
                        }
                        this.g = t_0.IDLE;
                        eW2 = this;
                    }
                    class_12973 = eW2.h;
                    try {
                        this.h = null;
                        class_12972 = class_12973;
                        if (callSite != null) break block16;
                        if (class_12972 == null) return null;
                    }
                    catch (MatchException matchException) {
                        throw eW.c("k", (Object)matchException, (long)-1173775000276931497L, (long)l3);
                    }
                    class_12972 = class_12973;
                }
                try {
                    try {
                        if (callSite != null) break block17;
                        if (eW.c("W", (Object)class_12972, (long)-1177644079875876621L, (long)l3) != false) break block18;
                        return null;
                    }
                    catch (MatchException matchException) {
                        throw eW.c("k", (Object)matchException, (long)-1173775000276931497L, (long)l3);
                    }
                }
                catch (MatchException matchException) {
                    throw eW.c("k", (Object)matchException, (long)-1173775000276931497L, (long)l3);
                }
            }
            class_12972 = class_12973;
        }
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l;
        objectArray2[0] = eW.c("W", (Object)class_12972, (long)-1177320295340696392L, (long)l3);
        CallSite callSite = eW.c("k", (Object)objectArray2, (long)-1176809270937852465L, (long)l3);
        reference var11_10 = eW.c("W", (Object)callSite, (Object)new Object[0], (long)-1177563484483486304L, (long)l3) + (float)(eW.c("k", (long)-1173285718721759486L, (long)l3) * 3.0 - 1.5);
        CallSite callSite3 = eW.c("k", (float)(eW.c("W", (Object)callSite, (Object)new Object[0], (long)-1173515187406003211L, (long)l3) + (float)(eW.c("k", (long)-1173285718721759486L, (long)l3) * 2.0 - 1.0)), (float)-89.9f, (float)89.9f, (long)-1174282859130460338L, (long)l3);
        this.j = 1;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l2;
        objectArray3[0] = class_12973;
        eW.c("k", (Object)objectArray3, (long)-1177444422408109228L, (long)l3);
        this.j = 0;
        return new dC((float)var11_10, (float)callSite3);
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
            case 0 -> 0;
            case 1 -> 6;
            case 2 -> 48;
            case 3 -> 22;
            case 4 -> 52;
            case 5 -> 30;
            case 6 -> 43;
            case 7 -> 57;
            case 8 -> 25;
            case 9 -> 24;
            case 10 -> 26;
            case 11 -> 33;
            case 12 -> 31;
            case 13 -> 44;
            case 14 -> 15;
            case 15 -> 62;
            case 16 -> 17;
            case 17 -> 5;
            case 18 -> 41;
            case 19 -> 50;
            case 20 -> 38;
            case 21 -> 8;
            case 22 -> 35;
            case 23 -> 7;
            case 24 -> 47;
            case 25 -> 28;
            case 26 -> 36;
            case 27 -> 51;
            case 28 -> 14;
            case 29 -> 49;
            case 30 -> 2;
            case 31 -> 10;
            case 32 -> 40;
            case 33 -> 16;
            case 34 -> 53;
            case 35 -> 45;
            case 36 -> 29;
            case 37 -> 54;
            case 38 -> 37;
            case 39 -> 46;
            case 40 -> 1;
            case 41 -> 12;
            case 42 -> 61;
            case 43 -> 11;
            case 44 -> 34;
            case 45 -> 23;
            case 46 -> 56;
            case 47 -> 19;
            case 48 -> 13;
            case 49 -> 59;
            case 50 -> 21;
            case 51 -> 60;
            case 52 -> 27;
            case 53 -> 42;
            case 54 -> 58;
            case 55 -> 20;
            case 56 -> 18;
            case 57 -> 4;
            case 58 -> 9;
            case 59 -> 55;
            case 60 -> 3;
            case 61 -> 39;
            case 62 -> 32;
            default -> 63;
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
        eW.p[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = eW.m(l, l2);
        Object object = o[n];
        if (object instanceof String) {
            String string = p[n];
            int n2 = string.indexOf(8);
            Class clazz = eW.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = eW.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = eW.g(clazz3, string2, clazz2)) != null) {
                    eW.o[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = eW.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        eW.o[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = eW.n(1838014628034544L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = eW.m(l, l2);
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
                clazz3 = eW.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = eW.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = eW.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        eW.o[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = eW.n(1838014628034544L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = eW.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        eW.o[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = eW.n(1838014628034544L, 0L);
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
            return MethodHandles.lookup().findStatic(eW.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(eW.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


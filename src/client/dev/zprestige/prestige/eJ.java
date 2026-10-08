/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntArrayMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  net.minecraft.class_1297
 *  net.minecraft.class_1799
 *  net.minecraft.class_3966
 *  net.minecraft.class_5321
 *  net.minecraft.class_6880
 *  net.minecraft.class_9304
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aL;
import dev.zprestige.prestige.aZ;
import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.dC;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dS;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.dn_0;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.q_0;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
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
import net.minecraft.class_1799;
import net.minecraft.class_3966;
import net.minecraft.class_5321;
import net.minecraft.class_6880;
import net.minecraft.class_9304;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class eJ
extends dV {
    private dO a;
    private dS c;
    private dM d;
    public static eJ e;
    private int f = -1;
    private int g = 0;
    private static final long k;
    private static final String[] l;
    private static final String[] m;
    private static final Map n;
    private static final long o;
    private static final Object[] p;
    private static final String[] q;

    public eJ() {
        e = this;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        k = hc.a(180074795596082365L, 6478640104319997961L, MethodHandles.lookup().lookupClass()).a(230902034849059L);
        p = new Object[121];
        q = new String[121];
        eJ.f();
        n = new HashMap(13);
        long l = k ^ 0x7131EE0DCBCFL;
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
        String string = "\u0014\u00e1\u009bh|:!\u0083\u008dZ`\u00e8\u0087\u0016\u00eea\u0010\u00d4\u00b6\u00c3z\u00ef6AZ\u00bdN48\u00f4\u008b\u001fL\u0010'u\u0002\u00ae\u00a8\u00da<\u0091Up\u0086\u008f\u000f}\u00a5\u0090";
        int n2 = "\u0014\u00e1\u009bh|:!\u0083\u008dZ`\u00e8\u0087\u0016\u00eea\u0010\u00d4\u00b6\u00c3z\u00ef6AZ\u00bdN48\u00f4\u008b\u001fL\u0010'u\u0002\u00ae\u00a8\u00da<\u0091Up\u0086\u008f\u000f}\u00a5\u0090".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = eJ.b(byArray3).intern();
            if ((n4 += n3) >= n2) break;
            n3 = string.charAt(n4);
        }
        eJ.l = stringArray;
        m = new String[3];
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        int n6 = 1;
        while (true) {
            if (n6 >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l2 = -6068495415898302841L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                o = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                return;
            }
            byArray5 = byArray5;
            byArray5[n6] = (byte)(l << n6 * 8 >>> 56);
            ++n6;
        }
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x71E3;
        if (m[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])eJ.n.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    eJ.n.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/eJ", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = eJ.l[n2].getBytes("ISO-8859-1");
            eJ.m[n2] = eJ.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return m[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = eJ.b(n, l);
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
            throw new RuntimeException("dev/zprestige/prestige/eJ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static int c(Object[] objectArray) {
        long l;
        long l2;
        long l3;
        class_5321 class_53212;
        class_1799 class_17992;
        block3: {
            Object object;
            block2: {
                class_17992 = (class_1799)objectArray[0];
                class_53212 = (class_5321)objectArray[1];
                l3 = (Long)objectArray[2];
                long l4 = l3 = k ^ l3;
                l2 = l4 ^ 0xDD109E4F2E1L;
                l = l4 ^ 0x38CC9FD5A51CL;
                CallSite callSite = eJ.c("\u00c6", (long)5653523427429865565L, (long)l3);
                try {
                    object = eJ.c("\u00c8", (Object)class_17992, (long)5654075364035823570L, (long)l3);
                    if (callSite != null) break block2;
                    if (object == false) break block3;
                }
                catch (MatchException matchException) {
                    throw eJ.c("\u00c6", (Object)matchException, (long)5651881708321350932L, (long)l3);
                }
                object = 0;
            }
            return (int)object;
        }
        Object2IntArrayMap object2IntArrayMap = new Object2IntArrayMap();
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = object2IntArrayMap;
        objectArray2[0] = class_17992;
        eJ.c("\u00c6", (Object)objectArray2, (long)5653101328780788189L, (long)l3);
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l;
        objectArray3[1] = class_53212;
        objectArray3[0] = object2IntArrayMap;
        return (int)eJ.c("\u00c6", (Object)objectArray3, (long)5654408373902362847L, (long)l3);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/eJ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = eJ.m(l, l2);
            object = p[n];
            try {
                if (!(object instanceof String)) break block2;
                eJ.p[n] = clazz = Class.forName(q[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = eJ.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = eJ.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = eJ.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = eJ.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = p;
        p[0] = "0\u000ek-=T.\u0006qbZU?\u001d|8|S";
        objectArray[1] = "\u00054duvB\u000e;u:\u0017L\u00050q`";
        objectArray[2] = "c\n\u0003;>Ou\n\u0006a-XbA\u0005g!Ls\u0006\u0012pjZM";
        objectArray[3] = "@b;z9&Km*5Z+^`%^o)Os9rx$";
        objectArray[4] = ">Y\bB\u0013b(Y\r\u0018\u0000u?\u0012\u000e\u001e\fa.U\u0019\tGs\u0012";
        objectArray[5] = "T`qm4\u0014!@zb%[\\Xie,\u00124";
        objectArray[6] = "\u001ez!BS#\u001ag!SN#YhnDI?\u0003gc\u0019R(\u001dklCNd8leR^>>zjE\\(\u001bk";
        objectArray[7] = "ol\u0010JXfkq\u0010[Ef(~_LBzrqR\u0011Yml}]KE!IzTZU{Ol[MW{ij";
        objectArray[8] = "6\u0003k2/u2\u001ek#2uq\u0011$45i+\u001e)i.~5\u0012&322\u0010\u0015/\"\"hm>+3\f}/S\u0000)5n&";
        objectArray[9] = "f\u0007w7X'b\u001aw&E'!\u001581B;{\u001a5lY,e\u0016:6E`@\u00113'U:=:76{/\u007f\u0000";
        objectArray[10] = "\u0013qkmHo\u0017lk|UoTc$kRs\u000el)6Id\u0010`&lU(5g/}ErHL+lkg\n";
        objectArray[11] = Boolean.TYPE;
        eJ.q[11] = "java/lang/Boolean";
        objectArray[12] = "@\u0010e\u0013.`@\u0010rO\"oZ[rQ\"z]*'\u0005{9";
        objectArray[13] = "Q\u0007|**dQ\u0007kv&kKLkh&~L==7u<";
        objectArray[14] = Integer.TYPE;
        eJ.q[14] = "java/lang/Integer";
        objectArray[15] = "9K\u007fJ2\u001c'Ce\u0005O\f'";
        objectArray[16] = "\u0014t\fy\u001d\baT\u0007v\fG\u0000Z\f}\b\u001dt";
        objectArray[17] = "\t\\.X*>\t\\9\u0004&1\u0013\u00179\u001a&$\u0014fiGw";
        objectArray[18] = "g1S\u000e\u001bmg1DR\u0017b}zDL\u0017wz\u000b\u0010\u0014@";
        objectArray[19] = "q+@S\u001d]\u0004\u000bK\\\f\u0012e\u0005@W\bH\u0011";
        objectArray[20] = "7\u0005% X*!\u0005 zK=6N#|G)'\t4k\f9!";
        objectArray[21] = "\r,\u0010:'nx\f\u001b56!\u0019\u0002\u0010>2{m";
        objectArray[22] = Void.TYPE;
        eJ.q[22] = "java/lang/Void";
        objectArray[23] = ",x\u0015QQ\u00112p\u000f\u001e-\u0005(}\f]";
        objectArray[24] = Float.TYPE;
        eJ.q[24] = "java/lang/Float";
        objectArray[25] = "!mZ(\u0015\u0001TMQ'\u0004N5CZ,\u0000\u0014A";
        objectArray[26] = "K2\u000eF_=K2\u0019\u001aS2Qy\u0019\u0004S'V\bKZ\u000bc";
        objectArray[27] = "zS!=L;\u000fs*2]tn}!9Y.\u001a";
        objectArray[28] = "+g]z\u000fH=gX \u001c_*,[&\u0010K;kL1[\\\u0004";
        objectArray[29] = "WsP$MZ\\|Ak%ZRsR";
        objectArray[30] = Double.TYPE;
        eJ.q[30] = "java/lang/Double";
        objectArray[31] = "y\u0017:4r,y\u0017-h~#c\\-v~6d-w)/q";
        objectArray[32] = "\u0007C:I\\_\u0007C-\u0015PP\u001d\b-\u000bPE\u001aywT\u0002\u0002";
        objectArray[33] = "k%@s\u000ehk%W/\u0002gqnW1\u0002rv\u001f\rnP0";
        objectArray[34] = "GW\u000epXWGW\u0019,TX]\u001c\u00192TMZmKi\f\u0007";
        objectArray[35] = "EzPq(+EzG-$$_1G3$1X@\u0015h|p";
        objectArray[36] = "T\u001dQX\u0002\u0018T\u001dF\u0004\u000e\u0017NVF\u001a\u000e\u0002I'\u0014N_C";
        objectArray[37] = "\t]\u0013y[\u0004|}\u0018vJK\u001ds\u0013}N\u0011i";
        objectArray[38] = "U^E\u000f+XC^@U8OT\u0015CS4[ERTD\u007fLb";
        objectArray[39] = "b\u001eQO\"\u000e\u0017>Z@3Av0QK7\u001b\u0002";
        objectArray[40] = "\fn\u0012S`\\yN\u0019\\q\u0013\u0018@\u0012WuIl";
        objectArray[41] = "qx#9]j\u0004X(6L%eV#=H\u007f\u0011";
        objectArray[42] = "\u0005\u0000n\u0016<Yp e\u0019-\u0016\u0011.n\u0012)Le";
        objectArray[43] = "\u007f%\u000e\u0005i2t*\u001fJ\u000e*p6\u0019\u0006+;";
        objectArray[44] = "~E)\"\u0018:~E>~\u00145d\u000e>`\u0014 c\u007fo8F";
        objectArray[45] = "hzQO65hzF\u0013::r1F\r:/u@\u0017Rb";
        objectArray[46] = "\u001a\u0005\n&\u0013\u0015\f\u0005\u000f|\u0000\u0002\u001bN\fz\f\u0016\n\t\u001bmG\u00019";
        objectArray[47] = ")\u0015\u0002\"K\u001f\\5\t-ZP=;\u0002&^\nI";
        objectArray[48] = "j\r\u001ab;`j\r\r>7opF\r 7zw7\\\u007fo-g\u0004\u000f?%V6\\^";
        objectArray[49] = "|kf[M2|kq\u0007A=f q\u0019A(aQ$F\u0018";
        objectArray[50] = "c\u0011A={\u001bu\u0011Dgh\fbZGad\u0018s\u001dPv/\u000fQ";
        objectArray[51] = "-f+FYP-f<\u001aU_7-<\u0004UJ0\\m[\f";
        objectArray[52] = "j+\u0004J\u0002jj+\u0013\u0016\u000eep`\u0013\b\u000epw\u0011F\\Y1";
        objectArray[53] = "f@\u0003\u001bi\u0010f@\u0014Ge\u001f|\u000b\u0014Ye\n{zD\u0001<@";
        objectArray[54] = "K-{\u000bqGK-lW}HQflI}]V\u0017>\u001d%\u001d";
        objectArray[55] = "\u001f Vt=S\u001f A(1\\\u0005kA61I\u0002\u001a\u0013lf\u000b";
        objectArray[56] = "\u001dM6\u0010b\u0015hm=\u001fsZ\tc6\u0014w\u0000}";
        objectArray[57] = "6\u000f\u001aBKiC/\u0011MZ&\"!\u001aF^|V";
        objectArray[58] = "b#\u0007@M1\u0017\u0003\fO\\~v\r\u0007DX$\u0002";
        objectArray[59] = "Y1O,\u0011\"\u000e\u007fEk!)`tR5]#\nr\\k\u0018@Z+T*B*\\%\no!";
        objectArray[60] = "?KlZ/P2BdQT\u00055\u00179]\u0003Rk@a1?\u0017-Bd\b+\u000e$\u0011";
        objectArray[61] = "E<\u0016M\u001b;\u0007?M@+:\u0005(S\u0014W<\u0003E\u0014D@b@5O\u0001T+y";
        objectArray[62] = "o~\u0000WXD{g\t\u0004a\u0018i~\u0019\b\r*::DPa\u001cmi\u0018\u0005^\u00004m\u001ao^\u0007um\u000b\u000b\b\rkgy";
        objectArray[63] = "\tp}F?\u0010^>w\u0001\u000f\u0010069@}\u0012T~cZ>\u00150agRw\f]~;C2r";
        objectArray[64] = "|Bu;;|\"\re\"P&wOe&<\u0014'\u0003;|oC~Qn3>)}]i'P";
        objectArray[65] = "RoxA4\u0018\u0001pyRI\b\u0005h9|5\u000b\u0016z/Y$fSq5Vq\u001c\u0013w>\u0007IZ\u0015,u\r)\u0018\u0016wx=";
        objectArray[66] = "\tG\u000eZY\u0004^\t\u0004\u001di\u000f0\u0001J\\\u001b\u0006TI\u0010FX\u00010\t\tYU\u0005\u000eB\u0007R\u0010f";
        objectArray[67] = "\n\t\u001c\n>\u001d\u001a\tJf.K\u001d?N\u00162\"Y\u0003R\t<F\u000f\tL\u0003N";
        objectArray[68] = "~E_FX?~\u001eOM!(#R_OM\u001ar\u0016\u0005\u0012\u001cM\u007f\u0014AVHu\"R[W!r4_PZE$>AZ(";
        objectArray[69] = "FO\"{I_EC%o'[C@-ep\t\u0013\u0016y4'Q@F;gMRLA/";
        objectArray[70] = "TBHr7U@WN}Y@PT\u0010l\u000e\u0012\u0000\u0007H;YH[SD\u007fiU\n\u0002\u001a";
        objectArray[71] = "LLh~\u0015$P\u0015l|\u007f~@Ycx\u0013L\u0010\u00159.\u007fi_\u0014i&\u0018z_\u0019s\u001f";
        objectArray[72] = "ud!\u001b\u000f8z6&\u0014t(\u0018dw\u0018\u0006\"|,-\u0002E%\u0018b1\u0015\u001b0|4;\u000b\u0011B";
        objectArray[73] = "(vEy\n0k3P`__t!Cd\u00033Fq\u0003?T_ 3F8\u0007ak=M}d9`<Eo[g/,\\\u0004";
        objectArray[74] = "K\u0006l/U`\u001cHfhear@()\u0017b\u0016\br3Ter\u0017v;\u001d|\u001f\b**X\u0002";
        objectArray[75] = "w!7@=d/5,\u0000Th\u0015j{J8=v<+\u0014h\u0001";
        objectArray[76] = "&qRa\u0016\u001a)#Unm\tKq\u0004b\u001f\u0000/9^x\\\u0007KwBo\u0002\u0012/!Hq\b`";
        objectArray[77] = "g\u0019/s\u001ccs\u0000& %?a\u00196,I\r3_hr%:=Y32\u001cgh\u000fjKEk0\u0000/r\u0018>fYV";
        objectArray[78] = "\f]fP\u0013A\t\u0015rAuQ\f@aI\tW\n-wPJ\\\u0000\u0012gP\u001c0";
        objectArray[79] = "Z\u0006\u0017c.HN\u001f\u001e0\u0017\u0014\\\u0006\u000e<{&\nASd.qL\u001d\u0017ew@\\\u001c^a\u0017";
        objectArray[80] = "JPoC\u000e>\u0011\u001cv\u001esip\u001e)\u0001C:\u0002Xi\u0012\u0001\u0003";
        objectArray[81] = "6xq8l\u0013;qy3\u0017F<$$?@\u0011bw}SiU0s$:oT:(";
        objectArray[82] = "Qe\"^d`Bez_\u000bu.ey^y\u007fJ-#D:x.\"8O1{G$9Ej\u001f";
        objectArray[83] = "CN'Z42VO$\u0007\rdR@8RZ3\b\u0016g>}iHIe\u0006hhK\u0014";
        objectArray[84] = ">c\u0001%i]3j\t.\u0012\b4?T\"E_kb\u000fNc^<)B7x\r+7";
        objectArray[85] = "\u0004CZK\u0003~R\u0019SEchT[sV\u0012\u0007\u0000\u0016\u0000W_dVF^\u0007c";
        objectArray[86] = "}\u000f{\u001a\u0016k7\u0007\u007f\r'9\fV\u007f\fH\"h\u0000u\u0012BP";
        objectArray[87] = "GuUCd \u0019:EZ\u000fzLxE^cH\u001e5\u001d\b\u000fxAg\u001f_5oZ5K9";
        objectArray[88] = "Z\u001ae)<H\u0004Uu0W\u0012Q\u0017u4; \u0003Z+kWHF\u001az!3\u001eL\u0004pS";
        objectArray[89] = "\u0005+\\qQiV<P7 y\u0010!E%\\\u007f\u0016LS<\u001ft\u001csC<I\u0018";
        objectArray[90] = "VmN\u0016$WEbG\u0017ZOTt\n%>NPxv\u000bk\u0015\\}OV>C\u0005\u0004";
        objectArray[91] = "g{xu4\u001a<%gr/'0\"lm!p`x;4r'g{?2-F2$bo3";
        objectArray[92] = "WOG\u0018dJCVNK]\u0016QO^G1$\u0002\u000b\u0002\u001f]\u0015MCDKbK\u0002S] ";
        objectArray[93] = "8JK'707\u0018L(L-UJ\u001d$>*1\u0002G>}-UL[)#81\u001aQ7)J";
        objectArray[94] = "\t}x,Q\u0005\u001ddq\u007fhY\u000f}as\u0004kY8<(X<[;{i\u0006S\u0018~npS<";
        objectArray[95] = "WHJ\u0013H\u0003\u0001\u0012C\u001d(\u0015\u0007Pa\u0005T$\u0003H]\u000e(K\u0015U\u001c\u0000\u0016\u0000\u001b^Yc";
        objectArray[96] = ":\u0003\u0012(vPdL\u00021\u001d\n1\u000e\u00025q8aB\\c o:\u0018\bbb_'IY<\u001dVmB\u000en~\u0000=\u001c^R$^l\u001e^1r\u000e2Nb";
        objectArray[97] = "%l\u0017=576l\u001a'\f5:bF0`\u0007f/\u001dWq7. Ffa6g$&*k)i~\u0017:j`m\u001e\u0019-}?%zO'c5W";
        objectArray[98] = "\u0002m~]\u0000d\u0001ayInk\u000bsuH\u0002Y[0(\u0014_\u000e\u000fhv\u0012\u001f\u007f\\\u007fzTn";
        objectArray[99] = "\u0011d\u001f\f\\\"\u0005}\u0016_e~\u0017d\u0006S\tLA&Z\tY\u001b\u001a)ZQ\u001c\"G|\f\be";
        objectArray[100] = "zov#<_-!|d\fQC)2%~]'ah?=ZC!q 0^}j\u007f+u=";
        objectArray[101] = "5v\fBUXk9\u001c[>\u0002>{\u001c_R0h>A\u0007\u0005gj?B\u0003^\u0006?`\u001f^@gl}\rWL\u0003:w\u0013]>";
        objectArray[102] = "\t [vf\u0017\u0019 \r\u001apE\u0015,d#'\u0018\tl\u0007uwFYP";
        objectArray[103] = "8S/b>\u000eo\u001d%%\u000e\u0000\u0001\u0015kd|\fe]1~?\u000b\u0001\u0013-ia\u001eeE'wkl";
        objectArray[104] = "w\u0010+M+Ds\u0000c[[G\u000eUnZ)Nj\u001d4@jI\u000eS(W4\\j\u0005\"I>.";
        objectArray[105] = "x0K\u00117zl)BB\u000e&~0RNb\u0014(r\u000e\u00143Cs}\u000eLwz.(X\u0015\u000e";
        objectArray[106] = "\u001dJ;$SB\u001bK1\u007f7N\u000eK6y[|Z\bi.\u000b+\u001eP/ W\u001a\u000eQf$7";
        objectArray[107] = ";)\u001cR<W'p\u0018PV\r7<\u0017T:?g\u007fL\u0002V\t3+\u0016Yi\u0015j/\u001436Yf%\u000e\nk\f0|w";
        objectArray[108] = "\u0019\rSAIY\u0016_TN2Jt\r\u0005B@C\u0010E_X\u0003DtZ[PJ]\u0019E\u0007A\u000f#";
        objectArray[109] = "\u0018Yn5*(O\u0017dr\u001a#!\u001f*3h*EWp)+-!G\u007f${ \u001e[& yJ";
        objectArray[110] = "\u007f\bTL}Vy\u0015\u0015\u0018BBf\u0007\fD\u0015\u001c:[X(%LdP\u000e\u00122W6\u0004";
        objectArray[111] = "%&2Ko`e 9\u001aWq~)+ZWtx*:^:k$;\u007f ";
        objectArray[112] = "`\fznh>+\u000f}x\u007f\u00077TtniPg\u000e%0=\u0007h\u000fgtl?5I}u";
        objectArray[113] = "QRT\u0010\u001bp^\u0000S\u001f`c<R\u0002\u0013\u0012jX\u001aX\tQm<ZA\u0016\\i\u0002\u0011O\u001d\u0019\n";
        objectArray[114] = "k0c\u001d\u0013*8'o[b<lW9\u0011R7>4oA\fg\u0002>gC_*smpO\u0019[";
        objectArray[115] = "\u0010L\u001c9vm\nXG$F>\u0017FH:\u00189\u0017\\LF&aODX\u007f{4\u0019\u001d!";
        objectArray[116] = "6\u0012Ay~H0\u0013K\"\u001aD%\u0013L$vvqP\u0013s!!8\fW'#\u0019-\rTz\u001a";
        objectArray[117] = "\u0007:{m!\u0018\u001cilsS\u0004\u001b~rq?6O2+/ia\nrof5\u0010\u000f:{wS";
        objectArray[118] = "Y\fS\\:W\u0019\nX\r\u0002U\u001b\u0012#\u000e3\u001d\nR@XcCZn\u0012H{\u0011\u0005PYFpTf_\\N>NX\u0014RE{-";
        objectArray[119] = ":l\u001bU\u0019%m\"\u0011\u0012),\u0003*_S['gb\u0005I\u0018 \u0003\"\u001cV\u0015$=i\u0012]PG";
        Object[] objectArray2 = objectArray;
        objectArray[120] = "LvYO\u00130XoP\u001c*gFgD\u001b}7\u001f3\u001fwN9W4\u001dH\u0015m\u001b1";
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ef' || c == '$' || c == '\u00c1' || c == 'f') {
                field = eJ.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ef' ? lookup.findGetter(clazz, string2, clazz2) : (c == '$' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c1' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = eJ.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c8' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c6' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static int d(Object[] objectArray) {
        Object object;
        block7: {
            Object2IntMap object2IntMap = (Object2IntMap)objectArray[0];
            class_5321 class_53212 = (class_5321)objectArray[1];
            long l = (Long)objectArray[2];
            l = k ^ l;
            CallSite callSite = eJ.c("\u00c8", (Object)eJ.c("\u00c6", (Object)object2IntMap, (long)-9177997764925641290L, (long)l), (long)-9169828999797445060L, (long)l);
            CallSite callSite2 = eJ.c("\u00c6", (long)-9176795564570995059L, (long)l);
            while (eJ.c("\u00c8", (Object)callSite, (long)-9177912788080576541L, (long)l) != false) {
                block9: {
                    CallSite callSite3;
                    block8: {
                        Object2IntMap.Entry entry = (Object2IntMap.Entry)eJ.c("\u00c8", (Object)callSite, (long)-9175823298273646236L, (long)l);
                        try {
                            try {
                                try {
                                    object = eJ.c("\u00c8", (Object)((class_6880)eJ.c("\u00c8", (Object)entry, (long)-9177158984000206457L, (long)l)), (Object)class_53212, (long)-9178221869329307072L, (long)l);
                                    if (callSite2 != null) break block7;
                                    if (callSite2 != null) break block8;
                                }
                                catch (MatchException matchException) {
                                    throw eJ.c("\u00c6", (Object)matchException, (long)-9169428980618073148L, (long)l);
                                }
                                if (object == 0) break block9;
                            }
                            catch (MatchException matchException) {
                                throw eJ.c("\u00c6", (Object)matchException, (long)-9169428980618073148L, (long)l);
                            }
                            callSite3 = eJ.c("\u00c8", (Object)entry, (long)-9176471645660570308L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw eJ.c("\u00c6", (Object)matchException, (long)-9169428980618073148L, (long)l);
                        }
                    }
                    return (int)callSite3;
                }
                if (callSite2 == null) continue;
            }
            object = 0;
        }
        return object;
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = eJ.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private boolean d(Object[] objectArray) {
        Object object;
        block24: {
            block29: {
                block25: {
                    CallSite callSite;
                    long l;
                    block28: {
                        long l2;
                        block26: {
                            long l3;
                            long l4;
                            block22: {
                                l = (Long)objectArray[0];
                                long l5 = l = k ^ l;
                                long l6 = l5 ^ 0x2C082A9B4CF2L;
                                l4 = l5 ^ 0x3E28716880A0L;
                                l3 = l5 ^ 0x73AD35C71C27L;
                                l2 = l5 ^ 0x21516A2BBDF1L;
                                callSite = eJ.c("\u00c6", (long)-7721041793266449679L, (long)l);
                                try {
                                    block23: {
                                        try {
                                            try {
                                                try {
                                                    Object[] objectArray2 = new Object[2];
                                                    objectArray2[1] = l3;
                                                    objectArray2[0] = eJ.b("x", (int)17761, (long)(0x54F9171587B9A04DL ^ l));
                                                    object = eJ.c("\u00c8", (Object)this.c, (Object)objectArray2, (long)-7721578132532751077L, (long)l);
                                                    if (callSite != null) break block22;
                                                    if (object == false) break block23;
                                                }
                                                catch (MatchException matchException) {
                                                    throw eJ.c("\u00c6", (Object)matchException, (long)-7727186819810099272L, (long)l);
                                                }
                                                Object[] objectArray3 = new Object[2];
                                                objectArray3[1] = l6;
                                                objectArray3[0] = eJ.c("\u00c8", (Object)eJ.c("\u00ef", (Object)b, (long)-7727491482760535745L, (long)l), (long)-7720775359421456649L, (long)l);
                                                object = eJ.c("\u00c6", (Object)objectArray3, (long)-7719610953938440518L, (long)l);
                                                if (callSite != null) break block24;
                                            }
                                            catch (MatchException matchException) {
                                                throw eJ.c("\u00c6", (Object)matchException, (long)-7727186819810099272L, (long)l);
                                            }
                                            if (object != false) break block25;
                                        }
                                        catch (MatchException matchException) {
                                            throw eJ.c("\u00c6", (Object)matchException, (long)-7727186819810099272L, (long)l);
                                        }
                                    }
                                    Object[] objectArray4 = new Object[2];
                                    objectArray4[1] = l3;
                                    objectArray4[0] = eJ.b("x", (int)31489, (long)(0x1C54940EDDD09E2EL ^ l));
                                    object = eJ.c("\u00c8", (Object)this.c, (Object)objectArray4, (long)-7721578132532751077L, (long)l);
                                }
                                catch (MatchException matchException) {
                                    throw eJ.c("\u00c6", (Object)matchException, (long)-7727186819810099272L, (long)l);
                                }
                            }
                            try {
                                block27: {
                                    try {
                                        try {
                                            try {
                                                if (callSite != null) break block26;
                                                if (object == false) break block27;
                                            }
                                            catch (MatchException matchException) {
                                                throw eJ.c("\u00c6", (Object)matchException, (long)-7727186819810099272L, (long)l);
                                            }
                                            Object[] objectArray5 = new Object[2];
                                            objectArray5[1] = l4;
                                            objectArray5[0] = eJ.c("\u00c8", (Object)eJ.c("\u00ef", (Object)b, (long)-7727491482760535745L, (long)l), (long)-7720775359421456649L, (long)l);
                                            object = eJ.c("\u00c6", (Object)objectArray5, (long)-7719378839792057931L, (long)l);
                                            if (callSite != null) break block24;
                                        }
                                        catch (MatchException matchException) {
                                            throw eJ.c("\u00c6", (Object)matchException, (long)-7727186819810099272L, (long)l);
                                        }
                                        if (object != false) break block25;
                                    }
                                    catch (MatchException matchException) {
                                        throw eJ.c("\u00c6", (Object)matchException, (long)-7727186819810099272L, (long)l);
                                    }
                                }
                                Object[] objectArray6 = new Object[2];
                                objectArray6[1] = l3;
                                objectArray6[0] = eJ.b("x", (int)28125, (long)(0x7450C6232B308F3L ^ l));
                                object = eJ.c("\u00c8", (Object)this.c, (Object)objectArray6, (long)-7721578132532751077L, (long)l);
                            }
                            catch (MatchException matchException) {
                                throw eJ.c("\u00c6", (Object)matchException, (long)-7727186819810099272L, (long)l);
                            }
                        }
                        try {
                            try {
                                if (callSite != null) break block28;
                                if (object == false) break block29;
                            }
                            catch (MatchException matchException) {
                                throw eJ.c("\u00c6", (Object)matchException, (long)-7727186819810099272L, (long)l);
                            }
                            Object[] objectArray7 = new Object[2];
                            objectArray7[1] = l2;
                            objectArray7[0] = eJ.c("\u00c8", (Object)eJ.c("\u00ef", (Object)b, (long)-7727491482760535745L, (long)l), (long)-7720775359421456649L, (long)l);
                            object = eJ.c("\u00c6", (Object)objectArray7, (long)-7720805755227528287L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw eJ.c("\u00c6", (Object)matchException, (long)-7727186819810099272L, (long)l);
                        }
                    }
                    try {
                        if (callSite != null) break block24;
                        if (object == false) break block29;
                    }
                    catch (MatchException matchException) {
                        throw eJ.c("\u00c6", (Object)matchException, (long)-7727186819810099272L, (long)l);
                    }
                }
                object = 1;
                break block24;
            }
            object = 0;
        }
        return (boolean)object;
    }

    private static int a(Object[] objectArray) {
        Object object;
        block11: {
            long l = (Long)objectArray[0];
            long l2 = (l = k ^ l) ^ 0x275018D5EF01L;
            CallSite callSite = eJ.c("\u00c6", (long)-3839205902894900080L, (long)l);
            for (int i = 0; i < (int)o; ++i) {
                int n;
                block15: {
                    Object object2;
                    block13: {
                        block14: {
                            block12: {
                                CallSite callSite2 = eJ.c("\u00c8", (Object)eJ.c("\u00c8", (Object)eJ.c("\u00ef", (Object)b, (long)-3845141115438694562L, (long)l), (long)-3838241617301850753L, (long)l), (int)i, (long)-3837609481530542651L, (long)l);
                                try {
                                    try {
                                        object = eJ.c("\u00c8", (Object)callSite2, (Object)eJ.c("\u00c1", (long)-3838565336316728293L, (long)l), (long)-3840119729464380795L, (long)l);
                                        if (callSite != null) break block11;
                                        if (callSite != null) break block12;
                                    }
                                    catch (MatchException matchException) {
                                        throw eJ.c("\u00c6", (Object)matchException, (long)-3845305042008137255L, (long)l);
                                    }
                                    if (object == 0) {
                                        continue;
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw eJ.c("\u00c6", (Object)matchException, (long)-3845305042008137255L, (long)l);
                                }
                                Object[] objectArray2 = new Object[3];
                                objectArray2[2] = l2;
                                objectArray2[1] = eJ.c("\u00c1", (long)-3841455504015337461L, (long)l);
                                objectArray2[0] = callSite2;
                                object2 = eJ.c("\u00c6", (Object)objectArray2, (long)-3841101109676207033L, (long)l);
                            }
                            try {
                                if (callSite != null) break block13;
                                if (object2 != false) break block14;
                            }
                            catch (MatchException matchException) {
                                throw eJ.c("\u00c6", (Object)matchException, (long)-3845305042008137255L, (long)l);
                            }
                            object2 = 1;
                            break block13;
                        }
                        object2 = 0;
                    }
                    int n2 = object2;
                    try {
                        n = n2;
                        if (callSite != null) break block15;
                        if (n == 0) {
                            continue;
                        }
                    }
                    catch (MatchException matchException) {
                        throw eJ.c("\u00c6", (Object)matchException, (long)-3845305042008137255L, (long)l);
                    }
                    n = i;
                }
                return n;
            }
            object = -1;
        }
        return object;
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return eJ.c("\u00c6", (Object)((Object)q_0.Spear), (long)-2441876718549539997L, (long)l);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    public static class_1297 a(Object[] objectArray) {
        CallSite callSite;
        CallSite callSite2;
        long l;
        block40: {
            CallSite callSite3;
            block41: {
                CallSite callSite4;
                block39: {
                    Object object;
                    long l2;
                    block37: {
                        block38: {
                            block35: {
                                block36: {
                                    block33: {
                                        long l3;
                                        block34: {
                                            l = (Long)objectArray[0];
                                            long l4 = l = k ^ l;
                                            l3 = l4 ^ 0x7C54D8A80056L;
                                            l2 = l4 ^ 0x1412AB23E27BL;
                                            callSite2 = eJ.c("\u00c6", (long)-6835898405605886198L, (long)l);
                                            try {
                                                try {
                                                    object = eJ.c("\u00c8", (Object)e, (long)-6835431290697941282L, (long)l);
                                                    if (callSite2 != null) break block33;
                                                    if (object != false) break block34;
                                                }
                                                catch (MatchException matchException) {
                                                    throw eJ.c("\u00c6", (Object)matchException, (long)-6829463107992532413L, (long)l);
                                                }
                                                return null;
                                            }
                                            catch (MatchException matchException) {
                                                throw eJ.c("\u00c6", (Object)matchException, (long)-6829463107992532413L, (long)l);
                                            }
                                        }
                                        Object[] objectArray2 = new Object[1];
                                        objectArray2[0] = l3;
                                        object = eJ.c("\u00c6", (Object)objectArray2, (long)-6834611842156991979L, (long)l);
                                    }
                                    try {
                                        try {
                                            if (callSite2 != null) break block35;
                                            if (object != -1) break block36;
                                        }
                                        catch (MatchException matchException) {
                                            throw eJ.c("\u00c6", (Object)matchException, (long)-6829463107992532413L, (long)l);
                                        }
                                        return null;
                                    }
                                    catch (MatchException matchException) {
                                        throw eJ.c("\u00c6", (Object)matchException, (long)-6829463107992532413L, (long)l);
                                    }
                                }
                                reference cfr_temp_0 = eJ.c("\u00c8", (Object)eJ.c("\u00ef", (Object)b, (long)-6829369584560597820L, (long)l), (float)0.0f, (long)-6834917759225116466L, (long)l) - 1.0f;
                                object = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                            }
                            try {
                                try {
                                    if (callSite2 != null) break block37;
                                    if (object >= 0) break block38;
                                }
                                catch (MatchException matchException) {
                                    throw eJ.c("\u00c6", (Object)matchException, (long)-6829463107992532413L, (long)l);
                                }
                                return null;
                            }
                            catch (MatchException matchException) {
                                throw eJ.c("\u00c6", (Object)matchException, (long)-6829463107992532413L, (long)l);
                            }
                        }
                        try {
                            callSite4 = eJ.c("\u00ef", (Object)b, (long)-6835799240164182120L, (long)l);
                            if (callSite2 != null) break block39;
                            object = callSite4 instanceof class_3966;
                        }
                        catch (MatchException matchException) {
                            throw eJ.c("\u00c6", (Object)matchException, (long)-6829463107992532413L, (long)l);
                        }
                    }
                    try {
                        if (object != false) {
                            return null;
                        }
                    }
                    catch (MatchException matchException) {
                        throw eJ.c("\u00c6", (Object)matchException, (long)-6829463107992532413L, (long)l);
                    }
                    Object[] objectArray3 = new Object[3];
                    objectArray3[2] = l2;
                    objectArray3[1] = Float.valueOf(4.75f);
                    objectArray3[0] = new dC((float)eJ.c("\u00c8", (Object)eJ.c("\u00ef", (Object)b, (long)-6829369584560597820L, (long)l), (long)-6832256161492538104L, (long)l), (float)eJ.c("\u00c8", (Object)eJ.c("\u00ef", (Object)b, (long)-6829369584560597820L, (long)l), (long)-6833009266977886252L, (long)l));
                    callSite4 = eJ.c("\u00c6", (Object)objectArray3, (long)-6835759363323479041L, (long)l);
                }
                callSite3 = callSite4;
                try {
                    try {
                        callSite = callSite3;
                        if (callSite2 != null) break block40;
                        if (eJ.c("\u00c8", (Object)callSite, (long)-6833340922745011871L, (long)l) == eJ.c("\u00c1", (long)-6835630591558852043L, (long)l)) break block41;
                    }
                    catch (MatchException matchException) {
                        throw eJ.c("\u00c6", (Object)matchException, (long)-6829463107992532413L, (long)l);
                    }
                    return null;
                }
                catch (MatchException matchException) {
                    throw eJ.c("\u00c6", (Object)matchException, (long)-6829463107992532413L, (long)l);
                }
            }
            callSite = callSite3;
        }
        CallSite callSite5 = eJ.c("\u00c8", (Object)callSite, (long)-6832938321511376147L, (long)l);
        class_1297 class_12972 = null;
        CallSite callSite6 = eJ.c("\u00c8", (Object)eJ.c("\u00c8", (Object)eJ.c("\u00ef", (Object)b, (long)-6835606079096932304L, (long)l), (long)-6833260019229807215L, (long)l), (long)-6834899770575752617L, (long)l);
        while (eJ.c("\u00c8", (Object)callSite6, (long)-6834498984441080220L, (long)l) != false) {
            class_1297 class_12973;
            block45: {
                CallSite callSite7;
                class_1297 class_12974;
                block44: {
                    block43: {
                        CallSite callSite8;
                        class_1297 class_12975;
                        block42: {
                            class_12974 = (class_1297)eJ.c("\u00c8", (Object)callSite6, (long)-6832076344750552861L, (long)l);
                            try {
                                class_12975 = class_12974;
                                callSite8 = eJ.c("\u00ef", (Object)b, (long)-6829369584560597820L, (long)l);
                                if (callSite2 != null) break block42;
                                if (class_12975 == callSite8) {
                                    continue;
                                }
                            }
                            catch (MatchException matchException) {
                                throw eJ.c("\u00c6", (Object)matchException, (long)-6829463107992532413L, (long)l);
                            }
                            class_12975 = class_12974;
                            callSite8 = eJ.c("\u00ef", (Object)b, (long)-6829369584560597820L, (long)l);
                        }
                        try {
                            reference cfr_temp_1 = eJ.c("\u00c8", (Object)class_12975, (Object)callSite8, (long)-6832822390756268611L, (long)l) - 6.0f;
                            callSite7 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 > 0 ? 1 : -1);
                            if (callSite2 != null) break block43;
                            if (callSite7 > 0) {
                                continue;
                            }
                        }
                        catch (MatchException matchException) {
                            throw eJ.c("\u00c6", (Object)matchException, (long)-6829463107992532413L, (long)l);
                        }
                        callSite7 = eJ.c("\u00c8", (Object)eJ.c("\u00ef", (Object)b, (long)-6829369584560597820L, (long)l), (Object)class_12974, (long)-6829284285030273903L, (long)l);
                    }
                    try {
                        if (callSite2 != null) break block44;
                        if (callSite7 == false) {
                            continue;
                        }
                    }
                    catch (MatchException matchException) {
                        throw eJ.c("\u00c6", (Object)matchException, (long)-6829463107992532413L, (long)l);
                    }
                    try {
                        class_12973 = class_12974;
                        if (callSite2 != null) break block45;
                        callSite7 = eJ.c("\u00c8", (Object)eJ.c("\u00c8", (Object)class_12973, (long)-6834276138415429729L, (long)l), (Object)eJ.c("\u00c8", (Object)eJ.c("\u00ef", (Object)b, (long)-6829369584560597820L, (long)l), (long)-6834816939876994998L, (long)l), (Object)callSite5, (long)-6832388315185135963L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw eJ.c("\u00c6", (Object)matchException, (long)-6829463107992532413L, (long)l);
                    }
                }
                if (callSite7 == false) continue;
                class_12973 = class_12974;
            }
            class_12972 = class_12973;
            break;
        }
        return class_12972;
    }

    @bP
    public void a(aZ aZ2) {
        long l = k ^ 0x113428B5C000L;
        long l2 = l ^ 0x4ED50EB05015L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        eJ.c("\u00c8", (Object)this, (Object)objectArray, (long)-6069759245983074948L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    @bP
    public void a(bG var1_1) {
        block13: {
            block11: {
                block12: {
                    var2_2 = eJ.k ^ 51299061095271L;
                    var4_3 = var2_2 ^ 23080426990300L;
                    var6_4 = eJ.c("\u00c6", (long)3512587473498613399L, (long)var2_2);
                    try {
                        try {
                            try {
                                try {
                                    v0 = this;
                                    if (var6_4 != null) break block11;
                                    if (v0.g == 0) {
                                    }
                                    ** GOTO lbl38
                                }
                                catch (MatchException v1) {
                                    throw eJ.c("\u00c6", (Object)v1, (long)3505465517988436958L, (long)var2_2);
                                }
                                v2 = this.f;
                                if (var6_4 != null) break block12;
                            }
                            catch (MatchException v3) {
                                throw eJ.c("\u00c6", (Object)v3, (long)3505465517988436958L, (long)var2_2);
                            }
                            if (v2 == -1) break block13;
                        }
                        catch (MatchException v4) {
                            throw eJ.c("\u00c6", (Object)v4, (long)3505465517988436958L, (long)var2_2);
                        }
                        v2 = this.f;
                    }
                    catch (MatchException v5) {
                        throw eJ.c("\u00c6", (Object)v5, (long)3505465517988436958L, (long)var2_2);
                    }
                }
                try {
                    v6 = new Object[2];
                    v6[1] = var4_3;
                    v6[0] = v2;
                    eJ.c("\u00c6", (Object)v6, (long)3508373050226037523L, (long)var2_2);
                    this.f = -1;
                    if (var6_4 == null) break block13;
lbl38:
                    // 2 sources

                    v0 = this;
                }
                catch (MatchException v7) {
                    throw eJ.c("\u00c6", (Object)v7, (long)3505465517988436958L, (long)var2_2);
                }
            }
            --v0.g;
        }
    }

    @bP
    public void a(aL aL2) {
        long l = k ^ 0x12CD194A7C09L;
        long l2 = l ^ 0x4D2C3F4FEC1CL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        eJ.c("\u00c8", (Object)this, (Object)objectArray, (long)1714430989867321717L, (long)l);
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (q[n3] != null) {
            return n3;
        }
        Object object = p[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 49;
            case 1 -> 51;
            case 2 -> 13;
            case 3 -> 24;
            case 4 -> 63;
            case 5 -> 52;
            case 6 -> 46;
            case 7 -> 44;
            case 8 -> 29;
            case 9 -> 9;
            case 10 -> 48;
            case 11 -> 4;
            case 12 -> 7;
            case 13 -> 15;
            case 14 -> 32;
            case 15 -> 19;
            case 16 -> 58;
            case 17 -> 23;
            case 18 -> 25;
            case 19 -> 11;
            case 20 -> 33;
            case 21 -> 39;
            case 22 -> 57;
            case 23 -> 14;
            case 24 -> 62;
            case 25 -> 36;
            case 26 -> 42;
            case 27 -> 30;
            case 28 -> 47;
            case 29 -> 18;
            case 30 -> 59;
            case 31 -> 38;
            case 32 -> 50;
            case 33 -> 56;
            case 34 -> 20;
            case 35 -> 41;
            case 36 -> 5;
            case 37 -> 53;
            case 38 -> 0;
            case 39 -> 21;
            case 40 -> 12;
            case 41 -> 26;
            case 42 -> 16;
            case 43 -> 10;
            case 44 -> 2;
            case 45 -> 31;
            case 46 -> 60;
            case 47 -> 37;
            case 48 -> 6;
            case 49 -> 22;
            case 50 -> 8;
            case 51 -> 28;
            case 52 -> 34;
            case 53 -> 17;
            case 54 -> 3;
            case 55 -> 45;
            case 56 -> 55;
            case 57 -> 27;
            case 58 -> 54;
            case 59 -> 35;
            case 60 -> 43;
            case 61 -> 1;
            case 62 -> 40;
            default -> 61;
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
        eJ.q[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = eJ.m(l, l2);
        Object object = p[n];
        if (object instanceof String) {
            String string = q[n];
            int n2 = string.indexOf(8);
            Class clazz = eJ.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = eJ.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = eJ.g(clazz3, string2, clazz2)) != null) {
                    eJ.p[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = eJ.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        eJ.p[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = eJ.n(127605433546048L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = eJ.m(l, l2);
        Object object = p[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = q[n];
                int n3 = string2.indexOf(8);
                clazz3 = eJ.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = eJ.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = eJ.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        eJ.p[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = eJ.n(127605433546048L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = eJ.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        eJ.p[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = eJ.n(127605433546048L, 0L);
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

    public static void k(Object[] objectArray) {
        block10: {
            CallSite callSite;
            CallSite callSite2;
            long l;
            Object2IntMap object2IntMap;
            block13: {
                class_1799 class_17992;
                block11: {
                    class_1799 class_17993;
                    block12: {
                        block9: {
                            class_17993 = (class_1799)objectArray[0];
                            object2IntMap = (Object2IntMap)objectArray[1];
                            l = (Long)objectArray[2];
                            l = k ^ l;
                            CallSite callSite3 = eJ.c("\u00c6", (long)-2929507910643039888L, (long)l);
                            eJ.c("\u00c8", (Object)object2IntMap, (long)-2929732120501490974L, (long)l);
                            callSite2 = callSite3;
                            try {
                                try {
                                    class_17992 = class_17993;
                                    if (callSite2 != null) break block9;
                                    if (eJ.c("\u00c8", (Object)class_17992, (long)-2928929517109633281L, (long)l) != false) break block10;
                                }
                                catch (MatchException matchException) {
                                    throw eJ.c("\u00c6", (Object)matchException, (long)-2935623542430548935L, (long)l);
                                }
                                class_17992 = class_17993;
                            }
                            catch (MatchException matchException) {
                                throw eJ.c("\u00c6", (Object)matchException, (long)-2935623542430548935L, (long)l);
                            }
                        }
                        try {
                            try {
                                if (callSite2 != null) break block11;
                                if (eJ.c("\u00c8", (Object)class_17992, (long)-2929142338427724956L, (long)l) != eJ.c("\u00c1", (long)-2929631692596402027L, (long)l)) break block12;
                            }
                            catch (MatchException matchException) {
                                throw eJ.c("\u00c6", (Object)matchException, (long)-2935623542430548935L, (long)l);
                            }
                            callSite = eJ.c("\u00c8", (Object)((class_9304)eJ.c("\u00c8", (Object)class_17993, (Object)eJ.c("\u00c1", (long)-2927906534201000220L, (long)l), (Object)eJ.c("\u00c1", (long)-2928183129864222204L, (long)l), (long)-2930619477338459177L, (long)l)), (long)-2930449133428996594L, (long)l);
                            break block13;
                        }
                        catch (MatchException matchException) {
                            throw eJ.c("\u00c6", (Object)matchException, (long)-2935623542430548935L, (long)l);
                        }
                    }
                    class_17992 = class_17993;
                }
                callSite = eJ.c("\u00c8", (Object)eJ.c("\u00c8", (Object)class_17992, (long)-2928382710022221134L, (long)l), (long)-2930449133428996594L, (long)l);
            }
            CallSite callSite4 = callSite;
            CallSite callSite5 = eJ.c("\u00c8", (Object)callSite4, (long)-2929004753591818363L, (long)l);
            while (eJ.c("\u00c8", (Object)callSite5, (long)-2928265616630456290L, (long)l) != false) {
                Object2IntMap.Entry entry = (Object2IntMap.Entry)eJ.c("\u00c8", (Object)callSite5, (long)-2930198148744462695L, (long)l);
                eJ.c("\u00c8", (Object)object2IntMap, (Object)((class_6880)eJ.c("\u00c8", (Object)entry, (long)-2929279728997933446L, (long)l)), (int)eJ.c("\u00c8", (Object)entry, (long)-2928559434772493631L, (long)l), (long)-2931293549958056915L, (long)l);
                if (callSite2 == null) continue;
            }
        }
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

    public void j(Object[] objectArray) {
        block32: {
            CallSite callSite;
            long l;
            long l2;
            block31: {
                CallSite callSite2;
                CallSite callSite3;
                block29: {
                    long l3;
                    long l4;
                    block30: {
                        block27: {
                            long l5;
                            block28: {
                                block25: {
                                    block26: {
                                        block23: {
                                            block24: {
                                                block21: {
                                                    block22: {
                                                        l2 = (Long)objectArray[0];
                                                        long l6 = l2 = k ^ l2;
                                                        l5 = l6 ^ 0x1F9118626F14L;
                                                        long l7 = l6 ^ 0x446AC5395AEFL;
                                                        l4 = l6 ^ 0x206602573175L;
                                                        l = l6 ^ 0x7DE313354A62L;
                                                        l3 = l6 ^ 0x25CF4727F7B1L;
                                                        callSite3 = eJ.c("\u00c6", (long)-8070064961762851287L, (long)l2);
                                                        try {
                                                            Object[] objectArray2 = new Object[1];
                                                            objectArray2[0] = l7;
                                                            if (eJ.c("\u00c6", (Object)objectArray2, (long)-8066494808010552842L, (long)l2) == null) {
                                                                return;
                                                            }
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw eJ.c("\u00c6", (Object)matchException, (long)-8062706336384189600L, (long)l2);
                                                        }
                                                        try {
                                                            try {
                                                                reference cfr_temp_0 = eJ.c("\u00c8", (Object)dn_0.a, (long)-8069343900535555530L, (long)l2) * 100.0f - eJ.c("\u00c8", (Object)((Float)((Object)eJ.c("\u00c8", (Object)this.a, (long)-8068284602610815047L, (long)l2))), (long)-8067716678762065381L, (long)l2);
                                                                callSite2 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                                                if (callSite3 != null) break block21;
                                                                if (callSite2 <= 0) break block22;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw eJ.c("\u00c6", (Object)matchException, (long)-8062706336384189600L, (long)l2);
                                                            }
                                                            this.g = 1;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw eJ.c("\u00c6", (Object)matchException, (long)-8062706336384189600L, (long)l2);
                                                        }
                                                    }
                                                    callSite2 = (CallSite)this.g;
                                                }
                                                try {
                                                    if (callSite3 != null) break block23;
                                                    if (callSite2 <= 0) break block24;
                                                }
                                                catch (MatchException matchException) {
                                                    throw eJ.c("\u00c6", (Object)matchException, (long)-8062706336384189600L, (long)l2);
                                                }
                                                return;
                                            }
                                            reference cfr_temp_1 = eJ.c("\u00ef", (Object)eJ.c("\u00ef", (Object)b, (long)-8063017038092196377L, (long)l2), (long)-8067246622181881215L, (long)l2) - 1.5;
                                            callSite2 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 > 0 ? 1 : -1);
                                        }
                                        try {
                                            if (callSite3 != null) break block25;
                                            if (callSite2 <= 0) break block26;
                                        }
                                        catch (MatchException matchException) {
                                            throw eJ.c("\u00c6", (Object)matchException, (long)-8062706336384189600L, (long)l2);
                                        }
                                        return;
                                    }
                                    callSite2 = (CallSite)this.f;
                                }
                                try {
                                    try {
                                        if (callSite3 != null) break block27;
                                        if (callSite2 == -1) break block28;
                                    }
                                    catch (MatchException matchException) {
                                        throw eJ.c("\u00c6", (Object)matchException, (long)-8062706336384189600L, (long)l2);
                                    }
                                    return;
                                }
                                catch (MatchException matchException) {
                                    throw eJ.c("\u00c6", (Object)matchException, (long)-8062706336384189600L, (long)l2);
                                }
                            }
                            Object[] objectArray3 = new Object[1];
                            objectArray3[0] = l5;
                            callSite2 = eJ.c("\u00c8", (Object)this, (Object)objectArray3, (long)-8066902294262964625L, (long)l2);
                        }
                        try {
                            if (callSite3 != null) break block29;
                            if (callSite2 != false) break block30;
                        }
                        catch (MatchException matchException) {
                            throw eJ.c("\u00c6", (Object)matchException, (long)-8062706336384189600L, (long)l2);
                        }
                        return;
                    }
                    Object[] objectArray4 = new Object[1];
                    objectArray4[0] = l3;
                    this.f = (int)eJ.c("\u00c6", (Object)objectArray4, (long)-8067897329644394088L, (long)l2);
                    Object[] objectArray5 = new Object[1];
                    objectArray5[0] = l4;
                    callSite2 = eJ.c("\u00c6", (Object)objectArray5, (long)-8068822638971921610L, (long)l2);
                }
                CallSite callSite4 = callSite2;
                try {
                    try {
                        callSite = callSite4;
                        if (callSite3 != null) break block31;
                        if (callSite == -1) break block32;
                    }
                    catch (MatchException matchException) {
                        throw eJ.c("\u00c6", (Object)matchException, (long)-8062706336384189600L, (long)l2);
                    }
                    callSite = callSite4;
                }
                catch (MatchException matchException) {
                    throw eJ.c("\u00c6", (Object)matchException, (long)-8062706336384189600L, (long)l2);
                }
            }
            Object[] objectArray6 = new Object[2];
            objectArray6[1] = l;
            objectArray6[0] = (int)callSite;
            eJ.c("\u00c6", (Object)objectArray6, (long)-8066413479049464915L, (long)l2);
            this.g = 1;
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(eJ.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(eJ.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


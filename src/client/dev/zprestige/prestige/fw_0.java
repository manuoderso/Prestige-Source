/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1799
 *  net.minecraft.class_310
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bl_0;
import dev.zprestige.prestige.dC;
import dev.zprestige.prestige.dF;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dQ;
import dev.zprestige.prestige.dR;
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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1799;
import net.minecraft.class_310;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.fw
 */
public class fw_0
extends dV
implements dF {
    private dR a;
    private dQ c;
    private dM d;
    private dM e;
    private dO f;
    private dO g;
    private f5 h;
    private float i;
    private int j;
    private int k;
    private boolean l;
    private static final long m = hc.a(6019182552950028177L, 7503134660862116168L, MethodHandles.lookup().lookupClass()).a(173524512675480L);
    private static final String[] n;
    private static final String[] o;
    private static final Map p;
    private static final long q;
    private static final Object[] r;
    private static final String[] s;

    public fw_0() {
        long l = m ^ 0x64A4BA569DCAL;
        long l2 = l ^ 0x4FA0F0E66CCBL;
        this.h = new f5(l2);
        this.i = 0.0f;
        this.j = 0;
        this.k = 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        r = new Object[87];
        s = new String[87];
        fw_0.f();
        p = new HashMap(13);
        long l = m ^ 0x4967D2D26823L;
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
        String string = "\u00d1n\u00afM\u0001-&\u00b6\u00f5\u0016\u008e\u008fZ\u0091\u0002j\u0010\u0010?\u0090\u0089\u00df\u00a2\u0006\u009e\u0006\u00bdEv\u00f5\u009c\u0094\u009d\u0010YC\u001e\u00c0cb\u00b9u\u00ca\u00a3\u0085\u0015\u00ce\u00df[g";
        int n2 = "\u00d1n\u00afM\u0001-&\u00b6\u00f5\u0016\u008e\u008fZ\u0091\u0002j\u0010\u0010?\u0090\u0089\u00df\u00a2\u0006\u009e\u0006\u00bdEv\u00f5\u009c\u0094\u009d\u0010YC\u001e\u00c0cb\u00b9u\u00ca\u00a3\u0085\u0015\u00ce\u00df[g".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = fw_0.b(byArray3).intern();
            if ((n4 += n3) >= n2) break;
            n3 = string.charAt(n4);
        }
        fw_0.n = stringArray;
        o = new String[3];
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        int n6 = 1;
        while (true) {
            if (n6 >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l2 = -9107496046359744009L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                q = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                return;
            }
            byArray5 = byArray5;
            byArray5[n6] = (byte)(l << n6 * 8 >>> 56);
            ++n6;
        }
    }

    @Override
    public void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x7FAB131DDD11L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = this;
        fw_0.c("\u00eb", (Object)fw_0.c("\u00ba", (long)3996502611934204797L, (long)l), (Object)objectArray2, (long)3993539293039180526L, (long)l);
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6D87;
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
                throw new RuntimeException("dev/zprestige/prestige/fw", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = fw_0.n[n2].getBytes("ISO-8859-1");
            fw_0.o[n2] = fw_0.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return o[n2];
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fw" + " : " + string + " : " + methodType.toString(), exception);
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

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = fw_0.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    @Override
    public boolean b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fw" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fw_0.m(l, l2);
            object = r[n];
            try {
                if (!(object instanceof String)) break block2;
                fw_0.r[n] = clazz = Class.forName(s[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fw_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fw_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fw_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fw_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = r;
        r[0] = "\fv\u0001f84\u001av\u0004<+#\r=\u0007:'7\u001cz\u0010-l #";
        objectArray[1] = "H\u000f2}\u001b#C\u0000#2z-H\u000b'h";
        objectArray[2] = "?Q,'w\u001e4^=h\n\u0006'Y4!";
        objectArray[3] = Boolean.TYPE;
        fw_0.s[3] = "java/lang/Boolean";
        objectArray[4] = "i~\u0015i\u00156\u007f~\u00103\u0006!h5\u00135\n5yr\u0004\"A'E";
        objectArray[5] = "-+1E?eX\u000b:J.*%\u0013)M'cM";
        objectArray[6] = "&\u001c#\u0007[#&\u001c4[W,<W4EW9;&d\u0018\u0006";
        objectArray[7] = "\u0017E3F\t\"\u0017E$\u001a\u0005-\r\u000e$\u0004\u00058\n\u007fp\\R";
        objectArray[8] = "1)]^C\b1)J\u0002O\u0007+bJ\u001cO\u0012,\u0013\u0018H\u001eS";
        objectArray[9] = "DXrS_\u0015DXe\u000fS\u001a^\u0013e\u0011S\u000fYb7J\u000bN";
        objectArray[10] = "%IOWP7%IX\u000b\\8?\u0002X\u0015\\-8s\nN\u0004g";
        objectArray[11] = "_d 8X\u0014_d7dT\u001bE/7zT\u000eB^e \u0003L";
        objectArray[12] = Integer.TYPE;
        fw_0.s[12] = "java/lang/Integer";
        objectArray[13] = "_\u000eh$B'I\u000em~Q0^Enx]$O\u0002yo\u00161L";
        objectArray[14] = "J(-v;yA'<9XtT*3RmvE9/~z{";
        objectArray[15] = "3qn9?`%qkc,w2:he c#}\u007frks8";
        objectArray[16] = "@\u0013\u0001\rUG53\n\u0002D\bT=\u0001\t@R ";
        objectArray[17] = Float.TYPE;
        fw_0.s[17] = "java/lang/Float";
        objectArray[18] = "$s:KtW$s-\u0017xX>8-\txM9I\u007fW/\u0006";
        objectArray[19] = Void.TYPE;
        fw_0.s[19] = "java/lang/Void";
        objectArray[20] = "F\t4\u000e\u0007VM\u0006%AkUC\u0004'\u000eG";
        objectArray[21] = "a\u001d+(V9a\u001d<tZ6{V<jZ#|'k5\f";
        objectArray[22] = "K%wL\u0015l]%r\u0016\u0006{Jnq\u0010\no[)f\u0007A\u007f]";
        objectArray[23] = "d~D. \u0010\u0011^O!1_pPD*5\u0005\u0004";
        objectArray[24] = "G\u0013\u0018-\u001e\u0011Y\u001b\u0002bb\u0005C\u0016\u0001!";
        objectArray[25] = "\u0010Jp3CW\u0006JuiP@\u0011\u0001vo\\T\u0000Fax\u0017C\"";
        objectArray[26] = "\u0010\u001f\u000f}b=e?\u0004rsr\u00041\u000fyw(p";
        objectArray[27] = "\u001e\u0001\u0007\u0014\u0007\u001fk!\f\u001b\u0016P\n/\u0007\u0010\u0012\n~";
        objectArray[28] = "FR\u001ctWmM]\r;?mCR\u001e";
        objectArray[29] = "*x\u0001Du[_X\nKd\u0014>V\u0001@`NJ";
        objectArray[30] = ".\t\u0001\u000eO'8\t\u0004T\\0/B\u0007RP$>\u0005\u0010E\u001b4?";
        objectArray[31] = "o\u000e\u001c\u00028%\u001a.\u0017\r)j{ \u001c\u0006-0\u000f";
        objectArray[32] = "Z'L4Z7/\u0007G;KxN\tL0O\":";
        objectArray[33] = "4eAr[\u0007*m[=&\u0017*";
        objectArray[34] = "+'\u0013/@(='\u0016uS?*l\u0015s_+;+\u0002d\u0014<\u000b";
        objectArray[35] = "knC\u0005VA\u001eNH\nG\u000e\u007f@C\u0001CT\u000b";
        objectArray[36] = "|\u001b\u0007u_uj\u001b\u0002/Lb}P\u0001)@vl\u0017\u0016>\u000baI";
        objectArray[37] = "\u0002u`f\u0003\u0012wUki\u0012]\u0016[`b\u0016\u0007b";
        objectArray[38] = "kqh'\u007f\f}qm}l\u001bj:n{`\u000f{}yl+\u001fc}{gqR_f{zq\u0015hq";
        objectArray[39] = "|\u000eN\u0007|?j\u000eK]o(}EH[c<l\u0002_L()-";
        objectArray[40] = "\u0011k2\u0001\n/dK9\u000e\u001b`\u0005E2\u0005\u001f:q";
        objectArray[41] = "K\u0016\u001c\u000e\"Q>6\u0017\u00013\u001e_8\u001c\n7D+";
        objectArray[42] = "\u0014inl7:aIec&u\u0000Gnh\"/t";
        objectArray[43] = "8|5\u0005Ea.|0_Vv973YZb(p$N\u0011u\u001b";
        objectArray[44] = "U_\u001ft/\u0016 \u007f\u0014{>YAq\u001fp:\u00035";
        objectArray[45] = "-\u00067V\u0017WX&<Y\u0006\u00189(7R\u0002BM";
        objectArray[46] = "N\u0005VC\u001aZ;%]L\u000b\u0015Z+VG\u000fO.";
        objectArray[47] = "PJ'(c\u0013%j,'r\\Dd',v\u00060";
        objectArray[48] = "}b}\u0017y\u0001q%d^B\u001bL!sW!EsatZ~y 2o\u0001yCs<)\u0007B";
        objectArray[49] = "\u0005vTa@%\u0006tZ+;+>v\u0012>U$UwP(VA";
        objectArray[50] = "\u000fB\u0006i\u0012jKG\u0010kykRW\u0013<.<\f\u0000KPD:RF\r5@{QC";
        objectArray[51] = "\u001d&\u000e'iO\\4\u0012wVLg2\u0012'5\u0019Xr\u0015*j%]qL(&[\u0018'\u001eyV";
        objectArray[52] = "\u001f<=w\u0004\u0018\u0006g\"#4Nv$\"\"W\u0019Id%/\b%Lg|-D[\t1.|4";
        objectArray[53] = "\"S4j\u007f',M\"e\u0000!pO.`l\u0013\"\u0002v6\u0000zs\u00033{l\"}Qv\u0007";
        objectArray[54] = "\u00170\fG\u0017kS5\u001aE|jJ%\u0019\u0012+=\u0014u@~\u0012:KsGABx\u0016q";
        objectArray[55] = "j\u001fbR<@,Ob_[M\u0012\fvS8\u001b-Lq^g'~\u001fj\u0005`\u001d-\u0011,\u0003[";
        objectArray[56] = "qhHDZbpc\u0003\u0000?=sb\u000f0[<wns\u0014C?$b\u001cFE`q\u0012";
        objectArray[57] = "oX(t0\u0013t\u001c7k\\\u0017\u000fZ0(?B0\u001a7%`~cI,~gD0Gjx\\";
        objectArray[58] = "H?-P,9C.4^P4B(3U\u0007g\u0013}g9; Y,+Z01@\"";
        objectArray[59] = "\u001cfPJ1wBeBYW)z~\\\u00194{E>[\u0014kG\u0016m@Ol}Ec\u0006IW";
        objectArray[60] = "\b:\f\u0017\u001b|\f{\u000f\u0012a|Xy\r\f\rN\u000b=QTa&U\u007f\u0000\u0014\u0002(Ki\u000fk";
        objectArray[61] = "PZ2\u0006\"\u0013T\u001b1\u0003X\u0013\u0000\u00193\u001d4!V\\nFhv]\f!\b$\u001a\u0011\u00045\u001eX";
        objectArray[62] = "\u001c3'V{C\u0014{sB\u001fCr}'\u001c|\u0015M= \u0011#)\u001en;J$\u0013M`}L\u001f";
        objectArray[63] = "giSH\nik.J\u00011xVdHGX,28F\u0003\n\u0011g%FP\fu;+\u0002\u00021";
        objectArray[64] = "/g&\rD`nu:]{cUs:\r\u00186j3=\u0000G\n9`&[@0jn`]{";
        objectArray[65] = ":\u000f!\u001a)Z~\n7\u0018BPk\u000b0D.b?Jn\u0012B\u000f:LnS<Jl\u001e?#";
        objectArray[66] = "(=MN~%,|NK\u0004%x~LUh\u0017.<\u0010\u000f8@\u007f~H\bt/-x\u0017]\u0004";
        objectArray[67] = "\u000bC4AUG\u001dF(\u001ekRwB1A\b\u0002H\u00026LW>M\u0001oN\u001b@\bW=\u001fk";
        objectArray[68] = "{xnD0.'\u007fmBJ \u001fig\u0011)u )`\u001cvIsz{Gqs t=AJ";
        objectArray[69] = "*TI6[$<QUie6VUL6\u0006ai\u0015K;Y]l\u0016\u00129\u0015#)@@he";
        objectArray[70] = ")\u0003+\u0003\"\u0011%D2J\u0019\u0000\u0018@%CzU'\u0000\"N%i\"\u0003{Li\u0017gU)\u001d\u0019";
        objectArray[71] = "V#h6>T\u0003\u007f)eZW\u0016n{k!:V#h6>T\u0003\u007f)eZ\u0000S(,\u007f$E\u0005z}\u000f";
        objectArray[72] = "ziv<X\u0005{?v-!\f%8.;v^um{g!\\*e7+M\u0004$7r";
        objectArray[73] = "v\u0014fp(z(\u0017tcN'\u0010\fj#-v/Lm.rJ|\u001fvuup/\u00110sN";
        objectArray[74] = "\u007f\u0012\u001b\u0018Z7{S\u0018\u001d 7/Q\u001a\u0003L\u0005y\u0013FY\u001dR(Q\u001e^P=zWA\u000b ";
        objectArray[75] = "~Ltrz\u0003)\u00070'\u001e\rt\u001ah'w\u0001M\u0014h7sg)A7tn\u0019l\u0017e%\u001e";
        objectArray[76] = "xeE\u001a`\bp-\u0011\u000e\u0004\u000b\u0016+EPg^)kB]8bz8Y\u0006?X)6\u001f\u0000\u0004";
        objectArray[77] = "DM;X^2@\u0018=\u0000;l=Ff\tYm\r\u0018e\u001bJ";
        objectArray[78] = " 'mQ2sl/yGNz}2\u007fD\"H-r$\u0013N/ptp]0/j!~#q\u007fj#`@\u007fa|,\u001f";
        objectArray[79] = "\\KWw\u000b~T\u0003\u0003co}2\u0005W=\f(\rEP0S\u0014\u0002\u001a\bc\u0011j\u0002\u0000]mo";
        objectArray[80] = "H\u0015`\b\u001fTMMs8\u0012>O\u001a`\u0001\u001fP\u001aF!R{";
        objectArray[81] = "\u0012X[\rb\u0011\u0016\u0019X\b\u0018\u0011B\u001bZ\u0016t#\u0015[\nK(t\u0015[\u0001Oh\nP\rS\u001e\u0018";
        objectArray[82] = "rx?'\u0003~.g8beit~+\";ntd/^\u000f{t#21]}+vB";
        objectArray[83] = "\u0017\rBN\u0011\u0006K\fI\u0017(\u001f\u001f0\n\u001fRA\u0015^_C\u0013\u0012qV\u000e^IA\u000f\n\u000fU\u0010x";
        objectArray[84] = "\u0000_\u0012(&NZR\b2_I@@\u0001,$$\u0000\r\u0012q;JUQS\"_\u001e\u0005\u0006V8![ST\u0007H";
        objectArray[85] = "6x\u0015q!s29\u0016t[sf;\u0014j7A0yH0d\u0016a;\u00107+y3=Ob[zg>\u00136a)ix\u0015\r";
        Object[] objectArray2 = objectArray;
        objectArray[86] = "n\u001c%k' b[<\"\u001c4__++\u007fd`\u001f,& Xo@tub&oZ!{\u001c";
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = fw_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private int d(Object[] objectArray) {
        Object object;
        block8: {
            long l = (Long)objectArray[0];
            l = m ^ l;
            int n = 0;
            CallSite callSite = fw_0.c("\u00d0", (long)8926522099286180714L, (long)l);
            while (n <= (int)q) {
                block7: {
                    block9: {
                        CallSite callSite2 = fw_0.c("\u00eb", (Object)fw_0.c("\u00eb", (Object)fw_0.c("m", (Object)b, (long)8926571388435481718L, (long)l), (long)8926780905526934108L, (long)l), (int)n, (long)8934734947580318152L, (long)l);
                        try {
                            try {
                                try {
                                    if (callSite != null) break block7;
                                    object = fw_0.c("\u00eb", (Object)fw_0.c("\u00eb", (Object)callSite2, (long)8926226743472291362L, (long)l), (Object)fw_0.c("\u00ba", (long)8934919163489315970L, (long)l), (long)8934282085658918144L, (long)l);
                                    if (callSite != null) break block8;
                                }
                                catch (MatchException matchException) {
                                    throw fw_0.c("\u00d0", (Object)matchException, (long)8926912559202536998L, (long)l);
                                }
                                if (object == 0) break block9;
                            }
                            catch (MatchException matchException) {
                                throw fw_0.c("\u00d0", (Object)matchException, (long)8926912559202536998L, (long)l);
                            }
                            return n;
                        }
                        catch (MatchException matchException) {
                            throw fw_0.c("\u00d0", (Object)matchException, (long)8926912559202536998L, (long)l);
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

    @Override
    public void d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l;
        long l3 = l2 ^ 0x2930131F329BL;
        long l4 = l2 ^ 0x4FC9861B63E7L;
        long l5 = l2 ^ 0x52D6E774439DL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l5;
        objectArray2[0] = this;
        fw_0.c("\u00eb", (Object)fw_0.c("\u00ba", (long)3248562564859709726L, (long)l), (Object)objectArray2, (long)3248279824213262545L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        fw_0.c("\u00eb", (Object)this.h, (Object)objectArray3, (long)3248862331929121549L, (long)l);
        this.i = (float)fw_0.c("\u00eb", (Object)fw_0.c("m", (Object)b, (long)3245651050861859485L, (long)l), (long)3248480336111438342L, (long)l);
        this.j = 0;
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l3;
        fw_0.c("\u00eb", (Object)this.h, (Object)objectArray4, (long)3248862331929121549L, (long)l);
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l4;
        fw_0.c("\u00eb", (Object)this.c, (Object)objectArray5, (long)3245831244195344101L, (long)l);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'm' || c == 'M' || c == '\u00ba' || c == 'F') {
                field = fw_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'm' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'M' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ba' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fw_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00eb' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d0' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return fw_0.c("\u00d0", (Object)((Object)q_0.Mace), (long)-2444066786934375404L, (long)l);
    }

    public static boolean a(Object[] objectArray) {
        class_1799 class_17992 = (class_1799)objectArray[0];
        long l = (Long)objectArray[1];
        l = m ^ l;
        return (boolean)fw_0.c("\u00eb", (Object)fw_0.c("\u00eb", (Object)class_17992, (long)-1987080515785367122L, (long)l), (Object)fw_0.c("\u00ba", (long)-1985209470176791794L, (long)l), (long)-1985848729859038580L, (long)l);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public dC a(Object[] objectArray) {
        CallSite callSite;
        reference var19_11;
        long l;
        long l2;
        block53: {
            CallSite callSite2;
            block54: {
                CallSite callSite3;
                long l3;
                block51: {
                    long l4;
                    block52: {
                        Object object;
                        long l5;
                        block50: {
                            Object object2;
                            long l6;
                            long l7;
                            block48: {
                                block49: {
                                    block44: {
                                        block45: {
                                            block46: {
                                                CallSite callSite4;
                                                long l8;
                                                block47: {
                                                    block42: {
                                                        block43: {
                                                            class_310 class_3102;
                                                            block41: {
                                                                l2 = (Long)objectArray[0];
                                                                long l9 = l2;
                                                                l7 = l9 ^ 0x27251590B815L;
                                                                l5 = l9 ^ 0x5C4ADFEF9EC8L;
                                                                l = l9 ^ 0x7F652AA44F3BL;
                                                                l3 = l9 ^ 0x3588DEF3E3DFL;
                                                                l8 = l9 ^ 0x5D885352C89BL;
                                                                l6 = l9 ^ 0x6D88BA4E35CEL;
                                                                l4 = l9 ^ 0x35A4EE5C881DL;
                                                                callSite3 = fw_0.c("\u00d0", (long)-1174031945244666050L, (long)l2);
                                                                try {
                                                                    try {
                                                                        class_3102 = b;
                                                                        if (callSite3 != null) break block41;
                                                                        if (fw_0.c("m", (Object)class_3102, (long)-1174042610577545327L, (long)l2) != null) return null;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw fw_0.c("\u00d0", (Object)matchException, (long)-1173571387606558094L, (long)l2);
                                                                    }
                                                                    class_3102 = b;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw fw_0.c("\u00d0", (Object)matchException, (long)-1173571387606558094L, (long)l2);
                                                                }
                                                            }
                                                            try {
                                                                try {
                                                                    object2 = fw_0.c("\u00eb", (Object)class_3102, (long)-1177393527075840925L, (long)l2);
                                                                    if (callSite3 != null) break block42;
                                                                    if (object2 != false) break block43;
                                                                    return null;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw fw_0.c("\u00d0", (Object)matchException, (long)-1173571387606558094L, (long)l2);
                                                                }
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw fw_0.c("\u00d0", (Object)matchException, (long)-1173571387606558094L, (long)l2);
                                                            }
                                                        }
                                                        object2 = this.l;
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            if (callSite3 != null) break block44;
                                                                            if (object2 == false) break block45;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw fw_0.c("\u00d0", (Object)matchException, (long)-1173571387606558094L, (long)l2);
                                                                        }
                                                                        callSite4 = fw_0.c("\u00eb", (Object)fw_0.c("m", (Object)b, (long)-1173770690805411806L, (long)l2), (long)-1176232467372153020L, (long)l2);
                                                                        if (callSite3 != null) break block46;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw fw_0.c("\u00d0", (Object)matchException, (long)-1173571387606558094L, (long)l2);
                                                                    }
                                                                    if (callSite4 == false) break block47;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw fw_0.c("\u00d0", (Object)matchException, (long)-1173571387606558094L, (long)l2);
                                                                }
                                                                callSite4 = fw_0.c("\u00eb", (Object)((Boolean)((Object)fw_0.c("\u00eb", (Object)this.e, (long)-1176174933847364876L, (long)l2))), (long)-1176659531226680408L, (long)l2);
                                                                if (callSite3 != null) break block46;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw fw_0.c("\u00d0", (Object)matchException, (long)-1173571387606558094L, (long)l2);
                                                            }
                                                            if (callSite4 == false) break block47;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw fw_0.c("\u00d0", (Object)matchException, (long)-1173571387606558094L, (long)l2);
                                                        }
                                                        Object[] objectArray2 = new Object[1];
                                                        objectArray2[0] = l3;
                                                        fw_0.c("\u00d0", (Object)objectArray2, (long)-1177570040698069413L, (long)l2);
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw fw_0.c("\u00d0", (Object)matchException, (long)-1173571387606558094L, (long)l2);
                                                    }
                                                }
                                                Object[] objectArray3 = new Object[2];
                                                objectArray3[1] = l8;
                                                objectArray3[0] = fw_0.c("\u00ba", (long)-1173237802088899750L, (long)l2);
                                                callSite4 = fw_0.c("\u00d0", (Object)objectArray3, (long)-1174199531901416052L, (long)l2);
                                            }
                                            this.l = 0;
                                        }
                                        object2 = fw_0.c("\u00eb", (String)((Object)fw_0.c("\u00eb", (Object)this.a, (long)-1176174933847364876L, (long)l2)), (Object)fw_0.b("f", (int)11192, (long)(0xFB5296085022987L ^ l2)), (long)-1176440817199935254L, (long)l2);
                                    }
                                    try {
                                        try {
                                            if (callSite3 != null) break block48;
                                            if (object2 != false) break block49;
                                            return null;
                                        }
                                        catch (MatchException matchException) {
                                            throw fw_0.c("\u00d0", (Object)matchException, (long)-1173571387606558094L, (long)l2);
                                        }
                                    }
                                    catch (MatchException matchException) {
                                        throw fw_0.c("\u00d0", (Object)matchException, (long)-1173571387606558094L, (long)l2);
                                    }
                                }
                                try {
                                    object = this;
                                    if (callSite3 != null) break block50;
                                    object2 = ((fw_0)object).k;
                                }
                                catch (MatchException matchException) {
                                    throw fw_0.c("\u00d0", (Object)matchException, (long)-1173571387606558094L, (long)l2);
                                }
                            }
                            try {
                                if (object2 != -1) {
                                    Object[] objectArray4 = new Object[2];
                                    objectArray4[1] = l6;
                                    objectArray4[0] = this.k;
                                    fw_0.c("\u00d0", (Object)objectArray4, (long)-1177015391585393205L, (long)l2);
                                    this.k = -1;
                                    Object[] objectArray5 = new Object[1];
                                    objectArray5[0] = l7;
                                    fw_0.c("\u00eb", (Object)this, (Object)objectArray5, (long)-1173434335708412465L, (long)l2);
                                    return null;
                                }
                            }
                            catch (MatchException matchException) {
                                throw fw_0.c("\u00d0", (Object)matchException, (long)-1173571387606558094L, (long)l2);
                            }
                            object = fw_0.c("\u00eb", (Object)this.f, (long)-1176174933847364876L, (long)l2);
                        }
                        var19_11 = fw_0.c("\u00eb", (Object)((Float)object), (long)-1176052202846351207L, (long)l2) - 1.0f + fw_0.c("\u00eb", (Object)dn_0.a, (long)-1173370538698531907L, (long)l2) * 2.0f;
                        Object[] objectArray6 = new Object[1];
                        objectArray6[0] = l5;
                        callSite2 = fw_0.c("\u00eb", (Object)this, (Object)objectArray6, (long)-1176318707474647990L, (long)l2);
                        try {
                            try {
                                callSite = callSite2;
                                if (callSite3 != null) break block51;
                                if (callSite != -1) break block52;
                                return null;
                            }
                            catch (MatchException matchException) {
                                throw fw_0.c("\u00d0", (Object)matchException, (long)-1173571387606558094L, (long)l2);
                            }
                        }
                        catch (MatchException matchException) {
                            throw fw_0.c("\u00d0", (Object)matchException, (long)-1173571387606558094L, (long)l2);
                        }
                    }
                    Object[] objectArray7 = new Object[1];
                    objectArray7[0] = l4;
                    this.k = (int)fw_0.c("\u00d0", (Object)objectArray7, (long)-1176942072272819449L, (long)l2);
                    callSite = fw_0.c("\u00eb", (Object)fw_0.c("m", (Object)b, (long)-1173770690805411806L, (long)l2), (long)-1176232467372153020L, (long)l2);
                }
                try {
                    try {
                        try {
                            try {
                                if (callSite3 != null) break block53;
                                if (callSite == false) break block54;
                            }
                            catch (MatchException matchException) {
                                throw fw_0.c("\u00d0", (Object)matchException, (long)-1173571387606558094L, (long)l2);
                            }
                            callSite = fw_0.c("\u00eb", (Object)((Boolean)((Object)fw_0.c("\u00eb", (Object)this.e, (long)-1176174933847364876L, (long)l2))), (long)-1176659531226680408L, (long)l2);
                            if (callSite3 != null) break block53;
                        }
                        catch (MatchException matchException) {
                            throw fw_0.c("\u00d0", (Object)matchException, (long)-1173571387606558094L, (long)l2);
                        }
                        if (callSite == false) break block54;
                    }
                    catch (MatchException matchException) {
                        throw fw_0.c("\u00d0", (Object)matchException, (long)-1173571387606558094L, (long)l2);
                    }
                    Object[] objectArray8 = new Object[1];
                    objectArray8[0] = l3;
                    fw_0.c("\u00d0", (Object)objectArray8, (long)-1177570040698069413L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw fw_0.c("\u00d0", (Object)matchException, (long)-1173571387606558094L, (long)l2);
                }
            }
            callSite = callSite2;
        }
        Object[] objectArray9 = new Object[4];
        objectArray9[3] = l;
        objectArray9[2] = false;
        objectArray9[1] = () -> fw_0.lambda$calculate$3((float)var19_11);
        objectArray9[0] = (int)callSite;
        fw_0.c("\u00d0", (Object)objectArray9, (long)-1173482906411736943L, (long)l2);
        return new dC((float)fw_0.c("\u00eb", (Object)fw_0.c("m", (Object)b, (long)-1173770690805411806L, (long)l2), (long)-1177188170923952300L, (long)l2), (float)var19_11);
    }

    /*
     * Exception decompiling
     */
    @bP
    public void a(bl_0 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [5[TRYBLOCK]], but top level block is 22[SWITCH]
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
        if (s[n3] != null) {
            return n3;
        }
        Object object = r[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 19;
            case 1 -> 45;
            case 2 -> 63;
            case 3 -> 22;
            case 4 -> 46;
            case 5 -> 49;
            case 6 -> 5;
            case 7 -> 4;
            case 8 -> 33;
            case 9 -> 20;
            case 10 -> 8;
            case 11 -> 23;
            case 12 -> 15;
            case 13 -> 58;
            case 14 -> 9;
            case 15 -> 39;
            case 16 -> 29;
            case 17 -> 44;
            case 18 -> 21;
            case 19 -> 62;
            case 20 -> 0;
            case 21 -> 47;
            case 22 -> 26;
            case 23 -> 27;
            case 24 -> 1;
            case 25 -> 51;
            case 26 -> 25;
            case 27 -> 31;
            case 28 -> 56;
            case 29 -> 2;
            case 30 -> 53;
            case 31 -> 3;
            case 32 -> 24;
            case 33 -> 37;
            case 34 -> 10;
            case 35 -> 13;
            case 36 -> 40;
            case 37 -> 38;
            case 38 -> 42;
            case 39 -> 17;
            case 40 -> 14;
            case 41 -> 55;
            case 42 -> 41;
            case 43 -> 35;
            case 44 -> 32;
            case 45 -> 57;
            case 46 -> 28;
            case 47 -> 7;
            case 48 -> 60;
            case 49 -> 18;
            case 50 -> 48;
            case 51 -> 54;
            case 52 -> 30;
            case 53 -> 11;
            case 54 -> 16;
            case 55 -> 59;
            case 56 -> 43;
            case 57 -> 34;
            case 58 -> 12;
            case 59 -> 50;
            case 60 -> 36;
            case 61 -> 6;
            case 62 -> 61;
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
        fw_0.s[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = fw_0.m(l, l2);
        Object object = r[n];
        if (object instanceof String) {
            String string = s[n];
            int n2 = string.indexOf(8);
            Class clazz = fw_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fw_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fw_0.g(clazz3, string2, clazz2)) != null) {
                    fw_0.r[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fw_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fw_0.r[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fw_0.n(126248140748423L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = fw_0.m(l, l2);
        Object object = r[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = s[n];
                int n3 = string2.indexOf(8);
                clazz3 = fw_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fw_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fw_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        fw_0.r[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fw_0.n(126248140748423L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fw_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fw_0.r[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fw_0.n(126248140748423L, 0L);
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

    private void j(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = m ^ l;
        long l3 = l2 ^ 0x76AED6CD2C0DL;
        long l4 = l2 ^ 0x105743C97D71L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        fw_0.c("\u00eb", (Object)this.h, (Object)objectArray2, (long)3710993087478779291L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        fw_0.c("\u00eb", (Object)this.c, (Object)objectArray3, (long)3719372748455325811L, (long)l);
        ++this.j;
    }

    private boolean lambda$new$0(Float f) {
        long l = m ^ 0x12FEE8518D79L;
        return (boolean)fw_0.c("\u00eb", (String)((Object)fw_0.c("\u00eb", (Object)this.a, (long)-8651130416388619608L, (long)l)), (Object)fw_0.b("f", (int)27207, (long)(0x2C9C9BA8AEF8025L ^ l)), (long)-8651396370649024330L, (long)l);
    }

    private boolean lambda$new$2(Float f) {
        long l = m ^ 0x587AE81022EFL;
        return (boolean)fw_0.c("\u00eb", (String)((Object)fw_0.c("\u00eb", (Object)this.a, (long)2911375110174010686L, (long)l)), (Object)fw_0.b("f", (int)7131, (long)(0x993F6C4D4825E2DL ^ l)), (long)2911113519591970592L, (long)l);
    }

    private boolean lambda$new$1(Boolean bl) {
        long l = m ^ 0x7FCFEA2BD41CL;
        return (boolean)fw_0.c("\u00eb", (String)((Object)fw_0.c("\u00eb", (Object)this.a, (long)-2408177262979572787L, (long)l)), (Object)fw_0.b("f", (int)27207, (long)(0x2C9A48B8895D940L ^ l)), (long)-2407879992418098733L, (long)l);
    }

    private static void lambda$calculate$3(float f) {
        long l = m ^ 0x681AC329A8FCL;
        long l2 = l ^ 0x46F5B3F18542L;
        CallSite callSite = fw_0.c("\u00eb", (Object)fw_0.c("m", (Object)b, (long)-6742743257209102853L, (long)l), (long)-6741110789826345632L, (long)l);
        fw_0.c("\u00eb", (Object)fw_0.c("m", (Object)b, (long)-6742743257209102853L, (long)l), (float)f, (long)-6740445144734218048L, (long)l);
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = fw_0.c("\u00ba", (long)-6742230510802758013L, (long)l);
        fw_0.c("\u00d0", (Object)objectArray, (long)-6742595890861227947L, (long)l);
        fw_0.c("\u00eb", (Object)fw_0.c("m", (Object)b, (long)-6742743257209102853L, (long)l), (float)callSite, (long)-6740445144734218048L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fw_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(fw_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


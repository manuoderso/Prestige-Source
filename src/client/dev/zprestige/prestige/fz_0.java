/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2378
 *  net.minecraft.class_2663
 *  net.minecraft.class_3966
 *  net.minecraft.class_6880
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bg_0;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dV;
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
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2378;
import net.minecraft.class_2663;
import net.minecraft.class_3966;
import net.minecraft.class_6880;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.fz
 */
public class fz_0
extends dV {
    private dO a;
    private f5 c;
    private boolean i;
    private static final long k = hc.a(-7063436266633090820L, 3881263504891505454L, MethodHandles.lookup().lookupClass()).a(133522028879346L);
    private static final long l;
    private static final Object[] m;
    private static final String[] n;

    public fz_0() {
        long l = k ^ 0x1283E60E86A8L;
        long l2 = l ^ 0x14B610E752B5L;
        this.c = new f5(l2);
        this.i = 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        m = new Object[86];
        n = new String[86];
        fz_0.f();
        long l = k ^ 0x7F001959D664L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 7496178868078495346L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                fz_0.l = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
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
            throw new RuntimeException("dev/zprestige/prestige/fz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public int c(Object[] objectArray) {
        block5: {
            CallSite callSite;
            CallSite callSite2;
            long l;
            block4: {
                int n = (Integer)objectArray[0];
                l = (Long)objectArray[1];
                l = k ^ l;
                callSite2 = fz_0.b("\u00de", (Object)fz_0.b("\u00de", (Object)fz_0.b("Y", (Object)b, (long)8658366852558536892L, (long)l), (long)8659193437905286356L, (long)l), (int)n, (long)8662575864648954234L, (long)l);
                CallSite callSite3 = fz_0.b("l", (long)8658444974696355858L, (long)l);
                try {
                    try {
                        callSite = callSite2;
                        if (callSite3 != null) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw fz_0.b("l", (Object)matchException, (long)8661706093066913140L, (long)l);
                    }
                    callSite = fz_0.b("\u00de", (Object)fz_0.b("\u00de", (Object)((class_2378)fz_0.b("\u00de", (Object)fz_0.b("\u00de", (Object)fz_0.b("\u00de", (Object)fz_0.b("Y", (Object)b, (long)8658863682636753738L, (long)l), (long)8662324305643804025L, (long)l), (Object)fz_0.b("\u00de", (Object)fz_0.b("\u00c8", (long)8658902763139373579L, (long)l), (long)8660576891049488419L, (long)l), (long)8658461348914940589L, (long)l), (long)8660550642614116517L, (long)l)), (Object)fz_0.b("\u00de", (Object)fz_0.b("\u00c8", (long)8658902763139373579L, (long)l), (long)8658230571149930178L, (long)l), (long)8659098498890537077L, (long)l), (long)8660550642614116517L, (long)l);
                }
                catch (MatchException matchException) {
                    throw fz_0.b("l", (Object)matchException, (long)8661706093066913140L, (long)l);
                }
            }
            float f = (float)fz_0.b("l", (Object)((class_6880)callSite), (Object)callSite2, (long)8662259164545224316L, (long)l);
            return (int)f;
        }
        return 0;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fz_0.m(l, l2);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                fz_0.m[n] = clazz = Class.forName(fz_0.n[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fz_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fz_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fz_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fz_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = m;
        m[0] = "l\u0013~\u007fm1z\u0013{%~&mXx#r2|\u001fo49'r";
        objectArray[1] = "@7P\u001d\u0003~K8AR`s^5N9UqO&R\u0015B|";
        objectArray[2] = "GV\u001d\"\u00003Y^\u0007mg2HE\n7A4";
        objectArray[3] = "\u0007V3\u0013Q\u0000\fY\"\\0\u000e\u0007R&\u0006";
        objectArray[4] = "\u0003a+\u0017\u0012[\u0015a.M\u0001L\u0002*-K\rX\u0013m:\\FJ/";
        objectArray[5] = "oj\"\u0012\u0003^\u001aJ)\u001d\u0012\u0011gR:\u001a\u001bX\u000f";
        objectArray[6] = "\b\u000bJ%\u0005(\b\u000b]y\t'\u0012@]g\t2\u00151\r:X";
        objectArray[7] = "\u0010p\b51r\u0010p\u001fi=}\n;\u001fw=h\rJK/j";
        objectArray[8] = "\"I-\u001f\u0015\u0007Wi&\u0010\u0004H6g-\u001b\u0000\u0012B";
        objectArray[9] = Integer.TYPE;
        fz_0.n[9] = "java/lang/Integer";
        objectArray[10] = ".C\"iA\u0013%L3&&\u00110G3m\u001d";
        objectArray[11] = "gC\u00014+|yK\u001b{I`~V";
        objectArray[12] = Boolean.TYPE;
        fz_0.n[12] = "java/lang/Boolean";
        objectArray[13] = "gJ\u000fO\u0012+\u0012j\u0004@\u0003dsd\u000fK\u0007>\u0007";
        objectArray[14] = "q\u0019u{EMq\u0019b'IBkRb9IWl#0c\u001e\u0015";
        objectArray[15] = "i1.H\u0017~i19\u0014\u001bqsz9\n\u001bdt\u000bkQC.";
        objectArray[16] = "%MT7F@3MQmUW$\u0006RkYC5AE|\u0012S3";
        objectArray[17] = "N\u0013I{5F;3Bt$\tZ=I\u007f S.";
        objectArray[18] = Double.TYPE;
        fz_0.n[18] = "java/lang/Double";
        objectArray[19] = "R 6\u0004V\u001fR !XZ\u0010Hk!FZ\u0005O\u001aq\u0013\r@";
        objectArray[20] = "\u0004?\u0010k(T\u0004?\u00077$[\u001et\u0007)$N\u0019\u0005Uw|\n";
        objectArray[21] = "r\u0001\u000bP\\or\u0001\u001c\fP`hJ\u001c\u0012Puo;MM\b";
        objectArray[22] = "yU%c\u0005DoU 9\u0016Sx\u001e#?\u001aGiY4(QR(";
        objectArray[23] = "O\u0019\u00122UR:9\u0019=D\u001d[7\u00126@G/";
        objectArray[24] = "&\\\u0018$ i0\\\u001d~3~'\u0017\u001ex?j6P\totz-";
        objectArray[25] = "K5\u0014p\u0012+>\u0015\u001f\u007f\u0003d_\u001b\u0014t\u0007>+";
        objectArray[26] = Void.TYPE;
        fz_0.n[26] = "java/lang/Void";
        objectArray[27] = "6#?|a\u000f(+%3\u001c\u001f(";
        objectArray[28] = "j[h?\u00121j[\u007fc\u001e>p\u0010\u007f}\u001e+wa)\"Mi";
        objectArray[29] = "}FEI\u000bM}FR\u0015\u0007Bg\rR\u000b\u0007W`|\u0003^P\u0014";
        objectArray[30] = "39\f([?39\u001btW0)r\u001bjW%.\u0003M2\u0003c";
        objectArray[31] = "^Q\u007flD\u0012@Ye#%\u0017@Yfc\u000b\u000b";
        objectArray[32] = "\u0016;b~lF\u0016;u\"`I\fpu<`\\\u000b\u0001 c9";
        objectArray[33] = "*HP=\u0013o*HGa\u001f`0\u0003G\u007f\u001fu7r\u0015+G5";
        objectArray[34] = "k\u0018\u0005!\u0006\u001ak\u0018\u0012}\n\u0015qS\u0012c\n\u0000v\"C<\\K";
        objectArray[35] = "u\fRyHRu\fE%D]oGE;DHh6\u0017o\u001c\u000b";
        objectArray[36] = ":E02\u0016`:E'n\u001ao \u000e'p\u001az'\u007fr$C9";
        objectArray[37] = "@\u001ed3}*5>o<leT0d7h? ";
        objectArray[38] = ".SObW`.SX>[o4\u0018X [z3i\tz\f:";
        objectArray[39] = Byte.TYPE;
        fz_0.n[39] = "java/lang/Byte";
        objectArray[40] = "%\u0018K_k[P8@Pz\u001416K[~NE";
        objectArray[41] = "-<AS\"\u0017;<D\t1\u0000,wG\u000f=\u0014=0P\u0018v\u0005.";
        objectArray[42] = "$\u001fz\u0002\u0019iQ?q\r\b&01z\u0006\f|D";
        objectArray[43] = "]\u0012\u0005'jF]\u0012\u0012{fIGY\u0012ef\\@(C<>\u0019";
        objectArray[44] = "ed`^\u0019%sde\u0004\n2d/f\u0002\u0006&uhq\u0015M1J";
        objectArray[45] = "3,\u007f@G|8#n\u000f/|6,}";
        objectArray[46] = Float.TYPE;
        fz_0.n[46] = "java/lang/Float";
        objectArray[47] = "w\u00079j4~\u0002'2e%1c)9n!k\u0017";
        objectArray[48] = "J\u007f\u001fo4XI\"\t\u0014!1\u0007!^}yP\u0014y\u0006zH\u000f\fr\u0005m,X\u0006d\u0002\u0014";
        objectArray[49] = "uK\u0013+,4i\\\u0007:\u0012>zZ\u00157~\f-\u0017Lo-[t\u001b\u0016*{!y^\u00079\u0012";
        objectArray[50] = "\u0002EL\\*!\u0001AO\u0010\u0017w9\u0017MQ(pY\\M\nk\u001d";
        objectArray[51] = "2-\"e+\u000349wqO\bo*\"p\u0018_1}z\u001crZ>,zrs\u0004c-";
        objectArray[52] = "\u000e%\u000f\u007f\tN\b1ZkmES\"\u000fj:\u0012\rqV\u0006\u0000MR5\f9\u001f@S!";
        objectArray[53] = "\u0003E\u0013Rf\u001a\u0006\u001c\u001fC]\u0014\n\u0007\u0012K1&[EM\u0011lq\u0005\u0016\u0014Wc\u001e\u0019\u0001\u0000F]\u0015\u0006C\u0012Bd@\u000b\u001cK,";
        objectArray[54] = "h+>\u001av#m//\u0005\t*\u0006\"aB`rg19\u001agC6=?\u00123#>#=B\t";
        objectArray[55] = "a-u*>g`s(+\u0002l1m%&n^b)z|\u0002h8h+$d70)tA";
        objectArray[56] = ")D\u000b_k\"/P^K\u000f)tC\u000bJX~+\u001eP&j+-\u001e\u0012\u001f`y*G";
        objectArray[57] = "T*&;T\u001cWw0@Du\u0019tg)\u0019\u0014\n,?.(K\u0012'<9L\u001c\u00181;@";
        objectArray[58] = ".[\u0015M\u000b$ \u000e\u0014Yf`x\u0005\u0019O!p\u0011_\u001fN\u0007gu\b\u0015X\u0000\u001e.[\u0015M\u000b$ \u000e\u0014Yf";
        objectArray[59] = "N\u0015InIGM\t@02CJ\b\\?e\u0010\u0013\\\u0005l2OF\u0003Cm]SQ\u0017R";
        objectArray[60] = "9Z\t3NJ0\u001b\u001c5!W2_\u000e-Mef\u001bTp\u001a2<\u001e\r0HH1[\u001c#!V>\u001b\u000e$\u0018\u00033DWJ";
        objectArray[61] = "G\fN@Q\b\u0002\u0002\fY3\u0003\u0017\u00184PC\u001f~S\u001d\\YY\u001e[\u0003^\tc";
        objectArray[62] = "\na2\r\bO\t};SsK\u000e|'\\$\u0018W(~\u0000sG\u0002w8\u000e\u001c[\u0015c)";
        objectArray[63] = "(\u000fW!I2)Q\n u9xO\u0007-\u0019\u000b.\nZvE\\$I\u000ew\u0010&r\r\b$u";
        objectArray[64] = "{kkr\u0019d|tqarf\u0011t%$\u001b0pg}|\u001c\u0001!k{tHa)uy$r";
        objectArray[65] = "^BJ&^sY\u0001\f frQ<\u000e5\u0014m\u0005ER=\u0004i?\u0006[(\u001e/FZS8\u001a\u0015^BJ&^sY\u0001\f f";
        objectArray[66] = "bY4[V\"g]%D)+\fPk\u0003@smC3[GBmD-WL$2Ll\b)";
        objectArray[67] = "Xt\u0011>\"M[)\u0007E7$\u0014jP e\u001e^v\rE/[_pQ\u007feG\u0002\u0015";
        objectArray[68] = "0\u000f@N4Qu\u0001\u0002WV\\d\u0010\u00003lU{\u0018FJ0]k\u001c|";
        objectArray[69] = "\rA@m\u0003\u000e\u001dBD,z[\fWFw\u0016iX\u0014\u0019 @>\rTCr\u000bO\u0003D^mz";
        objectArray[70] = ": \\sU \u007fr@ lu.7[-\u0000Gzr\u0007uT\u00109']{\u0013`\"1\u0002:l";
        objectArray[71] = "`<g\u001cx,nif\b\u0015w9zH\u001aqk2\u0006(\byw&b\u007f\u0002op_";
        objectArray[72] = "2\u0016Tkqq<\u001b\u000fn\u001b&a\u0005j,t=uS\u0013p|-qiZyz%7\tRgxu\r";
        objectArray[73] = "\u0002Qf\u001a$\u0011\u0005N|\tO\u001dhN(L&E\t]p\u0014!t\tZn\u0018*\u0012VR/GO";
        objectArray[74] = "d0?3O\fnb8j2Pl gd^b:d<?\u00035ebf}\t^`;jl2";
        objectArray[75] = "d,.?&\tc#/ M\\n./%!n3hu\u007fMAo=/z5T9-$B$[3)p{?U?2O|6Ub+++<CeR";
        objectArray[76] = "N\u0016^n-YMKH\u0015:0\u0003H\u001f|`Q\u0010\u0010G{Q\u000e\b\u001bDl5Y\u0002\rC\u0015";
        objectArray[77] = "\u0004l\u000f+\"\u0010\u0004+\n*^\u0018d$Qt7@\u00057\t,0q\u00050\u0017 ;\u0017Z8V\u007f^";
        objectArray[78] = "\u0016G\u007fQ\u0002Q\u0006\u00005Pc[mOx\n\n\u0003\f\\ R\r2\u0011B=V\nR\u0012V\u007f^c";
        objectArray[79] = "A\u001cXJ:Q\u0017X^\u0019_N\u001d\u001aQ\u00103|MZ\nG_\u0015\u000b\nP\u000e;B\u0001\u001cWw6I@\u001d\u000eN-GL\u00061";
        objectArray[80] = ":Oe\ftSoB:U\u001a\u00053R]Vu\u0018&\u0014$\n}\b\".";
        objectArray[81] = "t85\u001e\n\u000fj-;W2\u0001\tz>\u001dJRp&6\rNh";
        objectArray[82] = "~pSc\u0007\u0001p}\bfm^=b\u0017w\u0011X;\u000fTqQB#d\u0011\u007f\u0013[A";
        objectArray[83] = "'k#\"Z\u0004;|73d\u000e(z%>\b<x6\u007ff_k'k#\"Z\u0004;|73d";
        objectArray[84] = ",#.\u0002\u0013)3q,\u001f\u007fz6+5\u0012!}611n\u0000~=|7\u0005D~0*\\";
        Object[] objectArray2 = objectArray;
        objectArray[85] = "e\u00009U!Md^dT\u001dM9QmRJ\u001d`\u00056>v_5@yRc_6[";
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'Y' || c == '\u00b5' || c == '\u00c8' || c == '\u00d6') {
                field = fz_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'Y' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00b5' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fz_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00de' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'l' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = fz_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public int d(Object[] objectArray) {
        block5: {
            CallSite callSite;
            CallSite callSite2;
            long l;
            block4: {
                int n = (Integer)objectArray[0];
                l = (Long)objectArray[1];
                l = k ^ l;
                callSite2 = fz_0.b("\u00de", (Object)fz_0.b("\u00de", (Object)fz_0.b("Y", (Object)b, (long)1312980016334023340L, (long)l), (long)1313841716997824196L, (long)l), (int)n, (long)1308208019913808746L, (long)l);
                CallSite callSite3 = fz_0.b("l", (long)1313062407702622722L, (long)l);
                try {
                    try {
                        callSite = callSite2;
                        if (callSite3 != null) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw fz_0.b("l", (Object)matchException, (long)1307338385434963812L, (long)l);
                    }
                    callSite = fz_0.b("\u00de", (Object)fz_0.b("\u00de", (Object)((class_2378)fz_0.b("\u00de", (Object)fz_0.b("\u00de", (Object)fz_0.b("\u00de", (Object)fz_0.b("Y", (Object)b, (long)1313468058607173978L, (long)l), (long)1307966484993277801L, (long)l), (Object)fz_0.b("\u00de", (Object)fz_0.b("\u00c8", (long)1313908720323921365L, (long)l), (long)1306213573209643571L, (long)l), (long)1313113897204719805L, (long)l), (long)1306152148992117429L, (long)l)), (Object)fz_0.b("\u00de", (Object)fz_0.b("\u00c8", (long)1313516957438341147L, (long)l), (long)1312834809748505810L, (long)l), (long)1313743419654238821L, (long)l), (long)1306152148992117429L, (long)l);
                }
                catch (MatchException matchException) {
                    throw fz_0.b("l", (Object)matchException, (long)1307338385434963812L, (long)l);
                }
            }
            float f = (float)fz_0.b("l", (Object)((class_6880)callSite), (Object)callSite2, (long)1307891388428674156L, (long)l);
            return (int)f;
        }
        return 0;
    }

    @bP
    public void a(bg_0 bg_02) {
        block17: {
            Object object;
            long l;
            long l2;
            long l3;
            block20: {
                int n;
                CallSite callSite;
                block19: {
                    Object object2;
                    block18: {
                        Object object3;
                        long l4;
                        block16: {
                            long l5 = l3 = k ^ 0x53AA142E7462L;
                            l2 = l5 ^ 0x1765295B447FL;
                            l4 = l5 ^ 0x231BE53DB53AL;
                            l = l5 ^ 0x607431B38195L;
                            callSite = fz_0.b("l", (long)6624479364757257172L, (long)l3);
                            try {
                                try {
                                    object3 = fz_0.b("\u00de", (Object)bg_02, (Object)new Object[0], (long)6625302225466764761L, (long)l3) instanceof class_2663;
                                    if (callSite != null) break block16;
                                    if (object3 == 0) break block17;
                                }
                                catch (MatchException matchException) {
                                    throw fz_0.b("l", (Object)matchException, (long)6625524002643191474L, (long)l3);
                                }
                                object3 = fz_0.b("\u00de", (Object)((class_2663)fz_0.b("\u00de", (Object)bg_02, (Object)new Object[0], (long)6625302225466764761L, (long)l3)), (long)6625908629296964550L, (long)l3);
                            }
                            catch (MatchException matchException) {
                                throw fz_0.b("l", (Object)matchException, (long)6625524002643191474L, (long)l3);
                            }
                        }
                        int n2 = object3;
                        try {
                            try {
                                object2 = n2;
                                if (callSite != null) break block18;
                                if (object2 != 2) break block17;
                            }
                            catch (MatchException matchException) {
                                throw fz_0.b("l", (Object)matchException, (long)6625524002643191474L, (long)l3);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l4;
                            object2 = fz_0.b("\u00de", (Object)this, (Object)objectArray, (long)6624349325622113461L, (long)l3);
                        }
                        catch (MatchException matchException) {
                            throw fz_0.b("l", (Object)matchException, (long)6625524002643191474L, (long)l3);
                        }
                    }
                    n = object2;
                    try {
                        try {
                            object = n;
                            if (callSite != null) break block19;
                            if (object == -1) break block17;
                        }
                        catch (MatchException matchException) {
                            throw fz_0.b("l", (Object)matchException, (long)6625524002643191474L, (long)l3);
                        }
                        reference cfr_temp_0 = fz_0.b("Y", (Object)fz_0.b("Y", (Object)b, (long)6624421156093748090L, (long)l3), (long)6626832997225757243L, (long)l3) - (double)fz_0.b("\u00de", (Object)((Float)((Object)fz_0.b("\u00de", (Object)this.a, (long)6626544516944325227L, (long)l3))), (long)6626859916344433873L, (long)l3);
                        object = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                    }
                    catch (MatchException matchException) {
                        throw fz_0.b("l", (Object)matchException, (long)6625524002643191474L, (long)l3);
                    }
                }
                try {
                    try {
                        if (callSite != null) break block20;
                        if (object <= 0) break block17;
                    }
                    catch (MatchException matchException) {
                        throw fz_0.b("l", (Object)matchException, (long)6625524002643191474L, (long)l3);
                    }
                    fz_0.b("\u00de", (Object)fz_0.b("Y", (Object)b, (long)6624421156093748090L, (long)l3), (long)6624722532505385310L, (long)l3);
                    object = n;
                }
                catch (MatchException matchException) {
                    throw fz_0.b("l", (Object)matchException, (long)6625524002643191474L, (long)l3);
                }
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = l;
            objectArray[0] = object;
            fz_0.b("l", (Object)objectArray, (long)6624863222877413704L, (long)l3);
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l2;
            fz_0.b("\u00de", (Object)this.c, (Object)objectArray2, (long)6625624276784205747L, (long)l3);
            this.i = 1;
        }
    }

    public int a(Object[] objectArray) {
        Object object;
        block17: {
            Object object2;
            int n;
            CallSite callSite;
            ArrayList arrayList;
            long l;
            long l2;
            long l3;
            block16: {
                l3 = (Long)objectArray[0];
                long l4 = l3 = k ^ l3;
                l2 = l4 ^ 0x2CB43077FCECL;
                l = l4 ^ 0x3A2D3B7596FCL;
                long l5 = l4 ^ 0x9C8BA99E864L;
                arrayList = new ArrayList();
                callSite = fz_0.b("l", (long)-4515753467107450514L, (long)l3);
                for (n = 0; n <= (int)fz_0.l; ++n) {
                    try {
                        try {
                            try {
                                Object[] objectArray2 = new Object[2];
                                objectArray2[1] = l5;
                                objectArray2[0] = fz_0.b("\u00de", (Object)fz_0.b("\u00de", (Object)fz_0.b("Y", (Object)b, (long)-4515816067291121216L, (long)l3), (long)-4514988933592625752L, (long)l3), (int)n, (long)-4518362583440472058L, (long)l3);
                                object2 = fz_0.b("l", (Object)objectArray2, (long)-4519285518387050810L, (long)l3);
                                if (callSite != null) break block16;
                                if (callSite != null) continue;
                            }
                            catch (MatchException matchException) {
                                throw fz_0.b("l", (Object)matchException, (long)-4519181640377844728L, (long)l3);
                            }
                            if (object2 == 0) continue;
                        }
                        catch (MatchException matchException) {
                            throw fz_0.b("l", (Object)matchException, (long)-4519181640377844728L, (long)l3);
                        }
                        fz_0.b("\u00de", arrayList, (Object)fz_0.b("l", (int)n, (long)-4515157215571019456L, (long)l3), (long)-4518726072872425378L, (long)l3);
                        continue;
                    }
                    catch (MatchException matchException) {
                        throw fz_0.b("l", (Object)matchException, (long)-4519181640377844728L, (long)l3);
                    }
                }
                n = -1;
                object2 = -1;
            }
            Object object3 = object2;
            CallSite callSite2 = fz_0.b("\u00de", arrayList, (long)-4517960095325468793L, (long)l3);
            while (fz_0.b("\u00de", (Object)callSite2, (long)-4515113067280652895L, (long)l3) != false) {
                block20: {
                    Object object4;
                    CallSite callSite3;
                    CallSite callSite4;
                    block18: {
                        block19: {
                            callSite4 = fz_0.b("\u00de", (Object)((Integer)((Object)fz_0.b("\u00de", (Object)callSite2, (long)-4518986668691930739L, (long)l3))), (long)-4518888050239249635L, (long)l3);
                            try {
                                try {
                                    try {
                                        reference cfr_temp_0 = fz_0.b("Y", (Object)fz_0.b("Y", (Object)b, (long)-4515816067291121216L, (long)l3), (long)-4517938049993482111L, (long)l3) - 7.0;
                                        object = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                        if (callSite != null) break block17;
                                        if (callSite != null) break block18;
                                    }
                                    catch (MatchException matchException) {
                                        throw fz_0.b("l", (Object)matchException, (long)-4519181640377844728L, (long)l3);
                                    }
                                    if (object > 0) break block19;
                                }
                                catch (MatchException matchException) {
                                    throw fz_0.b("l", (Object)matchException, (long)-4519181640377844728L, (long)l3);
                                }
                                Object[] objectArray3 = new Object[2];
                                objectArray3[1] = l2;
                                objectArray3[0] = (int)callSite4;
                                callSite3 = fz_0.b("\u00de", (Object)this, (Object)objectArray3, (long)-4515407493707438477L, (long)l3);
                                break block18;
                            }
                            catch (MatchException matchException) {
                                throw fz_0.b("l", (Object)matchException, (long)-4519181640377844728L, (long)l3);
                            }
                        }
                        Object[] objectArray4 = new Object[2];
                        objectArray4[1] = l;
                        objectArray4[0] = (int)callSite4;
                        callSite3 = fz_0.b("\u00de", (Object)this, (Object)objectArray4, (long)-4518379871545243091L, (long)l3);
                    }
                    void var16_12 = callSite3;
                    try {
                        object4 = var16_12;
                        if (callSite != null || object4 <= n) break block20;
                    }
                    catch (MatchException matchException) {
                        throw fz_0.b("l", (Object)matchException, (long)-4519181640377844728L, (long)l3);
                    }
                    n = var16_12;
                    object3 = callSite4;
                    object4 = object3;
                }
                if (callSite == null) continue;
            }
            object = object3;
        }
        return object;
    }

    @bP
    public void a(bG bG2) {
        block12: {
            fz_0 fz_02;
            block13: {
                CallSite callSite;
                long l;
                long l2;
                block14: {
                    block15: {
                        long l3 = l2 = k ^ 0x5E13F4BF261AL;
                        l = l3 ^ 0x53453B1E34BCL;
                        long l4 = l3 ^ 0x4D88908D2E96L;
                        CallSite callSite2 = fz_0.b("l", (long)691000571147299244L, (long)l2);
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                fz_02 = this;
                                                if (callSite2 != null) break block12;
                                                if (!fz_02.i) break block13;
                                            }
                                            catch (MatchException matchException) {
                                                throw fz_0.b("l", (Object)matchException, (long)687532609299707082L, (long)l2);
                                            }
                                            fz_02 = this;
                                            if (callSite2 != null) break block12;
                                        }
                                        catch (MatchException matchException) {
                                            throw fz_0.b("l", (Object)matchException, (long)687532609299707082L, (long)l2);
                                        }
                                        Object[] objectArray = new Object[2];
                                        objectArray[1] = l4;
                                        objectArray[0] = Float.valueOf(1000.0f);
                                        if (fz_0.b("\u00de", (Object)fz_02.c, (Object)objectArray, (long)691244276070010828L, (long)l2) != false) break block13;
                                    }
                                    catch (MatchException matchException) {
                                        throw fz_0.b("l", (Object)matchException, (long)687532609299707082L, (long)l2);
                                    }
                                    callSite = fz_0.b("Y", (Object)b, (long)691136659434917340L, (long)l2);
                                    if (callSite2 != null) break block14;
                                }
                                catch (MatchException matchException) {
                                    throw fz_0.b("l", (Object)matchException, (long)687532609299707082L, (long)l2);
                                }
                                if (callSite instanceof class_3966) break block15;
                            }
                            catch (MatchException matchException) {
                                throw fz_0.b("l", (Object)matchException, (long)687532609299707082L, (long)l2);
                            }
                            return;
                        }
                        catch (MatchException matchException) {
                            throw fz_0.b("l", (Object)matchException, (long)687532609299707082L, (long)l2);
                        }
                    }
                    callSite = fz_0.b("Y", (Object)b, (long)691136659434917340L, (long)l2);
                }
                Object[] objectArray = new Object[2];
                objectArray[1] = l;
                objectArray[0] = fz_0.b("\u00de", (Object)((class_3966)callSite), (long)687660388780820089L, (long)l2);
                fz_0.b("l", (Object)objectArray, (long)687136627571493821L, (long)l2);
            }
            fz_02 = this;
        }
        fz_02.i = 0;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return fz_0.b("l", (Object)((Object)q_0.Spear), (Object)((Object)q_0.Mace), (long)-2445326000975192021L, (long)l);
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (fz_0.n[n3] != null) {
            return n3;
        }
        Object object = m[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 15;
            case 1 -> 37;
            case 2 -> 8;
            case 3 -> 61;
            case 4 -> 55;
            case 5 -> 23;
            case 6 -> 13;
            case 7 -> 27;
            case 8 -> 48;
            case 9 -> 35;
            case 10 -> 30;
            case 11 -> 31;
            case 12 -> 63;
            case 13 -> 21;
            case 14 -> 22;
            case 15 -> 43;
            case 16 -> 45;
            case 17 -> 34;
            case 18 -> 17;
            case 19 -> 51;
            case 20 -> 16;
            case 21 -> 4;
            case 22 -> 6;
            case 23 -> 62;
            case 24 -> 54;
            case 25 -> 53;
            case 26 -> 14;
            case 27 -> 19;
            case 28 -> 47;
            case 29 -> 41;
            case 30 -> 58;
            case 31 -> 46;
            case 32 -> 2;
            case 33 -> 11;
            case 34 -> 40;
            case 35 -> 1;
            case 36 -> 25;
            case 37 -> 9;
            case 38 -> 32;
            case 39 -> 60;
            case 40 -> 33;
            case 41 -> 50;
            case 42 -> 44;
            case 43 -> 18;
            case 44 -> 7;
            case 45 -> 12;
            case 46 -> 20;
            case 47 -> 52;
            case 48 -> 10;
            case 49 -> 0;
            case 50 -> 3;
            case 51 -> 26;
            case 52 -> 49;
            case 53 -> 36;
            case 54 -> 24;
            case 55 -> 39;
            case 56 -> 56;
            case 57 -> 29;
            case 58 -> 42;
            case 59 -> 5;
            case 60 -> 57;
            case 61 -> 38;
            case 62 -> 28;
            default -> 59;
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
        fz_0.n[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = fz_0.m(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            String string = fz_0.n[n];
            int n2 = string.indexOf(8);
            Class clazz = fz_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fz_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fz_0.g(clazz3, string2, clazz2)) != null) {
                    fz_0.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fz_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fz_0.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fz_0.n(251055002865161L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = fz_0.m(l, l2);
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
                String string2 = fz_0.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = fz_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fz_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fz_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        fz_0.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fz_0.n(251055002865161L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fz_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fz_0.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fz_0.n(251055002865161L, 0L);
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fz_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


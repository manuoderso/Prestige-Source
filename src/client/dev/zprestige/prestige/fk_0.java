/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1799
 *  net.minecraft.class_2596
 *  net.minecraft.class_2708
 *  net.minecraft.class_8042
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bg_0;
import dev.zprestige.prestige.dC;
import dev.zprestige.prestige.dF;
import dev.zprestige.prestige.dM;
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
import java.security.Key;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1799;
import net.minecraft.class_2596;
import net.minecraft.class_2708;
import net.minecraft.class_8042;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.fk
 */
public class fk_0
extends dV
implements dF {
    private dM d;
    private dM a;
    private boolean i;
    private boolean c;
    private static final long k = hc.a(-3928838803812762519L, -1746874950445848108L, MethodHandles.lookup().lookupClass()).a(160614006009914L);
    private static final long l;
    private static final Object[] m;
    private static final String[] n;

    /*
     * Enabled aggressive block sorting
     */
    static {
        m = new Object[76];
        n = new String[76];
        fk_0.f();
        long l = k ^ 0x7D90FDFA5886L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -7040147950281444065L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                fk_0.l = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    @Override
    public void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x7FAB131DDD11L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = this;
        fk_0.b("\u00ff", (Object)fk_0.b("\u00ce", (long)3996366162347661394L, (long)l), (Object)objectArray2, (long)3992464912173448879L, (long)l);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fk" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public boolean b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fk_0.m(l, l2);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                fk_0.m[n] = clazz = Class.forName(fk_0.n[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fk_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fk_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fk_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fk_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = m;
        m[0] = "\u00101koKn\u001b>z ,v\u001f\"|l\tg";
        objectArray[1] = "\u001d#lXK\u000b\u0003+v\u0017,\n\u00120{M\n\f";
        objectArray[2] = "=j\u007f\teP6enF\u0004^=nj\u001c";
        objectArray[3] = "GA%\u0011\u0014,QA K\u0007;F\n#M\u000b/WM4Z@=k";
        objectArray[4] = "\u0015\u001d\b'9\u0007`=\u0003((H\u001d%\u0010/!\u0001u";
        objectArray[5] = "E5iN>#E5~\u00122,_~~\f29X\u000f%Pgx";
        objectArray[6] = Boolean.TYPE;
        fk_0.n[6] = "java/lang/Boolean";
        objectArray[7] = "_,a+\u0012\tI,dq\u0001\u001e^ggw\r\nO p`F\u001b\\";
        objectArray[8] = "h~_C'T\u001d^TL6\u001b|P_G2A\b";
        objectArray[9] = ".jQ1>+.jFm2$4!Fs213P\u0017*jt";
        objectArray[10] = "?c\u0012\u0010\u0001\\)c\u0017J\u0012K>(\u0014L\u001e_/o\u0003[UJ0";
        objectArray[11] = "~\u0014N\u0015e\u0003u\u001b_Z\u0006\u000e`\u0016P13\fq\u0005L\u001d$\u0001";
        objectArray[12] = "k5w7\u0002\u0004k5`k\u000e\u000bq~`u\u000e\u001ev\u000f0(_";
        objectArray[13] = "*\u0000TK;\u0011*\u0000C\u00177\u001e0KC\t7\u000b7:\u0017Q`";
        objectArray[14] = "4<xt\u0006=A\u001cs{\u0017r \u0012xp\u0013(T";
        objectArray[15] = Integer.TYPE;
        fk_0.n[15] = "java/lang/Integer";
        objectArray[16] = "mmEj\u00185{m@0\u000b\"l&C6\u00076}aT!L&f";
        objectArray[17] = ">Qvp8\u0013Kq}\u007f)\\*\u007fvt-\u0006^";
        objectArray[18] = "z.9EF-q!(\n!/d*(A\u001a";
        objectArray[19] = Float.TYPE;
        fk_0.n[19] = "java/lang/Float";
        objectArray[20] = "\u0002KA>3o\tDPq_l\u0007FR>s";
        objectArray[21] = "G#d]xkQ#a\u0007k|Fhb\u0001ghW/u\u0016,xQ";
        objectArray[22] = "\u0000/\u0002yomu\u000f\tv~\"\u0014\u0001\u0002}zx`";
        objectArray[23] = Void.TYPE;
        fk_0.n[23] = "java/lang/Void";
        objectArray[24] = "!Uuq`j7Up+s} \u001es-\u007fi1Yd:4~\u0013";
        objectArray[25] = ">K\u0019YKHKk\u0012VZ\u0007*e\u0019]^]^";
        objectArray[26] = "\u0012/ ,'1\u0012/7p+>\bd7n++\u000f\u0015e0|`";
        objectArray[27] = "I?oAnNI?x\u001dbAStx\u0003bTT\u0005*W3\u0015";
        objectArray[28] = "(H8Z|h(H/\u0006pg2\u0003/\u0018pr5r}C(3";
        objectArray[29] = "^\u0002\u001bOI\u0000+\"\u0010@XOJ,\u001bK\\\u0015>";
        objectArray[30] = "0?xa7\u0001&?};$\u00161t~=(\u0002 3i*c\u0015\u001f";
        objectArray[31] = "\u001ahm_vW\fhh\u0005e@\u001b#k\u0003iT\nd|\u0014\"D\u000b";
        objectArray[32] = "OI\u0018\fS_:i\u0013\u0003B\u0010[g\u0018\bFJ/";
        objectArray[33] = "=en\u0011\u0013yHEe\u001e\u00026)Kn\u0015\u0006l]";
        objectArray[34] = "y\u0018$e\u0014|y\u001839\u0018scS3'\u0018fd\"a}O$";
        objectArray[35] = "\u001d#gBN#\u001d#p\u001eB,\u0007hp\u0000B9\u0000\u0019\"[\u001as";
        objectArray[36] = "(%~ux\n]\u0005uziE<\u000b~qm\u001fH";
        objectArray[37] = "jo{\fc0|o~Vp'k$}P|3zcjG7#bchLmn^xhQm)io";
        objectArray[38] = "|i&uxjji#/k}}\" )gile7>,~\\";
        objectArray[39] = "\u0012\u001bK\u000b\u0007!g;@\u0004\u0016n\u00065K\u000f\u00124r";
        objectArray[40] = "\u0016=IQPcc\u001dB^A,\u0002\u0013IUEvv";
        objectArray[41] = "}56}V\u0016c=,2+\u0006c";
        objectArray[42] = "l+\u0018\\\u0015;d/\n1\u0019,`+\u0003M\u001f*\rhSHI>v<\u0013\n\u001bP";
        objectArray[43] = "\u0016\u0003h\u0013\u00073MC2Edh,@:\u0003\b<\u001cBj\u001a\r\u0002";
        objectArray[44] = "f\u001e\t'\u0012\t(\u0004K%t_7\nS.#\bi]\u000bBE\u000e*]Q'\u000fP6\u001d";
        objectArray[45] = "t\u0013\u0017\u001dEe&L\u001d\u0018~rK\u000b[\u001f\fd3\u0019\u0005\b\u001b\u001e\"\u001eU\u0004\u0004a%\u000f\u0019\u0005~";
        objectArray[46] = "^\u0005\u0018B)_NU\u001a\u0007WI4\u0012\u001a\u0003%XL\u0000D\u00142\"\b\u0005N\u0011%\u001f[\u0002\u001cOW";
        objectArray[47] = "|x\\\u007fUd`0H~3?v}Rw_\r$0\n!38`?RsW6#{U\u0010";
        objectArray[48] = "\u0006\u001a:\u0017\u0018VRZxEvMVX\u0005K\u0006Q?\u001f/L\u0019_\u0002L(\u001eG-";
        objectArray[49] = "\u001f\u00112L;{\u001c\u001c!L\u0003o\u007fWe\u000bq|\u0007E;\u001cf\u0006\u0010C \u0019|jE\u0013)\u0019\u0003";
        objectArray[50] = "*s?7TO;xst*P*pe#}\u0003{%1OKPue\u007f>Z[9&";
        objectArray[51] = "p\u0007n7rtt\u0000.(Mks\u0001:#\u001a5,WbO/~,\f=+!=h\u000b";
        objectArray[52] = "G\u0013\u0002OzJP\u000eV[\u0000Y>\u0015\u0005HrMF\u0007[_e7Q\u0001@Z\u007f[\u0004QIZ\u0000";
        objectArray[53] = "2gfa\bBx9z!nBn$z<\u0002p8a'g^'e&s6WBi6v;n";
        objectArray[54] = "-\u0002P8c5\u007f]Z=X'\u0012Q\u001f>aq*\u001aH$6N\"\\[~gvi\u000bA)X";
        objectArray[55] = ",\u0012\u00054SMfL\u0019t5MpQ\u0019iY\u007f&\u0013E3\t(qG\u0010uPHgL\u001am5";
        objectArray[56] = "}ROb,\u0015`\rZ#]\u001f\u0018\u0011\u001ba/\f`\u0003Ev8vw\u0005^s\"\u001a\"UWs]";
        objectArray[57] = "\u0005\u0001*\r$f\u0019\u0000>[VwkFn\u001d$d\u0013T0\n3\u001e\u0000B\"\u0001=`\f];\u0001V";
        objectArray[58] = "5\u0015\u0006\u0006\u0007 aUDTi=a\\\u00037P5eL\rS\u000f$3W\u007f";
        objectArray[59] = ";%RWP`d4\u0004L\"i{6RSY\u0004;%RWP`d4\u0004L\"8n!TE\u001fkis\n7";
        objectArray[60] = "d\u000f9#CQ`\by<|Ng\tm7+\u001c7\\8k|B}Zi8\u0018L>\u001en";
        objectArray[61] = ">7y5PM:g(4:\u0015op)=V'><r`\u0006pcv;7W\u001bkr)Z";
        objectArray[62] = "G*/UV\fP7{A,\u001c>,(R^\u000bF>vEIqQ8m@S\u001d\u0004hd@,";
        objectArray[63] = "\u001550\u0018Ln\u0019*)\u0018'q\u00186\u001c\u0010Cm\u0013J+\u0017\u0017v\u00045,\u0006[w~";
        objectArray[64] = "<\fVu~@vRJ5\u0018@`OJ(tr6\r\u0016r%%aYC4}EwRI,\u0018";
        objectArray[65] = "j\u000bj$\u00019g\u0004- g<`\r3(\u000e0Y\u000338\nV;\u0006=*\u0015kh\u0001otg";
        objectArray[66] = "X=\n}\u00114D<\u001e+c%6zNm\u00116Nh\u0010z\u0006LYn\u000b\u007f\u001c \f>\u0002\u007fc";
        objectArray[67] = "k\u0002ddOtj\u000bcf!m\u0012\u0012zd[po\u0005g0O";
        objectArray[68] = "\u0018\bE\u0018T\u001d[PF\u001d/\u0012%M\n\u0018]\u0001]_T\u000fJ{\u001bJO\fN\u000b\u001a\fF\f/";
        objectArray[69] = "}s:\u0005_qar.S-m\u00134~\u0015_sk& \u0002H\t/#*\u0007_4|$xY-";
        objectArray[70] = "\u0019\u0018\u001fg\u0017:\u0015\b\u001aj.:\u0012\u001a\u0016mB\bBZM:.6\u0011V\u0010pQ1\u0000\u001a\u0011\nI&\u0011\t\u00104Un\u0005\bv";
        objectArray[71] = "%mrU\u0012{o3n\u0015t{y.n\b\u0018I.n>UD\u001e(>d\u0000\u0006#{96^t";
        objectArray[72] = "1D\u000er$[1J\u0007vOVUC\u0000'/M1\u001c\u0011q4?";
        objectArray[73] = "F\u0012<>7g\f\u00179\"EnSr>5,iO\u0016a$zr=\tg` {SCbe<\t";
        objectArray[74] = "F\u007f!M\u001d6\f!=\r{6\u001a<=\u0010\u0017\u0004L~aJDS\u001b*4\f\u001e3\r!>\u0014{<\u0018;2\b\u0017iH22w";
        Object[] objectArray2 = objectArray;
        objectArray[75] = "Mh$O;<\u001f7.J\u0000.rphMr=\nb6ZeGNg<_rz\u001d`n\u0001\u0000";
    }

    @Override
    public void d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x52D6E774439DL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = this;
        fk_0.b("\u00ff", (Object)fk_0.b("\u00ce", (long)3248971487776178737L, (long)l), (Object)objectArray2, (long)3245395339157126020L, (long)l);
        this.i = 0;
        this.c = 0;
    }

    private int d(Object[] objectArray) {
        Object object;
        block5: {
            long l = (Long)objectArray[0];
            long l2 = (l = k ^ l) ^ 0x112538955F2EL;
            CallSite callSite = fk_0.b("\u00e1", (long)-3187809471142078752L, (long)l);
            for (int i = 0; i <= (int)fk_0.l; ++i) {
                int n;
                block6: {
                    try {
                        try {
                            Object[] objectArray2 = new Object[2];
                            objectArray2[1] = l2;
                            objectArray2[0] = fk_0.b("\u00ff", (Object)fk_0.b("\u00ff", (Object)fk_0.b("\u00da", (Object)b, (long)-3187574042105657951L, (long)l), (long)-3187084422637104112L, (long)l), (int)i, (long)-3181256851583321000L, (long)l);
                            object = fk_0.b("\u00e1", (Object)objectArray2, (long)-3181068151711510839L, (long)l);
                            if (callSite != null) break block5;
                            if (callSite != null) break block6;
                        }
                        catch (MatchException matchException) {
                            throw fk_0.b("\u00e1", (Object)matchException, (long)-3186921970332622192L, (long)l);
                        }
                        if (object == 0) continue;
                    }
                    catch (MatchException matchException) {
                        throw fk_0.b("\u00e1", (Object)matchException, (long)-3186921970332622192L, (long)l);
                    }
                    n = i;
                }
                return n;
            }
            object = -1;
        }
        return object;
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00da' || c == '\u00ba' || c == '\u00ce' || c == 'o') {
                field = fk_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00da' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ba' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ce' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fk_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ff' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = fk_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public dC a(Object[] objectArray) {
        block40: {
            int n;
            Object object;
            CallSite callSite;
            long l;
            long l2;
            long l3;
            long l4;
            long l5;
            block39: {
                long l6;
                block31: {
                    block32: {
                        block38: {
                            block37: {
                                CallSite callSite2;
                                block33: {
                                    long l7;
                                    block34: {
                                        CallSite callSite3;
                                        block35: {
                                            CallSite callSite4;
                                            block36: {
                                                l5 = (Long)objectArray[0];
                                                long l8 = l5;
                                                l4 = l8 ^ 0x27251590B815L;
                                                l3 = l8 ^ 0x3588DEF3E3DFL;
                                                long l9 = l8 ^ 0x750660A45EAFL;
                                                l6 = l8 ^ 0x1DEB2E73AEB9L;
                                                l2 = l8 ^ 0x6D88BA4E35CEL;
                                                l = l8 ^ 0x5D885352C89BL;
                                                l7 = l8 ^ 0x741122B52DE7L;
                                                callSite = fk_0.b("\u00e1", (long)-1174399795927029103L, (long)l5);
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    object = this.i;
                                                                    if (callSite != null) break block31;
                                                                    if (object != 0) break block32;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw fk_0.b("\u00e1", (Object)matchException, (long)-1174077288486625567L, (long)l5);
                                                                }
                                                                callSite2 = fk_0.b("\u00ff", (Object)((Boolean)((Object)fk_0.b("\u00ff", (Object)this.d, (long)-1176758801000824331L, (long)l5))), (long)-1177376592592902980L, (long)l5);
                                                                if (callSite != null) break block33;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw fk_0.b("\u00e1", (Object)matchException, (long)-1174077288486625567L, (long)l5);
                                                            }
                                                            if (callSite2 == false) break block34;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw fk_0.b("\u00e1", (Object)matchException, (long)-1174077288486625567L, (long)l5);
                                                        }
                                                        Object[] objectArray2 = new Object[2];
                                                        objectArray2[1] = l7;
                                                        objectArray2[0] = fk_0.b("\u00ce", (long)-1173856806958675285L, (long)l5);
                                                        callSite2 = fk_0.b("\u00e1", (Object)objectArray2, (long)-1177658745050691183L, (long)l5);
                                                        if (callSite != null) break block33;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw fk_0.b("\u00e1", (Object)matchException, (long)-1174077288486625567L, (long)l5);
                                                    }
                                                    if (callSite2 != false) break block34;
                                                }
                                                catch (MatchException matchException) {
                                                    throw fk_0.b("\u00e1", (Object)matchException, (long)-1174077288486625567L, (long)l5);
                                                }
                                                Object[] objectArray3 = new Object[2];
                                                objectArray3[1] = l9;
                                                objectArray3[0] = fk_0.b("\u00ce", (long)-1173856806958675285L, (long)l5);
                                                callSite4 = fk_0.b("\u00ff", (Object)fk_0.b("\u00e1", (Object)objectArray3, (long)-1173403178425427555L, (long)l5), (long)-1173567565644315910L, (long)l5);
                                                try {
                                                    try {
                                                        callSite3 = callSite4;
                                                        if (callSite != null) break block35;
                                                        if (callSite3 != -1) break block36;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw fk_0.b("\u00e1", (Object)matchException, (long)-1174077288486625567L, (long)l5);
                                                    }
                                                    Object[] objectArray4 = new Object[1];
                                                    objectArray4[0] = l4;
                                                    fk_0.b("\u00ff", (Object)this, (Object)objectArray4, (long)-1173997501024848244L, (long)l5);
                                                    return null;
                                                }
                                                catch (MatchException matchException) {
                                                    throw fk_0.b("\u00e1", (Object)matchException, (long)-1174077288486625567L, (long)l5);
                                                }
                                            }
                                            callSite3 = callSite4;
                                        }
                                        Object[] objectArray5 = new Object[2];
                                        objectArray5[1] = l2;
                                        objectArray5[0] = (int)callSite3;
                                        fk_0.b("\u00e1", (Object)objectArray5, (long)-1177130845304596875L, (long)l5);
                                        return null;
                                    }
                                    Object[] objectArray6 = new Object[2];
                                    objectArray6[1] = l7;
                                    objectArray6[0] = fk_0.b("\u00ce", (long)-1173856806958675285L, (long)l5);
                                    callSite2 = fk_0.b("\u00e1", (Object)objectArray6, (long)-1177658745050691183L, (long)l5);
                                }
                                try {
                                    try {
                                        if (callSite != null) break block37;
                                        if (callSite2 == false) break block38;
                                    }
                                    catch (MatchException matchException) {
                                        throw fk_0.b("\u00e1", (Object)matchException, (long)-1174077288486625567L, (long)l5);
                                    }
                                    Object[] objectArray7 = new Object[2];
                                    objectArray7[1] = l;
                                    objectArray7[0] = fk_0.b("\u00ce", (long)-1173794331752823851L, (long)l5);
                                    callSite2 = fk_0.b("\u00e1", (Object)objectArray7, (long)-1174601753920841725L, (long)l5);
                                }
                                catch (MatchException matchException) {
                                    throw fk_0.b("\u00e1", (Object)matchException, (long)-1174077288486625567L, (long)l5);
                                }
                            }
                            this.i = 1;
                        }
                        return null;
                    }
                    object = this.c;
                }
                try {
                    try {
                        if (callSite != null) break block39;
                        if (object == 0) break block40;
                    }
                    catch (MatchException matchException) {
                        throw fk_0.b("\u00e1", (Object)matchException, (long)-1174077288486625567L, (long)l5);
                    }
                    Object[] objectArray8 = new Object[1];
                    objectArray8[0] = l6;
                    object = fk_0.b("\u00ff", (Object)this, (Object)objectArray8, (long)-1174821725622071004L, (long)l5);
                }
                catch (MatchException matchException) {
                    throw fk_0.b("\u00e1", (Object)matchException, (long)-1174077288486625567L, (long)l5);
                }
            }
            if ((n = object) != -1) {
                fk_0 fk_02;
                block41: {
                    CallSite callSite5;
                    CallSite callSite6;
                    block43: {
                        block42: {
                            callSite6 = fk_0.b("\u00ff", (Object)fk_0.b("\u00da", (Object)b, (long)-1174762223134803504L, (long)l5), (long)-1177331879458294804L, (long)l5);
                            try {
                                try {
                                    try {
                                        try {
                                            fk_0.b("\u00ff", (Object)fk_0.b("\u00da", (Object)b, (long)-1174762223134803504L, (long)l5), (float)90.0f, (long)-1176569839286931886L, (long)l5);
                                            Object[] objectArray9 = new Object[2];
                                            objectArray9[1] = l2;
                                            objectArray9[0] = n;
                                            fk_0.b("\u00e1", (Object)objectArray9, (long)-1177130845304596875L, (long)l5);
                                            Object[] objectArray10 = new Object[2];
                                            objectArray10[1] = l;
                                            objectArray10[0] = fk_0.b("\u00ce", (long)-1173794331752823851L, (long)l5);
                                            fk_0.b("\u00e1", (Object)objectArray10, (long)-1174601753920841725L, (long)l5);
                                            fk_02 = this;
                                            if (callSite != null) break block41;
                                            if (fk_0.b("\u00ff", (Object)((Boolean)((Object)fk_0.b("\u00ff", (Object)fk_02.a, (long)-1176758801000824331L, (long)l5))), (long)-1177376592592902980L, (long)l5) == false) break block42;
                                        }
                                        catch (MatchException matchException) {
                                            throw fk_0.b("\u00e1", (Object)matchException, (long)-1174077288486625567L, (long)l5);
                                        }
                                        callSite5 = fk_0.b("\u00da", (Object)b, (long)-1174762223134803504L, (long)l5);
                                        if (callSite != null) break block43;
                                    }
                                    catch (MatchException matchException) {
                                        throw fk_0.b("\u00e1", (Object)matchException, (long)-1174077288486625567L, (long)l5);
                                    }
                                    if (fk_0.b("\u00ff", (Object)callSite5, (long)-1177502739292974943L, (long)l5) == false) break block42;
                                }
                                catch (MatchException matchException) {
                                    throw fk_0.b("\u00e1", (Object)matchException, (long)-1174077288486625567L, (long)l5);
                                }
                                Object[] objectArray11 = new Object[1];
                                objectArray11[0] = l3;
                                fk_0.b("\u00e1", (Object)objectArray11, (long)-1173337830945579596L, (long)l5);
                            }
                            catch (MatchException matchException) {
                                throw fk_0.b("\u00e1", (Object)matchException, (long)-1174077288486625567L, (long)l5);
                            }
                        }
                        callSite5 = fk_0.b("\u00da", (Object)b, (long)-1174762223134803504L, (long)l5);
                    }
                    fk_0.b("\u00ff", (Object)callSite5, (float)callSite6, (long)-1176569839286931886L, (long)l5);
                    fk_02 = this;
                }
                Object[] objectArray12 = new Object[1];
                objectArray12[0] = l4;
                fk_0.b("\u00ff", (Object)fk_02, (Object)objectArray12, (long)-1173997501024848244L, (long)l5);
                return new dC((float)fk_0.b("\u00ff", (Object)fk_0.b("\u00da", (Object)b, (long)-1174762223134803504L, (long)l5), (long)-1174149721733819422L, (long)l5), 90.0f);
            }
            Object[] objectArray13 = new Object[1];
            objectArray13[0] = l4;
            fk_0.b("\u00ff", (Object)this, (Object)objectArray13, (long)-1173997501024848244L, (long)l5);
        }
        return null;
    }

    public static boolean a(Object[] objectArray) {
        class_1799 class_17992 = (class_1799)objectArray[0];
        long l = (Long)objectArray[1];
        l = k ^ l;
        return (boolean)fk_0.b("\u00ff", (Object)fk_0.b("\u00ff", (Object)class_17992, (long)2172339061876208604L, (long)l), (Object)fk_0.b("\u00ce", (long)2171136714175269490L, (long)l), (long)2170926450624969603L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    @bP
    public void a(bg_0 var1_1) {
        block19: {
            block18: {
                block16: {
                    block17: {
                        var2_2 = fk_0.k ^ 124548963961434L;
                        var4_3 = fk_0.b("\u00e1", (long)-7451061497846882886L, (long)var2_2);
                        try {
                            try {
                                v0 = fk_0.b("\u00ff", (Object)var1_1, (Object)new Object[0], (long)-7457017063898305632L, (long)var2_2);
                                if (var4_3 != null) break block16;
                                if (!(v0 instanceof class_2708)) break block17;
                            }
                            catch (MatchException v1) {
                                throw fk_0.b("\u00e1", (Object)v1, (long)-7448984032342971958L, (long)var2_2);
                            }
                            this.c = 1;
                        }
                        catch (MatchException v2) {
                            throw fk_0.b("\u00e1", (Object)v2, (long)-7448984032342971958L, (long)var2_2);
                        }
                    }
                    v0 = fk_0.b("\u00ff", (Object)var1_1, (Object)new Object[0], (long)-7457017063898305632L, (long)var2_2);
                }
                var6_4 = v0;
                try {
                    try {
                        v3 = var6_4;
                        if (var4_3 != null) break block18;
                        if (!(v3 instanceof class_8042)) break block19;
                    }
                    catch (MatchException v4) {
                        throw fk_0.b("\u00e1", (Object)v4, (long)-7448984032342971958L, (long)var2_2);
                    }
                    v3 = var6_4;
                }
                catch (MatchException v5) {
                    throw fk_0.b("\u00e1", (Object)v5, (long)-7448984032342971958L, (long)var2_2);
                }
            }
            var5_5 = (class_8042)v3;
            var6_4 = fk_0.b("\u00ff", (Object)fk_0.b("\u00ff", (Object)var5_5, (long)-7449756479174542823L, (long)var2_2), (long)-7450928413022429466L, (long)var2_2);
            while (fk_0.b("\u00ff", (Object)var6_4, (long)-7449398233785234981L, (long)var2_2) != false) {
                block20: {
                    var7_6 = (class_2596)fk_0.b("\u00ff", (Object)var6_4, (long)-7449853766841766839L, (long)var2_2);
                    try {
                        try {
                            if (var4_3 != null) break block20;
                            if (var7_6 instanceof class_2708) {
                            }
                            ** GOTO lbl51
                        }
                        catch (MatchException v6) {
                            throw fk_0.b("\u00e1", (Object)v6, (long)-7448984032342971958L, (long)var2_2);
                        }
                        this.c = 1;
                    }
                    catch (MatchException v7) {
                        throw fk_0.b("\u00e1", (Object)v7, (long)-7448984032342971958L, (long)var2_2);
                    }
                }
                try {
                    if (var4_3 == null) break;
lbl51:
                    // 2 sources

                    if (var4_3 == null) continue;
                    break;
                }
                catch (MatchException v8) {
                    throw fk_0.b("\u00e1", (Object)v8, (long)-7448984032342971958L, (long)var2_2);
                }
            }
        }
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return fk_0.b("\u00e1", (Object)((Object)q_0.Mace), (long)-2444772069020748913L, (long)l);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (fk_0.n[n3] != null) {
            return n3;
        }
        Object object = m[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 10;
            case 1 -> 58;
            case 2 -> 40;
            case 3 -> 46;
            case 4 -> 12;
            case 5 -> 36;
            case 6 -> 45;
            case 7 -> 21;
            case 8 -> 35;
            case 9 -> 63;
            case 10 -> 48;
            case 11 -> 52;
            case 12 -> 11;
            case 13 -> 23;
            case 14 -> 15;
            case 15 -> 27;
            case 16 -> 1;
            case 17 -> 47;
            case 18 -> 26;
            case 19 -> 62;
            case 20 -> 39;
            case 21 -> 22;
            case 22 -> 19;
            case 23 -> 4;
            case 24 -> 34;
            case 25 -> 24;
            case 26 -> 49;
            case 27 -> 41;
            case 28 -> 14;
            case 29 -> 20;
            case 30 -> 13;
            case 31 -> 7;
            case 32 -> 28;
            case 33 -> 6;
            case 34 -> 9;
            case 35 -> 44;
            case 36 -> 25;
            case 37 -> 54;
            case 38 -> 18;
            case 39 -> 0;
            case 40 -> 29;
            case 41 -> 55;
            case 42 -> 17;
            case 43 -> 61;
            case 44 -> 8;
            case 45 -> 16;
            case 46 -> 57;
            case 47 -> 51;
            case 48 -> 42;
            case 49 -> 38;
            case 50 -> 31;
            case 51 -> 50;
            case 52 -> 5;
            case 53 -> 53;
            case 54 -> 59;
            case 55 -> 60;
            case 56 -> 3;
            case 57 -> 2;
            case 58 -> 43;
            case 59 -> 33;
            case 60 -> 32;
            case 61 -> 56;
            case 62 -> 37;
            default -> 30;
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
        fk_0.n[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = fk_0.m(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            String string = fk_0.n[n];
            int n2 = string.indexOf(8);
            Class clazz = fk_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fk_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fk_0.g(clazz3, string2, clazz2)) != null) {
                    fk_0.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fk_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fk_0.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fk_0.n(144699404923864L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = fk_0.m(l, l2);
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
                String string2 = fk_0.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = fk_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fk_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fk_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        fk_0.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fk_0.n(144699404923864L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fk_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fk_0.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fk_0.n(144699404923864L, 0L);
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
            return MethodHandles.lookup().findStatic(fk_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


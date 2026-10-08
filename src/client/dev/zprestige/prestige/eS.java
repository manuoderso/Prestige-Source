/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1747
 *  net.minecraft.class_1799
 *  net.minecraft.class_239
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 *  net.minecraft.class_3965
 *  net.minecraft.class_3966
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.a9;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bd_0;
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
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1747;
import net.minecraft.class_1799;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_3966;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class eS
extends dV {
    private dM d;
    private dM a;
    private long c;
    private static final long k = hc.a(3390247857694229197L, 6310233026888882535L, MethodHandles.lookup().lookupClass()).a(181722090094039L);
    private static final long l;
    private static final Object[] m;
    private static final String[] n;

    public eS() {
        long l = k ^ 0x2499D02AFF35L;
        this.c = eS.l;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        m = new Object[104];
        n = new String[104];
        eS.f();
        long l = k ^ 0x1657660E86DDL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 6719649102202209577L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                eS.l = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
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
            throw new RuntimeException("dev/zprestige/prestige/eS" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = eS.m(l, l2);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                eS.m[n] = clazz = Class.forName(eS.n[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = eS.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = eS.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = eS.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = eS.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = m;
        m[0] = "\u0013\re7@u\u0005\r`mSb\u0012Fck_v\u0003\u0001t|\u0014d?";
        objectArray[1] = "Z\u0006C\u0018iR/&H\u0017x\u001dR>[\u0010qT:";
        objectArray[2] = "\u0010ac\u001f4X\u0010atC8W\n*t]8B\r[&\u0003o\t";
        objectArray[3] = "z@\u00166dYz@\u0001jhV`\u000b\u0001thCgzQ)9";
        objectArray[4] = "\t@<:TH\t@+fXG\u0013\u000b+xXR\u0014z\u007f \u000f";
        objectArray[5] = "J\f2B(n\\\f7\u0018;yKG4\u001e7mZ\u0000#\t|{}";
        objectArray[6] = "J>cN^vA1r\u0001={T<}j\byE/aF\u001ft";
        objectArray[7] = "_sZ\u000bju*SQ\u0004{:K]Z\u000f\u007f`?";
        objectArray[8] = Boolean.TYPE;
        eS.n[8] = "java/lang/Boolean";
        objectArray[9] = "\u0006<8cv\u007f\r3),\u001a|\u00031+c6";
        objectArray[10] = "cgU-3TcgBq?[y,Bo?N~]\u00104g\u0004";
        objectArray[11] = "b.)\u0011u|t.,Kfkce/Mj\u007fr\"8Z!hM";
        objectArray[12] = "\u0018u\tT\u0000~\u0013z\u0018\u001bap\u0018q\u001cA";
        objectArray[13] = "5TWud\u00115T@)h\u001e/\u001f@7h\u000b(n\u0012l0J";
        objectArray[14] = "Y\t\u0014a/:Y\t\u0003=#5CB\u0003## D3Qwra";
        objectArray[15] = "]\r\u0001F\u0017YC\u0005\u001b\tjIC";
        objectArray[16] = "F!n%\u0007$F!yy\u000b+\\jyg\u000b>[\u001b(?Y";
        objectArray[17] = Double.TYPE;
        eS.n[17] = "java/lang/Double";
        objectArray[18] = "Z1Hh\u0012TL1M2\u0001C[zN4\rWJ=Y#F@z";
        objectArray[19] = "z\u000b ,\u0001F\u000f++#\u0010\tn% (\u0014S\u001a";
        objectArray[20] = ";!O:\"8-!J`1/:jIf=;+-^qv,\u001c";
        objectArray[21] = "\u0015\u001d\u0004\u001b\u0003\u0015\u0015\u001d\u0013G\u000f\u001a\u000fV\u0013Y\u000f\u000f\b'F\u0006V";
        objectArray[22] = "Z\u001fs\u001cC\u000eZ\u001fd@O\u0001@Td^O\u0014G%4\u000b\u001b^";
        objectArray[23] = "p:\u0013H=mp:\u0004\u00141bjq\u0004\n1wm\u0000T_f1";
        objectArray[24] = "\u000e\u000b\u0016\u0011~\u001f\u000e\u000b\u0001Mr\u0010\u0014@\u0001Sr\u0005\u00131Q\u0006&OD\r\u000e^`\u0005?\\V\r";
        objectArray[25] = Float.TYPE;
        eS.n[25] = "java/lang/Float";
        objectArray[26] = "HG1?b\u0010=g:0s_\\i1;w\u0005(";
        objectArray[27] = "Hb\u0016g7hHb\u0001;;gR)\u0001%;rUXQpo8\u0002d\u000e()ry4[\u007fj";
        objectArray[28] = ",,}s\u0011H:,x)\u0002_-g{/\u000eK< l8E[$ n3\u001f\u0016\u0018;n.\u001fQ/,";
        objectArray[29] = "\u0016~\u0017\ffQc^\u001c\u0003w\u001e\u0002P\u0017\bsDv";
        objectArray[30] = "\n#0:n\u001e\u001c#5`}\t\u000bh6fq\u001d\u001a/!q:\r\u0001";
        objectArray[31] = "\u001dpZK'\u0018hPQD6W\t^ZO2\r}";
        objectArray[32] = "\rRvJ\"%xr}E3j\u0019|vN70m";
        objectArray[33] = "v\u0005K$uyv\u0005\\xyvlN\\fyck?\r9!";
        objectArray[34] = "\u001e390q{k\u00132?`4\n\u001d94dn~";
        objectArray[35] = "\u0003oa|#u\u0003ov /z\u0019$v>/o\u001eU&bz";
        objectArray[36] = "gtM$)ggtZx%h}?Zf%}zN\u000b9}*j}Xy7Q;%\t";
        objectArray[37] = "\u0007\rwvJ8\u0007\r`*F7\u001dF`4F\"\u001a70i\u0012";
        objectArray[38] = "\u001f\u0015'ww\u001f\u001f\u00150+{\u0010\u0005^05{\u0005\u0002/gj-";
        objectArray[39] = "v\u001d>`\u000b`\u0003=5o\u001a/b3>d\u001eu\u0016";
        objectArray[40] = Long.TYPE;
        eS.n[40] = "java/lang/Long";
        objectArray[41] = "@IfM4l5imB%#TgfI!y ";
        objectArray[42] = "l\n6W>q\u0019*=X/>x$6S+d\f";
        objectArray[43] = "qQq\u001b?tqQfG3{k\u001afY3nlk6\fd+";
        objectArray[44] = "x\u000fMb1\nx\u000fZ>=\u0005bDZ =\u0010e5\b~eT";
        objectArray[45] = "\u001fj\u00187=u\tj\u001dm.b\u001e!\u001ek\"v\u000ff\t|ic-";
        objectArray[46] = "YR{f\u001fvYRl:\u0013yC\u0019l$\u0013lDh=}D.";
        objectArray[47] = "\"\u000f2'0k)\u0000#hMs:\u0007*!";
        objectArray[48] = "w\u001b\bR(dw\u001b\u001f\u000e$kmP\u001f\u0010$~j!MOu4";
        objectArray[49] = "Q\u001eO\f-\u0005$>D\u0003<JE0O\b8\u00101";
        objectArray[50] = "wTJ|.0aTO&='v\u001fL 13gX[7z!z";
        objectArray[51] = "\\u'X\u000eY)U,W\u001f\u0016H['\\\u001bL<";
        objectArray[52] = "\u0003N=\u0001\u0002Xvn6\u000e\u0013\u0017\u0017`=\u0005\u0017Mc";
        objectArray[53] = Void.TYPE;
        eS.n[53] = "java/lang/Void";
        objectArray[54] = "\u001ez+*mEK|qn\\\u001fu )\u007f;\u0015\u001ci}s$\u0012uunr.\u001b\u0012'q-lu";
        objectArray[55] = "\u0014EME\u0002GWFNPxFOEJW/\u0011\u0011\u0012\u0012;BWUUD\n\u0017O_E";
        objectArray[56] = "s)m/e\nx#ik\u000f\nH`i<h\u0006!)=0w\u0001Hd,\"m\u00199(-lif";
        objectArray[57] = "T?z\f)CR~fMXK^?wT4y\n\u007f,\u000fX\u0013N1uL)_O\u007fq3";
        objectArray[58] = "\u000e\u000e<qa\u000f\u0002B4\u0018n3U\u0007:\u007fgZ\u001cS6``3U\u0006k'aN\u0012N2|63";
        objectArray[59] = "\u001a\u0013w>#$\u0011\u0019szI!!_ &5)Z\u0006/\u007f+H\u001d\b,=(3D\u0007u#I";
        objectArray[60] = "<H9hmW?J`jQ\u0002^I3(2\u0002&E:\".";
        objectArray[61] = "w\u007fIG_zo;@\\`*wnTT7})>\r\t`%jzO\u0007^=.sT";
        objectArray[62] = "b@(h\u0002+!C+}x*9@/z/}g\u0010v\u0016\u0001& Dq'\n$(I";
        objectArray[63] = "\u0017%0(\u0004\\\u0016y%vz\u0006\u0010;+*\u00164D\u007fr|z\t\u001f<.3E\bC)pM\u0010\u0001\u0006\"5r\u0011]\u0013|K";
        objectArray[64] = ")I\u0005xeH|Q\u000fh\u000f\u001c~J\u001ebc.-\u000fG8\u000fDnD\u001cz~\bo\n\u0018\u0005";
        objectArray[65] = "3\u000f\u000b+DQ0\rR)x\nQ\u0002Vo\u001d\u0001*\tV!\u0006";
        objectArray[66] = "S_]z\u0005\u0011\u0010\\^o\u007f\u001b\u0004N^c\u0013)P\u000f\u00005\u007fC\u0014@\\{\u000e\u000f\u0015\u000eX\u0004";
        objectArray[67] = "f\u0016C~m\f3\u000eIn\u0007X1\u0015XdkjaW\u0003:\u0007]#\u000bE?e\r'S[\u0003gB>\u0014\u0004a7Ff\n8ieF9\u0017\u0007h9Sgi";
        objectArray[68] = "aBaX8QkL0OT\u0004cPkG867\u00134\u0010oavB`Y;\u000frE2CT";
        objectArray[69] = ",]JWq++M\u0017B\f+<H\u0015]`\u0019h\u000bJ\n6N/\rH_s0)\t\n\u000b\f";
        objectArray[70] = "\u0018\u0001$2%R\u0013\u000b vOW#H !(^J\u0001t-7Y#Hg+)PE\u001fs/$>";
        objectArray[71] = "A\u001d\bheI\u0013\u0002W*\u000bD-[QvlND\u0012\u0005zsI-\u0002\u0016xv\u0012OR\u0012 h.";
        objectArray[72] = "\u0007t0>1{@&a)O/\u001f 8\"\u0018xOu`N(=\u0013r-#.|\u000f3";
        objectArray[73] = "*~rH!f&wxTNwT.qG)~=g%K6yT*4Y,a%f5\u0017(\u001e";
        objectArray[74] = "z8\u001aRy-x>\u001b\u0012@.#&EB)\"\u001a(ER-Dy<SM?55=\u001dI@";
        objectArray[75] = "i\u000f'S%{2\u0012+X\u001d/\rY#Uz%d\u0010wYe\"\r]fK\u007f:|\u0011g\u0005{E";
        objectArray[76] = "`36l\u000eo1ichw|P<p%\u0017%*s<k\u001c\u0015";
        objectArray[77] = "\u0005G7=cb^Z;6[6a\u00113;<<\bXg7#;aHt5&`\u0003\u0018pm8\\";
        objectArray[78] = "F%G[\u0002QGyR\u0005|\u000bA;\\Y\u00109\u0015\u007f\u0006\u0007|\u0004\\ B^\u0015\u0013\\~\u0006>\u0016\fW\"B\u0001\u0017PB|<";
        objectArray[79] = "`:t-A:5\"~=+n79o7G\\a~2o\u0012\u000b0't5U41{ak+";
        objectArray[80] = "<\u000f\u0001';\u000e0C\tN72#\u0006\u0012\"#]3W\u0002N";
        objectArray[81] = "\"Nq\fl8aMr\u0019\u00169yNv\u001eAn'\u001d/rp7j[(\u000bz1y@";
        objectArray[82] = "\u0010F\u0015&b\rSE\u00163\u0018\fKF\u00124O[\u0014\u001bIXu\u0010NL\u0015f%\u001fTO";
        objectArray[83] = "m`R~<K8xXnV\u001f:cId:-j/\u00133V\u001a(}T?4J,%J\u0003<\u0018,zW<=D9$)";
        objectArray[84] = "5]\fW;\u000fu\u0000KR]\u0018'BlP'\u0016,Q7S/\u000e*]MM4\b'>";
        objectArray[85] = "6gtfU2xsor'2+co\u007fK\u0000{#0''(%$t~_hxcq\u0018";
        objectArray[86] = "H}x\u007fTh\u0019x3b.a\u001a=(xBSHpp..5\u001c\"0b\u001f=\u00149\"\u001f";
        objectArray[87] = ";;ml3bn!+`Oek-6=\u0018;5plQ~`i8/`vhr*";
        objectArray[88] = "*k\u001b\u0010\bf}\u007f\u001f\u001dfnry\u0019\u001a1=#,Mv_\u007fur\u0013\u0010\bkq\u007f";
        objectArray[89] = "N\t\u0014 \u007f\u0004\u001b\u0011\u001e0\u0015P\u0019\n\u000f:ybJNSb\u0015\nHF\u000f'y[M\r\u0012]";
        objectArray[90] = "`V\u001c|g\u0016#U\u001fi\u001d\u0017;V\u001bnJ@d\nG\u0002d@6K\u00018#\u0012g\\";
        objectArray[91] = ">\tm\u001e&\u000ek\u000f7Z\u0017RUSoKp^<\u001a;GoYUW*UuA$\u001b+\u001bq>";
        objectArray[92] = "^I<:Z/UC8~0*e\u00008)W#\fIl%H$eVn/H/U\\`~_C";
        objectArray[93] = "\\2ZHat\f=@K\u0002/\\<^Hn\u001d\b\u007f\u0001\u00138J_*FI|p]\u007fYK\u0002%_*FC2/Q{Q/";
        objectArray[94] = "uAo\u0002)%\"Uk\u000fG--Sm\b\u0010~|\u00071d~<*Xg\u0002)(.U";
        objectArray[95] = "H?x!wjC5|e\u001dosv|2zf\u001a?(>easr9,\u007fy\u0002>8b{\u0006";
        objectArray[96] = "EV\u0007)=mGY\u0017}\u0002\u007fD\u000b\r/U(\u001eZYCb!K\fV?`.[X";
        objectArray[97] = "=QOiM\u000b9V\u001ds\"\u000b$R@|u\\~\u0004\u001e\u0010Z\u000b.FK~^\f|\\";
        objectArray[98] = "=gjV\u0015&>e3T){_sj\u0017\u0010-o&lMT";
        objectArray[99] = "P#\nu\u001d&\u0002<U7s(<eSk\u0014!U,\u0007g\u000b&<<\u0014e\u000e}^l\u0010=\u0010A";
        objectArray[100] = "c\u0010\u000bK\u0004\t6\b\u0001[n]4\u0013\u0010Q\u0002ogWO\u0007n\u0007e_\u0010L\u0002V`\u0014\r6";
        objectArray[101] = "hX\u0005Sl,cXKH\u0006>\u001a_\u0002Za7s\u0016VV~0\u001a[GDd(k\u0017F\n`W";
        objectArray[102] = "\u0016\n]]}\u0005DJA\r\u001f]\u00123\u0000HmZLIO\u0004#Q|Y\tYvXC\u000bIE&:";
        Object[] objectArray2 = objectArray;
        objectArray[103] = "v\u001f\u000e9\n\u0001&\u0010\u0014:iZv\u0011\n9\u0005h$PP`Q?`\u0004\u0014,\u0013TxU\u000edi";
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ce' || c == 'Y' || c == '\u00c8' || c == 'O') {
                field = eS.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ce' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'Y' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = eS.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ff' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'M' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = eS.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean d(Object[] objectArray) {
        Object object;
        block17: {
            CallSite callSite;
            long l;
            block15: {
                class_1309 class_13092;
                long l2;
                block16: {
                    int n;
                    class_239 class_2392 = (class_239)objectArray[0];
                    l = (Long)objectArray[1];
                    long l3 = l = k ^ l;
                    long l4 = l3 ^ 0x164DE087845DL;
                    l2 = l3 ^ 0x31A5F8E091E8L;
                    callSite = eS.b("M", (long)-1890656389818398359L, (long)l);
                    try {
                        n = class_2392 instanceof class_3966;
                        if (callSite != null) return n != 0;
                        if (n == 0) return 0 != 0;
                    }
                    catch (MatchException matchException) {
                        throw eS.b("M", (Object)matchException, (long)-1884197999647761750L, (long)l);
                    }
                    class_3966 class_39662 = (class_3966)class_2392;
                    CallSite callSite2 = eS.b("\u00ff", (Object)class_39662, (long)-1889728368667859297L, (long)l);
                    try {
                        n = callSite2 instanceof class_1309;
                        if (callSite != null) return n != 0;
                        if (n == 0) return 0 != 0;
                    }
                    catch (MatchException matchException) {
                        throw eS.b("M", (Object)matchException, (long)-1884197999647761750L, (long)l);
                    }
                    class_13092 = (class_1309)callSite2;
                    try {
                        if (callSite != null) {
                            return 0 != 0;
                        }
                    }
                    catch (MatchException matchException) {
                        throw eS.b("M", (Object)matchException, (long)-1884197999647761750L, (long)l);
                    }
                    try {
                        try {
                            Object[] objectArray2 = new Object[2];
                            objectArray2[1] = l4;
                            objectArray2[0] = eS.b("\u00ff", (Object)eS.b("\u00ff", (Object)class_13092, (long)-1890870450572800682L, (long)l), (long)-1890946419346188456L, (long)l);
                            object = eS.b("\u00ff", (Object)eS.b("\u00c8", (long)-1884702898002353588L, (long)l), (Object)objectArray2, (long)-1890016466470213886L, (long)l);
                            if (callSite != null) break block15;
                            if (object == false) break block16;
                            return false;
                        }
                        catch (MatchException matchException) {
                            throw eS.b("M", (Object)matchException, (long)-1884197999647761750L, (long)l);
                        }
                    }
                    catch (MatchException matchException) {
                        throw eS.b("M", (Object)matchException, (long)-1884197999647761750L, (long)l);
                    }
                }
                Object[] objectArray3 = new Object[2];
                objectArray3[1] = l2;
                objectArray3[0] = class_13092;
                object = eS.b("\u00ff", (Object)eS.b("\u00c8", (long)-1889423163741919441L, (long)l), (Object)objectArray3, (long)-1887454730405596125L, (long)l);
            }
            try {
                try {
                    if (callSite != null) return (boolean)object;
                    if (object != false) break block17;
                    return false;
                }
                catch (MatchException matchException) {
                    throw eS.b("M", (Object)matchException, (long)-1884197999647761750L, (long)l);
                }
            }
            catch (MatchException matchException) {
                throw eS.b("M", (Object)matchException, (long)-1884197999647761750L, (long)l);
            }
        }
        object = 1;
        return (boolean)object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @bP
    public void a(a9 a92) {
        CallSite callSite;
        long l;
        block32: {
            Object object;
            CallSite callSite2;
            long l2;
            block30: {
                block31: {
                    eS eS2;
                    block28: {
                        block29: {
                            class_310 class_3102;
                            long l3;
                            long l4;
                            block26: {
                                block27: {
                                    block25: {
                                        long l5 = l = k ^ 0x5CFABBEAA3ACL;
                                        l2 = l5 ^ 0x7A010FC85B2FL;
                                        l4 = l5 ^ 0x5C2EC395467BL;
                                        l3 = l5 ^ 0x76E52703E49DL;
                                        callSite2 = eS.b("M", (long)-2597599307734943911L, (long)l);
                                        try {
                                            try {
                                                class_3102 = b;
                                                if (callSite2 != null) break block25;
                                                if (eS.b("\u00ce", (Object)class_3102, (long)-2600083242597474337L, (long)l) == null) return;
                                            }
                                            catch (MatchException matchException) {
                                                throw eS.b("M", (Object)matchException, (long)-2600396882536864614L, (long)l);
                                            }
                                            class_3102 = b;
                                        }
                                        catch (MatchException matchException) {
                                            throw eS.b("M", (Object)matchException, (long)-2600396882536864614L, (long)l);
                                        }
                                    }
                                    try {
                                        try {
                                            if (callSite2 != null) break block26;
                                            if (eS.b("\u00ce", (Object)class_3102, (long)-2597500628967173235L, (long)l) != null) break block27;
                                            return;
                                        }
                                        catch (MatchException matchException) {
                                            throw eS.b("M", (Object)matchException, (long)-2600396882536864614L, (long)l);
                                        }
                                    }
                                    catch (MatchException matchException) {
                                        throw eS.b("M", (Object)matchException, (long)-2600396882536864614L, (long)l);
                                    }
                                }
                                class_3102 = b;
                            }
                            try {
                                Object[] objectArray = new Object[2];
                                objectArray[1] = l4;
                                objectArray[0] = eS.b("\u00ce", (Object)class_3102, (long)-2597724683877349361L, (long)l);
                                if (eS.b("M", (Object)objectArray, (long)-2600450060425083065L, (long)l) == false) {
                                    return;
                                }
                            }
                            catch (MatchException matchException) {
                                throw eS.b("M", (Object)matchException, (long)-2600396882536864614L, (long)l);
                            }
                            try {
                                try {
                                    eS2 = this;
                                    if (callSite2 != null) break block28;
                                    Object[] objectArray = new Object[1];
                                    objectArray[0] = l3;
                                    if (eS.b("\u00ff", (Object)eS2, (Object)objectArray, (long)-2596670076049493338L, (long)l) != null) break block29;
                                    return;
                                }
                                catch (MatchException matchException) {
                                    throw eS.b("M", (Object)matchException, (long)-2600396882536864614L, (long)l);
                                }
                            }
                            catch (MatchException matchException) {
                                throw eS.b("M", (Object)matchException, (long)-2600396882536864614L, (long)l);
                            }
                        }
                        eS2 = this;
                    }
                    try {
                        try {
                            long l6 = eS2.c - eS.b("\u00ff", (Object)eS.b("\u00ce", (Object)b, (long)-2597500628967173235L, (long)l), (long)-2594461254063132840L, (long)l);
                            object = l6 == 0L ? 0 : (l6 < 0L ? -1 : 1);
                            if (callSite2 != null) break block30;
                            if (object != false) break block31;
                        }
                        catch (MatchException matchException) {
                            throw eS.b("M", (Object)matchException, (long)-2600396882536864614L, (long)l);
                        }
                        eS.b("\u00ff", (Object)a92, (Object)new Object[0], (long)-2600335406981508955L, (long)l);
                        return;
                    }
                    catch (MatchException matchException) {
                        throw eS.b("M", (Object)matchException, (long)-2600396882536864614L, (long)l);
                    }
                }
                object = eS.b("\u00ff", (Object)eS.b("\u00ce", (Object)eS.b("\u00ce", (Object)b, (long)-2598048670355029771L, (long)l), (long)-2597059632404234968L, (long)l), (long)-2600493175480245343L, (long)l);
            }
            if (object == false) {
                return;
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l2;
            CallSite callSite3 = eS.b("\u00ff", (Object)this, (Object)objectArray, (long)-2598437394479157913L, (long)l);
            try {
                callSite = callSite3;
                if (callSite2 != null) break block32;
                if (callSite == null) return;
            }
            catch (MatchException matchException) {
                throw eS.b("M", (Object)matchException, (long)-2600396882536864614L, (long)l);
            }
            callSite = callSite3;
        }
        try {
            if (eS.b("\u00ff", (Object)callSite, (long)-2596801859696992270L, (long)l) != eS.b("\u00c8", (long)-2594315802040651957L, (long)l)) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw eS.b("M", (Object)matchException, (long)-2600396882536864614L, (long)l);
        }
        eS.b("\u00ff", (Object)a92, (Object)new Object[0], (long)-2600335406981508955L, (long)l);
    }

    private boolean a(Object[] objectArray) {
        int n;
        block6: {
            long l;
            class_1799 class_17992;
            block4: {
                block5: {
                    class_17992 = (class_1799)objectArray[0];
                    l = (Long)objectArray[1];
                    l = k ^ l;
                    try {
                        try {
                            if (eS.b("\u00ff", (Object)((Boolean)((Object)eS.b("\u00ff", (Object)this.d, (long)-4646279877848041413L, (long)l))), (long)-4646434236775591351L, (long)l) == false) break block4;
                            if (eS.b("\u00ff", (Object)class_17992, (long)-4646708771811040844L, (long)l) != eS.b("\u00c8", (long)-4646650730016685019L, (long)l)) break block5;
                        }
                        catch (MatchException matchException) {
                            throw eS.b("M", (Object)matchException, (long)-4640711601974411029L, (long)l);
                        }
                        n = 1;
                        break block6;
                    }
                    catch (MatchException matchException) {
                        throw eS.b("M", (Object)matchException, (long)-4640711601974411029L, (long)l);
                    }
                }
                n = 0;
                break block6;
            }
            n = eS.b("\u00ff", (Object)class_17992, (long)-4646708771811040844L, (long)l) instanceof class_1747;
        }
        return n != 0;
    }

    private class_1268 a(Object[] objectArray) {
        block14: {
            CallSite callSite;
            long l;
            block13: {
                CallSite callSite2;
                long l2;
                block11: {
                    block12: {
                        l = (Long)objectArray[0];
                        l2 = (l = k ^ l) ^ 0x1F57811080ECL;
                        callSite2 = eS.b("M", (long)5126539812183731087L, (long)l);
                        try {
                            try {
                                Object[] objectArray2 = new Object[2];
                                objectArray2[1] = l2;
                                objectArray2[0] = eS.b("\u00ff", (Object)eS.b("\u00ce", (Object)b, (long)5133259064829772553L, (long)l), (long)5127166543143475946L, (long)l);
                                callSite = eS.b("\u00ff", (Object)this, (Object)objectArray2, (long)5127051663159350957L, (long)l);
                                if (callSite2 != null) break block11;
                                if (callSite == false) break block12;
                            }
                            catch (MatchException matchException) {
                                throw eS.b("M", (Object)matchException, (long)5134052091914418252L, (long)l);
                            }
                            return eS.b("\u00c8", (long)5127105070206942781L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw eS.b("M", (Object)matchException, (long)5134052091914418252L, (long)l);
                        }
                    }
                    callSite = eS.b("\u00ff", (Object)((Boolean)((Object)eS.b("\u00ff", (Object)this.a, (long)5125704813336756380L, (long)l))), (long)5126148481259924206L, (long)l);
                }
                try {
                    try {
                        if (callSite2 != null) break block13;
                        if (callSite == false) break block14;
                    }
                    catch (MatchException matchException) {
                        throw eS.b("M", (Object)matchException, (long)5134052091914418252L, (long)l);
                    }
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = l2;
                    objectArray3[0] = eS.b("\u00ff", (Object)eS.b("\u00ce", (Object)b, (long)5133259064829772553L, (long)l), (long)5127363222630925028L, (long)l);
                    callSite = eS.b("\u00ff", (Object)this, (Object)objectArray3, (long)5127051663159350957L, (long)l);
                }
                catch (MatchException matchException) {
                    throw eS.b("M", (Object)matchException, (long)5134052091914418252L, (long)l);
                }
            }
            try {
                if (callSite != false) {
                    return eS.b("\u00c8", (long)5126935021328949498L, (long)l);
                }
            }
            catch (MatchException matchException) {
                throw eS.b("M", (Object)matchException, (long)5134052091914418252L, (long)l);
            }
        }
        return null;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @bP
    public void a(bd_0 bd_02) {
        CallSite callSite;
        CallSite callSite2;
        long l;
        long l2;
        block43: {
            CallSite callSite3;
            block44: {
                CallSite callSite4;
                block42: {
                    CallSite callSite5;
                    long l3;
                    long l4;
                    long l5;
                    block40: {
                        block41: {
                            block38: {
                                block39: {
                                    block37: {
                                        class_310 class_3102;
                                        block36: {
                                            block34: {
                                                block35: {
                                                    block33: {
                                                        long l6 = l2 = k ^ 0x135DAFF53BC1L;
                                                        l5 = l6 ^ 0x35A61BD7C342L;
                                                        l = l6 ^ 0x1A5ECBB0163AL;
                                                        l4 = l6 ^ 0x1389D78ADE16L;
                                                        l3 = l6 ^ 0x3942331C7CF0L;
                                                        callSite4 = eS.b("M", (long)4872391865501478708L, (long)l2);
                                                        try {
                                                            try {
                                                                class_3102 = b;
                                                                if (callSite4 != null) break block33;
                                                                if (eS.b("\u00ce", (Object)class_3102, (long)4866114890401023922L, (long)l2) == null) return;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw eS.b("M", (Object)matchException, (long)4865232811403312375L, (long)l2);
                                                            }
                                                            class_3102 = b;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw eS.b("M", (Object)matchException, (long)4865232811403312375L, (long)l2);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            if (callSite4 != null) break block34;
                                                            if (eS.b("\u00ce", (Object)class_3102, (long)4872504847046364128L, (long)l2) != null) break block35;
                                                            return;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw eS.b("M", (Object)matchException, (long)4865232811403312375L, (long)l2);
                                                        }
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw eS.b("M", (Object)matchException, (long)4865232811403312375L, (long)l2);
                                                    }
                                                }
                                                class_3102 = b;
                                            }
                                            try {
                                                try {
                                                    if (callSite4 != null) break block36;
                                                    if (eS.b("\u00ce", (Object)class_3102, (long)4865497504603591808L, (long)l2) != null) return;
                                                }
                                                catch (MatchException matchException) {
                                                    throw eS.b("M", (Object)matchException, (long)4865232811403312375L, (long)l2);
                                                }
                                                class_3102 = b;
                                            }
                                            catch (MatchException matchException) {
                                                throw eS.b("M", (Object)matchException, (long)4865232811403312375L, (long)l2);
                                            }
                                        }
                                        try {
                                            try {
                                                callSite5 = eS.b("\u00ff", (Object)class_3102, (long)4871372153213370888L, (long)l2);
                                                if (callSite4 != null) break block37;
                                                if (callSite5 == false) return;
                                            }
                                            catch (MatchException matchException) {
                                                throw eS.b("M", (Object)matchException, (long)4865232811403312375L, (long)l2);
                                            }
                                            callSite5 = eS.b("\u00ff", (Object)eS.b("\u00ce", (Object)b, (long)4866114890401023922L, (long)l2), (long)4871261758783085996L, (long)l2);
                                        }
                                        catch (MatchException matchException) {
                                            throw eS.b("M", (Object)matchException, (long)4865232811403312375L, (long)l2);
                                        }
                                    }
                                    try {
                                        if (callSite4 != null) break block38;
                                        if (callSite5 == false) break block39;
                                        return;
                                    }
                                    catch (MatchException matchException) {
                                        throw eS.b("M", (Object)matchException, (long)4865232811403312375L, (long)l2);
                                    }
                                }
                                callSite5 = eS.b("\u00ff", (Object)eS.b("\u00c8", (long)4869115842512067116L, (long)l2), (Object)new Object[0], (long)4872028473739339241L, (long)l2);
                            }
                            try {
                                if (callSite4 != null) break block40;
                                if (callSite5 == false) break block41;
                                return;
                            }
                            catch (MatchException matchException) {
                                throw eS.b("M", (Object)matchException, (long)4865232811403312375L, (long)l2);
                            }
                        }
                        callSite5 = eS.b("\u00ff", (Object)eS.b("\u00ce", (Object)eS.b("\u00ce", (Object)b, (long)4871962242415827096L, (long)l2), (long)4870690968465466693L, (long)l2), (long)4865152702569757644L, (long)l2);
                    }
                    if (callSite5 == false) {
                        return;
                    }
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l3;
                    callSite2 = eS.b("\u00ff", (Object)this, (Object)objectArray, (long)4871639110549334731L, (long)l2);
                    try {
                        if (callSite2 == null) {
                            return;
                        }
                    }
                    catch (MatchException matchException) {
                        throw eS.b("M", (Object)matchException, (long)4865232811403312375L, (long)l2);
                    }
                    try {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l4;
                        objectArray2[0] = eS.b("\u00ce", (Object)b, (long)4872411624891584610L, (long)l2);
                        if (eS.b("M", (Object)objectArray2, (long)4865039704017854250L, (long)l2) == false) {
                            return;
                        }
                    }
                    catch (MatchException matchException) {
                        throw eS.b("M", (Object)matchException, (long)4865232811403312375L, (long)l2);
                    }
                    Object[] objectArray3 = new Object[1];
                    objectArray3[0] = l5;
                    callSite3 = eS.b("\u00ff", (Object)this, (Object)objectArray3, (long)4872104608310621450L, (long)l2);
                    try {
                        callSite = callSite3;
                        if (callSite4 != null) break block42;
                        if (callSite == null) return;
                    }
                    catch (MatchException matchException) {
                        throw eS.b("M", (Object)matchException, (long)4865232811403312375L, (long)l2);
                    }
                    callSite = callSite3;
                }
                try {
                    try {
                        if (callSite4 != null) break block43;
                        if (eS.b("\u00ff", (Object)callSite, (long)4871489417022293919L, (long)l2) == eS.b("\u00c8", (long)4869073044388230950L, (long)l2)) break block44;
                        return;
                    }
                    catch (MatchException matchException) {
                        throw eS.b("M", (Object)matchException, (long)4865232811403312375L, (long)l2);
                    }
                }
                catch (MatchException matchException) {
                    throw eS.b("M", (Object)matchException, (long)4865232811403312375L, (long)l2);
                }
            }
            callSite = callSite3;
        }
        Object[] objectArray = new Object[3];
        objectArray[2] = l;
        objectArray[1] = callSite2;
        objectArray[0] = callSite;
        eS.b("M", (Object)objectArray, (long)4870886695460889998L, (long)l2);
        this.c = (long)eS.b("\u00ff", (Object)eS.b("\u00ce", (Object)b, (long)4872504847046364128L, (long)l2), (long)4869464987800893237L, (long)l2);
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return eS.b("M", (Object)((Object)q_0.Crystal), (long)-2442712988477565518L, (long)l);
    }

    private class_3965 a(Object[] objectArray) {
        CallSite callSite;
        long l = (Long)objectArray[0];
        long l2 = (l = k ^ l) ^ 0x37E718FA0E05L;
        CallSite callSite2 = eS.b("\u00ff", (Object)eS.b("\u00ce", (Object)b, (long)-536224089053840197L, (long)l), (long)-535665933628811976L, (long)l);
        CallSite callSite3 = eS.b("\u00ff", (Object)eS.b("\u00c8", (long)-532680735089286875L, (long)l), (Object)new Object[0], (long)-536339016786015348L, (long)l);
        try {
            callSite = callSite3 != null ? eS.b("\u00ff", (Object)eS.b("\u00ce", (Object)b, (long)-536224089053840197L, (long)l), (float)eS.b("\u00ff", (Object)callSite3, (Object)new Object[0], (long)-535119074172066084L, (long)l), (float)eS.b("\u00ff", (Object)callSite3, (Object)new Object[0], (long)-532557407787864710L, (long)l), (long)-534834813613122323L, (long)l) : eS.b("\u00ff", (Object)eS.b("\u00ce", (Object)b, (long)-536224089053840197L, (long)l), (float)1.0f, (long)-533682569635676255L, (long)l);
        }
        catch (MatchException matchException) {
            throw eS.b("M", (Object)matchException, (long)-536528924354328578L, (long)l);
        }
        CallSite callSite4 = callSite;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        CallSite callSite5 = eS.b("\u00ff", (Object)callSite2, (Object)eS.b("\u00ff", (Object)callSite4, (double)((double)eS.b("M", (Object)objectArray2, (long)-535853734829981812L, (long)l)), (long)-535770584123803407L, (long)l), (long)-536777366364509800L, (long)l);
        return eS.b("\u00ff", (Object)eS.b("\u00ce", (Object)b, (long)-533808593674768151L, (long)l), (Object)new class_3959((class_243)callSite2, (class_243)callSite5, (class_3959.class_3960)eS.b("\u00c8", (long)-536936534288286872L, (long)l), (class_3959.class_242)eS.b("\u00c8", (long)-532825561110845873L, (long)l), (class_1297)eS.b("\u00ce", (Object)b, (long)-536224089053840197L, (long)l)), (long)-534713469869559480L, (long)l);
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (eS.n[n3] != null) {
            return n3;
        }
        Object object = m[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 16;
            case 1 -> 40;
            case 2 -> 4;
            case 3 -> 53;
            case 4 -> 41;
            case 5 -> 6;
            case 6 -> 46;
            case 7 -> 17;
            case 8 -> 51;
            case 9 -> 37;
            case 10 -> 50;
            case 11 -> 10;
            case 12 -> 54;
            case 13 -> 28;
            case 14 -> 1;
            case 15 -> 44;
            case 16 -> 32;
            case 17 -> 34;
            case 18 -> 47;
            case 19 -> 31;
            case 20 -> 63;
            case 21 -> 2;
            case 22 -> 42;
            case 23 -> 23;
            case 24 -> 43;
            case 25 -> 59;
            case 26 -> 21;
            case 27 -> 58;
            case 28 -> 30;
            case 29 -> 9;
            case 30 -> 60;
            case 31 -> 49;
            case 32 -> 36;
            case 33 -> 62;
            case 34 -> 22;
            case 35 -> 13;
            case 36 -> 33;
            case 37 -> 19;
            case 38 -> 15;
            case 39 -> 35;
            case 40 -> 0;
            case 41 -> 29;
            case 42 -> 12;
            case 43 -> 18;
            case 44 -> 7;
            case 45 -> 11;
            case 46 -> 3;
            case 47 -> 52;
            case 48 -> 38;
            case 49 -> 57;
            case 50 -> 56;
            case 51 -> 20;
            case 52 -> 45;
            case 53 -> 24;
            case 54 -> 14;
            case 55 -> 48;
            case 56 -> 55;
            case 57 -> 39;
            case 58 -> 25;
            case 59 -> 8;
            case 60 -> 26;
            case 61 -> 27;
            case 62 -> 61;
            default -> 5;
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
        eS.n[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = eS.m(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            String string = eS.n[n];
            int n2 = string.indexOf(8);
            Class clazz = eS.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = eS.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = eS.g(clazz3, string2, clazz2)) != null) {
                    eS.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = eS.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        eS.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = eS.n(897072122289180L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = eS.m(l, l2);
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
                String string2 = eS.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = eS.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = eS.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = eS.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        eS.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = eS.n(897072122289180L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = eS.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        eS.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = eS.n(897072122289180L, 0L);
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
            return MethodHandles.lookup().findStatic(eS.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_243
 *  net.minecraft.class_2848
 *  net.minecraft.class_304
 *  net.minecraft.class_310
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.N;
import dev.zprestige.prestige.aT;
import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bd_0;
import dev.zprestige.prestige.bh_0;
import dev.zprestige.prestige.bt_0;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.y_0;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraft.class_243;
import net.minecraft.class_2848;
import net.minecraft.class_304;
import net.minecraft.class_310;

public class eQ
extends dV {
    private dO a;
    private dM d;
    private class_243 c;
    private class_243 e;
    private class_243 f;
    private float g;
    private float h;
    private class_243 i;
    private static final long k = hc.a(3227582064392380020L, -6147190275096695988L, MethodHandles.lookup().lookupClass()).a(178399370803653L);
    private static final Object[] l = new Object[111];
    private static final String[] m = new String[111];

    public eQ() {
        long l = k ^ 0x5D1D898546E4L;
        this.c = eQ.b("\u00a2", (long)2260317422865836273L, (long)l);
        this.e = eQ.b("\u00a2", (long)2260317422865836273L, (long)l);
        this.f = eQ.b("\u00a2", (long)2260317422865836273L, (long)l);
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = eQ.b("\u00a2", (long)2260317422865836273L, (long)l);
    }

    static {
        eQ.f();
    }

    @Override
    public void e(Object[] objectArray) {
        block4: {
            long l;
            block5: {
                l = (Long)objectArray[0];
                CallSite callSite = eQ.b("\u00db", (long)3994948262827977275L, (long)l);
                try {
                    try {
                        if (callSite != null) break block4;
                        if (eQ.b("\u00c2", (Object)b, (long)3993338307055734817L, (long)l) == null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw eQ.b("\u00db", (Object)matchException, (long)3992651480415401180L, (long)l);
                    }
                    eQ.b("\u00a5", (Object)eQ.b("\u00c2", (Object)b, (long)3993338307055734817L, (long)l), (Object)this.i, (long)3993514122551120872L, (long)l);
                }
                catch (MatchException matchException) {
                    throw eQ.b("\u00db", (Object)matchException, (long)3992651480415401180L, (long)l);
                }
            }
            this.i = eQ.b("\u00a2", (long)3994998910363517150L, (long)l);
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/eQ" + " : " + string + " : " + methodType.toString(), exception);
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
            int n = eQ.m(l, l2);
            object = eQ.l[n];
            try {
                if (!(object instanceof String)) break block2;
                eQ.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = eQ.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = eQ.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = eQ.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = eQ.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = l;
        l[0] = "l'yW\u0019\u000bz'|\r\n\u001cml\u007f\u000b\u0006\b|+h\u001cM\u001a@";
        objectArray[1] = "9d=y\u007f\u001fLD6vnP1\\%qg\u0019Y";
        objectArray[2] = "\u0007(\u0010Z3E\u0011(\u0015\u0000 R\u0006c\u0016\u0006,F\u0017$\u0001\u0011gP2";
        objectArray[3] = "\n8e\t\u007fv\u00017tF\u001c{\u0014:{-)y\u0005)g\u0001>t";
        objectArray[4] = "rL2\"BgrL%~Nhh\u0007%`N}ovt4\u001b6";
        objectArray[5] = "\u0013z|)S;\u0013zku_4\t1kk_!\u000e@:?\njY|dfM!\"-03\u0007";
        objectArray[6] = "{,pm\u001bO\u000e\f{b\n\u0000o\u0002pi\u000eZ\u001b";
        objectArray[7] = Void.TYPE;
        eQ.m[7] = "java/lang/Void";
        objectArray[8] = "\u0010\u0007T\t3P\u0006\u0007QS G\u0011LRU,S\u0000\u000bEBgB\u001c";
        objectArray[9] = "\u001dO&W\b9ho-X\u0019v\ta&S\u001d,}";
        objectArray[10] = "qw\n\u001aw_qw\u001dF{Pk<\u001dX{ElML\u0001#\u0000";
        objectArray[11] = "4v^\u0005eg4vIYih.=IGi})L\u0019\u001a8";
        objectArray[12] = "5j\u0018,\u000215j\u000fp\u000e>/!\u000fn\u000e+(P[6Y";
        objectArray[13] = "\tm#n<=\tm4202\u0013&4,0'\u0014Wetb";
        objectArray[14] = "l<dQ\u000bPz<a\u000b\u0018Gmwb\r\u0014S|0u\u001a_AM";
        objectArray[15] = "wGm\u007f'k\u0002gfp6$cim{2~\u0017";
        objectArray[16] = "E\u001b-0\u000eeX\u000eu\u0012Oh@\b";
        objectArray[17] = "\u0013\u0011l\u007f4t\u0005\u0011i%'c\u0012Zj#+w\u0003\u001d}4``6";
        objectArray[18] = "K^[8>`>~P7//_p[<+u+";
        objectArray[19] = Double.TYPE;
        eQ.m[19] = "java/lang/Double";
        objectArray[20] = "]nM\u0017g1(NF\u0018v~I@M\u0013r$=";
        objectArray[21] = "6-MqmU=\"\\>\u0001V3 ^q-";
        objectArray[22] = Boolean.TYPE;
        eQ.m[22] = "java/lang/Boolean";
        objectArray[23] = Float.TYPE;
        eQ.m[23] = "java/lang/Float";
        objectArray[24] = "}\u0016\u0018#\u0015i\b6\u0013,\u0004&i8\u0018'\u0000|\u001d";
        objectArray[25] = "&)R/A\u00180)WuR\u000f'bTs^\u001b6%Cd\u0015\f\t";
        objectArray[26] = "~~f{L&uqw4-(~zsn";
        objectArray[27] = "j3x\u0018\\T|3}BOCkx~DCWz?iS\bG6";
        objectArray[28] = "?{\u001f\u0015imJ[\u0014\u001ax\"+U\u001f\u0011|x_";
        objectArray[29] = "h4e\u001d\u000fB~4`G\u001cUi\u007fcA\u0010Ax8tV[SX";
        objectArray[30] = "B;P{=C7\u001b[t,\fV\u0015P\u007f(V\"";
        objectArray[31] = "_8}9T\t_8jeX\u0006Esj{X\u0013B\u0002:\"\nR";
        objectArray[32] = "\\l\u0000Jz!)L\u000bEknHB\u0000No4<";
        objectArray[33] = "_\u001b?m#{*;4b24K5?i6n?";
        objectArray[34] = "\u001fho\u0013|.\thjIo9\u001e#iOc-\u000fd~X(:9";
        objectArray[35] = "?>>L\u0010\u001bJ\u001e5C\u0001T+\u0010>H\u0005\u000e_";
        objectArray[36] = "+k>q@\u001e+k)-L\u00111 )3L\u00046Qyn\u0018";
        objectArray[37] = "\u0010\u00110\u0001[8\u0010\u0011']W7\nZ'CW\"\r+w\u001f\u0002";
        objectArray[38] = "\u0001@\u0004^iC\u0001@\u0013\u0002eL\u001b\u000b\u0013\u001ceY\u001czA@0\u001b";
        objectArray[39] = Long.TYPE;
        eQ.m[39] = "java/lang/Long";
        objectArray[40] = "$F-M\u0003=$F:\u0011\u000f2>\r:\u000f\u000f'9|mPY";
        objectArray[41] = "~j\b\u0019oshj\rC|d\u007f!\u000eEppnf\u0019R;M";
        objectArray[42] = "\u0005r+I=CpR F,\f\u0011\\+M(Ve";
        objectArray[43] = "j\u0000 {Gaj\u00007'KnpK79K{w:gc\u001d= \u000684Y{[Vdc";
        objectArray[44] = "\u0012&MoOy\u00173FoDb\u001b#\u0004\u0006oH*";
        objectArray[45] = Integer.TYPE;
        eQ.m[45] = "java/lang/Integer";
        objectArray[46] = "B\u0004xYf4I\u000bi\u0016\u000e4G\u0004z";
        objectArray[47] = "@EyY\u001f7VE|\u0003\f A\u000e\u007f\u0005\u00004PIh\u0012K%@";
        objectArray[48] = "\u0017?\u000b~\u0011Sb\u001f\u0000q\u0000\u001c\u0003\u0011\u000bz\u0004Fw";
        objectArray[49] = "z/\u0007\u001a\u007f\u001d\u000f\u000f\f\u0015nRn\u0001\u0007\u001ej\b\u001a";
        objectArray[50] = ";}zof&N]q`wi/Szks3[";
        objectArray[51] = "\u0016m?q>/\u0000m:+-8\u0017&9-!,\u0006a.:j&";
        objectArray[52] = "dx\u0016FMps|\u0012^&!}.\tMqv,xW!_ps|\u0011\u001c\u001fvyz";
        objectArray[53] = "&\u0013<Ku^{_bJ\u001bK{Q9Hwy,\u0017g\u001f .oR=O'TfTf\u0012\u001b";
        objectArray[54] = ":8\u0019:\t\u0017s`\u0011{{D\u0003b\no\u001c\u0010ee\u0016k\u001d-9\"\u0014lFK>>\u0010m{";
        objectArray[55] = "\r\u000fTS$nUVQ^Ii[HUY%[\u000f\u000e\u000e\u0000t\f\rH^Fxv\tIECI";
        objectArray[56] = "f_\b\"QU;\u0013V#?K7\f\t*h\u001ci[QF\u000fE8Y\u0015;CB/P";
        objectArray[57] = "O!_\u0006HQF'\u0004[tN[\"[\u0001\u0018|\nb\n^tQ\u0007;\u0007\u0006D[Y?Zf";
        objectArray[58] = "K{\u0004I7:WxjLVu@j\u0016\u001a6c]{P%jz\u001dq\u0005Dk~Y}j";
        objectArray[59] = "rUx.z;>Ro'\u0002#/Ivqn\u0011{\u0005)'3FsX(hh\"/Lfi\u0002z<\u000fsyc{8K\u007f\u0016";
        objectArray[60] = "!K26\f>6O6.go8\u001d-=08iLxQ\u001e>6O5l^8<I";
        objectArray[61] = "[\u001eY<vq\u0006R\u0007=\u0018o\nMX4O8T\u001d\u0001Xbq\u0000GL?u}\u0017E";
        objectArray[62] = "{\r+\u0001|\u0016'\u0019e\u0000\u0016\u0017'\u001cu\u0018z%sX,N\u0016C'^k\u0015r\u001f3\u0010j\u007f'\u001ft\u001e\u007f\u001b{\u000b:\u001f\u0015";
        objectArray[63] = "^\u0014\u0001h\\5\u0012\u0013\u0016a$-\u0003\b\u000f7H\u001fWKQ`\u001eH\u0001\u0017\u0004`I*\u0007E^3$";
        objectArray[64] = "Q\u0012e\u000b\u001d(F\u0016a\u0013vyHDz\u0000!.\u0018\u0011%l\u000f(F\u0016bQO.L\u0010";
        objectArray[65] = "t\u000e\u0013rEN(\u001a]s/O(\u001fMkC}|[\u00174/\u001b(]SfKG<\u0013R\f\u001eG{\u001dGhBS5\u001c-";
        objectArray[66] = "3l\t\u0013\u000b\u000foxG\u0012a\u0005clS\u00016R9<\u000em\r\u000090\u000f\u0006\u001e\u0011cx";
        objectArray[67] = "\u001b]\u000b(\u0019xAC[*dmxUV&\u00188\u0018CK7^\u0007DZ\u000b=\u000bfE^O1d";
        objectArray[68] = "\u0014]\u000b\u0019y>HIE\u0018\u0013?HLU\u0000\u007f\r\u001c\b\u000e^\u00136N\u000b\u0004_x%_QLg\u007f1\u001e\u0001\r\fl DI5\u000bxa\u0014\b^\u0018i;\\0\u0004\n-$OTX\u001ec%%";
        objectArray[69] = "3Ye6y@%J(>@[UZsq<\r5Ln`z2:H\u007f?-P<\u001a%l@";
        objectArray[70] = "g0nVl3+7y_\u0014+:,`\tx\u0019jn>V\u0014 2\"n\u001f/%'3;n(0m5o\u000f)4)9\u0000";
        objectArray[71] = "\u001e+[.7^F\"Y<PW\u0016oI4<eB.\u0012ll2\u0017x\u0012bhY\u0004iH*P]\u0018x\u0019>2[J\"JS";
        objectArray[72] = "(Rv9HnrL&;5zKZ+7I.+L6&\u000f\u0011wUv,ZpvQ2 5";
        objectArray[73] = "_PwBPgCUyJ e$Gy^\\3DQdO\u001a\fY\u000f\"\u001f[~EQn\\ ";
        objectArray[74] = "DlJ#.\u0016\u0019p\u0017?G\u001dumI%;H\u0015{T4}w\u001fr\u0014d9\u001bEzS`G";
        objectArray[75] = "\u000eg)\u0006c:B`>\u000f\u001b\"S{'Yw\u0010\u00037~\u0002\u001b+U<v\u0006p8Df>>w,\u00056\u007fUd=_~GRp|\u000f?,Aa&G\u0007{@!\"QfzDe.>";
        objectArray[76] = "q\bB,?B-\u001c\f-UC-\u0019\u001c59qy]FcU\u0017-[\u000281K9\u0015\u0003R";
        objectArray[77] = "l\u0004ZJ9#;\u001a\u0010\u0010\u00002Q\bFU|d1\u001e[D:[n\u001a\u0011Rx<2\u001d@E\u0000";
        objectArray[78] = "5\b,\u0006\bu\"\f(\u001ec$,^3\r4s}\u0002ka\u001au\"\f+\\Zs(\n";
        objectArray[79] = "0Y\u007fh\u001ev2Mc}zg:F`w\u0013k\u0003H`g\u0017\r3Dvt\u000b66Qg!z";
        objectArray[80] = "1-nQ[im9 P1ca-4Cf4;}k/\u0000`>>:K\\tp?";
        objectArray[81] = "#\u0018D:~[$\u000eE{\u0002\u000eC\bZ:kW8\u0003\u000f9fg";
        objectArray[82] = "\u000e}m cuTc=\"\u001efmu0.b5\rc-?$\nQzm5qkP~)9\u001e";
        objectArray[83] = "\u00101\u001bn\u007fg@)\n3\u000fgq2\u0004ss2\u0011$\u0019b5\r@.]sei\u001c:\u0013r\u000f";
        objectArray[84] = "4\u00149\u0000A\u0003(JuC:\u0014$QeXV&p\u00119\u0003:\u000f.\\8VK\u001at@z?";
        objectArray[85] = "\u0010yx\u000b\u0019hLm6\nsiLh&\u0012\u001f[\u0018,|Ls`J/wM\u0018s[u?uBa\u001fj,\u0011\u001euQkF";
        objectArray[86] = "\n4\u0012F><F3\u0005OF$W(\u001c\u0019*\u0016\u0001oAA\u007fA\u000b9B\u0000,%W-\f\u0001F";
        objectArray[87] = "\u0012\nK%]n\u000e\t%#<i\u0015\u001c\u001aw_\"\u001f\t\u0015I";
        objectArray[88] = "\nxm!\u00019Rqo3f0\u0002<\u007f;\n\u0002V~#gWU\u0000#tl\u000b7\u0006q.?f:\f+/1\u0004<^q|\\\t6\u0004pr>\u000fd^#\u001f3\u0005>_-}5Wd\f@";
        objectArray[89] = "\"?\tJ\u0005\u001e\u007f#TVl\u0013\u0013>\nL\u0010@s(\u0017]V\u007fy!W\r\u0012\u0013#)\u0010\tl";
        objectArray[90] = "\u001f\u0010$\u0011#\u0018\b\u0014 \tHI\u0006F;\u001a\u001f\u001eW\u001bfv1\u0018\b\u0014#Kq\u001e\u0002\u0012";
        objectArray[91] = "u~3;7\u0006\u007f&2&H\u0002\u001e5$:4]~#9+rb\":y!'\u0003#>=-H";
        objectArray[92] = "Ie#{pEWv={\t\u00126n+<uFVx6-3y\nav'f\u0018\u000be2+\t";
        objectArray[93] = "\u0000\n#srB]F}r\u001c\\QY\"{K\u000b\u000e\u0005~\u0017d\tKS-(s\rOK";
        objectArray[94] = "rEv)\u0018R.Q8(rS.T(0\u001eaz\u0010sir\u0007.\u00166=\u0016[:X7WC[}V\"3\u001fO3WH";
        objectArray[95] = "Y~02~~\u0015y';\u0006f\u0004b>mjTR b7:\u0003\u0006}5:ka\u0000/oi\u0006";
        objectArray[96] = "\u007fVL\u00111.{WW\u0014\u0000:%GC\u0005Wm~\u001b\u0017P\u0000o8A_Xzk9ZZ";
        objectArray[97] = "\n.+\"/BM/ip\u0016]\u0013 .\u0003{N4# Ll\u0003\u0012r1|f]\u0016/Q2qCJ' '+_\bN/+g\u000f\u001e?:q{Mw";
        objectArray[98] = "\u0004FN\u0017Mt\u000e\u001eO\n2\u007fo\rY\u0016N/\u000f\u001bD\u0007\b\u0010S\u0002\u0004\r]qR\u0006@\u00012";
        objectArray[99] = "B$$\u0007MT\u001a-&\u0015*]J`6\u001dFo\u001e!mD\u00108KwmK\u0012SXf7\u0003*WDwf\u0017HQ\u0016-5z";
        objectArray[100] = "\u0004[\u001f`0c\u0013_\u001bx[2\u001d\r\u0000k\feMY_\u0007\"c\u0013_\u0018:be\u0019Y";
        objectArray[101] = "\u0003vv\u0004,B_b8\u0005FHSv,\u0016\u0011\u001f\t&pz*M\t*p\u00119\\Sb";
        objectArray[102] = "l\u0006]{C#h\u0007F~r76\u0017Ro%`mK\u0006>rb+\u0011N2\bf*\nK";
        objectArray[103] = "-o[\u001e*iahL\u0017RqpsUA>C&1\t\u001bo\u0014rl^\u0016?vt>\u0004ER";
        objectArray[104] = "I6\u0016/U`W%\b/,66=\u001ehPcV+\u0003y\u0016\\\n2CsC=\u000b6\u0007\u007f,";
        objectArray[105] = "\u0003UTc<3ORCjD+^IZ<(\u0019\n\u0005\u0005jtN\u0002X\u0004%.*^LJ$D";
        objectArray[106] = "%`5!\u001bo2d19p><6**'imeqF\to2d2{Ii8b";
        objectArray[107] = "y2}2pym6z1\u0015lb:ivKkb m\nzammmh|37>\u0000";
        objectArray[108] = "#7, c8\u007f#b!\t2s7v2^e)g(^e7)k*5v&s#";
        objectArray[109] = "ODd\u0018J,SG\n\u001d+cDUvKKuYD0tY`AQs\u0010ZbLT\n";
        Object[] objectArray2 = objectArray;
        objectArray[110] = "a4`{{~!2j}\u0007&uwo#k\u0014\"03t>Cvn}*vxs{l\u007f\u0007\u007ff1j+f~bufD";
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = eQ.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c2' || c == '\u00fb' || c == '\u00a2' || c == 'A') {
                field = eQ.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c2' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fb' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00a2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = eQ.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00a5' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00db' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        CallSite callSite;
        long l;
        block2: {
            long l2;
            block3: {
                l = (Long)objectArray[0];
                l2 = l ^ 0x17A8AD8BE37BL;
                CallSite callSite2 = eQ.b("\u00db", (long)3248137410805428312L, (long)l);
                try {
                    callSite = eQ.b("\u00c2", (Object)b, (long)3244961777093331522L, (long)l);
                    if (callSite2 != null) break block2;
                    if (callSite != null) break block3;
                }
                catch (MatchException matchException) {
                    throw eQ.b("\u00db", (Object)matchException, (long)3245939596424572607L, (long)l);
                }
                return;
            }
            this.e = this.c = eQ.b("\u00a5", (Object)eQ.b("\u00c2", (Object)b, (long)3244961777093331522L, (long)l), (long)3248206545078590305L, (long)l);
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l2;
            this.f = eQ.b("\u00db", (Object)objectArray2, (long)3247848487931279777L, (long)l);
            this.g = (float)eQ.b("\u00a5", (Object)eQ.b("\u00c2", (Object)b, (long)3244961777093331522L, (long)l), (long)3247525554223882257L, (long)l);
            this.h = (float)eQ.b("\u00a5", (Object)eQ.b("\u00c2", (Object)b, (long)3244961777093331522L, (long)l), (long)3251477647352780479L, (long)l);
            this.i = eQ.b("\u00a5", (Object)eQ.b("\u00c2", (Object)b, (long)3244961777093331522L, (long)l), (long)3250477345362110466L, (long)l);
            callSite = eQ.b("\u00c2", (Object)b, (long)3244961777093331522L, (long)l);
        }
        eQ.b("\u00a5", (Object)callSite, (Object)eQ.b("\u00a2", (long)3247743857958345405L, (long)l), (long)3245006727215597963L, (long)l);
    }

    @bP
    public void a(bG bG2) {
        float f;
        CallSite callSite;
        CallSite callSite2;
        int n;
        CallSite callSite3;
        CallSite callSite4;
        long l;
        long l2;
        block27: {
            block28: {
                CallSite callSite5;
                block25: {
                    block26: {
                        CallSite callSite6;
                        block23: {
                            block24: {
                                CallSite callSite7;
                                block21: {
                                    block22: {
                                        class_243 class_2432;
                                        block19: {
                                            block20: {
                                                class_310 class_3102;
                                                block17: {
                                                    block18: {
                                                        l2 = k ^ 0x772221020099L;
                                                        l = l2 ^ 0x24D577825923L;
                                                        callSite5 = eQ.b("\u00db", (long)6422861594181141609L, (long)l2);
                                                        try {
                                                            try {
                                                                class_3102 = b;
                                                                if (callSite5 != null) break block17;
                                                                if (eQ.b("\u00c2", (Object)class_3102, (long)6428953251953199406L, (long)l2) == null) break block18;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw eQ.b("\u00db", (Object)matchException, (long)6429664235355019918L, (long)l2);
                                                            }
                                                            return;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw eQ.b("\u00db", (Object)matchException, (long)6429664235355019918L, (long)l2);
                                                        }
                                                    }
                                                    eQ.b("\u00a5", (Object)eQ.b("\u00c2", (Object)eQ.b("\u00c2", (Object)b, (long)6422175707007037519L, (long)l2), (long)6423504117848494682L, (long)l2), (boolean)false, (long)6425780840037275106L, (long)l2);
                                                    eQ.b("\u00a5", (Object)eQ.b("\u00c2", (Object)eQ.b("\u00c2", (Object)b, (long)6422175707007037519L, (long)l2), (long)6422679679632487677L, (long)l2), (boolean)false, (long)6425780840037275106L, (long)l2);
                                                    eQ.b("\u00a5", (Object)eQ.b("\u00c2", (Object)eQ.b("\u00c2", (Object)b, (long)6422175707007037519L, (long)l2), (long)6426210135597292731L, (long)l2), (boolean)false, (long)6425780840037275106L, (long)l2);
                                                    eQ.b("\u00a5", (Object)eQ.b("\u00c2", (Object)eQ.b("\u00c2", (Object)b, (long)6422175707007037519L, (long)l2), (long)6428980279389644577L, (long)l2), (boolean)false, (long)6425780840037275106L, (long)l2);
                                                    eQ.b("\u00a5", (Object)eQ.b("\u00c2", (Object)eQ.b("\u00c2", (Object)b, (long)6422175707007037519L, (long)l2), (long)6424191366219635867L, (long)l2), (boolean)false, (long)6425780840037275106L, (long)l2);
                                                    eQ.b("\u00a5", (Object)eQ.b("\u00c2", (Object)eQ.b("\u00c2", (Object)b, (long)6422175707007037519L, (long)l2), (long)6429582501090224331L, (long)l2), (boolean)false, (long)6425780840037275106L, (long)l2);
                                                    class_3102 = b;
                                                }
                                                eQ.b("\u00a5", (Object)eQ.b("\u00c2", (Object)class_3102, (long)6429256633393757811L, (long)l2), (boolean)false, (long)6424070342418808768L, (long)l2);
                                                float f10 = (float)Math.PI / 180;
                                                float f11 = (float)Math.PI;
                                                CallSite callSite8 = eQ.b("\u00db", (double)((double)(-eQ.b("\u00a5", (Object)eQ.b("\u00c2", (Object)b, (long)6429256633393757811L, (long)l2), (long)6422311301327410208L, (long)l2) * f10 - f11)), (long)6426498390842963805L, (long)l2);
                                                CallSite callSite9 = eQ.b("\u00db", (double)((double)(-eQ.b("\u00a5", (Object)eQ.b("\u00c2", (Object)b, (long)6429256633393757811L, (long)l2), (long)6422311301327410208L, (long)l2) * f10 - f11)), (long)6423962782676160579L, (long)l2);
                                                class_2432 = new class_243((double)(-callSite9), 0.0, (double)(-callSite8));
                                                class_243 class_2433 = new class_243(0.0, 1.0, 0.0);
                                                callSite7 = eQ.b("\u00a5", (Object)class_2433, (Object)class_2432, (long)6422399440885502958L, (long)l2);
                                                callSite6 = eQ.b("\u00a5", (Object)class_2432, (Object)class_2433, (long)6422399440885502958L, (long)l2);
                                                callSite4 = eQ.b("\u00a2", (long)6423092425896242828L, (long)l2);
                                                try {
                                                    Object[] objectArray = new Object[1];
                                                    objectArray[0] = l;
                                                    callSite3 = eQ.b("\u00db", (long)eQ.b("\u00a5", (Object)eQ.b("\u00a5", (Object)b, (long)6429478375301742833L, (long)l2), (long)6429212349054338134L, (long)l2), (int)eQ.b("\u00a5", (Object)eQ.b("\u00a5", (Object)new N((class_304)eQ.b("\u00c2", (Object)eQ.b("\u00c2", (Object)b, (long)6422175707007037519L, (long)l2), (long)6423504117848494682L, (long)l2)), (Object)objectArray, (long)6423609910087039636L, (long)l2), (long)6422830180536055441L, (long)l2), (long)6426417922518699645L, (long)l2);
                                                    n = 1;
                                                    if (callSite5 != null) break block19;
                                                    if (callSite3 != n) break block20;
                                                }
                                                catch (MatchException matchException) {
                                                    throw eQ.b("\u00db", (Object)matchException, (long)6429664235355019918L, (long)l2);
                                                }
                                                callSite4 = eQ.b("\u00a5", (Object)callSite4, (Object)class_2432, (long)6429164648160512692L, (long)l2);
                                            }
                                            Object[] objectArray = new Object[1];
                                            objectArray[0] = l;
                                            callSite3 = eQ.b("\u00db", (long)eQ.b("\u00a5", (Object)eQ.b("\u00a5", (Object)b, (long)6429478375301742833L, (long)l2), (long)6429212349054338134L, (long)l2), (int)eQ.b("\u00a5", (Object)eQ.b("\u00a5", (Object)new N((class_304)eQ.b("\u00c2", (Object)eQ.b("\u00c2", (Object)b, (long)6422175707007037519L, (long)l2), (long)6422679679632487677L, (long)l2)), (Object)objectArray, (long)6423609910087039636L, (long)l2), (long)6422830180536055441L, (long)l2), (long)6426417922518699645L, (long)l2);
                                            n = 1;
                                        }
                                        try {
                                            if (callSite5 != null) break block21;
                                            if (callSite3 != n) break block22;
                                        }
                                        catch (MatchException matchException) {
                                            throw eQ.b("\u00db", (Object)matchException, (long)6429664235355019918L, (long)l2);
                                        }
                                        callSite4 = eQ.b("\u00a5", (Object)callSite4, (Object)class_2432, (long)6424144258884430807L, (long)l2);
                                    }
                                    Object[] objectArray = new Object[1];
                                    objectArray[0] = l;
                                    callSite3 = eQ.b("\u00db", (long)eQ.b("\u00a5", (Object)eQ.b("\u00a5", (Object)b, (long)6429478375301742833L, (long)l2), (long)6429212349054338134L, (long)l2), (int)eQ.b("\u00a5", (Object)eQ.b("\u00a5", (Object)new N((class_304)eQ.b("\u00c2", (Object)eQ.b("\u00c2", (Object)b, (long)6422175707007037519L, (long)l2), (long)6426210135597292731L, (long)l2)), (Object)objectArray, (long)6423609910087039636L, (long)l2), (long)6422830180536055441L, (long)l2), (long)6426417922518699645L, (long)l2);
                                    n = 1;
                                }
                                try {
                                    if (callSite5 != null) break block23;
                                    if (callSite3 != n) break block24;
                                }
                                catch (MatchException matchException) {
                                    throw eQ.b("\u00db", (Object)matchException, (long)6429664235355019918L, (long)l2);
                                }
                                callSite4 = eQ.b("\u00a5", (Object)callSite4, (Object)callSite7, (long)6429164648160512692L, (long)l2);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l;
                            callSite3 = eQ.b("\u00db", (long)eQ.b("\u00a5", (Object)eQ.b("\u00a5", (Object)b, (long)6429478375301742833L, (long)l2), (long)6429212349054338134L, (long)l2), (int)eQ.b("\u00a5", (Object)eQ.b("\u00a5", (Object)new N((class_304)eQ.b("\u00c2", (Object)eQ.b("\u00c2", (Object)b, (long)6422175707007037519L, (long)l2), (long)6428980279389644577L, (long)l2)), (Object)objectArray, (long)6423609910087039636L, (long)l2), (long)6422830180536055441L, (long)l2), (long)6426417922518699645L, (long)l2);
                            n = 1;
                        }
                        try {
                            if (callSite5 != null) break block25;
                            if (callSite3 != n) break block26;
                        }
                        catch (MatchException matchException) {
                            throw eQ.b("\u00db", (Object)matchException, (long)6429664235355019918L, (long)l2);
                        }
                        callSite4 = eQ.b("\u00a5", (Object)callSite4, (Object)callSite6, (long)6429164648160512692L, (long)l2);
                    }
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l;
                    callSite3 = eQ.b("\u00db", (long)eQ.b("\u00a5", (Object)eQ.b("\u00a5", (Object)b, (long)6429478375301742833L, (long)l2), (long)6429212349054338134L, (long)l2), (int)eQ.b("\u00a5", (Object)eQ.b("\u00a5", (Object)new N((class_304)eQ.b("\u00c2", (Object)eQ.b("\u00c2", (Object)b, (long)6422175707007037519L, (long)l2), (long)6424191366219635867L, (long)l2)), (Object)objectArray, (long)6423609910087039636L, (long)l2), (long)6422830180536055441L, (long)l2), (long)6426417922518699645L, (long)l2);
                    n = 1;
                }
                try {
                    if (callSite5 != null) break block27;
                    if (callSite3 != n) break block28;
                }
                catch (MatchException matchException) {
                    throw eQ.b("\u00db", (Object)matchException, (long)6429664235355019918L, (long)l2);
                }
                callSite4 = eQ.b("\u00a5", (Object)callSite4, (double)0.0, (double)((double)eQ.b("\u00a5", (Object)((Float)((Object)eQ.b("\u00a5", (Object)this.a, (long)6423033332327957036L, (long)l2))), (long)6425956987889600679L, (long)l2)), (double)0.0, (long)6423926703046329307L, (long)l2);
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l;
            callSite3 = eQ.b("\u00db", (long)eQ.b("\u00a5", (Object)eQ.b("\u00a5", (Object)b, (long)6429478375301742833L, (long)l2), (long)6429212349054338134L, (long)l2), (int)eQ.b("\u00a5", (Object)eQ.b("\u00a5", (Object)new N((class_304)eQ.b("\u00c2", (Object)eQ.b("\u00c2", (Object)b, (long)6422175707007037519L, (long)l2), (long)6429582501090224331L, (long)l2)), (Object)objectArray, (long)6423609910087039636L, (long)l2), (long)6422830180536055441L, (long)l2), (long)6426417922518699645L, (long)l2);
            n = 1;
        }
        if (callSite3 == n) {
            callSite4 = eQ.b("\u00a5", (Object)callSite4, (double)0.0, (double)((double)(-eQ.b("\u00a5", (Object)((Float)((Object)eQ.b("\u00a5", (Object)this.a, (long)6423033332327957036L, (long)l2))), (long)6425956987889600679L, (long)l2))), (double)0.0, (long)6423926703046329307L, (long)l2);
        }
        try {
            callSite2 = eQ.b("\u00a5", (Object)callSite4, (long)6423389372367278164L, (long)l2);
            callSite = eQ.b("\u00a5", (Object)((Float)((Object)eQ.b("\u00a5", (Object)this.a, (long)6423033332327957036L, (long)l2))), (long)6425956987889600679L, (long)l2);
            Object[] objectArray = new Object[1];
            objectArray[0] = l;
            f = eQ.b("\u00db", (long)eQ.b("\u00a5", (Object)eQ.b("\u00a5", (Object)b, (long)6429478375301742833L, (long)l2), (long)6429212349054338134L, (long)l2), (int)eQ.b("\u00a5", (Object)eQ.b("\u00a5", (Object)new N((class_304)eQ.b("\u00c2", (Object)eQ.b("\u00c2", (Object)b, (long)6422175707007037519L, (long)l2), (long)6426044409883970879L, (long)l2)), (Object)objectArray, (long)6423609910087039636L, (long)l2), (long)6422830180536055441L, (long)l2), (long)6426417922518699645L, (long)l2) == 1 ? 2.0f : 1.0f;
        }
        catch (MatchException matchException) {
            throw eQ.b("\u00db", (Object)matchException, (long)6429664235355019918L, (long)l2);
        }
        callSite4 = eQ.b("\u00a5", (Object)callSite2, (double)((double)(callSite * f)), (long)6422697058477168700L, (long)l2);
        this.e = this.c;
        this.c = eQ.b("\u00a5", (Object)this.c, (Object)callSite4, (long)6429164648160512692L, (long)l2);
    }

    @bP
    public void a(bd_0 bd_02) {
        CallSite callSite;
        long l;
        block5: {
            block6: {
                l = k ^ 0x3908BEF0F5E9L;
                CallSite callSite2 = eQ.b("\u00db", (long)-6029518642463870695L, (long)l);
                try {
                    if (eQ.b("\u00a5", (Object)bd_02, (Object)new Object[0], (long)-6026817893716505218L, (long)l) != y_0.PRE) {
                        return;
                    }
                }
                catch (MatchException matchException) {
                    throw eQ.b("\u00db", (Object)matchException, (long)-6031850812166344706L, (long)l);
                }
                try {
                    callSite = eQ.b("\u00c2", (Object)b, (long)-6032289183472497917L, (long)l);
                    if (callSite2 != null) break block5;
                    if (callSite != null) break block6;
                }
                catch (MatchException matchException) {
                    throw eQ.b("\u00db", (Object)matchException, (long)-6031850812166344706L, (long)l);
                }
                return;
            }
            eQ.b("\u00a5", (Object)eQ.b("\u00c2", (Object)b, (long)-6032289183472497917L, (long)l), (double)eQ.b("\u00c2", (Object)this.f, (long)-6026891682286538168L, (long)l), (double)eQ.b("\u00c2", (Object)this.f, (long)-6028191609976794448L, (long)l), (double)eQ.b("\u00c2", (Object)this.f, (long)-6026277999286824294L, (long)l), (long)-6028672025688104814L, (long)l);
            callSite = eQ.b("\u00c2", (Object)b, (long)-6032289183472497917L, (long)l);
        }
        eQ.b("\u00a5", (Object)callSite, (Object)eQ.b("\u00a2", (long)-6029432950121112580L, (long)l), (long)-6032009758337218358L, (long)l);
        eQ.b("\u00a5", (Object)bd_02, (Object)new Object[]{Float.valueOf(this.g)}, (long)-6026632244638747990L, (long)l);
        eQ.b("\u00a5", (Object)bd_02, (Object)new Object[]{Float.valueOf(this.h)}, (long)-6030305250582532557L, (long)l);
        eQ.b("\u00a5", (Object)bd_02, (Object)new Object[0], (long)-6032134912520628889L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    @bP
    public void a(bh_0 var1_1) {
        block23: {
            block22: {
                block21: {
                    block20: {
                        block19: {
                            var2_2 = eQ.k ^ 16148617683297L;
                            var6_3 = eQ.b("\u00a5", (Object)var1_1, (Object)new Object[0], (long)-5126109941990507493L, (long)var2_2);
                            var4_4 = eQ.b("\u00db", (long)-5126522327249033839L, (long)var2_2);
                            try {
                                try {
                                    v0 = var6_3;
                                    if (var4_4 != null) break block19;
                                    if (v0 instanceof class_2848) {
                                    }
                                    ** GOTO lbl21
                                }
                                catch (MatchException v1) {
                                    throw eQ.b("\u00db", (Object)v1, (long)-5133338299527431306L, (long)var2_2);
                                }
                                v0 = var6_3;
                            }
                            catch (MatchException v2) {
                                throw eQ.b("\u00db", (Object)v2, (long)-5133338299527431306L, (long)var2_2);
                            }
                        }
                        var5_5 = (class_2848)v0;
                        try {
                            if (var4_4 == null) break block20;
lbl21:
                            // 2 sources

                            return;
                        }
                        catch (MatchException v3) {
                            throw eQ.b("\u00db", (Object)v3, (long)-5133338299527431306L, (long)var2_2);
                        }
                    }
                    var6_3 = eQ.b("\u00a5", (Object)var5_5, (long)-5133317345487685492L, (long)var2_2);
                    try {
                        try {
                            v4 = var6_3;
                            v5 = eQ.b("\u00a2", (long)-5127615423159589282L, (long)var2_2);
                            if (var4_4 != null) break block21;
                            if (v4 != v5) {
                            }
                            ** GOTO lbl44
                        }
                        catch (MatchException v6) {
                            throw eQ.b("\u00db", (Object)v6, (long)-5133338299527431306L, (long)var2_2);
                        }
                        v4 = var6_3;
                        v5 = eQ.b("\u00a2", (long)-5127758099344641501L, (long)var2_2);
                    }
                    catch (MatchException v7) {
                        throw eQ.b("\u00db", (Object)v7, (long)-5133338299527431306L, (long)var2_2);
                    }
                }
                try {
                    if (v4 != v5) break block22;
lbl44:
                    // 2 sources

                    v8 = 1;
                    break block23;
                }
                catch (MatchException v9) {
                    throw eQ.b("\u00db", (Object)v9, (long)-5133338299527431306L, (long)var2_2);
                }
            }
            v8 = 0;
        }
        var7_6 = v8;
        try {
            if (var7_6 != 0) {
                eQ.b("\u00a5", (Object)var1_1, (Object)new Object[0], (long)-5133616599200710161L, (long)var2_2);
            }
        }
        catch (MatchException v10) {
            throw eQ.b("\u00db", (Object)v10, (long)-5133338299527431306L, (long)var2_2);
        }
    }

    @bP
    public void a(aT aT2) {
        long l = k ^ 0x5110AF6E243FL;
        long l2 = l ^ 0x7FCE8FE3EB92L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        CallSite callSite = eQ.b("\u00db", (Object)objectArray, (long)9043275803512309235L, (long)l);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = (double)eQ.b("\u00db", (float)callSite, (float)((float)eQ.b("\u00c2", (Object)this.e, (long)9046119674732028830L, (long)l)), (float)((float)eQ.b("\u00c2", (Object)this.c, (long)9046119674732028830L, (long)l)), (long)9045290346664504323L, (long)l);
        eQ.b("\u00a5", (Object)aT2, (Object)objectArray2, (long)9043655354331709834L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = (double)eQ.b("\u00db", (float)callSite, (float)((float)eQ.b("\u00c2", (Object)this.e, (long)9043764284614050662L, (long)l)), (float)((float)eQ.b("\u00c2", (Object)this.c, (long)9043764284614050662L, (long)l)), (long)9045290346664504323L, (long)l);
        eQ.b("\u00a5", (Object)aT2, (Object)objectArray3, (long)9044184011660221837L, (long)l);
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = (double)eQ.b("\u00db", (float)callSite, (float)((float)eQ.b("\u00c2", (Object)this.e, (long)9045537088578978636L, (long)l)), (float)((float)eQ.b("\u00c2", (Object)this.c, (long)9045537088578978636L, (long)l)), (long)9045290346664504323L, (long)l);
        eQ.b("\u00a5", (Object)aT2, (Object)objectArray4, (long)9044864381813255581L, (long)l);
        eQ.b("\u00a5", (Object)aT2, (Object)new Object[0], (long)9052205949211051185L, (long)l);
    }

    @bP
    public void a(bt_0 bt_02) {
        block5: {
            eQ eQ2;
            long l;
            long l2;
            long l3;
            long l4;
            long l5;
            block4: {
                long l6 = l5 = k ^ 0x49AAC68FE6D1L;
                l4 = l6 ^ 0x853C5D38B49L;
                l3 = l6 ^ 0x56C76B1B866L;
                l2 = l6 ^ 0xBC653E5C2F1L;
                l = l6 ^ 0x759B3E0E2344L;
                CallSite callSite = eQ.b("\u00db", (long)-4653722409723534815L, (long)l5);
                try {
                    try {
                        eQ2 = this;
                        if (callSite != null) break block4;
                        if (eQ.b("\u00a5", (Object)((Boolean)((Object)eQ.b("\u00a5", (Object)eQ2.d, (long)-4653612320429497244L, (long)l5))), (long)-4653181363563056042L, (long)l5) == false) break block5;
                    }
                    catch (MatchException matchException) {
                        throw eQ.b("\u00db", (Object)matchException, (long)-4651375061690516282L, (long)l5);
                    }
                    eQ2 = this;
                }
                catch (MatchException matchException) {
                    throw eQ.b("\u00db", (Object)matchException, (long)-4651375061690516282L, (long)l5);
                }
            }
            float f = (float)eQ.b("\u00c2", (Object)eQ2.f, (long)-4655493516180135568L, (long)l5);
            float f10 = (float)eQ.b("\u00c2", (Object)this.f, (long)-4652219475508543096L, (long)l5);
            float f11 = (float)eQ.b("\u00c2", (Object)this.f, (long)-4654984009229614686L, (long)l5);
            Object[] objectArray = new Object[1];
            objectArray[0] = l4;
            Object[] objectArray2 = new Object[3];
            objectArray2[2] = l;
            objectArray2[1] = Float.valueOf(0.1f);
            objectArray2[0] = eQ.b("\u00db", (Object)objectArray, (long)-4654129538841724834L, (long)l5);
            Object[] objectArray3 = new Object[10];
            objectArray3[9] = l3;
            objectArray3[8] = eQ.b("\u00db", (Object)objectArray2, (long)-4652804300491535902L, (long)l5);
            objectArray3[7] = Float.valueOf(f11 + 0.3f);
            objectArray3[6] = Float.valueOf(f10 + eQ.b("\u00a5", (Object)eQ.b("\u00c2", (Object)b, (long)-4651813447761143749L, (long)l5), (long)-4652046443288222925L, (long)l5));
            objectArray3[5] = Float.valueOf(f + 0.3f);
            objectArray3[4] = Float.valueOf(f11 - 0.3f);
            objectArray3[3] = Float.valueOf(f10);
            objectArray3[2] = Float.valueOf(f - 0.3f);
            objectArray3[1] = bt_02.a;
            objectArray3[0] = bt_02.b;
            eQ.b("\u00db", (Object)objectArray3, (long)-4654000594952774641L, (long)l5);
            Object[] objectArray4 = new Object[1];
            objectArray4[0] = l4;
            Object[] objectArray5 = new Object[10];
            objectArray5[9] = l2;
            objectArray5[8] = eQ.b("\u00db", (Object)objectArray4, (long)-4654129538841724834L, (long)l5);
            objectArray5[7] = Float.valueOf(f11 + 0.3f);
            objectArray5[6] = Float.valueOf(f10 + eQ.b("\u00a5", (Object)eQ.b("\u00c2", (Object)b, (long)-4651813447761143749L, (long)l5), (long)-4652046443288222925L, (long)l5));
            objectArray5[5] = Float.valueOf(f + 0.3f);
            objectArray5[4] = Float.valueOf(f11 - 0.3f);
            objectArray5[3] = Float.valueOf(f10);
            objectArray5[2] = Float.valueOf(f - 0.3f);
            objectArray5[1] = bt_02.a;
            objectArray5[0] = bt_02.b;
            eQ.b("\u00db", (Object)objectArray5, (long)-4654535639777354018L, (long)l5);
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n3] != null) {
            return n3;
        }
        Object object = eQ.l[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 22;
            case 1 -> 26;
            case 2 -> 13;
            case 3 -> 25;
            case 4 -> 38;
            case 5 -> 23;
            case 6 -> 3;
            case 7 -> 39;
            case 8 -> 45;
            case 9 -> 56;
            case 10 -> 11;
            case 11 -> 53;
            case 12 -> 54;
            case 13 -> 50;
            case 14 -> 59;
            case 15 -> 19;
            case 16 -> 32;
            case 17 -> 1;
            case 18 -> 47;
            case 19 -> 15;
            case 20 -> 42;
            case 21 -> 40;
            case 22 -> 7;
            case 23 -> 28;
            case 24 -> 16;
            case 25 -> 31;
            case 26 -> 44;
            case 27 -> 60;
            case 28 -> 14;
            case 29 -> 24;
            case 30 -> 61;
            case 31 -> 62;
            case 32 -> 21;
            case 33 -> 43;
            case 34 -> 52;
            case 35 -> 30;
            case 36 -> 2;
            case 37 -> 41;
            case 38 -> 20;
            case 39 -> 18;
            case 40 -> 9;
            case 41 -> 46;
            case 42 -> 27;
            case 43 -> 10;
            case 44 -> 0;
            case 45 -> 55;
            case 46 -> 49;
            case 47 -> 48;
            case 48 -> 51;
            case 49 -> 4;
            case 50 -> 5;
            case 51 -> 6;
            case 52 -> 34;
            case 53 -> 57;
            case 54 -> 58;
            case 55 -> 8;
            case 56 -> 33;
            case 57 -> 35;
            case 58 -> 63;
            case 59 -> 29;
            case 60 -> 36;
            case 61 -> 37;
            case 62 -> 12;
            default -> 17;
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
        eQ.m[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = eQ.m(l, l2);
        Object object = eQ.l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = eQ.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = eQ.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = eQ.g(clazz3, string2, clazz2)) != null) {
                    eQ.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = eQ.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        eQ.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = eQ.n(1875198381752037L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = eQ.m(l, l2);
        Object object = eQ.l[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = m[n];
                int n3 = string2.indexOf(8);
                clazz3 = eQ.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = eQ.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = eQ.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        eQ.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = eQ.n(1875198381752037L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = eQ.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        eQ.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = eQ.n(1875198381752037L, 0L);
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
            return MethodHandles.lookup().findStatic(eQ.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


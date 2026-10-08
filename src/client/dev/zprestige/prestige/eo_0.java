/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_1743
 *  net.minecraft.class_243
 *  net.minecraft.class_2616
 *  net.minecraft.class_2724
 *  net.minecraft.class_304
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.N;
import dev.zprestige.prestige.aK;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bd_0;
import dev.zprestige.prestige.bg_0;
import dev.zprestige.prestige.by_0;
import dev.zprestige.prestige.dM;
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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1657;
import net.minecraft.class_1743;
import net.minecraft.class_243;
import net.minecraft.class_2616;
import net.minecraft.class_2724;
import net.minecraft.class_304;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.eo
 */
public class eo_0
extends dV {
    private dO a;
    private dO c;
    private dO d;
    private dO e;
    private dM f;
    private dM g;
    private f5 h;
    private f5 i;
    private f5 j;
    private boolean k;
    public static boolean l;
    private static final long m;
    private static final long[] n;
    private static final Integer[] o;
    private static final Map p;
    private static final Object[] q;
    private static final String[] r;

    public eo_0() {
        long l;
        long l2 = l = m ^ 0x452B8C692168L;
        long l3 = l2 ^ 0x16A3B23BD8CAL;
        long l4 = l2 ^ 0x43D81BDFB3F8L;
        this.h = new f5(l3);
        this.i = new f5(l3);
        this.j = new f5(l3);
        this.k = 0;
        Object[] objectArray = new Object[2];
        objectArray[1] = l4;
        objectArray[0] = this::lambda$new$0;
        eo_0.c("\u00ea", (Object)this.g, (Object)objectArray, (long)2543480569621707730L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        m = hc.a(8357056368823629103L, 6180071281623253355L, MethodHandles.lookup().lookupClass()).a(252164659909800L);
        q = new Object[117];
        r = new String[117];
        eo_0.f();
        p = new HashMap(13);
        long l = m ^ 0x9080BA8A049L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n = 0;
        String string = "<\u008f\u00a9\u00df.\u00e2\u0018\u00d3wG\u00c9=\u008enji";
        int n2 = "<\u008f\u00a9\u00df.\u00e2\u0018\u00d3wG\u00c9=\u008enji".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        eo_0.n = lArray;
        o = new Integer[2];
        eo_0.l = 0;
    }

    @Override
    public void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x76B5CE7314ABL;
        this.k = 0;
        eo_0.l = 0;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        eo_0.c("\u00ea", (Object)this, (Object)objectArray2, (long)3998468958572074980L, (long)l);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = eo_0.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/eo" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x33C6;
        if (o[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = eo_0.n[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])p.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    p.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/eo", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            eo_0.o[n2] = n3;
        }
        return o[n2];
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/eo" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = eo_0.m(l, l2);
            object = q[n];
            try {
                if (!(object instanceof String)) break block2;
                eo_0.q[n] = clazz = Class.forName(r[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = eo_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = eo_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = eo_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = eo_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = q;
        q[0] = "+\u0002\u000el!\u0018=\u0002\u000b62\u000f*I\b0>\u001b;\u000e\u001f'u\r ";
        objectArray[1] = "\u0017tyn\u001bgbTra\n(\u0003Zyj\u000erw";
        objectArray[2] = Void.TYPE;
        eo_0.r[2] = "java/lang/Void";
        objectArray[3] = "GLPq\f,GLG-\u0000#]\u0007G3\u00006Zv\u0015iTr";
        objectArray[4] = Double.TYPE;
        eo_0.r[4] = "java/lang/Double";
        objectArray[5] = "[D0[`+MD5\u0001s<Z\u000f6\u0007\u007f(KH!\u00104:w";
        objectArray[6] = "&_\u0014^\u0011eS\u007f\u001fQ\u0000*.g\fV\tcF";
        objectArray[7] = "#t\u0005\ni\u0015#t\u0012Ve\u001a9?\u0012He\u000f>NC\u00107";
        objectArray[8] = "78\u0015vR\u0019!8\u0010,A\u000e6s\u0013*M\u001a'4\u0004=\u0006\nk";
        objectArray[9] = "m\u001a/\u0001L+\u0018:$\u000e]dy4/\u0005Y>\r";
        objectArray[10] = "fA\u0000\u001a\fRpA\u0005@\u001fEg\n\u0006F\u0013QvM\u0011QXFI";
        objectArray[11] = "\r;@(\\t\u00064Qg=z\r?U=";
        objectArray[12] = "\u000e\u007fB\u001c\u0016$\u0005pSS~$\u000b\u007f@";
        objectArray[13] = Float.TYPE;
        eo_0.r[13] = "java/lang/Float";
        objectArray[14] = "-\u007f\b,\u0001U&p\u0019cbX3}\u0016\bWZ\"n\n$@W";
        objectArray[15] = "l\u0016)\u007f\f \u00196\"p\u001dox8){\u00195\f";
        objectArray[16] = "Pxm\u0010\u0002\u001ePxzL\u000e\u0011J3zR\u000e\u0004MB*\u000f_";
        objectArray[17] = "phIh;>ph^471j#^*7$mR\nr`";
        objectArray[18] = "\u0010)\fdG+\u001b&\u001d++(\u0015$\u001fd\u0007";
        objectArray[19] = Boolean.TYPE;
        eo_0.r[19] = "java/lang/Boolean";
        objectArray[20] = "|ia\u001d*8jidG9/}\"gA5;lepV~+j";
        objectArray[21] = "S\u0010xKQ8&0sD@wG>xOD-3";
        objectArray[22] = "=vkQfR=v|\rj]'=|\u0013jH L.I=\n";
        objectArray[23] = Integer.TYPE;
        eo_0.r[23] = "java/lang/Integer";
        objectArray[24] = "^!6nO'^!!2C(Dj!,C=C\u001bsw\u001bw";
        objectArray[25] = "L%6&^M9\u0005=)O\u0002X\u000b6\"KX,";
        objectArray[26] = "3#U\u000e3\u0004%#PT \u00132hSR,\u0007#/DEg\u0012b";
        objectArray[27] = "\u0013OCe{\nfoHjjE\u0007aCan\u001fs";
        objectArray[28] = "\u0010\u001a\r\u0004w+\u0010\u001a\u001aX{$\nQ\u001aF{1\r J\u001b/";
        objectArray[29] = "\u0001L]\u001f2\u0018\u0001LJC>\u0017\u001b\u0007J]>\u0002\u001cv\u001a\u0001k";
        objectArray[30] = "^\t|uljH\ty/\u007f}_Bz)siN\u0005m>8~w";
        objectArray[31] = "2g@\u0013w#GGK\u001cfl&I@\u0017b6R";
        objectArray[32] = "{d\u000e;7(md\u000ba$?z/\bg(+kh\u001fpc>.";
        objectArray[33] = "V_v}U+#\u007f}rDdBqvy@>6";
        objectArray[34] = ":\n\u001aKOn:\n\r\u0017Ca A\r\tCt'0\\S\u00131";
        objectArray[35] = "\u0001*\u001e\u0000R\u0011\u0001*\t\\^\u001e\u001ba\tB^\u000b\u001c\u0010\\\u001d\u0007";
        objectArray[36] = "`}Z7Gbv}_mTua6\\kXapqK|\u0013pc";
        objectArray[37] = "eGzjI\\\u0010gqeX\u0013qizn\\I\u0005";
        objectArray[38] = "{NQ[|5{NF\u0007p:a\u0005F\u0019p/ft\u0017@(j";
        objectArray[39] = " XY9\u0016Q XNe\u001a^:\u0013N{\u001aK=b\u001c%B\u000f";
        objectArray[40] = "28\r\u0015!L7-\u0006\u0015*W;=D|\u0001}\n";
        objectArray[41] = Long.TYPE;
        eo_0.r[41] = "java/lang/Long";
        objectArray[42] = "_\u000eP^:T_\u000eG\u00026[EEG\u001c6NB4\u0015@c\f";
        objectArray[43] = "N[3`bbX[6:quO\u00105<}a^W\"+6\\";
        objectArray[44] = "\t0qOHK|\u0010z@Y\u0004\u001d\u001eqK]^i";
        objectArray[45] = "?y\n\t\u0016(?y\u001dU\u001a'%2\u001dK\u001a2\"CM\u0011Ltu\u007f\u0012F\b2\u000e/N\u0011";
        objectArray[46] = "1R2+\\*/Z(d!:/";
        objectArray[47] = "Bhn\bRL7He\u0007C\u0003VFn\fGY\"";
        objectArray[48] = "Mh0?Y\u007f8H;0H0YF0;Lj-";
        objectArray[49] = "\u0019v\u0013\u001b\u0003\u001elV\u0018\u0014\u0012Q\rX\u0013\u001f\u0016\u000by";
        objectArray[50] = ",J\u0014\"3\u0000Yj\u001f-\"O8d\u0014&&\u0015L";
        objectArray[51] = "<z\u0000'\u0004K<z\u0017{\bD&1\u0017e\bQ!@E>P\u0010";
        objectArray[52] = "\u0013*v6)#f\n}98l\u0007\u0004v2<6s";
        objectArray[53] = "?\u0006\u00192\u0010vJ&\u0012=\u00019+(\u00196\u0005c_";
        objectArray[54] = "FCb\u0007_<PCg]L+G\bd[@?VOsL\u000b/M";
        objectArray[55] = "Ux\t)&\f X\u0002&7CAV\t-3\u00195";
        objectArray[56] = "O V'\u001bR:\u0000](\n\u001d[\u000eV#\u000eG/";
        objectArray[57] = "m\u000eI\\\u000f@m\u000e^\u0000\u0003OwE^\u001e\u0003Zp4\fJR\u001b";
        objectArray[58] = "\u0003\u0004w\u0017KES\txZ)HX\nqF~\u0018\u0001\\+*\u0012\u001eF\u0019o\u001aE^H\f";
        objectArray[59] = "7S;{\u000b}9\u001av$ig0\u001f&,\u0005UgYx{R\u0002!^6.Vd=\u000f(0i";
        objectArray[60] = "(\u0018-W\u0017/&Q`\bu>#E4\u000b\"i}\u0012lg\u001f\")T/_\u0015.|\u0019";
        objectArray[61] = "Q>fwM\u001bMoxir\u0018@\u007fvu\u001e*\u0011?'*r\u0006Kr)\u007f\u001d\u0013Izo\u0012";
        objectArray[62] = "\u000fp6\n*\\\u0011w8JRLn(\u007fK7]\r/}\bj\u0015n}(\u001a0[\u0015c.\u0014<%";
        objectArray[63] = ">\b_8]Wk\tA}9B\u0002\n\u001c=\\Sa\r\u001e~\u0001\u001b\u0002\n[`BI{\u0003Y{\u0007+";
        objectArray[64] = "\u0002(32bDR%<\u007f\u0000BU71hlp\u0006sm0\u0000H_9*7?\u001f\t:o\u000f";
        objectArray[65] = "\u0007\nG.\u0001\u001c[R\u0007?cFW\u0017\u001f#\u000ft\u0003SE|c\u001e[S\u0015&\\B\u0003\u0013\u0004D^B\u0002\u0001\u001d{\u0002\u001aB\u0010\u007f";
        objectArray[66] = "kj\u000bAQN21@\u00002Sa}[\u0019^a<=\u0005O2Y7=_\u0015I\noqB~HQ3sP\u0005QWv9;";
        objectArray[67] = "x\u0005m\u0007Z\u001ar\t8J%G\u007f\u000bf\u001cIu,N?F%N~\u001bd\u0005^Px\u0015h{";
        objectArray[68] = ";\u0011+XH\u007f'\u00101\u0012)a*(`\u001bTi\u007fYiHUwD\u0018i_F=5\u0011:^X\u0006;\u0011+XH\u007f'\u00101\u0012)";
        objectArray[69] = "r\u0006`lxidF{\u0012,\r|Ee*<bd\u0013g+Ed*\u001a=k*||\u0018<\u0012";
        objectArray[70] = ")\u001fDA&\u0000r^@Kt|~B\u0014J{+ \u0019D\u0013\u0017\u000e\u007fB\u000bK{\u0000s\u001eD";
        objectArray[71] = "\u0013]Z\\\u0017pCPU\u0011uvDBX\u0006\u0019D\u0013\u0005\u0003XJ\u0013\u0012\u0006G\u001f\u000f#EFI\nu";
        objectArray[72] = "V\u0019]LdMF\u0014\u001bJ\t\u001a+J\u0018\u0010l\u000bHM\u001aS1C+\rI\u0015f\u0010A\u001cR]ys";
        objectArray[73] = "4f19=zdk>t_twx:`$\u0019><.kdh7o/u_ubi1z$kdg=\u0004";
        objectArray[74] = "-`\bs_\u000bsj\u00055=_H=Y3XM+:[p\u0005\u0005H>\u0001l\u0000W+n\fcM5";
        objectArray[75] = "\\z\u000f;\u0002}N9Oo:/^-Z:mx\u000ex\u0002VY9\u0003>P-[&D,";
        objectArray[76] = ")I\fsJ-u\u0011Lb(wyTT~DE-\u0010\u000e((/u\u0010^{\u0017s-PO\u0019";
        objectArray[77] = "T.\u0000Di#_3\u000bT\u0002\"X)\u0000Dk.a'\u0000ToHS\"\bK|3M$\u0006G\u0002";
        objectArray[78] = "\u0007\u0011e\u0001bO\u0011Q~\u007f=+YV=\u001a'H^T~Go+Y\u0011`\u0004=RP\u0013{A_";
        objectArray[79] = "\u0005y\f\u00037lUt\u0003NUjRf\u000eY9X\u0005!U\u0004l\u000f\u0004\"\u0011@/?Sb\u001fUU";
        objectArray[80] = "}H\u001e\u0003\u001c\u001fqNF\u000b`\u0002~XE\u0007\f0.\u0018\u001eP`\b(\u0018A\u000b\u001b[pT\\`\u000f\u0000a_\u001d_XVb\u001a%";
        objectArray[81] = "\u0016/]\u0004\u001b*Jw\u001d\u0015ypF2\u0005\t\u0015B\u0012v^Uy.\u00131\u001b\u0014IyS?\u000en";
        objectArray[82] = "e}0\u0014g00y5ZXfZ$fX74+-5Y)\u000f";
        objectArray[83] = "J2\u0019\u00121\u0005@>L_NXM<\u0012\t\"j\u001a|BT~=L,\u001e\f0FR*\u0010\u0000N";
        objectArray[84] = "6J\u000e^ /#QA\u0002Q<Z\rJ\u00034-9\nH@ieZX\u001dR3+!F\u001b\\?U";
        objectArray[85] = "wXCY\u0016T}T\u0016\u0014i\tpVHB\u0005;\"\u0010\u0016\u001ci]\"\u0013\u0013KX\fmZY%XS$\u0011F\u0014\t\u001cm[(";
        objectArray[86] = "Ri.\u0001WT\u0013<&\n=\u0006o5\u007f[X\u0014\f2}\u0018\u0005\\o1%^W\u000ePm}\u001eFl";
        objectArray[87] = ":ht{Vk+s<d5d)~,sYV}>p(5n\u007f>(\u007fN='r5\u0014";
        objectArray[88] = "\u0012y\u0014*q\u0007\u0011xS6\u0013P\r'\u0010\u0000~C,.\u00124~u\u00145\u0013(u?\u0012/\u001ep~P\u0007-\u00166\u0013PRu\u000b$h\u0003\n9\u0016O|\u0004U-\u00044/\\\u00190o";
        objectArray[89] = "H<\ri`\u0012B0X$\u001fOO2\u0006rs}\u001fq]$\u001fPEq\u0014~dIC4^\u0015.\u0015\u001bu\b$\u007fZR?f";
        objectArray[90] = "3G\u001d]|2fF\u0003\u0018\u0018$\u000f@\f\u001fa-2\u0004Z\b\"N";
        objectArray[91] = "\t'\u001al'7WjZ?X/\u0002*Aa4\u001dVo\u001b8iJ\u0000m\u001db31S5Q\u007fX";
        objectArray[92] = "?$LCF\u00191m\u0001\u001c$\b4yU\u001fs_k$\u000esC\re+R\u000b\u001aV.j";
        objectArray[93] = "j>\u001fg\u0016I|~\u0004\u0019H-4yG|SN3{\u0004!\u001b-4>\u001abIT=<\u0001'+";
        objectArray[94] = "\u001fg\u0011\t\b4H1\u0012L0n\u001d|\u0003\u0015\\\\O1[C0y\u001fa\u0011\u0017\\w\u0013=^r";
        objectArray[95] = "BG\u0003o'S\u001e\u001fC~E\t\u0012Z[b);F\u001e\u0001;EQ\u001e\u001eQgz\rF^@\u0005~T\u0000XA5)\u0014\u000eM;";
        objectArray[96] = "~Qz@m5t]/\r\u0012hy_q[~Z*\u001b-\u0003\u0012bsQj\u0004-5%R/<";
        objectArray[97] = "y]\u0001/,5o\u001d\u001aQuQ'\u001aY4i2 \u0018\u001ai!Q']\u0004*s(._\u001fo\u0011";
        objectArray[98] = "\u0015\u0007-S\fe\u001f\u000bx\u001es8\u0012\t&H\u001f\nDL{\u0013C]\u0011\u0019}L\u000f%\u001d\u001f%Ds";
        objectArray[99] = "\u001bw5\u0013:4\u000elzOK)w0qN.6\u00147s\rs~we&\u001f)0\f{ \u0011%N";
        objectArray[100] = "4f\u001c\trMdk\u0013D\u0010@oh\u001aXG\u00106<B4+\u0016q{\u0004\u0004|V\u007fn";
        objectArray[101] = "\f\u0007bS\u001c7\\\nm\u001e~1[\u0018`\t\u0012\u0003\f_;WNT\r\\\u007f\u0010\u0004dZ\u001cq\u0005~";
        objectArray[102] = "7\u0006RXD\u00069O\u001f\u0007&\u0017<[K\u0004q@c\u0007\u0017hECl[\u0017TW\u0000,\u000f";
        objectArray[103] = "Z}R+XNDz\\k ^;%\u001bjEOX\"\u0019)\u0018\u0007;%\\7[UB,^,\u001e7";
        objectArray[104] = "\u0006f[ew\b\u0005g\u001cy\u0015_\u00198_OxL>;Q\u0000nV\fiMo{T\u0004/ o.\f\u0019=[<v@\u0004VO;)T\u0016-\u001cceI}";
        objectArray[105] = "6\u000b+\u001a3F K0dg\"hLs\u0001vAoN0\\>\"=\u001b\"\u0006pY#\u001d,\n\u000e";
        objectArray[106] = "\u000b\u0005$[\u0010u\u001e\u001ek\u0007afgB`\u0006\u0004w\u0004EbEY?gB'[\u001am\u001eK%@_\u000f";
        objectArray[107] = "zgE\t,\u0017\u007fdT\u0016\u0015\u0011\u0002`\u001dHp\u0000ag\u001f\u000b-H\u0002 W\u0016t\u001ao _\u0019ox";
        objectArray[108] = "',\u001c39\u000b- I~FV \"\u0017(*dsfH~F\\*,\fwy\u000b|/IO";
        objectArray[109] = ">[\u0018\u007fw_%\u001a\u00025\u0011\fZ^Crt\u001d9YA1)UZ\u0003D/!\u0003`\u0018\u00055ke";
        objectArray[110] = "\f0\u000b(X\fMe\u0003#2]1lZrWLRkX1\n\u00041h\u0000wXV\u000e4X7I4";
        objectArray[111] = "\f\u007f~w\u0004\u007f\\rq:frWqx&1!\u0007\"-J]$Ibfz\ndGw";
        objectArray[112] = "m\u0003(\tV2\"W3\u0003)39\n?\u000ew49\u0010;r\u0018bdV8CI--\u001cV";
        objectArray[113] = "h]\rgfQ8\u0019\u000b9f*<dW=>O)\u0007P?}\u0012ad\u0002joH/\u001f\u001claDQ";
        objectArray[114] = "h\nr]\u0003;)_zVijUV#\u0007\f{6Q!DQ3U\u0003tV\u000b}.\u001drX\u0007\u0003";
        objectArray[115] = "\u0005:\u0002 ?h\u0007%E2Qv\u000b>^9=D\\y\u0002nh\u0013\n.R</h\u0014(\\0Q*\u001a\"E<(#\u00189\u0000^";
        Object[] objectArray2 = objectArray;
        objectArray[116] = "29P`\u0013\u001785\u0005-lA9&_p;\u0011`r\u0004\u001cW\u0017'5A,\u0000W) ";
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void l(Object[] var1_1) {
        block16: {
            block17: {
                block13: {
                    block14: {
                        block15: {
                            var2_2 = (Long)var1_1[0];
                            var4_3 = (var2_2 = eo_0.m ^ var2_2) ^ 115247237112293L;
                            v0 = new Object[1];
                            v0[0] = var4_3;
                            var7_4 = eo_0.c("\u00ea", (Object)eo_0.c("\u00ea", (Object)new N((class_304)eo_0.c("\u00c3", (Object)eo_0.c("\u00c3", (Object)eo_0.b, (long)2443353856134564975L, (long)var2_2), (long)2442046767175384510L, (long)var2_2)), (Object)v0, (long)2441852822047859441L, (long)var2_2), (long)2442333598119631180L, (long)var2_2);
                            var6_5 = eo_0.c("\u00aa", (long)2443094719730266406L, (long)var2_2);
                            try {
                                try {
                                    try {
                                        try {
                                            v1 = var7_4;
                                            v2 /* !! */  = eo_0.b("e", (int)23538, (long)(1820515460552575428L ^ var2_2));
                                            if (var6_5 != null) break block13;
                                            if (v1 < v2 /* !! */ ) {
                                            }
                                            ** GOTO lbl42
                                        }
                                        catch (MatchException v3) {
                                            throw eo_0.c("\u00aa", (Object)v3, (long)2441074538059959164L, (long)var2_2);
                                        }
                                        v4 /* !! */  = eo_0.c("\u00aa", (long)eo_0.c("\u00ea", (Object)eo_0.c("\u00ea", (Object)eo_0.b, (long)2449918112878515301L, (long)var2_2), (long)2449495438138061036L, (long)var2_2), (int)var7_4, (long)2442945080778607106L, (long)var2_2);
                                        if (var6_5 != null) break block14;
                                    }
                                    catch (MatchException v5) {
                                        throw eo_0.c("\u00aa", (Object)v5, (long)2441074538059959164L, (long)var2_2);
                                    }
                                    if (v4 /* !! */  != 1) break block15;
                                }
                                catch (MatchException v6) {
                                    throw eo_0.c("\u00aa", (Object)v6, (long)2441074538059959164L, (long)var2_2);
                                }
                                v4 /* !! */  = (CallSite)1;
                                break block14;
                            }
                            catch (MatchException v7) {
                                throw eo_0.c("\u00aa", (Object)v7, (long)2441074538059959164L, (long)var2_2);
                            }
                        }
                        v4 /* !! */  = (CallSite)0;
                    }
                    var8_6 = v4 /* !! */ ;
                    try {
                        try {
                            if (var6_5 == null) break block16;
lbl42:
                            // 2 sources

                            v1 = eo_0.c("\u00aa", (long)eo_0.c("\u00ea", (Object)eo_0.c("\u00ea", (Object)eo_0.b, (long)2449918112878515301L, (long)var2_2), (long)2449495438138061036L, (long)var2_2), (int)var7_4, (long)2444066303757924153L, (long)var2_2);
                            if (var6_5 != null) break block17;
                        }
                        catch (MatchException v8) {
                            throw eo_0.c("\u00aa", (Object)v8, (long)2441074538059959164L, (long)var2_2);
                        }
                        v2 /* !! */  = (CallSite)1;
                    }
                    catch (MatchException v9) {
                        throw eo_0.c("\u00aa", (Object)v9, (long)2441074538059959164L, (long)var2_2);
                    }
                }
                v1 = v1 == v2 /* !! */  ? (Object)1 : (Object)0;
            }
            var8_6 = v1;
        }
        eo_0.c("\u00ea", (Object)eo_0.c("\u00c3", (Object)eo_0.c("\u00c3", (Object)eo_0.b, (long)2443353856134564975L, (long)var2_2), (long)2442046767175384510L, (long)var2_2), (boolean)var8_6, (long)2444889152766370743L, (long)var2_2);
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = eo_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c3' || c == '\u00e7' || c == 'h' || c == '\u00d5') {
                field = eo_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c3' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e7' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'h' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = eo_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ea' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00aa' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        return eo_0.c("\u00aa", (Object)((Object)q_0.Sword), (Object)((Object)q_0.UHC), (long)-2445139463763300150L, (long)l);
    }

    private boolean a(Object[] objectArray) {
        Object object;
        block6: {
            block7: {
                CallSite callSite;
                class_243 class_2432;
                long l;
                long l2;
                long l3;
                class_1657 class_16572;
                block5: {
                    Object object2;
                    block4: {
                        class_16572 = (class_1657)objectArray[0];
                        l3 = (Long)objectArray[1];
                        long l4 = l3 = m ^ l3;
                        l2 = l4 ^ 0x260E9EDFD671L;
                        l = l4 ^ 0x701E2C9BF560L;
                        class_2432 = new class_243((double)(eo_0.c("\u00ea", (Object)class_16572, (long)4255006995024130351L, (long)l3) - eo_0.c("\u00c3", (Object)class_16572, (long)4252551990682915199L, (long)l3)), (double)(eo_0.c("\u00ea", (Object)class_16572, (long)4252617015687427097L, (long)l3) - eo_0.c("\u00c3", (Object)class_16572, (long)4256940442429544058L, (long)l3)), (double)(eo_0.c("\u00ea", (Object)class_16572, (long)4255577927627360269L, (long)l3) - eo_0.c("\u00c3", (Object)class_16572, (long)4253337591963363925L, (long)l3)));
                        callSite = eo_0.c("\u00aa", (long)4254656270021733322L, (long)l3);
                        reference var11_8 = eo_0.c("\u00ea", (Object)class_2432, (long)4254043611454863661L, (long)l3);
                        try {
                            reference cfr_temp_0 = var11_8 - (double)(eo_0.c("\u00ea", (Object)((Float)((Object)eo_0.c("\u00ea", (Object)this.d, (long)4254111339310430887L, (long)l3))), (long)4251692395206103833L, (long)l3) / 10.0f);
                            object2 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                            if (callSite != null) break block4;
                            if (object2 >= 0) break block5;
                        }
                        catch (MatchException matchException) {
                            throw eo_0.c("\u00aa", (Object)matchException, (long)4254915085782192528L, (long)l3);
                        }
                        object2 = 0;
                    }
                    return (boolean)object2;
                }
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l;
                Object[] objectArray3 = new Object[2];
                objectArray3[1] = l2;
                objectArray3[0] = class_16572;
                CallSite callSite2 = eo_0.c("\u00ea", (Object)eo_0.c("\u00ea", (Object)eo_0.c("\u00aa", (Object)objectArray2, (long)4253859518405788220L, (long)l3), (Object)eo_0.c("\u00aa", (Object)objectArray3, (long)4253273623693008854L, (long)l3), (long)4255173746967378011L, (long)l3), (long)4255405939938825928L, (long)l3);
                CallSite callSite3 = eo_0.c("\u00ea", (Object)class_2432, (long)4255405939938825928L, (long)l3);
                reference var15_11 = eo_0.c("\u00ea", (Object)callSite3, (Object)callSite2, (long)4254462495432820963L, (long)l3);
                try {
                    reference cfr_temp_1 = var15_11 - 0.0;
                    object = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 > 0 ? 1 : -1);
                    if (callSite != null) break block6;
                    if (object <= 0) break block7;
                }
                catch (MatchException matchException) {
                    throw eo_0.c("\u00aa", (Object)matchException, (long)4254915085782192528L, (long)l3);
                }
                object = 1;
                break block6;
            }
            object = 0;
        }
        return (boolean)object;
    }

    @bP
    public void a(aK aK2) {
        block4: {
            long l;
            long l2;
            block5: {
                l2 = m ^ 0x110367495295L;
                l = l2 ^ 0x7192874F37L;
                CallSite callSite = eo_0.c("\u00aa", (long)5817768510276812925L, (long)l2);
                try {
                    try {
                        if (callSite != null) break block4;
                        if (eo_0.c("\u00ea", (Object)eo_0.c("\u00c3", (Object)b, (long)5811172629643036194L, (long)l2), (long)5817104484408722944L, (long)l2) == false) break block5;
                    }
                    catch (MatchException matchException) {
                        throw eo_0.c("\u00aa", (Object)matchException, (long)5817296451452533287L, (long)l2);
                    }
                    eo_0.c("\u00ea", (Object)aK2, (Object)new Object[0], (long)5811215816512441734L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw eo_0.c("\u00aa", (Object)matchException, (long)5817296451452533287L, (long)l2);
                }
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l;
            eo_0.c("\u00ea", (Object)this.i, (Object)objectArray, (long)5815202174518294848L, (long)l2);
        }
    }

    @bP
    public void a(bg_0 bg_02) {
        block23: {
            CallSite callSite;
            CallSite callSite2;
            long l;
            long l2;
            block25: {
                CallSite callSite3;
                block26: {
                    CallSite callSite4;
                    CallSite callSite5;
                    long l3;
                    block24: {
                        Object object;
                        block22: {
                            block20: {
                                block21: {
                                    long l4 = l2 = m ^ 0x59E0331623DAL;
                                    l = l4 ^ 0x4892C6D83E78L;
                                    l3 = l4 ^ 0x7E302D8D93D9L;
                                    callSite5 = eo_0.c("\u00aa", (long)2446463132032282930L, (long)l2);
                                    try {
                                        if (eo_0.c("\u00c3", (Object)b, (long)2446064635284176158L, (long)l2) == null) {
                                            return;
                                        }
                                    }
                                    catch (MatchException matchException) {
                                        throw eo_0.c("\u00aa", (Object)matchException, (long)2446713187524447080L, (long)l2);
                                    }
                                    try {
                                        try {
                                            object = eo_0.c("\u00ea", (Object)bg_02, (Object)new Object[0], (long)2449928129599634031L, (long)l2) instanceof class_2724;
                                            if (callSite5 != null) break block20;
                                            if (object == 0) break block21;
                                        }
                                        catch (MatchException matchException) {
                                            throw eo_0.c("\u00aa", (Object)matchException, (long)2446713187524447080L, (long)l2);
                                        }
                                        this.k = 0;
                                        eo_0.l = 0;
                                        return;
                                    }
                                    catch (MatchException matchException) {
                                        throw eo_0.c("\u00aa", (Object)matchException, (long)2446713187524447080L, (long)l2);
                                    }
                                }
                                object = eo_0.c("\u00ea", (Object)bg_02, (Object)new Object[0], (long)2449928129599634031L, (long)l2) instanceof class_2616;
                            }
                            try {
                                try {
                                    if (callSite5 != null) break block22;
                                    if (object == 0) break block23;
                                }
                                catch (MatchException matchException) {
                                    throw eo_0.c("\u00aa", (Object)matchException, (long)2446713187524447080L, (long)l2);
                                }
                                object = eo_0.c("\u00ea", (Object)((class_2616)eo_0.c("\u00ea", (Object)bg_02, (Object)new Object[0], (long)2449928129599634031L, (long)l2)), (long)2446546793898484627L, (long)l2);
                            }
                            catch (MatchException matchException) {
                                throw eo_0.c("\u00aa", (Object)matchException, (long)2446713187524447080L, (long)l2);
                            }
                        }
                        int n = object;
                        callSite2 = eo_0.c("\u00ea", (Object)eo_0.c("\u00c3", (Object)b, (long)2446064635284176158L, (long)l2), (int)n, (long)2447042542228363028L, (long)l2);
                        try {
                            try {
                                callSite4 = callSite2;
                                if (callSite5 != null) break block24;
                                if (!(callSite4 instanceof class_1657)) break block23;
                            }
                            catch (MatchException matchException) {
                                throw eo_0.c("\u00aa", (Object)matchException, (long)2446713187524447080L, (long)l2);
                            }
                            callSite4 = eo_0.c("\u00ea", (Object)this.c, (long)2445918235528798303L, (long)l2);
                        }
                        catch (MatchException matchException) {
                            throw eo_0.c("\u00aa", (Object)matchException, (long)2446713187524447080L, (long)l2);
                        }
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = l3;
                    objectArray[0] = Float.valueOf((float)eo_0.c("\u00ea", (Object)((Float)((Object)callSite4)), (long)2448002856161790433L, (long)l2));
                    callSite3 = eo_0.c("\u00aa", (Object)objectArray, (long)2447572454507205783L, (long)l2);
                    try {
                        callSite = callSite3;
                        if (callSite5 != null) break block25;
                        if (callSite != null) break block26;
                    }
                    catch (MatchException matchException) {
                        throw eo_0.c("\u00aa", (Object)matchException, (long)2446713187524447080L, (long)l2);
                    }
                    return;
                }
                callSite = callSite3;
            }
            try {
                if (eo_0.c("\u00ea", (Object)callSite, (Object)callSite2, (long)2447505163419476447L, (long)l2) != false) {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l;
                    eo_0.c("\u00ea", (Object)this.h, (Object)objectArray, (long)2449104366672709647L, (long)l2);
                }
            }
            catch (MatchException matchException) {
                throw eo_0.c("\u00aa", (Object)matchException, (long)2446713187524447080L, (long)l2);
            }
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @bP
    public void a(by_0 var1_1) {
        block18: {
            block17: {
                block15: {
                    block16: {
                        v0 = var2_2 = eo_0.m ^ 71227633778089L;
                        var4_3 = v0 ^ 94230445235288L;
                        var6_4 = v0 ^ 123721547507625L;
                        var8_5 = v0 ^ 89838032330763L;
                        var10_6 = v0 ^ 42486167365089L;
                        var12_7 = eo_0.c("\u00aa", (long)4575811593237344065L, (long)var2_2);
                        try {
                            if (eo_0.c("\u00ea", (Object)((Boolean)eo_0.c("\u00ea", (Object)this.f, (long)4576427475751484972L, (long)var2_2)), (long)4577150875805968626L, (long)var2_2) == false) {
                                return;
                            }
                        }
                        catch (MatchException v1) {
                            throw eo_0.c("\u00aa", (Object)v1, (long)4577734789489071387L, (long)var2_2);
                        }
                        try {
                            try {
                                v2 /* !! */  = var1_1.a;
                                if (var12_7 != null) break block15;
                                if (v2 /* !! */  == eo_0.c("\u00c3", (Object)eo_0.b, (long)4582763859531458846L, (long)var2_2)) break block16;
                            }
                            catch (MatchException v3) {
                                throw eo_0.c("\u00aa", (Object)v3, (long)4577734789489071387L, (long)var2_2);
                            }
                            return;
                        }
                        catch (MatchException v4) {
                            throw eo_0.c("\u00aa", (Object)v4, (long)4577734789489071387L, (long)var2_2);
                        }
                    }
                    v5 = new Object[1];
                    v5[0] = var8_5;
                    eo_0.c("\u00ea", (Object)this.j, (Object)v5, (long)4580141398585218684L, (long)var2_2);
                    this.k = 1;
                    eo_0.l = 1;
                    v6 = new Object[1];
                    v6[0] = var4_3;
                    eo_0.c("\u00ea", (Object)this, (Object)v6, (long)4579678492774981399L, (long)var2_2);
                    v2 /* !! */  = eo_0.c("\u00ea", (Object)this.g, (long)4576427475751484972L, (long)var2_2);
                }
                try {
                    v7 = eo_0.c("\u00ea", (Object)((Boolean)v2 /* !! */ ), (long)4577150875805968626L, (long)var2_2);
                    if (var12_7 != null) break block17;
                    if (v7 == false) break block18;
                }
                catch (MatchException v8) {
                    throw eo_0.c("\u00aa", (Object)v8, (long)4577734789489071387L, (long)var2_2);
                }
                v7 = var13_8 = (reference)0;
            }
            while (var13_8 < eo_0.b("e", (int)26655, (long)(2617332060256298063L ^ var2_2))) {
                block19: {
                    try {
                        v9 = new Object[2];
                        v9[1] = var6_4;
                        v9[0] = eo_0.c("\u00ea", (Object)eo_0.c("\u00ea", (Object)eo_0.c("\u00c3", (Object)eo_0.b, (long)4582763859531458846L, (long)var2_2), (long)4579762681026652560L, (long)var2_2), (int)var13_8, (long)4576257625033928252L, (long)var2_2);
                        v10 = eo_0.c("\u00aa", (Object)v9, (long)4576536640178980207L, (long)var2_2);
                        if (var12_7 != null) break block19;
                        if (v10 != false) {
                        }
                        ** GOTO lbl69
                    }
                    catch (MatchException v11) {
                        throw eo_0.c("\u00aa", (Object)v11, (long)4577734789489071387L, (long)var2_2);
                    }
                    v10 = var13_8;
                }
                try {
                    v12 = new Object[2];
                    v12[1] = var10_6;
                    v12[0] = (int)v10;
                    eo_0.c("\u00aa", (Object)v12, (long)4579226119655534294L, (long)var2_2);
                    if (var12_7 == null) break;
lbl69:
                    // 2 sources

                    ++var13_8;
                    if (var12_7 == null) continue;
                    break;
                }
                catch (MatchException v13) {
                    throw eo_0.c("\u00aa", (Object)v13, (long)4577734789489071387L, (long)var2_2);
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @bP
    public void a(bd_0 var1_1) {
        block101: {
            block105: {
                block102: {
                    block103: {
                        block104: {
                            block99: {
                                block97: {
                                    block98: {
                                        block95: {
                                            block96: {
                                                block93: {
                                                    block94: {
                                                        block92: {
                                                            block90: {
                                                                block89: {
                                                                    block87: {
                                                                        block88: {
                                                                            block83: {
                                                                                block84: {
                                                                                    block85: {
                                                                                        v0 = var2_2 = eo_0.m ^ 47729662317845L;
                                                                                        var4_3 = v0 ^ 68292805489892L;
                                                                                        var6_4 = v0 ^ 53864565206536L;
                                                                                        var8_5 = v0 ^ 29863960219413L;
                                                                                        var10_6 = v0 ^ 27811572546529L;
                                                                                        var12_7 = v0 ^ 106596108341189L;
                                                                                        var14_8 = v0 ^ 120182866997286L;
                                                                                        var16_9 = v0 ^ 2483353893499L;
                                                                                        var18_10 = v0 ^ 13988491093270L;
                                                                                        var20_11 = v0 ^ 108611230006968L;
                                                                                        var22_12 = v0 ^ 24672406961686L;
                                                                                        var24_13 = eo_0.c("\u00aa", (long)6286154032161015805L, (long)var2_2);
                                                                                        try {
                                                                                            block86: {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                v1 = this;
                                                                                                                if (var24_13 != null) break block83;
                                                                                                                if (!v1.k) break block84;
                                                                                                            }
                                                                                                            catch (MatchException v2) {
                                                                                                                throw eo_0.c("\u00aa", (Object)v2, (long)6285628865787198887L, (long)var2_2);
                                                                                                            }
                                                                                                            v3 = this;
                                                                                                            if (var24_13 != null) break block85;
                                                                                                        }
                                                                                                        catch (MatchException v4) {
                                                                                                            throw eo_0.c("\u00aa", (Object)v4, (long)6285628865787198887L, (long)var2_2);
                                                                                                        }
                                                                                                        v5 = new Object[2];
                                                                                                        v5[1] = var14_8;
                                                                                                        v5[0] = Float.valueOf(5000.0f);
                                                                                                        if (eo_0.c("\u00ea", (Object)v3.j, (Object)v5, (long)6279662500747874762L, (long)var2_2) == false) break block86;
                                                                                                    }
                                                                                                    catch (MatchException v6) {
                                                                                                        throw eo_0.c("\u00aa", (Object)v6, (long)6285628865787198887L, (long)var2_2);
                                                                                                    }
                                                                                                    this.k = 0;
                                                                                                    eo_0.l = 0;
                                                                                                    if (var24_13 == null) break block84;
                                                                                                }
                                                                                                catch (MatchException v7) {
                                                                                                    throw eo_0.c("\u00aa", (Object)v7, (long)6285628865787198887L, (long)var2_2);
                                                                                                }
                                                                                            }
                                                                                            v3 = this;
                                                                                        }
                                                                                        catch (MatchException v8) {
                                                                                            throw eo_0.c("\u00aa", (Object)v8, (long)6285628865787198887L, (long)var2_2);
                                                                                        }
                                                                                    }
                                                                                    v9 = new Object[1];
                                                                                    v9[0] = var4_3;
                                                                                    eo_0.c("\u00ea", (Object)v3, (Object)v9, (long)6283122896517150635L, (long)var2_2);
                                                                                    return;
                                                                                }
                                                                                v1 = eo_0.c("\u00ea", (Object)this.c, (long)6286698687072523920L, (long)var2_2);
                                                                            }
                                                                            v10 = new Object[2];
                                                                            v10[1] = var18_10;
                                                                            v10[0] = Float.valueOf((float)eo_0.c("\u00ea", (Object)((Float)v1), (long)6284350141766647598L, (long)var2_2));
                                                                            var25_14 = eo_0.c("\u00aa", (Object)v10, (long)6285042270146765400L, (long)var2_2);
                                                                            try {
                                                                                v11 = new Object[2];
                                                                                v11[1] = var14_8;
                                                                                v11[0] = Float.valueOf(100.0f);
                                                                                if (eo_0.c("\u00ea", (Object)this.i, (Object)v11, (long)6279662500747874762L, (long)var2_2) == false) {
                                                                                    return;
                                                                                }
                                                                            }
                                                                            catch (MatchException v12) {
                                                                                throw eo_0.c("\u00aa", (Object)v12, (long)6285628865787198887L, (long)var2_2);
                                                                            }
                                                                            try {
                                                                                if (var25_14 == null) {
                                                                                    v13 = new Object[1];
                                                                                    v13[0] = var4_3;
                                                                                    eo_0.c("\u00ea", (Object)this, (Object)v13, (long)6283122896517150635L, (long)var2_2);
                                                                                    return;
                                                                                }
                                                                            }
                                                                            catch (MatchException v14) {
                                                                                throw eo_0.c("\u00aa", (Object)v14, (long)6285628865787198887L, (long)var2_2);
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    v15 = eo_0.c("\u00c3", (Object)eo_0.b, (long)6279518560188400034L, (long)var2_2);
                                                                                    if (var24_13 != null) break block87;
                                                                                    if (!(eo_0.c("\u00ea", (Object)v15, (Object)var25_14, (long)6285944634688981865L, (long)var2_2) > eo_0.c("\u00ea", (Object)((Float)eo_0.c("\u00ea", (Object)this.a, (long)6286698687072523920L, (long)var2_2)), (long)6284350141766647598L, (long)var2_2))) break block88;
                                                                                }
                                                                                catch (MatchException v16) {
                                                                                    throw eo_0.c("\u00aa", (Object)v16, (long)6285628865787198887L, (long)var2_2);
                                                                                }
                                                                                v17 = new Object[1];
                                                                                v17[0] = var4_3;
                                                                                eo_0.c("\u00ea", (Object)this, (Object)v17, (long)6283122896517150635L, (long)var2_2);
                                                                                return;
                                                                            }
                                                                            catch (MatchException v18) {
                                                                                throw eo_0.c("\u00aa", (Object)v18, (long)6285628865787198887L, (long)var2_2);
                                                                            }
                                                                        }
                                                                        v15 = eo_0.c("\u00c3", (Object)eo_0.b, (long)6279518560188400034L, (long)var2_2);
                                                                    }
                                                                    try {
                                                                        try {
                                                                            v19 = eo_0.c("\u00ea", (Object)eo_0.c("\u00ea", (Object)v15, (long)6283170201542924448L, (long)var2_2), (long)6286410185046592430L, (long)var2_2);
                                                                            v20 = eo_0.c("h", (long)6285896177482383119L, (long)var2_2);
                                                                            if (var24_13 != null) break block89;
                                                                            if (v19 == v20) break block90;
                                                                        }
                                                                        catch (MatchException v21) {
                                                                            throw eo_0.c("\u00aa", (Object)v21, (long)6285628865787198887L, (long)var2_2);
                                                                        }
                                                                        v19 = eo_0.c("\u00ea", (Object)eo_0.c("\u00ea", (Object)eo_0.c("\u00c3", (Object)eo_0.b, (long)6279518560188400034L, (long)var2_2), (long)6282910706335442174L, (long)var2_2), (long)6286410185046592430L, (long)var2_2);
                                                                        v20 = eo_0.c("h", (long)6285896177482383119L, (long)var2_2);
                                                                    }
                                                                    catch (MatchException v22) {
                                                                        throw eo_0.c("\u00aa", (Object)v22, (long)6285628865787198887L, (long)var2_2);
                                                                    }
                                                                }
                                                                try {
                                                                    block91: {
                                                                        try {
                                                                            try {
                                                                                if (v19 != v20) break block91;
                                                                                v23 = new Object[1];
                                                                                v23[0] = var12_7;
                                                                                v24 /* !! */  = eo_0.c("\u00aa", (Object)v23, (long)6284248814900137696L, (long)var2_2);
                                                                                if (var24_13 != null) break block92;
                                                                            }
                                                                            catch (MatchException v25) {
                                                                                throw eo_0.c("\u00aa", (Object)v25, (long)6285628865787198887L, (long)var2_2);
                                                                            }
                                                                            if (v24 /* !! */  == false) break block90;
                                                                        }
                                                                        catch (MatchException v26) {
                                                                            throw eo_0.c("\u00aa", (Object)v26, (long)6285628865787198887L, (long)var2_2);
                                                                        }
                                                                    }
                                                                    v27 = new Object[1];
                                                                    v27[0] = var4_3;
                                                                    eo_0.c("\u00ea", (Object)this, (Object)v27, (long)6283122896517150635L, (long)var2_2);
                                                                    return;
                                                                }
                                                                catch (MatchException v28) {
                                                                    throw eo_0.c("\u00aa", (Object)v28, (long)6285628865787198887L, (long)var2_2);
                                                                }
                                                            }
                                                            v29 = new Object[1];
                                                            v29[0] = var16_9;
                                                            v24 /* !! */  = eo_0.c("\u00aa", (Object)v29, (long)6284441226270451238L, (long)var2_2);
                                                        }
                                                        try {
                                                            try {
                                                                if (var24_13 != null) break block93;
                                                                if (v24 /* !! */  == false) break block94;
                                                            }
                                                            catch (MatchException v30) {
                                                                throw eo_0.c("\u00aa", (Object)v30, (long)6285628865787198887L, (long)var2_2);
                                                            }
                                                            v31 = new Object[1];
                                                            v31[0] = var4_3;
                                                            eo_0.c("\u00ea", (Object)this, (Object)v31, (long)6283122896517150635L, (long)var2_2);
                                                            return;
                                                        }
                                                        catch (MatchException v32) {
                                                            throw eo_0.c("\u00aa", (Object)v32, (long)6285628865787198887L, (long)var2_2);
                                                        }
                                                    }
                                                    v24 /* !! */  = (CallSite)(eo_0.c("\u00ea", (Object)eo_0.c("\u00ea", (Object)var25_14, (long)6285426078878843132L, (long)var2_2), (long)6286410185046592430L, (long)var2_2) instanceof class_1743);
                                                }
                                                try {
                                                    try {
                                                        if (var24_13 != null) break block95;
                                                        if (v24 /* !! */  == false) break block96;
                                                    }
                                                    catch (MatchException v33) {
                                                        throw eo_0.c("\u00aa", (Object)v33, (long)6285628865787198887L, (long)var2_2);
                                                    }
                                                    v34 = new Object[1];
                                                    v34[0] = var20_11;
                                                    eo_0.c("\u00ea", (Object)this, (Object)v34, (long)6286218476743373543L, (long)var2_2);
                                                    return;
                                                }
                                                catch (MatchException v35) {
                                                    throw eo_0.c("\u00aa", (Object)v35, (long)6285628865787198887L, (long)var2_2);
                                                }
                                            }
                                            v36 = new Object[2];
                                            v36[1] = var8_5;
                                            v36[0] = eo_0.c("\u00ea", (Object)var25_14, (long)6285426078878843132L, (long)var2_2);
                                            v24 /* !! */  = eo_0.c("\u00aa", (Object)v36, (long)6286871683830902227L, (long)var2_2);
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (var24_13 != null) break block97;
                                                        if (v24 /* !! */  != false) break block98;
                                                    }
                                                    catch (MatchException v37) {
                                                        throw eo_0.c("\u00aa", (Object)v37, (long)6285628865787198887L, (long)var2_2);
                                                    }
                                                    v38 = new Object[2];
                                                    v38[1] = var22_12;
                                                    v38[0] = eo_0.c("\u00ea", (Object)var25_14, (long)6285426078878843132L, (long)var2_2);
                                                    v24 /* !! */  = eo_0.c("\u00aa", (Object)v38, (long)6283232159699230811L, (long)var2_2);
                                                    if (var24_13 != null) break block97;
                                                }
                                                catch (MatchException v39) {
                                                    throw eo_0.c("\u00aa", (Object)v39, (long)6285628865787198887L, (long)var2_2);
                                                }
                                                if (v24 /* !! */  != false) break block98;
                                            }
                                            catch (MatchException v40) {
                                                throw eo_0.c("\u00aa", (Object)v40, (long)6285628865787198887L, (long)var2_2);
                                            }
                                            v41 = new Object[1];
                                            v41[0] = var20_11;
                                            eo_0.c("\u00ea", (Object)this, (Object)v41, (long)6286218476743373543L, (long)var2_2);
                                            return;
                                        }
                                        catch (MatchException v42) {
                                            throw eo_0.c("\u00aa", (Object)v42, (long)6285628865787198887L, (long)var2_2);
                                        }
                                    }
                                    v43 = new Object[2];
                                    v43[1] = var14_8;
                                    v43[0] = Float.valueOf(625.0f * (0.94f - eo_0.c("\u00ea", (Object)((Float)eo_0.c("\u00ea", (Object)this.e, (long)6286698687072523920L, (long)var2_2)), (long)6284350141766647598L, (long)var2_2) / 100.0f));
                                    v24 /* !! */  = eo_0.c("\u00ea", (Object)this.h, (Object)v43, (long)6279662500747874762L, (long)var2_2);
                                }
                                var26_15 /* !! */  = v24 /* !! */ ;
                                try {
                                    block100: {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                v44 = eo_0.c("\u00ea", (Object)eo_0.c("\u00c3", (Object)eo_0.b, (long)6279518560188400034L, (long)var2_2), (long)6286662608363533202L, (long)var2_2);
                                                                if (var24_13 != null) break block99;
                                                                if (v44 != false) break block100;
                                                            }
                                                            catch (MatchException v45) {
                                                                throw eo_0.c("\u00aa", (Object)v45, (long)6285628865787198887L, (long)var2_2);
                                                            }
                                                            cfr_temp_0 = eo_0.c("\u00c3", (Object)eo_0.c("\u00c3", (Object)eo_0.b, (long)6279518560188400034L, (long)var2_2), (long)6284580554592064228L, (long)var2_2) - 0.0;
                                                            v44 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                                            if (var24_13 != null) break block99;
                                                        }
                                                        catch (MatchException v46) {
                                                            throw eo_0.c("\u00aa", (Object)v46, (long)6285628865787198887L, (long)var2_2);
                                                        }
                                                        if (v44 <= 0) break block100;
                                                    }
                                                    catch (MatchException v47) {
                                                        throw eo_0.c("\u00aa", (Object)v47, (long)6285628865787198887L, (long)var2_2);
                                                    }
                                                    cfr_temp_1 = eo_0.c("\u00ea", (Object)eo_0.c("\u00c3", (Object)eo_0.b, (long)6279518560188400034L, (long)var2_2), (float)0.0f, (long)6286772208509985242L, (long)var2_2) - 0.94f;
                                                    v44 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 > 0 ? 1 : -1);
                                                    if (var24_13 != null) break block99;
                                                }
                                                catch (MatchException v48) {
                                                    throw eo_0.c("\u00aa", (Object)v48, (long)6285628865787198887L, (long)var2_2);
                                                }
                                                if (v44 <= 0) break block100;
                                            }
                                            catch (MatchException v49) {
                                                throw eo_0.c("\u00aa", (Object)v49, (long)6285628865787198887L, (long)var2_2);
                                            }
                                            v50 = new Object[1];
                                            v50[0] = var20_11;
                                            eo_0.c("\u00ea", (Object)this, (Object)v50, (long)6286218476743373543L, (long)var2_2);
                                            if (var24_13 == null) break block101;
                                        }
                                        catch (MatchException v51) {
                                            throw eo_0.c("\u00aa", (Object)v51, (long)6285628865787198887L, (long)var2_2);
                                        }
                                    }
                                    v44 = var26_15 /* !! */ ;
                                }
                                catch (MatchException v52) {
                                    throw eo_0.c("\u00aa", (Object)v52, (long)6285628865787198887L, (long)var2_2);
                                }
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                if (var24_13 != null) break block102;
                                                if (v44 != false) {
                                                }
                                                ** GOTO lbl312
                                            }
                                            catch (MatchException v53) {
                                                throw eo_0.c("\u00aa", (Object)v53, (long)6285628865787198887L, (long)var2_2);
                                            }
                                            v54 = this;
                                            if (var24_13 != null) break block103;
                                        }
                                        catch (MatchException v55) {
                                            throw eo_0.c("\u00aa", (Object)v55, (long)6285628865787198887L, (long)var2_2);
                                        }
                                        v56 = new Object[2];
                                        v56[1] = var6_4;
                                        v56[0] = var25_14;
                                        if (eo_0.c("\u00ea", (Object)v54, (Object)v56, (long)6282566402207646945L, (long)var2_2) != false) break block104;
                                    }
                                    catch (MatchException v57) {
                                        throw eo_0.c("\u00aa", (Object)v57, (long)6285628865787198887L, (long)var2_2);
                                    }
                                    cfr_temp_2 = eo_0.c("\u00ea", (Object)eo_0.c("\u00c3", (Object)eo_0.b, (long)6279518560188400034L, (long)var2_2), (Object)var25_14, (long)6285944634688981865L, (long)var2_2) - 3.0f;
                                    v44 = cfr_temp_2 == 0 ? 0 : (cfr_temp_2 < 0 ? -1 : 1);
                                    if (var24_13 != null) break block102;
                                }
                                catch (MatchException v58) {
                                    throw eo_0.c("\u00aa", (Object)v58, (long)6285628865787198887L, (long)var2_2);
                                }
                                if (v44 <= 0) {
                                }
                                ** GOTO lbl312
                            }
                            catch (MatchException v59) {
                                throw eo_0.c("\u00aa", (Object)v59, (long)6285628865787198887L, (long)var2_2);
                            }
                        }
                        v54 = this;
                    }
                    try {
                        v60 = new Object[1];
                        v60[0] = var10_6;
                        eo_0.c("\u00ea", (Object)v54, (Object)v60, (long)6285306295480574750L, (long)var2_2);
                        if (var24_13 == null) break block101;
lbl312:
                        // 3 sources

                        v44 = eo_0.c("\u00ea", (Object)eo_0.c("\u00c3", (Object)eo_0.b, (long)6279518560188400034L, (long)var2_2), (long)6286662608363533202L, (long)var2_2);
                    }
                    catch (MatchException v61) {
                        throw eo_0.c("\u00aa", (Object)v61, (long)6285628865787198887L, (long)var2_2);
                    }
                }
                try {
                    try {
                        if (var24_13 != null) break block105;
                        if (v44 == false) {
                        }
                        ** GOTO lbl342
                    }
                    catch (MatchException v62) {
                        throw eo_0.c("\u00aa", (Object)v62, (long)6285628865787198887L, (long)var2_2);
                    }
                    cfr_temp_3 = eo_0.c("\u00c3", (Object)eo_0.c("\u00c3", (Object)eo_0.b, (long)6279518560188400034L, (long)var2_2), (long)6284580554592064228L, (long)var2_2) - 0.0;
                    v44 = cfr_temp_3 == 0 ? 0 : (cfr_temp_3 < 0 ? -1 : 1);
                }
                catch (MatchException v63) {
                    throw eo_0.c("\u00aa", (Object)v63, (long)6285628865787198887L, (long)var2_2);
                }
            }
            try {
                block106: {
                    try {
                        if (v44 > 0) break block106;
                        v64 = new Object[1];
                        v64[0] = var10_6;
                        eo_0.c("\u00ea", (Object)this, (Object)v64, (long)6285306295480574750L, (long)var2_2);
                        if (var24_13 == null) break block101;
                    }
                    catch (MatchException v65) {
                        throw eo_0.c("\u00aa", (Object)v65, (long)6285628865787198887L, (long)var2_2);
                    }
                }
                v66 = new Object[1];
                v66[0] = var20_11;
                eo_0.c("\u00ea", (Object)this, (Object)v66, (long)6286218476743373543L, (long)var2_2);
            }
            catch (MatchException v67) {
                throw eo_0.c("\u00aa", (Object)v67, (long)6285628865787198887L, (long)var2_2);
            }
        }
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
            case 0 -> 60;
            case 1 -> 16;
            case 2 -> 18;
            case 3 -> 25;
            case 4 -> 47;
            case 5 -> 62;
            case 6 -> 28;
            case 7 -> 32;
            case 8 -> 5;
            case 9 -> 59;
            case 10 -> 2;
            case 11 -> 7;
            case 12 -> 63;
            case 13 -> 13;
            case 14 -> 48;
            case 15 -> 39;
            case 16 -> 24;
            case 17 -> 33;
            case 18 -> 36;
            case 19 -> 40;
            case 20 -> 58;
            case 21 -> 41;
            case 22 -> 44;
            case 23 -> 34;
            case 24 -> 21;
            case 25 -> 8;
            case 26 -> 37;
            case 27 -> 30;
            case 28 -> 27;
            case 29 -> 12;
            case 30 -> 31;
            case 31 -> 19;
            case 32 -> 55;
            case 33 -> 11;
            case 34 -> 17;
            case 35 -> 38;
            case 36 -> 49;
            case 37 -> 56;
            case 38 -> 53;
            case 39 -> 45;
            case 40 -> 42;
            case 41 -> 61;
            case 42 -> 57;
            case 43 -> 20;
            case 44 -> 15;
            case 45 -> 50;
            case 46 -> 51;
            case 47 -> 1;
            case 48 -> 9;
            case 49 -> 22;
            case 50 -> 23;
            case 51 -> 10;
            case 52 -> 46;
            case 53 -> 0;
            case 54 -> 3;
            case 55 -> 29;
            case 56 -> 54;
            case 57 -> 14;
            case 58 -> 43;
            case 59 -> 4;
            case 60 -> 6;
            case 61 -> 35;
            case 62 -> 26;
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
        eo_0.r[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = eo_0.m(l, l2);
        Object object = q[n];
        if (object instanceof String) {
            String string = r[n];
            int n2 = string.indexOf(8);
            Class clazz = eo_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = eo_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = eo_0.g(clazz3, string2, clazz2)) != null) {
                    eo_0.q[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = eo_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        eo_0.q[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = eo_0.n(817686755262502L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = eo_0.m(l, l2);
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
                clazz3 = eo_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = eo_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = eo_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        eo_0.q[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = eo_0.n(817686755262502L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = eo_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        eo_0.q[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = eo_0.n(817686755262502L, 0L);
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
        long l = (Long)objectArray[0];
        l = m ^ l;
        eo_0.c("\u00ea", (Object)eo_0.c("\u00c3", (Object)eo_0.c("\u00c3", (Object)b, (long)3149377018489620019L, (long)l), (long)3152440901003917282L, (long)l), (boolean)false, (long)3148475115649985003L, (long)l);
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
        l = m ^ l;
        eo_0.c("\u00ea", (Object)eo_0.c("\u00c3", (Object)eo_0.c("\u00c3", (Object)b, (long)-5841821598067932310L, (long)l), (long)-5843768170880519493L, (long)l), (boolean)true, (long)-5843179805820326734L, (long)l);
    }

    private boolean lambda$new$0(Boolean bl) {
        long l = m ^ 0x7FA7EB542EEFL;
        return (boolean)eo_0.c("\u00ea", (Object)((Boolean)((Object)eo_0.c("\u00ea", (Object)this.f, (long)3225848277406199146L, (long)l))), (long)3225546108458728372L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(eo_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(eo_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


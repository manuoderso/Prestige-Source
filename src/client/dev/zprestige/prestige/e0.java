/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntArrayMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  net.minecraft.class_12125
 *  net.minecraft.class_1799
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2846
 *  net.minecraft.class_2846$class_2847
 *  net.minecraft.class_5321
 *  net.minecraft.class_6880
 *  net.minecraft.class_9304
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dQ;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.f5;
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
import net.minecraft.class_12125;
import net.minecraft.class_1799;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2846;
import net.minecraft.class_5321;
import net.minecraft.class_6880;
import net.minecraft.class_9304;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class e0
extends dV {
    private dM d;
    private dQ a;
    private int c;
    private f5 e;
    private static final long k = hc.a(3120666292440958867L, -1335332230565522298L, MethodHandles.lookup().lookupClass()).a(40584818306237L);
    private static final long[] l;
    private static final Integer[] m;
    private static final Map n;
    private static final Object[] o;
    private static final String[] p;

    public e0() {
        long l = k ^ 0x735746263265L;
        long l2 = l ^ 0x4FD23FF5BEF6L;
        this.c = -1;
        this.e = new f5(l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        o = new Object[108];
        p = new String[108];
        e0.f();
        n = new HashMap(13);
        long l = k ^ 0x26DD755EE073L;
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
        String string = "N<~\u000b\u00f1\u0089\u001f\u0000{e\u00dc\u00c4R\u00cb\u00c9~";
        int n2 = "N<~\u000b\u00f1\u0089\u001f\u0000{e\u00dc\u00c4R\u00cb\u00c9~".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        e0.l = lArray;
        m = new Integer[2];
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/e0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4C1;
        if (m[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e0.l[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])e0.n.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    e0.n.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/e0", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            e0.m[n2] = n3;
        }
        return m[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = e0.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
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
            throw new RuntimeException("dev/zprestige/prestige/e0" + " : " + string + " : " + methodType.toString(), exception);
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
                l2 = l4 ^ 0x16B3E5F7FD1AL;
                l = l4 ^ 0x24080F1DA0A8L;
                CallSite callSite = e0.c("k", (long)908056771386405368L, (long)l3);
                try {
                    object = e0.c("w", (Object)class_17992, (long)908453921223988745L, (long)l3);
                    if (callSite != null) break block2;
                    if (object == false) break block3;
                }
                catch (MatchException matchException) {
                    throw e0.c("k", (Object)matchException, (long)907962202427293638L, (long)l3);
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
        e0.c("k", (Object)objectArray2, (long)901831999146359079L, (long)l3);
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l;
        objectArray3[1] = class_53212;
        objectArray3[0] = object2IntArrayMap;
        return (int)e0.c("k", (Object)objectArray3, (long)901260530052463708L, (long)l3);
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = e0.m(l, l2);
            object = o[n];
            try {
                if (!(object instanceof String)) break block2;
                e0.o[n] = clazz = Class.forName(p[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = e0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = e0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = e0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = e0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = o;
        o[0] = "\u0005R\u0001\\>b\u0013R\u0004\u0006-u\u0004\u0019\u0007\u0000!a\u0015^\u0010\u0017jwQ";
        objectArray[1] = "\tF.\u0006=#\u0002I?I^.\u0017D0\"k,\u0006W,\u000e|!";
        objectArray[2] = "}[8\u000ec{}[/Rotg\u0010/Loa`a}\u00177+";
        objectArray[3] = "E?*Q\u000e#E?=\r\u0002,_t=\u0013\u00029X\u0005hGUx";
        objectArray[4] = Boolean.TYPE;
        e0.p[4] = "java/lang/Boolean";
        objectArray[5] = "\r#,\u000fo\u001e\u001b#)U|\t\fh*Sp\u001d\u001d/=D;\u000f!";
        objectArray[6] = "]>SS\u00065(\u001eX\\\u0017zU\u0006K[\u001e3=";
        objectArray[7] = "m'e<Kum'r`Gzwlr~Gop\u001d\"#\u0016";
        objectArray[8] = "y1;eS\u0006y1,9_\tcz,'_\u001cd\u000bx\u007f\b";
        objectArray[9] = "Or8X\u001e,Or/\u0004\u0012#U9/\u001a\u00126RH\u007fBK|";
        objectArray[10] = "G\u0004\u0017\u001f7\u0010G\u0004\u0000C;\u001f]O\u0000];\nZ>R\tcJ";
        objectArray[11] = "\u001d*\tGNM\u001d*\u001e\u001bBB\u0007a\u001e\u0005BW\u0000\u0010HZ\u0011\u0015";
        objectArray[12] = "y_\u0015`\u0012\u0007y_\u0002<\u001e\bc\u0014\u0002\"\u001e\u001ddePxI_";
        objectArray[13] = Integer.TYPE;
        e0.p[13] = "java/lang/Integer";
        objectArray[14] = "=zX ;DHZS/*\u000b)TX$.Q]";
        objectArray[15] = "nYkt(\u0012\u001by`{9]zwkp=\u0007\u000e";
        objectArray[16] = Void.TYPE;
        e0.p[16] = "java/lang/Void";
        objectArray[17] = "\u001d\r`+=Eh-k$,\n\t#`/(P}";
        objectArray[18] = "\n@NJ\u001fv\u0014HT\u0005bf\u0014";
        objectArray[19] = "v,*>\u001a\u001b}#;q{\u0015v(?+";
        objectArray[20] = "F\u0005+!S\u0003F\u0005<}_\f\\N<c_\u0019[?m7\n\\\f\u00033nM\u0019wRg;\t";
        objectArray[21] = "K\nK\u0012\u001fxK\n\\N\u0013wQA\\P\u0013bV0\u0006\u000fA ";
        objectArray[22] = "\u0017 Xv\\n\u0017 O*Pa\rkO4Pt\n\u001a\u001ek\u00047";
        objectArray[23] = "U]\u001d\u0016r\u001dC]\u0018La\nT\u0016\u001bJm\u001eEQ\f]&\t`";
        objectArray[24] = "{6F7\u0007y\u000e\u0016M8\u00166o\u0018F3\u0012l\u001b";
        objectArray[25] = "\u007fU.<F\tiU+fU\u001e~\u001e(`Y\noY?w\u0012\u001dM";
        objectArray[26] = "\u0001;'{[\u000ft\u001b,tJ@\u0015\u0015'\u007fN\u001aa";
        objectArray[27] = "m\rT>y\u0000m\rCbu\u000fwFC|u\u001ap7\u0011\"\"Q";
        objectArray[28] = "\u0007\u001aK\u0019e5\u0011\u001aNCv\"\u0006QMEz6\u0017\u0016ZR1#V";
        objectArray[29] = "\u0004hC\u0019\u00056qHH\u0016\u0014y\u0010FC\u001d\u0010#d";
        objectArray[30] = "\u0004\u0006sz@#\u0004\u0006d&L,\u001eMd8L9\u0019<1g\u001b";
        objectArray[31] = "J\n\\A\u0011CJ\nK\u001d\u001dLPAK\u0003\u001dYW0\u0019]M\u0018\u0011";
        objectArray[32] = ">f]@6I>fJ\u001c:F$-J\u0002:S#\\\u0018Yk\u0012";
        objectArray[33] = "\u001dR<-\u0005\u0011hr7\"\u0014^\t|<)\u0010\u0004}";
        objectArray[34] = "m\u00147gy\rm\u0014 ;u\u0002w_ %u\u0017p.qz'\\";
        objectArray[35] = "!r)\u000fgO*}8@\u000bL$\u007f:\u000f'";
        objectArray[36] = ".|#\u0016vK8|&Le\\/7%JiH>p2]\"X8";
        objectArray[37] = "Q\u0012V\u00137I$2]\u001c&\u0006E<V\u0017\"\\1";
        objectArray[38] = "\u0000\u001a o{Du:+`j\u000b\u00144 knQ`";
        objectArray[39] = "|r(9Ov|r?eCyf9?{ClaHe$\u0011+";
        objectArray[40] = "\u0019Q%\u001e\u00049lq.\u0011\u0015v\r\u007f%\u001a\u0011,y";
        objectArray[41] = "6.mIEg .h\u0013Vp7ek\u0015Zd&\"|\u0002\u0011s\u0019";
        objectArray[42] = "_:Y`u+I:\\:f<^q_<j(O6H+!8\b";
        objectArray[43] = "p n6Z\"\u0005\u0000e9Kmd\u000en2O7\u0010";
        objectArray[44] = "R!B``\u0018L)X/\u0007\u0019]2Uu!\u001f";
        objectArray[45] = "A\u000b/|:rE\u0016/m'r\u0006\u0019`z n\\\u0016m';yB\u001ab}'5g\u001dkl7oa\u000bd{5yD\u001a";
        objectArray[46] = "\u0010354\u0016o\u0014.5%\u000boW!z2\fs\r.wo\u0017d\u0013\"x5\u000b(6%q$\u001br03~3\u0019r\u00165";
        objectArray[47] = "\r?MGE\u0011\t\"MVX\u0011J-\u0002A_\r\u0010\"\u000f\u001cD\u001a\u000e.\u0000FXV+)\tWH\fV\u0002\rFf\u0019\u0014o&\\_\n\u001d";
        objectArray[48] = "p0\u0014(W\u0007t-\u00149J\u00077\"[.M\u001bm-VsV\fs!Y)J@V&P8Z\u001a+\rT)t\u000fi7";
        objectArray[49] = "\t\u0007QT;z\r\u001aQE&zN\u0015\u001eR!f\u0014\u001a\u0013\u000f:q\n\u0016\u001cU&=/\u0011\u0015D6gR:\u0011U\u0018r\u0010";
        objectArray[50] = "i\u0013i{Q\u0012i\u0013~']\u001dsX~9]\bt)+m\u0004K";
        objectArray[51] = "CLojehCLx6igY\u0007x(ir^v\"w85";
        objectArray[52] = "P\u007f@%GPP\u007fWyK_J4WgKJME\u0005<\u0013\u000b";
        objectArray[53] = ".p\u001f5sD.p\bi\u007fK4;\bw\u007f^3JZ#.\u001f";
        objectArray[54] = "\u0015W;\u007f\nH@\r6B\b(PIw|\fVS\\,-jBBSt(\u0000V@YuB";
        objectArray[55] = "nV|cjbo\t\u007fd\u0018l9\u0012v<t^i^(j$\t:Wt!``(\u000eg`\u0018e-\r/j'ge\u001e*[";
        objectArray[56] = "?N,\u0004i^3_<\u0005\u0002_b\\8SU\b<\u000b`?<\u000bx\t8CrWrX";
        objectArray[57] = "\u001d{Cu\u0007\u0018\u0007(M)\u007fA\u001fz\t%\u0003G\u0019\u0017\f&\u0018\u0019_u\u0010vO\u001cc";
        objectArray[58] = "WM+ZB:\u0006C\u007f\u001dx.X\\q\r/y\u0000\t.Zx.E\u000f.[\u0002\u007fK[i";
        objectArray[59] = "F\u0001GL&yG^DKTw\u0011EM\u00138EA\t\u0013Ik\u0012\u000eT\\Idv\u0002]\u0014KT";
        objectArray[60] = "G\u000fNKlnW\u001a\u0019@\u001ef(\u0016YD jV\u0015L\u001fq\fB\u0004CGtfV\u0006IF\u001e";
        objectArray[61] = "X\u001cAlE\\F\u0010\u0006;?TA\u0005\u0007\u0017CWR\u0017\u00112R:YC\u001c(E\u000bI\u0018\u0015??DDNB.\u0007^\u0017@\u001eV";
        objectArray[62] = "2G\u0019vGHg\u001d\u0014KK(wYUuAVtL\u000e$'\u0019hO\u0007!\u001c\u0015k\\\u0012K";
        objectArray[63] = "t}`u!Vl9n)FT\u0014y\"px[jz7+)=~k8s,Wji2rF";
        objectArray[64] = "9\u000b\u001a%Xp#\t\u0013/*u-\u0017,.ZiDW\u0005!Ey-\u001eUrX\u0015";
        objectArray[65] = ":OWM}Ft\u0013]\u001c\u0019_i\tL\u0012um:L\u0015H\u0019\u0001k\u0017C\u0019pH;D^u";
        objectArray[66] = "\u00067\u000f\t%i\t4\u0003[Y|\u001a5\u000e\f5NKqTQd\u0019Gy\u0004ZfcI2\u0003RY\"\u0018+\u0001\u00070kHx\u001ck";
        objectArray[67] = "9\u0012S\u000f00lH^2;P|\f\u001f\f6.\u007f\u0019D]Pac\u001aMXkm`\tX2";
        objectArray[68] = "VWP!M\u000eJ\rYt,\u001a_\u0017I,@(\rV\u0015s\u0013\u007fV\u0017\u00174C\u001dP\u0016Y.,\u0015\\\r\u0014!F\u0001^\u0007\u0015K";
        objectArray[69] = "\"IX\u000bW\u000f%O\rXh\u001a*L\u0004U\u0004(x\rT\fhN$Z\bXSB'I\u001d2";
        objectArray[70] = "\u0003\n<+y_\u000f\u0003t)IU\u0010\n)z\u001e\u0007@\\}+II\u001c\u0016p&-E\u0015^r";
        objectArray[71] = "t4VU<Wwr\tM\u0002P\u0017p\u001b\u0014<\\is\u000eOm:,c\u0005EnSe3VX\u0002";
        objectArray[72] = ".s@.d=%m\u0018/\u001d>){\u001a#Jip'Nw\u001d6-(\u001f6p=3p\u001e";
        objectArray[73] = ":\u0019A\b_.;\u001f\u000f\u0017 0!J\u001b\nwbq\u0019C] 0yE\u0005\u001eI\" VD";
        objectArray[74] = "[&h\")S\u0015zbsMJ\b`s}!xZ'/&MJ\u001c *%=M\u001auy\u001a";
        objectArray[75] = "x!\t\u0003OP#%P]r\\x!SR\u001bPA/SB\u001f6$)UP\u001e_my\u0006Mr";
        objectArray[76] = "HpT\f\u00164Iv\u001a\u0013i*S#\u000e\u000e>z\tpQ[i*\u000b,\u0010\u001a\u00008R?Q";
        objectArray[77] = "bOq\u0007.\u0000\"M+\u0004_\b?Av\u00113:o\u0001-F_\\1Wz\u001cdP2DoveU8\u0005d\u001dd\n;\u0002\u0016";
        objectArray[78] = ":\u000f\r4\n<x\u0015\u001a8cjA\u0019\u0018>Z2~\u001bP-_\u0003";
        objectArray[79] = "\u0019Sg*|c\u000eY4'MleO#psc\u001bL6+\"\u0005\u000f]9s'o\u001b_3rM";
        objectArray[80] = "\u0005HCp\u0011\u000e\f\u000e\u0003)u\u0004\t\u001f\u001c$\"TSKFuu\u0007RI@,\u0011\u000e\u0014\t\u0019";
        objectArray[81] = "(\t(\u001dVMu\u0000c_3U\u0013P.M]\u0001m\u000b1JM?";
        objectArray[82] = "No*{[zUx-n*v\\h\u000bo[\u0019]m+;\u001b&_%8>*";
        objectArray[83] = "\\}wC\u0014x]\"tDfv\u000b9}\u001c\nDYt%Jf*^$&\u0012\u0019/]uvCf";
        objectArray[84] = "^TOk[\u0010_\u000bLl)\u001e\t\u0010E4E,[]\u001bk)@\u000b\u000eJ?@\t[]WS";
        objectArray[85] = "\u001c.}PmfNl'M\\7\u000b:dT 1\rWcZ,0\u00052yX%:w";
        objectArray[86] = "\u0019\u000f\u0015\rK5U\u001c\u001a\u001c4$F\u001d\u001c\u0013ct\u001cJE@4pBK\u0016\u0003Ow\u001f\bH";
        objectArray[87] = "p\t\u001e3~\u001f-T\u001dz\u0003\u000fs^\u001a-T\\\"\u000bNAa[rA\u0003?<\u0006q\b";
        objectArray[88] = "q\u000fOV!]?SE\u0007ED\"IT\t)vq\r\bQE\u001bw_\f\u001c.\u001a(\\\u000bn";
        objectArray[89] = ".H\u000bE\u001d\u0014`\u0014\u0001\u0014y\r}\u000e\u0010\u001a\u0015?+KMAIh \u0000\u0017\f\b\u0005`\u0002M\u000fy";
        objectArray[90] = "NCx|Z\"UT\u007fi+.\\D[cW\u001fX\\gh+pRRvo\u0010|QAc\u0005";
        objectArray[91] = "`Q12l@a\u000e25\u001eN7\u0015;mr|gYe;#+4P9pfB&\t*1\u001eG#\nb;!Ek\u0019g\nrR9Pj5p\u001a*U[";
        objectArray[92] = "\u0002u=\u0011Pm\u00013b\tnia1pPPf\u001f2e\u000b\u0001\u0000\u000b#jS\u0004j\u001f!`Rn";
        objectArray[93] = ",\u001f\u0000!\r/ \u0016H#=.3\u000e\u0011{Q\u001ccML'\fK5\u000b\u0012q\f{gIHl=";
        objectArray[94] = "\u001f'a\u001b\u0016:\u0003}hNw.\u0016gx\u0016\u001b\u001cA*\"Awp\u0014yw\u001d\u001e9D*jq";
        objectArray[95] = "o%\\JBd:\u007fQwK\u0004oxW\u001c\u001eji%\u0015\u0012\"=i>EKL;4|Kw";
        objectArray[96] = "\u000bPix?\b\n\u000fj\u007fM\u0006\\\u0014c'!4\nQ>\u007fvc\u000b\r8.1\u0018\fP{pMX^\nl,$\u0011\u000eYq@";
        objectArray[97] = "T>9PBjN<0Z0iD)56\\vJ`x\t^>YeI";
        objectArray[98] = "\u000e\u0013\u0002Ix8\u000eAIB\u00170v\u0006D\u0006)?\b\u0005Q]xY\u001c\u0014^\u0005}3\b\u0016T\u0004\u0017";
        objectArray[99] = "u0'<,w j*\u0001%\u00170.k?*i3;0nL&/89kw*,+,\u0001";
        objectArray[100] = "TnZ\u001a?\u0000\u00147R\u001e5;\u00036[\u0015>l]j\u0007AR\u0002U6\r\u0018-\u0007Vg]I";
        objectArray[101] = ";s?}\u0003\u001d+(6jyG.#1yyF$(ei\u0013R&\"d\u0003";
        objectArray[102] = "-\u0012v\u0011[|c\u001f+@9bs\u0011~Fn2)@ \u00129<\"\u0016+\u0015C2i\u0011#";
        objectArray[103] = "B\u00130wGfBA{|(n:\u0006v8\u0016aD\u0005ccG\u0007\u000b\u0019`jB<\u0007\u001as\u007f(";
        objectArray[104] = "#\u001cM\u001ayz/\r]\u001b\u0012{~\u000eYME, ]\u0004!v)f\t\\Pjso\\";
        objectArray[105] = "jO\u0016\u0006^\u0002$\u0013\u001cW:\u001b9\t\rYV)jLU\u0002:\u001cn\u0015\u001fCDA3\u0016V>P\u00102H\u0007TD\u00128Im";
        objectArray[106] = "I'Q_\u0004 \u001be\u000bB5wL^^KV)\u0013a\\\u0003E,\"5KQX!\u0012g\t\u000bE\u0010";
        Object[] objectArray2 = objectArray;
        objectArray[107] = "\u000e\u0014\u000b:1\u0004\u001eO\u0002-KM\u0002Ul(2VF\u0018S*zEC)]'!Y\u0015\u0012Q$2L\u007f\u0018\u000f.'_D\u0014\f=25";
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = e0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e0' || c == '\u00d4' || c == '\u00e8' || c == '\u00e7') {
                field = e0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e0' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d4' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = e0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'w' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'k' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
            CallSite callSite = e0.c("w", (Object)e0.c("k", (Object)object2IntMap, (long)-2655136422558910851L, (long)l), (long)-2655410611879483772L, (long)l);
            CallSite callSite2 = e0.c("k", (long)-2649207613738899874L, (long)l);
            while (e0.c("w", (Object)callSite, (long)-2650274382684063748L, (long)l) != false) {
                block9: {
                    CallSite callSite3;
                    block8: {
                        Object2IntMap.Entry entry = (Object2IntMap.Entry)e0.c("w", (Object)callSite, (long)-2652576975543831293L, (long)l);
                        try {
                            try {
                                try {
                                    object = e0.c("w", (Object)((class_6880)e0.c("w", (Object)entry, (long)-2648967119965765998L, (long)l)), (Object)class_53212, (long)-2650125315030881528L, (long)l);
                                    if (callSite2 != null) break block7;
                                    if (callSite2 != null) break block8;
                                }
                                catch (MatchException matchException) {
                                    throw e0.c("k", (Object)matchException, (long)-2648198268728498080L, (long)l);
                                }
                                if (object == 0) break block9;
                            }
                            catch (MatchException matchException) {
                                throw e0.c("k", (Object)matchException, (long)-2648198268728498080L, (long)l);
                            }
                            callSite3 = e0.c("w", (Object)entry, (long)-2648437670360578613L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw e0.c("k", (Object)matchException, (long)-2648198268728498080L, (long)l);
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

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private int a(Object[] objectArray) {
        Object object;
        block11: {
            long l = (Long)objectArray[0];
            long l2 = (l = k ^ l) ^ 0x9DEE28BB91L;
            CallSite callSite = e0.c("k", (long)-4610213617741054617L, (long)l);
            for (int i = 0; i < e0.b("f", (int)20390, (long)(0x4FEDC94FC4A80B76L ^ l)); ++i) {
                int n;
                block15: {
                    Object object2;
                    block13: {
                        block14: {
                            block12: {
                                CallSite callSite2 = e0.c("w", (Object)e0.c("w", (Object)e0.c("\u00e0", (Object)b, (long)-4602854035539864375L, (long)l), (long)-4609650503063382002L, (long)l), (int)i, (long)-4611076767569822439L, (long)l);
                                try {
                                    try {
                                        object = e0.c("w", (Object)callSite2, (Object)e0.c("\u00e8", (long)-4610339914705903144L, (long)l), (long)-4609057285941676025L, (long)l);
                                        if (callSite != null) break block11;
                                        if (callSite != null) break block12;
                                    }
                                    catch (MatchException matchException) {
                                        throw e0.c("k", (Object)matchException, (long)-4609837595758218407L, (long)l);
                                    }
                                    if (object == 0) {
                                        continue;
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw e0.c("k", (Object)matchException, (long)-4609837595758218407L, (long)l);
                                }
                                Object[] objectArray2 = new Object[3];
                                objectArray2[2] = l2;
                                objectArray2[1] = e0.c("\u00e8", (long)-4609156793097591409L, (long)l);
                                objectArray2[0] = callSite2;
                                object2 = e0.c("k", (Object)objectArray2, (long)-4611263792420632801L, (long)l);
                            }
                            try {
                                if (callSite != null) break block13;
                                if (object2 <= 0) break block14;
                            }
                            catch (MatchException matchException) {
                                throw e0.c("k", (Object)matchException, (long)-4609837595758218407L, (long)l);
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
                        throw e0.c("k", (Object)matchException, (long)-4609837595758218407L, (long)l);
                    }
                    n = i;
                }
                return n;
            }
            object = -1;
        }
        return object;
    }

    @bP
    public void a(bG bG2) {
        e0 e02;
        long l;
        long l2;
        block44: {
            CallSite callSite;
            long l3;
            long l4;
            block43: {
                Object object;
                block41: {
                    CallSite callSite2;
                    block42: {
                        Object object2;
                        long l5;
                        block40: {
                            CallSite callSite3;
                            CallSite callSite4;
                            long l6;
                            long l7;
                            block38: {
                                block39: {
                                    block36: {
                                        block37: {
                                            block35: {
                                                int n;
                                                block31: {
                                                    block32: {
                                                        Object object3;
                                                        block33: {
                                                            block34: {
                                                                long l8 = l2 = k ^ 0x6A7F0AE59B88L;
                                                                long l9 = l8 ^ 0x338EC63C5B99L;
                                                                l4 = l8 ^ 0x29BC0F9CBB2AL;
                                                                l3 = l8 ^ 0x1400B8AAF31BL;
                                                                long l10 = l8 ^ 0x108BDFE28EEBL;
                                                                l5 = l8 ^ 0x6311A04236F1L;
                                                                l7 = l8 ^ 0x71C73A85C988L;
                                                                l = l8 ^ 0x72F92DAEA267L;
                                                                l6 = l8 ^ 0x3B3DF4508B22L;
                                                                Object[] objectArray = new Object[1];
                                                                objectArray[0] = l9;
                                                                callSite4 = e0.c("w", (Object)this, (Object)objectArray, (long)-1396481857061646425L, (long)l2);
                                                                callSite2 = e0.c("k", (long)-1400017219533205008L, (long)l2);
                                                                try {
                                                                    try {
                                                                        try {
                                                                            object2 = this.c;
                                                                            n = -1;
                                                                            if (callSite2 != null) break block31;
                                                                            if (object2 == n) break block32;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw e0.c("k", (Object)matchException, (long)-1400186537832079410L, (long)l2);
                                                                        }
                                                                        Object[] objectArray2 = new Object[2];
                                                                        objectArray2[1] = l10;
                                                                        objectArray2[0] = this.a;
                                                                        object3 = e0.c("w", (Object)this.e, (Object)objectArray2, (long)-1398491786713713569L, (long)l2);
                                                                        if (callSite2 != null) break block33;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw e0.c("k", (Object)matchException, (long)-1400186537832079410L, (long)l2);
                                                                    }
                                                                    if (object3 != false) break block34;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw e0.c("k", (Object)matchException, (long)-1400186537832079410L, (long)l2);
                                                                }
                                                                return;
                                                            }
                                                            object3 = this.c;
                                                        }
                                                        Object[] objectArray = new Object[2];
                                                        objectArray[1] = l5;
                                                        objectArray[0] = (int)object3;
                                                        e0.c("k", (Object)objectArray, (long)-1396452426591597324L, (long)l2);
                                                        this.c = -1;
                                                        Object[] objectArray3 = new Object[1];
                                                        objectArray3[0] = l4;
                                                        e0.c("w", (Object)this, (Object)objectArray3, (long)-1402422823991760524L, (long)l2);
                                                        return;
                                                    }
                                                    try {
                                                        object2 = callSite4;
                                                        if (callSite2 != null) break block35;
                                                        n = -1;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw e0.c("k", (Object)matchException, (long)-1400186537832079410L, (long)l2);
                                                    }
                                                }
                                                if (object2 == n) {
                                                    return;
                                                }
                                                object2 = e0.c("w", (Object)e0.c("\u00e0", (Object)b, (long)-1402739041429391266L, (long)l2), (long)-1398921347224718252L, (long)l2);
                                            }
                                            try {
                                                if (callSite2 != null) break block36;
                                                if (object2 == 0) break block37;
                                            }
                                            catch (MatchException matchException) {
                                                throw e0.c("k", (Object)matchException, (long)-1400186537832079410L, (long)l2);
                                            }
                                            return;
                                        }
                                        object2 = e0.c("w", (Object)e0.c("w", (Object)e0.c("\u00e0", (Object)b, (long)-1402739041429391266L, (long)l2), (long)-1399258838246417974L, (long)l2), (long)-1398601294624760067L, (long)l2);
                                    }
                                    try {
                                        callSite3 = e0.b("f", (int)7267, (long)(0x1E234E050B93F425L ^ l2));
                                        if (callSite2 != null) break block38;
                                        if (object2 >= callSite3) break block39;
                                    }
                                    catch (MatchException matchException) {
                                        throw e0.c("k", (Object)matchException, (long)-1400186537832079410L, (long)l2);
                                    }
                                    return;
                                }
                                try {
                                    Object[] objectArray = new Object[1];
                                    objectArray[0] = l6;
                                    object2 = e0.c("k", (Object)objectArray, (long)-1396208813503631060L, (long)l2);
                                    if (callSite2 != null) break block40;
                                    callSite3 = callSite4;
                                }
                                catch (MatchException matchException) {
                                    throw e0.c("k", (Object)matchException, (long)-1400186537832079410L, (long)l2);
                                }
                            }
                            try {
                                if (object2 == callSite3) {
                                    Object[] objectArray = new Object[2];
                                    objectArray[1] = l7;
                                    objectArray[0] = new class_2846((class_2846.class_2847)e0.c("\u00e8", (long)-1399952275096148356L, (long)l2), (class_2338)e0.c("\u00e8", (long)-1399357346638235919L, (long)l2), (class_2350)e0.c("\u00e8", (long)-1402599639583281700L, (long)l2));
                                    e0.c("k", (Object)objectArray, (long)-1399022732769930685L, (long)l2);
                                    Object[] objectArray4 = new Object[1];
                                    objectArray4[0] = l4;
                                    e0.c("w", (Object)this, (Object)objectArray4, (long)-1402422823991760524L, (long)l2);
                                    return;
                                }
                            }
                            catch (MatchException matchException) {
                                throw e0.c("k", (Object)matchException, (long)-1400186537832079410L, (long)l2);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l6;
                            this.c = (int)e0.c("k", (Object)objectArray, (long)-1396208813503631060L, (long)l2);
                            object2 = callSite4;
                        }
                        Object[] objectArray = new Object[2];
                        objectArray[1] = l5;
                        objectArray[0] = object2;
                        e0.c("k", (Object)objectArray, (long)-1396452426591597324L, (long)l2);
                        CallSite callSite5 = e0.c("w", (Object)e0.c("\u00e0", (Object)b, (long)-1402739041429391266L, (long)l2), (long)-1400528852619274665L, (long)l2);
                        class_12125 class_121252 = (class_12125)e0.c("w", (Object)callSite5, (Object)e0.c("\u00e8", (long)-1399072967755161213L, (long)l2), (long)-1401818389083533776L, (long)l2);
                        try {
                            try {
                                try {
                                    try {
                                        object = class_121252;
                                        if (callSite2 != null) break block41;
                                        if (object == null) break block42;
                                    }
                                    catch (MatchException matchException) {
                                        throw e0.c("k", (Object)matchException, (long)-1400186537832079410L, (long)l2);
                                    }
                                    callSite = e0.c("w", (Object)e0.c("\u00e0", (Object)b, (long)-1397109141844987846L, (long)l2), (long)-1400082241471696377L, (long)l2);
                                    if (callSite2 != null) break block43;
                                }
                                catch (MatchException matchException) {
                                    throw e0.c("k", (Object)matchException, (long)-1400186537832079410L, (long)l2);
                                }
                                if (callSite != false) break block42;
                            }
                            catch (MatchException matchException) {
                                throw e0.c("k", (Object)matchException, (long)-1400186537832079410L, (long)l2);
                            }
                            e0.c("w", (Object)e0.c("\u00e0", (Object)b, (long)-1397109141844987846L, (long)l2), (Object)class_121252, (long)-1398544138160033143L, (long)l2);
                            e0.c("w", (Object)e0.c("\u00e0", (Object)b, (long)-1402739041429391266L, (long)l2), (Object)e0.c("\u00e8", (long)-1399608293871892320L, (long)l2), (long)-1397178390381946313L, (long)l2);
                        }
                        catch (MatchException matchException) {
                            throw e0.c("k", (Object)matchException, (long)-1400186537832079410L, (long)l2);
                        }
                    }
                    try {
                        e02 = this;
                        if (callSite2 != null) break block44;
                        object = e0.c("w", (Object)e02.d, (long)-1398985324416243030L, (long)l2);
                    }
                    catch (MatchException matchException) {
                        throw e0.c("k", (Object)matchException, (long)-1400186537832079410L, (long)l2);
                    }
                }
                callSite = e0.c("w", (Object)((Boolean)object), (long)-1399290768603878571L, (long)l2);
            }
            try {
                if (callSite == false) {
                    this.c = -1;
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l4;
                    e0.c("w", (Object)this, (Object)objectArray, (long)-1402422823991760524L, (long)l2);
                    return;
                }
            }
            catch (MatchException matchException) {
                throw e0.c("k", (Object)matchException, (long)-1400186537832079410L, (long)l2);
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l3;
            e0.c("w", (Object)this.e, (Object)objectArray, (long)-1400252571220270027L, (long)l2);
            e02 = this;
        }
        Object[] objectArray = new Object[1];
        objectArray[0] = l;
        e0.c("w", (Object)e02.a, (Object)objectArray, (long)-1402518462628694364L, (long)l2);
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return e0.c("k", (Object)((Object)q_0.Spear), (long)-2442462999182265297L, (long)l);
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
            case 0 -> 30;
            case 1 -> 47;
            case 2 -> 20;
            case 3 -> 43;
            case 4 -> 40;
            case 5 -> 52;
            case 6 -> 8;
            case 7 -> 24;
            case 8 -> 34;
            case 9 -> 51;
            case 10 -> 55;
            case 11 -> 13;
            case 12 -> 19;
            case 13 -> 38;
            case 14 -> 31;
            case 15 -> 57;
            case 16 -> 44;
            case 17 -> 49;
            case 18 -> 32;
            case 19 -> 6;
            case 20 -> 3;
            case 21 -> 0;
            case 22 -> 36;
            case 23 -> 46;
            case 24 -> 63;
            case 25 -> 12;
            case 26 -> 4;
            case 27 -> 10;
            case 28 -> 35;
            case 29 -> 14;
            case 30 -> 59;
            case 31 -> 11;
            case 32 -> 9;
            case 33 -> 41;
            case 34 -> 25;
            case 35 -> 33;
            case 36 -> 7;
            case 37 -> 37;
            case 38 -> 50;
            case 39 -> 17;
            case 40 -> 15;
            case 41 -> 26;
            case 42 -> 62;
            case 43 -> 22;
            case 44 -> 45;
            case 45 -> 18;
            case 46 -> 29;
            case 47 -> 23;
            case 48 -> 5;
            case 49 -> 58;
            case 50 -> 60;
            case 51 -> 39;
            case 52 -> 28;
            case 53 -> 61;
            case 54 -> 54;
            case 55 -> 48;
            case 56 -> 42;
            case 57 -> 16;
            case 58 -> 27;
            case 59 -> 56;
            case 60 -> 2;
            case 61 -> 1;
            case 62 -> 21;
            default -> 53;
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
        e0.p[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = e0.m(l, l2);
        Object object = o[n];
        if (object instanceof String) {
            String string = p[n];
            int n2 = string.indexOf(8);
            Class clazz = e0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = e0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = e0.g(clazz3, string2, clazz2)) != null) {
                    e0.o[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = e0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        e0.o[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = e0.n(1395198311013112L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = e0.m(l, l2);
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
                clazz3 = e0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = e0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = e0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        e0.o[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = e0.n(1395198311013112L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = e0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        e0.o[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = e0.n(1395198311013112L, 0L);
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

    public static void j(Object[] objectArray) {
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
                            CallSite callSite3 = e0.c("k", (long)-8751007487978669076L, (long)l);
                            e0.c("w", (Object)object2IntMap, (long)-8754124888106303938L, (long)l);
                            callSite2 = callSite3;
                            try {
                                try {
                                    class_17992 = class_17993;
                                    if (callSite2 != null) break block9;
                                    if (e0.c("w", (Object)class_17992, (long)-8750696556589655011L, (long)l) != false) break block10;
                                }
                                catch (MatchException matchException) {
                                    throw e0.c("k", (Object)matchException, (long)-8751190000348400174L, (long)l);
                                }
                                class_17992 = class_17993;
                            }
                            catch (MatchException matchException) {
                                throw e0.c("k", (Object)matchException, (long)-8751190000348400174L, (long)l);
                            }
                        }
                        try {
                            try {
                                if (callSite2 != null) break block11;
                                if (e0.c("w", (Object)class_17992, (long)-8750860454168062134L, (long)l) != e0.c("\u00e8", (long)-8754070241129233800L, (long)l)) break block12;
                            }
                            catch (MatchException matchException) {
                                throw e0.c("k", (Object)matchException, (long)-8751190000348400174L, (long)l);
                            }
                            callSite = e0.c("w", (Object)((class_9304)e0.c("w", (Object)class_17993, (Object)e0.c("\u00e8", (long)-8752744034986126906L, (long)l), (Object)e0.c("\u00e8", (long)-8751651141841081005L, (long)l), (long)-8751453267970973501L, (long)l)), (long)-8751310564696548263L, (long)l);
                            break block13;
                        }
                        catch (MatchException matchException) {
                            throw e0.c("k", (Object)matchException, (long)-8751190000348400174L, (long)l);
                        }
                    }
                    class_17992 = class_17993;
                }
                callSite = e0.c("w", (Object)e0.c("w", (Object)class_17992, (long)-8749171837343445419L, (long)l), (long)-8751310564696548263L, (long)l);
            }
            CallSite callSite4 = callSite;
            CallSite callSite5 = e0.c("w", (Object)callSite4, (long)-8750764148624784363L, (long)l);
            while (e0.c("w", (Object)callSite5, (long)-8752068823791293874L, (long)l) != false) {
                Object2IntMap.Entry entry = (Object2IntMap.Entry)e0.c("w", (Object)callSite5, (long)-8754410602505557839L, (long)l);
                e0.c("w", (Object)object2IntMap, (Object)((class_6880)e0.c("w", (Object)entry, (long)-8750836249143909600L, (long)l)), (int)e0.c("w", (Object)entry, (long)-8751363500262074247L, (long)l), (long)-8754822560813897405L, (long)l);
                if (callSite2 == null) continue;
            }
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(e0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(e0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


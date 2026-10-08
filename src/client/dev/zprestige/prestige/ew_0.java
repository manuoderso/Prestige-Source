/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1701
 *  net.minecraft.class_2338
 *  net.minecraft.class_243
 *  net.minecraft.class_2885
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.a5;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bh_0;
import dev.zprestige.prestige.dC;
import dev.zprestige.prestige.dF;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dQ;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.ei_0;
import dev.zprestige.prestige.f5;
import dev.zprestige.prestige.gu_0;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1297;
import net.minecraft.class_1701;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2885;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.ew
 */
public class ew_0
extends dV
implements dF {
    private dQ a;
    private dO c;
    private dM d;
    private dO e;
    private dQ f;
    private dO g;
    private dM h;
    private f5 i;
    private f5 j;
    private f5 k;
    private f5 l;
    private List m;
    private class_1701 n;
    private int o;
    private int p;
    private static final long q = hc.a(-5226061638397209469L, -5805723470943901527L, MethodHandles.lookup().lookupClass()).a(13945615087760L);
    private static final long[] r;
    private static final Integer[] s;
    private static final Map t;
    private static final long[] u;
    private static final Long[] v;
    private static final Map w;
    private static final Object[] x;
    private static final String[] y;

    public ew_0() {
        long l;
        long l2 = l = q ^ 0x5010EF852DB0L;
        long l3 = l2 ^ 0x5E3A3F93FDD1L;
        long l4 = l2 ^ 0x560C2CA6EA08L;
        this.i = new f5(l3);
        this.j = new f5(l3);
        this.k = new f5(l3);
        this.l = new f5(l3);
        this.m = new ArrayList();
        this.o = -1;
        this.p = 0;
        Object[] objectArray = new Object[2];
        objectArray[1] = l4;
        objectArray[0] = this::lambda$new$0;
        ew_0.d("M", (Object)this.e, (Object)objectArray, (long)456285386552922305L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        x = new Object[161];
        y = new String[161];
        ew_0.f();
        t = new HashMap(13);
        long l = q ^ 0x76380036C408L;
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
        String string = "f\u00dd\u00bd\\V\u00d1\u00e1\u00c6&oUI\u00cf?l\u001f";
        int n2 = "f\u00dd\u00bd\\V\u00d1\u00e1\u00c6&oUI\u00cf?l\u001f".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        r = lArray;
        s = new Integer[2];
        w = new HashMap(13);
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray5 = new byte[8];
        byte[] byArray6 = byArray5;
        byArray5[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray6 = byArray6;
            byArray6[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray6)), new IvParameterSpec(new byte[8]));
        long[] lArray2 = new long[2];
        int n5 = 0;
        String string2 = "UM\u00b1\u00cd\u00b1\u0091wsO\u0096\u00f6\u0003e\u0095-\u0096";
        int n6 = "UM\u00b1\u00cd\u00b1\u0091wsO\u0096\u00f6\u0003e\u0095-\u0096".length();
        int n7 = 0;
        do {
            byte[] byArray7 = string2.substring(n7, n7 += 8).getBytes("ISO-8859-1");
            int n8 = n5++;
            long l3 = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
            byte[] byArray8 = cipher2.doFinal(new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3});
            lArray2[n8] = ((long)byArray8[0] & 0xFFL) << 56 | ((long)byArray8[1] & 0xFFL) << 48 | ((long)byArray8[2] & 0xFFL) << 40 | ((long)byArray8[3] & 0xFFL) << 32 | ((long)byArray8[4] & 0xFFL) << 24 | ((long)byArray8[5] & 0xFFL) << 16 | ((long)byArray8[6] & 0xFFL) << 8 | (long)byArray8[7] & 0xFFL;
        } while (n7 < n6);
        u = lArray2;
        v = new Long[2];
    }

    @Override
    public void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l;
        long l3 = l2 ^ 0x7FAB131DDD11L;
        long l4 = l2 ^ 0x78CAA85C6F3AL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = this;
        ew_0.d("M", (Object)ew_0.d("\u00d8", (long)3981546301845298926L, (long)l), (Object)objectArray2, (long)3982602543161441322L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        ew_0.d("M", (Object)this, (Object)objectArray3, (long)3982347893985878773L, (long)l);
        this.n = null;
        ew_0.d("M", (Object)this.m, (long)3995406011457895533L, (long)l);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ew_0.b(n, l);
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
            throw new RuntimeException("dev/zprestige/prestige/ew" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x615B;
        if (s[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = r[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])t.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    t.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/ew", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ew_0.s[n2] = n3;
        }
        return s[n2];
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ew" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = ew_0.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    private static long c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x65;
        if (v[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = u[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])w.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    w.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/ew", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            ew_0.v[n2] = l4;
        }
        return v[n2];
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ew_0.m(l, l2);
            object = x[n];
            try {
                if (!(object instanceof String)) break block2;
                ew_0.x[n] = clazz = Class.forName(y[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = ew_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ew_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ew_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ew_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = x;
        x[0] = "\u0014Jk\u0012Gw\u0014J|NKx\u000e\u0001|PKm\tp-\b\u0019";
        objectArray[1] = "}|NVvM}|Y\nzBg7Y\u0014zW`F\bK,\u0010";
        objectArray[2] = Double.TYPE;
        ew_0.y[2] = "java/lang/Double";
        objectArray[3] = Boolean.TYPE;
        ew_0.y[3] = "java/lang/Boolean";
        objectArray[4] = "\u0005U6oa\f\u0013U35r\u001b\u0004\u001e03~\u000f\u0015Y'$5\u001b\u0014";
        objectArray[5] = "r\u0013+cU)r\u0013<?Y&hX<!Y3o)m~\u000bx";
        objectArray[6] = "goctA\rygy;&\fh|ta\u0000\n";
        objectArray[7] = ">H\u0007o\u0019f5G\u0016 xh>L\u0012z";
        objectArray[8] = "P\u0003g\r?\u0015F\u0003bW,\u0002QHaQ \u0016@\u000fvFk\u0004|";
        objectArray[9] = "x\u0019rb1\f\r9ym Cp!jj)\n\u0018";
        objectArray[10] = "N^\u007fakcX^z;xtO\u0015y=t`^Rn*?v]";
        objectArray[11] = "M\u0014\u0006.\fmF\u001b\u0017ao`S\u0016\u0018\nZbB\u0005\u0004&Mo";
        objectArray[12] = ",Uer\u0005j:U`(\u0016}-\u001ec.\u001ai<Yt9Qyp";
        objectArray[13] = "4sD!}DASO.l\u000b ]D%hQT";
        objectArray[14] = "h!\u0012\u0014{\u000bv)\b[\u0019\u0017q4";
        objectArray[15] = "w|IuB\u0006|sX:?\u0013niZy";
        objectArray[16] = Long.TYPE;
        ew_0.y[16] = "java/lang/Long";
        objectArray[17] = "'t)+\u0010\u00031t,q\u0003\u0014&?/w\u000f\u00007x8`D\u0017\f";
        objectArray[18] = "\bi,,-\u0013}I'#<\\\u001cG,(8\u0006h";
        objectArray[19] = "I\u0011F\u001f*'B\u001eWPM?F\u0002Q\u001ch.";
        objectArray[20] = "X\u0006(v\u007f[X\u0006?*sTBM?4sAE<mo\"\u0003";
        objectArray[21] = "\u007f.\u001e\u000fx\r\u007f.\tSt\u0002ee\tMt\u0017b\u0014Y\u0010%";
        objectArray[22] = "dn!xK]dn6$GR~%6:GGyTbb\u0010";
        objectArray[23] = "3JPv\bN3JG*\u0004A)\u0001G4\u0004T.p\u0012k]";
        objectArray[24] = "J\u000fiDc\"\\\u000fl\u001ep5KDo\u0018|!Z\u0003x\u000f76i";
        objectArray[25] = "\u001cf\u0017\"{@iF\u001c-j\u000f\bH\u0017&nU|";
        objectArray[26] = "\f\u0015 3-E\u001a\u0015%i>R\r^&o2F\u001c\u00191xyQ+";
        objectArray[27] = Float.TYPE;
        ew_0.y[27] = "java/lang/Float";
        objectArray[28] = "R.\u0010ZPMY!\u0001\u00153@L'";
        objectArray[29] = "\">\u00183&\u0007W\u001e\u0013<7H6\u0010\u001873\u0012B";
        objectArray[30] = "!NBT$KTnI[5\u00045`BP1^A";
        objectArray[31] = ".\u0017!-eW[7*\"t\u0018:9!)pBN";
        objectArray[32] = "h)a\u00169gv!{Yqgl+c\u001ex|,\u0018e\u0012s{a)c\u0012";
        objectArray[33] = Void.TYPE;
        ew_0.y[33] = "java/lang/Void";
        objectArray[34] = "hG//w+~G*ud<i\f)sh(xK>d#8`K<oyu\\P<ry2kG";
        objectArray[35] = "jwzx\u000bc|w\u007f\"\u0018tk<|$\u0014`z{k3_wJ";
        objectArray[36] = "\bzxtkv}Zs{z9\u001cTxp~ch";
        objectArray[37] = "\u0016\u0017W.\u001bBc7\\!\n\r\u00029W*\u000eWv";
        objectArray[38] = "d\u0010sD\f^d\u0010d\u0018\u0000Q~[d\u0006\u0000Dy*5YY";
        objectArray[39] = "Ov\u0017hk:Ov\u00004g5U=\u0000*g RLRt?d";
        objectArray[40] = "g\u0013+F*\u000f\u00123 I;@s=+B?\u001a\u0007";
        objectArray[41] = "vBXP\u0004Z\u0003bS_\u0015\u0015blXT\u0011O\u0016";
        objectArray[42] = "\u001a}qs\u0007fo]z|\u0016)\u000eSqw\u0012sz";
        objectArray[43] = "=<%xF:#4?7;*#";
        objectArray[44] = "5vT@a\u000f5vC\u001cm\u0000/=C\u0002m\u0015(L\u0013[?T";
        objectArray[45] = "\u000eb)u-S\u0005m8:AP\u000bo:um";
        objectArray[46] = "!U5AYm7U0\u001bJz \u001e3\u001dFn1Y$\n\ry\u000e";
        objectArray[47] = "\u0002.\u0003O\u0016Rw\u000e\b@\u0007\u001d\u0016\u0000\u0003K\u0003Gb";
        objectArray[48] = "\u000e`0\u0012r\n\u0018`5Ha\u001d\u000f+6Nm\t\u001el!Y&\u001c_";
        objectArray[49] = "\u001e\rCw&jk-Hx7%\n#Cs3\u007f~";
        objectArray[50] = ">*/M\u0002\u0003K\n$B\u0013L*\u0004/I\u0017\u0016^";
        objectArray[51] = "%\u007f&&\u0012\u0016P_-)\u0003Y1Q&\"\u0007\u0003E";
        objectArray[52] = Integer.TYPE;
        ew_0.y[52] = "java/lang/Integer";
        objectArray[53] = "\nH!\u001f6Y\u001cH$E%N\u000b\u0003'C)Z\u001aD0TbM?";
        objectArray[54] = "DVyk\u0019\t1vrd\bFPxyo\f\u001c$";
        objectArray[55] = "KGZI2]KGM\u0015>RQ\fM\u000b>GV}\u001fPf\r";
        objectArray[56] = "\u0017#l:\u0001@b\u0003g5\u0010\u000f\u0003\rl>\u0014Uw";
        objectArray[57] = "ja_,eS\u001fAT#t\u001c~O_(pF\n";
        objectArray[58] = "lq7oxd\u0019Q<`i+x_7kmq\f";
        objectArray[59] = "|~\u007f+\u0017\u000e\t^t$\u0006AhP\u007f/\u0002\u001b\u001c";
        objectArray[60] = ",}\u0003v;EY]\by*\n8S\u0003r.PL";
        objectArray[61] = "RdtS+sDdq\t8dS/r\u000f4pBhe\u0018\u007f`D";
        objectArray[62] = "`\u001fJ\u0016('\u0015?A\u00199ht1J\u0012=2\u0000";
        objectArray[63] = "v C\u0017\u0007o` FM\u0014xwkEK\u0018lf,R\\S|}";
        objectArray[64] = "{t?\u0013'\u0002\u000eT4\u001c6MoZ?\u00172\u0017\u001b";
        objectArray[65] = "1['s%mD{,|4\"%u'w0xQ";
        objectArray[66] = "x}d3&hsru|Nh}}f";
        objectArray[67] = "x`&?8V\r@-0)\u0019lN&;-C\u0018";
        objectArray[68] = "m$\b0&\u0014\u0018\u0004\u0003?7[y\n\b43\u0001\r";
        objectArray[69] = "hl@\r6:hlWQ:5r'WO: uV\u0005\u0014ba";
        objectArray[70] = "V\u007fd,r8V\u007fsp~7L4sn~\"KE!:/c";
        objectArray[71] = "0Z\u0001\n\u001aM&Z\u0004P\tZ1\u0011\u0007V\u0005N V\u0010AN_<";
        objectArray[72] = "pk\rPV=\u0005K\u0006_GrdE\rTC(\u0010";
        objectArray[73] = "O6:(l9O6-t`6U}-j`#R\f|38f";
        objectArray[74] = ":\u0019\b\"(\n:\u0019\u001f~$\u0005 R\u001f`$\u0010'#N4}V";
        objectArray[75] = "T.\u0011-N\u001bT.\u0006qB\u0014Ne\u0006oB\u0001I\u0014T1\u0015J";
        objectArray[76] = "\b`\u000e\u0011P.\u001e`\u000bKC9\t+\bMO-\u0018l\u001fZ\u0004?\u0003";
        objectArray[77] = "x.q\u0018[p\r\u000ez\u0017J?l\u0000q\u001cNe\u0018";
        objectArray[78] = "$Ay\u001dk{$AnAgt>\nn_ga9{>\n0'";
        objectArray[79] = "s`\u0003<Dbs`\u0014`Hmi+\u0014~HxnZF$\u001f:";
        objectArray[80] = "Y*\u0017$N_\u0007.\f;<A6t\n.\u0001\u001c\u000e&V&WT6,Q%Y\\H<\u0017'V-";
        objectArray[81] = "XtXV\u0001_Zv\u0019\fjCLv\u0001S\u0006q\u00182Y\tj\u001fB`Y\u0004\u000fOZia";
        objectArray[82] = "!\u0007730\u0014c\f'iIM\u001e\u0004&ct\u001f&Vzk\"W\u001e[-t/At\r;t$.";
        objectArray[83] = "\u00191\u000b;JzI<A&#y\u0015-T%t.Kz\fIMv\u0016#U$Ej\u001a ";
        objectArray[84] = "Ls\u000eA=AEi\u000bNOJ<6\u0012Lr\u0012\u0004dND$Z<5BL1\u001a\u00072\bI##";
        objectArray[85] = "\u0001NF5\u00053\tRJ6`;\u0002SD1\f\tQ\u0017\u0019i`$\u000bVM<Z%\nF[VZn\u0001Q\u001dm]$\u0004C$";
        objectArray[86] = "\u0010X\u0004QD\u001dRS\u0014\u000b=K/[\u0015\u0001\u0000\u0016\u0017\tI\tV^/[M\t]\u0017\u001e\u0002DW\u0004\u001f/";
        objectArray[87] = "lC\u0014\u001dEOnH\nUGr;I\u000b\u000b\u0013%e\u0010X^\u007fK>\u0016]SF\u001f/\u0014]\u0006";
        objectArray[88] = "UW7<D\u0019QU/nAf\u0006ow7N[]W%kF\r\u0015o(<Y\u0000\u0003\u0005~*Y\u000bl";
        objectArray[89] = "+\u0001m\u001b\u0005sp\u0018<M=\u007f~\u0006JOMc\u0017G<LC&,@vIQ\u001f";
        objectArray[90] = ",hBtk\u0005$tNw\u000e\r/u@pb?|0\u0019*\u000eRrg^.5U8bL\u0017";
        objectArray[91] = "z\u0014\u001bGr\u0018$\u0003\u000b\u0017\u0015@,\u000e\u0017\u0010yr}LJJ%%x\u0011\u001dO%@(\t\u0014w";
        objectArray[92] = "K\u001cj%F[I\u001e+\u007f-LS\u000f7+z\u001b\tXjG\u0014\\J^,.KRJX";
        objectArray[93] = "~j\u0013LQ..r\u001at\u000f**m\u0015#Xpz0yM\u001f3{v\u0010\u0012\u00113}";
        objectArray[94] = "\u0001?\u0002}viW<\u001c}\u0007b\fo\t<\u0007o\u0003{\u0006)m9\u0015{\rF";
        objectArray[95] = "oYv:e\u000b-Rf`\u001cXPZgj!\u0000h\b;bwHPZy| N9\u0005w|&1";
        objectArray[96] = "\u001cYQT\u001bx\u0015CT[ipl\u001cMYT+TN\u0011Q\u0002cl\u001f\u001dY\u0017#W\u0018W\\\u0005\u001a";
        objectArray[97] = "\u001cFwOpR\u000f\u001f&B\u0016Z\f_~DzhX\u001e%\u001e.?X]f\u001fiV\u0007Sf\u0019\u0016\u0006\u001f[\"\\\u007fY\u0011[$#/A\u0019\u001faJpO\u0019\u0019\u001e\u001ahG]\\wEfG[#";
        objectArray[98] = "sD]C\u0013\u0018-@F\\a\u0000\u001c\u001a@I\\[$H\u001cA\n\u0013\u001cB\u001bB\u0004\u001bbR]@\u000bj";
        objectArray[99] = "F]wo-\u001a\u0004Vg5TIy^f?i\u0011A\f:7?Yy\n;iiB\u0006\u0000{+: ";
        objectArray[100] = "#JQE\u0012-*^N\u0017DCs&\t\u0018@~+\u001e[DH(c&\t\u0016\u00129{F\u000b\u001d\u0015y|&";
        objectArray[101] = "\u0017/O\u001a=\u0012\u0014\"\f\u0007\f\u0005}d\u0012\u00121]E6N\u001ag\u0015}7\u0000Aj]\u00034\r\u0002wl";
        objectArray[102] = "\u000f\\\u0004~LA\u001aMA\"0A\u0016@YtYM/NYd]+K\u0017Sg\t\u0010L]Vu0";
        objectArray[103] = "<\u001f(\u001b{15B5\u001f\u001f8'\u0001&\"&=&G%Ky3&AZ\u001ba;b\u00043Do;d{";
        objectArray[104] = "3skF%\u00102r{POO$krH#}t'(\u001eOS7.pD6Q5o*/";
        objectArray[105] = "w\u0005v\u001f\u001d:u\u00077Ev-o\u0016+\u0011!z5At}O=vG0\u0014\u00103vA";
        objectArray[106] = "\bI7\u001aB\\JB'@;\u000f7L:\u0019\u0003]K\u0012&@\u0003f\b\u000f{\u001c\u0000\u001aV\u0013\"\u001c;";
        objectArray[107] = "\u0001ITl]\u001fC\u0017\u000e2\u0018!]F\u0012oBMo\u0016R4\u0015!\u0001\u0013\bo\u0015\u0010X\u001aV6\u001d!\u0001\u0011\r2UA_I\u0011t@!";
        objectArray[108] = "\u001e\u00059k\u0019P\u0019\u00011;kGa\u0000ajS\u001fP\u0006c%\u001a.";
        objectArray[109] = "&O\u0013{k6$MR!\u0000!>\\NuWvd\u000b\u0016\u001991'\rUpf?'\u000b";
        objectArray[110] = "Z04R_@Jv6].W;21Y\u0013\u000f\u0003`mQEG;1aYP\u0007\u00006+\\B>";
        objectArray[111] = "5\t@\u0014c%<G\u0001\u0017\u000e.!\rF@h9\u0000\u0016Y@K$8\u0013]V\u000e/$NB\u001d0~'\u001e^-";
        objectArray[112] = "\r7]T\u000b`OmXIRX]\t\u000bU\u0000e\u00051Y\t\b3M\t\b\u0005\u0000&\r2\u000fO\u000544";
        objectArray[113] = "&SE%^Z}X\u001a5Raz_W+_\rH\u000b\u0014t\u0007^\u001f\tM'\b\u0006\"WZ7Xa";
        objectArray[114] = "\u00104r\u0006\u0001{\u0014!v\u0019\u001b\u001dL7r\u0019\u0017q~c4DL&)co\u0017\u001e{\u00128dH\u000ew)";
        objectArray[115] = "e/P0\u001a4g)\u00150}2/\u0013R3\u0011k9.\f$\u0001;^";
        objectArray[116] = "kj\u0004U@p75^H1){cFPM/}\u000e\u0000EPq?b[\\\u0001'\u0007";
        objectArray[117] = "K6xt\u0017BAv:'uXKw .\u0019j\u001b;xtu\u0007\u0016e>pN\u0000\\`,I";
        objectArray[118] = " \u000f&\u0017b\\(\u0013*\u0014\u0007T#\u0012$\u0013kfuUyK>1w\r.L7T'\u0015't";
        objectArray[119] = "\u0015\u0015g}XU\u0017\u0017&'3B\r\u0006:sd\u0015WQc\u001f\nR\u0014W!vU\\\u0014Q";
        objectArray[120] = "(D$\u001bF\u001ejJq\u0012-\u000e\u0015\n(HS\u001eyN5G_d";
        objectArray[121] = "3<\"\u0014\u0016\u001f4:3\u0019i\u0011Tc?\u0006TAl1c\u000e\u0002\tT<4\u0011\u000f\u001f>j\"\u0011\u0004p";
        objectArray[122] = "\u001c\nemo<\u001e\b$7\u0004+\u0004\u00198cS|^Nf\u000f=;\u001dH#fb5\u001dN";
        objectArray[123] = "jMQ,z\u001f:@\u001b1\u0013\u001cfQ\u000e2DK9\fU^|O;\u0007Zna\u0000>Y";
        objectArray[124] = "E|J;n<Bz[6\u0011:\"#W),b\u001aq\u000b!z*\"{\f\"t\"\\kJ {S";
        objectArray[125] = " 9Lo-4~aP)8T|nS2:8N<\u001ejlT h\u0011iamty\u0013i4T";
        objectArray[126] = "yR<\u0015m/{P}O\u00068aAa\u001bQo;\u0016=w?(x\u0010z\u001e`&x\u0016";
        objectArray[127] = "T\u0016&A#|P\u0003\"^9\u001a\b\u0015&^5v:A`\u0003n$mA5Ub|\u0010\u001a0\u000e##m";
        objectArray[128] = "\u0017bM`rY\u0010d\\m\rXp=Pr0\u0007Ho\fzfOpb[ekY\u001a4Me`6";
        objectArray[129] = "Xk\u0005\u0007!S\u0003n^F~.\u000fe\u0003S+y\\4V\u0007G\u0017\u000eo^Q:L\u000b4\u001f\u000e";
        objectArray[130] = "\u0003pzYx$\u000blvZ\u001d,\u0000mx]q\u001eS)$\u0005\u001dpWr%J}.\u000fnc_\u001d";
        objectArray[131] = "l@xHi .Kh\u0012\u0010sSCi\u0018-+k\u00115\u0010{cS@9\u0018n#hGs\u001d|\u001a";
        objectArray[132] = "GT>\u0003o1\u0005_.Y\u0016ixW/S+:@\u0005s[}rx\b$Dpd\u0012^2D{\u000b";
        objectArray[133] = "G%80k+O943\u000e#D8:4b\u0011\u0012}go>F\u0010&`0vxRx:n3F";
        objectArray[134] = "lp\u0003`5#2t\u0018\u007fG?\u0003.\u001ejz`;|Bb,(\u0003-Nj9h8*\u0004o+Q";
        objectArray[135] = "p\u0005`.\u0002ny\u001fe!pe\u0000@|#M=8\u0012 +\u001bu\u0000\u001fw4\u0016cjIa4\u001d\f";
        objectArray[136] = "$\u0015K0JJ,\tG3/B'\bI4CpqJ\u0015n\u0013'(HB.\u0014\u0017+\u0012P\"/";
        objectArray[137] = "S\u0014\u0000\u0013d`Q\u0012E\u0013\u0003f\u001a(S\u000e:qX\u0016\u0002\rjmh";
        objectArray[138] = "\u001e\u0018=\t/@\u0019\u001e,\u0004PCyG \u001bm\u001eA\u0015|\u0013;VyDp\u001b.\u0016BC:\u001e</";
        objectArray[139] = "CSeI?\u0011\u0013Klqj\u0019\u0006Ph\u001dXNF\u00007K\u000fMDKm\u001bj\u001d\u001f\u000enq6\n\u0002\fp\u0018i\u0004\u0002\n\u000fK?\u001a\u0004\t4Lu\u001f\u00160";
        objectArray[140] = "@1\u0001n\u00114\u001b(P8)>\u0011=\u001cW\u00149CuQf\u0012;\f<`";
        objectArray[141] = "'&wU>/w>~m`+s!q:7q#}\u001dTp2\":t\u000b~2$";
        objectArray[142] = "&~9\u00004d!x(\rKfA!$\u0012v:ysx\u001a rA~/\u0005-d+(9\u0005&\u000b";
        objectArray[143] = "+`\u0005lv$#|\to\u0013,(}\u0007h\u007f\u001e~?[2.I'=\fr(y$g\u001e~\u0013";
        objectArray[144] = "e\u0003$=T\u00053\u0000:=%\f`RF;DZ4\u000fw=F\u0015}>|6K\u001b5\u0005{|N\t\f";
        objectArray[145] = "\u0019\u0013\t8\\\u0001\u0010\u0013\u0018c%\n~O\u0006\"Y\u0012\u0011H\u00003T";
        objectArray[146] = "\u0012p@5-|P*E(tDBN\u00164&y\u001avDh./RNI?1\"D$\u001f)1)+";
        objectArray[147] = "\nC,?\nx\u0002_ <op\t^.;\u0003BY\u001crmo,\u001aZr#\u0006s\u0014Zt\\Vk\u001c\u001e15\te\u001c\u0018Ne\u0011mX]':\u001fm^\"w\"\u0017)\u001bK(,\u0017/d";
        objectArray[148] = "8?Wl)*fh\u0003m|Ih\u000f^3yt07\foq\"x\u000f\u00018n/neW.n$\u0001";
        objectArray[149] = "\u0011{\u001a}\u000bT\u0019g\u0016~n\\\u0012f\u0018y\u0002nA\"G/n\u0000EyEn\u000e^\u001de\u0003{n";
        objectArray[150] = "9\t\u0003\u0006BT{S\u0006\u001b\u001bli7U\u0007IQ1\u000f\u0007[A\u0007y7U_A\f0\u0006\fV\u001fU87";
        objectArray[151] = "q\u000e\f;q\u0011<\fKx\u000eDAUV(3\u001cy\u0007\n eTAUU,6\u001d$\u0005M%\u000e";
        objectArray[152] = "}e%Ok|+f;O\u001a}h5=\u001df{nX{\b{%,4 \u0011*s\u0014";
        objectArray[153] = "\u007fWd44k=\\tnM8@Tudp`x\u0006)l&(@Tv`ua%\u0004niM";
        objectArray[154] = "\u0002\u001f\u0012BO\u0019\u0004Q\u001b\u0010#\u0013\u0010`^\u0018\u001cLOQX\u001aS\u0005~\u001c\u001c\b\u0018\u0018\u0013\u001aR\u0001Jt";
        objectArray[155] = "<,>e\u001aE{8ef\u0007=k!bb\u000bcl!xfw_9.x0G\\c<t\u000b";
        objectArray[156] = "\b[?U\u007f[\tZ V< X4}Rl\u001d\u0000\f/\u000edKH4\u007fTn\u0010V\t!C~@1";
        objectArray[157] = "\u0015]A*F\u001f\b\u0012DtvJ\u0017\u001c\u001dv\u001axCPD(L/\u0016\u0004E}\u0007\u0017J[\u001f`v";
        objectArray[158] = "c\u0014.r!\u00193\f'J\u007f\u001d7\u0013(\u001d(GgMDso\u0004f\b-,a\u0004`";
        objectArray[159] = "Gj)?L[\u001cor~\u0013&\u0013|?fN]~8#0\u0012\u0017O>!\u007f[&D5,q\u0013\u001dC\u007f)c*";
        Object[] objectArray2 = objectArray;
        objectArray[160] = "^Z\u0018\r\u0015\u001b\bY\u0006\rd\u0001Z\u0002\u001dH\t:Yg\u001f\\\u000bC]\u0005\u0007O\u001c\u00027]JX\u001aB\fZ\u0000]\b{";
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ew" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ew_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'S' || c == '\u00c3' || c == '\u00d8' || c == '\u00e0') {
                field = ew_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'S' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c3' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ew_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'M' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c0' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        long l = (Long)objectArray[0];
        long l2 = l;
        long l3 = l2 ^ 0x8A203407D47L;
        long l4 = l2 ^ 0x52D6E774439DL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        ew_0.d("M", (Object)this, (Object)objectArray2, (long)3247932366810891962L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l4;
        objectArray3[0] = this;
        ew_0.d("M", (Object)ew_0.d("\u00d8", (long)3252180329394881677L, (long)l), (Object)objectArray3, (long)3253247891581475755L, (long)l);
    }

    private int d(Object[] objectArray) {
        Object object;
        block5: {
            long l = (Long)objectArray[0];
            long l2 = (l = q ^ l) ^ 0x259608BD0F39L;
            CallSite callSite = ew_0.d("\u00c0", (long)-2947517021933777281L, (long)l);
            for (int i = 0; i <= ew_0.b("k", (int)11164, (long)(0x4B9E783CEBE41DC0L ^ l)); ++i) {
                int n;
                block6: {
                    try {
                        try {
                            Object[] objectArray2 = new Object[2];
                            objectArray2[1] = l2;
                            objectArray2[0] = ew_0.d("M", (Object)ew_0.d("M", (Object)ew_0.d("S", (Object)b, (long)-2949125569306703320L, (long)l), (long)-2943357097469130769L, (long)l), (int)i, (long)-2946323100534922527L, (long)l);
                            object = ew_0.d("\u00c0", (Object)objectArray2, (long)-2946912999941907837L, (long)l);
                            if (callSite != null) break block5;
                            if (callSite != null) break block6;
                        }
                        catch (MatchException matchException) {
                            throw ew_0.d("\u00c0", (Object)matchException, (long)-2946213338503988459L, (long)l);
                        }
                        if (object == 0) continue;
                    }
                    catch (MatchException matchException) {
                        throw ew_0.d("\u00c0", (Object)matchException, (long)-2946213338503988459L, (long)l);
                    }
                    n = i;
                }
                return n;
            }
            object = -1;
        }
        return object;
    }

    private class_1701 a(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        long l = (Long)objectArray[1];
        long l2 = l = q ^ l;
        long l3 = l2 ^ 0x68E7046D99A0L;
        long l4 = l2 ^ 0x760E9CEDA1C9L;
        long l5 = l2 ^ 0x2B3C9F1D870AL;
        long l6 = l2 ^ 0x760CB06DF725L;
        CallSite callSite = ew_0.d("\u00c0", (long)5909412764607433573L, (long)l);
        try {
            if (ew_0.d("S", (Object)b, (long)5909449331303789873L, (long)l) == null) {
                return null;
            }
        }
        catch (MatchException matchException) {
            throw ew_0.d("\u00c0", (Object)matchException, (long)5910642385638800911L, (long)l);
        }
        CallSite callSite2 = ew_0.d("\u00c0", (long)5910849504796619541L, (long)l);
        ew_0.d("M", (Object)this.m, arg_0 -> ew_0.lambda$findClosestCart$1((long)callSite2, arg_0), (long)5923491582995977231L, (long)l);
        class_1701 class_17012 = null;
        Object object = Double.MAX_VALUE;
        dC dC2 = new dC((float)ew_0.d("M", (Object)ew_0.d("S", (Object)b, (long)5911179640589668146L, (long)l), (long)5926285691012595453L, (long)l), (float)ew_0.d("M", (Object)ew_0.d("S", (Object)b, (long)5911179640589668146L, (long)l), (long)5926616090341657412L, (long)l));
        CallSite callSite3 = ew_0.d("M", (Object)ew_0.d("M", (Object)ew_0.d("S", (Object)b, (long)5909449331303789873L, (long)l), (long)5925382255554348234L, (long)l), (long)5909092804647282791L, (long)l);
        while (ew_0.d("M", (Object)callSite3, (long)5911586660908015706L, (long)l) != false) {
            block32: {
                reference v17;
                block31: {
                    CallSite callSite4;
                    reference var24_17;
                    class_1701 class_17013;
                    block29: {
                        block30: {
                            CallSite callSite5;
                            block28: {
                                class_1701 class_17014;
                                ew_0 ew_02;
                                block27: {
                                    CallSite callSite6;
                                    block26: {
                                        class_1297 class_12972;
                                        block25: {
                                            class_1297 class_12973 = (class_1297)ew_0.d("M", (Object)callSite3, (long)5926529200439790332L, (long)l);
                                            try {
                                                class_12972 = class_12973;
                                                if (callSite != null) break block25;
                                                if (!(class_12972 instanceof class_1701)) continue;
                                            }
                                            catch (MatchException matchException) {
                                                throw ew_0.d("\u00c0", (Object)matchException, (long)5910642385638800911L, (long)l);
                                            }
                                            class_12972 = class_12973;
                                        }
                                        class_17013 = (class_1701)class_12972;
                                        try {
                                            callSite6 = ew_0.d("M", (Object)class_17013, (long)5909070602082205760L, (long)l);
                                            if (callSite != null) break block26;
                                            if (callSite6 == false) {
                                                continue;
                                            }
                                        }
                                        catch (MatchException matchException) {
                                            throw ew_0.d("\u00c0", (Object)matchException, (long)5910642385638800911L, (long)l);
                                        }
                                        try {
                                            ew_02 = this;
                                            class_17014 = class_17013;
                                            if (callSite != null) break block27;
                                            Object[] objectArray2 = new Object[2];
                                            objectArray2[1] = l5;
                                            objectArray2[0] = class_17014;
                                            callSite6 = ew_0.d("M", (Object)ew_02, (Object)objectArray2, (long)5925767855349233746L, (long)l);
                                        }
                                        catch (MatchException matchException) {
                                            throw ew_0.d("\u00c0", (Object)matchException, (long)5910642385638800911L, (long)l);
                                        }
                                    }
                                    if (callSite6 != false) continue;
                                    ew_02 = this;
                                    class_17014 = class_17013;
                                }
                                Object[] objectArray3 = new Object[2];
                                objectArray3[1] = l3;
                                objectArray3[0] = class_17014;
                                callSite5 = ew_0.d("M", (Object)ew_02, (Object)objectArray3, (long)5925052983494112509L, (long)l);
                                var24_17 = ew_0.d("M", (Object)ew_0.d("S", (Object)b, (long)5911179640589668146L, (long)l), (double)ew_0.d("S", (Object)callSite5, (long)5925551547201996940L, (long)l), (double)ew_0.d("S", (Object)callSite5, (long)5911864836205876862L, (long)l), (double)ew_0.d("S", (Object)callSite5, (long)5926504987184023789L, (long)l), (long)5924630252596272456L, (long)l);
                                try {
                                    reference cfr_temp_0 = ew_0.d("\u00c0", (double)var24_17, (long)5910273742467118366L, (long)l) - 5.0;
                                    callSite4 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                    if (callSite != null) break block28;
                                    if (callSite4 > 0) {
                                        continue;
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw ew_0.d("\u00c0", (Object)matchException, (long)5910642385638800911L, (long)l);
                                }
                                float f10 = f - 360.0f;
                                callSite4 = (CallSite)(f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1));
                            }
                            try {
                                if (callSite != null) break block29;
                                if (callSite4 >= 0) break block30;
                            }
                            catch (MatchException matchException) {
                                throw ew_0.d("\u00c0", (Object)matchException, (long)5910642385638800911L, (long)l);
                            }
                            Object[] objectArray4 = new Object[4];
                            objectArray4[3] = l6;
                            objectArray4[2] = Float.valueOf((float)ew_0.d("S", (Object)callSite5, (long)5926504987184023789L, (long)l));
                            objectArray4[1] = Float.valueOf((float)ew_0.d("S", (Object)callSite5, (long)5911864836205876862L, (long)l));
                            objectArray4[0] = Float.valueOf((float)ew_0.d("S", (Object)callSite5, (long)5925551547201996940L, (long)l));
                            CallSite callSite7 = ew_0.d("\u00c0", (Object)objectArray4, (long)5910080608131831067L, (long)l);
                            try {
                                Object[] objectArray5 = new Object[4];
                                objectArray5[3] = l4;
                                objectArray5[2] = Float.valueOf(f);
                                objectArray5[1] = callSite7;
                                objectArray5[0] = dC2;
                                callSite4 = ew_0.d("\u00c0", (Object)objectArray5, (long)5926116945104496617L, (long)l);
                                if (callSite != null) break block29;
                                if (callSite4 == false) {
                                    continue;
                                }
                            }
                            catch (MatchException matchException) {
                                throw ew_0.d("\u00c0", (Object)matchException, (long)5910642385638800911L, (long)l);
                            }
                        }
                        try {
                            v17 = var24_17;
                            if (callSite != null) break block31;
                            reference cfr_temp_2 = v17 - object;
                            callSite4 = cfr_temp_2 == 0 ? 0 : (cfr_temp_2 < 0 ? -1 : 1);
                        }
                        catch (MatchException matchException) {
                            throw ew_0.d("\u00c0", (Object)matchException, (long)5910642385638800911L, (long)l);
                        }
                    }
                    if (callSite4 >= 0) break block32;
                    class_17012 = class_17013;
                    v17 = var24_17;
                }
                object = v17;
            }
            if (callSite == null) continue;
        }
        return class_17012;
    }

    private boolean a(Object[] objectArray) {
        int n;
        block8: {
            class_1701 class_17012 = (class_1701)objectArray[0];
            long l = (Long)objectArray[1];
            long l2 = (l = q ^ l) ^ 0x7DA9886D1386L;
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l2;
            objectArray2[0] = class_17012;
            CallSite callSite = ew_0.d("\u00c0", (Object)objectArray2, (long)-85656134408167370L, (long)l);
            CallSite callSite2 = ew_0.d("\u00c0", (long)-76072249899245597L, (long)l);
            CallSite callSite3 = ew_0.d("\u00c0", (long)-75363386596366445L, (long)l);
            CallSite callSite4 = ew_0.d("M", (Object)this.m, (long)-86603364459487838L, (long)l);
            while (ew_0.d("M", (Object)callSite4, (long)-73150229706994516L, (long)l) != false) {
                block11: {
                    Object object;
                    block10: {
                        block9: {
                            gu_0 gu_02 = (gu_0)((Object)ew_0.d("M", (Object)callSite4, (long)-87415469534992886L, (long)l));
                            try {
                                try {
                                    reference cfr_temp_0 = callSite2 - ew_0.d("M", (Object)gu_02, (long)-87797900736798113L, (long)l) - ew_0.c("v", (int)25690, (long)(0x3825835D1D079AD4L ^ l));
                                    n = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                    if (callSite3 != null) break block8;
                                    if (callSite3 != null) break block9;
                                }
                                catch (MatchException matchException) {
                                    throw ew_0.d("\u00c0", (Object)matchException, (long)-76311533003369735L, (long)l);
                                }
                                if (n > 0) {
                                    continue;
                                }
                            }
                            catch (MatchException matchException) {
                                throw ew_0.d("\u00c0", (Object)matchException, (long)-76311533003369735L, (long)l);
                            }
                            object = ew_0.d("M", (Object)callSite, (Object)ew_0.d("M", (Object)ew_0.d("M", (Object)gu_02, (long)-74702456015911879L, (long)l), (long)-73025301182293580L, (long)l), (double)1.5, (long)-87625045011471911L, (long)l);
                        }
                        try {
                            if (callSite3 != null) break block10;
                            if (object == false) break block11;
                        }
                        catch (MatchException matchException) {
                            throw ew_0.d("\u00c0", (Object)matchException, (long)-76311533003369735L, (long)l);
                        }
                        object = 1;
                    }
                    return (boolean)object;
                }
                if (callSite3 == null) continue;
            }
            n = false;
        }
        return n != 0;
    }

    private double a(Object[] objectArray) {
        class_1297 class_12972 = (class_1297)objectArray[0];
        long l = (Long)objectArray[1];
        l = q ^ l;
        CallSite callSite = ew_0.d("M", (Object)ew_0.d("S", (Object)b, (long)4844120634246258179L, (long)l), (long)4841525324956721372L, (long)l);
        CallSite callSite2 = ew_0.d("M", (Object)class_12972, (long)4843353266735180034L, (long)l);
        CallSite callSite3 = ew_0.d("\u00c0", (double)ew_0.d("S", (Object)callSite, (long)4830872707681802685L, (long)l), (double)ew_0.d("S", (Object)callSite2, (long)4843418370257932235L, (long)l), (double)ew_0.d("S", (Object)callSite2, (long)4842084985985962329L, (long)l), (long)4842850458683040243L, (long)l);
        CallSite callSite4 = ew_0.d("\u00c0", (double)ew_0.d("S", (Object)callSite, (long)4844277955042576207L, (long)l), (double)ew_0.d("S", (Object)callSite2, (long)4842366072114909774L, (long)l), (double)ew_0.d("S", (Object)callSite2, (long)4841583974350681464L, (long)l), (long)4842850458683040243L, (long)l);
        CallSite callSite5 = ew_0.d("\u00c0", (double)ew_0.d("S", (Object)callSite, (long)4831887958838761948L, (long)l), (double)ew_0.d("S", (Object)callSite2, (long)4844212049786906865L, (long)l), (double)ew_0.d("S", (Object)callSite2, (long)4843140184205286365L, (long)l), (long)4842850458683040243L, (long)l);
        reference var13_9 = ew_0.d("S", (Object)callSite, (long)4830872707681802685L, (long)l) - callSite3;
        reference var15_10 = ew_0.d("S", (Object)callSite, (long)4844277955042576207L, (long)l) - callSite4;
        reference var17_11 = ew_0.d("S", (Object)callSite, (long)4831887958838761948L, (long)l) - callSite5;
        return (double)ew_0.d("\u00c0", (double)(var13_9 * var13_9 + var15_10 * var15_10 + var17_11 * var17_11), (long)4842775028362585135L, (long)l);
    }

    private class_243 a(Object[] objectArray) {
        class_1297 class_12972 = (class_1297)objectArray[0];
        long l = (Long)objectArray[1];
        l = q ^ l;
        return ew_0.d("M", (Object)ew_0.d("M", (Object)class_12972, (long)-2280508491934676369L, (long)l), (long)-2282117984027664759L, (long)l);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    @bP
    public void a(a5 a52) {
        long l = q ^ 0x30C69A8637AAL;
        ew_0.d("M", (Object)this.m, (long)2036056101776086878L, (long)l);
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return ew_0.d("\u00c0", (Object)((Object)q_0.Cart), (long)-2439086591068950604L, (long)l);
    }

    @bP
    public void a(bh_0 bh_02) {
        block8: {
            CallSite callSite;
            CallSite callSite2;
            long l;
            long l2;
            block7: {
                l2 = q ^ 0x82455AECFA9L;
                l = l2 ^ 0x75A8E0C1FA64L;
                callSite2 = ew_0.d("M", (Object)bh_02, (Object)new Object[0], (long)-1996193650333661378L, (long)l2);
                CallSite callSite3 = ew_0.d("\u00c0", (long)-1996483644624765652L, (long)l2);
                try {
                    try {
                        callSite = callSite2;
                        if (callSite3 != null) break block7;
                        if (!(callSite instanceof class_2885)) break block8;
                    }
                    catch (MatchException matchException) {
                        throw ew_0.d("\u00c0", (Object)matchException, (long)-1995179548885874618L, (long)l2);
                    }
                    callSite = callSite2;
                }
                catch (MatchException matchException) {
                    throw ew_0.d("\u00c0", (Object)matchException, (long)-1995179548885874618L, (long)l2);
                }
            }
            class_2885 class_28852 = (class_2885)callSite;
            try {
                CallSite callSite4 = callSite2 = ew_0.d("M", (Object)ew_0.d("M", (Object)class_28852, (long)-1996540125705330282L, (long)l2), (Object)ew_0.d("\u00d8", (long)-1984581357811379948L, (long)l2), (long)-1985277597510842192L, (long)l2) != false ? ew_0.d("M", (Object)ew_0.d("S", (Object)b, (long)-1999077366235072133L, (long)l2), (long)-1984476572571794641L, (long)l2) : ew_0.d("M", (Object)ew_0.d("S", (Object)b, (long)-1999077366235072133L, (long)l2), (long)-1985949941399035390L, (long)l2);
            }
            catch (MatchException matchException) {
                throw ew_0.d("\u00c0", (Object)matchException, (long)-1995179548885874618L, (long)l2);
            }
            if (ew_0.d("M", (Object)callSite2, (long)-1996654500096816971L, (long)l2) == ew_0.d("\u00d8", (long)-1999344847797624230L, (long)l2)) {
                CallSite callSite5 = ew_0.d("M", (Object)class_28852, (long)-1996893188316582534L, (long)l2);
                CallSite callSite6 = ew_0.d("\u00c0", (long)-1995396567403297444L, (long)l2);
                ew_0.d("M", (Object)this.m, (Object)new gu_0((class_2338)ew_0.d("M", (Object)callSite5, (long)-1996968334366095161L, (long)l2), (long)callSite6), (long)-1985774756469520180L, (long)l2);
                Object[] objectArray = new Object[2];
                objectArray[1] = l;
                objectArray[0] = callSite5;
                ew_0.d("M", (Object)this.m, (Object)new gu_0((class_2338)ew_0.d("\u00c0", (Object)objectArray, (long)-1985472214087013527L, (long)l2), (long)callSite6), (long)-1985774756469520180L, (long)l2);
            }
        }
    }

    @Override
    public dC a(Object[] objectArray) {
        CallSite callSite;
        block149: {
            block150: {
                ew_0 ew_02;
                Object object;
                CallSite callSite2;
                long l;
                long l2;
                block148: {
                    block146: {
                        long l3;
                        long l4;
                        block147: {
                            block144: {
                                block145: {
                                    block140: {
                                        long l5;
                                        block141: {
                                            CallSite callSite3;
                                            long l6;
                                            block142: {
                                                CallSite callSite4;
                                                long l7;
                                                block143: {
                                                    long l8;
                                                    block136: {
                                                        long l9;
                                                        block137: {
                                                            long l10;
                                                            block138: {
                                                                block139: {
                                                                    long l11;
                                                                    block134: {
                                                                        block135: {
                                                                            block132: {
                                                                                block133: {
                                                                                    block130: {
                                                                                        long l12;
                                                                                        block131: {
                                                                                            block128: {
                                                                                                block129: {
                                                                                                    ew_0 ew_03;
                                                                                                    CallSite callSite5;
                                                                                                    long l13;
                                                                                                    long l14;
                                                                                                    long l15;
                                                                                                    block124: {
                                                                                                        block125: {
                                                                                                            block127: {
                                                                                                                ew_0 ew_04;
                                                                                                                block126: {
                                                                                                                    class_1701 class_17012;
                                                                                                                    block122: {
                                                                                                                        block123: {
                                                                                                                            long l16;
                                                                                                                            block118: {
                                                                                                                                block119: {
                                                                                                                                    block120: {
                                                                                                                                        Object object2;
                                                                                                                                        long l17;
                                                                                                                                        block116: {
                                                                                                                                            block117: {
                                                                                                                                                block114: {
                                                                                                                                                    block115: {
                                                                                                                                                        block110: {
                                                                                                                                                            block111: {
                                                                                                                                                                block113: {
                                                                                                                                                                    ew_0 ew_05;
                                                                                                                                                                    block112: {
                                                                                                                                                                        block109: {
                                                                                                                                                                            block107: {
                                                                                                                                                                                l2 = (Long)objectArray[0];
                                                                                                                                                                                long l18 = l2;
                                                                                                                                                                                l9 = l18 ^ 0x3BAA84443786L;
                                                                                                                                                                                l = l18 ^ 0x1A99A2A6F024L;
                                                                                                                                                                                l15 = l18 ^ 0x55A08B392405L;
                                                                                                                                                                                l10 = l18 ^ 0x10E074BFB7E6L;
                                                                                                                                                                                l6 = l18 ^ 0x6D88BA4E35CEL;
                                                                                                                                                                                l4 = l18 ^ 0x7C6037A2A158L;
                                                                                                                                                                                l17 = l18 ^ 0x167B10493AAFL;
                                                                                                                                                                                l7 = l18 ^ 0x35A4EE5C881DL;
                                                                                                                                                                                l14 = l18 ^ 0x6CCF45119AEL;
                                                                                                                                                                                l8 = l18 ^ 0x7FFBAAB1343L;
                                                                                                                                                                                l3 = l18 ^ 0x53005072D29FL;
                                                                                                                                                                                l16 = l18 ^ 0x2484B9069659L;
                                                                                                                                                                                l5 = l18 ^ 0x1E12C5EE8DD4L;
                                                                                                                                                                                l11 = l18 ^ 0x4DCDFBE1C8B5L;
                                                                                                                                                                                l13 = l18 ^ 0x5C9A0C609185L;
                                                                                                                                                                                l12 = l18 ^ 0x5819F4BB8768L;
                                                                                                                                                                                long l19 = l18 ^ 0x3B0BB2F9BFF8L;
                                                                                                                                                                                callSite2 = ew_0.d("\u00c0", (long)-1177886061762611520L, (long)l2);
                                                                                                                                                                                try {
                                                                                                                                                                                    block108: {
                                                                                                                                                                                        try {
                                                                                                                                                                                            try {
                                                                                                                                                                                                if (callSite2 != null) break block107;
                                                                                                                                                                                                if (ew_0.d("S", (Object)b, (long)-1176134566033034601L, (long)l2) == null) break block108;
                                                                                                                                                                                            }
                                                                                                                                                                                            catch (MatchException matchException) {
                                                                                                                                                                                                throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                                                                                                                                                            }
                                                                                                                                                                                            if (ew_0.d("S", (Object)b, (long)-1177786285795014508L, (long)l2) != null) break block109;
                                                                                                                                                                                        }
                                                                                                                                                                                        catch (MatchException matchException) {
                                                                                                                                                                                            throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    Object[] objectArray2 = new Object[1];
                                                                                                                                                                                    objectArray2[0] = l19;
                                                                                                                                                                                    ew_0.d("M", (Object)this, (Object)objectArray2, (long)-1176060803250912251L, (long)l2);
                                                                                                                                                                                }
                                                                                                                                                                                catch (MatchException matchException) {
                                                                                                                                                                                    throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            return null;
                                                                                                                                                                        }
                                                                                                                                                                        try {
                                                                                                                                                                            try {
                                                                                                                                                                                try {
                                                                                                                                                                                    try {
                                                                                                                                                                                        object2 = this.p;
                                                                                                                                                                                        if (callSite2 != null) break block110;
                                                                                                                                                                                        if (object2 != 2) break block111;
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (MatchException matchException) {
                                                                                                                                                                                        throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                                                                                                                                                    }
                                                                                                                                                                                    ew_05 = this;
                                                                                                                                                                                    if (callSite2 != null) break block112;
                                                                                                                                                                                }
                                                                                                                                                                                catch (MatchException matchException) {
                                                                                                                                                                                    throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                                                                                                                                                }
                                                                                                                                                                                Object[] objectArray3 = new Object[2];
                                                                                                                                                                                objectArray3[1] = l11;
                                                                                                                                                                                objectArray3[0] = Float.valueOf((float)ew_0.d("M", (Object)((Float)((Object)ew_0.d("M", (Object)this.e, (long)-1179256568544062461L, (long)l2))), (long)-1180032520168119051L, (long)l2));
                                                                                                                                                                                if (ew_0.d("M", (Object)ew_05.k, (Object)objectArray3, (long)-1176475672756828928L, (long)l2) == false) break block113;
                                                                                                                                                                            }
                                                                                                                                                                            catch (MatchException matchException) {
                                                                                                                                                                                throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                                                                                                                                            }
                                                                                                                                                                            ew_05 = this;
                                                                                                                                                                        }
                                                                                                                                                                        catch (MatchException matchException) {
                                                                                                                                                                            throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    Object[] objectArray4 = new Object[1];
                                                                                                                                                                    objectArray4[0] = l10;
                                                                                                                                                                    ew_0.d("M", (Object)ew_05, (Object)objectArray4, (long)-1182110902457042391L, (long)l2);
                                                                                                                                                                }
                                                                                                                                                                return null;
                                                                                                                                                            }
                                                                                                                                                            object2 = ew_0.d("M", (Object)ew_0.d("S", (Object)b, (long)-1176134566033034601L, (long)l2), (long)-1175501582391070289L, (long)l2);
                                                                                                                                                        }
                                                                                                                                                        try {
                                                                                                                                                            try {
                                                                                                                                                                if (callSite2 != null) break block114;
                                                                                                                                                                if (object2 == 0) break block115;
                                                                                                                                                            }
                                                                                                                                                            catch (MatchException matchException) {
                                                                                                                                                                throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                                                                                                                            }
                                                                                                                                                            return null;
                                                                                                                                                        }
                                                                                                                                                        catch (MatchException matchException) {
                                                                                                                                                            throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    object2 = ei_0.R;
                                                                                                                                                }
                                                                                                                                                try {
                                                                                                                                                    try {
                                                                                                                                                        if (callSite2 != null) break block116;
                                                                                                                                                        if (object2 == 0) break block117;
                                                                                                                                                    }
                                                                                                                                                    catch (MatchException matchException) {
                                                                                                                                                        throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                                                                                                                    }
                                                                                                                                                    return null;
                                                                                                                                                }
                                                                                                                                                catch (MatchException matchException) {
                                                                                                                                                    throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            object2 = ew_0.d("M", (Object)ew_0.d("\u00d8", (long)-1180748567944264142L, (long)l2), (Object)new Object[0], (long)-1181087439719607947L, (long)l2);
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            if (object2 != 0) {
                                                                                                                                                return null;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        catch (MatchException matchException) {
                                                                                                                                            throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            class_17012 = this.n;
                                                                                                                                            if (callSite2 != null) break block118;
                                                                                                                                            if (class_17012 == null) break block119;
                                                                                                                                        }
                                                                                                                                        catch (MatchException matchException) {
                                                                                                                                            throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                                                                                                        }
                                                                                                                                        Object[] objectArray5 = new Object[2];
                                                                                                                                        objectArray5[1] = l15;
                                                                                                                                        objectArray5[0] = this.n;
                                                                                                                                        callSite5 = ew_0.d("M", (Object)this, (Object)objectArray5, (long)-1180161852104226472L, (long)l2);
                                                                                                                                        try {
                                                                                                                                            ew_0 ew_06;
                                                                                                                                            block121: {
                                                                                                                                                try {
                                                                                                                                                    try {
                                                                                                                                                        try {
                                                                                                                                                            try {
                                                                                                                                                                ew_06 = this;
                                                                                                                                                                if (callSite2 != null) break block120;
                                                                                                                                                                if (ew_0.d("M", (Object)ew_06.n, (long)-1178815964934504987L, (long)l2) == false) break block121;
                                                                                                                                                            }
                                                                                                                                                            catch (MatchException matchException) {
                                                                                                                                                                throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                                                                                                                            }
                                                                                                                                                            ew_06 = this;
                                                                                                                                                            if (callSite2 != null) break block120;
                                                                                                                                                        }
                                                                                                                                                        catch (MatchException matchException) {
                                                                                                                                                            throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                                                                                                                        }
                                                                                                                                                        Object[] objectArray6 = new Object[2];
                                                                                                                                                        objectArray6[1] = l17;
                                                                                                                                                        objectArray6[0] = this.n;
                                                                                                                                                        if (ew_0.d("M", (Object)ew_06, (Object)objectArray6, (long)-1181716406709762569L, (long)l2) != false) break block121;
                                                                                                                                                    }
                                                                                                                                                    catch (MatchException matchException) {
                                                                                                                                                        throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                                                                                                                    }
                                                                                                                                                    if (!(ew_0.d("\u00c0", (double)ew_0.d("M", (Object)ew_0.d("S", (Object)b, (long)-1176134566033034601L, (long)l2), (double)ew_0.d("S", (Object)callSite5, (long)-1180236692604750551L, (long)l2), (double)ew_0.d("S", (Object)callSite5, (long)-1175979394939212837L, (long)l2), (double)ew_0.d("S", (Object)callSite5, (long)-1181612550656363192L, (long)l2), (long)-1180577982006419219L, (long)l2), (long)-1179732132801115973L, (long)l2) > 5.0)) break block119;
                                                                                                                                                }
                                                                                                                                                catch (MatchException matchException) {
                                                                                                                                                    throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            ew_06 = this;
                                                                                                                                        }
                                                                                                                                        catch (MatchException matchException) {
                                                                                                                                            throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    ew_06.n = null;
                                                                                                                                }
                                                                                                                                class_17012 = this.n;
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            if (callSite2 != null) break block122;
                                                                                                                                            if (class_17012 != null) break block123;
                                                                                                                                        }
                                                                                                                                        catch (MatchException matchException) {
                                                                                                                                            throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                                                                                                        }
                                                                                                                                        Object[] objectArray7 = new Object[2];
                                                                                                                                        objectArray7[1] = l16;
                                                                                                                                        objectArray7[0] = Float.valueOf((float)ew_0.d("M", (Object)((Float)((Object)ew_0.d("M", (Object)this.g, (long)-1179256568544062461L, (long)l2))), (long)-1180032520168119051L, (long)l2));
                                                                                                                                        class_17012 = this.n = ew_0.d("M", (Object)this, (Object)objectArray7, (long)-1179504932076869151L, (long)l2);
                                                                                                                                        if (callSite2 != null) break block122;
                                                                                                                                    }
                                                                                                                                    catch (MatchException matchException) {
                                                                                                                                        throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                                                                                                    }
                                                                                                                                    if (class_17012 == null) break block123;
                                                                                                                                }
                                                                                                                                catch (MatchException matchException) {
                                                                                                                                    throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                                                                                                }
                                                                                                                                Object[] objectArray8 = new Object[1];
                                                                                                                                objectArray8[0] = l4;
                                                                                                                                ew_0.d("M", (Object)this.a, (Object)objectArray8, (long)-1175603041137868518L, (long)l2);
                                                                                                                                Object[] objectArray9 = new Object[1];
                                                                                                                                objectArray9[0] = l;
                                                                                                                                ew_0.d("M", (Object)this.i, (Object)objectArray9, (long)-1182034680757734149L, (long)l2);
                                                                                                                            }
                                                                                                                            catch (MatchException matchException) {
                                                                                                                                throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            ew_03 = this;
                                                                                                                            if (callSite2 != null) break block124;
                                                                                                                            class_17012 = ew_03.n;
                                                                                                                        }
                                                                                                                        catch (MatchException matchException) {
                                                                                                                            throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                if (class_17012 != null) break block125;
                                                                                                                                ew_04 = this;
                                                                                                                                if (callSite2 != null) break block126;
                                                                                                                            }
                                                                                                                            catch (MatchException matchException) {
                                                                                                                                throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                                                                                            }
                                                                                                                            if (ew_04.p != 1) break block127;
                                                                                                                        }
                                                                                                                        catch (MatchException matchException) {
                                                                                                                            throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                                                                                        }
                                                                                                                        ew_04 = this;
                                                                                                                    }
                                                                                                                    catch (MatchException matchException) {
                                                                                                                        throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                                                                                    }
                                                                                                                }
                                                                                                                Object[] objectArray10 = new Object[1];
                                                                                                                objectArray10[0] = l10;
                                                                                                                ew_0.d("M", (Object)ew_04, (Object)objectArray10, (long)-1182110902457042391L, (long)l2);
                                                                                                            }
                                                                                                            return null;
                                                                                                        }
                                                                                                        ew_03 = this;
                                                                                                    }
                                                                                                    Object[] objectArray11 = new Object[2];
                                                                                                    objectArray11[1] = l15;
                                                                                                    objectArray11[0] = this.n;
                                                                                                    callSite5 = ew_0.d("M", (Object)ew_03, (Object)objectArray11, (long)-1180161852104226472L, (long)l2);
                                                                                                    Object[] objectArray12 = new Object[2];
                                                                                                    objectArray12[1] = l13;
                                                                                                    objectArray12[0] = callSite5;
                                                                                                    callSite = ew_0.d("M", (Object)ew_0.d("\u00d8", (long)-1180748567944264142L, (long)l2), (Object)objectArray12, (long)-1178115333294572718L, (long)l2);
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                object = ew_0.d("M", (Object)((Boolean)((Object)ew_0.d("M", (Object)this.h, (long)-1179256568544062461L, (long)l2))), (long)-1179716581722384414L, (long)l2);
                                                                                                                if (callSite2 != null) break block128;
                                                                                                                if (object == false) break block129;
                                                                                                            }
                                                                                                            catch (MatchException matchException) {
                                                                                                                throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                                                                            }
                                                                                                            object = ew_0.d("M", (Object)callSite, (Object)new Object[0], (long)-1179105567056432272L, (long)l2);
                                                                                                            if (callSite2 != null) break block128;
                                                                                                        }
                                                                                                        catch (MatchException matchException) {
                                                                                                            throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                                                                        }
                                                                                                        if (object != false) break block129;
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                                                                    }
                                                                                                    Object[] objectArray13 = new Object[3];
                                                                                                    objectArray13[2] = l14;
                                                                                                    objectArray13[1] = callSite5;
                                                                                                    objectArray13[0] = callSite;
                                                                                                    callSite = ew_0.d("\u00c0", (Object)objectArray13, (long)-1176182647552877600L, (long)l2);
                                                                                                }
                                                                                                object = ew_0.d("M", (Object)ew_0.d("S", (Object)b, (long)-1176134566033034601L, (long)l2), (Object)this.n, (long)-1176507402965034271L, (long)l2);
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    if (callSite2 != null) break block130;
                                                                                                    if (object != false) break block131;
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                                                                }
                                                                                                return null;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                                                            }
                                                                                        }
                                                                                        Object[] objectArray14 = new Object[2];
                                                                                        objectArray14[1] = l12;
                                                                                        objectArray14[0] = this.n;
                                                                                        reference cfr_temp_0 = ew_0.d("M", (Object)this, (Object)objectArray14, (long)-1175851526246259453L, (long)l2) - 3.0;
                                                                                        object = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            if (callSite2 != null) break block132;
                                                                                            if (object <= 0) break block133;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                                                        }
                                                                                        return null;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                                                    }
                                                                                }
                                                                                Object[] objectArray15 = new Object[2];
                                                                                objectArray15[1] = l5;
                                                                                objectArray15[0] = this.a;
                                                                                object = ew_0.d("M", (Object)this.i, (Object)objectArray15, (long)-1179568298112787806L, (long)l2);
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    if (callSite2 != null) break block134;
                                                                                    if (object != false) break block135;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                                                }
                                                                                return callSite;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                                            }
                                                                        }
                                                                        object = this.p;
                                                                    }
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (callSite2 != null) break block136;
                                                                                    if (object != true) break block137;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                                                }
                                                                                Object[] objectArray16 = new Object[2];
                                                                                objectArray16[1] = l11;
                                                                                objectArray16[0] = Float.valueOf((float)ew_0.d("M", (Object)((Float)((Object)ew_0.d("M", (Object)this.c, (long)-1179256568544062461L, (long)l2))), (long)-1180032520168119051L, (long)l2));
                                                                                object = ew_0.d("M", (Object)this.j, (Object)objectArray16, (long)-1176475672756828928L, (long)l2);
                                                                                if (callSite2 != null) break block138;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                                            }
                                                                            if (object != false) break block139;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                                        }
                                                                        return callSite;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                                    }
                                                                }
                                                                Object[] objectArray17 = new Object[2];
                                                                objectArray17[1] = l9;
                                                                objectArray17[0] = ew_0.d("M", (Object)ew_0.d("S", (Object)b, (long)-1176134566033034601L, (long)l2), (long)-1181658891771705149L, (long)l2);
                                                                object = ew_0.d("\u00c0", (Object)objectArray17, (long)-1178421370183065028L, (long)l2);
                                                            }
                                                            try {
                                                                try {
                                                                    if (callSite2 != null) break block140;
                                                                    if (object != false) break block141;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                                }
                                                                Object[] objectArray18 = new Object[1];
                                                                objectArray18[0] = l10;
                                                                ew_0.d("M", (Object)this, (Object)objectArray18, (long)-1182110902457042391L, (long)l2);
                                                                return callSite;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                            }
                                                        }
                                                        Object[] objectArray19 = new Object[2];
                                                        objectArray19[1] = l9;
                                                        objectArray19[0] = ew_0.d("M", (Object)ew_0.d("S", (Object)b, (long)-1176134566033034601L, (long)l2), (long)-1181658891771705149L, (long)l2);
                                                        object = ew_0.d("\u00c0", (Object)objectArray19, (long)-1178421370183065028L, (long)l2);
                                                    }
                                                    try {
                                                        if (callSite2 != null) break block140;
                                                        if (object != false) break block141;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                    }
                                                    Object[] objectArray20 = new Object[1];
                                                    objectArray20[0] = l8;
                                                    callSite4 = ew_0.d("M", (Object)this, (Object)objectArray20, (long)-1176352635110913936L, (long)l2);
                                                    try {
                                                        try {
                                                            callSite3 = callSite4;
                                                            if (callSite2 != null) break block142;
                                                            if (callSite3 != -1) break block143;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                        }
                                                        return null;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                                    }
                                                }
                                                Object[] objectArray21 = new Object[1];
                                                objectArray21[0] = l7;
                                                this.o = (int)ew_0.d("\u00c0", (Object)objectArray21, (long)-1180837282899457733L, (long)l2);
                                                callSite3 = callSite4;
                                            }
                                            Object[] objectArray22 = new Object[2];
                                            objectArray22[1] = l6;
                                            objectArray22[0] = (int)callSite3;
                                            ew_0.d("\u00c0", (Object)objectArray22, (long)-1180526065949434552L, (long)l2);
                                            this.p = 1;
                                            Object[] objectArray23 = new Object[1];
                                            objectArray23[0] = l;
                                            ew_0.d("M", (Object)this.j, (Object)objectArray23, (long)-1182034680757734149L, (long)l2);
                                            return callSite;
                                        }
                                        Object[] objectArray24 = new Object[2];
                                        objectArray24[1] = l5;
                                        objectArray24[0] = this.f;
                                        object = ew_0.d("M", (Object)this.l, (Object)objectArray24, (long)-1179568298112787806L, (long)l2);
                                    }
                                    try {
                                        try {
                                            if (callSite2 != null) break block144;
                                            if (object != false) break block145;
                                        }
                                        catch (MatchException matchException) {
                                            throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                        }
                                        return callSite;
                                    }
                                    catch (MatchException matchException) {
                                        throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                    }
                                }
                                object = ew_0.d("M", (Object)callSite, (Object)new Object[0], (long)-1179105567056432272L, (long)l2);
                            }
                            try {
                                try {
                                    if (callSite2 != null) break block146;
                                    if (object == false) break block147;
                                }
                                catch (MatchException matchException) {
                                    throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                                }
                                return callSite;
                            }
                            catch (MatchException matchException) {
                                throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                            }
                        }
                        Object[] objectArray25 = new Object[2];
                        objectArray25[1] = l3;
                        objectArray25[0] = this.n;
                        ew_0.d("\u00c0", (Object)objectArray25, (long)-1180951933079599665L, (long)l2);
                        Object[] objectArray26 = new Object[1];
                        objectArray26[0] = l;
                        ew_0.d("M", (Object)this.l, (Object)objectArray26, (long)-1182034680757734149L, (long)l2);
                        Object[] objectArray27 = new Object[1];
                        objectArray27[0] = l4;
                        ew_0.d("M", (Object)this.f, (Object)objectArray27, (long)-1175603041137868518L, (long)l2);
                        object = this.p;
                    }
                    try {
                        try {
                            try {
                                if (callSite2 != null) break block148;
                                if (object != true) break block149;
                            }
                            catch (MatchException matchException) {
                                throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                            }
                            ew_02 = this;
                            if (callSite2 != null) break block150;
                        }
                        catch (MatchException matchException) {
                            throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                        }
                        object = ew_0.d("M", (Object)((Boolean)((Object)ew_0.d("M", (Object)ew_02.d, (long)-1179256568544062461L, (long)l2))), (long)-1179716581722384414L, (long)l2);
                    }
                    catch (MatchException matchException) {
                        throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                    }
                }
                try {
                    block151: {
                        try {
                            if (object == false) break block151;
                            this.p = (int)ew_0.b("k", (int)28699, (long)(0x15AC373FEC6EFEF9L ^ l2));
                            Object[] objectArray28 = new Object[1];
                            objectArray28[0] = l;
                            ew_0.d("M", (Object)this.k, (Object)objectArray28, (long)-1182034680757734149L, (long)l2);
                            if (callSite2 == null) break block149;
                        }
                        catch (MatchException matchException) {
                            throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                        }
                    }
                    this.o = -1;
                    ew_02 = this;
                }
                catch (MatchException matchException) {
                    throw ew_0.d("\u00c0", (Object)matchException, (long)-1178838468977327190L, (long)l2);
                }
            }
            ew_02.p = 0;
        }
        return callSite;
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (y[n3] != null) {
            return n3;
        }
        Object object = x[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 13;
            case 1 -> 6;
            case 2 -> 32;
            case 3 -> 44;
            case 4 -> 52;
            case 5 -> 50;
            case 6 -> 9;
            case 7 -> 14;
            case 8 -> 59;
            case 9 -> 53;
            case 10 -> 36;
            case 11 -> 17;
            case 12 -> 16;
            case 13 -> 43;
            case 14 -> 58;
            case 15 -> 20;
            case 16 -> 45;
            case 17 -> 41;
            case 18 -> 27;
            case 19 -> 39;
            case 20 -> 5;
            case 21 -> 46;
            case 22 -> 31;
            case 23 -> 47;
            case 24 -> 35;
            case 25 -> 4;
            case 26 -> 34;
            case 27 -> 38;
            case 28 -> 63;
            case 29 -> 8;
            case 30 -> 2;
            case 31 -> 11;
            case 32 -> 56;
            case 33 -> 22;
            case 34 -> 54;
            case 35 -> 26;
            case 36 -> 10;
            case 37 -> 61;
            case 38 -> 25;
            case 39 -> 30;
            case 40 -> 37;
            case 41 -> 42;
            case 42 -> 57;
            case 43 -> 7;
            case 44 -> 29;
            case 45 -> 19;
            case 46 -> 28;
            case 47 -> 24;
            case 48 -> 48;
            case 49 -> 1;
            case 50 -> 15;
            case 51 -> 49;
            case 52 -> 3;
            case 53 -> 40;
            case 54 -> 0;
            case 55 -> 62;
            case 56 -> 23;
            case 57 -> 51;
            case 58 -> 18;
            case 59 -> 12;
            case 60 -> 55;
            case 61 -> 21;
            case 62 -> 33;
            default -> 60;
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
        ew_0.y[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = ew_0.m(l, l2);
        Object object = x[n];
        if (object instanceof String) {
            String string = y[n];
            int n2 = string.indexOf(8);
            Class clazz = ew_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ew_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ew_0.g(clazz3, string2, clazz2)) != null) {
                    ew_0.x[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ew_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ew_0.x[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ew_0.n(559128870304198L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = ew_0.m(l, l2);
        Object object = x[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = y[n];
                int n3 = string2.indexOf(8);
                clazz3 = ew_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ew_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ew_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        ew_0.x[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ew_0.n(559128870304198L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ew_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ew_0.x[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ew_0.n(559128870304198L, 0L);
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
        l = q ^ l;
        this.n = null;
        ew_0.d("M", (Object)this.m, (long)8911148646613921973L, (long)l);
        this.o = -1;
        this.p = 0;
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

    private void j(Object[] objectArray) {
        block4: {
            ew_0 ew_02;
            block5: {
                long l = (Long)objectArray[0];
                long l2 = (l = q ^ l) ^ 0x2A6DAA533C34L;
                CallSite callSite = ew_0.d("\u00c0", (long)8339901238324554458L, (long)l);
                try {
                    try {
                        ew_02 = this;
                        if (callSite != null) break block4;
                        if (ew_02.o == -1) break block5;
                    }
                    catch (MatchException matchException) {
                        throw ew_0.d("\u00c0", (Object)matchException, (long)8338948573503102896L, (long)l);
                    }
                    Object[] objectArray2 = new Object[2];
                    objectArray2[1] = l2;
                    objectArray2[0] = this.o;
                    ew_0.d("M", (Object)ew_0.d("\u00d8", (long)8324668949309168168L, (long)l), (Object)objectArray2, (long)8339845882132955358L, (long)l);
                    this.o = -1;
                }
                catch (MatchException matchException) {
                    throw ew_0.d("\u00c0", (Object)matchException, (long)8338948573503102896L, (long)l);
                }
            }
            ew_02 = this;
        }
        ew_02.p = 0;
    }

    private boolean lambda$new$0(Float f) {
        long l = q ^ 0x3D4F820C3C7L;
        return (boolean)ew_0.d("M", (Object)((Boolean)((Object)ew_0.d("M", (Object)this.d, (long)-1720333296112594047L, (long)l))), (long)-1719641023254065056L, (long)l);
    }

    private static boolean lambda$findClosestCart$1(long l, gu_0 gu_02) {
        long l2;
        block2: {
            block3: {
                long l3 = q ^ 0x7E1BB08950B1L;
                CallSite callSite = ew_0.d("\u00c0", (long)8886559241740280372L, (long)l3);
                try {
                    long l4 = l - ew_0.d("M", (Object)gu_02, (long)8894384604739299320L, (long)l3) - ew_0.c("v", (int)19376, (long)(0x34981CB54F483098L ^ l3));
                    l2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                    if (callSite != null) break block2;
                    if (l2 <= 0) break block3;
                }
                catch (MatchException matchException) {
                    throw ew_0.d("\u00c0", (Object)matchException, (long)8887788969953007454L, (long)l3);
                }
                l2 = 1;
                break block2;
            }
            l2 = 0;
        }
        return (boolean)l2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ew_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ew_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_2() {
        try {
            return MethodHandles.lookup().findStatic(ew_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


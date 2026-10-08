/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_2338
 *  net.minecraft.class_243
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bt_0;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dN;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dP;
import dev.zprestige.prestige.dR;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.q_0;
import java.awt.Color;
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
import net.minecraft.class_2338;
import net.minecraft.class_243;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class e9
extends dV {
    private static final double a = 0.08;
    private static final double b = 0.98;
    private static final double c = 0.999;
    private dR d;
    private dM e;
    private dP f;
    private dN g;
    private dN h;
    private dM i;
    private dP j;
    private dN k;
    private dM l;
    private dN m;
    private dN n;
    private dO o;
    private static final long p = hc.a(5631288547100707805L, -2994861506501016517L, MethodHandles.lookup().lookupClass()).a(178515749107927L);
    private static final String[] q;
    private static final String[] r;
    private static final Map s;
    private static final Object[] t;
    private static final String[] u;

    public e9() {
        long l;
        long l2 = l = p ^ 0x18359D254B8L;
        long l3 = l2 ^ 0x66AFD5EA21L;
        long l4 = l2 ^ 0x72A66366F1C7L;
        long l5 = l2 ^ 0x46E609A228A5L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l4;
        objectArray[0] = this::lambda$new$4;
        e9.c("\u00f4", (Object)this.k, (Object)objectArray, (long)463533567504818920L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l4;
        objectArray2[0] = this::lambda$new$5;
        e9.c("\u00f4", (Object)this.m, (Object)objectArray2, (long)463533567504818920L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l4;
        objectArray3[0] = this::lambda$new$2;
        e9.c("\u00f4", (Object)this.h, (Object)objectArray3, (long)463533567504818920L, (long)l);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l5;
        objectArray4[0] = this::lambda$new$0;
        e9.c("\u00f4", (Object)this.f, (Object)objectArray4, (long)465959898818914462L, (long)l);
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l3;
        objectArray5[0] = this::lambda$new$7;
        e9.c("\u00f4", (Object)this.o, (Object)objectArray5, (long)465227279301463995L, (long)l);
        Object[] objectArray6 = new Object[2];
        objectArray6[1] = l4;
        objectArray6[0] = this::lambda$new$1;
        e9.c("\u00f4", (Object)this.g, (Object)objectArray6, (long)463533567504818920L, (long)l);
        Object[] objectArray7 = new Object[2];
        objectArray7[1] = l4;
        objectArray7[0] = this::lambda$new$6;
        e9.c("\u00f4", (Object)this.n, (Object)objectArray7, (long)463533567504818920L, (long)l);
        Object[] objectArray8 = new Object[2];
        objectArray8[1] = l5;
        objectArray8[0] = this::lambda$new$3;
        e9.c("\u00f4", (Object)this.j, (Object)objectArray8, (long)465959898818914462L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        t = new Object[88];
        u = new String[88];
        e9.f();
        s = new HashMap(13);
        long l = p ^ 0x12B5F3BF2B8AL;
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
        String string = "H\u00c0B\u00c5\u009b\u00feg\u00de.\u00b6\u0083\u00a9\u00af\u00fdM\u0099\u0010\u0095\u001epW\u00a5\u0018\u00b9\u00e8\"\u0012PN=\u0092f\u0093\u0010\u00d3V\u00d9\u00d2\u00c7\u00ae\u00a4\u00c2\u00be\u0016m\u00d0\u00d0\u00ba\u00d9\u00ad";
        int n2 = "H\u00c0B\u00c5\u009b\u00feg\u00de.\u00b6\u0083\u00a9\u00af\u00fdM\u0099\u0010\u0095\u001epW\u00a5\u0018\u00b9\u00e8\"\u0012PN=\u0092f\u0093\u0010\u00d3V\u00d9\u00d2\u00c7\u00ae\u00a4\u00c2\u00be\u0016m\u00d0\u00d0\u00ba\u00d9\u00ad".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = e9.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                q = stringArray;
                r = new String[3];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4DB0;
        if (r[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])s.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    s.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/e9", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = q[n2].getBytes("ISO-8859-1");
            e9.r[n2] = e9.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return r[n2];
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

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/e9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = e9.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/e9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = e9.m(l, l2);
            object = t[n];
            try {
                if (!(object instanceof String)) break block2;
                e9.t[n] = clazz = Class.forName(u[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = e9.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = e9.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = e9.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = e9.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = t;
        t[0] = "\\:\u0018z,>J:\u001d ?)]q\u001e&3=L6\t1x*v";
        objectArray[1] = "\u0005Ns/g\"pnx vm\u0011`s+r7e";
        objectArray[2] = "O\r.\u000e\u00043Y\r+T\u0017$NF(R\u001b0_\u0001?EP'd";
        objectArray[3] = "-\b\u007f%\u0018OX(t*\t\u00009&\u007f!\rZM";
        objectArray[4] = "(rdkJl>ra1Y{)9b7Uo8~u \u001ex\u001c";
        objectArray[5] = "{\u0014wcm\u0000\u000e4|l|Oo:wgx\u0015\u001b";
        objectArray[6] = "T)$\u001d3f_&5R_eQ$7\u001ds";
        objectArray[7] = Boolean.TYPE;
        e9.u[7] = "java/lang/Boolean";
        objectArray[8] = "T\u007ft\u001b\u0005]B\u007fqA\u0016JU4rG\u001a^DsePQI{";
        objectArray[9] = "QzlotJZu} \u0015DQ~yz";
        objectArray[10] = "S`Y1\txE`\\k\u001aoR+_m\u0016{ClHz]i\u007f";
        objectArray[11] = "\u000e\u000f0\u000bB.{/;\u0004Sa\u00067(\u0003Z(n";
        objectArray[12] = ",\u001bp#&W:\u001buy5@-Pv\u007f9T<\u0017ahrF\r";
        objectArray[13] = "g\u001f\u0007\u001b2.\u0012?\f\u0014#as1\u0007\u001f';\u0007";
        objectArray[14] = "?\b\"\r7o\"\u001dz/vb:\u001b";
        objectArray[15] = "A\u0012hZhzW\u0012m\u0000{m@Yn\u0006wyQ\u001ey\u0011<nd";
        objectArray[16] = "cF~^sP\u0016fuQb\u001fwh~ZfE\u0003";
        objectArray[17] = Void.TYPE;
        e9.u[17] = "java/lang/Void";
        objectArray[18] = "fd;t;Pfd,(7_|/,67J{^}ne";
        objectArray[19] = Double.TYPE;
        e9.u[19] = "java/lang/Double";
        objectArray[20] = "(>(\u0013Ey>>-IVn)u.OZz829X\u0011lu";
        objectArray[21] = "b\u0004T\b\u0017ti\u000bEGty|\u0006J,A{m\u0015V\u0000Vv";
        objectArray[22] = "\u0000l\u0017|!zuL\u001cs05\u0014B\u0017x4o`";
        objectArray[23] = "a<GcD)j3V,91y4_e";
        objectArray[24] = Integer.TYPE;
        e9.u[24] = "java/lang/Integer";
        objectArray[25] = "wBSXq aBV\u0002b7v\tU\u0004n#gNB\u0013%3+";
        objectArray[26] = "\u001fx\u001cV\u0013\u0017jX\u0017Y\u0002X\u000bV\u001cR\u0006\u0002\u007f";
        objectArray[27] = ">yM\u0012L$KYF\u001d]k*WM\u0016Y1^";
        objectArray[28] = "*h\u00044L=_H\u000f;]r>F\u00040Y(J";
        objectArray[29] = "\bM\u0001#6$\u0016E\u001blK4\u0016";
        objectArray[30] = "D\"!\u0005n;O-0J\r6Z+";
        objectArray[31] = "\u0004h3\u0010\u0001v\u0004h$L\ry\u001e#$R\rl\u0019Rv\u0007_(";
        objectArray[32] = "-\u0012W\u001d`k-\u0012@Ald7Y@_lq0(\u0011\u0000>:";
        objectArray[33] = "#\u001f#E\f_#\u001f4\u0019\u0000P9T4\u0007\u0000E>%e]Y\u0006";
        objectArray[34] = "cE!U\"'\u0016e*Z3hwk!Q72\u0003";
        objectArray[35] = "\u001asXOis\u001asO\u0013e|\u00008O\rei\u0007I\u001dW1-";
        objectArray[36] = "sG7x\u0014NxH&7sLmC&|H";
        objectArray[37] = "K^&?\u0004\u0016K^1c\b\u0019Q\u00151}\b\fVdc#PH";
        objectArray[38] = "K\u0000I48S> B;)\u001c_.I0-F+";
        objectArray[39] = "A_f>}ZW_cdnM@\u0014`bbYQSwu)L\u0014";
        objectArray[40] = "\u0011'\u0013o2\u001ad\u0007\u0018`#U\u0005\t\u0013k'\u000fq";
        objectArray[41] = "\u0010\f\u0003so\re,\b|~B\u0004\"\u0003wz\u0018p";
        objectArray[42] = "LJ\u0019rD(GE\b=,(IJ\u001b";
        objectArray[43] = Float.TYPE;
        e9.u[43] = "java/lang/Float";
        objectArray[44] = "L'\"^\u001fh9\u0007)Q\u000e'X\t\"Z\n},";
        objectArray[45] = "f5\u0016V\rl\u0013\u0015\u001dY\u001c#r\u001b\u0016R\u0018y\u0006";
        objectArray[46] = "$'A* I=?\u001etK\u00171%Gr'%ei\u0018${r7 H+u\u0013e)YxK";
        objectArray[47] = "MjbU o\u0011vv2r_Qk*\u000bx\"Oil]\u001b=H|t\t+aTh\u0013";
        objectArray[48] = "!Fx#6ob\u001ee{H\u007f\u001eI \"7h/\tsj+\u0015";
        objectArray[49] = "Y\u0013/&rJG\u0019{0IMY\u0018- IO[\u0012r;\"F\u0004\u001b7Z%EPG+1,\u001aY\u0002J";
        objectArray[50] = "\r\u001dtx\b(\u0013\u0017 n3(\u0003\n\u0011hU,Q\u0010za\n%\u0014q}b^y\b\u001at=W<i";
        objectArray[51] = "\u001de'H\u0012[\u0012fa\\kA\u0014\u007fx]\u0007sI8\"\u0002kA\u001a?tA\u000b\u0018\u0005ya:\r\u001e\u001b3tP\u0016Z\u0016d\u0018";
        objectArray[52] = "A\u000bP(X\u001a\u0013\u0002A{f\u001eG\u000e_q\n,\u0013J\u0005+f\u0010S\u001d\u0001(\u0007BZ\fR\u0016\n\u001dGJ^}\u0003BN\u000f?";
        objectArray[53] = "\u000f.ZN/,\u001dmKQA6boW\u0018x1\u001fqU^.R\b`RE\u007f5\u001eq\u0001YA";
        objectArray[54] = "\b3`1~pVb2lFd\u0002~1l*VP9h;}\u0001\u000bdny?~\u0004g(mF";
        objectArray[55] = "\u007f\u0001hf\rL-\by53Hy\u0004g?_z-@>i3Fm\u00179fR\u0014d\u0006jXXT{F99\n]j\u0015\u0007";
        objectArray[56] = "\u0004W;yBN\u000eM>a(NmHf8\u0011M\u0010Vd~G.\u0007Gce\u0016I\u0011V0y(";
        objectArray[57] = "\u001fa\u001dZDt\u0010hLV|w\u0019q@{\u001b{\u001d\n@\u000e\u0012)\tq\u001e\f\u001b~p";
        objectArray[58] = "Qv+7\u0001l^um#xvXlt\"\u0014D\u000e)*}G\u0013U.z{\u0001h\u000b,s,x";
        objectArray[59] = "\u000ey<\u007f(m\\p-,\u0016b\u0004m7-A5^=jAzj\b82*s5\u0001}";
        objectArray[60] = "Y\f\f\u000e!_\u000b\u0005\u001d]\u001f[_\t\u0003Wsi\u000bMX\t\u001fRT\u0018[Qt[\u000b\u0011\u001e0sX_M\u0002[z\u0007V\bc\\yS\n\u0014\bU&ZOu\bIp\u0000\f\u0014Z@aS2";
        objectArray[61] = " oZr\u0011\u0003.$@&.]|bs|VRx\u001eZ&@\fhe\u0004$I[\u0011";
        objectArray[62] = "lwlyM\u0014fmia'\u0018\u0005h18\u001e\u0017xv3~Htog4e\u0019\u0013yvgy'";
        objectArray[63] = "]t\u0018nD\u0018R\"\u0019<5\u0014=f\u0019o\f\u001c@x\u001b)Z\u007fVa\u0010h\u000b\u001e\u0004h\u0001;5";
        objectArray[64] = "tC>\u0012'#|\u001ek\u0013G5DXbJ~<9F`\f(_uWd\u0019xn{\u001c~MG";
        objectArray[65] = "\u0006&\u0012\u0018\u000e\u0019\f<\u0017\u0000d\u0016o9OY]\u001a\u0012'M\u001f\u000by\u00056J\u0004Z\u001e\u0013'\u0019\u0018d";
        objectArray[66] = "e7hEBE7>y\u0016|Jo#c\u0017+\u001d5s?{\u0010Bcvf\u0010\u0019\u001dj3";
        objectArray[67] = "=%z4NJ/fk+ ]Pww<@\u000e6\u007fz6D4=|v;\u001aR5q|? ";
        objectArray[68] = "\u0012n\u0015\u0005Mw@g\u0004Vss\u0014k\u001a\\\u001fA@'J\u0003N\u0016\u0015q\u0017\u0003\u0012}\u001c.\u001eFsz\u001fzBZ\u0018s@s\u0007;\u001fp\u0014/\u001bP\u0016/\u001djzP\nyG)\u001b\u0002\u0003h\u0014\u0017";
        objectArray[69] = "\u0012%sb\u001bI\u0000fb}uT\u007fd~4LT\u0002z|r\u001a7\u0015k{iKP\u0003z(uu";
        objectArray[70] = "\u0006{5\u0018Oh\u0011m7Xqw\u0007v\u0000\t\u0015k\f\n>^\u001f(\u0018q`\\\u0016\u007fa";
        objectArray[71] = "q\u001cu,d9sH/=\u001b?H\r/v\"55\u0013-0tVq\u001cu,d9sH/=\u001b";
        objectArray[72] = "3\\_\u0014\u0013as\u0007\u001aC~nh^\u0005\u001e\u0017bQP\u0005\u000e\u0013\u00042\tY\u000e\u0019apB^L~";
        objectArray[73] = "n)\u001e85\u00034&CxL\u0003U8\u0019<u\t(&\u001bz#jn)\u001e85\u00034&CxL";
        objectArray[74] = "Mg=DS_\u001fn,\u0017m[Kb2\u001d\u0001i\u001f&hAmR@sj\u001b\u0006[\u001fz/z\u0001XK&3\u0011\b\u0007BcR\u0016\u000bS\u001e\u007f9\u001fTZ[\u001e9\u0003\u0002\u0000\u0018\u007fk\n\u0013S&";
        objectArray[75] = "%\u0012\u0007ktKg\u0010Z{\u001f\u001a_\n\u00079&\u0010\"\u0014\u0005\u007fps8EP:'\u0002f\u0014\u0002g\u001f";
        objectArray[76] = "]N]L;vZ\u0000\u001bUFd`\u0002YO>n_VPZ$\r";
        objectArray[77] = "}z\u0004\u0005\r-r,\u0005W|#\u001dh\u0005\u0004E)`v\u0007B\u0013Jvo\f\u0003B+$f\u001dP|";
        objectArray[78] = "|\u0018m`@[n[|\u007f.L\u0011Y`6\u0017FlGbpA%z^i1\u0010D(Wxb.";
        objectArray[79] = "|*{\u0010\b(gnvGd'wlyG\b\u0015 .#\u0019YB' !]\u0003'ek&\u001fd";
        objectArray[80] = "\u0001EL\u0018\"\u000eSB\u001d_G\u0002\f)I\u001c6\u001d\u0001\u0016\u001d\u0015#\u0007bJ\u001b^:\u0000\t\u0018\u001c\u000f}e";
        objectArray[81] = "c|\u007fnrlf v>\u00002{\u007fm~^5{ei\u0002|#tt;a`.z \u0004";
        objectArray[82] = "hlGf\"%:eV5\u001c*bxL4K}8(\u0012Xp\"n-I3y}gh";
        objectArray[83] = "@LO2-TOE\u001e>\u0015ZVZ\u001b<n7\u0011^\u0003 v\bEW\u0016:\u0015\n\u001f\u001f\u000f?pHT\u0018MX";
        objectArray[84] = "QE\u0007.3A\bZA;HDYZ[%$v\r\u001e\u0001|t!T\u0018U|1Z\n\u001a\\+H";
        objectArray[85] = "\bbW<R?\u001a!F#<#e#Zj\u0005\"\u0018=X,SA\u000f,_7\u0002&\u0019=\f+<";
        objectArray[86] = "\u000fkb\u001dq%\u0000=cO\u0000+oyc\u001c9!\u0012gaZoB\u0003ah\u001da)\n>aX\u0000";
        Object[] objectArray2 = objectArray;
        objectArray[87] = "Z\u00049Q\u001amC\u001cf\u000fq3O\u0006?\t\u001d\u0001\u001dAf^JVF\u001c`\u001c\b)I\u001f&\bq";
    }

    /*
     * Exception decompiling
     */
    public void l(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 10[SWITCH]
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

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = e9.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'o' || c == '\u00c3' || c == 'z' || c == '\u00eb') {
                field = e9.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'o' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c3' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'z' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = e9.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private class_243 a(Object[] objectArray) {
        CallSite callSite;
        block17: {
            class_1297 class_12972 = (class_1297)objectArray[0];
            bt_0 bt_02 = (bt_0)objectArray[1];
            long l = (Long)objectArray[2];
            long l2 = l = p ^ l;
            long l3 = l2 ^ 0x1E084CB1C088L;
            long l4 = l2 ^ 0x50EBB24F426EL;
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l3;
            objectArray2[0] = class_12972;
            CallSite callSite2 = e9.c("\u00f2", (Object)objectArray2, (long)3312201433262112535L, (long)l);
            CallSite callSite3 = e9.c("\u00f4", (Object)class_12972, (long)3310040154758747095L, (long)l);
            CallSite callSite4 = callSite2;
            CallSite callSite5 = null;
            CallSite callSite6 = e9.c("\u00f2", (long)3307910157944539093L, (long)l);
            for (int i = 0; i < e9.c("\u00f4", (Object)((Integer)((Object)e9.c("\u00f4", (Object)this.f, (long)3312152200762230767L, (long)l))), (long)3311698286492363852L, (long)l); ++i) {
                CallSite callSite7;
                block24: {
                    block25: {
                        CallSite callSite8;
                        block22: {
                            block20: {
                                block21: {
                                    class_2338 class_23382;
                                    block18: {
                                        callSite4 = callSite2;
                                        callSite = e9.c("\u00f4", (Object)callSite2, (Object)callSite3, (long)3308411153577001644L, (long)l);
                                        if (callSite6 != null) break block17;
                                        callSite2 = callSite;
                                        class_23382 = new class_2338((int)e9.c("\u00f2", (double)e9.c("o", (Object)callSite2, (long)3310307287847237385L, (long)l), (long)3308018909703046233L, (long)l), (int)e9.c("\u00f2", (double)(e9.c("o", (Object)callSite2, (long)3308697978751208406L, (long)l) - 0.1), (long)3308018909703046233L, (long)l), (int)e9.c("\u00f2", (double)e9.c("o", (Object)callSite2, (long)3311415446682411317L, (long)l), (long)3308018909703046233L, (long)l));
                                        try {
                                            block19: {
                                                try {
                                                    try {
                                                        try {
                                                            if (callSite6 != null) break block18;
                                                            if (e9.c("\u00f4", (Object)e9.c("\u00f4", (Object)e9.c("\u00f4", (Object)class_12972, (long)3310691710616353392L, (long)l), (Object)class_23382, (long)3308153530765122632L, (long)l), (long)3312396707447510966L, (long)l) == false) break block19;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw e9.c("\u00f2", (Object)matchException, (long)3311518055867436734L, (long)l);
                                                        }
                                                        callSite8 = callSite2;
                                                        if (callSite6 != null) break block20;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw e9.c("\u00f2", (Object)matchException, (long)3311518055867436734L, (long)l);
                                                    }
                                                    if (!(e9.c("o", (Object)callSite8, (long)3308697978751208406L, (long)l) <= (double)e9.c("\u00f4", (Object)e9.c("\u00f4", (Object)class_12972, (long)3310691710616353392L, (long)l), (long)3308628565277849904L, (long)l))) break block21;
                                                }
                                                catch (MatchException matchException) {
                                                    throw e9.c("\u00f2", (Object)matchException, (long)3311518055867436734L, (long)l);
                                                }
                                            }
                                            Object[] objectArray3 = new Object[4];
                                            objectArray3[3] = l4;
                                            objectArray3[2] = bt_02;
                                            objectArray3[1] = (Color)((Object)e9.c("\u00f4", (Object)this.h, (long)3312152200762230767L, (long)l));
                                            objectArray3[0] = callSite4;
                                            e9.c("\u00f4", (Object)this, (Object)objectArray3, (long)3308262605238276335L, (long)l);
                                        }
                                        catch (MatchException matchException) {
                                            throw e9.c("\u00f2", (Object)matchException, (long)3311518055867436734L, (long)l);
                                        }
                                    }
                                    return new class_243((double)e9.c("o", (Object)callSite4, (long)3310307287847237385L, (long)l), (double)(e9.c("\u00f4", (Object)class_23382, (long)3310459526746086575L, (long)l) + 1), (double)e9.c("o", (Object)callSite4, (long)3311415446682411317L, (long)l));
                                }
                                callSite8 = callSite5;
                            }
                            try {
                                block23: {
                                    try {
                                        try {
                                            try {
                                                if (callSite6 != null) break block22;
                                                if (callSite8 == null) break block23;
                                            }
                                            catch (MatchException matchException) {
                                                throw e9.c("\u00f2", (Object)matchException, (long)3311518055867436734L, (long)l);
                                            }
                                            callSite7 = callSite5;
                                            if (callSite6 != null) break block24;
                                        }
                                        catch (MatchException matchException) {
                                            throw e9.c("\u00f2", (Object)matchException, (long)3311518055867436734L, (long)l);
                                        }
                                        if (!(e9.c("\u00f4", (Object)callSite7, (Object)callSite2, (long)3308243033179728631L, (long)l) >= 0.1)) break block25;
                                    }
                                    catch (MatchException matchException) {
                                        throw e9.c("\u00f2", (Object)matchException, (long)3311518055867436734L, (long)l);
                                    }
                                }
                                Object[] objectArray4 = new Object[4];
                                objectArray4[3] = l4;
                                objectArray4[2] = bt_02;
                                objectArray4[1] = (Color)((Object)e9.c("\u00f4", (Object)this.g, (long)3312152200762230767L, (long)l));
                                objectArray4[0] = callSite2;
                                e9.c("\u00f4", (Object)this, (Object)objectArray4, (long)3308262605238276335L, (long)l);
                                callSite8 = callSite2;
                            }
                            catch (MatchException matchException) {
                                throw e9.c("\u00f2", (Object)matchException, (long)3311518055867436734L, (long)l);
                            }
                        }
                        callSite5 = callSite8;
                    }
                    callSite3 = e9.c("\u00f4", (Object)callSite3, (double)0.0, (double)0.08, (double)0.0, (long)3311989913359918342L, (long)l);
                    callSite7 = e9.c("\u00f4", (Object)callSite3, (double)0.98, (double)0.98, (double)0.98, (long)3311570385516423766L, (long)l);
                }
                callSite3 = callSite7;
                if (callSite6 == null) continue;
            }
            callSite = callSite4;
        }
        return callSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @bP
    public void a(bt_0 var1_1) {
        block31: {
            block33: {
                block32: {
                    block27: {
                        block29: {
                            block30: {
                                block28: {
                                    block25: {
                                        block26: {
                                            v0 = var2_2 = e9.p ^ 129365611868298L;
                                            var4_3 = v0 ^ 26434303482904L;
                                            var6_4 = v0 ^ 94598351933243L;
                                            var8_5 = v0 ^ 2527093022847L;
                                            var10_6 = v0 ^ 134079105842796L;
                                            var12_7 = v0 ^ 111032548301903L;
                                            var14_8 = v0 ^ 16129881240663L;
                                            var16_9 = v0 ^ 94812123323758L;
                                            v1 = new Object[1];
                                            v1[0] = var12_7;
                                            var19_10 = e9.c("\u00f2", (Object)v1, (long)2469524011817749345L, (long)var2_2);
                                            var18_11 = e9.c("\u00f2", (long)2475650219487316070L, (long)var2_2);
                                            try {
                                                v2 = var19_10;
                                                if (var18_11 != null) break block25;
                                                if (v2 != null) break block26;
                                            }
                                            catch (MatchException v3) {
                                                throw e9.c("\u00f2", (Object)v3, (long)2470127781445189901L, (long)var2_2);
                                            }
                                            return;
                                        }
                                        v2 = var19_10;
                                    }
                                    try {
                                        try {
                                            try {
                                                v4 = new Object[2];
                                                v4[1] = var14_8;
                                                v4[0] = v2;
                                                cfr_temp_0 = e9.c("\u00f2", (Object)v4, (long)2468764431934189069L, (long)var2_2) - 0.30000001192092896;
                                                v5 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                                if (var18_11 != null) break block27;
                                                if (v5 < 0) {
                                                }
                                                ** GOTO lbl99
                                            }
                                            catch (MatchException v6) {
                                                throw e9.c("\u00f2", (Object)v6, (long)2470127781445189901L, (long)var2_2);
                                            }
                                            if (e9.c("\u00f4", (Object)((Boolean)e9.c("\u00f4", (Object)this.i, (long)2469213815073278044L, (long)var2_2)), (long)2469483616962000616L, (long)var2_2) != false) break block28;
                                        }
                                        catch (MatchException v7) {
                                            throw e9.c("\u00f2", (Object)v7, (long)2470127781445189901L, (long)var2_2);
                                        }
                                        return;
                                    }
                                    catch (MatchException v8) {
                                        throw e9.c("\u00f2", (Object)v8, (long)2470127781445189901L, (long)var2_2);
                                    }
                                }
                                v9 = new Object[2];
                                v9[1] = var6_4;
                                v9[0] = var19_10;
                                var20_12 = e9.c("\u00f2", (Object)v9, (long)2469104709310918820L, (long)var2_2);
                                try {
                                    try {
                                        v10 = this;
                                        if (var18_11 != null) break block29;
                                        if (e9.c("\u00f4", (Object)((Boolean)e9.c("\u00f4", (Object)v10.l, (long)2469213815073278044L, (long)var2_2)), (long)2469483616962000616L, (long)var2_2) == false) break block30;
                                    }
                                    catch (MatchException v11) {
                                        throw e9.c("\u00f2", (Object)v11, (long)2470127781445189901L, (long)var2_2);
                                    }
                                    v12 = new Object[3];
                                    v12[2] = var10_6;
                                    v12[1] = Float.valueOf(0.8f);
                                    v12[0] = (Color)e9.c("\u00f4", (Object)this.m, (long)2469213815073278044L, (long)var2_2);
                                    v13 = new Object[3];
                                    v13[2] = var10_6;
                                    v13[1] = Float.valueOf(0.2f * (e9.c("\u00f4", (Object)((Float)e9.c("\u00f4", (Object)this.o, (long)2469213815073278044L, (long)var2_2)), (long)2468851395328108416L, (long)var2_2) / 255.0f));
                                    v13[0] = (Color)e9.c("\u00f4", (Object)this.n, (long)2469213815073278044L, (long)var2_2);
                                    v14 = new Object[9];
                                    v14[8] = var4_3;
                                    v14[7] = e9.c("\u00f2", (Object)v13, (long)2470048745182994007L, (long)var2_2);
                                    v14[6] = e9.c("\u00f2", (Object)v12, (long)2470048745182994007L, (long)var2_2);
                                    v14[5] = Float.valueOf(3.0f);
                                    v14[4] = Float.valueOf((float)e9.c("o", (Object)var20_12, (long)2470165902229188230L, (long)var2_2));
                                    v14[3] = Float.valueOf((float)e9.c("o", (Object)var20_12, (long)2475171412581336165L, (long)var2_2));
                                    v14[2] = Float.valueOf((float)e9.c("o", (Object)var20_12, (long)2469057752238749882L, (long)var2_2));
                                    v14[1] = var1_1.a;
                                    v14[0] = var1_1.b;
                                    e9.c("\u00f2", (Object)v14, (long)2474977040976478278L, (long)var2_2);
                                }
                                catch (MatchException v15) {
                                    throw e9.c("\u00f2", (Object)v15, (long)2470127781445189901L, (long)var2_2);
                                }
                            }
                            v10 = this;
                        }
                        try {
                            try {
                                v16 = new Object[3];
                                v16[2] = var8_5;
                                v16[1] = var1_1;
                                v16[0] = var19_10;
                                e9.c("\u00f4", (Object)v10, (Object)v16, (long)2468548488336444081L, (long)var2_2);
                                if (var18_11 == null) break block31;
lbl99:
                                // 2 sources

                                v17 = this;
                                if (var18_11 != null) break block32;
                            }
                            catch (MatchException v18) {
                                throw e9.c("\u00f2", (Object)v18, (long)2470127781445189901L, (long)var2_2);
                            }
                            v5 = e9.c("\u00f4", (Object)((Boolean)e9.c("\u00f4", (Object)v17.e, (long)2469213815073278044L, (long)var2_2)), (long)2469483616962000616L, (long)var2_2);
                        }
                        catch (MatchException v19) {
                            throw e9.c("\u00f2", (Object)v19, (long)2470127781445189901L, (long)var2_2);
                        }
                    }
                    if (v5 == false) {
                        return;
                    }
                    v17 = this;
                }
                v20 = new Object[3];
                v20[2] = var16_9;
                v20[1] = var1_1;
                v20[0] = var19_10;
                var20_12 = e9.c("\u00f4", (Object)v17, (Object)v20, (long)2469342171529659650L, (long)var2_2);
                try {
                    try {
                        v21 = var20_12;
                        if (var18_11 != null) break block33;
                        if (v21 == null) break block31;
                    }
                    catch (MatchException v22) {
                        throw e9.c("\u00f2", (Object)v22, (long)2470127781445189901L, (long)var2_2);
                    }
                    v21 = e9.c("\u00f4", (Object)this.l, (long)2469213815073278044L, (long)var2_2);
                }
                catch (MatchException v23) {
                    throw e9.c("\u00f2", (Object)v23, (long)2470127781445189901L, (long)var2_2);
                }
            }
            try {
                if (e9.c("\u00f4", (Object)((Boolean)v21), (long)2469483616962000616L, (long)var2_2) != false) {
                    v24 = new Object[3];
                    v24[2] = var10_6;
                    v24[1] = Float.valueOf(0.8f);
                    v24[0] = (Color)e9.c("\u00f4", (Object)this.m, (long)2469213815073278044L, (long)var2_2);
                    v25 = new Object[3];
                    v25[2] = var10_6;
                    v25[1] = Float.valueOf(0.2f * (e9.c("\u00f4", (Object)((Float)e9.c("\u00f4", (Object)this.o, (long)2469213815073278044L, (long)var2_2)), (long)2468851395328108416L, (long)var2_2) / 255.0f));
                    v25[0] = (Color)e9.c("\u00f4", (Object)this.n, (long)2469213815073278044L, (long)var2_2);
                    v26 = new Object[9];
                    v26[8] = var4_3;
                    v26[7] = e9.c("\u00f2", (Object)v25, (long)2470048745182994007L, (long)var2_2);
                    v26[6] = e9.c("\u00f2", (Object)v24, (long)2470048745182994007L, (long)var2_2);
                    v26[5] = Float.valueOf(3.0f);
                    v26[4] = Float.valueOf((float)e9.c("o", (Object)var20_12, (long)2470165902229188230L, (long)var2_2));
                    v26[3] = Float.valueOf((float)e9.c("o", (Object)var20_12, (long)2475171412581336165L, (long)var2_2));
                    v26[2] = Float.valueOf((float)e9.c("o", (Object)var20_12, (long)2469057752238749882L, (long)var2_2));
                    v26[1] = var1_1.a;
                    v26[0] = var1_1.b;
                    e9.c("\u00f2", (Object)v26, (long)2474977040976478278L, (long)var2_2);
                }
            }
            catch (MatchException v27) {
                throw e9.c("\u00f2", (Object)v27, (long)2470127781445189901L, (long)var2_2);
            }
        }
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return e9.c("\u00f2", (Object)((Object)q_0.Mace), (long)-2444269926096112776L, (long)l);
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (u[n3] != null) {
            return n3;
        }
        Object object = t[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 6;
            case 1 -> 60;
            case 2 -> 41;
            case 3 -> 43;
            case 4 -> 63;
            case 5 -> 4;
            case 6 -> 42;
            case 7 -> 32;
            case 8 -> 52;
            case 9 -> 15;
            case 10 -> 11;
            case 11 -> 20;
            case 12 -> 24;
            case 13 -> 51;
            case 14 -> 2;
            case 15 -> 34;
            case 16 -> 47;
            case 17 -> 23;
            case 18 -> 53;
            case 19 -> 9;
            case 20 -> 18;
            case 21 -> 39;
            case 22 -> 61;
            case 23 -> 5;
            case 24 -> 29;
            case 25 -> 48;
            case 26 -> 19;
            case 27 -> 49;
            case 28 -> 25;
            case 29 -> 3;
            case 30 -> 45;
            case 31 -> 7;
            case 32 -> 56;
            case 33 -> 12;
            case 34 -> 21;
            case 35 -> 17;
            case 36 -> 27;
            case 37 -> 36;
            case 38 -> 1;
            case 39 -> 58;
            case 40 -> 37;
            case 41 -> 10;
            case 42 -> 14;
            case 43 -> 44;
            case 44 -> 33;
            case 45 -> 40;
            case 46 -> 16;
            case 47 -> 57;
            case 48 -> 30;
            case 49 -> 28;
            case 50 -> 31;
            case 51 -> 0;
            case 52 -> 54;
            case 53 -> 62;
            case 54 -> 55;
            case 55 -> 8;
            case 56 -> 13;
            case 57 -> 22;
            case 58 -> 59;
            case 59 -> 26;
            case 60 -> 38;
            case 61 -> 35;
            case 62 -> 46;
            default -> 50;
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
        e9.u[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = e9.m(l, l2);
        Object object = t[n];
        if (object instanceof String) {
            String string = u[n];
            int n2 = string.indexOf(8);
            Class clazz = e9.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = e9.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = e9.g(clazz3, string2, clazz2)) != null) {
                    e9.t[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = e9.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        e9.t[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = e9.n(685428620379607L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = e9.m(l, l2);
        Object object = t[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = u[n];
                int n3 = string2.indexOf(8);
                clazz3 = e9.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = e9.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = e9.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        e9.t[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = e9.n(685428620379607L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = e9.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        e9.t[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = e9.n(685428620379607L, 0L);
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
        class_1657 class_16572 = (class_1657)objectArray[0];
        class_243 class_2432 = (class_243)objectArray[1];
        class_243 class_2433 = (class_243)objectArray[2];
        bt_0 bt_02 = (bt_0)objectArray[3];
        long l = (Long)objectArray[4];
        long l2 = (l = p ^ l) ^ 0x5E251D04BEDDL;
        Object object = class_2432;
        CallSite callSite = e9.c("\u00f2", (long)-3361092638542709914L, (long)l);
        Object object2 = class_2433;
        class_243 class_2434 = null;
        for (int i = 0; i < e9.c("\u00f4", (Object)((Integer)((Object)e9.c("\u00f4", (Object)this.j, (long)-3367515844530799780L, (long)l))), (long)-3366851092449177345L, (long)l); ++i) {
            class_243 class_2435;
            block32: {
                block30: {
                    CallSite callSite2;
                    block29: {
                        block27: {
                            block28: {
                                object = e9.c("\u00f4", (Object)object, (double)e9.c("o", (Object)object2, (long)-3367676305522914374L, (long)l), (double)0.0, (double)e9.c("o", (Object)object2, (long)-3366568249969549946L, (long)l), (long)-3361928921462210538L, (long)l);
                                class_2338 class_23382 = new class_2338((int)e9.c("\u00f2", (double)e9.c("o", (Object)object, (long)-3367676305522914374L, (long)l), (long)-3360952623650047766L, (long)l), (int)e9.c("\u00f2", (double)(e9.c("o", (Object)object, (long)-3361420872604764315L, (long)l) - 0.1), (long)-3360952623650047766L, (long)l), (int)e9.c("\u00f2", (double)e9.c("o", (Object)object, (long)-3366568249969549946L, (long)l), (long)-3360952623650047766L, (long)l));
                                try {
                                    try {
                                        try {
                                            try {
                                                if (callSite != null) break block27;
                                                if (e9.c("\u00f4", (Object)class_16572, (long)-3361201413299640579L, (long)l) == null) break block28;
                                            }
                                            catch (MatchException matchException) {
                                                throw e9.c("\u00f2", (Object)matchException, (long)-3366459487177231859L, (long)l);
                                            }
                                            callSite2 = e9.c("\u00f4", (Object)e9.c("\u00f4", (Object)e9.c("\u00f4", (Object)class_16572, (long)-3361201413299640579L, (long)l), (Object)class_23382, (long)-3360843290550312709L, (long)l), (long)-3367301021631059195L, (long)l);
                                            if (callSite != null) break block29;
                                        }
                                        catch (MatchException matchException) {
                                            throw e9.c("\u00f2", (Object)matchException, (long)-3366459487177231859L, (long)l);
                                        }
                                        if (callSite2 == false) break block28;
                                    }
                                    catch (MatchException matchException) {
                                        throw e9.c("\u00f2", (Object)matchException, (long)-3366459487177231859L, (long)l);
                                    }
                                    if (callSite == null) break;
                                }
                                catch (MatchException matchException) {
                                    throw e9.c("\u00f2", (Object)matchException, (long)-3366459487177231859L, (long)l);
                                }
                            }
                            object2 = e9.c("\u00f4", (Object)object2, (double)0.999, (double)1.0, (double)0.999, (long)-3367002061032712475L, (long)l);
                        }
                        try {
                            class_2435 = object2;
                            if (callSite != null) break block30;
                            reference cfr_temp_0 = e9.c("\u00f2", (double)e9.c("o", (Object)class_2435, (long)-3367676305522914374L, (long)l), (long)-3360937201281097415L, (long)l) - 0.005;
                            callSite2 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                        }
                        catch (MatchException matchException) {
                            throw e9.c("\u00f2", (Object)matchException, (long)-3366459487177231859L, (long)l);
                        }
                    }
                    try {
                        block31: {
                            try {
                                try {
                                    try {
                                        if (callSite2 >= 0) break block31;
                                        class_2435 = object2;
                                        if (callSite != null) break block30;
                                    }
                                    catch (MatchException matchException) {
                                        throw e9.c("\u00f2", (Object)matchException, (long)-3366459487177231859L, (long)l);
                                    }
                                    if (!(e9.c("\u00f2", (double)e9.c("o", (Object)class_2435, (long)-3366568249969549946L, (long)l), (long)-3360937201281097415L, (long)l) < 0.005)) break block31;
                                }
                                catch (MatchException matchException) {
                                    throw e9.c("\u00f2", (Object)matchException, (long)-3366459487177231859L, (long)l);
                                }
                                if (callSite == null) break;
                            }
                            catch (MatchException matchException) {
                                throw e9.c("\u00f2", (Object)matchException, (long)-3366459487177231859L, (long)l);
                            }
                        }
                        class_2435 = class_2434;
                    }
                    catch (MatchException matchException) {
                        throw e9.c("\u00f2", (Object)matchException, (long)-3366459487177231859L, (long)l);
                    }
                }
                try {
                    block33: {
                        try {
                            try {
                                try {
                                    if (callSite != null) break block32;
                                    if (class_2435 == null) break block33;
                                }
                                catch (MatchException matchException) {
                                    throw e9.c("\u00f2", (Object)matchException, (long)-3366459487177231859L, (long)l);
                                }
                                class_2435 = class_2434;
                                if (callSite != null) break block32;
                            }
                            catch (MatchException matchException) {
                                throw e9.c("\u00f2", (Object)matchException, (long)-3366459487177231859L, (long)l);
                            }
                            if (!(e9.c("\u00f4", (Object)class_2435, (Object)object, (long)-3361317768621369788L, (long)l) >= 0.1)) continue;
                        }
                        catch (MatchException matchException) {
                            throw e9.c("\u00f2", (Object)matchException, (long)-3366459487177231859L, (long)l);
                        }
                    }
                    Object[] objectArray2 = new Object[4];
                    objectArray2[3] = l2;
                    objectArray2[2] = bt_02;
                    objectArray2[1] = (Color)((Object)e9.c("\u00f4", (Object)this.k, (long)-3367515844530799780L, (long)l));
                    objectArray2[0] = object;
                    e9.c("\u00f4", (Object)this, (Object)objectArray2, (long)-3361302147699020708L, (long)l);
                    class_2435 = object;
                }
                catch (MatchException matchException) {
                    throw e9.c("\u00f2", (Object)matchException, (long)-3366459487177231859L, (long)l);
                }
            }
            class_2434 = class_2435;
            if (callSite == null) continue;
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

    private void j(Object[] objectArray) {
        class_1657 class_16572 = (class_1657)objectArray[0];
        bt_0 bt_02 = (bt_0)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l = p ^ l;
        long l3 = l2 ^ 0x24C29DD22003L;
        long l4 = l2 ^ 0x4A7F0424FD99L;
        long l5 = l2 ^ 0x4483E4A8937FL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l4;
        objectArray2[0] = class_16572;
        CallSite callSite = e9.c("\u00f2", (Object)objectArray2, (long)1217689133996409350L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = class_16572;
        CallSite callSite2 = e9.c("\u00f2", (Object)objectArray3, (long)1223459154934512484L, (long)l);
        class_243 class_2432 = new class_243((double)(e9.c("o", (Object)callSite, (long)1216471660930026008L, (long)l) - e9.c("o", (Object)callSite2, (long)1216471660930026008L, (long)l)), (double)e9.c("o", (Object)callSite, (long)1223729225648961223L, (long)l), (double)(e9.c("o", (Object)callSite, (long)1217615371103247396L, (long)l) - e9.c("o", (Object)callSite2, (long)1217615371103247396L, (long)l)));
        Object[] objectArray4 = new Object[5];
        objectArray4[4] = l5;
        objectArray4[3] = bt_02;
        objectArray4[2] = class_2432;
        objectArray4[1] = callSite;
        objectArray4[0] = class_16572;
        e9.c("\u00f4", (Object)this, (Object)objectArray4, (long)1217163656548029373L, (long)l);
    }

    private boolean lambda$new$0(Integer n) {
        long l = p ^ 0x1D6A8D03FE58L;
        return (boolean)e9.c("\u00f4", (Object)((Boolean)((Object)e9.c("\u00f4", (Object)this.e, (long)-6010616501621848434L, (long)l))), (long)-6010275225093130182L, (long)l);
    }

    private boolean lambda$new$2(Color color) {
        long l = p ^ 0x5FB9724894D3L;
        return (boolean)e9.c("\u00f4", (Object)((Boolean)((Object)e9.c("\u00f4", (Object)this.e, (long)-4171104077743002619L, (long)l))), (long)-4171331245580135759L, (long)l);
    }

    private boolean lambda$new$1(Color color) {
        long l = p ^ 0x1DD9E951C89DL;
        return (boolean)e9.c("\u00f4", (Object)((Boolean)((Object)e9.c("\u00f4", (Object)this.e, (long)-7326511548985724853L, (long)l))), (long)-7326734039670583553L, (long)l);
    }

    private boolean lambda$new$3(Integer n) {
        long l = p ^ 0x1367548AC038L;
        return (boolean)e9.c("\u00f4", (Object)((Boolean)((Object)e9.c("\u00f4", (Object)this.i, (long)-7857076905106491154L, (long)l))), (long)-7856748854929586598L, (long)l);
    }

    private boolean lambda$new$4(Color color) {
        long l = p ^ 0x419DA4E56CE2L;
        return (boolean)e9.c("\u00f4", (Object)((Boolean)((Object)e9.c("\u00f4", (Object)this.i, (long)4480057794969211956L, (long)l))), (long)4480354241694182016L, (long)l);
    }

    private boolean lambda$new$5(Color color) {
        long l = p ^ 0xF44E15FF2DBL;
        return (boolean)e9.c("\u00f4", (Object)((Boolean)((Object)e9.c("\u00f4", (Object)this.l, (long)-6911598204879992307L, (long)l))), (long)-6911859221422000967L, (long)l);
    }

    private boolean lambda$new$6(Color color) {
        long l = p ^ 0x7DC9F35ADD46L;
        return (boolean)e9.c("\u00f4", (Object)((Boolean)((Object)e9.c("\u00f4", (Object)this.l, (long)-8104121425140144752L, (long)l))), (long)-8103851334548645084L, (long)l);
    }

    private boolean lambda$new$7(Float f) {
        long l = p ^ 0x537429C536CCL;
        return (boolean)e9.c("\u00f4", (Object)((Boolean)((Object)e9.c("\u00f4", (Object)this.l, (long)7206408380053474842L, (long)l))), (long)7206736424718626990L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(e9.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(e9.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1792
 *  net.minecraft.class_310
 *  net.minecraft.class_3965
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bl_0;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dQ;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.f5;
import dev.zprestige.prestige.hc;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1792;
import net.minecraft.class_310;
import net.minecraft.class_3965;

/*
 * Renamed from dev.zprestige.prestige.ek
 */
public class ek_0
extends dV {
    private dM d;
    private dM a;
    private dQ c;
    private f5 e;
    private static final class_1792[] f;
    private int g;
    private int h;
    private static final long k;
    private static final long[] l;
    private static final Integer[] m;
    private static final Map n;
    private static final Object[] o;
    private static final String[] p;

    public ek_0() {
        long l = k ^ 0x58C6086C69F7L;
        long l2 = l ^ 0x1D24B5E02364L;
        this.e = new f5(l2);
        this.g = -1;
        this.h = -1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ek_0.k = hc.a(856572922473690983L, -1098084837615995117L, MethodHandles.lookup().lookupClass()).a(37286785273173L);
                var11 = ek_0.k ^ 98299157904303L;
                ek_0.o = new Object[88];
                ek_0.p = new String[88];
                ek_0.f();
                ek_0.n = new HashMap<K, V>(13);
                var0_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var11 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var11 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var6_3 = new long[4];
                var3_4 = 0;
                var4_5 = "/\u00f5\u00a99\u0082\u00e7\u00d9\u00c7\u00b2z\u00e3\u0013\u0005\u00cc`\t";
                var5_6 = "/\u00f5\u00a99\u0082\u00e7\u00d9\u00c7\u00b2z\u00e3\u0013\u0005\u00cc`\t".length();
                var2_7 = 0;
                while (true) {
                    var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                    v3 = var6_3;
                    v4 = var3_4++;
                    v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl41:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var2_7 < var5_6) ** continue;
                    var4_5 = "\u00eb>\u0099\u0001\u00f5\u001a\u000fS\u00d05\u001dn\u00b1\u008a\u00d2K";
                    var5_6 = "\u00eb>\u0099\u0001\u00f5\u001a\u000fS\u00d05\u001dn\u00b1\u008a\u00d2K".length();
                    var2_7 = 0;
                    while (true) {
                        var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                        v3 = var6_3;
                        v4 = var3_4++;
                        v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl60:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var2_7 < var5_6) ** continue;
                    break block9;
                    break;
                }
            }
            var8_9 = v5;
            var10_10 = var0_1.doFinal(new byte[]{(byte)(var8_9 >>> 56), (byte)(var8_9 >>> 48), (byte)(var8_9 >>> 40), (byte)(var8_9 >>> 32), (byte)(var8_9 >>> 24), (byte)(var8_9 >>> 16), (byte)(var8_9 >>> 8), (byte)var8_9});
            v7 = ((long)var10_10[0] & 255L) << 56 | ((long)var10_10[1] & 255L) << 48 | ((long)var10_10[2] & 255L) << 40 | ((long)var10_10[3] & 255L) << 32 | ((long)var10_10[4] & 255L) << 24 | ((long)var10_10[5] & 255L) << 16 | ((long)var10_10[6] & 255L) << 8 | (long)var10_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl73:
                // 1 sources

                ** continue;
            }
        }
        ek_0.l = var6_3;
        ek_0.m = new Integer[4];
        v8 = new class_1792[ek_0.b("x", (int)29274, (long)(2081833168103111135L ^ var11))];
        v8[0] = ek_0.c("\u00df", (long)-3841722768893790426L, (long)var11);
        v8[1] = ek_0.c("\u00df", (long)-3840659695539940445L, (long)var11);
        v8[2] = ek_0.c("\u00df", (long)-3839922809381078540L, (long)var11);
        v8[3] = ek_0.c("\u00df", (long)-3841410700250404244L, (long)var11);
        v8[4] = ek_0.c("\u00df", (long)-3840892666259474931L, (long)var11);
        v8[5] = ek_0.c("\u00df", (long)-3842004027579876991L, (long)var11);
        ek_0.f = v8;
    }

    @Override
    public void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        this.g = -1;
        this.h = -1;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ek_0.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4126;
        if (m[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = ek_0.l[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])ek_0.n.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    ek_0.n.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/ek", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ek_0.m[n2] = n3;
        }
        return m[n2];
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ek" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ek" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ek_0.m(l, l2);
            object = o[n];
            try {
                if (!(object instanceof String)) break block2;
                ek_0.o[n] = clazz = Class.forName(p[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ek_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ek_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = ek_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ek_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = o;
        o[0] = "Uv|\u0001\u0015APcw\u0001\u001eZ\\s5h5pm";
        objectArray[1] = Long.TYPE;
        ek_0.p[1] = "java/lang/Long";
        objectArray[2] = Integer.TYPE;
        ek_0.p[2] = "java/lang/Integer";
        objectArray[3] = "%_.&\u0005\u0006%_9z\t\t?\u00149d\t\u001c8ei9X";
        objectArray[4] = "=@\u0001\u001b\rK=@\u0016G\u0001D'\u000b\u0016Y\u0001Q zD\u0005T\u0013";
        objectArray[5] = "\u001eG\u001d_>M\bG\u0018\u0005-Z\u001f\f\u001b\u0003!N\u000eK\f\u0014jX\u0011";
        objectArray[6] = "VFVM C#f]B1\fBhVI5V6";
        objectArray[7] = Void.TYPE;
        ek_0.p[7] = "java/lang/Void";
        objectArray[8] = "ng\n\u0010\u0006!xg\u000fJ\u00156o,\fL\u0019\"~k\u001b[R0B";
        objectArray[9] = "_5\bq!\\*\u0015\u0003~0\u0013W\r\u0010y9Z?";
        objectArray[10] = "\u007fH\u0004\u001f\b:\u007fH\u0013C\u00045e\u0003\u0013]\u0004 brB\u0003Qe";
        objectArray[11] = "&(<~07&(+\"<8<c+<<-;\u0012zbif";
        objectArray[12] = "{\u0018Q\u001b^;{\u0018FGR4aSFYR!f\"\u0017\u0006\n";
        objectArray[13] = "\u0016qU|Yv\u0016qB Uy\f:B>Ul\u000bK\u0016f\u0002";
        objectArray[14] = "\u0000cE:`A\u0016c@`sV\u0001(Cf\u007fB\u0010oTq4WQ";
        objectArray[15] = "\u0015\u000e<YB\u0002`.7VSM\u0001 <]W\u0017u";
        objectArray[16] = Boolean.TYPE;
        ek_0.p[16] = "java/lang/Boolean";
        objectArray[17] = "7oZ;If7oMgEi-$MyE|*U\u001c&\u00177";
        objectArray[18] = "QyF\t0wZvWFQyQ}S\u001c";
        objectArray[19] = "\u001e2$\u0015f\u0002\u001e23Ij\r\u0004y3Wj\u0018\u0003\bf\b3";
        objectArray[20] = "Nz\u001am\u000etXz\u001f7\u001dcO1\u001c1\u0011w^v\u000b&ZgX";
        objectArray[21] = "M>\u0014\u001d3\u00138\u001e\u001f\u0012\"\\Y\u0010\u0014\u0019&\u0006-";
        objectArray[22] = "A\u0005\u0004\u000e\u0005#A\u0005\u0013R\t,[N\u0013L\t9\\?D\u0013_";
        objectArray[23] = "N)I\u0019.*N)^E\"%Tb^[\"0S\u0013\f\u0000zz";
        objectArray[24] = "\nmdXs\u0000\nms\u0004\u007f\u000f\u0010&s\u001a\u007f\u001a\u0017W\"@&Y";
        objectArray[25] = "H\"\u001c1l\u0002=\u0002\u0017>}M\\\f\u001c5y\u0017(";
        objectArray[26] = "L8As>*9\u0018J|/eX\u0016Aw+?,";
        objectArray[27] = "0\u0004\u001a\"LR;\u000b\u000bm+P.\u0000\u000b&\u0010";
        objectArray[28] = "+z~\nO\u0006^Zu\u0005^I?T~\u000eZ\u0013K";
        objectArray[29] = "\u0017Ta]fV\u001c[p\u0012\nU\u0012Yr]&";
        objectArray[30] = "\b\u0011Z)'%}1Q&6j\u001c?Z-20h";
        objectArray[31] = "Lqd\u0010\u0011QG~u_r\\Rsz4G^C`f\u0018PS";
        objectArray[32] = "\u001cp\u0014c,iiP\u001fl=&\b^\u0014g9||";
        objectArray[33] = "~5<iIrh593Ze\u007f~:5Vqn9-\"\u001dfQ";
        objectArray[34] = ")~\u001c\u0002u7\"q\rM\u001d7,~\u001e";
        objectArray[35] = Float.TYPE;
        ek_0.p[35] = "java/lang/Float";
        objectArray[36] = "w${\u001e_\tw$lBS\u0006mol\\S\u0013j\u001e<\t\u0004U";
        objectArray[37] = "w.1\\\u001dOw.&\u0000\u0011@me&\u001e\u0011Uj\u0014tJ@\u0014";
        objectArray[38] = "So\u0001\u0005KgSo\u0016YGhI$\u0016GG}NUD\u001c\u001f<";
        objectArray[39] = "Q7R;2($\u0017Y4#gE\u0019R?'=1";
        objectArray[40] = "Vo\u0011@WW@o\u0014\u001aD@W$\u0017\u001cHTFc\u0000\u000b\u0003Cc";
        objectArray[41] = "`{YsQ7\u0015[R|@xtUYwD\"\u0000";
        objectArray[42] = "lI\u0007\u000f4\u0016\u0019i\f\u0000%Yxg\u0007\u000b!\u0003\f";
        objectArray[43] = "\u007fD\u001dP\br\u007fD\n\f\u0004}e\u000f\n\u0012\u0004hb~XHS*";
        objectArray[44] = "f\u0002M+^>2\u0003A\u0012Jad\u0011c\u007fY@m\u0013W\u007foxv\u0012Kt%zvS\u0012bL9:\u000e,+[<h\u0013\u0015#Hx1n\u0015l\u001cgwW\u001d\u007fX>\n";
        objectArray[45] = "BeYit\f\u0000)\u0003<\u0014S\u0015$ZcxaBb\u00044/6C7Wb}]H'Q9\u0014";
        objectArray[46] = "\u0013e\u0005(z\u0013\u0013i\u0017%\u0003M(v\u0011x<JZg\u0015y>/\u0015;\u001e8rMU2\u001b:\u0003";
        objectArray[47] = "\u0001IRG\u000e@YHD\u001f4V<\rHL\u000bFR\r\u0017]\u000e<";
        objectArray[48] = "J_A{G,M\u000bNnx.\u0014\rDr/qDP\u001f\u001eH)\f\u001fKdE&\t\u0011";
        objectArray[49] = "Tl1u\u0014t_|7.}z\u0002\u007f<t\u0011HS?m+}`\u0013>bc\u0014#_c\\";
        objectArray[50] = "(e\u001d#9+j)GvY\u007fs5\u001a\"\u000e(-fCNi}|;\u0003+aq~f";
        objectArray[51] = "/LBS\u0000Um\u0000\u0018\u0006`\u0001t\u001cER7V*K\u001d>QU(\u001bS\u0006PRnH";
        objectArray[52] = "\u001cJCPE$G\u0003\u001bX7+-F\u0012\u0007\b'_W\u0016\u0006\nBGT\u0018Z\u000b<\\J\u0007I7";
        objectArray[53] = "8e.X{An;1\u0000\u001cM*w%Ug ?3u^&\u001bkm1T\u001cJ=m/\rbQ#r<1";
        objectArray[54] = "\u0004;Jv;-Fw\u0010#[y_kMw\f.\u00006\u0016\u001b7qPd@zgj\u000ea";
        objectArray[55] = "C\u0019J\u0010q\u001eA\u001cGJ\u001a\u0001.\u000eZE%\n\\\u001f^D'oD\u001cP\u0018&\u0011_\u0002O\u000b\u001a";
        objectArray[56] = ":\u0003*sC!2\u0014$p.'2\u001e'si7[C$'L$bK7c\u0015Y:\u0003*sC!2\u0014$p.";
        objectArray[57] = "0^\u0018#\bdrO\u0005rqc)M\u001bq&7r\u0018E!qt8CGmJrvL\u001e";
        objectArray[58] = "\u0001RL]\u0012\u007f\u0006XST*f\u0002\\\\\u0003FTP\u0011\u0004U*z\u001fC\u0004\u0014\u0011|QL]d";
        objectArray[59] = "v:t6}`4v.c\u001d4-js7Jcs:*[s4/|t;ee4b";
        objectArray[60] = "3~1t_\u0013(o2;'BI|f:\u0018M;mb;\u001a(t1izVJ48lx'";
        objectArray[61] = ")8sw\u0015\u007fk)n&lx0+p%;&oz+I\u0015f2~dr\u0013(='";
        objectArray[62] = "2b\u0017x$b3eQ+V?n$Ju:\r=`\u0016-V4q(\u0013**3{7\u001a\u0012";
        objectArray[63] = "(\u001f\u0005lcu)\u0018C?\u0011(tYXa}\u001a\"\u001c\u0005:!MeWVk/&'B\u0001a\u0011";
        objectArray[64] = "DY\u0012y\u0005\u0012ET\u000fsi\u0014I\u0014\nu\u0005&\u0018UV-UqN\u0006\rqU\u000fU\u0018\u0012bi";
        objectArray[65] = "S6J\f+\u0014S:X\u0001RDh%^\\mM\u001a4Z]o(\u00027T\u0001nV\u0019)K\u0012R";
        objectArray[66] = "b5\"+\t04k=sn4d& %\u0002\u00060bx}RQb5\"+\t04k=sn";
        objectArray[67] = "LdDW$\u0002Mc\u0002\u0004V_\u0010\"\u0019Z:mGbD\u0004k:\u00161\u001bT1[@o\u0004\fV";
        objectArray[68] = "K\u0004l]Lj\u0010M4U>ez\b=\n\u0001i\b\u00199\u000b\u0003\fGE2JOn\u0007L7H>";
        objectArray[69] = "N{T!\f\u0018\f7\u000etlG\u0019:W+\u0000uM{\t}lH\u001a!Tp\u0012S\u0004>GL";
        objectArray[70] = "mLEufB/]X$\u001fEt_F'H\u001b.\u0002\u001dKf[v\nRp`\u0015yS";
        objectArray[71] = "KMl\u0006\u0005\u0003\u001bV2\u0003l\u0007JWb\u0003\u00005\u0017\u00108\\l\tHIk\u0003\r_\u0016V3d\fS_@n\u0007\r^BJ\u0002";
        objectArray[72] = "ZO_o\u0007'\u0018^B>~ C\\\\=)~\u0019\u000e\u0007Q\u0007>A\tHj\u0001pNP";
        objectArray[73] = ";\u0004X`:\u0006`M\u0000hH\n\n\b\t7w\u0005x\u0019\r6u``\u001a\u0003jt\u001e{\u0004\u001cyH";
        objectArray[74] = "\u0013icnD<\u0013eqc=i(zw>\u0002eZks?\u0000\u0000I\u007fjmPxAhdn=";
        objectArray[75] = "?Y*\u001aAI7N$\u0019,P8\\\u0004\u001eHL3 c\t\u0015S#\u0019k\u001aQ\n^";
        objectArray[76] = "\u0007g2u@\r\u0005b?/+\u0017jp\" \u0014\u0019\u0018a&!\u0016|\u0000b(}\u0017\u0002\u001b|7n+";
        objectArray[77] = "<]Qz\u0012w~LL+kp%NR(<.\u007f\u0018\u000bD\u0012n'\u001bF\u007f\u0014 (B";
        objectArray[78] = "-)p_J:)|y]w<)$oS\u001e0\u0010*oC\u001aV$-l]K(?3sNw";
        objectArray[79] = "\u001e\r4H:L\u001c\b9\u0012QTs\u001a$\u001dnX\u0001\u000b \u001cl=NW+] _\u000e^._Q";
        objectArray[80] = "O4D]{)O8VP\u0002|t?ZX}(Lj\u0006A8\u0015\u0010<VL?-E`O\t\u0002";
        objectArray[81] = "c\u001d;t7\u001aa\u00186.\\\u0002\u000e\n+!c\u000e|\u001b/ ak7\b\u007f}!R?\u001b;$\\";
        objectArray[82] = "ra4J\b\u00030tc@6\rco:@Z?3/a\u00176Qp*8Z\u000fYcna'X\u001a~*b[_\u0010a#Z";
        objectArray[83] = "k\u001b\u000eV4U)\n\u0013\u0007MRr\b\r\u0004\u001a\f/]Rh4Lp]\u0019S2\u0002\u007f\u0004";
        objectArray[84] = "WE\u0016D\u0010\u0007\u000b\u0018GQz\f1\u0019\u0010\u0013\u0015_\nMNW\u001fe";
        objectArray[85] = "+E\u0018\u0016qs>A\u0002\u0015\u0015l(\u0018\u0015\u0003Kk(\u0002\u0011\u007fr|2O\u001cAjf+\u001f|";
        objectArray[86] = "\u000bH2\u0004_;MO-L>d\u001eT2\u001aRVJ\u0017mB\u0001\u0001\u0018G0\u0014Y`N\u0019/L>";
        Object[] objectArray2 = objectArray;
        objectArray[87] = "^{y\u0007Q0_vd\r=6S6a\u000bQ\u0004\u0004t;T\u0001S\u000e#x\u0013V)\u0003,}\u001d=";
    }

    private boolean d(Object[] objectArray) {
        long l;
        long l2;
        block20: {
            Object object;
            long l3;
            block18: {
                CallSite callSite;
                long l4;
                block16: {
                    block17: {
                        block14: {
                            long l5;
                            block15: {
                                l2 = (Long)objectArray[0];
                                long l6 = l2 = k ^ l2;
                                l5 = l6 ^ 0x6C68C2F64477L;
                                l3 = l6 ^ 0x1FF2BD56FC6DL;
                                l = l6 ^ 0x1D2794C3106DL;
                                l4 = l6 ^ 0x44A6DF6FD405L;
                                callSite = ek_0.c("\u00ff", (long)2743202299186299482L, (long)l2);
                                try {
                                    try {
                                        object = this.g;
                                        if (callSite != null) break block14;
                                        if (object != -1) break block15;
                                    }
                                    catch (MatchException matchException) {
                                        throw ek_0.c("\u00ff", (Object)matchException, (long)2742148319642073004L, (long)l2);
                                    }
                                    return false;
                                }
                                catch (MatchException matchException) {
                                    throw ek_0.c("\u00ff", (Object)matchException, (long)2742148319642073004L, (long)l2);
                                }
                            }
                            Object[] objectArray2 = new Object[2];
                            objectArray2[1] = l5;
                            objectArray2[0] = this.c;
                            object = ek_0.c("L", (Object)this.e, (Object)objectArray2, (long)2740554944396123396L, (long)l2);
                        }
                        try {
                            try {
                                if (callSite != null) break block16;
                                if (object != 0) break block17;
                            }
                            catch (MatchException matchException) {
                                throw ek_0.c("\u00ff", (Object)matchException, (long)2742148319642073004L, (long)l2);
                            }
                            return true;
                        }
                        catch (MatchException matchException) {
                            throw ek_0.c("\u00ff", (Object)matchException, (long)2742148319642073004L, (long)l2);
                        }
                    }
                    object = this.h;
                }
                try {
                    block19: {
                        try {
                            try {
                                if (callSite != null) break block18;
                                if (object == -1) break block19;
                            }
                            catch (MatchException matchException) {
                                throw ek_0.c("\u00ff", (Object)matchException, (long)2742148319642073004L, (long)l2);
                            }
                            Object[] objectArray3 = new Object[3];
                            objectArray3[2] = l4;
                            objectArray3[1] = this.g;
                            objectArray3[0] = this.h;
                            ek_0.c("\u00ff", (Object)objectArray3, (long)2744907495855771199L, (long)l2);
                            if (callSite == null) break block20;
                        }
                        catch (MatchException matchException) {
                            throw ek_0.c("\u00ff", (Object)matchException, (long)2742148319642073004L, (long)l2);
                        }
                    }
                    object = this.g;
                }
                catch (MatchException matchException) {
                    throw ek_0.c("\u00ff", (Object)matchException, (long)2742148319642073004L, (long)l2);
                }
            }
            Object[] objectArray4 = new Object[2];
            objectArray4[1] = l3;
            objectArray4[0] = object;
            ek_0.c("\u00ff", (Object)objectArray4, (long)2740935084252780199L, (long)l2);
        }
        this.g = -1;
        this.h = -1;
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l;
        ek_0.c("L", (Object)this, (Object)objectArray5, (long)2743149202075319624L, (long)l2);
        return true;
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ek_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00da' || c == '\u00ee' || c == '\u00df' || c == '\u00ed') {
                field = ek_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00da' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ee' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00df' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ek_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'L' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ff' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private Integer a(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        long l = (Long)objectArray[2];
        l = k ^ l;
        class_1792[] class_1792Array = f;
        int n3 = class_1792Array.length;
        CallSite callSite = ek_0.c("\u00ff", (long)5959332271707174648L, (long)l);
        for (int i = 0; i < n3; ++i) {
            Object object = class_1792Array[i];
            block3: while (true) {
                class_1792 class_17922 = object;
                for (int j = n; j < n2; ++j) {
                    object = ek_0.c("L", (Object)ek_0.c("L", (Object)ek_0.c("L", (Object)ek_0.c("\u00da", (Object)b, (long)5959668537539334204L, (long)l), (long)5960495071762943966L, (long)l), (int)j, (long)5957316343622547154L, (long)l), (long)5960114467633104160L, (long)l);
                    if (callSite != null) continue block3;
                    try {
                        if (object != class_17922) continue;
                        return ek_0.c("\u00ff", (int)j, (long)5959987360908276943L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw ek_0.c("\u00ff", (Object)matchException, (long)5957157891304276750L, (long)l);
                    }
                }
                break;
            }
            if (callSite == null) continue;
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @bP
    public void a(bl_0 bl_02) {
        ek_0 ek_02;
        long l;
        long l2;
        long l3;
        long l4;
        long l5;
        block80: {
            CallSite callSite;
            block78: {
                CallSite callSite2;
                block79: {
                    ek_0 ek_03;
                    long l6;
                    block77: {
                        CallSite callSite3;
                        block75: {
                            long l7;
                            block76: {
                                class_310 class_3102;
                                long l8;
                                block72: {
                                    block73: {
                                        ek_0 ek_04;
                                        block74: {
                                            Object object;
                                            block70: {
                                                CallSite callSite4;
                                                long l9;
                                                block67: {
                                                    block68: {
                                                        ek_0 ek_05;
                                                        block69: {
                                                            Object object2;
                                                            block65: {
                                                                Object object3;
                                                                block64: {
                                                                    block63: {
                                                                        block62: {
                                                                            class_310 class_3103;
                                                                            block60: {
                                                                                block61: {
                                                                                    block59: {
                                                                                        long l10 = l5 = k ^ 0x6CB93D4DA3E0L;
                                                                                        l9 = l10 ^ 0x5149B52B85FAL;
                                                                                        l4 = l10 ^ 0x539DDA83F158L;
                                                                                        l8 = l10 ^ 0x65358DB0A34AL;
                                                                                        l6 = l10 ^ 0x1CB053B5C899L;
                                                                                        l3 = l10 ^ 0x1E657A202499L;
                                                                                        l7 = l10 ^ 0x3CF5121A35E2L;
                                                                                        l2 = l10 ^ 0x449C07A7754AL;
                                                                                        l = l10 ^ 0x47E4318CE0F1L;
                                                                                        callSite2 = ek_0.c("\u00ff", (long)1361719544689456814L, (long)l5);
                                                                                        try {
                                                                                            try {
                                                                                                class_3103 = b;
                                                                                                if (callSite2 != null) break block59;
                                                                                                if (ek_0.c("\u00da", (Object)class_3103, (long)1360356646312063215L, (long)l5) != null) return;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw ek_0.c("\u00ff", (Object)matchException, (long)1367425351270007640L, (long)l5);
                                                                                            }
                                                                                            class_3103 = b;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw ek_0.c("\u00ff", (Object)matchException, (long)1367425351270007640L, (long)l5);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            if (callSite2 != null) break block60;
                                                                                            if (ek_0.c("L", (Object)class_3103, (long)1368895170681088982L, (long)l5) != false) break block61;
                                                                                            return;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw ek_0.c("\u00ff", (Object)matchException, (long)1367425351270007640L, (long)l5);
                                                                                        }
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw ek_0.c("\u00ff", (Object)matchException, (long)1367425351270007640L, (long)l5);
                                                                                    }
                                                                                }
                                                                                class_3103 = b;
                                                                            }
                                                                            callSite4 = ek_0.c("L", (Object)ek_0.c("L", (Object)ek_0.c("\u00da", (Object)class_3103, (long)1360930838326399082L, (long)l5), (long)1368780194513555511L, (long)l5), (long)1368723473464533431L, (long)l5);
                                                                            try {
                                                                                try {
                                                                                    object3 = ek_0.c("L", (Object)((Boolean)((Object)ek_0.c("L", (Object)this.d, (long)1367731389152451170L, (long)l5))), (long)1368436698833469677L, (long)l5);
                                                                                    if (callSite2 != null) break block62;
                                                                                    if (object3 == false) break block63;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw ek_0.c("\u00ff", (Object)matchException, (long)1367425351270007640L, (long)l5);
                                                                                }
                                                                                object3 = ek_0.c("\u00ff", (long)ek_0.c("L", (Object)ek_0.c("L", (Object)b, (long)1361612668633725850L, (long)l5), (long)1360759706042254655L, (long)l5), (int)0, (long)1361518745562778993L, (long)l5);
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw ek_0.c("\u00ff", (Object)matchException, (long)1367425351270007640L, (long)l5);
                                                                            }
                                                                        }
                                                                        try {
                                                                            try {
                                                                                if (callSite2 != null) break block64;
                                                                                if (object3 == 1) break block63;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw ek_0.c("\u00ff", (Object)matchException, (long)1367425351270007640L, (long)l5);
                                                                            }
                                                                            object3 = 1;
                                                                            break block64;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw ek_0.c("\u00ff", (Object)matchException, (long)1367425351270007640L, (long)l5);
                                                                        }
                                                                    }
                                                                    object3 = 0;
                                                                }
                                                                Object object4 = object3;
                                                                CallSite callSite5 = ek_0.c("\u00da", (Object)b, (long)1360794859574016369L, (long)l5);
                                                                try {
                                                                    try {
                                                                        block66: {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                object2 = callSite5 instanceof class_3965;
                                                                                                if (callSite2 != null) break block65;
                                                                                                if (!object2) break block66;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw ek_0.c("\u00ff", (Object)matchException, (long)1367425351270007640L, (long)l5);
                                                                                            }
                                                                                            object2 = ek_0.c("L", (Object)ek_0.c("L", (Object)((class_3965)callSite5), (long)1367875710972313408L, (long)l5), (Object)callSite4, (long)1361030241037207250L, (long)l5);
                                                                                            if (callSite2 != null) break block65;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw ek_0.c("\u00ff", (Object)matchException, (long)1367425351270007640L, (long)l5);
                                                                                        }
                                                                                        if (!object2) break block66;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw ek_0.c("\u00ff", (Object)matchException, (long)1367425351270007640L, (long)l5);
                                                                                    }
                                                                                    object = object4;
                                                                                    if (callSite2 != null) break block67;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw ek_0.c("\u00ff", (Object)matchException, (long)1367425351270007640L, (long)l5);
                                                                                }
                                                                                if (object == false) break block68;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw ek_0.c("\u00ff", (Object)matchException, (long)1367425351270007640L, (long)l5);
                                                                            }
                                                                        }
                                                                        ek_05 = this;
                                                                        if (callSite2 != null) break block69;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw ek_0.c("\u00ff", (Object)matchException, (long)1367425351270007640L, (long)l5);
                                                                    }
                                                                    Object[] objectArray = new Object[1];
                                                                    objectArray[0] = l9;
                                                                    object2 = ek_0.c("L", (Object)ek_05, (Object)objectArray, (long)1368603523645586636L, (long)l5);
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw ek_0.c("\u00ff", (Object)matchException, (long)1367425351270007640L, (long)l5);
                                                                }
                                                            }
                                                            if (object2) return;
                                                            ek_05 = this;
                                                        }
                                                        Object[] objectArray = new Object[1];
                                                        objectArray[0] = l3;
                                                        ek_0.c("L", (Object)ek_05, (Object)objectArray, (long)1361666985640544700L, (long)l5);
                                                        return;
                                                    }
                                                    object = ek_0.c("L", (Object)ek_0.c("L", (Object)ek_0.c("\u00da", (Object)b, (long)1361075905478491723L, (long)l5), (Object)callSite4, (long)1369090809448059497L, (long)l5), (long)1368566667295396209L, (long)l5);
                                                }
                                                try {
                                                    try {
                                                        block71: {
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (callSite2 != null) break block70;
                                                                        if (object != false) break block71;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw ek_0.c("\u00ff", (Object)matchException, (long)1367425351270007640L, (long)l5);
                                                                    }
                                                                    class_3102 = b;
                                                                    if (callSite2 != null) break block72;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw ek_0.c("\u00ff", (Object)matchException, (long)1367425351270007640L, (long)l5);
                                                                }
                                                                if (ek_0.c("L", (Object)ek_0.c("L", (Object)ek_0.c("\u00da", (Object)class_3102, (long)1361075905478491723L, (long)l5), (Object)callSite4, (long)1369090809448059497L, (long)l5), (long)1367920541734076048L, (long)l5) != ek_0.c("\u00df", (long)1360667094826016287L, (long)l5)) break block73;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw ek_0.c("\u00ff", (Object)matchException, (long)1367425351270007640L, (long)l5);
                                                            }
                                                        }
                                                        ek_04 = this;
                                                        if (callSite2 != null) break block74;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw ek_0.c("\u00ff", (Object)matchException, (long)1367425351270007640L, (long)l5);
                                                    }
                                                    Object[] objectArray = new Object[1];
                                                    objectArray[0] = l9;
                                                    object = ek_0.c("L", (Object)ek_04, (Object)objectArray, (long)1368603523645586636L, (long)l5);
                                                }
                                                catch (MatchException matchException) {
                                                    throw ek_0.c("\u00ff", (Object)matchException, (long)1367425351270007640L, (long)l5);
                                                }
                                            }
                                            if (object != false) return;
                                            ek_04 = this;
                                        }
                                        Object[] objectArray = new Object[1];
                                        objectArray[0] = l3;
                                        ek_0.c("L", (Object)ek_04, (Object)objectArray, (long)1361666985640544700L, (long)l5);
                                        return;
                                    }
                                    class_3102 = b;
                                }
                                try {
                                    try {
                                        Object[] objectArray = new Object[2];
                                        objectArray[1] = l8;
                                        objectArray[0] = ek_0.c("L", (Object)ek_0.c("\u00da", (Object)class_3102, (long)1360930838326399082L, (long)l5), (long)1360556807611405081L, (long)l5);
                                        callSite3 = ek_0.c("\u00ff", (Object)objectArray, (long)1368251077766367721L, (long)l5);
                                        if (callSite2 != null) break block75;
                                        if (callSite3 == false) break block76;
                                    }
                                    catch (MatchException matchException) {
                                        throw ek_0.c("\u00ff", (Object)matchException, (long)1367425351270007640L, (long)l5);
                                    }
                                    Object[] objectArray = new Object[1];
                                    objectArray[0] = l3;
                                    ek_0.c("L", (Object)this, (Object)objectArray, (long)1361666985640544700L, (long)l5);
                                    return;
                                }
                                catch (MatchException matchException) {
                                    throw ek_0.c("\u00ff", (Object)matchException, (long)1367425351270007640L, (long)l5);
                                }
                            }
                            try {
                                ek_03 = this;
                                if (callSite2 != null) break block77;
                                Object[] objectArray = new Object[2];
                                objectArray[1] = l7;
                                objectArray[0] = Float.valueOf((float)ek_0.c("L", (Object)((Float)((Object)ek_0.c("L", (Object)this.c, (long)1367731389152451170L, (long)l5))), (long)1367788490896853838L, (long)l5));
                                callSite3 = ek_0.c("L", (Object)ek_03.e, (Object)objectArray, (long)1360952707331374733L, (long)l5);
                            }
                            catch (MatchException matchException) {
                                throw ek_0.c("\u00ff", (Object)matchException, (long)1367425351270007640L, (long)l5);
                            }
                        }
                        if (callSite3 == false) {
                            return;
                        }
                        ek_03 = this;
                    }
                    Object[] objectArray = new Object[3];
                    objectArray[2] = l4;
                    objectArray[1] = (int)ek_0.b("x", (int)22232, (long)(0x58C8D9BA74AF0511L ^ l5));
                    objectArray[0] = 0;
                    CallSite callSite6 = ek_0.c("L", (Object)ek_03, (Object)objectArray, (long)1368122518126978773L, (long)l5);
                    try {
                        try {
                            callSite = callSite6;
                            if (callSite2 != null) break block78;
                            if (callSite == null) break block79;
                        }
                        catch (MatchException matchException) {
                            throw ek_0.c("\u00ff", (Object)matchException, (long)1367425351270007640L, (long)l5);
                        }
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l2;
                        this.g = (int)ek_0.c("\u00ff", (Object)objectArray2, (long)1367486880933503903L, (long)l5);
                        this.h = -1;
                        Object[] objectArray3 = new Object[2];
                        objectArray3[1] = l6;
                        objectArray3[0] = (int)ek_0.c("L", (Object)callSite6, (long)1368206196970292268L, (long)l5);
                        ek_0.c("\u00ff", (Object)objectArray3, (long)1368463910338421331L, (long)l5);
                        Object[] objectArray4 = new Object[1];
                        objectArray4[0] = l3;
                        ek_0.c("L", (Object)this, (Object)objectArray4, (long)1361666985640544700L, (long)l5);
                        return;
                    }
                    catch (MatchException matchException) {
                        throw ek_0.c("\u00ff", (Object)matchException, (long)1367425351270007640L, (long)l5);
                    }
                }
                try {
                    ek_02 = this;
                    if (callSite2 != null) break block80;
                    callSite = ek_0.c("L", (Object)ek_02.a, (long)1367731389152451170L, (long)l5);
                }
                catch (MatchException matchException) {
                    throw ek_0.c("\u00ff", (Object)matchException, (long)1367425351270007640L, (long)l5);
                }
            }
            try {
                if (ek_0.c("L", (Object)((Boolean)((Object)callSite)), (long)1368436698833469677L, (long)l5) == false) {
                    return;
                }
            }
            catch (MatchException matchException) {
                throw ek_0.c("\u00ff", (Object)matchException, (long)1367425351270007640L, (long)l5);
            }
            ek_02 = this;
        }
        Object[] objectArray = new Object[3];
        objectArray[2] = l4;
        objectArray[1] = (int)ek_0.b("x", (int)14969, (long)(0x4AC93FFAE3B9E9B2L ^ l5));
        objectArray[0] = (int)ek_0.b("x", (int)6967, (long)(0x7A204404DF8C8FFL ^ l5));
        CallSite callSite = ek_0.c("L", (Object)ek_02, (Object)objectArray, (long)1368122518126978773L, (long)l5);
        try {
            if (callSite == null) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw ek_0.c("\u00ff", (Object)matchException, (long)1367425351270007640L, (long)l5);
        }
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l2;
        CallSite callSite7 = ek_0.c("\u00ff", (Object)objectArray5, (long)1367486880933503903L, (long)l5);
        this.g = (int)callSite7;
        this.h = (int)ek_0.c("L", (Object)callSite, (long)1368206196970292268L, (long)l5);
        Object[] objectArray6 = new Object[3];
        objectArray6[2] = l;
        objectArray6[1] = (int)callSite7;
        objectArray6[0] = (int)ek_0.c("L", (Object)callSite, (long)1368206196970292268L, (long)l5);
        ek_0.c("\u00ff", (Object)objectArray6, (long)1361175131147827915L, (long)l5);
        Object[] objectArray7 = new Object[1];
        objectArray7[0] = l3;
        ek_0.c("L", (Object)this, (Object)objectArray7, (long)1361666985640544700L, (long)l5);
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
            case 0 -> 57;
            case 1 -> 24;
            case 2 -> 55;
            case 3 -> 4;
            case 4 -> 36;
            case 5 -> 31;
            case 6 -> 53;
            case 7 -> 38;
            case 8 -> 16;
            case 9 -> 49;
            case 10 -> 18;
            case 11 -> 25;
            case 12 -> 41;
            case 13 -> 60;
            case 14 -> 1;
            case 15 -> 19;
            case 16 -> 7;
            case 17 -> 34;
            case 18 -> 30;
            case 19 -> 48;
            case 20 -> 32;
            case 21 -> 54;
            case 22 -> 46;
            case 23 -> 58;
            case 24 -> 22;
            case 25 -> 20;
            case 26 -> 17;
            case 27 -> 52;
            case 28 -> 50;
            case 29 -> 14;
            case 30 -> 26;
            case 31 -> 2;
            case 32 -> 28;
            case 33 -> 23;
            case 34 -> 61;
            case 35 -> 27;
            case 36 -> 0;
            case 37 -> 37;
            case 38 -> 42;
            case 39 -> 10;
            case 40 -> 43;
            case 41 -> 3;
            case 42 -> 13;
            case 43 -> 44;
            case 44 -> 51;
            case 45 -> 56;
            case 46 -> 40;
            case 47 -> 6;
            case 48 -> 29;
            case 49 -> 21;
            case 50 -> 47;
            case 51 -> 5;
            case 52 -> 33;
            case 53 -> 59;
            case 54 -> 15;
            case 55 -> 39;
            case 56 -> 62;
            case 57 -> 9;
            case 58 -> 35;
            case 59 -> 45;
            case 60 -> 12;
            case 61 -> 11;
            case 62 -> 63;
            default -> 8;
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
        ek_0.p[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = ek_0.m(l, l2);
        Object object = o[n];
        if (object instanceof String) {
            String string = p[n];
            int n2 = string.indexOf(8);
            Class clazz = ek_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ek_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ek_0.g(clazz3, string2, clazz2)) != null) {
                    ek_0.o[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ek_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ek_0.o[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ek_0.n(1323213865281742L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = ek_0.m(l, l2);
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
                clazz3 = ek_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ek_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ek_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        ek_0.o[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ek_0.n(1323213865281742L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ek_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ek_0.o[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ek_0.n(1323213865281742L, 0L);
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
        long l2 = l = k ^ l;
        long l3 = l2 ^ 0x27CF6AB598E4L;
        long l4 = l2 ^ 0x4136FFB1C998L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        ek_0.c("L", (Object)this.e, (Object)objectArray2, (long)-8689559590551850558L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        ek_0.c("L", (Object)this.c, (Object)objectArray3, (long)-8685627192358165311L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ek_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ek_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


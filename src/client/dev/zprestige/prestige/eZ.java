/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_304
 *  net.minecraft.class_310
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.N;
import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_304;
import net.minecraft.class_310;

public class eZ
extends dV {
    private dM d;
    private int a = -1;
    private int c = -1;
    private int e = -1;
    private static final long k;
    private static final long[] l;
    private static final Integer[] m;
    private static final Map n;
    private static final Object[] o;
    private static final String[] p;

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                eZ.k = hc.a(-4533094232822657440L, -8369172018736092738L, MethodHandles.lookup().lookupClass()).a(242416080479016L);
                eZ.o = new Object[82];
                eZ.p = new String[82];
                eZ.f();
                eZ.n = new HashMap<K, V>(13);
                var0 = eZ.k ^ 75622992931466L;
                var2_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var8_3 = new long[4];
                var5_4 = 0;
                var6_5 = "\u001a\u0007\u0084Th&4\u00e9\u00fai\u0007\u0099kL,\u009c";
                var7_6 = "\u001a\u0007\u0084Th&4\u00e9\u00fai\u0007\u0099kL,\u009c".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl41:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u00c9\u0088q\u00bb\u008f\u00a8\u008e\u00c4P\u00bd4t\u008ey\u00d0B";
                    var7_6 = "\u00c9\u0088q\u00bb\u008f\u00a8\u008e\u00c4P\u00bd4t\u008ey\u00d0B".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
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
                    if (var4_7 < var7_6) ** continue;
                    break block9;
                    break;
                }
            }
            var10_9 = v5;
            var12_10 = var2_1.doFinal(new byte[]{(byte)(var10_9 >>> 56), (byte)(var10_9 >>> 48), (byte)(var10_9 >>> 40), (byte)(var10_9 >>> 32), (byte)(var10_9 >>> 24), (byte)(var10_9 >>> 16), (byte)(var10_9 >>> 8), (byte)var10_9});
            v7 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
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
        eZ.l = var8_3;
        eZ.m = new Integer[4];
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void e(Object[] var1_1) {
        block17: {
            block15: {
                block14: {
                    var2_2 = (Long)var1_1[0];
                    v0 = var2_2;
                    var4_3 = v0 ^ 9927914210479L;
                    var6_4 = v0 ^ 32816452178731L;
                    var8_5 = eZ.c("\u00d9", (long)3994204431895993607L, (long)var2_2);
                    try {
                        try {
                            v1 = eZ.b;
                            if (var8_5 != null) break block14;
                            if (eZ.c("\u00e0", (Object)v1, (long)3994319529546468675L, (long)var2_2) != null) {
                            }
                            ** GOTO lbl46
                        }
                        catch (MatchException v2) {
                            throw eZ.c("\u00d9", (Object)v2, (long)3996303235787375309L, (long)var2_2);
                        }
                        v1 = eZ.b;
                    }
                    catch (MatchException v3) {
                        throw eZ.c("\u00d9", (Object)v3, (long)3996303235787375309L, (long)var2_2);
                    }
                }
                try {
                    try {
                        if (var8_5 != null) break block15;
                        if (eZ.c("\u00e0", (Object)v1, (long)3992825804390512005L, (long)var2_2) != null) {
                        }
                        ** GOTO lbl46
                    }
                    catch (MatchException v4) {
                        throw eZ.c("\u00d9", (Object)v4, (long)3996303235787375309L, (long)var2_2);
                    }
                    v1 = eZ.b;
                }
                catch (MatchException v5) {
                    throw eZ.c("\u00d9", (Object)v5, (long)3996303235787375309L, (long)var2_2);
                }
            }
            try {
                block16: {
                    try {
                        if (eZ.c("q", (Object)eZ.c("\u00e0", (Object)v1, (long)3994319529546468675L, (long)var2_2), (long)3992564454256203282L, (long)var2_2) == false) break block16;
                        v6 = new Object[1];
                        v6[0] = var6_4;
                        eZ.c("q", (Object)this, (Object)v6, (long)3995942105790429572L, (long)var2_2);
                        if (var8_5 == null) break block17;
                    }
                    catch (MatchException v7) {
                        throw eZ.c("\u00d9", (Object)v7, (long)3996303235787375309L, (long)var2_2);
                    }
                }
                eZ.c("q", (Object)this, (Object)new Object[0], (long)3992488116588790394L, (long)var2_2);
            }
            catch (MatchException v8) {
                throw eZ.c("\u00d9", (Object)v8, (long)3996303235787375309L, (long)var2_2);
            }
        }
        v9 = new Object[1];
        v9[0] = var4_3;
        eZ.c("q", (Object)this, (Object)v9, (long)3996853437519634940L, (long)var2_2);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = eZ.b(n, l);
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
            throw new RuntimeException("dev/zprestige/prestige/eZ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x219D;
        if (m[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = eZ.l[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])eZ.n.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    eZ.n.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/eZ", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            eZ.m[n2] = n3;
        }
        return m[n2];
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
            throw new RuntimeException("dev/zprestige/prestige/eZ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = eZ.m(l, l2);
            object = o[n];
            try {
                if (!(object instanceof String)) break block2;
                eZ.o[n] = clazz = Class.forName(p[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = eZ.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = eZ.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = eZ.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = eZ.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = o;
        o[0] = "UlB:>DClG`-ST'Df!GE`SqjQk";
        objectArray[1] = "\u0011\u0019dN\u0019#\u001a\u0016u\u0001z.\u000f\u001bzjO,\u001e\bfFX!";
        objectArray[2] = " p<\u001a?l6p9@,{!;:F o0|-Qk}\f";
        objectArray[3] = "9wGf\t LWLi\u0018o1O_n\u0011&Y";
        objectArray[4] = "$A$\u0010q0$A3L}?>\n3R}*9{c\u000f,";
        objectArray[5] = "$4C\u000e\u007f2$4TRs=>\u007fTLs(9\u000e\u0000\u0014$";
        objectArray[6] = "\fVKZI^\fV\\\u0006EQ\u0016\u001d\\\u0018ED\u0011l\tG\u001c";
        objectArray[7] = "P(p9RV%\b{6C\u0019D\u0006p=GC0";
        objectArray[8] = Void.TYPE;
        eZ.p[8] = "java/lang/Void";
        objectArray[9] = "-AcJA~(ThJJe$D*#aO\u0015";
        objectArray[10] = Long.TYPE;
        eZ.p[10] = "java/lang/Long";
        objectArray[11] = Integer.TYPE;
        eZ.p[11] = "java/lang/Integer";
        objectArray[12] = "\u000fNb\\K\u0014\u000fNu\u0000G\u001b\u0015\u0005u\u001eG\u000e\u0012t'B\u0012L";
        objectArray[13] = "\u0014;VKen\u0002;S\u0011vy\u0015pP\u0017zm\u00047G\u00001P";
        objectArray[14] = "\u001a\u0004$/z?o$/ kp\u000e*$+o*z";
        objectArray[15] = "\u0019Wma\f\u0005\u0019Wz=\u0000\n\u0003\u001cz#\u0000\u001f\u0004m*yVYSQu.\u0012\u001f(\u0001)y";
        objectArray[16] = "\f~3qw8\f~$-{7\u00165$3{\"\u0011Dtn/";
        objectArray[17] = "H\u001bJ4\b\u001fH\u001b]h\u0004\u0010RP]v\u0004\u0005U!\r*Q";
        objectArray[18] = Boolean.TYPE;
        eZ.p[18] = "java/lang/Boolean";
        objectArray[19] = "\u0017ofz3\u0007\tg|5N\u0017\t";
        objectArray[20] = "\u001b\u0006O_\u0014\u0010\u0010\t^\u0010u\u001e\u001b\u0002ZJ";
        objectArray[21] = "4\u0010)CP~\"\u0010,\u0019Ci5[/\u001fO}$\u001c8\b\u0004m\"";
        objectArray[22] = "eTSPHF\u0010tX_Y\tqzST]S\u0005";
        objectArray[23] = "Sk\u001e~\u0017]&K\u0015q\u0006\u0012GE\u001ez\u0002H3";
        objectArray[24] = "H\u0001\u00197]\u007f=!\u00128L0\\/\u00193Hj(";
        objectArray[25] = "%hOj\u0019W3hJ0\n@$#I6\u0006T5d^!MD-d\\*\u0017\t\u0011\u007f\\7\u0017N&h";
        objectArray[26] = "@oyS\u001b/Vo|\t\b8A$\u007f\u000f\u0004,Pch\u0018O=}";
        objectArray[27] = ")JI'@\u0007\"EXh#\n7C";
        objectArray[28] = "9QGiu</QB3f+8\u001aA5j?)]V\"!(\u000b";
        objectArray[29] = "S,Q1nRS,Fmb]IgFsbHN\u0016\u0014(:\u0002";
        objectArray[30] = "\u0002;>,TK\u0002;)pXD\u0018p)nXQ\u001f\u0001{5\u0000\u0010";
        objectArray[31] = "b\u001eglPmb\u001ep0\\bxUp.\\w\u007f$\"u\u000b0";
        objectArray[32] = "\u0015Y\u00055Rd\u0015Y\u0012i^k\u000f\u0012\u0012w^~\bcE(\b";
        objectArray[33] = "A=\u0014;)\u001f4\u001d\u001f48PU\u0013\u0014?<\n!";
        objectArray[34] = "l4Y&\u0005Dl4Nz\tKv\u007fNd\t^q\u000e\u001c;X\u0014";
        objectArray[35] = "\u001fa3\u0016\u0001\u0006\u001fa$J\r\t\u0005*$T\r\u001c\u0002[v\u000eZ^";
        objectArray[36] = "c`s\u000e|yc`dRpvy+dLpc~Z6\u0018!\"";
        objectArray[37] = "'Z\u0018%1\u0007Rz\u0013* H3t\u0018!$\u0012G";
        objectArray[38] = "E\"\u000b\u0018 \u00100\u0002\u0000\u00171_Q\f\u000b\u001c5\u0005%";
        objectArray[39] = "\u0012l;i\u000eigL0f\u001f&\u0006B;m\u001b|r";
        objectArray[40] = ".q+\u001eRV%~:Q>U+|8\u001e\u0012";
        objectArray[41] = "\u0005t[\u001d8/pTP\u0012)`\u0011Z[\u0019-:e";
        objectArray[42] = "\u0017Wz\u0013SG\u0001W\u007fI@P\u0016\u001c|OLD\u0007[kX\u0007S8";
        objectArray[43] = "=P\u0018Y\u0013<c\r\u000fVkcgS\u000e'\u0006pFZ\f\u0013\u0006F~A\r\u000f\r\f<\u0002\u0016\u0013\u0017bs\u0007\u0018\rk<i\u0001\u0014P\u001ag`T\u0012h[f?XI\u0019\u0000oj^q";
        objectArray[44] = ">/\u001boY`<&\u0003h:chk\u001b2VQ?-Ee\u0001\u00065}\u001eoXhd)\u0006/:";
        objectArray[45] = "m~&{ST.u&k,PT+4hP[2c\"`Q:";
        objectArray[46] = "^\u0018wd\fw\\\u0011oco\u007f\u0004Ms28(Z\u001a+^S)\u0007Cu&\u0012*\u000b_";
        objectArray[47] = "k3e\u0019^>:g}Y<56%`DP\u0007ge1\u001b<od>{_R a0e#";
        objectArray[48] = "Ys\u001c\n3\u0003\u0001-K]MC8*F\nt]U'\u001b@+";
        objectArray[49] = "\u001d:V5\u0001+\u001f3N2b#GoRc5t\u00182\t\u000f^(Y`G?\u0018}^e";
        objectArray[50] = "=)\u0011\u0000`a2*\n\u0019\u0004\u007fP6\u001b\u000eao,$\u0005\r;\u0011;+GChx..\u0011\u0010\u0004";
        objectArray[51] = "$\u000094\u001d=)P5om9/IG<\u0007`#\u00016g\u000e5%9wfQ9~H,o\u0004?F\t-0\bd7R$e\u000e\\";
        objectArray[52] = "FtEmZ.EkZ\u0003\u0004\u0015XsWf\u001eiJmT<`([{\u0010c\u001cm\u001fmK\u0003";
        objectArray[53] = "dlbVJ%%onJ(85(`RD\ned8\b(6>k1YA#;=b5";
        objectArray[54] = "U9FN`rWhRU\u001cq7?F\u000f-t^*CY~\u0018";
        objectArray[55] = "g)eszV>.%rKYi3<)'k;~d\u007fK_u7&%*X=,.N";
        objectArray[56] = "p-);i\u0006\u007f(!#\u000e\u0002xj&#b0*)v}\u000e\u0004s/{ud]tozDe\u0001*'*-p\u0004|tF";
        objectArray[57] = "\u0001\u0014M\b}~\u0003\u001dU\u000f\u001ev[AI^I!\u0005\u0011\u00102{&A]\u0016Ss'Q^";
        objectArray[58] = "{&\u007f\u001c2z:%s\u0000Pg*b}\u0018<Uy&!OP2-\"xG!i$w~\u007f";
        objectArray[59] = "v\n3a2Dt['zNG\u0014\u001c6c+Ph\u000e(`q.)\u001f>$.Rl[(\u007fN";
        objectArray[60] = "Gs|\t THvt\u0011GPO4s\u0011+b\u001dw,KGVDq.G-\u000fC1/v!LXxh\u000fvZHr\u0013F-\tGpb\u001d$\\AH";
        objectArray[61] = "\u00108er;[\u0001dod\u0007V\u0012\tgpk\u000b\u0002u;rjX|dcu=O\u00008atn1\u0011`f#yMMbgp\u0007]Mfa%mL\u0011lw\u0019";
        objectArray[62] = "@m\u007fwCE\u0001nsk!X\u0011)}sMjBl$)!V\u001aj,xHC\u001f<\u007f\u0014";
        objectArray[63] = "/\t5]\u00047n\n9Af*~M7Y\n\u0018-\tk\u0001f,u\bj\u000f\furHk>";
        objectArray[64] = "\\z`@&/\u001dyl\\D2\r>bD(\u0000[{?\u001ftW\u0007,x\u001c4*\u0019\u007fxJD";
        objectArray[65] = "D\u001d\u0003\u000e*\u0017F\u0014\u001b\tI\u001f\u001eH\u0007X\u001eHA\u0014[4#J\u0012N\\H8\u001b\u001c\u001a";
        objectArray[66] = " >.\u001fc=#!1q0\u0006|k8\u00168x<j\u007fHY?t\"'\u0010'\u007fueyq";
        objectArray[67] = "RL\u0014\u0003\u0018M^\u0016O\u000f&Cc]\u0013\u0010CT\u001fO\r\u0013\u0019*\nK\u0015\u000f\u0018\u0017XVAS&";
        objectArray[68] = "plTu$O.1Cz\\\u0010*oB\u000b1\u0003\rlLDc@)zA*,E'd=t6C+9L/?\u0016-\u0001\r.`\u001avpV'5\u001cN";
        objectArray[69] = "\"L!\\I\f!S>2\u00107<K3W\rK.U0\rs\n?CtR\u000fO{U/2";
        objectArray[70] = "\tj\u0013$I\u0005\u0018oV~qZ\u0010dK,&\u0004J8\u001e@\u0012E\tsD!\u0015\r\u0012{";
        objectArray[71] = "yB%D\u000e\fb\u0013+\u00101\u001er\u0014,CfI\"At/[\f+\u0000qE^\u0016*\u0012";
        objectArray[72] = "c!Uzd\u0014\"?Pq\u001fO~7]}vCG9]mr%r6\u0006!sLg3Pr\u001f";
        objectArray[73] = "6(\u0015+dh9+\u000e2\u0000q[7\u001f%ef'%\u0001&?\u0018f4\u0017b`d#p\u00019\u0000";
        objectArray[74] = "*9\u001a!\u0012?)&\u0005OM\u00044>\b*Vx& \u000bp(976O/T|s \u0014O";
        objectArray[75] = "~J\u001b\u000f>6`\u0019\u001bYN.tX\u0001W\"\u001c$\u0018Z\u0000N{s\u0018\u0004\b? zM\u00020-- \u0019PZt*`\u0018a";
        objectArray[76] = ")=%=\u001e\u0001&>>$z\u0018D\"/3\u001f\u000f8010Eqt3p*B\u0000/:%,z";
        objectArray[77] = "`\u0000H<\u001efc\u001fWRF]~\u0007Z7Z!l\u0019Ym$`}\u000f\u001d2X%9\u0019FR";
        objectArray[78] = "\u0002\u001fdF9\u001c\u000fB.\u0019Z\u0018c\u00046\u0003?\u000f\u001f\u0016(\u0000eq\b\u0019jN6\u0018\u001d\u001c<\u001dZ";
        objectArray[79] = "\b3DQuw\u00112^\u0019\u0014et4L\f.r\bhN\r}\f";
        objectArray[80] = "\u001c;\u001aM\u0014/\u0019!\u001b_- \u001b;BSA\u0012L|\u001e\u0004\u0014E\u001d!\u001d\u0005A,\b$KV-x\u000e,\u0019TQ=J:B4";
        Object[] objectArray2 = objectArray;
        objectArray[81] = "1J\u0011mv\u0001cWE1HY5[\u0014i$ka\u001bH2H\f2\u001b\u001169W;N\u0017\u000e";
    }

    private void l(Object[] objectArray) {
        this.a = -1;
        this.c = -1;
        this.e = -1;
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = eZ.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e0' || c == 't' || c == '\u00cb' || c == 'O') {
                field = eZ.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e0' ? lookup.findGetter(clazz, string2, clazz2) : (c == 't' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00cb' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = eZ.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'q' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d9' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void d(Object[] objectArray) {
        class_310 class_3102;
        long l;
        long l2;
        block7: {
            l2 = (Long)objectArray[0];
            l = l2 ^ 0x319D48CC1A01L;
            CallSite callSite = eZ.c("\u00d9", (long)3246277602547697508L, (long)l2);
            try {
                try {
                    class_3102 = b;
                    if (callSite != null) break block7;
                    if (eZ.c("\u00e0", (Object)class_3102, (long)3246523518369650464L, (long)l2) == null) return;
                }
                catch (MatchException matchException) {
                    throw eZ.c("\u00d9", (Object)matchException, (long)3249033898956675246L, (long)l2);
                }
                class_3102 = b;
            }
            catch (MatchException matchException) {
                throw eZ.c("\u00d9", (Object)matchException, (long)3249033898956675246L, (long)l2);
            }
        }
        try {
            if (eZ.c("\u00e0", (Object)class_3102, (long)3245413531225403366L, (long)l2) == null) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw eZ.c("\u00d9", (Object)matchException, (long)3249033898956675246L, (long)l2);
        }
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l;
        eZ.c("q", (Object)this, (Object)objectArray2, (long)3248513678068482053L, (long)l2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @bP
    public void a(bG bG2) {
        class_310 class_3102;
        long l;
        block91: {
            CallSite callSite;
            CallSite callSite2;
            long l2;
            block89: {
                CallSite callSite3;
                block90: {
                    CallSite callSite4;
                    block84: {
                        block85: {
                            eZ eZ2;
                            long l3;
                            block88: {
                                Object object;
                                block86: {
                                    block87: {
                                        CallSite callSite5;
                                        CallSite callSite6;
                                        long l4;
                                        block80: {
                                            block81: {
                                                eZ eZ3;
                                                block83: {
                                                    int n;
                                                    block82: {
                                                        class_310 class_3103;
                                                        int n2;
                                                        block78: {
                                                            block79: {
                                                                block77: {
                                                                    block76: {
                                                                        int n3;
                                                                        block75: {
                                                                            Object object2;
                                                                            block74: {
                                                                                block73: {
                                                                                    CallSite callSite7;
                                                                                    long l5;
                                                                                    block72: {
                                                                                        class_310 class_3104;
                                                                                        block70: {
                                                                                            block71: {
                                                                                                block69: {
                                                                                                    long l6 = l = k ^ 0x17CD73DD94A8L;
                                                                                                    l3 = l6 ^ 0x152A998D4E82L;
                                                                                                    l2 = l6 ^ 0x5322D532EAE4L;
                                                                                                    l5 = l6 ^ 0x2C2CB88BBECCL;
                                                                                                    l4 = l6 ^ 0x4D3546AEB31L;
                                                                                                    callSite2 = eZ.c("\u00d9", (long)1811882881720365900L, (long)l);
                                                                                                    try {
                                                                                                        try {
                                                                                                            class_3104 = b;
                                                                                                            if (callSite2 != null) break block69;
                                                                                                            if (eZ.c("\u00e0", (Object)class_3104, (long)1812125275773461256L, (long)l) == null) return;
                                                                                                        }
                                                                                                        catch (MatchException matchException) {
                                                                                                            throw eZ.c("\u00d9", (Object)matchException, (long)1819140595766520966L, (long)l);
                                                                                                        }
                                                                                                        class_3104 = b;
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw eZ.c("\u00d9", (Object)matchException, (long)1819140595766520966L, (long)l);
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    try {
                                                                                                        if (callSite2 != null) break block70;
                                                                                                        if (eZ.c("\u00e0", (Object)class_3104, (long)1811018587277335502L, (long)l) != null) break block71;
                                                                                                        return;
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw eZ.c("\u00d9", (Object)matchException, (long)1819140595766520966L, (long)l);
                                                                                                    }
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw eZ.c("\u00d9", (Object)matchException, (long)1819140595766520966L, (long)l);
                                                                                                }
                                                                                            }
                                                                                            class_3104 = b;
                                                                                        }
                                                                                        try {
                                                                                            if (eZ.c("q", (Object)eZ.c("\u00e0", (Object)class_3104, (long)1812125275773461256L, (long)l), (long)1811337735793080409L, (long)l) == false) {
                                                                                                eZ.c("q", (Object)this, (Object)new Object[0], (long)1811415636862069809L, (long)l);
                                                                                                Object[] objectArray = new Object[1];
                                                                                                objectArray[0] = l2;
                                                                                                eZ.c("q", (Object)this, (Object)objectArray, (long)1818600079822819255L, (long)l);
                                                                                                return;
                                                                                            }
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw eZ.c("\u00d9", (Object)matchException, (long)1819140595766520966L, (long)l);
                                                                                        }
                                                                                        try {
                                                                                            callSite7 = eZ.c("\u00cb", (long)1811149305809560770L, (long)l);
                                                                                            if (callSite2 != null) break block72;
                                                                                            if (callSite7 == null) break block73;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw eZ.c("\u00d9", (Object)matchException, (long)1819140595766520966L, (long)l);
                                                                                        }
                                                                                        callSite7 = eZ.c("\u00cb", (long)1811149305809560770L, (long)l);
                                                                                    }
                                                                                    try {
                                                                                        Object[] objectArray = new Object[1];
                                                                                        objectArray[0] = l5;
                                                                                        object2 = eZ.c("q", (Object)callSite7, (Object)objectArray, (long)1818831669455892152L, (long)l);
                                                                                        if (callSite2 != null) break block74;
                                                                                        if (object2 == 0) break block73;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw eZ.c("\u00d9", (Object)matchException, (long)1819140595766520966L, (long)l);
                                                                                    }
                                                                                    object2 = 1;
                                                                                    break block74;
                                                                                }
                                                                                object2 = 0;
                                                                            }
                                                                            n2 = object2;
                                                                            try {
                                                                                try {
                                                                                    n3 = this.c;
                                                                                    if (callSite2 != null) break block75;
                                                                                    if (n3 == -1) break block76;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw eZ.c("\u00d9", (Object)matchException, (long)1819140595766520966L, (long)l);
                                                                                }
                                                                                n3 = n2;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw eZ.c("\u00d9", (Object)matchException, (long)1819140595766520966L, (long)l);
                                                                            }
                                                                        }
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (n3 != 0) break block76;
                                                                                    class_3103 = b;
                                                                                    if (callSite2 != null) break block77;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw eZ.c("\u00d9", (Object)matchException, (long)1819140595766520966L, (long)l);
                                                                                }
                                                                                if (eZ.c("q", (Object)eZ.c("q", (Object)eZ.c("q", (Object)eZ.c("\u00e0", (Object)class_3103, (long)1812125275773461256L, (long)l), (long)1818999580316117208L, (long)l), (int)this.c, (long)1818495387403425873L, (long)l), (long)1811464582174421992L, (long)l) == eZ.c("\u00cb", (long)1819394003615502967L, (long)l)) break block76;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw eZ.c("\u00d9", (Object)matchException, (long)1819140595766520966L, (long)l);
                                                                            }
                                                                            eZ.c("q", (Object)this, (Object)new Object[0], (long)1811415636862069809L, (long)l);
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw eZ.c("\u00d9", (Object)matchException, (long)1819140595766520966L, (long)l);
                                                                        }
                                                                    }
                                                                    class_3103 = b;
                                                                }
                                                                try {
                                                                    try {
                                                                        if (callSite2 != null) break block78;
                                                                        if (eZ.c("\u00e0", (Object)class_3103, (long)1810507424549728741L, (long)l) == null) break block79;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw eZ.c("\u00d9", (Object)matchException, (long)1819140595766520966L, (long)l);
                                                                    }
                                                                    Object[] objectArray = new Object[1];
                                                                    objectArray[0] = l2;
                                                                    eZ.c("q", (Object)this, (Object)objectArray, (long)1818600079822819255L, (long)l);
                                                                    return;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw eZ.c("\u00d9", (Object)matchException, (long)1819140595766520966L, (long)l);
                                                                }
                                                            }
                                                            class_3103 = b;
                                                        }
                                                        callSite3 = eZ.c("q", (Object)eZ.c("\u00e0", (Object)class_3103, (long)1812125275773461256L, (long)l), (long)1810894801887792173L, (long)l);
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            CallSite callSite5 = eZ.c("q", (Object)callSite3, (long)1811464582174421992L, (long)l);
                                                                            callSite5 = eZ.c("\u00cb", (long)1819394003615502967L, (long)l);
                                                                            if (callSite2 != null) break block80;
                                                                            if (callSite6 == callSite5) break block81;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw eZ.c("\u00d9", (Object)matchException, (long)1819140595766520966L, (long)l);
                                                                        }
                                                                        n = n2;
                                                                        if (callSite2 != null) break block82;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw eZ.c("\u00d9", (Object)matchException, (long)1819140595766520966L, (long)l);
                                                                    }
                                                                    if (n == 0) break block81;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw eZ.c("\u00d9", (Object)matchException, (long)1819140595766520966L, (long)l);
                                                                }
                                                                eZ3 = this;
                                                                if (callSite2 != null) break block83;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw eZ.c("\u00d9", (Object)matchException, (long)1819140595766520966L, (long)l);
                                                            }
                                                            n = eZ3.e;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw eZ.c("\u00d9", (Object)matchException, (long)1819140595766520966L, (long)l);
                                                        }
                                                    }
                                                    try {
                                                        if (n == -1) break block81;
                                                        eZ3 = this;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw eZ.c("\u00d9", (Object)matchException, (long)1819140595766520966L, (long)l);
                                                    }
                                                }
                                                Object[] objectArray = new Object[1];
                                                objectArray[0] = l2;
                                                eZ.c("q", (Object)eZ3, (Object)objectArray, (long)1818600079822819255L, (long)l);
                                                return;
                                            }
                                            try {
                                                callSite4 = callSite3;
                                                if (callSite2 != null) break block84;
                                                CallSite callSite5 = eZ.c("q", (Object)callSite4, (long)1811464582174421992L, (long)l);
                                                callSite5 = eZ.c("\u00cb", (long)1819394003615502967L, (long)l);
                                            }
                                            catch (MatchException matchException) {
                                                throw eZ.c("\u00d9", (Object)matchException, (long)1819140595766520966L, (long)l);
                                            }
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (callSite6 == callSite5) break block85;
                                                            Object[] objectArray = new Object[1];
                                                            objectArray[0] = l2;
                                                            eZ.c("q", (Object)this, (Object)objectArray, (long)1818600079822819255L, (long)l);
                                                            object = this.e;
                                                            if (callSite2 != null) break block86;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw eZ.c("\u00d9", (Object)matchException, (long)1819140595766520966L, (long)l);
                                                        }
                                                        if (object == -1) break block87;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw eZ.c("\u00d9", (Object)matchException, (long)1819140595766520966L, (long)l);
                                                    }
                                                    object = this.c;
                                                    if (callSite2 != null) break block86;
                                                }
                                                catch (MatchException matchException) {
                                                    throw eZ.c("\u00d9", (Object)matchException, (long)1819140595766520966L, (long)l);
                                                }
                                                if (object == -1) break block87;
                                            }
                                            catch (MatchException matchException) {
                                                throw eZ.c("\u00d9", (Object)matchException, (long)1819140595766520966L, (long)l);
                                            }
                                            Object[] objectArray = new Object[3];
                                            objectArray[2] = l4;
                                            objectArray[1] = this.c;
                                            objectArray[0] = this.e;
                                            eZ.c("\u00d9", (Object)objectArray, (long)1811263419358855406L, (long)l);
                                        }
                                        catch (MatchException matchException) {
                                            throw eZ.c("\u00d9", (Object)matchException, (long)1819140595766520966L, (long)l);
                                        }
                                    }
                                    try {
                                        eZ.c("q", (Object)this, (Object)new Object[0], (long)1811415636862069809L, (long)l);
                                        eZ2 = this;
                                        if (callSite2 != null) break block88;
                                        object = eZ.c("q", (Object)eZ2, (long)1811518605789348509L, (long)l);
                                    }
                                    catch (MatchException matchException) {
                                        throw eZ.c("\u00d9", (Object)matchException, (long)1819140595766520966L, (long)l);
                                    }
                                }
                                if (object == 0) return;
                                eZ2 = this;
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l3;
                            eZ.c("q", (Object)eZ2, (Object)objectArray, (long)1810648828627250276L, (long)l);
                            return;
                        }
                        callSite4 = callSite3;
                    }
                    try {
                        try {
                            callSite = eZ.c("\u00d9", (Object)callSite4, (long)1810544491366948699L, (long)l);
                            if (callSite2 != null) break block89;
                            if (callSite == false) break block90;
                        }
                        catch (MatchException matchException) {
                            throw eZ.c("\u00d9", (Object)matchException, (long)1819140595766520966L, (long)l);
                        }
                        Object[] objectArray = new Object[1];
                        objectArray[0] = l2;
                        eZ.c("q", (Object)this, (Object)objectArray, (long)1818600079822819255L, (long)l);
                        return;
                    }
                    catch (MatchException matchException) {
                        throw eZ.c("\u00d9", (Object)matchException, (long)1819140595766520966L, (long)l);
                    }
                }
                callSite = eZ.c("\u00d9", (int)1, (int)eZ.c("\u00d9", (Object)callSite3, (Object)eZ.c("\u00e0", (Object)b, (long)1812125275773461256L, (long)l), (long)1810852637399265681L, (long)l), (long)1811152816187869372L, (long)l);
            }
            CallSite callSite8 = callSite;
            try {
                block92: {
                    try {
                        try {
                            try {
                                try {
                                    class_3102 = b;
                                    if (callSite2 != null) break block91;
                                    if (eZ.c("q", (Object)eZ.c("\u00e0", (Object)class_3102, (long)1812125275773461256L, (long)l), (long)1810985510360368998L, (long)l) == false) break block92;
                                }
                                catch (MatchException matchException) {
                                    throw eZ.c("\u00d9", (Object)matchException, (long)1819140595766520966L, (long)l);
                                }
                                class_3102 = b;
                                if (callSite2 != null) break block91;
                            }
                            catch (MatchException matchException) {
                                throw eZ.c("\u00d9", (Object)matchException, (long)1819140595766520966L, (long)l);
                            }
                            if (eZ.c("q", (Object)eZ.c("\u00e0", (Object)class_3102, (long)1812125275773461256L, (long)l), (long)1810678113875797889L, (long)l) < callSite8) break block92;
                        }
                        catch (MatchException matchException) {
                            throw eZ.c("\u00d9", (Object)matchException, (long)1819140595766520966L, (long)l);
                        }
                        Object[] objectArray = new Object[1];
                        objectArray[0] = l2;
                        eZ.c("q", (Object)this, (Object)objectArray, (long)1818600079822819255L, (long)l);
                        if (callSite2 == null) return;
                    }
                    catch (MatchException matchException) {
                        throw eZ.c("\u00d9", (Object)matchException, (long)1819140595766520966L, (long)l);
                    }
                }
                class_3102 = b;
            }
            catch (MatchException matchException) {
                throw eZ.c("\u00d9", (Object)matchException, (long)1819140595766520966L, (long)l);
            }
        }
        eZ.c("q", (Object)eZ.c("\u00e0", (Object)eZ.c("\u00e0", (Object)class_3102, (long)1818957856227634317L, (long)l), (long)1819378588176834716L, (long)l), (boolean)true, (long)1817890194551769825L, (long)l);
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return eZ.c("\u00d9", (Object)((Object)q_0.Sword), (Object)((Object)q_0.UHC), (Object)((Object)q_0.Crystal), (long)-2445611820985690816L, (long)l);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void m(Object[] var1_1) {
        block16: {
            block17: {
                block13: {
                    block14: {
                        block15: {
                            var2_2 = (Long)var1_1[0];
                            var4_3 = (var2_2 = eZ.k ^ var2_2) ^ 62994112740952L;
                            v0 = new Object[1];
                            v0[0] = var4_3;
                            var7_4 = eZ.c("q", (Object)eZ.c("q", (Object)new N((class_304)eZ.c("\u00e0", (Object)eZ.c("\u00e0", (Object)eZ.b, (long)9105159018419506159L, (long)var2_2), (long)9105577254908790782L, (long)var2_2)), (Object)v0, (long)9105295213112904208L, (long)var2_2), (long)9104054107460683562L, (long)var2_2);
                            var6_5 = eZ.c("\u00d9", (long)9099277354404009006L, (long)var2_2);
                            try {
                                try {
                                    try {
                                        try {
                                            v1 = var7_4;
                                            v2 /* !! */  = eZ.b("e", (int)11427, (long)(7734922800529437555L ^ var2_2));
                                            if (var6_5 != null) break block13;
                                            if (v1 < v2 /* !! */ ) {
                                            }
                                            ** GOTO lbl42
                                        }
                                        catch (MatchException v3) {
                                            throw eZ.c("\u00d9", (Object)v3, (long)9105394239120575460L, (long)var2_2);
                                        }
                                        v4 /* !! */  = eZ.c("\u00d9", (long)eZ.c("q", (Object)eZ.c("q", (Object)eZ.b, (long)9099340308183931625L, (long)var2_2), (long)9099387805562949579L, (long)var2_2), (int)var7_4, (long)9099139082405621873L, (long)var2_2);
                                        if (var6_5 != null) break block14;
                                    }
                                    catch (MatchException v5) {
                                        throw eZ.c("\u00d9", (Object)v5, (long)9105394239120575460L, (long)var2_2);
                                    }
                                    if (v4 /* !! */  != 1) break block15;
                                }
                                catch (MatchException v6) {
                                    throw eZ.c("\u00d9", (Object)v6, (long)9105394239120575460L, (long)var2_2);
                                }
                                v4 /* !! */  = (CallSite)1;
                                break block14;
                            }
                            catch (MatchException v7) {
                                throw eZ.c("\u00d9", (Object)v7, (long)9105394239120575460L, (long)var2_2);
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

                            v1 = eZ.c("\u00d9", (long)eZ.c("q", (Object)eZ.c("q", (Object)eZ.b, (long)9099340308183931625L, (long)var2_2), (long)9099387805562949579L, (long)var2_2), (int)var7_4, (long)9105560826398391524L, (long)var2_2);
                            if (var6_5 != null) break block17;
                        }
                        catch (MatchException v8) {
                            throw eZ.c("\u00d9", (Object)v8, (long)9105394239120575460L, (long)var2_2);
                        }
                        v2 /* !! */  = (CallSite)1;
                    }
                    catch (MatchException v9) {
                        throw eZ.c("\u00d9", (Object)v9, (long)9105394239120575460L, (long)var2_2);
                    }
                }
                v1 = v1 == v2 /* !! */  ? (Object)1 : (Object)0;
            }
            var8_6 = v1;
        }
        eZ.c("q", (Object)eZ.c("\u00e0", (Object)eZ.c("\u00e0", (Object)eZ.b, (long)9105159018419506159L, (long)var2_2), (long)9105577254908790782L, (long)var2_2), (boolean)var8_6, (long)9104106819598478723L, (long)var2_2);
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
            case 0 -> 54;
            case 1 -> 51;
            case 2 -> 3;
            case 3 -> 2;
            case 4 -> 16;
            case 5 -> 0;
            case 6 -> 45;
            case 7 -> 23;
            case 8 -> 22;
            case 9 -> 6;
            case 10 -> 15;
            case 11 -> 32;
            case 12 -> 28;
            case 13 -> 49;
            case 14 -> 14;
            case 15 -> 10;
            case 16 -> 42;
            case 17 -> 11;
            case 18 -> 59;
            case 19 -> 25;
            case 20 -> 1;
            case 21 -> 34;
            case 22 -> 52;
            case 23 -> 50;
            case 24 -> 5;
            case 25 -> 48;
            case 26 -> 21;
            case 27 -> 7;
            case 28 -> 17;
            case 29 -> 46;
            case 30 -> 27;
            case 31 -> 24;
            case 32 -> 12;
            case 33 -> 38;
            case 34 -> 13;
            case 35 -> 63;
            case 36 -> 33;
            case 37 -> 19;
            case 38 -> 39;
            case 39 -> 26;
            case 40 -> 44;
            case 41 -> 61;
            case 42 -> 56;
            case 43 -> 37;
            case 44 -> 35;
            case 45 -> 29;
            case 46 -> 40;
            case 47 -> 4;
            case 48 -> 47;
            case 49 -> 58;
            case 50 -> 36;
            case 51 -> 43;
            case 52 -> 55;
            case 53 -> 9;
            case 54 -> 41;
            case 55 -> 53;
            case 56 -> 18;
            case 57 -> 57;
            case 58 -> 60;
            case 59 -> 8;
            case 60 -> 30;
            case 61 -> 31;
            case 62 -> 20;
            default -> 62;
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
        eZ.p[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = eZ.m(l, l2);
        Object object = o[n];
        if (object instanceof String) {
            String string = p[n];
            int n2 = string.indexOf(8);
            Class clazz = eZ.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = eZ.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = eZ.g(clazz3, string2, clazz2)) != null) {
                    eZ.o[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = eZ.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        eZ.o[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = eZ.n(1451075503726594L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = eZ.m(l, l2);
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
                clazz3 = eZ.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = eZ.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = eZ.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        eZ.o[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = eZ.n(1451075503726594L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = eZ.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        eZ.o[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = eZ.n(1451075503726594L, 0L);
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
        eZ eZ2;
        long l;
        block14: {
            block13: {
                int n;
                int n2;
                long l2;
                block11: {
                    l = (Long)objectArray[0];
                    long l3 = l = k ^ l;
                    l2 = l3 ^ 0x7232BAEAF3BFL;
                    long l4 = l3 ^ 0x2966D8D3DBD7L;
                    CallSite callSite = eZ.c("\u00d9", (long)3009306511919055786L, (long)l);
                    try {
                        try {
                            block12: {
                                try {
                                    try {
                                        n2 = this.e;
                                        n = -1;
                                        if (callSite != null) break block11;
                                        if (n2 == n) break block12;
                                    }
                                    catch (MatchException matchException) {
                                        throw eZ.c("\u00d9", (Object)matchException, (long)3015387610695523424L, (long)l);
                                    }
                                    Object[] objectArray2 = new Object[3];
                                    objectArray2[2] = l4;
                                    objectArray2[1] = this.c;
                                    objectArray2[0] = this.e;
                                    eZ.c("\u00d9", (Object)objectArray2, (long)3009754537909186568L, (long)l);
                                    if (callSite == null) break block13;
                                }
                                catch (MatchException matchException) {
                                    throw eZ.c("\u00d9", (Object)matchException, (long)3015387610695523424L, (long)l);
                                }
                            }
                            eZ2 = this;
                            if (callSite != null) break block14;
                        }
                        catch (MatchException matchException) {
                            throw eZ.c("\u00d9", (Object)matchException, (long)3015387610695523424L, (long)l);
                        }
                        n2 = eZ2.a;
                        n = -1;
                    }
                    catch (MatchException matchException) {
                        throw eZ.c("\u00d9", (Object)matchException, (long)3015387610695523424L, (long)l);
                    }
                }
                try {
                    if (n2 != n) {
                        Object[] objectArray3 = new Object[2];
                        objectArray3[1] = l2;
                        objectArray3[0] = this.a;
                        eZ.c("\u00d9", (Object)objectArray3, (long)3015770477946812515L, (long)l);
                    }
                }
                catch (MatchException matchException) {
                    throw eZ.c("\u00d9", (Object)matchException, (long)3015387610695523424L, (long)l);
                }
            }
            eZ2 = this;
        }
        eZ.c("q", (Object)eZ2, (Object)new Object[0], (long)3009914563529891031L, (long)l);
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
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void j(Object[] var1_1) {
        block12: {
            block13: {
                var2_2 = (Long)var1_1[0];
                v0 = var2_2 = eZ.k ^ var2_2;
                var4_3 = v0 ^ 6546394538230L;
                var6_4 = v0 ^ 103184032324901L;
                var8_5 = v0 ^ 104042659072158L;
                var10_6 = eZ.c("\u00d9", (long)-5005113739002048285L, (long)var2_2);
                try {
                    if (eZ.c("q", (Object)eZ.c("q", (Object)eZ.c("\u00e0", (Object)eZ.b, (long)-5004998759559642969L, (long)var2_2), (long)-5003836421106487422L, (long)var2_2), (long)-5004406267626418105L, (long)var2_2) == eZ.c("\u00cb", (long)-5003337248860737064L, (long)var2_2)) {
                        return;
                    }
                }
                catch (MatchException v1) {
                    throw eZ.c("\u00d9", (Object)v1, (long)-5003014538494128343L, (long)var2_2);
                }
                for (var11_7 /* !! */  = 0; var11_7 /* !! */  < eZ.b("e", (int)6548, (long)(6509327773183246987L ^ var2_2)); ++var11_7 /* !! */ ) {
                    try {
                        try {
                            v2 = eZ.c("q", (Object)eZ.c("q", (Object)eZ.c("q", (Object)eZ.c("\u00e0", (Object)eZ.b, (long)-5004998759559642969L, (long)var2_2), (long)-5003156103710307465L, (long)var2_2), (int)var11_7 /* !! */ , (long)-5002428706178155522L, (long)var2_2), (long)-5004406267626418105L, (long)var2_2);
                            v3 = eZ.c("\u00cb", (long)-5003337248860737064L, (long)var2_2);
                            if (var10_6 == null) {
                                if (v2 != v3) continue;
                            }
                            ** GOTO lbl54
                        }
                        catch (MatchException v4) {
                            throw eZ.c("\u00d9", (Object)v4, (long)-5003014538494128343L, (long)var2_2);
                        }
                        v5 = new Object[1];
                        v5[0] = var6_4;
                        this.a = (int)eZ.c("\u00d9", (Object)v5, (long)-5002890592390758150L, (long)var2_2);
                        this.c = var11_7 /* !! */ ;
                        this.e = -1;
                        v6 = new Object[2];
                        v6[1] = var4_3;
                        v6[0] = var11_7 /* !! */ ;
                        eZ.c("\u00d9", (Object)v6, (long)-5002553039218889942L, (long)var2_2);
                        return;
                    }
                    catch (MatchException v7) {
                        throw eZ.c("\u00d9", (Object)v7, (long)-5003014538494128343L, (long)var2_2);
                    }
                }
                try {
                    v8 = eZ.c("q", (Object)((Boolean)eZ.c("q", (Object)this.d, (long)-5002690562339724647L, (long)var2_2)), (long)-5002602724593535055L, (long)var2_2);
                    if (var10_6 != null) break block12;
                    if (v8 != false) break block13;
                }
                catch (MatchException v9) {
                    throw eZ.c("\u00d9", (Object)v9, (long)-5003014538494128343L, (long)var2_2);
                }
                return;
            }
            v8 = eZ.b("e", (int)2249, (long)(8081705464380265429L ^ var2_2));
        }
        for (var11_7 /* !! */  = (int)(v2139704); var11_7 /* !! */  < eZ.b("e", (int)31072, (long)(1023185029121925758L ^ var2_2)); ++var11_7 /* !! */ ) {
            v2 = eZ.c("q", (Object)eZ.c("q", (Object)eZ.c("q", (Object)eZ.c("\u00e0", (Object)eZ.b, (long)-5004998759559642969L, (long)var2_2), (long)-5003156103710307465L, (long)var2_2), (int)var11_7 /* !! */ , (long)-5002428706178155522L, (long)var2_2), (long)-5004406267626418105L, (long)var2_2);
            v3 = eZ.c("\u00cb", (long)-5003337248860737064L, (long)var2_2);
lbl54:
            // 2 sources

            if (v2 != v3) continue;
            v10 = new Object[1];
            v10[0] = var6_4;
            var12_8 = eZ.c("\u00d9", (Object)v10, (long)-5002890592390758150L, (long)var2_2);
            this.a = (int)var12_8;
            this.c = (int)var12_8;
            this.e = var11_7 /* !! */ ;
            v11 = new Object[3];
            v11[2] = var8_5;
            v11[1] = (int)var12_8;
            v11[0] = var11_7 /* !! */ ;
            eZ.c("\u00d9", (Object)v11, (long)-5004136865098505407L, (long)var2_2);
            return;
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(eZ.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(eZ.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


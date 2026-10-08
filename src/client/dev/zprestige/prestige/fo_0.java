/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1799
 *  net.minecraft.class_310
 *  net.minecraft.class_490
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.dL;
import dev.zprestige.prestige.dP;
import dev.zprestige.prestige.dR;
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
import net.minecraft.class_1799;
import net.minecraft.class_310;
import net.minecraft.class_490;

/*
 * Renamed from dev.zprestige.prestige.fo
 */
public class fo_0
extends dV {
    private dR a;
    private dL f;
    private dP c;
    private dP d;
    private f5 e;
    private static final long k;
    private static final String[] l;
    private static final String[] m;
    private static final Map n;
    private static final long[] o;
    private static final Integer[] p;
    private static final Map q;
    private static final Object[] r;
    private static final String[] s;

    public fo_0() {
        long l = k ^ 0xFF899A464D0L;
        long l2 = l ^ 0x7FEE237DB427L;
        this.e = new f5(l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    fo_0.k = hc.a(-2702139012201679404L, -105118916612630859L, MethodHandles.lookup().lookupClass()).a(115845620068184L);
                    fo_0.r = new Object[52];
                    fo_0.s = new String[52];
                    fo_0.f();
                    fo_0.n = new HashMap<K, V>(13);
                    var11 = fo_0.k ^ 19816101873029L;
                    var13_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var11 >>> 56);
                    for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                        v2 = v2;
                        v2[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                    }
                    var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var20_3 = new String[2];
                    var18_4 = 0;
                    var17_5 = "\u00cdZ\u00a7$\u00b9\u00ca\u0001/\u00a6\u00b4\u00d1nj\u00d54\t\u0010\u0001\u0019\u00df\u0098'\u00f7w\u0007\u007f\u00fdV5|_\\_";
                    var19_6 = "\u00cdZ\u00a7$\u00b9\u00ca\u0001/\u00a6\u00b4\u00d1nj\u00d54\t\u0010\u0001\u0019\u00df\u0098'\u00f7w\u0007\u007f\u00fdV5|_\\_".length();
                    var16_7 = 16;
                    var15_8 = -1;
lbl32:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl34:
                    // 1 sources

                    while (true) {
                        var20_3[var18_4++] = fo_0.b(var21_9).intern();
                        if ((var15_8 += var16_7) < var19_6) {
                            var16_7 = var17_5.charAt(var15_8);
                            ** continue;
                        }
                        break block12;
                        break;
                    }
                    v3 = ++var15_8;
                    var21_9 = var13_1.doFinal(var17_5.substring(v3, v3 + var16_7).getBytes("ISO-8859-1"));
                    ** while (true)
                }
                fo_0.l = var20_3;
                fo_0.m = new String[2];
                fo_0.q = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v4 = SecretKeyFactory.getInstance("DES");
                v5 = new byte[8];
                v6 = v5;
                v5[0] = (byte)(var11 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v6 = v6;
                    v6[var1_11] = (byte)(var11 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v4.generateSecret(new DESKeySpec(v6)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[4];
                var3_13 = 0;
                var4_14 = "\"(C'.\u008e\u00fd#\u00f2-.\u00a2T\u0088Y*";
                var5_15 = "\"(C'.\u008e\u00fd#\u00f2-.\u00a2T\u0088Y*".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v7 = var6_12;
                    v8 = var3_13++;
                    v9 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v10 = -1;
                    break block13;
                    break;
                }
lbl85:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "\u00ae\u00935\u0096\u00ba\tc\u0097\u000b\r\u00ea\u00d5|\u008e\u00d0\u00d9";
                    var5_15 = "\u00ae\u00935\u0096\u00ba\tc\u0097\u000b\r\u00ea\u00d5|\u008e\u00d0\u00d9".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v7 = var6_12;
                        v8 = var3_13++;
                        v9 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v10 = 0;
                        break block13;
                        break;
                    }
                    break;
                }
lbl104:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_16 < var5_15) ** continue;
                    break block14;
                    break;
                }
            }
            var8_18 = v9;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v11 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v10) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl117:
                // 1 sources

                ** continue;
            }
        }
        fo_0.o = var6_12;
        fo_0.p = new Integer[4];
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2FCA;
        if (m[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])fo_0.n.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    fo_0.n.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/fo", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = fo_0.l[n2].getBytes("ISO-8859-1");
            fo_0.m[n2] = fo_0.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return m[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = fo_0.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
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
            throw new RuntimeException("dev/zprestige/prestige/fo" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fo" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = fo_0.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7DFB;
        if (p[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = o[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])q.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    q.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/fo", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            fo_0.p[n2] = n3;
        }
        return p[n2];
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fo_0.m(l, l2);
            object = r[n];
            try {
                if (!(object instanceof String)) break block2;
                fo_0.r[n] = clazz = Class.forName(s[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fo_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fo_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fo_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fo_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = r;
        r[0] = "&\u0012LG%m0\u0012I\u001d6z'YJ\u001b:n6\u001e]\fq{-";
        objectArray[1] = "\u007f0lF\u000bgt?}\thja2rb]hp!nNJe";
        objectArray[2] = "(^\u00119Lk>^\u0014c_|)\u0015\u0017eSh8R\u0000r\u0018z\u0004";
        objectArray[3] = " ^*\u000bt\fU~!\u0004eC(f2\u0003l\n@";
        objectArray[4] = "Y.qfS\u0019Y.f:_\u0016Cef$_\u0003D\u00146y\u000e";
        objectArray[5] = "\u001ed\u0005D^;\u001ed\u0012\u0018R4\u0004/\u0012\u0006R!\u0003^F^\u0005";
        objectArray[6] = "qcNnR2qcY2^=k(Y,^(lY\u000bw\u0006b";
        objectArray[7] = "pkMtRFpkZ(^Ij Z6^\\mQ\bm\u0006\u001d";
        objectArray[8] = Boolean.TYPE;
        fo_0.s[8] = "java/lang/Boolean";
        objectArray[9] = "irxL\u001ayiro\u0010\u0016vs9o\u000e\u0016ctH=TA!";
        objectArray[10] = Integer.TYPE;
        fo_0.s[10] = "java/lang/Integer";
        objectArray[11] = "&\nC]\u0000;0\nF\u0007\u0013,'AE\u0001\u001f86\u0006R\u0016T/\t";
        objectArray[12] = "\t\u000b\"\u00067%\u0002\u00043IV+\t\u000f7\u0013";
        objectArray[13] = "\u000el{Jie\u0005cj\u0005\u0014}\u0016dcL";
        objectArray[14] = ">\nC\u0007\u0015I>\nT[\u0019F$ATE\u0019S#0\u0006\u0019L\u0011";
        objectArray[15] = "\u0014\u001dcc\u000bv\u0011\bhc\u0000m\u001d\u0018*\n+G,";
        objectArray[16] = Long.TYPE;
        fo_0.s[16] = "java/lang/Long";
        objectArray[17] = "\u0019u\\N5-\u0012zM\u0001R/\u0007qMJi";
        objectArray[18] = "y\u0000KkH\ny\u0000\\7D\u0005cK\\)D\u0010d:\u000bv\u0012";
        objectArray[19] = "\u001fG\n\u000e(=\u001fG\u001dR$2\u0005\f\u001dL$'\u0002}O\u0017tg";
        objectArray[20] = "\u00186e\u0013\fy\u000e6`I\u001fn\u0019}cO\u0013z\b:tXXoI";
        objectArray[21] = "gU]qdz\u0012uV~u5s{]uqo\u0007";
        objectArray[22] = "f}?@\u000f\u001bf}(\u001c\u0003\u0014|6(\u0002\u0003\u0001{G}]Z";
        objectArray[23] = "xw\u0000)+n\rW\u000b&:!lY\u0000->{\u0018";
        objectArray[24] = "z\u0018+C?\n\u000f8 L.En6+G*\u001f\u001a";
        objectArray[25] = Void.TYPE;
        fo_0.s[25] = "java/lang/Void";
        objectArray[26] = "R~9\u0014q?D~<Nb(S5?Hn<Br(_%,D";
        objectArray[27] = "\nnof\u001bW\u007fNdi\n\u0018\u001e@ob\u000eBj";
        objectArray[28] = "mf.wI(\u0018F%xXgyH.s\\=\r";
        objectArray[29] = ">8\u0012\u0018:W=xFd8+ )\u001e\u0004/\u0011b'\u0006d*E<'\u0007^hK$G";
        objectArray[30] = "\bDQ\t!\u0019VE\u0018\u0017@\r_D\n\t,?\b\u0002T^{h[\u0007\u0004\u000fx\u0016PX\u0010\u0004@";
        objectArray[31] = "NC* b\u0013D\r:'\u001aGC\u001f/sM\u0016\u001dCs\u001fv\u0018CM3%|VSJ";
        objectArray[32] = "(?3)\u001a\u0015jfjja@\u0012<po\u001cF~7gl\u0011*";
        objectArray[33] = "\u0004P\u000b\u0012\u0012z\u001f@\u0000\u001c/z\t\\O8Bi._AwE~\u0011R@\u0014Jl\u0006H0H\u0013~PS_\u0007Lu\u001f2\u000fKD(\f]@\u0014Ogm";
        objectArray[34] = "dl8\u0005&o:mq\u001bGp?}g\u000e\u0010'a*?b|x4v}\u00067{2{";
        objectArray[35] = "<\u0012CsN%7MWxv>8QMu\u001a\fi\u0011\u001c*v1>QMb\u0015>,FW\u0012";
        objectArray[36] = "~J?Y.`*_k\n\u0014`\u0013D\"\u0000}j~\u001ad^y\t-\u001b \u0017z6\u007fB5V\u0014";
        objectArray[37] = "\rZB\u0013$\u0004S[\u000b\rE\u001bVK\u001d\u0018\u0012L\t\u0016Ft+\u0015\u000fZ\u0003K&\u001eQE";
        objectArray[38] = "j\u0019 \u0003j:iYt\u007fhFm\u001f-\u0016b+3Ys\u0012\u0001y3\rv\u001en6l\u00069\u007f";
        objectArray[39] = "<0\u001eH\u0003=o?C^j7m!AE\u0006\u0005?l\u0019\u0013jn\u007f/^PU(c1\u0018\"";
        objectArray[40] = "\u0003[\nz>\u001aPTWlW\u0010RJUw;\"\u0000\u0007\u000b(WK\u0002MD~h\u0019[X\u0005\u0010";
        objectArray[41] = "\u001d\u0002Cl#J\u0018\u0019\u000f)@\u0015\u0011\u000e,{$\t\u001arM.+I\u0016\u001d\u0002q \u0006w";
        objectArray[42] = "\u0012_\u00192zaL^P,\u001b~INF9L)\u0017\u001e\u001fUw(DA\u001c?`hHL";
        objectArray[43] = "tM+bx\u0014 Y0h\n\u001f'[7>f-w\u001bli\nEvLj8e\n)G%Y6\u0017uM>6e\u0018([W";
        objectArray[44] = "eu\u0006\u001b\u0019&.v\u0000\u0016g'3o\f\u001a\u000b\u0015e*QAWB`y\u0010F\u0015,4m\u000bLg";
        objectArray[45] = "\u0016.5R$\u0000G9(MXU)l)S<FF82^`<";
        objectArray[46] = "'<\\\u001ao7wq\u0005^\t(op\\BrE&nHBs*ruE\u001e\t{+vDH6)rc\u0005&";
        objectArray[47] = "H-&,.\u0011\u001b\"{:G\u001b\u0019<y!+)Kq%yGAH+$'(\u000e\u0017 kF";
        objectArray[48] = "rs_Ab &f\u000b\u0012X \u001f}B\u00181*r#\u0004F5I\u007f{^\u0006'-/fY\u001cX";
        objectArray[49] = "\u0019;fS\u0018\u0011H${Yq\u0006x>nV\u0018\b\u0015`(\b\u001ckFalA\u001fT\u00148y\u0000q";
        objectArray[50] = "\u001e3tr8\u0012\u001ds \u000e?n\u00195yg0\u0003Gs'cSPF7n`l\u0002\u001f\"/\u000e";
        Object[] objectArray2 = objectArray;
        objectArray[51] = "|)$\u0004zY/&y\u0012\u0013S-8{\t\u007fa\u007fu\"R\u0013\t|/&\u000f|F#$in";
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fo" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = fo_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f5' || c == 'Q' || c == '\u00df' || c == '\u00db') {
                field = fo_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f5' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'Q' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00df' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fo_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e3' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'a' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean d(Object[] objectArray) {
        Object object;
        block15: {
            int n;
            block14: {
                CallSite callSite;
                CallSite callSite2;
                long l;
                block12: {
                    l = (Long)objectArray[0];
                    l = k ^ l;
                    callSite2 = fo_0.d("a", (long)1901137180415678805L, (long)l);
                    try {
                        try {
                            callSite = fo_0.d("\u00e3", (String)((Object)fo_0.d("\u00e3", (Object)this.a, (long)1900878334371542614L, (long)l)), (Object)fo_0.b("y", (int)29374, (long)(0x7434D41778FA471FL ^ l)), (long)1900996028890270992L, (long)l);
                            if (callSite2 != null) break block12;
                            if (callSite != false) {
                                return fo_0.d("\u00f5", (Object)b, (long)1900675933443004277L, (long)l) instanceof class_490;
                            }
                        }
                        catch (MatchException matchException) {
                            throw fo_0.d("a", (Object)matchException, (long)1904310556987021856L, (long)l);
                        }
                    }
                    catch (MatchException matchException) {
                        throw fo_0.d("a", (Object)matchException, (long)1904310556987021856L, (long)l);
                    }
                    callSite = fo_0.d("\u00e3", (Object)((Integer)((Object)fo_0.d("\u00e3", (Object)this.f, (long)1900878334371542614L, (long)l))), (long)1900631539602790482L, (long)l);
                }
                CallSite callSite3 = callSite;
                try {
                    try {
                        try {
                            object = callSite3;
                            n = -1;
                            if (callSite2 != null) break block14;
                            if (object == n) break block15;
                        }
                        catch (MatchException matchException) {
                            throw fo_0.d("a", (Object)matchException, (long)1904310556987021856L, (long)l);
                        }
                        object = fo_0.d("a", (long)fo_0.d("\u00e3", (Object)fo_0.d("\u00e3", (Object)b, (long)1904323513566649329L, (long)l), (long)1901319728672330118L, (long)l), (int)callSite3, (long)1901173967201237463L, (long)l);
                        if (callSite2 != null) return (boolean)object;
                    }
                    catch (MatchException matchException) {
                        throw fo_0.d("a", (Object)matchException, (long)1904310556987021856L, (long)l);
                    }
                    n = 1;
                }
                catch (MatchException matchException) {
                    throw fo_0.d("a", (Object)matchException, (long)1904310556987021856L, (long)l);
                }
            }
            if (object == n) {
                object = 1;
                return (boolean)object;
            }
        }
        object = 0;
        return (boolean)object;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    /*
     * WARNING - void declaration
     */
    private int a(Object[] objectArray) {
        Object object;
        block9: {
            void var6_5;
            class_1799 class_17992 = (class_1799)objectArray[0];
            long l = (Long)objectArray[1];
            l = k ^ l;
            CallSite callSite = fo_0.c("e", (int)22668, (long)(0x4E08FA75941EE2E3L ^ l));
            CallSite callSite2 = fo_0.d("a", (long)5160354272655606954L, (long)l);
            while (var6_5 < fo_0.c("e", (int)22068, (long)(0x2026A96F80DEEC5AL ^ l))) {
                block11: {
                    CallSite callSite3;
                    block8: {
                        CallSite callSite4;
                        block10: {
                            callSite4 = fo_0.d("\u00e3", (Object)fo_0.d("\u00e3", (Object)fo_0.d("\u00f5", (Object)b, (long)5160518750327138871L, (long)l), (long)5160698762538141384L, (long)l), (int)var6_5, (long)5161006568178553741L, (long)l);
                            try {
                                try {
                                    callSite3 = callSite4;
                                    if (callSite2 != null) break block8;
                                    object = fo_0.d("\u00e3", (Object)callSite3, (long)5160962561573932064L, (long)l);
                                    if (callSite2 != null) break block9;
                                }
                                catch (MatchException matchException) {
                                    throw fo_0.d("a", (Object)matchException, (long)5157194088587757535L, (long)l);
                                }
                                if (object == 0) break block10;
                                break block11;
                            }
                            catch (MatchException matchException) {
                                throw fo_0.d("a", (Object)matchException, (long)5157194088587757535L, (long)l);
                            }
                        }
                        callSite3 = callSite4;
                    }
                    try {
                        if (fo_0.d("\u00e3", (Object)callSite3, (long)5160169168556248219L, (long)l) == fo_0.d("\u00e3", (Object)class_17992, (long)5160169168556248219L, (long)l)) {
                            return (int)var6_5;
                        }
                    }
                    catch (MatchException matchException) {
                        throw fo_0.d("a", (Object)matchException, (long)5157194088587757535L, (long)l);
                    }
                }
                ++var6_5;
                if (callSite2 == null) continue;
            }
            object = -1;
        }
        return object;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @bP
    public void a(bG bG2) {
        void var15_10;
        CallSite callSite;
        long l;
        long l2;
        long l3;
        long l4;
        block26: {
            CallSite callSite2;
            Object object;
            block27: {
                block24: {
                    long l5;
                    block25: {
                        class_310 class_3102;
                        long l6;
                        block23: {
                            long l7 = l4 = k ^ 0x5FA0BCBAECC5L;
                            l3 = l7 ^ 0x6C104E56E4B0L;
                            l2 = l7 ^ 0x6D4CCDFFD832L;
                            l = l7 ^ 0xCC4C7BAAB50L;
                            l6 = l7 ^ 0x3A1894B8E0A3L;
                            l5 = l7 ^ 0x7C2B6C82F6AFL;
                            callSite = fo_0.d("a", (long)-4060230474119183216L, (long)l4);
                            try {
                                try {
                                    class_3102 = b;
                                    if (callSite != null) break block23;
                                    if (fo_0.d("\u00f5", (Object)class_3102, (long)-4060079393025136115L, (long)l4) == null) return;
                                }
                                catch (MatchException matchException) {
                                    throw fo_0.d("a", (Object)matchException, (long)-4059885626107688987L, (long)l4);
                                }
                                class_3102 = b;
                            }
                            catch (MatchException matchException) {
                                throw fo_0.d("a", (Object)matchException, (long)-4059885626107688987L, (long)l4);
                            }
                        }
                        try {
                            if (fo_0.d("\u00f5", (Object)class_3102, (long)-4060465993719660012L, (long)l4) == null) {
                                return;
                            }
                        }
                        catch (MatchException matchException) {
                            throw fo_0.d("a", (Object)matchException, (long)-4059885626107688987L, (long)l4);
                        }
                        try {
                            Object[] objectArray = new Object[2];
                            objectArray[1] = l6;
                            objectArray[0] = Float.valueOf((float)fo_0.d("\u00e3", (Object)((Integer)((Object)fo_0.d("\u00e3", (Object)this.d, (long)-4061018631395578989L, (long)l4))), (long)-4060701480851454569L, (long)l4));
                            object = fo_0.d("\u00e3", (Object)this.e, (Object)objectArray, (long)-4060503739143088343L, (long)l4);
                            if (callSite != null) break block24;
                            if (object != false) break block25;
                            return;
                        }
                        catch (MatchException matchException) {
                            throw fo_0.d("a", (Object)matchException, (long)-4059885626107688987L, (long)l4);
                        }
                    }
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l5;
                    object = fo_0.d("\u00e3", (Object)this, (Object)objectArray, (long)-4061256436528792918L, (long)l4);
                }
                try {
                    if (callSite != null) break block26;
                    if (object != false) break block27;
                    return;
                }
                catch (MatchException matchException) {
                    throw fo_0.d("a", (Object)matchException, (long)-4059885626107688987L, (long)l4);
                }
            }
            object = callSite2 = (Object)0;
        }
        while (var15_10 < fo_0.c("e", (int)25969, (long)(0x1C9845E3415B5F27L ^ l4))) {
            block30: {
                int n;
                CallSite callSite3;
                CallSite callSite4;
                block36: {
                    block37: {
                        CallSite callSite5;
                        block35: {
                            Object object;
                            CallSite callSite6;
                            block33: {
                                block34: {
                                    block31: {
                                        block32: {
                                            block28: {
                                                block29: {
                                                    callSite6 = fo_0.d("\u00e3", (Object)fo_0.d("\u00e3", (Object)fo_0.d("\u00f5", (Object)b, (long)-4060079393025136115L, (long)l4), (long)-4061095584771750158L, (long)l4), (int)var15_10, (long)-4060558998907513929L, (long)l4);
                                                    try {
                                                        callSite5 = fo_0.d("\u00e3", (Object)callSite6, (long)-4060831652592235494L, (long)l4);
                                                        if (callSite != null) break block28;
                                                        if (callSite5 == false) break block29;
                                                        break block30;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw fo_0.d("a", (Object)matchException, (long)-4059885626107688987L, (long)l4);
                                                    }
                                                }
                                                callSite5 = fo_0.d("\u00e3", (Object)callSite6, (long)-4061134433388765091L, (long)l4);
                                            }
                                            try {
                                                object = 1;
                                                if (callSite != null) break block31;
                                                if (callSite5 > object) break block32;
                                                break block30;
                                            }
                                            catch (MatchException matchException) {
                                                throw fo_0.d("a", (Object)matchException, (long)-4059885626107688987L, (long)l4);
                                            }
                                        }
                                        callSite5 = fo_0.d("\u00e3", (Object)callSite6, (long)-4060847183032174454L, (long)l4);
                                        object = fo_0.d("\u00e3", (Object)callSite6, (long)-4061134433388765091L, (long)l4);
                                    }
                                    try {
                                        if (callSite != null) break block33;
                                        if (callSite5 < object) break block34;
                                        break block30;
                                    }
                                    catch (MatchException matchException) {
                                        throw fo_0.d("a", (Object)matchException, (long)-4059885626107688987L, (long)l4);
                                    }
                                }
                                try {
                                    callSite5 = fo_0.d("\u00e3", (Object)callSite6, (long)-4060847183032174454L, (long)l4);
                                    if (callSite != null) break block35;
                                    object = fo_0.d("\u00e3", (Object)((Integer)((Object)fo_0.d("\u00e3", (Object)this.c, (long)-4061018631395578989L, (long)l4))), (long)-4060701480851454569L, (long)l4);
                                }
                                catch (MatchException matchException) {
                                    throw fo_0.d("a", (Object)matchException, (long)-4059885626107688987L, (long)l4);
                                }
                            }
                            if (callSite5 > object) break block30;
                            Object[] objectArray = new Object[2];
                            objectArray[1] = l;
                            objectArray[0] = callSite6;
                            callSite5 = fo_0.d("\u00e3", (Object)this, (Object)objectArray, (long)-4060389518750986020L, (long)l4);
                        }
                        callSite4 = callSite5;
                        try {
                            callSite3 = callSite4;
                            n = -1;
                            if (callSite != null) break block36;
                            if (callSite3 != n) break block37;
                            break block30;
                        }
                        catch (MatchException matchException) {
                            throw fo_0.d("a", (Object)matchException, (long)-4059885626107688987L, (long)l4);
                        }
                    }
                    callSite3 = fo_0.c("e", (int)6376, (long)(0x455A6507B716A2BFL ^ l4));
                    n = var15_10;
                }
                reference var18_13 = callSite3 + n;
                Object[] objectArray = new Object[4];
                objectArray[3] = l3;
                objectArray[2] = fo_0.d("\u00df", (long)-4059737916178396280L, (long)l4);
                objectArray[1] = 0;
                objectArray[0] = (int)callSite4;
                fo_0.d("a", (Object)objectArray, (long)-4061287334746893250L, (long)l4);
                Object[] objectArray2 = new Object[4];
                objectArray2[3] = l3;
                objectArray2[2] = fo_0.d("\u00df", (long)-4059737916178396280L, (long)l4);
                objectArray2[1] = 0;
                objectArray2[0] = (int)var18_13;
                fo_0.d("a", (Object)objectArray2, (long)-4061287334746893250L, (long)l4);
                Object[] objectArray3 = new Object[4];
                objectArray3[3] = l3;
                objectArray3[2] = fo_0.d("\u00df", (long)-4059737916178396280L, (long)l4);
                objectArray3[1] = 0;
                objectArray3[0] = (int)callSite4;
                fo_0.d("a", (Object)objectArray3, (long)-4061287334746893250L, (long)l4);
                Object[] objectArray4 = new Object[1];
                objectArray4[0] = l2;
                fo_0.d("\u00e3", (Object)this.e, (Object)objectArray4, (long)-4061369058814051515L, (long)l4);
                return;
            }
            ++var15_10;
            if (callSite == null) continue;
        }
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (s[n3] != null) {
            return n3;
        }
        Object object = r[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 54;
            case 1 -> 28;
            case 2 -> 5;
            case 3 -> 16;
            case 4 -> 29;
            case 5 -> 1;
            case 6 -> 43;
            case 7 -> 53;
            case 8 -> 40;
            case 9 -> 41;
            case 10 -> 15;
            case 11 -> 19;
            case 12 -> 4;
            case 13 -> 14;
            case 14 -> 22;
            case 15 -> 56;
            case 16 -> 10;
            case 17 -> 60;
            case 18 -> 9;
            case 19 -> 58;
            case 20 -> 46;
            case 21 -> 0;
            case 22 -> 39;
            case 23 -> 23;
            case 24 -> 42;
            case 25 -> 8;
            case 26 -> 62;
            case 27 -> 26;
            case 28 -> 32;
            case 29 -> 57;
            case 30 -> 44;
            case 31 -> 13;
            case 32 -> 35;
            case 33 -> 63;
            case 34 -> 12;
            case 35 -> 61;
            case 36 -> 45;
            case 37 -> 30;
            case 38 -> 50;
            case 39 -> 2;
            case 40 -> 37;
            case 41 -> 59;
            case 42 -> 17;
            case 43 -> 7;
            case 44 -> 33;
            case 45 -> 3;
            case 46 -> 34;
            case 47 -> 31;
            case 48 -> 47;
            case 49 -> 38;
            case 50 -> 52;
            case 51 -> 27;
            case 52 -> 6;
            case 53 -> 18;
            case 54 -> 36;
            case 55 -> 55;
            case 56 -> 21;
            case 57 -> 51;
            case 58 -> 20;
            case 59 -> 11;
            case 60 -> 49;
            case 61 -> 24;
            case 62 -> 25;
            default -> 48;
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
        fo_0.s[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = fo_0.m(l, l2);
        Object object = r[n];
        if (object instanceof String) {
            String string = s[n];
            int n2 = string.indexOf(8);
            Class clazz = fo_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fo_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fo_0.g(clazz3, string2, clazz2)) != null) {
                    fo_0.r[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fo_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fo_0.r[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fo_0.n(871300149322356L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = fo_0.m(l, l2);
        Object object = r[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = s[n];
                int n3 = string2.indexOf(8);
                clazz3 = fo_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fo_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fo_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        fo_0.r[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fo_0.n(871300149322356L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fo_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fo_0.r[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fo_0.n(871300149322356L, 0L);
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

    private boolean lambda$new$0(Integer n) {
        long l = k ^ 0x1EE2B855FF36L;
        return (boolean)fo_0.d("\u00e3", (String)((Object)fo_0.d("\u00e3", (Object)this.a, (long)-3146014684008449952L, (long)l)), (Object)fo_0.b("y", (int)29629, (long)(0x111FCEA22395882BL ^ l)), (long)-3145787125432188122L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fo_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(fo_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(fo_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


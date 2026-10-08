/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2338
 *  net.minecraft.class_2626
 *  net.minecraft.class_2885
 *  net.minecraft.class_3965
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.a5;
import dev.zprestige.prestige.a9;
import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bg_0;
import dev.zprestige.prestige.bh_0;
import dev.zprestige.prestige.d0;
import dev.zprestige.prestige.dC;
import dev.zprestige.prestige.dF;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dP;
import dev.zprestige.prestige.dQ;
import dev.zprestige.prestige.dR;
import dev.zprestige.prestige.dS;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.ei_0;
import dev.zprestige.prestige.f5;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.q_0;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2338;
import net.minecraft.class_2626;
import net.minecraft.class_2885;
import net.minecraft.class_3965;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class dY
extends dV
implements dF {
    private dM d;
    private dQ a;
    private dM c;
    private dR e;
    private dM f;
    private dM g;
    private dR h;
    private dP i;
    private dM j;
    private dM k;
    private dM l;
    private dS m;
    private dO n;
    public static boolean o;
    private f5 p;
    private ArrayList q;
    private int r;
    private int s;
    private static final long t;
    private static final String[] u;
    private static final String[] v;
    private static final Map w;
    private static final long x;
    private static final Object[] y;
    private static final String[] z;

    public dY() {
        long l;
        long l2 = l = t ^ 0x29FAE2E6BF9FL;
        long l3 = l2 ^ 0x159B3CDEAADL;
        long l4 = l2 ^ 0x96FA0F8FD74L;
        long l5 = l2 ^ 0x449567875BBEL;
        long l6 = l2 ^ 0x4FEF068F3FF0L;
        long l7 = l2 ^ 0x54221A29819FL;
        this.p = new f5(l3);
        this.q = new ArrayList();
        this.r = -1;
        this.s = -1;
        Object[] objectArray = new Object[2];
        objectArray[1] = l5;
        objectArray[0] = this::lambda$new$0;
        dY.c("\u00d5", (Object)this.e, (Object)objectArray, (long)1237951938952527990L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l7;
        objectArray2[0] = this::lambda$new$4;
        dY.c("\u00d5", (Object)this.j, (Object)objectArray2, (long)1225707785114149933L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l7;
        objectArray3[0] = this::lambda$new$5;
        dY.c("\u00d5", (Object)this.k, (Object)objectArray3, (long)1225707785114149933L, (long)l);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l6;
        objectArray4[0] = this::lambda$new$3;
        dY.c("\u00d5", (Object)this.i, (Object)objectArray4, (long)1232878142808387446L, (long)l);
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l4;
        objectArray5[0] = this::lambda$new$6;
        dY.c("\u00d5", (Object)this.n, (Object)objectArray5, (long)1238107723279234558L, (long)l);
        Object[] objectArray6 = new Object[2];
        objectArray6[1] = l7;
        objectArray6[0] = this::lambda$new$1;
        dY.c("\u00d5", (Object)this.f, (Object)objectArray6, (long)1225707785114149933L, (long)l);
        Object[] objectArray7 = new Object[2];
        objectArray7[1] = l5;
        objectArray7[0] = this::lambda$new$2;
        dY.c("\u00d5", (Object)this.h, (Object)objectArray7, (long)1237951938952527990L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    dY.t = hc.a(-6662028873969614064L, 8812781263413907045L, MethodHandles.lookup().lookupClass()).a(146390141445373L);
                    dY.y = new Object[207];
                    dY.z = new String[207];
                    dY.f();
                    dY.w = new HashMap<K, V>(13);
                    var5 = dY.t ^ 35063620456643L;
                    var7_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var5 >>> 56);
                    for (var8_2 = 1; var8_2 < 8; ++var8_2) {
                        v2 = v2;
                        v2[var8_2] = (byte)(var5 << var8_2 * 8 >>> 56);
                    }
                    var7_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var14_3 = new String[8];
                    var12_4 = 0;
                    var11_5 = "\u00f8\u009e\u0089\"0\u00bdBg\u00d8\u0093C<wdkX\u0010(\u00bdo\u0019_\u0018\u00b1\ts\u001c\u008f\u0016a\u0003L$\u00100,\u00fc\u00dciv\u0093\u0007Z1&Du\u00c2\u00d7\u00db\u0010\u009eK\u00c6\u00bb\u0086B\u00cbl>\u00cd\u00a4\u00a8f\u00a3Ao \u00d5/V\u00b1W\u009eR\u00d29\u00b6\u009dC\u001e\u00b7\u00d3W\u008eL\u00c6\u00d4\u00f6\u00b3\u0016\u00e3\u0016\u00f3\u00e3\u0088\u009d\u008dV^\u0010-,\u00af\u00c0&!\u0090\u00b8\u0019\u00c3f\u000e\u00e0\u00f2\u00bd\u00ad";
                    var13_6 = "\u00f8\u009e\u0089\"0\u00bdBg\u00d8\u0093C<wdkX\u0010(\u00bdo\u0019_\u0018\u00b1\ts\u001c\u008f\u0016a\u0003L$\u00100,\u00fc\u00dciv\u0093\u0007Z1&Du\u00c2\u00d7\u00db\u0010\u009eK\u00c6\u00bb\u0086B\u00cbl>\u00cd\u00a4\u00a8f\u00a3Ao \u00d5/V\u00b1W\u009eR\u00d29\u00b6\u009dC\u001e\u00b7\u00d3W\u008eL\u00c6\u00d4\u00f6\u00b3\u0016\u00e3\u0016\u00f3\u00e3\u0088\u009d\u008dV^\u0010-,\u00af\u00c0&!\u0090\u00b8\u0019\u00c3f\u000e\u00e0\u00f2\u00bd\u00ad".length();
                    var10_7 = 16;
                    var9_8 = -1;
lbl32:
                    // 2 sources

                    while (true) {
                        v3 = ++var9_8;
                        v4 = var11_5.substring(v3, v3 + var10_7);
                        v5 = -1;
                        break block12;
                        break;
                    }
lbl37:
                    // 1 sources

                    while (true) {
                        var14_3[var12_4++] = dY.b(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        var11_5 = "u=\u0091U\u00bd`\u00ff\u00f6\u0011\u0092'\u00ec\u00ba\u00b0\u00e3\u0081 \u00a9\u0097\u00072\u00e4\u00e8\u00f5l*\u00e32\u0095\u00e0+\u001dZv\u00d3\t\n\u0081\u0088\u0004\u00e1 \u00c85\u0012Bk\u008d\u009e";
                        var13_6 = "u=\u0091U\u00bd`\u00ff\u00f6\u0011\u0092'\u00ec\u00ba\u00b0\u00e3\u0081 \u00a9\u0097\u00072\u00e4\u00e8\u00f5l*\u00e32\u0095\u00e0+\u001dZv\u00d3\t\n\u0081\u0088\u0004\u00e1 \u00c85\u0012Bk\u008d\u009e".length();
                        var10_7 = 16;
                        var9_8 = -1;
lbl46:
                        // 2 sources

                        while (true) {
                            v6 = ++var9_8;
                            v4 = var11_5.substring(v6, v6 + var10_7);
                            v5 = 0;
                            break block12;
                            break;
                        }
                        break;
                    }
lbl51:
                    // 1 sources

                    while (true) {
                        var14_3[var12_4++] = dY.b(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        break block13;
                        break;
                    }
                }
                var15_9 = var7_1.doFinal(v4.getBytes("ISO-8859-1"));
                switch (v5) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl63:
                    // 1 sources

                    ** continue;
                }
            }
            dY.u = var14_3;
            dY.v = new String[8];
            var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
            v7 = SecretKeyFactory.getInstance("DES");
            v8 = new byte[8];
            v9 = v8;
            v8[0] = (byte)(var5 >>> 56);
            for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                v9 = v9;
                v9[var1_11] = (byte)(var5 << var1_11 * 8 >>> 56);
            }
            break block14;
lbl83:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
        var2_12 = 6338084608220831524L;
        var4_13 = var0_10.doFinal(new byte[]{(byte)(var2_12 >>> 56), (byte)(var2_12 >>> 48), (byte)(var2_12 >>> 40), (byte)(var2_12 >>> 32), (byte)(var2_12 >>> 24), (byte)(var2_12 >>> 16), (byte)(var2_12 >>> 8), (byte)var2_12});
        ** while (true)
        dY.x = ((long)var4_13[0] & 255L) << 56 | ((long)var4_13[1] & 255L) << 48 | ((long)var4_13[2] & 255L) << 40 | ((long)var4_13[3] & 255L) << 32 | ((long)var4_13[4] & 255L) << 24 | ((long)var4_13[5] & 255L) << 16 | ((long)var4_13[6] & 255L) << 8 | (long)var4_13[7] & 255L;
    }

    @Override
    public void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x7FAB131DDD11L;
        dY.c("\u00d5", (Object)this.q, (long)3983923928672232350L, (long)l);
        this.r = -1;
        this.s = -1;
        o = 0;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = this;
        dY.c("\u00d5", (Object)dY.c("\u00ef", (long)3981213631857823266L, (long)l), (Object)objectArray2, (long)3983362857235496772L, (long)l);
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3C75;
        if (v[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])w.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    w.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/dY", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = u[n2].getBytes("ISO-8859-1");
            dY.v[n2] = dY.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return v[n2];
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
            throw new RuntimeException("dev/zprestige/prestige/dY" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public boolean b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return (boolean)dY.c("\u00d5", (Object)dY.c("\u00ef", (long)1614999905358445616L, (long)l), (Object)dY.c("\u00d5", (Object)this.l, (long)1608663270996846020L, (long)l), (long)1616342741996132752L, (long)l);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = dY.b(n, l);
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
            throw new RuntimeException("dev/zprestige/prestige/dY" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = dY.m(l, l2);
            object = y[n];
            try {
                if (!(object instanceof String)) break block2;
                dY.y[n] = clazz = Class.forName(z[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = dY.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = dY.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = dY.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = dY.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = y;
        y[0] = "<y\u0000n~Q7v\u0011!\u0012R9t\u0013n>";
        objectArray[1] = Boolean.TYPE;
        dY.z[1] = "java/lang/Boolean";
        objectArray[2] = "R`P&\u0012lD`U|\u0001{S+Vz\roBlAmFx}";
        objectArray[3] = "\u0010!\bP#\u000e\u001b.\u0019\u001fB\u0000\u0010%\u001dE";
        objectArray[4] = "\u0005\tea39\u0013\t`; .\u0004Bc=,:\u0015\u0005t*g()";
        objectArray[5] = "lN2\u000f\u0013\u0018\u0019n9\u0000\u0002Wdv*\u0007\u000b\u001e\f";
        objectArray[6] = "\u007f|\u0004\u0000;Mi|\u0001Z(Z~7\u0002\\$Nop\u0015KoYH";
        objectArray[7] = "\bQ2@e)}q9Otf\u001c\u007f2Dp<h";
        objectArray[8] = "\u001d\r-N`!\u000b\r(\u0014s6\u001cF+\u0012\u007f\"\r\u0001<\u000545 ";
        objectArray[9] = "\u0018D&\u001d =\u0013K7RC0\u0006F89v2\u0017U$\u0015a?";
        objectArray[10] = "P\\\u001f|\u00019F\\\u001a&\u0012.Q\u0017\u0019 \u001e:@P\u000e7U-s";
        objectArray[11] = "j22)\tu\u001f\u00129&\u0018:~\u001c2-\u001c`\n";
        objectArray[12] = "\u0012\u00073\u001d\u0004@\u0004\u00076G\u0017W\u0013L5A\u001bC\u0002\u000b\"VPT5";
        objectArray[13] = "f}>r\u0003If}).\u000fF|6)0\u000fS{Gym^";
        objectArray[14] = "\u0018\"\u0018M,\u0010\u0018\"\u000f\u0011 \u001f\u0002i\u000f\u000f \n\u0005\u0018[Ww";
        objectArray[15] = "\u0014\f*PN:\u0002\f/\n]-\u0015G,\fQ9\u0004\u0000;\u001b\u001a)\u0002";
        objectArray[16] = "B\"\u00019Q\u001f7\u0002\n6@PV\f\u0001=D\n\"";
        objectArray[17] = "\u0012!$J =\u0004!!\u00103*\u0013j\"\u0016?>\u0002-5\u0001t,\u0019";
        objectArray[18] = "+r\b\u001c\u0012i^R\u0003\u0013\u0003&?\\\b\u0018\u0007|K";
        objectArray[19] = Integer.TYPE;
        dY.z[19] = "java/lang/Integer";
        objectArray[20] = "$jtr>>:bn=Y?+ycg\u007f9";
        objectArray[21] = "%\u001f5e~S%\u001f\"9r\\?T\"'rI8%sy'\f";
        objectArray[22] = "pb\u0001q\t}pb\u0016-\u0005rj)\u00163\u0005gmXGmP,";
        objectArray[23] = "3I?V\u0010Y3I(\n\u001cV)\u0002(\u0014\u001cC.syKN\b";
        objectArray[24] = "8t!P\u001a*8t6\f\u0016%\"?6\u0012\u00160%NgJD";
        objectArray[25] = "\u001eLM\u0018EC\bLHBVT\u001f\u0007KDZ@\u000e@\\S\u0011U\b";
        objectArray[26] = "\u0015\fS8>v`,X7/9\u0001\"S<+cu";
        objectArray[27] = "P\u0016y2\u0003\u0016%6r=\u0012YD8y6\u0016\u00030";
        objectArray[28] = "G*>\u000f!rG*)S-}]a)M-hZ\u0010x\u0012u";
        objectArray[29] = "b\u0015F\u0017j\u0011\u00175M\u0018{^v;F\u0013\u007f\u0004\u0002";
        objectArray[30] = "\u0013\u0011Uz\u0012\u0019\r\u0019O5p\u0005\n\u0004";
        objectArray[31] = "&81\tiq80+F\u0006v>8>$.w8";
        objectArray[32] = "\u001dq+ #}\u000bq.z0j\u001c:-|<~\r}:kwnL";
        objectArray[33] = "rQ]F3D\u0007qVI\"\u000bf\u007f]B&Q\u0012";
        objectArray[34] = "\u0001S\u0000U3<ts\u000bZ\"s\u0015}\u0000Q&)a";
        objectArray[35] = "\u001927nB*l\u0012<aSe\r\u001c7jW?y";
        objectArray[36] = "`<:T\u0014j`<-\b\u0018ezw-\u0016\u0018p}\u0006\u007fLL4";
        objectArray[37] = "rhJ:7k\u0007HA5&$fFJ>\"~\u0012";
        objectArray[38] = "\u001eIaK2DkijD#\u000b\ngaO'Q~";
        objectArray[39] = "em;S\u007f]em,\u000fsR\u007f&,\u0011sGxW|D$\u0001";
        objectArray[40] = "!\u001bO\u00011G*\u0014^NL_9\u0013W\u0007";
        objectArray[41] = "A~\u0012SIuW~\u0017\tZb@5\u0014\u000fVvQr\u0003\u0018\u001dfJ";
        objectArray[42] = "F2R\u0015a\"3\u0012Y\u001apmR\u001cR\u0011t7&";
        objectArray[43] = Float.TYPE;
        dY.z[43] = "java/lang/Float";
        objectArray[44] = "f\u0019&\u00024{p\u0019#X'lgR ^+xv\u00157I`h:";
        objectArray[45] = "S\u001cx'\u001aQ&<s(\u000b\u001eG2x#\u000fD3";
        objectArray[46] = "\u0019\u001b\f\\T \u0019\u001b\u001b\u0000X/\u0003P\u001b\u001eX:\u0004!I@\u0000~";
        objectArray[47] = "|\"\u0004&l6j\"\u0001|\u007f!}i\u0002zs5l.\u0015m8\"\\";
        objectArray[48] = "0byn\u0015LEBra\u0004\u0003$Lyj\u0000YP";
        objectArray[49] = "^ta7\u001ewHtdm\r`_?gk\u0001tNxp|Jd\r";
        objectArray[50] = "Hq\n^1\u0003=Q\u0001Q L\\_\nZ$\u0016(";
        objectArray[51] = "8VRuy\u0001MvYzhN,xRql\u0014X";
        objectArray[52] = "\u0014\u0015\u001es#_\u001f\u001a\u000f<D]\n\u0011\u000fw\u007f";
        objectArray[53] = "O\u00024$:1:\"?++~[,4 /$/";
        objectArray[54] = Void.TYPE;
        dY.z[54] = "java/lang/Void";
        objectArray[55] = "mnmM\u0016\u0014{nh\u0017\u0005\u0003l%k\u0011\t\u0017}b|\u0006B\u0007eb~\r\u0018JYy~\u0010\u0018\rnn";
        objectArray[56] = "\u0001\u0005:jt#t%1eel\u0015+:na6a";
        objectArray[57] = "\u0007JJ\u0013$ArjA\u001c5\u000e\u0013dJ\u00171Tg";
        objectArray[58] = Double.TYPE;
        dY.z[58] = "java/lang/Double";
        objectArray[59] = "\u007f\u0018}/\\Ai\u0018xuOV~S{sCBo\u0014ld\bW*";
        objectArray[60] = "1\u00075.ssD'>!b<%)5*ffQ";
        objectArray[61] = "FP\u001c\u0012[-3p\u0017\u001dJbR~\u001c\u0016N8&";
        objectArray[62] = "IL?\u0002rYBC.M\u001aYLL=";
        objectArray[63] = "g)p\u0016?F\u0012\t{\u0019.\ts\u0007p\u0012*S\u0007";
        objectArray[64] = "\"\u0001\u00018W2\"\u0001\u0016d[=8J\u0016z[(?;D.\ni";
        objectArray[65] = "t\u000b\u001eOSft\u000b\t\u0013_in@\t\r_|i1[V\u0007=";
        objectArray[66] = "CVm\u0015_\\6vf\u001aN\u0013Wxm\u0011JI#";
        objectArray[67] = "b&0n\u0006p|.*!{`|";
        objectArray[68] = "{~\f\u0016]j\u000e^\u0007\u0019L%oP\f\u0012H\u007f\u001b";
        objectArray[69] = "nhq%\t\u001c\u001bHz*\u0018SzFq!\u001c\t\u000e";
        objectArray[70] = "k-\u0006\u007fB\u001d}-\u0003%Q\njf\u0000#]\u001e{!\u00174\u0016\tY";
        objectArray[71] = "\u0002F|?c'wfw0rh\u0016h|;v2b";
        objectArray[72] = "\u007f@\u0004T(\u0011i@\u0001\u000e;\u0006~\u000b\u0002\b7\u0012oL\u0015\u001f|\u0000|";
        objectArray[73] = "\u001f{]3\u000b>j[V<\u001aq\u000bU]7\u001e+\u007f";
        objectArray[74] = "\f\u0018i!\r7\f\u0018~}\u00018\u0016S~c\u0001-\u0011\",8Yg";
        objectArray[75] = "\u0019k80uYlK3?d\u0016\rE84`Ly";
        objectArray[76] = "\u0007\u00030\u000bU_\u0007\u0003'WYP\u001dH'IYE\u001a9v\u0013\n\u0000";
        objectArray[77] = "S8,-3\u001dS8;q?\u0012Is;o?\u0007N\u0002j5fD";
        objectArray[78] = "(_\u0001xF\u0002>_\u0004\"U\u0015)\u0014\u0007$Y\u00018S\u00103\u0012\u0010+";
        objectArray[79] = "jg\u0018w8l\u001fG\u0013x)#~I\u0018s-y\n";
        objectArray[80] = "\u0011:PzkO\u0011:G&g@\u000bqG8gU\f\u0000\u0016a?\u0010";
        objectArray[81] = "V\b(wux#(#xd7B&(s`m6";
        objectArray[82] = "7s|r\u007fO7sk.s@-8k0sU*I>o*";
        objectArray[83] = "yJ\u0007#\u007fFoJ\u0002ylQx\u0001\u0001\u007f`EiF\u0016h+RO";
        objectArray[84] = "=1\u0001:u/H\u0011\n5d`)\u001f\u0001>`:]";
        objectArray[85] = "m,\u007f\u0012E\u001a{,zHV\rlgyNZ\u0019} nY\u0011\u000eF";
        objectArray[86] = ":Q)cy-Oq\"lhb.\u007f)gl8Z";
        objectArray[87] = "4T\u0004Xmg\"T\u0001\u0002~p5\u001f\u0002\u0004rd$X\u0015\u00139s\u0000";
        objectArray[88] = "\u000e\u0010\u001a5\u0016M{0\u0011:\u0007\u0002\u001a>\u001a1\u0003Xn";
        objectArray[89] = "\u001b\u001b|\n\u001c:\r\u001byP\u000f-\u001aPzV\u00039\u000b\u0017mAH.2";
        objectArray[90] = "i\u0004b\u0005m$\u001c$i\n|k}*b\u0001x1\t";
        objectArray[91] = "\u000fK5\u0014p/\u0019K0Nc8\u000e\u00003Ho,\u001fG$_$9^";
        objectArray[92] = "\tk-U.\b|K&Z?G\u001dE-Q;\u001di";
        objectArray[93] = "X!x%c\u0007N!}\u007fp\u0010Yj~y|\u0004H-in7\u0013m";
        objectArray[94] = "\u0013\u0018K:*:f8@5;u\u00076K>?/s";
        objectArray[95] = "zJE%zhzJRyvg`\u0001Rgvrgp\u00058 ";
        objectArray[96] = ")`\u001dI\u001cK7h\u0007\u0006TK-b\u001fA]PmQ\u0019MVW `\u001fM";
        objectArray[97] = "<Gi6@>Igb9Qq(ii2U+\\";
        objectArray[98] = "\u0005\u0013/\n\r|p3$\u0005\u001c3\u0011=/\u000e\u0018ie";
        objectArray[99] = "I8fe\u000f\u0017<\u0018mj\u001eX]\u0016fa\u001a\u0002)";
        objectArray[100] = "@X\u000b%U7@X\u001cyY8Z\u0013\u001cgY-]bM8\rn";
        objectArray[101] = "Z\u00073\u0016A>Z\u0007$JM1@L$TM$G=u\u0000\u0014b";
        objectArray[102] = "sU\u0001)\u0007\u000fsU\u0016u\u000b\u0000i\u001e\u0016k\u000b\u0015noD5\\^";
        objectArray[103] = "WeG-N{\"EL\"_4CKG)[n7";
        objectArray[104] = "-Hr1h\u000e;Hwk{\u0019,\u0003tmw\r=Dcz<\u001c!";
        objectArray[105] = "%=\u0002\u001fL9P\u001d\t\u0010]v1\u0013\u0002\u001bY,E";
        objectArray[106] = "\u001a,7\u000f^Xo\f<\u0000O\u0017\u000e\u00027\u000bKMz";
        objectArray[107] = "u-6\u0001\u007fc5r#U\u00010J(~P9%*j*\u0001?2J\"#\u0000~76q6Rb\\";
        objectArray[108] = "bULH**&Z\u0001Y\u0014/YPJ\t,?9\u0012\u001eX*(YSIKd>9\u000bOHp?Y";
        objectArray[109] = "\u001f\u000f\u00072%.\u001a\u0014Bh%\u0014LtD8w,_\u0014\u0006l&*HtG;5d^\u0014\u001f=6p_t";
        objectArray[110] = "9\fF\u001fW\f8\u001f^\r\u0015jig\u0005OPRy\u0007G\u001b\u0001Tng\u0006L\u0012\u001ax\u0007^J\u0011\u000eyg";
        objectArray[111] = "-0pfnV(64a^])q-82oz4tb^\u0001.=,.%F-m=_";
        objectArray[112] = "vDe\u0017n\nf\u0017c\u0001\u001f\u0006t\u0000c\u0016s4%B>L/cv\u000ej\u0016r_f\u0013gN\u001f";
        objectArray[113] = "HBn<bj\u001d\u0012\"c\u001b6\u0014\u0001><w\u0004@@`j\u001bj\u0013M?*`-\u0010\u001d.[";
        objectArray[114] = "(\u0017&VY%hH3\u0002's\u0017\u0012n\u0007\u001fcwP:V\u0019t\u0017KlA_ oM%[U\u001a";
        objectArray[115] = "~\u0005=~H,l\u0000=8+y\u0015\u0002?;\u0013iu@kj\u0015~\u0015\\8;Hws\u0001{~\u0012\u0010";
        objectArray[116] = "6|+.t77o3<6Qe\u0017h~sivw**\"oa\u0017>)(m3*c4:,\u000f";
        objectArray[117] = "Bjn \u0015\u0018_qjzp\u0015A~n#\u0011\u0018]\u0018(3\tBOs~zJO&!xz\u0011\u000f]f{*\u0000~";
        objectArray[118] = "m\nk&p\"=\u001dn)*[=g:uwc-\u0007x!&e:g9%|:%\u001c~&,+T";
        objectArray[119] = "{<\u0012~m\u0015i9\u00128\u000e@\u0010;\u0010;6PpyDj0G\u0010oL1kL+z[;n)";
        objectArray[120] = "[~Nlm\u001aR%P~l'\u000b\u001a\u0015)8\u001f\u001bzW}i\u0019\f\u001a\u0016wbX\f'\u001f,|J\r\u001a";
        objectArray[121] = "\u0006&F~h\u001b\u0016u@h\u0019\u0017\u0004b@\u007fu%P&\u0018&(r\u0005s@$%OXnRe\u0019\u001e\u0004~\u001c$$C\u0019l]\u0018u\u001f\t\"\u001c%(\u0002\u001bc w!\u0014\u000foIgr\u0012\u0019\u001e";
        objectArray[122] = "\u0001\u0017\u0015/)\u001bV\u001cVo{+Qq\u0014*-\u0013A\u0011V~|\u0015Vq\u0017v-\u0014\u0007A@}nTUq";
        objectArray[123] = "\u001d/X\\\u007fnH6[J\r>xn[\r5-\u0018,\u000f\\3:xm\u000b\u0006l%\u0003*\bV}T";
        objectArray[124] = "c2\u0012H\u000302pY\u001f?$\t1XH\u00079is\f\u0019\u0001.\t2\bC^1ru\u000b\u0013O@";
        objectArray[125] = "r\"/2jIp-x0P\u0018Kzf4l\u0018 ,/waq";
        objectArray[126] = "8\u0001\nu\b\u0017*\u0004\n3kHS\u0006\b0SR3D\\aUES\u0005X;\nZ(B[k\u001b+";
        objectArray[127] = "A\u0003Xf\b\u0006\u0012\u0016\nzc\u0013q^\t\"[\u0003\u0011\u001c]s]\u0014q]Y)\u0002\u000b\n\u001aZy\u0013z";
        objectArray[128] = " \u0007Ccpw2\u0002C%\u0013!K\u0000A&+2+B\u0015w-%K\u0003\u0011-r:0D\u0012}cK";
        objectArray[129] = ":.=\u000b7H={aRWLAq?To_!3k\u0005iHA6l\r'W'\"h\u0015g&";
        objectArray[130] = "\f\u001fM1,T\u0011\u0004IkI[\u0004\u00011a0KT\u0004Z7y\bYm\b1yS\u0019\u0016O2)Bh";
        objectArray[131] = "tG\tIX/6DY\u0015\u001d\u001e(J\u001bOGr\u001a\u001dY\u0015\u0018\"MI\u0001\u001eE{v\\\u0016\u0014@\u001e";
        objectArray[132] = "|as]$\"8n>L\u001a$Ge-As\">70\u001bkN";
        objectArray[133] = "x\u0013v\t\u000bXm\u0004|\fn\u0006{\t'\u000b\u00024&Nw]nZ'E&\u001c^X&\u001c-\nn";
        objectArray[134] = "'\u0003|]\u001e\u007frS0\u0002g(wQ(V0\u007f)\u0002q:\u0004~kDvB\u00027qN";
        objectArray[135] = "\u0015\u0016\u0012\u0017'^@F^H^\tEDF\u001c\t^\u001a\u0019\u001dpg\u0003\u001eK\u0018H8\u0007\u001aVY";
        objectArray[136] = "\f\\_h\u0012O\tY\\X\u0019HHP\u0007#t\u000bL@_1\u001f]\u0005\u0003RXM[\u0005X\u0012#\nXUIc";
        objectArray[137] = "\fZ\u007fq\" \u0002XfvFt|Z,$~d\u001c\u0018xuxs|Pqt9v\u0000\u0003d&%\u001d";
        objectArray[138] = "\u0014_f#\u000fA\u001a]\u007f$k\u0012d_5vS\u0005\u0004\u001da'U\u0012d\\64\u001b\u0004\u0004\u000407\u000f\u0005d";
        objectArray[139] = "\u0018SKw\u0000\u0005A\u0019CaGyOCTo\u0010.\u001c\u0012\u0001;|@PPEw\u0000\u0019\u001aXS0";
        objectArray[140] = "\u000eBa2B`\u0006S'#\u0001\u000fR_b/\\c`\u000b&v\u0007?7^s/\u00073\n\u0003n=F\u000f";
        objectArray[141] = "\u0013Z|S\u0017b\u0010Z8X\u0014\u0005C }\u0007T=S@?S\u0005;D ~\u0004\u0016uR@&\u0002\u0015aS ";
        objectArray[142] = "lv@\b5]ip\u0004\u000f\u0005Vh7\u001dVid>uA\f93x\"\u001fAtUl&\u0007\u0001\u0005";
        objectArray[143] = "Ra:!;L\\c#&_\u001d\"aitg\bB#=%a\u001f\"b9\u007f>\u0000Y%://q";
        objectArray[144] = "\u0001600:\u001b\u00110o!YM\u00009wLcR\u0014ub'5\u001bWx\u000b";
        objectArray[145] = "'5\u0019?KR)7\u00008/\u0002W5Jj\u0017\u00167w\u001e;\u0011\u0001W6I(_\u00177nO+K\u0016W";
        objectArray[146] = "S6c{zq['%j9\u001e\u000f+`fdr=\u007f$?=#j*qf?\"Wwlt~\u001e";
        objectArray[147] = " BZ'F?y\u0001\u0006:HEx\u001cA\u001cO!d\u0017=.K%%F\u0000sV7dz";
        objectArray[148] = "k\t\u001ai^\u000e6]\u0013lZ753\u0012.\u000bY6\u000e\u001c,\u0012^";
        objectArray[149] = "+$\b\f\b</2\n\u0005WNw&\u0004\u0003\t\"ErAXV\u007f\u0012$@\u0005\b?{4\u0013\u0003\u001eN";
        objectArray[150] = "(S\b_,S/\u0006T\u0006LTS\f\n\u0000tD3N^QrSS\u000fZ\u000b-L(HY[<=";
        objectArray[151] = "\f\u0006S*=\r\t\u0003P\u001a\u0015:q8\"\u001ab\u0016\tS\tdg\u0013\n";
        objectArray[152] = "\f>L\u000b70\u0004>L\u000b3H\\_LOipL?\u000e\u001b8v[_O\u0016irU2\u000b\u000f6&\\_";
        objectArray[153] = "@(se,aE.7b\u001cjDi.;pX\u0017-qm\u001c6G\u007f\"bzwG\u007f5%\u001c";
        objectArray[154] = "z4\u001b\r.)j)\u0016UCpx:\u0012\r/B,~HPCzg/\u0015\u0007\u007fjz\"Mjz)p*O\u0001*ujxNj";
        objectArray[155] = "\u0013T\u0019\u001f\u000b$HR\u000e\u0013\u001bCChSYQ{S\b\u0011\r\u0000}Dh\u000e\u0012\u0004 @\u0001\u0005\u0012\u001a&*";
        objectArray[156] = "`\u0005\nnc\u0003f\u001f\\\u007fbi>\u00011=t\u0010e\u0006Zk=Sho\bm6\u00007\u0005\u000ew`\u00116o";
        objectArray[157] = "\u000fH\u001bv`VZQ\u0018`\u0012\u0006j\t\u0018'*\u0015\nKLv,\u0002j\n\u001beb\u0014\nR\u001dfv\u0015j";
        objectArray[158] = "\u000b\u001ay-U\u007f\u0005\u0018`*1({\u001a*x\t;\u001bX~)\u000f,{\u0019):A:\u001bA/9U;{";
        objectArray[159] = "v,\"\u001e#G2/sRZ\u001bH,)\u001bb\u000e(n}Jd\u0019H/y\u0010;\u00063hz@*w";
        objectArray[160] = "\u0015{+a)kL1#wn\u0017As$t1l,0 di~Gfi'd\u0017\u0015`i|$lRc9mU";
        objectArray[161] = "`6*\u0010^,9wiN\u0006N7g5E\b\u0019i6`\u0018dwh69QTuio2G";
        objectArray[162] = "#\u0012a0\u0003yvB-oz.s@5;-y-\u0017mW\u0013}/\u0014a9\u0016{k\u0013";
        objectArray[163] = "\u001de,L'\bL'g\u001b\u001b\u0019wffL#\u0001\u0017$2\u001d%\u0016we6Gz\t\f\"5\u0017kx";
        objectArray[164] = "\u0018\u001f_j\u0016\n\n\u001a_,u_s\u0018]/MO\u0013Z\t~KXsN\ntI\nN\u0013\u0017f\b6";
        objectArray[165] = "\u001b\u001dl9~?NM f\u0007hKO82P?\u0015\u001fa^>zW\u001e`:`tT\u001c6";
        objectArray[166] = "WO-V;ZGIrGX\nRKPG(\u0016;\t|\u001a9\u001b@N\u007fJ(j";
        objectArray[167] = "9l\t\u0000'l-n\u001b\u001c\\z6:\u0016\u000e\u000b.lnOX\\z1f\u0017\u0007go&l\u0012";
        objectArray[168] = "96!k\u0014v}5p'm/\u00072qoS\u007f9kv5\u0016F9m*kTx`jp.m";
        objectArray[169] = "&D]Ogg(\u0006ZO\u0003mF\u0005\u001e\u001f;x&GJN=oF\u0006N\u0014bp=AMDs\u0001";
        objectArray[170] = "'VO|Y]$V\u000bwZ:t,N(\u001a\u0002gL\f|K\u0004p,Mx\u0011[oW\n{AJ\u001e";
        objectArray[171] = "))Q.o\u0012=+C2\u0014\u0004&\u007fN CS\u007f*\u0011r\u0014\u0004!#O)/\u00116)J";
        objectArray[172] = "Lfe\u0017:=H#jVhQ\u001f^<\u001c<i\u000f>~Hmo\u0018^?E<k\u00163{\\c?\u001f^";
        objectArray[173] = "w-(J]Ir(+zQP),y\u0013]i',i\u0017;\u000e$xu\u000b@I'(dz";
        objectArray[174] = "%b|uN\u0012p{\u007fc<A@#\u007f$\u0004Q a+u\u0002F@ //]Y;g,\u007fL(";
        objectArray[175] = "Gv>r%DC`<{z6\u001bt2}$Z) w&{\u0006~ .s%NOb-#y\u000b~";
        objectArray[176] = "\u0015`J\u001d<(\u001c}U\u0015,\u0010E\u0007\u000b_}(UgI\u000b,.B\u0007\b\u0002=hV?\u0001\u001f\"`F\u0007";
        objectArray[177] = "Y\u001dFg\u001avR\u001dXapq_\u0001Lh'!\u0004W\u0015\u0004\u001cr^P\u00149AoL\u0011";
        objectArray[178] = "yex|\u0011 d~|&t-yzmlt\u007f$ntn\u0014'\"m`ot";
        objectArray[179] = "%TR-\u000218OVwg-,CI9\nW{_W{\u000e<-\u0016\u0014vgn+\u0016O6\u001c)(F^G";
        objectArray[180] = "T\u0010QfubQ\u0010\u0012z\tjC\u0003CxeX\u0017@\u001c 6\u000fAGEyxfQ\u0014Co\t";
        objectArray[181] = ".IV~\u001d@6KM'yH-OD'\u0002%nKT\u007f\u0010N8\u0002\u0017ry\u001c>\u0002L2\u0002[=R]C";
        objectArray[182] = "CF1\u0004#O\u0013\fkE,p\u001fZ)\u0018u\u001c-\u000eoE.KzM:\nk\f\u0017H:Iwp";
        objectArray[183] = "\u00060\u0014\u001dvg\u0018tJ\u0012\u001cmx0L\u0017$~\u0018r\u0018F\"ixe\u0004E{jDu\u0019H#\u0007";
        objectArray[184] = "\bNB\u000ev\u0001\rH\u0006\tF\n\f\u000f\u001fP*8\\LF\nFV\u000bC\u001eF=\u0011\b\u0013\u000f7";
        objectArray[185] = "<* Jk|4;f[(\u0013`7#Wu\u007fRcg\u000e,/\u000562W./8k/Eo\u0013";
        objectArray[186] = "JK7Ez8OMsBJ3N\nj\u001b&\u0001\u001eI1MJ)I\u001dc\u001f:(RM{|7?A\u0006{\u001a#;YF\n";
        objectArray[187] = "\u0017C8gG?\u0007\u0010>q6;\u0001\u00067eMVB\u0002'=_=\u0014Kd06o\u0012K?pM(\u0011\u001b.\u0001";
        objectArray[188] = "\u0007<~[PJ\u0013>lG+\\\bjaU|\u000bQ>:\u0000+\\\u000f6`\\\u0010I\u0018<e";
        objectArray[189] = "\u0006\u000e\u0003\u000b)ZG\u000e\u0003\u001cn<Z\r\u0015\u0007pPh_X_&<\u0006QY\u0006g\f\u0004P\u0000\rq<";
        objectArray[190] = "g\tcc\u00057t\u001d6;f=\u0016V5?^.v\u0014anX9\u0016\u0003}m\u0001:*\u0013``YW";
        objectArray[191] = "yI='\u007fr)\u0003gfpM%U%;)!\u0017\u0001cfrs@\u0001()21<Xb!$v@";
        objectArray[192] = "\u0000NH\u0018*G\u0005H\f\u001f\u001aL\u0004\u000f\u0015Fv~WKI\u001e\u001a\u0010\u0007\u0019\u0019\u001f|Q\u0007\u0019\u000eX\u001a";
        objectArray[193] = "\u000f\u0010\r2+\u0001\u0017\u0012\u0016kO\u0004\u001c\u0010\u0016D(\b\u0018k\u001ab/XIVG\u007f=\u0019u";
        objectArray[194] = "\u000f0uA}vK3$\r\u0004$10~D<?Qr*\u0015:(13}\u0006t>Qk{\u0005`?1";
        objectArray[195] = "kw#\tcy=>`\u0004\n\u007f(s3Qq\u0012kw#\tcy=>`\u0004\n+;>;Dql8n*5";
        objectArray[196] = "h\u001br/a/7\u001fv2 \u00174\u00124-<{\u0006Oswc\u0017>G.+*~.\u0014(=[.1\u0011.5jl2Arp[";
        objectArray[197] = "=us\r5?lb$\u0006^k\u00014wOf{av#\u001e`l\u00017'D?szp$\u0014.\u0002";
        objectArray[198] = "SS};\f\u0014\n\u0012>eTv\u0004\u0002bnZ!PX66\u000fvSR?kFFQSf`P";
        objectArray[199] = "fj|5#\u00157(7b\u001f\f\fi65'\u001cl+bd!\u000b\fj5wo\u001dl23t{\u001c\f";
        objectArray[200] = "]\u001e\u0018z\u0012#\u000e\u000bJfy6mCI>A&\r\u0001\u001doG1m\u0004\u001ag\t.\u000b\u0010\u001e\u007fI_";
        objectArray[201] = "3\u0000\u0017BlobB\\\u0015PvY\u0003]Bhf9A\t\u0013nqYU\n\u0019l#d\b\u0017\u000b-\u001f";
        objectArray[202] = "T@PY&r\u0001K\u0000\u0002\"\t\u00049SY}1\u0014Y\u0011\r,7\u00039P\u001a\u007f3\rB\u0005\u0011/h\t9";
        objectArray[203] = "\u0011\u0015&p\u001f<LVc*x;\tEgz\u0004=\u000f(qlC&\u0016\u0018aj\u001c7u";
        objectArray[204] = "T]\u0005~\u0000mU\b\u0004sM\u001c\u0003\u0006[&CB\u0004\u0006A\"?a\u0004\u0000L>Yu\u0000\u0018\fO";
        objectArray[205] = "}\u0002|U\u0002\u0019`\u0019x\u000fg\u0005t\u0015gA\n>wp9B\u001d\u001a~\u001acVW\u0005}p9UW\u001eh\u000b~V\u0007\u000f\u0019";
        Object[] objectArray2 = objectArray;
        objectArray[206] = "\u001ba\u00053nY\u001eaF/\u0012Q\fr\u0017-~cX1Hz*4X~\b7k[PoN&(4";
    }

    @Override
    public void d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x52D6E774439DL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = this;
        dY.c("\u00d5", (Object)dY.c("\u00ef", (long)3252521657449714753L, (long)l), (Object)objectArray2, (long)3252171090313053462L, (long)l);
    }

    /*
     * Exception decompiling
     */
    private boolean d(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [14[TRYBLOCK]], but top level block is 26[SWITCH]
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
        MethodHandle methodHandle = dY.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e6' || c == 'V' || c == '\u00ef' || c == '\u00c8') {
                field = dY.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e6' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'V' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ef' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = dY.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d5' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'Q' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @bP
    public void a(a5 a52) {
        long l = t ^ 0x5A83998421E3L;
        dY.c("\u00d5", (Object)this.q, (long)-8115205199945442377L, (long)l);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @bP
    public void a(bG var1_1) {
        block79: {
            block71: {
                block78: {
                    block76: {
                        block77: {
                            block74: {
                                block75: {
                                    block73: {
                                        block72: {
                                            block70: {
                                                block69: {
                                                    block68: {
                                                        block66: {
                                                            block67: {
                                                                block64: {
                                                                    block65: {
                                                                        block62: {
                                                                            block63: {
                                                                                block61: {
                                                                                    block60: {
                                                                                        block58: {
                                                                                            block59: {
                                                                                                block56: {
                                                                                                    block57: {
                                                                                                        block54: {
                                                                                                            block55: {
                                                                                                                block53: {
                                                                                                                    v0 = var2_2 = dY.t ^ 91530393481902L;
                                                                                                                    var4_3 = v0 ^ 7578802936517L;
                                                                                                                    var6_4 = v0 ^ 63112633992092L;
                                                                                                                    var8_5 = v0 ^ 18297245178319L;
                                                                                                                    var10_6 = v0 ^ 91673305405293L;
                                                                                                                    var12_7 = v0 ^ 68092032532076L;
                                                                                                                    var14_8 = v0 ^ 74990593021725L;
                                                                                                                    var16_9 = v0 ^ 105121767199081L;
                                                                                                                    var18_10 = v0 ^ 105136959853280L;
                                                                                                                    var20_11 = dY.c("Q", (long)6638407027072889988L, (long)var2_2);
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            v1 = dY.b;
                                                                                                                            if (var20_11 != null) break block53;
                                                                                                                            if (dY.c("\u00e6", (Object)v1, (long)6640617544908802860L, (long)var2_2) != null) break block54;
                                                                                                                        }
                                                                                                                        catch (MatchException v2) {
                                                                                                                            throw dY.c("Q", (Object)v2, (long)6641495316675701463L, (long)var2_2);
                                                                                                                        }
                                                                                                                        v1 = dY.b;
                                                                                                                    }
                                                                                                                    catch (MatchException v3) {
                                                                                                                        throw dY.c("Q", (Object)v3, (long)6641495316675701463L, (long)var2_2);
                                                                                                                    }
                                                                                                                }
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        v4 /* !! */  = dY.c("\u00d5", (Object)v1, (long)6637498049310177424L, (long)var2_2);
                                                                                                                        if (var20_11 != null) break block55;
                                                                                                                        if (v4 /* !! */  == false) break block54;
                                                                                                                    }
                                                                                                                    catch (MatchException v5) {
                                                                                                                        throw dY.c("Q", (Object)v5, (long)6641495316675701463L, (long)var2_2);
                                                                                                                    }
                                                                                                                    v4 /* !! */  = dY.c("\u00d5", (Object)dY.c("\u00e6", (Object)dY.b, (long)6641056317940717548L, (long)var2_2), (long)6636761962443613017L, (long)var2_2);
                                                                                                                }
                                                                                                                catch (MatchException v6) {
                                                                                                                    throw dY.c("Q", (Object)v6, (long)6641495316675701463L, (long)var2_2);
                                                                                                                }
                                                                                                            }
                                                                                                            try {
                                                                                                                if (var20_11 != null) break block56;
                                                                                                                if (v4 /* !! */  == false) break block57;
                                                                                                            }
                                                                                                            catch (MatchException v7) {
                                                                                                                throw dY.c("Q", (Object)v7, (long)6641495316675701463L, (long)var2_2);
                                                                                                            }
                                                                                                        }
                                                                                                        return;
                                                                                                    }
                                                                                                    v4 /* !! */  = dY.c("\u00d5", (Object)dY.c("\u00ef", (long)6639527827419981126L, (long)var2_2), (Object)new Object[0], (long)6639017175506100894L, (long)var2_2);
                                                                                                }
                                                                                                try {
                                                                                                    if (var20_11 != null) break block58;
                                                                                                    if (v4 /* !! */  == false) break block59;
                                                                                                }
                                                                                                catch (MatchException v8) {
                                                                                                    throw dY.c("Q", (Object)v8, (long)6641495316675701463L, (long)var2_2);
                                                                                                }
                                                                                                return;
                                                                                            }
                                                                                            v4 /* !! */  = (CallSite)ei_0.R;
                                                                                        }
                                                                                        try {
                                                                                            if (var20_11 != null) break block60;
                                                                                            if (v4 /* !! */  != false) break block61;
                                                                                        }
                                                                                        catch (MatchException v9) {
                                                                                            throw dY.c("Q", (Object)v9, (long)6641495316675701463L, (long)var2_2);
                                                                                        }
                                                                                        v4 /* !! */  = (CallSite)d0.C;
                                                                                    }
                                                                                    try {
                                                                                        if (var20_11 != null) break block62;
                                                                                        if (v4 /* !! */  == false) break block63;
                                                                                    }
                                                                                    catch (MatchException v10) {
                                                                                        throw dY.c("Q", (Object)v10, (long)6641495316675701463L, (long)var2_2);
                                                                                    }
                                                                                }
                                                                                return;
                                                                            }
                                                                            v4 /* !! */  = dY.c("Q", (Object)new Object[0], (long)6641466801812509969L, (long)var2_2);
                                                                        }
                                                                        try {
                                                                            if (var20_11 != null) break block64;
                                                                            if (v4 /* !! */  == false) break block65;
                                                                        }
                                                                        catch (MatchException v11) {
                                                                            throw dY.c("Q", (Object)v11, (long)6641495316675701463L, (long)var2_2);
                                                                        }
                                                                        return;
                                                                    }
                                                                    v12 = new Object[2];
                                                                    v12[1] = var12_7;
                                                                    v12[0] = this.a;
                                                                    v4 /* !! */  = dY.c("\u00d5", (Object)this.p, (Object)v12, (long)6641619406064892758L, (long)var2_2);
                                                                }
                                                                try {
                                                                    if (var20_11 != null) break block66;
                                                                    if (v4 /* !! */  != false) break block67;
                                                                }
                                                                catch (MatchException v13) {
                                                                    throw dY.c("Q", (Object)v13, (long)6641495316675701463L, (long)var2_2);
                                                                }
                                                                return;
                                                            }
                                                            v14 = new Object[1];
                                                            v14[0] = var6_4;
                                                            dY.c("\u00d5", (Object)this.p, (Object)v14, (long)6638937796721709504L, (long)var2_2);
                                                            v15 = new Object[1];
                                                            v15[0] = var18_10;
                                                            dY.c("\u00d5", (Object)this.a, (Object)v15, (long)6636636679026964513L, (long)var2_2);
                                                            v4 /* !! */  = dY.c("\u00d5", (Object)((Boolean)dY.c("\u00d5", (Object)this.d, (long)6637746065496633225L, (long)var2_2)), (long)6641132849422202850L, (long)var2_2);
                                                        }
                                                        try {
                                                            try {
                                                                if (var20_11 != null || v4 /* !! */  == false) break block68;
                                                            }
                                                            catch (MatchException v16) {
                                                                throw dY.c("Q", (Object)v16, (long)6641495316675701463L, (long)var2_2);
                                                            }
                                                            v4 /* !! */  = dY.c("\u00d5", (Object)this.q, (Predicate<class_2338>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$onTick$7(net.minecraft.class_2338 ), (Lnet/minecraft/class_2338;)Z)(), (long)6643377633513334397L, (long)var2_2);
                                                        }
                                                        catch (MatchException v17) {
                                                            throw dY.c("Q", (Object)v17, (long)6641495316675701463L, (long)var2_2);
                                                        }
                                                    }
                                                    var22_12 = dY.c("\u00e6", (Object)dY.b, (long)6638518131812295389L, (long)var2_2);
                                                    try {
                                                        try {
                                                            v18 = var22_12;
                                                            if (var20_11 != null) break block69;
                                                            if (v18 instanceof class_3965) {
                                                            }
                                                            ** GOTO lbl139
                                                        }
                                                        catch (MatchException v19) {
                                                            throw dY.c("Q", (Object)v19, (long)6641495316675701463L, (long)var2_2);
                                                        }
                                                        v18 = var22_12;
                                                    }
                                                    catch (MatchException v20) {
                                                        throw dY.c("Q", (Object)v20, (long)6641495316675701463L, (long)var2_2);
                                                    }
                                                }
                                                var21_14 = (class_3965)v18;
                                                try {
                                                    if (var20_11 == null) break block70;
lbl139:
                                                    // 2 sources

                                                    return;
                                                }
                                                catch (MatchException v21) {
                                                    throw dY.c("Q", (Object)v21, (long)6641495316675701463L, (long)var2_2);
                                                }
                                            }
                                            v22 = new Object[3];
                                            v22[2] = var8_5;
                                            v22[1] = dY.c("\u00ef", (long)6640746572781365424L, (long)var2_2);
                                            v22[0] = dY.c("\u00d5", (Object)var21_14, (long)6641791424099960879L, (long)var2_2);
                                            var22_13 = dY.c("Q", (Object)v22, (long)6637971122343140933L, (long)var2_2);
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            v23 /* !! */  = var22_13;
                                                            if (var20_11 != null) break block71;
                                                            if (v23 /* !! */  != false) {
                                                            }
                                                            ** GOTO lbl233
                                                        }
                                                        catch (MatchException v24) {
                                                            throw dY.c("Q", (Object)v24, (long)6641495316675701463L, (long)var2_2);
                                                        }
                                                        dY.o = 1;
                                                        v25 = new Object[2];
                                                        v25[1] = var14_8;
                                                        v25[0] = dY.c("\u00d5", (Object)var21_14, (long)6641791424099960879L, (long)var2_2);
                                                        v26 = dY.c("Q", (Object)v25, (long)6641388327552776888L, (long)var2_2);
                                                        if (var20_11 != null) break block72;
                                                    }
                                                    catch (MatchException v27) {
                                                        throw dY.c("Q", (Object)v27, (long)6641495316675701463L, (long)var2_2);
                                                    }
                                                    if (v26 != false) break block73;
                                                }
                                                catch (MatchException v28) {
                                                    throw dY.c("Q", (Object)v28, (long)6641495316675701463L, (long)var2_2);
                                                }
                                                v29 = new Object[2];
                                                v29[1] = var16_9;
                                                v29[0] = dY.c("\u00d5", (Object)var21_14, (long)6641791424099960879L, (long)var2_2);
                                                v26 = dY.c("Q", (Object)v29, (long)6638183311315437066L, (long)var2_2);
                                            }
                                            catch (MatchException v30) {
                                                throw dY.c("Q", (Object)v30, (long)6641495316675701463L, (long)var2_2);
                                            }
                                        }
                                        try {
                                            if (var20_11 != null) break block74;
                                            if (v26 == false) break block75;
                                        }
                                        catch (MatchException v31) {
                                            throw dY.c("Q", (Object)v31, (long)6641495316675701463L, (long)var2_2);
                                        }
                                    }
                                    return;
                                }
                                v26 = dY.c("\u00d5", (Object)((Boolean)dY.c("\u00d5", (Object)this.c, (long)6637746065496633225L, (long)var2_2)), (long)6641132849422202850L, (long)var2_2);
                            }
                            try {
                                try {
                                    try {
                                        if (var20_11 != null) break block76;
                                        if (v26 == false) break block77;
                                    }
                                    catch (MatchException v32) {
                                        throw dY.c("Q", (Object)v32, (long)6641495316675701463L, (long)var2_2);
                                    }
                                    v33 = new Object[1];
                                    v33[0] = var4_3;
                                    v26 = dY.c("\u00d5", (Object)this, (Object)v33, (long)6640187006260866576L, (long)var2_2);
                                    if (var20_11 != null) break block76;
                                }
                                catch (MatchException v34) {
                                    throw dY.c("Q", (Object)v34, (long)6641495316675701463L, (long)var2_2);
                                }
                                if (v26 == false) break block77;
                            }
                            catch (MatchException v35) {
                                throw dY.c("Q", (Object)v35, (long)6641495316675701463L, (long)var2_2);
                            }
                            return;
                        }
                        try {
                            v36 = this;
                            if (var20_11 != null) break block78;
                            v26 = dY.c("\u00d5", (Object)((Boolean)dY.c("\u00d5", (Object)v36.g, (long)6637746065496633225L, (long)var2_2)), (long)6641132849422202850L, (long)var2_2);
                        }
                        catch (MatchException v37) {
                            throw dY.c("Q", (Object)v37, (long)6641495316675701463L, (long)var2_2);
                        }
                    }
                    if (v26 == false) break block79;
                    v36 = this;
                }
                try {
                    v38 = new Object[1];
                    v38[0] = var10_6;
                    dY.c("\u00d5", (Object)v36, (Object)v38, (long)6643323946168303369L, (long)var2_2);
                    if (var20_11 == null) break block79;
lbl233:
                    // 2 sources

                    v23 /* !! */  = (CallSite)0;
                }
                catch (MatchException v39) {
                    throw dY.c("Q", (Object)v39, (long)6641495316675701463L, (long)var2_2);
                }
            }
            dY.o = v23 /* !! */ ;
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    @bP
    public void a(a9 a92) {
        CallSite callSite;
        long l;
        block11: {
            long l2;
            block12: {
                long l3 = l = t ^ 0x275959350407L;
                long l4 = l3 ^ 0x13C641431AD6L;
                l2 = l3 ^ 0x1390837ACDA1L;
                CallSite callSite2 = dY.c("Q", (long)-6158346610884410835L, (long)l);
                try {
                    try {
                        try {
                            try {
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l4;
                                callSite = dY.c("\u00d5", (Object)this, (Object)objectArray, (long)-6145948419190027785L, (long)l);
                                if (callSite2 != null) break block11;
                                if (callSite != (int)x) break block12;
                            }
                            catch (MatchException matchException) {
                                throw dY.c("Q", (Object)matchException, (long)-6160325420768830338L, (long)l);
                            }
                            callSite = dY.c("\u00d5", (Object)dY.c("\u00d5", (Object)dY.c("\u00d5", (Object)dY.c("\u00e6", (Object)b, (long)-6160728649086820027L, (long)l), (long)-6154125342518477927L, (long)l), (long)-6158818440450538545L, (long)l), (Object)dY.c("\u00d5", (Object)dY.c("\u00ef", (long)-6158910422525480094L, (long)l), (long)-6158291778333137985L, (long)l), (long)-6153940630418495590L, (long)l);
                            if (callSite2 != null) break block11;
                        }
                        catch (MatchException matchException) {
                            throw dY.c("Q", (Object)matchException, (long)-6160325420768830338L, (long)l);
                        }
                        if (callSite == false) break block12;
                    }
                    catch (MatchException matchException) {
                        throw dY.c("Q", (Object)matchException, (long)-6160325420768830338L, (long)l);
                    }
                    dY.c("\u00d5", (Object)a92, (Object)new Object[0], (long)-6146561382485901582L, (long)l);
                    return;
                }
                catch (MatchException matchException) {
                    throw dY.c("Q", (Object)matchException, (long)-6160325420768830338L, (long)l);
                }
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l2;
            callSite = dY.c("Q", (Object)objectArray, (long)-6145856877463698364L, (long)l);
        }
        try {
            if (callSite != false) {
                dY.c("\u00d5", (Object)a92, (Object)new Object[0], (long)-6146561382485901582L, (long)l);
            }
        }
        catch (MatchException matchException) {
            throw dY.c("Q", (Object)matchException, (long)-6160325420768830338L, (long)l);
        }
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return dY.c("Q", (Object)((Object)q_0.Crystal), (long)-2438927451013407769L, (long)l);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @bP
    public void a(bh_0 bh_02) {
        CallSite callSite;
        ArrayList arrayList;
        long l;
        block34: {
            CallSite callSite2;
            block36: {
                CallSite callSite3;
                CallSite callSite4;
                long l2;
                long l3;
                block33: {
                    CallSite callSite5;
                    block32: {
                        CallSite callSite6;
                        CallSite callSite7;
                        CallSite callSite8;
                        block31: {
                            long l4 = l = t ^ 0x50A4E249F9E4L;
                            l3 = l4 ^ 0x3CCA1906FB16L;
                            l2 = l4 ^ 0x64DD3714FA75L;
                            callSite8 = dY.c("\u00d5", (Object)bh_02, (Object)new Object[0], (long)6296145074079250241L, (long)l);
                            callSite4 = dY.c("Q", (long)6298952165436030926L, (long)l);
                            try {
                                try {
                                    callSite7 = callSite8;
                                    if (callSite4 != null) break block31;
                                    if (!(callSite7 instanceof class_2885)) return;
                                }
                                catch (MatchException matchException) {
                                    throw dY.c("Q", (Object)matchException, (long)6296409783356301725L, (long)l);
                                }
                                callSite7 = callSite8;
                            }
                            catch (MatchException matchException) {
                                throw dY.c("Q", (Object)matchException, (long)6296409783356301725L, (long)l);
                            }
                        }
                        class_2885 class_28852 = (class_2885)callSite7;
                        try {
                            if (callSite4 != null) {
                                return;
                            }
                        }
                        catch (MatchException matchException) {
                            throw dY.c("Q", (Object)matchException, (long)6296409783356301725L, (long)l);
                        }
                        try {
                            callSite6 = dY.c("\u00d5", (Object)dY.c("\u00d5", (Object)class_28852, (long)6297344005193366161L, (long)l), (Object)dY.c("\u00ef", (long)6298731189050453306L, (long)l), (long)6296997889854762365L, (long)l) != false ? dY.c("\u00d5", (Object)dY.c("\u00e6", (Object)b, (long)6297094488815262886L, (long)l), (long)6303720506286147194L, (long)l) : dY.c("\u00d5", (Object)dY.c("\u00e6", (Object)b, (long)6297094488815262886L, (long)l), (long)6299724567847505903L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw dY.c("Q", (Object)matchException, (long)6296409783356301725L, (long)l);
                        }
                        callSite8 = callSite6;
                        try {
                            if (dY.c("\u00d5", (Object)callSite8, (long)6297172197336088108L, (long)l) != dY.c("\u00ef", (long)6303610242609576529L, (long)l)) {
                                return;
                            }
                        }
                        catch (MatchException matchException) {
                            throw dY.c("Q", (Object)matchException, (long)6296409783356301725L, (long)l);
                        }
                        callSite3 = dY.c("\u00d5", (Object)class_28852, (long)6297997840971452229L, (long)l);
                        callSite2 = dY.c("\u00d5", (Object)dY.c("\u00d5", (Object)callSite3, (long)6297828364584076133L, (long)l), (int)dY.c("\u00d5", (Object)dY.c("\u00d5", (Object)callSite3, (long)6303045866479844145L, (long)l), (long)6298367991750435572L, (long)l), (int)dY.c("\u00d5", (Object)dY.c("\u00d5", (Object)callSite3, (long)6303045866479844145L, (long)l), (long)6297485691286224543L, (long)l), (int)dY.c("\u00d5", (Object)dY.c("\u00d5", (Object)callSite3, (long)6303045866479844145L, (long)l), (long)6300486464504624539L, (long)l), (long)6292997545598488402L, (long)l);
                        try {
                            try {
                                try {
                                    callSite5 = dY.c("\u00d5", (Object)((Boolean)((Object)dY.c("\u00d5", (Object)this.d, (long)6292656207705629891L, (long)l))), (long)6296041865919855784L, (long)l);
                                    if (callSite4 != null) break block32;
                                    if (callSite5 == false) return;
                                }
                                catch (MatchException matchException) {
                                    throw dY.c("Q", (Object)matchException, (long)6296409783356301725L, (long)l);
                                }
                                arrayList = this.q;
                                callSite = callSite2;
                                if (callSite4 != null) break block33;
                            }
                            catch (MatchException matchException) {
                                throw dY.c("Q", (Object)matchException, (long)6296409783356301725L, (long)l);
                            }
                            callSite5 = dY.c("\u00d5", (Object)arrayList, (Object)callSite, (long)6293284574222598497L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw dY.c("Q", (Object)matchException, (long)6296409783356301725L, (long)l);
                        }
                    }
                    if (callSite5 != false) {
                        return;
                    }
                    arrayList = this.q;
                    callSite = dY.c("\u00d5", (Object)callSite3, (long)6297828364584076133L, (long)l);
                }
                try {
                    block35: {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            if (callSite4 != null) break block34;
                                            Object[] objectArray = new Object[3];
                                            objectArray[2] = l3;
                                            objectArray[1] = dY.c("\u00ef", (long)6296780260853261306L, (long)l);
                                            objectArray[0] = callSite;
                                            if (dY.c("Q", (Object)objectArray, (long)6299212276882030256L, (long)l) != false) break block35;
                                        }
                                        catch (MatchException matchException) {
                                            throw dY.c("Q", (Object)matchException, (long)6296409783356301725L, (long)l);
                                        }
                                        callSite = dY.c("\u00d5", (Object)callSite3, (long)6297828364584076133L, (long)l);
                                        if (callSite4 != null) break block34;
                                    }
                                    catch (MatchException matchException) {
                                        throw dY.c("Q", (Object)matchException, (long)6296409783356301725L, (long)l);
                                    }
                                    Object[] objectArray = new Object[3];
                                    objectArray[2] = l3;
                                    objectArray[1] = dY.c("\u00ef", (long)6296486362393837758L, (long)l);
                                    objectArray[0] = callSite;
                                    if (dY.c("Q", (Object)objectArray, (long)6299212276882030256L, (long)l) != false) break block35;
                                }
                                catch (MatchException matchException) {
                                    throw dY.c("Q", (Object)matchException, (long)6296409783356301725L, (long)l);
                                }
                                callSite = dY.c("\u00d5", (Object)callSite3, (long)6297828364584076133L, (long)l);
                                if (callSite4 != null) break block34;
                            }
                            catch (MatchException matchException) {
                                throw dY.c("Q", (Object)matchException, (long)6296409783356301725L, (long)l);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l2;
                            Object[] objectArray2 = new Object[3];
                            objectArray2[2] = l3;
                            objectArray2[1] = dY.c("Q", (Object)objectArray, (long)6293405029109930749L, (long)l);
                            objectArray2[0] = callSite;
                            if (dY.c("Q", (Object)objectArray2, (long)6299212276882030256L, (long)l) == false) break block36;
                        }
                        catch (MatchException matchException) {
                            throw dY.c("Q", (Object)matchException, (long)6296409783356301725L, (long)l);
                        }
                    }
                    callSite = dY.c("\u00d5", (Object)callSite3, (long)6297828364584076133L, (long)l);
                    break block34;
                }
                catch (MatchException matchException) {
                    throw dY.c("Q", (Object)matchException, (long)6296409783356301725L, (long)l);
                }
            }
            callSite = callSite2;
        }
        dY.c("\u00d5", (Object)arrayList, (Object)callSite, (long)6299392531545029144L, (long)l);
    }

    /*
     * Exception decompiling
     */
    @Override
    public dC a(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [52[TRYBLOCK]], but top level block is 82[SWITCH]
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @bP
    public void a(bg_0 bg_02) {
        CallSite callSite;
        class_2626 class_26262;
        long l;
        block15: {
            CallSite callSite2;
            CallSite callSite3;
            block14: {
                l = t ^ 0x1D23F359FBL;
                CallSite callSite4 = dY.c("\u00d5", (Object)bg_02, (Object)new Object[0], (long)-616362091716423805L, (long)l);
                callSite3 = dY.c("Q", (long)-615569114890018863L, (long)l);
                try {
                    try {
                        callSite2 = callSite4;
                        if (callSite3 != null) break block14;
                        if (!(callSite2 instanceof class_2626)) return;
                    }
                    catch (MatchException matchException) {
                        throw dY.c("Q", (Object)matchException, (long)-613043774846303870L, (long)l);
                    }
                    callSite2 = callSite4;
                }
                catch (MatchException matchException) {
                    throw dY.c("Q", (Object)matchException, (long)-613043774846303870L, (long)l);
                }
            }
            class_26262 = (class_2626)callSite2;
            try {
                if (callSite3 != null) {
                    return;
                }
            }
            catch (MatchException matchException) {
                throw dY.c("Q", (Object)matchException, (long)-613043774846303870L, (long)l);
            }
            try {
                try {
                    callSite = dY.c("\u00d5", (Object)class_26262, (long)-612494986751621369L, (long)l);
                    if (callSite3 != null) break block15;
                    if (callSite == null) return;
                }
                catch (MatchException matchException) {
                    throw dY.c("Q", (Object)matchException, (long)-613043774846303870L, (long)l);
                }
                callSite = dY.c("\u00d5", (Object)class_26262, (long)-612494986751621369L, (long)l);
            }
            catch (MatchException matchException) {
                throw dY.c("Q", (Object)matchException, (long)-613043774846303870L, (long)l);
            }
        }
        try {
            if (dY.c("\u00d5", (Object)callSite, (long)-615597134159505820L, (long)l) == dY.c("\u00ef", (long)-613060260996643867L, (long)l)) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw dY.c("Q", (Object)matchException, (long)-613043774846303870L, (long)l);
        }
        dY.c("\u00d5", (Object)this.q, (Object)dY.c("\u00d5", (Object)class_26262, (long)-616612022576008642L, (long)l), (long)-614498962444488146L, (long)l);
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (z[n3] != null) {
            return n3;
        }
        Object object = y[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 23;
            case 1 -> 46;
            case 2 -> 49;
            case 3 -> 39;
            case 4 -> 48;
            case 5 -> 35;
            case 6 -> 55;
            case 7 -> 12;
            case 8 -> 56;
            case 9 -> 11;
            case 10 -> 34;
            case 11 -> 6;
            case 12 -> 63;
            case 13 -> 59;
            case 14 -> 8;
            case 15 -> 16;
            case 16 -> 44;
            case 17 -> 57;
            case 18 -> 50;
            case 19 -> 54;
            case 20 -> 52;
            case 21 -> 7;
            case 22 -> 31;
            case 23 -> 32;
            case 24 -> 51;
            case 25 -> 36;
            case 26 -> 5;
            case 27 -> 15;
            case 28 -> 29;
            case 29 -> 41;
            case 30 -> 3;
            case 31 -> 4;
            case 32 -> 28;
            case 33 -> 62;
            case 34 -> 20;
            case 35 -> 2;
            case 36 -> 61;
            case 37 -> 22;
            case 38 -> 45;
            case 39 -> 25;
            case 40 -> 33;
            case 41 -> 9;
            case 42 -> 37;
            case 43 -> 14;
            case 44 -> 43;
            case 45 -> 10;
            case 46 -> 30;
            case 47 -> 58;
            case 48 -> 18;
            case 49 -> 21;
            case 50 -> 26;
            case 51 -> 17;
            case 52 -> 1;
            case 53 -> 24;
            case 54 -> 42;
            case 55 -> 60;
            case 56 -> 27;
            case 57 -> 53;
            case 58 -> 38;
            case 59 -> 40;
            case 60 -> 19;
            case 61 -> 13;
            case 62 -> 0;
            default -> 47;
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
        dY.z[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = dY.m(l, l2);
        Object object = y[n];
        if (object instanceof String) {
            String string = z[n];
            int n2 = string.indexOf(8);
            Class clazz = dY.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = dY.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = dY.g(clazz3, string2, clazz2)) != null) {
                    dY.y[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = dY.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        dY.y[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = dY.n(278515571760657L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = dY.m(l, l2);
        Object object = y[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = z[n];
                int n3 = string2.indexOf(8);
                clazz3 = dY.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = dY.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = dY.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        dY.y[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = dY.n(278515571760657L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = dY.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        dY.y[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = dY.n(278515571760657L, 0L);
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
     * Exception decompiling
     */
    private void j(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [20[TRYBLOCK]], but top level block is 31[SWITCH]
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

    private boolean lambda$new$0(String string) {
        long l = t ^ 0x12DE23F26E33L;
        return (boolean)dY.c("\u00d5", (Object)((Boolean)((Object)dY.c("\u00d5", (Object)this.c, (long)-4574739121141386476L, (long)l))), (long)-4560093896904250497L, (long)l);
    }

    private boolean lambda$new$2(String string) {
        long l = t ^ 0x2C9A2EA708E4L;
        return (boolean)dY.c("\u00d5", (Object)((Boolean)((Object)dY.c("\u00d5", (Object)this.g, (long)-6461401826085464637L, (long)l))), (long)-6458033743254975064L, (long)l);
    }

    private boolean lambda$new$1(Boolean bl) {
        Object object;
        block8: {
            block7: {
                CallSite callSite;
                long l;
                block6: {
                    l = t ^ 0xEAA86469111L;
                    callSite = dY.c("Q", (long)4584384669611628347L, (long)l);
                    try {
                        try {
                            object = dY.c("\u00d5", (Object)((Boolean)((Object)dY.c("\u00d5", (Object)this.c, (long)4585050852929834038L, (long)l))), (long)4581663537636349021L, (long)l);
                            if (callSite != null) break block6;
                            if (object == false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw dY.c("Q", (Object)matchException, (long)4581296998617991528L, (long)l);
                        }
                        object = dY.c("\u00d5", (String)((Object)dY.c("\u00d5", (Object)this.e, (long)4585050852929834038L, (long)l)), (Object)dY.b("c", (int)23343, (long)(0x737C98AFCC9558E6L ^ l)), (long)4581134228311780056L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw dY.c("Q", (Object)matchException, (long)4581296998617991528L, (long)l);
                    }
                }
                try {
                    if (callSite != null) break block8;
                    if (object == false) break block7;
                }
                catch (MatchException matchException) {
                    throw dY.c("Q", (Object)matchException, (long)4581296998617991528L, (long)l);
                }
                object = 1;
                break block8;
            }
            object = 0;
        }
        return (boolean)object;
    }

    private boolean lambda$new$3(Integer n) {
        long l = t ^ 0x7A1DB2F34EBEL;
        return (boolean)dY.c("\u00d5", (Object)((Boolean)((Object)dY.c("\u00d5", (Object)this.g, (long)-2301854245415431271L, (long)l))), (long)-2289480071572272142L, (long)l);
    }

    private boolean lambda$new$4(Boolean bl) {
        Object object;
        block8: {
            block7: {
                CallSite callSite;
                long l;
                block6: {
                    l = t ^ 0x1FB6AB555FF4L;
                    callSite = dY.c("Q", (long)-1046505764343948834L, (long)l);
                    try {
                        try {
                            object = dY.c("\u00d5", (Object)((Boolean)((Object)dY.c("\u00d5", (Object)this.g, (long)-1061637397513518381L, (long)l))), (long)-1049259916293875016L, (long)l);
                            if (callSite != null) break block6;
                            if (object == false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw dY.c("Q", (Object)matchException, (long)-1049030554237565043L, (long)l);
                        }
                        object = dY.c("\u00d5", (String)((Object)dY.c("\u00d5", (Object)this.h, (long)-1061637397513518381L, (long)l)), (Object)dY.b("c", (int)25501, (long)(0x6B043D454722EB3L ^ l)), (long)-1047539555001179075L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw dY.c("Q", (Object)matchException, (long)-1049030554237565043L, (long)l);
                    }
                }
                try {
                    if (callSite != null) break block8;
                    if (object == false) break block7;
                }
                catch (MatchException matchException) {
                    throw dY.c("Q", (Object)matchException, (long)-1049030554237565043L, (long)l);
                }
                object = 1;
                break block8;
            }
            object = 0;
        }
        return (boolean)object;
    }

    private boolean lambda$new$5(Boolean bl) {
        long l = t ^ 0x5C2CD384ECF6L;
        return (boolean)dY.c("\u00d5", (Object)((Boolean)((Object)dY.c("\u00d5", (Object)this.g, (long)4775519792473731537L, (long)l))), (long)4787893958807054778L, (long)l);
    }

    private boolean lambda$new$6(Float f) {
        Object object;
        block6: {
            block8: {
                block7: {
                    long l = t ^ 0x6D17FC66D656L;
                    long l2 = l ^ 0x79D85F6FF013L;
                    CallSite callSite = dY.c("Q", (long)8707817821105737852L, (long)l);
                    try {
                        try {
                            try {
                                Object[] objectArray = new Object[2];
                                objectArray[1] = l2;
                                objectArray[0] = dY.b("c", (int)3545, (long)(0x661B8DFF89034952L ^ l));
                                object = dY.c("\u00d5", (Object)this.m, (Object)objectArray, (long)8703257088855987703L, (long)l);
                                if (callSite != null) break block6;
                                if (object != false) break block7;
                            }
                            catch (MatchException matchException) {
                                throw dY.c("Q", (Object)matchException, (long)8706420038817549871L, (long)l);
                            }
                            Object[] objectArray = new Object[2];
                            objectArray[1] = l2;
                            objectArray[0] = dY.b("c", (int)29810, (long)(0xE32D876808E30F8L ^ l));
                            object = dY.c("\u00d5", (Object)this.m, (Object)objectArray, (long)8703257088855987703L, (long)l);
                            if (callSite != null) break block6;
                        }
                        catch (MatchException matchException) {
                            throw dY.c("Q", (Object)matchException, (long)8706420038817549871L, (long)l);
                        }
                        if (object == false) break block8;
                    }
                    catch (MatchException matchException) {
                        throw dY.c("Q", (Object)matchException, (long)8706420038817549871L, (long)l);
                    }
                }
                object = 1;
                break block6;
            }
            object = 0;
        }
        return (boolean)object;
    }

    private static boolean lambda$onTick$7(class_2338 class_23382) {
        boolean bl;
        long l = t ^ 0x30F40FB7C21CL;
        try {
            bl = dY.c("\u00d5", (Object)dY.c("\u00d5", (Object)dY.c("\u00e6", (Object)b, (long)7823545280830465432L, (long)l), (Object)class_23382, (long)7818837450979502565L, (long)l), (long)7823813865634270595L, (long)l) != dY.c("\u00ef", (long)7825787316389517314L, (long)l);
        }
        catch (MatchException matchException) {
            throw dY.c("Q", (Object)matchException, (long)7825346328535308901L, (long)l);
        }
        return bl;
    }

    private static boolean lambda$calculate$8(class_2338 class_23382) {
        long l = t ^ 0x276C02736F60L;
        long l2 = l ^ 0x4B02F93C6D92L;
        Object[] objectArray = new Object[3];
        objectArray[2] = l2;
        objectArray[1] = dY.c("\u00ef", (long)-4474643430493702786L, (long)l);
        objectArray[0] = class_23382;
        return (boolean)dY.c("Q", (Object)objectArray, (long)-4472289968341931980L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dY.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(dY.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


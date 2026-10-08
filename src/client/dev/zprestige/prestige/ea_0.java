/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1743
 *  net.minecraft.class_310
 *  net.minecraft.class_3965
 *  net.minecraft.class_3966
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bl_0;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dP;
import dev.zprestige.prestige.dR;
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
import net.minecraft.class_1743;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_3966;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.ea
 */
public class ea_0
extends dV {
    private dR a;
    private dR c;
    private dP d;
    private dO e;
    private dO f;
    private dM g;
    private dM h;
    private dO i;
    private dO j;
    private f5 k;
    private float l;
    private float m;
    private float n;
    private int o;
    private long p;
    private float q;
    private static final long r;
    private static final String[] s;
    private static final String[] t;
    private static final Map u;
    private static final Object[] v;
    private static final String[] w;

    public ea_0() {
        long l;
        long l2 = l = r ^ 0x3E17FA33226BL;
        long l3 = l2 ^ 0x7FEDFFFC74B0L;
        long l4 = l2 ^ 0x77DBECC96369L;
        long l5 = l2 ^ 0x3A212BB6C5A3L;
        long l6 = l2 ^ 0x315B4ABEA1EDL;
        long l7 = l2 ^ 0x2A9656181F82L;
        this.k = new f5(l3);
        this.l = 200.0f;
        this.n = -1.0f;
        this.o = -1;
        Object[] objectArray = new Object[2];
        objectArray[1] = l6;
        objectArray[0] = this::lambda$new$1;
        ea_0.c("\u00dc", (Object)this.d, (Object)objectArray, (long)-8124799172339064146L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l5;
        objectArray2[0] = this::lambda$new$0;
        ea_0.c("\u00dc", (Object)this.c, (Object)objectArray2, (long)-8124733327041618500L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l4;
        objectArray3[0] = this::lambda$new$6;
        ea_0.c("\u00dc", (Object)this.i, (Object)objectArray3, (long)-8124565746714003022L, (long)l);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l4;
        objectArray4[0] = this::lambda$new$3;
        ea_0.c("\u00dc", (Object)this.f, (Object)objectArray4, (long)-8124565746714003022L, (long)l);
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l4;
        objectArray5[0] = this::lambda$new$7;
        ea_0.c("\u00dc", (Object)this.j, (Object)objectArray5, (long)-8124565746714003022L, (long)l);
        Object[] objectArray6 = new Object[2];
        objectArray6[1] = l7;
        objectArray6[0] = this::lambda$new$5;
        ea_0.c("\u00dc", (Object)this.h, (Object)objectArray6, (long)-8126365752604343213L, (long)l);
        Object[] objectArray7 = new Object[2];
        objectArray7[1] = l7;
        objectArray7[0] = this::lambda$new$4;
        ea_0.c("\u00dc", (Object)this.g, (Object)objectArray7, (long)-8126365752604343213L, (long)l);
        Object[] objectArray8 = new Object[2];
        objectArray8[1] = l4;
        objectArray8[0] = this::lambda$new$2;
        ea_0.c("\u00dc", (Object)this.e, (Object)objectArray8, (long)-8124565746714003022L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                ea_0.r = hc.a(3964471646162427011L, -5658245317923923232L, MethodHandles.lookup().lookupClass()).a(117402511801209L);
                ea_0.v = new Object[89];
                ea_0.w = new String[89];
                ea_0.f();
                ea_0.u = new HashMap<K, V>(13);
                var0 = ea_0.r ^ 71360300956104L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[4];
                var7_4 = 0;
                var6_5 = "\u000b\u00fe\u00e8\u0088\u0018\u0004>\u00af+\u00d0\u00ac\u0000\u00cb\u0091W2\u0013\u00192\u008f\"\u00ce\u00a9T\u0010\u008b\u00d5\u00eb6\u00ae2\beMSx\u00b8\u0016\u00bc3P";
                var8_6 = "\u000b\u00fe\u00e8\u0088\u0018\u0004>\u00af+\u00d0\u00ac\u0000\u00cb\u0091W2\u0013\u00192\u008f\"\u00ce\u00a9T\u0010\u008b\u00d5\u00eb6\u00ae2\beMSx\u00b8\u0016\u00bc3P".length();
                var5_7 = 24;
                var4_8 = -1;
lbl32:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl37:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = ea_0.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "1S\u0089\u0016\u00b6\u0080\u001aF! \u00caR\rjG\u00ec\fF\u0016\u00d2\u00ea~\u001c\u00162\u00efpM\u00fe\u00d2f.\u0010\tG\u00ad\u00bbX\u009d\u00bc\u001a\u00e3\u00c8&\u00dch\u00b0\u00deY";
                    var8_6 = "1S\u0089\u0016\u00b6\u0080\u001aF! \u00caR\rjG\u00ec\fF\u0016\u00d2\u00ea~\u001c\u00162\u00efpM\u00fe\u00d2f.\u0010\tG\u00ad\u00bbX\u009d\u00bc\u001a\u00e3\u00c8&\u00dch\u00b0\u00deY".length();
                    var5_7 = 32;
                    var4_8 = -1;
lbl46:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl51:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = ea_0.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        ea_0.s = var9_3;
        ea_0.t = new String[4];
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ea" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ea_0.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1D79;
        if (t[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])u.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    u.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/ea", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = s[n2].getBytes("ISO-8859-1");
            ea_0.t[n2] = ea_0.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return t[n2];
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

    private float b(Object[] objectArray) {
        float f;
        long l;
        long l2;
        long l3;
        block16: {
            Object object;
            block14: {
                CallSite callSite;
                block15: {
                    block12: {
                        float f10;
                        block13: {
                            l3 = (Long)objectArray[0];
                            long l4 = l3 = r ^ l3;
                            long l5 = l4 ^ 0x7D8EEE95D592L;
                            l2 = l4 ^ 0xB9675DE7C38L;
                            l = l4 ^ 0x67C0B0F66B47L;
                            callSite = ea_0.c("\u00eb", (long)8846244891966961532L, (long)l3);
                            try {
                                try {
                                    reference cfr_temp_0 = ea_0.c("\u00dc", (Object)((Float)((Object)ea_0.c("\u00dc", (Object)this.i, (long)8853368965870400829L, (long)l3))), (long)8853416432913921771L, (long)l3) - this.n;
                                    object = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                    if (callSite != null) break block12;
                                    if (object == false) break block13;
                                }
                                catch (MatchException matchException) {
                                    throw ea_0.c("\u00eb", (Object)matchException, (long)8852191722626603347L, (long)l3);
                                }
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l5;
                                ea_0.c("\u00dc", (Object)this, (Object)objectArray2, (long)8852734051996096013L, (long)l3);
                            }
                            catch (MatchException matchException) {
                                throw ea_0.c("\u00eb", (Object)matchException, (long)8852191722626603347L, (long)l3);
                            }
                        }
                        object = (f10 = this.m - 0.0f) == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
                    }
                    try {
                        try {
                            if (callSite != null) break block14;
                            if (object > 0) break block15;
                        }
                        catch (MatchException matchException) {
                            throw ea_0.c("\u00eb", (Object)matchException, (long)8852191722626603347L, (long)l3);
                        }
                        return 0.0f;
                    }
                    catch (MatchException matchException) {
                        throw ea_0.c("\u00eb", (Object)matchException, (long)8852191722626603347L, (long)l3);
                    }
                }
                try {
                    f = (float)ea_0.c("\u00dc", (Object)((Float)((Object)ea_0.c("\u00dc", (Object)this.j, (long)8853368965870400829L, (long)l3))), (long)8853416432913921771L, (long)l3);
                    if (callSite != null) break block16;
                    float f11 = f - 0.0f;
                    object = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                }
                catch (MatchException matchException) {
                    throw ea_0.c("\u00eb", (Object)matchException, (long)8852191722626603347L, (long)l3);
                }
            }
            try {
                f = object > 0 ? (float)ea_0.c("\u00dc", (Object)((Float)((Object)ea_0.c("\u00dc", (Object)this.j, (long)8853368965870400829L, (long)l3))), (long)8853416432913921771L, (long)l3) : 1.0f;
            }
            catch (MatchException matchException) {
                throw ea_0.c("\u00eb", (Object)matchException, (long)8852191722626603347L, (long)l3);
            }
        }
        float f12 = f;
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l2;
        objectArray3[1] = Float.valueOf(f12);
        objectArray3[0] = Float.valueOf(this.m);
        Object[] objectArray4 = new Object[4];
        objectArray4[3] = l;
        objectArray4[2] = Float.valueOf(500.0f);
        objectArray4[1] = Float.valueOf(80.0f);
        objectArray4[0] = Float.valueOf((float)ea_0.c("\u00eb", (Object)objectArray3, (long)8847058032252815512L, (long)l3));
        return (float)ea_0.c("\u00eb", (Object)objectArray4, (long)8846710809826623949L, (long)l3);
    }

    private static float c(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        long l = (Long)objectArray[2];
        long l2 = (l = r ^ l) ^ 0x49759262F2FAL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = Float.valueOf(1.0f);
        objectArray2[0] = Float.valueOf(1.0E-6f);
        CallSite callSite = ea_0.c("\u00eb", (Object)objectArray2, (long)-6078723291041111846L, (long)l);
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l2;
        objectArray3[1] = Float.valueOf(1.0f);
        objectArray3[0] = Float.valueOf(0.0f);
        CallSite callSite2 = ea_0.c("\u00eb", (Object)objectArray3, (long)-6078723291041111846L, (long)l);
        return f + f10 * (float)(ea_0.c("\u00eb", (double)(-2.0 * ea_0.c("\u00eb", (double)((double)callSite), (long)-6077933354074912337L, (long)l)), (long)-6078621704079040083L, (long)l) * ea_0.c("\u00eb", (double)(Math.PI * 2 * (double)callSite2), (long)-6072916062197971861L, (long)l));
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ea" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ea_0.m(l, l2);
            object = v[n];
            try {
                if (!(object instanceof String)) break block2;
                ea_0.v[n] = clazz = Class.forName(w[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ea_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ea_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = ea_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ea_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = v;
        v[0] = "\n\u0015\u0016t7\n\u0001\u001a\u0007;T\u0007\u0014\u001c";
        objectArray[1] = Double.TYPE;
        ea_0.w[1] = "java/lang/Double";
        objectArray[2] = "\u0014G\u0002\u007f1Y\u0002G\u0007%\"N\u0015\f\u0004#.Z\u0004K\u00134eM\u001e";
        objectArray[3] = "bp\u00008\u001a'\u0017P\u000b7\u000bhv^\u0000<\u000f2\u0002";
        objectArray[4] = Float.TYPE;
        ea_0.w[4] = "java/lang/Float";
        objectArray[5] = "\f0^[w[\u001a0[\u0001dL\r{X\u0007hX\u001c<O\u0010#N\t";
        objectArray[6] = "q 3cw1\u0004\u00008lf~e\u000e3gb$\u0011";
        objectArray[7] = Boolean.TYPE;
        ea_0.w[7] = "java/lang/Boolean";
        objectArray[8] = "5+\u0015}\rP#+\u0010'\u001eG4`\u0013!\u0012S%'\u00046YA\u0019";
        objectArray[9] = ">J\u0006EwWKj\rJf\u00186r\u001eMoQ^";
        objectArray[10] = "<\u001bz\u001c\u0018@*\u001b\u007fF\u000bW=P|@\u0007C,\u0017kWLT\u0013";
        objectArray[11] = "bi\u007f[6)ifn\u0014W'bmjN";
        objectArray[12] = "V\u0019\u0010\u0011*m]\u0016\u0001^BmS\u0019\u0012";
        objectArray[13] = "uzU\u0011{h~uD^\u0018ekxK5-gzkW\u0019:j";
        objectArray[14] = "9b\nF\u0018\u00072m\u001b\te\u001f!j\u0012@";
        objectArray[15] = "\u0006b)Wo/sB\"X~`\u0012L)Sz:f";
        objectArray[16] = Void.TYPE;
        ea_0.w[16] = "java/lang/Void";
        objectArray[17] = "4(*\u001c\u00033* 0S~#*";
        objectArray[18] = "_nu\u0010kP*N~\u001fz\u001fK@u\u0014~E?";
        objectArray[19] = "\u0012c#\u0018\u001dggC(\u0017\f(\u0006M#\u001c\brr";
        objectArray[20] = "\"o_jld\"oH6`k8$H(`~?U\u0018u1";
        objectArray[21] = "@\u0013w\u001c^g@\u0013`@RhZX`^R}])1\u0001\n";
        objectArray[22] = "%-QbG|%-F>Ks?fF Kf8\u0017\u0012x\u001c";
        objectArray[23] = "\u00182\u00148ct\u000e2\u0011bpc\u0019y\u0012d|w\b>\u0005s7bI";
        objectArray[24] = "?b\u000f:\f+JB\u00045\u001dd+L\u000f>\u0019>_";
        objectArray[25] = "\u00121wjzo\u00121`6v`\bz`(vu\u000f\u000b2s.?";
        objectArray[26] = "_\r\u001e \nb_\r\t|\u0006mEF\tb\u0006xB7[9^9";
        objectArray[27] = "R\u0010\b[^IR\u0010\u001f\u0007RFH[\u001f\u0019RSO*MG\n\u0017";
        objectArray[28] = Integer.TYPE;
        ea_0.w[28] = "java/lang/Integer";
        objectArray[29] = "IZ}\n^\u001bIZjVR\u0014S\u0011jHR\u0001T`=\u0017\u0004";
        objectArray[30] = "?%\rM\u0014\u0006J\u0005\u0006B\u0005I+\u000b\rI\u0001\u0013_";
        objectArray[31] = "#-?crT#-(?~[9f(!~N>\u0017xt)\u000b";
        objectArray[32] = "Jx\u000bEV\u0003\\x\u000e\u001fE\u0014K3\r\u0019I\u0000Zt\u001a\u000e\u0002\u0012[";
        objectArray[33] = "d\u001d5W\u0019k\u0011=>X\b$p35S\f~\u0004";
        objectArray[34] = "\u001d\b\n<%Bh(\u000134\r\t&\n80W}";
        objectArray[35] = "S5[?m?X:Jp\u0001<V8H?-";
        objectArray[36] = "XsJ(IhNsOrZ\u007fY8LtVkH\u007f[c\u001d{P\u007fYhG6ldYuGq[s";
        objectArray[37] = "\u0007W\bAAX\fX\u0019\u000e<M\u001eB\u001bM";
        objectArray[38] = Long.TYPE;
        ea_0.w[38] = "java/lang/Long";
        objectArray[39] = "\u001c\u007f\u0014[\u0017`\n\u007f\u0011\u0001\u0004w\u001d4\u0012\u0007\bc\fs\u0005\u0010Cs\n";
        objectArray[40] = "`_]K\b!\u0015\u007fVD\u0019ntq]O\u001d4\u0000";
        objectArray[41] = "\r9\u000b5>1\u00066\u001azY3\u0013=\u001a1b";
        objectArray[42] = "R\u000b\u000b-^\u0003'+\u0000\"OLF%\u000b)K\u00162";
        objectArray[43] = "R\u0012\u0002\u001f\f-D\u0012\u0007E\u001f:SY\u0004C\u0013.B\u001e\u0013TX9d";
        objectArray[44] = "(K%(zm]k.'k\"<e%,oxH";
        objectArray[45] = "\u00160([Z\u0017\u00000-\u0001I\u0000\u0017{.\u0007E\u0014\u0006<9\u0010\u000e\u0003=";
        objectArray[46] = "/\u00055r\u00140Z%>}\u0005\u007f;+5v\u0001%O";
        objectArray[47] = "\u0003u\u0015\u001aL\u0006\u0015u\u0010@_\u0011\u0002>\u0013FS\u0005\u0013y\u0004Q\u0018\u00127";
        objectArray[48] = "0h\u000f'\\dEH\u0004(M+$F\u000f#IqP";
        objectArray[49] = "nU0\u0017\u000e\rxU5M\u001d\u001ao\u001e6K\u0011\u000e~Y!\\Z\u0019G";
        objectArray[50] = "\u0011rGV[hdRLYJ'\u0005\\GRN}q";
        objectArray[51] = "f\n\u0015L\u0012t:\u0002VL}g]\u001e\u001dR\u00192`\n\u0012@\u0017\u000bfV\\O\u001c3m\u001eGM}";
        objectArray[52] = "\u0004U\u001aW\u001enG\n\u001d_fj9\u000eYDW9\u0001A\u001b\u0013X\u0000";
        objectArray[53] = "4_XT^;?\u000b]@ ;8^\u0003Uwlf\rZ9M6;K\u0001\u0001P)!\u0003";
        objectArray[54] = "~\u0003I .'uWL4P'r\u0002\u0012!\u0007p,UJM>-*^\u0014r96j\u000f";
        objectArray[55] = "\u0019&`LI\tFf>Or\u0018vh4\u0006\u0016HK|;\u0014\u0018qJe`\u0004\b\u000bMc~\u0017r";
        objectArray[56] = ".\u0014nf^Qr\u001c-f1E\u0015\u0000fxU\u0017(\u0014ij[..H'eP\u0016%\u0000<g1";
        objectArray[57] = "\u0000)%t\n/\u0011gxriq\r*y+\u0005C_g!}iu\u0005jc,Y(]1\u007fL";
        objectArray[58] = "A4R@\u0015uQ\"\u0012M--N#\tIA\u001f\u001eaS\u001e-*B;\u0015\u0015\u001dy\u001e5\n.";
        objectArray[59] = "7b\u0004It(<6\u0001]\n(;c_H]\u007fe3\u0006$i/5>\u0001\\7;a2";
        objectArray[60] = "A\u0013u\u0000-`F\b5QO:B\u000b,V#\b\u0011Nu\fOcP\u0012<K5dV\f/1";
        objectArray[61] = "UJ7u8\tRQw$ZSVRn#6a\u0005\u00162{ZVD\u00126'aG\nO0D";
        objectArray[62] = "+I4\u0001kgwAw\u0001\u0004t\u0010]<\u001f`!-I3\rn\u0018,Ph\u001d~b+Vv\u000e\u0004";
        objectArray[63] = "(Z57.1%\u0005l\n87b?7c(3tY5g) \u0019\u0006gq0=\u007f\u0004cp#P";
        objectArray[64] = "\t8\u0003\u00195UY*\u000f\tPJ\rJA\u0010o\u0011])\u0005\u0013a\u0017cu\u0007Vl\u0013\u00001\u0004Xj-\t8\u0003\u00195UY*\u000f\tP";
        objectArray[65] = "opB(^{3x\u0001(1mT'\u0015~\r:/xG8_\u0004exAx\u000f\u007f:*\u0007*1";
        objectArray[66] = "i*T1\u0013r6j\n2(c\u0006d\u0000{L3;p\u000fiB\nltHlOa{/An(";
        objectArray[67] = "~D \u001edes\u001by#|e)! \u0019ik.\u0019+QriO\u001a!Svew\u0011iHt\u0004t\u001bkLx<\u007fSpN\u0019";
        objectArray[68] = "2aw{O\u00044'\"`>\u001e;b|yR,o!#.\u0004{4u'p\u0006F$cg}>";
        objectArray[69] = "Y2!V\u0011$Sf,Gs!<){X\u0017q\u0001=tJ\u0019HV93O\u0014#Ab:Ms";
        objectArray[70] = "B5$\u0004EmOj}9\\k\u001cP&PCo\u001e6$TB|sivB[a\u0015krCH\f";
        objectArray[71] = "oY\tC2[3QJC]NTM\u0001]9\u001diY\u000eO7$o\u0005@@<\u001cdM[B]";
        objectArray[72] = "0,w\u001c.Cl$4\u001cA^\u000b8\u007f\u0002%\u00056,p\u0010+<a(7\u0015&Wvs>\u0017A";
        objectArray[73] = "Z2\"Jv\u0018\u001d{1X\u001a\u001f'q~U~O\u001aeqGpvZ2\"Jv\u0018\u001d{1X\u001a";
        objectArray[74] = "\u0000\u0014\u0007G\u0000f\u001e\u0014PRn3\u0000\u000fZG\u0007?9\u0001ZW\u0003Y[\u0017[Z\u0014#\\\u0011EIn";
        objectArray[75] = "iolG\t\u0004qc8[5\u000e\u0017wbPQ^*cmB_giolG\t\u0004qc8[5";
        objectArray[76] = "\u0004Ae\u0019qc\t\u001e<$w{OX^\u001deyVI8\u001faxE$gMwaXBeIvr5";
        objectArray[77] = "\u0014;@w5\u0001H<\buUU-6\tf1\u0005\u0010\"\u0006t?<\u0016~H{4\u0004\u001d6SyU";
        objectArray[78] = "CXk@i\nN\u0006-UX\u00193\u0012eK<I\u000e\u0006jY2pCXk@i\nN\u0006-UX";
        objectArray[79] = "M9\u001dU2\u0003E8\u0005VWP5<\u0015E+PY6AH:";
        objectArray[80] = "ZONj}\u001d\u0010F^e\u0005\u0014+V\u0005haD\u0016B\nzo}ZONj}\u001d\u0010F^e\u0005";
        objectArray[81] = "\u0017P\u0000\u0007K>W\u0001\u0011\u0001w5(^\u0007\u0002KbK\u001a\u0004\fM\\";
        objectArray[82] = "%I-mo)+Xsb\u000evqT#aPqqN'\u001d5\"e\\+%>j~^J";
        objectArray[83] = "\u0004[\n|MD\b\b\f!(C\u0014\u001f\u001exS.R\u001bH \u0016M\u0016\u0018F&(\u0012\u0012\u0007\u0007fR\u0015\u0014\u0019\u0014\u001c";
        objectArray[84] = "g8r:w1gzanOeb0d>)rC+{>\no{.\u007f(Ow~pdc4pv)`S";
        objectArray[85] = "1jRg\u0013\u001505P:h\u0007K{Z-\fWvoU?\u0002nwv\u000e/\u0012\u0014pp\u0010<h";
        objectArray[86] = "M\u001f'\t*t\u000fY(\\VyR\u0007'M\b~R\u001d#1m-F\u000f/\tfe]\rN";
        objectArray[87] = "Ku_Q{+A!R@\u0019..n\u0005_}~\u0013z\nMsG\u0012cQ]c=\u0015eON\u0019";
        Object[] objectArray2 = objectArray;
        objectArray[88] = "]O5\bn\rP\u0010l5v\u0005\u001c*5\u000fc\u0003\r\u0012>Gx\u0001l\u00114E|\rT\u001a|^~lW\u0010~ZrT\\XeX\u0013";
    }

    private boolean d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = r ^ l;
        return (boolean)ea_0.c("\u00dc", (String)((Object)ea_0.c("\u00dc", (Object)this.a, (long)8866255224992052459L, (long)l)), (Object)ea_0.b("t", (int)16115, (long)(0x3CCEFAFE86D55894L ^ l)), (long)8866402625571202524L, (long)l);
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ea_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c1' || c == 'o' || c == '\u00f5' || c == '\u00f1') {
                field = ea_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c1' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'o' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ea_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00dc' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00eb' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static float d(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        float f11 = ((Float)objectArray[2]).floatValue();
        long l = (Long)objectArray[3];
        l = r ^ l;
        return (float)ea_0.c("\u00eb", (float)f10, (float)ea_0.c("\u00eb", (float)f11, (float)f, (long)-4838852864011540114L, (long)l), (long)-4837415121490465115L, (long)l);
    }

    @Override
    public void d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l;
        long l3 = l2 ^ 0xF8796AB825DL;
        long l4 = l2 ^ 0x66F97C09744BL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        ea_0.c("\u00dc", (Object)this, (Object)objectArray2, (long)3248301212457828802L, (long)l);
        this.o = -1;
        this.q = 0.0f;
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l4;
        objectArray3[1] = Float.valueOf((float)ea_0.c("\u00dc", (Object)((Float)((Object)ea_0.c("\u00dc", (Object)this.f, (long)3247673827661079282L, (long)l))), (long)3247892889116533028L, (long)l));
        objectArray3[0] = Float.valueOf((float)ea_0.c("\u00eb", (float)ea_0.c("\u00dc", (Object)((Float)((Object)ea_0.c("\u00dc", (Object)this.e, (long)3247673827661079282L, (long)l))), (long)3247892889116533028L, (long)l), (float)1.0f, (long)3247182508688064363L, (long)l));
        this.l = 1000.0f / ea_0.c("\u00eb", (Object)objectArray3, (long)3248545395574466155L, (long)l);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    @bP
    public void a(bl_0 bl_02) {
        f5 f52;
        long l;
        long l2;
        block69: {
            long l3;
            long l4;
            block70: {
                CallSite callSite;
                long l5;
                block71: {
                    block66: {
                        reference v32;
                        block67: {
                            reference cfr_temp_0;
                            block68: {
                                CallSite callSite2;
                                long l6;
                                block65: {
                                    class_310 class_3102;
                                    block64: {
                                        block63: {
                                            Object object;
                                            block62: {
                                                long l7;
                                                block60: {
                                                    block61: {
                                                        block58: {
                                                            block59: {
                                                                block53: {
                                                                    block54: {
                                                                        Object object2;
                                                                        CallSite callSite3;
                                                                        block56: {
                                                                            block57: {
                                                                                block55: {
                                                                                    block51: {
                                                                                        block52: {
                                                                                            block50: {
                                                                                                class_310 class_3103;
                                                                                                long l8;
                                                                                                block49: {
                                                                                                    long l9 = l2 = r ^ 0x7BA75D2698BL;
                                                                                                    l4 = l9 ^ 0x66AE7A19F5E9L;
                                                                                                    l7 = l9 ^ 0x25899D631CF2L;
                                                                                                    l = l9 ^ 0x4BABB81DB50L;
                                                                                                    l3 = l9 ^ 0x4B73D4979D80L;
                                                                                                    l6 = l9 ^ 0x990332B1342L;
                                                                                                    l5 = l9 ^ 0x53EEE2C6E3C1L;
                                                                                                    l8 = l9 ^ 0x7BA62ECAB31BL;
                                                                                                    callSite = ea_0.c("\u00eb", (long)-4269285591441651336L, (long)l2);
                                                                                                    try {
                                                                                                        try {
                                                                                                            class_3103 = b;
                                                                                                            if (callSite != null) break block49;
                                                                                                            if (ea_0.c("\u00c1", (Object)class_3103, (long)-4268414975475546878L, (long)l2) != null) break block50;
                                                                                                        }
                                                                                                        catch (MatchException matchException) {
                                                                                                            throw ea_0.c("\u00eb", (Object)matchException, (long)-4261228801726388393L, (long)l2);
                                                                                                        }
                                                                                                        class_3103 = b;
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw ea_0.c("\u00eb", (Object)matchException, (long)-4261228801726388393L, (long)l2);
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    try {
                                                                                                        if (ea_0.c("\u00c1", (Object)class_3103, (long)-4269158375254028624L, (long)l2) == null) break block50;
                                                                                                        Object[] objectArray = new Object[1];
                                                                                                        objectArray[0] = l8;
                                                                                                        object = ea_0.c("\u00dc", (Object)ea_0.c("\u00f5", (long)-4260811008587808219L, (long)l2), (Object)objectArray, (long)-4262471263692026338L, (long)l2);
                                                                                                        if (callSite != null) break block51;
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw ea_0.c("\u00eb", (Object)matchException, (long)-4261228801726388393L, (long)l2);
                                                                                                    }
                                                                                                    if (object == false) break block52;
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw ea_0.c("\u00eb", (Object)matchException, (long)-4261228801726388393L, (long)l2);
                                                                                                }
                                                                                            }
                                                                                            return;
                                                                                        }
                                                                                        object = ea_0.c("\u00dc", (String)((Object)ea_0.c("\u00dc", (Object)this.a, (long)-4262336363496699079L, (long)l2)), (Object)ea_0.b("t", (int)30325, (long)(0x586E168AB0402FC1L ^ l2)), (long)-4262184558392927730L, (long)l2);
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                if (callSite != null) break block53;
                                                                                                if (object == false) break block54;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw ea_0.c("\u00eb", (Object)matchException, (long)-4261228801726388393L, (long)l2);
                                                                                            }
                                                                                            Object[] objectArray = new Object[2];
                                                                                            objectArray[1] = l5;
                                                                                            objectArray[0] = Float.valueOf((float)ea_0.c("\u00dc", (Object)((Integer)((Object)ea_0.c("\u00dc", (Object)this.d, (long)-4262336363496699079L, (long)l2))), (long)-4262403627760186986L, (long)l2));
                                                                                            if (ea_0.c("\u00dc", (Object)this.k, (Object)objectArray, (long)-4269217926324660498L, (long)l2) != false) break block55;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw ea_0.c("\u00eb", (Object)matchException, (long)-4261228801726388393L, (long)l2);
                                                                                        }
                                                                                        return;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw ea_0.c("\u00eb", (Object)matchException, (long)-4261228801726388393L, (long)l2);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    callSite3 = ea_0.c("\u00f5", (long)-4260811008587808219L, (long)l2);
                                                                                    object2 = ea_0.c("\u00dc", (String)((Object)ea_0.c("\u00dc", (Object)this.c, (long)-4262336363496699079L, (long)l2)), (Object)ea_0.b("t", (int)26987, (long)(0x5C35ACD8D60D30DCL ^ l2)), (long)-4262184558392927730L, (long)l2);
                                                                                    if (callSite != null) break block56;
                                                                                    if (object2 == false) break block57;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw ea_0.c("\u00eb", (Object)matchException, (long)-4261228801726388393L, (long)l2);
                                                                                }
                                                                                object2 = 0;
                                                                                break block56;
                                                                            }
                                                                            object2 = 1;
                                                                        }
                                                                        Object[] objectArray = new Object[3];
                                                                        objectArray[2] = l4;
                                                                        objectArray[1] = Float.valueOf(0.0f);
                                                                        objectArray[0] = (int)object2;
                                                                        ea_0.c("\u00dc", (Object)callSite3, (Object)objectArray, (long)-4261505069491060350L, (long)l2);
                                                                        Object[] objectArray2 = new Object[1];
                                                                        objectArray2[0] = l;
                                                                        ea_0.c("\u00dc", (Object)this.k, (Object)objectArray2, (long)-4261007651108577049L, (long)l2);
                                                                        return;
                                                                    }
                                                                    object = ea_0.c("\u00dc", (Object)ea_0.c("\u00c1", (Object)b, (long)-4269158375254028624L, (long)l2), (long)-4268716482751962729L, (long)l2);
                                                                }
                                                                try {
                                                                    if (callSite != null) break block58;
                                                                    if (object == false) break block59;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw ea_0.c("\u00eb", (Object)matchException, (long)-4261228801726388393L, (long)l2);
                                                                }
                                                                return;
                                                            }
                                                            object = ea_0.c("\u00dc", (Object)((Boolean)((Object)ea_0.c("\u00dc", (Object)this.g, (long)-4262336363496699079L, (long)l2))), (long)-4260468920087776364L, (long)l2);
                                                        }
                                                        try {
                                                            try {
                                                                try {
                                                                    if (callSite != null) break block60;
                                                                    if (object == false) break block61;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw ea_0.c("\u00eb", (Object)matchException, (long)-4261228801726388393L, (long)l2);
                                                                }
                                                                object = ea_0.c("\u00c1", (Object)b, (long)-4269361768198036530L, (long)l2) instanceof class_3965;
                                                                if (callSite != null) break block60;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw ea_0.c("\u00eb", (Object)matchException, (long)-4261228801726388393L, (long)l2);
                                                            }
                                                            if (object == false) break block61;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw ea_0.c("\u00eb", (Object)matchException, (long)-4261228801726388393L, (long)l2);
                                                        }
                                                        return;
                                                    }
                                                    object = ea_0.c("\u00dc", (Object)((Boolean)((Object)ea_0.c("\u00dc", (Object)this.h, (long)-4262336363496699079L, (long)l2))), (long)-4260468920087776364L, (long)l2);
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            if (callSite != null) break block62;
                                                            if (object == false) break block63;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw ea_0.c("\u00eb", (Object)matchException, (long)-4261228801726388393L, (long)l2);
                                                        }
                                                        class_3102 = b;
                                                        if (callSite != null) break block64;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw ea_0.c("\u00eb", (Object)matchException, (long)-4261228801726388393L, (long)l2);
                                                    }
                                                    Object[] objectArray = new Object[2];
                                                    objectArray[1] = l7;
                                                    objectArray[0] = ea_0.c("\u00dc", (Object)ea_0.c("\u00c1", (Object)class_3102, (long)-4269158375254028624L, (long)l2), (long)-4268819788181897555L, (long)l2);
                                                    object = ea_0.c("\u00eb", (Object)objectArray, (long)-4262613685163116365L, (long)l2);
                                                }
                                                catch (MatchException matchException) {
                                                    throw ea_0.c("\u00eb", (Object)matchException, (long)-4261228801726388393L, (long)l2);
                                                }
                                            }
                                            try {
                                                try {
                                                    try {
                                                        if (object != false) break block63;
                                                        class_3102 = b;
                                                        if (callSite != null) break block64;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw ea_0.c("\u00eb", (Object)matchException, (long)-4261228801726388393L, (long)l2);
                                                    }
                                                    if (ea_0.c("\u00dc", (Object)ea_0.c("\u00dc", (Object)ea_0.c("\u00c1", (Object)class_3102, (long)-4269158375254028624L, (long)l2), (long)-4268819788181897555L, (long)l2), (long)-4268548096026381465L, (long)l2) instanceof class_1743) break block63;
                                                }
                                                catch (MatchException matchException) {
                                                    throw ea_0.c("\u00eb", (Object)matchException, (long)-4261228801726388393L, (long)l2);
                                                }
                                                return;
                                            }
                                            catch (MatchException matchException) {
                                                throw ea_0.c("\u00eb", (Object)matchException, (long)-4261228801726388393L, (long)l2);
                                            }
                                        }
                                        class_3102 = b;
                                    }
                                    CallSite callSite4 = ea_0.c("\u00c1", (Object)class_3102, (long)-4269361768198036530L, (long)l2);
                                    try {
                                        try {
                                            callSite2 = callSite4;
                                            if (callSite != null) break block65;
                                            if (!(callSite2 instanceof class_3966)) break block66;
                                        }
                                        catch (MatchException matchException) {
                                            throw ea_0.c("\u00eb", (Object)matchException, (long)-4261228801726388393L, (long)l2);
                                        }
                                        callSite2 = callSite4;
                                    }
                                    catch (MatchException matchException) {
                                        throw ea_0.c("\u00eb", (Object)matchException, (long)-4261228801726388393L, (long)l2);
                                    }
                                }
                                class_3966 class_39662 = (class_3966)callSite2;
                                reference var20_12 = ea_0.c("\u00dc", (Object)ea_0.c("\u00dc", (Object)class_39662, (long)-4261405847392275091L, (long)l2), (long)-4268312779247398645L, (long)l2);
                                try {
                                    try {
                                        v32 = var20_12;
                                        if (callSite != null) break block67;
                                        if (v32 == this.o) break block68;
                                    }
                                    catch (MatchException matchException) {
                                        throw ea_0.c("\u00eb", (Object)matchException, (long)-4261228801726388393L, (long)l2);
                                    }
                                    this.o = (int)var20_12;
                                    this.p = (long)ea_0.c("\u00eb", (long)-4262563189287197760L, (long)l2);
                                    Object[] objectArray = new Object[1];
                                    objectArray[0] = l6;
                                    this.q = (float)ea_0.c("\u00dc", (Object)this, (Object)objectArray, (long)-4261362066961479792L, (long)l2);
                                }
                                catch (MatchException matchException) {
                                    throw ea_0.c("\u00eb", (Object)matchException, (long)-4261228801726388393L, (long)l2);
                                }
                            }
                            v32 = (cfr_temp_0 = ea_0.c("\u00eb", (long)-4262563189287197760L, (long)l2) - this.p - (long)this.q) == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                        }
                        if (v32 < 0) {
                            return;
                        }
                        break block71;
                    }
                    this.o = -1;
                }
                try {
                    try {
                        f52 = this.k;
                        if (callSite != null) break block69;
                        Object[] objectArray = new Object[2];
                        objectArray[1] = l5;
                        objectArray[0] = Float.valueOf(this.l);
                        if (ea_0.c("\u00dc", (Object)f52, (Object)objectArray, (long)-4269217926324660498L, (long)l2) != false) break block70;
                    }
                    catch (MatchException matchException) {
                        throw ea_0.c("\u00eb", (Object)matchException, (long)-4261228801726388393L, (long)l2);
                    }
                    return;
                }
                catch (MatchException matchException) {
                    throw ea_0.c("\u00eb", (Object)matchException, (long)-4261228801726388393L, (long)l2);
                }
            }
            Object[] objectArray = new Object[3];
            objectArray[2] = l4;
            objectArray[1] = Float.valueOf(0.0f);
            objectArray[0] = 0;
            ea_0.c("\u00dc", (Object)ea_0.c("\u00f5", (long)-4260811008587808219L, (long)l2), (Object)objectArray, (long)-4261505069491060350L, (long)l2);
            Object[] objectArray3 = new Object[3];
            objectArray3[2] = l3;
            objectArray3[1] = Float.valueOf((float)ea_0.c("\u00dc", (Object)((Float)((Object)ea_0.c("\u00dc", (Object)this.f, (long)-4262336363496699079L, (long)l2))), (long)-4262101977329039121L, (long)l2));
            objectArray3[0] = Float.valueOf((float)ea_0.c("\u00eb", (float)ea_0.c("\u00dc", (Object)((Float)((Object)ea_0.c("\u00dc", (Object)this.e, (long)-4262336363496699079L, (long)l2))), (long)-4262101977329039121L, (long)l2), (float)1.0f, (long)-4261704032052554080L, (long)l2));
            this.l = 1000.0f / ea_0.c("\u00eb", (Object)objectArray3, (long)-4260955717153026144L, (long)l2);
            f52 = this.k;
        }
        Object[] objectArray = new Object[1];
        objectArray[0] = l;
        ea_0.c("\u00dc", (Object)f52, (Object)objectArray, (long)-4261007651108577049L, (long)l2);
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return ea_0.c("\u00eb", (Object)((Object)q_0.Sword), (Object)((Object)q_0.UHC), (long)-2445395579279641688L, (long)l);
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (w[n3] != null) {
            return n3;
        }
        Object object = v[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 51;
            case 1 -> 7;
            case 2 -> 39;
            case 3 -> 62;
            case 4 -> 33;
            case 5 -> 2;
            case 6 -> 53;
            case 7 -> 43;
            case 8 -> 45;
            case 9 -> 63;
            case 10 -> 3;
            case 11 -> 21;
            case 12 -> 9;
            case 13 -> 16;
            case 14 -> 22;
            case 15 -> 56;
            case 16 -> 14;
            case 17 -> 15;
            case 18 -> 34;
            case 19 -> 19;
            case 20 -> 30;
            case 21 -> 35;
            case 22 -> 57;
            case 23 -> 17;
            case 24 -> 28;
            case 25 -> 31;
            case 26 -> 23;
            case 27 -> 61;
            case 28 -> 32;
            case 29 -> 24;
            case 30 -> 44;
            case 31 -> 38;
            case 32 -> 11;
            case 33 -> 20;
            case 34 -> 54;
            case 35 -> 40;
            case 36 -> 12;
            case 37 -> 8;
            case 38 -> 41;
            case 39 -> 36;
            case 40 -> 58;
            case 41 -> 13;
            case 42 -> 18;
            case 43 -> 0;
            case 44 -> 25;
            case 45 -> 60;
            case 46 -> 6;
            case 47 -> 52;
            case 48 -> 5;
            case 49 -> 55;
            case 50 -> 49;
            case 51 -> 26;
            case 52 -> 59;
            case 53 -> 48;
            case 54 -> 1;
            case 55 -> 46;
            case 56 -> 42;
            case 57 -> 10;
            case 58 -> 47;
            case 59 -> 37;
            case 60 -> 50;
            case 61 -> 27;
            case 62 -> 4;
            default -> 29;
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
        ea_0.w[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = ea_0.m(l, l2);
        Object object = v[n];
        if (object instanceof String) {
            String string = w[n];
            int n2 = string.indexOf(8);
            Class clazz = ea_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ea_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ea_0.g(clazz3, string2, clazz2)) != null) {
                    ea_0.v[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ea_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ea_0.v[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ea_0.n(784826208281846L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = ea_0.m(l, l2);
        Object object = v[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = w[n];
                int n3 = string2.indexOf(8);
                clazz3 = ea_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ea_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ea_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        ea_0.v[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ea_0.n(784826208281846L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ea_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ea_0.v[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ea_0.n(784826208281846L, 0L);
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
        long l;
        long l2;
        long l3;
        block4: {
            ea_0 ea_02;
            block5: {
                l3 = (Long)objectArray[0];
                long l4 = l3 = r ^ l3;
                l2 = l4 ^ 0x200B78C004ECL;
                l = l4 ^ 0x4C5DBDE81393L;
                this.n = (float)ea_0.c("\u00dc", (Object)((Float)((Object)ea_0.c("\u00dc", (Object)this.i, (long)146744910000836073L, (long)l3))), (long)146803268812459583L, (long)l3);
                CallSite callSite = ea_0.c("\u00eb", (long)148626763739795368L, (long)l3);
                try {
                    try {
                        ea_02 = this;
                        if (callSite != null) break block4;
                        if (!(ea_0.c("\u00dc", (Object)((Float)((Object)ea_0.c("\u00dc", (Object)ea_02.i, (long)146744910000836073L, (long)l3))), (long)146803268812459583L, (long)l3) <= 0.0f)) break block5;
                    }
                    catch (MatchException matchException) {
                        throw ea_0.c("\u00eb", (Object)matchException, (long)147887498852409735L, (long)l3);
                    }
                    this.m = 0.0f;
                    return;
                }
                catch (MatchException matchException) {
                    throw ea_0.c("\u00eb", (Object)matchException, (long)147887498852409735L, (long)l3);
                }
            }
            ea_02 = this;
        }
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = Float.valueOf(15.0f);
        objectArray2[0] = Float.valueOf((float)ea_0.c("\u00dc", (Object)((Float)((Object)ea_0.c("\u00dc", (Object)this.i, (long)146744910000836073L, (long)l3))), (long)146803268812459583L, (long)l3));
        Object[] objectArray3 = new Object[4];
        objectArray3[3] = l;
        objectArray3[2] = Float.valueOf((float)(ea_0.c("\u00dc", (Object)((Float)((Object)ea_0.c("\u00dc", (Object)this.i, (long)146744910000836073L, (long)l3))), (long)146803268812459583L, (long)l3) + 50.0f));
        objectArray3[1] = Float.valueOf((float)(ea_0.c("\u00dc", (Object)((Float)((Object)ea_0.c("\u00dc", (Object)this.i, (long)146744910000836073L, (long)l3))), (long)146803268812459583L, (long)l3) - 50.0f));
        objectArray3[0] = Float.valueOf((float)ea_0.c("\u00eb", (Object)objectArray2, (long)149529136533893196L, (long)l3));
        ea_02.m = (float)ea_0.c("\u00eb", (Object)objectArray3, (long)149180642965158169L, (long)l3);
    }

    private boolean lambda$new$0(String string) {
        long l = r ^ 0x6B600CA849B4L;
        return (boolean)ea_0.c("\u00dc", (String)((Object)ea_0.c("\u00dc", (Object)this.a, (long)-1952786030965380346L, (long)l)), (Object)ea_0.b("t", (int)21861, (long)(0x364F3FE9AEA72CECL ^ l)), (long)-1952660754843846095L, (long)l);
    }

    private boolean lambda$new$2(Float f) {
        long l = r ^ 0x752F08C1AA7AL;
        long l2 = l ^ 0x43094F8ED165L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)ea_0.c("\u00dc", (Object)this, (Object)objectArray, (long)518948838626123012L, (long)l);
    }

    private boolean lambda$new$1(Integer n) {
        long l = r ^ 0x49B4688DC410L;
        return (boolean)ea_0.c("\u00dc", (String)((Object)ea_0.c("\u00dc", (Object)this.a, (long)7584745286905570978L, (long)l)), (Object)ea_0.b("t", (int)21861, (long)(0x364F1D3DCA82A148L ^ l)), (long)7584875101733664661L, (long)l);
    }

    private boolean lambda$new$3(Float f) {
        long l = r ^ 0x635A39662615L;
        long l2 = l ^ 0x557C7E295D0AL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)ea_0.c("\u00dc", (Object)this, (Object)objectArray, (long)-8404636864399617685L, (long)l);
    }

    private boolean lambda$new$4(Boolean bl) {
        long l = r ^ 0xD41E1F23B66L;
        long l2 = l ^ 0x3B67A6BD4079L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)ea_0.c("\u00dc", (Object)this, (Object)objectArray, (long)-7624641074612745192L, (long)l);
    }

    private boolean lambda$new$5(Boolean bl) {
        long l = r ^ 0xFCB44087BAEL;
        long l2 = l ^ 0x39ED034700B1L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)ea_0.c("\u00dc", (Object)this, (Object)objectArray, (long)-2961160888702169904L, (long)l);
    }

    private boolean lambda$new$6(Float f) {
        long l = r ^ 0x62D771AB2D7L;
        long l2 = l ^ 0x300B3055C9C8L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)ea_0.c("\u00dc", (Object)this, (Object)objectArray, (long)2278502803816203689L, (long)l);
    }

    private boolean lambda$new$7(Float f) {
        reference v1;
        block8: {
            block7: {
                CallSite callSite;
                long l;
                block6: {
                    l = r ^ 0x5754D5462352L;
                    long l2 = l ^ 0x61729209584DL;
                    callSite = ea_0.c("\u00eb", (long)-8207489600944798815L, (long)l);
                    try {
                        try {
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l2;
                            v1 = ea_0.c("\u00dc", (Object)this, (Object)objectArray, (long)-8206808374748195796L, (long)l);
                            if (callSite != null) break block6;
                            if (v1 == false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw ea_0.c("\u00eb", (Object)matchException, (long)-8213367158311539314L, (long)l);
                        }
                        reference v1 = ea_0.c("\u00dc", (Object)((Float)((Object)ea_0.c("\u00dc", (Object)this.i, (long)-8214438968790826528L, (long)l))), (long)-8214380745003351498L, (long)l) - 0.0f;
                        v1 = v1 == 0 ? 0 : (v1 > 0 ? 1 : -1);
                    }
                    catch (MatchException matchException) {
                        throw ea_0.c("\u00eb", (Object)matchException, (long)-8213367158311539314L, (long)l);
                    }
                }
                try {
                    if (callSite != null) break block8;
                    if (v1 <= 0) break block7;
                }
                catch (MatchException matchException) {
                    throw ea_0.c("\u00eb", (Object)matchException, (long)-8213367158311539314L, (long)l);
                }
                v1 = (reference)1;
                break block8;
            }
            v1 = (reference)0;
        }
        return (boolean)v1;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ea_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ea_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


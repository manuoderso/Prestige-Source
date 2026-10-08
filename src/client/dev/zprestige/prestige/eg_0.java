/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_490
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bl_0;
import dev.zprestige.prestige.dL;
import dev.zprestige.prestige.dP;
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
import net.minecraft.class_490;

/*
 * Renamed from dev.zprestige.prestige.eg
 */
public class eg_0
extends dV {
    private dQ a;
    private dP c;
    private dP d;
    private dL f;
    private f5 e;
    private static final long k;
    private static final long[] l;
    private static final Integer[] m;
    private static final Map n;
    private static final Object[] o;
    private static final String[] p;

    public eg_0() {
        long l = k ^ 0x216C77D2AB67L;
        long l2 = l ^ 0x37E850453748L;
        this.e = new f5(l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                eg_0.k = hc.a(-1439183117393019405L, -3950401577582547323L, MethodHandles.lookup().lookupClass()).a(73014811529692L);
                eg_0.o = new Object[49];
                eg_0.p = new String[49];
                eg_0.f();
                eg_0.n = new HashMap<K, V>(13);
                var0 = eg_0.k ^ 25932741572431L;
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
                var6_5 = "\\\u00df\u00b4\u00c0\u00c9\u00b8\\s\u00e1\u00f1[\u008c\u001e\u00bb!\u00f3";
                var7_6 = "\\\u00df\u00b4\u00c0\u00c9\u00b8\\s\u00e1\u00f1[\u008c\u001e\u00bb!\u00f3".length();
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
                    var6_5 = "=\u00e8\u0084\u00a6\u001db\u0098\u00f1\u0013\u00e4/\u00a7\u00a3V\u00abd";
                    var7_6 = "=\u00e8\u0084\u00a6\u001db\u0098\u00f1\u0013\u00e4/\u00a7\u00a3V\u00abd".length();
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
        eg_0.l = var8_3;
        eg_0.m = new Integer[4];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = eg_0.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x149C;
        if (m[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = eg_0.l[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])eg_0.n.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    eg_0.n.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/eg", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            eg_0.m[n2] = n3;
        }
        return m[n2];
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/eg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/eg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = eg_0.m(l, l2);
            object = o[n];
            try {
                if (!(object instanceof String)) break block2;
                eg_0.o[n] = clazz = Class.forName(p[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = eg_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = eg_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = eg_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = eg_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = o;
        o[0] = "z-w\u001bWWz-`G[X`f`Y[Mg\u00170\u0004\n";
        objectArray[1] = "\u001bGLq(@\u001bG[-$O\u0001\f[3$Z\u0006}\toq\u0018";
        objectArray[2] = "S\u001cxd=kE\u001c}>.|RW~8\"hC\u0010i/iz\u007f";
        objectArray[3] = "$\rYF\u0011NQ-RI\u0000\u0001,5AN\tHD";
        objectArray[4] = "sdQ\u00019#vqZ\u000128za\u0018h\u0019\u0012K";
        objectArray[5] = Long.TYPE;
        eg_0.p[5] = "java/lang/Long";
        objectArray[6] = Integer.TYPE;
        eg_0.p[6] = "java/lang/Integer";
        objectArray[7] = "\t\\iw}\u0016\t\\~+q\u0019\u0013\u0017~5q\f\u0014f,n!L";
        objectArray[8] = "1\u0014|\u0013\"C'\u0014yI1T0_zO=@!\u0018mXvU`";
        objectArray[9] = "|\u00056Gj~\t%=H{1h+6C\u007fk\u001c";
        objectArray[10] = Boolean.TYPE;
        eg_0.p[10] = "java/lang/Boolean";
        objectArray[11] = ":v\u0002(nf1y\u0013g\td$r\u0013,2";
        objectArray[12] = "t51B\u001cgb54\u0018\u000fpu~7\u001e\u0003dd9 \tHrw";
        objectArray[13] = "8ii'5-3fxhV &kw\u0003c\"7xk/t/";
        objectArray[14] = "\u0006z$\u001fed\u0010z!Evs\u00071\"Czg\u0016v5T1p3";
        objectArray[15] = "\u0010T*u\u0018\u0017et!z\tX\u0004z*q\r\u0002p";
        objectArray[16] = Void.TYPE;
        eg_0.p[16] = "java/lang/Void";
        objectArray[17] = "?c)a}\n?c>=q\u0005%(>#q\u0010\"Yi|'";
        objectArray[18] = "J\ncE^GJ\nt\u0019RHPAt\u0007R]W0&S\u0003\u001c";
        objectArray[19] = "\u0007<{\u001bJb\u0007<lGFm\u001dwlYFx\u001a\u0006>\u0002\u001e9";
        objectArray[20] = "^\u0004'7B\u0012@\f=x \u000eG\u0011";
        objectArray[21] = ";&{\\\u0005h-&~\u0006\u0016\u007f:m}\u0000\u001ak+*j\u0017Q|\u0014";
        objectArray[22] = "\u007fw eJ)tx1*+'\u007fs5p";
        objectArray[23] = "[\\Z\u001a\u001f\u0004PSKUw\u0004^\\X";
        objectArray[24] = Float.TYPE;
        eg_0.p[24] = "java/lang/Float";
        objectArray[25] = "\u0015M\u0006}1\u0001\u0003M\u0003'\"\u0016\u0014\u0006\u0000!.\u0002\u0005A\u00176e\u0012\u0003";
        objectArray[26] = "2StT^-Gs\u007f[Ob&}tPK8R";
        objectArray[27] = "\rRb4F\u0018xri;WW\u0019|b0S\rm";
        objectArray[28] = "(\u001a\u0001]\u0010\\]:\nR\u0001\u0013<4\u0001Y\u0005IH";
        objectArray[29] = "\u0004@\u0010:X+X\u001e\u001aQY&CF\u0019=kq\u0005\u0018Nj<0QC\u0006<G+\u0006[~";
        objectArray[30] = "{X$\u0005O\u0018;I!\u001e*KB\u0012&\u001bEJ(E\"UG!";
        objectArray[31] = "\tU\u0013wn OA\u0015n\u000bvVTWAfeqWY\u000e0gV_\u0019eyvYG(2v'\tCFkf~\u000b:\u0014s5\"KTMcl 2";
        objectArray[32] = "\u0019lU#)7]|K'\u00160EnVpAa\u001b2\u000f\u001c+1C<\ruo!]8";
        objectArray[33] = "ewQ\u000bLd~ IsDrbyS\u001fv#\"(\fs\u001aaz|\u0005\u0018Spud4";
        objectArray[34] = "\f\u0016Z([\u001cVCMe?\u00042OPy\u0006\u000f@I\u0012,\u0003m\rNWx@\f]\u0011\u0012|?";
        objectArray[35] = "xx`vc:7$#sS:.9\u0002f7&%E`rm`1+9b4bH";
        objectArray[36] = "$\u001fHgv\u001bq\u0010Vn\t\t\u0014J\u001eq7\\/\u0018Oep`%AY25[w\u0010Mu\t";
        objectArray[37] = "\u001f\u000b\u000f6g\\\u0014P\u001c!X[vP\u00185aS\u0004VZ`d1\u001c\f\u00075dQ\f\f\u001d`X";
        objectArray[38] = "wYM{#T+\u0007G\u0010)U![OG~\u000bq\u0002#{wQ}NZ!v\bw";
        objectArray[39] = "9\u0006<xK\\m\u0017 8vN3\u0013$-!\u0010lE|A\u001aK8\u001b%?\u0004X#\u001b";
        objectArray[40] = "\u0001x\u0007\t\tPS:\n\tl\u0012\r7\u0001kP\u0014R~\u0015\u0005\t\u0004\u000b|l";
        objectArray[41] = "[\n\u0005}`q\u000bH\u00118\nt5Z\u001a+elUYGzn\u001d";
        objectArray[42] = "H\\\fF&]D\u0003\u0000BEKC^\u000eC\u001bLCD\n?*C_E\u001a\u000e|\\\u001dVg";
        objectArray[43] = "`3&qu1;2 a\r#\u00005fb4+r3$71Imjunhp?(xn\r";
        objectArray[44] = "\u0005>|\u007f#{_kk2Gc;gv.~hIa4{{\nQ;i.{jA;s{G";
        objectArray[45] = "/KAV^y}\tLV;//\n*\bF~y\u000fDQV'{vDTV/3\u0016G\t\u0007$B";
        objectArray[46] = "_D\u001c\u0017fg\u0004E\u001a\u0007\u001er?B\\\u0004'}MD\u001eQ\"\u001f\u0000C[\u0005a~P\u001c\u001e\u0001\u001e";
        objectArray[47] = "&\u00121qJYtP<q/\u00010b?kS\u0011K\u00109l@\u001f*@f)D`";
        Object[] objectArray2 = objectArray;
        objectArray[48] = "Zm;\u000f,P\u000e|'O\u0011BPx#ZF\u001c\u000b%w6}G[p\"HcT@p";
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'C' || c == '\u00e6' || c == '\u00fe' || c == '\u00ef') {
                field = eg_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'C' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e6' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00fe' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = eg_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'r' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f9' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = eg_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    @bP
    public void a(bl_0 bl_02) {
        block36: {
            reference v29;
            long l;
            long l2;
            long l3;
            long l4;
            block50: {
                Integer n;
                block48: {
                    CallSite callSite;
                    block49: {
                        CallSite callSite2;
                        CallSite callSite3;
                        block47: {
                            CallSite callSite4;
                            block46: {
                                block41: {
                                    block42: {
                                        reference v17;
                                        block45: {
                                            Integer n2;
                                            block43: {
                                                CallSite callSite5;
                                                block44: {
                                                    Object object;
                                                    long l5;
                                                    block39: {
                                                        block40: {
                                                            block37: {
                                                                block38: {
                                                                    block35: {
                                                                        long l6 = l4 = k ^ 0x12C9D201B0F8L;
                                                                        l5 = l6 ^ 0x43D2F34CC10DL;
                                                                        l3 = l6 ^ 0x47EBBDA3F455L;
                                                                        l2 = l6 ^ 0x46B73E0AC8D7L;
                                                                        long l7 = l6 ^ 0x11E3674DF046L;
                                                                        l = l6 ^ 0x204EAB0E99ABL;
                                                                        callSite4 = eg_0.c("\u00f9", (long)-2932546392690751473L, (long)l4);
                                                                        try {
                                                                            try {
                                                                                object = eg_0.c("C", (Object)b, (long)-2935339345373981381L, (long)l4) instanceof class_490;
                                                                                if (callSite4 != null) break block35;
                                                                                if (object == 0) break block36;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw eg_0.c("\u00f9", (Object)matchException, (long)-2935499631304321626L, (long)l4);
                                                                            }
                                                                            Object[] objectArray = new Object[2];
                                                                            objectArray[1] = l7;
                                                                            objectArray[0] = Float.valueOf((float)eg_0.c("r", (Object)((Float)((Object)eg_0.c("r", (Object)this.a, (long)-2936226111228194709L, (long)l4))), (long)-2936196078038143077L, (long)l4));
                                                                            object = eg_0.c("r", (Object)this.e, (Object)objectArray, (long)-2935620344252735152L, (long)l4);
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw eg_0.c("\u00f9", (Object)matchException, (long)-2935499631304321626L, (long)l4);
                                                                        }
                                                                    }
                                                                    try {
                                                                        if (callSite4 != null) break block37;
                                                                        if (object != 0) break block38;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw eg_0.c("\u00f9", (Object)matchException, (long)-2935499631304321626L, (long)l4);
                                                                    }
                                                                    return;
                                                                }
                                                                object = eg_0.c("r", (Object)((Integer)((Object)eg_0.c("r", (Object)this.f, (long)-2936226111228194709L, (long)l4))), (long)-2935506430301397561L, (long)l4);
                                                            }
                                                            try {
                                                                try {
                                                                    if (callSite4 != null) break block39;
                                                                    if (object != -1) break block40;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw eg_0.c("\u00f9", (Object)matchException, (long)-2935499631304321626L, (long)l4);
                                                                }
                                                                return;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw eg_0.c("\u00f9", (Object)matchException, (long)-2935499631304321626L, (long)l4);
                                                            }
                                                        }
                                                        object = eg_0.c("\u00f9", (long)eg_0.c("r", (Object)eg_0.c("r", (Object)b, (long)-2932577750563361080L, (long)l4), (long)-2935684639811174902L, (long)l4), (int)eg_0.c("r", (Object)((Integer)((Object)eg_0.c("r", (Object)this.f, (long)-2936226111228194709L, (long)l4))), (long)-2935506430301397561L, (long)l4), (long)-2932449626772598924L, (long)l4);
                                                    }
                                                    if (object == 0) {
                                                        return;
                                                    }
                                                    Object[] objectArray = new Object[3];
                                                    objectArray[2] = l5;
                                                    objectArray[1] = true;
                                                    objectArray[0] = eg_0.c("\u00fe", (long)-2934637775181128980L, (long)l4);
                                                    callSite5 = eg_0.c("\u00f9", (Object)objectArray, (long)-2936093468784949740L, (long)l4);
                                                    Object[] objectArray2 = new Object[3];
                                                    objectArray2[2] = l5;
                                                    objectArray2[1] = true;
                                                    objectArray2[0] = eg_0.c("\u00fe", (long)-2935251718114682225L, (long)l4);
                                                    callSite = eg_0.c("\u00f9", (Object)objectArray2, (long)-2936093468784949740L, (long)l4);
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            callSite3 = eg_0.c("r", (Object)callSite5, (long)-2935844207776494414L, (long)l4);
                                                                            if (callSite4 != null) break block41;
                                                                            if (callSite3 != false) break block42;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw eg_0.c("\u00f9", (Object)matchException, (long)-2935499631304321626L, (long)l4);
                                                                        }
                                                                        callSite3 = eg_0.c("r", (Object)callSite5, (long)-2936295228703253032L, (long)l4);
                                                                        if (callSite4 != null) break block41;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw eg_0.c("\u00f9", (Object)matchException, (long)-2935499631304321626L, (long)l4);
                                                                    }
                                                                    if (callSite3 <= eg_0.c("r", (Object)((Integer)((Object)eg_0.c("r", (Object)this.c, (long)-2936226111228194709L, (long)l4))), (long)-2935506430301397561L, (long)l4)) break block42;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw eg_0.c("\u00f9", (Object)matchException, (long)-2935499631304321626L, (long)l4);
                                                                }
                                                                n2 = (Integer)((Object)eg_0.c("r", (Object)callSite5, (int)0, (long)-2935949843180156411L, (long)l4));
                                                                if (callSite4 != null) break block43;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw eg_0.c("\u00f9", (Object)matchException, (long)-2935499631304321626L, (long)l4);
                                                            }
                                                            if (eg_0.c("r", (Object)n2, (long)-2935506430301397561L, (long)l4) >= eg_0.b("k", (int)5974, (long)(0x87D7D4F1D36D483L ^ l4))) break block44;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw eg_0.c("\u00f9", (Object)matchException, (long)-2935499631304321626L, (long)l4);
                                                        }
                                                        v17 = eg_0.c("r", (Object)((Integer)((Object)eg_0.c("r", (Object)callSite5, (int)0, (long)-2935949843180156411L, (long)l4))), (long)-2935506430301397561L, (long)l4) + eg_0.b("k", (int)20636, (long)(0x37261591BEA41348L ^ l4));
                                                        break block45;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw eg_0.c("\u00f9", (Object)matchException, (long)-2935499631304321626L, (long)l4);
                                                    }
                                                }
                                                n2 = (Integer)((Object)eg_0.c("r", (Object)callSite5, (int)0, (long)-2935949843180156411L, (long)l4));
                                            }
                                            v17 = eg_0.c("r", (Object)n2, (long)-2935506430301397561L, (long)l4);
                                        }
                                        reference var17_11 = v17;
                                        Object[] objectArray = new Object[4];
                                        objectArray[3] = l3;
                                        objectArray[2] = eg_0.c("\u00fe", (long)-2935725597692972085L, (long)l4);
                                        objectArray[1] = 1;
                                        objectArray[0] = (int)var17_11;
                                        eg_0.c("\u00f9", (Object)objectArray, (long)-2935867524902093537L, (long)l4);
                                        Object[] objectArray3 = new Object[1];
                                        objectArray3[0] = l;
                                        eg_0.c("r", (Object)this.a, (Object)objectArray3, (long)-2935362612498620387L, (long)l4);
                                        Object[] objectArray4 = new Object[1];
                                        objectArray4[0] = l2;
                                        eg_0.c("r", (Object)this.e, (Object)objectArray4, (long)-2936033566315204759L, (long)l4);
                                        return;
                                    }
                                    callSite3 = eg_0.c("r", (Object)callSite, (long)-2935844207776494414L, (long)l4);
                                }
                                try {
                                    try {
                                        if (callSite4 != null) break block46;
                                        if (callSite3 != false) break block36;
                                    }
                                    catch (MatchException matchException) {
                                        throw eg_0.c("\u00f9", (Object)matchException, (long)-2935499631304321626L, (long)l4);
                                    }
                                    callSite3 = eg_0.c("r", (Object)callSite, (long)-2936295228703253032L, (long)l4);
                                }
                                catch (MatchException matchException) {
                                    throw eg_0.c("\u00f9", (Object)matchException, (long)-2935499631304321626L, (long)l4);
                                }
                            }
                            try {
                                try {
                                    try {
                                        callSite2 = eg_0.c("r", (Object)((Integer)((Object)eg_0.c("r", (Object)this.d, (long)-2936226111228194709L, (long)l4))), (long)-2935506430301397561L, (long)l4);
                                        if (callSite4 != null) break block47;
                                        if (callSite3 <= callSite2) break block36;
                                    }
                                    catch (MatchException matchException) {
                                        throw eg_0.c("\u00f9", (Object)matchException, (long)-2935499631304321626L, (long)l4);
                                    }
                                    n = (Integer)((Object)eg_0.c("r", (Object)callSite, (int)0, (long)-2935949843180156411L, (long)l4));
                                    if (callSite4 != null) break block48;
                                }
                                catch (MatchException matchException) {
                                    throw eg_0.c("\u00f9", (Object)matchException, (long)-2935499631304321626L, (long)l4);
                                }
                                CallSite callSite2 = eg_0.c("r", (Object)n, (long)-2935506430301397561L, (long)l4);
                                callSite2 = eg_0.b("k", (int)22800, (long)(0x1A9D2D2535D39AC6L ^ l4));
                            }
                            catch (MatchException matchException) {
                                throw eg_0.c("\u00f9", (Object)matchException, (long)-2935499631304321626L, (long)l4);
                            }
                        }
                        try {
                            if (callSite3 >= callSite2) break block49;
                            v29 = eg_0.c("r", (Object)((Integer)((Object)eg_0.c("r", (Object)callSite, (int)0, (long)-2935949843180156411L, (long)l4))), (long)-2935506430301397561L, (long)l4) + eg_0.b("k", (int)1020, (long)(0x3B847D9BB3F4402BL ^ l4));
                            break block50;
                        }
                        catch (MatchException matchException) {
                            throw eg_0.c("\u00f9", (Object)matchException, (long)-2935499631304321626L, (long)l4);
                        }
                    }
                    n = (Integer)((Object)eg_0.c("r", (Object)callSite, (int)0, (long)-2935949843180156411L, (long)l4));
                }
                v29 = eg_0.c("r", (Object)n, (long)-2935506430301397561L, (long)l4);
            }
            reference var17_12 = v29;
            Object[] objectArray = new Object[4];
            objectArray[3] = l3;
            objectArray[2] = eg_0.c("\u00fe", (long)-2935725597692972085L, (long)l4);
            objectArray[1] = 1;
            objectArray[0] = (int)var17_12;
            eg_0.c("\u00f9", (Object)objectArray, (long)-2935867524902093537L, (long)l4);
            Object[] objectArray5 = new Object[1];
            objectArray5[0] = l;
            eg_0.c("r", (Object)this.a, (Object)objectArray5, (long)-2935362612498620387L, (long)l4);
            Object[] objectArray6 = new Object[1];
            objectArray6[0] = l2;
            eg_0.c("r", (Object)this.e, (Object)objectArray6, (long)-2936033566315204759L, (long)l4);
            return;
        }
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
            case 0 -> 2;
            case 1 -> 5;
            case 2 -> 23;
            case 3 -> 33;
            case 4 -> 4;
            case 5 -> 20;
            case 6 -> 40;
            case 7 -> 19;
            case 8 -> 55;
            case 9 -> 43;
            case 10 -> 10;
            case 11 -> 26;
            case 12 -> 24;
            case 13 -> 56;
            case 14 -> 39;
            case 15 -> 49;
            case 16 -> 60;
            case 17 -> 1;
            case 18 -> 41;
            case 19 -> 18;
            case 20 -> 8;
            case 21 -> 50;
            case 22 -> 21;
            case 23 -> 59;
            case 24 -> 31;
            case 25 -> 6;
            case 26 -> 0;
            case 27 -> 30;
            case 28 -> 27;
            case 29 -> 63;
            case 30 -> 7;
            case 31 -> 12;
            case 32 -> 25;
            case 33 -> 53;
            case 34 -> 52;
            case 35 -> 37;
            case 36 -> 28;
            case 37 -> 48;
            case 38 -> 36;
            case 39 -> 11;
            case 40 -> 15;
            case 41 -> 62;
            case 42 -> 42;
            case 43 -> 61;
            case 44 -> 9;
            case 45 -> 3;
            case 46 -> 46;
            case 47 -> 22;
            case 48 -> 57;
            case 49 -> 14;
            case 50 -> 45;
            case 51 -> 38;
            case 52 -> 35;
            case 53 -> 17;
            case 54 -> 16;
            case 55 -> 32;
            case 56 -> 47;
            case 57 -> 34;
            case 58 -> 13;
            case 59 -> 58;
            case 60 -> 51;
            case 61 -> 29;
            case 62 -> 44;
            default -> 54;
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
        eg_0.p[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = eg_0.m(l, l2);
        Object object = o[n];
        if (object instanceof String) {
            String string = p[n];
            int n2 = string.indexOf(8);
            Class clazz = eg_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = eg_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = eg_0.g(clazz3, string2, clazz2)) != null) {
                    eg_0.o[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = eg_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        eg_0.o[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = eg_0.n(1572492230330997L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = eg_0.m(l, l2);
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
                clazz3 = eg_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = eg_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = eg_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        eg_0.o[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = eg_0.n(1572492230330997L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = eg_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        eg_0.o[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = eg_0.n(1572492230330997L, 0L);
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
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(eg_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(eg_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1684
 *  net.minecraft.class_1799
 *  net.minecraft.class_1937
 *  net.minecraft.class_243
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_408
 *  org.joml.Matrix4f
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bW;
import dev.zprestige.prestige.bo_0;
import dev.zprestige.prestige.bt_0;
import dev.zprestige.prestige.c4;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dN;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.g4;
import dev.zprestige.prestige.hc;
import java.awt.Color;
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
import java.util.HashSet;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1684;
import net.minecraft.class_1799;
import net.minecraft.class_1937;
import net.minecraft.class_243;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_408;
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.fj
 */
public class fj_0
extends dV {
    private dM d;
    private dM a;
    private dN c;
    private dM e;
    private dO f;
    private dM g;
    private dN h;
    private static final int i;
    private static final class_2960 j;
    private static bW k;
    private Map l;
    private Map m;
    private Map n;
    private static final long o;
    private static final float p = 1.0f;
    private static final long q;
    private static final String[] r;
    private static final String[] s;
    private static final Map t;
    private static final long[] u;
    private static final Integer[] v;
    private static final Map w;
    private static final Object[] x;
    private static final String[] y;

    public fj_0() {
        long l;
        long l2 = l = q ^ 0x42B1858367DEL;
        long l3 = l2 ^ 0x136283ABFC5CL;
        long l4 = l2 ^ 0x61A24F18E7BAL;
        long l5 = l2 ^ 0x4E2F397A80B7L;
        this.l = new HashMap();
        this.m = new HashMap();
        this.n = new HashMap();
        Object[] objectArray = new Object[2];
        objectArray[1] = l4;
        objectArray[0] = this::lambda$new$1;
        fj_0.d("\u00d1", (Object)this.c, (Object)objectArray, (long)1153820501780189509L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l5;
        objectArray2[0] = this::lambda$new$0;
        fj_0.d("\u00d1", (Object)this.a, (Object)objectArray2, (long)1169308431065250903L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l5;
        objectArray3[0] = this::lambda$new$3;
        fj_0.d("\u00d1", (Object)this.g, (Object)objectArray3, (long)1169308431065250903L, (long)l);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l4;
        objectArray4[0] = this::lambda$new$4;
        fj_0.d("\u00d1", (Object)this.h, (Object)objectArray4, (long)1153820501780189509L, (long)l);
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l3;
        objectArray5[0] = this::lambda$new$2;
        fj_0.d("\u00d1", (Object)this.f, (Object)objectArray5, (long)1157396898139295607L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block17: {
            block16: {
                block15: {
                    block14: {
                        fj_0.q = hc.a(4835925170033645184L, 6450552299841063608L, MethodHandles.lookup().lookupClass()).a(68672690785L);
                        var27 = fj_0.q ^ 33659137210779L;
                        fj_0.x = new Object[146];
                        fj_0.y = new String[146];
                        fj_0.f();
                        fj_0.t = new HashMap<K, V>(13);
                        var18_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var27 >>> 56);
                        for (var19_2 = 1; var19_2 < 8; ++var19_2) {
                            v2 = v2;
                            v2[var19_2] = (byte)(var27 << var19_2 * 8 >>> 56);
                        }
                        var18_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var25_3 = new String[3];
                        var23_4 = 0;
                        var22_5 = "\u00de\u009d\u00bc\u0093g1m`\u00f2kqP\u0011\u00fau\u0006&\u0011\u0088\u0086w\u00a9L\u00b1\u00a9J\u00c2\u00b4\u0080\u0014\u00ac\u00b1\u0095\u0090\t\u00ee\f\u0019\u0011h\u00a4\u00e8\u00f4\u00b3\u00bc\u00ff\u000f\"0\u00eb\u00fdo\u008b\u00b3\u009dz\u0018\u00d0\u00d2Q8\u00ac  \u001e\u00bb/w>nV\u00d8\"C7\u00b2)\u0006V\u00bdM\u00109\u0084\u00e3m\u00ba\u00b9\u001c\u00f6H\u0082\u00ff7xb\u001f]";
                        var24_6 = "\u00de\u009d\u00bc\u0093g1m`\u00f2kqP\u0011\u00fau\u0006&\u0011\u0088\u0086w\u00a9L\u00b1\u00a9J\u00c2\u00b4\u0080\u0014\u00ac\u00b1\u0095\u0090\t\u00ee\f\u0019\u0011h\u00a4\u00e8\u00f4\u00b3\u00bc\u00ff\u000f\"0\u00eb\u00fdo\u008b\u00b3\u009dz\u0018\u00d0\u00d2Q8\u00ac  \u001e\u00bb/w>nV\u00d8\"C7\u00b2)\u0006V\u00bdM\u00109\u0084\u00e3m\u00ba\u00b9\u001c\u00f6H\u0082\u00ff7xb\u001f]".length();
                        var21_7 = 56;
                        var20_8 = -1;
lbl32:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl34:
                        // 1 sources

                        while (true) {
                            var25_3[var23_4++] = fj_0.b(var26_9).intern();
                            if ((var20_8 += var21_7) < var24_6) {
                                var21_7 = var22_5.charAt(var20_8);
                                ** continue;
                            }
                            break block14;
                            break;
                        }
                        v3 = ++var20_8;
                        var26_9 = var18_1.doFinal(var22_5.substring(v3, v3 + var21_7).getBytes("ISO-8859-1"));
                        ** while (true)
                    }
                    fj_0.r = var25_3;
                    fj_0.s = new String[3];
                    fj_0.w = new HashMap<K, V>(13);
                    var7_10 = Cipher.getInstance("DES/CBC/NoPadding");
                    v4 = SecretKeyFactory.getInstance("DES");
                    v5 = new byte[8];
                    v6 = v5;
                    v5[0] = (byte)(var27 >>> 56);
                    for (var8_11 = 1; var8_11 < 8; ++var8_11) {
                        v6 = v6;
                        v6[var8_11] = (byte)(var27 << var8_11 * 8 >>> 56);
                    }
                    var7_10.init(2, (Key)v4.generateSecret(new DESKeySpec(v6)), new IvParameterSpec(new byte[8]));
                    var13_12 = new long[5];
                    var10_13 = 0;
                    var11_14 = "_+\u00d8\u0085\u00ff\u0097\u0001\u00c6(\u001a\u0080\u00b3\u00d0`Y\u00d1\u00a9~\u0018I)\u00bb\u00aa<";
                    var12_15 = "_+\u00d8\u0085\u00ff\u0097\u0001\u00c6(\u001a\u0080\u00b3\u00d0`Y\u00d1\u00a9~\u0018I)\u00bb\u00aa<".length();
                    var9_16 = 0;
                    while (true) {
                        var14_17 = var11_14.substring(var9_16, var9_16 += 8).getBytes("ISO-8859-1");
                        v7 = var13_12;
                        v8 = var10_13++;
                        v9 = ((long)var14_17[0] & 255L) << 56 | ((long)var14_17[1] & 255L) << 48 | ((long)var14_17[2] & 255L) << 40 | ((long)var14_17[3] & 255L) << 32 | ((long)var14_17[4] & 255L) << 24 | ((long)var14_17[5] & 255L) << 16 | ((long)var14_17[6] & 255L) << 8 | (long)var14_17[7] & 255L;
                        v10 = -1;
                        break block15;
                        break;
                    }
lbl85:
                    // 1 sources

                    while (true) {
                        v7[v8] = v11;
                        if (var9_16 < var12_15) ** continue;
                        var11_14 = "\u00ca\u0014\u00a0\u00c89\u00a8\u009a\u00b2R\u009fA\u00e2{\u00e2\u008c5";
                        var12_15 = "\u00ca\u0014\u00a0\u00c89\u00a8\u009a\u00b2R\u009fA\u00e2{\u00e2\u008c5".length();
                        var9_16 = 0;
                        while (true) {
                            var14_17 = var11_14.substring(var9_16, var9_16 += 8).getBytes("ISO-8859-1");
                            v7 = var13_12;
                            v8 = var10_13++;
                            v9 = ((long)var14_17[0] & 255L) << 56 | ((long)var14_17[1] & 255L) << 48 | ((long)var14_17[2] & 255L) << 40 | ((long)var14_17[3] & 255L) << 32 | ((long)var14_17[4] & 255L) << 24 | ((long)var14_17[5] & 255L) << 16 | ((long)var14_17[6] & 255L) << 8 | (long)var14_17[7] & 255L;
                            v10 = 0;
                            break block15;
                            break;
                        }
                        break;
                    }
lbl104:
                    // 1 sources

                    while (true) {
                        v7[v8] = v11;
                        if (var9_16 < var12_15) ** continue;
                        break block16;
                        break;
                    }
                }
                var15_18 = v9;
                var17_19 = var7_10.doFinal(new byte[]{(byte)(var15_18 >>> 56), (byte)(var15_18 >>> 48), (byte)(var15_18 >>> 40), (byte)(var15_18 >>> 32), (byte)(var15_18 >>> 24), (byte)(var15_18 >>> 16), (byte)(var15_18 >>> 8), (byte)var15_18});
                v11 = ((long)var17_19[0] & 255L) << 56 | ((long)var17_19[1] & 255L) << 48 | ((long)var17_19[2] & 255L) << 40 | ((long)var17_19[3] & 255L) << 32 | ((long)var17_19[4] & 255L) << 24 | ((long)var17_19[5] & 255L) << 16 | ((long)var17_19[6] & 255L) << 8 | (long)var17_19[7] & 255L;
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
            fj_0.u = var13_12;
            fj_0.v = new Integer[5];
            fj_0.i = (int)fj_0.c("s", (int)13075, (long)(var27 ^ 4965586289827073811L));
            var2_20 = Cipher.getInstance("DES/CBC/NoPadding");
            v12 = SecretKeyFactory.getInstance("DES");
            v13 = new byte[8];
            v14 = v13;
            v13[0] = (byte)(var27 >>> 56);
            for (var3_21 = 1; var3_21 < 8; ++var3_21) {
                v14 = v14;
                v14[var3_21] = (byte)(var27 << var3_21 * 8 >>> 56);
            }
            break block17;
lbl138:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var2_20.init(2, (Key)v12.generateSecret(new DESKeySpec(v14)), new IvParameterSpec(new byte[8]));
        var4_23 = 7105517341373945477L;
        var6_24 = var2_20.doFinal(new byte[]{(byte)(var4_23 >>> 56), (byte)(var4_23 >>> 48), (byte)(var4_23 >>> 40), (byte)(var4_23 >>> 32), (byte)(var4_23 >>> 24), (byte)(var4_23 >>> 16), (byte)(var4_23 >>> 8), (byte)var4_23});
        ** while (true)
        fj_0.o = var0_22 = ((long)var6_24[0] & 255L) << 56 | ((long)var6_24[1] & 255L) << 48 | ((long)var6_24[2] & 255L) << 40 | ((long)var6_24[3] & 255L) << 32 | ((long)var6_24[4] & 255L) << 24 | ((long)var6_24[5] & 255L) << 16 | ((long)var6_24[6] & 255L) << 8 | (long)var6_24[7] & 255L;
        fj_0.j = fj_0.d("n", (Object)fj_0.b("b", (int)10637, (long)(4224741278931488867L ^ var27)), (Object)fj_0.b("b", (int)32212, (long)(7865902482582553659L ^ var27)), (long)-3582273570640808129L, (long)var27);
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x77B2;
        if (s[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])t.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    t.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/fj", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = r[n2].getBytes("ISO-8859-1");
            fj_0.s[n2] = fj_0.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return s[n2];
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
            throw new RuntimeException("dev/zprestige/prestige/fj" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = fj_0.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fj" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x325F;
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
                throw new RuntimeException("dev/zprestige/prestige/fj", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            fj_0.v[n2] = n3;
        }
        return v[n2];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = fj_0.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fj_0.m(l, l2);
            object = x[n];
            try {
                if (!(object instanceof String)) break block2;
                fj_0.x[n] = clazz = Class.forName(y[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fj_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fj_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fj_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fj_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = x;
        x[0] = "vq7v40}~&9X3s|$vt";
        objectArray[1] = Boolean.TYPE;
        fj_0.y[1] = "java/lang/Boolean";
        objectArray[2] = ":\\K\u0015C],\\NOPJ;\u0017MI\\^*PZ^\u0017I\u0015";
        objectArray[3] = "\u00005<u>\u0018\u000b:-:_\u0016\u00001)`";
        objectArray[4] = "<v?X|/*v:\u0002o8==9\u0004c,,z.\u0013(>\u0010";
        objectArray[5] = "\u007fz=9?-\nZ66.bwB%1'+\u001f";
        objectArray[6] = "\u001bUVOhi\rUS\u0015{~\u001a\u001eP\u0013wj\u000bYG\u0004<}>";
        objectArray[7] = "S\u0000Q\u0002gi& Z\rv&G.Q\u0006r|3";
        objectArray[8] = Void.TYPE;
        fj_0.y[8] = "java/lang/Void";
        objectArray[9] = ">\u000bGH48 \u0003]\u0007W,$";
        objectArray[10] = "Ko\u00120EFUg\b\u007f(\\Mb\u00012\u001fZN`";
        objectArray[11] = "\u000b\u000e{TGx\u0015\u0006a\u001b y\u0004\u001dlA\u0006\u007f";
        objectArray[12] = "ra&'@Ida#}S^s* {_Jbm7l\u0014[A";
        objectArray[13] = "!H\u001egG\u0000Th\u0015hVO5f\u001ecR\u0015A";
        objectArray[14] = "\u0011t*\u0006\u0019\u0004\u0007t/\\\n\u0013\u0010?,Z\u0006\u0007\u0001x;MM\u0012\u001f";
        objectArray[15] = "\u001bChDL'nccK]h\u000fmh@Y2{";
        objectArray[16] = "Ft{\f\u001f$Pt~V\f3G?}P\u0000'VxjGK7NxhL\u0011zrchQ\u0011=Et";
        objectArray[17] = "M4@\u0007Yh[4E]J\u007fL\u007fF[Fk]8QL\r{j";
        objectArray[18] = "D\u0010\u001d^:\u000bD\u0010\n\u00026\u0004^[\n\u001c6\u0011Y*[Dd";
        objectArray[19] = Double.TYPE;
        fj_0.y[19] = "java/lang/Double";
        objectArray[20] = "L?q%#4Z?t\u007f0#Mtwy<7\\3`nw'i";
        objectArray[21] = "\u001c*_U}si\nTZl<\b\u0004_Qhf|";
        objectArray[22] = "\u001bms*B\u0002nMx%SM\u000fCs.W\u0017{";
        objectArray[23] = "(>hHoe#1y\u0007\u0007e->j";
        objectArray[24] = Float.TYPE;
        fj_0.y[24] = "java/lang/Float";
        objectArray[25] = "^naVDBUap\u0019'O@l\u007fr\u0012MQ\u007fc^\u0005@";
        objectArray[26] = "POa\u0004GARQ(gLZMT~\u001eK";
        objectArray[27] = "\feW+y{yE\\$h4\u0018KW/lnl";
        objectArray[28] = "cV%\u0016lA\u0016v.\u0019}\u000ewx%\u0012yT\u0003";
        objectArray[29] = "O\u0003joP\nR\u00162M\u0011\u0007J\u0010";
        objectArray[30] = "w_/;fv\u0002\u007f$4w9cq/?sc\u0017";
        objectArray[31] = "w\u0015h\")p|\u001aymTho\u001dp$";
        objectArray[32] = "y\u007f~\u0014NJ\f_u\u001b_\u0005mQ~\u0010[_\u0019";
        objectArray[33] = "Zm\u0017@PvLm\u0012\u001aCa[&\u0011\u001cOuJa\u0006\u000b\u0004bU";
        objectArray[34] = "q;\u000e\u001eby\u0004\u001b\u0005\u0011s6e\u0015\u000e\u001awl\u0011";
        objectArray[35] = "\u0018\u001c_v_r\u000e\u001cZ,Le\u0019WY*@q\b\u0010N=\u000bf\u0018";
        objectArray[36] = "*`\toe:_@\u0002`tu>N\tkp/J";
        objectArray[37] = "\u0007R\u001b9\u0017d\u0011R\u001ec\u0004s\u0006\u0019\u001de\bg\u0017^\nrCp!";
        objectArray[38] = ";\u0001e<\fYN!n3\u001d\u0016//e8\u0019L[";
        objectArray[39] = "k3\u0015$\u000fk\u001e\u0013\u001e+\u001e$\u007f\u001d\u0015 \u001a~\u000b";
        objectArray[40] = "\u0002Nu\u00074O\tAdHWB\u001cG";
        objectArray[41] = "<\u0003\u001b\f\t\u0007<\u0003\fP\u0005\b&H\fN\u0005\u001d!9\\\u0013T";
        objectArray[42] = "7;k\u001d\u0015\u00117;|A\u0019\u001e-p|_\u0019\u000b*\u0001(\u0007N";
        objectArray[43] = "~iRm:%~iE16*d\"E/6?cS\u0010po";
        objectArray[44] = "[O<>7<MO9d$+Z\u0004:b(?KC-uc+\u000b";
        objectArray[45] = "`8xe\u0017:`8o9\u001b5zso'\u001b }\u0002=}Bg";
        objectArray[46] = "S\u007f\b<K&S\u007f\u001f`G)I4\u001f~G<NEM%\u001f}";
        objectArray[47] = "\u001c\f\u0000\u0012\u0016?\u001c\f\u0017N\u001a0\u0006G\u0017P\u001a%\u00016E\u000bBo";
        objectArray[48] = "\u001aI\u0014&k\u0013\u001aI\u0003zg\u001c\u0000\u0002\u0003dg\t\u0007sQ06H";
        objectArray[49] = "diA\u000fk[za[@\u0004\\|iN\",]z";
        objectArray[50] = Integer.TYPE;
        fj_0.y[50] = "java/lang/Integer";
        objectArray[51] = "R\u001f%2n)Y\u00104}\t1]\f21, ";
        objectArray[52] = "`w.~b\u000fkx?1\u0005\r~s?z>";
        objectArray[53] = "{QLN\u0017)mQI\u0014\u0004>z\u001aJ\u0012\b*k]]\u0005C8Z";
        objectArray[54] = "\u0007/6<}`r\u000f=3l/\u0013\u000168hug";
        objectArray[55] = "\u0001Sj\\^+\u001f[p\u0013#;\u001f";
        objectArray[56] = "\u0015FmvR\u0001`ffyCN\u0001hmrG\u0014u";
        objectArray[57] = "\u000f\u001ee1i4\u0004\u0011t~\u000b7\u000b\u0018";
        objectArray[58] = Long.TYPE;
        fj_0.y[58] = "java/lang/Long";
        objectArray[59] = "\"cp\u001c<SWC{\u0013-\u001c6Mp\u0018)FB";
        objectArray[60] = "G\bQWAmL\u0007@\u0018<x^\u001dB[";
        objectArray[61] = "aGE\u0016@BaGRJLM{\fRTLX|}\u0005\u000b\u001a";
        objectArray[62] = "G`F17bG`Qm;m]+Qs;xZZ\u0000&l;";
        objectArray[63] = "\\4F@c~J4C\u001api]\u007f@\u001c|}L8W\u000b7jv";
        objectArray[64] = "fT^ql[\u0013tU~}\u0014rz^uyN\u0006";
        objectArray[65] = "Zpq4-#Lptn>4[;wh2 J|`\u007fy7q";
        objectArray[66] = "SG\tp\u0003^&g\u0002\u007f\u0012\u0011Gi\tt\u0016K3";
        objectArray[67] = "mU\r8\"\u007f{U\bb1hl\u001e\u000bd=|}Y\u001csvkD";
        objectArray[68] = "@q3 mB5Q8/|\rT_3$xW ";
        objectArray[69] = "\u0004o'\u0002=m\u0002kgU\u0006%Go\u0017\u0005O7A~0\u0017\u0006g\na1\u0006e\"Piik<mHt;\by7@,VQ6/]~5\u0014l'\u0005\u0013";
        objectArray[70] = "9b\\\u0010 ?;c\u0006K\u001fk7\u007f)\u0001ri<\u0003\u0014Dma&q\u001f\u0003\u007f8Z";
        objectArray[71] = "M[z\u0011*F]Xj\tZIP\rw\u0002\r\u001e\u000eZ/n&B\u000e\rm\t`]\u000b\u001a";
        objectArray[72] = "<\u007f\u001az\u0014Q+iP(dP,xA~\bb{?\u001a T5-|D\"\u000bQ:b\u0018sd";
        objectArray[73] = "\u000eeo#5\u001fL#krN\u001e\u001d'vt\",J`-*q{\u001c#s(!\u001f\u000b=/yN";
        objectArray[74] = "8/\u001c\u0006wx/9VT\u0007y((G\u0002kK|d\u0018T6\u001c)lAU\u007f#?4^\b\u0007!#eJ^?d<;De";
        objectArray[75] = "<R%\u000bN\u0018n\u0013x\u0007_u{\u0003 \u0007N2kj6EQ\u0010y\u0018=\u0002CI\u0005S|\u001bR\u0018h\u0001=F^\t\u0005";
        objectArray[76] = "!P\u0007\u0007\u0000\"'TGP;jbPvT\u000b`xA\u0015\u0011Qh ,L^IurO\t\u0004A-\u001f\u0016F\u001c\\\u007f|S\u001c\u0014\u0004\u0012";
        objectArray[77] = "\u0011mLF\u0011[\u0017i\f\u0011*\u0004Bm=\u0015\u001a\u0019H|^P@\u0011\u0010\u0011\u0007\u001fX\fBrBEPT/";
        objectArray[78] = "o~Tz\u0014\u0010iz\u0014-/C<s~~S h8\u0018n@P?x\u001c#^ ";
        objectArray[79] = "2L'+\u000f^4Hg|4\u0010eT+/On3^<#PS2\\2+4";
        objectArray[80] = "6@\u001b\u001e$'&C\u000b\u0006T(+\u0016\u0016\r\u0003\u007fuFOamx0BOXi47GL";
        objectArray[81] = "\u0017+n[\bh_mo[QYKy+\n\u000e5y*oTTd.p5\u0011\u0017=Iwh[\u0012YJv,\u0014\r>M+f\u0011i`\u0011-f\u000bX(W,fRi";
        objectArray[82] = "l{r_8e.=v\u000eCd\u007f9k\b/V(~0Uz\u0001~=nT,ei#2\u0005C";
        objectArray[83] = "PU&V/U\u0002Dt\u000fRF9\u0000sW\"CS\b{\u00063\u00139H)T;UHYcR0/";
        objectArray[84] = "pn\u0018\u001bhLrp_\u0013\u0007\u0012&p$\u0018w\u000eO2_\u001ey\u00032k]M{r";
        objectArray[85] = "jc\b/*28:K+M7Z=]t=705U%,gZ4Pt)<3f\t7-[";
        objectArray[86] = "\u0012}\u0000u\u0016XP;\u0004$mY\u0001?\u0019\"\u0001kUsFt]<\u0000{\u001fu\u0015\u0003\u0016#\u0000(m";
        objectArray[87] = "zs1?\u001er!,htq$\u0010v\u007f)\u001a5+y6<\u0017";
        objectArray[88] = "Nu\f:gvX-\u0013g\u001f'C \u000efHp\u0019pS\ns1Gv\u0005nd/\u001b'";
        objectArray[89] = "\u0016M\b(\b @\u001d\u0016/y9{\u001a\u001e.\t+\u0011\u0012\u0016\u007f\u0018{{\u001e\u0012 \u0014|C[\r~\u001aG";
        objectArray[90] = "'`l\nm\"18sW\u0015x&$j]yJr`1\u0003\u0015q3=1Uqf-a`:ye.ce^n{r2\nVmxp7nAs$!Xf\u0002s-3gpZlpK";
        objectArray[91] = "\u0010\u007f:vl\u0000R9>'\u0017\u0001\u0003=#!{3S\u007fyv\u0017\u0016Q3&:e\u001d\u0016!\u007fF";
        objectArray[92] = "\r4`\tH>\u000b0 ^seW%x\u001as3Uy|[KvJ'r`";
        objectArray[93] = ">'p36\u007f)1:aF~. +7*L~lrlFw;9p?\"`%e!P*c&g$4=}z6K<>~x3/+ \")\\v6wvxd3))xC";
        objectArray[94] = "F%\u001e'\nhX3RI\u000bjF,\u0003 \u0007SH,\u0013$a4\u001c#\u00108\u001cm\u001ep\u0012I";
        objectArray[95] = "y~E\u0002Rb=,\u0015HIS)O\u0016\u0013\u001d#,%\u001e\u001bL2|O\u0016HH(0~R\u001a\u0018b+O";
        objectArray[96] = "c#x6\u001e\u001c`5--.\u000f_~\"r^\b5v*#OX_z.|C_g?1\"Md";
        objectArray[97] = "2m]0\u0011\u000650\u00175u\u000f1uC'\ta2m]0\u0011\u000650\u00175uX<0V\"\u001fP4aGru\u00054tX*\u0012\u0002i>]N";
        objectArray[98] = "-3!#j\u001dr4'#\u000e\u0010Kcwb~\u0017!k\u007f3oGKg{lc@s\"d2m{";
        objectArray[99] = "k\u0010\u007fVF\u0011l\u0011mL>\bRM1^Y\f1\bkV\u0001a";
        objectArray[100] = "\u001a)`\u000f\rZ\u0018g)\u001a7\\c/1YGN\t'9\bV\u001ec+=WZ\u0019[n\"\tT\"";
        objectArray[101] = "~*RW\u0016mo`T\\lsbfnLSnjf\u001cG\u0014|3\u001aT\u000e\u001e{by\u0011T\u0016#\u000f";
        objectArray[102] = "%G\\k2tq\u0002Hx \u0011w\u0007Yz/w`&Be/T}\u001eGa9\u0011%FF:!*lGC?)\u0011";
        objectArray[103] = "Xw-@p|I=+K\ndE+\u0011\u0013:\u007fN*rV`w\u0016G(\u0014asX:q\u00162q)";
        objectArray[104] = "W;2#g=W)!=ZeL-N?erH7<4\"`\u0011K<r(eQ975:<-9q??|_26-f\u0000";
        objectArray[105] = "\t\u001c^Oy*\u001d\u0000\r\u0017\u0015:\u0007\u0013\u0019Di<\u0001~\\Ho5\u0014@^V(={";
        objectArray[106] = "1\u001ecm\bsjDg1b{\n\u0019$<\r-oS5=S\u0011";
        objectArray[107] = "Rw\u0015B_|Qa@Yo`n*O\u0006\u001fh\u0004\"GW\u000e8n.C\b\u0002?Vk\\V\f\u0004";
        objectArray[108] = "Z\u0006duxK\u0003M?x#-\n6fm}]\u000f\\ne,L_6f7y_YP?|\"R\u00026";
        objectArray[109] = "/zRD>;-{\b\u001f\u0001o!g2Bm\u0000>$\u001aJ}r5c\b\u0013\u0001";
        objectArray[110] = "#&i\u0015D<3%y\r43>pd\u0006cda-?jH .b|\u0010T !!";
        objectArray[111] = "6}b9HL6oq'u\u0014%}\u001e%J\u0003)ql.\r\u0011p\rlh\u0007\u00140\u007fg/\u0015ML\u007f!%\u0010\r>tf7Iq";
        objectArray[112] = "'KKt\u0013T\"\u001e\u0002w\r8rrJ%WHr\u0018B-\u0006Y\"r\u0010.RS!I\u0012/\b\b\u001e";
        objectArray[113] = "N\u000ep\u000fzC_Dv\u0004\u0000I^L!fr\rM[0\u0014yJ_\u0002L";
        objectArray[114] = "ab\u0000\"\nNu\u007f\u001b}3Ypn\u0015*d\u0007/8MFL\\.r\n{\r\u0007j=";
        objectArray[115] = "t\u0014I[6F/\u0011K^8w)HK_\f\u001e)R@0kK(\u0015N\u000b\"J-\u0010F0";
        objectArray[116] = "V#\u0015yo\u001b\u00042G \u0012\r?v@xb\rU~H)s]?v\u0017,l\u0010B/\u0015\u007fna";
        objectArray[117] = "z\bG\f\rj{\nI\u0004i69\u000bW\u0004\u00150?f\u0012\b\u00139*X\u0010\u0016T1E";
        objectArray[118] = "l\t[PPZc@N]*\b\u0006B\\\u0004Z\rlJTUK]\u0006\u0016XG\u0013\u0010a@\bY\u0014a";
        objectArray[119] = "I6\u0001q*XO2A&\u0011\t\f\u0007\u0015`m\u0019wsMso\u0019\n*O mh";
        objectArray[120] = "\u0014``T\be\u0016a:\u000f71\u001a}\u0013[O>\u001e\u0001(\u0000E;\u000bs#GWbw";
        objectArray[121] = "Us|VQDUaoHl\u001cNe\u0000W\u000b\u0004]h?B\u0007\u0002H\u0003o_\u0011\u000bD<zS\u0017\u001e/lgE\u001e\u0012\u0010ykC\u000by";
        objectArray[122] = "\"\n8\u0010'\u0000.XeK\u001f\u000e$\u0001tCX\u001eM\nnSm\u001br\u001fbUxp\"\n8\u0010'\u0000.XeK\u001f";
        objectArray[123] = "K%Cv\u000e|I;\u0004~a$\u00190E\u0018[r\u0006'T{\u001e(\u000e\u007f9";
        objectArray[124] = "L\tYI#\u001c\u001e\u0018\u000b\u0010^\u000f%\u0005\u0004Lc\u0003W^\r\tcfE\u0007]J;\u0014\u001e\u000e\u0018J^";
        objectArray[125] = "\u00167\trEPN%\tp&[\u001c>\u0001}&O\u0010*\u0017{\u0019Z\u001c,\u0002\u0010IG\n%\u000e/\\K\f0e\u007fA]\u0005<ZjM[\u0010W\u0004pJB\u0014'\\bJ@w";
        objectArray[126] = "\u001c\bB-\u00196G\r@(\u0017\u0007[ZB;\u0010@K3\u001fz\u0018=F\bV{\u001d8N3\u001f}\u0019lA\u0002Dx\u001biO3";
        objectArray[127] = "tW=:eAb\u000f\"g\u001d\u0010y\u0002?fJG#Rc\nq\u0006}T4nf\u0018!\u0005";
        objectArray[128] = "\u0019J(y\u0005\\N\n,4\u001b,Z\u001dim\u000bJi\u0014q\u0004UBJ\u0011q9T@D\u0019\u0015=WG^\u0001hdU\u0014\\p";
        objectArray[129] = "P\u001bD\u000e)UG\r\u000e\\YT@\u001c\u001f\n5f\u0017[DW`1A\u0018\u001aV6UV\u0006F\u0007Y";
        objectArray[130] = "U@\u0001w>A\u0014\u001bE8E\u0019GW^a)+\u0015\u001b\u0003:E\f\u0015YGj'EOH\u000f\u0006";
        objectArray[131] = "1;93\nQgk'4{]\\l/5\u000bZ6d'd\u001a\n\\:\"w\t]c/.q\u001c6";
        objectArray[132] = "\u001co*yOFN~x 2Uu:\u007fxBP\u001f2w)S\u0000u`t}Y\u0003Nbu'\u0002<";
        objectArray[133] = "?\u000b\u0019B68i[\u0007EG6R\\\u000fD738T\u0007\u0015&cR\n\u0002\u000654m\u001f\u000e\u0000 _";
        objectArray[134] = "_3;n\u0002\u001cE577`\u00188n10\u0010\u0019Rf9a\u0001I8j=>\rN\u0000/\"`\u0003u";
        objectArray[135] = "\f%\u001fUe\n\u000e$E\u000eZ^\u00028oZ'\\o6\u001aL?M\u001d=]^f1";
        objectArray[136] = "T\u0014qje1\u0012Eq:%O\u0004}+?g?\u0001\u0017#76.Q}+<;pP\u0003mm; \u0010}";
        objectArray[137] = "xTK8Z#t\u0006\u0016cb=s\\\u0013z<:sF\u0017\u0006\r4jI\u00119\u00188l\\z";
        objectArray[138] = "Xh.\u0016%\n\u000f(*[;z\b>\u007fkpJ\u00135~\b5\u0010\u001bm\u0013Rw\u0011\u001f#n\u000buB\u001dR";
        objectArray[139] = "D\u0002\u001cIlqX\u0002\u0013\n\u0010nU\u0003\rQ|\\\u0001OT\u000f*\u000bJ\u001dPT|z^\u0001\u0003\f\u0010";
        objectArray[140] = "lkxoCzz3g2;+a>z3l|;n$_W=ehq;@#99";
        objectArray[141] = "2\u001dV7\u0015D0S\u001f\"/UK\u001b\u0007a_P!\u0013\u000f0N\u0000KNU8\u001fDtX\r'B<";
        objectArray[142] = "\u001cK\u0007H~z^\r\u0003\u0019\u0005{\u000f\t\u001e\u001fiIXNEA5\u001e\u000e\r\u001bCjz\u0019\u0013G\u0012\u0005";
        objectArray[143] = "\u001bq6b\u0001u\fg|0qt\u000bvmf\u001dF\\168N\u0011\nrh:\u001eu\u001dl4kq";
        objectArray[144] = "^k*\u0015\u0018jI}`GhkNlq\u0011\u0004Y\u001e/.Mh3E!|MPvZ\u007frv";
        Object[] objectArray2 = objectArray;
        objectArray[145] = "\u0011O\u0002wx{\u0011]\u0011iE#\u0002O~v\";\u0019TAc.=\f?\u0011~84\u0000\u0000\u0004r>!kP\u0019d7-TE\u0015b\"F";
    }

    private boolean d(Object[] objectArray) {
        int n;
        block8: {
            block9: {
                block7: {
                    CallSite callSite;
                    CallSite callSite2;
                    long l;
                    block6: {
                        l = (Long)objectArray[0];
                        l = q ^ l;
                        callSite2 = fj_0.d("n", (long)7977739222328972979L, (long)l);
                        try {
                            try {
                                callSite = fj_0.d("M", (Object)b, (long)7978172484288847098L, (long)l);
                                if (callSite2 != null) break block6;
                                if (callSite == null) break block7;
                            }
                            catch (MatchException matchException) {
                                throw fj_0.d("n", (Object)matchException, (long)7976777762094608183L, (long)l);
                            }
                            callSite = fj_0.d("M", (Object)b, (long)7978172484288847098L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw fj_0.d("n", (Object)matchException, (long)7976777762094608183L, (long)l);
                        }
                    }
                    try {
                        n = callSite instanceof class_408;
                        if (callSite2 != null) break block8;
                        if (n == 0) break block9;
                    }
                    catch (MatchException matchException) {
                        throw fj_0.d("n", (Object)matchException, (long)7976777762094608183L, (long)l);
                    }
                }
                n = 1;
                break block8;
            }
            n = 0;
        }
        return n != 0;
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = fj_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'M' || c == '\u00e2' || c == '\u00fb' || c == 'z') {
                field = fj_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'M' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e2' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00fb' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fj_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'n' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fj" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    private ArrayList a(Object[] objectArray) {
        ArrayList arrayList;
        block12: {
            Object object;
            CallSite callSite;
            g4 g42;
            long l;
            block11: {
                class_1684 class_16842 = (class_1684)objectArray[0];
                l = (Long)objectArray[1];
                long l2 = (l = q ^ l) ^ 0x6488B1B2927BL;
                arrayList = new ArrayList();
                g42 = new g4((class_1937)fj_0.d("M", (Object)b, (long)-8835308501259046536L, (long)l), (class_1309)fj_0.d("M", (Object)b, (long)-8833556379572174933L, (long)l), (class_1799)fj_0.d("\u00d1", (Object)fj_0.d("\u00fb", (long)-8834471429851955582L, (long)l), (long)-8837862081439562025L, (long)l), l2);
                callSite = fj_0.d("n", (long)-8835053229551944346L, (long)l);
                fj_0.d("\u00d1", (Object)((Object)g42), (double)fj_0.d("\u00d1", (Object)class_16842, (long)-8832888987766792178L, (long)l), (double)fj_0.d("\u00d1", (Object)class_16842, (long)-8837547120946407465L, (long)l), (double)fj_0.d("\u00d1", (Object)class_16842, (long)-8832205753244238775L, (long)l), (long)-8832031694108146773L, (long)l);
                fj_0.d("\u00d1", (Object)((Object)g42), (Object)fj_0.d("\u00d1", (Object)class_16842, (long)-8832508098549246968L, (long)l), (long)-8832792969892519628L, (long)l);
                int n = 0;
                while (!g42.a) {
                    try {
                        try {
                            try {
                                object = n++;
                                if (callSite != null || callSite != null) break block11;
                            }
                            catch (MatchException matchException) {
                                throw fj_0.d("n", (Object)matchException, (long)-8834303836817488670L, (long)l);
                            }
                            if (object >= fj_0.c("s", (int)18533, (long)(0x4776F85EDD9D7F47L ^ l))) break;
                        }
                        catch (MatchException matchException) {
                            throw fj_0.d("n", (Object)matchException, (long)-8834303836817488670L, (long)l);
                        }
                        fj_0.d("\u00d1", arrayList, (Object)new class_243((double)fj_0.d("\u00d1", (Object)((Object)g42), (long)-8837508645779680332L, (long)l), (double)fj_0.d("\u00d1", (Object)((Object)g42), (long)-8832963126913069669L, (long)l), (double)fj_0.d("\u00d1", (Object)((Object)g42), (long)-8837928168742405347L, (long)l)), (long)-8835829221189710355L, (long)l);
                        fj_0.d("\u00d1", (Object)((Object)g42), (long)-8836871448139845257L, (long)l);
                        if (callSite == null) continue;
                        break;
                    }
                    catch (MatchException matchException) {
                        throw fj_0.d("n", (Object)matchException, (long)-8834303836817488670L, (long)l);
                    }
                }
                object = g42.a;
            }
            try {
                try {
                    if (callSite != null || object == 0) break block12;
                }
                catch (MatchException matchException) {
                    throw fj_0.d("n", (Object)matchException, (long)-8834303836817488670L, (long)l);
                }
                object = fj_0.d("\u00d1", arrayList, (Object)new class_243((double)fj_0.d("\u00d1", (Object)((Object)g42), (long)-8837508645779680332L, (long)l), (double)fj_0.d("\u00d1", (Object)((Object)g42), (long)-8832963126913069669L, (long)l), (double)fj_0.d("\u00d1", (Object)((Object)g42), (long)-8837928168742405347L, (long)l)), (long)-8835829221189710355L, (long)l);
            }
            catch (MatchException matchException) {
                throw fj_0.d("n", (Object)matchException, (long)-8834303836817488670L, (long)l);
            }
        }
        return arrayList;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Color a(Object[] objectArray) {
        Color color = (Color)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        long l = (Long)objectArray[2];
        l = q ^ l;
        CallSite callSite = fj_0.d("n", (int)0, (int)fj_0.d("n", (int)fj_0.c("s", (int)2765, (long)(0x576D2A28047307AFL ^ l)), (int)((int)((float)fj_0.d("\u00d1", (Object)color, (long)4548655330639759286L, (long)l) * f)), (long)4549798607631731488L, (long)l), (long)4550315084210860713L, (long)l);
        return new Color((int)fj_0.d("\u00d1", (Object)color, (long)4550116483449778852L, (long)l), (int)fj_0.d("\u00d1", (Object)color, (long)4553038568148884610L, (long)l), (int)fj_0.d("\u00d1", (Object)color, (long)4548622745144330089L, (long)l), (int)callSite);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @bP
    public void a(bG bG2) {
        class_310 class_3102;
        CallSite callSite;
        long l;
        long l2;
        block12: {
            block13: {
                block11: {
                    l2 = q ^ 0x7C0E2E266E7CL;
                    l = l2 ^ 0x65A8FDD2EB05L;
                    callSite = fj_0.d("n", (long)1846685037201252773L, (long)l2);
                    try {
                        try {
                            class_3102 = b;
                            if (callSite != null) break block11;
                            if (fj_0.d("M", (Object)class_3102, (long)1846904789028089275L, (long)l2) == null) return;
                        }
                        catch (MatchException matchException) {
                            throw fj_0.d("n", (Object)matchException, (long)1847906120691357729L, (long)l2);
                        }
                        class_3102 = b;
                    }
                    catch (MatchException matchException) {
                        throw fj_0.d("n", (Object)matchException, (long)1847906120691357729L, (long)l2);
                    }
                }
                try {
                    try {
                        if (callSite != null) break block12;
                        if (fj_0.d("M", (Object)class_3102, (long)1849797344791192424L, (long)l2) != null) break block13;
                        return;
                    }
                    catch (MatchException matchException) {
                        throw fj_0.d("n", (Object)matchException, (long)1847906120691357729L, (long)l2);
                    }
                }
                catch (MatchException matchException) {
                    throw fj_0.d("n", (Object)matchException, (long)1847906120691357729L, (long)l2);
                }
            }
            fj_0.d("\u00d1", (Object)this.n, (long)1850161438361147825L, (long)l2);
            class_3102 = b;
        }
        CallSite callSite2 = fj_0.d("\u00d1", (Object)fj_0.d("\u00d1", (Object)fj_0.d("M", (Object)class_3102, (long)1846904789028089275L, (long)l2), (long)1844489517340308219L, (long)l2), (long)1846601006917618656L, (long)l2);
        while (fj_0.d("\u00d1", (Object)callSite2, (long)1850765353684615462L, (long)l2) != false) {
            class_1297 class_12972;
            block14: {
                class_1297 class_12973 = (class_1297)fj_0.d("\u00d1", (Object)callSite2, (long)1847850442012844265L, (long)l2);
                try {
                    class_12972 = class_12973;
                    if (callSite != null) break block14;
                    if (!(class_12972 instanceof class_1684)) continue;
                }
                catch (MatchException matchException) {
                    throw fj_0.d("n", (Object)matchException, (long)1847906120691357729L, (long)l2);
                }
                class_12972 = class_12973;
            }
            class_1684 class_16842 = (class_1684)class_12972;
            Object[] objectArray = new Object[2];
            objectArray[1] = l;
            objectArray[0] = class_16842;
            fj_0.d("\u00d1", (Object)this.n, (Object)fj_0.d("n", (int)fj_0.d("\u00d1", (Object)class_16842, (long)1850111816971989784L, (long)l2), (long)1849004014494760225L, (long)l2), (Object)fj_0.d("\u00d1", (Object)this, (Object)objectArray, (long)1850666985799903242L, (long)l2), (long)1849038672679519653L, (long)l2);
            if (callSite == null) continue;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @bP
    public void a(bt_0 bt_02) {
        Object object;
        class_310 class_3102;
        CallSite callSite;
        long l;
        long l2;
        long l3;
        long l4;
        block29: {
            long l5 = l4 = q ^ 0xC835DFF26F6L;
            l3 = l5 ^ 0x2D24A8236506L;
            l2 = l5 ^ 0x5F6D36A03BEL;
            l = l5 ^ 0x15258E0BA38FL;
            callSite = fj_0.d("n", (long)5848714444442544431L, (long)l4);
            try {
                try {
                    class_3102 = b;
                    if (callSite != null) break block29;
                    if (fj_0.d("M", (Object)class_3102, (long)5849039655380837681L, (long)l4) == null) return;
                }
                catch (MatchException matchException) {
                    throw fj_0.d("n", (Object)matchException, (long)5850004796098826411L, (long)l4);
                }
                class_3102 = b;
            }
            catch (MatchException matchException) {
                throw fj_0.d("n", (Object)matchException, (long)5850004796098826411L, (long)l4);
            }
        }
        try {
            if (fj_0.d("M", (Object)class_3102, (long)5846160976657001442L, (long)l4) == null) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw fj_0.d("n", (Object)matchException, (long)5850004796098826411L, (long)l4);
        }
        fj_0.d("\u00d1", (Object)this.l, (long)5847757591626453307L, (long)l4);
        CallSite callSite2 = fj_0.d("n", (long)5848456206868176897L, (long)l4);
        HashSet hashSet = new HashSet();
        CallSite callSite3 = fj_0.d("\u00d1", (Object)fj_0.d("\u00d1", (Object)fj_0.d("M", (Object)b, (long)5849039655380837681L, (long)l4), (long)5841874590193252977L, (long)l4), (long)5848488545457357674L, (long)l4);
        while (fj_0.d("\u00d1", (Object)callSite3, (long)5847165203994741164L, (long)l4) != false) {
            Object object2;
            reference var24_18;
            float f;
            CallSite callSite4;
            block34: {
                Object object3;
                block35: {
                    Object object4;
                    block39: {
                        Object object5;
                        block37: {
                            block38: {
                                CallSite callSite5;
                                block36: {
                                    int n;
                                    CallSite callSite6;
                                    block33: {
                                        ArrayList arrayList;
                                        block31: {
                                            block32: {
                                                class_1297 class_12972;
                                                block30: {
                                                    class_1297 class_12973 = (class_1297)fj_0.d("\u00d1", (Object)callSite3, (long)5849774193601685603L, (long)l4);
                                                    try {
                                                        try {
                                                            class_12972 = class_12973;
                                                            if (callSite != null) break block30;
                                                            object = class_12972 instanceof class_1684;
                                                            if (callSite != null) return;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw fj_0.d("n", (Object)matchException, (long)5850004796098826411L, (long)l4);
                                                        }
                                                        if (object == false) continue;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw fj_0.d("n", (Object)matchException, (long)5850004796098826411L, (long)l4);
                                                    }
                                                    class_12972 = class_12973;
                                                }
                                                class_1684 class_16842 = (class_1684)class_12972;
                                                callSite4 = fj_0.d("\u00d1", (Object)class_16842, (long)5847530939240381330L, (long)l4);
                                                fj_0.d("\u00d1", hashSet, (Object)fj_0.d("n", (int)callSite4, (long)5846389024564082091L, (long)l4), (long)5841989019866817961L, (long)l4);
                                                fj_0.d("\u00d1", (Object)this.m, (Object)fj_0.d("n", (int)callSite4, (long)5846389024564082091L, (long)l4), (Object)fj_0.d("n", (long)callSite2, (long)5850122124579269797L, (long)l4), (long)5846005905423719888L, (long)l4);
                                                object3 = (ArrayList)((Object)fj_0.d("\u00d1", (Object)this.n, (Object)fj_0.d("n", (int)callSite4, (long)5846389024564082091L, (long)l4), (long)5846573285707958984L, (long)l4));
                                                try {
                                                    arrayList = object3;
                                                    if (callSite != null) break block31;
                                                    if (arrayList != null) break block32;
                                                }
                                                catch (MatchException matchException) {
                                                    throw fj_0.d("n", (Object)matchException, (long)5850004796098826411L, (long)l4);
                                                }
                                                Object[] objectArray = new Object[2];
                                                objectArray[1] = l;
                                                objectArray[0] = class_16842;
                                                object3 = fj_0.d("\u00d1", (Object)this, (Object)objectArray, (long)5846960239814647936L, (long)l4);
                                                fj_0.d("\u00d1", (Object)this.n, (Object)fj_0.d("n", (int)callSite4, (long)5846389024564082091L, (long)l4), (Object)object3, (long)5846633758695656751L, (long)l4);
                                            }
                                            arrayList = object3;
                                        }
                                        try {
                                            callSite6 = fj_0.d("\u00d1", (Object)arrayList, (long)5849107927584513015L, (long)l4);
                                            n = 2;
                                            if (callSite != null) break block33;
                                            if (callSite6 < n) {
                                                continue;
                                            }
                                        }
                                        catch (MatchException matchException) {
                                            throw fj_0.d("n", (Object)matchException, (long)5850004796098826411L, (long)l4);
                                        }
                                        callSite6 = fj_0.d("\u00d1", (Object)object3, (long)5849107927584513015L, (long)l4);
                                        n = 1;
                                    }
                                    f = (float)(callSite6 - n) / 20.0f;
                                    reference var20_15 = callSite2 - fj_0.d("\u00d1", (Object)((Long)((Object)fj_0.d("\u00d1", (Object)this.m, (Object)fj_0.d("n", (int)callSite4, (long)5846389024564082091L, (long)l4), (long)5846573285707958984L, (long)l4))), (long)5849258695752462226L, (long)l4);
                                    CallSite callSite7 = fj_0.d("n", (float)1.0f, (float)((float)var20_15 / 1000.0f), (long)5849617487675561644L, (long)l4);
                                    CallSite callSite8 = fj_0.d("n", (float)1.0f, (float)(f / 1.0f), (long)5849617487675561644L, (long)l4);
                                    var24_18 = callSite7 * callSite8;
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        object2 = (Boolean)((Object)fj_0.d("\u00d1", (Object)this.d, (long)5848111027161953357L, (long)l4));
                                                        if (callSite != null) break block34;
                                                        if (fj_0.d("\u00d1", (Object)object2, (long)5847884538813618589L, (long)l4) == false) break block35;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw fj_0.d("n", (Object)matchException, (long)5850004796098826411L, (long)l4);
                                                    }
                                                    reference cfr_temp_0 = var24_18 - 0.01f;
                                                    callSite5 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                                    if (callSite != null) break block36;
                                                }
                                                catch (MatchException matchException) {
                                                    throw fj_0.d("n", (Object)matchException, (long)5850004796098826411L, (long)l4);
                                                }
                                                if (callSite5 <= 0) break block35;
                                            }
                                            catch (MatchException matchException) {
                                                throw fj_0.d("n", (Object)matchException, (long)5850004796098826411L, (long)l4);
                                            }
                                            object5 = (Boolean)((Object)fj_0.d("\u00d1", (Object)this.a, (long)5848111027161953357L, (long)l4));
                                            if (callSite != null) break block37;
                                        }
                                        catch (MatchException matchException) {
                                            throw fj_0.d("n", (Object)matchException, (long)5850004796098826411L, (long)l4);
                                        }
                                        callSite5 = fj_0.d("\u00d1", (Object)object5, (long)5847884538813618589L, (long)l4);
                                    }
                                    catch (MatchException matchException) {
                                        throw fj_0.d("n", (Object)matchException, (long)5850004796098826411L, (long)l4);
                                    }
                                }
                                try {
                                    if (callSite5 == false) break block38;
                                    Object[] objectArray = new Object[1];
                                    objectArray[0] = l3;
                                    object4 = fj_0.d("n", (Object)objectArray, (long)5849133538602806777L, (long)l4);
                                    break block39;
                                }
                                catch (MatchException matchException) {
                                    throw fj_0.d("n", (Object)matchException, (long)5850004796098826411L, (long)l4);
                                }
                            }
                            object5 = fj_0.d("\u00d1", (Object)this.c, (long)5848111027161953357L, (long)l4);
                        }
                        object4 = (Color)object5;
                    }
                    Color color = object4;
                    CallSite callSite9 = fj_0.d("n", (int)0, (int)fj_0.d("n", (int)fj_0.c("s", (int)14342, (long)(0x7CFB408F75105B69L ^ l4)), (int)((int)((float)fj_0.d("\u00d1", (Object)color, (long)5849735029478664632L, (long)l4) * var24_18)), (long)5848591872778347822L, (long)l4), (long)5848919851027471527L, (long)l4);
                    Color color2 = new Color((int)fj_0.d("\u00d1", (Object)color, (long)5848834777803136170L, (long)l4), (int)fj_0.d("\u00d1", (Object)color, (long)5846194155347161740L, (long)l4), (int)fj_0.d("\u00d1", (Object)color, (long)5841602615901907303L, (long)l4), (int)callSite9);
                    Object[] objectArray = new Object[5];
                    objectArray[4] = l2;
                    objectArray[3] = color2;
                    objectArray[2] = object3;
                    objectArray[1] = bt_02.a;
                    objectArray[0] = bt_02.b;
                    fj_0.d("n", (Object)objectArray, (long)5848022423145608353L, (long)l4);
                }
                object2 = fj_0.d("\u00d1", (Object)object3, (int)(fj_0.d("\u00d1", (Object)object3, (long)5849107927584513015L, (long)l4) - 1), (long)5848236022551449985L, (long)l4);
            }
            class_243 class_2432 = (class_243)object2;
            fj_0.d("\u00d1", (Object)this.l, (Object)fj_0.d("n", (int)callSite4, (long)5846389024564082091L, (long)l4), (Object)new c4(class_2432, f, (float)var24_18), (long)5846633758695656751L, (long)l4);
            if (callSite == null) continue;
        }
        object = fj_0.d("\u00d1", (Object)fj_0.d("\u00d1", (Object)this.m, (long)5846767735035429528L, (long)l4), hashSet, (long)5841278830935283425L, (long)l4);
    }

    @bP
    public void a(bo_0 bo_02) {
        CallSite callSite;
        CallSite callSite2;
        Color color;
        CallSite callSite3;
        CallSite callSite4;
        long l;
        long l2;
        long l3;
        long l4;
        long l5;
        long l6;
        long l7;
        long l8;
        long l9;
        block38: {
            Object object;
            block37: {
                Color color2;
                CallSite callSite5;
                long l10;
                long l11;
                long l12;
                block35: {
                    block36: {
                        block33: {
                            block34: {
                                block31: {
                                    long l13;
                                    block32: {
                                        long l14 = l9 = q ^ 0xB227A015BDCL;
                                        l8 = l14 ^ 0x4BB9BF28F0C3L;
                                        l7 = l14 ^ 0x657B517B7D78L;
                                        l6 = l14 ^ 0x62DE9AE597F0L;
                                        l5 = l14 ^ 0x6EA9A08E3509L;
                                        l13 = l14 ^ 0x18EF78883570L;
                                        l12 = l14 ^ 0x4431682DD95BL;
                                        l4 = l14 ^ 0x744A90C5401L;
                                        l11 = l14 ^ 0x2EBE3D399ECL;
                                        l3 = l14 ^ 0x641E7745DAFAL;
                                        l10 = l14 ^ 0x4B41F63921D2L;
                                        l2 = l14 ^ 0x7FFE38B6664L;
                                        l = l14 ^ 0x3745AEE364E2L;
                                        callSite4 = fj_0.d("n", (long)3170755609843717125L, (long)l9);
                                        try {
                                            callSite5 = fj_0.d("\u00d1", (Object)((Boolean)((Object)fj_0.d("\u00d1", (Object)this.e, (long)3171288813804063079L, (long)l9))), (long)3174434792750081207L, (long)l9);
                                            if (callSite4 != null) break block31;
                                            if (callSite5 != false) break block32;
                                        }
                                        catch (MatchException matchException) {
                                            throw fj_0.d("n", (Object)matchException, (long)3172051460128189825L, (long)l9);
                                        }
                                        return;
                                    }
                                    Object[] objectArray = new Object[1];
                                    objectArray[0] = l13;
                                    callSite5 = fj_0.d("\u00d1", (Object)this, (Object)objectArray, (long)3172592047863510424L, (long)l9);
                                }
                                try {
                                    if (callSite4 != null) break block33;
                                    if (callSite5 != false) break block34;
                                }
                                catch (MatchException matchException) {
                                    throw fj_0.d("n", (Object)matchException, (long)3172051460128189825L, (long)l9);
                                }
                                return;
                            }
                            callSite5 = fj_0.d("\u00d1", (Object)this.l, (long)3172650450852480900L, (long)l9);
                        }
                        try {
                            if (callSite4 != null) break block35;
                            if (callSite5 == false) break block36;
                        }
                        catch (MatchException matchException) {
                            throw fj_0.d("n", (Object)matchException, (long)3172051460128189825L, (long)l9);
                        }
                        return;
                    }
                    callSite5 = fj_0.d("\u00d1", (Object)((Boolean)((Object)fj_0.d("\u00d1", (Object)this.g, (long)3171288813804063079L, (long)l9))), (long)3174434792750081207L, (long)l9);
                }
                callSite3 = callSite5;
                try {
                    color2 = callSite3 != false ? (Color)((Object)fj_0.d("\u00d1", (Object)this.h, (long)3171288813804063079L, (long)l9)) : null;
                }
                catch (MatchException matchException) {
                    throw fj_0.d("n", (Object)matchException, (long)3172051460128189825L, (long)l9);
                }
                color = color2;
                Object[] objectArray = new Object[1];
                objectArray[0] = l12;
                callSite2 = fj_0.d("\u00d1", (Object)fj_0.d("\u00fb", (long)3174959628958294640L, (long)l9), (Object)objectArray, (long)3172732284870723460L, (long)l9);
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l11;
                callSite = fj_0.d("\u00d1", (Object)callSite2, (Object)objectArray2, (long)3187011626202852695L, (long)l9);
                try {
                    try {
                        object = k;
                        if (callSite4 != null) break block37;
                        if (object != null) break block38;
                    }
                    catch (MatchException matchException) {
                        throw fj_0.d("n", (Object)matchException, (long)3172051460128189825L, (long)l9);
                    }
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = l10;
                    objectArray3[0] = j;
                    object = fj_0.d("n", (Object)objectArray3, (long)3174793883335591806L, (long)l9);
                }
                catch (MatchException matchException) {
                    throw fj_0.d("n", (Object)matchException, (long)3172051460128189825L, (long)l9);
                }
            }
            k = object;
        }
        float f = 1.0f;
        float f10 = 16.0f * f;
        float f11 = 3.0f;
        float f12 = 0.5f;
        float f13 = 4.0f;
        float f14 = 3.0f;
        float f15 = 5.0f;
        Color color3 = new Color((int)fj_0.c("s", (int)2765, (long)(0x576D536159C9148BL ^ l9)), (int)fj_0.c("s", (int)2765, (long)(0x576D536159C9148BL ^ l9)), (int)fj_0.c("s", (int)2765, (long)(0x576D536159C9148BL ^ l9)), (int)fj_0.c("s", (int)22995, (long)(0x44C351E52C974797L ^ l9)));
        CallSite callSite6 = fj_0.d("\u00d1", (Object)fj_0.d("\u00d1", (Object)this.l, (long)3173243347584336541L, (long)l9), (long)3172573421430828959L, (long)l9);
        while (fj_0.d("\u00d1", (Object)callSite6, (long)3174838059315229830L, (long)l9) != false) {
            Color color4;
            CallSite callSite7;
            float f16;
            float f17;
            CallSite callSite8;
            float f18;
            reference var49_36;
            CallSite callSite9;
            CallSite callSite10;
            block46: {
                Object object;
                CallSite callSite11;
                float f19;
                block45: {
                    CallSite callSite12;
                    float f20;
                    block44: {
                        Color color5;
                        block42: {
                            block43: {
                                reference v18;
                                CallSite callSite13;
                                c4 c42;
                                block41: {
                                    c4 c43;
                                    block39: {
                                        c42 = (c4)((Object)fj_0.d("\u00d1", (Object)callSite6, (long)3171823880345900361L, (long)l9));
                                        try {
                                            try {
                                                c43 = c42;
                                                if (callSite4 != null) break block39;
                                                if (c43.c <= 0.01f) {
                                                    continue;
                                                }
                                            }
                                            catch (MatchException matchException) {
                                                throw fj_0.d("n", (Object)matchException, (long)3172051460128189825L, (long)l9);
                                            }
                                        }
                                        catch (MatchException matchException) {
                                            throw fj_0.d("n", (Object)matchException, (long)3172051460128189825L, (long)l9);
                                        }
                                        c43 = c42;
                                    }
                                    Object[] objectArray = new Object[2];
                                    objectArray[1] = l4;
                                    objectArray[0] = fj_0.d("\u00d1", (Object)c43.a, (double)0.0, (double)0.6, (double)0.0, (long)3174161647872025231L, (long)l9);
                                    callSite13 = fj_0.d("n", (Object)objectArray, (long)3186591142525537492L, (long)l9);
                                    try {
                                        reference v18 = fj_0.d("M", (Object)callSite13, (long)3172121907153500695L, (long)l9) - 0.0;
                                        v18 = v18 == 0 ? 0 : (v18 < 0 ? -1 : 1);
                                        if (callSite4 != null) break block41;
                                        if (v18 < 0) continue;
                                    }
                                    catch (MatchException matchException) {
                                        throw fj_0.d("n", (Object)matchException, (long)3172051460128189825L, (long)l9);
                                    }
                                    reference v18 = fj_0.d("M", (Object)callSite13, (long)3172121907153500695L, (long)l9) - 1.0;
                                    v18 = v18 == 0 ? 0 : (v18 > 0 ? 1 : -1);
                                }
                                if (v18 >= 0) continue;
                                callSite10 = fj_0.d("n", (Object)fj_0.b("b", (int)16032, (long)(0x2A526E56E885650AL ^ l9)), (Object)new Object[]{fj_0.d("n", (float)c42.b, (long)3171914878830492554L, (long)l9)}, (long)3171161611206274017L, (long)l9);
                                CallSite callSite14 = fj_0.d("\u00d1", (Object)((Float)((Object)fj_0.d("\u00d1", (Object)this.f, (long)3171288813804063079L, (long)l9))), (long)3186318007952957584L, (long)l9);
                                Object[] objectArray = new Object[2];
                                objectArray[1] = l5;
                                objectArray[0] = callSite10;
                                callSite9 = fj_0.d("\u00d1", (Object)callSite2, (Object)objectArray, (long)3187147903450122052L, (long)l9);
                                CallSite callSite15 = fj_0.d("n", (float)f10, (float)callSite9, (long)3188053083159909870L, (long)l9);
                                float f21 = f10 + f11 + f12 + f11 + callSite;
                                var49_36 = callSite15 + 2.0f * f13;
                                f19 = f21 + 2.0f * f14;
                                f18 = (float)fj_0.d("M", (Object)callSite13, (long)3186657897451243253L, (long)l9) / callSite14;
                                float f22 = (float)fj_0.d("M", (Object)callSite13, (long)3173987441832720718L, (long)l9) / callSite14;
                                callSite8 = fj_0.d("\u00d1", (Object)new Matrix4f(), (float)callSite14, (float)callSite14, (float)callSite14, (long)3171947117079951029L, (long)l9);
                                f17 = f18 - var49_36 / 2.0f;
                                f16 = f22 - f19 / 2.0f;
                                f20 = c42.c;
                                try {
                                    try {
                                        color5 = color;
                                        if (callSite4 != null) break block42;
                                        if (color5 != null) break block43;
                                    }
                                    catch (MatchException matchException) {
                                        throw fj_0.d("n", (Object)matchException, (long)3172051460128189825L, (long)l9);
                                    }
                                    callSite12 = null;
                                    break block44;
                                }
                                catch (MatchException matchException) {
                                    throw fj_0.d("n", (Object)matchException, (long)3172051460128189825L, (long)l9);
                                }
                            }
                            color5 = color;
                        }
                        Object[] objectArray = new Object[3];
                        objectArray[2] = l;
                        objectArray[1] = Float.valueOf(f20);
                        objectArray[0] = color5;
                        callSite12 = fj_0.d("n", (Object)objectArray, (long)3187229625007167608L, (long)l9);
                    }
                    callSite11 = callSite12;
                    Object[] objectArray = new Object[3];
                    objectArray[2] = l;
                    objectArray[1] = Float.valueOf(f20);
                    objectArray[0] = color3;
                    callSite7 = fj_0.d("n", (Object)objectArray, (long)3187229625007167608L, (long)l9);
                    color4 = new Color((int)fj_0.c("s", (int)2765, (long)(0x576D536159C9148BL ^ l9)), (int)fj_0.c("s", (int)2765, (long)(0x576D536159C9148BL ^ l9)), (int)fj_0.c("s", (int)2765, (long)(0x576D536159C9148BL ^ l9)), (int)(255.0f * f20));
                    try {
                        try {
                            object = callSite3;
                            if (callSite4 != null) break block45;
                            if (object == false) break block46;
                        }
                        catch (MatchException matchException) {
                            throw fj_0.d("n", (Object)matchException, (long)3172051460128189825L, (long)l9);
                        }
                        float f21 = f20 - 0.3f;
                        object = f21 == 0.0f ? 0 : (f21 > 0.0f ? 1 : -1);
                    }
                    catch (MatchException matchException) {
                        throw fj_0.d("n", (Object)matchException, (long)3172051460128189825L, (long)l9);
                    }
                }
                try {
                    if (object > 0) {
                        Object[] objectArray = new Object[10];
                        objectArray[9] = l7;
                        objectArray[8] = Float.valueOf(f15);
                        objectArray[7] = 5;
                        objectArray[6] = Float.valueOf(f19);
                        objectArray[5] = Float.valueOf((float)var49_36);
                        objectArray[4] = Float.valueOf(f16);
                        objectArray[3] = Float.valueOf(f17);
                        objectArray[2] = callSite8;
                        objectArray[1] = bo_02.b;
                        objectArray[0] = bo_02.a;
                        fj_0.d("n", (Object)objectArray, (long)3187388188271958119L, (long)l9);
                    }
                }
                catch (MatchException matchException) {
                    throw fj_0.d("n", (Object)matchException, (long)3172051460128189825L, (long)l9);
                }
                Object[] objectArray = new Object[10];
                objectArray[9] = l8;
                objectArray[8] = Float.valueOf(f15);
                objectArray[7] = callSite11;
                objectArray[6] = Float.valueOf(f19);
                objectArray[5] = Float.valueOf((float)var49_36);
                objectArray[4] = Float.valueOf(f16);
                objectArray[3] = Float.valueOf(f17);
                objectArray[2] = callSite8;
                objectArray[1] = bo_02.b;
                objectArray[0] = bo_02.a;
                fj_0.d("n", (Object)objectArray, (long)3171346898689552233L, (long)l9);
            }
            float f24 = f18 - f10 / 2.0f;
            float f25 = f16 + f14;
            Object[] objectArray = new Object[8];
            objectArray[7] = l2;
            objectArray[6] = color4;
            objectArray[5] = k;
            objectArray[4] = callSite8;
            objectArray[3] = Float.valueOf(f10);
            objectArray[2] = Float.valueOf(f10);
            objectArray[1] = Float.valueOf(f25);
            objectArray[0] = Float.valueOf(f24);
            fj_0.d("n", (Object)objectArray, (long)3171494851152712902L, (long)l9);
            float f26 = f17 + f13;
            float f27 = f17 + var49_36 - f13;
            float f28 = f25 + f10 + f11;
            Object[] objectArray4 = new Object[7];
            objectArray4[6] = l6;
            objectArray4[5] = callSite7;
            objectArray4[4] = Float.valueOf(f28 + f12);
            objectArray4[3] = Float.valueOf(f27);
            objectArray4[2] = Float.valueOf(f28);
            objectArray4[1] = Float.valueOf(f26);
            objectArray4[0] = callSite8;
            fj_0.d("n", (Object)objectArray4, (long)3170727805868784989L, (long)l9);
            float f29 = f18 - callSite9 / 2.0f;
            float f30 = f28 + f12 + f11;
            Object[] objectArray5 = new Object[6];
            objectArray5[5] = l3;
            objectArray5[4] = color4;
            objectArray5[3] = Float.valueOf(f30);
            objectArray5[2] = Float.valueOf(f29);
            objectArray5[1] = callSite10;
            objectArray5[0] = callSite8;
            fj_0.d("\u00d1", (Object)callSite2, (Object)objectArray5, (long)3173965906874307398L, (long)l9);
            if (callSite4 == null) continue;
        }
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
            case 0 -> 19;
            case 1 -> 31;
            case 2 -> 25;
            case 3 -> 34;
            case 4 -> 55;
            case 5 -> 46;
            case 6 -> 37;
            case 7 -> 22;
            case 8 -> 12;
            case 9 -> 45;
            case 10 -> 5;
            case 11 -> 50;
            case 12 -> 16;
            case 13 -> 14;
            case 14 -> 8;
            case 15 -> 56;
            case 16 -> 7;
            case 17 -> 43;
            case 18 -> 63;
            case 19 -> 26;
            case 20 -> 51;
            case 21 -> 47;
            case 22 -> 29;
            case 23 -> 4;
            case 24 -> 41;
            case 25 -> 17;
            case 26 -> 10;
            case 27 -> 11;
            case 28 -> 21;
            case 29 -> 13;
            case 30 -> 38;
            case 31 -> 18;
            case 32 -> 58;
            case 33 -> 57;
            case 34 -> 53;
            case 35 -> 6;
            case 36 -> 42;
            case 37 -> 3;
            case 38 -> 48;
            case 39 -> 40;
            case 40 -> 24;
            case 41 -> 0;
            case 42 -> 39;
            case 43 -> 27;
            case 44 -> 36;
            case 45 -> 44;
            case 46 -> 61;
            case 47 -> 60;
            case 48 -> 62;
            case 49 -> 52;
            case 50 -> 30;
            case 51 -> 15;
            case 52 -> 9;
            case 53 -> 1;
            case 54 -> 54;
            case 55 -> 2;
            case 56 -> 23;
            case 57 -> 33;
            case 58 -> 20;
            case 59 -> 49;
            case 60 -> 28;
            case 61 -> 59;
            case 62 -> 32;
            default -> 35;
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
        fj_0.y[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = fj_0.m(l, l2);
        Object object = x[n];
        if (object instanceof String) {
            String string = y[n];
            int n2 = string.indexOf(8);
            Class clazz = fj_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fj_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fj_0.g(clazz3, string2, clazz2)) != null) {
                    fj_0.x[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fj_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fj_0.x[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fj_0.n(228484662742915L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = fj_0.m(l, l2);
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
                clazz3 = fj_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fj_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fj_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        fj_0.x[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fj_0.n(228484662742915L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fj_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fj_0.x[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fj_0.n(228484662742915L, 0L);
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

    private boolean lambda$new$0(Boolean bl) {
        long l = q ^ 0x6AA49A9E6E99L;
        return (boolean)fj_0.d("\u00d1", (Object)((Boolean)((Object)fj_0.d("\u00d1", (Object)this.d, (long)1821653106726353954L, (long)l))), (long)1821910725537124850L, (long)l);
    }

    private boolean lambda$new$2(Float f) {
        long l = q ^ 0x4BF6B61E9B05L;
        return (boolean)fj_0.d("\u00d1", (Object)((Boolean)((Object)fj_0.d("\u00d1", (Object)this.e, (long)-1379246578096027202L, (long)l))), (long)-1381308259878722450L, (long)l);
    }

    private boolean lambda$new$1(Color color) {
        Object object;
        block8: {
            block7: {
                CallSite callSite;
                long l;
                block6: {
                    l = q ^ 0x42134F38BBB4L;
                    callSite = fj_0.d("n", (long)-3717580356691020691L, (long)l);
                    try {
                        try {
                            object = fj_0.d("\u00d1", (Object)((Boolean)((Object)fj_0.d("\u00d1", (Object)this.d, (long)-3716904080395736817L, (long)l))), (long)-3718404764820863777L, (long)l);
                            if (callSite != null) break block6;
                            if (object == false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw fj_0.d("n", (Object)matchException, (long)-3716267052738359831L, (long)l);
                        }
                        object = fj_0.d("\u00d1", (Object)((Boolean)((Object)fj_0.d("\u00d1", (Object)this.a, (long)-3716904080395736817L, (long)l))), (long)-3718404764820863777L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw fj_0.d("n", (Object)matchException, (long)-3716267052738359831L, (long)l);
                    }
                }
                try {
                    if (callSite != null) break block8;
                    if (object != false) break block7;
                }
                catch (MatchException matchException) {
                    throw fj_0.d("n", (Object)matchException, (long)-3716267052738359831L, (long)l);
                }
                object = 1;
                break block8;
            }
            object = 0;
        }
        return (boolean)object;
    }

    private boolean lambda$new$3(Boolean bl) {
        long l = q ^ 0x5E057ACFC1E0L;
        return (boolean)fj_0.d("\u00d1", (Object)((Boolean)((Object)fj_0.d("\u00d1", (Object)this.e, (long)-5314534014311689381L, (long)l))), (long)-5318312974336852341L, (long)l);
    }

    private boolean lambda$new$4(Color color) {
        Object object;
        block8: {
            block7: {
                CallSite callSite;
                long l;
                block6: {
                    l = q ^ 0x5A8ECE31F84DL;
                    callSite = fj_0.d("n", (long)-8101526299052378220L, (long)l);
                    try {
                        try {
                            object = fj_0.d("\u00d1", (Object)((Boolean)((Object)fj_0.d("\u00d1", (Object)this.e, (long)-8100849885319353610L, (long)l))), (long)-8098446242608920794L, (long)l);
                            if (callSite != null) break block6;
                            if (object == false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw fj_0.d("n", (Object)matchException, (long)-8100794495017972208L, (long)l);
                        }
                        object = fj_0.d("\u00d1", (Object)((Boolean)((Object)fj_0.d("\u00d1", (Object)this.g, (long)-8100849885319353610L, (long)l))), (long)-8098446242608920794L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw fj_0.d("n", (Object)matchException, (long)-8100794495017972208L, (long)l);
                    }
                }
                try {
                    if (callSite != null) break block8;
                    if (object == false) break block7;
                }
                catch (MatchException matchException) {
                    throw fj_0.d("n", (Object)matchException, (long)-8100794495017972208L, (long)l);
                }
                object = 1;
                break block8;
            }
            object = 0;
        }
        return (boolean)object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fj_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(fj_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(fj_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


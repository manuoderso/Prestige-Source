/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bU;
import dev.zprestige.prestige.bW;
import dev.zprestige.prestige.c9;
import dev.zprestige.prestige.cp_0;
import dev.zprestige.prestige.dy_0;
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
import net.minecraft.class_310;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.ap
 */
public class ap_0 {
    public bU a;
    public bU b;
    public bW c;
    public bW d;
    private int e;
    private int f;
    private static final class_310 g;
    private static final int h;
    private static final int i;
    private static final int j;
    private final float k;
    private final float l;
    private boolean m;
    private final c9 n;
    private long o;
    private static final long p;
    private static final long[] q;
    private static final Integer[] r;
    private static final Map s;
    private static final long t;
    private static final Object[] u;
    private static final String[] v;

    public ap_0(float f, float f10, long l) {
        long l2 = l = p ^ l;
        long l3 = l2 ^ 0x3AD1F3D29A81L;
        long l4 = l2 ^ 0x4FF2296A164CL;
        long l5 = l2 ^ 0xFEF2512F257L;
        long l6 = l2 ^ 0x22A8EB93EEAAL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l3;
        this.a = ap_0.b("\u00c9", (Object)objectArray, (long)-2117099905904276691L, (long)l);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        this.b = ap_0.b("\u00c9", (Object)objectArray2, (long)-2117099905904276691L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l6;
        objectArray3[0] = (int)ap_0.a("n", (int)27186, (long)(0x50D3533050C7EA65L ^ l));
        this.c = ap_0.b("\u00c9", (Object)objectArray3, (long)-2117376184024845048L, (long)l);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l6;
        objectArray4[0] = (int)ap_0.a("n", (int)15263, (long)(0x47DFBA9EAF733BCAL ^ l));
        this.d = ap_0.b("\u00c9", (Object)objectArray4, (long)-2117376184024845048L, (long)l);
        this.m = 0;
        this.o = t;
        this.e = (int)ap_0.b("R", (Object)ap_0.b("R", (Object)g, (long)-2116967388075527080L, (long)l), (long)-2118169348756150381L, (long)l);
        this.f = (int)ap_0.b("R", (Object)ap_0.b("R", (Object)g, (long)-2116967388075527080L, (long)l), (long)-2117583415171531922L, (long)l);
        this.k = f;
        this.l = f10;
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l5;
        ap_0.b("R", (Object)this, (Object)objectArray5, (long)-2118281346965926422L, (long)l);
        Object[] objectArray6 = new Object[4];
        objectArray6[3] = l4;
        objectArray6[2] = this.b.a;
        objectArray6[1] = this::lambda$new$0;
        objectArray6[0] = cp_0.d;
        Object[] objectArray7 = new Object[4];
        objectArray7[3] = l4;
        objectArray7[2] = this.a.a;
        objectArray7[1] = this::lambda$new$1;
        objectArray7[0] = cp_0.d;
        this.n = ap_0.b("R", (Object)ap_0.b("R", (Object)new c9(), (Object)objectArray6, (long)-2117181656022729119L, (long)l), (Object)objectArray7, (long)-2117181656022729119L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        block20: {
                            ap_0.p = hc.a(4070017669677839123L, -8397374905144588416L, MethodHandles.lookup().lookupClass()).a(99025171460606L);
                            v0 = var25 = ap_0.p ^ 89493805841402L;
                            var27_1 = v0 ^ 72220004489585L;
                            var29_2 = v0 ^ 82793497410907L;
                            ap_0.u = new Object[58];
                            ap_0.v = new String[58];
                            ap_0.a();
                            var17_3 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                            v1 = SecretKeyFactory.getInstance("DES");
                            v2 = new byte[8];
                            v3 = v2;
                            v2[0] = (byte)(var25 >>> 56);
                            for (var18_4 = 1; var18_4 < 8; ++var18_4) {
                                v3 = v3;
                                v3[var18_4] = (byte)(var25 << var18_4 * 8 >>> 56);
                            }
                            var17_3.init(2, (Key)v1.generateSecret(new DESKeySpec(v3)), new IvParameterSpec(new byte[8]));
                            var16_5 = new String[4];
                            var22_6 = 0;
                            var21_7 = "q\u0095\u00e2\u00f0\u009c\u0006\u0002_\u0010\u00f8\u0096\u00c0\u0014\u00f3\u001aQP4\u001dYdxn\u00bd\u00b5";
                            var23_8 = "q\u0095\u00e2\u00f0\u009c\u0006\u0002_\u0010\u00f8\u0096\u00c0\u0014\u00f3\u001aQP4\u001dYdxn\u00bd\u00b5".length();
                            var20_9 = 8;
                            var19_10 = -1;
lbl34:
                            // 2 sources

                            while (true) {
                                v4 = ++var19_10;
                                v5 = var21_7.substring(v4, v4 + var20_9);
                                v6 = -1;
                                break block20;
                                break;
                            }
lbl39:
                            // 1 sources

                            while (true) {
                                var16_5[var22_6++] = ap_0.a(var24_11).intern();
                                if ((var19_10 += var20_9) < var23_8) {
                                    var20_9 = var21_7.charAt(var19_10);
                                    ** continue;
                                }
                                var21_7 = "\u00f0\u00ca\u0090\u009d\u008f\u00a7\u0081\u00c3\u00b9\u00eb4#H\u00c3\u00fbn\b\u00cf\u0097\u009en~S\u001e\u0081";
                                var23_8 = "\u00f0\u00ca\u0090\u009d\u008f\u00a7\u0081\u00c3\u00b9\u00eb4#H\u00c3\u00fbn\b\u00cf\u0097\u009en~S\u001e\u0081".length();
                                var20_9 = 16;
                                var19_10 = -1;
lbl48:
                                // 2 sources

                                while (true) {
                                    v7 = ++var19_10;
                                    v5 = var21_7.substring(v7, v7 + var20_9);
                                    v6 = 0;
                                    break block20;
                                    break;
                                }
                                break;
                            }
lbl53:
                            // 1 sources

                            while (true) {
                                var16_5[var22_6++] = ap_0.a(var24_11).intern();
                                if ((var19_10 += var20_9) < var23_8) {
                                    var20_9 = var21_7.charAt(var19_10);
                                    ** continue;
                                }
                                break block21;
                                break;
                            }
                        }
                        var24_11 = var17_3.doFinal(v5.getBytes("ISO-8859-1"));
                        switch (v6) {
                            default: {
                                ** continue;
                            }
                            ** case 0:
lbl65:
                            // 1 sources

                            ** continue;
                        }
                    }
                    ap_0.s = new HashMap<K, V>(13);
                    var5_12 = Cipher.getInstance("DES/CBC/NoPadding");
                    v8 = SecretKeyFactory.getInstance("DES");
                    v9 = new byte[8];
                    v10 = v9;
                    v9[0] = (byte)(var25 >>> 56);
                    for (var6_13 = 1; var6_13 < 8; ++var6_13) {
                        v10 = v10;
                        v10[var6_13] = (byte)(var25 << var6_13 * 8 >>> 56);
                    }
                    var5_12.init(2, (Key)v8.generateSecret(new DESKeySpec(v10)), new IvParameterSpec(new byte[8]));
                    var11_14 = new long[14];
                    var8_15 = 0;
                    var9_16 = "\u00b5u\u00e0\u00b8\u00f2l\u00c0\u00f2K\u00a8\u00d1\u001c\u00bf\u00f0\u00b7\u00d1\u009c\u0016\u00a5\u00a9\u00b2\u00a75\u0006\u00a0ExgU\u00ca\u00ce\u00e9\u00fe|\u00c8\u0098_;\u00eaf/\u00e7\u00fd\u00e7\u00a0\u0019o\u00d7fsr\u0005PC\u00a5\u009f\u000b\u00fdF\u00e0\u0012\u008f\u00e8\u00e8\u0019\u00e8\u00c8\u0091u\f\u0013\u00c8\u00ad\u00d5\u0002S\u000f\u00e2jk\u00deZu\"Z(\u00b7f}\u00d6\u00d7 \u00be\u00d1&\u00c1";
                    var10_17 = "\u00b5u\u00e0\u00b8\u00f2l\u00c0\u00f2K\u00a8\u00d1\u001c\u00bf\u00f0\u00b7\u00d1\u009c\u0016\u00a5\u00a9\u00b2\u00a75\u0006\u00a0ExgU\u00ca\u00ce\u00e9\u00fe|\u00c8\u0098_;\u00eaf/\u00e7\u00fd\u00e7\u00a0\u0019o\u00d7fsr\u0005PC\u00a5\u009f\u000b\u00fdF\u00e0\u0012\u008f\u00e8\u00e8\u0019\u00e8\u00c8\u0091u\f\u0013\u00c8\u00ad\u00d5\u0002S\u000f\u00e2jk\u00deZu\"Z(\u00b7f}\u00d6\u00d7 \u00be\u00d1&\u00c1".length();
                    var7_18 = 0;
                    while (true) {
                        var12_19 = var9_16.substring(var7_18, var7_18 += 8).getBytes("ISO-8859-1");
                        v11 = var11_14;
                        v12 = var8_15++;
                        v13 = ((long)var12_19[0] & 255L) << 56 | ((long)var12_19[1] & 255L) << 48 | ((long)var12_19[2] & 255L) << 40 | ((long)var12_19[3] & 255L) << 32 | ((long)var12_19[4] & 255L) << 24 | ((long)var12_19[5] & 255L) << 16 | ((long)var12_19[6] & 255L) << 8 | (long)var12_19[7] & 255L;
                        v14 = -1;
                        break block22;
                        break;
                    }
lbl102:
                    // 1 sources

                    while (true) {
                        v11[v12] = v15;
                        if (var7_18 < var10_17) ** continue;
                        var9_16 = "I\u0010\u00120D0g\u00e76>\u0006\u00eb\u0010\u00c0\u009e.";
                        var10_17 = "I\u0010\u00120D0g\u00e76>\u0006\u00eb\u0010\u00c0\u009e.".length();
                        var7_18 = 0;
                        while (true) {
                            var12_19 = var9_16.substring(var7_18, var7_18 += 8).getBytes("ISO-8859-1");
                            v11 = var11_14;
                            v12 = var8_15++;
                            v13 = ((long)var12_19[0] & 255L) << 56 | ((long)var12_19[1] & 255L) << 48 | ((long)var12_19[2] & 255L) << 40 | ((long)var12_19[3] & 255L) << 32 | ((long)var12_19[4] & 255L) << 24 | ((long)var12_19[5] & 255L) << 16 | ((long)var12_19[6] & 255L) << 8 | (long)var12_19[7] & 255L;
                            v14 = 0;
                            break block22;
                            break;
                        }
                        break;
                    }
lbl121:
                    // 1 sources

                    while (true) {
                        v11[v12] = v15;
                        if (var7_18 < var10_17) ** continue;
                        break block23;
                        break;
                    }
                }
                var13_20 = v13;
                var15_21 = var5_12.doFinal(new byte[]{(byte)(var13_20 >>> 56), (byte)(var13_20 >>> 48), (byte)(var13_20 >>> 40), (byte)(var13_20 >>> 32), (byte)(var13_20 >>> 24), (byte)(var13_20 >>> 16), (byte)(var13_20 >>> 8), (byte)var13_20});
                v15 = ((long)var15_21[0] & 255L) << 56 | ((long)var15_21[1] & 255L) << 48 | ((long)var15_21[2] & 255L) << 40 | ((long)var15_21[3] & 255L) << 32 | ((long)var15_21[4] & 255L) << 24 | ((long)var15_21[5] & 255L) << 16 | ((long)var15_21[6] & 255L) << 8 | (long)var15_21[7] & 255L;
                switch (v14) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl134:
                    // 1 sources

                    ** continue;
                }
            }
            ap_0.q = var11_14;
            ap_0.r = new Integer[14];
            var0_22 = Cipher.getInstance("DES/CBC/NoPadding");
            v16 = SecretKeyFactory.getInstance("DES");
            v17 = new byte[8];
            v18 = v17;
            v17[0] = (byte)(var25 >>> 56);
            for (var1_23 = 1; var1_23 < 8; ++var1_23) {
                v18 = v18;
                v18[var1_23] = (byte)(var25 << var1_23 * 8 >>> 56);
            }
            break block24;
lbl154:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_22.init(2, (Key)v16.generateSecret(new DESKeySpec(v18)), new IvParameterSpec(new byte[8]));
        var2_24 = 6907151629173976184L;
        var4_25 = var0_22.doFinal(new byte[]{(byte)(var2_24 >>> 56), (byte)(var2_24 >>> 48), (byte)(var2_24 >>> 40), (byte)(var2_24 >>> 32), (byte)(var2_24 >>> 24), (byte)(var2_24 >>> 16), (byte)(var2_24 >>> 8), (byte)var2_24});
        ** while (true)
        ap_0.t = ((long)var4_25[0] & 255L) << 56 | ((long)var4_25[1] & 255L) << 48 | ((long)var4_25[2] & 255L) << 40 | ((long)var4_25[3] & 255L) << 32 | ((long)var4_25[4] & 255L) << 24 | ((long)var4_25[5] & 255L) << 16 | ((long)var4_25[6] & 255L) << 8 | (long)var4_25[7] & 255L;
        ap_0.g = ap_0.b("\u00c9", (long)4703665443156140629L, (long)var25);
        v19 = new Object[2];
        v19[1] = var27_1;
        v19[0] = var16_5[1];
        ap_0.h = (int)ap_0.b("R", (Object)cp_0.d, (Object)v19, (long)4701820632979415896L, (long)var25);
        v20 = new Object[2];
        v20[1] = var27_1;
        v20[0] = var16_5[0];
        ap_0.i = (int)ap_0.b("R", (Object)cp_0.d, (Object)v20, (long)4701820632979415896L, (long)var25);
        v21 = new Object[2];
        v21[1] = var27_1;
        v21[0] = var16_5[3];
        ap_0.j = (int)ap_0.b("R", (Object)cp_0.d, (Object)v21, (long)4701820632979415896L, (long)var25);
        v22 = new Object[3];
        v22[2] = var29_2;
        v22[1] = 0;
        v22[0] = var16_5[2];
        ap_0.b("R", (Object)cp_0.d, (Object)v22, (long)4703129350167916005L, (long)var25);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ap" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ap_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ap_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public void b(Object[] objectArray) {
        block11: {
            ap_0 ap_02;
            long l;
            long l2;
            long l3;
            block10: {
                block9: {
                    Object object;
                    block8: {
                        l3 = (Long)objectArray[0];
                        l2 = (Long)objectArray[1];
                        long l4 = l2 = p ^ l2;
                        long l5 = l4 ^ 0x11FE6356D544L;
                        l = l4 ^ 0x56D014E74ACAL;
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l5;
                        CallSite callSite = ap_0.b("R", (Object)this, (Object)objectArray2, (long)237333093227422936L, (long)l2);
                        CallSite callSite2 = ap_0.b("\u00c9", (long)237882680631161678L, (long)l2);
                        try {
                            try {
                                try {
                                    object = callSite;
                                    if (callSite2 != null) break block8;
                                    if (object != false) break block9;
                                }
                                catch (MatchException matchException) {
                                    throw ap_0.b("\u00c9", (Object)matchException, (long)238114264002333946L, (long)l2);
                                }
                                ap_02 = this;
                                if (callSite2 != null) break block10;
                            }
                            catch (MatchException matchException) {
                                throw ap_0.b("\u00c9", (Object)matchException, (long)238114264002333946L, (long)l2);
                            }
                            long l6 = ap_02.o - l3;
                            object = l6 == 0L ? 0 : (l6 < 0L ? -1 : 1);
                        }
                        catch (MatchException matchException) {
                            throw ap_0.b("\u00c9", (Object)matchException, (long)238114264002333946L, (long)l2);
                        }
                    }
                    if (object == false) break block11;
                }
                ap_02 = this;
            }
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l;
            objectArray3[0] = l3;
            ap_0.b("R", (Object)ap_02, (Object)objectArray3, (long)238497470266846062L, (long)l2);
        }
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ap_0.a(l, l2);
            object = u[n];
            try {
                if (!(object instanceof String)) break block2;
                ap_0.u[n] = clazz = Class.forName(v[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public int b(Object[] objectArray) {
        return this.f;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ap_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ap_0.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private void c(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = (l2 = p ^ l2) ^ 0xDF6E1F43A2BL;
        this.o = l;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        ap_0.b("R", (Object)this.n, (Object)objectArray2, (long)-5534193864545485476L, (long)l2);
    }

    private static Field c(long l, long l2) {
        int n = ap_0.a(l, l2);
        Object object = u[n];
        if (object instanceof String) {
            String string = v[n];
            int n2 = string.indexOf(8);
            Class clazz = ap_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ap_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ap_0.a(clazz3, string2, clazz2)) != null) {
                    ap_0.u[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ap_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ap_0.u[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ap_0.b(2181827977109316L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = ap_0.a(l, l2);
        Object object = u[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = v[n];
                int n3 = string2.indexOf(8);
                clazz3 = ap_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ap_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ap_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        ap_0.u[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ap_0.b(2181827977109316L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ap_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ap_0.u[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ap_0.b(2181827977109316L, 0L);
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public int a(Object[] objectArray) {
        return this.e;
    }

    private static void a() {
        Object[] objectArray = u;
        u[0] = "T\f]Bx\u007fT\fJ\u001etpNGJ\u0000teI6\u001a]%";
        objectArray[1] = "Rc,itDRc;5xKH(;+x^OYiw-\u001c";
        objectArray[2] = "q\u0016SFO_g\u0016V\u001c\\Hp]U\u001aP\\a\u001aB\r\u001bN]";
        objectArray[3] = "\b\u001b\"t/\u0000};){>O\u0000#:|7\u0006h";
        objectArray[4] = "\u0019\u0003)zZK\u000f\u0003, I\\\u0018H/&EH\t\u000f81\u000eZ\r";
        objectArray[5] = "J\u001b\u0011^?4A\u0014\u0000\u0011\\9T\u0019\u000fzi;E\n\u0013V~6";
        objectArray[6] = "\bz\u0003R?\u0014}Z\b].[\u001cT\u0003V*\u0001h";
        objectArray[7] = Void.TYPE;
        ap_0.v[7] = "java/lang/Void";
        objectArray[8] = Integer.TYPE;
        ap_0.v[8] = "java/lang/Integer";
        objectArray[9] = "\u007fI-I\\\u0017iI(\u0013O\u0000~\u0002+\u0015C\u0014oE<\u0002\b\u0004\"";
        objectArray[10] = "y\u0014$SXi\f4/\\I&m:$WM|\u0019";
        objectArray[11] = "dO<\u0003\u0002\u0015\u0011o7\f\u0013Zpa<\u0007\u0017\u0000\u0004";
        objectArray[12] = ">\u0006TcR<(\u0006Q9A+?MR?M?.\nE(\u0006.\u000f";
        objectArray[13] = "\u0016h\u001fK\u0016EcH\u0014D\u0007\n\u0002F\u001fO\u0003Pv";
        objectArray[14] = "|#MIDQj#H\u0013WF}hK\u0015[Rl/\\\u0002\u0010CO";
        objectArray[15] = "\u001a\u000f\bD'ro/\u0003K6=\u000e!\b@2gz";
        objectArray[16] = "\nG**M$\u001cG/p^3\u000b\f,vR'\u001aK;a\u00192:";
        objectArray[17] = "c=}b/c\u0016\u001dvm>,w\u0013}f:v\u0003";
        objectArray[18] = "FQ6c\u0013\u001c3q=l\u0002SR\u007f6g\u0006\t&";
        objectArray[19] = "r#\u0006\u0018]\u000f\u0007\u0003\r\u0017L@f\r\u0006\u001cH\u001a\u0012";
        objectArray[20] = "J\b-\r\u000b;?(&\u0002\u001at^&-\t\u001e.*";
        objectArray[21] = Boolean.TYPE;
        ap_0.v[21] = "java/lang/Boolean";
        objectArray[22] = "n]\\nZakHWnYfdA\\,\u0018QM\u001e\b";
        objectArray[23] = "OJ.Ch4J_%Ck3EV.\u0001*\u0004l\ny";
        objectArray[24] = Float.TYPE;
        ap_0.v[24] = "java/lang/Float";
        objectArray[25] = "}=j5ozk=oo|m|vlipym1{~;ni";
        objectArray[26] = "\u0000\\\u0019\u0005\rgu|\u0012\n\u001c(\u0014r\u0019\u0001\u0018r`";
        objectArray[27] = "uz!a\u0010kpo*a\u0013l\u007ff!#R[V;v";
        objectArray[28] = "a0nl{\u0016\u0014\u0010ecjYu\u001enhn\u0003\u0001";
        objectArray[29] = "\b_\u0014E\u0012\u001e}\u007f\u001fJ\u0003Q\u001cq\u0014A\u0007\u000bh";
        objectArray[30] = "\u00077u\r2@r\u0017~\u0002#\u000f\u0013\u0019u\t'Ug";
        objectArray[31] = "\u0018LEm\u000bG\u0013CT\"jI\u0018HPx";
        objectArray[32] = ".\rMKkF{\u0003\u0004qkM<RR\u001dY\u001az\f\u0005J\u000e\u0019y\nP\tvD;\b\u0005q";
        objectArray[33] = "{\u000ffW\u000b\u001c.\u0000jF3\u0004BW.KR\n \u0012i_Un";
        objectArray[34] = "'%SG\u0016/\u007f:\u000eSqx\u001dk\nA\u001d*wl]S\u0015\u0011!kUNJ{&<GFq";
        objectArray[35] = "\u0016PGf`\fC^\u000e\\`\u0007\u0004\u000fX0RSER\u0006\\kU\u0000UZ:>[Io";
        objectArray[36] = "-%ON3R/%P\u0019J_&G[F$W8\u007f\u0004IJ\r'}S\u00184T-~\u0003'*YstXU#Zx =\u001asW,~@\\8_'\u001a";
        objectArray[37] = "'\u0005\u0004\u0012OEw\fJH?\u0015\u0019\f\fLB\rv\u0010\u0004LY|'\u0005\u0004\u0012OEw\fJH?";
        objectArray[38] = "\u0005By\u0003O,\f^yB0~5F+[MfZZ#[V\u0017\u0005By\u0003O,\f^yB0";
        objectArray[39] = "\u001ds\u0015F\u0007{Mz[\u001cw+#z\u001d\u0018\n3Lf\u0015\u0018\u0011B\u001e'C\u0011\u0013?XlK\u001aw";
        objectArray[40] = "\u0007(q]U#_7,I2v=>-_OlR\"%_T\u001d\u0000csVV`F({]2";
        objectArray[41] = "i/`}!Ci/wlG\u0013\u0000{%z:\tog-z!x=&{s#\u0005{msxG";
        objectArray[42] = "!L^x\u0010]!LIiv\u000fH\u0018\u001b\u007f\u000b\u0017'\u0004\u0013\u007f\u0010f!L^x\u0010]!LIiv";
        objectArray[43] = "t\u001c\u0006q!A \u0018\fvPK\u001e\u0019Gj-Sq\u0005Oj6\"#D\u0019c4_e\u000f\u0011hP";
        objectArray[44] = "\u00054h=\u0003(\u00074wjz%\u000eV|5\u0014-\u0010n :zw\u000fltk\u0004.\u0005o$T\u001a#[e\u007f&\u0013 P1\u001a4\u0013{\u0004nh=\u0010pP\u000b'm\u001d$\u000eva&\u0015/j";
        objectArray[45] = "\u0015S3\\\u0002iDB9\u0003mc\u0010e?Y\u0001P\u0019_\"B\u0017at\u0012;X\u00033\nK1[S\fIJ9QRr\u0010@:\u0001m1MH0[\u0010w\u0006@;?";
        objectArray[46] = "Uz\u0015;R)\u0004k\u001fd=#PL\u0019>Q\u0002No\u001d5W1Zh\u0015\"=qQa\u0016gC([bFX\u0000)ShG&Y#P8xe\u0004+Zb\u0005#O#Q\u0006";
        objectArray[47] = "\u0000##qt:]a!$\f'Tf{s`\u0015\u0005'#*\f\u007f\\}u+r&V~%\u0014";
        objectArray[48] = "A\u001dE8>\tA\u001dR)XYLJB5X\u000f\u0011JW<%IZB\\X";
        objectArray[49] = "\u0013\u0015|xh\u0001\u0013\u0015ki\u000eWzA9\u007fsK\u0015]1\u007fh:G\u001cgvjG\u0001Wo}\u000e";
        objectArray[50] = ".R[%\u0011(\u007fCQz~\"+`L/\u001b %SX(\u00137\u0013CF:\u00037\"\u0014zFC((@\t8\u001a\"+\u00106{\u001b*!\u0011H\"\u0011)q.\u000b#\u0019#pPR)\u001asO\u0013S!\u0010r1JY\"@MrKQ(A3+ARx~pvIX\"\u00036=ASF";
        objectArray[51] = "\u0012{!+\u00192A~>2s9\u0018P33\u0012(\u0011E5?\u000f+\u0006tXr\u00161\u0012&&+\u001c2B\u0019ev\u00148\u0018d#=\u001c3|";
        objectArray[52] = "rV_\u001dp'c\t\n\u001b\u00167\u0012U\u000b\u0017k,}I\u0003\u0017p]/TU\u001e)#v^VN\u0016";
        objectArray[53] = "M~X\u0016;E\u0015a\u0005\u0002\\\u0012wh\u0004\u0014!\n\u0018t\f\u0014:{J5Z\u001d8\u0006\f~R\u0016\\";
        objectArray[54] = "~f~z\"\u0014~fikDE\u00172;}9^x.3}\"/*oet Rl$m\u007fD";
        objectArray[55] = "6']3<6ke_fD+bb\u00051(\u00193\"UgDsjy\u000bi:*`z[V";
        objectArray[56] = "V\u001c\u0004\u000bs7\u0002\u0018\u000e\f\u00028<\u0019E\u0010\u007f%S\u0005M\u0010dT\u0001\u0018\u001b\u0019=*X\u0012\u0018I\u0002";
        Object[] objectArray2 = objectArray;
        objectArray[57] = "z\u0007=\u0012@K\"\u0018`\u0006'\u001c@\u0011a\u0010Z\u0004/\ri\u0010Au-\u00164I\u0019\u000e0\u00051\f'";
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ap_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ce' || c == '\u00e1' || c == '\u00a3' || c == 'i') {
                field = ap_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ce' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e1' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00a3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ap_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'R' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c9' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Method a(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static String a(byte[] byArray) {
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

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private boolean a(Object[] objectArray) {
        int n;
        block26: {
            block27: {
                Object object;
                block24: {
                    CallSite callSite;
                    CallSite callSite2;
                    CallSite callSite3;
                    long l;
                    long l2;
                    block22: {
                        block23: {
                            Object object2;
                            block20: {
                                block21: {
                                    CallSite callSite4;
                                    block18: {
                                        block19: {
                                            l2 = (Long)objectArray[0];
                                            l = (l2 = p ^ l2) ^ 0x3C9C6E3B3C75L;
                                            callSite3 = ap_0.b("\u00c9", (long)3223831956780407998L, (long)l2);
                                            try {
                                                try {
                                                    callSite4 = ap_0.b("R", (Object)g, (long)3223792364497812090L, (long)l2);
                                                    if (callSite3 != null) break block18;
                                                    if (callSite4 != null) break block19;
                                                }
                                                catch (MatchException matchException) {
                                                    throw ap_0.b("\u00c9", (Object)matchException, (long)3223883221311562506L, (long)l2);
                                                }
                                                return false;
                                            }
                                            catch (MatchException matchException) {
                                                throw ap_0.b("\u00c9", (Object)matchException, (long)3223883221311562506L, (long)l2);
                                            }
                                        }
                                        callSite4 = ap_0.b("R", (Object)g, (long)3223792364497812090L, (long)l2);
                                    }
                                    callSite2 = ap_0.b("R", (Object)callSite4, (long)3222592991238367665L, (long)l2);
                                    callSite = ap_0.b("R", (Object)ap_0.b("R", (Object)g, (long)3223792364497812090L, (long)l2), (long)3224267722952602956L, (long)l2);
                                    try {
                                        try {
                                            try {
                                                object2 = callSite2;
                                                if (callSite3 != null) break block20;
                                                if (object2 <= 0) break block21;
                                            }
                                            catch (MatchException matchException) {
                                                throw ap_0.b("\u00c9", (Object)matchException, (long)3223883221311562506L, (long)l2);
                                            }
                                            object = callSite;
                                            if (callSite3 != null) break block22;
                                        }
                                        catch (MatchException matchException) {
                                            throw ap_0.b("\u00c9", (Object)matchException, (long)3223883221311562506L, (long)l2);
                                        }
                                        if (object > 0) break block23;
                                    }
                                    catch (MatchException matchException) {
                                        throw ap_0.b("\u00c9", (Object)matchException, (long)3223883221311562506L, (long)l2);
                                    }
                                }
                                object2 = 0;
                            }
                            return (boolean)object2;
                        }
                        object = this.e;
                    }
                    try {
                        block25: {
                            try {
                                try {
                                    try {
                                        if (callSite3 != null) break block24;
                                        if (object != callSite2) break block25;
                                    }
                                    catch (MatchException matchException) {
                                        throw ap_0.b("\u00c9", (Object)matchException, (long)3223883221311562506L, (long)l2);
                                    }
                                    n = this.f;
                                    if (callSite3 != null) break block26;
                                }
                                catch (MatchException matchException) {
                                    throw ap_0.b("\u00c9", (Object)matchException, (long)3223883221311562506L, (long)l2);
                                }
                                if (n == callSite) break block27;
                            }
                            catch (MatchException matchException) {
                                throw ap_0.b("\u00c9", (Object)matchException, (long)3223883221311562506L, (long)l2);
                            }
                        }
                        this.e = (int)callSite2;
                        this.f = (int)callSite;
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l;
                        ap_0.b("R", (Object)this, (Object)objectArray2, (long)3222441144254940104L, (long)l2);
                        object = 1;
                    }
                    catch (MatchException matchException) {
                        throw ap_0.b("\u00c9", (Object)matchException, (long)3223883221311562506L, (long)l2);
                    }
                }
                return (boolean)object;
            }
            n = 0;
        }
        return n != 0;
    }

    private void a(Object[] objectArray) {
        Object object;
        long l;
        block4: {
            long l2;
            long l3;
            long l4;
            long l5;
            block5: {
                l = (Long)objectArray[0];
                long l6 = l = p ^ l;
                l5 = l6 ^ 0x204FC797948DL;
                l4 = l6 ^ 0x4CFE9C9D5551L;
                l3 = l6 ^ 0x47A58F99E649L;
                l2 = l6 ^ 0x29A493BC8169L;
                CallSite callSite = ap_0.b("\u00c9", (long)-1550350515197371777L, (long)l);
                try {
                    try {
                        object = this.m;
                        if (callSite != null) break block4;
                        if (object == 0) break block5;
                    }
                    catch (MatchException matchException) {
                        throw ap_0.b("\u00c9", (Object)matchException, (long)-1550119206840834613L, (long)l);
                    }
                    ap_0.b("R", (Object)this.c, (long)-1551356011637756531L, (long)l);
                    ap_0.b("R", (Object)this.d, (long)-1551356011637756531L, (long)l);
                }
                catch (MatchException matchException) {
                    throw ap_0.b("\u00c9", (Object)matchException, (long)-1550119206840834613L, (long)l);
                }
            }
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l3;
            objectArray2[0] = (int)ap_0.a("n", (int)15263, (long)(0x47DFDF93CB793329L ^ l));
            this.c = ap_0.b("\u00c9", (Object)objectArray2, (long)-1549532282403308053L, (long)l);
            Object[] objectArray3 = new Object[4];
            objectArray3[3] = l5;
            objectArray3[2] = this.f;
            objectArray3[1] = this.e;
            objectArray3[0] = (int)ap_0.a("n", (int)13873, (long)(0x6BE177413F5D3E89L ^ l));
            ap_0.b("R", (Object)this.c, (Object)objectArray3, (long)-1549798677023515164L, (long)l);
            Object[] objectArray4 = new Object[2];
            objectArray4[1] = l4;
            objectArray4[0] = (int)ap_0.a("n", (int)17178, (long)(0x5FC42772183A4BA8L ^ l));
            ap_0.b("R", (Object)this.c, (Object)objectArray4, (long)-1550968846579645857L, (long)l);
            Object[] objectArray5 = new Object[2];
            objectArray5[1] = l2;
            objectArray5[0] = (int)ap_0.a("n", (int)20225, (long)(0x99BD76B83EE47BBL ^ l));
            ap_0.b("R", (Object)this.c, (Object)objectArray5, (long)-1551468494573127515L, (long)l);
            Object[] objectArray6 = new Object[2];
            objectArray6[1] = l3;
            objectArray6[0] = (int)ap_0.a("n", (int)15263, (long)(0x47DFDF93CB793329L ^ l));
            this.d = ap_0.b("\u00c9", (Object)objectArray6, (long)-1549532282403308053L, (long)l);
            Object[] objectArray7 = new Object[4];
            objectArray7[3] = l5;
            objectArray7[2] = this.f;
            objectArray7[1] = this.e;
            objectArray7[0] = (int)ap_0.a("n", (int)31841, (long)(0x17A4C4A0BC58F4D4L ^ l));
            ap_0.b("R", (Object)this.d, (Object)objectArray7, (long)-1549798677023515164L, (long)l);
            Object[] objectArray8 = new Object[2];
            objectArray8[1] = l4;
            objectArray8[0] = (int)ap_0.a("n", (int)29261, (long)(0x408008BB9ABFFAFDL ^ l));
            ap_0.b("R", (Object)this.d, (Object)objectArray8, (long)-1550968846579645857L, (long)l);
            Object[] objectArray9 = new Object[2];
            objectArray9[1] = l2;
            objectArray9[0] = (int)ap_0.a("n", (int)3124, (long)(0xDD2C5B08190048FL ^ l));
            ap_0.b("R", (Object)this.d, (Object)objectArray9, (long)-1551468494573127515L, (long)l);
            ap_0.b("\u00c9", (int)ap_0.a("n", (int)27643, (long)(0x2F0F47A257E4E34AL ^ l)), (int)this.a.a, (long)-1549262832161062357L, (long)l);
            ap_0.b("\u00c9", (int)ap_0.a("n", (int)28532, (long)(0x52967921A862E7C9L ^ l)), (int)ap_0.a("n", (int)6756, (long)(0x6CCFD179B83992D8L ^ l)), (int)ap_0.a("n", (int)15263, (long)(0x47DFDF93CB793329L ^ l)), (int)this.c.a, (int)0, (long)-1551220869691983486L, (long)l);
            ap_0.b("\u00c9", (int)ap_0.a("n", (int)28532, (long)(0x52967921A862E7C9L ^ l)), (int)this.b.a, (long)-1549262832161062357L, (long)l);
            ap_0.b("\u00c9", (int)ap_0.a("n", (int)28532, (long)(0x52967921A862E7C9L ^ l)), (int)ap_0.a("n", (int)23288, (long)(0x5136973822425241L ^ l)), (int)ap_0.a("n", (int)15263, (long)(0x47DFDF93CB793329L ^ l)), (int)this.d.a, (int)0, (long)-1551220869691983486L, (long)l);
            object = ap_0.a("n", (int)28532, (long)(0x52967921A862E7C9L ^ l));
        }
        ap_0.b("\u00c9", (int)object, (int)0, (long)-1549262832161062357L, (long)l);
        this.m = 1;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ap" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (v[n3] != null) {
            return n3;
        }
        Object object = u[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 58;
            case 1 -> 17;
            case 2 -> 52;
            case 3 -> 19;
            case 4 -> 50;
            case 5 -> 7;
            case 6 -> 0;
            case 7 -> 3;
            case 8 -> 6;
            case 9 -> 39;
            case 10 -> 20;
            case 11 -> 9;
            case 12 -> 41;
            case 13 -> 8;
            case 14 -> 22;
            case 15 -> 63;
            case 16 -> 51;
            case 17 -> 32;
            case 18 -> 37;
            case 19 -> 61;
            case 20 -> 56;
            case 21 -> 31;
            case 22 -> 16;
            case 23 -> 35;
            case 24 -> 2;
            case 25 -> 13;
            case 26 -> 33;
            case 27 -> 45;
            case 28 -> 28;
            case 29 -> 12;
            case 30 -> 10;
            case 31 -> 5;
            case 32 -> 21;
            case 33 -> 15;
            case 34 -> 53;
            case 35 -> 34;
            case 36 -> 46;
            case 37 -> 36;
            case 38 -> 38;
            case 39 -> 4;
            case 40 -> 42;
            case 41 -> 55;
            case 42 -> 30;
            case 43 -> 27;
            case 44 -> 49;
            case 45 -> 26;
            case 46 -> 44;
            case 47 -> 59;
            case 48 -> 25;
            case 49 -> 24;
            case 50 -> 40;
            case 51 -> 29;
            case 52 -> 60;
            case 53 -> 23;
            case 54 -> 43;
            case 55 -> 11;
            case 56 -> 62;
            case 57 -> 1;
            case 58 -> 54;
            case 59 -> 48;
            case 60 -> 18;
            case 61 -> 47;
            case 62 -> 14;
            default -> 57;
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
        ap_0.v[n3] = new String(cArray);
        return n3;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x62C4;
        if (r[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = q[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])s.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    s.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/ap", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ap_0.r[n2] = n3;
        }
        return r[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ap_0.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private void lambda$new$0(dy_0 dy_02) {
        long l = p ^ 0x4DD5C00657D0L;
        long l2 = l ^ 0x43BC3A756893L;
        ap_0.b("\u00c9", (int)ap_0.a("n", (int)26360, (long)(0x4A9EEEE48A69A95FL ^ l)), (long)-5951235657557969154L, (long)l);
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        CallSite callSite = ap_0.b("\u00c9", (Object)objectArray, (long)-5951159615329632836L, (long)l);
        ap_0.b("\u00c9", (int)ap_0.a("n", (int)15263, (long)(0x47DFBFB7424E7439L ^ l)), (int)callSite, (long)-5949406211403848744L, (long)l);
        ap_0.b("\u00c9", (int)h, (float)1.0f, (float)0.0f, (long)-5949518547321909202L, (long)l);
        ap_0.b("\u00c9", (int)i, (float)this.k, (long)-5950069319210291821L, (long)l);
        ap_0.b("\u00c9", (int)j, (float)this.l, (long)-5950069319210291821L, (long)l);
    }

    private void lambda$new$1(dy_0 dy_02) {
        long l = p ^ 0x5E8E67BDDD5AL;
        ap_0.b("\u00c9", (int)ap_0.a("n", (int)8264, (long)(0x56A7D9CF9E0F6561L ^ l)), (long)2874112300957432948L, (long)l);
        ap_0.b("\u00c9", (int)ap_0.a("n", (int)15263, (long)(0x47DFACECE5F5FEB3L ^ l)), (int)this.d.a, (long)2874815854724180306L, (long)l);
        ap_0.b("\u00c9", (int)h, (float)0.0f, (float)1.0f, (long)2874707495895177892L, (long)l);
        ap_0.b("\u00c9", (int)i, (float)this.k, (long)2875275825869924121L, (long)l);
        ap_0.b("\u00c9", (int)j, (float)this.l, (long)2875275825869924121L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ap_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ap_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


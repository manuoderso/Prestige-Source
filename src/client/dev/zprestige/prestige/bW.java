/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10868
 *  net.minecraft.class_2960
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.cz_0;
import dev.zprestige.prestige.dp_0;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.ref.Cleaner;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_10868;
import net.minecraft.class_2960;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class bW
implements AutoCloseable {
    public final int a;
    private final Cleaner.Cleanable b;
    private final int c;
    private volatile boolean d;
    private int e;
    private static final long f;
    private static final String[] g;
    private static final String[] h;
    private static final Map i;
    private static final long[] j;
    private static final Integer[] k;
    private static final Map l;
    private static final Object[] m;
    private static final String[] n;

    public bW(int n, int n2, long l) {
        long l2 = (l = f ^ l) ^ 0x506F226178CBL;
        this(n, n2, true, l2);
    }

    private bW(int n, int n2, boolean bl, long l) {
        l = f ^ l;
        this.d = 0;
        this.c = n;
        this.a = n2;
        this.b = bl ? bW.c("\u00f5", (Object)dp_0.a, (Object)this, () -> bW.lambda$new$1(n2), (long)-893028781548109223L, (long)l) : null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    bW.f = hc.a(3566401977298207448L, 3573849885548245225L, MethodHandles.lookup().lookupClass()).a(203044066729157L);
                    bW.m = new Object[51];
                    bW.n = new String[51];
                    bW.a();
                    bW.i = new HashMap<K, V>(13);
                    var11 = bW.f ^ 111229526013705L;
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
                    var17_5 = " V\u00b5;\u0085\u00e7\u0015\u00bciFB\bD\u00d4\u001aG+\u0011\u0014\u00f7\u009f\u00d8l\u00d8G\u00932B\u000f\u00ccN\u00d6\u00b7\u0092/`\u00fd\u0081\u00cd\u000b\u00af1Z\u00a9\u0081O\u00c0\u0082\u00fby\u009f\u00a7\u00e9\u0082\u0001\u0081\u00e3\u008fS\u0018\u00d2\u0089H\u00a0\u00fd\u009esq\u009fPJ\u00a2\u00b1j\u00b6\u001cF\u00fc,\u00f9\u0018\u00a1\u00c5x\u0015v\u00907\u001e+\u0011\u00c6qc\u00f6\u00e3\u00ff\u00a8\u00a6\u001f\u00f2!\u00ae`\u007f";
                    var19_6 = " V\u00b5;\u0085\u00e7\u0015\u00bciFB\bD\u00d4\u001aG+\u0011\u0014\u00f7\u009f\u00d8l\u00d8G\u00932B\u000f\u00ccN\u00d6\u00b7\u0092/`\u00fd\u0081\u00cd\u000b\u00af1Z\u00a9\u0081O\u00c0\u0082\u00fby\u009f\u00a7\u00e9\u0082\u0001\u0081\u00e3\u008fS\u0018\u00d2\u0089H\u00a0\u00fd\u009esq\u009fPJ\u00a2\u00b1j\u00b6\u001cF\u00fc,\u00f9\u0018\u00a1\u00c5x\u0015v\u00907\u001e+\u0011\u00c6qc\u00f6\u00e3\u00ff\u00a8\u00a6\u001f\u00f2!\u00ae`\u007f".length();
                    var16_7 = 80;
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
                        var20_3[var18_4++] = bW.a(var21_9).intern();
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
                bW.g = var20_3;
                bW.h = new String[2];
                bW.l = new HashMap<K, V>(13);
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
                var6_12 = new long[17];
                var3_13 = 0;
                var4_14 = "\u00a5\u0099\u00f3\u0080L\u00bbm\u0090\u009b\u00c9\u0092\u00b2\u00d76_]=\u00db!\u001fy\u00dd\u00a1gG\u00d9\u00f6f\\\u0089]\u00a9\u00f7o\u00cf+f\u009e\u00d1A\u0098N\u00bep\u000e;\u0095\u0084Lfa2\u00f0D;\u0000w\u00e6\u00cb\u00b1F\u007f_\u00b0\u00e8\u0019\u0083\u0019\u00e6\u001b1/T\u0099\u00a5'Z\u00dd\u00e7\u00bfc%kq0Q%a\u00fdu\u00bc\u00d5_\u00bb\u00ee\u00e5\u008e\u00e1\u00b1)\u00dfk\u00a1\u0087L\u009bl\u00d9\u009e\u00b0s+\u00a8J^S\u00bb\u00b7\u00fc\u00aa";
                var5_15 = "\u00a5\u0099\u00f3\u0080L\u00bbm\u0090\u009b\u00c9\u0092\u00b2\u00d76_]=\u00db!\u001fy\u00dd\u00a1gG\u00d9\u00f6f\\\u0089]\u00a9\u00f7o\u00cf+f\u009e\u00d1A\u0098N\u00bep\u000e;\u0095\u0084Lfa2\u00f0D;\u0000w\u00e6\u00cb\u00b1F\u007f_\u00b0\u00e8\u0019\u0083\u0019\u00e6\u001b1/T\u0099\u00a5'Z\u00dd\u00e7\u00bfc%kq0Q%a\u00fdu\u00bc\u00d5_\u00bb\u00ee\u00e5\u008e\u00e1\u00b1)\u00dfk\u00a1\u0087L\u009bl\u00d9\u009e\u00b0s+\u00a8J^S\u00bb\u00b7\u00fc\u00aa".length();
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
                    var4_14 = "b\u0018\t\u0083\u0017\u001b\u008fr\u00e1{J3\u00af\u001cB\u00d5";
                    var5_15 = "b\u0018\t\u0083\u0017\u001b\u008fr\u00e1{J3\u00af\u001cB\u00d5".length();
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
        bW.j = var6_12;
        bW.k = new Integer[17];
    }

    public void e(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l = f ^ l;
        long l3 = l2 ^ 0x3466E140335FL;
        long l4 = l2 ^ 0x3A5A56A023FEL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        CallSite callSite = bW.c("\u00f5", (Object)this, (Object)objectArray2, (long)-7866212510406948979L, (long)l);
        bW.c("\u00c2", (int)this.c, (int)bW.b("c", (int)9700, (long)(0xC63CB5705DBE556L ^ l)), (int)n, (long)-7863354015714452252L, (long)l);
        bW.c("\u00c2", (int)this.c, (int)bW.b("c", (int)656, (long)(0x6708DB0FCA23C22EL ^ l)), (int)n, (long)-7863354015714452252L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = (int)callSite;
        bW.c("\u00f5", (Object)this, (Object)objectArray3, (long)-7864626252655816325L, (long)l);
    }

    public void b(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l = f ^ l;
        long l3 = l2 ^ 0x513CEE61E767L;
        long l4 = l2 ^ 0x5F005981F7C6L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        CallSite callSite = bW.c("\u00f5", (Object)this, (Object)objectArray2, (long)5111018487205335989L, (long)l);
        bW.c("\u00c2", (int)this.c, (int)bW.b("c", (int)15896, (long)(0x327F29B2C38CAA95L ^ l)), (int)n, (long)5109233125516576988L, (long)l);
        bW.c("\u00c2", (int)this.c, (int)bW.b("c", (int)9931, (long)(0x79368831347D325EL ^ l)), (int)n, (long)5109233125516576988L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = (int)callSite;
        bW.c("\u00f5", (Object)this, (Object)objectArray3, (long)5108024591496561987L, (long)l);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/bW" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = bW.a(l, l2);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                bW.m[n] = clazz = Class.forName(bW.n[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = bW.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x526E;
        if (k[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = j[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])bW.l.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    bW.l.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/bW", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            bW.k[n2] = n3;
        }
        return k[n2];
    }

    public static bW b(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = (l = f ^ l) ^ 0x2B4F57979FF6L;
        return new bW(n, n2, false, l2);
    }

    private int b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = f ^ l) ^ 0x6CE5C06B21F6L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = this.c;
        CallSite callSite = bW.c("\u00c2", (int)bW.c("\u00f5", (Object)this, (Object)objectArray2, (long)5255430563358155129L, (long)l), (long)5254574029806380972L, (long)l);
        bW.c("\u00c2", (int)this.c, (int)this.a, (long)5253538957738729769L, (long)l);
        return (int)callSite;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = bW.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = bW.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = bW.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = bW.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = bW.a(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            String string = bW.n[n];
            int n2 = string.indexOf(8);
            Class clazz = bW.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = bW.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = bW.a(clazz3, string2, clazz2)) != null) {
                    bW.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = bW.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        bW.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = bW.b(1753651218083100L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/bW" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public bW c(Object[] objectArray) {
        int n;
        long l;
        long l2;
        long l3;
        int n2;
        int n3;
        block4: {
            block5: {
                n3 = (Integer)objectArray[0];
                n2 = (Integer)objectArray[1];
                l3 = (Long)objectArray[2];
                long l4 = l3 = f ^ l3;
                l2 = l4 ^ 0x521D595128AFL;
                l = l4 ^ 0x35F7115F5A6BL;
                CallSite callSite = bW.c("\u00c2", (long)6223455760805377592L, (long)l3);
                try {
                    try {
                        n = this.d;
                        if (callSite != null) break block4;
                        if (n != 0) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw bW.c("\u00c2", (Object)illegalStateException, (long)6223112401210038276L, (long)l3);
                    }
                    throw new IllegalStateException((String)((Object)bW.a("l", (int)22619, (long)(0x5775AF4C8C228CCDL ^ l3))));
                }
                catch (IllegalStateException illegalStateException) {
                    throw bW.c("\u00c2", (Object)illegalStateException, (long)6223112401210038276L, (long)l3);
                }
            }
            bW.c("\u00f5", (Object)this, (long)6219796213535299884L, (long)l3);
            n = this.c;
        }
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l;
        objectArray2[0] = n;
        CallSite callSite = bW.c("\u00c2", (Object)objectArray2, (long)6223926448182775197L, (long)l3);
        Object[] objectArray3 = new Object[4];
        objectArray3[3] = l2;
        objectArray3[2] = n2;
        objectArray3[1] = n3;
        objectArray3[0] = this.e;
        bW.c("\u00f5", (Object)callSite, (Object)objectArray3, (long)6223674695335328189L, (long)l3);
        return callSite;
    }

    /*
     * Exception decompiling
     */
    public void c(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [7[CASE]], but top level block is 3[TRYBLOCK]
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

    public void f(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = f ^ l;
        bW.c("\u00c2", (int)bW.b("c", (int)26884, (long)(0x777C6B0F0B80BB9FL ^ l)), (long)-9155041257003627467L, (long)l);
        bW.c("\u00c2", (int)bW.b("c", (int)26913, (long)(0x1E63033D78763BB0L ^ l)), (int)this.a, (long)-9151758481568847553L, (long)l);
    }

    public void d(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        int n3 = (Integer)objectArray[2];
        int n4 = (Integer)objectArray[3];
        int n5 = (Integer)objectArray[4];
        int n6 = (Integer)objectArray[5];
        ByteBuffer byteBuffer = (ByteBuffer)objectArray[6];
        long l = (Long)objectArray[7];
        long l2 = l = f ^ l;
        long l3 = l2 ^ 0x1193BD20D092L;
        long l4 = l2 ^ 0x1FAF0AC0C033L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        CallSite callSite = bW.c("\u00f5", (Object)this, (Object)objectArray2, (long)8149470866499249216L, (long)l);
        bW.c("\u00c2", (int)this.c, (int)0, (int)n, (int)n2, (int)n3, (int)n4, (int)n5, (int)n6, (Object)byteBuffer, (long)8148487811444693154L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = (int)callSite;
        bW.c("\u00f5", (Object)this, (Object)objectArray3, (long)8148729034820154038L, (long)l);
    }

    public static bW d(Object[] objectArray) {
        class_2960 class_29602 = (class_2960)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = f ^ l) ^ 0x716D0FEE9861L;
        CallSite callSite = bW.c("\u00f5", (Object)((class_10868)bW.c("\u00f5", (Object)bW.c("\u00f5", (Object)bW.c("\u00f5", (Object)cz_0.b, (long)-860291703487711406L, (long)l), (Object)class_29602, (long)-861175717386649404L, (long)l), (long)-861162964198371187L, (long)l)), (long)-864195838369831856L, (long)l);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = (int)callSite;
        objectArray2[0] = (int)bW.b("c", (int)25482, (long)(0x6B89C41E8A45C5E9L ^ l));
        return bW.c("\u00c2", (Object)objectArray2, (long)-861836867966916391L, (long)l);
    }

    private static Method d(long l, long l2) {
        int n = bW.a(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = bW.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = bW.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = bW.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = bW.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        bW.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = bW.b(1753651218083100L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = bW.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        bW.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = bW.b(1753651218083100L, 0L);
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = bW.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00cb' || c == '\u00e4' || c == '\u00ef' || c == '\u00ff') {
                field = bW.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00cb' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e4' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ef' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = bW.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f5' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static bW a(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = f ^ l) ^ 0x49482C97EA9L;
        return new bW(n, (int)bW.c("\u00c2", (long)-722608468770740915L, (long)l), l2);
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

    /*
     * Exception decompiling
     */
    private int a(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 2[SWITCH]
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

    private void a(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        l = f ^ l;
        bW.c("\u00c2", (int)this.c, (int)n, (long)6361721382741569928L, (long)l);
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = bW.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2C1;
        if (h[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])i.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    i.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/bW", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = g[n2].getBytes("ISO-8859-1");
            bW.h[n2] = bW.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return h[n2];
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (bW.n[n3] != null) {
            return n3;
        }
        Object object = m[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 48;
            case 1 -> 5;
            case 2 -> 7;
            case 3 -> 46;
            case 4 -> 2;
            case 5 -> 42;
            case 6 -> 0;
            case 7 -> 53;
            case 8 -> 55;
            case 9 -> 16;
            case 10 -> 9;
            case 11 -> 8;
            case 12 -> 54;
            case 13 -> 38;
            case 14 -> 33;
            case 15 -> 41;
            case 16 -> 39;
            case 17 -> 57;
            case 18 -> 31;
            case 19 -> 28;
            case 20 -> 6;
            case 21 -> 21;
            case 22 -> 14;
            case 23 -> 60;
            case 24 -> 12;
            case 25 -> 56;
            case 26 -> 3;
            case 27 -> 61;
            case 28 -> 25;
            case 29 -> 17;
            case 30 -> 58;
            case 31 -> 59;
            case 32 -> 1;
            case 33 -> 24;
            case 34 -> 29;
            case 35 -> 15;
            case 36 -> 4;
            case 37 -> 32;
            case 38 -> 51;
            case 39 -> 19;
            case 40 -> 36;
            case 41 -> 20;
            case 42 -> 22;
            case 43 -> 62;
            case 44 -> 47;
            case 45 -> 52;
            case 46 -> 50;
            case 47 -> 27;
            case 48 -> 44;
            case 49 -> 23;
            case 50 -> 49;
            case 51 -> 11;
            case 52 -> 13;
            case 53 -> 37;
            case 54 -> 63;
            case 55 -> 10;
            case 56 -> 40;
            case 57 -> 35;
            case 58 -> 30;
            case 59 -> 26;
            case 60 -> 18;
            case 61 -> 34;
            case 62 -> 43;
            default -> 45;
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
        bW.n[n3] = new String(cArray);
        return n3;
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/bW" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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

    private static void a() {
        Object[] objectArray = m;
        m[0] = "XpJbaZXp]>mUB;] m@EJ\u000f|4\u0005\u000e";
        objectArray[1] = Integer.TYPE;
        bW.n[1] = "java/lang/Integer";
        objectArray[2] = "-[\u000bwnU-[\u001c+bZ7\u0010\u001c5bO0aLh3";
        objectArray[3] = "g\"Jk@rg\"]7L}}i])Lhz\u0018\u000fu\u001b+";
        objectArray[4] = "^\u0010=j5M^\u0010*69BD[*(9WC*{}n\u0014";
        objectArray[5] = "}\u0003\u0010rZM}\u0003\u0007.VBgH\u00070VW`9Ul\u0003\u0010";
        objectArray[6] = "9EE\tT\u00040KF@\u0017\t6KRB\n\u000ft^M_M\u001e(O[\t~\u001b/~M_M\u001e(O";
        objectArray[7] = "^\u0000\\8YjH\u0000YbJ}_KZdFiN\fMs\rxm";
        objectArray[8] = "!9I\u0003\u000f(T\u0019B\f\u001eg5\u0017I\u0007\u001a=A";
        objectArray[9] = "vkwfhf\u0003K|iy)bEwb}s\u0016";
        objectArray[10] = "PRRbBC%rYmS\fD|RfWV0";
        objectArray[11] = Void.TYPE;
        bW.n[11] = "java/lang/Void";
        objectArray[12] = "=-n9\u001eU88e9\u001dR71n{\\e\u001en8";
        objectArray[13] = "mPj[|\u0012{Po\u0001o\u0005l\u001bl\u0007c\u0011}\\{\u0010(\u0006y";
        objectArray[14] = "K\u0015\u000eM\u0016)>5\u0005B\u0007f_;\u000eI\u0003<+";
        objectArray[15] = "\u0001\u007f\u0006\noO\u0017\u007f\u0003P|X\u00004\u0000VpL\u0011s\u0017A;^-";
        objectArray[16] = "\u0014fM<L9aFF3]v\u001c^U4T?t";
        objectArray[17] = ",p\u0012KTAYP\u0019DE\u000e8^\u0012OATL";
        objectArray[18] = "u01t@m\u0000\u0010:{Q\"a\u001e1pUx\u0015";
        objectArray[19] = "#)Z\u0018PR(&KW7R%-K\u0018\u0012m=)X\u001c;F*-\\\r\u0017Q'";
        objectArray[20] = ">)G\u0012ip;<L\u0012jw45GP+@\u001dj\u0013";
        objectArray[21] = "$w\u0001:T$'yY\u0019\u0003>+T\u0002=\u001c/<";
        objectArray[22] = "\\fEHx\u0005WiT\u0007$\fP)pE3\bXbA\r\u0015\u0005Sf]H4\u0005S";
        objectArray[23] = "OFO@\u001adDI^\u000fFmC\tzMQiKBK";
        objectArray[24] = "V;8g\u0017\u0017]4)(v\u0019V?-r";
        objectArray[25] = "\u0010TaN8\t\u001b[p\u0001D\u0010\u0014[vMz\u0000";
        objectArray[26] = "r!&u\u001f'\u0007\u0001-z\u000ehf\u000f&q\n2\u0012";
        objectArray[27] = "Ssrt6\n\u0000zs3\u000fYob u3\t\u000f<5j?3\u0013e*h3T\u0011z/\n";
        objectArray[28] = "h[X(-I;RYo\u0014\u001b0L\u001e;\u0014@hO\u001e:*\u00009TZV";
        objectArray[29] = "% \rI\u0016Mi9\tM+\u001b\u0014\"\u001fH\u0017Ot|\nW\u001bu$\u007f\u0014LGKd.\u000f\b+";
        objectArray[30] = "2BWJdG&\u0002\u0004W\u000bM;1\u0000Sj\\2$\u0006_w_%\u0015kSmG=D\fQrB_HWKpNa\b\u0006P4\"";
        objectArray[31] = "\u0005Eu\u000fz!\u0005Wy0{)\u001dH/\\IzQ\u0014r\u000f\u001e8\u0007M*\fy:\u0018HH";
        objectArray[32] = "\u0015\u0014\t^8V\u0007\u0016\\\u0003\u0003[|\u001eP\u0004{\b\u0010J_\tj1";
        objectArray[33] = "Ii$)Q0\u001a`%nh`uxv(T3\u0015&c7X\tE%},\u00047\u0005tfhh";
        objectArray[34] = "\\\u0011\u000e\u001e!\u000b\u0002\u000f\u001dE@^\b2\u0012S\u0001W\u0010\u0010\u0010B:1\u0010\u001b\u001aM|V\u0012\u0004\u001f/<W\t\u001fCH>H\f}";
        objectArray[35] = ":3U&\u0011\u001di:Ta(O\u0006\"\u0007'\u0014\u001ef|\u00128\u0018$6\u007f\f#D\u001av.\u0017g(";
        objectArray[36] = "'|G)/\u0017-`T$K\u001a-rM%KAu{_/u\u0001$`\u001bC";
        objectArray[37] = "Tu\u001fB&B\nk\f\u0019G\u0017\u0000E\u0003\u0003\u0006\u001d\rv\u0003I\u000bx\u0018\u007f\u000b\u0011{\u001f\u001a`\u000es;\u001e\u0001{R\u00149\u0001\u0004\u0019\u0012\u0015\"\u001aX~\u0010\n'x\u0018\u007f\u000b\u0011{\u001f\u001a`\u000es;\u001e\u0001{R\u00149\u0001\u0004\u0019\u0012\u0015\"\u001aX~\u0010\n'x\u0018\u007f\u000b\u0011{\u001f\u001a`\u000es;\u001e\u0001{R\u00149\u0001\u0004\u0019\u0000Nw\u0003^'\u0017\u0001;\u001ed)R\u0017<\u0014Zi\u0003\fxx";
        objectArray[38] = "KV*ZZ\u0000\u0017\u00062\u0019cT\u001fG2O\u000ffK\u0006i\u0011c\u000b\u0014^+A\u0004[\u0017C*(";
        objectArray[39] = "0\u0016\u001aL>\u0012c\u001f\u001b\u000b\u0007B\f\u0007HM;\u0011lY]R7+0\u0016\u001aL>\u0012c\u001f\u001b\u000b\u0007";
        objectArray[40] = "\tt*+^dZ}u+1l\u000bvwnM{\u001c\u0019v$T&Vi||Aqfyo%VtXyvd\f\u0016\bzu\u007fUp\u0002ffr1";
        objectArray[41] = "<E@N<YlF]OU[k_EP9i:\u001d\u001c\u0006U\u0004zQCF6C\u007f[\u00187n\\9NBG,WhS%";
        objectArray[42] = "5GxIF\u0013wL)T!\u0006cY'CM40\u0015\u007f\u001c\u001dc2I~CQ\u001fk\u0019~N!";
        objectArray[43] = "%0xEl\"v9y\u0002Ur\u0019,,Y1bh\u007f=C/\u001bu)'_,j&8=AU";
        objectArray[44] = "\u0019*\u00062'wG4\u0015iF\"M\f\u0016e*\u0011D6\u000b~< ):\u0011f$qN8\u000ecF1O#\u0015?!3P&w3z)R*Is+2\u0016F";
        objectArray[45] = "'i\r{r6yw\u001e \u0013csY\u0011:Hq}D\u0019#|a-I|6uiu9\u001b4jl\u0017y\u001a/q0p{\u0005*\u0013pq`\u001evtrne|6uiu9\u001b4jl\u0017y\u001a/q0p{\u0005*\u0013pq`\u001evtrne|6uiu9\u001b4jl\u0017y\u001a/q0p{\u0005*\u0013b*5\u0007p-uey\u001aJ#0s~\u0010tcah:|";
        objectArray[46] = ".ibx\u0003Tpwq#b\u0001zI~-\u000f\u0012sY~9\u001e\u0013dhhI\u001e\b{g/.\u001c\u0017~\u0005#u\u0006\u0015r;c$\u001dQ\u001e";
        objectArray[47] = "^\u000e-_\u0015+\u0000\u0010>\u0004t~\n-1\b(|\u001e\u001e!\u0014\u0019jn\u001e:\u000b\u0016-\t\u001c%\u000et";
        objectArray[48] = "#tY@!\u0007p}X\u0007\u0018T\u001fe\u000bA$\u0004\u007f;\u001e^(>#tY@!\u0007p}X\u0007\u0018";
        objectArray[49] = "-cU!&o~jTf\u001f?\u0011r\u0007 #lq,\u0012?/Vmu\r=#1oj\b_";
        Object[] objectArray2 = objectArray;
        objectArray[50] = "PEl'h.\u000e[\u007f|\t{\u0004upfQ}\u001a@x{uy\u001aH\u001djoq\u0002\u0015zhpt`U{sk(\u0007Wdv\th\u0006L\u007f*nj\u0019I\u001d&5p\u001bE#fdk_)";
    }

    @Override
    public void close() {
        block5: {
            Cleaner.Cleanable cleanable;
            long l;
            block4: {
                l = f ^ 0x525D80E1C53AL;
                CallSite callSite = bW.c("\u00c2", (long)4394489135714196634L, (long)l);
                try {
                    try {
                        cleanable = this.b;
                        if (callSite != null) break block4;
                        if (cleanable == null) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw bW.c("\u00c2", (Object)illegalStateException, (long)4395121116852826790L, (long)l);
                    }
                    cleanable = this.b;
                }
                catch (IllegalStateException illegalStateException) {
                    throw bW.c("\u00c2", (Object)illegalStateException, (long)4395121116852826790L, (long)l);
                }
            }
            bW.c("\u00f5", (Object)cleanable, (long)4394751957743213044L, (long)l);
        }
    }

    private static void lambda$new$0(int n) {
        long l = f ^ 0x1A486F2FDC1AL;
        bW.c("\u00c2", (int)n, (long)2729068236685923006L, (long)l);
    }

    private static void lambda$new$1(int n) {
        long l = f ^ 0x6602D515ADA4L;
        long l2 = l ^ 0x696ABEC5DA2FL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = () -> bW.lambda$new$0(n);
        bW.c("\u00c2", (Object)objectArray, (long)6083566233043778515L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bW.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(bW.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(bW.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


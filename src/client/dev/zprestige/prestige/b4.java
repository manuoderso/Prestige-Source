/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aq_0;
import dev.zprestige.prestige.cz_0;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.gK;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.u_0;
import dev.zprestige.prestige.v_0;
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
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class b4
implements cz_0 {
    private final String a;
    private final String c;
    private final dM d;
    public float e;
    public float f;
    public float g;
    public float h;
    public u_0 i;
    public u_0 j;
    public float k;
    public float l;
    private static final float m = 8.0f;
    private boolean n;
    private float o;
    private float p;
    private boolean q;
    private boolean r;
    private boolean s;
    private float t;
    private float u;
    private static final long z;
    private static final String A;
    private static final long[] E;
    private static final Integer[] F;
    private static final Map G;
    private static final Object[] M;
    private static final String[] N;

    public b4(String string, String string2, long l) {
        l = z ^ l;
        this.d = new dM(A, false);
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = u_0.Start;
        this.j = u_0.Start;
        this.k = 0.0f;
        this.l = 0.0f;
        this.n = 0;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0.0f;
        this.u = 0.0f;
        this.a = string;
        this.c = string2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                block12: {
                    b4.z = hc.a(936769360434646026L, 134006796076762896L, MethodHandles.lookup().lookupClass()).a(137095727377335L);
                    b4.M = new Object[95];
                    b4.N = new String[95];
                    b4.a();
                    var11 = b4.z ^ 14794185081490L;
                    var13_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var11 >>> 56);
                    for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                        v2 = v2;
                        v2[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                    }
                    break block12;
lbl22:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var15_3 = var13_1.doFinal("4\u00d0\u0094\u00c5\u00ad\u00d7z\u00ac".getBytes("ISO-8859-1"));
                ** while (true)
                b4.A = b4.a(var15_3).intern();
                b4.G = new HashMap<K, V>(13);
                var0_4 = Cipher.getInstance("DES/CBC/NoPadding");
                v3 = SecretKeyFactory.getInstance("DES");
                v4 = new byte[8];
                v5 = v4;
                v4[0] = (byte)(var11 >>> 56);
                for (var1_5 = 1; var1_5 < 8; ++var1_5) {
                    v5 = v5;
                    v5[var1_5] = (byte)(var11 << var1_5 * 8 >>> 56);
                }
                var0_4.init(2, (Key)v3.generateSecret(new DESKeySpec(v5)), new IvParameterSpec(new byte[8]));
                var6_6 = new long[9];
                var3_7 = 0;
                var4_8 = "\u00ec\u00f6 \u00a0\u00a9\u00f1\u00c0|f,A*p\u00b6\u00e75L\u0086\u008f\b\u0016\u00c8\u00e2\u00fe\u00ce\u00db\u00b0\u00cen\u0000\u0011\u00eeS6\u0092\u0090=\u0007g\u00bb\u00e8e6'\u00d0\u00a7\n\u0093U\u0088\u00aa\u009eSq\u001a\u00f8";
                var5_9 = "\u00ec\u00f6 \u00a0\u00a9\u00f1\u00c0|f,A*p\u00b6\u00e75L\u0086\u008f\b\u0016\u00c8\u00e2\u00fe\u00ce\u00db\u00b0\u00cen\u0000\u0011\u00eeS6\u0092\u0090=\u0007g\u00bb\u00e8e6'\u00d0\u00a7\n\u0093U\u0088\u00aa\u009eSq\u001a\u00f8".length();
                var2_10 = 0;
                while (true) {
                    var7_11 = var4_8.substring(var2_10, var2_10 += 8).getBytes("ISO-8859-1");
                    v6 = var6_6;
                    v7 = var3_7++;
                    v8 = ((long)var7_11[0] & 255L) << 56 | ((long)var7_11[1] & 255L) << 48 | ((long)var7_11[2] & 255L) << 40 | ((long)var7_11[3] & 255L) << 32 | ((long)var7_11[4] & 255L) << 24 | ((long)var7_11[5] & 255L) << 16 | ((long)var7_11[6] & 255L) << 8 | (long)var7_11[7] & 255L;
                    v9 = -1;
                    break block10;
                    break;
                }
lbl71:
                // 1 sources

                while (true) {
                    v6[v7] = v10;
                    if (var2_10 < var5_9) ** continue;
                    var4_8 = "#\u00d9dq\u00f1\u009f\u00f9 $\u00ceF\u00a8\u00ce3\u00f9Q";
                    var5_9 = "#\u00d9dq\u00f1\u009f\u00f9 $\u00ceF\u00a8\u00ce3\u00f9Q".length();
                    var2_10 = 0;
                    while (true) {
                        var7_11 = var4_8.substring(var2_10, var2_10 += 8).getBytes("ISO-8859-1");
                        v6 = var6_6;
                        v7 = var3_7++;
                        v8 = ((long)var7_11[0] & 255L) << 56 | ((long)var7_11[1] & 255L) << 48 | ((long)var7_11[2] & 255L) << 40 | ((long)var7_11[3] & 255L) << 32 | ((long)var7_11[4] & 255L) << 24 | ((long)var7_11[5] & 255L) << 16 | ((long)var7_11[6] & 255L) << 8 | (long)var7_11[7] & 255L;
                        v9 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl90:
                // 1 sources

                while (true) {
                    v6[v7] = v10;
                    if (var2_10 < var5_9) ** continue;
                    break block11;
                    break;
                }
            }
            var8_12 = v8;
            var10_13 = var0_4.doFinal(new byte[]{(byte)(var8_12 >>> 56), (byte)(var8_12 >>> 48), (byte)(var8_12 >>> 40), (byte)(var8_12 >>> 32), (byte)(var8_12 >>> 24), (byte)(var8_12 >>> 16), (byte)(var8_12 >>> 8), (byte)var8_12});
            v10 = ((long)var10_13[0] & 255L) << 56 | ((long)var10_13[1] & 255L) << 48 | ((long)var10_13[2] & 255L) << 40 | ((long)var10_13[3] & 255L) << 32 | ((long)var10_13[4] & 255L) << 24 | ((long)var10_13[5] & 255L) << 16 | ((long)var10_13[6] & 255L) << 8 | (long)var10_13[7] & 255L;
            switch (v9) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl103:
                // 1 sources

                ** continue;
            }
        }
        b4.E = var6_6;
        b4.F = new Integer[9];
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (N[n3] != null) {
            return n3;
        }
        Object object = M[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 55;
            case 1 -> 46;
            case 2 -> 6;
            case 3 -> 15;
            case 4 -> 33;
            case 5 -> 14;
            case 6 -> 51;
            case 7 -> 1;
            case 8 -> 36;
            case 9 -> 39;
            case 10 -> 41;
            case 11 -> 47;
            case 12 -> 3;
            case 13 -> 63;
            case 14 -> 23;
            case 15 -> 45;
            case 16 -> 62;
            case 17 -> 13;
            case 18 -> 2;
            case 19 -> 43;
            case 20 -> 0;
            case 21 -> 38;
            case 22 -> 29;
            case 23 -> 21;
            case 24 -> 35;
            case 25 -> 52;
            case 26 -> 40;
            case 27 -> 61;
            case 28 -> 18;
            case 29 -> 60;
            case 30 -> 17;
            case 31 -> 8;
            case 32 -> 26;
            case 33 -> 56;
            case 34 -> 53;
            case 35 -> 5;
            case 36 -> 58;
            case 37 -> 20;
            case 38 -> 9;
            case 39 -> 22;
            case 40 -> 28;
            case 41 -> 34;
            case 42 -> 16;
            case 43 -> 59;
            case 44 -> 54;
            case 45 -> 48;
            case 46 -> 4;
            case 47 -> 57;
            case 48 -> 30;
            case 49 -> 32;
            case 50 -> 27;
            case 51 -> 49;
            case 52 -> 7;
            case 53 -> 10;
            case 54 -> 37;
            case 55 -> 31;
            case 56 -> 25;
            case 57 -> 19;
            case 58 -> 42;
            case 59 -> 24;
            case 60 -> 11;
            case 61 -> 50;
            case 62 -> 12;
            default -> 44;
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
        b4.N[n3] = new String(cArray);
        return n3;
    }

    public boolean e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = z ^ l;
        return (boolean)b4.f("\u00e0", (Object)((Boolean)((Object)b4.f("\u00e0", (Object)this.d, (long)-6710218817479249207L, (long)l))), (long)-6709259424408483353L, (long)l);
    }

    /*
     * Exception decompiling
     */
    public void e(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [8[TRYBLOCK]], but top level block is 12[SWITCH]
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

    public void i(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        this.g = f;
        this.h = f10;
    }

    public float b(Object[] objectArray) {
        return this.f;
    }

    private static MatchException b(MatchException matchException) {
        return matchException;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5C9F;
        if (F[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = E[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])G.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    G.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/b4", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            b4.F[n2] = n3;
        }
        return F[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = b4.b(n, l);
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
            throw new RuntimeException("dev/zprestige/prestige/b4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public boolean b(Object[] objectArray) {
        return this.n;
    }

    public void b(Object[] objectArray) {
        b4 b42;
        long l;
        long l2;
        long l3;
        block13: {
            long l4;
            block14: {
                block11: {
                    l3 = (Long)objectArray[0];
                    long l5 = l3 = z ^ l3;
                    l2 = l5 ^ 0x4569C9975FF8L;
                    l4 = l5 ^ 0x1164E1568FDAL;
                    l = l5 ^ 0x2F5ADCBF248L;
                    CallSite callSite = b4.f("\u00da", (long)5183721574897123020L, (long)l3);
                    try {
                        if (b4.f("\u00e0", (Object)b, (long)5184202476407267067L, (long)l3) == null) {
                            return;
                        }
                    }
                    catch (MatchException matchException) {
                        throw b4.f("\u00da", (Object)matchException, (long)5184589461354325232L, (long)l3);
                    }
                    try {
                        b4 b43;
                        block12: {
                            try {
                                try {
                                    try {
                                        b43 = this;
                                        if (callSite != null) break block11;
                                        if (b43.g <= 0.0f) break block12;
                                    }
                                    catch (MatchException matchException) {
                                        throw b4.f("\u00da", (Object)matchException, (long)5184589461354325232L, (long)l3);
                                    }
                                    b42 = this;
                                    if (callSite != null) break block13;
                                }
                                catch (MatchException matchException) {
                                    throw b4.f("\u00da", (Object)matchException, (long)5184589461354325232L, (long)l3);
                                }
                                if (!(b42.h <= 0.0f)) break block14;
                            }
                            catch (MatchException matchException) {
                                throw b4.f("\u00da", (Object)matchException, (long)5184589461354325232L, (long)l3);
                            }
                        }
                        this.o = this.e;
                        this.p = this.f;
                        b43 = this;
                    }
                    catch (MatchException matchException) {
                        throw b4.f("\u00da", (Object)matchException, (long)5184589461354325232L, (long)l3);
                    }
                }
                b43.n = 1;
                return;
            }
            this.n = 0;
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l2;
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l4;
            objectArray3[0] = Float.valueOf((float)b4.f("\u00e0", (Object)b4.f("\u00e0", (Object)b, (long)5184202476407267067L, (long)l3), (long)5182071072160909210L, (long)l3) / b4.f("\u00da", (Object)objectArray2, (long)5184278771277970434L, (long)l3));
            b4.f("\u00e0", (Object)this, (Object)objectArray3, (long)5183699335516107390L, (long)l3);
            b42 = this;
        }
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l2;
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l;
        objectArray5[0] = Float.valueOf((float)b4.f("\u00e0", (Object)b4.f("\u00e0", (Object)b, (long)5184202476407267067L, (long)l3), (long)5183638921579427470L, (long)l3) / b4.f("\u00da", (Object)objectArray4, (long)5184278771277970434L, (long)l3));
        b4.f("\u00e0", (Object)b42, (Object)objectArray5, (long)5182545227494922948L, (long)l3);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00aa' || c == '\u00fd' || c == '$' || c == '\u00d8') {
                field = b4.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00aa' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fd' ? lookup.findSetter(clazz, string2, clazz2) : (c == '$' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = b4.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e0' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00da' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = b4.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private void c(Object[] objectArray) {
        block12: {
            Object object;
            CallSite callSite;
            long l;
            float f;
            block10: {
                f = ((Float)objectArray[0]).floatValue();
                l = (Long)objectArray[1];
                l = z ^ l;
                float f10 = this.e + this.g / 2.0f - f / 2.0f;
                callSite = b4.f("\u00da", (long)-3795632485314858385L, (long)l);
                try {
                    float f11;
                    block11: {
                        try {
                            try {
                                reference cfr_temp_0 = b4.f("\u00da", (float)f10, (long)-3798684736540419122L, (long)l) - 8.0f;
                                object = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                if (callSite != null) break block10;
                                if (object > 0) break block11;
                            }
                            catch (MatchException matchException) {
                                throw b4.f("\u00da", (Object)matchException, (long)-3796482023672469421L, (long)l);
                            }
                            this.i = u_0.Center;
                            this.k = f10;
                            if (callSite == null) break block12;
                        }
                        catch (MatchException matchException) {
                            throw b4.f("\u00da", (Object)matchException, (long)-3796482023672469421L, (long)l);
                        }
                    }
                    object = (f11 = f10 - 0.0f) == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                }
                catch (MatchException matchException) {
                    throw b4.f("\u00da", (Object)matchException, (long)-3796482023672469421L, (long)l);
                }
            }
            try {
                block13: {
                    try {
                        if (object >= 0) break block13;
                        this.i = u_0.Start;
                        this.k = this.e;
                        if (callSite == null) break block12;
                    }
                    catch (MatchException matchException) {
                        throw b4.f("\u00da", (Object)matchException, (long)-3796482023672469421L, (long)l);
                    }
                }
                this.i = u_0.End;
                this.k = f - (this.e + this.g);
            }
            catch (MatchException matchException) {
                throw b4.f("\u00da", (Object)matchException, (long)-3796482023672469421L, (long)l);
            }
        }
    }

    private static Method c(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    public boolean c(Object[] objectArray) {
        boolean bl;
        try {
            bl = this.i == u_0.End;
        }
        catch (MatchException matchException) {
            throw b4.b(matchException);
        }
        return bl;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Exception decompiling
     */
    public void n(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [9[TRYBLOCK]], but top level block is 38[SWITCH]
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

    public void h(Object[] objectArray) {
        block36: {
            b4 b42;
            long l;
            long l2;
            long l3;
            block35: {
                float f;
                block33: {
                    CallSite callSite;
                    block34: {
                        long l4;
                        block31: {
                            block32: {
                                block29: {
                                    block30: {
                                        b4 b43;
                                        block28: {
                                            float f10;
                                            float f11;
                                            float f12;
                                            float f13;
                                            b4 b44;
                                            long l5;
                                            float f14;
                                            float f15;
                                            block26: {
                                                block27: {
                                                    f15 = ((Float)objectArray[0]).floatValue();
                                                    f14 = ((Float)objectArray[1]).floatValue();
                                                    l3 = (Long)objectArray[2];
                                                    long l6 = l3 = z ^ l3;
                                                    l2 = l6 ^ 0x62541368A21BL;
                                                    l5 = l6 ^ 0x6666D7B4CDC6L;
                                                    l4 = l6 ^ 0x36593BA97239L;
                                                    l = l6 ^ 0x25C877340FABL;
                                                    callSite = b4.f("\u00da", (long)-5038577510712179921L, (long)l3);
                                                    try {
                                                        try {
                                                            b44 = this;
                                                            if (callSite != null) break block26;
                                                            if (!b44.n) break block27;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw b4.f("\u00da", (Object)matchException, (long)-5039392088035305197L, (long)l3);
                                                        }
                                                        this.o += f15;
                                                        this.p += f14;
                                                        this.e += f15;
                                                        this.f += f14;
                                                        return;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw b4.f("\u00da", (Object)matchException, (long)-5039392088035305197L, (long)l3);
                                                    }
                                                }
                                                b44 = this;
                                            }
                                            try {
                                                b4 b45 = b44;
                                                f13 = b44.k;
                                                f12 = this.i == u_0.End ? -f15 : f15;
                                            }
                                            catch (MatchException matchException) {
                                                throw b4.f("\u00da", (Object)matchException, (long)-5039392088035305197L, (long)l3);
                                            }
                                            try {
                                                b45.k = f13 + f12;
                                                b4 b46 = this;
                                                b4 b47 = b46;
                                                f11 = b46.l;
                                                f10 = this.j == u_0.End ? -f14 : f14;
                                            }
                                            catch (MatchException matchException) {
                                                throw b4.f("\u00da", (Object)matchException, (long)-5039392088035305197L, (long)l3);
                                            }
                                            try {
                                                try {
                                                    b47.l = f11 + f10;
                                                    b43 = this;
                                                    if (callSite != null) break block28;
                                                    Object[] objectArray2 = new Object[1];
                                                    objectArray2[0] = l5;
                                                    b4.f("\u00e0", (Object)b43, (Object)objectArray2, (long)-5039811699004073883L, (long)l3);
                                                    if (b4.f("\u00e0", (Object)b, (long)-5038723609958587624L, (long)l3) == null) break block29;
                                                }
                                                catch (MatchException matchException) {
                                                    throw b4.f("\u00da", (Object)matchException, (long)-5039392088035305197L, (long)l3);
                                                }
                                                b43 = this;
                                            }
                                            catch (MatchException matchException) {
                                                throw b4.f("\u00da", (Object)matchException, (long)-5039392088035305197L, (long)l3);
                                            }
                                        }
                                        try {
                                            try {
                                                float f16 = b43.g - 0.0f;
                                                f = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
                                                if (callSite != null) break block30;
                                                if (f <= 0) break block29;
                                            }
                                            catch (MatchException matchException) {
                                                throw b4.f("\u00da", (Object)matchException, (long)-5039392088035305197L, (long)l3);
                                            }
                                            float f17 = this.h - 0.0f;
                                            f = f17 == 0.0f ? 0 : (f17 < 0.0f ? -1 : 1);
                                        }
                                        catch (MatchException matchException) {
                                            throw b4.f("\u00da", (Object)matchException, (long)-5039392088035305197L, (long)l3);
                                        }
                                    }
                                    try {
                                        if (callSite != null) break block31;
                                        if (f > 0) break block32;
                                    }
                                    catch (MatchException matchException) {
                                        throw b4.f("\u00da", (Object)matchException, (long)-5039392088035305197L, (long)l3);
                                    }
                                }
                                return;
                            }
                            f = (float)this.q;
                        }
                        try {
                            try {
                                if (callSite != null) break block33;
                                if (f != false) break block34;
                            }
                            catch (MatchException matchException) {
                                throw b4.f("\u00da", (Object)matchException, (long)-5039392088035305197L, (long)l3);
                            }
                            Object[] objectArray3 = new Object[1];
                            objectArray3[0] = l2;
                            Object[] objectArray4 = new Object[2];
                            objectArray4[1] = l4;
                            objectArray4[0] = Float.valueOf((float)b4.f("\u00e0", (Object)b4.f("\u00e0", (Object)b, (long)-5038723609958587624L, (long)l3), (long)-5041413564233581959L, (long)l3) / b4.f("\u00da", (Object)objectArray3, (long)-5039135255909318175L, (long)l3));
                            b4.f("\u00e0", (Object)this, (Object)objectArray4, (long)-5038661391483777123L, (long)l3);
                        }
                        catch (MatchException matchException) {
                            throw b4.f("\u00da", (Object)matchException, (long)-5039392088035305197L, (long)l3);
                        }
                    }
                    try {
                        b42 = this;
                        if (callSite != null) break block35;
                        f = (float)b42.r;
                    }
                    catch (MatchException matchException) {
                        throw b4.f("\u00da", (Object)matchException, (long)-5039392088035305197L, (long)l3);
                    }
                }
                if (f != false) break block36;
                b42 = this;
            }
            Object[] objectArray5 = new Object[1];
            objectArray5[0] = l2;
            Object[] objectArray6 = new Object[2];
            objectArray6[1] = l;
            objectArray6[0] = Float.valueOf((float)b4.f("\u00e0", (Object)b4.f("\u00e0", (Object)b, (long)-5038723609958587624L, (long)l3), (long)-5040412955429139603L, (long)l3) / b4.f("\u00da", (Object)objectArray5, (long)-5039135255909318175L, (long)l3));
            b4.f("\u00e0", (Object)b42, (Object)objectArray6, (long)-5039740941200201945L, (long)l3);
        }
    }

    private static Method h(long l, long l2) {
        int n = b4.e(l, l2);
        Object object = M[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = N[n];
                int n3 = string2.indexOf(8);
                clazz3 = b4.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = b4.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = b4.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        b4.M[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = b4.f(2732452066137984L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = b4.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        b4.M[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = b4.f(2732452066137984L, 0L);
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

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = b4.e(l, l2);
            object = M[n];
            try {
                if (!(object instanceof String)) break block2;
                b4.M[n] = clazz = Class.forName(N[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public void f(Object[] objectArray) {
        u_0 u_02 = (u_0)((Object)objectArray[0]);
        u_0 u_03 = (u_0)((Object)objectArray[1]);
        float f = ((Float)objectArray[2]).floatValue();
        float f10 = ((Float)objectArray[3]).floatValue();
        long l = (Long)objectArray[4];
        long l2 = (l = z ^ l) ^ 0x5D7AE6E679F7L;
        this.i = u_02;
        this.j = u_03;
        this.k = f;
        this.l = f10;
        this.n = 0;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        b4.f("\u00e0", (Object)this, (Object)objectArray2, (long)1026757948578442324L, (long)l);
    }

    private static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/b4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void l(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        Matrix4f matrix4f = (Matrix4f)objectArray[2];
        long l = (Long)objectArray[3];
    }

    public boolean d(Object[] objectArray) {
        boolean bl;
        try {
            bl = this.j == u_0.End;
        }
        catch (MatchException matchException) {
            throw b4.b(matchException);
        }
        return bl;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = b4.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = b4.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = b4.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = b4.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private void d(Object[] objectArray) {
        block12: {
            Object object;
            CallSite callSite;
            long l;
            float f;
            block10: {
                f = ((Float)objectArray[0]).floatValue();
                l = (Long)objectArray[1];
                l = z ^ l;
                float f10 = this.f + this.h / 2.0f - f / 2.0f;
                callSite = b4.f("\u00da", (long)-5277893530868346883L, (long)l);
                try {
                    float f11;
                    block11: {
                        try {
                            try {
                                reference cfr_temp_0 = b4.f("\u00da", (float)f10, (long)-5270812682527562148L, (long)l) - 8.0f;
                                object = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                if (callSite != null) break block10;
                                if (object > 0) break block11;
                            }
                            catch (MatchException matchException) {
                                throw b4.f("\u00da", (Object)matchException, (long)-5277589672937794111L, (long)l);
                            }
                            this.j = u_0.Center;
                            this.l = f10;
                            if (callSite == null) break block12;
                        }
                        catch (MatchException matchException) {
                            throw b4.f("\u00da", (Object)matchException, (long)-5277589672937794111L, (long)l);
                        }
                    }
                    object = (f11 = f10 - 0.0f) == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                }
                catch (MatchException matchException) {
                    throw b4.f("\u00da", (Object)matchException, (long)-5277589672937794111L, (long)l);
                }
            }
            try {
                block13: {
                    try {
                        if (object >= 0) break block13;
                        this.j = u_0.Start;
                        this.l = this.f;
                        if (callSite == null) break block12;
                    }
                    catch (MatchException matchException) {
                        throw b4.f("\u00da", (Object)matchException, (long)-5277589672937794111L, (long)l);
                    }
                }
                this.j = u_0.End;
                this.l = f - (this.f + this.h);
            }
            catch (MatchException matchException) {
                throw b4.f("\u00da", (Object)matchException, (long)-5277589672937794111L, (long)l);
            }
        }
    }

    private static void a() {
        Object[] objectArray = M;
        M[0] = "\u001a\u001aX#F\u0010\u001a\u001aO\u007fJ\u001f\u0000QOaJ\n\u0007 \u001f<\u001b";
        objectArray[1] = "*\u001eB\u0007o\u0000*\u001eU[c\u000f0UUEc\u001a7$\u0007\u00196X";
        objectArray[2] = "./Owno8/J-}x/dI+ql>#^<:}~";
        objectArray[3] = "Xb7Hb}-B<Gs2LL7Lwh8";
        objectArray[4] = Void.TYPE;
        b4.N[4] = "java/lang/Void";
        objectArray[5] = "\u0001\u001bCK&0\u0017\u001bF\u00115'\u0000PE\u001793\u0011\u0017R\u0000r!-";
        objectArray[6] = "\u001a\u0004GKUDo$LDD\u000b\u0012<_CMBz";
        objectArray[7] = ")Py\u0005Y\u0014\"_hJ:\u00197Rg!\u000f\u001b&A{\r\u0018\u0016";
        objectArray[8] = "4\u0004%~\u001eO\"\u0004 $\rX5O#\"\u0001L$\b45JXh";
        objectArray[9] = "g\u001ak\u0005fP\u0012:`\nw\u001fs4k\u0001sE\u0007";
        objectArray[10] = Float.TYPE;
        b4.N[10] = "java/lang/Float";
        objectArray[11] = "_gKHNU*G@G_\u001aKIKL[@?";
        objectArray[12] = "Z+ekTl/\u000bndE#N\u0005eoAy:";
        objectArray[13] = Integer.TYPE;
        b4.N[13] = "java/lang/Integer";
        objectArray[14] = "\u0011`O8~jd@D7o%\u0005NO<k\u007fq";
        objectArray[15] = "LF\rL\u0013ZGI\u001c\u0003pWRO";
        objectArray[16] = "\u0015\f+\u0012)\u0017\u0003\f.H:\u0000\u0014G-N6\u0014\u0005\u0000:Y}\u0012";
        objectArray[17] = "W\u000fm\u001d:/J\u001a5?{\"R\u001c";
        objectArray[18] = Long.TYPE;
        b4.N[18] = "java/lang/Long";
        objectArray[19] = "\u0019\u0001D\u0005v$\u000f\u0001A_e3\u0018JBYi'\t\rUN\"7\u0011";
        objectArray[20] = "7O8Ia\nBo3FpE#a8Mt\u001fW";
        objectArray[21] = "[f\u00005`IMf\u0005os^Z-\u0006i\u007fJKj\u0011~4Xz";
        objectArray[22] = "JDvB\u0012k?d}M\u0003$^jvF\u0007~*";
        objectArray[23] = "N+\u00153)pP#\u000f|NqA8\u0002&hw";
        objectArray[24] = Boolean.TYPE;
        b4.N[24] = "java/lang/Boolean";
        objectArray[25] = "6q\u0015d\u0007FCQ\u001ek\u0016\t\"_\u0015`\u0012SV";
        objectArray[26] = "Xy\u00077F\u001cNy\u0002mU\u000bY2\u0001kY\u001fHu\u0016|\u0012\u001b";
        objectArray[27] = ")I\u001e\u0015\u0019n?I\u001bO\ny(\u0002\u0018I\u0006m9E\u000f^Mz\u000f";
        objectArray[28] = "48@q\r\u001aA\u0018K~\u001cU \u0016@u\u0018\u000fT";
        objectArray[29] = "\n\u0014${\u0019.\u001c\u0014!!\n9\u000b_\"'\u0006-\u001a\u001850M=\u0002\u00187;\u0017p>\u00037&\u00177\t\u0014";
        objectArray[30] = "N\u000b73\u0017;X\u000b2i\u0004,O@1o\b8^\u0007&xC(i";
        objectArray[31] = ";l_\u0015[X-lZOHO:'YID[+`N^\u000fL\u001e";
        objectArray[32] = "\bkI\u001e\u001d\u0004}KB\u0011\fK\u001cEI\u001a\b\u0011h";
        objectArray[33] = "O\u000fi^{\u0015:/bQjZ[!iZn\u0000/";
        objectArray[34] = "\u0005ns\u0010^{\u0013nvJMl\u0004%uLAx\u0015bb[\nh ";
        objectArray[35] = "1J4\u001fH)Dj?\u0010Yf%d4\u001b]<Q";
        objectArray[36] = "\u0007\u0007`J\u001c@r'kE\r\u000f\u0013)`N\tUg";
        objectArray[37] = "t#\u001bN\u0016x\u0001\u0003\u0010A\u00077`\r\u001bJ\u0003m\u0014";
        objectArray[38] = "\u001eX\u0010\u0003Q<\u0015W\u0001L02\u001e\\\u0005\u0016";
        objectArray[39] = "G\u0003=\f}\u0014B\u00166\fv\u000fN\u0006te]%\u007f";
        objectArray[40] = "Zfkj\u0017\f/F`e\u0006CNHkn\u0002\u0019:";
        objectArray[41] = "\u0019JHn|\u0015\u0007BR!\u0013\u0012\u0001JGC;\u0013\u0007";
        objectArray[42] = "x\u0012FS.B\r2M\\?\rl<FW;W\u0018";
        objectArray[43] = ">U\u0018Q\u0019P(U\u001d\u000b\nG?\u001e\u001e\r\u0006S.Y\t\u001aMB\u0015";
        objectArray[44] = "S\u0011&PWs&1-_F<G?&TBf3";
        objectArray[45] = "lS\u00134p\u0001\u0019s\u0018;aNx}\u00130e\u0014\f";
        objectArray[46] = "7II'\f]<FXh`^2DZ'L";
        objectArray[47] = "0}cL<j&}f\u0016/}16e\u0010#i qr\u0007h~\u001f";
        objectArray[48] = "iG_\u0002\u0017\t\u001cgT\r\u0006F}i_\u0006\u0002\u001c\t";
        objectArray[49] = "NG\u0015[tB;g\u001eTe\rZi\u0015_aW.";
        objectArray[50] = "_b6f`.\u000fq|2[\u007fYr\u0002v6}R\u000e|ejvMg#tji4";
        objectArray[51] = "7nc4i\u001f)?5Jt\b(3b&F_nm5q\u0011\\n45s{\bn?bJ";
        objectArray[52] = "bp13D-bxi`47[f9=E6c~i*L\\`}p(Dl`xoe4";
        objectArray[53] = "_%JF,}\u0006 \b\u000f]vde\u0018\u00074r\u001b8\u0015\t<\u001c";
        objectArray[54] = "~%\u0003z\u0014gxk\u0017f*n\u001dhS~Exv.\u0010z\u0013";
        objectArray[55] = "O}P=!sOu\bnQ{vkX3 hNs\b$)\u0002Mp\u0011&!2Mu\u000ekQ";
        objectArray[56] = "\u000ejYHNZZjR\u001fwUZ,^\u001f\u001bg\u000bl\u000f@w\\\r-^\u0003F\u000bV9Wx";
        objectArray[57] = "\u0007vd p6\u0007~<s\u0000->,m3lz_o$q9G\u0003)-'=&@`or\u0000";
        objectArray[58] = "5M\u0019^W4e^S\nle3]8Y\u0000\noHSR\u0015c0YSMl";
        objectArray[59] = "!\u0016ZVZn+\u0012\u0006Z1dM\u0004^A@gu\u001c\u000eVI\r|\u001cVBHd#\rV]1";
        objectArray[60] = "\u0014eQ_ML\u0001gOPq\\yd\bZ\u0000ZA|XM\t0\u0012yJUJ\u000eBj\u0000\u0001q";
        objectArray[61] = "8o\u0000\u001a\u0001\u0007|\u007f\u001b\u0014j\b\u0005eY\r\u001b\b=}\t\u001a\u0012b:v[\u0006\u0013\bbd[\u001aj";
        objectArray[62] = "zD}R\u0005gm\n.]gawR\"@g5q\u0000)A\rmc\u000058Xh(U>R\u0000z(IG\u0007\u00051}B-_\u00171a;xZ\\djQ H\\x\u0013";
        objectArray[63] = "KL(,HoV\u0011~\u007fu>M\f\u0000,\u0005\"$\u0017{3\u0016!C\u000e&!\u000e^";
        objectArray[64] = ")\u0017B\u0014%`#\u0013\u001e\u0018NjE\u0005F\u0003?i}\u001d\u0016\u00146\u0003$IF\f\"~5H\u0003\nN";
        objectArray[65] = "~Iv`\u0002ns\u001c k>1\u001cU$kO?$Mt|FU'Nm~Ne'Kr3>";
        objectArray[66] = "6d\u0016\b3@6lN[C_\u000fr\u001e\u00062[7jN\u0011;14iW\u00133\u00014lH^C";
        objectArray[67] = "(sw1\\\"({/b,>\u0011e\u007f?]9)}/(TS*~6*\\c*{)g,";
        objectArray[68] = ".J+Ttr.Bs\u0007\u0004o\u0017\\#Zui/DsM|\u0003,GjOt3,Bu\u0002\u0004";
        objectArray[69] = "%I\u0001-+\r#\u0007\u00151\u0015\u0005F\u001dVq/\u000e,\t\u00051i";
        objectArray[70] = "B\u001a);lU[Xw;\fN&\u0015.\"}Y\u001e\r~5t3\u001d\u000eg7|\u0003\u001d\u000bxz\f";
        objectArray[71] = "Q)\u0018\\3u\\|NW\u000f435JW~$\u000b-\u001a@wN\b.\u0003B\u007f~\b+\u001c\u000f\u000f";
        objectArray[72] = "\u001e3i~s^\u0016u,-\rB\u000eb1rdAt?9%k\\\u001d`(%t%";
        objectArray[73] = "\u001f#\u00048{2\t`\u0001?\u00072xmF=v&@u\u0016*\u007fLCv\u000f(w|Cs\u0010e\u0007";
        objectArray[74] = "DS\u007fRf\u001fX\u0010g\u0006\u0007\u0006SH|\u0005@\u0016:L<\u001ad\u0007]Ua\b|xDS\u007fRf\u001fX\u0010g\u0006\u0007";
        objectArray[75] = "z \\Kx8. W\u001cA7.f[\u001c-\u0005\u007f'\u0003EAc*+]\u0002(<;+B{";
        objectArray[76] = "(\u0001cz\u000f?<R#<o<LLb%\u001e?tT22\u0017U+\u0002  \u0013+=A%'o";
        objectArray[77] = "+*%\u001aK\u000f+\"}I;\u001c\u0012<-\u0014J\u0014*$}\u0003C~)'d\u0001KN)\"{L;";
        objectArray[78] = "`ttcO\u0004t qi5\u0007\u00102`cSS} baRn+!opE^+$p=5";
        objectArray[79] = ";+9K6?&vo\u0018\u000bh9`+&rq7vjK`s5wW";
        objectArray[80] = "\u000bz^E]1M9Z\u0013!0v0\u0007OP0N(WXYZM+NZQjM.Q\u0017!";
        objectArray[81] = "kRh2~u\u007f\u000e(0\u0003ju_*AnyR\\$\u000eo?lQ.?8dxXU?j4wH<`{4h1dg2chX;v2|\u0011";
        objectArray[82] = ":6/H3#|u+\u001eO!G|vB>\"\u007fd&U7H|g?W?x|b \u001aO";
        objectArray[83] = "r#;QD.r+c\u000245K53_E5s-cHL_p.zJDop+e\u00074";
        objectArray[84] = "w\u001e\f{|Ra]\t|\u0000G\u0010PN~qF(H\u001eix,/CLuyFwQLi\u0000";
        objectArray[85] = "+B`z[\\{Q*.`=\u0000oG]`\t,Uq+^Y?\u001f%";
        objectArray[86] = ",HZyU\u00180\u000bB-4\u00155P@.]\u0019\f^@>Y\u007f2\nV K\u0018+WD84";
        objectArray[87] = "Ye;Iw\u001aHd~O\u001b\u0000B4cEr\u00038ik\u0012}\u001eQ6z\u0012bg";
        objectArray[88] = "gsZ9thp=\t6\u0016ldw`lt>`u\n4f>|\f_1-kwf\u0007#-w\u000e";
        objectArray[89] = "\u0019j&IHUIyl\u001ds\u0004\u001fz\u0017G\u000e\u0006r74\u0012\u0015\u0012\u001bh%\u0012\nk";
        objectArray[90] = "\u0017l\u0019uhr\u0011v\u000b{\u0016m\u0010q\f{jk\u0016\u001c\u0019)xaQ-\u0004t.2l";
        objectArray[91] = "\u0016ptbzE\u0002$qh\u0000Ff6`bf\u0012\u000b$b`g/";
        objectArray[92] = "\u001f\u0018\u001ey\u001d8\u001f\u0010F*m$&\u000e\u0016w\u001c#\u001e\u0016F`\u0015IFB]q\u0012._\u001fOim";
        objectArray[93] = "X\u0007]\u001fuI\f\u0007VHLF\fAZH t]\u0001\n\u001eL\u0012\b\f\\V%M\u0019\fC/";
        Object[] objectArray2 = objectArray;
        objectArray[94] = "Pp\u000e_MoG>]P/gP\u007f4\nM9Wv^R_9K\u000f\u000bW\u0014l@eSE\u0014p90V\u000eA{ShD\u000e]\u0002";
    }

    public void a(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        long l = (Long)objectArray[2];
        long l2 = (l = z ^ l) ^ 0x493AB2691CC3L;
        this.e = f;
        this.f = f10;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        b4.f("\u00e0", (Object)this, (Object)objectArray2, (long)6364662661471682477L, (long)l);
    }

    public boolean a(Object[] objectArray) {
        return this.s;
    }

    public String a(Object[] objectArray) {
        return this.a;
    }

    public float a(Object[] objectArray) {
        return this.e;
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

    public void m(Object[] objectArray) {
        long l = (Long)objectArray[0];
    }

    public void o(Object[] objectArray) {
        block36: {
            block35: {
                int n;
                CallSite callSite;
                long l;
                int n2;
                int n3;
                block34: {
                    block31: {
                        block33: {
                            block32: {
                                block30: {
                                    block26: {
                                        block27: {
                                            block29: {
                                                b4 b42;
                                                long l2;
                                                block28: {
                                                    n3 = (Integer)objectArray[0];
                                                    n2 = (Integer)objectArray[1];
                                                    int n4 = ((Boolean)objectArray[2]).booleanValue();
                                                    l = (Long)objectArray[3];
                                                    l2 = (l = z ^ l) ^ 0x36C2241CD0CDL;
                                                    callSite = b4.f("\u00da", (long)-7763057886311895688L, (long)l);
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    n = n4;
                                                                    if (callSite != null) break block26;
                                                                    if (n == 0) break block27;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw b4.f("\u00da", (Object)matchException, (long)-7762226567743080636L, (long)l);
                                                                }
                                                                b42 = this;
                                                                if (callSite != null) break block28;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw b4.f("\u00da", (Object)matchException, (long)-7762226567743080636L, (long)l);
                                                            }
                                                            if (!b42.s) break block29;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw b4.f("\u00da", (Object)matchException, (long)-7762226567743080636L, (long)l);
                                                        }
                                                        this.s = 0;
                                                        b42 = this;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw b4.f("\u00da", (Object)matchException, (long)-7762226567743080636L, (long)l);
                                                    }
                                                }
                                                Object[] objectArray2 = new Object[1];
                                                objectArray2[0] = l2;
                                                b4.f("\u00e0", (Object)b42, (Object)objectArray2, (long)-7755852765430811741L, (long)l);
                                            }
                                            return;
                                        }
                                        float f = (float)n3 - this.e;
                                        n = f == 0.0f ? 0 : (f > 0.0f ? 1 : -1);
                                    }
                                    try {
                                        try {
                                            if (callSite != null) break block30;
                                            if (n <= 0) break block31;
                                        }
                                        catch (MatchException matchException) {
                                            throw b4.f("\u00da", (Object)matchException, (long)-7762226567743080636L, (long)l);
                                        }
                                        float f = (float)n3 - (this.e + this.g);
                                        n = f == 0.0f ? 0 : (f < 0.0f ? -1 : 1);
                                    }
                                    catch (MatchException matchException) {
                                        throw b4.f("\u00da", (Object)matchException, (long)-7762226567743080636L, (long)l);
                                    }
                                }
                                try {
                                    try {
                                        if (callSite != null) break block32;
                                        if (n >= 0) break block31;
                                    }
                                    catch (MatchException matchException) {
                                        throw b4.f("\u00da", (Object)matchException, (long)-7762226567743080636L, (long)l);
                                    }
                                    float f = (float)n2 - this.f;
                                    n = f == 0.0f ? 0 : (f > 0.0f ? 1 : -1);
                                }
                                catch (MatchException matchException) {
                                    throw b4.f("\u00da", (Object)matchException, (long)-7762226567743080636L, (long)l);
                                }
                            }
                            try {
                                try {
                                    if (callSite != null) break block33;
                                    if (n <= 0) break block31;
                                }
                                catch (MatchException matchException) {
                                    throw b4.f("\u00da", (Object)matchException, (long)-7762226567743080636L, (long)l);
                                }
                                float f = (float)n2 - (this.f + this.h);
                                n = f == 0.0f ? 0 : (f < 0.0f ? -1 : 1);
                            }
                            catch (MatchException matchException) {
                                throw b4.f("\u00da", (Object)matchException, (long)-7762226567743080636L, (long)l);
                            }
                        }
                        try {
                            if (callSite != null) break block34;
                            if (n >= 0) break block31;
                        }
                        catch (MatchException matchException) {
                            throw b4.f("\u00da", (Object)matchException, (long)-7762226567743080636L, (long)l);
                        }
                        n = 1;
                        break block34;
                    }
                    n = 0;
                }
                int n5 = n;
                try {
                    try {
                        if (callSite != null) break block35;
                        if (n5 == 0) break block36;
                    }
                    catch (MatchException matchException) {
                        throw b4.f("\u00da", (Object)matchException, (long)-7762226567743080636L, (long)l);
                    }
                    this.t = this.e - (float)n3;
                    this.u = this.f - (float)n2;
                }
                catch (MatchException matchException) {
                    throw b4.f("\u00da", (Object)matchException, (long)-7762226567743080636L, (long)l);
                }
            }
            this.s = 1;
        }
    }

    public void p(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = z ^ l) ^ 0x4C4594A9CC36L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = new Matrix4f();
        b4.f("\u00e0", (Object)this, (Object)objectArray2, (long)2162482870317313566L, (long)l);
    }

    public void k(Object[] objectArray) {
    }

    /*
     * Unable to fully structure code
     */
    public void g(Object[] var1_1) {
        block23: {
            block22: {
                block21: {
                    block20: {
                        block19: {
                            block18: {
                                var2_2 = (v_0)var1_1[0];
                                var4_3 = ((Float)var1_1[1]).floatValue();
                                var3_4 = ((Float)var1_1[2]).floatValue();
                                var5_5 = (Long)var1_1[3];
                                var7_6 = (var5_5 = b4.z ^ var5_5) ^ 111696313189519L;
                                var9_7 = b4.f("\u00da", (long)708292806480113896L, (long)var5_5);
                                try {
                                    try {
                                        v0 = var2_2;
                                        v1 = v_0.TopLeft;
                                        if (var9_7 != null) break block18;
                                        if (v0 != v1) {
                                        }
                                        ** GOTO lbl27
                                    }
                                    catch (MatchException v2) {
                                        throw b4.f("\u00da", (Object)v2, (long)709113967988009684L, (long)var5_5);
                                    }
                                    v0 = var2_2;
                                    v1 = v_0.BottomLeft;
                                }
                                catch (MatchException v3) {
                                    throw b4.f("\u00da", (Object)v3, (long)709113967988009684L, (long)var5_5);
                                }
                            }
                            try {
                                if (v0 != v1) break block19;
lbl27:
                                // 2 sources

                                v4 = 1;
                                break block20;
                            }
                            catch (MatchException v5) {
                                throw b4.f("\u00da", (Object)v5, (long)709113967988009684L, (long)var5_5);
                            }
                        }
                        v4 = 0;
                    }
                    var10_8 = v4;
                    try {
                        try {
                            v6 = var2_2;
                            v7 = v_0.TopLeft;
                            if (var9_7 != null) break block21;
                            if (v6 != v7) {
                            }
                            ** GOTO lbl53
                        }
                        catch (MatchException v8) {
                            throw b4.f("\u00da", (Object)v8, (long)709113967988009684L, (long)var5_5);
                        }
                        v6 = var2_2;
                        v7 = v_0.TopRight;
                    }
                    catch (MatchException v9) {
                        throw b4.f("\u00da", (Object)v9, (long)709113967988009684L, (long)var5_5);
                    }
                }
                try {
                    if (v6 != v7) break block22;
lbl53:
                    // 2 sources

                    v10 = 1;
                    break block23;
                }
                catch (MatchException v11) {
                    throw b4.f("\u00da", (Object)v11, (long)709113967988009684L, (long)var5_5);
                }
            }
            v10 = 0;
        }
        var11_9 = v10;
        try {
            v12 = this;
            v13 = var10_8 != 0 ? u_0.Start : u_0.End;
        }
        catch (MatchException v14) {
            throw b4.f("\u00da", (Object)v14, (long)709113967988009684L, (long)var5_5);
        }
        try {
            v15 = var11_9 != 0 ? u_0.Start : u_0.End;
        }
        catch (MatchException v16) {
            throw b4.f("\u00da", (Object)v16, (long)709113967988009684L, (long)var5_5);
        }
        v17 = new Object[5];
        v17[4] = var7_6;
        v17[3] = Float.valueOf(var3_4);
        v17[2] = Float.valueOf(var4_3);
        v17[1] = v15;
        v17[0] = v13;
        b4.f("\u00e0", (Object)v12, (Object)v17, (long)705289960105178160L, (long)var5_5);
    }

    private static Field g(long l, long l2) {
        int n = b4.e(l, l2);
        Object object = M[n];
        if (object instanceof String) {
            String string = N[n];
            int n2 = string.indexOf(8);
            Class clazz = b4.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = b4.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = b4.c(clazz3, string2, clazz2)) != null) {
                    b4.M[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = b4.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        b4.M[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = b4.f(2732452066137984L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void j(Object[] var1_1) {
        block13: {
            block12: {
                block10: {
                    block11: {
                        var2_2 = (Long)var1_1[0];
                        v0 = var2_2;
                        var4_3 = v0 ^ 111822382315182L;
                        var6_4 = v0 ^ 98101078674063L;
                        var8_5 = v0 ^ 55198602109446L;
                        var10_6 = b4.f("\u00da", (long)-8969930525874537800L, (long)var2_2);
                        try {
                            v1 = this.d;
                            v2 /* !! */  = b4.f("\u00e0", (Object)((Boolean)b4.f("\u00e0", (Object)this.d, (long)-8962211855084825674L, (long)var2_2)), (long)-8963082049230542696L, (long)var2_2);
                            if (var10_6 != null) break block10;
                            if (v2 /* !! */  != false) break block11;
                        }
                        catch (MatchException v3) {
                            throw b4.f("\u00da", (Object)v3, (long)-8969063391035924348L, (long)var2_2);
                        }
                        v2 /* !! */  = (CallSite)1;
                        break block10;
                    }
                    v2 /* !! */  = (CallSite)0;
                }
                try {
                    try {
                        b4.f("\u00e0", (Object)v1, (Object)b4.f("\u00da", (boolean)v2 /* !! */ , (long)-8963397405399017979L, (long)var2_2), (long)-8963709760089622378L, (long)var2_2);
                        if (var10_6 != null) break block12;
                        v4 = new Object[1];
                        v4[0] = var8_5;
                        if (b4.f("\u00e0", (Object)this, (Object)v4, (long)-8962659335077114383L, (long)var2_2) != false) {
                        }
                        ** GOTO lbl45
                    }
                    catch (MatchException v5) {
                        throw b4.f("\u00da", (Object)v5, (long)-8969063391035924348L, (long)var2_2);
                    }
                    v6 = new Object[2];
                    v6[1] = var6_4;
                    v6[0] = this;
                    b4.f("\u00e0", (Object)b4.f("$", (long)-8969895905260924775L, (long)var2_2), (Object)v6, (long)-8962801236704330639L, (long)var2_2);
                }
                catch (MatchException v7) {
                    throw b4.f("\u00da", (Object)v7, (long)-8969063391035924348L, (long)var2_2);
                }
            }
            try {
                if (var10_6 == null) break block13;
lbl45:
                // 2 sources

                v8 = new Object[2];
                v8[1] = var4_3;
                v8[0] = this;
                b4.f("\u00e0", (Object)b4.f("$", (long)-8969895905260924775L, (long)var2_2), (Object)v8, (long)-8962990142665075236L, (long)var2_2);
            }
            catch (MatchException v9) {
                throw b4.f("\u00da", (Object)v9, (long)-8969063391035924348L, (long)var2_2);
            }
        }
    }

    public void q(Object[] objectArray) {
        Matrix4f matrix4f = (Matrix4f)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l ^ 0x2A8A7FC95E9DL;
        Object[] objectArray2 = new Object[8];
        objectArray2[7] = l2;
        objectArray2[6] = Float.valueOf(0.0f);
        objectArray2[5] = b4.f("$", (long)-3302194018963984571L, (long)l);
        objectArray2[4] = Float.valueOf(this.f + this.h);
        objectArray2[3] = Float.valueOf(this.e + this.g);
        objectArray2[2] = Float.valueOf(this.f);
        objectArray2[1] = Float.valueOf(this.e);
        objectArray2[0] = matrix4f;
        b4.f("\u00da", (Object)objectArray2, (long)-3302990834406179901L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(b4.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(b4.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


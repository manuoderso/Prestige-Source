/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.cF;
import dev.zprestige.prestige.dq_0;
import dev.zprestige.prestige.gL;
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
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.an
 */
public final class an_0
implements dq_0 {
    private final gL a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;
    private final float i;
    private final int j;
    private final Matrix4f k;
    private static final long l;
    private static final long[] m;
    private static final Integer[] n;
    private static final Map o;
    private static final Object[] p;
    private static final String[] q;

    public an_0(gL gL2, float f, float f10, float f11, float f12, int n, float f13, float f14, float f15, float f16, Matrix4f matrix4f, long l) {
        l = an_0.l ^ l;
        this.a = gL2;
        this.b = f;
        this.c = f10;
        this.d = f11;
        this.e = f12;
        this.f = f13;
        this.g = f14;
        this.h = f15;
        this.i = f16;
        this.k = matrix4f;
        int n2 = n >>> an_0.a("g", (int)17557, (long)(0x3D2CAD9E57705EF8L ^ l)) & an_0.a("g", (int)7972, (long)(0x1CBE7FC0F40E0543L ^ l));
        int n3 = n >>> an_0.a("g", (int)6660, (long)(0x1195B21D48040067L ^ l)) & an_0.a("g", (int)10643, (long)(0x22E41803527633F6L ^ l));
        int n4 = n >>> an_0.a("g", (int)72, (long)(0x6201A9DD73471A2CL ^ l)) & an_0.a("g", (int)10643, (long)(0x22E41803527633F6L ^ l));
        int n5 = n & an_0.a("g", (int)10643, (long)(0x22E41803527633F6L ^ l));
        this.j = n2 << an_0.a("g", (int)18093, (long)(0x146E2894C0455CCBL ^ l)) | n5 << an_0.a("g", (int)939, (long)(0x6359809C7B6419CAL ^ l)) | n4 << an_0.a("g", (int)7074, (long)(0x75DEB76C771181C0L ^ l)) | n3;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                an_0.l = hc.a(2261948984632082330L, 5630607045925088662L, MethodHandles.lookup().lookupClass()).a(114215142625126L);
                an_0.p = new Object[22];
                an_0.q = new String[22];
                an_0.a();
                an_0.o = new HashMap<K, V>(13);
                var0 = an_0.l ^ 12763686396182L;
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
                var8_3 = new long[9];
                var5_4 = 0;
                var6_5 = "\u00a4o\u00ac\u001c\u0084B\u008e\u00dd!IR\u00b6\u00c7\u00bbt\u00f2 k\u00eeO\u00c5\u0092\u009b\u00ce\u00c8\u00a2+\u00ed\u00a9:P\u0013\u001c4\u009851\u00d9\u00a4:\u00c4\u009f\u00a2\u0018\u0013\u0083\u00f6\u00f4\u0017\u00e7\u00c5\u00e3\u00c8\u00fb\u00c3\u00a2";
                var7_6 = "\u00a4o\u00ac\u001c\u0084B\u008e\u00dd!IR\u00b6\u00c7\u00bbt\u00f2 k\u00eeO\u00c5\u0092\u009b\u00ce\u00c8\u00a2+\u00ed\u00a9:P\u0013\u001c4\u009851\u00d9\u00a4:\u00c4\u009f\u00a2\u0018\u0013\u0083\u00f6\u00f4\u0017\u00e7\u00c5\u00e3\u00c8\u00fb\u00c3\u00a2".length();
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
                    var6_5 = "\u00c2o.\u000f\u0007\u00ff\u00eckfc\u0091?Y7=\u00c2";
                    var7_6 = "\u00c2o.\u000f\u0007\u00ff\u00eckfc\u0091?Y7=\u00c2".length();
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
        an_0.m = var8_3;
        an_0.n = new Integer[9];
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = an_0.a(l, l2);
            object = p[n];
            try {
                if (!(object instanceof String)) break block2;
                an_0.p[n] = clazz = Class.forName(q[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = an_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = an_0.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/an" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = an_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = an_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = an_0.a(l, l2);
        Object object = p[n];
        if (object instanceof String) {
            String string = q[n];
            int n2 = string.indexOf(8);
            Class clazz = an_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = an_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = an_0.a(clazz3, string2, clazz2)) != null) {
                    an_0.p[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = an_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        an_0.p[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = an_0.b(902558461439189L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = an_0.a(l, l2);
        Object object = p[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = q[n];
                int n3 = string2.indexOf(8);
                clazz3 = an_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = an_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = an_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        an_0.p[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = an_0.b(902558461439189L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = an_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        an_0.p[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = an_0.b(902558461439189L, 0L);
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

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = an_0.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
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

    @Override
    public gL a(Object[] objectArray) {
        return this.a;
    }

    @Override
    public void a(Object[] objectArray) {
        long l;
        long l2;
        long l3;
        cF cF2;
        block6: {
            cF2 = (cF)objectArray[0];
            float f = ((Float)objectArray[1]).floatValue();
            l3 = (Long)objectArray[2];
            long l4 = l3;
            long l5 = l4 ^ 0x15FAF34DB62BL;
            long l6 = l4 ^ 0x4B6DF8C8690FL;
            l2 = l4 ^ 0x765D5A144A80L;
            l = l4 ^ 0x23C0BC5A3E3FL;
            long l7 = l4 ^ 0x100E473234F5L;
            long l8 = l4 ^ 0x1AB7644DEE2CL;
            long l9 = l4 ^ 0x1BB92A33DEDBL;
            CallSite callSite = an_0.b("Q", (long)-938127846410231799L, (long)l3);
            try {
                CallSite callSite2;
                block7: {
                    try {
                        try {
                            Object[] objectArray2 = new Object[1];
                            objectArray2[0] = l5;
                            callSite2 = an_0.b("G", (Object)cF2, (Object)objectArray2, (long)-937745659277303736L, (long)l3);
                            if (callSite != null) break block6;
                            if (this.k != null) break block7;
                        }
                        catch (MatchException matchException) {
                            throw an_0.b("Q", (Object)matchException, (long)-937538725886415922L, (long)l3);
                        }
                        Object[] objectArray3 = new Object[4];
                        objectArray3[3] = l6;
                        objectArray3[2] = Float.valueOf(f);
                        objectArray3[1] = Float.valueOf(this.e);
                        objectArray3[0] = Float.valueOf(this.b);
                        Object[] objectArray4 = new Object[2];
                        objectArray4[1] = l7;
                        objectArray4[0] = this.j;
                        Object[] objectArray5 = new Object[2];
                        objectArray5[1] = l9;
                        objectArray5[0] = new float[]{this.f, this.i};
                        Object[] objectArray6 = new Object[4];
                        objectArray6[3] = l6;
                        objectArray6[2] = Float.valueOf(f);
                        objectArray6[1] = Float.valueOf(this.c);
                        objectArray6[0] = Float.valueOf(this.b);
                        Object[] objectArray7 = new Object[2];
                        objectArray7[1] = l7;
                        objectArray7[0] = this.j;
                        Object[] objectArray8 = new Object[2];
                        objectArray8[1] = l9;
                        objectArray8[0] = new float[]{this.f, this.g};
                        Object[] objectArray9 = new Object[4];
                        objectArray9[3] = l6;
                        objectArray9[2] = Float.valueOf(f);
                        objectArray9[1] = Float.valueOf(this.c);
                        objectArray9[0] = Float.valueOf(this.d);
                        Object[] objectArray10 = new Object[2];
                        objectArray10[1] = l7;
                        objectArray10[0] = this.j;
                        Object[] objectArray11 = new Object[2];
                        objectArray11[1] = l9;
                        objectArray11[0] = new float[]{this.h, this.g};
                        Object[] objectArray12 = new Object[4];
                        objectArray12[3] = l6;
                        objectArray12[2] = Float.valueOf(f);
                        objectArray12[1] = Float.valueOf(this.e);
                        objectArray12[0] = Float.valueOf(this.d);
                        Object[] objectArray13 = new Object[2];
                        objectArray13[1] = l7;
                        objectArray13[0] = this.j;
                        Object[] objectArray14 = new Object[2];
                        objectArray14[1] = l9;
                        objectArray14[0] = new float[]{this.h, this.i};
                        an_0.b("G", (Object)an_0.b("G", (Object)an_0.b("G", (Object)an_0.b("G", (Object)an_0.b("G", (Object)an_0.b("G", (Object)an_0.b("G", (Object)an_0.b("G", (Object)an_0.b("G", (Object)an_0.b("G", (Object)an_0.b("G", (Object)an_0.b("G", (Object)cF2, (Object)objectArray3, (long)-937855853324821550L, (long)l3), (Object)objectArray4, (long)-937673521228977371L, (long)l3), (Object)objectArray5, (long)-937942077215489052L, (long)l3), (Object)objectArray6, (long)-937855853324821550L, (long)l3), (Object)objectArray7, (long)-937673521228977371L, (long)l3), (Object)objectArray8, (long)-937942077215489052L, (long)l3), (Object)objectArray9, (long)-937855853324821550L, (long)l3), (Object)objectArray10, (long)-937673521228977371L, (long)l3), (Object)objectArray11, (long)-937942077215489052L, (long)l3), (Object)objectArray12, (long)-937855853324821550L, (long)l3), (Object)objectArray13, (long)-937673521228977371L, (long)l3), (Object)objectArray14, (long)-937942077215489052L, (long)l3);
                        if (callSite == null) break block6;
                    }
                    catch (MatchException matchException) {
                        throw an_0.b("Q", (Object)matchException, (long)-937538725886415922L, (long)l3);
                    }
                }
                Object[] objectArray15 = new Object[5];
                objectArray15[4] = l8;
                objectArray15[3] = Float.valueOf(f);
                objectArray15[2] = Float.valueOf(this.e);
                objectArray15[1] = Float.valueOf(this.b);
                objectArray15[0] = this.k;
                Object[] objectArray16 = new Object[2];
                objectArray16[1] = l7;
                objectArray16[0] = this.j;
                Object[] objectArray17 = new Object[2];
                objectArray17[1] = l9;
                objectArray17[0] = new float[]{this.f, this.i};
                Object[] objectArray18 = new Object[5];
                objectArray18[4] = l8;
                objectArray18[3] = Float.valueOf(f);
                objectArray18[2] = Float.valueOf(this.c);
                objectArray18[1] = Float.valueOf(this.b);
                objectArray18[0] = this.k;
                Object[] objectArray19 = new Object[2];
                objectArray19[1] = l7;
                objectArray19[0] = this.j;
                Object[] objectArray20 = new Object[2];
                objectArray20[1] = l9;
                objectArray20[0] = new float[]{this.f, this.g};
                Object[] objectArray21 = new Object[5];
                objectArray21[4] = l8;
                objectArray21[3] = Float.valueOf(f);
                objectArray21[2] = Float.valueOf(this.c);
                objectArray21[1] = Float.valueOf(this.d);
                objectArray21[0] = this.k;
                Object[] objectArray22 = new Object[2];
                objectArray22[1] = l7;
                objectArray22[0] = this.j;
                Object[] objectArray23 = new Object[2];
                objectArray23[1] = l9;
                objectArray23[0] = new float[]{this.h, this.g};
                Object[] objectArray24 = new Object[5];
                objectArray24[4] = l8;
                objectArray24[3] = Float.valueOf(f);
                objectArray24[2] = Float.valueOf(this.e);
                objectArray24[1] = Float.valueOf(this.d);
                objectArray24[0] = this.k;
                Object[] objectArray25 = new Object[2];
                objectArray25[1] = l7;
                objectArray25[0] = this.j;
                Object[] objectArray26 = new Object[2];
                objectArray26[1] = l9;
                objectArray26[0] = new float[]{this.h, this.i};
                callSite2 = an_0.b("G", (Object)an_0.b("G", (Object)an_0.b("G", (Object)an_0.b("G", (Object)an_0.b("G", (Object)an_0.b("G", (Object)an_0.b("G", (Object)an_0.b("G", (Object)an_0.b("G", (Object)an_0.b("G", (Object)an_0.b("G", (Object)an_0.b("G", (Object)cF2, (Object)objectArray15, (long)-937477145300608903L, (long)l3), (Object)objectArray16, (long)-937673521228977371L, (long)l3), (Object)objectArray17, (long)-937942077215489052L, (long)l3), (Object)objectArray18, (long)-937477145300608903L, (long)l3), (Object)objectArray19, (long)-937673521228977371L, (long)l3), (Object)objectArray20, (long)-937942077215489052L, (long)l3), (Object)objectArray21, (long)-937477145300608903L, (long)l3), (Object)objectArray22, (long)-937673521228977371L, (long)l3), (Object)objectArray23, (long)-937942077215489052L, (long)l3), (Object)objectArray24, (long)-937477145300608903L, (long)l3), (Object)objectArray25, (long)-937673521228977371L, (long)l3), (Object)objectArray26, (long)-937942077215489052L, (long)l3);
            }
            catch (MatchException matchException) {
                throw an_0.b("Q", (Object)matchException, (long)-937538725886415922L, (long)l3);
            }
        }
        int[] nArray = new int[an_0.a("g", (int)16910, (long)(0x54638E6EED09FC40L ^ l3))];
        nArray[0] = 0;
        nArray[1] = 1;
        nArray[2] = 2;
        nArray[3] = 2;
        nArray[4] = 3;
        nArray[5] = 0;
        Object[] objectArray27 = new Object[2];
        objectArray27[1] = l;
        objectArray27[0] = nArray;
        Object[] objectArray28 = new Object[1];
        objectArray28[0] = l2;
        an_0.b("G", (Object)an_0.b("G", (Object)cF2, (Object)objectArray27, (long)-937640820425504057L, (long)l3), (Object)objectArray28, (long)-937961361508045164L, (long)l3);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'B' || c == '\u00f0' || c == '\u00cf' || c == '\u00f5') {
                field = an_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'B' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f0' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00cf' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = an_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'G' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'Q' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = an_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/an" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (q[n3] != null) {
            return n3;
        }
        Object object = p[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 59;
            case 1 -> 35;
            case 2 -> 12;
            case 3 -> 4;
            case 4 -> 49;
            case 5 -> 29;
            case 6 -> 56;
            case 7 -> 20;
            case 8 -> 22;
            case 9 -> 17;
            case 10 -> 39;
            case 11 -> 52;
            case 12 -> 53;
            case 13 -> 31;
            case 14 -> 36;
            case 15 -> 44;
            case 16 -> 63;
            case 17 -> 11;
            case 18 -> 42;
            case 19 -> 18;
            case 20 -> 2;
            case 21 -> 9;
            case 22 -> 8;
            case 23 -> 21;
            case 24 -> 50;
            case 25 -> 57;
            case 26 -> 34;
            case 27 -> 60;
            case 28 -> 15;
            case 29 -> 16;
            case 30 -> 14;
            case 31 -> 0;
            case 32 -> 62;
            case 33 -> 7;
            case 34 -> 19;
            case 35 -> 51;
            case 36 -> 32;
            case 37 -> 10;
            case 38 -> 30;
            case 39 -> 47;
            case 40 -> 26;
            case 41 -> 13;
            case 42 -> 46;
            case 43 -> 54;
            case 44 -> 25;
            case 45 -> 43;
            case 46 -> 33;
            case 47 -> 58;
            case 48 -> 1;
            case 49 -> 45;
            case 50 -> 23;
            case 51 -> 24;
            case 52 -> 3;
            case 53 -> 37;
            case 54 -> 48;
            case 55 -> 40;
            case 56 -> 5;
            case 57 -> 41;
            case 58 -> 27;
            case 59 -> 6;
            case 60 -> 55;
            case 61 -> 28;
            case 62 -> 38;
            default -> 61;
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
        an_0.q[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = p;
        p[0] = "}\n<]Uck\n9\u0007Ft|A:\u0001J`m\u0006-\u0016\u0001rQ";
        objectArray[1] = "\u001d8c@/\u000eh\u0018hO>A\u0015\u0000{H7\b}";
        objectArray[2] = "b\u000fA\u0010\u00043t\u000fDJ\u0017$cDGL\u001b0r\u0003P[P @";
        objectArray[3] = "ulde\u0001I\u0000Loj\u0010\u0006aBda\u0014\\\u0015";
        objectArray[4] = "\u0000 >A|\u0011u\u00005Nm^\u0014\u000e>Ei\u0004`";
        objectArray[5] = "OM @\u0013\u007f:m+O\u00020[c D\u0006j/";
        objectArray[6] = "_\b\u001c8\",*(\u001773cK&\u001c<79?";
        objectArray[7] = "E2\u0006\u0011wt0\u0012\r\u001ef;Q\u001c\u0006\u0015ba%";
        objectArray[8] = "Q4n\u0000a\u0016$\u0014e\u000fpYE\u001an\u0004t\u00031";
        objectArray[9] = "F\u001eR\u0017!O3>Y\u00180\u0000R0R\u00134Z&";
        objectArray[10] = "Za:\u0018\"ULa?B1B[*<D=VJm+SvDP";
        objectArray[11] = "n6'Z_\u000ee96\u0015<\u0003p49~\t\u0001a'%R\u001e\f";
        objectArray[12] = "\u00164r.\u0014Z\u001d;cauT\u00160g;";
        objectArray[13] = "960uf;?o'NaG90~\"b&kg&(\u000b";
        objectArray[14] = "\u001eS<h?rAA:jAa'\r?i9z\u001c\u000b0`9\u000b\u001eS<h?rAA:jA";
        objectArray[15] = "\u000f\u001bUVA\u001aP\tST?\u00036EVWG\u0012\rCY^Gc\u000f\u001bUVA\u001aP\tST?";
        objectArray[16] = "#\u001f]]t||\r[_\nf\u001aA^\\rt!GQUr\u0005#\u001f]]t||\r[_\n";
        objectArray[17] = "=\tz\u0000V\tb\u001b|\u0002(\u001b\u0004Wy\u0001P\u0001?Qv\bPp=\tz\u0000V\tb\u001b|\u0002(";
        objectArray[18] = "J\u0002\bt\u0015C\u0015\u0010\u000evkUs\\\u000bu\u0013KHZ\u0004|\u0013:J\u0002\bt\u0015C\u0015\u0010\u000evk";
        objectArray[19] = "\"F%rpA}T#p\u000eU\u001b\u0018&svI \u001e)zv8\"F%rpA}T#p\u000e";
        objectArray[20] = "En\n5k8\u001a|\f7\u0015-|0\t4m0G6\u0006=mAEn\n5k8\u001a|\f7\u0015";
        Object[] objectArray2 = objectArray;
        objectArray[21] = "B}Pu\t\u0005\u0018wF'{\u0016|<H\u007f@\u001eC=Zr@\u007fLeB'\u001a@MwO'{";
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4CB3;
        if (an_0.n[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = m[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])o.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    o.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/an", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            an_0.n[n2] = n3;
        }
        return an_0.n[n2];
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(an_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(an_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


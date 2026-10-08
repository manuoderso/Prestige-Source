/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.cU;
import dev.zprestige.prestige.cX;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.VarHandle;
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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class bR {
    private final boolean a;
    private final long b;
    private final Object c;
    private final boolean d;
    private final boolean e;
    private final VarHandle f;
    private final Field g;
    private final Class h;
    private final String i;
    private final Class j;
    private static final long k = hc.a(-3101671882979732098L, -1877105275149421360L, MethodHandles.lookup().lookupClass()).a(213124267855810L);
    private static final long[] l;
    private static final Long[] m;
    private static final Map n;
    private static final Object[] o;
    private static final String[] p;

    bR(cX cX2, long l) {
        int n;
        block4: {
            block3: {
                l = k ^ l;
                this.a = 1;
                this.b = cX2.d;
                this.c = cX2.c;
                this.d = cX2.b;
                this.f = cX2.e;
                this.g = cX2.a;
                if (cU.a != null) {
                    try {
                        if (cX2.d == bR.a("d", (int)20142, (long)(0x5577DA4880679578L ^ l))) break block3;
                        n = 1;
                        break block4;
                    }
                    catch (RuntimeException runtimeException) {
                        throw bR.b("\u00dc", (Object)runtimeException, (long)4389654217411338153L, (long)l);
                    }
                }
            }
            n = 0;
        }
        this.e = n;
        this.h = null;
        this.i = null;
        this.j = null;
    }

    bR(Class clazz, String string, Class clazz2, long l) {
        l = k ^ l;
        this.a = 0;
        this.b = (long)bR.a("d", (int)11447, (long)(0x69EE106B16CB8F23L ^ l));
        this.c = null;
        this.d = 0;
        this.e = 0;
        this.f = null;
        this.g = null;
        this.h = clazz;
        this.i = string;
        this.j = clazz2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        o = new Object[67];
        p = new String[67];
        bR.a();
        n = new HashMap(13);
        long l = k ^ 0xB9CFF1C5AC0L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n = 0;
        String string = "\u00b8\u00b4\u0018\u00b6\u008a\u00cd\u0080\u00ef\u00f2\u0087L\u00ae\u0086\u00a8\u0086C";
        int n2 = "\u00b8\u00b4\u0018\u00b6\u008a\u00cd\u0080\u00ef\u00f2\u0087L\u00ae\u0086\u00a8\u0086C".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        bR.l = lArray;
        m = new Long[2];
    }

    /*
     * Unable to fully structure code
     */
    public void e(Object[] var1_1) {
        block27: {
            block28: {
                block29: {
                    block25: {
                        block23: {
                            block24: {
                                var4_2 = var1_1[0];
                                var5_3 = (Boolean)var1_1[1];
                                var2_4 = (Long)var1_1[2];
                                v0 = var2_4 = bR.k ^ var2_4;
                                var6_5 = v0 ^ 64211950963656L;
                                var8_6 = v0 ^ 65350190025097L;
                                var10_7 = v0 ^ 60844901089692L;
                                var12_8 = bR.b("\u00dc", (long)-5602052097613839528L, (long)var2_4);
                                try {
                                    try {
                                        v1 = this.a;
                                        if (var12_8 != null) break block23;
                                        if (v1) break block24;
                                    }
                                    catch (RuntimeException v2) {
                                        throw bR.b("\u00dc", (Object)v2, (long)-5599848362913066741L, (long)var2_4);
                                    }
                                    v3 = new Object[3];
                                    v3[2] = var10_7;
                                    v3[1] = bR.b("\u00dc", (boolean)var5_3, (long)-5599586965114567532L, (long)var2_4);
                                    v3[0] = var4_2;
                                    bR.b("g", (Object)this, (Object)v3, (long)-5600224604973529774L, (long)var2_4);
                                    return;
                                }
                                catch (RuntimeException v4) {
                                    throw bR.b("\u00dc", (Object)v4, (long)-5599848362913066741L, (long)var2_4);
                                }
                            }
                            try {
                                v5 = this;
                                if (var12_8 != null) break block25;
                                v1 = v5.e;
                            }
                            catch (RuntimeException v6) {
                                throw bR.b("\u00dc", (Object)v6, (long)-5599848362913066741L, (long)var2_4);
                            }
                        }
                        try {
                            block26: {
                                try {
                                    if (!v1) break block26;
                                    v7 = new Object[2];
                                    v7[1] = var6_5;
                                    v7[0] = var4_2;
                                    bR.b("g", (Object)cU.a, (Object)bR.b("g", (Object)this, (Object)v7, (long)-5599882042367281968L, (long)var2_4), (long)this.b, (boolean)var5_3, (long)-5602163472238965077L, (long)var2_4);
                                    if (var12_8 == null) break block27;
                                }
                                catch (RuntimeException v8) {
                                    throw bR.b("\u00dc", (Object)v8, (long)-5599848362913066741L, (long)var2_4);
                                }
                            }
                            v5 = this;
                        }
                        catch (RuntimeException v9) {
                            throw bR.b("\u00dc", (Object)v9, (long)-5599848362913066741L, (long)var2_4);
                        }
                    }
                    try {
                        block30: {
                            try {
                                try {
                                    try {
                                        try {
                                            if (var12_8 != null) break block28;
                                            if (v5.f != null) {
                                            }
                                            ** GOTO lbl89
                                        }
                                        catch (RuntimeException v10) {
                                            throw bR.b("\u00dc", (Object)v10, (long)-5599848362913066741L, (long)var2_4);
                                        }
                                        v11 = this;
                                        if (var12_8 != null) break block29;
                                    }
                                    catch (RuntimeException v12) {
                                        throw bR.b("\u00dc", (Object)v12, (long)-5599848362913066741L, (long)var2_4);
                                    }
                                    if (!v11.d) break block30;
                                }
                                catch (RuntimeException v13) {
                                    throw bR.b("\u00dc", (Object)v13, (long)-5599848362913066741L, (long)var2_4);
                                }
                                this.f.set(var5_3);
                                if (var12_8 == null) break block27;
                            }
                            catch (RuntimeException v14) {
                                throw bR.b("\u00dc", (Object)v14, (long)-5599848362913066741L, (long)var2_4);
                            }
                        }
                        v11 = this;
                    }
                    catch (RuntimeException v15) {
                        throw bR.b("\u00dc", (Object)v15, (long)-5599848362913066741L, (long)var2_4);
                    }
                }
                try {
                    v11.f.set(var4_2, var5_3);
                    if (var12_8 == null) break block27;
lbl89:
                    // 2 sources

                    v5 = this;
                }
                catch (RuntimeException v16) {
                    throw bR.b("\u00dc", (Object)v16, (long)-5599848362913066741L, (long)var2_4);
                }
            }
            v17 = new Object[3];
            v17[2] = var8_6;
            v17[1] = bR.b("\u00dc", (boolean)var5_3, (long)-5599586965114567532L, (long)var2_4);
            v17[0] = var4_2;
            bR.b("g", (Object)v5, (Object)v17, (long)-5599642392617721830L, (long)var2_4);
        }
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = bR.a(l, l2);
            object = o[n];
            try {
                if (!(object instanceof String)) break block2;
                bR.o[n] = clazz = Class.forName(p[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public Object b(Object[] objectArray) {
        Object object;
        block20: {
            long l;
            long l2;
            Object object2;
            block21: {
                Object object3;
                block24: {
                    bR bR2;
                    block22: {
                        block23: {
                            bR bR3;
                            CallSite callSite;
                            block19: {
                                boolean bl;
                                long l3;
                                block17: {
                                    block18: {
                                        object2 = objectArray[0];
                                        l2 = (Long)objectArray[1];
                                        long l4 = l2 = k ^ l2;
                                        l = l4 ^ 0x534F44D730C2L;
                                        long l5 = l4 ^ 0x21FEB22B2DDFL;
                                        l3 = l4 ^ 0x107786241275L;
                                        callSite = bR.b("\u00dc", (long)-6053777580839019803L, (long)l2);
                                        try {
                                            try {
                                                bl = this.a;
                                                if (callSite != null) break block17;
                                                if (bl) break block18;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw bR.b("\u00dc", (Object)runtimeException, (long)-6056077591807227722L, (long)l2);
                                            }
                                            Object[] objectArray2 = new Object[2];
                                            objectArray2[1] = l5;
                                            objectArray2[0] = object2;
                                            return bR.b("g", (Object)this, (Object)objectArray2, (long)-6056712111878255337L, (long)l2);
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw bR.b("\u00dc", (Object)runtimeException, (long)-6056077591807227722L, (long)l2);
                                        }
                                    }
                                    try {
                                        bR3 = this;
                                        if (callSite != null) break block19;
                                        bl = bR3.e;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw bR.b("\u00dc", (Object)runtimeException, (long)-6056077591807227722L, (long)l2);
                                    }
                                }
                                try {
                                    if (bl) {
                                        Object[] objectArray3 = new Object[2];
                                        objectArray3[1] = l3;
                                        objectArray3[0] = object2;
                                        return bR.b("g", (Object)cU.a, (Object)bR.b("g", (Object)this, (Object)objectArray3, (long)-6056194834010935955L, (long)l2), (long)this.b, (long)-6055134905628523169L, (long)l2);
                                    }
                                }
                                catch (RuntimeException runtimeException) {
                                    throw bR.b("\u00dc", (Object)runtimeException, (long)-6056077591807227722L, (long)l2);
                                }
                                bR3 = this;
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            object = bR3.f;
                                            if (callSite != null) break block20;
                                            if (object == null) break block21;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw bR.b("\u00dc", (Object)runtimeException, (long)-6056077591807227722L, (long)l2);
                                        }
                                        bR2 = this;
                                        if (callSite != null) break block22;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw bR.b("\u00dc", (Object)runtimeException, (long)-6056077591807227722L, (long)l2);
                                    }
                                    if (!bR2.d) break block23;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw bR.b("\u00dc", (Object)runtimeException, (long)-6056077591807227722L, (long)l2);
                                }
                                object3 = this.f.get();
                                break block24;
                            }
                            catch (RuntimeException runtimeException) {
                                throw bR.b("\u00dc", (Object)runtimeException, (long)-6056077591807227722L, (long)l2);
                            }
                        }
                        bR2 = this;
                    }
                    object3 = bR2.f.get(object2);
                }
                return object3;
            }
            Object[] objectArray4 = new Object[2];
            objectArray4[1] = l;
            objectArray4[0] = object2;
            object = bR.b("g", (Object)this, (Object)objectArray4, (long)-6055723354822495978L, (long)l2);
        }
        return object;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/bR" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = bR.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = bR.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = bR.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = bR.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    public void b(Object[] var1_1) {
        block27: {
            block28: {
                block29: {
                    block25: {
                        block23: {
                            block24: {
                                var4_2 = var1_1[0];
                                var5_3 = ((Float)var1_1[1]).floatValue();
                                var2_4 = (Long)var1_1[2];
                                v0 = var2_4 = bR.k ^ var2_4;
                                var6_5 = v0 ^ 108899763810423L;
                                var8_6 = v0 ^ 107761667355190L;
                                var10_7 = v0 ^ 121200748313123L;
                                var12_8 = bR.b("\u00dc", (long)5331938847968540903L, (long)var2_4);
                                try {
                                    try {
                                        v1 = this.a;
                                        if (var12_8 != null) break block23;
                                        if (v1) break block24;
                                    }
                                    catch (RuntimeException v2) {
                                        throw bR.b("\u00dc", (Object)v2, (long)5329463671610960564L, (long)var2_4);
                                    }
                                    v3 = new Object[3];
                                    v3[2] = var10_7;
                                    v3[1] = bR.b("\u00dc", (float)var5_3, (long)5329420532675271353L, (long)var2_4);
                                    v3[0] = var4_2;
                                    bR.b("g", (Object)this, (Object)v3, (long)5329825480484683501L, (long)var2_4);
                                    return;
                                }
                                catch (RuntimeException v4) {
                                    throw bR.b("\u00dc", (Object)v4, (long)5329463671610960564L, (long)var2_4);
                                }
                            }
                            try {
                                v5 = this;
                                if (var12_8 != null) break block25;
                                v1 = v5.e;
                            }
                            catch (RuntimeException v6) {
                                throw bR.b("\u00dc", (Object)v6, (long)5329463671610960564L, (long)var2_4);
                            }
                        }
                        try {
                            block26: {
                                try {
                                    if (!v1) break block26;
                                    v7 = new Object[2];
                                    v7[1] = var6_5;
                                    v7[0] = var4_2;
                                    bR.b("g", (Object)cU.a, (Object)bR.b("g", (Object)this, (Object)v7, (long)5329554540299554671L, (long)var2_4), (long)this.b, (float)var5_3, (long)5328851442153827109L, (long)var2_4);
                                    if (var12_8 == null) break block27;
                                }
                                catch (RuntimeException v8) {
                                    throw bR.b("\u00dc", (Object)v8, (long)5329463671610960564L, (long)var2_4);
                                }
                            }
                            v5 = this;
                        }
                        catch (RuntimeException v9) {
                            throw bR.b("\u00dc", (Object)v9, (long)5329463671610960564L, (long)var2_4);
                        }
                    }
                    try {
                        block30: {
                            try {
                                try {
                                    try {
                                        try {
                                            if (var12_8 != null) break block28;
                                            if (v5.f != null) {
                                            }
                                            ** GOTO lbl89
                                        }
                                        catch (RuntimeException v10) {
                                            throw bR.b("\u00dc", (Object)v10, (long)5329463671610960564L, (long)var2_4);
                                        }
                                        v11 = this;
                                        if (var12_8 != null) break block29;
                                    }
                                    catch (RuntimeException v12) {
                                        throw bR.b("\u00dc", (Object)v12, (long)5329463671610960564L, (long)var2_4);
                                    }
                                    if (!v11.d) break block30;
                                }
                                catch (RuntimeException v13) {
                                    throw bR.b("\u00dc", (Object)v13, (long)5329463671610960564L, (long)var2_4);
                                }
                                this.f.set(var5_3);
                                if (var12_8 == null) break block27;
                            }
                            catch (RuntimeException v14) {
                                throw bR.b("\u00dc", (Object)v14, (long)5329463671610960564L, (long)var2_4);
                            }
                        }
                        v11 = this;
                    }
                    catch (RuntimeException v15) {
                        throw bR.b("\u00dc", (Object)v15, (long)5329463671610960564L, (long)var2_4);
                    }
                }
                try {
                    v11.f.set(var4_2, var5_3);
                    if (var12_8 == null) break block27;
lbl89:
                    // 2 sources

                    v5 = this;
                }
                catch (RuntimeException v16) {
                    throw bR.b("\u00dc", (Object)v16, (long)5329463671610960564L, (long)var2_4);
                }
            }
            v17 = new Object[3];
            v17[2] = var8_6;
            v17[1] = bR.b("\u00dc", (float)var5_3, (long)5329420532675271353L, (long)var2_4);
            v17[0] = var4_2;
            bR.b("g", (Object)v5, (Object)v17, (long)5329248767859661733L, (long)var2_4);
        }
    }

    /*
     * Unable to fully structure code
     */
    public void c(Object[] var1_1) {
        block27: {
            block28: {
                block29: {
                    block25: {
                        block23: {
                            block24: {
                                var2_2 = var1_1[0];
                                var5_3 = (Integer)var1_1[1];
                                var3_4 = (Long)var1_1[2];
                                v0 = var3_4 = bR.k ^ var3_4;
                                var6_5 = v0 ^ 128386472777818L;
                                var8_6 = v0 ^ 129524574542363L;
                                var10_7 = v0 ^ 134089989083662L;
                                var12_8 = bR.b("\u00dc", (long)2437518247988515018L, (long)var3_4);
                                try {
                                    try {
                                        v1 = this.a;
                                        if (var12_8 != null) break block23;
                                        if (v1) break block24;
                                    }
                                    catch (RuntimeException v2) {
                                        throw bR.b("\u00dc", (Object)v2, (long)2439571349314601625L, (long)var3_4);
                                    }
                                    v3 = new Object[3];
                                    v3[2] = var10_7;
                                    v3[1] = bR.b("\u00dc", (int)var5_3, (long)2440261475735745563L, (long)var3_4);
                                    v3[0] = var2_2;
                                    bR.b("g", (Object)this, (Object)v3, (long)2439349861384656576L, (long)var3_4);
                                    return;
                                }
                                catch (RuntimeException v4) {
                                    throw bR.b("\u00dc", (Object)v4, (long)2439571349314601625L, (long)var3_4);
                                }
                            }
                            try {
                                v5 = this;
                                if (var12_8 != null) break block25;
                                v1 = v5.e;
                            }
                            catch (RuntimeException v6) {
                                throw bR.b("\u00dc", (Object)v6, (long)2439571349314601625L, (long)var3_4);
                            }
                        }
                        try {
                            block26: {
                                try {
                                    if (!v1) break block26;
                                    v7 = new Object[2];
                                    v7[1] = var6_5;
                                    v7[0] = var2_2;
                                    bR.b("g", (Object)cU.a, (Object)bR.b("g", (Object)this, (Object)v7, (long)2439673715496478530L, (long)var3_4), (long)this.b, (int)var5_3, (long)2439057035801261268L, (long)var3_4);
                                    if (var12_8 == null) break block27;
                                }
                                catch (RuntimeException v8) {
                                    throw bR.b("\u00dc", (Object)v8, (long)2439571349314601625L, (long)var3_4);
                                }
                            }
                            v5 = this;
                        }
                        catch (RuntimeException v9) {
                            throw bR.b("\u00dc", (Object)v9, (long)2439571349314601625L, (long)var3_4);
                        }
                    }
                    try {
                        block30: {
                            try {
                                try {
                                    try {
                                        try {
                                            if (var12_8 != null) break block28;
                                            if (v5.f != null) {
                                            }
                                            ** GOTO lbl89
                                        }
                                        catch (RuntimeException v10) {
                                            throw bR.b("\u00dc", (Object)v10, (long)2439571349314601625L, (long)var3_4);
                                        }
                                        v11 = this;
                                        if (var12_8 != null) break block29;
                                    }
                                    catch (RuntimeException v12) {
                                        throw bR.b("\u00dc", (Object)v12, (long)2439571349314601625L, (long)var3_4);
                                    }
                                    if (!v11.d) break block30;
                                }
                                catch (RuntimeException v13) {
                                    throw bR.b("\u00dc", (Object)v13, (long)2439571349314601625L, (long)var3_4);
                                }
                                this.f.set(var5_3);
                                if (var12_8 == null) break block27;
                            }
                            catch (RuntimeException v14) {
                                throw bR.b("\u00dc", (Object)v14, (long)2439571349314601625L, (long)var3_4);
                            }
                        }
                        v11 = this;
                    }
                    catch (RuntimeException v15) {
                        throw bR.b("\u00dc", (Object)v15, (long)2439571349314601625L, (long)var3_4);
                    }
                }
                try {
                    v11.f.set(var2_2, var5_3);
                    if (var12_8 == null) break block27;
lbl89:
                    // 2 sources

                    v5 = this;
                }
                catch (RuntimeException v16) {
                    throw bR.b("\u00dc", (Object)v16, (long)2439571349314601625L, (long)var3_4);
                }
            }
            v17 = new Object[3];
            v17[2] = var8_6;
            v17[1] = bR.b("\u00dc", (int)var5_3, (long)2440261475735745563L, (long)var3_4);
            v17[0] = var2_2;
            bR.b("g", (Object)v5, (Object)v17, (long)2438800678405075848L, (long)var3_4);
        }
    }

    private static Field c(long l, long l2) {
        int n = bR.a(l, l2);
        Object object = o[n];
        if (object instanceof String) {
            String string = p[n];
            int n2 = string.indexOf(8);
            Class clazz = bR.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = bR.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = bR.a(clazz3, string2, clazz2)) != null) {
                    bR.o[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = bR.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        bR.o[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = bR.b(310406162762728L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private Object c(Object[] objectArray) {
        Object object = objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l = k ^ l;
        long l3 = l2 ^ 0x137F9835A2CCL;
        long l4 = l2 ^ 0x66F753CE4F3AL;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = this.j;
        objectArray2[2] = this.h;
        objectArray2[1] = this.i;
        objectArray2[0] = object;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        return bR.b("g", (Object)bR.b("\u00dc", (Object)objectArray2, (long)-608140885650264881L, (long)l), (Object)objectArray3, (long)-605981448676808246L, (long)l);
    }

    private void h(Object[] objectArray) {
        Object object = objectArray[0];
        Object object2 = objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = (l = k ^ l) ^ 0x2EC50C8EB3FAL;
        try {
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l2;
            objectArray2[0] = object;
            bR.b("g", (Object)this.g, (Object)bR.b("g", (Object)this, (Object)objectArray2, (long)755246085673471202L, (long)l), (Object)object2, (long)755692540706816841L, (long)l);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException(illegalAccessException);
        }
    }

    /*
     * Unable to fully structure code
     */
    public void f(Object[] var1_1) {
        block27: {
            block28: {
                block29: {
                    block25: {
                        block23: {
                            block24: {
                                var5_2 = var1_1[0];
                                var4_3 = var1_1[1];
                                var2_4 = (Long)var1_1[2];
                                v0 = var2_4 = bR.k ^ var2_4;
                                var6_5 = v0 ^ 54268476751541L;
                                var8_6 = v0 ^ 53130240507124L;
                                var10_7 = v0 ^ 66431625934049L;
                                var12_8 = bR.b("\u00dc", (long)-4090244340302039515L, (long)var2_4);
                                try {
                                    try {
                                        v1 = this.a;
                                        if (var12_8 != null) break block23;
                                        if (v1) break block24;
                                    }
                                    catch (RuntimeException v2) {
                                        throw bR.b("\u00dc", (Object)v2, (long)-4092544282277976970L, (long)var2_4);
                                    }
                                    v3 = new Object[3];
                                    v3[2] = var10_7;
                                    v3[1] = var4_3;
                                    v3[0] = var5_2;
                                    bR.b("g", (Object)this, (Object)v3, (long)-4092353307922206673L, (long)var2_4);
                                    return;
                                }
                                catch (RuntimeException v4) {
                                    throw bR.b("\u00dc", (Object)v4, (long)-4092544282277976970L, (long)var2_4);
                                }
                            }
                            try {
                                v5 = this;
                                if (var12_8 != null) break block25;
                                v1 = v5.e;
                            }
                            catch (RuntimeException v6) {
                                throw bR.b("\u00dc", (Object)v6, (long)-4092544282277976970L, (long)var2_4);
                            }
                        }
                        try {
                            block26: {
                                try {
                                    if (!v1) break block26;
                                    v7 = new Object[2];
                                    v7[1] = var6_5;
                                    v7[0] = var5_2;
                                    bR.b("g", (Object)cU.a, (Object)bR.b("g", (Object)this, (Object)v7, (long)-4092589199648390739L, (long)var2_4), (long)this.b, (Object)var4_3, (long)-4095151492964791418L, (long)var2_4);
                                    if (var12_8 == null) break block27;
                                }
                                catch (RuntimeException v8) {
                                    throw bR.b("\u00dc", (Object)v8, (long)-4092544282277976970L, (long)var2_4);
                                }
                            }
                            v5 = this;
                        }
                        catch (RuntimeException v9) {
                            throw bR.b("\u00dc", (Object)v9, (long)-4092544282277976970L, (long)var2_4);
                        }
                    }
                    try {
                        block30: {
                            try {
                                try {
                                    try {
                                        try {
                                            if (var12_8 != null) break block28;
                                            if (v5.f != null) {
                                            }
                                            ** GOTO lbl89
                                        }
                                        catch (RuntimeException v10) {
                                            throw bR.b("\u00dc", (Object)v10, (long)-4092544282277976970L, (long)var2_4);
                                        }
                                        v11 = this;
                                        if (var12_8 != null) break block29;
                                    }
                                    catch (RuntimeException v12) {
                                        throw bR.b("\u00dc", (Object)v12, (long)-4092544282277976970L, (long)var2_4);
                                    }
                                    if (!v11.d) break block30;
                                }
                                catch (RuntimeException v13) {
                                    throw bR.b("\u00dc", (Object)v13, (long)-4092544282277976970L, (long)var2_4);
                                }
                                this.f.set(var4_3);
                                if (var12_8 == null) break block27;
                            }
                            catch (RuntimeException v14) {
                                throw bR.b("\u00dc", (Object)v14, (long)-4092544282277976970L, (long)var2_4);
                            }
                        }
                        v11 = this;
                    }
                    catch (RuntimeException v15) {
                        throw bR.b("\u00dc", (Object)v15, (long)-4092544282277976970L, (long)var2_4);
                    }
                }
                try {
                    v11.f.set(var5_2, var4_3);
                    if (var12_8 == null) break block27;
lbl89:
                    // 2 sources

                    v5 = this;
                }
                catch (RuntimeException v16) {
                    throw bR.b("\u00dc", (Object)v16, (long)-4092544282277976970L, (long)var2_4);
                }
            }
            v17 = new Object[3];
            v17[2] = var8_6;
            v17[1] = var4_3;
            v17[0] = var5_2;
            bR.b("g", (Object)v5, (Object)v17, (long)-4091773335417055897L, (long)var2_4);
        }
    }

    private Object d(Object[] objectArray) {
        Object object = objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = k ^ l) ^ 0x6CF4CA26530CL;
        try {
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l2;
            objectArray2[0] = object;
            return bR.b("g", (Object)this.g, (Object)bR.b("g", (Object)this, (Object)objectArray2, (long)-1545457730062734316L, (long)l), (long)-1546190144955610766L, (long)l);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException(illegalAccessException);
        }
    }

    private static Method d(long l, long l2) {
        int n = bR.a(l, l2);
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
                clazz3 = bR.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = bR.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = bR.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        bR.o[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = bR.b(310406162762728L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = bR.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        bR.o[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = bR.b(310406162762728L, 0L);
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

    /*
     * Unable to fully structure code
     */
    public void d(Object[] var1_1) {
        block27: {
            block28: {
                block29: {
                    block25: {
                        block23: {
                            block24: {
                                var6_2 = var1_1[0];
                                var2_3 = (Long)var1_1[1];
                                var4_4 = (Long)var1_1[2];
                                v0 = var4_4 = bR.k ^ var4_4;
                                var7_5 = v0 ^ 14442907906973L;
                                var9_6 = v0 ^ 13382115586524L;
                                var11_7 = v0 ^ 80737565129L;
                                var13_8 = bR.b("\u00dc", (long)-8496968650109158643L, (long)var4_4);
                                try {
                                    try {
                                        v1 = this.a;
                                        if (var13_8 != null) break block23;
                                        if (v1) break block24;
                                    }
                                    catch (RuntimeException v2) {
                                        throw bR.b("\u00dc", (Object)v2, (long)-8494808346121885346L, (long)var4_4);
                                    }
                                    v3 = new Object[3];
                                    v3[2] = var11_7;
                                    v3[1] = bR.b("\u00dc", (long)var2_3, (long)-8494094190665248554L, (long)var4_4);
                                    v3[0] = var6_2;
                                    bR.b("g", (Object)this, (Object)v3, (long)-8494573807380153081L, (long)var4_4);
                                    return;
                                }
                                catch (RuntimeException v4) {
                                    throw bR.b("\u00dc", (Object)v4, (long)-8494808346121885346L, (long)var4_4);
                                }
                            }
                            try {
                                v5 = this;
                                if (var13_8 != null) break block25;
                                v1 = v5.e;
                            }
                            catch (RuntimeException v6) {
                                throw bR.b("\u00dc", (Object)v6, (long)-8494808346121885346L, (long)var4_4);
                            }
                        }
                        try {
                            block26: {
                                try {
                                    if (!v1) break block26;
                                    v7 = new Object[2];
                                    v7[1] = var7_5;
                                    v7[0] = var6_2;
                                    bR.b("g", (Object)cU.a, (Object)bR.b("g", (Object)this, (Object)v7, (long)-8494897514406097787L, (long)var4_4), (long)this.b, (long)var2_3, (long)-8501725553368372484L, (long)var4_4);
                                    if (var13_8 == null) break block27;
                                }
                                catch (RuntimeException v8) {
                                    throw bR.b("\u00dc", (Object)v8, (long)-8494808346121885346L, (long)var4_4);
                                }
                            }
                            v5 = this;
                        }
                        catch (RuntimeException v9) {
                            throw bR.b("\u00dc", (Object)v9, (long)-8494808346121885346L, (long)var4_4);
                        }
                    }
                    try {
                        block30: {
                            try {
                                try {
                                    try {
                                        try {
                                            if (var13_8 != null) break block28;
                                            if (v5.f != null) {
                                            }
                                            ** GOTO lbl89
                                        }
                                        catch (RuntimeException v10) {
                                            throw bR.b("\u00dc", (Object)v10, (long)-8494808346121885346L, (long)var4_4);
                                        }
                                        v11 = this;
                                        if (var13_8 != null) break block29;
                                    }
                                    catch (RuntimeException v12) {
                                        throw bR.b("\u00dc", (Object)v12, (long)-8494808346121885346L, (long)var4_4);
                                    }
                                    if (!v11.d) break block30;
                                }
                                catch (RuntimeException v13) {
                                    throw bR.b("\u00dc", (Object)v13, (long)-8494808346121885346L, (long)var4_4);
                                }
                                this.f.set(var2_3);
                                if (var13_8 == null) break block27;
                            }
                            catch (RuntimeException v14) {
                                throw bR.b("\u00dc", (Object)v14, (long)-8494808346121885346L, (long)var4_4);
                            }
                        }
                        v11 = this;
                    }
                    catch (RuntimeException v15) {
                        throw bR.b("\u00dc", (Object)v15, (long)-8494808346121885346L, (long)var4_4);
                    }
                }
                try {
                    v11.f.set(var6_2, var2_3);
                    if (var13_8 == null) break block27;
lbl89:
                    // 2 sources

                    v5 = this;
                }
                catch (RuntimeException v16) {
                    throw bR.b("\u00dc", (Object)v16, (long)-8494808346121885346L, (long)var4_4);
                }
            }
            v17 = new Object[3];
            v17[2] = var9_6;
            v17[1] = bR.b("\u00dc", (long)var2_3, (long)-8494094190665248554L, (long)var4_4);
            v17[0] = var6_2;
            bR.b("g", (Object)v5, (Object)v17, (long)-8494028946228160433L, (long)var4_4);
        }
    }

    public long a(Object[] objectArray) {
        Object object;
        long l;
        block20: {
            long l2;
            Object object2;
            block21: {
                Object object3;
                block24: {
                    bR bR2;
                    block22: {
                        block23: {
                            bR bR3;
                            CallSite callSite;
                            block19: {
                                boolean bl;
                                long l3;
                                block17: {
                                    block18: {
                                        object2 = objectArray[0];
                                        l = (Long)objectArray[1];
                                        long l4 = l = k ^ l;
                                        l2 = l4 ^ 0x6CDBB6DF0BBL;
                                        long l5 = l4 ^ 0x747C4D91EDA6L;
                                        l3 = l4 ^ 0x45F5799ED20CL;
                                        callSite = bR.b("\u00dc", (long)7747876771611482780L, (long)l);
                                        try {
                                            try {
                                                bl = this.a;
                                                if (callSite != null) break block17;
                                                if (bl) break block18;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw bR.b("\u00dc", (Object)runtimeException, (long)7749894543089748175L, (long)l);
                                            }
                                            Object[] objectArray2 = new Object[2];
                                            objectArray2[1] = l5;
                                            objectArray2[0] = object2;
                                            return (long)bR.b("g", (Object)((Number)((Object)bR.b("g", (Object)this, (Object)objectArray2, (long)7749404056607133038L, (long)l))), (long)7749564853052722677L, (long)l);
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw bR.b("\u00dc", (Object)runtimeException, (long)7749894543089748175L, (long)l);
                                        }
                                    }
                                    try {
                                        bR3 = this;
                                        if (callSite != null) break block19;
                                        bl = bR3.e;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw bR.b("\u00dc", (Object)runtimeException, (long)7749894543089748175L, (long)l);
                                    }
                                }
                                try {
                                    if (bl) {
                                        Object[] objectArray3 = new Object[2];
                                        objectArray3[1] = l3;
                                        objectArray3[0] = object2;
                                        return (long)bR.b("g", (Object)cU.a, (Object)bR.b("g", (Object)this, (Object)objectArray3, (long)7749929012683746580L, (long)l), (long)this.b, (long)7750110951947125468L, (long)l);
                                    }
                                }
                                catch (RuntimeException runtimeException) {
                                    throw bR.b("\u00dc", (Object)runtimeException, (long)7749894543089748175L, (long)l);
                                }
                                bR3 = this;
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            object = bR3.f;
                                            if (callSite != null) break block20;
                                            if (object == null) break block21;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw bR.b("\u00dc", (Object)runtimeException, (long)7749894543089748175L, (long)l);
                                        }
                                        bR2 = this;
                                        if (callSite != null) break block22;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw bR.b("\u00dc", (Object)runtimeException, (long)7749894543089748175L, (long)l);
                                    }
                                    if (!bR2.d) break block23;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw bR.b("\u00dc", (Object)runtimeException, (long)7749894543089748175L, (long)l);
                                }
                                object3 = this.f.get();
                                break block24;
                            }
                            catch (RuntimeException runtimeException) {
                                throw bR.b("\u00dc", (Object)runtimeException, (long)7749894543089748175L, (long)l);
                            }
                        }
                        bR2 = this;
                    }
                    object3 = bR2.f.get(object2);
                }
                return (long)bR.b("g", (Object)((Long)object3), (long)7748727920846046207L, (long)l);
            }
            Object[] objectArray4 = new Object[2];
            objectArray4[1] = l2;
            objectArray4[0] = object2;
            object = bR.b("g", (Object)this, (Object)objectArray4, (long)7749826565684228463L, (long)l);
        }
        return (long)bR.b("g", (Object)((Number)object), (long)7749564853052722677L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    public void a(Object[] var1_1) {
        block27: {
            block28: {
                block29: {
                    block25: {
                        block23: {
                            block24: {
                                var2_2 = var1_1[0];
                                var3_3 = (Double)var1_1[1];
                                var5_4 = (Long)var1_1[2];
                                v0 = var5_4 = bR.k ^ var5_4;
                                var7_5 = v0 ^ 65880657052537L;
                                var9_6 = v0 ^ 64742562627896L;
                                var11_7 = v0 ^ 60314311264557L;
                                var13_8 = bR.b("\u00dc", (long)-364647800621724695L, (long)var5_4);
                                try {
                                    try {
                                        v1 = this.a;
                                        if (var13_8 != null) break block23;
                                        if (v1) break block24;
                                    }
                                    catch (RuntimeException v2) {
                                        throw bR.b("\u00dc", (Object)v2, (long)-362445105582450246L, (long)var5_4);
                                    }
                                    v3 = new Object[3];
                                    v3[2] = var11_7;
                                    v3[1] = bR.b("\u00dc", (double)var3_3, (long)-361266823842142040L, (long)var5_4);
                                    v3[0] = var2_2;
                                    bR.b("g", (Object)this, (Object)v3, (long)-362257293937947165L, (long)var5_4);
                                    return;
                                }
                                catch (RuntimeException v4) {
                                    throw bR.b("\u00dc", (Object)v4, (long)-362445105582450246L, (long)var5_4);
                                }
                            }
                            try {
                                v5 = this;
                                if (var13_8 != null) break block25;
                                v1 = v5.e;
                            }
                            catch (RuntimeException v6) {
                                throw bR.b("\u00dc", (Object)v6, (long)-362445105582450246L, (long)var5_4);
                            }
                        }
                        try {
                            block26: {
                                try {
                                    if (!v1) break block26;
                                    v7 = new Object[2];
                                    v7[1] = var7_5;
                                    v7[0] = var2_2;
                                    bR.b("g", (Object)cU.a, (Object)bR.b("g", (Object)this, (Object)v7, (long)-362476555681285023L, (long)var5_4), (long)this.b, (double)var3_3, (long)-364540499991308150L, (long)var5_4);
                                    if (var13_8 == null) break block27;
                                }
                                catch (RuntimeException v8) {
                                    throw bR.b("\u00dc", (Object)v8, (long)-362445105582450246L, (long)var5_4);
                                }
                            }
                            v5 = this;
                        }
                        catch (RuntimeException v9) {
                            throw bR.b("\u00dc", (Object)v9, (long)-362445105582450246L, (long)var5_4);
                        }
                    }
                    try {
                        block30: {
                            try {
                                try {
                                    try {
                                        try {
                                            if (var13_8 != null) break block28;
                                            if (v5.f != null) {
                                            }
                                            ** GOTO lbl89
                                        }
                                        catch (RuntimeException v10) {
                                            throw bR.b("\u00dc", (Object)v10, (long)-362445105582450246L, (long)var5_4);
                                        }
                                        v11 = this;
                                        if (var13_8 != null) break block29;
                                    }
                                    catch (RuntimeException v12) {
                                        throw bR.b("\u00dc", (Object)v12, (long)-362445105582450246L, (long)var5_4);
                                    }
                                    if (!v11.d) break block30;
                                }
                                catch (RuntimeException v13) {
                                    throw bR.b("\u00dc", (Object)v13, (long)-362445105582450246L, (long)var5_4);
                                }
                                this.f.set(var3_3);
                                if (var13_8 == null) break block27;
                            }
                            catch (RuntimeException v14) {
                                throw bR.b("\u00dc", (Object)v14, (long)-362445105582450246L, (long)var5_4);
                            }
                        }
                        v11 = this;
                    }
                    catch (RuntimeException v15) {
                        throw bR.b("\u00dc", (Object)v15, (long)-362445105582450246L, (long)var5_4);
                    }
                }
                try {
                    v11.f.set(var2_2, var3_3);
                    if (var13_8 == null) break block27;
lbl89:
                    // 2 sources

                    v5 = this;
                }
                catch (RuntimeException v16) {
                    throw bR.b("\u00dc", (Object)v16, (long)-362445105582450246L, (long)var5_4);
                }
            }
            v17 = new Object[3];
            v17[2] = var9_6;
            v17[1] = bR.b("\u00dc", (double)var3_3, (long)-361266823842142040L, (long)var5_4);
            v17[0] = var2_2;
            bR.b("g", (Object)v5, (Object)v17, (long)-361674020738619221L, (long)var5_4);
        }
    }

    private static long a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = bR.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
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
        MethodHandle methodHandle = bR.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'B' || c == '\u00a5' || c == '\u00cb' || c == 't') {
                field = bR.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'B' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00a5' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00cb' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = bR.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'g' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00dc' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private Object a(Object[] objectArray) {
        Object object;
        block4: {
            Object object2;
            block5: {
                object2 = objectArray[0];
                long l = (Long)objectArray[1];
                l = k ^ l;
                CallSite callSite = bR.b("\u00dc", (long)-4020985598974314197L, (long)l);
                try {
                    try {
                        object = this;
                        if (callSite != null) break block4;
                        if (!((bR)object).d) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw bR.b("\u00dc", (Object)runtimeException, (long)-4018826875788727432L, (long)l);
                    }
                    object = this.c;
                    break block4;
                }
                catch (RuntimeException runtimeException) {
                    throw bR.b("\u00dc", (Object)runtimeException, (long)-4018826875788727432L, (long)l);
                }
            }
            object = object2;
        }
        return object;
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

    private static long a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6732;
        if (m[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = bR.l[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])bR.n.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    bR.n.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/bR", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            bR.m[n2] = l4;
        }
        return m[n2];
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    public boolean a(Object[] objectArray) {
        Object object;
        long l;
        block20: {
            long l2;
            Object object2;
            block21: {
                Object object3;
                block24: {
                    bR bR2;
                    block22: {
                        block23: {
                            bR bR3;
                            CallSite callSite;
                            block19: {
                                boolean bl;
                                long l3;
                                block17: {
                                    block18: {
                                        object2 = objectArray[0];
                                        l = (Long)objectArray[1];
                                        long l4 = l = k ^ l;
                                        l2 = l4 ^ 0x1B8BD1C830A9L;
                                        long l5 = l4 ^ 0x693A27342DB4L;
                                        l3 = l4 ^ 0x58B3133B121EL;
                                        callSite = bR.b("\u00dc", (long)-6082144721176438130L, (long)l);
                                        try {
                                            try {
                                                bl = this.a;
                                                if (callSite != null) break block17;
                                                if (bl) break block18;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw bR.b("\u00dc", (Object)runtimeException, (long)-6080082419220772643L, (long)l);
                                            }
                                            Object[] objectArray2 = new Object[2];
                                            objectArray2[1] = l5;
                                            objectArray2[0] = object2;
                                            return (boolean)bR.b("g", (Object)((Boolean)((Object)bR.b("g", (Object)this, (Object)objectArray2, (long)-6081701556788408964L, (long)l))), (long)-6080279296465235518L, (long)l);
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw bR.b("\u00dc", (Object)runtimeException, (long)-6080082419220772643L, (long)l);
                                        }
                                    }
                                    try {
                                        bR3 = this;
                                        if (callSite != null) break block19;
                                        bl = bR3.e;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw bR.b("\u00dc", (Object)runtimeException, (long)-6080082419220772643L, (long)l);
                                    }
                                }
                                try {
                                    if (bl) {
                                        Object[] objectArray3 = new Object[2];
                                        objectArray3[1] = l3;
                                        objectArray3[0] = object2;
                                        return (boolean)bR.b("g", (Object)cU.a, (Object)bR.b("g", (Object)this, (Object)objectArray3, (long)-6080041852115358458L, (long)l), (long)this.b, (long)-6081420387659924739L, (long)l);
                                    }
                                }
                                catch (RuntimeException runtimeException) {
                                    throw bR.b("\u00dc", (Object)runtimeException, (long)-6080082419220772643L, (long)l);
                                }
                                bR3 = this;
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            object = bR3.f;
                                            if (callSite != null) break block20;
                                            if (object == null) break block21;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw bR.b("\u00dc", (Object)runtimeException, (long)-6080082419220772643L, (long)l);
                                        }
                                        bR2 = this;
                                        if (callSite != null) break block22;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw bR.b("\u00dc", (Object)runtimeException, (long)-6080082419220772643L, (long)l);
                                    }
                                    if (!bR2.d) break block23;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw bR.b("\u00dc", (Object)runtimeException, (long)-6080082419220772643L, (long)l);
                                }
                                object3 = this.f.get();
                                break block24;
                            }
                            catch (RuntimeException runtimeException) {
                                throw bR.b("\u00dc", (Object)runtimeException, (long)-6080082419220772643L, (long)l);
                            }
                        }
                        bR2 = this;
                    }
                    object3 = bR2.f.get(object2);
                }
                return (boolean)bR.b("g", (Object)((Boolean)object3), (long)-6080279296465235518L, (long)l);
            }
            Object[] objectArray4 = new Object[2];
            objectArray4[1] = l2;
            objectArray4[0] = object2;
            object = bR.b("g", (Object)this, (Object)objectArray4, (long)-6080150364670414467L, (long)l);
        }
        return (boolean)bR.b("g", (Object)((Boolean)object), (long)-6080279296465235518L, (long)l);
    }

    public float a(Object[] objectArray) {
        Object object;
        long l;
        block20: {
            long l2;
            Object object2;
            block21: {
                Object object3;
                block24: {
                    bR bR2;
                    block22: {
                        block23: {
                            bR bR3;
                            CallSite callSite;
                            block19: {
                                boolean bl;
                                long l3;
                                block17: {
                                    block18: {
                                        object2 = objectArray[0];
                                        l = (Long)objectArray[1];
                                        long l4 = l = k ^ l;
                                        l2 = l4 ^ 0x79A3036A7743L;
                                        long l5 = l4 ^ 0xB12F5966A5EL;
                                        l3 = l4 ^ 0x3A9BC19955F4L;
                                        callSite = bR.b("\u00dc", (long)-1405822712045068956L, (long)l);
                                        try {
                                            try {
                                                bl = this.a;
                                                if (callSite != null) break block17;
                                                if (bl) break block18;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw bR.b("\u00dc", (Object)runtimeException, (long)-1408123204033196233L, (long)l);
                                            }
                                            Object[] objectArray2 = new Object[2];
                                            objectArray2[1] = l5;
                                            objectArray2[0] = object2;
                                            return (float)bR.b("g", (Object)((Number)((Object)bR.b("g", (Object)this, (Object)objectArray2, (long)-1408757515817219434L, (long)l))), (long)-1409414239998242623L, (long)l);
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw bR.b("\u00dc", (Object)runtimeException, (long)-1408123204033196233L, (long)l);
                                        }
                                    }
                                    try {
                                        bR3 = this;
                                        if (callSite != null) break block19;
                                        bl = bR3.e;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw bR.b("\u00dc", (Object)runtimeException, (long)-1408123204033196233L, (long)l);
                                    }
                                }
                                try {
                                    if (bl) {
                                        Object[] objectArray3 = new Object[2];
                                        objectArray3[1] = l3;
                                        objectArray3[0] = object2;
                                        return (float)bR.b("g", (Object)cU.a, (Object)bR.b("g", (Object)this, (Object)objectArray3, (long)-1408157671617090836L, (long)l), (long)this.b, (long)-1408968660297306466L, (long)l);
                                    }
                                }
                                catch (RuntimeException runtimeException) {
                                    throw bR.b("\u00dc", (Object)runtimeException, (long)-1408123204033196233L, (long)l);
                                }
                                bR3 = this;
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            object = bR3.f;
                                            if (callSite != null) break block20;
                                            if (object == null) break block21;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw bR.b("\u00dc", (Object)runtimeException, (long)-1408123204033196233L, (long)l);
                                        }
                                        bR2 = this;
                                        if (callSite != null) break block22;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw bR.b("\u00dc", (Object)runtimeException, (long)-1408123204033196233L, (long)l);
                                    }
                                    if (!bR2.d) break block23;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw bR.b("\u00dc", (Object)runtimeException, (long)-1408123204033196233L, (long)l);
                                }
                                object3 = this.f.get();
                                break block24;
                            }
                            catch (RuntimeException runtimeException) {
                                throw bR.b("\u00dc", (Object)runtimeException, (long)-1408123204033196233L, (long)l);
                            }
                        }
                        bR2 = this;
                    }
                    object3 = bR2.f.get(object2);
                }
                return (float)bR.b("g", (Object)((Float)object3), (long)-1407959174531663397L, (long)l);
            }
            Object[] objectArray4 = new Object[2];
            objectArray4[1] = l2;
            objectArray4[0] = object2;
            object = bR.b("g", (Object)this, (Object)objectArray4, (long)-1408336553465743721L, (long)l);
        }
        return (float)bR.b("g", (Object)((Number)object), (long)-1409414239998242623L, (long)l);
    }

    public double a(Object[] objectArray) {
        Object object;
        long l;
        block20: {
            long l2;
            Object object2;
            block21: {
                Object object3;
                block24: {
                    bR bR2;
                    block22: {
                        block23: {
                            bR bR3;
                            CallSite callSite;
                            block19: {
                                boolean bl;
                                long l3;
                                block17: {
                                    block18: {
                                        object2 = objectArray[0];
                                        l = (Long)objectArray[1];
                                        long l4 = l = k ^ l;
                                        l2 = l4 ^ 0x21D5F57BD662L;
                                        long l5 = l4 ^ 0x53640387CB7FL;
                                        l3 = l4 ^ 0x62ED3788F4D5L;
                                        callSite = bR.b("\u00dc", (long)5574572090305100869L, (long)l);
                                        try {
                                            try {
                                                bl = this.a;
                                                if (callSite != null) break block17;
                                                if (bl) break block18;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw bR.b("\u00dc", (Object)runtimeException, (long)5572095264674311702L, (long)l);
                                            }
                                            Object[] objectArray2 = new Object[2];
                                            objectArray2[1] = l5;
                                            objectArray2[0] = object2;
                                            return (double)bR.b("g", (Object)((Number)((Object)bR.b("g", (Object)this, (Object)objectArray2, (long)5571602508035140535L, (long)l))), (long)5572893882749500080L, (long)l);
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw bR.b("\u00dc", (Object)runtimeException, (long)5572095264674311702L, (long)l);
                                        }
                                    }
                                    try {
                                        bR3 = this;
                                        if (callSite != null) break block19;
                                        bl = bR3.e;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw bR.b("\u00dc", (Object)runtimeException, (long)5572095264674311702L, (long)l);
                                    }
                                }
                                try {
                                    if (bl) {
                                        Object[] objectArray3 = new Object[2];
                                        objectArray3[1] = l3;
                                        objectArray3[0] = object2;
                                        return (double)bR.b("g", (Object)cU.a, (Object)bR.b("g", (Object)this, (Object)objectArray3, (long)5572184707570076621L, (long)l), (long)this.b, (long)5571120823680460469L, (long)l);
                                    }
                                }
                                catch (RuntimeException runtimeException) {
                                    throw bR.b("\u00dc", (Object)runtimeException, (long)5572095264674311702L, (long)l);
                                }
                                bR3 = this;
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            object = bR3.f;
                                            if (callSite != null) break block20;
                                            if (object == null) break block21;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw bR.b("\u00dc", (Object)runtimeException, (long)5572095264674311702L, (long)l);
                                        }
                                        bR2 = this;
                                        if (callSite != null) break block22;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw bR.b("\u00dc", (Object)runtimeException, (long)5572095264674311702L, (long)l);
                                    }
                                    if (!bR2.d) break block23;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw bR.b("\u00dc", (Object)runtimeException, (long)5572095264674311702L, (long)l);
                                }
                                object3 = this.f.get();
                                break block24;
                            }
                            catch (RuntimeException runtimeException) {
                                throw bR.b("\u00dc", (Object)runtimeException, (long)5572095264674311702L, (long)l);
                            }
                        }
                        bR2 = this;
                    }
                    object3 = bR2.f.get(object2);
                }
                return (double)bR.b("g", (Object)((Double)object3), (long)5571516909112849720L, (long)l);
            }
            Object[] objectArray4 = new Object[2];
            objectArray4[1] = l2;
            objectArray4[0] = object2;
            object = bR.b("g", (Object)this, (Object)objectArray4, (long)5572585699320289206L, (long)l);
        }
        return (double)bR.b("g", (Object)((Number)object), (long)5572893882749500080L, (long)l);
    }

    private static void a() {
        Object[] objectArray = o;
        o[0] = "\u0012G\u001ckmJ\u0004G\u00191~]\u0013\f\u001a7rI\u0002K\r 9[>";
        objectArray[1] = "\u000e)yNp#{\trAal\u0006\u0011aFh%n";
        objectArray[2] = "\u0018ly\u0015FJ\u000el|OU]\u0019'\u007fIYI\b`h^\u0012X.";
        objectArray[3] = "K[T\u0006Dr>{_\tU=_uT\u0002Qg+";
        objectArray[4] = "^\n\u0004N/>U\u0005\u0015\u0001N0^\u000e\u0011[";
        objectArray[5] = "hx\u001b\u0004:\u001ccw\nKZ\u0005o{\b\u0017";
        objectArray[6] = Long.TYPE;
        bR.p[6] = "java/lang/Long";
        objectArray[7] = "\u0000V\u0010|#vuv\u001bs29\u0014x\u0010x6c`";
        objectArray[8] = "\u0004\u0005\u000bW\n=\u000f\n\u001a\u0018v$\u0000\u0010\u0014[A\u0014\u0016\u0007\u0018FP8\u0001\n";
        objectArray[9] = "UZ?2mK^U.}\u000fHQ\\";
        objectArray[10] = "\u0015:\u0004xQ<`\u001a\u000fw@s\u0001\u0014\u0004|D)u";
        objectArray[11] = "E\u0019T2#6E\u000f\u0014I ,W\n_";
        objectArray[12] = "|KN\"bP\tkE-s\u001fheN&wE\u001c";
        objectArray[13] = Void.TYPE;
        bR.p[13] = "java/lang/Void";
        objectArray[14] = "@Yzb{H5yqmj\u0007Twzfn] ";
        objectArray[15] = Float.TYPE;
        bR.p[15] = "java/lang/Float";
        objectArray[16] = "{f\u00051D:pi\u0014~,:~f\u0007";
        objectArray[17] = "\u001boj<~\u0019\u0010`{s\"\u0010\u0017by>$[7gy14";
        objectArray[18] = "^\u0003H?p,H\u0003Mec;_HNco/N\u000fYt$>k";
        objectArray[19] = "\\9uJ\u0014<)\u0019~E\u0005sH\u0017uN\u0001)<";
        objectArray[20] = "GZ@\n|KQZEPo\\F\u0011FVcHWVQA(Xu";
        objectArray[21] = "Y\u0017]\u0005\u0004&,7V\n\u0015iM9]\u0001\u001139";
        objectArray[22] = "QU\u0001%f{ZZ\u0010j\fxNV\u001b!";
        objectArray[23] = Double.TYPE;
        bR.p[23] = "java/lang/Double";
        objectArray[24] = Integer.TYPE;
        bR.p[24] = "java/lang/Integer";
        objectArray[25] = "t\u000ejFI&\u007f\u0001{\t.$j\n{B\u0015";
        objectArray[26] = "B\u000b\t!\u001b\u0002I\u0004\u0018nw\u0001G\u0006\u001a![";
        objectArray[27] = Boolean.TYPE;
        bR.p[27] = "java/lang/Boolean";
        objectArray[28] = "'\f;34CR,0<%\f3\";7!VG";
        objectArray[29] = "T$k\u0017$\u000f\u0004z)\u0011BN\u0019aY\u001c%R\ttu{y\f]'v\u0016?F\u0002f\u0013G-Y\u000fr.\u0006=\b\u0007\u001dq\u0011-D\u0014pl\u0011rJd,r\u001e#M_qo\u0004,6";
        objectArray[30] = "zKF\u001bKo*\u0015\u0004\u001d-.7\u000er\u0010P<.\u001f>L\u0017op\u0017S\n]01r\u0002\u0018B=%OC\b\u00135J\u001d]\u0011Q'#\u001b]\u0018RV{\u0013[\u0016Vm&\u000eA\u0019-";
        objectArray[31] = ",\u001bZD-j}\u001a\u0004%(\u000e+\u0016P\u001ds?oFD\u0015B";
        objectArray[32] = "[\b\u001d\f0\f\u000bV_\nVZ\u0006M+\u00041\\\u00171^Zo\u000f\u000e\\\u0018\u00100Nk\r\n\u000f=ZVL\u001a^55\u0002_[XkTTW\u0004ZV";
        objectArray[33] = "n\u0019\\]d\u0014:\u0013\u000bP\u0004D\u0005\u001f\u0007M`S8\u0007\u0006@b->G\\\u0018a@x\r\u0003Y\u0004";
        objectArray[34] = "17qI\u000e:<|!\u001chx7r\u001d\u001dR:`kp[\u0018e!\u000e&\u001cQ9?c`V\u000exZ?|C\txabaY\u0006\u0003";
        objectArray[35] = "\nR\n,Ai\u0007\u0019Zy'?\f\u0017fx\u001di[\u000e\u000b>W6\u001ak]y\u001ej\u0004\u0006\u001b3A+a";
        objectArray[36] = "\u0005AJ\u000e\u000e3USM\u0014b9\f_X\u0010\u000f\u000b\u0002FO\u0019b:\bDN\u0005\u000b<\bMMt";
        objectArray[37] = ";x#\u0010)\u0011ss}RK\u0001\u0002c&\u0000/\u0014?{'\r-j9;}U.\u0007\u007fq\"\u0014K";
        objectArray[38] = "\u001eL\u007fkjG\u0018\u001e\u007fm\u0006D\u0017Ff8AT~Mj19Z\u000f\u0018y)t:\u001eL\u007fkjG\u0018\u001e\u007fm\u0006";
        objectArray[39] = " \u0010b#V-!Qsz<3{Oa\u001aU3aD\u000exS8wF39Ci\u007f)";
        objectArray[40] = "7\u0013j{m\u000bgM(}\u000b]jVSqw2<\u0010+-n_zZtl\u000b\u000ehEyx6Ox\u0014q\u0017dCc\u0015rf1P{X\u0012";
        objectArray[41] = ";$\fhvRkzNn\u0010\u0004fa>cw\u000fft\u0012\u0004+Q2'\u0011im\u001bmft8\u007f\u0004`rIyoUh\u001d\u0016n\u007f\u0019{p\u000bn \u0017\u000b";
        objectArray[42] = "q\u007f1Q>lp> \bTx)!4J\n\u007f);06=xs~`Wkp,|]";
        objectArray[43] = "*s\\5K\rz-\u001e3-Lg6j=J]fJ\u001fc\u0014\u000e\u007f'Y)KO\u001avK6F['7[gN4s$\u001aa\u0010U%,Ec-\u0005{/E\"\u0016Xf5JY";
        objectArray[44] = "eGB\tZ+9\u0006]\u000e%6<\u0010ShL6&\u001b<\nJ=0\u0019\u0001KZl8v";
        objectArray[45] = "Vd,(\u001ft\u0002n{%\u007f$=bw8\u001b3\u0000zv5\u0019M\fap6\u0004vQ|j9\u007f";
        objectArray[46] = "\fYO\u0003T`\\\u0007\r\u000526Q\u001c{\bO3X\r7T\b`\u0006\u0005Z\u0012B?G`\u000b\u0000]2S]J\u0010\f:<\u000fT\tN(U\tT\u0000MY";
        objectArray[47] = " #N\u0019i&p1I\u0003\u0005>'$K\u000eB.N/U\u0005y1')U\fz@ #N\u0019i&p1I\u0003\u0005";
        objectArray[48] = "\u0018\u0000+\u0011\u0004*C\u00004\u001ee$\u0010\r8\u001a\"4y\u000b/\u0018\u0017*\u0014\u0016/G\u0019Z\u0018\u0000+\u0011\u0004*C\u00004\u001ee";
        objectArray[49] = "H!\u001c\t}<\u0000*BK\u001f'q:\u0019\u0019{9L\"\u0018\u0014yG@9\u001e\u0017d|\u001d$\u0004\u0018\u001f";
        objectArray[50] = "6\n}YH\\fT?_.\nkOB_L\bmO\u0005\u000e\u0014\\<VhH^\u0003}39ZA\u000ei\u000exJ\u0010\u0006\u0006\b?\f\u0014\u0000kNuSUe";
        objectArray[51] = "\r.\u007f6&E\u001b4k1\u001cX\u000e!r;[Hg,ah$\u001b\u0006zi7&&\r.\u007f6&E\u001b4k1\u001c";
        objectArray[52] = "fJ59\u0018-g\u000b$`r6<\u000f\u00077\u0016*7s6/\u0016h:\u0002c<\u000e%Z";
        objectArray[53] = "K\u0001>e\u0012c\u001b_|ct\"\u0006D\u0007o\bZ@\u0002\u007f3\u00117\u0006H rtf\u0014W-fI'\u0004\u0006%\t\u001b+\u001f\u0007&xN8\u0007JF8\u0015?\u001aC}e\b%\u00158";
        objectArray[54] = "C^6DF0\u001f\u001f)C97\u0014\u000b5\u0016~'}S'\u0014R&@\u00127EZIC^6DF0\u001f\u001f)C9";
        objectArray[55] = "f)I4?+ghXmU==mO78\u000f3tX>U>9vY\"<89\u007fZS";
        objectArray[56] = "p\u0013@%\u0011kvA@#}wv\u0001zr\u0019k}}Kj\u0019)p\f\u001ey\u0001d\u0010";
        objectArray[57] = "\u007f+1\f/\u00187 oNM\fF04\u001c)\u001d{(5\u0011+cw33\u00126X*.)\u001dM";
        objectArray[58] = "g7,wRa<73x3{a9&|ZwX7&l^\u0011d4-cC|y4rm3";
        objectArray[59] = "j_&{K*\"Tx9)=SD#kM/n\\\"fOQh\u001cx>L<.V'\u007f)";
        objectArray[60] = "3\u0006\u0004~uU{\rZ<\u0017G\nA^bf_e\u000e\np|.4B\u0000pfA{\u0016\u0012j\u0017";
        objectArray[61] = "$0-V7\u0015l;s\u0014U\u0007\u001d+(F1\u0010 3)K3n&ss\u00130\u0003`9,RU";
        objectArray[62] = "CTcDD\u0007UNwC~\nMXzX \rMB~$\u0017\n\u0017\u0007.EA\u0002H\u0005\u0013";
        objectArray[63] = "K\u0010<M}.\u001bN~K\u001bx\u0016U\u0000F}x{\u0012~\u0018!r\u0016T4G`\u0017GF+Jt*\u0006VzB\u001b+\u0014F/N&j\u0004\u0017'!";
        objectArray[64] = "r\u0015E3|@z\u0016Q8\u0007K\u001e\u0006B5c_#\u001eC8a!u\u0000\u0019%g\u0018!\nN(\u0007";
        objectArray[65] = "<\u001bNeb\u0001lE\fc\u0004@q^qcfUg^62>\u00016G[tt^w\"\nfkSc\u001fKv:[\f\u0019\f0>]a_Fo\u007f8=CSh\u007f\u0003`^Ig\u0004";
        Object[] objectArray2 = objectArray;
        objectArray[66] = "ts\"bh\u0005$-`d\u000eD96\u001eihSDq`74Y)7*hu<x%5ea\u000195dm\u000e\u0000+%1a3A;t9\u000e?]!+!5b@;$Z";
    }

    private static int a(long l, long l2) {
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
            case 0 -> 0;
            case 1 -> 27;
            case 2 -> 16;
            case 3 -> 33;
            case 4 -> 39;
            case 5 -> 40;
            case 6 -> 22;
            case 7 -> 6;
            case 8 -> 8;
            case 9 -> 36;
            case 10 -> 12;
            case 11 -> 2;
            case 12 -> 7;
            case 13 -> 44;
            case 14 -> 35;
            case 15 -> 56;
            case 16 -> 49;
            case 17 -> 41;
            case 18 -> 42;
            case 19 -> 46;
            case 20 -> 10;
            case 21 -> 13;
            case 22 -> 47;
            case 23 -> 15;
            case 24 -> 34;
            case 25 -> 21;
            case 26 -> 17;
            case 27 -> 45;
            case 28 -> 51;
            case 29 -> 30;
            case 30 -> 11;
            case 31 -> 48;
            case 32 -> 25;
            case 33 -> 29;
            case 34 -> 19;
            case 35 -> 43;
            case 36 -> 50;
            case 37 -> 60;
            case 38 -> 4;
            case 39 -> 26;
            case 40 -> 31;
            case 41 -> 57;
            case 42 -> 53;
            case 43 -> 14;
            case 44 -> 38;
            case 45 -> 62;
            case 46 -> 55;
            case 47 -> 59;
            case 48 -> 23;
            case 49 -> 24;
            case 50 -> 28;
            case 51 -> 54;
            case 52 -> 20;
            case 53 -> 63;
            case 54 -> 3;
            case 55 -> 1;
            case 56 -> 58;
            case 57 -> 52;
            case 58 -> 9;
            case 59 -> 61;
            case 60 -> 37;
            case 61 -> 5;
            case 62 -> 18;
            default -> 32;
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
        bR.p[n3] = new String(cArray);
        return n3;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/bR" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public int a(Object[] objectArray) {
        Object object;
        long l;
        block20: {
            long l2;
            Object object2;
            block21: {
                Object object3;
                block24: {
                    bR bR2;
                    block22: {
                        block23: {
                            bR bR3;
                            CallSite callSite;
                            block19: {
                                boolean bl;
                                long l3;
                                block17: {
                                    block18: {
                                        object2 = objectArray[0];
                                        l = (Long)objectArray[1];
                                        long l4 = l = k ^ l;
                                        l2 = l4 ^ 0x3A3FB44601E3L;
                                        long l5 = l4 ^ 0x488E42BA1CFEL;
                                        l3 = l4 ^ 0x790776B52354L;
                                        callSite = bR.b("\u00dc", (long)-7287457319820137532L, (long)l);
                                        try {
                                            try {
                                                bl = this.a;
                                                if (callSite != null) break block17;
                                                if (bl) break block18;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw bR.b("\u00dc", (Object)runtimeException, (long)-7289897380526048873L, (long)l);
                                            }
                                            Object[] objectArray2 = new Object[2];
                                            objectArray2[1] = l5;
                                            objectArray2[0] = object2;
                                            return (int)bR.b("g", (Object)((Number)((Object)bR.b("g", (Object)this, (Object)objectArray2, (long)-7290389791422415818L, (long)l))), (long)-7289346319647221926L, (long)l);
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw bR.b("\u00dc", (Object)runtimeException, (long)-7289897380526048873L, (long)l);
                                        }
                                    }
                                    try {
                                        bR3 = this;
                                        if (callSite != null) break block19;
                                        bl = bR3.e;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw bR.b("\u00dc", (Object)runtimeException, (long)-7289897380526048873L, (long)l);
                                    }
                                }
                                try {
                                    if (bl) {
                                        Object[] objectArray3 = new Object[2];
                                        objectArray3[1] = l3;
                                        objectArray3[0] = object2;
                                        return (int)bR.b("g", (Object)cU.a, (Object)bR.b("g", (Object)this, (Object)objectArray3, (long)-7289784553681855412L, (long)l), (long)this.b, (long)-7291318753968682879L, (long)l);
                                    }
                                }
                                catch (RuntimeException runtimeException) {
                                    throw bR.b("\u00dc", (Object)runtimeException, (long)-7289897380526048873L, (long)l);
                                }
                                bR3 = this;
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            object = bR3.f;
                                            if (callSite != null) break block20;
                                            if (object == null) break block21;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw bR.b("\u00dc", (Object)runtimeException, (long)-7289897380526048873L, (long)l);
                                        }
                                        bR2 = this;
                                        if (callSite != null) break block22;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw bR.b("\u00dc", (Object)runtimeException, (long)-7289897380526048873L, (long)l);
                                    }
                                    if (!bR2.d) break block23;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw bR.b("\u00dc", (Object)runtimeException, (long)-7289897380526048873L, (long)l);
                                }
                                object3 = this.f.get();
                                break block24;
                            }
                            catch (RuntimeException runtimeException) {
                                throw bR.b("\u00dc", (Object)runtimeException, (long)-7289897380526048873L, (long)l);
                            }
                        }
                        bR2 = this;
                    }
                    object3 = bR2.f.get(object2);
                }
                return (int)bR.b("g", (Object)((Integer)object3), (long)-7290145137706776048L, (long)l);
            }
            Object[] objectArray4 = new Object[2];
            objectArray4[1] = l2;
            objectArray4[0] = object2;
            object = bR.b("g", (Object)this, (Object)objectArray4, (long)-7289965770487529417L, (long)l);
        }
        return (int)bR.b("g", (Object)((Number)object), (long)-7289346319647221926L, (long)l);
    }

    private void g(Object[] objectArray) {
        Object object = objectArray[0];
        Object object2 = objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l = k ^ l;
        long l3 = l2 ^ 0x6D108616EEC0L;
        long l4 = l2 ^ 0x5A4E6BF13AC4L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = this.j;
        objectArray2[2] = this.h;
        objectArray2[1] = this.i;
        objectArray2[0] = object;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = object2;
        bR.b("g", (Object)bR.b("\u00dc", (Object)objectArray2, (long)-9047362563082036943L, (long)l), (Object)objectArray3, (long)-9049397699260984690L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bR.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(bR.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


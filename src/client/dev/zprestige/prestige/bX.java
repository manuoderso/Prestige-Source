/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 *  org.joml.Vector4f
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bU;
import dev.zprestige.prestige.bW;
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
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_310;
import org.joml.Vector4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class bX {
    public bU a;
    public bW b;
    private int c;
    private int d;
    private static final class_310 e;
    private Vector4f f;
    private Vector4f g;
    private float h;
    private float i;
    private Color j;
    private boolean k;
    private long l;
    private static final long m;
    private static final long[] n;
    private static final Integer[] o;
    private static final Map p;
    private static final long q;
    private static final Object[] r;
    private static final String[] s;

    public bX(long l) {
        long l2 = l = m ^ l;
        long l3 = l2 ^ 0x3EA258626162L;
        long l4 = l2 ^ 0x43E27D43F414L;
        long l5 = l2 ^ 0x26DB40231549L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l3;
        this.a = bX.b("\u00ed", (Object)objectArray, (long)1833902674970963267L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l5;
        objectArray2[0] = (int)bX.a("g", (int)20972, (long)(0x2B4442ABC8CCB707L ^ l));
        this.b = bX.b("\u00ed", (Object)objectArray2, (long)1836351190439510632L, (long)l);
        this.f = new Vector4f(0.0f, 0.0f, 0.0f, 0.0f);
        this.g = new Vector4f(0.0f, 0.0f, 0.0f, 0.0f);
        this.k = 0;
        this.l = q;
        this.c = (int)bX.b("\u00cb", (Object)bX.b("\u00cb", (Object)e, (long)1833607974568773357L, (long)l), (long)1836655147939691908L, (long)l);
        this.d = (int)bX.b("\u00cb", (Object)bX.b("\u00cb", (Object)e, (long)1833607974568773357L, (long)l), (long)1836742013014800755L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        bX.b("\u00cb", (Object)this, (Object)objectArray3, (long)1833763645566672675L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            block11: {
                block10: {
                    bX.m = hc.a(3879086563379605418L, 320805795783205327L, MethodHandles.lookup().lookupClass()).a(3796466387008L);
                    var16 = bX.m ^ 97565771909163L;
                    bX.r = new Object[38];
                    bX.s = new String[38];
                    bX.a();
                    bX.p = new HashMap<K, V>(13);
                    var5_1 = Cipher.getInstance("DES/CBC/NoPadding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var16 >>> 56);
                    for (var6_2 = 1; var6_2 < 8; ++var6_2) {
                        v2 = v2;
                        v2[var6_2] = (byte)(var16 << var6_2 * 8 >>> 56);
                    }
                    var5_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var11_3 = new long[8];
                    var8_4 = 0;
                    var9_5 = "u\u00fe\u00c5\u001f@\u00ec\u001dl\u00ac\u00b5-ns\u00a8@H\u00f1\u0018\u00eb@\u00a5\u000f\u00e4r,\u00e6\u00d7W\u001b1 \u00d0\u00faE3\u0094\u00ec\u00bdI\u00d0w[7\u0004\u00d6\u00c3\u00de\u0015";
                    var10_6 = "u\u00fe\u00c5\u001f@\u00ec\u001dl\u00ac\u00b5-ns\u00a8@H\u00f1\u0018\u00eb@\u00a5\u000f\u00e4r,\u00e6\u00d7W\u001b1 \u00d0\u00faE3\u0094\u00ec\u00bdI\u00d0w[7\u0004\u00d6\u00c3\u00de\u0015".length();
                    var7_7 = 0;
                    while (true) {
                        var12_8 = var9_5.substring(var7_7, var7_7 += 8).getBytes("ISO-8859-1");
                        v3 = var11_3;
                        v4 = var8_4++;
                        v5 = ((long)var12_8[0] & 255L) << 56 | ((long)var12_8[1] & 255L) << 48 | ((long)var12_8[2] & 255L) << 40 | ((long)var12_8[3] & 255L) << 32 | ((long)var12_8[4] & 255L) << 24 | ((long)var12_8[5] & 255L) << 16 | ((long)var12_8[6] & 255L) << 8 | (long)var12_8[7] & 255L;
                        v6 = -1;
                        break block10;
                        break;
                    }
lbl41:
                    // 1 sources

                    while (true) {
                        v3[v4] = v7;
                        if (var7_7 < var10_6) ** continue;
                        var9_5 = "\"\u0087\u00b1\"\u00be[\u00a8\u00b3\u00d5\u00c0\u00d1\u00f53\u00de\u0018\u00bf";
                        var10_6 = "\"\u0087\u00b1\"\u00be[\u00a8\u00b3\u00d5\u00c0\u00d1\u00f53\u00de\u0018\u00bf".length();
                        var7_7 = 0;
                        while (true) {
                            var12_8 = var9_5.substring(var7_7, var7_7 += 8).getBytes("ISO-8859-1");
                            v3 = var11_3;
                            v4 = var8_4++;
                            v5 = ((long)var12_8[0] & 255L) << 56 | ((long)var12_8[1] & 255L) << 48 | ((long)var12_8[2] & 255L) << 40 | ((long)var12_8[3] & 255L) << 32 | ((long)var12_8[4] & 255L) << 24 | ((long)var12_8[5] & 255L) << 16 | ((long)var12_8[6] & 255L) << 8 | (long)var12_8[7] & 255L;
                            v6 = 0;
                            break block10;
                            break;
                        }
                        break;
                    }
lbl60:
                    // 1 sources

                    while (true) {
                        v3[v4] = v7;
                        if (var7_7 < var10_6) ** continue;
                        break block11;
                        break;
                    }
                }
                var13_9 = v5;
                var15_10 = var5_1.doFinal(new byte[]{(byte)(var13_9 >>> 56), (byte)(var13_9 >>> 48), (byte)(var13_9 >>> 40), (byte)(var13_9 >>> 32), (byte)(var13_9 >>> 24), (byte)(var13_9 >>> 16), (byte)(var13_9 >>> 8), (byte)var13_9});
                v7 = ((long)var15_10[0] & 255L) << 56 | ((long)var15_10[1] & 255L) << 48 | ((long)var15_10[2] & 255L) << 40 | ((long)var15_10[3] & 255L) << 32 | ((long)var15_10[4] & 255L) << 24 | ((long)var15_10[5] & 255L) << 16 | ((long)var15_10[6] & 255L) << 8 | (long)var15_10[7] & 255L;
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
            bX.n = var11_3;
            bX.o = new Integer[8];
            var0_11 = Cipher.getInstance("DES/CBC/NoPadding");
            v8 = SecretKeyFactory.getInstance("DES");
            v9 = new byte[8];
            v10 = v9;
            v9[0] = (byte)(var16 >>> 56);
            for (var1_12 = 1; var1_12 < 8; ++var1_12) {
                v10 = v10;
                v10[var1_12] = (byte)(var16 << var1_12 * 8 >>> 56);
            }
            break block12;
lbl93:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_11.init(2, (Key)v8.generateSecret(new DESKeySpec(v10)), new IvParameterSpec(new byte[8]));
        var2_13 = -7318409279493791718L;
        var4_14 = var0_11.doFinal(new byte[]{(byte)(var2_13 >>> 56), (byte)(var2_13 >>> 48), (byte)(var2_13 >>> 40), (byte)(var2_13 >>> 32), (byte)(var2_13 >>> 24), (byte)(var2_13 >>> 16), (byte)(var2_13 >>> 8), (byte)var2_13});
        ** while (true)
        bX.q = ((long)var4_14[0] & 255L) << 56 | ((long)var4_14[1] & 255L) << 48 | ((long)var4_14[2] & 255L) << 40 | ((long)var4_14[3] & 255L) << 32 | ((long)var4_14[4] & 255L) << 24 | ((long)var4_14[5] & 255L) << 16 | ((long)var4_14[6] & 255L) << 8 | (long)var4_14[7] & 255L;
        bX.e = bX.b("\u00ed", (long)6836783685517193554L, (long)var16);
    }

    public void e(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        this.h = f;
    }

    public Vector4f b(Object[] objectArray) {
        return this.g;
    }

    public float b(Object[] objectArray) {
        return this.i;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = bX.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = bX.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = bX.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = bX.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = bX.a(l, l2);
            object = r[n];
            try {
                if (!(object instanceof String)) break block2;
                bX.r[n] = clazz = Class.forName(s[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/bX" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void b(Object[] objectArray) {
        block11: {
            bX bX2;
            long l;
            long l2;
            block10: {
                block9: {
                    Object object;
                    block8: {
                        l2 = (Long)objectArray[0];
                        l = (Long)objectArray[1];
                        long l3 = (l = m ^ l) ^ 0x6B8FD10C5315L;
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l3;
                        CallSite callSite = bX.b("\u00cb", (Object)this, (Object)objectArray2, (long)-3905031310802605006L, (long)l);
                        CallSite callSite2 = bX.b("\u00ed", (long)-3908954264469223498L, (long)l);
                        try {
                            try {
                                try {
                                    object = callSite;
                                    if (callSite2 != null) break block8;
                                    if (object != false) break block9;
                                }
                                catch (MatchException matchException) {
                                    throw bX.b("\u00ed", (Object)matchException, (long)-3908188634650185570L, (long)l);
                                }
                                bX2 = this;
                                if (callSite2 != null) break block10;
                            }
                            catch (MatchException matchException) {
                                throw bX.b("\u00ed", (Object)matchException, (long)-3908188634650185570L, (long)l);
                            }
                            long l4 = bX2.l - l2;
                            object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                        }
                        catch (MatchException matchException) {
                            throw bX.b("\u00ed", (Object)matchException, (long)-3908188634650185570L, (long)l);
                        }
                    }
                    if (object == false) break block11;
                }
                bX2 = this;
            }
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = l2;
            bX.b("\u00cb", (Object)bX2, (Object)objectArray3, (long)-3908629828899434898L, (long)l);
        }
    }

    private static Field c(long l, long l2) {
        int n = bX.a(l, l2);
        Object object = r[n];
        if (object instanceof String) {
            String string = s[n];
            int n2 = string.indexOf(8);
            Class clazz = bX.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = bX.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = bX.a(clazz3, string2, clazz2)) != null) {
                    bX.r[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = bX.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        bX.r[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = bX.b(1447518472077211L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void c(Object[] objectArray) {
        long l = (Long)objectArray[0];
        this.l = l;
    }

    public void h(Object[] objectArray) {
        Color color = (Color)objectArray[0];
        this.j = color;
    }

    public void f(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        this.i = f;
    }

    public void d(Object[] objectArray) {
        Vector4f vector4f = (Vector4f)objectArray[0];
        this.f = vector4f;
    }

    private static Method d(long l, long l2) {
        int n = bX.a(l, l2);
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
                clazz3 = bX.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = bX.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = bX.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        bX.r[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = bX.b(1447518472077211L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = bX.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        bX.r[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = bX.b(1447518472077211L, 0L);
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
                                            l = (l2 = m ^ l2) ^ 0x799E2E73617EL;
                                            callSite3 = bX.b("\u00ed", (long)-8351731877613862290L, (long)l2);
                                            try {
                                                try {
                                                    callSite4 = bX.b("\u00cb", (Object)e, (long)-8351799336806493305L, (long)l2);
                                                    if (callSite3 != null) break block18;
                                                    if (callSite4 != null) break block19;
                                                }
                                                catch (MatchException matchException) {
                                                    throw bX.b("\u00ed", (Object)matchException, (long)-8350947006073424570L, (long)l2);
                                                }
                                                return false;
                                            }
                                            catch (MatchException matchException) {
                                                throw bX.b("\u00ed", (Object)matchException, (long)-8350947006073424570L, (long)l2);
                                            }
                                        }
                                        callSite4 = bX.b("\u00cb", (Object)e, (long)-8351799336806493305L, (long)l2);
                                    }
                                    callSite2 = bX.b("\u00cb", (Object)callSite4, (long)-8352164807072880402L, (long)l2);
                                    callSite = bX.b("\u00cb", (Object)bX.b("\u00cb", (Object)e, (long)-8351799336806493305L, (long)l2), (long)-8352117522736550887L, (long)l2);
                                    try {
                                        try {
                                            try {
                                                object2 = callSite2;
                                                if (callSite3 != null) break block20;
                                                if (object2 <= 0) break block21;
                                            }
                                            catch (MatchException matchException) {
                                                throw bX.b("\u00ed", (Object)matchException, (long)-8350947006073424570L, (long)l2);
                                            }
                                            object = callSite;
                                            if (callSite3 != null) break block22;
                                        }
                                        catch (MatchException matchException) {
                                            throw bX.b("\u00ed", (Object)matchException, (long)-8350947006073424570L, (long)l2);
                                        }
                                        if (object > 0) break block23;
                                    }
                                    catch (MatchException matchException) {
                                        throw bX.b("\u00ed", (Object)matchException, (long)-8350947006073424570L, (long)l2);
                                    }
                                }
                                object2 = 0;
                            }
                            return (boolean)object2;
                        }
                        object = this.c;
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
                                        throw bX.b("\u00ed", (Object)matchException, (long)-8350947006073424570L, (long)l2);
                                    }
                                    n = this.d;
                                    if (callSite3 != null) break block26;
                                }
                                catch (MatchException matchException) {
                                    throw bX.b("\u00ed", (Object)matchException, (long)-8350947006073424570L, (long)l2);
                                }
                                if (n == callSite) break block27;
                            }
                            catch (MatchException matchException) {
                                throw bX.b("\u00ed", (Object)matchException, (long)-8350947006073424570L, (long)l2);
                            }
                        }
                        this.c = (int)callSite2;
                        this.d = (int)callSite;
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l;
                        bX.b("\u00cb", (Object)this, (Object)objectArray2, (long)-8351665827800004023L, (long)l2);
                        object = 1;
                    }
                    catch (MatchException matchException) {
                        throw bX.b("\u00ed", (Object)matchException, (long)-8350947006073424570L, (long)l2);
                    }
                }
                return (boolean)object;
            }
            n = 0;
        }
        return n != 0;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c7' || c == 't' || c == '\u00dc' || c == '\u00e9') {
                field = bX.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c7' ? lookup.findGetter(clazz, string2, clazz2) : (c == 't' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00dc' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = bX.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00cb' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ed' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
                long l6 = l = m ^ l;
                l5 = l6 ^ 0x43897CF78554L;
                l4 = l6 ^ 0x2F3827FD4488L;
                l3 = l6 ^ 0x246334F9F790L;
                l2 = l6 ^ 0x4A6228DC90B0L;
                CallSite callSite = bX.b("\u00ed", (long)-312005256060897827L, (long)l);
                try {
                    try {
                        object = this.k;
                        if (callSite != null) break block4;
                        if (object == 0) break block5;
                    }
                    catch (MatchException matchException) {
                        throw bX.b("\u00ed", (Object)matchException, (long)-312928476819897611L, (long)l);
                    }
                    bX.b("\u00cb", (Object)this.b, (long)-312811395027353682L, (long)l);
                }
                catch (MatchException matchException) {
                    throw bX.b("\u00ed", (Object)matchException, (long)-312928476819897611L, (long)l);
                }
            }
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l3;
            objectArray2[0] = (int)bX.a("g", (int)30658, (long)(0x7D04CCB4CE75F3F2L ^ l));
            this.b = bX.b("\u00ed", (Object)objectArray2, (long)-313839007759228751L, (long)l);
            Object[] objectArray3 = new Object[4];
            objectArray3[3] = l5;
            objectArray3[2] = this.d;
            objectArray3[1] = this.c;
            objectArray3[0] = (int)bX.a("g", (int)841, (long)(0x5AA202D54471877CL ^ l));
            bX.b("\u00cb", (Object)this.b, (Object)objectArray3, (long)-312236416058628264L, (long)l);
            Object[] objectArray4 = new Object[2];
            objectArray4[1] = l4;
            objectArray4[0] = (int)bX.a("g", (int)18638, (long)(0x3C1FB4523C734CF8L ^ l));
            bX.b("\u00cb", (Object)this.b, (Object)objectArray4, (long)-313762908514153786L, (long)l);
            Object[] objectArray5 = new Object[2];
            objectArray5[1] = l2;
            objectArray5[0] = (int)bX.a("g", (int)14152, (long)(0x15F9A8FB91A3B37FL ^ l));
            bX.b("\u00cb", (Object)this.b, (Object)objectArray5, (long)-312770570249783981L, (long)l);
            bX.b("\u00ed", (int)bX.a("g", (int)27436, (long)(0x1864C347ED896F18L ^ l)), (int)this.a.a, (long)-313583658530367736L, (long)l);
            bX.b("\u00ed", (int)bX.a("g", (int)17702, (long)(0x4A825FA6D6F7C117L ^ l)), (int)bX.a("g", (int)29281, (long)(0x3915CE6057427652L ^ l)), (int)bX.a("g", (int)30658, (long)(0x7D04CCB4CE75F3F2L ^ l)), (int)this.b.a, (int)0, (long)-312100294782864715L, (long)l);
            object = bX.a("g", (int)17702, (long)(0x4A825FA6D6F7C117L ^ l));
        }
        bX.b("\u00ed", (int)object, (int)0, (long)-313583658530367736L, (long)l);
        this.k = 1;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = bX.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7F98;
        if (o[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = bX.n[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])p.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    p.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/bX", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            bX.o[n2] = n3;
        }
        return o[n2];
    }

    public Color a(Object[] objectArray) {
        return this.j;
    }

    public Vector4f a(Object[] objectArray) {
        return this.f;
    }

    public float a(Object[] objectArray) {
        return this.h;
    }

    private static void a() {
        Object[] objectArray = r;
        r[0] = "YLO(LtYLXt@{C\u0007Xj@nDv\b7\u0011";
        objectArray[1] = "\"$UQ\u0003/4$P\u000b\u00108#oS\r\u001c,2(D\u001aW=\u001e";
        objectArray[2] = "\t`sdMp\u0002ob+.}\u0017bm@\u001b\u007f\u0006qql\fr";
        objectArray[3] = "PpHd\u0004-Pp_8\b\"J;_&\b7MJ\rz]u";
        objectArray[4] = "\u0011::J[\b\u0007:?\u0010H\u001f\u0010q<\u0016D\u000b\u00016+\u0001\u000f\u0019=";
        objectArray[5] = "]ekoL\u0014(E``][U]sgT\u0012=";
        objectArray[6] = "Dqzte>1Qq{tqP_zpp+$";
        objectArray[7] = Void.TYPE;
        bX.s[7] = "java/lang/Void";
        objectArray[8] = Integer.TYPE;
        bX.s[8] = "java/lang/Integer";
        objectArray[9] = "UC\u0016@HXCC\u0013\u001a[OT\b\u0010\u001cW[EO\u0007\u000b\u001cJd";
        objectArray[10] = "!XIV8\u000eTxBY)A5vIR-\u001bA";
        objectArray[11] = "NQL-\u0013>XQIw\u0000)O\u001aJq\f=^]]fG,}";
        objectArray[12] = "/4\u0005\\\u000bNZ\u0014\u000eS\u001a\u0001;\u001a\u0005X\u001e[O";
        objectArray[13] = "Nf@3\u0019V;FK<\b\u0019ZH@7\fC.";
        objectArray[14] = "/\u001cK6~\u001eZ<@9oQ;2K2k\u000bO";
        objectArray[15] = Boolean.TYPE;
        bX.s[15] = "java/lang/Boolean";
        objectArray[16] = "\"\u0013\u001e)\u00169W3\u0015&\u0007v6=\u001e-\u0003,B";
        objectArray[17] = "'q#5\u000f@\"d(5\fG-m#wMp\u00040t";
        objectArray[18] = "\u001d3\u0006vr2h\u0013\ryc}\t\u001d\u0006rg'}";
        objectArray[19] = "?|\u0001:2zJ\\\n5#5+R\u0001>'o_";
        objectArray[20] = "\u0001dkQt\u001a\nkz\u001e\u0015\u0014\u0001`~D";
        objectArray[21] = "\u0002<L\f\u000b'Vo\u0011Oa.;4\u000b\n\u0010\u007fPaJFYG\u0002w\f\u0006Y,W6@Oa";
        objectArray[22] = "\u00006$^>?Az{V\\,T`0R\\zP>9\u0005%\u007f^i3?";
        objectArray[23] = "Qfd'l\u0017\u0010*;/\u000e\u0002a;g%jWX)t7\u007fo\\7244\u0016Y9e>\u000e";
        objectArray[24] = "X\"QJ\u0013\u001fW`SH~\u001bWVU\u001a\u001b\u0019YeA\u001d\u0013\u000eou_\u000f\u0003\u000e^\"csC\u000bTuO\u0011\u0012\u0019R)/N\u0001\u0013^xM\u001f\u0013\u0015\u0002\u0018\u0012\f\u0019\u0019SzC\u001e\u001fE3%P\u0014\u0013\u0014QtB\u0012Ot\u000egH\u001e\u001e\u0016_uNB~IS!]I\u0007L]vWs";
        objectArray[25] = "\\\u0014Gkr\u0002_ZE\u001bv\u0010B\u0006\\wDG\u0004X\u000b \u0013GX__gq\u001d@\u0017\n\u001b";
        objectArray[26] = "I\u00170%wZ\u0000L?*\u001d\u000br\u0015<\u007frZLPkx&a";
        objectArray[27] = "{<\ni-r/oW*G{Ba[q#*{sHc6\u0012\u007fm\u000e`}kzcYjG";
        objectArray[28] = "D\u007f;*I\u0002G19ZM\u0010Zm 6\u007fD\u001b0~ZJ\u000fZ}&%IAX\r";
        objectArray[29] = "\u0016\u0004a^DwU\u000b;\r;c(\u000e=S_2\u0011\u001c.AJ\n\u0016\u0004a^DwU\u000b;\r;";
        objectArray[30] = "\u0001S\u007fpN\u0010@\u001f x,\u00031\u000e|rHP\b\u001co`]h\f\u0002)c\u0016\u0011\t\f~i,";
        objectArray[31] = "|\u0006b\u0007\u001ay(U?DprE[3\u001f\u0014!|I \r\u0001\u0019xWf\u000eJ`}Y1\u0004p";
        objectArray[32] = "?l\u0004yo\u001b~ [q\r\n\u000f1\u0007{i[6#\u0014i|c?l\u0004yo\u001b~ [q\r";
        objectArray[33] = "\u0017N#\"T7V\u0002|*6%'\u0013  Rw\u001e\u000132GO\u001a\u001fu1\f6\u001f\u0011\";6";
        objectArray[34] = "B>)\u0007R1\u0016mtD88{cx\u001f\\iBqk\rIQ\u0012ik\u0006J/\u001ea,\u001e8";
        objectArray[35] = "\u0019\f)XF\f\u0016N+Z+\b\u0016|6\u0007G)\b_2\fA\u001a\u001cX:\u001b+Z\rQ:\u0001I\u000b\u001fWfa\u0016\u0018\u0015[7\u0003G\n\u0013\u0007W\\K^\u0000\f.YE\t\n6";
        objectArray[36] = "8wR:~[bo\u001ao\u0002\\om\u000b9nn>-[o\u0002\u0004}v\u0006>`UopZ^";
        Object[] objectArray2 = objectArray;
        objectArray[37] = "Ya%Cv#\u0003ym\u0016\n$\u000e{|@f\u0016_:$\u0019\n|\u001c`qGh-\u000ef-'";
    }

    private static int a(long l, long l2) {
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
            case 0 -> 4;
            case 1 -> 38;
            case 2 -> 43;
            case 3 -> 40;
            case 4 -> 56;
            case 5 -> 28;
            case 6 -> 25;
            case 7 -> 14;
            case 8 -> 49;
            case 9 -> 37;
            case 10 -> 6;
            case 11 -> 3;
            case 12 -> 50;
            case 13 -> 17;
            case 14 -> 63;
            case 15 -> 19;
            case 16 -> 12;
            case 17 -> 1;
            case 18 -> 0;
            case 19 -> 62;
            case 20 -> 46;
            case 21 -> 39;
            case 22 -> 48;
            case 23 -> 30;
            case 24 -> 26;
            case 25 -> 9;
            case 26 -> 55;
            case 27 -> 36;
            case 28 -> 53;
            case 29 -> 31;
            case 30 -> 5;
            case 31 -> 29;
            case 32 -> 13;
            case 33 -> 11;
            case 34 -> 57;
            case 35 -> 52;
            case 36 -> 21;
            case 37 -> 58;
            case 38 -> 45;
            case 39 -> 33;
            case 40 -> 24;
            case 41 -> 18;
            case 42 -> 2;
            case 43 -> 7;
            case 44 -> 8;
            case 45 -> 44;
            case 46 -> 41;
            case 47 -> 27;
            case 48 -> 51;
            case 49 -> 47;
            case 50 -> 54;
            case 51 -> 20;
            case 52 -> 15;
            case 53 -> 16;
            case 54 -> 22;
            case 55 -> 42;
            case 56 -> 32;
            case 57 -> 35;
            case 58 -> 10;
            case 59 -> 34;
            case 60 -> 61;
            case 61 -> 23;
            case 62 -> 60;
            default -> 59;
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
        bX.s[n3] = new String(cArray);
        return n3;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/bX" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = bX.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public void g(Object[] objectArray) {
        Vector4f vector4f = (Vector4f)objectArray[0];
        this.g = vector4f;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bX.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(bX.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


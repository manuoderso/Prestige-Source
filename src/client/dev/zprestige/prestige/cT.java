/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aq_0;
import dev.zprestige.prestige.bW;
import dev.zprestige.prestige.cR;
import dev.zprestige.prestige.gK;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.x_0;
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
import org.joml.Matrix4f;

public class cT {
    private final String a;
    private final String b;
    private final long c;
    public final long d;
    public float e;
    public boolean f;
    public boolean g;
    private boolean h;
    private bW i;
    private final String j;
    private final Color k;
    private static final long l = hc.a(-2471003023512930226L, 8438204959865832722L, MethodHandles.lookup().lookupClass()).a(251657689879077L);
    private static final String[] m;
    private static final String[] n;
    private static final Map o;
    private static final long[] p;
    private static final Integer[] q;
    private static final Map r;
    private static final Object[] s;
    private static final String[] t;

    public cT(String string, String string2, long l, x_0 x_02, long l2) {
        l2 = cT.l ^ l2;
        this.a = string;
        this.b = string2;
        this.c = l;
        this.d = (long)cT.c("f", (long)397624904734990782L, (long)l2);
        this.e = 0.0f;
        this.f = 1;
        this.g = 0;
        this.h = 0;
        this.j = (String)((Object)cT.a("i", (int)19578, (long)(0xF3ADBA1C295036EL ^ l2))) + (String)((Object)cT.c("\u00a4", (Object)cT.c("\u00a4", (Object)((Object)x_02), (long)397747903409220067L, (long)l2), (long)398255476831484739L, (long)l2)) + (String)((Object)cT.a("i", (int)7732, (long)(0x7CC0318596935121L ^ l2)));
        this.k = x_02.a;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        s = new Object[48];
        t = new String[48];
        cT.a();
        o = new HashMap(13);
        long l = cT.l ^ 0x1DF695A9D229L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[2];
        int n = 0;
        String string = "\ts\u00e5h\u00ea\u00bdg\u00f0q\u008e\u00e8\u00ffu\u00e8\u00be\u00f3@I\u00dff\u00bd\u00b0H\u001a\u00bb\u001a}\u0013\u00b2\u00bd\u00a6t\u0010s\u00e3S\u00f2\u001d~m\u000b\u0082\u00e5YDf\u00c999\u00de`\u00b3\u00da\u00ec\u0087%\u00c5\nt\u0003BI \u00e5\u00efr_\n@\u008fe\u007f\\MKHq\u00a6\u00beF\u00fd";
        int n2 = "\ts\u00e5h\u00ea\u00bdg\u00f0q\u008e\u00e8\u00ffu\u00e8\u00be\u00f3@I\u00dff\u00bd\u00b0H\u001a\u00bb\u001a}\u0013\u00b2\u00bd\u00a6t\u0010s\u00e3S\u00f2\u001d~m\u000b\u0082\u00e5YDf\u00c999\u00de`\u00b3\u00da\u00ec\u0087%\u00c5\nt\u0003BI \u00e5\u00efr_\n@\u008fe\u007f\\MKHq\u00a6\u00beF\u00fd".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = cT.a(byArray3).intern();
            if ((n4 += n3) >= n2) break;
            n3 = string.charAt(n4);
        }
        m = stringArray;
        cT.n = new String[2];
        r = new HashMap(13);
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray5 = byArray5;
            byArray5[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n6 = 0;
        String string2 = "\u00af\u008a\u00b39\u0092X3\u00d1\u00cd\u00bf\u00bb\u00e0G\u0010;\u00a8";
        int n7 = "\u00af\u008a\u00b39\u0092X3\u00d1\u00cd\u00bf\u00bb\u00e0G\u0010;\u00a8".length();
        int n8 = 0;
        do {
            byte[] byArray6 = string2.substring(n8, n8 += 8).getBytes("ISO-8859-1");
            int n9 = n6++;
            long l2 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
            byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n9] = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
        } while (n8 < n7);
        p = lArray;
        q = new Integer[2];
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = cT.a(l, l2);
            object = s[n];
            try {
                if (!(object instanceof String)) break block2;
                cT.s[n] = clazz = Class.forName(t[n]);
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
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cT" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6C4C;
        if (q[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = p[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])r.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    r.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/cT", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            cT.q[n2] = n3;
        }
        return q[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = cT.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = cT.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = cT.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = cT.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = cT.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cT" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(long l, long l2) {
        int n = cT.a(l, l2);
        Object object = s[n];
        if (object instanceof String) {
            String string = t[n];
            int n2 = string.indexOf(8);
            Class clazz = cT.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = cT.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = cT.a(clazz3, string2, clazz2)) != null) {
                    cT.s[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = cT.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        cT.s[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = cT.b(2113384632177982L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = cT.a(l, l2);
        Object object = s[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = t[n];
                int n3 = string2.indexOf(8);
                clazz3 = cT.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = cT.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = cT.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        cT.s[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = cT.b(2113384632177982L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = cT.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        cT.s[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = cT.b(2113384632177982L, 0L);
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

    public float a(Object[] objectArray) {
        float f;
        float f10;
        block43: {
            float f11;
            block44: {
                Object object;
                CallSite callSite;
                long l;
                long l2;
                long l3;
                long l4;
                long l5;
                long l6;
                long l7;
                long l8;
                float f12;
                float f13;
                float f14;
                gK gK2;
                aq_0 aq_02;
                Matrix4f matrix4f;
                block41: {
                    boolean bl;
                    block42: {
                        block39: {
                            reference cfr_temp_2;
                            block40: {
                                long l9;
                                block37: {
                                    block38: {
                                        cT cT2;
                                        block35: {
                                            block36: {
                                                matrix4f = (Matrix4f)objectArray[0];
                                                aq_02 = (aq_0)objectArray[1];
                                                gK2 = (gK)objectArray[2];
                                                f14 = ((Float)objectArray[3]).floatValue();
                                                f13 = ((Float)objectArray[4]).floatValue();
                                                f12 = ((Float)objectArray[5]).floatValue();
                                                f11 = ((Float)objectArray[6]).floatValue();
                                                bl = (Boolean)objectArray[7];
                                                l8 = (Long)objectArray[8];
                                                long l10 = l8 = cT.l ^ l8;
                                                long l11 = l10 ^ 0x58AD7D735A3DL;
                                                l7 = l10 ^ 0x132EC56B7CD3L;
                                                l6 = l10 ^ 0x3DEC2B38F168L;
                                                l9 = l10 ^ 0x6E20DE474FE7L;
                                                l5 = l10 ^ 0x1CA6126E554BL;
                                                l4 = l10 ^ 0xFDA0E433C31L;
                                                l3 = l10 ^ 0x30BC212ECE3EL;
                                                l2 = l10 ^ 0x5F6899C8EA74L;
                                                l = l10 ^ 0x561981B3F4B5L;
                                                callSite = cT.c("f", (long)-6916939908732399072L, (long)l8);
                                                try {
                                                    try {
                                                        cT2 = this;
                                                        if (callSite != null) break block35;
                                                        if (cT2.i != null) break block36;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw cT.c("f", (Object)matchException, (long)-6916457784262215088L, (long)l8);
                                                    }
                                                    Object[] objectArray2 = new Object[2];
                                                    objectArray2[1] = l11;
                                                    objectArray2[0] = this.j;
                                                    this.i = cT.c("f", (Object)objectArray2, (long)-6913590892425525767L, (long)l8);
                                                }
                                                catch (MatchException matchException) {
                                                    throw cT.c("f", (Object)matchException, (long)-6916457784262215088L, (long)l8);
                                                }
                                            }
                                            f14 += (f12 + 30.0f) * (1.0f - this.e);
                                            cT2 = this;
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        object = cT2.f;
                                                        if (callSite != null) break block37;
                                                        if (object == 0) break block38;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw cT.c("f", (Object)matchException, (long)-6916457784262215088L, (long)l8);
                                                    }
                                                    Object[] objectArray3 = new Object[4];
                                                    objectArray3[3] = l9;
                                                    objectArray3[2] = Float.valueOf(cR.d);
                                                    objectArray3[1] = Float.valueOf(1.0f);
                                                    objectArray3[0] = Float.valueOf(this.e);
                                                    this.e = (float)cT.c("f", (Object)objectArray3, (long)-6917528177170097068L, (long)l8);
                                                    float f15 = this.e - 0.99f;
                                                    object = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                                                    if (callSite != null) break block37;
                                                }
                                                catch (MatchException matchException) {
                                                    throw cT.c("f", (Object)matchException, (long)-6916457784262215088L, (long)l8);
                                                }
                                                if (object < 0) break block38;
                                            }
                                            catch (MatchException matchException) {
                                                throw cT.c("f", (Object)matchException, (long)-6916457784262215088L, (long)l8);
                                            }
                                            this.e = 1.0f;
                                            this.f = false;
                                        }
                                        catch (MatchException matchException) {
                                            throw cT.c("f", (Object)matchException, (long)-6916457784262215088L, (long)l8);
                                        }
                                    }
                                    object = this.g;
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                if (callSite != null) break block39;
                                                if (object == 0) break block40;
                                            }
                                            catch (MatchException matchException) {
                                                throw cT.c("f", (Object)matchException, (long)-6916457784262215088L, (long)l8);
                                            }
                                            Object[] objectArray4 = new Object[4];
                                            objectArray4[3] = l9;
                                            objectArray4[2] = Float.valueOf(cR.d * 2.0f);
                                            objectArray4[1] = Float.valueOf(0.0f);
                                            objectArray4[0] = Float.valueOf(this.e);
                                            this.e = (float)cT.c("f", (Object)objectArray4, (long)-6917528177170097068L, (long)l8);
                                            float f16 = this.e - 0.01f;
                                            object = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
                                            if (callSite != null) break block39;
                                        }
                                        catch (MatchException matchException) {
                                            throw cT.c("f", (Object)matchException, (long)-6916457784262215088L, (long)l8);
                                        }
                                        if (object > 0) break block40;
                                    }
                                    catch (MatchException matchException) {
                                        throw cT.c("f", (Object)matchException, (long)-6916457784262215088L, (long)l8);
                                    }
                                    this.e = 0.0f;
                                    this.h = true;
                                    return this.e * (f11 + 10.0f);
                                }
                                catch (MatchException matchException) {
                                    throw cT.c("f", (Object)matchException, (long)-6916457784262215088L, (long)l8);
                                }
                            }
                            object = (cfr_temp_2 = cT.c("f", (long)-6917307656500722630L, (long)l8) - this.d - this.c) == 0 ? 0 : (cfr_temp_2 < 0 ? -1 : 1);
                        }
                        try {
                            try {
                                try {
                                    try {
                                        if (callSite != null) break block41;
                                        if (object < 0) break block42;
                                    }
                                    catch (MatchException matchException) {
                                        throw cT.c("f", (Object)matchException, (long)-6916457784262215088L, (long)l8);
                                    }
                                    object = this.g;
                                    if (callSite != null) break block41;
                                }
                                catch (MatchException matchException) {
                                    throw cT.c("f", (Object)matchException, (long)-6916457784262215088L, (long)l8);
                                }
                                if (object != 0) break block42;
                            }
                            catch (MatchException matchException) {
                                throw cT.c("f", (Object)matchException, (long)-6916457784262215088L, (long)l8);
                            }
                            this.g = true;
                        }
                        catch (MatchException matchException) {
                            throw cT.c("f", (Object)matchException, (long)-6916457784262215088L, (long)l8);
                        }
                    }
                    object = bl;
                }
                try {
                    if (object == 0) {
                        return this.e * (f11 + 10.0f);
                    }
                }
                catch (MatchException matchException) {
                    throw cT.c("f", (Object)matchException, (long)-6916457784262215088L, (long)l8);
                }
                Object[] objectArray5 = new Object[10];
                objectArray5[9] = l6;
                objectArray5[8] = Float.valueOf(5.0f);
                objectArray5[7] = 5;
                objectArray5[6] = Float.valueOf(f11);
                objectArray5[5] = Float.valueOf(f12);
                objectArray5[4] = Float.valueOf(f13);
                objectArray5[3] = Float.valueOf(f14);
                objectArray5[2] = matrix4f;
                objectArray5[1] = gK2;
                objectArray5[0] = aq_02;
                cT.c("f", (Object)objectArray5, (long)-6916527981131449518L, (long)l8);
                Object[] objectArray6 = new Object[10];
                objectArray6[9] = l7;
                objectArray6[8] = Float.valueOf(5.0f);
                objectArray6[7] = new Color(0.05490196f, 0.05490196f, 0.05490196f, 150.0f * this.e / 255.0f);
                objectArray6[6] = Float.valueOf(f11);
                objectArray6[5] = Float.valueOf(f12);
                objectArray6[4] = Float.valueOf(f13);
                objectArray6[3] = Float.valueOf(f14);
                objectArray6[2] = matrix4f;
                objectArray6[1] = gK2;
                objectArray6[0] = aq_02;
                cT.c("f", (Object)objectArray6, (long)-6916591228808543254L, (long)l8);
                Object[] objectArray7 = new Object[3];
                objectArray7[2] = l4;
                objectArray7[1] = Float.valueOf(this.e);
                objectArray7[0] = this.k;
                Object[] objectArray8 = new Object[8];
                objectArray8[7] = l2;
                objectArray8[6] = cT.c("f", (Object)objectArray7, (long)-6916848241885921665L, (long)l8);
                objectArray8[5] = this.i;
                objectArray8[4] = matrix4f;
                objectArray8[3] = Float.valueOf(16.0f);
                objectArray8[2] = Float.valueOf(16.0f);
                objectArray8[1] = Float.valueOf(f13 + 6.0f);
                objectArray8[0] = Float.valueOf(f14 + 5.0f);
                cT.c("f", (Object)objectArray8, (long)-6917434779667864348L, (long)l8);
                Object[] objectArray9 = new Object[1];
                objectArray9[0] = l5;
                Object[] objectArray10 = new Object[3];
                objectArray10[2] = l4;
                objectArray10[1] = Float.valueOf(this.e);
                objectArray10[0] = cT.c("\u00ba", (long)-6916623751315978957L, (long)l8);
                Object[] objectArray11 = new Object[7];
                objectArray11[6] = l3;
                objectArray11[5] = cT.c("f", (Object)objectArray10, (long)-6916848241885921665L, (long)l8);
                objectArray11[4] = Float.valueOf(0.9f);
                objectArray11[3] = Float.valueOf(f13 + 2.0f);
                objectArray11[2] = Float.valueOf(f14 + 30.0f);
                objectArray11[1] = this.a;
                objectArray11[0] = matrix4f;
                cT.c("\u00a4", (Object)cT.c("\u00a4", (Object)cT.c("\u00ba", (long)-6917344044120511781L, (long)l8), (Object)objectArray9, (long)-6917036606990983607L, (long)l8), (Object)objectArray11, (long)-6917245915678937104L, (long)l8);
                Object[] objectArray12 = new Object[1];
                objectArray12[0] = l5;
                Object[] objectArray13 = new Object[3];
                objectArray13[2] = l4;
                objectArray13[1] = Float.valueOf(this.e);
                objectArray13[0] = new Color((int)cT.b("f", (int)16801, (long)(0x5BD10AC4A250DE7L ^ l8)), (int)cT.b("f", (int)20653, (long)(0x182781B741541CEAL ^ l8)), (int)cT.b("f", (int)20653, (long)(0x182781B741541CEAL ^ l8)));
                Object[] objectArray14 = new Object[7];
                objectArray14[6] = l3;
                objectArray14[5] = cT.c("f", (Object)objectArray13, (long)-6916848241885921665L, (long)l8);
                objectArray14[4] = Float.valueOf(0.8f);
                objectArray14[3] = Float.valueOf(f13 + 12.0f);
                objectArray14[2] = Float.valueOf(f14 + 30.0f);
                objectArray14[1] = this.b;
                objectArray14[0] = matrix4f;
                cT.c("\u00a4", (Object)cT.c("\u00a4", (Object)cT.c("\u00ba", (long)-6917344044120511781L, (long)l8), (Object)objectArray12, (long)-6917036606990983607L, (long)l8), (Object)objectArray14, (long)-6917245915678937104L, (long)l8);
                float f17 = 1.0f - cT.c("f", (float)0.0f, (float)(this.c - (cT.c("f", (long)-6917307656500722630L, (long)l8) - this.d)), (long)-6917030034366474307L, (long)l8) / (float)this.c;
                try {
                    try {
                        float f = f17;
                        f = 1.0f;
                        if (callSite != null) break block43;
                        if (!(f10 < f)) break block44;
                    }
                    catch (MatchException matchException) {
                        throw cT.c("f", (Object)matchException, (long)-6916457784262215088L, (long)l8);
                    }
                    Object[] objectArray15 = new Object[8];
                    objectArray15[7] = l;
                    objectArray15[6] = Float.valueOf(3.0f);
                    objectArray15[5] = this.k;
                    objectArray15[4] = Float.valueOf(f13 + f11 - 1.0f);
                    objectArray15[3] = Float.valueOf(f14 + 8.0f + (f12 - 4.0f - (f12 - 4.0f) * f17 - 4.0f));
                    objectArray15[2] = Float.valueOf(f13 + f11 - 6.0f);
                    objectArray15[1] = Float.valueOf(f14 + 2.0f);
                    objectArray15[0] = matrix4f;
                    cT.c("f", (Object)objectArray15, (long)-6916719987871391440L, (long)l8);
                }
                catch (MatchException matchException) {
                    throw cT.c("f", (Object)matchException, (long)-6916457784262215088L, (long)l8);
                }
            }
            float f = this.e;
            f = f11 + 10.0f;
        }
        return f10 * f;
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

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (t[n3] != null) {
            return n3;
        }
        Object object = s[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 9;
            case 1 -> 54;
            case 2 -> 53;
            case 3 -> 34;
            case 4 -> 27;
            case 5 -> 55;
            case 6 -> 51;
            case 7 -> 20;
            case 8 -> 3;
            case 9 -> 62;
            case 10 -> 33;
            case 11 -> 5;
            case 12 -> 26;
            case 13 -> 6;
            case 14 -> 21;
            case 15 -> 19;
            case 16 -> 1;
            case 17 -> 32;
            case 18 -> 39;
            case 19 -> 36;
            case 20 -> 35;
            case 21 -> 37;
            case 22 -> 41;
            case 23 -> 29;
            case 24 -> 59;
            case 25 -> 56;
            case 26 -> 40;
            case 27 -> 14;
            case 28 -> 13;
            case 29 -> 50;
            case 30 -> 45;
            case 31 -> 2;
            case 32 -> 11;
            case 33 -> 28;
            case 34 -> 25;
            case 35 -> 30;
            case 36 -> 4;
            case 37 -> 49;
            case 38 -> 10;
            case 39 -> 48;
            case 40 -> 58;
            case 41 -> 0;
            case 42 -> 17;
            case 43 -> 60;
            case 44 -> 47;
            case 45 -> 63;
            case 46 -> 38;
            case 47 -> 61;
            case 48 -> 23;
            case 49 -> 24;
            case 50 -> 15;
            case 51 -> 52;
            case 52 -> 8;
            case 53 -> 44;
            case 54 -> 7;
            case 55 -> 16;
            case 56 -> 42;
            case 57 -> 12;
            case 58 -> 18;
            case 59 -> 57;
            case 60 -> 46;
            case 61 -> 22;
            case 62 -> 31;
            default -> 43;
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
        cT.t[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00dc' || c == '\u00c9' || c == '\u00ba' || c == 'X') {
                field = cT.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00dc' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c9' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ba' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = cT.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00a4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'f' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = cT.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cT" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = cT.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static void a() {
        Object[] objectArray = s;
        s[0] = "n&M`iex&H:zromK<vf~*\\+=qg";
        objectArray[1] = "#NTS\u0001QVn_\\\u0010\u001e7`TW\u0014DC";
        objectArray[2] = "G\u00026)\u0011\u0014Q\u00023s\u0002\u0003FI0u\u000e\u0017W\u000e'bE\u0006t";
        objectArray[3] = "o, /%\by,%u6\u001fng&s:\u000b\u007f 1dq\u0019C";
        objectArray[4] = ",od#B0YOo,S\u007f$W|+Z6L";
        objectArray[5] = "\t,\u0015^\u0014;\u001f,\u0010\u0004\u0007,\bg\u0013\u0002\u000b8\u0019 \u0004\u0015@*(";
        objectArray[6] = "AWfs%:4wm|4uUyfw0/!";
        objectArray[7] = "/u\u0007\u001fb92`_=#4*f";
        objectArray[8] = "YaMC\u001bEOaH\u0019\bRX*K\u001f\u0004FIm\\\bOQ\u007f";
        objectArray[9] = "J\u0014\u0017K\b\u001d?4\u001cD\u0019R^:\u0017O\u001d\b*";
        objectArray[10] = Void.TYPE;
        cT.t[10] = "java/lang/Void";
        objectArray[11] = "\u0003:S\n<\u000f\u0015:VP/\u0018\u0002qUV#\f\u00136BAh\u001b\f";
        objectArray[12] = "~ns/ \u0012\u000bNx 1]j@s+5\u0007\u001e";
        objectArray[13] = "Ht\u0016nNC^t\u00134]TI?\u00102Q@Xx\u0007%\u001aWH";
        objectArray[14] = "N-\u0016JG};\r\u001dEV2Z\u0003\u0016NRh.";
        objectArray[15] = "Q\u001f,-M-G\u001f)w^:PT*qR.A\u0013=f\u0019>a";
        objectArray[16] = "Y<&P3jR37\u001fPgG>8teeV-$Xrh";
        objectArray[17] = "*p\f\nbZ_P\u0007\u0005s\u0015>^\f\u000ewOJ";
        objectArray[18] = Float.TYPE;
        cT.t[18] = "java/lang/Float";
        objectArray[19] = "q\u007fY*\u001bk\u0004_R%\n$eQY.\u000e~\u0011";
        objectArray[20] = "VNe+\u0000\u0014@N`q\u0013\u0003W\u0005cw\u001f\u0017FBt`T\u0007^Bvk\u000eJbYvv\u000e\rUN";
        objectArray[21] = "?C\u000b{\u0015\u0006)C\u000e!\u0006\u0011>\b\r'\n\u0005/O\u001a0A\u0015\u0018";
        objectArray[22] = "+Jui3b Ed&Nw2_fe";
        objectArray[23] = Long.TYPE;
        cT.t[23] = "java/lang/Long";
        objectArray[24] = "8fX(\u0001}.f]r\u0012j9-^t\u001e~(jIcUn\u001d";
        objectArray[25] = "\u0018s[^m=mSPQ|r\f][Zx(x";
        objectArray[26] = "d}Up=i\u0011]^\u007f,&pSUt(|\u0004";
        objectArray[27] = "wB{Q2\u0007|Mj\u001eQ\niK";
        objectArray[28] = "\u001e\u0002]\tk&\u0015\rLF\u0016>\u0006\nE\u000f";
        objectArray[29] = "MEsv\"P[Ev,1GL\u000eu*=S]Ib=vX";
        objectArray[30] = "R!ao1_Y.p PQR%tz";
        objectArray[31] = "<*4fP$09uW@A> !7\u0018?9*#))x=.6'\u0019q#<#W";
        objectArray[32] = "+~O+B\u0012{r[u'\u0017\u0011/\u0018kG\u0004,\u007f@l@}";
        objectArray[33] = "\u0014Dy?{*V\u0017*6\u0002!(\u0018s1bzV\u001fy3|K\u0015Hs8=5C\u001fz%\u0002";
        objectArray[34] = "\"d\\eJ>(&\u0003dq=&\u0018\u0005|\u001c;\n5\u0019nq\"yb\u00048\u000e(;=\u0005\u0003";
        objectArray[35] = "\u0000BeLS\u0010REd\u0014cM>\u001dlE\u0003\u001a@\u001afG\u001d+\u0001@5@\u001fR\u0004\u00194Ic";
        objectArray[36] = "\u000eD\u0018G\u001enX\u0013\u0011Z!Os4!h!-\u0002\u0010\u001f\u001a_{U\u0019\u0002";
        objectArray[37] = "4A&I\u0010IaL6\\(Z\u000b].EH\u0000uZ$GV14\u0000w@TH1YvI(";
        objectArray[38] = "L]\u001f-\u0007$LB\u0000i:1}^\u001dyZm\u0003Y\u0017{D\\B\u0003D|F%GZEu:";
        objectArray[39] = "\u0017Uz]\u0019!FR1G$3~Q,T\u001d%NU?\u0017HZ\u0014W8\u0015[j\u0010D{@$";
        objectArray[40] = "/^C\n\u0015#m\r\u0010\u0003l(\u0013\u0002I\u0004\fsm\u0005C\u0006\u0012Bx\u001e\u0015\f\b$c\u001a\u001c\nl";
        objectArray[41] = "l\r\u001cdZt>\n\u001d<j1RR\u0015m\n~,U\u001fo\u0014Om\u000fLh\u00166hVMaj";
        objectArray[42] = "\u00146\u0016b; \u0012s\u001dz^qyeIsc~\u001bw\u0004i1";
        objectArray[43] = "\u0017q!JjrG}(L\u0014g\u0004f?Brp%} BQm\u001dx$T\u0014c\u0016c?Np3Eu=/";
        objectArray[44] = "l\n\u0001X~\u0011n\u0000\u0017^\u0003\u0011\fP\u001e\\c_rW\u0014^}n3\rGY\u007f\u00176TFP\u0003";
        objectArray[45] = "\n_\u001a\u0002I\\\fLWX([\u0000X\u0006?K\u0005W[P@AG\bZk";
        objectArray[46] = "tD^*.cf\tDxJh\u001a\u0015P|*0d\u0012Z~4\u0001zOOx7~xEY~J";
        Object[] objectArray2 = objectArray;
        objectArray[47] = "o3NRY\u0002o3\u0019\u0000`]g2p\u0005\u001d\u0001m&\u0016\u001e\u0019\bkB\u001b\u0013Y[j$\u0000\u0017P]\u000e)\rW\u0003\\h2\t^\u00058";
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4A9B;
        if (cT.n[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])o.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    o.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/cT", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = m[n2].getBytes("ISO-8859-1");
            cT.n[n2] = cT.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return cT.n[n2];
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(cT.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(cT.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(cT.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


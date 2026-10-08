/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bW;
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
public class bU
implements AutoCloseable {
    public final int a;
    private final Cleaner.Cleanable b;
    private static final long c;
    private static final String d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static final Object[] h;
    private static final String[] i;

    public bU(int n, long l) {
        l = c ^ l;
        this.a = n;
        this.b = bU.b("\u00e6", (Object)dp_0.a, (Object)this, () -> bU.lambda$new$1(n), (long)-3373655127420905295L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                block12: {
                    bU.c = hc.a(3969636885369385683L, -73659817192609817L, MethodHandles.lookup().lookupClass()).a(137738253923046L);
                    bU.h = new Object[29];
                    bU.i = new String[29];
                    bU.a();
                    var11 = bU.c ^ 132730800660512L;
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
                var15_3 = var13_1.doFinal("\u00ebV}\u0001\u001c\u00e5E\u00cfI\u007f\u00fb\u00ac\u00a5\u00a9WU\u00a5\u0090W)U\u00bd\u0019aH\u00c2\u00f9\u00c6\u00e6\u0010\u00d7 \u00a7\u00acQ\u00ba\u00a6\u0011y\u0095".getBytes("ISO-8859-1"));
                ** while (true)
                bU.d = bU.a(var15_3).intern();
                bU.g = new HashMap<K, V>(13);
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
                var6_6 = new long[13];
                var3_7 = 0;
                var4_8 = "\u00f5\u00cd\u00ca\u0003\u0082\u000bPe&\u00913:\u00d1\u0096\u001c\u000e\u00baf+\u008ap\u00b47\u008a\u00cc{PJ\u00b0>\u00e0\u00fc\u00e1FN\u00cfk3\t[\u00d2\u0085\u00f5\u00b9\u0000\u0013\u0085\u0019S\u00f9\u0012\u00e7\u0017\u00e4QY_\u00d9\u001a\t\u00b9e4b\u0089\u00c9\u0097\u009f\u00bd\u0004\u00cb\u00cdN\u00c9f\u008c\u0002\u00f1,_\u00a1*\u00f4\u0083xuA\u009c";
                var5_9 = "\u00f5\u00cd\u00ca\u0003\u0082\u000bPe&\u00913:\u00d1\u0096\u001c\u000e\u00baf+\u008ap\u00b47\u008a\u00cc{PJ\u00b0>\u00e0\u00fc\u00e1FN\u00cfk3\t[\u00d2\u0085\u00f5\u00b9\u0000\u0013\u0085\u0019S\u00f9\u0012\u00e7\u0017\u00e4QY_\u00d9\u001a\t\u00b9e4b\u0089\u00c9\u0097\u009f\u00bd\u0004\u00cb\u00cdN\u00c9f\u008c\u0002\u00f1,_\u00a1*\u00f4\u0083xuA\u009c".length();
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
                    var4_8 = "L\u0096\u0091\u00ac\u00ce\u00ef6*?\u001d?\"\u00e6J\u009a\u009e";
                    var5_9 = "L\u0096\u0091\u00ac\u00ce\u00ef6*?\u001d?\"\u00e6J\u009a\u009e".length();
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
        bU.e = var6_6;
        bU.f = new Integer[13];
    }

    public void e(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        float f11 = ((Float)objectArray[2]).floatValue();
        float f12 = ((Float)objectArray[3]).floatValue();
        long l = (Long)objectArray[4];
        l = c ^ l;
        CallSite callSite = bU.b("S", (int)bU.a("d", (int)16289, (long)(0x4102EC64E749E0A1L ^ l)), (long)-7243257418993635174L, (long)l);
        bU.b("S", (int)bU.a("d", (int)17942, (long)(0x10807ACB5B361918L ^ l)), (int)this.a, (long)-7243775391300747874L, (long)l);
        bU.b("S", (int)bU.a("d", (int)2655, (long)(0x1E57C48C81F7D552L ^ l)), (int)0, (Object)new float[]{f, f10, f11, f12}, (long)-7242404036288331349L, (long)l);
        bU.b("S", (int)bU.a("d", (int)17942, (long)(0x10807ACB5B361918L ^ l)), (int)callSite, (long)-7243775391300747874L, (long)l);
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = bU.a(l, l2);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                bU.h[n] = clazz = Class.forName(i[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = bU.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = bU.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
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
            throw new RuntimeException("dev/zprestige/prestige/bU" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = bU.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = bU.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public void b(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        bW bW2 = (bW)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = (l = c ^ l) ^ 0x7D5C7F2CF571L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = bW2.a;
        objectArray2[0] = n;
        bU.b("\u00e6", (Object)this, (Object)objectArray2, (long)-4941964784328312307L, (long)l);
    }

    public void c(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = c ^ l;
        CallSite callSite = bU.b("S", (int)bU.a("d", (int)5050, (long)(0x662C471C40CC1A00L ^ l)), (long)-3617260841097058772L, (long)l);
        bU.b("S", (int)bU.a("d", (int)1099, (long)(0x25616F58EA808DFAL ^ l)), (int)this.a, (long)-3616708226107823320L, (long)l);
        CallSite callSite2 = bU.b("S", (int)bU.a("d", (int)12429, (long)(0xFC69F251D1DB93AL ^ l)), (long)-3616609994313383074L, (long)l);
        try {
            bU.b("S", (int)bU.a("d", (int)12429, (long)(0xFC69F251D1DB93AL ^ l)), (int)callSite, (long)-3616708226107823320L, (long)l);
            if (callSite2 != bU.a("d", (int)26486, (long)(0x54D94E370303EECFL ^ l))) {
                throw new IllegalStateException(d + (int)callSite2);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw bU.b("S", (Object)illegalStateException, (long)-3617016603821883044L, (long)l);
        }
    }

    private static Field c(long l, long l2) {
        int n = bU.a(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = bU.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = bU.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = bU.a(clazz3, string2, clazz2)) != null) {
                    bU.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = bU.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        bU.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = bU.b(137250772860517L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public void f(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        int n = (Integer)objectArray[1];
        long l = (Long)objectArray[2];
        l = c ^ l;
        CallSite callSite = bU.b("S", (int)bU.a("d", (int)16289, (long)(0x4102E73F2361FB8CL ^ l)), (long)-9198658746849170505L, (long)l);
        bU.b("S", (int)bU.a("d", (int)17942, (long)(0x108071909F1E0235L ^ l)), (int)this.a, (long)-9199169643059255629L, (long)l);
        bU.b("S", (int)bU.a("d", (int)7508, (long)(0x52A19B0CE128597AL ^ l)), (int)0, (float)f, (int)n, (long)-9199017570483001055L, (long)l);
        bU.b("S", (int)bU.a("d", (int)17942, (long)(0x108071909F1E0235L ^ l)), (int)callSite, (long)-9199169643059255629L, (long)l);
    }

    public void d(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        int n3 = (Integer)objectArray[2];
        int n4 = (Integer)objectArray[3];
        int n5 = (Integer)objectArray[4];
        int n6 = (Integer)objectArray[5];
        int n7 = (Integer)objectArray[6];
        int n8 = (Integer)objectArray[7];
        int n9 = (Integer)objectArray[8];
        int n10 = (Integer)objectArray[9];
        int n11 = (Integer)objectArray[10];
        long l = (Long)objectArray[11];
        l = c ^ l;
        CallSite callSite = bU.b("S", (int)bU.a("d", (int)17332, (long)(0x266EA04A229A4291L ^ l)), (long)-4225912723907105094L, (long)l);
        CallSite callSite2 = bU.b("S", (int)bU.a("d", (int)16289, (long)(0x4102A1606CD4BE81L ^ l)), (long)-4225912723907105094L, (long)l);
        bU.b("S", (int)bU.a("d", (int)5734, (long)(0x7C8745D67511740L ^ l)), (int)this.a, (long)-4226419696820280386L, (long)l);
        bU.b("S", (int)bU.a("d", (int)20207, (long)(0xF5E887C24B0CFCDL ^ l)), (int)n, (long)-4226419696820280386L, (long)l);
        bU.b("S", (int)n2, (int)n3, (int)(n2 + n4), (int)(n3 + n5), (int)n6, (int)n7, (int)(n6 + n8), (int)(n7 + n9), (int)n10, (int)n11, (long)-4225711857518376780L, (long)l);
        bU.b("S", (int)bU.a("d", (int)26817, (long)(0x682D6D9E01AB69E5L ^ l)), (int)callSite, (long)-4226419696820280386L, (long)l);
        bU.b("S", (int)bU.a("d", (int)17942, (long)(0x108037CFD0AB4738L ^ l)), (int)callSite2, (long)-4226419696820280386L, (long)l);
    }

    private static Method d(long l, long l2) {
        int n = bU.a(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = i[n];
                int n3 = string2.indexOf(8);
                clazz3 = bU.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = bU.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = bU.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        bU.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = bU.b(137250772860517L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = bU.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        bU.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = bU.b(137250772860517L, 0L);
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

    public void a(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        long l = (Long)objectArray[2];
        l = c ^ l;
        CallSite callSite = bU.b("S", (int)bU.a("d", (int)16289, (long)(0x4102EF3D4F9D9A88L ^ l)), (long)-2210206829273707853L, (long)l);
        bU.b("S", (int)bU.a("d", (int)12429, (long)(0xFC6B3D2539895A5L ^ l)), (int)this.a, (long)-2210717727795378249L, (long)l);
        bU.b("S", (int)bU.a("d", (int)12429, (long)(0xFC6B3D2539895A5L ^ l)), (int)n, (int)bU.a("d", (int)18846, (long)(0x6EDB1600E0AD6CBFL ^ l)), (int)n2, (int)0, (long)-2210367222357304082L, (long)l);
        bU.b("S", (int)bU.a("d", (int)12429, (long)(0xFC6B3D2539895A5L ^ l)), (int)callSite, (long)-2210717727795378249L, (long)l);
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x447A;
        if (f[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])g.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/bU", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            bU.f[n2] = n3;
        }
        return f[n2];
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static bU a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = c ^ l) ^ 0x4B5A72A6A93EL;
        return new bU((int)bU.b("S", (long)-2929369862680455403L, (long)l), l2);
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = bU.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'X' || c == '\u00fb' || c == '\u00f4' || c == 'O') {
                field = bU.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'X' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fb' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f4' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = bU.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e6' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'S' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
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

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = bU.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static void a() {
        Object[] objectArray = h;
        h[0] = "oe3\b6\u0007dj\"Gj\u000ec*\u0006\u0005}\nka7";
        objectArray[1] = "cP\u001dLE8h_\f\u0003$6cT\bY";
        objectArray[2] = "I\u001b`<EnB\u0014qs9wM\u0014w?\u0007g";
        objectArray[3] = "4j\u001erN`?e\u000f=\u0012i8%+\u007f\u0005m0n\u001a7#`;j\u0006r\u0002`;";
        objectArray[4] = "\u0018sGmX?\u001dfLm[8\u0012oG/\u001a\u000f;2\u0010";
        objectArray[5] = Integer.TYPE;
        bU.i[5] = "java/lang/Integer";
        objectArray[6] = Void.TYPE;
        bU.i[6] = "java/lang/Void";
        objectArray[7] = "_9N\u0019\u000ftZ,E\u0019\fsU%N[MD|z\u0018";
        objectArray[8] = "j'a\bl8|'dR\u007f/klgTs;z+pC8*[";
        objectArray[9] = "1M\u001dA\u0004T:B\f\u000ecT7I\fAFk/M\u001fEo@8I\u001bTCW5";
        objectArray[10] = "\u00164";
        objectArray[11] = "F\u001ealS+P\u001ed6@<GUg0L(V\u0012p'\u0007?R";
        objectArray[12] = "!Q*,e`Tq!#t/5\u007f*(puA";
        objectArray[13] = "ls\u0012\u0017\b\b\u0019S\u0019\u0018\u0019Gx]\u0012\u0013\u001d\u001d\f";
        objectArray[14] = Float.TYPE;
        bU.i[14] = "java/lang/Float";
        objectArray[15] = "+\u001dJVO${\u0018D\u0003$+u*\u001e\u0001M>[\u001c\u0014\u0002I>\u007f\u001fzP\u0019.v\u001eD\u0012\u00146haFQN#n_\u0004\\V=\u0011^D\bE{rPK\u0007YD-\u001aGQ\u001b|+\u0006\u0013V$";
        objectArray[16] = "nrWT\u0016[>wY\u0001}T0@\u001d\u0007\u0018V>s\t\u0000\u0010A\bc\u0017\u0012\u0000A94+nA\u0006>i\u0018P\u0003\u000b&wgR@Q3qY\u0010MI-\u000e[S\u0017\\+0\u0019^\u000fBT2Z\u0004\u001aDjpW\u001c\u0004;h3\r\t\u0002\u0005*>\u0015\u0017}\u0007/3ZQE\u00013g]n";
        objectArray[17] = "\u001bQ;wmuZ\u00158u\u0001w$\u001fe jp\u0014O\"re\u0019\u0018Udr>!\u001eI0u\u0001";
        objectArray[18] = ".\u0001\u0017Q6v~\u0004\u0019\u0004]yp2J\r\u0013l}\u0018J\u0001 xz\u0010]\u0010]*)\u0017@\u0014ch$\u000f^k";
        objectArray[19] = "$5\rR#%gz\u0018\u0017J(}E\u001b\u0014\u000b!eg\u0019\u00050G%7\u001c\u000f5yg:\u0004\u0011J{$`\u0011\u0017t9)x\u000fh";
        objectArray[20] = "(+Ws\u0006\\x.Y&mSv\u001d\u0003(\u0011rh>\u0002$\u0007A|9\n3m\u0000/=\u00006SB\"%\u001eIQ\u0001x0\u0018w\u0013\f`.guPVu(Y7]NkW[t\u0007[mi\u0019y\u001fE\u0012kZ#\nC,)W;\u0014<.j\r.\u0012\u0002lg\u00150m\u0000/=\u00006SB\"%\u001eIQ\u0001x0\u0018w\u0013\f`.guPVu(Y7]NkW[t\u0007[mi\u0019y\u001fE\u0012k\u001ctP\u0003*m\u0000 W<";
        objectArray[21] = "\u0014\fq\u0012arM\u00060\u0010\u0018|J\r`\u0010\u0018+U]4I -I\t3v";
        objectArray[22] = "w9\u0005\u0012yR'<\u000bG\u0012])\u000eQE{H\u00078[F\u007fH#$5\u0014/X*:\u000bV\"@4E\t\u0015xU2{K\u0018`KMtG\u0016`\f+8MMy2qx_Om\f3uGQ\u0012\u000e6x\b\u0017*\b*,\u000f(";
        objectArray[23] = "CDEmwu\u0001\u0016\u001fu\u001dq}D\u001c$wc\u0003\u0014\u0019uz\u0018C\u001e@vff\u0013\u001b\u0011{\u001d";
        objectArray[24] = "\n/.>4\u0005\t,t\u0007,\u0001\tqo{;\u0016f)\u007fa9P\u001b\u007f$}.l\\(q7h\u0015\u0007)~kVV\nhp~3\u000f\u0000)r\u0007";
        objectArray[25] = "kzN\u0017}N;\u007f@B\u0016A5J\u0013I{R<H\u0004DsC;{\u0010C{T*\u0006B\u0010|I.8\u0000\u001ddWQ:\u0005\u0010+\u0011i<\u0019D,.";
        objectArray[26] = "\u001fu\u0001a;]]'[yQY!z\u0000\u007f:Y\u0011*G-50\u001d0\u0001-n\b\u001b,U*Q";
        objectArray[27] = "\u001c\u0019/`S+L\u001c!58$B/~<T\u0005\\\fz7R6H\u000br 8w\u001b\u000fx%\u00065\u0016\u0017fZ\u0004vL\u0002`dF{T\u001c\u001ffCv\u001bZ'`_\"\u001ce";
        Object[] objectArray2 = objectArray;
        objectArray[28] = "\\&D\u0010\b\f\f#JEc\u0003\u0002\u0011\u0014G\b\u000f( \u001dO\u000e\u0006\u001b4\u001aG\u00197\u001a3\bW\u0018lZg\u001eM\u001cR\u0018j\u0006ScP[0\u0013U]\u0012V(\r*";
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (i[n3] != null) {
            return n3;
        }
        Object object = h[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 0;
            case 1 -> 36;
            case 2 -> 10;
            case 3 -> 53;
            case 4 -> 19;
            case 5 -> 12;
            case 6 -> 14;
            case 7 -> 6;
            case 8 -> 54;
            case 9 -> 61;
            case 10 -> 22;
            case 11 -> 28;
            case 12 -> 46;
            case 13 -> 49;
            case 14 -> 50;
            case 15 -> 34;
            case 16 -> 57;
            case 17 -> 63;
            case 18 -> 32;
            case 19 -> 15;
            case 20 -> 13;
            case 21 -> 8;
            case 22 -> 59;
            case 23 -> 30;
            case 24 -> 40;
            case 25 -> 2;
            case 26 -> 55;
            case 27 -> 58;
            case 28 -> 16;
            case 29 -> 1;
            case 30 -> 52;
            case 31 -> 17;
            case 32 -> 41;
            case 33 -> 51;
            case 34 -> 24;
            case 35 -> 26;
            case 36 -> 33;
            case 37 -> 35;
            case 38 -> 62;
            case 39 -> 43;
            case 40 -> 56;
            case 41 -> 25;
            case 42 -> 7;
            case 43 -> 37;
            case 44 -> 38;
            case 45 -> 60;
            case 46 -> 39;
            case 47 -> 27;
            case 48 -> 20;
            case 49 -> 4;
            case 50 -> 48;
            case 51 -> 18;
            case 52 -> 23;
            case 53 -> 11;
            case 54 -> 31;
            case 55 -> 29;
            case 56 -> 9;
            case 57 -> 5;
            case 58 -> 21;
            case 59 -> 3;
            case 60 -> 47;
            case 61 -> 44;
            case 62 -> 42;
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
        bU.i[n3] = new String(cArray);
        return n3;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/bU" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public void close() throws Exception {
        long l = c ^ 0x5413DAD85AFCL;
        bU.b("\u00e6", (Object)this.b, (long)-742167220928759014L, (long)l);
    }

    private static void lambda$new$0(int n) {
        long l = c ^ 0x74CF42AD84EAL;
        bU.b("S", (int)n, (long)3145311483932308964L, (long)l);
    }

    private static void lambda$new$1(int n) {
        long l = c ^ 0x46CEAF2008E5L;
        long l2 = l ^ 0x15716CD929EAL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = () -> bU.lambda$new$0(n);
        bU.b("S", (Object)objectArray, (long)-6364880757730523548L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bU.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(bU.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


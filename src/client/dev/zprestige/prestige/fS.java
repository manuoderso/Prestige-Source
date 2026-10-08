/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.fT;
import dev.zprestige.prestige.hc;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
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
public class fS {
    static final boolean a;
    private static final long b;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;
    private static final Object[] i;
    private static final String[] j;

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    fS.b = hc.a(-1601954442825047574L, -6500682862956279198L, MethodHandles.lookup().lookupClass()).a(232488391579997L);
                    var20 = fS.b ^ 14580317588738L;
                    fS.i = new Object[40];
                    fS.j = new String[40];
                    fS.a();
                    fS.e = new HashMap<K, V>(13);
                    var11_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var20 >>> 56);
                    for (var12_2 = 1; var12_2 < 8; ++var12_2) {
                        v2 = v2;
                        v2[var12_2] = (byte)(var20 << var12_2 * 8 >>> 56);
                    }
                    var11_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var18_3 = new String[3];
                    var16_4 = 0;
                    var15_5 = "\u0086\u008e\u009a\u0001A{\u00af\b\u00b9z\u00a4t$\u00d0\u00052\u00bc\u00de(g\u00a1z\u009a\u00b7U\u00e5>>\u00a8n+)\u0000\u00a4\u001d\u00f3U\u00bc\u0007J6\u0000\u00b2\u00a1 X\u00f8a\u00ce\u00fa\u00c9cR\u0011W\u00aaw\u00f4I\u0007\u00db<\u0081\u0083\u00a7\u00eb\u00baj\u00ce\n\u00db\u009a\u0002\u00fa\u00f3\u00d4\u00cd\u00d3\u00f9#@\u001d\u001f~?:P|Q\u00c4i\u009a\u001b]vg\u00d0\u0094\u00bd\u009ft\u00a8To\u008e\u0004RU9\u00ad\u00e5\u001f9yY\fP\u00cf\u0085\u00a4\u0006\u00aa\u0014\f\u00dc\u00e0\u001f7=\u00edp*\u00c6N\u00b4\u00aa<LW\u00f0\u009fjVS\u0085\u0098\u00ac\u0093\u009a(\u00a7\u001aVy\u0004\u00ed\u00ff\u000f\u00c6\u0003\u00b6\u00198\u00b4`\u00fc7\u00b3\u00b49\u00e0(\u0087\u00b4\u00f9\u008b\u00da\u00a2\u00d3\u00e9\u00f2L\u00ca\u00ccu\u00fb\u00ebv\u0082C\u0002D\u00e0\u00fb\u00f6o\u00cb\u00a3Fw\u00dd\u00a5\u0015\b,\u0091O\u0091`$4\u008a\u0007\u00ee\u00c1\u00a1\u0097L\u0081\u00c28}L\"ZQ\u00ea\u0018\u0003k\u00a7\u00d0[\"\u00bf\u00f6;\u001eq\u0082\u0099sw\u00fbPL\u00d1\n\u0006\u00e5\u001f\u0006-C\"\u0089s\r\u00f7\u00b6\u0013a8\u0018\u0093x\u00d5\u0091!\u0087h\r\u00f0\u00a91\u00a0\u007f\b0\u0019Z\u00af\u00f4\u00eb\r\u000b\u00e3\u00fb\u00b9\u000f\u001b\u00bf\u00bc\u0011\u0001u\u0082\u00be";
                    var17_6 = "\u0086\u008e\u009a\u0001A{\u00af\b\u00b9z\u00a4t$\u00d0\u00052\u00bc\u00de(g\u00a1z\u009a\u00b7U\u00e5>>\u00a8n+)\u0000\u00a4\u001d\u00f3U\u00bc\u0007J6\u0000\u00b2\u00a1 X\u00f8a\u00ce\u00fa\u00c9cR\u0011W\u00aaw\u00f4I\u0007\u00db<\u0081\u0083\u00a7\u00eb\u00baj\u00ce\n\u00db\u009a\u0002\u00fa\u00f3\u00d4\u00cd\u00d3\u00f9#@\u001d\u001f~?:P|Q\u00c4i\u009a\u001b]vg\u00d0\u0094\u00bd\u009ft\u00a8To\u008e\u0004RU9\u00ad\u00e5\u001f9yY\fP\u00cf\u0085\u00a4\u0006\u00aa\u0014\f\u00dc\u00e0\u001f7=\u00edp*\u00c6N\u00b4\u00aa<LW\u00f0\u009fjVS\u0085\u0098\u00ac\u0093\u009a(\u00a7\u001aVy\u0004\u00ed\u00ff\u000f\u00c6\u0003\u00b6\u00198\u00b4`\u00fc7\u00b3\u00b49\u00e0(\u0087\u00b4\u00f9\u008b\u00da\u00a2\u00d3\u00e9\u00f2L\u00ca\u00ccu\u00fb\u00ebv\u0082C\u0002D\u00e0\u00fb\u00f6o\u00cb\u00a3Fw\u00dd\u00a5\u0015\b,\u0091O\u0091`$4\u008a\u0007\u00ee\u00c1\u00a1\u0097L\u0081\u00c28}L\"ZQ\u00ea\u0018\u0003k\u00a7\u00d0[\"\u00bf\u00f6;\u001eq\u0082\u0099sw\u00fbPL\u00d1\n\u0006\u00e5\u001f\u0006-C\"\u0089s\r\u00f7\u00b6\u0013a8\u0018\u0093x\u00d5\u0091!\u0087h\r\u00f0\u00a91\u00a0\u007f\b0\u0019Z\u00af\u00f4\u00eb\r\u000b\u00e3\u00fb\u00b9\u000f\u001b\u00bf\u00bc\u0011\u0001u\u0082\u00be".length();
                    var14_7 = 80;
                    var13_8 = -1;
lbl32:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl34:
                    // 1 sources

                    while (true) {
                        var18_3[var16_4++] = fS.a(var19_9).intern();
                        if ((var13_8 += var14_7) < var17_6) {
                            var14_7 = var15_5.charAt(var13_8);
                            ** continue;
                        }
                        break block14;
                        break;
                    }
                    v3 = ++var13_8;
                    var19_9 = var11_1.doFinal(var15_5.substring(v3, v3 + var14_7).getBytes("ISO-8859-1"));
                    ** while (true)
                }
                fS.c = var18_3;
                fS.d = new String[3];
                fS.h = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v4 = SecretKeyFactory.getInstance("DES");
                v5 = new byte[8];
                v6 = v5;
                v5[0] = (byte)(var20 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v6 = v6;
                    v6[var1_11] = (byte)(var20 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v4.generateSecret(new DESKeySpec(v6)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[4];
                var3_13 = 0;
                var4_14 = "@\\T\u000f\n\u00c6)\u009d\u00b2n\u00ed\u00b8\u00f3w\u00d3\u00cf";
                var5_15 = "@\\T\u000f\n\u00c6)\u009d\u00b2n\u00ed\u00b8\u00f3w\u00d3\u00cf".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v7 = var6_12;
                    v8 = var3_13++;
                    v9 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v10 = -1;
                    break block15;
                    break;
                }
lbl85:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "G\u00d2\u00f0\u0094\u0016\u00e6t\u0001\u00b8~\u00a8\u001d\u009d\u00fdFs";
                    var5_15 = "G\u00d2\u00f0\u0094\u0016\u00e6t\u0001\u00b8~\u00a8\u001d\u009d\u00fdFs".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v7 = var6_12;
                        v8 = var3_13++;
                        v9 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
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
                    if (var2_16 < var5_15) ** continue;
                    break block16;
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
        fS.f = var6_12;
        fS.g = new Integer[4];
        try {
            v12 = fS.c("\u00c3", fS.class, (long)-3036832130006490766L, (long)var20) == false ? 1 : 0;
        }
        catch (RuntimeException v13) {
            throw fS.c("\u00ef", (Object)v13, (long)-3038450246106161923L, (long)var20);
        }
        fS.a = v12;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fS.a(l, l2);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                fS.i[n] = clazz = Class.forName(j[n]);
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
            throw new RuntimeException("dev/zprestige/prestige/fS" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x66D8;
        if (g[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = f[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])h.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/fS", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            fS.g[n2] = n3;
        }
        return g[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = fS.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fS.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fS.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = fS.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fS.b(classArray[i], string, clazz2);
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
            throw new RuntimeException("dev/zprestige/prestige/fS" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(long l, long l2) {
        int n = fS.a(l, l2);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = fS.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fS.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fS.a(clazz3, string2, clazz2)) != null) {
                    fS.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fS.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fS.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fS.b(1215288983387887L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = fS.a(l, l2);
        Object object = i[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = j[n];
                int n3 = string2.indexOf(8);
                clazz3 = fS.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fS.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fS.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        fS.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fS.b(1215288983387887L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fS.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fS.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fS.b(1215288983387887L, 0L);
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

    public static fT a(Object[] objectArray) {
        String string = (String)objectArray[0];
        String string2 = (String)objectArray[1];
        boolean bl = (Boolean)objectArray[2];
        long l = (Long)objectArray[3];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x7A2DC5756302L;
        long l4 = l2 ^ 0x4E50BF188582L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l3;
        objectArray2[2] = bl;
        objectArray2[1] = string;
        objectArray2[0] = (int)fS.b("g", (int)22453, (long)(0x26EE1785FAC5EED2L ^ l));
        CallSite callSite = fS.c("\u00ef", (Object)objectArray2, (long)-2326782472201082269L, (long)l);
        Object[] objectArray3 = new Object[4];
        objectArray3[3] = l3;
        objectArray3[2] = bl;
        objectArray3[1] = string2;
        objectArray3[0] = (int)fS.b("g", (int)15440, (long)(0xC713926A60B0534L ^ l));
        CallSite callSite2 = fS.c("\u00ef", (Object)objectArray3, (long)-2326782472201082269L, (long)l);
        CallSite callSite3 = fS.c("\u00ef", (long)-2327128760174034650L, (long)l);
        fS.c("\u00ef", (int)callSite3, (int)callSite, (long)-2325941976392462298L, (long)l);
        fS.c("\u00ef", (int)callSite3, (int)callSite2, (long)-2325941976392462298L, (long)l);
        fS.c("\u00ef", (int)callSite3, (long)-2326843678989202513L, (long)l);
        if (fS.c("\u00ef", (int)callSite3, (int)fS.b("g", (int)29064, (long)(0x2D2477E6ED47C8EDL ^ l)), (long)-2325404596544944611L, (long)l) == false) {
            CallSite callSite4 = fS.c("\u00ef", (int)callSite3, (long)-2325626544491271406L, (long)l);
            fS.c("\u00c3", (Object)fS.c("$", (long)-2325776371258228342L, (long)l), (Object)callSite4, (long)-2326980637648953520L, (long)l);
            throw new RuntimeException((String)((Object)fS.a("q", (int)680, (long)(0x2EB40958DE7BC038L ^ l))));
        }
        fS.c("\u00ef", (int)callSite, (long)-2326717284002265039L, (long)l);
        fS.c("\u00ef", (int)callSite2, (long)-2326717284002265039L, (long)l);
        return new fT((int)callSite3, l4);
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
     * Loose catch block
     */
    private static int a(Object[] objectArray) {
        String string;
        CallSite callSite;
        int n = (Integer)objectArray[0];
        String string2 = (String)objectArray[1];
        boolean bl = (Boolean)objectArray[2];
        long l = (Long)objectArray[3];
        l = b ^ l;
        try {
            if (bl) {
                throw new UnsupportedOperationException((String)((Object)fS.a("q", (int)2426, (long)(0x25458D652BD6F03AL ^ l))) + string2);
            }
        }
        catch (Throwable throwable) {
            throw fS.c("\u00ef", (Object)throwable, (long)-1988043314485662399L, (long)l);
        }
        CallSite callSite2 = fS.c("\u00ef", (int)n, (long)-1988258884699891948L, (long)l);
        try {
            callSite = fS.c("\u00c3", (Object)fS.c("\u00c3", fS.class, (long)-1987957121927562548L, (long)l), (Object)string2, (long)-1988095989894908413L, (long)l);
            try {
                block18: {
                    if (a) break block18;
                    try {
                        block20: {
                            if (callSite != null) break block18;
                            break block20;
                            catch (Throwable throwable) {
                                throw fS.c("\u00ef", (Object)throwable, (long)-1988043314485662399L, (long)l);
                            }
                        }
                        throw new AssertionError();
                    }
                    catch (Throwable throwable) {
                        throw fS.c("\u00ef", (Object)throwable, (long)-1988043314485662399L, (long)l);
                    }
                }
                string = new String((byte[])fS.c("\u00c3", (Object)callSite, (long)-1987349463311158822L, (long)l), (Charset)((Object)fS.c("$", (long)-1987910322160721976L, (long)l)));
            }
            catch (Throwable throwable) {
                if (callSite != null) {
                    try {
                        fS.c("\u00c3", (Object)callSite, (long)-1987592254692069838L, (long)l);
                    }
                    catch (Throwable throwable2) {
                        fS.c("\u00c3", (Object)throwable, (Object)throwable2, (long)-1987750815180936880L, (long)l);
                    }
                }
                throw throwable;
            }
            try {
                if (callSite != null) {
                    fS.c("\u00c3", (Object)callSite, (long)-1987592254692069838L, (long)l);
                }
            }
            catch (Throwable throwable) {
                throw fS.c("\u00ef", (Object)throwable, (long)-1988043314485662399L, (long)l);
            }
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
        fS.c("\u00ef", (int)callSite2, (Object)string, (long)-1988376680502892489L, (long)l);
        fS.c("\u00ef", (int)callSite2, (long)-1988305779447938146L, (long)l);
        if (fS.c("\u00ef", (int)callSite2, (int)fS.b("g", (int)8753, (long)(0xC4B7F63887F2084L ^ l)), (long)-1988140527957006718L, (long)l) == false) {
            callSite = fS.c("\u00ef", (int)callSite2, (long)-1988786891208983813L, (long)l);
            fS.c("\u00c3", (Object)fS.c("$", (long)-1987637648377169319L, (long)l), (Object)callSite, (long)-1988418602791213949L, (long)l);
            throw new RuntimeException((String)((Object)fS.a("q", (int)2614, (long)(0x7CCE4281D768F374L ^ l))));
        }
        return (int)callSite2;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (j[n3] != null) {
            return n3;
        }
        Object object = i[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 22;
            case 1 -> 61;
            case 2 -> 5;
            case 3 -> 52;
            case 4 -> 51;
            case 5 -> 0;
            case 6 -> 17;
            case 7 -> 53;
            case 8 -> 19;
            case 9 -> 18;
            case 10 -> 41;
            case 11 -> 44;
            case 12 -> 15;
            case 13 -> 27;
            case 14 -> 30;
            case 15 -> 39;
            case 16 -> 33;
            case 17 -> 43;
            case 18 -> 7;
            case 19 -> 6;
            case 20 -> 60;
            case 21 -> 14;
            case 22 -> 25;
            case 23 -> 50;
            case 24 -> 11;
            case 25 -> 1;
            case 26 -> 55;
            case 27 -> 48;
            case 28 -> 36;
            case 29 -> 58;
            case 30 -> 56;
            case 31 -> 16;
            case 32 -> 21;
            case 33 -> 59;
            case 34 -> 28;
            case 35 -> 10;
            case 36 -> 46;
            case 37 -> 37;
            case 38 -> 31;
            case 39 -> 38;
            case 40 -> 20;
            case 41 -> 29;
            case 42 -> 32;
            case 43 -> 63;
            case 44 -> 35;
            case 45 -> 40;
            case 46 -> 49;
            case 47 -> 24;
            case 48 -> 13;
            case 49 -> 3;
            case 50 -> 4;
            case 51 -> 42;
            case 52 -> 8;
            case 53 -> 9;
            case 54 -> 2;
            case 55 -> 57;
            case 56 -> 23;
            case 57 -> 62;
            case 58 -> 47;
            case 59 -> 34;
            case 60 -> 12;
            case 61 -> 54;
            case 62 -> 26;
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
        fS.j[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'J' || c == 'L' || c == '$' || c == 'F') {
                field = fS.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'J' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'L' ? lookup.findSetter(clazz, string2, clazz2) : (c == '$' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fS.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c3' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ef' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = fS.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void a() {
        Object[] objectArray = i;
        i[0] = "&\u0000P/\u0010~#\u0015[/\u0013y,\u001cPmRN\u0005@\u0007";
        objectArray[1] = Integer.TYPE;
        fS.j[1] = "java/lang/Integer";
        objectArray[2] = Void.TYPE;
        fS.j[2] = "java/lang/Void";
        objectArray[3] = "@} v\u000bTKr19vAYh3z";
        objectArray[4] = "7l_A^}2#yR\u0019z)^]R\u0015u0";
        objectArray[5] = "t$q\u000e\u0011\u0000\u007f+`Al\u0018l,i\b";
        objectArray[6] = "L>[3r&Z>^ia1Mu]om%\\2Jx&0{";
        objectArray[7] = "C7//>\u00166\u0017$ /YW\u0019/++\u0003#";
        objectArray[8] = "@LOVOJKC^\u00195NXBNV\u0003JO";
        objectArray[9] = "\u0012Iwdle\u0019Ff+\u0001e\u0019[r";
        objectArray[10] = Boolean.TYPE;
        fS.j[10] = "java/lang/Boolean";
        objectArray[11] = "@k[P4\u0003E$d_j\u001f^YYC\u007f\u000bG";
        objectArray[12] = "!?";
        objectArray[13] = "D\u0014\u001d:PnO\u001b\fu=nO\u0006\u0018\u0017\u0011cJ\u0010\u0019";
        objectArray[14] = "t\u000e\u0004^\"~w\u0000\\\\dql\u001c\u0017K\"Cj\u000e\u001c[mbz,\u001a^~c{\u001b\u0001";
        objectArray[15] = "OXiwnSLV1u(\\WJzbn~MXme%I";
        objectArray[16] = "\u0013K4bm=\u0018D%-\u00009\u0018X\u0011f2$\u001cD!f";
        objectArray[17] = "\u0007m\u0013\u0000o_\fb\u0002O\u000eQ\u0007i\u0006\u0015";
        objectArray[18] = "\u0001'H\b{g\u0015)\u001bclj$?_\nhn6#J\u000fntmz\u001bXa7\u0006'N[r\u000eT{\u0018\u0001:e\t.\u001b\u0012\u00037\u0000;NX=k\f}Ac";
        objectArray[19] = "q]C!xg.\u0019\u001dy\u0001a#H\u001fUe\u007f\u0004P\u000fqz\u001b~B\u000f-oq,]\u001du\u0001";
        objectArray[20] = "\u001e\u0004a}UZT\b*m4S^B\u00119KXT[~<W\u000f\u0018";
        objectArray[21] = "N\u0005ZZg\u001e\u0018R\u0000O\u0002N\u001f\u000f1\\z_\t\u000e\u0011ZoKs^\f\u0011yBJ\b[Kl'J\u000e\u0012L9\u0019\u0016\u0002TC\u0002";
        objectArray[22] = "\u007f\u001e\u001a}/Ek\u0010I\u00168H\\\u0017\rN-K|\u0000\u0018s\u0016J}\u001d5q8,*BJtnGw\u0017IgW\u0017w\u0007@rj@u\u0007\u0018\u0016";
        objectArray[23] = "oA{O\u001bG0\u0005%\u0017bP4Z0\u001fb\u0002=E&I\\^1\u0003)r";
        objectArray[24] = "9cToL-k&_?&sjambOg|YAoJq}\u001d\u0017dT!=sZdV}\u0007";
        objectArray[25] = "}Qf.vX|\u0004z-\u0019LARmob@x\u0004:5w%|\t;$|\u001c*^a1\u0019";
        objectArray[26] = "K\u001au\u0014r\u0011_\u0014&\u007fe\u001ch\u0013b'p\u001fH\u0004w\u001akx\u001eF%\u001d3\u0013C\u0013&\u000e\nA\u001fE|Fa\u001cJFo\u007f3@\u001c\u001c'\u0014n\u0015\u001f\u000f\u001e";
        objectArray[27] = "2OFsa2>R\u001df]P_}()]ds\\\u0005{743\b\u0003";
        objectArray[28] = "]gB2#\tIi\u0011Y4\u0004zyD0'\rjc@56\u001a1:\u0011b9YZgDa*`\b;\u0012;b\u000bUn\u0011([";
        objectArray[29] = "\r [\u001feV\u0019.\btr[*#U\f|[\f\u001fP\u001dqR\u001bD\tL&]X/T\u0019%Na}]\fp\u0004_!QJ\u007f?";
        objectArray[30] = "\u0018-._N\"U-,\u0003t#D3\u0006\u000f\u000f+T57\u000f=7r3&\u000f\u001d))t8\u001fE(\u0014#:\u001f\u001dL\u00163l_\r0Iw2\u0007t";
        objectArray[31] = "$\u007f}W<U0q.<+X\u0007vjg$U$vl]D\u0005p t\u0005/X%#g<}\u0004sy/W Qpj\u0016\u0005|\u0007*\"}X)\u00049\u001b";
        objectArray[32] = "\tS&y56[\u0016-)_kZV5j2k~V/}%{VJ2K#nKP/\u0010`>HSl(b=N@T";
        objectArray[33] = "0,KNT`$\"\u0018%Cm\u00172MLPd\u00042GJV`9H\u0019\u001d\u0017ke#DH\u0014x\\";
        objectArray[34] = "Lq75\u0000QX\u007fd^\u0017\\{u52\u0015B{r!$\u0013U ,de\u001a\u0001Kq1f\t8J~? C\u0004_-3/x\u0001Mm1eF]A+>^";
        objectArray[35] = "in2w#Tlre;@C)p2{$]S*0zq_n}2z);j|,j{\u00056pje@";
        objectArray[36] = ";e\u0002\u0015W\u001f/kQ~@\u0012\u0018l\u0015%O\u001f;l\u0013?I\u00180E\u000e\u0011/Oo:\u000bGD\u0012:9\u0018~\u0014\u0012*0\rCC\u0010*hi";
        objectArray[37] = ",AfK\u0006\u00008O5 \u0011\r\u0004DkC&\u0013'JwI\u001biy\u001d6BG\u0002$H5Q~P-]`\u001b@\f!\u001bo ";
        objectArray[38] = "Ox\u007fC0>N-c@_*szc\b%rM;iW-CJ~)Pf(\u0017+*C_";
        Object[] objectArray2 = objectArray;
        objectArray[39] = "f\u000fk\u0004}\nr\u00018oj\u0007F\u0006d\u0002y\u000eQ\u000bi\u0003h\u0019\nR8TgZa\u000fmWtc3\u0006x\u0002>]o\n>\r\u0005";
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1D2D;
        if (d[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])e.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    e.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/fS", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            fS.d[n2] = fS.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = fS.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fS" + " : " + string + " : " + methodType.toString(), exception);
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fS.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(fS.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(fS.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


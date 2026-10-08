/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Multimap
 *  com.google.gson.JsonElement
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.properties.Property
 *  com.mojang.authlib.properties.PropertyMap
 */
package dev.zprestige.prestige;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.gson.JsonElement;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.properties.PropertyMap;
import dev.zprestige.prestige.hc;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aF {
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static final Object[] h;
    private static final String[] i;

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        aF.a = hc.a(-6858005044931745744L, 2229323682572805626L, MethodHandles.lookup().lookupClass()).a(51394169596973L);
                        aF.h = new Object[45];
                        aF.i = new String[45];
                        aF.a();
                        aF.d = new HashMap<K, V>(13);
                        var11 = aF.a ^ 36185869481982L;
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
                        var20_3 = new String[14];
                        var18_4 = 0;
                        var17_5 = "\u00ba\u00b9Y@r\u00c8\u0081WS\u00ccJB\u008e\u0006[\u00b8\u00fe\u00ba\u00dd\u009f\u00a4c\u0082\u00c4\u00eb\u0088O\u001f`\u009e<k@\u00cc\u00f1a\u00e5\u0003\u00af\u00f0\u00fbfC\u001b\u0006\u009d\u00da\u0081\u00d6tOA!\u00de`\t\u008a\u00cf\u00d7\u00dc\u00a2/\u00a0\u0003\u008fD\u0000C^6\u008d\u007f\u0086\u0019S~\u00e8\u0094\u009c\u00feL#\u008c\u00e7\u00e9\u00d3\u00ad\u00a4\u00f5\u0001jBAG\u00ca\u00af\u00f3\u00109}\u001a8\u0090N\u00c1&\u0084\u00b19\u0000{\r\u00b8\u00b3\u0010\u00d9\u00b5X\u00bb\u008e!\u008c\u00f0\u0019ch\u0086\u0090\u008d\u00e4\u00f2\u0010\u00c7*Qx\r\u00eeB\u001dV\u00d8-\u00a5\u00f3\u0019{\u008e\u0010[u\u00e2\u001c\u00ad\u0086\u009b\u0091\u0003\u00dd`/&$\u0082@\u0010\t[\u001d\b\u009eb\u00bbUel\u0005\u008f\u0013\u00dce\n \u00fd\u001b\u00d7\u008d5{s\u00c8\u00eb\u00fa?\u00f7\u00c2\u00e4\u0011\u001f\u0098\u00b5\u0019\u000b\u00fd\u00e8\u00a9}uf\u00b2E\u0084\u009d\u00d9F \u00cb|X\u00be\u00e6\u00ba\u0003\u00fe\u000bT\u009e\u0089\u0096?\u0003_@\u001aX,X_\u00f9(\u00d9\u00c4G&\u00fa\u0083\u0012:\u0010;\u0084d\u00ed\t\u00d5\u00ab\u00bdy\u00b2\u00a6\u009f\u00de\u00a8\u001f\u00c5h\r$[\u00f2\u001e\u0097\u00a1\u009c\u00d3\u00a4\u0097\u0086fe\u00a6.\u0002{\u0091O\u0001\b\u00ba\u00d8\u00f5\u00ce\u0015\u0010D\u00d78>\u00e7\u0091&\u00f2\u0080t\u00a8]\u00ad\u00d1S]\u00f6\u000f)\u00dcn\u009eM\u007fC6\u00dfC\u00c5\u00d7\u0085\u00f4\u00d5\u00ed\u00c4\u00fcr\u00ceb\u00e2\u0081/\u008eT2x\u0083M3\u00f7O\u00b1A\u00d4\u00b3z\u0004\n\u00da\u00cef\u0013\u0001\u001d\u0098\u00c6\u00cf\u00f7'\u0018\"$\u00fe=\u00dbC \u0087\u00cb\u00bf\u0097\u0003\u0088\u00b8\u00cd\u0094\n3\u00f4\u00c0^\u00a2w0D\u00f0\u0001\u009c\u00a8S\u00c6\u0004\u00f9o \u00192\u00f1E";
                        var19_6 = "\u00ba\u00b9Y@r\u00c8\u0081WS\u00ccJB\u008e\u0006[\u00b8\u00fe\u00ba\u00dd\u009f\u00a4c\u0082\u00c4\u00eb\u0088O\u001f`\u009e<k@\u00cc\u00f1a\u00e5\u0003\u00af\u00f0\u00fbfC\u001b\u0006\u009d\u00da\u0081\u00d6tOA!\u00de`\t\u008a\u00cf\u00d7\u00dc\u00a2/\u00a0\u0003\u008fD\u0000C^6\u008d\u007f\u0086\u0019S~\u00e8\u0094\u009c\u00feL#\u008c\u00e7\u00e9\u00d3\u00ad\u00a4\u00f5\u0001jBAG\u00ca\u00af\u00f3\u00109}\u001a8\u0090N\u00c1&\u0084\u00b19\u0000{\r\u00b8\u00b3\u0010\u00d9\u00b5X\u00bb\u008e!\u008c\u00f0\u0019ch\u0086\u0090\u008d\u00e4\u00f2\u0010\u00c7*Qx\r\u00eeB\u001dV\u00d8-\u00a5\u00f3\u0019{\u008e\u0010[u\u00e2\u001c\u00ad\u0086\u009b\u0091\u0003\u00dd`/&$\u0082@\u0010\t[\u001d\b\u009eb\u00bbUel\u0005\u008f\u0013\u00dce\n \u00fd\u001b\u00d7\u008d5{s\u00c8\u00eb\u00fa?\u00f7\u00c2\u00e4\u0011\u001f\u0098\u00b5\u0019\u000b\u00fd\u00e8\u00a9}uf\u00b2E\u0084\u009d\u00d9F \u00cb|X\u00be\u00e6\u00ba\u0003\u00fe\u000bT\u009e\u0089\u0096?\u0003_@\u001aX,X_\u00f9(\u00d9\u00c4G&\u00fa\u0083\u0012:\u0010;\u0084d\u00ed\t\u00d5\u00ab\u00bdy\u00b2\u00a6\u009f\u00de\u00a8\u001f\u00c5h\r$[\u00f2\u001e\u0097\u00a1\u009c\u00d3\u00a4\u0097\u0086fe\u00a6.\u0002{\u0091O\u0001\b\u00ba\u00d8\u00f5\u00ce\u0015\u0010D\u00d78>\u00e7\u0091&\u00f2\u0080t\u00a8]\u00ad\u00d1S]\u00f6\u000f)\u00dcn\u009eM\u007fC6\u00dfC\u00c5\u00d7\u0085\u00f4\u00d5\u00ed\u00c4\u00fcr\u00ceb\u00e2\u0081/\u008eT2x\u0083M3\u00f7O\u00b1A\u00d4\u00b3z\u0004\n\u00da\u00cef\u0013\u0001\u001d\u0098\u00c6\u00cf\u00f7'\u0018\"$\u00fe=\u00dbC \u0087\u00cb\u00bf\u0097\u0003\u0088\u00b8\u00cd\u0094\n3\u00f4\u00c0^\u00a2w0D\u00f0\u0001\u009c\u00a8S\u00c6\u0004\u00f9o \u00192\u00f1E".length();
                        var16_7 = 32;
                        var15_8 = -1;
lbl32:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block13;
                            break;
                        }
lbl37:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = aF.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "K\u0012\u008d\u001fD\u00a5\u008f3\u009f\u00e1\u009e\u0098{w\u00e8}\u00cb\u00800q\u00c5\u0095p\u00a7`\u00b6\u0082\u00f8 D9\u00c1m;\u0099\u008d\u0080\u0018G\u00bc\u00b7\u001f;A2\u0010?&\u0018\u0003S\u00da\u008d\u00b3\u0085\u0019\u00cdE\u00c3JC{\u00d3\u0095S\u00ae#\u00bbQ7\u00ac\u00cb\u00c0`N\u00d5*(\u00bb\u009d\u008fq[\u0019lX\u00cb\u00a0+L\u00a4\u00fd\u0013\u008b\u00d9\u001c<f\u00c8\u00e5$\u00a4\u00fe(|\u00a0\u00fe\u00a9{\u00e8D\u00cc\u00ef{k\u00fd>_/\u007f.";
                            var19_6 = "K\u0012\u008d\u001fD\u00a5\u008f3\u009f\u00e1\u009e\u0098{w\u00e8}\u00cb\u00800q\u00c5\u0095p\u00a7`\u00b6\u0082\u00f8 D9\u00c1m;\u0099\u008d\u0080\u0018G\u00bc\u00b7\u001f;A2\u0010?&\u0018\u0003S\u00da\u008d\u00b3\u0085\u0019\u00cdE\u00c3JC{\u00d3\u0095S\u00ae#\u00bbQ7\u00ac\u00cb\u00c0`N\u00d5*(\u00bb\u009d\u008fq[\u0019lX\u00cb\u00a0+L\u00a4\u00fd\u0013\u008b\u00d9\u001c<f\u00c8\u00e5$\u00a4\u00fe(|\u00a0\u00fe\u00a9{\u00e8D\u00cc\u00ef{k\u00fd>_/\u007f.".length();
                            var16_7 = 24;
                            var15_8 = -1;
lbl46:
                            // 2 sources

                            while (true) {
                                v6 = ++var15_8;
                                v4 = var17_5.substring(v6, v6 + var16_7);
                                v5 = 0;
                                break block13;
                                break;
                            }
                            break;
                        }
lbl51:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = aF.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            break block14;
                            break;
                        }
                    }
                    var21_9 = var13_1.doFinal(v4.getBytes("ISO-8859-1"));
                    switch (v5) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl63:
                        // 1 sources

                        ** continue;
                    }
                }
                aF.b = var20_3;
                aF.c = new String[14];
                aF.g = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var11 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var11 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[2];
                var3_13 = 0;
                var4_14 = "`9*C\u00cex\u00ff\u00ef\u00cf\\\u00f8\u00b2\u00b7\u0011\u0004D";
                var5_15 = "`9*C\u00cex\u00ff\u00ef\u00cf\\\u00f8\u00b2\u00b7\u0011\u0004D".length();
                var2_16 = 0;
                while (true) {
                    break block15;
                    break;
                }
lbl94:
                // 1 sources

                while (true) {
                    var6_12[v10] = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
                    if (var2_16 < var5_15) ** continue;
                    break block16;
                    break;
                }
            }
            var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
            v10 = var3_13++;
            var8_18 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            ** while (true)
        }
        aF.e = var6_12;
        aF.f = new Integer[2];
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3E91;
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
                throw new RuntimeException("dev/zprestige/prestige/aF", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            aF.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = aF.b(n, l);
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
            throw new RuntimeException("dev/zprestige/prestige/aF" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = aF.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = aF.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = aF.a(l, l2);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                aF.h[n] = clazz = Class.forName(i[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = aF.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = aF.b(classArray[i], string, clazz2);
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
            throw new RuntimeException("dev/zprestige/prestige/aF" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(long l, long l2) {
        int n = aF.a(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = aF.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = aF.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = aF.a(clazz3, string2, clazz2)) != null) {
                    aF.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = aF.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        aF.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = aF.b(542118310730186L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = aF.a(l, l2);
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
                clazz3 = aF.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = aF.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = aF.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        aF.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = aF.b(542118310730186L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = aF.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        aF.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = aF.b(542118310730186L, 0L);
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

    public static GameProfile a(Object[] objectArray) {
        GameProfile gameProfile;
        UUID uUID = (UUID)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        HttpURLConnection httpURLConnection = (HttpURLConnection)((Object)aF.c("\u00e8", (Object)new URL((String)((Object)aF.a("m", (int)29468, (long)(0x11EF136C77D21C79L ^ l))) + (String)((Object)aF.c("\u00e8", (Object)uUID, (long)-7971801969053403497L, (long)l)) + (String)((Object)aF.a("m", (int)22153, (long)(0x68B77B6364FF39EDL ^ l)))), (long)-7972013193411589170L, (long)l));
        aF.c("\u00e8", (Object)httpURLConnection, (Object)aF.a("m", (int)20081, (long)(0x1864D3C9B17E211BL ^ l)), (long)-7975211562442237104L, (long)l);
        if (aF.c("\u00e8", (Object)httpURLConnection, (long)-7972137659659219621L, (long)l) != aF.b("z", (int)27523, (long)(0x380731E814A34447L ^ l))) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((InputStream)((Object)aF.c("\u00e8", (Object)httpURLConnection, (long)-7972212754927897244L, (long)l))));
        try {
            GameProfile gameProfile2;
            CallSite callSite = aF.c("\u00e8", (Object)aF.c("\u00d4", (Object)bufferedReader, (long)-7972327172623544649L, (long)l), (long)-7971463706176167702L, (long)l);
            CallSite callSite2 = aF.c("\u00d4", (long)-7975168641193228514L, (long)l);
            aF.c("\u00e8", (Object)aF.c("\u00e8", (Object)callSite, (Object)aF.a("m", (int)13218, (long)(0x380F20DD95D85CCAL ^ l)), (long)-7971617927986798840L, (long)l), arg_0 -> aF.lambda$fetchSkinProfile$0((HashMultimap)callSite2, arg_0), (long)-7975303284036574886L, (long)l);
            gameProfile = gameProfile2 = new GameProfile(uUID, (String)((Object)aF.c("\u00e8", (Object)aF.c("\u00e8", (Object)callSite, (Object)aF.a("m", (int)65, (long)(0xD60C555BEFCEF28L ^ l)), (long)-7971564682617235617L, (long)l), (long)-7974772031388329977L, (long)l)), new PropertyMap((Multimap)callSite2));
        }
        catch (Throwable throwable) {
            try {
                try {
                    aF.c("\u00e8", (Object)bufferedReader, (long)-7971990697467149468L, (long)l);
                }
                catch (Throwable throwable2) {
                    aF.c("\u00e8", (Object)throwable, (Object)throwable2, (long)-7975067693010502804L, (long)l);
                }
                throw throwable;
            }
            catch (Exception exception) {
                aF.c("\u00e8", (Object)exception, (long)-7974950144329347567L, (long)l);
                return null;
            }
        }
        aF.c("\u00e8", (Object)bufferedReader, (long)-7971990697467149468L, (long)l);
        return gameProfile;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = aF.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
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

    public static UUID a(Object[] objectArray) {
        CallSite callSite;
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        HttpURLConnection httpURLConnection = (HttpURLConnection)((Object)aF.c("\u00e8", (Object)new URL((String)((Object)aF.a("m", (int)30913, (long)(0x4348F114E9007B5EL ^ l))) + string), (long)9052412300674230067L, (long)l));
        aF.c("\u00e8", (Object)httpURLConnection, (Object)aF.a("m", (int)25635, (long)(0x6115D332FE0267B8L ^ l)), (long)9056530410642814893L, (long)l);
        if (aF.c("\u00e8", (Object)httpURLConnection, (long)9052338824228004262L, (long)l) != aF.b("z", (int)26603, (long)(0x1532E34853E0A4D3L ^ l))) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((InputStream)((Object)aF.c("\u00e8", (Object)httpURLConnection, (long)9052265515758049689L, (long)l))));
        try {
            CallSite callSite2 = aF.c("\u00e8", (Object)aF.c("\u00d4", (Object)bufferedReader, (long)9052661408834888266L, (long)l), (long)9052994756096461847L, (long)l);
            CallSite callSite3 = aF.c("\u00e8", (Object)aF.c("\u00e8", (Object)callSite2, (Object)aF.a("m", (int)30649, (long)(0x30D13021157EF42FL ^ l)), (long)9052878544361044898L, (long)l), (long)9056442173956371706L, (long)l);
            callSite = aF.c("\u00d4", (Object)aF.c("\u00e8", (Object)callSite3, (Object)aF.a("m", (int)24859, (long)(0x1B6627BBF722E288L ^ l)), (Object)aF.a("m", (int)14876, (long)(0x5F64855EEDB9398EL ^ l)), (long)9053079320655258123L, (long)l), (long)9056374891624914456L, (long)l);
        }
        catch (Throwable throwable) {
            try {
                try {
                    aF.c("\u00e8", (Object)bufferedReader, (long)9052470034716782489L, (long)l);
                }
                catch (Throwable throwable2) {
                    aF.c("\u00e8", (Object)throwable, (Object)throwable2, (long)9056676271786022801L, (long)l);
                }
                throw throwable;
            }
            catch (Exception exception) {
                aF.c("\u00e8", (Object)exception, (long)9056264010502333164L, (long)l);
                return null;
            }
        }
        aF.c("\u00e8", (Object)bufferedReader, (long)9052470034716782489L, (long)l);
        return callSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = aF.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ed' || c == 'G' || c == '\u00c2' || c == '\u00dc') {
                field = aF.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ed' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'G' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = aF.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e8' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7E3A;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])d.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    d.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/aF", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            aF.c[n2] = aF.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/aF" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = h;
        h[0] = "\u0014WmS<P\u0002Wh\t/G\u0015\u001ck\u000f#S\u0004[|\u0018hA8";
        objectArray[1] = "W8,ey{\"\u0018'jh4_\u00004ma}7";
        objectArray[2] = "6P9v\u0011<:X8=X4&P:v< :Q\u00114\u0013>0Q ";
        objectArray[3] = "R1\u0011\u0017\u0003LY>\u0000X~TJ9\t\u0011";
        objectArray[4] = "F\u0010\u0018c\u001b\u000bJ\u0018\u0019(R\u0003V\u0010\u001bc6\u0017J\u0011:/\u0016\u0001F\u000b";
        objectArray[5] = Boolean.TYPE;
        aF.i[5] = "java/lang/Boolean";
        objectArray[6] = "n\u0011\u000e5Wtb\u0019\u000f~\u001exb\u0013\u000et^5n\u0011\u000fwUxyP+zCs@\u000b\u000foYvl\u000e";
        objectArray[7] = "e+\u000e&\u000fTn$\u001finZe/\u001b3";
        objectArray[8] = "anKc\u0015\u0002wnN9\u0006\u0015`%M?\n\u0001qbZ(A\u0013C";
        objectArray[9] = "-~\u0011\u001e(\u0017&q\u0000QK\u001a3|\u000f:~\u0018\"o\u0013\u0016i\u0015";
        objectArray[10] = "lO\u0002E+xg@\u0013\n@leK\u0004Pl{h";
        objectArray[11] = Void.TYPE;
        aF.i[11] = "java/lang/Void";
        objectArray[12] = "\u001c\u00003Cq7\u0013\u0015kj+-\u00064\u0017n\u001c6\u0018\u000f A+0\u0019\u000f";
        objectArray[13] = "\u0015S@\b-{\u0019[ACds\u0005SC\b\u0000g\u0019RlT8u\u000f";
        objectArray[14] = "6SbcJb([x,\u0002b2Q`k\u000byrq{l\u0017b1Wf";
        objectArray[15] = "3Q.`\u007fq8^?/\u0005u+_/`3q<";
        objectArray[16] = Integer.TYPE;
        aF.i[16] = "java/lang/Integer";
        objectArray[17] = "n\n\u001bT\u001c_kE$[BCp8\u0019GWWi";
        objectArray[18] = "tbW\"Qbq-c6\u0019m{qD'-n\u007fgD1";
        objectArray[19] = "uf&9Ntzs~\r2V";
        objectArray[20] = "\rGAeg/\u0002R\u0019Q\u001b\r$IYj,\"\u0013OXj";
        objectArray[21] = "Mrh)u1Azib<9]rk)X-AsUf`-Ko";
        objectArray[22] = "Fy\"}\u001eVC6\u0006yQ[Ij";
        objectArray[23] = "+\u0013\u0002\u001e4L5\u001b\u0018QOl\b6";
        objectArray[24] = "g1k_RB7;`\u0014(V\"?|\u001asR15y:RG33\u001aV\u0013L`ev\u0019TW)^";
        objectArray[25] = "r<\u000e^J\u001b)o\ta@#)nS\u0013\u001a\u001c)1K\u001c*";
        objectArray[26] = "8\u0006d/Y\u0014`H4|dKl\u0005\u0016d?X{\u00189pd\u001ey\u0007g`\u0001XdI6\u001f";
        objectArray[27] = "#UE\u001ct\f4\u000e\t\\\u001e\u00196S]~b\r-RW%$\u000f2\fG@b\u0012|]8J\u007f\nu^C]$F54";
        objectArray[28] = "R&Po8<X1Q\"_;\u000f!s=&=\u000f&U\u00152<\u0002:EPe8\u001ceV5#%R4)`d\"ZfE/#9\u0013]";
        objectArray[29] = " A$\u0002/H\u007fRpUA\u001evCWQ*\u0010\u0011\bcFz\fwB{Y8p!\u0002x\u0000z\u001cnEcIA";
        objectArray[30] = ";-\u0014\u0003Ey#%\u0014\u0011.j>3,\u001dV{(2\f\u001bCoR6\u0005\u0003Mh(.\r\u0003_\u0003bd\u0015X\u0015o-#\u000e\u0011.";
        objectArray[31] = "P/@/|V\u0014:\u0001>\u0007M\u0016>R0j&P/@/|V\u0014:\u0001>\u0007";
        objectArray[32] = "AHc:j/K_bw\r<\u001cO@hv+\u0016UahF4\u001d^\u001aom\"\u001dRg=|-\u00143";
        objectArray[33] = "J}\u0002mO}@j\u0003 (n\u0017z:4P|\u0006]\u0007(Eh\u001f\u0006\u0010kSh\u0006d\u00037Xlz";
        objectArray[34] = "4\"<KYWez0\\(N; '](\u0015d%d\u000bDZ#>-0";
        objectArray[35] = "ZN}\u007fF=JH}x!`NN+\u000fFaPN&8@`P# /\u001a8\u0007E7\u007f\u001fa6";
        objectArray[36] = "M,Tk\u0011(L;_ *\"\u001f</+R<N8JmOr\u001fG\u0014v\u001bzF<Q.X)v";
        objectArray[37] = "{'li<J?2-xGB:'\u00177,\u00077#o6\"D*[*azJ?#+o9WG`p;\u007f\n<%(x,:";
        objectArray[38] = "O\u0012\u0017g\u0002E\u0018\u0011Qb`Kq\u0017Re\u0000\u001dLNFvY\"OVQy_\u001f\u0016BB `";
        objectArray[39] = "s\u0000]ZDn&GF\u00044/tFT\tn:tPB\u001e49c[T\u000fX3#\u0001Wd\r(&\f\u0012TUfv_/";
        objectArray[40] = "\u001c<2\u0006@\u0013\u001d+9M{\u0016J+IF\u0003\u0007\u001f(,\u0000\u001eINWp\u0003@I\u001ag(M\u0010\u001a'";
        objectArray[41] = "\u0017\\r\"5%\u0016Kyi\u000e AK@#L4KQ@\"t&]73 pwSRu=>&,\u0006qf4!\u0014Yb2cO";
        objectArray[42] = "-z/tHNkga%7Qzz5%\\FYc+7K+-z/tHNkga%7\u0011o|i3RWr28L\rSi:.)KN'kQ";
        objectArray[43] = "!\u000b@it%yE\u0010:Izu\b2\"\u000bn\u007f\u0012<3+xs\b{b\"nbO\u0011c5e)t";
        Object[] objectArray2 = objectArray;
        objectArray[44] = "V\u0003F]X^AX\n\u001d2Y^9G\u001eSCVb\u0001\u001cL\u001dF\u0007G\u0001\u0002L9";
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
            case 0 -> 58;
            case 1 -> 7;
            case 2 -> 14;
            case 3 -> 57;
            case 4 -> 8;
            case 5 -> 32;
            case 6 -> 52;
            case 7 -> 21;
            case 8 -> 51;
            case 9 -> 54;
            case 10 -> 37;
            case 11 -> 30;
            case 12 -> 62;
            case 13 -> 25;
            case 14 -> 50;
            case 15 -> 61;
            case 16 -> 20;
            case 17 -> 45;
            case 18 -> 55;
            case 19 -> 63;
            case 20 -> 60;
            case 21 -> 13;
            case 22 -> 28;
            case 23 -> 35;
            case 24 -> 23;
            case 25 -> 40;
            case 26 -> 26;
            case 27 -> 44;
            case 28 -> 17;
            case 29 -> 27;
            case 30 -> 22;
            case 31 -> 6;
            case 32 -> 0;
            case 33 -> 43;
            case 34 -> 24;
            case 35 -> 38;
            case 36 -> 16;
            case 37 -> 2;
            case 38 -> 36;
            case 39 -> 9;
            case 40 -> 11;
            case 41 -> 31;
            case 42 -> 4;
            case 43 -> 1;
            case 44 -> 59;
            case 45 -> 39;
            case 46 -> 46;
            case 47 -> 48;
            case 48 -> 41;
            case 49 -> 56;
            case 50 -> 49;
            case 51 -> 34;
            case 52 -> 47;
            case 53 -> 10;
            case 54 -> 53;
            case 55 -> 12;
            case 56 -> 19;
            case 57 -> 29;
            case 58 -> 15;
            case 59 -> 18;
            case 60 -> 33;
            case 61 -> 5;
            case 62 -> 42;
            default -> 3;
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
        aF.i[n3] = new String(cArray);
        return n3;
    }

    private static void lambda$fetchSkinProfile$0(HashMultimap hashMultimap, JsonElement jsonElement) {
        CallSite callSite;
        CallSite callSite2;
        CallSite callSite3;
        long l;
        block6: {
            block5: {
                CallSite callSite4;
                CallSite callSite5;
                block4: {
                    l = a ^ 0x68FD6EDC39A6L;
                    CallSite callSite6 = aF.c("\u00e8", (Object)jsonElement, (long)3305508585241500778L, (long)l);
                    CallSite callSite7 = aF.c("\u00d4", (long)3302011246979007154L, (long)l);
                    callSite3 = aF.c("\u00e8", (Object)aF.c("\u00e8", (Object)callSite6, (Object)aF.a("m", (int)26396, (long)(0x2EE0AA1E21E0B4F1L ^ l)), (long)3305498493802343391L, (long)l), (long)3302201080770815111L, (long)l);
                    callSite2 = aF.c("\u00e8", (Object)aF.c("\u00e8", (Object)callSite6, (Object)aF.a("m", (int)30423, (long)(0x65A9D54BED17A53BL ^ l)), (long)3305498493802343391L, (long)l), (long)3302201080770815111L, (long)l);
                    try {
                        try {
                            callSite5 = callSite6;
                            callSite4 = aF.a("m", (int)30169, (long)(0x122AE7C34A26263AL ^ l));
                            if (callSite7 != null) break block4;
                            if (aF.c("\u00e8", (Object)callSite5, (Object)callSite4, (long)3304624000908496442L, (long)l) == false) break block5;
                        }
                        catch (MatchException matchException) {
                            throw aF.c("\u00d4", (Object)matchException, (long)3304795635317746180L, (long)l);
                        }
                        callSite5 = callSite6;
                        callSite4 = aF.a("m", (int)3712, (long)(0x5862216A3655D67L ^ l));
                    }
                    catch (MatchException matchException) {
                        throw aF.c("\u00d4", (Object)matchException, (long)3304795635317746180L, (long)l);
                    }
                }
                callSite = aF.c("\u00e8", (Object)aF.c("\u00e8", (Object)callSite5, (Object)callSite4, (long)3305498493802343391L, (long)l), (long)3302201080770815111L, (long)l);
                break block6;
            }
            callSite = null;
        }
        CallSite callSite8 = callSite;
        aF.c("\u00e8", (Object)hashMultimap, (Object)callSite3, (Object)new Property((String)((Object)callSite3), (String)((Object)callSite2), (String)((Object)callSite8)), (long)3304519708880957116L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(aF.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(aF.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(aF.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


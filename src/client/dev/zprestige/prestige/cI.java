/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.lenni0451.classtransform.annotations.CTransformer
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.hc;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URL;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.lenni0451.classtransform.annotations.CTransformer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class cI {
    private static final String a;
    private static final long b;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;
    private static final Object[] i;
    private static final String[] j;

    private cI() {
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        cI.b = hc.a(609081776520035955L, -5569876071425846940L, MethodHandles.lookup().lookupClass()).a(254232854729714L);
                        cI.i = new Object[59];
                        cI.j = new String[59];
                        cI.a();
                        cI.e = new HashMap<K, V>(13);
                        var11 = cI.b ^ 122189463001586L;
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
                        var20_3 = new String[13];
                        var18_4 = 0;
                        var17_5 = "\u00b4\u00be\u00a5\u00b3\u00f7\u0085\u00b4\u00a0c$V\u000f\u00be@\u0002\u00f1\u0010\u0091\u00f1-\u008f\u00060\u008b\u00d7M\b\u007f\u00d9\u0017\u0080\u0019\u0012\u0010\u009e\u00f9\u00bd\u00e6YfT\u00a1_:\u00aa\u0091\u00f0@Nt\u0010\u0088\u00b7up\"\u0087J\u0001\u00d4\u007f\u00aa\u0082\u008e\u000b\u00ed\u0096@\u0007\u00f9o\u0080\u00e9\u0004,^\u00ddVn\u00de\u00c5\u00c0\u00fb\u00f2C\u00a0\u0084\u0090k#<\u0085\u00d7s\u00f5\u00d4\u00da\u0097\u0003\u0095\u00felAC\u00a8\u00b9p:?v\u00af\u00db>\u008cA0(K\u00dc%\u009c\u00bf\u00a4\u00bcY\u00b3\u00d7\u00f4%\u00fb\u00cf\\\u0010\u00b8up\u00cc@\u00c35\u0002\u008bwc\u00e6[s\u008e\u00b0@\u009f\u00b9\u00e5\u00d1\u00b47.\u0094r\u00f0\u001b\u0011\u00e8\u00bc\u000e\u0085!eA 8\u0006\u0099$\u0018\u0083\u001ao\u001c\u00ac\u00f2I\u00bb\u00ba/\u007f\u00eb\u00e0\u009e\u00d1\u0080\u00dcy\u00b5He\u0002\u0099B\u00c9\u00d7a\u00c0\u00adt\u00e8\u00d6\u001a1\u00ee\u00a8*\u001fT@__\u00e78MW\u00a0p$\u00c6*>\u0017V\u00bd\u009b\u00c8\u0084O\u00d3=ia\r\u00cd \u00a6\u0085\b3\u000b\u009b~H\u0007\u00d7\u00ca\u00ea\u00b1\u0011\u00c9\t\u00ed\u00d6\u0002R\u00eaE\u009b\u0002C\u00d5\u0018\u0097\u00e9\u00d7*1\u000e\u00cc`\u00b2\u00aey\u0010\u00dc(2\u00c1\u00cc8\u00c4i\u00b1\u001f\f\u00b7\u00b4\u009d*D@\u000e\u00e2L\u0015h\u00d8\u0082:A\u00ef~\u009dy\u009bY\u008a\r\u00bb\u00c02\u007f}\u001f\"L\u00d9\u00c4\u0096\u00dc\u00f5,\u00a8\u00cb\u00c4\u008adS\u00fd&\u00cdpT\u00d8\u00dc\u007f8\u00b7[\u00e8\u00d6U\u00da\u00a5\u00dfPW\u00f7B\u00fa\u0012F)\u00c8\u00fe\u0010\u0082{\u0081\u00a6\u00f4\\\u00c8\u0006\u001a]a\u0011\u001bs;\u0013";
                        var19_6 = "\u00b4\u00be\u00a5\u00b3\u00f7\u0085\u00b4\u00a0c$V\u000f\u00be@\u0002\u00f1\u0010\u0091\u00f1-\u008f\u00060\u008b\u00d7M\b\u007f\u00d9\u0017\u0080\u0019\u0012\u0010\u009e\u00f9\u00bd\u00e6YfT\u00a1_:\u00aa\u0091\u00f0@Nt\u0010\u0088\u00b7up\"\u0087J\u0001\u00d4\u007f\u00aa\u0082\u008e\u000b\u00ed\u0096@\u0007\u00f9o\u0080\u00e9\u0004,^\u00ddVn\u00de\u00c5\u00c0\u00fb\u00f2C\u00a0\u0084\u0090k#<\u0085\u00d7s\u00f5\u00d4\u00da\u0097\u0003\u0095\u00felAC\u00a8\u00b9p:?v\u00af\u00db>\u008cA0(K\u00dc%\u009c\u00bf\u00a4\u00bcY\u00b3\u00d7\u00f4%\u00fb\u00cf\\\u0010\u00b8up\u00cc@\u00c35\u0002\u008bwc\u00e6[s\u008e\u00b0@\u009f\u00b9\u00e5\u00d1\u00b47.\u0094r\u00f0\u001b\u0011\u00e8\u00bc\u000e\u0085!eA 8\u0006\u0099$\u0018\u0083\u001ao\u001c\u00ac\u00f2I\u00bb\u00ba/\u007f\u00eb\u00e0\u009e\u00d1\u0080\u00dcy\u00b5He\u0002\u0099B\u00c9\u00d7a\u00c0\u00adt\u00e8\u00d6\u001a1\u00ee\u00a8*\u001fT@__\u00e78MW\u00a0p$\u00c6*>\u0017V\u00bd\u009b\u00c8\u0084O\u00d3=ia\r\u00cd \u00a6\u0085\b3\u000b\u009b~H\u0007\u00d7\u00ca\u00ea\u00b1\u0011\u00c9\t\u00ed\u00d6\u0002R\u00eaE\u009b\u0002C\u00d5\u0018\u0097\u00e9\u00d7*1\u000e\u00cc`\u00b2\u00aey\u0010\u00dc(2\u00c1\u00cc8\u00c4i\u00b1\u001f\f\u00b7\u00b4\u009d*D@\u000e\u00e2L\u0015h\u00d8\u0082:A\u00ef~\u009dy\u009bY\u008a\r\u00bb\u00c02\u007f}\u001f\"L\u00d9\u00c4\u0096\u00dc\u00f5,\u00a8\u00cb\u00c4\u008adS\u00fd&\u00cdpT\u00d8\u00dc\u007f8\u00b7[\u00e8\u00d6U\u00da\u00a5\u00dfPW\u00f7B\u00fa\u0012F)\u00c8\u00fe\u0010\u0082{\u0081\u00a6\u00f4\\\u00c8\u0006\u001a]a\u0011\u001bs;\u0013".length();
                        var16_7 = 16;
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
                            var20_3[var18_4++] = cI.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u00fb\u00c9L\r1z\u00d1w\u00b8\u00f1\u0095j\u0080\u00e1\u00b7\u00be\u00ff\u00c8\u00ca\u00a7\u00c6N\u00b0\u0080Xf\u0006\u00b2\u00c4W\u00fa7\u00987\u00b7\u009b&\u0005\u00d8W%\u000e\u00eb\u00a1\u00f8\u001a_\u00c6dU\\\u008e\u00cc\u00fb\u00f2\\P'\u001e\u00b6\u000e1\u00b6\u00d5\u00106<\u00a5\u00bc\u0088(\u00c3F\u00b7\u00c1\u0018\u00feyLi.";
                            var19_6 = "\u00fb\u00c9L\r1z\u00d1w\u00b8\u00f1\u0095j\u0080\u00e1\u00b7\u00be\u00ff\u00c8\u00ca\u00a7\u00c6N\u00b0\u0080Xf\u0006\u00b2\u00c4W\u00fa7\u00987\u00b7\u009b&\u0005\u00d8W%\u000e\u00eb\u00a1\u00f8\u001a_\u00c6dU\\\u008e\u00cc\u00fb\u00f2\\P'\u001e\u00b6\u000e1\u00b6\u00d5\u00106<\u00a5\u00bc\u0088(\u00c3F\u00b7\u00c1\u0018\u00feyLi.".length();
                            var16_7 = 64;
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
                            var20_3[var18_4++] = cI.a(var21_9).intern();
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
                cI.c = var20_3;
                cI.d = new String[13];
                cI.a = cI.a("h", (int)29561, (long)(567521826188599963L ^ var11));
                cI.h = new HashMap<K, V>(13);
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
                var6_12 = new long[3];
                var3_13 = 0;
                var4_14 = "\u00f5\u00a2-O\u00e5\u0084\u009f#x\u00a5<\u00c2\u0087\u00ee[$K.\u00d7\u0098\u00a8S\u00cc\u008e";
                var5_15 = "\u00f5\u00a2-O\u00e5\u0084\u009f#x\u00a5<\u00c2\u0087\u00ee[$K.\u00d7\u0098\u00a8S\u00cc\u008e".length();
                var2_16 = 0;
                while (true) {
                    break block15;
                    break;
                }
lbl95:
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
        cI.f = var6_12;
        cI.g = new Integer[3];
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6CBF;
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
                throw new RuntimeException("dev/zprestige/prestige/cI", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            cI.g[n2] = n3;
        }
        return g[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = cI.b(n, l);
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
            throw new RuntimeException("dev/zprestige/prestige/cI" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = cI.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = cI.b(classArray2[i], string, clazz2, n, classArray);
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
            int n = cI.a(l, l2);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                cI.i[n] = clazz = Class.forName(j[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = cI.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = cI.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    /*
     * Loose catch block
     */
    private static void b(Object[] objectArray) {
        block6: {
            String string = (String)objectArray[0];
            ClassLoader classLoader = (ClassLoader)objectArray[1];
            Set set = (Set)objectArray[2];
            long l = (Long)objectArray[3];
            l = b ^ l;
            CallSite callSite = cI.c("\u00c0", (long)-3322534535347553216L, (long)l);
            try {
                CallSite callSite2 = cI.c("\u00c0", (Object)cI.c("X", string, (char)cI.b("i", (int)26327, (long)(0x454B66FFF33A5B8CL ^ l)), (char)cI.b("i", (int)3069, (long)(0x72B24B4A8B10B6A7L ^ l)), (long)-3319908340129497310L, (long)l), (boolean)false, (Object)classLoader, (long)-3319977426299237177L, (long)l);
                CallSite callSite3 = cI.c("X", (Object)callSite2, CTransformer.class, (long)-3320845472424320259L, (long)l);
                if (callSite != null) break block6;
                try {
                    block7: {
                        if (callSite3 == false) break block6;
                        break block7;
                        catch (Throwable throwable) {
                            throw cI.c("\u00c0", (Object)throwable, (long)-3321293312855844226L, (long)l);
                        }
                    }
                    callSite3 = cI.c("X", (Object)set, (Object)string, (long)-3321076608568608507L, (long)l);
                }
                catch (Throwable throwable) {
                    throw cI.c("\u00c0", (Object)throwable, (long)-3321293312855844226L, (long)l);
                }
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cI" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(long l, long l2) {
        int n = cI.a(l, l2);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = cI.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = cI.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = cI.a(clazz3, string2, clazz2)) != null) {
                    cI.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = cI.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        cI.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = cI.b(624756819489494L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = cI.a(l, l2);
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
                clazz3 = cI.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = cI.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = cI.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        cI.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = cI.b(624756819489494L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = cI.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        cI.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = cI.b(624756819489494L, 0L);
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
    private static void a(Object[] var0) {
        block55: {
            var1_1 = (URL)var0[0];
            var5_2 = (ClassLoader)var0[1];
            var4_3 = (Set)var0[2];
            var2_4 = (Long)var0[3];
            var6_5 = (var2_4 = cI.b ^ var2_4) ^ 23449438790873L;
            var9_6 = cI.c("X", (Object)var1_1, (long)-6359974003959360681L, (long)var2_4);
            var8_7 = cI.c("\u00c0", (long)-6362462360477545968L, (long)var2_4);
            try {
                block61: {
                    block62: {
                        block60: {
                            block50: {
                                block53: {
                                    block54: {
                                        block51: {
                                            block52: {
                                                try {
                                                    v0 = cI.c("X", (Object)cI.a("h", (int)31040, (long)(5520574688364872802L ^ var2_4)), (Object)var9_6, (long)-6361303902443732766L, (long)var2_4);
                                                    if (var8_7 != null) break block50;
                                                    if (v0 != false) {
                                                    }
                                                    ** GOTO lbl93
                                                }
                                                catch (Throwable v1) {
                                                    throw cI.c("\u00c0", (Object)v1, (long)-6361221134774588370L, (long)var2_4);
                                                }
                                                var10_8 = new File((URI)cI.c("X", (Object)var1_1, (long)-6362818611431824440L, (long)var2_4));
                                                try {
                                                    v2 = var10_8;
                                                    if (var8_7 != null) break block51;
                                                    if (cI.c("X", (Object)v2, (long)-6359419615261002087L, (long)var2_4) != false) break block52;
                                                }
                                                catch (Throwable v3) {
                                                    throw cI.c("\u00c0", (Object)v3, (long)-6361221134774588370L, (long)var2_4);
                                                }
                                                return;
                                            }
                                            v2 = var10_8;
                                        }
                                        var11_10 = cI.c("X", (Object)v2, (long)-6360369267609175181L, (long)var2_4);
                                        try {
                                            v4 = var11_10;
                                            if (var8_7 != null) break block53;
                                            if (v4 != null) break block54;
                                        }
                                        catch (Throwable v5) {
                                            throw cI.c("\u00c0", (Object)v5, (long)-6361221134774588370L, (long)var2_4);
                                        }
                                        return;
                                    }
                                    v4 = var11_10;
                                }
                                for (Object var15_18 : v4) {
                                    block58: {
                                        block59: {
                                            block56: {
                                                block57: {
                                                    block68: {
                                                        var16_20 = cI.c("X", (Object)var15_18, (long)-6361059360661400273L, (long)var2_4);
                                                        if (var8_7 != null) break block55;
                                                        v6 = var16_20;
                                                        if (var8_7 != null) break block56;
                                                        break block68;
                                                        catch (Throwable v7) {
                                                            throw cI.c("\u00c0", (Object)v7, (long)-6361221134774588370L, (long)var2_4);
                                                        }
                                                    }
                                                    try {
                                                        if (cI.c("X", (Object)v6, (Object)cI.a("h", (int)16177, (long)(419342523527758363L ^ var2_4)), (long)-6360446444709163950L, (long)var2_4) == false) {
                                                            continue;
                                                        }
                                                        break block57;
                                                        catch (Throwable v8) {
                                                            throw cI.c("\u00c0", (Object)v8, (long)-6361221134774588370L, (long)var2_4);
                                                        }
                                                    }
                                                    catch (Throwable v9) {
                                                        throw cI.c("\u00c0", (Object)v9, (long)-6361221134774588370L, (long)var2_4);
                                                    }
                                                }
                                                v6 = cI.c("X", (Object)var16_20, (int)0, (int)(cI.c("X", (Object)var16_20, (long)-6360140392468183546L, (long)var2_4) - cI.c("X", (Object)cI.a("h", (int)9934, (long)(6860043340776315878L ^ var2_4)), (long)-6360140392468183546L, (long)var2_4)), (long)-6360272682861660433L, (long)var2_4);
                                            }
                                            var17_21 = v6;
                                            v10 = var17_21;
                                            if (var8_7 != null) break block58;
                                            try {
                                                if (cI.c("X", (Object)v10, (Object)"$", (long)-6359657372636134555L, (long)var2_4) != false) {
                                                    continue;
                                                }
                                                break block59;
                                                catch (Throwable v11) {
                                                    throw cI.c("\u00c0", (Object)v11, (long)-6361221134774588370L, (long)var2_4);
                                                }
                                            }
                                            catch (Throwable v12) {
                                                throw cI.c("\u00c0", (Object)v12, (long)-6361221134774588370L, (long)var2_4);
                                            }
                                        }
                                        v10 = (String)cI.a("h", (int)9510, (long)(4135055510043006981L ^ var2_4)) + (String)var17_21;
                                    }
                                    v13 = new Object[4];
                                    v13[3] = var6_5;
                                    v13[2] = var4_3;
                                    v13[1] = var5_2;
                                    v13[0] = v10;
                                    cI.c("\u00c0", (Object)v13, (long)-6362763628664764633L, (long)var2_4);
                                    if (var8_7 == null) continue;
                                }
                                if (var8_7 == null) break block55;
lbl93:
                                // 2 sources

                                try {
                                    block69: {
                                        v14 = cI.a("h", (int)17667, (long)(6371445237358295082L ^ var2_4));
                                        if (var8_7 != null) break block60;
                                        break block69;
                                        catch (Throwable v15) {
                                            throw cI.c("\u00c0", (Object)v15, (long)-6361221134774588370L, (long)var2_4);
                                        }
                                    }
                                    v0 = cI.c("X", (Object)v14, (Object)var9_6, (long)-6361303902443732766L, (long)var2_4);
                                }
                                catch (Throwable v16) {
                                    throw cI.c("\u00c0", (Object)v16, (long)-6361221134774588370L, (long)var2_4);
                                }
                            }
                            try {
                                if (v0 == false) break block55;
                                v14 = cI.c("X", (Object)var1_1, (long)-6362587161508369464L, (long)var2_4);
                            }
                            catch (Throwable v17) {
                                throw cI.c("\u00c0", (Object)v17, (long)-6361221134774588370L, (long)var2_4);
                            }
                        }
                        if ((var11_11 = cI.c("X", (Object)(var10_8 = v14), (int)cI.b("i", (int)27215, (long)(3935025085756678471L ^ var2_4)), (long)-6360914369334015246L, (long)var2_4)) < 0) {
                            return;
                        }
                        var12_12 = cI.c("X", (Object)var10_8, (int)cI.c("X", (Object)cI.a("h", (int)22801, (long)(7041228899311215671L ^ var2_4)), (long)-6360140392468183546L, (long)var2_4), (int)var11_11, (long)-6360272682861660433L, (long)var2_4);
                        try {
                            v18 = var12_12;
                            v19 = cI.a("h", (int)30049, (long)(7645394287439824974L ^ var2_4));
                            if (var8_7 != null) break block61;
                            if (cI.c("X", (Object)v18, (Object)v19, (long)-6360078059775984475L, (long)var2_4) == false) break block62;
                        }
                        catch (Throwable v20) {
                            throw cI.c("\u00c0", (Object)v20, (long)-6361221134774588370L, (long)var2_4);
                        }
                        var12_12 = cI.c("X", (Object)var12_12, (int)cI.c("X", (Object)cI.a("h", (int)25708, (long)(6024330150006217036L ^ var2_4)), (long)-6360140392468183546L, (long)var2_4), (long)-6359488712412789097L, (long)var2_4);
                    }
                    v18 = var12_12;
                    v19 = cI.a("h", (int)12765, (long)(6632583986693901558L ^ var2_4));
                }
                var12_12 = cI.c("\u00c0", (Object)v18, (Object)v19, (long)-6360021129639433816L, (long)var2_4);
                var13_14 = new JarFile((String)var12_12);
                try {
                    var14_16 = cI.c("X", (Object)var13_14, (long)-6359769984698308793L, (long)var2_4);
                    while (cI.c("X", (Object)var14_16, (long)-6360872691688282861L, (long)var2_4) != false) {
                        block67: {
                            block66: {
                                block65: {
                                    block63: {
                                        block64: {
                                            block70: {
                                                var15_18 = (JarEntry)cI.c("X", (Object)var14_16, (long)-6361191015479592336L, (long)var2_4);
                                                var16_20 = cI.c("X", (Object)var15_18, (long)-6359535742364807984L, (long)var2_4);
                                                if (var8_7 != null) break block55;
                                                v21 = var16_20;
                                                v22 = cI.a("h", (int)28883, (long)(2888099943963151869L ^ var2_4));
                                                if (var8_7 != null) break block63;
                                                break block70;
                                                catch (Throwable v23) {
                                                    throw cI.c("\u00c0", (Object)v23, (long)-6361221134774588370L, (long)var2_4);
                                                }
                                            }
                                            try {
                                                if (cI.c("X", (Object)v21, (Object)v22, (long)-6360078059775984475L, (long)var2_4) == false) {
                                                    continue;
                                                }
                                                break block64;
                                                catch (Throwable v24) {
                                                    throw cI.c("\u00c0", (Object)v24, (long)-6361221134774588370L, (long)var2_4);
                                                }
                                            }
                                            catch (Throwable v25) {
                                                throw cI.c("\u00c0", (Object)v25, (long)-6361221134774588370L, (long)var2_4);
                                            }
                                        }
                                        v21 = var16_20;
                                        v22 = cI.a("h", (int)12979, (long)(1140256440462380958L ^ var2_4));
                                    }
                                    var17_21 = cI.c("X", (Object)v21, (int)(cI.c("X", (Object)v22, (long)-6360140392468183546L, (long)var2_4) + 1), (long)-6359488712412789097L, (long)var2_4);
                                    try {
                                        v26 = cI.c("X", (Object)var17_21, (Object)"/", (long)-6359657372636134555L, (long)var2_4);
                                        if (var8_7 == null) {
                                            if (v26 != false) continue;
                                        }
                                        break block65;
                                    }
                                    catch (Throwable v27) {
                                        throw cI.c("\u00c0", (Object)v27, (long)-6361221134774588370L, (long)var2_4);
                                    }
                                    v26 = cI.c("X", (Object)var17_21, (Object)"$", (long)-6359657372636134555L, (long)var2_4);
                                }
                                try {
                                    if (var8_7 != null) break block66;
                                    if (v26 != false) continue;
                                }
                                catch (Throwable v28) {
                                    throw cI.c("\u00c0", (Object)v28, (long)-6361221134774588370L, (long)var2_4);
                                }
                                try {
                                    v29 = var17_21;
                                    if (var8_7 != null) break block67;
                                    v26 = cI.c("X", (Object)v29, (Object)cI.a("h", (int)9934, (long)(6860043340776315878L ^ var2_4)), (long)-6360446444709163950L, (long)var2_4);
                                }
                                catch (Throwable v30) {
                                    throw cI.c("\u00c0", (Object)v30, (long)-6361221134774588370L, (long)var2_4);
                                }
                            }
                            if (v26 == false) continue;
                            v29 = cI.c("X", (Object)var17_21, (int)0, (int)(cI.c("X", (Object)var17_21, (long)-6360140392468183546L, (long)var2_4) - cI.c("X", (Object)cI.a("h", (int)9934, (long)(6860043340776315878L ^ var2_4)), (long)-6360140392468183546L, (long)var2_4)), (long)-6360272682861660433L, (long)var2_4);
                        }
                        var18_22 = v29;
                        v31 = new Object[4];
                        v31[3] = var6_5;
                        v31[2] = var4_3;
                        v31[1] = var5_2;
                        v31[0] = (String)cI.a("h", (int)28883, (long)(2888099943963151869L ^ var2_4)) + (String)var18_22;
                        cI.c("\u00c0", (Object)v31, (long)-6362763628664764633L, (long)var2_4);
                        if (var8_7 == null) continue;
                    }
                }
                catch (Throwable var14_17) {
                    try {
                        cI.c("X", (Object)var13_14, (long)-6359239009470244272L, (long)var2_4);
                    }
                    catch (Throwable var15_19) {
                        cI.c("X", (Object)var14_17, (Object)var15_19, (long)-6362980795811914040L, (long)var2_4);
                    }
                    throw var14_17;
                }
                cI.c("X", (Object)var13_14, (long)-6359239009470244272L, (long)var2_4);
            }
            catch (Throwable var10_9) {
                // empty catch block
            }
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = cI.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = cI.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00fe' || c == '\u00e0' || c == '\u00e8' || c == 'T') {
                field = cI.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00fe' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e0' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = cI.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'X' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c0' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String[] a(Object[] var0) {
        block8: {
            var1_1 = (Long)var0[0];
            var3_2 = (var1_1 = cI.b ^ var1_1) ^ 11512300530949L;
            var6_3 = new TreeSet<E>();
            var5_4 = cI.c("\u00c0", (long)-7476006879529175652L, (long)var1_1);
            var7_5 = cI.c("X", cI.class, (long)-7479631486607756248L, (long)var1_1);
            try {
                v0 = var7_5;
                if (var5_4 == null) {
                    if (v0 != null) break block8;
                }
                ** GOTO lbl20
            }
            catch (Throwable v1) {
                throw cI.c("\u00c0", (Object)v1, (long)-7479218391489342558L, (long)var1_1);
            }
            var7_5 = cI.c("\u00c0", (long)-7479466547498043657L, (long)var1_1);
        }
        try {
            v0 = var7_5;
lbl20:
            // 2 sources

            var8_6 = cI.c("X", (Object)v0, (Object)cI.a("h", (int)13989, (long)(3939292140671874056L ^ var1_1)), (long)-7479902376218801456L, (long)var1_1);
            while (cI.c("X", (Object)var8_6, (long)-7478862046741144929L, (long)var1_1) != false) {
                var9_8 = (URL)cI.c("X", (Object)var8_6, (long)-7479178180149475844L, (long)var1_1);
                try {
                    v2 = new Object[4];
                    v2[3] = var3_2;
                    v2[2] = var6_3;
                    v2[1] = var7_5;
                    v2[0] = var9_8;
                    cI.c("\u00c0", (Object)v2, (long)-7479388326023926859L, (long)var1_1);
                    if (var5_4 == null && var5_4 == null) continue;
                    return (String[])cI.c("X", var6_3, (Object)new String[0], (long)-7476414912236555717L, (long)var1_1);
                }
                catch (Throwable v3) {
                    throw cI.c("\u00c0", (Object)v3, (long)-7479218391489342558L, (long)var1_1);
                    return (String[])cI.c("X", var6_3, (Object)new String[0], (long)-7476414912236555717L, (long)var1_1);
                }
            }
        }
        catch (Throwable var8_7) {
            // empty catch block
        }
        return (String[])cI.c("X", var6_3, (Object)new String[0], (long)-7476414912236555717L, (long)var1_1);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1A9F;
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
                throw new RuntimeException("dev/zprestige/prestige/cI", exception);
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
            cI.d[n2] = cI.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cI" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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
            case 0 -> 12;
            case 1 -> 15;
            case 2 -> 39;
            case 3 -> 24;
            case 4 -> 33;
            case 5 -> 56;
            case 6 -> 9;
            case 7 -> 35;
            case 8 -> 47;
            case 9 -> 16;
            case 10 -> 51;
            case 11 -> 58;
            case 12 -> 17;
            case 13 -> 34;
            case 14 -> 43;
            case 15 -> 30;
            case 16 -> 49;
            case 17 -> 13;
            case 18 -> 60;
            case 19 -> 8;
            case 20 -> 40;
            case 21 -> 5;
            case 22 -> 3;
            case 23 -> 11;
            case 24 -> 63;
            case 25 -> 45;
            case 26 -> 27;
            case 27 -> 32;
            case 28 -> 41;
            case 29 -> 6;
            case 30 -> 38;
            case 31 -> 57;
            case 32 -> 19;
            case 33 -> 25;
            case 34 -> 37;
            case 35 -> 62;
            case 36 -> 0;
            case 37 -> 61;
            case 38 -> 23;
            case 39 -> 10;
            case 40 -> 44;
            case 41 -> 48;
            case 42 -> 28;
            case 43 -> 36;
            case 44 -> 54;
            case 45 -> 4;
            case 46 -> 42;
            case 47 -> 1;
            case 48 -> 46;
            case 49 -> 31;
            case 50 -> 2;
            case 51 -> 59;
            case 52 -> 52;
            case 53 -> 7;
            case 54 -> 22;
            case 55 -> 14;
            case 56 -> 26;
            case 57 -> 20;
            case 58 -> 55;
            case 59 -> 50;
            case 60 -> 29;
            case 61 -> 53;
            case 62 -> 21;
            default -> 18;
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
        cI.j[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = i;
        i[0] = "\u0016mKSE2\u0000mN\tV%\u0017&M\u000fZ1\u0006aZ\u0018\u0011#:";
        objectArray[1] = "1q/\u0012>5DQ$\u001d/z9I7\u001a&3Q";
        objectArray[2] = "sZg/\b\u0016xUv`u\u000ekR\u007f)";
        objectArray[3] = Character.TYPE;
        cI.j[3] = "java/lang/Character";
        objectArray[4] = "\rE1An1\u0006J \u000e\u00031\u0006W4";
        objectArray[5] = Boolean.TYPE;
        cI.j[5] = "java/lang/Boolean";
        objectArray[6] = "b\u0014Lj\u001eai\u001b]%sai\u0006IG_ll\u0010H";
        objectArray[7] = "1V\u0018}*J/^\u00022WZ/";
        objectArray[8] = "1\\ae\u0014G:Sp*uI1Xtp";
        objectArray[9] = "O7\u0013DV\u000eY7\u0016\u001eE\u0019N|\u0015\u0018I\r_;\u0002\u000f\u0002\u001db";
        objectArray[10] = "I[\u0004m\u00150BT\u0015\"o4QU\u0005mY0F";
        objectArray[11] = "}E&!&:rP~\u0015Z\u0018";
        objectArray[12] = Integer.TYPE;
        cI.j[12] = "java/lang/Integer";
        objectArray[13] = Void.TYPE;
        cI.j[13] = "java/lang/Void";
        objectArray[14] = "h0U\u001dD\u0005g%\r)8'F4@\u0013\u000e\u000ep";
        objectArray[15] = "G!7\t\u000e$Y)-FJ0_n\u000b\tR\u0017D,$";
        objectArray[16] = "AJ`0.\u001b4jk??TUd`4;\u000e!";
        objectArray[17] = "`\u0007e2kXo\u0012=\u0006\u0017\u007f";
        objectArray[18] = "\ftG\u000e\u0004s\u0012|]A@g\u0014;{\u000eXC\baC\u0016";
        objectArray[19] = "!ou\t>4*`dFS0*|P\ra-.``\r";
        objectArray[20] = "\"=\u000fN\u0019H'r?F[D";
        objectArray[21] = "GW\\J\u0005\u0014Y_F\u0005n\u000fX[OYJ\u0015DYD";
        objectArray[22] = "F\u001b:X<.3>?\u0017\f&q2k";
        objectArray[23] = "QHY@K\u0018$hROZWEfYD^\r1";
        objectArray[24] = "s|7\u001d\bI\u0006\\<\u0012\u0019\u0006gR7\u0019\u001d\\\u0013";
        objectArray[25] = "2!\u0012V{\u0010G\u0001\u0019Yj_&\u000f\u0012Rn\u0005R";
        objectArray[26] = "a\tT,x\u00046\u0003K\u0012|`'\u0003KcjX$\u001d\u0013\u0012";
        objectArray[27] = "\u001a>X^h\u0006[~\u0007\\\f\u001dB\u0018F@m\u0007JC\u0003@3\u0003L.ZYt\u0010%";
        objectArray[28] = "ZS\r~,\u0016Z\u0006\u0016\u007fM\u0007\u0000!\u0013`$\ng\b\f+7F\n\u000f\u0011v\"{\u0007\rX`p\u0016\u0000\u0010\u0005uM";
        objectArray[29] = "ND!\u0011\u0004\u0011\u000b\f!Qb\u0014\u001d\u0011\u0014\u0011\u001a\u0005\u000b\u00104\u0017\u000f\u0011qBv\u0002\u001f\u001b\u001d\u0007>\u0002_}@E1\u0015\u001f\u0000\u001c\u0011t\u0006b";
        objectArray[30] = "\u000fr\u000fm\u001c@Vd\u001bs \u001b1~\u0011'ZL\\y\fzOq\u0000&\no]\f\\rO| ";
        objectArray[31] = "jk\u0014@8&++KB\\=2K,e\\*n)\u0007\\'*+,G$";
        objectArray[32] = "fM[\u001dSy?T\u001c\u000e:n2O\u0000\u0016Qy_\r\t\u0010\u0004r4]\u0007\u0016D\u0014eZ\u000bA\\\u007f5T\r\u0001:-%\b\u0006\u0016Wt<O\u0015\u007f";
        objectArray[33] = "\n-U{x\u0011Wj\\l\u001c\u001aVh\"yy\u00191+\u001e/~\u001d\\r\u0007hmt\nkU}n\u001b\u000evY~\u001cH\u000ew\u000bn'M\u0000~^\u0010'K\u0000y\u0000uz\f\tnd";
        objectArray[34] = "EmcS^#\u001ct$@7%\u001bq XV(\u0007\u00170QG \u001cu'L^3|,%\u0000Z<\u0013(8\fYN";
        objectArray[35] = "\u0015 \u0017:\b,\u00130\u0014!e;\u001a.\b9\b-|?\u0002=Y-\u0007)\u0015d\nV";
        objectArray[36] = "n\nxpr\b7\u0013?c\u001b\u001e+\u0019=n`:6\f'\u0012\"\u001fh\u0012.\u007f{\u0006/\u0001G)bT:\u0002(-\u007fX9p";
        objectArray[37] = ">w\n?_KgnM,6BjkZ!V&7h\r9\u0006\\k\u007fS:6";
        objectArray[38] = "J%kC\u0004\u000e\u000be4A`\u0006\u0018$Q]\u0007\u0015\u00123nC`P\u000fgkN\r\t\u0016 x'";
        objectArray[39] = "T.[KZX\u00056XXf\u000b\b?\u0007W\u000bg\\._Y\u000f\n\u00057\u0018Jf^\u001fk\u0002R\u000b\u0007\u0006,\u0011;_\u001dZ6\tV\u0006\u0004\u001d%`";
        objectArray[40] = "\u0004f\u0019\u0003\u0017.\u0002v\u001a\u0018z?\ts\u0007\fzeUj\u0005\u001c\u00079\u0001/\u0016a";
        objectArray[41] = ")\u0004=0>ftC4'Zl\u007fGG?3xi\u007fk26nh;0d?ll\u00005j69\u0012";
        objectArray[42] = "]\u0015k\u0012\u007fI\u0004\u0003\u007f\fC\u0011c\u0019uX9E\u000e\u001eh\u0005,xRAn\u0010>\u0005\u000e\u0015+\u0003C";
        objectArray[43] = "\u001a.\r\u001f]/\u001f \u0004J#{Km3\u0001XhKt#\u0014Jo]U\u000f\u0019Oy\\\u0011TOF{X*QAO.&";
        objectArray[44] = "aDF\u0005K]4^JK'YgB~RB[\n\u0007B\u0004E_g^[CV6";
        objectArray[45] = "z6A,\tp\u007f8Hyw$+u~.\f,;sO.\fK\u007fs\u001b!\u001e&&j\\2w&6l\u00188\f0!5KC";
        objectArray[46] = "Q<:s\u0007H\u0007!?gz\u0015F\u000e$m\u0017\u001fA%?fzODs(e\u0015KY\u007f+\u0017";
        objectArray[47] = "_\u001bW\u0012Ok\u0006\u0002\u0010\u0001&}\u001b\u000b\u0013\f\\g\u0000\u000eh@C>\u0002Q\u0012\u001cT`\u0001aQ\n\u0019d\u000f\f\b\u0013^wf";
        objectArray[48] = "oI~lCj6P9\u007f*f0_,~miV\u0003$6N7,_3hM\u0007fVyj\u001a}:A'i*";
        objectArray[49] = "\u0015U\u0004XIJ\u0015\u0000\u001fY(ND\u0002`\u0002\u0015HH\u0004\u0002_WVEn[E\u0019JZ\u0001_X\u0015I(";
        objectArray[50] = "xhG]E6%/NJ!28\u001e\u0010PF/*+\u0017QG\u000b9:\r[G/ClI\u0007J7&1\u000e\u000e]Sx.G[S<|3KX!";
        objectArray[51] = "L\u0014T\u001fpWZ\u0003\rL\u000bLH\u001ftDqAl\u0000\\FfJ]\u001f1\u0018r\u001dL\u0016^\u001co\u0011Od";
        objectArray[52] = "(1#\u007fK:q'7awb\u0016baj\nmz')jJ\u000b)d6y\u0011gl,69w";
        objectArray[53] = "5$DgDKl=\u0003t-Ku#\u0012aV&2c\u0014eGDo!\nh-\u001duo\u0016wB\u0019hc\u0015\u0005";
        objectArray[54] = "v<[\u0014\u0010. !^\u0000m}w>b\u0019\b\u007f\u001a{^O\u000f{w\"G\b\u001c\u0012";
        objectArray[55] = "\u0001\u0007]Ew}\u0017\u0010\u0004\u0016\f`\u0001\u0007D4hk\t\u001a^\u0005\f8Q\u0018X\u0013ne\u0013\u0006Uy";
        objectArray[56] = "\u0004\\pR_\u0003RAuF\"[\tYsxC[\u0005Y\u000fXLT\u0016K}[\u0019G\u0012\"";
        objectArray[57] = "(n&+.:qwa8G:wxb\u0016&+q\u0014 3x5xyy*?&\u0011/`x*%~+}t)W";
        Object[] objectArray2 = objectArray;
        objectArray[58] = "\u000fa8g\u001fSVx\u007ftvEKq|y\f_Pt\u00075\u0013\u0006R+}i\u0004XQ\u001b7`NZ\u0006akw\u0010Y6\"}:\u0014W[{d}\u0007>";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(cI.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(cI.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(cI.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


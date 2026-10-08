/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

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

/*
 * Renamed from dev.zprestige.prestige.h
 */
final class h_0
extends Enum {
    public static final h_0 IDLE;
    public static final h_0 ARMED;
    public static final h_0 SWITCH_RAIL;
    public static final h_0 SWITCH_CART;
    public static final h_0 SWITCH_FIRE;
    public static final h_0 SWITCH_XBOW;
    public static final h_0 FIRE;
    public static final h_0 SWITCH_BOW;
    public static final h_0 USE_BOW;
    public static final h_0 CHARGE_WAIT;
    public static final h_0 RELEASE;
    private static final h_0[] a;
    private static final long b;
    private static final long[] c;
    private static final Integer[] d;
    private static final Map e;
    private static final Object[] f;
    private static final String[] g;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private h_0() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        h_0.b = hc.a(6552284062965639167L, 8082887275500109167L, MethodHandles.lookup().lookupClass()).a(38994076712378L);
                        var20 = h_0.b ^ 34540981734346L;
                        var22_1 = var20 ^ 44137166251034L;
                        h_0.f = new Object[9];
                        h_0.g = new String[9];
                        h_0.a();
                        var12_2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var20 >>> 56);
                        for (var13_3 = 1; var13_3 < 8; ++var13_3) {
                            v2 = v2;
                            v2[var13_3] = (byte)(var20 << var13_3 * 8 >>> 56);
                        }
                        var12_2.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var11_4 = new String[11];
                        var17_5 = 0;
                        var16_6 = "\u00b1\u00a6#\u0095\u00cci\u001a%\u00ca%^\u00c8\u008f\u00c4\u0012y\u0010)5a8\u00cc\u00a5\u00da\u0093Is\u00c6`\u0010\u00fd\u00ab\u00f2\b\u00b5\u0091U\u0094\u00e5\u001c\u00ef\u00a5\u0010\u00e78\u00a8\u0092!0\u00ae\u00de\u00b9\r\u0099VL8R6\u0010[\u0082RoY `'\u00cf\"\r\u00a4\u00ad{P\u0011\b-kE\u00bb\u00f6\u001b\u00d4\u0006\b\u0010\u001f(\u00a9!8j\u00df\u0010\u00c3z\u001e\u00fe:\u0012\u00fbH\rf\u0019\u009dWj\u00855\b\u00ec\u0014\u007f\u00f4f\u00ado-";
                        var18_7 = "\u00b1\u00a6#\u0095\u00cci\u001a%\u00ca%^\u00c8\u008f\u00c4\u0012y\u0010)5a8\u00cc\u00a5\u00da\u0093Is\u00c6`\u0010\u00fd\u00ab\u00f2\b\u00b5\u0091U\u0094\u00e5\u001c\u00ef\u00a5\u0010\u00e78\u00a8\u0092!0\u00ae\u00de\u00b9\r\u0099VL8R6\u0010[\u0082RoY `'\u00cf\"\r\u00a4\u00ad{P\u0011\b-kE\u00bb\u00f6\u001b\u00d4\u0006\b\u0010\u001f(\u00a9!8j\u00df\u0010\u00c3z\u001e\u00fe:\u0012\u00fbH\rf\u0019\u009dWj\u00855\b\u00ec\u0014\u007f\u00f4f\u00ado-".length();
                        var15_8 = 16;
                        var14_9 = -1;
lbl33:
                        // 2 sources

                        while (true) {
                            v3 = ++var14_9;
                            v4 = var16_6.substring(v3, v3 + var15_8);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl38:
                        // 1 sources

                        while (true) {
                            var11_4[var17_5++] = h_0.a(var19_10).intern();
                            if ((var14_9 += var15_8) < var18_7) {
                                var15_8 = var16_6.charAt(var14_9);
                                ** continue;
                            }
                            var16_6 = "\u0097L\u0004\u0081\u00d2\u008e\u00a5`\u00dbe\u0093\u0017%\u0087~\u00da\b\u00d8E\u0093\r\u00a9\u00005\u0087";
                            var18_7 = "\u0097L\u0004\u0081\u00d2\u008e\u00a5`\u00dbe\u0093\u0017%\u0087~\u00da\b\u00d8E\u0093\r\u00a9\u00005\u0087".length();
                            var15_8 = 16;
                            var14_9 = -1;
lbl47:
                            // 2 sources

                            while (true) {
                                v6 = ++var14_9;
                                v4 = var16_6.substring(v6, v6 + var15_8);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl52:
                        // 1 sources

                        while (true) {
                            var11_4[var17_5++] = h_0.a(var19_10).intern();
                            if ((var14_9 += var15_8) < var18_7) {
                                var15_8 = var16_6.charAt(var14_9);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var19_10 = var12_2.doFinal(v4.getBytes("ISO-8859-1"));
                    switch (v5) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl64:
                        // 1 sources

                        ** continue;
                    }
                }
                h_0.e = new HashMap<K, V>(13);
                var0_11 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var1_12 = 1; var1_12 < 8; ++var1_12) {
                    v9 = v9;
                    v9[var1_12] = (byte)(var20 << var1_12 * 8 >>> 56);
                }
                var0_11.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_13 = new long[11];
                var3_14 = 0;
                var4_15 = "\u008c]>\u009f\u001e.\u009f#\u0000\u00dee\u007f\u00b7\u00beQ\u0083\u00f9P\u0002\u00aa\u00b4N\u00fa\u00ea\n\u0012<~\u00cf+\u0006\u00dbW\u0084 tv&\u0090x\u00af\u00f5\u00cdA>hKG\u00ae;\u00af\u00b8\u00b7\u00cb]\u0018\u000f\u00df\u0011\u00c3\u000b\u00f1C\u008a?\u00f9\u0093\u0006\u00d1<\u00ed\u0012";
                var5_16 = "\u008c]>\u009f\u001e.\u009f#\u0000\u00dee\u007f\u00b7\u00beQ\u0083\u00f9P\u0002\u00aa\u00b4N\u00fa\u00ea\n\u0012<~\u00cf+\u0006\u00dbW\u0084 tv&\u0090x\u00af\u00f5\u00cdA>hKG\u00ae;\u00af\u00b8\u00b7\u00cb]\u0018\u000f\u00df\u0011\u00c3\u000b\u00f1C\u008a?\u00f9\u0093\u0006\u00d1<\u00ed\u0012".length();
                var2_17 = 0;
                while (true) {
                    var7_18 = var4_15.substring(var2_17, var2_17 += 8).getBytes("ISO-8859-1");
                    v10 = var6_13;
                    v11 = var3_14++;
                    v12 = ((long)var7_18[0] & 255L) << 56 | ((long)var7_18[1] & 255L) << 48 | ((long)var7_18[2] & 255L) << 40 | ((long)var7_18[3] & 255L) << 32 | ((long)var7_18[4] & 255L) << 24 | ((long)var7_18[5] & 255L) << 16 | ((long)var7_18[6] & 255L) << 8 | (long)var7_18[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl101:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_17 < var5_16) ** continue;
                    var4_15 = "U\u00e1\u00d9\u0093\u00a9\u0015\u00901\u0017v\u00da\u00b1\u00f5\u00ef\u00fbc";
                    var5_16 = "U\u00e1\u00d9\u0093\u00a9\u0015\u00901\u0017v\u00da\u00b1\u00f5\u00ef\u00fbc".length();
                    var2_17 = 0;
                    while (true) {
                        var7_18 = var4_15.substring(var2_17, var2_17 += 8).getBytes("ISO-8859-1");
                        v10 = var6_13;
                        v11 = var3_14++;
                        v12 = ((long)var7_18[0] & 255L) << 56 | ((long)var7_18[1] & 255L) << 48 | ((long)var7_18[2] & 255L) << 40 | ((long)var7_18[3] & 255L) << 32 | ((long)var7_18[4] & 255L) << 24 | ((long)var7_18[5] & 255L) << 16 | ((long)var7_18[6] & 255L) << 8 | (long)var7_18[7] & 255L;
                        v13 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl120:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_17 < var5_16) ** continue;
                    break block21;
                    break;
                }
            }
            var8_19 = v12;
            var10_20 = var0_11.doFinal(new byte[]{(byte)(var8_19 >>> 56), (byte)(var8_19 >>> 48), (byte)(var8_19 >>> 40), (byte)(var8_19 >>> 32), (byte)(var8_19 >>> 24), (byte)(var8_19 >>> 16), (byte)(var8_19 >>> 8), (byte)var8_19});
            v14 = ((long)var10_20[0] & 255L) << 56 | ((long)var10_20[1] & 255L) << 48 | ((long)var10_20[2] & 255L) << 40 | ((long)var10_20[3] & 255L) << 32 | ((long)var10_20[4] & 255L) << 24 | ((long)var10_20[5] & 255L) << 16 | ((long)var10_20[6] & 255L) << 8 | (long)var10_20[7] & 255L;
            switch (v13) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl133:
                // 1 sources

                ** continue;
            }
        }
        h_0.c = var6_13;
        h_0.d = new Integer[11];
        h_0.IDLE = new h_0(var11_4[5], 0);
        h_0.ARMED = new h_0(var11_4[10], 1);
        h_0.SWITCH_RAIL = new h_0(var11_4[1], 2);
        h_0.SWITCH_CART = new h_0(var11_4[0], 3);
        h_0.SWITCH_FIRE = new h_0(var11_4[9], 4);
        h_0.SWITCH_XBOW = new h_0(var11_4[4], 5);
        h_0.FIRE = new h_0(var11_4[2], (int)h_0.a("t", (int)12427, (long)(4022662698798098840L ^ var20)));
        h_0.SWITCH_BOW = new h_0(var11_4[3], (int)h_0.a("t", (int)2822, (long)(675440110883246614L ^ var20)));
        h_0.USE_BOW = new h_0(var11_4[6], (int)h_0.a("t", (int)24177, (long)(7181445208990336874L ^ var20)));
        h_0.CHARGE_WAIT = new h_0(var11_4[7], (int)h_0.a("t", (int)4999, (long)(4744870781909764752L ^ var20)));
        h_0.RELEASE = new h_0(var11_4[8], (int)h_0.a("t", (int)16268, (long)(8023586286975231646L ^ var20)));
        v15 = new Object[1];
        v15[0] = var22_1;
        h_0.a = h_0.b("s", (Object)v15, (long)630306373391597437L, (long)var20);
    }

    public static h_0[] values() {
        return (h_0[])a.clone();
    }

    public static h_0 valueOf(String string, long l) {
        l = b ^ l;
        return (h_0)((Object)h_0.b("s", h_0.class, (Object)string, (long)-8794718264152776326L, (long)l));
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/h" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = h_0.a(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                h_0.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = h_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = h_0.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = h_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = h_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = h_0.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = h_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = h_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = h_0.a(clazz3, string2, clazz2)) != null) {
                    h_0.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = h_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        h_0.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = h_0.b(465836125927792L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = h_0.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = g[n];
                int n3 = string2.indexOf(8);
                clazz3 = h_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = h_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = h_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        h_0.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = h_0.b(465836125927792L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = h_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        h_0.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = h_0.b(465836125927792L, 0L);
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

    private static h_0[] a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = b ^ l;
        h_0[] h_0Array = new h_0[h_0.a("t", (int)21643, (long)(0x17C4055337332AFCL ^ l))];
        h_0Array[0] = IDLE;
        h_0Array[1] = ARMED;
        h_0Array[2] = SWITCH_RAIL;
        h_0Array[3] = SWITCH_CART;
        h_0Array[4] = SWITCH_FIRE;
        h_0Array[5] = SWITCH_XBOW;
        h_0Array[h_0.a("t", (int)18419, (long)(0x6C72D3C18FE43987L ^ l))] = FIRE;
        h_0Array[h_0.a("t", (int)8712, (long)(0x2824CEF5A2035C70L ^ l))] = SWITCH_BOW;
        h_0Array[h_0.a("t", (int)16327, (long)(0x41DEA43A10A9C1BCL ^ l))] = USE_BOW;
        h_0Array[h_0.a("t", (int)27799, (long)(0x5DE42B0D8D8B12EBL ^ l))] = CHARGE_WAIT;
        h_0Array[h_0.a("t", (int)1512, (long)(0x37A59491AA41FB91L ^ l))] = RELEASE;
        return h_0Array;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e2' || c == 'D' || c == 'O' || c == '\u00d5') {
                field = h_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e2' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'D' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'O' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = h_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'Q' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 's' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = h_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "?\u000bbu\u0019b)\u000bg/\nu>@d)\u0006a/\u0007s>Mz";
        objectArray[1] = "(\u0017UYFZ]7^VW\u0015<9U]SOH";
        objectArray[2] = "%\u0000\t\u0016kk\u0004<\u001f\u0016n1\u0017+\b]m7\u001b?\u0019\u001az P$V";
        objectArray[3] = "\u001b>'\u001a;L\u001016UPN\u00042";
        objectArray[4] = "o\u0010Jx\u001cwd\u001f[7qwd\u0002O";
        objectArray[5] = "qU5\u0012E&zZ$]8>i]-\u0014";
        objectArray[6] = "\u0004&)TE\u0005\u000f)8\u001b$\u000b\u0004\"<A";
        objectArray[7] = "5 `$\b\u0019p.<40\u000ef$\"2w\u001e\u000fz#:B\u0013f1=!Bp3y':\u000e@f\u007f$60Jo\u007f$gY\u000fa#4_";
        Object[] objectArray2 = objectArray;
        objectArray[8] = "%\u00061\u0018\u001ar\u007fA&~\u000eHyU)\u0006\nt<M*\u001fgq!_iG[*{\r5~";
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (g[n3] != null) {
            return n3;
        }
        Object object = f[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 12;
            case 1 -> 20;
            case 2 -> 22;
            case 3 -> 42;
            case 4 -> 4;
            case 5 -> 0;
            case 6 -> 16;
            case 7 -> 40;
            case 8 -> 18;
            case 9 -> 55;
            case 10 -> 46;
            case 11 -> 63;
            case 12 -> 37;
            case 13 -> 34;
            case 14 -> 57;
            case 15 -> 41;
            case 16 -> 59;
            case 17 -> 8;
            case 18 -> 50;
            case 19 -> 27;
            case 20 -> 38;
            case 21 -> 3;
            case 22 -> 49;
            case 23 -> 47;
            case 24 -> 48;
            case 25 -> 9;
            case 26 -> 53;
            case 27 -> 60;
            case 28 -> 29;
            case 29 -> 32;
            case 30 -> 19;
            case 31 -> 31;
            case 32 -> 6;
            case 33 -> 15;
            case 34 -> 1;
            case 35 -> 39;
            case 36 -> 58;
            case 37 -> 33;
            case 38 -> 56;
            case 39 -> 11;
            case 40 -> 13;
            case 41 -> 7;
            case 42 -> 51;
            case 43 -> 24;
            case 44 -> 36;
            case 45 -> 61;
            case 46 -> 2;
            case 47 -> 52;
            case 48 -> 43;
            case 49 -> 30;
            case 50 -> 54;
            case 51 -> 21;
            case 52 -> 25;
            case 53 -> 62;
            case 54 -> 23;
            case 55 -> 26;
            case 56 -> 10;
            case 57 -> 44;
            case 58 -> 5;
            case 59 -> 45;
            case 60 -> 35;
            case 61 -> 14;
            case 62 -> 28;
            default -> 17;
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
        h_0.g[n3] = new String(cArray);
        return n3;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = h_0.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x11AE;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])e.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    e.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/h", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            h_0.d[n2] = n3;
        }
        return d[n2];
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/h" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(h_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(h_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


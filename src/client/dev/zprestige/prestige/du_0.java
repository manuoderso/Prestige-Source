/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector4f
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.cp_0;
import dev.zprestige.prestige.dt_0;
import dev.zprestige.prestige.dv_0;
import dev.zprestige.prestige.dw_0;
import dev.zprestige.prestige.fW;
import dev.zprestige.prestige.gO;
import dev.zprestige.prestige.gQ;
import dev.zprestige.prestige.gS;
import dev.zprestige.prestige.gT;
import dev.zprestige.prestige.gf_0;
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
import org.joml.Vector4f;

/*
 * Renamed from dev.zprestige.prestige.du
 */
public class du_0 {
    public static final dt_0 a;
    public static final dt_0 b;
    public static final dt_0 c;
    public static final dt_0 d;
    public static final dt_0 e;
    private static final Map f;
    private static final int g;
    private static final long h;
    private static final long[] i;
    private static final Integer[] j;
    private static final Map k;
    private static final Object[] l;
    private static final String[] m;

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                block12: {
                    du_0.h = hc.a(-8710118675009374906L, -7590066320749159530L, MethodHandles.lookup().lookupClass()).a(14053220545731L);
                    v0 = var15 = du_0.h ^ 28349638154679L;
                    var17_1 = v0 ^ 1576153071146L;
                    var19_2 = v0 ^ 74083711291999L;
                    var21_3 = v0 ^ 75649359883817L;
                    du_0.l = new Object[17];
                    du_0.m = new String[17];
                    du_0.a();
                    var12_4 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v1 = SecretKeyFactory.getInstance("DES");
                    v2 = new byte[8];
                    v3 = v2;
                    v2[0] = (byte)(var15 >>> 56);
                    for (var13_5 = 1; var13_5 < 8; ++var13_5) {
                        v3 = v3;
                        v3[var13_5] = (byte)(var15 << var13_5 * 8 >>> 56);
                    }
                    break block12;
lbl26:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var12_4.init(2, (Key)v1.generateSecret(new DESKeySpec(v3)), new IvParameterSpec(new byte[8]));
                var14_7 = var12_4.doFinal("\u001fE\u00c4\u00af\u0012\f5\u00f3\u008f\u00b6\u00b6\u0080\u00a1\u0006\u00c4\u00f4".getBytes("ISO-8859-1"));
                ** while (true)
                var11_6 = du_0.a(var14_7).intern();
                du_0.k = new HashMap<K, V>(13);
                var0_8 = Cipher.getInstance("DES/CBC/NoPadding");
                v4 = SecretKeyFactory.getInstance("DES");
                v5 = new byte[8];
                v6 = v5;
                v5[0] = (byte)(var15 >>> 56);
                for (var1_9 = 1; var1_9 < 8; ++var1_9) {
                    v6 = v6;
                    v6[var1_9] = (byte)(var15 << var1_9 * 8 >>> 56);
                }
                var0_8.init(2, (Key)v4.generateSecret(new DESKeySpec(v6)), new IvParameterSpec(new byte[8]));
                var6_10 = new long[10];
                var3_11 = 0;
                var4_12 = "\u0017\u00b4\u00b7\u00efQ\u00193mv\u00ba\u0014\u00db7fs\u00d3\r\u00aa\u00c5b\u00c7\u000fZ=<#t\u00c8>\u00dd_\u00c3&\u000e\u0097\u00f6\u008c\u00f9\u0086\u0006m\u00f8D*\"\u00da\u0016f\u00ab\u0003\u00f9\u0083@\u00e3z\u00a8\u00d4N\u00b9\u00d2:Yx3";
                var5_13 = "\u0017\u00b4\u00b7\u00efQ\u00193mv\u00ba\u0014\u00db7fs\u00d3\r\u00aa\u00c5b\u00c7\u000fZ=<#t\u00c8>\u00dd_\u00c3&\u000e\u0097\u00f6\u008c\u00f9\u0086\u0006m\u00f8D*\"\u00da\u0016f\u00ab\u0003\u00f9\u0083@\u00e3z\u00a8\u00d4N\u00b9\u00d2:Yx3".length();
                var2_14 = 0;
                while (true) {
                    var7_15 = var4_12.substring(var2_14, var2_14 += 8).getBytes("ISO-8859-1");
                    v7 = var6_10;
                    v8 = var3_11++;
                    v9 = ((long)var7_15[0] & 255L) << 56 | ((long)var7_15[1] & 255L) << 48 | ((long)var7_15[2] & 255L) << 40 | ((long)var7_15[3] & 255L) << 32 | ((long)var7_15[4] & 255L) << 24 | ((long)var7_15[5] & 255L) << 16 | ((long)var7_15[6] & 255L) << 8 | (long)var7_15[7] & 255L;
                    v10 = -1;
                    break block10;
                    break;
                }
lbl75:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_14 < var5_13) ** continue;
                    var4_12 = "\u00d3\u0000\u00fe\u00e0\u0092\u00a4?]~\u00b8Z\u009d\u0080\u00b9h8";
                    var5_13 = "\u00d3\u0000\u00fe\u00e0\u0092\u00a4?]~\u00b8Z\u009d\u0080\u00b9h8".length();
                    var2_14 = 0;
                    while (true) {
                        var7_15 = var4_12.substring(var2_14, var2_14 += 8).getBytes("ISO-8859-1");
                        v7 = var6_10;
                        v8 = var3_11++;
                        v9 = ((long)var7_15[0] & 255L) << 56 | ((long)var7_15[1] & 255L) << 48 | ((long)var7_15[2] & 255L) << 40 | ((long)var7_15[3] & 255L) << 32 | ((long)var7_15[4] & 255L) << 24 | ((long)var7_15[5] & 255L) << 16 | ((long)var7_15[6] & 255L) << 8 | (long)var7_15[7] & 255L;
                        v10 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl94:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_14 < var5_13) ** continue;
                    break block11;
                    break;
                }
            }
            var8_16 = v9;
            var10_17 = var0_8.doFinal(new byte[]{(byte)(var8_16 >>> 56), (byte)(var8_16 >>> 48), (byte)(var8_16 >>> 40), (byte)(var8_16 >>> 32), (byte)(var8_16 >>> 24), (byte)(var8_16 >>> 16), (byte)(var8_16 >>> 8), (byte)var8_16});
            v11 = ((long)var10_17[0] & 255L) << 56 | ((long)var10_17[1] & 255L) << 48 | ((long)var10_17[2] & 255L) << 40 | ((long)var10_17[3] & 255L) << 32 | ((long)var10_17[4] & 255L) << 24 | ((long)var10_17[5] & 255L) << 16 | ((long)var10_17[6] & 255L) << 8 | (long)var10_17[7] & 255L;
            switch (v10) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl107:
                // 1 sources

                ** continue;
            }
        }
        du_0.i = var6_10;
        du_0.j = new Integer[10];
        du_0.a = new dt_0(gf_0.b, 4, false, new fW[]{fW.a, new gS(cp_0.a), new gQ((int)du_0.a("c", (int)3713, (long)(8742273465164970290L ^ var15)), false), new gT(true, true), new gO((int)du_0.a("c", (int)29050, (long)(2539818329342887630L ^ var15)), (int)du_0.a("c", (int)1656, (long)(7629190935588549071L ^ var15)))}, var21_3);
        v12 = new fW[du_0.a("c", (int)24975, (long)(4963946237414856250L ^ var15))];
        v12[0] = fW.a;
        v12[1] = new gS(cp_0.a);
        v12[2] = new gQ((int)du_0.a("c", (int)14223, (long)(1021169138228199472L ^ var15)), false);
        v12[3] = new gT(true, true);
        v12[4] = new gO((int)du_0.a("c", (int)1656, (long)(7629190935588549071L ^ var15)), (int)du_0.a("c", (int)1656, (long)(7629190935588549071L ^ var15)));
        v12[5] = new gQ((int)du_0.a("c", (int)9521, (long)(6464515480325919361L ^ var15)), false);
        du_0.b = new dt_0(gf_0.b, 4, false, v12, var21_3);
        v13 = new fW[du_0.a("c", (int)11934, (long)(3572838899767843112L ^ var15))];
        v13[0] = fW.a;
        v13[1] = new gS(cp_0.a);
        v13[2] = new gQ((int)du_0.a("c", (int)14223, (long)(1021169138228199472L ^ var15)), true);
        v13[3] = new gT(true, true);
        v13[4] = new gO((int)du_0.a("c", (int)1656, (long)(7629190935588549071L ^ var15)), (int)du_0.a("c", (int)1656, (long)(7629190935588549071L ^ var15)));
        v13[5] = new gQ((int)du_0.a("c", (int)17987, (long)(5238806787645141489L ^ var15)), true);
        du_0.c = new dt_0(gf_0.b, 4, false, v13, var21_3);
        du_0.d = new dt_0(gf_0.b, 1, false, new fW[]{fW.a, new gS(cp_0.a), new gQ((int)du_0.a("c", (int)14223, (long)(1021169138228199472L ^ var15)), true), new gT(true, true), new gO((int)du_0.a("c", (int)1656, (long)(7629190935588549071L ^ var15)), (int)du_0.a("c", (int)1656, (long)(7629190935588549071L ^ var15)))}, var21_3);
        v14 = new fW[du_0.a("c", (int)11934, (long)(3572838899767843112L ^ var15))];
        v14[0] = fW.a;
        v14[1] = new gS(cp_0.a);
        v14[2] = new gQ((int)du_0.a("c", (int)14223, (long)(1021169138228199472L ^ var15)), true);
        v14[3] = new gT(true, true);
        v14[4] = new gO((int)du_0.a("c", (int)1656, (long)(7629190935588549071L ^ var15)), (int)du_0.a("c", (int)1656, (long)(7629190935588549071L ^ var15)));
        v14[5] = new gQ((int)du_0.a("c", (int)17987, (long)(5238806787645141489L ^ var15)), false);
        du_0.e = new dt_0(gf_0.b, 1, false, v14, var21_3);
        v15 = new Object[2];
        v15[1] = var17_1;
        v15[0] = (int)du_0.a("c", (int)11127, (long)(3706841546556546249L ^ var15));
        du_0.f = du_0.b("\u00f1", (Object)v15, (long)5360158852263016640L, (long)var15);
        v16 = new Object[2];
        v16[1] = var19_2;
        v16[0] = var11_6;
        du_0.g = (int)du_0.b("\u00f8", (Object)cp_0.c, (Object)v16, (long)5360281181203478371L, (long)var15);
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = du_0.a(l, l2);
            object = du_0.l[n];
            try {
                if (!(object instanceof String)) break block2;
                du_0.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = du_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = du_0.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = du_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = du_0.b(classArray2[i], string, clazz2, n, classArray);
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
            throw new RuntimeException("dev/zprestige/prestige/du" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(long l, long l2) {
        int n = du_0.a(l, l2);
        Object object = du_0.l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = du_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = du_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = du_0.a(clazz3, string2, clazz2)) != null) {
                    du_0.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = du_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        du_0.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = du_0.b(577284874391073L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = du_0.a(l, l2);
        Object object = du_0.l[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = m[n];
                int n3 = string2.indexOf(8);
                clazz3 = du_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = du_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = du_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        du_0.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = du_0.b(577284874391073L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = du_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        du_0.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = du_0.b(577284874391073L, 0L);
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
        int n2 = du_0.a(n, l);
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

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    public static dt_0 a(Object[] objectArray) {
        dt_0 dt_02;
        block2: {
            dt_0 dt_03;
            block3: {
                Vector4f vector4f = (Vector4f)objectArray[0];
                long l = (Long)objectArray[1];
                long l2 = l = h ^ l;
                long l3 = l2 ^ 0x13F7C7BEBF31L;
                long l4 = l2 ^ 0x5148844DF22L;
                dw_0 dw_02 = new dw_0(vector4f, l4);
                CallSite callSite = du_0.b("\u00f1", (long)-2631623817424791383L, (long)l);
                dt_03 = (dt_0)((Object)du_0.b("\u00f8", (Object)f, (Object)dw_02, (long)-2631305562583869803L, (long)l));
                try {
                    dt_02 = dt_03;
                    if (callSite != null) break block2;
                    if (dt_02 != null) break block3;
                }
                catch (MatchException matchException) {
                    throw du_0.b("\u00f1", (Object)matchException, (long)-2631110450474378786L, (long)l);
                }
                fW[] fWArray = new fW[du_0.a("c", (int)27798, (long)(0x7BE63114DD214A3FL ^ l))];
                fWArray[0] = fW.a;
                fWArray[1] = new gS(cp_0.c);
                fWArray[2] = new gQ((int)du_0.a("c", (int)14223, (long)(0xE2BBCD101289128L ^ l)), true);
                fWArray[3] = new gT(true, true);
                fWArray[4] = new gO((int)du_0.a("c", (int)1656, (long)(0x69E00386ADE520D7L ^ l)), (int)du_0.a("c", (int)1656, (long)(0x69E00386ADE520D7L ^ l)));
                fWArray[5] = new gQ((int)du_0.a("c", (int)17987, (long)(0x48B3AC3EE2F9E0E9L ^ l)), false);
                fWArray[du_0.a("c", (int)11934, (long)(0x319511360EDB8830L ^ l))] = new dv_0(dw_02);
                dt_03 = new dt_0(gf_0.e, 4, false, fWArray, l3);
                du_0.b("\u00f8", (Object)f, (Object)dw_02, (Object)dt_03, (long)-2631475690333455116L, (long)l);
            }
            dt_02 = dt_03;
        }
        return dt_02;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e9' || c == 'E' || c == '\u00fa' || c == '$') {
                field = du_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e9' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'E' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00fa' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = du_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f8' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = du_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/du" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n3] != null) {
            return n3;
        }
        Object object = du_0.l[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 9;
            case 1 -> 45;
            case 2 -> 51;
            case 3 -> 19;
            case 4 -> 46;
            case 5 -> 0;
            case 6 -> 37;
            case 7 -> 58;
            case 8 -> 54;
            case 9 -> 21;
            case 10 -> 55;
            case 11 -> 42;
            case 12 -> 27;
            case 13 -> 22;
            case 14 -> 12;
            case 15 -> 33;
            case 16 -> 34;
            case 17 -> 40;
            case 18 -> 38;
            case 19 -> 43;
            case 20 -> 53;
            case 21 -> 31;
            case 22 -> 39;
            case 23 -> 4;
            case 24 -> 13;
            case 25 -> 1;
            case 26 -> 23;
            case 27 -> 24;
            case 28 -> 36;
            case 29 -> 29;
            case 30 -> 41;
            case 31 -> 52;
            case 32 -> 47;
            case 33 -> 59;
            case 34 -> 49;
            case 35 -> 63;
            case 36 -> 16;
            case 37 -> 14;
            case 38 -> 62;
            case 39 -> 30;
            case 40 -> 28;
            case 41 -> 57;
            case 42 -> 15;
            case 43 -> 2;
            case 44 -> 32;
            case 45 -> 7;
            case 46 -> 17;
            case 47 -> 61;
            case 48 -> 11;
            case 49 -> 44;
            case 50 -> 10;
            case 51 -> 25;
            case 52 -> 6;
            case 53 -> 35;
            case 54 -> 20;
            case 55 -> 48;
            case 56 -> 56;
            case 57 -> 5;
            case 58 -> 8;
            case 59 -> 26;
            case 60 -> 18;
            case 61 -> 3;
            case 62 -> 60;
            default -> 50;
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
        du_0.m[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = l;
        l[0] = "LjuA6\u000bZjp\u001b%\u001cM!s\u001d)\b\\fd\nb\u001cJ";
        objectArray[1] = "yu90<W\fU2?-\u0018m[94)B\u0019";
        objectArray[2] = " :W>Xy>2Mq;m:";
        objectArray[3] = "$1Na\u0012^21K;\u0001I%zH=\r]4=_*FH\u0014";
        objectArray[4] = "%#\u0019oX9P\u0003\u0012`Iv1\r\u0019kM,E";
        objectArray[5] = Integer.TYPE;
        du_0.m[5] = "java/lang/Integer";
        objectArray[6] = "\u0010G~c\u0000=\u0006G{9\u0013*\u0011\fx?\u001f>\u0000Ko(T,<";
        objectArray[7] = "L{D\u0000$^9[O\u000f5\u0011DC\\\b<X,";
        objectArray[8] = "dg=\u000b'boh,DFldc(\u001e";
        objectArray[9] = "MB{OMg[B~\u0015^pL\t}\u0013Rd]Nj\u0004\u0019s\\";
        objectArray[10] = "v\u0000L\u001cc0}\u000f]S\u0000=h\u0002R85?y\u0011N\u0014\"2";
        objectArray[11] = "}\u0014p8l};\u0000m\"\f,AG~/s73\u0013/&`F";
        objectArray[12] = "qhld\">!i1\u00071\u0003%\"hg82$q*<X:z\"af33zp/\u0007";
        objectArray[13] = "B*\u007f~B\u000bK*-0#\u0018\u00062OrD\u0005\u0003v#r[\u0006\u001fNr(F\u0018C\"r7E\u0004{s(*[X\u0017s7)G`";
        objectArray[14] = "\u0011\u0015\u001d45\u0012L]\u00156R\u0007+\u001f]a2\u000b\u001a\u001e\u000e#ik\u0010Z\u000458\tP\u0014\t\"R";
        objectArray[15] = "mv\u001f,\u0011)dvMbp-9n/ \u0017',*C \b$0\u0012\u0012z\u0015:l~\u0012e\u0016&T";
        Object[] objectArray2 = objectArray;
        objectArray[16] = "R#Lg=\u0017\u00117OuP\u0018lz\u001ekn\u0011TuOniqS.\u001440I\\\u007f\u00113P";
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7DD7;
        if (j[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = i[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])k.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    k.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/du", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            du_0.j[n2] = n3;
        }
        return j[n2];
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
            return MethodHandles.lookup().findStatic(du_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(du_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


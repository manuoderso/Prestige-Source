/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1282
 *  net.minecraft.class_1297
 *  net.minecraft.class_1927
 *  net.minecraft.class_1927$class_4179
 *  net.minecraft.class_1937
 *  net.minecraft.class_243
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
import net.minecraft.class_1282;
import net.minecraft.class_1297;
import net.minecraft.class_1927;
import net.minecraft.class_1937;
import net.minecraft.class_243;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class G {
    private final class_1927 a;
    private static final long b;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final Object[] f;
    private static final String[] g;

    public G(class_1927 class_19272) {
        this.a = class_19272;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                G.b = hc.a(6706297564401998235L, -539965283059304021L, MethodHandles.lookup().lookupClass()).a(10440241609357L);
                G.f = new Object[50];
                G.g = new String[50];
                G.a();
                G.e = new HashMap<K, V>(13);
                var0 = G.b ^ 132742601947382L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[6];
                var7_4 = 0;
                var6_5 = "\u00998\u00e1\u00c2`\u0082'@\u000fS\u0015@\u000ep\u0016\u0088\u00109-z>\u0088\u00deL.\u001e\u001b\u00f8[F\u009ar\u00e1\u0018\u0094\u00e3\u00e9;\u000bd\u00bf\u00a8\u00be\u00da^\u00e0\u00cc\u00e7J\u00fe\u00ce\u00de\u008eQ\u008f\u00e1\u00e5Y k\f\u00d7\u0098\u00cd\u0095\fY\u000f\u00c0\u009a\u00d7iDc\t\u00c1\u00feS\u007fI\u009c\u00b4\u00be\u0081\u00ed\u0097\u0019\u00d1\u001f\u00aa@";
                var8_6 = "\u00998\u00e1\u00c2`\u0082'@\u000fS\u0015@\u000ep\u0016\u0088\u00109-z>\u0088\u00deL.\u001e\u001b\u00f8[F\u009ar\u00e1\u0018\u0094\u00e3\u00e9;\u000bd\u00bf\u00a8\u00be\u00da^\u00e0\u00cc\u00e7J\u00fe\u00ce\u00de\u008eQ\u008f\u00e1\u00e5Y k\f\u00d7\u0098\u00cd\u0095\fY\u000f\u00c0\u009a\u00d7iDc\t\u00c1\u00feS\u007fI\u009c\u00b4\u00be\u0081\u00ed\u0097\u0019\u00d1\u001f\u00aa@".length();
                var5_7 = 16;
                var4_8 = -1;
lbl32:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl37:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = G.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00e4\u0017\u0007bE\u00ab\u00b5_\u00b7\u00ae%\u00c6\u00a2\\\u001a$ \u00b9\u00cd\u00d0\u00b0\u00d2\u00b2\u00b9\u00f0g\u0010\u0017\u00c2&\u00d4=\u00be\u0094qA\u0085\u0083k\u00bdCz\u00f9;\u00ae\u0090\u0001\u00cex";
                    var8_6 = "\u00e4\u0017\u0007bE\u00ab\u00b5_\u00b7\u00ae%\u00c6\u00a2\\\u001a$ \u00b9\u00cd\u00d0\u00b0\u00d2\u00b2\u00b9\u00f0g\u0010\u0017\u00c2&\u00d4=\u00be\u0094qA\u0085\u0083k\u00bdCz\u00f9;\u00ae\u0090\u0001\u00cex".length();
                    var5_7 = 16;
                    var4_8 = -1;
lbl46:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl51:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = G.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        G.c = var9_3;
        G.d = new String[6];
    }

    public void e(Object[] objectArray) {
        double d = (Double)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x20CCA3FD5531L;
        long l4 = l2 ^ 0x17924E1A8135L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = G.b("\u00d0", (long)4150407065331695909L, (long)l);
        objectArray2[2] = class_1927.class;
        objectArray2[1] = "z";
        objectArray2[0] = this.a;
        CallSite callSite = G.b("\u00d3", (Object)objectArray2, (long)4150960288479926235L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = G.b("\u00d3", (double)d, (long)4151033609066388447L, (long)l);
        G.b("W", (Object)callSite, (Object)objectArray3, (long)4150611464613032407L, (long)l);
    }

    public void i(Object[] objectArray) {
        class_243 class_2432 = (class_243)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        boolean bl = (Boolean)objectArray[2];
        long l = (Long)objectArray[3];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x6D884E269E1AL;
        long l4 = l2 ^ 0x7DFA7722F651L;
        long l5 = l2 ^ 0x45DB79631ECAL;
        long l6 = l2 ^ 0x62CBED510B46L;
        long l7 = l2 ^ 0x4ECA8FF9A7ECL;
        long l8 = l2 ^ 0x432F3B5BFDEAL;
        long l9 = l2 ^ 0x3FA56D8B12B8L;
        long l10 = l2 ^ 0x74E21A45894L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l7;
        objectArray2[0] = G.b("b", (Object)G.b("\u00d3", (long)4798881842071431511L, (long)l), (long)4798961084203525520L, (long)l);
        G.b("W", (Object)this, (Object)objectArray2, (long)4798029299803230085L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = null;
        G.b("W", (Object)this, (Object)objectArray3, (long)4798427083134415495L, (long)l);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l6;
        objectArray4[0] = (double)G.b("b", (Object)class_2432, (long)4797894223269528931L, (long)l);
        G.b("W", (Object)this, (Object)objectArray4, (long)4797620319198120374L, (long)l);
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l4;
        objectArray5[0] = (double)G.b("b", (Object)class_2432, (long)4797995273728905697L, (long)l);
        G.b("W", (Object)this, (Object)objectArray5, (long)4797488647490284403L, (long)l);
        Object[] objectArray6 = new Object[2];
        objectArray6[1] = l10;
        objectArray6[0] = (double)G.b("b", (Object)class_2432, (long)4799091600194502264L, (long)l);
        G.b("W", (Object)this, (Object)objectArray6, (long)4798219979721709983L, (long)l);
        Object[] objectArray7 = new Object[2];
        objectArray7[1] = l9;
        objectArray7[0] = Float.valueOf(f);
        G.b("W", (Object)this, (Object)objectArray7, (long)4798152175418031302L, (long)l);
        Object[] objectArray8 = new Object[2];
        objectArray8[1] = l5;
        objectArray8[0] = bl;
        G.b("W", (Object)this, (Object)objectArray8, (long)4797564547710095541L, (long)l);
        Object[] objectArray9 = new Object[2];
        objectArray9[1] = l8;
        objectArray9[0] = G.b("\u00d0", (long)4796992581624038878L, (long)l);
        G.b("W", (Object)this, (Object)objectArray9, (long)4797671181517394095L, (long)l);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/G" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = G.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = G.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = G.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = G.b(classArray[i], string, clazz2);
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
            int n = G.a(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                G.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public void b(Object[] objectArray) {
        class_1297 class_12972 = (class_1297)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x4A0ACC7F93BFL;
        long l4 = l2 ^ 0x7D54219847BBL;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = class_1297.class;
        objectArray2[2] = class_1927.class;
        objectArray2[1] = G.a("a", (int)4571, (long)(0x526330D5113A825DL ^ l));
        objectArray2[0] = this.a;
        CallSite callSite = G.b("\u00d3", (Object)objectArray2, (long)-66068941551988395L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = class_12972;
        G.b("W", (Object)callSite, (Object)objectArray3, (long)-65436452264167591L, (long)l);
    }

    private static Field c(long l, long l2) {
        int n = G.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = G.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = G.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = G.a(clazz3, string2, clazz2)) != null) {
                    G.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = G.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        G.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = G.b(479330021029275L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public void c(Object[] objectArray) {
        double d = (Double)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x45496F0806E3L;
        long l4 = l2 ^ 0x721782EFD2E7L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = G.b("\u00d0", (long)7659304349971731191L, (long)l);
        objectArray2[2] = class_1927.class;
        objectArray2[1] = "x";
        objectArray2[0] = this.a;
        CallSite callSite = G.b("\u00d3", (Object)objectArray2, (long)7658733895448003593L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = G.b("\u00d3", (double)d, (long)7658664284102674445L, (long)l);
        G.b("W", (Object)callSite, (Object)objectArray3, (long)7659368041407914501L, (long)l);
    }

    public void h(Object[] objectArray) {
        class_1927.class_4179 class_41792 = (class_1927.class_4179)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x64ADB902F04FL;
        long l4 = l2 ^ 0x53F354E5244BL;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = class_1927.class_4179.class;
        objectArray2[2] = class_1927.class;
        objectArray2[1] = G.a("a", (int)16201, (long)(0x2ABFCBA4213CCF3AL ^ l));
        objectArray2[0] = this.a;
        CallSite callSite = G.b("\u00d3", (Object)objectArray2, (long)-7141187273551842651L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = class_41792;
        G.b("W", (Object)callSite, (Object)objectArray3, (long)-7140550376598285143L, (long)l);
    }

    public void f(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        long l = (Long)objectArray[1];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x1827EFD21F1DL;
        long l4 = l2 ^ 0x2F790235CB19L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = G.b("\u00d0", (long)8337567997267861284L, (long)l);
        objectArray2[2] = class_1927.class;
        objectArray2[1] = G.a("a", (int)24678, (long)(0x7133FCBE0A75FF43L ^ l));
        objectArray2[0] = this.a;
        CallSite callSite = G.b("\u00d3", (Object)objectArray2, (long)8338155813536669175L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = G.b("\u00d3", (float)f, (long)8339256196878449248L, (long)l);
        G.b("W", (Object)callSite, (Object)objectArray3, (long)8337807545863453691L, (long)l);
    }

    private static Method d(long l, long l2) {
        int n = G.a(l, l2);
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
                clazz3 = G.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = G.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = G.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        G.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = G.b(479330021029275L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = G.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        G.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = G.b(479330021029275L, 0L);
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

    public void d(Object[] objectArray) {
        double d = (Double)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x5A78F57BFBF4L;
        long l4 = l2 ^ 0x6D26189C2FF0L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = G.b("\u00d0", (long)-7540064229972725792L, (long)l);
        objectArray2[2] = class_1927.class;
        objectArray2[1] = "y";
        objectArray2[0] = this.a;
        CallSite callSite = G.b("\u00d3", (Object)objectArray2, (long)-7539493240842487522L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = G.b("\u00d3", (double)d, (long)-7539564917798816486L, (long)l);
        G.b("W", (Object)callSite, (Object)objectArray3, (long)-7539987202325160174L, (long)l);
    }

    public void a(Object[] objectArray) {
        class_1937 class_19372 = (class_1937)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x69480DA0AA49L;
        long l4 = l2 ^ 0x5E16E0477E4DL;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = class_1937.class;
        objectArray2[2] = class_1927.class;
        objectArray2[1] = G.a("a", (int)24205, (long)(0x51A721C54A9C74F9L ^ l));
        objectArray2[0] = this.a;
        CallSite callSite = G.b("\u00d3", (Object)objectArray2, (long)-4115333591376549725L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = class_19372;
        G.b("W", (Object)callSite, (Object)objectArray3, (long)-4115825350620901713L, (long)l);
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

    public class_1282 a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x7AFE28F33739L;
        long l4 = l2 ^ 0xF76E308DACFL;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = class_1282.class;
        objectArray2[2] = class_1927.class;
        objectArray2[1] = G.a("a", (int)20823, (long)(0x73A418ECD5A95FA6L ^ l));
        objectArray2[0] = this.a;
        CallSite callSite = G.b("\u00d3", (Object)objectArray2, (long)7089005043194203169L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        return (class_1282)G.b("W", (Object)callSite, (Object)objectArray3, (long)7092475438925382892L, (long)l);
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = G.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'b' || c == '\u00a4' || c == '\u00d0' || c == 'y') {
                field = G.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'b' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00a4' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = G.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'W' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
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
            case 0 -> 5;
            case 1 -> 0;
            case 2 -> 56;
            case 3 -> 35;
            case 4 -> 20;
            case 5 -> 57;
            case 6 -> 2;
            case 7 -> 43;
            case 8 -> 8;
            case 9 -> 41;
            case 10 -> 19;
            case 11 -> 10;
            case 12 -> 34;
            case 13 -> 52;
            case 14 -> 28;
            case 15 -> 9;
            case 16 -> 48;
            case 17 -> 49;
            case 18 -> 50;
            case 19 -> 36;
            case 20 -> 44;
            case 21 -> 4;
            case 22 -> 26;
            case 23 -> 42;
            case 24 -> 30;
            case 25 -> 7;
            case 26 -> 13;
            case 27 -> 45;
            case 28 -> 60;
            case 29 -> 58;
            case 30 -> 22;
            case 31 -> 23;
            case 32 -> 11;
            case 33 -> 40;
            case 34 -> 24;
            case 35 -> 32;
            case 36 -> 55;
            case 37 -> 12;
            case 38 -> 6;
            case 39 -> 14;
            case 40 -> 63;
            case 41 -> 38;
            case 42 -> 29;
            case 43 -> 46;
            case 44 -> 47;
            case 45 -> 18;
            case 46 -> 17;
            case 47 -> 1;
            case 48 -> 3;
            case 49 -> 53;
            case 50 -> 62;
            case 51 -> 25;
            case 52 -> 15;
            case 53 -> 51;
            case 54 -> 27;
            case 55 -> 59;
            case 56 -> 37;
            case 57 -> 33;
            case 58 -> 16;
            case 59 -> 31;
            case 60 -> 54;
            case 61 -> 21;
            case 62 -> 39;
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
        G.g[n3] = new String(cArray);
        return n3;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/G" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6C98;
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
                throw new RuntimeException("dev/zprestige/prestige/G", exception);
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
            G.d[n2] = G.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = G.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "\u001dV{5P6\u000bV~oC!\u001c\u001d}iO5\rZj~\u0004$(";
        objectArray[1] = "\\$F\u0016/.)\u0004M\u0019>aH\nF\u0012:;<";
        objectArray[2] = Void.TYPE;
        G.g[2] = "java/lang/Void";
        objectArray[3] = "'8JLDd18O\u0016Ws&sL\u0010[g74[\u0007\u0010w\u0015";
        objectArray[4] = "'kq\r5\u007fRKz\u0002$03Eq\t jG";
        objectArray[5] = ">Rb3%qKri<4>*|b70d^";
        objectArray[6] = "%\u001dx8\u0012\u0000.\u0012iws\u000e%\u0019m-";
        objectArray[7] = "\tO3pDK\u0002@\"?.H\u0016L)t";
        objectArray[8] = "\"0jJl\f)?{\u0005\u0001\f)\"o";
        objectArray[9] = Double.TYPE;
        G.g[9] = "java/lang/Double";
        objectArray[10] = "EeCu1\u000fNjR:Y\u000f@eA";
        objectArray[11] = Float.TYPE;
        G.g[11] = "java/lang/Float";
        objectArray[12] = "wnC\u0001%\f|aRNI\u000frcP\u0001e";
        objectArray[13] = Boolean.TYPE;
        G.g[13] = "java/lang/Boolean";
        objectArray[14] = "(<|\u001e\\-(<kBP\"2wk\\P75\u0006;\u0001\u0001";
        objectArray[15] = "\u007f>]\u000b\u000f\u0011\u007f>JW\u0003\u001eeuJI\u0003\u000bb\u0004\u001f\u0016Z";
        objectArray[16] = "4\u001ag\b\u0003z4\u001apT\u000fu.QpJ\u000f`) !\u0012]";
        objectArray[17] = "\u001e94\t\"\u0017\b91S1\u0000\u001fr2U=\u0014\u000e5%Bv ";
        objectArray[18] = "\n\u001d.-\nQ\u007f=%\"\u001b\u001e\u001e3.)\u001fDj";
        objectArray[19] = ">\u0003%r(VK#.}9\u0019*-%v=C^";
        objectArray[20] = "xnqLG\u0004\rNzCVKl@qHR\u0011\u0018";
        objectArray[21] = "xWh\"[Y\rwc-J\u0016lyh&NL\u0018";
        objectArray[22] = ">\\\u001aX\u000eOK|\u0011W\u001f\u0000*r\u001a\\\u001bZ^";
        objectArray[23] = "ij#\u0007\u007fO\u001cJ(\bn\u0000}D#\u0003jZ\t";
        objectArray[24] = "s\\$\nE=\u0006|/\u0005Trgr$\u000eP(\u0013";
        objectArray[25] = "\u0015:=R*|`\u001a6];3\u0001\u0014=V?iu";
        objectArray[26] = "[\u0018\u007f2\u0011\u0016[\u0018hn\u001d\u0019AShp\u001d\fF\":%NH\u0011\u001eg}\u000f\fjI:+E";
        objectArray[27] = "&N\">\u0011E)\u0019~\"h_p\u001bd?/O\u0019@|*\u0014\u001c'\u0015y9\u0017!&N\">\u0011E)\u0019~\"h";
        objectArray[28] = "MC\u001f:-4\u0005IMgF-\u0011NG<*\u001fE\u000f\u001abFy\r\nF0:1\u0007X\u001b[";
        objectArray[29] = "M%\u001c&$s\u0005/N{Oa\u001d9@+\u00186Bd\u001bG&~\u0003kB<)sCm";
        objectArray[30] = "_\u00175\u0000!B\u001a\u0017=p#s\u0002M/\u001c(NR\u001e<\u0010JO\u001aP=Nt\u0017^\u0017?p";
        objectArray[31] = "g\fADV\u001es\n\u001eC4Ol\u0001\u001b\u0013c\u00186QG\u007f\nFs\u0013\u0003\u0007]Pn\n";
        objectArray[32] = "6[}\u0003U\u0001/^`Bn\u0006]\u0004fW\u0002\r`T5D\u000eod\u0019u[\u0012\u0000b\t<On";
        objectArray[33] = "#1uRxA:4h\u0013CAHnn\u0006/Mu>=\u0015#/qs}\n?@wc4\u001eC";
        objectArray[34] = "Ll2~\u0018\u0010Ui/?#\u0013'3)*O\u001c\u001acz9C~\u001e.:&_\u0011\u0018>s2#";
        objectArray[35] = "\u0017TqWW\t\u0018\u0003-K.1y=\u0007;\u0013\u0013V\u0005{K@\u001fI\u0007";
        objectArray[36] = "\u001e\\#Y2}\u001c\fv]@Xrn\n?}z]VvO.vBT";
        objectArray[37] = "}Ars\u0003\u000fdDo28\u000b\u0016\u001ei'T\u0003+N:4Xa/\u0003z+D\u000e)\u00133?8";
        objectArray[38] = "nfpAe=$:\"FU\u0004\u000fX\u0001(h& `}X;*?b";
        objectArray[39] = "o`(\u001403*` d2\u00022:2\b9?bi!\u0004[;/)>\u00184=?`*d";
        objectArray[40] = "h14.s<q4)oH>\u0003n/z$0>>|i(R:s<v4=<cubH";
        objectArray[41] = "qY\u00138D\u0018h\\\u000ey\u007f\u0019\u001a\u0006\bl\u0013\u0014'V[\u007f\u001fv#\u001b\u001b`\u0003\u0019%\u000bRt\u007f";
        objectArray[42] = "$Z?\\d\u000f=_\"\u001d_\nO\u0005$\b3\u0003rUw\u001b?av\u00187\u0004#\u000ep\b~\u0010_";
        objectArray[43] = "K,y!]\u001dR)d`f\u0013 sbu\n\u0011\u001d#1f\u0006s\u0019nqy\u001a\u001c\u001f~8mf";
        objectArray[44] = "Dbt@#.\u001e{x\u000e[ ~zg\u00167(C*4\u0005;JC\"u\f0{\u0006\"}|";
        objectArray[45] = "O\u001bW?WIMK\u0002;%N\u001b\u0015N4b^rOT'ZL\n\u0018B:C0O\u001bW?WIMK\u0002;%";
        objectArray[46] = "s\u0007?/\u0014[g\u0001`(v\nx\nex!]\"Z;\u0014H\u0003g\u0018}l\u001f\u0015z\u0001";
        objectArray[47] = "\u0011$8\u001a\u0019{\u0005\"g\u001d{*\u001a)bM,}@y?!E#\u0005;zY\u00125\u0018\"";
        objectArray[48] = "(\u0017np=3bK<w\r(q\u0015/tJ8\u0018@9r6)\u007fMjv5V(\u0017np=3bK<w\r";
        Object[] objectArray2 = objectArray;
        objectArray[49] = "t<\u000fj3\n,j\u0016h\u000f_t8\u000fxX\b%k[+\u000fP|1\u0015(4\b*(\u0017";
    }

    public void g(Object[] objectArray) {
        boolean bl = (Boolean)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x6259FB3A136FL;
        long l4 = l2 ^ 0x550716DDC76BL;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = G.b("\u00d0", (long)9207585484307237039L, (long)l);
        objectArray2[2] = class_1927.class;
        objectArray2[1] = G.a("a", (int)12247, (long)(0x708152CD9C2BC83L ^ l));
        objectArray2[0] = this.a;
        CallSite callSite = G.b("\u00d3", (Object)objectArray2, (long)9206887019951559045L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = G.b("\u00d3", (boolean)bl, (long)9206010339129621165L, (long)l);
        G.b("W", (Object)callSite, (Object)objectArray3, (long)9207518966890313609L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(G.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(G.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


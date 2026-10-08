/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package dev.zprestige.prestige;

import com.google.gson.JsonObject;
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
 * Duplicate member names - consider using --renamedupmembers true
 */
public class cE {
    private int a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private static final long k;
    private static final String[] l;
    private static final String[] m;
    private static final Map n;
    private static final Object[] o;
    private static final String[] p;

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                cE.k = hc.a(7828144851619204080L, 4500058276873306112L, MethodHandles.lookup().lookupClass()).a(242013506759706L);
                cE.o = new Object[18];
                cE.p = new String[18];
                cE.a();
                cE.n = new HashMap<K, V>(13);
                var0 = cE.k ^ 71163208001567L;
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
                var9_3 = new String[14];
                var7_4 = 0;
                var6_5 = "\u00c0\u009c\u0095\u00fd\u0005_&\u00f0Pu;|c\u00b5\u0005b\u0010p\u00a79h\u0081\u009d\u00ebA\u00af\u00a4\u00a2\u00f3\u00de\u00d0\u00e3\u008c\u0010\u000b;\u00c8\u00ff\u00e2k\u0086!AY>lfj\u00ba\u00df \u001bk\u00dcN\u00e2A\u00c64=\u000e\u00d8+\u00cd\u00b0e~\u00fc\u0014\u0089[E\u0098H\u001e\u0007\u00ddKq\u00fb\u000e\u00fc\u0018 \u00bc\u00b5\u00e1\u00d3\u0007p\u0080%}\u0083o\u0095\u00ce(<\u0083\u00a0\u00ece\u00e8\u00e2e1\u001f\u0096,`\u009es\u00aa \u00e8\u0010\u00d7p\u00ca|r\u00e24\u00992\u0089\\\u0014|\u00b1$M \u0094\u00eb\u00b6u\u009d\u00d3\u00ce8B,\u000f\u00c3\u00f0\u00c4\u008c\u00c6\u008b\b\u00f8\u00a9\u009d\u00b4\u00c6\u0003\u0095\t\u00f1\u009c\u0083\u00c5)\u00b4\u0010jP\u00d3\u0019\u0099C[\u008c\u0091J\u00b0\u00c2\u008d\u00cc\u0097o\u0010\u00f4]\u00a0*\u0096e\u0094\u0094\u0012O\u009b=\u00fd(\u00cb\u001e\u0010\u00d5QN\u0015R\u0006\u00f7m\u00b1AL\u00dd\u00c1\u0019\f\u00f1\u00107\b{\u008cp\r\u00fa\u00f9I\u00e4sW\u00e1N&r\u0010\u008f\u0001\u00996\u00be\u0013\u0015\u0010\u00b3#\u0089(\u00cc5N\u00d3";
                var8_6 = "\u00c0\u009c\u0095\u00fd\u0005_&\u00f0Pu;|c\u00b5\u0005b\u0010p\u00a79h\u0081\u009d\u00ebA\u00af\u00a4\u00a2\u00f3\u00de\u00d0\u00e3\u008c\u0010\u000b;\u00c8\u00ff\u00e2k\u0086!AY>lfj\u00ba\u00df \u001bk\u00dcN\u00e2A\u00c64=\u000e\u00d8+\u00cd\u00b0e~\u00fc\u0014\u0089[E\u0098H\u001e\u0007\u00ddKq\u00fb\u000e\u00fc\u0018 \u00bc\u00b5\u00e1\u00d3\u0007p\u0080%}\u0083o\u0095\u00ce(<\u0083\u00a0\u00ece\u00e8\u00e2e1\u001f\u0096,`\u009es\u00aa \u00e8\u0010\u00d7p\u00ca|r\u00e24\u00992\u0089\\\u0014|\u00b1$M \u0094\u00eb\u00b6u\u009d\u00d3\u00ce8B,\u000f\u00c3\u00f0\u00c4\u008c\u00c6\u008b\b\u00f8\u00a9\u009d\u00b4\u00c6\u0003\u0095\t\u00f1\u009c\u0083\u00c5)\u00b4\u0010jP\u00d3\u0019\u0099C[\u008c\u0091J\u00b0\u00c2\u008d\u00cc\u0097o\u0010\u00f4]\u00a0*\u0096e\u0094\u0094\u0012O\u009b=\u00fd(\u00cb\u001e\u0010\u00d5QN\u0015R\u0006\u00f7m\u00b1AL\u00dd\u00c1\u0019\f\u00f1\u00107\b{\u008cp\r\u00fa\u00f9I\u00e4sW\u00e1N&r\u0010\u008f\u0001\u00996\u00be\u0013\u0015\u0010\u00b3#\u0089(\u00cc5N\u00d3".length();
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
                    var9_3[var7_4++] = cE.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = ";\u0002 \u0083jD\u00cd\b\u00ed\r\u00bc\u00eb\u00d9\u00c0\n\u0099 \u00f4\u00c7\u00b6\u0001s\u00feU\\\u00ebd\u008c\u001c\u00ca5;\u0006%\u0010m\u00c1\u00baL\u0080Q\u00df\u00d62\u00c4\u00c5i\u00fel";
                    var8_6 = ";\u0002 \u0083jD\u00cd\b\u00ed\r\u00bc\u00eb\u00d9\u00c0\n\u0099 \u00f4\u00c7\u00b6\u0001s\u00feU\\\u00ebd\u008c\u001c\u00ca5;\u0006%\u0010m\u00c1\u00baL\u0080Q\u00df\u00d62\u00c4\u00c5i\u00fel".length();
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
                    var9_3[var7_4++] = cE.a(var10_9).intern();
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
        cE.l = var9_3;
        cE.m = new String[14];
    }

    public float e(Object[] objectArray) {
        return this.f;
    }

    public float i(Object[] objectArray) {
        return this.j;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cE" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = cE.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = cE.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = cE.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = cE.b(classArray[i], string, clazz2);
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
            int n = cE.a(l, l2);
            object = o[n];
            try {
                if (!(object instanceof String)) break block2;
                cE.o[n] = clazz = Class.forName(p[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public float b(Object[] objectArray) {
        return this.c;
    }

    public float c(Object[] objectArray) {
        return this.d;
    }

    private static Field c(long l, long l2) {
        int n = cE.a(l, l2);
        Object object = o[n];
        if (object instanceof String) {
            String string = p[n];
            int n2 = string.indexOf(8);
            Class clazz = cE.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = cE.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = cE.a(clazz3, string2, clazz2)) != null) {
                    cE.o[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = cE.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        cE.o[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = cE.b(715662885338752L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public float h(Object[] objectArray) {
        return this.i;
    }

    public float f(Object[] objectArray) {
        return this.g;
    }

    public float d(Object[] objectArray) {
        return this.e;
    }

    private static Method d(long l, long l2) {
        int n = cE.a(l, l2);
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
                clazz3 = cE.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = cE.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = cE.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        cE.o[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = cE.b(715662885338752L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = cE.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        cE.o[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = cE.b(715662885338752L, 0L);
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4260;
        if (m[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])cE.n.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    cE.n.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/cE", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = cE.l[n2].getBytes("ISO-8859-1");
            cE.m[n2] = cE.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return m[n2];
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public int a(Object[] objectArray) {
        return this.a;
    }

    public static cE a(Object[] objectArray) {
        cE cE2;
        block9: {
            CallSite callSite;
            JsonObject jsonObject;
            CallSite callSite2;
            long l;
            block8: {
                CallSite callSite3;
                JsonObject jsonObject2;
                block6: {
                    CallSite callSite4;
                    block7: {
                        jsonObject2 = (JsonObject)objectArray[0];
                        l = (Long)objectArray[1];
                        l = k ^ l;
                        cE2 = new cE();
                        callSite4 = cE.b("\u00cd", (long)2917633921853206335L, (long)l);
                        try {
                            cE2.a = (int)cE.b("\u00c8", (Object)cE.b("\u00c8", (Object)jsonObject2, (Object)cE.a("q", (int)29082, (long)(0x16575482C811B80L ^ l)), (long)2917231346025265514L, (long)l), (long)2917449155320177100L, (long)l);
                            cE2.b = (float)cE.b("\u00c8", (Object)cE.b("\u00c8", (Object)jsonObject2, (Object)cE.a("q", (int)7525, (long)(0x13454922F2937773L ^ l)), (long)2917231346025265514L, (long)l), (long)2917395003014359951L, (long)l);
                            callSite3 = cE.b("\u00c8", (Object)jsonObject2, (Object)cE.a("q", (int)22438, (long)(0x7C8CF86319623DB4L ^ l)), (long)2917032030969262277L, (long)l);
                            if (callSite4 != null) break block6;
                            if (callSite3 == false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw cE.b("\u00cd", (Object)matchException, (long)2917289429817914306L, (long)l);
                        }
                        callSite2 = cE.b("\u00c8", (Object)cE.b("\u00c8", (Object)jsonObject2, (Object)cE.a("q", (int)17729, (long)(0x7E1241A92CECAF5AL ^ l)), (long)2917231346025265514L, (long)l), (long)2916986711953100441L, (long)l);
                        cE2.c = (float)cE.b("\u00c8", (Object)cE.b("\u00c8", (Object)callSite2, (Object)cE.a("q", (int)24842, (long)(0x57CC7941285C8B1FL ^ l)), (long)2917231346025265514L, (long)l), (long)2917395003014359951L, (long)l);
                        cE2.d = (float)cE.b("\u00c8", (Object)cE.b("\u00c8", (Object)callSite2, (Object)cE.a("q", (int)16491, (long)(0x6955E026D3DA2A75L ^ l)), (long)2917231346025265514L, (long)l), (long)2917395003014359951L, (long)l);
                        cE2.e = (float)cE.b("\u00c8", (Object)cE.b("\u00c8", (Object)callSite2, (Object)cE.a("q", (int)12737, (long)(0xC4F345932CCDBD5L ^ l)), (long)2917231346025265514L, (long)l), (long)2917395003014359951L, (long)l);
                        cE2.f = (float)cE.b("\u00c8", (Object)cE.b("\u00c8", (Object)callSite2, (Object)cE.a("q", (int)4844, (long)(0x1E6B29EB8E69F8F3L ^ l)), (long)2917231346025265514L, (long)l), (long)2917395003014359951L, (long)l);
                    }
                    try {
                        jsonObject = jsonObject2;
                        callSite = cE.a("q", (int)30912, (long)(0x7497BBBE48192D9L ^ l));
                        if (callSite4 != null) break block8;
                        callSite3 = cE.b("\u00c8", (Object)jsonObject, (Object)callSite, (long)2917032030969262277L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw cE.b("\u00cd", (Object)matchException, (long)2917289429817914306L, (long)l);
                    }
                }
                try {
                    if (callSite3 == false) break block9;
                    jsonObject = jsonObject2;
                    callSite = cE.a("q", (int)30701, (long)(0x87B11C893159DF1L ^ l));
                }
                catch (MatchException matchException) {
                    throw cE.b("\u00cd", (Object)matchException, (long)2917289429817914306L, (long)l);
                }
            }
            callSite2 = cE.b("\u00c8", (Object)cE.b("\u00c8", (Object)jsonObject, (Object)callSite, (long)2917231346025265514L, (long)l), (long)2916986711953100441L, (long)l);
            cE2.g = (float)cE.b("\u00c8", (Object)cE.b("\u00c8", (Object)callSite2, (Object)cE.a("q", (int)14535, (long)(0xCA72F7291A4D2D4L ^ l)), (long)2917231346025265514L, (long)l), (long)2917395003014359951L, (long)l);
            cE2.h = (float)cE.b("\u00c8", (Object)cE.b("\u00c8", (Object)callSite2, (Object)cE.a("q", (int)6795, (long)(0x33F66A159D07F096L ^ l)), (long)2917231346025265514L, (long)l), (long)2917395003014359951L, (long)l);
            cE2.i = (float)cE.b("\u00c8", (Object)cE.b("\u00c8", (Object)callSite2, (Object)cE.a("q", (int)27002, (long)(0x6F9832FAEF87836DL ^ l)), (long)2917231346025265514L, (long)l), (long)2917395003014359951L, (long)l);
            cE2.j = (float)cE.b("\u00c8", (Object)cE.b("\u00c8", (Object)callSite2, (Object)cE.a("q", (int)17985, (long)(0x78E639DE6E6D2C59L ^ l)), (long)2917231346025265514L, (long)l), (long)2917395003014359951L, (long)l);
        }
        return cE2;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ce' || c == '\u00cf' || c == '\u00ba' || c == 'r') {
                field = cE.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ce' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00cf' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ba' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = cE.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c8' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00cd' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = cE.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cE" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = cE.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
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

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    public float a(Object[] objectArray) {
        return this.b;
    }

    private static void a() {
        Object[] objectArray = o;
        o[0] = "\u0006\u0010^!gB\u0010\u0010[{tU\u0007[X}xA\u0016\u001cOj3S*";
        objectArray[1] = "8Q!sf2Mq*|w}0i9{~4X";
        objectArray[2] = ">_@,A\u001d2WAg\b\u0015._C,l\u00012^hnC\u001f8^Y";
        objectArray[3] = Integer.TYPE;
        cE.p[3] = "java/lang/Integer";
        objectArray[4] = Float.TYPE;
        cE.p[4] = "java/lang/Float";
        objectArray[5] = "28j;\u0002!>0kpK)\"8i;/=>9Hw\u000f+2#";
        objectArray[6] = "FJ\u001f\u000fJKME\u000e@7S^B\u0007\t";
        objectArray[7] = Boolean.TYPE;
        cE.p[7] = "java/lang/Boolean";
        objectArray[8] = "\tSd\u0011)\u000e\u001fSaK:\u0019\b\u0018bM6\r\u0019_uZ}\u001d(";
        objectArray[9] = "\u00172}z>]\u001c=l5]P\t0c^hR\u0018#\u007fr\u007f_";
        objectArray[10] = "3 \u000bXT\u00118/\u001a\u00175\u001f3$\u001eM";
        objectArray[11] = "#(D6Ya0 VL\u0002\u001att\u001d5\u0001kp=\u00112h";
        objectArray[12] = "j K>|rk}C$\u0005rW{Dgbf+;D>g\u001bi+\u00128xg)+K=\u0005";
        objectArray[13] = ".KB\\ unEW\u000b\u0018dxT3\u000bw7oV\u000bUqul(\nL&5\u007f\u0019JW'w\u0015";
        objectArray[14] = "\\7m|r\t\u001c,l>\u0018W\b0\u001a9Y^\u0019Liyf\u0003\u0000v:)|Ue";
        objectArray[15] = "UW\u0005L\u0001u\u0015L\u0004\u000ek+\u0001Pr\t% \u000bEGrP-\bCZ\n\u000f)\u0005W;";
        objectArray[16] = "\u0016Rl#\"mV\\yt\u001asDJ\u001dtu/WO%*smT1 (cpFXlxwk-";
        Object[] objectArray2 = objectArray;
        objectArray[17] = ":0W\r[kz+VO15n7 Hs!d-.YS7h7i\bR+hs\u0017H\\>?K";
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
            case 0 -> 21;
            case 1 -> 6;
            case 2 -> 63;
            case 3 -> 44;
            case 4 -> 14;
            case 5 -> 48;
            case 6 -> 61;
            case 7 -> 42;
            case 8 -> 52;
            case 9 -> 51;
            case 10 -> 30;
            case 11 -> 34;
            case 12 -> 17;
            case 13 -> 31;
            case 14 -> 32;
            case 15 -> 15;
            case 16 -> 18;
            case 17 -> 49;
            case 18 -> 10;
            case 19 -> 35;
            case 20 -> 26;
            case 21 -> 50;
            case 22 -> 40;
            case 23 -> 60;
            case 24 -> 20;
            case 25 -> 11;
            case 26 -> 4;
            case 27 -> 0;
            case 28 -> 37;
            case 29 -> 43;
            case 30 -> 8;
            case 31 -> 41;
            case 32 -> 53;
            case 33 -> 12;
            case 34 -> 3;
            case 35 -> 9;
            case 36 -> 25;
            case 37 -> 38;
            case 38 -> 47;
            case 39 -> 62;
            case 40 -> 7;
            case 41 -> 55;
            case 42 -> 5;
            case 43 -> 39;
            case 44 -> 59;
            case 45 -> 24;
            case 46 -> 27;
            case 47 -> 45;
            case 48 -> 22;
            case 49 -> 13;
            case 50 -> 28;
            case 51 -> 56;
            case 52 -> 46;
            case 53 -> 58;
            case 54 -> 29;
            case 55 -> 16;
            case 56 -> 23;
            case 57 -> 33;
            case 58 -> 2;
            case 59 -> 54;
            case 60 -> 19;
            case 61 -> 1;
            case 62 -> 57;
            default -> 36;
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
        cE.p[n3] = new String(cArray);
        return n3;
    }

    public float g(Object[] objectArray) {
        return this.h;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(cE.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(cE.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


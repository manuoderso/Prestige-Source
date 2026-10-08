/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  net.minecraft.class_276
 *  net.minecraft.class_4599
 *  net.minecraft.class_761
 *  net.minecraft.class_9960
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.hc;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
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
import net.minecraft.class_276;
import net.minecraft.class_4599;
import net.minecraft.class_761;
import net.minecraft.class_9960;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.af
 */
public class af_0 {
    private final class_761 a;
    private static final long b;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final Object[] f;
    private static final String[] g;

    public af_0(class_761 class_7612) {
        this.a = class_7612;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                af_0.b = hc.a(-3534945598792526850L, -7304456464758917350L, MethodHandles.lookup().lookupClass()).a(201115449394108L);
                af_0.f = new Object[7];
                af_0.g = new String[7];
                af_0.a();
                af_0.e = new HashMap<K, V>(13);
                var0 = af_0.b ^ 27609633641048L;
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
                var9_3 = new String[4];
                var7_4 = 0;
                var6_5 = "\u00fc\u00eeb\u0082\u00ac\u00a6\u00d4\u00e0p\u00a1\u00e5\u00c0\u0017\u00d0\u0090\u00f6\u00f2\u00f3Q\u00f6t\u008b\"W |\u00f6\n\u00f0h\u00c0|8U\u00d8\u0099\u00a8jh\u00aaW\u00ed\u0003\u00d2\u00fa\ru\u00a1\u0016Kw\u00b4;\u007f\u00c8G\u0081\u00f9\u0089\u00c1\u00e0\u001bU6jA\u00ba\u00a8}\u001e\u0017\u00dc&_\u00f6'_\u00b9\u009bu\u0097:0\u009d\u00a7\u00ad\u0012;\u00cc";
                var8_6 = "\u00fc\u00eeb\u0082\u00ac\u00a6\u00d4\u00e0p\u00a1\u00e5\u00c0\u0017\u00d0\u0090\u00f6\u00f2\u00f3Q\u00f6t\u008b\"W |\u00f6\n\u00f0h\u00c0|8U\u00d8\u0099\u00a8jh\u00aaW\u00ed\u0003\u00d2\u00fa\ru\u00a1\u0016Kw\u00b4;\u007f\u00c8G\u0081\u00f9\u0089\u00c1\u00e0\u001bU6jA\u00ba\u00a8}\u001e\u0017\u00dc&_\u00f6'_\u00b9\u009bu\u0097:0\u009d\u00a7\u00ad\u0012;\u00cc".length();
                var5_7 = 32;
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
                    var9_3[var7_4++] = af_0.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00d3_\u00f4\u00e9\u00f4f\u00fe\u0092\u00cb\u00c9\u00f83\u009c5^\u00c6V\u00da\u00a0\u00bd\u008c\u00bc\u00ce:\u00b9\u0081o^\u00bf\u00cc>\r\u00a0\u00ae\u00cb\u00a8m\u00c3\u0015\u00e4 \u00c0Y\u00d9\u00ab\u00f7\u001c\u00e8.\u008a\u009f\u00a6\u00fd\u00ed\u00fe\u00f7\u00e2\u000e\u001eMx~\u00ee\u00e2\u00a0a\u00dc=\u00e1\u00e7\u008f\u008b ";
                    var8_6 = "\u00d3_\u00f4\u00e9\u00f4f\u00fe\u0092\u00cb\u00c9\u00f83\u009c5^\u00c6V\u00da\u00a0\u00bd\u008c\u00bc\u00ce:\u00b9\u0081o^\u00bf\u00cc>\r\u00a0\u00ae\u00cb\u00a8m\u00c3\u0015\u00e4 \u00c0Y\u00d9\u00ab\u00f7\u001c\u00e8.\u008a\u009f\u00a6\u00fd\u00ed\u00fe\u00f7\u00e2\u000e\u001eMx~\u00ee\u00e2\u00a0a\u00dc=\u00e1\u00e7\u008f\u008b ".length();
                    var5_7 = 40;
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
                    var9_3[var7_4++] = af_0.a(var10_9).intern();
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
        af_0.c = var9_3;
        af_0.d = new String[4];
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = af_0.a(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                af_0.f[n] = clazz = Class.forName(g[n]);
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
            throw new RuntimeException("dev/zprestige/prestige/af" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = af_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = af_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = af_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = af_0.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = af_0.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = af_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = af_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = af_0.a(clazz3, string2, clazz2)) != null) {
                    af_0.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = af_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        af_0.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = af_0.b(168380810480742L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = af_0.a(l, l2);
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
                clazz3 = af_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = af_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = af_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        af_0.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = af_0.b(168380810480742L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = af_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        af_0.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = af_0.b(168380810480742L, 0L);
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

    public Int2ObjectMap a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x76051D7BF024L;
        long l4 = l2 ^ 0x38DD6801DD2L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = Int2ObjectMap.class;
        objectArray2[2] = class_761.class;
        objectArray2[1] = af_0.a("w", (int)25799, (long)(0x7729934649475CDFL ^ l));
        objectArray2[0] = this.a;
        CallSite callSite = af_0.b("\u00ce", (Object)objectArray2, (long)-6523852690548835202L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        return (Int2ObjectMap)af_0.b("Z", (Object)callSite, (Object)objectArray3, (long)-6523922880903168174L, (long)l);
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

    public class_4599 a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x56ED304B06CFL;
        long l4 = l2 ^ 0x2365FBB0EB39L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = class_4599.class;
        objectArray2[2] = class_761.class;
        objectArray2[1] = af_0.a("w", (int)15875, (long)(0x44476F5F394770F2L ^ l));
        objectArray2[0] = this.a;
        CallSite callSite = af_0.b("\u00ce", (Object)objectArray2, (long)6025181208263838357L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        return (class_4599)af_0.b("Z", (Object)callSite, (Object)objectArray3, (long)6025110811444890041L, (long)l);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00fa' || c == 'u' || c == '\u00d5' || c == 'O') {
                field = af_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00fa' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'u' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = af_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'Z' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ce' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = af_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "o\u001d@8Yuy\u001dEbJbnVFdFv\u007f\u0011Qs\rgZ";
        objectArray[1] = "Oca'\fx:Cj(\u001d7[Ma#\u0019m/";
        objectArray[2] = "sY^k#7xVO$B9s]K~";
        objectArray[3] = "zclO\u0007/lci\u0015\u00148{(j\u0013\u0018,jo}\u0004S<H";
        objectArray[4] = "F,R@Au3\fYOP:R\u0002RDT`&";
        objectArray[5] = "@\r\u007fT6\u0011\u000b\u0018{k`zA\u0018rW7\u0005\u0015\b \u001a\tC\u001d\u0004`QsA\u001b_&k";
        Object[] objectArray2 = objectArray;
        objectArray[6] = "$\t\u0019\u0002A\u001br\u001aM\u0001/\u001c\u001eY\u000e\u0015\u0013Ha\r\u001eG^v%\r\u0012@\u0010\u001dn\u0018\u0016\u007f";
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/af" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = af_0.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1D6D;
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
                throw new RuntimeException("dev/zprestige/prestige/af", exception);
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
            af_0.d[n2] = af_0.a(((Cipher)objectArray[0]).doFinal(byArray2));
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

    public class_9960 a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x7468A4A1183DL;
        long l4 = l2 ^ 0x1E06F5AF5CBL;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = class_9960.class;
        objectArray2[2] = class_761.class;
        objectArray2[1] = af_0.a("w", (int)27481, (long)(0xE19E28D98C33B59L ^ l));
        objectArray2[0] = this.a;
        CallSite callSite = af_0.b("\u00ce", (Object)objectArray2, (long)5579850980579005543L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        return (class_9960)af_0.b("Z", (Object)callSite, (Object)objectArray3, (long)5579780553707870027L, (long)l);
    }

    public class_276 a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0xD426219F382L;
        long l4 = l2 ^ 0x78CAA9E21E74L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = class_276.class;
        objectArray2[2] = class_761.class;
        objectArray2[1] = af_0.a("w", (int)13823, (long)(0x19658501180D0E42L ^ l));
        objectArray2[0] = this.a;
        CallSite callSite = af_0.b("\u00ce", (Object)objectArray2, (long)-6426383997282140200L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        return (class_276)af_0.b("Z", (Object)callSite, (Object)objectArray3, (long)-6426594942602494732L, (long)l);
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
            case 0 -> 14;
            case 1 -> 38;
            case 2 -> 15;
            case 3 -> 12;
            case 4 -> 20;
            case 5 -> 34;
            case 6 -> 48;
            case 7 -> 52;
            case 8 -> 43;
            case 9 -> 7;
            case 10 -> 44;
            case 11 -> 26;
            case 12 -> 63;
            case 13 -> 54;
            case 14 -> 31;
            case 15 -> 10;
            case 16 -> 46;
            case 17 -> 39;
            case 18 -> 50;
            case 19 -> 56;
            case 20 -> 55;
            case 21 -> 58;
            case 22 -> 51;
            case 23 -> 23;
            case 24 -> 62;
            case 25 -> 22;
            case 26 -> 53;
            case 27 -> 30;
            case 28 -> 47;
            case 29 -> 1;
            case 30 -> 33;
            case 31 -> 21;
            case 32 -> 5;
            case 33 -> 36;
            case 34 -> 59;
            case 35 -> 0;
            case 36 -> 49;
            case 37 -> 17;
            case 38 -> 11;
            case 39 -> 28;
            case 40 -> 41;
            case 41 -> 45;
            case 42 -> 3;
            case 43 -> 9;
            case 44 -> 61;
            case 45 -> 6;
            case 46 -> 8;
            case 47 -> 19;
            case 48 -> 37;
            case 49 -> 13;
            case 50 -> 35;
            case 51 -> 2;
            case 52 -> 42;
            case 53 -> 32;
            case 54 -> 57;
            case 55 -> 24;
            case 56 -> 29;
            case 57 -> 40;
            case 58 -> 60;
            case 59 -> 16;
            case 60 -> 4;
            case 61 -> 18;
            case 62 -> 25;
            default -> 27;
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
        af_0.g[n3] = new String(cArray);
        return n3;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(af_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(af_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


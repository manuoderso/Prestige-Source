/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.cG;
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
public interface cF {
    public static final long j = hc.a(4845857432343417916L, -6209324375415619618L, MethodHandles.lookup().lookupClass()).a(245427165095559L);
    public static final String k;
    public static final long[] l;
    public static final Integer[] m;
    public static final Map n;
    public static final Object[] u;
    public static final String[] v;

    /*
     * Enabled aggressive block sorting
     */
    static {
        u = new Object[20];
        v = new String[20];
        cF.a();
        long l = j ^ 0x70BBFEE60B23L;
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
        byte[] byArray3 = cipher.doFinal("<\u00a5LX\u00e6\u009cW\t\u0099?\u00ba\u00ee*\u00d1Z\u00dd1\u00f6\u00e2\u0017W\u0087?\u00b2\u00dfO\u00b7\u00dfe\u008f\u008air\u00fa\u0006&Srb\u00ba@$\u00e6\u00f8n\u00ba*\\\u00bb\u008f\u00e1\u00d70\u00c6qI\u00a2\u00c7\u00cf\u00d8\u00d2\u00fe\u00ed\u00b7\u000fN\u00c6/\u00b6\u00f9\u00ebJ.7\u00f3\u0012\b\u00e3\u008bG\u009b\u001a\u008f\u00e2\u00da9\u00e6\u00bb\u00fa\u00a3K\u00c9}\u00c9t0\u00ae\u00a9\u00ff\u00cb\u00c3\u00fc\u00dfn\u00fc\u00a5\u00d9\u009fy_\u001evL\u00e8\u00e7.\u00d8\u00eaN\u00fc|\u00cf\u00cc\u00ab<}\u00feE".getBytes("ISO-8859-1"));
        k = cF.a(byArray3).intern();
        n = new HashMap(13);
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
        int n = 0;
        String string = "\u009f\u00faC\u001b\u00f8\u00a8\u00cd\u001f6-\u000f\u00b5\u0083J\u00e5\u00d1";
        int n2 = "\u009f\u00faC\u001b\u00f8\u00a8\u00cd\u001f6-\u000f\u00b5\u0083J\u00e5\u00d1".length();
        int n3 = 0;
        do {
            byte[] byArray6 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
            byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
        } while (n3 < n2);
        cF.l = lArray;
        m = new Integer[2];
        if (cG.a) {
            // empty if block
        }
    }

    public cF e(Object[] var1);

    /*
     * Exception decompiling
     */
    default public cF i(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[TRYBLOCK]], but top level block is 9[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = cF.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = cF.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = cF.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = cF.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public int b(Object[] var1);

    public cF b(Object[] var1);

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = cF.a(l, l2);
            object = u[n];
            try {
                if (!(object instanceof String)) break block2;
                cF.u[n] = clazz = Class.forName(v[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public void b(Object[] var1);

    public int c(Object[] var1);

    private static Field c(long l, long l2) {
        int n = cF.a(l, l2);
        Object object = u[n];
        if (object instanceof String) {
            String string = v[n];
            int n2 = string.indexOf(8);
            Class clazz = cF.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = cF.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = cF.a(clazz3, string2, clazz2)) != null) {
                    cF.u[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = cF.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        cF.u[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = cF.b(801624889018365L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public cF c(Object[] var1);

    public cF h(Object[] var1);

    public cF f(Object[] var1);

    private static Method d(long l, long l2) {
        int n = cF.a(l, l2);
        Object object = u[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = v[n];
                int n3 = string2.indexOf(8);
                clazz3 = cF.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = cF.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = cF.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        cF.u[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = cF.b(801624889018365L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = cF.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        cF.u[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = cF.b(801624889018365L, 0L);
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

    public cF d(Object[] var1);

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cF" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public cF a(Object[] var1);

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = u;
        u[0] = "{5;\u00118qm5>K+fz~=M'rk9*ZlbY";
        objectArray[1] = "s?\u0015MqL\u0006\u001f\u001eB`\u0003g\u0011\u0015IdY\u0013";
        objectArray[2] = Void.TYPE;
        cF.v[2] = "java/lang/Void";
        objectArray[3] = "<\u000e\u000fR\u001eeI.\u0004]\u000f*( \u000fV\u000bp\\";
        objectArray[4] = Integer.TYPE;
        cF.v[4] = "java/lang/Integer";
        objectArray[5] = "\u0000eMZz8uEFUkw\u0014KM^o-`";
        objectArray[6] = "\u000bqpo~?~Q{`op\u001f_pkk*k";
        objectArray[7] = "9Un-\u0016H/Ukw\u0005_8\u001ehq\tK)Y\u007ffBU";
        objectArray[8] = "X:L#\u00024-\u001aG,\u0013{L\u0014L'\u0017!8";
        objectArray[9] = "\\\u0014\u001a8<\u0018W\u001b\u000bw_\u0015B\u0016\u0004\u001cj\u0017S\u0005\u00180}\u001a";
        objectArray[10] = "\u000e\t97\u0010@{)28\u0001\u000f\u001a'93\u0005Un";
        objectArray[11] = "\u0004\u0018t.u%\u000f\u0017ea\u0014+\u0004\u001ca;";
        objectArray[12] = "e_\u0013\u000er\b!\u0018Zct2f\\B\u000e\u007fOg\u0007_\u001a\u001f\b$\tJ_/\f9\fRc";
        objectArray[13] = "d!\u000ea\tU4d\u000ez8J#r_{QIY$CsQ\u0011i ^vI-";
        objectArray[14] = "6jl!2\u001dr-%L6'5i=!?Z42 5_\u001exjdt>Un5`L";
        objectArray[15] = "\u00059\u0007T\u0007hA~N9\u0005R\u0006:VT\n/\u0007aK@jn\u00011ZTP*Fx7";
        objectArray[16] = "o/k{j\n+h\"\u0016n0l,:{gMmw'o\u0007\n.y2*7\u000e3|*\u0016";
        objectArray[17] = "U\u001b{%dl\u0011\\2H`VWL:6j+\u000eL9y\th\u0006R5+t1\u0006QzH";
        objectArray[18] = "'$UR\u000f@cc\u001c?\bz$'\u0004R\u0002\u0007%|\u0019Fb@fr\f\u0003RD{w\u0014?";
        Object[] objectArray2 = objectArray;
        objectArray[19] = "L\u0002'\u001bjx\bEnveBO\u0001v\u001bg?NZk\u000f\u0007~H\nz\u001b=:\u000fC\u0017";
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = cF.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f9' || c == 'P' || c == '\u00e4' || c == 'T') {
                field = cF.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f9' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'P' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e4' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = cF.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f0' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00cc' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
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

    public void a(Object[] var1);

    public int a(Object[] var1);

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (v[n3] != null) {
            return n3;
        }
        Object object = u[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 54;
            case 1 -> 61;
            case 2 -> 41;
            case 3 -> 16;
            case 4 -> 40;
            case 5 -> 24;
            case 6 -> 59;
            case 7 -> 23;
            case 8 -> 38;
            case 9 -> 37;
            case 10 -> 43;
            case 11 -> 6;
            case 12 -> 49;
            case 13 -> 31;
            case 14 -> 51;
            case 15 -> 3;
            case 16 -> 25;
            case 17 -> 57;
            case 18 -> 35;
            case 19 -> 30;
            case 20 -> 55;
            case 21 -> 1;
            case 22 -> 14;
            case 23 -> 62;
            case 24 -> 32;
            case 25 -> 39;
            case 26 -> 26;
            case 27 -> 50;
            case 28 -> 13;
            case 29 -> 8;
            case 30 -> 45;
            case 31 -> 53;
            case 32 -> 44;
            case 33 -> 42;
            case 34 -> 46;
            case 35 -> 29;
            case 36 -> 17;
            case 37 -> 22;
            case 38 -> 2;
            case 39 -> 12;
            case 40 -> 36;
            case 41 -> 0;
            case 42 -> 20;
            case 43 -> 10;
            case 44 -> 18;
            case 45 -> 56;
            case 46 -> 5;
            case 47 -> 7;
            case 48 -> 4;
            case 49 -> 33;
            case 50 -> 58;
            case 51 -> 47;
            case 52 -> 28;
            case 53 -> 27;
            case 54 -> 52;
            case 55 -> 21;
            case 56 -> 48;
            case 57 -> 19;
            case 58 -> 9;
            case 59 -> 60;
            case 60 -> 63;
            case 61 -> 11;
            case 62 -> 15;
            default -> 34;
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
        cF.v[n3] = new String(cArray);
        return n3;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cF" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = cF.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1D2B;
        if (m[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = cF.l[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])cF.n.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    cF.n.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/cF", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            cF.m[n2] = n3;
        }
        return m[n2];
    }

    default public cF k(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = j ^ l;
        long l3 = l2 ^ 0xEF7B028B6E4L;
        long l4 = l2 ^ 0x78B8268BE2ADL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l4;
        objectArray3[0] = (int)cF.d("\u00f0", (Object)this, (Object)objectArray2, (long)436098968332543207L, (long)l);
        return cF.d("\u00f0", (Object)this, (Object)objectArray3, (long)436185613765075200L, (long)l);
    }

    public cF g(Object[] var1);

    public cF j(Object[] var1);

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(cF.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(cF.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


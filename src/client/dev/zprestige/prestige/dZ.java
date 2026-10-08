/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2338
 *  net.minecraft.class_2626
 *  net.minecraft.class_2885
 *  net.minecraft.class_310
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.a5;
import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bg_0;
import dev.zprestige.prestige.bh_0;
import dev.zprestige.prestige.d0;
import dev.zprestige.prestige.dL;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dP;
import dev.zprestige.prestige.dQ;
import dev.zprestige.prestige.dR;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.ei_0;
import dev.zprestige.prestige.f5;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.q_0;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2338;
import net.minecraft.class_2626;
import net.minecraft.class_2885;
import net.minecraft.class_310;

public class dZ
extends dV {
    private dM d;
    private dQ a;
    private dM c;
    private dL f;
    private dR e;
    private dM g;
    private dM h;
    private dR i;
    private dM j;
    private dM k;
    private dM l;
    private dR m;
    private dP n;
    private dM o;
    public static boolean p;
    private f5 q;
    private boolean r;
    private ArrayList s;
    private ArrayList t;
    private int u;
    private int v;
    private int w;
    private static final long x;
    private static final String[] y;
    private static final String[] z;
    private static final Map A;
    private static final Object[] B;
    private static final String[] C;

    public dZ() {
        long l;
        long l2 = l = x ^ 0x325C8EBEE421L;
        long l3 = l2 ^ 0x1E1806E106B2L;
        long l4 = l2 ^ 0x6F72580C0122L;
        long l5 = l2 ^ 0x5BD4D2ABB7A1L;
        long l6 = l2 ^ 0x50AEB3A3D3EFL;
        long l7 = l2 ^ 0x4B63AF056D80L;
        this.q = new f5(l3);
        this.s = new ArrayList();
        this.t = new ArrayList();
        this.u = -1;
        this.v = -1;
        this.w = -1;
        Object[] objectArray = new Object[2];
        objectArray[1] = l6;
        objectArray[0] = this::lambda$new$7;
        dZ.c("x", (Object)this.n, (Object)objectArray, (long)-200263657022222119L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l7;
        objectArray2[0] = this::lambda$new$8;
        dZ.c("x", (Object)this.o, (Object)objectArray2, (long)-212154978496024518L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l5;
        objectArray3[0] = this::lambda$new$3;
        dZ.c("x", (Object)this.i, (Object)objectArray3, (long)-200055413042219114L, (long)l);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l7;
        objectArray4[0] = this::lambda$new$5;
        dZ.c("x", (Object)this.k, (Object)objectArray4, (long)-212154978496024518L, (long)l);
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l7;
        objectArray5[0] = this::lambda$new$4;
        dZ.c("x", (Object)this.j, (Object)objectArray5, (long)-212154978496024518L, (long)l);
        Object[] objectArray6 = new Object[2];
        objectArray6[1] = l5;
        objectArray6[0] = this::lambda$new$6;
        dZ.c("x", (Object)this.m, (Object)objectArray6, (long)-200055413042219114L, (long)l);
        Object[] objectArray7 = new Object[2];
        objectArray7[1] = l4;
        objectArray7[0] = this::lambda$new$0;
        dZ.c("x", (Object)this.f, (Object)objectArray7, (long)-199708846704838046L, (long)l);
        Object[] objectArray8 = new Object[2];
        objectArray8[1] = l7;
        objectArray8[0] = this::lambda$new$2;
        dZ.c("x", (Object)this.g, (Object)objectArray8, (long)-212154978496024518L, (long)l);
        Object[] objectArray9 = new Object[2];
        objectArray9[1] = l5;
        objectArray9[0] = this::lambda$new$1;
        dZ.c("x", (Object)this.e, (Object)objectArray9, (long)-200055413042219114L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                dZ.x = hc.a(-590263323893931514L, -446676729124679708L, MethodHandles.lookup().lookupClass()).a(57710786326206L);
                dZ.B = new Object[140];
                dZ.C = new String[140];
                dZ.f();
                dZ.A = new HashMap<K, V>(13);
                var0 = dZ.x ^ 6268156995678L;
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
                var9_3 = new String[7];
                var7_4 = 0;
                var6_5 = "S\u00a5\u00b2\u00b7\u0013\u00ee\u0095\u0094\u00f1i\u00a1\u001c\u00e1T\u00c5\u0088\u0096\u008b \u0081\u00b3C\u0094]\u00f3cm\u00de#\u00ce\u00a7\u0089\u00fa\u009d7\u00a4\u00ff#\u009c\u0083\u0010\u00b8\u00d4\u00a3\"\u000b?\u00e9\u0089f\u00de\u00ab\u0098z\u00e4\u00c8g\u0010\u00f6\u00e6A\u001c`\u00e5O\u00d6\u008b\u00e0}\u00bcI\u0010\t\u00ac\u0010\u00f7H\u00af}\u00d5\u00eay\u009c\u00cf\u00b7\u00c4\u001b\u00d3\u00d5\u0010\u00f7\u0010,\u008bq\u000bB\u00cf\u008cX\u00f6\u00e9\u00d3R\u00b5\u00d4\u008b\u00fb";
                var8_6 = "S\u00a5\u00b2\u00b7\u0013\u00ee\u0095\u0094\u00f1i\u00a1\u001c\u00e1T\u00c5\u0088\u0096\u008b \u0081\u00b3C\u0094]\u00f3cm\u00de#\u00ce\u00a7\u0089\u00fa\u009d7\u00a4\u00ff#\u009c\u0083\u0010\u00b8\u00d4\u00a3\"\u000b?\u00e9\u0089f\u00de\u00ab\u0098z\u00e4\u00c8g\u0010\u00f6\u00e6A\u001c`\u00e5O\u00d6\u008b\u00e0}\u00bcI\u0010\t\u00ac\u0010\u00f7H\u00af}\u00d5\u00eay\u009c\u00cf\u00b7\u00c4\u001b\u00d3\u00d5\u0010\u00f7\u0010,\u008bq\u000bB\u00cf\u008cX\u00f6\u00e9\u00d3R\u00b5\u00d4\u008b\u00fb".length();
                var5_7 = 40;
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
                    var9_3[var7_4++] = dZ.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "H\u001e\u0099\u00c9S\u00e2i6\u0091\u00b6T\u00dd6\u008cH\u0092\u0010\u00cc\u00f5Q\u0081\u009c\u009e\u00af\u007f\r\u008b\u00b1\u00d4I\u00fd\r\u00b4";
                    var8_6 = "H\u001e\u0099\u00c9S\u00e2i6\u0091\u00b6T\u00dd6\u008cH\u0092\u0010\u00cc\u00f5Q\u0081\u009c\u009e\u00af\u007f\r\u008b\u00b1\u00d4I\u00fd\r\u00b4".length();
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
                    var9_3[var7_4++] = dZ.b(var10_9).intern();
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
        dZ.y = var9_3;
        dZ.z = new String[7];
    }

    /*
     * Exception decompiling
     */
    public boolean e(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [18[TRYBLOCK]], but top level block is 36[SWITCH]
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

    private static String b(byte[] byArray) {
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

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dZ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = dZ.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5FA1;
        if (z[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])A.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    A.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/dZ", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = y[n2].getBytes("ISO-8859-1");
            dZ.z[n2] = dZ.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return z[n2];
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dZ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = dZ.m(l, l2);
            object = B[n];
            try {
                if (!(object instanceof String)) break block2;
                dZ.B[n] = clazz = Class.forName(C[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = dZ.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = dZ.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = dZ.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = dZ.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = B;
        B[0] = "A'\nE\rHA'\u001d\u0019\u0001G[l\u001d\u0007\u0001R\\\u001dLXU\u0011";
        objectArray[1] = Integer.TYPE;
        dZ.C[1] = "java/lang/Integer";
        objectArray[2] = "\tL\u0013<\u000fj\u001fL\u0016f\u001c}\b\u0007\u0015`\u0010i\u0019@\u0002w[{%";
        objectArray[3] = "\u0019|\b\u0019>yl\\\u0003\u0016/6\u0011D\u0010\u0011&\u007fy";
        objectArray[4] = "^nONO.^nX\u0012C!D%X\fC4CT\bQ\u0012";
        objectArray[5] = "EsC(2\u0018EsTt>\u0017_8Tj>\u0002XI\u00055f";
        objectArray[6] = "\u001e%\u001c\u001d\u00178\b%\u0019G\u0004/\u001fn\u001aA\b;\u000e)\rVC)\u0015";
        objectArray[7] = "UkE\u007f\u00006 KNp\u0011yAEE{\u0015#5";
        objectArray[8] = Boolean.TYPE;
        dZ.C[8] = "java/lang/Boolean";
        objectArray[9] = "xB\"\u001f)InB'E:^y\t$C6JhN3T}Zn";
        objectArray[10] = "a>'}uX\u0014\u001e,rd\u0017u\u0010'y`M\u0001";
        objectArray[11] = "\u000fi-\rp?\u000fi:Q|0\u0015\":O|%\u0012Sk\u0011)`";
        objectArray[12] = "?l1\u0018so?l&D\u007f`%'&Z\u007fu\"Vw\u0004*>";
        objectArray[13] = "LATn\u0018M9a_a\t\u0002XoTj\rX,";
        objectArray[14] = "\u000f\u000b\u001dJ7_\u0004\u0004\f\u0005JG\u0017\u0003\u0005L";
        objectArray[15] = "|TT\u001fd\u000ejTQEw\u0019}\u001fRC{\rlXET0\u001dz";
        objectArray[16] = "uiVNc}\u0000I]Ar2aGVJvh\u0015";
        objectArray[17] = Void.TYPE;
        dZ.C[17] = "java/lang/Void";
        objectArray[18] = "v\u0003P\u0011\u00070`\u0003UK\u0014'wHVM\u00183f\u000fAZS$H";
        objectArray[19] = "zMoCBIqB~\f!DdOqg\u0014Fu\\mK\u0003K";
        objectArray[20] = "Z\u0018\u0012u\u0014//8\u0019z\u0005`N6\u0012q\u0001::";
        objectArray[21] = "\u0016\tXy\u0012\u0018\u0016\tO%\u001e\u0017\fBO;\u001e\u0002\u000b3\u001doOC";
        objectArray[22] = "u`\u000fE(_u`\u0018\u0019$Po+\u0018\u0007$EhZJ\\|\u0004";
        objectArray[23] = "M\b+f\u0003*F\u0007:)d(S\f:b_";
        objectArray[24] = ")\tm\u0012\nw)\tzN\u0006x3BzP\u0006m43+\u000fT&";
        objectArray[25] = "wjHm\u001f-|eY\"s.rg[m_";
        objectArray[26] = "~\u0000\u0018|U\u0002\u000b \u0013sDMj.\u0018x@\u0017\u001e";
        objectArray[27] = "a\u001f6\r|Bw\u001f3WoU`T0QcAq\u0013'F(Qj";
        objectArray[28] = "X\u0006\u001a\f@\f-&\u0011\u0003QCL(\u001a\bU\u00198";
        objectArray[29] = "G\u000f\u000bCt\u001a2/\u0000LeUS!\u000bGa\u000f'";
        objectArray[30] = "'6)[\u0013\u007fR\u0016\"T\u000203\u0018)_\u0006jG";
        objectArray[31] = "\t&f84W\u001f&cb'@\bm`d+T\u0019*ws`C&";
        objectArray[32] = "p\u0005_D4>{\nN\u000bU0p\u0001JQ";
        objectArray[33] = "\u0015)3fA\"`\t8iPm\u0001\u00073bT7u";
        objectArray[34] = ":[n_\u0000j:[y\u0003\fe \u0010y\u001d\fp'a)H[6";
        objectArray[35] = "z\u001aZ\u0018_Jd\u0012@W0Mb\u001aU5\u0018Ld";
        objectArray[36] = "\u0011\u0006<\n#c\u0007\u00069P0t\u0010M:V<`\u0001\n-Aww9";
        objectArray[37] = "c(\u0011\u0013\u000fA\u0016\b\u001a\u001c\u001e\u000ew\u0006\u0011\u0017\u001aT\u0003";
        objectArray[38] = "s.uf.\u001as.b:\"\u0015ieb$\"\u0000n\u00147{{";
        objectArray[39] = "og\u0010JG1og\u0007\u0016K>u,\u0007\bK+r]VR\u0012h";
        objectArray[40] = "V|x\u001e]\u0019V|oBQ\u0016L7o\\Q\u0003KF>\u0006\u0002F";
        objectArray[41] = "9\u0006%G)%/\u0006 \u001d:28M#\u001b6&)\n4\f}7:";
        objectArray[42] = "39o\u001c)VF\u0019d\u00138\u0019'\u0017o\u0018<CS";
        objectArray[43] = "#j\u001e 4\n#j\t|8\u00059!\tb8\u0010>PX;`U";
        objectArray[44] = "kU(M?\u000bkU?\u00113\u0004q\u001e?\u000f3\u0011vokWd";
        objectArray[45] = ";Ot\u0013T\u007fNo\u007f\u001cE0/at\u0017Aj[";
        objectArray[46] = "<\u00030!q\u0003\"\u000b*n\f\u0013\"";
        objectArray[47] = "Y'Hf\u0018:O'M<\u000b-XlN:\u00079I+Y-L,\b";
        objectArray[48] = "i u=.X\u001c\u0000~2?\u0017}\u000eu9;M\t";
        objectArray[49] = "eq\r)\u0001l\u0010Q\u0006&\u0010#q_\r-\u0014y\u0005";
        objectArray[50] = "j>\\\bZ<|>YRI+kuZTE?z2MC\u000e(_";
        objectArray[51] = "{vq*\fv\u000eVz%\u001d9oXq.\u0019c\u001b";
        objectArray[52] = "bj\u0006#Ksbj\u0011\u007fG|x!\u0011aGi\u007fPF>\u0011";
        objectArray[53] = "(}d0Er>}ajVe)6blZq8qu{\u0011a qwpK,\u001cjwmKk+}";
        objectArray[54] = ":#gXBx,#b\u0002Qo;ha\u0004]{*/v\u0013\u0016l\u001a";
        objectArray[55] = "EP\u0005S=\u00190p\u000e\\,VQ~\u0005W(\f%";
        objectArray[56] = "0uf%*;EUm*;t$[f!?.P";
        objectArray[57] = "lS\u0000\u001fbOr[\u001aP*OhQ\u0002\u0017#T(b\u0004\u001b(SeS\u0002\u001b";
        objectArray[58] = "7eCc\\\u000eBEHlMA#KCgI\u001bW";
        objectArray[59] = "x\u001b{\b s\r;p\u00071<l5{\f5f\u0018";
        objectArray[60] = "\u0004\u0007P \u001a#\u0004\u0007G|\u0016,\u001eLGb\u00169\u0019=\u00159Ns";
        objectArray[61] = "wkxz?Ywko&3Vm o83CjQ>lj\u0005";
        objectArray[62] = "\u0002=U3+w\u0002=Bo'x\u0018vBq'm\u001f\u0007\u0010/p&";
        objectArray[63] = "0S]!gr&SX{te1\u0018[}xq _Lj3`<";
        objectArray[64] = "\u000bZx\u0006Ez~zs\tT5\u001ftx\u0002Pok";
        objectArray[65] = "=`\u0011idTH@\u001afu\u001b)N\u0011mqA]";
        objectArray[66] = "\u001a\u00170^\u0014h\f\u00175\u0004\u0007\u007f\u001b\\6\u0002\u000bk\n\u001b!\u0015@|,";
        objectArray[67] = "Y\u001f48\u0002k,??7\u0013$M14<\u0017~9";
        objectArray[68] = "\u0000R/_BS\u0016R*\u0005QD\u0001\u0019)\u0003]P\u0010^>\u0014\u0016G4";
        objectArray[69] = "\u0018]Z>7Zm}Q1&\u0015\fsZ:\"Ox";
        objectArray[70] = "|NzJZ8jN\u007f\u0010I/}\u0005|\u0016E;lBk\u0001\u000e,U";
        objectArray[71] = "\u0014\u001d\\\r\u001f,a=W\u0002\u000ec\u00003\\\t\n9t";
        objectArray[72] = "-!5\u0005\u0000<hb!\u000f=nv1:\nj9(fbf@qj1!\u0005_i,\"";
        objectArray[73] = "%n6\u0000Y_y>j\u000f?\u000f\u001b9g\u0012T\u0010x<p\u0010Z\u0010\u001b>4\n\u0004\u0002{80SAn";
        objectArray[74] = "\t\u0006\u0000 \u001d3\u0017\u0007\u0016t\"ne\u0003\u001caI|\u0006\u0006\u000bcG|e\u0004Oy\u0019n\u0005\u0002K \\\u0002";
        objectArray[75] = "$\u001e3Q3K`\u0005oJMP\u0018DbK&G{AuI(G\u0018\u0003oU'Z~C1\u0000M";
        objectArray[76] = "@]B\u0018=ZN\u0000QWDV1\u0002_\\/BR\u0007H^!B1QC\u00198ZIRV\u001f&<";
        objectArray[77] = "'E|;({b\u0006h1\u0015)|Us4B~\"\u0005*X,\u007ftI'?m< Q.";
        objectArray[78] = "U\u0004<G!\u001d\u0018J/XJ\u0014\u000b\u00173U\u001d@QCj\u0003JJ\n\u001flD.\b\bG3";
        objectArray[79] = "w+\u0010[Dth3VH;rg&\rQW@4cT\u000b;)59VZ[/1`\u00136";
        objectArray[80] = "fB&qbDxC0%]\u0017\nG:06\u000biB-28\u000b\n\u0014&u!\u0013r\u00173s?u";
        objectArray[81] = "nQl>\u000f\u000f+\u0012x42V9Pg:^dm\u00119l2\rkO<1R\u000bo\u0016y]";
        objectArray[82] = "xP%\tA|-TsX{w\u0011\u0010s\u0018\u0010rr\u0015d\u001a\u001er\u0011Co]\u0007ji@z[\u0019\f";
        objectArray[83] = "Gn^+\u000fPW1Brj\u000b80In\u0001\u001f[5^l\u000f\u001f87\u001avQ\rX1\u001e/\u0014a";
        objectArray[84] = "P})\u0002'\u0013Sm+\u0000L\u0005P{lR-\bL\u001duC3\nQz Gu\u000b7#/Xw\u0002W%+\u00012n";
        objectArray[85] = "\bv3\r2+\u000b=2K\t!pv?\u000fb6\u0013s(\rl6p7j\u0014ps\u00134!\u00156H";
        objectArray[86] = "Q-h0\u0004FO,~d;\u001e=}&u\u0003\u0017Ota:IwQ/g2[\u0005Xh(x;";
        objectArray[87] = "Vz3r\u0015;\u0012aoik j bh\u00007\t%uj\u000e7j)nvP4\u000ekl.\u000fI";
        objectArray[88] = "f\u0013\b`\u0016\u0013+]\u001b\u007f}\u001a8\u0000\u0007r*MaUX }D9\bXc\u0019\u0006;P\u0007";
        objectArray[89] = "m@2\bg_)\f.\bb\"=qt\u0007uI*\u0012q\u0010wG*qtZqA=\f0\u0016mA8q";
        objectArray[90] = "`&bo\u0012Vk{4=b\rmj;8\u000e?9.caSh~w>5\u0001\u000e>)k_\u001c\te|89\\W0\u0016%>\u0007\u0002cpe`Rh`&bo\u0012Vk{4=b";
        objectArray[91] = "m[^%4K8\u0004Jec,=d\u0019y\u007fG*\u0007\u001cn}I*d]~gQ*\u0000X~;\u0010T";
        objectArray[92] = "+m9m)@ i(3M\u0012,s3`$\u001e\u0015}3p xu+46!\u0018s/msM";
        objectArray[93] = "r8%\u0013n610*I\u001f)d-4\u001fs\u001b0ho@/Lsn7\u0014\"(14>\u001d\u001f";
        objectArray[94] = "C\u001du&F<\bK74PZ\u0013w6;D1\u0004\u00143,F?\u0004w6=E+\u0003\u0011}k\u00079\u0015w";
        objectArray[95] = "<eWx|\u0004`5\u000bw\u001aQ\u00022\u0006jqKa7\u0011h\u007fK\u00025Ur!Yb3Q+d5";
        objectArray[96] = "Xls)oB[|q+\u0004T[a#j\u0004UO26v|VZ4(\u0010";
        objectArray[97] = "\u007f-C^J\u0014t \u0011\\vD\u001b9\nN\u0012K|l\u000e\b\u0013-";
        objectArray[98] = "d?or%\bg/mpN\u000fn:15#uf')/(\u00123#o.NK<<m'.M8e(K";
        objectArray[99] = "\f\u0013m\u000e\u0011dH\b1\u0015ou0I<\u0014\u0004hSL+\u0016\nh0No\fTzPHkU\u0011\u0016";
        objectArray[100] = "\u0016*QYypR1\rB\u0007h*p\u0000Cl|Iu\u0017Ab|*wS[<nJqW\u0002y\u0002";
        objectArray[101] = "a9\u0004Kjad=\f\u0018\u0018zj:]GtH>y\u0002\u001f'\u001fgv\u0004\u0010h!l+RB\u0018";
        objectArray[102] = "p\u0014[aM\r#\u0014Ii0\u001e8\u0012]}Ks$\u0017K}V\u0014q\u0013\r|0M~\f\u000fuPKzUJ\u0019";
        objectArray[103] = "R}\u0005\u001a9\"V \u000fX(\\\u000e.\u0010J>0<zV\u0017egk%\u0013\u00132.\u0015 \u0017\u001ba\\";
        objectArray[104] = "\\Zk: 4_Ji8K WVRf36_\\537p^:l<(rWZj8q7;";
        objectArray[105] = "J8&7\u0005v\bb/>8w]{%<TE\n9\u007fc\u0004\u0012\u0000g `EvBex?8";
        objectArray[106] = "Z[X3.tZ\u000bIU{zHQ\\9I.\f\b\u0005i\u001eiUTQ6x)\u000b\u0001;";
        objectArray[107] = "Y>fl\u0002\u0007F& \u007f}\u0001I3{f\u00113\u0019p\"<}Z\u001b, m\u001d\\\u001fue\u0001";
        objectArray[108] = "eu'\u001c+\u0010;kkXK@\\=/J V1y2Zq*";
        objectArray[109] = "l0B1H\t)sV;u[7 M>\"\fis\u0014RNP1?T2\u001c\t1\"";
        objectArray[110] = "yz\u0000\u00007%=a\\\u001bI;E Q\u001a\")&%F\u0018,)E'\u0002\u0002r;%!\u0006[7W";
        objectArray[111] = ")8g\u001fD\u001bl{s\u0015yIr(h\u0010.\u001e-u3|\u0000W,'k\u0007\u0015\u001cu~";
        objectArray[112] = "\u000ee\u0007hWWC+\u0014w<^Pv\bzk\t\t\"S/<\u0000Q~WkXBS&\b";
        objectArray[113] = "\\b!Zl\u0004\n!{Ksn\u00001cTz\u00022c.\f,n\u000b<s\u000es\u0007]9 \r\u001d";
        objectArray[114] = "m\bX^`)iUR\u001cqW1[M\u000eg;\u0003\u000f\u000bS<iT\u000f\u000e\rc/mQ\\\u00070iT";
        objectArray[115] = "edC\u000f%\u0000;6I\\c92:M\b1nak\u0018\\]\u0000c8C\u0014d^12\u0010R";
        objectArray[116] = "\u0017-Sgs\u0019\b5\u0015t\f\u001f\u0007 Nm`-Td\u00125\fCTb@{f\u0015\u00178Qd\f";
        objectArray[117] = "U69m\u0011h\u00066+elv\r66^\u000bz\tM(t\t|\u0007+h*\\\u0016";
        objectArray[118] = "\u000b\u000bURlm\u000b[D49c\u0019\u0001QX\u000b7]X\n\u0004\\p\u0004\u0004\\W:0ZQ6";
        objectArray[119] = "9g\"Z\u0017%)8>\u0003r}F95\u001f\u0019j%<\"\u001d\u0017jFj)Z\u000er>i<\\\u0010\u0014";
        objectArray[120] = "%?fE6rs9xW1Op\u0006:U($be?B**b\u0006=\u00060tpf;\u0002i1\u001c";
        objectArray[121] = "Qph{J=D;1\"-#E|7~A\u0011\u0018;m!-&\u00189gi\u0013-Eo5\u0019WyKlj}\u0015#BeW";
        objectArray[122] = "&fy\u0019\u0005<&6h\u007fP24l}\u0013bfp5$B5!)ip\u001cSaw<\u001a";
        objectArray[123] = "^;n\u001f6\f^pi\u0018L\fR,n\u0012\u001bX\bx6GL\fS-0\u0010%ZV~3";
        objectArray[124] = "W\u0016I^=CUMCM\u0002N^Q'IfRU-\u0007AgE[KG\u001f2/";
        objectArray[125] = "u8N\u0011o\u0013)h\u0012\u001e\tKKo\u001f\u0003b\\(j\b\u0001l\\K<\u0003FuD3?\u0016@k\"";
        objectArray[126] = "\u001a5UI}\u001eE2C\u001e>sD\r\u001cA \u000fF0JG>\u001dA";
        objectArray[127] = "\nX:NSKIP5\u0014\"T\u001cM+BNfH\bp\u001d\u00131\u0011\u0001r\u0015R\u000f\u001a\\$G\"";
        objectArray[128] = "VY\u0007{\u0016e^\tD>ob4]Tx\u0004uWXCz\nu4Z\u0007`TgT\\\u00039\u0011\u000b";
        objectArray[129] = "\u0010^\u0014U\u0011\u0002\u000e_\u0002\u0001.^|[\b\u0014EM\u001f^\u001f\u0016KM|\\[\f\u0015_\u001cZ_UP3";
        objectArray[130] = "\u0006dT\u0015\u00104\u001duN\u001bi3}%G\u0007\u0002$\u001e P\u0005\f$}a@\u001f\u0014$\u0019d@CUZ";
        objectArray[131] = "@\"\u0019.W\u0005_:_=(\u0003P/\u0004$D1\u0003k[r(_\u0003m\n2B\t@7\u001b-(";
        objectArray[132] = "|n[\u0006\u001c< >\u0007\tzdB9\n\u0014\u0011s!<\u001d\u0016\u001fsB~\u0007\n\u0010n$>Y_z";
        objectArray[133] = "\r\u0007\u001fG:$\t\u0002M\bl^]k\u001e\u0015(5J\b\u001b\u0002*;Jk\u001e\u0015k`]\u0011\u001a\u00109/\u000bk";
        objectArray[134] = "Q&q^f>\u001e~vQ\u001be@\u001cnKdfH{;O\"g.c1Iv\u007f\u0012,iNy\u0002";
        objectArray[135] = "Mwm;?\u007fNgo9TxGr3|9CD\u0017m952Gu&p>xQ\u0017j=79Fwl9n|*";
        objectArray[136] = "jX\r\u0010>Bo\\\u0005CLYa[T\u001c k5\u0018\u000bKt<bMW\u001d|_b\u001dF{";
        objectArray[137] = "~}^pS\u0001 /T#\u00158*;@zOCG'ElO^ rA*N8y}^(GX\u007fy\u0007m+";
        objectArray[138] = "\"\u0002~\u0003\bZ!I\u007fE3RZ\u0002r\u0001XG9\u0007e\u0003VGZ\u0005!\u0019\bU:\u0003%@M9";
        Object[] objectArray2 = objectArray;
        objectArray[139] = "\u0012v]L~\u0007\u0012=ZK\u0004\u0007\u001ea]ASYO4\u0000-j\t\u00136WD<\f@5";
    }

    /*
     * Exception decompiling
     */
    private boolean d(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [19[TRYBLOCK]], but top level block is 55[SWITCH]
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

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = dZ.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'O' || c == '\u00c9' || c == 'o' || c == 'E') {
                field = dZ.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'O' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c9' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'o' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = dZ.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'x' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00a2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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

    @bP
    public void a(bG bG2) {
        Object object;
        block58: {
            block59: {
                CallSite callSite;
                long l;
                long l2;
                block56: {
                    block57: {
                        long l3;
                        block54: {
                            block55: {
                                long l4;
                                block52: {
                                    long l5;
                                    long l6;
                                    block53: {
                                        block50: {
                                            block51: {
                                                block48: {
                                                    long l7;
                                                    block49: {
                                                        block46: {
                                                            block47: {
                                                                block45: {
                                                                    block43: {
                                                                        block44: {
                                                                            block41: {
                                                                                block42: {
                                                                                    class_310 class_3102;
                                                                                    block40: {
                                                                                        long l8 = l2 = x ^ 0x42346961D7ACL;
                                                                                        l = l8 ^ 0x647008CCFAF0L;
                                                                                        l6 = l8 ^ 0x2C8A2AA2D13FL;
                                                                                        l3 = l8 ^ 0x2C5E0430F057L;
                                                                                        l7 = l8 ^ 0x28014DEAACCFL;
                                                                                        l5 = l8 ^ 0x4A73BFA68043L;
                                                                                        l4 = l8 ^ 0x662967566FE0L;
                                                                                        callSite = dZ.c("\u00a2", (long)-3550730871417647363L, (long)l2);
                                                                                        try {
                                                                                            try {
                                                                                                class_3102 = b;
                                                                                                if (callSite != null) break block40;
                                                                                                if (dZ.c("O", (Object)class_3102, (long)-3553044840634803202L, (long)l2) != null) break block41;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw dZ.c("\u00a2", (Object)matchException, (long)-3551133403076838508L, (long)l2);
                                                                                            }
                                                                                            class_3102 = b;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw dZ.c("\u00a2", (Object)matchException, (long)-3551133403076838508L, (long)l2);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            object = dZ.c("x", (Object)class_3102, (long)-3551604476864614685L, (long)l2);
                                                                                            if (callSite != null) break block42;
                                                                                            if (object == false) break block41;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw dZ.c("\u00a2", (Object)matchException, (long)-3551133403076838508L, (long)l2);
                                                                                        }
                                                                                        object = dZ.c("x", (Object)dZ.c("O", (Object)b, (long)-3553211682257588559L, (long)l2), (long)-3552917076286708637L, (long)l2);
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw dZ.c("\u00a2", (Object)matchException, (long)-3551133403076838508L, (long)l2);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    if (callSite != null) break block43;
                                                                                    if (object == false) break block44;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw dZ.c("\u00a2", (Object)matchException, (long)-3551133403076838508L, (long)l2);
                                                                                }
                                                                            }
                                                                            return;
                                                                        }
                                                                        object = ei_0.R;
                                                                    }
                                                                    try {
                                                                        if (callSite != null) break block45;
                                                                        if (object != false) break block46;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw dZ.c("\u00a2", (Object)matchException, (long)-3551133403076838508L, (long)l2);
                                                                    }
                                                                    object = d0.C;
                                                                }
                                                                try {
                                                                    try {
                                                                        if (callSite != null) break block47;
                                                                        if (object != false) break block46;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw dZ.c("\u00a2", (Object)matchException, (long)-3551133403076838508L, (long)l2);
                                                                    }
                                                                    object = dZ.c("x", (Object)dZ.c("o", (long)-3549425734522525790L, (long)l2), (Object)new Object[0], (long)-3549864993638466191L, (long)l2);
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw dZ.c("\u00a2", (Object)matchException, (long)-3551133403076838508L, (long)l2);
                                                                }
                                                            }
                                                            try {
                                                                if (callSite != null) break block48;
                                                                if (object == false) break block49;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw dZ.c("\u00a2", (Object)matchException, (long)-3551133403076838508L, (long)l2);
                                                            }
                                                        }
                                                        return;
                                                    }
                                                    Object[] objectArray = new Object[2];
                                                    objectArray[1] = l7;
                                                    objectArray[0] = this.a;
                                                    object = dZ.c("x", (Object)this.q, (Object)objectArray, (long)-3551488488910275383L, (long)l2);
                                                }
                                                try {
                                                    if (callSite != null) break block50;
                                                    if (object != false) break block51;
                                                }
                                                catch (MatchException matchException) {
                                                    throw dZ.c("\u00a2", (Object)matchException, (long)-3551133403076838508L, (long)l2);
                                                }
                                                return;
                                            }
                                            object = dZ.c("x", (Object)((Boolean)((Object)dZ.c("x", (Object)this.d, (long)-3550458563748411116L, (long)l2))), (long)-3551851074026098678L, (long)l2);
                                        }
                                        try {
                                            try {
                                                if (callSite != null) break block52;
                                                if (object == false) break block53;
                                            }
                                            catch (MatchException matchException) {
                                                throw dZ.c("\u00a2", (Object)matchException, (long)-3551133403076838508L, (long)l2);
                                            }
                                            dZ.c("x", (Object)this.s, dZ::lambda$onTick$9, (long)-3565856522098232827L, (long)l2);
                                        }
                                        catch (MatchException matchException) {
                                            throw dZ.c("\u00a2", (Object)matchException, (long)-3551133403076838508L, (long)l2);
                                        }
                                    }
                                    Object[] objectArray = new Object[1];
                                    objectArray[0] = l6;
                                    dZ.c("x", (Object)this.q, (Object)objectArray, (long)-3548913483346062600L, (long)l2);
                                    Object[] objectArray2 = new Object[1];
                                    objectArray2[0] = l5;
                                    dZ.c("x", (Object)this.a, (Object)objectArray2, (long)-3552984836280189079L, (long)l2);
                                    p = 1;
                                    object = dZ.c("x", (Object)((Boolean)((Object)dZ.c("x", (Object)this.c, (long)-3550458563748411116L, (long)l2))), (long)-3551851074026098678L, (long)l2);
                                }
                                try {
                                    try {
                                        try {
                                            if (callSite != null) break block54;
                                            if (object == false) break block55;
                                        }
                                        catch (MatchException matchException) {
                                            throw dZ.c("\u00a2", (Object)matchException, (long)-3551133403076838508L, (long)l2);
                                        }
                                        Object[] objectArray = new Object[1];
                                        objectArray[0] = l4;
                                        object = dZ.c("x", (Object)this, (Object)objectArray, (long)-3553075104286710126L, (long)l2);
                                        if (callSite != null) break block54;
                                    }
                                    catch (MatchException matchException) {
                                        throw dZ.c("\u00a2", (Object)matchException, (long)-3551133403076838508L, (long)l2);
                                    }
                                    if (object == false) break block55;
                                }
                                catch (MatchException matchException) {
                                    throw dZ.c("\u00a2", (Object)matchException, (long)-3551133403076838508L, (long)l2);
                                }
                                return;
                            }
                            object = dZ.c("x", (Object)((Boolean)((Object)dZ.c("x", (Object)this.h, (long)-3550458563748411116L, (long)l2))), (long)-3551851074026098678L, (long)l2);
                        }
                        try {
                            try {
                                try {
                                    if (callSite != null) break block56;
                                    if (object == false) break block57;
                                }
                                catch (MatchException matchException) {
                                    throw dZ.c("\u00a2", (Object)matchException, (long)-3551133403076838508L, (long)l2);
                                }
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l3;
                                object = dZ.c("x", (Object)this, (Object)objectArray, (long)-3566225241854464773L, (long)l2);
                                if (callSite != null) break block56;
                            }
                            catch (MatchException matchException) {
                                throw dZ.c("\u00a2", (Object)matchException, (long)-3551133403076838508L, (long)l2);
                            }
                            if (object == false) break block57;
                        }
                        catch (MatchException matchException) {
                            throw dZ.c("\u00a2", (Object)matchException, (long)-3551133403076838508L, (long)l2);
                        }
                        return;
                    }
                    object = dZ.c("x", (Object)((Boolean)((Object)dZ.c("x", (Object)this.l, (long)-3550458563748411116L, (long)l2))), (long)-3551851074026098678L, (long)l2);
                }
                try {
                    try {
                        if (callSite != null) break block58;
                        if (object == false) break block59;
                    }
                    catch (MatchException matchException) {
                        throw dZ.c("\u00a2", (Object)matchException, (long)-3551133403076838508L, (long)l2);
                    }
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l;
                    dZ.c("x", (Object)this, (Object)objectArray, (long)-3551521577746465110L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw dZ.c("\u00a2", (Object)matchException, (long)-3551133403076838508L, (long)l2);
                }
            }
            object = 0;
        }
        p = object;
    }

    @bP
    public void a(a5 a52) {
        long l = x ^ 0x36806CA4C3EDL;
        dZ.c("x", (Object)this.s, (long)-2667521075474936144L, (long)l);
        dZ.c("x", (Object)this.t, (long)-2667521075474936144L, (long)l);
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return dZ.c("\u00a2", (Object)((Object)q_0.Crystal), (long)-2440479708000174029L, (long)l);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @bP
    public void a(bg_0 bg_02) {
        CallSite callSite;
        class_2626 class_26262;
        long l;
        block12: {
            CallSite callSite2;
            CallSite callSite3;
            block11: {
                l = x ^ 0x56D9DBB6BF24L;
                CallSite callSite4 = dZ.c("x", (Object)bg_02, (Object)new Object[0], (long)-6482120502163036964L, (long)l);
                callSite3 = dZ.c("\u00a2", (long)-6471301061965240715L, (long)l);
                try {
                    try {
                        callSite2 = callSite4;
                        if (callSite3 != null) break block11;
                        if (!(callSite2 instanceof class_2626)) return;
                    }
                    catch (MatchException matchException) {
                        throw dZ.c("\u00a2", (Object)matchException, (long)-6467237158435171556L, (long)l);
                    }
                    callSite2 = callSite4;
                }
                catch (MatchException matchException) {
                    throw dZ.c("\u00a2", (Object)matchException, (long)-6467237158435171556L, (long)l);
                }
            }
            class_26262 = (class_2626)callSite2;
            try {
                try {
                    callSite = dZ.c("x", (Object)class_26262, (long)-6467995054366212013L, (long)l);
                    if (callSite3 != null) break block12;
                    if (callSite == null) return;
                }
                catch (MatchException matchException) {
                    throw dZ.c("\u00a2", (Object)matchException, (long)-6467237158435171556L, (long)l);
                }
                callSite = dZ.c("x", (Object)class_26262, (long)-6467995054366212013L, (long)l);
            }
            catch (MatchException matchException) {
                throw dZ.c("\u00a2", (Object)matchException, (long)-6467237158435171556L, (long)l);
            }
        }
        try {
            if (dZ.c("x", (Object)callSite, (long)-6471608655391402400L, (long)l) == dZ.c("o", (long)-6468891699684256452L, (long)l)) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw dZ.c("\u00a2", (Object)matchException, (long)-6467237158435171556L, (long)l);
        }
        dZ.c("x", (Object)this.t, (Object)dZ.c("x", (Object)class_26262, (long)-6470058123912000439L, (long)l), (long)-6470863376628821237L, (long)l);
        dZ.c("x", (Object)this.s, (Object)dZ.c("x", (Object)class_26262, (long)-6470058123912000439L, (long)l), (long)-6470863376628821237L, (long)l);
    }

    @bP
    public void a(bh_0 bh_02) {
        block27: {
            CallSite callSite;
            ArrayList arrayList;
            long l;
            block31: {
                CallSite callSite2;
                block33: {
                    CallSite callSite3;
                    CallSite callSite4;
                    long l2;
                    long l3;
                    block30: {
                        block34: {
                            block29: {
                                CallSite callSite5;
                                block28: {
                                    CallSite callSite6;
                                    CallSite callSite7;
                                    block26: {
                                        long l4 = l = x ^ 0x66FBCE1D320EL;
                                        l3 = l4 ^ 0xE72EC26875DL;
                                        l2 = l4 ^ 0x5665C234863EL;
                                        callSite7 = dZ.c("x", (Object)bh_02, (Object)new Object[0], (long)3104866494056623142L, (long)l);
                                        callSite4 = dZ.c("\u00a2", (long)3106183958600067935L, (long)l);
                                        try {
                                            try {
                                                callSite6 = callSite7;
                                                if (callSite4 != null) break block26;
                                                if (!(callSite6 instanceof class_2885)) break block27;
                                            }
                                            catch (MatchException matchException) {
                                                throw dZ.c("\u00a2", (Object)matchException, (long)3104653821832879670L, (long)l);
                                            }
                                            callSite6 = callSite7;
                                        }
                                        catch (MatchException matchException) {
                                            throw dZ.c("\u00a2", (Object)matchException, (long)3104653821832879670L, (long)l);
                                        }
                                    }
                                    class_2885 class_28852 = (class_2885)callSite6;
                                    try {
                                        CallSite callSite8 = callSite7 = dZ.c("x", (Object)dZ.c("x", (Object)class_28852, (long)3106614652204648731L, (long)l), (Object)dZ.c("o", (long)3106499948080884842L, (long)l), (long)3108097788612343750L, (long)l) != false ? dZ.c("x", (Object)dZ.c("O", (Object)b, (long)3103631068574010131L, (long)l), (long)3106759742056871210L, (long)l) : dZ.c("x", (Object)dZ.c("O", (Object)b, (long)3103631068574010131L, (long)l), (long)3107653135125332004L, (long)l);
                                    }
                                    catch (MatchException matchException) {
                                        throw dZ.c("\u00a2", (Object)matchException, (long)3104653821832879670L, (long)l);
                                    }
                                    if (dZ.c("x", (Object)callSite7, (long)3106387121587714167L, (long)l) != dZ.c("o", (long)3107085830641881624L, (long)l)) break block27;
                                    callSite3 = dZ.c("x", (Object)class_28852, (long)3105656040552721933L, (long)l);
                                    callSite2 = dZ.c("x", (Object)dZ.c("x", (Object)callSite3, (long)3105569899770055241L, (long)l), (int)dZ.c("x", (Object)dZ.c("x", (Object)callSite3, (long)3108158339614541515L, (long)l), (long)3106866643200264075L, (long)l), (int)dZ.c("x", (Object)dZ.c("x", (Object)callSite3, (long)3108158339614541515L, (long)l), (long)3106070221564414922L, (long)l), (int)dZ.c("x", (Object)dZ.c("x", (Object)callSite3, (long)3108158339614541515L, (long)l), (long)3107152189240433659L, (long)l), (long)3104915615473379835L, (long)l);
                                    try {
                                        try {
                                            try {
                                                callSite5 = dZ.c("x", (Object)((Boolean)((Object)dZ.c("x", (Object)this.d, (long)3105258816438316214L, (long)l))), (long)3105072015181698472L, (long)l);
                                                if (callSite4 != null) break block28;
                                                if (callSite5 == false) break block29;
                                            }
                                            catch (MatchException matchException) {
                                                throw dZ.c("\u00a2", (Object)matchException, (long)3104653821832879670L, (long)l);
                                            }
                                            arrayList = this.s;
                                            callSite = callSite2;
                                            if (callSite4 != null) break block30;
                                        }
                                        catch (MatchException matchException) {
                                            throw dZ.c("\u00a2", (Object)matchException, (long)3104653821832879670L, (long)l);
                                        }
                                        callSite5 = dZ.c("x", (Object)arrayList, (Object)callSite, (long)3104509471491937566L, (long)l);
                                    }
                                    catch (MatchException matchException) {
                                        throw dZ.c("\u00a2", (Object)matchException, (long)3104653821832879670L, (long)l);
                                    }
                                }
                                if (callSite5 == false) break block34;
                            }
                            return;
                        }
                        arrayList = this.s;
                        callSite = dZ.c("x", (Object)callSite3, (long)3105569899770055241L, (long)l);
                    }
                    try {
                        block32: {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                if (callSite4 != null) break block31;
                                                Object[] objectArray = new Object[3];
                                                objectArray[2] = l3;
                                                objectArray[1] = dZ.c("o", (long)3104054811729025046L, (long)l);
                                                objectArray[0] = callSite;
                                                if (dZ.c("\u00a2", (Object)objectArray, (long)3105609214912968374L, (long)l) != false) break block32;
                                            }
                                            catch (MatchException matchException) {
                                                throw dZ.c("\u00a2", (Object)matchException, (long)3104653821832879670L, (long)l);
                                            }
                                            callSite = dZ.c("x", (Object)callSite3, (long)3105569899770055241L, (long)l);
                                            if (callSite4 != null) break block31;
                                        }
                                        catch (MatchException matchException) {
                                            throw dZ.c("\u00a2", (Object)matchException, (long)3104653821832879670L, (long)l);
                                        }
                                        Object[] objectArray = new Object[3];
                                        objectArray[2] = l3;
                                        objectArray[1] = dZ.c("o", (long)3104785957963755025L, (long)l);
                                        objectArray[0] = callSite;
                                        if (dZ.c("\u00a2", (Object)objectArray, (long)3105609214912968374L, (long)l) != false) break block32;
                                    }
                                    catch (MatchException matchException) {
                                        throw dZ.c("\u00a2", (Object)matchException, (long)3104653821832879670L, (long)l);
                                    }
                                    callSite = dZ.c("x", (Object)callSite3, (long)3105569899770055241L, (long)l);
                                    if (callSite4 != null) break block31;
                                }
                                catch (MatchException matchException) {
                                    throw dZ.c("\u00a2", (Object)matchException, (long)3104653821832879670L, (long)l);
                                }
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l2;
                                Object[] objectArray2 = new Object[3];
                                objectArray2[2] = l3;
                                objectArray2[1] = dZ.c("\u00a2", (Object)objectArray, (long)3104574671644745163L, (long)l);
                                objectArray2[0] = callSite;
                                if (dZ.c("\u00a2", (Object)objectArray2, (long)3105609214912968374L, (long)l) == false) break block33;
                            }
                            catch (MatchException matchException) {
                                throw dZ.c("\u00a2", (Object)matchException, (long)3104653821832879670L, (long)l);
                            }
                        }
                        callSite = dZ.c("x", (Object)callSite3, (long)3105569899770055241L, (long)l);
                        break block31;
                    }
                    catch (MatchException matchException) {
                        throw dZ.c("\u00a2", (Object)matchException, (long)3104653821832879670L, (long)l);
                    }
                }
                callSite = callSite2;
            }
            dZ.c("x", (Object)arrayList, (Object)callSite, (long)3105915873703417593L, (long)l);
        }
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (C[n3] != null) {
            return n3;
        }
        Object object = B[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 28;
            case 1 -> 35;
            case 2 -> 44;
            case 3 -> 11;
            case 4 -> 51;
            case 5 -> 19;
            case 6 -> 31;
            case 7 -> 4;
            case 8 -> 12;
            case 9 -> 58;
            case 10 -> 14;
            case 11 -> 9;
            case 12 -> 56;
            case 13 -> 21;
            case 14 -> 23;
            case 15 -> 61;
            case 16 -> 30;
            case 17 -> 17;
            case 18 -> 15;
            case 19 -> 63;
            case 20 -> 6;
            case 21 -> 48;
            case 22 -> 45;
            case 23 -> 59;
            case 24 -> 24;
            case 25 -> 37;
            case 26 -> 52;
            case 27 -> 50;
            case 28 -> 22;
            case 29 -> 13;
            case 30 -> 8;
            case 31 -> 53;
            case 32 -> 49;
            case 33 -> 18;
            case 34 -> 38;
            case 35 -> 36;
            case 36 -> 5;
            case 37 -> 39;
            case 38 -> 47;
            case 39 -> 1;
            case 40 -> 20;
            case 41 -> 43;
            case 42 -> 3;
            case 43 -> 55;
            case 44 -> 41;
            case 45 -> 60;
            case 46 -> 40;
            case 47 -> 27;
            case 48 -> 62;
            case 49 -> 54;
            case 50 -> 46;
            case 51 -> 32;
            case 52 -> 42;
            case 53 -> 0;
            case 54 -> 25;
            case 55 -> 57;
            case 56 -> 16;
            case 57 -> 33;
            case 58 -> 7;
            case 59 -> 2;
            case 60 -> 29;
            case 61 -> 10;
            case 62 -> 34;
            default -> 26;
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
        dZ.C[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = dZ.m(l, l2);
        Object object = B[n];
        if (object instanceof String) {
            String string = C[n];
            int n2 = string.indexOf(8);
            Class clazz = dZ.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = dZ.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = dZ.g(clazz3, string2, clazz2)) != null) {
                    dZ.B[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = dZ.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        dZ.B[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = dZ.n(2307401591515402L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = dZ.m(l, l2);
        Object object = B[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = C[n];
                int n3 = string2.indexOf(8);
                clazz3 = dZ.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = dZ.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = dZ.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        dZ.B[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = dZ.n(2307401591515402L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = dZ.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        dZ.B[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = dZ.n(2307401591515402L, 0L);
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

    private static Method g(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Exception decompiling
     */
    private void j(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[TRYBLOCK]], but top level block is 27[SWITCH]
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

    private boolean lambda$new$0(Integer n) {
        long l = x ^ 0x272E5FFE340L;
        return (boolean)dZ.c("x", (Object)((Boolean)((Object)dZ.c("x", (Object)this.c, (long)-408001303674454536L, (long)l))), (long)-407283284221131546L, (long)l);
    }

    private boolean lambda$new$2(Boolean bl) {
        Object object;
        block8: {
            block7: {
                CallSite callSite;
                long l;
                block6: {
                    l = x ^ 0xBBF0E143B19L;
                    callSite = dZ.c("\u00a2", (long)2453349772494807624L, (long)l);
                    try {
                        try {
                            object = dZ.c("x", (Object)((Boolean)((Object)dZ.c("x", (Object)this.c, (long)2454309188969276833L, (long)l))), (long)2449962385467792575L, (long)l);
                            if (callSite != null) break block6;
                            if (object == false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw dZ.c("\u00a2", (Object)matchException, (long)2450696482452494113L, (long)l);
                        }
                        object = dZ.c("x", (String)((Object)dZ.c("x", (Object)this.e, (long)2454309188969276833L, (long)l)), (Object)dZ.b("b", (int)7274, (long)(0x2786DE2B6603E1DDL ^ l)), (long)2454056293131094913L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw dZ.c("\u00a2", (Object)matchException, (long)2450696482452494113L, (long)l);
                    }
                }
                try {
                    if (callSite != null) break block8;
                    if (object == false) break block7;
                }
                catch (MatchException matchException) {
                    throw dZ.c("\u00a2", (Object)matchException, (long)2450696482452494113L, (long)l);
                }
                object = 1;
                break block8;
            }
            object = 0;
        }
        return (boolean)object;
    }

    private boolean lambda$new$1(String string) {
        long l = x ^ 0x75ED91FBCF97L;
        return (boolean)dZ.c("x", (Object)((Boolean)((Object)dZ.c("x", (Object)this.c, (long)-2990096141953904337L, (long)l))), (long)-2986311386464802767L, (long)l);
    }

    private boolean lambda$new$3(String string) {
        long l = x ^ 0x6A6D19294893L;
        return (boolean)dZ.c("x", (Object)((Boolean)((Object)dZ.c("x", (Object)this.h, (long)5874124267691497003L, (long)l))), (long)5875616541455494965L, (long)l);
    }

    private boolean lambda$new$4(Boolean bl) {
        Object object;
        block8: {
            block7: {
                CallSite callSite;
                long l;
                block6: {
                    l = x ^ 0x75B53CA65B4DL;
                    callSite = dZ.c("\u00a2", (long)4780696986882195996L, (long)l);
                    try {
                        try {
                            object = dZ.c("x", (Object)((Boolean)((Object)dZ.c("x", (Object)this.h, (long)4781427790363739637L, (long)l))), (long)4779583389882793195L, (long)l);
                            if (callSite != null) break block6;
                            if (object == false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw dZ.c("\u00a2", (Object)matchException, (long)4780255983002924917L, (long)l);
                        }
                        object = dZ.c("x", (String)((Object)dZ.c("x", (Object)this.i, (long)4781427790363739637L, (long)l)), (Object)dZ.b("b", (int)7274, (long)(0x2786A02154B18189L ^ l)), (long)4781399179246595029L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw dZ.c("\u00a2", (Object)matchException, (long)4780255983002924917L, (long)l);
                    }
                }
                try {
                    if (callSite != null) break block8;
                    if (object == false) break block7;
                }
                catch (MatchException matchException) {
                    throw dZ.c("\u00a2", (Object)matchException, (long)4780255983002924917L, (long)l);
                }
                object = 1;
                break block8;
            }
            object = 0;
        }
        return (boolean)object;
    }

    private boolean lambda$new$5(Boolean bl) {
        long l = x ^ 0x370E2957C6D5L;
        return (boolean)dZ.c("x", (Object)((Boolean)((Object)dZ.c("x", (Object)this.h, (long)-2322932146840381331L, (long)l))), (long)-2320409897509609101L, (long)l);
    }

    private boolean lambda$new$6(String string) {
        long l = x ^ 0x7DEE43BC1138L;
        return (boolean)dZ.c("x", (Object)((Boolean)((Object)dZ.c("x", (Object)this.l, (long)589412335653064576L, (long)l))), (long)585878749867177630L, (long)l);
    }

    private boolean lambda$new$8(Boolean bl) {
        Object object;
        block8: {
            block7: {
                CallSite callSite;
                long l;
                block6: {
                    l = x ^ 0x34AEDA5D73D2L;
                    callSite = dZ.c("\u00a2", (long)7694175179657702019L, (long)l);
                    try {
                        try {
                            object = dZ.c("x", (Object)((Boolean)((Object)dZ.c("x", (Object)this.l, (long)7693355590075346282L, (long)l))), (long)7695311316611306612L, (long)l);
                            if (callSite != null) break block6;
                            if (object == false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw dZ.c("\u00a2", (Object)matchException, (long)7694857801451446250L, (long)l);
                        }
                        object = dZ.c("x", (String)((Object)dZ.c("x", (Object)this.m, (long)7693355590075346282L, (long)l)), (Object)dZ.b("b", (int)7274, (long)(0x2786E13AB24AA916L ^ l)), (long)7693749205464859466L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw dZ.c("\u00a2", (Object)matchException, (long)7694857801451446250L, (long)l);
                    }
                }
                try {
                    if (callSite != null) break block8;
                    if (object == false) break block7;
                }
                catch (MatchException matchException) {
                    throw dZ.c("\u00a2", (Object)matchException, (long)7694857801451446250L, (long)l);
                }
                object = 1;
                break block8;
            }
            object = 0;
        }
        return (boolean)object;
    }

    private boolean lambda$new$7(Integer n) {
        long l = x ^ 0x656007995780L;
        return (boolean)dZ.c("x", (Object)((Boolean)((Object)dZ.c("x", (Object)this.l, (long)5662744278551546168L, (long)l))), (long)5663677922610589734L, (long)l);
    }

    private static boolean lambda$onTick$9(class_2338 class_23382) {
        boolean bl;
        long l = x ^ 0x6657E185B0E9L;
        try {
            bl = dZ.c("x", (Object)dZ.c("x", (Object)dZ.c("O", (Object)b, (long)-6197880045107653167L, (long)l), (Object)class_23382, (long)-6198919947187545618L, (long)l), (long)-6197785720623572563L, (long)l) != dZ.c("o", (long)-6200100113148552463L, (long)l);
        }
        catch (MatchException matchException) {
            throw dZ.c("\u00a2", (Object)matchException, (long)-6200626969949709103L, (long)l);
        }
        return bl;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dZ.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(dZ.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


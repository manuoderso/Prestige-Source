/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1743
 *  net.minecraft.class_2886
 *  net.minecraft.class_310
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.A;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bh_0;
import dev.zprestige.prestige.bl_0;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dQ;
import dev.zprestige.prestige.dS;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.eb_0;
import dev.zprestige.prestige.ee_0;
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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1743;
import net.minecraft.class_2886;
import net.minecraft.class_310;

/*
 * Renamed from dev.zprestige.prestige.fm
 */
public class fm_0
extends dV {
    private dS a;
    private dS c;
    private dQ d;
    private dO e;
    private f5 f;
    private long g;
    private static final long k;
    private static final String[] l;
    private static final String[] m;
    private static final Map n;
    private static final long o;
    private static final Object[] p;
    private static final String[] q;

    public fm_0() {
        long l = k ^ 0x1A8C78249E5AL;
        long l2 = l ^ 0xF81015C1E60L;
        this.f = new f5(l2);
        this.g = o;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    fm_0.k = hc.a(8836384530224783200L, 6647638824461808307L, MethodHandles.lookup().lookupClass()).a(95974136075259L);
                    fm_0.p = new Object[86];
                    fm_0.q = new String[86];
                    fm_0.f();
                    fm_0.n = new HashMap<K, V>(13);
                    var5 = fm_0.k ^ 3644444342916L;
                    var7_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var5 >>> 56);
                    for (var8_2 = 1; var8_2 < 8; ++var8_2) {
                        v2 = v2;
                        v2[var8_2] = (byte)(var5 << var8_2 * 8 >>> 56);
                    }
                    var7_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var14_3 = new String[11];
                    var12_4 = 0;
                    var11_5 = "\u00ff\u0012yL\u00c3Y\u00c9\u00d2\u00ad\u00d8\u00aa\u00c5+\u008d'\u0015\u0018\u00b1W\u0007u\u007f'\u001e\u0001\u000ex\u0019\u00f7|\u0080\u0080\u0019\u0094\u00b7Y\u00b6K\u00e1\u001fa \u00e4\u00acJ9S\u009el\u0092IY\u001c0\u00d3\u001d\u0003(\u00d1G\u0082#\u0019\u000f\u00c9\u0011\u00cdI\fy\u000f:KC\u0010\u008d^-\u0000\u001d\u0001`\u00f9!_\u008d\u0086\u00e2\u00e1\u001e\u00c8(\u00d8\u00e7\u00d7\\\u0010\u00c8\u00b2v\u00d6\u0003\u00b8M\u00d5\u00f7F\u00b4!\u0095\u008b\u0084t\u0001\u00ab\u0004\u0085\u00b8\u00a9/\u009c\u00a7\u0004\u00f0\u0090N\u00da\u00a6c\u00b1\r7(\u00be\u00e9|\u00bc^\u00cbn\u00bd\u00e8\u00b8\u00f6\u00a6\u00e6\u00f8\u001a\u00dc\u00f8\u00c9k\u00ae\u009f\u00f8\u0006\u00ad\n!T;\u00e0\u00e0\u00f6\u0087\u00e4%\u000bu<kB\u00d4\u0010\u008daU]1\u00a6F\u00f0\u00e2e2?\u009d\u00fd\u00c2\u001b \u001b\u0088\u00a34\u00e99\u00eaV\u00f0\u00a4ZrO`\u00e1x`[l\u00bb\u00b5\u0010\u0084\u007fE\u00f9A\u00d3\u00b2or\u008e x_\u0004y\u00b8K\u0003\u0091\"\u009d\u00abG\u00da\u00f3\u00e76E\u00c9T\u00cf\u00de\u00fb\u0018Bk\u00e2\u000e0\t\u00d99/";
                    var13_6 = "\u00ff\u0012yL\u00c3Y\u00c9\u00d2\u00ad\u00d8\u00aa\u00c5+\u008d'\u0015\u0018\u00b1W\u0007u\u007f'\u001e\u0001\u000ex\u0019\u00f7|\u0080\u0080\u0019\u0094\u00b7Y\u00b6K\u00e1\u001fa \u00e4\u00acJ9S\u009el\u0092IY\u001c0\u00d3\u001d\u0003(\u00d1G\u0082#\u0019\u000f\u00c9\u0011\u00cdI\fy\u000f:KC\u0010\u008d^-\u0000\u001d\u0001`\u00f9!_\u008d\u0086\u00e2\u00e1\u001e\u00c8(\u00d8\u00e7\u00d7\\\u0010\u00c8\u00b2v\u00d6\u0003\u00b8M\u00d5\u00f7F\u00b4!\u0095\u008b\u0084t\u0001\u00ab\u0004\u0085\u00b8\u00a9/\u009c\u00a7\u0004\u00f0\u0090N\u00da\u00a6c\u00b1\r7(\u00be\u00e9|\u00bc^\u00cbn\u00bd\u00e8\u00b8\u00f6\u00a6\u00e6\u00f8\u001a\u00dc\u00f8\u00c9k\u00ae\u009f\u00f8\u0006\u00ad\n!T;\u00e0\u00e0\u00f6\u0087\u00e4%\u000bu<kB\u00d4\u0010\u008daU]1\u00a6F\u00f0\u00e2e2?\u009d\u00fd\u00c2\u001b \u001b\u0088\u00a34\u00e99\u00eaV\u00f0\u00a4ZrO`\u00e1x`[l\u00bb\u00b5\u0010\u0084\u007fE\u00f9A\u00d3\u00b2or\u008e x_\u0004y\u00b8K\u0003\u0091\"\u009d\u00abG\u00da\u00f3\u00e76E\u00c9T\u00cf\u00de\u00fb\u0018Bk\u00e2\u000e0\t\u00d99/".length();
                    var10_7 = 16;
                    var9_8 = -1;
lbl32:
                    // 2 sources

                    while (true) {
                        v3 = ++var9_8;
                        v4 = var11_5.substring(v3, v3 + var10_7);
                        v5 = -1;
                        break block12;
                        break;
                    }
lbl37:
                    // 1 sources

                    while (true) {
                        var14_3[var12_4++] = fm_0.b(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        var11_5 = "\u00c6\u00a2\t!\u00d6\u0002\u0080\t\u00e2\u00bd+\u0012~\u00e0\u00e2= \u00a2|\u00acN\u008e\u00c8\u00d9\u00e0u\u009dZib\u009f\u0089\u00be\u00a8\u00ae\u00ca|C\u00c3~V\u00fc\u00ad\u00cdM\u00b0r\u00a9|";
                        var13_6 = "\u00c6\u00a2\t!\u00d6\u0002\u0080\t\u00e2\u00bd+\u0012~\u00e0\u00e2= \u00a2|\u00acN\u008e\u00c8\u00d9\u00e0u\u009dZib\u009f\u0089\u00be\u00a8\u00ae\u00ca|C\u00c3~V\u00fc\u00ad\u00cdM\u00b0r\u00a9|".length();
                        var10_7 = 16;
                        var9_8 = -1;
lbl46:
                        // 2 sources

                        while (true) {
                            v6 = ++var9_8;
                            v4 = var11_5.substring(v6, v6 + var10_7);
                            v5 = 0;
                            break block12;
                            break;
                        }
                        break;
                    }
lbl51:
                    // 1 sources

                    while (true) {
                        var14_3[var12_4++] = fm_0.b(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        break block13;
                        break;
                    }
                }
                var15_9 = var7_1.doFinal(v4.getBytes("ISO-8859-1"));
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
            fm_0.l = var14_3;
            fm_0.m = new String[11];
            var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
            v7 = SecretKeyFactory.getInstance("DES");
            v8 = new byte[8];
            v9 = v8;
            v8[0] = (byte)(var5 >>> 56);
            for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                v9 = v9;
                v9[var1_11] = (byte)(var5 << var1_11 * 8 >>> 56);
            }
            break block14;
lbl83:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
        var2_12 = 5317968904702692530L;
        var4_13 = var0_10.doFinal(new byte[]{(byte)(var2_12 >>> 56), (byte)(var2_12 >>> 48), (byte)(var2_12 >>> 40), (byte)(var2_12 >>> 32), (byte)(var2_12 >>> 24), (byte)(var2_12 >>> 16), (byte)(var2_12 >>> 8), (byte)var2_12});
        ** while (true)
        fm_0.o = ((long)var4_13[0] & 255L) << 56 | ((long)var4_13[1] & 255L) << 48 | ((long)var4_13[2] & 255L) << 40 | ((long)var4_13[3] & 255L) << 32 | ((long)var4_13[4] & 255L) << 24 | ((long)var4_13[5] & 255L) << 16 | ((long)var4_13[6] & 255L) << 8 | (long)var4_13[7] & 255L;
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x153E;
        if (m[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])fm_0.n.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    fm_0.n.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/fm", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = fm_0.l[n2].getBytes("ISO-8859-1");
            fm_0.m[n2] = fm_0.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return m[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = fm_0.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fm" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fm" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fm_0.m(l, l2);
            object = p[n];
            try {
                if (!(object instanceof String)) break block2;
                fm_0.p[n] = clazz = Class.forName(q[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fm_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fm_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fm_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fm_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = p;
        p[0] = "\u001f\u0001PI\u0016\u001a\t\u0001U\u0013\u0005\r\u001eJV\u0015\t\u0019\u000f\rA\u0002B\u000b3";
        objectArray[1] = "7NFO\u0002OBnM@\u0013\u0000?v^G\u001aIW";
        objectArray[2] = "Pb9p\u0014kPb.,\u0018dJ).2\u0018qMX~oI";
        objectArray[3] = "`<Ur\")`<B..&zwB0.3}\u0006\u0016hy";
        objectArray[4] = ",<Q1{m:<Tkhz-wWmdn<0@z/y\u0019";
        objectArray[5] = "Dty*\u0010U1Tr%\u0001\u001aPZy.\u0005@$";
        objectArray[6] = Void.TYPE;
        fm_0.q[6] = "java/lang/Void";
        objectArray[7] = "7\u0016zAWx!\u0016\u007f\u001bDo6]|\u001dH{'\u001ak\n\u0003k!";
        objectArray[8] = "\u000fO>\u0013i(zo5\u001cxg\u001ba>\u0017|=o";
        objectArray[9] = Boolean.TYPE;
        fm_0.q[9] = "java/lang/Boolean";
        objectArray[10] = "=nlsD!+ni)W6<%j/[\"-b}8\u001074";
        objectArray[11] = "\r$mS1 \u0006+|\u001cR-\u0013&swg/\u00025o[p\"";
        objectArray[12] = "yNSKD:oNV\u0011W-x\u0005U\u0017[9iBB\u0000\u0010,(";
        objectArray[13] = "\t%0{O\u0018|\u0005;t^W\u001d\u000b0\u007fZ\ri";
        objectArray[14] = "U\u0015P4aCK\u001dJ{\u001cSK";
        objectArray[15] = "\\]z/\u001f;WRk`~5\\Yo:";
        objectArray[16] = "{=Hy\u0001\u0013{=_%\r\u001cav_;\r\tf\u0007\reUM";
        objectArray[17] = Float.TYPE;
        fm_0.q[17] = "java/lang/Float";
        objectArray[18] = "j\u001bfy.\u001d|\u001bc#=\nkP`%1\u001ez\u0017w2z\u000b:";
        objectArray[19] = "\u001cm\u0005\u0011\u000b:iM\u000e\u001e\u001au\bC\u0005\u0015\u001e/|";
        objectArray[20] = "(M\nAt\n(M\u001d\u001dx\u00052\u0006\u001d\u0003x\u00105wH\\!";
        objectArray[21] = "\u0019t\u0014\u001e\tv\u0019t\u0003B\u0005y\u0003?\u0003\\\u0005l\u0004NQ\u0007]&";
        objectArray[22] = "tp]~b>tpJ\"n1n;J<n$iJ\u0018g6e";
        objectArray[23] = "Q}+JdyQ}<\u0016hvK6<\bhcLGnR<'";
        objectArray[24] = "p\u0005\bX3\u001bn\r\u0012\u0017X\u0000o\t-\\i";
        objectArray[25] = "O]MZaPDR\\\u0015\fPDOH";
        objectArray[26] = "\u0004q\u0003C\\6\u0004q\u0014\u001fP9\u001e:\u0014\u0001P,\u0019KC^\u0006";
        objectArray[27] = "\u001a!\u001d[\u007f\u0005\f!\u0018\u0001l\u0012\u001bj\u001b\u0007`\u0006\n-\f\u0010+\u0013M";
        objectArray[28] = "]p8u\u0011T(P3z\u0000\u001bI^8q\u0004A=";
        objectArray[29] = "\u007fv_2nk\u007fvHnbde=HpbqbL\u001a$30";
        objectArray[30] = "TI15\u007f%!i::nj@g11j04";
        objectArray[31] = "K)\u0019\u0010BF>\t\u0012\u001fS\t_\u0007\u0019\u0014WS+";
        objectArray[32] = "`)\u001efZHk&\u000f)=J~-\u000fb\u0006";
        objectArray[33] = "i\u001az,\u0002\u001b\u001c:q#\u0013T}4z(\u0017\u000e\t";
        objectArray[34] = "\u007fGNHdq\ngEGu>kiNLqd\u001f";
        objectArray[35] = "G\u0000\f<|-Q\u0000\tfo:FK\n`c.W\f\u001dw(9p";
        objectArray[36] = "{<Er^Q\u000e\u001cN}O\u001eo\u0012EvKD\u001b";
        objectArray[37] = Integer.TYPE;
        fm_0.q[37] = "java/lang/Integer";
        objectArray[38] = "\u007fu:,3e\nU1#\"*k[:(&p\u001f";
        objectArray[39] = "+b\u007fsR@=bz)AW*)y/MC;nn8\u0006V~";
        objectArray[40] = "4\u000bMgKhA+FhZ' %Mc^}T";
        objectArray[41] = "\u0016yb$[\t\u0000yg~H\u001e\u00172dxD\n\u0006uso\u000f\u001d9";
        objectArray[42] = "\u001b8W/\rc\u00107F`ec\u001e8U";
        objectArray[43] = "6lcS%?CLh\\4p\"BcW0*V";
        objectArray[44] = Long.TYPE;
        fm_0.q[44] = "java/lang/Long";
        objectArray[45] = "a,3\tSPw,6S@G`g5ULSq \"B\u0007Bm";
        objectArray[46] = "0~[h\u0006\u0012E^Pg\u0017]$P[l\u0013\u0007P";
        objectArray[47] = "JjgRy/Jjp\u000eu P!p\u0010u5WP!I-p";
        objectArray[48] = "\u0013@h\u0011\u0010(N\u0013e\u0019!'DQaOM\u0015\u0014\u0012:\u0019!(\u0019D0\u0015Kx\u0016\u0012p(K<M\u0010nUZ&\u0015\u0016\u0001";
        objectArray[49] = "e\u001a\u0017i6\u0011t\u0019P\u0016%/sN\nn+@s\u001c\u0000\u0016";
        objectArray[50] = "Z\u000fO\u001bGk\u0007\\B\u0013vd\r\u001eFE\u001aV^Z\u0018\u001dvk\u001e\u0006\u001bM\u000bz\u0004^\u001d\"";
        objectArray[51] = "\u001dZ\u007f(ltC\u0012uk\u001c F\rt|Kw\u0018Z,\u0010&#NY!z{pCQ";
        objectArray[52] = "E+B\"_4\u00139\u0012&'2./A{Y&C-E#\u001f[\u0010,^8@g\u0016n\u0016}'";
        objectArray[53] = "k\u001d\u0006k-\u001f5U\f(]K0J\r?\n\u001co\u0017VS0\u001fmG\bb C1\\";
        objectArray[54] = "\u0006==z-\u0019[n0r\u001c\u0016Q,4$p$\u0002hoy\u001c\u0019B4i,a\bXloC";
        objectArray[55] = "\u000f_1V2Y\u0019\u00072Y\tY\f\u001a1Lek^Wi\u001a\tR\u001d\u0017j\u001b0C^\u001e2+";
        objectArray[56] = "WfV\u000e\\\u0003F|\f\u001f=\u0017UyU\tQ%\u0006=\tQ=\u001c\u0001eHUX\nYfGn";
        objectArray[57] = "\u0017|Rz\u0015GE<P*.\u001d\u001fcGP@{\u0018iRl\\B\u0012hRg.\u0014\u0001}G,\u0012FA\u007f\u0017\u0017";
        objectArray[58] = ">}.GB\u001f=44X9\u0015\u00052:\u0011G\u0002h0>I\u0001\u007f9}hE\u0006\u0006o5mJ9";
        objectArray[59] = "\u001c03]]MBx9\u001e-\u0019Gg8\tzN\u00197aeL\u001bIs`\u0005C\u0007\u001c0";
        objectArray[60] = ",]\u000bUu(/Y\f\\\u000f>.H\u000fIX`q\u001eW%a,>\u001e[\u001cpo7F";
        objectArray[61] = "'}xk\"\u0019z.uc\u0013\u0016plq5\u007f$#)(o\u0013Ma`j5/K#(/R";
        objectArray[62] = "g\u0007He`?:TEmQ00\u0016A;=\u0002cR\u001dcQ;d\n\\g4-<\tS\\";
        objectArray[63] = "\u0013X7\u0018+\u0013@\u0014v\u0010\u0014\u0000-\u00163\u0014vT]@*L*i\u0012T+\u0013)\u0019DMsO\u0014";
        objectArray[64] = "Wa93\u0000F\\ch8jWgb:a\u0014C\n`>9R>[-h5UG\rem:j";
        objectArray[65] = "T\u00041+Z{\nL;h*$\u0003B>tF\u0016W\u0003`\"*\u007f\u0012N%t\u0016yP\u0006`\u0013";
        objectArray[66] = "4\u0010oeX\u00112L\u007f,*FVWymTR;U}5\u0012/=Sz4R@kA*0*";
        objectArray[67] = "wXSf7\u0015t\\ToM\u0003uMWz\u001a].\u001d\u000e\u0016#\u0011e\u001b\u0003/2RlC";
        objectArray[68] = "lWU&b.oSR/\u00188nBQ:Of5\u001f\u0005Vv*~\u0014\u0005ogiwL";
        objectArray[69] = "/mY\f \u0001|!\u0018\u0004\u001f\u0019\u0011cO]a\u0006|aK\u0005'{-,\u001d\t \u0002{d\u0018\u0006\u001f";
        objectArray[70] = "Te\u000el3a\b7UrMri\"\u0000;3f\u0004 \u0004cu\u001b\f:Wbt Y;\flM";
        objectArray[71] = "jkU2\u0016{<y\u00056n~\u0001oVk\u0010ilmR3V\u0014?lI(\t(9.\u0001mn";
        objectArray[72] = "j!|80{a#-3ZiZ\"\u007fj$~7 {2b\u0003d!`)=?bc(lZ";
        objectArray[73] = "A:\tO:fK!\u001cLP3&=\n\u001a.'K?\u000eBhZ\u0018>\u0015Y7f\u001e|]\u001cP";
        objectArray[74] = "\u0018yS\u001c|\u001bMx\b\u0012EA\u001bb5\u0014!]\u0010\u001e\u0012G\"^Dw\u0006\r:\u001d}";
        objectArray[75] = "!WXw@&o]\flxr_O]/\u0006f2MYw@\u001b/\u000bWkGw#\u0001Iwx";
        objectArray[76] = "b*I!D_>x\u0012?:L_mGvDX2oC.\u0002%c\"\u0015\"\u0005\\5j\u0010-:";
        objectArray[77] = "\"4M!\u0005:~f\u0016?{$\u001fsCv\u0005=rqG.C@!p\\5\u001c|'2\u0014p{";
        objectArray[78] = "\u0014#9R\u00155\u001eb;Bo1nb0\u0017\u0011%\u0003`4OWX\u0001~<O\u000e)\u0010df^o";
        objectArray[79] = ":SH\u001cs,pH]\b\u001d$AGZ\t#w3HZ\u0016yM";
        objectArray[80] = "b%:\tugoio\u0017H`e\u001bj\u0012191ie\u0012.c\u000br=V.:k\u007fq\u00030\u0007";
        objectArray[81] = "Sal\u0015R\u0001T4y\u0014-\u000eKl\u007fYs\tKv{%G\u001eK6yXV\u0004\u00130\u0016";
        objectArray[82] = "zCb\u00114m&\u00119\u000fJ~G\u0004lF4j*\u0006h\u001er\u0017y\u0007s\u0005-+\u007fE;@J";
        objectArray[83] = "%s* e\u00025/v;\u0004V%5v'hdwt,~<352y$hL&5f~\u0004";
        objectArray[84] = "X8\u0014\u0016;H\nx\u0016F\u0000\u001d[-l\u0012}\r\t{\u001e\u001d}\u0012SAR\u0007p\u000fP}TE8J7";
        Object[] objectArray2 = objectArray;
        objectArray[85] = "v\u0016 J=\u000f$V\"\u001a\u0006Rb\"=_zB\u0019Q$W}T%Wf\u001f83";
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = fm_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f4' || c == '\u00ea' || c == 'X' || c == 'V') {
                field = fm_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f4' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ea' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'X' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fm_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c7' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'I' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @bP
    public void a(bl_0 bl_02) {
        Object object;
        CallSite callSite;
        long l;
        long l2;
        block112: {
            reference var27_16;
            CallSite callSite2;
            CallSite callSite3;
            block111: {
                long l3;
                block109: {
                    long l4;
                    block110: {
                        CallSite callSite4;
                        long l5;
                        long l6;
                        block107: {
                            block108: {
                                block105: {
                                    block106: {
                                        block103: {
                                            block104: {
                                                block101: {
                                                    block102: {
                                                        block99: {
                                                            CallSite callSite5;
                                                            block100: {
                                                                block98: {
                                                                    long l7;
                                                                    block96: {
                                                                        block97: {
                                                                            CallSite callSite6;
                                                                            long l8;
                                                                            long l9;
                                                                            block95: {
                                                                                CallSite callSite7;
                                                                                block93: {
                                                                                    reference var23_13;
                                                                                    block94: {
                                                                                        class_310 class_3102;
                                                                                        block91: {
                                                                                            block92: {
                                                                                                block90: {
                                                                                                    Object object2;
                                                                                                    block88: {
                                                                                                        long l10;
                                                                                                        block89: {
                                                                                                            block86: {
                                                                                                                long l11 = l2 = k ^ 0x3E5B2175E0E1L;
                                                                                                                l = l11 ^ 0x2A375E745D53L;
                                                                                                                l3 = l11 ^ 0x489FB5734379L;
                                                                                                                l9 = l11 ^ 0x63351932A50L;
                                                                                                                l10 = l11 ^ 0x6D27F4D9F92BL;
                                                                                                                l6 = l11 ^ 0x7C099DA2FB55L;
                                                                                                                l4 = l11 ^ 0x173AAA2F13ACL;
                                                                                                                l8 = l11 ^ 0x33D63DF1255EL;
                                                                                                                l7 = l11 ^ 0x72413825918L;
                                                                                                                l5 = l11 ^ 0x5484ED62F7A8L;
                                                                                                                callSite3 = fm_0.c("I", (long)-7256854926158957706L, (long)l2);
                                                                                                                try {
                                                                                                                    block87: {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    Object[] objectArray = new Object[2];
                                                                                                                                    objectArray[1] = l4;
                                                                                                                                    objectArray[0] = fm_0.b("q", (int)1223, (long)(0x21A5DEF4B3F58ABEL ^ l2));
                                                                                                                                    object2 = fm_0.c("\u00c7", (Object)this.c, (Object)objectArray, (long)-7254035273461815258L, (long)l2);
                                                                                                                                    if (callSite3 != null) break block86;
                                                                                                                                    if (object2 == false) break block87;
                                                                                                                                }
                                                                                                                                catch (MatchException matchException) {
                                                                                                                                    throw fm_0.c("I", (Object)matchException, (long)-7257056995492262218L, (long)l2);
                                                                                                                                }
                                                                                                                                object2 = eb_0.a;
                                                                                                                                if (callSite3 != null) break block86;
                                                                                                                            }
                                                                                                                            catch (MatchException matchException) {
                                                                                                                                throw fm_0.c("I", (Object)matchException, (long)-7257056995492262218L, (long)l2);
                                                                                                                            }
                                                                                                                            if (object2 != false) return;
                                                                                                                        }
                                                                                                                        catch (MatchException matchException) {
                                                                                                                            throw fm_0.c("I", (Object)matchException, (long)-7257056995492262218L, (long)l2);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    Object[] objectArray = new Object[2];
                                                                                                                    objectArray[1] = l4;
                                                                                                                    objectArray[0] = fm_0.b("q", (int)27013, (long)(0x619E15D98B7367F8L ^ l2));
                                                                                                                    object2 = fm_0.c("\u00c7", (Object)this.c, (Object)objectArray, (long)-7254035273461815258L, (long)l2);
                                                                                                                }
                                                                                                                catch (MatchException matchException) {
                                                                                                                    throw fm_0.c("I", (Object)matchException, (long)-7257056995492262218L, (long)l2);
                                                                                                                }
                                                                                                            }
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        if (callSite3 != null) break block88;
                                                                                                                        if (object2 == false) break block89;
                                                                                                                    }
                                                                                                                    catch (MatchException matchException) {
                                                                                                                        throw fm_0.c("I", (Object)matchException, (long)-7257056995492262218L, (long)l2);
                                                                                                                    }
                                                                                                                    object2 = ee_0.a;
                                                                                                                    if (callSite3 != null) break block88;
                                                                                                                }
                                                                                                                catch (MatchException matchException) {
                                                                                                                    throw fm_0.c("I", (Object)matchException, (long)-7257056995492262218L, (long)l2);
                                                                                                                }
                                                                                                                if (object2 == false) break block89;
                                                                                                                return;
                                                                                                            }
                                                                                                            catch (MatchException matchException) {
                                                                                                                throw fm_0.c("I", (Object)matchException, (long)-7257056995492262218L, (long)l2);
                                                                                                            }
                                                                                                        }
                                                                                                        Object[] objectArray = new Object[2];
                                                                                                        objectArray[1] = l10;
                                                                                                        objectArray[0] = this.d;
                                                                                                        object2 = fm_0.c("\u00c7", (Object)this.f, (Object)objectArray, (long)-7254116435548297127L, (long)l2);
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (object2 == false) return;
                                                                                                                class_3102 = b;
                                                                                                                if (callSite3 != null) break block90;
                                                                                                            }
                                                                                                            catch (MatchException matchException) {
                                                                                                                throw fm_0.c("I", (Object)matchException, (long)-7257056995492262218L, (long)l2);
                                                                                                            }
                                                                                                            if (fm_0.c("\u00f4", (Object)class_3102, (long)-7257283897579913001L, (long)l2) != null) return;
                                                                                                        }
                                                                                                        catch (MatchException matchException) {
                                                                                                            throw fm_0.c("I", (Object)matchException, (long)-7257056995492262218L, (long)l2);
                                                                                                        }
                                                                                                        class_3102 = b;
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw fm_0.c("I", (Object)matchException, (long)-7257056995492262218L, (long)l2);
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    try {
                                                                                                        if (callSite3 != null) break block91;
                                                                                                        if (fm_0.c("\u00c7", (Object)class_3102, (long)-7253490464364822743L, (long)l2) != false) break block92;
                                                                                                        return;
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw fm_0.c("I", (Object)matchException, (long)-7257056995492262218L, (long)l2);
                                                                                                    }
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw fm_0.c("I", (Object)matchException, (long)-7257056995492262218L, (long)l2);
                                                                                                }
                                                                                            }
                                                                                            class_3102 = b;
                                                                                        }
                                                                                        var23_13 = fm_0.c("\u00c7", (Object)fm_0.c("\u00f4", (Object)class_3102, (long)-7256618983295082230L, (long)l2), (long)-7254455227510081485L, (long)l2);
                                                                                        try {
                                                                                            reference cfr_temp_0 = var23_13 - this.g;
                                                                                            callSite7 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                                                                            if (callSite3 != null) break block93;
                                                                                            if (callSite7 != false) break block94;
                                                                                            return;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw fm_0.c("I", (Object)matchException, (long)-7257056995492262218L, (long)l2);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        this.g = (long)var23_13;
                                                                                        callSite6 = fm_0.c("X", (long)-7253301004206356785L, (long)l2);
                                                                                        if (callSite3 != null) break block95;
                                                                                        Object[] objectArray = new Object[2];
                                                                                        objectArray[1] = l7;
                                                                                        objectArray[0] = callSite6;
                                                                                        callSite7 = fm_0.c("I", (Object)objectArray, (long)-7253764047188254066L, (long)l2);
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw fm_0.c("I", (Object)matchException, (long)-7257056995492262218L, (long)l2);
                                                                                    }
                                                                                }
                                                                                if (callSite7 != false) {
                                                                                    return;
                                                                                }
                                                                                callSite6 = fm_0.c("X", (long)-7253301004206356785L, (long)l2);
                                                                            }
                                                                            Object[] objectArray = new Object[2];
                                                                            objectArray[1] = l9;
                                                                            objectArray[0] = callSite6;
                                                                            callSite = fm_0.c("I", (Object)objectArray, (long)-7253147595032008203L, (long)l2);
                                                                            try {
                                                                                if (callSite == null) {
                                                                                    return;
                                                                                }
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw fm_0.c("I", (Object)matchException, (long)-7257056995492262218L, (long)l2);
                                                                            }
                                                                            Object[] objectArray2 = new Object[1];
                                                                            objectArray2[0] = l8;
                                                                            callSite2 = fm_0.c("I", (Object)objectArray2, (long)-7253684958684565995L, (long)l2);
                                                                            try {
                                                                                if (callSite2 == null) {
                                                                                    return;
                                                                                }
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw fm_0.c("I", (Object)matchException, (long)-7257056995492262218L, (long)l2);
                                                                            }
                                                                            var27_16 = fm_0.c("\u00c7", (Object)fm_0.c("\u00f4", (Object)b, (long)-7256706419337118650L, (long)l2), (long)-7256530699465245456L, (long)l2) + fm_0.c("\u00c7", (Object)fm_0.c("\u00f4", (Object)b, (long)-7256706419337118650L, (long)l2), (long)-7256828798736738334L, (long)l2);
                                                                            try {
                                                                                reference cfr_temp_1 = fm_0.c("\u00c7", (Object)fm_0.c("\u00f4", (Object)b, (long)-7256706419337118650L, (long)l2), (Object)callSite2, (long)-7256941003341726421L, (long)l2) - 10.0f;
                                                                                callSite5 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 > 0 ? 1 : -1);
                                                                                if (callSite3 != null) break block96;
                                                                                if (callSite5 <= 0) break block97;
                                                                                return;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw fm_0.c("I", (Object)matchException, (long)-7257056995492262218L, (long)l2);
                                                                            }
                                                                        }
                                                                        Object[] objectArray = new Object[2];
                                                                        objectArray[1] = l4;
                                                                        objectArray[0] = fm_0.b("q", (int)30447, (long)(0x133CC2B2AB8EF891L ^ l2));
                                                                        callSite5 = fm_0.c("\u00c7", (Object)this.c, (Object)objectArray, (long)-7254035273461815258L, (long)l2);
                                                                    }
                                                                    try {
                                                                        try {
                                                                            if (callSite3 != null) break block98;
                                                                            if (callSite5 == false) break block99;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw fm_0.c("I", (Object)matchException, (long)-7257056995492262218L, (long)l2);
                                                                        }
                                                                        Object[] objectArray = new Object[2];
                                                                        objectArray[1] = l7;
                                                                        objectArray[0] = fm_0.c("X", (long)-7253330832792771367L, (long)l2);
                                                                        callSite5 = fm_0.c("I", (Object)objectArray, (long)-7253764047188254066L, (long)l2);
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw fm_0.c("I", (Object)matchException, (long)-7257056995492262218L, (long)l2);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        if (callSite3 != null) break block100;
                                                                        if (callSite5 == false) break block99;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw fm_0.c("I", (Object)matchException, (long)-7257056995492262218L, (long)l2);
                                                                    }
                                                                    callSite5 = fm_0.c("\u00c7", (Object)fm_0.c("\u00f4", (Object)b, (long)-7256706419337118650L, (long)l2), (long)-7257141685661002051L, (long)l2);
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw fm_0.c("I", (Object)matchException, (long)-7257056995492262218L, (long)l2);
                                                                }
                                                            }
                                                            if (callSite5 != false) {
                                                                return;
                                                            }
                                                        }
                                                        callSite4 = fm_0.c("I", A.class, (long)-7257415049094656838L, (long)l2);
                                                        try {
                                                            try {
                                                                Object[] objectArray = new Object[2];
                                                                objectArray[1] = l4;
                                                                objectArray[0] = fm_0.b("q", (int)2546, (long)(0x797FA7BA4D2B878AL ^ l2));
                                                                object = fm_0.c("\u00c7", (Object)this.a, (Object)objectArray, (long)-7254035273461815258L, (long)l2);
                                                                if (callSite3 != null) break block101;
                                                                if (object == false) break block102;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw fm_0.c("I", (Object)matchException, (long)-7257056995492262218L, (long)l2);
                                                            }
                                                            fm_0.c("\u00c7", (Object)callSite4, (Object)((Object)A.ANCHOR), (long)-7254386398033392814L, (long)l2);
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw fm_0.c("I", (Object)matchException, (long)-7257056995492262218L, (long)l2);
                                                        }
                                                    }
                                                    Object[] objectArray = new Object[2];
                                                    objectArray[1] = l4;
                                                    objectArray[0] = fm_0.b("q", (int)27284, (long)(0x144F66117D564E6L ^ l2));
                                                    object = fm_0.c("\u00c7", (Object)this.a, (Object)objectArray, (long)-7254035273461815258L, (long)l2);
                                                }
                                                try {
                                                    try {
                                                        if (callSite3 != null) break block103;
                                                        if (object == false) break block104;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw fm_0.c("I", (Object)matchException, (long)-7257056995492262218L, (long)l2);
                                                    }
                                                    fm_0.c("\u00c7", (Object)callSite4, (Object)((Object)A.CRYSTAL), (long)-7254386398033392814L, (long)l2);
                                                }
                                                catch (MatchException matchException) {
                                                    throw fm_0.c("I", (Object)matchException, (long)-7257056995492262218L, (long)l2);
                                                }
                                            }
                                            Object[] objectArray = new Object[2];
                                            objectArray[1] = l4;
                                            objectArray[0] = fm_0.b("q", (int)30112, (long)(0x3CE33F8B4AEBFBDFL ^ l2));
                                            object = fm_0.c("\u00c7", (Object)this.a, (Object)objectArray, (long)-7254035273461815258L, (long)l2);
                                        }
                                        try {
                                            try {
                                                if (callSite3 != null) break block105;
                                                if (object == false) break block106;
                                            }
                                            catch (MatchException matchException) {
                                                throw fm_0.c("I", (Object)matchException, (long)-7257056995492262218L, (long)l2);
                                            }
                                            fm_0.c("\u00c7", (Object)callSite4, (Object)((Object)A.OBSIDIAN), (long)-7254386398033392814L, (long)l2);
                                        }
                                        catch (MatchException matchException) {
                                            throw fm_0.c("I", (Object)matchException, (long)-7257056995492262218L, (long)l2);
                                        }
                                    }
                                    Object[] objectArray = new Object[2];
                                    objectArray[1] = l4;
                                    objectArray[0] = fm_0.b("q", (int)5612, (long)(0x2CF6970A0411B97L ^ l2));
                                    object = fm_0.c("\u00c7", (Object)this.a, (Object)objectArray, (long)-7254035273461815258L, (long)l2);
                                }
                                try {
                                    try {
                                        if (callSite3 != null) break block107;
                                        if (object == false) break block108;
                                    }
                                    catch (MatchException matchException) {
                                        throw fm_0.c("I", (Object)matchException, (long)-7257056995492262218L, (long)l2);
                                    }
                                    fm_0.c("\u00c7", (Object)callSite4, (Object)((Object)A.MACE), (long)-7254386398033392814L, (long)l2);
                                }
                                catch (MatchException matchException) {
                                    throw fm_0.c("I", (Object)matchException, (long)-7257056995492262218L, (long)l2);
                                }
                            }
                            object = fm_0.c("\u00c7", (Object)callSite4, (long)-7254337109290156495L, (long)l2);
                        }
                        try {
                            if (callSite3 != null) break block109;
                            if (object != false) break block110;
                        }
                        catch (MatchException matchException) {
                            throw fm_0.c("I", (Object)matchException, (long)-7257056995492262218L, (long)l2);
                        }
                        Object[] objectArray = new Object[4];
                        objectArray[3] = l6;
                        objectArray[2] = Float.valueOf((float)fm_0.c("\u00c7", (Object)((Float)((Object)fm_0.c("\u00c7", (Object)this.e, (long)-7253615080591588699L, (long)l2))), (long)-7254640777549317182L, (long)l2));
                        objectArray[1] = callSite4;
                        objectArray[0] = callSite2;
                        CallSite callSite8 = fm_0.c("I", (Object)objectArray, (long)-7253448023249287804L, (long)l2);
                        try {
                            try {
                                try {
                                    try {
                                        object = fm_0.c("\u00c7", (Object)callSite8, (Object)new Object[0], (long)-7256646489756784064L, (long)l2);
                                        if (callSite3 != null) break block109;
                                        if (object == false) break block110;
                                    }
                                    catch (MatchException matchException) {
                                        throw fm_0.c("I", (Object)matchException, (long)-7257056995492262218L, (long)l2);
                                    }
                                    Object[] objectArray3 = new Object[2];
                                    objectArray3[1] = l5;
                                    objectArray3[0] = Float.valueOf((float)var27_16);
                                    object = fm_0.c("\u00c7", (Object)callSite8, (Object)objectArray3, (long)-7253117028426112531L, (long)l2);
                                    if (callSite3 != null) break block109;
                                }
                                catch (MatchException matchException) {
                                    throw fm_0.c("I", (Object)matchException, (long)-7257056995492262218L, (long)l2);
                                }
                                if (object == false) break block110;
                            }
                            catch (MatchException matchException) {
                                throw fm_0.c("I", (Object)matchException, (long)-7257056995492262218L, (long)l2);
                            }
                            Object[] objectArray4 = new Object[2];
                            objectArray4[1] = l;
                            objectArray4[0] = (int)fm_0.c("\u00c7", (Object)callSite, (long)-7254014509704171771L, (long)l2);
                            fm_0.c("\u00c7", (Object)this, (Object)objectArray4, (long)-7253208535636556321L, (long)l2);
                            return;
                        }
                        catch (MatchException matchException) {
                            throw fm_0.c("I", (Object)matchException, (long)-7257056995492262218L, (long)l2);
                        }
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = l4;
                    objectArray[0] = fm_0.b("q", (int)22761, (long)(0x1E50E73529075699L ^ l2));
                    object = fm_0.c("\u00c7", (Object)this.a, (Object)objectArray, (long)-7254035273461815258L, (long)l2);
                }
                try {
                    try {
                        if (callSite3 != null) break block111;
                        if (object == false) return;
                    }
                    catch (MatchException matchException) {
                        throw fm_0.c("I", (Object)matchException, (long)-7257056995492262218L, (long)l2);
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = l3;
                    objectArray[0] = fm_0.c("\u00c7", (Object)callSite2, (long)-7257526249154844063L, (long)l2);
                    object = fm_0.c("I", (Object)objectArray, (long)-7254569962951479424L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw fm_0.c("I", (Object)matchException, (long)-7257056995492262218L, (long)l2);
                }
            }
            try {
                reference cfr_temp_2;
                block113: {
                    try {
                        try {
                            try {
                                if (callSite3 != null) break block112;
                                if (object != false) break block113;
                            }
                            catch (MatchException matchException) {
                                throw fm_0.c("I", (Object)matchException, (long)-7257056995492262218L, (long)l2);
                            }
                            object = fm_0.c("\u00c7", (Object)fm_0.c("\u00c7", (Object)callSite2, (long)-7257526249154844063L, (long)l2), (long)-7256449615045475148L, (long)l2) instanceof class_1743;
                            if (callSite3 != null) break block112;
                        }
                        catch (MatchException matchException) {
                            throw fm_0.c("I", (Object)matchException, (long)-7257056995492262218L, (long)l2);
                        }
                        if (object == false) return;
                    }
                    catch (MatchException matchException) {
                        throw fm_0.c("I", (Object)matchException, (long)-7257056995492262218L, (long)l2);
                    }
                }
                object = (cfr_temp_2 = var27_16 - 1.0f) == 0 ? 0 : (cfr_temp_2 < 0 ? -1 : 1);
            }
            catch (MatchException matchException) {
                throw fm_0.c("I", (Object)matchException, (long)-7257056995492262218L, (long)l2);
            }
        }
        try {
            if (object >= 0) return;
            Object[] objectArray = new Object[2];
            objectArray[1] = l;
            objectArray[0] = (int)fm_0.c("\u00c7", (Object)callSite, (long)-7254014509704171771L, (long)l2);
            fm_0.c("\u00c7", (Object)this, (Object)objectArray, (long)-7253208535636556321L, (long)l2);
            return;
        }
        catch (MatchException matchException) {
            throw fm_0.c("I", (Object)matchException, (long)-7257056995492262218L, (long)l2);
        }
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return fm_0.c("I", (Object)((Object)q_0.Crystal), (long)-2444289949130235192L, (long)l);
    }

    @bP
    public void a(bh_0 bh_02) {
        block36: {
            CallSite callSite;
            long l;
            long l2;
            block39: {
                CallSite callSite2;
                CallSite callSite3;
                long l3;
                block38: {
                    long l4;
                    block37: {
                        Object object;
                        block35: {
                            block33: {
                                long l5;
                                block34: {
                                    block32: {
                                        block30: {
                                            long l6 = l2 = k ^ 0x7BB6D607F20CL;
                                            l3 = l6 ^ 0x43DEA6E138BDL;
                                            l = l6 ^ 0x5B507C0B53DCL;
                                            l5 = l6 ^ 0x52D75D5D0141L;
                                            l4 = l6 ^ 0x42C9E4F04BF5L;
                                            callSite3 = fm_0.c("I", (long)-8527780259117768293L, (long)l2);
                                            try {
                                                block31: {
                                                    try {
                                                        try {
                                                            try {
                                                                Object[] objectArray = new Object[2];
                                                                objectArray[1] = l5;
                                                                objectArray[0] = fm_0.b("q", (int)19212, (long)(0x5ECA2A7FDC26579BL ^ l2));
                                                                object = fm_0.c("\u00c7", (Object)this.c, (Object)objectArray, (long)-8522718457864275253L, (long)l2);
                                                                if (callSite3 != null) break block30;
                                                                if (object == false) break block31;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw fm_0.c("I", (Object)matchException, (long)-8528545622576751525L, (long)l2);
                                                            }
                                                            object = eb_0.a;
                                                            if (callSite3 != null) break block30;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw fm_0.c("I", (Object)matchException, (long)-8528545622576751525L, (long)l2);
                                                        }
                                                        if (object != false) break block32;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw fm_0.c("I", (Object)matchException, (long)-8528545622576751525L, (long)l2);
                                                    }
                                                }
                                                Object[] objectArray = new Object[2];
                                                objectArray[1] = l5;
                                                objectArray[0] = fm_0.b("q", (int)12306, (long)(0x48209227A349AC83L ^ l2));
                                                object = fm_0.c("\u00c7", (Object)this.c, (Object)objectArray, (long)-8522718457864275253L, (long)l2);
                                            }
                                            catch (MatchException matchException) {
                                                throw fm_0.c("I", (Object)matchException, (long)-8528545622576751525L, (long)l2);
                                            }
                                        }
                                        try {
                                            try {
                                                try {
                                                    if (callSite3 != null) break block33;
                                                    if (object == false) break block34;
                                                }
                                                catch (MatchException matchException) {
                                                    throw fm_0.c("I", (Object)matchException, (long)-8528545622576751525L, (long)l2);
                                                }
                                                object = ee_0.a;
                                                if (callSite3 != null) break block33;
                                            }
                                            catch (MatchException matchException) {
                                                throw fm_0.c("I", (Object)matchException, (long)-8528545622576751525L, (long)l2);
                                            }
                                            if (object == false) break block34;
                                        }
                                        catch (MatchException matchException) {
                                            throw fm_0.c("I", (Object)matchException, (long)-8528545622576751525L, (long)l2);
                                        }
                                    }
                                    return;
                                }
                                Object[] objectArray = new Object[2];
                                objectArray[1] = l5;
                                objectArray[0] = fm_0.b("q", (int)30051, (long)(0x28F2F927334F69FFL ^ l2));
                                object = fm_0.c("\u00c7", (Object)this.a, (Object)objectArray, (long)-8522718457864275253L, (long)l2);
                            }
                            try {
                                try {
                                    if (callSite3 != null) break block35;
                                    if (object == false) break block36;
                                }
                                catch (MatchException matchException) {
                                    throw fm_0.c("I", (Object)matchException, (long)-8528545622576751525L, (long)l2);
                                }
                                object = fm_0.c("\u00c7", (Object)bh_02, (Object)new Object[0], (long)-8522585945760933150L, (long)l2) instanceof class_2886;
                            }
                            catch (MatchException matchException) {
                                throw fm_0.c("I", (Object)matchException, (long)-8528545622576751525L, (long)l2);
                            }
                        }
                        try {
                            try {
                                try {
                                    if (object == false) break block36;
                                    callSite2 = fm_0.c("\u00c7", (Object)fm_0.c("\u00c7", (Object)fm_0.c("\u00f4", (Object)b, (long)-8527642755492532565L, (long)l2), (long)-8528469670454231335L, (long)l2), (long)-8527939279358011815L, (long)l2);
                                    if (callSite3 != null) break block37;
                                }
                                catch (MatchException matchException) {
                                    throw fm_0.c("I", (Object)matchException, (long)-8528545622576751525L, (long)l2);
                                }
                                if (callSite2 != fm_0.c("X", (long)-8528615566538036806L, (long)l2)) break block36;
                            }
                            catch (MatchException matchException) {
                                throw fm_0.c("I", (Object)matchException, (long)-8528545622576751525L, (long)l2);
                            }
                            callSite2 = fm_0.c("X", (long)-8522397333395483614L, (long)l2);
                        }
                        catch (MatchException matchException) {
                            throw fm_0.c("I", (Object)matchException, (long)-8528545622576751525L, (long)l2);
                        }
                    }
                    try {
                        try {
                            if (callSite3 != null) break block38;
                            Object[] objectArray = new Object[2];
                            objectArray[1] = l4;
                            objectArray[0] = callSite2;
                            if (fm_0.c("I", (Object)objectArray, (long)-8523007413477298077L, (long)l2) != false) break block36;
                        }
                        catch (MatchException matchException) {
                            throw fm_0.c("I", (Object)matchException, (long)-8528545622576751525L, (long)l2);
                        }
                        callSite2 = fm_0.c("X", (long)-8522397333395483614L, (long)l2);
                    }
                    catch (MatchException matchException) {
                        throw fm_0.c("I", (Object)matchException, (long)-8528545622576751525L, (long)l2);
                    }
                }
                Object[] objectArray = new Object[2];
                objectArray[1] = l3;
                objectArray[0] = callSite2;
                CallSite callSite4 = fm_0.c("I", (Object)objectArray, (long)-8522251554863875304L, (long)l2);
                try {
                    callSite = callSite4;
                    if (callSite3 != null) break block39;
                    if (callSite == null) break block36;
                }
                catch (MatchException matchException) {
                    throw fm_0.c("I", (Object)matchException, (long)-8528545622576751525L, (long)l2);
                }
                callSite = callSite4;
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = l;
            objectArray[0] = (int)fm_0.c("\u00c7", (Object)callSite, (long)-8522545724737471000L, (long)l2);
            fm_0.c("I", (Object)objectArray, (long)-8522981795509732791L, (long)l2);
        }
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (q[n3] != null) {
            return n3;
        }
        Object object = p[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 24;
            case 1 -> 47;
            case 2 -> 51;
            case 3 -> 20;
            case 4 -> 13;
            case 5 -> 35;
            case 6 -> 23;
            case 7 -> 55;
            case 8 -> 4;
            case 9 -> 43;
            case 10 -> 45;
            case 11 -> 44;
            case 12 -> 53;
            case 13 -> 12;
            case 14 -> 33;
            case 15 -> 57;
            case 16 -> 14;
            case 17 -> 9;
            case 18 -> 0;
            case 19 -> 50;
            case 20 -> 38;
            case 21 -> 60;
            case 22 -> 7;
            case 23 -> 56;
            case 24 -> 63;
            case 25 -> 48;
            case 26 -> 28;
            case 27 -> 52;
            case 28 -> 31;
            case 29 -> 40;
            case 30 -> 8;
            case 31 -> 10;
            case 32 -> 17;
            case 33 -> 3;
            case 34 -> 36;
            case 35 -> 37;
            case 36 -> 2;
            case 37 -> 42;
            case 38 -> 32;
            case 39 -> 25;
            case 40 -> 59;
            case 41 -> 5;
            case 42 -> 39;
            case 43 -> 27;
            case 44 -> 21;
            case 45 -> 49;
            case 46 -> 6;
            case 47 -> 34;
            case 48 -> 58;
            case 49 -> 30;
            case 50 -> 54;
            case 51 -> 18;
            case 52 -> 46;
            case 53 -> 62;
            case 54 -> 1;
            case 55 -> 29;
            case 56 -> 61;
            case 57 -> 41;
            case 58 -> 26;
            case 59 -> 16;
            case 60 -> 11;
            case 61 -> 19;
            case 62 -> 22;
            default -> 15;
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
        fm_0.q[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = fm_0.m(l, l2);
        Object object = p[n];
        if (object instanceof String) {
            String string = q[n];
            int n2 = string.indexOf(8);
            Class clazz = fm_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fm_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fm_0.g(clazz3, string2, clazz2)) != null) {
                    fm_0.p[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fm_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fm_0.p[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fm_0.n(1102283573700081L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = fm_0.m(l, l2);
        Object object = p[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = q[n];
                int n3 = string2.indexOf(8);
                clazz3 = fm_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fm_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fm_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        fm_0.p[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fm_0.n(1102283573700081L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fm_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fm_0.p[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fm_0.n(1102283573700081L, 0L);
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

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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

    private void j(Object[] objectArray) {
        Object object;
        long l;
        long l2;
        long l3;
        long l4;
        block2: {
            int n;
            block3: {
                n = (Integer)objectArray[0];
                l4 = (Long)objectArray[1];
                long l5 = l4 = k ^ l4;
                l3 = l5 ^ 0x417F52D9A22FL;
                l2 = l5 ^ 0x366E4A3167C5L;
                l = l5 ^ 0x2786C7DDF353L;
                CallSite callSite = fm_0.c("I", (long)-4774290356159621758L, (long)l4);
                try {
                    object = fm_0.c("\u00c7", (Object)fm_0.c("\u00f4", (Object)b, (long)-4774141995325777230L, (long)l4), (long)-4774558024533069751L, (long)l4);
                    if (callSite != null) break block2;
                    if (object == false) break block3;
                }
                catch (MatchException matchException) {
                    throw fm_0.c("I", (Object)matchException, (long)-4774402952701695934L, (long)l4);
                }
                return;
            }
            object = n;
        }
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = (int)object;
        fm_0.c("I", (Object)objectArray2, (long)-4782501710268510640L, (long)l4);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l;
        fm_0.c("\u00c7", (Object)this.d, (Object)objectArray3, (long)-4774737912999797856L, (long)l4);
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l3;
        fm_0.c("\u00c7", (Object)this.f, (Object)objectArray4, (long)-4782206285365986477L, (long)l4);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fm_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(fm_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


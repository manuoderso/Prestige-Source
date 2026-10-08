/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aq_0;
import dev.zprestige.prestige.b4;
import dev.zprestige.prestige.cn_0;
import dev.zprestige.prestige.gK;
import dev.zprestige.prestige.hc;
import java.awt.Color;
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
import org.joml.Matrix4f;

/*
 * Renamed from dev.zprestige.prestige.cj
 */
public class cj_0
extends b4 {
    private static final String a;
    private static final long v;
    private static final String[] w;
    private static final String[] x;
    private static final Map y;
    private static final long B;
    private static final Object[] C;
    private static final String[] D;

    public cj_0(long l) {
        long l2 = (l = v ^ l) ^ 0x330A5849D1DL;
        super((String)((Object)cj_0.a("t", (int)12056, (long)(0x5DB9ECB08D9BDDC3L ^ l))), (String)((Object)cj_0.a("t", (int)23080, (long)(0x7EAD5DF5E80F28F0L ^ l))), l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    cj_0.v = hc.a(-594665595651455235L, -8227417420017165059L, MethodHandles.lookup().lookupClass()).a(226229428996068L);
                    cj_0.C = new Object[43];
                    cj_0.D = new String[43];
                    cj_0.b();
                    cj_0.y = new HashMap<K, V>(13);
                    var5 = cj_0.v ^ 90119266793359L;
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
                    var14_3 = new String[5];
                    var12_4 = 0;
                    var11_5 = "\u009d\u00c5\u00b0\u00b41Y\u00c0\u00de\u00e4\u00ca\u00c4m|\u00f9%z\u00ea!\u00116V\u00a3o\u00dfsq\u009c\u0001\u00f5\u00e3ou\u00c5?S\u0082\u00b0\u0095\u0083\u001d(U\u00e6b5\u00d55'W\u00a2V\u00eb\u00e7\u0094G\u0007p\u00f8Vt\u00f5P\u00dcI\u00d0\u00cd4<&@\u00b1\u00b7\u00a5\u0081\u0019\u00ac,\u00d0\u00d4.\u00bc(\fa\u0096\u00cf\u0002\u00cf&\u00c4A}[\u00f5V\u0089S\u00a5-W0-#\u00f3\u0011\u00cd\u0084O]\u001c\u00f6:L\u00eaMP\u00ad]\u0012\u00ca\u00e8\u0013";
                    var13_6 = "\u009d\u00c5\u00b0\u00b41Y\u00c0\u00de\u00e4\u00ca\u00c4m|\u00f9%z\u00ea!\u00116V\u00a3o\u00dfsq\u009c\u0001\u00f5\u00e3ou\u00c5?S\u0082\u00b0\u0095\u0083\u001d(U\u00e6b5\u00d55'W\u00a2V\u00eb\u00e7\u0094G\u0007p\u00f8Vt\u00f5P\u00dcI\u00d0\u00cd4<&@\u00b1\u00b7\u00a5\u0081\u0019\u00ac,\u00d0\u00d4.\u00bc(\fa\u0096\u00cf\u0002\u00cf&\u00c4A}[\u00f5V\u0089S\u00a5-W0-#\u00f3\u0011\u00cd\u0084O]\u001c\u00f6:L\u00eaMP\u00ad]\u0012\u00ca\u00e8\u0013".length();
                    var10_7 = 40;
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
                        var14_3[var12_4++] = cj_0.b(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        var11_5 = "\u009cU\u00cd]\u009d\u00b6p\u00de=/\u00ef\u0003\u00acW\u00d770\u00ac%\u0099\u00b5\u0085\u00e2\u00a9u\\\u009eJ\u00db\u0000\u00ee\u00b8*\u008b+\u00b3}\u00f67\u008c.\u00cdG\u00c2\u0090\u00baf\u00deV\u0088\u00d0;o\u00b4|&w\u00a1,\u00b8\u00ec\u00cdJj\u00a5";
                        var13_6 = "\u009cU\u00cd]\u009d\u00b6p\u00de=/\u00ef\u0003\u00acW\u00d770\u00ac%\u0099\u00b5\u0085\u00e2\u00a9u\\\u009eJ\u00db\u0000\u00ee\u00b8*\u008b+\u00b3}\u00f67\u008c.\u00cdG\u00c2\u0090\u00baf\u00deV\u0088\u00d0;o\u00b4|&w\u00a1,\u00b8\u00ec\u00cdJj\u00a5".length();
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
                        var14_3[var12_4++] = cj_0.b(var15_9).intern();
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
            cj_0.w = var14_3;
            cj_0.x = new String[5];
            cj_0.a = cj_0.a("t", (int)22577, (long)(4937347204247108374L ^ var5));
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
lbl84:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
        var2_12 = -7060978165361830082L;
        var4_13 = var0_10.doFinal(new byte[]{(byte)(var2_12 >>> 56), (byte)(var2_12 >>> 48), (byte)(var2_12 >>> 40), (byte)(var2_12 >>> 32), (byte)(var2_12 >>> 24), (byte)(var2_12 >>> 16), (byte)(var2_12 >>> 8), (byte)var2_12});
        ** while (true)
        cj_0.B = ((long)var4_13[0] & 255L) << 56 | ((long)var4_13[1] & 255L) << 48 | ((long)var4_13[2] & 255L) << 40 | ((long)var4_13[3] & 255L) << 32 | ((long)var4_13[4] & 255L) << 24 | ((long)var4_13[5] & 255L) << 16 | ((long)var4_13[6] & 255L) << 8 | (long)var4_13[7] & 255L;
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method e(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static int i(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (D[n3] != null) {
            return n3;
        }
        Object object = C[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 53;
            case 1 -> 21;
            case 2 -> 35;
            case 3 -> 20;
            case 4 -> 3;
            case 5 -> 63;
            case 6 -> 24;
            case 7 -> 25;
            case 8 -> 42;
            case 9 -> 16;
            case 10 -> 50;
            case 11 -> 14;
            case 12 -> 33;
            case 13 -> 9;
            case 14 -> 52;
            case 15 -> 46;
            case 16 -> 54;
            case 17 -> 5;
            case 18 -> 44;
            case 19 -> 57;
            case 20 -> 29;
            case 21 -> 28;
            case 22 -> 62;
            case 23 -> 22;
            case 24 -> 60;
            case 25 -> 13;
            case 26 -> 47;
            case 27 -> 12;
            case 28 -> 48;
            case 29 -> 17;
            case 30 -> 39;
            case 31 -> 56;
            case 32 -> 6;
            case 33 -> 41;
            case 34 -> 7;
            case 35 -> 18;
            case 36 -> 49;
            case 37 -> 19;
            case 38 -> 10;
            case 39 -> 58;
            case 40 -> 23;
            case 41 -> 45;
            case 42 -> 4;
            case 43 -> 11;
            case 44 -> 31;
            case 45 -> 34;
            case 46 -> 55;
            case 47 -> 38;
            case 48 -> 30;
            case 49 -> 59;
            case 50 -> 43;
            case 51 -> 26;
            case 52 -> 1;
            case 53 -> 8;
            case 54 -> 32;
            case 55 -> 2;
            case 56 -> 61;
            case 57 -> 36;
            case 58 -> 37;
            case 59 -> 51;
            case 60 -> 27;
            case 61 -> 0;
            case 62 -> 15;
            default -> 40;
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
        cj_0.D[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = C;
        C[0] = "\u001d\rdgG\u0010\u0000\u0018<E\u0006\u001d\u0018\u001e";
        objectArray[1] = Integer.TYPE;
        cj_0.D[1] = "java/lang/Integer";
        objectArray[2] = "fdS\u001210pdVH\"'g/UN.3vhBYe#l";
        objectArray[3] = "\fW\u0016<xtyw\u001d3i;\u0018y\u00168mal";
        objectArray[4] = Float.TYPE;
        cj_0.D[4] = "java/lang/Float";
        objectArray[5] = "\u0014'\u0006W+2\u0002'\u0003\r8%\u0015l\u0000\u000b41\u0004+\u0017\u001c\u007f D";
        objectArray[6] = "+e\u0015M6\u0000^E\u001eB'O?K\u0015I#\u0015K";
        objectArray[7] = Void.TYPE;
        cj_0.D[7] = "java/lang/Void";
        objectArray[8] = "\\*\u0005Y<bJ*\u0000\u0003/u]a\u0003\u0005#aL&\u0014\u0012hs}";
        objectArray[9] = "\u0012B\u007f\u000bV\u001cgbt\u0004GS\u0006l\u007f\u000fC\tr";
        objectArray[10] = "\u0015lY,Ig\u0003l\\vZp\u0014'_pVd\u0005`Hg\u001dt0";
        objectArray[11] = ";u\u0005\u0001o\u0017NU\u000e\u000e~X/[\u0005\u0005z\u0002[";
        objectArray[12] = "yAx\u001aDi\fas\u0015U&mox\u001eQ|\u0019";
        objectArray[13] = " \f\t\u0002a`6\f\fXrw!G\u000f^~c0\u0000\u0018I5t/";
        objectArray[14] = "_\u0016\u001bOx)*6\u0010@ifK8\u001bKm<?";
        objectArray[15] = "\u0014N9f_\u0002\u0002N<<L\u0015\u0015\u0005?:@\u0001\u0004B(-\u000b\u0016\u0014";
        objectArray[16] = "\u0016_S\u0012\u000bDc\u007fX\u001d\u001a\u000b\u0002qS\u0016\u001eQv";
        objectArray[17] = "|p?z\u0017'w\u007f.5t*by";
        objectArray[18] = Double.TYPE;
        cj_0.D[18] = "java/lang/Double";
        objectArray[19] = "Z4-MN/L4(\u0017]8[\u007f+\u0011Q,J8<\u0006\u001a<R8>\r@qn#>\u0010@6Y4";
        objectArray[20] = "eQ~\u001d@nsQ{GSyd\u001axA_mu]oV\u0014}B";
        objectArray[21] = "\u0016J[$\u0019\u0014\u001dEJkd\u0001\u000f_H(";
        objectArray[22] = Long.TYPE;
        cj_0.D[22] = "java/lang/Long";
        objectArray[23] = "\\\u0003\u0015i1m)#\u001ef \"H-\u0015m$x<";
        objectArray[24] = "\u000e$~O'\u000b{\u0004u@6D\u001a\n~K2\u001en";
        objectArray[25] = "I@\u0006Xt*<`\rWee]n\u0006\\a?)";
        objectArray[26] = "!6\u0003\u0005\u0007X*9\u0012JfV!2\u0016\u0010";
        objectArray[27] = "\u0001\u00002bv-\u0000\u00125\\$2F!01&9:\u00135-{dY\u0013% K";
        objectArray[28] = "aa?\\\u0010G1~mDt\u001eZs2L\u0015\u0015$h<P\u000bwg\u007f<\u001fI\u00131\u007f9Mt";
        objectArray[29] = "BG-}dQCU*C6N\u0005s8/Y^\u0006Xex:^\u0016UU";
        objectArray[30] = "}||*\b{'}<'wbD\u007fd6\u0016i:dj*\b\u000b\u007f#~b\u0011{!cw%w";
        objectArray[31] = "u0w53W%/%-W\u0006N\"z%6\u000509t9(gs.tvj\u0003%.q$W";
        objectArray[32] = "\u0010\u001f\u0013Z\u001a/\u001f\u0019F\u001e+,.C\u0017\tJ\"PX\u0019\u0015T@\u0015M\u000eZ\u00162\u0014_\td";
        objectArray[33] = "<\u0006G2\u001e\u0014\u007f\u001eV7g\u0000\u0003\f[b\u0006\t}\u0017U~\u0018k8PA6\u0001\u001bf\u0010Hqg";
        objectArray[34] = "\u0001eNw$tB}_r]b>oR'<i@t\\;\"\u000b\u00053Hs;{[sA4]";
        objectArray[35] = ";\u0018.C7\\pX(\u001dLT\nD5\u0017-]t_;\u000b3?7H;Dq[aH>\u0016L";
        objectArray[36] = "G*j]*\u000eT+6\u0003[[.05U:TP+;I$6\u0013<;\u0006fRE<>T[";
        objectArray[37] = "\u001c([0Pw\u001d:\\\u000e\u0002h[\fGs\u0000\u0005Z9R>VfZ)_\u000e";
        objectArray[38] = "\u001e\u000bulC\u007fD\u000b`&%j\u0015\u001d\u0012}BzO\u0007m(^ O{yqN*\b\u0004,m\u0014*t";
        objectArray[39] = "\b/k;c\u0006\u001f(=)\u0003\u001cd''%z\u0005\tz'q{";
        objectArray[40] = ">w\u000b\nhI3(YVXA.i\u001c[>V\u000fr\u0003[\u001dK7w\u0007MXD0\u007f\u0002_=\u001bb*\u00006";
        objectArray[41] = "\u0016%PUFZU=AP?Z)/L\u0005^GW4B\u0019@%\u0014#BV\u0002AB#G\u0004?";
        Object[] objectArray2 = objectArray;
        objectArray[42] = "\t8CXe\\T8\u0017Y\u0017Xe)LLvS\u001b2BPh1Z#P\u001cnN\u0019;A\u0019\u0017";
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

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cj" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = cj_0.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'M' || c == '\u00f8' || c == '\u00d0' || c == '\u00e0') {
                field = cj_0.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'M' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f8' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = cj_0.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00aa' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = cj_0.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = cj_0.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = cj_0.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = cj_0.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method l(long l, long l2) {
        int n = cj_0.i(l, l2);
        Object object = C[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = D[n];
                int n3 = string2.indexOf(8);
                clazz3 = cj_0.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = cj_0.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = cj_0.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        cj_0.C[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = cj_0.j(1837971187919197L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = cj_0.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        cj_0.C[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = cj_0.j(1837971187919197L, 0L);
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

    @Override
    public void l(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        Matrix4f matrix4f = (Matrix4f)objectArray[2];
        long l = (Long)objectArray[3];
        long l2 = l;
        long l3 = l2 ^ 0x7876565874AFL;
        long l4 = l2 ^ 0x56B4B80BF914L;
        long l5 = l2 ^ 0x194A66AD9C40L;
        long l6 = l2 ^ 0x5D6649FEB165L;
        long l7 = l2 ^ 0x77FE815D5D37L;
        long l8 = l2 ^ 0x31240AA31D80L;
        long l9 = l2 ^ 0x5BE4B21DC642L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l7;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l8;
        CallSite callSite = cj_0.c("\u00aa", (Object)cj_0.c("\u00aa", (Object)cj_0.c("\u00d0", (long)-6305111635898715300L, (long)l), (Object)objectArray2, (long)-6305912394803707876L, (long)l), (Object)objectArray3, (long)-6305573435499326055L, (long)l);
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l7;
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l6;
        objectArray5[0] = cj_0.a("t", (int)3457, (long)(0x11CCBF1A7E578121L ^ l));
        reference var22_14 = cj_0.c("\u00aa", (Object)cj_0.c("\u00aa", (Object)cj_0.c("\u00d0", (long)-6305111635898715300L, (long)l), (Object)objectArray4, (long)-6305912394803707876L, (long)l), (Object)objectArray5, (long)-6305382509906324001L, (long)l) * 1.0f;
        float f = 5.5f + var22_14 + 5.5f;
        Object[] objectArray6 = new Object[2];
        objectArray6[1] = Float.valueOf(1.0f);
        objectArray6[0] = Float.valueOf((float)callSite);
        CallSite callSite2 = cj_0.c("\u00e4", (Object)objectArray6, (long)-6308984008449578116L, (long)l);
        float f10 = this.e;
        float f11 = this.f;
        Object[] objectArray7 = new Object[10];
        objectArray7[9] = l4;
        objectArray7[8] = Float.valueOf(4.0f);
        objectArray7[7] = 5;
        objectArray7[6] = Float.valueOf((float)callSite2);
        objectArray7[5] = Float.valueOf(f);
        objectArray7[4] = Float.valueOf(f11);
        objectArray7[3] = Float.valueOf(f10);
        objectArray7[2] = matrix4f;
        objectArray7[1] = gK2;
        objectArray7[0] = aq_02;
        cj_0.c("\u00e4", (Object)objectArray7, (long)-6305203174578135519L, (long)l);
        Object[] objectArray8 = new Object[10];
        objectArray8[9] = l3;
        objectArray8[8] = Float.valueOf(4.0f);
        objectArray8[7] = cn_0.r;
        objectArray8[6] = Float.valueOf((float)callSite2);
        objectArray8[5] = Float.valueOf(f);
        objectArray8[4] = Float.valueOf(f11);
        objectArray8[3] = Float.valueOf(f10);
        objectArray8[2] = matrix4f;
        objectArray8[1] = gK2;
        objectArray8[0] = aq_02;
        cj_0.c("\u00e4", (Object)objectArray8, (long)-6305448822513459671L, (long)l);
        Object[] objectArray9 = new Object[1];
        objectArray9[0] = l5;
        CallSite callSite3 = cj_0.c("\u00e4", (Object)objectArray9, (long)-6305494883238782607L, (long)l);
        float f12 = (float)(cj_0.c("\u00e4", (double)((double)cj_0.c("\u00e4", (long)-6306057399432646761L, (long)l) * 0.0031415926535897933), (long)-6305092822716523994L, (long)l) * 0.5 + 0.5);
        Color color = new Color((int)cj_0.c("\u00aa", (Object)callSite3, (long)-6309226537217021908L, (long)l), (int)cj_0.c("\u00aa", (Object)callSite3, (long)-6309347865247656092L, (long)l), (int)cj_0.c("\u00aa", (Object)callSite3, (long)-6305276083099953707L, (long)l), (int)B + (int)(105.0f * f12));
        float f13 = f10 + 5.5f;
        float f14 = f11 + (callSite2 - callSite * 1.0f) / 2.0f;
        Object[] objectArray10 = new Object[1];
        objectArray10[0] = l7;
        Object[] objectArray11 = new Object[7];
        objectArray11[6] = l9;
        objectArray11[5] = color;
        objectArray11[4] = Float.valueOf(1.0f);
        objectArray11[3] = Float.valueOf(f14);
        objectArray11[2] = Float.valueOf(f13);
        objectArray11[1] = cj_0.a("t", (int)16704, (long)(0x75E4E50272654DE5L ^ l));
        objectArray11[0] = matrix4f;
        cj_0.c("\u00aa", (Object)cj_0.c("\u00aa", (Object)cj_0.c("\u00d0", (long)-6305111635898715300L, (long)l), (Object)objectArray10, (long)-6305912394803707876L, (long)l), (Object)objectArray11, (long)-6306098796131804753L, (long)l);
        Object[] objectArray12 = new Object[2];
        objectArray12[1] = Float.valueOf((float)callSite2);
        objectArray12[0] = Float.valueOf(f);
        cj_0.c("\u00aa", (Object)this, (Object)objectArray12, (long)-6309070460712609799L, (long)l);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cj" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = cj_0.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x24D7;
        if (x[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])y.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    y.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/cj", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = w[n2].getBytes("ISO-8859-1");
            cj_0.x[n2] = cj_0.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return x[n2];
    }

    @Override
    public void m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x6910D1708A27L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = Float.valueOf(3.0f);
        objectArray2[0] = Float.valueOf(150.0f);
        cj_0.c("\u00aa", (Object)this, (Object)objectArray2, (long)-3378236037601585386L, (long)l);
    }

    private static Field k(long l, long l2) {
        int n = cj_0.i(l, l2);
        Object object = C[n];
        if (object instanceof String) {
            String string = D[n];
            int n2 = string.indexOf(8);
            Class clazz = cj_0.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = cj_0.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = cj_0.e(clazz3, string2, clazz2)) != null) {
                    cj_0.C[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = cj_0.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        cj_0.C[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = cj_0.j(1837971187919197L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Class j(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = cj_0.i(l, l2);
            object = C[n];
            try {
                if (!(object instanceof String)) break block2;
                cj_0.C[n] = clazz = Class.forName(D[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(cj_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(cj_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


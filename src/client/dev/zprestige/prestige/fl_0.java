/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_490
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bl_0;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dQ;
import dev.zprestige.prestige.dV;
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
import net.minecraft.class_490;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.fl
 */
public class fl_0
extends dV {
    private dM d;
    private dQ a;
    private f5 c;
    private static final long k = hc.a(-8496980063044465433L, -3997762282191835599L, MethodHandles.lookup().lookupClass()).a(206976187465860L);
    private static final long[] l;
    private static final Integer[] m;
    private static final Map n;
    private static final Object[] o;
    private static final String[] p;

    public fl_0() {
        long l = k ^ 0x18386A8D1C89L;
        long l2 = l ^ 0x589CC5433F14L;
        this.c = new f5(l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        o = new Object[52];
        p = new String[52];
        fl_0.f();
        n = new HashMap(13);
        long l = k ^ 0x2C090955A8DCL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[3];
        int n = 0;
        String string = "F\u00d2\u00f1;\u00d0\u00ff\u00bf\f\u00a44\u00b7\n\u0015!\u00d4p$\u0004\u00dbeAg\u0084\u00e4";
        int n2 = "F\u00d2\u00f1;\u00d0\u00ff\u00bf\f\u00a44\u00b7\n\u0015!\u00d4p$\u0004\u00dbeAg\u0084\u00e4".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        fl_0.l = lArray;
        m = new Integer[3];
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2124;
        if (m[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = fl_0.l[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])fl_0.n.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    fl_0.n.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/fl", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            fl_0.m[n2] = n3;
        }
        return m[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = fl_0.b(n, l);
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
            throw new RuntimeException("dev/zprestige/prestige/fl" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fl" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fl_0.m(l, l2);
            object = o[n];
            try {
                if (!(object instanceof String)) break block2;
                fl_0.o[n] = clazz = Class.forName(p[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fl_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fl_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fl_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fl_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = o;
        o[0] = "4\r`\f\u0012y\"\reV\u0001n5FfP\rz$\u0001qGFh\u0018";
        objectArray[1] = "@_s.d?5\u007fx!upHgk&|9 ";
        objectArray[2] = "U |5t7U kix8Okkwx-H\u001a;*)";
        objectArray[3] = "+!\u001bVas+!\f\nm|1j\f\u0014mi6\u001bXL:";
        objectArray[4] = "^\t5n>;H\t04-,_B32!8N\u0005$%j-V";
        objectArray[5] = "uI\u001an\u00012~F\u000b!b?kK\u0004JW=zX\u0018f@0";
        objectArray[6] = "V\u0014\u0014O-\u0014]\u001b\u0005\u0000J\u0016H\u0010\u0005Kq";
        objectArray[7] = Integer.TYPE;
        fl_0.p[7] = "java/lang/Integer";
        objectArray[8] = "\\-4\u0010~{\\-#LrtFf#RraA\u0017q\t*+";
        objectArray[9] = "Y0)%U,Y0>yY#C{>gY6D\nl<\u0001w";
        objectArray[10] = "E\b!S\u001aLE\b6\u000f\u0016C_C6\u0011\u0016VX2dKA\u0014";
        objectArray[11] = "\u0000\u001eB9B\r\u0000\u001eUeN\u0002\u001aUU{N\u0017\u001d$\u0007/\u001fV";
        objectArray[12] = "^Q9\u007f\u001a\u0017@Y#0g\u0007@";
        objectArray[13] = ";OP)2h0@AfSf;KE<";
        objectArray[14] = "(\u0010)dUd]0\"kD+<>)`@qH";
        objectArray[15] = "?\u000eEo\u001fl)\u000e@5\f{>EC3\u0000o/\u0002T$Kzn";
        objectArray[16] = "(\u0002\u0006\fS1]\"\r\u0003B~<,\u0006\bF$H";
        objectArray[17] = Boolean.TYPE;
        fl_0.p[17] = "java/lang/Boolean";
        objectArray[18] = "\u00030 zDh\u000307&Hg\u0019{78Hr\u001e\nec\u00182";
        objectArray[19] = "\u0003s^6\u0017O\u0003sIj\u001b@\u00198It\u001bU\u001eI\u001b*C\u0012";
        objectArray[20] = "d:_Z~\u001dd:H\u0006r\u0012~qH\u0018r\u0007y\u0000\u001dL+D";
        objectArray[21] = ";O\u0001V\u007f\\0@\u0010\u0019\u0013_>B\u0012V?";
        objectArray[22] = "l\"A]g\u001dz\"D\u0007t\nmiG\u0001x\u001e|.P\u00163\tY";
        objectArray[23] = "Pb\u001d3#u%B\u0016<2:DL\u001d76`0";
        objectArray[24] = Void.TYPE;
        fl_0.p[24] = "java/lang/Void";
        objectArray[25] = "B)\u000e5`\tB)\u0019il\u0006Xb\u0019wl\u0013_\u0013N(:";
        objectArray[26] = "\u0018\u0018e?0]\u000e\u0018`e#J\u0019Scc/^\b\u0014ttdI7";
        objectArray[27] = ",N\u001f\"x9Yn\u0014-iv8`\u001f&m,L";
        objectArray[28] = "5}\f}C\u001d#}\t'P\n46\n!\\\u001e%q\u001d6\u0017\u000e#";
        objectArray[29] = "\\xwQ?d)X|^.+HVwU*q<";
        objectArray[30] = "s\u001a\u0019SLn\u0006:\u0012\\]!g4\u0019WY{\u0013";
        objectArray[31] = "xh\bp\u0002mvrH\u0012\u0012\u0015-7\bw\u0012,~{Ilx";
        objectArray[32] = "\\ns\u001e\r\u0010\u0018om\u001c`\u0017\u0004{o\u00107@Z,7|ZF\u0007rwM\n\u0001\u0017m";
        objectArray[33] = "4DN=>k3D\ti\\o\u000f\u0010]m9|sKJ00\u00063\u0011\f,eho\u0004\u0006<\\";
        objectArray[34] = "oDRd\u001auvO\u00068xy\u0006Q\u0006j\u001diz\n\u00117\u0014\u0013m\u0005\u0015>\u001a~bR].x";
        objectArray[35] = ";f\u0013\u0002Q)<fTV3-\u0000jR\b\\=r&\r\u001dMD<o\u000e\u0002J6p0\u001b\u00133";
        objectArray[36] = "\u001e_K\u001c\u000fcBJA\f6sK^\f\u000fqc\"\u0007\u001d\u0003Iw[[@\u0006P\r\u001e_K\u001c\u000fcBJA\f6";
        objectArray[37] = "h5tw\u0012xii,2hf;pw,\u0004Ti=/zh=5e-4\r3<|.K";
        objectArray[38] = "bd6@Kd>q<Prk8}RW\u0016w3\u00011R\u0013u$xm\u000f\u0016l^";
        objectArray[39] = "@X0-R>[Z'#c5JT&?4d\u0014\b~S\b:YGs6\u00138NI";
        objectArray[40] = "\u001dw-\u0014m\u0019N|q\u001a\u000bH\u0010pu\t\\\u001b@$,ef\u001e\u001fbq\u000fh\u001b\u000b{";
        objectArray[41] = " q\u0006s7\u001f7j\u0018fJ\b*h\u001dl#\u0004\u0013f\u001d|'b&?\u0001j(\u000f)hIzJ";
        objectArray[42] = "{.\u0006JmDp\u007f\u001aSSW\u0015$\t\u001c6Gi\u007f\u001eA?=z;\u001aJhD/!\u0019\u0018S";
        objectArray[43] = ".i\u0001\b/Kjh\u001f\nBLv|\u001d\u0006\u0015\u001b(,Dj\"Cv/\u0019\u001arMi\u007f";
        objectArray[44] = "C!ZG#J\u0015 F@Y\u0016\u0011gB\u001a5$A'\u0019MYN\u0010z]\u0007 \u0012M\u007fD}gJ\u001f'X\u0006f\u0016Gb\"";
        objectArray[45] = "]\u00160hx\r\rQ w\u0004Y\nU2khk\\\u0010o04<X\u0013*6~\u0005\u000e\u001261\u0004";
        objectArray[46] = "tbh7\u0015zjl%=nz\u0015>zaWs+>h>\u0002\u0013";
        objectArray[47] = "\u001b\u0013\u001e\rv<Z^B\u0011N2E\f@\u0006\u0019l\u001d_\u001ejp?M[[\u000f~6TX";
        objectArray[48] = "SIgC\rB[\u00116_u\u0018\r);_OF\u0003\u0017;M\u0010\u0013c\u0019jR\t\u0007^\u00112\u0003\u0015\u007f";
        objectArray[49] = "7\u0000x/\u00067.\u000b,sd8^\u0015,!\u0001+\"N;|\bQ1\n?w_(d\u0010<%d";
        objectArray[50] = ",}exrzq|txL|Nc\u007f))k28ht \u0011%7l}.|*`$mL";
        Object[] objectArray2 = objectArray;
        objectArray[51] = "\u00067\u001154\u001c[6\u00005\n\u001ad)\u000bdo\r\u0018r\u001c9fwX(Z%3\u0019\u0004=P5\n";
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = fl_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f8' || c == '\u00cb' || c == 'Z' || c == 'c') {
                field = fl_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f8' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00cb' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'Z' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fl_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'W' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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

    private Integer a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = k ^ l;
        CallSite callSite = fl_0.c("\u00e5", (long)6951517901441819976L, (long)l);
        for (int i = 0; i <= fl_0.b("u", (int)14704, (long)(0x5319565BA917F829L ^ l)); ++i) {
            try {
                if (fl_0.c("W", (Object)fl_0.c("W", (Object)fl_0.c("W", (Object)fl_0.c("\u00f8", (Object)b, (long)6951055641145487827L, (long)l), (long)6950318211763124136L, (long)l), (int)i, (long)6950206610068250582L, (long)l), (long)6950846926435424356L, (long)l) != fl_0.c("Z", (long)6950403612734902543L, (long)l)) continue;
                return fl_0.c("\u00e5", (int)i, (long)6950792514094221670L, (long)l);
            }
            catch (MatchException matchException) {
                throw fl_0.c("\u00e5", (Object)matchException, (long)6951262671817380489L, (long)l);
            }
        }
        return null;
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return fl_0.c("\u00e5", (Object)((Object)q_0.UHC), (long)-2446558992152051658L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    @bP
    public void a(bl_0 var1_1) {
        block19: {
            block17: {
                block21: {
                    block22: {
                        block20: {
                            block18: {
                                v0 = var2_2 = fl_0.k ^ 91027272688274L;
                                var4_3 = v0 ^ 89932718348685L;
                                var6_4 = v0 ^ 88611954500879L;
                                var8_5 = v0 ^ 92133087806189L;
                                var10_6 = v0 ^ 11705308330489L;
                                var12_7 = v0 ^ 92483318601983L;
                                var14_8 = v0 ^ 59846092551283L;
                                var16_9 = fl_0.c("\u00e5", (long)4221495959576068005L, (long)var2_2);
                                try {
                                    try {
                                        try {
                                            try {
                                                if (var16_9 != null) break block17;
                                                if (fl_0.c("\u00f8", (Object)fl_0.b, (long)4222361465963542901L, (long)var2_2) instanceof class_490) {
                                                }
                                                ** GOTO lbl91
                                            }
                                            catch (MatchException v1) {
                                                throw fl_0.c("\u00e5", (Object)v1, (long)4222929580017174628L, (long)var2_2);
                                            }
                                            v2 = this;
                                            if (var16_9 != null) break block18;
                                        }
                                        catch (MatchException v3) {
                                            throw fl_0.c("\u00e5", (Object)v3, (long)4222929580017174628L, (long)var2_2);
                                        }
                                        v4 = new Object[1];
                                        v4[0] = var8_5;
                                        if (fl_0.c("W", (Object)v2, (Object)v4, (long)4222767885920162821L, (long)var2_2) == null) break block19;
                                    }
                                    catch (MatchException v5) {
                                        throw fl_0.c("\u00e5", (Object)v5, (long)4222929580017174628L, (long)var2_2);
                                    }
                                    v2 = this;
                                }
                                catch (MatchException v6) {
                                    throw fl_0.c("\u00e5", (Object)v6, (long)4222929580017174628L, (long)var2_2);
                                }
                            }
                            try {
                                v7 = new Object[2];
                                v7[1] = var12_7;
                                v7[0] = this.a;
                                v8 = fl_0.c("W", (Object)v2.c, (Object)v7, (long)4222877992022638896L, (long)var2_2);
                                if (var16_9 != null) break block20;
                                if (v8 == false) break block19;
                            }
                            catch (MatchException v9) {
                                throw fl_0.c("\u00e5", (Object)v9, (long)4222929580017174628L, (long)var2_2);
                            }
                            v8 = fl_0.b("u", (int)28294, (long)(7685271131584525617L ^ var2_2));
                        }
                        try {
                            v10 = fl_0.b("u", (int)22998, (long)(6721802337123222112L ^ var2_2));
                            v11 = fl_0.c("W", (Object)((Boolean)fl_0.c("W", (Object)this.d, (long)4222595947537665072L, (long)var2_2)), (long)4222211129218173467L, (long)var2_2) != false ? fl_0.c("Z", (long)4222183743188955694L, (long)var2_2) : null;
                        }
                        catch (MatchException v12) {
                            throw fl_0.c("\u00e5", (Object)v12, (long)4222929580017174628L, (long)var2_2);
                        }
                        v13 = new Object[4];
                        v13[3] = var10_6;
                        v13[2] = v11;
                        v13[1] = (int)v10;
                        v13[0] = (int)v8;
                        var17_10 = fl_0.c("\u00e5", (Object)v13, (long)4224034315745254063L, (long)var2_2);
                        try {
                            v14 = var17_10;
                            if (var16_9 != null) break block21;
                            if (v14 != null) break block22;
                        }
                        catch (MatchException v15) {
                            throw fl_0.c("\u00e5", (Object)v15, (long)4222929580017174628L, (long)var2_2);
                        }
                        return;
                    }
                    v14 = var17_10;
                }
                try {
                    v16 = new Object[4];
                    v16[3] = var4_3;
                    v16[2] = fl_0.c("Z", (long)4223191770865626627L, (long)var2_2);
                    v16[1] = 0;
                    v16[0] = (int)fl_0.c("W", (Object)v14, (long)4223131209133570968L, (long)var2_2);
                    fl_0.c("\u00e5", (Object)v16, (long)4223979491365194963L, (long)var2_2);
                    v17 = new Object[1];
                    v17[0] = var14_8;
                    fl_0.c("W", (Object)this.a, (Object)v17, (long)4222283709262777135L, (long)var2_2);
                    v18 = new Object[1];
                    v18[0] = var6_4;
                    fl_0.c("W", (Object)this.c, (Object)v18, (long)4223930176868122212L, (long)var2_2);
                    if (var16_9 == null) break block19;
lbl91:
                    // 2 sources

                    v19 = new Object[1];
                    v19[0] = var14_8;
                    fl_0.c("W", (Object)this.a, (Object)v19, (long)4222283709262777135L, (long)var2_2);
                }
                catch (MatchException v20) {
                    throw fl_0.c("\u00e5", (Object)v20, (long)4222929580017174628L, (long)var2_2);
                }
            }
            v21 = new Object[1];
            v21[0] = var6_4;
            fl_0.c("W", (Object)this.c, (Object)v21, (long)4223930176868122212L, (long)var2_2);
        }
    }

    private static int m(long l, long l2) {
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
            case 0 -> 37;
            case 1 -> 44;
            case 2 -> 54;
            case 3 -> 63;
            case 4 -> 27;
            case 5 -> 10;
            case 6 -> 46;
            case 7 -> 59;
            case 8 -> 6;
            case 9 -> 51;
            case 10 -> 52;
            case 11 -> 20;
            case 12 -> 14;
            case 13 -> 24;
            case 14 -> 60;
            case 15 -> 23;
            case 16 -> 19;
            case 17 -> 33;
            case 18 -> 31;
            case 19 -> 9;
            case 20 -> 11;
            case 21 -> 2;
            case 22 -> 45;
            case 23 -> 16;
            case 24 -> 5;
            case 25 -> 22;
            case 26 -> 17;
            case 27 -> 29;
            case 28 -> 13;
            case 29 -> 21;
            case 30 -> 0;
            case 31 -> 35;
            case 32 -> 50;
            case 33 -> 56;
            case 34 -> 57;
            case 35 -> 4;
            case 36 -> 40;
            case 37 -> 8;
            case 38 -> 30;
            case 39 -> 15;
            case 40 -> 53;
            case 41 -> 38;
            case 42 -> 7;
            case 43 -> 43;
            case 44 -> 58;
            case 45 -> 3;
            case 46 -> 55;
            case 47 -> 12;
            case 48 -> 26;
            case 49 -> 47;
            case 50 -> 28;
            case 51 -> 62;
            case 52 -> 61;
            case 53 -> 39;
            case 54 -> 42;
            case 55 -> 34;
            case 56 -> 36;
            case 57 -> 25;
            case 58 -> 41;
            case 59 -> 1;
            case 60 -> 18;
            case 61 -> 32;
            case 62 -> 48;
            default -> 49;
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
        fl_0.p[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = fl_0.m(l, l2);
        Object object = o[n];
        if (object instanceof String) {
            String string = p[n];
            int n2 = string.indexOf(8);
            Class clazz = fl_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fl_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fl_0.g(clazz3, string2, clazz2)) != null) {
                    fl_0.o[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fl_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fl_0.o[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fl_0.n(962158422021781L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = fl_0.m(l, l2);
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
                clazz3 = fl_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fl_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fl_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        fl_0.o[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fl_0.n(962158422021781L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fl_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fl_0.o[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fl_0.n(962158422021781L, 0L);
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fl_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(fl_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.dC;
import dev.zprestige.prestige.dF;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.dn_0;
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
import net.minecraft.class_310;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class e8
extends dV
implements dF {
    private dO a;
    private dM d;
    private dO c;
    private f5 e;
    private f5 f;
    private f5 g;
    private f5 h;
    private Integer i;
    private Integer j;
    private static final long k;
    private static final long[] l;
    private static final Integer[] m;
    private static final Map n;
    private static final Object[] o;
    private static final String[] p;

    public e8() {
        long l = k ^ 0x60528B7B21F9L;
        long l2 = l ^ 0x5C0293E035CCL;
        this.e = new f5(l2);
        this.f = new f5(l2);
        this.g = new f5(l2);
        this.h = new f5(l2);
        this.i = null;
        this.j = null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                e8.k = hc.a(-8814896007477361414L, 375439744602635321L, MethodHandles.lookup().lookupClass()).a(18202621233239L);
                e8.o = new Object[75];
                e8.p = new String[75];
                e8.f();
                e8.n = new HashMap<K, V>(13);
                var0 = e8.k ^ 61020532254201L;
                var2_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var8_3 = new long[4];
                var5_4 = 0;
                var6_5 = "\u0004\u0091\u0011yv\u00e1\u00f1!>CQ\u00e8x\u00ab\u00ba(";
                var7_6 = "\u0004\u0091\u0011yv\u00e1\u00f1!>CQ\u00e8x\u00ab\u00ba(".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl41:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u00cf\u00d4d\u00d2dC\u008d\u00ae\"\u008f\u00c32r\u00f1~\u00ee";
                    var7_6 = "\u00cf\u00d4d\u00d2dC\u008d\u00ae\"\u008f\u00c32r\u00f1~\u00ee".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl60:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block9;
                    break;
                }
            }
            var10_9 = v5;
            var12_10 = var2_1.doFinal(new byte[]{(byte)(var10_9 >>> 56), (byte)(var10_9 >>> 48), (byte)(var10_9 >>> 40), (byte)(var10_9 >>> 32), (byte)(var10_9 >>> 24), (byte)(var10_9 >>> 16), (byte)(var10_9 >>> 8), (byte)var10_9});
            v7 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl73:
                // 1 sources

                ** continue;
            }
        }
        e8.l = var8_3;
        e8.m = new Integer[4];
    }

    @Override
    public void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x7FAB131DDD11L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = this;
        e8.c("\u00da", (Object)e8.c("j", (long)3993230708016340018L, (long)l), (Object)objectArray2, (long)3992887305436138875L, (long)l);
        this.i = null;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = e8.b(n, l);
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
            throw new RuntimeException("dev/zprestige/prestige/e8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x253;
        if (m[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e8.l[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])e8.n.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    e8.n.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/e8", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            e8.m[n2] = n3;
        }
        return m[n2];
    }

    @Override
    public boolean b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return (boolean)e8.c("\u00da", (Object)e8.c("j", (long)1611246392076118895L, (long)l), (Object)e8.c("\u00da", (Object)this.d, (long)1611341702175843322L, (long)l), (long)1605257880294908866L, (long)l);
    }

    private dC b(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = k ^ l) ^ 0x54D3E10F923CL;
        reference var7_5 = e8.c("\u00da", (Object)((Float)((Object)e8.c("\u00da", (Object)this.c, (long)3652057199155005192L, (long)l))), (long)3652207152730656398L, (long)l) - 1.0f + e8.c("\u00da", (Object)dn_0.a, (long)3653112198956509463L, (long)l);
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l2;
        objectArray2[2] = true;
        objectArray2[1] = this::lambda$throwPotion$0;
        objectArray2[0] = n;
        e8.c("\u00f0", (Object)objectArray2, (long)3653502005305323756L, (long)l);
        return new dC((float)e8.c("\u00da", (Object)e8.c("R", (Object)b, (long)3653565573372913509L, (long)l), (long)3652521028864106382L, (long)l), (float)var7_5);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/e8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = e8.m(l, l2);
            object = o[n];
            try {
                if (!(object instanceof String)) break block2;
                e8.o[n] = clazz = Class.forName(p[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = e8.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = e8.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = e8.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = e8.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = o;
        o[0] = "i\u001f\u0016\u0003\u0001\u0000i\u001f\u0001_\r\u000fsT\u0001A\r\u001at%Q\u001c\\";
        objectArray[1] = "1F},?z1Fjp3u+\rjn3`,|>6d";
        objectArray[2] = "W\\e/\u0000cIT\u007f`|wSY|#";
        objectArray[3] = Float.TYPE;
        e8.p[3] = "java/lang/Float";
        objectArray[4] = "o;D\u00186\u0015y;AB%\u0002npBD)\u0016\u007f7USb\u0001@";
        objectArray[5] = "s\u0006AY\u0014.x\tP\u0016u s\u0002TL";
        objectArray[6] = "\u007fY\u0007,O*tV\u0016c'*zY\u0005";
        objectArray[7] = "*qngj&<qk=y1+:h;u%:}\u007f,>5<";
        objectArray[8] = "\u001f\u001bO(G\u0015j;D'VZ\u000b5O,R\u0000\u007f";
        objectArray[9] = Void.TYPE;
        e8.p[9] = "java/lang/Void";
        objectArray[10] = "0\u00160L#M&\u00165\u00160Z1]6\u0010<N \u001a!\u0007w^8\u001a#\f-\u0013\u0004\u0001#\u0011-T3\u0016";
        objectArray[11] = "<hD)M\u001d*hAs^\n=#BuR\u001e,dUb\u0019\t\u001c";
        objectArray[12] = "\u0016%\u0018^8Cc\u0005\u0013Q)\f\u0002\u000b\u0018Z-Vv";
        objectArray[13] = "]NT \u0012M(n_/\u0003\u0002I`T$\u0007X=";
        objectArray[14] = "0_\u0006?\n2&_\u0003e\u0019%1\u0014\u0000c\u00151 S\u0017t^#\u001c";
        objectArray[15] = "h_Wm\u0018&\u001d\u007f\\b\ti`gOe\u0000 \b";
        objectArray[16] = "C(.Fqh6\b%I`'W\u0006.Bd}#";
        objectArray[17] = Boolean.TYPE;
        e8.p[17] = "java/lang/Boolean";
        objectArray[18] = "]4j\u000fo\"V;{@\b C0{\u000b3";
        objectArray[19] = Integer.TYPE;
        e8.p[19] = "java/lang/Integer";
        objectArray[20] = "D\n_u8CR\nZ/+TEAY)'@T\u0006N>lV\u0018";
        objectArray[21] = "kF\u0012\tvJ`I\u0003F\u0015GuD\f- EdW\u0010\u00017H";
        objectArray[22] = "CM\"\"<V6m)--\u0019Wc\"&)C#";
        objectArray[23] = "W^\u001d2 LA^\u0018h3[V\u0015\u001bn?OGR\fytZ\u0006";
        objectArray[24] = "\u0017*0(PRb\n;'A\u001d\u0003\u00040,EGw";
        objectArray[25] = "`\u0005%yI\\\u0015%.vX\u0013t+%}\\I\u0000";
        objectArray[26] = "Llsh]cGcb'1`Ia`h\u001d";
        objectArray[27] = "N{F\u001cftN{Q@j{T0Q^jnSA\u0006\u0001<";
        objectArray[28] = " \rMI9$6\rH\u0013*3!FK\u0015&'0\u0001\\\u0002m0\u0012";
        objectArray[29] = "\u0015\u007f\\6/D`_W9>\u000b\u0001Q\\2:Qu";
        objectArray[30] = "%3^r!\u001d%3I.-\u0012?xI0-\u00078\t\u001bnu@";
        objectArray[31] = "WV*\u001a!.WV=F-!M\u001d=X-4Jlh\ftw";
        objectArray[32] = "s31qt<\u0006\u0013:~esg\u001d1ua)\u0013";
        objectArray[33] = "\u001b}GeiCn]Ljx\f\u000fSGa|V{";
        objectArray[34] = "\u0013\r\u0004\u001c\u0006Af-\u000f\u0013\u0017\u000e\u0007#\u0004\u0018\u0013Ts";
        objectArray[35] = "W\u0012}ns\rA\u0012x4`\u001aVY{2l\u000eG\u001el%'\u0019p";
        objectArray[36] = "\u0015b\u0000r\u0011Q\u0003b\u0005(\u0002F\u0014)\u0006.\u000eR\u0005n\u00119EB\u001e";
        objectArray[37] = "\u0007\u000bx3 Yr+s<1\u0016\u0013%x75Lg";
        objectArray[38] = "\u000buG;Yw\u000buPgUx\u0011>PyUm\u0016O\u0002'\u0002&";
        objectArray[39] = "\r5eT\u007fD\u0013=\u007f\u001b\u0002T\u0013";
        objectArray[40] = "\u0006\u000f4K\rfYDh\u000f4|7\u0016mXQu\\\u0006dXZ\u0016";
        objectArray[41] = "qY\u0004`cpq\u001b\u001c\u0002s,%C\u000bU$rr\u001bg;v(._\u001dc$}3";
        objectArray[42] = "DA.\t&\fV\u001b(HX\u0007+]+\u0019&\u0013E\u001f&\u001a%nAZ7\u000e1\u0017FU9\u001cX";
        objectArray[43] = "i|\f\u0005.<om\f\u001e\u0014+Tn\u000e\u0014j8:,\u0003\u0017iE>i\u0012\u0003}<9f\u001c\u0011\u0014";
        objectArray[44] = "\u007f3\f`\u001eE\u007f`\u0006q'D\u0007z\u0018yYRi8\u0015zZ/m}\u0004nNVjr\n|'";
        objectArray[45] = "w\u0007pw<\u0013(Dj*]\u001doCx)&p-E ,,H+W.t]\u001ai_o$$\u001dfQ}M";
        objectArray[46] = "p{\u0010\bKQ+#F\u00166Qrx\\\u0000qA\u001bpCSV\u0011r#E\u0002]/p{\u0010\bKQ+#F\u00166";
        objectArray[47] = "%T8\u0013\u001bq%\u0016 q\u000b-qN7&\\s!\u0017[\u0013_(y\u0015k\f\u000b<a";
        objectArray[48] = "\u000f$n%P^T;(e<H[2.ZXI_>R.RLK;\"p^D\u0006B";
        objectArray[49] = "q!\u0011\u0015D',>\u0012C8+\u0013%\bFF?}g\u0005EEB-9\u001e\u0013W/}f\u0018B8";
        objectArray[50] = "\t\u000e\u0005Q\u000e:R\u0010\u0002\u0015kk6\u000f\u001dB\u0015xXM\u0010A\u0016\u0005\b\u0013\u000b\u0017\u0004hXL\rFk";
        objectArray[51] = "\u001f/\u007ff\u001by_+\"g\u007f)\u0007%|g(zVp(\u000b\u0006 \u0001%|5F$\\$";
        objectArray[52] = "<<NhP4dn\u001bu(+h+KiD\u0019;o\u0016?(+?*VnU 42I\u000eB1d)BwE>j;+";
        objectArray[53] = "zitC9~kum\u0017G!\u0016o{\u00129>x-v\u0011:C(smG(.x,k\u0016G";
        objectArray[54] = "QdoQeTWuoJ_Glvm@!P\u00024`C\"-Rj{\u00150@\u00025}D_";
        objectArray[55] = "<)Q\u001f!\u0004.sW^_\u000fS5T\u000f!\u001b=wY\f\"fm)BZ0\u000b=vD\u000b_";
        objectArray[56] = "?\u007fPh!Ug-\u0005uYJkhUi5x=*\t3e/<zWs _bv_>Y";
        objectArray[57] = "CL\u007fT\u001f\u0013C\u000eg6\u0004C\u0006R{Z6\u0017G\f-6\u000bQ\u001bLuO\f^\u0015^\u001c";
        objectArray[58] = "\"~\\\u001f^0y`[[;b\u001d\u007fD\fErs=I\u000fF\u000f#cRYTbs<T\b;";
        objectArray[59] = "\u001fT\u0018\u0016o\f\u000eH\u0001B\u0011XsG\tG{\u0001\u0003LPTo1\u001eI\u0003D!A\u0015\u0010\u0010P\u0011";
        objectArray[60] = "g\u0005?\u00109y<]i\u000eDfj\u001eP\u001c zabb\u0017zg2\u000b1\u0011+l\f";
        objectArray[61] = "M\u0000Ov&`\u0015R\u001ak^\u007f\u0019\u0017Jw2MOU\u0016-c\u001aN\u0005Hm'j\u0010\t@ ^";
        objectArray[62] = "7R9*m\u000eh\u0011#w\f\u00071\f<}e\u000b\b\u0002<mam<\u00149ne\u0014;\u001b7|\f";
        objectArray[63] = "9Z\f\u0000\u0002Fh\u0012\u0000\u0018<Z\u0007\u0014\u0004\u0000FX8O\u001a\u0007\u0002";
        objectArray[64] = "\n#s{0iU`i&QD\"^I\fQkR{( 24\u0011au";
        objectArray[65] = "G\u0006i\\8_A\u0017iG\u0002Oz\u0014kM|[\u0014VfN\u007f&\u0016\u000e(D<OE\byO\u0002";
        objectArray[66] = "C\bz&\u001eFY\f8\"dWF\u0005#.3\u0004\u0016P{B\u0001\u0003Z\u0015'?\n\bB\n";
        objectArray[67] = "\u0001\u0000\u000f'./T\u0007K=Cw:R\rf\"o\u0002T\u001fhz\u001e";
        objectArray[68] = "DZOX\u0013z\u001c\b\u001aEke\u0010MJY\u0007WG\r\u001a\u0004[\u0000\u0017NK@\u0002y\u0010AERk";
        objectArray[69] = "zmbMSk|g:@h~\"ajC6y\"{n?R~${zO\fr,6\u0003";
        objectArray[70] = "n&h\t\b>lw$\u0012u9z\u001bc\bD?e#e\u001aJg\u0014aeC\u000f#tc4\u000f\u0014^";
        objectArray[71] = "hI\u0013\f%\u00070\u001bF\u0011]\u0018<^\u0016\r1*j\u001cJWb}kL\u0014\u0017$\r5@\u001cZ]C5IJ\u00050\u0013jO\u001bj";
        objectArray[72] = "y\tMF5[\u007f\u0018M]\u000fOD\u001bOWq_*YBTr\"/\u0004\u0003[r\\t\\UE\u000f";
        objectArray[73] = "\u007fOM\u0000'oeK\u000f\u0004]~zB\u0014\b\n-*\u0016Hd8*fR\u0010\u00193!~M";
        Object[] objectArray2 = objectArray;
        objectArray[74] = "r;2[c/c'+\u000f\u001dx\u001e==\ncop\u007f0\t`\u0012y(.\u0005e(/u+\u0007\u001d";
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'R' || c == '\u00c1' || c == 'j' || c == '\u00e8') {
                field = e8.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'R' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c1' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'j' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = e8.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00da' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f0' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @Override
    public void d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x52D6E774439DL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = this;
        e8.c("\u00da", (Object)e8.c("j", (long)3245289587163317841L, (long)l), (Object)objectArray2, (long)3245104914223187363L, (long)l);
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = e8.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public dC a(Object[] objectArray) {
        e8 e82;
        long l;
        long l2;
        block78: {
            Object object;
            block77: {
                CallSite callSite;
                long l3;
                block76: {
                    Object object2;
                    block75: {
                        CallSite callSite2;
                        block67: {
                            CallSite callSite3;
                            block68: {
                                CallSite callSite4;
                                CallSite callSite5;
                                long l4;
                                long l5;
                                block73: {
                                    long l6;
                                    block74: {
                                        CallSite callSite6;
                                        long l7;
                                        long l8;
                                        block69: {
                                            block70: {
                                                CallSite callSite7;
                                                block71: {
                                                    block72: {
                                                        CallSite callSite8;
                                                        block65: {
                                                            block66: {
                                                                block63: {
                                                                    block64: {
                                                                        class_310 class_3102;
                                                                        block62: {
                                                                            l2 = (Long)objectArray[0];
                                                                            long l9 = l2;
                                                                            l5 = l9 ^ 0x7C48BDF37842L;
                                                                            l = l9 ^ 0x27251590B815L;
                                                                            l4 = l9 ^ 0x1A99A2A6F024L;
                                                                            l8 = l9 ^ 0xF357432AFL;
                                                                            l6 = l9 ^ 0x40AB6C0A6CD2L;
                                                                            l7 = l9 ^ 0x4DCDFBE1C8B5L;
                                                                            l3 = l9 ^ 0x36DCD8771DA6L;
                                                                            callSite = e8.c("\u00f0", (long)-1174461746525830015L, (long)l2);
                                                                            try {
                                                                                try {
                                                                                    class_3102 = b;
                                                                                    if (callSite != null) break block62;
                                                                                    if (e8.c("R", (Object)class_3102, (long)-1174693764319926177L, (long)l2) != null) return null;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw e8.c("\u00f0", (Object)matchException, (long)-1173299784437987113L, (long)l2);
                                                                                }
                                                                                class_3102 = b;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw e8.c("\u00f0", (Object)matchException, (long)-1173299784437987113L, (long)l2);
                                                                            }
                                                                        }
                                                                        try {
                                                                            try {
                                                                                callSite8 = e8.c("\u00da", (Object)class_3102, (long)-1173452446991243022L, (long)l2);
                                                                                if (callSite != null) break block63;
                                                                                if (callSite8 != false) break block64;
                                                                                return null;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw e8.c("\u00f0", (Object)matchException, (long)-1173299784437987113L, (long)l2);
                                                                            }
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw e8.c("\u00f0", (Object)matchException, (long)-1173299784437987113L, (long)l2);
                                                                        }
                                                                    }
                                                                    Object[] objectArray2 = new Object[2];
                                                                    objectArray2[1] = l7;
                                                                    objectArray2[0] = Float.valueOf((float)e8.c("\u00da", (Object)((Float)((Object)e8.c("\u00da", (Object)this.a, (long)-1177237089958159857L, (long)l2))), (long)-1177668518107343991L, (long)l2));
                                                                    callSite8 = e8.c("\u00da", (Object)this.e, (Object)objectArray2, (long)-1174315624112021682L, (long)l2);
                                                                }
                                                                try {
                                                                    try {
                                                                        if (callSite != null) break block65;
                                                                        if (callSite8 != false) break block66;
                                                                        return null;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw e8.c("\u00f0", (Object)matchException, (long)-1173299784437987113L, (long)l2);
                                                                    }
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw e8.c("\u00f0", (Object)matchException, (long)-1173299784437987113L, (long)l2);
                                                                }
                                                            }
                                                            callSite8 = e8.c("\u00da", (Object)e8.c("R", (Object)b, (long)-1174532135607403934L, (long)l2), (Object)e8.c("j", (long)-1177184109594532509L, (long)l2), (long)-1174214496632878121L, (long)l2);
                                                        }
                                                        callSite3 = callSite8;
                                                        callSite2 = e8.c("\u00da", (Object)e8.c("R", (Object)b, (long)-1174532135607403934L, (long)l2), (Object)e8.c("j", (long)-1176831148167622012L, (long)l2), (long)-1174214496632878121L, (long)l2);
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            object2 = e8.c("\u00da", (Object)e8.c("R", (Object)b, (long)-1174532135607403934L, (long)l2), (long)-1177595338632434667L, (long)l2);
                                                                            if (callSite != null) break block67;
                                                                            if (object2 == false) break block68;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw e8.c("\u00f0", (Object)matchException, (long)-1173299784437987113L, (long)l2);
                                                                        }
                                                                        object2 = callSite3;
                                                                        if (callSite != null) break block69;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw e8.c("\u00f0", (Object)matchException, (long)-1173299784437987113L, (long)l2);
                                                                    }
                                                                    if (object2 != false) break block70;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw e8.c("\u00f0", (Object)matchException, (long)-1173299784437987113L, (long)l2);
                                                                }
                                                                Object[] objectArray3 = new Object[2];
                                                                objectArray3[1] = l7;
                                                                objectArray3[0] = Float.valueOf(300.0f);
                                                                object2 = e8.c("\u00da", (Object)this.g, (Object)objectArray3, (long)-1174315624112021682L, (long)l2);
                                                                if (callSite != null) break block69;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw e8.c("\u00f0", (Object)matchException, (long)-1173299784437987113L, (long)l2);
                                                            }
                                                            if (object2 == false) break block70;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw e8.c("\u00f0", (Object)matchException, (long)-1173299784437987113L, (long)l2);
                                                        }
                                                        Object[] objectArray4 = new Object[4];
                                                        objectArray4[3] = l6;
                                                        objectArray4[2] = e8.c("j", (long)-1177184109594532509L, (long)l2);
                                                        objectArray4[1] = (int)e8.b("b", (int)28804, (long)(0x6C3DA8E7AB289D6EL ^ l2));
                                                        objectArray4[0] = 0;
                                                        callSite6 = e8.c("\u00f0", (Object)objectArray4, (long)-1176759222413373603L, (long)l2);
                                                        try {
                                                            try {
                                                                callSite7 = callSite6;
                                                                if (callSite != null) break block71;
                                                                if (callSite7 == null) break block72;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw e8.c("\u00f0", (Object)matchException, (long)-1173299784437987113L, (long)l2);
                                                            }
                                                            Object[] objectArray5 = new Object[1];
                                                            objectArray5[0] = l4;
                                                            e8.c("\u00da", (Object)this.e, (Object)objectArray5, (long)-1174143122067281510L, (long)l2);
                                                            Object[] objectArray6 = new Object[1];
                                                            objectArray6[0] = l4;
                                                            e8.c("\u00da", (Object)this.g, (Object)objectArray6, (long)-1174143122067281510L, (long)l2);
                                                            Object[] objectArray7 = new Object[2];
                                                            objectArray7[1] = l8;
                                                            objectArray7[0] = (int)e8.c("\u00da", (Object)callSite6, (long)-1173676925789633630L, (long)l2);
                                                            return e8.c("\u00da", (Object)this, (Object)objectArray7, (long)-1176612007039004801L, (long)l2);
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw e8.c("\u00f0", (Object)matchException, (long)-1173299784437987113L, (long)l2);
                                                        }
                                                    }
                                                    try {
                                                        object2 = 0;
                                                        if (callSite != null) break block69;
                                                        Object[] objectArray8 = new Object[4];
                                                        objectArray8[3] = l6;
                                                        objectArray8[2] = e8.c("j", (long)-1177184109594532509L, (long)l2);
                                                        objectArray8[1] = (int)e8.b("b", (int)26886, (long)(0x3DC9DBCE603704EFL ^ l2));
                                                        objectArray8[0] = (int)object2;
                                                        callSite7 = e8.c("\u00f0", (Object)objectArray8, (long)-1176759222413373603L, (long)l2);
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw e8.c("\u00f0", (Object)matchException, (long)-1173299784437987113L, (long)l2);
                                                    }
                                                }
                                                callSite5 = callSite7;
                                                try {
                                                    if (callSite5 != null) {
                                                        Object[] objectArray9 = new Object[2];
                                                        objectArray9[1] = l5;
                                                        objectArray9[0] = (int)e8.c("\u00da", (Object)callSite5, (long)-1173676925789633630L, (long)l2);
                                                        e8.c("\u00da", (Object)this, (Object)objectArray9, (long)-1174289164544500646L, (long)l2);
                                                        Object[] objectArray10 = new Object[1];
                                                        objectArray10[0] = l4;
                                                        e8.c("\u00da", (Object)this.e, (Object)objectArray10, (long)-1174143122067281510L, (long)l2);
                                                        return null;
                                                    }
                                                }
                                                catch (MatchException matchException) {
                                                    throw e8.c("\u00f0", (Object)matchException, (long)-1173299784437987113L, (long)l2);
                                                }
                                            }
                                            object2 = callSite2;
                                        }
                                        try {
                                            try {
                                                try {
                                                    if (callSite != null) break block67;
                                                    if (object2 != false) break block68;
                                                }
                                                catch (MatchException matchException) {
                                                    throw e8.c("\u00f0", (Object)matchException, (long)-1173299784437987113L, (long)l2);
                                                }
                                                Object[] objectArray11 = new Object[2];
                                                objectArray11[1] = l7;
                                                objectArray11[0] = Float.valueOf(300.0f);
                                                object2 = e8.c("\u00da", (Object)this.h, (Object)objectArray11, (long)-1174315624112021682L, (long)l2);
                                                if (callSite != null) break block67;
                                            }
                                            catch (MatchException matchException) {
                                                throw e8.c("\u00f0", (Object)matchException, (long)-1173299784437987113L, (long)l2);
                                            }
                                            if (object2 == false) break block68;
                                        }
                                        catch (MatchException matchException) {
                                            throw e8.c("\u00f0", (Object)matchException, (long)-1173299784437987113L, (long)l2);
                                        }
                                        Object[] objectArray12 = new Object[4];
                                        objectArray12[3] = l6;
                                        objectArray12[2] = e8.c("j", (long)-1176831148167622012L, (long)l2);
                                        objectArray12[1] = (int)e8.b("b", (int)32611, (long)(0x1CF198451D2F128BL ^ l2));
                                        objectArray12[0] = 0;
                                        callSite6 = e8.c("\u00f0", (Object)objectArray12, (long)-1176759222413373603L, (long)l2);
                                        try {
                                            try {
                                                callSite4 = callSite6;
                                                if (callSite != null) break block73;
                                                if (callSite4 == null) break block74;
                                            }
                                            catch (MatchException matchException) {
                                                throw e8.c("\u00f0", (Object)matchException, (long)-1173299784437987113L, (long)l2);
                                            }
                                            Object[] objectArray13 = new Object[1];
                                            objectArray13[0] = l4;
                                            e8.c("\u00da", (Object)this.e, (Object)objectArray13, (long)-1174143122067281510L, (long)l2);
                                            Object[] objectArray14 = new Object[1];
                                            objectArray14[0] = l4;
                                            e8.c("\u00da", (Object)this.h, (Object)objectArray14, (long)-1174143122067281510L, (long)l2);
                                            Object[] objectArray15 = new Object[2];
                                            objectArray15[1] = l8;
                                            objectArray15[0] = (int)e8.c("\u00da", (Object)callSite6, (long)-1173676925789633630L, (long)l2);
                                            return e8.c("\u00da", (Object)this, (Object)objectArray15, (long)-1176612007039004801L, (long)l2);
                                        }
                                        catch (MatchException matchException) {
                                            throw e8.c("\u00f0", (Object)matchException, (long)-1173299784437987113L, (long)l2);
                                        }
                                    }
                                    try {
                                        object2 = 0;
                                        if (callSite != null) break block67;
                                        Object[] objectArray16 = new Object[4];
                                        objectArray16[3] = l6;
                                        objectArray16[2] = e8.c("j", (long)-1176831148167622012L, (long)l2);
                                        objectArray16[1] = (int)e8.b("b", (int)1302, (long)(0x692D4ECEFF5E8FDL ^ l2));
                                        objectArray16[0] = (int)object2;
                                        callSite4 = e8.c("\u00f0", (Object)objectArray16, (long)-1176759222413373603L, (long)l2);
                                    }
                                    catch (MatchException matchException) {
                                        throw e8.c("\u00f0", (Object)matchException, (long)-1173299784437987113L, (long)l2);
                                    }
                                }
                                callSite5 = callSite4;
                                try {
                                    if (callSite5 != null) {
                                        Object[] objectArray17 = new Object[2];
                                        objectArray17[1] = l5;
                                        objectArray17[0] = (int)e8.c("\u00da", (Object)callSite5, (long)-1173676925789633630L, (long)l2);
                                        e8.c("\u00da", (Object)this, (Object)objectArray17, (long)-1174289164544500646L, (long)l2);
                                        Object[] objectArray18 = new Object[1];
                                        objectArray18[0] = l4;
                                        e8.c("\u00da", (Object)this.e, (Object)objectArray18, (long)-1174143122067281510L, (long)l2);
                                        return null;
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw e8.c("\u00f0", (Object)matchException, (long)-1173299784437987113L, (long)l2);
                                }
                            }
                            object2 = callSite3;
                        }
                        try {
                            if (callSite != null) break block75;
                            if (object2 == false) return null;
                        }
                        catch (MatchException matchException) {
                            throw e8.c("\u00f0", (Object)matchException, (long)-1173299784437987113L, (long)l2);
                        }
                        object2 = callSite2;
                    }
                    try {
                        try {
                            try {
                                if (object2 == false) return null;
                                object = this.i;
                                if (callSite != null) break block76;
                            }
                            catch (MatchException matchException) {
                                throw e8.c("\u00f0", (Object)matchException, (long)-1173299784437987113L, (long)l2);
                            }
                            if (object == null) return null;
                        }
                        catch (MatchException matchException) {
                            throw e8.c("\u00f0", (Object)matchException, (long)-1173299784437987113L, (long)l2);
                        }
                        object = this.j;
                    }
                    catch (MatchException matchException) {
                        throw e8.c("\u00f0", (Object)matchException, (long)-1173299784437987113L, (long)l2);
                    }
                }
                try {
                    try {
                        try {
                            if (callSite != null) break block77;
                            if (object == null) return null;
                        }
                        catch (MatchException matchException) {
                            throw e8.c("\u00f0", (Object)matchException, (long)-1173299784437987113L, (long)l2);
                        }
                        Object[] objectArray19 = new Object[3];
                        objectArray19[2] = l3;
                        objectArray19[1] = (int)e8.c("\u00da", (Object)this.j, (long)-1173676925789633630L, (long)l2);
                        objectArray19[0] = (int)e8.c("\u00da", (Object)this.i, (long)-1173676925789633630L, (long)l2);
                        e8.c("\u00f0", (Object)objectArray19, (long)-1174423101214314028L, (long)l2);
                        this.i = null;
                        e82 = this;
                        if (callSite != null) break block78;
                    }
                    catch (MatchException matchException) {
                        throw e8.c("\u00f0", (Object)matchException, (long)-1173299784437987113L, (long)l2);
                    }
                    object = e8.c("\u00da", (Object)e82.d, (long)-1177237089958159857L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw e8.c("\u00f0", (Object)matchException, (long)-1173299784437987113L, (long)l2);
                }
            }
            try {
                if (e8.c("\u00da", (Object)((Boolean)object), (long)-1173500717750841573L, (long)l2) == false) return null;
                e82 = this;
            }
            catch (MatchException matchException) {
                throw e8.c("\u00f0", (Object)matchException, (long)-1173299784437987113L, (long)l2);
            }
        }
        Object[] objectArray20 = new Object[1];
        objectArray20[0] = l;
        e8.c("\u00da", (Object)e82, (Object)objectArray20, (long)-1174021395910524735L, (long)l2);
        return null;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return e8.c("\u00f0", (Object)((Object)q_0.Mace), (long)-2444996560452662525L, (long)l);
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
            case 0 -> 58;
            case 1 -> 19;
            case 2 -> 6;
            case 3 -> 12;
            case 4 -> 3;
            case 5 -> 40;
            case 6 -> 36;
            case 7 -> 49;
            case 8 -> 54;
            case 9 -> 25;
            case 10 -> 23;
            case 11 -> 20;
            case 12 -> 10;
            case 13 -> 26;
            case 14 -> 9;
            case 15 -> 33;
            case 16 -> 37;
            case 17 -> 46;
            case 18 -> 43;
            case 19 -> 48;
            case 20 -> 2;
            case 21 -> 18;
            case 22 -> 24;
            case 23 -> 27;
            case 24 -> 13;
            case 25 -> 63;
            case 26 -> 7;
            case 27 -> 47;
            case 28 -> 11;
            case 29 -> 22;
            case 30 -> 51;
            case 31 -> 57;
            case 32 -> 41;
            case 33 -> 1;
            case 34 -> 50;
            case 35 -> 4;
            case 36 -> 30;
            case 37 -> 56;
            case 38 -> 44;
            case 39 -> 59;
            case 40 -> 55;
            case 41 -> 28;
            case 42 -> 39;
            case 43 -> 61;
            case 44 -> 17;
            case 45 -> 42;
            case 46 -> 60;
            case 47 -> 45;
            case 48 -> 38;
            case 49 -> 35;
            case 50 -> 5;
            case 51 -> 8;
            case 52 -> 32;
            case 53 -> 53;
            case 54 -> 15;
            case 55 -> 16;
            case 56 -> 21;
            case 57 -> 29;
            case 58 -> 34;
            case 59 -> 62;
            case 60 -> 31;
            case 61 -> 52;
            case 62 -> 14;
            default -> 0;
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
        e8.p[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = e8.m(l, l2);
        Object object = o[n];
        if (object instanceof String) {
            String string = p[n];
            int n2 = string.indexOf(8);
            Class clazz = e8.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = e8.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = e8.g(clazz3, string2, clazz2)) != null) {
                    e8.o[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = e8.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        e8.o[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = e8.n(384417463069405L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = e8.m(l, l2);
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
                clazz3 = e8.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = e8.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = e8.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        e8.o[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = e8.n(384417463069405L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = e8.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        e8.o[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = e8.n(384417463069405L, 0L);
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

    private void j(Object[] objectArray) {
        e8 e82;
        long l;
        long l2;
        long l3;
        long l4;
        int n;
        block8: {
            block9: {
                n = (Integer)objectArray[0];
                l4 = (Long)objectArray[1];
                long l5 = l4 = k ^ l4;
                l3 = l5 ^ 0x4D68E18A67CEL;
                l2 = l5 ^ 0x6255AD701FF7L;
                l = l5 ^ 0x612D9B5B8A4CL;
                CallSite callSite = e8.c("\u00f0", (long)8672013903261569899L, (long)l4);
                try {
                    try {
                        try {
                            try {
                                e82 = this;
                                if (callSite != null) break block8;
                                if (e82.i != null) break block9;
                            }
                            catch (MatchException matchException) {
                                throw e8.c("\u00f0", (Object)matchException, (long)8673314951389290301L, (long)l4);
                            }
                            e82 = this;
                            if (callSite != null) break block8;
                        }
                        catch (MatchException matchException) {
                            throw e8.c("\u00f0", (Object)matchException, (long)8673314951389290301L, (long)l4);
                        }
                        if (e82.j != null) break block9;
                    }
                    catch (MatchException matchException) {
                        throw e8.c("\u00f0", (Object)matchException, (long)8673314951389290301L, (long)l4);
                    }
                    this.i = e8.c("\u00f0", (int)n, (long)8671867284820582379L, (long)l4);
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l2;
                    this.j = e8.c("\u00f0", (int)e8.c("\u00f0", (Object)objectArray2, (long)8665908586190773438L, (long)l4), (long)8671867284820582379L, (long)l4);
                }
                catch (MatchException matchException) {
                    throw e8.c("\u00f0", (Object)matchException, (long)8673314951389290301L, (long)l4);
                }
            }
            e82 = this;
        }
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        e8.c("\u00da", (Object)e82.f, (Object)objectArray3, (long)8673595316787396208L, (long)l4);
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l2;
        Object[] objectArray5 = new Object[3];
        objectArray5[2] = l;
        objectArray5[1] = (int)e8.c("\u00f0", (Object)objectArray4, (long)8665908586190773438L, (long)l4);
        objectArray5[0] = n;
        e8.c("\u00f0", (Object)objectArray5, (long)8672186411966211646L, (long)l4);
    }

    private void lambda$throwPotion$0() {
        long l = k ^ 0x338026B4E41EL;
        long l2 = l ^ 0xA3B04472C94L;
        CallSite callSite = e8.c("\u00da", (Object)e8.c("R", (Object)b, (long)845672384202743405L, (long)l), (long)844835464352024951L, (long)l);
        e8.c("\u00da", (Object)e8.c("R", (Object)b, (long)845672384202743405L, (long)l), (float)(e8.c("\u00da", (Object)((Float)((Object)e8.c("\u00da", (Object)this.c, (long)839581211167096320L, (long)l))), (long)839713573207340934L, (long)l) - 1.0f + e8.c("\u00da", (Object)dn_0.a, (long)844999102898688031L, (long)l)), (long)839920839453635236L, (long)l);
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = e8.c("j", (long)845220588036896226L, (long)l);
        e8.c("\u00f0", (Object)objectArray, (long)845850519268004123L, (long)l);
        e8.c("\u00da", (Object)e8.c("R", (Object)b, (long)845672384202743405L, (long)l), (float)callSite, (long)839920839453635236L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(e8.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(e8.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


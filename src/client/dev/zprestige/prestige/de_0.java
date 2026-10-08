/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.Pair
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aq_0;
import dev.zprestige.prestige.bT;
import dev.zprestige.prestige.bU;
import dev.zprestige.prestige.bW;
import dev.zprestige.prestige.c9;
import dev.zprestige.prestige.dc_0;
import dev.zprestige.prestige.dt_0;
import dev.zprestige.prestige.g1;
import dev.zprestige.prestige.gK;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.m_0;
import it.unimi.dsi.fastutil.Pair;
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
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.de
 */
public abstract class de_0
extends dc_0 {
    protected c9 c;
    protected int d;
    protected int e;
    protected boolean f;
    public bU g;
    public bW h;
    private static final int i;
    protected final Map j;
    private Consumer k;
    private boolean l;
    private static final long n;
    private static final long[] s;
    private static final Integer[] t;
    private static final Map u;
    private static final Object[] D;
    private static final String[] E;

    protected de_0(String string, String string2, long l) {
        long l2 = l = n ^ l;
        long l3 = l2 ^ 0x223816C56962L;
        long l4 = l2 ^ 0x10F128636970L;
        long l5 = l2 ^ 0x3A410E841D49L;
        super(string, string2, false, l4);
        this.d = -1;
        this.e = -1;
        this.f = 0;
        Object[] objectArray = new Object[1];
        objectArray[0] = l3;
        this.g = de_0.f("\u00d0", (Object)objectArray, (long)1259065671439082417L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l5;
        objectArray2[0] = (int)de_0.b("x", (int)13687, (long)(0x4FA87CEFA9BB98CFL ^ l));
        this.h = de_0.f("\u00d0", (Object)objectArray2, (long)1259507650696663595L, (long)l);
        this.j = new g1(this, (int)de_0.b("x", (int)62, (long)(0x72073B71222F2D8EL ^ l)), 0.75f, true);
        this.l = 0;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                de_0.n = hc.a(8625678327791546971L, 3472452668950582494L, MethodHandles.lookup().lookupClass()).a(251274420501647L);
                de_0.D = new Object[78];
                de_0.E = new String[78];
                de_0.b();
                de_0.u = new HashMap<K, V>(13);
                var0 = de_0.n ^ 104027012293713L;
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
                var8_3 = new long[18];
                var5_4 = 0;
                var6_5 = "l\u00daN#<(\u00fe\u00b4\u00fa\u00ca\u00c1\u00e0\u00cf\u00d1\u00f19\u0004x\u00cd\u00bdh\u0093\u00f1@3\u0084*{\u00bc\n\u0004~\\\f$qG\n\u00dfVw\u0018;\u007f:5\u001ajN\u00f5g\u00d7\u0002\u0019\u00e4x2\u00a8+\u0089\u00fdx\u00fd\u00a7\u0005\u0085\u00b6S\u008c{\u00da)\u0000\u0011\u008b\u0086I@\u00aa\u0089\u0006\u00d2|\u009b\u00df\u0096\r\u00c3\u009b$\u00f8\u00e7\u0083\u001c\u001bG\u0097y\u008c\u00ae\u008e\u00f0-{\u00cd\u00dfioO\u00c2\u00d0\u00a8\u0019|a}\u00d4\u00b6\u00dc\u00ca\u00e6\u00c0\u00dd\u00bf\u00ecK\u00af\u008a";
                var7_6 = "l\u00daN#<(\u00fe\u00b4\u00fa\u00ca\u00c1\u00e0\u00cf\u00d1\u00f19\u0004x\u00cd\u00bdh\u0093\u00f1@3\u0084*{\u00bc\n\u0004~\\\f$qG\n\u00dfVw\u0018;\u007f:5\u001ajN\u00f5g\u00d7\u0002\u0019\u00e4x2\u00a8+\u0089\u00fdx\u00fd\u00a7\u0005\u0085\u00b6S\u008c{\u00da)\u0000\u0011\u008b\u0086I@\u00aa\u0089\u0006\u00d2|\u009b\u00df\u0096\r\u00c3\u009b$\u00f8\u00e7\u0083\u001c\u001bG\u0097y\u008c\u00ae\u008e\u00f0-{\u00cd\u00dfioO\u00c2\u00d0\u00a8\u0019|a}\u00d4\u00b6\u00dc\u00ca\u00e6\u00c0\u00dd\u00bf\u00ecK\u00af\u008a".length();
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
                    var6_5 = "\u00bc\u00831(\u00c79\u00eb\u00cb\u008f\u00a8\u00acU%\u00c1\u0095 ";
                    var7_6 = "\u00bc\u00831(\u00c79\u00eb\u00cb\u008f\u00a8\u00acU%\u00c1\u0095 ".length();
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
        de_0.s = var8_3;
        de_0.t = new Integer[18];
        de_0.i = (int)de_0.b("x", (int)6465, (long)(var0 ^ 2485936248851567852L));
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (E[n3] != null) {
            return n3;
        }
        Object object = D[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 2;
            case 1 -> 44;
            case 2 -> 48;
            case 3 -> 1;
            case 4 -> 56;
            case 5 -> 60;
            case 6 -> 23;
            case 7 -> 37;
            case 8 -> 21;
            case 9 -> 16;
            case 10 -> 46;
            case 11 -> 7;
            case 12 -> 39;
            case 13 -> 6;
            case 14 -> 8;
            case 15 -> 52;
            case 16 -> 11;
            case 17 -> 30;
            case 18 -> 41;
            case 19 -> 31;
            case 20 -> 33;
            case 21 -> 43;
            case 22 -> 18;
            case 23 -> 45;
            case 24 -> 17;
            case 25 -> 53;
            case 26 -> 0;
            case 27 -> 10;
            case 28 -> 40;
            case 29 -> 63;
            case 30 -> 62;
            case 31 -> 59;
            case 32 -> 57;
            case 33 -> 51;
            case 34 -> 22;
            case 35 -> 12;
            case 36 -> 28;
            case 37 -> 35;
            case 38 -> 24;
            case 39 -> 14;
            case 40 -> 42;
            case 41 -> 19;
            case 42 -> 27;
            case 43 -> 50;
            case 44 -> 26;
            case 45 -> 58;
            case 46 -> 54;
            case 47 -> 47;
            case 48 -> 32;
            case 49 -> 5;
            case 50 -> 36;
            case 51 -> 3;
            case 52 -> 4;
            case 53 -> 38;
            case 54 -> 49;
            case 55 -> 9;
            case 56 -> 15;
            case 57 -> 34;
            case 58 -> 29;
            case 59 -> 20;
            case 60 -> 13;
            case 61 -> 25;
            case 62 -> 61;
            default -> 55;
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
        de_0.E[n3] = new String(cArray);
        return n3;
    }

    protected final void e(Object[] objectArray) {
        block8: {
            de_0 de_02;
            CallSite callSite;
            long l;
            long l2;
            block6: {
                l2 = (Long)objectArray[0];
                l = (l2 = n ^ l2) ^ 0x2C407C549872L;
                callSite = de_0.f("\u00d0", (int)de_0.f("\u00ff", (Object)de_0.f("\u00ff", (Object)this, (Object)new Object[0], (long)-1183844139917841406L, (long)l2), (Object)new Object[0], (long)-1183390543409384467L, (long)l2), (long)-1184558624656831494L, (long)l2);
                CallSite callSite2 = de_0.f("\u00d0", (long)-1186251819283442701L, (long)l2);
                try {
                    block7: {
                        try {
                            try {
                                de_02 = this;
                                if (callSite2 != null) break block6;
                                if (de_02.k == null) break block7;
                            }
                            catch (MatchException matchException) {
                                throw de_0.f("\u00d0", (Object)matchException, (long)-1184110753971056396L, (long)l2);
                            }
                            de_0.f("\u00ff", (Object)this.k, (Object)callSite, (long)-1184237878201670441L, (long)l2);
                            if (callSite2 == null) break block8;
                        }
                        catch (MatchException matchException) {
                            throw de_0.f("\u00d0", (Object)matchException, (long)-1184110753971056396L, (long)l2);
                        }
                    }
                    de_02 = this;
                }
                catch (MatchException matchException) {
                    throw de_0.f("\u00d0", (Object)matchException, (long)-1184110753971056396L, (long)l2);
                }
            }
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l;
            objectArray2[0] = callSite;
            de_0.f("\u00ff", (Object)de_02, (Object)objectArray2, (long)-1185415719849519313L, (long)l2);
        }
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3CCC;
        if (t[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = s[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])u.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    u.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/de", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            de_0.t[n2] = n3;
        }
        return t[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = de_0.b(n, l);
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
            throw new RuntimeException("dev/zprestige/prestige/de" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = de_0.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void b() {
        Object[] objectArray = D;
        D[0] = "i4D\u0005\u001f0\u007f4A_\f'h\u007fBY\u00003y8UNK\"Z";
        objectArray[1] = ")>Pjo2\\\u001e[e~}=\u0010Pnz'I";
        objectArray[2] = Void.TYPE;
        de_0.E[2] = "java/lang/Void";
        objectArray[3] = "k[2{}Hk[%'qGq\u0010%9qRvaud ";
        objectArray[4] = "Mx\u0004\u000f7,Mx\u0013S;#W3\u0013M;6PBA\u0011nt";
        objectArray[5] = "b<\u001f\t\u0018at<\u001aS\u000bvcw\u0019U\u0007br0\u000eBLpN";
        objectArray[6] = "C\u001b1JZ{6;:EK4K#)BB}#";
        objectArray[7] = "/#a\u0012\"[9#dH1L.hgN=X?/pYvI\u001e";
        objectArray[8] = "x~UcLe\r^^l]*lPUgYp\u0018";
        objectArray[9] = "$&{\u0016\u001b?Q\u0006p\u0019\np0\b{\u0012\u000e*D";
        objectArray[10] = "$\rJ;@fQ-A4Q)0#J?UsD";
        objectArray[11] = "\b\u0011\u0013\\0\u0013}1\u0018S!\\\u001c?\u0013X%\u0006h";
        objectArray[12] = Integer.TYPE;
        de_0.E[12] = "java/lang/Integer";
        objectArray[13] = "\u001f\"E\t;E\t\"@S(R\u001eiCU$F\u000f.TBoQ\u001e";
        objectArray[14] = "\u001aOa7=\u0001\u0011@px^\f\u0004M\u007f\u0013k\u000e\u0015^c?|\u0003";
        objectArray[15] = "\"\u0014\u007fl+\u00074\u0014z68\u0010#_y04\u00042\u0018n'\u007f\u00167";
        objectArray[16] = "(\u007f`\u0001nb]_k\u000e\u007f-<Q`\u0005{wH";
        objectArray[17] = "D!wq\u001c\rZ)m>A\f\\%`}\u001c+Z2dq_";
        objectArray[18] = ";\u001c\f\u0001-d%\u0014\u0016Ned?\u001e\u000e\tl\u007f\u007f>\u0015\u000epd<\u0018\b";
        objectArray[19] = "XoY\u0015c(-OR\u001argLAY\u0011v=8";
        objectArray[20] = "R\u000bX`\u0012+L\u0003B/Z+V\tZhS0\u0016:\\dX7[\u000bZd";
        objectArray[21] = "S\u001cej#o&<ne2 G2en6z3";
        objectArray[22] = "\u0017*ki-7b\n`f<x\u0003\u0004km8\"w";
        objectArray[23] = "+iV}\u0019P=iS'\nG*\"P!\u0006S;eG6MB\u001b";
        objectArray[24] = "OT4bxP:t?mi\u001f[z4fmE/";
        objectArray[25] = "\u0000t\u00074p,uT\f;ac\u0014Z\u00070e9`";
        objectArray[26] = "\u001e\u0018y\f\u0015B\b\u0018|V\u0006U\u001fS\u007fP\nA\u000e\u0014hGAV\u0019";
        objectArray[27] = "\u0006_\b\u0006](s\u007f\u0003\tLg\u0012q\b\u0002H=f";
        objectArray[28] = "cy)E\u0012\u001cuy,\u001f\u0001\u000bb2/\u0019\r\u001fsu8\u000eF\nS";
        objectArray[29] = "\u0005\u0004RA\rC\u0013\u0004W\u001b\u001eT\u0004OT\u001d\u0012@\u0015\bC\nYT+";
        objectArray[30] = "yJ\u0004DD]\fj\u000fKU\u0012md\u0004@QH\u0019";
        objectArray[31] = "@\u001a4$)RK\u0015%kH\\@\u001e!1";
        objectArray[32] = "z7'%\u0003z\u000f\u0017,*\u00125n\u0019'!\u0016o\u001a";
        objectArray[33] = "6S\u001feScCs\u0014jB,\"}\u001faFvV";
        objectArray[34] = "9\u0000R2lY/\u0000Wh\u007fN8KTnsZ)\fCy8Jd";
        objectArray[35] = "x}zO)b\r]q@8-lSzK<w\u0018";
        objectArray[36] = "y\u000f7)<b|\u001a<)?es\u00137k~RZLa";
        objectArray[37] = "\\-l,a\t)\rg#pFH\u0003l(t\u001c<";
        objectArray[38] = Boolean.TYPE;
        de_0.E[38] = "java/lang/Boolean";
        objectArray[39] = "O\u0007[m\u0001\u0017Y\u0007^7\u0012\u0000NL]1\u001e\u0014_\u000bJ&U\u0004m";
        objectArray[40] = "~~%|{6\u000b^.sjyjP%xn#\u001e";
        objectArray[41] = "\u0010\u0019IUC \u0014\u0004ID^ W\u000b\u0006SY<\r\u0004\u000b\u000e}(\u0010\u001f";
        objectArray[42] = "F(iC4\u0007P(l\u0019'\u0010Gco\u001f+\u0004V$x\b`\u0013V";
        objectArray[43] = "Yf(oUr,F#`D=MH(k@g9";
        objectArray[44] = "<~QkMJgc\u001d4#\u0010\rgP~R\u0006qk\u0013~Izb Q2\u001a\u0001d#Xc#";
        objectArray[45] = "\u000b\u0010#3`$P\rol\u000e}:\t\"&\u007fhF\u0005a&d\u0014\\\u0013vout\u0007\u0006bk\u000e";
        objectArray[46] = "\nL?Q\u0017U\u000eI9FhW]H0D\u0004e\n\u000en\u0013S2\u000bYlG\u0002WHQ)\u001eh";
        objectArray[47] = "9\u0019$6,::G tW:\u0002F*~j3>Fw33P";
        objectArray[48] = "AR+W\u0001>]\u000f\"Dnk]\u007f)Q\u0007n]^H\u001a\u001eb\u0006\u0003s\u0013_`\\3qX\u000faUY%R\u0004a9";
        objectArray[49] = "\\O^\n\u0019<\\UUeMM\u001d\u0003W\u0014Z1\u0011@W\u000f&q\u001dIJZWq\u0007B%";
        objectArray[50] = "8_ijaAe\ti<\\B\u0005I($-TyEk$6(<Fx30BhLs3\\";
        objectArray[51] = "h\"VpD\u007f)}Twxn\u0012a^x\tsnm\u001dx\u0012\u000fh\"VpD\u007f)}Twx";
        objectArray[52] = "o\u001ed~eQ2Hd(XQR\b%0)D.\u0004f028o\u001ed~eQ2Hd(X";
        objectArray[53] = "Li\b52\u007fLs\u0003Zf\u000e\r%\u0001+qr\u0001f\u00010\r7\u0002u\u00166gc\b~\u0016Z";
        objectArray[54] = "mVaTL>6CuP77\u000bL5\u001dF\"w@v\u001d]^2Ce\n[4fIn\n7";
        objectArray[55] = "\u001b}glz\u000fCa5=\u0003Zx-'k<\u0003C$fif3\u001b}glz\u000fCa5=\u0003";
        objectArray[56] = "+|^XaK7!WK\u000e\u001e7P[Ld\u0015>\u001d\rUhNc&\u0004\u0014j\u0014S$ODk\u001d9pEOkq";
        objectArray[57] = "l }A\u000eBp}tRa\u0017p\u000es@+\u001fs%sU\u0007x$1x\u0003QC-pzYa\u0001e,x[\u0004\u0012t>\u007f<";
        objectArray[58] = "'.k>]:'4`Q\u000bKfbb \u001e7j!b;bwf(\u007fn\u0013w|#\u0010";
        objectArray[59] = "\u00132\fB;!H/@\u001dUz\"+\rW$m^'NW?\u0011\u001b$]@9{O.V@U";
        objectArray[60] = "j(X\u0013x\u0015p$H[\u0012\u0002\u0016i\u0010\u0019c\u0014jeS\u0019xhoeL\ru\r|t^\n\u0012";
        objectArray[61] = "rH8jt0}Ry(\u000f?xF8>uQt\u0012-7w-uBx1\u000f:s^}(n5i\u001f?S";
        objectArray[62] = "lvrt_\u00057k>+1Z]osa@I!c0a[5d`#v]_0j(v1";
        objectArray[63] = "\u0010vl\u0017\":S~)NH:Fg0\u0014$\b\u0017&hMHo[}oCsf\u001a\u007f5s";
        objectArray[64] = "/\\|,/\u000b/FwC}zn\u0010u2l\u0006bSu)\u0010Ca@b/z\u0017kKbC";
        objectArray[65] = "$2\r\u0010\u0007\u00068f\u000b\na\u0003E P\u0018\u0010\u00169,\u0013\u0018\u000bj'#\u0018\u0011\u001e\u0018x>ZUa";
        objectArray[66] = "\u001d\u001d\u0003K\b(@K\u0003\u001d5, \u000bB\u0005D=\\\u0007\u0001\u0005_A\u0019\u0004\u0012\u0012Y+M\u000e\u0019\u00125";
        objectArray[67] = "\u0011|:,=g\u0005&#9Oqx`h5>d\u0004l+5%\u0018\u0013w%~4y\u001cmd<O";
        objectArray[68] = "Ff;]|&I|z\u001f\u0007)Jv\n\rl'-g7\u001b:v\u0012e.\u0000`G\u0014~&\u0001k-@t-\u0001\u0007";
        objectArray[69] = "*5G;z%6hN(\u0015p6\u001e@+ss\u001c)B-\u0015/\"2\u001bv.&c0AF%o4k\u0014},.61$\u007fg~78N+mu7T";
        objectArray[70] = "%d\"-y?zy`i\u0006$Ggj$w1;k)$lMwj=i6v~+?3\u0006";
        objectArray[71] = "?.\"v&Od3n)H\u0011\u000e7#c9\u0003r;`c\"\u007f78st$\u0015c2xtH";
        objectArray[72] = "\u000f\b\u0013IX\u0013O\u0015O\u001d6]\u001d\r^\u001d6G\u0016\u0005_\u0002_R\u000e\r]p";
        objectArray[73] = "\u00046E:h\u0018D+\u0019n\u0006K\u0012&ugdD\u0003%\u001cr|L\u0001W";
        objectArray[74] = "U=2+g*U'9D2[\u0014q;5$'\u00182;.Xb\u001b!,(26\u0011*,D";
        objectArray[75] = ".3\u0010G4{,*\u000b\u001d\u0005-.(\u0002\u0002yD!!\u0003\u0006w-49\u000b\u0004\u0005}7\"\n\u0016o)=)\nz";
        objectArray[76] = "Z]\"\u0010H\u0002\u0019UgI\"\u0002\fL~\u0013N0]\f.E\"W\u0011V!D\u0019^PT{t";
        Object[] objectArray2 = objectArray;
        objectArray[77] = "\u0000}>L;m[`r\u0013U41p0Pk$Q\"bY']X'u\u0015,=\nu|YU";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c3' || c == '\u00df' || c == 's' || c == '\u00fc') {
                field = de_0.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c3' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00df' ? lookup.findSetter(clazz, string2, clazz2) : (c == 's' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = de_0.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ff' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d0' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    protected abstract bT b(Object[] var1);

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void b(Object[] objectArray) {
        long l;
        long l2;
        block30: {
            Object object;
            block29: {
                CallSite callSite;
                block27: {
                    CallSite callSite2;
                    block28: {
                        block25: {
                            boolean bl;
                            block26: {
                                Object object2;
                                long l3;
                                block23: {
                                    block24: {
                                        de_0 de_02;
                                        block21: {
                                            block22: {
                                                block20: {
                                                    aq_0 aq_02 = (aq_0)objectArray[0];
                                                    gK gK2 = (gK)objectArray[1];
                                                    l2 = (Long)objectArray[2];
                                                    long l4 = l2 = n ^ l2;
                                                    l3 = l4 ^ 0x71AD072E49A8L;
                                                    l = l4 ^ 0x4BBDF3B7F48CL;
                                                    callSite = de_0.f("\u00d0", (long)-4561056806281528119L, (long)l2);
                                                    try {
                                                        try {
                                                            de_02 = this;
                                                            if (callSite != null) break block20;
                                                            if (!de_02.f) return;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw de_0.f("\u00d0", (Object)matchException, (long)-4563420981677195314L, (long)l2);
                                                        }
                                                        de_02 = this;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw de_0.f("\u00d0", (Object)matchException, (long)-4563420981677195314L, (long)l2);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        if (callSite != null) break block21;
                                                        if (de_02.c != null) break block22;
                                                        return;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw de_0.f("\u00d0", (Object)matchException, (long)-4563420981677195314L, (long)l2);
                                                    }
                                                }
                                                catch (MatchException matchException) {
                                                    throw de_0.f("\u00d0", (Object)matchException, (long)-4563420981677195314L, (long)l2);
                                                }
                                            }
                                            de_02 = this;
                                        }
                                        try {
                                            object2 = de_02.l;
                                            if (callSite != null) break block23;
                                            if (object2) break block24;
                                            return;
                                        }
                                        catch (MatchException matchException) {
                                            throw de_0.f("\u00d0", (Object)matchException, (long)-4563420981677195314L, (long)l2);
                                        }
                                    }
                                    this.l = 0;
                                    object2 = de_0.f("\u00d0", (int)de_0.b("x", (int)22317, (long)(0x3DD1A2E21E23AB5AL ^ l2)), (long)-4560334638874803402L, (long)l2);
                                }
                                bl = object2;
                                callSite2 = de_0.f("\u00d0", (int)de_0.b("x", (int)32480, (long)(0x71CBD15053C4029AL ^ l2)), (long)-4560334638874803402L, (long)l2);
                                CallSite callSite3 = de_0.f("\u00d0", (int)de_0.b("x", (int)1550, (long)(0x50E9E47B8CC07A78L ^ l2)), (long)-4560334638874803402L, (long)l2);
                                try {
                                    try {
                                        de_0.f("\u00d0", (int)de_0.b("x", (int)31237, (long)(0x7CCDD1F898A10677L ^ l2)), (long)-4560962597556321015L, (long)l2);
                                        de_0.f("\u00d0", (int)de_0.b("x", (int)30474, (long)(0x38F9B8D756378B75L ^ l2)), (long)-4560447015113110218L, (long)l2);
                                        de_0.f("\u00d0", (int)de_0.b("x", (int)25343, (long)(0x23C9E79887F11E86L ^ l2)), (int)de_0.b("x", (int)15372, (long)(0x4933BDC96FCCC072L ^ l2)), (long)-4564045496205554129L, (long)l2);
                                        de_0.f("\u00d0", (int)de_0.b("x", (int)7485, (long)(0x757F31919246145L ^ l2)), (long)-4560962597556321015L, (long)l2);
                                        Object[] objectArray2 = new Object[1];
                                        objectArray2[0] = l3;
                                        de_0.f("\u00ff", (Object)this.c, (Object)objectArray2, (long)-4560542485729891498L, (long)l2);
                                        object = callSite3;
                                        if (callSite != null) break block25;
                                        if (object == false) break block26;
                                    }
                                    catch (MatchException matchException) {
                                        throw de_0.f("\u00d0", (Object)matchException, (long)-4563420981677195314L, (long)l2);
                                    }
                                    de_0.f("\u00d0", (int)de_0.b("x", (int)7485, (long)(0x757F31919246145L ^ l2)), (long)-4560447015113110218L, (long)l2);
                                }
                                catch (MatchException matchException) {
                                    throw de_0.f("\u00d0", (Object)matchException, (long)-4563420981677195314L, (long)l2);
                                }
                            }
                            object = bl;
                        }
                        try {
                            try {
                                if (callSite != null) break block27;
                                if (object == false) break block28;
                            }
                            catch (MatchException matchException) {
                                throw de_0.f("\u00d0", (Object)matchException, (long)-4563420981677195314L, (long)l2);
                            }
                            de_0.f("\u00d0", (int)de_0.b("x", (int)31237, (long)(0x7CCDD1F898A10677L ^ l2)), (long)-4560447015113110218L, (long)l2);
                        }
                        catch (MatchException matchException) {
                            throw de_0.f("\u00d0", (Object)matchException, (long)-4563420981677195314L, (long)l2);
                        }
                    }
                    object = callSite2;
                }
                try {
                    if (callSite != null) break block29;
                    if (object != false) break block30;
                }
                catch (MatchException matchException) {
                    throw de_0.f("\u00d0", (Object)matchException, (long)-4563420981677195314L, (long)l2);
                }
                object = de_0.b("x", (int)30474, (long)(0x38F9B8D756378B75L ^ l2));
            }
            de_0.f("\u00d0", (int)object, (long)-4560962597556321015L, (long)l2);
        }
        Object[] objectArray3 = new Object[5];
        objectArray3[4] = l;
        objectArray3[3] = Float.valueOf(0.0f);
        objectArray3[2] = Float.valueOf(0.0f);
        objectArray3[1] = Float.valueOf(0.0f);
        objectArray3[0] = Float.valueOf(0.0f);
        de_0.f("\u00ff", (Object)this.g, (Object)objectArray3, (long)-4564252211910166717L, (long)l2);
    }

    protected abstract void c(Object[] var1);

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method c(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static Method h(long l, long l2) {
        int n = de_0.e(l, l2);
        Object object = D[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = E[n];
                int n3 = string2.indexOf(8);
                clazz3 = de_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = de_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = de_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        de_0.D[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = de_0.f(2187444173833795L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = de_0.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        de_0.D[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = de_0.f(2187444173833795L, 0L);
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

    private static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/de" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    protected void f(Object[] objectArray) {
        block22: {
            de_0 de_02;
            long l;
            long l2;
            block20: {
                Object object;
                CallSite callSite;
                CallSite callSite2;
                CallSite callSite3;
                long l3;
                long l4;
                long l5;
                long l6;
                block18: {
                    block19: {
                        block17: {
                            block16: {
                                CallSite callSite4;
                                block14: {
                                    block15: {
                                        l2 = (Long)objectArray[0];
                                        long l7 = l2 = n ^ l2;
                                        l6 = l7 ^ 0xC8546210405L;
                                        l5 = l7 ^ 0x579C8B3BAF06L;
                                        l4 = l7 ^ 0x7AB3EAC9BFBBL;
                                        l = l7 ^ 0x3DD45A592417L;
                                        l3 = l7 ^ 0x32C6841A7B3EL;
                                        callSite3 = de_0.f("\u00d0", (long)1164366774877613138L, (long)l2);
                                        try {
                                            callSite4 = de_0.f("\u00ff", (Object)a, (long)1164447856780138831L, (long)l2);
                                            if (callSite3 != null) break block14;
                                            if (callSite4 != null) break block15;
                                        }
                                        catch (MatchException matchException) {
                                            throw de_0.f("\u00d0", (Object)matchException, (long)1166448393434574677L, (long)l2);
                                        }
                                        return;
                                    }
                                    callSite4 = de_0.f("\u00ff", (Object)a, (long)1164447856780138831L, (long)l2);
                                }
                                callSite2 = de_0.f("\u00ff", (Object)callSite4, (long)1166538543108144896L, (long)l2);
                                callSite = de_0.f("\u00ff", (Object)de_0.f("\u00ff", (Object)a, (long)1164447856780138831L, (long)l2), (long)1165454654556088491L, (long)l2);
                                try {
                                    object = callSite2;
                                    if (callSite3 != null) break block16;
                                    if (object <= 0) break block17;
                                }
                                catch (MatchException matchException) {
                                    throw de_0.f("\u00d0", (Object)matchException, (long)1166448393434574677L, (long)l2);
                                }
                                object = callSite;
                            }
                            try {
                                if (callSite3 != null) break block18;
                                if (object > 0) break block19;
                            }
                            catch (MatchException matchException) {
                                throw de_0.f("\u00d0", (Object)matchException, (long)1166448393434574677L, (long)l2);
                            }
                        }
                        return;
                    }
                    try {
                        de_02 = this;
                        if (callSite3 != null) break block20;
                        object = de_02.d;
                    }
                    catch (MatchException matchException) {
                        throw de_0.f("\u00d0", (Object)matchException, (long)1166448393434574677L, (long)l2);
                    }
                }
                try {
                    block21: {
                        try {
                            try {
                                if (object != callSite2) break block21;
                                de_02 = this;
                                if (callSite3 != null) break block20;
                            }
                            catch (MatchException matchException) {
                                throw de_0.f("\u00d0", (Object)matchException, (long)1166448393434574677L, (long)l2);
                            }
                            if (de_02.e == callSite) break block22;
                        }
                        catch (MatchException matchException) {
                            throw de_0.f("\u00d0", (Object)matchException, (long)1166448393434574677L, (long)l2);
                        }
                    }
                    this.d = (int)callSite2;
                    this.e = (int)callSite;
                    Object[] objectArray2 = new Object[3];
                    objectArray2[2] = l4;
                    objectArray2[1] = this.e;
                    objectArray2[0] = this.d;
                    this.h = de_0.f("\u00ff", (Object)this.h, (Object)objectArray2, (long)1166173914587118541L, (long)l2);
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = l5;
                    objectArray3[0] = (int)de_0.b("x", (int)23864, (long)(0x6DA77DAF737E71D6L ^ l2));
                    de_0.f("\u00ff", (Object)this.h, (Object)objectArray3, (long)1166990669187178949L, (long)l2);
                    Object[] objectArray4 = new Object[2];
                    objectArray4[1] = l3;
                    objectArray4[0] = (int)de_0.b("x", (int)30286, (long)(0x40749A280515AA5L ^ l2));
                    de_0.f("\u00ff", (Object)this.h, (Object)objectArray4, (long)1167378552123579735L, (long)l2);
                    Object[] objectArray5 = new Object[3];
                    objectArray5[2] = l6;
                    objectArray5[1] = this.h;
                    objectArray5[0] = (int)de_0.b("x", (int)7770, (long)(0x5C23F5455B2932BCL ^ l2));
                    de_0.f("\u00ff", (Object)this.g, (Object)objectArray5, (long)1166376488680925215L, (long)l2);
                    de_02 = this;
                }
                catch (MatchException matchException) {
                    throw de_0.f("\u00d0", (Object)matchException, (long)1166448393434574677L, (long)l2);
                }
            }
            Object[] objectArray6 = new Object[5];
            objectArray6[4] = l;
            objectArray6[3] = Float.valueOf(0.0f);
            objectArray6[2] = Float.valueOf(0.0f);
            objectArray6[1] = Float.valueOf(0.0f);
            objectArray6[0] = Float.valueOf(0.0f);
            de_0.f("\u00ff", (Object)de_02.g, (Object)objectArray6, (long)1167543506456242136L, (long)l2);
        }
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = de_0.e(l, l2);
            object = D[n];
            try {
                if (!(object instanceof String)) break block2;
                de_0.D[n] = clazz = Class.forName(E[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = de_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = de_0.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = de_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = de_0.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public final void d(Object[] objectArray) {
        Consumer consumer = (Consumer)objectArray[0];
        this.k = consumer;
    }

    public abstract c9 a(Object[] var1);

    public void a(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l = n ^ l;
        long l3 = l2 ^ 0x592B9AFFDA0FL;
        long l4 = l2 ^ 0x7688CFAA5409L;
        long l5 = l2 ^ 0x949A8931084L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        de_0.f("\u00ff", (Object)this, (Object)objectArray2, (long)-3060021922190148528L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l5;
        de_0.f("\u00ff", (Object)this, (Object)objectArray3, (long)-3056029278306700799L, (long)l);
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l3;
        de_0.f("\u00ff", (Object)de_0.f("\u00ff", (Object)de_0.f("\u00ff", (Object)aq_02, (Object)objectArray4, (long)-3055706688516915810L, (long)l), de_0::lambda$render$0, (long)-3060071940600508543L, (long)l), de_0::lambda$render$1, (long)-3056211770825192840L, (long)l);
    }

    public final bT a(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        int n = (Integer)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = (l = de_0.n ^ l) ^ 0x6C0241141C5CL;
        this.l = 1;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = n;
        objectArray2[0] = aq_02;
        return de_0.f("\u00ff", (Object)this, (Object)objectArray2, (long)-4445578150432691630L, (long)l);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    protected void g(Object[] objectArray) {
        block5: {
            block4: {
                long l = (Long)objectArray[0];
                long l2 = l = n ^ l;
                long l3 = l2 ^ 0x734421184088L;
                long l4 = l2 ^ 0x44ECB7082A57L;
                long l5 = l2 ^ 0x285DEC02EB8BL;
                long l6 = l2 ^ 0x4EC607F2B08BL;
                long l7 = l2 ^ 0x42153D60609AL;
                long l8 = l2 ^ 0x4D07E3233FB3L;
                CallSite callSite = de_0.f("\u00d0", (long)6099517290672400607L, (long)l);
                try {
                    de_0 de_02;
                    try {
                        de_02 = this;
                        if (callSite != null) break block4;
                        if (de_02.f) break block5;
                    }
                    catch (MatchException matchException) {
                        throw de_0.f("\u00d0", (Object)matchException, (long)6106161341348146136L, (long)l);
                    }
                    this.d = (int)de_0.f("\u00ff", (Object)de_0.f("\u00ff", (Object)a, (long)6099436192395238850L, (long)l), (long)6106071161357630349L, (long)l);
                    this.e = (int)de_0.f("\u00ff", (Object)de_0.f("\u00ff", (Object)a, (long)6099436192395238850L, (long)l), (long)6098429235697642534L, (long)l);
                    Object[] objectArray2 = new Object[4];
                    objectArray2[3] = l4;
                    objectArray2[2] = this.e;
                    objectArray2[1] = this.d;
                    objectArray2[0] = (int)de_0.b("x", (int)8219, (long)(0x41346F004417C87CL ^ l));
                    de_0.f("\u00ff", (Object)this.h, (Object)objectArray2, (long)6098854533550530358L, (long)l);
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = l5;
                    objectArray3[0] = (int)de_0.b("x", (int)11094, (long)(0x5CD98C3C455F4333L ^ l));
                    de_0.f("\u00ff", (Object)this.h, (Object)objectArray3, (long)6105900423793714504L, (long)l);
                    Object[] objectArray4 = new Object[2];
                    objectArray4[1] = l8;
                    objectArray4[0] = (int)de_0.b("x", (int)16406, (long)(0x39483890C948A87BL ^ l));
                    de_0.f("\u00ff", (Object)this.h, (Object)objectArray4, (long)6106357017612720602L, (long)l);
                    Object[] objectArray5 = new Object[3];
                    objectArray5[2] = l3;
                    objectArray5[1] = this.h;
                    objectArray5[0] = (int)de_0.b("x", (int)7745, (long)(0x4E204A9758287632L ^ l));
                    de_0.f("\u00ff", (Object)this.g, (Object)objectArray5, (long)6098633649354763410L, (long)l);
                    Object[] objectArray6 = new Object[5];
                    objectArray6[4] = l7;
                    objectArray6[3] = Float.valueOf(0.0f);
                    objectArray6[2] = Float.valueOf(0.0f);
                    objectArray6[1] = Float.valueOf(0.0f);
                    objectArray6[0] = Float.valueOf(0.0f);
                    de_0.f("\u00ff", (Object)this.g, (Object)objectArray6, (long)6106473603201114965L, (long)l);
                    Object[] objectArray7 = new Object[1];
                    objectArray7[0] = l6;
                    this.c = de_0.f("\u00ff", (Object)this, (Object)objectArray7, (long)6099353463058931459L, (long)l);
                    de_02 = this;
                }
                catch (MatchException matchException) {
                    throw de_0.f("\u00d0", (Object)matchException, (long)6106161341348146136L, (long)l);
                }
            }
            de_02.f = 1;
        }
    }

    private static Field g(long l, long l2) {
        int n = de_0.e(l, l2);
        Object object = D[n];
        if (object instanceof String) {
            String string = E[n];
            int n2 = string.indexOf(8);
            Class clazz = de_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = de_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = de_0.c(clazz3, string2, clazz2)) != null) {
                    de_0.D[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = de_0.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        de_0.D[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = de_0.f(2187444173833795L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static boolean lambda$render$0(Pair pair) {
        long l = n ^ 0x51FA8B4B7F87L;
        return (boolean)de_0.f("\u00ff", (Object)((dt_0)((Object)de_0.f("\u00ff", (Object)pair, (long)-6145899465075740306L, (long)l))), (Object)new Object[0], (long)-6149612876592363093L, (long)l);
    }

    private static void lambda$render$1(Pair pair) {
        long l = n ^ 0x1D5BF4BB44F8L;
        long l2 = l ^ 0x678F214F6DE7L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = m_0.QUADS;
        de_0.f("\u00ff", (Object)((bT)((Object)de_0.f("\u00ff", (Object)pair, (long)-7941432219250674965L, (long)l))), (Object)objectArray, (long)-7938578693156136719L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(de_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(de_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


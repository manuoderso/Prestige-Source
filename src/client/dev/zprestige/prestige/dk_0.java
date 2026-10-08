/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 *  org.joml.Vector4f
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aq_0;
import dev.zprestige.prestige.az_0;
import dev.zprestige.prestige.bT;
import dev.zprestige.prestige.cF;
import dev.zprestige.prestige.dc_0;
import dev.zprestige.prestige.dt_0;
import dev.zprestige.prestige.dy_0;
import dev.zprestige.prestige.fW;
import dev.zprestige.prestige.gK;
import dev.zprestige.prestige.gf_0;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.m_0;
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
import org.joml.Vector4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.dk
 */
public class dk_0
extends dc_0 {
    private static final dk_0 a;
    private static final Map b;
    private final int c;
    private static final long d;
    private static final String[] e;
    private static final String[] f;
    private static final Map g;
    private static final long[] h;
    private static final Integer[] i;
    private static final Map j;
    private static final Object[] k;
    private static final String[] l;

    private dk_0(long l) {
        long l2 = l = d ^ l;
        long l3 = l2 ^ 0x7A113C3DBCAFL;
        long l4 = l2 ^ 0x21652F7AAF65L;
        super((String)((Object)dk_0.a("g", (int)14149, (long)(0x3CB88C63193DF5CFL ^ l))), (String)((Object)dk_0.a("g", (int)29908, (long)(0x2B08F9B82237B65FL ^ l))), l4);
        Object[] objectArray = new Object[2];
        objectArray[1] = l3;
        objectArray[0] = dk_0.a("g", (int)3990, (long)(0xCC0A9692FAD4D1EL ^ l));
        this.c = (int)dk_0.c("\u00d3", (Object)dk_0.c("\u00d3", (Object)this, (Object)new Object[0], (long)7242302255152691754L, (long)l), (Object)objectArray, (long)7243877491795209835L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    dk_0.d = hc.a(-1747283444368914090L, -6219811014450824698L, MethodHandles.lookup().lookupClass()).a(228105450377004L);
                    v0 = var20 = dk_0.d ^ 27442829864269L;
                    var22_1 = v0 ^ 86953490695865L;
                    var24_2 = v0 ^ 27269086202333L;
                    dk_0.k = new Object[94];
                    dk_0.l = new String[94];
                    dk_0.b();
                    dk_0.g = new HashMap<K, V>(13);
                    var11_3 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v1 = SecretKeyFactory.getInstance("DES");
                    v2 = new byte[8];
                    v3 = v2;
                    v2[0] = (byte)(var20 >>> 56);
                    for (var12_4 = 1; var12_4 < 8; ++var12_4) {
                        v3 = v3;
                        v3[var12_4] = (byte)(var20 << var12_4 * 8 >>> 56);
                    }
                    var11_3.init(2, (Key)v1.generateSecret(new DESKeySpec(v3)), new IvParameterSpec(new byte[8]));
                    var18_5 = new String[3];
                    var16_6 = 0;
                    var15_7 = "\u0019\u00e3\u00c8p\u0093\u0003\u0005'\u0092\u00abn\u00b6\u00c7\u00ad\"\u00b2\u00bdn\u00de\u00c2\u00dd\u0019\r\u00b8rv\u00ba\u0087\u00f1z\u009c\u00a6\u00c8\u0019nI\u0095\u00d8z\u008c\u00d8-\u0014\u001e{5\u00fa\u00e6b\u009fi\u0082m3bn8\u00d2\u00ca\u00df\u00fes\u00a8\u0083\u00b7`1\u00f5\u009c\u0019-\u00d9\u00d2\u00c5\u00a5l\u008d\u00c4'\u00f9+&\u009eCN\u00e5\u009e\u00c9\u00c9\u00a6\u0005\u00a7\u00e9 \u00ce$7\u001fl\u00e1!\u00017\u0011\u008eX\u0085\u00cc\u00b9\u00cd\u00c74\u00fd \u00e6\u00ee\u00e2\u00c5/\u0091\u00dc\u009d\u0084A\u00c0\u008a\u00a3\u007f6o\u00e74\u00d3Z\u00a9\u00e2\u00db3\u0016\u008dH\u008ab'\u0083\u00b0";
                    var17_8 = "\u0019\u00e3\u00c8p\u0093\u0003\u0005'\u0092\u00abn\u00b6\u00c7\u00ad\"\u00b2\u00bdn\u00de\u00c2\u00dd\u0019\r\u00b8rv\u00ba\u0087\u00f1z\u009c\u00a6\u00c8\u0019nI\u0095\u00d8z\u008c\u00d8-\u0014\u001e{5\u00fa\u00e6b\u009fi\u0082m3bn8\u00d2\u00ca\u00df\u00fes\u00a8\u0083\u00b7`1\u00f5\u009c\u0019-\u00d9\u00d2\u00c5\u00a5l\u008d\u00c4'\u00f9+&\u009eCN\u00e5\u009e\u00c9\u00c9\u00a6\u0005\u00a7\u00e9 \u00ce$7\u001fl\u00e1!\u00017\u0011\u008eX\u0085\u00cc\u00b9\u00cd\u00c74\u00fd \u00e6\u00ee\u00e2\u00c5/\u0091\u00dc\u009d\u0084A\u00c0\u008a\u00a3\u007f6o\u00e74\u00d3Z\u00a9\u00e2\u00db3\u0016\u008dH\u008ab'\u0083\u00b0".length();
                    var14_9 = 56;
                    var13_10 = -1;
lbl35:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl37:
                    // 1 sources

                    while (true) {
                        var18_5[var16_6++] = dk_0.a(var19_11).intern();
                        if ((var13_10 += var14_9) < var17_8) {
                            var14_9 = var15_7.charAt(var13_10);
                            ** continue;
                        }
                        break block12;
                        break;
                    }
                    v4 = ++var13_10;
                    var19_11 = var11_3.doFinal(var15_7.substring(v4, v4 + var14_9).getBytes("ISO-8859-1"));
                    ** while (true)
                }
                dk_0.e = var18_5;
                dk_0.f = new String[3];
                dk_0.j = new HashMap<K, V>(13);
                var0_12 = Cipher.getInstance("DES/CBC/NoPadding");
                v5 = SecretKeyFactory.getInstance("DES");
                v6 = new byte[8];
                v7 = v6;
                v6[0] = (byte)(var20 >>> 56);
                for (var1_13 = 1; var1_13 < 8; ++var1_13) {
                    v7 = v7;
                    v7[var1_13] = (byte)(var20 << var1_13 * 8 >>> 56);
                }
                var0_12.init(2, (Key)v5.generateSecret(new DESKeySpec(v7)), new IvParameterSpec(new byte[8]));
                var6_14 = new long[5];
                var3_15 = 0;
                var4_16 = "\u00b1\u0082\u00a33\u009b\u00fd\u0091KQ\"m\u0004\u00af\u00e5\u0095vdj\u00c7\u0080Q\u00c7\u00bd\u00ab";
                var5_17 = "\u00b1\u0082\u00a33\u009b\u00fd\u0091KQ\"m\u0004\u00af\u00e5\u0095vdj\u00c7\u0080Q\u00c7\u00bd\u00ab".length();
                var2_18 = 0;
                while (true) {
                    var7_19 = var4_16.substring(var2_18, var2_18 += 8).getBytes("ISO-8859-1");
                    v8 = var6_14;
                    v9 = var3_15++;
                    v10 = ((long)var7_19[0] & 255L) << 56 | ((long)var7_19[1] & 255L) << 48 | ((long)var7_19[2] & 255L) << 40 | ((long)var7_19[3] & 255L) << 32 | ((long)var7_19[4] & 255L) << 24 | ((long)var7_19[5] & 255L) << 16 | ((long)var7_19[6] & 255L) << 8 | (long)var7_19[7] & 255L;
                    v11 = -1;
                    break block13;
                    break;
                }
lbl88:
                // 1 sources

                while (true) {
                    v8[v9] = v12;
                    if (var2_18 < var5_17) ** continue;
                    var4_16 = "\u00e1\u00d8{b\u00a9\u001c\u00fe\u008f\u0081\u00f5=\u00f9\u0096M\u0006\u0010";
                    var5_17 = "\u00e1\u00d8{b\u00a9\u001c\u00fe\u008f\u0081\u00f5=\u00f9\u0096M\u0006\u0010".length();
                    var2_18 = 0;
                    while (true) {
                        var7_19 = var4_16.substring(var2_18, var2_18 += 8).getBytes("ISO-8859-1");
                        v8 = var6_14;
                        v9 = var3_15++;
                        v10 = ((long)var7_19[0] & 255L) << 56 | ((long)var7_19[1] & 255L) << 48 | ((long)var7_19[2] & 255L) << 40 | ((long)var7_19[3] & 255L) << 32 | ((long)var7_19[4] & 255L) << 24 | ((long)var7_19[5] & 255L) << 16 | ((long)var7_19[6] & 255L) << 8 | (long)var7_19[7] & 255L;
                        v11 = 0;
                        break block13;
                        break;
                    }
                    break;
                }
lbl107:
                // 1 sources

                while (true) {
                    v8[v9] = v12;
                    if (var2_18 < var5_17) ** continue;
                    break block14;
                    break;
                }
            }
            var8_20 = v10;
            var10_21 = var0_12.doFinal(new byte[]{(byte)(var8_20 >>> 56), (byte)(var8_20 >>> 48), (byte)(var8_20 >>> 40), (byte)(var8_20 >>> 32), (byte)(var8_20 >>> 24), (byte)(var8_20 >>> 16), (byte)(var8_20 >>> 8), (byte)var8_20});
            v12 = ((long)var10_21[0] & 255L) << 56 | ((long)var10_21[1] & 255L) << 48 | ((long)var10_21[2] & 255L) << 40 | ((long)var10_21[3] & 255L) << 32 | ((long)var10_21[4] & 255L) << 24 | ((long)var10_21[5] & 255L) << 16 | ((long)var10_21[6] & 255L) << 8 | (long)var10_21[7] & 255L;
            switch (v11) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl120:
                // 1 sources

                ** continue;
            }
        }
        dk_0.h = var6_14;
        dk_0.i = new Integer[5];
        dk_0.a = new dk_0(var24_2);
        v13 = new Object[2];
        v13[1] = var22_1;
        v13[0] = (int)dk_0.b("e", (int)17700, (long)(231094467270338443L ^ var20));
        dk_0.b = dk_0.c("\u00d8", (Object)v13, (long)-5549001976753368795L, (long)var20);
    }

    private void e(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        Matrix4f matrix4f = (Matrix4f)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        float f10 = ((Float)objectArray[4]).floatValue();
        float f11 = ((Float)objectArray[5]).floatValue();
        float f12 = ((Float)objectArray[6]).floatValue();
        int n = (Integer)objectArray[7];
        Vector4f vector4f = (Vector4f)objectArray[8];
        long l = (Long)objectArray[9];
        long l2 = l = d ^ l;
        long l3 = l2 ^ 0x1F80D049EDF4L;
        long l4 = l2 ^ 0x6319B7730108L;
        long l5 = l2 ^ 0x775F9A32548FL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l5;
        objectArray2[0] = vector4f;
        CallSite callSite = dk_0.c("\u00d3", (Object)this, (Object)objectArray2, (long)5531658438497369622L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l4;
        objectArray4[0] = new az_0((dt_0)((Object)callSite), (arg_0, arg_1) -> dk_0.lambda$drawInternal$0(n, matrix4f, f, f10, f12, f11, arg_0, arg_1));
        dk_0.c("\u00d3", (Object)dk_0.c("\u00d8", (Object)objectArray3, (long)5530781208959624954L, (long)l), (Object)objectArray4, (long)5532508491340061240L, (long)l);
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (dk_0.l[n3] != null) {
            return n3;
        }
        Object object = k[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 63;
            case 1 -> 51;
            case 2 -> 15;
            case 3 -> 23;
            case 4 -> 22;
            case 5 -> 18;
            case 6 -> 29;
            case 7 -> 30;
            case 8 -> 7;
            case 9 -> 38;
            case 10 -> 33;
            case 11 -> 21;
            case 12 -> 40;
            case 13 -> 32;
            case 14 -> 36;
            case 15 -> 12;
            case 16 -> 16;
            case 17 -> 6;
            case 18 -> 43;
            case 19 -> 42;
            case 20 -> 56;
            case 21 -> 39;
            case 22 -> 61;
            case 23 -> 3;
            case 24 -> 46;
            case 25 -> 20;
            case 26 -> 5;
            case 27 -> 59;
            case 28 -> 35;
            case 29 -> 57;
            case 30 -> 34;
            case 31 -> 9;
            case 32 -> 0;
            case 33 -> 27;
            case 34 -> 26;
            case 35 -> 2;
            case 36 -> 41;
            case 37 -> 49;
            case 38 -> 53;
            case 39 -> 50;
            case 40 -> 60;
            case 41 -> 25;
            case 42 -> 37;
            case 43 -> 11;
            case 44 -> 17;
            case 45 -> 52;
            case 46 -> 28;
            case 47 -> 48;
            case 48 -> 31;
            case 49 -> 19;
            case 50 -> 13;
            case 51 -> 14;
            case 52 -> 47;
            case 53 -> 54;
            case 54 -> 4;
            case 55 -> 45;
            case 56 -> 44;
            case 57 -> 55;
            case 58 -> 1;
            case 59 -> 8;
            case 60 -> 58;
            case 61 -> 24;
            case 62 -> 10;
            default -> 62;
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
        dk_0.l[n3] = new String(cArray);
        return n3;
    }

    public static void i(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        Matrix4f matrix4f = (Matrix4f)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        float f10 = ((Float)objectArray[4]).floatValue();
        float f11 = ((Float)objectArray[5]).floatValue();
        float f12 = ((Float)objectArray[6]).floatValue();
        float f13 = ((Float)objectArray[7]).floatValue();
        float f14 = ((Float)objectArray[8]).floatValue();
        Color color = (Color)objectArray[9];
        Vector4f vector4f = (Vector4f)objectArray[10];
        long l = (Long)objectArray[11];
        long l2 = (l = d ^ l) ^ 0x1D7298B2D5F1L;
        Object[] objectArray2 = new Object[12];
        objectArray2[11] = l2;
        objectArray2[10] = vector4f;
        objectArray2[9] = (int)dk_0.c("\u00d3", (Object)color, (long)7850166188056432007L, (long)l);
        objectArray2[8] = Float.valueOf(f14);
        objectArray2[7] = Float.valueOf(f13);
        objectArray2[6] = Float.valueOf(f12);
        objectArray2[5] = Float.valueOf(f11);
        objectArray2[4] = Float.valueOf(f10);
        objectArray2[3] = Float.valueOf(f);
        objectArray2[2] = matrix4f;
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dk_0.c("\u00d3", (Object)a, (Object)objectArray2, (long)7851334873152738332L, (long)l);
    }

    private static void b() {
        Object[] objectArray = k;
        k[0] = "\u0005U\u0001SNC\u0013U\u0004\t]T\u0004\u001e\u0007\u000fQ@\u0015Y\u0010\u0018\u001aT\u0000";
        objectArray[1] = "\u00180F@nim\u0010MO\u007f&\f\u001eFD{|x";
        objectArray[2] = Void.TYPE;
        dk_0.l[2] = "java/lang/Void";
        objectArray[3] = "\u0005<*890\u0013</b*'\u0004w,d&3\u00150;sm$\n";
        objectArray[4] = "u/pT\u000f-\u0000\u000f{[\u001eba\u0001pP\u001a8\u0015";
        objectArray[5] = "#;>e{V5;;?hA\"p89dU37/./B3";
        objectArray[6] = "H-c7W\u0012^-fmD\u0005IfekH\u0011X!r|\u0003\u0006m";
        objectArray[7] = "2\u0010\u0016-gAG0\u001d\"v\u000e&>\u0016)rTR";
        objectArray[8] = "\b\u0016'4`9\u001e\u0016\"ns.\t]!h\u007f:\u0018\u001a6\u007f4-\u000f";
        objectArray[9] = "*(S_`\u0002_\bXPqM>\u0006S[u\u0017J";
        objectArray[10] = "_@\"b%eI@'86r^\u000b$>:fOL3)qso";
        objectArray[11] = "m szr$\u0018\u0000xucky\u000es~g1\r";
        objectArray[12] = Integer.TYPE;
        dk_0.l[12] = "java/lang/Integer";
        objectArray[13] = "m\u001c}H\u0006kp\t%jGfh\u000f";
        objectArray[14] = ";r>3|YNR5<m\u0016/\\>7iL[";
        objectArray[15] = "\n4\u001b2r\u000f\u007f\u0014\u0010=c@\u001e\u001a\u001b6g\u001aj";
        objectArray[16] = "#,0\u0006`]5,5\\sJ\"g6Z\u007f^3 !M4J%";
        objectArray[17] = "r{\u0013f$\u0018\u0007[\u0018i5WfU\u0013b1\r\u0012";
        objectArray[18] = "\u000fMrLP\n\u0011Eh\u00033\u001e\u0015";
        objectArray[19] = "T\u0015<D\u000eZV\u000bu<\u0001VO\b)^\u0002";
        objectArray[20] = Float.TYPE;
        dk_0.l[20] = "java/lang/Float";
        objectArray[21] = "71\bA\f$2$\u0003A\u000f#=-\b\u0003N\u0014\u0014q_";
        objectArray[22] = "r\u0011wX\u001ao\u00071|W\u000b f?w\\\u000fz\u0012";
        objectArray[23] = "&[\u0005&;\u00100[\u0000|(\u0007'\u0010\u0003z$\u00136W\u0014mo\u0003\u0004";
        objectArray[24] = "pp@p5F\u0005PK\u007f$\td^@t S\u0010";
        objectArray[25] = "Vf\u007f9S\u0006#Ft6BIBH\u007f=F\u00136";
        objectArray[26] = "\u0001zlVU\u0003tZgYDL\u0015TlR@\u0016a";
        objectArray[27] = "q!'>\u000be\u0004\u0001,1\u001a*e\u000f':\u001ep\u0011";
        objectArray[28] = "9\f!H\\f2\u00030\u00074f<\f#";
        objectArray[29] = "0\u001fo\u0003\u0013xE?d\f\u00027$1o\u0007\u0006mP";
        objectArray[30] = "J\u001c=,z\u000b?<6#kD^2=(o\u001e*";
        objectArray[31] = "8FW{\u0003\u0002.FR!\u0010\u00159\rQ'\u001c\u0001(JF0W\u0013\u0014";
        objectArray[32] = "v\bvq\u001b{\u0003(}~\n4~0ny\u0003}\u0016";
        objectArray[33] = "k\f\u0017x= \u001e,\u001cw,o\u007f\"\u0017|(5\u000b";
        objectArray[34] = "\u0006\u001fSM\u0002p\r\u0010B\u0002c~\u0006\u001bFX";
        objectArray[35] = "S\u0007a daE\u0007dzwvRLg|{bC\u000bpk0w`";
        objectArray[36] = "z8)\u0014Z_\u000f\u0018\"\u001bK\u0010n\u0016)\u0010OJ\u001a";
        objectArray[37] = "Lt\u001dr2KG{\f=QFRv\u0003VdDCe\u001fzsI";
        objectArray[38] = "\u0005~>&\u001cXp^5)\r\u0017\u0011P>\"\tMe";
        objectArray[39] = "\u000e9m\u001f0V\u00189hE#A\u000frkC/U\u001e5|TdA>";
        objectArray[40] = "\u0017\fS'\u0003Yb,X(\u0012\u0016\u0003\"S#\u0016Lw";
        objectArray[41] = "(\\+\u0010/W>\\.J<@)\u0017-L0T8P:[{@\u0003";
        objectArray[42] = "xTG'H!\rtL(YnlzG#]4\u0018";
        objectArray[43] = "Q\u0004\u001d\u0000\u0001\u001aG\u0004\u0018Z\u0012\rPO\u001b\\\u001e\u0019A\b\fKU\rd";
        objectArray[44] = "*8W\u0006C3_\u0018\\\tR|>\u0016W\u0002V&J";
        objectArray[45] = "E\u001bDCLqS\u001bA\u0019_fDPB\u001fSrU\u0017U\b\u0018fr";
        objectArray[46] = "\u001a/\u0001-`w\f/\u0004ws`\u001bd\u0007q\u007ft\n#\u0010f4e*";
        objectArray[47] = "D$\u001b\u0018\u007fD1\u0004\u0010\u0017n\u000bP\n\u001b\u001cjQ$";
        objectArray[48] = ",j),c\u000eYJ\"#rA8D)(v\u001bL";
        objectArray[49] = "7\u0012#\u001a\u0006kB2(\u0015\u0017$#<#\u001e\u0013~W";
        objectArray[50] = "r/S\u000446y BKW;l&";
        objectArray[51] = "J$E]@w?\u0004NRQ8^\nEYUb*";
        objectArray[52] = "\r$;\u0003\u0007\u0001x\u00040\f\u0016N\u0019\n;\u0007\u0012\u0014m";
        objectArray[53] = "t`p\u0010\tOb`uJ\u001aXu+vL\u0016Ldla[]^a";
        objectArray[54] = "INI~\"7<nBq3x]`Iz7\")";
        objectArray[55] = "\u0007v\u001ax,USwQ+\u0011@cu\u001a4i\u0010\bbA5,*";
        objectArray[56] = ">Aor##(A(kCpABi-(t!\n3ds A\u0004i(%zx\u0012io<\u001a";
        objectArray[57] = "t=Gd\u0010Mb=\u0000}p\u0018\u000b>A;\u001b\u001akv\u001br@N\u000bxA>\u0016\u00142nAy\u000ft";
        objectArray[58] = ")\u00115KA\u0005 \u001f+Q%]CB}\u0012NZ#\n'[\u0015\u000eC\u0017~HI_,\n;GK4";
        objectArray[59] = "L[K8k\u0012K[\rx\u000eR \t\u001cup\u0010I\u0000J1>";
        objectArray[60] = "oz*\u001b0\u0013;,`GSK\u0000-jN8D`e0\u0007c\u0010\u0000{>\r?I9/hGc*";
        objectArray[61] = "%\u001b'r|B\"\u001ba2\u0019\u000fIIp?g@ @&{)";
        objectArray[62] = "u\t'gUGhL(e>PdLDl\u0004OzJ9zU\u0012g0#1YKcM5`\u0004V\u0019W~l]RdA/1@(";
        objectArray[63] = "rsxh\u0003\u0014o6wjh\u0014s6\u001bcR\u001c}0fu\u0003A`J|>\u000f\u0018d7joR\u0005\u001e";
        objectArray[64] = "\u0013kCS.\u0011JsL\u001eOE)5\u001a\u001b$BI}@R\u007f\u0016)7[@/SX5\u001d\u001e~,";
        objectArray[65] = "\"S'$c\u001av\u0005mx\u0000OM\u0004gqkM-L=80\u0019MR32l@t\u0006ex0#";
        objectArray[66] = "&M(\u0014!\u001d\u007fNjGMKA\u0011jC&L!Y0\n}\u0018AO5\u0002#N~\u00166@p\"";
        objectArray[67] = "aK\u0016Y\n^8S\u0019\u0014k\u0001[\u0015O\u0011\u0000\r;]\u0015X[Y[\u0015\u0010ZP\u0001aO\u0018V\u000ec";
        objectArray[68] = "%\u0017@GnUs@\u0007G-,u/\u0005\u0000.GrOMZg\u001c&/C\u0000+J|\u0016U\u0000lS\u001c";
        objectArray[69] = ",R (\u001e\ruQb{r[K\u000eb\u007f\u0019\\+F86B\bKL?{\r_uT#z\u00112";
        objectArray[70] = "N\u0004XT^A\u0017\u0007\u001a\u00072\u0017)X\u001a\u0003Y\u0010I\u0010@J\u0002D)\u001f\u0010ZB\u001cR\u0003KZ@~";
        objectArray[71] = "~ya|<m|qjc\u0006j@p6\"mm 8lk69@vg{x?,2r}<\u0003";
        objectArray[72] = "!@Wc\u0015Z \u001fQ=n\\\u001d\u001a\u000f;\u0005X}RUr^\f\u001d\u0013TnRYr^E>W6";
        objectArray[73] = "qj\u0011Fy?vjW\u0006\u001cp\u001d8F\u000bb=t1\u0010O,";
        objectArray[74] = "i\u0006{+\u0013\u0019n\u0006=kvW\u0005T,f\b\u001bl]z\"F";
        objectArray[75] = "\u0014\u001cCFbq\u001d\u0012]\\\u0006)~O\u000b\u001fm.\u001e\u0007QV6z~\u001a\u000e\u001ev%A\u001d\u000eX6@";
        objectArray[76] = "36F\u007fufm{\u0013Ou^41O$q>|k\u0006\u007f%^4n\u0004t}dnf\b*\u001f";
        objectArray[77] = "\u000bc\u0003A\t~R{\f\fh*1=Z\t\u0003-Qu\u0000@Xy1{Z\f\u000e#\bmZK\u0017C";
        objectArray[78] = "lm\\Q{zzk]\u000e\u0011uf\t\u0005Q\u007f}x1_^\u0011*c8__~grhZ0|u?*^Yu#{dc]~'|i\nT(c2T\u000e_,d?=\u0007\th*\u00029\f\ro'k0ZI!\u001a;1\u0011\u000bs a9\u001dU\u0011";
        objectArray[79] = "\u0005*4,\u001b\u001cQ|~pxOj}ty\u0013K\n5.0H\u001fj+ :\u0014FS\u007fvpH%";
        objectArray[80] = "!eN^\u000b,rfP\u00033<}$vtyS 9@\u0007\\<m(\u0010\u00023";
        objectArray[81] = "\u0005(,ri?\u0015)|y\u00024\u001e(\u0012{m`\nn{r;$DS\u007fy?#I:v/{mt";
        objectArray[82] = "s\u001b\u0002<:o*\u0003\rq[;I\u0004\u0019u5+r\u0001\u0006}7R1\u0004Y#\"i4\u001bQ![";
        objectArray[83] = "QtRW\u0013\\Gt\u0015Ns\b.wT\b\u0018\u000bN?\u000eAC_.1T\r\u0015\u0005\u0017'TJ\fe";
        objectArray[84] = "dv|z_be)z$$gX,$\"O`8d~k\u00144X+#+\u0014d`un~$";
        objectArray[85] = "J\u000fzK\u001fs\u0013\u0017u\u0006~#pQ#\u0003\u0015 \u0010\u0019yJNtpQ|HE,J\u000btD\u001bN";
        objectArray[86] = "L{#\u007f_hZ{df?13x% T?S0\u007fi\u000fk3>%%Y1\n(%b@Q";
        objectArray[87] = "5\u0013\u0016\u000b5DaE\\WV\u001dZDV^=\u0013:\f\f\u0017fGZ\u0012\u0002\u001d:\u001ecFTWf}";
        objectArray[88] = "q+t8UO+)4a(\u0019w#'}v\u001ew9#\u0001E\u0018.:shLNjtN";
        objectArray[89] = "\u000bO\u0017\u0007K`_\u0019][(:d\u0018WRC7\u0004P\r\u001b\u0018cdN\u0003\u0011D:]\u001aU[\u0018Y";
        objectArray[90] = "\u0017_ \u0010T\u000bN\\bC8]p\u0003bGSZ\u0010K8\u000e\b\u000ep@6NY[\tH9A\u00014";
        objectArray[91] = "&?\u0012\u007f))riX#J}IhR*!~) \bcz*I>\u0006i&spjP#z\u0010";
        objectArray[92] = "Ks{<C\u0019\u0012p9o/O,/9kDHLgc\"\u001f\u001c,k?5J_Wi`1\u0010&";
        Object[] objectArray2 = objectArray;
        objectArray[93] = "q\btnn$5\u001dr*R$NZ.)9&.\u0012t`brNSu|n'!\u001ed,kH";
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dk" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = dk_0.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x105C;
        if (i[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = h[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])j.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    j.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/dk", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            dk_0.i[n2] = n3;
        }
        return i[n2];
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c5' || c == '\u00f5' || c == '\u00dd' || c == 'I') {
                field = dk_0.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c5' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f5' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00dd' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = dk_0.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d3' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d8' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = dk_0.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static void b(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        float f = ((Float)objectArray[2]).floatValue();
        float f10 = ((Float)objectArray[3]).floatValue();
        float f11 = ((Float)objectArray[4]).floatValue();
        float f12 = ((Float)objectArray[5]).floatValue();
        Color color = (Color)objectArray[6];
        Vector4f vector4f = (Vector4f)objectArray[7];
        long l = (Long)objectArray[8];
        long l2 = (l = d ^ l) ^ 0x731101C97CDEL;
        Object[] objectArray2 = new Object[10];
        objectArray2[9] = l2;
        objectArray2[8] = vector4f;
        objectArray2[7] = (int)dk_0.c("\u00d3", (Object)color, (long)-5791550112161657130L, (long)l);
        objectArray2[6] = Float.valueOf(f12);
        objectArray2[5] = Float.valueOf(f11);
        objectArray2[4] = Float.valueOf(f10);
        objectArray2[3] = Float.valueOf(f);
        objectArray2[2] = new Matrix4f();
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dk_0.c("\u00d3", (Object)a, (Object)objectArray2, (long)-5791327101691922357L, (long)l);
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

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dk" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static void c(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        Matrix4f matrix4f = (Matrix4f)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        float f10 = ((Float)objectArray[4]).floatValue();
        float f11 = ((Float)objectArray[5]).floatValue();
        float f12 = ((Float)objectArray[6]).floatValue();
        Color color = (Color)objectArray[7];
        float f13 = ((Float)objectArray[8]).floatValue();
        long l = (Long)objectArray[9];
        long l2 = (l = d ^ l) ^ 0x7567ABCF900DL;
        Object[] objectArray2 = new Object[10];
        objectArray2[9] = l2;
        objectArray2[8] = new Vector4f(f13);
        objectArray2[7] = (int)dk_0.c("\u00d3", (Object)color, (long)4860300634345038341L, (long)l);
        objectArray2[6] = Float.valueOf(f12);
        objectArray2[5] = Float.valueOf(f11);
        objectArray2[4] = Float.valueOf(f10);
        objectArray2[3] = Float.valueOf(f);
        objectArray2[2] = matrix4f;
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dk_0.c("\u00d3", (Object)a, (Object)objectArray2, (long)4859969874011198616L, (long)l);
    }

    private static Method h(long l, long l2) {
        int n = dk_0.e(l, l2);
        Object object = k[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = dk_0.l[n];
                int n3 = string2.indexOf(8);
                clazz3 = dk_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = dk_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = dk_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        dk_0.k[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = dk_0.f(2445007140019111L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = dk_0.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        dk_0.k[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = dk_0.f(2445007140019111L, 0L);
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

    public static void h(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        Matrix4f matrix4f = (Matrix4f)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        float f10 = ((Float)objectArray[4]).floatValue();
        float f11 = ((Float)objectArray[5]).floatValue();
        float f12 = ((Float)objectArray[6]).floatValue();
        float f13 = ((Float)objectArray[7]).floatValue();
        float f14 = ((Float)objectArray[8]).floatValue();
        Color color = (Color)objectArray[9];
        float f15 = ((Float)objectArray[10]).floatValue();
        long l = (Long)objectArray[11];
        long l2 = (l = d ^ l) ^ 0x645E6775B3E3L;
        Object[] objectArray2 = new Object[12];
        objectArray2[11] = l2;
        objectArray2[10] = new Vector4f(f15);
        objectArray2[9] = (int)dk_0.c("\u00d3", (Object)color, (long)784503344485215125L, (long)l);
        objectArray2[8] = Float.valueOf(f14);
        objectArray2[7] = Float.valueOf(f13);
        objectArray2[6] = Float.valueOf(f12);
        objectArray2[5] = Float.valueOf(f11);
        objectArray2[4] = Float.valueOf(f10);
        objectArray2[3] = Float.valueOf(f);
        objectArray2[2] = matrix4f;
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dk_0.c("\u00d3", (Object)a, (Object)objectArray2, (long)785863106636067342L, (long)l);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = dk_0.e(l, l2);
            object = k[n];
            try {
                if (!(object instanceof String)) break block2;
                dk_0.k[n] = clazz = Class.forName(dk_0.l[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static void f(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        float f = ((Float)objectArray[2]).floatValue();
        float f10 = ((Float)objectArray[3]).floatValue();
        float f11 = ((Float)objectArray[4]).floatValue();
        float f12 = ((Float)objectArray[5]).floatValue();
        float f13 = ((Float)objectArray[6]).floatValue();
        float f14 = ((Float)objectArray[7]).floatValue();
        Color color = (Color)objectArray[8];
        float f15 = ((Float)objectArray[9]).floatValue();
        long l = (Long)objectArray[10];
        long l2 = (l = d ^ l) ^ 0x7463CADB9697L;
        Object[] objectArray2 = new Object[12];
        objectArray2[11] = l2;
        objectArray2[10] = new Vector4f(f15);
        objectArray2[9] = (int)dk_0.c("\u00d3", (Object)color, (long)3429224617960247009L, (long)l);
        objectArray2[8] = Float.valueOf(f14);
        objectArray2[7] = Float.valueOf(f13);
        objectArray2[6] = Float.valueOf(f12);
        objectArray2[5] = Float.valueOf(f11);
        objectArray2[4] = Float.valueOf(f10);
        objectArray2[3] = Float.valueOf(f);
        objectArray2[2] = new Matrix4f();
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dk_0.c("\u00d3", (Object)a, (Object)objectArray2, (long)3428332683511371642L, (long)l);
    }

    public static void d(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        Matrix4f matrix4f = (Matrix4f)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        float f10 = ((Float)objectArray[4]).floatValue();
        float f11 = ((Float)objectArray[5]).floatValue();
        float f12 = ((Float)objectArray[6]).floatValue();
        Color color = (Color)objectArray[7];
        Vector4f vector4f = (Vector4f)objectArray[8];
        long l = (Long)objectArray[9];
        long l2 = (l = d ^ l) ^ 0x2BED9DC2630EL;
        Object[] objectArray2 = new Object[10];
        objectArray2[9] = l2;
        objectArray2[8] = vector4f;
        objectArray2[7] = (int)dk_0.c("\u00d3", (Object)color, (long)-5733048072243506938L, (long)l);
        objectArray2[6] = Float.valueOf(f12);
        objectArray2[5] = Float.valueOf(f11);
        objectArray2[4] = Float.valueOf(f10);
        objectArray2[3] = Float.valueOf(f);
        objectArray2[2] = matrix4f;
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dk_0.c("\u00d3", (Object)a, (Object)objectArray2, (long)-5732719126808074341L, (long)l);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = dk_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = dk_0.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = dk_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = dk_0.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static void a(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        float f = ((Float)objectArray[2]).floatValue();
        float f10 = ((Float)objectArray[3]).floatValue();
        float f11 = ((Float)objectArray[4]).floatValue();
        float f12 = ((Float)objectArray[5]).floatValue();
        Color color = (Color)objectArray[6];
        float f13 = ((Float)objectArray[7]).floatValue();
        long l = (Long)objectArray[8];
        long l2 = (l = d ^ l) ^ 0x29FF8C2A8465L;
        Object[] objectArray2 = new Object[10];
        objectArray2[9] = l2;
        objectArray2[8] = new Vector4f(f13);
        objectArray2[7] = (int)dk_0.c("\u00d3", (Object)color, (long)6276642619885418093L, (long)l);
        objectArray2[6] = Float.valueOf(f12);
        objectArray2[5] = Float.valueOf(f11);
        objectArray2[4] = Float.valueOf(f10);
        objectArray2[3] = Float.valueOf(f);
        objectArray2[2] = new Matrix4f();
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dk_0.c("\u00d3", (Object)a, (Object)objectArray2, (long)6276408477932617968L, (long)l);
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x261A;
        if (f[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])g.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    g.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/dk", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = e[n2].getBytes("ISO-8859-1");
            dk_0.f[n2] = dk_0.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return f[n2];
    }

    protected dt_0 a(Object[] objectArray) {
        dt_0 dt_02;
        block2: {
            dt_0 dt_03;
            block3: {
                Vector4f vector4f = (Vector4f)objectArray[0];
                long l = (Long)objectArray[1];
                long l2 = l = d ^ l;
                long l3 = l2 ^ 0x499E0F7A92FAL;
                long l4 = l2 ^ 0x1EEC6773E3ACL;
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = l3;
                objectArray2[0] = vector4f;
                CallSite callSite = dk_0.c("\u00d8", (Object)objectArray2, (long)-8649241457174901079L, (long)l);
                dt_03 = (dt_0)((Object)dk_0.c("\u00d3", (Object)b, (Object)callSite, (long)-8652908814072266681L, (long)l));
                CallSite callSite2 = dk_0.c("\u00d8", (long)-8653521737319668437L, (long)l);
                try {
                    dt_02 = dt_03;
                    if (callSite2 != null) break block2;
                    if (dt_02 != null) break block3;
                }
                catch (MatchException matchException) {
                    throw dk_0.c("\u00d8", (Object)matchException, (long)-8650864054145710610L, (long)l);
                }
                fW[] fWArray = new fW[dk_0.b("e", (int)26530, (long)(0x2E0422432A8E701AL ^ l))];
                fWArray[0] = fW.a;
                fWArray[1] = dk_0.c("\u00d8", (Object)new Object[]{dk_0.c("\u00d3", (Object)this, (Object)new Object[0], (long)-8650094545576519329L, (long)l)}, (long)-8650076219851326249L, (long)l);
                Object[] objectArray3 = new Object[2];
                objectArray3[1] = true;
                objectArray3[0] = (int)dk_0.b("e", (int)17685, (long)(0x53385632DDA2D2A8L ^ l));
                fWArray[2] = dk_0.c("\u00d8", (Object)objectArray3, (long)-8650745876074400632L, (long)l);
                Object[] objectArray4 = new Object[2];
                objectArray4[1] = true;
                objectArray4[0] = true;
                fWArray[3] = dk_0.c("\u00d8", (Object)objectArray4, (long)-8650315421636173262L, (long)l);
                Object[] objectArray5 = new Object[2];
                objectArray5[1] = (int)dk_0.b("e", (int)6003, (long)(0x64B07F0F07A380C9L ^ l));
                objectArray5[0] = (int)dk_0.b("e", (int)78, (long)(0x6C43FF55366B97F5L ^ l));
                fWArray[4] = dk_0.c("\u00d8", (Object)objectArray5, (long)-8650244871194356480L, (long)l);
                fWArray[5] = dk_0.c("\u00d8", (Object)new Object[]{arg_0 -> this.lambda$getRenderLayer$1((Vector4f)callSite, arg_0)}, (long)-8649791473227896666L, (long)l);
                dt_03 = new dt_0(gf_0.e, 4, false, fWArray, l4);
                dk_0.c("\u00d3", (Object)b, (Object)callSite, (Object)dt_03, (long)-8652846219008544801L, (long)l);
            }
            dt_02 = dt_03;
        }
        return dt_02;
    }

    protected bT a(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        Vector4f vector4f = (Vector4f)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l = d ^ l;
        long l3 = l2 ^ 0x361EC6BDC205L;
        long l4 = l2 ^ 0x6A80BBB02FBL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = vector4f;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l4;
        objectArray3[0] = dk_0.c("\u00d3", (Object)this, (Object)objectArray2, (long)-2716190318257837924L, (long)l);
        return dk_0.c("\u00d3", (Object)aq_02, (Object)objectArray3, (long)-2715931033739183589L, (long)l);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dk" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = dk_0.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static Field g(long l, long l2) {
        int n = dk_0.e(l, l2);
        Object object = k[n];
        if (object instanceof String) {
            String string = dk_0.l[n];
            int n2 = string.indexOf(8);
            Class clazz = dk_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = dk_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = dk_0.c(clazz3, string2, clazz2)) != null) {
                    dk_0.k[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = dk_0.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        dk_0.k[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = dk_0.f(2445007140019111L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static void g(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        float f = ((Float)objectArray[2]).floatValue();
        float f10 = ((Float)objectArray[3]).floatValue();
        float f11 = ((Float)objectArray[4]).floatValue();
        float f12 = ((Float)objectArray[5]).floatValue();
        float f13 = ((Float)objectArray[6]).floatValue();
        float f14 = ((Float)objectArray[7]).floatValue();
        Color color = (Color)objectArray[8];
        Vector4f vector4f = (Vector4f)objectArray[9];
        long l = (Long)objectArray[10];
        long l2 = (l = d ^ l) ^ 0x71BE749EE577L;
        Object[] objectArray2 = new Object[12];
        objectArray2[11] = l2;
        objectArray2[10] = vector4f;
        objectArray2[9] = (int)dk_0.c("\u00d3", (Object)color, (long)6662803256345820417L, (long)l);
        objectArray2[8] = Float.valueOf(f14);
        objectArray2[7] = Float.valueOf(f13);
        objectArray2[6] = Float.valueOf(f12);
        objectArray2[5] = Float.valueOf(f11);
        objectArray2[4] = Float.valueOf(f10);
        objectArray2[3] = Float.valueOf(f);
        objectArray2[2] = new Matrix4f();
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dk_0.c("\u00d3", (Object)a, (Object)objectArray2, (long)6661923037896238234L, (long)l);
    }

    private void j(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        Matrix4f matrix4f = (Matrix4f)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        float f10 = ((Float)objectArray[4]).floatValue();
        float f11 = ((Float)objectArray[5]).floatValue();
        float f12 = ((Float)objectArray[6]).floatValue();
        float f13 = ((Float)objectArray[7]).floatValue();
        float f14 = ((Float)objectArray[8]).floatValue();
        int n = (Integer)objectArray[9];
        Vector4f vector4f = (Vector4f)objectArray[10];
        long l = (Long)objectArray[11];
        long l2 = l = d ^ l;
        long l3 = l2 ^ 0x53DF319A6279L;
        long l4 = l2 ^ 0x5878A189A79CL;
        long l5 = l2 ^ 0x72A4894C0E72L;
        long l6 = l2 ^ 0x20E1F6802F4CL;
        long l7 = l2 ^ 0x3417930ADA95L;
        long l8 = l2 ^ 0x63B0760E634AL;
        CallSite callSite = dk_0.c("\u00d8", (float)(f12 - f), (long)2791782514413832103L, (long)l);
        CallSite callSite2 = dk_0.c("\u00d8", (float)(f13 - f10), (long)2791782514413832103L, (long)l);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l8;
        objectArray2[1] = vector4f;
        objectArray2[0] = aq_02;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        Object[] objectArray4 = new Object[5];
        objectArray4[4] = l6;
        objectArray4[3] = Float.valueOf(f14);
        objectArray4[2] = Float.valueOf(f13);
        objectArray4[1] = Float.valueOf(f);
        objectArray4[0] = matrix4f;
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l4;
        objectArray5[0] = new float[]{0.0f, 0.0f};
        Object[] objectArray6 = new Object[2];
        objectArray6[1] = l4;
        objectArray6[0] = new float[]{(float)callSite, (float)callSite2};
        Object[] objectArray7 = new Object[2];
        objectArray7[1] = l5;
        objectArray7[0] = n;
        Object[] objectArray8 = new Object[5];
        objectArray8[4] = l6;
        objectArray8[3] = Float.valueOf(f14);
        objectArray8[2] = Float.valueOf(f13);
        objectArray8[1] = Float.valueOf(f12);
        objectArray8[0] = matrix4f;
        Object[] objectArray9 = new Object[2];
        objectArray9[1] = l4;
        objectArray9[0] = new float[]{(float)callSite, 0.0f};
        Object[] objectArray10 = new Object[2];
        objectArray10[1] = l4;
        objectArray10[0] = new float[]{(float)callSite, (float)callSite2};
        Object[] objectArray11 = new Object[2];
        objectArray11[1] = l5;
        objectArray11[0] = n;
        Object[] objectArray12 = new Object[5];
        objectArray12[4] = l6;
        objectArray12[3] = Float.valueOf(f11);
        objectArray12[2] = Float.valueOf(f10);
        objectArray12[1] = Float.valueOf(f12);
        objectArray12[0] = matrix4f;
        Object[] objectArray13 = new Object[2];
        objectArray13[1] = l4;
        objectArray13[0] = new float[]{(float)callSite, (float)callSite2};
        Object[] objectArray14 = new Object[2];
        objectArray14[1] = l4;
        objectArray14[0] = new float[]{(float)callSite, (float)callSite2};
        Object[] objectArray15 = new Object[2];
        objectArray15[1] = l5;
        objectArray15[0] = n;
        Object[] objectArray16 = new Object[5];
        objectArray16[4] = l6;
        objectArray16[3] = Float.valueOf(f11);
        objectArray16[2] = Float.valueOf(f10);
        objectArray16[1] = Float.valueOf(f);
        objectArray16[0] = matrix4f;
        Object[] objectArray17 = new Object[2];
        objectArray17[1] = l4;
        objectArray17[0] = new float[]{0.0f, (float)callSite2};
        Object[] objectArray18 = new Object[2];
        objectArray18[1] = l4;
        objectArray18[0] = new float[]{(float)callSite, (float)callSite2};
        Object[] objectArray19 = new Object[2];
        objectArray19[1] = l5;
        objectArray19[0] = n;
        Object[] objectArray20 = new Object[2];
        objectArray20[1] = l7;
        objectArray20[0] = m_0.QUADS;
        dk_0.c("\u00d3", (Object)((bT)((Object)dk_0.c("\u00d3", (Object)dk_0.c("\u00d3", (Object)dk_0.c("\u00d3", (Object)dk_0.c("\u00d3", (Object)dk_0.c("\u00d3", (Object)dk_0.c("\u00d3", (Object)dk_0.c("\u00d3", (Object)dk_0.c("\u00d3", (Object)dk_0.c("\u00d3", (Object)dk_0.c("\u00d3", (Object)dk_0.c("\u00d3", (Object)dk_0.c("\u00d3", (Object)dk_0.c("\u00d3", (Object)dk_0.c("\u00d3", (Object)dk_0.c("\u00d3", (Object)dk_0.c("\u00d3", (Object)dk_0.c("\u00d3", (Object)((bT)((Object)dk_0.c("\u00d3", (Object)dk_0.c("\u00d3", (Object)this, (Object)objectArray2, (long)2790359723921238828L, (long)l), (Object)objectArray3, (long)2791214016307889490L, (long)l))), (Object)objectArray4, (long)2784432552622548527L, (long)l), (Object)objectArray5, (long)2784401012538167941L, (long)l), (Object)objectArray6, (long)2784401012538167941L, (long)l), (Object)objectArray7, (long)2791924291420336816L, (long)l), (Object)objectArray8, (long)2784432552622548527L, (long)l), (Object)objectArray9, (long)2784401012538167941L, (long)l), (Object)objectArray10, (long)2784401012538167941L, (long)l), (Object)objectArray11, (long)2791924291420336816L, (long)l), (Object)objectArray12, (long)2784432552622548527L, (long)l), (Object)objectArray13, (long)2784401012538167941L, (long)l), (Object)objectArray14, (long)2784401012538167941L, (long)l), (Object)objectArray15, (long)2791924291420336816L, (long)l), (Object)objectArray16, (long)2784432552622548527L, (long)l), (Object)objectArray17, (long)2784401012538167941L, (long)l), (Object)objectArray18, (long)2784401012538167941L, (long)l), (Object)objectArray19, (long)2791924291420336816L, (long)l), (Object)objectArray20, (long)2784700648027755419L, (long)l))), (Object)new Object[0], (long)2792151618126708083L, (long)l);
    }

    private void lambda$getRenderLayer$1(Vector4f vector4f, dy_0 dy_02) {
        long l = d ^ 0xE5EF6B26171L;
        dk_0.c("\u00d8", (int)this.c, (float)dk_0.c("\u00c5", (Object)vector4f, (long)-81873246124610345L, (long)l), (float)dk_0.c("\u00c5", (Object)vector4f, (long)-81657578458025466L, (long)l), (float)dk_0.c("\u00c5", (Object)vector4f, (long)-90042832517404840L, (long)l), (float)dk_0.c("\u00c5", (Object)vector4f, (long)-89605566900291715L, (long)l), (long)-81917599146141304L, (long)l);
    }

    private static void lambda$drawInternal$0(int n, Matrix4f matrix4f, float f, float f10, float f11, float f12, Float f13, cF cF2) {
        long l;
        long l2 = l = d ^ 0x3BC7116BB536L;
        long l3 = l2 ^ 0x311997CF6E5BL;
        long l4 = l2 ^ 0x52BE3E9692F0L;
        long l5 = l2 ^ 0x56D1355FD6B7L;
        long l6 = l2 ^ 0x6C8B822BBA7L;
        long l7 = l2 ^ 0x34ED23B0EC85L;
        long l8 = l2 ^ 0x3E5400CF365CL;
        long l9 = l2 ^ 0x3F5A4EB106ABL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l6;
        objectArray[0] = n;
        CallSite callSite = dk_0.c("\u00d8", (Object)objectArray, (long)3069842358580286684L, (long)l);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        Object[] objectArray3 = new Object[5];
        objectArray3[4] = l8;
        objectArray3[3] = Float.valueOf((float)dk_0.c("\u00d3", (Object)f13, (long)3071017406613932461L, (long)l));
        objectArray3[2] = Float.valueOf(f10 + f11);
        objectArray3[1] = Float.valueOf(f);
        objectArray3[0] = matrix4f;
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l9;
        objectArray4[0] = new float[]{0.0f, 0.0f};
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l9;
        objectArray5[0] = new float[]{f12, f11};
        Object[] objectArray6 = new Object[2];
        objectArray6[1] = l7;
        objectArray6[0] = (int)callSite;
        Object[] objectArray7 = new Object[5];
        objectArray7[4] = l8;
        objectArray7[3] = Float.valueOf((float)dk_0.c("\u00d3", (Object)f13, (long)3071017406613932461L, (long)l));
        objectArray7[2] = Float.valueOf(f10 + f11);
        objectArray7[1] = Float.valueOf(f + f12);
        objectArray7[0] = matrix4f;
        Object[] objectArray8 = new Object[2];
        objectArray8[1] = l9;
        objectArray8[0] = new float[]{f12, 0.0f};
        Object[] objectArray9 = new Object[2];
        objectArray9[1] = l9;
        objectArray9[0] = new float[]{f12, f11};
        Object[] objectArray10 = new Object[2];
        objectArray10[1] = l7;
        objectArray10[0] = (int)callSite;
        Object[] objectArray11 = new Object[5];
        objectArray11[4] = l8;
        objectArray11[3] = Float.valueOf((float)dk_0.c("\u00d3", (Object)f13, (long)3071017406613932461L, (long)l));
        objectArray11[2] = Float.valueOf(f10);
        objectArray11[1] = Float.valueOf(f + f12);
        objectArray11[0] = matrix4f;
        Object[] objectArray12 = new Object[2];
        objectArray12[1] = l9;
        objectArray12[0] = new float[]{f12, f11};
        Object[] objectArray13 = new Object[2];
        objectArray13[1] = l9;
        objectArray13[0] = new float[]{f12, f11};
        Object[] objectArray14 = new Object[2];
        objectArray14[1] = l7;
        objectArray14[0] = (int)callSite;
        Object[] objectArray15 = new Object[5];
        objectArray15[4] = l8;
        objectArray15[3] = Float.valueOf((float)dk_0.c("\u00d3", (Object)f13, (long)3071017406613932461L, (long)l));
        objectArray15[2] = Float.valueOf(f10);
        objectArray15[1] = Float.valueOf(f);
        objectArray15[0] = matrix4f;
        Object[] objectArray16 = new Object[2];
        objectArray16[1] = l9;
        objectArray16[0] = new float[]{0.0f, f11};
        Object[] objectArray17 = new Object[2];
        objectArray17[1] = l9;
        objectArray17[0] = new float[]{f12, f11};
        Object[] objectArray18 = new Object[2];
        objectArray18[1] = l7;
        objectArray18[0] = (int)callSite;
        Object[] objectArray19 = new Object[2];
        objectArray19[1] = l5;
        objectArray19[0] = m_0.QUADS;
        Object[] objectArray20 = new Object[1];
        objectArray20[0] = l4;
        dk_0.c("\u00d3", (Object)dk_0.c("\u00d3", (Object)dk_0.c("\u00d3", (Object)dk_0.c("\u00d3", (Object)dk_0.c("\u00d3", (Object)dk_0.c("\u00d3", (Object)dk_0.c("\u00d3", (Object)dk_0.c("\u00d3", (Object)dk_0.c("\u00d3", (Object)dk_0.c("\u00d3", (Object)dk_0.c("\u00d3", (Object)dk_0.c("\u00d3", (Object)dk_0.c("\u00d3", (Object)dk_0.c("\u00d3", (Object)dk_0.c("\u00d3", (Object)dk_0.c("\u00d3", (Object)dk_0.c("\u00d3", (Object)dk_0.c("\u00d3", (Object)dk_0.c("\u00d3", (Object)cF2, (Object)objectArray2, (long)3070892671704402288L, (long)l), (Object)objectArray3, (long)3069233372526195677L, (long)l), (Object)objectArray4, (long)3070233392630578659L, (long)l), (Object)objectArray5, (long)3070233392630578659L, (long)l), (Object)objectArray6, (long)3071100997442931473L, (long)l), (Object)objectArray7, (long)3069233372526195677L, (long)l), (Object)objectArray8, (long)3070233392630578659L, (long)l), (Object)objectArray9, (long)3070233392630578659L, (long)l), (Object)objectArray10, (long)3071100997442931473L, (long)l), (Object)objectArray11, (long)3069233372526195677L, (long)l), (Object)objectArray12, (long)3070233392630578659L, (long)l), (Object)objectArray13, (long)3070233392630578659L, (long)l), (Object)objectArray14, (long)3071100997442931473L, (long)l), (Object)objectArray15, (long)3069233372526195677L, (long)l), (Object)objectArray16, (long)3070233392630578659L, (long)l), (Object)objectArray17, (long)3070233392630578659L, (long)l), (Object)objectArray18, (long)3071100997442931473L, (long)l), (Object)objectArray19, (long)3064520029227425721L, (long)l), (Object)objectArray20, (long)3070767440868989937L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dk_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(dk_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_2() {
        try {
            return MethodHandles.lookup().findStatic(dk_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


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
import dev.zprestige.prestige.cF;
import dev.zprestige.prestige.dc_0;
import dev.zprestige.prestige.dt_0;
import dev.zprestige.prestige.dy_0;
import dev.zprestige.prestige.fW;
import dev.zprestige.prestige.gK;
import dev.zprestige.prestige.gM;
import dev.zprestige.prestige.gf_0;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.m_0;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.joml.Matrix4f;
import org.joml.Vector4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.dj
 */
public class dj_0
extends dc_0 {
    private static final dj_0 a;
    private static final Map b;
    private static final Matrix4f c;
    private static final ThreadLocal d;
    private final int e;
    private final int f;
    private static final long g;
    private static final String[] h;
    private static final String[] i;
    private static final Map j;
    private static final long[] k;
    private static final Integer[] l;
    private static final Map m;
    private static final Object[] n;
    private static final String[] p;

    private dj_0(long l) {
        long l2 = l = g ^ l;
        long l3 = l2 ^ 0x5407516116E3L;
        long l4 = l2 ^ 0xF7342260529L;
        super((String)((Object)dj_0.a("u", (int)5473, (long)(0xBE6D9A21BCF632FL ^ l))), (String)((Object)dj_0.a("u", (int)9744, (long)(0x275E68B172E505FL ^ l))), l4);
        Object[] objectArray = new Object[2];
        objectArray[1] = l3;
        objectArray[0] = dj_0.a("u", (int)4407, (long)(0x262ED31538AEE77BL ^ l));
        this.e = (int)dj_0.c("\u00cc", (Object)dj_0.c("\u00cc", (Object)this, (Object)new Object[0], (long)-3545062083641559572L, (long)l), (Object)objectArray, (long)-3546078444585093661L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = dj_0.a("u", (int)2933, (long)(0x20AD87BA1D497D38L ^ l));
        this.f = (int)dj_0.c("\u00cc", (Object)dj_0.c("\u00cc", (Object)this, (Object)new Object[0], (long)-3545062083641559572L, (long)l), (Object)objectArray2, (long)-3546078444585093661L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        dj_0.g = hc.a(-6084445288879704528L, -7253005635927122753L, MethodHandles.lookup().lookupClass()).a(68330570414403L);
                        v0 = var20 = dj_0.g ^ 99324041608717L;
                        var22_1 = v0 ^ 110153359935803L;
                        var24_2 = v0 ^ 128073231593681L;
                        dj_0.n = new Object[90];
                        dj_0.p = new String[90];
                        dj_0.b();
                        dj_0.j = new HashMap<K, V>(13);
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
                        var18_5 = new String[4];
                        var16_6 = 0;
                        var15_7 = "vE\u009a'\u00a5\u00d1\u00b6\u00a4\u0007k\u00fd\u0096l\u0097\u000b\u001a\u00aebE\u001aq<\u001c\u00dd(m\u008e\u00e3\u00fa\u00fdN\u0004I\u00ae\u001d\u00f7w\u000e\u00c8\u008a\u001dA\u00d4lN\u00ee\u008f\u00d9\u008f\u00ec=\u00e3\u00fagoe\u0095\u000b\u008fn\u00e9\u00c8\u00f6\u00fdQ";
                        var17_8 = "vE\u009a'\u00a5\u00d1\u00b6\u00a4\u0007k\u00fd\u0096l\u0097\u000b\u001a\u00aebE\u001aq<\u001c\u00dd(m\u008e\u00e3\u00fa\u00fdN\u0004I\u00ae\u001d\u00f7w\u000e\u00c8\u008a\u001dA\u00d4lN\u00ee\u008f\u00d9\u008f\u00ec=\u00e3\u00fagoe\u0095\u000b\u008fn\u00e9\u00c8\u00f6\u00fdQ".length();
                        var14_9 = 24;
                        var13_10 = -1;
lbl35:
                        // 2 sources

                        while (true) {
                            v4 = ++var13_10;
                            v5 = var15_7.substring(v4, v4 + var14_9);
                            v6 = -1;
                            break block18;
                            break;
                        }
lbl40:
                        // 1 sources

                        while (true) {
                            var18_5[var16_6++] = dj_0.a(var19_11).intern();
                            if ((var13_10 += var14_9) < var17_8) {
                                var14_9 = var15_7.charAt(var13_10);
                                ** continue;
                            }
                            var15_7 = "\u00aai\u0019x'<\u001f\u00b3\u0087\u0011\u00c6G\u00beg- \u00a1|\u008f\u00c1\u00db\u008c\u00a2\u008bt!i\u001a\u00b3\u0087E/9\u0089\u00846\u0011&\u0093!<\u00d1\u00c8\u0004\u0096\u001a\u001f\u008a\u00bc7\u00e7\u0098\u0013\u001a\u00d8\u0011@\u00f9D+\f\b\u00a2\u00a4T\u00d2\u00dc\u00ee\u00bd\u0011\u0016\u008d\u0095`\u00cf\u0013\u001eH\u000ed\u00a8}\u00fa\u00876\u00af\u0085\u0006\u0007\u00c4\u00d4\u00ee\u00dc\u00b1y\u00ad\u00df\u00bc\u009c\u001f\u001d\u0013\u00eeSX\u00da\u0004X\u0010\u00de\u00a7\u0081M\u00ccM\u00b9s\u0095D'H";
                            var17_8 = "\u00aai\u0019x'<\u001f\u00b3\u0087\u0011\u00c6G\u00beg- \u00a1|\u008f\u00c1\u00db\u008c\u00a2\u008bt!i\u001a\u00b3\u0087E/9\u0089\u00846\u0011&\u0093!<\u00d1\u00c8\u0004\u0096\u001a\u001f\u008a\u00bc7\u00e7\u0098\u0013\u001a\u00d8\u0011@\u00f9D+\f\b\u00a2\u00a4T\u00d2\u00dc\u00ee\u00bd\u0011\u0016\u008d\u0095`\u00cf\u0013\u001eH\u000ed\u00a8}\u00fa\u00876\u00af\u0085\u0006\u0007\u00c4\u00d4\u00ee\u00dc\u00b1y\u00ad\u00df\u00bc\u009c\u001f\u001d\u0013\u00eeSX\u00da\u0004X\u0010\u00de\u00a7\u0081M\u00ccM\u00b9s\u0095D'H".length();
                            var14_9 = 56;
                            var13_10 = -1;
lbl49:
                            // 2 sources

                            while (true) {
                                v7 = ++var13_10;
                                v5 = var15_7.substring(v7, v7 + var14_9);
                                v6 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl54:
                        // 1 sources

                        while (true) {
                            var18_5[var16_6++] = dj_0.a(var19_11).intern();
                            if ((var13_10 += var14_9) < var17_8) {
                                var14_9 = var15_7.charAt(var13_10);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var19_11 = var11_3.doFinal(v5.getBytes("ISO-8859-1"));
                    switch (v6) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl66:
                        // 1 sources

                        ** continue;
                    }
                }
                dj_0.h = var18_5;
                dj_0.i = new String[4];
                dj_0.m = new HashMap<K, V>(13);
                var0_12 = Cipher.getInstance("DES/CBC/NoPadding");
                v8 = SecretKeyFactory.getInstance("DES");
                v9 = new byte[8];
                v10 = v9;
                v9[0] = (byte)(var20 >>> 56);
                for (var1_13 = 1; var1_13 < 8; ++var1_13) {
                    v10 = v10;
                    v10[var1_13] = (byte)(var20 << var1_13 * 8 >>> 56);
                }
                var0_12.init(2, (Key)v8.generateSecret(new DESKeySpec(v10)), new IvParameterSpec(new byte[8]));
                var6_14 = new long[5];
                var3_15 = 0;
                var4_16 = "\u00f7\u0001\u00dd\u0004\u009d\u00cd\u00c3\u0000\u0002\u00cb)aL\u00e9\u0086\u001e_samt\u00a3k\u00b6";
                var5_17 = "\u00f7\u0001\u00dd\u0004\u009d\u00cd\u00c3\u0000\u0002\u00cb)aL\u00e9\u0086\u001e_samt\u00a3k\u00b6".length();
                var2_18 = 0;
                while (true) {
                    var7_19 = var4_16.substring(var2_18, var2_18 += 8).getBytes("ISO-8859-1");
                    v11 = var6_14;
                    v12 = var3_15++;
                    v13 = ((long)var7_19[0] & 255L) << 56 | ((long)var7_19[1] & 255L) << 48 | ((long)var7_19[2] & 255L) << 40 | ((long)var7_19[3] & 255L) << 32 | ((long)var7_19[4] & 255L) << 24 | ((long)var7_19[5] & 255L) << 16 | ((long)var7_19[6] & 255L) << 8 | (long)var7_19[7] & 255L;
                    v14 = -1;
                    break block20;
                    break;
                }
lbl105:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_18 < var5_17) ** continue;
                    var4_16 = "\u0000\u00a1\u009c\u0091\u00b8nn\u00ceu\u00d8FJ\u00fe\u0017\u00a1\u00b8";
                    var5_17 = "\u0000\u00a1\u009c\u0091\u00b8nn\u00ceu\u00d8FJ\u00fe\u0017\u00a1\u00b8".length();
                    var2_18 = 0;
                    while (true) {
                        var7_19 = var4_16.substring(var2_18, var2_18 += 8).getBytes("ISO-8859-1");
                        v11 = var6_14;
                        v12 = var3_15++;
                        v13 = ((long)var7_19[0] & 255L) << 56 | ((long)var7_19[1] & 255L) << 48 | ((long)var7_19[2] & 255L) << 40 | ((long)var7_19[3] & 255L) << 32 | ((long)var7_19[4] & 255L) << 24 | ((long)var7_19[5] & 255L) << 16 | ((long)var7_19[6] & 255L) << 8 | (long)var7_19[7] & 255L;
                        v14 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl124:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_18 < var5_17) ** continue;
                    break block21;
                    break;
                }
            }
            var8_20 = v13;
            var10_21 = var0_12.doFinal(new byte[]{(byte)(var8_20 >>> 56), (byte)(var8_20 >>> 48), (byte)(var8_20 >>> 40), (byte)(var8_20 >>> 32), (byte)(var8_20 >>> 24), (byte)(var8_20 >>> 16), (byte)(var8_20 >>> 8), (byte)var8_20});
            v15 = ((long)var10_21[0] & 255L) << 56 | ((long)var10_21[1] & 255L) << 48 | ((long)var10_21[2] & 255L) << 40 | ((long)var10_21[3] & 255L) << 32 | ((long)var10_21[4] & 255L) << 24 | ((long)var10_21[5] & 255L) << 16 | ((long)var10_21[6] & 255L) << 8 | (long)var10_21[7] & 255L;
            switch (v14) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl137:
                // 1 sources

                ** continue;
            }
        }
        dj_0.k = var6_14;
        dj_0.l = new Integer[5];
        dj_0.a = new dj_0(var24_2);
        v16 = new Object[2];
        v16[1] = var22_1;
        v16[0] = (int)dj_0.b("g", (int)6424, (long)(4766337469634786072L ^ var20));
        dj_0.b = dj_0.c("U", (Object)v16, (long)-4792691229224959262L, (long)var20);
        dj_0.c = new Matrix4f();
        dj_0.d = dj_0.c("U", (Supplier<Vector4f>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, <init>(), ()Lorg/joml/Vector4f;)(), (long)-4798732309020108433L, (long)var20);
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
        float f13 = ((Float)objectArray[9]).floatValue();
        long l = (Long)objectArray[10];
        long l2 = l = g ^ l;
        long l3 = l2 ^ 0xCC61A94AA9DL;
        long l4 = l2 ^ 0x705F7DAE4661L;
        long l5 = l2 ^ 0x3AADE213D1CEL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l5;
        objectArray2[1] = Float.valueOf(f13);
        objectArray2[0] = vector4f;
        CallSite callSite = dj_0.c("\u00cc", (Object)this, (Object)objectArray2, (long)842636098354112997L, (long)l);
        CallSite callSite2 = dj_0.c("\u00c6", (Object)vector4f, (long)841985375794330327L, (long)l);
        CallSite callSite3 = dj_0.c("\u00c6", (Object)vector4f, (long)841920169205351964L, (long)l);
        CallSite callSite4 = dj_0.c("\u00c6", (Object)vector4f, (long)843273923614443343L, (long)l);
        CallSite callSite5 = dj_0.c("\u00c6", (Object)vector4f, (long)842228460007806272L, (long)l);
        float f14 = f13;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l4;
        objectArray4[0] = new az_0((dt_0)((Object)callSite), (arg_0, arg_1) -> dj_0.lambda$drawInternal$0(n, (float)callSite2, (float)callSite3, (float)callSite4, (float)callSite5, f14, f11, f12, matrix4f, f, f10, arg_0, arg_1));
        dj_0.c("\u00cc", (Object)dj_0.c("U", (Object)objectArray3, (long)840314544104109055L, (long)l), (Object)objectArray4, (long)841709642829331508L, (long)l);
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (p[n3] != null) {
            return n3;
        }
        Object object = dj_0.n[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 40;
            case 1 -> 51;
            case 2 -> 7;
            case 3 -> 50;
            case 4 -> 48;
            case 5 -> 2;
            case 6 -> 1;
            case 7 -> 44;
            case 8 -> 26;
            case 9 -> 9;
            case 10 -> 12;
            case 11 -> 23;
            case 12 -> 18;
            case 13 -> 15;
            case 14 -> 63;
            case 15 -> 3;
            case 16 -> 20;
            case 17 -> 35;
            case 18 -> 8;
            case 19 -> 29;
            case 20 -> 36;
            case 21 -> 13;
            case 22 -> 5;
            case 23 -> 52;
            case 24 -> 60;
            case 25 -> 58;
            case 26 -> 43;
            case 27 -> 62;
            case 28 -> 38;
            case 29 -> 34;
            case 30 -> 45;
            case 31 -> 30;
            case 32 -> 57;
            case 33 -> 42;
            case 34 -> 21;
            case 35 -> 61;
            case 36 -> 10;
            case 37 -> 0;
            case 38 -> 37;
            case 39 -> 55;
            case 40 -> 32;
            case 41 -> 6;
            case 42 -> 22;
            case 43 -> 31;
            case 44 -> 17;
            case 45 -> 41;
            case 46 -> 16;
            case 47 -> 54;
            case 48 -> 27;
            case 49 -> 46;
            case 50 -> 4;
            case 51 -> 53;
            case 52 -> 19;
            case 53 -> 28;
            case 54 -> 33;
            case 55 -> 39;
            case 56 -> 24;
            case 57 -> 59;
            case 58 -> 49;
            case 59 -> 56;
            case 60 -> 14;
            case 61 -> 25;
            case 62 -> 11;
            default -> 47;
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
        dj_0.p[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = n;
        n[0] = "\u001dF<^xh\u001fXu&wd\u0006[)Dt";
        objectArray[1] = Float.TYPE;
        dj_0.p[1] = "java/lang/Float";
        objectArray[2] = "h\u0014l\u0016\u001a\u0006~\u0014iL\t\u0011i_jJ\u0005\u0005x\u0018}]N\u0012f";
        objectArray[3] = "!\u001f_[ \u0006T?TT1I51__5\u0013A";
        objectArray[4] = Void.TYPE;
        dj_0.p[4] = "java/lang/Void";
        objectArray[5] = "-G\u0010?h)&H\u0001p\u0012-5C\u0007:\n*$G\n";
        objectArray[6] = "\u0006}n9q\u001b\rr\u007fv\u0010\u0015\u0006y{,";
        objectArray[7] = "+;@z9 6.\u0018Xx-.(";
        objectArray[8] = Integer.TYPE;
        dj_0.p[8] = "java/lang/Integer";
        objectArray[9] = "g\bv\u001cYr\u0012(}\u0013H=s&v\u0018Lg\u0007";
        objectArray[10] = "S_>J2?E_;\u0010!(R\u00148\u0016-<CS/\u0001f+C";
        objectArray[11] = "Zx\u0017|\"\u0010Lx\u0012&1\u0007[3\u0011 =\u0013Jt\u00067v\u0007_";
        objectArray[12] = "5[\u0000I$+@{\u000bF5d!u\u0000M1>U";
        objectArray[13] = "^ W,N\"H Rv]5_kQpQ!N,Fg\u001a6{";
        objectArray[14] = "l?]u\b6\u0019\u001fVz\u0019yx\u0011]q\u001d#\f";
        objectArray[15] = "jzhr\u0005{|zm(\u0016lk1n.\u001axzvy9QhH";
        objectArray[16] = "\u0005mi]Z]pMbRK\u0012\u0011CiYOHe";
        objectArray[17] = "\u000f\u001f,H,4z?'G={\u001b1,L9!o";
        objectArray[18] = "h\u00024v\\\r\u001d\"?yMB|,4rI\u0018\b";
        objectArray[19] = "D\u0011\u001fTOwR\u0011\u001a\u000e\\`EZ\u0019\bPtT\u001d\u000e\u001f\u001b`B";
        objectArray[20] = "\u0006\u001e\u0000= \rs>\u000b21B\u00120\u000095\u0018f";
        objectArray[21] = "0v\u0016\u001f:h.~\fPY|*";
        objectArray[22] = "U\u0012\n\u0019vQK\u001a\u0010V>QQ\u0010\b\u00117J\u0011 \t\b(HV\u0016\u000e";
        objectArray[23] = "Hi^e\u001ej^i[?\r}I\"X9\u0001iXeO.J{d";
        objectArray[24] = "\r\u0010Qq;Sx0Z~*\u001c\u0005(Iy#Um";
        objectArray[25] = "!B\toT#7B\f5G4 \t\u000f3K 1N\u0018$\u00007&";
        objectArray[26] = "\ti\"-NA|I)\"_\u000e\u001dG\")[Ti";
        objectArray[27] = "G8\u0012JuMQ8\u0017\u0010fZFs\u0014\u0016jNW4\u0003\u0001![w";
        objectArray[28] = "\u0016u{k\u00164cUpd\u0007{\u0002[{o\u0003!v";
        objectArray[29] = "?\u0015 s\bM4\u001a1<k@!\u0017>W^B0\u0004\"{IO";
        objectArray[30] = "mk\"\u00138|{k'I+kl $O'\u007f}g3Xlj^";
        objectArray[31] = "uw~&.m\u0000Wu)?\"aY~\";x\u0015";
        objectArray[32] = "\t\u0016Gl\nn|6Lc\u001b!\u001d8Gh\u001f{i";
        objectArray[33] = "Ku<mw\u0000]u97d\u0017J>:1h\u0003[y-&#\u0017{";
        objectArray[34] = "\u0003W\u0019#,kvw\u0012,=$\u0017y\u0019'9~c";
        objectArray[35] = "\u0018x,\u001fcH\u000ex)Ep_\u00193*C|K\bt=T7_3";
        objectArray[36] = "\u007f\u0001\u0005n_5\n!\u000eaNzk/\u0005jJ \u001f";
        objectArray[37] = "\u007f\u0007z\u0018xai\u0007\u007fBkv~L|Dgbo\u000bkS,vJ";
        objectArray[38] = "2h\u0017 ,[GH\u001c/=\u0014&F\u0017$9NR";
        objectArray[39] = "Bt,8\u0005LTt)b\u0016[C?*d\u001aORx=sQ[u";
        objectArray[40] = "5oO\t2\u0002#oJS!\u00154$IU-\u0001%c^Bf\u0015\u001c";
        objectArray[41] = "\u0014\u0012I8\u0012t\u0011\u0007B8\u0011s\u001e\u000eIzPD7R\u001e";
        objectArray[42] = "S\t\u001a\u0007jQ&)\u0011\b{\u001eG'\u001a\u0003\u007fD3";
        objectArray[43] = "Po\u001d\u001a\u000e\u000b%O\u0016\u0015\u001fDDA\u001d\u001e\u001b\u001e0";
        objectArray[44] = "P=\u000e=\u0001\u007f%\u001d\u00052\u00100D\u0013\u000e9\u0014j0";
        objectArray[45] = "\u00001\u0005\te(u\u0011\u000e\u0006tg\u0014\u001f\u0005\rp=`";
        objectArray[46] = "f\u0012h.LCm\u001dya$Cc\u0012j";
        objectArray[47] = "e|qfR+\u0010\\ziCdqRqbG>\u0005";
        objectArray[48] = "mGhJ07fHy\u0005S:sN";
        objectArray[49] = "l\u001d\u0019[OJ\u0019=\u0012T^\u0005x3\u0019_Z_\f";
        objectArray[50] = "\u001a\u0010\u0019{,iNP\u0007,\u001cquHE>vk\u001fV\u0013wl\u001b";
        objectArray[51] = "N47/hI\u0019;6!\u0007Bw;5+7LH:$ww+H)hleZ\u0015'iz\u0007";
        objectArray[52] = "=+VL<C+x\u0014E^Y\t\u0013\u001d\u0015gP8b\b\u001en3";
        objectArray[53] = "e\rSNR\u0000fKFpOp/\u000f\u0012\u0013N\u0001:\u0004\u001b";
        objectArray[54] = "\u0013\u0013/\u001b\u0016\u001a\u0000\u0005d\bh\u0015\u007f\t5JX\u001b@\b$\u0016\u0018|\u0011H3H\u0004\u0002\r\u0015+\u000bh";
        objectArray[55] = ".\u0014WmE28DNru\"1)Lu\u001b*/\u0011\u0013zup3\u0019Er\u0014s2JH\u0014\u0005wl\u0017Te\u0010|et\u0011~\u001b},\u001eJ)\u0018sU";
        objectArray[56] = "\u00192DC2\"\t~\u0015P\u000b!p>D\u0000;'O?U\\{@\u00192DC2\"\t~\u0015P\u000b";
        objectArray[57] = "r\u0013l(6&%\u001cm&Y-K\u000e`.#*;\nawhD(\u00026m74,\u0003o&Y";
        objectArray[58] = "H:G{\nAK|RE\u001a1\u00028\u0006&\u0016@\u00173\u000f";
        objectArray[59] = ".7\u001afb\u00002j\u0002%\u000e\u0006={}cr\u0011>;F/~\u0011<\u0007A#a\u0000|<\r/a\u0002@;\u00010pB{w\r0r~";
        objectArray[60] = "\u0005cDggT\u00130\u0006n\u0005N0[E<}\u001a\u001c+Fzh$";
        objectArray[61] = "\u001f%rw-Q\u0003xj4A@\u001ci\u0015r=@\u000f).>1@\r\u0015)2.QM.e>.Sq";
        objectArray[62] = "\u0014-=z*/\u0004ali\u0013!}!=9#*B ,ecM\u0014-=z*/\u0004ali\u0013";
        objectArray[63] = "/gU?C*:e\u001c,-rK*\fm\u001d|t+\u001d1]\u001b/gU?C*:e\u001c,-";
        objectArray[64] = "3\u0005H{S$d\nIu<(\n\nJ\u007f\f!5\u000b[#LF1\u0011EtE,jFFz<";
        objectArray[65] = "\u0011aJjmH\u0004c\u0003y\u0003\u0010u,\u001383\u001eJ-\u0002dsy\u0012l\u00182c\u0017M;\u0011a\u0003";
        objectArray[66] = "\u0017^$i\u001c#\u0002\\mzr{s\u0013};BuL\u0012lg\u0002\u0012\t\u0006a0\u0016`\r\u000ewdr";
        objectArray[67] = "d.T\u000b^\\{nI\t3\tuy*\u001b\tUwa[\u000e\u0002\\\u0014o\u0010RP\u0012ez\u001b[3\u001c.&I\u0015B\t%/*";
        objectArray[68] = "@\u0013QGM8CUDyT%\u0006+YC\u0016+\u0004ZLH\u001fH@\u0013QGM8CUDy";
        objectArray[69] = "T>oX*fZ.y\t[l4!h\rkb\u000b yQ+\u0005Vi`T6<Y-mY[";
        objectArray[70] = "6#;u22u?k\u007fU&\u0007?d%e+8>uy%L:(hq3-9);|U";
        objectArray[71] = "\u0013?0J\u0012,D01D}#*02NM)\u00151#\u0012\rN\u0011+=E\u0004$J|>K}";
        objectArray[72] = "\u001c\u00176\u00145\u001f\u001fQ#*'oV\u0015wI)\u001eC\u001e~";
        objectArray[73] = "7U\u0018s\u001f\u00034\u0013\rM\fs}WY.\u0003\u0002h\\P";
        objectArray[74] = "\u0015y\u0003A\u0014\u0002\u0006oHRj\ryc\u0019\u0010Z\u0003Fb\bL\u001adC*\u0000\u0015\b\u0014@l\u0015+";
        objectArray[75] = "4\u001f^&Jsb\u0001\u000b&$\"b\u0019f X\"qY]lT\"se";
        objectArray[76] = "~\u001d\u0011[9\u001a*[\r\nU\u0015NP\u0002Ze\u0018qQ\u0013\u0006%\u007fuK\rQ,\u0015.\u001c\u000e_U";
        objectArray[77] = "a\u001d]X@\u001cwMDGp\f~ F@\u001e\u0004`\u0018\u001cOp^|\u0010OG\u0011]}CB!\u0000Y#\u001e^P\u0015R*}P\u001bI\u0000d\fE\u0010@cjG\u0019B\u000e\u0012\u007fL\u0010!\u0000Y#\u001e^P\u0015R*}\u001bK\u001eSc\u0017@\u001c\u001d]\u001a";
        objectArray[78] = "\u0004joX\u0000B\u0014&>K9Jmfo\u001b\tGRg~GI \u0004joX\u0000B\u0014&>K9";
        objectArray[79] = "SU9\r\tR\u0000H,\u000fy\u0001\u0003I\u000f|3nSS8\\\u001f\u000fPRkQy";
        objectArray[80] = "IP\u001c\u0010Qf\nLL\u001a6qxLC@\u0006\u007fGMR\u001cF\u0018H\u0001PAZ}\u001cGL\u00106";
        objectArray[81] = "\u0010\u0005?!}x\u0000In2Dzy\t?bt}F\b.>4\u001a\u0010\u0005?!}x\u0000In2D";
        objectArray[82] = "ju\f\u0018$~zd\b\u0019\u001flqx\b\u0019Akqb\feo8,|\u001f\u0014z3%\u001f";
        objectArray[83] = "-D^=\u0017k=\b\u000f..jDH^~\u001en{IO\"^\t-D^=\u0017k=\b\u000f..";
        objectArray[84] = "!sY7\u0012)4q\u0010$|qE>\u0000eL\u007fz?\u00119\f\u0018#pP<\u0005|'u\u00039|";
        objectArray[85] = "\u0005\nV]:\\\u0015F\u0007N\u0003Sl\u0006V\u001e3YS\u0007GBs>\u0005\nV]:\\\u0015F\u0007N\u0003";
        objectArray[86] = "\u0002\u000b\u0011}\u000e~\u0017\tXn`&fFH/P(YGYs\u0010O\u001eQId\u001b\"ZHG%`";
        objectArray[87] = "YR5>;\u0016V\u001683VC;\u001a=gfH\u0004\u001b,;&/\u0006\r130N\u0005\fb>V";
        objectArray[88] = "w\\\b=Y#!B]=7b-ZPFQ|0GYc7s&BUiI{/\u0017Y\u0007\fgt\u001c^9Zy!\u001c0";
        Object[] objectArray2 = objectArray;
        objectArray[89] = "\"?z;G\u001b=\u007fg9*N;~\u0004+\u0010\u00121pu>\u001b\u001bR~>bIU#k5k*[h7g%[Nc>\u0004";
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dj" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = dj_0.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1773;
        if (dj_0.l[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = k[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])m.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    m.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/dj", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            dj_0.l[n2] = n3;
        }
        return dj_0.l[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = dj_0.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c6' || c == 'e' || c == '\u00cb' || c == '\u00f3') {
                field = dj_0.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c6' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'e' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00cb' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = dj_0.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00cc' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'U' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
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
        float f13 = ((Float)objectArray[8]).floatValue();
        long l = (Long)objectArray[9];
        long l2 = (l = g ^ l) ^ 0x648EF214F6CL;
        Object[] objectArray2 = new Object[11];
        objectArray2[10] = l2;
        objectArray2[9] = Float.valueOf(f13);
        objectArray2[8] = vector4f;
        objectArray2[7] = (int)dj_0.c("\u00cc", (Object)color, (long)5169731253010299356L, (long)l);
        objectArray2[6] = Float.valueOf(f12);
        objectArray2[5] = Float.valueOf(f11);
        objectArray2[4] = Float.valueOf(f10);
        objectArray2[3] = Float.valueOf(f);
        objectArray2[2] = c;
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dj_0.c("\u00cc", (Object)a, (Object)objectArray2, (long)5169171588770387416L, (long)l);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dj" + " : " + string + " : " + methodType.toString(), exception);
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
        float f14 = ((Float)objectArray[9]).floatValue();
        long l = (Long)objectArray[10];
        long l2 = (l = g ^ l) ^ 0xA4942A51293L;
        Object[] objectArray2 = new Object[11];
        objectArray2[10] = l2;
        objectArray2[9] = Float.valueOf(f14);
        objectArray2[8] = dj_0.c("\u00cc", (Object)((Vector4f)dj_0.c("\u00cc", (Object)d, (long)1891657367049156623L, (long)l)), (float)f13, (long)1892456360019300113L, (long)l);
        objectArray2[7] = (int)dj_0.c("\u00cc", (Object)color, (long)1891968340712072227L, (long)l);
        objectArray2[6] = Float.valueOf(f12);
        objectArray2[5] = Float.valueOf(f11);
        objectArray2[4] = Float.valueOf(f10);
        objectArray2[3] = Float.valueOf(f);
        objectArray2[2] = matrix4f;
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dj_0.c("\u00cc", (Object)a, (Object)objectArray2, (long)1892525788741699623L, (long)l);
    }

    private static Method h(long l, long l2) {
        int n = dj_0.e(l, l2);
        Object object = dj_0.n[n];
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
                clazz3 = dj_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = dj_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = dj_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        dj_0.n[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = dj_0.f(489373569354413L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = dj_0.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        dj_0.n[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = dj_0.f(489373569354413L, 0L);
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

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = dj_0.e(l, l2);
            object = dj_0.n[n];
            try {
                if (!(object instanceof String)) break block2;
                dj_0.n[n] = clazz = Class.forName(p[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static void f(Object[] objectArray) {
        cF cF2 = (cF)objectArray[0];
        Matrix4f matrix4f = (Matrix4f)objectArray[1];
        float f = ((Float)objectArray[2]).floatValue();
        int n = (Integer)objectArray[3];
        float f10 = ((Float)objectArray[4]).floatValue();
        float f11 = ((Float)objectArray[5]).floatValue();
        float f12 = ((Float)objectArray[6]).floatValue();
        float f13 = ((Float)objectArray[7]).floatValue();
        float f14 = ((Float)objectArray[8]).floatValue();
        float f15 = ((Float)objectArray[9]).floatValue();
        float f16 = ((Float)objectArray[10]).floatValue();
        float f17 = ((Float)objectArray[11]).floatValue();
        float f18 = ((Float)objectArray[12]).floatValue();
        float f19 = ((Float)objectArray[13]).floatValue();
        long l = (Long)objectArray[14];
        long l2 = l = g ^ l;
        long l3 = l2 ^ 0x2D86A22AA3D9L;
        long l4 = l2 ^ 0x273F81557900L;
        long l5 = l2 ^ 0x2631CF2B49F7L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = Float.valueOf(f);
        objectArray2[2] = Float.valueOf(f13 + f15);
        objectArray2[1] = Float.valueOf(f12);
        objectArray2[0] = matrix4f;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l5;
        objectArray3[0] = new float[]{f16, f17};
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l5;
        objectArray4[0] = new float[]{f10, f11};
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l3;
        objectArray5[0] = n;
        Object[] objectArray6 = new Object[5];
        objectArray6[4] = l4;
        objectArray6[3] = Float.valueOf(f);
        objectArray6[2] = Float.valueOf(f13 + f15);
        objectArray6[1] = Float.valueOf(f12 + f14);
        objectArray6[0] = matrix4f;
        Object[] objectArray7 = new Object[2];
        objectArray7[1] = l5;
        objectArray7[0] = new float[]{f18, f17};
        Object[] objectArray8 = new Object[2];
        objectArray8[1] = l5;
        objectArray8[0] = new float[]{f10, f11};
        Object[] objectArray9 = new Object[2];
        objectArray9[1] = l3;
        objectArray9[0] = n;
        Object[] objectArray10 = new Object[5];
        objectArray10[4] = l4;
        objectArray10[3] = Float.valueOf(f);
        objectArray10[2] = Float.valueOf(f13);
        objectArray10[1] = Float.valueOf(f12 + f14);
        objectArray10[0] = matrix4f;
        Object[] objectArray11 = new Object[2];
        objectArray11[1] = l5;
        objectArray11[0] = new float[]{f18, f19};
        Object[] objectArray12 = new Object[2];
        objectArray12[1] = l5;
        objectArray12[0] = new float[]{f10, f11};
        Object[] objectArray13 = new Object[2];
        objectArray13[1] = l3;
        objectArray13[0] = n;
        Object[] objectArray14 = new Object[5];
        objectArray14[4] = l4;
        objectArray14[3] = Float.valueOf(f);
        objectArray14[2] = Float.valueOf(f13);
        objectArray14[1] = Float.valueOf(f12);
        objectArray14[0] = matrix4f;
        Object[] objectArray15 = new Object[2];
        objectArray15[1] = l5;
        objectArray15[0] = new float[]{f16, f19};
        Object[] objectArray16 = new Object[2];
        objectArray16[1] = l5;
        objectArray16[0] = new float[]{f10, f11};
        Object[] objectArray17 = new Object[2];
        objectArray17[1] = l3;
        objectArray17[0] = n;
        dj_0.c("\u00cc", (Object)dj_0.c("\u00cc", (Object)dj_0.c("\u00cc", (Object)dj_0.c("\u00cc", (Object)dj_0.c("\u00cc", (Object)dj_0.c("\u00cc", (Object)dj_0.c("\u00cc", (Object)dj_0.c("\u00cc", (Object)dj_0.c("\u00cc", (Object)dj_0.c("\u00cc", (Object)dj_0.c("\u00cc", (Object)dj_0.c("\u00cc", (Object)dj_0.c("\u00cc", (Object)dj_0.c("\u00cc", (Object)dj_0.c("\u00cc", (Object)dj_0.c("\u00cc", (Object)cF2, (Object)objectArray2, (long)7339695021286327742L, (long)l), (Object)objectArray3, (long)7334060929231196555L, (long)l), (Object)objectArray4, (long)7334060929231196555L, (long)l), (Object)objectArray5, (long)7332151915926942349L, (long)l), (Object)objectArray6, (long)7339695021286327742L, (long)l), (Object)objectArray7, (long)7334060929231196555L, (long)l), (Object)objectArray8, (long)7334060929231196555L, (long)l), (Object)objectArray9, (long)7332151915926942349L, (long)l), (Object)objectArray10, (long)7339695021286327742L, (long)l), (Object)objectArray11, (long)7334060929231196555L, (long)l), (Object)objectArray12, (long)7334060929231196555L, (long)l), (Object)objectArray13, (long)7332151915926942349L, (long)l), (Object)objectArray14, (long)7339695021286327742L, (long)l), (Object)objectArray15, (long)7334060929231196555L, (long)l), (Object)objectArray16, (long)7334060929231196555L, (long)l), (Object)objectArray17, (long)7332151915926942349L, (long)l);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = dj_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = dj_0.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = dj_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = dj_0.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
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
        float f13 = ((Float)objectArray[9]).floatValue();
        long l = (Long)objectArray[10];
        long l2 = (l = g ^ l) ^ 0x7E33B36BED13L;
        Object[] objectArray2 = new Object[11];
        objectArray2[10] = l2;
        objectArray2[9] = Float.valueOf(f13);
        objectArray2[8] = vector4f;
        objectArray2[7] = (int)dj_0.c("\u00cc", (Object)color, (long)-1890971620434814045L, (long)l);
        objectArray2[6] = Float.valueOf(f12);
        objectArray2[5] = Float.valueOf(f11);
        objectArray2[4] = Float.valueOf(f10);
        objectArray2[3] = Float.valueOf(f);
        objectArray2[2] = matrix4f;
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dj_0.c("\u00cc", (Object)a, (Object)objectArray2, (long)-1890405359123040345L, (long)l);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dj" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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
        float f14 = ((Float)objectArray[8]).floatValue();
        long l = (Long)objectArray[9];
        long l2 = (l = g ^ l) ^ 0x71EF86D1FE8BL;
        Object[] objectArray2 = new Object[11];
        objectArray2[10] = l2;
        objectArray2[9] = Float.valueOf(f14);
        objectArray2[8] = dj_0.c("\u00cc", (Object)((Vector4f)dj_0.c("\u00cc", (Object)d, (long)-695524682152815593L, (long)l)), (float)f13, (long)-694925782990593271L, (long)l);
        objectArray2[7] = (int)dj_0.c("\u00cc", (Object)color, (long)-695273393375066053L, (long)l);
        objectArray2[6] = Float.valueOf(f12);
        objectArray2[5] = Float.valueOf(f11);
        objectArray2[4] = Float.valueOf(f10);
        objectArray2[3] = Float.valueOf(f);
        objectArray2[2] = c;
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dj_0.c("\u00cc", (Object)a, (Object)objectArray2, (long)-694713729270160321L, (long)l);
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3890;
        if (i[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])j.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    j.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/dj", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = h[n2].getBytes("ISO-8859-1");
            dj_0.i[n2] = dj_0.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return i[n2];
    }

    protected dt_0 a(Object[] objectArray) {
        dt_0 dt_02;
        block2: {
            dt_0 dt_03;
            block3: {
                Vector4f vector4f = (Vector4f)objectArray[0];
                float f = ((Float)objectArray[1]).floatValue();
                long l = (Long)objectArray[2];
                long l2 = l = g ^ l;
                long l3 = l2 ^ 0x7EB0E79ECC10L;
                long l4 = l2 ^ 0x29C28F97BD46L;
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = l3;
                objectArray2[0] = vector4f;
                gM gM2 = new gM((Vector4f)dj_0.c("U", (Object)objectArray2, (long)-2801815126661878403L, (long)l), f);
                CallSite callSite = dj_0.c("U", (long)-2809186596220759268L, (long)l);
                dt_03 = (dt_0)((Object)dj_0.c("\u00cc", (Object)b, (Object)gM2, (long)-2810178675577281699L, (long)l));
                try {
                    dt_02 = dt_03;
                    if (callSite != null) break block2;
                    if (dt_02 != null) break block3;
                }
                catch (MatchException matchException) {
                    throw dj_0.c("U", (Object)matchException, (long)-2809907864179794807L, (long)l);
                }
                fW[] fWArray = new fW[dj_0.b("g", (int)27095, (long)(0x6B71425CCEFB27AFL ^ l))];
                fWArray[0] = fW.a;
                fWArray[1] = dj_0.c("U", (Object)new Object[]{dj_0.c("\u00cc", (Object)this, (Object)new Object[0], (long)-2801781332075437505L, (long)l)}, (long)-2801290164771075253L, (long)l);
                Object[] objectArray3 = new Object[2];
                objectArray3[1] = true;
                objectArray3[0] = (int)dj_0.b("g", (int)21859, (long)(0x1F4122D18FF41B1EL ^ l));
                fWArray[2] = dj_0.c("U", (Object)objectArray3, (long)-2802693101668300401L, (long)l);
                Object[] objectArray4 = new Object[2];
                objectArray4[1] = true;
                objectArray4[0] = true;
                fWArray[3] = dj_0.c("U", (Object)objectArray4, (long)-2802841840714308706L, (long)l);
                Object[] objectArray5 = new Object[2];
                objectArray5[1] = (int)dj_0.b("g", (int)12939, (long)(0x736EF84515B87CF4L ^ l));
                objectArray5[0] = (int)dj_0.b("g", (int)25097, (long)(0x5EDECD0B4F932C75L ^ l));
                fWArray[4] = dj_0.c("U", (Object)objectArray5, (long)-2801501471720255973L, (long)l);
                fWArray[5] = dj_0.c("U", (Object)new Object[]{arg_0 -> this.lambda$getRenderLayer$1(gM2, arg_0)}, (long)-2810080483615655647L, (long)l);
                dt_03 = new dt_0(gf_0.e, 4, false, fWArray, l4);
                dj_0.c("\u00cc", (Object)b, (Object)gM2, (Object)dt_03, (long)-2809772419570314866L, (long)l);
            }
            dt_02 = dt_03;
        }
        return dt_02;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = dj_0.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static Field g(long l, long l2) {
        int n = dj_0.e(l, l2);
        Object object = dj_0.n[n];
        if (object instanceof String) {
            String string = p[n];
            int n2 = string.indexOf(8);
            Class clazz = dj_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = dj_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = dj_0.c(clazz3, string2, clazz2)) != null) {
                    dj_0.n[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = dj_0.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        dj_0.n[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = dj_0.f(489373569354413L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void lambda$getRenderLayer$1(gM gM2, dy_0 dy_02) {
        long l = g ^ 0x22FD3073B664L;
        dj_0.c("U", (int)this.e, (float)dj_0.c("\u00c6", (Object)dj_0.c("\u00cc", (Object)gM2, (long)-5397808346864069305L, (long)l), (long)-5401477132551338894L, (long)l), (float)dj_0.c("\u00c6", (Object)dj_0.c("\u00cc", (Object)gM2, (long)-5397808346864069305L, (long)l), (long)-5401410276969776967L, (long)l), (float)dj_0.c("\u00c6", (Object)dj_0.c("\u00cc", (Object)gM2, (long)-5397808346864069305L, (long)l), (long)-5397945425757390358L, (long)l), (float)dj_0.c("\u00c6", (Object)dj_0.c("\u00cc", (Object)gM2, (long)-5397808346864069305L, (long)l), (long)-5398269747679204379L, (long)l), (long)-5401111655909690521L, (long)l);
        dj_0.c("U", (int)this.f, (float)dj_0.c("\u00cc", (Object)gM2, (long)-5398376909286326302L, (long)l), (long)-5398189735161774139L, (long)l);
    }

    private static void lambda$drawInternal$0(int n, float f, float f10, float f11, float f12, float f13, float f14, float f15, Matrix4f matrix4f, float f16, float f17, Float f18, cF cF2) {
        long l;
        long l2;
        long l3;
        block8: {
            float f19;
            CallSite callSite;
            long l4;
            block6: {
                long l5 = l3 = g ^ 0x7FEAC2908DCFL;
                long l6 = l5 ^ 0x1CAE1E2CCA60L;
                l2 = l5 ^ 0x7F09B77536CBL;
                l = l5 ^ 0x7B66BCBC728CL;
                long l7 = l5 ^ 0x2B7F31C11F9CL;
                l4 = l5 ^ 0x32811AC2E81BL;
                Object[] objectArray = new Object[2];
                objectArray[1] = l7;
                objectArray[0] = n;
                callSite = dj_0.c("U", (Object)objectArray, (long)-8168728413251162025L, (long)l3);
                CallSite callSite2 = dj_0.c("U", (float)dj_0.c("U", (float)f, (float)f10, (long)-8168120644483176093L, (long)l3), (float)dj_0.c("U", (float)f11, (float)f12, (long)-8168120644483176093L, (long)l3), (long)-8168120644483176093L, (long)l3);
                CallSite callSite3 = dj_0.c("U", (long)-8160541912821381984L, (long)l3);
                f19 = 2.0f * f13 + callSite2 + 2.0f;
                try {
                    block7: {
                        try {
                            try {
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l6;
                                dj_0.c("\u00cc", (Object)cF2, (Object)objectArray2, (long)-8167359589857418491L, (long)l3);
                                if (callSite3 != null) break block6;
                                if (!(f19 * 2.0f >= dj_0.c("U", (float)f14, (float)f15, (long)-8168535852611322976L, (long)l3))) break block7;
                            }
                            catch (MatchException matchException) {
                                throw dj_0.c("U", (Object)matchException, (long)-8161333559976670411L, (long)l3);
                            }
                            Object[] objectArray3 = new Object[15];
                            objectArray3[14] = l4;
                            objectArray3[13] = Float.valueOf(f15);
                            objectArray3[12] = Float.valueOf(f14);
                            objectArray3[11] = Float.valueOf(0.0f);
                            objectArray3[10] = Float.valueOf(0.0f);
                            objectArray3[9] = Float.valueOf(f15);
                            objectArray3[8] = Float.valueOf(f14);
                            objectArray3[7] = Float.valueOf(f17);
                            objectArray3[6] = Float.valueOf(f16);
                            objectArray3[5] = Float.valueOf(f15);
                            objectArray3[4] = Float.valueOf(f14);
                            objectArray3[3] = (int)callSite;
                            objectArray3[2] = Float.valueOf((float)dj_0.c("\u00cc", (Object)f18, (long)-8167287396436466444L, (long)l3));
                            objectArray3[1] = matrix4f;
                            objectArray3[0] = cF2;
                            dj_0.c("U", (Object)objectArray3, (long)-8168604933728490029L, (long)l3);
                            if (callSite3 == null) break block8;
                        }
                        catch (MatchException matchException) {
                            throw dj_0.c("U", (Object)matchException, (long)-8161333559976670411L, (long)l3);
                        }
                    }
                    Object[] objectArray4 = new Object[15];
                    objectArray4[14] = l4;
                    objectArray4[13] = Float.valueOf(f15);
                    objectArray4[12] = Float.valueOf(f14);
                    objectArray4[11] = Float.valueOf(f15 - f19);
                    objectArray4[10] = Float.valueOf(0.0f);
                    objectArray4[9] = Float.valueOf(f19);
                    objectArray4[8] = Float.valueOf(f14);
                    objectArray4[7] = Float.valueOf(f17);
                    objectArray4[6] = Float.valueOf(f16);
                    objectArray4[5] = Float.valueOf(f15);
                    objectArray4[4] = Float.valueOf(f14);
                    objectArray4[3] = (int)callSite;
                    objectArray4[2] = Float.valueOf((float)dj_0.c("\u00cc", (Object)f18, (long)-8167287396436466444L, (long)l3));
                    objectArray4[1] = matrix4f;
                    objectArray4[0] = cF2;
                    dj_0.c("U", (Object)objectArray4, (long)-8168604933728490029L, (long)l3);
                    Object[] objectArray5 = new Object[15];
                    objectArray5[14] = l4;
                    objectArray5[13] = Float.valueOf(f19);
                    objectArray5[12] = Float.valueOf(f14);
                    objectArray5[11] = Float.valueOf(0.0f);
                    objectArray5[10] = Float.valueOf(0.0f);
                    objectArray5[9] = Float.valueOf(f19);
                    objectArray5[8] = Float.valueOf(f14);
                    objectArray5[7] = Float.valueOf(f17 + f15 - f19);
                    objectArray5[6] = Float.valueOf(f16);
                    objectArray5[5] = Float.valueOf(f15);
                    objectArray5[4] = Float.valueOf(f14);
                    objectArray5[3] = (int)callSite;
                    objectArray5[2] = Float.valueOf((float)dj_0.c("\u00cc", (Object)f18, (long)-8167287396436466444L, (long)l3));
                    objectArray5[1] = matrix4f;
                    objectArray5[0] = cF2;
                    dj_0.c("U", (Object)objectArray5, (long)-8168604933728490029L, (long)l3);
                    Object[] objectArray6 = new Object[15];
                    objectArray6[14] = l4;
                    objectArray6[13] = Float.valueOf(f15 - f19);
                    objectArray6[12] = Float.valueOf(f19);
                    objectArray6[11] = Float.valueOf(f19);
                    objectArray6[10] = Float.valueOf(0.0f);
                    objectArray6[9] = Float.valueOf(f15 - 2.0f * f19);
                    objectArray6[8] = Float.valueOf(f19);
                    objectArray6[7] = Float.valueOf(f17 + f19);
                    objectArray6[6] = Float.valueOf(f16);
                    objectArray6[5] = Float.valueOf(f15);
                    objectArray6[4] = Float.valueOf(f14);
                    objectArray6[3] = (int)callSite;
                    objectArray6[2] = Float.valueOf((float)dj_0.c("\u00cc", (Object)f18, (long)-8167287396436466444L, (long)l3));
                    objectArray6[1] = matrix4f;
                    objectArray6[0] = cF2;
                    dj_0.c("U", (Object)objectArray6, (long)-8168604933728490029L, (long)l3);
                }
                catch (MatchException matchException) {
                    throw dj_0.c("U", (Object)matchException, (long)-8161333559976670411L, (long)l3);
                }
            }
            Object[] objectArray = new Object[15];
            objectArray[14] = l4;
            objectArray[13] = Float.valueOf(f15 - f19);
            objectArray[12] = Float.valueOf(f14);
            objectArray[11] = Float.valueOf(f19);
            objectArray[10] = Float.valueOf(f14 - f19);
            objectArray[9] = Float.valueOf(f15 - 2.0f * f19);
            objectArray[8] = Float.valueOf(f19);
            objectArray[7] = Float.valueOf(f17 + f19);
            objectArray[6] = Float.valueOf(f16 + f14 - f19);
            objectArray[5] = Float.valueOf(f15);
            objectArray[4] = Float.valueOf(f14);
            objectArray[3] = (int)callSite;
            objectArray[2] = Float.valueOf((float)dj_0.c("\u00cc", (Object)f18, (long)-8167287396436466444L, (long)l3));
            objectArray[1] = matrix4f;
            objectArray[0] = cF2;
            dj_0.c("U", (Object)objectArray, (long)-8168604933728490029L, (long)l3);
        }
        Object[] objectArray = new Object[2];
        objectArray[1] = l;
        objectArray[0] = m_0.QUADS;
        Object[] objectArray7 = new Object[1];
        objectArray7[0] = l2;
        dj_0.c("\u00cc", (Object)dj_0.c("\u00cc", (Object)cF2, (Object)objectArray, (long)-8161272622702066708L, (long)l3), (Object)objectArray7, (long)-8167519140044943627L, (long)l3);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dj_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(dj_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(dj_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


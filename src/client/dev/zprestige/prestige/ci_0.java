/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aq_0;
import dev.zprestige.prestige.b4;
import dev.zprestige.prestige.bW;
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
 * Renamed from dev.zprestige.prestige.ci
 */
public class ci_0
extends b4 {
    private static final String a;
    private static final String b;
    private static final float m = 12.0f;
    private bW c;
    private static final long v;
    private static final String[] w;
    private static final String[] x;
    private static final Map y;
    private static final long B;
    private static final Object[] C;
    private static final String[] D;

    public ci_0(long l) {
        long l2 = (l = v ^ l) ^ 0x6580F1896B58L;
        super((String)((Object)ci_0.a("f", (int)7809, (long)(0x483BAFFC0CE128ADL ^ l))), (String)((Object)ci_0.a("f", (int)26986, (long)(0x7C724197F66F5F45L ^ l))), l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    ci_0.v = hc.a(-6616268159998113221L, -1095396056414023846L, MethodHandles.lookup().lookupClass()).a(169171996888594L);
                    ci_0.C = new Object[63];
                    ci_0.D = new String[63];
                    ci_0.b();
                    ci_0.y = new HashMap<K, V>(13);
                    var5 = ci_0.v ^ 37105528431530L;
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
                    var14_3 = new String[9];
                    var12_4 = 0;
                    var11_5 = "\u00a2 \u0098\u00ee0}\u00fc\u0082/\u00b5x\b\u00e2C\u00ee\u008a\u00b5TSG\u00bc\u0088\u00a1\\ \u00a9k\u0007B@l>^\u00af\u00d3\u00a9\u0004\u001f\u00fd\u00ea\u00c4~4\u00d6Q\u00c8\u009b\u008dX+ \u00a2\u00c2\u0095l\u00a88 \u00c2H\u00c2\u00b7D\u00b2\u00e4\u00db\\H\u00e2\u0006\u00a4\u00e1\u00db\u0007\u00da\u0085@.?\u0015\u00db\u00da\u00ce\u00feF\u00c1\u001cW{\u0016\u0010\u00dc\u0017K\u00b7\u008d\u008d\u00f4\u00ae\u00d76\u0005\u00f37\f\u00ab\u00158\u00a1\u00c4\u00df^\u0090<>\u00c1<^\u007fae\u001e\u0099hr`6\u00d0Wl\u0016\u00eb!\u000eo\u0005\u0091\u00b7k\u00db\u00a6\u0017\"\u00bc\u0002\u00a7\u00dc\u00eb#\u00adV\u00e6\u00cd\u00cc(\u00ca\u00a3\u00ba\u009e\t\u0091\u00fe\u00ed\u00ff0\u0088\u00d6:r\u0006H\u001fS\u001b5\b\u0097\u00ab\u00b8\u00ae\u00ac\u00c0$\u00e6\u00f0n\u00f3\u00e1\u00e8\u000f\u00a0\u00f5\u00b3\u00d7\u00f3\u00b2>\u008a\u00b3e\u00fd\u0092\u00d99\u00f7\u00f06\u001d0\u00a9\u00b9\u00eem \u0092\u00b4%Y{';\u00be\u0090\u00a2y6^M\u00e6\u0091'\u00c9\u00b2\u001b\u0093\u00f4\u00f2\u00e8+\u00c3\u00d6\u00f4\u00f5\u0003\u0093F";
                    var13_6 = "\u00a2 \u0098\u00ee0}\u00fc\u0082/\u00b5x\b\u00e2C\u00ee\u008a\u00b5TSG\u00bc\u0088\u00a1\\ \u00a9k\u0007B@l>^\u00af\u00d3\u00a9\u0004\u001f\u00fd\u00ea\u00c4~4\u00d6Q\u00c8\u009b\u008dX+ \u00a2\u00c2\u0095l\u00a88 \u00c2H\u00c2\u00b7D\u00b2\u00e4\u00db\\H\u00e2\u0006\u00a4\u00e1\u00db\u0007\u00da\u0085@.?\u0015\u00db\u00da\u00ce\u00feF\u00c1\u001cW{\u0016\u0010\u00dc\u0017K\u00b7\u008d\u008d\u00f4\u00ae\u00d76\u0005\u00f37\f\u00ab\u00158\u00a1\u00c4\u00df^\u0090<>\u00c1<^\u007fae\u001e\u0099hr`6\u00d0Wl\u0016\u00eb!\u000eo\u0005\u0091\u00b7k\u00db\u00a6\u0017\"\u00bc\u0002\u00a7\u00dc\u00eb#\u00adV\u00e6\u00cd\u00cc(\u00ca\u00a3\u00ba\u009e\t\u0091\u00fe\u00ed\u00ff0\u0088\u00d6:r\u0006H\u001fS\u001b5\b\u0097\u00ab\u00b8\u00ae\u00ac\u00c0$\u00e6\u00f0n\u00f3\u00e1\u00e8\u000f\u00a0\u00f5\u00b3\u00d7\u00f3\u00b2>\u008a\u00b3e\u00fd\u0092\u00d99\u00f7\u00f06\u001d0\u00a9\u00b9\u00eem \u0092\u00b4%Y{';\u00be\u0090\u00a2y6^M\u00e6\u0091'\u00c9\u00b2\u001b\u0093\u00f4\u00f2\u00e8+\u00c3\u00d6\u00f4\u00f5\u0003\u0093F".length();
                    var10_7 = 24;
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
                        var14_3[var12_4++] = ci_0.b(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        var11_5 = "\u008e\u0085\u00f4\u00fa6\u0088\u00dd\u00ce\u00fc\u00a5\u0004(k\u000f\u00c1\u009c\u00a8\u00e2\f\u00b8\u00d1\u00e3\u0084\u00ca\u00a7?\u001b\u00aa\u00d0\u0085\u00bf4\u0010\u00fb\u000b\u00b0m?|\u0081D\u008c\u00ce\u00fe\"0\u0095-\u00a2";
                        var13_6 = "\u008e\u0085\u00f4\u00fa6\u0088\u00dd\u00ce\u00fc\u00a5\u0004(k\u000f\u00c1\u009c\u00a8\u00e2\f\u00b8\u00d1\u00e3\u0084\u00ca\u00a7?\u001b\u00aa\u00d0\u0085\u00bf4\u0010\u00fb\u000b\u00b0m?|\u0081D\u008c\u00ce\u00fe\"0\u0095-\u00a2".length();
                        var10_7 = 32;
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
                        var14_3[var12_4++] = ci_0.b(var15_9).intern();
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
            ci_0.w = var14_3;
            ci_0.x = new String[9];
            ci_0.a = ci_0.a("f", (int)32472, (long)(4778909222509068103L ^ var5));
            ci_0.b = ci_0.a("f", (int)1046, (long)(7818488415127782787L ^ var5));
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
lbl85:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
        var2_12 = 3775184498621035192L;
        var4_13 = var0_10.doFinal(new byte[]{(byte)(var2_12 >>> 56), (byte)(var2_12 >>> 48), (byte)(var2_12 >>> 40), (byte)(var2_12 >>> 32), (byte)(var2_12 >>> 24), (byte)(var2_12 >>> 16), (byte)(var2_12 >>> 8), (byte)var2_12});
        ** while (true)
        ci_0.B = ((long)var4_13[0] & 255L) << 56 | ((long)var4_13[1] & 255L) << 48 | ((long)var4_13[2] & 255L) << 40 | ((long)var4_13[3] & 255L) << 32 | ((long)var4_13[4] & 255L) << 24 | ((long)var4_13[5] & 255L) << 16 | ((long)var4_13[6] & 255L) << 8 | (long)var4_13[7] & 255L;
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
            case 0 -> 12;
            case 1 -> 52;
            case 2 -> 22;
            case 3 -> 59;
            case 4 -> 14;
            case 5 -> 58;
            case 6 -> 32;
            case 7 -> 23;
            case 8 -> 38;
            case 9 -> 56;
            case 10 -> 42;
            case 11 -> 45;
            case 12 -> 46;
            case 13 -> 19;
            case 14 -> 41;
            case 15 -> 53;
            case 16 -> 25;
            case 17 -> 61;
            case 18 -> 33;
            case 19 -> 10;
            case 20 -> 2;
            case 21 -> 17;
            case 22 -> 30;
            case 23 -> 54;
            case 24 -> 51;
            case 25 -> 62;
            case 26 -> 55;
            case 27 -> 35;
            case 28 -> 49;
            case 29 -> 7;
            case 30 -> 20;
            case 31 -> 39;
            case 32 -> 48;
            case 33 -> 29;
            case 34 -> 8;
            case 35 -> 5;
            case 36 -> 16;
            case 37 -> 3;
            case 38 -> 28;
            case 39 -> 27;
            case 40 -> 44;
            case 41 -> 9;
            case 42 -> 18;
            case 43 -> 11;
            case 44 -> 34;
            case 45 -> 37;
            case 46 -> 4;
            case 47 -> 15;
            case 48 -> 60;
            case 49 -> 26;
            case 50 -> 43;
            case 51 -> 50;
            case 52 -> 31;
            case 53 -> 6;
            case 54 -> 57;
            case 55 -> 1;
            case 56 -> 0;
            case 57 -> 13;
            case 58 -> 40;
            case 59 -> 24;
            case 60 -> 63;
            case 61 -> 21;
            case 62 -> 36;
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
        ci_0.D[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = C;
        C[0] = "\u0015qzp\u001f\u001e\u0003q\u007f*\f\t\u0014:|,\u0000\u001d\u0005}k;K\n\u001c";
        objectArray[1] = "_9gw\u00069*\u0019lx\u0017vK\u0017gs\u0013,?";
        objectArray[2] = "M\b\u000fU3u[\b\n\u000f bLC\t\t,v]\u0004\u001e\u001egg~";
        objectArray[3] = "\u001bv9\u0000RA\u0006ca\"\u0013L\u001ee";
        objectArray[4] = Integer.TYPE;
        ci_0.D[4] = "java/lang/Integer";
        objectArray[5] = "w\u0002. #0a\u0002+z0'vI(|<3g\u000e?kw![";
        objectArray[6] = "\u0015>\u0017 ^l`\u001e\u001c/O#\u001d\u0006\u000f(Fju";
        objectArray[7] = "|\u0001C\u0002Y\nj\u0001FXJ\u001d}JE^F\tl\rRI\r\u001eY";
        objectArray[8] = "zS\u001d2\b\"\u000fs\u0016=\u0019mn}\u001d6\u001d7\u001a";
        objectArray[9] = Void.TYPE;
        ci_0.D[9] = "java/lang/Void";
        objectArray[10] = "H'Im+\u0017^'L78\u0000IlO14\u0014X+X&\u007f\u0004B";
        objectArray[11] = "_<tHU?*\u001c\u007fGDpK\u0012tL@*?";
        objectArray[12] = Float.TYPE;
        ci_0.D[12] = "java/lang/Float";
        objectArray[13] = ")@dzdi?@a w~(\u000bb&{j9Lu10z$";
        objectArray[14] = "}\u00167j6Lv\u0019&%UAc\u0014)N`Cr\u00075bwN";
        objectArray[15] = "*Z\nw0\u0019<Z\u000f-#\u000e+\u0011\f+/\u001a:V\u001b<d\u000bz";
        objectArray[16] = "\u007fr\u0019\t\"\n\nR\u0012\u00063Ek\\\u0019\r7\u001f\u001f";
        objectArray[17] = "\n{]?\u0015O\u001c{Xe\u0006X\u000b0[c\nL\u001awLtA^+";
        objectArray[18] = "{Ex4S*\u000ees;Beokx0F?\u001b";
        objectArray[19] = "V\n\u001f\u0018g:@\n\u001aBt-WA\u0019Dx9F\u0006\u000eS3)s";
        objectArray[20] = "TD@2)\u0007!dK=8H@j@6<\u00124";
        objectArray[21] = "|E\u0013Y`|\te\u0018Vq3hk\u0013]ui\u001c";
        objectArray[22] = "<d-i\u001dF*d(3\u000eQ=/+5\u0002E,h<\"IR3";
        objectArray[23] = "yVI\u0007\u0007K\fvB\b\u0016\u0004mxI\u0003\u0012^\u0019";
        objectArray[24] = "\u0004\u0011\u0004\u001f`N\u0012\u0011\u0001EsY\u0005Z\u0002C\u007fM\u0014\u001d\u0015T4Z\u0004";
        objectArray[25] = "\u0016Tyxpgctrwa(\u0002zy|erv";
        objectArray[26] = ",5CN\u0000\u001c:5F\u0014\u0013\u000b-~E\u0012\u001f\u001f<9R\u0005T\b$";
        objectArray[27] = "u\u0004\"\u000f\u0007O\u0000$)\u0000\u0016\u0000a*\"\u000b\u0012Z\u0015";
        objectArray[28] = "\u00164-0R*\u001d;<\u007f1'\b=";
        objectArray[29] = Double.TYPE;
        ci_0.D[29] = "java/lang/Double";
        objectArray[30] = "j>-sr\u0001\u001f\u001e&|cN~\u0010-wg\u0014\n";
        objectArray[31] = Boolean.TYPE;
        ci_0.D[31] = "java/lang/Boolean";
        objectArray[32] = "}a [6Cka%\u0001%T|*&\u0007)@mm1\u0010bPum3\u001b8\u001dIv3\u00068Z~a";
        objectArray[33] = "\u0016\u001aW\u00006\u0014\u0000\u001aRZ%\u0003\u0017QQ\\)\u0017\u0006\u0016FKb\u00071";
        objectArray[34] = "8PXs#g3_I<^r!EK\u007f";
        objectArray[35] = Long.TYPE;
        ci_0.D[35] = "java/lang/Long";
        objectArray[36] = "+\f\u00190xD^,\u0012?i\u000b?\"\u00194mQK";
        objectArray[37] = "oNH~\u001f?\u001anCq\u000ep{`Hz\n*\u000f";
        objectArray[38] = "t\fH\u0004\u0011!\u0001,C\u000b\u0000n`\"H\u0000\u00044\u0014";
        objectArray[39] = "\u0019\u001b9\u0017>b\u0012\u0014(X_l\u0019\u001f,\u0002";
        objectArray[40] = "x7\u001f(P\u001fq7\rL]'1%\tqW\u001f,4\u001d74\u001dq,\u001c+\u000f\u001ct0\u001dL";
        objectArray[41] = "^i\u0017\u0011\u00125\u001bn\u001bWn3\tr(R\u00031\u0002\u000e]X\u0012m\u001bq\u001aU\u0012cd";
        objectArray[42] = "\rAe1){GV):\u0012}6\u001ay9yiF_}1}\u0017";
        objectArray[43] = "!Opkk.mA$c\r&\u001dHm}0!%U|ivB#]h\"r0qK$q\r";
        objectArray[44] = "OaA\u0002q=H;\f\u0002\u0015/&yD\u0007(%\u001edU\u0013nF\u0018lAXj4Jz\r\u000b\u0015";
        objectArray[45] = "\u0017KrTq.RL~\u0012\r(@PX\u0000aG\u0017\\~\\r8PQ~R\r";
        objectArray[46] = "%r\u001dKA{c\"\u001f\t,l\u001a2Z\u001c\u0011f\"/K\bW\u0005*2Z\u0015S`g\"\u001a\u000b,";
        objectArray[47] = "A[:=\u0015^\u001dX%1-\tp\u000b?&\u0012\u0006\u001bU'/J`AD1iK\u000b\u001f\\81-";
        objectArray[48] = "\u0005`2\u0013ZB\u0002:\u007f\u0013>Xlx7\u0016\u0003ZTe&\u0002E9Rm2IAK\u0000{~\u001a>";
        objectArray[49] = "8\u000em~\\\u0003\"Ekl#\u0017SNy`\u001e\u0018kShtX{iPq6_\u0012,W}p#";
        objectArray[50] = "\u0003~M=:\rSu]9A\toj[j|\u0001WwJ~:b_j[c>\u0007\u0012z\u001b}A";
        objectArray[51] = "\bV\n2c'X]\u001a6\u0018!dB\u001ce%+\\_\rqcHTB\u001clg-\u0019R\\r\u0018";
        objectArray[52] = "15\n:Rgo9\nj n_2\n;\u001dfg/\u001b/[\u0005a'\u000fd_w31C7 ";
        objectArray[53] = "n}V\u0015S7h1SG4`\u000e4D\u0011\tn6)U\u0005O\r0!ANK\u007fb7\r\u001d4";
        objectArray[54] = "E\u0000J|NL\u0000\u0007F:2J\u0012\u001bp!OH\u007f]J9\u0003Z\u0000\u001aG9\r%";
        objectArray[55] = "\u0001/4\tb\u000e\u001e~<\u0001Z\u0006`74\fg\u000eX*%\u0018!m^\"1S%\u001f\f4}\u0000Z";
        objectArray[56] = "EX']4tWY/@\nuF\\]Gn5^Df_h?K:>@1wY\u0001&F;b'";
        objectArray[57] = "6X\u0001\u0012Q&1\u0002L\u001256_@\u0004\u0017\b>g]\u0015\u0003N];_\u0018\u0013\u000e>a\t\u001bD5";
        objectArray[58] = "\u0012\b\u0002c=Y\r\bJ}SNw\u0002B\"!OG_Yi7";
        objectArray[59] = "\u000e4\u001e{8I\n2\u0017\"_D\u0015(\\,9S43C,\u001aN\f6G:_H\u000b\"\u0017*<LT.\u001aA";
        objectArray[60] = "f.$n\by6%4jsi\n:29Nu2'#-\b\u00164/7f\fdf9{5s";
        objectArray[61] = "\u0005`fG\u00033X{-Qij`i/ZT`Xt>N\u0012\u0003\f}9\r\u0012l\\v)\ti";
        Object[] objectArray2 = objectArray;
        objectArray[62] = "`\u001dxnv\u0019r\u001cpsH\u0006k\u000f\u0002'1\u001bd\u0000gj![z\u007f2n0\u0005}\u001a\u007f~p\u001b\u0002O{o.\u001cg\u0002k/0c";
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
            throw new RuntimeException("dev/zprestige/prestige/ci" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00cc' || c == 'O' || c == '\u00c0' || c == 'u') {
                field = ci_0.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00cc' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'O' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ci_0.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'W' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'V' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ci_0.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ci_0.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ci_0.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = ci_0.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ci_0.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method l(long l, long l2) {
        int n = ci_0.i(l, l2);
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
                clazz3 = ci_0.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ci_0.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ci_0.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        ci_0.C[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ci_0.j(2793142539752486L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ci_0.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ci_0.C[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ci_0.j(2793142539752486L, 0L);
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
        float f;
        float f10;
        float f11;
        long l;
        long l2;
        long l3;
        long l4;
        long l5;
        long l6;
        long l7;
        long l8;
        long l9;
        long l10;
        Matrix4f matrix4f;
        gK gK2;
        aq_0 aq_02;
        block11: {
            long l11;
            block10: {
                aq_02 = (aq_0)objectArray[0];
                gK2 = (gK)objectArray[1];
                matrix4f = (Matrix4f)objectArray[2];
                l10 = (Long)objectArray[3];
                long l12 = l10;
                l11 = l12 ^ 0x33F5EE405241L;
                l9 = l12 ^ 0x7876565874AFL;
                l8 = l12 ^ 0x56B4B80BF914L;
                l7 = l12 ^ 0x194A66AD9C40L;
                l6 = l12 ^ 0x51117395139CL;
                l5 = l12 ^ 0x5D6649FEB165L;
                l4 = l12 ^ 0x77FE815D5D37L;
                l3 = l12 ^ 0x31240AA31D80L;
                l2 = l12 ^ 0x1190C45D2788L;
                l = l12 ^ 0x5BE4B21DC642L;
                CallSite callSite = ci_0.c("V", (long)-6305927149462029604L, (long)l10);
                try {
                    ci_0 ci_02;
                    try {
                        ci_02 = this;
                        if (callSite != null) break block10;
                        if (ci_02.c != null) break block11;
                    }
                    catch (MatchException matchException) {
                        throw ci_0.c("V", (Object)matchException, (long)-6305735063553189295L, (long)l10);
                    }
                    ci_02 = this;
                }
                catch (MatchException matchException) {
                    throw ci_0.c("V", (Object)matchException, (long)-6305735063553189295L, (long)l10);
                }
            }
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l11;
            objectArray2[0] = ci_0.a("f", (int)1518, (long)(0x52C610F81A39BBFCL ^ l10));
            ci_02.c = ci_0.c("V", (Object)objectArray2, (long)-6306037252917261235L, (long)l10);
        }
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l3;
        CallSite callSite = ci_0.c("W", (Object)ci_0.c("W", (Object)ci_0.c("\u00c0", (long)-6307071476811442503L, (long)l10), (Object)objectArray3, (long)-6306958323415623713L, (long)l10), (Object)objectArray4, (long)-6306492495370464544L, (long)l10);
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l4;
        Object[] objectArray6 = new Object[2];
        objectArray6[1] = l5;
        objectArray6[0] = ci_0.a("f", (int)14731, (long)(0x535B67DD6747879AL ^ l10));
        reference var29_18 = ci_0.c("W", (Object)ci_0.c("W", (Object)ci_0.c("\u00c0", (long)-6307071476811442503L, (long)l10), (Object)objectArray5, (long)-6306958323415623713L, (long)l10), (Object)objectArray6, (long)-6306579076901974135L, (long)l10) * 1.0f;
        Object[] objectArray7 = new Object[2];
        objectArray7[1] = Float.valueOf(1.0f);
        objectArray7[0] = Float.valueOf((float)callSite);
        CallSite callSite2 = ci_0.c("V", (float)ci_0.c("V", (Object)objectArray7, (long)-6305604396064932253L, (long)l10), (float)18.0f, (long)-6306756704702611443L, (long)l10);
        float f12 = 23.0f;
        float f13 = 29.0f;
        float f14 = 29.0f + var29_18 + 5.5f;
        float f15 = this.e;
        float f16 = this.f;
        CallSite callSite3 = ci_0.c("W", (Object)this, (Object)new Object[0], (long)-6307224052187740416L, (long)l10);
        Object[] objectArray8 = new Object[10];
        objectArray8[9] = l8;
        objectArray8[8] = Float.valueOf(4.0f);
        objectArray8[7] = 5;
        objectArray8[6] = Float.valueOf((float)callSite2);
        objectArray8[5] = Float.valueOf(f14);
        objectArray8[4] = Float.valueOf(f16);
        objectArray8[3] = Float.valueOf(f15);
        objectArray8[2] = matrix4f;
        objectArray8[1] = gK2;
        objectArray8[0] = aq_02;
        ci_0.c("V", (Object)objectArray8, (long)-6306412705305341494L, (long)l10);
        Object[] objectArray9 = new Object[10];
        objectArray9[9] = l9;
        objectArray9[8] = Float.valueOf(4.0f);
        objectArray9[7] = cn_0.r;
        objectArray9[6] = Float.valueOf((float)callSite2);
        objectArray9[5] = Float.valueOf(f14);
        objectArray9[4] = Float.valueOf(f16);
        objectArray9[3] = Float.valueOf(f15);
        objectArray9[2] = matrix4f;
        objectArray9[1] = gK2;
        objectArray9[0] = aq_02;
        ci_0.c("V", (Object)objectArray9, (long)-6306342469581078207L, (long)l10);
        Object[] objectArray10 = new Object[1];
        objectArray10[0] = l7;
        CallSite callSite4 = ci_0.c("V", (Object)objectArray10, (long)-6306691475691358606L, (long)l10);
        float f17 = (float)(ci_0.c("V", (double)((double)ci_0.c("V", (long)-6307086280749060945L, (long)l10) * 0.0031415926535897933), (long)-6307183871170365898L, (long)l10) * 0.5 + 0.5);
        int n = (int)B + (int)(50.0f * f17);
        Color color = new Color((int)ci_0.c("W", (Object)callSite4, (long)-6305853096118471056L, (long)l10), (int)ci_0.c("W", (Object)callSite4, (long)-6306096611198440573L, (long)l10), (int)ci_0.c("W", (Object)callSite4, (long)-6306233547227920476L, (long)l10), n);
        try {
            f11 = callSite3 != false ? f15 + f14 - 5.5f - 12.0f : f15 + 5.5f;
        }
        catch (MatchException matchException) {
            throw ci_0.c("V", (Object)matchException, (long)-6305735063553189295L, (long)l10);
        }
        float f18 = f11;
        try {
            f10 = callSite3 != false ? f15 + f14 - 23.0f - 0.5f : f15 + 23.0f;
        }
        catch (MatchException matchException) {
            throw ci_0.c("V", (Object)matchException, (long)-6305735063553189295L, (long)l10);
        }
        float f19 = f10;
        float f20 = f16 + (callSite2 - 12.0f) / 2.0f;
        try {
            Object[] objectArray11 = new Object[10];
            objectArray11[9] = l2;
            objectArray11[8] = callSite4;
            objectArray11[7] = Float.valueOf(12.0f);
            objectArray11[6] = Float.valueOf(12.0f);
            objectArray11[5] = Float.valueOf(f20);
            objectArray11[4] = Float.valueOf(f18);
            objectArray11[3] = this.c;
            objectArray11[2] = matrix4f;
            objectArray11[1] = gK2;
            objectArray11[0] = aq_02;
            ci_0.c("V", (Object)objectArray11, (long)-6306290139288349825L, (long)l10);
            Object[] objectArray12 = new Object[7];
            objectArray12[6] = l6;
            objectArray12[5] = cn_0.v;
            objectArray12[4] = Float.valueOf(f16 + callSite2 - 3.0f);
            objectArray12[3] = Float.valueOf(f19 + 0.5f);
            objectArray12[2] = Float.valueOf(f16 + 3.0f);
            objectArray12[1] = Float.valueOf(f19);
            objectArray12[0] = matrix4f;
            ci_0.c("V", (Object)objectArray12, (long)-6306019938087810433L, (long)l10);
            f = callSite3 != false ? f15 + f14 - 29.0f - var29_18 : f15 + 29.0f;
        }
        catch (MatchException matchException) {
            throw ci_0.c("V", (Object)matchException, (long)-6305735063553189295L, (long)l10);
        }
        float f21 = f;
        float f22 = f16 + (callSite2 - callSite * 1.0f) / 2.0f;
        Object[] objectArray13 = new Object[1];
        objectArray13[0] = l4;
        Object[] objectArray14 = new Object[2];
        objectArray14[1] = l5;
        objectArray14[0] = ci_0.a("f", (int)31805, (long)(0x12826769D706C22BL ^ l10));
        reference var46_35 = ci_0.c("W", (Object)ci_0.c("W", (Object)ci_0.c("\u00c0", (long)-6307071476811442503L, (long)l10), (Object)objectArray13, (long)-6306958323415623713L, (long)l10), (Object)objectArray14, (long)-6306579076901974135L, (long)l10) * 1.0f;
        Object[] objectArray15 = new Object[1];
        objectArray15[0] = l4;
        Object[] objectArray16 = new Object[7];
        objectArray16[6] = l;
        objectArray16[5] = color;
        objectArray16[4] = Float.valueOf(1.0f);
        objectArray16[3] = Float.valueOf(f22);
        objectArray16[2] = Float.valueOf(f21);
        objectArray16[1] = ci_0.a("f", (int)8916, (long)(0x7F45FD13083C9CC3L ^ l10));
        objectArray16[0] = matrix4f;
        ci_0.c("W", (Object)ci_0.c("W", (Object)ci_0.c("\u00c0", (long)-6307071476811442503L, (long)l10), (Object)objectArray15, (long)-6306958323415623713L, (long)l10), (Object)objectArray16, (long)-6306931295479153478L, (long)l10);
        Object[] objectArray17 = new Object[1];
        objectArray17[0] = l4;
        Object[] objectArray18 = new Object[7];
        objectArray18[6] = l;
        objectArray18[5] = color;
        objectArray18[4] = Float.valueOf(1.0f);
        objectArray18[3] = Float.valueOf(f22);
        objectArray18[2] = Float.valueOf(f21 + var46_35);
        objectArray18[1] = ci_0.a("f", (int)5976, (long)(0x61B27BDF120EA94CL ^ l10));
        objectArray18[0] = matrix4f;
        ci_0.c("W", (Object)ci_0.c("W", (Object)ci_0.c("\u00c0", (long)-6307071476811442503L, (long)l10), (Object)objectArray17, (long)-6306958323415623713L, (long)l10), (Object)objectArray18, (long)-6306931295479153478L, (long)l10);
        Object[] objectArray19 = new Object[2];
        objectArray19[1] = Float.valueOf((float)callSite2);
        objectArray19[0] = Float.valueOf(f14);
        ci_0.c("W", (Object)this, (Object)objectArray19, (long)-6306656479090209614L, (long)l10);
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ci_0.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ci" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1661;
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
                throw new RuntimeException("dev/zprestige/prestige/ci", exception);
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
            ci_0.x[n2] = ci_0.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return x[n2];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    @Override
    public void m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x6910D1708A27L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = Float.valueOf(3.0f);
        objectArray2[0] = Float.valueOf(2.0f);
        ci_0.c("W", (Object)this, (Object)objectArray2, (long)-3381595915612751215L, (long)l);
    }

    private static Field k(long l, long l2) {
        int n = ci_0.i(l, l2);
        Object object = C[n];
        if (object instanceof String) {
            String string = D[n];
            int n2 = string.indexOf(8);
            Class clazz = ci_0.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ci_0.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ci_0.e(clazz3, string2, clazz2)) != null) {
                    ci_0.C[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ci_0.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ci_0.C[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ci_0.j(2793142539752486L, 0L);
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
            int n = ci_0.i(l, l2);
            object = C[n];
            try {
                if (!(object instanceof String)) break block2;
                ci_0.C[n] = clazz = Class.forName(D[n]);
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
            return MethodHandles.lookup().findStatic(ci_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ci_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


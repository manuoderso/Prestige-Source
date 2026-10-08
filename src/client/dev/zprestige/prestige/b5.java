/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1764
 *  net.minecraft.class_1799
 *  net.minecraft.class_1935
 *  org.joml.Matrix4f
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aq_0;
import dev.zprestige.prestige.b4;
import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
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
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1764;
import net.minecraft.class_1799;
import net.minecraft.class_1935;
import org.joml.Matrix4f;

public class b5
extends b4 {
    private static final int a;
    private static final float m = 0.6f;
    private static final float c = 9.6f;
    private static final float d = 4.0f;
    private static final float g = 30.0f;
    private static final float h = 3.0f;
    private static final Color i;
    private static final Color j;
    private static final Color k;
    private static final Set l;
    private static final int n = 0;
    private static final int o = 1;
    private static final int p;
    private static final int q;
    private String r;
    private boolean s;
    private int t;
    private float u;
    private int v;
    private final class_1799[] w;
    private boolean x;
    private static final long y;
    private static final String[] B;
    private static final String[] C;
    private static final Map D;
    private static final long[] H;
    private static final Integer[] I;
    private static final Map J;
    private static final Object[] K;
    private static final String[] L;

    public b5(long l) {
        long l2 = (l = y ^ l) ^ 0x5AA168F62E39L;
        super((String)((Object)b5.a("f", (int)1514, (long)(0x52DD3A59FD0A59F2L ^ l))), (String)((Object)b5.a("f", (int)28526, (long)(0x4BC70972951337DL ^ l))), l2);
        this.r = b5.a("f", (int)31873, (long)(0x4CD505887B0EA09AL ^ l));
        this.s = 1;
        this.t = 0;
        this.u = 0.0f;
        this.v = 0;
        this.w = new class_1799[2];
        this.x = 0;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        b5.y = hc.a(3473802840564943455L, -5694233559604570770L, MethodHandles.lookup().lookupClass()).a(155969202918907L);
                        var20 = b5.y ^ 43531222482888L;
                        b5.K = new Object[115];
                        b5.L = new String[115];
                        b5.b();
                        b5.D = new HashMap<K, V>(13);
                        var11_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var20 >>> 56);
                        for (var12_2 = 1; var12_2 < 8; ++var12_2) {
                            v2 = v2;
                            v2[var12_2] = (byte)(var20 << var12_2 * 8 >>> 56);
                        }
                        var11_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var18_3 = new String[12];
                        var16_4 = 0;
                        var15_5 = "\u00c7\u00d5Q\u00ff0\u00cc\u00e18k\u00fai\u00cd\u00cf\u0087\u0099\u001e\u0010V\u00c2\u00de\u00fd;\u00bc\u00bdc\u000e\u00bcG}\u00cc\u001c\u00c4r \u00f1\u00be/p_#\u00a2g\u00ca\u001d\u009be\u00e1\u009d\u0091UZ\u00f8\u00c7\u0010]/\u00e0\u009apwg\u0090#\u0013\u00fdg \u00fd\u0098\u00c1t$`\u0091\u0098\u00f0\u00c6\u0085\u00ed\u00cf\u009a\u008f\u00e4\u00fd\u00e3\u00bb\u0004\u00ada\u00b6\u00d8cFq\u00e2\u000fK0a\u0018\u00f9\u00fd\u000fF\tPL\u00a4|\u009a\u0092\u00a4\u008c\u00cb\u000b\u0095\u00a15\u00a6\u0007\f\u0093)\u000e\u0018\u0011E\u00dc\u0017N\u000e|\u00d9\u00c7\u00dd\u00d5\u00c9=*\u00a6)\u001f\u0085\u00e7\u009a=r\u008cC\u0010\u00b1\b\u00f6O\u00c2cm\\st\u00c0\u00c8@\u00a4\u0007\u00bd\u0018|\u0010(\u008f\u00c9\u00bf\u0083\u00c0\u00ed\u0015\u00c0pwSjhz\u00c9S6]\u00f4\u00bd\u0088(\u00e0(\u00ab\u00c4c6\u00d4\u00e8\u00d9\u00e3\u0082mQ\u00a4\u00f1\u00c8\u00be-\u00c1\u0083\u00f8VI\u00a6\u00bek\u0087\u00d7M\u0005\u0016cI\u009c\u00de\u00bd\u0097\u00e0<\u00c1\u0080Y4r\u001d\u00ce\u0088\u0000\u00c0\u0015o{G\u00e3p\u008c<\u0012S\u0085\u009aGkh\u0094\u0099\u0080\u0094\u0089u\u00deY\f\u0004=\u000b\u00f3\u00f7\u009c\u0082\u00a9\u00b3\u00e5\u00a7\u00d3V\u00da\u00f2\\BA[O\u0083\u0018\u0095\u0014f|t\u00fc\u00afTI\u00cdk\u00b6A&~1+\u00fe\u00d2{\u00a1(\u00ee\u00b6\u00a2\u00fd\u00c6\u00ea\u00da\u00e2\u00d4\u009ey\u00f3\u000f\u00bc\b\u00c7\u0084\u00b5\u00de\u00c9B\u00b1\u00f3$\u00806\u0087\u00afQ\u0090m]z&fc2\u0007\u00e0\u00e7\u0092\u00b2I\u00b3\b\u008f\u001c\u00f1\u0081\u00b4\u00beV";
                        var17_6 = "\u00c7\u00d5Q\u00ff0\u00cc\u00e18k\u00fai\u00cd\u00cf\u0087\u0099\u001e\u0010V\u00c2\u00de\u00fd;\u00bc\u00bdc\u000e\u00bcG}\u00cc\u001c\u00c4r \u00f1\u00be/p_#\u00a2g\u00ca\u001d\u009be\u00e1\u009d\u0091UZ\u00f8\u00c7\u0010]/\u00e0\u009apwg\u0090#\u0013\u00fdg \u00fd\u0098\u00c1t$`\u0091\u0098\u00f0\u00c6\u0085\u00ed\u00cf\u009a\u008f\u00e4\u00fd\u00e3\u00bb\u0004\u00ada\u00b6\u00d8cFq\u00e2\u000fK0a\u0018\u00f9\u00fd\u000fF\tPL\u00a4|\u009a\u0092\u00a4\u008c\u00cb\u000b\u0095\u00a15\u00a6\u0007\f\u0093)\u000e\u0018\u0011E\u00dc\u0017N\u000e|\u00d9\u00c7\u00dd\u00d5\u00c9=*\u00a6)\u001f\u0085\u00e7\u009a=r\u008cC\u0010\u00b1\b\u00f6O\u00c2cm\\st\u00c0\u00c8@\u00a4\u0007\u00bd\u0018|\u0010(\u008f\u00c9\u00bf\u0083\u00c0\u00ed\u0015\u00c0pwSjhz\u00c9S6]\u00f4\u00bd\u0088(\u00e0(\u00ab\u00c4c6\u00d4\u00e8\u00d9\u00e3\u0082mQ\u00a4\u00f1\u00c8\u00be-\u00c1\u0083\u00f8VI\u00a6\u00bek\u0087\u00d7M\u0005\u0016cI\u009c\u00de\u00bd\u0097\u00e0<\u00c1\u0080Y4r\u001d\u00ce\u0088\u0000\u00c0\u0015o{G\u00e3p\u008c<\u0012S\u0085\u009aGkh\u0094\u0099\u0080\u0094\u0089u\u00deY\f\u0004=\u000b\u00f3\u00f7\u009c\u0082\u00a9\u00b3\u00e5\u00a7\u00d3V\u00da\u00f2\\BA[O\u0083\u0018\u0095\u0014f|t\u00fc\u00afTI\u00cdk\u00b6A&~1+\u00fe\u00d2{\u00a1(\u00ee\u00b6\u00a2\u00fd\u00c6\u00ea\u00da\u00e2\u00d4\u009ey\u00f3\u000f\u00bc\b\u00c7\u0084\u00b5\u00de\u00c9B\u00b1\u00f3$\u00806\u0087\u00afQ\u0090m]z&fc2\u0007\u00e0\u00e7\u0092\u00b2I\u00b3\b\u008f\u001c\u00f1\u0081\u00b4\u00beV".length();
                        var14_7 = 16;
                        var13_8 = -1;
lbl32:
                        // 2 sources

                        while (true) {
                            v3 = ++var13_8;
                            v4 = var15_5.substring(v3, v3 + var14_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl37:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = b5.b(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            var15_5 = "\u00ce\u00be\u001a\u000fQ\u0018\u00c9\u00a0\u00ad\u00cbGYS\u00b7\u00e2\u00d2\u00dd\u009dP\u00b1*\u0090\u001d?\u0004q^\r\u00ef\u00da\u00d5\u001a\u0010\u0007\u00b3\u00eb\u00d5\u009aXn\u00e5\u001f\u00bf\u00ee\u0001 S\r\u00a8";
                            var17_6 = "\u00ce\u00be\u001a\u000fQ\u0018\u00c9\u00a0\u00ad\u00cbGYS\u00b7\u00e2\u00d2\u00dd\u009dP\u00b1*\u0090\u001d?\u0004q^\r\u00ef\u00da\u00d5\u001a\u0010\u0007\u00b3\u00eb\u00d5\u009aXn\u00e5\u001f\u00bf\u00ee\u0001 S\r\u00a8".length();
                            var14_7 = 32;
                            var13_8 = -1;
lbl46:
                            // 2 sources

                            while (true) {
                                v6 = ++var13_8;
                                v4 = var15_5.substring(v6, v6 + var14_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl51:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = b5.b(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var19_9 = var11_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                b5.B = var18_3;
                b5.C = new String[12];
                b5.J = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var20 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[21];
                var3_13 = 0;
                var4_14 = "S\u0081\u00bc\u00ea)\u0086\u007f\u00e3\u00d4\u00da\\\u00ad\u0016\u007f?\u00e7\u000f\u008dH\u00a2V$\u00e1\u00b7\u0087\u00dec\u001aS\u0004\u00ce\u00f5j\u00c7\u00c9\u00aa3\u00e0Ub\u00a4\u0096$YB\u00bb\u008bd\u00eb\bWma[y\u00e10\u00ff\u00d1\u00df\u0005\u00d9X\u00dc\u0094\u001c\u00cay\u0083\u00c3\u009cRe\u0098O\u0085\u00ca\u00fdd\u0080\u00a4-\u00ec\u00fdq\u0081\u00e0\u00d0l\u0080\u00a7\u00c4\u0082\u00cb\u0083<\u00dd5\u0004H\tz\u0093\u00eb\u00ce\u00c3*\"\u0000\u00d9\u00a28P\u00e4\u0017E[\u009b\u00c4\u0001N\u00f6\u00fa\u0017\u0016\r\u00f7\u008bu5\u0085\u00c0[\u0085)\u00bb\u0003\u0005\u00e3\u00ca\u009f\u00c7x\u00e0P\u00c6N6+\u008d\u00ca\u00a4";
                var5_15 = "S\u0081\u00bc\u00ea)\u0086\u007f\u00e3\u00d4\u00da\\\u00ad\u0016\u007f?\u00e7\u000f\u008dH\u00a2V$\u00e1\u00b7\u0087\u00dec\u001aS\u0004\u00ce\u00f5j\u00c7\u00c9\u00aa3\u00e0Ub\u00a4\u0096$YB\u00bb\u008bd\u00eb\bWma[y\u00e10\u00ff\u00d1\u00df\u0005\u00d9X\u00dc\u0094\u001c\u00cay\u0083\u00c3\u009cRe\u0098O\u0085\u00ca\u00fdd\u0080\u00a4-\u00ec\u00fdq\u0081\u00e0\u00d0l\u0080\u00a7\u00c4\u0082\u00cb\u0083<\u00dd5\u0004H\tz\u0093\u00eb\u00ce\u00c3*\"\u0000\u00d9\u00a28P\u00e4\u0017E[\u009b\u00c4\u0001N\u00f6\u00fa\u0017\u0016\r\u00f7\u008bu5\u0085\u00c0[\u0085)\u00bb\u0003\u0005\u00e3\u00ca\u009f\u00c7x\u00e0P\u00c6N6+\u008d\u00ca\u00a4".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v10 = var6_12;
                    v11 = var3_13++;
                    v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl102:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "\u00e3\u00c3G\u00f7\u00f5h\u0093\u008bs&@:)\u0082x\u00a1";
                    var5_15 = "\u00e3\u00c3G\u00f7\u00f5h\u0093\u008bs&@:)\u0082x\u00a1".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v10 = var6_12;
                        v11 = var3_13++;
                        v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v13 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl121:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    break block21;
                    break;
                }
            }
            var8_18 = v12;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v14 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v13) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl134:
                // 1 sources

                ** continue;
            }
        }
        b5.H = var6_12;
        b5.I = new Integer[21];
        b5.a = (int)b5.c("k", (int)21661, (long)(var20 ^ 4366751670554847125L));
        b5.q = (int)b5.c("k", (int)14624, (long)(var20 ^ 8470466630362335782L));
        b5.p = (int)b5.c("k", (int)4685, (long)(var20 ^ 7028864047688982857L));
        b5.i = new Color((int)b5.c("k", (int)17252, (long)(8079245284389089383L ^ var20)), (int)b5.c("k", (int)32483, (long)(2993650118004657657L ^ var20)), (int)b5.c("k", (int)2985, (long)(4336041889313077420L ^ var20)));
        b5.j = new Color((int)b5.c("k", (int)29973, (long)(2840022713875416594L ^ var20)), (int)b5.c("k", (int)3832, (long)(425582137579388385L ^ var20)), (int)b5.c("k", (int)16772, (long)(8146130380157645471L ^ var20)));
        b5.k = new Color((int)b5.c("k", (int)14967, (long)(4729928307097307518L ^ var20)), (int)b5.c("k", (int)14967, (long)(4729928307097307518L ^ var20)), (int)b5.c("k", (int)14967, (long)(4729928307097307518L ^ var20)), (int)b5.c("k", (int)6338, (long)(438966310388378562L ^ var20)));
        b5.l = b5.d("L", (Object)b5.d("\u00cc", (long)-7857962803476394178L, (long)var20), (Object)b5.d("\u00cc", (long)-7855907595954784463L, (long)var20), (Object)b5.d("\u00cc", (long)-7855150071514070033L, (long)var20), (Object)b5.d("\u00cc", (long)-7854845145403516069L, (long)var20), (long)-7855470273456023134L, (long)var20);
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
        if (L[n3] != null) {
            return n3;
        }
        Object object = K[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 39;
            case 1 -> 59;
            case 2 -> 4;
            case 3 -> 31;
            case 4 -> 29;
            case 5 -> 62;
            case 6 -> 58;
            case 7 -> 44;
            case 8 -> 12;
            case 9 -> 43;
            case 10 -> 26;
            case 11 -> 17;
            case 12 -> 0;
            case 13 -> 46;
            case 14 -> 23;
            case 15 -> 35;
            case 16 -> 45;
            case 17 -> 13;
            case 18 -> 16;
            case 19 -> 18;
            case 20 -> 1;
            case 21 -> 30;
            case 22 -> 38;
            case 23 -> 47;
            case 24 -> 36;
            case 25 -> 57;
            case 26 -> 7;
            case 27 -> 22;
            case 28 -> 63;
            case 29 -> 11;
            case 30 -> 41;
            case 31 -> 9;
            case 32 -> 8;
            case 33 -> 40;
            case 34 -> 27;
            case 35 -> 50;
            case 36 -> 48;
            case 37 -> 3;
            case 38 -> 60;
            case 39 -> 53;
            case 40 -> 49;
            case 41 -> 25;
            case 42 -> 14;
            case 43 -> 24;
            case 44 -> 20;
            case 45 -> 10;
            case 46 -> 33;
            case 47 -> 42;
            case 48 -> 2;
            case 49 -> 21;
            case 50 -> 51;
            case 51 -> 5;
            case 52 -> 54;
            case 53 -> 15;
            case 54 -> 56;
            case 55 -> 37;
            case 56 -> 32;
            case 57 -> 28;
            case 58 -> 52;
            case 59 -> 6;
            case 60 -> 61;
            case 61 -> 55;
            case 62 -> 19;
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
        b5.L[n3] = new String(cArray);
        return n3;
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

    private static void b() {
        Object[] objectArray = K;
        K[0] = "rT\u001a6O\rdT\u001fl\\\u001as\u001f\u001cjP\u000ebX\u000b}\u001b\u001c^";
        objectArray[1] = "\u0011s\u007f,\u000eBdSt#\u001f\r\u0019Kg$\u0016Dq";
        objectArray[2] = "2<\u0007lG[$<\u00026TL3w\u00010XX\"0\u0016'\u0013J\u0013";
        objectArray[3] = "\u000bGOij\u0010~gDf{_\u001fiOm\u007f\u0005k";
        objectArray[4] = "`p4/o\u0002}el\r.\u000fec";
        objectArray[5] = "x\b9yOWn\b<#\\@yC?%PTh\u0004(2\u001bCw";
        objectArray[6] = "\u00058/8ZUp\u0018$7K\u001a\u0011\u0016/<O@e";
        objectArray[7] = Void.TYPE;
        b5.L[7] = "java/lang/Void";
        objectArray[8] = "tMVSi6bMS\tz!u\u0006P\u000fv5dAG\u0018=$%";
        objectArray[9] = "G5\u00055T:L:\u0014z77Y7\u001b\u0011\u00025H$\u0007=\u00158";
        objectArray[10] = "|*O*\u0014Pw%^ew]b#";
        objectArray[11] = Float.TYPE;
        b5.L[11] = "java/lang/Float";
        objectArray[12] = "\u000bG\nse\u001b\u000bG\u001d/i\u0014\u0011\f\u001d1i\u0001\u0016}Ml8";
        objectArray[13] = "rtL\u000bsbrt[W\u007fmh?[I\u007fxoN\u000f\u0011(";
        objectArray[14] = "\u0001r\u0013}kz\u0001r\u0004!gu\u001b9\u0004?g`\u001cHVd?*";
        objectArray[15] = "\u007f#L\u001b@+\u007f#[GL$eh[YL1b\u0019\u000e\u0006\u0015";
        objectArray[16] = Integer.TYPE;
        b5.L[16] = "java/lang/Integer";
        objectArray[17] = "d\u0000}`?Fd\u0000j<3I~Kj\"3\\y:8vb\u001d";
        objectArray[18] = "Z\u0018}K\\lZ\u0018j\u0017Pc@Sj\tPvG\"8R\b7";
        objectArray[19] = "C0\u001b\u0012IXC0\fNEWY{\fPEB^\n^\u000b\u0012\u0005";
        objectArray[20] = Boolean.TYPE;
        b5.L[20] = "java/lang/Boolean";
        objectArray[21] = "\u0012@7vhq\u0012@ *d~\b\u000b 4dk\u000fzrk5!";
        objectArray[22] = "2\fQM=s2\fF\u00111|(GF\u000f1i/6\u0014Uf+";
        objectArray[23] = "*}&&V\b4u<i+\u00184";
        objectArray[24] = "\u0015 ,xM.\u001e/=7, \u0015$9m";
        objectArray[25] = "\r\u0010\u0012}xS\u001b\u0010\u0017'kD\f[\u0014!gP\u001d\u001c\u00036,G+";
        objectArray[26] = "\bw\fW\u007f<}W\u0007Xns\u001cY\fSj)h";
        objectArray[27] = "#hj-\u000eW5how\u001d@\"#lq\u0011T3d{fZEs";
        objectArray[28] = "\u0012A\"\u001c\nJga)\u0013\u001b\u0005\u0006o\"\u0018\u001f_r";
        objectArray[29] = "#VH\u007fh\u000e5VM%{\u0019\"\u001dN#w\r3ZY4<\u001a\u0006";
        objectArray[30] = "<Mc_\u0007\nImhP\u0016E(cc[\u0012\u001f\\";
        objectArray[31] = "]\u0019)\nxzK\u0019,Pkm\\R/VgyM\u00158A,iW";
        objectArray[32] = "ykkI\u0013Z\fK`F\u0002\u0015mEkM\u0006O\u0019";
        objectArray[33] = "E75c8\u007f0\u0017>l)0Q\u00195g-j%";
        objectArray[34] = "n${X\u0007\u0002e+j\u0017z\u001av,c^";
        objectArray[35] = Character.TYPE;
        b5.L[35] = "java/lang/Character";
        objectArray[36] = Double.TYPE;
        b5.L[36] = "java/lang/Double";
        objectArray[37] = "!c\u0003$)a7c\u0006~:v (\u0005x6b1o\u0012o}r)o\u0010d'?\u0015t\u0010y'x\"c";
        objectArray[38] = "%f60\nI3f3j\u0019^$-0l\u0015J5j'{^Z\u0002";
        objectArray[39] = "=/\u0019,S\u0014+/\u001cv@\u0003<d\u001fpL\u0017-#\bg\u0007\u0007\u0018";
        objectArray[40] = " Q)Sx:Uq\"\\iu4\u007f)Wm/@";
        objectArray[41] = "\tM:t8L|m1{)\u0003\u001dc:p-Yi";
        objectArray[42] = "3\u0001UAW{F!^NF4'/UEBnS";
        objectArray[43] = "P$\u007f\u0018\u007fy%\u0004t\u0017n6D\n\u007f\u001cjl0";
        objectArray[44] = "m\u007f1dy\u0018\u0018_:khWyQ1`l\r\r";
        objectArray[45] = "X\u0004*1BR-$!>S\u001dL**5WG8";
        objectArray[46] = "/Aa,,%Zaj#=j;oa(90O";
        objectArray[47] = "K%~},J>\u0005ur=\u0005_\u000b~y9_+";
        objectArray[48] = "YGW\u0001\r\u0019OGR[\u001e\u000eX\fQ]\u0012\u001aIKFJY\rY";
        objectArray[49] = "PY\u007f\n_\u0012%yt\u0005N]Dw\u007f\u000eJ\u00070";
        objectArray[50] = "k\"\\;X\u001f\u001e\u0002W4IP\u007f\f\\?M\n\u000b";
        objectArray[51] = "p<Z\tCW{3KF>Bi)I\u0005";
        objectArray[52] = Long.TYPE;
        b5.L[52] = "java/lang/Long";
        objectArray[53] = "<I\u000bb\u00070Ii\u0000m\u0016\u007f(g\u000bf\u0012%\\";
        objectArray[54] = "I,@\\;!I,W\u00007.SgW\u001e7;T\u0016\rAe|";
        objectArray[55] = "\u001eiy\u0007[m\u001ein[Wb\u0004\"nEWw\u0003S4\u001a\u00055";
        objectArray[56] = "~m?f\u00016~m(:\r9d&($\r,cWyqZo";
        objectArray[57] = "1\u007f;\u001e\u0015Pw}>\u0018,^gj\u0010\u0018A\\l\u00165\u0001\u0016Lm*/\u0012Q\u000f\n";
        objectArray[58] = "@%R89f\u000e&QkTi\u0011&On\u0003>Oq\u0017\u0002e9\r4\u0015cjy\u0015w";
        objectArray[59] = "(exXMv/#|B\u0012F\u007f=n]O\u0011,`:\b\u0012F(f{CA:+5h_Y";
        objectArray[60] = "$]:\t\u0007Y{\u00015\u000b~RFZ`]\u0019K9\u00185\rB\fF_(\u0001O_)\u001a5\u0000\u00173";
        objectArray[61] = "U\b%)\u0003'\u0007R%(=6_\u000e\"=jh\u0006]wQQe_\u0004,5\u00073Y\r";
        objectArray[62] = "\b\u0010x\u0004;P\u0006C\u007fQGN\u0006D<\u0004\u0000^oG#\u0018~\u000e\u0010\u001a'\u0000#0\b\u0010x\u0004;P\u0006C\u007fQG";
        objectArray[63] = "fZ6\u000fB4&\u0019c\u0006W]:\f \u0016Z1\b_dH\u0000`_\u0006lOP!?\b?H\u0005]8Qe\u001bA=6\u0002bN=dd\u000b%\tT$'^,\u001c=";
        objectArray[64] = "1\\\u0005&\u0001^>\u001c\u001de?Zm\u001e\u0018>Sh>ZDi?UcX\u0005>\u0003Op\u001fFY";
        objectArray[65] = "_xWQ:qP8O\u0012\u0004u\u0003:JIhGP\u007f\u0013\u0013\u0004}V&V\u0010=p\u000e=\u001b.";
        objectArray[66] = "1\u001aQ\u0010cF(X\u000f\u0013\u001d\u0014I\u0018Z\t\"\u001e \u0003NI$";
        objectArray[67] = "\u001e]T\u0014gB\n\u0007\u0015T\u0002Pd\u0006\u0016\u001ceV\u001bDCL>\u0011d\u0003^@3B\u000bFCAk.";
        objectArray[68] = "\u0002]K\u0018Pw\u0004WT\u001eo,b\u0001\tS\b>\u001dC\\\u0003Syb\u0003Y\u0007\u0013\u007f\u0003E[\u0002\u0015F";
        objectArray[69] = "zxN\u001e\f\t|rQ\u00183Q\u001a$\fUT@efY\u0005\u000f\u0007\u001a-\u0005\u0003Y]psI\u001dO8";
        objectArray[70] = "\u0002Cc\u00181 ]\u001fl\u001aH#`D9L/2\u001f\u0006l\u001ctu`Aq\u0010y&\u000f\u0004l\u0011!J";
        objectArray[71] = "*ENKU\u0006{\u0016\u000e\u0012%].S\u001eMIo~\u0010E\u0015\u00148z\u0015\u0006PGDyF\u0015L_8,P\u0006EK_2P\u0000U%W<W\u0011DBI<Q\u0001*";
        objectArray[72] = "mg\b\u001b,~?=\b\u001a\u0012oga\u000f\u000fE1?4Qc~<gk\u0001\u0007(jab";
        objectArray[73] = "('3d:mz}3e\u0004|\"!4pS\"sp`\u001ch/\"+:x>y$\"";
        objectArray[74] = "hjwbs\b?!twC\u0006S(,*$\u0015,jyz\u007fRS-dvr\u0001<hyw*m";
        objectArray[75] = "9Ro_i\u000f8PhU\u0019S:Sf\u0002uaj\u0013=U\u0019\\4\u0015{\u0002%F'R8ep\\gNv[!\u000f'\u0017\u0006";
        objectArray[76] = "hdZ\fv#.>M\u0010K#VgI\u00193r.'XO1Jh7N\bs2(&\u0018\nK";
        objectArray[77] = ",\u0017CI|C|E\u001d\u0011B@r\u001d#\b|\u000bm\u001e\u0019\n;\u0000r{[NrEvAY\tyZ\u0013";
        objectArray[78] = "MAu\u001a\u000bO\u001cC \u0019fML|v\u0018\u001eEL\u001bh\u0018\u0018U\"\u0013f\u001f\tDE\rf\u0019\u0019*M\u0003a\b\bMS\u0003g\u0018fE]\u0004v\t\u0001[]\u0002fg\t\u0017N\u0001t\u0002X\u0015\u001b\u0002\u0019";
        objectArray[79] = "\r]iGs0R\u0001fE\n1oZ3\u0013m\"\u0010\u0018fC6eo\u000e2CvdV\u0003jX;Z";
        objectArray[80] = "aD^\b>\u0007v\u0007Q\u0006\u0000WnFN\tf@O]Q\tE]wXU\u001f\u0000\u0005+\u0003I]~E+NX\u0006\u0000";
        objectArray[81] = "I\ffv*tG_a#V\u007fNU%R*\u0014D_ef1(^L\"%VsLMf%).HU;\u001b";
        objectArray[82] = "Y\u0003K-G!\u000bYK,y0S\u0005L9.n\bQ\u0011U\u0015cS\u000fB1C5U\u0006";
        objectArray[83] = "\u0014\u0013BxD\u0011\u0019\u0011\u0015\u001d\u001fuJ\u0017Oe\u0011N\u0002L\u0017$u";
        objectArray[84] = ";C\r\u0003b\u001a2\u0018\u0007\u000e\u0003\u000fX\u001eRQd\u0013'\\\u0007\u0001?TX\u001b\u001a\r2\u00077^\u0007\fjk";
        objectArray[85] = "+X{a3\\$\u0018c\"\rXw\u001afyaj$^=&\rTpVgn3\u0005#\u0016>\u001e";
        objectArray[86] = "tJ \u0012_~&\u0010 \u0013ao~L'\u000661!\u001c~j\r<~F)\u000e[jxO";
        objectArray[87] = "\u001eJ\fz<QXH\t|\u0005_H_2ki0O@R{b\fUS\u00158\u0005";
        objectArray[88] = "\u00069#_LMH: \f!BW:>\tv\u0015\bgeeHWO.\"\u0007]\\\\m";
        objectArray[89] = "\u0012i\"\u00123uB;|J\rhDuBAn7Pb~[}p\u0013\u0005(H7pJ92[p3-o!\u0011pj\u0011u2V3\r";
        objectArray[90] = "wIE\u0002oAaLCP\u000fG\u0013\r\u0000\rhVlOU]3\u0011\u0013\u0004\t[eKyZEEs.";
        objectArray[91] = "\u001dhs4;t[txtEa$0,y\"u[ry)y2$2|-94Et~(?\r";
        objectArray[92] = "o\u001e\u0013 &a>MSyV:k\bC&:\b9E\u001bpV3;\u0015D+2em\u0013MA";
        objectArray[93] = "nwq3\u0001\b=~1k\u007f\u001foa!m\u0013-=\"q3\u007f\u0013h- zAB;my\n\u0012Bba\u007f3\u001f\u001ay,A";
        objectArray[94] = "\u001d[\u0016\u000b-ENRVSSR\u001cMFU?`N\u000e\u0019\u000fS^\u001b\u0001GBm\u000fHA\u001e2=\u000bO\u0001\u0018Nn\bJ\u000e&X0\r\fV\u001aB#JO1";
        objectArray[95] = "R\u0019c'p!\u0002K=\u007fN<\f\u0013\u0003fpi\u0013\u00109d7b\fu{ ~'\bOygu8m\r=.0<W\u000fz%/Y";
        objectArray[96] = "\u0019mEs2)\u0016-]0\f-E/Xk`\u001f\u0013j\u00050<HF.Q6|qG,V<\f";
        objectArray[97] = "\u0005'366k\u001e3s0Wk|sr90z\u00031'ik=|0)rog\u0010$s3/\u0002";
        objectArray[98] = "p2\u001cS:\u001f `B\u000b\u0004\u0002.8|Z4\u0001%;\u0016\u0004x\u001f3^LZb\r*4\u0012\u0016|\u001bOnL\fn\u0002%0\u0000\u0012xg";
        objectArray[99] = "\u001cq\u001d\u0001f\u007fZ+\n\u001d[l\"uYM<n]7\f\u001dg)\"p\u0011\u0011jzM5\f\u00102\u0016";
        objectArray[100] = "s_'\u0005qs}\f P\rwy\tq\u0014m\u0013~\f$\u0015j/d\u001fcV\r";
        objectArray[101] = "\u0006ph\u0002gl\b#oW\u001br\b$,\u0002\\ba*2Ufk]0!\u0012%\f\u0006ph\u0002gl\b#oW\u001b";
        objectArray[102] = "E\u0000\u001cb=U\u0017Z\u001cc\u0003DO\u0006\u001bvT\u001a\u0015ZN\u001ao\u0017O\f\u0015~9AI\u0005";
        objectArray[103] = ";T\u0014.ww/\u000eUn\u0012pA\u000fV&uc>M\u0003v.$A\u0006_px~+X\u0013nn\u001b";
        objectArray[104] = "/j!;\u001a\u0017)`>=%OO6cpB^0t6 \u0019\u0019Obb Y\u0018vo:;\u0014&";
        objectArray[105] = "NHHM\u001c\n\b\u0012_Q!\u0018pL\f\u0001F\u001b\u000f\u000eYQ\u001d\\pID]\u0010\u000f\u001f\fY\\Hc";
        objectArray[106] = "z=Fx\u0015I(gFy+Xp;Al|\u0006(l\u0014\u0000G\u000bp1Od\u0011]v8";
        objectArray[107] = "22RY&i&h\u0013\u0019ClHi\u0010Q$}7+E\u0001\u007f:H`\u0019\u0007)`\">U\u0019?\u0005";
        objectArray[108] = "\u0015O\\\u0003S\u0014\u001a\u000fD@m\u0010I\rA\u001b\u0001\"\u001aI\u001eMm\u001cNA@\fSM\u001d\u0001\u0019|";
        objectArray[109] = "l7{GXPar\u007f]eR\u001ct/\u001c\u0002Gc6zLY\u0000\u001cqg@TSs4zA\f?";
        objectArray[110] = "\\e8*zq\u001ag=,C\u007f\np\u00162>}gf?l>w[|,+}\u0010";
        objectArray[111] = "-6!x(\f|4t{E\u0002%m1l$\u000f9\u000b\"z=\u0006,l<z;\u0016Bfue9W{k-~ti";
        objectArray[112] = "s\u0004f)3\u000e\"W&pCUw\u00126//g%_jwCZyT+/\u007f@j\u0013hH";
        objectArray[113] = "lL8F|Kx\u0016y\u0006\u0019X\u0016\u0017zN~_iU/\u001e%\u0018\u0016\u00122\u0012(KyW/\u0013p'";
        Object[] objectArray2 = objectArray;
        objectArray[114] = ">Fr\u0018{\tn\u0014,@E\u0014hZ\u0012\u0011u\u0017kOxO9\t}*\"\u0011#\u001bd@|]=\r\u0001\u001a\"G/\u0014kDnY9q";
    }

    private void s(Object[] objectArray) {
        block5: {
            float f;
            float f10;
            long l;
            long l2;
            float f11;
            float f12;
            Matrix4f matrix4f;
            gK gK2;
            aq_0 aq_02;
            block4: {
                aq_02 = (aq_0)objectArray[0];
                gK2 = (gK)objectArray[1];
                matrix4f = (Matrix4f)objectArray[2];
                f12 = ((Float)objectArray[3]).floatValue();
                f11 = ((Float)objectArray[4]).floatValue();
                float f13 = ((Float)objectArray[5]).floatValue();
                l2 = (Long)objectArray[6];
                long l3 = l2 = y ^ l2;
                l = l3 ^ 0x333422C24772L;
                long l4 = l3 ^ 0x52081237AF9DL;
                f10 = 1.5f;
                Object[] objectArray2 = new Object[10];
                objectArray2[9] = l;
                objectArray2[8] = Float.valueOf(f10);
                objectArray2[7] = k;
                objectArray2[6] = Float.valueOf(3.0f);
                objectArray2[5] = Float.valueOf(30.0f);
                objectArray2[4] = Float.valueOf(f11);
                objectArray2[3] = Float.valueOf(f12);
                objectArray2[2] = matrix4f;
                objectArray2[1] = gK2;
                objectArray2[0] = aq_02;
                b5.d("L", (Object)objectArray2, (long)-7225583357888288170L, (long)l2);
                CallSite callSite = b5.d("L", (float)1.0f, (float)b5.d("L", (float)0.0f, (float)f13, (long)-7226104561920450294L, (long)l2), (long)-7227243901628982183L, (long)l2);
                f = 30.0f * callSite;
                CallSite callSite2 = b5.d("L", (long)-7223821225957473510L, (long)l2);
                try {
                    try {
                        if (callSite2 != null) break block4;
                        if (!(f > 3.0f)) break block5;
                    }
                    catch (MatchException matchException) {
                        throw b5.d("L", (Object)matchException, (long)-7226023762276882226L, (long)l2);
                    }
                    Object[] objectArray3 = new Object[1];
                    objectArray3[0] = l4;
                    Object[] objectArray4 = new Object[10];
                    objectArray4[9] = l;
                    objectArray4[8] = Float.valueOf(f10);
                    objectArray4[7] = b5.d("L", (Object)objectArray3, (long)-7224362616261003841L, (long)l2);
                    objectArray4[6] = Float.valueOf(3.0f);
                    objectArray4[5] = Float.valueOf(f);
                    objectArray4[4] = Float.valueOf(f11);
                    objectArray4[3] = Float.valueOf(f12);
                    objectArray4[2] = matrix4f;
                    objectArray4[1] = gK2;
                    objectArray4[0] = aq_02;
                    b5.d("L", (Object)objectArray4, (long)-7225583357888288170L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw b5.d("L", (Object)matchException, (long)-7226023762276882226L, (long)l2);
                }
            }
            Color color = new Color((int)b5.c("k", (int)21486, (long)(0x61F6D2E97F5069A2L ^ l2)), (int)b5.c("k", (int)14967, (long)(0x41A46CE6F90D803DL ^ l2)), (int)b5.c("k", (int)14967, (long)(0x41A46CE6F90D803DL ^ l2)), (int)b5.c("k", (int)18110, (long)(0x4BCDC682CC0B7CF1L ^ l2)));
            Object[] objectArray5 = new Object[10];
            objectArray5[9] = l;
            objectArray5[8] = Float.valueOf(f10);
            objectArray5[7] = color;
            objectArray5[6] = Float.valueOf(3.0f);
            objectArray5[5] = Float.valueOf(1.5f);
            objectArray5[4] = Float.valueOf(f11);
            objectArray5[3] = Float.valueOf(f12 + f - 1.5f);
            objectArray5[2] = matrix4f;
            objectArray5[1] = gK2;
            objectArray5[0] = aq_02;
            b5.d("L", (Object)objectArray5, (long)-7225583357888288170L, (long)l2);
        }
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/b5" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = b5.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x21E3;
        if (I[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = H[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])J.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    J.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/b5", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            b5.I[n2] = n3;
        }
        return I[n2];
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00a5' || c == '\u00f8' || c == '\u00cc' || c == '\u00fb') {
                field = b5.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00a5' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f8' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00cc' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = b5.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'y' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'L' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = b5.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = b5.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = b5.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = b5.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = b5.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method l(long l, long l2) {
        int n = b5.i(l, l2);
        Object object = K[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = L[n];
                int n3 = string2.indexOf(8);
                clazz3 = b5.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = b5.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = b5.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        b5.K[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = b5.j(1717229705285372L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = b5.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        b5.K[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = b5.j(1717229705285372L, 0L);
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

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void l(Object[] var1_1) {
        block111: {
            block110: {
                block105: {
                    block104: {
                        block103: {
                            block102: {
                                block101: {
                                    block108: {
                                        block109: {
                                            block100: {
                                                block99: {
                                                    block98: {
                                                        block96: {
                                                            block97: {
                                                                block107: {
                                                                    block106: {
                                                                        block93: {
                                                                            block92: {
                                                                                block91: {
                                                                                    block89: {
                                                                                        block90: {
                                                                                            block87: {
                                                                                                block88: {
                                                                                                    block85: {
                                                                                                        block86: {
                                                                                                            block82: {
                                                                                                                block84: {
                                                                                                                    block83: {
                                                                                                                        block81: {
                                                                                                                            block80: {
                                                                                                                                block79: {
                                                                                                                                    var6_2 = (aq_0)var1_1[0];
                                                                                                                                    var4_3 = (gK)var1_1[1];
                                                                                                                                    var5_4 = (Matrix4f)var1_1[2];
                                                                                                                                    var2_5 = (Long)var1_1[3];
                                                                                                                                    v0 = var2_5;
                                                                                                                                    var7_6 = v0 ^ 95334181894420L;
                                                                                                                                    var9_7 = v0 ^ 27807340928064L;
                                                                                                                                    var11_8 = v0 ^ 45947767099148L;
                                                                                                                                    var13_9 = v0 ^ 54030867045760L;
                                                                                                                                    var15_10 = v0 ^ 45272506949373L;
                                                                                                                                    var17_11 = v0 ^ 132449650111663L;
                                                                                                                                    var19_12 = v0 ^ 89135395443612L;
                                                                                                                                    var21_13 = v0 ^ 102693909475685L;
                                                                                                                                    var23_14 = v0 ^ 131934975778103L;
                                                                                                                                    var25_15 = v0 ^ 81986305771303L;
                                                                                                                                    var27_16 = v0 ^ 64450247846539L;
                                                                                                                                    var29_17 = v0 ^ 96557814079126L;
                                                                                                                                    var31_18 = v0 ^ 101037798966850L;
                                                                                                                                    v1 = b5.d("L", (long)-6313308234627485497L, (long)var2_5);
                                                                                                                                    v2 = new Object[1];
                                                                                                                                    v2[0] = var25_15;
                                                                                                                                    b5.d("y", (Object)this, (Object)v2, (long)-6309926616935327397L, (long)var2_5);
                                                                                                                                    var34_19 = b5.a("f", (int)28448, (long)(5211107865856605792L ^ var2_5));
                                                                                                                                    v3 = new Object[1];
                                                                                                                                    v3[0] = var23_14;
                                                                                                                                    v4 = new Object[1];
                                                                                                                                    v4[0] = var13_9;
                                                                                                                                    var35_20 = b5.d("y", (Object)b5.d("y", (Object)b5.d("\u00cc", (long)-6312145903943129097L, (long)var2_5), (Object)v3, (long)-6310104800714580637L, (long)var2_5), (Object)v4, (long)-6309625827252197789L, (long)var2_5);
                                                                                                                                    v5 = new Object[2];
                                                                                                                                    v5[1] = Float.valueOf(1.0f);
                                                                                                                                    v5[0] = Float.valueOf((float)var35_20);
                                                                                                                                    var36_21 = b5.d("L", (Object)v5, (long)-6313819058357846991L, (long)var2_5);
                                                                                                                                    v6 = new Object[2];
                                                                                                                                    v6[1] = Float.valueOf(0.9f);
                                                                                                                                    v6[0] = Float.valueOf((float)var35_20);
                                                                                                                                    var37_22 = b5.d("L", (Object)v6, (long)-6313819058357846991L, (long)var2_5);
                                                                                                                                    var33_23 = v1;
                                                                                                                                    v7 = new Object[1];
                                                                                                                                    v7[0] = var23_14;
                                                                                                                                    v8 = new Object[2];
                                                                                                                                    v8[1] = var21_13;
                                                                                                                                    v8[0] = var34_19;
                                                                                                                                    var38_24 = b5.d("y", (Object)b5.d("y", (Object)b5.d("\u00cc", (long)-6312145903943129097L, (long)var2_5), (Object)v7, (long)-6310104800714580637L, (long)var2_5), (Object)v8, (long)-6310475121434355628L, (long)var2_5);
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            v9 = b5.b;
                                                                                                                                            if (var33_23 != null) break block79;
                                                                                                                                            if (b5.d("\u00a5", (Object)v9, (long)-6307036576467243447L, (long)var2_5) != null) {
                                                                                                                                            }
                                                                                                                                            ** GOTO lbl67
                                                                                                                                        }
                                                                                                                                        catch (MatchException v10) {
                                                                                                                                            throw b5.d("L", (Object)v10, (long)-6312556915915334893L, (long)var2_5);
                                                                                                                                        }
                                                                                                                                        v9 = b5.b;
                                                                                                                                    }
                                                                                                                                    catch (MatchException v11) {
                                                                                                                                        throw b5.d("L", (Object)v11, (long)-6312556915915334893L, (long)var2_5);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    if (b5.d("\u00a5", (Object)v9, (long)-6313930464886340954L, (long)var2_5) != null) break block80;
lbl67:
                                                                                                                                    // 2 sources

                                                                                                                                    v12 = 1;
                                                                                                                                    break block81;
                                                                                                                                }
                                                                                                                                catch (MatchException v13) {
                                                                                                                                    throw b5.d("L", (Object)v13, (long)-6312556915915334893L, (long)var2_5);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            v12 = 0;
                                                                                                                        }
                                                                                                                        var39_25 = v12;
                                                                                                                        try {
                                                                                                                            v14 = var39_25 != 0 ? b5.a("f", (int)15949, (long)(1570409510863089420L ^ var2_5)) : this.r;
                                                                                                                        }
                                                                                                                        catch (MatchException v15) {
                                                                                                                            throw b5.d("L", (Object)v15, (long)-6312556915915334893L, (long)var2_5);
                                                                                                                        }
                                                                                                                        var40_26 = v14;
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    v16 = var39_25;
                                                                                                                                    if (var33_23 != null) break block82;
                                                                                                                                    if (v16 != 0) break block83;
                                                                                                                                }
                                                                                                                                catch (MatchException v17) {
                                                                                                                                    throw b5.d("L", (Object)v17, (long)-6312556915915334893L, (long)var2_5);
                                                                                                                                }
                                                                                                                                v16 = this.s;
                                                                                                                                if (var33_23 != null) break block82;
                                                                                                                            }
                                                                                                                            catch (MatchException v18) {
                                                                                                                                throw b5.d("L", (Object)v18, (long)-6312556915915334893L, (long)var2_5);
                                                                                                                            }
                                                                                                                            if (v16 == 0) break block84;
                                                                                                                        }
                                                                                                                        catch (MatchException v19) {
                                                                                                                            throw b5.d("L", (Object)v19, (long)-6312556915915334893L, (long)var2_5);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    v16 = 1;
                                                                                                                    break block82;
                                                                                                                }
                                                                                                                v16 = 0;
                                                                                                            }
                                                                                                            var41_27 = v16;
                                                                                                            try {
                                                                                                                v20 = var39_25;
                                                                                                                if (var33_23 != null) break block85;
                                                                                                                if (v20 == 0) break block86;
                                                                                                            }
                                                                                                            catch (MatchException v21) {
                                                                                                                throw b5.d("L", (Object)v21, (long)-6312556915915334893L, (long)var2_5);
                                                                                                            }
                                                                                                            v20 = 2;
                                                                                                            break block85;
                                                                                                        }
                                                                                                        v20 = this.t;
                                                                                                    }
                                                                                                    var42_28 = v20;
                                                                                                    try {
                                                                                                        v22 = var39_25 != 0 ? 0.65f : this.u;
                                                                                                    }
                                                                                                    catch (MatchException v23) {
                                                                                                        throw b5.d("L", (Object)v23, (long)-6312556915915334893L, (long)var2_5);
                                                                                                    }
                                                                                                    var43_29 = v22;
                                                                                                    try {
                                                                                                        v24 /* !! */  = var39_25;
                                                                                                        if (var33_23 != null) break block87;
                                                                                                        if (v24 /* !! */  == 0) break block88;
                                                                                                    }
                                                                                                    catch (MatchException v25) {
                                                                                                        throw b5.d("L", (Object)v25, (long)-6312556915915334893L, (long)var2_5);
                                                                                                    }
                                                                                                    v24 /* !! */  = (int)b5.c("k", (int)15739, (long)(1427025558830462187L ^ var2_5));
                                                                                                    break block87;
                                                                                                }
                                                                                                v24 /* !! */  = this.v;
                                                                                            }
                                                                                            var44_30 = v24 /* !! */ ;
                                                                                            try {
                                                                                                try {
                                                                                                    v26 = var42_28;
                                                                                                    v27 = 3;
                                                                                                    if (var33_23 != null) break block89;
                                                                                                    if (v26 != v27) break block90;
                                                                                                }
                                                                                                catch (MatchException v28) {
                                                                                                    throw b5.d("L", (Object)v28, (long)-6312556915915334893L, (long)var2_5);
                                                                                                }
                                                                                                v29 = b5.a("f", (int)15949, (long)(1570409510863089420L ^ var2_5));
                                                                                                break block91;
                                                                                            }
                                                                                            catch (MatchException v30) {
                                                                                                throw b5.d("L", (Object)v30, (long)-6312556915915334893L, (long)var2_5);
                                                                                            }
                                                                                        }
                                                                                        v26 = var42_28;
                                                                                        v27 = 1;
                                                                                    }
                                                                                    try {
                                                                                        v29 = v26 == v27 ? b5.a("f", (int)2591, (long)(6013638475815295826L ^ var2_5)) : b5.a("f", (int)30519, (long)(3560612533571905147L ^ var2_5));
                                                                                    }
                                                                                    catch (MatchException v31) {
                                                                                        throw b5.d("L", (Object)v31, (long)-6312556915915334893L, (long)var2_5);
                                                                                    }
                                                                                }
                                                                                var45_31 = v29;
                                                                                var46_32 = b5.d("L", (int)var44_30, (long)-6309823159798061191L, (long)var2_5);
                                                                                var47_33 /* !! */  = 5.5f + var38_24 + 5.5f;
                                                                                v32 = new Object[1];
                                                                                v32[0] = var23_14;
                                                                                v33 = new Object[2];
                                                                                v33[1] = var21_13;
                                                                                v33[0] = var40_26;
                                                                                var48_34 = 12.5f + b5.d("y", (Object)b5.d("y", (Object)b5.d("\u00cc", (long)-6312145903943129097L, (long)var2_5), (Object)v32, (long)-6310104800714580637L, (long)var2_5), (Object)v33, (long)-6310475121434355628L, (long)var2_5) * 0.9f + 5.5f;
                                                                                try {
                                                                                    v34 = 18.1f;
                                                                                    if (var42_28 != 2) break block92;
                                                                                    v35 /* !! */  = 30.0f;
                                                                                    break block93;
                                                                                }
                                                                                catch (MatchException v36) {
                                                                                    throw b5.d("L", (Object)v36, (long)-6312556915915334893L, (long)var2_5);
                                                                                }
                                                                            }
                                                                            v37 = new Object[1];
                                                                            v37[0] = var23_14;
                                                                            v38 = new Object[2];
                                                                            v38[1] = var21_13;
                                                                            v38[0] = var45_31;
                                                                            v35 /* !! */  = (float)(b5.d("y", (Object)b5.d("y", (Object)b5.d("\u00cc", (long)-6312145903943129097L, (long)var2_5), (Object)v37, (long)-6310104800714580637L, (long)var2_5), (Object)v38, (long)-6310475121434355628L, (long)var2_5) * 0.9f);
                                                                        }
                                                                        var49_35 = v34 + v35 /* !! */  + 5.5f;
                                                                        v39 = new Object[1];
                                                                        v39[0] = var23_14;
                                                                        v40 = new Object[2];
                                                                        v40[1] = var21_13;
                                                                        v40[0] = var46_32;
                                                                        var50_36 = 18.1f + b5.d("y", (Object)b5.d("y", (Object)b5.d("\u00cc", (long)-6312145903943129097L, (long)var2_5), (Object)v39, (long)-6310104800714580637L, (long)var2_5), (Object)v40, (long)-6310475121434355628L, (long)var2_5) * 0.9f + 5.5f;
                                                                        var47_33 /* !! */  = (float)b5.d("L", (float)var47_33 /* !! */ , (float)b5.d("L", (float)var48_34, (float)b5.d("L", (float)var49_35, (float)var50_36, (long)-6310964274965720361L, (long)var2_5), (long)-6310964274965720361L, (long)var2_5), (long)-6310964274965720361L, (long)var2_5);
                                                                        var51_37 = var36_21 + 3.0f + var37_22 * 3.0f + 3.0f;
                                                                        var52_38 = b5.d("y", (Object)this, (Object)new Object[0], (long)-6312435315889624159L, (long)var2_5);
                                                                        v41 = new Object[2];
                                                                        v41[1] = Float.valueOf((float)var51_37);
                                                                        v41[0] = Float.valueOf(var47_33 /* !! */ );
                                                                        b5.d("y", (Object)this, (Object)v41, (long)-6306920570652149616L, (long)var2_5);
                                                                        var53_39 = this.e;
                                                                        var54_40 = this.f;
                                                                        v42 = new Object[10];
                                                                        v42[9] = var7_6;
                                                                        v42[8] = Float.valueOf(4.0f);
                                                                        v42[7] = 5;
                                                                        v42[6] = Float.valueOf((float)var51_37);
                                                                        v42[5] = Float.valueOf(var47_33 /* !! */ );
                                                                        v42[4] = Float.valueOf(var54_40);
                                                                        v42[3] = Float.valueOf(var53_39);
                                                                        v42[2] = var5_4;
                                                                        v42[1] = var4_3;
                                                                        v42[0] = var6_2;
                                                                        b5.d("L", (Object)v42, (long)-6310329304838511342L, (long)var2_5);
                                                                        v43 = new Object[10];
                                                                        v43[9] = var17_11;
                                                                        v43[8] = Float.valueOf(4.0f);
                                                                        v43[7] = cn_0.r;
                                                                        v43[6] = Float.valueOf((float)var51_37);
                                                                        v43[5] = Float.valueOf(var47_33 /* !! */ );
                                                                        v43[4] = Float.valueOf(var54_40);
                                                                        v43[3] = Float.valueOf(var53_39);
                                                                        v43[2] = var5_4;
                                                                        v43[1] = var4_3;
                                                                        v43[0] = var6_2;
                                                                        b5.d("L", (Object)v43, (long)-6312681657669117557L, (long)var2_5);
                                                                        var55_41 = var54_40 + 3.0f;
                                                                        try {
                                                                            v44 = var52_38 != false ? var53_39 + var47_33 /* !! */  - 5.5f - var38_24 : var53_39 + 5.5f;
                                                                        }
                                                                        catch (MatchException v45) {
                                                                            throw b5.d("L", (Object)v45, (long)-6312556915915334893L, (long)var2_5);
                                                                        }
                                                                        var57_43 = var56_42 = v44;
                                                                        for (var58_44 = 0; var58_44 < b5.d("y", (Object)var34_19, (long)-6309735663070973904L, (long)var2_5); ++var58_44) {
                                                                            block94: {
                                                                                block95: {
                                                                                    var59_46 = b5.d("L", (char)b5.d("y", (Object)var34_19, (int)var58_44, (long)-6313434778690983372L, (long)var2_5), (long)-6306745924113666686L, (long)var2_5);
                                                                                    try {
                                                                                        try {
                                                                                            v46 = var52_38;
                                                                                            if (var33_23 != null) break block94;
                                                                                            if (v46 == false) break block95;
                                                                                        }
                                                                                        catch (MatchException v47) {
                                                                                            throw b5.d("L", (Object)v47, (long)-6312556915915334893L, (long)var2_5);
                                                                                        }
                                                                                        v46 = b5.d("y", (Object)var34_19, (long)-6309735663070973904L, (long)var2_5) - true - var58_44;
                                                                                        break block94;
                                                                                    }
                                                                                    catch (MatchException v48) {
                                                                                        throw b5.d("L", (Object)v48, (long)-6312556915915334893L, (long)var2_5);
                                                                                    }
                                                                                }
                                                                                v46 = (reference)var58_44;
                                                                            }
                                                                            var60_48 /* !! */  = v46;
                                                                            v49 = new Object[1];
                                                                            v49[0] = var23_14;
                                                                            v50 = new Object[1];
                                                                            v50[0] = var9_7;
                                                                            v51 = new Object[4];
                                                                            v51[3] = var11_8;
                                                                            v51[2] = (int)(b5.c("k", (int)9165, (long)(3341652628169337426L ^ var2_5)) + var60_48 /* !! */ );
                                                                            v51[1] = (int)b5.c("k", (int)21099, (long)(5683039029468716010L ^ var2_5));
                                                                            v51[0] = b5.d("L", (Object)v50, (long)-6313867214953085342L, (long)var2_5);
                                                                            v52 = new Object[6];
                                                                            v52[5] = var29_17;
                                                                            v52[4] = b5.d("L", (Object)v51, (long)-6311978232176995287L, (long)var2_5);
                                                                            v52[3] = Float.valueOf(var55_41);
                                                                            v52[2] = Float.valueOf(var57_43);
                                                                            v52[1] = var59_46;
                                                                            v52[0] = var5_4;
                                                                            b5.d("y", (Object)b5.d("y", (Object)b5.d("\u00cc", (long)-6312145903943129097L, (long)var2_5), (Object)v49, (long)-6310104800714580637L, (long)var2_5), (Object)v52, (long)-6312202668674292017L, (long)var2_5);
                                                                            v53 = new Object[1];
                                                                            v53[0] = var23_14;
                                                                            v54 = new Object[2];
                                                                            v54[1] = var21_13;
                                                                            v54[0] = var59_46;
                                                                            var57_43 += b5.d("y", (Object)b5.d("y", (Object)b5.d("\u00cc", (long)-6312145903943129097L, (long)var2_5), (Object)v53, (long)-6310104800714580637L, (long)var2_5), (Object)v54, (long)-6310475121434355628L, (long)var2_5);
                                                                            if (var33_23 == null) continue;
                                                                        }
                                                                        var58_45 = var54_40 + var36_21 - 0.5f;
                                                                        v55 = new Object[7];
                                                                        v55[6] = var19_12;
                                                                        v55[5] = cn_0.v;
                                                                        v55[4] = Float.valueOf(var58_45 + 0.5f);
                                                                        v55[3] = Float.valueOf(var53_39 + var47_33 /* !! */  - 5.5f);
                                                                        v55[2] = Float.valueOf(var58_45);
                                                                        v55[1] = Float.valueOf(var53_39 + 5.5f);
                                                                        v55[0] = var5_4;
                                                                        b5.d("L", (Object)v55, (long)-6313109881354853479L, (long)var2_5);
                                                                        var59_47 = b5.d("L", (long)-6313355132603170899L, (long)var2_5);
                                                                        var61_49 = (int)b5.d("L", (double)255.0, (double)(170.0 + 85.0 * b5.d("L", (double)((double)var59_47 * 0.012), (long)-6312589923550556113L, (long)var2_5)), (long)-6313577515643937408L, (long)var2_5);
                                                                        var62_50 = var54_40 + var36_21 + 3.0f;
                                                                        var63_51 = var62_50 + (var37_22 - var35_20 * 0.9f) / 2.0f;
                                                                        var64_52 = var62_50 + (var37_22 - 4.0f) / 2.0f;
                                                                        try {
                                                                            v56 = var41_27 != 0 ? b5.i : new Color((int)b5.d("y", (Object)b5.j, (long)-6313000373134250036L, (long)var2_5), (int)b5.d("y", (Object)b5.j, (long)-6307285863472375410L, (long)var2_5), (int)b5.d("y", (Object)b5.j, (long)-6310107468360393915L, (long)var2_5), var61_49);
                                                                        }
                                                                        catch (MatchException v57) {
                                                                            throw b5.d("L", (Object)v57, (long)-6312556915915334893L, (long)var2_5);
                                                                        }
                                                                        var65_53 = v56;
                                                                        v58 = new Object[1];
                                                                        v58[0] = var23_14;
                                                                        v59 = new Object[2];
                                                                        v59[1] = var21_13;
                                                                        v59[0] = var40_26;
                                                                        var66_54 = b5.d("y", (Object)b5.d("y", (Object)b5.d("\u00cc", (long)-6312145903943129097L, (long)var2_5), (Object)v58, (long)-6310104800714580637L, (long)var2_5), (Object)v59, (long)-6310475121434355628L, (long)var2_5) * 0.9f;
                                                                        if (var52_38 == false) break block106;
                                                                        var67_55 = var53_39 + var47_33 /* !! */  - 5.5f - 4.0f;
                                                                        var68_56 = var67_55 - 3.0f - var66_54;
                                                                        v60 = new Object[10];
                                                                        v60[9] = var17_11;
                                                                        v60[8] = Float.valueOf(1.5f);
                                                                        v60[7] = var65_53;
                                                                        v60[6] = Float.valueOf(4.0f);
                                                                        v60[5] = Float.valueOf(4.0f);
                                                                        v60[4] = Float.valueOf(var64_52);
                                                                        v60[3] = Float.valueOf(var67_55);
                                                                        v60[2] = var5_4;
                                                                        v60[1] = var4_3;
                                                                        v60[0] = var6_2;
                                                                        b5.d("L", (Object)v60, (long)-6312681657669117557L, (long)var2_5);
                                                                        v61 = new Object[1];
                                                                        v61[0] = var23_14;
                                                                        v62 = new Object[7];
                                                                        v62[6] = var31_18;
                                                                        v62[5] = cn_0.s;
                                                                        v62[4] = Float.valueOf(0.9f);
                                                                        v62[3] = Float.valueOf(var63_51);
                                                                        v62[2] = Float.valueOf(var68_56);
                                                                        v62[1] = var40_26;
                                                                        v62[0] = var5_4;
                                                                        b5.d("y", (Object)b5.d("y", (Object)b5.d("\u00cc", (long)-6312145903943129097L, (long)var2_5), (Object)v61, (long)-6310104800714580637L, (long)var2_5), (Object)v62, (long)-6311208881853943131L, (long)var2_5);
                                                                        if (var33_23 == null) break block107;
                                                                    }
                                                                    var67_55 = var53_39 + 5.5f;
                                                                    v63 = new Object[10];
                                                                    v63[9] = var17_11;
                                                                    v63[8] = Float.valueOf(1.5f);
                                                                    v63[7] = var65_53;
                                                                    v63[6] = Float.valueOf(4.0f);
                                                                    v63[5] = Float.valueOf(4.0f);
                                                                    v63[4] = Float.valueOf(var64_52);
                                                                    v63[3] = Float.valueOf(var67_55);
                                                                    v63[2] = var5_4;
                                                                    v63[1] = var4_3;
                                                                    v63[0] = var6_2;
                                                                    b5.d("L", (Object)v63, (long)-6312681657669117557L, (long)var2_5);
                                                                    v64 = new Object[1];
                                                                    v64[0] = var23_14;
                                                                    v65 = new Object[7];
                                                                    v65[6] = var31_18;
                                                                    v65[5] = cn_0.s;
                                                                    v65[4] = Float.valueOf(0.9f);
                                                                    v65[3] = Float.valueOf(var63_51);
                                                                    v65[2] = Float.valueOf(var67_55 + 4.0f + 3.0f);
                                                                    v65[1] = var40_26;
                                                                    v65[0] = var5_4;
                                                                    b5.d("y", (Object)b5.d("y", (Object)b5.d("\u00cc", (long)-6312145903943129097L, (long)var2_5), (Object)v64, (long)-6310104800714580637L, (long)var2_5), (Object)v65, (long)-6311208881853943131L, (long)var2_5);
                                                                }
                                                                var63_51 = (var62_50 += var37_22) + (var37_22 - var35_20 * 0.9f) / 2.0f;
                                                                var67_55 = var62_50 + (var37_22 - 9.6f) / 2.0f;
                                                                var68_56 = var62_50 + (var37_22 - 3.0f) / 2.0f;
                                                                try {
                                                                    try {
                                                                        v66 = var42_28;
                                                                        v67 = 3;
                                                                        if (var33_23 != null) break block96;
                                                                        if (v66 != v67) break block97;
                                                                    }
                                                                    catch (MatchException v68) {
                                                                        throw b5.d("L", (Object)v68, (long)-6312556915915334893L, (long)var2_5);
                                                                    }
                                                                    v69 = b5.i;
                                                                    break block98;
                                                                }
                                                                catch (MatchException v70) {
                                                                    throw b5.d("L", (Object)v70, (long)-6312556915915334893L, (long)var2_5);
                                                                }
                                                            }
                                                            v66 = var42_28;
                                                            v67 = 1;
                                                        }
                                                        try {
                                                            v69 = var69_57 = v66 == v67 ? cn_0.t : cn_0.u;
                                                        }
                                                        catch (MatchException v71) {
                                                            throw b5.d("L", (Object)v71, (long)-6312556915915334893L, (long)var2_5);
                                                        }
                                                    }
                                                    if (var52_38 == false) break block108;
                                                    var70_58 = var53_39 + var47_33 /* !! */  - 5.5f - 9.6f;
                                                    try {
                                                        try {
                                                            v72 = new Object[6];
                                                            v72[5] = var27_16;
                                                            v72[4] = var5_4;
                                                            v72[3] = Float.valueOf(0.6f);
                                                            v72[2] = Float.valueOf(var67_55);
                                                            v72[1] = Float.valueOf(var70_58);
                                                            v72[0] = this.w[0];
                                                            b5.d("L", (Object)v72, (long)-6310547011759760482L, (long)var2_5);
                                                            if (var33_23 != null) break block99;
                                                            if (var42_28 != 2) break block100;
                                                        }
                                                        catch (MatchException v73) {
                                                            throw b5.d("L", (Object)v73, (long)-6312556915915334893L, (long)var2_5);
                                                        }
                                                        v74 = new Object[7];
                                                        v74[6] = var15_10;
                                                        v74[5] = Float.valueOf(var43_29);
                                                        v74[4] = Float.valueOf(var68_56);
                                                        v74[3] = Float.valueOf(var70_58 - 3.0f - 30.0f);
                                                        v74[2] = var5_4;
                                                        v74[1] = var4_3;
                                                        v74[0] = var6_2;
                                                        b5.d("y", (Object)this, (Object)v74, (long)-6310660891776476068L, (long)var2_5);
                                                    }
                                                    catch (MatchException v75) {
                                                        throw b5.d("L", (Object)v75, (long)-6312556915915334893L, (long)var2_5);
                                                    }
                                                }
                                                if (var33_23 == null) break block109;
                                            }
                                            v76 = new Object[1];
                                            v76[0] = var23_14;
                                            v77 = new Object[2];
                                            v77[1] = var21_13;
                                            v77[0] = var45_31;
                                            var71_60 = b5.d("y", (Object)b5.d("y", (Object)b5.d("\u00cc", (long)-6312145903943129097L, (long)var2_5), (Object)v76, (long)-6310104800714580637L, (long)var2_5), (Object)v77, (long)-6310475121434355628L, (long)var2_5) * 0.9f;
                                            v78 = new Object[1];
                                            v78[0] = var23_14;
                                            v79 = new Object[7];
                                            v79[6] = var31_18;
                                            v79[5] = var69_57;
                                            v79[4] = Float.valueOf(0.9f);
                                            v79[3] = Float.valueOf(var63_51);
                                            v79[2] = Float.valueOf(var70_58 - 3.0f - var71_60);
                                            v79[1] = var45_31;
                                            v79[0] = var5_4;
                                            b5.d("y", (Object)b5.d("y", (Object)b5.d("\u00cc", (long)-6312145903943129097L, (long)var2_5), (Object)v78, (long)-6310104800714580637L, (long)var2_5), (Object)v79, (long)-6311208881853943131L, (long)var2_5);
                                        }
                                        if (var33_23 == null) break block102;
                                    }
                                    var70_58 = var53_39 + 5.5f;
                                    try {
                                        try {
                                            v80 = new Object[6];
                                            v80[5] = var27_16;
                                            v80[4] = var5_4;
                                            v80[3] = Float.valueOf(0.6f);
                                            v80[2] = Float.valueOf(var67_55);
                                            v80[1] = Float.valueOf(var70_58);
                                            v80[0] = this.w[0];
                                            b5.d("L", (Object)v80, (long)-6310547011759760482L, (long)var2_5);
                                            if (var33_23 != null) break block101;
                                            if (var42_28 == 2) {
                                            }
                                            ** GOTO lbl491
                                        }
                                        catch (MatchException v81) {
                                            throw b5.d("L", (Object)v81, (long)-6312556915915334893L, (long)var2_5);
                                        }
                                        v82 = new Object[7];
                                        v82[6] = var15_10;
                                        v82[5] = Float.valueOf(var43_29);
                                        v82[4] = Float.valueOf(var68_56);
                                        v82[3] = Float.valueOf(var70_58 + 9.6f + 3.0f);
                                        v82[2] = var5_4;
                                        v82[1] = var4_3;
                                        v82[0] = var6_2;
                                        b5.d("y", (Object)this, (Object)v82, (long)-6310660891776476068L, (long)var2_5);
                                    }
                                    catch (MatchException v83) {
                                        throw b5.d("L", (Object)v83, (long)-6312556915915334893L, (long)var2_5);
                                    }
                                }
                                try {
                                    if (var33_23 == null) break block102;
lbl491:
                                    // 2 sources

                                    v84 = new Object[1];
                                    v84[0] = var23_14;
                                    v85 = new Object[7];
                                    v85[6] = var31_18;
                                    v85[5] = var69_57;
                                    v85[4] = Float.valueOf(0.9f);
                                    v85[3] = Float.valueOf(var63_51);
                                    v85[2] = Float.valueOf(var70_58 + 9.6f + 3.0f);
                                    v85[1] = var45_31;
                                    v85[0] = var5_4;
                                    b5.d("y", (Object)b5.d("y", (Object)b5.d("\u00cc", (long)-6312145903943129097L, (long)var2_5), (Object)v84, (long)-6310104800714580637L, (long)var2_5), (Object)v85, (long)-6311208881853943131L, (long)var2_5);
                                }
                                catch (MatchException v86) {
                                    throw b5.d("L", (Object)v86, (long)-6312556915915334893L, (long)var2_5);
                                }
                            }
                            var63_51 = (var62_50 += var37_22) + (var37_22 - var35_20 * 0.9f) / 2.0f;
                            var67_55 = var62_50 + (var37_22 - 9.6f) / 2.0f;
                            try {
                                v87 = var39_25;
                                if (var33_23 != null) break block103;
                                if (v87 != 0) break block104;
                            }
                            catch (MatchException v88) {
                                throw b5.d("L", (Object)v88, (long)-6312556915915334893L, (long)var2_5);
                            }
                            v87 = var44_30;
                        }
                        try {
                            try {
                                if (var33_23 != null) break block105;
                                if (v87 >= b5.c("k", (int)16140, (long)(4475105335198135960L ^ var2_5))) break block104;
                            }
                            catch (MatchException v89) {
                                throw b5.d("L", (Object)v89, (long)-6312556915915334893L, (long)var2_5);
                            }
                            v87 = 1;
                            break block105;
                        }
                        catch (MatchException v90) {
                            throw b5.d("L", (Object)v90, (long)-6312556915915334893L, (long)var2_5);
                        }
                    }
                    v87 = 0;
                }
                var70_59 = v87;
                try {
                    v91 = var70_59 != 0 ? new Color((int)b5.d("y", (Object)b5.j, (long)-6313000373134250036L, (long)var2_5), (int)b5.d("y", (Object)b5.j, (long)-6307285863472375410L, (long)var2_5), (int)b5.d("y", (Object)b5.j, (long)-6310107468360393915L, (long)var2_5), var61_49) : cn_0.s;
                }
                catch (MatchException v92) {
                    throw b5.d("L", (Object)v92, (long)-6312556915915334893L, (long)var2_5);
                }
                var71_61 = v91;
                v93 = new Object[1];
                v93[0] = var23_14;
                v94 = new Object[2];
                v94[1] = var21_13;
                v94[0] = var46_32;
                var72_62 = b5.d("y", (Object)b5.d("y", (Object)b5.d("\u00cc", (long)-6312145903943129097L, (long)var2_5), (Object)v93, (long)-6310104800714580637L, (long)var2_5), (Object)v94, (long)-6310475121434355628L, (long)var2_5) * 0.9f;
                if (var52_38 == false) break block110;
                var73_63 = var53_39 + var47_33 /* !! */  - 5.5f - 9.6f;
                v95 = new Object[6];
                v95[5] = var27_16;
                v95[4] = var5_4;
                v95[3] = Float.valueOf(0.6f);
                v95[2] = Float.valueOf(var67_55);
                v95[1] = Float.valueOf(var73_63);
                v95[0] = this.w[1];
                b5.d("L", (Object)v95, (long)-6310547011759760482L, (long)var2_5);
                v96 = new Object[1];
                v96[0] = var23_14;
                v97 = new Object[7];
                v97[6] = var31_18;
                v97[5] = var71_61;
                v97[4] = Float.valueOf(0.9f);
                v97[3] = Float.valueOf(var63_51);
                v97[2] = Float.valueOf(var73_63 - 3.0f - var72_62);
                v97[1] = var46_32;
                v97[0] = var5_4;
                b5.d("y", (Object)b5.d("y", (Object)b5.d("\u00cc", (long)-6312145903943129097L, (long)var2_5), (Object)v96, (long)-6310104800714580637L, (long)var2_5), (Object)v97, (long)-6311208881853943131L, (long)var2_5);
                if (var33_23 == null) break block111;
            }
            var73_63 = var53_39 + 5.5f;
            v98 = new Object[6];
            v98[5] = var27_16;
            v98[4] = var5_4;
            v98[3] = Float.valueOf(0.6f);
            v98[2] = Float.valueOf(var67_55);
            v98[1] = Float.valueOf(var73_63);
            v98[0] = this.w[1];
            b5.d("L", (Object)v98, (long)-6310547011759760482L, (long)var2_5);
            v99 = new Object[1];
            v99[0] = var23_14;
            v100 = new Object[7];
            v100[6] = var31_18;
            v100[5] = var71_61;
            v100[4] = Float.valueOf(0.9f);
            v100[3] = Float.valueOf(var63_51);
            v100[2] = Float.valueOf(var73_63 + 9.6f + 3.0f);
            v100[1] = var46_32;
            v100[0] = var5_4;
            b5.d("y", (Object)b5.d("y", (Object)b5.d("\u00cc", (long)-6312145903943129097L, (long)var2_5), (Object)v99, (long)-6310104800714580637L, (long)var2_5), (Object)v100, (long)-6311208881853943131L, (long)var2_5);
        }
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/b5" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/b5" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @bP
    public void a(bG var1_1) {
        block92: {
            block94: {
                block95: {
                    block91: {
                        block88: {
                            block89: {
                                block90: {
                                    block86: {
                                        block87: {
                                            block85: {
                                                block83: {
                                                    block84: {
                                                        block82: {
                                                            block79: {
                                                                block81: {
                                                                    block80: {
                                                                        block77: {
                                                                            block78: {
                                                                                block67: {
                                                                                    block66: {
                                                                                        block65: {
                                                                                            var2_2 = b5.y ^ 37453602590169L;
                                                                                            var4_3 = var2_2 ^ 71411797522170L;
                                                                                            var6_4 = b5.d("L", (long)6984424430605973576L, (long)var2_2);
                                                                                            try {
                                                                                                try {
                                                                                                    v0 = b5.b;
                                                                                                    if (var6_4 != null) break block65;
                                                                                                    if (b5.d("\u00a5", (Object)v0, (long)6987283392952329926L, (long)var2_2) != null) {
                                                                                                    }
                                                                                                    ** GOTO lbl21
                                                                                                }
                                                                                                catch (MatchException v1) {
                                                                                                    throw b5.d("L", (Object)v1, (long)6983531000013820828L, (long)var2_2);
                                                                                                }
                                                                                                v0 = b5.b;
                                                                                            }
                                                                                            catch (MatchException v2) {
                                                                                                throw b5.d("L", (Object)v2, (long)6983531000013820828L, (long)var2_2);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            if (b5.d("\u00a5", (Object)v0, (long)6984906199326001705L, (long)var2_2) != null) break block66;
lbl21:
                                                                                            // 2 sources

                                                                                            return;
                                                                                        }
                                                                                        catch (MatchException v3) {
                                                                                            throw b5.d("L", (Object)v3, (long)6983531000013820828L, (long)var2_2);
                                                                                        }
                                                                                    }
                                                                                    var7_5 = 0;
                                                                                    var8_6 = 0;
                                                                                    var9_7 = 0;
                                                                                    var10_8 = 0;
                                                                                    var11_9 = 0;
                                                                                    var12_10 = 0;
                                                                                    while (var12_10 <= b5.c("k", (int)24469, (long)(2931772155004624527L ^ var2_2))) {
                                                                                        block76: {
                                                                                            block70: {
                                                                                                block75: {
                                                                                                    block73: {
                                                                                                        block74: {
                                                                                                            block72: {
                                                                                                                block71: {
                                                                                                                    block69: {
                                                                                                                        block68: {
                                                                                                                            var13_12 = b5.d("y", (Object)b5.d("y", (Object)b5.d("\u00a5", (Object)b5.b, (long)6987283392952329926L, (long)var2_2), (long)6980946115297194278L, (long)var2_2), (int)var12_10, (long)6983882846750751001L, (long)var2_2);
                                                                                                                            try {
                                                                                                                                v4 = var13_12;
                                                                                                                                if (var6_4 != null) break block67;
                                                                                                                                if (b5.d("y", (Object)v4, (long)6984619292606508264L, (long)var2_2) != b5.d("\u00cc", (long)6986791389156670376L, (long)var2_2)) break block68;
                                                                                                                            }
                                                                                                                            catch (MatchException v5) {
                                                                                                                                throw b5.d("L", (Object)v5, (long)6983531000013820828L, (long)var2_2);
                                                                                                                            }
                                                                                                                            var11_9 += b5.d("y", (Object)var13_12, (long)6982102378913780267L, (long)var2_2);
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                v6 /* !! */  = var12_10;
                                                                                                                                if (var6_4 != null) break block69;
                                                                                                                                if (v6 /* !! */  > b5.c("k", (int)12296, (long)(7158404741818642689L ^ var2_2))) break block70;
                                                                                                                            }
                                                                                                                            catch (MatchException v7) {
                                                                                                                                throw b5.d("L", (Object)v7, (long)6983531000013820828L, (long)var2_2);
                                                                                                                            }
                                                                                                                            v6 /* !! */  = (int)b5.d("y", (Object)b5.l, (Object)b5.d("y", (Object)var13_12, (long)6984619292606508264L, (long)var2_2), (long)6981301240549777774L, (long)var2_2);
                                                                                                                        }
                                                                                                                        catch (MatchException v8) {
                                                                                                                            throw b5.d("L", (Object)v8, (long)6983531000013820828L, (long)var2_2);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        if (var6_4 != null) break block71;
                                                                                                                        if (v6 /* !! */  == 0) break block72;
                                                                                                                    }
                                                                                                                    catch (MatchException v9) {
                                                                                                                        throw b5.d("L", (Object)v9, (long)6983531000013820828L, (long)var2_2);
                                                                                                                    }
                                                                                                                    v6 /* !! */  = 1;
                                                                                                                }
                                                                                                                var7_5 = v6 /* !! */ ;
                                                                                                            }
                                                                                                            try {
                                                                                                                v10 = b5.d("y", (Object)var13_12, (long)6984619292606508264L, (long)var2_2);
                                                                                                                v11 = b5.d("\u00cc", (long)6983748027278344265L, (long)var2_2);
                                                                                                                if (var6_4 != null) break block73;
                                                                                                                if (v10 != v11) break block74;
                                                                                                            }
                                                                                                            catch (MatchException v12) {
                                                                                                                throw b5.d("L", (Object)v12, (long)6983531000013820828L, (long)var2_2);
                                                                                                            }
                                                                                                            var8_6 = 1;
                                                                                                        }
                                                                                                        try {
                                                                                                            v13 = var13_12;
                                                                                                            if (var6_4 != null) break block75;
                                                                                                            v10 = b5.d("y", (Object)v13, (long)6984619292606508264L, (long)var2_2);
                                                                                                            v11 = b5.d("\u00cc", (long)6980806745022496301L, (long)var2_2);
                                                                                                        }
                                                                                                        catch (MatchException v14) {
                                                                                                            throw b5.d("L", (Object)v14, (long)6983531000013820828L, (long)var2_2);
                                                                                                        }
                                                                                                    }
                                                                                                    if (v10 == v11) {
                                                                                                        var10_8 = 1;
                                                                                                        try {
                                                                                                            if (var6_4 != null) break block76;
                                                                                                            v13 = var13_12;
                                                                                                        }
                                                                                                        catch (MatchException v15) {
                                                                                                            throw b5.d("L", (Object)v15, (long)6983531000013820828L, (long)var2_2);
                                                                                                        }
                                                                                                    }
                                                                                                    break block70;
                                                                                                }
                                                                                                if (b5.d("L", (Object)v13, (long)6984575269920455624L, (long)var2_2) != false) {
                                                                                                    var9_7 = 1;
                                                                                                }
                                                                                            }
                                                                                            ++var12_10;
                                                                                        }
                                                                                        if (var6_4 == null) continue;
                                                                                    }
                                                                                    v4 = b5.d("y", (Object)b5.d("\u00a5", (Object)b5.b, (long)6987283392952329926L, (long)var2_2), (long)6981262864879655927L, (long)var2_2);
                                                                                }
                                                                                var12_11 = v4;
                                                                                try {
                                                                                    if (var6_4 != null) break block77;
                                                                                    if (b5.d("y", (Object)var12_11, (long)6984619292606508264L, (long)var2_2) != b5.d("\u00cc", (long)6986791389156670376L, (long)var2_2)) break block78;
                                                                                }
                                                                                catch (MatchException v16) {
                                                                                    throw b5.d("L", (Object)v16, (long)6983531000013820828L, (long)var2_2);
                                                                                }
                                                                                var11_9 += b5.d("y", (Object)var12_11, (long)6982102378913780267L, (long)var2_2);
                                                                            }
                                                                            this.v = var11_9;
                                                                        }
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    v17 = var8_6;
                                                                                    if (var6_4 != null) break block79;
                                                                                    if (v17 != 0) break block80;
                                                                                }
                                                                                catch (MatchException v18) {
                                                                                    throw b5.d("L", (Object)v18, (long)6983531000013820828L, (long)var2_2);
                                                                                }
                                                                                v17 = var9_7;
                                                                                if (var6_4 != null) break block79;
                                                                            }
                                                                            catch (MatchException v19) {
                                                                                throw b5.d("L", (Object)v19, (long)6983531000013820828L, (long)var2_2);
                                                                            }
                                                                            if (v17 == 0) break block81;
                                                                        }
                                                                        catch (MatchException v20) {
                                                                            throw b5.d("L", (Object)v20, (long)6983531000013820828L, (long)var2_2);
                                                                        }
                                                                    }
                                                                    v17 = 1;
                                                                    break block79;
                                                                }
                                                                v17 = 0;
                                                            }
                                                            var13_13 = v17;
                                                            try {
                                                                v21 = this;
                                                                v22 = var7_5;
                                                                if (var6_4 != null) break block82;
                                                                if (v22 == 0) break block83;
                                                            }
                                                            catch (MatchException v23) {
                                                                throw b5.d("L", (Object)v23, (long)6983531000013820828L, (long)var2_2);
                                                            }
                                                            v22 = var11_9;
                                                        }
                                                        try {
                                                            if (var6_4 != null) break block84;
                                                            if (v22 <= 0) break block83;
                                                        }
                                                        catch (MatchException v24) {
                                                            throw b5.d("L", (Object)v24, (long)6983531000013820828L, (long)var2_2);
                                                        }
                                                        v22 = var13_13;
                                                    }
                                                    try {
                                                        if (var6_4 != null) break block85;
                                                        if (v22 == 0) break block83;
                                                    }
                                                    catch (MatchException v25) {
                                                        throw b5.d("L", (Object)v25, (long)6983531000013820828L, (long)var2_2);
                                                    }
                                                    v22 = 1;
                                                    break block85;
                                                }
                                                v22 = 0;
                                            }
                                            try {
                                                try {
                                                    v21.s = v22;
                                                    v26 = this;
                                                    v27 = var7_5;
                                                    if (var6_4 != null) break block86;
                                                    if (v27 != 0) break block87;
                                                }
                                                catch (MatchException v28) {
                                                    throw b5.d("L", (Object)v28, (long)6983531000013820828L, (long)var2_2);
                                                }
                                                v29 = b5.a("f", (int)10328, (long)(379535615518306704L ^ var2_2));
                                                break block88;
                                            }
                                            catch (MatchException v30) {
                                                throw b5.d("L", (Object)v30, (long)6983531000013820828L, (long)var2_2);
                                            }
                                        }
                                        v27 = var11_9;
                                    }
                                    try {
                                        try {
                                            if (var6_4 != null) break block89;
                                            if (v27 != 0) break block90;
                                        }
                                        catch (MatchException v31) {
                                            throw b5.d("L", (Object)v31, (long)6983531000013820828L, (long)var2_2);
                                        }
                                        v29 = b5.a("f", (int)21826, (long)(701841350475287695L ^ var2_2));
                                        break block88;
                                    }
                                    catch (MatchException v32) {
                                        throw b5.d("L", (Object)v32, (long)6983531000013820828L, (long)var2_2);
                                    }
                                }
                                v27 = var13_13;
                            }
                            try {
                                v29 = v27 == 0 ? b5.a("f", (int)29442, (long)(2553574622427851465L ^ var2_2)) : b5.a("f", (int)15949, (long)(1570350813464586115L ^ var2_2));
                            }
                            catch (MatchException v33) {
                                throw b5.d("L", (Object)v33, (long)6983531000013820828L, (long)var2_2);
                            }
                        }
                        try {
                            try {
                                try {
                                    v26.r = v29;
                                    v34 /* !! */  = b5.d("y", (Object)b5.d("\u00a5", (Object)b5.b, (long)6987283392952329926L, (long)var2_2), (long)6983139195931163079L, (long)var2_2);
                                    if (var6_4 != null) break block91;
                                    if (v34 /* !! */  != false) {
                                    }
                                    ** GOTO lbl233
                                }
                                catch (MatchException v35) {
                                    throw b5.d("L", (Object)v35, (long)6983531000013820828L, (long)var2_2);
                                }
                                v34 /* !! */  = (CallSite)(b5.d("y", (Object)b5.d("y", (Object)b5.d("\u00a5", (Object)b5.b, (long)6987283392952329926L, (long)var2_2), (long)6983975676644926415L, (long)var2_2), (long)6984619292606508264L, (long)var2_2) instanceof class_1764);
                                if (var6_4 != null) break block91;
                            }
                            catch (MatchException v36) {
                                throw b5.d("L", (Object)v36, (long)6983531000013820828L, (long)var2_2);
                            }
                            if (v34 /* !! */  != false) {
                            }
                            ** GOTO lbl233
                        }
                        catch (MatchException v37) {
                            throw b5.d("L", (Object)v37, (long)6983531000013820828L, (long)var2_2);
                        }
                        var14_14 = b5.d("y", (Object)b5.d("\u00a5", (Object)b5.b, (long)6987283392952329926L, (long)var2_2), (long)6983975676644926415L, (long)var2_2);
                        var15_15 = b5.d("L", (int)1, (int)b5.d("L", (Object)var14_14, (Object)b5.d("\u00a5", (Object)b5.b, (long)6987283392952329926L, (long)var2_2), (long)6984798664155685392L, (long)var2_2), (long)6984839161900938320L, (long)var2_2);
                        try {
                            this.t = (int)b5.c("k", (int)4115, (long)(6092876549638443264L ^ var2_2));
                            v38 = new Object[1];
                            v38[0] = var4_3;
                            this.u = (float)b5.d("L", (float)1.0f, (float)(((float)b5.d("y", (Object)b5.d("\u00a5", (Object)b5.b, (long)6987283392952329926L, (long)var2_2), (long)6983191965417553218L, (long)var2_2) + b5.d("L", (Object)v38, (long)6982849809117740744L, (long)var2_2)) / (float)var15_15), (long)6981096379208640267L, (long)var2_2);
                            if (var6_4 == null) break block92;
lbl233:
                            // 3 sources

                            v34 /* !! */  = (CallSite)var9_7;
                        }
                        catch (MatchException v39) {
                            throw b5.d("L", (Object)v39, (long)6983531000013820828L, (long)var2_2);
                        }
                    }
                    try {
                        try {
                            block93: {
                                try {
                                    if (v34 /* !! */  == false) break block93;
                                    this.t = (int)b5.c("k", (int)29724, (long)(4860056139539756288L ^ var2_2));
                                    this.u = 1.0f;
                                    if (var6_4 == null) break block92;
                                }
                                catch (MatchException v40) {
                                    throw b5.d("L", (Object)v40, (long)6983531000013820828L, (long)var2_2);
                                }
                            }
                            v41 = this;
                            v42 = var10_8;
                            if (var6_4 != null) break block94;
                        }
                        catch (MatchException v43) {
                            throw b5.d("L", (Object)v43, (long)6983531000013820828L, (long)var2_2);
                        }
                        if (v42 == 0) break block95;
                    }
                    catch (MatchException v44) {
                        throw b5.d("L", (Object)v44, (long)6983531000013820828L, (long)var2_2);
                    }
                    v42 = 1;
                    break block94;
                }
                v42 = 0;
            }
            v41.t = v42;
            this.u = 0.0f;
        }
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3931;
        if (C[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])D.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    D.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/b5", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = B[n2].getBytes("ISO-8859-1");
            b5.C[n2] = b5.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return C[n2];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = b5.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    @Override
    public void m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x6910D1708A27L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = Float.valueOf(340.0f);
        objectArray2[0] = Float.valueOf(2.0f);
        b5.d("y", (Object)this, (Object)objectArray2, (long)-3384253689050415932L, (long)l);
    }

    private static Field k(long l, long l2) {
        int n = b5.i(l, l2);
        Object object = K[n];
        if (object instanceof String) {
            String string = L[n];
            int n2 = string.indexOf(8);
            Class clazz = b5.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = b5.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = b5.e(clazz3, string2, clazz2)) != null) {
                    b5.K[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = b5.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        b5.K[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = b5.j(1717229705285372L, 0L);
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
            int n = b5.i(l, l2);
            object = K[n];
            try {
                if (!(object instanceof String)) break block2;
                b5.K[n] = clazz = Class.forName(L[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private void r(Object[] objectArray) {
        block4: {
            b5 b52;
            long l;
            block5: {
                l = (Long)objectArray[0];
                l = y ^ l;
                CallSite callSite = b5.d("L", (long)-9050626242735187264L, (long)l);
                try {
                    try {
                        b52 = this;
                        if (callSite != null) break block4;
                        if (!b52.x) break block5;
                    }
                    catch (MatchException matchException) {
                        throw b5.d("L", (Object)matchException, (long)-9051564478559915756L, (long)l);
                    }
                    return;
                }
                catch (MatchException matchException) {
                    throw b5.d("L", (Object)matchException, (long)-9051564478559915756L, (long)l);
                }
            }
            this.w[0] = new class_1799((class_1935)b5.d("\u00cc", (long)-9049753797176091483L, (long)l));
            b5.d("y", (Object)this.w[0], (Object)b5.d("\u00cc", (long)-9043334969433369439L, (long)l), (Object)b5.d("L", (Object)b5.a("f", (int)29533, (long)(0x141223CA8B634819L ^ l)), (Object)b5.a("f", (int)26259, (long)(0x7EF8125F22DEDDDBL ^ l)), (long)-9043609269176965607L, (long)l), (long)-9052079038789274729L, (long)l);
            this.w[1] = new class_1799((class_1935)b5.d("\u00cc", (long)-9043773813752063712L, (long)l));
            b52 = this;
        }
        b52.x = 1;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(b5.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(b5.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(b5.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


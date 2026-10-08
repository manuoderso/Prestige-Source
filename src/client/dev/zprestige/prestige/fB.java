/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2338
 *  net.minecraft.class_2586
 *  net.minecraft.class_2589
 *  net.minecraft.class_2595
 *  net.minecraft.class_2601
 *  net.minecraft.class_2608
 *  net.minecraft.class_2609
 *  net.minecraft.class_2611
 *  net.minecraft.class_2614
 *  net.minecraft.class_2627
 *  net.minecraft.class_2646
 *  net.minecraft.class_2818
 *  net.minecraft.class_310
 *  net.minecraft.class_3719
 *  net.minecraft.class_408
 *  net.minecraft.class_631
 *  net.minecraft.class_631$class_3681
 *  org.joml.Matrix4f
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.D;
import dev.zprestige.prestige.E;
import dev.zprestige.prestige.aq_0;
import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bT;
import dev.zprestige.prestige.bt_0;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dN;
import dev.zprestige.prestige.dS;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.dr_0;
import dev.zprestige.prestige.fZ;
import dev.zprestige.prestige.gK;
import dev.zprestige.prestige.gW;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2338;
import net.minecraft.class_2586;
import net.minecraft.class_2589;
import net.minecraft.class_2595;
import net.minecraft.class_2601;
import net.minecraft.class_2608;
import net.minecraft.class_2609;
import net.minecraft.class_2611;
import net.minecraft.class_2614;
import net.minecraft.class_2627;
import net.minecraft.class_2646;
import net.minecraft.class_2818;
import net.minecraft.class_310;
import net.minecraft.class_3719;
import net.minecraft.class_408;
import net.minecraft.class_631;
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class fB
extends dV {
    private dS a;
    private dM d;
    private dN c;
    private dN e;
    private dN f;
    private dN g;
    private dN h;
    private dN i;
    private dN j;
    private dN k;
    private dN l;
    private dN m;
    private static final int n;
    private static final float o = 15.0f;
    private static fZ p;
    private boolean q;
    private List r;
    private static final long s;
    private static final String[] t;
    private static final String[] u;
    private static final Map v;
    private static final long[] w;
    private static final Integer[] x;
    private static final Map y;
    private static final Object[] z;
    private static final String[] A;

    public fB() {
        long l = s ^ 0x5A60FA728EDDL;
        long l2 = l ^ 0x338E9716CCF8L;
        this.q = 0;
        this.r = new ArrayList();
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = this::lambda$new$5;
        fB.d("\u00e4", (Object)this.i, (Object)objectArray, (long)4273449890996036576L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = this::lambda$new$0;
        fB.d("\u00e4", (Object)this.c, (Object)objectArray2, (long)4273449890996036576L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l2;
        objectArray3[0] = this::lambda$new$4;
        fB.d("\u00e4", (Object)this.h, (Object)objectArray3, (long)4273449890996036576L, (long)l);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l2;
        objectArray4[0] = this::lambda$new$9;
        fB.d("\u00e4", (Object)this.m, (Object)objectArray4, (long)4273449890996036576L, (long)l);
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l2;
        objectArray5[0] = this::lambda$new$7;
        fB.d("\u00e4", (Object)this.k, (Object)objectArray5, (long)4273449890996036576L, (long)l);
        Object[] objectArray6 = new Object[2];
        objectArray6[1] = l2;
        objectArray6[0] = this::lambda$new$6;
        fB.d("\u00e4", (Object)this.j, (Object)objectArray6, (long)4273449890996036576L, (long)l);
        Object[] objectArray7 = new Object[2];
        objectArray7[1] = l2;
        objectArray7[0] = this::lambda$new$8;
        fB.d("\u00e4", (Object)this.l, (Object)objectArray7, (long)4273449890996036576L, (long)l);
        Object[] objectArray8 = new Object[2];
        objectArray8[1] = l2;
        objectArray8[0] = this::lambda$new$3;
        fB.d("\u00e4", (Object)this.g, (Object)objectArray8, (long)4273449890996036576L, (long)l);
        Object[] objectArray9 = new Object[2];
        objectArray9[1] = l2;
        objectArray9[0] = this::lambda$new$1;
        fB.d("\u00e4", (Object)this.e, (Object)objectArray9, (long)4273449890996036576L, (long)l);
        Object[] objectArray10 = new Object[2];
        objectArray10[1] = l2;
        objectArray10[0] = this::lambda$new$2;
        fB.d("\u00e4", (Object)this.f, (Object)objectArray10, (long)4273449890996036576L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        fB.s = hc.a(-2033640643382526022L, 9026238830505759741L, MethodHandles.lookup().lookupClass()).a(281313844882824L);
                        fB.z = new Object[105];
                        fB.A = new String[105];
                        fB.f();
                        fB.v = new HashMap<K, V>(13);
                        var11 = fB.s ^ 736699719983L;
                        var13_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var11 >>> 56);
                        for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                            v2 = v2;
                            v2[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                        }
                        var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var20_3 = new String[20];
                        var18_4 = 0;
                        var17_5 = "\u00e5\u00f5f\u009c\u00c0I\u00a8x\u00fa.\u00de\u008e6\u00f1~T\u0018#\u00a1-\u00e5\u00f8\u00ed\u00df\u00bdNY\u00ebo\u00b9\u00c0n\u0017\u00bd\u00f9\u00ban8\u00fat\u00b8 \u00e1W\u00b0Zw\u00ca\u0007\u0004\u00e9\u00ff\u0012\u00c2\u00b31T\u0091rTJ|\u00a3\u00e0\u00b23\n\u00e9\u0096;n12c \u00e2\u0099\u00b0\u009b\u0007}Ko\t(\u00a4\u00cb\u00d8\u00ee\u00c5W\u00f0\u00d7\u00ba\u00ae,7\u00b9J\u00dcH\u00b8+\u00c3\u00c5\u00a4\u00ad \u008b\u00d1\u00a7\u0081\u00fe\u001fo\u0017;<\u000bv\u00d5\u009b3d\u00be\u0004\u00c4\u0005\n\u00e7\u0097\u00ffV\u00f4JxL%0\u00ea\u0018e\u001b\u00c4+?G\u0090\u00baQ\u00f3\u0013\u001a\u00e7\u0081\u00e0\u001f\u0016\u0088\u00ee\u00f5\u00c2\u00b99\u0090\u0018\u0007\u001b\u00d8\u0080q\u00d95\u00a7\u00f6M;Hg|\u009c\u00cd\u00f68\u00cd\u00b3k\u00c8\u00c3\u00c3 \u0088\u0085\u0003\u00e3u\u00a6\u00ef\u0011\u00eaFtCs\u00fb\u0013M/\u00b6\u00b4ur\u0013M\u00cfyw\u00cb\u00af\u0085\u0083\u00f4l\u0010\u00b2\u00e3\u0081\u00a8\u0016\u009c\u00f8\u00df\u00e5\u00b3\u0016\u00e4\u00bb\u00aa\u0010\u00e1\u0010U\u00d3\u00ba\u00f0\u00da\u00f0\u0002\u0080g\u0096\u0088\u008d\fG\u00a8\b\u0010\u007f\u0089\u00d3@\u00fa%d\u00a67\u00f9\u00c8\u00d2\u0014_;\u00c1\u0010u\u0084\u0001\u00cb\u0082\u00c8\u00bbR\u009a\u007fs`\u0003'\u001d\u009b \u00b0\u00f3lj\u007f\u00aa=\u0080\u00fd^\u00b1\u008e.\u00ff\u0006\u00ef\u00e1\u00b6L!F\u00e2\u00fcM\u0001g\u00cb\u00a5Jz\u008a\u00ea\u00187\u00107\u0097\u00f54\u00e1P\u00e9\u008a_\u0090\u0089\u0014%\u00ef\u0090y7\u00d5\u001e\u00dar\u00d3 \u0093\u00fao\u00eeb\u00f8\u00b8\u00dbZU\u00f7\u009c\u00b4\u0012e\u00be\u00ba\u0002\u00cby\u0094\u00a4\u00d97\u00c0\u0017\u00a0#\u00f0\u00e1v, \u00b7\u0005B\fV_\u00b3\n\u0095\u00e3\u00104\u00b8\t\u00bb'c\u00c7\u00e4z\u0086\u0093\u009d\u00cf\u008c\u00bb\u001aZ~\u00b8\u00ba\u00d6 \u00be\u00a9;-=\u009cI\u0014i]|\u0001t\u00fa3:\u009d\u00e8\u000e4)1\u00b9T3\u00ef5\u00bb\u008e\u00070\u00b2\u0018\u00da\u00ed\u0080.\u0001\u0082\u00e83\u0088'{\u0003\u0093\u0019f\u008a 5\u00f8Bu\u0086\u0083\u00d4";
                        var19_6 = "\u00e5\u00f5f\u009c\u00c0I\u00a8x\u00fa.\u00de\u008e6\u00f1~T\u0018#\u00a1-\u00e5\u00f8\u00ed\u00df\u00bdNY\u00ebo\u00b9\u00c0n\u0017\u00bd\u00f9\u00ban8\u00fat\u00b8 \u00e1W\u00b0Zw\u00ca\u0007\u0004\u00e9\u00ff\u0012\u00c2\u00b31T\u0091rTJ|\u00a3\u00e0\u00b23\n\u00e9\u0096;n12c \u00e2\u0099\u00b0\u009b\u0007}Ko\t(\u00a4\u00cb\u00d8\u00ee\u00c5W\u00f0\u00d7\u00ba\u00ae,7\u00b9J\u00dcH\u00b8+\u00c3\u00c5\u00a4\u00ad \u008b\u00d1\u00a7\u0081\u00fe\u001fo\u0017;<\u000bv\u00d5\u009b3d\u00be\u0004\u00c4\u0005\n\u00e7\u0097\u00ffV\u00f4JxL%0\u00ea\u0018e\u001b\u00c4+?G\u0090\u00baQ\u00f3\u0013\u001a\u00e7\u0081\u00e0\u001f\u0016\u0088\u00ee\u00f5\u00c2\u00b99\u0090\u0018\u0007\u001b\u00d8\u0080q\u00d95\u00a7\u00f6M;Hg|\u009c\u00cd\u00f68\u00cd\u00b3k\u00c8\u00c3\u00c3 \u0088\u0085\u0003\u00e3u\u00a6\u00ef\u0011\u00eaFtCs\u00fb\u0013M/\u00b6\u00b4ur\u0013M\u00cfyw\u00cb\u00af\u0085\u0083\u00f4l\u0010\u00b2\u00e3\u0081\u00a8\u0016\u009c\u00f8\u00df\u00e5\u00b3\u0016\u00e4\u00bb\u00aa\u0010\u00e1\u0010U\u00d3\u00ba\u00f0\u00da\u00f0\u0002\u0080g\u0096\u0088\u008d\fG\u00a8\b\u0010\u007f\u0089\u00d3@\u00fa%d\u00a67\u00f9\u00c8\u00d2\u0014_;\u00c1\u0010u\u0084\u0001\u00cb\u0082\u00c8\u00bbR\u009a\u007fs`\u0003'\u001d\u009b \u00b0\u00f3lj\u007f\u00aa=\u0080\u00fd^\u00b1\u008e.\u00ff\u0006\u00ef\u00e1\u00b6L!F\u00e2\u00fcM\u0001g\u00cb\u00a5Jz\u008a\u00ea\u00187\u00107\u0097\u00f54\u00e1P\u00e9\u008a_\u0090\u0089\u0014%\u00ef\u0090y7\u00d5\u001e\u00dar\u00d3 \u0093\u00fao\u00eeb\u00f8\u00b8\u00dbZU\u00f7\u009c\u00b4\u0012e\u00be\u00ba\u0002\u00cby\u0094\u00a4\u00d97\u00c0\u0017\u00a0#\u00f0\u00e1v, \u00b7\u0005B\fV_\u00b3\n\u0095\u00e3\u00104\u00b8\t\u00bb'c\u00c7\u00e4z\u0086\u0093\u009d\u00cf\u008c\u00bb\u001aZ~\u00b8\u00ba\u00d6 \u00be\u00a9;-=\u009cI\u0014i]|\u0001t\u00fa3:\u009d\u00e8\u000e4)1\u00b9T3\u00ef5\u00bb\u008e\u00070\u00b2\u0018\u00da\u00ed\u0080.\u0001\u0082\u00e83\u0088'{\u0003\u0093\u0019f\u008a 5\u00f8Bu\u0086\u0083\u00d4".length();
                        var16_7 = 16;
                        var15_8 = -1;
lbl32:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl37:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = fB.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u00ea0\u00bf\u00c2yk\u0010\u00a0_\u001c\n\u0091t\u00f9!\u00d2 \u00c5\u0007\u00a6 b\u00a3o\u00dbm\u00ce\u00b8{\u00dc?\u008be\u00cbR\u00ef\u0004\u00b4\u0086n\u00cd\u0098\u00dc\ba\u00fa\u00129\u009a";
                            var19_6 = "\u00ea0\u00bf\u00c2yk\u0010\u00a0_\u001c\n\u0091t\u00f9!\u00d2 \u00c5\u0007\u00a6 b\u00a3o\u00dbm\u00ce\u00b8{\u00dc?\u008be\u00cbR\u00ef\u0004\u00b4\u0086n\u00cd\u0098\u00dc\ba\u00fa\u00129\u009a".length();
                            var16_7 = 16;
                            var15_8 = -1;
lbl46:
                            // 2 sources

                            while (true) {
                                v6 = ++var15_8;
                                v4 = var17_5.substring(v6, v6 + var16_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl51:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = fB.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var21_9 = var13_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                fB.t = var20_3;
                fB.u = new String[20];
                fB.y = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var11 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var11 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[8];
                var3_13 = 0;
                var4_14 = "\u00b5\u00f7\u0011\u00e0@E\u007f\u001fZ\u00a6H\u00eb\u00fc\u00def$\u00b6\u001a+d\u00e7\u00b6\u00a0W\u00e8y\u00ecK\u0002\u00be\u0098\u008f\n$\u0090!k\u0015\u00fc\u0095;|m \u0094\u00ba\u00e17";
                var5_15 = "\u00b5\u00f7\u0011\u00e0@E\u007f\u001fZ\u00a6H\u00eb\u00fc\u00def$\u00b6\u001a+d\u00e7\u00b6\u00a0W\u00e8y\u00ecK\u0002\u00be\u0098\u008f\n$\u0090!k\u0015\u00fc\u0095;|m \u0094\u00ba\u00e17".length();
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
                    var4_14 = "\u00d7\u00b1$\u0093\u001f\u00a8h\u00a0\u001f\u0006E'.\u00a3\\\u00b2";
                    var5_15 = "\u00d7\u00b1$\u0093\u001f\u00a8h\u00a0\u001f\u0006E'.\u00a3\\\u00b2".length();
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
        fB.w = var6_12;
        fB.x = new Integer[8];
        fB.n = (int)fB.c("q", (int)5651, (long)(var11 ^ 3608173952651649795L));
    }

    @Override
    public void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        fB.d("\u00e4", (Object)this.r, (long)3996289712201786891L, (long)l);
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
            throw new RuntimeException("dev/zprestige/prestige/fB" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3272;
        if (u[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])v.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    v.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/fB", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = t[n2].getBytes("ISO-8859-1");
            fB.u[n2] = fB.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return u[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = fB.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x61BC;
        if (x[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = w[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])y.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    y.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/fB", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            fB.x[n2] = n3;
        }
        return x[n2];
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fB" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = fB.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fB.m(l, l2);
            object = z[n];
            try {
                if (!(object instanceof String)) break block2;
                fB.z[n] = clazz = Class.forName(A[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fB.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fB.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fB.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fB.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = z;
        z[0] = "wUQwM\u000baUT-^\u001cv\u001eW+R\bgY@<\u0019\u001dQ";
        objectArray[1] = "}z4GG\u0015\bZ?HVZiT4CR\u0000\u001d";
        objectArray[2] = "4A%P$\u007f)T}rer1R";
        objectArray[3] = "\u0013GgA\u00183\rO}\u000e\u007f2\u001cTpTY4";
        objectArray[4] = "n9cnC\u0018e6r!\"\u0016n=v{";
        objectArray[5] = "<wfF\u0011\u0003*wc\u001c\u0002\u0014=<`\u001a\u000e\u0000,{w\rE\u0012\u0010";
        objectArray[6] = "\u0006~\u0015c-\u001es^\u001el<Q\u000eF\rk5\u0018f";
        objectArray[7] = "=(\r)\u0005w# \u0017fHm9*\u000e:Yg9=U)_m: \u0018fjv8$\u0012+yg1,\t-Ea2\b\t:J{";
        objectArray[8] = Integer.TYPE;
        fB.A[8] = "java/lang/Integer";
        objectArray[9] = "9xcyV\u001e9xt%Z\u0011#3t;Z\u0004$B$f\u000b";
        objectArray[10] = "31J`\b/31]<\u0004 )z]\"\u00045.\u000b\tzS";
        objectArray[11] = "\u0014\u00047M19\n\f-\u0002S%\r\u0011";
        objectArray[12] = Void.TYPE;
        fB.A[12] = "java/lang/Void";
        objectArray[13] = "0[\u0003g\u001b80[\u0014;\u00177*\u0010\u0014%\u0017\"-aAzN";
        objectArray[14] = "\b\u001d8CR}\u001e\u001d=\u0019Aj\tV>\u001fM~\u0018\u0011)\b\u0006H";
        objectArray[15] = "H\u000bT{b\u0013=+_ts\\\\%T\u007fw\u0006(";
        objectArray[16] = "17X&Q=17Oz]2+|Od]',\r\u001e0\rl";
        objectArray[17] = "n|n~c\u0019ptt1\u0000\rt";
        objectArray[18] = "\u000b\u000b\"s\u0018v\u0015\u00038<ef\u0015";
        objectArray[19] = "m\u001d\u000e>OLm\u001d\u0019bCCwV\u0019|CVp'H#\u0011\u001d";
        objectArray[20] = "(F/o\u001a/#I> y\"6D1KL 'W-g[-";
        objectArray[21] = "\u0003S\u0014YP@\u001d[\u000e\u00163T\u0019\u0016'V\nG\u0010";
        objectArray[22] = Boolean.TYPE;
        fB.A[22] = "java/lang/Boolean";
        objectArray[23] = "4ji-[,4j~qW#.!~oW6)P+0\u0007";
        objectArray[24] = ",U\u0001o/?:U\u00045<(-\u001e\u000730<<Y\u0010${\u000b";
        objectArray[25] = "zbX~GC\u000fBSqV\fnLXzRV\u001a";
        objectArray[26] = "wrU?Y5wrBcU:m9B}U/jH\u0017\"\u0005xz{@bG\u0003*!\u0019 ";
        objectArray[27] = "N9s<OHB.nqDJ\u000e:fp[@Crfb@\u0007E*b|]\u0007e*b|]";
        objectArray[28] = "B/by\u000e)T/g#\u001d>Cdd%\u0011*R#s2Z=u";
        objectArray[29] = "D\u0012\u001fT%\r12\u0014[4BP<\u001fP0\u0018$";
        objectArray[30] = "Wv\u001ft_RWv\b(S]M=\b6SHJL_i\u0005";
        objectArray[31] = "FRW%F\u000fPRR\u007fU\u0018G\u0019QyY\fV^Fn\u0012\u001bt";
        objectArray[32] = "\u0015-'\u0013D-`\r,\u001cUb\u0001\u0003'\u0017Q8u";
        objectArray[33] = "\u0017O]Y\u0013S\u0001OX\u0003\u0000D\u0016\u0004[\u0005\fP\u0007CL\u0012GE)";
        objectArray[34] = "E!\u0006Z\u000b}N.\u0017\u0015g~@,\u0015ZK";
        objectArray[35] = "\u001at~|jT\ft{&yC\u001b?x uW\nxo7>@5";
        objectArray[36] = ")v\u0006G\u001d8\\V\rH\fw=X\u0006C\b-I";
        objectArray[37] = "@\u00071bJ*5':m[eT)1f_? ";
        objectArray[38] = "W=N@f?A=K\u001au(VvH\u001cy<G1_\u000b2(d";
        objectArray[39] = "R\u0015BE\u0007.P\u000b\u000b=\b\"I\bWX\t";
        objectArray[40] = Double.TYPE;
        fB.A[40] = "java/lang/Double";
        objectArray[41] = "F%40\u001c;P%1j\u000f,Gn2l\u00038V)%{H/R";
        objectArray[42] = "\u001b{8\u0000}Sn[3\u000fl\u001c\u000fU8\u0004hF{";
        objectArray[43] = ".\u001d0o\r:8\u001d55\u001e-/V63\u00129>\u0011!$Y(\u001e";
        objectArray[44] = "V\u0010u\u0004>r#0~\u000b/=B>u\u0000+g6";
        objectArray[45] = "I\\c\u0014\u000e|<|h\u001b\u001f3]rc\u0010\u001bi)";
        objectArray[46] = "^)a\u0002L\u000bH)dX_\u001c_bg^S\bN%pI\u0018\u001fN";
        objectArray[47] = "_XsY\u0004rIXv\u0003\u0017e^\u0013u\u0005\u001bqOTb\u0012Pa}";
        objectArray[48] = "m0<\u0005z\u007f\u0018\u00107\nk0y\u001e<\u0001oj\r";
        objectArray[49] = "\fv?:y\u001byV45hT\u0018X?>l\u000el";
        objectArray[50] = "< \rl\u001di* \b6\u000e~=k\u000b0\u0002j,,\u001c'Ix)";
        objectArray[51] = "\u0002@\u0012\u0000\u0011ow`\u0019\u000f\u0000 \u0016n\u0012\u0004\u0004zb";
        objectArray[52] = "p\r<^+\n\u0005-7Q:Ed#<Z>\u001f\u0010";
        objectArray[53] = "(\u0014\rcav]4\u0006lp9<:\rgtcH";
        objectArray[54] = "4\u0001PJ%O\"\u0001U\u00106X5JV\u0016:L$\rA\u0001q[\u001e";
        objectArray[55] = "aF\u0016L\u0003j\u0014f\u001dC\u0012%uh\u0016H\u0016\u007f\u0001";
        objectArray[56] = "\u0014S\u001cd\u001e9\u0001I\u0019>gc](Nu\u00194\rYC{Ygm";
        objectArray[57] = "\f@&Y\u001drYN6\u0005z ]B[\b\u000b1\r^*\u0005\u0005q^>`\n\u001a3UFcHE20";
        objectArray[58] = "{G\tVbD{^\u0000R_C$S\u0015A\b\u0014z\u0004M-`\u0014<E\u001f_<P{_";
        objectArray[59] = "\u0002|)[\u0004Q_r&\u0007aAd+|\u000e\u001dO\u0006i9\u0007\\\u0013dm{Z\u001c\u0018\u0015v<G\u0002(";
        objectArray[60] = "_!0}c][p5f\u0000B%4dhg\u000eZ(lkd";
        objectArray[61] = "8c=jt\u00188z4nI\u001fgw!}\u001eH9'x\u0011-\u0018d}&,u\fa`";
        objectArray[62] = "\u0001\u0001 [AME\u001d;U{FR\u001d\u001bH\u000bZ;\b%\u0014K[R\u0016=\u001a\u0012&";
        objectArray[63] = "S^|\u000bB]XU;\u0010s\b<\u001c=_\u000f\u0006^^xVNZ<De\u0015N\u001aY\u0015fS\ta";
        objectArray[64] = "eL \b\u007f}pV%R\u0006'\"7r\u0019xp|F\u007f\u00178#\u001c";
        objectArray[65] = ">:\u0013YVH4*\u001eR2LE\u007fN\u0018NB'=\u000b\u0011\u000f\u001eE<\u001aMCF*8KHX%";
        objectArray[66] = "B\"1oxYK|.t\u0016\t\u0016r#m\u0016R\u000f~:es\u0010\bp.\u0017";
        objectArray[67] = "+#q\t/.c<;\u0000Ww\u001a`{J+yx\">Cj%\u001ae?\u0006;y'01\u0016g\u001e";
        objectArray[68] = "e\u0004Fs7\u007feQ\u000blGydGVz+K0\u0003\f#|\u001c4JH 'm9D\bsG";
        objectArray[69] = "\u0018Y\u0017\u001aX\u0005\u0000U\u0010e\u000en\u0016E\u0004\u001d\u0005\u0007\u001aIC\u0019g\u0002\nH\u0001\u0007\u000e\u000e\u0006\u000f\u0005e";
        objectArray[70] = "~V\"pL\u0005fZ%\u000f\u001an%\u0000}s\u0014\fgEt2HnzT#k\u0016\u0017'Z,7s";
        objectArray[71] = "\f\u007f>w+_P#}l\u0017\u000e\f'd`~\u00025)dpzd\u000581=j\r\u001b ?d\u0017";
        objectArray[72] = "C\u0013Z=MO\u001e\u0010\bbr[\u0017\u00118M84G\u001c\u001c?\u0012EJ\u0012\\lr";
        objectArray[73] = "u\u0004C\t\u0014lqUF\u0012wq\u000f\u0011\u0017\u001c\u0010?p\r\u001f\u001f\u0013";
        objectArray[74] = "#\b?\\\u001cn!\u000buZb2^^t\u000f\u001e8<\u001c1\u0006_d^\u001a!O\u0000!o\u0018\"\u0005\u0006_";
        objectArray[75] = "M}\t`'\u000eFq\u0018'\u001b[*!I8gWR\"\u000bgf2";
        objectArray[76] = "zX\u0014\t\u001eAz\rY\u0016nG{\u001b\u0004\u0000\u0002u/_^YR\"+\u0016\u001aZ\u000eS&\u0018Z\tn";
        objectArray[77] = "kVPgdusZW\u00182\u001e0\u0000\u000fd<|rE\u0006%`\u001e0D\u0006'demGTx[";
        objectArray[78] = "8>H\u000e\u001b;<oM\u0015x%B+\u001c\u001b\u001fh=7\u0014\u0018\u001c";
        objectArray[79] = "(\f{V+w*\t6\u000b\u0016a\u0014\n+_vys_v_f\u000b";
        objectArray[80] = "\u0010n5p\u0017bI5'zI\u0000@Wc,F|N5!iO=\u0012Wc/\u0018fI5:t\nl\u0017W";
        objectArray[81] = " ne\u0006>\t wl\u0002\u0003\u000e\u007fzy\u0011TY '\"}2\u0001}jx\u0017s\u0000a-";
        objectArray[82] = "l0\u0005.\u0011Zn3O(o\u0007\u0011fN}\u0013\fs$\u000btRP\u0011\"\u001b=\r\u0015  \u0018w\u000bk";
        objectArray[83] = "\u0016(E\u001e5\u0014\u00020\u0010\u0015\r\u001f\u0011,\u001bCa-EjA\u001d1z\u0017n\u001cOvE\u0000(\u0014\u0015\r";
        objectArray[84] = "\u000b#OuGBU|\u0015->Mnw\r\"\u000eY\u0007i\u0015,W$";
        objectArray[85] = "?8ENM:p8_Pp?@{\u0001\r\f9\"9D\u0004Me@=AB\u0002c$rAX\u001c^";
        objectArray[86] = "\u0014kb1Ni\u0001d\"hp2\u0003gg`\f4\u0005\n'n\r-Eacr\u0016#\u007f";
        objectArray[87] = "=tG\u0015s'~{M\u0006JqO}\u001bI6\u007f-?^@w#O9N\t(f~;MC.\u0018";
        objectArray[88] = "\u0015@g?C\u0018TA{x&\u0017I]d%J%\u001e\u0010?\u007f&\u001dG^}-\u001d\u001d\\\u00104B";
        objectArray[89] = "\u0013\u001cZw\u0006GN\u0012U+cTuK\u000f\"\u001fY\u0017\tJ+^\u0005uBHr\u0013L\u0010\u0000O|\u0007>";
        objectArray[90] = "Z07)\b\u0010B<0V[{\u0001fh*P\u0019C#ak\f{V$hfJ\u0012H<f?7";
        objectArray[91] = "\u001dBK\"fR\u001d\u0017\u0006=\u0016T\u001c\u0001[+zfHE\u0001r.1L\fEqv@A\u0002\u0005\"\u0016";
        objectArray[92] = "(3fO\u000b\u0010l/}A1\u001d\u007f$g1\nDr(~I\t\u0006-)\u001b";
        objectArray[93] = "\u0001\u0017yjdy\u0014\r|0\u001d#El+{ct\u0018\u001d&u#'x";
        objectArray[94] = ".?'l}E9y/6\u0006\u0017#}:v]\u00179\u0001+fyB{;>i9\u001bE";
        objectArray[95] = "\u001c!h,^\u001a\u0006&\u007fab\u0019\u007f\"5o\u001e\u0017\u001d`pf_K\u007fuwoR\r\u0016koa\u000bp";
        objectArray[96] = "t}v*)o!sfvN6%ed:.Ruru{.#x|5(N";
        objectArray[97] = "}HNcrapV_o\u0000b}N}cdp}2\u00185`quJ\u001bw?p\u0010";
        objectArray[98] = "H\u0019\u0013\r%\u0010AG\f\u0016KB\u0014HhNtK\u0004A\u0010M6\u0014\u0005$\u0006\rz\u001b\u0005M\u0018\u0015tBx";
        objectArray[99] = "Zk\u0000!\u000bWOq\u0005{r\r\u001c\u0010R0\fZCa_>L\t#";
        objectArray[100] = "bF3mgk`Eyk\u0019:\u001f\u0010x>e=}R=7$a\u001fT-~{$.V.4}Z";
        objectArray[101] = "r\u0012\u0019\u0002\u0014q\u007f\f\b\u000efrr\u00147\u0006\u0017\u001d$W\u0014\u0017\u0003e'\u0015K\u0016f";
        objectArray[102] = "m\u0004\u0001\u0005%>dZ\u001e\u001eKd!T\u0000\u00147b'9@\u001a6{gR\u0004\u0006-u]";
        objectArray[103] = "F1+\u001d\"\fI50\u0015S\u0006Ie:\u0004/\u0011^\n`@3\u0000Arc\u0002l\u0001$:&\u001e#\u000eAx!\u00107|";
        Object[] objectArray2 = objectArray;
        objectArray[104] = ">\u001bB^-uq\u001bX@\u0010rAX\u0006\u001dlv#\u001aC\u0014-*A\u001eFRb,%QFH|\u0011";
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = fB.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fB" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'o' || c == 's' || c == '\u00f6' || c == '\u00dc') {
                field = fB.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'o' ? lookup.findGetter(clazz, string2, clazz2) : (c == 's' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f6' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fB.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e0' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        block5: {
            block4: {
                long l = (Long)objectArray[0];
                CallSite callSite = fB.d("\u00e0", (long)3248694561886538676L, (long)l);
                try {
                    fB fB2;
                    try {
                        fB2 = this;
                        if (callSite != null) break block4;
                        if (fB2.q) break block5;
                    }
                    catch (MatchException matchException) {
                        throw fB.d("\u00e0", (Object)matchException, (long)3249066842294025372L, (long)l);
                    }
                    fB.d("\u00e4", (Object)dr_0.c, this::lambda$onEnable$10, (long)3251475102208616118L, (long)l);
                    fB2 = this;
                }
                catch (MatchException matchException) {
                    throw fB.d("\u00e0", (Object)matchException, (long)3249066842294025372L, (long)l);
                }
            }
            fB2.q = 1;
        }
    }

    private boolean d(Object[] objectArray) {
        int n;
        block8: {
            block9: {
                block7: {
                    CallSite callSite;
                    CallSite callSite2;
                    long l;
                    block6: {
                        l = (Long)objectArray[0];
                        l = s ^ l;
                        callSite2 = fB.d("\u00e0", (long)-1237159956076607371L, (long)l);
                        try {
                            try {
                                callSite = fB.d("o", (Object)b, (long)-1240695044065583784L, (long)l);
                                if (callSite2 != null) break block6;
                                if (callSite == null) break block7;
                            }
                            catch (MatchException matchException) {
                                throw fB.d("\u00e0", (Object)matchException, (long)-1236775781092966563L, (long)l);
                            }
                            callSite = fB.d("o", (Object)b, (long)-1240695044065583784L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw fB.d("\u00e0", (Object)matchException, (long)-1236775781092966563L, (long)l);
                        }
                    }
                    try {
                        n = callSite instanceof class_408;
                        if (callSite2 != null) break block8;
                        if (n == 0) break block9;
                    }
                    catch (MatchException matchException) {
                        throw fB.d("\u00e0", (Object)matchException, (long)-1236775781092966563L, (long)l);
                    }
                }
                n = 1;
                break block8;
            }
            n = 0;
        }
        return n != 0;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private Color a(Object[] objectArray) {
        block117: {
            Color color;
            block129: {
                block119: {
                    Object object;
                    block118: {
                        Object object2;
                        long l;
                        block116: {
                            CallSite callSite;
                            long l2;
                            block112: {
                                class_2586 class_25862;
                                block113: {
                                    Color color2;
                                    block128: {
                                        block115: {
                                            Object object3;
                                            block114: {
                                                block108: {
                                                    block109: {
                                                        Color color3;
                                                        block127: {
                                                            block111: {
                                                                Object object4;
                                                                block110: {
                                                                    block104: {
                                                                        block105: {
                                                                            Color color4;
                                                                            block126: {
                                                                                block107: {
                                                                                    Object object5;
                                                                                    block106: {
                                                                                        block100: {
                                                                                            block101: {
                                                                                                Color color5;
                                                                                                block125: {
                                                                                                    block103: {
                                                                                                        Object object6;
                                                                                                        block102: {
                                                                                                            block96: {
                                                                                                                block97: {
                                                                                                                    Color color6;
                                                                                                                    block124: {
                                                                                                                        block99: {
                                                                                                                            Object object7;
                                                                                                                            block98: {
                                                                                                                                block92: {
                                                                                                                                    block93: {
                                                                                                                                        Color color7;
                                                                                                                                        block123: {
                                                                                                                                            block95: {
                                                                                                                                                Object object8;
                                                                                                                                                block94: {
                                                                                                                                                    block88: {
                                                                                                                                                        block89: {
                                                                                                                                                            Color color8;
                                                                                                                                                            block122: {
                                                                                                                                                                block91: {
                                                                                                                                                                    Object object9;
                                                                                                                                                                    block90: {
                                                                                                                                                                        block84: {
                                                                                                                                                                            block85: {
                                                                                                                                                                                Color color9;
                                                                                                                                                                                block121: {
                                                                                                                                                                                    block87: {
                                                                                                                                                                                        Object object10;
                                                                                                                                                                                        block86: {
                                                                                                                                                                                            block80: {
                                                                                                                                                                                                block81: {
                                                                                                                                                                                                    Color color10;
                                                                                                                                                                                                    block120: {
                                                                                                                                                                                                        block83: {
                                                                                                                                                                                                            Object object11;
                                                                                                                                                                                                            block82: {
                                                                                                                                                                                                                class_25862 = (class_2586)objectArray[0];
                                                                                                                                                                                                                l = (Long)objectArray[1];
                                                                                                                                                                                                                l2 = (l = s ^ l) ^ 0x5D76496CB467L;
                                                                                                                                                                                                                callSite = fB.d("\u00e0", (long)4368109753733257791L, (long)l);
                                                                                                                                                                                                                try {
                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                object2 = class_25862 instanceof class_2646;
                                                                                                                                                                                                                                if (callSite != null) break block80;
                                                                                                                                                                                                                                if (!object2) break block81;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            catch (MatchException matchException) {
                                                                                                                                                                                                                                throw fB.d("\u00e0", (Object)matchException, (long)4367378676319415575L, (long)l);
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            object11 = this.a;
                                                                                                                                                                                                                            if (callSite != null) break block82;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        catch (MatchException matchException) {
                                                                                                                                                                                                                            throw fB.d("\u00e0", (Object)matchException, (long)4367378676319415575L, (long)l);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        Object[] objectArray2 = new Object[2];
                                                                                                                                                                                                                        objectArray2[1] = l2;
                                                                                                                                                                                                                        objectArray2[0] = fB.b("t", (int)28534, (long)(0x5C9E1EC272056199L ^ l));
                                                                                                                                                                                                                        if (fB.d("\u00e4", (Object)object11, (Object)objectArray2, (long)4366951702275731385L, (long)l) == false) break block83;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    catch (MatchException matchException) {
                                                                                                                                                                                                                        throw fB.d("\u00e0", (Object)matchException, (long)4367378676319415575L, (long)l);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    object11 = fB.d("\u00e4", (Object)this.e, (long)4368373582679777647L, (long)l);
                                                                                                                                                                                                                }
                                                                                                                                                                                                                catch (MatchException matchException) {
                                                                                                                                                                                                                    throw fB.d("\u00e0", (Object)matchException, (long)4367378676319415575L, (long)l);
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            color10 = (Color)object11;
                                                                                                                                                                                                            break block120;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        color10 = null;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    return color10;
                                                                                                                                                                                                }
                                                                                                                                                                                                object2 = class_25862 instanceof class_2595;
                                                                                                                                                                                            }
                                                                                                                                                                                            try {
                                                                                                                                                                                                try {
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            if (callSite != null) break block84;
                                                                                                                                                                                                            if (!object2) break block85;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        catch (MatchException matchException) {
                                                                                                                                                                                                            throw fB.d("\u00e0", (Object)matchException, (long)4367378676319415575L, (long)l);
                                                                                                                                                                                                        }
                                                                                                                                                                                                        object10 = this.a;
                                                                                                                                                                                                        if (callSite != null) break block86;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    catch (MatchException matchException) {
                                                                                                                                                                                                        throw fB.d("\u00e0", (Object)matchException, (long)4367378676319415575L, (long)l);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    Object[] objectArray3 = new Object[2];
                                                                                                                                                                                                    objectArray3[1] = l2;
                                                                                                                                                                                                    objectArray3[0] = fB.b("t", (int)14420, (long)(0x3EC46151FE6136ABL ^ l));
                                                                                                                                                                                                    if (fB.d("\u00e4", (Object)object10, (Object)objectArray3, (long)4366951702275731385L, (long)l) == false) break block87;
                                                                                                                                                                                                }
                                                                                                                                                                                                catch (MatchException matchException) {
                                                                                                                                                                                                    throw fB.d("\u00e0", (Object)matchException, (long)4367378676319415575L, (long)l);
                                                                                                                                                                                                }
                                                                                                                                                                                                object10 = fB.d("\u00e4", (Object)this.c, (long)4368373582679777647L, (long)l);
                                                                                                                                                                                            }
                                                                                                                                                                                            catch (MatchException matchException) {
                                                                                                                                                                                                throw fB.d("\u00e0", (Object)matchException, (long)4367378676319415575L, (long)l);
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                        color9 = (Color)object10;
                                                                                                                                                                                        break block121;
                                                                                                                                                                                    }
                                                                                                                                                                                    color9 = null;
                                                                                                                                                                                }
                                                                                                                                                                                return color9;
                                                                                                                                                                            }
                                                                                                                                                                            object2 = class_25862 instanceof class_2611;
                                                                                                                                                                        }
                                                                                                                                                                        try {
                                                                                                                                                                            try {
                                                                                                                                                                                try {
                                                                                                                                                                                    try {
                                                                                                                                                                                        if (callSite != null) break block88;
                                                                                                                                                                                        if (!object2) break block89;
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (MatchException matchException) {
                                                                                                                                                                                        throw fB.d("\u00e0", (Object)matchException, (long)4367378676319415575L, (long)l);
                                                                                                                                                                                    }
                                                                                                                                                                                    object9 = this.a;
                                                                                                                                                                                    if (callSite != null) break block90;
                                                                                                                                                                                }
                                                                                                                                                                                catch (MatchException matchException) {
                                                                                                                                                                                    throw fB.d("\u00e0", (Object)matchException, (long)4367378676319415575L, (long)l);
                                                                                                                                                                                }
                                                                                                                                                                                Object[] objectArray4 = new Object[2];
                                                                                                                                                                                objectArray4[1] = l2;
                                                                                                                                                                                objectArray4[0] = fB.b("t", (int)4879, (long)(0x423B92B74E8E9DF2L ^ l));
                                                                                                                                                                                if (fB.d("\u00e4", (Object)object9, (Object)objectArray4, (long)4366951702275731385L, (long)l) == false) break block91;
                                                                                                                                                                            }
                                                                                                                                                                            catch (MatchException matchException) {
                                                                                                                                                                                throw fB.d("\u00e0", (Object)matchException, (long)4367378676319415575L, (long)l);
                                                                                                                                                                            }
                                                                                                                                                                            object9 = fB.d("\u00e4", (Object)this.f, (long)4368373582679777647L, (long)l);
                                                                                                                                                                        }
                                                                                                                                                                        catch (MatchException matchException) {
                                                                                                                                                                            throw fB.d("\u00e0", (Object)matchException, (long)4367378676319415575L, (long)l);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    color8 = (Color)object9;
                                                                                                                                                                    break block122;
                                                                                                                                                                }
                                                                                                                                                                color8 = null;
                                                                                                                                                            }
                                                                                                                                                            return color8;
                                                                                                                                                        }
                                                                                                                                                        object2 = class_25862 instanceof class_2627;
                                                                                                                                                    }
                                                                                                                                                    try {
                                                                                                                                                        try {
                                                                                                                                                            try {
                                                                                                                                                                try {
                                                                                                                                                                    if (callSite != null) break block92;
                                                                                                                                                                    if (!object2) break block93;
                                                                                                                                                                }
                                                                                                                                                                catch (MatchException matchException) {
                                                                                                                                                                    throw fB.d("\u00e0", (Object)matchException, (long)4367378676319415575L, (long)l);
                                                                                                                                                                }
                                                                                                                                                                object8 = this.a;
                                                                                                                                                                if (callSite != null) break block94;
                                                                                                                                                            }
                                                                                                                                                            catch (MatchException matchException) {
                                                                                                                                                                throw fB.d("\u00e0", (Object)matchException, (long)4367378676319415575L, (long)l);
                                                                                                                                                            }
                                                                                                                                                            Object[] objectArray5 = new Object[2];
                                                                                                                                                            objectArray5[1] = l2;
                                                                                                                                                            objectArray5[0] = fB.b("t", (int)7345, (long)(0x1D745DF7CECE1249L ^ l));
                                                                                                                                                            if (fB.d("\u00e4", (Object)object8, (Object)objectArray5, (long)4366951702275731385L, (long)l) == false) break block95;
                                                                                                                                                        }
                                                                                                                                                        catch (MatchException matchException) {
                                                                                                                                                            throw fB.d("\u00e0", (Object)matchException, (long)4367378676319415575L, (long)l);
                                                                                                                                                        }
                                                                                                                                                        object8 = fB.d("\u00e4", (Object)this.g, (long)4368373582679777647L, (long)l);
                                                                                                                                                    }
                                                                                                                                                    catch (MatchException matchException) {
                                                                                                                                                        throw fB.d("\u00e0", (Object)matchException, (long)4367378676319415575L, (long)l);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                color7 = (Color)object8;
                                                                                                                                                break block123;
                                                                                                                                            }
                                                                                                                                            color7 = null;
                                                                                                                                        }
                                                                                                                                        return color7;
                                                                                                                                    }
                                                                                                                                    object2 = class_25862 instanceof class_3719;
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                if (callSite != null) break block96;
                                                                                                                                                if (!object2) break block97;
                                                                                                                                            }
                                                                                                                                            catch (MatchException matchException) {
                                                                                                                                                throw fB.d("\u00e0", (Object)matchException, (long)4367378676319415575L, (long)l);
                                                                                                                                            }
                                                                                                                                            object7 = this.a;
                                                                                                                                            if (callSite != null) break block98;
                                                                                                                                        }
                                                                                                                                        catch (MatchException matchException) {
                                                                                                                                            throw fB.d("\u00e0", (Object)matchException, (long)4367378676319415575L, (long)l);
                                                                                                                                        }
                                                                                                                                        Object[] objectArray6 = new Object[2];
                                                                                                                                        objectArray6[1] = l2;
                                                                                                                                        objectArray6[0] = fB.b("t", (int)8939, (long)(0x10002104E8A92C1DL ^ l));
                                                                                                                                        if (fB.d("\u00e4", (Object)object7, (Object)objectArray6, (long)4366951702275731385L, (long)l) == false) break block99;
                                                                                                                                    }
                                                                                                                                    catch (MatchException matchException) {
                                                                                                                                        throw fB.d("\u00e0", (Object)matchException, (long)4367378676319415575L, (long)l);
                                                                                                                                    }
                                                                                                                                    object7 = fB.d("\u00e4", (Object)this.h, (long)4368373582679777647L, (long)l);
                                                                                                                                }
                                                                                                                                catch (MatchException matchException) {
                                                                                                                                    throw fB.d("\u00e0", (Object)matchException, (long)4367378676319415575L, (long)l);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            color6 = (Color)object7;
                                                                                                                            break block124;
                                                                                                                        }
                                                                                                                        color6 = null;
                                                                                                                    }
                                                                                                                    return color6;
                                                                                                                }
                                                                                                                object2 = class_25862 instanceof class_2614;
                                                                                                            }
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            if (callSite != null) break block100;
                                                                                                                            if (!object2) break block101;
                                                                                                                        }
                                                                                                                        catch (MatchException matchException) {
                                                                                                                            throw fB.d("\u00e0", (Object)matchException, (long)4367378676319415575L, (long)l);
                                                                                                                        }
                                                                                                                        object6 = this.a;
                                                                                                                        if (callSite != null) break block102;
                                                                                                                    }
                                                                                                                    catch (MatchException matchException) {
                                                                                                                        throw fB.d("\u00e0", (Object)matchException, (long)4367378676319415575L, (long)l);
                                                                                                                    }
                                                                                                                    Object[] objectArray7 = new Object[2];
                                                                                                                    objectArray7[1] = l2;
                                                                                                                    objectArray7[0] = fB.b("t", (int)25885, (long)(0x5765FC874C8A6BE8L ^ l));
                                                                                                                    if (fB.d("\u00e4", (Object)object6, (Object)objectArray7, (long)4366951702275731385L, (long)l) == false) break block103;
                                                                                                                }
                                                                                                                catch (MatchException matchException) {
                                                                                                                    throw fB.d("\u00e0", (Object)matchException, (long)4367378676319415575L, (long)l);
                                                                                                                }
                                                                                                                object6 = fB.d("\u00e4", (Object)this.i, (long)4368373582679777647L, (long)l);
                                                                                                            }
                                                                                                            catch (MatchException matchException) {
                                                                                                                throw fB.d("\u00e0", (Object)matchException, (long)4367378676319415575L, (long)l);
                                                                                                            }
                                                                                                        }
                                                                                                        color5 = (Color)object6;
                                                                                                        break block125;
                                                                                                    }
                                                                                                    color5 = null;
                                                                                                }
                                                                                                return color5;
                                                                                            }
                                                                                            object2 = class_25862 instanceof class_2608;
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        if (callSite != null) break block104;
                                                                                                        if (!object2) break block105;
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw fB.d("\u00e0", (Object)matchException, (long)4367378676319415575L, (long)l);
                                                                                                    }
                                                                                                    object5 = this.a;
                                                                                                    if (callSite != null) break block106;
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw fB.d("\u00e0", (Object)matchException, (long)4367378676319415575L, (long)l);
                                                                                                }
                                                                                                Object[] objectArray8 = new Object[2];
                                                                                                objectArray8[1] = l2;
                                                                                                objectArray8[0] = fB.b("t", (int)26233, (long)(0x6F2F7F6C274EE888L ^ l));
                                                                                                if (fB.d("\u00e4", (Object)object5, (Object)objectArray8, (long)4366951702275731385L, (long)l) == false) break block107;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw fB.d("\u00e0", (Object)matchException, (long)4367378676319415575L, (long)l);
                                                                                            }
                                                                                            object5 = fB.d("\u00e4", (Object)this.k, (long)4368373582679777647L, (long)l);
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw fB.d("\u00e0", (Object)matchException, (long)4367378676319415575L, (long)l);
                                                                                        }
                                                                                    }
                                                                                    color4 = (Color)object5;
                                                                                    break block126;
                                                                                }
                                                                                color4 = null;
                                                                            }
                                                                            return color4;
                                                                        }
                                                                        object2 = class_25862 instanceof class_2601;
                                                                    }
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (callSite != null) break block108;
                                                                                    if (!object2) break block109;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw fB.d("\u00e0", (Object)matchException, (long)4367378676319415575L, (long)l);
                                                                                }
                                                                                object4 = this.a;
                                                                                if (callSite != null) break block110;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw fB.d("\u00e0", (Object)matchException, (long)4367378676319415575L, (long)l);
                                                                            }
                                                                            Object[] objectArray9 = new Object[2];
                                                                            objectArray9[1] = l2;
                                                                            objectArray9[0] = fB.b("t", (int)26776, (long)(0x5C0929A89EF06663L ^ l));
                                                                            if (fB.d("\u00e4", (Object)object4, (Object)objectArray9, (long)4366951702275731385L, (long)l) == false) break block111;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw fB.d("\u00e0", (Object)matchException, (long)4367378676319415575L, (long)l);
                                                                        }
                                                                        object4 = fB.d("\u00e4", (Object)this.j, (long)4368373582679777647L, (long)l);
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw fB.d("\u00e0", (Object)matchException, (long)4367378676319415575L, (long)l);
                                                                    }
                                                                }
                                                                color3 = (Color)object4;
                                                                break block127;
                                                            }
                                                            color3 = null;
                                                        }
                                                        return color3;
                                                    }
                                                    object2 = class_25862 instanceof class_2609;
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (callSite != null) break block112;
                                                                if (!object2) break block113;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw fB.d("\u00e0", (Object)matchException, (long)4367378676319415575L, (long)l);
                                                            }
                                                            object3 = this.a;
                                                            if (callSite != null) break block114;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw fB.d("\u00e0", (Object)matchException, (long)4367378676319415575L, (long)l);
                                                        }
                                                        Object[] objectArray10 = new Object[2];
                                                        objectArray10[1] = l2;
                                                        objectArray10[0] = fB.b("t", (int)16059, (long)(0x3C4962D6BD2C3041L ^ l));
                                                        if (fB.d("\u00e4", (Object)object3, (Object)objectArray10, (long)4366951702275731385L, (long)l) == false) break block115;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw fB.d("\u00e0", (Object)matchException, (long)4367378676319415575L, (long)l);
                                                    }
                                                    object3 = fB.d("\u00e4", (Object)this.l, (long)4368373582679777647L, (long)l);
                                                }
                                                catch (MatchException matchException) {
                                                    throw fB.d("\u00e0", (Object)matchException, (long)4367378676319415575L, (long)l);
                                                }
                                            }
                                            color2 = (Color)object3;
                                            break block128;
                                        }
                                        color2 = null;
                                    }
                                    return color2;
                                }
                                object2 = class_25862 instanceof class_2589;
                            }
                            try {
                                try {
                                    try {
                                        if (callSite != null) break block116;
                                        if (!object2) break block117;
                                    }
                                    catch (MatchException matchException) {
                                        throw fB.d("\u00e0", (Object)matchException, (long)4367378676319415575L, (long)l);
                                    }
                                    object = this.a;
                                    if (callSite != null) break block118;
                                }
                                catch (MatchException matchException) {
                                    throw fB.d("\u00e0", (Object)matchException, (long)4367378676319415575L, (long)l);
                                }
                                Object[] objectArray11 = new Object[2];
                                objectArray11[1] = l2;
                                objectArray11[0] = fB.b("t", (int)19087, (long)(0x55A21629F5864476L ^ l));
                                object2 = fB.d("\u00e4", (Object)object, (Object)objectArray11, (long)4366951702275731385L, (long)l);
                            }
                            catch (MatchException matchException) {
                                throw fB.d("\u00e0", (Object)matchException, (long)4367378676319415575L, (long)l);
                            }
                        }
                        try {
                            if (!object2) break block119;
                            object = fB.d("\u00e4", (Object)this.m, (long)4368373582679777647L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw fB.d("\u00e0", (Object)matchException, (long)4367378676319415575L, (long)l);
                        }
                    }
                    color = (Color)object;
                    break block129;
                }
                color = null;
            }
            return color;
        }
        return null;
    }

    private static synchronized fZ a(Object[] objectArray) {
        fZ fZ2;
        block4: {
            block5: {
                long l = (Long)objectArray[0];
                long l2 = (l = s ^ l) ^ 0x41E61FDE4C43L;
                CallSite callSite = fB.d("\u00e0", (long)2668867823700837288L, (long)l);
                try {
                    try {
                        fZ2 = p;
                        if (callSite != null) break block4;
                        if (fZ2 != null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw fB.d("\u00e0", (Object)matchException, (long)2669251723892782208L, (long)l);
                    }
                    p = new fZ(l2);
                }
                catch (MatchException matchException) {
                    throw fB.d("\u00e0", (Object)matchException, (long)2669251723892782208L, (long)l);
                }
            }
            fZ2 = p;
        }
        return fZ2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @bP
    public void a(bt_0 bt_02) {
        CallSite callSite;
        long l;
        block18: {
            class_310 class_3102;
            CallSite callSite2;
            long l2;
            long l3;
            long l4;
            long l5;
            long l6;
            long l7;
            long l8;
            long l9;
            long l10;
            block17: {
                long l11 = l = s ^ 0x40B5DCFF8BA1L;
                l10 = l11 ^ 0x2B781D726566L;
                l9 = l11 ^ 0x215D465E7AF5L;
                l8 = l11 ^ 0x2AE606E16F39L;
                l7 = l11 ^ 0x26FE8816FEL;
                l6 = l11 ^ 0x5263814437C0L;
                l5 = l11 ^ 0x4695E4CEC219L;
                l4 = l11 ^ 0x2BCE3AEDAEBBL;
                l3 = l11 ^ 0x11C3F84FEF6FL;
                l2 = l11 ^ 0x785D42D2E683L;
                callSite2 = fB.d("\u00e0", (long)4482654043979880596L, (long)l);
                try {
                    try {
                        class_3102 = b;
                        if (callSite2 != null) break block17;
                        if (fB.d("o", (Object)class_3102, (long)4481650767685478056L, (long)l) == null) return;
                    }
                    catch (MatchException matchException) {
                        throw fB.d("\u00e0", (Object)matchException, (long)4483115122787708860L, (long)l);
                    }
                    class_3102 = b;
                }
                catch (MatchException matchException) {
                    throw fB.d("\u00e0", (Object)matchException, (long)4483115122787708860L, (long)l);
                }
            }
            try {
                if (fB.d("o", (Object)class_3102, (long)4479053513365030424L, (long)l) == null) {
                    return;
                }
            }
            catch (MatchException matchException) {
                throw fB.d("\u00e0", (Object)matchException, (long)4483115122787708860L, (long)l);
            }
            try {
                Object[] objectArray = new Object[1];
                objectArray[0] = l10;
                if (fB.d("\u00e4", (Object)this, (Object)objectArray, (long)4481331236785915277L, (long)l) == false) {
                    return;
                }
            }
            catch (MatchException matchException) {
                throw fB.d("\u00e0", (Object)matchException, (long)4483115122787708860L, (long)l);
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l4;
            CallSite callSite3 = fB.d("\u00e0", (Object)objectArray, (long)4483290166409756616L, (long)l);
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l3;
            CallSite callSite4 = fB.d("\u00e4", (Object)callSite3, (Object)objectArray2, (long)4479002209644706018L, (long)l);
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l2;
            objectArray3[0] = callSite4;
            callSite = fB.d("\u00e4", (Object)bt_02.a, (Object)objectArray3, (long)4482079826928077082L, (long)l);
            Matrix4f matrix4f = new Matrix4f();
            boolean bl = false;
            Object[] objectArray4 = new Object[1];
            objectArray4[0] = l9;
            fB.d("\u00e4", (Object)callSite, (Object)objectArray4, (long)4484555384582219541L, (long)l);
            CallSite callSite5 = fB.d("\u00e4", (Object)this.r, (long)4485515694648394094L, (long)l);
            while (fB.d("\u00e4", (Object)callSite5, (long)4479361026308991936L, (long)l) != false) {
                gW gW2 = (gW)((Object)fB.d("\u00e4", (Object)callSite5, (long)4481483237322318303L, (long)l));
                CallSite callSite6 = fB.d("\u00e4", (Object)gW2, (long)4478918130905856955L, (long)l);
                Object[] objectArray5 = new Object[5];
                objectArray5[4] = l8;
                objectArray5[3] = (double)fB.d("\u00e4", (Object)gW2, (long)4485192568359202750L, (long)l);
                objectArray5[2] = (double)fB.d("\u00e4", (Object)gW2, (long)4482847110277603913L, (long)l);
                objectArray5[1] = (double)fB.d("\u00e4", (Object)gW2, (long)4481432967704211820L, (long)l);
                objectArray5[0] = bt_02.b;
                CallSite callSite7 = fB.d("\u00e0", (Object)objectArray5, (long)4482812849639546143L, (long)l);
                Object[] objectArray6 = new Object[5];
                objectArray6[4] = l8;
                objectArray6[3] = (double)((float)fB.d("\u00e4", (Object)gW2, (long)4485192568359202750L, (long)l) + 1.0f);
                objectArray6[2] = (double)((float)fB.d("\u00e4", (Object)gW2, (long)4482847110277603913L, (long)l) + 1.0f);
                objectArray6[1] = (double)((float)fB.d("\u00e4", (Object)gW2, (long)4481432967704211820L, (long)l) + 1.0f);
                objectArray6[0] = bt_02.b;
                CallSite callSite8 = fB.d("\u00e0", (Object)objectArray6, (long)4482812849639546143L, (long)l);
                float f = (float)fB.d("o", (Object)callSite7, (long)4479215561648335097L, (long)l);
                float f10 = (float)fB.d("o", (Object)callSite7, (long)4482756059506230080L, (long)l);
                float f11 = (float)fB.d("o", (Object)callSite7, (long)4482265407865517062L, (long)l);
                float f12 = (float)fB.d("o", (Object)callSite8, (long)4479215561648335097L, (long)l);
                float f13 = (float)fB.d("o", (Object)callSite8, (long)4482756059506230080L, (long)l);
                float f14 = (float)fB.d("o", (Object)callSite8, (long)4482265407865517062L, (long)l);
                Object[] objectArray7 = new Object[5];
                objectArray7[4] = l6;
                objectArray7[3] = Float.valueOf(f11);
                objectArray7[2] = Float.valueOf(f13);
                objectArray7[1] = Float.valueOf(f);
                objectArray7[0] = matrix4f;
                Object[] objectArray8 = new Object[2];
                objectArray8[1] = l7;
                objectArray8[0] = (int)callSite6;
                Object[] objectArray9 = new Object[5];
                objectArray9[4] = l6;
                objectArray9[3] = Float.valueOf(f14);
                objectArray9[2] = Float.valueOf(f13);
                objectArray9[1] = Float.valueOf(f);
                objectArray9[0] = matrix4f;
                Object[] objectArray10 = new Object[2];
                objectArray10[1] = l7;
                objectArray10[0] = (int)callSite6;
                Object[] objectArray11 = new Object[5];
                objectArray11[4] = l6;
                objectArray11[3] = Float.valueOf(f14);
                objectArray11[2] = Float.valueOf(f13);
                objectArray11[1] = Float.valueOf(f12);
                objectArray11[0] = matrix4f;
                Object[] objectArray12 = new Object[2];
                objectArray12[1] = l7;
                objectArray12[0] = (int)callSite6;
                Object[] objectArray13 = new Object[5];
                objectArray13[4] = l6;
                objectArray13[3] = Float.valueOf(f11);
                objectArray13[2] = Float.valueOf(f13);
                objectArray13[1] = Float.valueOf(f12);
                objectArray13[0] = matrix4f;
                Object[] objectArray14 = new Object[2];
                objectArray14[1] = l7;
                objectArray14[0] = (int)callSite6;
                Object[] objectArray15 = new Object[5];
                objectArray15[4] = l6;
                objectArray15[3] = Float.valueOf(f11);
                objectArray15[2] = Float.valueOf(f10);
                objectArray15[1] = Float.valueOf(f);
                objectArray15[0] = matrix4f;
                Object[] objectArray16 = new Object[2];
                objectArray16[1] = l7;
                objectArray16[0] = (int)callSite6;
                Object[] objectArray17 = new Object[5];
                objectArray17[4] = l6;
                objectArray17[3] = Float.valueOf(f11);
                objectArray17[2] = Float.valueOf(f10);
                objectArray17[1] = Float.valueOf(f12);
                objectArray17[0] = matrix4f;
                Object[] objectArray18 = new Object[2];
                objectArray18[1] = l7;
                objectArray18[0] = (int)callSite6;
                Object[] objectArray19 = new Object[5];
                objectArray19[4] = l6;
                objectArray19[3] = Float.valueOf(f14);
                objectArray19[2] = Float.valueOf(f10);
                objectArray19[1] = Float.valueOf(f12);
                objectArray19[0] = matrix4f;
                Object[] objectArray20 = new Object[2];
                objectArray20[1] = l7;
                objectArray20[0] = (int)callSite6;
                Object[] objectArray21 = new Object[5];
                objectArray21[4] = l6;
                objectArray21[3] = Float.valueOf(f14);
                objectArray21[2] = Float.valueOf(f10);
                objectArray21[1] = Float.valueOf(f);
                objectArray21[0] = matrix4f;
                Object[] objectArray22 = new Object[2];
                objectArray22[1] = l7;
                objectArray22[0] = (int)callSite6;
                Object[] objectArray23 = new Object[5];
                objectArray23[4] = l6;
                objectArray23[3] = Float.valueOf(f14);
                objectArray23[2] = Float.valueOf(f10);
                objectArray23[1] = Float.valueOf(f);
                objectArray23[0] = matrix4f;
                Object[] objectArray24 = new Object[2];
                objectArray24[1] = l7;
                objectArray24[0] = (int)callSite6;
                Object[] objectArray25 = new Object[5];
                objectArray25[4] = l6;
                objectArray25[3] = Float.valueOf(f14);
                objectArray25[2] = Float.valueOf(f10);
                objectArray25[1] = Float.valueOf(f12);
                objectArray25[0] = matrix4f;
                Object[] objectArray26 = new Object[2];
                objectArray26[1] = l7;
                objectArray26[0] = (int)callSite6;
                Object[] objectArray27 = new Object[5];
                objectArray27[4] = l6;
                objectArray27[3] = Float.valueOf(f14);
                objectArray27[2] = Float.valueOf(f13);
                objectArray27[1] = Float.valueOf(f12);
                objectArray27[0] = matrix4f;
                Object[] objectArray28 = new Object[2];
                objectArray28[1] = l7;
                objectArray28[0] = (int)callSite6;
                Object[] objectArray29 = new Object[5];
                objectArray29[4] = l6;
                objectArray29[3] = Float.valueOf(f14);
                objectArray29[2] = Float.valueOf(f13);
                objectArray29[1] = Float.valueOf(f);
                objectArray29[0] = matrix4f;
                Object[] objectArray30 = new Object[2];
                objectArray30[1] = l7;
                objectArray30[0] = (int)callSite6;
                Object[] objectArray31 = new Object[5];
                objectArray31[4] = l6;
                objectArray31[3] = Float.valueOf(f11);
                objectArray31[2] = Float.valueOf(f10);
                objectArray31[1] = Float.valueOf(f);
                objectArray31[0] = matrix4f;
                Object[] objectArray32 = new Object[2];
                objectArray32[1] = l7;
                objectArray32[0] = (int)callSite6;
                Object[] objectArray33 = new Object[5];
                objectArray33[4] = l6;
                objectArray33[3] = Float.valueOf(f11);
                objectArray33[2] = Float.valueOf(f13);
                objectArray33[1] = Float.valueOf(f);
                objectArray33[0] = matrix4f;
                Object[] objectArray34 = new Object[2];
                objectArray34[1] = l7;
                objectArray34[0] = (int)callSite6;
                Object[] objectArray35 = new Object[5];
                objectArray35[4] = l6;
                objectArray35[3] = Float.valueOf(f11);
                objectArray35[2] = Float.valueOf(f13);
                objectArray35[1] = Float.valueOf(f12);
                objectArray35[0] = matrix4f;
                Object[] objectArray36 = new Object[2];
                objectArray36[1] = l7;
                objectArray36[0] = (int)callSite6;
                Object[] objectArray37 = new Object[5];
                objectArray37[4] = l6;
                objectArray37[3] = Float.valueOf(f11);
                objectArray37[2] = Float.valueOf(f10);
                objectArray37[1] = Float.valueOf(f12);
                objectArray37[0] = matrix4f;
                Object[] objectArray38 = new Object[2];
                objectArray38[1] = l7;
                objectArray38[0] = (int)callSite6;
                Object[] objectArray39 = new Object[5];
                objectArray39[4] = l6;
                objectArray39[3] = Float.valueOf(f11);
                objectArray39[2] = Float.valueOf(f10);
                objectArray39[1] = Float.valueOf(f);
                objectArray39[0] = matrix4f;
                Object[] objectArray40 = new Object[2];
                objectArray40[1] = l7;
                objectArray40[0] = (int)callSite6;
                Object[] objectArray41 = new Object[5];
                objectArray41[4] = l6;
                objectArray41[3] = Float.valueOf(f14);
                objectArray41[2] = Float.valueOf(f10);
                objectArray41[1] = Float.valueOf(f);
                objectArray41[0] = matrix4f;
                Object[] objectArray42 = new Object[2];
                objectArray42[1] = l7;
                objectArray42[0] = (int)callSite6;
                Object[] objectArray43 = new Object[5];
                objectArray43[4] = l6;
                objectArray43[3] = Float.valueOf(f14);
                objectArray43[2] = Float.valueOf(f13);
                objectArray43[1] = Float.valueOf(f);
                objectArray43[0] = matrix4f;
                Object[] objectArray44 = new Object[2];
                objectArray44[1] = l7;
                objectArray44[0] = (int)callSite6;
                Object[] objectArray45 = new Object[5];
                objectArray45[4] = l6;
                objectArray45[3] = Float.valueOf(f11);
                objectArray45[2] = Float.valueOf(f13);
                objectArray45[1] = Float.valueOf(f);
                objectArray45[0] = matrix4f;
                Object[] objectArray46 = new Object[2];
                objectArray46[1] = l7;
                objectArray46[0] = (int)callSite6;
                Object[] objectArray47 = new Object[5];
                objectArray47[4] = l6;
                objectArray47[3] = Float.valueOf(f11);
                objectArray47[2] = Float.valueOf(f10);
                objectArray47[1] = Float.valueOf(f12);
                objectArray47[0] = matrix4f;
                Object[] objectArray48 = new Object[2];
                objectArray48[1] = l7;
                objectArray48[0] = (int)callSite6;
                Object[] objectArray49 = new Object[5];
                objectArray49[4] = l6;
                objectArray49[3] = Float.valueOf(f11);
                objectArray49[2] = Float.valueOf(f13);
                objectArray49[1] = Float.valueOf(f12);
                objectArray49[0] = matrix4f;
                Object[] objectArray50 = new Object[2];
                objectArray50[1] = l7;
                objectArray50[0] = (int)callSite6;
                Object[] objectArray51 = new Object[5];
                objectArray51[4] = l6;
                objectArray51[3] = Float.valueOf(f14);
                objectArray51[2] = Float.valueOf(f13);
                objectArray51[1] = Float.valueOf(f12);
                objectArray51[0] = matrix4f;
                Object[] objectArray52 = new Object[2];
                objectArray52[1] = l7;
                objectArray52[0] = (int)callSite6;
                Object[] objectArray53 = new Object[5];
                objectArray53[4] = l6;
                objectArray53[3] = Float.valueOf(f14);
                objectArray53[2] = Float.valueOf(f10);
                objectArray53[1] = Float.valueOf(f12);
                objectArray53[0] = matrix4f;
                Object[] objectArray54 = new Object[2];
                objectArray54[1] = l7;
                objectArray54[0] = (int)callSite6;
                fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)callSite, (Object)objectArray7, (long)4481888064262456406L, (long)l), (Object)objectArray8, (long)4482453112185537986L, (long)l), (Object)objectArray9, (long)4481888064262456406L, (long)l), (Object)objectArray10, (long)4482453112185537986L, (long)l), (Object)objectArray11, (long)4481888064262456406L, (long)l), (Object)objectArray12, (long)4482453112185537986L, (long)l), (Object)objectArray13, (long)4481888064262456406L, (long)l), (Object)objectArray14, (long)4482453112185537986L, (long)l), (Object)objectArray15, (long)4481888064262456406L, (long)l), (Object)objectArray16, (long)4482453112185537986L, (long)l), (Object)objectArray17, (long)4481888064262456406L, (long)l), (Object)objectArray18, (long)4482453112185537986L, (long)l), (Object)objectArray19, (long)4481888064262456406L, (long)l), (Object)objectArray20, (long)4482453112185537986L, (long)l), (Object)objectArray21, (long)4481888064262456406L, (long)l), (Object)objectArray22, (long)4482453112185537986L, (long)l), (Object)objectArray23, (long)4481888064262456406L, (long)l), (Object)objectArray24, (long)4482453112185537986L, (long)l), (Object)objectArray25, (long)4481888064262456406L, (long)l), (Object)objectArray26, (long)4482453112185537986L, (long)l), (Object)objectArray27, (long)4481888064262456406L, (long)l), (Object)objectArray28, (long)4482453112185537986L, (long)l), (Object)objectArray29, (long)4481888064262456406L, (long)l), (Object)objectArray30, (long)4482453112185537986L, (long)l), (Object)objectArray31, (long)4481888064262456406L, (long)l), (Object)objectArray32, (long)4482453112185537986L, (long)l), (Object)objectArray33, (long)4481888064262456406L, (long)l), (Object)objectArray34, (long)4482453112185537986L, (long)l), (Object)objectArray35, (long)4481888064262456406L, (long)l), (Object)objectArray36, (long)4482453112185537986L, (long)l), (Object)objectArray37, (long)4481888064262456406L, (long)l), (Object)objectArray38, (long)4482453112185537986L, (long)l), (Object)objectArray39, (long)4481888064262456406L, (long)l), (Object)objectArray40, (long)4482453112185537986L, (long)l), (Object)objectArray41, (long)4481888064262456406L, (long)l), (Object)objectArray42, (long)4482453112185537986L, (long)l), (Object)objectArray43, (long)4481888064262456406L, (long)l), (Object)objectArray44, (long)4482453112185537986L, (long)l), (Object)objectArray45, (long)4481888064262456406L, (long)l), (Object)objectArray46, (long)4482453112185537986L, (long)l), (Object)objectArray47, (long)4481888064262456406L, (long)l), (Object)objectArray48, (long)4482453112185537986L, (long)l), (Object)objectArray49, (long)4481888064262456406L, (long)l), (Object)objectArray50, (long)4482453112185537986L, (long)l), (Object)objectArray51, (long)4481888064262456406L, (long)l), (Object)objectArray52, (long)4482453112185537986L, (long)l), (Object)objectArray53, (long)4481888064262456406L, (long)l), (Object)objectArray54, (long)4482453112185537986L, (long)l);
                bl = true;
                try {
                    if (callSite2 == null) {
                        if (callSite2 == null) continue;
                        break;
                    }
                    break block18;
                }
                catch (MatchException matchException) {
                    throw fB.d("\u00e0", (Object)matchException, (long)4483115122787708860L, (long)l);
                }
            }
            try {
                if (bl) {
                    Object[] objectArray55 = new Object[2];
                    objectArray55[1] = l5;
                    objectArray55[0] = m_0.QUADS;
                    fB.d("\u00e4", (Object)((bT)((Object)fB.d("\u00e4", (Object)callSite, (Object)objectArray55, (long)4481935348580328754L, (long)l))), (Object)new Object[0], (long)4485429962451016618L, (long)l);
                    if (callSite2 == null) return;
                }
            }
            catch (MatchException matchException) {
                throw fB.d("\u00e0", (Object)matchException, (long)4483115122787708860L, (long)l);
            }
        }
        fB.d("\u00e4", (Object)callSite, (Object)new Object[0], (long)4485429962451016618L, (long)l);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @bP
    public void a(bG bG2) {
        class_310 class_3102;
        CallSite callSite;
        long l;
        long l2;
        long l3;
        long l4;
        block19: {
            block20: {
                block18: {
                    long l5 = l4 = s ^ 0x26FC5C530F51L;
                    l3 = l5 ^ 0xE7E39572456L;
                    l2 = l5 ^ 0x3E227773333AL;
                    l = l5 ^ 0x500F015933DCL;
                    callSite = fB.d("\u00e0", (long)-4988316769366107036L, (long)l4);
                    try {
                        try {
                            class_3102 = b;
                            if (callSite != null) break block18;
                            if (fB.d("o", (Object)class_3102, (long)-4989315583191063976L, (long)l4) == null) return;
                        }
                        catch (MatchException matchException) {
                            throw fB.d("\u00e0", (Object)matchException, (long)-4987913359100875956L, (long)l4);
                        }
                        class_3102 = b;
                    }
                    catch (MatchException matchException) {
                        throw fB.d("\u00e0", (Object)matchException, (long)-4987913359100875956L, (long)l4);
                    }
                }
                try {
                    try {
                        if (callSite != null) break block19;
                        if (fB.d("o", (Object)class_3102, (long)-4983042523154218264L, (long)l4) != null) break block20;
                        return;
                    }
                    catch (MatchException matchException) {
                        throw fB.d("\u00e0", (Object)matchException, (long)-4987913359100875956L, (long)l4);
                    }
                }
                catch (MatchException matchException) {
                    throw fB.d("\u00e0", (Object)matchException, (long)-4987913359100875956L, (long)l4);
                }
            }
            fB.d("\u00e4", (Object)this.r, (long)-4988112634512577608L, (long)l4);
            class_3102 = b;
        }
        CallSite callSite2 = fB.d("\u00e4", (Object)fB.d("o", (Object)class_3102, (long)-4989315583191063976L, (long)l4), (long)-4989921027513102495L, (long)l4);
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        CallSite callSite3 = fB.d("\u00e4", (Object)new E((class_631.class_3681)fB.d("\u00e4", (Object)new D((class_631)callSite2), (Object)objectArray, (long)-4982731885348158403L, (long)l4)), (Object)objectArray2, (long)-4988054618854716981L, (long)l4);
        block12: for (int i = 0; i < fB.d("\u00e4", (Object)callSite3, (long)-4986038683229446986L, (long)l4); ++i) {
            CallSite callSite4 = fB.d("\u00e4", (Object)callSite3, (int)i, (long)-4983099692153869661L, (long)l4);
            block13: while (true) {
                class_2818 class_28182;
                class_2818 class_28183 = class_28182 = (class_2818)callSite4;
                if (callSite == null) {
                    if (class_28183 == null) continue block12;
                    class_28183 = class_28182;
                }
                CallSite callSite5 = fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)fB.d("\u00e4", (Object)class_28183, (long)-4989149688293642688L, (long)l4), (long)-4989563877002520322L, (long)l4), (long)-4988939255520282562L, (long)l4);
                while (fB.d("\u00e4", (Object)callSite5, (long)-4982804902233444560L, (long)l4) != false) {
                    CallSite callSite6;
                    CallSite callSite7;
                    block21: {
                        Map.Entry entry = (Map.Entry)((Object)fB.d("\u00e4", (Object)callSite5, (long)-4989694769541520081L, (long)l4));
                        class_2586 class_25862 = (class_2586)fB.d("\u00e4", (Object)entry, (long)-4985956057333337012L, (long)l4);
                        callSite4 = class_25862;
                        if (callSite != null) continue block13;
                        if (callSite4 == null) continue;
                        Object[] objectArray3 = new Object[2];
                        objectArray3[1] = l;
                        objectArray3[0] = class_25862;
                        callSite7 = fB.d("\u00e4", (Object)this, (Object)objectArray3, (long)-4988508002619058828L, (long)l4);
                        try {
                            callSite6 = callSite7;
                            if (callSite != null) break block21;
                            if (callSite6 == null) {
                                continue;
                            }
                        }
                        catch (MatchException matchException) {
                            throw fB.d("\u00e0", (Object)matchException, (long)-4987913359100875956L, (long)l4);
                        }
                        callSite6 = fB.d("\u00e4", (Object)entry, (long)-4985664745304462433L, (long)l4);
                    }
                    class_2338 class_23382 = (class_2338)callSite6;
                    try {
                        if (class_23382 == null) {
                            continue;
                        }
                    }
                    catch (MatchException matchException) {
                        throw fB.d("\u00e0", (Object)matchException, (long)-4987913359100875956L, (long)l4);
                    }
                    CallSite callSite8 = fB.d("\u00e4", (Object)callSite7, (long)-4988851716667360620L, (long)l4);
                    int n = callSite8 >> fB.c("q", (int)19063, (long)(0x4974FB600607111FL ^ l4)) & fB.c("q", (int)5907, (long)(0x1F71056B60A2CC7AL ^ l4));
                    int n2 = callSite8 >> fB.c("q", (int)30813, (long)(0x30CF22170AE7A330L ^ l4)) & fB.c("q", (int)22400, (long)(0x56E7B78CEED20CEAL ^ l4));
                    int n3 = callSite8 & fB.c("q", (int)22400, (long)(0x56E7B78CEED20CEAL ^ l4));
                    int n4 = fB.c("q", (int)15731, (long)(0x257A3FD9C8FB661FL ^ l4)) | n3 << fB.c("q", (int)25975, (long)(0x7AE71C9D61DE3E18L ^ l4)) | n2 << fB.c("q", (int)3020, (long)(0x51C5A53FF38550A7L ^ l4)) | n;
                    fB.d("\u00e4", (Object)this.r, (Object)new gW((int)fB.d("\u00e4", (Object)class_23382, (long)-4987965821710711534L, (long)l4), (int)fB.d("\u00e4", (Object)class_23382, (long)-4988514114673398991L, (long)l4), (int)fB.d("\u00e4", (Object)class_23382, (long)-4989744249111615466L, (long)l4), n4), (long)-4985873664716859928L, (long)l4);
                    if (callSite == null) continue;
                }
                break;
            }
            if (callSite == null) continue;
        }
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (A[n3] != null) {
            return n3;
        }
        Object object = z[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 42;
            case 1 -> 50;
            case 2 -> 3;
            case 3 -> 48;
            case 4 -> 26;
            case 5 -> 28;
            case 6 -> 37;
            case 7 -> 61;
            case 8 -> 51;
            case 9 -> 39;
            case 10 -> 6;
            case 11 -> 63;
            case 12 -> 35;
            case 13 -> 58;
            case 14 -> 53;
            case 15 -> 34;
            case 16 -> 38;
            case 17 -> 43;
            case 18 -> 16;
            case 19 -> 62;
            case 20 -> 5;
            case 21 -> 15;
            case 22 -> 46;
            case 23 -> 55;
            case 24 -> 12;
            case 25 -> 45;
            case 26 -> 18;
            case 27 -> 1;
            case 28 -> 21;
            case 29 -> 17;
            case 30 -> 9;
            case 31 -> 52;
            case 32 -> 20;
            case 33 -> 59;
            case 34 -> 4;
            case 35 -> 25;
            case 36 -> 29;
            case 37 -> 0;
            case 38 -> 13;
            case 39 -> 8;
            case 40 -> 54;
            case 41 -> 56;
            case 42 -> 31;
            case 43 -> 32;
            case 44 -> 19;
            case 45 -> 10;
            case 46 -> 57;
            case 47 -> 27;
            case 48 -> 14;
            case 49 -> 33;
            case 50 -> 49;
            case 51 -> 44;
            case 52 -> 47;
            case 53 -> 30;
            case 54 -> 36;
            case 55 -> 41;
            case 56 -> 40;
            case 57 -> 2;
            case 58 -> 24;
            case 59 -> 22;
            case 60 -> 60;
            case 61 -> 11;
            case 62 -> 23;
            default -> 7;
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
        fB.A[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = fB.m(l, l2);
        Object object = z[n];
        if (object instanceof String) {
            String string = A[n];
            int n2 = string.indexOf(8);
            Class clazz = fB.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fB.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fB.g(clazz3, string2, clazz2)) != null) {
                    fB.z[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fB.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fB.z[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fB.n(325824329120250L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = fB.m(l, l2);
        Object object = z[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = A[n];
                int n3 = string2.indexOf(8);
                clazz3 = fB.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fB.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fB.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        fB.z[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fB.n(325824329120250L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fB.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fB.z[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fB.n(325824329120250L, 0L);
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

    private boolean lambda$new$0(Color color) {
        long l = s ^ 0x419EBB99A5FEL;
        long l2 = l ^ 0x6EEAFB599893L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = fB.b("t", (int)24123, (long)(0x3A4320856ECFFC22L ^ l));
        return (boolean)fB.d("\u00e4", (Object)this.a, (Object)objectArray, (long)1184082708206945101L, (long)l);
    }

    private boolean lambda$new$2(Color color) {
        long l = s ^ 0x3106F60599E1L;
        long l2 = l ^ 0x1E72B6C5A48CL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = fB.b("t", (int)9487, (long)(0x444AE3D99C7D3B14L ^ l));
        return (boolean)fB.d("\u00e4", (Object)this.a, (Object)objectArray, (long)3202556775400718162L, (long)l);
    }

    private boolean lambda$new$1(Color color) {
        long l = s ^ 0x2CAFDB408D1AL;
        long l2 = l ^ 0x3DB9B80B077L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = fB.b("t", (int)21731, (long)(0x7E1582BA299A5E01L ^ l));
        return (boolean)fB.d("\u00e4", (Object)this.a, (Object)objectArray, (long)4074308242161970089L, (long)l);
    }

    private boolean lambda$new$3(Color color) {
        long l = s ^ 0x1AEF376901C7L;
        long l2 = l ^ 0x359B77A93CAAL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = fB.b("t", (int)14343, (long)(0x689CD6A98801BE34L ^ l));
        return (boolean)fB.d("\u00e4", (Object)this.a, (Object)objectArray, (long)-5451625479672223884L, (long)l);
    }

    private boolean lambda$new$4(Color color) {
        long l = s ^ 0x1B72619DAED7L;
        long l2 = l ^ 0x3406215D93BAL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = fB.b("t", (int)14648, (long)(0x28ED83FCCB451011L ^ l));
        return (boolean)fB.d("\u00e4", (Object)this.a, (Object)objectArray, (long)1965801582727497828L, (long)l);
    }

    private boolean lambda$new$5(Color color) {
        long l = s ^ 0x1F59BC47E6D2L;
        long l2 = l ^ 0x302DFC87DBBFL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = fB.b("t", (int)15645, (long)(0x6D10BD9145D45C32L ^ l));
        return (boolean)fB.d("\u00e4", (Object)this.a, (Object)objectArray, (long)5999615162947321953L, (long)l);
    }

    private boolean lambda$new$9(Color color) {
        long l = s ^ 0x76B4CF342DD8L;
        long l2 = l ^ 0x59C08FF410B5L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = fB.b("t", (int)18031, (long)(0x1C54E3B12549EC53L ^ l));
        return (boolean)fB.d("\u00e4", (Object)this.a, (Object)objectArray, (long)-7473578611913127061L, (long)l);
    }

    private boolean lambda$new$6(Color color) {
        long l = s ^ 0x139648C073F2L;
        long l2 = l ^ 0x3CE208004E9FL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = fB.b("t", (int)2147, (long)(0x667C8CE312547C67L ^ l));
        return (boolean)fB.d("\u00e4", (Object)this.a, (Object)objectArray, (long)-4151501936945638079L, (long)l);
    }

    private boolean lambda$new$8(Color color) {
        long l = s ^ 0x5FCEB7063969L;
        long l2 = l ^ 0x70BAF7C60404L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = fB.b("t", (int)13314, (long)(0x402BF4A2111A0A92L ^ l));
        return (boolean)fB.d("\u00e4", (Object)this.a, (Object)objectArray, (long)-8288406021676458022L, (long)l);
    }

    private boolean lambda$new$7(Color color) {
        long l = s ^ 0x72DF42328617L;
        long l2 = l ^ 0x5DAB02F2BB7AL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = fB.b("t", (int)30599, (long)(0xAEDB71125497676L ^ l));
        return (boolean)fB.d("\u00e4", (Object)this.a, (Object)objectArray, (long)3713085620372938916L, (long)l);
    }

    private void lambda$onEnable$10(aq_0 aq_02, gK gK2) {
        float f;
        float f10;
        int n;
        CallSite callSite;
        CallSite callSite2;
        long l;
        long l2;
        long l3;
        block5: {
            long l4;
            block6: {
                long l5 = l3 = s ^ 0x79F0C31A1CD5L;
                l4 = l5 ^ 0x123D0297F212L;
                l2 = l5 ^ 0x128B250839CFL;
                l = l5 ^ 0x54E9B4CB4E0EL;
                CallSite callSite3 = fB.d("\u00e0", (long)-6250521984023261216L, (long)l3);
                try {
                    callSite2 = fB.d("\u00e4", (Object)this, (long)-6248927645830215807L, (long)l3);
                    if (callSite3 != null) break block5;
                    if (callSite2 != false) break block6;
                }
                catch (MatchException matchException) {
                    throw fB.d("\u00e0", (Object)matchException, (long)-6250151623732692792L, (long)l3);
                }
                return;
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l4;
            callSite2 = fB.d("\u00e4", (Object)this, (Object)objectArray, (long)-6249630408722803975L, (long)l3);
        }
        if (callSite2 == false) {
            return;
        }
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        CallSite callSite4 = fB.d("\u00e0", (Object)objectArray, (long)-6249903496036915012L, (long)l3);
        try {
            callSite = callSite4;
            n = 2;
            f10 = 15.0f;
            f = fB.d("\u00e4", (Object)((Boolean)((Object)fB.d("\u00e4", (Object)this.d, (long)-6250821107392006992L, (long)l3))), (long)-6249995753529490182L, (long)l3) != false ? 0.3f : 0.0f;
        }
        catch (MatchException matchException) {
            throw fB.d("\u00e0", (Object)matchException, (long)-6250151623732692792L, (long)l3);
        }
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l;
        objectArray2[2] = Float.valueOf(f);
        objectArray2[1] = Float.valueOf(f10);
        objectArray2[0] = n;
        fB.d("\u00e4", (Object)callSite, (Object)objectArray2, (long)-6249869783843510600L, (long)l3);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fB.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(fB.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(fB.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


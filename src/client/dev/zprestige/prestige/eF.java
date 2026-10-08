/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_2885
 *  net.minecraft.class_310
 *  net.minecraft.class_3965
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bd_0;
import dev.zprestige.prestige.bh_0;
import dev.zprestige.prestige.dL;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dP;
import dev.zprestige.prestige.dQ;
import dev.zprestige.prestige.dR;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.f5;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.l_0;
import dev.zprestige.prestige.q_0;
import dev.zprestige.prestige.x_0;
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
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2885;
import net.minecraft.class_310;
import net.minecraft.class_3965;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class eF
extends dV {
    private dO a;
    private dM d;
    private dQ c;
    private dL f;
    private dM e;
    private dQ g;
    private dR h;
    private dM i;
    private dP j;
    private dM k;
    private dO l;
    private dP m;
    private f5 n;
    private f5 o;
    private class_2338 p;
    private int q;
    private boolean r;
    public static boolean s;
    private int t;
    private f5 u;
    private f5 v;
    private l_0 w;
    private class_3965 x;
    private class_2338 y;
    private int z;
    private boolean A;
    private boolean B;
    private boolean C;
    private static final long D;
    private static final String[] E;
    private static final String[] F;
    private static final Map G;
    private static final Object[] H;
    private static final String[] I;

    public eF() {
        long l;
        long l2 = l = D ^ 0xAD29787C4E5L;
        long l3 = l2 ^ 0x63670AA90DCAL;
        long l4 = l2 ^ 0x553E3DF67EC0L;
        long l5 = l2 ^ 0x5D082EC36919L;
        long l6 = l2 ^ 0x10F2E9BCCFD3L;
        long l7 = l2 ^ 0x1B8888B4AB9DL;
        long l8 = l2 ^ 0x45941215F2L;
        this.n = new f5(l4);
        this.o = new f5(l4);
        this.p = null;
        this.q = 0;
        this.r = 0;
        this.t = 0;
        this.u = new f5(l4);
        this.v = new f5(l4);
        this.w = l_0.IDLE;
        this.x = null;
        this.y = null;
        this.z = -1;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        Object[] objectArray = new Object[2];
        objectArray[1] = l6;
        objectArray[0] = this::lambda$new$3;
        eF.c("\u00e5", (Object)this.h, (Object)objectArray, (long)-8844980861109126334L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = this::lambda$new$2;
        eF.c("\u00e5", (Object)this.g, (Object)objectArray2, (long)-8844413276698510000L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l5;
        objectArray3[0] = this::lambda$new$7;
        eF.c("\u00e5", (Object)this.l, (Object)objectArray3, (long)-8844889743139238219L, (long)l);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l7;
        objectArray4[0] = this::lambda$new$8;
        eF.c("\u00e5", (Object)this.m, (Object)objectArray4, (long)-8844217644520757750L, (long)l);
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l8;
        objectArray5[0] = this::lambda$new$4;
        eF.c("\u00e5", (Object)this.i, (Object)objectArray5, (long)-8830058256305744138L, (long)l);
        Object[] objectArray6 = new Object[2];
        objectArray6[1] = l8;
        objectArray6[0] = this::lambda$new$6;
        eF.c("\u00e5", (Object)this.k, (Object)objectArray6, (long)-8830058256305744138L, (long)l);
        Object[] objectArray7 = new Object[2];
        objectArray7[1] = l8;
        objectArray7[0] = this::lambda$new$1;
        eF.c("\u00e5", (Object)this.e, (Object)objectArray7, (long)-8830058256305744138L, (long)l);
        Object[] objectArray8 = new Object[2];
        objectArray8[1] = l7;
        objectArray8[0] = this::lambda$new$5;
        eF.c("\u00e5", (Object)this.j, (Object)objectArray8, (long)-8844217644520757750L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                eF.D = hc.a(-7624244801636159430L, -2163030078172172755L, MethodHandles.lookup().lookupClass()).a(155911209423256L);
                eF.H = new Object[168];
                eF.I = new String[168];
                eF.f();
                eF.G = new HashMap<K, V>(13);
                var0 = eF.D ^ 104745673219330L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[23];
                var7_4 = 0;
                var6_5 = "H{w\u0017|\u00fb\u00ad\u00bb(n\u00e8\u0089\u0013\u00ba\u00dd\u00eb;`:v\u009f?\r\u00a6#\u0089\u0017\u00b8\u0098;)=\u00fah\u00e7\u00af\u008f\u008e}\u00ef(\u00ffz\u00eck?\u00e69\u00e2\u00b3\u00a0\u0010\u00d1\u001d\u00f3\u00f1\u00ddG\u009a\u00b0\u0083\u00eb>\u00b1\u00bd\u00daJC\u00a9\u0098/\u00b8X\u00c5\u00a3\u00eeGt\u00f1~\u0084\u0010\u00de~\u00f8\u0094H\u000e\u0089(\u00a1J\u0098\u0016\u00e2\u00fc\u00aa\u00c38s4*eS\u0098\u00c6\u0013Pi_b@`\u00f8\u001ae\u00ba\u00b1\u0011R\u00e8\u00dc\u00fc\u00cc\u008c\u008c\u00a7j\u00c8v\u001c;\u0018\u00ae:d\u008d\u00a4\u00b2Kg>,\u0089\u00c3\u0090\u00ed0JDbQq\u009f\u00be\u0010\u00f5\u00a3\u0002J\u00ce%r\u00d0\u0010\u00d3OQu\u0013WP0\u00ef\u0093\u0087\u0019\u00a9[\u0004\u0088F\u00fb\u00a8a&\u008c\u0099|i\u00dc\u0086E\u00ab\u00f5\f\u00d6\u0018\u0087\u00e45\u00efW\u0013t@k&\u009b\u000b\u00ab_\u008a\u00b3^\u00d7\u00829o\u0001\u00aa(\u00d7\u0002oC\u0083<\u00f4\u00be\u00b8FB\u00e2\u0080{\u0011\u009c\u00a2\u0081{<Z\u0013\u0007[\u0088\u0094\u00ce\u009e2\u0018\u00cb\u00b9CQ\u00fe\u00b6e\u00fe#\u008d(\u001eY\u00c8Q\u00db\u00e1\"\u00c1\u00d0y\u00a8\u00fay\nQq\u0093\u0089ip\u000f*\u00f0y8@\u0000;\u009a\u00ed\u00afz\u0090\u00a9\u00ee\n\u00a6\u00fa\u00c5;8\u0012\u0007\u0094\u008av\u00db\u0005PMr\u00ab:\u00c8?\ty\"\u009e=;\u00d4\"\u00ae\u0017\u00be>83\u008avx\u008a\u00e1\f\u00c9\u00cb\u0004/\u00a7T\u0013|\u00b0=\u00e9Tq\u00c9\u0019\u00f9\u00b4|\u009d)\u00faN(\u0018\u0097\u00c9\u0081\u00f0\u008e\"\u00d8\u0013/\u0014\u00871\u0096\u00ed\u008e\u00ca\u007f\u00d1\u0016\u00a4u\u00f5\u00eb^Z\u00a7\u0098\b\u001e\u00d4\u007f\u0000.g\u008c\u0098-\u00f8U \u00a94\u00b0\u00ce\u00d5:\u0096\u00b6\u008bhv\u008c\u00d5v\u009cL\u0003\u008c\u0090\u00ab&@\u00e1\u00ff(s1\u0015I\u00a1\u00ea\u00dc\u0018'/\u00a3\u00bb\u00dd$)\u000f\u00f5\u00d2Zv\u0095\u00e1:\u00c3\u00dc\u0095}y\u00e6]y\u0087\u0010(]K\u009f\u00aa\u00b7\u00d6x\u0014\u0083\u00ect\u000f\u00a9'\u00fe0\u00a9_HIv\u0004\u0004{\u001c\n\u00c3\u00fe5\u00db\u008e\u00de!\u008a\u0096e\u00f1\u00e9k\u00c9\u00aeiJ\u009c_[\u00ff\u00ec\u00b7;\u00fe\u008e\u00bd\u00a8\u001a\u00d1\u00deG\u00a3\u00a7\u00c4\u00b4\u0087\u00c5\u0010\\5\u0086\u00be\u0085\t\u0017g\u00f1\u009c\u00ddy\u00f9\u00a3\u009c\u008c\u0018@\u00cbcx\u0006S`&\u0011o_u\u00a4\u00f2\u00bfA\u00f9\u00815\u0012K\u0014\ry\u0018H\u00cf\u0015\u00f4-\u00ec_Ho)v*R\u008f\u0094\u00e5!E_\u0088D1\u00bf\u00b1 \u00b9V\u0013F\u00c18\u00f9\u00d9\u00ae\u00a3C\u001aY\u00a5\u009a\u00ff\u0010}\u00a0\u0011@\u001e\u0015\u0013\u00b3CB$\u00af:\u00a1\u0010(%B\u00b1H \u008a\u001e?7\u0006\u00d7\u009a\u0088\u0084\u0017\u001e\u00b7\u00fbE\u0099}<\u00e6i\u0095-Jo=\u001f<F\u00e3\u0099\u00c5\u0007j\u007f\u0092\u0086(LB\u00e1z\u009e\u00a3>\u00d2N\u00cdO\u008f\u00e0|\u00a1ou\u00b4?a\u0005\u00fb\b\u0090\u00cc\u00d3\u00c4\u00ca\u0004\u00bb\u00d9<6\u00b5R/B\u00e0\u0002\u00e0(\u00a9\u008b\u00c0\u00d0\u0097m\u00fbH\u0092D\u00d9=\u00c6\u00ff\u00a7\u000b\u00e1H2\u00e7\u00b2|T\u00ac\u009f\u0084\u00cdv\u00c73\u0004\u00daCkr\u00ba\u00ec\u0016mx";
                var8_6 = "H{w\u0017|\u00fb\u00ad\u00bb(n\u00e8\u0089\u0013\u00ba\u00dd\u00eb;`:v\u009f?\r\u00a6#\u0089\u0017\u00b8\u0098;)=\u00fah\u00e7\u00af\u008f\u008e}\u00ef(\u00ffz\u00eck?\u00e69\u00e2\u00b3\u00a0\u0010\u00d1\u001d\u00f3\u00f1\u00ddG\u009a\u00b0\u0083\u00eb>\u00b1\u00bd\u00daJC\u00a9\u0098/\u00b8X\u00c5\u00a3\u00eeGt\u00f1~\u0084\u0010\u00de~\u00f8\u0094H\u000e\u0089(\u00a1J\u0098\u0016\u00e2\u00fc\u00aa\u00c38s4*eS\u0098\u00c6\u0013Pi_b@`\u00f8\u001ae\u00ba\u00b1\u0011R\u00e8\u00dc\u00fc\u00cc\u008c\u008c\u00a7j\u00c8v\u001c;\u0018\u00ae:d\u008d\u00a4\u00b2Kg>,\u0089\u00c3\u0090\u00ed0JDbQq\u009f\u00be\u0010\u00f5\u00a3\u0002J\u00ce%r\u00d0\u0010\u00d3OQu\u0013WP0\u00ef\u0093\u0087\u0019\u00a9[\u0004\u0088F\u00fb\u00a8a&\u008c\u0099|i\u00dc\u0086E\u00ab\u00f5\f\u00d6\u0018\u0087\u00e45\u00efW\u0013t@k&\u009b\u000b\u00ab_\u008a\u00b3^\u00d7\u00829o\u0001\u00aa(\u00d7\u0002oC\u0083<\u00f4\u00be\u00b8FB\u00e2\u0080{\u0011\u009c\u00a2\u0081{<Z\u0013\u0007[\u0088\u0094\u00ce\u009e2\u0018\u00cb\u00b9CQ\u00fe\u00b6e\u00fe#\u008d(\u001eY\u00c8Q\u00db\u00e1\"\u00c1\u00d0y\u00a8\u00fay\nQq\u0093\u0089ip\u000f*\u00f0y8@\u0000;\u009a\u00ed\u00afz\u0090\u00a9\u00ee\n\u00a6\u00fa\u00c5;8\u0012\u0007\u0094\u008av\u00db\u0005PMr\u00ab:\u00c8?\ty\"\u009e=;\u00d4\"\u00ae\u0017\u00be>83\u008avx\u008a\u00e1\f\u00c9\u00cb\u0004/\u00a7T\u0013|\u00b0=\u00e9Tq\u00c9\u0019\u00f9\u00b4|\u009d)\u00faN(\u0018\u0097\u00c9\u0081\u00f0\u008e\"\u00d8\u0013/\u0014\u00871\u0096\u00ed\u008e\u00ca\u007f\u00d1\u0016\u00a4u\u00f5\u00eb^Z\u00a7\u0098\b\u001e\u00d4\u007f\u0000.g\u008c\u0098-\u00f8U \u00a94\u00b0\u00ce\u00d5:\u0096\u00b6\u008bhv\u008c\u00d5v\u009cL\u0003\u008c\u0090\u00ab&@\u00e1\u00ff(s1\u0015I\u00a1\u00ea\u00dc\u0018'/\u00a3\u00bb\u00dd$)\u000f\u00f5\u00d2Zv\u0095\u00e1:\u00c3\u00dc\u0095}y\u00e6]y\u0087\u0010(]K\u009f\u00aa\u00b7\u00d6x\u0014\u0083\u00ect\u000f\u00a9'\u00fe0\u00a9_HIv\u0004\u0004{\u001c\n\u00c3\u00fe5\u00db\u008e\u00de!\u008a\u0096e\u00f1\u00e9k\u00c9\u00aeiJ\u009c_[\u00ff\u00ec\u00b7;\u00fe\u008e\u00bd\u00a8\u001a\u00d1\u00deG\u00a3\u00a7\u00c4\u00b4\u0087\u00c5\u0010\\5\u0086\u00be\u0085\t\u0017g\u00f1\u009c\u00ddy\u00f9\u00a3\u009c\u008c\u0018@\u00cbcx\u0006S`&\u0011o_u\u00a4\u00f2\u00bfA\u00f9\u00815\u0012K\u0014\ry\u0018H\u00cf\u0015\u00f4-\u00ec_Ho)v*R\u008f\u0094\u00e5!E_\u0088D1\u00bf\u00b1 \u00b9V\u0013F\u00c18\u00f9\u00d9\u00ae\u00a3C\u001aY\u00a5\u009a\u00ff\u0010}\u00a0\u0011@\u001e\u0015\u0013\u00b3CB$\u00af:\u00a1\u0010(%B\u00b1H \u008a\u001e?7\u0006\u00d7\u009a\u0088\u0084\u0017\u001e\u00b7\u00fbE\u0099}<\u00e6i\u0095-Jo=\u001f<F\u00e3\u0099\u00c5\u0007j\u007f\u0092\u0086(LB\u00e1z\u009e\u00a3>\u00d2N\u00cdO\u008f\u00e0|\u00a1ou\u00b4?a\u0005\u00fb\b\u0090\u00cc\u00d3\u00c4\u00ca\u0004\u00bb\u00d9<6\u00b5R/B\u00e0\u0002\u00e0(\u00a9\u008b\u00c0\u00d0\u0097m\u00fbH\u0092D\u00d9=\u00c6\u00ff\u00a7\u000b\u00e1H2\u00e7\u00b2|T\u00ac\u009f\u0084\u00cdv\u00c73\u0004\u00daCkr\u00ba\u00ec\u0016mx".length();
                var5_7 = 40;
                var4_8 = -1;
lbl32:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl37:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = eF.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "Evp\u00a1X\u00c2\u0096YJD\u00f4+\u00b6[W\u0080\u00d7\u00d6\u0091\u00ae\u00aa\u000e\u00d2\u000e((\u00d0\u00a0\u00a5\u00cd\u008ek\u0092\u0095\u00b2\u0000?\u00d2q\u00e0\u00abi\u008b\u00fa;\u00baIC9*KA*J\u00ee\u0086o\u001f\u00d6A\u009c\u001b\u0012\u00d2.";
                    var8_6 = "Evp\u00a1X\u00c2\u0096YJD\u00f4+\u00b6[W\u0080\u00d7\u00d6\u0091\u00ae\u00aa\u000e\u00d2\u000e((\u00d0\u00a0\u00a5\u00cd\u008ek\u0092\u0095\u00b2\u0000?\u00d2q\u00e0\u00abi\u008b\u00fa;\u00baIC9*KA*J\u00ee\u0086o\u001f\u00d6A\u009c\u001b\u0012\u00d2.".length();
                    var5_7 = 24;
                    var4_8 = -1;
lbl46:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl51:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = eF.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        eF.E = var9_3;
        eF.F = new String[23];
    }

    private boolean e(Object[] objectArray) {
        Object object;
        block23: {
            block24: {
                CallSite callSite;
                long l;
                block21: {
                    long l2;
                    block22: {
                        block19: {
                            CallSite callSite2;
                            block20: {
                                long l3;
                                block18: {
                                    Object object2;
                                    block17: {
                                        l = (Long)objectArray[0];
                                        long l4 = l = D ^ l;
                                        l2 = l4 ^ 0x57691163E612L;
                                        l3 = l4 ^ 0x5A47E6447F06L;
                                        callSite = eF.c("\u00d4", (long)-4521722433965282979L, (long)l);
                                        try {
                                            object2 = eF.c("\u00e5", (Object)((Boolean)((Object)eF.c("\u00e5", (Object)this.k, (long)-4539331045445185627L, (long)l))), (long)-4538546754467986517L, (long)l);
                                            if (callSite != null) break block17;
                                            if (object2 != false) break block18;
                                        }
                                        catch (MatchException matchException) {
                                            throw eF.c("\u00d4", (Object)matchException, (long)-4524366204266286132L, (long)l);
                                        }
                                        object2 = 0;
                                    }
                                    return (boolean)object2;
                                }
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l3;
                                callSite2 = eF.c("\u00d4", (Object)objectArray2, (long)-4523315590817983925L, (long)l);
                                try {
                                    if (callSite2 == null) {
                                        return false;
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw eF.c("\u00d4", (Object)matchException, (long)-4524366204266286132L, (long)l);
                                }
                                try {
                                    try {
                                        reference cfr_temp_0 = eF.c("\u00e5", (Object)eF.c("C", (Object)b, (long)-4536820803034733314L, (long)l), (Object)callSite2, (long)-4521849793424091241L, (long)l) - eF.c("\u00e5", (Object)((Float)((Object)eF.c("\u00e5", (Object)this.l, (long)-4539331045445185627L, (long)l))), (long)-4524181116462171959L, (long)l);
                                        object = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                        if (callSite != null) break block19;
                                        if (object < 0) break block20;
                                    }
                                    catch (MatchException matchException) {
                                        throw eF.c("\u00d4", (Object)matchException, (long)-4524366204266286132L, (long)l);
                                    }
                                    return false;
                                }
                                catch (MatchException matchException) {
                                    throw eF.c("\u00d4", (Object)matchException, (long)-4524366204266286132L, (long)l);
                                }
                            }
                            object = eF.c("C", (Object)callSite2, (long)-4539439503285853730L, (long)l);
                        }
                        try {
                            try {
                                if (callSite != null) break block21;
                                if (object != false) break block22;
                            }
                            catch (MatchException matchException) {
                                throw eF.c("\u00d4", (Object)matchException, (long)-4524366204266286132L, (long)l);
                            }
                            return false;
                        }
                        catch (MatchException matchException) {
                            throw eF.c("\u00d4", (Object)matchException, (long)-4524366204266286132L, (long)l);
                        }
                    }
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = l2;
                    objectArray3[0] = Float.valueOf((float)eF.c("\u00e5", (Object)((Integer)((Object)eF.c("\u00e5", (Object)this.m, (long)-4539331045445185627L, (long)l))), (long)-4523822905320630358L, (long)l));
                    object = eF.c("\u00e5", (Object)this.v, (Object)objectArray3, (long)-4536910734784460953L, (long)l);
                }
                try {
                    try {
                        if (callSite != null) break block23;
                        if (object == false) break block24;
                    }
                    catch (MatchException matchException) {
                        throw eF.c("\u00d4", (Object)matchException, (long)-4524366204266286132L, (long)l);
                    }
                    return false;
                }
                catch (MatchException matchException) {
                    throw eF.c("\u00d4", (Object)matchException, (long)-4524366204266286132L, (long)l);
                }
            }
            object = 1;
        }
        return (boolean)object;
    }

    @Override
    public void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        eF.c("\u00e5", (Object)this, (Object)new Object[0], (long)3998691461351244662L, (long)l);
        this.A = 0;
        s = 0;
        this.t = 0;
    }

    private boolean i(Object[] objectArray) {
        Object object;
        block22: {
            block23: {
                CallSite callSite;
                long l;
                long l2;
                class_3965 class_39652;
                block20: {
                    long l3;
                    long l4;
                    block18: {
                        block19: {
                            class_39652 = (class_3965)objectArray[0];
                            l2 = (Long)objectArray[1];
                            long l5 = l2 = D ^ l2;
                            l = l5 ^ 0x61D4B742DF92L;
                            long l6 = l5 ^ 0x375CED76B15FL;
                            l4 = l5 ^ 0xD87B91D264EL;
                            l3 = l5 ^ 0x287807D5AD50L;
                            callSite = eF.c("\u00d4", (long)-2003540717242184621L, (long)l2);
                            try {
                                try {
                                    Object[] objectArray2 = new Object[2];
                                    objectArray2[1] = l6;
                                    objectArray2[0] = class_39652;
                                    object = eF.c("\u00e5", (Object)this, (Object)objectArray2, (long)-2003615594820919157L, (long)l2);
                                    if (callSite != null) break block18;
                                    if (object != false) break block19;
                                }
                                catch (MatchException matchException) {
                                    throw eF.c("\u00d4", (Object)matchException, (long)-2001749038314629438L, (long)l2);
                                }
                                return false;
                            }
                            catch (MatchException matchException) {
                                throw eF.c("\u00d4", (Object)matchException, (long)-2001749038314629438L, (long)l2);
                            }
                        }
                        object = eF.c("\u00e5", (Object)eF.b("b", (int)7591, (long)(0x2F7CB0AC84342753L ^ l2)), (Object)eF.c("\u00e5", (Object)this.h, (long)-2013270366910387541L, (long)l2), (long)-2013227539200767217L, (long)l2);
                    }
                    try {
                        block21: {
                            try {
                                try {
                                    try {
                                        try {
                                            if (callSite != null) break block20;
                                            if (object == false) break block21;
                                        }
                                        catch (MatchException matchException) {
                                            throw eF.c("\u00d4", (Object)matchException, (long)-2001749038314629438L, (long)l2);
                                        }
                                        Object[] objectArray3 = new Object[2];
                                        objectArray3[1] = l4;
                                        objectArray3[0] = eF.c("\u00c8", (long)-2002386895721202761L, (long)l2);
                                        object = eF.c("\u00d4", (Object)objectArray3, (long)-2013511643764678624L, (long)l2);
                                        if (callSite != null) break block22;
                                    }
                                    catch (MatchException matchException) {
                                        throw eF.c("\u00d4", (Object)matchException, (long)-2001749038314629438L, (long)l2);
                                    }
                                    if (object == false) break block23;
                                }
                                catch (MatchException matchException) {
                                    throw eF.c("\u00d4", (Object)matchException, (long)-2001749038314629438L, (long)l2);
                                }
                                Object[] objectArray4 = new Object[2];
                                objectArray4[1] = l;
                                objectArray4[0] = class_39652;
                                eF.c("\u00d4", (Object)objectArray4, (long)-2002090665756871272L, (long)l2);
                                if (callSite == null) break block23;
                            }
                            catch (MatchException matchException) {
                                throw eF.c("\u00d4", (Object)matchException, (long)-2001749038314629438L, (long)l2);
                            }
                        }
                        Object[] objectArray5 = new Object[2];
                        objectArray5[1] = l3;
                        objectArray5[0] = eF.c("\u00c8", (long)-2014858863502107085L, (long)l2);
                        object = eF.c("\u00d4", (Object)objectArray5, (long)-2015274123170689448L, (long)l2);
                    }
                    catch (MatchException matchException) {
                        throw eF.c("\u00d4", (Object)matchException, (long)-2001749038314629438L, (long)l2);
                    }
                }
                try {
                    try {
                        if (callSite != null) break block22;
                        if (object == false) break block23;
                    }
                    catch (MatchException matchException) {
                        throw eF.c("\u00d4", (Object)matchException, (long)-2001749038314629438L, (long)l2);
                    }
                    Object[] objectArray6 = new Object[2];
                    objectArray6[1] = l;
                    objectArray6[0] = class_39652;
                    eF.c("\u00d4", (Object)objectArray6, (long)-2002090665756871272L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw eF.c("\u00d4", (Object)matchException, (long)-2001749038314629438L, (long)l2);
                }
            }
            object = 1;
        }
        return (boolean)object;
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
            throw new RuntimeException("dev/zprestige/prestige/eF" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = eF.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5EEA;
        if (F[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])G.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    G.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/eF", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = E[n2].getBytes("ISO-8859-1");
            eF.F[n2] = eF.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return F[n2];
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/eF" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = eF.m(l, l2);
            object = H[n];
            try {
                if (!(object instanceof String)) break block2;
                eF.H[n] = clazz = Class.forName(I[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = eF.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = eF.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = eF.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = eF.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private boolean h(Object[] objectArray) {
        Object object;
        block10: {
            long l;
            long l2;
            class_3965 class_39652;
            block11: {
                reference v1;
                long l3;
                block8: {
                    block9: {
                        class_39652 = (class_3965)objectArray[0];
                        l2 = (Long)objectArray[1];
                        long l4 = l2 = D ^ l2;
                        l = l4 ^ 0x1E8D16012F75L;
                        l3 = l4 ^ 0x6B4780A5CE80L;
                        long l5 = l4 ^ 0x72DE185ED6A9L;
                        CallSite callSite = eF.c("\u00d4", (long)1501529416847359156L, (long)l2);
                        try {
                            try {
                                try {
                                    try {
                                        v1 = eF.c("\u00e5", (Object)eF.b("b", (int)7591, (long)(0x2F7CCFF52577D7B4L ^ l2)), (Object)eF.c("\u00e5", (Object)this.h, (long)1506473992163138124L, (long)l2), (long)1506712879760702440L, (long)l2);
                                        if (callSite != null) break block8;
                                        if (v1 == false) break block9;
                                    }
                                    catch (MatchException matchException) {
                                        throw eF.c("\u00d4", (Object)matchException, (long)1503960947109471781L, (long)l2);
                                    }
                                    Object[] objectArray2 = new Object[2];
                                    objectArray2[1] = l5;
                                    objectArray2[0] = eF.c("\u00c8", (long)1503791875919579005L, (long)l2);
                                    object = eF.c("\u00d4", (Object)objectArray2, (long)1506997828332343495L, (long)l2);
                                    if (callSite != null) break block10;
                                }
                                catch (MatchException matchException) {
                                    throw eF.c("\u00d4", (Object)matchException, (long)1503960947109471781L, (long)l2);
                                }
                                if (object == false) break block11;
                            }
                            catch (MatchException matchException) {
                                throw eF.c("\u00d4", (Object)matchException, (long)1503960947109471781L, (long)l2);
                            }
                            return false;
                        }
                        catch (MatchException matchException) {
                            throw eF.c("\u00d4", (Object)matchException, (long)1503960947109471781L, (long)l2);
                        }
                    }
                    v1 = eF.c("\u00e5", (Object)((Integer)((Object)eF.c("\u00e5", (Object)this.j, (long)1506473992163138124L, (long)l2))), (long)1500045447245283907L, (long)l2) - 1;
                }
                Object[] objectArray3 = new Object[2];
                objectArray3[1] = l3;
                objectArray3[0] = (int)v1;
                eF.c("\u00d4", (Object)objectArray3, (long)1500173076328381262L, (long)l2);
            }
            Object[] objectArray4 = new Object[2];
            objectArray4[1] = l;
            objectArray4[0] = class_39652;
            eF.c("\u00d4", (Object)objectArray4, (long)1499798164573275519L, (long)l2);
            object = 1;
        }
        return (boolean)object;
    }

    private boolean f(Object[] objectArray) {
        Object object;
        block14: {
            long l;
            long l2;
            class_3965 class_39652;
            block15: {
                CallSite callSite;
                block12: {
                    long l3;
                    block13: {
                        class_39652 = (class_3965)objectArray[0];
                        l2 = (Long)objectArray[1];
                        long l4 = l2 = D ^ l2;
                        l = l4 ^ 0x132E4C9FFCAEL;
                        long l5 = l4 ^ 0x7F7D42C00572L;
                        l3 = l4 ^ 0x5A82FC088E6CL;
                        callSite = eF.c("\u00d4", (long)-4103468998788468881L, (long)l2);
                        try {
                            try {
                                try {
                                    try {
                                        object = eF.c("\u00e5", (Object)eF.b("b", (int)17191, (long)(0x764E3A61AE21DAEDL ^ l2)), (Object)eF.c("\u00e5", (Object)this.h, (long)-4092892733757109865L, (long)l2), (long)-4092673912192980941L, (long)l2);
                                        if (callSite != null) break block12;
                                        if (object == false) break block13;
                                    }
                                    catch (MatchException matchException) {
                                        throw eF.c("\u00d4", (Object)matchException, (long)-4106111742803970562L, (long)l2);
                                    }
                                    Object[] objectArray2 = new Object[2];
                                    objectArray2[1] = l5;
                                    objectArray2[0] = eF.c("\u00c8", (long)-4104356781579380597L, (long)l2);
                                    object = eF.c("\u00d4", (Object)objectArray2, (long)-4092959346066586852L, (long)l2);
                                    if (callSite != null) break block14;
                                }
                                catch (MatchException matchException) {
                                    throw eF.c("\u00d4", (Object)matchException, (long)-4106111742803970562L, (long)l2);
                                }
                                if (object != false) break block15;
                            }
                            catch (MatchException matchException) {
                                throw eF.c("\u00d4", (Object)matchException, (long)-4106111742803970562L, (long)l2);
                            }
                            return false;
                        }
                        catch (MatchException matchException) {
                            throw eF.c("\u00d4", (Object)matchException, (long)-4106111742803970562L, (long)l2);
                        }
                    }
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = l3;
                    objectArray3[0] = eF.c("\u00c8", (long)-4092159683115746033L, (long)l2);
                    object = eF.c("\u00d4", (Object)objectArray3, (long)-4092580026518409884L, (long)l2);
                }
                try {
                    try {
                        if (callSite != null) break block14;
                        if (object != false) break block15;
                    }
                    catch (MatchException matchException) {
                        throw eF.c("\u00d4", (Object)matchException, (long)-4106111742803970562L, (long)l2);
                    }
                    return false;
                }
                catch (MatchException matchException) {
                    throw eF.c("\u00d4", (Object)matchException, (long)-4106111742803970562L, (long)l2);
                }
            }
            Object[] objectArray4 = new Object[2];
            objectArray4[1] = l;
            objectArray4[0] = class_39652;
            eF.c("\u00d4", (Object)objectArray4, (long)-4104090018640652636L, (long)l2);
            object = 1;
        }
        return (boolean)object;
    }

    private static void f() {
        Object[] objectArray = H;
        H[0] = "2\"\b9G92\"\u001feK6(i\u001f{K#/\u0018K#\u001c";
        objectArray[1] = "w$z$\r\u0000w$mx\u0001\u000fmomf\u0001\u001aj\u001e?8Y^";
        objectArray[2] = Float.TYPE;
        eF.I[2] = "java/lang/Float";
        objectArray[3] = "#;\u007fC<N5;z\u0019/Y\"py\u001f#M37n\bh_\u000f";
        objectArray[4] = "\u0003}a*O|v]j%^3\u000bEy\"Wzc";
        objectArray[5] = "=\u0010L\n\u0019\n=\u0010[V\u0015\u0005'[[H\u0015\u0010 *\u000b\u0015D";
        objectArray[6] = "f\u0001(#=\u0019p\u0001-y.\u000egJ.\u007f\"\u001av\r9hi\u000f7";
        objectArray[7] = "q\u0003%H)U\u0004#.G8\u001ae-%L<@\u0011";
        objectArray[8] = Boolean.TYPE;
        eF.I[8] = "java/lang/Boolean";
        objectArray[9] = "\n8D_\u0012\\\u00017U\u0010u^\u0014<U[N";
        objectArray[10] = Integer.TYPE;
        eF.I[10] = "java/lang/Integer";
        objectArray[11] = "\u0012P;c+-\u0019_*,G.\u0017](ck";
        objectArray[12] = "\u001c'W\u001a\u0017$\n'R@\u00043\u001dlQF\b'\f+FQC2I";
        objectArray[13] = "-u\u00064sRXU\r;b\u001d9[\u00060fGM";
        objectArray[14] = "G|\u0011V(\tG|\u0006\n$\u0006]7\u0006\u0014$\u0013ZFTNpW";
        objectArray[15] = "\t\u001aV!`>\u001f\u001aS{s)\bQP}\u007f=\u0019\u0016Gj4*&";
        objectArray[16] = "|k;\u0016>Ywd*Y_W|o.\u0003";
        objectArray[17] = "x=.D\"{n=+\u001e1lyv(\u0018=xh1?\u000fvnZ";
        objectArray[18] = "t=T\u0013}W\u007f2E\\\u001eZj?J7+X{,V\u001b<U";
        objectArray[19] = "@X\tSo\u0018KW\u0018\u001c\u0007\u0018EX\u000b";
        objectArray[20] = "U\"F\".MC\"Cx=ZTi@~1NE.WizYu";
        objectArray[21] = "l|NPq\b\u0019\\E_`GxRNTd\u001d\f";
        objectArray[22] = Void.TYPE;
        eF.I[22] = "java/lang/Void";
        objectArray[23] = "]T*@a\u001aKT/\u001ar\r\\\u001f,\u001c~\u0019MX;\u000b5\u000eh";
        objectArray[24] = "\tyV\u001fex|Y]\u0010t7\u001dWV\u001bpmi";
        objectArray[25] = "O:^U^\u0018:\u001aUZOW[\u0014^QK\r/";
        objectArray[26] = "\u0016BnK9\r\u0000Bk\u0011*\u001a\u0017\th\u0017&\u000e\u0006N\u007f\u0000m\u001e\u001eN}\u000b7S\"U}\u00167\u0014\u0015B";
        objectArray[27] = "U$5\u0018\u000f{ \u0004>\u0017\u001e4A\n5\u001c\u001an5";
        objectArray[28] = "}#\u0011+/?v,\u0000dR'e+\t-";
        objectArray[29] = "\ni\u000ft\u0014C\u007fI\u0004{\u0005\f\u001eG\u000fp\u0001Vj";
        objectArray[30] = "F\u000e.R+(P\u000e+\b8?GE(\u000e4+V\u0002?\u0019\u007f;P";
        objectArray[31] = "b\u0000\u0010F?\u0011\u0017 \u001bI.^v.\u0010B*\u0004\u0002";
        objectArray[32] = "\u001eom:\t=\u001eozf\u00052\u0004$zx\u0005'\u0003U+\"\\d";
        objectArray[33] = "\u0013(\u001cI%-\u0013(\u000b\u0015)\"\tc\u000b\u000b)7\u000e\u0012ZP~}";
        objectArray[34] = "~BT\u0010\u0005nuME_hmySC\u0003J`xF";
        objectArray[35] = "_\u0006'\u0012\u001e'_\u00060N\u0012(EM0P\u0012=B<e\u000fK";
        objectArray[36] = "]\u0007\u0014\u0011`y]\u0007\u0003MlvGL\u0003Slc@=R\f>(";
        objectArray[37] = "O\u000bh=\u0011wO\u000b\u007fa\u001dxU@\u007f\u007f\u001dmR1. E";
        objectArray[38] = "^q\r\u0005\u0005\"^q\u001aY\t-D:\u001aG\t8CKK\u001c\\z";
        objectArray[39] = "\u0003V\u0003\u000e'T\u0003V\u0014R+[\u0019\u001d\u0014L+N\u001elE\u0017\u007f\u0005";
        objectArray[40] = "f\u0011\u001c13+f\u0011\u000bm?$|Z\u000bs?1{+Z-jt";
        objectArray[41] = "\u000f\u0007}n#Q\u000f\u0007j2/^\u0015Lj,/K\u0012=;rz\u0000";
        objectArray[42] = "\u0006Bc\u000bUJ\u0006BtWYE\u001c\ttIYP\u001bx$\u001c\u000e\u0016";
        objectArray[43] = "tt\u0003E\u001a+tt\u0014\u0019\u0016$n?\u0014\u0007\u00161iNFSGp";
        objectArray[44] = "t7l(0yt7{t<vn|{j<ci\r)1d\"";
        objectArray[45] = "6dSuh\u0010 dV/{\u00077/U)w\u0013&hB><\u0002:";
        objectArray[46] = "-\u0005{\u0013\u0015fX%p\u001c\u0004)9+{\u0017\u0000sM";
        objectArray[47] = ".oou)0.ox)%?4$x7%*3U)n}o";
        objectArray[48] = "Q:\b\u001fD0G:\rEW'Pq\u000eC[3A6\u0019T\u0010#Z";
        objectArray[49] = "BA00FZ7a;?W\u0015Vo04SO\"";
        objectArray[50] = "\u001dQ*TSk\u000bQ/\u000e@|\u001c\u001a,\bLh\r];\u001f\u0007\u007f\u0017";
        objectArray[51] = "t3v@s\u000e\u0001\u0013}ObA`\u001dvDf\u001b\u0014";
        objectArray[52] = "1|m\u0012MBD\\f\u001d\\\r%Rm\u0016XWQ";
        objectArray[53] = "E\u0004a\u0012\u001c!S\u0004dH\u000f6DOgN\u0003\"U\bpYH0N";
        objectArray[54] = "\u0007:H{Jsr\u001aCt[<\u0013\u0014H\u007f_fg";
        objectArray[55] = "\u0000'A$ k\u0000'Vx,d\u001alVf,q\u001d\u001d\u00019z";
        objectArray[56] = "\u001d\u0005$ <\t\u001d\u00053|0\u0006\u0007N3b0\u0013\u0000?b=i";
        objectArray[57] = "\u0019,a\nuS\u0019,vVy\\\u0003gvHyI\u0004\u0016'\u0017!\u001e\u0014%tWkeE}%";
        objectArray[58] = "\u0010\u0019R7WSe9Y8F\u001c\u00047R3BFp";
        objectArray[59] = "K\u000eKj)W>.@e8\u0018_ Kn<B+";
        objectArray[60] = "-\tC\u0007\u000f X)H\b\u001eo9'C\u0003\u001a5M";
        objectArray[61] = "O]DQ~o:}O^o [sDUkz/";
        objectArray[62] = "Dk!&rnRk$|ayE 'zmmTg0m&zl";
        objectArray[63] = "g!\u0018\u0005@m\u0012\u0001\u0013\nQ\"s\u000f\u0018\u0001Ux\u0007";
        objectArray[64] = "\u001b\u000b\u000eK\nI\r\u000b\u000b\u0011\u0019^\u001a@\b\u0017\u0015J\u000b\u0007\u001f\u0000^ZH";
        objectArray[65] = "6Q\u0011H\t$Cq\u001aG\u0018k\"\u007f\u0011L\u001c1V";
        objectArray[66] = ">9n&\u0019\u007f>9yz\u0015p$ryd\u0015e#\u0003(<G";
        objectArray[67] = "<\u000bNSd\u0005<\u000bY\u000fh\n&@Y\u0011h\u001f!1\bN<\\";
        objectArray[68] = "dr\u0000_:\n\u0011R\u000bP+Ep\\\u0000[/\u001f\u0004";
        objectArray[69] = "t|azz\n\u0001\\jukE`Ra~o\u001f\u0014";
        objectArray[70] = "OVD-\b\f:vO\"\u0019C[xD)\u001d\u0019/";
        objectArray[71] = "Up\\hY\u0004 PWgHKA^\\lL\u00115";
        objectArray[72] = "\u001fh\u0012YYO\th\u0017\u0003JX\u001e#\u0014\u0005FL\u000fd\u0003\u0012\rS";
        objectArray[73] = "RS2\u000b\u0012\u0004's9\u0004\u0003KF}2\u000f\u0007\u00112";
        objectArray[74] = "T7\u0010\rz\\!\u0017\u001b\u0002k\u0013@\u0019\u0010\toI4";
        objectArray[75] = "\u0006u/)N:sU$&_u\u0012[/-[/f";
        objectArray[76] = "v'\f\u0005jK\u0003\u0007\u0007\n{\u0004b\t\f\u0001\u007f^\u0016";
        objectArray[77] = "dTF\u001c7\u001e\u0011tM\u0013&QpzF\u0018\"\u000b\u0004";
        objectArray[78] = "f\u0003\u0012)\u0002x\u0013#\u0019&\u00137r-\u0012-\u0017m\u0006";
        objectArray[79] = "M\u001e6\u0015K08>=\u001aZ\u007fY06\u0011^%-";
        objectArray[80] = "}0~i Bc8d&]Rc";
        objectArray[81] = "?<,g\u0011m)<)=\u0002z>w*;\u000en/0=,E~9";
        objectArray[82] = "{w=%n\u000f\u000eW6*\u007f@oY=!{\u001a\u001b";
        objectArray[83] = "^\u0013VD\u0002dH\u0013S\u001e\u0011s_XP\u0018\u001dgN\u001fG\u000fVph";
        objectArray[84] = "\n\b\u00059\u001e\u0004\u007f(\u000e6\u000fK\u001e&\u0005=\u000b\u0011j";
        objectArray[85] = "\u0011(.Q}n\u0007(+\u000bny\u0010c(\rbm\u0001$?\u001a)z:";
        objectArray[86] = "_^byX=*~ivIrKpb}M(?";
        objectArray[87] = "2\u0016'?*;$\u0016\"e9,3]!c58\"\u001a6t~/\u0006";
        objectArray[88] = "E\u000ez\u0011:o0.q\u001e+ Q z\u0015/z%";
        objectArray[89] = "\u0019^\fZs+l~\u0007Ubd\rp\f^f>y";
        objectArray[90] = "m>\u001aN!,{>\u001f\u00142;lu\u001c\u0012>/}2\u000b\u0005u8D";
        objectArray[91] = "\u0004\u0001X1\u0003yq!S>\u00126\u0010/X5\u0016ld";
        objectArray[92] = "\u0001j\u00151~|\u00067Tl\u0014wejS8w,^iG8f-enUj\u007fn\u000f?J5)\u0015";
        objectArray[93] = "&D7\u0006\u0018<3\u00060\f~5.@lP\u0012\u0007z\u00052\nBP%\f4\u000fFa3RbN~62MjF\u0012n:\u0004n7";
        objectArray[94] = ">'!L:9h#\"\fH3cr4\u0010\u001fd=%l|,\"kb,\u0002p8r";
        objectArray[95] = "\u000e?#>\u0012\u0007W.k'|\u00002i)-\u001fP\tj=-\u000eQ2m/\u007f\u0017\u0012X<0 Ai";
        objectArray[96] = "EAY\\o^M\u001bJ\\\u000fH.F\\\\l\u0015\u0015EH\\}\u0014.\u0011XNtPSDX\rl,";
        objectArray[97] = "y;\rN3$~fL\u0013Y,\u001d;KG:t&8_G+u\u001d?M\u001526wnRJdM";
        objectArray[98] = "MOZ}1}E\u0015I}Qa&H_}26\u001dKK}#7&LY/:tL\u001dFpl\u000f";
        objectArray[99] = "\u0018k\u0010\n1<\u001fhZKjZF}\rSh3E\u0007^_q<D<\u001aB2!!";
        objectArray[100] = "`!]u\rOd\"\tkpE\u000fxJx\u0013\u00164{^x\u0002\u0017\u000f/Nj\u000bSrzN)\u0013/";
        objectArray[101] = "N3b\u0011hj\u00187aQ\u001a`\u0013fwMM7M6.!#4\u0012qv\u001d\u007f6Lwr";
        objectArray[102] = "\u001dB\u0004,)\u0013\u0015\u0018\u0017,I\u0004vE\u0001,*XMF\u0015,;Yv\u0012\u0005>2\u001d\u000bG\u0005}*a";
        objectArray[103] = "mRK2$\u001af@\n,I\u0016vN\u001e!\u001eB,\u001aGwI\u0003zY\u00157&\u001deF\u001e";
        objectArray[104] = "u\u0002/4\r6}X<4m%\u001e\u0005*4\u000e}%\u0006>4\u001f|\u001e\u0001,f\u0006?tP39PD";
        objectArray[105] = "'k\b'B;{q\u0011Z[(?t\u00066i{z-\\Z\u00039\u007f\u007f\u001a0R& )a";
        objectArray[106] = "\\*?\u0010wNIh8\u001a\u0011GT.dF}u\u0005o8\u001e-\"\u0004.8JjHU1g\u001c\u0011";
        objectArray[107] = "\u00058(lK+\rb;l+0n?-lH`U<9lYan;+>@\"\u0004j4a\u0016Y";
        objectArray[108] = "NO_\u000f[$F\u0015L\u000f;4%HZ\u000fXo\u001eKN\u000fIn%\u001f^\u001d@*XJ^^XV";
        objectArray[109] = "N\u001f7te*\u0018\u001b44\u0017+\u001f[&#{\u0019K\u001axu\u0017s\u000e\u001b-?}\"\u0011D{D";
        objectArray[110] = "\u0010\u00042HJYL\u001e+5SJ\b\u001b<Ya\u001aDAj5\u000f\u001d\u0006\u0018;\u000bL[\u001e\u001e75";
        objectArray[111] = ">,k_Z\u007f~+bS(|/ly\u0005DN{/&R\u0013\u0019{+x_\u0010!  ~XN\u0019";
        objectArray[112] = "l7\u0017\n\u0000\u0003*0\u0017\f[b.TM\u0019S\u0001loN\rS\u0010mT\u001a\u001dA\u0019))O\u001d\u0002\u0001U";
        objectArray[113] = ".OS\u0002C\u0002k\u0015\\\u0003!\u001d5\u001aYTvIoN\r\u0007!\t?MVTL\u001f4\u000fZ";
        objectArray[114] = "5\u001a\u001b@QCl\u000bSY?G\tL\u0011S\\\u00142O\u0005SM\u0015\tH\u0017\u0001TVc\u0019\b^\u0002-";
        objectArray[115] = "?\\o5J+8\u0000twr#*C\u007fh\u001e\u0011~\u0007%1IFxR`i\u0017}<O#tr";
        objectArray[116] = "<\u0014G)5\u0013;\u001d[62blp\u0018/!\u0001<K\u001b;!\u0010=p\u00181)\u001e\u007f\u0001\u001f85\u0001xp";
        objectArray[117] = "\\tJ\u001e[$Z|F\ne$\"#B\u000b\u0006t\u0019 V\u000b\u0017u\"eJ\u000bY&E|\u0001]\u0018M";
        objectArray[118] = "o\u0007<>\u0007\u001a;@7\"wM8]b,\u001eA\u0001Sb<\u001a'bF:*\fM3Ye|w";
        objectArray[119] = "\u001bW\u0010e%]]_S7ylK1\u0015vu\u000f\u001b\n\u0016bu\u001e\u001a1\u0015j'\u0005\u001c\u0000SbdW@1";
        objectArray[120] = "vSM!NS~\t^!.N\u001dTH!M\u0018&W\\!\\\u0019\u001dPNsEZw\u0001Q,\u0013!";
        objectArray[121] = "4\u0003\u001e\u0019|ds\u0014X_w]ddZ^\">4_YJ\"/5dZC1`=]\u001dTw&6d";
        objectArray[122] = "$|w)5\u001e#!6t_\u0013@|1 <N{\u007f% -O@x7r4\f*)(-bw";
        objectArray[123] = "\u0015fEYoiY/I\u0003\u0006kEyNWQ;\u001e/\u0017;9h[rO\u0000}u\u0018o";
        objectArray[124] = "va)fI1rb}x48\u00198>kWh\";*kFi\u0019n$hW,yj'<IQ";
        objectArray[125] = "N)\u0018[\u0017NZuX\u0006i\u001e'.K]\u0013LC:\u0019\u0002\u0005w";
        objectArray[126] = "r\u007fTq\\\n tDs:\u0016ic\\uA{z|\u000ek\u0001\u001fn.Q}:Fl\"^jP\u0017s}\b\u0011";
        objectArray[127] = "GPU_\u001d\u001f\u0007W\\So\u001cV\u0010G\u0005\u0003.\u0002S\u0018]PyC\u000fWXW\u0014DSL\u001ao";
        objectArray[128] = "P%d`m\fWy\u007f\"U\u0004E:t=96\u0011~.dia\u0017+k<0ZS6(!U";
        objectArray[129] = "ovV\u0006t5g,E\u0006\u0014*\u0004qS\u0006w~?rG\u0006f\u007f\u0004uUT\u007f<n$J\u000b)G";
        objectArray[130] = "6Sv\nK=#\u0011q\u0000-4>W-\\A\u0006i\u0015w\u0003\u0011Q(F7TW>6Y(_-";
        objectArray[131] = "ed\b@8j2\u007f@\u00009T2l\u0017\u0014m\u0003e4BK?Ted\b@8j2\u007f@\u00009";
        objectArray[132] = "F \u0012j\u0005e\u001a:\u000b\u0017\u001cv^?\u001c{.&\u001dfF\u0017Dg\u001e4\u0000}\u0015xAb{";
        objectArray[133] = "\u0016]\u0019Ad\u001aJG\u0000<}\t\u000eB\u0017POYM\u0019A<!U\tB@Ca\u0007\u000bDp\u0005`X\u000fSHNa\u0019L\"";
        objectArray[134] = "=giC\u000b\u000f5=zCk\u001dV`lC\bDmcxC\u0019EVdj\u0011\u0000\u0006<5uNV}";
        objectArray[135] = "n\u0017\u001e\u001a\u001a}:\u0000\\A+tTV\f\u0000Wt?U^\r\u0017\u001e";
        objectArray[136] = "TW\u0003\ru?\u0005F_\b\f:9\u0003\u001a\tob\u0002\u0000\u000e\t~c9T\u001e\u001bw'D\u0001\u001eXo[";
        objectArray[137] = "3DY;\u0004Oe@Z{vEn\u0011Lg!\u00120B\u0015\u000b\u000eP3@AsGAdC";
        objectArray[138] = "O)_Af.HuD\u0003^.N7F\u001f%C](\u0014\u0001e'IzK\u0017^~KvD\u00004/T)\u0012{";
        objectArray[139] = "U]6z+Z]\u001c0*81\u0000d6`;RU_5t;CTd2fiZ\u0017\u000ecy6\fl";
        objectArray[140] = "mmT\u0000,\f;iW@^\u000608A\\\tQoe\u001a09\u00184/\u0019]2P(-";
        objectArray[141] = ";5\u001e6F\u00060'_(+\n )K%|]y}\u0010p+\u001f,>@3D\u00013!K";
        objectArray[142] = "P\u00170t\u001d,\f\r)\t\u000f3Y\f5^_j\rRY6\f-R\rbr\u0011nO";
        objectArray[143] = "Ew[_ZX\u00117^L\f2\u0016G\u0004G_QE|\u0007S_@DG\u0004T\u000bS\u0004!RT\u000bJ\u0011G";
        objectArray[144] = " ;y\u001d\u000b+y*1\u0004e,\u001cms\u000e\u0006|'ng\u000e\u0017}\u001c:w\u001c\u001e9aow_\u0006E";
        objectArray[145] = "fP\f)Hls\u0012\u000b#.enTW\u007fBW9\u0017\u0007%\u0014\u0000xEMwTofZR|.=\u007f\u0014\\cDl`K\n\u0018";
        objectArray[146] = "\u0015:vt{\u0000\u001d`et\u001b\u001b~=stxKE>gtiJ~x5h&\u0000\u001882a*r";
        objectArray[147] = "\u0001\u0007d:,\u001aBA|< $]Pj9+Ho\f'eL\u001d\u0002Ou9r^DWs5L\u0019D\u0001}\"&H[^+Y";
        objectArray[148] = "n\u0011\fy\u00038iM\u0017;;0{\u000e\u001c$W\u0002/JF}\u0003U)\u001f\u0003%^nm\u0002@8;";
        objectArray[149] = "\u0016\u0002\u0003A\"@\u001eX\u0010ABQ}\u0005\u0006A!\u000bF\u0006\u0012A0\n}R\u0002S9N\u0000\u0007\u0002\u0010!2";
        objectArray[150] = "\u0006[`0YY\r\u0013|2eQ\fWe-\tcQ\u0010?reL\u0002[?r\bK^@}J\u0000LZ\u001ac&\u0015\u000e]\u0010\u0005";
        objectArray[151] = "\b\u007fSE'uStUByM_%_\u001cs\u001a\b\u007f\tB\u001ft\n%\u000f@'/\u0001#\b\u001e";
        objectArray[152] = "[*\r,XFE.\u001c|2DF8\n+e\u0010\u001clR~2WF6\u001ex]QKn\u000e";
        objectArray[153] = ",&)Ot:l<-\u0016\u000bct>O\u001eo\u007f\u007fB.\u001atdwyj\u00077y\u0012";
        objectArray[154] = "P4,\u0006\u001d}W$'\n j13$\u0005JtUb5YO";
        objectArray[155] = "].L\u000f(EZs\rRBE9.\n\u0006!\u0015\u0002-\u001e\u00060\u00149y\u000e\u00149PD,\u000eW!,";
        objectArray[156] = "J\u0001|^WjJP:Tf2:WzV\u0005b\u0001TnV\u0014c:S|\u0004\r P\u0002c[[[";
        objectArray[157] = "\u000e\r}mqJ\u0012_oj\u0013\u001b|\bk}pKG\u000b\u007f}aJ|\bi/n\u0003DChn-r";
        objectArray[158] = "D\u0015:p\u000bB\u001b\u0004&mrHtC#z\u0011\u0018O@7z\u0000\u0019tK+{\u0010H\u0018\u0007bwJ!";
        objectArray[159] = "dcLf\u0007\u000bc>\r;m\u000b\u0000c\no\u000e[;`\u001eo\u001fZ\u0000e\u001d~\u000b\u0007;!\u0000=\u0016b";
        objectArray[160] = ">r\u0004H\n\u0002uy\u0015VJ\u007fn\u000bGT\u0015\u001c>0D@\u0015\r?\u000bGW\u0001\u0019vv\f\\\u0010\u00076\u000b";
        objectArray[161] = "T[\u0010Y\f+\\\u0001\u0003Yl0?\u000e\rT\u001c C\u0004\u0017\u0006\u0011YT\u0007\fG\u0015%^\u001d^Jl";
        objectArray[162] = "\u0015M\u0003\t\f<DB\u0017\tj \u001d\u0014\u0010\u00074'\u001d\u000e\u0014{S6E\u000e\bC\u00187\u0004My";
        objectArray[163] = "ZR`\u000eyuR\u0013f^j\u001e\nk`\u0014i}ZPc\u0000il[k!\rw$[\u0006&Qlfc";
        objectArray[164] = "T\u0018\\\r\r@T\u0010\u001dXO;\n\u0015f\\\u0011\u0000\u0017@\u0002HC_\u0001{_UI\u0000\u0013\u0000_]\bUQ{";
        objectArray[165] = "(\u000f\u00028\u0006a U\u00118f\u007fC\b\u00078\u0005*x\u000b\u00138\u0014+C\f\u0001j\rh)]\u001e5[\u0013";
        objectArray[166] = "{B7\u0013nu<\u0003k\u00158J)}l\u0005m){Fo\u0011m8z}h\u0003?!9\u00179\u001c`wB";
        Object[] objectArray2 = objectArray;
        objectArray[167] = "\u0010U\u00182n\u000b\u000eQ\tb\u0004\t\rG\u001f5SW\\\u0012BYy\u0006\u000fZD6\u007f\u000bWJ";
    }

    private void l(Object[] objectArray) {
        block8: {
            eF eF2;
            long l;
            long l2;
            block10: {
                long l3;
                long l4;
                String string;
                block9: {
                    string = (String)objectArray[0];
                    l2 = (Long)objectArray[1];
                    long l5 = l2 = D ^ l2;
                    long l6 = l5 ^ 0x3D42BCD97A9DL;
                    l4 = l5 ^ 0x495F6C12A97L;
                    l = l5 ^ 0x626C63C57BEBL;
                    l3 = l5 ^ 0x40701F08F90AL;
                    CallSite callSite = eF.c("\u00d4", (long)3831325026514132297L, (long)l2);
                    try {
                        try {
                            try {
                                try {
                                    if (callSite != null) break block8;
                                    if (eF.c("\u00e5", (Object)eF.b("b", (int)23977, (long)(0x4EFED9339F08364DL ^ l2)), (Object)eF.c("\u00e5", (Object)this.h, (long)3824975408474078129L, (long)l2), (long)3825231339761195541L, (long)l2) == false) break block9;
                                }
                                catch (MatchException matchException) {
                                    throw eF.c("\u00d4", (Object)matchException, (long)3828688879700477912L, (long)l2);
                                }
                                eF2 = this;
                                if (callSite != null) break block10;
                            }
                            catch (MatchException matchException) {
                                throw eF.c("\u00d4", (Object)matchException, (long)3828688879700477912L, (long)l2);
                            }
                            if (eF2.z == -1) break block9;
                        }
                        catch (MatchException matchException) {
                            throw eF.c("\u00d4", (Object)matchException, (long)3828688879700477912L, (long)l2);
                        }
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l6;
                        objectArray2[0] = this.z;
                        eF.c("\u00e5", (Object)eF.c("\u00c8", (long)3831687425105433379L, (long)l2), (Object)objectArray2, (long)3830402674624435610L, (long)l2);
                    }
                    catch (MatchException matchException) {
                        throw eF.c("\u00d4", (Object)matchException, (long)3828688879700477912L, (long)l2);
                    }
                }
                Object[] objectArray3 = new Object[2];
                objectArray3[1] = l3;
                objectArray3[0] = (String)((Object)eF.b("b", (int)24503, (long)(0x201F003CAF6D3446L ^ l2))) + string;
                eF.c("\u00e5", (Object)this, (Object)objectArray3, (long)3824658282126743011L, (long)l2);
                eF.c("\u00e5", (Object)this, (Object)new Object[0], (long)3823910762854646041L, (long)l2);
                Object[] objectArray4 = new Object[1];
                objectArray4[0] = l4;
                eF.c("\u00e5", (Object)this.u, (Object)objectArray4, (long)3832084728402818539L, (long)l2);
                eF2 = this;
            }
            Object[] objectArray5 = new Object[1];
            objectArray5[0] = l;
            eF.c("\u00e5", (Object)eF2.g, (Object)objectArray5, (long)3824475657720406865L, (long)l2);
        }
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'C' || c == '\u00fe' || c == '\u00c8' || c == 'n') {
                field = eF.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'C' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fe' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = eF.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e5' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = eF.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private boolean d(Object[] objectArray) {
        class_2338 class_23382 = (class_2338)objectArray[0];
        long l = (Long)objectArray[1];
        l = D ^ l;
        return (boolean)eF.c("\u00e5", (Object)eF.c("\u00e5", (Object)eF.c("C", (Object)b, (long)-8516211299946479506L, (long)l), (Object)class_23382, (long)-8514378091284234223L, (long)l), (Object)eF.c("\u00c8", (long)-8508802909903342640L, (long)l), (long)-8514328412013057583L, (long)l);
    }

    @Override
    public void d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        eF.c("\u00e5", (Object)this, (Object)new Object[0], (long)3250876765855324437L, (long)l);
        this.A = 0;
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return eF.c("\u00d4", (Object)((Object)q_0.Crystal), (long)-2438366079631256750L, (long)l);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @bP
    public void a(bG bG2) {
        class_3965 class_39652;
        CallSite callSite;
        long l;
        long l2;
        long l3;
        long l4;
        long l5;
        block84: {
            CallSite callSite2;
            CallSite callSite3;
            block83: {
                long l6;
                block82: {
                    CallSite callSite4;
                    block80: {
                        block81: {
                            block78: {
                                block79: {
                                    class_3965 class_39653;
                                    long l7;
                                    block76: {
                                        block77: {
                                            CallSite callSite5;
                                            block75: {
                                                Object object;
                                                block73: {
                                                    long l8;
                                                    block74: {
                                                        block71: {
                                                            block72: {
                                                                eF eF2;
                                                                long l9;
                                                                block67: {
                                                                    block68: {
                                                                        eF eF3;
                                                                        long l10;
                                                                        block69: {
                                                                            block70: {
                                                                                CallSite callSite6;
                                                                                block66: {
                                                                                    block65: {
                                                                                        class_310 class_3102;
                                                                                        block64: {
                                                                                            block62: {
                                                                                                block63: {
                                                                                                    block61: {
                                                                                                        long l11 = l5 = D ^ 0x5C8DDE7B4C6DL;
                                                                                                        l4 = l11 ^ 0x419BBF961248L;
                                                                                                        l7 = l11 ^ 0x59174290EBCBL;
                                                                                                        l8 = l11 ^ 0x4510D8DE6FB8L;
                                                                                                        l6 = l11 ^ 0x70C7117313E4L;
                                                                                                        l3 = l11 ^ 0x27622A924334L;
                                                                                                        l2 = l11 ^ 0x6EA6F36C6A71L;
                                                                                                        l9 = l11 ^ 0xEB37AFA42D8L;
                                                                                                        l10 = l11 ^ 0x342EAB4C1321L;
                                                                                                        l = l11 ^ 0x57E565FC1D5L;
                                                                                                        callSite3 = eF.c("\u00d4", (long)1005671341269411222L, (long)l5);
                                                                                                        try {
                                                                                                            if (eF.c("\u00e5", (Object)((Integer)((Object)eF.c("\u00e5", (Object)this.f, (long)993694422994813806L, (long)l5))), (long)1005260047298878305L, (long)l5) == -1) {
                                                                                                                return;
                                                                                                            }
                                                                                                        }
                                                                                                        catch (MatchException matchException) {
                                                                                                            throw eF.c("\u00d4", (Object)matchException, (long)1008095269652152071L, (long)l5);
                                                                                                        }
                                                                                                        try {
                                                                                                            try {
                                                                                                                class_3102 = b;
                                                                                                                if (callSite3 != null) break block61;
                                                                                                                if (eF.c("C", (Object)class_3102, (long)991557327334271029L, (long)l5) == null) return;
                                                                                                            }
                                                                                                            catch (MatchException matchException) {
                                                                                                                throw eF.c("\u00d4", (Object)matchException, (long)1008095269652152071L, (long)l5);
                                                                                                            }
                                                                                                            class_3102 = b;
                                                                                                        }
                                                                                                        catch (MatchException matchException) {
                                                                                                            throw eF.c("\u00d4", (Object)matchException, (long)1008095269652152071L, (long)l5);
                                                                                                        }
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (callSite3 != null) break block62;
                                                                                                            if (eF.c("C", (Object)class_3102, (long)1006013802867803208L, (long)l5) != null) break block63;
                                                                                                            return;
                                                                                                        }
                                                                                                        catch (MatchException matchException) {
                                                                                                            throw eF.c("\u00d4", (Object)matchException, (long)1008095269652152071L, (long)l5);
                                                                                                        }
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw eF.c("\u00d4", (Object)matchException, (long)1008095269652152071L, (long)l5);
                                                                                                    }
                                                                                                }
                                                                                                class_3102 = b;
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    if (callSite3 != null) break block64;
                                                                                                    if (eF.c("C", (Object)class_3102, (long)994305204788954194L, (long)l5) != null) return;
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw eF.c("\u00d4", (Object)matchException, (long)1008095269652152071L, (long)l5);
                                                                                                }
                                                                                                class_3102 = b;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw eF.c("\u00d4", (Object)matchException, (long)1008095269652152071L, (long)l5);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                callSite6 = eF.c("\u00e5", (Object)class_3102, (long)994870204272976213L, (long)l5);
                                                                                                if (callSite3 != null) break block65;
                                                                                                if (callSite6 == false) return;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw eF.c("\u00d4", (Object)matchException, (long)1008095269652152071L, (long)l5);
                                                                                            }
                                                                                            callSite6 = eF.c("\u00e5", (Object)eF.c("C", (Object)b, (long)991557327334271029L, (long)l5), (long)995098383329637596L, (long)l5);
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw eF.c("\u00d4", (Object)matchException, (long)1008095269652152071L, (long)l5);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            if (callSite3 != null) break block66;
                                                                                            if (callSite6 != false) return;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw eF.c("\u00d4", (Object)matchException, (long)1008095269652152071L, (long)l5);
                                                                                        }
                                                                                        callSite6 = eF.c("\u00e5", (Object)eF.c("C", (Object)b, (long)991557327334271029L, (long)l5), (long)1005476590380424091L, (long)l5);
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw eF.c("\u00d4", (Object)matchException, (long)1008095269652152071L, (long)l5);
                                                                                    }
                                                                                }
                                                                                if (callSite6 != false) {
                                                                                    return;
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                eF2 = this;
                                                                                                if (callSite3 != null) break block67;
                                                                                                if (eF2.w == l_0.IDLE) break block68;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw eF.c("\u00d4", (Object)matchException, (long)1008095269652152071L, (long)l5);
                                                                                            }
                                                                                            eF3 = this;
                                                                                            if (callSite3 != null) break block69;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw eF.c("\u00d4", (Object)matchException, (long)1008095269652152071L, (long)l5);
                                                                                        }
                                                                                        Object[] objectArray = new Object[2];
                                                                                        objectArray[1] = l8;
                                                                                        objectArray[0] = this.g;
                                                                                        if (eF.c("\u00e5", (Object)eF3.u, (Object)objectArray, (long)993480779113391632L, (long)l5) != false) break block70;
                                                                                        return;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw eF.c("\u00d4", (Object)matchException, (long)1008095269652152071L, (long)l5);
                                                                                    }
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw eF.c("\u00d4", (Object)matchException, (long)1008095269652152071L, (long)l5);
                                                                                }
                                                                            }
                                                                            eF3 = this;
                                                                        }
                                                                        Object[] objectArray = new Object[1];
                                                                        objectArray[0] = l10;
                                                                        eF.c("\u00e5", (Object)eF3, (Object)objectArray, (long)1004413172483520433L, (long)l5);
                                                                        return;
                                                                    }
                                                                    eF2 = this;
                                                                }
                                                                Object[] objectArray = new Object[1];
                                                                objectArray[0] = l9;
                                                                CallSite callSite7 = eF.c("\u00e5", (Object)eF2.f, (Object)objectArray, (long)1007885065898591896L, (long)l5);
                                                                try {
                                                                    try {
                                                                        object = callSite7;
                                                                        if (callSite3 != null) break block71;
                                                                        if (object != false) break block72;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw eF.c("\u00d4", (Object)matchException, (long)1008095269652152071L, (long)l5);
                                                                    }
                                                                    this.A = 0;
                                                                    return;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw eF.c("\u00d4", (Object)matchException, (long)1008095269652152071L, (long)l5);
                                                                }
                                                            }
                                                            object = this.A;
                                                        }
                                                        try {
                                                            try {
                                                                try {
                                                                    if (callSite3 != null) break block73;
                                                                    if (object == false) break block74;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw eF.c("\u00d4", (Object)matchException, (long)1008095269652152071L, (long)l5);
                                                                }
                                                                object = eF.c("\u00e5", (Object)((Boolean)((Object)eF.c("\u00e5", (Object)this.e, (long)993694422994813806L, (long)l5))), (long)993209070064095072L, (long)l5);
                                                                if (callSite3 != null) break block73;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw eF.c("\u00d4", (Object)matchException, (long)1008095269652152071L, (long)l5);
                                                            }
                                                            if (object != false) break block74;
                                                            return;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw eF.c("\u00d4", (Object)matchException, (long)1008095269652152071L, (long)l5);
                                                        }
                                                    }
                                                    Object[] objectArray = new Object[2];
                                                    objectArray[1] = l8;
                                                    objectArray[0] = this.g;
                                                    object = eF.c("\u00e5", (Object)this.u, (Object)objectArray, (long)993480779113391632L, (long)l5);
                                                }
                                                if (object == false) {
                                                    return;
                                                }
                                                callSite = eF.c("C", (Object)b, (long)1006402517724519824L, (long)l5);
                                                try {
                                                    try {
                                                        callSite5 = callSite;
                                                        if (callSite3 != null) break block75;
                                                        if (!(callSite5 instanceof class_3965)) return;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw eF.c("\u00d4", (Object)matchException, (long)1008095269652152071L, (long)l5);
                                                    }
                                                    callSite5 = callSite;
                                                }
                                                catch (MatchException matchException) {
                                                    throw eF.c("\u00d4", (Object)matchException, (long)1008095269652152071L, (long)l5);
                                                }
                                            }
                                            class_39652 = (class_3965)callSite5;
                                            try {
                                                try {
                                                    class_39653 = class_39652;
                                                    if (callSite3 != null) break block76;
                                                    if (eF.c("\u00e5", (Object)class_39653, (long)994995911053432445L, (long)l5) == eF.c("\u00c8", (long)1004530932917195449L, (long)l5)) break block77;
                                                    return;
                                                }
                                                catch (MatchException matchException) {
                                                    throw eF.c("\u00d4", (Object)matchException, (long)1008095269652152071L, (long)l5);
                                                }
                                            }
                                            catch (MatchException matchException) {
                                                throw eF.c("\u00d4", (Object)matchException, (long)1008095269652152071L, (long)l5);
                                            }
                                        }
                                        class_39653 = class_39652;
                                    }
                                    try {
                                        Object[] objectArray = new Object[2];
                                        objectArray[1] = l7;
                                        objectArray[0] = class_39653;
                                        callSite4 = eF.c("\u00d4", (Object)objectArray, (long)1006514934037167638L, (long)l5);
                                        if (callSite3 != null) break block78;
                                        if (callSite4 != false) break block79;
                                        return;
                                    }
                                    catch (MatchException matchException) {
                                        throw eF.c("\u00d4", (Object)matchException, (long)1008095269652152071L, (long)l5);
                                    }
                                }
                                callSite4 = eF.c("\u00e5", (Object)eF.c("\u00e5", (Object)eF.c("C", (Object)b, (long)1006013802867803208L, (long)l5), (Object)eF.c("\u00e5", (Object)class_39652, (long)993843060289785049L, (long)l5), (long)1004470890713580599L, (long)l5), (Object)eF.c("\u00c8", (long)994427030012442614L, (long)l5), (long)1004660759225216503L, (long)l5);
                            }
                            try {
                                if (callSite3 != null) break block80;
                                if (callSite4 == false) break block81;
                                return;
                            }
                            catch (MatchException matchException) {
                                throw eF.c("\u00d4", (Object)matchException, (long)1008095269652152071L, (long)l5);
                            }
                        }
                        callSite4 = eF.c("\u00e5", (Object)eF.c("\u00e5", (Object)eF.c("C", (Object)b, (long)1006013802867803208L, (long)l5), (Object)eF.c("\u00e5", (Object)class_39652, (long)993843060289785049L, (long)l5), (long)1004470890713580599L, (long)l5), (long)995217928001626080L, (long)l5);
                    }
                    try {
                        if (callSite4 == false) break block82;
                        callSite2 = eF.c("\u00e5", (Object)class_39652, (long)993843060289785049L, (long)l5);
                        break block83;
                    }
                    catch (MatchException matchException) {
                        throw eF.c("\u00d4", (Object)matchException, (long)1008095269652152071L, (long)l5);
                    }
                }
                Object[] objectArray = new Object[2];
                objectArray[1] = l6;
                objectArray[0] = class_39652;
                callSite2 = eF.c("\u00d4", (Object)objectArray, (long)1008186296080619240L, (long)l5);
            }
            callSite = callSite2;
            try {
                try {
                    if (callSite3 != null) return;
                    if (eF.c("\u00e5", (Object)eF.c("\u00e5", (Object)eF.c("C", (Object)b, (long)991557327334271029L, (long)l5), (long)994932444429056142L, (long)l5), (Object)new class_238((class_2338)callSite), (long)1004823178479463139L, (long)l5) == false) break block84;
                    return;
                }
                catch (MatchException matchException) {
                    throw eF.c("\u00d4", (Object)matchException, (long)1008095269652152071L, (long)l5);
                }
            }
            catch (MatchException matchException) {
                throw eF.c("\u00d4", (Object)matchException, (long)1008095269652152071L, (long)l5);
            }
        }
        this.A = 1;
        this.x = class_39652;
        this.y = callSite;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        this.z = (int)eF.c("\u00d4", (Object)objectArray, (long)1005092127625055172L, (long)l5);
        this.w = l_0.PLACE_1;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        eF.c("\u00e5", (Object)this.u, (Object)objectArray2, (long)1004594978974928180L, (long)l5);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        eF.c("\u00e5", (Object)this.g, (Object)objectArray3, (long)994171092255546254L, (long)l5);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l;
        objectArray4[0] = eF.b("b", (int)1053, (long)(0x72B27E25E8B25725L ^ l5));
        eF.c("\u00e5", (Object)this, (Object)objectArray4, (long)994362581432708412L, (long)l5);
    }

    private boolean a(Object[] objectArray) {
        Object object;
        block8: {
            block7: {
                CallSite callSite;
                long l;
                block6: {
                    class_2338 class_23382 = (class_2338)objectArray[0];
                    l = (Long)objectArray[1];
                    l = D ^ l;
                    callSite = eF.c("\u00d4", (long)2755592256599576159L, (long)l);
                    try {
                        try {
                            object = eF.c("\u00e5", (Object)eF.c("\u00e5", (Object)eF.c("C", (Object)b, (long)2755952791420366721L, (long)l), (Object)class_23382, (long)2754391781918126078L, (long)l), (Object)eF.c("\u00c8", (long)2739844790269516863L, (long)l), (long)2754036849355556414L, (long)l);
                            if (callSite != null) break block6;
                            if (object == false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw eF.c("\u00d4", (Object)matchException, (long)2752949521575449806L, (long)l);
                        }
                        object = eF.c("\u00e5", (Object)((Integer)((Object)eF.c("\u00e5", (Object)eF.c("\u00e5", (Object)eF.c("C", (Object)b, (long)2755952791420366721L, (long)l), (Object)class_23382, (long)2754391781918126078L, (long)l), (Object)eF.c("\u00c8", (long)2738321500945780415L, (long)l), (long)2741389537241410529L, (long)l))), (long)2754636033318219944L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw eF.c("\u00d4", (Object)matchException, (long)2752949521575449806L, (long)l);
                    }
                }
                try {
                    if (callSite != null) break block8;
                    if (object <= 0) break block7;
                }
                catch (MatchException matchException) {
                    throw eF.c("\u00d4", (Object)matchException, (long)2752949521575449806L, (long)l);
                }
                object = 1;
                break block8;
            }
            object = 0;
        }
        return (boolean)object;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    @bP
    public void a(bh_0 bh_02) {
        block34: {
            long l;
            long l2;
            long l3;
            block42: {
                CallSite callSite;
                class_3965 class_39652;
                long l4;
                block43: {
                    block41: {
                        CallSite callSite2;
                        block40: {
                            block38: {
                                block39: {
                                    block37: {
                                        long l5;
                                        block36: {
                                            Object object;
                                            block35: {
                                                long l6;
                                                block33: {
                                                    long l7;
                                                    block31: {
                                                        block32: {
                                                            long l8 = l3 = D ^ 0x50A1E3A27455L;
                                                            l4 = l8 ^ 0x4F6C0C030E6FL;
                                                            l2 = l8 ^ 0x4DB7824F2A70L;
                                                            l5 = l8 ^ 0x27EED596CA0L;
                                                            l7 = l8 ^ 0x1AE3DB0812E1L;
                                                            l = l8 ^ 0x2B4E174B7B0CL;
                                                            l6 = l8 ^ 0x233F025CF7B3L;
                                                            callSite2 = eF.c("\u00d4", (long)3876703097950461358L, (long)l3);
                                                            try {
                                                                object = this.B;
                                                                if (callSite2 != null) break block31;
                                                                if (!object) break block32;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw eF.c("\u00d4", (Object)matchException, (long)3874632119305570111L, (long)l3);
                                                            }
                                                            return;
                                                        }
                                                        object = eF.c("\u00e5", (Object)bh_02, (Object)new Object[0], (long)3886745253185748736L, (long)l3) instanceof class_2885;
                                                    }
                                                    try {
                                                        try {
                                                            if (callSite2 != null) break block33;
                                                            if (!object) break block34;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw eF.c("\u00d4", (Object)matchException, (long)3874632119305570111L, (long)l3);
                                                        }
                                                        Object[] objectArray = new Object[2];
                                                        objectArray[1] = l7;
                                                        objectArray[0] = Float.valueOf(200.0f);
                                                        object = eF.c("\u00e5", (Object)this.n, (Object)objectArray, (long)3889678735668933524L, (long)l3);
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw eF.c("\u00d4", (Object)matchException, (long)3874632119305570111L, (long)l3);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        if (callSite2 != null) break block35;
                                                        if (!object) break block34;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw eF.c("\u00d4", (Object)matchException, (long)3874632119305570111L, (long)l3);
                                                    }
                                                    Object[] objectArray = new Object[2];
                                                    objectArray[1] = l6;
                                                    objectArray[0] = eF.c("\u00c8", (long)3876254587231021642L, (long)l3);
                                                    object = eF.c("\u00d4", (Object)objectArray, (long)3887661370724512221L, (long)l3);
                                                }
                                                catch (MatchException matchException) {
                                                    throw eF.c("\u00d4", (Object)matchException, (long)3874632119305570111L, (long)l3);
                                                }
                                            }
                                            if (!object) {
                                                return;
                                            }
                                            class_39652 = (class_3965)eF.c("C", (Object)b, (long)3877451866356737448L, (long)l3);
                                            try {
                                                try {
                                                    try {
                                                        if (class_39652 == null) break block34;
                                                        callSite = eF.c("\u00e5", (Object)eF.c("\u00e5", (Object)eF.c("C", (Object)b, (long)3877062807732780144L, (long)l3), (Object)eF.c("\u00e5", (Object)class_39652, (long)3887410029604009185L, (long)l3), (long)3875511135758007311L, (long)l3), (Object)eF.c("\u00c8", (long)3887985477716348878L, (long)l3), (long)3875709832937706959L, (long)l3);
                                                        if (callSite2 != null) break block36;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw eF.c("\u00d4", (Object)matchException, (long)3874632119305570111L, (long)l3);
                                                    }
                                                    if (callSite == false) break block34;
                                                }
                                                catch (MatchException matchException) {
                                                    throw eF.c("\u00d4", (Object)matchException, (long)3874632119305570111L, (long)l3);
                                                }
                                                callSite = eF.c("\u00e5", (Object)((Integer)((Object)eF.c("\u00e5", (Object)eF.c("\u00e5", (Object)eF.c("C", (Object)b, (long)3877062807732780144L, (long)l3), (Object)eF.c("\u00e5", (Object)class_39652, (long)3887410029604009185L, (long)l3), (long)3875511135758007311L, (long)l3), (Object)eF.c("\u00c8", (long)3887024871923850574L, (long)l3), (long)3889521426464389136L, (long)l3))), (long)3876309019047846745L, (long)l3);
                                            }
                                            catch (MatchException matchException) {
                                                throw eF.c("\u00d4", (Object)matchException, (long)3874632119305570111L, (long)l3);
                                            }
                                        }
                                        try {
                                            try {
                                                if (callSite2 != null) break block37;
                                                if (callSite == false) break block34;
                                            }
                                            catch (MatchException matchException) {
                                                throw eF.c("\u00d4", (Object)matchException, (long)3874632119305570111L, (long)l3);
                                            }
                                            Object[] objectArray = new Object[3];
                                            objectArray[2] = l5;
                                            objectArray[1] = Float.valueOf(100.0f);
                                            objectArray[0] = Float.valueOf(0.0f);
                                            reference cfr_temp_0 = eF.c("\u00d4", (Object)objectArray, (long)3876047055296648271L, (long)l3) - eF.c("\u00e5", (Object)((Float)((Object)eF.c("\u00e5", (Object)this.a, (long)3887244178593004374L, (long)l3))), (long)3874692945392569402L, (long)l3);
                                            callSite = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                        }
                                        catch (MatchException matchException) {
                                            throw eF.c("\u00d4", (Object)matchException, (long)3874632119305570111L, (long)l3);
                                        }
                                    }
                                    try {
                                        if (callSite2 != null) break block38;
                                        if (callSite <= 0) break block39;
                                    }
                                    catch (MatchException matchException) {
                                        throw eF.c("\u00d4", (Object)matchException, (long)3874632119305570111L, (long)l3);
                                    }
                                    return;
                                }
                                callSite = eF.c("\u00e5", (Object)eF.c("\u00e5", (Object)class_39652, (long)3887410029604009185L, (long)l3), (Object)this.p, (long)3877461129520467590L, (long)l3);
                            }
                            try {
                                try {
                                    if (callSite2 != null) break block40;
                                    if (callSite == false) break block41;
                                }
                                catch (MatchException matchException) {
                                    throw eF.c("\u00d4", (Object)matchException, (long)3874632119305570111L, (long)l3);
                                }
                                callSite = (CallSite)this.q;
                            }
                            catch (MatchException matchException) {
                                throw eF.c("\u00d4", (Object)matchException, (long)3874632119305570111L, (long)l3);
                            }
                        }
                        try {
                            try {
                                if (callSite2 != null) break block42;
                                if (callSite < 1) break block43;
                            }
                            catch (MatchException matchException) {
                                throw eF.c("\u00d4", (Object)matchException, (long)3874632119305570111L, (long)l3);
                            }
                            return;
                        }
                        catch (MatchException matchException) {
                            throw eF.c("\u00d4", (Object)matchException, (long)3874632119305570111L, (long)l3);
                        }
                    }
                    this.p = eF.c("\u00e5", (Object)class_39652, (long)3887410029604009185L, (long)l3);
                    this.q = 0;
                }
                Object[] objectArray = new Object[1];
                objectArray[0] = l2;
                eF.c("\u00e5", (Object)this.n, (Object)objectArray, (long)3875635429749830924L, (long)l3);
                this.t = (int)(eF.c("C", (Object)eF.c("C", (Object)b, (long)3889619202623459341L, (long)l3), (long)3877242918754090859L, (long)l3) + 2);
                s = 1;
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = l4;
                objectArray2[0] = class_39652;
                callSite = eF.c("\u00d4", (Object)objectArray2, (long)3875923198649197669L, (long)l3);
            }
            this.r = 1;
            Object[] objectArray = new Object[1];
            objectArray[0] = l;
            eF.c("\u00e5", (Object)this.c, (Object)objectArray, (long)3887747202172560310L, (long)l3);
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = l2;
            eF.c("\u00e5", (Object)this.o, (Object)objectArray3, (long)3875635429749830924L, (long)l3);
            ++this.q;
        }
    }

    private class_3965 a(Object[] objectArray) {
        CallSite callSite;
        long l;
        class_2338 class_23382;
        block5: {
            CallSite callSite2;
            block4: {
                class_23382 = (class_2338)objectArray[0];
                l = (Long)objectArray[1];
                long l2 = (l = D ^ l) ^ 0x40F4F1935505L;
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = l2;
                objectArray2[0] = class_23382;
                callSite = eF.c("\u00d4", (Object)objectArray2, (long)2073804068527030874L, (long)l);
                CallSite callSite3 = eF.c("\u00d4", (long)2073215331250697383L, (long)l);
                try {
                    try {
                        callSite2 = callSite;
                        if (callSite3 != null) break block4;
                        if (callSite2 != null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw eF.c("\u00d4", (Object)matchException, (long)2075086115025333814L, (long)l);
                    }
                    callSite2 = new class_243((double)eF.c("\u00e5", (Object)class_23382, (long)2087621981971780609L, (long)l) + 0.5, (double)eF.c("\u00e5", (Object)class_23382, (long)2072861809437349445L, (long)l) + 1.0, (double)eF.c("\u00e5", (Object)class_23382, (long)2072065256859087852L, (long)l) + 0.5);
                }
                catch (MatchException matchException) {
                    throw eF.c("\u00d4", (Object)matchException, (long)2075086115025333814L, (long)l);
                }
            }
            callSite = callSite2;
        }
        return new class_3965((class_243)callSite, (class_2350)eF.c("\u00c8", (long)2072967771200425992L, (long)l), class_23382, false);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @bP
    public void a(bd_0 var1_1) {
        block47: {
            block48: {
                block45: {
                    block44: {
                        block42: {
                            block43: {
                                block40: {
                                    block41: {
                                        block39: {
                                            block36: {
                                                block38: {
                                                    block37: {
                                                        v0 = var2_2 = eF.D ^ 41815414877037L;
                                                        var4_3 = v0 ^ 7097892062393L;
                                                        var6_4 = v0 ^ 119047104056793L;
                                                        var8_5 = eF.c("\u00d4", (long)7706967705666912918L, (long)var2_2);
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        v1 = this.B;
                                                                        if (var8_5 != null) break block36;
                                                                        if (v1 == 0) {
                                                                        }
                                                                        ** GOTO lbl39
                                                                    }
                                                                    catch (MatchException v2) {
                                                                        throw eF.c("\u00d4", (Object)v2, (long)7709322278715414535L, (long)var2_2);
                                                                    }
                                                                    v3 = eF.c("C", (Object)eF.b, (long)7692925142606384949L, (long)var2_2);
                                                                    if (var8_5 != null) break block37;
                                                                }
                                                                catch (MatchException v4) {
                                                                    throw eF.c("\u00d4", (Object)v4, (long)7709322278715414535L, (long)var2_2);
                                                                }
                                                                if (v3 == null) break block38;
                                                            }
                                                            catch (MatchException v5) {
                                                                throw eF.c("\u00d4", (Object)v5, (long)7709322278715414535L, (long)var2_2);
                                                            }
                                                            v3 = eF.c("C", (Object)eF.b, (long)7692925142606384949L, (long)var2_2);
                                                        }
                                                        catch (MatchException v6) {
                                                            throw eF.c("\u00d4", (Object)v6, (long)7709322278715414535L, (long)var2_2);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            v1 = (int)eF.c("C", (Object)v3, (long)7707573497445032019L, (long)var2_2);
                                                            if (var8_5 != null) break block36;
                                                            if (v1 > this.t) break block38;
                                                        }
                                                        catch (MatchException v7) {
                                                            throw eF.c("\u00d4", (Object)v7, (long)7709322278715414535L, (long)var2_2);
                                                        }
lbl39:
                                                        // 2 sources

                                                        v1 = 1;
                                                        break block36;
                                                    }
                                                    catch (MatchException v8) {
                                                        throw eF.c("\u00d4", (Object)v8, (long)7709322278715414535L, (long)var2_2);
                                                    }
                                                }
                                                v1 = 0;
                                            }
                                            try {
                                                try {
                                                    eF.s = v1;
                                                    v9 /* !! */  = eF.c("\u00e5", (Object)((Boolean)eF.c("\u00e5", (Object)this.d, (long)7695021574774908014L, (long)var2_2)), (long)7694660449477175392L, (long)var2_2);
                                                    if (var8_5 != null) break block39;
                                                    if (v9 /* !! */  == false) break block40;
                                                }
                                                catch (MatchException v10) {
                                                    throw eF.c("\u00d4", (Object)v10, (long)7709322278715414535L, (long)var2_2);
                                                }
                                                v9 /* !! */  = (CallSite)this.r;
                                            }
                                            catch (MatchException v11) {
                                                throw eF.c("\u00d4", (Object)v11, (long)7709322278715414535L, (long)var2_2);
                                            }
                                        }
                                        try {
                                            try {
                                                if (var8_5 != null) break block41;
                                                if (v9 /* !! */  == false) break block40;
                                            }
                                            catch (MatchException v12) {
                                                throw eF.c("\u00d4", (Object)v12, (long)7709322278715414535L, (long)var2_2);
                                            }
                                            v13 = new Object[2];
                                            v13[1] = var6_4;
                                            v13[0] = Float.valueOf((float)eF.c("\u00e5", (Object)((Float)eF.c("\u00e5", (Object)this.c, (long)7695021574774908014L, (long)var2_2)), (long)7709557909659013890L, (long)var2_2));
                                            v9 /* !! */  = eF.c("\u00e5", (Object)this.o, (Object)v13, (long)7692883280130911404L, (long)var2_2);
                                        }
                                        catch (MatchException v14) {
                                            throw eF.c("\u00d4", (Object)v14, (long)7709322278715414535L, (long)var2_2);
                                        }
                                    }
                                    try {
                                        if (var8_5 != null) break block42;
                                        if (v9 /* !! */  != false) break block43;
                                    }
                                    catch (MatchException v15) {
                                        throw eF.c("\u00d4", (Object)v15, (long)7709322278715414535L, (long)var2_2);
                                    }
                                }
                                return;
                            }
                            try {
                                v16 = eF.c("C", (Object)eF.b, (long)7707646105496795792L, (long)var2_2);
                                if (var8_5 != null) break block44;
                                v9 /* !! */  = (CallSite)(v16 instanceof class_3965);
                            }
                            catch (MatchException v17) {
                                throw eF.c("\u00d4", (Object)v17, (long)7709322278715414535L, (long)var2_2);
                            }
                        }
                        try {
                            if (v9 /* !! */  == false) {
                                this.r = 0;
                                return;
                            }
                        }
                        catch (MatchException v18) {
                            throw eF.c("\u00d4", (Object)v18, (long)7709322278715414535L, (long)var2_2);
                        }
                        v16 = eF.c("C", (Object)eF.b, (long)7707646105496795792L, (long)var2_2);
                    }
                    var9_6 = (class_3965)v16;
                    try {
                        block46: {
                            try {
                                try {
                                    try {
                                        if (var8_5 != null) break block45;
                                        if (eF.c("\u00e5", (Object)eF.c("\u00e5", (Object)eF.c("C", (Object)eF.b, (long)7707469527530545992L, (long)var2_2), (Object)eF.c("\u00e5", (Object)var9_6, (long)7695152533396204505L, (long)var2_2), (long)7705907994075882295L, (long)var2_2), (long)7707341696161218910L, (long)var2_2) != eF.c("\u00c8", (long)7695684842565423350L, (long)var2_2)) break block46;
                                    }
                                    catch (MatchException v19) {
                                        throw eF.c("\u00d4", (Object)v19, (long)7709322278715414535L, (long)var2_2);
                                    }
                                    v20 = eF.c("\u00e5", (Object)((Integer)eF.c("\u00e5", (Object)eF.c("\u00e5", (Object)eF.c("C", (Object)eF.b, (long)7707469527530545992L, (long)var2_2), (Object)eF.c("\u00e5", (Object)var9_6, (long)7695152533396204505L, (long)var2_2), (long)7705907994075882295L, (long)var2_2), (Object)eF.c("\u00c8", (long)7694692574643110518L, (long)var2_2), (long)7692761172184885032L, (long)var2_2)), (long)7706534336571128929L, (long)var2_2);
                                    if (var8_5 != null) break block47;
                                }
                                catch (MatchException v21) {
                                    throw eF.c("\u00d4", (Object)v21, (long)7709322278715414535L, (long)var2_2);
                                }
                                if (v20 == false) break block48;
                            }
                            catch (MatchException v22) {
                                throw eF.c("\u00d4", (Object)v22, (long)7709322278715414535L, (long)var2_2);
                            }
                        }
                        this.r = 0;
                    }
                    catch (MatchException v23) {
                        throw eF.c("\u00d4", (Object)v23, (long)7709322278715414535L, (long)var2_2);
                    }
                }
                return;
            }
            this.r = 0;
            this.t = (int)(eF.c("C", (Object)eF.c("C", (Object)eF.b, (long)7692925142606384949L, (long)var2_2), (long)7707573497445032019L, (long)var2_2) + 2);
            eF.s = 1;
            v24 = new Object[4];
            v24[3] = var4_3;
            v24[2] = false;
            v24[1] = (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$onMotionUpdate$9(net.minecraft.class_3965 ), ()V)((class_3965)var9_6);
            v24[0] = eF.c("\u00c8", (long)7709227949074774367L, (long)var2_2);
            v20 = eF.c("\u00d4", (Object)v24, (long)7692850836002734599L, (long)var2_2);
        }
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (I[n3] != null) {
            return n3;
        }
        Object object = H[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 61;
            case 1 -> 46;
            case 2 -> 56;
            case 3 -> 54;
            case 4 -> 53;
            case 5 -> 52;
            case 6 -> 57;
            case 7 -> 20;
            case 8 -> 5;
            case 9 -> 62;
            case 10 -> 12;
            case 11 -> 19;
            case 12 -> 31;
            case 13 -> 43;
            case 14 -> 41;
            case 15 -> 59;
            case 16 -> 37;
            case 17 -> 2;
            case 18 -> 14;
            case 19 -> 9;
            case 20 -> 26;
            case 21 -> 33;
            case 22 -> 60;
            case 23 -> 13;
            case 24 -> 34;
            case 25 -> 40;
            case 26 -> 58;
            case 27 -> 1;
            case 28 -> 42;
            case 29 -> 22;
            case 30 -> 3;
            case 31 -> 29;
            case 32 -> 6;
            case 33 -> 55;
            case 34 -> 25;
            case 35 -> 38;
            case 36 -> 15;
            case 37 -> 50;
            case 38 -> 32;
            case 39 -> 28;
            case 40 -> 44;
            case 41 -> 49;
            case 42 -> 8;
            case 43 -> 11;
            case 44 -> 36;
            case 45 -> 17;
            case 46 -> 0;
            case 47 -> 48;
            case 48 -> 27;
            case 49 -> 63;
            case 50 -> 45;
            case 51 -> 10;
            case 52 -> 35;
            case 53 -> 30;
            case 54 -> 39;
            case 55 -> 47;
            case 56 -> 4;
            case 57 -> 21;
            case 58 -> 16;
            case 59 -> 7;
            case 60 -> 24;
            case 61 -> 18;
            case 62 -> 23;
            default -> 51;
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
        eF.I[n3] = new String(cArray);
        return n3;
    }

    private void m(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = D ^ l) ^ 0x3CE01F8F17BCL;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l2;
        objectArray2[2] = x_0.INFO;
        objectArray2[1] = string;
        objectArray2[0] = this;
        eF.c("\u00d4", (Object)objectArray2, (long)-8240353924335164757L, (long)l);
    }

    private static Field o(long l, long l2) {
        int n = eF.m(l, l2);
        Object object = H[n];
        if (object instanceof String) {
            String string = I[n];
            int n2 = string.indexOf(8);
            Class clazz = eF.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = eF.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = eF.g(clazz3, string2, clazz2)) != null) {
                    eF.H[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = eF.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        eF.H[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = eF.n(1171054695337537L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = eF.m(l, l2);
        Object object = H[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = I[n];
                int n3 = string2.indexOf(8);
                clazz3 = eF.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = eF.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = eF.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        eF.H[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = eF.n(1171054695337537L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = eF.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        eF.H[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = eF.n(1171054695337537L, 0L);
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
     * Exception decompiling
     */
    private void k(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
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

    private boolean g(Object[] objectArray) {
        Object object;
        block14: {
            long l;
            long l2;
            class_3965 class_39652;
            block15: {
                CallSite callSite;
                block12: {
                    long l3;
                    block13: {
                        class_39652 = (class_3965)objectArray[0];
                        l2 = (Long)objectArray[1];
                        long l4 = l2 = D ^ l2;
                        l = l4 ^ 0xAE814DAB669L;
                        long l5 = l4 ^ 0x66BB1A854FB5L;
                        l3 = l4 ^ 0x4344A44DC4ABL;
                        callSite = eF.c("\u00d4", (long)-8229601088376412760L, (long)l2);
                        try {
                            try {
                                try {
                                    try {
                                        object = eF.c("\u00e5", (Object)eF.b("b", (int)7591, (long)(0x2F7CDB9027AC4EA8L ^ l2)), (Object)eF.c("\u00e5", (Object)this.h, (long)-8217936306556894384L, (long)l2), (long)-8217663024807288076L, (long)l2);
                                        if (callSite != null) break block12;
                                        if (object == false) break block13;
                                    }
                                    catch (MatchException matchException) {
                                        throw eF.c("\u00d4", (Object)matchException, (long)-8231681927986364615L, (long)l2);
                                    }
                                    Object[] objectArray2 = new Object[2];
                                    objectArray2[1] = l5;
                                    objectArray2[0] = eF.c("\u00c8", (long)-8231842503723737503L, (long)l2);
                                    object = eF.c("\u00d4", (Object)objectArray2, (long)-8217386039156454949L, (long)l2);
                                    if (callSite != null) break block14;
                                }
                                catch (MatchException matchException) {
                                    throw eF.c("\u00d4", (Object)matchException, (long)-8231681927986364615L, (long)l2);
                                }
                                if (object != false) break block15;
                            }
                            catch (MatchException matchException) {
                                throw eF.c("\u00d4", (Object)matchException, (long)-8231681927986364615L, (long)l2);
                            }
                            return false;
                        }
                        catch (MatchException matchException) {
                            throw eF.c("\u00d4", (Object)matchException, (long)-8231681927986364615L, (long)l2);
                        }
                    }
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = l3;
                    objectArray3[0] = eF.c("\u00c8", (long)-8230271744060022906L, (long)l2);
                    object = eF.c("\u00d4", (Object)objectArray3, (long)-8218183249394423901L, (long)l2);
                }
                try {
                    try {
                        if (callSite != null) break block14;
                        if (object != false) break block15;
                    }
                    catch (MatchException matchException) {
                        throw eF.c("\u00d4", (Object)matchException, (long)-8231681927986364615L, (long)l2);
                    }
                    return false;
                }
                catch (MatchException matchException) {
                    throw eF.c("\u00d4", (Object)matchException, (long)-8231681927986364615L, (long)l2);
                }
            }
            Object[] objectArray4 = new Object[2];
            objectArray4[1] = l;
            objectArray4[0] = class_39652;
            eF.c("\u00d4", (Object)objectArray4, (long)-8229116549815346077L, (long)l2);
            object = 1;
        }
        return (boolean)object;
    }

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private void j(Object[] objectArray) {
        this.w = l_0.IDLE;
        this.x = null;
        this.y = null;
        this.z = -1;
        this.B = 0;
        this.C = 0;
    }

    private boolean lambda$new$0(Float f) {
        long l = D ^ 0x1CE41AEE2F3EL;
        return (boolean)eF.c("\u00e5", (Object)((Boolean)((Object)eF.c("\u00e5", (Object)this.d, (long)7969418306567397437L, (long)l))), (long)7970199307561774131L, (long)l);
    }

    private boolean lambda$new$2(Float f) {
        Object object;
        block4: {
            block5: {
                long l = D ^ 0x10F3F17C9DC1L;
                CallSite callSite = eF.c("\u00d4", (long)-2569144434748771270L, (long)l);
                try {
                    try {
                        object = eF.c("\u00e5", (Object)((Integer)((Object)eF.c("\u00e5", (Object)this.f, (long)-2565358890960858430L, (long)l))), (long)-2567286181328614707L, (long)l);
                        if (callSite != null) break block4;
                        if (object == -1) break block5;
                    }
                    catch (MatchException matchException) {
                        throw eF.c("\u00d4", (Object)matchException, (long)-2571215430629069141L, (long)l);
                    }
                    object = 1;
                    break block4;
                }
                catch (MatchException matchException) {
                    throw eF.c("\u00d4", (Object)matchException, (long)-2571215430629069141L, (long)l);
                }
            }
            object = 0;
        }
        return (boolean)object;
    }

    private boolean lambda$new$1(Boolean bl) {
        Object object;
        block4: {
            block5: {
                long l = D ^ 0x3EFD312F198AL;
                CallSite callSite = eF.c("\u00d4", (long)6346625968898257009L, (long)l);
                try {
                    try {
                        object = eF.c("\u00e5", (Object)((Integer)((Object)eF.c("\u00e5", (Object)this.f, (long)6353784818646439561L, (long)l))), (long)6346703131592625798L, (long)l);
                        if (callSite != null) break block4;
                        if (object == -1) break block5;
                    }
                    catch (MatchException matchException) {
                        throw eF.c("\u00d4", (Object)matchException, (long)6348416580250659552L, (long)l);
                    }
                    object = 1;
                    break block4;
                }
                catch (MatchException matchException) {
                    throw eF.c("\u00d4", (Object)matchException, (long)6348416580250659552L, (long)l);
                }
            }
            object = 0;
        }
        return (boolean)object;
    }

    private boolean lambda$new$3(String string) {
        Object object;
        block4: {
            block5: {
                long l = D ^ 0x59926BCA389DL;
                CallSite callSite = eF.c("\u00d4", (long)8720334326079033702L, (long)l);
                try {
                    try {
                        object = eF.c("\u00e5", (Object)((Integer)((Object)eF.c("\u00e5", (Object)this.f, (long)8735376683048499102L, (long)l))), (long)8719922912956854161L, (long)l);
                        if (callSite != null) break block4;
                        if (object == -1) break block5;
                    }
                    catch (MatchException matchException) {
                        throw eF.c("\u00d4", (Object)matchException, (long)8722764744025394167L, (long)l);
                    }
                    object = 1;
                    break block4;
                }
                catch (MatchException matchException) {
                    throw eF.c("\u00d4", (Object)matchException, (long)8722764744025394167L, (long)l);
                }
            }
            object = 0;
        }
        return (boolean)object;
    }

    private boolean lambda$new$4(Boolean bl) {
        Object object;
        block8: {
            block7: {
                CallSite callSite;
                long l;
                block6: {
                    l = D ^ 0x7AC04F1317E9L;
                    callSite = eF.c("\u00d4", (long)6228753764397825554L, (long)l);
                    try {
                        try {
                            object = eF.c("\u00e5", (Object)((Integer)((Object)eF.c("\u00e5", (Object)this.f, (long)6219024260766947562L, (long)l))), (long)6230519950160429285L, (long)l);
                            if (callSite != null) break block6;
                            if (object == -1) break block7;
                        }
                        catch (MatchException matchException) {
                            throw eF.c("\u00d4", (Object)matchException, (long)6231116029929874563L, (long)l);
                        }
                        object = eF.c("\u00e5", (String)((Object)eF.c("\u00e5", (Object)this.h, (long)6219024260766947562L, (long)l)), (Object)eF.b("b", (int)31172, (long)(0x32EEE6456CEEF17DL ^ l)), (long)6219067432260548942L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw eF.c("\u00d4", (Object)matchException, (long)6231116029929874563L, (long)l);
                    }
                }
                try {
                    if (callSite != null) break block8;
                    if (object == false) break block7;
                }
                catch (MatchException matchException) {
                    throw eF.c("\u00d4", (Object)matchException, (long)6231116029929874563L, (long)l);
                }
                object = 1;
                break block8;
            }
            object = 0;
        }
        return (boolean)object;
    }

    private static void lambda$onMotionUpdate$9(class_3965 class_39652) {
        long l = D ^ 0x3C4671E68F35L;
        long l2 = l ^ 0x238B9E47F50FL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = class_39652;
        eF.c("\u00d4", (Object)objectArray, (long)-3554915179849670907L, (long)l);
    }

    private boolean lambda$new$5(Integer n) {
        Object object;
        block8: {
            block7: {
                CallSite callSite;
                long l;
                block6: {
                    l = D ^ 0x2E7071587F31L;
                    callSite = eF.c("\u00d4", (long)4515050199663793866L, (long)l);
                    try {
                        try {
                            object = eF.c("\u00e5", (Object)((Integer)((Object)eF.c("\u00e5", (Object)this.f, (long)4509859343407493170L, (long)l))), (long)4516851295659190333L, (long)l);
                            if (callSite != null) break block6;
                            if (object == -1) break block7;
                        }
                        catch (MatchException matchException) {
                            throw eF.c("\u00d4", (Object)matchException, (long)4512901168526855259L, (long)l);
                        }
                        object = eF.c("\u00e5", (String)((Object)eF.c("\u00e5", (Object)this.h, (long)4509859343407493170L, (long)l)), (Object)eF.b("b", (int)31172, (long)(0x32EEB2F552A599A5L ^ l)), (long)4510007929304011158L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw eF.c("\u00d4", (Object)matchException, (long)4512901168526855259L, (long)l);
                    }
                }
                try {
                    if (callSite != null) break block8;
                    if (object == false) break block7;
                }
                catch (MatchException matchException) {
                    throw eF.c("\u00d4", (Object)matchException, (long)4512901168526855259L, (long)l);
                }
                object = 1;
                break block8;
            }
            object = 0;
        }
        return (boolean)object;
    }

    private boolean lambda$new$6(Boolean bl) {
        Object object;
        block4: {
            block5: {
                long l = D ^ 0x3B9D693B724FL;
                CallSite callSite = eF.c("\u00d4", (long)3735379447380401076L, (long)l);
                try {
                    try {
                        object = eF.c("\u00e5", (Object)((Integer)((Object)eF.c("\u00e5", (Object)this.f, (long)3740284298560060748L, (long)l))), (long)3733767487752529219L, (long)l);
                        if (callSite != null) break block4;
                        if (object == -1) break block5;
                    }
                    catch (MatchException matchException) {
                        throw eF.c("\u00d4", (Object)matchException, (long)3737739608173969701L, (long)l);
                    }
                    object = 1;
                    break block4;
                }
                catch (MatchException matchException) {
                    throw eF.c("\u00d4", (Object)matchException, (long)3737739608173969701L, (long)l);
                }
            }
            object = 0;
        }
        return (boolean)object;
    }

    private boolean lambda$new$8(Integer n) {
        Object object;
        block8: {
            block7: {
                CallSite callSite;
                long l;
                block6: {
                    l = D ^ 0x5E7D55329814L;
                    callSite = eF.c("\u00d4", (long)-2770313892747890193L, (long)l);
                    try {
                        try {
                            object = eF.c("\u00e5", (Object)((Integer)((Object)eF.c("\u00e5", (Object)this.f, (long)-2759777344352856297L, (long)l))), (long)-2771292260142313704L, (long)l);
                            if (callSite != null) break block6;
                            if (object == -1) break block7;
                        }
                        catch (MatchException matchException) {
                            throw eF.c("\u00d4", (Object)matchException, (long)-2772955410484171906L, (long)l);
                        }
                        object = eF.c("\u00e5", (Object)((Boolean)((Object)eF.c("\u00e5", (Object)this.k, (long)-2759777344352856297L, (long)l))), (long)-2760261734910125287L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw eF.c("\u00d4", (Object)matchException, (long)-2772955410484171906L, (long)l);
                    }
                }
                try {
                    if (callSite != null) break block8;
                    if (object == false) break block7;
                }
                catch (MatchException matchException) {
                    throw eF.c("\u00d4", (Object)matchException, (long)-2772955410484171906L, (long)l);
                }
                object = 1;
                break block8;
            }
            object = 0;
        }
        return (boolean)object;
    }

    private boolean lambda$new$7(Float f) {
        Object object;
        block8: {
            block7: {
                CallSite callSite;
                long l;
                block6: {
                    l = D ^ 0x61D329A5A254L;
                    callSite = eF.c("\u00d4", (long)-2031719782667416657L, (long)l);
                    try {
                        try {
                            object = eF.c("\u00e5", (Object)((Integer)((Object)eF.c("\u00e5", (Object)this.f, (long)-2021145849551491753L, (long)l))), (long)-2032711190387706536L, (long)l);
                            if (callSite != null) break block6;
                            if (object == -1) break block7;
                        }
                        catch (MatchException matchException) {
                            throw eF.c("\u00d4", (Object)matchException, (long)-2034426293864312514L, (long)l);
                        }
                        object = eF.c("\u00e5", (Object)((Boolean)((Object)eF.c("\u00e5", (Object)this.k, (long)-2021145849551491753L, (long)l))), (long)-2021646475355545255L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw eF.c("\u00d4", (Object)matchException, (long)-2034426293864312514L, (long)l);
                    }
                }
                try {
                    if (callSite != null) break block8;
                    if (object == false) break block7;
                }
                catch (MatchException matchException) {
                    throw eF.c("\u00d4", (Object)matchException, (long)-2034426293864312514L, (long)l);
                }
                object = 1;
                break block8;
            }
            object = 0;
        }
        return (boolean)object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(eF.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(eF.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


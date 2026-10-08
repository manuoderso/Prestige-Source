/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1684
 *  net.minecraft.class_1799
 *  net.minecraft.class_1937
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.dC;
import dev.zprestige.prestige.dF;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dQ;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.f5;
import dev.zprestige.prestige.g3;
import dev.zprestige.prestige.gG;
import dev.zprestige.prestige.gH;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1684;
import net.minecraft.class_1799;
import net.minecraft.class_1937;
import net.minecraft.class_243;
import net.minecraft.class_310;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.fi
 */
public class fi_0
extends dV
implements dF {
    public static boolean a;
    private dO c;
    private dO d;
    private dO e;
    private dO f;
    private dQ g;
    private dQ h;
    private dM i;
    private dM j;
    private Set k;
    private f5 l;
    private f5 m;
    private int n;
    private class_243 o;
    private static final int p;
    private static final float q = 1.5f;
    private static final float r = -85.0f;
    private static final float s = 85.0f;
    private static final float t = 2.0f;
    private static final float u = 0.2f;
    private static final float v = 2.2f;
    private static final float w = 6.0f;
    private static final int x;
    private static final double y = 0.25;
    private static final long z;
    private static final long[] A;
    private static final Integer[] B;
    private static final Map C;
    private static final Object[] D;
    private static final String[] E;

    public fi_0() {
        long l = z ^ 0x7F83E27663BCL;
        long l2 = l ^ 0x17443585B1C2L;
        this.k = new HashSet();
        this.l = new f5(l2);
        this.m = new f5(l2);
        this.n = -1;
        this.o = null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                fi_0.z = hc.a(-8192991093839810626L, 2456072978510206151L, MethodHandles.lookup().lookupClass()).a(181260955231847L);
                fi_0.D = new Object[178];
                fi_0.E = new String[178];
                fi_0.f();
                fi_0.C = new HashMap<K, V>(13);
                var0 = fi_0.z ^ 103097114810485L;
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
                var6_5 = "\u00e8T\u00da2x\u00f5\u0080\u00b36\u001a9\u0084\u009f\u00a0\u00db\u0011";
                var7_6 = "\u00e8T\u00da2x\u00f5\u0080\u00b36\u001a9\u0084\u009f\u00a0\u00db\u0011".length();
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
                    var6_5 = "\u00d5\u0095\u0017\u0094Q9\u00ff\u00a350\u00850\u0019\u00b7hI";
                    var7_6 = "\u00d5\u0095\u0017\u0094Q9\u00ff\u00a350\u00850\u0019\u00b7hI".length();
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
        fi_0.A = var8_3;
        fi_0.B = new Integer[4];
        fi_0.x = (int)fi_0.b("a", (int)2074, (long)(var0 ^ 6117697360612563675L));
        fi_0.p = (int)fi_0.b("a", (int)6967, (long)(var0 ^ 513018972361787895L));
    }

    @Override
    public void e(Object[] objectArray) {
        int n;
        block6: {
            long l;
            block7: {
                l = (Long)objectArray[0];
                long l2 = l;
                long l3 = l2 ^ 0x7FAB131DDD11L;
                long l4 = l2 ^ 0x5A266ADED12L;
                CallSite callSite = fi_0.c("\u00e8", (long)3995474894649838236L, (long)l);
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = l3;
                objectArray2[0] = this;
                fi_0.c("S", (Object)fi_0.c("\u00c5", (long)3997840830514487073L, (long)l), (Object)objectArray2, (long)3998240852435646645L, (long)l);
                CallSite callSite2 = callSite;
                try {
                    try {
                        try {
                            n = this.n;
                            if (callSite2 != null) break block6;
                            if (n == -1) break block7;
                        }
                        catch (MatchException matchException) {
                            throw fi_0.c("\u00e8", (Object)matchException, (long)3985469707502893230L, (long)l);
                        }
                        if (fi_0.c("D", (Object)b, (long)3982697962481983264L, (long)l) == null) break block7;
                    }
                    catch (MatchException matchException) {
                        throw fi_0.c("\u00e8", (Object)matchException, (long)3985469707502893230L, (long)l);
                    }
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = l4;
                    objectArray3[0] = this.n;
                    fi_0.c("\u00e8", (Object)objectArray3, (long)3984787970035493835L, (long)l);
                }
                catch (MatchException matchException) {
                    throw fi_0.c("\u00e8", (Object)matchException, (long)3985469707502893230L, (long)l);
                }
            }
            fi_0.c("S", (Object)this.k, (long)3981761824846038169L, (long)l);
            this.o = null;
            this.n = -1;
            n = 0;
        }
        a = n;
    }

    private boolean e(Object[] objectArray) {
        int n;
        block9: {
            block7: {
                gH gH2;
                CallSite callSite;
                long l;
                gH gH3;
                block8: {
                    gH gH4;
                    block6: {
                        gH4 = (gH)objectArray[0];
                        gH3 = (gH)objectArray[1];
                        l = (Long)objectArray[2];
                        l = z ^ l;
                        callSite = fi_0.c("\u00e8", (long)4191102310201903047L, (long)l);
                        try {
                            gH2 = gH4;
                            if (callSite != null) break block6;
                            if (gH2 == null) break block7;
                        }
                        catch (MatchException matchException) {
                            throw fi_0.c("\u00e8", (Object)matchException, (long)4185029270163502581L, (long)l);
                        }
                        gH2 = gH3;
                    }
                    try {
                        if (callSite != null) break block8;
                        if (gH2 == null) break block7;
                    }
                    catch (MatchException matchException) {
                        throw fi_0.c("\u00e8", (Object)matchException, (long)4185029270163502581L, (long)l);
                    }
                    gH2 = gH4;
                }
                try {
                    reference cfr_temp_0 = fi_0.c("\u00e8", (float)(fi_0.c("S", (Object)gH2, (long)4190054103714598701L, (long)l) - fi_0.c("S", (Object)gH3, (long)4190054103714598701L, (long)l)), (long)4187043502433704710L, (long)l) - 6.0f;
                    n = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                    if (callSite != null) break block9;
                    if (n >= 0) break block7;
                }
                catch (MatchException matchException) {
                    throw fi_0.c("\u00e8", (Object)matchException, (long)4185029270163502581L, (long)l);
                }
                n = 1;
                break block9;
            }
            n = false;
        }
        return n != 0;
    }

    private gH b(Object[] objectArray) {
        gH gH2;
        block23: {
            Object object;
            CallSite callSite;
            long l;
            long l2;
            List list;
            block22: {
                reference v2;
                Object object2;
                double d;
                block20: {
                    list = (List)objectArray[0];
                    d = (Double)objectArray[1];
                    l2 = (Long)objectArray[2];
                    l = (l2 = z ^ l2) ^ 0x4C2BF568E8B4L;
                    object2 = Double.POSITIVE_INFINITY;
                    callSite = fi_0.c("\u00e8", (long)-3291586110409101377L, (long)l2);
                    CallSite callSite2 = fi_0.c("S", (Object)list, (long)-3283914710262074159L, (long)l2);
                    while (fi_0.c("S", (Object)callSite2, (long)-3286393221370158147L, (long)l2) != false) {
                        block21: {
                            Object object3;
                            reference v0;
                            block19: {
                                gH gH3 = (gH)((Object)fi_0.c("S", (Object)callSite2, (long)-3289296744727487740L, (long)l2));
                                try {
                                    try {
                                        try {
                                            v0 = fi_0.c("S", (Object)gH3, (long)-3283624910363548964L, (long)l2);
                                            object3 = d;
                                            if (callSite != null) break block19;
                                            reference v2 = v0 - object3;
                                            v2 = v2 == 0 ? 0 : (v2 < 0 ? -1 : 1);
                                            if (callSite != null) break block20;
                                        }
                                        catch (MatchException matchException) {
                                            throw fi_0.c("\u00e8", (Object)matchException, (long)-3284228633230123635L, (long)l2);
                                        }
                                        if (v2 > 0) break block21;
                                    }
                                    catch (MatchException matchException) {
                                        throw fi_0.c("\u00e8", (Object)matchException, (long)-3284228633230123635L, (long)l2);
                                    }
                                    v0 = (reference)object2;
                                    object3 = fi_0.c("S", (Object)gH3, (long)-3283624910363548964L, (long)l2);
                                }
                                catch (MatchException matchException) {
                                    throw fi_0.c("\u00e8", (Object)matchException, (long)-3284228633230123635L, (long)l2);
                                }
                            }
                            object2 = fi_0.c("\u00e8", (double)v0, (double)object3, (long)-3288688558030866788L, (long)l2);
                        }
                        if (callSite == null) continue;
                    }
                    try {
                        object = object2;
                        if (callSite != null) break block22;
                        v2 = fi_0.c("\u00e8", (double)object, (long)-3290745587783194065L, (long)l2);
                    }
                    catch (MatchException matchException) {
                        throw fi_0.c("\u00e8", (Object)matchException, (long)-3284228633230123635L, (long)l2);
                    }
                }
                try {
                    if (v2 == false) {
                        return null;
                    }
                }
                catch (MatchException matchException) {
                    throw fi_0.c("\u00e8", (Object)matchException, (long)-3284228633230123635L, (long)l2);
                }
                object = fi_0.c("\u00e8", (double)d, (double)(object2 + 0.25), (long)-3288688558030866788L, (long)l2);
            }
            double d = object;
            gH gH4 = null;
            CallSite callSite3 = fi_0.c("S", (Object)list, (long)-3283914710262074159L, (long)l2);
            while (fi_0.c("S", (Object)callSite3, (long)-3286393221370158147L, (long)l2) != false) {
                block25: {
                    CallSite callSite2;
                    block24: {
                        gH gH5 = (gH)((Object)fi_0.c("S", (Object)callSite3, (long)-3289296744727487740L, (long)l2));
                        try {
                            try {
                                try {
                                    gH2 = gH5;
                                    if (callSite != null) break block23;
                                    if (callSite != null) break block24;
                                }
                                catch (MatchException matchException) {
                                    throw fi_0.c("\u00e8", (Object)matchException, (long)-3284228633230123635L, (long)l2);
                                }
                                if (!(fi_0.c("S", (Object)gH2, (long)-3283624910363548964L, (long)l2) <= d)) break block25;
                            }
                            catch (MatchException matchException) {
                                throw fi_0.c("\u00e8", (Object)matchException, (long)-3284228633230123635L, (long)l2);
                            }
                            Object[] objectArray2 = new Object[3];
                            objectArray2[2] = l;
                            objectArray2[1] = gH5;
                            objectArray2[0] = gH4;
                            callSite2 = fi_0.c("S", (Object)this, (Object)objectArray2, (long)-3284690760764533185L, (long)l2);
                        }
                        catch (MatchException matchException) {
                            throw fi_0.c("\u00e8", (Object)matchException, (long)-3284228633230123635L, (long)l2);
                        }
                    }
                    gH4 = callSite2;
                }
                if (callSite == null) continue;
            }
            gH2 = gH4;
        }
        return gH2;
    }

    private List b(Object[] objectArray) {
        ArrayList arrayList;
        block46: {
            gH gH2;
            List list = (List)objectArray[0];
            long l = (Long)objectArray[1];
            long l2 = (l = z ^ l) ^ 0x58282B841452L;
            ArrayList arrayList2 = new ArrayList();
            CallSite callSite = fi_0.c("\u00e8", (long)-6975060933923052835L, (long)l);
            int n = 0;
            while (n < fi_0.c("S", (Object)list, (long)-6987528578765302000L, (long)l)) {
                block45: {
                    block40: {
                        Object object;
                        double d;
                        block52: {
                            block43: {
                                CallSite callSite2;
                                block44: {
                                    Object object2;
                                    block51: {
                                        block41: {
                                            CallSite callSite3;
                                            block42: {
                                                block39: {
                                                    gH2 = (gH)((Object)fi_0.c("S", (Object)list, (int)n, (long)-6972760973577549613L, (long)l));
                                                    try {
                                                        if (gH2 != null) break block39;
                                                        break block40;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw fi_0.c("\u00e8", (Object)matchException, (long)-6985532021881859857L, (long)l);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            if (n <= 0) break block41;
                                                            callSite3 = fi_0.c("S", (Object)list, (int)(n - 1), (long)-6972760973577549613L, (long)l);
                                                            if (callSite != null) break block42;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw fi_0.c("\u00e8", (Object)matchException, (long)-6985532021881859857L, (long)l);
                                                        }
                                                        if (callSite3 == null) break block41;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw fi_0.c("\u00e8", (Object)matchException, (long)-6985532021881859857L, (long)l);
                                                    }
                                                    callSite3 = fi_0.c("S", (Object)list, (int)(n - 1), (long)-6972760973577549613L, (long)l);
                                                }
                                                catch (MatchException matchException) {
                                                    throw fi_0.c("\u00e8", (Object)matchException, (long)-6985532021881859857L, (long)l);
                                                }
                                            }
                                            object2 = fi_0.c("S", (Object)((gH)((Object)callSite3)), (long)-6986124960086134850L, (long)l);
                                            break block51;
                                        }
                                        object2 = Double.POSITIVE_INFINITY;
                                    }
                                    d = object2;
                                    try {
                                        try {
                                            try {
                                                if (n + 1 >= fi_0.c("S", (Object)list, (long)-6987528578765302000L, (long)l)) break block43;
                                                callSite2 = fi_0.c("S", (Object)list, (int)(n + 1), (long)-6972760973577549613L, (long)l);
                                                if (callSite != null) break block44;
                                            }
                                            catch (MatchException matchException) {
                                                throw fi_0.c("\u00e8", (Object)matchException, (long)-6985532021881859857L, (long)l);
                                            }
                                            if (callSite2 == null) break block43;
                                        }
                                        catch (MatchException matchException) {
                                            throw fi_0.c("\u00e8", (Object)matchException, (long)-6985532021881859857L, (long)l);
                                        }
                                        callSite2 = fi_0.c("S", (Object)list, (int)(n + 1), (long)-6972760973577549613L, (long)l);
                                    }
                                    catch (MatchException matchException) {
                                        throw fi_0.c("\u00e8", (Object)matchException, (long)-6985532021881859857L, (long)l);
                                    }
                                }
                                object = fi_0.c("S", (Object)((gH)((Object)callSite2)), (long)-6986124960086134850L, (long)l);
                                break block52;
                            }
                            object = Double.POSITIVE_INFINITY;
                        }
                        double d10 = object;
                        try {
                            CallSite callSite4;
                            try {
                                try {
                                    try {
                                        if (callSite != null) break block45;
                                        if (!(fi_0.c("S", (Object)gH2, (long)-6986124960086134850L, (long)l) <= d)) break block40;
                                    }
                                    catch (MatchException matchException) {
                                        throw fi_0.c("\u00e8", (Object)matchException, (long)-6985532021881859857L, (long)l);
                                    }
                                    reference cfr_temp_0 = fi_0.c("S", (Object)gH2, (long)-6986124960086134850L, (long)l) - d10;
                                    callSite4 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                    if (callSite != null) break block40;
                                }
                                catch (MatchException matchException) {
                                    throw fi_0.c("\u00e8", (Object)matchException, (long)-6985532021881859857L, (long)l);
                                }
                                if (callSite4 > 0) break block40;
                            }
                            catch (MatchException matchException) {
                                throw fi_0.c("\u00e8", (Object)matchException, (long)-6985532021881859857L, (long)l);
                            }
                            callSite4 = fi_0.c("S", arrayList2, (Object)gH2, (long)-6985860056381776741L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw fi_0.c("\u00e8", (Object)matchException, (long)-6985532021881859857L, (long)l);
                        }
                    }
                    ++n;
                }
                if (callSite == null) continue;
            }
            ArrayList arrayList3 = new ArrayList();
            while (fi_0.c("S", arrayList3, (long)-6987528578765302000L, (long)l) < 3) {
                block47: {
                    CallSite callSite5;
                    gH2 = null;
                    arrayList = arrayList2;
                    if (callSite != null) break block46;
                    CallSite callSite6 = fi_0.c("S", arrayList, (long)-6985289531836761677L, (long)l);
                    while (fi_0.c("S", (Object)callSite6, (long)-6987873511557452065L, (long)l) != false) {
                        block50: {
                            gH gH3;
                            block48: {
                                gH gH4 = (gH)((Object)fi_0.c("S", (Object)callSite6, (long)-6973710911830747546L, (long)l));
                                try {
                                    Object[] objectArray2 = new Object[3];
                                    objectArray2[2] = l2;
                                    objectArray2[1] = gH4;
                                    objectArray2[0] = arrayList3;
                                    callSite5 = fi_0.c("S", (Object)this, (Object)objectArray2, (long)-6975205530488428151L, (long)l);
                                    if (callSite != null) break block47;
                                    if (callSite5 != false) {
                                        continue;
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw fi_0.c("\u00e8", (Object)matchException, (long)-6985532021881859857L, (long)l);
                                }
                                try {
                                    block49: {
                                        try {
                                            try {
                                                try {
                                                    gH3 = gH2;
                                                    if (callSite != null) break block48;
                                                    if (gH3 == null) break block49;
                                                }
                                                catch (MatchException matchException) {
                                                    throw fi_0.c("\u00e8", (Object)matchException, (long)-6985532021881859857L, (long)l);
                                                }
                                                gH3 = gH4;
                                                if (callSite != null) break block48;
                                            }
                                            catch (MatchException matchException) {
                                                throw fi_0.c("\u00e8", (Object)matchException, (long)-6985532021881859857L, (long)l);
                                            }
                                            if (!(fi_0.c("S", (Object)gH3, (long)-6986124960086134850L, (long)l) < fi_0.c("S", (Object)gH2, (long)-6986124960086134850L, (long)l))) break block50;
                                        }
                                        catch (MatchException matchException) {
                                            throw fi_0.c("\u00e8", (Object)matchException, (long)-6985532021881859857L, (long)l);
                                        }
                                    }
                                    gH3 = gH4;
                                }
                                catch (MatchException matchException) {
                                    throw fi_0.c("\u00e8", (Object)matchException, (long)-6985532021881859857L, (long)l);
                                }
                            }
                            gH2 = gH3;
                        }
                        if (callSite == null) continue;
                    }
                    try {
                        if (gH2 == null) {
                            break;
                        }
                    }
                    catch (MatchException matchException) {
                        throw fi_0.c("\u00e8", (Object)matchException, (long)-6985532021881859857L, (long)l);
                    }
                    callSite5 = fi_0.c("S", arrayList3, (Object)gH2, (long)-6985860056381776741L, (long)l);
                }
                if (callSite == null) continue;
            }
            arrayList = arrayList3;
        }
        return arrayList;
    }

    private dC b(Object[] objectArray) {
        dC dC2;
        CallSite callSite;
        CallSite callSite2;
        float f;
        long l;
        block30: {
            fi_0 fi_02;
            double d;
            ArrayList arrayList;
            long l2;
            block31: {
                block29: {
                    Object object;
                    ArrayList arrayList2;
                    CallSite callSite3;
                    long l3;
                    long l4;
                    long l5;
                    long l6;
                    class_243 class_2432;
                    class_243 class_2433;
                    block26: {
                        block28: {
                            class_2433 = (class_243)objectArray[0];
                            class_2432 = (class_243)objectArray[1];
                            l = (Long)objectArray[2];
                            long l7 = l = z ^ l;
                            l6 = l7 ^ 0x32086DEB7C25L;
                            l2 = l7 ^ 0x46DE12503147L;
                            l5 = l7 ^ 0x41DE5B45BC56L;
                            l4 = l7 ^ 0x1985633276ACL;
                            long l8 = l7 ^ 0x707AEE5EDBECL;
                            l3 = l7 ^ 0x47967E32B288L;
                            reference var19_11 = fi_0.c("D", (Object)class_2432, (long)-3833097289327463561L, (long)l) - fi_0.c("D", (Object)class_2433, (long)-3833097289327463561L, (long)l);
                            callSite3 = fi_0.c("\u00e8", (long)-3821913209681234149L, (long)l);
                            reference var21_13 = fi_0.c("D", (Object)class_2432, (long)-3819433263570630307L, (long)l) - fi_0.c("D", (Object)class_2433, (long)-3819433263570630307L, (long)l);
                            f = (float)fi_0.c("\u00e8", (double)fi_0.c("\u00e8", (double)(-var19_11), (double)var21_13, (long)-3836836620461315279L, (long)l), (long)-3834114597717453091L, (long)l);
                            arrayList2 = new ArrayList();
                            arrayList = new ArrayList();
                            float f10 = -85.0f;
                            while (f10 <= 85.0f) {
                                block25: {
                                    block27: {
                                        Object[] objectArray2 = new Object[5];
                                        objectArray2[4] = l8;
                                        objectArray2[3] = Float.valueOf(f10);
                                        objectArray2[2] = Float.valueOf(f);
                                        objectArray2[1] = class_2432;
                                        objectArray2[0] = class_2433;
                                        CallSite callSite4 = fi_0.c("S", (Object)this, (Object)objectArray2, (long)-3820106573669864121L, (long)l);
                                        try {
                                            try {
                                                try {
                                                    fi_0.c("S", arrayList2, (Object)callSite4, (long)-3833847045318620835L, (long)l);
                                                    if (callSite3 != null) break block25;
                                                    object = callSite4;
                                                    if (callSite3 != null) break block26;
                                                }
                                                catch (MatchException matchException) {
                                                    throw fi_0.c("\u00e8", (Object)matchException, (long)-3834768330766301911L, (long)l);
                                                }
                                                if (object == null) break block27;
                                            }
                                            catch (MatchException matchException) {
                                                throw fi_0.c("\u00e8", (Object)matchException, (long)-3834768330766301911L, (long)l);
                                            }
                                            fi_0.c("S", arrayList, (Object)callSite4, (long)-3833847045318620835L, (long)l);
                                        }
                                        catch (MatchException matchException) {
                                            throw fi_0.c("\u00e8", (Object)matchException, (long)-3834768330766301911L, (long)l);
                                        }
                                    }
                                    f10 += 2.0f;
                                }
                                if (callSite3 == null) continue;
                            }
                            try {
                                try {
                                    object = arrayList;
                                    if (callSite3 != null) break block26;
                                    if (fi_0.c("S", object, (long)-3820914321036077666L, (long)l) == false) break block28;
                                }
                                catch (MatchException matchException) {
                                    throw fi_0.c("\u00e8", (Object)matchException, (long)-3834768330766301911L, (long)l);
                                }
                                return null;
                            }
                            catch (MatchException matchException) {
                                throw fi_0.c("\u00e8", (Object)matchException, (long)-3834768330766301911L, (long)l);
                            }
                        }
                        object = fi_0.c("S", (Object)this.f, (long)-3822331738720936587L, (long)l);
                    }
                    d = (double)fi_0.c("S", (Object)((Float)object), (long)-3834450350307083870L, (long)l);
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = l6;
                    objectArray3[0] = arrayList2;
                    CallSite callSite5 = fi_0.c("S", (Object)this, (Object)objectArray3, (long)-3836627119649142266L, (long)l);
                    Object[] objectArray4 = new Object[3];
                    objectArray4[2] = l5;
                    objectArray4[1] = d;
                    objectArray4[0] = arrayList;
                    CallSite callSite6 = fi_0.c("S", (Object)this, (Object)objectArray4, (long)-3835386036664867643L, (long)l);
                    callSite2 = fi_0.c("S", (Object)callSite5, (long)-3834523675923501963L, (long)l);
                    while (fi_0.c("S", (Object)callSite2, (long)-3836966591474566375L, (long)l) != false) {
                        gH gH2 = (gH)((Object)fi_0.c("S", (Object)callSite2, (long)-3819567081720101984L, (long)l));
                        try {
                            Object[] objectArray5 = new Object[6];
                            objectArray5[5] = l4;
                            objectArray5[4] = arrayList;
                            objectArray5[3] = gH2;
                            objectArray5[2] = Float.valueOf(f);
                            objectArray5[1] = class_2432;
                            objectArray5[0] = class_2433;
                            fi_0.c("S", (Object)this, (Object)objectArray5, (long)-3835999352193043333L, (long)l);
                            if (callSite3 == null) {
                                if (callSite3 == null) continue;
                                break;
                            }
                            break block29;
                        }
                        catch (MatchException matchException) {
                            throw fi_0.c("\u00e8", (Object)matchException, (long)-3834768330766301911L, (long)l);
                        }
                    }
                    try {
                        try {
                            try {
                                try {
                                    callSite = callSite6;
                                    if (callSite3 != null) break block30;
                                    if (callSite == null) break block29;
                                }
                                catch (MatchException matchException) {
                                    throw fi_0.c("\u00e8", (Object)matchException, (long)-3834768330766301911L, (long)l);
                                }
                                fi_02 = this;
                                if (callSite3 != null) break block31;
                            }
                            catch (MatchException matchException) {
                                throw fi_0.c("\u00e8", (Object)matchException, (long)-3834768330766301911L, (long)l);
                            }
                            Object[] objectArray6 = new Object[3];
                            objectArray6[2] = l3;
                            objectArray6[1] = callSite6;
                            objectArray6[0] = callSite5;
                            if (fi_0.c("S", (Object)fi_02, (Object)objectArray6, (long)-3820439591500053395L, (long)l) != false) break block29;
                        }
                        catch (MatchException matchException) {
                            throw fi_0.c("\u00e8", (Object)matchException, (long)-3834768330766301911L, (long)l);
                        }
                        Object[] objectArray7 = new Object[6];
                        objectArray7[5] = l4;
                        objectArray7[4] = arrayList;
                        objectArray7[3] = callSite6;
                        objectArray7[2] = Float.valueOf(f);
                        objectArray7[1] = class_2432;
                        objectArray7[0] = class_2433;
                        fi_0.c("S", (Object)this, (Object)objectArray7, (long)-3835999352193043333L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw fi_0.c("\u00e8", (Object)matchException, (long)-3834768330766301911L, (long)l);
                    }
                }
                fi_02 = this;
            }
            Object[] objectArray8 = new Object[3];
            objectArray8[2] = l2;
            objectArray8[1] = d;
            objectArray8[0] = arrayList;
            callSite = fi_0.c("S", (Object)fi_02, (Object)objectArray8, (long)-3821370063677752686L, (long)l);
        }
        callSite2 = callSite;
        try {
            dC2 = callSite2 == null ? null : new dC(f, (float)fi_0.c("S", (Object)callSite2, (long)-3820724334123057167L, (long)l));
        }
        catch (MatchException matchException) {
            throw fi_0.c("\u00e8", (Object)matchException, (long)-3834768330766301911L, (long)l);
        }
        return dC2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fi" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = fi_0.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6355;
        if (B[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = A[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])C.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    C.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/fi", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            fi_0.B[n2] = n3;
        }
        return B[n2];
    }

    private gH c(Object[] objectArray) {
        gH gH2;
        block7: {
            List list = (List)objectArray[0];
            double d = (Double)objectArray[1];
            long l = (Long)objectArray[2];
            long l2 = (l = z ^ l) ^ 0x4B2BBC7D65A5L;
            gH gH3 = null;
            CallSite callSite = fi_0.c("\u00e8", (long)6863741876795679406L, (long)l);
            CallSite callSite2 = fi_0.c("S", (Object)list, (long)6880435869127522752L, (long)l);
            while (fi_0.c("S", (Object)callSite2, (long)6878515910159593132L, (long)l) != false) {
                block9: {
                    CallSite callSite3;
                    block8: {
                        gH gH4 = (gH)((Object)fi_0.c("S", (Object)callSite2, (long)6866605187549550101L, (long)l));
                        try {
                            try {
                                try {
                                    gH2 = gH4;
                                    if (callSite != null) break block7;
                                    if (callSite != null) break block8;
                                }
                                catch (MatchException matchException) {
                                    throw fi_0.c("\u00e8", (Object)matchException, (long)6880678299009503388L, (long)l);
                                }
                                if (!(fi_0.c("S", (Object)gH2, (long)6881288621127479245L, (long)l) <= d)) break block9;
                            }
                            catch (MatchException matchException) {
                                throw fi_0.c("\u00e8", (Object)matchException, (long)6880678299009503388L, (long)l);
                            }
                            Object[] objectArray2 = new Object[3];
                            objectArray2[2] = l2;
                            objectArray2[1] = gH4;
                            objectArray2[0] = gH3;
                            callSite3 = fi_0.c("S", (Object)this, (Object)objectArray2, (long)6880207375648348974L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw fi_0.c("\u00e8", (Object)matchException, (long)6880678299009503388L, (long)l);
                        }
                    }
                    gH3 = callSite3;
                }
                if (callSite == null) continue;
            }
            gH2 = gH3;
        }
        return gH2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fi" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fi_0.m(l, l2);
            object = D[n];
            try {
                if (!(object instanceof String)) break block2;
                fi_0.D[n] = clazz = Class.forName(E[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fi_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fi_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fi_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fi_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = D;
        D[0] = "\u0002cqGq\u0012\u001ckk\b\f\u0002\u001c";
        objectArray[1] = "Z\u0015\u00185\u0017AQ\u001a\tzvOZ\u0011\r ";
        objectArray[2] = "\u000e\ttlVr\u0018\tq6Ee\u000fBr0Iq\u001e\u0005e'\u0002c\"";
        objectArray[3] = "\u000eGO[\u0018A{gDT\t\u000e\u0006\u007fWS\u0000Gn";
        objectArray[4] = "\u000f\u001e~\u001e\u0003>\u000f\u001eiB\u000f1\u0015Ui\\\u000f$\u0012$9\u0001^";
        objectArray[5] = "m\u0017FxE{m\u0017Q$Itw\\Q:Iap-\u0005b\u001e";
        objectArray[6] = "D}GB&<R}B\u00185+E6A\u001e9?TqV\tr/R";
        objectArray[7] = "\b\u0013k&\\v}3`)M9\u001c=k\"Ich";
        objectArray[8] = Void.TYPE;
        fi_0.E[8] = "java/lang/Void";
        objectArray[9] = "CKF\u00075^UKC]&IB\u0000@[*]SGWLaHN";
        objectArray[10] = "z\u001a@8B\u0011q\u0015Qw!\u001cd\u0018^\u001c\u0014\u001eu\u000bB0\u0003\u0013";
        objectArray[11] = "Z1[\u0018RsL1^BAd[z]DMpJ=JS\u0006`R=HX\\-n&HE\\jY1";
        objectArray[12] = "\u000b)`-\u0015\u001d\u001d)ew\u0006\n\nbfq\n\u001e\u001b%qfA\t+";
        objectArray[13] = "\u00104]\u0004r\u001ce\u0014V\u000bcS\u0004\u001a]\u0000g\tp";
        objectArray[14] = "9M5j[\u00002B$%1\u0003&N/n";
        objectArray[15] = Double.TYPE;
        fi_0.E[15] = "java/lang/Double";
        objectArray[16] = Integer.TYPE;
        fi_0.E[16] = "java/lang/Integer";
        objectArray[17] = "kuo\u0017\u00028}ujM\u0011/j>iK\u001d;{y~\\V/G";
        objectArray[18] = Float.TYPE;
        fi_0.E[18] = "java/lang/Float";
        objectArray[19] = "6\fws9/=\u0003f<^-(\bfwe";
        objectArray[20] = "=\u0019Lz;\r6\u0016]5\\\u00152\n[yy\u0004";
        objectArray[21] = "\u001c\u0007\u000bm&~\u0002\u000f\u0011\"A\u007f\u0013\u0014\u001cxgy";
        objectArray[22] = "]87uPw]8 )\\xGs 7\\m@\u0002ri\u0004)";
        objectArray[23] = "g^c=:Jg^ta6E}\u0015t\u007f6Pzd%'d";
        objectArray[24] = "w\u0005MS+nw\u0005Z\u000f'amNZ\u0011'tj?\u000fN~";
        objectArray[25] = "H\t&\u0016%9H\t1J)6RB1T)#U3c\u000epd";
        objectArray[26] = "2\u00063XS5$\u00066\u0002@\"3M5\u0004L6\"\n\"\u0013\u0007#\u0000";
        objectArray[27] = "[.i1Z\u007f[.~mVpAe~sVeF\u0014/*\u0001'";
        objectArray[28] = "O.\u0016\u0000\u001bZD!\u0007OfBW&\u000e\u0006";
        objectArray[29] = "I8'%L\"_8\"\u007f_5Hs!yS!Y46n\u00186|";
        objectArray[30] = "jl~n* \u001fLua;o~B~j?5\n";
        objectArray[31] = Boolean.TYPE;
        fi_0.E[31] = "java/lang/Boolean";
        objectArray[32] = "\b\r]\u0006,X\u001e\rX\\?O\tF[Z3[\u0018\u0001LMxN\\";
        objectArray[33] = "^y\ft\u001do+Y\u0007{\f JW\fp\bz>";
        objectArray[34] = "\u0003\u0011e%tX\u0003\u0011ryxW\u0019ZrgxB\u001e+ =,\u0006";
        objectArray[35] = "O1\u0003^9\u0010:\u0011\bQ(_[\u001f\u0003Z,\u0005/";
        objectArray[36] = ":QF\u0012\u0000a,QCH\u0013v;\u001a@N\u001fb*]WYTwk";
        objectArray[37] = "Y\u007f? ?5,_4/.zMQ?$* 9";
        objectArray[38] = "F5OEd33\u0015DJu|R\u001bOAq&&";
        objectArray[39] = "//(e,\u00051'2*A\u001f)\";gv\u0019* ";
        objectArray[40] = "\u007fRz'\u0015M\nrq(\u0004\u0002k|z#\u0000X\u001f";
        objectArray[41] = "\u0016,N\u000e^\u001d\b$TA%=5\t";
        objectArray[42] = "r\"*+=uy-;dQvw/9+}";
        objectArray[43] = "\u0015T||\u001d9\u0003Ty&\u000e.\u0014\u001fz \u0002:\u0005Xm7I-:";
        objectArray[44] = "b5r\u0002j(i:cM\u0002(g5p";
        objectArray[45] = "if2%:\u0017wn(jX\u000bps";
        objectArray[46] = "Z\tPBEC/)[MT\fN'PFPV:";
        objectArray[47] = "\u001d\u001d\u0007\u0015P\u001b\u0016\u0012\u0016Z3\u0016\u0003\u0014";
        objectArray[48] = "\u000b eD\u001aw~\u0000nK\u000b8\u001f\u000ee@\u000fbk";
        objectArray[49] = "v\u0001\r\u001aHJ\u0003!\u0006\u0015Y\u0005b/\r\u001e]_\u0016";
        objectArray[50] = "G$rq&K2\u0004y~7\u0004S\nru3^'";
        objectArray[51] = "Jc.Seo?C%\\t ^M.Wpz*";
        objectArray[52] = "(\u0001\"\u0013,a>\u0001'I?v)J$O3b8\r3Xxv\u007f";
        objectArray[53] = "RY\t\u0010KKRY\u001eLGDH\u0012\u001eRGQOcL\t\u001f\u0010";
        objectArray[54] = "t\u007fn\u0013/7t\u007fyO#8n4yQ#-iE+\n{g";
        objectArray[55] = "2oKaN{2o\\=Bt($\\#Ba/U\u000ew\u0013 ";
        objectArray[56] = "3A\u0005%(\u0000%A\u0000\u007f;\u00172\n\u0003y7\u0003#M\u0014n|\u0017\u0010";
        objectArray[57] = "^/#\u001fl\u000b+\u000f(\u0010}DJ\u0001#\u001by\u001e>";
        objectArray[58] = "3OlKw]3O{\u0017{R)\u0004{\t{G.u+P)\u0006";
        objectArray[59] = "\u000e\u001e4\t\u0010/\u0018\u001e1S\u00038\u000fU2U\u000f,\u001e\u0012%BD<\u0005";
        objectArray[60] = "Jm\u0011{t\u0012?M\u001ate]^C\u0011\u007fa\u0007*";
        objectArray[61] = "\u0001{(\b(N\u0001{?T$A\u001b0?J$T\u001cAh\u0015r";
        objectArray[62] = "@PY2\u0017-@PNn\u001b\"Z\u001bNp\u001b7]j\u001c.L|";
        objectArray[63] = "Z\nxTou/*s[~:N$xPz`:";
        objectArray[64] = "8E\u000b\u0006\u0013x.E\u000e\\\u0000o9\u000e\rZ\f{(I\u001aMGl\u001f";
        objectArray[65] = "%\u001e=\u0019BeP>6\u0016S*10=\u001dWpE";
        objectArray[66] = "e<Ve&l\u0010\u001c]j7#q\u0012Va3y\u0005";
        objectArray[67] = "\u0007\u001aF[usr:MTd<\u00134F_`fg";
        objectArray[68] = "3;\u0001c;3F\u001b\nl*|'\u0015\u0001g.&S";
        objectArray[69] = ":7@L8\u001dO\u0017KC)R.\u0019@H-\bZ";
        objectArray[70] = "%M\u0018j`[Pm\u0013eq\u00141c\u0018nuNE";
        objectArray[71] = "\u001e/]i]xk\u000fVfL7\n\u0001]mHm~";
        objectArray[72] = "\u0014jq\u0019\u0015;aJz\u0016\u0004t\u0000Dq\u001d\u0000.t";
        objectArray[73] = "\u0014\u00010\u0014\n1a!;\u001b\u001b~\u0000/0\u0010\u001f$t";
        objectArray[74] = ":o`008l}k;Wk\u0005u<},o4dm+g";
        objectArray[75] = "& 7,;',}*)]'4W(p<:\"\u0019 dm}*z6\u007f&}O}2r 7!rt*&F";
        objectArray[76] = "\u0006/w{Dp\u00019rz{sey{ G#\u000e=w\u007fBie~)~\u0019a\u000fpzz\u0006\u0019";
        objectArray[77] = "D\tT\u0015\u0004z\u0017Z\u0006\u0001:!Pd\u0003\u000e\npJ\u0007\u0015\u0015Ap/";
        objectArray[78] = "I\u0000a`\u001cPR\u0002\u007fc%],D~|\u0019\u000eG\u0000r#\u001cD,\u001a.`\u0019SWFb\u007fB4";
        objectArray[79] = "q@x&\u0017\u0011$Z`/l\u001b']|,\u0000)q\u001f vR~!G}9\u000b\u0007wYc7l@u\u001a~3\u0006N&\u001eaK";
        objectArray[80] = "7iO9o5)o[5\u0015#9oDeBtc?\u0019\t|?h9Ejj$#9";
        objectArray[81] = "vh\nF^KqpD\u00158^!fZ\u001eTlu'\u0004H8_7~G\bVPq&Ay";
        objectArray[82] = "~#>Ka,t~#N\u0007&p\u007f8\u0018} \u0017s2A<(te)\n<M~hpJb.hs;J\u0007'+\u007f#\r</{a\"q";
        objectArray[83] = "R\u0014\u000b\u001dDF\u000eX\u0014F#PLT\u001bEX=\f\u0017\u000eDSYU\u0012H\u0018#YNM\u000fPMV\b\u0015\t!";
        objectArray[84] = "L\u0013\u000bus\u0017\u0010_\u0014.\u0014\tFR\u0012.x;\u0016\u0012Mv\u0014\rU\u001e\u00103\u007f]@\u0017\u0016I";
        objectArray[85] = "\u001bl}8}iM~v3\u001a3$r08cl@i2&`";
        objectArray[86] = "[VQGet\u0018\u001bBP3\u0015\bf\u0003M;)X\rGAd,\u0012fQF?g\u0005\u001f\u0007X!ib";
        objectArray[87] = "\u000bCw1s,\bFmkB85\u001cz?~h^Xv`{\"5Nzd+l\u0004\u001d)6?R";
        objectArray[88] = "Y1w-LZG7c!6G[&xzZu\u000fb\",6M]5(gNS[!$\u001d";
        objectArray[89] = ".;#\u000f\u0012:3:u\f+jS8p\u0002Ns7auD\u0012\u0003";
        objectArray[90] = ">>\u0002S5\u0016k$\u001aZN\u001ch#\u0006Y\".?cV\u0004~ya$\u0002C?\u0017nbZEN";
        objectArray[91] = " $\u007f8 |q~cI~lNz,5|r*#)s \u0002w}n,if.x(p\u0019;p?w9}buy+I <2&b-y9tz\u0012'~o?zlv$sN";
        objectArray[92] = ">\u0019^\n\u00161k\u0003F\u0003m;h\u0004Z\u0000\u0001\t>F\u0006ZR^n\u001e[\u0015\n'8\u0000E\u001bm`:CX\u001f\u0007niGGg";
        objectArray[93] = "@\u0011mSXWC\u0014w\ti@~N`]U\u0013\u0015\nl\u0002PY~\u0013v\\\u0014X\u0010\u001c0\u0004\u0012)";
        objectArray[94] = "\n\u0001\u000eD+v\b^_K,\u0011Y@0C-tPF\u000bK}jQ:";
        objectArray[95] = "I2l\u0000\u0015g@a%\u0019h<pj,J\u00061K,e\u0015\u0011V";
        objectArray[96] = "C(-OdB\u0010{\u007f[Z\u0019TEx@;\u0001O<.^%\u000f(";
        objectArray[97] = "j\nr\"/HhU#-(/9HL ~@cK4>xTo1";
        objectArray[98] = "V\u0002[GtuQ\u001a\u0015\u0014\u0012k\r\u001d\u000f\u0014E<R@Txr<\rA\u000e\u0007qw\f\r";
        objectArray[99] = ".g|;p*fn(&}\u0010r2m;s|@b.d/\u0010)`*9lz'3.&\u0014";
        objectArray[100] = "FSg'K\u0012EV}}z\u0000x\fj)FV\u0013HfvC\u001cxQ|(\u0007\u001d\u0016^:p\u0001l";
        objectArray[101] = "\u001a\u0000x/L(IS*;rs\u000fm,z\u0017z\rV$*\t{q";
        objectArray[102] = "G?K1\nT\u000fw\u0014wgFwv\u0016/[\u0012\u001c2\u001ap^XwqDq\u0005P\u001d\u007f\u0017u\u001a(";
        objectArray[103] = "Fd\u0019' Y\u001a&\u001c#0 \u0011:N}7wBk\u001b)[\u0019@a\u001db\"E\u0002d\u0019r";
        objectArray[104] = "\u0010DN-Q\u0003\u0004VN(+Y\u000eS0*Y\fTPS<BGT5Y1\u001b\u0007\nVO*P\u0007o\\Bs\u0010Y\fJY8\u0010<";
        objectArray[105] = "Mt;2')Nq!h\u0016>s+6<*m\u0018o:c/'s}06&-\u000bc6\"*W";
        objectArray[106] = "e1\u0017\b\u001f\u0005f4\rR.\u0012[n\u001a\u0006\u0012A0*\u0016Y\u0017\u000b[nL]CA<l\u0013\fLF[";
        objectArray[107] = "\u001c?\u001c<3\f^cUbS\u0001dbA>oR\u000f&Maj\u0018de\u0013`1\u0010\u000ek@d.h";
        objectArray[108] = "\bp;a&\u0001]j#h]\u000b^m?k19\b/c1anXw>~:\u0017\u000ei p]";
        objectArray[109] = "\u0003P\u001e'VWLS\t~8\u0007\u0006f\u0014aD\u0017}O\n}E\u0017\u0013@L%Cf";
        objectArray[110] = "bLYq[\u0003!@S:>\u000b^\u001a\u000e/\u0002X5^\u0002p\u0007\u0012^O\f7R\b2S\u001f0Tb";
        objectArray[111] = "!\u0007W/g{i\u000e\u00032jA}RF/d-O\u0005\u0001t9x\u0018VH\u007f8${@S48A";
        objectArray[112] = "i\u00048*\u0016\u0015<\u000718}Ki\u00065ED\u0013x\u00139!\u001d\u0016>OI";
        objectArray[113] = "`9z\u0005G\u0012+y~\nG)<h8\u0018CE\u000e<yC\u001a\u0013Yl6H\u001fL:z-\u0003\u001f)2c%\nCPd};\u0004$";
        objectArray[114] = ":\u0001\u001dfsI$\u0007\tj\t_4\u0007\u0016:^\bnWJV`CeQ\u00175vX.Q";
        objectArray[115] = "%7,.>um\u007fshSd\u0015~q0o3~:}ojy\u0015y#n1q\u007fwpj.\t";
        objectArray[116] = "3$\u007f\\~Lwp{Tp\"op>\rsN]\"rP(\"3$#\u0000*\u00184l)\u0003.\"";
        objectArray[117] = ">\u001d\u001ae@\f\"\u000e\u001dc*\u00014\u000e9`N\u001d?r\r5O\u0003.I\u0005eQ\u0002R";
        objectArray[118] = "kr\u001e>3E>h\u00067HO=o\u001a4$}k-Fnu*;u\u001b!/Smk\u0005/H";
        objectArray[119] = "\u00138\r\u0011!COt\u0012JF]\u0019y\u0014J*oI;J\u0012FC\u001be\u0010R,\u0006\u0018o\u0006-";
        objectArray[120] = "BJ\u001e\u0017_\u0010\u0014X\u0015\u001c8K}\u0001^UCA\u0001I\u0016\n\u0005";
        objectArray[121] = "}%r{\"\u0007~ h!\u0013\u0010Cz\u007fu/C(>s**\tC(\u007f.zGr{,|ny";
        objectArray[122] = "-)\u0016|\u001fQ3/\u0002peL/>\u0019+\t~{zCveF)-I6\u001dX/9EL\f[ry\u001c/\u001a@9yy";
        objectArray[123] = "L \u00016q\u0013\u001dz\u001dG#\nD;\u0005&.\u0016\"~R;-\u001dF'W}qmF<\b:9\u0003IzP<H";
        objectArray[124] = "\tH%'{\u0010AAq:v*U\u001d4'xFgJs|&\u00150\u0019:w$OS\u000f!<$*";
        objectArray[125] = "\u0016Tc\u001f7/\nGd\u0019](\u001d^f\u001a'.zQ\"\u0016>?AYr\b?C\u0010\u0007{\u0010!x\u0018We\u0011])F^}\u000ff!\u0016@|s";
        objectArray[126] = "\u000e$(|\u0019~A'?%w \u001d#G(K*\u0013#| \u001b4\u0012_~|\u000b*\u0000;'yMvp";
        objectArray[127] = "\rmOcvC\nw_wMO\u0000n^k!}W)\u00055}*\u0004`\u000e7(I\u0012{E7M";
        objectArray[128] = "M\u0000\u0003|\u0007}\u0005\tWa\nG\u0011U\u0012|\u0004+#\u0001^#RvtW\u0005sS=\fI\u0003g_GJ\u0007U~\u001b-DTQac";
        objectArray[129] = "9w\u0018\u000eWV>oV]1HbhL]f\u001f<?\u00141\nGghS^_]\u007fa";
        objectArray[130] = "!@c ]?&Zs4f3,Cr(\n\u0001{\u0004)vYV(M\"t\u00035>Vitf";
        objectArray[131] = "6=4jQRiq#3]<d\u0000b9_\u00005k&5\u0000\u0005\u007f\u0000?/^A~n0i\u0006G\u000f";
        objectArray[132] = "LL.e8{P_)cRiIG.d\u0015y Iol1k\u001bA?r0\u0017LL.e8{P_)cR";
        objectArray[133] = "\u0014lM\u000e\u0017\\\\e\u0019\u0013\u001afH9\\\u000e\u0014\nzn\u001bUJV-=R^H\u0003N+I\u0015Hf";
        objectArray[134] = "4=\u0005\u0004133%KWW-o\"QW\u0000z1r\b;n}h/D@g9nuR";
        objectArray[135] = "_\u0019)@b\u0001\\\u001c3\u001aS\u001daF$NoE\n\u0002(\u0011j\u000faAv\u00101\u0007\u000bO%\u0014.\u007f";
        objectArray[136] = "\u0005vFv\u0015\r\u0002lVb.\u0001\buW~B3_2\f#\u0017d\f{\u0007\"K\u0007\u001a`L\".";
        objectArray[137] = "A&\u0019G4_\u0014%\u0010U_\u0007E/.E/\u001b,0\u0013L\"\u0016B?U\u0014$g";
        objectArray[138] = "\u0000\t\u0016Q)#\u0007\u0013\u0006E\u0012/\r\n\u0007Y~\u001dYFX\u000f\"J\u000f\u001d\b\u000eh2\u0011\u001b\u001c\u0002\u0012";
        objectArray[139] = "=jj\u000b`\u0015)xj\u000e\u001aC>rr_\u001aC0+/\u0000yU+`/esXr q\u0006eC9 \u0014\fh\u001ay~w\u001asQy\u001b";
        objectArray[140] = "\u0012\u0002\u0005A\f7]\u0001\u0012\u0018b}\r\u000b\u0007\u007f\b:\t\u001a\u0016D\u0000j\u0017\u001bj";
        objectArray[141] = "Y\"\u001d0)YZ'\u0007j\u0018Mg}\u0010>$\u001d\f9\u001ca!Wg}M0\u007f\u001c\u0006>\u0000#hJg";
        objectArray[142] = "C@FNwG@E\\\u0014FS}\u001fK@z\u0003\u0016[G\u001f\u007fI}X]JxWL\u0017^]!9";
        objectArray[143] = "Nu\u0017?thIo\u0007+OdCv\u00067#V\u00134\\`Ok\u0012o\u0005,tcBq\u0004P";
        objectArray[144] = "\t\u0012<\nShBR8\u0005SSUC~\u0017W?g\u0017?L\u000fo0GpG\u000b6SQk\f\u000bS[Hc\u0005W*\rV}\u000b0";
        objectArray[145] = "$7S*Ctl>\u00077NNxbB*@\"J2\u000es\u001bNt}\u000eqB-bfEq''o?\u0005/D1tt\u0005JN<-4[)X'f4>t\u0018u\u007fwTzKq`\u000f";
        objectArray[146] = "nE\f{s3,\u0019E%\u0013=\u0016\u0018Qy/m}\\]&*'\u0016EGxn&xJ\u0001 hW";
        objectArray[147] = "(j\u000b@p\u00139;]\u000b\u001bKI?Y^'\u0018\"{U\u0001\"RIbO_fS'm\t\u0007`\"";
        objectArray[148] = "h\u0004\"4I\u0014jD, #Cs\u00199=JOJ\u00179-N)p\u00059-RG\u007fCa+#";
        objectArray[149] = "'T(\u0016|33F(\u0013\u0006e2^V\u0013`m*B/E~s$%=\u001eg~?\\k\u0000ypX";
        objectArray[150] = "V\nZ\u0013\u0004\u001fH\fN\u001f~\u0002T\u001dUD\u00120\u0000Y\u000f\u001a~\u000eKQ\u000eF\u001d\u0018P\u001a\u000e#\u0011\fVQO[\u000f\nB]5";
        objectArray[151] = "R~*8D(\u0005xi=>3C)o:B5EDx!O=T|-\"F/?";
        objectArray[152] = "TR.-}\u0019\u0001H6$\u0006\u0013\u0002O*'j!R\fqq\u0006\u0018\u000f_#,=GPT6@m\u0010\u000eA-9;\u000e\u0010OJ";
        objectArray[153] = "]oMM7<\buUDL6\u000brIG \u0004]5\u0014\u001fuS\teF\u00106+\u0017cR\u001cL";
        objectArray[154] = "!EZ\u0010-u&_J\u0004\u0016y,FK\u0018zK{\u0006\u001aE/\u001c/ZG\u0016z'p\u0005L\u0003\u0016";
        objectArray[155] = "\u00059N'n(U,G!\u0014,\t;%9n\"\u0002(~'h-\u001f'G l%\u0000G";
        objectArray[156] = "\u0018\u0001+Ay+I[70+1\u001b\u000f<0~jM\u0004>Zp9I\u001bF";
        objectArray[157] = "Jza\u0010J\u0004J.4\u0004\u0005v\u001d!2\u000eW!C~dV;OJ}n\u0000U\u000b\u001eyf\u000e";
        objectArray[158] = "{bNq\u0002 xgT+33E=C\u007f\u000fd.yO \n.E`U~N/+o\u0013&H^";
        objectArray[159] = "(\u000eav\u0000r+\u000b{,1g\u0016Qlx\r6}\u0015`'\b|\u0016\u0003l#X2'P?qL\f";
        objectArray[160] = "0mj \rMc>843\u0016&\u0000=;\u0003G>c+ HG[";
        objectArray[161] = "\u00157_\nT\u001a\u0001%_\u000f.Y\r\nL\u000bTH\u0007=!\r\\\u0015Q#B\u001bG^QFH\u0016\u001e\u001e\u000f%^\rU\u001ej";
        objectArray[162] = "\ni\u001aWa\u0000[3\u0006&\"\u0013\u0018g\u0016@\u0011\u001a\u0000\u000e\r@#\u001a\u001f\u007f\u0007B?\u0007dj\fB%\u000f\neJ\u001a#~";
        objectArray[163] = "`<{#\u000e\u0000t.{&tZv=\u0005$\u0006\u000f$(f2\u001dD$Ml?D\u0004z.z$\u000f\u0004\u001f$w}OZ|2l6O?";
        objectArray[164] = "\u0015Z~,Q*PYt:.-\u0017Hw,U@W\u000bb-^$\u000e\u000e$q.$\u0015Qc9@+S\teH";
        objectArray[165] = "2A6-\u0016\u0011}B!txI VY*F\\)J=sC\u001au:=h\u001c]=T2.D[L";
        objectArray[166] = "vU\f{f\u0001t\n]taf%\u00152\u007f.Vt\u000bQi5\u001dtn";
        objectArray[167] = "oviMbm,zc\u0006\u0007eS >\u0013;68d2L>|S'lMet9)?Iz\f";
        objectArray[168] = "_Z\u0005\\;X\\_\u001f\u0006\nOa\u0003^\rj\u0019X\f\u0003\\p&^\u0007_W5\u001fQZ\u000eM\n";
        objectArray[169] = "ke\u000bT-?((\u0018C{^;UY^sbh>\u001dR,g\"U\u000bUw,5,]Ki\"R";
        objectArray[170] = ",I3;(D8[3>R\u0010>Y)U;\tc\u0003(6-\u0012(\u0003M< Kh].*;\u0000h8";
        objectArray[171] = "<\u0011|N\u0003)\u007f\u001dv\u0005f!\u0000G+\u0010Zrk\u0003'O_8\u0000\u0014z\u0010\u00054;\u001c*\u000e\u0004H";
        objectArray[172] = "\u0006\u000f|n )I\fk7Ny\u0004\u0019i92\u007f\u0002t~\"?w\u0013L+!6ex";
        objectArray[173] = "{ES\u000b'\u0015b\u0018I\u0005ZJa\u0018Q\b\u0004Ma\u0002Ut1Bd\r_\rg\\z\u00038";
        objectArray[174] = "/hN~!$~2R\u000fq6-\u000f\u001a1d?1kC4\"cAkXke+/d\u001e3cZ";
        objectArray[175] = ":K\tqvd9\u0000\b=\u0013~7\u000e\b'\u007fLcBQy)\u001b7HW+ia`N\u0014.\u0013";
        objectArray[176] = "\r\u001b}K3\u0013\u0013\u001diGI\u0005\u0003\u001dv\u0017\u001eRYM({ \u0019RKw\u00186\u0002\u0019K";
        Object[] objectArray2 = objectArray;
        objectArray[177] = "5\u0001\u000eRF\u00066\u0004\u0014\bw\u0014\u000b^\u0003\\KB`\u001a\u000f\u0003N\b\u000b\f\u0003\u0007\u001eF:_PU\nx";
    }

    @Override
    public void d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x52D6E774439DL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = this;
        fi_0.c("S", (Object)fi_0.c("\u00c5", (long)3249475287167288642L, (long)l), (Object)objectArray2, (long)3250079763286764340L, (long)l);
        fi_0.c("S", (Object)this.k, (long)3251973640609259258L, (long)l);
        this.o = null;
        this.n = -1;
        a = 0;
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = fi_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private gH d(Object[] objectArray) {
        gH gH2;
        block38: {
            reference v13;
            gH gH3;
            gH gH4;
            block34: {
                CallSite callSite;
                long l;
                block35: {
                    gH gH5;
                    block37: {
                        block36: {
                            reference v8;
                            block30: {
                                block31: {
                                    gH gH6;
                                    block33: {
                                        block32: {
                                            reference v3;
                                            block26: {
                                                block27: {
                                                    gH gH7;
                                                    block29: {
                                                        block28: {
                                                            gH gH8;
                                                            block24: {
                                                                block25: {
                                                                    gH4 = (gH)objectArray[0];
                                                                    gH3 = (gH)objectArray[1];
                                                                    l = (Long)objectArray[2];
                                                                    l = z ^ l;
                                                                    callSite = fi_0.c("\u00e8", (long)1371025967617371880L, (long)l);
                                                                    try {
                                                                        try {
                                                                            gH8 = gH4;
                                                                            if (callSite != null) break block24;
                                                                            if (gH8 != null) break block25;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw fi_0.c("\u00e8", (Object)matchException, (long)1385736978707324122L, (long)l);
                                                                        }
                                                                        return gH3;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw fi_0.c("\u00e8", (Object)matchException, (long)1385736978707324122L, (long)l);
                                                                    }
                                                                }
                                                                gH8 = gH3;
                                                            }
                                                            reference var7_6 = fi_0.c("\u00e8", (int)fi_0.c("S", (Object)gH8, (long)1371431661045009115L, (long)l), (int)fi_0.c("S", (Object)gH4, (long)1371431661045009115L, (long)l), (long)1373166916898301299L, (long)l);
                                                            try {
                                                                try {
                                                                    try {
                                                                        v3 = var7_6;
                                                                        if (callSite != null) break block26;
                                                                        if (v3 == false) break block27;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw fi_0.c("\u00e8", (Object)matchException, (long)1385736978707324122L, (long)l);
                                                                    }
                                                                    if (var7_6 >= 0) break block28;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw fi_0.c("\u00e8", (Object)matchException, (long)1385736978707324122L, (long)l);
                                                                }
                                                                gH7 = gH3;
                                                                break block29;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw fi_0.c("\u00e8", (Object)matchException, (long)1385736978707324122L, (long)l);
                                                            }
                                                        }
                                                        gH7 = gH4;
                                                    }
                                                    return gH7;
                                                }
                                                v3 = fi_0.c("\u00e8", (double)fi_0.c("S", (Object)gH3, (long)1369756418466971643L, (long)l), (double)fi_0.c("S", (Object)gH4, (long)1369756418466971643L, (long)l), (long)1370676009069917713L, (long)l);
                                            }
                                            reference var8_7 = v3;
                                            try {
                                                try {
                                                    try {
                                                        v8 = var8_7;
                                                        if (callSite != null) break block30;
                                                        if (v8 == false) break block31;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw fi_0.c("\u00e8", (Object)matchException, (long)1385736978707324122L, (long)l);
                                                    }
                                                    if (var8_7 >= 0) break block32;
                                                }
                                                catch (MatchException matchException) {
                                                    throw fi_0.c("\u00e8", (Object)matchException, (long)1385736978707324122L, (long)l);
                                                }
                                                gH6 = gH3;
                                                break block33;
                                            }
                                            catch (MatchException matchException) {
                                                throw fi_0.c("\u00e8", (Object)matchException, (long)1385736978707324122L, (long)l);
                                            }
                                        }
                                        gH6 = gH4;
                                    }
                                    return gH6;
                                }
                                v8 = fi_0.c("\u00e8", (double)fi_0.c("S", (Object)gH3, (long)1385151070794670987L, (long)l), (double)fi_0.c("S", (Object)gH4, (long)1385151070794670987L, (long)l), (long)1370676009069917713L, (long)l);
                            }
                            reference var9_8 = v8;
                            try {
                                try {
                                    try {
                                        v13 = var9_8;
                                        if (callSite != null) break block34;
                                        if (v13 == false) break block35;
                                    }
                                    catch (MatchException matchException) {
                                        throw fi_0.c("\u00e8", (Object)matchException, (long)1385736978707324122L, (long)l);
                                    }
                                    if (var9_8 >= 0) break block36;
                                }
                                catch (MatchException matchException) {
                                    throw fi_0.c("\u00e8", (Object)matchException, (long)1385736978707324122L, (long)l);
                                }
                                gH5 = gH3;
                                break block37;
                            }
                            catch (MatchException matchException) {
                                throw fi_0.c("\u00e8", (Object)matchException, (long)1385736978707324122L, (long)l);
                            }
                        }
                        gH5 = gH4;
                    }
                    return gH5;
                }
                try {
                    gH2 = gH3;
                    if (callSite != null) break block38;
                    reference v13 = fi_0.c("S", (Object)gH2, (long)1371633625616852482L, (long)l) - fi_0.c("S", (Object)gH4, (long)1371633625616852482L, (long)l);
                    v13 = v13 == 0 ? 0 : (v13 > 0 ? 1 : -1);
                }
                catch (MatchException matchException) {
                    throw fi_0.c("\u00e8", (Object)matchException, (long)1385736978707324122L, (long)l);
                }
            }
            gH2 = v13 > 0 ? gH3 : gH4;
        }
        return gH2;
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'D' || c == '\u00d4' || c == '\u00c5' || c == '\u00eb') {
                field = fi_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'D' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d4' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fi_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'S' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e8' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private boolean d(Object[] objectArray) {
        int n;
        block5: {
            List list = (List)objectArray[0];
            gH gH2 = (gH)objectArray[1];
            long l = (Long)objectArray[2];
            l = z ^ l;
            CallSite callSite = fi_0.c("S", (Object)list, (long)5882318695858222878L, (long)l);
            CallSite callSite2 = fi_0.c("\u00e8", (long)5881400496389237872L, (long)l);
            while (fi_0.c("S", (Object)callSite, (long)5884906802236645490L, (long)l) != false) {
                block7: {
                    int n2;
                    block6: {
                        gH gH3 = (gH)((Object)fi_0.c("S", (Object)callSite, (long)5878626061411539147L, (long)l));
                        try {
                            try {
                                reference cfr_temp_0 = fi_0.c("\u00e8", (float)(fi_0.c("S", (Object)gH3, (long)5877540347678221466L, (long)l) - fi_0.c("S", (Object)gH2, (long)5877540347678221466L, (long)l)), (long)5885213151126515889L, (long)l) - 0.1f;
                                n = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                if (callSite2 != null) break block5;
                                if (callSite2 != null) break block6;
                            }
                            catch (MatchException matchException) {
                                throw fi_0.c("\u00e8", (Object)matchException, (long)5882565591600225858L, (long)l);
                            }
                            if (n >= 0) break block7;
                        }
                        catch (MatchException matchException) {
                            throw fi_0.c("\u00e8", (Object)matchException, (long)5882565591600225858L, (long)l);
                        }
                        n2 = 1;
                    }
                    return n2 != 0;
                }
                if (callSite2 == null) continue;
            }
            n = false;
        }
        return n != 0;
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return fi_0.c("\u00e8", (Object)((Object)q_0.Crystal), (Object)((Object)q_0.Sword), (Object)((Object)q_0.UHC), (Object)((Object)q_0.Mace), (long)-2443552924096691026L, (long)l);
    }

    private gG a(Object[] objectArray) {
        gG gG2;
        int n;
        CallSite callSite;
        int n2;
        g3 g32;
        long l;
        block7: {
            class_243 class_2432 = (class_243)objectArray[0];
            float f = ((Float)objectArray[1]).floatValue();
            float f10 = ((Float)objectArray[2]).floatValue();
            l = (Long)objectArray[3];
            long l2 = (l = z ^ l) ^ 0x319C5DD89AF8L;
            float f11 = f * ((float)Math.PI / 180);
            float f12 = f10 * ((float)Math.PI / 180);
            double d = (double)(-fi_0.c("\u00e8", (double)f11, (long)-2097505619622163789L, (long)l) * fi_0.c("\u00e8", (double)f12, (long)-2099668055727205608L, (long)l));
            double d10 = (double)(-fi_0.c("\u00e8", (double)f12, (long)-2097505619622163789L, (long)l));
            CallSite callSite2 = fi_0.c("\u00e8", (long)-2100942573328031943L, (long)l);
            double d11 = (double)(fi_0.c("\u00e8", (double)f11, (long)-2099668055727205608L, (long)l) * fi_0.c("\u00e8", (double)f12, (long)-2099668055727205608L, (long)l));
            CallSite callSite3 = fi_0.c("S", (Object)fi_0.c("S", (Object)new class_243(d, d10, d11), (long)-2101487144402378842L, (long)l), (double)1.5, (long)-2097070240512167715L, (long)l);
            g32 = new g3((class_1937)fi_0.c("D", (Object)b, (long)-2100723474129828875L, (long)l), (class_1309)fi_0.c("D", (Object)b, (long)-2098582519812666747L, (long)l), (class_1799)fi_0.c("S", (Object)fi_0.c("\u00c5", (long)-2096580217507791673L, (long)l), (long)-2099504567050011129L, (long)l), l2);
            fi_0.c("S", (Object)((Object)g32), (double)fi_0.c("D", (Object)class_2432, (long)-2095229762526667947L, (long)l), (double)fi_0.c("D", (Object)class_2432, (long)-2101993304439325532L, (long)l), (double)fi_0.c("D", (Object)class_2432, (long)-2099662185577455233L, (long)l), (long)-2097440437704764614L, (long)l);
            fi_0.c("S", (Object)((Object)g32), (Object)callSite3, (long)-2098670255301136053L, (long)l);
            n2 = 0;
            callSite = fi_0.c("D", (Object)class_2432, (long)-2101993304439325532L, (long)l);
            while (!g32.a) {
                try {
                    try {
                        n = n2++;
                        if (callSite2 != null || callSite2 != null) break block7;
                    }
                    catch (MatchException matchException) {
                        throw fi_0.c("\u00e8", (Object)matchException, (long)-2095845675209331445L, (long)l);
                    }
                    if (n >= fi_0.b("a", (int)8557, (long)(0x132EE7C9E17520F9L ^ l))) break;
                }
                catch (MatchException matchException) {
                    throw fi_0.c("\u00e8", (Object)matchException, (long)-2095845675209331445L, (long)l);
                }
                fi_0.c("S", (Object)((Object)g32), (long)-2100655398511738494L, (long)l);
                callSite = fi_0.c("\u00e8", (double)callSite, (double)fi_0.c("S", (Object)((Object)g32), (long)-2098318033044773316L, (long)l), (long)-2096173539767390176L, (long)l);
                if (callSite2 == null) continue;
            }
            n = g32.a;
        }
        try {
            gG2 = n != 0 ? new gG(new class_243((double)fi_0.c("S", (Object)((Object)g32), (long)-2098940414465766884L, (long)l), (double)fi_0.c("S", (Object)((Object)g32), (long)-2098318033044773316L, (long)l), (double)fi_0.c("S", (Object)((Object)g32), (long)-2099839752768948820L, (long)l)), n2, (double)callSite) : null;
        }
        catch (MatchException matchException) {
            throw fi_0.c("\u00e8", (Object)matchException, (long)-2095845675209331445L, (long)l);
        }
        return gG2;
    }

    private boolean a(Object[] objectArray) {
        Object object;
        block5: {
            List list = (List)objectArray[0];
            gH gH2 = (gH)objectArray[1];
            long l = (Long)objectArray[2];
            long l2 = (l = z ^ l) ^ 0xA7991ACB148L;
            CallSite callSite = fi_0.c("S", (Object)list, (long)-6719824569807518718L, (long)l);
            CallSite callSite2 = fi_0.c("\u00e8", (long)-6736615319428866196L, (long)l);
            while (fi_0.c("S", (Object)callSite, (long)-6721849945811152018L, (long)l) != false) {
                block7: {
                    int n;
                    block6: {
                        gH gH3 = (gH)((Object)fi_0.c("S", (Object)callSite, (long)-6734779364738389033L, (long)l));
                        try {
                            try {
                                Object[] objectArray2 = new Object[3];
                                objectArray2[2] = l2;
                                objectArray2[1] = gH2;
                                objectArray2[0] = gH3;
                                object = fi_0.c("S", (Object)this, (Object)objectArray2, (long)-6723081716108517887L, (long)l);
                                if (callSite2 != null) break block5;
                                if (callSite2 != null) break block6;
                            }
                            catch (MatchException matchException) {
                                throw fi_0.c("\u00e8", (Object)matchException, (long)-6719581041353380514L, (long)l);
                            }
                            if (!object) break block7;
                        }
                        catch (MatchException matchException) {
                            throw fi_0.c("\u00e8", (Object)matchException, (long)-6719581041353380514L, (long)l);
                        }
                        n = 1;
                    }
                    return n != 0;
                }
                if (callSite2 == null) continue;
            }
            object = false;
        }
        return object;
    }

    private class_243 a(Object[] objectArray) {
        class_243 class_2432;
        int n;
        g3 g32;
        long l;
        block9: {
            class_1684 class_16842 = (class_1684)objectArray[0];
            l = (Long)objectArray[1];
            long l2 = (l = z ^ l) ^ 0x6359AB71A623L;
            g32 = new g3((class_1937)fi_0.c("D", (Object)b, (long)-2448856604355592402L, (long)l), (class_1309)fi_0.c("D", (Object)b, (long)-2433346136471112098L, (long)l), (class_1799)fi_0.c("S", (Object)fi_0.c("\u00c5", (long)-2433032712391557092L, (long)l), (long)-2448166552856083748L, (long)l), l2);
            fi_0.c("S", (Object)((Object)g32), (double)fi_0.c("S", (Object)class_16842, (long)-2433090003468153587L, (long)l), (double)fi_0.c("S", (Object)class_16842, (long)-2448632243492574896L, (long)l), (double)fi_0.c("S", (Object)class_16842, (long)-2433810943513297006L, (long)l), (long)-2432163919415447583L, (long)l);
            CallSite callSite = fi_0.c("\u00e8", (long)-2446403365972696094L, (long)l);
            fi_0.c("S", (Object)((Object)g32), (Object)fi_0.c("S", (Object)class_16842, (long)-2433691191275400359L, (long)l), (long)-2433258538421596784L, (long)l);
            CallSite callSite2 = callSite;
            int n2 = 0;
            while (!g32.a) {
                try {
                    try {
                        try {
                            n = n2++;
                            if (callSite2 != null || callSite2 != null) break block9;
                        }
                        catch (MatchException matchException) {
                            throw fi_0.c("\u00e8", (Object)matchException, (long)-2436062897773555248L, (long)l);
                        }
                        if (n >= fi_0.b("a", (int)9009, (long)(0x403EE1CF7D761E7FL ^ l))) break;
                    }
                    catch (MatchException matchException) {
                        throw fi_0.c("\u00e8", (Object)matchException, (long)-2436062897773555248L, (long)l);
                    }
                    fi_0.c("S", (Object)((Object)g32), (long)-2448924868715299495L, (long)l);
                    if (callSite2 == null) continue;
                    break;
                }
                catch (MatchException matchException) {
                    throw fi_0.c("\u00e8", (Object)matchException, (long)-2436062897773555248L, (long)l);
                }
            }
            n = g32.a;
        }
        try {
            class_2432 = n != 0 ? new class_243((double)fi_0.c("S", (Object)((Object)g32), (long)-2448759636306184505L, (long)l), (double)fi_0.c("S", (Object)((Object)g32), (long)-2433610554519528729L, (long)l), (double)fi_0.c("S", (Object)((Object)g32), (long)-2449804148684666505L, (long)l)) : null;
        }
        catch (MatchException matchException) {
            throw fi_0.c("\u00e8", (Object)matchException, (long)-2436062897773555248L, (long)l);
        }
        return class_2432;
    }

    private gH a(Object[] objectArray) {
        class_243 class_2432 = (class_243)objectArray[0];
        class_243 class_2433 = (class_243)objectArray[1];
        float f = ((Float)objectArray[2]).floatValue();
        float f10 = ((Float)objectArray[3]).floatValue();
        long l = (Long)objectArray[4];
        long l2 = (l = z ^ l) ^ 0x5589D784F3CEL;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l2;
        objectArray2[2] = Float.valueOf(f10);
        objectArray2[1] = Float.valueOf(f);
        objectArray2[0] = class_2432;
        CallSite callSite = fi_0.c("S", (Object)this, (Object)objectArray2, (long)4104927318650590533L, (long)l);
        try {
            if (callSite == null) {
                return null;
            }
        }
        catch (MatchException matchException) {
            throw fi_0.c("\u00e8", (Object)matchException, (long)4091280368603772710L, (long)l);
        }
        return new gH(f10, (double)fi_0.c("S", (Object)fi_0.c("S", (Object)callSite, (long)4104297840281261449L, (long)l), (Object)class_2433, (long)4103788563408103988L, (long)l), (int)fi_0.c("S", (Object)callSite, (long)4105777807197528922L, (long)l), (double)fi_0.c("S", (Object)callSite, (long)4090552356525527836L, (long)l));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @bP
    public void a(bG var1_1) {
        block65: {
            block62: {
                block63: {
                    block59: {
                        block61: {
                            block60: {
                                block58: {
                                    block57: {
                                        v0 = var2_2 = fi_0.z ^ 39810115554825L;
                                        var4_3 = v0 ^ 85223601899104L;
                                        var6_4 = v0 ^ 15428053432439L;
                                        var8_5 = v0 ^ 11559785760135L;
                                        var10_6 = v0 ^ 133148403580317L;
                                        var12_7 = v0 ^ 115386622191883L;
                                        var14_8 = v0 ^ 111821976375314L;
                                        var16_9 = fi_0.c("\u00e8", (long)-1730020506004252141L, (long)var2_2);
                                        try {
                                            try {
                                                v1 = fi_0.b;
                                                if (var16_9 != null) break block57;
                                                if (fi_0.c("D", (Object)v1, (long)-1733055204710234401L, (long)var2_2) != null) {
                                                }
                                                ** GOTO lbl26
                                            }
                                            catch (MatchException v2) {
                                                throw fi_0.c("\u00e8", (Object)v2, (long)-1747318391935604703L, (long)var2_2);
                                            }
                                            v1 = fi_0.b;
                                        }
                                        catch (MatchException v3) {
                                            throw fi_0.c("\u00e8", (Object)v3, (long)-1747318391935604703L, (long)var2_2);
                                        }
                                    }
                                    try {
                                        if (fi_0.c("D", (Object)v1, (long)-1744548879693983825L, (long)var2_2) != null) break block58;
lbl26:
                                        // 2 sources

                                        return;
                                    }
                                    catch (MatchException v4) {
                                        throw fi_0.c("\u00e8", (Object)v4, (long)-1747318391935604703L, (long)var2_2);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                v5 /* !! */  = this.n;
                                                v6 = -1;
                                                if (var16_9 != null) break block59;
                                                if (v5 /* !! */  == v6) break block60;
                                            }
                                            catch (MatchException v7) {
                                                throw fi_0.c("\u00e8", (Object)v7, (long)-1747318391935604703L, (long)var2_2);
                                            }
                                            v8 = new Object[2];
                                            v8[1] = var8_5;
                                            v8[0] = this.h;
                                            v5 /* !! */  = (int)fi_0.c("S", (Object)this.m, (Object)v8, (long)-1743237206015706345L, (long)var2_2);
                                            if (var16_9 != null) break block61;
                                        }
                                        catch (MatchException v9) {
                                            throw fi_0.c("\u00e8", (Object)v9, (long)-1747318391935604703L, (long)var2_2);
                                        }
                                        if (v5 /* !! */  == 0) break block60;
                                    }
                                    catch (MatchException v10) {
                                        throw fi_0.c("\u00e8", (Object)v10, (long)-1747318391935604703L, (long)var2_2);
                                    }
                                    v11 = new Object[2];
                                    v11[1] = var10_6;
                                    v11[0] = this.n;
                                    fi_0.c("\u00e8", (Object)v11, (long)-1746355209554691260L, (long)var2_2);
                                    this.n = -1;
                                }
                                catch (MatchException v12) {
                                    throw fi_0.c("\u00e8", (Object)v12, (long)-1747318391935604703L, (long)var2_2);
                                }
                            }
                            v5 /* !! */  = this.n;
                        }
                        try {
                            if (var16_9 != null) break block62;
                            v6 = -1;
                        }
                        catch (MatchException v13) {
                            throw fi_0.c("\u00e8", (Object)v13, (long)-1747318391935604703L, (long)var2_2);
                        }
                    }
                    try {
                        try {
                            if (v5 /* !! */  == v6 && this.o == null) break block63;
                        }
                        catch (MatchException v14) {
                            throw fi_0.c("\u00e8", (Object)v14, (long)-1747318391935604703L, (long)var2_2);
                        }
                        v5 /* !! */  = 1;
                        break block62;
                    }
                    catch (MatchException v15) {
                        throw fi_0.c("\u00e8", (Object)v15, (long)-1747318391935604703L, (long)var2_2);
                    }
                }
                v5 /* !! */  = 0;
            }
            fi_0.a = v5 /* !! */ ;
            var17_10 = new HashSet<E>();
            var18_11 = fi_0.c("S", (Object)fi_0.c("S", (Object)fi_0.c("D", (Object)fi_0.b, (long)-1733055204710234401L, (long)var2_2), (long)-1746956151716083758L, (long)var2_2), (long)-1742992192940307562L, (long)var2_2);
            while (fi_0.c("S", (Object)var18_11, (long)-1745084804447611375L, (long)var2_2) != false) {
                block74: {
                    block73: {
                        block72: {
                            block70: {
                                block71: {
                                    block69: {
                                        block68: {
                                            block67: {
                                                block66: {
                                                    block64: {
                                                        var19_12 = (class_1297)fi_0.c("S", (Object)var18_11, (long)-1732119686366728536L, (long)var2_2);
                                                        try {
                                                            try {
                                                                v16 = var19_12;
                                                                if (var16_9 != null) break block64;
                                                                v17 /* !! */  = (CallSite)(v16 instanceof class_1684);
                                                                if (var16_9 != null) break block65;
                                                            }
                                                            catch (MatchException v18) {
                                                                throw fi_0.c("\u00e8", (Object)v18, (long)-1747318391935604703L, (long)var2_2);
                                                            }
                                                            if (v17 /* !! */  == false) continue;
                                                        }
                                                        catch (MatchException v19) {
                                                            throw fi_0.c("\u00e8", (Object)v19, (long)-1747318391935604703L, (long)var2_2);
                                                        }
                                                        v16 = var19_12;
                                                    }
                                                    var20_13 = (class_1684)v16;
                                                    try {
                                                        fi_0.c("S", var17_10, (Object)fi_0.c("\u00e8", (int)fi_0.c("S", (Object)var20_13, (long)-1744663811734004260L, (long)var2_2), (long)-1744203616193729101L, (long)var2_2), (long)-1746843528894151712L, (long)var2_2);
                                                        v20 = fi_0.c("S", (Object)this.k, (Object)fi_0.c("\u00e8", (int)fi_0.c("S", (Object)var20_13, (long)-1744663811734004260L, (long)var2_2), (long)-1744203616193729101L, (long)var2_2), (long)-1732595630871652766L, (long)var2_2);
                                                        if (var16_9 != null) break block66;
                                                        if (v20 != false) {
                                                            continue;
                                                        }
                                                    }
                                                    catch (MatchException v21) {
                                                        throw fi_0.c("\u00e8", (Object)v21, (long)-1747318391935604703L, (long)var2_2);
                                                    }
                                                    v20 = fi_0.c("S", (Object)this.k, (Object)fi_0.c("\u00e8", (int)fi_0.c("S", (Object)var20_13, (long)-1744663811734004260L, (long)var2_2), (long)-1744203616193729101L, (long)var2_2), (long)-1746843528894151712L, (long)var2_2);
                                                }
                                                var21_14 = fi_0.c("S", (Object)var20_13, (long)-1743754426061224746L, (long)var2_2);
                                                try {
                                                    v22 = var21_14;
                                                    if (var16_9 != null) break block67;
                                                    if (!(v22 instanceof class_1657)) continue;
                                                }
                                                catch (MatchException v23) {
                                                    throw fi_0.c("\u00e8", (Object)v23, (long)-1747318391935604703L, (long)var2_2);
                                                }
                                                v22 = var21_14;
                                            }
                                            var22_15 = (class_1657)v22;
                                            try {
                                                v24 = fi_0.c("S", (Object)var22_15, (Object)fi_0.c("D", (Object)fi_0.b, (long)-1744548879693983825L, (long)var2_2), (long)-1729755886483124812L, (long)var2_2);
                                                if (var16_9 != null) break block68;
                                                if (v24 != false) {
                                                    continue;
                                                }
                                            }
                                            catch (MatchException v25) {
                                                throw fi_0.c("\u00e8", (Object)v25, (long)-1747318391935604703L, (long)var2_2);
                                            }
                                            v26 = new Object[2];
                                            v26[1] = var4_3;
                                            v26[0] = fi_0.c("S", (Object)fi_0.c("S", (Object)var22_15, (long)-1729529345362597617L, (long)var2_2), (long)-1743816830410931438L, (long)var2_2);
                                            v24 = fi_0.c("S", (Object)fi_0.c("\u00c5", (long)-1731353923611860656L, (long)var2_2), (Object)v26, (long)-1743300110096272983L, (long)var2_2);
                                        }
                                        try {
                                            if (var16_9 != null) break block69;
                                            if (v24 != false) {
                                                continue;
                                            }
                                        }
                                        catch (MatchException v27) {
                                            throw fi_0.c("\u00e8", (Object)v27, (long)-1747318391935604703L, (long)var2_2);
                                        }
                                        v24 = fi_0.c("S", (Object)((Boolean)fi_0.c("S", (Object)this.j, (long)-1730450834434789251L, (long)var2_2)), (long)-1743096662808493100L, (long)var2_2);
                                    }
                                    try {
                                        if (var16_9 != null) break block70;
                                        if (v24 != false) {
                                        }
                                        ** GOTO lbl178
                                    }
                                    catch (MatchException v28) {
                                        throw fi_0.c("\u00e8", (Object)v28, (long)-1747318391935604703L, (long)var2_2);
                                    }
                                    var23_16 = fi_0.c("S", (Object)fi_0.c("\u00c5", (long)-1729639783738603674L, (long)var2_2), (Object)new Object[0], (long)-1731121424978366122L, (long)var2_2);
                                    try {
                                        v29 = var23_16;
                                        if (var16_9 != null) break block71;
                                        if (v29 == null) continue;
                                    }
                                    catch (MatchException v30) {
                                        throw fi_0.c("\u00e8", (Object)v30, (long)-1747318391935604703L, (long)var2_2);
                                    }
                                    v29 = var22_15;
                                }
                                try {
                                    if (fi_0.c("S", (Object)fi_0.c("S", (Object)v29, (long)-1731754933909299649L, (long)var2_2), (Object)fi_0.c("S", (Object)var23_16, (long)-1731754933909299649L, (long)var2_2), (long)-1746429647729114748L, (long)var2_2) == false) {
                                        continue;
                                    }
                                }
                                catch (MatchException v31) {
                                    throw fi_0.c("\u00e8", (Object)v31, (long)-1747318391935604703L, (long)var2_2);
                                }
                                try {
                                    if (var16_9 == null) break block72;
lbl178:
                                    // 2 sources

                                    v24 = (cfr_temp_0 = fi_0.c("S", (Object)fi_0.c("D", (Object)fi_0.b, (long)-1744548879693983825L, (long)var2_2), (Object)var22_15, (long)-1743939443323146262L, (long)var2_2) - fi_0.c("S", (Object)((Float)fi_0.c("S", (Object)this.c, (long)-1730450834434789251L, (long)var2_2)), (long)-1747073315065244502L, (long)var2_2)) == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                }
                                catch (MatchException v32) {
                                    throw fi_0.c("\u00e8", (Object)v32, (long)-1747318391935604703L, (long)var2_2);
                                }
                            }
                            try {
                                if (v24 > 0 && var16_9 == null) continue;
                            }
                            catch (MatchException v33) {
                                throw fi_0.c("\u00e8", (Object)v33, (long)-1747318391935604703L, (long)var2_2);
                            }
                        }
                        v34 = new Object[2];
                        v34[1] = var14_8;
                        v34[0] = var20_13;
                        var23_16 = fi_0.c("S", (Object)this, (Object)v34, (long)-1733825240161865087L, (long)var2_2);
                        try {
                            v35 = var23_16;
                            if (var16_9 != null) break block73;
                            if (v35 == null) {
                                continue;
                            }
                        }
                        catch (MatchException v36) {
                            throw fi_0.c("\u00e8", (Object)v36, (long)-1747318391935604703L, (long)var2_2);
                        }
                        v35 = fi_0.c("S", (Object)fi_0.c("D", (Object)fi_0.b, (long)-1744548879693983825L, (long)var2_2), (long)-1743982834100453233L, (long)var2_2);
                    }
                    var24_17 = fi_0.c("S", (Object)v35, (Object)var23_16, (long)-1732488329623767757L, (long)var2_2);
                    try {
                        cfr_temp_1 = var24_17 - (double)fi_0.c("S", (Object)((Float)fi_0.c("S", (Object)this.d, (long)-1730450834434789251L, (long)var2_2)), (long)-1747073315065244502L, (long)var2_2);
                        v37 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
                        if (var16_9 != null) break block74;
                        if (v37 < 0) {
                            continue;
                        }
                    }
                    catch (MatchException v38) {
                        throw fi_0.c("\u00e8", (Object)v38, (long)-1747318391935604703L, (long)var2_2);
                    }
                    cfr_temp_2 = var24_17 - (double)fi_0.c("S", (Object)((Float)fi_0.c("S", (Object)this.e, (long)-1730450834434789251L, (long)var2_2)), (long)-1747073315065244502L, (long)var2_2);
                    v37 = cfr_temp_2 == 0 ? 0 : (cfr_temp_2 > 0 ? 1 : -1);
                }
                if (v37 > 0) continue;
                this.o = var23_16;
                v39 = new Object[1];
                v39[0] = var6_4;
                fi_0.c("S", (Object)this.l, (Object)v39, (long)-1733742869941932164L, (long)var2_2);
                v40 = new Object[1];
                v40[0] = var12_7;
                fi_0.c("S", (Object)this.g, (Object)v40, (long)-1731237346045958156L, (long)var2_2);
                break;
            }
            v17 /* !! */  = fi_0.c("S", (Object)this.k, var17_10, (long)-1746598068699537186L, (long)var2_2);
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public dC a(Object[] objectArray) {
        CallSite callSite;
        CallSite callSite2;
        block80: {
            fi_0 fi_02;
            int n;
            Object object;
            long l;
            long l2;
            long l3;
            block79: {
                block77: {
                    CallSite callSite3;
                    block78: {
                        CallSite callSite4;
                        CallSite callSite5;
                        long l4;
                        block76: {
                            CallSite callSite6;
                            long l5;
                            block75: {
                                Object object2;
                                CallSite callSite7;
                                block73: {
                                    block74: {
                                        long l6;
                                        block72: {
                                            CallSite callSite8;
                                            CallSite callSite9;
                                            long l7;
                                            block70: {
                                                block71: {
                                                    CallSite callSite10;
                                                    long l8;
                                                    block68: {
                                                        long l9;
                                                        block69: {
                                                            block66: {
                                                                block67: {
                                                                    class_310 class_3102;
                                                                    block65: {
                                                                        block63: {
                                                                            block64: {
                                                                                block62: {
                                                                                    l3 = (Long)objectArray[0];
                                                                                    long l10 = l3;
                                                                                    l8 = l10 ^ 0x614E75F0CB8L;
                                                                                    l2 = l10 ^ 0x1A99A2A6F024L;
                                                                                    l7 = l10 ^ 0x750660A45EAFL;
                                                                                    l9 = l10 ^ 0x1E12C5EE8DD4L;
                                                                                    l5 = l10 ^ 0x6D88BA4E35CEL;
                                                                                    l4 = l10 ^ 0x5D885352C89BL;
                                                                                    l = l10 ^ 0x7C6037A2A158L;
                                                                                    l6 = l10 ^ 0x35A4EE5C881DL;
                                                                                    callSite3 = fi_0.c("\u00e8", (long)-1175809945007058368L, (long)l3);
                                                                                    try {
                                                                                        if (this.o == null) {
                                                                                            return null;
                                                                                        }
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw fi_0.c("\u00e8", (Object)matchException, (long)-1183510194610904974L, (long)l3);
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            class_3102 = b;
                                                                                            if (callSite3 != null) break block62;
                                                                                            if (fi_0.c("D", (Object)class_3102, (long)-1181901775875422212L, (long)l3) == null) return null;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw fi_0.c("\u00e8", (Object)matchException, (long)-1183510194610904974L, (long)l3);
                                                                                        }
                                                                                        class_3102 = b;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw fi_0.c("\u00e8", (Object)matchException, (long)-1183510194610904974L, (long)l3);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        if (callSite3 != null) break block63;
                                                                                        if (fi_0.c("D", (Object)class_3102, (long)-1179406641391939956L, (long)l3) != null) break block64;
                                                                                        return null;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw fi_0.c("\u00e8", (Object)matchException, (long)-1183510194610904974L, (long)l3);
                                                                                    }
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw fi_0.c("\u00e8", (Object)matchException, (long)-1183510194610904974L, (long)l3);
                                                                                }
                                                                            }
                                                                            class_3102 = b;
                                                                        }
                                                                        try {
                                                                            try {
                                                                                if (callSite3 != null) break block65;
                                                                                if (fi_0.c("D", (Object)class_3102, (long)-1181972027663454251L, (long)l3) != null) return null;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw fi_0.c("\u00e8", (Object)matchException, (long)-1183510194610904974L, (long)l3);
                                                                            }
                                                                            class_3102 = b;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw fi_0.c("\u00e8", (Object)matchException, (long)-1183510194610904974L, (long)l3);
                                                                        }
                                                                    }
                                                                    try {
                                                                        try {
                                                                            callSite10 = fi_0.c("S", (Object)class_3102, (long)-1176257987928205237L, (long)l3);
                                                                            if (callSite3 != null) break block66;
                                                                            if (callSite10 != false) break block67;
                                                                            return null;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw fi_0.c("\u00e8", (Object)matchException, (long)-1183510194610904974L, (long)l3);
                                                                        }
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw fi_0.c("\u00e8", (Object)matchException, (long)-1183510194610904974L, (long)l3);
                                                                    }
                                                                }
                                                                callSite10 = fi_0.c("S", (Object)((Boolean)((Object)fi_0.c("S", (Object)this.i, (long)-1175685020971534290L, (long)l3))), (long)-1180978551589729401L, (long)l3);
                                                            }
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            if (callSite3 != null) break block68;
                                                                            if (callSite10 == false) break block69;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw fi_0.c("\u00e8", (Object)matchException, (long)-1183510194610904974L, (long)l3);
                                                                        }
                                                                        callSite10 = fi_0.c("S", (Object)fi_0.c("D", (Object)b, (long)-1181901775875422212L, (long)l3), (long)-1175489161710543434L, (long)l3);
                                                                        if (callSite3 != null) break block68;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw fi_0.c("\u00e8", (Object)matchException, (long)-1183510194610904974L, (long)l3);
                                                                    }
                                                                    if (callSite10 != false) break block69;
                                                                    return null;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw fi_0.c("\u00e8", (Object)matchException, (long)-1183510194610904974L, (long)l3);
                                                                }
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw fi_0.c("\u00e8", (Object)matchException, (long)-1183510194610904974L, (long)l3);
                                                            }
                                                        }
                                                        Object[] objectArray2 = new Object[2];
                                                        objectArray2[1] = l9;
                                                        objectArray2[0] = this.g;
                                                        callSite10 = fi_0.c("S", (Object)this.l, (Object)objectArray2, (long)-1180556153299242172L, (long)l3);
                                                    }
                                                    try {
                                                        if (callSite10 == false) {
                                                            return null;
                                                        }
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw fi_0.c("\u00e8", (Object)matchException, (long)-1183510194610904974L, (long)l3);
                                                    }
                                                    try {
                                                        Object[] objectArray3 = new Object[2];
                                                        objectArray3[1] = l7;
                                                        objectArray3[0] = fi_0.c("\u00c5", (long)-1180453621185891906L, (long)l3);
                                                        if (fi_0.c("\u00e8", (Object)objectArray3, (long)-1179160016840162254L, (long)l3) == null) {
                                                            this.o = null;
                                                            return null;
                                                        }
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw fi_0.c("\u00e8", (Object)matchException, (long)-1183510194610904974L, (long)l3);
                                                    }
                                                    Object[] objectArray4 = new Object[3];
                                                    objectArray4[2] = l8;
                                                    objectArray4[1] = this.o;
                                                    objectArray4[0] = fi_0.c("S", (Object)fi_0.c("D", (Object)b, (long)-1181901775875422212L, (long)l3), (long)-1180167078304134948L, (long)l3);
                                                    callSite9 = fi_0.c("S", (Object)this, (Object)objectArray4, (long)-1181562911257146543L, (long)l3);
                                                    try {
                                                        try {
                                                            callSite8 = callSite9;
                                                            if (callSite3 != null) break block70;
                                                            if (callSite8 != null) break block71;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw fi_0.c("\u00e8", (Object)matchException, (long)-1183510194610904974L, (long)l3);
                                                        }
                                                        this.o = null;
                                                        return null;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw fi_0.c("\u00e8", (Object)matchException, (long)-1183510194610904974L, (long)l3);
                                                    }
                                                }
                                                callSite8 = callSite9;
                                            }
                                            callSite2 = fi_0.c("S", (Object)callSite8, (Object)new Object[0], (long)-1183570817214169881L, (long)l3);
                                            callSite = fi_0.c("S", (Object)callSite9, (Object)new Object[0], (long)-1176293408482251927L, (long)l3);
                                            Object[] objectArray5 = new Object[2];
                                            objectArray5[1] = l7;
                                            objectArray5[0] = fi_0.c("\u00c5", (long)-1180453621185891906L, (long)l3);
                                            callSite7 = fi_0.c("\u00e8", (Object)objectArray5, (long)-1179160016840162254L, (long)l3);
                                            try {
                                                try {
                                                    if (callSite3 != null) return null;
                                                    if (callSite7 != null) break block72;
                                                }
                                                catch (MatchException matchException) {
                                                    throw fi_0.c("\u00e8", (Object)matchException, (long)-1183510194610904974L, (long)l3);
                                                }
                                                this.o = null;
                                                return null;
                                            }
                                            catch (MatchException matchException) {
                                                throw fi_0.c("\u00e8", (Object)matchException, (long)-1183510194610904974L, (long)l3);
                                            }
                                        }
                                        Object[] objectArray6 = new Object[1];
                                        objectArray6[0] = l6;
                                        callSite5 = fi_0.c("\u00e8", (Object)objectArray6, (long)-1183397753114893232L, (long)l3);
                                        try {
                                            try {
                                                object2 = callSite5;
                                                if (callSite3 != null) break block73;
                                                if (object2 == fi_0.c("S", (Object)callSite7, (long)-1178791634076246242L, (long)l3)) break block74;
                                            }
                                            catch (MatchException matchException) {
                                                throw fi_0.c("\u00e8", (Object)matchException, (long)-1183510194610904974L, (long)l3);
                                            }
                                            object2 = 1;
                                            break block73;
                                        }
                                        catch (MatchException matchException) {
                                            throw fi_0.c("\u00e8", (Object)matchException, (long)-1183510194610904974L, (long)l3);
                                        }
                                    }
                                    object2 = 0;
                                }
                                callSite4 = object2;
                                try {
                                    try {
                                        callSite6 = callSite4;
                                        if (callSite3 != null) break block75;
                                        if (callSite6 == false) break block76;
                                    }
                                    catch (MatchException matchException) {
                                        throw fi_0.c("\u00e8", (Object)matchException, (long)-1183510194610904974L, (long)l3);
                                    }
                                    callSite6 = fi_0.c("S", (Object)callSite7, (long)-1178791634076246242L, (long)l3);
                                }
                                catch (MatchException matchException) {
                                    throw fi_0.c("\u00e8", (Object)matchException, (long)-1183510194610904974L, (long)l3);
                                }
                            }
                            Object[] objectArray7 = new Object[2];
                            objectArray7[1] = l5;
                            objectArray7[0] = (int)callSite6;
                            fi_0.c("\u00e8", (Object)objectArray7, (long)-1184262390995946729L, (long)l3);
                        }
                        CallSite callSite11 = fi_0.c("S", (Object)fi_0.c("D", (Object)b, (long)-1181901775875422212L, (long)l3), (long)-1179268719462443588L, (long)l3);
                        CallSite callSite12 = fi_0.c("S", (Object)fi_0.c("D", (Object)b, (long)-1181901775875422212L, (long)l3), (long)-1178588258739650311L, (long)l3);
                        try {
                            try {
                                try {
                                    try {
                                        fi_0.c("S", (Object)fi_0.c("D", (Object)b, (long)-1181901775875422212L, (long)l3), (float)callSite2, (long)-1176977611668449857L, (long)l3);
                                        fi_0.c("S", (Object)fi_0.c("D", (Object)b, (long)-1181901775875422212L, (long)l3), (float)callSite, (long)-1175917033801080791L, (long)l3);
                                        Object[] objectArray8 = new Object[2];
                                        objectArray8[1] = l4;
                                        objectArray8[0] = fi_0.c("\u00c5", (long)-1179760010770509461L, (long)l3);
                                        fi_0.c("\u00e8", (Object)objectArray8, (long)-1181769562150861458L, (long)l3);
                                        fi_0.c("S", (Object)fi_0.c("D", (Object)b, (long)-1181901775875422212L, (long)l3), (float)callSite11, (long)-1176977611668449857L, (long)l3);
                                        fi_0.c("S", (Object)fi_0.c("D", (Object)b, (long)-1181901775875422212L, (long)l3), (float)callSite12, (long)-1175917033801080791L, (long)l3);
                                        object = callSite4;
                                        if (callSite3 != null) break block77;
                                        if (object == false) break block78;
                                    }
                                    catch (MatchException matchException) {
                                        throw fi_0.c("\u00e8", (Object)matchException, (long)-1183510194610904974L, (long)l3);
                                    }
                                    object = this.n;
                                    n = -1;
                                    if (callSite3 != null) break block79;
                                }
                                catch (MatchException matchException) {
                                    throw fi_0.c("\u00e8", (Object)matchException, (long)-1183510194610904974L, (long)l3);
                                }
                                if (object != n) break block78;
                            }
                            catch (MatchException matchException) {
                                throw fi_0.c("\u00e8", (Object)matchException, (long)-1183510194610904974L, (long)l3);
                            }
                            this.n = (int)callSite5;
                        }
                        catch (MatchException matchException) {
                            throw fi_0.c("\u00e8", (Object)matchException, (long)-1183510194610904974L, (long)l3);
                        }
                    }
                    try {
                        fi_02 = this;
                        if (callSite3 != null) break block80;
                        object = fi_02.n;
                    }
                    catch (MatchException matchException) {
                        throw fi_0.c("\u00e8", (Object)matchException, (long)-1183510194610904974L, (long)l3);
                    }
                }
                n = -1;
            }
            try {
                if (object != n) {
                    Object[] objectArray9 = new Object[1];
                    objectArray9[0] = l2;
                    fi_0.c("S", (Object)this.m, (Object)objectArray9, (long)-1178933088932288721L, (long)l3);
                    Object[] objectArray10 = new Object[1];
                    objectArray10[0] = l;
                    fi_0.c("S", (Object)this.h, (Object)objectArray10, (long)-1176991601482240089L, (long)l3);
                }
            }
            catch (MatchException matchException) {
                throw fi_0.c("\u00e8", (Object)matchException, (long)-1183510194610904974L, (long)l3);
            }
            fi_02 = this;
        }
        fi_02.o = null;
        return new dC((float)callSite2, (float)callSite);
    }

    private static int m(long l, long l2) {
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
            case 0 -> 58;
            case 1 -> 19;
            case 2 -> 32;
            case 3 -> 28;
            case 4 -> 2;
            case 5 -> 60;
            case 6 -> 5;
            case 7 -> 29;
            case 8 -> 1;
            case 9 -> 43;
            case 10 -> 31;
            case 11 -> 50;
            case 12 -> 13;
            case 13 -> 38;
            case 14 -> 24;
            case 15 -> 7;
            case 16 -> 21;
            case 17 -> 23;
            case 18 -> 18;
            case 19 -> 47;
            case 20 -> 8;
            case 21 -> 14;
            case 22 -> 63;
            case 23 -> 61;
            case 24 -> 9;
            case 25 -> 39;
            case 26 -> 55;
            case 27 -> 12;
            case 28 -> 57;
            case 29 -> 52;
            case 30 -> 10;
            case 31 -> 20;
            case 32 -> 44;
            case 33 -> 33;
            case 34 -> 0;
            case 35 -> 62;
            case 36 -> 6;
            case 37 -> 15;
            case 38 -> 53;
            case 39 -> 30;
            case 40 -> 59;
            case 41 -> 46;
            case 42 -> 40;
            case 43 -> 56;
            case 44 -> 4;
            case 45 -> 3;
            case 46 -> 51;
            case 47 -> 48;
            case 48 -> 11;
            case 49 -> 16;
            case 50 -> 37;
            case 51 -> 35;
            case 52 -> 17;
            case 53 -> 25;
            case 54 -> 54;
            case 55 -> 36;
            case 56 -> 27;
            case 57 -> 49;
            case 58 -> 42;
            case 59 -> 45;
            case 60 -> 22;
            case 61 -> 41;
            case 62 -> 26;
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
        fi_0.E[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = fi_0.m(l, l2);
        Object object = D[n];
        if (object instanceof String) {
            String string = E[n];
            int n2 = string.indexOf(8);
            Class clazz = fi_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fi_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fi_0.g(clazz3, string2, clazz2)) != null) {
                    fi_0.D[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fi_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fi_0.D[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fi_0.n(120809097536185L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = fi_0.m(l, l2);
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
                clazz3 = fi_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fi_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fi_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        fi_0.D[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fi_0.n(120809097536185L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fi_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fi_0.D[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fi_0.n(120809097536185L, 0L);
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

    private void j(Object[] objectArray) {
        class_243 class_2432 = (class_243)objectArray[0];
        class_243 class_2433 = (class_243)objectArray[1];
        float f = ((Float)objectArray[2]).floatValue();
        gH gH2 = (gH)objectArray[3];
        List list = (List)objectArray[4];
        long l = (Long)objectArray[5];
        long l2 = (l = z ^ l) ^ 0x16D1BCDB84A3L;
        int n = (int)fi_0.c("\u00e8", (double)11.0, (long)-7671934575266638158L, (long)l);
        int n2 = -n;
        CallSite callSite = fi_0.c("\u00e8", (long)-7657614134534018988L, (long)l);
        while (n2 <= n) {
            block11: {
                block12: {
                    reference var14_12;
                    block13: {
                        var14_12 = fi_0.c("S", (Object)gH2, (long)-7659099191798259522L, (long)l) + (float)n2 * 0.2f;
                        try {
                            try {
                                try {
                                    if (callSite != null) break block11;
                                    if (var14_12 < -85.0f) break block12;
                                }
                                catch (MatchException matchException) {
                                    throw fi_0.c("\u00e8", (Object)matchException, (long)-7672079679309440410L, (long)l);
                                }
                                if (!(var14_12 > 85.0f)) break block13;
                                break block12;
                            }
                            catch (MatchException matchException) {
                                throw fi_0.c("\u00e8", (Object)matchException, (long)-7672079679309440410L, (long)l);
                            }
                        }
                        catch (MatchException matchException) {
                            throw fi_0.c("\u00e8", (Object)matchException, (long)-7672079679309440410L, (long)l);
                        }
                    }
                    Object[] objectArray2 = new Object[5];
                    objectArray2[4] = l2;
                    objectArray2[3] = Float.valueOf((float)var14_12);
                    objectArray2[2] = Float.valueOf(f);
                    objectArray2[1] = class_2433;
                    objectArray2[0] = class_2432;
                    CallSite callSite2 = fi_0.c("S", (Object)this, (Object)objectArray2, (long)-7659734676948340216L, (long)l);
                    try {
                        try {
                            if (callSite != null) break block11;
                            if (callSite2 == null) break block12;
                        }
                        catch (MatchException matchException) {
                            throw fi_0.c("\u00e8", (Object)matchException, (long)-7672079679309440410L, (long)l);
                        }
                        fi_0.c("S", (Object)list, (Object)callSite2, (long)-7672982818659559918L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw fi_0.c("\u00e8", (Object)matchException, (long)-7672079679309440410L, (long)l);
                    }
                }
                ++n2;
            }
            if (callSite == null) continue;
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fi_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(fi_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


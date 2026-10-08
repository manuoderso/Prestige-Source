/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_2885
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 *  net.minecraft.class_3965
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.a5;
import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bh_0;
import dev.zprestige.prestige.dC;
import dev.zprestige.prestige.dF;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dQ;
import dev.zprestige.prestige.dR;
import dev.zprestige.prestige.dS;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1297;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2885;
import net.minecraft.class_3959;
import net.minecraft.class_3965;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.ec
 */
public class ec_0
extends dV
implements dF {
    private dR a;
    private dS c;
    private dQ d;
    private dR e;
    private dM f;
    private dM g;
    private dM h;
    private dO i;
    private ArrayList j;
    private ArrayList k;
    private int l;
    private boolean m;
    private f5 n;
    private static final long o;
    private static final String[] p;
    private static final String[] q;
    private static final Map r;
    private static final Object[] s;
    private static final String[] t;

    private boolean lambda$onTick$2(class_2338 class_23382) {
        Object object;
        block2: {
            block3: {
                long l = o ^ 0xA9A03362589L;
                long l2 = l ^ 0x3B2745317B7DL;
                CallSite callSite = ec_0.c("\u00ff", (long)3839022356019694562L, (long)l);
                try {
                    Object[] objectArray = new Object[2];
                    objectArray[1] = l2;
                    objectArray[0] = ec_0.c("\u00a2", (Object)ec_0.c("\u00a2", (Object)ec_0.c("O", (Object)b, (long)3852848176111616875L, (long)l), (Object)class_23382, (long)3849229359671362990L, (long)l), (long)3839291810480004121L, (long)l);
                    object = ec_0.c("\u00a2", (Object)this, (Object)objectArray, (long)3848490121563978334L, (long)l);
                    if (callSite != null) break block2;
                    if (object != false) break block3;
                }
                catch (MatchException matchException) {
                    throw ec_0.c("\u00ff", (Object)matchException, (long)3854665267442997360L, (long)l);
                }
                object = 1;
                break block2;
            }
            object = 0;
        }
        return (boolean)object;
    }

    public ec_0() {
        long l;
        long l2 = l = o ^ 0x11912FCAA25FL;
        long l3 = l2 ^ 0x3C7C997B4912L;
        long l4 = l2 ^ 0x344A8A4E5ECBL;
        long l5 = l2 ^ 0x6907309F2220L;
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = -1;
        this.m = 0;
        this.n = new f5(l3);
        Object[] objectArray = new Object[2];
        objectArray[1] = l5;
        objectArray[0] = this::lambda$new$0;
        ec_0.c("\u00a2", (Object)this.h, (Object)objectArray, (long)-5567804205027609973L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l4;
        objectArray2[0] = this::lambda$new$1;
        ec_0.c("\u00a2", (Object)this.i, (Object)objectArray2, (long)-5578913947583307977L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                ec_0.o = hc.a(-3268558863252695796L, -565905775579962319L, MethodHandles.lookup().lookupClass()).a(192356304311433L);
                ec_0.s = new Object[215];
                ec_0.t = new String[215];
                ec_0.f();
                ec_0.r = new HashMap<K, V>(13);
                var0 = ec_0.o ^ 106025544677397L;
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
                var9_3 = new String[10];
                var7_4 = 0;
                var6_5 = "\u0012\u00d1\rU\u0081\u00fc\u00b6>\u00baC\u001dS\u00e7y\u00b8\u00e6\u00d3X\u0014wDP\u00c0\u0015\u00108p\u00ddA\u0096A|K\u00d81\u00a0S\u0010\u00f1\u0080\u00f3\u0010>+\u00c6\u00c7\u0003\u00f2\u00cfS|3)\u00bc\u0083z\u00da3\u0010vR'\u00c5\u00df\u007f\u0005v\u00ed\n;WW>\u00f1\u00a7\u0010I#\u00027K\u008b\u00b1\u001b<5&\u00d2\u0005\u008f\u00aa\u0088\u0018G\u00ce\u00a4+\u00ee\u00a6\u00ba\u00afhO\u0017,\u00ff/B\u0005\u0099\u00eb7\u0088(\u008d\u00b2( \u00ed\u009d!\u0012[;J\u0084H\u0098!E\u00d9$cV\u00f7\u0004\u00f9\u0004V\u00f4\u0001\u00f18\u00bfQj(\u00c4\u00e4s\u0010\u007f\u00dc\u00d2\u00a86\u00dc\u00c5\u00ce\u00e8\u0085C_\u00cb\u0095)\u00e9";
                var8_6 = "\u0012\u00d1\rU\u0081\u00fc\u00b6>\u00baC\u001dS\u00e7y\u00b8\u00e6\u00d3X\u0014wDP\u00c0\u0015\u00108p\u00ddA\u0096A|K\u00d81\u00a0S\u0010\u00f1\u0080\u00f3\u0010>+\u00c6\u00c7\u0003\u00f2\u00cfS|3)\u00bc\u0083z\u00da3\u0010vR'\u00c5\u00df\u007f\u0005v\u00ed\n;WW>\u00f1\u00a7\u0010I#\u00027K\u008b\u00b1\u001b<5&\u00d2\u0005\u008f\u00aa\u0088\u0018G\u00ce\u00a4+\u00ee\u00a6\u00ba\u00afhO\u0017,\u00ff/B\u0005\u0099\u00eb7\u0088(\u008d\u00b2( \u00ed\u009d!\u0012[;J\u0084H\u0098!E\u00d9$cV\u00f7\u0004\u00f9\u0004V\u00f4\u0001\u00f18\u00bfQj(\u00c4\u00e4s\u0010\u007f\u00dc\u00d2\u00a86\u00dc\u00c5\u00ce\u00e8\u0085C_\u00cb\u0095)\u00e9".length();
                var5_7 = 24;
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
                    var9_3[var7_4++] = ec_0.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00fb\u0019\u0081\u00e4K\u00cf\u00dbr\u0006\u00e7\u00ebj\u00ad\u000b\u008da\u0018b\u0089\u00ecQ\u0090z\u00a7\u00ed\u007f\rw\u008d\u00e0\u00ba\u00fe\u00b3)\u0097\u009aR\u00e0\u00d9N\u0007";
                    var8_6 = "\u00fb\u0019\u0081\u00e4K\u00cf\u00dbr\u0006\u00e7\u00ebj\u00ad\u000b\u008da\u0018b\u0089\u00ecQ\u0090z\u00a7\u00ed\u007f\rw\u008d\u00e0\u00ba\u00fe\u00b3)\u0097\u009aR\u00e0\u00d9N\u0007".length();
                    var5_7 = 16;
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
                    var9_3[var7_4++] = ec_0.b(var10_9).intern();
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
        ec_0.p = var9_3;
        ec_0.q = new String[10];
    }

    private boolean e(Object[] objectArray) {
        CallSite callSite;
        block22: {
            long l;
            long l2;
            class_2338 class_23382;
            block23: {
                CallSite callSite2;
                block20: {
                    block21: {
                        block18: {
                            block19: {
                                block16: {
                                    block17: {
                                        class_23382 = (class_2338)objectArray[0];
                                        l2 = (Long)objectArray[1];
                                        long l3 = l2 = o ^ l2;
                                        l = l3 ^ 0x2241643D9744L;
                                        long l4 = l3 ^ 0x330264382EAAL;
                                        callSite2 = ec_0.c("\u00ff", (long)6958618168119991861L, (long)l2);
                                        try {
                                            try {
                                                Object[] objectArray2 = new Object[2];
                                                objectArray2[1] = l4;
                                                objectArray2[0] = ec_0.c("\u00a2", (Object)ec_0.c("\u00a2", (Object)ec_0.c("O", (Object)b, (long)6966814797948802748L, (long)l2), (Object)class_23382, (long)6970514013075411065L, (long)l2), (long)6958324938947381710L, (long)l2);
                                                callSite = ec_0.c("\u00a2", (Object)this, (Object)objectArray2, (long)6971463668817129353L, (long)l2);
                                                if (callSite2 != null) break block16;
                                                if (callSite != false) break block17;
                                            }
                                            catch (MatchException matchException) {
                                                throw ec_0.c("\u00ff", (Object)matchException, (long)6965253907130912167L, (long)l2);
                                            }
                                            return false;
                                        }
                                        catch (MatchException matchException) {
                                            throw ec_0.c("\u00ff", (Object)matchException, (long)6965253907130912167L, (long)l2);
                                        }
                                    }
                                    callSite = ec_0.c("\u00a2", (Object)ec_0.c("\u00a2", (Object)ec_0.c("O", (Object)b, (long)6966814797948802748L, (long)l2), (Object)class_23382, (long)6958206559872181577L, (long)l2), (long)6962968075740888359L, (long)l2);
                                }
                                try {
                                    try {
                                        if (callSite2 != null) break block18;
                                        if (callSite != false) break block19;
                                    }
                                    catch (MatchException matchException) {
                                        throw ec_0.c("\u00ff", (Object)matchException, (long)6965253907130912167L, (long)l2);
                                    }
                                    return false;
                                }
                                catch (MatchException matchException) {
                                    throw ec_0.c("\u00ff", (Object)matchException, (long)6965253907130912167L, (long)l2);
                                }
                            }
                            callSite = ec_0.c("\u00a2", (Object)this.k, (Object)class_23382, (long)6959711444616405034L, (long)l2);
                        }
                        try {
                            try {
                                if (callSite2 != null) break block20;
                                if (callSite == false) break block21;
                            }
                            catch (MatchException matchException) {
                                throw ec_0.c("\u00ff", (Object)matchException, (long)6965253907130912167L, (long)l2);
                            }
                            return false;
                        }
                        catch (MatchException matchException) {
                            throw ec_0.c("\u00ff", (Object)matchException, (long)6965253907130912167L, (long)l2);
                        }
                    }
                    callSite = ec_0.c("\u00a2", (Object)this.j, (Object)class_23382, (long)6959711444616405034L, (long)l2);
                }
                try {
                    try {
                        if (callSite2 != null) break block22;
                        if (callSite == false) break block23;
                    }
                    catch (MatchException matchException) {
                        throw ec_0.c("\u00ff", (Object)matchException, (long)6965253907130912167L, (long)l2);
                    }
                    return false;
                }
                catch (MatchException matchException) {
                    throw ec_0.c("\u00ff", (Object)matchException, (long)6965253907130912167L, (long)l2);
                }
            }
            Object[] objectArray3 = new Object[3];
            objectArray3[2] = l;
            objectArray3[1] = class_23382;
            objectArray3[0] = ec_0.c("\u00a2", (Object)ec_0.c("\u00a2", (Object)ec_0.c("O", (Object)b, (long)6966814797948802748L, (long)l2), (Object)class_23382, (long)6970514013075411065L, (long)l2), (long)6958324938947381710L, (long)l2);
            callSite = ec_0.c("\u00a2", (Object)this, (Object)objectArray3, (long)6958644618196264078L, (long)l2);
        }
        return (boolean)callSite;
    }

    @Override
    public void e(Object[] objectArray) {
        long l;
        long l2;
        block14: {
            ec_0 ec_02;
            block15: {
                block18: {
                    Object object;
                    long l3;
                    block16: {
                        l2 = (Long)objectArray[0];
                        long l4 = l2;
                        long l5 = l4 ^ 0x4B64345D78F2L;
                        l = l4 ^ 0x7FAB131DDD11L;
                        l3 = l4 ^ 0x5A266ADED12L;
                        CallSite callSite = ec_0.c("\u00ff", (long)3997759682940258782L, (long)l2);
                        try {
                            block17: {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        ec_02 = this;
                                                        if (callSite != null) break block14;
                                                        if (ec_0.c("\u00a2", (Object)((Boolean)((Object)ec_0.c("\u00a2", (Object)ec_02.h, (long)3997044851047559571L, (long)l2))), (long)3985207814919014285L, (long)l2) == false) break block15;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw ec_0.c("\u00ff", (Object)matchException, (long)3981906224792197708L, (long)l2);
                                                    }
                                                    ec_02 = this;
                                                    if (callSite != null) break block14;
                                                }
                                                catch (MatchException matchException) {
                                                    throw ec_0.c("\u00ff", (Object)matchException, (long)3981906224792197708L, (long)l2);
                                                }
                                                if (ec_02.l == -1) break block15;
                                            }
                                            catch (MatchException matchException) {
                                                throw ec_0.c("\u00ff", (Object)matchException, (long)3981906224792197708L, (long)l2);
                                            }
                                            object = ec_0.c("\u00a2", (Object)ec_0.c("\u00f2", (long)3981414690938629349L, (long)l2), (Object)new Object[0], (long)3983134866247544704L, (long)l2);
                                            if (callSite != null) break block16;
                                        }
                                        catch (MatchException matchException) {
                                            throw ec_0.c("\u00ff", (Object)matchException, (long)3981906224792197708L, (long)l2);
                                        }
                                        if (object == false) break block17;
                                    }
                                    catch (MatchException matchException) {
                                        throw ec_0.c("\u00ff", (Object)matchException, (long)3981906224792197708L, (long)l2);
                                    }
                                    Object[] objectArray2 = new Object[2];
                                    objectArray2[1] = l5;
                                    objectArray2[0] = this.l;
                                    ec_0.c("\u00a2", (Object)ec_0.c("\u00f2", (long)3981414690938629349L, (long)l2), (Object)objectArray2, (long)3982597163275434133L, (long)l2);
                                    if (callSite == null) break block18;
                                }
                                catch (MatchException matchException) {
                                    throw ec_0.c("\u00ff", (Object)matchException, (long)3981906224792197708L, (long)l2);
                                }
                            }
                            object = this.l;
                        }
                        catch (MatchException matchException) {
                            throw ec_0.c("\u00ff", (Object)matchException, (long)3981906224792197708L, (long)l2);
                        }
                    }
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = l3;
                    objectArray3[0] = (int)object;
                    ec_0.c("\u00ff", (Object)objectArray3, (long)3987504263998520929L, (long)l2);
                }
                this.l = -1;
            }
            ec_0.c("\u00a2", (Object)this.k, (long)3985336858157783530L, (long)l2);
            ec_02 = this;
        }
        ec_02.m = 0;
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l;
        objectArray4[0] = this;
        ec_0.c("\u00a2", (Object)ec_0.c("\u00f2", (long)3981414690938629349L, (long)l2), (Object)objectArray4, (long)3983233272725777410L, (long)l2);
    }

    private class_3965 b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = o ^ l;
        long l3 = l2 ^ 0x2070DC196AF8L;
        long l4 = l2 ^ 0x391BB3B954A8L;
        long l5 = l2 ^ 0x2AB83D5ED270L;
        long l6 = l2 ^ 0x438C8C2D6C53L;
        CallSite callSite = ec_0.c("\u00a2", (Object)ec_0.c("O", (Object)b, (long)-6771659250622751450L, (long)l), (long)-6773230016551303642L, (long)l);
        CallSite callSite2 = ec_0.c("\u00ff", (long)-6759363286036849515L, (long)l);
        CallSite callSite3 = ec_0.c("\u00a2", (Object)ec_0.c("\u00ff", (Object)ec_0.c("\u00a2", (Object)ec_0.c("O", (Object)b, (long)-6771659250622751450L, (long)l), (long)-6771171904533836173L, (long)l), (int)5, (int)5, (int)5, (long)-6772605874292971804L, (long)l), (long)-6773312535714833425L, (long)l);
        while (ec_0.c("\u00a2", (Object)callSite3, (long)-6771452441047758512L, (long)l) != false) {
            CallSite callSite4;
            block20: {
                CallSite callSite5;
                class_2338 class_23382;
                block18: {
                    CallSite callSite6;
                    block17: {
                        class_23382 = (class_2338)ec_0.c("\u00a2", (Object)callSite3, (long)-6770368577437890690L, (long)l);
                        try {
                            Object[] objectArray2 = new Object[1];
                            objectArray2[0] = l6;
                            Object[] objectArray3 = new Object[1];
                            objectArray3[0] = l4;
                            reference cfr_temp_0 = ec_0.c("\u00a2", (Object)ec_0.c("\u00ff", (Object)objectArray2, (long)-6772448070295794239L, (long)l), (Object)ec_0.c("\u00a2", (Object)class_23382, (long)-6758741529220872107L, (long)l), (long)-6770976053009990366L, (long)l) - (double)ec_0.c("\u00ff", (Object)objectArray3, (long)-6758781241118980120L, (long)l);
                            callSite6 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                            if (callSite2 != null) break block17;
                            if (callSite6 > 0) {
                                continue;
                            }
                        }
                        catch (MatchException matchException) {
                            throw ec_0.c("\u00ff", (Object)matchException, (long)-6770707692251295993L, (long)l);
                        }
                        Object[] objectArray4 = new Object[2];
                        objectArray4[1] = l5;
                        objectArray4[0] = class_23382;
                        callSite6 = ec_0.c("\u00a2", (Object)this, (Object)objectArray4, (long)-6772210065910771710L, (long)l);
                    }
                    if (callSite6 == false) continue;
                    class_238 class_2382 = new class_238((double)ec_0.c("\u00a2", (Object)class_23382, (long)-6772038446946266746L, (long)l), (double)ec_0.c("\u00a2", (Object)class_23382, (long)-6759864158253914418L, (long)l), (double)ec_0.c("\u00a2", (Object)class_23382, (long)-6770506360240019282L, (long)l), (double)(ec_0.c("\u00a2", (Object)class_23382, (long)-6772038446946266746L, (long)l) + 1), (double)(ec_0.c("\u00a2", (Object)class_23382, (long)-6759864158253914418L, (long)l) + 1), (double)(ec_0.c("\u00a2", (Object)class_23382, (long)-6770506360240019282L, (long)l) + 1));
                    try {
                        Object[] objectArray5 = new Object[3];
                        objectArray5[2] = l3;
                        objectArray5[1] = class_2382;
                        objectArray5[0] = callSite;
                        Object[] objectArray6 = new Object[1];
                        objectArray6[0] = l4;
                        if (ec_0.c("\u00a2", (Object)callSite, (Object)ec_0.c("\u00a2", (Object)this, (Object)objectArray5, (long)-6769991384355648448L, (long)l), (long)-6770976053009990366L, (long)l) > (double)ec_0.c("\u00ff", (Object)objectArray6, (long)-6758781241118980120L, (long)l)) {
                            continue;
                        }
                    }
                    catch (MatchException matchException) {
                        throw ec_0.c("\u00ff", (Object)matchException, (long)-6770707692251295993L, (long)l);
                    }
                    callSite5 = ec_0.c("\u00a2", (Object)ec_0.c("O", (Object)b, (long)-6769181158119336932L, (long)l), (Object)new class_3959((class_243)callSite, (class_243)ec_0.c("\u00a2", (Object)class_2382, (long)-6770666486637627811L, (long)l), (class_3959.class_3960)ec_0.c("\u00f2", (long)-6771551013266169597L, (long)l), (class_3959.class_242)ec_0.c("\u00f2", (long)-6770830911559543179L, (long)l), (class_1297)ec_0.c("O", (Object)b, (long)-6771659250622751450L, (long)l)), (long)-6770419208396929918L, (long)l);
                    try {
                        try {
                            callSite4 = callSite5;
                            if (callSite2 != null) break block18;
                            if (ec_0.c("\u00a2", (Object)callSite4, (long)-6758440608985553435L, (long)l) == ec_0.c("\u00f2", (long)-6769231380291002185L, (long)l)) {
                                continue;
                            }
                        }
                        catch (MatchException matchException) {
                            throw ec_0.c("\u00ff", (Object)matchException, (long)-6770707692251295993L, (long)l);
                        }
                    }
                    catch (MatchException matchException) {
                        throw ec_0.c("\u00ff", (Object)matchException, (long)-6770707692251295993L, (long)l);
                    }
                    callSite4 = callSite5;
                }
                try {
                    try {
                        if (callSite2 != null) break block20;
                        if (ec_0.c("\u00a2", (Object)ec_0.c("\u00a2", (Object)callSite4, (long)-6772734698437905723L, (long)l), (Object)class_23382, (long)-6758133938020834414L, (long)l) != false) {
                            continue;
                        }
                    }
                    catch (MatchException matchException) {
                        throw ec_0.c("\u00ff", (Object)matchException, (long)-6770707692251295993L, (long)l);
                    }
                }
                catch (MatchException matchException) {
                    throw ec_0.c("\u00ff", (Object)matchException, (long)-6770707692251295993L, (long)l);
                }
                callSite4 = callSite5;
            }
            return callSite4;
        }
        return null;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ec" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ec_0.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6565;
        if (q[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])r.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    r.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/ec", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = p[n2].getBytes("ISO-8859-1");
            ec_0.q[n2] = ec_0.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return q[n2];
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
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ec" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ec_0.m(l, l2);
            object = s[n];
            try {
                if (!(object instanceof String)) break block2;
                ec_0.s[n] = clazz = Class.forName(t[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ec_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ec_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private boolean h(Object[] objectArray) {
        class_2338 class_23382 = (class_2338)objectArray[0];
        long l = (Long)objectArray[1];
        l = o ^ l;
        CallSite callSite = ec_0.c("\u00ff", (long)-4405036032631788659L, (long)l);
        int n = ((CallSite)callSite).length;
        int n2 = 0;
        CallSite callSite2 = ec_0.c("\u00ff", (long)-4399843761463772076L, (long)l);
        while (n2 < n) {
            block5: {
                block6: {
                    CallSite callSite3 = callSite[n2];
                    try {
                        try {
                            if (callSite2 != null) break block5;
                            if (ec_0.c("\u00a2", (Object)ec_0.c("\u00a2", (Object)ec_0.c("O", (Object)b, (long)-4409448345428757283L, (long)l), (Object)ec_0.c("\u00a2", (Object)class_23382, (Object)callSite3, (long)-4413417134850209432L, (long)l), (long)-4405265207327542760L, (long)l), (long)-4399585173384467537L, (long)l) != ec_0.c("\u00f2", (long)-4404669386043242350L, (long)l)) break block6;
                        }
                        catch (MatchException matchException) {
                            throw ec_0.c("\u00ff", (Object)matchException, (long)-4411017774515343418L, (long)l);
                        }
                        return true;
                    }
                    catch (MatchException matchException) {
                        throw ec_0.c("\u00ff", (Object)matchException, (long)-4411017774515343418L, (long)l);
                    }
                }
                ++n2;
            }
            if (callSite2 == null) continue;
        }
        return false;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = ec_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ec_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private boolean f(Object[] objectArray) {
        int n;
        block35: {
            block34: {
                CallSite callSite;
                CallSite callSite2;
                long l;
                long l2;
                class_2338 class_23382;
                class_2248 class_22482;
                block32: {
                    long l3;
                    block33: {
                        block30: {
                            block31: {
                                block28: {
                                    block29: {
                                        class_22482 = (class_2248)objectArray[0];
                                        class_23382 = (class_2338)objectArray[1];
                                        l2 = (Long)objectArray[2];
                                        long l4 = l2 = o ^ l2;
                                        l3 = l4 ^ 0xB7B52646FF0L;
                                        l = l4 ^ 0x457368D93525L;
                                        callSite2 = ec_0.c("\u00ff", (long)-1799783856738952799L, (long)l2);
                                        try {
                                            try {
                                                try {
                                                    Object[] objectArray2 = new Object[2];
                                                    objectArray2[1] = l3;
                                                    objectArray2[0] = ec_0.b("c", (int)12801, (long)(0x748CCF8B9DF3307AL ^ l2));
                                                    callSite = ec_0.c("\u00a2", (Object)this.c, (Object)objectArray2, (long)-1789883391579699188L, (long)l2);
                                                    if (callSite2 != null) break block28;
                                                    if (callSite == false) break block29;
                                                }
                                                catch (MatchException matchException) {
                                                    throw ec_0.c("\u00ff", (Object)matchException, (long)-1784105211070510541L, (long)l2);
                                                }
                                                if (class_22482 != ec_0.c("\u00f2", (long)-1800579422242180108L, (long)l2)) break block29;
                                            }
                                            catch (MatchException matchException) {
                                                throw ec_0.c("\u00ff", (Object)matchException, (long)-1784105211070510541L, (long)l2);
                                            }
                                            return true;
                                        }
                                        catch (MatchException matchException) {
                                            throw ec_0.c("\u00ff", (Object)matchException, (long)-1784105211070510541L, (long)l2);
                                        }
                                    }
                                    Object[] objectArray3 = new Object[2];
                                    objectArray3[1] = l3;
                                    objectArray3[0] = ec_0.b("c", (int)5821, (long)(0xBBEEAE0F67594C0L ^ l2));
                                    callSite = ec_0.c("\u00a2", (Object)this.c, (Object)objectArray3, (long)-1789883391579699188L, (long)l2);
                                }
                                try {
                                    try {
                                        try {
                                            if (callSite2 != null) break block30;
                                            if (callSite == false) break block31;
                                        }
                                        catch (MatchException matchException) {
                                            throw ec_0.c("\u00ff", (Object)matchException, (long)-1784105211070510541L, (long)l2);
                                        }
                                        if (class_22482 != ec_0.c("\u00f2", (long)-1784750740349275336L, (long)l2)) break block31;
                                    }
                                    catch (MatchException matchException) {
                                        throw ec_0.c("\u00ff", (Object)matchException, (long)-1784105211070510541L, (long)l2);
                                    }
                                    return true;
                                }
                                catch (MatchException matchException) {
                                    throw ec_0.c("\u00ff", (Object)matchException, (long)-1784105211070510541L, (long)l2);
                                }
                            }
                            Object[] objectArray4 = new Object[2];
                            objectArray4[1] = l3;
                            objectArray4[0] = ec_0.b("c", (int)8336, (long)(0x5E2D6DB9410322E9L ^ l2));
                            callSite = ec_0.c("\u00a2", (Object)this.c, (Object)objectArray4, (long)-1789883391579699188L, (long)l2);
                        }
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            if (callSite2 != null) break block32;
                                            if (callSite == false) break block33;
                                        }
                                        catch (MatchException matchException) {
                                            throw ec_0.c("\u00ff", (Object)matchException, (long)-1784105211070510541L, (long)l2);
                                        }
                                        if (class_22482 != ec_0.c("\u00f2", (long)-1800579422242180108L, (long)l2)) break block33;
                                    }
                                    catch (MatchException matchException) {
                                        throw ec_0.c("\u00ff", (Object)matchException, (long)-1784105211070510541L, (long)l2);
                                    }
                                    Object[] objectArray5 = new Object[2];
                                    objectArray5[1] = l;
                                    objectArray5[0] = class_23382;
                                    callSite = ec_0.c("\u00a2", (Object)this, (Object)objectArray5, (long)-1786956422618823979L, (long)l2);
                                    if (callSite2 != null) break block32;
                                }
                                catch (MatchException matchException) {
                                    throw ec_0.c("\u00ff", (Object)matchException, (long)-1784105211070510541L, (long)l2);
                                }
                                if (callSite == false) break block33;
                            }
                            catch (MatchException matchException) {
                                throw ec_0.c("\u00ff", (Object)matchException, (long)-1784105211070510541L, (long)l2);
                            }
                            return true;
                        }
                        catch (MatchException matchException) {
                            throw ec_0.c("\u00ff", (Object)matchException, (long)-1784105211070510541L, (long)l2);
                        }
                    }
                    Object[] objectArray6 = new Object[2];
                    objectArray6[1] = l3;
                    objectArray6[0] = ec_0.b("c", (int)5905, (long)(0x223B67E7173F1567L ^ l2));
                    callSite = ec_0.c("\u00a2", (Object)this.c, (Object)objectArray6, (long)-1789883391579699188L, (long)l2);
                }
                try {
                    try {
                        try {
                            if (callSite == false || class_22482 != ec_0.c("\u00f2", (long)-1784750740349275336L, (long)l2)) break block34;
                        }
                        catch (MatchException matchException) {
                            throw ec_0.c("\u00ff", (Object)matchException, (long)-1784105211070510541L, (long)l2);
                        }
                        Object[] objectArray7 = new Object[2];
                        objectArray7[1] = l;
                        objectArray7[0] = class_23382;
                        n = ec_0.c("\u00a2", (Object)this, (Object)objectArray7, (long)-1786956422618823979L, (long)l2);
                        if (callSite2 != null) break block35;
                    }
                    catch (MatchException matchException) {
                        throw ec_0.c("\u00ff", (Object)matchException, (long)-1784105211070510541L, (long)l2);
                    }
                    if (n == false) break block34;
                }
                catch (MatchException matchException) {
                    throw ec_0.c("\u00ff", (Object)matchException, (long)-1784105211070510541L, (long)l2);
                }
                n = 1;
                break block35;
            }
            n = false;
        }
        return n != 0;
    }

    private static void f() {
        Object[] objectArray = s;
        s[0] = "H?\" t\u001dH?5|x\u0012Rt5bx\u0007U\u0005d=!";
        objectArray[1] = Double.TYPE;
        ec_0.t[1] = "java/lang/Double";
        objectArray[2] = "[jo\u0010Z\u0015[jxLV\u001aA!xRV\u000fFP)\n\u0004";
        objectArray[3] = "OV\\/YqDYM`:|Q_";
        objectArray[4] = "Z?<\u007f\\\u0003L?9%O\u0014[t:#C\u0000J3-4\b\u0016]";
        objectArray[5] = "!,\u0004\u0001O$*#\u0015N,)?.\u001a%\u0019+.=\u0006\t\u000e&";
        objectArray[6] = "$@\u001aR\u0018u$@\r\u000e\u0014z>\u000b\r\u0010\u0014o9zXOM";
        objectArray[7] = "b\txu7Gb\to);HxBo7;]\u007f3>hi\u0016";
        objectArray[8] = "E_<\u0004\u000e@E_+X\u0002O_\u0014+F\u0002ZXez\u001c[\u0019";
        objectArray[9] = "\\`\u001a]&>J`\u001f\u00075)]+\u001c\u00019=Ll\u000b\u0016r/p";
        objectArray[10] = "|\u0016\u0000cb<\t6\u000blsst.\u0018kz:\u001c";
        objectArray[11] = "ofN#Z\u0002ofY\u007fV\ru-YaV\u0018r\\\t<\u0007";
        objectArray[12] = "$F\u0010eKpQf\u001bjZ?0h\u0010a^eD";
        objectArray[13] = Boolean.TYPE;
        ec_0.t[13] = "java/lang/Boolean";
        objectArray[14] = "!Fg\u0010`Y!FpLlV;\rpRlC<|!\f9\b";
        objectArray[15] = "-i\u001f\f\u0000JXI\u0014\u0003\u0011\u00059G\u001f\b\u0015_M";
        objectArray[16] = "^ThS\u0019^^T\u007f\u000f\u0015QD\u001f\u007f\u0011\u0015DCn/DB\u0002";
        objectArray[17] = "x\u001c$\u0002'Cx\u001c3^+LbW3@+Ye&g\u0018|";
        objectArray[18] = "ra\tE:y\u0007A\u0002J+6fO\tA/l\u0012";
        objectArray[19] = "\u001e\u0016!\u000e\u000f\u0001\b\u0016$T\u001c\u0016\u001f]'R\u0010\u0002\u000e\u001a0E[\u0015+";
        objectArray[20] = "\f>=#<\u000by\u001e6,-D\u0018\u0010=')\u001el";
        objectArray[21] = Void.TYPE;
        ec_0.t[21] = "java/lang/Void";
        objectArray[22] = "7ux\u0010ZX7uoLVW->oRVB*O=\u0006\u0007\u0003";
        objectArray[23] = "r,!\u001drIr,6A~Fhg6_~So\u0016d\u0004&\u0012";
        objectArray[24] = "\fVSS\u0000/\u001aVV\t\u00138\r\u001dU\u000f\u001f,\u001cZB\u0018T9]";
        objectArray[25] = "\"jB\u0017+4WJI\u0018:{6DB\u0013>!B";
        objectArray[26] = "jV\u0019\u0001\u0013B|V\u001c[\u0000Uk\u001d\u001f]\fAzZ\bJGVJ";
        objectArray[27] = "T\fR4f\u000f!,Y;w@@\"R0s\u001a4";
        objectArray[28] = "6d9x\u0017\u0004 d<\"\u0004\u00137/?$\b\u0007&h(3C\u0017 ";
        objectArray[29] = "u5ShKy\u0000\u0015XgZ6a\u001bSl^l\u0015";
        objectArray[30] = "M?+`\u00104F0:/w6S;:dL";
        objectArray[31] = "\fF7<=\u007fyf<3,0\u0018h78(jl";
        objectArray[32] = "E\u007fhxN<0_cw_sQQh|[)%";
        objectArray[33] = "\u0002Z\u001dU*y\tU\f\u001aFz\u0007W\u000eUj";
        objectArray[34] = "*bT\u0018\u000b\f_B_\u0017\u001aC>LT\u001c\u001e\u0019J";
        objectArray[35] = "b[\u00019LTt[\u0004c_Cc\u0010\u0007eSWrW\u0010r\u0018GjW\u0012yB\nVL\u0012dBMa[";
        objectArray[36] = "H#\u0011,>\u001c^#\u0014v-\u000bIh\u0017p!\u001fX/\u0000gj\n\u001d";
        objectArray[37] = "\u001eD\u0002hyUkd\tgh\u001a\nj\u0002ll@~";
        objectArray[38] = "ymK\u0010#\u000bym\\L/\u0004c&\\R/\u0011dW\u000e\b{U";
        objectArray[39] = "'\u0001fSO\u000f1\u0001c\t\\\u0018&J`\u000fP\f7\rw\u0018\u001b\u001c{";
        objectArray[40] = "\u0014n\u0016\r\u0002vaN\u001d\u0002\u00139\u0000@\u0016\t\u0017ct";
        objectArray[41] = "Eb\u0019\r+\u0001Sb\u001cW8\u0016D)\u001fQ4\u0002Un\bF\u007f\u0015j";
        objectArray[42] = "pZ96Ik{U(y(ep^,#";
        objectArray[43] = "\"0\u0000\n{\u000f<8\u001aE\u0014\b:0\u000f'<\t<";
        objectArray[44] = "%\u0004\u0014p*=;\f\u000e?b=!\u0006\u0016xk&a5\u0010t`!,\u0004\u0016t";
        objectArray[45] = "\u0018-g \u001c)\u0013\"voa1\u0000%\u007f&";
        objectArray[46] = "\"dk!\u0015'WD`.\u0004h6Jk%\u00002B";
        objectArray[47] = "mg\u001a38Zfh\u000b|_Bbt\r0zS";
        objectArray[48] = "aGr)Ds\u007fOhf#rnTe<\u0005t";
        objectArray[49] = "Xku,\u000fyXkbp\u0003vB bn\u0003cEQ31Z\"";
        objectArray[50] = Integer.TYPE;
        ec_0.t[50] = "java/lang/Integer";
        objectArray[51] = "5nH\u0016GQ5n_JK^/%_TKK(T\u000e\u000b\u0013\u001c8g]KYgi?\f";
        objectArray[52] = "=ERr)J=EE.%E'\u000eE0%P \u007f\u0015eq\u001awCJ=7P\f\u0013\u001fjt";
        objectArray[53] = "cO90\b<\u0016o2?\u0019swa94\u001d)\u0003";
        objectArray[54] = "\u000e!gob\u0004\u000e!p3n\u000b\u0014jp-n\u001e\u0013\u001b x:T";
        objectArray[55] = "\ni\u0012Z>l\ni\u0005\u00062c\u0010\"\u0005\u00182v\u0017SUMf<@o\n\u0015 v;>RF";
        objectArray[56] = "`%]\u0013xTv%XIkCan[OgWp)LX,Gk";
        objectArray[57] = "\u001d\u0003!%Y\u000eh#**HA\t-!!L\u001b}";
        objectArray[58] = Float.TYPE;
        ec_0.t[58] = "java/lang/Float";
        objectArray[59] = "9b%p;+LB.\u007f*d-L%t.>Y";
        objectArray[60] = "\u0012)WKR4\u0012)@\u0017^;\bb@\t^.\u000f\u0013\u0011V\nm";
        objectArray[61] = "\f\u0013H\u0010\\@\f\u0013_LPO\u0016X_RPZ\u0011)\u000e\f\u0005\u001f";
        objectArray[62] = "6\u001aT$Be\u0000?T$U9\f0NoU'\f%I\u001e\u0004xXf\u0001";
        objectArray[63] = "\u0001Y\tS<qty\u0002\\->\u0015w\tW)da";
        objectArray[64] = "~jx6\u001cU\u000bJs9\r\u001ajDx2\t@\u001e";
        objectArray[65] = "\u0018:!\u0010\\r\u0018:6LP}\u0002q6RPh\u0005\u0000d\t\b\"";
        objectArray[66] = "!$0m\u0005[7$57\u0016L o61\u001aX1(!&QI-";
        objectArray[67] = "k\u0003N(\\K\u001e#E'M\u0004\u007f-N,I^\u000b";
        objectArray[68] = "\u0005\u0014\u0002\u0001Y>\u0005\u0014\u0015]U1\u001f_\u0015CU$\u0018.D\u001a\ra";
        objectArray[69] = "\u0002\u0002\u0004\u000b?b\u0002\u0002\u0013W3m\u0018I\u0013I3x\u001f8B\u001dj>";
        objectArray[70] = "\u0000\u001f[\u0005D<\u0000\u001fLYH3\u001aTLGH&\u001d%\u001e\u0019\u001fm";
        objectArray[71] = "|W\u001a'r\u000fjW\u001f}a\u0018}\u001c\u001c{m\fl[\u000bl&\u001bK";
        objectArray[72] = "HBi]r)=bbRcf\\liYg<(";
        objectArray[73] = "\u007fbJ\u0002pn\nBA\ra!kLJ\u0006e{\u001f";
        objectArray[74] = "\"\fE2\u000e*W,N=\u001fe6\"E6\u001b?B";
        objectArray[75] = "0%1jS@E\u0005:eB\u000f$\u000b1nFUP";
        objectArray[76] = "h~!\u001e.g\u001d^*\u0011?(|P!\u001a;r\b";
        objectArray[77] = "OjA\u000bs\u0019:JJ\u0004bV[DA\u000ff\f/";
        objectArray[78] = "H\u0014\u0007d!\u0012=4\fk0]\\:\u0007`4\u0007(";
        objectArray[79] = "e\u00139g&{e\u0013.;*t\u007fX.%*ax)\u007fzr";
        objectArray[80] = "|#N\u000fE1\t\u0003E\u0000T~h\rN\u000bP$\u001c";
        objectArray[81] = "\u0006mT\u0015\u000fQ\u0018eNZrA\u0018";
        objectArray[82] = "=N\u0018-n\u0016=N\u000fqb\u0019'\u0005\u000fob\f t_52O";
        objectArray[83] = "z\u000fy\u0013EK\u000f/r\u001cT\u0004n!y\u0017P^\u001a";
        objectArray[84] = "\u0014C2p+'\u0002C7*80\u0015\b4,4$\u0004O#;\u007f3?";
        objectArray[85] = "Er<j'10R7e6~Q\\<n2$%";
        objectArray[86] = ":\u0000-3U(,\u0000(iF?;K+oJ+*\f<x\u0001<\u0013";
        objectArray[87] = "UyvBg\r Y}MvBAWvFr\u00185";
        objectArray[88] = "\b\u000b\u0002\u000b\u0003W}+\t\u0004\u0012\u0018\u001c%\u0002\u000f\u0016Bh";
        objectArray[89] = "\r\u000e+;kP\u001b\u000e.axG\fE-gtS\u001d\u0002:p?D*";
        objectArray[90] = ";p\u0013T#zNP\u0018[25/^\u0013P6o[";
        objectArray[91] = "}f$N\bqkf!\u0014\u001bf|-\"\u0012\u0017rmj5\u0005\\e^";
        objectArray[92] = "tq;<m\u0013\u0001Q03|\\`_;8x\u0006\u0014";
        objectArray[93] = "DV[<\u000e%1vP3\u001fjPx[8\u001b0$";
        objectArray[94] = "\u0019\u000eZY'4l.QV6{\r Z]2!y";
        objectArray[95] = "\n\u0014GiA]\u0001\u001bV&)]\u000f\u0014E";
        objectArray[96] = "\u0010\\\u0019\u001d_\u0013e|\u0012\u0012N\\\u0004r\u0019\u0019J\u0006p";
        objectArray[97] = "Q[:q{oW\u000e!}@l\u0001\u001e\"*,^US~p}\t\u001d[r|#v\u0010R&7@{\\R0=90\u000e\u0000xM";
        objectArray[98] = "(=35Pe*{;:;i\u0012{}g\u0003n-+9>_g\u0012sa&Ax#'f'C\u0000";
        objectArray[99] = "YH\u0002\u007fLcSK\r}&l5\n\u0015$\u001eh\nZQ}Ba5^\u0010*AoT\u000f\u0016\"K\u0006";
        objectArray[100] = "\u0011nP9H-SmM+\u0010HF1X0\u001f\u001f\u0011h\u000edIHA<P9\ttZ!Z0";
        objectArray[101] = "JZ2:\u0002!\u0013Z um?\u001eB?l\u0001\rJ\u0006f:mc\u0017Snd\u0016:\u0017A!\u000bT>\u001e\u000f0p\r>\f@_";
        objectArray[102] = "c]|\u0006)ra\u001bt\tB}Y\u001b2TzyfKv\r&pYH.\u0001;e!Hr\u0017}\u0017";
        objectArray[103] = "K':T9\u0007D&uWX\u0019Me%\u000f4+\u001e |UXMBg?\u0010i\u0019Ef=h";
        objectArray[104] = "i'kr\u0017%orp~,&9bs)@\u0014h .s\u001cCmz~\u007fC84zl0,";
        objectArray[105] = "^\\E\\=[\u001c\tT\u001eM\u0006YJPG6*OQ^Y  ILT#3\u0000\\HI\u0013qUM\n9\u0012/\u0015ZO\bF(\u0014X7";
        objectArray[106] = "\r\u0003\nn^=T\u0003\u0018!1(U\n\u00033f\u007f\u000fZ^_\bw^\u0019\bfW8\u0004X";
        objectArray[107] = "_iO8L\u0006_5Y~>\u001bXwE&R)\f4\u001aq\u0002~\foHpQ\u0005UoZ?>";
        objectArray[108] = "\"7Q(w9\"kGn\u0005$%)[6i\u0016qj\u0004a>A:)\nlb\u007f#*A?\u0005";
        objectArray[109] = "V\u0002-G\u001dXCKhEqLY_5Q&\u0012\u0001\u0002n=\u001eIB\u0003!\u0006\u001c\\\u0002M";
        objectArray[110] = "=$8(E\u0000v:ek\u0013;m^`iC\u0003ja0-\u001a_c^`uG\\=<(~\u0017Rg^";
        objectArray[111] = "?iqs{U{8utA\u000f%ef# \u00029\u0003ft\u007f\br|d;\u007fYB2x4;\u001csf\u007f59d";
        objectArray[112] = "djl^g\u0011f,dQ\f\u001a^,\"\f4\u001aa|fUh\u0013^$>Mv\fop9Ltt";
        objectArray[113] = "\u0018\u001b+o>Z\u001eN0c\u0005YH^34ik\u001c\u001akm4<W\u0012c!uE\u001c@1i\u0005N\u0015\u0012!#|\u0005G@iSw\f\u0015P#*<^G\u0018Sn<D\u0019\u00195hi_\u0015\"";
        objectArray[114] = "3\u000b\ri4OvQ\t-2*cnPjr\u0012dQ\u0000.+NmnPq)Ws\u000b\u0015+-\u0013un";
        objectArray[115] = "_\u0017T\nj\u0003Y\u0001e\u00027_C\u00172Um\b\u001c{\\]<LHB\u0003\u0012f\r";
        objectArray[116] = "c|;d\u0002\u000e:v${k\u0007\u00017?&S\r>g{\u007f\u000f\u0004\u0001?#g\u0011\u001b0k$f\u0013c";
        objectArray[117] = "e\u007fgt}\u0016w'am\u000f\u0011\u00199;1cHf;t12x";
        objectArray[118] = "uZ\u000e1\u0000L0\u0018\bw\f!%#\u000f0U\u0019\"\u001c_t\fE+#\u0007,\u0014[4\u0012S+\u0015YL";
        objectArray[119] = "QOb\u001bFuXL$\u001fH\u0016\u0002tf\u0006\u0014.\u0006K6BMr\u000ftfDB'\u0001\u00053DMw\u0010t";
        objectArray[120] = "\u000e@Pgj^\b\u0015KkQ]^\u0005H<=o\nA\u0012em8AI\u0018)!A\n\u001bJaQ";
        objectArray[121] = "\"azH\u0019rf0~O#*3g\u0011\r\u001d}3;n\u000fR}b\u000b \u0013]9':t\u0014\\;_";
        objectArray[122] = "&X\u00146asj\u0000\u000e+\u000e/wF\u0014(b\u001d*\u0001Mq\u000ew#BHthqvYDO7)hBN#7t\"\u0006\u0005O";
        objectArray[123] = "\u000f\u0018\u0002QBaX\u0004EN\"u_\u001f[SNG\b]\u0001\f\u001e\u0010[\u000f^YX,@\u0012TP\"";
        objectArray[124] = " ?m\u001bUt\"ye\u0014>x\u001ay#I\u0006\u007f%)g\u0010Zv\u001a*?\u001cGcb*c\n\u0001\u0011";
        objectArray[125] = "80(h&f-ymjJr7m0~\u001d,i8i\u0012%w,1$)'bl\u007f";
        objectArray[126] = "zAJV~E|W{^#\u0019fA,\tyN?-B\u0001(\nm\u0014\u001dNrK";
        objectArray[127] = "e\bry\u001cVa\u0004n*|P[Iz9\u0013Qb\u0014jtF:";
        objectArray[128] = "m\rc\u00029\u0004v\n<\u0002\u0007\t\f\u000b~Y?\u00063[:\u0000c\u000f\f_{W`\u0001m\u000e}_jh";
        objectArray[129] = "\u0001\u0011W!i}PRB+\tvPGBw^!\u000e\u0014\u001b\u001b0z\nM\u001fyxqZCE";
        objectArray[130] = "{\u000e^o8<}\u0018oge`g\u000e80?79bV8nsl[\tw42";
        objectArray[131] = ";\u000b|8&k\"\b7kA;(\u001a)i\u0016lrLv\u00053)xJ*;**3\u0019";
        objectArray[132] = "\u001bm\":4OJ.70TDJ;7l\u0003\u0013\u0015fl\u0000hHK/<9$\u0010Q2";
        objectArray[133] = "vh>\u001f\u0016r4k#\rN\u0017!76\u0016A@vnbL\u0011\u0017&:>\u001fW+='4\u0016";
        objectArray[134] = "\u0015`M\u0012r\u0015\u001aa\u0002\u0011\u0013\u000b\u0013\"RI\u007f9Cn\b\u001e\u0013WB7\u0003Gb\u0002B8SV\u0013W\u001a3\u0003Ah\u000e\u001a!L.";
        objectArray[135] = ";Eg1\tf B817cZCzj\u000fde\u0013>3SmZC}mH`7\u0006?k\u000elZ";
        objectArray[136] = "1Tho*63\u0012``A:\u000b\u0012&=y=4Bbd%4\u000b\u0012<op<pK<}?S";
        objectArray[137] = "-ZFG\u0003\u00026]\u0019G=\u0000L\\[\u001c\u0005\u0000s\f\u001fEY\tL\b^\u0012Z\u0007-YX\u001aPn";
        objectArray[138] = "rj\u0017}fA,k\u000fbo{%`\u0000~3,v1U*_B {\n#e\u001c!c\u0015*";
        objectArray[139] = "E\u001aCE|y\u0015X\u0004\u001eM%\u001e\u0004:A|*\u0001\r\u0003\u001e3p@b\u0003I'>\u0010[\\\u0006}\u007f\u007f[\u000b\u00123/F\u0004DHr@";
        objectArray[140] = "K>\u0010ZK,\u0016d\u0017VPT\u0017n\tYW8%:M\u0000\fdrqE\tB$\u000b:\u0017[\nT";
        objectArray[141] = "2pV\u0017nLlp\u000e\u000eR\u001f].\u0015Hj\u0018b~Q\u00116\u0011]z\u0010F5\u001f<+\u0016N?v";
        objectArray[142] = "ymz\u0010P9vl5\u00131'\u007f/eK]\u0015)m9\u0011\rB+ol\u001dX3~ocMIB";
        objectArray[143] = "$pvA?Y?w)A\u0001YEvk\u001a9[z&/CeRE~w[{Mt*pZy5";
        objectArray[144] = "n4v\u001a\u0007F7>i\u0005nB\f\u007frXVE3/6\u0001\nL\f\"a\u0017\u0014M24w\u000b\u0013+";
        objectArray[145] = "1>CC<\u00147kXO\u0007\u0017a{[\u0018k%5?\u0001A?r~7\u000b\rw\u000b5eYE\u0007";
        objectArray[146] = "\nPf,\u007fFF\b|1\u0010\u001a[Nf2|(\u000f\r9i*\u007f\u000f\u000b{:)DKW}>s\u007f\\Pl,b\u0007\\\fzj\u0010";
        objectArray[147] = "z\u00056@~x0S7\u0007\u0010pg\u001a{8l(4\u00067Gng4W\u0007";
        objectArray[148] = "&|\u0005R%%\u007f|\u0017\u001dJ0~u\f\u000f\u001dg$%Pcsouf\u0007Z, /'";
        objectArray[149] = "h\u007fN#{xsx\u0011#Ey\tySx}z6)\u0017!!s\t-Vv\"}h|P~(\u0014";
        objectArray[150] = ">\u0004\u0005E\u000b%c^\u0002I\u0010]bT\u001cF\u00171P\u0000X\u001fN`\u0007KP\u0016\u0002-~\u0000\u0002DJ]";
        objectArray[151] = "\u001bsC(D\u0003\u0013r\u001b#-\u0001|l\u001e-IX\u0010w\u0019rI";
        objectArray[152] = "+\u001e)\u0014\b5\"\u001do\u0010\u0006V{%-\tZn|\u001a}M\u00032u%%\u0015\u001b,j\u0014q\u0012\u001a.\u0012";
        objectArray[153] = "uRz\nx#zS5\t\u0019=s\u0010eQu\u000f T:\u0007\u0019a/WgUb&n\u0016e\b\u0019";
        objectArray[154] = "I7oMu\u0013\u00107}\u0002\u001a\r\u001d/b\u001bv?Ik8F\u001aQ\u0014>3\u0013a\b\u0014,||#Y\u001a-mE|\u0016@l\u0002";
        objectArray[155] = "\u0012TH_\u0014[QW\u0018\u001fv\tj\u000eV\u0011N\u000eU^\u0012H\u0012\u0007jNSBI\u0012\tQMB\u0007`";
        objectArray[156] = "0kl\ntC7*g\u0011<?g0`\u0007 h0j1^L\u000630d[0\u0001r;\u007f\u0013";
        objectArray[157] = "\u001fd+m\u0013AB\u007f>d\u001b9AiBh\u0015\u0007J7=jZ\u0007\u001b\u0007{wB@\u001e\u007f&lWI\u0016\u0007";
        objectArray[158] = "JU\u001aYH\u0017H\u0013\u0012V#\u001bp\u0016\u0011E^\u001d\u001dWMTOrL\u0011[IL\u001f\rMJX#";
        objectArray[159] = "CO\u0007B1iEY6A`$[DZs4`\u0003\u001e6\u001di5\nLMDi'E#";
        objectArray[160] = "p,DQ%:!oQ[E1!zQ\u0007\u0012f\u007f-\tk.a?+T\u0010!`p(";
        objectArray[161] = "\b[PAb\u001e\u0001X\u0016El}Z`T\\0E__\u0004\u0018i\u0019V`\\@q\u0007IQ\bGp\u00051";
        objectArray[162] = ")\"\u0006Hn\u001a d\u001dP'v~{\u0013H3!)%C\u0011nv)\"\u0006Hn\u001a d\u001dP'";
        objectArray[163] = "\b81t,\u0014Bn03B\u001a\u0011,Fa2\u0006xfbr8\u0002I2es:z";
        objectArray[164] = "\u000bm#W~BRm1\u0018\u0011\\_u.\u0001}n\b5\u007f[*9C0~WrFN9*\u001c\u0011\u0000Vd\u007f\tjYVv0f";
        objectArray[165] = "C\u0017\"LSYAQ*C8\\yQl\u001e\u0000RF\u0001(G\\[yYp_BDH\rw^@<";
        objectArray[166] = "_\u0015\u001f.%1Y\u0003.&xmC\u0015yq\":\u001ey\u0017ys~H@H6)?";
        objectArray[167] = "7Aq9%\"8@>:D<1\u0003nb(\u000efC3<yYaFv9\u007f?g\u0013m5D";
        objectArray[168] = "\u0011v<_JVHv.\u0010%HEn1\tIz\u0011*jW%\u0014\u0019x/\u0001\u001cKV\"nn\u001c\u001cBl>WCS\u0018-QW\u0014GV}h\b[\u001d\u0017\u0012h\nH\u001cGi1\nZS(";
        objectArray[169] = "k1j#\u0000Fiwb,kNQw$qSMn'`(\u000fDQ\u007f80\u0011[`+?1\u0013#";
        objectArray[170] = "5}O\u001f\\\rk}\u0017\u0006`]Z#\f@XYesH\u0019\u0004PZ+\u0010\u0001\u001aOk\u007f\u0017\u0000\u00187";
        objectArray[171] = "*\u001a*\u001b\u001a\u0004,O1\u0017!\u0007z_2@M5.\u001bh\u0019\u001abe\u0013bUQ\u001b.A0\u001d!";
        objectArray[172] = "\u000fl\u0010c\u0019C\u000ei\u000b\u007fS&_\u0005ClV\u001eX:\u0013(\u000fBQ\u0005Cx\r\u001a\\z\n|\u0002\u0018\r\u0005";
        objectArray[173] = ";xVp9Ug$\u000fvV\u0007:#W}?\u000b\u0003-Wm;ml&Mj.\\8!LhV";
        objectArray[174] = "\u001dG\u0001\"ceM\u0005FyR5MDx&n5\u0016V\tsn:FGx&n5\u0016V\tsn:FGx";
        objectArray[175] = "\u0001\u0002!\u001d\u0017nES%\u001a-4\u0018\u0005#^-2\u0007Y-MLc\u0001Q'$";
        objectArray[176] = "X\u0000mY8l^\u0016\\Qe0D\u0000\u000b\u0006?g\u001cle\u000en#OU:A4b";
        objectArray[177] = "DGeuh,D\u001bs3\u001a1CYokv\u0003\u0017\u001a03%T\u0013\u001cw0!2\u0015Il<\u001a";
        objectArray[178] = ")i.M\u0019ck<?\u000fi>.\u007f;V\u0012S+<l^Y,)sl\u000fib5|(JX62}*2";
        objectArray[179] = "}_!,DV{\n: \u007fU-\u001a9w\u0013gz[h!A0}_!,DV{\n: \u007fBpV+`\u0006\t\"\u0004c\u0010\r\u0000p\u0014)iFR\"\\YbO\u00002\u0016 )\u001dRzf&u\u0010Vz\u000fdj\u0001_@";
        objectArray[180] = "\u000fh\u0018.\u001b\u0015Ic\u001fa\u0002{Sn\np\u000e\u0017a:L-U@6i\u0014z\u0010\tNiHlV{";
        objectArray[181] = "~D \rTC}\u00068D(R\u0004M=\u0003\u0010V;\u001dyZL_\u0004M'Q\u0019W\u007f\u0014'CV8";
        objectArray[182] = ",}\u00050D\u0007.;\r?/\u000e\u0016;Kb\u0017\f)k\u000f;K\u0005\u00163W#U\u001a'gP\"Wb";
        objectArray[183] = "J*\tG\u0006\u0011\u0017p\u000eK\u001di\u0016z\u0010D\u001a\u0005$.T\u001dCUse\\\u0014\u000f\u0019\n.\u000eFGi";
        objectArray[184] = "s\u0002\u0003.ck*\u0002\u0011a\fu'\u001a\u000ex`Gs^T&\f){\f\u0010p5v4VQ\u001f5t'W\u0001dlt5\u0018n";
        objectArray[185] = "<OE0\bi~PT92a?GP?Ng9*Z9\u0003x-D\u0010o\u0002?C";
        objectArray[186] = "%Z&\u0004@\u001a*[i\u0007!\u0004#\u00189_M6u_d\u0007\u0018aw\u00004\tN\u001a.\u0000&F!";
        objectArray[187] = "[\u0005-\b\u0010m\u0002\u000f2\u0017y`9N)JAn\u0006\u001em\u0013\u001dg9F5\u000b\u0003x\b\u00122\n\u0001\u0000";
        objectArray[188] = "DoO\u00049\u0014B:T\b\u0002\u0017\u0014*W_n%@n\u000f\t9r@kR[y\n\u001d1UWbrDoO\u00049\u0014B:T\b\u0002";
        objectArray[189] = "\u001b\u0014\f\u001c\u0012j\u001bIFXY\u0006G\u001a\u0002\u0004OjuNC[\u0017?\"F\u001c\u001aR~\u0013\u0012\u001b\u001bP\u0006";
        objectArray[190] = "a\u0012,e(Z&Smgu!=Nkg,M\u000f\u001c&?z!7Hm6;\u001a5]-xK";
        objectArray[191] = "g\u0016GUmOa\u0000v]0\u0013{\u0016!\njD'zO\u0002;\u0000pC\u0010MaA";
        objectArray[192] = "\u0015\u0018_vd-W\u001bBd<HBGW\u007f3\u001f\u0015\u001e\u0001'dHEJ_v%t^WU\u007f";
        objectArray[193] = "\u001bnq\u001cYG\u000e'4\u001e5S\u00143i\nb\rJn3fZV\u000fo}]XCO!";
        objectArray[194] = "yD\u0001pU[?O\u0006?L5%B\u0013.@Y\u0017\u0016Us\u001b\u000b@\u0016\u00044@\fzH\u0005,_\u0005@";
        objectArray[195] = "(\u0011\tMF8'\u0010FN'&.S\u0016\u0016K\u0014}\u0017JN'zr\u0014\u0014\u0012\\=3U\u0016O'";
        objectArray[196] = "_kl}>OY>wq\u0005L\u000f.t&i~[j,~9)_kl}>OY>wq\u0005";
        objectArray[197] = "k~z'jY6$}+q!,*{9|ZRz /uO(%d(u\\R";
        objectArray[198] = "\u001a:\u0006nd\u001d\u0018|\u000ea\u000f\u0017 |H<7\u0016\u001f,\fek\u001f tT}u\u0000\u0011 S|wx";
        objectArray[199] = "y\u001d|\u001dX/lT9\u001f4;v@d\u000bce*\u00108g[>m\u001cp\\Y+-R";
        objectArray[200] = "5e\u0003\\Zby=\u0019A5>d{\u0003BY\f9<Y\u001d5f0\u007f_\u001eS`edS%\b 0b\u0003T_<w}c";
        objectArray[201] = ":9\t$\u0010\u0012!>V$.\u0017[?\u0014\u007f\u0016\u0010doP&J\u0019[k\u0011qI\u0017::\u0017yC~";
        objectArray[202] = "V|x\"\nw\u0006>?y;+\u0005t\u0001&\n$\u0012k8yE~S\u00048.Q0\u0003=ga\u000bql=0uE!Ub\u007f/\u0004N";
        objectArray[203] = "_\r\"epcF\u000ei6\u00173L\u001cw4@d\u0016J)Xe!\u001cLtf|\"W\u001f";
        objectArray[204] = "\u0011/o\u0001]\u0001Rym\nV`AC/\u0006\u0007XF|\u007fB^\u0004OC'\u001aF\u001aPrs\u001dG\u0018(";
        objectArray[205] = "v\u0012Y\u001b\u001b\t/\u0018F\u0004r\r\u0014Y]YJ\n+\t\u0019\u0000\u0016\u0003\u0014\rXW\u0015\ru\\^_\u001fd";
        objectArray[206] = "+\u0015rs\u00007nWt5\fZ{lsrUb|S#6\f>uls0\u0003k{\u001d&0\f;jl";
        objectArray[207] = "h\u001d-3\u0018\u00191\u00172,q\u001d\nV)qI\u001a5\u0006m(\u0015\u0013\n\u001dg~\u0003\u0004sV5,Kt";
        objectArray[208] = "m.DR6U+%X\t*h=H\u0007HkP:wW\f2\f3H\u0007P.\f6uA[2W*H";
        objectArray[209] = "\u0019\\\\7\u0007J\u001a\u001eD~{XcUA9C_\\\u0005\u0005`\u001fVcU[kJ^\u0018\f[y\u00051";
        objectArray[210] = "-^igTliXm<F\u001czG0>PB}G*:,%(Jf>]p(E6/,";
        objectArray[211] = "36;l\u001b\u000bwg?k!@#97+L{ \\-$\u001dB,gk-ZQNm2+[B\u007f95*Y:";
        objectArray[212] = "b\u001cl%\":*\u0017<+xX>\u0013+\"|4\fGh}+c[\f+s&?e\u0015(8uX";
        objectArray[213] = "!\u0013}\u001bM\u0012x\u0013oT\"\u0007y\u001atFuP#J**\u001bXr\t\u007f\u0013D\u0017(H";
        Object[] objectArray2 = objectArray;
        objectArray[214] = "0c\\r3\u00170?J4A\n7}Vl-8c>\t;yoc<Sh:\u0017>fTd!o";
    }

    @Override
    public void d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l;
        long l3 = l2 ^ 0x2930131F329BL;
        long l4 = l2 ^ 0x52D6E774439DL;
        this.l = -1;
        this.m = 0;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        ec_0.c("\u00a2", (Object)this.n, (Object)objectArray2, (long)3253049870477382438L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l4;
        objectArray3[0] = this;
        ec_0.c("\u00a2", (Object)ec_0.c("\u00f2", (long)3252592968018769542L, (long)l), (Object)objectArray3, (long)3252465378534851865L, (long)l);
    }

    private boolean d(Object[] objectArray) {
        int n;
        block41: {
            block42: {
                CallSite callSite;
                long l;
                block37: {
                    CallSite callSite2;
                    long l2;
                    class_3965 class_39652;
                    class_2338 class_23382;
                    block38: {
                        CallSite callSite3;
                        block39: {
                            block40: {
                                block31: {
                                    block32: {
                                        int n2;
                                        block35: {
                                            long l3;
                                            block36: {
                                                long l4;
                                                long l5;
                                                block34: {
                                                    Object object;
                                                    block33: {
                                                        block29: {
                                                            long l6;
                                                            block30: {
                                                                class_23382 = (class_2338)objectArray[0];
                                                                class_39652 = (class_3965)objectArray[1];
                                                                l = (Long)objectArray[2];
                                                                long l7 = l = o ^ l;
                                                                l2 = l7 ^ 0x703D069F6A6EL;
                                                                l5 = l7 ^ 0x1D794AD1E0FAL;
                                                                l4 = l7 ^ 0x5DDBC4293648L;
                                                                l6 = l7 ^ 0x1C6E08C093B2L;
                                                                l3 = l7 ^ 0x159557DD5013L;
                                                                callSite = ec_0.c("\u00ff", (long)5905315418286731095L, (long)l);
                                                                try {
                                                                    try {
                                                                        callSite2 = ec_0.c("\u00a2", (Object)((Boolean)((Object)ec_0.c("\u00a2", (Object)this.g, (long)5904600953795385114L, (long)l))), (long)5892763511675527428L, (long)l);
                                                                        if (callSite != null) break block29;
                                                                        if (callSite2 != false) break block30;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw ec_0.c("\u00ff", (Object)matchException, (long)5893965928243248325L, (long)l);
                                                                    }
                                                                    return false;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw ec_0.c("\u00ff", (Object)matchException, (long)5893965928243248325L, (long)l);
                                                                }
                                                            }
                                                            Object[] objectArray2 = new Object[2];
                                                            objectArray2[1] = l6;
                                                            objectArray2[0] = ec_0.c("\u00f2", (long)5898690665624531031L, (long)l);
                                                            callSite2 = ec_0.c("\u00ff", (Object)objectArray2, (long)5904517753656451587L, (long)l);
                                                        }
                                                        try {
                                                            try {
                                                                try {
                                                                    if (callSite != null) break block31;
                                                                    if (callSite2 != false) break block32;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw ec_0.c("\u00ff", (Object)matchException, (long)5893965928243248325L, (long)l);
                                                                }
                                                                object = ec_0.c("\u00a2", (String)((Object)ec_0.c("\u00a2", (Object)this.e, (long)5904600953795385114L, (long)l)), (Object)ec_0.b("c", (int)18325, (long)(0x2C7F113AF44AF31BL ^ l)), (long)5890911033632975389L, (long)l);
                                                                if (callSite != null) break block33;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw ec_0.c("\u00ff", (Object)matchException, (long)5893965928243248325L, (long)l);
                                                            }
                                                            if (object == false) break block34;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw ec_0.c("\u00ff", (Object)matchException, (long)5893965928243248325L, (long)l);
                                                        }
                                                        object = 0;
                                                    }
                                                    return (boolean)object;
                                                }
                                                try {
                                                    Object[] objectArray3 = new Object[2];
                                                    objectArray3[1] = l5;
                                                    objectArray3[0] = ec_0.c("\u00f2", (long)5898690665624531031L, (long)l);
                                                    if (ec_0.c("\u00ff", (Object)objectArray3, (long)5892968153793997535L, (long)l) == null) {
                                                        return false;
                                                    }
                                                }
                                                catch (MatchException matchException) {
                                                    throw ec_0.c("\u00ff", (Object)matchException, (long)5893965928243248325L, (long)l);
                                                }
                                                try {
                                                    try {
                                                        n2 = this.l;
                                                        if (callSite != null) break block35;
                                                        if (n2 != -1) break block36;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw ec_0.c("\u00ff", (Object)matchException, (long)5893965928243248325L, (long)l);
                                                    }
                                                    Object[] objectArray4 = new Object[1];
                                                    objectArray4[0] = l4;
                                                    this.l = (int)ec_0.c("\u00ff", (Object)objectArray4, (long)5899666387013293154L, (long)l);
                                                }
                                                catch (MatchException matchException) {
                                                    throw ec_0.c("\u00ff", (Object)matchException, (long)5893965928243248325L, (long)l);
                                                }
                                            }
                                            Object[] objectArray5 = new Object[2];
                                            objectArray5[1] = l3;
                                            objectArray5[0] = ec_0.c("\u00f2", (long)5898690665624531031L, (long)l);
                                            ec_0.c("\u00ff", (Object)objectArray5, (long)5891524309814013181L, (long)l);
                                            n2 = 1;
                                        }
                                        return n2 != 0;
                                    }
                                    callSite2 = ec_0.c("\u00a2", (String)((Object)ec_0.c("\u00a2", (Object)this.a, (long)5904600953795385114L, (long)l)), (Object)ec_0.b("c", (int)10380, (long)(0x2042B6FAD15E9C05L ^ l)), (long)5890911033632975389L, (long)l);
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                if (callSite != null) break block37;
                                                if (callSite2 != false) break block38;
                                            }
                                            catch (MatchException matchException) {
                                                throw ec_0.c("\u00ff", (Object)matchException, (long)5893965928243248325L, (long)l);
                                            }
                                            callSite3 = ec_0.c("O", (Object)b, (long)5894191787580322211L, (long)l);
                                            if (callSite != null) break block39;
                                        }
                                        catch (MatchException matchException) {
                                            throw ec_0.c("\u00ff", (Object)matchException, (long)5893965928243248325L, (long)l);
                                        }
                                        if (callSite3 instanceof class_3965) break block40;
                                    }
                                    catch (MatchException matchException) {
                                        throw ec_0.c("\u00ff", (Object)matchException, (long)5893965928243248325L, (long)l);
                                    }
                                    return false;
                                }
                                catch (MatchException matchException) {
                                    throw ec_0.c("\u00ff", (Object)matchException, (long)5893965928243248325L, (long)l);
                                }
                            }
                            callSite3 = ec_0.c("O", (Object)b, (long)5894191787580322211L, (long)l);
                        }
                        class_39652 = (class_3965)callSite3;
                    }
                    Object[] objectArray6 = new Object[2];
                    objectArray6[1] = l2;
                    objectArray6[0] = class_39652;
                    ec_0.c("\u00ff", (Object)objectArray6, (long)5893530374290059010L, (long)l);
                    callSite2 = ec_0.c("\u00a2", (Object)this.k, (Object)class_23382, (long)5904856650753441172L, (long)l);
                }
                try {
                    try {
                        ec_0 ec_02 = this;
                        n = this.l;
                        if (callSite != null) break block41;
                        if (n == -1) break block42;
                    }
                    catch (MatchException matchException) {
                        throw ec_0.c("\u00ff", (Object)matchException, (long)5893965928243248325L, (long)l);
                    }
                    n = 1;
                    break block41;
                }
                catch (MatchException matchException) {
                    throw ec_0.c("\u00ff", (Object)matchException, (long)5893965928243248325L, (long)l);
                }
            }
            n = 0;
        }
        ec_02.m = n;
        return true;
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ec_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'O' || c == '\u00fc' || c == '\u00f2' || c == 'r') {
                field = ec_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'O' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fc' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ec_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00a2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ff' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @bP
    public void a(a5 a52) {
        long l = o ^ 0x2563D213FD4CL;
        ec_0.c("\u00a2", (Object)this.j, (long)-1317309462075161837L, (long)l);
        ec_0.c("\u00a2", (Object)this.k, (long)-1317309462075161837L, (long)l);
        this.l = -1;
        this.m = 0;
    }

    private class_3965 a(Object[] objectArray) {
        CallSite callSite;
        block8: {
            block7: {
                CallSite callSite2;
                CallSite callSite3;
                long l;
                block6: {
                    l = (Long)objectArray[0];
                    long l2 = (l = o ^ l) ^ 0x3C193ED4E049L;
                    CallSite callSite4 = ec_0.c("\u00a2", (Object)ec_0.c("O", (Object)b, (long)1650356819849718215L, (long)l), (long)1648777253491831495L, (long)l);
                    CallSite callSite5 = ec_0.c("\u00a2", (Object)ec_0.c("O", (Object)b, (long)1650356819849718215L, (long)l), (float)1.0f, (long)1652453153528024627L, (long)l);
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l2;
                    callSite3 = ec_0.c("\u00a2", (Object)ec_0.c("O", (Object)b, (long)1652271975288676605L, (long)l), (Object)new class_3959((class_243)callSite4, (class_243)ec_0.c("\u00a2", (Object)callSite4, (Object)ec_0.c("\u00a2", (Object)callSite5, (double)((double)ec_0.c("\u00ff", (Object)objectArray2, (long)1644650901004759817L, (long)l)), (long)1648611029572728346L, (long)l), (long)1645636513025463970L, (long)l), (class_3959.class_3960)ec_0.c("\u00f2", (long)1650458459830277602L, (long)l), (class_3959.class_242)ec_0.c("\u00f2", (long)1650613425479344788L, (long)l), (class_1297)ec_0.c("O", (Object)b, (long)1650356819849718215L, (long)l)), (long)1651596874796806243L, (long)l);
                    callSite2 = ec_0.c("\u00ff", (long)1644077634685593716L, (long)l);
                    try {
                        callSite = callSite3;
                        if (callSite2 != null) break block6;
                        if (callSite == null) break block7;
                    }
                    catch (MatchException matchException) {
                        throw ec_0.c("\u00ff", (Object)matchException, (long)1650736632002182118L, (long)l);
                    }
                    callSite = callSite3;
                }
                try {
                    try {
                        if (callSite2 != null) break block8;
                        if (ec_0.c("\u00a2", (Object)callSite, (long)1645000307446042884L, (long)l) != ec_0.c("\u00f2", (long)1656717454013677128L, (long)l)) break block7;
                    }
                    catch (MatchException matchException) {
                        throw ec_0.c("\u00ff", (Object)matchException, (long)1650736632002182118L, (long)l);
                    }
                    callSite = callSite3;
                    break block8;
                }
                catch (MatchException matchException) {
                    throw ec_0.c("\u00ff", (Object)matchException, (long)1650736632002182118L, (long)l);
                }
            }
            callSite = null;
        }
        return callSite;
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return ec_0.c("\u00ff", (Object)((Object)q_0.Crystal), (long)-2438864238396723094L, (long)l);
    }

    private class_243 a(Object[] objectArray) {
        class_243 class_2432 = (class_243)objectArray[0];
        class_238 class_2382 = (class_238)objectArray[1];
        long l = (Long)objectArray[2];
        l = o ^ l;
        return new class_243((double)ec_0.c("\u00ff", (double)ec_0.c("O", (Object)class_2382, (long)-2874763887366352790L, (long)l), (double)ec_0.c("\u00ff", (double)ec_0.c("O", (Object)class_2432, (long)-2867820957958558554L, (long)l), (double)ec_0.c("O", (Object)class_2382, (long)-2870544227738145394L, (long)l), (long)-2871943290112316690L, (long)l), (long)-2867457703901367965L, (long)l), (double)ec_0.c("\u00ff", (double)ec_0.c("O", (Object)class_2382, (long)-2871404911025686340L, (long)l), (double)ec_0.c("\u00ff", (double)ec_0.c("O", (Object)class_2432, (long)-2874248833967169533L, (long)l), (double)ec_0.c("O", (Object)class_2382, (long)-2875105193650114649L, (long)l), (long)-2871943290112316690L, (long)l), (long)-2867457703901367965L, (long)l), (double)ec_0.c("\u00ff", (double)ec_0.c("O", (Object)class_2382, (long)-2868915201783856341L, (long)l), (double)ec_0.c("\u00ff", (double)ec_0.c("O", (Object)class_2432, (long)-2872390939097289860L, (long)l), (double)ec_0.c("O", (Object)class_2382, (long)-2870424555806326657L, (long)l), (long)-2871943290112316690L, (long)l), (long)-2867457703901367965L, (long)l));
    }

    private boolean a(Object[] objectArray) {
        Object object;
        block43: {
            long l;
            class_2338 class_23382;
            block44: {
                CallSite callSite;
                long l2;
                block37: {
                    block38: {
                        Object object2;
                        block41: {
                            long l3;
                            block42: {
                                long l4;
                                block39: {
                                    block40: {
                                        block32: {
                                            long l5;
                                            block33: {
                                                Object object3;
                                                block36: {
                                                    block35: {
                                                        block34: {
                                                            boolean bl;
                                                            long l6;
                                                            long l7;
                                                            class_3965 class_39652;
                                                            block31: {
                                                                Object object4;
                                                                block30: {
                                                                    class_23382 = (class_2338)objectArray[0];
                                                                    class_39652 = (class_3965)objectArray[1];
                                                                    l = (Long)objectArray[2];
                                                                    long l8 = l = o ^ l;
                                                                    l7 = l8 ^ 0x271A3649476AL;
                                                                    l6 = l8 ^ 0x672C6DB740L;
                                                                    l2 = l8 ^ 0xF9405BFD15EL;
                                                                    l4 = l8 ^ 0x67B8B8B191D8L;
                                                                    l5 = l8 ^ 0x260D74583422L;
                                                                    l3 = l8 ^ 0x2FF62B45F783L;
                                                                    callSite = ec_0.c("\u00ff", (long)-692464216882902841L, (long)l);
                                                                    try {
                                                                        object4 = ec_0.c("\u00a2", (Object)this.k, (Object)class_23382, (long)-691309677265455400L, (long)l);
                                                                        if (callSite != null) break block30;
                                                                        if (object4 == false) break block31;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw ec_0.c("\u00ff", (Object)matchException, (long)-694776261823095979L, (long)l);
                                                                    }
                                                                    object4 = 0;
                                                                }
                                                                return (boolean)object4;
                                                            }
                                                            try {
                                                                Object[] objectArray2 = new Object[2];
                                                                objectArray2[1] = l7;
                                                                objectArray2[0] = ec_0.c("\u00f2", (long)-698686334926021881L, (long)l);
                                                                bl = ec_0.c("\u00ff", (Object)objectArray2, (long)-695738852185469617L, (long)l) != null;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw ec_0.c("\u00ff", (Object)matchException, (long)-694776261823095979L, (long)l);
                                                            }
                                                            boolean bl2 = bl;
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            object = bl2;
                                                                            if (callSite != null) break block32;
                                                                            if (object != false) break block33;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw ec_0.c("\u00ff", (Object)matchException, (long)-694776261823095979L, (long)l);
                                                                        }
                                                                        object3 = ec_0.c("\u00a2", (Object)((Boolean)((Object)ec_0.c("\u00a2", (Object)this.f, (long)-693166026368438134L, (long)l))), (long)-695956422557104492L, (long)l);
                                                                        if (callSite != null) break block34;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw ec_0.c("\u00ff", (Object)matchException, (long)-694776261823095979L, (long)l);
                                                                    }
                                                                    if (object3 == false) break block35;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw ec_0.c("\u00ff", (Object)matchException, (long)-694776261823095979L, (long)l);
                                                                }
                                                                Object[] objectArray3 = new Object[3];
                                                                objectArray3[2] = l6;
                                                                objectArray3[1] = class_39652;
                                                                objectArray3[0] = class_23382;
                                                                object3 = ec_0.c("\u00a2", (Object)this, (Object)objectArray3, (long)-697600795776671766L, (long)l);
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw ec_0.c("\u00ff", (Object)matchException, (long)-694776261823095979L, (long)l);
                                                            }
                                                        }
                                                        try {
                                                            if (callSite != null) break block36;
                                                            if (object3 == false) break block35;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw ec_0.c("\u00ff", (Object)matchException, (long)-694776261823095979L, (long)l);
                                                        }
                                                        object3 = 1;
                                                        break block36;
                                                    }
                                                    object3 = 0;
                                                }
                                                return (boolean)object3;
                                            }
                                            Object[] objectArray4 = new Object[2];
                                            objectArray4[1] = l5;
                                            objectArray4[0] = ec_0.c("\u00f2", (long)-698686334926021881L, (long)l);
                                            object = ec_0.c("\u00ff", (Object)objectArray4, (long)-693213500717759085L, (long)l);
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (callSite != null) break block37;
                                                        if (object != false) break block38;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw ec_0.c("\u00ff", (Object)matchException, (long)-694776261823095979L, (long)l);
                                                    }
                                                    object2 = ec_0.c("\u00a2", (String)((Object)ec_0.c("\u00a2", (Object)this.e, (long)-693166026368438134L, (long)l)), (Object)ec_0.b("c", (int)24887, (long)(0x53DFD552DA0F22DL ^ l)), (long)-697914744416776819L, (long)l);
                                                    if (callSite != null) break block39;
                                                }
                                                catch (MatchException matchException) {
                                                    throw ec_0.c("\u00ff", (Object)matchException, (long)-694776261823095979L, (long)l);
                                                }
                                                if (object2 == false) break block40;
                                            }
                                            catch (MatchException matchException) {
                                                throw ec_0.c("\u00ff", (Object)matchException, (long)-694776261823095979L, (long)l);
                                            }
                                            return false;
                                        }
                                        catch (MatchException matchException) {
                                            throw ec_0.c("\u00ff", (Object)matchException, (long)-694776261823095979L, (long)l);
                                        }
                                    }
                                    object2 = this.l;
                                }
                                try {
                                    try {
                                        if (callSite != null) break block41;
                                        if (object2 != -1) break block42;
                                    }
                                    catch (MatchException matchException) {
                                        throw ec_0.c("\u00ff", (Object)matchException, (long)-694776261823095979L, (long)l);
                                    }
                                    Object[] objectArray5 = new Object[1];
                                    objectArray5[0] = l4;
                                    this.l = (int)ec_0.c("\u00ff", (Object)objectArray5, (long)-698083019354409998L, (long)l);
                                }
                                catch (MatchException matchException) {
                                    throw ec_0.c("\u00ff", (Object)matchException, (long)-694776261823095979L, (long)l);
                                }
                            }
                            Object[] objectArray6 = new Object[2];
                            objectArray6[1] = l3;
                            objectArray6[0] = ec_0.c("\u00f2", (long)-698686334926021881L, (long)l);
                            ec_0.c("\u00ff", (Object)objectArray6, (long)-697252797664310419L, (long)l);
                            object2 = 1;
                        }
                        return (boolean)object2;
                    }
                    object = ec_0.c("\u00a2", (Object)((Boolean)((Object)ec_0.c("\u00a2", (Object)this.g, (long)-693166026368438134L, (long)l))), (long)-695956422557104492L, (long)l);
                }
                try {
                    try {
                        if (callSite != null) break block43;
                        if (object == false) break block44;
                    }
                    catch (MatchException matchException) {
                        throw ec_0.c("\u00ff", (Object)matchException, (long)-694776261823095979L, (long)l);
                    }
                    Object[] objectArray7 = new Object[2];
                    objectArray7[1] = l2;
                    objectArray7[0] = ec_0.c("\u00f2", (long)-693937152163702780L, (long)l);
                    ec_0.c("\u00ff", (Object)objectArray7, (long)-696853639966170389L, (long)l);
                    this.m = 1;
                }
                catch (MatchException matchException) {
                    throw ec_0.c("\u00ff", (Object)matchException, (long)-694776261823095979L, (long)l);
                }
            }
            ec_0.c("\u00a2", (Object)this.k, (Object)class_23382, (long)-692857570853234172L, (long)l);
            object = 1;
        }
        return (boolean)object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @bP
    public void a(bh_0 bh_02) {
        class_2885 class_28852;
        long l;
        block15: {
            CallSite callSite;
            CallSite callSite2;
            block14: {
                CallSite callSite3;
                CallSite callSite4;
                CallSite callSite5;
                CallSite callSite6;
                block13: {
                    l = o ^ 0x6841D5DC5BDBL;
                    callSite6 = ec_0.c("\u00a2", (Object)bh_02, (Object)new Object[0], (long)5413420582503369177L, (long)l);
                    callSite5 = ec_0.c("\u00ff", (long)5410108094778455472L, (long)l);
                    try {
                        try {
                            callSite4 = callSite6;
                            if (callSite5 != null) break block13;
                            if (!(callSite4 instanceof class_2885)) return;
                        }
                        catch (MatchException matchException) {
                            throw ec_0.c("\u00ff", (Object)matchException, (long)5416958957070820898L, (long)l);
                        }
                        callSite4 = callSite6;
                    }
                    catch (MatchException matchException) {
                        throw ec_0.c("\u00ff", (Object)matchException, (long)5416958957070820898L, (long)l);
                    }
                }
                class_28852 = (class_2885)callSite4;
                try {
                    if (callSite5 != null) {
                        return;
                    }
                }
                catch (MatchException matchException) {
                    throw ec_0.c("\u00ff", (Object)matchException, (long)5416958957070820898L, (long)l);
                }
                try {
                    callSite3 = ec_0.c("\u00a2", (Object)class_28852, (long)5421170092089027671L, (long)l) == ec_0.c("\u00f2", (long)5416119534860674419L, (long)l) ? ec_0.c("\u00a2", (Object)ec_0.c("O", (Object)b, (long)5414243231698023427L, (long)l), (long)5421122188879177726L, (long)l) : ec_0.c("\u00a2", (Object)ec_0.c("O", (Object)b, (long)5414243231698023427L, (long)l), (long)5417043498995258486L, (long)l);
                }
                catch (MatchException matchException) {
                    throw ec_0.c("\u00ff", (Object)matchException, (long)5416958957070820898L, (long)l);
                }
                callSite6 = callSite3;
                try {
                    try {
                        callSite2 = ec_0.c("\u00a2", (Object)callSite6, (long)5414678539695826868L, (long)l);
                        callSite = ec_0.c("\u00f2", (long)5409995775542935222L, (long)l);
                        if (callSite5 != null) break block14;
                        if (callSite2 == callSite) break block15;
                    }
                    catch (MatchException matchException) {
                        throw ec_0.c("\u00ff", (Object)matchException, (long)5416958957070820898L, (long)l);
                    }
                    callSite2 = ec_0.c("\u00a2", (Object)callSite6, (long)5414678539695826868L, (long)l);
                    callSite = ec_0.c("\u00f2", (long)5408881065642285148L, (long)l);
                }
                catch (MatchException matchException) {
                    throw ec_0.c("\u00ff", (Object)matchException, (long)5416958957070820898L, (long)l);
                }
            }
            if (callSite2 != callSite) return;
        }
        CallSite callSite = ec_0.c("\u00a2", (Object)class_28852, (long)5415134369954266870L, (long)l);
        ec_0.c("\u00a2", (Object)this.j, (Object)ec_0.c("\u00a2", (Object)ec_0.c("\u00a2", (Object)callSite, (long)5415318991066209248L, (long)l), (int)ec_0.c("\u00a2", (Object)ec_0.c("\u00a2", (Object)callSite, (long)5422011237901235223L, (long)l), (long)5415668902576811748L, (long)l), (int)ec_0.c("\u00a2", (Object)ec_0.c("\u00a2", (Object)callSite, (long)5422011237901235223L, (long)l), (long)5415181945313019532L, (long)l), (int)ec_0.c("\u00a2", (Object)ec_0.c("\u00a2", (Object)callSite, (long)5422011237901235223L, (long)l), (long)5417500053033965834L, (long)l), (long)5410838491613909078L, (long)l), (long)5410290341450409843L, (long)l);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public dC a(Object[] objectArray) {
        ec_0 ec_02;
        CallSite callSite;
        long l;
        long l2;
        block116: {
            CallSite callSite2;
            long l3;
            block114: {
                CallSite callSite3;
                CallSite callSite4;
                CallSite callSite5;
                long l4;
                block115: {
                    block112: {
                        block113: {
                            block118: {
                                long l5;
                                block117: {
                                    CallSite callSite6;
                                    block111: {
                                        CallSite callSite7;
                                        block110: {
                                            block109: {
                                                boolean bl;
                                                long l6;
                                                block108: {
                                                    Object object;
                                                    block107: {
                                                        block106: {
                                                            boolean bl2;
                                                            CallSite callSite8;
                                                            long l7;
                                                            block104: {
                                                                block105: {
                                                                    CallSite callSite9;
                                                                    long l8;
                                                                    long l9;
                                                                    long l10;
                                                                    block103: {
                                                                        long l11;
                                                                        block102: {
                                                                            CallSite callSite10;
                                                                            block101: {
                                                                                Object object2;
                                                                                block95: {
                                                                                    long l12;
                                                                                    block96: {
                                                                                        ec_0 ec_03;
                                                                                        block99: {
                                                                                            block100: {
                                                                                                CallSite callSite11;
                                                                                                long l13;
                                                                                                block97: {
                                                                                                    block98: {
                                                                                                        block93: {
                                                                                                            block94: {
                                                                                                                block91: {
                                                                                                                    block92: {
                                                                                                                        block89: {
                                                                                                                            block90: {
                                                                                                                                l2 = (Long)objectArray[0];
                                                                                                                                long l14 = l2;
                                                                                                                                l6 = l14 ^ 0x6A372CEC5E83L;
                                                                                                                                l4 = l14 ^ 0x681806180915L;
                                                                                                                                l3 = l14 ^ 0x1A99A2A6F024L;
                                                                                                                                l7 = l14 ^ 0x750660A45EAFL;
                                                                                                                                l10 = l14 ^ 0x7211AE7602D5L;
                                                                                                                                l12 = l14 ^ 0x1E12C5EE8DD4L;
                                                                                                                                l13 = l14 ^ 0x6D88BA4E35CEL;
                                                                                                                                l = l14 ^ 0x7C6037A2A158L;
                                                                                                                                l5 = l14 ^ 0x5C9A0C609185L;
                                                                                                                                l9 = l14 ^ 0x5D89C0EA5D47L;
                                                                                                                                l11 = l14 ^ 0x40E30CC651A1L;
                                                                                                                                l8 = l14 ^ 0x24011C3221C4L;
                                                                                                                                callSite5 = ec_0.c("\u00ff", (long)-1178098761878236926L, (long)l2);
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        object2 = ec_0.c("\u00a2", (Object)ec_0.c("\u00f2", (long)-1180862586283297735L, (long)l2), (Object)new Object[0], (long)-1181464669835249828L, (long)l2);
                                                                                                                                        if (callSite5 != null) break block89;
                                                                                                                                        if (object2 == false) break block90;
                                                                                                                                        return null;
                                                                                                                                    }
                                                                                                                                    catch (MatchException matchException) {
                                                                                                                                        throw ec_0.c("\u00ff", (Object)matchException, (long)-1180230385934269808L, (long)l2);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                catch (MatchException matchException) {
                                                                                                                                    throw ec_0.c("\u00ff", (Object)matchException, (long)-1180230385934269808L, (long)l2);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            object2 = ec_0.c("\u00a2", (String)((Object)ec_0.c("\u00a2", (Object)this.a, (long)-1178760887975171761L, (long)l2)), (Object)ec_0.b("c", (int)2192, (long)(0x25935675F7DA8249L ^ l2)), (long)-1179070540456960057L, (long)l2);
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                if (callSite5 != null) break block91;
                                                                                                                                if (object2 != false) break block92;
                                                                                                                                return null;
                                                                                                                            }
                                                                                                                            catch (MatchException matchException) {
                                                                                                                                throw ec_0.c("\u00ff", (Object)matchException, (long)-1180230385934269808L, (long)l2);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        catch (MatchException matchException) {
                                                                                                                            throw ec_0.c("\u00ff", (Object)matchException, (long)-1180230385934269808L, (long)l2);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    object2 = ec_0.c("\u00a2", (Object)ec_0.c("O", (Object)b, (long)-1184063764815949647L, (long)l2), (long)-1179770898885350761L, (long)l2);
                                                                                                                }
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        if (callSite5 != null) break block93;
                                                                                                                        if (object2 == false) break block94;
                                                                                                                        return null;
                                                                                                                    }
                                                                                                                    catch (MatchException matchException) {
                                                                                                                        throw ec_0.c("\u00ff", (Object)matchException, (long)-1180230385934269808L, (long)l2);
                                                                                                                    }
                                                                                                                }
                                                                                                                catch (MatchException matchException) {
                                                                                                                    throw ec_0.c("\u00ff", (Object)matchException, (long)-1180230385934269808L, (long)l2);
                                                                                                                }
                                                                                                            }
                                                                                                            object2 = this.m;
                                                                                                        }
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                if (callSite5 != null) break block95;
                                                                                                                                if (object2 == false) break block96;
                                                                                                                            }
                                                                                                                            catch (MatchException matchException) {
                                                                                                                                throw ec_0.c("\u00ff", (Object)matchException, (long)-1180230385934269808L, (long)l2);
                                                                                                                            }
                                                                                                                            object2 = this.l;
                                                                                                                            if (callSite5 != null) break block95;
                                                                                                                        }
                                                                                                                        catch (MatchException matchException) {
                                                                                                                            throw ec_0.c("\u00ff", (Object)matchException, (long)-1180230385934269808L, (long)l2);
                                                                                                                        }
                                                                                                                        if (object2 == -1) break block96;
                                                                                                                    }
                                                                                                                    catch (MatchException matchException) {
                                                                                                                        throw ec_0.c("\u00ff", (Object)matchException, (long)-1180230385934269808L, (long)l2);
                                                                                                                    }
                                                                                                                    Object[] objectArray2 = new Object[2];
                                                                                                                    objectArray2[1] = l12;
                                                                                                                    objectArray2[0] = this.d;
                                                                                                                    callSite11 = ec_0.c("\u00a2", (Object)this.n, (Object)objectArray2, (long)-1183332998490444064L, (long)l2);
                                                                                                                    if (callSite5 != null) break block97;
                                                                                                                }
                                                                                                                catch (MatchException matchException) {
                                                                                                                    throw ec_0.c("\u00ff", (Object)matchException, (long)-1180230385934269808L, (long)l2);
                                                                                                                }
                                                                                                                if (callSite11 != false) break block98;
                                                                                                                return null;
                                                                                                            }
                                                                                                            catch (MatchException matchException) {
                                                                                                                throw ec_0.c("\u00ff", (Object)matchException, (long)-1180230385934269808L, (long)l2);
                                                                                                            }
                                                                                                        }
                                                                                                        catch (MatchException matchException) {
                                                                                                            throw ec_0.c("\u00ff", (Object)matchException, (long)-1180230385934269808L, (long)l2);
                                                                                                        }
                                                                                                    }
                                                                                                    try {
                                                                                                        ec_03 = this;
                                                                                                        if (callSite5 != null) break block99;
                                                                                                        callSite11 = ec_0.c("\u00a2", (Object)((Boolean)((Object)ec_0.c("\u00a2", (Object)ec_03.h, (long)-1178760887975171761L, (long)l2))), (long)-1183842733082009775L, (long)l2);
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw ec_0.c("\u00ff", (Object)matchException, (long)-1180230385934269808L, (long)l2);
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (callSite11 == false) break block100;
                                                                                                            ec_03 = this;
                                                                                                            if (callSite5 != null) break block99;
                                                                                                        }
                                                                                                        catch (MatchException matchException) {
                                                                                                            throw ec_0.c("\u00ff", (Object)matchException, (long)-1180230385934269808L, (long)l2);
                                                                                                        }
                                                                                                        if (ec_0.c("\u00a2", (Object)((Boolean)((Object)ec_0.c("\u00a2", (Object)ec_03.g, (long)-1178760887975171761L, (long)l2))), (long)-1183842733082009775L, (long)l2) == false) break block100;
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw ec_0.c("\u00ff", (Object)matchException, (long)-1180230385934269808L, (long)l2);
                                                                                                    }
                                                                                                    Object[] objectArray3 = new Object[2];
                                                                                                    objectArray3[1] = l13;
                                                                                                    objectArray3[0] = this.l;
                                                                                                    ec_0.c("\u00ff", (Object)objectArray3, (long)-1186102383854262595L, (long)l2);
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw ec_0.c("\u00ff", (Object)matchException, (long)-1180230385934269808L, (long)l2);
                                                                                                }
                                                                                            }
                                                                                            this.l = -1;
                                                                                            this.m = false;
                                                                                            Object[] objectArray4 = new Object[1];
                                                                                            objectArray4[0] = l3;
                                                                                            ec_0.c("\u00a2", (Object)this.n, (Object)objectArray4, (long)-1181609727388905063L, (long)l2);
                                                                                            ec_03 = this;
                                                                                        }
                                                                                        Object[] objectArray5 = new Object[1];
                                                                                        objectArray5[0] = l;
                                                                                        ec_0.c("\u00a2", (Object)ec_03.d, (Object)objectArray5, (long)-1179457159808184423L, (long)l2);
                                                                                        return null;
                                                                                    }
                                                                                    Object[] objectArray6 = new Object[2];
                                                                                    objectArray6[1] = l12;
                                                                                    objectArray6[0] = this.d;
                                                                                    object2 = ec_0.c("\u00a2", (Object)this.n, (Object)objectArray6, (long)-1183332998490444064L, (long)l2);
                                                                                }
                                                                                try {
                                                                                    if (object2 == false) {
                                                                                        return null;
                                                                                    }
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw ec_0.c("\u00ff", (Object)matchException, (long)-1180230385934269808L, (long)l2);
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        Object[] objectArray7 = new Object[2];
                                                                                        objectArray7[1] = l7;
                                                                                        objectArray7[0] = ec_0.c("\u00f2", (long)-1186533133831535934L, (long)l2);
                                                                                        callSite10 = ec_0.c("\u00ff", (Object)objectArray7, (long)-1180665277803588470L, (long)l2);
                                                                                        if (callSite5 != null) break block101;
                                                                                        if (callSite10 != null) break block102;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw ec_0.c("\u00ff", (Object)matchException, (long)-1180230385934269808L, (long)l2);
                                                                                    }
                                                                                    callSite10 = ec_0.c("\u00a2", (Object)this.f, (long)-1178760887975171761L, (long)l2);
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw ec_0.c("\u00ff", (Object)matchException, (long)-1180230385934269808L, (long)l2);
                                                                                }
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    if (ec_0.c("\u00a2", (Object)((Boolean)((Object)callSite10)), (long)-1183842733082009775L, (long)l2) == false) return null;
                                                                                    Object[] objectArray8 = new Object[2];
                                                                                    objectArray8[1] = l7;
                                                                                    objectArray8[0] = ec_0.c("\u00f2", (long)-1186360301893464574L, (long)l2);
                                                                                    if (ec_0.c("\u00ff", (Object)objectArray8, (long)-1180665277803588470L, (long)l2) != null) break block102;
                                                                                    return null;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw ec_0.c("\u00ff", (Object)matchException, (long)-1180230385934269808L, (long)l2);
                                                                                }
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw ec_0.c("\u00ff", (Object)matchException, (long)-1180230385934269808L, (long)l2);
                                                                            }
                                                                        }
                                                                        Object[] objectArray9 = new Object[1];
                                                                        objectArray9[0] = l11;
                                                                        CallSite callSite12 = ec_0.c("\u00ff", (Object)objectArray9, (long)-1180044719027183568L, (long)l2);
                                                                        try {
                                                                            callSite9 = callSite12;
                                                                            if (callSite5 != null) break block103;
                                                                            if (callSite9 == null) return null;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw ec_0.c("\u00ff", (Object)matchException, (long)-1180230385934269808L, (long)l2);
                                                                        }
                                                                        callSite9 = callSite12;
                                                                    }
                                                                    try {
                                                                        Object[] objectArray10 = new Object[2];
                                                                        objectArray10[1] = l10;
                                                                        objectArray10[0] = callSite9;
                                                                        Object[] objectArray11 = new Object[1];
                                                                        objectArray11[0] = l8;
                                                                        if (ec_0.c("\u00a2", (Object)ec_0.c("\u00ff", (Object)objectArray10, (long)-1185250458013625211L, (long)l2), (Object)ec_0.c("\u00ff", (Object)objectArray11, (long)-1183310007796367274L, (long)l2), (long)-1179997343618502475L, (long)l2) > 10.0) {
                                                                            return null;
                                                                        }
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw ec_0.c("\u00ff", (Object)matchException, (long)-1180230385934269808L, (long)l2);
                                                                    }
                                                                    Object[] objectArray12 = new Object[1];
                                                                    objectArray12[0] = l9;
                                                                    callSite4 = ec_0.c("\u00a2", (Object)this, (Object)objectArray12, (long)-1179692634640715921L, (long)l2);
                                                                    try {
                                                                        try {
                                                                            callSite8 = callSite4;
                                                                            if (callSite5 != null) break block104;
                                                                            if (callSite8 != null) break block105;
                                                                            return null;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw ec_0.c("\u00ff", (Object)matchException, (long)-1180230385934269808L, (long)l2);
                                                                        }
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw ec_0.c("\u00ff", (Object)matchException, (long)-1180230385934269808L, (long)l2);
                                                                    }
                                                                }
                                                                callSite8 = callSite4;
                                                            }
                                                            callSite3 = ec_0.c("\u00a2", (Object)callSite8, (long)-1183023790914125998L, (long)l2);
                                                            try {
                                                                Object[] objectArray13 = new Object[2];
                                                                objectArray13[1] = l7;
                                                                objectArray13[0] = ec_0.c("\u00f2", (long)-1186533133831535934L, (long)l2);
                                                                bl2 = ec_0.c("\u00ff", (Object)objectArray13, (long)-1180665277803588470L, (long)l2) != null;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw ec_0.c("\u00ff", (Object)matchException, (long)-1180230385934269808L, (long)l2);
                                                            }
                                                            boolean bl3 = bl2;
                                                            try {
                                                                try {
                                                                    object = bl3;
                                                                    if (callSite5 != null) break block106;
                                                                    if (object) break block107;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw ec_0.c("\u00ff", (Object)matchException, (long)-1180230385934269808L, (long)l2);
                                                                }
                                                                object = ec_0.c("\u00a2", (Object)((Boolean)((Object)ec_0.c("\u00a2", (Object)this.f, (long)-1178760887975171761L, (long)l2))), (long)-1183842733082009775L, (long)l2);
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw ec_0.c("\u00ff", (Object)matchException, (long)-1180230385934269808L, (long)l2);
                                                            }
                                                        }
                                                        try {
                                                            if (callSite5 != null) break block108;
                                                            if (!object) break block107;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw ec_0.c("\u00ff", (Object)matchException, (long)-1180230385934269808L, (long)l2);
                                                        }
                                                        object = true;
                                                        break block108;
                                                    }
                                                    object = bl = false;
                                                }
                                                if (!bl) break block117;
                                                CallSite callSite13 = ec_0.c("\u00a2", (Object)callSite3, (long)-1186601418200767978L, (long)l2);
                                                CallSite callSite14 = ec_0.c("\u00a2", (Object)ec_0.c("\u00ff", (Object)callSite13, (long)-1184308181447313028L, (long)l2), (double)0.0, (double)0.5, (double)0.0, (long)-1183471568536063349L, (long)l2);
                                                Object[] objectArray14 = new Object[2];
                                                objectArray14[1] = l5;
                                                objectArray14[0] = callSite14;
                                                callSite = ec_0.c("\u00a2", (Object)ec_0.c("\u00f2", (long)-1180862586283297735L, (long)l2), (Object)objectArray14, (long)-1182005957312670717L, (long)l2);
                                                Object[] objectArray15 = new Object[2];
                                                objectArray15[1] = l6;
                                                objectArray15[0] = callSite;
                                                callSite7 = ec_0.c("\u00ff", (Object)objectArray15, (long)-1179127770747618338L, (long)l2);
                                                try {
                                                    callSite6 = callSite7;
                                                    if (callSite5 != null) break block109;
                                                    if (callSite6 == null) return null;
                                                }
                                                catch (MatchException matchException) {
                                                    throw ec_0.c("\u00ff", (Object)matchException, (long)-1180230385934269808L, (long)l2);
                                                }
                                                callSite6 = callSite7;
                                            }
                                            try {
                                                try {
                                                    if (callSite5 != null) break block110;
                                                    if (ec_0.c("\u00a2", (Object)callSite6, (long)-1185447933998538397L, (long)l2) != ec_0.c("\u00f2", (long)-1185654858198399170L, (long)l2)) return null;
                                                }
                                                catch (MatchException matchException) {
                                                    throw ec_0.c("\u00ff", (Object)matchException, (long)-1180230385934269808L, (long)l2);
                                                }
                                                callSite6 = callSite7;
                                            }
                                            catch (MatchException matchException) {
                                                throw ec_0.c("\u00ff", (Object)matchException, (long)-1180230385934269808L, (long)l2);
                                            }
                                        }
                                        try {
                                            try {
                                                if (callSite5 != null) break block111;
                                                if (!(callSite6 instanceof class_3965)) return null;
                                            }
                                            catch (MatchException matchException) {
                                                throw ec_0.c("\u00ff", (Object)matchException, (long)-1180230385934269808L, (long)l2);
                                            }
                                            callSite6 = callSite7;
                                        }
                                        catch (MatchException matchException) {
                                            throw ec_0.c("\u00ff", (Object)matchException, (long)-1180230385934269808L, (long)l2);
                                        }
                                    }
                                    class_3965 class_39652 = (class_3965)callSite6;
                                    try {
                                        if (callSite5 != null) {
                                            return null;
                                        }
                                    }
                                    catch (MatchException matchException) {
                                        throw ec_0.c("\u00ff", (Object)matchException, (long)-1180230385934269808L, (long)l2);
                                    }
                                    callSite4 = class_39652;
                                    if (callSite5 == null) break block118;
                                }
                                Object[] objectArray16 = new Object[2];
                                objectArray16[1] = l5;
                                objectArray16[0] = ec_0.c("\u00a2", (Object)callSite4, (long)-1178908804092125287L, (long)l2);
                                callSite = ec_0.c("\u00a2", (Object)ec_0.c("\u00f2", (long)-1180862586283297735L, (long)l2), (Object)objectArray16, (long)-1182005957312670717L, (long)l2);
                            }
                            try {
                                try {
                                    reference cfr_temp_0 = ec_0.c("\u00ff", (float)(ec_0.c("\u00a2", (Object)callSite, (Object)new Object[0], (long)-1185904597970431023L, (long)l2) - ec_0.c("\u00a2", (Object)ec_0.c("O", (Object)b, (long)-1184063764815949647L, (long)l2), (long)-1181379088325486265L, (long)l2)), (long)-1183626747919902894L, (long)l2) - ec_0.c("\u00a2", (Object)((Float)((Object)ec_0.c("\u00a2", (Object)this.i, (long)-1178760887975171761L, (long)l2))), (long)-1185074503575944336L, (long)l2);
                                    callSite2 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                    if (callSite5 != null) break block112;
                                    if (callSite2 <= 0) break block113;
                                    return null;
                                }
                                catch (MatchException matchException) {
                                    throw ec_0.c("\u00ff", (Object)matchException, (long)-1180230385934269808L, (long)l2);
                                }
                            }
                            catch (MatchException matchException) {
                                throw ec_0.c("\u00ff", (Object)matchException, (long)-1180230385934269808L, (long)l2);
                            }
                        }
                        callSite2 = ec_0.c("\u00a2", (Object)callSite, (Object)new Object[0], (long)-1178592833605310228L, (long)l2);
                    }
                    try {
                        try {
                            if (callSite5 != null) break block114;
                            if (callSite2 == false) break block115;
                            return callSite;
                        }
                        catch (MatchException matchException) {
                            throw ec_0.c("\u00ff", (Object)matchException, (long)-1180230385934269808L, (long)l2);
                        }
                    }
                    catch (MatchException matchException) {
                        throw ec_0.c("\u00ff", (Object)matchException, (long)-1180230385934269808L, (long)l2);
                    }
                }
                try {
                    ec_0.c("\u00a2", (Object)ec_0.c("\u00f2", (long)-1180862586283297735L, (long)l2), (Object)new Object[]{callSite}, (long)-1185840215658646212L, (long)l2);
                    ec_02 = this;
                    if (callSite5 != null) break block116;
                    Object[] objectArray17 = new Object[3];
                    objectArray17[2] = l4;
                    objectArray17[1] = callSite4;
                    objectArray17[0] = callSite3;
                    callSite2 = ec_0.c("\u00a2", (Object)ec_02, (Object)objectArray17, (long)-1179414226150679930L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw ec_0.c("\u00ff", (Object)matchException, (long)-1180230385934269808L, (long)l2);
                }
            }
            try {
                if (callSite2 == false) return callSite;
                Object[] objectArray18 = new Object[1];
                objectArray18[0] = l3;
                ec_0.c("\u00a2", (Object)this.n, (Object)objectArray18, (long)-1181609727388905063L, (long)l2);
                ec_02 = this;
            }
            catch (MatchException matchException) {
                throw ec_0.c("\u00ff", (Object)matchException, (long)-1180230385934269808L, (long)l2);
            }
        }
        Object[] objectArray19 = new Object[1];
        objectArray19[0] = l;
        ec_0.c("\u00a2", (Object)ec_02.d, (Object)objectArray19, (long)-1179457159808184423L, (long)l2);
        return callSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @bP
    public void a(bG bG2) {
        ec_0 ec_02;
        long l;
        long l2;
        block65: {
            CallSite callSite;
            long l3;
            block63: {
                CallSite callSite2;
                CallSite callSite3;
                CallSite callSite4;
                long l4;
                block64: {
                    CallSite callSite5;
                    long l5;
                    block61: {
                        block62: {
                            CallSite callSite6;
                            long l6;
                            long l7;
                            long l8;
                            block60: {
                                long l9;
                                block59: {
                                    CallSite callSite7;
                                    long l10;
                                    block58: {
                                        Object object;
                                        block52: {
                                            long l11;
                                            block53: {
                                                ec_0 ec_03;
                                                block56: {
                                                    block57: {
                                                        CallSite callSite8;
                                                        long l12;
                                                        block54: {
                                                            block55: {
                                                                block50: {
                                                                    block51: {
                                                                        block48: {
                                                                            block49: {
                                                                                block46: {
                                                                                    block47: {
                                                                                        long l13 = l2 = o ^ 0x504CEC21A63DL;
                                                                                        l4 = l13 ^ 0x4DDA35B25041L;
                                                                                        l3 = l13 ^ 0x3F5B910CA970L;
                                                                                        l10 = l13 ^ 0x50C4530E07FBL;
                                                                                        l8 = l13 ^ 0x57D39DDC5B81L;
                                                                                        l7 = l13 ^ 0x7D497E2DB0F2L;
                                                                                        l11 = l13 ^ 0x3BD0F644D480L;
                                                                                        l12 = l13 ^ 0x484A89E46C9AL;
                                                                                        l = l13 ^ 0x59A20408F80CL;
                                                                                        l5 = l13 ^ 0x68F79EEBC6B3L;
                                                                                        l9 = l13 ^ 0x65213F6C08F5L;
                                                                                        l6 = l13 ^ 0x1C32F987890L;
                                                                                        ec_0.c("\u00a2", (Object)this.j, this::lambda$onTick$2, (long)-5271000924147930710L, (long)l2);
                                                                                        CallSite callSite9 = ec_0.c("\u00ff", (long)-5263959571574962090L, (long)l2);
                                                                                        ec_0.c("\u00a2", (Object)this.k, this::lambda$onTick$3, (long)-5271000924147930710L, (long)l2);
                                                                                        callSite4 = callSite9;
                                                                                        try {
                                                                                            object = ec_0.c("\u00a2", (String)((Object)ec_0.c("\u00a2", (Object)this.a, (long)-5264682720478892005L, (long)l2)), (Object)ec_0.b("c", (int)4407, (long)(0x3A9534574D2EC2BEL ^ l2)), (long)-5277666934291133156L, (long)l2);
                                                                                            if (callSite4 != null) break block46;
                                                                                            if (object != false) break block47;
                                                                                            return;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw ec_0.c("\u00ff", (Object)matchException, (long)-5275158317106308156L, (long)l2);
                                                                                        }
                                                                                    }
                                                                                    object = ec_0.c("\u00a2", (Object)ec_0.c("O", (Object)b, (long)-5276677773286340123L, (long)l2), (long)-5263378259496520765L, (long)l2);
                                                                                }
                                                                                try {
                                                                                    if (callSite4 != null) break block48;
                                                                                    if (object == false) break block49;
                                                                                    return;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw ec_0.c("\u00ff", (Object)matchException, (long)-5275158317106308156L, (long)l2);
                                                                                }
                                                                            }
                                                                            object = ec_0.c("\u00a2", (Object)ec_0.c("\u00f2", (long)-5275792717519868563L, (long)l2), (Object)new Object[0], (long)-5274069316916875768L, (long)l2);
                                                                        }
                                                                        try {
                                                                            if (callSite4 != null) break block50;
                                                                            if (object == false) break block51;
                                                                            return;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw ec_0.c("\u00ff", (Object)matchException, (long)-5275158317106308156L, (long)l2);
                                                                        }
                                                                    }
                                                                    object = this.m;
                                                                }
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (callSite4 != null) break block52;
                                                                                    if (object == false) break block53;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw ec_0.c("\u00ff", (Object)matchException, (long)-5275158317106308156L, (long)l2);
                                                                                }
                                                                                object = this.l;
                                                                                if (callSite4 != null) break block52;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw ec_0.c("\u00ff", (Object)matchException, (long)-5275158317106308156L, (long)l2);
                                                                            }
                                                                            if (object == -1) break block53;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw ec_0.c("\u00ff", (Object)matchException, (long)-5275158317106308156L, (long)l2);
                                                                        }
                                                                        Object[] objectArray = new Object[2];
                                                                        objectArray[1] = l11;
                                                                        objectArray[0] = this.d;
                                                                        callSite8 = ec_0.c("\u00a2", (Object)this.n, (Object)objectArray, (long)-5276018458003179596L, (long)l2);
                                                                        if (callSite4 != null) break block54;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw ec_0.c("\u00ff", (Object)matchException, (long)-5275158317106308156L, (long)l2);
                                                                    }
                                                                    if (callSite8 != false) break block55;
                                                                    return;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw ec_0.c("\u00ff", (Object)matchException, (long)-5275158317106308156L, (long)l2);
                                                                }
                                                            }
                                                            try {
                                                                ec_03 = this;
                                                                if (callSite4 != null) break block56;
                                                                callSite8 = ec_0.c("\u00a2", (Object)((Boolean)((Object)ec_0.c("\u00a2", (Object)ec_03.h, (long)-5264682720478892005L, (long)l2))), (long)-5276529310863047163L, (long)l2);
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw ec_0.c("\u00ff", (Object)matchException, (long)-5275158317106308156L, (long)l2);
                                                            }
                                                        }
                                                        try {
                                                            try {
                                                                try {
                                                                    if (callSite8 == false) break block57;
                                                                    ec_03 = this;
                                                                    if (callSite4 != null) break block56;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw ec_0.c("\u00ff", (Object)matchException, (long)-5275158317106308156L, (long)l2);
                                                                }
                                                                if (ec_0.c("\u00a2", (Object)((Boolean)((Object)ec_0.c("\u00a2", (Object)ec_03.g, (long)-5264682720478892005L, (long)l2))), (long)-5276529310863047163L, (long)l2) == false) break block57;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw ec_0.c("\u00ff", (Object)matchException, (long)-5275158317106308156L, (long)l2);
                                                            }
                                                            Object[] objectArray = new Object[2];
                                                            objectArray[1] = l12;
                                                            objectArray[0] = this.l;
                                                            ec_0.c("\u00ff", (Object)objectArray, (long)-5269708643326672919L, (long)l2);
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw ec_0.c("\u00ff", (Object)matchException, (long)-5275158317106308156L, (long)l2);
                                                        }
                                                    }
                                                    this.l = -1;
                                                    this.m = 0;
                                                    Object[] objectArray = new Object[1];
                                                    objectArray[0] = l3;
                                                    ec_0.c("\u00a2", (Object)this.n, (Object)objectArray, (long)-5274223186668631859L, (long)l2);
                                                    ec_03 = this;
                                                }
                                                Object[] objectArray = new Object[1];
                                                objectArray[0] = l;
                                                ec_0.c("\u00a2", (Object)ec_03.d, (Object)objectArray, (long)-5263128840707909939L, (long)l2);
                                                return;
                                            }
                                            Object[] objectArray = new Object[2];
                                            objectArray[1] = l11;
                                            objectArray[0] = this.d;
                                            object = ec_0.c("\u00a2", (Object)this.n, (Object)objectArray, (long)-5276018458003179596L, (long)l2);
                                        }
                                        if (object == false) {
                                            return;
                                        }
                                        try {
                                            try {
                                                Object[] objectArray = new Object[2];
                                                objectArray[1] = l10;
                                                objectArray[0] = ec_0.c("\u00f2", (long)-5270139944691049578L, (long)l2);
                                                callSite7 = ec_0.c("\u00ff", (Object)objectArray, (long)-5275603105138127394L, (long)l2);
                                                if (callSite4 != null) break block58;
                                                if (callSite7 != null) break block59;
                                            }
                                            catch (MatchException matchException) {
                                                throw ec_0.c("\u00ff", (Object)matchException, (long)-5275158317106308156L, (long)l2);
                                            }
                                            callSite7 = ec_0.c("\u00a2", (Object)this.f, (long)-5264682720478892005L, (long)l2);
                                        }
                                        catch (MatchException matchException) {
                                            throw ec_0.c("\u00ff", (Object)matchException, (long)-5275158317106308156L, (long)l2);
                                        }
                                    }
                                    try {
                                        try {
                                            if (ec_0.c("\u00a2", (Object)((Boolean)((Object)callSite7)), (long)-5276529310863047163L, (long)l2) == false) return;
                                            Object[] objectArray = new Object[2];
                                            objectArray[1] = l10;
                                            objectArray[0] = ec_0.c("\u00f2", (long)-5270031432517314730L, (long)l2);
                                            if (ec_0.c("\u00ff", (Object)objectArray, (long)-5275603105138127394L, (long)l2) != null) break block59;
                                            return;
                                        }
                                        catch (MatchException matchException) {
                                            throw ec_0.c("\u00ff", (Object)matchException, (long)-5275158317106308156L, (long)l2);
                                        }
                                    }
                                    catch (MatchException matchException) {
                                        throw ec_0.c("\u00ff", (Object)matchException, (long)-5275158317106308156L, (long)l2);
                                    }
                                }
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l9;
                                CallSite callSite10 = ec_0.c("\u00ff", (Object)objectArray, (long)-5274974831574156956L, (long)l2);
                                try {
                                    callSite6 = callSite10;
                                    if (callSite4 != null) break block60;
                                    if (callSite6 == null) return;
                                }
                                catch (MatchException matchException) {
                                    throw ec_0.c("\u00ff", (Object)matchException, (long)-5275158317106308156L, (long)l2);
                                }
                                callSite6 = callSite10;
                            }
                            try {
                                Object[] objectArray = new Object[2];
                                objectArray[1] = l8;
                                objectArray[0] = callSite6;
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l6;
                                if (ec_0.c("\u00a2", (Object)ec_0.c("\u00ff", (Object)objectArray, (long)-5271180519645590063L, (long)l2), (Object)ec_0.c("\u00ff", (Object)objectArray2, (long)-5278170302935181054L, (long)l2), (long)-5274863703234401823L, (long)l2) > 10.0) {
                                    return;
                                }
                            }
                            catch (MatchException matchException) {
                                throw ec_0.c("\u00ff", (Object)matchException, (long)-5275158317106308156L, (long)l2);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l7;
                            callSite3 = ec_0.c("\u00a2", (Object)this, (Object)objectArray, (long)-5264062150825536060L, (long)l2);
                            try {
                                callSite5 = callSite3;
                                if (callSite4 != null) break block61;
                                if (callSite5 != null) break block62;
                                return;
                            }
                            catch (MatchException matchException) {
                                throw ec_0.c("\u00ff", (Object)matchException, (long)-5275158317106308156L, (long)l2);
                            }
                        }
                        callSite5 = callSite3;
                    }
                    callSite2 = ec_0.c("\u00a2", (Object)callSite5, (long)-5277889032228936186L, (long)l2);
                    try {
                        Object[] objectArray = new Object[2];
                        objectArray[1] = l5;
                        objectArray[0] = callSite2;
                        callSite = ec_0.c("\u00a2", (Object)this, (Object)objectArray, (long)-5276243367047117631L, (long)l2);
                        if (callSite4 != null) break block63;
                        if (callSite != false) break block64;
                        return;
                    }
                    catch (MatchException matchException) {
                        throw ec_0.c("\u00ff", (Object)matchException, (long)-5275158317106308156L, (long)l2);
                    }
                }
                try {
                    ec_02 = this;
                    if (callSite4 != null) break block65;
                    Object[] objectArray = new Object[3];
                    objectArray[2] = l4;
                    objectArray[1] = callSite3;
                    objectArray[0] = callSite2;
                    callSite = ec_0.c("\u00a2", (Object)ec_02, (Object)objectArray, (long)-5263084257838545966L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw ec_0.c("\u00ff", (Object)matchException, (long)-5275158317106308156L, (long)l2);
                }
            }
            try {
                if (callSite == false) return;
                Object[] objectArray = new Object[1];
                objectArray[0] = l3;
                ec_0.c("\u00a2", (Object)this.n, (Object)objectArray, (long)-5274223186668631859L, (long)l2);
                ec_02 = this;
            }
            catch (MatchException matchException) {
                throw ec_0.c("\u00ff", (Object)matchException, (long)-5275158317106308156L, (long)l2);
            }
        }
        Object[] objectArray = new Object[1];
        objectArray[0] = l;
        ec_0.c("\u00a2", (Object)ec_02.d, (Object)objectArray, (long)-5263128840707909939L, (long)l2);
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (t[n3] != null) {
            return n3;
        }
        Object object = s[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 19;
            case 1 -> 36;
            case 2 -> 48;
            case 3 -> 25;
            case 4 -> 49;
            case 5 -> 14;
            case 6 -> 2;
            case 7 -> 43;
            case 8 -> 16;
            case 9 -> 61;
            case 10 -> 4;
            case 11 -> 46;
            case 12 -> 20;
            case 13 -> 7;
            case 14 -> 13;
            case 15 -> 10;
            case 16 -> 15;
            case 17 -> 63;
            case 18 -> 11;
            case 19 -> 28;
            case 20 -> 24;
            case 21 -> 27;
            case 22 -> 34;
            case 23 -> 0;
            case 24 -> 59;
            case 25 -> 45;
            case 26 -> 3;
            case 27 -> 1;
            case 28 -> 29;
            case 29 -> 57;
            case 30 -> 41;
            case 31 -> 6;
            case 32 -> 44;
            case 33 -> 54;
            case 34 -> 53;
            case 35 -> 31;
            case 36 -> 51;
            case 37 -> 8;
            case 38 -> 39;
            case 39 -> 22;
            case 40 -> 37;
            case 41 -> 23;
            case 42 -> 52;
            case 43 -> 55;
            case 44 -> 17;
            case 45 -> 47;
            case 46 -> 26;
            case 47 -> 5;
            case 48 -> 9;
            case 49 -> 38;
            case 50 -> 62;
            case 51 -> 21;
            case 52 -> 58;
            case 53 -> 40;
            case 54 -> 30;
            case 55 -> 12;
            case 56 -> 42;
            case 57 -> 56;
            case 58 -> 35;
            case 59 -> 33;
            case 60 -> 60;
            case 61 -> 18;
            case 62 -> 50;
            default -> 32;
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
        ec_0.t[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = ec_0.m(l, l2);
        Object object = s[n];
        if (object instanceof String) {
            String string = t[n];
            int n2 = string.indexOf(8);
            Class clazz = ec_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ec_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ec_0.g(clazz3, string2, clazz2)) != null) {
                    ec_0.s[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ec_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ec_0.s[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ec_0.n(2962664424951485L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = ec_0.m(l, l2);
        Object object = s[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = t[n];
                int n3 = string2.indexOf(8);
                clazz3 = ec_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ec_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ec_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        ec_0.s[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ec_0.n(2962664424951485L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ec_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ec_0.s[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ec_0.n(2962664424951485L, 0L);
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
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean g(Object[] objectArray) {
        CallSite callSite;
        class_2248 class_22482;
        long l;
        block6: {
            class_2248 class_22483 = (class_2248)objectArray[0];
            l = (Long)objectArray[1];
            l = o ^ l;
            CallSite callSite2 = ec_0.c("\u00ff", (long)6839828040698175567L, (long)l);
            try {
                try {
                    class_22482 = class_22483;
                    callSite = ec_0.c("\u00f2", (long)6840158375102499354L, (long)l);
                    if (callSite2 != null) break block6;
                    if (class_22482 == callSite) return true;
                }
                catch (MatchException matchException) {
                    throw ec_0.c("\u00ff", (Object)matchException, (long)6832950746489402333L, (long)l);
                }
                class_22482 = class_22483;
                callSite = ec_0.c("\u00f2", (long)6833469076037700310L, (long)l);
            }
            catch (MatchException matchException) {
                throw ec_0.c("\u00ff", (Object)matchException, (long)6832950746489402333L, (long)l);
            }
        }
        try {
            if (class_22482 != callSite) return false;
            return true;
        }
        catch (MatchException matchException) {
            throw ec_0.c("\u00ff", (Object)matchException, (long)6832950746489402333L, (long)l);
        }
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

    private boolean lambda$new$0(Boolean bl) {
        Object object;
        block8: {
            block7: {
                CallSite callSite;
                long l;
                block6: {
                    l = o ^ 0x614CB0783EB4L;
                    callSite = ec_0.c("\u00ff", (long)3349439697198272735L, (long)l);
                    try {
                        try {
                            object = ec_0.c("\u00a2", (String)((Object)ec_0.c("\u00a2", (Object)this.e, (long)3348751734685984914L, (long)l)), (Object)ec_0.b("c", (int)2043, (long)(0x25EC124AB318CCF2L ^ l)), (long)3335132003012515221L, (long)l);
                            if (callSite != null) break block6;
                            if (object == false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw ec_0.c("\u00ff", (Object)matchException, (long)3333770339669230413L, (long)l);
                        }
                        object = ec_0.c("\u00a2", (Object)((Boolean)((Object)ec_0.c("\u00a2", (Object)this.g, (long)3348751734685984914L, (long)l))), (long)3336940326660857484L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw ec_0.c("\u00ff", (Object)matchException, (long)3333770339669230413L, (long)l);
                    }
                }
                try {
                    if (callSite != null) break block8;
                    if (object == false) break block7;
                }
                catch (MatchException matchException) {
                    throw ec_0.c("\u00ff", (Object)matchException, (long)3333770339669230413L, (long)l);
                }
                object = 1;
                break block8;
            }
            object = 0;
        }
        return (boolean)object;
    }

    private boolean lambda$new$1(Float f) {
        long l = o ^ 0x335B4386672L;
        return (boolean)ec_0.c("\u00a2", (String)((Object)ec_0.c("\u00a2", (Object)this.a, (long)8556634288226709588L, (long)l)), (Object)ec_0.b("c", (int)10380, (long)(0x2042A83E9098BB4BL ^ l)), (long)8542948731758660947L, (long)l);
    }

    private boolean lambda$onTick$3(class_2338 class_23382) {
        Object object;
        block2: {
            block3: {
                long l = o ^ 0x5DE4DFAC5D08L;
                long l2 = l ^ 0x6C5999AB03FCL;
                CallSite callSite = ec_0.c("\u00ff", (long)5604629684928918371L, (long)l);
                try {
                    Object[] objectArray = new Object[2];
                    objectArray[1] = l2;
                    objectArray[0] = ec_0.c("\u00a2", (Object)ec_0.c("\u00a2", (Object)ec_0.c("O", (Object)b, (long)5618599518749555690L, (long)l), (Object)class_23382, (long)5614408512687652143L, (long)l), (long)5604361338464789656L, (long)l);
                    object = ec_0.c("\u00a2", (Object)this, (Object)objectArray, (long)5614231847919796959L, (long)l);
                    if (callSite != null) break block2;
                    if (object != false) break block3;
                }
                catch (MatchException matchException) {
                    throw ec_0.c("\u00ff", (Object)matchException, (long)5620442709117608177L, (long)l);
                }
                object = 1;
                break block2;
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
            return MethodHandles.lookup().findStatic(ec_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ec_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


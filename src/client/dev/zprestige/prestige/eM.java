/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  net.minecraft.class_1304
 *  net.minecraft.class_1799
 *  net.minecraft.class_310
 *  net.minecraft.class_3965
 *  net.minecraft.class_6880
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.a9;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.dC;
import dev.zprestige.prestige.dF;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dQ;
import dev.zprestige.prestige.dR;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.f5;
import dev.zprestige.prestige.hc;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
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
import net.minecraft.class_1304;
import net.minecraft.class_1799;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_6880;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class eM
extends dV
implements dF {
    private dR a;
    private dQ c;
    private dM d;
    private dM e;
    private dM f;
    private f5 g;
    private int h;
    private int i;
    private static final long k = hc.a(3432071623427397789L, 2877137620883896717L, MethodHandles.lookup().lookupClass()).a(106499827146608L);
    private static final String[] l;
    private static final String[] m;
    private static final Map n;
    private static final long[] o;
    private static final Integer[] p;
    private static final Map q;
    private static final Object[] r;
    private static final String[] s;

    public eM() {
        long l;
        long l2 = l = k ^ 0x312C228A056AL;
        long l3 = l2 ^ 0x22DEE8C083EBL;
        long l4 = l2 ^ 0x77A54124E8D9L;
        this.g = new f5(l3);
        this.h = -1;
        this.i = -1;
        Object[] objectArray = new Object[2];
        objectArray[1] = l4;
        objectArray[0] = this::lambda$new$1;
        eM.d("\u00d1", (Object)this.e, (Object)objectArray, (long)8676589181794331222L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l4;
        objectArray2[0] = this::lambda$new$2;
        eM.d("\u00d1", (Object)this.f, (Object)objectArray2, (long)8676589181794331222L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l4;
        objectArray3[0] = this::lambda$new$0;
        eM.d("\u00d1", (Object)this.d, (Object)objectArray3, (long)8676589181794331222L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        r = new Object[128];
        s = new String[128];
        eM.f();
        n = new HashMap(13);
        long l = k ^ 0x6DAD7447577AL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[3];
        int n = 0;
        String string = "\u0098z\u00a1\u001e\u00e0>c\u0089\u0080\u00b3\u00ff\u00a0b\u0088h+*\u00bfS\u0085\u00c6(0\u001b'\u0099h\u007f\u00ca\u00a6>\u0001 \u001cH\u0090E\u008f\u0091\u00c8w\u0019\u001d\u00ec\u00b8\u009c\t\u0088\u008a\u00eb*\u00cc\u001a\u0003;n\u00db\u009b\f2\u00010Un\u00f4\u0010\u00db\u00ed2\u0082\u00e1\u00a3u'|\u0085\u00b9\u00a2\r\u00b1\u0012S";
        int n2 = "\u0098z\u00a1\u001e\u00e0>c\u0089\u0080\u00b3\u00ff\u00a0b\u0088h+*\u00bfS\u0085\u00c6(0\u001b'\u0099h\u007f\u00ca\u00a6>\u0001 \u001cH\u0090E\u008f\u0091\u00c8w\u0019\u001d\u00ec\u00b8\u009c\t\u0088\u008a\u00eb*\u00cc\u001a\u0003;n\u00db\u009b\f2\u00010Un\u00f4\u0010\u00db\u00ed2\u0082\u00e1\u00a3u'|\u0085\u00b9\u00a2\r\u00b1\u0012S".length();
        int n3 = 32;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = eM.b(byArray3).intern();
            if ((n4 += n3) >= n2) break;
            n3 = string.charAt(n4);
        }
        eM.l = stringArray;
        m = new String[3];
        q = new HashMap(13);
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray5 = byArray5;
            byArray5[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[3];
        int n6 = 0;
        String string2 = "h\u00d2\u00e0$\u00e9\u00df\u00be\u00ed\u00e3\u00e5w\u009c\u00aa\u00bd\u00a0\u00fe\u00df\u00ce7\u00df\u00ac\u0094|\u0090";
        int n7 = "h\u00d2\u00e0$\u00e9\u00df\u00be\u00ed\u00e3\u00e5w\u009c\u00aa\u00bd\u00a0\u00fe\u00df\u00ce7\u00df\u00ac\u0094|\u0090".length();
        int n8 = 0;
        do {
            byte[] byArray6 = string2.substring(n8, n8 += 8).getBytes("ISO-8859-1");
            int n9 = n6++;
            long l2 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
            byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n9] = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
        } while (n8 < n7);
        o = lArray;
        p = new Integer[3];
    }

    /*
     * WARNING - void declaration
     */
    private int e(Object[] objectArray) {
        void var5_4;
        long l = (Long)objectArray[0];
        l = k ^ l;
        CallSite callSite = eM.c("b", (int)7387, (long)(0x3AA458463C9E91D6L ^ l));
        CallSite callSite2 = eM.d("\u00d5", (long)-8667536069539041920L, (long)l);
        while (var5_4 <= eM.c("b", (int)28414, (long)(0x3515EDE9E4A763F1L ^ l))) {
            try {
                if (eM.d("\u00d1", (Object)eM.d("\u00d1", (Object)eM.d("\u00d1", (Object)eM.d("\u00db", (Object)b, (long)-8669351939223728953L, (long)l), (long)-8666482668375805899L, (long)l), (int)var5_4, (long)-8667418555237230321L, (long)l), (long)-8666941227588199958L, (long)l) == eM.d("\u00d2", (long)-8668363087193277050L, (long)l)) {
                    return (int)var5_4;
                }
            }
            catch (MatchException matchException) {
                throw eM.d("\u00d5", (Object)matchException, (long)-8665807047671970547L, (long)l);
            }
            ++var5_4;
            if (callSite2 == null) continue;
        }
        return -1;
    }

    @Override
    public void e(Object[] objectArray) {
        block15: {
            eM eM2;
            block16: {
                class_310 class_3102;
                long l;
                long l2;
                block18: {
                    CallSite callSite;
                    block17: {
                        l2 = (Long)objectArray[0];
                        long l3 = l2;
                        long l4 = l3 ^ 0x7FAB131DDD11L;
                        l = l3 ^ 0x784C77439377L;
                        CallSite callSite2 = eM.d("\u00d5", (long)3995469999391169860L, (long)l2);
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l4;
                        objectArray2[0] = this;
                        eM.d("\u00d1", (Object)eM.d("\u00d2", (long)3997866450093376302L, (long)l2), (Object)objectArray2, (long)3999119222053009351L, (long)l2);
                        callSite = callSite2;
                        try {
                            try {
                                try {
                                    try {
                                        eM2 = this;
                                        if (callSite != null) break block15;
                                        if (eM2.h == -1) break block16;
                                    }
                                    catch (MatchException matchException) {
                                        throw eM.d("\u00d5", (Object)matchException, (long)3997126582331389385L, (long)l2);
                                    }
                                    class_3102 = b;
                                    if (callSite != null) break block17;
                                }
                                catch (MatchException matchException) {
                                    throw eM.d("\u00d5", (Object)matchException, (long)3997126582331389385L, (long)l2);
                                }
                                if (eM.d("\u00db", (Object)class_3102, (long)3995886124352699395L, (long)l2) == null) break block16;
                            }
                            catch (MatchException matchException) {
                                throw eM.d("\u00d5", (Object)matchException, (long)3997126582331389385L, (long)l2);
                            }
                            class_3102 = b;
                        }
                        catch (MatchException matchException) {
                            throw eM.d("\u00d5", (Object)matchException, (long)3997126582331389385L, (long)l2);
                        }
                    }
                    try {
                        try {
                            if (callSite != null) break block18;
                            if (eM.d("\u00db", (Object)class_3102, (long)3998565619181338503L, (long)l2) == null) break block16;
                        }
                        catch (MatchException matchException) {
                            throw eM.d("\u00d5", (Object)matchException, (long)3997126582331389385L, (long)l2);
                        }
                        class_3102 = b;
                    }
                    catch (MatchException matchException) {
                        throw eM.d("\u00d5", (Object)matchException, (long)3997126582331389385L, (long)l2);
                    }
                }
                try {
                    if (eM.d("\u00db", (Object)class_3102, (long)3996514648267150373L, (long)l2) == null) {
                        Object[] objectArray3 = new Object[1];
                        objectArray3[0] = l;
                        eM.d("\u00d1", (Object)this, (Object)objectArray3, (long)3996259924028891956L, (long)l2);
                    }
                }
                catch (MatchException matchException) {
                    throw eM.d("\u00d5", (Object)matchException, (long)3997126582331389385L, (long)l2);
                }
            }
            this.h = -1;
            eM2 = this;
        }
        eM2.i = -1;
    }

    private boolean e(Object[] objectArray) {
        CallSite callSite;
        block5: {
            long l = (Long)objectArray[0];
            long l2 = (l = k ^ l) ^ 0x6BA75891DEB7L;
            CallSite callSite2 = eM.d("\u00d1", (Object)eM.d("\u00d2", (long)-3631603705584810329L, (long)l), (long)-3631278040638922360L, (long)l);
            CallSite callSite3 = eM.d("\u00d5", (long)-3631346030905579604L, (long)l);
            while (eM.d("\u00d1", (Object)callSite2, (long)-3630258677223801285L, (long)l) != false) {
                block7: {
                    int n;
                    block6: {
                        class_1304 class_13042 = (class_1304)eM.d("\u00d1", (Object)callSite2, (long)-3633983334256479210L, (long)l);
                        CallSite callSite4 = eM.d("\u00d1", (Object)eM.d("\u00db", (Object)b, (long)-3630990298552891669L, (long)l), (Object)class_13042, (long)-3632022663535010290L, (long)l);
                        try {
                            try {
                                Object[] objectArray2 = new Object[2];
                                objectArray2[1] = l2;
                                objectArray2[0] = callSite4;
                                callSite = eM.d("\u00d5", (Object)objectArray2, (long)-3632911791857183724L, (long)l);
                                if (callSite3 != null) break block5;
                                if (callSite3 != null) break block6;
                            }
                            catch (MatchException matchException) {
                                throw eM.d("\u00d5", (Object)matchException, (long)-3634200669079220447L, (long)l);
                            }
                            if (callSite == false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw eM.d("\u00d5", (Object)matchException, (long)-3634200669079220447L, (long)l);
                        }
                        n = 1;
                    }
                    return n != 0;
                }
                if (callSite3 == null) continue;
            }
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l2;
            objectArray3[0] = eM.d("\u00d1", (Object)eM.d("\u00db", (Object)b, (long)-3630990298552891669L, (long)l), (long)-3633293524668414671L, (long)l);
            callSite = eM.d("\u00d5", (Object)objectArray3, (long)-3632911791857183724L, (long)l);
        }
        return (boolean)callSite;
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
            throw new RuntimeException("dev/zprestige/prestige/eM" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = eM.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4AA;
        if (m[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])eM.n.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    eM.n.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/eM", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = eM.l[n2].getBytes("ISO-8859-1");
            eM.m[n2] = eM.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return m[n2];
    }

    private dC b(Object[] objectArray) {
        block28: {
            dC dC2;
            CallSite callSite;
            long l;
            block30: {
                block31: {
                    CallSite callSite2;
                    CallSite callSite3;
                    CallSite callSite4;
                    block32: {
                        long l2;
                        long l3;
                        long l4;
                        block33: {
                            long l5;
                            block29: {
                                long l6;
                                block27: {
                                    l = (Long)objectArray[0];
                                    long l7 = l = k ^ l;
                                    l5 = l7 ^ 0x201C3AB1C93EL;
                                    l4 = l7 ^ 0x22C7B4FDED21L;
                                    l6 = l7 ^ 0x264CD3B590D1L;
                                    l3 = l7 ^ 0x65D64509D59EL;
                                    long l8 = l7 ^ 0x20E37A060AA5L;
                                    l2 = l7 ^ 0x443E21F9BC5DL;
                                    callSite4 = eM.d("\u00d5", (long)-960512744819779427L, (long)l);
                                    try {
                                        try {
                                            Object[] objectArray2 = new Object[1];
                                            objectArray2[0] = l8;
                                            callSite = eM.d("\u00d1", (Object)this, (Object)objectArray2, (long)-961249016483839316L, (long)l);
                                            if (callSite4 != null) break block27;
                                            if (callSite == false) break block28;
                                        }
                                        catch (MatchException matchException) {
                                            throw eM.d("\u00d5", (Object)matchException, (long)-963219438547832816L, (long)l);
                                        }
                                        callSite = eM.d("\u00d5", (long)eM.d("\u00d1", (Object)eM.d("\u00d1", (Object)b, (long)-960209610176996706L, (long)l), (long)-959848089184524302L, (long)l), (int)1, (long)-960420102325734677L, (long)l);
                                    }
                                    catch (MatchException matchException) {
                                        throw eM.d("\u00d5", (Object)matchException, (long)-963219438547832816L, (long)l);
                                    }
                                }
                                try {
                                    try {
                                        if (callSite4 != null) break block29;
                                        if (callSite != 1) break block28;
                                    }
                                    catch (MatchException matchException) {
                                        throw eM.d("\u00d5", (Object)matchException, (long)-963219438547832816L, (long)l);
                                    }
                                    Object[] objectArray3 = new Object[2];
                                    objectArray3[1] = l6;
                                    objectArray3[0] = this.c;
                                    callSite = eM.d("\u00d1", (Object)this.g, (Object)objectArray3, (long)-961112524323313732L, (long)l);
                                }
                                catch (MatchException matchException) {
                                    throw eM.d("\u00d5", (Object)matchException, (long)-963219438547832816L, (long)l);
                                }
                            }
                            try {
                                if (callSite4 != null) break block30;
                                if (callSite == false) break block31;
                            }
                            catch (MatchException matchException) {
                                throw eM.d("\u00d5", (Object)matchException, (long)-963219438547832816L, (long)l);
                            }
                            callSite3 = eM.d("\u00d1", (Object)eM.d("\u00db", (Object)b, (long)-959991064611210790L, (long)l), (long)-963346689464048738L, (long)l);
                            try {
                                if (eM.d("\u00d1", (Object)((Boolean)((Object)eM.d("\u00d1", (Object)this.d, (long)-960675775811153535L, (long)l))), (long)-961054053414417271L, (long)l) != false) {
                                    eM.d("\u00d1", (Object)eM.d("\u00db", (Object)b, (long)-959991064611210790L, (long)l), (float)90.0f, (long)-960636042325395123L, (long)l);
                                }
                            }
                            catch (MatchException matchException) {
                                throw eM.d("\u00d5", (Object)matchException, (long)-963219438547832816L, (long)l);
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            callSite2 = eM.d("\u00db", (Object)b, (long)-962540007969641531L, (long)l);
                                            if (callSite4 != null) break block32;
                                            if (callSite2 == null) break block33;
                                        }
                                        catch (MatchException matchException) {
                                            throw eM.d("\u00d5", (Object)matchException, (long)-963219438547832816L, (long)l);
                                        }
                                        callSite2 = eM.d("\u00d1", (Object)eM.d("\u00db", (Object)b, (long)-962540007969641531L, (long)l), (long)-962706848378209074L, (long)l);
                                        if (callSite4 != null) break block32;
                                    }
                                    catch (MatchException matchException) {
                                        throw eM.d("\u00d5", (Object)matchException, (long)-963219438547832816L, (long)l);
                                    }
                                    if (callSite2 != eM.d("\u00d2", (long)-963414387696936158L, (long)l)) break block33;
                                }
                                catch (MatchException matchException) {
                                    throw eM.d("\u00d5", (Object)matchException, (long)-963219438547832816L, (long)l);
                                }
                                Object[] objectArray4 = new Object[2];
                                objectArray4[1] = l5;
                                objectArray4[0] = (class_3965)eM.d("\u00db", (Object)b, (long)-962540007969641531L, (long)l);
                                eM.d("\u00d5", (Object)objectArray4, (long)-962956812035392754L, (long)l);
                            }
                            catch (MatchException matchException) {
                                throw eM.d("\u00d5", (Object)matchException, (long)-963219438547832816L, (long)l);
                            }
                        }
                        Object[] objectArray5 = new Object[2];
                        objectArray5[1] = l3;
                        objectArray5[0] = eM.d("\u00d2", (long)-962014407325524840L, (long)l);
                        eM.d("\u00d5", (Object)objectArray5, (long)-959770261344864744L, (long)l);
                        Object[] objectArray6 = new Object[1];
                        objectArray6[0] = l2;
                        eM.d("\u00d1", (Object)this.c, (Object)objectArray6, (long)-959420801508006799L, (long)l);
                        Object[] objectArray7 = new Object[1];
                        objectArray7[0] = l4;
                        eM.d("\u00d1", (Object)this.g, (Object)objectArray7, (long)-961777467072525212L, (long)l);
                        callSite2 = eM.d("\u00d1", (Object)this.d, (long)-960675775811153535L, (long)l);
                    }
                    try {
                        try {
                            callSite = eM.d("\u00d1", (Object)((Boolean)((Object)callSite2)), (long)-961054053414417271L, (long)l);
                            if (callSite4 != null) break block30;
                            if (callSite == false) break block31;
                        }
                        catch (MatchException matchException) {
                            throw eM.d("\u00d5", (Object)matchException, (long)-963219438547832816L, (long)l);
                        }
                        eM.d("\u00d1", (Object)eM.d("\u00db", (Object)b, (long)-959991064611210790L, (long)l), (float)callSite3, (long)-960636042325395123L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw eM.d("\u00d5", (Object)matchException, (long)-963219438547832816L, (long)l);
                    }
                }
                callSite = eM.d("\u00d1", (Object)((Boolean)((Object)eM.d("\u00d1", (Object)this.d, (long)-960675775811153535L, (long)l))), (long)-961054053414417271L, (long)l);
            }
            try {
                dC2 = callSite != false ? new dC((float)eM.d("\u00d1", (Object)eM.d("\u00db", (Object)b, (long)-959991064611210790L, (long)l), (long)-961602598102556156L, (long)l), 90.0f) : null;
            }
            catch (MatchException matchException) {
                throw eM.d("\u00d5", (Object)matchException, (long)-963219438547832816L, (long)l);
            }
            return dC2;
        }
        return null;
    }

    private dC c(Object[] objectArray) {
        class_310 class_3102;
        CallSite callSite;
        long l;
        long l2;
        long l3;
        block49: {
            long l4;
            block50: {
                CallSite callSite2;
                CallSite callSite3;
                long l5;
                block40: {
                    long l6;
                    block41: {
                        block47: {
                            Object object;
                            long l7;
                            block48: {
                                block46: {
                                    int n;
                                    long l8;
                                    block42: {
                                        block45: {
                                            block43: {
                                                CallSite callSite4;
                                                long l9;
                                                block44: {
                                                    block38: {
                                                        long l10;
                                                        block39: {
                                                            l3 = (Long)objectArray[0];
                                                            long l11 = l3 = k ^ l3;
                                                            l5 = l11 ^ 0xCB3C487A6CBL;
                                                            l2 = l11 ^ 0xE684ACB82D4L;
                                                            l8 = l11 ^ 0x49743CD395BL;
                                                            long l12 = l11 ^ 0x640DFBA92DD8L;
                                                            l6 = l11 ^ 0xAE32D83FF24L;
                                                            l4 = l11 ^ 0x4979BB3FBA6BL;
                                                            l10 = l11 ^ 0xC4C84306550L;
                                                            l = l11 ^ 0x6891DFCFD3A8L;
                                                            l9 = l11 ^ 0xAD2DCFB3AABL;
                                                            l7 = l11 ^ 0x1A19DE8F68EEL;
                                                            Object[] objectArray2 = new Object[1];
                                                            objectArray2[0] = l12;
                                                            CallSite callSite5 = eM.d("\u00d1", (Object)this, (Object)objectArray2, (long)-7109304510529948785L, (long)l3);
                                                            callSite3 = eM.d("\u00d5", (long)-7107034183381387416L, (long)l3);
                                                            try {
                                                                try {
                                                                    callSite2 = callSite5;
                                                                    if (callSite3 != null) break block38;
                                                                    if (callSite2 != false) break block39;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw eM.d("\u00d5", (Object)matchException, (long)-7109818588169723931L, (long)l3);
                                                                }
                                                                Object[] objectArray3 = new Object[1];
                                                                objectArray3[0] = l8;
                                                                eM.d("\u00d1", (Object)this, (Object)objectArray3, (long)-7108388984504350440L, (long)l3);
                                                                return null;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw eM.d("\u00d5", (Object)matchException, (long)-7109818588169723931L, (long)l3);
                                                            }
                                                        }
                                                        Object[] objectArray4 = new Object[1];
                                                        objectArray4[0] = l10;
                                                        callSite2 = eM.d("\u00d1", (Object)this, (Object)objectArray4, (long)-7107285273125327527L, (long)l3);
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (callSite3 != null) break block40;
                                                                        if (callSite2 != false) break block41;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw eM.d("\u00d5", (Object)matchException, (long)-7109818588169723931L, (long)l3);
                                                                    }
                                                                    object = this.h;
                                                                    n = -1;
                                                                    if (callSite3 != null) break block42;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw eM.d("\u00d5", (Object)matchException, (long)-7109818588169723931L, (long)l3);
                                                                }
                                                                if (object == n) break block43;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw eM.d("\u00d5", (Object)matchException, (long)-7109818588169723931L, (long)l3);
                                                            }
                                                            callSite4 = eM.d("\u00d2", (long)-7108876087038219678L, (long)l3);
                                                            if (callSite3 != null) break block44;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw eM.d("\u00d5", (Object)matchException, (long)-7109818588169723931L, (long)l3);
                                                        }
                                                        if (callSite4 == null) break block43;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw eM.d("\u00d5", (Object)matchException, (long)-7109818588169723931L, (long)l3);
                                                    }
                                                    callSite4 = eM.d("\u00d2", (long)-7108876087038219678L, (long)l3);
                                                }
                                                try {
                                                    try {
                                                        Object[] objectArray5 = new Object[1];
                                                        objectArray5[0] = l9;
                                                        object = eM.d("\u00d1", (Object)callSite4, (Object)objectArray5, (long)-7106763272973384743L, (long)l3);
                                                        if (callSite3 != null) break block45;
                                                        if (object == 0) break block43;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw eM.d("\u00d5", (Object)matchException, (long)-7109818588169723931L, (long)l3);
                                                    }
                                                    return null;
                                                }
                                                catch (MatchException matchException) {
                                                    throw eM.d("\u00d5", (Object)matchException, (long)-7109818588169723931L, (long)l3);
                                                }
                                            }
                                            object = this.h;
                                        }
                                        try {
                                            if (callSite3 != null) break block46;
                                            n = -1;
                                        }
                                        catch (MatchException matchException) {
                                            throw eM.d("\u00d5", (Object)matchException, (long)-7109818588169723931L, (long)l3);
                                        }
                                    }
                                    try {
                                        if (object != n) {
                                            Object[] objectArray6 = new Object[1];
                                            objectArray6[0] = l8;
                                            eM.d("\u00d1", (Object)this, (Object)objectArray6, (long)-7108388984504350440L, (long)l3);
                                            return null;
                                        }
                                    }
                                    catch (MatchException matchException) {
                                        throw eM.d("\u00d5", (Object)matchException, (long)-7109818588169723931L, (long)l3);
                                    }
                                    Object[] objectArray7 = new Object[2];
                                    objectArray7[1] = l6;
                                    objectArray7[0] = this.c;
                                    object = eM.d("\u00d1", (Object)this.g, (Object)objectArray7, (long)-7107702827988694967L, (long)l3);
                                }
                                try {
                                    try {
                                        if (callSite3 != null) break block47;
                                        if (object != 0) break block48;
                                    }
                                    catch (MatchException matchException) {
                                        throw eM.d("\u00d5", (Object)matchException, (long)-7109818588169723931L, (long)l3);
                                    }
                                    return null;
                                }
                                catch (MatchException matchException) {
                                    throw eM.d("\u00d5", (Object)matchException, (long)-7109818588169723931L, (long)l3);
                                }
                            }
                            Object[] objectArray8 = new Object[1];
                            objectArray8[0] = l7;
                            object = eM.d("\u00d1", (Object)this, (Object)objectArray8, (long)-7109633410573798236L, (long)l3);
                        }
                        Object[] objectArray9 = new Object[1];
                        objectArray9[0] = l2;
                        eM.d("\u00d1", (Object)this.g, (Object)objectArray9, (long)-7110558384048528495L, (long)l3);
                        Object[] objectArray10 = new Object[1];
                        objectArray10[0] = l;
                        eM.d("\u00d1", (Object)this.c, (Object)objectArray10, (long)-7108264115368834172L, (long)l3);
                        return null;
                    }
                    Object[] objectArray11 = new Object[2];
                    objectArray11[1] = l6;
                    objectArray11[0] = this.c;
                    callSite2 = eM.d("\u00d1", (Object)this.g, (Object)objectArray11, (long)-7107702827988694967L, (long)l3);
                }
                try {
                    if (callSite2 == false) {
                        return new dC((float)eM.d("\u00d1", (Object)eM.d("\u00db", (Object)b, (long)-7108859884397210065L, (long)l3), (long)-7110445868134216207L, (long)l3), 90.0f);
                    }
                }
                catch (MatchException matchException) {
                    throw eM.d("\u00d5", (Object)matchException, (long)-7109818588169723931L, (long)l3);
                }
                callSite = eM.d("\u00d1", (Object)eM.d("\u00db", (Object)b, (long)-7108859884397210065L, (long)l3), (long)-7109866709350871957L, (long)l3);
                try {
                    try {
                        try {
                            try {
                                eM.d("\u00d1", (Object)eM.d("\u00db", (Object)b, (long)-7108859884397210065L, (long)l3), (float)90.0f, (long)-7107227545225423176L, (long)l3);
                                class_3102 = b;
                                if (callSite3 != null) break block49;
                                if (eM.d("\u00db", (Object)class_3102, (long)-7110776607498288080L, (long)l3) == null) break block50;
                            }
                            catch (MatchException matchException) {
                                throw eM.d("\u00d5", (Object)matchException, (long)-7109818588169723931L, (long)l3);
                            }
                            class_3102 = b;
                            if (callSite3 != null) break block49;
                        }
                        catch (MatchException matchException) {
                            throw eM.d("\u00d5", (Object)matchException, (long)-7109818588169723931L, (long)l3);
                        }
                        if (eM.d("\u00d1", (Object)eM.d("\u00db", (Object)class_3102, (long)-7110776607498288080L, (long)l3), (long)-7109235927286623429L, (long)l3) != eM.d("\u00d2", (long)-7109935762843061033L, (long)l3)) break block50;
                    }
                    catch (MatchException matchException) {
                        throw eM.d("\u00d5", (Object)matchException, (long)-7109818588169723931L, (long)l3);
                    }
                    Object[] objectArray12 = new Object[2];
                    objectArray12[1] = l5;
                    objectArray12[0] = (class_3965)eM.d("\u00db", (Object)b, (long)-7110776607498288080L, (long)l3);
                    eM.d("\u00d5", (Object)objectArray12, (long)-7108985551346199301L, (long)l3);
                }
                catch (MatchException matchException) {
                    throw eM.d("\u00d5", (Object)matchException, (long)-7109818588169723931L, (long)l3);
                }
            }
            Object[] objectArray13 = new Object[2];
            objectArray13[1] = l4;
            objectArray13[0] = eM.d("\u00d2", (long)-7110321443778612371L, (long)l3);
            eM.d("\u00d5", (Object)objectArray13, (long)-7108058279280354835L, (long)l3);
            class_3102 = b;
        }
        eM.d("\u00d1", (Object)eM.d("\u00db", (Object)class_3102, (long)-7108859884397210065L, (long)l3), (float)callSite, (long)-7107227545225423176L, (long)l3);
        Object[] objectArray14 = new Object[1];
        objectArray14[0] = l;
        eM.d("\u00d1", (Object)this.c, (Object)objectArray14, (long)-7108264115368834172L, (long)l3);
        Object[] objectArray15 = new Object[1];
        objectArray15[0] = l2;
        eM.d("\u00d1", (Object)this.g, (Object)objectArray15, (long)-7110558384048528495L, (long)l3);
        return new dC((float)eM.d("\u00d1", (Object)eM.d("\u00db", (Object)b, (long)-7108859884397210065L, (long)l3), (long)-7110445868134216207L, (long)l3), 90.0f);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/eM" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = eM.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xAAE;
        if (p[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = o[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])q.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    q.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/eM", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            eM.p[n2] = n3;
        }
        return p[n2];
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = eM.m(l, l2);
            object = r[n];
            try {
                if (!(object instanceof String)) break block2;
                eM.r[n] = clazz = Class.forName(s[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = eM.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = eM.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = eM.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = eM.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private boolean f(Object[] objectArray) {
        int n;
        block8: {
            block7: {
                CallSite callSite;
                long l;
                block6: {
                    l = (Long)objectArray[0];
                    l = k ^ l;
                    CallSite callSite2 = eM.d("\u00d5", (long)-8857817100140384476L, (long)l);
                    try {
                        try {
                            callSite = eM.d("\u00db", (Object)b, (long)-8857373414524662173L, (long)l);
                            if (callSite2 != null) break block6;
                            if (callSite == null) break block7;
                        }
                        catch (MatchException matchException) {
                            throw eM.d("\u00d5", (Object)matchException, (long)-8856097776449976407L, (long)l);
                        }
                        callSite = eM.d("\u00db", (Object)b, (long)-8857373414524662173L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw eM.d("\u00d5", (Object)matchException, (long)-8856097776449976407L, (long)l);
                    }
                }
                try {
                    if (eM.d("\u00d1", (Object)eM.d("\u00d1", (Object)callSite, (long)-8854152171280038048L, (long)l), (long)-8854963871478719666L, (long)l) != eM.d("\u00d2", (long)-8856392250888716510L, (long)l)) break block7;
                    n = 1;
                    break block8;
                }
                catch (MatchException matchException) {
                    throw eM.d("\u00d5", (Object)matchException, (long)-8856097776449976407L, (long)l);
                }
            }
            n = 0;
        }
        return n != 0;
    }

    private static void f() {
        Object[] objectArray = r;
        r[0] = "h'I\"3M~'Lx ZilO~,Nx+Xig\\D";
        objectArray[1] = "c,J&I5\u0016\fA)Xzw\u0002J\"\\ \u0003";
        objectArray[2] = Void.TYPE;
        eM.s[2] = "java/lang/Void";
        objectArray[3] = "\u0005I,j+H\u0013I)08_\u0004\u0002*64K\u0015E=!\u007f],";
        objectArray[4] = "M.|oyFF!m \u001aKS,bK/IB?~g8D";
        objectArray[5] = "\b\u0014~\u0010W>}4u\u001fFq\u001c:~\u0014B+h";
        objectArray[6] = Boolean.TYPE;
        eM.s[6] = "java/lang/Boolean";
        objectArray[7] = "``\"B\u001bJv`'\u0018\b]a+$\u001e\u0004Ipl3\tO^O";
        objectArray[8] = "\u0016Vd\u000f\u0005k\u001dYu@de\u0016Rq\u001a";
        objectArray[9] = "\u0011Ti\u0007B6\u001a[xH?.\t\\q\u0001";
        objectArray[10] = "m-n\b^|\u0018\re\u0007O3y\u0003n\fKi\r";
        objectArray[11] = "\u0018IODJ\u001fmiDK[P\u0010qWLR\u0019x";
        objectArray[12] = ";z\u007fAdz;zh\u001dhu!1h\u0003h`&@8^9";
        objectArray[13] = "couk\u0001qcob7\r~y$b)\rk~U3vU";
        objectArray[14] = "fQ\u0001\u0015C{fQ\u0016IOt|\u001a\u0016WOa{kB\u000f\u0018";
        objectArray[15] = "#;rOv>5;w\u0015e)\"pt\u0013i=37c\u0004\"-+7a\u000fx`\u0017,a\u0012x' ;";
        objectArray[16] = "/V)4%\n9V,n6\u001d.\u001d/h:\t?Z8\u007fq\u0018\u0012";
        objectArray[17] = "p\u001c\u0002`X\u0010f\u001c\u0007:K\u0007qW\u0004<G\u0013`\u0010\u0013+\f\u0006!";
        objectArray[18] = "=fHy\u0002 HFCv\u0013o)HH}\u00175]";
        objectArray[19] = "YC\f\u0003Mg,c\u0007\f\\(Mm\f\u0007Xr9";
        objectArray[20] = "-v_zR\u0018;vZ A\u000f,=Y&M\u001b=zN1\u0006\u000b&";
        objectArray[21] = "\u0003@J\u001cipv`A\u0013x?\u0017nJ\u0018|ec";
        objectArray[22] = "S\u0007Wf0\u001cS\u0007@:<\u0013IL@$<\u0006N=\u0011{dQ^\u000eB;.*\u000fV\u0013";
        objectArray[23] = Float.TYPE;
        eM.s[23] = "java/lang/Float";
        objectArray[24] = "E/cR\u001a|S/f\b\tkDde\u000e\u0005\u007fU#r\u0019Nhp";
        objectArray[25] = "9o\u001bY2[LO\u0010V#\u0014-A\u001b]'NY";
        objectArray[26] = "\u0014\u001fuS\f@a?~\\\u001d\u000f\u00001uW\u0019Ut";
        objectArray[27] = ">\u000e\u001c/\u0006.>\u000e\u000bs\n!$E\u000bm\n4#4Y3]\u007f";
        objectArray[28] = "K1)+\u0016,>\u0011\"$\u0007c_\u001f)/\u00039+";
        objectArray[29] = "j\u000eOf\b8\u001f.Di\u0019w~ Ob\u001d-\n";
        objectArray[30] = "\u0017\f\u001f\u0012q8b,\u0014\u001d`w\u0003\"\u001f\u0016d-w";
        objectArray[31] = "%I^4\tu%IIh\u0005z?\u0002Iv\u0005o8s\u001b\"T.";
        objectArray[32] = "\u000eZ&\"NR\u000eZ1~B]\u0014\u00111`BH\u0013`c;\u001a\t";
        objectArray[33] = "pfq X\u0015pff|T\u001aj-fbT\u000fm\\49\fE";
        objectArray[34] = "V0r&xMV0eztBL{edtWK\n7>#\u0015";
        objectArray[35] = Integer.TYPE;
        eM.s[35] = "java/lang/Integer";
        objectArray[36] = "Wv\u0019\nFiI~\u0003E!hXe\u000e\u001f\u0007n";
        objectArray[37] = "\"X_^D\tWxTQUF6v_ZQ\u001cB";
        objectArray[38] = "Mp\u0007%[\\Mp\u0010yWSW;\u0010gWFPJB8\u0006\u0001";
        objectArray[39] = "czn{\f\u001eczy'\u0000\u0011y1y9\u0000\u0004~@#gVC";
        objectArray[40] = "\u0004/M7so\u0012/Hm`x\u0005dKkll\u0014#\\|'{-";
        objectArray[41] = "M\u0007pBcN8'{Mr\u0001Y)pFv[-";
        objectArray[42] = "\u001c\".ZG=\u00197%ZL&\u0015'g3g\f$";
        objectArray[43] = Long.TYPE;
        eM.s[43] = "java/lang/Long";
        objectArray[44] = "mBS_@*mBD\u0003L%w\tD\u001dL0px\u0016A\u0019r";
        objectArray[45] = "xH:P9dsG+\u001fUg}E)Py";
        objectArray[46] = "s%_\u0004\u0013oe%Z^\u0000xrnYX\flc)NOG|e";
        objectArray[47] = "\u0004\u0017\u000bP\\\u0002q7\u0000_MM\u00109\u000bTI\u0017d";
        objectArray[48] = "+%\u00166\u0010=^\u0005\u001d9\u0001r?\u000b\u00162\u0005(K";
        objectArray[49] = "(\u001a5D\u0012I]:>K\u0003\u0006<45@\u0007\\H";
        objectArray[50] = "jb/N,\r\u001fB$A=B~L/J9\u0018\n";
        objectArray[51] = "c8Ol\u00008\u0016\u0018Dc\u0011ww\u0016Oh\u0015-\u0003";
        objectArray[52] = "' #\u001a9O#=#\u000b$O`2l\u001c#S:=aA8D$1n\u001b$\b\u00016g\n4R|\u001dc\u001b\u001aG>pH\u0001#T7";
        objectArray[53] = "f^8\r 2xV\"B]\"x";
        objectArray[54] = "=v[n\nk=vL2\u0006d'=L,\u0006q L\u0016sW6";
        objectArray[55] = "1%P\u0013qP1%GO}_+nGQ}J,\u001f\u0012\u0005$\t";
        objectArray[56] = ";4\u001d,lx;4\np`w!\u007f\nn`b&\u000e\\13 ";
        objectArray[57] = "}b?xj\u0000}b($f\u000fg)(:f\u001a`Xzn>Z";
        objectArray[58] = "\u001cg\bfz{\u001cg\u001f:vt\u0006,\u001f$va\u0001]J{/";
        objectArray[59] = "\u0014a\bZ\u000b\u001a\u0014a\u001f\u0006\u0007\u0015\u000e*\u001f\u0018\u0007\u0000\t[HGQ";
        objectArray[60] = "\u0002|#\r\u000f\u0010\u0014|&W\u001c\u0007\u00037%Q\u0010\u0013\u0012p2F[\u0004\"";
        objectArray[61] = "m]#j\u000b]\u0018}(e\u001a\u0012ys#n\u001eH\r";
        objectArray[62] = "-\u0017^j\u001e\u0005X7Ue\u000fJ99^n\u000b\u0010M";
        objectArray[63] = "]=&\u0005U\u001e(\u001d-\nDQI\u0013&\u0001@\u000b=";
        objectArray[64] = "8\u0012\u001b928.\u0012\u001ec!/9Y\u001de-;(\u001e\nrf,\u001f";
        objectArray[65] = "(R[s\\\u001e]rP|MQ<|[wI\u000bH";
        objectArray[66] = "\r8\u0011\u0003wIMz\u001d\u0012\u001cW7=GM-LSk\u0016BbO7=\u0012\u0011`\fOg\t@%5";
        objectArray[67] = ",!\u0017:\u0004;m7\b 8oq;\u001a7T]&}D`\u0003\na?\u0017l\u00040q<E98";
        objectArray[68] = "{f\u0007nIt:p\u0018tu+*m\u000eh\"|t:V\u0004D5$1\r8\u0011\"5a";
        objectArray[69] = "o\"O\u0010ph:2O\u0006@p\u00061KU-t< \u0011\u0000\"";
        objectArray[70] = "\u001d\u000bW(A+\r\b\u0005}}t\r\u000fZs\u0011F\\O\u000b,}l\r\f\u0007f\u0016|\u0012H]\u0014";
        objectArray[71] = "\u0014\u000fR\u0001\u001b=\u0013\u0002RG';\u001c\u0003[\u001fK\tNN\u000bF'bN\u0007I\u0019Jb\u0000\u001cXx";
        objectArray[72] = "voi]Y\u0006ua(d\b?t1$U\u0018[\"`+\u001a\u001b?tdx\u0018XG.\u007f)]a";
        objectArray[73] = "\u001br\u0012\u0010\u007f\u000b\u001ac\u0017KD\u0004v!YKu\u0016\u0012w\bD:\u0015v$W\u00026\u000e\u001b$\u0019\u0019'o";
        objectArray[74] = "iaA%+d21\u0017mPmm1Cs\u000736l\u0018\u001f5eu3\u0018gohw5";
        objectArray[75] = "*H\u001a\u0000MI-E\u001aFqO\"D\u0013\u001e\u001d}r\bMDN*v\u0001\u0014B\u000fRt\tK\u0016\f*";
        objectArray[76] = "\u00037\u0011\"vYSwD'\u001fUc5\u0019n.F\u0007cHaaEc5L2c\u0006\u001boWc&?";
        objectArray[77] = "\u0017LR\u00009>VZM\u001a\u0005aFG[\u0006R6\u0018\u0017\u0002j<2F\u0016\u0002Qaq]S]";
        objectArray[78] = "y\u001b!6\\d|N495dh\n\u000b6Ex\u0001Mr#GelM<8V\u0004";
        objectArray[79] = "oDd\u0017+;i\u0006mS\"Y3\u0013aO)5\u0001B%\u0015tdVG&\u00166'k\u001c$F >VB\"W<8;BlL-Y";
        objectArray[80] = "$n`enh%m3c.\u001as4o}=M,l: Q#&lzglx$<l~";
        objectArray[81] = "\u0000hs^p\u001fA~lDLK]r~S y\t3 \u0005L\u0012\u000fvlU!\u0012Am}4";
        objectArray[82] = "\u001do\"pU\u0012]-.a>\u0000'jt>\u000f\u0017C<%1@\u0014'ozwL\u000fJo4l]n";
        objectArray[83] = "\u0004RFX\u0010~N\b\u0003P|n\u001f[ZU+<O\f\u0004\u0005|z\u001aN_U\u00020@\u000bW";
        objectArray[84] = "_S\u0017\u001e{RIG\u000f\u0017\u001c\b4\u0007^J-\u001bPQ\u000fEb\u00184\u0002P\u0003n\u0003Y\u0002\u001e\u0018\u007fb";
        objectArray[85] = "\t;5*qN\\,$z\u0016\u0017U7:|z%\u0006rc+\u0016\u000bCr3{y\u0011\u0003!d\u001bs\u0002Q2fxt\u000fQtZ";
        objectArray[86] = "1T)G1Qq\u0016%VZF\u000bQ\u007f\tkTo\u0007.\u0006$W\u000bQ~G'Rm\u0001(\u0004$R\u000b";
        objectArray[87] = "a{\u0019c1$t?\u0000zTwxd\u0007q={Aj\u0007a9\u001d#<\u001bn5p#r\u0000\u007fT";
        objectArray[88] = "uh~\u0002-\u0000?2;\nA\u001fsa|\n=\u0019u\f~\t-\u0013fl{\\8\u001c\u000f";
        objectArray[89] = "?HOfoM!\n\n8\u0004\u00105\u000b\u00140h\"eKOg\u0004\u0012#\u0019\u001ali\t9\u001e\u0019Wa\u00051\u000eH4f\b1Ht";
        objectArray[90] = "N>.><o\b}+=\u0004bs=vz=w\u0011m&tj\u000b";
        objectArray[91] = "Z9\fDeUKcYK\u001c\u00060c\u0005\u0018-\u0016T5T\u0017b\u00150f\u000bQn\u000e]fEJ\u007fo";
        objectArray[92] = "T\u0014.@I\u0004\u000b\u00128\u0002;P\u0013\u0004;\u001e@=TG-CG_\u0004\u0017#\u0014;\u0001U\u0001 \u001bV\u0001\u001b\u001a1z";
        objectArray[93] = "(& A\u0010m}11\u0011w4t*/\u0017\u001b\u0006\"hsMHQvi3\u000f\u0018)%*.\u001bwh};3I\u000f2fjvp";
        objectArray[94] = "b5\u0017A\u0019d\u007f2X\u0015t4z=\u0017?\u0019'[4\u0015\u000b\u0019\u0011c/\u0014\u0017\u0012[c>\u0017M\u00060s!S\u0017t<e=\u0006K\u0019'\u007f:\u0005p\u0013 p=S\u001d\b:w>h";
        objectArray[95] = "9{H%\u0001O:u\t\u001cSv=jV FKno\r\"9";
        objectArray[96] = ";`;,%azv$6\u0019>jk2*Ni48kF(2jdf \u007f1ql";
        objectArray[97] = "\n\u001bTGz\u000bJYXV\u0011\u001e0\u001e\u0002\t \u000eTHS\u0006o\r0\u001b\f@c\u0016]\u001bB[rw";
        objectArray[98] = "W\u001f\n\rM\u001d\u0011\u001d\u001fG,\u000e(\u001dGM\u001d\u0019LK\u0016BR\u001a(\u0018I\u0004^\u0001E\u0018\u0007\u001fO`";
        objectArray[99] = "(()!Z\u0006i>6;fYy# '1\u000e&~{K_\u000bc0 q\u001bMi?%";
        objectArray[100] = "\u0004u!3]AW/*h\u0019\"R <HKS=s~t\u001f^_#.zH\"";
        objectArray[101] = "V$E\u0019X=\u0016fI\b3,l!\u0013W\u00028\bwBXM;l\u007fY\b]z\u0001dC\u000f^A";
        objectArray[102] = "~\u0016z^6zy\u001bz\u0018\n|v\u001as@fN$W+\u0016\n|}\u001f|\u0018r&p\u001dz'";
        objectArray[103] = "(\u00159Yd\u0011/\u00189\u001fX\u0017 \u00190G4%rTn\u0018XNr\u001d\"A5N<\u00063 ";
        objectArray[104] = "\\:_@zK\f`\u000fG;v\u0004\u007f[@*\n\u0002y6B)\u001a\bjVG|\u000f\u0007\u0003";
        objectArray[105] = "@\u0006.\u001c\u0011\u0010\u001e\u0019v\u0014(\u000e@\u0015-\u0000\u007f]\u0011@ylI\u001eF\bp\u001c\u0017\u0001\u001e\u0000";
        objectArray[106] = " \u000e~N,\u001dp\u000b`S:xw38\u0000vI`WnQy\u0006c38U*\u0004 KbN{A\u0019";
        objectArray[107] = "IF'\u00120t\u001cQ6BW-\u0015J(D;\u001fF\u000et\u001cW-\b_1\u001f4*\u0005_w#";
        objectArray[108] = "seK\u001f!G&rZOF\u001e/iDI*,y,\u0019\u0012v{%*\u001f\u001f-C;hZAF";
        objectArray[109] = "\u0013}cZ\u0017k\u0005i{Sp2x)*\u000eA\"\u001c\u007f{\u0001\u000e!x)\u007fR\fb\u0000sd\u0003I[";
        objectArray[110] = "^oHmK?\\g\u00179HG\u0002;S6R+0k\u0010k\u000evgo\u0016?O~Z?LoH?g";
        objectArray[111] = "mlMe\u000558{\\5bl1`B3\u000e^g\"\u001ei^\t3#^+\rq``C?b";
        objectArray[112] = "`\u000f;NE_ M7_.OZ\nm\u0000\u001fZ>\\<\u000fPYZT'_@\u00187O=XC#";
        objectArray[113] = "\u001d^\u0013l\u0001`\u0018\u000b\u0006chf\bD\u0003\u0001V>\u001a\r\u0003c\u0006n\u0014Z\u007f";
        objectArray[114] = "s\u001aFPGT3XJA,BI\u001f\u0010\u001e\u001dQ-IA\u0011RRI\u001f\u0011PQW/OG\u0013RWI";
        objectArray[115] = "$PCm_\"d\u0012O|42\u001eU\u0015#\u0005'z\u0003D,J$\u001eP\u001bjF?sPUqW^";
        objectArray[116] = "?\u007fz\u001de\r,ckE\u0017\f0p\u007fL@[j&! y\u00000 iOj\u001c!x";
        objectArray[117] = "aQTk\u001f;1TJv\t^5l\u0012%Eo!\bDtJ \"l\u0012p\u0019\"a\u0014HkHgX";
        objectArray[118] = "\u00025,%8vBw 4Sc82\"dkdZnt>n\n\u0003`ub=h_6/gS";
        objectArray[119] = "\u0015;\u0010\u000e\u0014O@,\u0001^s\u0016I7\u001fX\u001f$\u001fuC\u0002NsKt\u0003@\u001c\u000b\u00187\u001eTs";
        objectArray[120] = "bK8a\u0005\\$I-+dH\u001dIu!UXy\u001f$.\u001a[\u001dI }\u0018\u0018e\u0013;,]!";
        objectArray[121] = "[R~\u0014[+\u000eB~\u0002k)2\u0012$\u0016\u0014%WB!\b\t3";
        objectArray[122] = "\u000fU#PDz\u000eD&\u000b\u007fwb\u0006h\u000bNg\u0006P9\u0004\u0001db\u0003fB\r\u007f\u000f\u0003(Y\u001c\u001e";
        objectArray[123] = "+ \u000bj\u0000.~7\u001a:gww,\u0004<\u000bE$h[jgwj9\u001dg\u0004pg9[[";
        objectArray[124] = ";4\u0001i3\"}6\u0014#R6D6L)c& `\u001d&,%Dh\u0006v<d)s\u001cq?_";
        objectArray[125] = "UnW+E_\u0016l\u0007 y\f/*V{H\u001cK|\u0007t\u0007\u001f/i\u001az\u0018Y\u0015*\u0018*\u0013e";
        objectArray[126] = "(R\u0000S(\b\u007fQ\u001b[\u0018\u000btL\u0001Vt9 \u000f^\u0001#nwR\u0000\fj\u0001dN\u0011T\u0018";
        Object[] objectArray2 = objectArray;
        objectArray[127] = "\u0010\u0005`^UkPGlO>z*\u00006\u0010\u000fnNVg\u001f@m*\u00058YLvG\u0005vB]\u0017";
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/eM" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private int d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = k ^ l;
        CallSite callSite = eM.d("\u00d5", (long)-5419334535997464836L, (long)l);
        for (int i = 0; i <= eM.c("b", (int)22900, (long)(0x629A6C9251EA6706L ^ l)); ++i) {
            try {
                if (eM.d("\u00d1", (Object)eM.d("\u00d1", (Object)eM.d("\u00d1", (Object)eM.d("\u00db", (Object)b, (long)-5418858969913753669L, (long)l), (long)-5420528811554815159L, (long)l), (int)i, (long)-5419173322760607117L, (long)l), (long)-5420987106526041450L, (long)l) != eM.d("\u00d2", (long)-5417874747790962950L, (long)l)) continue;
                return i;
            }
            catch (MatchException matchException) {
                throw eM.d("\u00d5", (Object)matchException, (long)-5422122525002844559L, (long)l);
            }
        }
        return -1;
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = eM.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00db' || c == '\u00c1' || c == '\u00d2' || c == 'A') {
                field = eM.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00db' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c1' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = eM.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        eM.d("\u00d1", (Object)eM.d("\u00d2", (long)3249379952149043533L, (long)l), (Object)objectArray2, (long)3250247553514368985L, (long)l);
    }

    private boolean d(Object[] objectArray) {
        CallSite callSite;
        CallSite callSite2;
        long l;
        long l2;
        block16: {
            long l3;
            block17: {
                CallSite callSite3;
                CallSite callSite4;
                block14: {
                    long l4;
                    block15: {
                        block12: {
                            block13: {
                                l2 = (Long)objectArray[0];
                                long l5 = l2 = k ^ l2;
                                long l6 = l5 ^ 0x677BA0A252CCL;
                                long l7 = l5 ^ 0x3FA8CAC417AL;
                                l3 = l5 ^ 0x3F57F4B0EF1FL;
                                l4 = l5 ^ 0x1DD74B4C7206L;
                                l = l5 ^ 0x3C2FC29B7AA4L;
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l7;
                                CallSite callSite5 = eM.d("\u00d1", (Object)this, (Object)objectArray2, (long)-8599818732694350976L, (long)l2);
                                callSite4 = eM.d("\u00d5", (long)-8598321587533421926L, (long)l2);
                                try {
                                    try {
                                        callSite3 = callSite5;
                                        if (callSite4 != null) break block12;
                                        if (callSite3 == -1) break block13;
                                    }
                                    catch (MatchException matchException) {
                                        throw eM.d("\u00d5", (Object)matchException, (long)-8599966900489975273L, (long)l2);
                                    }
                                    Object[] objectArray3 = new Object[1];
                                    objectArray3[0] = l3;
                                    this.h = (int)eM.d("\u00d5", (Object)objectArray3, (long)-8600676372769460010L, (long)l2);
                                    this.i = -1;
                                    Object[] objectArray4 = new Object[2];
                                    objectArray4[1] = l6;
                                    objectArray4[0] = (int)callSite5;
                                    eM.d("\u00d5", (Object)objectArray4, (long)-8600388327669287540L, (long)l2);
                                    return true;
                                }
                                catch (MatchException matchException) {
                                    throw eM.d("\u00d5", (Object)matchException, (long)-8599966900489975273L, (long)l2);
                                }
                            }
                            callSite3 = eM.d("\u00d1", (Object)((Boolean)((Object)eM.d("\u00d1", (Object)this.e, (long)-8597990894978503802L, (long)l2))), (long)-8597771072743426418L, (long)l2);
                        }
                        try {
                            try {
                                if (callSite4 != null) break block14;
                                if (callSite3 != false) break block15;
                            }
                            catch (MatchException matchException) {
                                throw eM.d("\u00d5", (Object)matchException, (long)-8599966900489975273L, (long)l2);
                            }
                            return false;
                        }
                        catch (MatchException matchException) {
                            throw eM.d("\u00d5", (Object)matchException, (long)-8599966900489975273L, (long)l2);
                        }
                    }
                    Object[] objectArray5 = new Object[1];
                    objectArray5[0] = l4;
                    callSite3 = eM.d("\u00d1", (Object)this, (Object)objectArray5, (long)-8601270347495479051L, (long)l2);
                }
                callSite2 = callSite3;
                try {
                    try {
                        callSite = callSite2;
                        if (callSite4 != null) break block16;
                        if (callSite != -1) break block17;
                    }
                    catch (MatchException matchException) {
                        throw eM.d("\u00d5", (Object)matchException, (long)-8599966900489975273L, (long)l2);
                    }
                    return false;
                }
                catch (MatchException matchException) {
                    throw eM.d("\u00d5", (Object)matchException, (long)-8599966900489975273L, (long)l2);
                }
            }
            Object[] objectArray6 = new Object[1];
            objectArray6[0] = l3;
            callSite = eM.d("\u00d5", (Object)objectArray6, (long)-8600676372769460010L, (long)l2);
        }
        CallSite callSite6 = callSite;
        this.h = (int)callSite6;
        this.i = (int)callSite2;
        Object[] objectArray7 = new Object[3];
        objectArray7[2] = l;
        objectArray7[1] = (int)callSite6;
        objectArray7[0] = (int)callSite2;
        eM.d("\u00d5", (Object)objectArray7, (long)-8600762470491844401L, (long)l2);
        return true;
    }

    private static boolean a(Object[] objectArray) {
        Object object;
        block17: {
            class_1799 class_17992;
            CallSite callSite;
            long l;
            block15: {
                class_1799 class_17993;
                block16: {
                    Object object2;
                    block13: {
                        class_17993 = (class_1799)objectArray[0];
                        l = (Long)objectArray[1];
                        l = k ^ l;
                        callSite = eM.d("\u00d5", (long)7940323031522903047L, (long)l);
                        try {
                            block14: {
                                try {
                                    try {
                                        try {
                                            object2 = eM.d("\u00d1", (Object)class_17993, (long)7944265702173153211L, (long)l);
                                            if (callSite != null) break block13;
                                            if (object2 != false) break block14;
                                        }
                                        catch (MatchException matchException) {
                                            throw eM.d("\u00d5", (Object)matchException, (long)7943177678211017866L, (long)l);
                                        }
                                        class_17992 = class_17993;
                                        if (callSite != null) break block15;
                                    }
                                    catch (MatchException matchException) {
                                        throw eM.d("\u00d5", (Object)matchException, (long)7943177678211017866L, (long)l);
                                    }
                                    if (eM.d("\u00d1", (Object)class_17992, (long)7941959387219510180L, (long)l) != false) break block16;
                                }
                                catch (MatchException matchException) {
                                    throw eM.d("\u00d5", (Object)matchException, (long)7943177678211017866L, (long)l);
                                }
                            }
                            object2 = 0;
                        }
                        catch (MatchException matchException) {
                            throw eM.d("\u00d5", (Object)matchException, (long)7943177678211017866L, (long)l);
                        }
                    }
                    return (boolean)object2;
                }
                class_17992 = class_17993;
            }
            CallSite callSite2 = eM.d("\u00d1", (Object)eM.d("\u00d1", (Object)eM.d("\u00d1", (Object)class_17992, (long)7941159658750045711L, (long)l), (long)7943765256382897361L, (long)l), (long)7943360882562537529L, (long)l);
            while (eM.d("\u00d1", (Object)callSite2, (long)7941488040228429200L, (long)l) != false) {
                block19: {
                    int n;
                    block18: {
                        Object2IntMap.Entry entry = (Object2IntMap.Entry)eM.d("\u00d1", (Object)callSite2, (long)7942679400731662269L, (long)l);
                        try {
                            try {
                                object = eM.d("\u00d1", (Object)((class_6880)eM.d("\u00d1", (Object)entry, (long)7944148726374216210L, (long)l)), (Object)eM.d("\u00d2", (long)7940525986122589291L, (long)l), (long)7941402092174482775L, (long)l);
                                if (callSite != null) break block17;
                                if (callSite != null) break block18;
                            }
                            catch (MatchException matchException) {
                                throw eM.d("\u00d5", (Object)matchException, (long)7943177678211017866L, (long)l);
                            }
                            if (!object) break block19;
                        }
                        catch (MatchException matchException) {
                            throw eM.d("\u00d5", (Object)matchException, (long)7943177678211017866L, (long)l);
                        }
                        n = 1;
                    }
                    return n != 0;
                }
                if (callSite == null) continue;
            }
            object = false;
        }
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public dC a(Object[] objectArray) {
        eM eM2;
        long l;
        long l2;
        block16: {
            CallSite callSite;
            long l3;
            block14: {
                CallSite callSite2;
                block15: {
                    class_310 class_3102;
                    block13: {
                        l2 = (Long)objectArray[0];
                        long l4 = l2;
                        l = l4 ^ 0x3C453A556019L;
                        l3 = l4 ^ 0x10EAC4630FECL;
                        callSite2 = eM.d("\u00d5", (long)-1175814567396964968L, (long)l2);
                        try {
                            try {
                                class_3102 = b;
                                if (callSite2 != null) break block13;
                                if (eM.d("\u00db", (Object)class_3102, (long)-1177109870529737479L, (long)l2) != null) return null;
                            }
                            catch (MatchException matchException) {
                                throw eM.d("\u00d5", (Object)matchException, (long)-1178591423771841259L, (long)l2);
                            }
                            class_3102 = b;
                        }
                        catch (MatchException matchException) {
                            throw eM.d("\u00d5", (Object)matchException, (long)-1178591423771841259L, (long)l2);
                        }
                    }
                    try {
                        try {
                            callSite = eM.d("\u00d1", (Object)class_3102, (long)-1176273125389827072L, (long)l2);
                            if (callSite2 != null) break block14;
                            if (callSite != false) break block15;
                            return null;
                        }
                        catch (MatchException matchException) {
                            throw eM.d("\u00d5", (Object)matchException, (long)-1178591423771841259L, (long)l2);
                        }
                    }
                    catch (MatchException matchException) {
                        throw eM.d("\u00d5", (Object)matchException, (long)-1178591423771841259L, (long)l2);
                    }
                }
                try {
                    eM2 = this;
                    if (callSite2 != null) break block16;
                    callSite = eM.d("\u00d1", (String)((Object)eM.d("\u00d1", (Object)eM2.a, (long)-1175503107716608892L, (long)l2)), (Object)eM.b("d", (int)18801, (long)(0x4E37A6915C302263L ^ l2)), (long)-1175904983703112575L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw eM.d("\u00d5", (Object)matchException, (long)-1178591423771841259L, (long)l2);
                }
            }
            try {
                if (callSite != false) {
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l3;
                    return eM.d("\u00d1", (Object)this, (Object)objectArray2, (long)-1176283978052550520L, (long)l2);
                }
            }
            catch (MatchException matchException) {
                throw eM.d("\u00d5", (Object)matchException, (long)-1178591423771841259L, (long)l2);
            }
            eM2 = this;
        }
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l;
        return eM.d("\u00d1", (Object)eM2, (Object)objectArray3, (long)-1178324394619338001L, (long)l2);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    @bP
    public void a(a9 a92) {
        long l = k ^ 0x6447252C2005L;
        long l2 = l ^ 0x376BEA01A500L;
        try {
            Object[] objectArray = new Object[1];
            objectArray[0] = l2;
            if (eM.d("\u00d1", (Object)this, (Object)objectArray, (long)6705264546980703497L, (long)l) != false) {
                eM.d("\u00d1", (Object)a92, (Object)new Object[0], (long)6704591168419652824L, (long)l);
            }
        }
        catch (MatchException matchException) {
            throw eM.d("\u00d5", (Object)matchException, (long)6702731247977586613L, (long)l);
        }
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (s[n3] != null) {
            return n3;
        }
        Object object = r[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 27;
            case 1 -> 22;
            case 2 -> 16;
            case 3 -> 14;
            case 4 -> 8;
            case 5 -> 3;
            case 6 -> 25;
            case 7 -> 10;
            case 8 -> 15;
            case 9 -> 48;
            case 10 -> 33;
            case 11 -> 63;
            case 12 -> 30;
            case 13 -> 52;
            case 14 -> 0;
            case 15 -> 59;
            case 16 -> 61;
            case 17 -> 19;
            case 18 -> 60;
            case 19 -> 9;
            case 20 -> 11;
            case 21 -> 24;
            case 22 -> 51;
            case 23 -> 57;
            case 24 -> 5;
            case 25 -> 2;
            case 26 -> 38;
            case 27 -> 36;
            case 28 -> 31;
            case 29 -> 26;
            case 30 -> 49;
            case 31 -> 43;
            case 32 -> 42;
            case 33 -> 21;
            case 34 -> 58;
            case 35 -> 54;
            case 36 -> 4;
            case 37 -> 28;
            case 38 -> 53;
            case 39 -> 50;
            case 40 -> 45;
            case 41 -> 18;
            case 42 -> 13;
            case 43 -> 17;
            case 44 -> 12;
            case 45 -> 20;
            case 46 -> 40;
            case 47 -> 1;
            case 48 -> 47;
            case 49 -> 55;
            case 50 -> 34;
            case 51 -> 46;
            case 52 -> 32;
            case 53 -> 44;
            case 54 -> 23;
            case 55 -> 6;
            case 56 -> 62;
            case 57 -> 35;
            case 58 -> 37;
            case 59 -> 41;
            case 60 -> 29;
            case 61 -> 39;
            case 62 -> 56;
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
        eM.s[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = eM.m(l, l2);
        Object object = r[n];
        if (object instanceof String) {
            String string = s[n];
            int n2 = string.indexOf(8);
            Class clazz = eM.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = eM.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = eM.g(clazz3, string2, clazz2)) != null) {
                    eM.r[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = eM.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        eM.r[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = eM.n(628798015640967L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = eM.m(l, l2);
        Object object = r[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = s[n];
                int n3 = string2.indexOf(8);
                clazz3 = eM.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = eM.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = eM.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        eM.r[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = eM.n(628798015640967L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = eM.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        eM.r[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = eM.n(628798015640967L, 0L);
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
        block16: {
            eM eM2;
            block17: {
                int n;
                long l;
                long l2;
                block18: {
                    Object object;
                    CallSite callSite;
                    long l3;
                    block14: {
                        block15: {
                            l2 = (Long)objectArray[0];
                            long l4 = l2 = k ^ l2;
                            l = l4 ^ 0x79F53DE00379L;
                            l3 = l4 ^ 0x22A15FD92B11L;
                            callSite = eM.d("\u00d5", (long)-2802999711756373201L, (long)l2);
                            try {
                                try {
                                    object = this.h;
                                    if (callSite != null) break block14;
                                    if (object != -1) break block15;
                                }
                                catch (MatchException matchException) {
                                    throw eM.d("\u00d5", (Object)matchException, (long)-2804659386940662878L, (long)l2);
                                }
                                return;
                            }
                            catch (MatchException matchException) {
                                throw eM.d("\u00d5", (Object)matchException, (long)-2804659386940662878L, (long)l2);
                            }
                        }
                        try {
                            eM2 = this;
                            if (callSite != null) break block16;
                            object = eM.d("\u00d1", (Object)((Boolean)((Object)eM.d("\u00d1", (Object)eM2.f, (long)-2803259478286190029L, (long)l2))), (long)-2802494276674656453L, (long)l2);
                        }
                        catch (MatchException matchException) {
                            throw eM.d("\u00d5", (Object)matchException, (long)-2804659386940662878L, (long)l2);
                        }
                    }
                    try {
                        block19: {
                            try {
                                try {
                                    try {
                                        if (object == 0) break block17;
                                        n = this.i;
                                        if (callSite != null) break block18;
                                    }
                                    catch (MatchException matchException) {
                                        throw eM.d("\u00d5", (Object)matchException, (long)-2804659386940662878L, (long)l2);
                                    }
                                    if (n == -1) break block19;
                                }
                                catch (MatchException matchException) {
                                    throw eM.d("\u00d5", (Object)matchException, (long)-2804659386940662878L, (long)l2);
                                }
                                Object[] objectArray2 = new Object[3];
                                objectArray2[2] = l3;
                                objectArray2[1] = this.h;
                                objectArray2[0] = this.i;
                                eM.d("\u00d5", (Object)objectArray2, (long)-2803795794307530374L, (long)l2);
                                if (callSite == null) break block17;
                            }
                            catch (MatchException matchException) {
                                throw eM.d("\u00d5", (Object)matchException, (long)-2804659386940662878L, (long)l2);
                            }
                        }
                        n = this.h;
                    }
                    catch (MatchException matchException) {
                        throw eM.d("\u00d5", (Object)matchException, (long)-2804659386940662878L, (long)l2);
                    }
                }
                Object[] objectArray3 = new Object[2];
                objectArray3[1] = l;
                objectArray3[0] = n;
                eM.d("\u00d5", (Object)objectArray3, (long)-2805646981683649479L, (long)l2);
            }
            this.h = -1;
            eM2 = this;
        }
        eM2.i = -1;
    }

    private boolean lambda$new$0(Boolean bl) {
        long l = k ^ 0x7775C79AA5D5L;
        return (boolean)eM.d("\u00d1", (String)((Object)eM.d("\u00d1", (Object)this.a, (long)-2819259127547216908L, (long)l)), (Object)eM.b("d", (int)8371, (long)(0x7B51DA9D715B7CD2L ^ l)), (long)-2819706083664624655L, (long)l);
    }

    private boolean lambda$new$2(Boolean bl) {
        long l = k ^ 0x21D433CB6310L;
        return (boolean)eM.d("\u00d1", (String)((Object)eM.d("\u00d1", (Object)this.a, (long)2169235712817560881L, (long)l)), (Object)eM.b("d", (int)18801, (long)(0x4E37CCD4CC8BD3D6L ^ l)), (long)2169383584580257076L, (long)l);
    }

    private boolean lambda$new$1(Boolean bl) {
        long l = k ^ 0x622FB32C9F9BL;
        return (boolean)eM.d("\u00d1", (String)((Object)eM.d("\u00d1", (Object)this.a, (long)-2120650510171962950L, (long)l)), (Object)eM.b("d", (int)32626, (long)(0x347B39B51B19195FL ^ l)), (long)-2121071060146210369L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(eM.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(eM.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(eM.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


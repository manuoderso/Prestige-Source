/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  net.minecraft.class_1304
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_310
 *  net.minecraft.class_5321
 *  net.minecraft.class_6880
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aj_0;
import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.dL;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dP;
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
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_310;
import net.minecraft.class_5321;
import net.minecraft.class_6880;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class d9
extends dV {
    private dR a;
    private dL f;
    private dM d;
    private dP c;
    private f5 e;
    private static final class_1304[] g;
    private static final long k;
    private static final String[] l;
    private static final String[] m;
    private static final Map n;
    private static final long[] o;
    private static final Integer[] p;
    private static final Map q;
    private static final Object[] r;
    private static final String[] s;

    public d9() {
        long l = k ^ 0x1AB2BA8E2F4FL;
        long l2 = l ^ 0x7C8F487386CCL;
        this.e = new f5(l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    d9.k = hc.a(-7847609432952584602L, 1531565869090096205L, MethodHandles.lookup().lookupClass()).a(2676986350108L);
                    var20 = d9.k ^ 23853416355504L;
                    d9.r = new Object[129];
                    d9.s = new String[129];
                    d9.f();
                    d9.n = new HashMap<K, V>(13);
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
                    var18_3 = new String[3];
                    var16_4 = 0;
                    var15_5 = "\u00e1\u00a5\u0015\u00cbb\u0083\u00f4\u00c0\u008d\u0018\u00c4F\u00ba\u0096\u00ae\b3g\u00ef[\u0085\u0085v&Wg\u00d3\u00c7\u00ed\u00f9\u00ad\u00d9\u0010\u00a2\u00e2\u0003C\u0089\u009a\u00bdy\u001d\u009e\u00c0\u00a1*\u00b4<\u00e2\u00109\u00ba\u009d\u00a7\u00bc\u00027R=Z\u00fe\u009e|k\u00f6\u00af";
                    var17_6 = "\u00e1\u00a5\u0015\u00cbb\u0083\u00f4\u00c0\u008d\u0018\u00c4F\u00ba\u0096\u00ae\b3g\u00ef[\u0085\u0085v&Wg\u00d3\u00c7\u00ed\u00f9\u00ad\u00d9\u0010\u00a2\u00e2\u0003C\u0089\u009a\u00bdy\u001d\u009e\u00c0\u00a1*\u00b4<\u00e2\u00109\u00ba\u009d\u00a7\u00bc\u00027R=Z\u00fe\u009e|k\u00f6\u00af".length();
                    var14_7 = 32;
                    var13_8 = -1;
lbl32:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl34:
                    // 1 sources

                    while (true) {
                        var18_3[var16_4++] = d9.b(var19_9).intern();
                        if ((var13_8 += var14_7) < var17_6) {
                            var14_7 = var15_5.charAt(var13_8);
                            ** continue;
                        }
                        break block12;
                        break;
                    }
                    v3 = ++var13_8;
                    var19_9 = var11_1.doFinal(var15_5.substring(v3, v3 + var14_7).getBytes("ISO-8859-1"));
                    ** while (true)
                }
                d9.l = var18_3;
                d9.m = new String[3];
                d9.q = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v4 = SecretKeyFactory.getInstance("DES");
                v5 = new byte[8];
                v6 = v5;
                v5[0] = (byte)(var20 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v6 = v6;
                    v6[var1_11] = (byte)(var20 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v4.generateSecret(new DESKeySpec(v6)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[13];
                var3_13 = 0;
                var4_14 = "e\u00af\u00fa\u00c1sE`\u00ab\u00c9\r\u0007\u00e85\u0011jH\u0018\u00b6b\u00c2$\u00d7^Tsz@\u00bajm\u0095\u009f+\u001f\u00be5\u00a9\u00fd\u008fsG\u00b8\u0019\u0098f\u0005*\u00ca\u00e3\u00c1\u00a4\u00de\u0081\u00ca\u00f1\u00c5\u0013_&\u00aa\u008c?(\u00d2\u0001Z&Z>`\u0019\u0092\u00a4.e|\u00c2^\u00ffI\\\u00b5v\u001fR\u00d4\u000f\u0087";
                var5_15 = "e\u00af\u00fa\u00c1sE`\u00ab\u00c9\r\u0007\u00e85\u0011jH\u0018\u00b6b\u00c2$\u00d7^Tsz@\u00bajm\u0095\u009f+\u001f\u00be5\u00a9\u00fd\u008fsG\u00b8\u0019\u0098f\u0005*\u00ca\u00e3\u00c1\u00a4\u00de\u0081\u00ca\u00f1\u00c5\u0013_&\u00aa\u008c?(\u00d2\u0001Z&Z>`\u0019\u0092\u00a4.e|\u00c2^\u00ffI\\\u00b5v\u001fR\u00d4\u000f\u0087".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v7 = var6_12;
                    v8 = var3_13++;
                    v9 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v10 = -1;
                    break block13;
                    break;
                }
lbl85:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "\u008f\u00f1\u00da\u00f86C\u00d9\u00a4\u0006?\u009d\u00f5K<\u000e\u00d3";
                    var5_15 = "\u008f\u00f1\u00da\u00f86C\u00d9\u00a4\u0006?\u009d\u00f5K<\u000e\u00d3".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v7 = var6_12;
                        v8 = var3_13++;
                        v9 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v10 = 0;
                        break block13;
                        break;
                    }
                    break;
                }
lbl104:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_16 < var5_15) ** continue;
                    break block14;
                    break;
                }
            }
            var8_18 = v9;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v11 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v10) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl117:
                // 1 sources

                ** continue;
            }
        }
        d9.o = var6_12;
        d9.p = new Integer[13];
        d9.g = new class_1304[]{d9.d("\u00d1", (long)-4273651802638184848L, (long)var20), d9.d("\u00d1", (long)-4273831733085758696L, (long)var20), d9.d("\u00d1", (long)-4269668318993693243L, (long)var20), d9.d("\u00d1", (long)-4269737226892481421L, (long)var20)};
    }

    private static int e(Object[] objectArray) {
        Object object;
        block13: {
            class_1799 class_17992;
            CallSite callSite;
            long l;
            class_5321 class_53212;
            block11: {
                class_1799 class_17993;
                block12: {
                    class_17993 = (class_1799)objectArray[0];
                    class_53212 = (class_5321)objectArray[1];
                    l = (Long)objectArray[2];
                    l = k ^ l;
                    callSite = d9.d("\u00ff", (long)4869519674545796145L, (long)l);
                    try {
                        try {
                            class_17992 = class_17993;
                            if (callSite != null) break block11;
                            if (d9.d("\u00e3", (Object)class_17992, (long)4869998913048438345L, (long)l) == false) break block12;
                        }
                        catch (MatchException matchException) {
                            throw d9.d("\u00ff", (Object)matchException, (long)4872695745324856918L, (long)l);
                        }
                        return 0;
                    }
                    catch (MatchException matchException) {
                        throw d9.d("\u00ff", (Object)matchException, (long)4872695745324856918L, (long)l);
                    }
                }
                class_17992 = class_17993;
            }
            CallSite callSite2 = d9.d("\u00e3", (Object)d9.d("\u00e3", (Object)d9.d("\u00e3", (Object)class_17992, (long)4868291825904974063L, (long)l), (long)4871624560573187510L, (long)l), (long)4870051559086879771L, (long)l);
            while (d9.d("\u00e3", (Object)callSite2, (long)4867266918214967692L, (long)l) != false) {
                block15: {
                    CallSite callSite3;
                    block14: {
                        Object2IntMap.Entry entry = (Object2IntMap.Entry)d9.d("\u00e3", (Object)callSite2, (long)4870914120683467358L, (long)l);
                        try {
                            try {
                                try {
                                    object = d9.d("\u00e3", (Object)((class_6880)d9.d("\u00e3", (Object)entry, (long)4869745132830360289L, (long)l)), (Object)class_53212, (long)4867419052835336352L, (long)l);
                                    if (callSite != null) break block13;
                                    if (callSite != null) break block14;
                                }
                                catch (MatchException matchException) {
                                    throw d9.d("\u00ff", (Object)matchException, (long)4872695745324856918L, (long)l);
                                }
                                if (object == 0) break block15;
                            }
                            catch (MatchException matchException) {
                                throw d9.d("\u00ff", (Object)matchException, (long)4872695745324856918L, (long)l);
                            }
                            callSite3 = d9.d("\u00e3", (Object)entry, (long)4871449698150436093L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw d9.d("\u00ff", (Object)matchException, (long)4872695745324856918L, (long)l);
                        }
                    }
                    return (int)callSite3;
                }
                if (callSite == null) continue;
            }
            object = 0;
        }
        return object;
    }

    private static boolean e(Object[] objectArray) {
        Object object;
        block2: {
            block3: {
                class_1799 class_17992 = (class_1799)objectArray[0];
                class_5321 class_53212 = (class_5321)objectArray[1];
                long l = (Long)objectArray[2];
                long l2 = (l = k ^ l) ^ 0x664D50985B5CL;
                CallSite callSite = d9.d("\u00ff", (long)5392521523975355763L, (long)l);
                try {
                    Object[] objectArray2 = new Object[3];
                    objectArray2[2] = l2;
                    objectArray2[1] = class_53212;
                    objectArray2[0] = class_17992;
                    object = d9.d("\u00ff", (Object)objectArray2, (long)5394455203889809350L, (long)l);
                    if (callSite != null) break block2;
                    if (object <= 0) break block3;
                }
                catch (MatchException matchException) {
                    throw d9.d("\u00ff", (Object)matchException, (long)5394570664051228436L, (long)l);
                }
                object = 1;
                break block2;
            }
            object = 0;
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
            throw new RuntimeException("dev/zprestige/prestige/d9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = d9.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4282;
        if (m[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])d9.n.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    d9.n.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/d9", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d9.l[n2].getBytes("ISO-8859-1");
            d9.m[n2] = d9.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return m[n2];
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/d9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x70E5;
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
                throw new RuntimeException("dev/zprestige/prestige/d9", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            d9.p[n2] = n3;
        }
        return p[n2];
    }

    private static int c(Object[] objectArray) {
        class_1799 class_17992 = (class_1799)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l = k ^ l;
        long l3 = l2 ^ 0x513AECD2E292L;
        long l4 = l2 ^ 0x34A42834EBD4L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = d9.d("\u00e3", (Object)class_17992, (long)-405537625944556577L, (long)l);
        reference var8_5 = d9.d("\u00ff", (Object)objectArray2, (long)-409750938457015087L, (long)l) * d9.c("r", (int)13516, (long)(0xDC06DB2282EBE6BL ^ l));
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l4;
        objectArray3[1] = d9.d("\u00d1", (long)-406254026088394162L, (long)l);
        objectArray3[0] = class_17992;
        reference var8_6 = var8_5 + d9.d("\u00ff", (Object)objectArray3, (long)-408518579509479602L, (long)l) * 5;
        Object[] objectArray4 = new Object[3];
        objectArray4[2] = l4;
        objectArray4[1] = d9.d("\u00d1", (long)-408586211418362176L, (long)l);
        objectArray4[0] = class_17992;
        reference var8_7 = var8_6 + d9.d("\u00ff", (Object)objectArray4, (long)-408518579509479602L, (long)l) * 3;
        Object[] objectArray5 = new Object[3];
        objectArray5[2] = l4;
        objectArray5[1] = d9.d("\u00d1", (long)-408929500354648193L, (long)l);
        objectArray5[0] = class_17992;
        reference var8_8 = var8_7 + d9.d("\u00ff", (Object)objectArray5, (long)-408518579509479602L, (long)l) * 3;
        Object[] objectArray6 = new Object[3];
        objectArray6[2] = l4;
        objectArray6[1] = d9.d("\u00d1", (long)-408900453515673274L, (long)l);
        objectArray6[0] = class_17992;
        reference var8_9 = var8_8 + d9.d("\u00ff", (Object)objectArray6, (long)-408518579509479602L, (long)l) * 2;
        Object[] objectArray7 = new Object[3];
        objectArray7[2] = l4;
        objectArray7[1] = d9.d("\u00d1", (long)-407214976446539392L, (long)l);
        objectArray7[0] = class_17992;
        reference var8_10 = var8_9 + d9.d("\u00ff", (Object)objectArray7, (long)-408518579509479602L, (long)l) * 2;
        Object[] objectArray8 = new Object[3];
        objectArray8[2] = l4;
        objectArray8[1] = d9.d("\u00d1", (long)-412499264081885732L, (long)l);
        objectArray8[0] = class_17992;
        reference var8_11 = var8_10 + d9.d("\u00ff", (Object)objectArray8, (long)-408518579509479602L, (long)l) * 3;
        Object[] objectArray9 = new Object[3];
        objectArray9[2] = l4;
        objectArray9[1] = d9.d("\u00d1", (long)-406728337550497080L, (long)l);
        objectArray9[0] = class_17992;
        reference var8_12 = var8_11 + d9.d("\u00ff", (Object)objectArray9, (long)-408518579509479602L, (long)l) * 1;
        Object[] objectArray10 = new Object[3];
        objectArray10[2] = l4;
        objectArray10[1] = d9.d("\u00d1", (long)-405506700199801809L, (long)l);
        objectArray10[0] = class_17992;
        reference var8_13 = var8_12 + d9.d("\u00ff", (Object)objectArray10, (long)-408518579509479602L, (long)l) * 3;
        Object[] objectArray11 = new Object[3];
        objectArray11[2] = l4;
        objectArray11[1] = d9.d("\u00d1", (long)-412153761382488256L, (long)l);
        objectArray11[0] = class_17992;
        reference var8_14 = var8_13 + d9.d("\u00ff", (Object)objectArray11, (long)-408518579509479602L, (long)l) * 1;
        Object[] objectArray12 = new Object[3];
        objectArray12[2] = l4;
        objectArray12[1] = d9.d("\u00d1", (long)-412611239608694448L, (long)l);
        objectArray12[0] = class_17992;
        reference var8_15 = var8_14 + d9.d("\u00ff", (Object)objectArray12, (long)-408518579509479602L, (long)l) * 1;
        Object[] objectArray13 = new Object[3];
        objectArray13[2] = l4;
        objectArray13[1] = d9.d("\u00d1", (long)-413068486571657328L, (long)l);
        objectArray13[0] = class_17992;
        reference var8_16 = var8_15 + d9.d("\u00ff", (Object)objectArray13, (long)-408518579509479602L, (long)l) * 1;
        Object[] objectArray14 = new Object[3];
        objectArray14[2] = l4;
        objectArray14[1] = d9.d("\u00d1", (long)-405902602946584961L, (long)l);
        objectArray14[0] = class_17992;
        reference var8_17 = var8_16 + d9.d("\u00ff", (Object)objectArray14, (long)-408518579509479602L, (long)l) * 1;
        Object[] objectArray15 = new Object[3];
        objectArray15[2] = l4;
        objectArray15[1] = d9.d("\u00d1", (long)-407139793062998247L, (long)l);
        objectArray15[0] = class_17992;
        reference var8_18 = var8_17 + d9.d("\u00ff", (Object)objectArray15, (long)-408518579509479602L, (long)l) * 2;
        return (int)var8_18;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = d9.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = d9.m(l, l2);
            object = r[n];
            try {
                if (!(object instanceof String)) break block2;
                d9.r[n] = clazz = Class.forName(s[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = d9.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = d9.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = d9.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = d9.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = r;
        r[0] = "\u000b:\u0004sC_\u000b:\u0013/OP\u0011q\u00131OE\u0016\u0000An\u001e\u0002";
        objectArray[1] = "}\u0011\u0006%qrk\u0011\u0003\u007fbe|Z\u0000ynqm\u001d\u0017n%cQ";
        objectArray[2] = "\u000e&\u007f%BW{\u0006t*S\u0018\u0006\u001eg-ZQn";
        objectArray[3] = "\u000eQ\u001dn\u00046\u0018Q\u00184\u0017!\u000f\u001a\u001b2\u001b5\u001e]\f%P\"S";
        objectArray[4] = "l\u0002?\b\u0003\u001ag\r.G`\u0017r\u0000!,U\u0015c\u0013=\u0000B\u0018";
        objectArray[5] = Integer.TYPE;
        d9.s[5] = "java/lang/Integer";
        objectArray[6] = "$_) )\u0016Q\u007f\"/8Y0q)$<\u0003D";
        objectArray[7] = "T\u0010\u0013\u00043wT\u0010\u0004X?xN[\u0004F?mI*V\u001do-";
        objectArray[8] = "\u001c\u0011SM=V\u001c\u0011D\u00111Y\u0006ZD\u000f1L\u0001+\u0014R`";
        objectArray[9] = "#9Kfa5#9\\:m:9r\\$m/>\u0003\b|:";
        objectArray[10] = "\u001e9%Futk\u0019.Id;\n\u0017%B`a~";
        objectArray[11] = "EfZ\u0003\u0017~EfM_\u001bq_-MA\u001bdX\\\u001f\u001aC.";
        objectArray[12] = "i Z/>[i Ms2TskMm2At\u001a\u001f6j\u0000";
        objectArray[13] = Boolean.TYPE;
        d9.s[13] = "java/lang/Boolean";
        objectArray[14] = "F2!\f\u001aRM=0CvQC?2\fZ";
        objectArray[15] = "B`?MT\u0005B`(\u0011X\nX+(\u000fX\u001f_Zz[\t^";
        objectArray[16] = "rfV0y/rfAlu h-Aru5o\\\u0013(\"w";
        objectArray[17] = "\u000f?`C;&\u000f?w\u001f7)\u0015tw\u00017<\u0012\u0005%Uo|";
        objectArray[18] = "\u001c`\u001e,\\E\u001c`\tpPJ\u0006+\tnP_\u0001Z_1\u0003\u001d";
        objectArray[19] = "\u0002\u0011fSwrw1m\\f=\u0016?fWbgb";
        objectArray[20] = "c\u0013=A;[u\u00138\u001b(LbX;\u001d$Xs\u001f,\noOL";
        objectArray[21] = "\f\u000ej\u00184C\u0007\u0001{WUM\f\n\u007f\r";
        objectArray[22] = "pYW>\u007f<\u0005y\\1nsdwW:j)\u0010";
        objectArray[23] = "x\u001c\\\u0016\u0018\u001dn\u001cYL\u000b\nyWZJ\u0007\u001eh\u0010M]L\u000en";
        objectArray[24] = "/1a*V\u001cZ\u0011j%GS;\u001fa.C\tO";
        objectArray[25] = "\t\u0019;f:S\u0017\u0011!)]R\u0006\n,s{T";
        objectArray[26] = "rl~\u0012RJvq~\u0003OJ5~1\u0014HVoq<ISAq}3\u0013O\rTz:\u0002_W)Q>\u0013qBk<\u0015\tHQb";
        objectArray[27] = "#%\u0016\u000bo\u0013=-\fD\u0012\u0003=";
        objectArray[28] = "\u0003nF:J;\u0003nQfF4\u0019%QxF!\u001eT\u000b'\u0017f";
        objectArray[29] = "47\u0007(\\L47\u0010tPC.|\u0010jPV)\rE>\t\u0015";
        objectArray[30] = "_$3)<\u0013*\u00048&-\\K\n3-)\u0006?";
        objectArray[31] = ";sk#}\u001aNS`,lU/]k'h\u000f[";
        objectArray[32] = "\u0002z&Q\u0003\u0014\tu7\u001e~\f\u001ar>W";
        objectArray[33] = "\"\b\u0000Kt8\"\b\u0017\u0017x78C\u0017\tx\"?2EU-`";
        objectArray[34] = "S\b/,;\u0006V\u001d$,0\u001dZ\rfE\u001b7k";
        objectArray[35] = Long.TYPE;
        d9.s[35] = "java/lang/Long";
        objectArray[36] = "bR`3]\u0004i]q|:\u0006|Vq7\u0001";
        objectArray[37] = "J\u0001\u0014p\bkJ\u0001\u0003,\u0004dPJ\u00032\u0004qW;TmR";
        objectArray[38] = "u^?cH+c^:9[<t\u00159?W(eR.(\u001c=$";
        objectArray[39] = "]\r\u0013\u0003mn(-\u0018\f|!I#\u0013\u0007x{=";
        objectArray[40] = "w\u001a<*6\u0010w\u001a+v:\u001fmQ+h:\nj ~7c";
        objectArray[41] = "8S\u001c\u0015*;Ms\u0017\u001a;t,}\u001c\u0011?.X";
        objectArray[42] = "cPg>Aj\u0016pl1P%w~g:T\u007f\u0003";
        objectArray[43] = ">Y\u0006fC*Ky\riRe*w\u0006bV?^";
        objectArray[44] = Void.TYPE;
        d9.s[44] = "java/lang/Void";
        objectArray[45] = "\u000e\rs\u001bf\u0013R\f}\u0013\u0014\u001fR\u000bp\u0007CN\fW,k)\u001aT\u0016f\tu\u001bZ\u001e";
        objectArray[46] = "\\E-o:a\b\u001b/3W9\u000f\u0003rh;\u000bXE,?l\\\u0004\u0013\"47bY\u0011ncW";
        objectArray[47] = "\u000fpa>Ca[.cb.2P':2ye\u000epb^\u00109\u0000/ob\\$Hs";
        objectArray[48] = "6B\u001f6\u0017\\a\u0007@h~U<\u0011Ag)\ndD\u0018\u000b\u0012\u00029\u001d@eG@>B";
        objectArray[49] = "Mzo\u0006x\u0004\u0010x#Q\u0018_Fj?Ztm\u0017*n\u0005\u0018]N&>P{\u0000Nkf=";
        objectArray[50] = "\t3l3=\u0015\u000f54:\\\u001d3r3($H\na<*6v\bt` =\u001d^dup\\";
        objectArray[51] = "JQ:s(5\n\u0016hjD\"3P5w<u\nC:u.K\u0002\u00116}=7HKqrD";
        objectArray[52] = "Z<U|xd^5Qb\u00060R6T|Qd\tc\n \u0006nLc@t|b\r2\u000e";
        objectArray[53] = "n\u000f\u000b@\t\u0000j\u0006\u000f^wTf\u0005\n@ \n:WV,GE?\u0018\nVK\u0004nV";
        objectArray[54] = "\u0004%:O\n\r\nh0\u00056XV%9YZj\u0006ig\u0003\t=Y::\u000eG@R%4Z6";
        objectArray[55] = "E>\u001f7i\u0019\u0011`\u001dk\u0004J\u001aiD;S\u001dD9\u001dW|]\u001e`Z&<N\u0018i";
        objectArray[56] = "\u0018\u0007~IT0\u0011\rkH5o\u0011\u0010WUEsxZ-\u0005\\v\u0004\u0010wBS\u000f";
        objectArray[57] = "-!ywW\u0007zd&)>\u000e'r'&iZ}'|s>\f\u007f{\"/PY=|}";
        objectArray[58] = "\f2:\rNRR\"gG#\n\u0002%=\u0018O8SagE\u001eo\u0003`9\u001eF\u0001V\">A#^Sd4\u0006_\u0014\t#;\u007f";
        objectArray[59] = "v\u0004\u001df>\u001b!AB8W\u0012|WC7\u0000M$\u0002\u001e[;Ey[B5n\u0007~\u0004";
        objectArray[60] = "=84\\B.910B<z525\\k$hfo0\fkl/5J\u0000*=a";
        objectArray[61] = "on'\u001d,\u0016kg#\u0003RBgd&\u001d\u0005\u001c87zqbS>y&\u000bn\u0012o7";
        objectArray[62] = "\u0018R$\u0018fDO\u0017{F\u000fM\u0012\u0001zIX\u0012JT/%c\u001a\u0017\r{K6X\u0010R";
        objectArray[63] = "=Lv^}\u0005j\t)\u0000\u0014\f7\u001f(\u000fCSoH|cx[2\u0013)\r-\u00195L";
        objectArray[64] = "<?l.#\u001e86h0]J45m.\n\u0014ef3Bm[m(m8a\u001a<f";
        objectArray[65] = "w\u001a'<}Gs\u0013#\"\u0003\u0013\u007f\u0010&<TM$C}P3\u0002&\r&*?CwC";
        objectArray[66] = "\b3#Q#\u0018\u00154r4sH\u0006> c#\u0010UdLWtF\u000ed}Js\u0017";
        objectArray[67] = "\u0012\u001a\u001f*Q[\u0016\u0013\u001b4/\u000f\u001a\u0010\u001e*xQDAAF\u001f\u001eC\r\u001e<\u0013_\u0012C";
        objectArray[68] = "\u0004p7n]RS5h04[\u000e#i?c\u0004W\u007f2SX\f\u000b/h=\rN\fp";
        objectArray[69] = "RA\bG`\u0006OFY\"0V\\L\u000bu`\u000e\u000e\u0012gA7XT\u0016V\\0\t";
        objectArray[70] = "IW5=4\u000b\u0005J}a\u0005R\u001aNd?i`I\u000b=h\u0005T\u001e]af4I\u0019\f\u0004gyT\u0006\u000e4i4^L2";
        objectArray[71] = "2\u001a6b4Se_i<]Z8Ih3\n\u000fi\u001e6d]X`@m:3\r\"G2";
        objectArray[72] = "\u0004c[z\f3\u0002e\u0003sm<>\"\u0004a\u0015n\u00071\u000bc\u0007P\u000fc\u0007k\u0014,E9@dm";
        objectArray[73] = "Qf\u0010\u001a\u001ceUo\u0014\u0004b1Yl\u0011\u001a5o\u00028EvR \u0000q\u0011\f^aQ?";
        objectArray[74] = "*<@8d?,:\u00181\u00055\u0010}\u001f#}b)n\u0010!o\\!<\u001c)| kf[&\u0005";
        objectArray[75] = "Wz^u)oB4CaL`Y#Kq%l`-Ka!\n\u000fx\u0012u5vE\"UzL";
        objectArray[76] = "oPB3\u00019kYF-\u007fmgZC3(9<\u000f\u001d`\u007f3y\u000fW;\u0005?8^\u0019";
        objectArray[77] = "\t$w{\u000b&^a(%b/\u0003w)*5p[#|F\u000ex\u0006{(([:\u0001$";
        objectArray[78] = "\u001dJ\u0019?[1\u0019C\u001d!%e\u0015@\u0018?r;N\u001dGS\u0015tL]\u0018)\u00195\u001d\u0013";
        objectArray[79] = "#4n\u001b3$\",4\u0000\\~$*5\u00040LtjnS\\ 2;>\u00027v\".nccg*'iSm* mU";
        objectArray[80] = "R:'\u0019=6\u0005\u007fxGT?XiyH\u0003`\u0000=&$8h]exJm*Z:";
        objectArray[81] = "\u001b\u0015{|%&HJdrK.vAcu'\u007fFCcm&G";
        objectArray[82] = "\u000f87\u001bnw\t>o\u0012\u000f}5yh\u0000w*\fjg\u0002e\u0014\u000e\u007f;\bn\u007fXo.X\u000f";
        objectArray[83] = "Q\u00159\\,l\u0006Pf\u0002Ee[Fg\r\u0012:\u0003\u0012:a)2^Jf\u000f|pY\u0015";
        objectArray[84] = "R\u0013\\BJ(V\u001aX\\4|Z\u0019]Bc\"\u000bL\u0004.\u0004m\u0003\u0004]T\b,RJ";
        objectArray[85] = "{\r=?\u0002~}Dl%mig@l=\u0016\u0004sY|5U4qYd4m5\"\u0000l \u0011\u007fxGcY";
        objectArray[86] = "t,zm\u007fb#i%3\u0016k~\u007f$<A4&(\u007fPz<{s%>/~|,";
        objectArray[87] = "\u0004,\u001eZ\u000bs\u0000%\u001aDu'\f&\u001fZ\"yStK6E6U;\u001fLIw\u0004u";
        objectArray[88] = "=D@t\u001fYoN\u001bu`N\u0004G\u0005/\u0018\u0018?\u0002\u001fl\u0019$";
        objectArray[89] = "\u0014\u000b+\u0006\nn\u0010\u0002/\u0018t:\u001c\u0001*\u0006#dFSvjD+E\u001c*\u0010Hj\u0014R";
        objectArray[90] = "\t%j\u001c2\u0006]{h@_UVr1\u0010\b\u0002\t/j|%KJb(G-\u0002N%";
        objectArray[91] = "O.\u001a\\\u0018:Uk\u0014\r|2Cmh\\\r]CuR]DmAuJ\\|";
        objectArray[92] = "BDY\u000f_V\u0015\u0001\u0006Q6_H\u0017\u0007^a\u0000\u0010@R2Z\bM\u001b\u0006\\\u000fJJD";
        objectArray[93] = ">\u0019dw}e0Tn=A0l\u0019ga-\u0002>T?7Ae~]wb;i?\f9\u0006";
        objectArray[94] = "C\u000e~c\u0015\u0019MCt))L\u0011\u000e}uE~CC#*)\u0018@OtkUR\u001a\b{\u0012";
        objectArray[95] = "\u001b\u0000W$~\u0019\u0013V\u001ddN\u0019\u0005\u0000\u0015p2\u001f\u0003m\u000fu!\t\u0018R\u0006\u007f4\by";
        objectArray[96] = "\u000bP\n9oy\rVR0\u000ev1\u0011U\"v$\b\u0002Z d\u001a\n\u0017\u0006*oq\\\u0007\u0013z\u000e";
        objectArray[97] = "\u0019{@6{9\u001f2\u0011,\u0014#\u00150\u0018\u001bs/\u0011KC+y(\u001d \u0015;lx|";
        objectArray[98] = "\u0014c\u0007)7\u007fX~Ou\u0006&GzV+j\u0014\u0011?\u000bp6C@d\r4i|A|W/\u0006";
        objectArray[99] = "&ozj\u0013\u000f<*t;w\u0007*,\na\u000b6.46jwS<= f\u001c\u0005,(p\u0007";
        objectArray[100] = "\u0019I\u0005\u000fEg\u001d@\u0001\u0011;3\u0011C\u0004\u000flmH\u001fXc\u000b\"H^\u0004\u0019\u0007c\u0019\u0010";
        objectArray[101] = "->Z\u007f}Y&!T+\fA\"!Y(`srb\u0004t=$-0\u0001r<E%fK2\f";
        objectArray[102] = "@8E\\\fX\u0000\u007f\u0017E`O99JX\u0018\u0018\u0000*EZ\n&Gx\u0010Z\u0002\u0016I/IB`";
        objectArray[103] = "\u0006V:\u0004\\s\u0002_>\u001a\"'\u000e\\;\u0004uyR\u000e`h\u00126WA;\u0012\u001ew\u0006\u000f";
        objectArray[104] = "\u00131S4\"HA/\u0000-M@|/]45\u0013E<R6'-Mn^>4Q\u00074\u00191M";
        objectArray[105] = "(_u-t\u0016,Vq3\nB Ut-]\u001c|\u0002+A:SyHt;6\u0012(\u0006";
        objectArray[106] = "bGH\b7pdA\u0010\u0001VzX\u0006\u0017\u0013.-a\u0015\u0018\u0011<\u0013;\u0012F\u0015h\"&\u0015\u0017p";
        objectArray[107] = "o{K\u0001\tnfq^\u0000h7bgXp\u00055v{\u001c@\u00075nz$";
        objectArray[108] = "f\u0007\u0007<\nl1BXbcelTYm4:5\b\u0000\u0001\u000f2iXXoZpn\u0007";
        objectArray[109] = ">l\u0010{IJi)O% C4?N*w\u001cmc\u0014FL\u001413O(\u0019V6l";
        objectArray[110] = "Mz\u001fPc\\S'DQ\u001b\bN)\u0004pv\u001bi*\n?|\u0002\u001a&\u0016\\!\u0002W~{\u0004`\nA&\u0010Rp\u001f\u0011G@Dv\fK,\u0016Tc\\*";
        objectArray[111] = "\u0005\n>\u001eEe\u0001\u0003:\u0000;1\r\u0000?\u001eleVUaC;o\u0013U+\u0016AcR\u0004e";
        objectArray[112] = ".V\u0004CA\u0010y\u0013[\u001d(\u0019$\u0005Z\u0012\u007fF|P\u0001~DN!\t[\u0010\u0011\f&V";
        objectArray[113] = ")Fn\u0000x\u001d-Oj\u001e\u0006I!Lo\u0000Q\u0017{\u001d;l6XxQo\u0016:\u0019)\u001f";
        objectArray[114] = "l&\u0011\u00199\u001fh/\u0015\u0007GKd,\u0010\u0019\u0010\u0015?qIuwZ=1\u0010\u000f{\u001bl\u007f";
        objectArray[115] = "<\u0010\rqk\u0005:\u0016Ux\n\u000b\u0006QRjrX?B]h`f=W\u0001bk\rkG\u00142\n";
        objectArray[116] = "\u001f\u0013n+\u0010\u0006\u0003\r>o*\u0018\u0001\u000f\u000f\u007fN\u0004\nsjmG\u0012\u0006\u0018<}RBg";
        objectArray[117] = "H?I\u001d6#N9\u0011\u0014W)r8EY79\u0010<\u0010\n-@In\u0014\u0005.\"M;G\u001fW";
        objectArray[118] = "-\u00139p1M)\u001a=nO\u0019%\u00198p\u0018G{Ig\u001c\u007f\b|\u00048fsI-J";
        objectArray[119] = "Y]N\f\b@]TJ\u0012v\u0014QWO\f!J\u0000\u0005\u0010`F\u0005\bJO\u001aJDY\u0004";
        objectArray[120] = "xQ\u0002V\u000f\teVS3_Yv\\\u0001d\u000f\u0001$\u0004mPXW~\u0006\\M_\u0006";
        objectArray[121] = "t+P\u0018~<p\"T\u0006\u0000h|!Q\u0018W6%q\u0005t0y%<Q\u000e<8tr";
        objectArray[122] = "\u001dl\u001163w\u0000k@Sc'\u0013a\u0012\u00043\u007f@4~0d)\u001b;O-cx";
        objectArray[123] = "TP_?\u0014TPY[!j\u0000\\Z^?=^\r\f\u0001SZ\u0011\u0005G^)VPT\t";
        objectArray[124] = "LBkG\u0016.HKoYhzDHjG?$\u001e\u00140+Xk\u001dUjQT*L\u001b";
        objectArray[125] = "\u001b>ll\f\u001c\u001d84em\u0012!\u007f3w\u0015A\u0018l<u\u0007\u007f\u0010>0}\u0014\u0003Zdwrm";
        objectArray[126] = "\rL$WWR\u0010Ku2\u000e\u0019\u0002D-[\rcU^&Y\b\b\u0003N3\ti";
        objectArray[127] = "\u001bZw\r\\+\u001fSs\u0013\"\u007f\u0013Pv\ru!I\u0004)a\u0012nJMv\u001b\u001e/\u001b\u0003";
        Object[] objectArray2 = objectArray;
        objectArray[128] = "QD\\mC\u000fUMXs=[YN]mj\u000f\u0002\u001b\u00029=\u0005G\u001bIeG\t\u0006J\u0007";
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/d9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'q' || c == 'f' || c == '\u00d1' || c == '\u00e4') {
                field = d9.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'q' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'f' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d1' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = d9.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e3' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ff' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = d9.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static int d(Object[] objectArray) {
        CallSite callSite;
        class_1792 class_17922;
        long l;
        block126: {
            CallSite callSite2;
            class_1792 class_17923;
            block125: {
                block124: {
                    block122: {
                        block123: {
                            block121: {
                                block120: {
                                    block119: {
                                        block117: {
                                            block118: {
                                                block116: {
                                                    block115: {
                                                        block114: {
                                                            block112: {
                                                                block113: {
                                                                    block111: {
                                                                        block110: {
                                                                            block109: {
                                                                                block108: {
                                                                                    block106: {
                                                                                        block107: {
                                                                                            block105: {
                                                                                                block104: {
                                                                                                    block103: {
                                                                                                        block101: {
                                                                                                            block102: {
                                                                                                                block100: {
                                                                                                                    block99: {
                                                                                                                        block98: {
                                                                                                                            class_17923 = (class_1792)objectArray[0];
                                                                                                                            l = (Long)objectArray[1];
                                                                                                                            l = k ^ l;
                                                                                                                            callSite2 = d9.d("\u00ff", (long)5391485807657090423L, (long)l);
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    class_17922 = class_17923;
                                                                                                                                    callSite = d9.d("\u00d1", (long)5392879097531778550L, (long)l);
                                                                                                                                    if (callSite2 != null) break block98;
                                                                                                                                    if (class_17922 == callSite) return (int)d9.c("r", (int)5340, (long)(0x7EAEED6B0A3DAEF9L ^ l));
                                                                                                                                }
                                                                                                                                catch (MatchException matchException) {
                                                                                                                                    throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                                                                                                                                }
                                                                                                                                class_17922 = class_17923;
                                                                                                                                callSite = d9.d("\u00d1", (long)5388939990278476607L, (long)l);
                                                                                                                            }
                                                                                                                            catch (MatchException matchException) {
                                                                                                                                throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                if (callSite2 != null) break block99;
                                                                                                                                if (class_17922 == callSite) return (int)d9.c("r", (int)5340, (long)(0x7EAEED6B0A3DAEF9L ^ l));
                                                                                                                            }
                                                                                                                            catch (MatchException matchException) {
                                                                                                                                throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                                                                                                                            }
                                                                                                                            class_17922 = class_17923;
                                                                                                                            callSite = d9.d("\u00d1", (long)5395216482336467489L, (long)l);
                                                                                                                        }
                                                                                                                        catch (MatchException matchException) {
                                                                                                                            throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            if (callSite2 != null) break block100;
                                                                                                                            if (class_17922 == callSite) return (int)d9.c("r", (int)5340, (long)(0x7EAEED6B0A3DAEF9L ^ l));
                                                                                                                        }
                                                                                                                        catch (MatchException matchException) {
                                                                                                                            throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                                                                                                                        }
                                                                                                                        class_17922 = class_17923;
                                                                                                                        callSite = d9.d("\u00d1", (long)5396520245506200962L, (long)l);
                                                                                                                    }
                                                                                                                    catch (MatchException matchException) {
                                                                                                                        throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                                                                                                                    }
                                                                                                                }
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        if (callSite2 != null) break block101;
                                                                                                                        if (class_17922 != callSite) break block102;
                                                                                                                        return (int)d9.c("r", (int)5340, (long)(0x7EAEED6B0A3DAEF9L ^ l));
                                                                                                                    }
                                                                                                                    catch (MatchException matchException) {
                                                                                                                        throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                                                                                                                    }
                                                                                                                }
                                                                                                                catch (MatchException matchException) {
                                                                                                                    throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                                                                                                                }
                                                                                                            }
                                                                                                            class_17922 = class_17923;
                                                                                                            callSite = d9.d("\u00d1", (long)5391202968355089253L, (long)l);
                                                                                                        }
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (callSite2 != null) break block103;
                                                                                                                if (class_17922 == callSite) return (int)d9.c("r", (int)5537, (long)(0x455A5D672C21AF81L ^ l));
                                                                                                            }
                                                                                                            catch (MatchException matchException) {
                                                                                                                throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                                                                                                            }
                                                                                                            class_17922 = class_17923;
                                                                                                            callSite = d9.d("\u00d1", (long)5393667369843478484L, (long)l);
                                                                                                        }
                                                                                                        catch (MatchException matchException) {
                                                                                                            throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                                                                                                        }
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (callSite2 != null) break block104;
                                                                                                            if (class_17922 == callSite) return (int)d9.c("r", (int)5537, (long)(0x455A5D672C21AF81L ^ l));
                                                                                                        }
                                                                                                        catch (MatchException matchException) {
                                                                                                            throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                                                                                                        }
                                                                                                        class_17922 = class_17923;
                                                                                                        callSite = d9.d("\u00d1", (long)5393127196933510555L, (long)l);
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    try {
                                                                                                        if (callSite2 != null) break block105;
                                                                                                        if (class_17922 == callSite) return (int)d9.c("r", (int)5537, (long)(0x455A5D672C21AF81L ^ l));
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                                                                                                    }
                                                                                                    class_17922 = class_17923;
                                                                                                    callSite = d9.d("\u00d1", (long)5393312680737097894L, (long)l);
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    if (callSite2 != null) break block106;
                                                                                                    if (class_17922 != callSite) break block107;
                                                                                                    return (int)d9.c("r", (int)5537, (long)(0x455A5D672C21AF81L ^ l));
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                                                                                                }
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                                                                                            }
                                                                                        }
                                                                                        class_17922 = class_17923;
                                                                                        callSite = d9.d("\u00d1", (long)5392091314473051870L, (long)l);
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            if (callSite2 != null) break block108;
                                                                                            if (class_17922 == callSite) return (int)d9.c("r", (int)7241, (long)(0x76C9E12CC94E266DL ^ l));
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                                                                                        }
                                                                                        class_17922 = class_17923;
                                                                                        callSite = d9.d("\u00d1", (long)5394754273347421445L, (long)l);
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        if (callSite2 != null) break block109;
                                                                                        if (class_17922 == callSite) return (int)d9.c("r", (int)7241, (long)(0x76C9E12CC94E266DL ^ l));
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                                                                                    }
                                                                                    class_17922 = class_17923;
                                                                                    callSite = d9.d("\u00d1", (long)5393991574748608998L, (long)l);
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                                                                                }
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    if (callSite2 != null) break block110;
                                                                                    if (class_17922 == callSite) return (int)d9.c("r", (int)7241, (long)(0x76C9E12CC94E266DL ^ l));
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                                                                                }
                                                                                class_17922 = class_17923;
                                                                                callSite = d9.d("\u00d1", (long)5389413650312407008L, (long)l);
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                                                                            }
                                                                        }
                                                                        try {
                                                                            try {
                                                                                if (callSite2 != null) break block111;
                                                                                if (class_17922 == callSite) return (int)d9.c("r", (int)7241, (long)(0x76C9E12CC94E266DL ^ l));
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                                                                            }
                                                                            class_17922 = class_17923;
                                                                            callSite = d9.d("\u00d1", (long)5394564194020237363L, (long)l);
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                                                                        }
                                                                    }
                                                                    try {
                                                                        try {
                                                                            if (callSite2 != null) break block112;
                                                                            if (class_17922 != callSite) break block113;
                                                                            return (int)d9.c("r", (int)7241, (long)(0x76C9E12CC94E266DL ^ l));
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                                                                        }
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                                                                    }
                                                                }
                                                                class_17922 = class_17923;
                                                                callSite = d9.d("\u00d1", (long)5393050736150403028L, (long)l);
                                                            }
                                                            try {
                                                                try {
                                                                    if (callSite2 != null) break block114;
                                                                    if (class_17922 == callSite) return (int)d9.c("r", (int)15218, (long)(0x2F4A93C15575815FL ^ l));
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                                                                }
                                                                class_17922 = class_17923;
                                                                callSite = d9.d("\u00d1", (long)5393541849677716434L, (long)l);
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                                                            }
                                                        }
                                                        try {
                                                            try {
                                                                if (callSite2 != null) break block115;
                                                                if (class_17922 == callSite) return (int)d9.c("r", (int)15218, (long)(0x2F4A93C15575815FL ^ l));
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                                                            }
                                                            class_17922 = class_17923;
                                                            callSite = d9.d("\u00d1", (long)5392533222008560202L, (long)l);
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            if (callSite2 != null) break block116;
                                                            if (class_17922 == callSite) return (int)d9.c("r", (int)15218, (long)(0x2F4A93C15575815FL ^ l));
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                                                        }
                                                        class_17922 = class_17923;
                                                        callSite = d9.d("\u00d1", (long)5394061141280024334L, (long)l);
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        if (callSite2 != null) break block117;
                                                        if (class_17922 != callSite) break block118;
                                                        return (int)d9.c("r", (int)15218, (long)(0x2F4A93C15575815FL ^ l));
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                                                    }
                                                }
                                                catch (MatchException matchException) {
                                                    throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                                                }
                                            }
                                            class_17922 = class_17923;
                                            callSite = d9.d("\u00d1", (long)5392043569173269405L, (long)l);
                                        }
                                        try {
                                            try {
                                                if (callSite2 != null) break block119;
                                                if (class_17922 == callSite) return (int)d9.c("r", (int)16925, (long)(0x283DC7B14AD4F835L ^ l));
                                            }
                                            catch (MatchException matchException) {
                                                throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                                            }
                                            class_17922 = class_17923;
                                            callSite = d9.d("\u00d1", (long)5391265356598363931L, (long)l);
                                        }
                                        catch (MatchException matchException) {
                                            throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                                        }
                                    }
                                    try {
                                        try {
                                            if (callSite2 != null) break block120;
                                            if (class_17922 == callSite) return (int)d9.c("r", (int)16925, (long)(0x283DC7B14AD4F835L ^ l));
                                        }
                                        catch (MatchException matchException) {
                                            throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                                        }
                                        class_17922 = class_17923;
                                        callSite = d9.d("\u00d1", (long)5389511626255931239L, (long)l);
                                    }
                                    catch (MatchException matchException) {
                                        throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                                    }
                                }
                                try {
                                    try {
                                        if (callSite2 != null) break block121;
                                        if (class_17922 == callSite) return (int)d9.c("r", (int)16925, (long)(0x283DC7B14AD4F835L ^ l));
                                    }
                                    catch (MatchException matchException) {
                                        throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                                    }
                                    class_17922 = class_17923;
                                    callSite = d9.d("\u00d1", (long)5393563962813673287L, (long)l);
                                }
                                catch (MatchException matchException) {
                                    throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                                }
                            }
                            try {
                                try {
                                    if (callSite2 != null) break block122;
                                    if (class_17922 != callSite) break block123;
                                    return (int)d9.c("r", (int)16925, (long)(0x283DC7B14AD4F835L ^ l));
                                }
                                catch (MatchException matchException) {
                                    throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                                }
                            }
                            catch (MatchException matchException) {
                                throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                            }
                        }
                        class_17922 = class_17923;
                        callSite = d9.d("\u00d1", (long)5391958066157343077L, (long)l);
                    }
                    try {
                        try {
                            if (callSite2 != null) break block124;
                            if (class_17922 == callSite) return (int)d9.c("r", (int)2058, (long)(0x50821C23FFA7B22DL ^ l));
                        }
                        catch (MatchException matchException) {
                            throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                        }
                        class_17922 = class_17923;
                        callSite = d9.d("\u00d1", (long)5394674003489238564L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                    }
                }
                try {
                    try {
                        if (callSite2 != null) break block125;
                        if (class_17922 == callSite) return (int)d9.c("r", (int)2058, (long)(0x50821C23FFA7B22DL ^ l));
                    }
                    catch (MatchException matchException) {
                        throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                    }
                    class_17922 = class_17923;
                    callSite = d9.d("\u00d1", (long)5388870386430170664L, (long)l);
                }
                catch (MatchException matchException) {
                    throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                }
            }
            try {
                try {
                    if (callSite2 != null) break block126;
                    if (class_17922 == callSite) return (int)d9.c("r", (int)2058, (long)(0x50821C23FFA7B22DL ^ l));
                }
                catch (MatchException matchException) {
                    throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
                }
                class_17922 = class_17923;
                callSite = d9.d("\u00d1", (long)5391380264249361981L, (long)l);
            }
            catch (MatchException matchException) {
                throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
            }
        }
        try {
            if (class_17922 != callSite) return 0;
            return (int)d9.c("r", (int)2058, (long)(0x50821C23FFA7B22DL ^ l));
        }
        catch (MatchException matchException) {
            throw d9.d("\u00ff", (Object)matchException, (long)5393394154392993552L, (long)l);
        }
    }

    /*
     * Exception decompiling
     */
    private boolean d(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 11[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static class_1304 a(Object[] objectArray) {
        CallSite callSite;
        class_1792 class_17922;
        long l;
        block124: {
            CallSite callSite2;
            class_1792 class_17923;
            block123: {
                block122: {
                    block121: {
                        block120: {
                            block118: {
                                block119: {
                                    block117: {
                                        block116: {
                                            block115: {
                                                block114: {
                                                    block113: {
                                                        block111: {
                                                            block112: {
                                                                block110: {
                                                                    block109: {
                                                                        block108: {
                                                                            block107: {
                                                                                block106: {
                                                                                    block104: {
                                                                                        block105: {
                                                                                            block103: {
                                                                                                block102: {
                                                                                                    block101: {
                                                                                                        block100: {
                                                                                                            block99: {
                                                                                                                block98: {
                                                                                                                    class_17923 = (class_1792)objectArray[0];
                                                                                                                    l = (Long)objectArray[1];
                                                                                                                    l = k ^ l;
                                                                                                                    callSite2 = d9.d("\u00ff", (long)-3872120528231891482L, (long)l);
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            class_17922 = class_17923;
                                                                                                                            callSite = d9.d("\u00d1", (long)-3871323452840721049L, (long)l);
                                                                                                                            if (callSite2 != null) break block98;
                                                                                                                            if (class_17922 == callSite) return d9.d("\u00d1", (long)-3869750642695274357L, (long)l);
                                                                                                                        }
                                                                                                                        catch (MatchException matchException) {
                                                                                                                            throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                                                                                                                        }
                                                                                                                        class_17922 = class_17923;
                                                                                                                        callSite = d9.d("\u00d1", (long)-3872964103431607308L, (long)l);
                                                                                                                    }
                                                                                                                    catch (MatchException matchException) {
                                                                                                                        throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                                                                                                                    }
                                                                                                                }
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        if (callSite2 != null) break block99;
                                                                                                                        if (class_17922 == callSite) return d9.d("\u00d1", (long)-3869750642695274357L, (long)l);
                                                                                                                    }
                                                                                                                    catch (MatchException matchException) {
                                                                                                                        throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                                                                                                                    }
                                                                                                                    class_17922 = class_17923;
                                                                                                                    callSite = d9.d("\u00d1", (long)-3871513101657823665L, (long)l);
                                                                                                                }
                                                                                                                catch (MatchException matchException) {
                                                                                                                    throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                                                                                                                }
                                                                                                            }
                                                                                                            try {
                                                                                                                try {
                                                                                                                    if (callSite2 != null) break block100;
                                                                                                                    if (class_17922 == callSite) return d9.d("\u00d1", (long)-3869750642695274357L, (long)l);
                                                                                                                }
                                                                                                                catch (MatchException matchException) {
                                                                                                                    throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                                                                                                                }
                                                                                                                class_17922 = class_17923;
                                                                                                                callSite = d9.d("\u00d1", (long)-3871562766757655796L, (long)l);
                                                                                                            }
                                                                                                            catch (MatchException matchException) {
                                                                                                                throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                                                                                                            }
                                                                                                        }
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (callSite2 != null) break block101;
                                                                                                                if (class_17922 == callSite) return d9.d("\u00d1", (long)-3869750642695274357L, (long)l);
                                                                                                            }
                                                                                                            catch (MatchException matchException) {
                                                                                                                throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                                                                                                            }
                                                                                                            class_17922 = class_17923;
                                                                                                            callSite = d9.d("\u00d1", (long)-3871153727722236091L, (long)l);
                                                                                                        }
                                                                                                        catch (MatchException matchException) {
                                                                                                            throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                                                                                                        }
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (callSite2 != null) break block102;
                                                                                                            if (class_17922 == callSite) return d9.d("\u00d1", (long)-3869750642695274357L, (long)l);
                                                                                                        }
                                                                                                        catch (MatchException matchException) {
                                                                                                            throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                                                                                                        }
                                                                                                        class_17922 = class_17923;
                                                                                                        callSite = d9.d("\u00d1", (long)-3871683456260582924L, (long)l);
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    try {
                                                                                                        if (callSite2 != null) break block103;
                                                                                                        if (class_17922 == callSite) return d9.d("\u00d1", (long)-3869750642695274357L, (long)l);
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                                                                                                    }
                                                                                                    class_17922 = class_17923;
                                                                                                    callSite = d9.d("\u00d1", (long)-3869640265516539742L, (long)l);
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    if (callSite2 != null) break block104;
                                                                                                    if (class_17922 != callSite) break block105;
                                                                                                    return d9.d("\u00d1", (long)-3869750642695274357L, (long)l);
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                                                                                                }
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                                                                                            }
                                                                                        }
                                                                                        class_17922 = class_17923;
                                                                                        callSite = d9.d("\u00d1", (long)-3866255079493692498L, (long)l);
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            if (callSite2 != null) break block106;
                                                                                            if (class_17922 == callSite) return d9.d("\u00d1", (long)-3869895337650579997L, (long)l);
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                                                                                        }
                                                                                        class_17922 = class_17923;
                                                                                        callSite = d9.d("\u00d1", (long)-3869939228013342907L, (long)l);
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        if (callSite2 != null) break block107;
                                                                                        if (class_17922 == callSite) return d9.d("\u00d1", (long)-3869895337650579997L, (long)l);
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                                                                                    }
                                                                                    class_17922 = class_17923;
                                                                                    callSite = d9.d("\u00d1", (long)-3868850129823054444L, (long)l);
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                                                                                }
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    if (callSite2 != null) break block108;
                                                                                    if (class_17922 == callSite) return d9.d("\u00d1", (long)-3869895337650579997L, (long)l);
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                                                                                }
                                                                                class_17922 = class_17923;
                                                                                callSite = d9.d("\u00d1", (long)-3872939115798149238L, (long)l);
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                                                                            }
                                                                        }
                                                                        try {
                                                                            try {
                                                                                if (callSite2 != null) break block109;
                                                                                if (class_17922 == callSite) return d9.d("\u00d1", (long)-3869895337650579997L, (long)l);
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                                                                            }
                                                                            class_17922 = class_17923;
                                                                            callSite = d9.d("\u00d1", (long)-3870662874016326845L, (long)l);
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                                                                        }
                                                                    }
                                                                    try {
                                                                        try {
                                                                            if (callSite2 != null) break block110;
                                                                            if (class_17922 == callSite) return d9.d("\u00d1", (long)-3869895337650579997L, (long)l);
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                                                                        }
                                                                        class_17922 = class_17923;
                                                                        callSite = d9.d("\u00d1", (long)-3869530722284196171L, (long)l);
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        if (callSite2 != null) break block111;
                                                                        if (class_17922 != callSite) break block112;
                                                                        return d9.d("\u00d1", (long)-3869895337650579997L, (long)l);
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                                                                    }
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                                                                }
                                                            }
                                                            class_17922 = class_17923;
                                                            callSite = d9.d("\u00d1", (long)-3868950598141875536L, (long)l);
                                                        }
                                                        try {
                                                            try {
                                                                if (callSite2 != null) break block113;
                                                                if (class_17922 == callSite) return d9.d("\u00d1", (long)-3871963912582706370L, (long)l);
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                                                            }
                                                            class_17922 = class_17923;
                                                            callSite = d9.d("\u00d1", (long)-3870512105003100918L, (long)l);
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            if (callSite2 != null) break block114;
                                                            if (class_17922 == callSite) return d9.d("\u00d1", (long)-3871963912582706370L, (long)l);
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                                                        }
                                                        class_17922 = class_17923;
                                                        callSite = d9.d("\u00d1", (long)-3870175505678354057L, (long)l);
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        if (callSite2 != null) break block115;
                                                        if (class_17922 == callSite) return d9.d("\u00d1", (long)-3871963912582706370L, (long)l);
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                                                    }
                                                    class_17922 = class_17923;
                                                    callSite = d9.d("\u00d1", (long)-3865648244229269514L, (long)l);
                                                }
                                                catch (MatchException matchException) {
                                                    throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                                                }
                                            }
                                            try {
                                                try {
                                                    if (callSite2 != null) break block116;
                                                    if (class_17922 == callSite) return d9.d("\u00d1", (long)-3871963912582706370L, (long)l);
                                                }
                                                catch (MatchException matchException) {
                                                    throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                                                }
                                                class_17922 = class_17923;
                                                callSite = d9.d("\u00d1", (long)-3871071174719399205L, (long)l);
                                            }
                                            catch (MatchException matchException) {
                                                throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                                            }
                                        }
                                        try {
                                            try {
                                                if (callSite2 != null) break block117;
                                                if (class_17922 == callSite) return d9.d("\u00d1", (long)-3871963912582706370L, (long)l);
                                            }
                                            catch (MatchException matchException) {
                                                throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                                            }
                                            class_17922 = class_17923;
                                            callSite = d9.d("\u00d1", (long)-3866326865303939399L, (long)l);
                                        }
                                        catch (MatchException matchException) {
                                            throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                                        }
                                    }
                                    try {
                                        try {
                                            if (callSite2 != null) break block118;
                                            if (class_17922 != callSite) break block119;
                                            return d9.d("\u00d1", (long)-3871963912582706370L, (long)l);
                                        }
                                        catch (MatchException matchException) {
                                            throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                                        }
                                    }
                                    catch (MatchException matchException) {
                                        throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                                    }
                                }
                                class_17922 = class_17923;
                                callSite = d9.d("\u00d1", (long)-3858076687802477293L, (long)l);
                            }
                            try {
                                try {
                                    if (callSite2 != null) break block120;
                                    if (class_17922 == callSite) return d9.d("\u00d1", (long)-3871465644355755384L, (long)l);
                                }
                                catch (MatchException matchException) {
                                    throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                                }
                                class_17922 = class_17923;
                                callSite = d9.d("\u00d1", (long)-3870293655185438665L, (long)l);
                            }
                            catch (MatchException matchException) {
                                throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                            }
                        }
                        try {
                            try {
                                if (callSite2 != null) break block121;
                                if (class_17922 == callSite) return d9.d("\u00d1", (long)-3871465644355755384L, (long)l);
                            }
                            catch (MatchException matchException) {
                                throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                            }
                            class_17922 = class_17923;
                            callSite = d9.d("\u00d1", (long)-3865748696179431567L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                        }
                    }
                    try {
                        try {
                            if (callSite2 != null) break block122;
                            if (class_17922 == callSite) return d9.d("\u00d1", (long)-3871465644355755384L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                        }
                        class_17922 = class_17923;
                        callSite = d9.d("\u00d1", (long)-3870605307997327402L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                    }
                }
                try {
                    try {
                        if (callSite2 != null) break block123;
                        if (class_17922 == callSite) return d9.d("\u00d1", (long)-3871465644355755384L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                    }
                    class_17922 = class_17923;
                    callSite = d9.d("\u00d1", (long)-3870105949893859425L, (long)l);
                }
                catch (MatchException matchException) {
                    throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                }
            }
            try {
                try {
                    if (callSite2 != null) break block124;
                    if (class_17922 == callSite) return d9.d("\u00d1", (long)-3871465644355755384L, (long)l);
                }
                catch (MatchException matchException) {
                    throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
                }
                class_17922 = class_17923;
                callSite = d9.d("\u00d1", (long)-3872226056699509076L, (long)l);
            }
            catch (MatchException matchException) {
                throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
            }
        }
        try {
            if (class_17922 != callSite) return null;
            return d9.d("\u00d1", (long)-3871465644355755384L, (long)l);
        }
        catch (MatchException matchException) {
            throw d9.d("\u00ff", (Object)matchException, (long)-3870775384902746239L, (long)l);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static int a(Object[] var0) {
        block8: {
            var1_1 = (class_1304)var0[0];
            var2_2 = (Long)var0[1];
            var2_2 = d9.k ^ var2_2;
            var4_3 = d9.d("\u00ff", (long)8664926681489985509L, (long)var2_2);
            try {
                v0 /* !! */  = aj_0.a[d9.d("\u00e3", (Object)var1_1, (long)8667600423457174390L, (long)var2_2)];
                if (var4_3 != null) break block8;
            }
            catch (MatchException v1) {
                throw d9.d("\u00ff", (Object)v1, (long)8668101377009192322L, (long)var2_2);
            }
            {
                ** switch (v0 /* !! */ )
            }
lbl-1000:
            // 1 sources

            {
                case 1: {
                    v0 /* !! */  = 5;
                    break;
                }
lbl16:
                // 1 sources

                case 2: {
                    v0 /* !! */  = (int)d9.c("r", (int)1261, (long)(4391014033421208662L ^ var2_2));
                    break;
                }
lbl19:
                // 1 sources

                case 3: {
                    v0 /* !! */  = (int)d9.c("r", (int)9698, (long)(3005655468873657686L ^ var2_2));
                    break;
                }
lbl22:
                // 1 sources

                case 4: {
                    v0 /* !! */  = (int)d9.c("r", (int)11277, (long)(3302404781865804989L ^ var2_2));
                    break;
                }
lbl25:
                // 1 sources

                default: {
                    v0 /* !! */  = -1;
                }
            }
        }
        return v0 /* !! */ ;
    }

    private boolean a(Object[] objectArray) {
        int n;
        Object object;
        long l;
        long l2;
        block71: {
            Object object2;
            int n2;
            long l3;
            class_1304 class_13042;
            block72: {
                CallSite callSite;
                block60: {
                    Object object3;
                    long l4;
                    long l5;
                    long l6;
                    block58: {
                        CallSite callSite2;
                        block56: {
                            CallSite callSite3;
                            block57: {
                                CallSite callSite4;
                                block54: {
                                    block55: {
                                        block52: {
                                            CallSite callSite5;
                                            block53: {
                                                block51: {
                                                    class_13042 = (class_1304)objectArray[0];
                                                    l2 = (Long)objectArray[1];
                                                    long l7 = l2 = k ^ l2;
                                                    l6 = l7 ^ 0x2C4BC76A81B6L;
                                                    l = l7 ^ 0x7FAAB9B73AE2L;
                                                    l5 = l7 ^ 0x1D86FCC9B1ABL;
                                                    l4 = l7 ^ 0x4F6F84650123L;
                                                    l3 = l7 ^ 0x5A46AB5433B5L;
                                                    callSite3 = d9.d("\u00e3", (Object)d9.d("q", (Object)b, (long)1870912884416658319L, (long)l2), (Object)class_13042, (long)1868017474567606590L, (long)l2);
                                                    callSite = d9.d("\u00ff", (long)1867634276832292430L, (long)l2);
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (class_13042 != d9.d("\u00d1", (long)1865338168823662155L, (long)l2)) break block51;
                                                                        callSite4 = d9.d("\u00e3", (Object)callSite3, (long)1867479917977353270L, (long)l2);
                                                                        if (callSite != null) break block52;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw d9.d("\u00ff", (Object)matchException, (long)1864600009565563945L, (long)l2);
                                                                    }
                                                                    if (callSite4 != false) break block51;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw d9.d("\u00ff", (Object)matchException, (long)1864600009565563945L, (long)l2);
                                                                }
                                                                callSite5 = callSite3;
                                                                if (callSite != null) break block53;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw d9.d("\u00ff", (Object)matchException, (long)1864600009565563945L, (long)l2);
                                                            }
                                                            if (d9.d("\u00e3", (Object)callSite5, (long)1867395153018493034L, (long)l2) != d9.d("\u00d1", (long)1865560154777787506L, (long)l2)) break block51;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw d9.d("\u00ff", (Object)matchException, (long)1864600009565563945L, (long)l2);
                                                        }
                                                        return false;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw d9.d("\u00ff", (Object)matchException, (long)1864600009565563945L, (long)l2);
                                                    }
                                                }
                                                callSite5 = callSite3;
                                            }
                                            callSite4 = d9.d("\u00e3", (Object)callSite5, (long)1867479917977353270L, (long)l2);
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (callSite != null) break block54;
                                                        if (callSite4 != false) break block55;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw d9.d("\u00ff", (Object)matchException, (long)1864600009565563945L, (long)l2);
                                                    }
                                                    Object[] objectArray2 = new Object[3];
                                                    objectArray2[2] = l4;
                                                    objectArray2[1] = d9.d("\u00d1", (long)1867073095442914683L, (long)l2);
                                                    objectArray2[0] = callSite3;
                                                    callSite4 = d9.d("\u00ff", (Object)objectArray2, (long)1865148218454519554L, (long)l2);
                                                    if (callSite != null) break block54;
                                                }
                                                catch (MatchException matchException) {
                                                    throw d9.d("\u00ff", (Object)matchException, (long)1864600009565563945L, (long)l2);
                                                }
                                                if (callSite4 == false) break block55;
                                            }
                                            catch (MatchException matchException) {
                                                throw d9.d("\u00ff", (Object)matchException, (long)1864600009565563945L, (long)l2);
                                            }
                                            return false;
                                        }
                                        catch (MatchException matchException) {
                                            throw d9.d("\u00ff", (Object)matchException, (long)1864600009565563945L, (long)l2);
                                        }
                                    }
                                    try {
                                        callSite2 = callSite3;
                                        if (callSite != null) break block56;
                                        callSite4 = d9.d("\u00e3", (Object)callSite2, (long)1867479917977353270L, (long)l2);
                                    }
                                    catch (MatchException matchException) {
                                        throw d9.d("\u00ff", (Object)matchException, (long)1864600009565563945L, (long)l2);
                                    }
                                }
                                try {
                                    if (callSite4 == false) break block57;
                                    object3 = -1;
                                    break block58;
                                }
                                catch (MatchException matchException) {
                                    throw d9.d("\u00ff", (Object)matchException, (long)1864600009565563945L, (long)l2);
                                }
                            }
                            callSite2 = callSite3;
                        }
                        Object[] objectArray3 = new Object[2];
                        objectArray3[1] = l5;
                        objectArray3[0] = callSite2;
                        object3 = d9.d("\u00ff", (Object)objectArray3, (long)1869417156840318939L, (long)l2);
                    }
                    int n3 = object3;
                    n2 = -1;
                    Object object4 = n3;
                    object2 = 0;
                    while (object2 < d9.c("r", (int)10705, (long)(0x61BBE672C589C0CBL ^ l2))) {
                        block68: {
                            block62: {
                                int n4;
                                block73: {
                                    block70: {
                                        Object object5;
                                        Object object6;
                                        block69: {
                                            CallSite callSite6;
                                            block65: {
                                                CallSite callSite7;
                                                block66: {
                                                    block67: {
                                                        CallSite callSite8;
                                                        block63: {
                                                            block64: {
                                                                CallSite callSite9;
                                                                block59: {
                                                                    block61: {
                                                                        callSite7 = d9.d("\u00e3", (Object)d9.d("\u00e3", (Object)d9.d("q", (Object)b, (long)1870912884416658319L, (long)l2), (long)1866092513779759488L, (long)l2), (int)object2, (long)1868655974894741313L, (long)l2);
                                                                        try {
                                                                            try {
                                                                                callSite9 = callSite7;
                                                                                if (callSite != null) break block59;
                                                                                object = d9.d("\u00e3", (Object)callSite9, (long)1867479917977353270L, (long)l2);
                                                                                if (callSite != null) break block60;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw d9.d("\u00ff", (Object)matchException, (long)1864600009565563945L, (long)l2);
                                                                            }
                                                                            if (object == 0) break block61;
                                                                            break block62;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw d9.d("\u00ff", (Object)matchException, (long)1864600009565563945L, (long)l2);
                                                                        }
                                                                    }
                                                                    callSite9 = callSite7;
                                                                }
                                                                try {
                                                                    try {
                                                                        Object[] objectArray4 = new Object[2];
                                                                        objectArray4[1] = l6;
                                                                        objectArray4[0] = d9.d("\u00e3", (Object)callSite9, (long)1867395153018493034L, (long)l2);
                                                                        callSite8 = d9.d("\u00ff", (Object)objectArray4, (long)1866607090751580386L, (long)l2);
                                                                        if (callSite != null) break block63;
                                                                        if (callSite8 == class_13042) break block64;
                                                                        break block62;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw d9.d("\u00ff", (Object)matchException, (long)1864600009565563945L, (long)l2);
                                                                    }
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw d9.d("\u00ff", (Object)matchException, (long)1864600009565563945L, (long)l2);
                                                                }
                                                            }
                                                            callSite8 = d9.d("\u00e3", (Object)this.d, (long)1867144778975077627L, (long)l2);
                                                        }
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        callSite6 = d9.d("\u00e3", (Object)((Boolean)((Object)callSite8)), (long)1868964986155348205L, (long)l2);
                                                                        if (callSite != null) break block65;
                                                                        if (callSite6 == false) break block66;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw d9.d("\u00ff", (Object)matchException, (long)1864600009565563945L, (long)l2);
                                                                    }
                                                                    Object[] objectArray5 = new Object[3];
                                                                    objectArray5[2] = l4;
                                                                    objectArray5[1] = d9.d("\u00d1", (long)1867073095442914683L, (long)l2);
                                                                    objectArray5[0] = callSite7;
                                                                    callSite6 = d9.d("\u00ff", (Object)objectArray5, (long)1865148218454519554L, (long)l2);
                                                                    if (callSite != null) break block67;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw d9.d("\u00ff", (Object)matchException, (long)1864600009565563945L, (long)l2);
                                                                }
                                                                if (callSite6 != false) break block62;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw d9.d("\u00ff", (Object)matchException, (long)1864600009565563945L, (long)l2);
                                                            }
                                                            Object[] objectArray6 = new Object[3];
                                                            objectArray6[2] = l4;
                                                            objectArray6[1] = d9.d("\u00d1", (long)1869744144180479901L, (long)l2);
                                                            objectArray6[0] = callSite7;
                                                            callSite6 = d9.d("\u00ff", (Object)objectArray6, (long)1865148218454519554L, (long)l2);
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw d9.d("\u00ff", (Object)matchException, (long)1864600009565563945L, (long)l2);
                                                        }
                                                    }
                                                    try {
                                                        if (callSite != null) break block65;
                                                        if (callSite6 == false) break block66;
                                                        break block62;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw d9.d("\u00ff", (Object)matchException, (long)1864600009565563945L, (long)l2);
                                                    }
                                                }
                                                Object[] objectArray7 = new Object[2];
                                                objectArray7[1] = l5;
                                                objectArray7[0] = callSite7;
                                                callSite6 = d9.d("\u00ff", (Object)objectArray7, (long)1869417156840318939L, (long)l2);
                                            }
                                            CallSite callSite10 = callSite6;
                                            try {
                                                if (callSite != null) break block68;
                                                if (callSite10 <= object4) break block62;
                                            }
                                            catch (MatchException matchException) {
                                                throw d9.d("\u00ff", (Object)matchException, (long)1864600009565563945L, (long)l2);
                                            }
                                            object4 = callSite10;
                                            try {
                                                try {
                                                    object6 = object2;
                                                    object5 = d9.c("r", (int)30500, (long)(0x3E3E5D523FE41E37L ^ l2));
                                                    if (callSite != null) break block69;
                                                    if (object6 >= object5) break block70;
                                                }
                                                catch (MatchException matchException) {
                                                    throw d9.d("\u00ff", (Object)matchException, (long)1864600009565563945L, (long)l2);
                                                }
                                                object6 = d9.c("r", (int)12713, (long)(0x75473CB5CB3658B1L ^ l2));
                                                object5 = object2;
                                            }
                                            catch (MatchException matchException) {
                                                throw d9.d("\u00ff", (Object)matchException, (long)1864600009565563945L, (long)l2);
                                            }
                                        }
                                        n4 = object6 + object5;
                                        break block73;
                                    }
                                    n4 = object2;
                                }
                                n2 = n4;
                            }
                            ++object2;
                        }
                        if (callSite == null) continue;
                    }
                    object = n2;
                }
                try {
                    try {
                        n = -1;
                        if (callSite != null) break block71;
                        if (object != n) break block72;
                    }
                    catch (MatchException matchException) {
                        throw d9.d("\u00ff", (Object)matchException, (long)1864600009565563945L, (long)l2);
                    }
                    return false;
                }
                catch (MatchException matchException) {
                    throw d9.d("\u00ff", (Object)matchException, (long)1864600009565563945L, (long)l2);
                }
            }
            Object[] objectArray8 = new Object[2];
            objectArray8[1] = l3;
            objectArray8[0] = class_13042;
            object2 = d9.d("\u00ff", (Object)objectArray8, (long)1867165144233201209L, (long)l2);
            Object[] objectArray9 = new Object[4];
            objectArray9[3] = l;
            objectArray9[2] = d9.d("\u00d1", (long)1870759918535890820L, (long)l2);
            objectArray9[1] = 0;
            objectArray9[0] = n2;
            d9.d("\u00ff", (Object)objectArray9, (long)1866526853361973979L, (long)l2);
            Object[] objectArray10 = new Object[4];
            objectArray10[3] = l;
            objectArray10[2] = d9.d("\u00d1", (long)1870759918535890820L, (long)l2);
            objectArray10[1] = 0;
            objectArray10[0] = object2;
            d9.d("\u00ff", (Object)objectArray10, (long)1866526853361973979L, (long)l2);
            object = n2;
            n = 0;
        }
        Object[] objectArray11 = new Object[4];
        objectArray11[3] = l;
        objectArray11[2] = d9.d("\u00d1", (long)1870759918535890820L, (long)l2);
        objectArray11[1] = n;
        objectArray11[0] = object;
        d9.d("\u00ff", (Object)objectArray11, (long)1866526853361973979L, (long)l2);
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @bP
    public void a(bG bG2) {
        CallSite callSite;
        CallSite callSite2;
        long l;
        long l2;
        long l3;
        block16: {
            long l4;
            block17: {
                class_310 class_3102;
                long l5;
                block15: {
                    long l6 = l3 = k ^ 0x5BD2B360321DL;
                    l2 = l6 ^ 0x7F158A017F9EL;
                    l5 = l6 ^ 0x2841D346470FL;
                    l4 = l6 ^ 0x46F6F408B52L;
                    l = l6 ^ 0x7037A4A62BE0L;
                    callSite2 = d9.d("\u00ff", (long)6923486840799483824L, (long)l3);
                    try {
                        try {
                            class_3102 = b;
                            if (callSite2 != null) break block15;
                            if (d9.d("q", (Object)class_3102, (long)6920010318987149937L, (long)l3) == null) return;
                        }
                        catch (MatchException matchException) {
                            throw d9.d("\u00ff", (Object)matchException, (long)6926081268832998871L, (long)l3);
                        }
                        class_3102 = b;
                    }
                    catch (MatchException matchException) {
                        throw d9.d("\u00ff", (Object)matchException, (long)6926081268832998871L, (long)l3);
                    }
                }
                try {
                    if (d9.d("q", (Object)class_3102, (long)6923595833589000168L, (long)l3) == null) {
                        return;
                    }
                }
                catch (MatchException matchException) {
                    throw d9.d("\u00ff", (Object)matchException, (long)6926081268832998871L, (long)l3);
                }
                try {
                    Object[] objectArray = new Object[2];
                    objectArray[1] = l5;
                    objectArray[0] = Float.valueOf((float)d9.d("\u00e3", (Object)((Integer)((Object)d9.d("\u00e3", (Object)this.c, (long)6924125732857158917L, (long)l3))), (long)6926040903024816625L, (long)l3));
                    callSite = d9.d("\u00e3", (Object)this.e, (Object)objectArray, (long)6922020338890413537L, (long)l3);
                    if (callSite2 != null) break block16;
                    if (callSite != false) break block17;
                    return;
                }
                catch (MatchException matchException) {
                    throw d9.d("\u00ff", (Object)matchException, (long)6926081268832998871L, (long)l3);
                }
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l4;
            callSite = d9.d("\u00e3", (Object)this, (Object)objectArray, (long)6922318377631176157L, (long)l3);
        }
        if (callSite == false) {
            return;
        }
        class_1304[] class_1304Array = g;
        int n = class_1304Array.length;
        int n2 = 0;
        while (n2 < n) {
            block18: {
                block19: {
                    class_1304 class_13042 = class_1304Array[n2];
                    try {
                        try {
                            if (callSite2 != null) break block18;
                            Object[] objectArray = new Object[2];
                            objectArray[1] = l;
                            objectArray[0] = class_13042;
                            if (d9.d("\u00e3", (Object)this, (Object)objectArray, (long)6922507154844939245L, (long)l3) == false) break block19;
                        }
                        catch (MatchException matchException) {
                            throw d9.d("\u00ff", (Object)matchException, (long)6926081268832998871L, (long)l3);
                        }
                        Object[] objectArray = new Object[1];
                        objectArray[0] = l2;
                        d9.d("\u00e3", (Object)this.e, (Object)objectArray, (long)6924988981625989205L, (long)l3);
                        return;
                    }
                    catch (MatchException matchException) {
                        throw d9.d("\u00ff", (Object)matchException, (long)6926081268832998871L, (long)l3);
                    }
                }
                ++n2;
            }
            if (callSite2 == null) continue;
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
            case 0 -> 7;
            case 1 -> 45;
            case 2 -> 10;
            case 3 -> 11;
            case 4 -> 52;
            case 5 -> 1;
            case 6 -> 63;
            case 7 -> 46;
            case 8 -> 61;
            case 9 -> 5;
            case 10 -> 6;
            case 11 -> 9;
            case 12 -> 34;
            case 13 -> 28;
            case 14 -> 37;
            case 15 -> 39;
            case 16 -> 2;
            case 17 -> 55;
            case 18 -> 12;
            case 19 -> 33;
            case 20 -> 23;
            case 21 -> 35;
            case 22 -> 48;
            case 23 -> 22;
            case 24 -> 29;
            case 25 -> 51;
            case 26 -> 15;
            case 27 -> 0;
            case 28 -> 44;
            case 29 -> 18;
            case 30 -> 58;
            case 31 -> 8;
            case 32 -> 53;
            case 33 -> 26;
            case 34 -> 59;
            case 35 -> 27;
            case 36 -> 13;
            case 37 -> 16;
            case 38 -> 50;
            case 39 -> 43;
            case 40 -> 62;
            case 41 -> 56;
            case 42 -> 40;
            case 43 -> 4;
            case 44 -> 57;
            case 45 -> 42;
            case 46 -> 54;
            case 47 -> 60;
            case 48 -> 17;
            case 49 -> 32;
            case 50 -> 21;
            case 51 -> 14;
            case 52 -> 36;
            case 53 -> 38;
            case 54 -> 47;
            case 55 -> 31;
            case 56 -> 24;
            case 57 -> 41;
            case 58 -> 49;
            case 59 -> 19;
            case 60 -> 25;
            case 61 -> 3;
            case 62 -> 30;
            default -> 20;
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
        d9.s[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = d9.m(l, l2);
        Object object = r[n];
        if (object instanceof String) {
            String string = s[n];
            int n2 = string.indexOf(8);
            Class clazz = d9.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = d9.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = d9.g(clazz3, string2, clazz2)) != null) {
                    d9.r[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = d9.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        d9.r[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = d9.n(1483148482062566L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = d9.m(l, l2);
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
                clazz3 = d9.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = d9.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = d9.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        d9.r[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = d9.n(1483148482062566L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = d9.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        d9.r[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = d9.n(1483148482062566L, 0L);
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

    private boolean lambda$new$0(Integer n) {
        long l = k ^ 0x653FE10C1A66L;
        return (boolean)d9.d("\u00e3", (String)((Object)d9.d("\u00e3", (Object)this.a, (long)5218635430605075838L, (long)l)), (Object)d9.b("m", (int)6107, (long)(0x3DD650411D0B9D23L ^ l)), (long)5218934949692683238L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(d9.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(d9.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(d9.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


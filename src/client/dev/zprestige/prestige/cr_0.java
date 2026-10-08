/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1293
 *  net.minecraft.class_1707
 *  net.minecraft.class_1713
 *  net.minecraft.class_1723
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1844
 *  net.minecraft.class_2248
 *  net.minecraft.class_490
 *  net.minecraft.class_6880
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.cz_0;
import dev.zprestige.prestige.hc;
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
import net.minecraft.class_1293;
import net.minecraft.class_1707;
import net.minecraft.class_1713;
import net.minecraft.class_1723;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1844;
import net.minecraft.class_2248;
import net.minecraft.class_490;
import net.minecraft.class_6880;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.cr
 */
public class cr_0
implements cz_0 {
    private static final long a;
    private static final long[] c;
    private static final Integer[] d;
    private static final Map e;
    private static final Object[] f;
    private static final String[] g;

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                cr_0.a = hc.a(2169213755250312360L, 4793247230424253137L, MethodHandles.lookup().lookupClass()).a(42759622861702L);
                cr_0.f = new Object[135];
                cr_0.g = new String[135];
                cr_0.a();
                cr_0.e = new HashMap<K, V>(13);
                var0 = cr_0.a ^ 103343735916297L;
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
                var8_3 = new long[6];
                var5_4 = 0;
                var6_5 = "G2gqM\u00af\u008f\u00a6\u00e9\u009a=d\u00a3\u00c2g\u00b6\u0005[\u00a0 \u00d3 s\u00d6;\u0085\"\";\u00f3\u00fd\u00eb";
                var7_6 = "G2gqM\u00af\u008f\u00a6\u00e9\u009a=d\u00a3\u00c2g\u00b6\u0005[\u00a0 \u00d3 s\u00d6;\u0085\"\";\u00f3\u00fd\u00eb".length();
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
                    var6_5 = "=\u00c8n}\u001fM\u008d\u0097\u00e3\u00fcU\u0096l\u00e4Q-";
                    var7_6 = "=\u00c8n}\u001fM\u008d\u0097\u00e3\u00fcU\u0096l\u00e4Q-".length();
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
        cr_0.c = var8_3;
        cr_0.d = new Integer[6];
    }

    public static Integer e(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        class_6880 class_68802 = (class_6880)objectArray[2];
        long l = (Long)objectArray[3];
        long l2 = (l = a ^ l) ^ 0x11A46D096830L;
        CallSite callSite = cr_0.b("e", (long)5274521254382247000L, (long)l);
        for (int i = n; i < n2; ++i) {
            Object object;
            block14: {
                CallSite callSite2 = cr_0.b("\u00b5", (Object)cr_0.b("\u00b5", (Object)cr_0.b("\u00fe", (Object)b, (long)5273053897068739646L, (long)l), (long)5274102925935233058L, (long)l), (int)i, (long)5275093523356846842L, (long)l);
                try {
                    block13: {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            if (cr_0.b("\u00b5", (Object)callSite2, (long)5274707072746561805L, (long)l) != cr_0.b("n", (long)5273722695019637921L, (long)l) && callSite == null) continue;
                                        }
                                        catch (MatchException matchException) {
                                            throw cr_0.b("e", (Object)matchException, (long)5276087924799820385L, (long)l);
                                        }
                                        if (class_68802 == null) break block13;
                                    }
                                    catch (MatchException matchException) {
                                        throw cr_0.b("e", (Object)matchException, (long)5276087924799820385L, (long)l);
                                    }
                                    Object[] objectArray2 = new Object[3];
                                    objectArray2[2] = l2;
                                    objectArray2[1] = class_68802;
                                    objectArray2[0] = callSite2;
                                    object = cr_0.b("e", (Object)objectArray2, (long)5277243187964482047L, (long)l);
                                    if (callSite != null) break block14;
                                }
                                catch (MatchException matchException) {
                                    throw cr_0.b("e", (Object)matchException, (long)5276087924799820385L, (long)l);
                                }
                                if (object != 0) break block13;
                            }
                            catch (MatchException matchException) {
                                throw cr_0.b("e", (Object)matchException, (long)5276087924799820385L, (long)l);
                            }
                            if (callSite == null) continue;
                        }
                        catch (MatchException matchException) {
                            throw cr_0.b("e", (Object)matchException, (long)5276087924799820385L, (long)l);
                        }
                    }
                    object = i;
                }
                catch (MatchException matchException) {
                    throw cr_0.b("e", (Object)matchException, (long)5276087924799820385L, (long)l);
                }
            }
            return cr_0.b("e", (int)object, (long)5272215042855098397L, (long)l);
        }
        return null;
    }

    public static boolean e(Object[] objectArray) {
        int n;
        block4: {
            long l;
            class_1713 class_17132;
            int n2;
            int n3;
            block5: {
                n3 = (Integer)objectArray[0];
                n2 = (Integer)objectArray[1];
                class_17132 = (class_1713)objectArray[2];
                l = (Long)objectArray[3];
                l = a ^ l;
                CallSite callSite = cr_0.b("e", (long)-1637473749991801812L, (long)l);
                try {
                    try {
                        n = cr_0.b("\u00fe", (Object)b, (long)-1630566370272037056L, (long)l) instanceof class_490;
                        if (callSite != null) break block4;
                        if (n != 0) break block5;
                    }
                    catch (MatchException matchException) {
                        throw cr_0.b("e", (Object)matchException, (long)-1635873818944835051L, (long)l);
                    }
                    cr_0.b("\u00b5", (Object)cr_0.b("\u00fe", (Object)b, (long)-1635423407477777456L, (long)l), (int)cr_0.b("\u00fe", (Object)cr_0.b("\u00fe", (Object)cr_0.b("\u00fe", (Object)b, (long)-1631994136854733750L, (long)l), (long)-1636876782748700304L, (long)l), (long)-1638872472194658337L, (long)l), (int)n3, (int)n2, (Object)class_17132, (Object)cr_0.b("\u00fe", (Object)b, (long)-1631994136854733750L, (long)l), (long)-1637179297087231484L, (long)l);
                    return false;
                }
                catch (MatchException matchException) {
                    throw cr_0.b("e", (Object)matchException, (long)-1635873818944835051L, (long)l);
                }
            }
            cr_0.b("\u00b5", (Object)cr_0.b("\u00fe", (Object)b, (long)-1635423407477777456L, (long)l), (int)cr_0.b("\u00fe", (Object)((class_1723)cr_0.b("\u00b5", (Object)((class_490)cr_0.b("\u00fe", (Object)b, (long)-1630566370272037056L, (long)l)), (long)-1638914973683482733L, (long)l)), (long)-1631298632090672460L, (long)l), (int)n3, (int)n2, (Object)class_17132, (Object)cr_0.b("\u00fe", (Object)b, (long)-1631994136854733750L, (long)l), (long)-1637179297087231484L, (long)l);
            n = 1;
        }
        return n != 0;
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (g[n3] != null) {
            return n3;
        }
        Object object = f[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 52;
            case 1 -> 28;
            case 2 -> 46;
            case 3 -> 62;
            case 4 -> 47;
            case 5 -> 61;
            case 6 -> 42;
            case 7 -> 29;
            case 8 -> 48;
            case 9 -> 7;
            case 10 -> 40;
            case 11 -> 35;
            case 12 -> 34;
            case 13 -> 13;
            case 14 -> 60;
            case 15 -> 57;
            case 16 -> 50;
            case 17 -> 2;
            case 18 -> 20;
            case 19 -> 38;
            case 20 -> 25;
            case 21 -> 26;
            case 22 -> 45;
            case 23 -> 41;
            case 24 -> 53;
            case 25 -> 23;
            case 26 -> 1;
            case 27 -> 36;
            case 28 -> 5;
            case 29 -> 14;
            case 30 -> 37;
            case 31 -> 9;
            case 32 -> 32;
            case 33 -> 17;
            case 34 -> 44;
            case 35 -> 43;
            case 36 -> 22;
            case 37 -> 58;
            case 38 -> 30;
            case 39 -> 49;
            case 40 -> 4;
            case 41 -> 39;
            case 42 -> 15;
            case 43 -> 6;
            case 44 -> 55;
            case 45 -> 63;
            case 46 -> 0;
            case 47 -> 8;
            case 48 -> 33;
            case 49 -> 19;
            case 50 -> 12;
            case 51 -> 21;
            case 52 -> 11;
            case 53 -> 31;
            case 54 -> 16;
            case 55 -> 3;
            case 56 -> 51;
            case 57 -> 27;
            case 58 -> 59;
            case 59 -> 18;
            case 60 -> 24;
            case 61 -> 56;
            case 62 -> 10;
            default -> 54;
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
        cr_0.g[n3] = new String(cArray);
        return n3;
    }

    public static boolean i(Object[] objectArray) {
        class_2248 class_22482 = (class_2248)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x7FAC0DB882F2L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = cr_0.b("\u00b5", (Object)class_22482, (long)-8999971307026205059L, (long)l);
        return (boolean)cr_0.b("e", (Object)objectArray2, (long)-9000438716455454470L, (long)l);
    }

    public static List b(Object[] objectArray) {
        int n;
        CallSite callSite;
        ArrayList arrayList;
        long l;
        class_1792 class_17922;
        block6: {
            Object object;
            block7: {
                class_17922 = (class_1792)objectArray[0];
                int n2 = ((Boolean)objectArray[1]).booleanValue();
                l = (Long)objectArray[2];
                l = a ^ l;
                arrayList = new ArrayList();
                callSite = cr_0.b("e", (long)-2585485694418220684L, (long)l);
                try {
                    object = n2;
                    if (callSite != null) break block6;
                    if (object == 0) break block7;
                }
                catch (MatchException matchException) {
                    throw cr_0.b("e", (Object)matchException, (long)-2588389646794668211L, (long)l);
                }
                object = 0;
                break block6;
            }
            object = n = (Object)cr_0.a("x", (int)12779, (long)(0x5343E5E8D5D84F5L ^ l));
        }
        while (n <= cr_0.a("x", (int)6978, (long)(0x1B223F964023AE5BL ^ l))) {
            try {
                if (cr_0.b("\u00b5", (Object)cr_0.b("\u00b5", (Object)cr_0.b("\u00b5", (Object)cr_0.b("\u00fe", (Object)b, (long)-2593517290654799598L, (long)l), (long)-2585840251106927346L, (long)l), (int)n, (long)-2587112603217256490L, (long)l), (long)-2585108560951757791L, (long)l) == class_17922) {
                    cr_0.b("\u00b5", arrayList, (Object)cr_0.b("e", (int)n, (long)-2592115211339838159L, (long)l), (long)-2587388346816968916L, (long)l);
                }
            }
            catch (MatchException matchException) {
                throw cr_0.b("e", (Object)matchException, (long)-2588389646794668211L, (long)l);
            }
            ++n;
            if (callSite == null) continue;
        }
        return arrayList;
    }

    public static Integer b(Object[] objectArray) {
        class_1792 class_17922 = (class_1792)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        int n = 0;
        CallSite callSite = cr_0.b("e", (long)7635199237052152991L, (long)l);
        while (n <= cr_0.a("x", (int)22104, (long)(0x3EBD3857988ED6AFL ^ l))) {
            block7: {
                block8: {
                    CallSite callSite2 = cr_0.b("\u00b5", (Object)cr_0.b("\u00b5", (Object)cr_0.b("\u00fe", (Object)b, (long)7632148873638927609L, (long)l), (long)7635308672240314597L, (long)l), (int)n, (long)7634610712396311101L, (long)l);
                    try {
                        try {
                            try {
                                if (callSite != null) break block7;
                                if (cr_0.b("\u00b5", (Object)callSite2, (long)7634998025238905290L, (long)l) == class_17922) break block8;
                            }
                            catch (MatchException matchException) {
                                throw cr_0.b("e", (Object)matchException, (long)7637856898612196006L, (long)l);
                            }
                            if (cr_0.b("\u00b5", (Object)callSite2, (long)7634998025238905290L, (long)l) == cr_0.b("n", (long)7636256664492571118L, (long)l)) break block8;
                        }
                        catch (MatchException matchException) {
                            throw cr_0.b("e", (Object)matchException, (long)7637856898612196006L, (long)l);
                        }
                        return cr_0.b("e", (int)n, (long)7632998594407659738L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw cr_0.b("e", (Object)matchException, (long)7637856898612196006L, (long)l);
                    }
                }
                ++n;
            }
            if (callSite == null) continue;
        }
        return null;
    }

    public static void b(Object[] objectArray) {
        block3: {
            int n;
            long l;
            long l2;
            block2: {
                int n2 = (Integer)objectArray[0];
                Runnable runnable = (Runnable)objectArray[1];
                boolean bl = (Boolean)objectArray[2];
                l2 = (Long)objectArray[3];
                long l3 = l2 = a ^ l2;
                l = l3 ^ 0x41457C87B0B8L;
                long l4 = l3 ^ 0x196928950D6BL;
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l4;
                CallSite callSite = cr_0.b("e", (Object)objectArray2, (long)7696881036922683075L, (long)l2);
                CallSite callSite2 = cr_0.b("e", (long)7699997494802759601L, (long)l2);
                Object[] objectArray3 = new Object[2];
                objectArray3[1] = l;
                objectArray3[0] = n2;
                cr_0.b("e", (Object)objectArray3, (long)7696995839557439871L, (long)l2);
                cr_0.b("\u00b5", (Object)runnable, (long)7692404217116910624L, (long)l2);
                CallSite callSite3 = callSite2;
                try {
                    n = bl;
                    if (callSite3 != null) break block2;
                    if (n == false) break block3;
                }
                catch (MatchException matchException) {
                    throw cr_0.b("e", (Object)matchException, (long)7697023182414672264L, (long)l2);
                }
                n = callSite;
            }
            Object[] objectArray4 = new Object[2];
            objectArray4[1] = l;
            objectArray4[0] = n;
            cr_0.b("e", (Object)objectArray4, (long)7696995839557439871L, (long)l2);
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cr" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = cr_0.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00fe' || c == 'b' || c == 'n' || c == 'u') {
                field = cr_0.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00fe' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'b' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'n' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = cr_0.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00b5' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'e' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean b(Object[] objectArray) {
        CallSite callSite;
        CallSite callSite2;
        long l;
        block26: {
            CallSite callSite3;
            class_1799 class_17992;
            block25: {
                block24: {
                    block23: {
                        block22: {
                            class_17992 = (class_1799)objectArray[0];
                            l = (Long)objectArray[1];
                            l = a ^ l;
                            callSite3 = cr_0.b("e", (long)-2435123572783576226L, (long)l);
                            try {
                                try {
                                    callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)-2434777225632860661L, (long)l);
                                    callSite = cr_0.b("n", (long)-2434009341867174377L, (long)l);
                                    if (callSite3 != null) break block22;
                                    if (callSite2 == callSite) return 1 != 0;
                                }
                                catch (MatchException matchException) {
                                    throw cr_0.b("e", (Object)matchException, (long)-2432498905270303385L, (long)l);
                                }
                                callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)-2434777225632860661L, (long)l);
                                callSite = cr_0.b("n", (long)-2433087515042214777L, (long)l);
                            }
                            catch (MatchException matchException) {
                                throw cr_0.b("e", (Object)matchException, (long)-2432498905270303385L, (long)l);
                            }
                        }
                        try {
                            try {
                                if (callSite3 != null) break block23;
                                if (callSite2 == callSite) return 1 != 0;
                            }
                            catch (MatchException matchException) {
                                throw cr_0.b("e", (Object)matchException, (long)-2432498905270303385L, (long)l);
                            }
                            callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)-2434777225632860661L, (long)l);
                            callSite = cr_0.b("n", (long)-2436312048634246960L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw cr_0.b("e", (Object)matchException, (long)-2432498905270303385L, (long)l);
                        }
                    }
                    try {
                        try {
                            if (callSite3 != null) break block24;
                            if (callSite2 == callSite) return 1 != 0;
                        }
                        catch (MatchException matchException) {
                            throw cr_0.b("e", (Object)matchException, (long)-2432498905270303385L, (long)l);
                        }
                        callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)-2434777225632860661L, (long)l);
                        callSite = cr_0.b("n", (long)-2449606402252290630L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw cr_0.b("e", (Object)matchException, (long)-2432498905270303385L, (long)l);
                    }
                }
                try {
                    try {
                        if (callSite3 != null) break block25;
                        if (callSite2 == callSite) return 1 != 0;
                    }
                    catch (MatchException matchException) {
                        throw cr_0.b("e", (Object)matchException, (long)-2432498905270303385L, (long)l);
                    }
                    callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)-2434777225632860661L, (long)l);
                    callSite = cr_0.b("n", (long)-2449824614191178232L, (long)l);
                }
                catch (MatchException matchException) {
                    throw cr_0.b("e", (Object)matchException, (long)-2432498905270303385L, (long)l);
                }
            }
            try {
                try {
                    if (callSite3 != null) break block26;
                    if (callSite2 == callSite) return 1 != 0;
                }
                catch (MatchException matchException) {
                    throw cr_0.b("e", (Object)matchException, (long)-2432498905270303385L, (long)l);
                }
                callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)-2434777225632860661L, (long)l);
                callSite = cr_0.b("n", (long)-2436600777542951643L, (long)l);
            }
            catch (MatchException matchException) {
                throw cr_0.b("e", (Object)matchException, (long)-2432498905270303385L, (long)l);
            }
        }
        try {
            if (callSite2 != callSite) return 0 != 0;
            return 1 != 0;
        }
        catch (MatchException matchException) {
            throw cr_0.b("e", (Object)matchException, (long)-2432498905270303385L, (long)l);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean c(Object[] objectArray) {
        CallSite callSite;
        CallSite callSite2;
        long l;
        block26: {
            CallSite callSite3;
            class_1799 class_17992;
            block25: {
                block24: {
                    block23: {
                        block22: {
                            class_17992 = (class_1799)objectArray[0];
                            l = (Long)objectArray[1];
                            l = a ^ l;
                            callSite3 = cr_0.b("e", (long)8934448438350884503L, (long)l);
                            try {
                                try {
                                    callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)8934247228882392002L, (long)l);
                                    callSite = cr_0.b("n", (long)8933395948382936915L, (long)l);
                                    if (callSite3 != null) break block22;
                                    if (callSite2 == callSite) return 1 != 0;
                                }
                                catch (MatchException matchException) {
                                    throw cr_0.b("e", (Object)matchException, (long)8932672868557971630L, (long)l);
                                }
                                callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)8934247228882392002L, (long)l);
                                callSite = cr_0.b("n", (long)8934913097169202351L, (long)l);
                            }
                            catch (MatchException matchException) {
                                throw cr_0.b("e", (Object)matchException, (long)8932672868557971630L, (long)l);
                            }
                        }
                        try {
                            try {
                                if (callSite3 != null) break block23;
                                if (callSite2 == callSite) return 1 != 0;
                            }
                            catch (MatchException matchException) {
                                throw cr_0.b("e", (Object)matchException, (long)8932672868557971630L, (long)l);
                            }
                            callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)8934247228882392002L, (long)l);
                            callSite = cr_0.b("n", (long)8933983680362834921L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw cr_0.b("e", (Object)matchException, (long)8932672868557971630L, (long)l);
                        }
                    }
                    try {
                        try {
                            if (callSite3 != null) break block24;
                            if (callSite2 == callSite) return 1 != 0;
                        }
                        catch (MatchException matchException) {
                            throw cr_0.b("e", (Object)matchException, (long)8932672868557971630L, (long)l);
                        }
                        callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)8934247228882392002L, (long)l);
                        callSite = cr_0.b("n", (long)8931839889347985380L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw cr_0.b("e", (Object)matchException, (long)8932672868557971630L, (long)l);
                    }
                }
                try {
                    try {
                        if (callSite3 != null) break block25;
                        if (callSite2 == callSite) return 1 != 0;
                    }
                    catch (MatchException matchException) {
                        throw cr_0.b("e", (Object)matchException, (long)8932672868557971630L, (long)l);
                    }
                    callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)8934247228882392002L, (long)l);
                    callSite = cr_0.b("n", (long)8928072471928826086L, (long)l);
                }
                catch (MatchException matchException) {
                    throw cr_0.b("e", (Object)matchException, (long)8932672868557971630L, (long)l);
                }
            }
            try {
                try {
                    if (callSite3 != null) break block26;
                    if (callSite2 == callSite) return 1 != 0;
                }
                catch (MatchException matchException) {
                    throw cr_0.b("e", (Object)matchException, (long)8932672868557971630L, (long)l);
                }
                callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)8934247228882392002L, (long)l);
                callSite = cr_0.b("n", (long)8935038319372281646L, (long)l);
            }
            catch (MatchException matchException) {
                throw cr_0.b("e", (Object)matchException, (long)8932672868557971630L, (long)l);
            }
        }
        try {
            if (callSite2 != callSite) return 0 != 0;
            return 1 != 0;
        }
        catch (MatchException matchException) {
            throw cr_0.b("e", (Object)matchException, (long)8932672868557971630L, (long)l);
        }
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

    public static Integer c(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x3C0E3F6B70A9L;
        int n = 0;
        CallSite callSite = cr_0.b("e", (long)6449652594373266667L, (long)l);
        while (n <= cr_0.a("x", (int)22104, (long)(0x3EBD51CBB516E6DBL ^ l))) {
            block5: {
                block6: {
                    CallSite callSite2 = cr_0.b("\u00b5", (Object)cr_0.b("\u00b5", (Object)cr_0.b("\u00fe", (Object)b, (long)6457809380296191117L, (long)l), (long)6449851020361062545L, (long)l), (int)n, (long)6451402489527671369L, (long)l);
                    try {
                        try {
                            if (callSite != null) break block5;
                            Object[] objectArray2 = new Object[2];
                            objectArray2[1] = l2;
                            objectArray2[0] = callSite2;
                            if (cr_0.b("e", (Object)objectArray2, (long)6449718305512675829L, (long)l) == false) break block6;
                        }
                        catch (MatchException matchException) {
                            throw cr_0.b("e", (Object)matchException, (long)6452382823852786386L, (long)l);
                        }
                        return cr_0.b("e", (int)n, (long)6456387647192516782L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw cr_0.b("e", (Object)matchException, (long)6452382823852786386L, (long)l);
                    }
                }
                ++n;
            }
            if (callSite == null) continue;
        }
        return null;
    }

    public static boolean n(Object[] objectArray) {
        class_1799 class_17992 = (class_1799)objectArray[0];
        class_6880 class_68802 = (class_6880)objectArray[1];
        long l = (Long)objectArray[2];
        l = a ^ l;
        int n = 0;
        CallSite callSite = cr_0.b("e", (long)-1490797931201610203L, (long)l);
        CallSite callSite2 = cr_0.b("\u00b5", (Object)cr_0.b("\u00b5", (Object)((class_1844)cr_0.b("\u00b5", (Object)class_17992, (Object)cr_0.b("n", (long)-1489217837555796624L, (long)l), (long)-1490521936526793201L, (long)l)), (long)-1495168451526363376L, (long)l), (long)-1490864559840411736L, (long)l);
        while (cr_0.b("\u00b5", (Object)callSite2, (long)-1488793499002517563L, (long)l) != false) {
            class_1293 class_12932 = (class_1293)cr_0.b("\u00b5", (Object)callSite2, (long)-1494831417368608608L, (long)l);
            if (cr_0.b("\u00b5", (Object)class_12932, (long)-1493470000418782152L, (long)l) == class_68802) {
                n = 1;
            }
            if (callSite == null) continue;
        }
        return n != 0;
    }

    private static Method h(long l, long l2) {
        int n = cr_0.e(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = g[n];
                int n3 = string2.indexOf(8);
                clazz3 = cr_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = cr_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = cr_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        cr_0.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = cr_0.f(1598846488474598L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = cr_0.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        cr_0.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = cr_0.f(1598846488474598L, 0L);
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

    public static boolean h(Object[] objectArray) {
        CallSite callSite;
        long l;
        long l2;
        block4: {
            CallSite callSite2;
            block5: {
                class_1792 class_17922 = (class_1792)objectArray[0];
                l2 = (Long)objectArray[1];
                long l3 = l2 = a ^ l2;
                long l4 = l3 ^ 0x5B44F1617AA4L;
                l = l3 ^ 0x43CA2B8B11C5L;
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = l4;
                objectArray2[0] = class_17922;
                callSite2 = cr_0.b("e", (Object)objectArray2, (long)-3770892573421579962L, (long)l2);
                CallSite callSite3 = cr_0.b("e", (long)-3772080919686340916L, (long)l2);
                try {
                    try {
                        callSite = callSite2;
                        if (callSite3 != null) break block4;
                        if (callSite != null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw cr_0.b("e", (Object)matchException, (long)-3770547242653888267L, (long)l2);
                    }
                    return false;
                }
                catch (MatchException matchException) {
                    throw cr_0.b("e", (Object)matchException, (long)-3770547242653888267L, (long)l2);
                }
            }
            callSite = callSite2;
        }
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l;
        objectArray3[0] = (int)cr_0.b("\u00b5", (Object)callSite, (long)-3769930604551569739L, (long)l2);
        cr_0.b("e", (Object)objectArray3, (long)-3770574600510394366L, (long)l2);
        return true;
    }

    public static boolean f(Object[] objectArray) {
        CallSite callSite;
        boolean bl;
        long l;
        long l2;
        int n;
        int n2;
        block4: {
            block5: {
                n2 = (Integer)objectArray[0];
                n = (Integer)objectArray[1];
                l2 = (Long)objectArray[2];
                long l3 = l2 = a ^ l2;
                long l4 = l3 ^ 0x7EB115151B4DL;
                l = l3 ^ 0xDF3938BAB6AL;
                bl = cr_0.b("\u00fe", (Object)b, (long)4062033144239646272L, (long)l2) instanceof class_490;
                CallSite callSite2 = cr_0.b("e", (long)4055116896789261612L, (long)l2);
                try {
                    try {
                        callSite = cr_0.b("n", (long)4061690755358679688L, (long)l2);
                        if (callSite2 != null) break block4;
                        if (callSite != null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw cr_0.b("e", (Object)matchException, (long)4056644251739923221L, (long)l2);
                    }
                    Object[] objectArray2 = new Object[4];
                    objectArray2[3] = l4;
                    objectArray2[2] = cr_0.b("n", (long)4054840722064408619L, (long)l2);
                    objectArray2[1] = n;
                    objectArray2[0] = n2;
                    cr_0.b("e", (Object)objectArray2, (long)4056351619978791295L, (long)l2);
                    return bl;
                }
                catch (MatchException matchException) {
                    throw cr_0.b("e", (Object)matchException, (long)4056644251739923221L, (long)l2);
                }
            }
            callSite = cr_0.b("n", (long)4061690755358679688L, (long)l2);
        }
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l;
        objectArray3[1] = n;
        objectArray3[0] = n2;
        cr_0.b("\u00b5", (Object)callSite, (Object)objectArray3, (long)4062094697144909062L, (long)l2);
        return bl;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = cr_0.e(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                cr_0.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static boolean l(Object[] objectArray) {
        boolean bl;
        class_1792 class_17922 = (class_1792)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        try {
            bl = cr_0.b("\u00b5", (Object)cr_0.b("\u00b5", (Object)cr_0.b("\u00fe", (Object)b, (long)583376880946265355L, (long)l), (long)578009914832411676L, (long)l), (long)578345970684911672L, (long)l) == class_17922;
        }
        catch (MatchException matchException) {
            throw cr_0.b("e", (Object)matchException, (long)580219681102926676L, (long)l);
        }
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean d(Object[] objectArray) {
        CallSite callSite;
        CallSite callSite2;
        long l;
        block126: {
            CallSite callSite3;
            class_1799 class_17992;
            block125: {
                block124: {
                    block123: {
                        block122: {
                            block121: {
                                block120: {
                                    block119: {
                                        block118: {
                                            block117: {
                                                block116: {
                                                    block115: {
                                                        block114: {
                                                            block113: {
                                                                block112: {
                                                                    block111: {
                                                                        block110: {
                                                                            block109: {
                                                                                block108: {
                                                                                    block107: {
                                                                                        block106: {
                                                                                            block105: {
                                                                                                block104: {
                                                                                                    block103: {
                                                                                                        block102: {
                                                                                                            class_17992 = (class_1799)objectArray[0];
                                                                                                            l = (Long)objectArray[1];
                                                                                                            l = a ^ l;
                                                                                                            callSite3 = cr_0.b("e", (long)5872667906531886101L, (long)l);
                                                                                                            try {
                                                                                                                try {
                                                                                                                    callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)5872328158674729280L, (long)l);
                                                                                                                    callSite = cr_0.b("n", (long)5870615923769307969L, (long)l);
                                                                                                                    if (callSite3 != null) break block102;
                                                                                                                    if (callSite2 == callSite) return 1 != 0;
                                                                                                                }
                                                                                                                catch (MatchException matchException) {
                                                                                                                    throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                                                                                                                }
                                                                                                                callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)5872328158674729280L, (long)l);
                                                                                                                callSite = cr_0.b("n", (long)5869758213194268753L, (long)l);
                                                                                                            }
                                                                                                            catch (MatchException matchException) {
                                                                                                                throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                                                                                                            }
                                                                                                        }
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (callSite3 != null) break block103;
                                                                                                                if (callSite2 == callSite) return 1 != 0;
                                                                                                            }
                                                                                                            catch (MatchException matchException) {
                                                                                                                throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                                                                                                            }
                                                                                                            callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)5872328158674729280L, (long)l);
                                                                                                            callSite = cr_0.b("n", (long)5870234207559455518L, (long)l);
                                                                                                        }
                                                                                                        catch (MatchException matchException) {
                                                                                                            throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                                                                                                        }
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (callSite3 != null) break block104;
                                                                                                            if (callSite2 == callSite) return 1 != 0;
                                                                                                        }
                                                                                                        catch (MatchException matchException) {
                                                                                                            throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                                                                                                        }
                                                                                                        callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)5872328158674729280L, (long)l);
                                                                                                        callSite = cr_0.b("n", (long)5870424895601219469L, (long)l);
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    try {
                                                                                                        if (callSite3 != null) break block105;
                                                                                                        if (callSite2 == callSite) return 1 != 0;
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                                                                                                    }
                                                                                                    callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)5872328158674729280L, (long)l);
                                                                                                    callSite = cr_0.b("n", (long)5870800304792411798L, (long)l);
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    if (callSite3 != null) break block106;
                                                                                                    if (callSite2 == callSite) return 1 != 0;
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                                                                                                }
                                                                                                callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)5872328158674729280L, (long)l);
                                                                                                callSite = cr_0.b("n", (long)5865726552725917627L, (long)l);
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                if (callSite3 != null) break block107;
                                                                                                if (callSite2 == callSite) return 1 != 0;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                                                                                            }
                                                                                            callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)5872328158674729280L, (long)l);
                                                                                            callSite = cr_0.b("n", (long)5868226761763319627L, (long)l);
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            if (callSite3 != null) break block108;
                                                                                            if (callSite2 == callSite) return 1 != 0;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                                                                                        }
                                                                                        callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)5872328158674729280L, (long)l);
                                                                                        callSite = cr_0.b("n", (long)5857753706038413727L, (long)l);
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        if (callSite3 != null) break block109;
                                                                                        if (callSite2 == callSite) return 1 != 0;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                                                                                    }
                                                                                    callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)5872328158674729280L, (long)l);
                                                                                    callSite = cr_0.b("n", (long)5871220857916856307L, (long)l);
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                                                                                }
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    if (callSite3 != null) break block110;
                                                                                    if (callSite2 == callSite) return 1 != 0;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                                                                                }
                                                                                callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)5872328158674729280L, (long)l);
                                                                                callSite = cr_0.b("n", (long)5869023753191612553L, (long)l);
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                                                                            }
                                                                        }
                                                                        try {
                                                                            try {
                                                                                if (callSite3 != null) break block111;
                                                                                if (callSite2 == callSite) return 1 != 0;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                                                                            }
                                                                            callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)5872328158674729280L, (long)l);
                                                                            callSite = cr_0.b("n", (long)5857882927541234606L, (long)l);
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                                                                        }
                                                                    }
                                                                    try {
                                                                        try {
                                                                            if (callSite3 != null) break block112;
                                                                            if (callSite2 == callSite) return 1 != 0;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                                                                        }
                                                                        callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)5872328158674729280L, (long)l);
                                                                        callSite = cr_0.b("n", (long)5865270534610953195L, (long)l);
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        if (callSite3 != null) break block113;
                                                                        if (callSite2 == callSite) return 1 != 0;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                                                                    }
                                                                    callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)5872328158674729280L, (long)l);
                                                                    callSite = cr_0.b("n", (long)5871425374260450580L, (long)l);
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                                                                }
                                                            }
                                                            try {
                                                                try {
                                                                    if (callSite3 != null) break block114;
                                                                    if (callSite2 == callSite) return 1 != 0;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                                                                }
                                                                callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)5872328158674729280L, (long)l);
                                                                callSite = cr_0.b("n", (long)5872549549869532191L, (long)l);
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                                                            }
                                                        }
                                                        try {
                                                            try {
                                                                if (callSite3 != null) break block115;
                                                                if (callSite2 == callSite) return 1 != 0;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                                                            }
                                                            callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)5872328158674729280L, (long)l);
                                                            callSite = cr_0.b("n", (long)5865346810056137790L, (long)l);
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            if (callSite3 != null) break block116;
                                                            if (callSite2 == callSite) return 1 != 0;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                                                        }
                                                        callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)5872328158674729280L, (long)l);
                                                        callSite = cr_0.b("n", (long)5870153602828800177L, (long)l);
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        if (callSite3 != null) break block117;
                                                        if (callSite2 == callSite) return 1 != 0;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                                                    }
                                                    callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)5872328158674729280L, (long)l);
                                                    callSite = cr_0.b("n", (long)5870783678976494480L, (long)l);
                                                }
                                                catch (MatchException matchException) {
                                                    throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                                                }
                                            }
                                            try {
                                                try {
                                                    if (callSite3 != null) break block118;
                                                    if (callSite2 == callSite) return 1 != 0;
                                                }
                                                catch (MatchException matchException) {
                                                    throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                                                }
                                                callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)5872328158674729280L, (long)l);
                                                callSite = cr_0.b("n", (long)5869822979027293174L, (long)l);
                                            }
                                            catch (MatchException matchException) {
                                                throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                                            }
                                        }
                                        try {
                                            try {
                                                if (callSite3 != null) break block119;
                                                if (callSite2 == callSite) return 1 != 0;
                                            }
                                            catch (MatchException matchException) {
                                                throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                                            }
                                            callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)5872328158674729280L, (long)l);
                                            callSite = cr_0.b("n", (long)5871153172975122528L, (long)l);
                                        }
                                        catch (MatchException matchException) {
                                            throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                                        }
                                    }
                                    try {
                                        try {
                                            if (callSite3 != null) break block120;
                                            if (callSite2 == callSite) return 1 != 0;
                                        }
                                        catch (MatchException matchException) {
                                            throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                                        }
                                        callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)5872328158674729280L, (long)l);
                                        callSite = cr_0.b("n", (long)5857549728591432491L, (long)l);
                                    }
                                    catch (MatchException matchException) {
                                        throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                                    }
                                }
                                try {
                                    try {
                                        if (callSite3 != null) break block121;
                                        if (callSite2 == callSite) return 1 != 0;
                                    }
                                    catch (MatchException matchException) {
                                        throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                                    }
                                    callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)5872328158674729280L, (long)l);
                                    callSite = cr_0.b("n", (long)5871709654358918573L, (long)l);
                                }
                                catch (MatchException matchException) {
                                    throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                                }
                            }
                            try {
                                try {
                                    if (callSite3 != null) break block122;
                                    if (callSite2 == callSite) return 1 != 0;
                                }
                                catch (MatchException matchException) {
                                    throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                                }
                                callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)5872328158674729280L, (long)l);
                                callSite = cr_0.b("n", (long)5869363103823291794L, (long)l);
                            }
                            catch (MatchException matchException) {
                                throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                            }
                        }
                        try {
                            try {
                                if (callSite3 != null) break block123;
                                if (callSite2 == callSite) return 1 != 0;
                            }
                            catch (MatchException matchException) {
                                throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                            }
                            callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)5872328158674729280L, (long)l);
                            callSite = cr_0.b("n", (long)5871032512337263484L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                        }
                    }
                    try {
                        try {
                            if (callSite3 != null) break block124;
                            if (callSite2 == callSite) return 1 != 0;
                        }
                        catch (MatchException matchException) {
                            throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                        }
                        callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)5872328158674729280L, (long)l);
                        callSite = cr_0.b("n", (long)5869182681917698523L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                    }
                }
                try {
                    try {
                        if (callSite3 != null) break block125;
                        if (callSite2 == callSite) return 1 != 0;
                    }
                    catch (MatchException matchException) {
                        throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                    }
                    callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)5872328158674729280L, (long)l);
                    callSite = cr_0.b("n", (long)5865927298543131055L, (long)l);
                }
                catch (MatchException matchException) {
                    throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                }
            }
            try {
                try {
                    if (callSite3 != null) break block126;
                    if (callSite2 == callSite) return 1 != 0;
                }
                catch (MatchException matchException) {
                    throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
                }
                callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)5872328158674729280L, (long)l);
                callSite = cr_0.b("n", (long)5872250508376439389L, (long)l);
            }
            catch (MatchException matchException) {
                throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
            }
        }
        try {
            if (callSite2 != callSite) return 0 != 0;
            return 1 != 0;
        }
        catch (MatchException matchException) {
            throw cr_0.b("e", (Object)matchException, (long)5869698267724630572L, (long)l);
        }
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = cr_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = cr_0.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = cr_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = cr_0.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static Integer d(Object[] objectArray) {
        class_2248 class_22482 = (class_2248)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        int n = 0;
        CallSite callSite = cr_0.b("e", (long)-3826412464454426737L, (long)l);
        while (n <= cr_0.a("x", (int)25961, (long)(0x2627F67BEF31468DL ^ l))) {
            block5: {
                block6: {
                    CallSite callSite2 = cr_0.b("\u00b5", (Object)cr_0.b("\u00b5", (Object)cr_0.b("\u00fe", (Object)b, (long)-3820563670469443607L, (long)l), (long)-3826256847479419915L, (long)l), (int)n, (long)-3826966090185668307L, (long)l);
                    try {
                        try {
                            if (callSite != null) break block5;
                            if (cr_0.b("\u00b5", (Object)callSite2, (long)-3826791794710011174L, (long)l) != cr_0.b("\u00b5", (Object)class_22482, (long)-3826446133372387455L, (long)l)) break block6;
                        }
                        catch (MatchException matchException) {
                            throw cr_0.b("e", (Object)matchException, (long)-3823722100854009418L, (long)l);
                        }
                        return cr_0.b("e", (int)n, (long)-3819707086628201526L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw cr_0.b("e", (Object)matchException, (long)-3823722100854009418L, (long)l);
                    }
                }
                ++n;
            }
            if (callSite == null) continue;
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cr" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "<\u001f.\r+:*\u001f+W8-=T(Q49,\u0013?F\u007f+\u0010";
        objectArray[1] = "k\u00066?\f\u0013\u001e&=0\u001d\\c>.7\u0014\u0015\u000b";
        objectArray[2] = "DbP\fqHDbGP}G^)GN}RYX\u0013\u0016*";
        objectArray[3] = "axX9I]axOeER{3O{EG|B\u001d \u0014\u0007";
        objectArray[4] = "dxG\u0003qrdxP_}}~3PA}hyB\u0000\u001c,";
        objectArray[5] = "$B\u0012\f\fB$B\u0005P\u0000M>\t\u0005N\u0000X9xP\u0011W";
        objectArray[6] = Integer.TYPE;
        cr_0.g[6] = "java/lang/Integer";
        objectArray[7] = "b8S:oMb8DfcBxsDxcW\u007f\u0002\u0016#3\u0017";
        objectArray[8] = "JwGIY\u000eJwP\u0015U\u0001P<P\u000bU\u0014WM\u0002Q\u0001P";
        objectArray[9] = Void.TYPE;
        cr_0.g[9] = "java/lang/Void";
        objectArray[10] = "S\u0017>G5$S\u0017)\u001b9+I\\)\u00059>N-~Zo";
        objectArray[11] = "o\u0006k~WBy\u0006n$DUnMm\"HA\u007f\nz5\u0003Qy";
        objectArray[12] = "8o\u0007\u0003\u007f\u00123`\u0016L\u001c\u001f&m\u0019')\u001d7~\u0005\u000b>\u0010";
        objectArray[13] = ",JL0/1,J[l#>6\u0001[r#+1p\t)pk";
        objectArray[14] = "9\u000eK\u0010:l9\u000e\\L6c#E\\R6v$4\u000b\u0007g";
        objectArray[15] = "~e\u001f\u0019w\u000e\u000bE\u0014\u0016fAjK\u001f\u001db\u001b\u001e";
        objectArray[16] = "b\r SP\u001f\u0017-+\\APv# WE\n\u0002";
        objectArray[17] = "\u0011jC\u0003f?\u001aeRL\u001a&\u0015eT\u0000$6";
        objectArray[18] = "\u001d\u001b=EX\u0015\u0016\u0014,\n?\u0017\u0003\u001f,A\u0004";
        objectArray[19] = "z\u007f\u0010\u0014?;z\u007f\u0007H34`4\u0007V3!gEU\rkk";
        objectArray[20] = "*h\u001f}uR*h\b!y]0#\b?yH7RZd!\t";
        objectArray[21] = "gDNT`\tyLT\u001b\u0002\u0015~Q";
        objectArray[22] = "T W\u0014O\f_/F[.\u0002T$B\u0001";
        objectArray[23] = Boolean.TYPE;
        cr_0.g[23] = "java/lang/Boolean";
        objectArray[24] = "c\u0016\u0006!EEc\u0016\u0011}IJy]\u0011cI_~,C9\u001e\u001d";
        objectArray[25] = "T\u000569fJ!%=6w\u0005@+6=s_4";
        objectArray[26] = "\u001bkx{\u0015b\u001bko'\u0019m\u0001 o9\u0019x\u0006Q>gL3";
        objectArray[27] = "J<\u00150\u0019E?\u001c\u001e?\b\n^\u0012\u00154\fP*";
        objectArray[28] = "\n1.NvH\n19\u0012zG\u0010z9\fzR\u0017\u000bkX+\u0013";
        objectArray[29] = "j/:+..\u001f\u000f1$?a~\u0001:/;;\n";
        objectArray[30] = "T\u000e8I\u0006s!.3F\u0017<@ 8M\u0013f4";
        objectArray[31] = "&!\u0015M=SS\u0001\u001eB,\u001c2\u000f\u0015I(FF";
        objectArray[32] = "5f'\u0006h(>i6I\u000f0:u0\u0005*!";
        objectArray[33] = "{\u00129&^Se\u001a#i9Rt\u0001.3\u001fT";
        objectArray[34] = "/%\u000f~Eo/%\u0018\"I`5n\u0018<Iu2\u001fBc\u001b7";
        objectArray[35] = "\u0010X\u0017EqJ\u0010X\u0000\u0019}E\n\u0013\u0000\u0007}P\rbRS(\u0017";
        objectArray[36] = "}h\u001a0B\\}h\rlNSg#\rrNF`R_,\u0016\u0006";
        objectArray[37] = "ok\u0018,PTok\u000fp\\[u \u000fn\\NrQZ:\u0005\r";
        objectArray[38] = "3\u000eWJwn3\u000e@\u0016{a)E@\b{t.4\u001aW)3";
        objectArray[39] = "[\u000fs,50M\u000fvv&'ZDup*3K\u0003bga#S\u0003`l;no\u0018`q;)X\u000f";
        objectArray[40] = "\u000e4S\rb1\u00184VWq&\u000f\u007fUQ}2\u001e8BF6#3";
        objectArray[41] = ">I[\u001fsrKiP\u0010b=*g[\u001bfg^";
        objectArray[42] = "?McIgB)Mf\u0013tU>\u0006e\u0015xA/Ar\u00023@";
        objectArray[43] = "Y<h\u001fa\u0003,\u001cc\u0010pLM\u0012h\u001bt\u00169";
        objectArray[44] = "\u000e| EmN{\\+J|\u0001\u001aR Ax[n";
        objectArray[45] = "Ru\u001eVb\u001e\u0014vXXY\u0002mpYU+\t\u0002|\u000fU8`\u0002e\u000eV \u0004Rn\u001fYY";
        objectArray[46] = "a\u001codduv\b!7\u0001.`\u001d?;m\u001c0Qam=Kk\u0006=2>1b\u001f0f\u0001%t\u0018%,x{q^&\\";
        objectArray[47] = "\u000b\"\u001b\u001e\u0019t\u0000#@_hhP1\u001c\u0002??\u000efDnQ~N#\u0013\u0002QiP5";
        objectArray[48] = "\u0007{*/p\u000f\u0014u:i\u001aB}0):kBB+ik+";
        objectArray[49] = "U][SACPC\u0007\u0010+PV@\u0000G|\u0004\r\u0015^\u001b+S\rL\u0006KROON\r";
        objectArray[50] = "<2y|\u0002f9,%?hu?/\"h?+c}~\u0004\u0005!? &}\u0019c=+";
        objectArray[51] = "Necy[`^ao1buLzs-%e%\"o,\u0010nT/q0\u001e\u000bNecy[`^ao1b";
        objectArray[52] = "\u001d W<\u0006/\u0016!\f}w3F3P  d\u0018c\tLHc@8U2\u00177\u001f8";
        objectArray[53] = "1n<W\u0014\u001c*.m\u0017iJKjh\u001a\u001bJ$f>\u001a\b#7*-J\u0017^-s:Gi";
        objectArray[54] = "|\u000f|n%(g\u0000f5]rs\u001aA3-n\u001a\u000el1bk~^g m\u0012";
        objectArray[55] = "}I\u0015!i\u001bxWIb\u0003\b~TN5TV$\u0006\u0013Yn\\~[J r\u001e|P";
        objectArray[56] = "Y\u0000acy\u001f]\fp~\u0004\u001dA\bu}SO\u0011[,(\u0004\u0015G\u0007\u007f.~\u001c^\n+";
        objectArray[57] = "\u0011j\u000e\u001c!\t^2\u000f\u001b\u001a\u0007A;\u0004\fMV\u001fh[`&\bL$\u0005\u0011+\u0016P*";
        objectArray[58] = "0\u0000t7\r_5\u001e(tgL3\u001d/#0\u0012nIuO\n\u00183\u0012+6\u0016Z1\u0019";
        objectArray[59] = "O[;U;\u0001JEg\u0016Q\u0012LF`A\u0006L\u0013\u0015<-<FLIdT \u0004NB";
        objectArray[60] = "\u0003\t\u0014)y(E\nR'B<<\fS*0?S\u0000\u0005*#V\u0002\t\u0005*xk]\u001d\u0013fB";
        objectArray[61] = "\u00197|_6&\u001c) \u001c\\5\u001a*'K\u000bkG\u007f}'1a\u001a%#^-#\u0018.";
        objectArray[62] = "+\u0000C%\u0014-.[Dcy1=W~&\u0002%|\u000bCy\u0016301";
        objectArray[63] = "q\u0000\u001a_\t!t\u001eF\u001cc2r\u001dAK4l(@\u001a'\u000efr\u0012E^\u0012$p\u0019";
        objectArray[64] = "S^$?)7V@x|C$PC\u007f+\u0014z\u0001\u0010!G.pPL{>22RG";
        objectArray[65] = "Z\u0014a\u0012e?_\n=Q\u000f,Y\t:\u0006Xr\u0004[cjbxY\u0006>\u0013~:[\r";
        objectArray[66] = "zRG6M\u007f}U\u001cmv%w\u0011\u0017;\u001a\u0017$RJgL@&\f\u001b.\u00131+\u0012\u0007 v";
        objectArray[67] = "\u0013\u001f\n\u0019TR\u0016\u0001VZ>A\u0010\u0002Q\ri\u001fJP\naS\u0015\u0010\rU\u0018OW\u0012\u0006";
        objectArray[68] = "\u0015=\u0006n$B\u0010#Z-NQ\u0016 ]z\u0019\u0003Fu\b&NRM,[v7N\u000f.P";
        objectArray[69] = "q\"\u0007\u000e-gt<[MGtr?\\\u001a\u0010*)l\u0007v* r0X\u000f6bp;";
        objectArray[70] = "Z\u0007\u001e\u0005eg_\u0019BF\u000ftY\u001aE\u0011X*\u0007K\u001a}b Y\u0015A\u0004~b[\u001e";
        objectArray[71] = "<\u001d!<\"\f9\u0003}\u007fH\u001f?\u0000z(\u001fAdT.D%K?\u000f~=9\t=\u0004";
        objectArray[72] = "\t=gr\u001e/\f#;1t<\n <f#hQub5t?Q,:j\r#\u0013.1";
        objectArray[73] = "+W|dn'.I '\u00044(J'pSjs\u0017x\u001ci`(E#eu\"*N";
        objectArray[74] = "JaE\u001f4kMf\u001eD\u000f1G\"\u0015\u0012c\u0003\u0017bNE\u000fhK2\u0007\u0010~eU.\tuc)\u001af\u0010Kt=T5u";
        objectArray[75] = "NXO{\u00070KF\u00138m#ME\u0014o:}\u0010\u0010K\u0003\u0000wMJ\u0010z\u001c5OA";
        objectArray[76] = "r\u000e\u0002<7pu\tYg\f*\u007fMR1`\u0018,\b\u000eg2O.P^$i>#NB*\fqi_\u000el1.}IBV";
        objectArray[77] = "6#'\u0001@u6#nVpa2gw\\\u001cSf$*\u0004O\u0004e|fB\u001eio&{Bp";
        objectArray[78] = "?y@AG\u00045#]A)\u0007dsUT~V: \n8\u0015\bilTI\u0018\u0016ub";
        objectArray[79] = ".A'(n\u0007+_{k\u0004\u0014-\\|<SJ|\t%Pi@-Sx)u\u0002/X";
        objectArray[80] = "\u00015fB\u000fB\u0004+:\u0001eQ\u0002(=V2\u000f]zi:\b\u0005\u0002'9C\u0014G\u0000,";
        objectArray[81] = "\u00144N>X_\u001b>\u0001m(\u0003\rh\u0005gT\u0005\u000b\u0005\u0019`SR\t?\u0002oI\tq";
        objectArray[82] = "{u\r>s<pvV\u0003hV$*\u0010ad;{`\fs\u0002";
        objectArray[83] = "'mwzB[~{a`?P+uybSbv2)4?X|h{eFD>jp\u0005";
        objectArray[84] = "gwt\u0000Xobi(C2|dj/\u0014e\">8sx_(de+\u0001Cjfn";
        objectArray[85] = "/\u0007o\u0006P\u0015i\u0004)\bk\u000b\u0010\u0002(\u0005\u0019\u0002\u007f\u000e~\u0005\nk\u007f\u0017\u007f\u0006\u0012\u000f/\u001cn\tk";
        objectArray[86] = "6k{xxnj}frDq`my%(C7 !|D(l}k'5%raeBxuac|3uk}m\u0019~%x\u007fths;dq\u0011$x4s||g!=n\r,e?;dw*hr$\u00143jw~~)l~a2D";
        objectArray[87] = "!Xzw--6L4$Hv Y*($Dr\u0014r~H~wD(/1b5F#O";
        objectArray[88] = " 2\u007fX\u0010\u007f%,#\u001bzl#/$L-8xzz\u001czox#\"@\u0003s:!)";
        objectArray[89] = "w#8^|/r=d\u001d\u0016<t>cJAb)h9&{ht1g_g*v:";
        objectArray[90] = "\\(GbHMY6\u001b!\"^_5\u001cvu\u0000\u0000dG\u001aO\n_:\u0018cSH]1";
        objectArray[91] = "l1\u0016E\u000e0l&\bSe985\t]\t\u000bkqU\u0005e0(yQ_['<7\u0002:";
        objectArray[92] = "zvOv*/zaQ`A&.rPn-\u0014x7\r5qC#1\u0000cz|$6[8A";
        objectArray[93] = "\u000f\u001d}\u001bM(I\u001e;\u0015v10\u0018:\u0018\u0004?_\u0014l\u0018\u0017V_\rm\u001b\u000f2\u000f\u0006|\u0014v";
        objectArray[94] = "\bH\u001a]+>K\u0011\u0013@Z=T\u001f\u000eV\rl\nCS:giE\u0015\u001bW$0L\b";
        objectArray[95] = "\u0003.0\u0000\f~\u00060lCfm\u00003k\u001413Yo7x\u000b9\u0000<o\u0001\u0017{\u00027";
        objectArray[96] = "lW\u0007;k8iI[x\u0001+oJ\\/Vy?\u0017\u0001\u007f\u0001(4FZ#x4vDQ";
        objectArray[97] = "z'L`\f(\u007f9\u0010#f;y:\u0017t1e!iI\u0018\u000boy5\u0013a\u0017-{>";
        objectArray[98] = "\u0002F\u0013)=s\u0007XOjW`\u0001[H=\u0000>]\u000b\u0012Q:4\u0001TL(&v\u0003_";
        objectArray[99] = "7!\r3Mk2?Qp'x4<V'p&hn\rKJ,43R2Vn68";
        objectArray[100] = "8\b\"\u0004hP~\u000bd\nSC\u0007\re\u0007!Gh\u00013\u00072.h\u00182\u0004*J8\u0013#\u000bS";
        objectArray[101] = "@:\u007f\u000e#9\u000699\u0000\u0018.\u007f?8\rj.\u00103n\ryG\u0014:m\b!,\u0004>a@\u0018";
        objectArray[102] = "'\u0019>ePD\"\u0007b&:W$\u0004eqm\txS:\u001dW\u0003$\u000badKA&\u0000";
        objectArray[103] = "\u001cc!#Y\u0016Bfg )\u0002\u000bg1=Ro\u001cc!#Y\u0016Bfg )\u0000\u0019ug MP\u0012dhY";
        objectArray[104] = "M\u007ftBU\u0017Ha(\u0001?\u0004Nb/VhZ\u001f3v:RPNm+CN\u0012Lf";
        objectArray[105] = "\u0003{/kMS\u0018t505\u000f\be([[\u0010\u001co$\"\u0005\u0015ZlT";
        objectArray[106] = "fQR7OzfFL!$x>DI$s)b\u0010\u0017H\u001eq.PC%\u0014+3P";
        objectArray[107] = "P\u0000\u007fU!L\u0016\u00039[\u001aTo\u00058Vh[\u0000\tnV{2\u0000\u0010oUcVP\u001b~Z\u001a";
        objectArray[108] = "Uh\u0014+iYK|X=\u0014B_x\u0004=xp\u000f;_k+'W5Ujd\u001aX?\u001a9\u0014";
        objectArray[109] = "lG\u00196\nyiYEu`joZB\"7>4\u000f\u001c\u007f`i4VD.\u0019uvTO";
        objectArray[110] = "\u0011\u0018DP3{\u0014\u0006\u0018\u0013Yh\u0012\u0005\u001fD\u000e<IPA\u0012YkI\t\u0019H w\u000b\u000b\u0012";
        objectArray[111] = "V_1\u0011wbSAmR\u001dqUBj\u0005J%\u000e\u00174T\u001dr\u000eNl\tdnLLg";
        objectArray[112] = "Ql0{>8Trl8T+Rqko\u0003u\b ?\u00039\u007fR~oz%=Pu";
        objectArray[113] = "yU\"(4\u0012|K~k^\u0001zHy<\t_&\u001f-P3UzG})/\u0017xL";
        objectArray[114] = "|FN}\r=yX\u0012>g.\u007f[\u0015i0p$\u0006L\u0005\nz\u007fT\u0011|\u00168}_";
        objectArray[115] = "C!\u0015\u0012~\u000fS%\u0019ZG\u0005N&&B#\u0019EZDJ+\u0016M+IT7\u0018(";
        objectArray[116] = "e\u0001y\u0001MMoCq\u0007-GpC`\u0019Au \u0002?O-Zc\u0006a\u001bMP!Ej~";
        objectArray[117] = "\u0014\tMK\u0000\u0012\u0011\u0017\u0011\bj\u0001\u0017\u0014\u0016_=_MBO3\u0007U\u0017\u001b\u0012J\u001b\u0017\u0015\u0010";
        objectArray[118] = "\u001dj!3\u000f1\u0018t}pe\"\u001ewz'2|@'%K\bv\u001ex~2\u00144\u001cs";
        objectArray[119] = "<n&nxkl;$q\u001dd>8_\u007fdt($&!a2+T0zr2+0`qc=R";
        objectArray[120] = "\u0018u&\u001f'S^v`\u0011\u001cD'><\u001emDDn Yc-\u0017kgQuNGw _\u001c";
        objectArray[121] = "\u007f,&3yu9/`=Bb@)a00b/%70#\u000b~,70x6!8!|B";
        objectArray[122] = "\u0011WDO<\u0003\u0014I\u0018\fV\u0010\u0012J\u001f[\u0001NC\u0018@7;D\u0012E\u001bN'\u0006\u0010N";
        objectArray[123] = "\u001d,z\nzE\u00182&I\u0010V\u001e1!\u001eG\bGaur}\u0002\u001e>%\u000ba@\u001c5";
        objectArray[124] = "fG\u0010D\u00017fP\u000eRj>2C\u000f\\\u0006\fa\u0007P\nj7\"\u000fW^T 6A\u0004;";
        objectArray[125] = "RM \bU2WS|K?!QP{\u001ch\u007f\u0000\u0006$pRuQ_\u007f\tN7ST";
        objectArray[126] = "v\u0007B~B#0\u0004\u0004py4I\u0002\u0005}\u000b4&\u000eS}\u0018]u\u001dQ3\u001c,x\u0003M=y";
        objectArray[127] = " @hA \f+A3\u0000Q\u0010{So]\u0006G%\u000021j\u0004x\u00047K6\u0012e\u000e";
        objectArray[128] = "\t>F\r%b\f \u001aNOq\n#\u001d\u0019\u0018/P\u007fGu\"%\n,\u0019\f>g\b'";
        objectArray[129] = "\u001e:Q\u001c8w\u001b$\r_Rd\u001d'\n\b\u0005:DtTd?0\u001d(\u000e\u001d#r\u001f#";
        objectArray[130] = "\u0000\u000f#>8\r\u0005\u0011\u007f}R\u001e\u0003\u0012x*\u0005@RG&F?J\u0003\u001d|?#\b\u0001\u0016";
        objectArray[131] = "2swjv\u000b7m+)\u001c\u00181n,~KFh2q\u0012qL1a(km\u000e3j";
        objectArray[132] = "wk1:k\u0019rumy\u0001\ntvj.VT%!3Bl^tyn;p\u001cvr";
        objectArray[133] = ")\u0006})ef,\u0018!j\u000fu*\u001b&=X+pOyQb!*\u0014\"(~c(\u001f";
        Object[] objectArray2 = objectArray;
        objectArray[134] = "J0\u0006\u0002s!O.ZA\u00192I-]\u0016Nf\u0012x\u0002B\u00191\u0012![\u001a`-P#P";
    }

    public static void a(Object[] objectArray) {
        long l;
        int n;
        block8: {
            block7: {
                int n2;
                block6: {
                    n = (Integer)objectArray[0];
                    l = (Long)objectArray[1];
                    l = a ^ l;
                    CallSite callSite = cr_0.b("e", (long)1166133241862145348L, (long)l);
                    try {
                        try {
                            n2 = n;
                            if (callSite != null) break block6;
                            if (n2 > cr_0.a("x", (int)22104, (long)(0x3EBD651618AAAF74L ^ l))) break block7;
                        }
                        catch (MatchException matchException) {
                            throw cr_0.b("e", (Object)matchException, (long)1163128409949178749L, (long)l);
                        }
                        n2 = n;
                    }
                    catch (MatchException matchException) {
                        throw cr_0.b("e", (Object)matchException, (long)1163128409949178749L, (long)l);
                    }
                }
                if (n2 >= 0) break block8;
            }
            return;
        }
        cr_0.b("\u00b5", (Object)cr_0.b("\u00b5", (Object)cr_0.b("\u00fe", (Object)b, (long)1166867397466989858L, (long)l), (long)1165673130026570046L, (long)l), (int)n, (long)1164544568853246009L, (long)l);
    }

    public static Integer a(Object[] objectArray) {
        class_1792 class_17922 = (class_1792)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        int n = 0;
        CallSite callSite = cr_0.b("e", (long)8885576293171441189L, (long)l);
        while (n <= cr_0.a("x", (int)22104, (long)(0x3EBD7D98C240C415L ^ l))) {
            block5: {
                block6: {
                    CallSite callSite2 = cr_0.b("\u00b5", (Object)cr_0.b("\u00b5", (Object)cr_0.b("\u00fe", (Object)b, (long)8885763941799251523L, (long)l), (long)8884569657703004767L, (long)l), (int)n, (long)8883860650649467015L, (long)l);
                    try {
                        try {
                            if (callSite != null) break block5;
                            if (cr_0.b("\u00b5", (Object)callSite2, (long)8885236545265767280L, (long)l) != class_17922) break block6;
                        }
                        catch (MatchException matchException) {
                            throw cr_0.b("e", (Object)matchException, (long)8882606645319163932L, (long)l);
                        }
                        return cr_0.b("e", (int)n, (long)8887746150668921440L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw cr_0.b("e", (Object)matchException, (long)8882606645319163932L, (long)l);
                    }
                }
                ++n;
            }
            if (callSite == null) continue;
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(Object[] objectArray) {
        CallSite callSite;
        CallSite callSite2;
        long l;
        block26: {
            CallSite callSite3;
            class_1799 class_17992;
            block25: {
                block24: {
                    block23: {
                        block22: {
                            class_17992 = (class_1799)objectArray[0];
                            l = (Long)objectArray[1];
                            l = a ^ l;
                            callSite3 = cr_0.b("e", (long)1325929811574376204L, (long)l);
                            try {
                                try {
                                    callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)1326306943073188441L, (long)l);
                                    callSite = cr_0.b("n", (long)1320319436356201084L, (long)l);
                                    if (callSite3 != null) break block22;
                                    if (callSite2 == callSite) return 1 != 0;
                                }
                                catch (MatchException matchException) {
                                    throw cr_0.b("e", (Object)matchException, (long)1327459090265639221L, (long)l);
                                }
                                callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)1326306943073188441L, (long)l);
                                callSite = cr_0.b("n", (long)1326762635533565668L, (long)l);
                            }
                            catch (MatchException matchException) {
                                throw cr_0.b("e", (Object)matchException, (long)1327459090265639221L, (long)l);
                            }
                        }
                        try {
                            try {
                                if (callSite3 != null) break block23;
                                if (callSite2 == callSite) return 1 != 0;
                            }
                            catch (MatchException matchException) {
                                throw cr_0.b("e", (Object)matchException, (long)1327459090265639221L, (long)l);
                            }
                            callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)1326306943073188441L, (long)l);
                            callSite = cr_0.b("n", (long)1333023599213605590L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw cr_0.b("e", (Object)matchException, (long)1327459090265639221L, (long)l);
                        }
                    }
                    try {
                        try {
                            if (callSite3 != null) break block24;
                            if (callSite2 == callSite) return 1 != 0;
                        }
                        catch (MatchException matchException) {
                            throw cr_0.b("e", (Object)matchException, (long)1327459090265639221L, (long)l);
                        }
                        callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)1326306943073188441L, (long)l);
                        callSite = cr_0.b("n", (long)1326313354672295195L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw cr_0.b("e", (Object)matchException, (long)1327459090265639221L, (long)l);
                    }
                }
                try {
                    try {
                        if (callSite3 != null) break block25;
                        if (callSite2 == callSite) return 1 != 0;
                    }
                    catch (MatchException matchException) {
                        throw cr_0.b("e", (Object)matchException, (long)1327459090265639221L, (long)l);
                    }
                    callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)1326306943073188441L, (long)l);
                    callSite = cr_0.b("n", (long)1328115788198489215L, (long)l);
                }
                catch (MatchException matchException) {
                    throw cr_0.b("e", (Object)matchException, (long)1327459090265639221L, (long)l);
                }
            }
            try {
                try {
                    if (callSite3 != null) break block26;
                    if (callSite2 == callSite) return 1 != 0;
                }
                catch (MatchException matchException) {
                    throw cr_0.b("e", (Object)matchException, (long)1327459090265639221L, (long)l);
                }
                callSite2 = cr_0.b("\u00b5", (Object)class_17992, (long)1326306943073188441L, (long)l);
                callSite = cr_0.b("n", (long)1320381739599219695L, (long)l);
            }
            catch (MatchException matchException) {
                throw cr_0.b("e", (Object)matchException, (long)1327459090265639221L, (long)l);
            }
        }
        try {
            if (callSite2 != callSite) return 0 != 0;
            return 1 != 0;
        }
        catch (MatchException matchException) {
            throw cr_0.b("e", (Object)matchException, (long)1327459090265639221L, (long)l);
        }
    }

    public static int a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (int)cr_0.b("\u00b5", (Object)cr_0.b("\u00b5", (Object)cr_0.b("\u00fe", (Object)b, (long)-5916934296092567311L, (long)l), (long)-5909261860713976595L, (long)l), (long)-5910508219768069503L, (long)l);
    }

    public static class_1792 a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return cr_0.b("\u00b5", (Object)cr_0.b("\u00b5", (Object)cr_0.b("\u00fe", (Object)b, (long)3080330357237227436L, (long)l), (long)3072188292494360251L, (long)l), (long)3071921781044658847L, (long)l);
    }

    public static List a(Object[] objectArray) {
        int n;
        CallSite callSite;
        ArrayList arrayList;
        long l;
        class_1792 class_17922;
        block6: {
            Object object;
            block7: {
                class_17922 = (class_1792)objectArray[0];
                int n2 = ((Boolean)objectArray[1]).booleanValue();
                l = (Long)objectArray[2];
                l = a ^ l;
                arrayList = new ArrayList();
                callSite = cr_0.b("e", (long)-280185592505685642L, (long)l);
                try {
                    object = n2;
                    if (callSite != null) break block6;
                    if (object == 0) break block7;
                }
                catch (MatchException matchException) {
                    throw cr_0.b("e", (Object)matchException, (long)-281994421977979057L, (long)l);
                }
                object = 0;
                break block6;
            }
            object = n = (Object)cr_0.a("x", (int)31661, (long)(0xF0DE64E2FA0EEB7L ^ l));
        }
        while (n <= cr_0.a("x", (int)31023, (long)(0x16A4F6430AF46C30L ^ l))) {
            try {
                if (cr_0.b("\u00b5", (Object)cr_0.b("\u00b5", (Object)cr_0.b("\u00b5", (Object)cr_0.b("\u00fe", (Object)b, (long)-287123140688819952L, (long)l), (long)-279459330154005236L, (long)l), (int)n, (long)-280722846994284588L, (long)l), (long)-279839245169126365L, (long)l) == class_17922) {
                    cr_0.b("\u00b5", arrayList, (Object)cr_0.b("e", (int)n, (long)-286855749035954893L, (long)l), (long)-282083262591899858L, (long)l);
                }
            }
            catch (MatchException matchException) {
                throw cr_0.b("e", (Object)matchException, (long)-281994421977979057L, (long)l);
            }
            ++n;
            if (callSite == null) continue;
        }
        return arrayList;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6917;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])e.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    e.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/cr", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            cr_0.d[n2] = n3;
        }
        return d[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = cr_0.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public static boolean m(Object[] objectArray) {
        boolean bl;
        class_1792 class_17922 = (class_1792)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        try {
            bl = cr_0.b("\u00b5", (Object)cr_0.b("\u00b5", (Object)cr_0.b("\u00fe", (Object)b, (long)2848438267802489492L, (long)l), (long)2851708272905576945L, (long)l), (long)2853469298758176679L, (long)l) == class_17922;
        }
        catch (MatchException matchException) {
            throw cr_0.b("e", (Object)matchException, (long)2851454850444672203L, (long)l);
        }
        return bl;
    }

    public static boolean o(Object[] objectArray) {
        class_1799 class_17992 = (class_1799)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        return (boolean)cr_0.b("\u00b5", (Object)cr_0.b("\u00b5", (Object)class_17992, (long)-2061258320543347878L, (long)l), (Object)cr_0.b("n", (long)-2060102828877594740L, (long)l), (long)-2060143203727804403L, (long)l);
    }

    public static boolean p(Object[] objectArray) {
        class_1799 class_17992 = (class_1799)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        return (boolean)cr_0.b("\u00b5", (Object)cr_0.b("\u00b5", (Object)class_17992, (long)4621219736317503519L, (long)l), (Object)cr_0.b("n", (long)4622107094791486815L, (long)l), (long)4624572346426383176L, (long)l);
    }

    public static boolean k(Object[] objectArray) {
        class_2248 class_22482 = (class_2248)objectArray[0];
        Runnable runnable = (Runnable)objectArray[1];
        boolean bl = (Boolean)objectArray[2];
        long l = (Long)objectArray[3];
        long l2 = (l = a ^ l) ^ 0x40D420A4A8CCL;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l2;
        objectArray2[2] = bl;
        objectArray2[1] = runnable;
        objectArray2[0] = cr_0.b("\u00b5", (Object)class_22482, (long)483231689681089488L, (long)l);
        return (boolean)cr_0.b("e", (Object)objectArray2, (long)480566779902868909L, (long)l);
    }

    public static boolean g(Object[] objectArray) {
        int n;
        block4: {
            long l;
            class_1713 class_17132;
            int n2;
            int n3;
            block5: {
                n3 = (Integer)objectArray[0];
                n2 = (Integer)objectArray[1];
                class_17132 = (class_1713)objectArray[2];
                l = (Long)objectArray[3];
                l = a ^ l;
                CallSite callSite = cr_0.b("e", (long)1692990261802680852L, (long)l);
                try {
                    try {
                        n = cr_0.b("\u00fe", (Object)cr_0.b("\u00fe", (Object)b, (long)1684854347298972274L, (long)l), (long)1689015738870402888L, (long)l) instanceof class_1707;
                        if (callSite != null) break block4;
                        if (n != 0) break block5;
                    }
                    catch (MatchException matchException) {
                        throw cr_0.b("e", (Object)matchException, (long)1689982963974507565L, (long)l);
                    }
                    return false;
                }
                catch (MatchException matchException) {
                    throw cr_0.b("e", (Object)matchException, (long)1689982963974507565L, (long)l);
                }
            }
            cr_0.b("\u00b5", (Object)cr_0.b("\u00fe", (Object)b, (long)1690535359708554728L, (long)l), (int)cr_0.b("\u00fe", (Object)cr_0.b("\u00fe", (Object)cr_0.b("\u00fe", (Object)b, (long)1684854347298972274L, (long)l), (long)1689015738870402888L, (long)l), (long)1691591818504581607L, (long)l), (int)n3, (int)n2, (Object)class_17132, (Object)cr_0.b("\u00fe", (Object)b, (long)1684854347298972274L, (long)l), (long)1693250084109161532L, (long)l);
            n = 1;
        }
        return n != 0;
    }

    private static Field g(long l, long l2) {
        int n = cr_0.e(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = cr_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = cr_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = cr_0.c(clazz3, string2, clazz2)) != null) {
                    cr_0.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = cr_0.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        cr_0.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = cr_0.f(1598846488474598L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static boolean j(Object[] objectArray) {
        CallSite callSite;
        long l;
        long l2;
        boolean bl;
        Runnable runnable;
        block4: {
            CallSite callSite2;
            block5: {
                class_1792 class_17922 = (class_1792)objectArray[0];
                runnable = (Runnable)objectArray[1];
                bl = (Boolean)objectArray[2];
                l2 = (Long)objectArray[3];
                long l3 = l2 = a ^ l2;
                l = l3 ^ 0xB317624C4A3L;
                long l4 = l3 ^ 0x1523C24D537L;
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = l4;
                objectArray2[0] = class_17922;
                callSite2 = cr_0.b("e", (Object)objectArray2, (long)7221595911196638933L, (long)l2);
                CallSite callSite3 = cr_0.b("e", (long)7220882590362022239L, (long)l2);
                try {
                    try {
                        callSite = callSite2;
                        if (callSite3 != null) break block4;
                        if (callSite != null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw cr_0.b("e", (Object)matchException, (long)7223502585276989286L, (long)l2);
                    }
                    return false;
                }
                catch (MatchException matchException) {
                    throw cr_0.b("e", (Object)matchException, (long)7223502585276989286L, (long)l2);
                }
            }
            callSite = callSite2;
        }
        Object[] objectArray3 = new Object[4];
        objectArray3[3] = l;
        objectArray3[2] = bl;
        objectArray3[1] = runnable;
        objectArray3[0] = (int)cr_0.b("\u00b5", (Object)callSite, (long)7223173468996620582L, (long)l2);
        cr_0.b("e", (Object)objectArray3, (long)7218774734107891547L, (long)l2);
        return true;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(cr_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(cr_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


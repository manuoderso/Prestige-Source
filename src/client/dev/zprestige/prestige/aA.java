/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  net.minecraft.class_1282
 *  net.minecraft.class_1297
 *  net.minecraft.class_1304
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_1927
 *  net.minecraft.class_2338
 *  net.minecraft.class_243
 *  net.minecraft.class_2680
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 *  net.minecraft.class_3965
 *  net.minecraft.class_5321
 *  net.minecraft.class_6880
 *  net.minecraft.class_9304
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.Y;
import dev.zprestige.prestige.a5;
import dev.zprestige.prestige.ad_0;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.cz_0;
import dev.zprestige.prestige.gx_0;
import dev.zprestige.prestige.hc;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1282;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1927;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_5321;
import net.minecraft.class_6880;
import net.minecraft.class_9304;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aA
implements cz_0 {
    private final class_243 a;
    private class_1927 c;
    private class_3959 d;
    private volatile long e;
    private final ConcurrentHashMap f;
    private static final ThreadLocal g;
    private static final long h;
    private static final long i;
    private static final Object[] j;
    private static final String[] k;

    public aA(long l) {
        long l2 = (l = h ^ l) ^ 0x539B8D902F01L;
        this.a = new class_243(0.0, 0.0, 0.0);
        this.e = i;
        this.f = new ConcurrentHashMap();
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = this;
        aA.a("\u00d0", (Object)aA.a("\u00c9", (long)-1857905364829261221L, (long)l), (Object)objectArray, (long)-1866032308888881345L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        h = hc.a(8869962254313918994L, -3047970656530627497L, MethodHandles.lookup().lookupClass()).a(86206075310193L);
        long l = h ^ 0x3E4227CE4CAFL;
        j = new Object[221];
        k = new String[221];
        aA.a();
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -8433384711842721866L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                i = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                g = aA.a("$", Object2IntOpenHashMap::new, (long)-2641992334454233656L, (long)l);
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    public double e(Object[] objectArray) {
        class_1309 class_13092 = (class_1309)objectArray[0];
        class_243 class_2432 = (class_243)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = (l = h ^ l) ^ 0x2A3C5EBA68A9L;
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = l2;
        objectArray2[4] = null;
        objectArray2[3] = null;
        objectArray2[2] = null;
        objectArray2[1] = class_2432;
        objectArray2[0] = class_13092;
        return (double)aA.a("\u00d0", (Object)this, (Object)objectArray2, (long)-4252526630799946249L, (long)l);
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (k[n3] != null) {
            return n3;
        }
        Object object = j[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 31;
            case 1 -> 54;
            case 2 -> 18;
            case 3 -> 20;
            case 4 -> 16;
            case 5 -> 2;
            case 6 -> 34;
            case 7 -> 32;
            case 8 -> 24;
            case 9 -> 51;
            case 10 -> 55;
            case 11 -> 19;
            case 12 -> 56;
            case 13 -> 41;
            case 14 -> 8;
            case 15 -> 57;
            case 16 -> 25;
            case 17 -> 46;
            case 18 -> 14;
            case 19 -> 23;
            case 20 -> 37;
            case 21 -> 59;
            case 22 -> 38;
            case 23 -> 29;
            case 24 -> 58;
            case 25 -> 27;
            case 26 -> 48;
            case 27 -> 15;
            case 28 -> 30;
            case 29 -> 26;
            case 30 -> 47;
            case 31 -> 60;
            case 32 -> 1;
            case 33 -> 4;
            case 34 -> 28;
            case 35 -> 61;
            case 36 -> 17;
            case 37 -> 22;
            case 38 -> 35;
            case 39 -> 43;
            case 40 -> 36;
            case 41 -> 53;
            case 42 -> 33;
            case 43 -> 42;
            case 44 -> 0;
            case 45 -> 50;
            case 46 -> 5;
            case 47 -> 63;
            case 48 -> 6;
            case 49 -> 49;
            case 50 -> 10;
            case 51 -> 21;
            case 52 -> 3;
            case 53 -> 11;
            case 54 -> 40;
            case 55 -> 45;
            case 56 -> 13;
            case 57 -> 52;
            case 58 -> 9;
            case 59 -> 12;
            case 60 -> 44;
            case 61 -> 39;
            case 62 -> 7;
            default -> 62;
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
        aA.k[n3] = new String(cArray);
        return n3;
    }

    private double i(Object[] objectArray) {
        double d;
        block19: {
            Object object;
            block20: {
                CallSite callSite;
                CallSite callSite2;
                double d10;
                CallSite callSite3;
                long l;
                long l2;
                long l3;
                long l4;
                class_1309 class_13092;
                block17: {
                    long l5;
                    class_2680 class_26802;
                    class_2338 class_23382;
                    class_2338 class_23383;
                    class_243 class_2432;
                    block18: {
                        double d11;
                        block16: {
                            Object object2;
                            block15: {
                                class_13092 = (class_1309)objectArray[0];
                                class_2432 = (class_243)objectArray[1];
                                d11 = (Double)objectArray[2];
                                class_23383 = (class_2338)objectArray[3];
                                class_23382 = (class_2338)objectArray[4];
                                class_26802 = (class_2680)objectArray[5];
                                l4 = (Long)objectArray[6];
                                long l6 = l4 = h ^ l4;
                                l5 = l6 ^ 0x4822A71B77A8L;
                                l3 = l6 ^ 0x77F7609C91F2L;
                                l2 = l6 ^ 0x1D0B111DA959L;
                                l = l6 ^ 0x7AE5B247AEDEL;
                                callSite3 = aA.a("$", (long)-5454891884177542505L, (long)l4);
                                try {
                                    try {
                                        object2 = class_13092 instanceof class_1657;
                                        if (callSite3 != null) break block15;
                                        if (!object2) break block16;
                                    }
                                    catch (MatchException matchException) {
                                        throw aA.a("$", (Object)matchException, (long)-5455096460616255561L, (long)l4);
                                    }
                                    object2 = aA.a("O", (Object)aA.a("\u00d0", (Object)((class_1657)class_13092), (long)-5450735381616165921L, (long)l4), (long)-5455157702426351902L, (long)l4);
                                }
                                catch (MatchException matchException) {
                                    throw aA.a("$", (Object)matchException, (long)-5455096460616255561L, (long)l4);
                                }
                            }
                            try {
                                if (object2) {
                                    return 0.0;
                                }
                            }
                            catch (MatchException matchException) {
                                throw aA.a("$", (Object)matchException, (long)-5455096460616255561L, (long)l4);
                            }
                        }
                        d10 = 4.0 + 1.5 * aA.a("$", (double)d11, (double)5.0, (long)-5455402749198840946L, (long)l4);
                        callSite2 = aA.a("$", (double)aA.a("\u00d0", (Object)class_13092, (Object)class_2432, (long)-5453862900387252909L, (long)l4), (long)-5444702249329003587L, (long)l4);
                        try {
                            try {
                                callSite = callSite2;
                                if (callSite3 != null) break block17;
                                if (!(callSite > d10 * 2.0)) break block18;
                            }
                            catch (MatchException matchException) {
                                throw aA.a("$", (Object)matchException, (long)-5455096460616255561L, (long)l4);
                            }
                            return 0.0;
                        }
                        catch (MatchException matchException) {
                            throw aA.a("$", (Object)matchException, (long)-5455096460616255561L, (long)l4);
                        }
                    }
                    Object[] objectArray2 = new Object[10];
                    objectArray2[9] = l5;
                    objectArray2[8] = class_26802;
                    objectArray2[7] = class_23382;
                    objectArray2[6] = null;
                    objectArray2[5] = false;
                    objectArray2[4] = class_23383;
                    objectArray2[3] = this.d;
                    objectArray2[2] = false;
                    objectArray2[1] = class_13092;
                    objectArray2[0] = class_2432;
                    callSite = aA.a("\u00d0", (Object)this, (Object)objectArray2, (long)-5454176980565775720L, (long)l4);
                }
                CallSite callSite4 = callSite;
                double d12 = (1.0 - callSite2 / (d10 * 2.0)) * callSite4;
                object = (d12 * d12 + d12) / 2.0 * 7.0 * (d10 * 2.0) + 1.0;
                Object[] objectArray3 = new Object[2];
                objectArray3[1] = l2;
                objectArray3[0] = object;
                object = aA.a("\u00d0", (Object)this, (Object)objectArray3, (long)-5451492558624680615L, (long)l4);
                Object[] objectArray4 = new Object[3];
                objectArray4[2] = l;
                objectArray4[1] = object;
                objectArray4[0] = class_13092;
                object = aA.a("\u00d0", (Object)this, (Object)objectArray4, (long)-5457148712805274300L, (long)l4);
                object = (double)aA.a("$", (Object)class_13092, (float)((float)object), (Object)aA.a("\u00d0", (Object)aA.a("\u00d0", (Object)aA.a("O", (Object)b, (long)-5454571379454392697L, (long)l4), (long)-5455242478777457564L, (long)l4), null, (long)-5456978406343315267L, (long)l4), (float)((float)aA.a("\u00d0", (Object)class_13092, (long)-5443453673203390577L, (long)l4)), (float)((float)aA.a("\u00d0", (Object)aA.a("\u00d0", (Object)class_13092, (Object)aA.a("\u00c9", (long)-5454116026347506303L, (long)l4), (long)-5457758971224477718L, (long)l4), (long)-5457286189718287971L, (long)l4)), (long)-5456175764644122857L, (long)l4);
                Object[] objectArray5 = new Object[4];
                objectArray5[3] = l3;
                objectArray5[2] = aA.a("\u00d0", (Object)aA.a("\u00d0", (Object)aA.a("O", (Object)b, (long)-5454571379454392697L, (long)l4), (long)-5455242478777457564L, (long)l4), null, (long)-5456978406343315267L, (long)l4);
                objectArray5[1] = object;
                objectArray5[0] = class_13092;
                object = aA.a("$", (Object)objectArray5, (long)-5456838157888744592L, (long)l4);
                try {
                    try {
                        d = object;
                        if (callSite3 != null) break block19;
                        if (!(d < 0.0)) break block20;
                    }
                    catch (MatchException matchException) {
                        throw aA.a("$", (Object)matchException, (long)-5455096460616255561L, (long)l4);
                    }
                    d = 0.0;
                    break block19;
                }
                catch (MatchException matchException) {
                    throw aA.a("$", (Object)matchException, (long)-5455096460616255561L, (long)l4);
                }
            }
            d = object;
        }
        return d;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = aA.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public double b(Object[] objectArray) {
        gx_0 gx_02;
        long l;
        long l2;
        boolean bl;
        class_2338 class_23382;
        boolean bl2;
        class_243 class_2432;
        class_1309 class_13092;
        block9: {
            Double d;
            block8: {
                CallSite callSite;
                block7: {
                    CallSite callSite2;
                    block6: {
                        class_13092 = (class_1309)objectArray[0];
                        class_2432 = (class_243)objectArray[1];
                        bl2 = (Boolean)objectArray[2];
                        class_23382 = (class_2338)objectArray[3];
                        bl = (Boolean)objectArray[4];
                        l2 = (Long)objectArray[5];
                        l = (l2 = h ^ l2) ^ 0x36EDA95DFFA4L;
                        callSite2 = aA.a("\u00d0", (Object)aA.a("O", (Object)b, (long)-5212259052774832800L, (long)l2), (long)-5214642406791765431L, (long)l2);
                        callSite = aA.a("$", (long)-5211937451211312784L, (long)l2);
                        try {
                            try {
                                if (callSite != null) break block6;
                                if (callSite2 == this.e) break block7;
                            }
                            catch (MatchException matchException) {
                                throw aA.a("$", (Object)matchException, (long)-5211592134332042160L, (long)l2);
                            }
                            aA.a("\u00d0", (Object)this.f, (long)-5213181542749350674L, (long)l2);
                        }
                        catch (MatchException matchException) {
                            throw aA.a("$", (Object)matchException, (long)-5211592134332042160L, (long)l2);
                        }
                    }
                    this.e = (long)callSite2;
                }
                gx_02 = new gx_0(class_13092, (double)aA.a("O", (Object)class_2432, (long)-5206271771694046428L, (long)l2), (double)aA.a("O", (Object)class_2432, (long)-5218914203527451337L, (long)l2), (double)aA.a("O", (Object)class_2432, (long)-5211192880329667581L, (long)l2), bl2, class_23382, bl);
                Double d10 = (Double)((Object)aA.a("\u00d0", (Object)this.f, (Object)gx_02, (long)-5214871107394946580L, (long)l2));
                try {
                    d = d10;
                    if (callSite != null) break block8;
                    if (d == null) break block9;
                }
                catch (MatchException matchException) {
                    throw aA.a("$", (Object)matchException, (long)-5211592134332042160L, (long)l2);
                }
                d = d10;
            }
            return (double)aA.a("\u00d0", (Object)d, (long)-5212306801276622259L, (long)l2);
        }
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = l;
        objectArray2[4] = bl;
        objectArray2[3] = class_23382;
        objectArray2[2] = bl2;
        objectArray2[1] = class_2432;
        objectArray2[0] = class_13092;
        CallSite callSite = aA.a("\u00d0", (Object)this, (Object)objectArray2, (long)-5214255915449356706L, (long)l2);
        aA.a("\u00d0", (Object)this.f, (Object)gx_02, (Object)aA.a("$", (double)callSite, (long)-5207664943676236489L, (long)l2), (long)-5213575614415758732L, (long)l2);
        return (double)callSite;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'O' || c == '\u00d4' || c == '\u00c9' || c == '\u00c3') {
                field = aA.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'O' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d4' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c9' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = aA.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d0' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '$' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
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

    private double c(Object[] objectArray) {
        double d;
        block30: {
            Object object;
            block31: {
                CallSite callSite;
                CallSite callSite2;
                CallSite callSite3;
                long l;
                long l2;
                long l3;
                long l4;
                class_1309 class_13092;
                block28: {
                    long l5;
                    boolean bl;
                    class_2338 class_23382;
                    boolean bl2;
                    class_243 class_2432;
                    block29: {
                        block27: {
                            reference v12;
                            reference v11;
                            reference v10;
                            ad_0 ad_02;
                            long l6;
                            block26: {
                                class_1309 class_13093;
                                long l7;
                                block23: {
                                    block24: {
                                        CallSite callSite4;
                                        block25: {
                                            class_13092 = (class_1309)objectArray[0];
                                            class_2432 = (class_243)objectArray[1];
                                            bl2 = (Boolean)objectArray[2];
                                            class_23382 = (class_2338)objectArray[3];
                                            bl = (Boolean)objectArray[4];
                                            l4 = (Long)objectArray[5];
                                            long l8 = l4 = h ^ l4;
                                            l5 = l8 ^ 0x4044AD9E1C31L;
                                            l7 = l8 ^ 0x6A4769F8329BL;
                                            l3 = l8 ^ 0x7F916A19FA6BL;
                                            l6 = l8 ^ 0x297BE5A1D812L;
                                            l2 = l8 ^ 0x156D1B98C2C0L;
                                            l = l8 ^ 0x7283B8C2C547L;
                                            callSite3 = aA.a("$", (long)-2317844326775072498L, (long)l4);
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            class_13093 = class_13092;
                                                            if (callSite3 != null) break block23;
                                                            if (!(class_13093 instanceof class_1657)) break block24;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw aA.a("$", (Object)matchException, (long)-2318629445017052114L, (long)l4);
                                                        }
                                                        callSite4 = aA.a("\u00d0", (Object)aA.a("\u00d0", (Object)b, (long)-2318401158664351142L, (long)l4), (Object)aA.a("\u00d0", (Object)class_13092, (long)-2311196512510273272L, (long)l4), (long)-2311114924234611862L, (long)l4);
                                                        if (callSite3 != null) break block25;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw aA.a("$", (Object)matchException, (long)-2318629445017052114L, (long)l4);
                                                    }
                                                    if (callSite4 == null) break block24;
                                                }
                                                catch (MatchException matchException) {
                                                    throw aA.a("$", (Object)matchException, (long)-2318629445017052114L, (long)l4);
                                                }
                                                callSite4 = aA.a("\u00d0", (Object)aA.a("\u00d0", (Object)b, (long)-2318401158664351142L, (long)l4), (Object)aA.a("\u00d0", (Object)class_13092, (long)-2311196512510273272L, (long)l4), (long)-2311114924234611862L, (long)l4);
                                            }
                                            catch (MatchException matchException) {
                                                throw aA.a("$", (Object)matchException, (long)-2318629445017052114L, (long)l4);
                                            }
                                        }
                                        try {
                                            if (aA.a("\u00d0", (Object)callSite4, (long)-2316525553661842881L, (long)l4) == aA.a("\u00c9", (long)-2310843100292263841L, (long)l4)) {
                                                return 0.0;
                                            }
                                        }
                                        catch (MatchException matchException) {
                                            throw aA.a("$", (Object)matchException, (long)-2318629445017052114L, (long)l4);
                                        }
                                    }
                                    class_13093 = class_13092;
                                }
                                Object[] objectArray2 = new Object[2];
                                objectArray2[1] = l7;
                                objectArray2[0] = class_13093;
                                CallSite callSite5 = aA.a("$", (Object)objectArray2, (long)-2323546684946842570L, (long)l4);
                                try {
                                    try {
                                        ad_02 = new ad_0(this.a);
                                        reference v12 = aA.a("O", (Object)callSite5, (long)-2323367896054756518L, (long)l4);
                                        v12 = aA.a("O", (Object)callSite5, (long)-2311305984870120119L, (long)l4);
                                        v12 = aA.a("O", (Object)callSite5, (long)-2319290094488148867L, (long)l4);
                                        if (callSite3 != null) break block26;
                                        Object[] objectArray3 = new Object[4];
                                        objectArray3[3] = l6;
                                        objectArray3[2] = (double)v12;
                                        objectArray3[1] = (double)v11;
                                        objectArray3[0] = (double)v10;
                                        aA.a("\u00d0", (Object)ad_02, (Object)objectArray3, (long)-2319135411905214740L, (long)l4);
                                        if (!bl2) break block27;
                                    }
                                    catch (MatchException matchException) {
                                        throw aA.a("$", (Object)matchException, (long)-2318629445017052114L, (long)l4);
                                    }
                                    ad_02 = new ad_0(this.a);
                                    reference v12 = aA.a("O", (Object)this.a, (long)-2323367896054756518L, (long)l4) + aA.a("O", (Object)aA.a("\u00d0", (Object)class_13092, (long)-2318035215428853297L, (long)l4), (long)-2323367896054756518L, (long)l4);
                                    v12 = aA.a("O", (Object)this.a, (long)-2311305984870120119L, (long)l4) + aA.a("O", (Object)aA.a("\u00d0", (Object)class_13092, (long)-2318035215428853297L, (long)l4), (long)-2311305984870120119L, (long)l4);
                                    v12 = aA.a("O", (Object)this.a, (long)-2319290094488148867L, (long)l4) + aA.a("O", (Object)aA.a("\u00d0", (Object)class_13092, (long)-2318035215428853297L, (long)l4), (long)-2319290094488148867L, (long)l4);
                                }
                                catch (MatchException matchException) {
                                    throw aA.a("$", (Object)matchException, (long)-2318629445017052114L, (long)l4);
                                }
                            }
                            Object[] objectArray4 = new Object[4];
                            objectArray4[3] = l6;
                            objectArray4[2] = (double)v12;
                            objectArray4[1] = (double)v11;
                            objectArray4[0] = (double)v10;
                            aA.a("\u00d0", (Object)ad_02, (Object)objectArray4, (long)-2319135411905214740L, (long)l4);
                        }
                        callSite2 = aA.a("$", (double)aA.a("\u00d0", (Object)this.a, (Object)class_2432, (long)-2310346620506032309L, (long)l4), (long)-2312175918048864220L, (long)l4);
                        try {
                            try {
                                callSite = callSite2;
                                if (callSite3 != null) break block28;
                                if (!(callSite > 12.0)) break block29;
                            }
                            catch (MatchException matchException) {
                                throw aA.a("$", (Object)matchException, (long)-2318629445017052114L, (long)l4);
                            }
                            return 0.0;
                        }
                        catch (MatchException matchException) {
                            throw aA.a("$", (Object)matchException, (long)-2318629445017052114L, (long)l4);
                        }
                    }
                    Object[] objectArray5 = new Object[10];
                    objectArray5[9] = l5;
                    objectArray5[8] = null;
                    objectArray5[7] = null;
                    objectArray5[6] = null;
                    objectArray5[5] = bl;
                    objectArray5[4] = class_23382;
                    objectArray5[3] = this.d;
                    objectArray5[2] = bl2;
                    objectArray5[1] = class_13092;
                    objectArray5[0] = class_2432;
                    callSite = aA.a("\u00d0", (Object)this, (Object)objectArray5, (long)-2317147599195946751L, (long)l4);
                }
                CallSite callSite6 = callSite;
                double d10 = (1.0 - callSite2 / 12.0) * callSite6;
                object = (d10 * d10 + d10) / 2.0 * 7.0 * 12.0 + 1.0;
                Object[] objectArray6 = new Object[2];
                objectArray6[1] = l2;
                objectArray6[0] = object;
                object = aA.a("\u00d0", (Object)this, (Object)objectArray6, (long)-2323470376510095680L, (long)l4);
                object = (double)aA.a("$", (Object)class_13092, (float)((float)object), (Object)aA.a("\u00d0", (Object)aA.a("\u00d0", (Object)aA.a("O", (Object)b, (long)-2318104364140548834L, (long)l4), (long)-2318758180246761475L, (long)l4), null, (long)-2315444583818290396L, (long)l4), (float)((float)aA.a("\u00d0", (Object)class_13092, (long)-2310909697912222698L, (long)l4)), (float)((float)aA.a("\u00d0", (Object)aA.a("\u00d0", (Object)class_13092, (Object)aA.a("\u00c9", (long)-2317631727816679912L, (long)l4), (long)-2316207796746206093L, (long)l4), (long)-2316297742055955964L, (long)l4)), (long)-2315187299533470578L, (long)l4);
                Object[] objectArray7 = new Object[3];
                objectArray7[2] = l;
                objectArray7[1] = object;
                objectArray7[0] = class_13092;
                object = aA.a("\u00d0", (Object)this, (Object)objectArray7, (long)-2315597538611722531L, (long)l4);
                Object[] objectArray8 = new Object[4];
                objectArray8[3] = l3;
                objectArray8[2] = aA.a("\u00d0", (Object)aA.a("\u00d0", (Object)aA.a("O", (Object)b, (long)-2318104364140548834L, (long)l4), (long)-2318758180246761475L, (long)l4), null, (long)-2315444583818290396L, (long)l4);
                objectArray8[1] = object;
                objectArray8[0] = class_13092;
                object = aA.a("$", (Object)objectArray8, (long)-2315867267851880215L, (long)l4);
                try {
                    try {
                        d = object;
                        if (callSite3 != null) break block30;
                        if (!(d < 0.0)) break block31;
                    }
                    catch (MatchException matchException) {
                        throw aA.a("$", (Object)matchException, (long)-2318629445017052114L, (long)l4);
                    }
                    d = 0.0;
                    break block30;
                }
                catch (MatchException matchException) {
                    throw aA.a("$", (Object)matchException, (long)-2318629445017052114L, (long)l4);
                }
            }
            d = object;
        }
        return d;
    }

    private double n(Object[] objectArray) {
        double d;
        block6: {
            Object object;
            double d10;
            block4: {
                CallSite callSite;
                long l;
                block5: {
                    class_1309 class_13092 = (class_1309)objectArray[0];
                    double d11 = (Double)objectArray[1];
                    l = (Long)objectArray[2];
                    l = h ^ l;
                    d10 = d11;
                    callSite = aA.a("$", (long)-8266287921474991213L, (long)l);
                    try {
                        object = aA.a("\u00d0", (Object)class_13092, (Object)aA.a("\u00c9", (long)-8253163643020162964L, (long)l), (long)-8267061634859829617L, (long)l);
                        if (callSite != null) break block4;
                        if (object == false) break block5;
                    }
                    catch (MatchException matchException) {
                        throw aA.a("$", (Object)matchException, (long)-8264121813337633101L, (long)l);
                    }
                    reference var10_7 = aA.a("\u00d0", (Object)aA.a("\u00d0", (Object)class_13092, (Object)aA.a("\u00c9", (long)-8253163643020162964L, (long)l), (long)-8254882555396355941L, (long)l), (long)-8260780551066618796L, (long)l) + 1;
                    d10 *= 1.0 - (double)var10_7 * 0.2;
                }
                try {
                    d = d10;
                    if (callSite != null) break block6;
                    double d11 = d - 0.0;
                    object = d11 == 0.0 ? 0 : (d11 < 0.0 ? -1 : 1);
                }
                catch (MatchException matchException) {
                    throw aA.a("$", (Object)matchException, (long)-8264121813337633101L, (long)l);
                }
            }
            d = object < 0 ? 0.0 : d10;
        }
        return d;
    }

    public double h(Object[] objectArray) {
        class_1309 class_13092 = (class_1309)objectArray[0];
        class_243 class_2432 = (class_243)objectArray[1];
        double d = (Double)objectArray[2];
        class_2338 class_23382 = (class_2338)objectArray[3];
        class_2338 class_23383 = (class_2338)objectArray[4];
        class_2680 class_26802 = (class_2680)objectArray[5];
        long l = (Long)objectArray[6];
        long l2 = (l = h ^ l) ^ 0x554D15370A32L;
        Object[] objectArray2 = new Object[7];
        objectArray2[6] = l2;
        objectArray2[5] = class_26802;
        objectArray2[4] = class_23383;
        objectArray2[3] = class_23382;
        objectArray2[2] = d;
        objectArray2[1] = class_2432;
        objectArray2[0] = class_13092;
        return (double)aA.a("\u00d0", (Object)this, (Object)objectArray2, (long)3003737138074171199L, (long)l);
    }

    private static Method h(long l, long l2) {
        int n = aA.e(l, l2);
        Object object = j[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = k[n];
                int n3 = string2.indexOf(8);
                clazz3 = aA.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = aA.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = aA.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        aA.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = aA.f(929224517630841L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = aA.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        aA.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = aA.f(929224517630841L, 0L);
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
            int n = aA.e(l, l2);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                aA.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private double f(Object[] objectArray) {
        double d;
        block20: {
            Object object;
            block21: {
                CallSite callSite;
                CallSite callSite2;
                CallSite callSite3;
                long l;
                long l2;
                long l3;
                long l4;
                class_1309 class_13092;
                block18: {
                    long l5;
                    class_2680 class_26802;
                    class_2338 class_23382;
                    class_2338 class_23383;
                    class_243 class_2432;
                    block19: {
                        class_1309 class_13093;
                        block16: {
                            block17: {
                                class_13092 = (class_1309)objectArray[0];
                                class_2432 = (class_243)objectArray[1];
                                class_23383 = (class_2338)objectArray[2];
                                class_23382 = (class_2338)objectArray[3];
                                class_26802 = (class_2680)objectArray[4];
                                l4 = (Long)objectArray[5];
                                long l6 = l4 = h ^ l4;
                                l5 = l6 ^ 0x7D276372F878L;
                                l3 = l6 ^ 0x42F2A4F51E22L;
                                l2 = l6 ^ 0x280ED5742689L;
                                l = l6 ^ 0x4FE0762E210EL;
                                callSite3 = aA.a("$", (long)4295415614602100039L, (long)l4);
                                try {
                                    try {
                                        try {
                                            try {
                                                class_13093 = class_13092;
                                                if (callSite3 != null) break block16;
                                                if (!(class_13093 instanceof class_1657)) break block17;
                                            }
                                            catch (MatchException matchException) {
                                                throw aA.a("$", (Object)matchException, (long)4295219832109119591L, (long)l4);
                                            }
                                            class_13093 = (class_1657)class_13092;
                                            if (callSite3 != null) break block16;
                                        }
                                        catch (MatchException matchException) {
                                            throw aA.a("$", (Object)matchException, (long)4295219832109119591L, (long)l4);
                                        }
                                        if (aA.a("O", (Object)aA.a("\u00d0", (Object)class_13093, (long)4290571489087124495L, (long)l4), (long)4295123414526306610L, (long)l4) == false) break block17;
                                    }
                                    catch (MatchException matchException) {
                                        throw aA.a("$", (Object)matchException, (long)4295219832109119591L, (long)l4);
                                    }
                                    return 0.0;
                                }
                                catch (MatchException matchException) {
                                    throw aA.a("$", (Object)matchException, (long)4295219832109119591L, (long)l4);
                                }
                            }
                            class_13093 = class_13092;
                        }
                        callSite2 = aA.a("$", (double)aA.a("\u00d0", (Object)class_13093, (Object)class_2432, (long)4296374203886992003L, (long)l4), (long)4296642002743786605L, (long)l4);
                        try {
                            try {
                                callSite = callSite2;
                                if (callSite3 != null) break block18;
                                if (!(callSite > 10.0)) break block19;
                            }
                            catch (MatchException matchException) {
                                throw aA.a("$", (Object)matchException, (long)4295219832109119591L, (long)l4);
                            }
                            return 0.0;
                        }
                        catch (MatchException matchException) {
                            throw aA.a("$", (Object)matchException, (long)4295219832109119591L, (long)l4);
                        }
                    }
                    Object[] objectArray2 = new Object[10];
                    objectArray2[9] = l5;
                    objectArray2[8] = class_26802;
                    objectArray2[7] = class_23382;
                    objectArray2[6] = class_23383;
                    objectArray2[5] = false;
                    objectArray2[4] = null;
                    objectArray2[3] = this.d;
                    objectArray2[2] = false;
                    objectArray2[1] = class_13092;
                    objectArray2[0] = class_2432;
                    callSite = aA.a("\u00d0", (Object)this, (Object)objectArray2, (long)4296130488154334536L, (long)l4);
                }
                CallSite callSite4 = callSite;
                double d10 = (1.0 - callSite2 / 10.0) * callSite4;
                object = (d10 * d10 + d10) / 2.0 * 7.0 * 10.0 + 1.0;
                Object[] objectArray3 = new Object[2];
                objectArray3[1] = l2;
                objectArray3[0] = object;
                object = aA.a("\u00d0", (Object)this, (Object)objectArray3, (long)4289781326851349129L, (long)l4);
                Object[] objectArray4 = new Object[3];
                objectArray4[2] = l;
                objectArray4[1] = object;
                objectArray4[0] = class_13092;
                object = aA.a("\u00d0", (Object)this, (Object)objectArray4, (long)4293167590528475796L, (long)l4);
                object = (double)aA.a("$", (Object)class_13092, (float)((float)object), (Object)aA.a("\u00d0", (Object)aA.a("\u00d0", (Object)aA.a("O", (Object)b, (long)4295674552994908503L, (long)l4), (long)4295062797360868276L, (long)l4), null, (long)4293300474935017325L, (long)l4), (float)((float)aA.a("\u00d0", (Object)class_13092, (long)4297774058554206303L, (long)l4)), (float)((float)aA.a("\u00d0", (Object)aA.a("\u00d0", (Object)class_13092, (Object)aA.a("\u00c9", (long)4296191442237471313L, (long)l4), (long)4292511142013509690L, (long)l4), (long)4293027869633529421L, (long)l4)), (long)4294164691437166791L, (long)l4);
                Object[] objectArray5 = new Object[4];
                objectArray5[3] = l3;
                objectArray5[2] = aA.a("\u00d0", (Object)aA.a("\u00d0", (Object)aA.a("O", (Object)b, (long)4295674552994908503L, (long)l4), (long)4295062797360868276L, (long)l4), null, (long)4293300474935017325L, (long)l4);
                objectArray5[1] = object;
                objectArray5[0] = class_13092;
                object = aA.a("$", (Object)objectArray5, (long)4293442954767834272L, (long)l4);
                try {
                    try {
                        d = object;
                        if (callSite3 != null) break block20;
                        if (!(d < 0.0)) break block21;
                    }
                    catch (MatchException matchException) {
                        throw aA.a("$", (Object)matchException, (long)4295219832109119591L, (long)l4);
                    }
                    d = 0.0;
                    break block20;
                }
                catch (MatchException matchException) {
                    throw aA.a("$", (Object)matchException, (long)4295219832109119591L, (long)l4);
                }
            }
            d = object;
        }
        return d;
    }

    public double l(Object[] objectArray) {
        class_1309 class_13092 = (class_1309)objectArray[0];
        class_243 class_2432 = (class_243)objectArray[1];
        class_2338 class_23382 = (class_2338)objectArray[2];
        class_2680 class_26802 = (class_2680)objectArray[3];
        long l = (Long)objectArray[4];
        long l2 = (l = h ^ l) ^ 0x3B050FC85850L;
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = l2;
        objectArray2[4] = class_26802;
        objectArray2[3] = class_23382;
        objectArray2[2] = aA.a("$", (Object)class_2432, (long)-856958944057838266L, (long)l);
        objectArray2[1] = class_2432;
        objectArray2[0] = class_13092;
        return (double)aA.a("\u00d0", (Object)this, (Object)objectArray2, (long)-863867911197557490L, (long)l);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = aA.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = aA.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = aA.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = aA.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public double d(Object[] objectArray) {
        double d;
        block24: {
            Object object;
            block25: {
                CallSite callSite;
                CallSite callSite2;
                long l;
                long l2;
                long l3;
                long l4;
                long l5;
                long l6;
                class_2338 class_23382;
                class_243 class_2432;
                class_243 class_2433;
                class_1309 class_13092;
                block23: {
                    Object object2;
                    block22: {
                        block19: {
                            long l7;
                            block20: {
                                CallSite callSite3;
                                block21: {
                                    class_13092 = (class_1309)objectArray[0];
                                    class_2433 = (class_243)objectArray[1];
                                    class_2432 = (class_243)objectArray[2];
                                    class_23382 = (class_2338)objectArray[3];
                                    l6 = (Long)objectArray[4];
                                    long l8 = l6 = h ^ l6;
                                    l5 = l8 ^ 0x7FDC2CAC95E9L;
                                    l4 = l8 ^ 0x22F59E3172DEL;
                                    l3 = l8 ^ 0x37239DD0BA2EL;
                                    l7 = l8 ^ 0x61C912689857L;
                                    l2 = l8 ^ 0x5DDFEC518285L;
                                    l = l8 ^ 0x3A314F0B8502L;
                                    callSite2 = aA.a("$", (long)-6949031756076705461L, (long)l6);
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (callSite2 != null) break block19;
                                                    if (!(class_13092 instanceof class_1657)) break block20;
                                                }
                                                catch (MatchException matchException) {
                                                    throw aA.a("$", (Object)matchException, (long)-6946843660726690709L, (long)l6);
                                                }
                                                callSite3 = aA.a("\u00d0", (Object)aA.a("\u00d0", (Object)b, (long)-6947318237684280801L, (long)l6), (Object)aA.a("\u00d0", (Object)class_13092, (long)-6941819753824691891L, (long)l6), (long)-6942283937789172945L, (long)l6);
                                                if (callSite2 != null) break block21;
                                            }
                                            catch (MatchException matchException) {
                                                throw aA.a("$", (Object)matchException, (long)-6946843660726690709L, (long)l6);
                                            }
                                            if (callSite3 == null) break block20;
                                        }
                                        catch (MatchException matchException) {
                                            throw aA.a("$", (Object)matchException, (long)-6946843660726690709L, (long)l6);
                                        }
                                        callSite3 = aA.a("\u00d0", (Object)aA.a("\u00d0", (Object)b, (long)-6947318237684280801L, (long)l6), (Object)aA.a("\u00d0", (Object)class_13092, (long)-6941819753824691891L, (long)l6), (long)-6942283937789172945L, (long)l6);
                                    }
                                    catch (MatchException matchException) {
                                        throw aA.a("$", (Object)matchException, (long)-6946843660726690709L, (long)l6);
                                    }
                                }
                                try {
                                    if (aA.a("\u00d0", (Object)callSite3, (long)-6944756256710612358L, (long)l6) == aA.a("\u00c9", (long)-6941326018105602022L, (long)l6)) {
                                        return 0.0;
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw aA.a("$", (Object)matchException, (long)-6946843660726690709L, (long)l6);
                                }
                            }
                            Object[] objectArray2 = new Object[4];
                            objectArray2[3] = l7;
                            objectArray2[2] = (double)aA.a("O", (Object)class_2432, (long)-6947522328087829448L, (long)l6);
                            objectArray2[1] = (double)aA.a("O", (Object)class_2432, (long)-6941771329865759476L, (long)l6);
                            objectArray2[0] = (double)aA.a("O", (Object)class_2432, (long)-6952161961784816865L, (long)l6);
                            aA.a("\u00d0", (Object)new ad_0(this.a), (Object)objectArray2, (long)-6947490635132369239L, (long)l6);
                        }
                        callSite = aA.a("$", (double)aA.a("\u00d0", (Object)this.a, (Object)class_2433, (long)-6941534322495064306L, (long)l6), (long)-6940951983076059039L, (long)l6);
                        try {
                            try {
                                object2 = callSite;
                                if (callSite2 != null) break block22;
                                if (!(object2 > 12.0)) break block23;
                            }
                            catch (MatchException matchException) {
                                throw aA.a("$", (Object)matchException, (long)-6946843660726690709L, (long)l6);
                            }
                            object2 = 0.0;
                        }
                        catch (MatchException matchException) {
                            throw aA.a("$", (Object)matchException, (long)-6946843660726690709L, (long)l6);
                        }
                    }
                    return (double)object2;
                }
                Object[] objectArray3 = new Object[2];
                objectArray3[1] = l4;
                objectArray3[0] = class_13092;
                CallSite callSite4 = aA.a("\u00d0", (Object)class_2432, (Object)aA.a("$", (Object)objectArray3, (long)-6952341579050926989L, (long)l6), (long)-6946319766355662384L, (long)l6);
                Object[] objectArray4 = new Object[10];
                objectArray4[9] = l5;
                objectArray4[8] = null;
                objectArray4[7] = null;
                objectArray4[6] = null;
                objectArray4[5] = false;
                objectArray4[4] = class_23382;
                objectArray4[3] = this.d;
                objectArray4[2] = callSite4;
                objectArray4[1] = class_13092;
                objectArray4[0] = class_2433;
                CallSite callSite5 = aA.a("\u00d0", (Object)this, (Object)objectArray4, (long)-6944584656722628775L, (long)l6);
                double d10 = (1.0 - callSite / 12.0) * callSite5;
                object = (d10 * d10 + d10) / 2.0 * 7.0 * 12.0 + 1.0;
                Object[] objectArray5 = new Object[2];
                objectArray5[1] = l2;
                objectArray5[0] = object;
                object = aA.a("\u00d0", (Object)this, (Object)objectArray5, (long)-6952387178472030587L, (long)l6);
                object = (double)aA.a("$", (Object)class_13092, (float)((float)object), (Object)aA.a("\u00d0", (Object)aA.a("\u00d0", (Object)aA.a("O", (Object)b, (long)-6948710154651570853L, (long)l6), (long)-6946990396113875016L, (long)l6), null, (long)-6946613473440572575L, (long)l6), (float)((float)aA.a("\u00d0", (Object)class_13092, (long)-6942097144997835693L, (long)l6)), (float)((float)aA.a("\u00d0", (Object)aA.a("\u00d0", (Object)class_13092, (Object)aA.a("\u00c9", (long)-6948114640932528547L, (long)l6), (long)-6945001471624969162L, (long)l6), (long)-6944669599665331647L, (long)l6)), (long)-6945810836841134901L, (long)l6);
                Object[] objectArray6 = new Object[3];
                objectArray6[2] = l;
                objectArray6[1] = object;
                objectArray6[0] = class_13092;
                object = aA.a("\u00d0", (Object)this, (Object)objectArray6, (long)-6946783749299321192L, (long)l6);
                Object[] objectArray7 = new Object[4];
                objectArray7[3] = l3;
                objectArray7[2] = aA.a("\u00d0", (Object)aA.a("\u00d0", (Object)aA.a("O", (Object)b, (long)-6948710154651570853L, (long)l6), (long)-6946990396113875016L, (long)l6), null, (long)-6946613473440572575L, (long)l6);
                objectArray7[1] = object;
                objectArray7[0] = class_13092;
                object = aA.a("$", (Object)objectArray7, (long)-6946474428776400724L, (long)l6);
                try {
                    try {
                        d = object;
                        if (callSite2 != null) break block24;
                        if (!(d < 0.0)) break block25;
                    }
                    catch (MatchException matchException) {
                        throw aA.a("$", (Object)matchException, (long)-6946843660726690709L, (long)l6);
                    }
                    d = 0.0;
                    break block24;
                }
                catch (MatchException matchException) {
                    throw aA.a("$", (Object)matchException, (long)-6946843660726690709L, (long)l6);
                }
            }
            d = object;
        }
        return d;
    }

    private static void a() {
        Object[] objectArray = j;
        j[0] = "Fk5v7HFk\"*;G\\ \"4;R[Qski\u0019";
        objectArray[1] = "9\u0001\u001dFT#9\u0001\n\u001aX,#J\n\u0004X9$;[[\u000e~";
        objectArray[2] = "hHX?\u001c+~H]e\u000f<i\u0003^c\u0003(xDItH:M";
        objectArray[3] = "W)$\u0015}=\"\t/\u001alrC\u0007$\u0011h(7";
        objectArray[4] = Double.TYPE;
        aA.k[4] = "java/lang/Double";
        objectArray[5] = "q+1Xi8q+&\u0004e7k`&\u001ae\"l\u0011vG4";
        objectArray[6] = "\f4;l\u0016)\f4,0\u001a&\u0016\u007f,.\u001a3\u0011\u000exvM";
        objectArray[7] = "\u0001:\u0002gy\u000f\u0001:\u0015;u\u0000\u001bq\u0015%u\u0015\u001c\u0000Ep!_K<\u001a(g\u00150lO\u007f$";
        objectArray[8] = "q\u0000-\t\u000b\u0011q\u0000:U\u0007\u001ekK:K\u0007\u000bl:j\u001eSA;\u00065F\u0015\u000b@Wm\u0015";
        objectArray[9] = ".\u001aMsr\u0019[:F|cV:4Mwg\fN";
        objectArray[10] = "bi\u0018>\u0001Kbi\u000fb\rDx\"\u000f|\rQ\u007fS_)Y\u001b";
        objectArray[11] = "\"}?0I/\"}(lE 86(rE5?Gy*\u0017";
        objectArray[12] = "8qWB;H8q@\u001e7G\":@\u00007R%K\u0012Ud\u0013";
        objectArray[13] = "f\t\u0005pq\u000em\u0006\u0014?\u0010\u0000f\r\u0010e";
        objectArray[14] = "\u007f/Ly0sa'V6xs{-Nqqh;\fS^khv:Swp";
        objectArray[15] = "_LN|\u0019(ADT3Q([NLtX3\u001bkMsT)\\BV";
        objectArray[16] = "yY+\u0017\u007f8yY<Ks7c\u0012<Us\"dcn\u000b*a";
        objectArray[17] = "}V\u0012bV\u0013}V\u0005>Z\u001cg\u001d\u0005 Z\t`lW\u007f\u000bC";
        objectArray[18] = Float.TYPE;
        aA.k[18] = "java/lang/Float";
        objectArray[19] = "L\\SC1pL\\D\u001f=\u007fV\u0017D\u0001=jQf\u0016_d+";
        objectArray[20] = "\nBKR\u0013\u001a\u001cBN\b\u0000\r\u000b\tM\u000e\f\u0019\u001aNZ\u0019G\u000b&";
        objectArray[21] = "*wx#\u0000{_Ws,\u00114\"O`+\u0018}J";
        objectArray[22] = "`kDih|`kS5dsz S+df}Q\u0006t=";
        objectArray[23] = "\u0003UCmkUvuHbz\u001a\u0017{Ci~@c";
        objectArray[24] = ">\b(m@#>\b?1L,$C?/L9#2mz\u001e~";
        objectArray[25] = "8',\u000e]-8';RQ\"\"l;LQ7%\u001d`\u0011\u0000}";
        objectArray[26] = "-B?Vz.-B(\nv!7\t(\u0014v40xzA%p";
        objectArray[27] = "9\\_eDu9\\H9Hz#\u0017H'Ho$f\u001dx\u001d";
        objectArray[28] = "]E\u0011~c*CM\u000b1\u0018\n~`";
        objectArray[29] = "t]\u0019qpjt]\u000e-|en\u0016\u000e3|pig[k-";
        objectArray[30] = ">:XH3$K\u001aSG\"k*\u0014XL&1^";
        objectArray[31] = Integer.TYPE;
        aA.k[31] = "java/lang/Integer";
        objectArray[32] = "\u001aEe#. \u001aEr\u007f\"/\u0000\u000era\":\u0007\u007f'5{y";
        objectArray[33] = "l'9\u0010\u0003#l'.L\u000f,vl.R\u000f9q\u001d|\r\\~";
        objectArray[34] = "\u001f,RXmH\u0014#C\u0017\u000eE\u0001.L|;G\u0010=PP,J";
        objectArray[35] = "p\td;\u0018$f\taa\u000b3qBbg\u0007'`\u0005upL5p";
        objectArray[36] = "\u0019,V<mtl\f]3|;\r\u0002V8xay";
        objectArray[37] = Void.TYPE;
        aA.k[37] = "java/lang/Void";
        objectArray[38] = "A5)%w\fJ:8j\u0014\u0001_<";
        objectArray[39] = "6;%k\u001f\u0004C\u001b.d\u000eK\"\u0015%o\n\u0011V";
        objectArray[40] = "N|mT\u0014\fX|h\u000e\u0007\u001bO7k\b\u000b\u000f^p|\u001f@\u001f\u0012";
        objectArray[41] = "\bR$Jrr}r/Ec=\u001c|$Nggh";
        objectArray[42] = "C\u0011D^@'61OQQhW?DZU2#";
        objectArray[43] = "34n(J 34ytF/)\u007fyjF:.\u000e/7\u0014}";
        objectArray[44] = "+:#x\u000bU=:&\"\u0018B*q%$\u0014V;623_F#608\u0005\u000b\u001f-0%\u0005L(:";
        objectArray[45] = "\u0017Dnf\u0007@\u0001Dk<\u0014W\u0016\u000fh:\u0018C\u0007H\u007f-SR<";
        objectArray[46] = "v^GF\nZ\u0003~LI\u001b\u0015bpGB\u001fO\u0016";
        objectArray[47] = "yL\u0005u\u001b\u000eyL\u0012)\u0017\u0001c\u0007\u00127\u0017\u0014dv@iOT";
        objectArray[48] = Boolean.TYPE;
        aA.k[48] = "java/lang/Boolean";
        objectArray[49] = "\u0016W&Jlx\u0016W1\u0016`w\f\u001c1\b`b\u000bmcV8%";
        objectArray[50] = "M+Z\u001ac>F$KU\u0019:U/M\u001f\u0001=D+@";
        objectArray[51] = "\u0012';}|2\f/!242\u0016%9u=)V\u00158l\"+\u0011#?";
        objectArray[52] = "E\u0001/\u000e!\f0!$\u00010CQ//\n4\u0019%";
        objectArray[53] = "|K4N1]|K#\u0012=Rf\u0000#\f=GaqqVi\u0003";
        objectArray[54] = "k.B\u0006? k.UZ3/qeUD3:v\u0014\u0007\u001eg\u007f";
        objectArray[55] = "q\u0001\u001cg\u001e$o\t\u0006(y%~\u0012\u000br_#";
        objectArray[56] = "\u0019|Mw\u000fT\u0019|Z+\u0003[\u00037Z5\u0003N\u0004F\u0000jR\t";
        objectArray[57] = "G\u0015Xk\u007fAC\bXzbA\u0000\u0007\u0017me]Z\b\u001a0~JD\u0004\u0015jb\u0006a\u0003\u001c{r\\\u001c(\u0018j\\I^E3peZW";
        objectArray[58] = "sz[\u0014)8szLH%7i1LV%\"n@\u0016\twe";
        objectArray[59] = "$So*u\u001c$Sxvy\u0013>\u0018xhy\u00069i\"7+D";
        objectArray[60] = "t\u001b-\"btt\u001b:~n{nP:`nni!h;6$";
        objectArray[61] = "D\u001a>h-tD\u001a)4!{^Q)*!nY {qy/";
        objectArray[62] = "y<\u000eA\u0015Lg4\u0014\u000eh\\g";
        objectArray[63] = "V*Hq\u0002\fV*_-\u000e\u0003La_3\u000e\u0016K\u0010\rg_W";
        objectArray[64] = "N\"&2m{J?&#p{\t0i4wgS?dilpM3k3p<h4b\"`f\u0015\u001ff3NsW";
        objectArray[65] = "r\t-iGsr\t:5K|hB:+Kio3kt\u0012";
        objectArray[66] = "zdIT-;zd^\b!4`/^\u0016!!g^\u000fIyvwm\\\t3\r&5\r";
        objectArray[67] = "CL\u001cEV%CL\u000b\u0019Z*Y\u0007\u000b\u0007Z?^v[^\b~";
        objectArray[68] = "s:k\u0002Cns:|^Oaiq|@Otn\u0000.\u001e\u00170";
        objectArray[69] = " V\u0012\u0014ry6V\u0017Nan!\u001d\u0014Hmz0Z\u0003_&P";
        objectArray[70] = ">SfW\u0002TKsmX\u0013\u001b*}fS\u0017A^";
        objectArray[71] = "\u001dEI\t\u0012x\u001dE^U\u001ew\u0007\u000e^K\u001eb\u0000\u007f\u000e\u001eI$";
        objectArray[72] = "nGo\u001d\bS\u001bgd\u0012\u0019\u001czio\u0019\u001dF\u000e";
        objectArray[73] = "z[|p\u001cdz[k,\u0010k`\u0010k2\u0010~ga:hI=";
        objectArray[74] = "\u000f:\u0000vn,\u000f:\u0017*b#\u0015q\u00174b6\u0012\u0000Fj7s";
        objectArray[75] = "Zj{q>&Zjl-2)@!l32<GP=mgw";
        objectArray[76] = "H@.C\u0005'H@9\u001f\t(R\u000b9\u0001\t=Uzh[]";
        objectArray[77] = "o*n\u0019\u0002uo*yE\u000ezuay[\u000eor\u0010(\u0002V";
        objectArray[78] = "\r~\u001fG'D\u0006q\u000e\bMG\u0012}\u0005C";
        objectArray[79] = "Ky4\u0002m\">Y?\r|m_W4\u0006x7+";
        objectArray[80] = "i\u0010wX\u001amw\u0018m\u0017Wwm\u0012tKF}m\u0005/z[v`\u0004sKQvw9`J\\Ub\u0001";
        objectArray[81] = Long.TYPE;
        aA.k[81] = "java/lang/Long";
        objectArray[82] = "\u0016QH)/ZcqC&>\u0015\u0002\u007fH-:Ov";
        objectArray[83] = ":\u0000\u001f^I]:\u0000\b\u0002ER K\b\u001cEG':YC\u0011\u0004";
        objectArray[84] = "3r#\u0004-)7o#\u00150)t`l\u000275.oa_,\"0cn\u00050n\u0015dg\u0014 4\u0013rh\u0003\"\"6c";
        objectArray[85] = "h{o2\"\u0016lfo#?\u0016/i 48\nuf-i#\u001dkj\"3?QNm+\"/\u000bH{$5-\u000bn}";
        objectArray[86] = "U\u001b+\u0000K%Q\u0006+\u0011V%\u0012\td\u0006Q9H\u0006i[J.V\nf\u0001Vbs\ro\u0010F8\u000e&k\u0001h-L\u001c";
        objectArray[87] = "x?rl\u0005:x?e0\t5bte.\t e\u00053qZb";
        objectArray[88] = "\u000bk\u001b\r\b`\u000bk\fQ\u0004o\u0011 \fO\u0004z\u0016Q^\u0011S>";
        objectArray[89] = "\u0012\u001c`,'!\u0012\u001cwp+.\bWwn+;\u000f&,3z{";
        objectArray[90] = "G5 \rH\bG57QD\u0007]~7OD\u0012Z\u000fb\u001b\u0013S";
        objectArray[91] = "2\b|r\u000bG2\bk.\u0007H(Ck0\u0007]/29d_\u001d";
        objectArray[92] = "4J\u007f$^\u00004JhxR\u000f.\u0001hfR\u001a)p:9\u0003]";
        objectArray[93] = "P4uRUz%\u0014~]D5D\u001auV@o0";
        objectArray[94] = "\u0013\"v\u0010BHf\u0002}\u001fS\u0007\u0007\fv\u0014W]s";
        objectArray[95] = "\u000b\u0012\u0013f\u0010=\u000b\u0012\u0004:\u001c2\u0011Y\u0004$\u001c'\u0016(^zJ`";
        objectArray[96] = "@\u0000A\fM^\u0017\u0007_UHa\u0017\u000fVT\u001b6@V\u0002\nKa@\u0001\u0001V\u001cQ\u0016\u000eDQ\u0017";
        objectArray[97] = "$Hjs\u0005n-\f\"/n2%O;x\u0002\u0000t\u0003d/_WqJ?\u007f\u001ch6]7xQW8O8f\u0005*8\t<un";
        objectArray[98] = "T\u001b\n\u000f]h\u001a\u0003W\u00008v\u0006\u001b\t\u0017TDR_SM8,\u0017\u0004\u0016\u0015Cb\u000fY\u0019p\u0003xW\u001a\u000b\u0017WwZ\u000bi";
        objectArray[99] = "\u0006P6'\r[\u0005Y%{\u001c`^I:a\u0018\u001cXOW\"\u0017QRSn`\u0017\u0012P\u0004W";
        objectArray[100] = "\u0006'JT+l\u0010)JEDk\u00004G_(YSq\u001e\bD7\u00173N^*\u007fV(ICD7P5_V}`\u00070GRD";
        objectArray[101] = "-\u001fNIX\u0017vXC\tg\u001e,H@\\0Aw\u001f\u001c0\u0007J'\\\u001bW\\\r*\u001c";
        objectArray[102] = "#Eg;l\u001b1\u0019nd\u0011\u001d _bf}/}\u001f:>\u0011A5Np?o\u0006qIc1\u0011";
        objectArray[103] = "fL\u0018vV91\u001b\u001dnR\u0000:\u001c\u0019n_l\bLU0\u0005?_H^a\u0007\u007f4M\u00030]l_";
        objectArray[104] = "&\u0006\u0000!\u001e='RW-a`)JP-\rR~\u0006\u000fsag;V\u000e*Pt*R]J\u000288\t\u0000r\u0018>?V0";
        objectArray[105] = "B-\u0013#/@\u0014q\u0004;%)\u0015\"\u00135\u0014U\u00161\u0001#1D{rX*-\u0010\u0011z\f$2J{r\r(iU@q\u0004;5D{";
        objectArray[106] = "<{\u0012?a**u\u0012.\u000e-:h\u001f4b\u001fi,Nm\u000e-mn\u001a.c/1fBS";
        objectArray[107] = "s\u0013\nF8/e\u001d\nWW(u\u0000\u0007M;\u001a&E^\u0010W(`\u0013Z\u0015,?(\u0013^*(?q\rZ\u0013-rb\u0002g";
        objectArray[108] = "3|;vx\u0002$4;rG\u001c;x4,+.j<nqzyoc=$}\u0007'x=\"'y&x72,\u0004&>3!G";
        objectArray[109] = "'\u0017k(`r%F{0_x{Gr6\b/%\u0017+j_+'Wde;)vG|";
        objectArray[110] = "\u0012?E\r\u0004?\u00041E\u001ck8\u0014,H\u0006\u0007\nDn\u0016^k?\u00060\u0016\u0001Z,\u00174Ea";
        objectArray[111] = "8\u0007vfBKv\u001f+i'^f\u0016qup\t<F,\u0019\u001c[;\u0006w~HT6\u0017";
        objectArray[112] = "~@.Pu\u000fyW?\\wl\"A=Wh\u0000\u0010\u0015~\b?PG\u0013=Tp\t<]%\t\u007fl";
        objectArray[113] = "p(E\f\u0012\u000e&'\u0000\u000b\u0019>,*\u0003\n\u001eR\u001evBTE>p*\u0002\u001b\u0014\u0000;|\u000e\u0001\u000b>";
        objectArray[114] = "ZG-\u0004tC\u0018K(\u0001u&\r[+^%q_\u000b|\u0000u&ZG-\u0004tC\u0018K(\u0001u";
        objectArray[115] = "0VysiKx\u001fs{\t\u001b!Jrv^Hq\u001f)\u001al\r/\u001a)a{E/\u001e";
        objectArray[116] = "`\u0013oS_7g\u0004~_]T<\u0012|TB8\u000eF?\u000b\u0015oYFi\u000fK.bNlPI5Y";
        objectArray[117] = "-]Ypt\u001axA\u0001&\u0006\u0016\u0014\nC\u007f9DkK_|vN\u0014\nS/a\u0005w\rD>m\u0007\u0014";
        objectArray[118] = "mUc>\u001b\\sMg9*Y\u0013\f|z\u0015\u000blM`yZ\u0001\u0013M}7UMhHlyL0";
        objectArray[119] = "`ql\u0016]\u0004e,=LNo7+nMN8e{8\u0019\u001fo`ql\u0016]\u0004e,=LN";
        objectArray[120] = "\u0017^\u001d\u000fX/J\\V\u000bX\u0015@\u0003@\u0013\rB\u0012S\u0013KZ\u0015\u0017^R\u0011\u0002wG^F\u000e\u0003";
        objectArray[121] = ">(\u0016YxEyl\u0011Jv;`*\u0017J RcP\u001e\u0011<^z=\u001cM4\u0006\u0007";
        objectArray[122] = "HPX5_\u0005\r\f\u0011t`\u000f\u001aHA*\f=N\u000b\u001eq_jHHB2\u0005\u0011\u0006P\u001f=`";
        objectArray[123] = "\u0019KzAk;\u001a\t;C\f;\u0019O= 7+\\H#Gc$QYA\u001bg|\u001dW&Ohq\f5";
        objectArray[124] = "bRmqr?>A8u?Y>U.o$5\f\u0005b5rYb\t8o>\"!Ib68Y";
        objectArray[125] = "A\u000bZ&\u0003Z\u0014\u0017\u0002pqVx\\@)N\u0004\u0007\u001d\\*\u0001\u000ex\u001dAd\u000eB\u0003\u0018P*\u0017?";
        objectArray[126] = "X8.9]&\u001bxt`[]\u000fh)=L\nX2~b f\n59;G2\u00058(";
        objectArray[127] = ">W\u00158r(uM\u001f$b\u0019iOH=gN;\u0014\u001fe1\u0019>WA9y&y@I>4";
        objectArray[128] = "C\u0019uK\u0001{\u0019\u0016:\u001cK\u0005\u001f\u0014{\u0011\u0017i-@?NK\u0005C\u0016{J\u000bd\u0015\u000b`\u001fN\u0005";
        objectArray[129] = "<]}gq|hN8{pBkFh`g\u00154\u001e<=\u000b{bNj>u3yNld";
        objectArray[130] = "\u00185foF\u0018M)>94\u001a!b|`\u000bF^#`cDL!`kcI\u001fF4dnX}";
        objectArray[131] = ",g\u0003\u0013\tV&tUHyF<k\fi\u001fX!v\u0005LyK:q\u001eF@\t&s\u0013(\bI2,\u001cG\u0002Zdwl";
        objectArray[132] = "{JO\u00074U0\u001cC\u001d+k'JN\u0016>\u0007\u0015\u001d\fLaWB\u001e]L?\u0000rHR\t8\u000bB";
        objectArray[133] = "Z?A\t\u0013\f\u0018-M\u0007}\u0007G#C\n*S\u001dq\u001d[}\f^!\u001aY\u0006\u001b\u0016!\u001e";
        objectArray[134] = "\"O\u0017g9s4A\u0017vVt$\\\u001al:Ft\u001fB4V.5C\u0005n-`-\u001e\n\u000bmzu]\u0018l9uxLz";
        objectArray[135] = "zW\u001d\u000ft29\u0017GVrI-\u0007\u001a\u000be\u001ez]MR\tr(Z\n\rn&'W\u001b";
        objectArray[136] = "+kNaM\u0001(2]>s\u0005FoZ$\u001c\u0013$8_'Ko";
        objectArray[137] = "X\u0017\u000eQE\t[UOS\"\u001cE\u000eRJ\"IJUHRE\u001dEXY0\u0019\u0019\u001d\u0014WWM\u0016\u0010\u00055";
        objectArray[138] = "~.o\f\u0006\u0006=n5U\u0000})~h\b\u0017*~$?V{F,#x\u000e\u001c\u0012#.i";
        objectArray[139] = "Gp4~p.Ouk|k\u0015\u0010xbtfBG\"4+\n,\u0017\"aj1$\u0012}cq";
        objectArray[140] = "\u000e +t\n_Ue:q:PT3 bm\u0007\u000bn{\u000eTXPd9mF\u0004Y;";
        objectArray[141] = "\r_XHgkJO_\u000fz\u0016XYH\u001dy{jWQ\np\u0016\u000fU\t\n\u007fq[Z\u0004\u001b\u001d";
        objectArray[142] = " 'F\u0012HuwpC\nLL|wG\nA N%\nT\u001eLifX\u0013M1i \\\u0000&";
        objectArray[143] = "o&\u0011/\u0012[y(\u0011>}\\i5\u001c$\u0011n=yCrM9;5\u001f<\u0018Bu-B3}";
        objectArray[144] = ">\u0004\u0000\u001cJmeA\u0011\u0019zih\u0006\u000f\u0001\u0016[<GQ\\zn5J\u0004\u0019Boa\u001d\bf";
        objectArray[145] = "\u000f@\"U\u0014\u0013\u000e\u001acX^lSI$\\C\u0000a\u001d`\u0005\u0018V6\u001f3\u0000Y\u000eQK<\rHl\rOdAF\u000bY@iP$W]\u0018%^C\u0003R\u00154<\u001d\bLMhC\u001cR\r@\"<";
        objectArray[146] = "kavdP\u0019 {|x@(<y+aE\u007fn\"|9\u0017(ka\"e[\u0017,v*b\u0016";
        objectArray[147] = "=\u0012R\u00068K>P\u0013\u0004_U%\ni\\4\f9\u000e\u000e\b;\u0001(lR\fcM&\u000b\u0006\u0003n\\DW\u0002[\"R#\u0003\rV30";
        objectArray[148] = "^@Su\u001e)\u000bI\u0011>][\t\u0018Da\b\fXE\u0016:d+\u001b\u001aPn\u0019+]\u001eC";
        objectArray[149] = "XZj\u0016g\u0017J\u0006cI\u001a\u0011[@oKv#\n\f>\u0012!tVW~\u001ds\u0013PZ3P\u001a";
        objectArray[150] = "\n\u0001R\u0007%\u001c\\\u001cIR`}V\u0003R\\9\u0011dW\u0016\rd}\f\u0012MC;\u0006B\n\u0010L^BO\rQY%\fWP^<d\u0005P\tQ\\:\u0004Mn\u0017P1\u001aI\r\u0010G \u0016Kn";
        objectArray[151] = "@\u000f\t5,E\u0015\u0013Qc^Iy\u0007\u0014=%BGZS|? \u001f\u001aW~<\u001eB]\u0016d^";
        objectArray[152] = "i/RfCj!?\u001b'\u0012\u0016>E\u001ae\u001d)k:[y\u001efaE[dPi->^u\u001epP";
        objectArray[153] = "\u000e\u001a1\u0013H4\f[cMNLQM,U*}\nL&TN<U\u0018m)";
        objectArray[154] = "6mf7\u0007@b~#+\u0006~avs0\u0011)>//i}Gh~qn\u0003\u000fs~w4";
        objectArray[155] = "\u0019!\u0011\u0013\\|M2T\u000f]BN:\u0004\u0014J\u0015\u0011cXN&{G2\u0006JX3\\2\u0000\u0010";
        objectArray[156] = "\"|^*[/vo\u001b6Z\u0011ugK-MF*?\u001ev!(|oIs_`goO)";
        objectArray[157] = "\u0001 j\t\u0005\bO87\u0006`\u001d_1m\u001a7J\u0005a1v[\u0018\u0002!k\u0011\u000f\u0017\u000f0";
        objectArray[158] = "q&&YV\u007f,5\u007fC)n\u0016q8\u0016\u00169i0$\u0015Y3\u001609[V\u007fm5(\u0015O\u0002";
        objectArray[159] = "?xD8Va|8\u001eaP\u001ac$R8LvQx\u001ei+!muS:LubxBX\u0010q:4L?D~7%.c@&{+I7O+jI\u0017iAz{2T)\u001b#}I";
        objectArray[160] = "\u0010\u0002\rTM$\u0010T\u001eT?+L\b\u0014Gh|\u0016YO+\u0002\"P\u001a\u0002J\u0002tC\u001a";
        objectArray[161] = "\u000e\f\u0011-\u000e]\u000eU\u0014?Q!X\u0002UDY\u001c[\u0015T \u0018C\u000f^)uUMM\u0012M4\n\u0019\u0006o";
        objectArray[162] = "7Do\u000et}%\u0018fQ\t{4^jSeIf\u001f0\n1\u001e`AiY6bd^hV2\u001e";
        objectArray[163] = "JcmL-jMt|@/\t\u0016b~K0e$6=\u0014h9s0~H(l\b~f\u0015'\tJkxBgvK19O-\tIwaL(i\u0017v|+ne\u001chxHir\rdz+";
        objectArray[164] = "\\\u000fHD5u\u0017\u0015BX%D\u000b\u0017\u0015A \u0013YLB\u0019sD\\\u000f\u001cE>{\u001b\u0018\u0014Bs";
        objectArray[165] = ";HXJevnT\u0000\u001c\u0017r\u0002\u001fBE((}^^Fg\"\u0002\u001dUFjqeIZK{\u0013";
        objectArray[166] = "Q4i/#'@*h,\u001b;V2f6w\t\u0006r7o\u001b5T#j>y#Z#{QwdJtj#p/R.\u0006=`oW%?4$'\u000bNjkjdW<m r>;\"< !2I%w8{^Wtwkw,P?o1\u001b";
        objectArray[167] = "-\u0002hFO?vGyC\u007f0w\u0011cP(g)F;<C3f\u0011zL\u0007a/F";
        objectArray[168] = "o|?qd{:`g'\u0016xV+%~)%)j9}f/V)2}k|1}=pz\u001e";
        objectArray[169] = "E+\u0015\u0018f-\u00107MN\u0014#||\u000f\u0017+s\u0003=\u0013\u0014dy|~\u0018\u0014i*\u001b*\u0017\u0019xH";
        objectArray[170] = "\f&K\u00166N\n+\u0006[_L\u00011Z@3~P}\n\u001f`)\rqFK;I\u0010&YE_E\u0017|VLfLS4\n'";
        objectArray[171] = "@gA\u0014\u0019^\u001crAAF>\u001cc@\u001bFR.7\u0002G\u001a\u0000y5WG\\\\\u001eaXJM>Be\u0000\u0006CY\u0016j\r\u0017!\u0005\u00122A\u0019FQ\u001d?P{\u001aUEs^\u001cNZHb<";
        objectArray[172] = "J\u000f7;_\u0018\u001f\u0013om-\u001fsX-4\u0012F\f\u001917]LsZ:7P\u001f\u0014\u000e5:A}";
        objectArray[173] = "\u00033_YU`\u0001r\r\u0007S\u0018Z`I%ZhF\tB\u001fTaQtBYPr:";
        objectArray[174] = "&\"C\u0014&2h:\u001e\u001bC,t\"@\f/\u001e f\u001aSCve=_\u000e88}`Pk|5z!E\u00102-'. ";
        objectArray[175] = "l8\u0003LA\u000b9$[\u001a3\u0004Uo\u0019C\fU*.\u0005@C_Um\u000e@N\f29\u0001M_n";
        objectArray[176] = "-z6Gb\u0001xfn\u0011\u0010\r\u0014-,H/_kl0K`U\u0014qj\ru\u0019ys6\u0005-d";
        objectArray[177] = "Gm49o?Qc4(\u00008A~92l\n\u00113hk\u00008Tmdj{/\u001cm`UfcB~>$< H`Y";
        objectArray[178] = "drc\fF-'29U@V3\"d\bW\u0001dx3U;m6\u007ft\u000e\\99re";
        objectArray[179] = "J\bo[]!JQjI\u0002]\u000b\u0016+2\n`\u001f\u0011*VK?KZW\u0003\u00061\t\u00163BYeBkf\u000fW'\u000e\u000f'P\u0003ls";
        objectArray[180] = "\u0005&xeW\u000e\u00148yfo\u0012\u0002 w|\u0003 R`&$o\u001bU--w\u001d\u001c\u001e5w\u001b\u0003M\u001ef{i\u0004\u0006\u0006<\u0017wU\u0006U0ep\u001e\u001e\u000f\\";
        objectArray[181] = "'/\u000f%}\u0012=)\bzMO)n\u0013}!}~#N*MJ~x\n%*\u00119uJ\u001a";
        objectArray[182] = "9*s\u0016QOciy\b6[2h}\rZia-,V6\u00054(`\bQQ;%qj";
        objectArray[183] = "?\bj5Y@j\u00142c+]\u0006_p:\u0014\u001ey\u001el9[\u0014\u0006]g9VGa\th4G%";
        objectArray[184] = "\u001a *\u001euE\u00103|E\u0005E\u0006,E\u00148F\u0011-!Ug\u0012ZP";
        objectArray[185] = "%%\r\nd_%|\b\u0018;#w\"X\nx#d;G\u001c\u007fXa*\t\u0005\u0002";
        objectArray[186] = "\u001a<`Y*I_`)\u0018\u0015CH$yFyq\u001cg&\u001d%&\u001c5dPx\u0018WchJg&\u0015 $\u0019l\u0016A7}\u001c\u0015\u001c];~^uB\\&\u0019\u0018zZ\u001e#xNgAKf\u0019";
        objectArray[187] = "]DA1Pa\u001fHD4Q\u0004\u0005EGu\u0004x\u0003C*6Wi^[R4\u0016;\u0000]*";
        objectArray[188] = "\u0017]MJ\r\u0002I\\P-\u0017\u000fQEIA%^\u001c\u001b\u0015\u001dr[\u0011IN_\u0019\u000bT\u001c^-H\u001aNBQM\u0016\u001bS%";
        objectArray[189] = "/b[Q\u000e=9l[@a:)qVZ\r\bz5\u000b\fa:<b\u000b\u0002\u001a-tb\u000f=\u0011#'t]@\u0011e#g6";
        objectArray[190] = "9E!K+!mRxNRtdA|\u0014>F0\u0002#On\u00116A\u007f\f7jxY\"\u0003R.u^c\u0016)`m\u0003lsc,eGa\u0017\"s1\f\u001c\u001an,4A~\u001fi~c=vI#.eCbL2.\t\f!\u001f(lmM~Kc\u0011";
        objectArray[191] = "\u0013q/,WQP1uuQ*D!((F}\u0013{\u007fp*\u0011A|8.MENq)";
        objectArray[192] = "PH`^2/\f[5Z\u007fI\fO#@d%>\u001bo\u001f2yi\u001d#C|,\u0012S;\u001esI";
        objectArray[193] = "d\u0001&){V!\u0000>*\u000bU\u0019\u0003=-p\u000eu\u001d%)w";
        objectArray[194] = "(uoX\tNm)&\u00196DzmvGZv..)\u001d\u000e!(mu_SZfu(P6";
        objectArray[195] = "\u001ey&\u0019T>@x;~F'Yh!\u0005+o\u0019m?\u0003O.F9t~[\"Gx.\u0003[dCkE";
        objectArray[196] = "'A\u000bB|(n\u000b\u0007\u001a2\u0016q\u0017\u0016gng\u001eKWHykz\n\b\u001c2\u0016";
        objectArray[197] = "KC|qh$Y\u001fu.\u0015\"HYy,y\u0010\u001c\u001a&w(G\u001aYz4p<TA';\u0015xYFf.n6A\u001biK/?FBf+q>[% $i|^Dv9r)\u001b% &h6H\u001bkpd,W% 'z _F'0k,]%";
        objectArray[198] = "chQs\\y7{\u0014o]G4sDtJ\u0010k+\u0013!&~={F*X6&{@p";
        objectArray[199] = "HEjS^\u0006M\by\\cZZKcE\u000fh\n\n<\u0012cZ\rMf_\u000eXQE>\"";
        objectArray[200] = "zLx*)x-\u001b}2-A&\u001cy2 -\u0014N4jvAzOyo+$$\u0001`8)A";
        objectArray[201] = "c\u0012\u001fj4#3SFy>\u001c;QBq8`=W/2kq`OW0*#>I/";
        objectArray[202] = "J4[\u0004\u0017\u0016\tt\u0001]\u0011m\u001dd\\\u0000\u0006:J>\u000b\\jV\u00189L\u0006\r\u0002\u00174]";
        objectArray[203] = "\u0004x0HE\u0010Ob:TU!S`mMPv\u0001;:\u0014\u0004!\u0004xdIN\u001eColN\u0003";
        objectArray[204] = ";O&p\u0014\u0005r\u0005*(Z;m\u0019;W\rG\\\u001d#k\u0006;gN=s\u0016Ve\u00125+k";
        objectArray[205] = "9u)%.\u0014n\",=*-e%(='AWudcq\u0010\u0000qh\"&Nb!h69O\u0000yi1:Pd86eq-1u8'=Ip*ll@";
        objectArray[206] = "\n\u001fA\r\u0006i\u000fB\u0010W\u0015\u0002VIRR\u001end\u0019\u0011\u000fB33\u001d\u0011\u0002\u0018g\fMP[\u000bm3";
        objectArray[207] = "#\u00165L_cd\u00062\u000bB\u001ed\u001e<\u000eHYtwc\u0018\u0019cx\u00107\u0017\u0014r\u001aN9\u001e\u001adg\t)\u0019]y\u001a";
        objectArray[208] = "6\t\\\u000eI$$UUQ4\"5\u0013YSX\u0010hT\u0003\f4} \f^KT#!\u00119\rY:)\u0002\u0007F\u000f63\u001d9";
        objectArray[209] = "HV2H\\v\u0003L8TLG\u001fNoMI\u0010M\u00158\u0015\u0014GHVfIWx\u000fAnN\u001a";
        objectArray[210] = "+sCJfo|t]\u0013cP||T\u00120\u0007+%\u0004JdP+r\u0003\u00107`}}F\u0017<";
        objectArray[211] = "\u001e\u000e0;+\u0004\u001eX#;Y\u000bB\u0004)(\u000e\\\u0018U}Dd\u0002^\u0016?%dTM\u0016";
        objectArray[212] = "9\u0011jZ\u0010co\u001e/]\u001bSe\u0013,\\\u001c?WOm\u0006CSlD!\u0006\u0017!k\u000f9\\{";
        objectArray[213] = "\u0019q\f\u0007F:OpF\u001d\u0003\u000bE$\u0001\u001d\u001egwrD@E: pD\u0007\tqR%MEB2 ";
        objectArray[214] = "F0\f}\u0014I\u0007xLf\u0014w\u0011aYc\u0001 O=\u00057mNA|\tk\b\u0010\u000fe^i";
        objectArray[215] = "8\u000f\u0000\"Oo0[\u000e=\u0015\u0005j[\u000e3\f\u0005yB\u0011%\u000b~|S_<v";
        objectArray[216] = "c@1Occ6\\i\u0019\u0011cZ\u0017+@.=%V7Ca7Z\u0015<Cld=A3N}\u0006";
        objectArray[217] = "c2\u0003\u001bB^d\"]\b8K\u0019p\u001fN\u0007\u0019f1\u0003MH\u0013\u0019v\u001f\u0012GGb8\u0007OH\"";
        objectArray[218] = "<qMN\u0012}im\u0015\u0018`v\u0005&WA_#zgKB\u0010)\u0005$@B\u001dzbpOO\f\u0018";
        objectArray[219] = "c|-]MW-dpR(B=m*N\u007f\u0015g=t\"\u0013G`},EGHml";
        Object[] objectArray2 = objectArray;
        objectArray[220] = "\u0011Hag\rf\u0019\u001coxW\fP\u0005~\u001f\u00051D\u0002\u007f{Dn\u0010I\u0002z\u000evM\u0005oxR~\u0015xg%NiU\u0015eyF1(";
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    public static void a(Object[] objectArray) {
        block10: {
            CallSite callSite;
            CallSite callSite2;
            long l;
            Object2IntMap object2IntMap;
            block13: {
                class_1799 class_17992;
                block11: {
                    class_1799 class_17993;
                    block12: {
                        block9: {
                            class_17993 = (class_1799)objectArray[0];
                            object2IntMap = (Object2IntMap)objectArray[1];
                            l = (Long)objectArray[2];
                            l = h ^ l;
                            CallSite callSite3 = aA.a("$", (long)1652006099190550582L, (long)l);
                            aA.a("\u00d0", (Object)object2IntMap, (long)1655882535779795958L, (long)l);
                            callSite2 = callSite3;
                            try {
                                try {
                                    class_17992 = class_17993;
                                    if (callSite2 != null) break block9;
                                    if (aA.a("\u00d0", (Object)class_17992, (long)1651841330288800917L, (long)l) != false) break block10;
                                }
                                catch (MatchException matchException) {
                                    throw aA.a("$", (Object)matchException, (long)1651366250701231382L, (long)l);
                                }
                                class_17992 = class_17993;
                            }
                            catch (MatchException matchException) {
                                throw aA.a("$", (Object)matchException, (long)1651366250701231382L, (long)l);
                            }
                        }
                        try {
                            try {
                                if (callSite2 != null) break block11;
                                if (aA.a("\u00d0", (Object)class_17992, (long)1656517422505956686L, (long)l) != aA.a("\u00c9", (long)1655843352288711014L, (long)l)) break block12;
                            }
                            catch (MatchException matchException) {
                                throw aA.a("$", (Object)matchException, (long)1651366250701231382L, (long)l);
                            }
                            callSite = aA.a("\u00d0", (Object)((class_9304)aA.a("\u00d0", (Object)class_17993, (Object)aA.a("\u00c9", (long)1644148366977259130L, (long)l), (Object)aA.a("\u00c9", (long)1644638165474337514L, (long)l), (long)1656330763107527322L, (long)l)), (long)1656399203576432112L, (long)l);
                            break block13;
                        }
                        catch (MatchException matchException) {
                            throw aA.a("$", (Object)matchException, (long)1651366250701231382L, (long)l);
                        }
                    }
                    class_17992 = class_17993;
                }
                callSite = aA.a("\u00d0", (Object)aA.a("\u00d0", (Object)class_17992, (long)1645761350918556992L, (long)l), (long)1656399203576432112L, (long)l);
            }
            CallSite callSite4 = callSite;
            CallSite callSite5 = aA.a("\u00d0", (Object)callSite4, (long)1656561662296615285L, (long)l);
            while (aA.a("\u00d0", (Object)callSite5, (long)1649578438926065935L, (long)l) != false) {
                Object2IntMap.Entry entry = (Object2IntMap.Entry)aA.a("\u00d0", (Object)callSite5, (long)1650991174451596828L, (long)l);
                aA.a("\u00d0", (Object)object2IntMap, (Object)((class_6880)aA.a("\u00d0", (Object)entry, (long)1656775437692502897L, (long)l)), (int)aA.a("\u00d0", (Object)entry, (long)1656212624468973340L, (long)l), (long)1655125683243449555L, (long)l);
                if (callSite2 == null) continue;
            }
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/aA" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public double a(Object[] objectArray) {
        class_1309 class_13092 = (class_1309)objectArray[0];
        class_243 class_2432 = (class_243)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = (l = h ^ l) ^ 0x386DFC9805C9L;
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = l2;
        objectArray2[4] = false;
        objectArray2[3] = null;
        objectArray2[2] = false;
        objectArray2[1] = class_2432;
        objectArray2[0] = class_13092;
        return (double)aA.a("\u00d0", (Object)this, (Object)objectArray2, (long)2716113002365093738L, (long)l);
    }

    private class_3965 a(Object[] objectArray) {
        class_3959 class_39592 = (class_3959)objectArray[0];
        class_2338 class_23382 = (class_2338)objectArray[1];
        boolean bl = (Boolean)objectArray[2];
        class_2338 class_23383 = (class_2338)objectArray[3];
        class_2338 class_23384 = (class_2338)objectArray[4];
        class_2680 class_26802 = (class_2680)objectArray[5];
        long l = (Long)objectArray[6];
        l = h ^ l;
        return (class_3965)aA.a("$", (Object)aA.a("\u00d0", (Object)class_39592, (long)436540732479618661L, (long)l), (Object)aA.a("\u00d0", (Object)class_39592, (long)441573640679654331L, (long)l), (Object)class_39592, (arg_0, arg_1) -> aA.lambda$raycast$0(class_23383, class_23384, class_26802, class_23382, bl, arg_0, arg_1), aA::lambda$raycast$1, (long)437372532083330536L, (long)l);
    }

    @bP
    public void a(a5 a52) {
        long l = h ^ 0x36E2ED7A0826L;
        this.d = new class_3959(null, null, (class_3959.class_3960)aA.a("\u00c9", (long)-6924474429755316412L, (long)l), (class_3959.class_242)aA.a("\u00c9", (long)-6929891145587267463L, (long)l), (class_1297)aA.a("O", (Object)b, (long)-6929399353860977026L, (long)l));
    }

    public static int a(Object[] objectArray) {
        Object object;
        block7: {
            Object2IntMap object2IntMap = (Object2IntMap)objectArray[0];
            class_5321 class_53212 = (class_5321)objectArray[1];
            long l = (Long)objectArray[2];
            l = h ^ l;
            CallSite callSite = aA.a("\u00d0", (Object)aA.a("$", (Object)object2IntMap, (long)195679273207938705L, (long)l), (long)195258326600242225L, (long)l);
            CallSite callSite2 = aA.a("$", (long)184469700180837460L, (long)l);
            while (aA.a("\u00d0", (Object)callSite, (long)181901167134438765L, (long)l) != false) {
                block9: {
                    CallSite callSite3;
                    block8: {
                        Object2IntMap.Entry entry = (Object2IntMap.Entry)aA.a("\u00d0", (Object)callSite, (long)183305380370848382L, (long)l);
                        try {
                            try {
                                try {
                                    object = aA.a("\u00d0", (Object)((class_6880)aA.a("\u00d0", (Object)entry, (long)188105033098925843L, (long)l)), (Object)class_53212, (long)195455245216563460L, (long)l);
                                    if (callSite2 != null) break block7;
                                    if (callSite2 != null) break block8;
                                }
                                catch (MatchException matchException) {
                                    throw aA.a("$", (Object)matchException, (long)182554283916362100L, (long)l);
                                }
                                if (object == 0) break block9;
                            }
                            catch (MatchException matchException) {
                                throw aA.a("$", (Object)matchException, (long)182554283916362100L, (long)l);
                            }
                            callSite3 = aA.a("\u00d0", (Object)entry, (long)188667841680999294L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw aA.a("$", (Object)matchException, (long)182554283916362100L, (long)l);
                        }
                    }
                    return (int)callSite3;
                }
                if (callSite2 == null) continue;
            }
            object = 0;
        }
        return object;
    }

    /*
     * Exception decompiling
     */
    private double m(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 1[SWITCH]
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

    private double o(Object[] objectArray) {
        CallSite callSite;
        class_1297 class_12972;
        class_243 class_2432;
        aA aA2;
        class_243 class_2433 = (class_243)objectArray[0];
        class_1297 class_12973 = (class_1297)objectArray[1];
        boolean bl = (Boolean)objectArray[2];
        class_3959 class_39592 = (class_3959)objectArray[3];
        class_2338 class_23382 = (class_2338)objectArray[4];
        boolean bl2 = (Boolean)objectArray[5];
        class_2338 class_23383 = (class_2338)objectArray[6];
        class_2338 class_23384 = (class_2338)objectArray[7];
        class_2680 class_26802 = (class_2680)objectArray[8];
        long l = (Long)objectArray[9];
        long l2 = (l = h ^ l) ^ 0x679AD2B25E47L;
        try {
            aA2 = this;
            class_2432 = class_2433;
            class_12972 = class_12973;
            callSite = bl ? aA.a("\u00d0", (Object)class_12973, (long)6065289195852357077L, (long)l) : null;
        }
        catch (MatchException matchException) {
            throw aA.a("$", (Object)matchException, (long)6069095526721705925L, (long)l);
        }
        Object[] objectArray2 = new Object[10];
        objectArray2[9] = l2;
        objectArray2[8] = class_26802;
        objectArray2[7] = class_23384;
        objectArray2[6] = class_23383;
        objectArray2[5] = bl2;
        objectArray2[4] = class_23382;
        objectArray2[3] = class_39592;
        objectArray2[2] = callSite;
        objectArray2[1] = class_12972;
        objectArray2[0] = class_2432;
        return (double)aA.a("\u00d0", (Object)aA2, (Object)objectArray2, (long)6066904271573853431L, (long)l);
    }

    private double p(Object[] objectArray) {
        double d;
        block20: {
            block21: {
                double d10;
                block22: {
                    class_243 class_2432 = (class_243)objectArray[0];
                    class_1297 class_12972 = (class_1297)objectArray[1];
                    class_243 class_2433 = (class_243)objectArray[2];
                    class_3959 class_39592 = (class_3959)objectArray[3];
                    class_2338 class_23382 = (class_2338)objectArray[4];
                    boolean bl = (Boolean)objectArray[5];
                    class_2338 class_23383 = (class_2338)objectArray[6];
                    class_2338 class_23384 = (class_2338)objectArray[7];
                    class_2680 class_26802 = (class_2680)objectArray[8];
                    long l = (Long)objectArray[9];
                    long l2 = l = h ^ l;
                    long l3 = l2 ^ 0x314590EC0C65L;
                    long l4 = l2 ^ 0x30C2B70E7F5BL;
                    long l5 = l2 ^ 0xEA59A8D9A64L;
                    CallSite callSite = aA.a("\u00d0", (Object)class_12972, (long)-7089093325493701790L, (long)l);
                    CallSite callSite2 = aA.a("$", (long)-7087686131461481608L, (long)l);
                    if (class_2433 != null) {
                        callSite = aA.a("\u00d0", (Object)callSite, (double)aA.a("O", (Object)class_2433, (long)-7082021554133907156L, (long)l), (double)aA.a("O", (Object)class_2433, (long)-7090160403518765249L, (long)l), (double)aA.a("O", (Object)class_2433, (long)-7086943789194942965L, (long)l), (long)-7086820395766043311L, (long)l);
                    }
                    double d11 = 1.0 / ((aA.a("O", (Object)callSite, (long)-7083056991071282415L, (long)l) - aA.a("O", (Object)callSite, (long)-7089014040063063596L, (long)l)) * 2.0 + 1.0);
                    double d12 = 1.0 / ((aA.a("O", (Object)callSite, (long)-7088463624643377933L, (long)l) - aA.a("O", (Object)callSite, (long)-7087543867115518541L, (long)l)) * 2.0 + 1.0);
                    double d13 = 1.0 / ((aA.a("O", (Object)callSite, (long)-7084537880795170613L, (long)l) - aA.a("O", (Object)callSite, (long)-7084790868724863215L, (long)l)) * 2.0 + 1.0);
                    double d14 = (1.0 - aA.a("$", (double)(1.0 / d11), (long)-7087804707285913929L, (long)l) * d11) / 2.0;
                    double d15 = (1.0 - aA.a("$", (double)(1.0 / d13), (long)-7087804707285913929L, (long)l) * d13) / 2.0;
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        d = d11;
                                        if (callSite2 != null) break block20;
                                        if (!(d >= 0.0)) break block21;
                                    }
                                    catch (MatchException matchException) {
                                        throw aA.a("$", (Object)matchException, (long)-7087340817868448168L, (long)l);
                                    }
                                    d = d12;
                                    if (callSite2 != null) break block20;
                                }
                                catch (MatchException matchException) {
                                    throw aA.a("$", (Object)matchException, (long)-7087340817868448168L, (long)l);
                                }
                                if (!(d >= 0.0)) break block21;
                            }
                            catch (MatchException matchException) {
                                throw aA.a("$", (Object)matchException, (long)-7087340817868448168L, (long)l);
                            }
                            d = d13;
                            if (callSite2 != null) break block20;
                        }
                        catch (MatchException matchException) {
                            throw aA.a("$", (Object)matchException, (long)-7087340817868448168L, (long)l);
                        }
                        if (!(d >= 0.0)) break block21;
                    }
                    catch (MatchException matchException) {
                        throw aA.a("$", (Object)matchException, (long)-7087340817868448168L, (long)l);
                    }
                    int n = 0;
                    int n2 = 0;
                    ad_0 ad_02 = new ad_0(this.a);
                    Y y = new Y(class_39592);
                    double d16 = 0.0;
                    while (d16 <= 1.0) {
                        block23: {
                            double d17;
                            d10 = 0.0;
                            if (callSite2 != null) break block22;
                            double d18 = d10;
                            while (d18 <= 1.0) {
                                block24: {
                                    d17 = 0.0;
                                    if (callSite2 != null) break block23;
                                    double d19 = d17;
                                    while (d19 <= 1.0) {
                                        block25: {
                                            block26: {
                                                CallSite callSite3 = aA.a("$", (double)d16, (double)aA.a("O", (Object)callSite, (long)-7089014040063063596L, (long)l), (double)aA.a("O", (Object)callSite, (long)-7083056991071282415L, (long)l), (long)-7085363038659558335L, (long)l);
                                                CallSite callSite4 = aA.a("$", (double)d18, (double)aA.a("O", (Object)callSite, (long)-7087543867115518541L, (long)l), (double)aA.a("O", (Object)callSite, (long)-7088463624643377933L, (long)l), (long)-7085363038659558335L, (long)l);
                                                CallSite callSite5 = aA.a("$", (double)d19, (double)aA.a("O", (Object)callSite, (long)-7084790868724863215L, (long)l), (double)aA.a("O", (Object)callSite, (long)-7084537880795170613L, (long)l), (long)-7085363038659558335L, (long)l);
                                                try {
                                                    try {
                                                        try {
                                                            Object[] objectArray2 = new Object[4];
                                                            objectArray2[3] = l5;
                                                            objectArray2[2] = (double)(callSite5 + d15);
                                                            objectArray2[1] = (double)callSite4;
                                                            objectArray2[0] = (double)(callSite3 + d14);
                                                            aA.a("\u00d0", (Object)ad_02, (Object)objectArray2, (long)-7086729027298261862L, (long)l);
                                                            Object[] objectArray3 = new Object[6];
                                                            objectArray3[5] = l4;
                                                            objectArray3[4] = class_12972;
                                                            objectArray3[3] = aA.a("\u00c9", (long)-7082572642199702535L, (long)l);
                                                            objectArray3[2] = aA.a("\u00c9", (long)-7090348745131842247L, (long)l);
                                                            objectArray3[1] = class_2432;
                                                            objectArray3[0] = this.a;
                                                            aA.a("\u00d0", (Object)y, (Object)objectArray3, (long)-7086611331523138474L, (long)l);
                                                            if (callSite2 != null) break block24;
                                                            if (callSite2 != null) break block25;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw aA.a("$", (Object)matchException, (long)-7087340817868448168L, (long)l);
                                                        }
                                                        Object[] objectArray4 = new Object[7];
                                                        objectArray4[6] = l3;
                                                        objectArray4[5] = class_26802;
                                                        objectArray4[4] = class_23384;
                                                        objectArray4[3] = class_23383;
                                                        objectArray4[2] = bl;
                                                        objectArray4[1] = class_23382;
                                                        objectArray4[0] = class_39592;
                                                        if (aA.a("\u00d0", (Object)aA.a("\u00d0", (Object)this, (Object)objectArray4, (long)-7089775472879486798L, (long)l), (long)-7089709465740671131L, (long)l) != aA.a("\u00c9", (long)-7087619063279248474L, (long)l)) break block26;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw aA.a("$", (Object)matchException, (long)-7087340817868448168L, (long)l);
                                                    }
                                                    ++n;
                                                }
                                                catch (MatchException matchException) {
                                                    throw aA.a("$", (Object)matchException, (long)-7087340817868448168L, (long)l);
                                                }
                                            }
                                            ++n2;
                                            d19 += d13;
                                        }
                                        if (callSite2 == null) continue;
                                    }
                                    d18 += d12;
                                }
                                if (callSite2 == null) continue;
                            }
                            d17 = d16 = d16 + d11;
                        }
                        if (callSite2 == null) continue;
                    }
                    d10 = (double)n / (double)n2;
                }
                return d10;
            }
            d = 0.0;
        }
        return d;
    }

    public double k(Object[] objectArray) {
        class_1309 class_13092 = (class_1309)objectArray[0];
        class_243 class_2432 = (class_243)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = (l = h ^ l) ^ 0x6E454C72B09L;
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = l2;
        objectArray2[4] = null;
        objectArray2[3] = null;
        objectArray2[2] = aA.a("$", (Object)class_2432, (long)-8700315113475160545L, (long)l);
        objectArray2[1] = class_2432;
        objectArray2[0] = class_13092;
        return (double)aA.a("\u00d0", (Object)this, (Object)objectArray2, (long)-8693124482250142121L, (long)l);
    }

    public double g(Object[] objectArray) {
        class_1309 class_13092 = (class_1309)objectArray[0];
        class_243 class_2432 = (class_243)objectArray[1];
        double d = (Double)objectArray[2];
        long l = (Long)objectArray[3];
        long l2 = (l = h ^ l) ^ 0x2D7A1E8AD12BL;
        Object[] objectArray2 = new Object[7];
        objectArray2[6] = l2;
        objectArray2[5] = null;
        objectArray2[4] = null;
        objectArray2[3] = null;
        objectArray2[2] = d;
        objectArray2[1] = class_2432;
        objectArray2[0] = class_13092;
        return (double)aA.a("\u00d0", (Object)this, (Object)objectArray2, (long)-957556755868226522L, (long)l);
    }

    private static Field g(long l, long l2) {
        int n = aA.e(l, l2);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = aA.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = aA.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = aA.c(clazz3, string2, clazz2)) != null) {
                    aA.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = aA.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        aA.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = aA.f(929224517630841L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static double j(Object[] objectArray) {
        Object object;
        CallSite callSite;
        long l;
        long l2;
        long l3;
        class_1282 class_12822;
        double d;
        class_1309 class_13092;
        block33: {
            block34: {
                class_13092 = (class_1309)objectArray[0];
                d = (Double)objectArray[1];
                class_12822 = (class_1282)objectArray[2];
                l3 = (Long)objectArray[3];
                long l4 = l3 = h ^ l3;
                l2 = l4 ^ 0x39878EFB3353L;
                l = l4 ^ 0x7D7BECE92731L;
                callSite = aA.a("$", (long)-5592287678524902209L, (long)l3);
                try {
                    try {
                        object = aA.a("\u00d0", (Object)class_12822, (Object)aA.a("\u00c9", (long)-5595181377273744038L, (long)l3), (long)-5593959456574457656L, (long)l3);
                        if (callSite != null) break block33;
                        if (object == false) break block34;
                    }
                    catch (MatchException matchException) {
                        throw aA.a("$", (Object)matchException, (long)-5592347121577676385L, (long)l3);
                    }
                    return d;
                }
                catch (MatchException matchException) {
                    throw aA.a("$", (Object)matchException, (long)-5592347121577676385L, (long)l3);
                }
            }
            object = 0;
        }
        CallSite callSite2 = object;
        Object2IntMap object2IntMap = (Object2IntMap)aA.a("\u00d0", (Object)g, (long)-5591162505044984334L, (long)l3);
        CallSite callSite3 = aA.a("\u00d0", (Object)aA.a("\u00c9", (long)-5594991907622813548L, (long)l3), (long)-5590972268283202318L, (long)l3);
        while (aA.a("\u00d0", (Object)callSite3, (long)-5589719278214036090L, (long)l3) != false) {
            block44: {
                CallSite callSite4;
                block45: {
                    CallSite callSite5;
                    block43: {
                        CallSite callSite6;
                        block41: {
                            block42: {
                                CallSite callSite7;
                                block39: {
                                    block40: {
                                        CallSite callSite8;
                                        block37: {
                                            block38: {
                                                CallSite callSite9;
                                                block35: {
                                                    block36: {
                                                        class_1304 class_13042 = (class_1304)aA.a("\u00d0", (Object)callSite3, (long)-5593375565101094251L, (long)l3);
                                                        CallSite callSite10 = aA.a("\u00d0", (Object)class_13092, (Object)class_13042, (long)-5593689709668513821L, (long)l3);
                                                        Object[] objectArray2 = new Object[3];
                                                        objectArray2[2] = l2;
                                                        objectArray2[1] = object2IntMap;
                                                        objectArray2[0] = callSite10;
                                                        aA.a("$", (Object)objectArray2, (long)-5595350917744220511L, (long)l3);
                                                        Object[] objectArray3 = new Object[3];
                                                        objectArray3[2] = l;
                                                        objectArray3[1] = aA.a("\u00c9", (long)-5591644309569000770L, (long)l3);
                                                        objectArray3[0] = object2IntMap;
                                                        CallSite callSite11 = aA.a("$", (Object)objectArray3, (long)-5590619641636917432L, (long)l3);
                                                        try {
                                                            callSite9 = callSite11;
                                                            if (callSite != null) break block35;
                                                            if (callSite9 <= 0) break block36;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw aA.a("$", (Object)matchException, (long)-5592347121577676385L, (long)l3);
                                                        }
                                                        callSite2 += callSite11;
                                                    }
                                                    Object[] objectArray4 = new Object[3];
                                                    objectArray4[2] = l;
                                                    objectArray4[1] = aA.a("\u00c9", (long)-5593310511285405359L, (long)l3);
                                                    objectArray4[0] = object2IntMap;
                                                    callSite9 = aA.a("$", (Object)objectArray4, (long)-5590619641636917432L, (long)l3);
                                                }
                                                CallSite callSite12 = callSite9;
                                                try {
                                                    try {
                                                        try {
                                                            callSite8 = callSite12;
                                                            if (callSite != null) break block37;
                                                            if (callSite8 <= 0) break block38;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw aA.a("$", (Object)matchException, (long)-5592347121577676385L, (long)l3);
                                                        }
                                                        callSite8 = aA.a("\u00d0", (Object)class_12822, (Object)aA.a("\u00c9", (long)-5592745993217305849L, (long)l3), (long)-5593959456574457656L, (long)l3);
                                                        if (callSite != null) break block37;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw aA.a("$", (Object)matchException, (long)-5592347121577676385L, (long)l3);
                                                    }
                                                    if (callSite8 == false) break block38;
                                                }
                                                catch (MatchException matchException) {
                                                    throw aA.a("$", (Object)matchException, (long)-5592347121577676385L, (long)l3);
                                                }
                                                callSite2 += 2 * callSite12;
                                            }
                                            Object[] objectArray5 = new Object[3];
                                            objectArray5[2] = l;
                                            objectArray5[1] = aA.a("\u00c9", (long)-5593140520769525795L, (long)l3);
                                            objectArray5[0] = object2IntMap;
                                            callSite8 = aA.a("$", (Object)objectArray5, (long)-5590619641636917432L, (long)l3);
                                        }
                                        CallSite callSite13 = callSite8;
                                        try {
                                            try {
                                                try {
                                                    callSite7 = callSite13;
                                                    if (callSite != null) break block39;
                                                    if (callSite7 <= 0) break block40;
                                                }
                                                catch (MatchException matchException) {
                                                    throw aA.a("$", (Object)matchException, (long)-5592347121577676385L, (long)l3);
                                                }
                                                callSite7 = aA.a("\u00d0", (Object)class_12822, (Object)aA.a("\u00c9", (long)-5588331925298963400L, (long)l3), (long)-5593959456574457656L, (long)l3);
                                                if (callSite != null) break block39;
                                            }
                                            catch (MatchException matchException) {
                                                throw aA.a("$", (Object)matchException, (long)-5592347121577676385L, (long)l3);
                                            }
                                            if (callSite7 == false) break block40;
                                        }
                                        catch (MatchException matchException) {
                                            throw aA.a("$", (Object)matchException, (long)-5592347121577676385L, (long)l3);
                                        }
                                        callSite2 += 2 * callSite13;
                                    }
                                    Object[] objectArray6 = new Object[3];
                                    objectArray6[2] = l;
                                    objectArray6[1] = aA.a("\u00c9", (long)-5593196374240843754L, (long)l3);
                                    objectArray6[0] = object2IntMap;
                                    callSite7 = aA.a("$", (Object)objectArray6, (long)-5590619641636917432L, (long)l3);
                                }
                                CallSite callSite14 = callSite7;
                                try {
                                    try {
                                        try {
                                            callSite6 = callSite14;
                                            if (callSite != null) break block41;
                                            if (callSite6 <= 0) break block42;
                                        }
                                        catch (MatchException matchException) {
                                            throw aA.a("$", (Object)matchException, (long)-5592347121577676385L, (long)l3);
                                        }
                                        callSite6 = aA.a("\u00d0", (Object)class_12822, (Object)aA.a("\u00c9", (long)-5589212846120287960L, (long)l3), (long)-5593959456574457656L, (long)l3);
                                        if (callSite != null) break block41;
                                    }
                                    catch (MatchException matchException) {
                                        throw aA.a("$", (Object)matchException, (long)-5592347121577676385L, (long)l3);
                                    }
                                    if (callSite6 == false) break block42;
                                }
                                catch (MatchException matchException) {
                                    throw aA.a("$", (Object)matchException, (long)-5592347121577676385L, (long)l3);
                                }
                                callSite2 += 2 * callSite14;
                            }
                            Object[] objectArray7 = new Object[3];
                            objectArray7[2] = l;
                            objectArray7[1] = aA.a("\u00c9", (long)-5586834745378024010L, (long)l3);
                            objectArray7[0] = object2IntMap;
                            callSite6 = aA.a("$", (Object)objectArray7, (long)-5590619641636917432L, (long)l3);
                        }
                        callSite5 = callSite6;
                        try {
                            try {
                                callSite4 = callSite5;
                                if (callSite != null) break block43;
                                if (callSite4 <= 0) break block44;
                            }
                            catch (MatchException matchException) {
                                throw aA.a("$", (Object)matchException, (long)-5592347121577676385L, (long)l3);
                            }
                            callSite4 = aA.a("\u00d0", (Object)class_12822, (Object)aA.a("\u00c9", (long)-5587595263520422373L, (long)l3), (long)-5593959456574457656L, (long)l3);
                        }
                        catch (MatchException matchException) {
                            throw aA.a("$", (Object)matchException, (long)-5592347121577676385L, (long)l3);
                        }
                    }
                    try {
                        try {
                            if (callSite != null) break block45;
                            if (callSite4 == false) break block44;
                        }
                        catch (MatchException matchException) {
                            throw aA.a("$", (Object)matchException, (long)-5592347121577676385L, (long)l3);
                        }
                        callSite4 = callSite2 + 3 * callSite5;
                    }
                    catch (MatchException matchException) {
                        throw aA.a("$", (Object)matchException, (long)-5592347121577676385L, (long)l3);
                    }
                }
                callSite2 = callSite4;
            }
            if (callSite == null) continue;
        }
        return (double)aA.a("$", (float)((float)d), (float)((float)callSite2), (long)-5590313888973762603L, (long)l3);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static class_3965 lambda$raycast$0(class_2338 var0, class_2338 var1_1, class_2680 var2_2, class_2338 var3_3, boolean var4_4, class_3959 var5_5, class_2338 var6_6) {
        block33: {
            block36: {
                block37: {
                    block35: {
                        block34: {
                            block32: {
                                var7_7 = aA.h ^ 1712918839758L;
                                var9_8 = aA.a("$", (long)-3011190439799107347L, (long)var7_7);
                                try {
                                    try {
                                        try {
                                            v0 = var0;
                                            if (var9_8 != null) break block32;
                                            if (v0 != null) {
                                            }
                                            ** GOTO lbl26
                                        }
                                        catch (MatchException v1) {
                                            throw aA.a("$", (Object)v1, (long)-3012393373803915827L, (long)var7_7);
                                        }
                                        v0 = var6_6;
                                        if (var9_8 != null) break block32;
                                    }
                                    catch (MatchException v2) {
                                        throw aA.a("$", (Object)v2, (long)-3012393373803915827L, (long)var7_7);
                                    }
                                    if (aA.a("\u00d0", (Object)v0, (Object)var0, (long)-3016056402274827576L, (long)var7_7) != false) {
                                    }
                                    ** GOTO lbl26
                                }
                                catch (MatchException v3) {
                                    throw aA.a("$", (Object)v3, (long)-3012393373803915827L, (long)var7_7);
                                }
                                var10_9 = aA.a("\u00d0", (Object)aA.a("\u00c9", (long)-3022979128925549260L, (long)var7_7), (long)-3024057470692437568L, (long)var7_7);
                                try {
                                    if (var9_8 == null) break block33;
lbl26:
                                    // 3 sources

                                    v0 = var1_1;
                                }
                                catch (MatchException v4) {
                                    throw aA.a("$", (Object)v4, (long)-3012393373803915827L, (long)var7_7);
                                }
                            }
                            try {
                                try {
                                    try {
                                        if (var9_8 != null) break block34;
                                        if (v0 != null) {
                                        }
                                        ** GOTO lbl53
                                    }
                                    catch (MatchException v5) {
                                        throw aA.a("$", (Object)v5, (long)-3012393373803915827L, (long)var7_7);
                                    }
                                    v6 = aA.a("\u00d0", (Object)var6_6, (Object)var1_1, (long)-3016056402274827576L, (long)var7_7);
                                    if (var9_8 != null) break block35;
                                }
                                catch (MatchException v7) {
                                    throw aA.a("$", (Object)v7, (long)-3012393373803915827L, (long)var7_7);
                                }
                                if (v6 != false) {
                                }
                                ** GOTO lbl53
                            }
                            catch (MatchException v8) {
                                throw aA.a("$", (Object)v8, (long)-3012393373803915827L, (long)var7_7);
                            }
                            var10_9 = var2_2;
                            try {
                                if (var9_8 == null) break block33;
lbl53:
                                // 3 sources

                                v0 = var6_6;
                            }
                            catch (MatchException v9) {
                                throw aA.a("$", (Object)v9, (long)-3012393373803915827L, (long)var7_7);
                            }
                        }
                        v6 = aA.a("\u00d0", (Object)v0, (Object)var3_3, (long)-3016056402274827576L, (long)var7_7);
                    }
                    if (v6 == false) break block37;
                    var10_9 = aA.a("\u00d0", (Object)aA.a("\u00c9", (long)-3017208456116097811L, (long)var7_7), (long)-3024057470692437568L, (long)var7_7);
                    if (var9_8 == null) break block33;
                }
                var10_9 = aA.a("\u00d0", (Object)aA.a("O", (Object)aA.b, (long)-3010877632271309571L, (long)var7_7), (Object)var6_6, (long)-3017409306274172853L, (long)var7_7);
                try {
                    cfr_temp_0 = aA.a("\u00d0", (Object)aA.a("\u00d0", (Object)var10_9, (long)-3011492678167494671L, (long)var7_7), (long)-3017067858139544826L, (long)var7_7) - 600.0f;
                    v10 /* !! */  = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                    if (var9_8 != null) break block36;
                    if (v10 /* !! */  >= 0) break block33;
                }
                catch (MatchException v11) {
                    throw aA.a("$", (Object)v11, (long)-3012393373803915827L, (long)var7_7);
                }
                v10 /* !! */  = (reference)var4_4;
            }
            if (v10 /* !! */  != false) {
                var10_9 = aA.a("\u00d0", (Object)aA.a("\u00c9", (long)-3022979128925549260L, (long)var7_7), (long)-3024057470692437568L, (long)var7_7);
            }
        }
        var11_10 = aA.a("\u00d0", (Object)var5_5, (long)-3016101464000663985L, (long)var7_7);
        var12_11 = aA.a("\u00d0", (Object)var5_5, (long)-3023454479208361071L, (long)var7_7);
        var13_12 = aA.a("\u00d0", (Object)var5_5, (Object)var10_9, (Object)aA.a("O", (Object)aA.b, (long)-3010877632271309571L, (long)var7_7), (Object)var6_6, (long)-3009935098075680179L, (long)var7_7);
        var14_13 = aA.a("\u00d0", (Object)aA.a("O", (Object)aA.b, (long)-3010877632271309571L, (long)var7_7), (Object)var11_10, (Object)var12_11, (Object)var6_6, (Object)var13_12, (Object)var10_9, (long)-3015891117153088003L, (long)var7_7);
        var15_14 = aA.a("$", (long)-3011724989261298732L, (long)var7_7);
        var16_15 = aA.a("\u00d0", (Object)var15_14, (Object)var11_10, (Object)var12_11, (Object)var6_6, (long)-3012451869325877338L, (long)var7_7);
        try {
            v12 /* !! */  = var14_13 == null ? 1.7976931348623157E308 : (double)aA.a("\u00d0", (Object)aA.a("\u00d0", (Object)var5_5, (long)-3016101464000663985L, (long)var7_7), (Object)aA.a("\u00d0", (Object)var14_13, (long)-3024151472199367280L, (long)var7_7), (long)-3022837705099395416L, (long)var7_7);
        }
        catch (MatchException v13) {
            throw aA.a("$", (Object)v13, (long)-3012393373803915827L, (long)var7_7);
        }
        var17_16 = v12 /* !! */ ;
        try {
            v14 /* !! */  = var16_15 == null ? 1.7976931348623157E308 : (double)aA.a("\u00d0", (Object)aA.a("\u00d0", (Object)var5_5, (long)-3016101464000663985L, (long)var7_7), (Object)aA.a("\u00d0", (Object)var16_15, (long)-3024151472199367280L, (long)var7_7), (long)-3022837705099395416L, (long)var7_7);
        }
        catch (MatchException v15) {
            throw aA.a("$", (Object)v15, (long)-3012393373803915827L, (long)var7_7);
        }
        var19_17 = v14 /* !! */ ;
        try {
            v16 = var17_16 <= var19_17 ? var14_13 : var16_15;
        }
        catch (MatchException v17) {
            throw aA.a("$", (Object)v17, (long)-3012393373803915827L, (long)var7_7);
        }
        return v16;
    }

    private static class_3965 lambda$raycast$1(class_3959 class_39592) {
        long l = h ^ 0x3583DDA1C178L;
        CallSite callSite = aA.a("\u00d0", (Object)aA.a("\u00d0", (Object)class_39592, (long)6238210885697859321L, (long)l), (Object)aA.a("\u00d0", (Object)class_39592, (long)6250077256433160999L, (long)l), (long)6235669795086885056L, (long)l);
        return aA.a("$", (Object)aA.a("\u00d0", (Object)class_39592, (long)6250077256433160999L, (long)l), (Object)aA.a("$", (double)aA.a("O", (Object)callSite, (long)6238839920635707919L, (long)l), (double)aA.a("O", (Object)callSite, (long)6249278420116409372L, (long)l), (double)aA.a("O", (Object)callSite, (long)6234471848364158248L, (long)l), (long)6234774495283952433L, (long)l), (Object)aA.a("$", (Object)aA.a("\u00d0", (Object)class_39592, (long)6250077256433160999L, (long)l), (long)6236672224001202128L, (long)l), (long)6236048678497428517L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(aA.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


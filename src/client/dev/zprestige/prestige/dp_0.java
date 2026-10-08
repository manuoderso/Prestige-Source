/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10865
 *  net.minecraft.class_10868
 *  net.minecraft.class_310
 *  org.joml.Vector3d
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aq_0;
import dev.zprestige.prestige.cz_0;
import dev.zprestige.prestige.dB;
import dev.zprestige.prestige.dr_0;
import dev.zprestige.prestige.ds_0;
import dev.zprestige.prestige.gK;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.ref.Cleaner;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_10865;
import net.minecraft.class_10868;
import net.minecraft.class_310;
import org.joml.Vector3d;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.dp
 */
public class dp_0 {
    public static final Cleaner a;
    public static final aq_0 b;
    private static final List c;
    public static gK d;
    private static Thread e;
    private static long f;
    private static final long g;
    private static final String[] h;
    private static final String[] i;
    private static final Map j;
    private static final long[] k;
    private static final Long[] l;
    private static final Map m;
    private static final Object[] n;
    private static final String[] o;

    /*
     * Enabled aggressive block sorting
     */
    static {
        g = hc.a(-3709597536536716137L, 5511052524161107159L, MethodHandles.lookup().lookupClass()).a(196255834032181L);
        long l = g ^ 0x63F03B05595EL;
        n = new Object[92];
        o = new String[92];
        dp_0.b();
        j = new HashMap(13);
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
        String[] stringArray = new String[2];
        int n = 0;
        String string = "\u00de.\u00cd\u00a5\u00feu\u00f4\u00e4?\u00a6ZV\u00c1\"\u00ac\u00aet\u001bl\f\u00b2(\u00a9\u0099\u0091\u00b5\u009d\u0018p\u00dc\u00d4\u0093\u00cfx\u009b|\u008eU9\u00d8`\u0002=\u000bu\u00e0\u00f2J\u00cf\u008b\u00dfM\u0015\u008fI  \u0087;\u0004\\<\u00ac3\u00ed;\u00b0\u0097\u000f\u00d8\u008b\u0001$\u0097\u00ae\u00f0*\u00bdL\u0095S~\u00adY\u00dc\u0010\u001d\u0085\u00d4h\u00ea\u00e6\u00d6\u00b2\u00ca\u001b@8\u00a6h\u00d8\u00ca\u0083\u0006\u001b\u00f6\u00c8\u008d\f.TR\u00fd\u00f2\u00b6\u0017\u00da\r\u00cdt\u00ff\u00057C=\u007fr\u00e2\u00b3\u00ed{\u00b1\u0005\u00a4\u0016=7V\u0087\u009e>\u0088-\u00a6\u00bf9\u0014\u00edU\u00a8\u00f6\u00b2\u00dcp6d\u00e4\u00beO\u0099\u00fa";
        int n2 = "\u00de.\u00cd\u00a5\u00feu\u00f4\u00e4?\u00a6ZV\u00c1\"\u00ac\u00aet\u001bl\f\u00b2(\u00a9\u0099\u0091\u00b5\u009d\u0018p\u00dc\u00d4\u0093\u00cfx\u009b|\u008eU9\u00d8`\u0002=\u000bu\u00e0\u00f2J\u00cf\u008b\u00dfM\u0015\u008fI  \u0087;\u0004\\<\u00ac3\u00ed;\u00b0\u0097\u000f\u00d8\u008b\u0001$\u0097\u00ae\u00f0*\u00bdL\u0095S~\u00adY\u00dc\u0010\u001d\u0085\u00d4h\u00ea\u00e6\u00d6\u00b2\u00ca\u001b@8\u00a6h\u00d8\u00ca\u0083\u0006\u001b\u00f6\u00c8\u008d\f.TR\u00fd\u00f2\u00b6\u0017\u00da\r\u00cdt\u00ff\u00057C=\u007fr\u00e2\u00b3\u00ed{\u00b1\u0005\u00a4\u0016=7V\u0087\u009e>\u0088-\u00a6\u00bf9\u0014\u00edU\u00a8\u00f6\u00b2\u00dcp6d\u00e4\u00beO\u0099\u00fa".length();
        int n3 = 96;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = dp_0.a(byArray3).intern();
            if ((n4 += n3) >= n2) break;
            n3 = string.charAt(n4);
        }
        h = stringArray;
        i = new String[2];
        m = new HashMap(13);
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
        String string2 = "\u00c8K\u0095+\u00f3\u00bc'|\u00d8\u00ed\u00fbN\u00f4\u00ad\u00d2\u00da\u00f3\u00cbX\u00f2\u00dak0\u00ac";
        int n7 = "\u00c8K\u0095+\u00f3\u00bc'|\u00d8\u00ed\u00fbN\u00f4\u00ad\u00d2\u00da\u00f3\u00cbX\u00f2\u00dak0\u00ac".length();
        int n8 = 0;
        do {
            byte[] byArray6 = string2.substring(n8, n8 += 8).getBytes("ISO-8859-1");
            int n9 = n6++;
            long l2 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
            byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n9] = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
        } while (n8 < n7);
        k = lArray;
        dp_0.l = new Long[3];
        a = dp_0.c("\u00d5", (long)9084095795694618862L, (long)l);
        b = new aq_0();
        c = new ArrayList();
        d = null;
        f = (long)dp_0.b("q", (int)2821, (long)(0x532727F33B435005L ^ l));
    }

    public static void e(Object[] objectArray) {
        CallSite callSite;
        long l;
        long l2;
        gK gK2;
        block8: {
            block9: {
                block7: {
                    class_310 class_3102;
                    CallSite callSite2;
                    block6: {
                        gK2 = (gK)objectArray[0];
                        l2 = (Long)objectArray[1];
                        long l3 = l2 = g ^ l2;
                        long l4 = l3 ^ 0x54D242057FFDL;
                        l = l3 ^ 0x505255D78FBDL;
                        CallSite callSite3 = dp_0.c("\u00d5", (long)-4333590400086700339L, (long)l2);
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l4;
                        dp_0.c("\u00d5", (Object)objectArray2, (long)-4340078744225368402L, (long)l2);
                        callSite2 = callSite3;
                        try {
                            try {
                                class_3102 = cz_0.b;
                                if (callSite2 != null) break block6;
                                if (dp_0.c("\u00c2", (Object)class_3102, (long)-4333886185875690502L, (long)l2) == null) break block7;
                            }
                            catch (RuntimeException runtimeException) {
                                throw dp_0.c("\u00d5", (Object)runtimeException, (long)-4339571247251296933L, (long)l2);
                            }
                            class_3102 = cz_0.b;
                        }
                        catch (RuntimeException runtimeException) {
                            throw dp_0.c("\u00d5", (Object)runtimeException, (long)-4339571247251296933L, (long)l2);
                        }
                    }
                    try {
                        callSite = dp_0.c("\u00c2", (Object)class_3102, (long)-4334054066423351022L, (long)l2);
                        if (callSite2 != null) break block8;
                        if (callSite != null) break block9;
                    }
                    catch (RuntimeException runtimeException) {
                        throw dp_0.c("\u00d5", (Object)runtimeException, (long)-4339571247251296933L, (long)l2);
                    }
                }
                return;
            }
            dB.h = gK2;
            dB.g = b;
            dp_0.c("\u00d6", (Object)((ds_0)((Object)dp_0.c("\u00d6", (Object)dr_0.a, (long)-4340558316484094858L, (long)l2))), (Object)b, (Object)gK2, (long)-4341002111227775154L, (long)l2);
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l;
            objectArray3[0] = gK2;
            dp_0.c("\u00d6", (Object)b, (Object)objectArray3, (long)-4340799238815387671L, (long)l2);
            callSite = dp_0.c("\u00d6", (Object)dr_0.c, (long)-4340558316484094858L, (long)l2);
        }
        dp_0.c("\u00d6", (Object)((ds_0)((Object)callSite)), (Object)b, (Object)gK2, (long)-4341002111227775154L, (long)l2);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l;
        objectArray4[0] = gK2;
        dp_0.c("\u00d6", (Object)b, (Object)objectArray4, (long)-4340799238815387671L, (long)l2);
    }

    private static long b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = dp_0.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    public static void b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = g ^ l;
        long l3 = l2 ^ 0x5E4AC2E6D69BL;
        long l4 = l2 ^ 0x3B589A42DAF0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l4;
        objectArray3[0] = dp_0.c("\u00d5", (Object)objectArray2, (long)6615224490681096791L, (long)l);
        dp_0.c("\u00d5", (Object)objectArray3, (long)6617678207010426663L, (long)l);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dp" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x251C;
        if (dp_0.l[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = k[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])m.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    m.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/dp", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            dp_0.l[n2] = l4;
        }
        return dp_0.l[n2];
    }

    public static boolean b(Object[] objectArray) {
        int n;
        block6: {
            block5: {
                Object object;
                long l;
                block4: {
                    l = (Long)objectArray[0];
                    l = g ^ l;
                    CallSite callSite = dp_0.c("\u00d5", (long)2444515452372511994L, (long)l);
                    try {
                        object = e;
                        if (callSite != null) break block4;
                        if (object == null) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw dp_0.c("\u00d5", (Object)runtimeException, (long)2445992631172435820L, (long)l);
                    }
                    object = dp_0.c("\u00d5", (long)2445942568500234907L, (long)l);
                }
                try {
                    if (object != e) break block5;
                    n = 1;
                    break block6;
                }
                catch (RuntimeException runtimeException) {
                    throw dp_0.c("\u00d5", (Object)runtimeException, (long)2445992631172435820L, (long)l);
                }
            }
            n = 0;
        }
        return n != 0;
    }

    public static int b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = g ^ l;
        return (int)dp_0.c("\u00d6", (Object)((class_10868)dp_0.c("\u00d5", (Object)dp_0.c("\u00d6", (Object)dp_0.c("\u00d6", (Object)dp_0.c("\u00d5", (long)-2109504250131245895L, (long)l), (long)-2114869187235289128L, (long)l), (long)-2116127030445502443L, (long)l), (long)-2107905073979550725L, (long)l)), (long)-2109777459961792750L, (long)l);
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = dp_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = dp_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = dp_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = dp_0.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Vector3d b(Object[] objectArray) {
        gK gK2 = (gK)objectArray[0];
        double d = (Double)objectArray[1];
        double d10 = (Double)objectArray[2];
        double d11 = (Double)objectArray[3];
        Vector3d vector3d = (Vector3d)objectArray[4];
        long l = (Long)objectArray[5];
        l = g ^ l;
        CallSite callSite = dp_0.c("\u00d6", (Object)gK2.bC, (long)1527214835191818409L, (long)l);
        return dp_0.c("\u00d6", (Object)vector3d, (double)(d - dp_0.c("\u00c2", (Object)callSite, (long)1527344258892789357L, (long)l)), (double)(d10 - dp_0.c("\u00c2", (Object)callSite, (long)1528026913290607330L, (long)l)), (double)(d11 - dp_0.c("\u00c2", (Object)callSite, (long)1528635750482874535L, (long)l)), (long)1528951852041445301L, (long)l);
    }

    private static void b() {
        Object[] objectArray = n;
        n[0] = "i_n|m\u001c\u007f_k&~\u000bh\u0014h r\u001fyS\u007f79\b}";
        objectArray[1] = "gh5r+\u000flg$=@\u001bnl3gl\fc";
        objectArray[2] = ")\n\u000f\u00164\u00017\u0002\u0015Yy\u001b-\b\f\u0005h\u0011-\u001fW2b\u0011 \u001e\r\u001eu\u001a\u0006\u0013\u001a\u0012j\u0000*\u0004\u0017";
        objectArray[3] = "|P>yVVw_/6,Rd^?y\u001aVs";
        objectArray[4] = "P]H\u00107U[RY_MQHY_\u0015";
        objectArray[5] = Void.TYPE;
        dp_0.o[5] = "java/lang/Void";
        objectArray[6] = "t\u0004)-q\u000bj\f3b<\u0011p\u0006*>-\u001bp\u0011q\u00186\u0013{01%+";
        objectArray[7] = "vEp{ENhMj4\bTrGsh\u0019^rP(Y\u0004VlHcn\nYpA@o\u001fNnA";
        objectArray[8] = Long.TYPE;
        dp_0.o[8] = "java/lang/Long";
        objectArray[9] = "t!()X\u0012\u007f.9f9\u001ct%=<";
        objectArray[10] = "G\u0010<&4}207)%2S><\"!h'";
        objectArray[11] = "p5;\u0013$Zn=!\\lZt79\u001beA4\u00078\u0002zCs1?";
        objectArray[12] = "v|;qt\n`|>+g\u001dw7=-k\tfp*: \u001bZ";
        objectArray[13] = "\u0012D9K\u0004\u0018gd2D\u0015W\u001a|!C\u001c\u001er";
        objectArray[14] = "\u0016\u001bsN,W\u0016\u001bd\u0012 X\fPd\f M\u000b!4Qq";
        objectArray[15] = "\u000fI(>l\u0011\u000fI?b`\u001e\u0015\u0002?|`\u000b\u0012sk$7";
        objectArray[16] = "tp.`@{tp9<Ltn;9\"LaiJl}\u0015";
        objectArray[17] = "\u007fjt}Co\nJ\u007frR kDtyVz\u001f";
        objectArray[18] = "\u0010m^z\u001b\t\u001czC7\u0010\u000bPnK6\u000f\u0001\u001d&K$\u0014F\u001b~O:\tF;~O:\t";
        objectArray[19] = "\u007fSp5\u0007\u0018iSuo\u0014\u000f~\u0018vi\u0018\u001bo_a~S\tj";
        objectArray[20] = "|%h'V^\t\u0005c(G\u0011h\u000bh#CK\u001c";
        objectArray[21] = "0~q\u000ew\t&~tTd\u001e15wRh\n r`E#\u001d'";
        objectArray[22] = "h.bzDz~.g Wmied&[yx\"s1\u0010mG";
        objectArray[23] = "aW\u0002\u0004T\u0016\u007f_\u0018K6\nxB";
        objectArray[24] = Boolean.TYPE;
        dp_0.o[24] = "java/lang/Boolean";
        objectArray[25] = "\\.\u0018\\\u001aI)\u000e\u0013S\u000b\u0006H\u0000\u0018X\u000f\\<";
        objectArray[26] = "Q4V(aK$\u0014]'p\u0004E\u001aV,t^1";
        objectArray[27] = "A?5\u007fhoJ0$0\u0014vE0\"|*f";
        objectArray[28] = "l|o9%cl|xe)lv7x{)yqF)#{";
        objectArray[29] = Double.TYPE;
        dp_0.o[29] = "java/lang/Double";
        objectArray[30] = "w6\u0004m\u001f\u000bu(M\u0015\u0010\u0007l+\u0011p\u0011";
        objectArray[31] = "Vg\u0002/kQVg\u0015sg^L,\u0015mgKK]B0>\f";
        objectArray[32] = "vM0|\u0006fhE*3gqvI%i[";
        objectArray[33] = "\u000f~ H{J\u000f~7\u0014wE\u001557\nwP\u0012DfQ ";
        objectArray[34] = "\u0015TxVt#\u0015To\nx,\u000f\u001fo\u0014x9\bn=H!|C";
        objectArray[35] = Integer.TYPE;
        dp_0.o[35] = "java/lang/Integer";
        objectArray[36] = "H%,Dj\u000fA+/\r)\u0002G+;\u000f4\u0004\u0005>$\u0012s\u0015Y/2D@\u0010^\u001e$\u0012s\u0015Y/";
        objectArray[37] = "c\u0011A\b-=c\u0011VT!2yZVJ!'~+\u0004\u0016te";
        objectArray[38] = ")jF*\u000b\u0010\\JM%\u001a_=DF.\u001e\u0005I";
        objectArray[39] = "@\u001f,\u001dgpK\u0010=R;yLP\u0019\u0010,}D\u001b(";
        objectArray[40] = "mn\u0002jv@sf\u0018%\u0011Ab}\u0015\u007f7G";
        objectArray[41] = "}.K[d5}.\\\u0007h:ge\\\u0019h/`\u0014\u000eE1j&";
        objectArray[42] = "+vU8EZ+vBdIU1=BzI@6L\u0010&\u0010\u0004q";
        objectArray[43] = "\u0014\u0002r\u001d\u0019e\u001d\fqTZh\u001b\feVGnY\u001ef@\u0000o\u001a\u001e1a\u0011d\u0013\bm`\ry\u0003\br";
        objectArray[44] = "QrZIPWX|Y\u0000\u0013Z^|M\u0002\u000e\\\u001cnN\u0014I]_n\u0019 MMvxA\u000e^]";
        objectArray[45] = "ab6\u001d(\rfc/\u001dZMi*;D ZB4 c'S`Sx\u0014kO?!\"X3Q\u0004mw\u0014\"\fv7;L<7";
        objectArray[46] = "e\u0006\u0001S[(3\u0018E)JUv\u0019EBL0f\u0010Z\u0018 6}C\u0000HNkvJP)";
        objectArray[47] = "){\u001f%kW#cIx\n\r?fB|f?l*\u001e#3h.$\u0018im\u0011-xY}\n";
        objectArray[48] = "~>i\u0011z2t!`A\u0014o\"?j\u001fx]uy4H/\n6\u007f{@uc%#7\u0012\u0014";
        objectArray[49] = "~}Zr+\u0006t(RvU\u0000~zZl8k~}Zr+\u0006t(RvU";
        objectArray[50] = "i+\u0017'q!01\u001af\u0011{Yf\u0015+{*gm\u0016((\u0011";
        objectArray[51] = "$En \n\u00198A/gp\u001e.\u0007>:\u001c,}KbgO{$\u0011``\u0015Ex@egp";
        objectArray[52] = "g\u0003Y>)/m\u001cPnGy7\u0013^;\u0010.iD\u0006W.im\u0019\u00020;m<\u0017";
        objectArray[53] = "\n \u0004\u001d\u001cB\u000e$C\u0014y\u0011^'5D\u0004\u0005^[DI\u0005A\\7\u0010H\u0014\u000f3";
        objectArray[54] = ":\u0004&MGN0\u001b/\u001d)\u0018j\u0014!H~O5Iz$C\u001ck\u0002+@OGq\u0015";
        objectArray[55] = "\"\u001f$\\\\k(\u0000-\f26~\u001e'R^\u0004*_z\f2bn\u0001.[\nhq\b~5";
        objectArray[56] = "\u000flVTBe\r`OW3wUbKR^`_\u0007\r\u0007\u0002d\tuWKZz2g\u0002DU'\rxKR]\u001c";
        objectArray[57] = "m723S\u0010i,e23\u0005lTc5\r\u0007b&g.Z\u0006\u0002";
        objectArray[58] = "\u0012\u001fv(\u0006\u000b\u0010\u0013o+w\u0019H\u0011k.\u001a\u000eB9c!\u001a\nS\u0015t,\u001e\u0016K\u0005\u0013p\u0013\u000e\u0010\u001b\u007f$\u0012\u001f^ts{\u0005\u0014\u0014Kl2\u0013\u001c/";
        objectArray[59] = "q=8\\(\u0019'#|&:db\"|M?\u0001r+c\u0017S\u000bx~`F!\u000fc)a&";
        objectArray[60] = "\u001c\u0005\u000e*\u000bF\u001e\t\u0017)zPL\u0012kvBZGV\u00137@MXnWvA]J\u001f\b!@E!PZy\u0002\u0004S\n\u0016!\u001c?";
        objectArray[61] = "R{z\u0006g/Tw'ZZ=@iZS*!)r-L<f\u0016mdZ4]";
        objectArray[62] = "h\u0011rlow|\u0013g0Uo`\u0012`09]6V:he\nu\u0005c7%wo\u001f;1U";
        objectArray[63] = "JC]P.;VG\u001c\u0017T<@\u0001\rJ8\u000e\u0013MQ\u0017jYQCW_3 R\u001f\u0016KT!F\u001e\r]);\\F\u000b-33\u0013@\b\u0013ob\u0016Gm";
        objectArray[64] = "n|\u0003R>\ta)GMN\u000f~orZ0\u0001x~>J4\u0001\u007fzDKw\u0000-\u0013";
        objectArray[65] = "Y$'-/yTi&:Mf\u0004eJn|8\u0011\"840`\u000f\u0019";
        objectArray[66] = "h8spqW39so\u0003Tk7ryT\u00031g/\u0015`Wnc+ziV5&";
        objectArray[67] = "DYL9\u001dAY\u000fF6,\u000b[\u0000+o\u0011@K\u0014\u0016*IHVf";
        objectArray[68] = "aV|\u0000w\u001ceM+\u0001\u0017\u000fux'\u001dk\u001f\u000eUs\u0017qU1J:\u0001yn";
        objectArray[69] = ".\u000bZyV\u0019=W\u0016+7\u0015:KK&['k\n\u0013\u007f7\u0017=\t\u0016$\tKl\f\u0011A";
        objectArray[70] = "5\u00162\r*\u0015jM1\u001fD\u0012sR*\u0011\"\u0005RH*\u0011-\u0015\u000e\u0013n\u001e5\u0017bL5\u001d'y";
        objectArray[71] = "D~sw3\u001a\u0012`7\r!g\u0017;$3v\u001e\u0011{/\u007fH^\u0016ip31XVb<\r";
        objectArray[72] = "\u0006k\u0011G\u0016b\ft\u0018\u0017x?Zj\u0012I\u0014\r\u000e+H\u0014x?HdI\u0014\u0005+Jq\u0015.";
        objectArray[73] = "\u0005h)Lvf\u0003dt\u0010Kr\u0013q3tu%Oyt\u0006/i\u0017gO";
        objectArray[74] = "o\u0018\\'i:k\u0003\u000b&\t#d\u0016\u000b8\tt=J\u000f041eB\u0012B";
        objectArray[75] = "*gX\f\b\u000fqfX\u0013z\f)hY\u0005-[s8\u0005i\u0019\u000f,<\u0000\u0006\u0010\u000ewy";
        objectArray[76] = "\u0002k><~e]0=.\u0010h_)17jtA)\\q-8T'a4u0IU";
        objectArray[77] = "` {JJ@?wzR!j\u0011U\u0007nmj\\\"~\u0013CZ-})\u0012[";
        objectArray[78] = "`~>\u0002H?6`zxSBsaz\u0013_'cheI3~72n\n\u000e;o:sx";
        objectArray[79] = "oa,s\u0019\n2j%#x\u001fao\u0014,\u0015\u00005.{%\u0014[p\u0013w\"\u001c]1|~#G\u0018\fpy+AYcyxp\u0004doa,s\u0019\n2j%#x";
        objectArray[80] = "u\u001f\u001b/O{q\u0004L./`v\u0010%t\u001e8bGW.R`||E{]o!CZ2Kg\u001a";
        objectArray[81] = "puk\u001dx\u001c$/s\u0012\u0000\u0013z7k\u0013m\b\u001cw=AxIn-q\u0019fr";
        objectArray[82] = ")Lh5{i\u007fR,Oi\u0014:S,$lq*Z3~\u0000(~\u00008==m&\b%O";
        objectArray[83] = "wt\u0001Xa>d(M\n\u00002c4\u0010\u0007l\u00002tA]\u00000dvM\u0005>l5sJ`";
        objectArray[84] = "$A2\u0002\u0000x/Z*\u00171}H[6\u0016Z{-K?\t\u0000\u0017t\u001fe\u0002C*1Gm\u001f1";
        objectArray[85] = "$\u0004CN3B \u001f\u0014OSQ7\n\u0007B/W1g\u0006B5\bv\u0015\u0000NhTK";
        objectArray[86] = "AFU~V\u0015\u0017X\u0011\u0004FhRY\u0011oA\rBP\u000e5-T\u0016\n\u0005v\u0010\u0011N\u0002\u0018\u0004";
        objectArray[87] = "OV*r\u0015>@@0(s`FX/-\u001fR\u0014\u001dvwM\u0005IF*/\u0001h\u0012G*0s";
        objectArray[88] = "[pq\u0001wu\u0000qq\u001e\u0005vX\u007fp\bR!\u0002/.dfu]+)\u000bot\u0006n";
        objectArray[89] = "<^`\u0012ol(\\uNUt4]rN9Fb\u0019(\u0016j\u0011!JqI%l;P)OU";
        objectArray[90] = "`+l\u00137Csw AVOtk}L:}%+-\u001aVMs) Nh\u0011\",'+";
        Object[] objectArray2 = objectArray;
        objectArray[91] = "J\r&2\u0004rXH<?ax'\u001c %\f H\u0017;=\u0019\u0011I@1xQ~\u001b\u0013%!a-\u001aA.1\\hBI3C";
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = dp_0.a(l, l2);
            object = dp_0.n[n];
            try {
                if (!(object instanceof String)) break block2;
                dp_0.n[n] = clazz = Class.forName(o[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field c(long l, long l2) {
        int n = dp_0.a(l, l2);
        Object object = dp_0.n[n];
        if (object instanceof String) {
            String string = o[n];
            int n2 = string.indexOf(8);
            Class clazz = dp_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = dp_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = dp_0.a(clazz3, string2, clazz2)) != null) {
                    dp_0.n[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = dp_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        dp_0.n[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = dp_0.b(635509667416991L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dp" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static void c(Object[] objectArray) {
        List list = (List)objectArray[0];
        long l = (Long)objectArray[1];
        l = g ^ l;
        CallSite callSite = dp_0.c("\u00d6", (Object)list, (long)-6456682355876223185L, (long)l);
        CallSite callSite2 = dp_0.c("\u00d5", (long)-6450139432143983766L, (long)l);
        while (dp_0.c("\u00d6", (Object)callSite, (long)-6449347395036862861L, (long)l) != false) {
            Runnable runnable = (Runnable)((Object)dp_0.c("\u00d6", (Object)callSite, (long)-6457520033084433500L, (long)l));
            dp_0.c("\u00d6", (Object)runnable, (long)-6457941947013922348L, (long)l);
            if (callSite2 == null) continue;
        }
    }

    public static int c(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = g ^ l;
        return (int)dp_0.c("\u00d6", (Object)dp_0.c("\u00d6", (Object)dp_0.c("\u00d5", (long)-1397612664885929318L, (long)l), (long)-1397410970045139968L, (long)l), (long)-1403390278870724841L, (long)l);
    }

    public static void h(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = g ^ l;
        f += dp_0.b("q", (int)24952, (long)(0x16A52F6FDAB3DF0FL ^ l));
    }

    public static void f(Object[] objectArray) {
        block8: {
            Object object;
            long l;
            long l2;
            block6: {
                Runnable runnable = (Runnable)objectArray[0];
                l2 = (Long)objectArray[1];
                l = (l2 = g ^ l2) ^ 0x6DA5DEC582F6L;
                CallSite callSite = dp_0.c("\u00d5", (long)-6266031482144463844L, (long)l2);
                try {
                    block7: {
                        try {
                            try {
                                object = dp_0.c("\u00d5", (long)-6262387753787981187L, (long)l2);
                                if (callSite != null) break block6;
                                if (object != e) break block7;
                            }
                            catch (RuntimeException runtimeException) {
                                throw dp_0.c("\u00d5", (Object)runtimeException, (long)-6262302439097956470L, (long)l2);
                            }
                            dp_0.c("\u00d6", (Object)runnable, (long)-6262574349406433630L, (long)l2);
                            if (callSite == null) break block8;
                        }
                        catch (RuntimeException runtimeException) {
                            throw dp_0.c("\u00d5", (Object)runtimeException, (long)-6262302439097956470L, (long)l2);
                        }
                    }
                    object = runnable;
                }
                catch (RuntimeException runtimeException) {
                    throw dp_0.c("\u00d5", (Object)runtimeException, (long)-6262302439097956470L, (long)l2);
                }
            }
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l;
            objectArray2[0] = object;
            dp_0.c("\u00d5", (Object)objectArray2, (long)-6263741565847372994L, (long)l2);
        }
    }

    public static void d(Object[] objectArray) {
        gK gK2 = (gK)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = g ^ l) ^ 0x1C9058DBD01EL;
        dB.h = gK2;
        dB.g = b;
        d = gK2;
        dp_0.c("\u00d6", (Object)((ds_0)((Object)dp_0.c("\u00d6", (Object)dr_0.b, (long)-7178612498913473579L, (long)l))), (Object)b, (Object)gK2, (long)-7177922697035224851L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = gK2;
        dp_0.c("\u00d6", (Object)b, (Object)objectArray2, (long)-7178404837412622262L, (long)l);
    }

    public static int d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = g ^ l;
        return (int)dp_0.c("\u00d6", (Object)dp_0.c("\u00d6", (Object)dp_0.c("\u00d5", (long)-1609818411272626264L, (long)l), (long)-1609739857416113870L, (long)l), (long)-1606747005841400439L, (long)l);
    }

    private static Method d(long l, long l2) {
        int n = dp_0.a(l, l2);
        Object object = dp_0.n[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = o[n];
                int n3 = string2.indexOf(8);
                clazz3 = dp_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = dp_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = dp_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        dp_0.n[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = dp_0.b(635509667416991L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = dp_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        dp_0.n[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = dp_0.b(635509667416991L, 0L);
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static Vector3d a(Object[] objectArray) {
        gK gK2 = (gK)objectArray[0];
        double d = (Double)objectArray[1];
        double d10 = (Double)objectArray[2];
        double d11 = (Double)objectArray[3];
        long l = (Long)objectArray[4];
        long l2 = (l = g ^ l) ^ 0x5E755518443BL;
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = l2;
        objectArray2[4] = new Vector3d();
        objectArray2[3] = d11;
        objectArray2[2] = d10;
        objectArray2[1] = d;
        objectArray2[0] = gK2;
        return dp_0.c("\u00d5", (Object)objectArray2, (long)8527496800549068990L, (long)l);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(Object[] objectArray) {
        Runnable runnable = (Runnable)objectArray[0];
        long l = (Long)objectArray[1];
        l = g ^ l;
        List list = c;
        synchronized (list) {
            dp_0.c("\u00d6", (Object)c, (Object)runnable, (long)911773027527009566L, (long)l);
        }
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (o[n3] != null) {
            return n3;
        }
        Object object = dp_0.n[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 38;
            case 1 -> 57;
            case 2 -> 21;
            case 3 -> 41;
            case 4 -> 55;
            case 5 -> 23;
            case 6 -> 2;
            case 7 -> 62;
            case 8 -> 6;
            case 9 -> 3;
            case 10 -> 12;
            case 11 -> 54;
            case 12 -> 26;
            case 13 -> 44;
            case 14 -> 31;
            case 15 -> 9;
            case 16 -> 33;
            case 17 -> 53;
            case 18 -> 8;
            case 19 -> 49;
            case 20 -> 17;
            case 21 -> 35;
            case 22 -> 36;
            case 23 -> 24;
            case 24 -> 56;
            case 25 -> 39;
            case 26 -> 48;
            case 27 -> 59;
            case 28 -> 22;
            case 29 -> 46;
            case 30 -> 7;
            case 31 -> 16;
            case 32 -> 5;
            case 33 -> 4;
            case 34 -> 28;
            case 35 -> 63;
            case 36 -> 13;
            case 37 -> 20;
            case 38 -> 15;
            case 39 -> 61;
            case 40 -> 60;
            case 41 -> 1;
            case 42 -> 47;
            case 43 -> 58;
            case 44 -> 30;
            case 45 -> 10;
            case 46 -> 32;
            case 47 -> 27;
            case 48 -> 50;
            case 49 -> 45;
            case 50 -> 34;
            case 51 -> 40;
            case 52 -> 18;
            case 53 -> 19;
            case 54 -> 51;
            case 55 -> 37;
            case 56 -> 11;
            case 57 -> 29;
            case 58 -> 14;
            case 59 -> 43;
            case 60 -> 0;
            case 61 -> 52;
            case 62 -> 42;
            default -> 25;
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
        dp_0.o[n3] = new String(cArray);
        return n3;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = dp_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c2' || c == 'y' || c == '\u00e4' || c == 'v') {
                field = dp_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c2' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'y' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e4' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = dp_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d6' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static int a() {
        long l = g ^ 0x4AD4A92C081AL;
        return (int)dp_0.c("\u00d6", (Object)((class_10868)dp_0.c("\u00d5", (Object)dp_0.c("\u00d6", (Object)dp_0.c("\u00d6", (Object)dp_0.c("\u00d5", (long)3410534782894332244L, (long)l), (long)3407914244059703861L, (long)l), (long)3408996160998104568L, (long)l), (long)3409816316921732630L, (long)l)), (Object)dp_0.c("\u00d6", (Object)((class_10865)dp_0.c("\u00d5", (long)3407374141312533156L, (long)l)), (long)3409969687783372107L, (long)l), (Object)dp_0.c("\u00d6", (Object)dp_0.c("\u00d6", (Object)dp_0.c("\u00d5", (long)3410534782894332244L, (long)l), (long)3407914244059703861L, (long)l), (long)3411173464321741767L, (long)l), (long)3411088867243060258L, (long)l);
    }

    private static Method a(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    public static float a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = g ^ l;
        return (float)dp_0.c("\u00d6", (Object)dp_0.c("\u00d6", (Object)dp_0.c("\u00d5", (long)2432684695744731074L, (long)l), (long)2432904051575126360L, (long)l), (long)2439753492835628875L, (long)l);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = g ^ l;
        List list = c;
        synchronized (list) {
            Object object;
            block5: {
                block6: {
                    CallSite callSite = dp_0.c("\u00d5", (long)8867732252372284934L, (long)l);
                    try {
                        object = dp_0.c("\u00d6", (Object)c, (long)8866810680515472372L, (long)l);
                        if (callSite != null) break block5;
                        if (object != false) break block6;
                    }
                    catch (RuntimeException runtimeException) {
                        throw dp_0.c("\u00d5", (Object)runtimeException, (long)8866957700138849680L, (long)l);
                    }
                    object = 1;
                    break block5;
                }
                object = 0;
            }
            return (boolean)object;
        }
    }

    public static long a(Object[] objectArray) {
        return f;
    }

    public static Thread a(Object[] objectArray) {
        return e;
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Object a(Object[] objectArray) {
        long l;
        long l2;
        Supplier supplier;
        block12: {
            supplier = (Supplier)objectArray[0];
            l2 = (Long)objectArray[1];
            l = (l2 = g ^ l2) ^ 0x2D4EDB931FA3L;
            if (e == null) return dp_0.c("\u00d6", (Object)supplier, (long)3765863249741402715L, (long)l2);
            try {
                if (dp_0.c("\u00d5", (long)3765791520085548840L, (long)l2) != e) break block12;
                return dp_0.c("\u00d6", (Object)supplier, (long)3765863249741402715L, (long)l2);
                catch (InterruptedException interruptedException) {
                    throw dp_0.c("\u00d5", (Object)interruptedException, (long)3765737128082250463L, (long)l2);
                }
            }
            catch (InterruptedException interruptedException) {
                throw dp_0.c("\u00d5", (Object)interruptedException, (long)3765737128082250463L, (long)l2);
            }
        }
        CompletableFuture completableFuture = new CompletableFuture();
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l;
        objectArray2[0] = () -> dp_0.lambda$callOnRenderThread$0(completableFuture, (Supplier)supplier);
        dp_0.c("\u00d5", (Object)objectArray2, (long)3767253187963643499L, (long)l2);
        try {
            return dp_0.c("\u00d6", completableFuture, (long)dp_0.b("q", (int)12961, (long)(0x17BFC44318E8A3EEL ^ l2)), (Object)dp_0.c("\u00e4", (long)3765079389588117817L, (long)l2), (long)3772963112094380546L, (long)l2);
        }
        catch (InterruptedException interruptedException) {
            dp_0.c("\u00d6", (Object)dp_0.c("\u00d5", (long)3765791520085548840L, (long)l2), (long)3765090008613400563L, (long)l2);
            throw new RuntimeException((String)((Object)dp_0.a("m", (int)15041, (long)(0x74F37615A5210D31L ^ l2))), interruptedException);
        }
        catch (TimeoutException timeoutException) {
            throw new RuntimeException((String)((Object)dp_0.a("m", (int)13159, (long)(0x65F52815F3EC0496L ^ l2))), timeoutException);
        }
        catch (ExecutionException executionException) {
            Object object;
            try {
                object = dp_0.c("\u00d6", (Object)executionException, (long)3773503511362302173L, (long)l2) == null ? executionException : dp_0.c("\u00d6", (Object)executionException, (long)3773503511362302173L, (long)l2);
            }
            catch (InterruptedException interruptedException) {
                throw dp_0.c("\u00d5", (Object)interruptedException, (long)3765737128082250463L, (long)l2);
            }
            ExecutionException executionException2 = object;
            try {
                if (!(executionException2 instanceof RuntimeException)) throw new RuntimeException(executionException2);
                throw (RuntimeException)((Object)executionException2);
            }
            catch (InterruptedException interruptedException) {
                throw dp_0.c("\u00d5", (Object)interruptedException, (long)3765737128082250463L, (long)l2);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    public static List a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = g ^ l;
        List list = c;
        synchronized (list) {
            block8: {
                Object object;
                block7: {
                    CallSite callSite = dp_0.c("\u00d5", (long)-6190227039560833279L, (long)l);
                    object = c;
                    if (callSite != null) break block7;
                    try {
                        block9: {
                            if (dp_0.c("\u00d6", (Object)object, (long)-6194037612108678413L, (long)l) == false) break block8;
                            break block9;
                            catch (RuntimeException runtimeException) {
                                throw dp_0.c("\u00d5", (Object)runtimeException, (long)-6193956082685508457L, (long)l);
                            }
                        }
                        object = dp_0.c("\u00d5", (long)-6190995895484276863L, (long)l);
                    }
                    catch (RuntimeException runtimeException) {
                        throw dp_0.c("\u00d5", (Object)runtimeException, (long)-6193956082685508457L, (long)l);
                    }
                }
                return object;
            }
            ArrayList arrayList = new ArrayList(c);
            dp_0.c("\u00d6", (Object)c, (long)-6194165175668216998L, (long)l);
            return arrayList;
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dp" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = dp_0.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static String a(byte[] byArray) {
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3A2;
        if (i[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])j.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    j.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/dp", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = h[n2].getBytes("ISO-8859-1");
            dp_0.i[n2] = dp_0.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return i[n2];
    }

    public static void g(Object[] objectArray) {
        Thread thread = (Thread)objectArray[0];
        e = thread;
    }

    private static void lambda$callOnRenderThread$0(CompletableFuture completableFuture, Supplier supplier) {
        long l = g ^ 0x276BF38E31D4L;
        try {
            dp_0.c("\u00d6", (Object)completableFuture, (Object)dp_0.c("\u00d6", (Object)supplier, (long)1623393492030582943L, (long)l), (long)1628379501562902029L, (long)l);
        }
        catch (Throwable throwable) {
            dp_0.c("\u00d6", (Object)completableFuture, (Object)throwable, (long)1628476362516437761L, (long)l);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dp_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
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
            return MethodHandles.lookup().findStatic(dp_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(dp_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

